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
import java.util.Iterator;

public final class client extends class145 {

    @ObfuscatedName("client.m")
    public static boolean field274 = true;

    @ObfuscatedName("client.z")
    public static int field275 = 1;

    @ObfuscatedName("client.e")
    public static int field493 = 0;

    @ObfuscatedName("client.c")
    public static int field432 = 0;

    @ObfuscatedName("client.u")
    public static boolean field280 = false;

    @ObfuscatedName("client.r")
    public static boolean field304 = false;

    @ObfuscatedName("client.a")
    public static int field293 = 0;

    @ObfuscatedName("client.t")
    public static int field284 = 0;

    @ObfuscatedName("client.w")
    public static class109[] field483 = new class109[4];

    @ObfuscatedName("client.g")
    public static boolean field285 = true;

    @ObfuscatedName("client.s")
    public static int field286 = 0;

    @ObfuscatedName("client.k")
    public static long field287 = 1L;

    @ObfuscatedName("client.v")
    public static int field368 = -1;

    @ObfuscatedName("client.f")
    public static int field289 = -1;

    @ObfuscatedName("client.au")
    public static int field290 = -1;

    @ObfuscatedName("client.aq")
    public static boolean field340 = true;

    @ObfuscatedName("client.ab")
    public static boolean field532 = false;

    @ObfuscatedName("client.am")
    public static int field405 = 0;

    @ObfuscatedName("client.an")
    public static int field276 = 0;

    @ObfuscatedName("client.aj")
    public static int field295 = 0;

    @ObfuscatedName("client.ay")
    public static int field310 = 0;

    @ObfuscatedName("client.ao")
    public static int field297 = 0;

    @ObfuscatedName("client.ag")
    public static int field424 = 0;

    @ObfuscatedName("client.as")
    public static int field422 = 0;

    @ObfuscatedName("client.az")
    public static int field530 = 0;

    @ObfuscatedName("client.av")
    public static int field301 = 0;

    @ObfuscatedName("client.ah")
    public static class21 field302 = class21.field566;

    @ObfuscatedName("client.ai")
    public static class21 field336 = class21.field566;

    @ObfuscatedName("client.at")
    public static int field433 = 0;

    @ObfuscatedName("client.ac")
    public static int field351 = 0;

    @ObfuscatedName("client.ap")
    public static int field466 = 0;

    @ObfuscatedName("client.bw")
    public static int field308 = 0;

    @ObfuscatedName("client.bi")
    public static int field309 = 0;

    @ObfuscatedName("client.bh")
    public static int field294 = 0;

    @ObfuscatedName("client.br")
    public static int field311 = 0;

    @ObfuscatedName("client.bj")
    public static int field312 = 0;

    @ObfuscatedName("client.cn")
    public static class35[] field518 = new class35[32768];

    @ObfuscatedName("client.cr")
    public static int field315 = 0;

    @ObfuscatedName("client.ca")
    public static int[] field460 = new int[32768];

    @ObfuscatedName("client.cu")
    public static int field542 = 0;

    @ObfuscatedName("client.cf")
    public static int[] field318 = new int[250];

    @ObfuscatedName("client.cl")
    public static class123 field319 = new class123(5000);

    @ObfuscatedName("client.cv")
    public static class123 field320 = new class123(5000);

    @ObfuscatedName("client.cp")
    public static class123 field321 = new class123(15000);

    @ObfuscatedName("client.cx")
    public static int field524 = 0;

    @ObfuscatedName("client.co")
    public static int field323 = 0;

    @ObfuscatedName("client.cm")
    public static int field324 = 0;

    @ObfuscatedName("client.cy")
    public static int field292 = 0;

    @ObfuscatedName("client.cc")
    public static int field326 = 0;

    @ObfuscatedName("client.cb")
    public static int field327 = 0;

    @ObfuscatedName("client.ct")
    public static int field282 = 0;

    @ObfuscatedName("client.cg")
    public static int field306 = 0;

    @ObfuscatedName("client.ci")
    public static boolean field330 = false;

    @ObfuscatedName("client.dj")
    public static int field331 = 0;

    @ObfuscatedName("client.dq")
    public static int field332 = 1;

    @ObfuscatedName("client.dm")
    public static int field333 = 0;

    @ObfuscatedName("client.dz")
    public static int field486 = 1;

    @ObfuscatedName("client.dg")
    public static int field335 = 0;

    @ObfuscatedName("client.do")
    public static boolean field337 = false;

    @ObfuscatedName("client.dh")
    public static int[][][] field338 = new int[4][13][13];

    @ObfuscatedName("client.dc")
    public static final int[] field415 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dd")
    public static int field361 = 0;

    @ObfuscatedName("client.dv")
    public static int field465 = 2;

    @ObfuscatedName("client.ds")
    public static int field342 = 0;

    @ObfuscatedName("client.de")
    public static int field343 = 2;

    @ObfuscatedName("client.dp")
    public static int field344 = 0;

    @ObfuscatedName("client.eg")
    public static int field345 = 1;

    @ObfuscatedName("client.ef")
    public static int field346 = 0;

    @ObfuscatedName("client.ev")
    public static int field347 = 0;

    @ObfuscatedName("client.em")
    public static int field348 = 2;

    @ObfuscatedName("client.et")
    public static int field480 = 0;

    @ObfuscatedName("client.ey")
    public static int field350 = 1;

    @ObfuscatedName("client.ei")
    public static int field298 = 0;

    @ObfuscatedName("client.ep")
    public static int field352 = 0;

    @ObfuscatedName("client.el")
    public static int field354 = 2301979;

    @ObfuscatedName("client.ew")
    public static int field355 = 5063219;

    @ObfuscatedName("client.eb")
    public static int field407 = 3353893;

    @ObfuscatedName("client.eu")
    public static int field357 = 7759444;

    @ObfuscatedName("client.eo")
    public static boolean field423 = false;

    @ObfuscatedName("client.fr")
    public static int field359 = 0;

    @ObfuscatedName("client.fe")
    public static int field360 = 128;

    @ObfuscatedName("client.fj")
    public static int field522 = 0;

    @ObfuscatedName("client.fo")
    public static int field362 = 0;

    @ObfuscatedName("client.fn")
    public static int field400 = 0;

    @ObfuscatedName("client.fk")
    public static int field364 = 0;

    @ObfuscatedName("client.fy")
    public static int field472 = 0;

    @ObfuscatedName("client.fm")
    public static int field366 = 50;

    @ObfuscatedName("client.fs")
    public static int field367 = 0;

    @ObfuscatedName("client.fg")
    public static boolean field334 = false;

    @ObfuscatedName("client.fb")
    public static int field369 = 0;

    @ObfuscatedName("client.fa")
    public static int field517 = 0;

    @ObfuscatedName("client.fx")
    public static int field371 = 50;

    @ObfuscatedName("client.fc")
    public static int[] field372 = new int[field371];

    @ObfuscatedName("client.fv")
    public static int[] field373 = new int[field371];

    @ObfuscatedName("client.fd")
    public static int[] field374 = new int[field371];

    @ObfuscatedName("client.ff")
    public static int[] field375 = new int[field371];

    @ObfuscatedName("client.fl")
    public static int[] field376 = new int[field371];

    @ObfuscatedName("client.fu")
    public static int[] field382 = new int[field371];

    @ObfuscatedName("client.gp")
    public static int[] field378 = new int[field371];

    @ObfuscatedName("client.gd")
    public static String[] field379 = new String[field371];

    @ObfuscatedName("client.gh")
    public static int[][] field521 = new int[104][104];

    @ObfuscatedName("client.gl")
    public static int field474 = 0;

    @ObfuscatedName("client.gq")
    public static int field278 = -1;

    @ObfuscatedName("client.go")
    public static int field383 = -1;

    @ObfuscatedName("client.gs")
    public static int field384 = 0;

    @ObfuscatedName("client.gv")
    public static int field385 = 0;

    @ObfuscatedName("client.ge")
    public static int field543 = 0;

    @ObfuscatedName("client.gr")
    public static int field387 = 0;

    @ObfuscatedName("client.gw")
    public static int field388 = 0;

    @ObfuscatedName("client.ga")
    public static int field389 = 0;

    @ObfuscatedName("client.gy")
    public static int field390 = 0;

    @ObfuscatedName("client.gu")
    public static int field391 = 0;

    @ObfuscatedName("client.gk")
    public static int field358 = 0;

    @ObfuscatedName("client.gb")
    public static int field393 = 0;

    @ObfuscatedName("client.gx")
    public static boolean field394 = false;

    @ObfuscatedName("client.gz")
    public static int field395 = 0;

    @ObfuscatedName("client.gn")
    public static int field396 = 0;

    @ObfuscatedName("client.gm")
    public static class3[] field397 = new class3[2048];

    @ObfuscatedName("client.gf")
    public static int field398 = -1;

    @ObfuscatedName("client.hc")
    public static int field399 = 0;

    @ObfuscatedName("client.hl")
    public static int field329 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field401 = new int[1000];

    @ObfuscatedName("client.hk")
    public static final int[] field511 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hp")
    public static String[] field403 = new String[8];

    @ObfuscatedName("client.hx")
    public static boolean[] field404 = new boolean[8];

    @ObfuscatedName("client.hm")
    public static int[] field491 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hn")
    public static int field406 = -1;

    @ObfuscatedName("client.hs")
    public static class200[][][] field365 = new class200[4][104][104];

    @ObfuscatedName("client.ht")
    public static class200 field408 = new class200();

    @ObfuscatedName("client.hv")
    public static class200 field409 = new class200();

    @ObfuscatedName("client.hj")
    public static class200 field455 = new class200();

    @ObfuscatedName("client.hq")
    public static int[] field420 = new int[25];

    @ObfuscatedName("client.hb")
    public static int[] field412 = new int[25];

    @ObfuscatedName("client.hf")
    public static int[] field413 = new int[25];

    @ObfuscatedName("client.ho")
    public static int field328 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field454 = false;

    @ObfuscatedName("client.hh")
    public static int field416 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field386 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field418 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field419 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field503 = new int[500];

    @ObfuscatedName("client.im")
    public static String[] field421 = new String[500];

    @ObfuscatedName("client.is")
    public static String[] field291 = new String[500];

    @ObfuscatedName("client.ij")
    public static int field317 = -1;

    @ObfuscatedName("client.iy")
    public static int field443 = -1;

    @ObfuscatedName("client.ik")
    public static int field425 = 0;

    @ObfuscatedName("client.ic")
    public static int field426 = 50;

    @ObfuscatedName("client.ie")
    public static int field281 = 0;

    @ObfuscatedName("client.it")
    public static String field428 = null;

    @ObfuscatedName("client.ip")
    public static boolean field512 = false;

    @ObfuscatedName("client.ih")
    public static int field430 = -1;

    @ObfuscatedName("client.ia")
    public static int field431 = -1;

    @ObfuscatedName("client.iq")
    public static String field363 = null;

    @ObfuscatedName("client.il")
    public static String field314 = null;

    @ObfuscatedName("client.iv")
    public static int field434 = -1;

    @ObfuscatedName("client.ii")
    public static class197 field435 = new class197(8);

    @ObfuscatedName("client.jp")
    public static int field436 = 0;

    @ObfuscatedName("client.jt")
    public static int field437 = 0;

    @ObfuscatedName("client.jd")
    public static class174 field438 = null;

    @ObfuscatedName("client.jm")
    public static int field439 = 0;

    @ObfuscatedName("client.jj")
    public static int field414 = 0;

    @ObfuscatedName("client.jq")
    public static int field441 = 0;

    @ObfuscatedName("client.jg")
    public static int field380 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field377 = false;

    @ObfuscatedName("client.jf")
    public static boolean field444 = false;

    @ObfuscatedName("client.jn")
    public static boolean field445 = false;

    @ObfuscatedName("client.ju")
    public static class174 field299 = null;

    @ObfuscatedName("client.jx")
    public static class174 field447 = null;

    @ObfuscatedName("client.je")
    public static class174 field448 = null;

    @ObfuscatedName("client.ji")
    public static int field449 = 0;

    @ObfuscatedName("client.ja")
    public static int field450 = 0;

    @ObfuscatedName("client.jy")
    public static class174 field296 = null;

    @ObfuscatedName("client.jb")
    public static boolean field452 = false;

    @ObfuscatedName("client.jo")
    public static int field453 = -1;

    @ObfuscatedName("client.jh")
    public static int field300 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field470 = false;

    @ObfuscatedName("client.jr")
    public static int field456 = -1;

    @ObfuscatedName("client.js")
    public static int field457 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field458 = false;

    @ObfuscatedName("client.kv")
    public static int field459 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field442 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field446 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field462 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field463 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field464 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field497 = 0;

    @ObfuscatedName("client.kk")
    public static int field501 = 0;

    @ObfuscatedName("client.ki")
    public static int field467 = 0;

    @ObfuscatedName("client.kh")
    public static int field468 = 0;

    @ObfuscatedName("client.kr")
    public static int field469 = 0;

    @ObfuscatedName("client.kf")
    public static int field485 = 0;

    @ObfuscatedName("client.kg")
    public static int field471 = 0;

    @ObfuscatedName("client.kz")
    public static int field538 = 0;

    @ObfuscatedName("client.kw")
    public static class200 field473 = new class200();

    @ObfuscatedName("client.kc")
    public static class200 field551 = new class200();

    @ObfuscatedName("client.ka")
    public static class200 field341 = new class200();

    @ObfuscatedName("client.ks")
    public static class197 field476 = new class197(512);

    @ObfuscatedName("client.kx")
    public static int field477 = 0;

    @ObfuscatedName("client.kj")
    public static int field478 = -2;

    @ObfuscatedName("client.ll")
    public static boolean[] field479 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static boolean[] field392 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static boolean[] field481 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static int[] field322 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field316 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field484 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field552 = new int[100];

    @ObfuscatedName("client.lc")
    public static int field339 = 0;

    @ObfuscatedName("client.lr")
    public static long field487 = 0L;

    @ObfuscatedName("client.lg")
    public static boolean field488 = true;

    @ObfuscatedName("client.li")
    public static int field489 = 765;

    @ObfuscatedName("client.lj")
    public static int field490 = 1;

    @ObfuscatedName("client.lv")
    public static int[] field541 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lf")
    public static int field492 = 0;

    @ObfuscatedName("client.ly")
    public static int field288 = 0;

    @ObfuscatedName("client.lb")
    public static String field482 = "";

    @ObfuscatedName("client.ld")
    public static long[] field495 = new long[100];

    @ObfuscatedName("client.lk")
    public static int field496 = 0;

    @ObfuscatedName("client.la")
    public static int field411 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field498 = new int[128];

    @ObfuscatedName("client.md")
    public static int[] field499 = new int[128];

    @ObfuscatedName("client.me")
    public static long field381 = -1L;

    @ObfuscatedName("client.mm")
    public static String field417 = null;

    @ObfuscatedName("client.mp")
    public static String field502 = null;

    @ObfuscatedName("client.mq")
    public static int field356 = -1;

    @ObfuscatedName("client.my")
    public static int field504 = 0;

    @ObfuscatedName("client.mn")
    public static int[] field475 = new int[1000];

    @ObfuscatedName("client.mf")
    public static int[] field451 = new int[1000];

    @ObfuscatedName("client.ml")
    public static class79[] field507 = new class79[1000];

    @ObfuscatedName("client.mt")
    public static int field508 = 0;

    @ObfuscatedName("client.mg")
    public static int field509 = 0;

    @ObfuscatedName("client.mz")
    public static int field510 = 0;

    @ObfuscatedName("client.mb")
    public static int field410 = 255;

    @ObfuscatedName("client.mw")
    public static int field533 = -1;

    @ObfuscatedName("client.ma")
    public static boolean field513 = false;

    @ObfuscatedName("client.nt")
    public static int field514 = 127;

    @ObfuscatedName("client.ni")
    public static int field515 = 127;

    @ObfuscatedName("client.nr")
    public static int field516 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field440 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field461 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field519 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field520 = new int[50];

    @ObfuscatedName("client.nz")
    public static class59[] field544 = new class59[50];

    @ObfuscatedName("client.nf")
    public static boolean field500 = false;

    @ObfuscatedName("client.ox")
    public static boolean[] field523 = new boolean[5];

    @ObfuscatedName("client.oe")
    public static int[] field370 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field525 = new int[5];

    @ObfuscatedName("client.ou")
    public static int[] field526 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field527 = new int[5];

    @ObfuscatedName("client.om")
    public static short field528 = 256;

    @ObfuscatedName("client.op")
    public static short field529 = 205;

    @ObfuscatedName("client.oo")
    public static short field427 = 256;

    @ObfuscatedName("client.os")
    public static short field531 = 320;

    @ObfuscatedName("client.ob")
    public static short field325 = 1;

    @ObfuscatedName("client.oi")
    public static short field402 = 32767;

    @ObfuscatedName("client.og")
    public static short field534 = 1;

    @ObfuscatedName("client.oc")
    public static short field505 = 32767;

    @ObfuscatedName("client.oq")
    public static int field536 = 0;

    @ObfuscatedName("client.or")
    public static int field537 = 0;

    @ObfuscatedName("client.ok")
    public static int field506 = 0;

    @ObfuscatedName("client.ow")
    public static int field539 = 0;

    @ObfuscatedName("client.on")
    public static int field540 = 0;

    @ObfuscatedName("client.ov")
    public static int field349 = 0;

    @ObfuscatedName("client.oj")
    public static int field272 = 0;

    @ObfuscatedName("client.of")
    public static class18[] field429 = new class18[400];

    @ObfuscatedName("client.oz")
    public static class196 field535 = new class196();

    @ObfuscatedName("client.ot")
    public static int field545 = 0;

    @ObfuscatedName("client.ol")
    public static class8[] field546 = new class8[400];

    @ObfuscatedName("client.pp")
    public static class180 field547 = new class180();

    @ObfuscatedName("client.pw")
    public static int field548 = -1;

    @ObfuscatedName("client.pa")
    public static int field549 = -1;

    @ObfuscatedName("client.pb")
    public static class221[] field550 = new class221[8];

    @ObfuscatedName("client.px")
    public static long field305 = -1L;

    @ObfuscatedName("client.pk")
    public static long field494 = -1L;

    @ObfuscatedName("client.pf")
    public static final class11 field553 = new class11();

    @ObfuscatedName("client.pj")
    public static int[] field554 = new int[50];

    @ObfuscatedName("client.pd")
    public static int[] field555 = new int[50];

    @ObfuscatedName("client.m(B)V")
    public final void method243() {
    }

    public final void init() {
        if (!this.method2832()) {
            return;
        }
        class191[] var1 = new class191[] { class191.field3074, class191.field3077, class191.field3066, class191.field3071, class191.field3072, class191.field3075, class191.field3069, class191.field3073, class191.field3068, class191.field3064, class191.field3063, class191.field3065, class191.field3067, class191.field3076, class191.field3070 };
        class191[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3078);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3078)) {
                    case 1:
                        Statics.field202 = var5;
                        break;
                    case 2:
                        field275 = Integer.parseInt(var5);
                        break;
                    case 3:
                        field293 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field432 = Integer.parseInt(var5);
                        break;
                    case 5:
                        Statics.field208 = Integer.parseInt(var5);
                        break;
                    case 6:
                        field493 = Integer.parseInt(var5);
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field24)) {
                        }
                        break;
                    case 8:
                        Statics.field283 = Integer.parseInt(var5);
                        break;
                    case 9:
                        int var6 = Integer.parseInt(var5);
                        class154[] var7 = class154.method2059();
                        int var8 = 0;
                        class154 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class154 var9 = var7[var8];
                            if (var9.field2263 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field277 = var10;
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class2.field24)) {
                            field280 = true;
                        } else {
                            field280 = false;
                        }
                    case 11:
                    default:
                        break;
                    case 12:
                        Statics.field3006 = var5;
                        break;
                    case 13:
                        Statics.field1361 = (class155) class110.method2153(class155.method2765(), Integer.parseInt(var5));
                        if (Statics.field1361 == class155.field2273) {
                            Statics.field279 = class213.field3147;
                        } else {
                            Statics.field279 = class213.field3152;
                        }
                }
            }
        }
        class87.field1479 = false;
        field304 = false;
        Statics.field313 = this.getCodeBase().getHost();
        String var11 = Statics.field277.field2258;
        byte var12 = 0;
        try {
            Statics.field167 = 16;
            Statics.field2220 = var12;
            try {
                Statics.field694 = System.getProperty("os.name");
            } catch (Exception var26) {
                Statics.field694 = "Unknown";
            }
            Statics.field177 = Statics.field694.toLowerCase();
            try {
                Statics.field1530 = System.getProperty("user.home");
                if (Statics.field1530 != null) {
                    Statics.field1530 = Statics.field1530 + "/";
                }
            } catch (Exception var25) {
            }
            try {
                if (Statics.field177.startsWith("win")) {
                    if (Statics.field1530 == null) {
                        Statics.field1530 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1530 == null) {
                    Statics.field1530 = System.getenv("HOME");
                }
                if (Statics.field1530 != null) {
                    Statics.field1530 = Statics.field1530 + "/";
                }
            } catch (Exception var24) {
            }
            if (Statics.field1530 == null) {
                Statics.field1530 = "~/";
            }
            Statics.field269 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1530, "/tmp/", "" };
            Statics.field2008 = new String[] { ".jagex_cache_" + Statics.field2220, ".file_store_" + Statics.field2220 };
            label123: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field2214 = class150.method3455("oldschool", var11, var16);
                if (!Statics.field2214.exists()) {
                    Statics.field2214.mkdirs();
                }
                File[] var17 = Statics.field2214.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label123;
                    }
                    File var20 = var18[var19];
                    if (!class150.method2695(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            File var21 = Statics.field2214;
            Statics.field2064 = var21;
            if (!Statics.field2064.exists()) {
                throw new RuntimeException("");
            }
            class136.field2066 = true;
            class150.method653();
            class150.field2218 = new class229(new class228(class136.method641("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class150.field2219 = new class229(new class228(class136.method641("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field222 = new class229[Statics.field167];
            for (int var22 = 0; var22 < Statics.field167; var22++) {
                Statics.field222[var22] = new class229(new class228(class136.method641("main_file_cache.idx" + var22), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var27) {
            class149.method101((String) null, var27);
        }
        Statics.field273 = this;
        this.method2849(765, 503, 113);
    }

    @ObfuscatedName("client.x(I)V")
    public final void method245() {
        Statics.field904 = field432 == 0 ? 43594 : field275 + 40000;
        Statics.field2021 = field432 == 0 ? 443 : field275 + 50000;
        Statics.field1056 = Statics.field904;
        Statics.field2925 = class175.field2880;
        Statics.field1536 = class175.field2890;
        Statics.field1546 = class175.field2882;
        Statics.field768 = class175.field2883;
        class138.method2693();
        Canvas var1 = Statics.field67;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class138.field2090);
        var1.addFocusListener(class138.field2090);
        class141.method643(Statics.field67);
        Statics.field2727 = class132.method2561();
        if (Statics.field2727 != null) {
            Statics.field2727.method2656(Statics.field67);
        }
        Statics.field2244 = new class135(255, class150.field2218, class150.field2219, 500000);
        class228 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = Statics.method2233("", Statics.field1361.field2274, false);
            byte[] var4 = new byte[(int) var2.method3840()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3841(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class120(var4));
        } catch (Exception var14) {
        }
        try {
            if (var2 != null) {
                var2.method3836();
            }
        } catch (Exception var13) {
        }
        Statics.field76 = var3;
        Statics.field2027 = this.getToolkit().getSystemClipboard();
        class139.method96(this, Statics.field2115);
        if (field432 != 0) {
            field532 = true;
        }
        int var10 = Statics.field76.field145;
        field487 = 0L;
        if (var10 >= 2) {
            field488 = true;
        } else {
            field488 = false;
        }
        method920();
        if (field284 >= 25) {
            field319.method2596(98);
            class123 var11 = field319;
            int var12 = field488 ? 2 : 1;
            var11.method2364(var12);
            field319.method2347(Statics.field103);
            field319.method2347(Statics.field902);
        }
        field2184 = true;
    }

    @ObfuscatedName("client.e(I)V")
    public final void method246() {
        field286++;
        this.method249();
        while (true) {
            class200 var1 = class171.field2703;
            class170 var2;
            synchronized (class171.field2703) {
                var2 = (class170) class171.field2708.method3538();
            }
            if (var2 == null) {
                try {
                    if (class184.field2960 == 1) {
                        int var4 = Statics.field2959.method3346();
                        if (var4 > 0 && Statics.field2959.method3381()) {
                            int var5 = var4 - Statics.field2964;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2959.method3345(var5);
                        } else {
                            Statics.field2959.method3351();
                            Statics.field2959.method3349();
                            if (Statics.field1371 == null) {
                                class184.field2960 = 0;
                            } else {
                                class184.field2960 = 2;
                            }
                            Statics.field2956 = null;
                            Statics.field68 = null;
                        }
                    }
                } catch (Exception var648) {
                    var648.printStackTrace();
                    Statics.field2959.method3351();
                    class184.field2960 = 0;
                    Statics.field2956 = null;
                    Statics.field68 = null;
                    Statics.field1371 = null;
                }
                method162();
                class138.method2646();
                class141.method2281();
                if (Statics.field2727 != null) {
                    int var7 = Statics.field2727.method2657();
                    field538 = var7;
                }
                int var10002;
                if (field284 == 0) {
                    method2295();
                    Statics.field1935.method2677();
                    for (int var8 = 0; var8 < 32; var8++) {
                        field2180[var8] = 0L;
                    }
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2182[var9] = 0L;
                    }
                    Statics.field2696 = 0;
                } else if (field284 == 5) {
                    class32.method2(this);
                    method2295();
                    Statics.field1935.method2677();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2180[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2182[var11] = 0L;
                    }
                    Statics.field2696 = 0;
                } else if (field284 == 10 || field284 == 11) {
                    class32.method2(this);
                } else if (field284 == 20) {
                    class32.method2(this);
                    method713();
                } else if (field284 == 25) {
                    method2048(false);
                    field331 = 0;
                    boolean var12 = true;
                    for (int var13 = 0; var13 < Statics.field729.length; var13++) {
                        if (Statics.field905[var13] != -1 && Statics.field729[var13] == null) {
                            Statics.field729[var13] = Statics.field2579.method3011(Statics.field905[var13], 0);
                            if (Statics.field729[var13] == null) {
                                var12 = false;
                                field331++;
                            }
                        }
                        if (Statics.field1084[var13] != -1 && Statics.field2647[var13] == null) {
                            Statics.field2647[var13] = Statics.field2579.method3059(Statics.field1084[var13], 0, Statics.field133[var13]);
                            if (Statics.field2647[var13] == null) {
                                var12 = false;
                                field331++;
                            }
                        }
                    }
                    if (var12) {
                        field333 = 0;
                        boolean var14 = true;
                        for (int var15 = 0; var15 < Statics.field729.length; var15++) {
                            byte[] var16 = Statics.field2647[var15];
                            if (var16 != null) {
                                int var17 = (Statics.field1639[var15] >> 8) * 64 - Statics.field3015;
                                int var18 = (Statics.field1639[var15] & 0xFF) * 64 - Statics.field13;
                                if (field337) {
                                    var17 = 10;
                                    var18 = 10;
                                }
                                var14 &= class6.method240(var16, var17, var18);
                            }
                        }
                        if (var14) {
                            if (field335 != 0) {
                                method3141(class158.field2309 + class2.field26 + class2.field20 + 100 + "%" + class2.field32, true);
                            }
                            method162();
                            method151();
                            method162();
                            Statics.field772.method1791();
                            method162();
                            System.gc();
                            for (int var19 = 0; var19 < 4; var19++) {
                                field483[var19].method2242();
                            }
                            for (int var20 = 0; var20 < 4; var20++) {
                                for (int var21 = 0; var21 < 104; var21++) {
                                    for (int var22 = 0; var22 < 104; var22++) {
                                        class6.field85[var20][var21][var22] = 0;
                                    }
                                }
                            }
                            method162();
                            class6.field86 = 99;
                            Statics.field101 = new byte[4][104][104];
                            Statics.field88 = new byte[4][104][104];
                            Statics.field1139 = new byte[4][104][104];
                            Statics.field89 = new byte[4][104][104];
                            Statics.field1202 = new int[4][105][105];
                            Statics.field3010 = new byte[4][105][105];
                            Statics.field90 = new int[105][105];
                            Statics.field74 = new int[104];
                            Statics.field91 = new int[104];
                            Statics.field1598 = new int[104];
                            Statics.field1890 = new int[104];
                            Statics.field1896 = new int[104];
                            int var23 = Statics.field729.length;
                            class24.method1501();
                            method2048(true);
                            if (!field337) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    int var25 = (Statics.field1639[var24] >> 8) * 64 - Statics.field3015;
                                    int var26 = (Statics.field1639[var24] & 0xFF) * 64 - Statics.field13;
                                    byte[] var27 = Statics.field729[var24];
                                    if (var27 != null) {
                                        method162();
                                        class6.method756(var27, var25, var26, Statics.field2295 * 8 - 48, Statics.field2693 * 8 - 48, field483);
                                    }
                                }
                                for (int var28 = 0; var28 < var23; var28++) {
                                    int var29 = (Statics.field1639[var28] >> 8) * 64 - Statics.field3015;
                                    int var30 = (Statics.field1639[var28] & 0xFF) * 64 - Statics.field13;
                                    byte[] var31 = Statics.field729[var28];
                                    if (var31 == null && Statics.field2693 < 800) {
                                        method162();
                                        class6.method593(var29, var30, 64, 64);
                                    }
                                }
                                method2048(true);
                                for (int var32 = 0; var32 < var23; var32++) {
                                    byte[] var33 = Statics.field2647[var32];
                                    if (var33 != null) {
                                        int var34 = (Statics.field1639[var32] >> 8) * 64 - Statics.field3015;
                                        int var35 = (Statics.field1639[var32] & 0xFF) * 64 - Statics.field13;
                                        method162();
                                        class87 var36 = Statics.field772;
                                        class109[] var37 = field483;
                                        class120 var38 = new class120(var33);
                                        int var39 = -1;
                                        while (true) {
                                            int var40 = var38.method2373();
                                            if (var40 == 0) {
                                                break;
                                            }
                                            var39 += var40;
                                            int var41 = 0;
                                            while (true) {
                                                int var42 = var38.method2373();
                                                if (var42 == 0) {
                                                    break;
                                                }
                                                var41 += var42 - 1;
                                                int var43 = var41 & 0x3F;
                                                int var44 = var41 >> 6 & 0x3F;
                                                int var45 = var41 >> 12;
                                                int var46 = var38.method2361();
                                                int var47 = var46 >> 2;
                                                int var48 = var46 & 0x3;
                                                int var49 = var34 + var44;
                                                int var50 = var35 + var43;
                                                if (var49 > 0 && var50 > 0 && var49 < 103 && var50 < 103) {
                                                    int var51 = var45;
                                                    if ((class6.field85[1][var49][var50] & 0x2) == 2) {
                                                        var51 = var45 - 1;
                                                    }
                                                    class109 var52 = null;
                                                    if (var51 >= 0) {
                                                        var52 = var37[var51];
                                                    }
                                                    class6.method2899(var45, var49, var50, var39, var48, var47, var36, var52);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field337) {
                                int var53 = 0;
                                label3925: while (true) {
                                    if (var53 >= 4) {
                                        for (int var71 = 0; var71 < 13; var71++) {
                                            for (int var72 = 0; var72 < 13; var72++) {
                                                int var73 = field338[0][var71][var72];
                                                if (var73 == -1) {
                                                    class6.method593(var71 * 8, var72 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2048(true);
                                        int var74 = 0;
                                        while (true) {
                                            if (var74 >= 4) {
                                                break label3925;
                                            }
                                            method162();
                                            for (int var75 = 0; var75 < 13; var75++) {
                                                for (int var76 = 0; var76 < 13; var76++) {
                                                    int var77 = field338[var74][var75][var76];
                                                    if (var77 != -1) {
                                                        int var78 = var77 >> 24 & 0x3;
                                                        int var79 = var77 >> 1 & 0x3;
                                                        int var80 = var77 >> 14 & 0x3FF;
                                                        int var81 = var77 >> 3 & 0x7FF;
                                                        int var82 = (var80 / 8 << 8) + var81 / 8;
                                                        for (int var83 = 0; var83 < Statics.field1639.length; var83++) {
                                                            if (Statics.field1639[var83] == var82 && Statics.field2647[var83] != null) {
                                                                class6.method36(Statics.field2647[var83], var74, var75 * 8, var76 * 8, var78, (var80 & 0x7) * 8, (var81 & 0x7) * 8, var79, Statics.field772, field483);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                    method162();
                                    for (int var54 = 0; var54 < 13; var54++) {
                                        for (int var55 = 0; var55 < 13; var55++) {
                                            boolean var56 = false;
                                            int var57 = field338[var53][var54][var55];
                                            if (var57 != -1) {
                                                int var58 = var57 >> 24 & 0x3;
                                                int var59 = var57 >> 1 & 0x3;
                                                int var60 = var57 >> 14 & 0x3FF;
                                                int var61 = var57 >> 3 & 0x7FF;
                                                int var62 = (var60 / 8 << 8) + var61 / 8;
                                                for (int var63 = 0; var63 < Statics.field1639.length; var63++) {
                                                    if (Statics.field1639[var63] == var62 && Statics.field729[var63] != null) {
                                                        class6.method2716(Statics.field729[var63], var53, var54 * 8, var55 * 8, var58, (var60 & 0x7) * 8, (var61 & 0x7) * 8, var59, field483);
                                                        var56 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var56) {
                                                int var64 = var53;
                                                int var65 = var54 * 8;
                                                int var66 = var55 * 8;
                                                for (int var67 = 0; var67 < 8; var67++) {
                                                    for (int var68 = 0; var68 < 8; var68++) {
                                                        class6.field92[var64][var65 + var67][var66 + var68] = 0;
                                                    }
                                                }
                                                if (var65 > 0) {
                                                    for (int var69 = 1; var69 < 8; var69++) {
                                                        class6.field92[var64][var65][var66 + var69] = class6.field92[var64][var65 - 1][var66 + var69];
                                                    }
                                                }
                                                if (var66 > 0) {
                                                    for (int var70 = 1; var70 < 8; var70++) {
                                                        class6.field92[var64][var65 + var70][var66] = class6.field92[var64][var65 + var70][var66 - 1];
                                                    }
                                                }
                                                if (var65 > 0 && class6.field92[var64][var65 - 1][var66] != 0) {
                                                    class6.field92[var64][var65][var66] = class6.field92[var64][var65 - 1][var66];
                                                } else if (var66 > 0 && class6.field92[var64][var65][var66 - 1] != 0) {
                                                    class6.field92[var64][var65][var66] = class6.field92[var64][var65][var66 - 1];
                                                } else if (var65 > 0 && var66 > 0 && class6.field92[var64][var65 - 1][var66 - 1] != 0) {
                                                    class6.field92[var64][var65][var66] = class6.field92[var64][var65 - 1][var66 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var53++;
                                }
                            }
                            method2048(true);
                            method151();
                            method162();
                            class87 var84 = Statics.field772;
                            class109[] var85 = field483;
                            for (int var86 = 0; var86 < 4; var86++) {
                                for (int var87 = 0; var87 < 104; var87++) {
                                    for (int var88 = 0; var88 < 104; var88++) {
                                        if ((class6.field85[var86][var87][var88] & 0x1) == 1) {
                                            int var89 = var86;
                                            if ((class6.field85[1][var87][var88] & 0x2) == 2) {
                                                var89 = var86 - 1;
                                            }
                                            if (var89 >= 0) {
                                                var85[var89].method2271(var87, var88);
                                            }
                                        }
                                    }
                                }
                            }
                            class6.field99 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field99 < -8) {
                                class6.field99 = -8;
                            }
                            if (class6.field99 > 8) {
                                class6.field99 = 8;
                            }
                            class6.field100 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field100 < -16) {
                                class6.field100 = -16;
                            }
                            if (class6.field100 > 16) {
                                class6.field100 = 16;
                            }
                            for (int var90 = 0; var90 < 4; var90++) {
                                byte[][] var91 = Statics.field3010[var90];
                                int var92 = (int) Math.sqrt(5100.0D);
                                int var93 = var92 * 768 >> 8;
                                for (int var94 = 1; var94 < 103; var94++) {
                                    for (int var95 = 1; var95 < 103; var95++) {
                                        int var96 = class6.field92[var90][var95 + 1][var94] - class6.field92[var90][var95 - 1][var94];
                                        int var97 = class6.field92[var90][var95][var94 + 1] - class6.field92[var90][var95][var94 - 1];
                                        int var98 = (int) Math.sqrt((double) (var97 * var97 + var96 * var96 + 65536));
                                        int var99 = (var96 << 8) / var98;
                                        int var100 = 65536 / var98;
                                        int var101 = (var97 << 8) / var98;
                                        int var102 = (var101 * -50 + var99 * -50 + var100 * -10) / var93 + 96;
                                        int var103 = (var91[var95][var94] >> 1) + (var91[var95][var94 + 1] >> 3) + (var91[var95][var94 - 1] >> 2) + (var91[var95 - 1][var94] >> 2) + (var91[var95 + 1][var94] >> 3);
                                        Statics.field90[var95][var94] = var102 - var103;
                                    }
                                }
                                for (int var104 = 0; var104 < 104; var104++) {
                                    Statics.field74[var104] = 0;
                                    Statics.field91[var104] = 0;
                                    Statics.field1598[var104] = 0;
                                    Statics.field1890[var104] = 0;
                                    Statics.field1896[var104] = 0;
                                }
                                for (int var105 = -5; var105 < 109; var105++) {
                                    for (int var106 = 0; var106 < 104; var106++) {
                                        int var107 = var105 + 5;
                                        if (var107 >= 0 && var107 < 104) {
                                            int var108 = Statics.field101[var90][var107][var106] & 0xFF;
                                            if (var108 > 0) {
                                                class42 var109 = class42.method709(var108 - 1);
                                                Statics.field74[var106] += var109.field961;
                                                Statics.field91[var106] += var109.field958;
                                                Statics.field1598[var106] += var109.field963;
                                                Statics.field1890[var106] += var109.field964;
                                                var10002 = Statics.field1896[var106]++;
                                            }
                                        }
                                        int var110 = var105 - 5;
                                        if (var110 >= 0 && var110 < 104) {
                                            int var111 = Statics.field101[var90][var110][var106] & 0xFF;
                                            if (var111 > 0) {
                                                class42 var112 = class42.method709(var111 - 1);
                                                Statics.field74[var106] -= var112.field961;
                                                Statics.field91[var106] -= var112.field958;
                                                Statics.field1598[var106] -= var112.field963;
                                                Statics.field1890[var106] -= var112.field964;
                                                var10002 = Statics.field1896[var106]--;
                                            }
                                        }
                                    }
                                    if (var105 >= 1 && var105 < 103) {
                                        int var113 = 0;
                                        int var114 = 0;
                                        int var115 = 0;
                                        int var116 = 0;
                                        int var117 = 0;
                                        for (int var118 = -5; var118 < 109; var118++) {
                                            int var119 = var118 + 5;
                                            if (var119 >= 0 && var119 < 104) {
                                                var113 += Statics.field74[var119];
                                                var114 += Statics.field91[var119];
                                                var115 += Statics.field1598[var119];
                                                var116 += Statics.field1890[var119];
                                                var117 += Statics.field1896[var119];
                                            }
                                            int var120 = var118 - 5;
                                            if (var120 >= 0 && var120 < 104) {
                                                var113 -= Statics.field74[var120];
                                                var114 -= Statics.field91[var120];
                                                var115 -= Statics.field1598[var120];
                                                var116 -= Statics.field1890[var120];
                                                var117 -= Statics.field1896[var120];
                                            }
                                            if (var118 >= 1 && var118 < 103 && (!field304 || (class6.field85[0][var105][var118] & 0x2) != 0 || (class6.field85[var90][var105][var118] & 0x10) == 0)) {
                                                if (var90 < class6.field86) {
                                                    class6.field86 = var90;
                                                }
                                                int var121 = Statics.field101[var90][var105][var118] & 0xFF;
                                                int var122 = Statics.field88[var90][var105][var118] & 0xFF;
                                                if (var121 > 0 || var122 > 0) {
                                                    int var123 = class6.field92[var90][var105][var118];
                                                    int var124 = class6.field92[var90][var105 + 1][var118];
                                                    int var125 = class6.field92[var90][var105 + 1][var118 + 1];
                                                    int var126 = class6.field92[var90][var105][var118 + 1];
                                                    int var127 = Statics.field90[var105][var118];
                                                    int var128 = Statics.field90[var105 + 1][var118];
                                                    int var129 = Statics.field90[var105 + 1][var118 + 1];
                                                    int var130 = Statics.field90[var105][var118 + 1];
                                                    int var131 = -1;
                                                    int var132 = -1;
                                                    if (var121 > 0) {
                                                        int var133 = var113 * 256 / var116;
                                                        int var134 = var114 / var117;
                                                        int var135 = var115 / var117;
                                                        var131 = class6.method87(var133, var134, var135);
                                                        int var136 = class6.field99 + var133 & 0xFF;
                                                        int var137 = class6.field100 + var135;
                                                        if (var137 < 0) {
                                                            var137 = 0;
                                                        } else if (var137 > 255) {
                                                            var137 = 255;
                                                        }
                                                        var132 = class6.method87(var136, var134, var137);
                                                    }
                                                    if (var90 > 0) {
                                                        boolean var138 = true;
                                                        if (var121 == 0 && Statics.field1139[var90][var105][var118] != 0) {
                                                            var138 = false;
                                                        }
                                                        if (var122 > 0 && !class47.method2060(var122 - 1).field1035) {
                                                            var138 = false;
                                                        }
                                                        if (var138 && var123 == var124 && var123 == var125 && var123 == var126) {
                                                            Statics.field1202[var90][var105][var118] |= 0x924;
                                                        }
                                                    }
                                                    int var139 = 0;
                                                    if (var132 != -1) {
                                                        var139 = class92.field1568[class6.method163(var132, 96)];
                                                    }
                                                    if (var122 == 0) {
                                                        var84.method1796(var90, var105, var118, 0, 0, -1, var123, var124, var125, var126, class6.method163(var131, var127), class6.method163(var131, var128), class6.method163(var131, var129), class6.method163(var131, var130), 0, 0, 0, 0, var139, 0);
                                                    } else {
                                                        int var140 = Statics.field1139[var90][var105][var118] + 1;
                                                        byte var141 = Statics.field89[var90][var105][var118];
                                                        class47 var142 = class47.method2060(var122 - 1);
                                                        int var143 = var142.field1034;
                                                        int var144;
                                                        int var145;
                                                        if (var143 >= 0) {
                                                            var144 = Statics.field1567.method2033(var143);
                                                            var145 = -1;
                                                        } else if (var142.field1041 == 16711935) {
                                                            var145 = -2;
                                                            var143 = -1;
                                                            var144 = -2;
                                                        } else {
                                                            var145 = class6.method87(var142.field1037, var142.field1031, var142.field1045);
                                                            int var146 = class6.field99 + var142.field1037 & 0xFF;
                                                            int var147 = class6.field100 + var142.field1045;
                                                            if (var147 < 0) {
                                                                var147 = 0;
                                                            } else if (var147 > 255) {
                                                                var147 = 255;
                                                            }
                                                            var144 = class6.method87(var146, var142.field1031, var147);
                                                        }
                                                        int var148 = 0;
                                                        if (var144 != -2) {
                                                            var148 = class92.field1568[class6.method3074(var144, 96)];
                                                        }
                                                        if (var142.field1036 != -1) {
                                                            int var149 = class6.field99 + var142.field1039 & 0xFF;
                                                            int var150 = class6.field100 + var142.field1033;
                                                            if (var150 < 0) {
                                                                var150 = 0;
                                                            } else if (var150 > 255) {
                                                                var150 = 255;
                                                            }
                                                            int var151 = class6.method87(var149, var142.field1042, var150);
                                                            var148 = class92.field1568[class6.method3074(var151, 96)];
                                                        }
                                                        var84.method1796(var90, var105, var118, var140, var141, var143, var123, var124, var125, var126, class6.method163(var131, var127), class6.method163(var131, var128), class6.method163(var131, var129), class6.method163(var131, var130), class6.method3074(var145, var127), class6.method3074(var145, var128), class6.method3074(var145, var129), class6.method3074(var145, var130), var139, var148);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var152 = 1; var152 < 103; var152++) {
                                    for (int var153 = 1; var153 < 103; var153++) {
                                        int var158;
                                        if ((class6.field85[var90][var153][var152] & 0x8) != 0) {
                                            var158 = 0;
                                        } else if (var90 <= 0 || (class6.field85[1][var153][var152] & 0x2) == 0) {
                                            var158 = var90;
                                        } else {
                                            var158 = var90 - 1;
                                        }
                                        var84.method1886(var90, var153, var152, var158);
                                    }
                                }
                                Statics.field101[var90] = (byte[][]) null;
                                Statics.field88[var90] = (byte[][]) null;
                                Statics.field1139[var90] = (byte[][]) null;
                                Statics.field89[var90] = (byte[][]) null;
                                Statics.field3010[var90] = (byte[][]) null;
                            }
                            var84.method1822(-50, -10, -50);
                            for (int var159 = 0; var159 < 104; var159++) {
                                for (int var160 = 0; var160 < 104; var160++) {
                                    if ((class6.field85[1][var159][var160] & 0x2) == 2) {
                                        var84.method1827(var159, var160);
                                    }
                                }
                            }
                            int var161 = 1;
                            int var162 = 2;
                            int var163 = 4;
                            for (int var164 = 0; var164 < 4; var164++) {
                                if (var164 > 0) {
                                    var161 <<= 0x3;
                                    var162 <<= 0x3;
                                    var163 <<= 0x3;
                                }
                                for (int var165 = 0; var165 <= var164; var165++) {
                                    for (int var166 = 0; var166 <= 104; var166++) {
                                        for (int var167 = 0; var167 <= 104; var167++) {
                                            if ((Statics.field1202[var165][var167][var166] & var161) != 0) {
                                                int var168 = var166;
                                                int var169 = var166;
                                                int var170 = var165;
                                                int var171 = var165;
                                                while (var168 > 0 && (Statics.field1202[var165][var167][var168 - 1] & var161) != 0) {
                                                    var168--;
                                                }
                                                while (var169 < 104 && (Statics.field1202[var165][var167][var169 + 1] & var161) != 0) {
                                                    var169++;
                                                }
                                                label3576: while (var170 > 0) {
                                                    for (int var172 = var168; var172 <= var169; var172++) {
                                                        if ((Statics.field1202[var170 - 1][var167][var172] & var161) == 0) {
                                                            break label3576;
                                                        }
                                                    }
                                                    var170--;
                                                }
                                                label3565: while (var171 < var164) {
                                                    for (int var173 = var168; var173 <= var169; var173++) {
                                                        if ((Statics.field1202[var171 + 1][var167][var173] & var161) == 0) {
                                                            break label3565;
                                                        }
                                                    }
                                                    var171++;
                                                }
                                                int var174 = (var171 + 1 - var170) * (var169 - var168 + 1);
                                                if (var174 >= 8) {
                                                    short var175 = 240;
                                                    int var176 = class6.field92[var171][var167][var168] - var175;
                                                    int var177 = class6.field92[var170][var167][var168];
                                                    class87.method1794(var164, 1, var167 * 128, var167 * 128, var168 * 128, var169 * 128 + 128, var176, var177);
                                                    for (int var178 = var170; var178 <= var171; var178++) {
                                                        for (int var179 = var168; var179 <= var169; var179++) {
                                                            Statics.field1202[var178][var167][var179] &= ~var161;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1202[var165][var167][var166] & var162) != 0) {
                                                int var180 = var167;
                                                int var181 = var167;
                                                int var182 = var165;
                                                int var183 = var165;
                                                while (var180 > 0 && (Statics.field1202[var165][var180 - 1][var166] & var162) != 0) {
                                                    var180--;
                                                }
                                                while (var181 < 104 && (Statics.field1202[var165][var181 + 1][var166] & var162) != 0) {
                                                    var181++;
                                                }
                                                label3629: while (var182 > 0) {
                                                    for (int var184 = var180; var184 <= var181; var184++) {
                                                        if ((Statics.field1202[var182 - 1][var184][var166] & var162) == 0) {
                                                            break label3629;
                                                        }
                                                    }
                                                    var182--;
                                                }
                                                label3618: while (var183 < var164) {
                                                    for (int var185 = var180; var185 <= var181; var185++) {
                                                        if ((Statics.field1202[var183 + 1][var185][var166] & var162) == 0) {
                                                            break label3618;
                                                        }
                                                    }
                                                    var183++;
                                                }
                                                int var186 = (var183 + 1 - var182) * (var181 - var180 + 1);
                                                if (var186 >= 8) {
                                                    short var187 = 240;
                                                    int var188 = class6.field92[var183][var180][var166] - var187;
                                                    int var189 = class6.field92[var182][var180][var166];
                                                    class87.method1794(var164, 2, var180 * 128, var181 * 128 + 128, var166 * 128, var166 * 128, var188, var189);
                                                    for (int var190 = var182; var190 <= var183; var190++) {
                                                        for (int var191 = var180; var191 <= var181; var191++) {
                                                            Statics.field1202[var190][var191][var166] &= ~var162;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1202[var165][var167][var166] & var163) != 0) {
                                                int var192 = var167;
                                                int var193 = var167;
                                                int var194 = var166;
                                                int var195 = var166;
                                                while (var194 > 0 && (Statics.field1202[var165][var167][var194 - 1] & var163) != 0) {
                                                    var194--;
                                                }
                                                while (var195 < 104 && (Statics.field1202[var165][var167][var195 + 1] & var163) != 0) {
                                                    var195++;
                                                }
                                                label3682: while (var192 > 0) {
                                                    for (int var196 = var194; var196 <= var195; var196++) {
                                                        if ((Statics.field1202[var165][var192 - 1][var196] & var163) == 0) {
                                                            break label3682;
                                                        }
                                                    }
                                                    var192--;
                                                }
                                                label3671: while (var193 < 104) {
                                                    for (int var197 = var194; var197 <= var195; var197++) {
                                                        if ((Statics.field1202[var165][var193 + 1][var197] & var163) == 0) {
                                                            break label3671;
                                                        }
                                                    }
                                                    var193++;
                                                }
                                                if ((var193 - var192 + 1) * (var195 - var194 + 1) >= 4) {
                                                    int var198 = class6.field92[var165][var192][var194];
                                                    class87.method1794(var164, 4, var192 * 128, var193 * 128 + 128, var194 * 128, var195 * 128 + 128, var198, var198);
                                                    for (int var199 = var192; var199 <= var193; var199++) {
                                                        for (int var200 = var194; var200 <= var195; var200++) {
                                                            Statics.field1202[var165][var199][var200] &= ~var163;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method2048(true);
                            int var201 = class6.field86;
                            if (var201 > Statics.field656) {
                                var201 = Statics.field656;
                            }
                            if (var201 < Statics.field656 - 1) {
                                int var202 = Statics.field656 - 1;
                            }
                            if (field304) {
                                Statics.field772.method1871(class6.field86);
                            } else {
                                Statics.field772.method1871(0);
                            }
                            for (int var203 = 0; var203 < 104; var203++) {
                                for (int var204 = 0; var204 < 104; var204++) {
                                    method155(var203, var204);
                                }
                            }
                            method162();
                            method2805();
                            class41.field909.method3463();
                            if (Statics.field83 != null) {
                                field319.method2596(39);
                                field319.method2349(1057001181);
                            }
                            if (!field337) {
                                int var205 = (Statics.field2295 - 6) / 8;
                                int var206 = (Statics.field2295 + 6) / 8;
                                int var207 = (Statics.field2693 - 6) / 8;
                                int var208 = (Statics.field2693 + 6) / 8;
                                for (int var209 = var205 - 1; var209 <= var206 + 1; var209++) {
                                    for (int var210 = var207 - 1; var210 <= var208 + 1; var210++) {
                                        if (var209 < var205 || var209 > var206 || var210 < var207 || var210 > var208) {
                                            Statics.field2579.method3031("m" + var209 + "_" + var210);
                                            Statics.field2579.method3031("l" + var209 + "_" + var210);
                                        }
                                    }
                                }
                            }
                            method159(30);
                            method162();
                            class6.method627();
                            field319.method2596(123);
                            Statics.field1935.method2677();
                            for (int var211 = 0; var211 < 32; var211++) {
                                field2180[var211] = 0L;
                            }
                            for (int var212 = 0; var212 < 32; var212++) {
                                field2182[var212] = 0L;
                            }
                            Statics.field2696 = 0;
                        } else {
                            field335 = 2;
                        }
                    } else {
                        field335 = 1;
                    }
                }
                if (field284 == 30) {
                    if (field405 > 1) {
                        field405--;
                    }
                    if (field306 > 0) {
                        field306--;
                    }
                    if (field330) {
                        field330 = false;
                        if (field306 > 0) {
                            method576();
                        } else {
                            method159(40);
                            Statics.field258 = Statics.field1661;
                            Statics.field1661 = null;
                        }
                    } else {
                        if (!field454) {
                            field421[0] = class158.field2456;
                            field291[0] = "";
                            field419[0] = 1006;
                            field416 = 1;
                        }
                        for (int var213 = 0; var213 < 100; var213++) {
                            boolean var214;
                            if (Statics.field1661 == null) {
                                var214 = false;
                            } else {
                                label4272: {
                                    try {
                                        int var215 = Statics.field1661.method2819();
                                        if (var215 == 0) {
                                            var214 = false;
                                            break label4272;
                                        }
                                        if (field323 == -1) {
                                            Statics.field1661.method2813(field321.field1974, 0, 1);
                                            field321.field1972 = 0;
                                            field323 = field321.method2602();
                                            field524 = class189.field3056[field323];
                                            var215--;
                                        }
                                        if (field524 == -1) {
                                            if (var215 <= 0) {
                                                var214 = false;
                                                break label4272;
                                            }
                                            Statics.field1661.method2813(field321.field1974, 0, 1);
                                            field524 = field321.field1974[0] & 0xFF;
                                            var215--;
                                        }
                                        if (field524 == -2) {
                                            if (var215 <= 1) {
                                                var214 = false;
                                                break label4272;
                                            }
                                            Statics.field1661.method2813(field321.field1974, 0, 2);
                                            field321.field1972 = 0;
                                            field524 = field321.method2363();
                                            var215 -= 2;
                                        }
                                        if (var215 < field524) {
                                            var214 = false;
                                            break label4272;
                                        }
                                        field321.field1972 = 0;
                                        Statics.field1661.method2813(field321.field1974, 0, field524);
                                        field324 = 0;
                                        field282 = field327;
                                        field327 = field326;
                                        field326 = field323;
                                        if (field323 == 209) {
                                            field405 = field321.method2395() * 30;
                                            field471 = field459;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 33) {
                                            method3454(false);
                                            field321.method2602();
                                            int var216 = field321.method2363();
                                            class33.method989(field321, var216);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 12) {
                                            for (int var217 = 0; var217 < field397.length; var217++) {
                                                if (field397[var217] != null) {
                                                    field397[var217].field826 = -1;
                                                }
                                            }
                                            for (int var218 = 0; var218 < field518.length; var218++) {
                                                if (field518[var218] != null) {
                                                    field518[var218].field826 = -1;
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 213) {
                                            while (field321.field1972 < field524) {
                                                boolean var219 = field321.method2361() == 1;
                                                String var220 = field321.method2369();
                                                String var221 = field321.method2369();
                                                int var222 = field321.method2363();
                                                int var223 = field321.method2361();
                                                int var224 = field321.method2361();
                                                boolean var225 = (var224 & 0x2) != 0;
                                                boolean var226 = (var224 & 0x1) != 0;
                                                if (var222 > 0) {
                                                    field321.method2369();
                                                    field321.method2361();
                                                    field321.method2366();
                                                }
                                                field321.method2369();
                                                for (int var227 = 0; var227 < field349; var227++) {
                                                    class18 var228 = field429[var227];
                                                    if (var219) {
                                                        if (var221.equals(var228.field240)) {
                                                            var228.field240 = var220;
                                                            var228.field239 = var221;
                                                            var220 = null;
                                                            break;
                                                        }
                                                    } else if (var220.equals(var228.field240)) {
                                                        if (var228.field238 != var222) {
                                                            boolean var229 = true;
                                                            for (class39 var230 = (class39) field535.method3487(); var230 != null; var230 = (class39) field535.method3489()) {
                                                                if (var230.field858.equals(var220)) {
                                                                    if (var222 != 0 && var230.field860 == 0) {
                                                                        var230.method3636();
                                                                        var229 = false;
                                                                    } else if (var222 == 0 && var230.field860 != 0) {
                                                                        var230.method3636();
                                                                        var229 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var229) {
                                                                field535.method3495(new class39(var220, var222));
                                                            }
                                                            var228.field238 = var222;
                                                        }
                                                        var228.field239 = var221;
                                                        var228.field241 = var223;
                                                        var228.field242 = var225;
                                                        var228.field243 = var226;
                                                        var220 = null;
                                                        break;
                                                    }
                                                }
                                                if (var220 != null && field349 < 400) {
                                                    class18 var231 = new class18();
                                                    field429[field349] = var231;
                                                    var231.field240 = var220;
                                                    var231.field239 = var221;
                                                    var231.field238 = var222;
                                                    var231.field241 = var223;
                                                    var231.field242 = var225;
                                                    var231.field243 = var226;
                                                    field349++;
                                                }
                                            }
                                            field272 = 2;
                                            field467 = field459;
                                            boolean var232 = false;
                                            int var233 = field349;
                                            while (var233 > 0) {
                                                boolean var234 = true;
                                                var233--;
                                                for (int var235 = 0; var235 < var233; var235++) {
                                                    boolean var236 = false;
                                                    class18 var237 = field429[var235];
                                                    class18 var238 = field429[var235 + 1];
                                                    if (field275 != var237.field238 && field275 == var238.field238) {
                                                        var236 = true;
                                                    }
                                                    if (!var236 && var237.field238 == 0 && var238.field238 != 0) {
                                                        var236 = true;
                                                    }
                                                    if (!var236 && !var237.field242 && var238.field242) {
                                                        var236 = true;
                                                    }
                                                    if (!var236 && !var237.field243 && var238.field243) {
                                                        var236 = true;
                                                    }
                                                    if (var236) {
                                                        class18 var239 = field429[var235];
                                                        field429[var235] = field429[var235 + 1];
                                                        field429[var235 + 1] = var239;
                                                        var234 = false;
                                                    }
                                                }
                                                if (var234) {
                                                    break;
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 189) {
                                            int var240 = field321.method2361();
                                            class131[] var241 = class131.method2806();
                                            int var242 = 0;
                                            class131 var244;
                                            while (true) {
                                                if (var242 >= var241.length) {
                                                    var244 = null;
                                                    break;
                                                }
                                                class131 var243 = var241[var242];
                                                if (var243.field2039 == var240) {
                                                    var244 = var243;
                                                    break;
                                                }
                                                var242++;
                                            }
                                            Statics.field654 = var244;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 23) {
                                            Statics.method193();
                                            int var245 = field321.method2366();
                                            int var246 = field321.method2361();
                                            int var247 = field321.method2388();
                                            field413[var247] = var245;
                                            field420[var247] = var246;
                                            field412[var247] = 1;
                                            for (int var248 = 0; var248 < 98; var248++) {
                                                if (var245 >= class156.field2280[var248]) {
                                                    field412[var247] = var248 + 2;
                                                }
                                            }
                                            field464[++field497 - 1 & 0x1F] = var247;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 163) {
                                            int var249 = field321.method2387();
                                            int var250 = field321.method2388();
                                            String var251 = field321.method2369();
                                            if (var249 >= 1 && var249 <= 8) {
                                                if (var251.equalsIgnoreCase("null")) {
                                                    var251 = null;
                                                }
                                                field403[var249 - 1] = var251;
                                                field404[var249 - 1] = var250 == 0;
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 247) {
                                            field500 = true;
                                            Statics.field657 = field321.method2361();
                                            Statics.field2906 = field321.method2361();
                                            Statics.field1370 = field321.method2363();
                                            Statics.field2204 = field321.method2361();
                                            Statics.field967 = field321.method2361();
                                            if (Statics.field967 >= 100) {
                                                Statics.field1992 = Statics.field657 * 128 + 64;
                                                Statics.field604 = Statics.field2906 * 128 + 64;
                                                Statics.field1953 = method2909(Statics.field1992, Statics.field604, Statics.field656) - Statics.field1370;
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 185) {
                                            field500 = true;
                                            Statics.field63 = field321.method2361();
                                            Statics.field1581 = field321.method2361();
                                            Statics.field2031 = field321.method2363();
                                            Statics.field1081 = field321.method2361();
                                            Statics.field2897 = field321.method2361();
                                            if (Statics.field2897 >= 100) {
                                                int var252 = Statics.field63 * 128 + 64;
                                                int var253 = Statics.field1581 * 128 + 64;
                                                int var254 = method2909(var252, var253, Statics.field656) - Statics.field2031;
                                                int var255 = var252 - Statics.field1992;
                                                int var256 = var254 - Statics.field1953;
                                                int var257 = var253 - Statics.field604;
                                                int var258 = (int) Math.sqrt((double) (var255 * var255 + var257 * var257));
                                                Statics.field2277 = (int) (Math.atan2((double) var256, (double) var258) * 325.949D) & 0x7FF;
                                                Statics.field244 = (int) (Math.atan2((double) var255, (double) var257) * -325.949D) & 0x7FF;
                                                if (Statics.field2277 < 128) {
                                                    Statics.field2277 = 128;
                                                }
                                                if (Statics.field2277 > 383) {
                                                    Statics.field2277 = 383;
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 202) {
                                            int var259 = field321.method2405();
                                            int var260 = field321.method2406();
                                            class4 var261 = (class4) field435.method3498((long) var259);
                                            class4 var262 = (class4) field435.method3498((long) var260);
                                            if (var262 != null) {
                                                method2653(var262, var261 == null || var261.field66 != var262.field66);
                                            }
                                            if (var261 != null) {
                                                var261.method3639();
                                                field435.method3499(var261, (long) var260);
                                            }
                                            class174 var263 = class174.method2807(var259);
                                            if (var263 != null) {
                                                method29(var263);
                                            }
                                            class174 var264 = class174.method2807(var260);
                                            if (var264 != null) {
                                                method29(var264);
                                                method2309(Statics.field2736[var264.field2775 >>> 16], var264, true);
                                            }
                                            if (field434 != -1) {
                                                int var265 = field434;
                                                if (class174.method2240(var265)) {
                                                    method39(Statics.field2736[var265], 1);
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 8) {
                                            class33.method989(field321, field524);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 230) {
                                            int var266 = field321.method2404();
                                            boolean var267 = field321.method2388() == 1;
                                            class174 var268 = class174.method2807(var266);
                                            if (var268.field2760 != var267) {
                                                var268.field2760 = var267;
                                                method29(var268);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 77) {
                                            String var269 = field321.method2369();
                                            Statics.field3006 = var269;
                                            try {
                                                String var270 = Statics.field273.getParameter(class191.field3064.field3078);
                                                String var271 = Statics.field273.getParameter(class191.field3066.field3078);
                                                String var272 = var270 + "settings=" + var269 + "; version=1; path=/; domain=" + var271;
                                                String var273;
                                                if (var269.length() == 0) {
                                                    var273 = var272 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                                } else {
                                                    var273 = var272 + "; Expires=" + class112.method727(class116.method1579() + 94608000000L) + "; Max-Age=" + 94608000L;
                                                }
                                                class133.method2669(Statics.field273, "document.cookie=\"" + var273 + "\"");
                                            } catch (Throwable var641) {
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 156) {
                                            int var275 = field321.method2366();
                                            class174 var276 = class174.method2807(var275);
                                            var276.field2788 = 3;
                                            var276.field2777 = Statics.field1054.field37.method3232();
                                            method29(var276);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 26) {
                                            int var277 = field321.method2405();
                                            int var278 = field321.method2396();
                                            if (var278 == 65535) {
                                                var278 = -1;
                                            }
                                            int var279 = field321.method2366();
                                            class174 var280 = class174.method2807(var277);
                                            if (var280.field2769) {
                                                var280.field2774 = var278;
                                                var280.field2739 = var279;
                                                class52 var282 = class52.method1967(var278);
                                                var280.field2796 = var282.field1102;
                                                var280.field2833 = var282.field1085;
                                                var280.field2798 = var282.field1104;
                                                var280.field2794 = var282.field1105;
                                                var280.field2802 = var282.field1097;
                                                var280.field2744 = var282.field1101;
                                                if (var282.field1107 == 1) {
                                                    var280.field2803 = 1;
                                                } else {
                                                    var280.field2803 = 2;
                                                }
                                                if (var280.field2800 > 0) {
                                                    var280.field2744 = var280.field2744 * 32 / var280.field2800;
                                                } else if (var280.field2756 > 0) {
                                                    var280.field2744 = var280.field2744 * 32 / var280.field2756;
                                                }
                                                method29(var280);
                                            } else {
                                                if (var278 == -1) {
                                                    var280.field2788 = 0;
                                                    field323 = -1;
                                                    var214 = true;
                                                    break label4272;
                                                }
                                                class52 var281 = class52.method1967(var278);
                                                var280.field2788 = 4;
                                                var280.field2777 = var278;
                                                var280.field2796 = var281.field1102;
                                                var280.field2833 = var281.field1085;
                                                var280.field2744 = var281.field1101 * 100 / var279;
                                                method29(var280);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 133) {
                                            String var283 = field321.method2369();
                                            long var284 = (long) field321.method2363();
                                            long var286 = (long) field321.method2523();
                                            class153 var288 = (class153) class110.method2153(class153.method3117(), field321.method2361());
                                            long var289 = (var284 << 32) + var286;
                                            boolean var291 = false;
                                            for (int var292 = 0; var292 < 100; var292++) {
                                                if (field495[var292] == var289) {
                                                    var291 = true;
                                                    break;
                                                }
                                            }
                                            if (method197(var283)) {
                                                var291 = true;
                                            }
                                            if (!var291 && field396 == 0) {
                                                field495[field496] = var289;
                                                field496 = (field496 + 1) % 100;
                                                class123 var293 = field321;
                                                String var297;
                                                try {
                                                    int var294 = var293.method2373();
                                                    if (var294 > 32767) {
                                                        var294 = 32767;
                                                    }
                                                    byte[] var295 = new byte[var294];
                                                    var293.field1972 += Statics.field2645.method2286(var293.field1974, var293.field1972, var295, 0, var294);
                                                    String var296 = class166.method2767(var295, 0, var294);
                                                    var297 = var296;
                                                } catch (Exception var640) {
                                                    var297 = "Cabbage";
                                                }
                                                String var300 = class224.method3761(class164.method552(var297));
                                                byte var301;
                                                if (var288.field2253) {
                                                    var301 = 7;
                                                } else {
                                                    var301 = 3;
                                                }
                                                if (var288.field2252 == -1) {
                                                    class12.method108(var301, var283, var300);
                                                } else {
                                                    class12.method108(var301, class2.method105(var288.field2252) + var283, var300);
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 21) {
                                            boolean var302 = field321.method2361() == 1;
                                            if (var302) {
                                                Statics.field2224 = class116.method1579() - field321.method2367();
                                                Statics.field557 = new class222(field321, true);
                                            } else {
                                                Statics.field557 = null;
                                            }
                                            field485 = field459;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 138 || field323 == 206 || field323 == 109 || field323 == 169 || field323 == 56 || field323 == 165 || field323 == 32 || field323 == 105 || field323 == 174 || field323 == 212) {
                                            method654();
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 104) {
                                            for (int var303 = 0; var303 < Statics.field1143; var303++) {
                                                class53 var304 = class53.method3201(var303);
                                                if (var304 != null) {
                                                    class177.field2902[var303] = 0;
                                                    class177.field2901[var303] = 0;
                                                }
                                            }
                                            Statics.method193();
                                            field446 += 32;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 88) {
                                            int var305 = field321.method2366();
                                            int var306 = field321.method2363();
                                            if (var305 < -70000) {
                                                var306 += 32768;
                                            }
                                            class174 var307;
                                            if (var305 >= 0) {
                                                var307 = class174.method2807(var305);
                                            } else {
                                                var307 = null;
                                            }
                                            while (field321.field1972 < field524) {
                                                int var308 = field321.method2373();
                                                int var309 = field321.method2363();
                                                int var310 = 0;
                                                if (var309 != 0) {
                                                    var310 = field321.method2361();
                                                    if (var310 == 255) {
                                                        var310 = field321.method2366();
                                                    }
                                                }
                                                if (var307 != null && var308 >= 0 && var308 < var307.field2863.length) {
                                                    var307.field2863[var308] = var309;
                                                    var307.field2864[var308] = var310;
                                                }
                                                class16.method1184(var306, var308, var309 - 1, var310);
                                            }
                                            if (var307 != null) {
                                                method29(var307);
                                            }
                                            Statics.method193();
                                            field462[++field463 - 1 & 0x1F] = var306 & 0x7FFF;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 164) {
                                            field468 = field459;
                                            if (field524 == 0) {
                                                field417 = null;
                                                field502 = null;
                                                Statics.field854 = 0;
                                                Statics.field2006 = null;
                                                field323 = -1;
                                                var214 = true;
                                                break label4272;
                                            }
                                            field502 = field321.method2369();
                                            long var311 = field321.method2367();
                                            long var313 = var311;
                                            String var315;
                                            if (var311 <= 0L || var311 >= 6582952005840035281L) {
                                                var315 = null;
                                            } else if (var311 % 37L == 0L) {
                                                var315 = null;
                                            } else {
                                                int var316 = 0;
                                                for (long var317 = var311; var317 != 0L; var317 /= 37L) {
                                                    var316++;
                                                }
                                                StringBuilder var319 = new StringBuilder(var316);
                                                while (var313 != 0L) {
                                                    long var320 = var313;
                                                    var313 /= 37L;
                                                    var319.append(class163.field2643[(int) (var320 - var313 * 37L)]);
                                                }
                                                var315 = var319.reverse().toString();
                                            }
                                            field417 = var315;
                                            Statics.field1891 = field321.method2531();
                                            int var322 = field321.method2361();
                                            if (var322 == 255) {
                                                field323 = -1;
                                                var214 = true;
                                                break label4272;
                                            }
                                            Statics.field854 = var322;
                                            class25[] var323 = new class25[100];
                                            for (int var324 = 0; var324 < Statics.field854; var324++) {
                                                var323[var324] = new class25();
                                                var323[var324].field608 = field321.method2369();
                                                var323[var324].field605 = Statics.method1536(var323[var324].field608, Statics.field279);
                                                var323[var324].field606 = field321.method2363();
                                                var323[var324].field607 = field321.method2531();
                                                field321.method2369();
                                                if (var323[var324].field608.equals(Statics.field1054.field59)) {
                                                    Statics.field1205 = var323[var324].field607;
                                                }
                                            }
                                            boolean var325 = false;
                                            int var326 = Statics.field854;
                                            while (var326 > 0) {
                                                boolean var327 = true;
                                                var326--;
                                                for (int var328 = 0; var328 < var326; var328++) {
                                                    if (var323[var328].field605.compareTo(var323[var328 + 1].field605) > 0) {
                                                        class25 var329 = var323[var328];
                                                        var323[var328] = var323[var328 + 1];
                                                        var323[var328 + 1] = var329;
                                                        var327 = false;
                                                    }
                                                }
                                                if (var327) {
                                                    break;
                                                }
                                            }
                                            Statics.field2006 = var323;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 183) {
                                            method576();
                                            field323 = -1;
                                            var214 = false;
                                            break label4272;
                                        }
                                        if (field323 == 107) {
                                            int var330 = field321.method2361();
                                            int var331 = field321.method2361();
                                            int var332 = field321.method2361();
                                            int var333 = field321.method2361();
                                            field523[var330] = true;
                                            field370[var330] = var331;
                                            field525[var330] = var332;
                                            field526[var330] = var333;
                                            field527[var330] = 0;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 117) {
                                            class33.field738 = 0;
                                            for (int var334 = 0; var334 < 2048; var334++) {
                                                class33.field737[var334] = null;
                                                class33.field736[var334] = 1;
                                            }
                                            for (int var335 = 0; var335 < 2048; var335++) {
                                                field397[var335] = null;
                                            }
                                            class33.method42(field321);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 130) {
                                            method180(true);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 168) {
                                            method180(false);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 36) {
                                            method3454(true);
                                            field321.method2602();
                                            int var336 = field321.method2363();
                                            class33.method989(field321, var336);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 249) {
                                            int var337 = field321.method2406();
                                            int var338 = field321.method2397();
                                            class174 var339 = class174.method2807(var337);
                                            if (var339.field2788 != 2 || var339.field2777 != var338) {
                                                var339.field2788 = 2;
                                                var339.field2777 = var338;
                                                method29(var339);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 218) {
                                            int var340 = field321.method2366();
                                            int var341 = field321.method2363();
                                            class174 var342 = class174.method2807(var340);
                                            if (var342 != null && var342.field2821 == 0) {
                                                if (var341 > var342.field2785 - var342.field2747) {
                                                    var341 = var342.field2785 - var342.field2747;
                                                }
                                                if (var341 < 0) {
                                                    var341 = 0;
                                                }
                                                if (var342.field2767 != var341) {
                                                    var342.field2767 = var341;
                                                    method29(var342);
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 237) {
                                            String var343 = field321.method2369();
                                            int var344 = field321.method2363();
                                            byte var345 = field321.method2531();
                                            boolean var346 = false;
                                            if (var345 == -128) {
                                                var346 = true;
                                            }
                                            if (var346) {
                                                if (Statics.field854 == 0) {
                                                    field323 = -1;
                                                    var214 = true;
                                                    break label4272;
                                                }
                                                boolean var347 = false;
                                                int var348;
                                                for (var348 = 0; var348 < Statics.field854 && (!Statics.field2006[var348].field608.equals(var343) || Statics.field2006[var348].field606 != var344); var348++) {
                                                }
                                                if (var348 < Statics.field854) {
                                                    while (var348 < Statics.field854 - 1) {
                                                        Statics.field2006[var348] = Statics.field2006[var348 + 1];
                                                        var348++;
                                                    }
                                                    Statics.field854--;
                                                    Statics.field2006[Statics.field854] = null;
                                                }
                                            } else {
                                                field321.method2369();
                                                class25 var349 = new class25();
                                                var349.field608 = var343;
                                                var349.field605 = Statics.method1536(var349.field608, Statics.field279);
                                                var349.field606 = var344;
                                                var349.field607 = var345;
                                                int var350;
                                                for (var350 = Statics.field854 - 1; var350 >= 0; var350--) {
                                                    int var351 = Statics.field2006[var350].field605.compareTo(var349.field605);
                                                    if (var351 == 0) {
                                                        Statics.field2006[var350].field606 = var344;
                                                        Statics.field2006[var350].field607 = var345;
                                                        if (var343.equals(Statics.field1054.field59)) {
                                                            Statics.field1205 = var345;
                                                        }
                                                        field468 = field459;
                                                        field323 = -1;
                                                        var214 = true;
                                                        break label4272;
                                                    }
                                                    if (var351 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field854 >= Statics.field2006.length) {
                                                    field323 = -1;
                                                    var214 = true;
                                                    break label4272;
                                                }
                                                for (int var352 = Statics.field854 - 1; var352 > var350; var352--) {
                                                    Statics.field2006[var352 + 1] = Statics.field2006[var352];
                                                }
                                                if (Statics.field854 == 0) {
                                                    Statics.field2006 = new class25[100];
                                                }
                                                Statics.field2006[var350 + 1] = var349;
                                                Statics.field854++;
                                                if (var343.equals(Statics.field1054.field59)) {
                                                    Statics.field1205 = var345;
                                                }
                                            }
                                            field468 = field459;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 225) {
                                            field276 = field321.method2361();
                                            if (field276 == 1) {
                                                field295 = field321.method2363();
                                            }
                                            if (field276 >= 2 && field276 <= 6) {
                                                if (field276 == 2) {
                                                    field530 = 64;
                                                    field301 = 64;
                                                }
                                                if (field276 == 3) {
                                                    field530 = 0;
                                                    field301 = 64;
                                                }
                                                if (field276 == 4) {
                                                    field530 = 128;
                                                    field301 = 64;
                                                }
                                                if (field276 == 5) {
                                                    field530 = 64;
                                                    field301 = 0;
                                                }
                                                if (field276 == 6) {
                                                    field530 = 64;
                                                    field301 = 128;
                                                }
                                                field276 = 2;
                                                field297 = field321.method2363();
                                                field424 = field321.method2363();
                                                field422 = field321.method2361();
                                            }
                                            if (field276 == 10) {
                                                field310 = field321.method2363();
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 9) {
                                            field492 = field321.method2361();
                                            field288 = field321.method2361();
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 233) {
                                            int var353 = field321.method2397();
                                            int var354 = field321.method2395();
                                            int var355 = field321.method2405();
                                            class174 var356 = class174.method2807(var355);
                                            var356.field2762 = (var353 << 16) + var354;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 149) {
                                            field500 = false;
                                            for (int var357 = 0; var357 < 5; var357++) {
                                                field523[var357] = false;
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 252) {
                                            int var358 = field321.method2361();
                                            if (field321.method2361() == 0) {
                                                field550[var358] = new class221();
                                                field321.field1972 += 18;
                                            } else {
                                                field321.field1972--;
                                                field550[var358] = new class221(field321, false);
                                            }
                                            field469 = field459;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 144) {
                                            int var359 = field321.method2395();
                                            class16.method195(var359);
                                            field462[++field463 - 1 & 0x1F] = var359 & 0x7FFF;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 72) {
                                            int var360 = field321.method2405();
                                            class174 var361 = class174.method2807(var360);
                                            for (int var362 = 0; var362 < var361.field2863.length; var362++) {
                                                var361.field2863[var362] = -1;
                                                var361.field2863[var362] = 0;
                                            }
                                            method29(var361);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 176) {
                                            field510 = field321.method2361();
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 49) {
                                            int var363 = field321.method2399();
                                            int var364 = field321.method2442();
                                            int var365 = field321.method2404();
                                            class174 var366 = class174.method2807(var365);
                                            if (var366.field2754 != var363 || var366.field2755 != var364 || var366.field2750 != 0 || var366.field2751 != 0) {
                                                var366.field2754 = var363;
                                                var366.field2755 = var364;
                                                var366.field2750 = 0;
                                                var366.field2751 = 0;
                                                method29(var366);
                                                method584(var366);
                                                if (var366.field2821 == 0) {
                                                    method2309(Statics.field2736[var365 >> 16], var366, false);
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 211) {
                                            int var367 = field321.method2363();
                                            int var368 = field321.method2405();
                                            int var369 = var367 >> 10 & 0x1F;
                                            int var370 = var367 >> 5 & 0x1F;
                                            int var371 = var367 & 0x1F;
                                            int var372 = (var371 << 3) + (var369 << 19) + (var370 << 11);
                                            class174 var373 = class174.method2807(var368);
                                            if (var373.field2791 != var372) {
                                                var373.field2791 = var372;
                                                method29(var373);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 251) {
                                            int var374 = field321.method2395();
                                            int var375 = field321.method2405();
                                            int var376 = field321.method2388();
                                            class4 var377 = (class4) field435.method3498((long) var375);
                                            if (var377 != null) {
                                                method2653(var377, var377.field66 != var374);
                                            }
                                            method1183(var375, var374, var376);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 112) {
                                            Statics.field31 = field321.method2388();
                                            Statics.field2248 = field321.method2387();
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 45) {
                                            int var378 = field321.method2366();
                                            int var379 = field321.method2366();
                                            if (Statics.field2284 == null || !Statics.field2284.isValid()) {
                                                try {
                                                    Iterator var380 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var380.hasNext()) {
                                                        GarbageCollectorMXBean var381 = (GarbageCollectorMXBean) var380.next();
                                                        if (var381.isValid()) {
                                                            Statics.field2284 = var381;
                                                            field494 = -1L;
                                                            field305 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var645) {
                                                }
                                            }
                                            long var383 = class116.method1579();
                                            int var385 = -1;
                                            if (Statics.field2284 != null) {
                                                long var386 = Statics.field2284.getCollectionTime();
                                                if (field305 != -1L) {
                                                    long var388 = var386 - field305;
                                                    long var390 = var383 - field494;
                                                    if (var390 != 0L) {
                                                        var385 = (int) (var388 * 100L / var390);
                                                    }
                                                }
                                                field305 = var386;
                                                field494 = var383;
                                            }
                                            field319.method2596(121);
                                            field319.method2458(field2185);
                                            field319.method2364(var385);
                                            field319.method2402(var378);
                                            field319.method2401(var379);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 30) {
                                            String var392 = field321.method2369();
                                            Object[] var393 = new Object[var392.length() + 1];
                                            for (int var394 = var392.length() - 1; var394 >= 0; var394--) {
                                                if (var392.charAt(var394) == 's') {
                                                    var393[var394 + 1] = field321.method2369();
                                                } else {
                                                    var393[var394 + 1] = Integer.valueOf(field321.method2366());
                                                }
                                            }
                                            var393[0] = Integer.valueOf(field321.method2366());
                                            class1 var395 = new class1();
                                            var395.field17 = var393;
                                            class37.method736(var395);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 195) {
                                            int var396 = field524 + field321.field1972;
                                            int var397 = field321.method2363();
                                            int var398 = field321.method2363();
                                            if (field434 != var397) {
                                                field434 = var397;
                                                method1476(false);
                                                method3661(field434);
                                                class37.method2054(field434);
                                                for (int var399 = 0; var399 < 100; var399++) {
                                                    field479[var399] = true;
                                                }
                                            }
                                            while (var398-- > 0) {
                                                int var400 = field321.method2366();
                                                int var401 = field321.method2363();
                                                int var402 = field321.method2361();
                                                class4 var403 = (class4) field435.method3498((long) var400);
                                                if (var403 != null && var403.field66 != var401) {
                                                    method2653(var403, true);
                                                    var403 = null;
                                                }
                                                if (var403 == null) {
                                                    var403 = method1183(var400, var401, var402);
                                                }
                                                var403.field64 = true;
                                            }
                                            for (class4 var404 = (class4) field435.method3501(); var404 != null; var404 = (class4) field435.method3502()) {
                                                if (var404.field64) {
                                                    var404.field64 = false;
                                                } else {
                                                    method2653(var404, true);
                                                }
                                            }
                                            field476 = new class197(512);
                                            while (field321.field1972 < var396) {
                                                int var405 = field321.method2366();
                                                int var406 = field321.method2363();
                                                int var407 = field321.method2363();
                                                int var408 = field321.method2366();
                                                for (int var409 = var406; var409 <= var407; var409++) {
                                                    long var410 = ((long) var405 << 32) + (long) var409;
                                                    field476.method3499(new class202(var408), var410);
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 134) {
                                            String var412 = field321.method2369();
                                            int var413 = field321.method2406();
                                            class174 var414 = class174.method2807(var413);
                                            if (!var412.equals(var414.field2876)) {
                                                var414.field2876 = var412;
                                                method29(var414);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 44) {
                                            Statics.field2248 = field321.method2388();
                                            Statics.field31 = field321.method2387();
                                            for (int var415 = Statics.field31; var415 < Statics.field31 + 8; var415++) {
                                                for (int var416 = Statics.field2248; var416 < Statics.field2248 + 8; var416++) {
                                                    if (field365[Statics.field656][var415][var416] != null) {
                                                        field365[Statics.field656][var415][var416] = null;
                                                        method155(var415, var416);
                                                    }
                                                }
                                            }
                                            for (class17 var417 = (class17) field408.method3540(); var417 != null; var417 = (class17) field408.method3533()) {
                                                if (var417.field225 >= Statics.field31 && var417.field225 < Statics.field31 + 8 && var417.field226 >= Statics.field2248 && var417.field226 < Statics.field2248 + 8 && Statics.field656 == var417.field228) {
                                                    var417.field234 = 0;
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 111) {
                                            class26 var418 = new class26();
                                            var418.field628 = field321.method2369();
                                            var418.field619 = field321.method2363();
                                            int var419 = field321.method2366();
                                            var418.field614 = var419;
                                            method159(45);
                                            Statics.field1661.method2811();
                                            Statics.field1661 = null;
                                            class32.method569(var418);
                                            field323 = -1;
                                            var214 = false;
                                            break label4272;
                                        }
                                        if (field323 == 76) {
                                            int var420 = field321.method2366();
                                            class4 var421 = (class4) field435.method3498((long) var420);
                                            if (var421 != null) {
                                                method2653(var421, true);
                                            }
                                            if (field438 != null) {
                                                method29(field438);
                                                field438 = null;
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 85) {
                                            int var422 = field321.method2363();
                                            if (var422 == 65535) {
                                                var422 = -1;
                                            }
                                            if (var422 == -1 && !field513) {
                                                class184.method3118();
                                            } else if (var422 != -1 && field533 != var422 && field410 != 0 && !field513) {
                                                class169 var423 = Statics.field2070;
                                                int var424 = field410;
                                                class184.field2960 = 1;
                                                Statics.field1371 = var423;
                                                Statics.field2961 = var422;
                                                Statics.field2962 = 0;
                                                Statics.field2958 = var424;
                                                Statics.field2965 = false;
                                                Statics.field2964 = 2;
                                            }
                                            field533 = var422;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 203) {
                                            int var425 = field321.method2523();
                                            int var426 = field321.method2395();
                                            if (var426 == 65535) {
                                                var426 = -1;
                                            }
                                            if (field410 != 0 && var426 != -1) {
                                                class184.method2638(Statics.field2081, var426, 0, field410, false);
                                                field513 = true;
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 186) {
                                            int var427 = field321.method2366();
                                            int var428 = field321.method2363();
                                            if (var427 < -70000) {
                                                var428 += 32768;
                                            }
                                            class174 var429;
                                            if (var427 >= 0) {
                                                var429 = class174.method2807(var427);
                                            } else {
                                                var429 = null;
                                            }
                                            if (var429 != null) {
                                                for (int var430 = 0; var430 < var429.field2863.length; var430++) {
                                                    var429.field2863[var430] = 0;
                                                    var429.field2864[var430] = 0;
                                                }
                                            }
                                            class16 var431 = (class16) class16.field211.method3498((long) var428);
                                            if (var431 != null) {
                                                for (int var432 = 0; var432 < var431.field212.length; var432++) {
                                                    var431.field212[var432] = -1;
                                                    var431.field213[var432] = 0;
                                                }
                                            }
                                            int var433 = field321.method2363();
                                            for (int var434 = 0; var434 < var433; var434++) {
                                                int var435 = field321.method2395();
                                                int var436 = field321.method2388();
                                                if (var436 == 255) {
                                                    var436 = field321.method2406();
                                                }
                                                if (var429 != null && var434 < var429.field2863.length) {
                                                    var429.field2863[var434] = var435;
                                                    var429.field2864[var434] = var436;
                                                }
                                                class16.method1184(var428, var434, var435 - 1, var436);
                                            }
                                            if (var429 != null) {
                                                method29(var429);
                                            }
                                            Statics.method193();
                                            field462[++field463 - 1 & 0x1F] = var428 & 0x7FFF;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 236) {
                                            Statics.field2248 = field321.method2387();
                                            Statics.field31 = field321.method2524();
                                            while (field321.field1972 < field524) {
                                                field323 = field321.method2361();
                                                method654();
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 90) {
                                            int var437 = field321.method2406();
                                            Statics.field190 = Statics.field2154.method2727(var437);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 114) {
                                            int var438 = field321.method2397();
                                            int var439 = field321.method2397();
                                            int var440 = field321.method2404();
                                            int var441 = field321.method2363();
                                            class174 var442 = class174.method2807(var440);
                                            if (var442.field2796 != var441 || var442.field2833 != var439 || var442.field2744 != var438) {
                                                var442.field2796 = var441;
                                                var442.field2833 = var439;
                                                var442.field2744 = var438;
                                                method29(var442);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 234) {
                                            String var443 = field321.method2369();
                                            long var444 = field321.method2367();
                                            long var446 = (long) field321.method2363();
                                            long var448 = (long) field321.method2523();
                                            class153 var450 = (class153) class110.method2153(class153.method3117(), field321.method2361());
                                            long var451 = (var446 << 32) + var448;
                                            boolean var453 = false;
                                            for (int var454 = 0; var454 < 100; var454++) {
                                                if (field495[var454] == var451) {
                                                    var453 = true;
                                                    break;
                                                }
                                            }
                                            if (var450.field2254 && method197(var443)) {
                                                var453 = true;
                                            }
                                            if (!var453 && field396 == 0) {
                                                field495[field496] = var451;
                                                field496 = (field496 + 1) % 100;
                                                class123 var455 = field321;
                                                String var459;
                                                try {
                                                    int var456 = var455.method2373();
                                                    if (var456 > 32767) {
                                                        var456 = 32767;
                                                    }
                                                    byte[] var457 = new byte[var456];
                                                    var455.field1972 += Statics.field2645.method2286(var455.field1974, var455.field1972, var457, 0, var456);
                                                    String var458 = class166.method2767(var457, 0, var456);
                                                    var459 = var458;
                                                } catch (Exception var639) {
                                                    var459 = "Cabbage";
                                                }
                                                String var462 = class224.method3761(class164.method552(var459));
                                                if (var450.field2252 == -1) {
                                                    class12.method1584(9, var443, var462, class163.method2152(var444));
                                                } else {
                                                    class12.method1584(9, class2.method105(var450.field2252) + var443, var462, class163.method2152(var444));
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 190) {
                                            if (field434 != -1) {
                                                int var463 = field434;
                                                if (class174.method2240(var463)) {
                                                    method39(Statics.field2736[var463], 0);
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 43) {
                                            int var464 = field321.method2363();
                                            int var465 = field321.method2361();
                                            int var466 = field321.method2363();
                                            if (field514 != 0 && var465 != 0 && field516 < 50) {
                                                field440[field516] = var464;
                                                field461[field516] = var465;
                                                field519[field516] = var466;
                                                field544[field516] = null;
                                                field520[field516] = 0;
                                                field516++;
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 73) {
                                            for (int var470 = 0; var470 < class177.field2901.length; var470++) {
                                                if (class177.field2902[var470] != class177.field2901[var470]) {
                                                    class177.field2901[var470] = class177.field2902[var470];
                                                    method976(var470);
                                                    field442[++field446 - 1 & 0x1F] = var470;
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 224) {
                                            field272 = 1;
                                            field467 = field459;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 181) {
                                            int var471 = field321.method2363();
                                            field434 = var471;
                                            method1476(false);
                                            method3661(var471);
                                            class37.method2054(field434);
                                            for (int var472 = 0; var472 < 100; var472++) {
                                                field479[var472] = true;
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 89) {
                                            byte var473 = field321.method2382();
                                            int var474 = field321.method2396();
                                            class177.field2902[var474] = var473;
                                            if (class177.field2901[var474] != var473) {
                                                class177.field2901[var474] = var473;
                                            }
                                            method976(var474);
                                            field442[++field446 - 1 & 0x1F] = var474;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 24) {
                                            int var475 = field321.method2366();
                                            int var476 = field321.method2362();
                                            class174 var477 = class174.method2807(var475);
                                            if (var477.field2849 != var476 || var476 == -1) {
                                                var477.field2849 = var476;
                                                var477.field2867 = 0;
                                                var477.field2868 = 0;
                                                method29(var477);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 7) {
                                            int var478 = field321.method2406();
                                            int var479 = field321.method2397();
                                            class174 var480 = class174.method2807(var478);
                                            if (var480.field2788 != 1 || var480.field2777 != var479) {
                                                var480.field2788 = 1;
                                                var480.field2777 = var479;
                                                method29(var480);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 145) {
                                            Statics.method193();
                                            field414 = field321.method2362();
                                            field471 = field459;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 102) {
                                            int var481 = field321.method2395();
                                            if (var481 == 65535) {
                                                var481 = -1;
                                            }
                                            int var482 = field321.method2397();
                                            if (var482 == 65535) {
                                                var482 = -1;
                                            }
                                            int var483 = field321.method2366();
                                            int var484 = field321.method2406();
                                            for (int var485 = var481; var485 <= var482; var485++) {
                                                long var486 = ((long) var484 << 32) + (long) var485;
                                                class209 var488 = field476.method3498(var486);
                                                if (var488 != null) {
                                                    var488.method3639();
                                                }
                                                field476.method3499(new class202(var483), var486);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 217) {
                                            int var489 = field321.method2373();
                                            boolean var490 = field321.method2361() == 1;
                                            String var491 = "";
                                            boolean var492 = false;
                                            if (var490) {
                                                var491 = field321.method2369();
                                                if (method197(var491)) {
                                                    var492 = true;
                                                }
                                            }
                                            String var493 = field321.method2369();
                                            if (!var492) {
                                                class12.method108(var489, var491, var493);
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 194) {
                                            int var494 = field321.method2363();
                                            int var495 = field321.method2404();
                                            class177.field2902[var494] = var495;
                                            if (class177.field2901[var494] != var495) {
                                                class177.field2901[var494] = var495;
                                            }
                                            method976(var494);
                                            field442[++field446 - 1 & 0x1F] = var494;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 246) {
                                            Statics.method193();
                                            field439 = field321.method2361();
                                            field471 = field459;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 239) {
                                            field321.field1972 += 28;
                                            if (field321.method2392()) {
                                                class123 var496 = field321;
                                                int var497 = field321.field1972 - 28;
                                                if (class150.field2216 != null) {
                                                    try {
                                                        class150.field2216.method3880(0L);
                                                        class150.field2216.method3860(var496.field1974, var497, 24);
                                                    } catch (Exception var638) {
                                                    }
                                                }
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 67) {
                                            class212.method188(field321, field524);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 208) {
                                            String var499 = field321.method2369();
                                            class123 var500 = field321;
                                            String var504;
                                            try {
                                                int var501 = var500.method2373();
                                                if (var501 > 32767) {
                                                    var501 = 32767;
                                                }
                                                byte[] var502 = new byte[var501];
                                                var500.field1972 += Statics.field2645.method2286(var500.field1974, var500.field1972, var502, 0, var501);
                                                String var503 = class166.method2767(var502, 0, var501);
                                                var504 = var503;
                                            } catch (Exception var637) {
                                                var504 = "Cabbage";
                                            }
                                            String var507 = class224.method3761(class164.method552(var504));
                                            class12.method108(6, var499, var507);
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 192) {
                                            field508 = field321.method2361();
                                            if (field508 == 255) {
                                                field508 = 0;
                                            }
                                            field509 = field321.method2361();
                                            if (field509 == 255) {
                                                field509 = 0;
                                            }
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        if (field323 == 93) {
                                            while (field321.field1972 < field524) {
                                                int var508 = field321.method2361();
                                                boolean var509 = (var508 & 0x1) == 1;
                                                String var510 = field321.method2369();
                                                String var511 = field321.method2369();
                                                field321.method2369();
                                                for (int var512 = 0; var512 < field545; var512++) {
                                                    class8 var513 = field546[var512];
                                                    if (var509) {
                                                        if (var511.equals(var513.field132)) {
                                                            var513.field132 = var510;
                                                            var513.field134 = var511;
                                                            var510 = null;
                                                            break;
                                                        }
                                                    } else if (var510.equals(var513.field132)) {
                                                        var513.field132 = var510;
                                                        var513.field134 = var511;
                                                        var510 = null;
                                                        break;
                                                    }
                                                }
                                                if (var510 != null && field545 < 400) {
                                                    class8 var514 = new class8();
                                                    field546[field545] = var514;
                                                    var514.field132 = var510;
                                                    var514.field134 = var511;
                                                    field545++;
                                                }
                                            }
                                            field467 = field459;
                                            field323 = -1;
                                            var214 = true;
                                            break label4272;
                                        }
                                        class149.method101("" + field323 + class2.field21 + field327 + class2.field21 + field282 + class2.field21 + field524, (Throwable) null);
                                        method576();
                                    } catch (IOException var646) {
                                        if (field306 > 0) {
                                            method576();
                                        } else {
                                            method159(40);
                                            Statics.field258 = Statics.field1661;
                                            Statics.field1661 = null;
                                        }
                                    } catch (Exception var647) {
                                        String var517 = "" + field323 + class2.field21 + field327 + class2.field21 + field282 + class2.field21 + field524 + class2.field21 + (Statics.field3015 + Statics.field1054.field849[0]) + class2.field21 + (Statics.field13 + Statics.field1054.field823[0]) + class2.field21;
                                        for (int var518 = 0; var518 < field524 && var518 < 50; var518++) {
                                            var517 = var517 + field321.field1974[var518] + class2.field21;
                                        }
                                        class149.method101(var517, var647);
                                        method576();
                                    }
                                    var214 = true;
                                }
                            }
                            if (!var214) {
                                break;
                            }
                        }
                        if (field284 == 30) {
                            while (class212.method196()) {
                                field319.method2596(217);
                                field319.method2364(0);
                                int var519 = field319.field1972;
                                class212.method2063(field319);
                                field319.method2358(field319.field1972 - var519);
                            }
                            Object var520 = Statics.field3216.field192;
                            synchronized (Statics.field3216.field192) {
                                if (!field274) {
                                    Statics.field3216.field194 = 0;
                                } else if (class141.field2135 != 0 || Statics.field3216.field194 >= 40) {
                                    field319.method2596(238);
                                    field319.method2364(0);
                                    int var521 = field319.field1972;
                                    int var522 = 0;
                                    for (int var523 = 0; var523 < Statics.field3216.field194 && field319.field1972 - var521 < 240; var523++) {
                                        var522++;
                                        int var524 = Statics.field3216.field197[var523];
                                        if (var524 < 0) {
                                            var524 = 0;
                                        } else if (var524 > 502) {
                                            var524 = 502;
                                        }
                                        int var525 = Statics.field3216.field195[var523];
                                        if (var525 < 0) {
                                            var525 = 0;
                                        } else if (var525 > 764) {
                                            var525 = 764;
                                        }
                                        int var526 = var524 * 765 + var525;
                                        if (Statics.field3216.field197[var523] == -1 && Statics.field3216.field195[var523] == -1) {
                                            var525 = -1;
                                            var524 = -1;
                                            var526 = 524287;
                                        }
                                        if (field368 != var525 || field289 != var524) {
                                            int var527 = var525 - field368;
                                            field368 = var525;
                                            int var528 = var524 - field289;
                                            field289 = var524;
                                            if (field290 < 8 && var527 >= -32 && var527 <= 31 && var528 >= -32 && var528 <= 31) {
                                                var527 += 32;
                                                var528 += 32;
                                                field319.method2347((field290 << 12) + (var527 << 6) + var528);
                                                field290 = 0;
                                            } else if (field290 < 8) {
                                                field319.method2348((field290 << 19) + 8388608 + var526);
                                                field290 = 0;
                                            } else {
                                                field319.method2349((field290 << 19) + -1073741824 + var526);
                                                field290 = 0;
                                            }
                                        } else if (field290 < 2047) {
                                            field290++;
                                        }
                                    }
                                    field319.method2358(field319.field1972 - var521);
                                    if (var522 >= Statics.field3216.field194) {
                                        Statics.field3216.field194 = 0;
                                    } else {
                                        Statics.field3216.field194 -= var522;
                                        for (int var529 = 0; var529 < Statics.field3216.field194; var529++) {
                                            Statics.field3216.field195[var529] = Statics.field3216.field195[var522 + var529];
                                            Statics.field3216.field197[var529] = Statics.field3216.field197[var522 + var529];
                                        }
                                    }
                                }
                            }
                            if (class141.field2135 == 1 || !Statics.field2117 && class141.field2135 == 4 || class141.field2135 == 2) {
                                long var531 = (class141.field2138 - field287 * -1L) / 50L;
                                if (var531 > 4095L) {
                                    var531 = 4095L;
                                }
                                field287 = class141.field2138 * -1L;
                                int var533 = class141.field2137;
                                if (var533 < 0) {
                                    var533 = 0;
                                } else if (var533 > Statics.field902) {
                                    var533 = Statics.field902;
                                }
                                int var534 = class141.field2136;
                                if (var534 < 0) {
                                    var534 = 0;
                                } else if (var534 > Statics.field103) {
                                    var534 = Statics.field103;
                                }
                                int var535 = (int) var531;
                                field319.method2596(8);
                                field319.method2347((var535 << 1) + (class141.field2135 == 2 ? 1 : 0));
                                field319.method2347(var534);
                                field319.method2347(var533);
                            }
                            if (class138.field2089 > 0) {
                                field319.method2596(211);
                                field319.method2347(0);
                                int var536 = field319.field1972;
                                long var537 = class116.method1579();
                                for (int var539 = 0; var539 < class138.field2089; var539++) {
                                    long var540 = var537 - field381;
                                    if (var540 > 16777215L) {
                                        var540 = 16777215L;
                                    }
                                    field381 = var537;
                                    field319.method2364(class138.field2103[var539]);
                                    field319.method2400((int) var540);
                                }
                                field319.method2357(field319.field1972 - var536);
                            }
                            if (field367 > 0) {
                                field367--;
                            }
                            if (class138.field2096[96] || class138.field2096[97] || class138.field2096[98] || class138.field2096[99]) {
                                field334 = true;
                            }
                            if (field334 && field367 <= 0) {
                                field367 = 20;
                                field334 = false;
                                field319.method2596(52);
                                field319.method2464(field360);
                                field319.method2464(field522);
                            }
                            if (Statics.field1865 && !field340) {
                                field340 = true;
                                field319.method2596(147);
                                field319.method2364(1);
                            }
                            if (!Statics.field1865 && field340) {
                                field340 = false;
                                field319.method2596(147);
                                field319.method2364(0);
                            }
                            if (Statics.field656 != field356) {
                                field356 = Statics.field656;
                                method153(Statics.field656);
                            }
                            if (field284 == 30) {
                                for (class17 var542 = (class17) field408.method3540(); var542 != null; var542 = (class17) field408.method3533()) {
                                    if (var542.field234 > 0) {
                                        var542.field234--;
                                    }
                                    if (var542.field234 != 0) {
                                        if (var542.field233 > 0) {
                                            var542.field233--;
                                        }
                                        if (var542.field233 == 0 && var542.field225 >= 1 && var542.field226 >= 1 && var542.field225 <= 102 && var542.field226 <= 102 && (var542.field230 < 0 || class6.method3443(var542.field230, var542.field232))) {
                                            method980(var542.field228, var542.field223, var542.field225, var542.field226, var542.field230, var542.field231, var542.field232);
                                            var542.field233 = -1;
                                            if (var542.field237 == var542.field230 && var542.field237 == -1) {
                                                var542.method3639();
                                            } else if (var542.field237 == var542.field230 && var542.field235 == var542.field231 && var542.field232 == var542.field229) {
                                                var542.method3639();
                                            }
                                        }
                                    } else if (var542.field237 < 0 || class6.method3443(var542.field237, var542.field229)) {
                                        method980(var542.field228, var542.field223, var542.field225, var542.field226, var542.field237, var542.field235, var542.field229);
                                        var542.method3639();
                                    }
                                }
                                method181();
                                field324++;
                                if (field324 <= 750) {
                                    int var543 = class33.field738;
                                    int[] var544 = class33.field739;
                                    for (int var545 = 0; var545 < var543; var545++) {
                                        class3 var546 = field397[var544[var545]];
                                        if (var546 != null) {
                                            method2953(var546, 1);
                                        }
                                    }
                                    method186();
                                    int[] var547 = class33.field739;
                                    for (int var548 = 0; var548 < class33.field738; var548++) {
                                        class3 var549 = field397[var547[var548]];
                                        if (var549 != null && var549.field811 > 0) {
                                            var549.field811--;
                                            if (var549.field811 == 0) {
                                                var549.field808 = null;
                                            }
                                        }
                                    }
                                    for (int var550 = 0; var550 < field315; var550++) {
                                        int var551 = field460[var550];
                                        class35 var552 = field518[var551];
                                        if (var552 != null && var552.field811 > 0) {
                                            var552.field811--;
                                            if (var552.field811 == 0) {
                                                var552.field808 = null;
                                            }
                                        }
                                    }
                                    field352++;
                                    if (field387 != 0) {
                                        field543 += 20;
                                        if (field543 >= 400) {
                                            field387 = 0;
                                        }
                                    }
                                    if (Statics.field218 != null) {
                                        field388++;
                                        if (field388 >= 15) {
                                            method29(Statics.field218);
                                            Statics.field218 = null;
                                        }
                                    }
                                    class174 var553 = Statics.field2171;
                                    class174 var554 = Statics.field15;
                                    Statics.field2171 = null;
                                    Statics.field15 = null;
                                    field296 = null;
                                    field470 = false;
                                    field452 = false;
                                    field411 = 0;
                                    while (true) {
                                        while (class138.method30() && field411 < 128) {
                                            if (field441 >= 2 && class138.field2096[82] && Statics.field3057 == 66) {
                                                String var555 = class12.method3087();
                                                Statics.field2027.setContents(new StringSelection(var555), (ClipboardOwner) null);
                                            } else {
                                                field499[field411] = Statics.field3057;
                                                field498[field411] = Statics.field2082;
                                                field411++;
                                            }
                                        }
                                        if (field434 != -1) {
                                            method2278(field434, 0, 0, Statics.field103, Statics.field902, 0, 0);
                                        }
                                        field459++;
                                        while (true) {
                                            class1 var556;
                                            class174 var557;
                                            class174 var558;
                                            do {
                                                var556 = (class1) field551.method3538();
                                                if (var556 == null) {
                                                    while (true) {
                                                        class1 var559;
                                                        class174 var560;
                                                        class174 var561;
                                                        do {
                                                            var559 = (class1) field341.method3538();
                                                            if (var559 == null) {
                                                                while (true) {
                                                                    class1 var562;
                                                                    class174 var563;
                                                                    class174 var564;
                                                                    do {
                                                                        var562 = (class1) field473.method3538();
                                                                        if (var562 == null) {
                                                                            boolean var565 = false;
                                                                            while (!var565) {
                                                                                var565 = true;
                                                                                for (int var566 = 0; var566 < field416 - 1; var566++) {
                                                                                    if (field419[var566] < 1000 && field419[var566 + 1] > 1000) {
                                                                                        String var567 = field291[var566];
                                                                                        field291[var566] = field291[var566 + 1];
                                                                                        field291[var566 + 1] = var567;
                                                                                        String var568 = field421[var566];
                                                                                        field421[var566] = field421[var566 + 1];
                                                                                        field421[var566 + 1] = var568;
                                                                                        int var569 = field419[var566];
                                                                                        field419[var566] = field419[var566 + 1];
                                                                                        field419[var566 + 1] = var569;
                                                                                        int var570 = field386[var566];
                                                                                        field386[var566] = field386[var566 + 1];
                                                                                        field386[var566 + 1] = var570;
                                                                                        int var571 = field418[var566];
                                                                                        field418[var566] = field418[var566 + 1];
                                                                                        field418[var566 + 1] = var571;
                                                                                        int var572 = field503[var566];
                                                                                        field503[var566] = field503[var566 + 1];
                                                                                        field503[var566 + 1] = var572;
                                                                                        var565 = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (Statics.field773 == null && field447 == null) {
                                                                                int var573 = class141.field2135;
                                                                                if (field454) {
                                                                                    if (var573 != 1 && (Statics.field2117 || var573 != 4)) {
                                                                                        int var574 = class141.field2129;
                                                                                        int var575 = class141.field2127;
                                                                                        if (var574 < Statics.field2666 - 10 || var574 > Statics.field2666 + Statics.field257 + 10 || var575 < Statics.field664 - 10 || var575 > Statics.field664 + Statics.field1586 + 10) {
                                                                                            field454 = false;
                                                                                            method876(Statics.field2666, Statics.field664, Statics.field257, Statics.field1586);
                                                                                        }
                                                                                    }
                                                                                    if (var573 == 1 || !Statics.field2117 && var573 == 4) {
                                                                                        int var576 = Statics.field2666;
                                                                                        int var577 = Statics.field664;
                                                                                        int var578 = Statics.field257;
                                                                                        int var579 = class141.field2136;
                                                                                        int var580 = class141.field2137;
                                                                                        int var581 = -1;
                                                                                        for (int var582 = 0; var582 < field416; var582++) {
                                                                                            int var583 = (field416 - 1 - var582) * 15 + var577 + 31;
                                                                                            if (var579 > var576 && var579 < var576 + var578 && var580 > var583 - 13 && var580 < var583 + 3) {
                                                                                                var581 = var582;
                                                                                            }
                                                                                        }
                                                                                        if (var581 != -1) {
                                                                                            method1972(var581);
                                                                                        }
                                                                                        field454 = false;
                                                                                        method876(Statics.field2666, Statics.field664, Statics.field257, Statics.field1586);
                                                                                    }
                                                                                } else {
                                                                                    label4400: {
                                                                                        if ((var573 == 1 || !Statics.field2117 && var573 == 4) && field416 > 0) {
                                                                                            int var584 = field419[field416 - 1];
                                                                                            if (var584 == 39 || var584 == 40 || var584 == 41 || var584 == 42 || var584 == 43 || var584 == 33 || var584 == 34 || var584 == 35 || var584 == 36 || var584 == 37 || var584 == 38 || var584 == 1005) {
                                                                                                label4368: {
                                                                                                    int var585 = field386[field416 - 1];
                                                                                                    int var586 = field418[field416 - 1];
                                                                                                    class174 var587 = class174.method2807(var586);
                                                                                                    if (!class179.method1(method2898(var587))) {
                                                                                                        int var588 = method2898(var587);
                                                                                                        boolean var589 = (var588 >> 29 & 0x1) != 0;
                                                                                                        if (!var589) {
                                                                                                            break label4368;
                                                                                                        }
                                                                                                    }
                                                                                                    if (Statics.field773 != null && !field394 && field328 != 1 && !method2932(field416 - 1) && field416 > 0) {
                                                                                                        method103(field391, field358);
                                                                                                    }
                                                                                                    field394 = false;
                                                                                                    field395 = 0;
                                                                                                    if (Statics.field773 != null) {
                                                                                                        method29(Statics.field773);
                                                                                                    }
                                                                                                    Statics.field773 = class174.method2807(var586);
                                                                                                    field390 = var585;
                                                                                                    field391 = class141.field2136;
                                                                                                    field358 = class141.field2137;
                                                                                                    if (field416 > 0) {
                                                                                                        int var590 = field416 - 1;
                                                                                                        Statics.field2926 = new class31();
                                                                                                        Statics.field2926.field685 = field386[var590];
                                                                                                        Statics.field2926.field690 = field418[var590];
                                                                                                        Statics.field2926.field692 = field419[var590];
                                                                                                        Statics.field2926.field687 = field503[var590];
                                                                                                        Statics.field2926.field688 = field421[var590];
                                                                                                    }
                                                                                                    method29(Statics.field773);
                                                                                                    break label4400;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ((var573 == 1 || !Statics.field2117 && var573 == 4) && (field328 == 1 && field416 > 2 || method2932(field416 - 1))) {
                                                                                            var573 = 2;
                                                                                        }
                                                                                        if ((var573 == 1 || !Statics.field2117 && var573 == 4) && field416 > 0) {
                                                                                            method1972(field416 - 1);
                                                                                        }
                                                                                        if (var573 == 2 && field416 > 0) {
                                                                                            method728(class141.field2136, class141.field2137);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field447 != null) {
                                                                                method29(field447);
                                                                                Statics.field1660++;
                                                                                if (field470 && field452) {
                                                                                    int var591 = class141.field2129;
                                                                                    int var592 = class141.field2127;
                                                                                    int var593 = var591 - field449;
                                                                                    int var594 = var592 - field450;
                                                                                    if (var593 < field453) {
                                                                                        var593 = field453;
                                                                                    }
                                                                                    if (field447.field2841 + var593 > field453 + field448.field2841) {
                                                                                        var593 = field453 + field448.field2841 - field447.field2841;
                                                                                    }
                                                                                    if (var594 < field300) {
                                                                                        var594 = field300;
                                                                                    }
                                                                                    if (field447.field2747 + var594 > field300 + field448.field2747) {
                                                                                        var594 = field300 + field448.field2747 - field447.field2747;
                                                                                    }
                                                                                    int var595 = var593 - field456;
                                                                                    int var596 = var594 - field457;
                                                                                    int var597 = field447.field2858;
                                                                                    if (Statics.field1660 > field447.field2822 && (var595 > var597 || var595 < -var597 || var596 > var597 || var596 < -var597)) {
                                                                                        field458 = true;
                                                                                    }
                                                                                    int var598 = field448.field2766 + (var593 - field453);
                                                                                    int var599 = field448.field2767 + (var594 - field300);
                                                                                    if (field447.field2805 != null && field458) {
                                                                                        class1 var600 = new class1();
                                                                                        var600.field19 = field447;
                                                                                        var600.field4 = var598;
                                                                                        var600.field5 = var599;
                                                                                        var600.field17 = field447.field2805;
                                                                                        class37.method736(var600);
                                                                                    }
                                                                                    if (class141.field2128 == 0) {
                                                                                        if (field458) {
                                                                                            if (field447.field2835 != null) {
                                                                                                class1 var601 = new class1();
                                                                                                var601.field19 = field447;
                                                                                                var601.field4 = var598;
                                                                                                var601.field5 = var599;
                                                                                                var601.field7 = field296;
                                                                                                var601.field17 = field447.field2835;
                                                                                                class37.method736(var601);
                                                                                            }
                                                                                            if (field296 != null) {
                                                                                                class174 var602 = field447;
                                                                                                int var603 = class179.method3144(method2898(var602));
                                                                                                class174 var604;
                                                                                                if (var603 == 0) {
                                                                                                    var604 = null;
                                                                                                } else {
                                                                                                    int var605 = 0;
                                                                                                    while (true) {
                                                                                                        if (var605 >= var603) {
                                                                                                            var604 = var602;
                                                                                                            break;
                                                                                                        }
                                                                                                        var602 = class174.method2807(var602.field2764);
                                                                                                        if (var602 == null) {
                                                                                                            var604 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var605++;
                                                                                                    }
                                                                                                }
                                                                                                if (var604 != null) {
                                                                                                    field319.method2596(212);
                                                                                                    field319.method2347(field296.field2774);
                                                                                                    field319.method2464(field447.field2799);
                                                                                                    field319.method2394(field447.field2774);
                                                                                                    field319.method2402(field296.field2775);
                                                                                                    field319.method2401(field447.field2775);
                                                                                                    field319.method2464(field296.field2799);
                                                                                                }
                                                                                            }
                                                                                        } else if ((field328 == 1 || method2932(field416 - 1)) && field416 > 2) {
                                                                                            method728(field456 + field449, field457 + field450);
                                                                                        } else if (field416 > 0) {
                                                                                            method103(field456 + field449, field457 + field450);
                                                                                        }
                                                                                        field447 = null;
                                                                                    }
                                                                                } else if (Statics.field1660 > 1) {
                                                                                    field447 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field773 != null) {
                                                                                method29(Statics.field773);
                                                                                field395++;
                                                                                if (class141.field2128 == 0) {
                                                                                    if (field394) {
                                                                                        if (Statics.field773 == Statics.field2658 && field393 != field390) {
                                                                                            class174 var606 = Statics.field773;
                                                                                            byte var607 = 0;
                                                                                            if (field437 == 1 && var606.field2749 == 206) {
                                                                                                var607 = 1;
                                                                                            }
                                                                                            if (var606.field2863[field393] <= 0) {
                                                                                                var607 = 0;
                                                                                            }
                                                                                            int var608 = method2898(var606);
                                                                                            boolean var609 = (var608 >> 29 & 0x1) != 0;
                                                                                            if (var609) {
                                                                                                int var610 = field390;
                                                                                                int var611 = field393;
                                                                                                var606.field2863[var611] = var606.field2863[var610];
                                                                                                var606.field2864[var611] = var606.field2864[var610];
                                                                                                var606.field2863[var610] = -1;
                                                                                                var606.field2864[var610] = 0;
                                                                                            } else if (var607 == 1) {
                                                                                                int var612 = field390;
                                                                                                int var613 = field393;
                                                                                                while (var612 != var613) {
                                                                                                    if (var612 > var613) {
                                                                                                        var606.method3150(var612 - 1, var612);
                                                                                                        var612--;
                                                                                                    } else if (var612 < var613) {
                                                                                                        var606.method3150(var612 + 1, var612);
                                                                                                        var612++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var606.method3150(field393, field390);
                                                                                            }
                                                                                            field319.method2596(155);
                                                                                            field319.method2503(field390);
                                                                                            field319.method2347(field393);
                                                                                            field319.method2462(var607);
                                                                                            field319.method2402(Statics.field773.field2775);
                                                                                        }
                                                                                    } else if ((field328 == 1 || method2932(field416 - 1)) && field416 > 2) {
                                                                                        method728(field391, field358);
                                                                                    } else if (field416 > 0) {
                                                                                        method103(field391, field358);
                                                                                    }
                                                                                    field388 = 10;
                                                                                    class141.field2135 = 0;
                                                                                    Statics.field773 = null;
                                                                                } else if (field395 >= 5 && (class141.field2129 > field391 + 5 || class141.field2129 < field391 - 5 || class141.field2127 > field358 + 5 || class141.field2127 < field358 - 5)) {
                                                                                    field394 = true;
                                                                                }
                                                                            }
                                                                            if (class87.field1473 != -1) {
                                                                                int var614 = class87.field1473;
                                                                                int var615 = class87.field1491;
                                                                                field319.method2596(187);
                                                                                field319.method2364(5);
                                                                                field319.method2347(Statics.field3015 + var614);
                                                                                field319.method2458(class138.field2096[82] ? (class138.field2096[81] ? 2 : 1) : 0);
                                                                                field319.method2394(Statics.field13 + var615);
                                                                                class87.field1473 = -1;
                                                                                field384 = class141.field2136;
                                                                                field385 = class141.field2137;
                                                                                field387 = 1;
                                                                                field543 = 0;
                                                                                field508 = var614;
                                                                                field509 = var615;
                                                                            }
                                                                            if (Statics.field2171 != var553) {
                                                                                if (var553 != null) {
                                                                                    method29(var553);
                                                                                }
                                                                                if (Statics.field2171 != null) {
                                                                                    method29(Statics.field2171);
                                                                                }
                                                                            }
                                                                            if (Statics.field15 != var554 && field426 == field425) {
                                                                                if (var554 != null) {
                                                                                    method29(var554);
                                                                                }
                                                                                if (Statics.field15 != null) {
                                                                                    method29(Statics.field15);
                                                                                }
                                                                            }
                                                                            if (Statics.field15 == null) {
                                                                                if (field425 > 0) {
                                                                                    field425--;
                                                                                }
                                                                            } else if (field425 < field426) {
                                                                                field425++;
                                                                                if (field426 == field425) {
                                                                                    method29(Statics.field15);
                                                                                }
                                                                            }
                                                                            int var616 = field361 + Statics.field1054.field817;
                                                                            int var617 = field342 + Statics.field1054.field841;
                                                                            if (Statics.field569 - var616 < -500 || Statics.field569 - var616 > 500 || Statics.field635 - var617 < -500 || Statics.field635 - var617 > 500) {
                                                                                Statics.field569 = var616;
                                                                                Statics.field635 = var617;
                                                                            }
                                                                            if (Statics.field569 != var616) {
                                                                                Statics.field569 += (var616 - Statics.field569) / 16;
                                                                            }
                                                                            if (Statics.field635 != var617) {
                                                                                Statics.field635 += (var617 - Statics.field635) / 16;
                                                                            }
                                                                            if (class141.field2128 == 4 && Statics.field2117) {
                                                                                int var618 = class141.field2127 - field472;
                                                                                field400 = var618 * 2;
                                                                                field472 = var618 == -1 || var618 == 1 ? class141.field2127 : (field472 + class141.field2127) / 2;
                                                                                int var619 = field364 - class141.field2129;
                                                                                field362 = var619 * 2;
                                                                                field364 = var619 == -1 || var619 == 1 ? class141.field2129 : (field364 + class141.field2129) / 2;
                                                                            } else {
                                                                                if (class138.field2096[96]) {
                                                                                    field362 += (-24 - field362) / 2;
                                                                                } else if (class138.field2096[97]) {
                                                                                    field362 += (24 - field362) / 2;
                                                                                } else {
                                                                                    field362 /= 2;
                                                                                }
                                                                                if (class138.field2096[98]) {
                                                                                    field400 += (12 - field400) / 2;
                                                                                } else if (class138.field2096[99]) {
                                                                                    field400 += (-12 - field400) / 2;
                                                                                } else {
                                                                                    field400 /= 2;
                                                                                }
                                                                                field472 = class141.field2127;
                                                                                field364 = class141.field2129;
                                                                            }
                                                                            field522 = field362 / 2 + field522 & 0x7FF;
                                                                            field360 += field400 / 2;
                                                                            if (field360 < 128) {
                                                                                field360 = 128;
                                                                            }
                                                                            if (field360 > 383) {
                                                                                field360 = 383;
                                                                            }
                                                                            int var620 = Statics.field569 >> 7;
                                                                            int var621 = Statics.field635 >> 7;
                                                                            int var622 = method2909(Statics.field569, Statics.field635, Statics.field656);
                                                                            int var623 = 0;
                                                                            if (var620 > 3 && var621 > 3 && var620 < 100 && var621 < 100) {
                                                                                for (int var624 = var620 - 4; var624 <= var620 + 4; var624++) {
                                                                                    for (int var625 = var621 - 4; var625 <= var621 + 4; var625++) {
                                                                                        int var626 = Statics.field656;
                                                                                        if (var626 < 3 && (class6.field85[1][var624][var625] & 0x2) == 2) {
                                                                                            var626++;
                                                                                        }
                                                                                        int var627 = var622 - class6.field92[var626][var624][var625];
                                                                                        if (var627 > var623) {
                                                                                            var623 = var627;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var628 = var623 * 192;
                                                                            if (var628 > 98048) {
                                                                                var628 = 98048;
                                                                            }
                                                                            if (var628 < 32768) {
                                                                                var628 = 32768;
                                                                            }
                                                                            if (var628 > field369) {
                                                                                field369 += (var628 - field369) / 24;
                                                                            } else if (var628 < field369) {
                                                                                field369 += (var628 - field369) / 80;
                                                                            }
                                                                            if (field500) {
                                                                                method1583();
                                                                            }
                                                                            for (int var629 = 0; var629 < 5; var629++) {
                                                                                var10002 = field527[var629]++;
                                                                            }
                                                                            Statics.field652.method207();
                                                                            int var630 = ++class141.field2124 - 1;
                                                                            int var632 = class138.method107();
                                                                            if (var630 > 15000 && var632 > 15000) {
                                                                                field306 = 250;
                                                                                class141.field2124 = 14500;
                                                                                field319.method2596(45);
                                                                            }
                                                                            field346++;
                                                                            if (field346 > 500) {
                                                                                field346 = 0;
                                                                                int var633 = (int) (Math.random() * 8.0D);
                                                                                if ((var633 & 0x1) == 1) {
                                                                                    field361 += field465;
                                                                                }
                                                                                if ((var633 & 0x2) == 2) {
                                                                                    field342 += field343;
                                                                                }
                                                                                if ((var633 & 0x4) == 4) {
                                                                                    field344 += field345;
                                                                                }
                                                                            }
                                                                            if (field361 < -50) {
                                                                                field465 = 2;
                                                                            }
                                                                            if (field361 > 50) {
                                                                                field465 = -2;
                                                                            }
                                                                            if (field342 < -55) {
                                                                                field343 = 2;
                                                                            }
                                                                            if (field342 > 55) {
                                                                                field343 = -2;
                                                                            }
                                                                            if (field344 < -40) {
                                                                                field345 = 1;
                                                                            }
                                                                            if (field344 > 40) {
                                                                                field345 = -1;
                                                                            }
                                                                            field298++;
                                                                            if (field298 > 500) {
                                                                                field298 = 0;
                                                                                int var634 = (int) (Math.random() * 8.0D);
                                                                                if ((var634 & 0x1) == 1) {
                                                                                    field347 += field348;
                                                                                }
                                                                                if ((var634 & 0x2) == 2) {
                                                                                    field480 += field350;
                                                                                }
                                                                            }
                                                                            if (field347 < -60) {
                                                                                field348 = 2;
                                                                            }
                                                                            if (field347 > 60) {
                                                                                field348 = -2;
                                                                            }
                                                                            if (field480 < -20) {
                                                                                field350 = 1;
                                                                            }
                                                                            if (field480 > 10) {
                                                                                field350 = -1;
                                                                            }
                                                                            for (class39 var635 = (class39) field535.method3487(); var635 != null; var635 = (class39) field535.method3489()) {
                                                                                if ((long) var635.field859 < class116.method1579() / 1000L - 5L) {
                                                                                    if (var635.field860 > 0) {
                                                                                        class12.method108(5, "", var635.field858 + class158.field2324);
                                                                                    }
                                                                                    if (var635.field860 == 0) {
                                                                                        class12.method108(5, "", var635.field858 + class158.field2445);
                                                                                    }
                                                                                    var635.method3636();
                                                                                }
                                                                            }
                                                                            field292++;
                                                                            if (field292 > 50) {
                                                                                field319.method2596(200);
                                                                            }
                                                                            try {
                                                                                if (Statics.field1661 != null && field319.field1972 > 0) {
                                                                                    Statics.field1661.method2814(field319.field1974, 0, field319.field1972);
                                                                                    field319.field1972 = 0;
                                                                                    field292 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var643) {
                                                                                if (field306 > 0) {
                                                                                    method576();
                                                                                } else {
                                                                                    method159(40);
                                                                                    Statics.field258 = Statics.field1661;
                                                                                    Statics.field1661 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var563 = var562.field19;
                                                                        if (var563.field2799 < 0) {
                                                                            break;
                                                                        }
                                                                        var564 = class174.method2807(var563.field2764);
                                                                    } while (var564 == null || var564.field2869 == null || var563.field2799 >= var564.field2869.length || var564.field2869[var563.field2799] != var563);
                                                                    class37.method736(var562);
                                                                }
                                                            }
                                                            var560 = var559.field19;
                                                            if (var560.field2799 < 0) {
                                                                break;
                                                            }
                                                            var561 = class174.method2807(var560.field2764);
                                                        } while (var561 == null || var561.field2869 == null || var560.field2799 >= var561.field2869.length || var561.field2869[var560.field2799] != var560);
                                                        class37.method736(var559);
                                                    }
                                                }
                                                var557 = var556.field19;
                                                if (var557.field2799 < 0) {
                                                    break;
                                                }
                                                var558 = class174.method2807(var557.field2764);
                                            } while (var558 == null || var558.field2869 == null || var557.field2799 >= var558.field2869.length || var558.field2869[var557.field2799] != var557);
                                            class37.method736(var556);
                                        }
                                    }
                                } else if (field306 > 0) {
                                    method576();
                                } else {
                                    method159(40);
                                    Statics.field258 = Statics.field1661;
                                    Statics.field1661 = null;
                                }
                            }
                        }
                    }
                } else if (field284 == 40 || field284 == 45) {
                    method713();
                }
                return;
            }
            var2.field2697.method3094(var2.field2700, (int) var2.field3123, var2.field2694, false);
        }
    }

    @ObfuscatedName("client.i(I)V")
    public final void method247() {
        boolean var1 = class184.method701();
        if (var1 && field513 && Statics.field245 != null) {
            Statics.field245.method1168();
        }
        if (field284 == 10 || field284 == 20 || field284 == 30) {
            if (field487 != 0L && class116.method1579() > field487) {
                int var2 = field488 ? 2 : 1;
                field487 = 0L;
                if (var2 >= 2) {
                    field488 = true;
                } else {
                    field488 = false;
                }
                method920();
                if (field284 >= 25) {
                    field319.method2596(98);
                    class123 var3 = field319;
                    int var4 = field488 ? 2 : 1;
                    var3.method2364(var4);
                    field319.method2347(Statics.field103);
                    field319.method2347(Statics.field902);
                }
                field2184 = true;
            } else if (field2190) {
                Canvas var5 = Statics.field67;
                var5.removeKeyListener(class138.field2090);
                var5.removeFocusListener(class138.field2090);
                class138.field2100 = -1;
                Canvas var6 = Statics.field67;
                var6.removeMouseListener(class141.field2125);
                var6.removeMouseMotionListener(class141.field2125);
                var6.removeFocusListener(class141.field2125);
                class141.field2131 = 0;
                if (Statics.field2727 != null) {
                    Statics.field2727.method2654(Statics.field67);
                }
                Statics.field273.method2831();
                Statics.field67.setBackground(Color.black);
                Canvas var7 = Statics.field67;
                var7.setFocusTraversalKeysEnabled(false);
                var7.addKeyListener(class138.field2090);
                var7.addFocusListener(class138.field2090);
                class141.method643(Statics.field67);
                if (Statics.field2727 != null) {
                    Statics.field2727.method2656(Statics.field67);
                }
                if (field434 != -1) {
                    method1476(false);
                }
                field2186 = true;
            }
        }
        Dimension var8 = this.method2833();
        if (Statics.field2029 != var8.width || Statics.field810 != var8.height || field2186) {
            method920();
            field487 = class116.method1579() + 500L;
            field2186 = false;
        }
        boolean var9 = false;
        if (field2184) {
            field2184 = false;
            var9 = true;
            for (int var10 = 0; var10 < 100; var10++) {
                field479[var10] = true;
            }
        }
        if (var9) {
            method562();
        }
        if (field284 == 0) {
            int var11 = class32.field731;
            String var12 = class32.field712;
            Color var13 = null;
            try {
                Graphics var14 = Statics.field67.getGraphics();
                if (Statics.field2010 == null) {
                    Statics.field2010 = new Font("Helvetica", 1, 13);
                    Statics.field1373 = Statics.field67.getFontMetrics(Statics.field2010);
                }
                if (var9) {
                    var14.setColor(Color.black);
                    var14.fillRect(0, 0, Statics.field103, Statics.field902);
                }
                if (var13 == null) {
                    var13 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field2157 == null) {
                        Statics.field2157 = Statics.field67.createImage(304, 34);
                    }
                    Graphics var15 = Statics.field2157.getGraphics();
                    var15.setColor(var13);
                    var15.drawRect(0, 0, 303, 33);
                    var15.fillRect(2, 2, var11 * 3, 30);
                    var15.setColor(Color.black);
                    var15.drawRect(1, 1, 301, 31);
                    var15.fillRect(var11 * 3 + 2, 2, 300 - var11 * 3, 30);
                    var15.setFont(Statics.field2010);
                    var15.setColor(Color.white);
                    var15.drawString(var12, (304 - Statics.field1373.stringWidth(var12)) / 2, 22);
                    var14.drawImage(Statics.field2157, Statics.field103 / 2 - 152, Statics.field902 / 2 - 18, (ImageObserver) null);
                } catch (Exception var47) {
                    int var17 = Statics.field103 / 2 - 152;
                    int var18 = Statics.field902 / 2 - 18;
                    var14.setColor(var13);
                    var14.drawRect(var17, var18, 303, 33);
                    var14.fillRect(var17 + 2, var18 + 2, var11 * 3, 30);
                    var14.setColor(Color.black);
                    var14.drawRect(var17 + 1, var18 + 1, 301, 31);
                    var14.fillRect(var11 * 3 + var17 + 2, var18 + 2, 300 - var11 * 3, 30);
                    var14.setFont(Statics.field2010);
                    var14.setColor(Color.white);
                    var14.drawString(var12, var17 + (304 - Statics.field1373.stringWidth(var12)) / 2, var18 + 22);
                }
            } catch (Exception var48) {
                Statics.field67.repaint();
            }
        } else if (field284 == 5) {
            class32.method2623(Statics.field1607, Statics.field3045, Statics.field798, var9);
        } else if (field284 == 10 || field284 == 11) {
            class32.method2623(Statics.field1607, Statics.field3045, Statics.field798, var9);
        } else if (field284 == 20) {
            class32.method2623(Statics.field1607, Statics.field3045, Statics.field798, var9);
        } else if (field284 == 25) {
            if (field335 == 1) {
                if (field331 > field332) {
                    field332 = field331;
                }
                int var20 = (field332 * 50 - field331 * 50) / field332;
                method3141(class158.field2309 + class2.field26 + class2.field20 + var20 + "%" + class2.field32, false);
            } else if (field335 == 2) {
                if (field333 > field486) {
                    field486 = field333;
                }
                int var21 = (field486 * 50 - field333 * 50) / field486 + 50;
                method3141(class158.field2309 + class2.field26 + class2.field20 + var21 + "%" + class2.field32, false);
            } else {
                method3141(class158.field2309, false);
            }
        } else if (field284 == 30) {
            if (field434 != -1) {
                method106(field434);
            }
            for (int var22 = 0; var22 < field477; var22++) {
                if (field479[var22]) {
                    field392[var22] = true;
                }
                field481[var22] = field479[var22];
                field479[var22] = false;
            }
            field478 = field286;
            field317 = -1;
            field443 = -1;
            Statics.field2658 = null;
            if (field434 != -1) {
                field477 = 0;
                method1066(field434, 0, 0, Statics.field103, Statics.field902, 0, 0, -1);
            }
            class80.method1675();
            if (field454) {
                method2768();
            } else if (field317 != -1) {
                int var23 = field317;
                int var24 = field443;
                if (field416 >= 2 || field281 != 0 || field512) {
                    String var25;
                    if (field281 == 1 && field416 < 2) {
                        var25 = class158.field2512 + class158.field2457 + field428 + " " + class2.field25;
                    } else if (field512 && field416 < 2) {
                        var25 = field363 + class158.field2457 + field314 + " " + class2.field25;
                    } else {
                        var25 = method2064(field416 - 1);
                    }
                    if (field416 > 2) {
                        var25 = var25 + class2.method3724(16777215) + " " + '/' + " " + (field416 - 2) + class158.field2335;
                    }
                    Statics.field1607.method3768(var25, var23 + 4, var24 + 15, 16777215, 0, field286 / 1000);
                }
            }
            if (field339 == 3) {
                for (int var26 = 0; var26 < field477; var26++) {
                    if (field481[var26]) {
                        class80.method1681(field322[var26], field316[var26], field484[var26], field552[var26], 16711935, 128);
                    } else if (field392[var26]) {
                        class80.method1681(field322[var26], field316[var26], field484[var26], field552[var26], 16711680, 128);
                    }
                }
            }
            int var27 = Statics.field656;
            int var28 = Statics.field1054.field817;
            int var29 = Statics.field1054.field841;
            int var30 = field352;
            for (class24 var31 = (class24) class24.field594.method3540(); var31 != null; var31 = (class24) class24.field594.method3533()) {
                if (var31.field603 != -1 || var31.field600 != null) {
                    int var32 = 0;
                    if (var28 > var31.field589) {
                        var32 += var28 - var31.field589;
                    } else if (var28 < var31.field585) {
                        var32 += var31.field585 - var28;
                    }
                    if (var29 > var31.field596) {
                        var32 += var29 - var31.field596;
                    } else if (var29 < var31.field588) {
                        var32 += var31.field588 - var29;
                    }
                    if (var32 - 64 > var31.field591 || field515 == 0 || var31.field586 != var27) {
                        if (var31.field593 != null) {
                            Statics.field2067.method1120(var31.field593);
                            var31.field593 = null;
                        }
                        if (var31.field598 != null) {
                            Statics.field2067.method1120(var31.field598);
                            var31.field598 = null;
                        }
                    } else {
                        var32 -= 64;
                        if (var32 < 0) {
                            var32 = 0;
                        }
                        int var33 = field515 * (var31.field591 - var32) / var31.field591;
                        class59 var10000;
                        if (var31.field593 != null) {
                            var31.field593.method1268(var33);
                        } else if (var31.field603 >= 0) {
                            var10000 = (class59) null;
                            class59 var34 = class59.method1201(Statics.field1742, var31.field603, 0);
                            if (var34 != null) {
                                class63 var35 = var34.method1210().method1241(Statics.field1887);
                                class65 var36 = class65.method1277(var35, 100, var33);
                                var36.method1267(-1);
                                Statics.field2067.method1133(var36);
                                var31.field593 = var36;
                            }
                        }
                        if (var31.field598 != null) {
                            var31.field598.method1268(var33);
                            if (!var31.field598.method3638()) {
                                var31.field598 = null;
                            }
                        } else if (var31.field600 != null && (var31.field592 -= var30) <= 0) {
                            int var37 = (int) (Math.random() * (double) var31.field600.length);
                            var10000 = (class59) null;
                            class59 var38 = class59.method1201(Statics.field1742, var31.field600[var37], 0);
                            if (var38 != null) {
                                class63 var39 = var38.method1210().method1241(Statics.field1887);
                                class65 var40 = class65.method1277(var39, 100, var33);
                                var40.method1267(0);
                                Statics.field2067.method1133(var40);
                                var31.field598 = var40;
                                var31.field592 = var31.field597 + (int) (Math.random() * (double) (var31.field587 - var31.field597));
                            }
                        }
                    }
                }
            }
            field352 = 0;
        } else if (field284 == 40) {
            method3141(class158.field2310 + class2.field26 + class158.field2311, false);
        } else if (field284 == 45) {
            method3141(class158.field2455, false);
        }
        if (field284 == 30 && field339 == 0 && !var9) {
            try {
                Graphics var41 = Statics.field67.getGraphics();
                for (int var42 = 0; var42 < field477; var42++) {
                    if (field392[var42]) {
                        Statics.field1364.method1505(var41, field322[var42], field316[var42], field484[var42], field552[var42]);
                        field392[var42] = false;
                    }
                }
            } catch (Exception var50) {
                Statics.field67.repaint();
            }
        } else if (field284 > 0) {
            try {
                Graphics var44 = Statics.field67.getGraphics();
                Statics.field1364.method1515(var44, 0, 0);
                for (int var45 = 0; var45 < field477; var45++) {
                    field392[var45] = false;
                }
            } catch (Exception var49) {
                Statics.field67.repaint();
            }
        }
    }

    @ObfuscatedName("client.c(I)V")
    public final void method268() {
        if (Statics.field652.method208()) {
            Statics.field652.method205();
        }
        if (Statics.field3216 != null) {
            Statics.field3216.field196 = false;
        }
        Statics.field3216 = null;
        if (Statics.field1661 != null) {
            Statics.field1661.method2811();
            Statics.field1661 = null;
        }
        class138.method165();
        class141.method2296();
        Statics.field2727 = null;
        if (Statics.field245 != null) {
            Statics.field245.method1163();
        }
        if (Statics.field204 != null) {
            Statics.field204.method1163();
        }
        if (Statics.field3217 != null) {
            Statics.field3217.method2811();
        }
        class171.method2910();
        class150.method2934();
    }

    @ObfuscatedName("d.n(II)V")
    public static void method159(int arg0) {
        if (field284 == arg0) {
            return;
        }
        if (field284 == 0) {
            Statics.field2157 = null;
            Statics.field2010 = null;
            Statics.field1373 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field309 = 0;
            field294 = 0;
            field311 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field258 != null) {
            Statics.field258.method2811();
            Statics.field258 = null;
        }
        if (field284 == 25) {
            field335 = 0;
            field331 = 0;
            field332 = 1;
            field333 = 0;
            field486 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method935(Statics.field67, Statics.field307, Statics.field2918, true, 0);
        } else if (arg0 == 20) {
            class32.method935(Statics.field67, Statics.field307, Statics.field2918, true, field284 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method935(Statics.field67, Statics.field307, Statics.field2918, false, 4);
        } else if (Statics.field700) {
            Statics.field732 = null;
            Statics.field706 = null;
            Statics.field698 = null;
            Statics.field3011 = null;
            Statics.field701 = null;
            Statics.field702 = null;
            Statics.field2112 = null;
            Statics.field1380 = null;
            Statics.field22 = null;
            Statics.field719 = null;
            Statics.field69 = null;
            Statics.field1360 = null;
            Statics.field643 = null;
            Statics.field163 = null;
            Statics.field648 = null;
            Statics.field3158 = null;
            Statics.field1413 = null;
            Statics.field770 = null;
            Statics.field1166 = null;
            Statics.field153 = null;
            Statics.field87 = null;
            Statics.field2908 = null;
            class184.field2960 = 1;
            Statics.field1371 = null;
            Statics.field2961 = -1;
            Statics.field2962 = -1;
            Statics.field2958 = 0;
            Statics.field2965 = false;
            Statics.field2964 = 2;
            class172.method70(true);
            Statics.field700 = false;
        }
        field284 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method249() {
        if (field284 == 1000) {
            return;
        }
        long var1 = class116.method1579();
        int var3 = (int) (var1 - Statics.field2025);
        Statics.field2025 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class172.field2711 += var3;
        boolean var4;
        if (class172.field2719 == 0 && class172.field2714 == 0 && class172.field2721 == 0 && class172.field2720 == 0) {
            var4 = true;
        } else if (Statics.field3217 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class172.field2711 > 30000) {
                        throw new IOException();
                    }
                    while (class172.field2714 < 20 && class172.field2720 > 0) {
                        class173 var5 = (class173) class172.field2729.method3501();
                        class120 var6 = new class120(4);
                        var6.method2364(1);
                        var6.method2348((int) var5.field3123);
                        Statics.field3217.method2814(var6.field1974, 0, 4);
                        class172.field2713.method3499(var5, var5.field3123);
                        class172.field2720--;
                        class172.field2714++;
                    }
                    while (class172.field2719 < 20 && class172.field2721 > 0) {
                        class173 var7 = (class173) class172.field2717.method3604();
                        class120 var8 = new class120(4);
                        var8.method2364(0);
                        var8.method2348((int) var7.field3123);
                        Statics.field3217.method2814(var8.field1974, 0, 4);
                        var7.method3619();
                        class172.field2718.method3499(var7, var7.field3123);
                        class172.field2721--;
                        class172.field2719++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3217.method2819();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class172.field2711 = 0;
                        byte var11 = 0;
                        if (Statics.field2640 == null) {
                            var11 = 8;
                        } else if (class172.field2710 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class172.field2712.field1972;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3217.method2813(class172.field2712.field1974, class172.field2712.field1972, var12);
                            if (class172.field2724 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class172.field2712.field1974[class172.field2712.field1972 + var13] ^= class172.field2724;
                                }
                            }
                            class172.field2712.field1972 += var12;
                            if (class172.field2712.field1972 < var11) {
                                break;
                            }
                            if (Statics.field2640 == null) {
                                class172.field2712.field1972 = 0;
                                int var14 = class172.field2712.method2361();
                                int var15 = class172.field2712.method2363();
                                int var16 = class172.field2712.method2361();
                                int var17 = class172.field2712.method2366();
                                long var18 = (long) ((var14 << 16) + var15);
                                class173 var20 = (class173) class172.field2713.method3498(var18);
                                Statics.field863 = true;
                                if (var20 == null) {
                                    var20 = (class173) class172.field2718.method3498(var18);
                                    Statics.field863 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2640 = var20;
                                Statics.field1575 = new class120(var17 + var21 + Statics.field2640.field2733);
                                Statics.field1575.method2364(var16);
                                Statics.field1575.method2349(var17);
                                class172.field2710 = 8;
                                class172.field2712.field1972 = 0;
                            } else if (class172.field2710 == 0) {
                                if (class172.field2712.field1974[0] == -1) {
                                    class172.field2710 = 1;
                                    class172.field2712.field1972 = 0;
                                } else {
                                    Statics.field2640 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1575.field1974.length - Statics.field2640.field2733;
                            int var23 = 512 - class172.field2710;
                            if (var23 > var22 - Statics.field1575.field1972) {
                                var23 = var22 - Statics.field1575.field1972;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3217.method2813(Statics.field1575.field1974, Statics.field1575.field1972, var23);
                            if (class172.field2724 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1575.field1974[Statics.field1575.field1972 + var24] ^= class172.field2724;
                                }
                            }
                            Statics.field1575.field1972 += var23;
                            class172.field2710 += var23;
                            if (Statics.field1575.field1972 == var22) {
                                if (Statics.field2640.field3123 == 16711935L) {
                                    Statics.field1362 = Statics.field1575;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class169 var26 = class172.field2723[var25];
                                        if (var26 != null) {
                                            Statics.field1362.field1972 = var25 * 8 + 5;
                                            int var27 = Statics.field1362.method2366();
                                            int var28 = Statics.field1362.method2366();
                                            var26.method3092(var27, var28);
                                        }
                                    }
                                } else {
                                    class172.field2722.reset();
                                    class172.field2722.update(Statics.field1575.field1974, 0, var22);
                                    int var29 = (int) class172.field2722.getValue();
                                    if (Statics.field2640.field2731 != var29) {
                                        try {
                                            Statics.field3217.method2811();
                                        } catch (Exception var35) {
                                        }
                                        class172.field2725++;
                                        Statics.field3217 = null;
                                        class172.field2724 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class172.field2725 = 0;
                                    class172.field2726 = 0;
                                    Statics.field2640.field2732.method3093((int) (Statics.field2640.field3123 & 0xFFFFL), Statics.field1575.field1974, (Statics.field2640.field3123 & 0xFF0000L) == 16711680L, Statics.field863);
                                }
                                Statics.field2640.method3639();
                                if (Statics.field863) {
                                    class172.field2714--;
                                } else {
                                    class172.field2719--;
                                }
                                class172.field2710 = 0;
                                Statics.field2640 = null;
                                Statics.field1575 = null;
                            } else {
                                if (class172.field2710 != 512) {
                                    break;
                                }
                                class172.field2710 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3217.method2811();
                } catch (Exception var34) {
                }
                class172.field2726++;
                Statics.field3217 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method250();
        }
    }

    @ObfuscatedName("client.u(I)V")
    public void method250() {
        if (class172.field2725 >= 4) {
            this.method2839("js5crc");
            field284 = 1000;
            return;
        }
        if (class172.field2726 >= 4) {
            if (field284 <= 5) {
                this.method2839("js5io");
                field284 = 1000;
                return;
            }
            field466 = 3000;
            class172.field2726 = 3;
        }
        if (--field466 + 1 > 0) {
            return;
        }
        try {
            if (field351 == 0) {
                Statics.field78 = Statics.field2154.method2705(Statics.field313, Statics.field1056);
                field351++;
            }
            if (field351 == 1) {
                if (Statics.field78.field2196 == 2) {
                    this.method251(-1);
                    return;
                }
                if (Statics.field78.field2196 == 1) {
                    field351++;
                }
            }
            if (field351 == 2) {
                Statics.field138 = new class144((Socket) Statics.field78.field2195, Statics.field2154);
                class120 var1 = new class120(5);
                var1.method2364(15);
                var1.method2349(113);
                Statics.field138.method2814(var1.field1974, 0, 5);
                field351++;
                Statics.field695 = class116.method1579();
            }
            if (field351 == 3) {
                if (field284 <= 5 || Statics.field138.method2819() > 0) {
                    int var2 = Statics.field138.method2815();
                    if (var2 != 0) {
                        this.method251(var2);
                        return;
                    }
                    field351++;
                } else if (class116.method1579() - Statics.field695 > 30000L) {
                    this.method251(-2);
                    return;
                }
            }
            if (field351 == 4) {
                class144 var3 = Statics.field138;
                boolean var4 = field284 > 20;
                if (Statics.field3217 != null) {
                    try {
                        Statics.field3217.method2811();
                    } catch (Exception var14) {
                    }
                    Statics.field3217 = null;
                }
                Statics.field3217 = var3;
                class172.method70(var4);
                class172.field2712.field1972 = 0;
                Statics.field2640 = null;
                Statics.field1575 = null;
                class172.field2710 = 0;
                while (true) {
                    class173 var6 = (class173) class172.field2713.method3501();
                    if (var6 == null) {
                        while (true) {
                            class173 var7 = (class173) class172.field2718.method3501();
                            if (var7 == null) {
                                if (class172.field2724 != 0) {
                                    try {
                                        class120 var8 = new class120(4);
                                        var8.method2364(4);
                                        var8.method2364(class172.field2724);
                                        var8.method2347(0);
                                        Statics.field3217.method2814(var8.field1974, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3217.method2811();
                                        } catch (Exception var12) {
                                        }
                                        class172.field2726++;
                                        Statics.field3217 = null;
                                    }
                                }
                                class172.field2711 = 0;
                                Statics.field2025 = class116.method1579();
                                Statics.field78 = null;
                                Statics.field138 = null;
                                field351 = 0;
                                field308 = 0;
                                return;
                            }
                            class172.field2717.method3611(var7);
                            class172.field2716.method3499(var7, var7.field3123);
                            class172.field2721++;
                            class172.field2719--;
                        }
                    }
                    class172.field2729.method3499(var6, var6.field3123);
                    class172.field2720++;
                    class172.field2714--;
                }
            }
        } catch (IOException var15) {
            this.method251(-3);
        }
    }

    @ObfuscatedName("client.r(II)V")
    public void method251(int arg0) {
        Statics.field78 = null;
        Statics.field138 = null;
        field351 = 0;
        if (Statics.field904 == Statics.field1056) {
            Statics.field1056 = Statics.field2021;
        } else {
            Statics.field1056 = Statics.field904;
        }
        field308++;
        if (field308 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field284 <= 5) {
                this.method2839("js5connect_full");
                field284 = 1000;
            } else {
                field466 = 3000;
            }
        } else if (field308 >= 2 && arg0 == 6) {
            this.method2839("js5connect_outofdate");
            field284 = 1000;
        } else if (field308 >= 4) {
            if (field284 <= 5) {
                this.method2839("js5connect");
                field284 = 1000;
            } else {
                field466 = 3000;
            }
        }
    }

    @ObfuscatedName("du.a(B)V")
    public static void method2295() {
        if (field433 == 0) {
            Statics.field772 = new class87(4, 104, 104, class6.field92);
            for (int var0 = 0; var0 < 4; var0++) {
                field483[var0] = new class109(104, 104);
            }
            Statics.field622 = new class79(512, 512);
            class32.field712 = class158.field2312;
            class32.field731 = 5;
            field433 = 20;
        } else if (field433 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class92.field1572[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class87.method1861(var1, 500, 800, 512, 334);
            class32.field712 = class158.field2313;
            class32.field731 = 10;
            field433 = 30;
        } else if (field433 == 30) {
            Statics.field1739 = method37(0, false, true, true);
            Statics.field647 = method37(1, false, true, true);
            Statics.field14 = method37(2, true, false, true);
            Statics.field660 = method37(3, false, true, true);
            Statics.field1742 = method37(4, false, true, true);
            Statics.field2579 = method37(5, true, true, true);
            Statics.field2070 = method37(6, true, true, false);
            Statics.field629 = method37(7, false, true, true);
            Statics.field2918 = method37(8, false, true, true);
            Statics.field583 = method37(9, false, true, true);
            Statics.field307 = method37(10, false, true, true);
            Statics.field2081 = method37(11, false, true, true);
            Statics.field1777 = method37(12, false, true, true);
            Statics.field1998 = method37(13, true, false, true);
            Statics.field157 = method37(14, false, true, false);
            Statics.field248 = method37(15, false, true, true);
            class32.field712 = class158.field2314;
            class32.field731 = 20;
            field433 = 40;
        } else if (field433 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1739.method3100() * 4 / 100;
            int var8 = var7 + Statics.field647.method3100() * 4 / 100;
            int var9 = var8 + Statics.field14.method3100() * 2 / 100;
            int var10 = var9 + Statics.field660.method3100() * 2 / 100;
            int var11 = var10 + Statics.field1742.method3100() * 6 / 100;
            int var12 = var11 + Statics.field2579.method3100() * 4 / 100;
            int var13 = var12 + Statics.field2070.method3100() * 2 / 100;
            int var14 = var13 + Statics.field629.method3100() * 60 / 100;
            int var15 = var14 + Statics.field2918.method3100() * 2 / 100;
            int var16 = var15 + Statics.field583.method3100() * 2 / 100;
            int var17 = var16 + Statics.field307.method3100() * 2 / 100;
            int var18 = var17 + Statics.field2081.method3100() * 2 / 100;
            int var19 = var18 + Statics.field1777.method3100() * 2 / 100;
            int var20 = var19 + Statics.field1998.method3100() * 2 / 100;
            int var21 = var20 + Statics.field157.method3100() * 2 / 100;
            int var22 = var21 + Statics.field248.method3100() * 2 / 100;
            if (var22 == 100) {
                class32.field712 = class158.field2521;
                class32.field731 = 30;
                field433 = 45;
            } else {
                if (var22 != 0) {
                    class32.field712 = class158.field2439 + var22 + "%";
                }
                class32.field731 = 30;
            }
        } else if (field433 == 45) {
            class57.method729(22050, !field304, 2);
            class185 var23 = new class185();
            var23.method3380(9, 128);
            Statics.field245 = class57.method772(Statics.field2154, Statics.field67, 0, 22050);
            Statics.field245.method1167(var23);
            class169 var24 = Statics.field248;
            class169 var25 = Statics.field157;
            class169 var26 = Statics.field1742;
            Statics.field2966 = var24;
            Statics.field2957 = var25;
            Statics.field2963 = var26;
            Statics.field2959 = var23;
            Statics.field204 = class57.method772(Statics.field2154, Statics.field67, 1, 2048);
            Statics.field2067 = new class56();
            Statics.field204.method1167(Statics.field2067);
            Statics.field1887 = new class75(22050, Statics.field1182);
            class32.field712 = class158.field2317;
            class32.field731 = 35;
            field433 = 50;
        } else if (field433 == 50) {
            int var27 = 0;
            if (Statics.field3045 == null) {
                class169 var28 = Statics.field2918;
                class169 var29 = Statics.field1998;
                int var30 = var28.method3026("p11_full");
                int var31 = var28.method3027(var30, "");
                class225 var32 = class77.method1225(var28, var29, var30, var31);
                Statics.field3045 = var32;
            } else {
                var27++;
            }
            if (Statics.field798 == null) {
                class169 var33 = Statics.field2918;
                class169 var34 = Statics.field1998;
                int var35 = var33.method3026("p12_full");
                int var36 = var33.method3027(var35, "");
                class225 var37 = class77.method1225(var33, var34, var35, var36);
                Statics.field798 = var37;
            } else {
                var27++;
            }
            if (Statics.field1607 == null) {
                class169 var38 = Statics.field2918;
                class169 var39 = Statics.field1998;
                int var40 = var38.method3026("b12_full");
                int var41 = var38.method3027(var40, "");
                class225 var42 = class77.method1225(var38, var39, var40, var41);
                Statics.field1607 = var42;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class32.field712 = class158.field2539 + var27 * 100 / 3 + "%";
                class32.field731 = 40;
            } else {
                Statics.field71 = new class161(true);
                class32.field712 = class158.field2408;
                class32.field731 = 40;
                field433 = 60;
            }
        } else if (field433 == 60) {
            class169 var43 = Statics.field307;
            class169 var44 = Statics.field2918;
            int var45 = 0;
            if (var43.method3041("title.jpg", "")) {
                var45++;
            }
            if (var44.method3041("logo", "")) {
                var45++;
            }
            if (var44.method3041("logo_deadman_mode", "")) {
                var45++;
            }
            if (var44.method3041("titlebox", "")) {
                var45++;
            }
            if (var44.method3041("titlebutton", "")) {
                var45++;
            }
            if (var44.method3041("runes", "")) {
                var45++;
            }
            if (var44.method3041("title_mute", "")) {
                var45++;
            }
            if (var44.method3030("options_radio_buttons,0")) {
                var45++;
            }
            if (var44.method3030("options_radio_buttons,2")) {
                var45++;
            }
            var44.method3041("sl_back", "");
            var44.method3041("sl_flags", "");
            var44.method3041("sl_arrows", "");
            var44.method3041("sl_stars", "");
            var44.method3041("sl_button", "");
            int var48 = class32.method2062();
            if (var45 < var48) {
                class32.field712 = class158.field2320 + var45 * 100 / var48 + "%";
                class32.field731 = 50;
            } else {
                class32.field712 = class158.field2321;
                class32.field731 = 50;
                method159(5);
                field433 = 70;
            }
        } else if (field433 == 70) {
            if (Statics.field14.method3048()) {
                class169 var49 = Statics.field14;
                Statics.field1044 = var49;
                class42.method642(Statics.field14);
                class169 var50 = Statics.field14;
                class169 var51 = Statics.field629;
                Statics.field1011 = var50;
                Statics.field1015 = var51;
                Statics.field3233 = Statics.field1011.method3021(3);
                class169 var52 = Statics.field14;
                class169 var53 = Statics.field629;
                boolean var54 = field304;
                Statics.field906 = var52;
                Statics.field907 = var53;
                class41.field912 = var54;
                class169 var55 = Statics.field14;
                class169 var56 = Statics.field629;
                Statics.field896 = var55;
                Statics.field2913 = var56;
                class169 var57 = Statics.field14;
                class169 var58 = Statics.field629;
                boolean var59 = field280;
                class225 var60 = Statics.field3045;
                Statics.field1088 = var57;
                Statics.field1136 = var58;
                Statics.field1335 = var59;
                Statics.field1127 = Statics.field1088.method3021(10);
                Statics.field3129 = var60;
                class169 var61 = Statics.field14;
                class169 var62 = Statics.field1739;
                class169 var63 = Statics.field647;
                Statics.field981 = var61;
                Statics.field969 = var62;
                Statics.field970 = var63;
                class169 var64 = Statics.field14;
                class169 var65 = Statics.field629;
                Statics.field3173 = var64;
                Statics.field1005 = var65;
                class169 var66 = Statics.field14;
                Statics.field1057 = var66;
                class169 var67 = Statics.field14;
                Statics.field1150 = var67;
                Statics.field1143 = Statics.field1150.method3021(16);
                class169 var68 = Statics.field660;
                class169 var69 = Statics.field629;
                class169 var70 = Statics.field2918;
                class169 var71 = Statics.field1998;
                Statics.field2737 = var68;
                Statics.field3186 = var69;
                Statics.field3156 = var70;
                Statics.field2738 = var71;
                Statics.field2736 = new class174[Statics.field2737.method3044()][];
                Statics.field2793 = new boolean[Statics.field2737.method3044()];
                class169 var72 = Statics.field14;
                Statics.field1083 = var72;
                class49.method189(Statics.field14);
                class169 var73 = Statics.field14;
                Statics.field1029 = var73;
                class169 var74 = Statics.field14;
                Statics.field1073 = var74;
                Statics.field652 = new class20();
                class32.field712 = class158.field2323;
                class32.field731 = 60;
                field433 = 80;
            } else {
                class32.field712 = class158.field2322 + Statics.field14.method3097() + "%";
                class32.field731 = 60;
            }
        } else if (field433 == 80) {
            int var75 = 0;
            if (Statics.field203 == null) {
                Statics.field203 = class77.method3089(Statics.field2918, "compass", "");
            } else {
                var75++;
            }
            if (Statics.field2240 == null) {
                Statics.field2240 = class77.method3089(Statics.field2918, "mapedge", "");
            } else {
                var75++;
            }
            if (Statics.field159 == null) {
                Statics.field159 = class77.method712(Statics.field2918, "mapscene", "");
            } else {
                var75++;
            }
            if (Statics.field1727 == null) {
                Statics.field1727 = class77.method2058(Statics.field2918, "mapfunction", "");
            } else {
                var75++;
            }
            if (Statics.field220 == null) {
                Statics.field220 = class77.method2058(Statics.field2918, "hitmarks", "");
            } else {
                var75++;
            }
            if (Statics.field221 == null) {
                Statics.field221 = class77.method2058(Statics.field2918, "headicons_pk", "");
            } else {
                var75++;
            }
            if (Statics.field3138 == null) {
                Statics.field3138 = class77.method2058(Statics.field2918, "headicons_prayer", "");
            } else {
                var75++;
            }
            if (Statics.field2030 == null) {
                Statics.field2030 = class77.method2058(Statics.field2918, "headicons_hint", "");
            } else {
                var75++;
            }
            if (Statics.field1882 == null) {
                Statics.field1882 = class77.method2058(Statics.field2918, "mapmarker", "");
            } else {
                var75++;
            }
            if (Statics.field556 == null) {
                Statics.field556 = class77.method2058(Statics.field2918, "cross", "");
            } else {
                var75++;
            }
            if (Statics.field353 == null) {
                Statics.field353 = class77.method2058(Statics.field2918, "mapdots", "");
            } else {
                var75++;
            }
            if (Statics.field3127 == null) {
                Statics.field3127 = class77.method712(Statics.field2918, "scrollbar", "");
            } else {
                var75++;
            }
            if (Statics.field1082 == null) {
                Statics.field1082 = class77.method712(Statics.field2918, "mod_icons", "");
            } else {
                var75++;
            }
            if (var75 < 13) {
                class32.field712 = class158.field2569 + var75 * 100 / 13 + "%";
                class32.field731 = 70;
            } else {
                Statics.field3200 = Statics.field1082;
                Statics.field2240.method1591();
                int var76 = (int) (Math.random() * 21.0D) - 10;
                int var77 = (int) (Math.random() * 21.0D) - 10;
                int var78 = (int) (Math.random() * 21.0D) - 10;
                int var79 = (int) (Math.random() * 41.0D) - 20;
                for (int var80 = 0; var80 < Statics.field1727.length; var80++) {
                    Statics.field1727[var80].method1590(var76 + var79, var77 + var79, var78 + var79);
                }
                Statics.field159[0].method1755(var76 + var79, var77 + var79, var78 + var79);
                class32.field712 = class158.field2325;
                class32.field731 = 70;
                field433 = 90;
            }
        } else if (field433 == 90) {
            if (Statics.field583.method3048()) {
                class96 var81 = new class96(Statics.field583, Statics.field2918, 20, 0.8D, field304 ? 64 : 128);
                class92.method1977(var81);
                class92.method1983(0.8D);
                class32.field712 = class158.field2327;
                class32.field731 = 90;
                field433 = 110;
            } else {
                class32.field712 = class158.field2433 + Statics.field583.method3097() + "%";
                class32.field731 = 90;
            }
        } else if (field433 == 110) {
            Statics.field3216 = new class14();
            Statics.field2154.method2706(Statics.field3216, 10);
            class32.field712 = class158.field2328;
            class32.field731 = 94;
            field433 = 120;
        } else if (field433 == 120) {
            if (Statics.field307.method3041("huffman", "")) {
                class114 var82 = new class114(Statics.field307.method3028("huffman", ""));
                Statics.field2645 = var82;
                class32.field712 = class158.field2330;
                class32.field731 = 96;
                field433 = 130;
            } else {
                class32.field712 = class158.field2329 + "%";
                class32.field731 = 96;
            }
        } else if (field433 == 130) {
            if (!Statics.field660.method3048()) {
                class32.field712 = class158.field2331 + Statics.field660.method3097() * 4 / 5 + "%";
                class32.field731 = 100;
            } else if (!Statics.field1777.method3048()) {
                class32.field712 = class158.field2331 + (80 + Statics.field1777.method3097() / 6) + "%";
                class32.field731 = 100;
            } else if (Statics.field1998.method3048()) {
                class32.field712 = class158.field2424;
                class32.field731 = 100;
                field433 = 140;
            } else {
                class32.field712 = class158.field2331 + (96 + Statics.field1998.method3097() / 20) + "%";
                class32.field731 = 100;
            }
        } else if (field433 == 140) {
            method159(10);
        }
    }

    @ObfuscatedName("x.d(IZZZI)Lfm;")
    public static class169 method37(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class135 var4 = null;
        if (class150.field2218 != null) {
            var4 = new class135(arg0, class150.field2218, Statics.field222[arg0], 1000000);
        }
        return new class169(var4, Statics.field2244, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ag.p(B)V")
    public static final void method713() {
        try {
            if (field309 == 0) {
                if (Statics.field1661 != null) {
                    Statics.field1661.method2811();
                    Statics.field1661 = null;
                }
                Statics.field247 = null;
                field330 = false;
                field294 = 0;
                field309 = 1;
            }
            if (field309 == 1) {
                if (Statics.field247 == null) {
                    Statics.field247 = Statics.field2154.method2705(Statics.field313, Statics.field1056);
                }
                if (Statics.field247.field2196 == 2) {
                    throw new IOException();
                }
                if (Statics.field247.field2196 == 1) {
                    Statics.field1661 = new class144((Socket) Statics.field247.field2195, Statics.field2154);
                    Statics.field247 = null;
                    field309 = 2;
                }
            }
            if (field309 == 2) {
                field319.field1972 = 0;
                field319.method2364(14);
                Statics.field1661.method2814(field319.field1974, 0, 1);
                field321.field1972 = 0;
                field309 = 3;
            }
            if (field309 == 3) {
                if (Statics.field245 != null) {
                    Statics.field245.method1161();
                }
                if (Statics.field204 != null) {
                    Statics.field204.method1161();
                }
                int var0 = Statics.field1661.method2815();
                if (Statics.field245 != null) {
                    Statics.field245.method1161();
                }
                if (Statics.field204 != null) {
                    Statics.field204.method1161();
                }
                if (var0 != 0) {
                    method2922(var0);
                    return;
                }
                field321.field1972 = 0;
                field309 = 5;
            }
            if (field309 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field319.field1972 = 0;
                field319.method2364(1);
                field319.method2364(class32.field728.method557());
                field319.method2349(var1[0]);
                field319.method2349(var1[1]);
                field319.method2349(var1[2]);
                field319.method2349(var1[3]);
                switch(class32.field728.field2590) {
                    case 0:
                        field319.field1972 += 8;
                        break;
                    case 1:
                    case 3:
                        field319.method2348(Statics.field721);
                        field319.field1972 += 5;
                        break;
                    case 2:
                        field319.method2349((Integer) Statics.field76.field143.get(class164.method1968(class32.field699)));
                        field319.field1972 += 4;
                }
                field319.method2352(class32.field711);
                field319.method2380(class5.field81, class5.field73);
                field320.field1972 = 0;
                if (field284 == 40) {
                    field320.method2364(18);
                } else {
                    field320.method2364(16);
                }
                field320.method2347(0);
                int var2 = field320.field1972;
                field320.method2349(113);
                field320.method2355(field319.field1974, 0, field319.field1972);
                int var3 = field320.field1972;
                field320.method2352(class32.field699);
                field320.method2364((field488 ? 1 : 0) << 1 | (field304 ? 1 : 0));
                field320.method2347(Statics.field103);
                field320.method2347(Statics.field902);
                class123 var4 = field320;
                byte[] var5 = new byte[24];
                try {
                    class150.field2216.method3880(0L);
                    class150.field2216.method3857(var5);
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
                var4.method2355(var5, 0, 24);
                field320.method2352(Statics.field3006);
                field320.method2349(Statics.field283);
                class120 var9 = new class120(Statics.field71.method2936());
                Statics.field71.method2937(var9);
                field320.method2355(var9.field1974, 0, var9.field1974.length);
                field320.method2364(Statics.field208);
                field320.method2349(Statics.field1739.field2675);
                field320.method2349(Statics.field647.field2675);
                field320.method2349(Statics.field14.field2675);
                field320.method2349(Statics.field660.field2675);
                field320.method2349(Statics.field1742.field2675);
                field320.method2349(Statics.field2579.field2675);
                field320.method2349(Statics.field2070.field2675);
                field320.method2349(Statics.field629.field2675);
                field320.method2349(Statics.field2918.field2675);
                field320.method2349(Statics.field583.field2675);
                field320.method2349(Statics.field307.field2675);
                field320.method2349(Statics.field2081.field2675);
                field320.method2349(Statics.field1777.field2675);
                field320.method2349(Statics.field1998.field2675);
                field320.method2349(Statics.field157.field2675);
                field320.method2349(Statics.field248.field2675);
                field320.method2378(var1, var3, field320.field1972);
                field320.method2357(field320.field1972 - var2);
                Statics.field1661.method2814(field320.field1974, 0, field320.field1972);
                field319.method2595(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field321.method2595(var1);
                field309 = 6;
            }
            if (field309 == 6 && Statics.field1661.method2819() > 0) {
                int var11 = Statics.field1661.method2815();
                if (var11 == 21 && field284 == 20) {
                    field309 = 7;
                } else if (var11 == 2) {
                    field309 = 9;
                } else if (var11 == 15 && field284 == 40) {
                    field524 = -1;
                    field309 = 13;
                } else if (var11 == 23 && field311 < 1) {
                    field311++;
                    field309 = 0;
                } else if (var11 == 29) {
                    field309 = 11;
                } else {
                    method2922(var11);
                    return;
                }
            }
            if (field309 == 7 && Statics.field1661.method2819() > 0) {
                field312 = (Statics.field1661.method2815() + 3) * 60;
                field309 = 8;
            }
            if (field309 == 8) {
                field294 = 0;
                class32.method2297(class158.field2533, class158.field2326, field312 / 60 + class158.field2430);
                if (--field312 <= 0) {
                    field309 = 0;
                }
            } else {
                if (field309 == 9 && Statics.field1661.method2819() >= 13) {
                    boolean var12 = Statics.field1661.method2815() == 1;
                    Statics.field1661.method2813(field321.field1974, 0, 4);
                    field321.field1972 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field321.method2602() << 24;
                        int var15 = var14 | field321.method2602() << 16;
                        int var16 = var15 | field321.method2602() << 8;
                        int var17 = var16 | field321.method2602();
                        int var18 = class164.method1968(class32.field699);
                        if (Statics.field76.field143.size() >= 10 && !Statics.field76.field143.containsKey(var18)) {
                            Iterator var19 = Statics.field76.field143.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field76.field143.put(var18, var17);
                        class9.method933();
                    }
                    field441 = Statics.field1661.method2815();
                    field377 = Statics.field1661.method2815() == 1;
                    field398 = Statics.field1661.method2815();
                    field398 <<= 0x8;
                    field398 += Statics.field1661.method2815();
                    field399 = Statics.field1661.method2815();
                    Statics.field1661.method2813(field321.field1974, 0, 1);
                    field321.field1972 = 0;
                    field323 = field321.method2602();
                    Statics.field1661.method2813(field321.field1974, 0, 2);
                    field321.field1972 = 0;
                    field524 = field321.method2363();
                    if (field399 == 1) {
                        try {
                            class133.method2670(Statics.field273, "zap");
                        } catch (Throwable var34) {
                        }
                    } else {
                        try {
                            class133.method2670(Statics.field273, "unzap");
                        } catch (Throwable var33) {
                        }
                    }
                    field309 = 10;
                }
                if (field309 != 10) {
                    if (field309 == 11 && Statics.field1661.method2819() >= 2) {
                        field321.field1972 = 0;
                        Statics.field1661.method2813(field321.field1974, 0, 2);
                        field321.field1972 = 0;
                        Statics.field757 = field321.method2363();
                        field309 = 12;
                    }
                    if (field309 == 12 && Statics.field1661.method2819() >= Statics.field757) {
                        field321.field1972 = 0;
                        Statics.field1661.method2813(field321.field1974, 0, Statics.field757);
                        field321.field1972 = 0;
                        String var22 = field321.method2369();
                        String var23 = field321.method2369();
                        String var24 = field321.method2369();
                        class32.method2297(var22, var23, var24);
                        method159(10);
                    }
                    if (field309 == 13) {
                        if (field524 == -1) {
                            if (Statics.field1661.method2819() < 2) {
                                return;
                            }
                            Statics.field1661.method2813(field321.field1974, 0, 2);
                            field321.field1972 = 0;
                            field524 = field321.method2363();
                        }
                        if (Statics.field1661.method2819() >= field524) {
                            Statics.field1661.method2813(field321.field1974, 0, field524);
                            field321.field1972 = 0;
                            int var25 = field524;
                            field319.field1972 = 0;
                            field321.field1972 = 0;
                            field323 = -1;
                            field326 = -1;
                            field327 = -1;
                            field282 = -1;
                            field524 = 0;
                            field324 = 0;
                            field405 = 0;
                            field416 = 0;
                            field454 = false;
                            field510 = 0;
                            field508 = 0;
                            for (int var26 = 0; var26 < 2048; var26++) {
                                field397[var26] = null;
                            }
                            Statics.field1054 = null;
                            for (int var27 = 0; var27 < field518.length; var27++) {
                                class35 var28 = field518[var27];
                                if (var28 != null) {
                                    var28.field820 = -1;
                                    var28.field837 = false;
                                }
                            }
                            class16.field211 = new class197(32);
                            method159(30);
                            for (int var29 = 0; var29 < 100; var29++) {
                                field479[var29] = true;
                            }
                            field319.method2596(98);
                            class123 var30 = field319;
                            int var31 = field488 ? 2 : 1;
                            var30.method2364(var31);
                            field319.method2347(Statics.field103);
                            field319.method2347(Statics.field902);
                            class33.method42(field321);
                            if (field321.field1972 != var25) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field294++;
                        if (field294 > 2000) {
                            if (field311 < 1) {
                                if (Statics.field904 == Statics.field1056) {
                                    Statics.field1056 = Statics.field2021;
                                } else {
                                    Statics.field1056 = Statics.field904;
                                }
                                field311++;
                                field309 = 0;
                            } else {
                                method2922(-3);
                            }
                        }
                    }
                } else if (Statics.field1661.method2819() >= field524) {
                    field321.field1972 = 0;
                    Statics.field1661.method2813(field321.field1974, 0, field524);
                    method156();
                    class33.method42(field321);
                    Statics.field2295 = -1;
                    method3454(false);
                    field323 = -1;
                }
            }
        } catch (IOException var36) {
            if (field311 < 1) {
                if (Statics.field904 == Statics.field1056) {
                    Statics.field1056 = Statics.field2021;
                } else {
                    Statics.field1056 = Statics.field904;
                }
                field311++;
                field309 = 0;
            } else {
                method2922(-2);
            }
        }
    }

    @ObfuscatedName("a.q(I)V")
    public static void method156() {
        field287 = 1L;
        field290 = -1;
        Statics.field3216.field194 = 0;
        Statics.field1865 = true;
        field340 = true;
        field381 = -1L;
        class212.method89();
        field319.field1972 = 0;
        field321.field1972 = 0;
        field323 = -1;
        field326 = -1;
        field327 = -1;
        field282 = -1;
        field324 = 0;
        field405 = 0;
        field306 = 0;
        field276 = 0;
        field416 = 0;
        field454 = false;
        class141.field2124 = 0;
        class12.method2642();
        field281 = 0;
        field512 = false;
        field516 = 0;
        field361 = (int) (Math.random() * 100.0D) - 50;
        field342 = (int) (Math.random() * 110.0D) - 55;
        field344 = (int) (Math.random() * 80.0D) - 40;
        field347 = (int) (Math.random() * 120.0D) - 60;
        field480 = (int) (Math.random() * 30.0D) - 20;
        field522 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field510 = 0;
        field356 = -1;
        field508 = 0;
        field509 = 0;
        field302 = class21.field566;
        field336 = class21.field566;
        field315 = 0;
        class33.field738 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field737[var0] = null;
            class33.field736[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field397[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field518[var2] = null;
        }
        field406 = -1;
        field409.method3545();
        field455.method3545();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field365[var3][var4][var5] = null;
                }
            }
        }
        field408 = new class200();
        field272 = 0;
        field349 = 0;
        field545 = 0;
        for (int var6 = 0; var6 < Statics.field1143; var6++) {
            class53 var7 = class53.method3201(var6);
            if (var7 != null) {
                class177.field2902[var6] = 0;
                class177.field2901[var6] = 0;
            }
        }
        Statics.field652.method229();
        field380 = -1;
        if (field434 != -1) {
            int var8 = field434;
            if (var8 != -1 && Statics.field2793[var8]) {
                Statics.field2737.method3054(var8);
                if (Statics.field2736[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2736[var8].length; var10++) {
                        if (Statics.field2736[var8][var10] != null) {
                            if (Statics.field2736[var8][var10].field2821 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2736[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2736[var8] = null;
                    }
                    Statics.field2793[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field435.method3501(); var11 != null; var11 = (class4) field435.method3502()) {
            method2653(var11, true);
        }
        field434 = -1;
        field435 = new class197(8);
        field438 = null;
        field454 = false;
        field416 = 0;
        field547.method3224((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field403[var12] = null;
            field404[var12] = false;
        }
        class16.field211 = new class197(32);
        field285 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field479[var13] = true;
        }
        field319.method2596(98);
        class123 var14 = field319;
        int var15 = field488 ? 2 : 1;
        var14.method2364(var15);
        field319.method2347(Statics.field103);
        field319.method2347(Statics.field902);
        field417 = null;
        Statics.field854 = 0;
        Statics.field2006 = null;
        for (int var16 = 0; var16 < 8; var16++) {
            field550[var16] = new class221();
        }
        Statics.field557 = null;
    }

    @ObfuscatedName("ew.b(II)V")
    public static void method2922(int arg0) {
        if (arg0 == -3) {
            class32.method2297(class158.field2344, class158.field2340, class158.field2423);
        } else if (arg0 == -2) {
            class32.method2297(class158.field2576, class158.field2502, class158.field2573);
        } else if (arg0 == -1) {
            class32.method2297(class158.field2474, class158.field2346, class158.field2347);
        } else if (arg0 == 3) {
            class32.field713 = 3;
        } else if (arg0 == 4) {
            class32.method2297(class158.field2487, class158.field2349, class158.field2529);
        } else if (arg0 == 5) {
            class32.method2297(class158.field2351, class158.field2352, class158.field2353);
        } else if (arg0 == 6) {
            class32.method2297(class158.field2354, class158.field2355, class158.field2508);
        } else if (arg0 == 7) {
            class32.method2297(class158.field2357, class158.field2358, class158.field2534);
        } else if (arg0 == 8) {
            class32.method2297(class158.field2396, class158.field2472, class158.field2497);
        } else if (arg0 == 9) {
            class32.method2297(class158.field2363, class158.field2364, class158.field2365);
        } else if (arg0 == 10) {
            class32.method2297(class158.field2366, class158.field2367, class158.field2356);
        } else if (arg0 == 11) {
            class32.method2297(class158.field2333, class158.field2315, class158.field2371);
        } else if (arg0 == 12) {
            class32.method2297(class158.field2372, class158.field2373, class158.field2374);
        } else if (arg0 == 13) {
            class32.method2297(class158.field2375, class158.field2376, class158.field2377);
        } else if (arg0 == 14) {
            class32.method2297(class158.field2378, class158.field2379, class158.field2380);
        } else if (arg0 == 16) {
            class32.method2297(class158.field2381, class158.field2382, class158.field2535);
        } else if (arg0 == 17) {
            class32.method2297(class158.field2384, class158.field2473, class158.field2444);
        } else if (arg0 == 18) {
            class32.method2297(class158.field2540, class158.field2388, class158.field2389);
        } else if (arg0 == 19) {
            class32.method2297(class158.field2390, class158.field2391, class158.field2370);
        } else if (arg0 == 20) {
            class32.method2297(class158.field2393, class158.field2319, class158.field2395);
        } else if (arg0 == 22) {
            class32.method2297(class158.field2343, class158.field2341, class158.field2398);
        } else if (arg0 == 23) {
            class32.method2297(class158.field2399, class158.field2400, class158.field2468);
        } else if (arg0 == 24) {
            class32.method2297(class158.field2402, class158.field2403, class158.field2404);
        } else if (arg0 == 25) {
            class32.method2297(class158.field2337, class158.field2406, class158.field2407);
        } else if (arg0 == 26) {
            class32.method2297(class158.field2345, class158.field2437, class158.field2410);
        } else if (arg0 == 27) {
            class32.method2297(class158.field2416, class158.field2412, class158.field2413);
        } else if (arg0 == 31) {
            class32.method2297(class158.field2420, class158.field2421, class158.field2422);
        } else if (arg0 == 32) {
            class32.method2297(class158.field2405, class158.field2361, class158.field2435);
        } else if (arg0 == 37) {
            class32.method2297(class158.field2426, class158.field2427, class158.field2428);
        } else if (arg0 == 38) {
            class32.method2297(class158.field2369, class158.field2339, class158.field2431);
        } else if (arg0 == 55) {
            class32.method2297(class158.field2392, class158.field2359, class158.field2387);
        } else if (arg0 == 56) {
            class32.method2297(class158.field2524, class158.field2436, class158.field2553);
            method159(11);
            return;
        } else if (arg0 == 57) {
            class32.method2297(class158.field2438, class158.field2336, class158.field2440);
            method159(11);
            return;
        } else {
            class32.method2297(class158.field2441, class158.field2442, class158.field2443);
        }
        method159(10);
    }

    @ObfuscatedName("s.t(I)V")
    public static final void method576() {
        if (Statics.field1661 != null) {
            Statics.field1661.method2811();
            Statics.field1661 = null;
        }
        method151();
        Statics.field772.method1791();
        for (int var0 = 0; var0 < 4; var0++) {
            field483[var0].method2242();
        }
        System.gc();
        class184.field2960 = 1;
        Statics.field1371 = null;
        Statics.field2961 = -1;
        Statics.field2962 = -1;
        Statics.field2958 = 0;
        Statics.field2965 = false;
        Statics.field2964 = 2;
        field533 = -1;
        field513 = false;
        class24.method1501();
        method159(10);
    }

    @ObfuscatedName("r.y(I)V")
    public static final void method151() {
        class47.method2752();
        Statics.method227();
        class45.method237();
        class41.field933.method3463();
        class41.field909.method3463();
        class41.field910.method3463();
        class41.field911.method3463();
        class40.method705();
        class52.method3();
        class43.method3199();
        class44.method119();
        class48.field1048.method3463();
        class53.field1142.method3463();
        class180.method644();
        class174.field2792.method3463();
        class174.field2740.method3463();
        class174.field2741.method3463();
        class174.field2850.method3463();
        ((class96) Statics.field1567).method2052();
        class23.field573.method3463();
        Statics.field1739.method3032();
        Statics.field647.method3032();
        Statics.field660.method3032();
        Statics.field1742.method3032();
        Statics.field2579.method3032();
        Statics.field2070.method3032();
        Statics.field629.method3032();
        Statics.field2918.method3032();
        Statics.field583.method3032();
        Statics.field307.method3032();
        Statics.field2081.method3032();
        Statics.field1777.method3032();
    }

    @ObfuscatedName("d.w(I)V")
    public static final void method162() {
        if (Statics.field204 != null) {
            Statics.field204.method1182();
        }
        if (Statics.field245 != null) {
            Statics.field245.method1182();
        }
    }

    @ObfuscatedName("b.g(I)V")
    public static final void method181() {
        for (int var0 = 0; var0 < field516; var0++) {
            int var10002 = field519[var0]--;
            if (field519[var0] >= -10) {
                class59 var2 = field544[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1201(Statics.field1742, field440[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field519[var0] += var2.method1209();
                    field544[var0] = var2;
                }
                if (field519[var0] < 0) {
                    int var9;
                    if (field520[var0] == 0) {
                        var9 = field514;
                    } else {
                        int var3 = (field520[var0] & 0xFF) * 128;
                        int var4 = field520[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1054.field817;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field520[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1054.field841;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field519[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field515 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1210().method1241(Statics.field1887);
                        class65 var11 = class65.method1277(var10, 100, var9);
                        var11.method1267(field461[var0] - 1);
                        Statics.field2067.method1133(var11);
                    }
                    field519[var0] = -100;
                }
            } else {
                field516--;
                for (int var1 = var0; var1 < field516; var1++) {
                    field440[var1] = field440[var1 + 1];
                    field544[var1] = field544[var1 + 1];
                    field461[var1] = field461[var1 + 1];
                    field519[var1] = field519[var1 + 1];
                    field520[var1] = field520[var1 + 1];
                }
                var0--;
            }
        }
        if (field513 && !class184.method158()) {
            if (field410 != 0 && field533 != -1) {
                class184.method2638(Statics.field2070, field533, 0, field410, false);
            }
            field513 = false;
        }
    }

    @ObfuscatedName("cl.s(Lae;IIII)V")
    public static void method1966(class43 arg0, int arg1, int arg2, int arg3) {
        if (field516 >= 50 || field515 == 0 || arg0.field976 == null || arg1 >= arg0.field976.length) {
            return;
        }
        int var4 = arg0.field976[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field440[field516] = var5;
        field461[field516] = var6;
        field519[field516] = 0;
        field544[field516] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field520[field516] = (var8 << 16) + (var9 << 8) + var7;
        field516++;
    }

    @ObfuscatedName("n.k(Lfb;IIB)V")
    public static final void method118(class174 arg0, int arg1, int arg2) {
        if (field510 != 0 && field510 != 3 || class141.field2135 != 1 && Statics.field2117 || class141.field2135 != 4) {
            return;
        }
        class176 var3 = arg0.method3155(true);
        if (var3 == null) {
            return;
        }
        int var4 = class141.field2136 - arg1;
        int var5 = class141.field2137 - arg2;
        if (!var3.method3197(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2891 / 2;
        int var7 = var5 - var3.field2892 / 2;
        int var8 = field522 + field347 & 0x7FF;
        int var9 = class92.field1572[var8];
        int var10 = class92.field1573[var8];
        int var11 = (field480 + 256) * var9 >> 8;
        int var12 = (field480 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field1054.field817 + var13 >> 7;
        int var16 = Statics.field1054.field841 - var14 >> 7;
        field319.method2596(88);
        field319.method2364(18);
        field319.method2347(Statics.field3015 + var15);
        field319.method2458(class138.field2096[82] ? (class138.field2096[81] ? 2 : 1) : 0);
        field319.method2394(Statics.field13 + var16);
        field319.method2364(var6);
        field319.method2364(var7);
        field319.method2347(field522);
        field319.method2364(57);
        field319.method2364(field347);
        field319.method2364(field480);
        field319.method2364(89);
        field319.method2347(Statics.field1054.field817);
        field319.method2347(Statics.field1054.field841);
        field319.method2364(63);
        field508 = var15;
        field509 = var16;
    }

    @ObfuscatedName("bp.o(I)V")
    public static final void method1583() {
        int var0 = Statics.field657 * 128 + 64;
        int var1 = Statics.field2906 * 128 + 64;
        int var2 = method2909(var0, var1, Statics.field656) - Statics.field1370;
        if (Statics.field1992 < var0) {
            Statics.field1992 += Statics.field967 * (var0 - Statics.field1992) / 1000 + Statics.field2204;
            if (Statics.field1992 > var0) {
                Statics.field1992 = var0;
            }
        }
        if (Statics.field1992 > var0) {
            Statics.field1992 -= Statics.field967 * (Statics.field1992 - var0) / 1000 + Statics.field2204;
            if (Statics.field1992 < var0) {
                Statics.field1992 = var0;
            }
        }
        if (Statics.field1953 < var2) {
            Statics.field1953 += Statics.field967 * (var2 - Statics.field1953) / 1000 + Statics.field2204;
            if (Statics.field1953 > var2) {
                Statics.field1953 = var2;
            }
        }
        if (Statics.field1953 > var2) {
            Statics.field1953 -= Statics.field967 * (Statics.field1953 - var2) / 1000 + Statics.field2204;
            if (Statics.field1953 < var2) {
                Statics.field1953 = var2;
            }
        }
        if (Statics.field604 < var1) {
            Statics.field604 += Statics.field967 * (var1 - Statics.field604) / 1000 + Statics.field2204;
            if (Statics.field604 > var1) {
                Statics.field604 = var1;
            }
        }
        if (Statics.field604 > var1) {
            Statics.field604 -= Statics.field967 * (Statics.field604 - var1) / 1000 + Statics.field2204;
            if (Statics.field604 < var1) {
                Statics.field604 = var1;
            }
        }
        int var3 = Statics.field63 * 128 + 64;
        int var4 = Statics.field1581 * 128 + 64;
        int var5 = method2909(var3, var4, Statics.field656) - Statics.field2031;
        int var6 = var3 - Statics.field1992;
        int var7 = var5 - Statics.field1953;
        int var8 = var4 - Statics.field604;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2277 < var10) {
            Statics.field2277 += Statics.field2897 * (var10 - Statics.field2277) / 1000 + Statics.field1081;
            if (Statics.field2277 > var10) {
                Statics.field2277 = var10;
            }
        }
        if (Statics.field2277 > var10) {
            Statics.field2277 -= Statics.field2897 * (Statics.field2277 - var10) / 1000 + Statics.field1081;
            if (Statics.field2277 < var10) {
                Statics.field2277 = var10;
            }
        }
        int var12 = var11 - Statics.field244;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field244 += Statics.field2897 * var12 / 1000 + Statics.field1081;
            Statics.field244 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field244 -= Statics.field2897 * -var12 / 1000 + Statics.field1081;
            Statics.field244 &= 0x7FF;
        }
        int var13 = var11 - Statics.field244;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field244 = var11;
        }
    }

    @ObfuscatedName("t.v(I)V")
    public static final void method186() {
        for (int var0 = 0; var0 < field315; var0++) {
            int var1 = field460[var0];
            class35 var2 = field518[var1];
            if (var2 != null) {
                method2953(var2, var2.field762.field869);
            }
        }
    }

    @ObfuscatedName("fe.f(Lav;II)V")
    public static final void method2953(class38 arg0, int arg1) {
        if (arg0.field840 > field286) {
            int var2 = arg0.field840 - field286;
            int var3 = arg0.field836 * 128 + arg0.field796 * 64;
            int var4 = arg0.field838 * 128 + arg0.field796 * 64;
            arg0.field817 += (var3 - arg0.field817) / var2;
            arg0.field841 += (var4 - arg0.field841) / var2;
            arg0.field824 = 0;
            arg0.field845 = arg0.field842;
        } else if (arg0.field802 >= field286) {
            method829(arg0);
        } else {
            arg0.field855 = arg0.field800;
            if (arg0.field821 == 0) {
                arg0.field824 = 0;
            } else {
                label322: {
                    if (arg0.field826 != -1 && arg0.field850 == 0) {
                        class43 var5 = class43.method2947(arg0.field826);
                        if (arg0.field853 > 0 && var5.field984 == 0) {
                            arg0.field824++;
                            break label322;
                        }
                        if (arg0.field853 <= 0 && var5.field977 == 0) {
                            arg0.field824++;
                            break label322;
                        }
                    }
                    int var6 = arg0.field817;
                    int var7 = arg0.field841;
                    int var8 = arg0.field849[arg0.field821 - 1] * 128 + arg0.field796 * 64;
                    int var9 = arg0.field823[arg0.field821 - 1] * 128 + arg0.field796 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field845 = 1280;
                        } else if (var7 > var9) {
                            arg0.field845 = 1792;
                        } else {
                            arg0.field845 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field845 = 768;
                        } else if (var7 > var9) {
                            arg0.field845 = 256;
                        } else {
                            arg0.field845 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field845 = 1024;
                    } else if (var7 > var9) {
                        arg0.field845 = 0;
                    }
                    byte var10 = arg0.field851[arg0.field821 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field845 - arg0.field797 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field804;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field803;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field848;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field852;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field803;
                        }
                        arg0.field855 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class35) {
                            var14 = ((class35) arg0).field762.field897;
                        }
                        if (var14) {
                            if (arg0.field845 != arg0.field797 && arg0.field820 == -1 && arg0.field809 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field821 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field821 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field824 > 0 && arg0.field821 > 1) {
                                var13 = 8;
                                arg0.field824--;
                            }
                        } else {
                            if (arg0.field821 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field821 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field824 > 0 && arg0.field821 > 1) {
                                var13 = 8;
                                arg0.field824--;
                            }
                        }
                        if (var10 == 2) {
                            var13 <<= 0x1;
                        }
                        if (var13 >= 8 && arg0.field855 == arg0.field803 && arg0.field807 != -1) {
                            arg0.field855 = arg0.field807;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field817 += var13;
                                if (arg0.field817 > var8) {
                                    arg0.field817 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field817 -= var13;
                                if (arg0.field817 < var8) {
                                    arg0.field817 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field841 += var13;
                                if (arg0.field841 > var9) {
                                    arg0.field841 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field841 -= var13;
                                if (arg0.field841 < var9) {
                                    arg0.field841 = var9;
                                }
                            }
                        }
                        if (arg0.field817 == var8 && arg0.field841 == var9) {
                            arg0.field821--;
                            if (arg0.field853 > 0) {
                                arg0.field853--;
                            }
                        }
                    } else {
                        arg0.field817 = var8;
                        arg0.field841 = var9;
                        arg0.field821--;
                        if (arg0.field853 > 0) {
                            arg0.field853--;
                        }
                    }
                }
            }
        }
        if (arg0.field817 < 128 || arg0.field841 < 128 || arg0.field817 >= 13184 || arg0.field841 >= 13184) {
            arg0.field826 = -1;
            arg0.field857 = -1;
            arg0.field840 = 0;
            arg0.field802 = 0;
            arg0.field817 = arg0.field849[0] * 128 + arg0.field796 * 64;
            arg0.field841 = arg0.field823[0] * 128 + arg0.field796 * 64;
            arg0.method730();
        }
        if (Statics.field1054 == arg0 && (arg0.field817 < 1536 || arg0.field841 < 1536 || arg0.field817 >= 11776 || arg0.field841 >= 11776)) {
            arg0.field826 = -1;
            arg0.field857 = -1;
            arg0.field840 = 0;
            arg0.field802 = 0;
            arg0.field817 = arg0.field849[0] * 128 + arg0.field796 * 64;
            arg0.field841 = arg0.field823[0] * 128 + arg0.field796 * 64;
            arg0.method730();
        }
        method1031(arg0);
        arg0.field844 = false;
        if (arg0.field855 != -1) {
            class43 var15 = class43.method2947(arg0.field855);
            if (var15 == null || var15.field973 == null) {
                arg0.field855 = -1;
            } else {
                arg0.field825++;
                if (arg0.field799 < var15.field973.length && arg0.field825 > var15.field975[arg0.field799]) {
                    arg0.field825 = 1;
                    arg0.field799++;
                    method1966(var15, arg0.field799, arg0.field817, arg0.field841);
                }
                if (arg0.field799 >= var15.field973.length) {
                    arg0.field825 = 0;
                    arg0.field799 = 0;
                    method1966(var15, arg0.field799, arg0.field817, arg0.field841);
                }
            }
        }
        if (arg0.field857 != -1 && field286 >= arg0.field834) {
            if (arg0.field832 < 0) {
                arg0.field832 = 0;
            }
            int var16 = class44.method236(arg0.field857).field994;
            if (var16 == -1) {
                arg0.field857 = -1;
            } else {
                class43 var17 = class43.method2947(var16);
                if (var17 == null || var17.field973 == null) {
                    arg0.field857 = -1;
                } else {
                    arg0.field833++;
                    if (arg0.field832 < var17.field973.length && arg0.field833 > var17.field975[arg0.field832]) {
                        arg0.field833 = 1;
                        arg0.field832++;
                        method1966(var17, arg0.field832, arg0.field817, arg0.field841);
                    }
                    if (arg0.field832 >= var17.field973.length && (arg0.field832 < 0 || arg0.field832 >= var17.field973.length)) {
                        arg0.field857 = -1;
                    }
                }
            }
        }
        if (arg0.field826 != -1 && arg0.field850 <= 1) {
            class43 var18 = class43.method2947(arg0.field826);
            if (var18.field984 == 1 && arg0.field853 > 0 && arg0.field840 <= field286 && arg0.field802 < field286) {
                arg0.field850 = 1;
                return;
            }
        }
        if (arg0.field826 != -1 && arg0.field850 == 0) {
            class43 var19 = class43.method2947(arg0.field826);
            if (var19 == null || var19.field973 == null) {
                arg0.field826 = -1;
            } else {
                arg0.field828++;
                if (arg0.field827 < var19.field973.length && arg0.field828 > var19.field975[arg0.field827]) {
                    arg0.field828 = 1;
                    arg0.field827++;
                    method1966(var19, arg0.field827, arg0.field817, arg0.field841);
                }
                if (arg0.field827 >= var19.field973.length) {
                    arg0.field827 -= var19.field968;
                    arg0.field830++;
                    if (arg0.field830 >= var19.field983) {
                        arg0.field826 = -1;
                    } else if (arg0.field827 >= 0 && arg0.field827 < var19.field973.length) {
                        method1966(var19, arg0.field827, arg0.field817, arg0.field841);
                    } else {
                        arg0.field826 = -1;
                    }
                }
                arg0.field844 = var19.field979;
            }
        }
        if (arg0.field850 > 0) {
            arg0.field850--;
        }
    }

    @ObfuscatedName("ai.au(Lav;I)V")
    public static final void method829(class38 arg0) {
        if (field286 == arg0.field802 || arg0.field826 == -1 || arg0.field850 != 0 || arg0.field828 + 1 > class43.method2947(arg0.field826).field975[arg0.field827]) {
            int var1 = arg0.field802 - arg0.field840;
            int var2 = field286 - arg0.field840;
            int var3 = arg0.field836 * 128 + arg0.field796 * 64;
            int var4 = arg0.field838 * 128 + arg0.field796 * 64;
            int var5 = arg0.field814 * 128 + arg0.field796 * 64;
            int var6 = arg0.field839 * 128 + arg0.field796 * 64;
            arg0.field817 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field841 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field824 = 0;
        arg0.field845 = arg0.field842;
        arg0.field797 = arg0.field845;
    }

    @ObfuscatedName("ak.aq(Lav;I)V")
    public static final void method1031(class38 arg0) {
        if (arg0.field809 == 0) {
            return;
        }
        if (arg0.field820 != -1) {
            class38 var1 = null;
            if (arg0.field820 < 32768) {
                var1 = field518[arg0.field820];
            } else if (arg0.field820 >= 32768) {
                var1 = field397[arg0.field820 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field817 - var1.field817;
                int var3 = arg0.field841 - var1.field841;
                if (var2 != 0 || var3 != 0) {
                    arg0.field845 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field837) {
                arg0.field820 = -1;
                arg0.field837 = false;
            }
        }
        if (arg0.field822 != -1 && (arg0.field821 == 0 || arg0.field824 > 0)) {
            arg0.field845 = arg0.field822;
            arg0.field822 = -1;
        }
        int var4 = arg0.field845 - arg0.field797 & 0x7FF;
        if (var4 == 0 && arg0.field837) {
            arg0.field820 = -1;
            arg0.field837 = false;
        }
        if (var4 == 0) {
            arg0.field846 = 0;
            return;
        }
        arg0.field846++;
        if (var4 > 1024) {
            arg0.field797 -= arg0.field809;
            boolean var5 = true;
            if (var4 < arg0.field809 || var4 > 2048 - arg0.field809) {
                arg0.field797 = arg0.field845;
                var5 = false;
            }
            if (arg0.field855 == arg0.field800 && (arg0.field846 > 25 || var5)) {
                if (arg0.field801 == -1) {
                    arg0.field855 = arg0.field803;
                } else {
                    arg0.field855 = arg0.field801;
                }
            }
        } else {
            arg0.field797 += arg0.field809;
            boolean var6 = true;
            if (var4 < arg0.field809 || var4 > 2048 - arg0.field809) {
                arg0.field797 = arg0.field845;
                var6 = false;
            }
            if (arg0.field855 == arg0.field800 && (arg0.field846 > 25 || var6)) {
                if (arg0.field805 == -1) {
                    arg0.field855 = arg0.field803;
                } else {
                    arg0.field855 = arg0.field805;
                }
            }
        }
        arg0.field797 &= 0x7FF;
    }

    @ObfuscatedName("z.ab(Lm;III)V")
    public static void method31(class3 arg0, int arg1, int arg2) {
        if (arg0.field826 == arg1 && arg1 != -1) {
            int var3 = class43.method2947(arg1).field986;
            if (var3 == 1) {
                arg0.field827 = 0;
                arg0.field828 = 0;
                arg0.field850 = arg2;
                arg0.field830 = 0;
            }
            if (var3 == 2) {
                arg0.field830 = 0;
            }
        } else if (arg1 == -1 || arg0.field826 == -1 || class43.method2947(arg1).field985 >= class43.method2947(arg0.field826).field985) {
            arg0.field826 = arg1;
            arg0.field827 = 0;
            arg0.field828 = 0;
            arg0.field850 = arg2;
            arg0.field830 = 0;
            arg0.field853 = arg0.field821;
        }
    }

    @ObfuscatedName("ar.am(I)V")
    public static void method920() {
        client var0 = Statics.field273;
        synchronized (Statics.field273) {
            Container var1 = Statics.field273.method2840();
            if (var1 != null) {
                Statics.field2029 = Math.max(var1.getSize().width, Statics.field966);
                Statics.field810 = Math.max(var1.getSize().height, Statics.field725);
                if (Statics.field83 == var1) {
                    Insets var2 = Statics.field83.getInsets();
                    Statics.field2029 -= var2.right + var2.left;
                    Statics.field810 -= var2.top + var2.bottom;
                }
                if (Statics.field2029 <= 0) {
                    Statics.field2029 = 1;
                }
                if (Statics.field810 <= 0) {
                    Statics.field810 = 1;
                }
                int var3 = field488 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field103 = field489;
                    Statics.field902 = field490 * 503;
                } else {
                    Statics.field103 = Math.min(Statics.field2029, 7680);
                    Statics.field902 = Math.min(Statics.field810, 2160);
                }
                field2173 = (Statics.field2029 - Statics.field103) / 2;
                field2183 = 0;
                Statics.field67.setSize(Statics.field103, Statics.field902);
                int var4 = Statics.field103;
                int var5 = Statics.field902;
                Canvas var6 = Statics.field67;
                class78 var8;
                try {
                    class82 var7 = new class82();
                    var7.method1504(var4, var5, var6);
                    var8 = var7;
                } catch (Throwable var13) {
                    class76 var10 = new class76();
                    var10.method1504(var4, var5, var6);
                    var8 = var10;
                }
                Statics.field1364 = var8;
                if (Statics.field83 == var1) {
                    Insets var11 = Statics.field83.getInsets();
                    Statics.field67.setLocation(field2173 + var11.left, field2183 + var11.top);
                } else {
                    Statics.field67.setLocation(field2173, field2183);
                }
                method1478();
                if (field434 != -1) {
                    method1476(true);
                }
                method562();
            }
        }
    }

    @ObfuscatedName("bg.an(I)V")
    public static void method1478() {
        int var0 = Statics.field103;
        int var1 = Statics.field902;
        if (Statics.field2029 < var0) {
            int var2 = Statics.field2029;
        }
        if (Statics.field810 < var1) {
            int var3 = Statics.field810;
        }
        if (Statics.field76 == null) {
            return;
        }
        try {
            client var4 = Statics.field273;
            int var5 = field488 ? 2 : 1;
            class133.method2671(var4, "resize", new Object[] { var5 });
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("s.aj(I)V")
    public static void method562() {
        int var0 = field2173;
        int var1 = field2183;
        int var2 = Statics.field2029 - Statics.field103 - var0;
        int var3 = Statics.field810 - Statics.field902 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field273.method2840();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field83 == var4) {
                Insets var7 = Statics.field83.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field810);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2029, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2029 + var5 - var2, var6, var2, Statics.field810);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field810 + var6 - var3, Statics.field2029, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("fs.ay(Ljava/lang/String;ZI)V")
    public static final void method3141(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field798.method3760(arg0, 250);
        int var6 = Statics.field798.method3796(arg0, 250) * 13;
        class80.method1682(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1700(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field798.method3764(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method876(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field67.getGraphics();
                Statics.field1364.method1515(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field67.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field477; var13++) {
            if (field484[var13] + field322[var13] > var9 && field322[var13] < var9 + var11 && field552[var13] + field316[var13] > var10 && field316[var13] < var10 + var12) {
                field392[var13] = true;
            }
        }
    }

    @ObfuscatedName("ai.ao(IIIII)V")
    public static final void method836(int arg0, int arg1, int arg2, int arg3) {
        field474++;
        method590(class34.field761);
        boolean var4 = false;
        if (field406 >= 0) {
            int var5 = class33.field738;
            int[] var6 = class33.field739;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field406 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method590(class34.field753);
        }
        method2931(true);
        method590(var4 ? class34.field752 : class34.field754);
        method2931(false);
        for (class7 var8 = (class7) field409.method3540(); var8 != null; var8 = (class7) field409.method3533()) {
            if (Statics.field656 != var8.field107 || field286 > var8.field111) {
                var8.method3639();
            } else if (field286 >= var8.field112) {
                if (var8.field116 > 0) {
                    class35 var9 = field518[var8.field116 - 1];
                    if (var9 != null && var9.field817 >= 0 && var9.field817 < 13312 && var9.field841 >= 0 && var9.field841 < 13312) {
                        var8.method90(var9.field817, var9.field841, method2909(var9.field817, var9.field841, var8.field107) - var8.field106, field286);
                    }
                }
                if (var8.field116 < 0) {
                    int var10 = -var8.field116 - 1;
                    class3 var11;
                    if (field398 == var10) {
                        var11 = Statics.field1054;
                    } else {
                        var11 = field397[var10];
                    }
                    if (var11 != null && var11.field817 >= 0 && var11.field817 < 13312 && var11.field841 >= 0 && var11.field841 < 13312) {
                        var8.method90(var11.field817, var11.field841, method2909(var11.field817, var11.field841, var8.field107) - var8.field106, field286);
                    }
                }
                var8.method91(field352);
                Statics.field772.method1895(Statics.field656, (int) var8.field118, (int) var8.field119, (int) var8.field115, 60, var8, var8.field126, -1, false);
            }
        }
        for (class30 var12 = (class30) field455.method3540(); var12 != null; var12 = (class30) field455.method3533()) {
            if (Statics.field656 != var12.field683 || var12.field675) {
                var12.method3639();
            } else if (field286 >= var12.field670) {
                var12.method646(field352);
                if (var12.field675) {
                    var12.method3639();
                } else {
                    Statics.field772.method1895(var12.field683, var12.field672, var12.field673, var12.field674, 60, var12, 0, -1, false);
                }
            }
        }
        method564(arg0, arg1, arg2, arg3, true);
        int var13 = field536;
        int var14 = field537;
        int var15 = field506;
        int var16 = field539;
        class80.method1676(var13, var14, var13 + var15, var14 + var16);
        class92.method1973();
        if (!field500) {
            int var17 = field360;
            if (field369 / 256 > var17) {
                var17 = field369 / 256;
            }
            if (field523[4] && field525[4] + 128 > var17) {
                var17 = field525[4] + 128;
            }
            int var18 = field522 + field344 & 0x7FF;
            method2611(Statics.field569, method2909(Statics.field1054.field817, Statics.field1054.field841, Statics.field656) - field366, Statics.field635, var17, var18, var17 * 3 + 600);
        }
        int var19;
        if (field500) {
            var19 = method2699();
        } else {
            var19 = method184();
        }
        int var20 = Statics.field1992;
        int var21 = Statics.field1953;
        int var22 = Statics.field604;
        int var23 = Statics.field2277;
        int var24 = Statics.field244;
        for (int var25 = 0; var25 < 5; var25++) {
            if (field523[var25]) {
                int var26 = (int) (Math.random() * (double) (field370[var25] * 2 + 1) - (double) field370[var25] + Math.sin((double) field526[var25] / 100.0D * (double) field527[var25]) * (double) field525[var25]);
                if (var25 == 0) {
                    Statics.field1992 += var26;
                }
                if (var25 == 1) {
                    Statics.field1953 += var26;
                }
                if (var25 == 2) {
                    Statics.field604 += var26;
                }
                if (var25 == 3) {
                    Statics.field244 = Statics.field244 + var26 & 0x7FF;
                }
                if (var25 == 4) {
                    Statics.field2277 += var26;
                    if (Statics.field2277 < 128) {
                        Statics.field2277 = 128;
                    }
                    if (Statics.field2277 > 383) {
                        Statics.field2277 = 383;
                    }
                }
            }
        }
        int var27 = class141.field2129;
        int var28 = class141.field2127;
        if (class141.field2135 != 0) {
            var27 = class141.field2136;
            var28 = class141.field2137;
        }
        if (var27 >= var13 && var27 < var13 + var15 && var28 >= var14 && var28 < var14 + var16) {
            class106.field1816 = true;
            class106.field1799 = 0;
            class106.field1840 = var27 - var13;
            class106.field1841 = var28 - var14;
        } else {
            class106.field1816 = false;
            class106.field1799 = 0;
        }
        method162();
        class80.method1682(var13, var14, var15, var16, 0);
        method162();
        int var29 = class92.field1554;
        class92.field1554 = field540;
        Statics.field772.method1907(Statics.field1992, Statics.field1953, Statics.field604, Statics.field2277, Statics.field244, var19);
        class92.field1554 = var29;
        method162();
        Statics.field772.method1860();
        Statics.method183(var13, var14, var15, var16);
        if (field276 == 2) {
            method996((field297 - Statics.field3015 << 7) + field530, (field424 - Statics.field13 << 7) + field301, field422 * 2);
            if (field278 > -1 && field286 % 20 < 10) {
                Statics.field2030[0].method1599(field278 + var13 - 12, field383 + var14 - 28);
            }
        }
        ((class96) Statics.field1567).method2051(field352);
        method33(var13, var14, var15, var16);
        Statics.field1992 = var20;
        Statics.field1953 = var21;
        Statics.field604 = var22;
        Statics.field2277 = var23;
        Statics.field244 = var24;
        if (field285) {
            byte var30 = 0;
            int var31 = class172.field2720 + class172.field2714 + var30;
            if (var31 == 0) {
                field285 = false;
            }
        }
        if (field285) {
            class80.method1682(var13, var14, var15, var16, 0);
            method3141(class158.field2309, false);
        }
    }

    @ObfuscatedName("s.ag(IIIIZB)V")
    public static final void method564(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field529 - field528) * var5 / 100 + field528;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field534) {
            short var8 = field534;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field402) {
                var6 = field402;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1675();
                    class80.method1682(arg0, arg1, var10, arg3, -16777216);
                    class80.method1682(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field505) {
            short var11 = field505;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field325) {
                var6 = field325;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1675();
                    class80.method1682(arg0, arg1, arg2, var13, -16777216);
                    class80.method1682(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field531 - field427) * var5 / 100 + field427;
        field540 = arg3 * var6 * var14 / 85504 << 1;
        if (field506 != arg2 || field539 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class92.field1572[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class87.method1861(var15, 500, 800, arg2, arg3);
        }
        field536 = arg0;
        field537 = arg1;
        field506 = arg2;
        field539 = arg3;
    }

    @ObfuscatedName("o.as(Lao;B)V")
    public static final void method590(class34 arg0) {
        if (Statics.field1054.field817 >> 7 == field508 && Statics.field1054.field841 >> 7 == field509) {
            field508 = 0;
        }
        int var1 = class33.field738;
        int[] var2 = class33.field739;
        int var3 = var1;
        if (class34.field761 == arg0 || class34.field753 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field761 == arg0) {
                var5 = Statics.field1054;
                var6 = Statics.field1054.field53 << 14;
            } else if (class34.field753 == arg0) {
                var5 = field397[field406];
                var6 = field406 << 14;
            } else {
                var5 = field397[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field752 == arg0 && field406 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method22() && !var5.field57) {
                var5.field36 = false;
                if ((field304 && var1 > 50 || var1 > 200) && class34.field761 != arg0 && var5.field855 == var5.field800) {
                    var5.field36 = true;
                }
                int var7 = var5.field817 >> 7;
                int var8 = var5.field841 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field50 == null || field286 < var5.field45 || field286 >= var5.field46) {
                        if ((var5.field817 & 0x7F) == 64 && (var5.field841 & 0x7F) == 64) {
                            if (field474 == field521[var7][var8]) {
                                continue;
                            }
                            field521[var7][var8] = field474;
                        }
                        var5.field44 = method2909(var5.field817, var5.field841, Statics.field656);
                        Statics.field772.method1895(Statics.field656, var5.field817, var5.field841, var5.field44, 60, var5, var5.field797, var6, var5.field844);
                    } else {
                        var5.field36 = false;
                        var5.field44 = method2909(var5.field817, var5.field841, Statics.field656);
                        Statics.field772.method1903(Statics.field656, var5.field817, var5.field841, var5.field44, 60, var5, var5.field797, var6, var5.field51, var5.field48, var5.field39, var5.field54);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fi.az(ZI)V")
    public static final void method2931(boolean arg0) {
        for (int var1 = 0; var1 < field315; var1++) {
            class35 var2 = field518[field460[var1]];
            int var3 = (field460[var1] << 14) + 536870912;
            if (var2 != null && var2.method22() && var2.field762.field865 == arg0 && var2.field762.method747()) {
                int var4 = var2.field817 >> 7;
                int var5 = var2.field841 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field796 == 1 && (var2.field817 & 0x7F) == 64 && (var2.field841 & 0x7F) == 64) {
                        if (field474 == field521[var4][var5]) {
                            continue;
                        }
                        field521[var4][var5] = field474;
                    }
                    if (!var2.field762.field881) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field772.method1895(Statics.field656, var2.field817, var2.field841, method2909(var2.field817 + (var2.field796 * 64 - 64), var2.field841 + (var2.field796 * 64 - 64), Statics.field656), var2.field796 * 64 - 64 + 60, var2, var2.field797, var3, var2.field844);
                }
            }
        }
    }

    @ObfuscatedName("t.av(B)I")
    public static final int method184() {
        if (Statics.field76.field146) {
            return Statics.field656;
        }
        int var0 = 3;
        if (Statics.field2277 < 310) {
            int var1 = Statics.field1992 >> 7;
            int var2 = Statics.field604 >> 7;
            int var3 = Statics.field1054.field817 >> 7;
            int var4 = Statics.field1054.field841 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field656;
            }
            if ((class6.field85[Statics.field656][var1][var2] & 0x4) != 0) {
                var0 = Statics.field656;
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
                    if ((class6.field85[Statics.field656][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field656;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field85[Statics.field656][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field656;
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
                    if ((class6.field85[Statics.field656][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field656;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field85[Statics.field656][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field656;
                        }
                    }
                }
            }
        }
        if (Statics.field1054.field817 >= 0 && Statics.field1054.field841 >= 0 && Statics.field1054.field817 < 13312 && Statics.field1054.field841 < 13312) {
            if ((class6.field85[Statics.field656][Statics.field1054.field817 >> 7][Statics.field1054.field841 >> 7] & 0x4) != 0) {
                var0 = Statics.field656;
            }
            return var0;
        } else {
            return Statics.field656;
        }
    }

    @ObfuscatedName("ey.ax(I)I")
    public static final int method2699() {
        if (Statics.field76.field146) {
            return Statics.field656;
        } else {
            int var0 = method2909(Statics.field1992, Statics.field604, Statics.field656);
            return var0 - Statics.field1953 >= 800 || (class6.field85[Statics.field656][Statics.field1992 >> 7][Statics.field604 >> 7] & 0x4) == 0 ? 3 : Statics.field656;
        }
    }

    @ObfuscatedName("bm.aa(Lav;IIIIIB)V")
    public static final void method1224(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method22()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field762;
            if (var6.field893 != null) {
                var6 = var6.method746();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field738;
        int[] var8 = class33.field739;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field57) {
                return;
            }
            if (var10.field38 != -1 || var10.field41 != -1) {
                method3200(arg0, arg0.field795 + 15);
                if (field278 > -1) {
                    if (var10.field38 != -1) {
                        Statics.field221[var10.field38].method1599(field278 + arg2 - 12, field383 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field41 != -1) {
                        Statics.field3138[var10.field41].method1599(field278 + arg2 - 12, field383 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field276 == 10 && field310 == var8[arg1]) {
                method3200(arg0, arg0.field795 + 15);
                if (field278 > -1) {
                    Statics.field2030[1].method1599(field278 + arg2 - 12, field383 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field762;
            if (var11.field893 != null) {
                var11 = var11.method746();
            }
            if (var11.field891 >= 0 && var11.field891 < Statics.field3138.length) {
                method3200(arg0, arg0.field795 + 15);
                if (field278 > -1) {
                    Statics.field3138[var11.field891].method1599(field278 + arg2 - 12, field383 + arg3 - 30);
                }
            }
            if (field276 == 1 && field295 == field460[arg1 - var7] && field286 % 20 < 10) {
                method3200(arg0, arg0.field795 + 15);
                if (field278 > -1) {
                    Statics.field2030[0].method1599(field278 + arg2 - 12, field383 + arg3 - 28);
                }
            }
        }
        if (arg0.field808 != null && (arg1 >= var7 || !arg0.field831 && (field492 == 4 || !arg0.field847 && (field492 == 0 || field492 == 3 || field492 == 1 && method2282(((class3) arg0).field59, false))))) {
            method3200(arg0, arg0.field795);
            if (field278 > -1 && field517 < field371) {
                field375[field517] = Statics.field1607.method3758(arg0.field808) / 2;
                field374[field517] = Statics.field1607.field3193;
                field372[field517] = field278;
                field373[field517] = field383;
                field376[field517] = arg0.field812;
                field382[field517] = arg0.field806;
                field378[field517] = arg0.field811;
                field379[field517] = arg0.field808;
                field517++;
            }
        }
        if (arg0.field829 > field286) {
            method3200(arg0, arg0.field795 + 15);
            if (field278 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field762;
                    var12 = var13.field873;
                }
                int var14 = arg0.field818 * var12 / arg0.field819;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field818 > 0) {
                    var14 = 1;
                }
                class80.method1682(field278 + arg2 - var12 / 2, field383 + arg3 - 3, var14, 5, 65280);
                class80.method1682(field278 + arg2 - var12 / 2 + var14, field383 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field816[var15] > field286) {
                method3200(arg0, arg0.field795 / 2);
                if (field278 > -1) {
                    if (var15 == 1) {
                        field383 -= 20;
                    }
                    if (var15 == 2) {
                        field278 -= 15;
                        field383 -= 10;
                    }
                    if (var15 == 3) {
                        field278 += 15;
                        field383 -= 10;
                    }
                    Statics.field220[arg0.field815[var15]].method1599(field278 + arg2 - 12, field383 + arg3 - 12);
                    Statics.field3045.method3763(Integer.toString(arg0.field813[var15]), field278 + arg2 - 1, field383 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("fp.ai(I)V")
    public static final void method2935() {
        field396 = 0;
        int var0 = (Statics.field1054.field817 >> 7) + Statics.field3015;
        int var1 = (Statics.field1054.field841 >> 7) + Statics.field13;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field396 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field396 = 1;
        }
        if (field396 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field396 = 0;
        }
    }

    @ObfuscatedName("z.ae(IIIII)V")
    public static final void method33(int arg0, int arg1, int arg2, int arg3) {
        if (field387 == 1) {
            Statics.field556[field543 / 100].method1599(field384 - 8, field385 - 8);
        }
        if (field387 == 2) {
            Statics.field556[field543 / 100 + 4].method1599(field384 - 8, field385 - 8);
        }
        method2935();
    }

    @ObfuscatedName("fx.at(Lav;IS)V")
    public static final void method3200(class38 arg0, int arg1) {
        method996(arg0.field817, arg0.field841, arg1);
    }

    @ObfuscatedName("ad.ar(IIII)V")
    public static final void method996(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field278 = -1;
            field383 = -1;
            return;
        }
        int var3 = method2909(arg0, arg1, Statics.field656) - arg2;
        int var4 = arg0 - Statics.field1992;
        int var5 = var3 - Statics.field1953;
        int var6 = arg1 - Statics.field604;
        int var7 = class92.field1572[Statics.field2277];
        int var8 = class92.field1573[Statics.field2277];
        int var9 = class92.field1572[Statics.field244];
        int var10 = class92.field1573[Statics.field244];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field278 = field540 * var11 / var15 + field506 / 2;
            field383 = field540 * var14 / var15 + field539 / 2;
        } else {
            field278 = -1;
            field383 = -1;
        }
    }

    @ObfuscatedName("eh.aw(IIII)I")
    public static final int method2909(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field85[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field92[var5][var3][var4] + class6.field92[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field92[var5][var3][var4 + 1] + class6.field92[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dc.ac(IIIIIII)V")
    public static final void method2611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class92.field1572[var6];
            int var12 = class92.field1573[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class92.field1572[var7];
            int var15 = class92.field1573[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1992 = arg0 - var8;
        Statics.field1953 = arg1 - var9;
        Statics.field604 = arg2 - var10;
        Statics.field2277 = arg3;
        Statics.field244 = arg4;
    }

    @ObfuscatedName("go.ap(ZI)V")
    public static final void method3454(boolean arg0) {
        field337 = arg0;
        if (!field337) {
            int var1 = field321.method2395();
            int var2 = field321.method2395();
            int var3 = field321.method2363();
            Statics.field133 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field133[var4][var5] = field321.method2366();
                }
            }
            Statics.field1639 = new int[var3];
            Statics.field905 = new int[var3];
            Statics.field1084 = new int[var3];
            Statics.field729 = new byte[var3][];
            Statics.field2647 = new byte[var3][];
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
                        Statics.field1639[var7] = var10;
                        Statics.field905[var7] = Statics.field2579.method3026("m" + var8 + "_" + var9);
                        Statics.field1084[var7] = Statics.field2579.method3026("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method35(var2, var1);
            return;
        }
        int var11 = field321.method2396();
        int var12 = field321.method2363();
        int var13 = field321.method2363();
        field321.method2597();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field321.method2598(1);
                    if (var17 == 1) {
                        field338[var14][var15][var16] = field321.method2598(26);
                    } else {
                        field338[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field321.method2594();
        Statics.field133 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field133[var18][var19] = field321.method2366();
            }
        }
        Statics.field1639 = new int[var13];
        Statics.field905 = new int[var13];
        Statics.field1084 = new int[var13];
        Statics.field729 = new byte[var13][];
        Statics.field2647 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field338[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1639[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1639[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field905[var20] = Statics.field2579.method3026("m" + var29 + "_" + var30);
                            Statics.field1084[var20] = Statics.field2579.method3026("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method35(var11, var12);
    }

    @ObfuscatedName("x.af(III)V")
    public static final void method35(int arg0, int arg1) {
        if (Statics.field2295 == arg0 && Statics.field2693 == arg1) {
            return;
        }
        Statics.field2295 = arg0;
        Statics.field2693 = arg1;
        method159(25);
        method3141(class158.field2309, true);
        int var2 = Statics.field3015;
        int var3 = Statics.field13;
        Statics.field3015 = (arg0 - 6) * 8;
        Statics.field13 = (arg1 - 6) * 8;
        int var4 = Statics.field3015 - var2;
        int var5 = Statics.field13 - var3;
        int var6 = Statics.field3015;
        int var7 = Statics.field13;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field518[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field849[var10] -= var4;
                    var9.field823[var10] -= var5;
                }
                var9.field817 -= var4 * 128;
                var9.field841 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field397[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field849[var13] -= var4;
                    var12.field823[var13] -= var5;
                }
                var12.field817 -= var4 * 128;
                var12.field841 -= var5 * 128;
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
                        field365[var24][var20][var21] = field365[var24][var22][var23];
                    } else {
                        field365[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field408.method3540(); var25 != null; var25 = (class17) field408.method3533()) {
            var25.field225 -= var4;
            var25.field226 -= var5;
            if (var25.field225 < 0 || var25.field226 < 0 || var25.field225 >= 104 || var25.field226 >= 104) {
                var25.method3639();
            }
        }
        if (field508 != 0) {
            field508 -= var4;
            field509 -= var5;
        }
        field516 = 0;
        field500 = false;
        field356 = -1;
        field455.method3545();
        field409.method3545();
        for (int var26 = 0; var26 < 4; var26++) {
            field483[var26].method2242();
        }
    }

    @ObfuscatedName("cc.al(ZI)V")
    public static final void method2048(boolean arg0) {
        method162();
        field292++;
        if (field292 < 50 && !arg0) {
            return;
        }
        field292 = 0;
        if (field330 || Statics.field1661 == null) {
            return;
        }
        field319.method2596(200);
        try {
            Statics.field1661.method2814(field319.field1974, 0, field319.field1972);
            field319.field1972 = 0;
        } catch (IOException var2) {
            field330 = true;
        }
    }

    @ObfuscatedName("r.ad(IB)V")
    public static final void method153(int arg0) {
        int[] var1 = Statics.field622.field1393;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field85[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field772.method1825(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field85[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field772.method1825(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field622.method1604();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field85[arg0][var10][var9] & 0x18) == 0) {
                    method2293(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field85[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2293(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field504 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field772.method1820(Statics.field656, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method1789(var14).field934;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field483[Statics.field656].field1880;
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
                        field507[field504] = Statics.field1727[var15];
                        field475[field504] = var16;
                        field451[field504] = var17;
                        field504++;
                    }
                }
            }
        }
        Statics.field1364.method1580();
    }

    @ObfuscatedName("dl.ak(IIIIIS)V")
    public static final void method2293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field772.method1920(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field772.method1958(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field622.field1393;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method1789(var12);
            if (var13.field935 == -1) {
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
                class81 var14 = Statics.field159[var13.field935];
                if (var14 != null) {
                    int var15 = (var13.field921 * 4 - var14.field1404) / 2;
                    int var16 = (var13.field922 * 4 - var14.field1402) / 2;
                    var14.method1766(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field922) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field772.method1819(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field772.method1958(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method1789(var21);
            if (var22.field935 != -1) {
                class81 var23 = Statics.field159[var22.field935];
                if (var23 != null) {
                    int var24 = (var22.field921 * 4 - var23.field1404) / 2;
                    int var25 = (var22.field922 * 4 - var23.field1402) / 2;
                    var23.method1766(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field922) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field622.field1393;
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
        int var29 = Statics.field772.method1820(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method1789(var30);
        if (var31.field935 == -1) {
            return;
        }
        class81 var32 = Statics.field159[var31.field935];
        if (var32 != null) {
            int var33 = (var31.field921 * 4 - var32.field1404) / 2;
            int var34 = (var31.field922 * 4 - var32.field1402) / 2;
            var32.method1766(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field922) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("an.bb(I)V")
    public static final void method654() {
        if (field323 == 212) {
            int var0 = field321.method2361();
            int var1 = (var0 >> 4 & 0x7) + Statics.field31;
            int var2 = (var0 & 0x7) + Statics.field2248;
            int var3 = field321.method2397();
            int var4 = field321.method2361();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field415[var5];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method239(Statics.field656, var1, var2, var7, var3, var5, var6, 0, -1);
            }
        } else if (field323 == 169) {
            int var8 = field321.method2361();
            int var9 = (var8 >> 4 & 0x7) + Statics.field31;
            int var10 = (var8 & 0x7) + Statics.field2248;
            int var11 = field321.method2363();
            int var12 = field321.method2361();
            int var13 = field321.method2363();
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                int var14 = var9 * 128 + 64;
                int var15 = var10 * 128 + 64;
                class30 var16 = new class30(var11, Statics.field656, var14, var15, method2909(var14, var15, Statics.field656) - var12, var13, field286);
                field455.method3535(var16);
            }
        } else if (field323 == 174) {
            int var17 = field321.method2387();
            int var18 = (var17 >> 4 & 0x7) + Statics.field31;
            int var19 = (var17 & 0x7) + Statics.field2248;
            int var20 = field321.method2387();
            int var21 = var20 >> 2;
            int var22 = var20 & 0x3;
            int var23 = field415[var21];
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                method239(Statics.field656, var18, var19, var23, -1, var21, var22, 0, -1);
            }
        } else {
            if (field323 == 138) {
                int var24 = field321.method2361();
                int var25 = (var24 >> 4 & 0x7) + Statics.field31;
                int var26 = (var24 & 0x7) + Statics.field2248;
                int var27 = field321.method2363();
                int var28 = field321.method2361();
                int var29 = var28 >> 4 & 0xF;
                int var30 = var28 & 0x7;
                int var31 = field321.method2361();
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                    int var32 = var29 + 1;
                    if (Statics.field1054.field849[0] >= var25 - var32 && Statics.field1054.field849[0] <= var25 + var32 && Statics.field1054.field823[0] >= var26 - var32 && Statics.field1054.field823[0] <= var26 + var32 && field515 != 0 && var30 > 0 && field516 < 50) {
                        field440[field516] = var27;
                        field461[field516] = var30;
                        field519[field516] = var31;
                        field544[field516] = null;
                        field520[field516] = (var25 << 16) + (var26 << 8) + var29;
                        field516++;
                    }
                }
            }
            if (field323 == 56) {
                int var33 = field321.method2361();
                int var34 = (var33 >> 4 & 0x7) + Statics.field31;
                int var35 = (var33 & 0x7) + Statics.field2248;
                int var36 = var34 + field321.method2531();
                int var37 = var35 + field321.method2531();
                int var38 = field321.method2362();
                int var39 = field321.method2363();
                int var40 = field321.method2361() * 4;
                int var41 = field321.method2361() * 4;
                int var42 = field321.method2363();
                int var43 = field321.method2363();
                int var44 = field321.method2361();
                int var45 = field321.method2361();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var39 != 65535) {
                    int var46 = var34 * 128 + 64;
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    class7 var50 = new class7(var39, Statics.field656, var46, var47, method2909(var46, var47, Statics.field656) - var40, field286 + var42, field286 + var43, var44, var45, var38, var41);
                    var50.method90(var48, var49, method2909(var48, var49, Statics.field656) - var41, field286 + var42);
                    field409.method3535(var50);
                }
            } else if (field323 == 206) {
                int var51 = field321.method2361();
                int var52 = (var51 >> 4 & 0x7) + Statics.field31;
                int var53 = (var51 & 0x7) + Statics.field2248;
                int var54 = field321.method2363();
                int var55 = field321.method2363();
                int var56 = field321.method2363();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    class200 var57 = field365[Statics.field656][var52][var53];
                    if (var57 != null) {
                        for (class29 var58 = (class29) var57.method3540(); var58 != null; var58 = (class29) var57.method3533()) {
                            if ((var54 & 0x7FFF) == var58.field663 && var58.field659 == var55) {
                                var58.field659 = var56;
                                break;
                            }
                        }
                        method155(var52, var53);
                    }
                }
            } else if (field323 == 32) {
                int var59 = field321.method2387();
                int var60 = (var59 >> 4 & 0x7) + Statics.field31;
                int var61 = (var59 & 0x7) + Statics.field2248;
                int var62 = field321.method2397();
                int var63 = field321.method2363();
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    class29 var64 = new class29();
                    var64.field663 = var62;
                    var64.field659 = var63;
                    if (field365[Statics.field656][var60][var61] == null) {
                        field365[Statics.field656][var60][var61] = new class200();
                    }
                    field365[Statics.field656][var60][var61].method3535(var64);
                    method155(var60, var61);
                }
            } else if (field323 == 165) {
                int var65 = field321.method2397();
                int var66 = field321.method2361();
                int var67 = (var66 >> 4 & 0x7) + Statics.field31;
                int var68 = (var66 & 0x7) + Statics.field2248;
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    class200 var69 = field365[Statics.field656][var67][var68];
                    if (var69 != null) {
                        for (class29 var70 = (class29) var69.method3540(); var70 != null; var70 = (class29) var69.method3533()) {
                            if ((var65 & 0x7FFF) == var70.field663) {
                                var70.method3639();
                                break;
                            }
                        }
                        if (var69.method3540() == null) {
                            field365[Statics.field656][var67][var68] = null;
                        }
                        method155(var67, var68);
                    }
                }
            } else if (field323 == 105) {
                int var71 = field321.method2388();
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = field415[var72];
                int var75 = field321.method2363();
                int var76 = field321.method2524();
                int var77 = (var76 >> 4 & 0x7) + Statics.field31;
                int var78 = (var76 & 0x7) + Statics.field2248;
                if (var77 >= 0 && var78 >= 0 && var77 < 103 && var78 < 103) {
                    if (var74 == 0) {
                        class88 var79 = Statics.field772.method1910(Statics.field656, var77, var78);
                        if (var79 != null) {
                            int var80 = var79.field1511 >> 14 & 0x7FFF;
                            if (var72 == 2) {
                                var79.field1512 = new class13(var80, 2, var73 + 4, Statics.field656, var77, var78, var75, false, var79.field1512);
                                var79.field1513 = new class13(var80, 2, var73 + 1 & 0x3, Statics.field656, var77, var78, var75, false, var79.field1513);
                            } else {
                                var79.field1512 = new class13(var80, var72, var73, Statics.field656, var77, var78, var75, false, var79.field1512);
                            }
                        }
                    }
                    if (var74 == 1) {
                        class95 var81 = Statics.field772.method1814(Statics.field656, var77, var78);
                        if (var81 != null) {
                            int var82 = var81.field1596 >> 14 & 0x7FFF;
                            if (var72 == 4 || var72 == 5) {
                                var81.field1594 = new class13(var82, 4, var73, Statics.field656, var77, var78, var75, false, var81.field1594);
                            } else if (var72 == 6) {
                                var81.field1594 = new class13(var82, 4, var73 + 4, Statics.field656, var77, var78, var75, false, var81.field1594);
                            } else if (var72 == 7) {
                                var81.field1594 = new class13(var82, 4, (var73 + 2 & 0x3) + 4, Statics.field656, var77, var78, var75, false, var81.field1594);
                            } else if (var72 == 8) {
                                var81.field1594 = new class13(var82, 4, var73 + 4, Statics.field656, var77, var78, var75, false, var81.field1594);
                                var81.field1595 = new class13(var82, 4, (var73 + 2 & 0x3) + 4, Statics.field656, var77, var78, var75, false, var81.field1595);
                            }
                        }
                    }
                    if (var74 == 2) {
                        class99 var83 = Statics.field772.method1815(Statics.field656, var77, var78);
                        if (var72 == 11) {
                            var72 = 10;
                        }
                        if (var83 != null) {
                            var83.field1641 = new class13(var83.field1649 >> 14 & 0x7FFF, var72, var73, Statics.field656, var77, var78, var75, false, var83.field1641);
                        }
                    }
                    if (var74 == 3) {
                        class94 var84 = Statics.field772.method1816(Statics.field656, var77, var78);
                        if (var84 != null) {
                            var84.field1577 = new class13(var84.field1578 >> 14 & 0x7FFF, 22, var73, Statics.field656, var77, var78, var75, false, var84.field1577);
                        }
                    }
                }
            } else if (field323 == 109) {
                int var85 = field321.method2397();
                int var86 = field321.method2388();
                int var87 = (var86 >> 4 & 0x7) + Statics.field31;
                int var88 = (var86 & 0x7) + Statics.field2248;
                byte var89 = field321.method2382();
                byte var90 = field321.method2390();
                byte var91 = field321.method2389();
                int var92 = field321.method2397();
                byte var93 = field321.method2531();
                int var94 = field321.method2396();
                int var95 = field321.method2388();
                int var96 = var95 >> 2;
                int var97 = var95 & 0x3;
                int var98 = field415[var96];
                int var99 = field321.method2363();
                class3 var100;
                if (field398 == var85) {
                    var100 = Statics.field1054;
                } else {
                    var100 = field397[var85];
                }
                if (var100 != null) {
                    class41 var101 = class41.method1789(var94);
                    int var102;
                    int var103;
                    if (var97 == 1 || var97 == 3) {
                        var102 = var101.field922;
                        var103 = var101.field921;
                    } else {
                        var102 = var101.field921;
                        var103 = var101.field922;
                    }
                    int var104 = (var102 >> 1) + var87;
                    int var105 = (var102 + 1 >> 1) + var87;
                    int var106 = (var103 >> 1) + var88;
                    int var107 = (var103 + 1 >> 1) + var88;
                    int[][] var108 = class6.field92[Statics.field656];
                    int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                    int var110 = (var87 << 7) + (var102 << 6);
                    int var111 = (var88 << 7) + (var103 << 6);
                    class106 var112 = var101.method788(var96, var97, var108, var110, var109, var111);
                    if (var112 != null) {
                        method239(Statics.field656, var87, var88, var98, -1, 0, 0, var99 + 1, var92 + 1);
                        var100.field45 = field286 + var99;
                        var100.field46 = field286 + var92;
                        var100.field50 = var112;
                        var100.field47 = var87 * 128 + var102 * 64;
                        var100.field49 = var88 * 128 + var103 * 64;
                        var100.field55 = var109;
                        if (var89 > var91) {
                            byte var113 = var89;
                            var89 = var91;
                            var91 = var113;
                        }
                        if (var90 > var93) {
                            byte var114 = var90;
                            var90 = var93;
                            var93 = var114;
                        }
                        var100.field51 = var87 + var89;
                        var100.field39 = var87 + var91;
                        var100.field48 = var88 + var90;
                        var100.field54 = var88 + var93;
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.bt(IIIIIIIIII)V")
    public static final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field408.method3540(); var10 != null; var10 = (class17) field408.method3533()) {
            if (var10.field228 == arg0 && var10.field225 == arg1 && var10.field226 == arg2 && var10.field223 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field228 = arg0;
            var9.field223 = arg3;
            var9.field225 = arg1;
            var9.field226 = arg2;
            method34(var9);
            field408.method3535(var9);
        }
        var9.field230 = arg4;
        var9.field232 = arg5;
        var9.field231 = arg6;
        var9.field233 = arg7;
        var9.field234 = arg8;
    }

    @ObfuscatedName("ex.bd(B)V")
    public static final void method2805() {
        for (class17 var0 = (class17) field408.method3540(); var0 != null; var0 = (class17) field408.method3533()) {
            if (var0.field234 == -1) {
                var0.field233 = 0;
                method34(var0);
            } else {
                var0.method3639();
            }
        }
    }

    @ObfuscatedName("z.bx(Lb;B)V")
    public static final void method34(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field223 == 0) {
            var1 = Statics.field772.method1920(arg0.field228, arg0.field225, arg0.field226);
        }
        if (arg0.field223 == 1) {
            var1 = Statics.field772.method1818(arg0.field228, arg0.field225, arg0.field226);
        }
        if (arg0.field223 == 2) {
            var1 = Statics.field772.method1819(arg0.field228, arg0.field225, arg0.field226);
        }
        if (arg0.field223 == 3) {
            var1 = Statics.field772.method1820(arg0.field228, arg0.field225, arg0.field226);
        }
        if (var1 != 0) {
            int var5 = Statics.field772.method1958(arg0.field228, arg0.field225, arg0.field226, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field237 = var2;
        arg0.field229 = var3;
        arg0.field235 = var4;
    }

    @ObfuscatedName("af.be(IIIIIIII)V")
    public static final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field304 && Statics.field656 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field772.method1920(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field772.method1818(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field772.method1819(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field772.method1820(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field772.method1958(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field772.method1808(arg0, arg2, arg3);
                class41 var15 = class41.method1789(var12);
                if (var15.field923 != 0) {
                    field483[arg0].method2245(arg2, arg3, var13, var14, var15.field924);
                }
            }
            if (arg1 == 1) {
                Statics.field772.method1809(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field772.method1803(arg0, arg2, arg3);
                class41 var16 = class41.method1789(var12);
                if (var16.field921 + arg2 > 103 || var16.field921 + arg3 > 103 || var16.field922 + arg2 > 103 || var16.field922 + arg3 > 103) {
                    return;
                }
                if (var16.field923 != 0) {
                    field483[arg0].method2249(arg2, arg3, var16.field921, var16.field922, var14, var16.field924);
                }
            }
            if (arg1 == 3) {
                Statics.field772.method1889(arg0, arg2, arg3);
                class41 var17 = class41.method1789(var12);
                if (var17.field923 == 1) {
                    field483[arg0].method2251(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field85[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method2949(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field772, field483[arg0]);
    }

    @ObfuscatedName("r.bo(III)V")
    public static final void method155(int arg0, int arg1) {
        class200 var2 = field365[Statics.field656][arg0][arg1];
        if (var2 == null) {
            Statics.field772.method1812(Statics.field656, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3540(); var6 != null; var6 = (class29) var2.method3533()) {
            class52 var7 = class52.method1967(var6.field663);
            long var8 = (long) var7.field1108;
            if (var7.field1107 == 1) {
                var8 = (long) (var6.field659 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field772.method1812(Statics.field656, arg0, arg1);
            return;
        }
        var2.method3536(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3540(); var12 != null; var12 = (class29) var2.method3533()) {
            if (var5.field663 != var12.field663) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field663 != var12.field663 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field772.method1798(Statics.field656, arg0, arg1, method2909(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field656), var5, var13, var10, var11);
    }

    @ObfuscatedName("q.bn(ZI)V")
    public static final void method180(boolean arg0) {
        field329 = 0;
        field542 = 0;
        field321.method2597();
        int var1 = field321.method2598(8);
        if (var1 < field315) {
            for (int var2 = var1; var2 < field315; var2++) {
                field401[++field329 - 1] = field460[var2];
            }
        }
        if (var1 > field315) {
            throw new RuntimeException("");
        }
        field315 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field460[var3];
            class35 var5 = field518[var4];
            int var6 = field321.method2598(1);
            if (var6 == 0) {
                field460[++field315 - 1] = var4;
                var5.field843 = field286;
            } else {
                int var7 = field321.method2598(2);
                if (var7 == 0) {
                    field460[++field315 - 1] = var4;
                    var5.field843 = field286;
                    field318[++field542 - 1] = var4;
                } else if (var7 == 1) {
                    field460[++field315 - 1] = var4;
                    var5.field843 = field286;
                    int var8 = field321.method2598(3);
                    var5.method702(var8, (byte) 1);
                    int var9 = field321.method2598(1);
                    if (var9 == 1) {
                        field318[++field542 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field460[++field315 - 1] = var4;
                    var5.field843 = field286;
                    int var10 = field321.method2598(3);
                    var5.method702(var10, (byte) 2);
                    int var11 = field321.method2598(3);
                    var5.method702(var11, (byte) 2);
                    int var12 = field321.method2598(1);
                    if (var12 == 1) {
                        field318[++field542 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field401[++field329 - 1] = var4;
                }
            }
        }
        while (field321.method2600(field524) >= 27) {
            int var13 = field321.method2598(15);
            if (var13 == 32767) {
                break;
            }
            boolean var33 = false;
            if (field518[var13] == null) {
                field518[var13] = new class35();
                var33 = true;
            }
            class35 var34 = field518[var13];
            field460[++field315 - 1] = var13;
            var34.field843 = field286;
            int var35 = field321.method2598(1);
            if (var35 == 1) {
                field318[++field542 - 1] = var13;
            }
            int var36 = field321.method2598(1);
            int var37;
            if (arg0) {
                var37 = field321.method2598(8);
                if (var37 > 127) {
                    var37 -= 256;
                }
            } else {
                var37 = field321.method2598(5);
                if (var37 > 15) {
                    var37 -= 32;
                }
            }
            int var38 = field491[field321.method2598(3)];
            if (var33) {
                var34.field845 = var34.field797 = var38;
            }
            var34.field762 = class40.method2927(field321.method2598(14));
            int var39;
            if (arg0) {
                var39 = field321.method2598(8);
                if (var39 > 127) {
                    var39 -= 256;
                }
            } else {
                var39 = field321.method2598(5);
                if (var39 > 15) {
                    var39 -= 32;
                }
            }
            var34.field796 = var34.field762.field869;
            var34.field809 = var34.field762.field895;
            if (var34.field809 == 0) {
                var34.field797 = 0;
            }
            var34.field803 = var34.field762.field875;
            var34.field804 = var34.field762.field876;
            var34.field852 = var34.field762.field877;
            var34.field848 = var34.field762.field878;
            var34.field800 = var34.field762.field872;
            var34.field801 = var34.field762.field885;
            var34.field805 = var34.field762.field874;
            var34.method703(Statics.field1054.field849[0] + var39, Statics.field1054.field823[0] + var37, var36 == 1);
        }
        field321.method2594();
        for (int var14 = 0; var14 < field542; var14++) {
            int var15 = field318[var14];
            class35 var16 = field518[var15];
            int var17 = field321.method2361();
            if ((var17 & 0x20) != 0) {
                int var18 = field321.method2363();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field321.method2388();
                if (var16.field826 == var18 && var18 != -1) {
                    int var20 = class43.method2947(var18).field986;
                    if (var20 == 1) {
                        var16.field827 = 0;
                        var16.field828 = 0;
                        var16.field850 = var19;
                        var16.field830 = 0;
                    }
                    if (var20 == 2) {
                        var16.field830 = 0;
                    }
                } else if (var18 == -1 || var16.field826 == -1 || class43.method2947(var18).field985 >= class43.method2947(var16.field826).field985) {
                    var16.field826 = var18;
                    var16.field827 = 0;
                    var16.field828 = 0;
                    var16.field850 = var19;
                    var16.field830 = 0;
                    var16.field853 = var16.field821;
                }
            }
            if ((var17 & 0x4) != 0) {
                var16.field857 = field321.method2396();
                int var21 = field321.method2406();
                var16.field835 = var21 >> 16;
                var16.field834 = (var21 & 0xFFFF) + field286;
                var16.field832 = 0;
                var16.field833 = 0;
                if (var16.field834 > field286) {
                    var16.field832 = -1;
                }
                if (var16.field857 == 65535) {
                    var16.field857 = -1;
                }
            }
            if ((var17 & 0x2) != 0) {
                int var22 = field321.method2388();
                int var23 = field321.method2361();
                var16.method731(var22, var23, field286);
                var16.field829 = field286 + 300;
                var16.field818 = field321.method2397();
                var16.field819 = field321.method2397();
            }
            if ((var17 & 0x80) != 0) {
                int var24 = field321.method2397();
                int var25 = field321.method2363();
                int var26 = var16.field817 - (var24 - Statics.field3015 - Statics.field3015) * 64;
                int var27 = var16.field841 - (var25 - Statics.field13 - Statics.field13) * 64;
                if (var26 != 0 || var27 != 0) {
                    var16.field822 = (int) (Math.atan2((double) var26, (double) var27) * 325.949D) & 0x7FF;
                }
            }
            if ((var17 & 0x40) != 0) {
                int var28 = field321.method2388();
                int var29 = field321.method2361();
                var16.method731(var28, var29, field286);
                var16.field829 = field286 + 300;
                var16.field818 = field321.method2395();
                var16.field819 = field321.method2395();
            }
            if ((var17 & 0x8) != 0) {
                var16.field808 = field321.method2369();
                var16.field811 = 100;
            }
            if ((var17 & 0x10) != 0) {
                var16.field762 = class40.method2927(field321.method2396());
                var16.field796 = var16.field762.field869;
                var16.field809 = var16.field762.field895;
                var16.field803 = var16.field762.field875;
                var16.field804 = var16.field762.field876;
                var16.field852 = var16.field762.field877;
                var16.field848 = var16.field762.field878;
                var16.field800 = var16.field762.field872;
                var16.field801 = var16.field762.field885;
                var16.field805 = var16.field762.field874;
            }
            if ((var17 & 0x1) != 0) {
                var16.field820 = field321.method2363();
                if (var16.field820 == 65535) {
                    var16.field820 = -1;
                }
            }
        }
        for (int var30 = 0; var30 < field329; var30++) {
            int var31 = field401[var30];
            if (field286 != field518[var31].field843) {
                field518[var31].field762 = null;
                field518[var31] = null;
            }
        }
        if (field524 != field321.field1972) {
            throw new RuntimeException(field321.field1972 + class2.field21 + field524);
        }
        for (int var32 = 0; var32 < field315; var32++) {
            if (field518[field460[var32]] == null) {
                throw new RuntimeException(var32 + class2.field21 + field315);
            }
        }
    }

    @ObfuscatedName("ee.bm(B)V")
    public static final void method2768() {
        int var0 = Statics.field2666;
        int var1 = Statics.field664;
        int var2 = Statics.field257;
        int var3 = Statics.field1586;
        int var4 = 6116423;
        class80.method1682(var0, var1, var2, var3, var4);
        class80.method1682(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1700(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1607.method3762(class158.field2450, var0 + 3, var1 + 14, var4, -1);
        int var5 = class141.field2129;
        int var6 = class141.field2127;
        for (int var7 = 0; var7 < field416; var7++) {
            int var8 = (field416 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class225 var10 = Statics.field1607;
            String var11;
            if (field291[var7].length() > 0) {
                var11 = field421[var7] + class158.field2457 + field291[var7];
            } else {
                var11 = field421[var7];
            }
            var10.method3762(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field2666;
        int var13 = Statics.field664;
        int var14 = Statics.field257;
        int var15 = Statics.field1586;
        for (int var16 = 0; var16 < field477; var16++) {
            if (field484[var16] + field322[var16] > var12 && field322[var16] < var12 + var14 && field552[var16] + field316[var16] > var13 && field316[var16] < var13 + var15) {
                field392[var16] = true;
            }
        }
    }

    @ObfuscatedName("at.ba(IIIIB)V")
    public static final void method876(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field477; var4++) {
            if (field484[var4] + field322[var4] > arg0 && field322[var4] < arg0 + arg2 && field552[var4] + field316[var4] > arg1 && field316[var4] < arg1 + arg3) {
                field479[var4] = true;
            }
        }
    }

    @ObfuscatedName("az.bq(III)V")
    public static final void method728(int arg0, int arg1) {
        int var2 = Statics.field1607.method3758(class158.field2450);
        for (int var3 = 0; var3 < field416; var3++) {
            int var4 = Statics.field1607.method3758(method2064(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field416 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field103) {
            var6 = Statics.field103 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field902) {
            var7 = Statics.field902 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field454 = true;
        Statics.field2666 = var6;
        Statics.field664 = var7;
        Statics.field257 = var2;
        Statics.field1586 = field416 * 15 + 22;
    }

    @ObfuscatedName("fi.bc(II)Z")
    public static final boolean method2932(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field419[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cx.bs(II)V")
    public static final void method1972(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field386[arg0];
        int var2 = field418[arg0];
        int var3 = field419[arg0];
        int var4 = field503[arg0];
        String var5 = field421[arg0];
        String var6 = field291[arg0];
        method8(var1, var2, var3, var4, var5, var6, class141.field2136, class141.field2137);
    }

    @ObfuscatedName("fa.by(Lan;III)V")
    public static final void method3190(class31 arg0, int arg1, int arg2) {
        method8(arg0.field685, arg0.field690, arg0.field692, arg0.field687, arg0.field688, arg0.field688, arg1, arg2);
    }

    @ObfuscatedName("h.bw(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method8(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 29) {
            field319.method2596(57);
            field319.method2349(arg1);
            class174 var8 = class174.method2807(arg1);
            if (var8.field2857 != null && var8.field2857[0][0] == 5) {
                int var9 = var8.field2857[0][1];
                if (class177.field2901[var9] != var8.field2870[0]) {
                    class177.field2901[var9] = var8.field2870[0];
                    method976(var9);
                }
            }
        }
        if (arg2 == 8) {
            class35 var10 = field518[arg3];
            if (var10 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(160);
                field319.method2394(arg3);
                field319.method2503(field430);
                field319.method2364(class138.field2096[82] ? 1 : 0);
                field319.method2349(Statics.field168);
            }
        }
        if (arg2 == 1005) {
            class174 var11 = class174.method2807(arg1);
            if (var11 == null || var11.field2864[arg0] < 100000) {
                field319.method2596(232);
                field319.method2347(arg3);
            } else {
                class12.method108(27, "", var11.field2864[arg0] + " x " + class52.method1967(arg3).field1096);
            }
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 24) {
            class174 var12 = class174.method2807(arg1);
            boolean var13 = true;
            if (var12.field2749 > 0) {
                var13 = method154(var12);
            }
            if (var13) {
                field319.method2596(57);
                field319.method2349(arg1);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class174 var14 = class174.method959(arg1, arg0);
            if (var14 != null) {
                int var15 = var14.field2774;
                class174 var16 = class174.method959(arg1, arg0);
                if (var16 != null) {
                    if (var16.field2845 != null) {
                        class1 var17 = new class1();
                        var17.field19 = var16;
                        var17.field6 = arg3;
                        var17.field11 = arg5;
                        var17.field17 = var16.field2845;
                        class37.method736(var17);
                    }
                    boolean var18 = true;
                    if (var16.field2749 > 0) {
                        var18 = method154(var16);
                    }
                    if (var18) {
                        int var19 = method2898(var16);
                        int var20 = arg3 - 1;
                        boolean var21 = (var19 >> var20 + 1 & 0x1) != 0;
                        if (var21) {
                            if (arg3 == 1) {
                                field319.method2596(36);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                            if (arg3 == 2) {
                                field319.method2596(41);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                            if (arg3 == 3) {
                                field319.method2596(44);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                            if (arg3 == 4) {
                                field319.method2596(190);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                            if (arg3 == 5) {
                                field319.method2596(92);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                            if (arg3 == 6) {
                                field319.method2596(161);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                            if (arg3 == 7) {
                                field319.method2596(60);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                            if (arg3 == 8) {
                                field319.method2596(66);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                            if (arg3 == 9) {
                                field319.method2596(154);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                            if (arg3 == 10) {
                                field319.method2596(55);
                                field319.method2349(arg1);
                                field319.method2347(arg0);
                                field319.method2347(var15);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 49) {
            class3 var22 = field397[arg3];
            if (var22 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(19);
                field319.method2394(arg3);
                field319.method2384(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 47) {
            class3 var23 = field397[arg3];
            if (var23 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(80);
                field319.method2347(arg3);
                field319.method2458(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class174 var24 = class174.method959(arg1, arg0);
            if (var24 != null) {
                field319.method2596(224);
                field319.method2349(Statics.field168);
                field319.method2503(field431);
                field319.method2503(arg0);
                field319.method2503(field430);
                field319.method2394(var24.field2774);
                field319.method2402(arg1);
            }
        }
        if (arg2 == 36) {
            field319.method2596(173);
            field319.method2403(arg1);
            field319.method2464(arg3);
            field319.method2464(arg0);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 20) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(94);
            field319.method2464(Statics.field13 + arg1);
            field319.method2394(Statics.field3015 + arg0);
            field319.method2464(arg3);
            field319.method2364(class138.field2096[82] ? 1 : 0);
        }
        if (arg2 == 1004) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field319.method2596(232);
            field319.method2347(arg3);
        }
        if (arg2 == 10) {
            class35 var25 = field518[arg3];
            if (var25 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(237);
                field319.method2347(arg3);
                field319.method2458(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class35 var26 = field518[arg3];
            if (var26 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(205);
                field319.method2462(class138.field2096[82] ? 1 : 0);
                field319.method2464(arg3);
            }
        }
        if (arg2 == 46) {
            class3 var27 = field397[arg3];
            if (var27 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(96);
                field319.method2347(arg3);
                field319.method2462(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class35 var28 = field518[arg3];
            if (var28 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(145);
                field319.method2394(arg3);
                field319.method2458(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class174 var29 = class174.method959(arg1, arg0);
            if (var29 != null) {
                method2593();
                int var30 = class179.method2933(method2898(var29));
                int var31 = var29.field2774;
                class174 var32 = class174.method959(arg1, arg0);
                if (var32 != null && var32.field2866 != null) {
                    class1 var33 = new class1();
                    var33.field19 = var32;
                    var33.field17 = var32.field2866;
                    class37.method736(var33);
                }
                field431 = var31;
                field512 = true;
                Statics.field168 = arg1;
                field430 = arg0;
                Statics.field175 = var30;
                method29(var32);
                field281 = 0;
                String var34;
                if (class179.method2933(method2898(var29)) == 0) {
                    var34 = null;
                } else if (var29.field2824 == null || var29.field2824.trim().length() == 0) {
                    var34 = null;
                } else {
                    var34 = var29.field2824;
                }
                field363 = var34;
                if (field363 == null) {
                    field363 = "Null";
                }
                if (var29.field2769) {
                    field314 = var29.field2818 + class2.method3724(16777215);
                } else {
                    field314 = class2.method3724(65280) + var29.field2861 + class2.method3724(16777215);
                }
            }
            return;
        }
        if (arg2 == 41) {
            field319.method2596(99);
            field319.method2402(arg1);
            field319.method2394(arg3);
            field319.method2503(arg0);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 30 && field438 == null) {
            method235(arg1, arg0);
            field438 = class174.method959(arg1, arg0);
            method29(field438);
        }
        if (arg2 == 5) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(91);
            field319.method2464(arg3 >> 14 & 0x7FFF);
            field319.method2364(class138.field2096[82] ? 1 : 0);
            field319.method2464(Statics.field13 + arg1);
            field319.method2394(Statics.field3015 + arg0);
        }
        if (arg2 == 50) {
            class3 var35 = field397[arg3];
            if (var35 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(3);
                field319.method2462(class138.field2096[82] ? 1 : 0);
                field319.method2347(arg3);
            }
        }
        if (arg2 == 22) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(124);
            field319.method2394(Statics.field13 + arg1);
            field319.method2384(class138.field2096[82] ? 1 : 0);
            field319.method2347(arg3);
            field319.method2394(Statics.field3015 + arg0);
        }
        if (arg2 == 1003) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            class35 var36 = field518[arg3];
            if (var36 != null) {
                class40 var37 = var36.field762;
                if (var37.field893 != null) {
                    var37 = var37.method746();
                }
                if (var37 != null) {
                    field319.method2596(221);
                    field319.method2394(var37.field899);
                }
            }
        }
        if (arg2 == 43) {
            field319.method2596(157);
            field319.method2394(arg0);
            field319.method2394(arg3);
            field319.method2403(arg1);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 31) {
            field319.method2596(199);
            field319.method2503(Statics.field1376);
            field319.method2503(Statics.field215);
            field319.method2403(Statics.field1895);
            field319.method2402(arg1);
            field319.method2464(arg3);
            field319.method2464(arg0);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 18) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(118);
            field319.method2394(arg3);
            field319.method2394(Statics.field3015 + arg0);
            field319.method2464(Statics.field13 + arg1);
            field319.method2458(class138.field2096[82] ? 1 : 0);
        }
        if (arg2 == 7) {
            class35 var38 = field518[arg3];
            if (var38 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(165);
                field319.method2394(Statics.field215);
                field319.method2384(class138.field2096[82] ? 1 : 0);
                field319.method2394(Statics.field1376);
                field319.method2464(arg3);
                field319.method2402(Statics.field1895);
            }
        }
        if (arg2 == 39) {
            field319.method2596(134);
            field319.method2347(arg0);
            field319.method2401(arg1);
            field319.method2347(arg3);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 34) {
            field319.method2596(47);
            field319.method2503(arg3);
            field319.method2464(arg0);
            field319.method2402(arg1);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 45) {
            class3 var39 = field397[arg3];
            if (var39 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(49);
                field319.method2384(class138.field2096[82] ? 1 : 0);
                field319.method2394(arg3);
            }
        }
        if (arg2 == 44) {
            class3 var40 = field397[arg3];
            if (var40 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(202);
                field319.method2503(arg3);
                field319.method2462(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class3 var41 = field397[arg3];
            if (var41 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(73);
                field319.method2364(class138.field2096[82] ? 1 : 0);
                field319.method2464(arg3);
                field319.method2347(field430);
                field319.method2349(Statics.field168);
            }
        }
        if (arg2 == 6) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(148);
            field319.method2464(arg3 >> 14 & 0x7FFF);
            field319.method2384(class138.field2096[82] ? 1 : 0);
            field319.method2394(Statics.field13 + arg1);
            field319.method2503(Statics.field3015 + arg0);
        }
        if (arg2 == 26) {
            method2728();
        }
        if (arg2 == 17) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(226);
            field319.method2503(Statics.field3015 + arg0);
            field319.method2347(arg3);
            field319.method2347(Statics.field13 + arg1);
            field319.method2384(class138.field2096[82] ? 1 : 0);
            field319.method2347(field430);
            field319.method2401(Statics.field168);
        }
        if (arg2 == 32) {
            field319.method2596(174);
            field319.method2464(arg3);
            field319.method2394(arg0);
            field319.method2403(Statics.field168);
            field319.method2394(field430);
            field319.method2402(arg1);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 11) {
            class35 var42 = field518[arg3];
            if (var42 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(146);
                field319.method2347(arg3);
                field319.method2364(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(207);
            field319.method2458(class138.field2096[82] ? 1 : 0);
            field319.method2503(Statics.field13 + arg1);
            field319.method2503(arg3 >> 14 & 0x7FFF);
            field319.method2347(Statics.field3015 + arg0);
        }
        if (arg2 == 28) {
            field319.method2596(57);
            field319.method2349(arg1);
            class174 var43 = class174.method2807(arg1);
            if (var43.field2857 != null && var43.field2857[0][0] == 5) {
                int var44 = var43.field2857[0][1];
                class177.field2901[var44] = 1 - class177.field2901[var44];
                method976(var44);
            }
        }
        if (arg2 == 1002) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field319.method2596(176);
            field319.method2347(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(110);
            field319.method2394(Statics.field13 + arg1);
            field319.method2384(class138.field2096[82] ? 1 : 0);
            field319.method2503(arg3);
            field319.method2464(Statics.field3015 + arg0);
        }
        if (arg2 == 1001) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(86);
            field319.method2347(arg3 >> 14 & 0x7FFF);
            field319.method2347(Statics.field3015 + arg0);
            field319.method2347(Statics.field13 + arg1);
            field319.method2384(class138.field2096[82] ? 1 : 0);
        }
        if (arg2 == 2) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(50);
            field319.method2394(field430);
            field319.method2364(class138.field2096[82] ? 1 : 0);
            field319.method2347(Statics.field3015 + arg0);
            field319.method2347(Statics.field13 + arg1);
            field319.method2401(Statics.field168);
            field319.method2503(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 33) {
            field319.method2596(251);
            field319.method2349(arg1);
            field319.method2394(arg0);
            field319.method2347(arg3);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 1) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(34);
            field319.method2464(Statics.field13 + arg1);
            field319.method2503(Statics.field3015 + arg0);
            field319.method2402(Statics.field1895);
            field319.method2464(arg3 >> 14 & 0x7FFF);
            field319.method2347(Statics.field1376);
            field319.method2364(class138.field2096[82] ? 1 : 0);
            field319.method2503(Statics.field215);
        }
        if (arg2 == 51) {
            class3 var45 = field397[arg3];
            if (var45 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(68);
                field319.method2462(class138.field2096[82] ? 1 : 0);
                field319.method2503(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field772.method1828(Statics.field656, arg0, arg1);
        }
        if (arg2 == 16) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(107);
            field319.method2503(Statics.field3015 + arg0);
            field319.method2464(Statics.field1376);
            field319.method2403(Statics.field1895);
            field319.method2394(Statics.field13 + arg1);
            field319.method2394(arg3);
            field319.method2458(class138.field2096[82] ? 1 : 0);
            field319.method2394(Statics.field215);
        }
        if (arg2 == 42) {
            field319.method2596(13);
            field319.method2401(arg1);
            field319.method2347(arg3);
            field319.method2503(arg0);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 4) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(188);
            field319.method2347(arg3 >> 14 & 0x7FFF);
            field319.method2394(Statics.field3015 + arg0);
            field319.method2462(class138.field2096[82] ? 1 : 0);
            field319.method2347(Statics.field13 + arg1);
        }
        if (arg2 == 37) {
            field319.method2596(140);
            field319.method2394(arg0);
            field319.method2402(arg1);
            field319.method2503(arg3);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 14) {
            class3 var46 = field397[arg3];
            if (var46 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(233);
                field319.method2394(arg3);
                field319.method2503(Statics.field215);
                field319.method2403(Statics.field1895);
                field319.method2364(class138.field2096[82] ? 1 : 0);
                field319.method2464(Statics.field1376);
            }
        }
        if (arg2 == 12) {
            class35 var47 = field518[arg3];
            if (var47 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(141);
                field319.method2394(arg3);
                field319.method2458(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var48 = field397[arg3];
            if (var48 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field543 = 0;
                field508 = arg0;
                field509 = arg1;
                field319.method2596(117);
                field319.method2458(class138.field2096[82] ? 1 : 0);
                field319.method2503(arg3);
            }
        }
        if (arg2 == 40) {
            field319.method2596(180);
            field319.method2403(arg1);
            field319.method2347(arg0);
            field319.method2464(arg3);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 35) {
            field319.method2596(149);
            field319.method2401(arg1);
            field319.method2394(arg0);
            field319.method2394(arg3);
            field388 = 0;
            Statics.field218 = class174.method2807(arg1);
            field389 = arg0;
        }
        if (arg2 == 38) {
            method2593();
            class174 var49 = class174.method2807(arg1);
            field281 = 1;
            Statics.field215 = arg0;
            Statics.field1895 = arg1;
            Statics.field1376 = arg3;
            method29(var49);
            field428 = class2.method3724(16748608) + class52.method1967(arg3).field1096 + class2.method3724(16777215);
            if (field428 == null) {
                field428 = "null";
            }
            return;
        }
        if (arg2 == 19) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field543 = 0;
            field508 = arg0;
            field509 = arg1;
            field319.method2596(54);
            field319.method2384(class138.field2096[82] ? 1 : 0);
            field319.method2503(Statics.field13 + arg1);
            field319.method2347(arg3);
            field319.method2347(Statics.field3015 + arg0);
        }
        if (field281 != 0) {
            field281 = 0;
            method29(class174.method2807(Statics.field1895));
        }
        if (field512) {
            method2593();
        }
        if (Statics.field218 != null && field388 == 0) {
            method29(Statics.field218);
        }
    }

    @ObfuscatedName("dh.bi(I)V")
    public static void method2593() {
        if (!field512) {
            return;
        }
        class174 var0 = class174.method959(Statics.field168, field430);
        if (var0 != null && var0.field2837 != null) {
            class1 var1 = new class1();
            var1.field19 = var0;
            var1.field17 = var0.field2837;
            class37.method736(var1);
        }
        field512 = false;
        method29(var0);
    }

    @ObfuscatedName("w.bh(III)V")
    public static void method235(int arg0, int arg1) {
        field319.method2596(77);
        field319.method2394(arg1);
        field319.method2401(arg0);
    }

    @ObfuscatedName("dd.br(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2628(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field454 || field416 >= 500) {
            return;
        }
        field421[field416] = arg0;
        field291[field416] = arg1;
        field419[field416] = arg2;
        field503[field416] = arg3;
        field386[field416] = arg4;
        field418[field416] = arg5;
        field416++;
    }

    @ObfuscatedName("i.bf(I)V")
    public static void method100() {
        for (int var0 = 0; var0 < field416; var0++) {
            int var1 = field419[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field416 - 1) {
                    for (int var3 = var0; var3 < field416 - 1; var3++) {
                        field421[var3] = field421[var3 + 1];
                        field291[var3] = field291[var3 + 1];
                        field419[var3] = field419[var3 + 1];
                        field503[var3] = field503[var3 + 1];
                        field386[var3] = field386[var3 + 1];
                        field418[var3] = field418[var3 + 1];
                    }
                }
                field416--;
            }
        }
    }

    @ObfuscatedName("ci.bj(II)Ljava/lang/String;")
    public static String method2064(int arg0) {
        return field291[arg0].length() > 0 ? field421[arg0] + class158.field2457 + field291[arg0] : field421[arg0];
    }

    @ObfuscatedName("cx.bl(Laa;IIII)V")
    public static final void method1971(class40 arg0, int arg1, int arg2, int arg3) {
        if (field416 >= 400) {
            return;
        }
        if (arg0.field893 != null) {
            arg0 = arg0.method746();
        }
        if (arg0 == null || !arg0.field881 || arg0.field898 && field380 != arg1) {
            return;
        }
        String var4 = arg0.field868;
        if (arg0.field866 != 0) {
            int var6 = arg0.field866;
            int var7 = Statics.field1054.field42;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method3724(16711680);
            } else if (var8 < -6) {
                var9 = class2.method3724(16723968);
            } else if (var8 < -3) {
                var9 = class2.method3724(16740352);
            } else if (var8 < 0) {
                var9 = class2.method3724(16756736);
            } else if (var8 > 9) {
                var9 = class2.method3724(65280);
            } else if (var8 > 6) {
                var9 = class2.method3724(4259584);
            } else if (var8 > 3) {
                var9 = class2.method3724(8453888);
            } else if (var8 > 0) {
                var9 = class2.method3724(12648192);
            } else {
                var9 = class2.method3724(16776960);
            }
            var4 = var4 + var9 + " " + class2.field20 + class158.field2453 + arg0.field866 + class2.field32;
        }
        if (field281 == 1) {
            method2628(class158.field2512, field428 + " " + class2.field25 + " " + class2.method3724(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field512) {
            String[] var10 = arg0.field883;
            if (field445) {
                var10 = method1004(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class158.field2449)) {
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
                        method2628(var10[var11], class2.method3724(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class158.field2449)) {
                        short var14 = 0;
                        if (field336 != class21.field566) {
                            if (field336 == class21.field560 || field336 == class21.field564 && arg0.field866 > Statics.field1054.field42) {
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
                            method2628(var10[var13], class2.method3724(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2628(class158.field2516, class2.method3724(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field175 & 0x2) == 2) {
            method2628(field363, field314 + " " + class2.field25 + " " + class2.method3724(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ae.bg(Lm;IIII)V")
    public static final void method867(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1054 == arg0 || field416 >= 400) {
            return;
        }
        String var9;
        if (arg0.field40 == 0) {
            String var4 = arg0.field62[0] + arg0.field59 + arg0.field62[1];
            int var5 = arg0.field42;
            int var6 = Statics.field1054.field42;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method3724(16711680);
            } else if (var7 < -6) {
                var8 = class2.method3724(16723968);
            } else if (var7 < -3) {
                var8 = class2.method3724(16740352);
            } else if (var7 < 0) {
                var8 = class2.method3724(16756736);
            } else if (var7 > 9) {
                var8 = class2.method3724(65280);
            } else if (var7 > 6) {
                var8 = class2.method3724(4259584);
            } else if (var7 > 3) {
                var8 = class2.method3724(8453888);
            } else if (var7 > 0) {
                var8 = class2.method3724(12648192);
            } else {
                var8 = class2.method3724(16776960);
            }
            var9 = var4 + var8 + " " + class2.field20 + class158.field2453 + arg0.field42 + class2.field32 + arg0.field62[2];
        } else {
            var9 = arg0.field62[0] + arg0.field59 + arg0.field62[1] + " " + class2.field20 + class158.field2454 + arg0.field40 + class2.field32 + arg0.field62[2];
        }
        if (field281 == 1) {
            method2628(class158.field2512, field428 + " " + class2.field25 + " " + class2.method3724(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field512) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field403[var10] != null) {
                    short var11 = 0;
                    if (field403[var10].equalsIgnoreCase(class158.field2449)) {
                        if (field302 == class21.field566) {
                            continue;
                        }
                        if (field302 == class21.field560 || field302 == class21.field564 && arg0.field42 > Statics.field1054.field42) {
                            var11 = 2000;
                        }
                        if (Statics.field1054.field56 != 0 && arg0.field56 != 0) {
                            if (Statics.field1054.field56 == arg0.field56) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field404[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field511[var10] + var11;
                    method2628(field403[var10], class2.method3724(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field175 & 0x8) == 8) {
            method2628(field363, field314 + " " + class2.field25 + " " + class2.method3724(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field416; var14++) {
            if (field419[var14] == 23) {
                field291[var14] = class2.method3724(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bb.bv(IIIIIIIIB)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class174.method2240(arg0)) {
            Statics.field666 = null;
            method700(Statics.field2736[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field666 != null) {
                method700(Statics.field666, -1412584499, arg1, arg2, arg3, arg4, Statics.field161, Statics.field1378, arg7);
                Statics.field666 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field479[var8] = true;
            }
        } else {
            field479[arg7] = true;
        }
    }

    @ObfuscatedName("ao.bu([Lfb;IIIIIIIIB)V")
    public static final void method700(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1676(arg2, arg3, arg4, arg5);
        class92.method1973();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class174 var10 = arg0[var9];
            if (var10 != null && (var10.field2764 == arg1 || arg1 == -1412584499 && field447 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field322[field477] = var10.field2797 + arg6;
                    field316[field477] = var10.field2759 + arg7;
                    field484[field477] = var10.field2841;
                    field552[field477] = var10.field2747;
                    var11 = ++field477 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2735 = var11;
                var10.field2877 = field286;
                if (!var10.field2769 || !method652(var10)) {
                    if (var10.field2749 > 0) {
                        int var12 = var10.field2749;
                        if (var12 == 324) {
                            if (field548 == -1) {
                                field548 = var10.field2780;
                                field549 = var10.field2781;
                            }
                            if (field547.field2921) {
                                var10.field2780 = field548;
                            } else {
                                var10.field2780 = field549;
                            }
                        } else if (var12 == 325) {
                            if (field548 == -1) {
                                field548 = var10.field2780;
                                field549 = var10.field2781;
                            }
                            if (field547.field2921) {
                                var10.field2780 = field549;
                            } else {
                                var10.field2780 = field548;
                            }
                        } else if (var12 == 327) {
                            var10.field2796 = 150;
                            var10.field2833 = (int) (Math.sin((double) field286 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2788 = 5;
                            var10.field2777 = 0;
                        } else if (var12 == 328) {
                            var10.field2796 = 150;
                            var10.field2833 = (int) (Math.sin((double) field286 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2788 = 5;
                            var10.field2777 = 1;
                        }
                    }
                    int var13 = var10.field2797 + arg6;
                    int var14 = var10.field2759 + arg7;
                    int var15 = var10.field2776;
                    if (field447 == var10) {
                        if (arg1 != -1412584499 && !var10.field2823) {
                            Statics.field666 = arg0;
                            Statics.field161 = arg6;
                            Statics.field1378 = arg7;
                            continue;
                        }
                        if (field458 && field452) {
                            int var16 = class141.field2129;
                            int var17 = class141.field2127;
                            int var18 = var16 - field449;
                            int var19 = var17 - field450;
                            if (var18 < field453) {
                                var18 = field453;
                            }
                            if (var10.field2841 + var18 > field453 + field448.field2841) {
                                var18 = field453 + field448.field2841 - var10.field2841;
                            }
                            if (var19 < field300) {
                                var19 = field300;
                            }
                            if (var10.field2747 + var19 > field300 + field448.field2747) {
                                var19 = field300 + field448.field2747 - var10.field2747;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2823) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2821 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2821 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2841 + var13;
                        int var27 = var10.field2747 + var14;
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
                        int var30 = var10.field2841 + var13;
                        int var31 = var10.field2747 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2769 || var20 < var22 && var21 < var23) {
                        if (var10.field2749 != 0) {
                            if (var10.field2749 == 1336) {
                                if (field532) {
                                    var14 += 15;
                                    Statics.field798.method3817("Fps:" + field2185, var10.field2841 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field304) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field304) {
                                        var34 = 16711680;
                                    }
                                    Statics.field798.method3817("Mem:" + var33 + "k", var10.field2841 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2749 == 1337) {
                                field317 = var13;
                                field443 = var14;
                                method836(var13, var14, var10.field2841, var10.field2747);
                                field479[var10.field2735] = true;
                                class80.method1676(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2749 == 1338) {
                                method162();
                                class176 var35 = var10.method3155(false);
                                if (var35 != null) {
                                    class80.method1676(var13, var14, var35.field2891 + var13, var35.field2892 + var14);
                                    if (field510 == 2 || field510 == 5) {
                                        class80.method1695(var13, var14, 0, var35.field2893, var35.field2896);
                                    } else {
                                        int var36 = field522 + field347 & 0x7FF;
                                        int var37 = Statics.field1054.field817 / 32 + 48;
                                        int var38 = 464 - Statics.field1054.field841 / 32;
                                        Statics.field622.method1610(var13, var14, var35.field2891, var35.field2892, var37, var38, var36, field480 + 256, var35.field2893, var35.field2896);
                                        for (int var39 = 0; var39 < field504; var39++) {
                                            int var40 = field475[var39] * 4 + 2 - Statics.field1054.field817 / 32;
                                            int var41 = field451[var39] * 4 + 2 - Statics.field1054.field841 / 32;
                                            method983(var13, var14, var40, var41, field507[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < field315; var47++) {
                                                    class35 var48 = field518[field460[var47]];
                                                    if (var48 != null && var48.method22()) {
                                                        class40 var49 = var48.field762;
                                                        if (var49 != null && var49.field893 != null) {
                                                            var49 = var49.method746();
                                                        }
                                                        if (var49 != null && var49.field884 && var49.field881) {
                                                            int var50 = var48.field817 / 32 - Statics.field1054.field817 / 32;
                                                            int var51 = var48.field841 / 32 - Statics.field1054.field841 / 32;
                                                            method983(var13, var14, var50, var51, Statics.field353[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class33.field738;
                                                int[] var53 = class33.field739;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class3 var55 = field397[var53[var54]];
                                                    if (var55 != null && var55.method22() && !var55.field57 && Statics.field1054 != var55) {
                                                        int var56 = var55.field817 / 32 - Statics.field1054.field817 / 32;
                                                        int var57 = var55.field841 / 32 - Statics.field1054.field841 / 32;
                                                        boolean var58 = false;
                                                        if (method2282(var55.field59, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < Statics.field854; var60++) {
                                                            if (var55.field59.equals(Statics.field2006[var60].field608)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (Statics.field1054.field56 != 0 && var55.field56 != 0 && Statics.field1054.field56 == var55.field56) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            method983(var13, var14, var56, var57, Statics.field353[3], var35);
                                                        } else if (var61) {
                                                            method983(var13, var14, var56, var57, Statics.field353[4], var35);
                                                        } else if (var59) {
                                                            method983(var13, var14, var56, var57, Statics.field353[5], var35);
                                                        } else {
                                                            method983(var13, var14, var56, var57, Statics.field353[2], var35);
                                                        }
                                                    }
                                                }
                                                if (field276 != 0 && field286 % 20 < 10) {
                                                    if (field276 == 1 && field295 >= 0 && field295 < field518.length) {
                                                        class35 var62 = field518[field295];
                                                        if (var62 != null) {
                                                            int var63 = var62.field817 / 32 - Statics.field1054.field817 / 32;
                                                            int var64 = var62.field841 / 32 - Statics.field1054.field841 / 32;
                                                            method1185(var13, var14, var63, var64, Statics.field1882[1], var35);
                                                        }
                                                    }
                                                    if (field276 == 2) {
                                                        int var65 = field297 * 4 - Statics.field3015 * 4 + 2 - Statics.field1054.field817 / 32;
                                                        int var66 = field424 * 4 - Statics.field13 * 4 + 2 - Statics.field1054.field841 / 32;
                                                        method1185(var13, var14, var65, var66, Statics.field1882[1], var35);
                                                    }
                                                    if (field276 == 10 && field310 >= 0 && field310 < field397.length) {
                                                        class3 var67 = field397[field310];
                                                        if (var67 != null) {
                                                            int var68 = var67.field817 / 32 - Statics.field1054.field817 / 32;
                                                            int var69 = var67.field841 / 32 - Statics.field1054.field841 / 32;
                                                            method1185(var13, var14, var68, var69, Statics.field1882[1], var35);
                                                        }
                                                    }
                                                }
                                                if (field508 != 0) {
                                                    int var70 = field508 * 4 + 2 - Statics.field1054.field817 / 32;
                                                    int var71 = field509 * 4 + 2 - Statics.field1054.field841 / 32;
                                                    method983(var13, var14, var70, var71, Statics.field1882[0], var35);
                                                }
                                                if (!Statics.field1054.field57) {
                                                    class80.method1682(var35.field2891 / 2 + var13 - 1, var35.field2892 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class200 var44 = field365[Statics.field656][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - Statics.field1054.field817 / 32;
                                                    int var46 = var43 * 4 + 2 - Statics.field1054.field841 / 32;
                                                    method983(var13, var14, var45, var46, Statics.field353[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    field392[var11] = true;
                                }
                                class80.method1676(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2749 == 1339) {
                                class176 var72 = var10.method3155(false);
                                if (var72 != null) {
                                    if (field510 < 3) {
                                        Statics.field203.method1610(var13, var14, var72.field2891, var72.field2892, 25, 25, field522, 256, var72.field2893, var72.field2896);
                                    } else {
                                        class80.method1695(var13, var14, 0, var72.field2893, var72.field2896);
                                    }
                                }
                                class80.method1676(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2821 == 0) {
                            if (!var10.field2769 && method652(var10) && Statics.field2171 != var10) {
                                continue;
                            }
                            if (!var10.field2769) {
                                if (var10.field2767 > var10.field2785 - var10.field2747) {
                                    var10.field2767 = var10.field2785 - var10.field2747;
                                }
                                if (var10.field2767 < 0) {
                                    var10.field2767 = 0;
                                }
                            }
                            method700(arg0, var10.field2775, var20, var21, var22, var23, var13 - var10.field2766, var14 - var10.field2767, var11);
                            if (var10.field2869 != null) {
                                method700(var10.field2869, var10.field2775, var20, var21, var22, var23, var13 - var10.field2766, var14 - var10.field2767, var11);
                            }
                            class4 var73 = (class4) field435.method3498((long) var10.field2775);
                            if (var73 != null) {
                                method1066(var73.field66, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1676(arg2, arg3, arg4, arg5);
                            class92.method1973();
                        }
                        if (field488 || field481[var11] || field339 > 1) {
                            if (var10.field2821 == 0 && !var10.field2769 && var10.field2785 > var10.field2747) {
                                int var74 = var10.field2841 + var13;
                                int var75 = var10.field2767;
                                int var76 = var10.field2747;
                                int var77 = var10.field2785;
                                Statics.field3127[0].method1766(var74, var14);
                                Statics.field3127[1].method1766(var74, var14 + var76 - 16);
                                class80.method1682(var74, var14 + 16, 16, var76 - 32, field354);
                                int var78 = (var76 - 32) * var76 / var77;
                                if (var78 < 8) {
                                    var78 = 8;
                                }
                                int var79 = (var76 - 32 - var78) * var75 / (var77 - var76);
                                class80.method1682(var74, var14 + 16 + var79, 16, var78, field355);
                                class80.method1692(var74, var14 + 16 + var79, var78, field357);
                                class80.method1692(var74 + 1, var14 + 16 + var79, var78, field357);
                                class80.method1690(var74, var14 + 16 + var79, 16, field357);
                                class80.method1690(var74, var14 + 17 + var79, 16, field357);
                                class80.method1692(var74 + 15, var14 + 16 + var79, var78, field407);
                                class80.method1692(var74 + 14, var14 + 17 + var79, var78 - 1, field407);
                                class80.method1690(var74, var14 + 15 + var79 + var78, 16, field407);
                                class80.method1690(var74 + 1, var14 + 14 + var79 + var78, 15, field407);
                            }
                            if (var10.field2821 != 1) {
                                if (var10.field2821 == 2) {
                                    int var80 = 0;
                                    for (int var81 = 0; var81 < var10.field2757; var81++) {
                                        for (int var82 = 0; var82 < var10.field2756; var82++) {
                                            int var83 = (var10.field2811 + 32) * var82 + var13;
                                            int var84 = (var10.field2812 + 32) * var81 + var14;
                                            if (var80 < 20) {
                                                var83 += var10.field2813[var80];
                                                var84 += var10.field2814[var80];
                                            }
                                            if (var10.field2863[var80] > 0) {
                                                boolean var85 = false;
                                                boolean var86 = false;
                                                int var87 = var10.field2863[var80] - 1;
                                                if (var83 + 32 > arg2 && var83 < arg4 && var84 + 32 > arg3 && var84 < arg5 || Statics.field773 == var10 && field390 == var80) {
                                                    class79 var88;
                                                    if (field281 == 1 && Statics.field215 == var80 && Statics.field1895 == var10.field2775) {
                                                        var88 = class52.method625(var87, var10.field2864[var80], 2, 0, 2, false);
                                                    } else {
                                                        var88 = class52.method625(var87, var10.field2864[var80], 1, 3153952, 2, false);
                                                    }
                                                    if (var88 == null) {
                                                        method29(var10);
                                                    } else if (Statics.field773 == var10 && field390 == var80) {
                                                        int var89 = class141.field2129 - field391;
                                                        int var90 = class141.field2127 - field358;
                                                        if (var89 < 5 && var89 > -5) {
                                                            var89 = 0;
                                                        }
                                                        if (var90 < 5 && var90 > -5) {
                                                            var90 = 0;
                                                        }
                                                        if (field395 < 5) {
                                                            var89 = 0;
                                                            var90 = 0;
                                                        }
                                                        var88.method1605(var83 + var89, var84 + var90, 128);
                                                        if (arg1 != -1) {
                                                            class174 var91 = arg0[arg1 & 0xFFFF];
                                                            if (var84 + var90 < class80.field1401 && var91.field2767 > 0) {
                                                                int var92 = field352 * (class80.field1401 - var84 - var90) / 3;
                                                                if (var92 > field352 * 10) {
                                                                    var92 = field352 * 10;
                                                                }
                                                                if (var92 > var91.field2767) {
                                                                    var92 = var91.field2767;
                                                                }
                                                                var91.field2767 -= var92;
                                                                field358 += var92;
                                                                method29(var91);
                                                            }
                                                            if (var84 + var90 + 32 > class80.field1396 && var91.field2767 < var91.field2785 - var91.field2747) {
                                                                int var93 = field352 * (var84 + var90 + 32 - class80.field1396) / 3;
                                                                if (var93 > field352 * 10) {
                                                                    var93 = field352 * 10;
                                                                }
                                                                if (var93 > var91.field2785 - var91.field2747 - var91.field2767) {
                                                                    var93 = var91.field2785 - var91.field2747 - var91.field2767;
                                                                }
                                                                var91.field2767 += var93;
                                                                field358 -= var93;
                                                                method29(var91);
                                                            }
                                                        }
                                                    } else if (Statics.field218 == var10 && field389 == var80) {
                                                        var88.method1605(var83, var84, 128);
                                                    } else {
                                                        var88.method1599(var83, var84);
                                                    }
                                                }
                                            } else if (var10.field2815 != null && var80 < 20) {
                                                class79 var94 = var10.method3166(var80);
                                                if (var94 != null) {
                                                    var94.method1599(var83, var84);
                                                } else if (class174.field2743) {
                                                    method29(var10);
                                                }
                                            }
                                            var80++;
                                        }
                                    }
                                } else if (var10.field2821 == 3) {
                                    int var95;
                                    if (method982(var10)) {
                                        var95 = var10.field2771;
                                        if (Statics.field2171 == var10 && var10.field2773 != 0) {
                                            var95 = var10.field2773;
                                        }
                                    } else {
                                        var95 = var10.field2791;
                                        if (Statics.field2171 == var10 && var10.field2772 != 0) {
                                            var95 = var10.field2772;
                                        }
                                    }
                                    if (var10.field2761) {
                                        switch(var10.field2789.field1416) {
                                            case 1:
                                                class80.method1683(var13, var14, var10.field2841, var10.field2747, var10.field2791, var10.field2771, 256 - (var10.field2776 & 0xFF), 256 - (var10.field2848 & 0xFF));
                                                break;
                                            case 2:
                                                class80.method1684(var13, var14, var10.field2841, var10.field2747, var10.field2791, var10.field2771, 256 - (var10.field2776 & 0xFF), 256 - (var10.field2848 & 0xFF));
                                                break;
                                            case 3:
                                                class80.method1685(var13, var14, var10.field2841, var10.field2747, var10.field2791, var10.field2771, 256 - (var10.field2776 & 0xFF), 256 - (var10.field2848 & 0xFF));
                                                break;
                                            case 4:
                                                class80.method1686(var13, var14, var10.field2841, var10.field2747, var10.field2791, var10.field2771, 256 - (var10.field2776 & 0xFF), 256 - (var10.field2848 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class80.method1682(var13, var14, var10.field2841, var10.field2747, var95);
                                                } else {
                                                    class80.method1681(var13, var14, var10.field2841, var10.field2747, var95, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class80.method1700(var13, var14, var10.field2841, var10.field2747, var95);
                                    } else {
                                        class80.method1689(var13, var14, var10.field2841, var10.field2747, var95, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2821 == 4) {
                                    class225 var96 = var10.method3189();
                                    if (var96 != null) {
                                        String var97 = var10.field2876;
                                        int var98;
                                        if (method982(var10)) {
                                            var98 = var10.field2771;
                                            if (Statics.field2171 == var10 && var10.field2773 != 0) {
                                                var98 = var10.field2773;
                                            }
                                            if (var10.field2806.length() > 0) {
                                                var97 = var10.field2806;
                                            }
                                        } else {
                                            var98 = var10.field2791;
                                            if (Statics.field2171 == var10 && var10.field2772 != 0) {
                                                var98 = var10.field2772;
                                            }
                                        }
                                        if (var10.field2769 && var10.field2774 != -1) {
                                            class52 var99 = class52.method1967(var10.field2774);
                                            var97 = var99.field1096;
                                            if (var97 == null) {
                                                var97 = "null";
                                            }
                                            if ((var99.field1107 == 1 || var10.field2739 != 1) && var10.field2739 != -1) {
                                                var97 = class2.method3724(16748608) + var97 + class2.field27 + " " + 'x' + method134(var10.field2739);
                                            }
                                        }
                                        if (field438 == var10) {
                                            class158 var10000 = (class158) null;
                                            var97 = class158.field2455;
                                            var98 = var10.field2791;
                                        }
                                        if (!var10.field2769) {
                                            var97 = method2294(var97, var10);
                                        }
                                        var96.method3764(var97, var13, var14, var10.field2841, var10.field2747, var98, var10.field2758 ? 0 : -1, var10.field2808, var10.field2809, var10.field2807);
                                    } else if (class174.field2743) {
                                        method29(var10);
                                    }
                                } else if (var10.field2821 == 5) {
                                    if (var10.field2769) {
                                        class79 var101;
                                        if (var10.field2774 == -1) {
                                            var101 = var10.method3151(false);
                                        } else {
                                            var101 = class52.method625(var10.field2774, var10.field2739, var10.field2784, var10.field2834, var10.field2803, false);
                                        }
                                        if (var101 != null) {
                                            int var102 = var101.field1388;
                                            int var103 = var101.field1389;
                                            if (var10.field2783) {
                                                class80.method1677(var13, var14, var10.field2841 + var13, var10.field2747 + var14);
                                                int var104 = (var10.field2841 + (var102 - 1)) / var102;
                                                int var105 = (var10.field2747 + (var103 - 1)) / var103;
                                                for (int var106 = 0; var106 < var104; var106++) {
                                                    for (int var107 = 0; var107 < var105; var107++) {
                                                        if (var10.field2782 != 0) {
                                                            var101.method1612(var102 / 2 + var102 * var106 + var13, var103 / 2 + var103 * var107 + var14, var10.field2782, 4096);
                                                        } else if (var15 == 0) {
                                                            var101.method1599(var102 * var106 + var13, var103 * var107 + var14);
                                                        } else {
                                                            var101.method1605(var102 * var106 + var13, var103 * var107 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1676(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var108 = var10.field2841 * 4096 / var102;
                                                if (var10.field2782 != 0) {
                                                    var101.method1612(var10.field2841 / 2 + var13, var10.field2747 / 2 + var14, var10.field2782, var108);
                                                } else if (var15 != 0) {
                                                    var101.method1607(var13, var14, var10.field2841, var10.field2747, 256 - (var15 & 0xFF));
                                                } else if (var10.field2841 == var102 && var10.field2747 == var103) {
                                                    var101.method1599(var13, var14);
                                                } else {
                                                    var101.method1601(var13, var14, var10.field2841, var10.field2747);
                                                }
                                            }
                                        } else if (class174.field2743) {
                                            method29(var10);
                                        }
                                    } else {
                                        class79 var100 = var10.method3151(method982(var10));
                                        if (var100 != null) {
                                            var100.method1599(var13, var14);
                                        } else if (class174.field2743) {
                                            method29(var10);
                                        }
                                    }
                                } else if (var10.field2821 == 6) {
                                    boolean var109 = method982(var10);
                                    int var110;
                                    if (var109) {
                                        var110 = var10.field2865;
                                    } else {
                                        var110 = var10.field2849;
                                    }
                                    class106 var111 = null;
                                    int var112 = 0;
                                    if (var10.field2774 != -1) {
                                        class52 var113 = class52.method1967(var10.field2774);
                                        if (var113 != null) {
                                            class52 var114 = var113.method1026(var10.field2739);
                                            var111 = var114.method1045(1);
                                            if (var111 == null) {
                                                method29(var10);
                                            } else {
                                                var111.method2203();
                                                var112 = var111.field1444 / 2;
                                            }
                                        }
                                    } else if (var10.field2788 == 5) {
                                        if (var10.field2777 == 0) {
                                            var111 = field547.method3230((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var111 = Statics.field1054.method12();
                                        }
                                    } else if (var110 == -1) {
                                        var111 = var10.method3153((class43) null, -1, var109, Statics.field1054.field37);
                                        if (var111 == null && class174.field2743) {
                                            method29(var10);
                                        }
                                    } else {
                                        class43 var115 = class43.method2947(var110);
                                        var111 = var10.method3153(var115, var10.field2867, var109, Statics.field1054.field37);
                                        if (var111 == null && class174.field2743) {
                                            method29(var10);
                                        }
                                    }
                                    class92.method1987(var10.field2841 / 2 + var13, var10.field2747 / 2 + var14);
                                    int var116 = var10.field2744 * class92.field1572[var10.field2796] >> 16;
                                    int var117 = var10.field2744 * class92.field1573[var10.field2796] >> 16;
                                    if (var111 != null) {
                                        if (var10.field2769) {
                                            var111.method2203();
                                            if (var10.field2768) {
                                                var111.method2176(0, var10.field2833, var10.field2798, var10.field2796, var10.field2794, var10.field2802 + var112 + var116, var10.field2802 + var117, var10.field2744);
                                            } else {
                                                var111.method2170(0, var10.field2833, var10.field2798, var10.field2796, var10.field2794, var10.field2802 + var112 + var116, var10.field2802 + var117);
                                            }
                                        } else {
                                            var111.method2170(0, var10.field2833, 0, var10.field2796, 0, var116, var117);
                                        }
                                    }
                                    class92.method2028();
                                } else {
                                    if (var10.field2821 == 7) {
                                        class225 var118 = var10.method3189();
                                        if (var118 == null) {
                                            if (class174.field2743) {
                                                method29(var10);
                                            }
                                            continue;
                                        }
                                        int var119 = 0;
                                        for (int var120 = 0; var120 < var10.field2757; var120++) {
                                            for (int var121 = 0; var121 < var10.field2756; var121++) {
                                                if (var10.field2863[var119] > 0) {
                                                    class52 var122 = class52.method1967(var10.field2863[var119] - 1);
                                                    String var123;
                                                    if (var122.field1107 != 1 && var10.field2864[var119] == 1) {
                                                        var123 = class2.method3724(16748608) + var122.field1096 + class2.field27;
                                                    } else {
                                                        var123 = class2.method3724(16748608) + var122.field1096 + class2.field27 + " " + 'x' + method134(var10.field2864[var119]);
                                                    }
                                                    int var124 = (var10.field2811 + 115) * var121 + var13;
                                                    int var125 = (var10.field2812 + 12) * var120 + var14;
                                                    if (var10.field2808 == 0) {
                                                        var118.method3762(var123, var124, var125, var10.field2791, var10.field2758 ? 0 : -1);
                                                    } else if (var10.field2808 == 1) {
                                                        var118.method3763(var123, var10.field2841 / 2 + var124, var125, var10.field2791, var10.field2758 ? 0 : -1);
                                                    } else {
                                                        var118.method3817(var123, var10.field2841 + var124 - 1, var125, var10.field2791, var10.field2758 ? 0 : -1);
                                                    }
                                                }
                                                var119++;
                                            }
                                        }
                                    }
                                    if (var10.field2821 == 8 && Statics.field15 == var10 && field426 == field425) {
                                        int var126 = 0;
                                        int var127 = 0;
                                        class225 var128 = Statics.field798;
                                        String var129 = var10.field2876;
                                        String var130 = method2294(var129, var10);
                                        while (var130.length() > 0) {
                                            int var131 = var130.indexOf(class2.field26);
                                            String var132;
                                            if (var131 == -1) {
                                                var132 = var130;
                                                var130 = "";
                                            } else {
                                                var132 = var130.substring(0, var131);
                                                var130 = var130.substring(var131 + 4);
                                            }
                                            int var133 = var128.method3758(var132);
                                            if (var133 > var126) {
                                                var126 = var133;
                                            }
                                            var127 += var128.field3193 + 1;
                                        }
                                        var126 += 6;
                                        var127 += 7;
                                        int var134 = var10.field2841 + var13 - 5 - var126;
                                        int var135 = var10.field2747 + var14 + 5;
                                        if (var134 < var13 + 5) {
                                            var134 = var13 + 5;
                                        }
                                        if (var126 + var134 > arg4) {
                                            var134 = arg4 - var126;
                                        }
                                        if (var127 + var135 > arg5) {
                                            var135 = arg5 - var127;
                                        }
                                        class80.method1682(var134, var135, var126, var127, 16777120);
                                        class80.method1700(var134, var135, var126, var127, 0);
                                        String var136 = var10.field2876;
                                        int var137 = var128.field3193 + var135 + 2;
                                        String var138 = method2294(var136, var10);
                                        while (var138.length() > 0) {
                                            int var139 = var138.indexOf(class2.field26);
                                            String var140;
                                            if (var139 == -1) {
                                                var140 = var138;
                                                var138 = "";
                                            } else {
                                                var140 = var138.substring(0, var139);
                                                var138 = var138.substring(var139 + 4);
                                            }
                                            var128.method3762(var140, var134 + 3, var137, 0, -1);
                                            var137 += var128.field3193 + 1;
                                        }
                                    }
                                    if (var10.field2821 == 9) {
                                        if (var10.field2778 == 1) {
                                            int var141;
                                            int var142;
                                            int var143;
                                            int var144;
                                            if (var10.field2779) {
                                                var141 = var13;
                                                var142 = var10.field2747 + var14;
                                                var143 = var10.field2841 + var13;
                                                var144 = var14;
                                            } else {
                                                var141 = var13;
                                                var142 = var14;
                                                var143 = var10.field2841 + var13;
                                                var144 = var10.field2747 + var14;
                                            }
                                            class80.method1694(var141, var142, var143, var144, var10.field2791);
                                        } else {
                                            int var145 = var10.field2841 >= 0 ? var10.field2841 : -var10.field2841;
                                            int var146 = var10.field2747 >= 0 ? var10.field2747 : -var10.field2747;
                                            int var147 = var145;
                                            if (var145 < var146) {
                                                var147 = var146;
                                            }
                                            if (var147 != 0) {
                                                int var148 = (var10.field2841 << 16) / var147;
                                                int var149 = (var10.field2747 << 16) / var147;
                                                if (var149 <= var148) {
                                                    var148 = -var148;
                                                } else {
                                                    var149 = -var149;
                                                }
                                                int var150 = var10.field2778 * var149 >> 17;
                                                int var151 = var10.field2778 * var149 + 1 >> 17;
                                                int var152 = var10.field2778 * var148 >> 17;
                                                int var153 = var10.field2778 * var148 + 1 >> 17;
                                                int var154 = var13 + var150;
                                                int var155 = var13 - var151;
                                                int var156 = var10.field2841 + var13 - var151;
                                                int var157 = var10.field2841 + var13 + var150;
                                                int var158 = var14 + var152;
                                                int var159 = var14 - var153;
                                                int var160 = var10.field2747 + var14 - var153;
                                                int var161 = var10.field2747 + var14 + var152;
                                                class92.method1981(var154, var155, var156);
                                                class92.method1978(var158, var159, var160, var154, var155, var156, var10.field2791);
                                                class92.method1981(var154, var156, var157);
                                                class92.method1978(var158, var160, var161, var154, var156, var157, var10.field2791);
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

    @ObfuscatedName("dl.bk(Ljava/lang/String;Lfb;I)Ljava/lang/String;")
    public static String method2294(String arg0, class174 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method932(arg1, var2 - 1);
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
                if (Statics.field190 != null) {
                    var8 = Statics.method129(Statics.field190.field2198);
                    if (Statics.field190.field2195 != null) {
                        var8 = (String) Statics.field190.field2195;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("u.bz(II)Ljava/lang/String;")
    public static final String method134(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3724(65408) + var1.substring(0, var1.length() - 8) + class158.field2577 + " " + class2.field20 + var1 + class2.field32 + class2.field27;
        } else if (var1.length() > 6) {
            return " " + class2.method3724(16777215) + var1.substring(0, var1.length() - 4) + class158.field2332 + " " + class2.field20 + var1 + class2.field32 + class2.field27;
        } else {
            return " " + class2.method3724(16776960) + var1 + class2.field27;
        }
    }

    @ObfuscatedName("bg.bp(ZI)V")
    public static final void method1476(boolean arg0) {
        method2928(field434, Statics.field103, Statics.field902, arg0);
    }

    @ObfuscatedName("k.ce(Lfb;I)V")
    public static void method584(class174 arg0) {
        class174 var1 = arg0.field2764 == -1 ? null : class174.method2807(arg0.field2764);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field103;
            var3 = Statics.field902;
        } else {
            var2 = var1.field2841;
            var3 = var1.field2747;
        }
        method2065(arg0, var2, var3, false);
        method2143(arg0, var2, var3);
    }

    @ObfuscatedName("db.cn([Lfb;Lfb;ZI)V")
    public static void method2309(class174[] arg0, class174 arg1, boolean arg2) {
        int var3 = arg1.field2838 == 0 ? arg1.field2841 : arg1.field2838;
        int var4 = arg1.field2785 == 0 ? arg1.field2747 : arg1.field2785;
        method2919(arg0, arg1.field2775, var3, var4, arg2);
        if (arg1.field2869 != null) {
            method2919(arg1.field2869, arg1.field2775, var3, var4, arg2);
        }
        class4 var5 = (class4) field435.method3498((long) arg1.field2775);
        if (var5 != null) {
            method2928(var5.field66, var3, var4, arg2);
        }
        if (arg1.field2749 == 1337) {
        }
    }

    @ObfuscatedName("fr.cr(IIIZI)V")
    public static final void method2928(int arg0, int arg1, int arg2, boolean arg3) {
        if (class174.method2240(arg0)) {
            method2919(Statics.field2736[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("es.ca([Lfb;IIIZB)V")
    public static void method2919(class174[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class174 var6 = arg0[var5];
            if (var6 != null && var6.field2764 == arg1) {
                method2065(var6, arg2, arg3, arg4);
                method2143(var6, arg2, arg3);
                if (var6.field2766 > var6.field2838 - var6.field2841) {
                    var6.field2766 = var6.field2838 - var6.field2841;
                }
                if (var6.field2766 < 0) {
                    var6.field2766 = 0;
                }
                if (var6.field2767 > var6.field2785 - var6.field2747) {
                    var6.field2767 = var6.field2785 - var6.field2747;
                }
                if (var6.field2767 < 0) {
                    var6.field2767 = 0;
                }
                if (var6.field2821 == 0) {
                    method2309(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ci.cu(Lfb;IIZI)V")
    public static void method2065(class174 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2841;
        int var5 = arg0.field2747;
        if (arg0.field2752 == 0) {
            arg0.field2841 = arg0.field2756;
        } else if (arg0.field2752 == 1) {
            arg0.field2841 = arg1 - arg0.field2756;
        } else if (arg0.field2752 == 2) {
            arg0.field2841 = arg0.field2756 * arg1 >> 14;
        }
        if (arg0.field2753 == 0) {
            arg0.field2747 = arg0.field2757;
        } else if (arg0.field2753 == 1) {
            arg0.field2747 = arg2 - arg0.field2757;
        } else if (arg0.field2753 == 2) {
            arg0.field2747 = arg0.field2757 * arg2 >> 14;
        }
        if (arg0.field2752 == 4) {
            arg0.field2841 = arg0.field2847 * arg0.field2747 / arg0.field2763;
        }
        if (arg0.field2753 == 4) {
            arg0.field2747 = arg0.field2841 * arg0.field2763 / arg0.field2847;
        }
        if (field444 && arg0.field2821 == 0) {
            if (arg0.field2747 < 5 && arg0.field2841 < 5) {
                arg0.field2747 = 5;
                arg0.field2841 = 5;
            } else {
                if (arg0.field2747 <= 0) {
                    arg0.field2747 = 5;
                }
                if (arg0.field2841 <= 0) {
                    arg0.field2841 = 5;
                }
            }
        }
        if (arg0.field2749 == 1337) {
            field299 = arg0;
        }
        if (arg3 && arg0.field2859 != null && (arg0.field2841 != var4 || arg0.field2747 != var5)) {
            class1 var6 = new class1();
            var6.field19 = arg0;
            var6.field17 = arg0.field2859;
            field473.method3535(var6);
        }
    }

    @ObfuscatedName("cw.cf(Lfb;III)V")
    public static void method2143(class174 arg0, int arg1, int arg2) {
        if (arg0.field2750 == 0) {
            arg0.field2797 = arg0.field2754;
        } else if (arg0.field2750 == 1) {
            arg0.field2797 = (arg1 - arg0.field2841) / 2 + arg0.field2754;
        } else if (arg0.field2750 == 2) {
            arg0.field2797 = arg1 - arg0.field2841 - arg0.field2754;
        } else if (arg0.field2750 == 3) {
            arg0.field2797 = arg0.field2754 * arg1 >> 14;
        } else if (arg0.field2750 == 4) {
            arg0.field2797 = (arg0.field2754 * arg1 >> 14) + (arg1 - arg0.field2841) / 2;
        } else {
            arg0.field2797 = arg1 - arg0.field2841 - (arg0.field2754 * arg1 >> 14);
        }
        if (arg0.field2751 == 0) {
            arg0.field2759 = arg0.field2755;
        } else if (arg0.field2751 == 1) {
            arg0.field2759 = (arg2 - arg0.field2747) / 2 + arg0.field2755;
        } else if (arg0.field2751 == 2) {
            arg0.field2759 = arg2 - arg0.field2747 - arg0.field2755;
        } else if (arg0.field2751 == 3) {
            arg0.field2759 = arg0.field2755 * arg2 >> 14;
        } else if (arg0.field2751 == 4) {
            arg0.field2759 = (arg0.field2755 * arg2 >> 14) + (arg2 - arg0.field2747) / 2;
        } else {
            arg0.field2759 = arg2 - arg0.field2747 - (arg0.field2755 * arg2 >> 14);
        }
        if (!field444 || arg0.field2821 != 0) {
            return;
        }
        if (arg0.field2797 < 0) {
            arg0.field2797 = 0;
        } else if (arg0.field2841 + arg0.field2797 > arg1) {
            arg0.field2797 = arg1 - arg0.field2841;
        }
        if (arg0.field2759 < 0) {
            arg0.field2759 = 0;
        } else if (arg0.field2759 + arg0.field2747 > arg2) {
            arg0.field2759 = arg2 - arg0.field2747;
        }
    }

    @ObfuscatedName("af.ck(Lfb;I)Z")
    public static final boolean method982(class174 arg0) {
        if (arg0.field2854 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2854.length; var1++) {
            int var2 = method932(arg0, var1);
            int var3 = arg0.field2870[var1];
            if (arg0.field2854[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2854[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2854[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("aw.cs(Lfb;II)I")
    public static final int method932(class174 arg0, int arg1) {
        if (arg0.field2857 == null || arg1 >= arg0.field2857.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2857[arg1];
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
                    var7 = field412[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field413[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class174 var11 = class174.method2807(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method1967(var12).field1109 || field280)) {
                        for (int var13 = 0; var13 < var11.field2863.length; var13++) {
                            if (var12 + 1 == var11.field2863[var13]) {
                                var7 += var11.field2864[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class177.field2901[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class156.field2280[field412[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class177.field2901[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1054.field42;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class156.field2279[var14]) {
                            var7 += field412[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class174 var17 = class174.method2807(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method1967(var18).field1109 || field280)) {
                        for (int var19 = 0; var19 < var17.field2863.length; var19++) {
                            if (var18 + 1 == var17.field2863[var19]) {
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
                    var7 = field414;
                }
                if (var6 == 13) {
                    int var20 = class177.field2901[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class177.method1227(var22);
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
                    var7 = (Statics.field1054.field817 >> 7) + Statics.field3015;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1054.field841 >> 7) + Statics.field13;
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

    @ObfuscatedName("i.cj(Lfb;III)V")
    public static final void method99(class174 arg0, int arg1, int arg2) {
        if (arg0.field2748 == 1) {
            method2628(arg0.field2862, "", 24, 0, 0, arg0.field2775);
        }
        if (arg0.field2748 == 2 && !field512) {
            String var3;
            if (class179.method2933(method2898(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2824 == null || arg0.field2824.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2824;
            }
            if (var3 != null) {
                method2628(var3, class2.method3724(65280) + arg0.field2861, 25, 0, -1, arg0.field2775);
            }
        }
        if (arg0.field2748 == 3) {
            method2628(class158.field2536, "", 26, 0, 0, arg0.field2775);
        }
        if (arg0.field2748 == 4) {
            method2628(arg0.field2862, "", 28, 0, 0, arg0.field2775);
        }
        if (arg0.field2748 == 5) {
            method2628(arg0.field2862, "", 29, 0, 0, arg0.field2775);
        }
        if (arg0.field2748 == 6 && field438 == null) {
            method2628(arg0.field2862, "", 30, 0, -1, arg0.field2775);
        }
        if (arg0.field2821 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2747; var6++) {
                for (int var7 = 0; var7 < arg0.field2841; var7++) {
                    int var8 = (arg0.field2811 + 32) * var7;
                    int var9 = (arg0.field2812 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2813[var5];
                        var9 += arg0.field2814[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field393 = var5;
                        Statics.field2658 = arg0;
                        if (arg0.field2863[var5] > 0) {
                            class52 var10 = class52.method1967(arg0.field2863[var5] - 1);
                            if (field281 == 1 && class179.method2450(method2898(arg0))) {
                                if (Statics.field1895 != arg0.field2775 || Statics.field215 != var5) {
                                    method2628(class158.field2512, field428 + " " + class2.field25 + " " + class2.method3724(16748608) + var10.field1096, 31, var10.field1094, var5, arg0.field2775);
                                }
                            } else if (!field512 || !class179.method2450(method2898(arg0))) {
                                String[] var11 = var10.field1111;
                                if (field445) {
                                    var11 = method1004(var11);
                                }
                                if (class179.method2450(method2898(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 36;
                                            } else {
                                                var13 = 37;
                                            }
                                            method2628(var11[var12], class2.method3724(16748608) + var10.field1096, var13, var10.field1094, var5, arg0.field2775);
                                        } else if (var12 == 4) {
                                            method2628(class158.field2301, class2.method3724(16748608) + var10.field1096, 37, var10.field1094, var5, arg0.field2775);
                                        }
                                    }
                                }
                                int var14 = method2898(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    method2628(class158.field2512, class2.method3724(16748608) + var10.field1096, 38, var10.field1094, var5, arg0.field2775);
                                }
                                int var16 = method2898(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17 && var11 != null) {
                                    for (int var18 = 2; var18 >= 0; var18--) {
                                        if (var11[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 33;
                                            }
                                            if (var18 == 1) {
                                                var19 = 34;
                                            }
                                            if (var18 == 2) {
                                                var19 = 35;
                                            }
                                            method2628(var11[var18], class2.method3724(16748608) + var10.field1096, var19, var10.field1094, var5, arg0.field2775);
                                        }
                                    }
                                }
                                String[] var20 = arg0.field2816;
                                if (field445) {
                                    var20 = method1004(var20);
                                }
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 39;
                                            }
                                            if (var21 == 1) {
                                                var22 = 40;
                                            }
                                            if (var21 == 2) {
                                                var22 = 41;
                                            }
                                            if (var21 == 3) {
                                                var22 = 42;
                                            }
                                            if (var21 == 4) {
                                                var22 = 43;
                                            }
                                            method2628(var20[var21], class2.method3724(16748608) + var10.field1096, var22, var10.field1094, var5, arg0.field2775);
                                        }
                                    }
                                }
                                method2628(class158.field2516, class2.method3724(16748608) + var10.field1096, 1005, var10.field1094, var5, arg0.field2775);
                            } else if ((Statics.field175 & 0x10) == 16) {
                                method2628(field363, field314 + " " + class2.field25 + " " + class2.method3724(16748608) + var10.field1096, 32, var10.field1094, var5, arg0.field2775);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2769) {
            return;
        }
        if (!field512) {
            for (int var23 = 9; var23 >= 5; var23--) {
                String var24 = method926(arg0, var23);
                if (var24 != null) {
                    method2628(var24, arg0.field2818, 1007, var23 + 1, arg0.field2799, arg0.field2775);
                }
            }
            String var25;
            if (class179.method2933(method2898(arg0)) == 0) {
                var25 = null;
            } else if (arg0.field2824 == null || arg0.field2824.trim().length() == 0) {
                var25 = null;
            } else {
                var25 = arg0.field2824;
            }
            if (var25 != null) {
                method2628(var25, arg0.field2818, 25, 0, arg0.field2799, arg0.field2775);
            }
            for (int var27 = 4; var27 >= 0; var27--) {
                String var28 = method926(arg0, var27);
                if (var28 != null) {
                    method2628(var28, arg0.field2818, 57, var27 + 1, arg0.field2799, arg0.field2775);
                }
            }
            int var29 = method2898(arg0);
            boolean var30 = (var29 & 0x1) != 0;
            if (var30) {
                method2628(class158.field2305, "", 30, 0, arg0.field2799, arg0.field2775);
            }
        } else if (class179.method2238(method2898(arg0)) && (Statics.field175 & 0x20) == 32) {
            method2628(field363, field314 + " " + class2.field25 + " " + arg0.field2818, 58, 0, arg0.field2799, arg0.field2775);
        }
    }

    @ObfuscatedName("dj.cl(IIIIIIII)V")
    public static final void method2278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class174.method2240(arg0)) {
            method1502(Statics.field2736[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("bu.cv([Lfb;IIIIIIII)V")
    public static final void method1502(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class174 var9 = arg0[var8];
            if (var9 != null && (!var9.field2769 || var9.field2821 == 0 || var9.field2810 || method2898(var9) != 0 || field448 == var9 || var9.field2749 == 1338) && var9.field2764 == arg1 && (!var9.field2769 || !method652(var9))) {
                int var10 = var9.field2797 + arg6;
                int var11 = var9.field2759 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2821 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2821 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2841 + var10;
                    int var19 = var9.field2747 + var11;
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
                    int var22 = var9.field2841 + var10;
                    int var23 = var9.field2747 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field447 == var9) {
                    field470 = true;
                    field456 = var10;
                    field457 = var11;
                }
                if (!var9.field2769 || var12 < var14 && var13 < var15) {
                    int var24 = class141.field2129;
                    int var25 = class141.field2127;
                    if (class141.field2135 != 0) {
                        var24 = class141.field2136;
                        var25 = class141.field2137;
                    }
                    if (var9.field2749 == 1337) {
                        if (!field285 && !field454 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field281 == 0 && !field512) {
                                method2628(class158.field2452, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class106.field1799; var28++) {
                                int var29 = class106.field1825[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field772.method1958(Statics.field656, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method1789(var33);
                                        if (var34.field957 != null) {
                                            var34 = var34.method791();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field281 == 1) {
                                            method2628(class158.field2512, field428 + " " + class2.field25 + " " + class2.method3724(65535) + var34.field926, 1, var29, var30, var31);
                                        } else if (!field512) {
                                            String[] var35 = var34.field927;
                                            if (field445) {
                                                var35 = method1004(var35);
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
                                                        method2628(var35[var36], class2.method3724(65535) + var34.field926, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2628(class158.field2516, class2.method3724(65535) + var34.field926, 1002, var34.field925 << 14, var30, var31);
                                        } else if ((Statics.field175 & 0x4) == 4) {
                                            method2628(field363, field314 + " " + class2.field25 + " " + class2.method3724(65535) + var34.field926, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field518[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field762.field869 == 1 && (var38.field817 & 0x7F) == 64 && (var38.field841 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field315; var39++) {
                                                class35 var40 = field518[field460[var39]];
                                                if (var40 != null && var38 != var40 && var40.field762.field869 == 1 && var38.field817 == var40.field817 && var38.field841 == var40.field841) {
                                                    method1971(var40.field762, field460[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field738;
                                            int[] var42 = class33.field739;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field397[var42[var43]];
                                                if (var44 != null && var38.field817 == var44.field817 && var38.field841 == var44.field841) {
                                                    method867(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method1971(var38.field762, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field397[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field817 & 0x7F) == 64 && (var45.field841 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field315; var46++) {
                                                class35 var47 = field518[field460[var46]];
                                                if (var47 != null && var47.field762.field869 == 1 && var45.field817 == var47.field817 && var45.field841 == var47.field841) {
                                                    method1971(var47.field762, field460[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field738;
                                            int[] var49 = class33.field739;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field397[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field817 == var51.field817 && var45.field841 == var51.field841) {
                                                    method867(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field406 == var33) {
                                            var26 = var29;
                                        } else {
                                            method867(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class200 var52 = field365[Statics.field656][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3541(); var53 != null; var53 = (class29) var52.method3543()) {
                                                class52 var54 = class52.method1967(var53.field663);
                                                if (field281 == 1) {
                                                    method2628(class158.field2512, field428 + " " + class2.field25 + " " + class2.method3724(16748608) + var54.field1096, 16, var53.field663, var30, var31);
                                                } else if (!field512) {
                                                    String[] var55 = var54.field1089;
                                                    if (field445) {
                                                        var55 = method1004(var55);
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
                                                            method2628(var55[var56], class2.method3724(16748608) + var54.field1096, var57, var53.field663, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method2628(class158.field2348, class2.method3724(16748608) + var54.field1096, 20, var53.field663, var30, var31);
                                                        }
                                                    }
                                                    method2628(class158.field2516, class2.method3724(16748608) + var54.field1096, 1004, var53.field663, var30, var31);
                                                } else if ((Statics.field175 & 0x1) == 1) {
                                                    method2628(field363, field314 + " " + class2.field25 + " " + class2.method3724(16748608) + var54.field1096, 17, var53.field663, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field397[field406];
                                method867(var60, field406, var58, var59);
                            }
                        }
                    } else if (var9.field2749 == 1338) {
                        method118(var9, var10, var11);
                    } else {
                        if (!field454 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method99(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2821 == 0) {
                            if (!var9.field2769 && method652(var9) && Statics.field2171 != var9) {
                                continue;
                            }
                            method1502(arg0, var9.field2775, var12, var13, var14, var15, var10 - var9.field2766, var11 - var9.field2767);
                            if (var9.field2869 != null) {
                                method1502(var9.field2869, var9.field2775, var12, var13, var14, var15, var10 - var9.field2766, var11 - var9.field2767);
                            }
                            class4 var61 = (class4) field435.method3498((long) var9.field2775);
                            if (var61 != null) {
                                if (var61.field65 == 0 && class141.field2129 >= var12 && class141.field2127 >= var13 && class141.field2129 < var14 && class141.field2127 < var15 && !field454 && !field444) {
                                    for (class1 var62 = (class1) field473.method3540(); var62 != null; var62 = (class1) field473.method3533()) {
                                        if (var62.field2) {
                                            var62.method3639();
                                            var62.field19.field2840 = false;
                                        }
                                    }
                                    if (Statics.field1660 == 0) {
                                        field447 = null;
                                        field448 = null;
                                    }
                                    if (!field454) {
                                        field421[0] = class158.field2456;
                                        field291[0] = "";
                                        field419[0] = 1006;
                                        field416 = 1;
                                    }
                                }
                                method2278(var61.field66, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2769) {
                            if (var9.field2878) {
                                if (class141.field2129 >= var12 && class141.field2127 >= var13 && class141.field2129 < var14 && class141.field2127 < var15) {
                                    for (class1 var63 = (class1) field473.method3540(); var63 != null; var63 = (class1) field473.method3533()) {
                                        if (var63.field2) {
                                            var63.method3639();
                                            var63.field19.field2840 = false;
                                        }
                                    }
                                    if (Statics.field1660 == 0) {
                                        field447 = null;
                                        field448 = null;
                                    }
                                    if (!field454) {
                                        field421[0] = class158.field2456;
                                        field291[0] = "";
                                        field419[0] = 1006;
                                        field416 = 1;
                                    }
                                }
                            } else if (var9.field2742 && class141.field2129 >= var12 && class141.field2127 >= var13 && class141.field2129 < var14 && class141.field2127 < var15) {
                                for (class1 var64 = (class1) field473.method3540(); var64 != null; var64 = (class1) field473.method3533()) {
                                    if (var64.field2 && var64.field19.field2846 == var64.field17) {
                                        var64.method3639();
                                    }
                                }
                            }
                            boolean var65;
                            if (class141.field2129 >= var12 && class141.field2127 >= var13 && class141.field2129 < var14 && class141.field2127 < var15) {
                                var65 = true;
                            } else {
                                var65 = false;
                            }
                            boolean var66 = false;
                            if ((class141.field2128 == 1 || !Statics.field2117 && class141.field2128 == 4) && var65) {
                                var66 = true;
                            }
                            boolean var67 = false;
                            if ((class141.field2135 == 1 || !Statics.field2117 && class141.field2135 == 4) && class141.field2136 >= var12 && class141.field2137 >= var13 && class141.field2136 < var14 && class141.field2137 < var15) {
                                var67 = true;
                            }
                            if (var67) {
                                method2562(var9, class141.field2136 - var10, class141.field2137 - var11);
                            }
                            if (field447 != null && field447 != var9 && var65) {
                                int var68 = method2898(var9);
                                boolean var69 = (var68 >> 20 & 0x1) != 0;
                                if (var69) {
                                    field296 = var9;
                                }
                            }
                            if (field448 == var9) {
                                field452 = true;
                                field453 = var10;
                                field300 = var11;
                            }
                            if (var9.field2810) {
                                if (var65 && field538 != 0 && var9.field2846 != null) {
                                    class1 var70 = new class1();
                                    var70.field2 = true;
                                    var70.field19 = var9;
                                    var70.field5 = field538;
                                    var70.field17 = var9.field2846;
                                    field473.method3535(var70);
                                }
                                if (field447 != null || Statics.field773 != null || field454) {
                                    var67 = false;
                                    var66 = false;
                                    var65 = false;
                                }
                                if (!var9.field2871 && var67) {
                                    var9.field2871 = true;
                                    if (var9.field2827 != null) {
                                        class1 var71 = new class1();
                                        var71.field2 = true;
                                        var71.field19 = var9;
                                        var71.field4 = class141.field2136 - var10;
                                        var71.field5 = class141.field2137 - var11;
                                        var71.field17 = var9.field2827;
                                        field473.method3535(var71);
                                    }
                                }
                                if (var9.field2871 && var66 && var9.field2828 != null) {
                                    class1 var72 = new class1();
                                    var72.field2 = true;
                                    var72.field19 = var9;
                                    var72.field4 = class141.field2129 - var10;
                                    var72.field5 = class141.field2127 - var11;
                                    var72.field17 = var9.field2828;
                                    field473.method3535(var72);
                                }
                                if (var9.field2871 && !var66) {
                                    var9.field2871 = false;
                                    if (var9.field2829 != null) {
                                        class1 var73 = new class1();
                                        var73.field2 = true;
                                        var73.field19 = var9;
                                        var73.field4 = class141.field2129 - var10;
                                        var73.field5 = class141.field2127 - var11;
                                        var73.field17 = var9.field2829;
                                        field341.method3535(var73);
                                    }
                                }
                                if (var66 && var9.field2830 != null) {
                                    class1 var74 = new class1();
                                    var74.field2 = true;
                                    var74.field19 = var9;
                                    var74.field4 = class141.field2129 - var10;
                                    var74.field5 = class141.field2127 - var11;
                                    var74.field17 = var9.field2830;
                                    field473.method3535(var74);
                                }
                                if (!var9.field2840 && var65) {
                                    var9.field2840 = true;
                                    if (var9.field2843 != null) {
                                        class1 var75 = new class1();
                                        var75.field2 = true;
                                        var75.field19 = var9;
                                        var75.field4 = class141.field2129 - var10;
                                        var75.field5 = class141.field2127 - var11;
                                        var75.field17 = var9.field2843;
                                        field473.method3535(var75);
                                    }
                                }
                                if (var9.field2840 && var65 && var9.field2795 != null) {
                                    class1 var76 = new class1();
                                    var76.field2 = true;
                                    var76.field19 = var9;
                                    var76.field4 = class141.field2129 - var10;
                                    var76.field5 = class141.field2127 - var11;
                                    var76.field17 = var9.field2795;
                                    field473.method3535(var76);
                                }
                                if (var9.field2840 && !var65) {
                                    var9.field2840 = false;
                                    if (var9.field2852 != null) {
                                        class1 var77 = new class1();
                                        var77.field2 = true;
                                        var77.field19 = var9;
                                        var77.field4 = class141.field2129 - var10;
                                        var77.field5 = class141.field2127 - var11;
                                        var77.field17 = var9.field2852;
                                        field341.method3535(var77);
                                    }
                                }
                                if (var9.field2844 != null) {
                                    class1 var78 = new class1();
                                    var78.field19 = var9;
                                    var78.field17 = var9.field2844;
                                    field551.method3535(var78);
                                }
                                if (var9.field2801 != null && field446 > var9.field2873) {
                                    if (var9.field2839 == null || field446 - var9.field2873 > 32) {
                                        class1 var83 = new class1();
                                        var83.field19 = var9;
                                        var83.field17 = var9.field2801;
                                        field473.method3535(var83);
                                    } else {
                                        label829: for (int var79 = var9.field2873; var79 < field446; var79++) {
                                            int var80 = field442[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var9.field2839.length; var81++) {
                                                if (var9.field2839[var81] == var80) {
                                                    class1 var82 = new class1();
                                                    var82.field19 = var9;
                                                    var82.field17 = var9.field2801;
                                                    field473.method3535(var82);
                                                    break label829;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2873 = field446;
                                }
                                if (var9.field2770 != null && field463 > var9.field2832) {
                                    if (var9.field2879 == null || field463 - var9.field2832 > 32) {
                                        class1 var88 = new class1();
                                        var88.field19 = var9;
                                        var88.field17 = var9.field2770;
                                        field473.method3535(var88);
                                    } else {
                                        label805: for (int var84 = var9.field2832; var84 < field463; var84++) {
                                            int var85 = field462[var84 & 0x1F];
                                            for (int var86 = 0; var86 < var9.field2879.length; var86++) {
                                                if (var9.field2879[var86] == var85) {
                                                    class1 var87 = new class1();
                                                    var87.field19 = var9;
                                                    var87.field17 = var9.field2770;
                                                    field473.method3535(var87);
                                                    break label805;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2832 = field463;
                                }
                                if (var9.field2842 != null && field497 > var9.field2875) {
                                    if (var9.field2765 == null || field497 - var9.field2875 > 32) {
                                        class1 var93 = new class1();
                                        var93.field19 = var9;
                                        var93.field17 = var9.field2842;
                                        field473.method3535(var93);
                                    } else {
                                        label781: for (int var89 = var9.field2875; var89 < field497; var89++) {
                                            int var90 = field464[var89 & 0x1F];
                                            for (int var91 = 0; var91 < var9.field2765.length; var91++) {
                                                if (var9.field2765[var91] == var90) {
                                                    class1 var92 = new class1();
                                                    var92.field19 = var9;
                                                    var92.field17 = var9.field2842;
                                                    field473.method3535(var92);
                                                    break label781;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2875 = field497;
                                }
                                if (field501 > var9.field2872 && var9.field2745 != null) {
                                    class1 var94 = new class1();
                                    var94.field19 = var9;
                                    var94.field17 = var9.field2745;
                                    field473.method3535(var94);
                                }
                                if (field467 > var9.field2872 && var9.field2856 != null) {
                                    class1 var95 = new class1();
                                    var95.field19 = var9;
                                    var95.field17 = var9.field2856;
                                    field473.method3535(var95);
                                }
                                if (field468 > var9.field2872 && var9.field2836 != null) {
                                    class1 var96 = new class1();
                                    var96.field19 = var9;
                                    var96.field17 = var9.field2836;
                                    field473.method3535(var96);
                                }
                                if (field469 > var9.field2872 && var9.field2855 != null) {
                                    class1 var97 = new class1();
                                    var97.field19 = var9;
                                    var97.field17 = var9.field2855;
                                    field473.method3535(var97);
                                }
                                if (field485 > var9.field2872 && var9.field2831 != null) {
                                    class1 var98 = new class1();
                                    var98.field19 = var9;
                                    var98.field17 = var9.field2831;
                                    field473.method3535(var98);
                                }
                                if (field471 > var9.field2872 && var9.field2851 != null) {
                                    class1 var99 = new class1();
                                    var99.field19 = var9;
                                    var99.field17 = var9.field2851;
                                    field473.method3535(var99);
                                }
                                var9.field2872 = field459;
                                if (var9.field2786 != null) {
                                    for (int var100 = 0; var100 < field411; var100++) {
                                        class1 var101 = new class1();
                                        var101.field19 = var9;
                                        var101.field9 = field499[var100];
                                        var101.field1 = field498[var100];
                                        var101.field17 = var9.field2786;
                                        field473.method3535(var101);
                                    }
                                }
                            }
                        }
                        if (!var9.field2769 && field447 == null && Statics.field773 == null && !field454) {
                            if ((var9.field2860 >= 0 || var9.field2772 != 0) && class141.field2129 >= var12 && class141.field2127 >= var13 && class141.field2129 < var14 && class141.field2127 < var15) {
                                if (var9.field2860 >= 0) {
                                    Statics.field2171 = arg0[var9.field2860];
                                } else {
                                    Statics.field2171 = var9;
                                }
                            }
                            if (var9.field2821 == 8 && class141.field2129 >= var12 && class141.field2127 >= var13 && class141.field2129 < var14 && class141.field2127 < var15) {
                                Statics.field15 = var9;
                            }
                            if (var9.field2785 > var9.field2747) {
                                int var102 = var9.field2841 + var10;
                                int var103 = var9.field2747;
                                int var104 = var9.field2785;
                                int var105 = class141.field2129;
                                int var106 = class141.field2127;
                                if (field423) {
                                    field359 = 32;
                                } else {
                                    field359 = 0;
                                }
                                field423 = false;
                                if (class141.field2128 == 1 || !Statics.field2117 && class141.field2128 == 4) {
                                    if (var105 >= var102 && var105 < var102 + 16 && var106 >= var11 && var106 < var11 + 16) {
                                        var9.field2767 -= 4;
                                        method29(var9);
                                    } else if (var105 >= var102 && var105 < var102 + 16 && var106 >= var11 + var103 - 16 && var106 < var11 + var103) {
                                        var9.field2767 += 4;
                                        method29(var9);
                                    } else if (var105 >= var102 - field359 && var105 < field359 + var102 + 16 && var106 >= var11 + 16 && var106 < var11 + var103 - 16) {
                                        int var107 = (var103 - 32) * var103 / var104;
                                        if (var107 < 8) {
                                            var107 = 8;
                                        }
                                        int var108 = var106 - var11 - 16 - var107 / 2;
                                        int var109 = var103 - 32 - var107;
                                        var9.field2767 = (var104 - var103) * var108 / var109;
                                        method29(var9);
                                        field423 = true;
                                    }
                                }
                                if (field538 != 0) {
                                    int var110 = var9.field2841;
                                    if (var105 >= var102 - var110 && var106 >= var11 && var105 < var102 + 16 && var106 <= var11 + var103) {
                                        var9.field2767 += field538 * 45;
                                        method29(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.cp([Lfb;II)V")
    public static final void method39(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2821 == 0) {
                    if (var3.field2869 != null) {
                        method39(var3.field2869, arg1);
                    }
                    class4 var4 = (class4) field435.method3498((long) var3.field2775);
                    if (var4 != null) {
                        int var5 = var4.field66;
                        if (class174.method2240(var5)) {
                            method39(Statics.field2736[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2825 != null) {
                    class1 var6 = new class1();
                    var6.field19 = var3;
                    var6.field17 = var3.field2825;
                    class37.method736(var6);
                }
                if (arg1 == 1 && var3.field2853 != null) {
                    if (var3.field2799 >= 0) {
                        class174 var7 = class174.method2807(var3.field2775);
                        if (var7 == null || var7.field2869 == null || var3.field2799 >= var7.field2869.length || var7.field2869[var3.field2799] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field19 = var3;
                    var8.field17 = var3.field2853;
                    class37.method736(var8);
                }
            }
        }
    }

    @ObfuscatedName("dx.cx(Lfb;III)V")
    public static final void method2562(class174 arg0, int arg1, int arg2) {
        if (field447 != null || field454 || arg0 == null) {
            return;
        }
        class174 var3 = arg0;
        int var4 = class179.method3144(method2898(arg0));
        class174 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class174.method2807(var3.field2764);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class174 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2820;
        }
        if (var7 == null) {
            return;
        }
        field447 = arg0;
        class174 var9 = arg0;
        int var10 = class179.method3144(method2898(arg0));
        class174 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class174.method2807(var9.field2764);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class174 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2820;
        }
        field448 = var13;
        field449 = arg1;
        field450 = arg2;
        Statics.field1660 = 0;
        field458 = false;
        if (field416 > 0) {
            int var15 = field416 - 1;
            Statics.field2926 = new class31();
            Statics.field2926.field685 = field386[var15];
            Statics.field2926.field690 = field418[var15];
            Statics.field2926.field692 = field419[var15];
            Statics.field2926.field687 = field503[var15];
            Statics.field2926.field688 = field421[var15];
        }
        return;
    }

    @ObfuscatedName("i.co(IIB)V")
    public static void method103(int arg0, int arg1) {
        method3190(Statics.field2926, arg0, arg1);
        Statics.field2926 = null;
    }

    @ObfuscatedName("m.cm(Lfb;I)V")
    public static void method29(class174 arg0) {
        if (field478 == arg0.field2877) {
            field479[arg0.field2735] = true;
        }
    }

    @ObfuscatedName("ad.cc([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1004(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ha.cb(IB)V")
    public static final void method3661(int arg0) {
        if (!class174.method2240(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2736[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3 != null) {
                var3.field2867 = 0;
                var3.field2868 = 0;
            }
        }
    }

    @ObfuscatedName("c.ct(IB)V")
    public static final void method106(int arg0) {
        if (class174.method2240(arg0)) {
            method97(Statics.field2736[arg0], -1);
        }
    }

    @ObfuscatedName("i.cg([Lfb;IB)V")
    public static final void method97(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null && var3.field2764 == arg1 && (!var3.field2769 || !method652(var3))) {
                if (var3.field2821 == 0) {
                    if (!var3.field2769 && method652(var3) && Statics.field2171 != var3) {
                        continue;
                    }
                    method97(arg0, var3.field2775);
                    if (var3.field2869 != null) {
                        method97(var3.field2869, var3.field2775);
                    }
                    class4 var4 = (class4) field435.method3498((long) var3.field2775);
                    if (var4 != null) {
                        method106(var4.field66);
                    }
                }
                if (var3.field2821 == 6) {
                    if (var3.field2849 != -1 || var3.field2865 != -1) {
                        boolean var5 = method982(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2865;
                        } else {
                            var6 = var3.field2849;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method2947(var6);
                            var3.field2868 += field352;
                            while (var3.field2868 > var7.field975[var3.field2867]) {
                                var3.field2868 -= var7.field975[var3.field2867];
                                var3.field2867++;
                                if (var3.field2867 >= var7.field973.length) {
                                    var3.field2867 -= var7.field968;
                                    if (var3.field2867 < 0 || var3.field2867 >= var7.field973.length) {
                                        var3.field2867 = 0;
                                    }
                                }
                                method29(var3);
                            }
                        }
                    }
                    if (var3.field2762 != 0 && !var3.field2769) {
                        int var8 = var3.field2762 >> 16;
                        int var9 = var3.field2762 << 16 >> 16;
                        int var10 = field352 * var8;
                        int var11 = field352 * var9;
                        var3.field2796 = var3.field2796 + var10 & 0x7FF;
                        var3.field2833 = var3.field2833 + var11 & 0x7FF;
                        method29(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.ci(II)V")
    public static final void method976(int arg0) {
        Statics.method193();
        class24.method2301();
        int var1 = class53.method3201(arg0).field1145;
        if (var1 == 0) {
            return;
        }
        int var2 = class177.field2901[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class92.method1983(0.9D);
                ((class96) Statics.field1567).method2050(0.9D);
            }
            if (var2 == 2) {
                class92.method1983(0.8D);
                ((class96) Statics.field1567).method2050(0.8D);
            }
            if (var2 == 3) {
                class92.method1983(0.7D);
                ((class96) Statics.field1567).method2050(0.7D);
            }
            if (var2 == 4) {
                class92.method1983(0.6D);
                ((class96) Statics.field1567).method2050(0.6D);
            }
            Statics.method3231();
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
            if (field410 != var3) {
                if (field410 == 0 && field533 != -1) {
                    class184.method2638(Statics.field2070, field533, 0, var3, false);
                    field513 = false;
                } else if (var3 == 0) {
                    class184.method3118();
                    field513 = false;
                } else {
                    class184.method811(var3);
                }
                field410 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field514 = 127;
            }
            if (var2 == 1) {
                field514 = 96;
            }
            if (var2 == 2) {
                field514 = 64;
            }
            if (var2 == 3) {
                field514 = 32;
            }
            if (var2 == 4) {
                field514 = 0;
            }
        }
        if (var1 == 5) {
            field328 = var2;
        }
        if (var1 == 6) {
            field436 = var2;
        }
        if (var1 == 9) {
            field437 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field515 = 127;
            }
            if (var2 == 1) {
                field515 = 96;
            }
            if (var2 == 2) {
                field515 = 64;
            }
            if (var2 == 3) {
                field515 = 32;
            }
            if (var2 == 4) {
                field515 = 0;
            }
        }
        if (var1 == 17) {
            field380 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field561, class21.field566, class21.field564, class21.field560 };
            field302 = (class21) class110.method2153(var4, var2);
            if (field302 == null) {
                field302 = class21.field564;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field406 = -1;
            } else {
                field406 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class21[] var5 = new class21[] { class21.field561, class21.field566, class21.field564, class21.field560 };
        field336 = (class21) class110.method2153(var5, var2);
        if (field336 == null) {
            field336 = class21.field564;
        }
    }

    @ObfuscatedName("ei.cq(B)V")
    public static final void method2728() {
        field319.method2596(245);
        for (class4 var0 = (class4) field435.method3501(); var0 != null; var0 = (class4) field435.method3502()) {
            if (var0.field65 == 0 || var0.field65 == 3) {
                method2653(var0, true);
            }
        }
        if (field438 != null) {
            method29(field438);
            field438 = null;
        }
    }

    @ObfuscatedName("be.cd(IIII)Lz;")
    public static final class4 method1183(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field66 = arg1;
        var3.field65 = arg2;
        field435.method3499(var3, (long) arg0);
        method3661(arg1);
        class174 var4 = class174.method2807(arg0);
        method29(var4);
        if (field438 != null) {
            method29(field438);
            field438 = null;
        }
        method100();
        method2309(Statics.field2736[arg0 >> 16], var4, false);
        class37.method2054(arg1);
        if (field434 != -1) {
            int var5 = field434;
            if (class174.method2240(var5)) {
                method39(Statics.field2736[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("eg.cz(Lz;ZI)V")
    public static final void method2653(class4 arg0, boolean arg1) {
        int var2 = arg0.field66;
        int var3 = (int) arg0.field3123;
        arg0.method3639();
        if (arg1 && var2 != -1 && Statics.field2793[var2]) {
            Statics.field2737.method3054(var2);
            if (Statics.field2736[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2736[var2].length; var5++) {
                    if (Statics.field2736[var2][var5] != null) {
                        if (Statics.field2736[var2][var5].field2821 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2736[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2736[var2] = null;
                }
                Statics.field2793[var2] = false;
            }
        }
        method3646(var2);
        class174 var6 = class174.method2807(var3);
        if (var6 != null) {
            method29(var6);
        }
        method100();
        if (field434 != -1) {
            int var7 = field434;
            if (class174.method2240(var7)) {
                method39(Statics.field2736[var7], 1);
            }
        }
    }

    @ObfuscatedName("r.cw(Lfb;I)Z")
    public static final boolean method154(class174 arg0) {
        int var1 = arg0.field2749;
        if (var1 == 205) {
            field306 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field547.method3242(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field547.method3226(var4, var5 == 1);
        }
        if (var1 == 324) {
            field547.method3225(false);
        }
        if (var1 == 325) {
            field547.method3225(true);
        }
        if (var1 == 326) {
            field319.method2596(222);
            field547.method3228(field319);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("be.ch(IIIILce;Lfx;I)V")
    public static final void method1185(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method983(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field522 + field347 & 0x7FF;
        int var8 = class92.field1572[var7];
        int var9 = class92.field1573[var7];
        int var10 = var8 * 256 / (field480 + 256);
        int var11 = var9 * 256 / (field480 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2240.method1592(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("af.dn(IIIILce;Lfx;I)V")
    public static final void method983(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field522 + field347 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class92.field1572[var6];
        int var9 = class92.field1573[var6];
        int var10 = var8 * 256 / (field480 + 256);
        int var11 = var9 * 256 / (field480 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1609(arg5.field2891 / 2 + var12 - arg4.field1388 / 2, arg5.field2892 / 2 - var13 - arg4.field1389 / 2, arg0, arg1, arg5.field2891, arg5.field2892, arg5.field2893, arg5.field2896);
        } else {
            arg4.method1599(arg5.field2891 / 2 + arg0 + var12 - arg4.field1388 / 2, arg5.field2892 / 2 + arg1 - var13 - arg4.field1389 / 2);
        }
    }

    @ObfuscatedName("dq.df(Ljava/lang/String;ZS)Z")
    public static boolean method2282(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = Statics.method1536(arg0, Statics.field279);
        for (int var3 = 0; var3 < field349; var3++) {
            if (var2.equalsIgnoreCase(Statics.method1536(field429[var3].field240, Statics.field279)) && (!arg1 || field429[var3].field238 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(Statics.method1536(Statics.field1054.field59, Statics.field279))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.di(Ljava/lang/String;I)Z")
    public static boolean method197(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = Statics.method1536(arg0, Statics.field279);
        for (int var2 = 0; var2 < field545; var2++) {
            class8 var3 = field546[var2];
            if (var1.equalsIgnoreCase(Statics.method1536(var3.field132, Statics.field279))) {
                return true;
            }
            if (var1.equalsIgnoreCase(Statics.method1536(var3.field134, Statics.field279))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ch.dt(Ljava/lang/String;II)V")
    public static final void method2147(String arg0, int arg1) {
        field319.method2596(142);
        field319.method2364(class120.method2308(arg0) + 1);
        field319.method2462(arg1);
        field319.method2352(arg0);
    }

    @ObfuscatedName("hy.dq(IB)V")
    public static void method3646(int arg0) {
        for (class202 var1 = (class202) field476.method3501(); var1 != null; var1 = (class202) field476.method3502()) {
            if ((var1.field3123 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3639();
            }
        }
    }

    @ObfuscatedName("ed.dm(Lfb;B)I")
    public static int method2898(class174 arg0) {
        class202 var1 = (class202) field476.method3498(((long) arg0.field2775 << 32) + (long) arg0.field2799);
        return var1 == null ? arg0.field2817 : var1.field3110;
    }

    @ObfuscatedName("an.dz(Lfb;I)Z")
    public static boolean method652(class174 arg0) {
        if (field444) {
            if (method2898(arg0) != 0) {
                return false;
            }
            if (arg0.field2821 == 0) {
                return false;
            }
        }
        return arg0.field2760;
    }

    @ObfuscatedName("aw.dg(Lfb;II)Ljava/lang/String;")
    public static String method926(class174 arg0, int arg1) {
        int var2 = method2898(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2845 == null) {
            return null;
        } else if (arg0.field2819 == null || arg0.field2819.length <= arg1 || arg0.field2819[arg1] == null || arg0.field2819[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2819[arg1];
        }
    }

    @ObfuscatedName("bm.dl(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method1212(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field432 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field432 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field432 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field432 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field432 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field3006 != null) {
            var3 = "/p=" + Statics.field3006;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field293 + "/a=" + Statics.field283 + var3 + "/";
    }

    @ObfuscatedName("em.du(Ljava/lang/String;ZB)V")
    public static void method2684(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1127; var5++) {
            class52 var6 = class52.method1967(var5);
            if ((!arg1 || var6.field1128) && var6.field1140 == -1 && var6.field1096.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1986 = -1;
                    Statics.field790 = null;
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
        Statics.field790 = var3;
        Statics.field1144 = 0;
        Statics.field1986 = var4;
        String[] var9 = new String[Statics.field1986];
        for (int var10 = 0; var10 < Statics.field1986; var10++) {
            var9[var10] = class52.method1967(var3[var10]).field1096;
        }
        class125.method2302(var9, Statics.field790);
    }
}

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
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.n")
    public static boolean field281 = true;

    @ObfuscatedName("client.q")
    public static int field282 = 1;

    @ObfuscatedName("client.t")
    public static int field436 = 0;

    @ObfuscatedName("client.u")
    public static int field284 = 0;

    @ObfuscatedName("client.v")
    public static boolean field285 = false;

    @ObfuscatedName("client.g")
    public static boolean field286 = false;

    @ObfuscatedName("client.w")
    public static class118[] field343 = new class118[4];

    @ObfuscatedName("client.r")
    public static int field287 = 0;

    @ObfuscatedName("client.i")
    public static int field289 = 0;

    @ObfuscatedName("client.a")
    public static boolean field290 = true;

    @ObfuscatedName("client.h")
    public static int field291 = 0;

    @ObfuscatedName("client.b")
    public static long field406 = 1L;

    @ObfuscatedName("client.o")
    public static int field499 = -1;

    @ObfuscatedName("client.m")
    public static int field520 = -1;

    @ObfuscatedName("client.am")
    public static int field556 = -1;

    @ObfuscatedName("client.ax")
    public static boolean field296 = true;

    @ObfuscatedName("client.ac")
    public static boolean field559 = false;

    @ObfuscatedName("client.az")
    public static int field496 = 0;

    @ObfuscatedName("client.ao")
    public static int field299 = 0;

    @ObfuscatedName("client.ak")
    public static int field300 = 0;

    @ObfuscatedName("client.aa")
    public static int field301 = 0;

    @ObfuscatedName("client.aj")
    public static int field302 = 0;

    @ObfuscatedName("client.ay")
    public static int field303 = 0;

    @ObfuscatedName("client.ae")
    public static int field304 = 0;

    @ObfuscatedName("client.aq")
    public static int field305 = 0;

    @ObfuscatedName("client.av")
    public static int field306 = 0;

    @ObfuscatedName("client.af")
    public static class41 field307 = class41.field808;

    @ObfuscatedName("client.ar")
    public static class41 field308 = class41.field808;

    @ObfuscatedName("client.as")
    public static int field309 = 0;

    @ObfuscatedName("client.an")
    public static int field397 = 0;

    @ObfuscatedName("client.al")
    public static int field387 = 0;

    @ObfuscatedName("client.bj")
    public static int field314 = 0;

    @ObfuscatedName("client.bp")
    public static int field315 = 0;

    @ObfuscatedName("client.bc")
    public static int field316 = 0;

    @ObfuscatedName("client.bh")
    public static int field317 = 0;

    @ObfuscatedName("client.bs")
    public static int field318 = 0;

    @ObfuscatedName("client.bd")
    public static byte[] field298 = null;

    @ObfuscatedName("client.cm")
    public static class36[] field534 = new class36[32768];

    @ObfuscatedName("client.ck")
    public static int field322 = 0;

    @ObfuscatedName("client.cf")
    public static int[] field351 = new int[32768];

    @ObfuscatedName("client.cj")
    public static int field293 = 0;

    @ObfuscatedName("client.cu")
    public static int[] field325 = new int[250];

    @ObfuscatedName("client.cy")
    public static class136 field326 = new class136(5000);

    @ObfuscatedName("client.cl")
    public static class136 field327 = new class136(5000);

    @ObfuscatedName("client.cg")
    public static class136 field328 = new class136(15000);

    @ObfuscatedName("client.cn")
    public static int field329 = 0;

    @ObfuscatedName("client.ce")
    public static int field330 = 0;

    @ObfuscatedName("client.cr")
    public static int field331 = 0;

    @ObfuscatedName("client.cc")
    public static int field332 = 0;

    @ObfuscatedName("client.ci")
    public static int field539 = 0;

    @ObfuscatedName("client.co")
    public static int field418 = 0;

    @ObfuscatedName("client.cv")
    public static int field467 = 0;

    @ObfuscatedName("client.cp")
    public static int field490 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field337 = false;

    @ObfuscatedName("client.dx")
    public static int field338 = 0;

    @ObfuscatedName("client.dq")
    public static int field545 = 1;

    @ObfuscatedName("client.dp")
    public static int field370 = 0;

    @ObfuscatedName("client.df")
    public static int field341 = 1;

    @ObfuscatedName("client.dw")
    public static int field342 = 0;

    @ObfuscatedName("client.de")
    public static boolean field344 = false;

    @ObfuscatedName("client.dn")
    public static int[][][] field345 = new int[4][13][13];

    @ObfuscatedName("client.dm")
    public static final int[] field346 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.db")
    public static int field347 = 0;

    @ObfuscatedName("client.dd")
    public static int field348 = 2;

    @ObfuscatedName("client.du")
    public static int field527 = 0;

    @ObfuscatedName("client.eg")
    public static int field350 = 2;

    @ObfuscatedName("client.en")
    public static int field426 = 0;

    @ObfuscatedName("client.em")
    public static int field513 = 1;

    @ObfuscatedName("client.eh")
    public static int field353 = 0;

    @ObfuscatedName("client.es")
    public static int field354 = 0;

    @ObfuscatedName("client.ee")
    public static int field355 = 2;

    @ObfuscatedName("client.er")
    public static int field356 = 0;

    @ObfuscatedName("client.ex")
    public static int field357 = 1;

    @ObfuscatedName("client.el")
    public static int field358 = 0;

    @ObfuscatedName("client.et")
    public static int field359 = 0;

    @ObfuscatedName("client.eo")
    public static int field361 = 2301979;

    @ObfuscatedName("client.ei")
    public static int field435 = 5063219;

    @ObfuscatedName("client.eq")
    public static int field363 = 3353893;

    @ObfuscatedName("client.eu")
    public static int field364 = 7759444;

    @ObfuscatedName("client.fx")
    public static boolean field283 = false;

    @ObfuscatedName("client.fe")
    public static int field366 = 0;

    @ObfuscatedName("client.fk")
    public static int field367 = 128;

    @ObfuscatedName("client.fi")
    public static int field368 = 0;

    @ObfuscatedName("client.ft")
    public static int field374 = 0;

    @ObfuscatedName("client.fu")
    public static int field471 = 0;

    @ObfuscatedName("client.fj")
    public static int field371 = 0;

    @ObfuscatedName("client.fp")
    public static int field372 = 0;

    @ObfuscatedName("client.fz")
    public static int field373 = 50;

    @ObfuscatedName("client.fb")
    public static int field384 = 0;

    @ObfuscatedName("client.fn")
    public static boolean field375 = false;

    @ObfuscatedName("client.fq")
    public static int field376 = 0;

    @ObfuscatedName("client.fm")
    public static int field429 = 0;

    @ObfuscatedName("client.fr")
    public static int field378 = 50;

    @ObfuscatedName("client.fo")
    public static int[] field379 = new int[field378];

    @ObfuscatedName("client.ff")
    public static int[] field380 = new int[field378];

    @ObfuscatedName("client.fl")
    public static int[] field474 = new int[field378];

    @ObfuscatedName("client.fy")
    public static int[] field382 = new int[field378];

    @ObfuscatedName("client.fw")
    public static int[] field508 = new int[field378];

    @ObfuscatedName("client.gj")
    public static int[] field504 = new int[field378];

    @ObfuscatedName("client.ge")
    public static int[] field385 = new int[field378];

    @ObfuscatedName("client.gd")
    public static String[] field336 = new String[field378];

    @ObfuscatedName("client.gk")
    public static int[][] field498 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field310 = 0;

    @ObfuscatedName("client.gh")
    public static int field389 = -1;

    @ObfuscatedName("client.gt")
    public static int field390 = -1;

    @ObfuscatedName("client.gm")
    public static int field551 = 0;

    @ObfuscatedName("client.gl")
    public static int field392 = 0;

    @ObfuscatedName("client.gr")
    public static int field334 = 0;

    @ObfuscatedName("client.gw")
    public static int field394 = 0;

    @ObfuscatedName("client.gv")
    public static int field395 = 0;

    @ObfuscatedName("client.gz")
    public static int field396 = 0;

    @ObfuscatedName("client.gq")
    public static int field489 = 0;

    @ObfuscatedName("client.gc")
    public static int field541 = 0;

    @ObfuscatedName("client.gs")
    public static int field399 = 0;

    @ObfuscatedName("client.gb")
    public static int field400 = 0;

    @ObfuscatedName("client.gy")
    public static boolean field401 = false;

    @ObfuscatedName("client.gu")
    public static int field405 = 0;

    @ObfuscatedName("client.gx")
    public static int field403 = 0;

    @ObfuscatedName("client.gg")
    public static class24[] field404 = new class24[2048];

    @ObfuscatedName("client.hp")
    public static int field414 = -1;

    @ObfuscatedName("client.hg")
    public static int field407 = 0;

    @ObfuscatedName("client.hy")
    public static int field408 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field409 = new int[1000];

    @ObfuscatedName("client.ht")
    public static final int[] field410 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hh")
    public static String[] field411 = new String[8];

    @ObfuscatedName("client.hz")
    public static boolean[] field412 = new boolean[8];

    @ObfuscatedName("client.hl")
    public static int[] field413 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hf")
    public static int field473 = -1;

    @ObfuscatedName("client.hj")
    public static class150[][][] field415 = new class150[4][104][104];

    @ObfuscatedName("client.he")
    public static class150 field416 = new class150();

    @ObfuscatedName("client.hx")
    public static class150 field417 = new class150();

    @ObfuscatedName("client.hv")
    public static class150 field532 = new class150();

    @ObfuscatedName("client.hc")
    public static int[] field419 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field420 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field421 = new int[25];

    @ObfuscatedName("client.hd")
    public static int field422 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field423 = false;

    @ObfuscatedName("client.hn")
    public static int field424 = 0;

    @ObfuscatedName("client.ie")
    public static int[] field425 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field339 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field427 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field524 = new int[500];

    @ObfuscatedName("client.iq")
    public static String[] field388 = new String[500];

    @ObfuscatedName("client.iu")
    public static String[] field430 = new String[500];

    @ObfuscatedName("client.ig")
    public static boolean field431 = false;

    @ObfuscatedName("client.im")
    public static int field432 = -1;

    @ObfuscatedName("client.ih")
    public static boolean field433 = false;

    @ObfuscatedName("client.ia")
    public static int field434 = -1;

    @ObfuscatedName("client.is")
    public static int field547 = -1;

    @ObfuscatedName("client.if")
    public static int field437 = 0;

    @ObfuscatedName("client.ir")
    public static int field438 = 50;

    @ObfuscatedName("client.ic")
    public static int field352 = 0;

    @ObfuscatedName("client.ix")
    public static String field440 = null;

    @ObfuscatedName("client.ip")
    public static boolean field441 = false;

    @ObfuscatedName("client.it")
    public static int field442 = -1;

    @ObfuscatedName("client.ij")
    public static int field538 = -1;

    @ObfuscatedName("client.jo")
    public static String field439 = null;

    @ObfuscatedName("client.jm")
    public static String field393 = null;

    @ObfuscatedName("client.jk")
    public static int field446 = -1;

    @ObfuscatedName("client.ja")
    public static class147 field447 = new class147(8);

    @ObfuscatedName("client.jz")
    public static int field448 = 0;

    @ObfuscatedName("client.js")
    public static int field449 = 0;

    @ObfuscatedName("client.jq")
    public static class172 field450 = null;

    @ObfuscatedName("client.jh")
    public static int field451 = 0;

    @ObfuscatedName("client.jc")
    public static int field452 = 0;

    @ObfuscatedName("client.jj")
    public static int field518 = 0;

    @ObfuscatedName("client.ji")
    public static int field311 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field279 = false;

    @ObfuscatedName("client.jr")
    public static boolean field456 = false;

    @ObfuscatedName("client.jp")
    public static boolean field457 = false;

    @ObfuscatedName("client.jv")
    public static class172 field458 = null;

    @ObfuscatedName("client.ju")
    public static class172 field459 = null;

    @ObfuscatedName("client.jt")
    public static class172 field497 = null;

    @ObfuscatedName("client.jf")
    public static int field493 = 0;

    @ObfuscatedName("client.je")
    public static int field462 = 0;

    @ObfuscatedName("client.jw")
    public static class172 field463 = null;

    @ObfuscatedName("client.jn")
    public static boolean field464 = false;

    @ObfuscatedName("client.jb")
    public static int field381 = -1;

    @ObfuscatedName("client.jy")
    public static int field466 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field377 = false;

    @ObfuscatedName("client.jl")
    public static int field468 = -1;

    @ObfuscatedName("client.ks")
    public static int field398 = -1;

    @ObfuscatedName("client.kq")
    public static boolean field470 = false;

    @ObfuscatedName("client.kx")
    public static int field312 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field472 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field444 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field454 = new int[32];

    @ObfuscatedName("client.kv")
    public static int field475 = 0;

    @ObfuscatedName("client.ka")
    public static int[] field476 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field365 = 0;

    @ObfuscatedName("client.kf")
    public static int field478 = 0;

    @ObfuscatedName("client.kb")
    public static int field479 = 0;

    @ObfuscatedName("client.kw")
    public static int field480 = 0;

    @ObfuscatedName("client.ke")
    public static int field481 = 0;

    @ObfuscatedName("client.kz")
    public static int field482 = 0;

    @ObfuscatedName("client.ki")
    public static int field483 = 0;

    @ObfuscatedName("client.kh")
    public static int field484 = 0;

    @ObfuscatedName("client.kt")
    public static class150 field485 = new class150();

    @ObfuscatedName("client.ko")
    public static class150 field477 = new class150();

    @ObfuscatedName("client.ld")
    public static class150 field487 = new class150();

    @ObfuscatedName("client.lc")
    public static class147 field428 = new class147(512);

    @ObfuscatedName("client.ls")
    public static int field491 = 0;

    @ObfuscatedName("client.lk")
    public static int field386 = -2;

    @ObfuscatedName("client.le")
    public static boolean[] field369 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field492 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field453 = new boolean[100];

    @ObfuscatedName("client.ly")
    public static int[] field362 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field544 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field569 = new int[100];

    @ObfuscatedName("client.lr")
    public static int field383 = 0;

    @ObfuscatedName("client.lx")
    public static long field297 = 0L;

    @ObfuscatedName("client.lz")
    public static boolean field500 = true;

    @ObfuscatedName("client.lg")
    public static int field294 = 1;

    @ObfuscatedName("client.lu")
    public static int field323 = 1;

    @ObfuscatedName("client.ll")
    public static int[] field503 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lj")
    public static int field324 = 0;

    @ObfuscatedName("client.la")
    public static int field469 = 0;

    @ObfuscatedName("client.li")
    public static String field461 = "";

    @ObfuscatedName("client.ml")
    public static long[] field507 = new long[100];

    @ObfuscatedName("client.ma")
    public static int field349 = 0;

    @ObfuscatedName("client.mp")
    public static int field509 = 0;

    @ObfuscatedName("client.mk")
    public static int[] field445 = new int[128];

    @ObfuscatedName("client.mi")
    public static int[] field511 = new int[128];

    @ObfuscatedName("client.mt")
    public static long field512 = -1L;

    @ObfuscatedName("client.mb")
    public static String field486 = null;

    @ObfuscatedName("client.mr")
    public static String field514 = null;

    @ObfuscatedName("client.mv")
    public static int field516 = -1;

    @ObfuscatedName("client.mf")
    public static int field517 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field506 = new int[1000];

    @ObfuscatedName("client.mo")
    public static int[] field519 = new int[1000];

    @ObfuscatedName("client.mq")
    public static class229[] field571 = new class229[1000];

    @ObfuscatedName("client.ms")
    public static int field521 = 0;

    @ObfuscatedName("client.mg")
    public static int field335 = 0;

    @ObfuscatedName("client.ne")
    public static int field523 = 0;

    @ObfuscatedName("client.nd")
    public static int field502 = 255;

    @ObfuscatedName("client.nl")
    public static int field525 = -1;

    @ObfuscatedName("client.nw")
    public static boolean field526 = false;

    @ObfuscatedName("client.nz")
    public static int field552 = 127;

    @ObfuscatedName("client.ny")
    public static int field528 = 127;

    @ObfuscatedName("client.nn")
    public static int field529 = 0;

    @ObfuscatedName("client.nr")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field531 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field443 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field494 = new int[50];

    @ObfuscatedName("client.nh")
    public static class54[] field505 = new class54[50];

    @ObfuscatedName("client.nx")
    public static boolean field535 = false;

    @ObfuscatedName("client.og")
    public static boolean[] field536 = new boolean[5];

    @ObfuscatedName("client.or")
    public static int[] field537 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field402 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field546 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.oi")
    public static short field501 = 256;

    @ObfuscatedName("client.ow")
    public static short field542 = 205;

    @ObfuscatedName("client.ok")
    public static short field543 = 256;

    @ObfuscatedName("client.oa")
    public static short field319 = 320;

    @ObfuscatedName("client.oz")
    public static short field510 = 1;

    @ObfuscatedName("client.ob")
    public static short field460 = 32767;

    @ObfuscatedName("client.ou")
    public static short field321 = 1;

    @ObfuscatedName("client.oe")
    public static short field548 = 32767;

    @ObfuscatedName("client.oo")
    public static int field549 = 0;

    @ObfuscatedName("client.oh")
    public static int field550 = 0;

    @ObfuscatedName("client.ol")
    public static int field522 = 0;

    @ObfuscatedName("client.of")
    public static int field515 = 0;

    @ObfuscatedName("client.oy")
    public static int field553 = 0;

    @ObfuscatedName("client.oc")
    public static int field554 = 0;

    @ObfuscatedName("client.ox")
    public static int field555 = 0;

    @ObfuscatedName("client.ps")
    public static class15[] field455 = new class15[400];

    @ObfuscatedName("client.pw")
    public static class152 field557 = new class152();

    @ObfuscatedName("client.pm")
    public static int field558 = 0;

    @ObfuscatedName("client.pz")
    public static class20[] field465 = new class20[400];

    @ObfuscatedName("client.px")
    public static class169 field560 = new class169();

    @ObfuscatedName("client.pa")
    public static int field561 = -1;

    @ObfuscatedName("client.pd")
    public static int field562 = -1;

    @ObfuscatedName("client.pk")
    public static class5[] field563 = new class5[8];

    @ObfuscatedName("client.pj")
    public static long field564 = -1L;

    @ObfuscatedName("client.pr")
    public static long field565 = -1L;

    @ObfuscatedName("client.ph")
    public static final class23 field566 = new class23();

    @ObfuscatedName("client.pg")
    public static int[] field567 = new int[50];

    @ObfuscatedName("client.pt")
    public static int[] field568 = new int[50];

    @ObfuscatedName("client.p(I)V")
    public final void method260() {
    }

    public final void init() {
        if (!this.method2004()) {
            return;
        }
        class219[] var1 = new class219[] { class219.field3182, class219.field3188, class219.field3190, class219.field3185, class219.field3195, class219.field3193, class219.field3184, class219.field3183, class219.field3196, class219.field3192, class219.field3191, class219.field3187, class219.field3189, class219.field3186, class219.field3181 };
        class219[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class219 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3194);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3194)) {
                    case 1:
                        field436 = Integer.parseInt(var5);
                        break;
                    case 2:
                        Statics.field98 = Integer.parseInt(var5);
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class38.field777)) {
                        }
                        break;
                    case 4:
                        class182[] var6 = new class182[] { class182.field2689, class182.field2683, class182.field2684, class182.field2695, class182.field2682, class182.field2685 };
                        Statics.field2779 = (class182) class125.method707(var6, Integer.parseInt(var5));
                        if (Statics.field2779 == class182.field2695) {
                            Statics.field758 = class233.field3277;
                        } else {
                            Statics.field758 = class233.field3275;
                        }
                    case 5:
                    case 10:
                    case 13:
                    default:
                        break;
                    case 6:
                        Statics.field1729 = class181.method1629(Integer.parseInt(var5));
                        break;
                    case 7:
                        Statics.field65 = var5;
                        break;
                    case 8:
                        field282 = Integer.parseInt(var5);
                        break;
                    case 9:
                        field284 = Integer.parseInt(var5);
                        break;
                    case 11:
                        Statics.field107 = Integer.parseInt(var5);
                        break;
                    case 12:
                        field287 = Integer.parseInt(var5);
                        break;
                    case 14:
                        Statics.field288 = var5;
                        break;
                    case 15:
                        if (var5.equalsIgnoreCase(class38.field777)) {
                            field285 = true;
                        } else {
                            field285 = false;
                        }
                }
            }
        }
        method2513();
        Statics.field941 = this.getCodeBase().getHost();
        String var7 = Statics.field1729.field2677;
        byte var8 = 0;
        try {
            Statics.field1678 = 16;
            Statics.field177 = var8;
            try {
                Statics.field35 = System.getProperty("os.name");
            } catch (Exception var28) {
                Statics.field35 = "Unknown";
            }
            Statics.field1554 = Statics.field35.toLowerCase();
            try {
                Statics.field217 = System.getProperty("user.home");
                if (Statics.field217 != null) {
                    Statics.field217 = Statics.field217 + "/";
                }
            } catch (Exception var27) {
            }
            try {
                if (Statics.field1554.startsWith("win")) {
                    if (Statics.field217 == null) {
                        Statics.field217 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field217 == null) {
                    Statics.field217 = System.getenv("HOME");
                }
                if (Statics.field217 != null) {
                    Statics.field217 = Statics.field217 + "/";
                }
            } catch (Exception var26) {
            }
            if (Statics.field217 == null) {
                Statics.field217 = "~/";
            }
            Statics.field1679 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field217, "/tmp/", "" };
            Statics.field2793 = new String[] { ".jagex_cache_" + Statics.field177, ".file_store_" + Statics.field177 };
            label154: for (int var12 = 0; var12 < 4; var12++) {
                Statics.field1677 = class105.method3197("oldschool", var7, var12);
                if (!Statics.field1677.exists()) {
                    Statics.field1677.mkdirs();
                }
                File[] var13 = Statics.field1677.listFiles();
                if (var13 == null) {
                    break;
                }
                File[] var14 = var13;
                int var15 = 0;
                while (true) {
                    if (var15 >= var14.length) {
                        break label154;
                    }
                    File var16 = var14[var15];
                    if (!class105.method641(var16, false)) {
                        break;
                    }
                    var15++;
                }
            }
            class108.method3426(Statics.field1677);
            try {
                File var17 = new File(Statics.field217, "random.dat");
                if (var17.exists()) {
                    class105.field1680 = new class73(new class74(var17, "rw", 25L), 24, 0);
                } else {
                    label134: for (int var18 = 0; var18 < Statics.field2793.length; var18++) {
                        for (int var19 = 0; var19 < Statics.field1679.length; var19++) {
                            File var20 = new File(Statics.field1679[var19] + Statics.field2793[var18] + File.separatorChar + "random.dat");
                            if (var20.exists()) {
                                class105.field1680 = new class73(new class74(var20, "rw", 25L), 24, 0);
                                break label134;
                            }
                        }
                    }
                }
                if (class105.field1680 == null) {
                    RandomAccessFile var21 = new RandomAccessFile(var17, "rw");
                    int var22 = var21.read();
                    var21.seek(0L);
                    var21.write(var22);
                    var21.seek(0L);
                    var21.close();
                    class105.field1680 = new class73(new class74(var17, "rw", 25L), 24, 0);
                }
            } catch (IOException var29) {
            }
            class105.field1681 = new class73(new class74(class108.method198("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class105.field1682 = new class73(new class74(class108.method198("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1684 = new class73[Statics.field1678];
            for (int var24 = 0; var24 < Statics.field1678; var24++) {
                Statics.field1684[var24] = new class73(new class74(class108.method198("main_file_cache.idx" + var24), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var30) {
            class102.method3059((String) null, var30);
        }
        Statics.field280 = this;
        this.method1984(765, 503, 140);
    }

    @ObfuscatedName("el.w(B)V")
    public static final void method2513() {
        class88.field1470 = false;
        field286 = false;
    }

    @ObfuscatedName("client.r(S)V")
    public final void method262() {
        Statics.field195 = field284 == 0 ? 43594 : field282 + 40000;
        Statics.field1748 = field284 == 0 ? 443 : field282 + 50000;
        Statics.field1737 = Statics.field195;
        Statics.field156 = class170.field2194;
        Statics.field1762 = class170.field2191;
        Statics.field1795 = class170.field2192;
        Statics.field2184 = class170.field2193;
        class106.method758();
        class106.method215(Statics.field1090);
        Canvas var1 = Statics.field1090;
        var1.addMouseListener(class116.field1809);
        var1.addMouseMotionListener(class116.field1809);
        var1.addFocusListener(class116.field1809);
        class107 var2;
        try {
            var2 = new class107();
        } catch (Throwable var13) {
            var2 = null;
        }
        Statics.field2829 = var2;
        if (Statics.field2829 != null) {
            Statics.field2829.method1924(Statics.field1090);
        }
        Statics.field920 = new class117(255, class105.field1681, class105.field1682, 500000);
        class74 var4 = null;
        class31 var5 = new class31();
        try {
            var4 = class105.method1111("", Statics.field2779.field2688, false);
            byte[] var6 = new byte[(int) var4.method1353()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method1342(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class31(new class130(var6));
        } catch (Exception var14) {
        }
        try {
            if (var4 != null) {
                var4.method1340();
            }
        } catch (Exception var12) {
        }
        Statics.field657 = var5;
        Statics.field29 = this.getToolkit().getSystemClipboard();
        class115.method799(this, Statics.field1731);
        if (field284 != 0) {
            field559 = true;
        }
        method3585(Statics.field657.field693);
    }

    @ObfuscatedName("client.s(I)V")
    public final void method374() {
        field291++;
        this.method329();
        while (true) {
            class150 var1 = class186.field2728;
            class183 var2;
            synchronized (class186.field2728) {
                var2 = (class183) class186.field2729.method2664();
            }
            if (var2 == null) {
                class160.method150();
                method2051();
                class106.method105();
                class116 var4 = class116.field1809;
                synchronized (class116.field1809) {
                    class116.field1800 = class116.field1802;
                    class116.field1806 = class116.field1813;
                    class116.field1807 = class116.field1804;
                    class116.field1812 = class116.field1808;
                    class116.field1803 = class116.field1811;
                    class116.field1814 = class116.field1810;
                    class116.field1815 = class116.field1818;
                    class116.field1808 = 0;
                }
                if (Statics.field2829 != null) {
                    int var6 = Statics.field2829.method1923();
                    field484 = var6;
                }
                if (field289 == 0) {
                    method3217();
                    Statics.field917.method1824();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field1774[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field1775[var8] = 0L;
                    }
                    Statics.field131 = 0;
                } else if (field289 == 5) {
                    class42.method214(this);
                    method3217();
                    Statics.field917.method1824();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field1774[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field1775[var10] = 0L;
                    }
                    Statics.field131 = 0;
                } else if (field289 == 10 || field289 == 11) {
                    class42.method214(this);
                } else if (field289 == 20) {
                    class42.method214(this);
                    method212();
                } else if (field289 == 25) {
                    Statics.method905();
                }
                if (field289 == 30) {
                    method1481();
                } else if (field289 == 40 || field289 == 45) {
                    method212();
                }
                return;
            }
            var2.field2699.method3189(var2.field2698, (int) var2.field2034, var2.field2696, false);
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method451() {
        boolean var1;
        label196: {
            try {
                if (class160.field2064 == 2) {
                    if (Statics.field146 == null) {
                        Statics.field146 = class166.method2924(Statics.field2068, Statics.field1990, Statics.field2792);
                        if (Statics.field146 == null) {
                            var1 = false;
                            break label196;
                        }
                    }
                    if (Statics.field33 == null) {
                        Statics.field33 = new class62(Statics.field2071, Statics.field2065);
                    }
                    if (Statics.field2067.method2803(Statics.field146, Statics.field2069, Statics.field33, 22050)) {
                        Statics.field2067.method2796();
                        Statics.field2067.method2821(Statics.field2070);
                        Statics.field2067.method2749(Statics.field146, Statics.field165);
                        class160.field2064 = 0;
                        Statics.field146 = null;
                        Statics.field33 = null;
                        Statics.field2068 = null;
                        var1 = true;
                        break label196;
                    }
                }
            } catch (Exception var29) {
                var29.printStackTrace();
                Statics.field2067.method2773();
                class160.field2064 = 0;
                Statics.field146 = null;
                Statics.field33 = null;
                Statics.field2068 = null;
            }
            var1 = false;
        }
        if (var1 && field526 && Statics.field71 != null) {
            Statics.field71.method1061();
        }
        if (field289 == 10 || field289 == 20 || field289 == 30) {
            if (field297 != 0L && class132.method1336() > field297) {
                int var4 = field500 ? 2 : 1;
                method3585(var4);
            } else if (field1781) {
                method3827();
            }
        }
        Dimension var5 = this.method1996();
        if (Statics.field1286 != var5.width || Statics.field222 != var5.height || field1780) {
            method2510();
            field297 = class132.method1336() + 500L;
            field1780 = false;
        }
        boolean var6 = false;
        if (field1778) {
            field1778 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field369[var7] = true;
            }
        }
        if (var6) {
            method1974();
        }
        if (field289 == 0) {
            int var8 = class42.field818;
            String var9 = class42.field830;
            Color var10 = null;
            try {
                Graphics var11 = Statics.field1090.getGraphics();
                if (Statics.field1963 == null) {
                    Statics.field1963 = new Font("Helvetica", 1, 13);
                    Statics.field1879 = Statics.field1090.getFontMetrics(Statics.field1963);
                }
                if (var6) {
                    var11.setColor(Color.black);
                    var11.fillRect(0, 0, Statics.field2761, Statics.field2727);
                }
                if (var10 == null) {
                    var10 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field184 == null) {
                        Statics.field184 = Statics.field1090.createImage(304, 34);
                    }
                    Graphics var12 = Statics.field184.getGraphics();
                    var12.setColor(var10);
                    var12.drawRect(0, 0, 303, 33);
                    var12.fillRect(2, 2, var8 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(1, 1, 301, 31);
                    var12.fillRect(var8 * 3 + 2, 2, 300 - var8 * 3, 30);
                    var12.setFont(Statics.field1963);
                    var12.setColor(Color.white);
                    var12.drawString(var9, (304 - Statics.field1879.stringWidth(var9)) / 2, 22);
                    var11.drawImage(Statics.field184, Statics.field2761 / 2 - 152, Statics.field2727 / 2 - 18, (ImageObserver) null);
                } catch (Exception var25) {
                    int var14 = Statics.field2761 / 2 - 152;
                    int var15 = Statics.field2727 / 2 - 18;
                    var11.setColor(var10);
                    var11.drawRect(var14, var15, 303, 33);
                    var11.fillRect(var14 + 2, var15 + 2, var8 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(var14 + 1, var15 + 1, 301, 31);
                    var11.fillRect(var8 * 3 + var14 + 2, var15 + 2, 300 - var8 * 3, 30);
                    var11.setFont(Statics.field1963);
                    var11.setColor(Color.white);
                    var11.drawString(var9, var14 + (304 - Statics.field1879.stringWidth(var9)) / 2, var15 + 22);
                }
            } catch (Exception var26) {
                Statics.field1090.repaint();
            }
        } else if (field289 == 5) {
            class42.method111(Statics.field1193, Statics.field767, Statics.field1543, var6);
        } else if (field289 == 10 || field289 == 11) {
            class42.method111(Statics.field1193, Statics.field767, Statics.field1543, var6);
        } else if (field289 == 20) {
            class42.method111(Statics.field1193, Statics.field767, Statics.field1543, var6);
        } else if (field289 == 25) {
            if (field342 == 1) {
                if (field338 > field545) {
                    field545 = field338;
                }
                int var17 = (field545 * 50 - field338 * 50) / field545;
                method756(class176.field2385 + class38.field781 + class38.field782 + var17 + "%" + class38.field779, false);
            } else if (field342 == 2) {
                if (field370 > field341) {
                    field341 = field370;
                }
                int var18 = (field341 * 50 - field370 * 50) / field341 + 50;
                method756(class176.field2385 + class38.field781 + class38.field782 + var18 + "%" + class38.field779, false);
            } else {
                method756(class176.field2385, false);
            }
        } else if (field289 == 30) {
            method89();
        } else if (field289 == 40) {
            method756(class176.field2523 + class38.field781 + class176.field2590, false);
        } else if (field289 == 45) {
            method756(class176.field2514, false);
        }
        if (field289 == 30 && field383 == 0 && !var6) {
            try {
                Graphics var19 = Statics.field1090.getGraphics();
                for (int var20 = 0; var20 < field491; var20++) {
                    if (field492[var20]) {
                        Statics.field1527.method3849(var19, field362[var20], field495[var20], field544[var20], field569[var20]);
                        field492[var20] = false;
                    }
                }
            } catch (Exception var28) {
                Statics.field1090.repaint();
            }
        } else if (field289 > 0) {
            try {
                Graphics var22 = Statics.field1090.getGraphics();
                Statics.field1527.method3848(var22, 0, 0);
                for (int var23 = 0; var23 < field491; var23++) {
                    field492[var23] = false;
                }
            } catch (Exception var27) {
                Statics.field1090.repaint();
            }
        }
    }

    @ObfuscatedName("client.e(S)V")
    public final void method265() {
        if (Statics.field274.method843()) {
            Statics.field274.method840();
        }
        if (Statics.field2679 != null) {
            Statics.field2679.field220 = false;
        }
        Statics.field2679 = null;
        if (Statics.field161 != null) {
            Statics.field161.method1972();
            Statics.field161 = null;
        }
        class106.method1885();
        if (class116.field1809 != null) {
            class116 var1 = class116.field1809;
            synchronized (class116.field1809) {
                class116.field1809 = null;
            }
        }
        Statics.field2829 = null;
        if (Statics.field71 != null) {
            Statics.field71.method1041();
        }
        if (Statics.field57 != null) {
            Statics.field57.method1041();
        }
        if (Statics.field2760 != null) {
            Statics.field2760.method1972();
        }
        class186.method725();
        class105.method889();
    }

    @ObfuscatedName("v.j(II)V")
    public static void method112(int arg0) {
        if (field289 == arg0) {
            return;
        }
        if (field289 == 0) {
            Statics.field184 = null;
            Statics.field1963 = null;
            Statics.field1879 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field315 = 0;
            field316 = 0;
            field317 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1980 != null) {
            Statics.field1980.method1972();
            Statics.field1980 = null;
        }
        if (field289 == 25) {
            field342 = 0;
            field338 = 0;
            field545 = 1;
            field370 = 0;
            field341 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method3398(Statics.field1090, Statics.field313, Statics.field1534, true, 0);
        } else if (arg0 == 20) {
            class42.method3398(Statics.field1090, Statics.field313, Statics.field1534, true, field289 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method3398(Statics.field1090, Statics.field313, Statics.field1534, false, 4);
        } else if (Statics.field837) {
            Statics.field814 = null;
            Statics.field815 = null;
            Statics.field1910 = null;
            Statics.field816 = null;
            Statics.field817 = null;
            Statics.field845 = null;
            Statics.field144 = null;
            Statics.field798 = null;
            Statics.field832 = null;
            Statics.field570 = null;
            Statics.field745 = null;
            Statics.field1736 = null;
            Statics.field1841 = null;
            Statics.field929 = null;
            Statics.field698 = null;
            Statics.field812 = null;
            Statics.field2707 = null;
            Statics.field1073 = null;
            Statics.field1581 = null;
            Statics.field730 = null;
            Statics.field25 = null;
            Statics.field1984 = null;
            class160.method2052(2);
            Statics.method1980(true);
            Statics.field837 = false;
        }
        field289 = arg0;
    }

    @ObfuscatedName("client.i(I)V")
    public void method329() {
        if (field289 == 1000) {
            return;
        }
        long var1 = class132.method1336();
        int var3 = (int) (var1 - Statics.field2754);
        Statics.field2754 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class188.field2753 += var3;
        boolean var4;
        if (class188.field2763 == 0 && class188.field2769 == 0 && class188.field2768 == 0 && class188.field2756 == 0) {
            var4 = true;
        } else if (Statics.field2760 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class188.field2753 > 30000) {
                        throw new IOException();
                    }
                    while (class188.field2769 < 20 && class188.field2756 > 0) {
                        class184 var5 = (class184) class188.field2773.method2614();
                        class130 var6 = new class130(4);
                        var6.method2215(1);
                        var6.method2305((int) var5.field2034);
                        Statics.field2760.method1953(var6.field1955, 0, 4);
                        class188.field2757.method2612(var5, var5.field2034);
                        class188.field2756--;
                        class188.field2769++;
                    }
                    while (class188.field2763 < 20 && class188.field2768 > 0) {
                        class184 var7 = (class184) class188.field2759.method2554();
                        class130 var8 = new class130(4);
                        var8.method2215(0);
                        var8.method2305((int) var7.field2034);
                        Statics.field2760.method1953(var8.field1955, 0, 4);
                        var7.method2689();
                        class188.field2762.method2612(var7, var7.field2034);
                        class188.field2768--;
                        class188.field2763++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2760.method1969();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class188.field2753 = 0;
                        byte var11 = 0;
                        if (Statics.field2882 == null) {
                            var11 = 8;
                        } else if (class188.field2766 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class188.field2764.field1956;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2760.method1952(class188.field2764.field1955, class188.field2764.field1956, var12);
                            if (class188.field2765 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class188.field2764.field1955[class188.field2764.field1956 + var13] ^= class188.field2765;
                                }
                            }
                            class188.field2764.field1956 += var12;
                            if (class188.field2764.field1956 < var11) {
                                break;
                            }
                            if (Statics.field2882 == null) {
                                class188.field2764.field1956 = 0;
                                int var14 = class188.field2764.method2379();
                                int var15 = class188.field2764.method2232();
                                int var16 = class188.field2764.method2379();
                                int var17 = class188.field2764.method2246();
                                long var18 = (long) ((var14 << 16) + var15);
                                class184 var20 = (class184) class188.field2757.method2611(var18);
                                Statics.field1730 = true;
                                if (var20 == null) {
                                    var20 = (class184) class188.field2762.method2611(var18);
                                    Statics.field1730 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2882 = var20;
                                Statics.field2752 = new class130(var17 + var21 + Statics.field2882.field2706);
                                Statics.field2752.method2215(var16);
                                Statics.field2752.method2218(var17);
                                class188.field2766 = 8;
                                class188.field2764.field1956 = 0;
                            } else if (class188.field2766 == 0) {
                                if (class188.field2764.field1955[0] == -1) {
                                    class188.field2766 = 1;
                                    class188.field2764.field1956 = 0;
                                } else {
                                    Statics.field2882 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2752.field1955.length - Statics.field2882.field2706;
                            int var23 = 512 - class188.field2766;
                            if (var23 > var22 - Statics.field2752.field1956) {
                                var23 = var22 - Statics.field2752.field1956;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2760.method1952(Statics.field2752.field1955, Statics.field2752.field1956, var23);
                            if (class188.field2765 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2752.field1955[Statics.field2752.field1956 + var24] ^= class188.field2765;
                                }
                            }
                            Statics.field2752.field1956 += var23;
                            class188.field2766 += var23;
                            if (Statics.field2752.field1956 == var22) {
                                if (Statics.field2882.field2034 == 16711935L) {
                                    Statics.field36 = Statics.field2752;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class187 var26 = class188.field2758[var25];
                                        if (var26 != null) {
                                            Statics.field36.field1956 = var25 * 8 + 5;
                                            int var27 = Statics.field36.method2246();
                                            int var28 = Statics.field36.method2246();
                                            var26.method3175(var27, var28);
                                        }
                                    }
                                } else {
                                    class188.field2767.reset();
                                    class188.field2767.update(Statics.field2752.field1955, 0, var22);
                                    int var29 = (int) class188.field2767.getValue();
                                    if (Statics.field2882.field2708 != var29) {
                                        try {
                                            Statics.field2760.method1972();
                                        } catch (Exception var35) {
                                        }
                                        class188.field2770++;
                                        Statics.field2760 = null;
                                        class188.field2765 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class188.field2770 = 0;
                                    class188.field2771 = 0;
                                    Statics.field2882.field2705.method3176((int) (Statics.field2882.field2034 & 0xFFFFL), Statics.field2752.field1955, (Statics.field2882.field2034 & 0xFF0000L) == 16711680L, Statics.field1730);
                                }
                                Statics.field2882.method2652();
                                if (Statics.field1730) {
                                    class188.field2769--;
                                } else {
                                    class188.field2763--;
                                }
                                class188.field2766 = 0;
                                Statics.field2882 = null;
                                Statics.field2752 = null;
                            } else {
                                if (class188.field2766 != 512) {
                                    break;
                                }
                                class188.field2766 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2760.method1972();
                } catch (Exception var34) {
                }
                class188.field2771++;
                Statics.field2760 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method263();
        }
    }

    @ObfuscatedName("client.a(I)V")
    public void method263() {
        if (class188.field2770 >= 4) {
            this.method1994("js5crc");
            field289 = 1000;
            return;
        }
        if (class188.field2771 >= 4) {
            if (field289 <= 5) {
                this.method1994("js5io");
                field289 = 1000;
                return;
            }
            field387 = 3000;
            class188.field2771 = 3;
        }
        if (--field387 + 1 > 0) {
            return;
        }
        try {
            if (field397 == 0) {
                Statics.field157 = Statics.field897.method1859(Statics.field941, Statics.field1737);
                field397++;
            }
            if (field397 == 1) {
                if (Statics.field157.field1654 == 2) {
                    this.method371(-1);
                    return;
                }
                if (Statics.field157.field1654 == 1) {
                    field397++;
                }
            }
            if (field397 == 2) {
                Statics.field340 = new class111((Socket) Statics.field157.field1658, Statics.field897);
                class130 var1 = new class130(5);
                var1.method2215(15);
                var1.method2218(140);
                Statics.field340.method1953(var1.field1955, 0, 5);
                field397++;
                Statics.field2865 = class132.method1336();
            }
            if (field397 == 3) {
                if (field289 <= 5 || Statics.field340.method1969() > 0) {
                    int var2 = Statics.field340.method1967();
                    if (var2 != 0) {
                        this.method371(var2);
                        return;
                    }
                    field397++;
                } else if (class132.method1336() - Statics.field2865 > 30000L) {
                    this.method371(-2);
                    return;
                }
            }
            if (field397 == 4) {
                class188.method1113(Statics.field340, field289 > 20);
                Statics.field157 = null;
                Statics.field340 = null;
                field397 = 0;
                field314 = 0;
            }
        } catch (IOException var4) {
            this.method371(-3);
        }
    }

    @ObfuscatedName("client.x(II)V")
    public void method371(int arg0) {
        Statics.field157 = null;
        Statics.field340 = null;
        field397 = 0;
        if (Statics.field195 == Statics.field1737) {
            Statics.field1737 = Statics.field1748;
        } else {
            Statics.field1737 = Statics.field195;
        }
        field314++;
        if (field314 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field289 <= 5) {
                this.method1994("js5connect_full");
                field289 = 1000;
            } else {
                field387 = 3000;
            }
        } else if (field314 >= 2 && arg0 == 6) {
            this.method1994("js5connect_outofdate");
            field289 = 1000;
        } else if (field314 >= 4) {
            if (field289 <= 5) {
                this.method1994("js5connect");
                field289 = 1000;
            } else {
                field387 = 3000;
            }
        }
    }

    @ObfuscatedName("gt.h(I)V")
    public static void method3217() {
        if (field309 == 0) {
            Statics.field2347 = new class88(4, 104, 104, class11.field103);
            for (int var0 = 0; var0 < 4; var0++) {
                field343[var0] = new class118(104, 104);
            }
            Statics.field2001 = new class229(512, 512);
            class42.field830 = class176.field2371;
            class42.field818 = 5;
            field309 = 20;
        } else if (field309 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1434[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1671(var1, 500, 800, 512, 334);
            class42.field830 = class176.field2372;
            class42.field818 = 10;
            field309 = 30;
        } else if (field309 == 30) {
            Statics.field1886 = method178(0, false, true, true);
            Statics.field748 = method178(1, false, true, true);
            Statics.field3151 = method178(2, true, false, true);
            Statics.field79 = method178(3, false, true, true);
            Statics.field2883 = method178(4, false, true, true);
            Statics.field1174 = method178(5, true, true, true);
            Statics.field200 = method178(6, true, true, false);
            Statics.field904 = method178(7, false, true, true);
            Statics.field1534 = method178(8, false, true, true);
            Statics.field3153 = method178(9, false, true, true);
            Statics.field313 = method178(10, false, true, true);
            Statics.field2846 = method178(11, false, true, true);
            Statics.field1715 = method178(12, false, true, true);
            Statics.field1585 = method178(13, true, false, true);
            Statics.field85 = method178(14, false, true, false);
            Statics.field178 = method178(15, false, true, true);
            class42.field830 = class176.field2570;
            class42.field818 = 20;
            field309 = 40;
        } else if (field309 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1886.method3194() * 4 / 100;
            int var8 = var7 + Statics.field748.method3194() * 4 / 100;
            int var9 = var8 + Statics.field3151.method3194() * 2 / 100;
            int var10 = var9 + Statics.field79.method3194() * 2 / 100;
            int var11 = var10 + Statics.field2883.method3194() * 6 / 100;
            int var12 = var11 + Statics.field1174.method3194() * 4 / 100;
            int var13 = var12 + Statics.field200.method3194() * 2 / 100;
            int var14 = var13 + Statics.field904.method3194() * 60 / 100;
            int var15 = var14 + Statics.field1534.method3194() * 2 / 100;
            int var16 = var15 + Statics.field3153.method3194() * 2 / 100;
            int var17 = var16 + Statics.field313.method3194() * 2 / 100;
            int var18 = var17 + Statics.field2846.method3194() * 2 / 100;
            int var19 = var18 + Statics.field1715.method3194() * 2 / 100;
            int var20 = var19 + Statics.field1585.method3194() * 2 / 100;
            int var21 = var20 + Statics.field85.method3194() * 2 / 100;
            int var22 = var21 + Statics.field178.method3194() * 2 / 100;
            if (var22 == 100) {
                class42.field830 = class176.field2612;
                class42.field818 = 30;
                field309 = 45;
            } else {
                if (var22 != 0) {
                    class42.field830 = class176.field2374 + var22 + "%";
                }
                class42.field818 = 30;
            }
        } else if (field309 == 45) {
            boolean var23 = !field286;
            Statics.field1033 = 22050;
            Statics.field1048 = var23;
            Statics.field2863 = 2;
            class161 var24 = new class161();
            var24.method2751(9, 128);
            Statics.field71 = class58.method711(Statics.field897, Statics.field1090, 0, 22050);
            Statics.field71.method1037(var24);
            class187 var25 = Statics.field178;
            class187 var26 = Statics.field85;
            class187 var27 = Statics.field2883;
            Statics.field2069 = var25;
            Statics.field2065 = var26;
            Statics.field2071 = var27;
            Statics.field2067 = var24;
            Statics.field57 = class58.method711(Statics.field897, Statics.field1090, 1, 2048);
            Statics.field1792 = new class52();
            Statics.field57.method1037(Statics.field1792);
            Statics.field1849 = new class66(22050, Statics.field1033);
            class42.field830 = class176.field2376;
            class42.field818 = 35;
            field309 = 50;
        } else if (field309 == 50) {
            int var28 = 0;
            if (Statics.field767 == null) {
                class187 var29 = Statics.field1534;
                class187 var30 = Statics.field1585;
                int var31 = var29.method3088("p11_full");
                int var32 = var29.method3102(var31, "");
                class208 var33 = class230.method1483(var29, var30, var31, var32);
                Statics.field767 = var33;
            } else {
                var28++;
            }
            if (Statics.field1543 == null) {
                class187 var34 = Statics.field1534;
                class187 var35 = Statics.field1585;
                int var36 = var34.method3088("p12_full");
                int var37 = var34.method3102(var36, "");
                class208 var38 = class230.method1483(var34, var35, var36, var37);
                Statics.field1543 = var38;
            } else {
                var28++;
            }
            if (Statics.field1193 == null) {
                class187 var39 = Statics.field1534;
                class187 var40 = Statics.field1585;
                int var41 = var39.method3088("b12_full");
                int var42 = var39.method3102(var41, "");
                class208 var43 = class230.method1483(var39, var40, var41, var42);
                Statics.field1193 = var43;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class42.field830 = class176.field2377 + var28 * 100 / 3 + "%";
                class42.field818 = 40;
            } else {
                Statics.field50 = new class235(true);
                class42.field830 = class176.field2551;
                class42.field818 = 40;
                field309 = 60;
            }
        } else if (field309 == 60) {
            class187 var44 = Statics.field313;
            class187 var45 = Statics.field1534;
            int var46 = 0;
            if (var44.method3104("title.jpg", "")) {
                var46++;
            }
            if (var45.method3104("logo", "")) {
                var46++;
            }
            if (var45.method3104("logo_deadman_mode", "")) {
                var46++;
            }
            if (var45.method3104("titlebox", "")) {
                var46++;
            }
            if (var45.method3104("titlebutton", "")) {
                var46++;
            }
            if (var45.method3104("runes", "")) {
                var46++;
            }
            if (var45.method3104("title_mute", "")) {
                var46++;
            }
            if (var45.method3144("options_radio_buttons,0")) {
                var46++;
            }
            if (var45.method3144("options_radio_buttons,2")) {
                var46++;
            }
            var45.method3104("sl_back", "");
            var45.method3104("sl_flags", "");
            var45.method3104("sl_arrows", "");
            var45.method3104("sl_stars", "");
            var45.method3104("sl_button", "");
            int var49 = class42.method221();
            if (var46 < var49) {
                class42.field830 = class176.field2569 + var46 * 100 / var49 + "%";
                class42.field818 = 50;
            } else {
                class42.field830 = class176.field2380;
                class42.field818 = 50;
                method112(5);
                field309 = 70;
            }
        } else if (field309 == 70) {
            if (Statics.field3151.method3091()) {
                class206.method3520(Statics.field3151);
                class187 var50 = Statics.field3151;
                Statics.field2821 = var50;
                class195.method2146(Statics.field3151, Statics.field904);
                class203.method193(Statics.field3151, Statics.field904, field286);
                class187 var51 = Statics.field3151;
                class187 var52 = Statics.field904;
                Statics.field3039 = var51;
                Statics.field3035 = var52;
                class187 var53 = Statics.field3151;
                Statics.field2884 = var53;
                class187 var54 = Statics.field3151;
                class187 var55 = Statics.field904;
                boolean var56 = field285;
                class208 var57 = Statics.field767;
                Statics.field2980 = var54;
                Statics.field2788 = var55;
                Statics.field2981 = var56;
                Statics.field2982 = Statics.field2980.method3097(10);
                Statics.field3006 = var57;
                class207.method2053(Statics.field3151, Statics.field1886, Statics.field748);
                class193.method1823(Statics.field3151, Statics.field904);
                class198.method757(Statics.field3151);
                class190.method202(Statics.field3151);
                class172.method3346(Statics.field79, Statics.field904, Statics.field1534, Statics.field1585);
                class187 var58 = Statics.field3151;
                Statics.field2782 = var58;
                class201.method3068(Statics.field3151);
                class187 var59 = Statics.field3151;
                Statics.field2790 = var59;
                class192.method1813(Statics.field3151);
                class187 var60 = Statics.field3151;
                Statics.field2873 = var60;
                Statics.field274 = new class47();
                class187 var61 = Statics.field3151;
                class187 var62 = Statics.field1534;
                class187 var63 = Statics.field1585;
                Statics.field2921 = var61;
                Statics.field2919 = var62;
                Statics.field2898 = var63;
                class196.method2840(Statics.field3151, Statics.field1534);
                class42.field830 = class176.field2382;
                class42.field818 = 60;
                field309 = 80;
            } else {
                class42.field830 = class176.field2557 + Statics.field3151.method3187() + "%";
                class42.field818 = 60;
            }
        } else if (field309 == 80) {
            int var64 = 0;
            if (Statics.field1205 == null) {
                class187 var65 = Statics.field1534;
                int var66 = var65.method3088("compass");
                int var67 = var65.method3102(var66, "");
                class229 var68 = class230.method204(var65, var66, var67);
                Statics.field1205 = var68;
            } else {
                var64++;
            }
            if (Statics.field360 == null) {
                class187 var69 = Statics.field1534;
                int var70 = var69.method3088("mapedge");
                int var71 = var69.method3102(var70, "");
                class229 var72 = class230.method204(var69, var70, var71);
                Statics.field360 = var72;
            } else {
                var64++;
            }
            if (Statics.field1285 == null) {
                Statics.field1285 = class230.method3788(Statics.field1534, "mapscene", "");
            } else {
                var64++;
            }
            if (Statics.field1720 == null) {
                Statics.field1720 = class230.method3521(Statics.field1534, "mapfunction", "");
            } else {
                var64++;
            }
            if (Statics.field939 == null) {
                Statics.field939 = class230.method3521(Statics.field1534, "headicons_pk", "");
            } else {
                var64++;
            }
            if (Statics.field1415 == null) {
                Statics.field1415 = class230.method3521(Statics.field1534, "headicons_prayer", "");
            } else {
                var64++;
            }
            if (Statics.field1727 == null) {
                Statics.field1727 = class230.method3521(Statics.field1534, "headicons_hint", "");
            } else {
                var64++;
            }
            if (Statics.field51 == null) {
                Statics.field51 = class230.method3521(Statics.field1534, "mapmarker", "");
            } else {
                var64++;
            }
            if (Statics.field2182 == null) {
                Statics.field2182 = class230.method3521(Statics.field1534, "cross", "");
            } else {
                var64++;
            }
            if (Statics.field957 == null) {
                Statics.field957 = class230.method3521(Statics.field1534, "mapdots", "");
            } else {
                var64++;
            }
            if (Statics.field1953 == null) {
                Statics.field1953 = class230.method3788(Statics.field1534, "scrollbar", "");
            } else {
                var64++;
            }
            if (Statics.field805 == null) {
                Statics.field805 = class230.method3788(Statics.field1534, "mod_icons", "");
            } else {
                var64++;
            }
            if (var64 < 12) {
                class42.field830 = class176.field2383 + var64 * 100 / 12 + "%";
                class42.field818 = 70;
            } else {
                Statics.field3106 = Statics.field805;
                Statics.field360.method3991();
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 21.0D) - 10;
                int var76 = (int) (Math.random() * 41.0D) - 20;
                for (int var77 = 0; var77 < Statics.field1720.length; var77++) {
                    Statics.field1720[var77].method3972(var73 + var76, var74 + var76, var75 + var76);
                }
                Statics.field1285[0].method3931(var73 + var76, var74 + var76, var75 + var76);
                class42.field830 = class176.field2428;
                class42.field818 = 70;
                field309 = 90;
            }
        } else if (field309 == 90) {
            if (Statics.field3153.method3091()) {
                class75 var78 = new class75(Statics.field3153, Statics.field1534, 20, 0.8D, field286 ? 64 : 128);
                class85.method1625(var78);
                class85.method1566(0.8D);
                class42.field830 = class176.field2386;
                class42.field818 = 90;
                field309 = 110;
            } else {
                class42.field830 = class176.field2369 + Statics.field3153.method3187() + "%";
                class42.field818 = 90;
            }
        } else if (field309 == 110) {
            Statics.field2679 = new class21();
            Statics.field897.method1852(Statics.field2679, 10);
            class42.field830 = class176.field2562;
            class42.field818 = 94;
            field309 = 120;
        } else if (field309 == 120) {
            if (Statics.field313.method3104("huffman", "")) {
                class122 var79 = new class122(Statics.field313.method3103("huffman", ""));
                class210.method3369(var79);
                class42.field830 = class176.field2430;
                class42.field818 = 96;
                field309 = 130;
            } else {
                class42.field830 = class176.field2388 + "%";
                class42.field818 = 96;
            }
        } else if (field309 == 130) {
            if (!Statics.field79.method3091()) {
                class42.field830 = class176.field2390 + Statics.field79.method3187() * 4 / 5 + "%";
                class42.field818 = 100;
            } else if (!Statics.field1715.method3091()) {
                class42.field830 = class176.field2390 + (80 + Statics.field1715.method3187() / 6) + "%";
                class42.field818 = 100;
            } else if (Statics.field1585.method3091()) {
                class42.field830 = class176.field2391;
                class42.field818 = 100;
                field309 = 140;
            } else {
                class42.field830 = class176.field2390 + (96 + Statics.field1585.method3187() / 20) + "%";
                class42.field818 = 100;
            }
        } else if (field309 == 140) {
            method112(10);
        }
    }

    @ObfuscatedName("s.b(IZZZI)Lgf;")
    public static class187 method178(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1681 != null) {
            var4 = new class117(arg0, class105.field1681, Statics.field1684[arg0], 1000000);
        }
        return new class187(var4, Statics.field920, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("h.f(B)V")
    public static final void method212() {
        try {
            if (field315 == 0) {
                if (Statics.field161 != null) {
                    Statics.field161.method1972();
                    Statics.field161 = null;
                }
                Statics.field1885 = null;
                field337 = false;
                field316 = 0;
                field315 = 1;
            }
            if (field315 == 1) {
                if (Statics.field1885 == null) {
                    Statics.field1885 = Statics.field897.method1859(Statics.field941, Statics.field1737);
                }
                if (Statics.field1885.field1654 == 2) {
                    throw new IOException();
                }
                if (Statics.field1885.field1654 == 1) {
                    Statics.field161 = new class111((Socket) Statics.field1885.field1658, Statics.field897);
                    Statics.field1885 = null;
                    field315 = 2;
                }
            }
            if (field315 == 2) {
                field326.field1956 = 0;
                field326.method2215(14);
                Statics.field161.method1953(field326.field1955, 0, 1);
                field328.field1956 = 0;
                field315 = 3;
            }
            if (field315 == 3) {
                if (Statics.field71 != null) {
                    Statics.field71.method1039();
                }
                if (Statics.field57 != null) {
                    Statics.field57.method1039();
                }
                int var0 = Statics.field161.method1967();
                if (Statics.field71 != null) {
                    Statics.field71.method1039();
                }
                if (Statics.field57 != null) {
                    Statics.field57.method1039();
                }
                if (var0 != 0) {
                    method104(var0);
                    return;
                }
                field328.field1956 = 0;
                field315 = 4;
            }
            if (field315 == 4) {
                if (field328.field1956 < 8) {
                    int var1 = Statics.field161.method1969();
                    if (var1 > 8 - field328.field1956) {
                        var1 = 8 - field328.field1956;
                    }
                    if (var1 > 0) {
                        Statics.field161.method1952(field328.field1955, field328.field1956, var1);
                        field328.field1956 += var1;
                    }
                }
                if (field328.field1956 == 8) {
                    field328.field1956 = 0;
                    Statics.field1785 = field328.method2320();
                    field315 = 5;
                }
            }
            if (field315 == 5) {
                int[] var2 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field1785 >> 32), (int) (Statics.field1785 & 0xFFFFFFFFFFFFFFFFL) };
                field326.field1956 = 0;
                field326.method2215(1);
                field326.method2215(class42.field838.method763());
                field326.method2218(var2[0]);
                field326.method2218(var2[1]);
                field326.method2218(var2[2]);
                field326.method2218(var2[3]);
                switch(class42.field838.field1623) {
                    case 0:
                    case 2:
                        field326.method2305(Statics.field1889);
                        field326.field1956 += 5;
                        break;
                    case 1:
                        field326.method2218((Integer) Statics.field657.field694.get(class215.method742(class42.field828)));
                        field326.field1956 += 4;
                        break;
                    case 3:
                        field326.field1956 += 8;
                }
                field326.method2351(class42.field836);
                field326.method2330(class40.field800, class40.field797);
                field327.field1956 = 0;
                if (field289 == 40) {
                    field327.method2215(18);
                } else {
                    field327.method2215(16);
                }
                field327.method2216(0);
                int var3 = field327.field1956;
                field327.method2218(140);
                field327.method2255(field326.field1955, 0, field326.field1956);
                int var4 = field327.field1956;
                field327.method2351(class42.field828);
                field327.method2215((field500 ? 1 : 0) << 1 | (field286 ? 1 : 0));
                field327.method2216(Statics.field2761);
                field327.method2216(Statics.field2727);
                method1150(field327);
                field327.method2351(Statics.field288);
                field327.method2218(Statics.field98);
                class130 var5 = new class130(Statics.field50.method4095());
                Statics.field50.method4092(var5);
                field327.method2255(var5.field1955, 0, var5.field1955.length);
                field327.method2215(Statics.field107);
                field327.method2218(0);
                field327.method2218(Statics.field1886.field2722);
                field327.method2218(Statics.field748.field2722);
                field327.method2218(Statics.field3151.field2722);
                field327.method2218(Statics.field79.field2722);
                field327.method2218(Statics.field2883.field2722);
                field327.method2218(Statics.field1174.field2722);
                field327.method2218(Statics.field200.field2722);
                field327.method2218(Statics.field904.field2722);
                field327.method2218(Statics.field1534.field2722);
                field327.method2218(Statics.field3153.field2722);
                field327.method2218(Statics.field313.field2722);
                field327.method2218(Statics.field2846.field2722);
                field327.method2218(Statics.field1715.field2722);
                field327.method2218(Statics.field1585.field2722);
                field327.method2218(Statics.field85.field2722);
                field327.method2218(Statics.field178.field2722);
                field327.method2214(var2, var4, field327.field1956);
                field327.method2226(field327.field1956 - var3);
                Statics.field161.method1953(field327.field1955, 0, field327.field1956);
                field326.method2479(var2);
                for (int var6 = 0; var6 < 4; var6++) {
                    var2[var6] += 50;
                }
                field328.method2479(var2);
                field315 = 6;
            }
            if (field315 == 6 && Statics.field161.method1969() > 0) {
                int var7 = Statics.field161.method1967();
                if (var7 == 21 && field289 == 20) {
                    field315 = 7;
                } else if (var7 == 2) {
                    field315 = 9;
                } else if (var7 == 15 && field289 == 40) {
                    field329 = -1;
                    field315 = 13;
                } else if (var7 == 23 && field317 < 1) {
                    field317++;
                    field315 = 0;
                } else if (var7 == 29) {
                    field315 = 11;
                } else {
                    method104(var7);
                    return;
                }
            }
            if (field315 == 7 && Statics.field161.method1969() > 0) {
                field318 = (Statics.field161.method1967() + 3) * 60;
                field315 = 8;
            }
            if (field315 == 8) {
                field316 = 0;
                Statics.method831(class176.field2394, class176.field2622, field318 / 60 + class176.field2397);
                if (--field318 <= 0) {
                    field315 = 0;
                }
            } else {
                if (field315 == 9 && Statics.field161.method1969() >= 13) {
                    boolean var8 = Statics.field161.method1967() == 1;
                    Statics.field161.method1952(field328.field1955, 0, 4);
                    field328.field1956 = 0;
                    boolean var9 = false;
                    if (var8) {
                        int var10 = field328.method2484() << 24;
                        int var11 = var10 | field328.method2484() << 16;
                        int var12 = var11 | field328.method2484() << 8;
                        int var13 = var12 | field328.method2484();
                        int var14 = class215.method742(class42.field828);
                        if (Statics.field657.field694.size() >= 10 && !Statics.field657.field694.containsKey(var14)) {
                            Iterator var15 = Statics.field657.field694.entrySet().iterator();
                            var15.next();
                            var15.remove();
                        }
                        Statics.field657.field694.put(var14, var13);
                        class31.method1810();
                    }
                    field518 = Statics.field161.method1967();
                    field279 = Statics.field161.method1967() == 1;
                    field414 = Statics.field161.method1967();
                    field414 <<= 0x8;
                    field414 += Statics.field161.method1967();
                    field407 = Statics.field161.method1967();
                    Statics.field161.method1952(field328.field1955, 0, 1);
                    field328.field1956 = 0;
                    field330 = field328.method2484();
                    Statics.field161.method1952(field328.field1955, 0, 2);
                    field328.field1956 = 0;
                    field329 = field328.method2232();
                    try {
                        class101.method1834(Statics.field280, "zap");
                    } catch (Throwable var38) {
                    }
                    field315 = 10;
                }
                if (field315 != 10) {
                    if (field315 == 11 && Statics.field161.method1969() >= 2) {
                        field328.field1956 = 0;
                        Statics.field161.method1952(field328.field1955, 0, 2);
                        field328.field1956 = 0;
                        Statics.field112 = field328.method2232();
                        field315 = 12;
                    }
                    if (field315 == 12 && Statics.field161.method1969() >= Statics.field112) {
                        field328.field1956 = 0;
                        Statics.field161.method1952(field328.field1955, 0, Statics.field112);
                        field328.field1956 = 0;
                        String var29 = field328.method2314();
                        String var30 = field328.method2314();
                        String var31 = field328.method2314();
                        Statics.method831(var29, var30, var31);
                        method112(10);
                    }
                    if (field315 == 13) {
                        if (field329 == -1) {
                            if (Statics.field161.method1969() < 2) {
                                return;
                            }
                            Statics.field161.method1952(field328.field1955, 0, 2);
                            field328.field1956 = 0;
                            field329 = field328.method2232();
                        }
                        if (Statics.field161.method1969() >= field329) {
                            Statics.field161.method1952(field328.field1955, 0, field329);
                            field328.field1956 = 0;
                            int var32 = field329;
                            field326.field1956 = 0;
                            field328.field1956 = 0;
                            field330 = -1;
                            field539 = -1;
                            field418 = -1;
                            field467 = -1;
                            field329 = 0;
                            field331 = 0;
                            field496 = 0;
                            field424 = 0;
                            field432 = -1;
                            field423 = false;
                            field523 = 0;
                            field521 = 0;
                            for (int var33 = 0; var33 < 2048; var33++) {
                                field404[var33] = null;
                            }
                            Statics.field233 = null;
                            for (int var34 = 0; var34 < field534.length; var34++) {
                                class36 var35 = field534[var34];
                                if (var35 != null) {
                                    var35.field626 = -1;
                                    var35.field615 = false;
                                }
                            }
                            class13.field133 = new class147(32);
                            method112(30);
                            for (int var36 = 0; var36 < 100; var36++) {
                                field369[var36] = true;
                            }
                            method592();
                            class46.method77(field328);
                            if (field328.field1956 != var32) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field316++;
                        if (field316 > 2000) {
                            if (field317 < 1) {
                                if (Statics.field195 == Statics.field1737) {
                                    Statics.field1737 = Statics.field1748;
                                } else {
                                    Statics.field1737 = Statics.field195;
                                }
                                field317++;
                                field315 = 0;
                            } else {
                                method104(-3);
                            }
                        }
                    }
                } else if (Statics.field161.method1969() >= field329) {
                    field328.field1956 = 0;
                    Statics.field161.method1952(field328.field1955, 0, field329);
                    field406 = 1L;
                    field556 = -1;
                    Statics.field2679.field218 = 0;
                    Statics.field2832 = true;
                    field296 = true;
                    field512 = -1L;
                    class232.method1392();
                    field326.field1956 = 0;
                    field328.field1956 = 0;
                    field330 = -1;
                    field539 = -1;
                    field418 = -1;
                    field467 = -1;
                    field331 = 0;
                    field496 = 0;
                    field490 = 0;
                    field299 = 0;
                    field424 = 0;
                    field432 = -1;
                    field423 = false;
                    class116.method891(0);
                    class48.method879();
                    field352 = 0;
                    field441 = false;
                    field529 = 0;
                    field347 = (int) (Math.random() * 100.0D) - 50;
                    field527 = (int) (Math.random() * 110.0D) - 55;
                    field426 = (int) (Math.random() * 80.0D) - 40;
                    field354 = (int) (Math.random() * 120.0D) - 60;
                    field356 = (int) (Math.random() * 30.0D) - 20;
                    field368 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field523 = 0;
                    field516 = -1;
                    field521 = 0;
                    field335 = 0;
                    field307 = class41.field808;
                    field308 = class41.field808;
                    field322 = 0;
                    class46.field892 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        class46.field891[var17] = null;
                        class46.field890[var17] = 1;
                    }
                    for (int var18 = 0; var18 < 2048; var18++) {
                        field404[var18] = null;
                    }
                    for (int var19 = 0; var19 < 32768; var19++) {
                        field534[var19] = null;
                    }
                    field473 = -1;
                    field417.method2661();
                    field532.method2661();
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 104; var21++) {
                            for (int var22 = 0; var22 < 104; var22++) {
                                field415[var20][var21][var22] = null;
                            }
                        }
                    }
                    field416 = new class150();
                    field555 = 0;
                    field554 = 0;
                    field558 = 0;
                    for (int var23 = 0; var23 < Statics.field2784; var23++) {
                        class190 var24 = class190.method1975(var23);
                        if (var24 != null) {
                            class168.field2173[var23] = 0;
                            class168.field2174[var23] = 0;
                        }
                    }
                    Statics.field274.method838();
                    field311 = -1;
                    if (field446 != -1) {
                        class172.method593(field446);
                    }
                    for (class18 var25 = (class18) field447.method2614(); var25 != null; var25 = (class18) field447.method2615()) {
                        method1633(var25, true);
                    }
                    field446 = -1;
                    field447 = new class147(8);
                    field450 = null;
                    field424 = 0;
                    field432 = -1;
                    field423 = false;
                    field560.method2946((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var26 = 0; var26 < 8; var26++) {
                        field411[var26] = null;
                        field412[var26] = false;
                    }
                    class13.field133 = new class147(32);
                    field290 = true;
                    for (int var27 = 0; var27 < 100; var27++) {
                        field369[var27] = true;
                    }
                    method592();
                    field486 = null;
                    Statics.field1452 = 0;
                    Statics.field295 = null;
                    for (int var28 = 0; var28 < 8; var28++) {
                        field563[var28] = new class5();
                    }
                    Statics.field2746 = null;
                    class46.method77(field328);
                    Statics.field620 = -1;
                    method109(false);
                    field330 = -1;
                }
            }
        } catch (IOException var39) {
            if (field317 < 1) {
                if (Statics.field195 == Statics.field1737) {
                    Statics.field1737 = Statics.field1748;
                } else {
                    Statics.field1737 = Statics.field195;
                }
                field317++;
                field315 = 0;
            } else {
                method104(-2);
            }
        }
    }

    @ObfuscatedName("l.o(II)V")
    public static void method104(int arg0) {
        if (arg0 == -3) {
            Statics.method831(class176.field2615, class176.field2378, class176.field2554);
        } else if (arg0 == -2) {
            Statics.method831(class176.field2401, class176.field2402, class176.field2403);
        } else if (arg0 == -1) {
            Statics.method831(class176.field2404, class176.field2485, class176.field2406);
        } else if (arg0 == 3) {
            class42.field831 = 3;
        } else if (arg0 == 4) {
            Statics.method831(class176.field2407, class176.field2632, class176.field2409);
        } else if (arg0 == 5) {
            Statics.method831(class176.field2521, class176.field2411, class176.field2412);
        } else if (arg0 == 6) {
            Statics.method831(class176.field2413, class176.field2414, class176.field2415);
        } else if (arg0 == 7) {
            Statics.method831(class176.field2416, class176.field2524, class176.field2609);
        } else if (arg0 == 8) {
            Statics.method831(class176.field2419, class176.field2420, class176.field2421);
        } else if (arg0 == 9) {
            Statics.method831(class176.field2490, class176.field2423, class176.field2424);
        } else if (arg0 == 10) {
            Statics.method831(class176.field2505, class176.field2426, class176.field2427);
        } else if (arg0 == 11) {
            Statics.method831(class176.field2405, class176.field2429, class176.field2585);
        } else if (arg0 == 12) {
            Statics.method831(class176.field2431, class176.field2432, class176.field2433);
        } else if (arg0 == 13) {
            Statics.method831(class176.field2434, class176.field2435, class176.field2368);
        } else if (arg0 == 14) {
            Statics.method831(class176.field2437, class176.field2576, class176.field2367);
        } else if (arg0 == 16) {
            Statics.method831(class176.field2440, class176.field2502, class176.field2442);
        } else if (arg0 == 17) {
            Statics.method831(class176.field2443, class176.field2630, class176.field2626);
        } else if (arg0 == 18) {
            Statics.method831(class176.field2446, class176.field2447, class176.field2454);
        } else if (arg0 == 19) {
            Statics.method831(class176.field2516, class176.field2450, class176.field2565);
        } else if (arg0 == 20) {
            Statics.method831(class176.field2452, class176.field2453, class176.field2501);
        } else if (arg0 == 22) {
            Statics.method831(class176.field2455, class176.field2456, class176.field2457);
        } else if (arg0 == 23) {
            Statics.method831(class176.field2458, class176.field2459, class176.field2460);
        } else if (arg0 == 24) {
            Statics.method831(class176.field2422, class176.field2462, class176.field2463);
        } else if (arg0 == 25) {
            Statics.method831(class176.field2464, class176.field2465, class176.field2389);
        } else if (arg0 == 26) {
            Statics.method831(class176.field2467, class176.field2468, class176.field2469);
        } else if (arg0 == 27) {
            Statics.method831(class176.field2470, class176.field2471, class176.field2472);
        } else if (arg0 == 31) {
            Statics.method831(class176.field2479, class176.field2480, class176.field2481);
        } else if (arg0 == 32) {
            Statics.method831(class176.field2482, class176.field2483, class176.field2484);
        } else if (arg0 == 37) {
            Statics.method831(class176.field2384, class176.field2568, class176.field2487);
        } else if (arg0 == 38) {
            Statics.method831(class176.field2488, class176.field2489, class176.field2393);
        } else if (arg0 == 55) {
            Statics.method831(class176.field2491, class176.field2492, class176.field2493);
        } else if (arg0 == 56) {
            Statics.method831(class176.field2494, class176.field2495, class176.field2496);
            method112(11);
            return;
        } else if (arg0 == 57) {
            Statics.method831(class176.field2497, class176.field2498, class176.field2602);
            method112(11);
            return;
        } else {
            Statics.method831(class176.field2500, class176.field2577, class176.field2618);
        }
        method112(10);
    }

    @ObfuscatedName("d.m(I)V")
    public static final void method13() {
        if (Statics.field161 != null) {
            Statics.field161.method1972();
            Statics.field161 = null;
        }
        method1846();
        Statics.field2347.method1636();
        for (int var0 = 0; var0 < 4; var0++) {
            field343[var0].method2100();
        }
        System.gc();
        class160.method2052(2);
        field525 = -1;
        field526 = false;
        for (class32 var1 = (class32) class32.field710.method2666(); var1 != null; var1 = (class32) class32.field710.method2668()) {
            if (var1.field706 != null) {
                Statics.field1792.method917(var1.field706);
                var1.field706 = null;
            }
            if (var1.field711 != null) {
                Statics.field1792.method917(var1.field711);
                var1.field711 = null;
            }
        }
        class32.field710.method2661();
        method112(10);
    }

    @ObfuscatedName("cd.y(B)V")
    public static final void method1846() {
        class206.field3072.method2603();
        class194.field2823.method2603();
        class195.method2907();
        class203.method761();
        class205.field3036.method2603();
        class205.field3037.method2603();
        class204.field2983.method2603();
        class204.field2984.method2603();
        class204.field2985.method2603();
        class207.method3069();
        class193.field2802.method2603();
        class193.field2809.method2603();
        class198.method2239();
        class190.method1341();
        class202.field2923.method2603();
        class202.field2922.method2603();
        class202.field2909.method2603();
        class196.method3257();
        class200.field2879.method2603();
        class199.method92();
        class169.field2186.method2603();
        class172.field2259.method2603();
        class172.field2203.method2603();
        class172.field2240.method2603();
        class172.field2205.method2603();
        ((class75) Statics.field1438).method1374();
        class49.field945.method2603();
        Statics.field1886.method3101();
        Statics.field748.method3101();
        Statics.field79.method3101();
        Statics.field2883.method3101();
        Statics.field1174.method3101();
        Statics.field200.method3101();
        Statics.field904.method3101();
        Statics.field1534.method3101();
        Statics.field3153.method3101();
        Statics.field313.method3101();
        Statics.field2846.method3101();
        Statics.field1715.method3101();
    }

    @ObfuscatedName("d.am(I)V")
    public static final void method12() {
        if (field490 > 0) {
            method13();
        } else {
            method112(40);
            Statics.field1980 = Statics.field161;
            Statics.field161 = null;
        }
    }

    @ObfuscatedName("ck.ax(I)V")
    public static final void method1481() {
        if (field496 > 1) {
            field496--;
        }
        if (field490 > 0) {
            field490--;
        }
        if (field337) {
            field337 = false;
            if (field490 > 0) {
                method13();
            } else {
                method112(40);
                Statics.field1980 = Statics.field161;
                Statics.field161 = null;
            }
            return;
        }
        if (!field423) {
            method2143();
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field161 == null) {
                var1 = false;
            } else {
                label2729: {
                    try {
                        int var2 = Statics.field161.method1969();
                        if (var2 == 0) {
                            var1 = false;
                            break label2729;
                        }
                        if (field330 == -1) {
                            Statics.field161.method1952(field328.field1955, 0, 1);
                            field328.field1956 = 0;
                            field330 = field328.method2484();
                            field329 = class217.field3176[field330];
                            var2--;
                        }
                        if (field329 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2729;
                            }
                            Statics.field161.method1952(field328.field1955, 0, 1);
                            field329 = field328.field1955[0] & 0xFF;
                            var2--;
                        }
                        if (field329 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2729;
                            }
                            Statics.field161.method1952(field328.field1955, 0, 2);
                            field328.field1956 = 0;
                            field329 = field328.method2232();
                            var2 -= 2;
                        }
                        if (var2 < field329) {
                            var1 = false;
                            break label2729;
                        }
                        field328.field1956 = 0;
                        Statics.field161.method1952(field328.field1955, 0, field329);
                        field331 = 0;
                        field467 = field418;
                        field418 = field539;
                        field539 = field330;
                        if (field330 == 172) {
                            field324 = field328.method2379();
                            field469 = field328.method2379();
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 2) {
                            class30 var3 = new class30();
                            var3.field680 = field328.method2314();
                            var3.field681 = field328.method2232();
                            int var4 = field328.method2246();
                            var3.field679 = var4;
                            method112(45);
                            Statics.field161.method1972();
                            Statics.field161 = null;
                            class42.method101(var3);
                            field330 = -1;
                            var1 = false;
                            break label2729;
                        }
                        if (field330 == 77) {
                            int var5 = field328.method2424();
                            class172 var6 = class172.method2211(var5);
                            var6.field2251 = 3;
                            var6.field2232 = Statics.field233.field237.method2970();
                            method2197(var6);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 76) {
                            while (field328.field1956 < field329) {
                                boolean var7 = field328.method2379() == 1;
                                String var8 = field328.method2314();
                                String var9 = field328.method2314();
                                int var10 = field328.method2232();
                                int var11 = field328.method2379();
                                int var12 = field328.method2379();
                                boolean var13 = (var12 & 0x2) != 0;
                                boolean var14 = (var12 & 0x1) != 0;
                                if (var10 > 0) {
                                    field328.method2314();
                                    field328.method2379();
                                    field328.method2246();
                                }
                                field328.method2314();
                                for (int var15 = 0; var15 < field554; var15++) {
                                    class15 var16 = field455[var15];
                                    if (var7) {
                                        if (var9.equals(var16.field162)) {
                                            var16.field162 = var8;
                                            var16.field152 = var9;
                                            var8 = null;
                                            break;
                                        }
                                    } else if (var8.equals(var16.field162)) {
                                        if (var16.field154 != var10) {
                                            boolean var17 = true;
                                            for (class17 var18 = (class17) field557.method2695(); var18 != null; var18 = (class17) field557.method2696()) {
                                                if (var18.field171.equals(var8)) {
                                                    if (var10 != 0 && var18.field172 == 0) {
                                                        var18.method2703();
                                                        var17 = false;
                                                    } else if (var10 == 0 && var18.field172 != 0) {
                                                        var18.method2703();
                                                        var17 = false;
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                field557.method2694(new class17(var8, var10));
                                            }
                                            var16.field154 = var10;
                                        }
                                        var16.field152 = var9;
                                        var16.field151 = var11;
                                        var16.field153 = var13;
                                        var16.field160 = var14;
                                        var8 = null;
                                        break;
                                    }
                                }
                                if (var8 != null && field554 < 400) {
                                    class15 var19 = new class15();
                                    field455[field554] = var19;
                                    var19.field162 = var8;
                                    var19.field152 = var9;
                                    var19.field154 = var10;
                                    var19.field151 = var11;
                                    var19.field153 = var13;
                                    var19.field160 = var14;
                                    field554++;
                                }
                            }
                            field555 = 2;
                            field479 = field312;
                            boolean var20 = false;
                            int var21 = field554;
                            while (var21 > 0) {
                                boolean var22 = true;
                                var21--;
                                for (int var23 = 0; var23 < var21; var23++) {
                                    boolean var24 = false;
                                    class15 var25 = field455[var23];
                                    class15 var26 = field455[var23 + 1];
                                    if (field282 != var25.field154 && field282 == var26.field154) {
                                        var24 = true;
                                    }
                                    if (!var24 && var25.field154 == 0 && var26.field154 != 0) {
                                        var24 = true;
                                    }
                                    if (!var24 && !var25.field153 && var26.field153) {
                                        var24 = true;
                                    }
                                    if (!var24 && !var25.field160 && var26.field160) {
                                        var24 = true;
                                    }
                                    if (var24) {
                                        class15 var27 = field455[var23];
                                        field455[var23] = field455[var23 + 1];
                                        field455[var23 + 1] = var27;
                                        var22 = false;
                                    }
                                }
                                if (var22) {
                                    break;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 53) {
                            int var28 = field328.method2232();
                            field446 = var28;
                            method189(false);
                            method1830(var28);
                            class33.method1388(field446);
                            for (int var29 = 0; var29 < 100; var29++) {
                                field369[var29] = true;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 189) {
                            field535 = true;
                            Statics.field37 = field328.method2379();
                            Statics.field1598 = field328.method2379();
                            Statics.field1555 = field328.method2232();
                            Statics.field61 = field328.method2379();
                            Statics.field1970 = field328.method2379();
                            if (Statics.field1970 >= 100) {
                                Statics.field234 = Statics.field37 * 128 + 64;
                                Statics.field142 = Statics.field1598 * 128 + 64;
                                Statics.field17 = method599(Statics.field234, Statics.field142, Statics.field533) - Statics.field1555;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 69) {
                            int var30 = field328.method2379();
                            int var31 = field328.method2379();
                            int var32 = field328.method2379();
                            int var33 = field328.method2379();
                            field536[var30] = true;
                            field537[var30] = var31;
                            field402[var30] = var32;
                            field546[var30] = var33;
                            field540[var30] = 0;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 190) {
                            int var34 = field328.method2334();
                            int var35 = field328.method2424();
                            class18 var36 = (class18) field447.method2611((long) var35);
                            class18 var37 = (class18) field447.method2611((long) var34);
                            if (var37 != null) {
                                method1633(var37, var36 == null || var36.field179 != var37.field179);
                            }
                            if (var36 != null) {
                                var36.method2652();
                                field447.method2612(var36, (long) var34);
                            }
                            class172 var38 = class172.method2211(var35);
                            if (var38 != null) {
                                method2197(var38);
                            }
                            class172 var39 = class172.method2211(var34);
                            if (var39 != null) {
                                method2197(var39);
                                method2917(Statics.field1985[var39.field2208 >>> 16], var39, true);
                            }
                            if (field446 != -1) {
                                method573(field446, 1);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 249) {
                            field535 = true;
                            Statics.field64 = field328.method2379();
                            Statics.field1975 = field328.method2379();
                            Statics.field96 = field328.method2232();
                            Statics.field885 = field328.method2379();
                            Statics.field1962 = field328.method2379();
                            if (Statics.field1962 >= 100) {
                                int var40 = Statics.field64 * 128 + 64;
                                int var41 = Statics.field1975 * 128 + 64;
                                int var42 = method599(var40, var41, Statics.field533) - Statics.field96;
                                int var43 = var40 - Statics.field234;
                                int var44 = var42 - Statics.field17;
                                int var45 = var41 - Statics.field142;
                                int var46 = (int) Math.sqrt((double) (var43 * var43 + var45 * var45));
                                Statics.field1733 = (int) (Math.atan2((double) var44, (double) var46) * 325.949D) & 0x7FF;
                                Statics.field147 = (int) (Math.atan2((double) var43, (double) var45) * -325.949D) & 0x7FF;
                                if (Statics.field1733 < 128) {
                                    Statics.field1733 = 128;
                                }
                                if (Statics.field1733 > 383) {
                                    Statics.field1733 = 383;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 203) {
                            if (field446 != -1) {
                                int var47 = field446;
                                if (class172.method1982(var47)) {
                                    method1360(Statics.field1985[var47], 0);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 52) {
                            Statics.field158 = Statics.method3790(field328.method2379());
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 200) {
                            int var48 = field328.method2246();
                            int var49 = field328.method2246();
                            if (Statics.field267 == null || !Statics.field267.isValid()) {
                                try {
                                    Iterator var50 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var50.hasNext()) {
                                        GarbageCollectorMXBean var51 = (GarbageCollectorMXBean) var50.next();
                                        if (var51.isValid()) {
                                            Statics.field267 = var51;
                                            field565 = -1L;
                                            field564 = -1L;
                                        }
                                    }
                                } catch (Throwable var410) {
                                }
                            }
                            long var53 = class132.method1336();
                            int var55 = -1;
                            if (Statics.field267 != null) {
                                long var56 = Statics.field267.getCollectionTime();
                                if (field564 != -1L) {
                                    long var58 = var56 - field564;
                                    long var60 = var53 - field565;
                                    if (var60 != 0L) {
                                        var55 = (int) (var58 * 100L / var60);
                                    }
                                }
                                field564 = var56;
                                field565 = var53;
                            }
                            field326.method2480(193);
                            field326.method2258(var48);
                            field326.method2273(var49);
                            field326.method2276(field1773);
                            field326.method2215(var55);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 78) {
                            int var62 = field328.method2266();
                            int var63 = field328.method2332();
                            class172 var64 = class172.method2211(var63);
                            if (var64.field2251 != 1 || var64.field2232 != var62) {
                                var64.field2251 = 1;
                                var64.field2232 = var62;
                                method2197(var64);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 163) {
                            String var65 = field328.method2314();
                            Object[] var66 = new Object[var65.length() + 1];
                            for (int var67 = var65.length() - 1; var67 >= 0; var67--) {
                                if (var65.charAt(var67) == 's') {
                                    var66[var67 + 1] = field328.method2314();
                                } else {
                                    var66[var67 + 1] = Integer.valueOf(field328.method2246());
                                }
                            }
                            var66[0] = Integer.valueOf(field328.method2246());
                            class19 var68 = new class19();
                            var68.field197 = var66;
                            class33.method887(var68, 200000);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 219) {
                            class46.method753(field328, field329);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 80) {
                            int var69 = field329 + field328.field1956;
                            int var70 = field328.method2232();
                            int var71 = field328.method2232();
                            if (field446 != var70) {
                                field446 = var70;
                                method189(false);
                                method1830(field446);
                                class33.method1388(field446);
                                for (int var72 = 0; var72 < 100; var72++) {
                                    field369[var72] = true;
                                }
                            }
                            while (var71-- > 0) {
                                int var73 = field328.method2246();
                                int var74 = field328.method2232();
                                int var75 = field328.method2379();
                                class18 var76 = (class18) field447.method2611((long) var73);
                                if (var76 != null && var76.field179 != var74) {
                                    method1633(var76, true);
                                    var76 = null;
                                }
                                if (var76 == null) {
                                    class18 var77 = new class18();
                                    var77.field179 = var74;
                                    var77.field180 = var75;
                                    field447.method2612(var77, (long) var73);
                                    method1830(var74);
                                    class172 var78 = class172.method2211(var73);
                                    method2197(var78);
                                    if (field450 != null) {
                                        method2197(field450);
                                        field450 = null;
                                    }
                                    method191();
                                    method2917(Statics.field1985[var73 >> 16], var78, false);
                                    class33.method1388(var74);
                                    if (field446 != -1) {
                                        int var79 = field446;
                                        if (class172.method1982(var79)) {
                                            method1360(Statics.field1985[var79], 1);
                                        }
                                    }
                                    var76 = var77;
                                }
                                var76.field181 = true;
                            }
                            for (class18 var81 = (class18) field447.method2614(); var81 != null; var81 = (class18) field447.method2615()) {
                                if (var81.field181) {
                                    var81.field181 = false;
                                } else {
                                    method1633(var81, true);
                                }
                            }
                            field428 = new class147(512);
                            while (field328.field1956 < var69) {
                                int var82 = field328.method2246();
                                int var83 = field328.method2232();
                                int var84 = field328.method2232();
                                int var85 = field328.method2246();
                                for (int var86 = var83; var86 <= var84; var86++) {
                                    long var87 = ((long) var82 << 32) + (long) var86;
                                    field428.method2612(new class155(var85), var87);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 16) {
                            int var89 = field328.method2424();
                            Statics.field2 = Statics.field897.method1853(var89);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 231) {
                            int var90 = field328.method2266();
                            int var91 = field328.method2246();
                            int var92 = field328.method2266();
                            int var93 = field328.method2265();
                            class172 var94 = class172.method2211(var91);
                            if (var94.field2264 != var93 || var94.field2300 != var90 || var94.field2245 != var92) {
                                var94.field2264 = var93;
                                var94.field2300 = var90;
                                var94.field2245 = var92;
                                method2197(var94);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 51) {
                            Statics.field3158 = field328.method2256();
                            Statics.field803 = field328.method2257();
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 59) {
                            int var95 = field328.method2424();
                            int var96 = field328.method2232();
                            class172 var97 = class172.method2211(var95);
                            if (var97 != null && var97.field2331 == 0) {
                                if (var96 > var97.field2263 - var97.field2341) {
                                    var96 = var97.field2263 - var97.field2341;
                                }
                                if (var96 < 0) {
                                    var96 = 0;
                                }
                                if (var97.field2234 != var96) {
                                    var97.field2234 = var96;
                                    method2197(var97);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 127) {
                            class46.field892 = 0;
                            for (int var98 = 0; var98 < 2048; var98++) {
                                class46.field891[var98] = null;
                                class46.field890[var98] = 1;
                            }
                            for (int var99 = 0; var99 < 2048; var99++) {
                                field404[var99] = null;
                            }
                            class46.method77(field328);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 140) {
                            int var100 = field328.method2246();
                            int var101 = field328.method2232();
                            if (var100 < -70000) {
                                var101 += 32768;
                            }
                            class172 var102;
                            if (var100 >= 0) {
                                var102 = class172.method2211(var100);
                            } else {
                                var102 = null;
                            }
                            if (var102 != null) {
                                for (int var103 = 0; var103 < var102.field2326.length; var103++) {
                                    var102.field2326[var103] = 0;
                                    var102.field2327[var103] = 0;
                                }
                            }
                            class13.method179(var101);
                            int var104 = field328.method2232();
                            for (int var105 = 0; var105 < var104; var105++) {
                                int var106 = field328.method2232();
                                int var107 = field328.method2257();
                                if (var107 == 255) {
                                    var107 = field328.method2246();
                                }
                                if (var102 != null && var105 < var102.field2326.length) {
                                    var102.field2326[var105] = var106;
                                    var102.field2327[var105] = var107;
                                }
                                class13.method1632(var101, var105, var106 - 1, var107);
                            }
                            if (var102 != null) {
                                method2197(var102);
                            }
                            Statics.method2453();
                            field454[++field475 - 1 & 0x1F] = var101 & 0x7FFF;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 4) {
                            int var108 = field328.method2265();
                            int var109 = field328.method2332();
                            class172 var110 = class172.method2211(var109);
                            if (var110.field2251 != 2 || var110.field2232 != var108) {
                                var110.field2251 = 2;
                                var110.field2232 = var108;
                                method2197(var110);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 47) {
                            int var111 = field328.method2424();
                            class172 var112 = class172.method2211(var111);
                            for (int var113 = 0; var113 < var112.field2326.length; var113++) {
                                var112.field2326[var113] = -1;
                                var112.field2326[var113] = 0;
                            }
                            method2197(var112);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 108) {
                            field521 = field328.method2379();
                            if (field521 == 255) {
                                field521 = 0;
                            }
                            field335 = field328.method2379();
                            if (field335 == 255) {
                                field335 = 0;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 167) {
                            field496 = field328.method2265() * 30;
                            field483 = field312;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 22) {
                            int var114 = field328.method2424();
                            int var115 = field328.method2267();
                            int var116 = field328.method2256();
                            class18 var117 = (class18) field447.method2611((long) var114);
                            if (var117 != null) {
                                method1633(var117, var117.field179 != var115);
                            }
                            class18 var118 = new class18();
                            var118.field179 = var115;
                            var118.field180 = var116;
                            field447.method2612(var118, (long) var114);
                            method1830(var115);
                            class172 var119 = class172.method2211(var114);
                            method2197(var119);
                            if (field450 != null) {
                                method2197(field450);
                                field450 = null;
                            }
                            method191();
                            method2917(Statics.field1985[var114 >> 16], var119, false);
                            class33.method1388(var115);
                            if (field446 != -1) {
                                int var120 = field446;
                                if (class172.method1982(var120)) {
                                    method1360(Statics.field1985[var120], 1);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 226) {
                            boolean var121 = field328.method2379() == 1;
                            if (var121) {
                                Statics.field873 = class132.method1336() - field328.method2320();
                                Statics.field2746 = new class2(field328, true);
                            } else {
                                Statics.field2746 = null;
                            }
                            field482 = field312;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 157) {
                            field299 = field328.method2379();
                            if (field299 == 1) {
                                field300 = field328.method2232();
                            }
                            if (field299 >= 2 && field299 <= 6) {
                                if (field299 == 2) {
                                    field305 = 64;
                                    field306 = 64;
                                }
                                if (field299 == 3) {
                                    field305 = 0;
                                    field306 = 64;
                                }
                                if (field299 == 4) {
                                    field305 = 128;
                                    field306 = 64;
                                }
                                if (field299 == 5) {
                                    field305 = 64;
                                    field306 = 0;
                                }
                                if (field299 == 6) {
                                    field305 = 64;
                                    field306 = 128;
                                }
                                field299 = 2;
                                field302 = field328.method2232();
                                field303 = field328.method2232();
                                field304 = field328.method2379();
                            }
                            if (field299 == 10) {
                                field301 = field328.method2232();
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 245) {
                            int var122 = field328.method2246();
                            int var123 = field328.method2232();
                            if (var122 < -70000) {
                                var123 += 32768;
                            }
                            class172 var124;
                            if (var122 >= 0) {
                                var124 = class172.method2211(var122);
                            } else {
                                var124 = null;
                            }
                            while (field328.field1956 < field329) {
                                int var125 = field328.method2242();
                                int var126 = field328.method2232();
                                int var127 = 0;
                                if (var126 != 0) {
                                    var127 = field328.method2379();
                                    if (var127 == 255) {
                                        var127 = field328.method2246();
                                    }
                                }
                                if (var124 != null && var125 >= 0 && var125 < var124.field2326.length) {
                                    var124.field2326[var125] = var126;
                                    var124.field2327[var125] = var127;
                                }
                                class13.method1632(var123, var125, var126 - 1, var127);
                            }
                            if (var124 != null) {
                                method2197(var124);
                            }
                            Statics.method2453();
                            field454[++field475 - 1 & 0x1F] = var123 & 0x7FFF;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 184) {
                            String var128 = field328.method2314();
                            class136 var129 = field328;
                            String var133;
                            try {
                                int var130 = var129.method2242();
                                if (var130 > 32767) {
                                    var130 = 32767;
                                }
                                byte[] var131 = new byte[var130];
                                var129.field1956 += Statics.field3128.method2157(var129.field1955, var129.field1956, var131, 0, var130);
                                String var132 = Statics.method1946(var131, 0, var130);
                                var133 = var132;
                            } catch (Exception var407) {
                                var133 = "Cabbage";
                            }
                            String var136 = class209.method3700(class215.method751(var133));
                            class48.method196(6, var128, var136);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 175) {
                            int var137 = field328.method2266();
                            int var138 = field328.method2267();
                            int var139 = field328.method2424();
                            class172 var140 = class172.method2211(var139);
                            var140.field2261 = (var138 << 16) + var137;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 183) {
                            for (int var141 = 0; var141 < field404.length; var141++) {
                                if (field404[var141] != null) {
                                    field404[var141].field627 = -1;
                                }
                            }
                            for (int var142 = 0; var142 < field534.length; var142++) {
                                if (field534[var142] != null) {
                                    field534[var142].field627 = -1;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 11) {
                            Statics.method2453();
                            int var143 = field328.method2334();
                            int var144 = field328.method2405();
                            int var145 = field328.method2379();
                            field421[var145] = var143;
                            field419[var145] = var144;
                            field420[var145] = 1;
                            for (int var146 = 0; var146 < 98; var146++) {
                                if (var143 >= class175.field2356[var146]) {
                                    field420[var145] = var146 + 2;
                                }
                            }
                            field476[++field365 - 1 & 0x1F] = var145;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 121) {
                            byte var147 = field328.method2348();
                            int var148 = field328.method2267();
                            class168.field2173[var148] = var147;
                            if (class168.field2174[var148] != var147) {
                                class168.field2174[var148] = var147;
                            }
                            method2939(var148);
                            field472[++field444 - 1 & 0x1F] = var148;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 15) {
                            int var149 = field328.method2332();
                            int var150 = field328.method2221();
                            class172 var151 = class172.method2211(var149);
                            if (var151.field2255 != var150 || var150 == -1) {
                                var151.field2255 = var150;
                                var151.field2330 = 0;
                                var151.field2215 = 0;
                                method2197(var151);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 177) {
                            field555 = 1;
                            field479 = field312;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 191) {
                            Statics.field3158 = field328.method2256();
                            Statics.field803 = field328.method2256();
                            while (field328.field1956 < field329) {
                                field330 = field328.method2379();
                                Statics.method3060();
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 199) {
                            int var152 = field328.method2267();
                            if (var152 == 65535) {
                                var152 = -1;
                            }
                            int var153 = field328.method2424();
                            int var154 = field328.method2246();
                            class172 var155 = class172.method2211(var154);
                            if (var155.field2324) {
                                var155.field2328 = var152;
                                var155.field2329 = var153;
                                class204 var157 = class204.method868(var152);
                                var155.field2264 = var157.field2995;
                                var155.field2300 = var157.field3005;
                                var155.field2313 = var157.field2997;
                                var155.field2257 = var157.field2998;
                                var155.field2258 = var157.field2999;
                                var155.field2245 = var157.field2994;
                                if (var157.field3000 == 1) {
                                    var155.field2266 = 1;
                                } else {
                                    var155.field2266 = 2;
                                }
                                if (var155.field2299 > 0) {
                                    var155.field2245 = var155.field2245 * 32 / var155.field2299;
                                } else if (var155.field2219 > 0) {
                                    var155.field2245 = var155.field2245 * 32 / var155.field2219;
                                }
                                method2197(var155);
                            } else {
                                if (var152 == -1) {
                                    var155.field2251 = 0;
                                    field330 = -1;
                                    var1 = true;
                                    break label2729;
                                }
                                class204 var156 = class204.method868(var152);
                                var155.field2251 = 4;
                                var155.field2232 = var152;
                                var155.field2264 = var156.field2995;
                                var155.field2300 = var156.field3005;
                                var155.field2245 = var156.field2994 * 100 / var153;
                                method2197(var155);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 21) {
                            method201(false);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 116) {
                            method109(true);
                            field328.method2484();
                            int var158 = field328.method2232();
                            class46.method753(field328, var158);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 112) {
                            field535 = false;
                            for (int var159 = 0; var159 < 5; var159++) {
                                field536[var159] = false;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 75) {
                            String var160 = field328.method2314();
                            long var161 = (long) field328.method2232();
                            long var163 = (long) field328.method2233();
                            class180 var165 = (class180) class125.method707(class180.method1390(), field328.method2379());
                            long var166 = (var161 << 32) + var163;
                            boolean var168 = false;
                            for (int var169 = 0; var169 < 100; var169++) {
                                if (field507[var169] == var166) {
                                    var168 = true;
                                    break;
                                }
                            }
                            if (method28(var160)) {
                                var168 = true;
                            }
                            if (!var168 && field403 == 0) {
                                field507[field349] = var166;
                                field349 = (field349 + 1) % 100;
                                class136 var170 = field328;
                                String var174;
                                try {
                                    int var171 = var170.method2242();
                                    if (var171 > 32767) {
                                        var171 = 32767;
                                    }
                                    byte[] var172 = new byte[var171];
                                    var170.field1956 += Statics.field3128.method2157(var170.field1955, var170.field1956, var172, 0, var171);
                                    String var173 = Statics.method1946(var172, 0, var171);
                                    var174 = var173;
                                } catch (Exception var406) {
                                    var174 = "Cabbage";
                                }
                                String var177 = class209.method3700(class215.method751(var174));
                                byte var178;
                                if (var165.field2670) {
                                    var178 = 7;
                                } else {
                                    var178 = 3;
                                }
                                if (var165.field2662 == -1) {
                                    class48.method196(var178, var160, var177);
                                } else {
                                    class48.method196(var178, class38.method1387(var165.field2662) + var160, var177);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 138) {
                            int var179 = field328.method2267();
                            if (var179 == 65535) {
                                var179 = -1;
                            }
                            if (var179 == -1 && !field526) {
                                class160.method219();
                            } else if (var179 != -1 && field525 != var179 && field502 != 0 && !field526) {
                                class187 var180 = Statics.field200;
                                int var181 = field502;
                                class160.field2064 = 1;
                                Statics.field2068 = var180;
                                Statics.field1990 = var179;
                                Statics.field2792 = 0;
                                Statics.field2070 = var181;
                                Statics.field165 = false;
                                Statics.field1544 = 2;
                            }
                            field525 = var179;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 54) {
                            int var182 = field328.method2265();
                            if (var182 == 65535) {
                                var182 = -1;
                            }
                            int var183 = field328.method2444();
                            method3083(var182, var183);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 239) {
                            String var184 = field328.method2314();
                            int var185 = field328.method2232();
                            byte var186 = field328.method2230();
                            boolean var187 = false;
                            if (var186 == -128) {
                                var187 = true;
                            }
                            if (var187) {
                                if (Statics.field1452 == 0) {
                                    field330 = -1;
                                    var1 = true;
                                    break label2729;
                                }
                                boolean var188 = false;
                                int var189;
                                for (var189 = 0; var189 < Statics.field1452 && (!Statics.field295[var189].field269.equals(var184) || Statics.field295[var189].field268 != var185); var189++) {
                                }
                                if (var189 < Statics.field1452) {
                                    while (var189 < Statics.field1452 - 1) {
                                        Statics.field295[var189] = Statics.field295[var189 + 1];
                                        var189++;
                                    }
                                    Statics.field1452--;
                                    Statics.field295[Statics.field1452] = null;
                                }
                            } else {
                                field328.method2314();
                                class25 var190 = new class25();
                                var190.field269 = var184;
                                var190.field277 = class212.method1943(var190.field269, Statics.field758);
                                var190.field268 = var185;
                                var190.field271 = var186;
                                int var191;
                                for (var191 = Statics.field1452 - 1; var191 >= 0; var191--) {
                                    int var192 = Statics.field295[var191].field277.compareTo(var190.field277);
                                    if (var192 == 0) {
                                        Statics.field295[var191].field268 = var185;
                                        Statics.field295[var191].field271 = var186;
                                        if (var184.equals(Statics.field233.field266)) {
                                            Statics.field243 = var186;
                                        }
                                        field480 = field312;
                                        field330 = -1;
                                        var1 = true;
                                        break label2729;
                                    }
                                    if (var192 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1452 >= Statics.field295.length) {
                                    field330 = -1;
                                    var1 = true;
                                    break label2729;
                                }
                                for (int var193 = Statics.field1452 - 1; var193 > var191; var193--) {
                                    Statics.field295[var193 + 1] = Statics.field295[var193];
                                }
                                if (Statics.field1452 == 0) {
                                    Statics.field295 = new class25[100];
                                }
                                Statics.field295[var191 + 1] = var190;
                                Statics.field1452++;
                                if (var184.equals(Statics.field233.field266)) {
                                    Statics.field243 = var186;
                                }
                            }
                            field480 = field312;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 244) {
                            int var194 = field328.method2266();
                            int var195 = field328.method2424();
                            int var196 = var194 >> 10 & 0x1F;
                            int var197 = var194 >> 5 & 0x1F;
                            int var198 = var194 & 0x1F;
                            int var199 = (var198 << 3) + (var196 << 19) + (var197 << 11);
                            class172 var200 = class172.method2211(var195);
                            if (var200.field2233 != var199) {
                                var200.field2233 = var199;
                                method2197(var200);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 139) {
                            method13();
                            field330 = -1;
                            var1 = false;
                            break label2729;
                        }
                        if (field330 == 60) {
                            method3056(field328.method2314());
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 0) {
                            int var201 = field328.method2246();
                            class18 var202 = (class18) field447.method2611((long) var201);
                            if (var202 != null) {
                                method1633(var202, true);
                            }
                            if (field450 != null) {
                                method2197(field450);
                                field450 = null;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 160) {
                            field523 = field328.method2379();
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 73) {
                            int var203 = field328.method2246();
                            String var204 = field328.method2314();
                            class172 var205 = class172.method2211(var203);
                            if (!var204.equals(var205.field2268)) {
                                var205.field2268 = var204;
                                method2197(var205);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 196) {
                            class232.method3428(field328, field329);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 128) {
                            for (int var206 = 0; var206 < Statics.field2784; var206++) {
                                class190 var207 = class190.method1975(var206);
                                if (var207 != null) {
                                    class168.field2173[var206] = 0;
                                    class168.field2174[var206] = 0;
                                }
                            }
                            Statics.method2453();
                            field444 += 32;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 44) {
                            int var208 = field328.method2232();
                            int var209 = field328.method2379();
                            int var210 = field328.method2232();
                            if (field552 != 0 && var209 != 0 && field529 < 50) {
                                field530[field529] = var208;
                                field531[field529] = var209;
                                field443[field529] = var210;
                                field505[field529] = null;
                                field494[field529] = 0;
                                field529++;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 187) {
                            int var214 = field328.method2265();
                            if (var214 == 65535) {
                                var214 = -1;
                            }
                            int var215 = field328.method2332();
                            int var216 = field328.method2334();
                            int var217 = field328.method2266();
                            if (var217 == 65535) {
                                var217 = -1;
                            }
                            for (int var218 = var217; var218 <= var214; var218++) {
                                long var219 = ((long) var215 << 32) + (long) var218;
                                class149 var221 = field428.method2611(var219);
                                if (var221 != null) {
                                    var221.method2652();
                                }
                                field428.method2612(new class155(var216), var219);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 211) {
                            Statics.method2453();
                            field452 = field328.method2254();
                            field483 = field312;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 95) {
                            Statics.method2453();
                            field451 = field328.method2379();
                            field483 = field312;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 198) {
                            int var222 = field328.method2266();
                            int var223 = field328.method2332();
                            class168.field2173[var222] = var223;
                            if (class168.field2174[var222] != var223) {
                                class168.field2174[var222] = var223;
                            }
                            method2939(var222);
                            field472[++field444 - 1 & 0x1F] = var222;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 110) {
                            int var224 = field328.method2232();
                            class13.method867(var224);
                            field454[++field475 - 1 & 0x1F] = var224 & 0x7FFF;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 65) {
                            method109(false);
                            field328.method2484();
                            int var225 = field328.method2232();
                            class46.method753(field328, var225);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 120) {
                            for (int var226 = 0; var226 < class168.field2174.length; var226++) {
                                if (class168.field2174[var226] != class168.field2173[var226]) {
                                    class168.field2174[var226] = class168.field2173[var226];
                                    method2939(var226);
                                    field472[++field444 - 1 & 0x1F] = var226;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 144) {
                            int var227 = field328.method2379();
                            if (field328.method2379() == 0) {
                                field563[var227] = new class5();
                                field328.field1956 += 18;
                            } else {
                                field328.field1956--;
                                field563[var227] = new class5(field328, false);
                            }
                            field481 = field312;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 86 || field330 == 87 || field330 == 232 || field330 == 158 || field330 == 102 || field330 == 97 || field330 == 193 || field330 == 85 || field330 == 151 || field330 == 119) {
                            Statics.method3060();
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 31) {
                            String var228 = field328.method2314();
                            long var229 = field328.method2320();
                            long var231 = (long) field328.method2232();
                            long var233 = (long) field328.method2233();
                            class180 var235 = (class180) class125.method707(class180.method1390(), field328.method2379());
                            long var236 = (var231 << 32) + var233;
                            boolean var238 = false;
                            for (int var239 = 0; var239 < 100; var239++) {
                                if (field507[var239] == var236) {
                                    var238 = true;
                                    break;
                                }
                            }
                            if (var235.field2671 && method28(var228)) {
                                var238 = true;
                            }
                            if (!var238 && field403 == 0) {
                                field507[field349] = var236;
                                field349 = (field349 + 1) % 100;
                                class136 var240 = field328;
                                String var244;
                                try {
                                    int var241 = var240.method2242();
                                    if (var241 > 32767) {
                                        var241 = 32767;
                                    }
                                    byte[] var242 = new byte[var241];
                                    var240.field1956 += Statics.field3128.method2157(var240.field1955, var240.field1956, var242, 0, var241);
                                    String var243 = Statics.method1946(var242, 0, var241);
                                    var244 = var243;
                                } catch (Exception var405) {
                                    var244 = "Cabbage";
                                }
                                String var247 = class209.method3700(class215.method751(var244));
                                if (var235.field2662 == -1) {
                                    Statics.method160(9, var228, var247, class213.method176(var229));
                                } else {
                                    Statics.method160(9, class38.method1387(var235.field2662) + var228, var247, class213.method176(var229));
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 159) {
                            int var248 = field328.method2242();
                            boolean var249 = field328.method2379() == 1;
                            String var250 = "";
                            boolean var251 = false;
                            if (var249) {
                                var250 = field328.method2314();
                                if (method28(var250)) {
                                    var251 = true;
                                }
                            }
                            String var252 = field328.method2314();
                            if (!var251) {
                                class48.method196(var248, var250, var252);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 124) {
                            Statics.field3158 = field328.method2257();
                            Statics.field803 = field328.method2257();
                            for (int var253 = Statics.field3158; var253 < Statics.field3158 + 8; var253++) {
                                for (int var254 = Statics.field803; var254 < Statics.field803 + 8; var254++) {
                                    if (field415[Statics.field533][var253][var254] != null) {
                                        field415[Statics.field533][var253][var254] = null;
                                        method762(var253, var254);
                                    }
                                }
                            }
                            for (class26 var255 = (class26) field416.method2666(); var255 != null; var255 = (class26) field416.method2668()) {
                                if (var255.field574 >= Statics.field3158 && var255.field574 < Statics.field3158 + 8 && var255.field575 >= Statics.field803 && var255.field575 < Statics.field803 + 8 && Statics.field533 == var255.field580) {
                                    var255.field583 = 0;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 99) {
                            int var256 = field328.method2246();
                            boolean var257 = field328.method2405() == 1;
                            class172 var258 = class172.method2211(var256);
                            if (var258.field2228 != var257) {
                                var258.field2228 = var257;
                                method2197(var258);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 34) {
                            int var259 = field328.method2257();
                            int var260 = field328.method2379();
                            String var261 = field328.method2314();
                            if (var260 >= 1 && var260 <= 8) {
                                if (var261.equalsIgnoreCase("null")) {
                                    var261 = null;
                                }
                                field411[var260 - 1] = var261;
                                field412[var260 - 1] = var259 == 0;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 71) {
                            while (field328.field1956 < field329) {
                                int var262 = field328.method2379();
                                boolean var263 = (var262 & 0x1) == 1;
                                String var264 = field328.method2314();
                                String var265 = field328.method2314();
                                field328.method2314();
                                for (int var266 = 0; var266 < field558; var266++) {
                                    class20 var267 = field465[var266];
                                    if (var263) {
                                        if (var265.equals(var267.field205)) {
                                            var267.field205 = var264;
                                            var267.field209 = var265;
                                            var264 = null;
                                            break;
                                        }
                                    } else if (var264.equals(var267.field205)) {
                                        var267.field205 = var264;
                                        var267.field209 = var265;
                                        var264 = null;
                                        break;
                                    }
                                }
                                if (var264 != null && field558 < 400) {
                                    class20 var268 = new class20();
                                    field465[field558] = var268;
                                    var268.field205 = var264;
                                    var268.field209 = var265;
                                    field558++;
                                }
                            }
                            field479 = field312;
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 48) {
                            field480 = field312;
                            if (field329 == 0) {
                                field486 = null;
                                field514 = null;
                                Statics.field1452 = 0;
                                Statics.field295 = null;
                                field330 = -1;
                                var1 = true;
                            } else {
                                field514 = field328.method2314();
                                long var269 = field328.method2320();
                                field486 = class213.method175(var269);
                                Statics.field333 = field328.method2230();
                                int var271 = field328.method2379();
                                if (var271 == 255) {
                                    field330 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1452 = var271;
                                    class25[] var272 = new class25[100];
                                    for (int var273 = 0; var273 < Statics.field1452; var273++) {
                                        var272[var273] = new class25();
                                        var272[var273].field269 = field328.method2314();
                                        var272[var273].field277 = class212.method1943(var272[var273].field269, Statics.field758);
                                        var272[var273].field268 = field328.method2232();
                                        var272[var273].field271 = field328.method2230();
                                        field328.method2314();
                                        if (var272[var273].field269.equals(Statics.field233.field266)) {
                                            Statics.field243 = var272[var273].field271;
                                        }
                                    }
                                    boolean var274 = false;
                                    int var275 = Statics.field1452;
                                    while (var275 > 0) {
                                        boolean var276 = true;
                                        var275--;
                                        for (int var277 = 0; var277 < var275; var277++) {
                                            if (var272[var277].field277.compareTo(var272[var277 + 1].field277) > 0) {
                                                class25 var278 = var272[var277];
                                                var272[var277] = var272[var277 + 1];
                                                var272[var277 + 1] = var278;
                                                var276 = false;
                                            }
                                        }
                                        if (var276) {
                                            break;
                                        }
                                    }
                                    Statics.field295 = var272;
                                    field330 = -1;
                                    var1 = true;
                                }
                            }
                            break label2729;
                        }
                        if (field330 == 17) {
                            field328.field1956 += 28;
                            if (field328.method2374()) {
                                class136 var279 = field328;
                                int var280 = field328.field1956 - 28;
                                method99(var279.field1955, var280);
                                class105.method1940(var279, var280);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 98) {
                            int var281 = field328.method2424();
                            int var282 = field328.method2221();
                            int var283 = field328.method2268();
                            class172 var284 = class172.method2211(var281);
                            if (var284.field2217 != var283 || var284.field2218 != var282 || var284.field2213 != 0 || var284.field2207 != 0) {
                                var284.field2217 = var283;
                                var284.field2218 = var282;
                                var284.field2213 = 0;
                                var284.field2207 = 0;
                                method2197(var284);
                                method1356(var284);
                                if (var284.field2331 == 0) {
                                    method2917(Statics.field1985[var281 >> 16], var284, false);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        if (field330 == 66) {
                            method201(true);
                            field330 = -1;
                            var1 = true;
                            break label2729;
                        }
                        class102.method3059("" + field330 + class38.field776 + field418 + class38.field776 + field467 + class38.field776 + field329, (Throwable) null);
                        method13();
                    } catch (IOException var411) {
                        method12();
                    } catch (Exception var412) {
                        String var287 = "" + field330 + class38.field776 + field418 + class38.field776 + field467 + class38.field776 + field329 + class38.field776 + (Statics.field1726 + Statics.field233.field662[0]) + class38.field776 + (Statics.field1776 + Statics.field233.field656[0]) + class38.field776;
                        for (int var288 = 0; var288 < field329 && var288 < 50; var288++) {
                            var287 = var287 + field328.field1955[var288] + class38.field776;
                        }
                        class102.method3059(var287, var412);
                        method13();
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
        while (true) {
            class231 var289 = (class231) class232.field3266.method2628();
            boolean var290;
            if (var289 == null) {
                var290 = false;
            } else {
                var290 = true;
            }
            if (!var290) {
                Object var292 = Statics.field2679.field216;
                synchronized (Statics.field2679.field216) {
                    if (!field281) {
                        Statics.field2679.field218 = 0;
                    } else if (class116.field1812 != 0 || Statics.field2679.field218 >= 40) {
                        field326.method2480(249);
                        field326.method2215(0);
                        int var293 = field326.field1956;
                        int var294 = 0;
                        for (int var295 = 0; var295 < Statics.field2679.field218 && field326.field1956 - var293 < 240; var295++) {
                            var294++;
                            int var296 = Statics.field2679.field219[var295];
                            if (var296 < 0) {
                                var296 = 0;
                            } else if (var296 > 502) {
                                var296 = 502;
                            }
                            int var297 = Statics.field2679.field215[var295];
                            if (var297 < 0) {
                                var297 = 0;
                            } else if (var297 > 764) {
                                var297 = 764;
                            }
                            int var298 = var296 * 765 + var297;
                            if (Statics.field2679.field219[var295] == -1 && Statics.field2679.field215[var295] == -1) {
                                var297 = -1;
                                var296 = -1;
                                var298 = 524287;
                            }
                            if (field499 != var297 || field520 != var296) {
                                int var299 = var297 - field499;
                                field499 = var297;
                                int var300 = var296 - field520;
                                field520 = var296;
                                if (field556 < 8 && var299 >= -32 && var299 <= 31 && var300 >= -32 && var300 <= 31) {
                                    var299 += 32;
                                    var300 += 32;
                                    field326.method2216((field556 << 12) + (var299 << 6) + var300);
                                    field556 = 0;
                                } else if (field556 < 8) {
                                    field326.method2305((field556 << 19) + 8388608 + var298);
                                    field556 = 0;
                                } else {
                                    field326.method2218((field556 << 19) + -1073741824 + var298);
                                    field556 = 0;
                                }
                            } else if (field556 < 2047) {
                                field556++;
                            }
                        }
                        field326.method2227(field326.field1956 - var293);
                        if (var294 >= Statics.field2679.field218) {
                            Statics.field2679.field218 = 0;
                        } else {
                            Statics.field2679.field218 -= var294;
                            for (int var301 = 0; var301 < Statics.field2679.field218; var301++) {
                                Statics.field2679.field215[var301] = Statics.field2679.field215[var294 + var301];
                                Statics.field2679.field219[var301] = Statics.field2679.field219[var294 + var301];
                            }
                        }
                    }
                }
                if (class116.field1812 == 1 || !Statics.field663 && class116.field1812 == 4 || class116.field1812 == 2) {
                    long var303 = (class116.field1815 - field406 * -1L) / 50L;
                    if (var303 > 4095L) {
                        var303 = 4095L;
                    }
                    field406 = class116.field1815 * -1L;
                    int var305 = class116.field1814;
                    if (var305 < 0) {
                        var305 = 0;
                    } else if (var305 > Statics.field2727) {
                        var305 = Statics.field2727;
                    }
                    int var306 = class116.field1803;
                    if (var306 < 0) {
                        var306 = 0;
                    } else if (var306 > Statics.field2761) {
                        var306 = Statics.field2761;
                    }
                    int var307 = (int) var303;
                    field326.method2480(170);
                    field326.method2216((var307 << 1) + (class116.field1812 == 2 ? 1 : 0));
                    field326.method2216(var306);
                    field326.method2216(var305);
                }
                if (class106.field1708 > 0) {
                    field326.method2480(55);
                    field326.method2216(0);
                    int var308 = field326.field1956;
                    long var309 = class132.method1336();
                    for (int var311 = 0; var311 < class106.field1708; var311++) {
                        long var312 = var309 - field512;
                        if (var312 > 16777215L) {
                            var312 = 16777215L;
                        }
                        field512 = var309;
                        field326.method2346(class106.field1701[var311]);
                        field326.method2298((int) var312);
                    }
                    field326.method2226(field326.field1956 - var308);
                }
                if (field384 > 0) {
                    field384--;
                }
                if (class106.field1696[96] || class106.field1696[97] || class106.field1696[98] || class106.field1696[99]) {
                    field375 = true;
                }
                if (field375 && field384 <= 0) {
                    field384 = 20;
                    field375 = false;
                    field326.method2480(237);
                    field326.method2216(field368);
                    field326.method2222(field367);
                }
                if (Statics.field2832 && !field296) {
                    field296 = true;
                    field326.method2480(189);
                    field326.method2215(1);
                }
                if (!Statics.field2832 && field296) {
                    field296 = false;
                    field326.method2480(189);
                    field326.method2215(0);
                }
                if (Statics.field533 != field516) {
                    field516 = Statics.field533;
                    int var314 = Statics.field533;
                    int[] var315 = Statics.field2001.field3238;
                    int var316 = var315.length;
                    for (int var317 = 0; var317 < var316; var317++) {
                        var315[var317] = 0;
                    }
                    for (int var318 = 1; var318 < 103; var318++) {
                        int var319 = (103 - var318) * 2048 + 24628;
                        for (int var320 = 1; var320 < 103; var320++) {
                            if ((class11.field93[var314][var320][var318] & 0x18) == 0) {
                                Statics.field2347.method1646(var315, var319, 512, var314, var320, var318);
                            }
                            if (var314 < 3 && (class11.field93[var314 + 1][var320][var318] & 0x8) != 0) {
                                Statics.field2347.method1646(var315, var319, 512, var314 + 1, var320, var318);
                            }
                            var319 += 4;
                        }
                    }
                    int var321 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var322 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field2001.method3971();
                    for (int var323 = 1; var323 < 103; var323++) {
                        for (int var324 = 1; var324 < 103; var324++) {
                            if ((class11.field93[var314][var324][var323] & 0x18) == 0) {
                                method3063(var314, var324, var323, var321, var322);
                            }
                            if (var314 < 3 && (class11.field93[var314 + 1][var324][var323] & 0x8) != 0) {
                                method3063(var314 + 1, var324, var323, var321, var322);
                            }
                        }
                    }
                    field517 = 0;
                    for (int var325 = 0; var325 < 104; var325++) {
                        for (int var326 = 0; var326 < 104; var326++) {
                            int var327 = Statics.field2347.method1665(Statics.field533, var325, var326);
                            if (var327 != 0) {
                                int var328 = var327 >> 14 & 0x7FFF;
                                int var329 = class203.method579(var328).field2953;
                                if (var329 >= 0) {
                                    int var330 = var325;
                                    int var331 = var326;
                                    if (var329 != 22 && var329 != 29 && var329 != 34 && var329 != 36 && var329 != 46 && var329 != 47 && var329 != 48) {
                                        int[][] var332 = field343[Statics.field533].field1838;
                                        for (int var333 = 0; var333 < 10; var333++) {
                                            int var334 = (int) (Math.random() * 4.0D);
                                            if (var334 == 0 && var330 > 0 && var330 > var325 - 3 && (var332[var330 - 1][var331] & 0x1240108) == 0) {
                                                var330--;
                                            }
                                            if (var334 == 1 && var330 < 103 && var330 < var325 + 3 && (var332[var330 + 1][var331] & 0x1240180) == 0) {
                                                var330++;
                                            }
                                            if (var334 == 2 && var331 > 0 && var331 > var326 - 3 && (var332[var330][var331 - 1] & 0x1240102) == 0) {
                                                var331--;
                                            }
                                            if (var334 == 3 && var331 < 103 && var331 < var326 + 3 && (var332[var330][var331 + 1] & 0x1240120) == 0) {
                                                var331++;
                                            }
                                        }
                                    }
                                    field571[field517] = Statics.field1720[var329];
                                    field506[field517] = var330;
                                    field519[field517] = var331;
                                    field517++;
                                }
                            }
                        }
                    }
                    Statics.field1527.method3923();
                }
                if (field289 != 30) {
                    return;
                }
                method79();
                method3062();
                field331++;
                if (field331 > 750) {
                    if (field490 > 0) {
                        method13();
                    } else {
                        method112(40);
                        Statics.field1980 = Statics.field161;
                        Statics.field161 = null;
                    }
                    return;
                }
                int var335 = class46.field892;
                int[] var336 = class46.field895;
                for (int var337 = 0; var337 < var335; var337++) {
                    class24 var338 = field404[var336[var337]];
                    if (var338 != null) {
                        method199(var338, 1);
                    }
                }
                method878();
                method2081();
                field359++;
                if (field394 != 0) {
                    field334 += 20;
                    if (field334 >= 400) {
                        field394 = 0;
                    }
                }
                if (Statics.field733 != null) {
                    field395++;
                    if (field395 >= 15) {
                        method2197(Statics.field733);
                        Statics.field733 = null;
                    }
                }
                class172 var339 = Statics.field921;
                class172 var340 = Statics.field143;
                Statics.field921 = null;
                Statics.field143 = null;
                field463 = null;
                field377 = false;
                field464 = false;
                field509 = 0;
                while (class106.method897() && field509 < 128) {
                    if (field518 >= 2 && class106.field1696[82] && Statics.field2653 == 66) {
                        String var341 = "";
                        Iterator var342 = class48.field925.iterator();
                        while (var342.hasNext()) {
                            class22 var343 = (class22) var342.next();
                            var341 = var341 + var343.field226 + ':' + var343.field224 + '\n';
                        }
                        Statics.field29.setContents(new StringSelection(var341), (ClipboardOwner) null);
                    } else {
                        field511[field509] = Statics.field2653;
                        field445[field509] = Statics.field572;
                        field509++;
                    }
                }
                if (field446 != -1) {
                    method102(field446, 0, 0, Statics.field2761, Statics.field2727, 0, 0);
                }
                field312++;
                while (true) {
                    class19 var346;
                    class172 var347;
                    class172 var348;
                    do {
                        var346 = (class19) field477.method2664();
                        if (var346 == null) {
                            while (true) {
                                class19 var349;
                                class172 var350;
                                class172 var351;
                                do {
                                    var349 = (class19) field487.method2664();
                                    if (var349 == null) {
                                        while (true) {
                                            class19 var352;
                                            class172 var353;
                                            class172 var354;
                                            do {
                                                var352 = (class19) field485.method2664();
                                                if (var352 == null) {
                                                    method220();
                                                    if (field459 != null) {
                                                        method2197(field459);
                                                        Statics.field1639++;
                                                        if (field377 && field464) {
                                                            int var355 = class116.field1806;
                                                            int var356 = class116.field1807;
                                                            int var357 = var355 - field493;
                                                            int var358 = var356 - field462;
                                                            if (var357 < field381) {
                                                                var357 = field381;
                                                            }
                                                            if (field459.field2336 + var357 > field381 + field497.field2336) {
                                                                var357 = field381 + field497.field2336 - field459.field2336;
                                                            }
                                                            if (var358 < field466) {
                                                                var358 = field466;
                                                            }
                                                            if (field459.field2341 + var358 > field466 + field497.field2341) {
                                                                var358 = field466 + field497.field2341 - field459.field2341;
                                                            }
                                                            int var359 = var357 - field468;
                                                            int var360 = var358 - field398;
                                                            int var361 = field459.field2284;
                                                            if (Statics.field1639 > field459.field2285 && (var359 > var361 || var359 < -var361 || var360 > var361 || var360 < -var361)) {
                                                                field470 = true;
                                                            }
                                                            int var362 = field497.field2229 + (var357 - field381);
                                                            int var363 = field497.field2234 + (var358 - field466);
                                                            if (field459.field2297 != null && field470) {
                                                                class19 var364 = new class19();
                                                                var364.field190 = field459;
                                                                var364.field194 = var362;
                                                                var364.field188 = var363;
                                                                var364.field197 = field459.field2297;
                                                                class33.method887(var364, 200000);
                                                            }
                                                            if (class116.field1800 == 0) {
                                                                if (field470) {
                                                                    if (field459.field2298 != null) {
                                                                        class19 var365 = new class19();
                                                                        var365.field190 = field459;
                                                                        var365.field194 = var362;
                                                                        var365.field188 = var363;
                                                                        var365.field196 = field463;
                                                                        var365.field197 = field459.field2298;
                                                                        class33.method887(var365, 200000);
                                                                    }
                                                                    if (field463 != null && method1911(field459) != null) {
                                                                        field326.method2480(43);
                                                                        field326.method2222(field463.field2209);
                                                                        field326.method2216(field459.field2328);
                                                                        field326.method2263(field463.field2328);
                                                                        field326.method2258(field459.field2208);
                                                                        field326.method2258(field463.field2208);
                                                                        field326.method2216(field459.field2209);
                                                                    }
                                                                } else {
                                                                    label2913: {
                                                                        int var366 = method2062();
                                                                        if (field424 > 2) {
                                                                            label2888: {
                                                                                label2843: {
                                                                                    if (field422 == 1) {
                                                                                        boolean var367;
                                                                                        if (field424 <= 0) {
                                                                                            var367 = false;
                                                                                        } else if (field433 && class106.field1696[81] && field432 != -1) {
                                                                                            var367 = true;
                                                                                        } else {
                                                                                            var367 = false;
                                                                                        }
                                                                                        if (!var367) {
                                                                                            break label2843;
                                                                                        }
                                                                                    }
                                                                                    boolean var368;
                                                                                    if (var366 < 0) {
                                                                                        var368 = false;
                                                                                    } else {
                                                                                        int var369 = field427[var366];
                                                                                        if (var369 >= 2000) {
                                                                                            var369 -= 2000;
                                                                                        }
                                                                                        if (var369 == 1007) {
                                                                                            var368 = true;
                                                                                        } else {
                                                                                            var368 = false;
                                                                                        }
                                                                                    }
                                                                                    if (!var368) {
                                                                                        break label2888;
                                                                                    }
                                                                                }
                                                                                method801(field493 + field468, field462 + field398);
                                                                                break label2913;
                                                                            }
                                                                        }
                                                                        if (field424 > 0) {
                                                                            method1631(field493 + field468, field462 + field398);
                                                                        }
                                                                    }
                                                                }
                                                                field459 = null;
                                                            }
                                                        } else if (Statics.field1639 > 1) {
                                                            field459 = null;
                                                        }
                                                    }
                                                    if (Statics.field1628 != null) {
                                                        method2197(Statics.field1628);
                                                        field405++;
                                                        if (class116.field1800 == 0) {
                                                            if (!field401) {
                                                                label2916: {
                                                                    int var378 = method2062();
                                                                    if (field424 > 2) {
                                                                        label2895: {
                                                                            label2848: {
                                                                                if (field422 == 1) {
                                                                                    boolean var379;
                                                                                    if (field424 <= 0) {
                                                                                        var379 = false;
                                                                                    } else if (field433 && class106.field1696[81] && field432 != -1) {
                                                                                        var379 = true;
                                                                                    } else {
                                                                                        var379 = false;
                                                                                    }
                                                                                    if (!var379) {
                                                                                        break label2848;
                                                                                    }
                                                                                }
                                                                                boolean var380;
                                                                                if (var378 < 0) {
                                                                                    var380 = false;
                                                                                } else {
                                                                                    int var381 = field427[var378];
                                                                                    if (var381 >= 2000) {
                                                                                        var381 -= 2000;
                                                                                    }
                                                                                    if (var381 == 1007) {
                                                                                        var380 = true;
                                                                                    } else {
                                                                                        var380 = false;
                                                                                    }
                                                                                }
                                                                                if (!var380) {
                                                                                    break label2895;
                                                                                }
                                                                            }
                                                                            method801(field541, field399);
                                                                            break label2916;
                                                                        }
                                                                    }
                                                                    if (field424 > 0) {
                                                                        method1631(field541, field399);
                                                                    }
                                                                }
                                                            } else if (Statics.field84 == Statics.field1628 && field489 != field400) {
                                                                class172 var370 = Statics.field1628;
                                                                byte var371 = 0;
                                                                if (field449 == 1 && var370.field2212 == 206) {
                                                                    var371 = 1;
                                                                }
                                                                if (var370.field2326[field400] <= 0) {
                                                                    var371 = 0;
                                                                }
                                                                int var372 = method1872(var370);
                                                                boolean var373 = (var372 >> 29 & 0x1) != 0;
                                                                if (var373) {
                                                                    int var374 = field489;
                                                                    int var375 = field400;
                                                                    var370.field2326[var375] = var370.field2326[var374];
                                                                    var370.field2327[var375] = var370.field2327[var374];
                                                                    var370.field2326[var374] = -1;
                                                                    var370.field2327[var374] = 0;
                                                                } else if (var371 == 1) {
                                                                    int var376 = field489;
                                                                    int var377 = field400;
                                                                    while (var376 != var377) {
                                                                        if (var376 > var377) {
                                                                            var370.method2992(var376 - 1, var376);
                                                                            var376--;
                                                                        } else if (var376 < var377) {
                                                                            var370.method2992(var376 + 1, var376);
                                                                            var376++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var370.method2992(field400, field489);
                                                                }
                                                                field326.method2480(245);
                                                                field326.method2346(var371);
                                                                field326.method2222(field489);
                                                                field326.method2258(Statics.field1628.field2208);
                                                                field326.method2222(field400);
                                                            }
                                                            field395 = 10;
                                                            class116.field1812 = 0;
                                                            Statics.field1628 = null;
                                                        } else if (field405 >= 5 && (class116.field1806 > field541 + 5 || class116.field1806 < field541 - 5 || class116.field1807 > field399 + 5 || class116.field1807 < field399 - 5)) {
                                                            field401 = true;
                                                        }
                                                    }
                                                    if (class88.method1703()) {
                                                        int var382 = class88.field1483;
                                                        int var383 = class88.field1499;
                                                        field326.method2480(149);
                                                        field326.method2215(5);
                                                        field326.method2346(class106.field1696[82] ? (class106.field1696[81] ? 2 : 1) : 0);
                                                        field326.method2373(Statics.field1726 + var382);
                                                        field326.method2263(Statics.field1776 + var383);
                                                        class88.method1676();
                                                        field551 = class116.field1803;
                                                        field392 = class116.field1814;
                                                        field394 = 1;
                                                        field334 = 0;
                                                        field521 = var382;
                                                        field335 = var383;
                                                    }
                                                    if (Statics.field921 != var339) {
                                                        if (var339 != null) {
                                                            method2197(var339);
                                                        }
                                                        if (Statics.field921 != null) {
                                                            method2197(Statics.field921);
                                                        }
                                                    }
                                                    if (Statics.field143 != var340 && field438 == field437) {
                                                        if (var340 != null) {
                                                            method2197(var340);
                                                        }
                                                        if (Statics.field143 != null) {
                                                            method2197(Statics.field143);
                                                        }
                                                    }
                                                    if (Statics.field143 == null) {
                                                        if (field437 > 0) {
                                                            field437--;
                                                        }
                                                    } else if (field437 < field438) {
                                                        field437++;
                                                        if (field438 == field437) {
                                                            method2197(Statics.field143);
                                                        }
                                                    }
                                                    method168();
                                                    if (field535) {
                                                        int var384 = Statics.field37 * 128 + 64;
                                                        int var385 = Statics.field1598 * 128 + 64;
                                                        int var386 = method599(var384, var385, Statics.field533) - Statics.field1555;
                                                        if (Statics.field234 < var384) {
                                                            Statics.field234 += Statics.field1970 * (var384 - Statics.field234) / 1000 + Statics.field61;
                                                            if (Statics.field234 > var384) {
                                                                Statics.field234 = var384;
                                                            }
                                                        }
                                                        if (Statics.field234 > var384) {
                                                            Statics.field234 -= Statics.field1970 * (Statics.field234 - var384) / 1000 + Statics.field61;
                                                            if (Statics.field234 < var384) {
                                                                Statics.field234 = var384;
                                                            }
                                                        }
                                                        if (Statics.field17 < var386) {
                                                            Statics.field17 += Statics.field1970 * (var386 - Statics.field17) / 1000 + Statics.field61;
                                                            if (Statics.field17 > var386) {
                                                                Statics.field17 = var386;
                                                            }
                                                        }
                                                        if (Statics.field17 > var386) {
                                                            Statics.field17 -= Statics.field1970 * (Statics.field17 - var386) / 1000 + Statics.field61;
                                                            if (Statics.field17 < var386) {
                                                                Statics.field17 = var386;
                                                            }
                                                        }
                                                        if (Statics.field142 < var385) {
                                                            Statics.field142 += Statics.field1970 * (var385 - Statics.field142) / 1000 + Statics.field61;
                                                            if (Statics.field142 > var385) {
                                                                Statics.field142 = var385;
                                                            }
                                                        }
                                                        if (Statics.field142 > var385) {
                                                            Statics.field142 -= Statics.field1970 * (Statics.field142 - var385) / 1000 + Statics.field61;
                                                            if (Statics.field142 < var385) {
                                                                Statics.field142 = var385;
                                                            }
                                                        }
                                                        int var387 = Statics.field64 * 128 + 64;
                                                        int var388 = Statics.field1975 * 128 + 64;
                                                        int var389 = method599(var387, var388, Statics.field533) - Statics.field96;
                                                        int var390 = var387 - Statics.field234;
                                                        int var391 = var389 - Statics.field17;
                                                        int var392 = var388 - Statics.field142;
                                                        int var393 = (int) Math.sqrt((double) (var390 * var390 + var392 * var392));
                                                        int var394 = (int) (Math.atan2((double) var391, (double) var393) * 325.949D) & 0x7FF;
                                                        int var395 = (int) (Math.atan2((double) var390, (double) var392) * -325.949D) & 0x7FF;
                                                        if (var394 < 128) {
                                                            var394 = 128;
                                                        }
                                                        if (var394 > 383) {
                                                            var394 = 383;
                                                        }
                                                        if (Statics.field1733 < var394) {
                                                            Statics.field1733 += Statics.field1962 * (var394 - Statics.field1733) / 1000 + Statics.field885;
                                                            if (Statics.field1733 > var394) {
                                                                Statics.field1733 = var394;
                                                            }
                                                        }
                                                        if (Statics.field1733 > var394) {
                                                            Statics.field1733 -= Statics.field1962 * (Statics.field1733 - var394) / 1000 + Statics.field885;
                                                            if (Statics.field1733 < var394) {
                                                                Statics.field1733 = var394;
                                                            }
                                                        }
                                                        int var396 = var395 - Statics.field147;
                                                        if (var396 > 1024) {
                                                            var396 -= 2048;
                                                        }
                                                        if (var396 < -1024) {
                                                            var396 += 2048;
                                                        }
                                                        if (var396 > 0) {
                                                            Statics.field147 += Statics.field1962 * var396 / 1000 + Statics.field885;
                                                            Statics.field147 &= 0x7FF;
                                                        }
                                                        if (var396 < 0) {
                                                            Statics.field147 -= Statics.field1962 * -var396 / 1000 + Statics.field885;
                                                            Statics.field147 &= 0x7FF;
                                                        }
                                                        int var397 = var395 - Statics.field147;
                                                        if (var397 > 1024) {
                                                            var397 -= 2048;
                                                        }
                                                        if (var397 < -1024) {
                                                            var397 += 2048;
                                                        }
                                                        if (var397 < 0 && var396 > 0 || var397 > 0 && var396 < 0) {
                                                            Statics.field147 = var395;
                                                        }
                                                    }
                                                    for (int var398 = 0; var398 < 5; var398++) {
                                                        int var10002 = field540[var398]++;
                                                    }
                                                    Statics.field274.method842();
                                                    int var399 = class116.method194();
                                                    int var400 = class106.method3080();
                                                    if (var399 > 15000 && var400 > 15000) {
                                                        field490 = 250;
                                                        class116.method891(14500);
                                                        field326.method2480(147);
                                                    }
                                                    field353++;
                                                    if (field353 > 500) {
                                                        field353 = 0;
                                                        int var401 = (int) (Math.random() * 8.0D);
                                                        if ((var401 & 0x1) == 1) {
                                                            field347 += field348;
                                                        }
                                                        if ((var401 & 0x2) == 2) {
                                                            field527 += field350;
                                                        }
                                                        if ((var401 & 0x4) == 4) {
                                                            field426 += field513;
                                                        }
                                                    }
                                                    if (field347 < -50) {
                                                        field348 = 2;
                                                    }
                                                    if (field347 > 50) {
                                                        field348 = -2;
                                                    }
                                                    if (field527 < -55) {
                                                        field350 = 2;
                                                    }
                                                    if (field527 > 55) {
                                                        field350 = -2;
                                                    }
                                                    if (field426 < -40) {
                                                        field513 = 1;
                                                    }
                                                    if (field426 > 40) {
                                                        field513 = -1;
                                                    }
                                                    field358++;
                                                    if (field358 > 500) {
                                                        field358 = 0;
                                                        int var402 = (int) (Math.random() * 8.0D);
                                                        if ((var402 & 0x1) == 1) {
                                                            field354 += field355;
                                                        }
                                                        if ((var402 & 0x2) == 2) {
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
                                                    for (class17 var403 = (class17) field557.method2695(); var403 != null; var403 = (class17) field557.method2696()) {
                                                        if ((long) var403.field173 < class132.method1336() / 1000L - 5L) {
                                                            if (var403.field172 > 0) {
                                                                class48.method196(5, "", var403.field171 + class176.field2503);
                                                            }
                                                            if (var403.field172 == 0) {
                                                                class48.method196(5, "", var403.field171 + class176.field2504);
                                                            }
                                                            var403.method2703();
                                                        }
                                                    }
                                                    field332++;
                                                    if (field332 > 50) {
                                                        field326.method2480(102);
                                                    }
                                                    try {
                                                        if (Statics.field161 != null && field326.field1956 > 0) {
                                                            Statics.field161.method1953(field326.field1955, 0, field326.field1956);
                                                            field326.field1956 = 0;
                                                            field332 = 0;
                                                        }
                                                    } catch (IOException var408) {
                                                        if (field490 > 0) {
                                                            method13();
                                                        } else {
                                                            method112(40);
                                                            Statics.field1980 = Statics.field161;
                                                            Statics.field161 = null;
                                                        }
                                                    }
                                                    return;
                                                }
                                                var353 = var352.field190;
                                                if (var353.field2209 < 0) {
                                                    break;
                                                }
                                                var354 = class172.method2211(var353.field2227);
                                            } while (var354 == null || var354.field2332 == null || var353.field2209 >= var354.field2332.length || var354.field2332[var353.field2209] != var353);
                                            class33.method887(var352, 200000);
                                        }
                                    }
                                    var350 = var349.field190;
                                    if (var350.field2209 < 0) {
                                        break;
                                    }
                                    var351 = class172.method2211(var350.field2227);
                                } while (var351 == null || var351.field2332 == null || var350.field2209 >= var351.field2332.length || var351.field2332[var350.field2209] != var350);
                                class33.method887(var349, 200000);
                            }
                        }
                        var347 = var346.field190;
                        if (var347.field2209 < 0) {
                            break;
                        }
                        var348 = class172.method2211(var347.field2227);
                    } while (var348 == null || var348.field2332 == null || var347.field2209 >= var348.field2332.length || var348.field2332[var347.field2209] != var347);
                    class33.method887(var346, 200000);
                }
            }
            field326.method2480(33);
            field326.method2215(0);
            int var291 = field326.field1956;
            class232.method205(field326);
            field326.method2227(field326.field1956 - var291);
        }
    }

    @ObfuscatedName("df.ac(I)V")
    public static final void method2051() {
        if (Statics.field57 != null) {
            Statics.field57.method1050();
        }
        if (Statics.field71 != null) {
            Statics.field71.method1050();
        }
    }

    @ObfuscatedName("fq.az(I)V")
    public static final void method3062() {
        for (int var0 = 0; var0 < field529; var0++) {
            int var10002 = field443[var0]--;
            if (field443[var0] >= -10) {
                class54 var2 = field505[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method965(Statics.field2883, field530[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field443[var0] += var2.method964();
                    field505[var0] = var2;
                }
                if (field443[var0] < 0) {
                    int var9;
                    if (field494[var0] == 0) {
                        var9 = field552;
                    } else {
                        int var3 = (field494[var0] & 0xFF) * 128;
                        int var4 = field494[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field233.field629;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field494[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field233.field601;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field443[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field528 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method963().method1008(Statics.field1849);
                        class67 var11 = class67.method1225(var10, 100, var9);
                        var11.method1220(field531[var0] - 1);
                        Statics.field1792.method907(var11);
                    }
                    field443[var0] = -100;
                }
            } else {
                field529--;
                for (int var1 = var0; var1 < field529; var1++) {
                    field530[var1] = field530[var1 + 1];
                    field505[var1] = field505[var1 + 1];
                    field531[var1] = field531[var1 + 1];
                    field443[var1] = field443[var1 + 1];
                    field494[var1] = field494[var1 + 1];
                }
                var0--;
            }
        }
        if (!field526) {
            return;
        }
        boolean var12;
        if (class160.field2064 == 0) {
            var12 = Statics.field2067.method2750();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field502 != 0 && field525 != -1) {
                class160.method888(Statics.field200, field525, 0, field502, false);
            }
            field526 = false;
        }
    }

    @ObfuscatedName("az.ao(Lgg;IIII)V")
    public static void method640(class207 arg0, int arg1, int arg2, int arg3) {
        if (field529 >= 50 || field528 == 0 || arg0.field3096 == null || arg1 >= arg0.field3096.length) {
            return;
        }
        int var4 = arg0.field3096[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field530[field529] = var5;
        field531[field529] = var6;
        field443[field529] = 0;
        field505[field529] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field494[field529] = (var8 << 16) + (var9 << 8) + var7;
        field529++;
    }

    @ObfuscatedName("ge.ak(III)V")
    public static void method3083(int arg0, int arg1) {
        if (field502 != 0 && arg0 != -1) {
            class160.method888(Statics.field2846, arg0, 0, field502, false);
            field526 = true;
        }
    }

    @ObfuscatedName("df.aa(Lfc;III)V")
    public static final void method2042(class172 arg0, int arg1, int arg2) {
        if (field523 != 0 && field523 != 3 || class116.field1812 != 1 && Statics.field663 || class116.field1812 != 4) {
            return;
        }
        class167 var3 = arg0.method3011(true);
        if (var3 == null) {
            return;
        }
        int var4 = class116.field1803 - arg1;
        int var5 = class116.field1814 - arg2;
        if (!var3.method2933(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2168 / 2;
        int var7 = var5 - var3.field2166 / 2;
        int var8 = field368 + field354 & 0x7FF;
        int var9 = class85.field1434[var8];
        int var10 = class85.field1442[var8];
        int var11 = (field356 + 256) * var9 >> 8;
        int var12 = (field356 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field233.field629 + var13 >> 7;
        int var16 = Statics.field233.field601 - var14 >> 7;
        field326.method2480(196);
        field326.method2215(18);
        field326.method2346(class106.field1696[82] ? (class106.field1696[81] ? 2 : 1) : 0);
        field326.method2373(Statics.field1726 + var15);
        field326.method2263(Statics.field1776 + var16);
        field326.method2215(var6);
        field326.method2215(var7);
        field326.method2216(field368);
        field326.method2215(57);
        field326.method2215(field354);
        field326.method2215(field356);
        field326.method2215(89);
        field326.method2216(Statics.field233.field629);
        field326.method2216(Statics.field233.field601);
        field326.method2215(63);
        field521 = var15;
        field335 = var16;
    }

    @ObfuscatedName("dh.aj(B)V")
    public static final void method2081() {
        int[] var0 = class46.field895;
        for (int var1 = 0; var1 < class46.field892; var1++) {
            class24 var2 = field404[var0[var1]];
            if (var2 != null && var2.field616 > 0) {
                var2.field616--;
                if (var2.field616 == 0) {
                    var2.field613 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field322; var3++) {
            int var4 = field351[var3];
            class36 var5 = field534[var4];
            if (var5 != null && var5.field616 > 0) {
                var5.field616--;
                if (var5.field616 == 0) {
                    var5.field613 = null;
                }
            }
        }
    }

    @ObfuscatedName("r.ay(B)V")
    public static final void method168() {
        int var0 = field347 + Statics.field233.field629;
        int var1 = field527 + Statics.field233.field601;
        if (Statics.field121 - var0 < -500 || Statics.field121 - var0 > 500 || Statics.field80 - var1 < -500 || Statics.field80 - var1 > 500) {
            Statics.field121 = var0;
            Statics.field80 = var1;
        }
        if (Statics.field121 != var0) {
            Statics.field121 += (var0 - Statics.field121) / 16;
        }
        if (Statics.field80 != var1) {
            Statics.field80 += (var1 - Statics.field80) / 16;
        }
        if (class116.field1800 == 4 && Statics.field663) {
            int var2 = class116.field1807 - field372;
            field471 = var2 * 2;
            field372 = var2 == -1 || var2 == 1 ? class116.field1807 : (field372 + class116.field1807) / 2;
            int var3 = field371 - class116.field1806;
            field374 = var3 * 2;
            field371 = var3 == -1 || var3 == 1 ? class116.field1806 : (field371 + class116.field1806) / 2;
        } else {
            if (class106.field1696[96]) {
                field374 += (-24 - field374) / 2;
            } else if (class106.field1696[97]) {
                field374 += (24 - field374) / 2;
            } else {
                field374 /= 2;
            }
            if (class106.field1696[98]) {
                field471 += (12 - field471) / 2;
            } else if (class106.field1696[99]) {
                field471 += (-12 - field471) / 2;
            } else {
                field471 /= 2;
            }
            field372 = class116.field1807;
            field371 = class116.field1806;
        }
        field368 = field374 / 2 + field368 & 0x7FF;
        field367 += field471 / 2;
        if (field367 < 128) {
            field367 = 128;
        }
        if (field367 > 383) {
            field367 = 383;
        }
        int var4 = Statics.field121 >> 7;
        int var5 = Statics.field80 >> 7;
        int var6 = method599(Statics.field121, Statics.field80, Statics.field533);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field533;
                    if (var10 < 3 && (class11.field93[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class11.field103[var10][var8][var9];
                    if (var11 > var7) {
                        var7 = var11;
                    }
                }
            }
        }
        int var12 = var7 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (var12 > field376) {
            field376 += (var12 - field376) / 24;
        } else if (var12 < field376) {
            field376 += (var12 - field376) / 80;
        }
    }

    @ObfuscatedName("al.ae(I)V")
    public static final void method878() {
        for (int var0 = 0; var0 < field322; var0++) {
            int var1 = field351[var0];
            class36 var2 = field534[var1];
            if (var2 != null) {
                method199(var2, var2.field762.field3043);
            }
        }
    }

    @ObfuscatedName("i.aq(Lax;II)V")
    public static final void method199(class28 arg0, int arg1) {
        if (arg0.field639 > field291) {
            method255(arg0);
        } else if (arg0.field647 >= field291) {
            if (field291 == arg0.field647 || arg0.field627 == -1 || arg0.field635 != 0 || arg0.field634 + 1 > class207.method3621(arg0.field627).field3092[arg0.field633]) {
                int var2 = arg0.field647 - arg0.field639;
                int var3 = field291 - arg0.field639;
                int var4 = arg0.field661 * 128 + arg0.field604 * 64;
                int var5 = arg0.field644 * 128 + arg0.field604 * 64;
                int var6 = arg0.field643 * 128 + arg0.field604 * 64;
                int var7 = arg0.field645 * 128 + arg0.field604 * 64;
                arg0.field629 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field601 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field658 = 0;
            arg0.field651 = arg0.field648;
            arg0.field602 = arg0.field651;
        } else {
            arg0.field625 = arg0.field605;
            if (arg0.field654 == 0) {
                arg0.field658 = 0;
            } else {
                label321: {
                    if (arg0.field627 != -1 && arg0.field635 == 0) {
                        class207 var8 = class207.method3621(arg0.field627);
                        if (arg0.field659 > 0 && var8.field3101 == 0) {
                            arg0.field658++;
                            break label321;
                        }
                        if (arg0.field659 <= 0 && var8.field3102 == 0) {
                            arg0.field658++;
                            break label321;
                        }
                    }
                    int var9 = arg0.field629;
                    int var10 = arg0.field601;
                    int var11 = arg0.field662[arg0.field654 - 1] * 128 + arg0.field604 * 64;
                    int var12 = arg0.field656[arg0.field654 - 1] * 128 + arg0.field604 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field651 = 1280;
                        } else if (var10 > var12) {
                            arg0.field651 = 1792;
                        } else {
                            arg0.field651 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field651 = 768;
                        } else if (var10 > var12) {
                            arg0.field651 = 256;
                        } else {
                            arg0.field651 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field651 = 1024;
                    } else if (var10 > var12) {
                        arg0.field651 = 0;
                    }
                    byte var13 = arg0.field619[arg0.field654 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field651 - arg0.field602 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field609;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field660;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field611;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field610;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field660;
                        }
                        arg0.field625 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class36) {
                            var17 = ((class36) arg0).field762.field3068;
                        }
                        if (var17) {
                            if (arg0.field651 != arg0.field602 && arg0.field626 == -1 && arg0.field653 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field654 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field654 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field658 > 0 && arg0.field654 > 1) {
                                var16 = 8;
                                arg0.field658--;
                            }
                        } else {
                            if (arg0.field654 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field654 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field658 > 0 && arg0.field654 > 1) {
                                var16 = 8;
                                arg0.field658--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field660 == arg0.field625 && arg0.field650 != -1) {
                            arg0.field625 = arg0.field650;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field629 += var16;
                                if (arg0.field629 > var11) {
                                    arg0.field629 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field629 -= var16;
                                if (arg0.field629 < var11) {
                                    arg0.field629 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field601 += var16;
                                if (arg0.field601 > var12) {
                                    arg0.field601 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field601 -= var16;
                                if (arg0.field601 < var12) {
                                    arg0.field601 = var12;
                                }
                            }
                        }
                        if (arg0.field629 == var11 && arg0.field601 == var12) {
                            arg0.field654--;
                            if (arg0.field659 > 0) {
                                arg0.field659--;
                            }
                        }
                    } else {
                        arg0.field629 = var11;
                        arg0.field601 = var12;
                        arg0.field654--;
                        if (arg0.field659 > 0) {
                            arg0.field659--;
                        }
                    }
                }
            }
        }
        if (arg0.field629 < 128 || arg0.field601 < 128 || arg0.field629 >= 13184 || arg0.field601 >= 13184) {
            arg0.field627 = -1;
            arg0.field637 = -1;
            arg0.field639 = 0;
            arg0.field647 = 0;
            arg0.field629 = arg0.field662[0] * 128 + arg0.field604 * 64;
            arg0.field601 = arg0.field656[0] * 128 + arg0.field604 * 64;
            arg0.method584();
        }
        if (Statics.field233 == arg0 && (arg0.field629 < 1536 || arg0.field601 < 1536 || arg0.field629 >= 11776 || arg0.field601 >= 11776)) {
            arg0.field627 = -1;
            arg0.field637 = -1;
            arg0.field639 = 0;
            arg0.field647 = 0;
            arg0.field629 = arg0.field662[0] * 128 + arg0.field604 * 64;
            arg0.field601 = arg0.field656[0] * 128 + arg0.field604 * 64;
            arg0.method584();
        }
        if (arg0.field653 != 0) {
            if (arg0.field626 != -1) {
                class28 var18 = null;
                if (arg0.field626 < 32768) {
                    var18 = field534[arg0.field626];
                } else if (arg0.field626 >= 32768) {
                    var18 = field404[arg0.field626 - 32768];
                }
                if (var18 != null) {
                    int var19 = arg0.field629 - var18.field629;
                    int var20 = arg0.field601 - var18.field601;
                    if (var19 != 0 || var20 != 0) {
                        arg0.field651 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field615) {
                    arg0.field626 = -1;
                    arg0.field615 = false;
                }
            }
            if (arg0.field628 != -1 && (arg0.field654 == 0 || arg0.field658 > 0)) {
                arg0.field651 = arg0.field628;
                arg0.field628 = -1;
            }
            int var21 = arg0.field651 - arg0.field602 & 0x7FF;
            if (var21 == 0 && arg0.field615) {
                arg0.field626 = -1;
                arg0.field615 = false;
            }
            if (var21 == 0) {
                arg0.field652 = 0;
            } else {
                arg0.field652++;
                if (var21 > 1024) {
                    arg0.field602 -= arg0.field653;
                    boolean var22 = true;
                    if (var21 < arg0.field653 || var21 > 2048 - arg0.field653) {
                        arg0.field602 = arg0.field651;
                        var22 = false;
                    }
                    if (arg0.field625 == arg0.field605 && (arg0.field652 > 25 || var22)) {
                        if (arg0.field606 == -1) {
                            arg0.field625 = arg0.field660;
                        } else {
                            arg0.field625 = arg0.field606;
                        }
                    }
                } else {
                    arg0.field602 += arg0.field653;
                    boolean var23 = true;
                    if (var21 < arg0.field653 || var21 > 2048 - arg0.field653) {
                        arg0.field602 = arg0.field651;
                        var23 = false;
                    }
                    if (arg0.field625 == arg0.field605 && (arg0.field652 > 25 || var23)) {
                        if (arg0.field607 == -1) {
                            arg0.field625 = arg0.field660;
                        } else {
                            arg0.field625 = arg0.field607;
                        }
                    }
                }
                arg0.field602 &= 0x7FF;
            }
        }
        method206(arg0);
    }

    @ObfuscatedName("m.av(Lax;I)V")
    public static final void method255(class28 arg0) {
        int var1 = arg0.field639 - field291;
        int var2 = arg0.field661 * 128 + arg0.field604 * 64;
        int var3 = arg0.field644 * 128 + arg0.field604 * 64;
        arg0.field629 += (var2 - arg0.field629) / var1;
        arg0.field601 += (var3 - arg0.field601) / var1;
        arg0.field658 = 0;
        arg0.field651 = arg0.field648;
    }

    @ObfuscatedName("h.aw(Lax;I)V")
    public static final void method206(class28 arg0) {
        arg0.field603 = false;
        if (arg0.field625 != -1) {
            class207 var1 = class207.method3621(arg0.field625);
            if (var1 == null || var1.field3093 == null) {
                arg0.field625 = -1;
            } else {
                arg0.field612++;
                if (arg0.field621 < var1.field3093.length && arg0.field612 > var1.field3092[arg0.field621]) {
                    arg0.field612 = 1;
                    arg0.field621++;
                    method640(var1, arg0.field621, arg0.field629, arg0.field601);
                }
                if (arg0.field621 >= var1.field3093.length) {
                    arg0.field612 = 0;
                    arg0.field621 = 0;
                    method640(var1, arg0.field621, arg0.field629, arg0.field601);
                }
            }
        }
        if (arg0.field637 != -1 && field291 >= arg0.field640) {
            if (arg0.field638 < 0) {
                arg0.field638 = 0;
            }
            int var2 = class193.method3249(arg0.field637).field2812;
            if (var2 == -1) {
                arg0.field637 = -1;
            } else {
                class207 var3 = class207.method3621(var2);
                if (var3 == null || var3.field3093 == null) {
                    arg0.field637 = -1;
                } else {
                    arg0.field632++;
                    if (arg0.field638 < var3.field3093.length && arg0.field632 > var3.field3092[arg0.field638]) {
                        arg0.field632 = 1;
                        arg0.field638++;
                        method640(var3, arg0.field638, arg0.field629, arg0.field601);
                    }
                    if (arg0.field638 >= var3.field3093.length && (arg0.field638 < 0 || arg0.field638 >= var3.field3093.length)) {
                        arg0.field637 = -1;
                    }
                }
            }
        }
        if (arg0.field627 != -1 && arg0.field635 <= 1) {
            class207 var4 = class207.method3621(arg0.field627);
            if (var4.field3101 == 1 && arg0.field659 > 0 && arg0.field639 <= field291 && arg0.field647 < field291) {
                arg0.field635 = 1;
                return;
            }
        }
        if (arg0.field627 != -1 && arg0.field635 == 0) {
            class207 var5 = class207.method3621(arg0.field627);
            if (var5 == null || var5.field3093 == null) {
                arg0.field627 = -1;
            } else {
                arg0.field634++;
                if (arg0.field633 < var5.field3093.length && arg0.field634 > var5.field3092[arg0.field633]) {
                    arg0.field634 = 1;
                    arg0.field633++;
                    method640(var5, arg0.field633, arg0.field629, arg0.field601);
                }
                if (arg0.field633 >= var5.field3093.length) {
                    arg0.field633 -= var5.field3094;
                    arg0.field636++;
                    if (arg0.field636 >= var5.field3100) {
                        arg0.field627 = -1;
                    } else if (arg0.field633 >= 0 && arg0.field633 < var5.field3093.length) {
                        method640(var5, arg0.field633, arg0.field629, arg0.field601);
                    } else {
                        arg0.field627 = -1;
                    }
                }
                arg0.field603 = var5.field3095;
            }
        }
        if (arg0.field635 > 0) {
            arg0.field635--;
        }
    }

    @ObfuscatedName("o.ag(Lo;III)V")
    public static void method251(class24 arg0, int arg1, int arg2) {
        if (arg0.field627 == arg1 && arg1 != -1) {
            int var3 = class207.method3621(arg1).field3103;
            if (var3 == 1) {
                arg0.field633 = 0;
                arg0.field634 = 0;
                arg0.field635 = arg2;
                arg0.field636 = 0;
            }
            if (var3 == 2) {
                arg0.field636 = 0;
            }
        } else if (arg1 == -1 || arg0.field627 == -1 || class207.method3621(arg1).field3097 >= class207.method3621(arg0.field627).field3097) {
            arg0.field627 = arg1;
            arg0.field633 = 0;
            arg0.field634 = 0;
            arg0.field635 = arg2;
            arg0.field636 = 0;
            arg0.field659 = arg0.field654;
        }
    }

    @ObfuscatedName("gu.af(II)V")
    public static void method3585(int arg0) {
        field297 = 0L;
        if (arg0 >= 2) {
            field500 = true;
        } else {
            field500 = false;
        }
        method2510();
        if (field289 >= 25) {
            method592();
        }
        field1778 = true;
    }

    @ObfuscatedName("ht.ar(I)V")
    public static void method3827() {
        class106.method170(Statics.field1090);
        Canvas var0 = Statics.field1090;
        var0.removeMouseListener(class116.field1809);
        var0.removeMouseMotionListener(class116.field1809);
        var0.removeFocusListener(class116.field1809);
        class116.field1802 = 0;
        if (Statics.field2829 != null) {
            Statics.field2829.method1929(Statics.field1090);
        }
        Statics.field280.method1985();
        Statics.field1090.setBackground(Color.black);
        class106.method215(Statics.field1090);
        Canvas var1 = Statics.field1090;
        var1.addMouseListener(class116.field1809);
        var1.addMouseMotionListener(class116.field1809);
        var1.addFocusListener(class116.field1809);
        if (Statics.field2829 != null) {
            Statics.field2829.method1924(Statics.field1090);
        }
        if (field446 != -1) {
            method189(false);
        }
        field1780 = true;
    }

    @ObfuscatedName("ax.ab(I)V")
    public static void method592() {
        field326.method2480(111);
        class136 var0 = field326;
        int var1 = field500 ? 2 : 1;
        var0.method2215(var1);
        field326.method2216(Statics.field2761);
        field326.method2216(Statics.field2727);
    }

    @ObfuscatedName("el.as(I)V")
    public static void method2510() {
        client var0 = Statics.field280;
        synchronized (Statics.field280) {
            Container var1 = Statics.field280.method1995();
            if (var1 != null) {
                Statics.field1286 = Math.max(var1.getSize().width, Statics.field1564);
                Statics.field222 = Math.max(var1.getSize().height, Statics.field211);
                if (Statics.field27 == var1) {
                    Insets var2 = Statics.field27.getInsets();
                    Statics.field1286 -= var2.right + var2.left;
                    Statics.field222 -= var2.top + var2.bottom;
                }
                if (Statics.field1286 <= 0) {
                    Statics.field1286 = 1;
                }
                if (Statics.field222 <= 0) {
                    Statics.field222 = 1;
                }
                int var3 = field500 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field2761 = field294 * 765;
                    Statics.field2727 = field323 * 503;
                } else {
                    Statics.field2761 = Math.min(Statics.field1286, 7680);
                    Statics.field2727 = Math.min(Statics.field222, 2160);
                }
                field1767 = (Statics.field1286 - Statics.field2761) / 2;
                field1784 = 0;
                Statics.field1090.setSize(Statics.field2761, Statics.field2727);
                Statics.field1527 = class225.method3592(Statics.field2761, Statics.field2727, Statics.field1090);
                if (Statics.field27 == var1) {
                    Insets var4 = Statics.field27.getInsets();
                    Statics.field1090.setLocation(field1767 + var4.left, field1784 + var4.top);
                } else {
                    Statics.field1090.setLocation(field1767, field1784);
                }
                method3385();
                if (field446 != -1) {
                    method189(true);
                }
                method1974();
            }
        }
    }

    @ObfuscatedName("gq.ai(I)V")
    public static void method3385() {
        int var0 = Statics.field2761;
        int var1 = Statics.field2727;
        if (Statics.field1286 < var0) {
            int var2 = Statics.field1286;
        }
        if (Statics.field222 < var1) {
            int var3 = Statics.field222;
        }
        if (Statics.field657 == null) {
            return;
        }
        try {
            client var4 = Statics.field280;
            int var5 = field500 ? 2 : 1;
            Object[] var6 = new Object[] { var5 };
            JSObject.getWindow(var4).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("dx.ad(I)V")
    public static void method1974() {
        int var0 = field1767;
        int var1 = field1784;
        int var2 = Statics.field1286 - Statics.field2761 - var0;
        int var3 = Statics.field222 - Statics.field2727 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field280.method1995();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field27 == var4) {
                Insets var7 = Statics.field27.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field222);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1286, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1286 + var5 - var2, var6, var2, Statics.field222);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field222 + var6 - var3, Statics.field1286, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("u.an(S)V")
    public static final void method89() {
        if (field446 != -1) {
            int var0 = field446;
            if (class172.method1982(var0)) {
                method1630(Statics.field1985[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field491; var1++) {
            if (field369[var1]) {
                field492[var1] = true;
            }
            field453[var1] = field369[var1];
            field369[var1] = false;
        }
        field386 = field291;
        field434 = -1;
        field547 = -1;
        Statics.field84 = null;
        if (field446 != -1) {
            field491 = 0;
            method3787(field446, 0, 0, Statics.field2761, Statics.field2727, 0, 0, -1);
        }
        class224.method3859();
        if (field423) {
            int var2 = Statics.field262;
            int var3 = Statics.field18;
            int var4 = Statics.field229;
            int var5 = Statics.field2915;
            int var6 = 6116423;
            class224.method3866(var2, var3, var4, var5, var6);
            class224.method3866(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class224.method3872(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field1193.method3701(class176.field2509, var2 + 3, var3 + 14, var6, -1);
            int var7 = class116.field1806;
            int var8 = class116.field1807;
            for (int var9 = 0; var9 < field424; var9++) {
                int var10 = (field424 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field1193.method3701(method180(var9), var2 + 3, var10, var11, 0);
            }
            int var12 = Statics.field262;
            int var13 = Statics.field18;
            int var14 = Statics.field229;
            int var15 = Statics.field2915;
            for (int var16 = 0; var16 < field491; var16++) {
                if (field544[var16] + field362[var16] > var12 && field362[var16] < var12 + var14 && field569[var16] + field495[var16] > var13 && field495[var16] < var13 + var15) {
                    field492[var16] = true;
                }
            }
        } else if (field434 != -1) {
            method1819(field434, field547);
        }
        if (field383 == 3) {
            for (int var17 = 0; var17 < field491; var17++) {
                if (field453[var17]) {
                    class224.method3878(field362[var17], field495[var17], field544[var17], field569[var17], 16711935, 128);
                } else if (field492[var17]) {
                    class224.method3878(field362[var17], field495[var17], field544[var17], field569[var17], 16711680, 128);
                }
            }
        }
        class32.method3054(Statics.field533, Statics.field233.field629, Statics.field233.field601, field359);
        field359 = 0;
    }

    @ObfuscatedName("aw.al(Ljava/lang/String;ZB)V")
    public static final void method756(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1543.method3744(arg0, 250);
        int var6 = Statics.field1543.method3699(arg0, 250) * 13;
        class224.method3866(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class224.method3872(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1543.method3692(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method76(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1090.getGraphics();
                Statics.field1527.method3848(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1090.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field491; var13++) {
            if (field544[var13] + field362[var13] > var9 && field362[var13] < var9 + var11 && field569[var13] + field495[var13] > var10 && field495[var13] < var10 + var12) {
                field492[var13] = true;
            }
        }
    }

    @ObfuscatedName("dt.at(IIIII)V")
    public static final void method1914(int arg0, int arg1, int arg2, int arg3) {
        field310++;
        method3081(class16.field169);
        boolean var4 = false;
        if (field473 >= 0) {
            int var5 = class46.field892;
            int[] var6 = class46.field895;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field473 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method3081(class16.field166);
        }
        method1944(true);
        method3081(var4 ? class16.field168 : class16.field167);
        method1944(false);
        for (class43 var8 = (class43) field417.method2666(); var8 != null; var8 = (class43) field417.method2668()) {
            if (Statics.field533 != var8.field849 || field291 > var8.field855) {
                var8.method2652();
            } else if (field291 >= var8.field856) {
                if (var8.field858 > 0) {
                    class36 var9 = field534[var8.field858 - 1];
                    if (var9 != null && var9.field629 >= 0 && var9.field629 < 13312 && var9.field601 >= 0 && var9.field601 < 13312) {
                        var8.method800(var9.field629, var9.field601, method599(var9.field629, var9.field601, var8.field849) - var8.field853, field291);
                    }
                }
                if (var8.field858 < 0) {
                    int var10 = -var8.field858 - 1;
                    class24 var11;
                    if (field414 == var10) {
                        var11 = Statics.field233;
                    } else {
                        var11 = field404[var10];
                    }
                    if (var11 != null && var11.field629 >= 0 && var11.field629 < 13312 && var11.field601 >= 0 && var11.field601 < 13312) {
                        var8.method800(var11.field629, var11.field601, method599(var11.field629, var11.field601, var8.field849) - var8.field853, field291);
                    }
                }
                var8.method796(field359);
                Statics.field2347.method1647(Statics.field533, (int) var8.field865, (int) var8.field851, (int) var8.field854, 60, var8, var8.field868, -1, false);
            }
        }
        method110();
        method3057(arg0, arg1, arg2, arg3, true);
        int var12 = field549;
        int var13 = field550;
        int var14 = field522;
        int var15 = field515;
        class224.method3860(var12, var13, var12 + var14, var13 + var15);
        class85.method1564();
        if (!field535) {
            int var16 = field367;
            if (field376 / 256 > var16) {
                var16 = field376 / 256;
            }
            if (field536[4] && field402[4] + 128 > var16) {
                var16 = field402[4] + 128;
            }
            int var17 = field426 + field368 & 0x7FF;
            int var18 = Statics.field121;
            int var19 = method599(Statics.field233.field629, Statics.field233.field601, Statics.field533) - field373;
            int var20 = Statics.field80;
            int var21 = var16 * 3 + 600;
            int var22 = 2048 - var16 & 0x7FF;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 0;
            int var25 = 0;
            int var26 = var21;
            if (var22 != 0) {
                int var27 = class85.field1434[var22];
                int var28 = class85.field1442[var22];
                int var29 = var25 * var28 - var21 * var27 >> 16;
                var26 = var25 * var27 + var21 * var28 >> 16;
                var25 = var29;
            }
            if (var23 != 0) {
                int var30 = class85.field1434[var23];
                int var31 = class85.field1442[var23];
                int var32 = var24 * var31 + var26 * var30 >> 16;
                var26 = var26 * var31 - var24 * var30 >> 16;
                var24 = var32;
            }
            Statics.field234 = var18 - var24;
            Statics.field17 = var19 - var25;
            Statics.field142 = var20 - var26;
            Statics.field1733 = var16;
            Statics.field147 = var17;
        }
        int var45;
        if (field535) {
            int var46;
            if (Statics.field657.field691) {
                var46 = Statics.field533;
            } else {
                int var47 = method599(Statics.field234, Statics.field142, Statics.field533);
                if (var47 - Statics.field17 >= 800 || (class11.field93[Statics.field533][Statics.field234 >> 7][Statics.field142 >> 7] & 0x4) == 0) {
                    var46 = 3;
                } else {
                    var46 = Statics.field533;
                }
            }
            var45 = var46;
        } else {
            int var33;
            if (Statics.field657.field691) {
                var33 = Statics.field533;
            } else {
                label329: {
                    int var34 = 3;
                    if (Statics.field1733 < 310) {
                        int var35 = Statics.field234 >> 7;
                        int var36 = Statics.field142 >> 7;
                        int var37 = Statics.field233.field629 >> 7;
                        int var38 = Statics.field233.field601 >> 7;
                        if (var35 < 0 || var36 < 0 || var35 >= 104 || var36 >= 104) {
                            var33 = Statics.field533;
                            break label329;
                        }
                        if ((class11.field93[Statics.field533][var35][var36] & 0x4) != 0) {
                            var34 = Statics.field533;
                        }
                        int var39;
                        if (var37 > var35) {
                            var39 = var37 - var35;
                        } else {
                            var39 = var35 - var37;
                        }
                        int var40;
                        if (var38 > var36) {
                            var40 = var38 - var36;
                        } else {
                            var40 = var36 - var38;
                        }
                        if (var39 > var40) {
                            int var41 = var40 * 65536 / var39;
                            int var42 = 32768;
                            while (var35 != var37) {
                                if (var35 < var37) {
                                    var35++;
                                } else if (var35 > var37) {
                                    var35--;
                                }
                                if ((class11.field93[Statics.field533][var35][var36] & 0x4) != 0) {
                                    var34 = Statics.field533;
                                }
                                var42 += var41;
                                if (var42 >= 65536) {
                                    var42 -= 65536;
                                    if (var36 < var38) {
                                        var36++;
                                    } else if (var36 > var38) {
                                        var36--;
                                    }
                                    if ((class11.field93[Statics.field533][var35][var36] & 0x4) != 0) {
                                        var34 = Statics.field533;
                                    }
                                }
                            }
                        } else {
                            int var43 = var39 * 65536 / var40;
                            int var44 = 32768;
                            while (var36 != var38) {
                                if (var36 < var38) {
                                    var36++;
                                } else if (var36 > var38) {
                                    var36--;
                                }
                                if ((class11.field93[Statics.field533][var35][var36] & 0x4) != 0) {
                                    var34 = Statics.field533;
                                }
                                var44 += var43;
                                if (var44 >= 65536) {
                                    var44 -= 65536;
                                    if (var35 < var37) {
                                        var35++;
                                    } else if (var35 > var37) {
                                        var35--;
                                    }
                                    if ((class11.field93[Statics.field533][var35][var36] & 0x4) != 0) {
                                        var34 = Statics.field533;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field233.field629 >= 0 && Statics.field233.field601 >= 0 && Statics.field233.field629 < 13312 && Statics.field233.field601 < 13312) {
                        if ((class11.field93[Statics.field533][Statics.field233.field629 >> 7][Statics.field233.field601 >> 7] & 0x4) != 0) {
                            var34 = Statics.field533;
                        }
                        var33 = var34;
                    } else {
                        var33 = Statics.field533;
                    }
                }
            }
            var45 = var33;
        }
        int var48 = Statics.field234;
        int var49 = Statics.field17;
        int var50 = Statics.field142;
        int var51 = Statics.field1733;
        int var52 = Statics.field147;
        for (int var53 = 0; var53 < 5; var53++) {
            if (field536[var53]) {
                int var54 = (int) (Math.random() * (double) (field537[var53] * 2 + 1) - (double) field537[var53] + Math.sin((double) field546[var53] / 100.0D * (double) field540[var53]) * (double) field402[var53]);
                if (var53 == 0) {
                    Statics.field234 += var54;
                }
                if (var53 == 1) {
                    Statics.field17 += var54;
                }
                if (var53 == 2) {
                    Statics.field142 += var54;
                }
                if (var53 == 3) {
                    Statics.field147 = Statics.field147 + var54 & 0x7FF;
                }
                if (var53 == 4) {
                    Statics.field1733 += var54;
                    if (Statics.field1733 < 128) {
                        Statics.field1733 = 128;
                    }
                    if (Statics.field1733 > 383) {
                        Statics.field1733 = 383;
                    }
                }
            }
        }
        int var55 = class116.field1806;
        int var56 = class116.field1807;
        if (class116.field1812 != 0) {
            var55 = class116.field1803;
            var56 = class116.field1814;
        }
        if (var55 >= var12 && var55 < var12 + var14 && var56 >= var13 && var56 < var13 + var15) {
            class83.field1400 = true;
            class83.field1403 = 0;
            class83.field1355 = var55 - var12;
            class83.field1402 = var56 - var13;
        } else {
            class83.field1400 = false;
            class83.field1403 = 0;
        }
        method2051();
        class224.method3866(var12, var13, var14, var15, 0);
        method2051();
        int var57 = class85.field1427;
        class85.field1427 = field553;
        Statics.field2347.method1699(Statics.field234, Statics.field17, Statics.field142, Statics.field1733, Statics.field147, var45);
        class85.field1427 = var57;
        method2051();
        Statics.field2347.method1650();
        method257(var12, var13, var14, var15);
        method648(var12, var13);
        ((class75) Statics.field1438).method1368(field359);
        method3250(var12, var13, var14, var15);
        Statics.field234 = var48;
        Statics.field17 = var49;
        Statics.field142 = var50;
        Statics.field1733 = var51;
        Statics.field147 = var52;
        if (field290) {
            byte var58 = 0;
            int var59 = class188.field2769 + class188.field2756 + var58;
            if (var59 == 0) {
                field290 = false;
            }
        }
        if (field290) {
            class224.method3866(var12, var13, var14, var15, 0);
            method756(class176.field2385, false);
        }
    }

    @ObfuscatedName("fn.ah(IIIIZB)V")
    public static final void method3057(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field542 - field501) * var5 / 100 + field501;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field321) {
            short var8 = field321;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field460) {
                var6 = field460;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class224.method3859();
                    class224.method3866(arg0, arg1, var10, arg3, -16777216);
                    class224.method3866(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field548) {
            short var11 = field548;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field510) {
                var6 = field510;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class224.method3859();
                    class224.method3866(arg0, arg1, arg2, var13, -16777216);
                    class224.method3866(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field319 - field543) * var5 / 100 + field543;
        field553 = arg3 * var6 * var14 / 85504 << 1;
        if (field522 != arg2 || field515 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1434[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1671(var15, 500, 800, arg2, arg3);
        }
        field549 = arg0;
        field550 = arg1;
        field522 = arg2;
        field515 = arg3;
    }

    @ObfuscatedName("fw.ap(Le;I)V")
    public static final void method3081(class16 arg0) {
        if (Statics.field233.field629 >> 7 == field521 && Statics.field233.field601 >> 7 == field335) {
            field521 = 0;
        }
        int var1 = class46.field892;
        int[] var2 = class46.field895;
        int var3 = var1;
        if (class16.field169 == arg0 || class16.field166 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field169 == arg0) {
                var5 = Statics.field233;
                var6 = Statics.field233.field258 << 14;
            } else if (class16.field166 == arg0) {
                var5 = field404[field473];
                var6 = field473 << 14;
            } else {
                var5 = field404[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field168 == arg0 && field473 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method233() && !var5.field264) {
                var5.field254 = false;
                if ((field286 && var1 > 50 || var1 > 200) && class16.field169 != arg0 && var5.field625 == var5.field605) {
                    var5.field254 = true;
                }
                int var7 = var5.field629 >> 7;
                int var8 = var5.field601 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field249 == null || field291 < var5.field260 || field291 >= var5.field259) {
                        if ((var5.field629 & 0x7F) == 64 && (var5.field601 & 0x7F) == 64) {
                            if (field310 == field498[var7][var8]) {
                                continue;
                            }
                            field498[var7][var8] = field310;
                        }
                        var5.field263 = method599(var5.field629, var5.field601, Statics.field533);
                        Statics.field2347.method1647(Statics.field533, var5.field629, var5.field601, var5.field263, 60, var5, var5.field602, var6, var5.field603);
                    } else {
                        var5.field254 = false;
                        var5.field263 = method599(var5.field629, var5.field601, Statics.field533);
                        Statics.field2347.method1663(Statics.field533, var5.field629, var5.field601, var5.field263, 60, var5, var5.field602, var6, var5.field250, var5.field253, var5.field252, var5.field255);
                    }
                }
            }
        }
    }

    @ObfuscatedName("do.au(ZI)V")
    public static final void method1944(boolean arg0) {
        for (int var1 = 0; var1 < field322; var1++) {
            class36 var2 = field534[field351[var1]];
            int var3 = (field351[var1] << 14) + 536870912;
            if (var2 != null && var2.method233() && var2.field762.field3065 == arg0 && var2.field762.method3589()) {
                int var4 = var2.field629 >> 7;
                int var5 = var2.field601 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field604 == 1 && (var2.field629 & 0x7F) == 64 && (var2.field601 & 0x7F) == 64) {
                        if (field310 == field498[var4][var5]) {
                            continue;
                        }
                        field498[var4][var5] = field310;
                    }
                    if (!var2.field762.field3062) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2347.method1647(Statics.field533, var2.field629, var2.field601, method599(var2.field629 + (var2.field604 * 64 - 64), var2.field601 + (var2.field604 * 64 - 64), Statics.field533), var2.field604 * 64 - 64 + 60, var2, var2.field602, var3, var2.field603);
                }
            }
        }
    }

    @ObfuscatedName("v.bu(I)V")
    public static final void method110() {
        for (class34 var0 = (class34) field532.method2666(); var0 != null; var0 = (class34) field532.method2668()) {
            if (Statics.field533 != var0.field736 || var0.field741) {
                var0.method2652();
            } else if (field291 >= var0.field735) {
                var0.method714(field359);
                if (var0.field741) {
                    var0.method2652();
                } else {
                    Statics.field2347.method1647(var0.field736, var0.field737, var0.field743, var0.field738, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ao.br(III)V")
    public static final void method648(int arg0, int arg1) {
        if (field299 == 2) {
            method600((field302 - Statics.field1726 << 7) + field305, (field303 - Statics.field1776 << 7) + field306, field304 * 2);
            if (field389 > -1 && field291 % 20 < 10) {
                Statics.field1727[0].method3981(field389 + arg0 - 12, field390 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("l.bk(Lax;IIIIIB)V")
    public static final void method106(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method233()) {
            return;
        }
        if (arg0 instanceof class36) {
            class205 var6 = ((class36) arg0).field762;
            if (var6.field3040 != null) {
                var6 = var6.method3591();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field892;
        int[] var8 = class46.field895;
        int var9 = 3;
        if (!arg0.field600.method2631()) {
            method1831(arg0, arg0.field608 + 15);
            for (class35 var10 = (class35) arg0.field600.method2628(); var10 != null; var10 = (class35) arg0.field600.method2629()) {
                class29 var11 = var10.method717(field291);
                if (var11 != null) {
                    class196 var12 = var10.field750;
                    class229 var13 = var12.method3339();
                    class229 var14 = var12.method3329();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2859;
                    } else {
                        if (var12.field2860 * 2 < var14.field3239) {
                            var15 = var12.field2860;
                        }
                        var16 = var14.field3239 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field291 - var11.field667;
                    int var20 = var11.field665 * var16 / var12.field2859;
                    int var23;
                    if (var11.field666 > var19) {
                        int var21 = var12.field2855 == 0 ? 0 : var19 / var12.field2855 * var12.field2855;
                        int var22 = var11.field669 * var16 / var12.field2859;
                        var23 = (var20 - var22) * var21 / var11.field666 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field666 + var12.field2851 - var19;
                        if (var12.field2850 >= 0) {
                            var17 = (var24 << 8) / (var12.field2851 - var12.field2850);
                        }
                    }
                    if (var11.field665 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field389 + arg2 - (var16 >> 1);
                    int var26 = field390 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field389 > -1) {
                            class224.method3866(var25, var26, var23, 5, 65280);
                            class224.method3866(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3242;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3987(var27, var26, var17);
                            class224.method3861(var27, var26, var27 + var28, var26 + var29);
                            var14.method3987(var27, var26, var17);
                        } else {
                            var13.method3981(var27, var26);
                            class224.method3861(var27, var26, var27 + var28, var26 + var29);
                            var14.method3981(var27, var26);
                        }
                        class224.method3860(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method715()) {
                    var10.method2652();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field264) {
                return;
            }
            if (var30.field238 != -1 || var30.field239 != -1) {
                method1831(arg0, arg0.field608 + 15);
                if (field389 > -1) {
                    if (var30.field238 != -1) {
                        Statics.field939[var30.field238].method3981(field389 + arg2 - 12, field390 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field239 != -1) {
                        Statics.field1415[var30.field239].method3981(field389 + arg2 - 12, field390 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field299 == 10 && field301 == var8[arg1]) {
                method1831(arg0, arg0.field608 + 15);
                if (field389 > -1) {
                    Statics.field1727[1].method3981(field389 + arg2 - 12, field390 + arg3 - var9);
                }
            }
        } else {
            class205 var31 = ((class36) arg0).field762;
            if (var31.field3040 != null) {
                var31 = var31.method3591();
            }
            if (var31.field3046 >= 0 && var31.field3046 < Statics.field1415.length) {
                method1831(arg0, arg0.field608 + 15);
                if (field389 > -1) {
                    Statics.field1415[var31.field3046].method3981(field389 + arg2 - 12, field390 + arg3 - 30);
                }
            }
            if (field299 == 1 && field300 == field351[arg1 - var7] && field291 % 20 < 10) {
                method1831(arg0, arg0.field608 + 15);
                if (field389 > -1) {
                    Statics.field1727[0].method3981(field389 + arg2 - 12, field390 + arg3 - 28);
                }
            }
        }
        if (arg0.field613 != null && (arg1 >= var7 || !arg0.field655 && (field324 == 4 || !arg0.field614 && (field324 == 0 || field324 == 3 || field324 == 1 && method200(((class24) arg0).field266, false))))) {
            method1831(arg0, arg0.field608);
            if (field389 > -1 && field429 < field378) {
                field382[field429] = Statics.field1193.method3691(arg0.field613) / 2;
                field474[field429] = Statics.field1193.field3112;
                field379[field429] = field389;
                field380[field429] = field390;
                field508[field429] = arg0.field617;
                field504[field429] = arg0.field618;
                field385[field429] = arg0.field616;
                field336[field429] = arg0.field613;
                field429++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field622[var32];
            int var34 = arg0.field631[var32];
            class202 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field291) {
                    continue;
                }
                var35 = class202.method3173(arg0.field631[var32]);
                var36 = var35.field2907;
                if (var35 != null && var35.field2918 != null) {
                    var35 = var35.method3460();
                    if (var35 == null) {
                        arg0.field622[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field646[var32];
            class202 var38 = null;
            if (var37 >= 0) {
                var38 = class202.method3173(var37);
                if (var38 != null && var38.field2918 != null) {
                    var38 = var38.method3460();
                }
            }
            if (var33 - var36 <= field291) {
                if (var35 == null) {
                    arg0.field622[var32] = -1;
                } else {
                    method1831(arg0, arg0.field608 / 2);
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
                        class229 var51 = null;
                        class229 var52 = null;
                        class229 var53 = null;
                        class229 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class229 var64 = var35.method3459();
                        if (var64 != null) {
                            var43 = var64.field3239;
                            int var65 = var64.field3242;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3241;
                        }
                        class229 var66 = var35.method3434();
                        if (var66 != null) {
                            var44 = var66.field3239;
                            int var67 = var66.field3242;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3241;
                        }
                        class229 var68 = var35.method3455();
                        if (var68 != null) {
                            var45 = var68.field3239;
                            int var69 = var68.field3242;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3241;
                        }
                        class229 var70 = var35.method3444();
                        if (var70 != null) {
                            var46 = var70.field3239;
                            int var71 = var70.field3242;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3241;
                        }
                        if (var38 != null) {
                            var51 = var38.method3459();
                            if (var51 != null) {
                                var55 = var51.field3239;
                                int var72 = var51.field3242;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3241;
                            }
                            var52 = var38.method3434();
                            if (var52 != null) {
                                var56 = var52.field3239;
                                int var73 = var52.field3242;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3241;
                            }
                            var53 = var38.method3455();
                            if (var53 != null) {
                                var57 = var53.field3239;
                                int var74 = var53.field3242;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3241;
                            }
                            var54 = var38.method3444();
                            if (var54 != null) {
                                var58 = var54.field3239;
                                int var75 = var54.field3242;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3241;
                            }
                        }
                        class208 var76 = var35.method3437();
                        if (var76 == null) {
                            var76 = Statics.field767;
                        }
                        class208 var77;
                        if (var38 == null) {
                            var77 = Statics.field767;
                        } else {
                            var77 = var38.method3437();
                            if (var77 == null) {
                                var77 = Statics.field767;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3440(arg0.field630[var32]);
                        int var83 = var76.method3691(var82);
                        if (var38 != null) {
                            var79 = var38.method3440(arg0.field624[var32]);
                            var81 = var77.method3691(var79);
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
                        int var100 = arg0.field622[var32] - field291;
                        int var101 = var35.field2912 - var35.field2912 * var100 / var35.field2907;
                        int var102 = var35.field2913 * var100 / var35.field2907 + -var35.field2913;
                        int var103 = field389 + arg2 - (var92 >> 1) + var101;
                        int var104 = field390 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2900 + var104 + 15;
                        int var108 = var107 - var76.field3123;
                        int var109 = var76.field3114 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2900 + var104 + 15;
                            int var111 = var110 - var77.field3123;
                            int var112 = var77.field3114 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2914 >= 0) {
                            var115 = (var100 << 8) / (var35.field2907 - var35.field2914);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3987(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3987(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3987(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3987(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3702(var82, var90 + var103, var107, var35.field2906, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3987(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3987(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3987(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3987(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3702(var79, var98 + var103, var110, var38.field2906, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3981(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3981(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3981(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3981(var93 + var103 - var50, var104);
                            }
                            var76.method3701(var82, var90 + var103, var107, var35.field2906 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3981(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3981(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3981(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3981(var97 + var103 - var62, var104);
                                }
                                var77.method3701(var79, var98 + var103, var110, var38.field2906 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.bo(IIIII)V")
    public static final void method257(int arg0, int arg1, int arg2, int arg3) {
        field429 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class46.field892;
        int[] var7 = class46.field895;
        for (int var8 = 0; var8 < field322 + var6; var8++) {
            class28 var9;
            if (var8 < var6) {
                var9 = field404[var7[var8]];
                if (field473 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field534[field351[var8 - var6]];
            }
            method106(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method106(field404[field473], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field429; var10++) {
            int var11 = field379[var10];
            int var12 = field380[var10];
            int var13 = field382[var10];
            int var14 = field474[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field380[var16] - field474[var16] && var12 - var14 < field380[var16] + 2 && var11 - var13 < field382[var16] + field379[var16] && var11 + var13 > field379[var16] - field382[var16] && field380[var16] - field474[var16] < var12) {
                        var12 = field380[var16] - field474[var16];
                        var15 = true;
                    }
                }
            }
            field389 = field379[var10];
            field390 = field380[var10] = var12;
            String var17 = field336[var10];
            if (field448 == 0) {
                int var18 = 16776960;
                if (field508[var10] < 6) {
                    var18 = field503[field508[var10]];
                }
                if (field508[var10] == 6) {
                    var18 = field310 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field508[var10] == 7) {
                    var18 = field310 % 20 < 10 ? 255 : 65535;
                }
                if (field508[var10] == 8) {
                    var18 = field310 % 20 < 10 ? 45056 : 8454016;
                }
                if (field508[var10] == 9) {
                    int var19 = 150 - field385[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field508[var10] == 10) {
                    int var20 = 150 - field385[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field508[var10] == 11) {
                    int var21 = 150 - field385[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field504[var10] == 0) {
                    Statics.field1193.method3724(var17, field389 + arg0, field390 + arg1, var18, 0);
                }
                if (field504[var10] == 1) {
                    Statics.field1193.method3706(var17, field389 + arg0, field390 + arg1, var18, 0, field310);
                }
                if (field504[var10] == 2) {
                    Statics.field1193.method3707(var17, field389 + arg0, field390 + arg1, var18, 0, field310);
                }
                if (field504[var10] == 3) {
                    Statics.field1193.method3708(var17, field389 + arg0, field390 + arg1, var18, 0, field310, 150 - field385[var10]);
                }
                if (field504[var10] == 4) {
                    int var22 = (150 - field385[var10]) * (Statics.field1193.method3691(var17) + 100) / 150;
                    class224.method3861(field389 + arg0 - 50, arg1, field389 + arg0 + 50, arg1 + arg3);
                    Statics.field1193.method3701(var17, field389 + arg0 + 50 - var22, field390 + arg1, var18, 0);
                    class224.method3860(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field504[var10] == 5) {
                    int var23 = 150 - field385[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class224.method3861(arg0, field390 + arg1 - Statics.field1193.field3112 - 1, arg0 + arg2, field390 + arg1 + 5);
                    Statics.field1193.method3724(var17, field389 + arg0, field390 + arg1 + var24, var18, 0);
                    class224.method3860(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1193.method3724(var17, field389 + arg0, field390 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("gl.bw(IIIII)V")
    public static final void method3250(int arg0, int arg1, int arg2, int arg3) {
        if (field394 == 1) {
            Statics.field2182[field334 / 100].method3981(field551 - 8, field392 - 8);
        }
        if (field394 == 2) {
            Statics.field2182[field334 / 100 + 4].method3981(field551 - 8, field392 - 8);
        }
        field403 = 0;
        int var4 = (Statics.field233.field629 >> 7) + Statics.field1726;
        int var5 = (Statics.field233.field601 >> 7) + Statics.field1776;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field403 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field403 = 1;
        }
        if (field403 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field403 = 0;
        }
    }

    @ObfuscatedName("cp.bi(Lax;II)V")
    public static final void method1831(class28 arg0, int arg1) {
        method600(arg0.field629, arg0.field601, arg1);
    }

    @ObfuscatedName("ac.bl(IIII)V")
    public static final void method600(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field389 = -1;
            field390 = -1;
            return;
        }
        int var3 = method599(arg0, arg1, Statics.field533) - arg2;
        int var4 = arg0 - Statics.field234;
        int var5 = var3 - Statics.field17;
        int var6 = arg1 - Statics.field142;
        int var7 = class85.field1434[Statics.field1733];
        int var8 = class85.field1442[Statics.field1733];
        int var9 = class85.field1434[Statics.field147];
        int var10 = class85.field1442[Statics.field147];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field389 = field553 * var11 / var15 + field522 / 2;
            field390 = field553 * var14 / var15 + field515 / 2;
        } else {
            field389 = -1;
            field390 = -1;
        }
    }

    @ObfuscatedName("ac.by(IIII)I")
    public static final int method599(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field93[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field103[var5][var3][var4] + class11.field103[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field103[var5][var3][var4 + 1] + class11.field103[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("v.bv(ZI)V")
    public static final void method109(boolean arg0) {
        field344 = arg0;
        if (!field344) {
            int var1 = field328.method2266();
            int var2 = field328.method2266();
            int var3 = field328.method2232();
            Statics.field1852 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1852[var4][var5] = field328.method2246();
                }
            }
            Statics.field2154 = new int[var3];
            Statics.field273 = new int[var3];
            Statics.field642 = new int[var3];
            Statics.field3157 = new byte[var3][];
            Statics.field1760 = new byte[var3][];
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
                        Statics.field2154[var7] = var10;
                        Statics.field273[var7] = Statics.field1174.method3088("m" + var8 + "_" + var9);
                        Statics.field642[var7] = Statics.field1174.method3088("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2460(var1, var2, true);
            return;
        }
        int var11 = field328.method2266();
        boolean var12 = field328.method2257() == 1;
        int var13 = field328.method2267();
        int var14 = field328.method2232();
        field328.method2482();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field328.method2483(1);
                    if (var18 == 1) {
                        field345[var15][var16][var17] = field328.method2483(26);
                    } else {
                        field345[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field328.method2485();
        Statics.field1852 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1852[var19][var20] = field328.method2246();
            }
        }
        Statics.field2154 = new int[var14];
        Statics.field273 = new int[var14];
        Statics.field642 = new int[var14];
        Statics.field3157 = new byte[var14][];
        Statics.field1760 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field345[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field2154[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field2154[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field273[var21] = Statics.field1174.method3088("m" + var30 + "_" + var31);
                            Statics.field642[var21] = Statics.field1174.method3088("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method2460(var11, var13, !var12);
    }

    @ObfuscatedName("en.bf(IIZI)V")
    public static final void method2460(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field620 == arg0 && Statics.field2681 == arg1) {
            return;
        }
        Statics.field620 = arg0;
        Statics.field2681 = arg1;
        method112(25);
        method756(class176.field2385, true);
        int var3 = Statics.field1726;
        int var4 = Statics.field1776;
        Statics.field1726 = (arg0 - 6) * 8;
        Statics.field1776 = (arg1 - 6) * 8;
        int var5 = Statics.field1726 - var3;
        int var6 = Statics.field1776 - var4;
        int var7 = Statics.field1726;
        int var8 = Statics.field1776;
        for (int var9 = 0; var9 < 32768; var9++) {
            class36 var10 = field534[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field662[var11] -= var5;
                    var10.field656[var11] -= var6;
                }
                var10.field629 -= var5 * 128;
                var10.field601 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class24 var13 = field404[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field662[var14] -= var5;
                    var13.field656[var14] -= var6;
                }
                var13.field629 -= var5 * 128;
                var13.field601 -= var6 * 128;
            }
        }
        byte var15 = 0;
        byte var16 = 104;
        byte var17 = 1;
        if (var5 < 0) {
            var15 = 103;
            var16 = -1;
            var17 = -1;
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var6 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        for (int var21 = var15; var21 != var16; var21 += var17) {
            for (int var22 = var18; var22 != var19; var22 += var20) {
                int var23 = var5 + var21;
                int var24 = var6 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        field415[var25][var21][var22] = field415[var25][var23][var24];
                    } else {
                        field415[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class26 var26 = (class26) field416.method2666(); var26 != null; var26 = (class26) field416.method2668()) {
            var26.field574 -= var5;
            var26.field575 -= var6;
            if (var26.field574 < 0 || var26.field575 < 0 || var26.field574 >= 104 || var26.field575 >= 104) {
                var26.method2652();
            }
        }
        if (field521 != 0) {
            field521 -= var5;
            field335 -= var6;
        }
        field529 = 0;
        field535 = false;
        field516 = -1;
        field532.method2661();
        field417.method2661();
        for (int var27 = 0; var27 < 4; var27++) {
            field343[var27].method2100();
        }
    }

    @ObfuscatedName("dw.be(ZB)V")
    public static final void method2061(boolean arg0) {
        method2051();
        field332++;
        if (field332 < 50 && !arg0) {
            return;
        }
        field332 = 0;
        if (field337 || Statics.field161 == null) {
            return;
        }
        field326.method2480(102);
        try {
            Statics.field161.method1953(field326.field1955, 0, field326.field1956);
            field326.field1956 = 0;
        } catch (IOException var2) {
            field337 = true;
        }
    }

    @ObfuscatedName("fm.bx(IIIIII)V")
    public static final void method3063(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2347.method1662(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2347.method1666(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2001.field3238;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class203 var13 = class203.method579(var12);
            if (var13.field2954 == -1) {
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
                class227 var14 = Statics.field1285[var13.field2954];
                if (var14 != null) {
                    int var15 = (var13.field2964 * 4 - var14.field3233) / 2;
                    int var16 = (var13.field2941 * 4 - var14.field3230) / 2;
                    var14.method3932(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2941) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2347.method1733(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2347.method1666(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class203 var22 = class203.method579(var21);
            if (var22.field2954 != -1) {
                class227 var23 = Statics.field1285[var22.field2954];
                if (var23 != null) {
                    int var24 = (var22.field2964 * 4 - var23.field3233) / 2;
                    int var25 = (var22.field2941 * 4 - var23.field3230) / 2;
                    var23.method3932(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2941) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2001.field3238;
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
        int var29 = Statics.field2347.method1665(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class203 var31 = class203.method579(var30);
        if (var31.field2954 == -1) {
            return;
        }
        class227 var32 = Statics.field1285[var31.field2954];
        if (var32 != null) {
            int var33 = (var31.field2964 * 4 - var32.field3233) / 2;
            int var34 = (var31.field2941 * 4 - var32.field3230) / 2;
            var32.method3932(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2941) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("h.bj(IIIIIIIIII)V")
    public static final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field416.method2666(); var10 != null; var10 = (class26) field416.method2668()) {
            if (var10.field580 == arg0 && var10.field574 == arg1 && var10.field575 == arg2 && var10.field573 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field580 = arg0;
            var9.field573 = arg3;
            var9.field574 = arg1;
            var9.field575 = arg2;
            method1904(var9);
            field416.method2662(var9);
        }
        var9.field578 = arg4;
        var9.field581 = arg5;
        var9.field579 = arg6;
        var9.field582 = arg7;
        var9.field583 = arg8;
    }

    @ObfuscatedName("gs.bp(I)V")
    public static final void method3413() {
        for (class26 var0 = (class26) field416.method2666(); var0 != null; var0 = (class26) field416.method2668()) {
            if (var0.field583 == -1) {
                var0.field582 = 0;
                method1904(var0);
            } else {
                var0.method2652();
            }
        }
    }

    @ObfuscatedName("dt.bc(Ly;B)V")
    public static final void method1904(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field573 == 0) {
            var1 = Statics.field2347.method1662(arg0.field580, arg0.field574, arg0.field575);
        }
        if (arg0.field573 == 1) {
            var1 = Statics.field2347.method1720(arg0.field580, arg0.field574, arg0.field575);
        }
        if (arg0.field573 == 2) {
            var1 = Statics.field2347.method1733(arg0.field580, arg0.field574, arg0.field575);
        }
        if (arg0.field573 == 3) {
            var1 = Statics.field2347.method1665(arg0.field580, arg0.field574, arg0.field575);
        }
        if (var1 != 0) {
            int var5 = Statics.field2347.method1666(arg0.field580, arg0.field574, arg0.field575, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field576 = var2;
        arg0.field577 = var3;
        arg0.field586 = var4;
    }

    @ObfuscatedName("u.bh(I)V")
    public static final void method79() {
        for (class26 var0 = (class26) field416.method2666(); var0 != null; var0 = (class26) field416.method2668()) {
            if (var0.field583 > 0) {
                var0.field583--;
            }
            if (var0.field583 != 0) {
                if (var0.field582 > 0) {
                    var0.field582--;
                }
                if (var0.field582 == 0 && var0.field574 >= 1 && var0.field575 >= 1 && var0.field574 <= 102 && var0.field575 <= 102 && (var0.field578 < 0 || class11.method190(var0.field578, var0.field581))) {
                    method2937(var0.field580, var0.field573, var0.field574, var0.field575, var0.field578, var0.field579, var0.field581);
                    var0.field582 = -1;
                    if (var0.field578 == var0.field576 && var0.field576 == -1) {
                        var0.method2652();
                    } else if (var0.field578 == var0.field576 && var0.field586 == var0.field579 && var0.field581 == var0.field577) {
                        var0.method2652();
                    }
                }
            } else if (var0.field576 < 0 || class11.method190(var0.field576, var0.field577)) {
                method2937(var0.field580, var0.field573, var0.field574, var0.field575, var0.field576, var0.field586, var0.field577);
                var0.method2652();
            }
        }
    }

    @ObfuscatedName("fu.bs(IIIIIIII)V")
    public static final void method2937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field286 && Statics.field533 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2347.method1662(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2347.method1720(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2347.method1733(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2347.method1665(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2347.method1666(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2347.method1653(arg0, arg2, arg3);
                class203 var15 = class203.method579(var12);
                if (var15.field2937 != 0) {
                    field343[arg0].method2113(arg2, arg3, var13, var14, var15.field2943);
                }
            }
            if (arg1 == 1) {
                Statics.field2347.method1635(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2347.method1655(arg0, arg2, arg3);
                class203 var16 = class203.method579(var12);
                if (var16.field2964 + arg2 > 103 || var16.field2964 + arg3 > 103 || var16.field2941 + arg2 > 103 || var16.field2941 + arg3 > 103) {
                    return;
                }
                if (var16.field2937 != 0) {
                    field343[arg0].method2112(arg2, arg3, var16.field2964, var16.field2941, var14, var16.field2943);
                }
            }
            if (arg1 == 3) {
                Statics.field2347.method1656(arg0, arg2, arg3);
                class203 var17 = class203.method579(var12);
                if (var17.field2937 == 1) {
                    field343[arg0].method2108(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field93[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field2347;
        class118 var20 = field343[arg0];
        class203 var21 = class203.method579(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2941;
            var23 = var21.field2964;
        } else {
            var22 = var21.field2964;
            var23 = var21.field2941;
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
        int[][] var28 = class11.field103[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2944 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2965 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var34 = var21.method3472(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1803(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2937 == 1) {
                var20.method2103(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var57 = var21.method3472(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1661(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2937 != 0) {
                var20.method2102(arg2, arg3, var22, var23, var21.field2943);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var35 = var21.method3472(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1661(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2937 != 0) {
                var20.method2102(arg2, arg3, var22, var23, var21.field2943);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var36 = var21.method3472(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1644(arg0, arg2, arg3, var29, var36, (class90) null, class11.field100[arg5], 0, var32, var33);
            if (var21.field2937 != 0) {
                var20.method2104(arg2, arg3, arg6, arg5, var21.field2943);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var37 = var21.method3472(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1644(arg0, arg2, arg3, var29, var37, (class90) null, class11.field102[arg5], 0, var32, var33);
            if (var21.field2937 != 0) {
                var20.method2104(arg2, arg3, arg6, arg5, var21.field2943);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var39 = var21.method3472(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3472(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2930, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1644(arg0, arg2, arg3, var29, var39, var40, class11.field100[arg5], class11.field100[var38], var32, var33);
            if (var21.field2937 != 0) {
                var20.method2104(arg2, arg3, arg6, arg5, var21.field2943);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var41 = var21.method3472(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1644(arg0, arg2, arg3, var29, var41, (class90) null, class11.field102[arg5], 0, var32, var33);
            if (var21.field2937 != 0) {
                var20.method2104(arg2, arg3, arg6, arg5, var21.field2943);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var42 = var21.method3472(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1661(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2937 != 0) {
                var20.method2102(arg2, arg3, var22, var23, var21.field2943);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var43 = var21.method3472(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1645(arg0, arg2, arg3, var29, var43, (class90) null, class11.field100[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1662(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class203.method579(var45 >> 14 & 0x7FFF).field2952;
            }
            class90 var46;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var46 = var21.method3472(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1645(arg0, arg2, arg3, var29, var46, (class90) null, class11.field100[arg5], 0, class11.field101[arg5] * var44, class11.field108[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1662(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class203.method579(var48 >> 14 & 0x7FFF).field2952 / 2;
            }
            class90 var49;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var49 = var21.method3472(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1645(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class11.field111[arg5] * var47, class11.field104[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var51 = var21.method3472(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1645(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1662(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class203.method579(var53 >> 14 & 0x7FFF).field2952 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2930 == -1 && var21.field2966 == null) {
                var55 = var21.method3472(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3472(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2930, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2930, true, (class90) null);
            }
            var19.method1645(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class11.field111[arg5] * var52, class11.field104[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("af.bq(III)V")
    public static final void method762(int arg0, int arg1) {
        class150 var2 = field415[Statics.field533][arg0][arg1];
        if (var2 == null) {
            Statics.field2347.method1716(Statics.field533, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2666(); var6 != null; var6 = (class44) var2.method2668()) {
            class204 var7 = class204.method868(var6.field880);
            long var8 = (long) var7.field3023;
            if (var7.field3000 == 1) {
                var8 = (long) (var6.field875 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2347.method1716(Statics.field533, arg0, arg1);
            return;
        }
        var2.method2681(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2666(); var12 != null; var12 = (class44) var2.method2668()) {
            if (var5.field880 != var12.field880) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field880 != var12.field880 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2347.method1664(Statics.field533, arg0, arg1, method599(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field533), var5, var13, var10, var11);
    }

    @ObfuscatedName("i.bg(ZI)V")
    public static final void method201(boolean arg0) {
        field408 = 0;
        field293 = 0;
        field328.method2482();
        int var1 = field328.method2483(8);
        if (var1 < field322) {
            for (int var2 = var1; var2 < field322; var2++) {
                field409[++field408 - 1] = field351[var2];
            }
        }
        if (var1 > field322) {
            throw new RuntimeException("");
        }
        field322 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field351[var3];
            class36 var5 = field534[var4];
            int var6 = field328.method2483(1);
            if (var6 == 0) {
                field351[++field322 - 1] = var4;
                var5.field649 = field291;
            } else {
                int var7 = field328.method2483(2);
                if (var7 == 0) {
                    field351[++field322 - 1] = var4;
                    var5.field649 = field291;
                    field325[++field293 - 1] = var4;
                } else if (var7 == 1) {
                    field351[++field322 - 1] = var4;
                    var5.field649 = field291;
                    int var8 = field328.method2483(3);
                    var5.method729(var8, (byte) 1);
                    int var9 = field328.method2483(1);
                    if (var9 == 1) {
                        field325[++field293 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field351[++field322 - 1] = var4;
                    var5.field649 = field291;
                    int var10 = field328.method2483(3);
                    var5.method729(var10, (byte) 2);
                    int var11 = field328.method2483(3);
                    var5.method729(var11, (byte) 2);
                    int var12 = field328.method2483(1);
                    if (var12 == 1) {
                        field325[++field293 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field409[++field408 - 1] = var4;
                }
            }
        }
        method1821(arg0);
        for (int var13 = 0; var13 < field293; var13++) {
            int var14 = field325[var13];
            class36 var15 = field534[var14];
            int var16 = field328.method2379();
            if ((var16 & 0x2) != 0) {
                var15.field626 = field328.method2265();
                if (var15.field626 == 65535) {
                    var15.field626 = -1;
                }
            }
            if ((var16 & 0x20) != 0) {
                int var17 = field328.method2256();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = -1;
                        int var20 = -1;
                        int var21 = -1;
                        int var22 = field328.method2242();
                        if (var22 == 32767) {
                            var22 = field328.method2242();
                            var20 = field328.method2242();
                            var19 = field328.method2242();
                            var21 = field328.method2242();
                        } else if (var22 == 32766) {
                            var22 = -1;
                        } else {
                            var20 = field328.method2242();
                        }
                        int var23 = field328.method2242();
                        var15.method583(var22, var20, var19, var21, field291, var23);
                    }
                }
                int var24 = field328.method2379();
                if (var24 > 0) {
                    for (int var25 = 0; var25 < var24; var25++) {
                        int var26 = field328.method2242();
                        int var27 = field328.method2242();
                        if (var27 == 32767) {
                            var15.method586(var26);
                        } else {
                            int var28 = field328.method2242();
                            int var29 = field328.method2256();
                            int var30 = var27 > 0 ? field328.method2256() : var29;
                            var15.method581(var26, field291, var27, var28, var29, var30);
                        }
                    }
                }
            }
            if ((var16 & 0x4) != 0) {
                int var31 = field328.method2267();
                int var32 = field328.method2266();
                int var33 = var15.field629 - (var31 - Statics.field1726 - Statics.field1726) * 64;
                int var34 = var15.field601 - (var32 - Statics.field1776 - Statics.field1776) * 64;
                if (var33 != 0 || var34 != 0) {
                    var15.field628 = (int) (Math.atan2((double) var33, (double) var34) * 325.949D) & 0x7FF;
                }
            }
            if ((var16 & 0x40) != 0) {
                var15.field762 = class205.method3033(field328.method2265());
                var15.field604 = var15.field762.field3043;
                var15.field653 = var15.field762.field3049;
                var15.field660 = var15.field762.field3066;
                var15.field609 = var15.field762.field3034;
                var15.field610 = var15.field762.field3063;
                var15.field611 = var15.field762.field3058;
                var15.field605 = var15.field762.field3048;
                var15.field606 = var15.field762.field3044;
                var15.field607 = var15.field762.field3067;
            }
            if ((var16 & 0x1) != 0) {
                var15.field637 = field328.method2267();
                int var35 = field328.method2246();
                var15.field623 = var35 >> 16;
                var15.field640 = (var35 & 0xFFFF) + field291;
                var15.field638 = 0;
                var15.field632 = 0;
                if (var15.field640 > field291) {
                    var15.field638 = -1;
                }
                if (var15.field637 == 65535) {
                    var15.field637 = -1;
                }
            }
            if ((var16 & 0x8) != 0) {
                int var36 = field328.method2232();
                if (var36 == 65535) {
                    var36 = -1;
                }
                int var37 = field328.method2405();
                if (var15.field627 == var36 && var36 != -1) {
                    int var38 = class207.method3621(var36).field3103;
                    if (var38 == 1) {
                        var15.field633 = 0;
                        var15.field634 = 0;
                        var15.field635 = var37;
                        var15.field636 = 0;
                    }
                    if (var38 == 2) {
                        var15.field636 = 0;
                    }
                } else if (var36 == -1 || var15.field627 == -1 || class207.method3621(var36).field3097 >= class207.method3621(var15.field627).field3097) {
                    var15.field627 = var36;
                    var15.field633 = 0;
                    var15.field634 = 0;
                    var15.field635 = var37;
                    var15.field636 = 0;
                    var15.field659 = var15.field654;
                }
            }
            if ((var16 & 0x10) != 0) {
                var15.field613 = field328.method2314();
                var15.field616 = 100;
            }
        }
        for (int var39 = 0; var39 < field408; var39++) {
            int var40 = field409[var39];
            if (field291 != field534[var40].field649) {
                field534[var40].field762 = null;
                field534[var40] = null;
            }
        }
        if (field329 != field328.field1956) {
            throw new RuntimeException(field328.field1956 + class38.field776 + field329);
        }
        for (int var41 = 0; var41 < field322; var41++) {
            if (field534[field351[var41]] == null) {
                throw new RuntimeException(var41 + class38.field776 + field322);
            }
        }
    }

    @ObfuscatedName("cc.ba(ZI)V")
    public static final void method1821(boolean arg0) {
        while (true) {
            if (field328.method2495(field329) >= 27) {
                int var1 = field328.method2483(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field534[var1] == null) {
                        field534[var1] = new class36();
                        var2 = true;
                    }
                    class36 var3 = field534[var1];
                    field351[++field322 - 1] = var1;
                    var3.field649 = field291;
                    int var4 = field328.method2483(1);
                    int var5;
                    if (arg0) {
                        var5 = field328.method2483(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field328.method2483(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field413[field328.method2483(3)];
                    if (var2) {
                        var3.field651 = var3.field602 = var6;
                    }
                    var3.field762 = class205.method3033(field328.method2483(14));
                    int var7 = field328.method2483(1);
                    if (var7 == 1) {
                        field325[++field293 - 1] = var1;
                    }
                    int var8;
                    if (arg0) {
                        var8 = field328.method2483(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field328.method2483(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field604 = var3.field762.field3043;
                    var3.field653 = var3.field762.field3049;
                    if (var3.field653 == 0) {
                        var3.field602 = 0;
                    }
                    var3.field660 = var3.field762.field3066;
                    var3.field609 = var3.field762.field3034;
                    var3.field610 = var3.field762.field3063;
                    var3.field611 = var3.field762.field3058;
                    var3.field605 = var3.field762.field3048;
                    var3.field606 = var3.field762.field3044;
                    var3.field607 = var3.field762.field3067;
                    var3.method728(Statics.field233.field662[0] + var5, Statics.field233.field656[0] + var8, var4 == 1);
                    continue;
                }
            }
            field328.method2485();
            return;
        }
    }

    @ObfuscatedName("da.bn(I)V")
    public static void method2143() {
        field424 = 0;
        field432 = -1;
        field423 = false;
        field388[0] = class176.field2532;
        field430[0] = "";
        field427[0] = 1006;
        field424 = 1;
    }

    @ObfuscatedName("cn.bz(IIS)V")
    public static final void method1819(int arg0, int arg1) {
        if (field424 < 2 && field352 == 0 && !field441) {
            return;
        }
        int var2 = method2062();
        String var3;
        if (field352 == 1 && field424 < 2) {
            var3 = class176.field2506 + class176.field2476 + field440 + " " + class38.field780;
        } else if (field441 && field424 < 2) {
            var3 = field439 + class176.field2476 + field393 + " " + class38.field780;
        } else {
            var3 = method180(var2);
        }
        if (field424 > 2) {
            var3 = var3 + class38.method3814(16777215) + " " + '/' + " " + (field424 - 2) + class176.field2510;
        }
        Statics.field1193.method3737(var3, arg0 + 4, arg1 + 15, 16777215, 0, field291 / 1000);
    }

    @ObfuscatedName("p.bd(IIIII)V")
    public static final void method76(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field491; var4++) {
            if (field544[var4] + field362[var4] > arg0 && field362[var4] < arg0 + arg2 && field569[var4] + field495[var4] > arg1 && field495[var4] < arg1 + arg3) {
                field369[var4] = true;
            }
        }
    }

    @ObfuscatedName("b.bt(I)V")
    public static final void method220() {
        Statics.method231();
        if (Statics.field1628 != null || field459 != null) {
            return;
        }
        int var0 = class116.field1812;
        if (!field423) {
            int var11;
            int var13;
            int var14;
            label255: {
                var11 = method2062();
                if ((var0 == 1 || !Statics.field663 && var0 == 4) && var11 >= 0) {
                    int var12 = field427[var11];
                    if (var12 == 39 || var12 == 40 || var12 == 41 || var12 == 42 || var12 == 43 || var12 == 33 || var12 == 34 || var12 == 35 || var12 == 36 || var12 == 37 || var12 == 38 || var12 == 1005) {
                        var13 = field425[var11];
                        var14 = field339[var11];
                        class172 var15 = class172.method2211(var14);
                        if (class173.method1358(method1872(var15))) {
                            break label255;
                        }
                        int var16 = method1872(var15);
                        boolean var17 = (var16 >> 29 & 0x1) != 0;
                        if (var17) {
                            break label255;
                        }
                    }
                }
                if (var0 == 1 || !Statics.field663 && var0 == 4) {
                    label250: {
                        label234: {
                            if (field422 == 1 && field424 > 2) {
                                boolean var21;
                                if (field424 <= 0) {
                                    var21 = false;
                                } else if (field433 && class106.field1696[81] && field432 != -1) {
                                    var21 = true;
                                } else {
                                    var21 = false;
                                }
                                if (!var21) {
                                    break label234;
                                }
                            }
                            boolean var22;
                            if (var11 < 0) {
                                var22 = false;
                            } else {
                                int var23 = field427[var11];
                                if (var23 >= 2000) {
                                    var23 -= 2000;
                                }
                                if (var23 == 1007) {
                                    var22 = true;
                                } else {
                                    var22 = false;
                                }
                            }
                            if (!var22) {
                                break label250;
                            }
                        }
                        var0 = 2;
                    }
                }
                if ((var0 == 1 || !Statics.field663 && var0 == 4) && field424 > 0) {
                    method3218(var11);
                }
                if (var0 == 2 && field424 > 0) {
                    method801(class116.field1803, class116.field1814);
                }
                return;
            }
            if (Statics.field1628 != null && !field401) {
                int var18 = method2062();
                if (field422 != 1) {
                    boolean var19;
                    if (var18 < 0) {
                        var19 = false;
                    } else {
                        int var20 = field427[var18];
                        if (var20 >= 2000) {
                            var20 -= 2000;
                        }
                        if (var20 == 1007) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                    }
                    if (!var19 && field424 > 0) {
                        method1631(field541, field399);
                    }
                }
            }
            field401 = false;
            field405 = 0;
            if (Statics.field1628 != null) {
                method2197(Statics.field1628);
            }
            Statics.field1628 = class172.method2211(var14);
            field489 = var13;
            field541 = class116.field1803;
            field399 = class116.field1814;
            if (var11 >= 0) {
                method1945(var11);
            }
            method2197(Statics.field1628);
            return;
        }
        if (var0 != 1 && (Statics.field663 || var0 != 4)) {
            int var1 = class116.field1806;
            int var2 = class116.field1807;
            if (var1 < Statics.field262 - 10 || var1 > Statics.field262 + Statics.field229 + 10 || var2 < Statics.field18 - 10 || var2 > Statics.field2915 + Statics.field18 + 10) {
                field423 = false;
                method76(Statics.field262, Statics.field18, Statics.field229, Statics.field2915);
            }
        }
        if (var0 != 1 && Statics.field663 || var0 != 4) {
            return;
        }
        int var3 = Statics.field262;
        int var4 = Statics.field18;
        int var5 = Statics.field229;
        int var6 = class116.field1803;
        int var7 = class116.field1814;
        int var8 = -1;
        for (int var9 = 0; var9 < field424; var9++) {
            int var10 = (field424 - 1 - var9) * 15 + var4 + 31;
            if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                var8 = var9;
            }
        }
        if (var8 != -1) {
            method3218(var8);
        }
        field423 = false;
        method76(Statics.field262, Statics.field18, Statics.field229, Statics.field2915);
    }

    @ObfuscatedName("as.cx(III)V")
    public static final void method801(int arg0, int arg1) {
        int var2 = Statics.field1193.method3691(class176.field2509);
        for (int var3 = 0; var3 < field424; var3++) {
            int var4 = Statics.field1193.method3691(method180(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field424 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2761) {
            var6 = Statics.field2761 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2727) {
            var7 = Statics.field2727 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field2347.method1673(Statics.field533, arg0, arg1, false);
        field423 = true;
        Statics.field262 = var6;
        Statics.field18 = var7;
        Statics.field229 = var2;
        Statics.field2915 = field424 * 15 + 22;
    }

    @ObfuscatedName("gt.cb(II)V")
    public static final void method3218(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field425[arg0];
        int var2 = field339[arg0];
        int var3 = field427[arg0];
        int var4 = field524[arg0];
        String var5 = field388[arg0];
        String var6 = field430[arg0];
        method1832(var1, var2, var3, var4, var5, var6, class116.field1803, class116.field1814);
    }

    @ObfuscatedName("cp.cm(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1832(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 32) {
            field326.method2480(27);
            field326.method2373(arg3);
            field326.method2373(arg0);
            field326.method2274(Statics.field270);
            field326.method2274(arg1);
            field326.method2222(field442);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 25) {
            class172 var8 = class172.method14(arg1, arg0);
            if (var8 != null) {
                method1628();
                method1981(arg1, arg0, Statics.method3327(method1872(var8)), var8.field2328);
                field352 = 0;
                String var9;
                if (Statics.method3327(method1872(var8)) == 0) {
                    var9 = null;
                } else if (var8.field2287 == null || var8.field2287.trim().length() == 0) {
                    var9 = null;
                } else {
                    var9 = var8.field2287;
                }
                field439 = var9;
                if (field439 == null) {
                    field439 = "Null";
                }
                if (var8.field2324) {
                    field393 = var8.field2260 + class38.method3814(16777215);
                } else {
                    field393 = class38.method3814(65280) + var8.field2214 + class38.method3814(16777215);
                }
            }
            return;
        }
        if (arg2 == 39) {
            field326.method2480(101);
            field326.method2373(arg3);
            field326.method2373(arg0);
            field326.method2273(arg1);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 43) {
            field326.method2480(116);
            field326.method2274(arg1);
            field326.method2373(arg3);
            field326.method2216(arg0);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 1) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(224);
            field326.method2222(Statics.field1726 + arg0);
            field326.method2274(Statics.field1172);
            field326.method2216(Statics.field265);
            field326.method2216(Statics.field2702);
            field326.method2373(Statics.field1776 + arg1);
            field326.method2253(class106.field1696[82] ? 1 : 0);
            field326.method2216(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class172 var10 = class172.method14(arg1, arg0);
            if (var10 != null) {
                int var11 = var10.field2328;
                class172 var12 = class172.method14(arg1, arg0);
                if (var12 != null) {
                    if (var12.field2308 != null) {
                        class19 var13 = new class19();
                        var13.field190 = var12;
                        var13.field193 = arg3;
                        var13.field191 = arg5;
                        var13.field197 = var12.field2308;
                        class33.method887(var13, 200000);
                    }
                    boolean var14 = true;
                    if (var12.field2212 > 0) {
                        var14 = method242(var12);
                    }
                    if (var14) {
                        int var15 = method1872(var12);
                        int var16 = arg3 - 1;
                        boolean var17 = (var15 >> var16 + 1 & 0x1) != 0;
                        if (var17) {
                            if (arg3 == 1) {
                                field326.method2480(190);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                            if (arg3 == 2) {
                                field326.method2480(52);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                            if (arg3 == 3) {
                                field326.method2480(87);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                            if (arg3 == 4) {
                                field326.method2480(205);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                            if (arg3 == 5) {
                                field326.method2480(200);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                            if (arg3 == 6) {
                                field326.method2480(187);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                            if (arg3 == 7) {
                                field326.method2480(131);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                            if (arg3 == 8) {
                                field326.method2480(248);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                            if (arg3 == 9) {
                                field326.method2480(244);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                            if (arg3 == 10) {
                                field326.method2480(88);
                                field326.method2218(arg1);
                                field326.method2216(arg0);
                                field326.method2216(var11);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 50) {
            class24 var18 = field404[arg3];
            if (var18 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(40);
                field326.method2346(class106.field1696[82] ? 1 : 0);
                field326.method2222(arg3);
            }
        }
        if (arg2 == 30 && field450 == null) {
            method767(arg1, arg0);
            field450 = class172.method14(arg1, arg0);
            method2197(field450);
        }
        if (arg2 == 1004) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field326.method2480(81);
            field326.method2216(arg3);
        }
        if (arg2 == 37) {
            field326.method2480(150);
            field326.method2274(arg1);
            field326.method2222(arg3);
            field326.method2216(arg0);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 1003) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            class36 var19 = field534[arg3];
            if (var19 != null) {
                class205 var20 = var19.field762;
                if (var20.field3040 != null) {
                    var20 = var20.method3591();
                }
                if (var20 != null) {
                    field326.method2480(105);
                    field326.method2222(var20.field3038);
                }
            }
        }
        if (arg2 == 24) {
            class172 var21 = class172.method2211(arg1);
            boolean var22 = true;
            if (var21.field2212 > 0) {
                var22 = method242(var21);
            }
            if (var22) {
                field326.method2480(229);
                field326.method2218(arg1);
            }
        }
        if (arg2 == 58) {
            class172 var23 = class172.method14(arg1, arg0);
            if (var23 != null) {
                field326.method2480(44);
                field326.method2222(var23.field2328);
                field326.method2274(arg1);
                field326.method2216(field538);
                field326.method2216(field442);
                field326.method2373(arg0);
                field326.method2218(Statics.field270);
            }
        }
        if (arg2 == 35) {
            field326.method2480(69);
            field326.method2216(arg0);
            field326.method2218(arg1);
            field326.method2263(arg3);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 16) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(211);
            field326.method2276(class106.field1696[82] ? 1 : 0);
            field326.method2222(Statics.field2702);
            field326.method2373(Statics.field265);
            field326.method2373(arg3);
            field326.method2373(Statics.field1776 + arg1);
            field326.method2222(Statics.field1726 + arg0);
            field326.method2273(Statics.field1172);
        }
        if (arg2 == 46) {
            class24 var24 = field404[arg3];
            if (var24 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(119);
                field326.method2263(arg3);
                field326.method2276(class106.field1696[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class36 var25 = field534[arg3];
            if (var25 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(103);
                field326.method2222(Statics.field265);
                field326.method2263(arg3);
                field326.method2273(Statics.field1172);
                field326.method2276(class106.field1696[82] ? 1 : 0);
                field326.method2373(Statics.field2702);
            }
        }
        if (arg2 == 4) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(30);
            field326.method2373(arg3 >> 14 & 0x7FFF);
            field326.method2222(Statics.field1726 + arg0);
            field326.method2222(Statics.field1776 + arg1);
            field326.method2253(class106.field1696[82] ? 1 : 0);
        }
        if (arg2 == 9) {
            class36 var26 = field534[arg3];
            if (var26 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(198);
                field326.method2253(class106.field1696[82] ? 1 : 0);
                field326.method2216(arg3);
            }
        }
        if (arg2 == 51) {
            class24 var27 = field404[arg3];
            if (var27 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(185);
                field326.method2346(class106.field1696[82] ? 1 : 0);
                field326.method2373(arg3);
            }
        }
        if (arg2 == 23) {
            if (field423) {
                Statics.field2347.method1772();
            } else {
                Statics.field2347.method1673(Statics.field533, arg0, arg1, true);
            }
        }
        if (arg2 == 48) {
            class24 var28 = field404[arg3];
            if (var28 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(125);
                field326.method2253(class106.field1696[82] ? 1 : 0);
                field326.method2222(arg3);
            }
        }
        if (arg2 == 26) {
            field326.method2480(197);
            for (class18 var29 = (class18) field447.method2614(); var29 != null; var29 = (class18) field447.method2615()) {
                if (var29.field180 == 0 || var29.field180 == 3) {
                    method1633(var29, true);
                }
            }
            if (field450 != null) {
                method2197(field450);
                field450 = null;
            }
        }
        if (arg2 == 12) {
            class36 var30 = field534[arg3];
            if (var30 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(96);
                field326.method2253(class106.field1696[82] ? 1 : 0);
                field326.method2222(arg3);
            }
        }
        if (arg2 == 1005) {
            class172 var31 = class172.method2211(arg1);
            if (var31 == null || var31.field2327[arg0] < 100000) {
                field326.method2480(81);
                field326.method2216(arg3);
            } else {
                class48.method196(27, "", var31.field2327[arg0] + " x " + class204.method868(arg3).field3022);
            }
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 36) {
            field326.method2480(99);
            field326.method2218(arg1);
            field326.method2263(arg0);
            field326.method2263(arg3);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 22) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(239);
            field326.method2263(Statics.field1776 + arg1);
            field326.method2263(arg3);
            field326.method2346(class106.field1696[82] ? 1 : 0);
            field326.method2216(Statics.field1726 + arg0);
        }
        if (arg2 == 34) {
            field326.method2480(152);
            field326.method2373(arg3);
            field326.method2258(arg1);
            field326.method2373(arg0);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 5) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(247);
            field326.method2373(arg3 >> 14 & 0x7FFF);
            field326.method2276(class106.field1696[82] ? 1 : 0);
            field326.method2373(Statics.field1726 + arg0);
            field326.method2222(Statics.field1776 + arg1);
        }
        if (arg2 == 42) {
            field326.method2480(160);
            field326.method2222(arg0);
            field326.method2216(arg3);
            field326.method2218(arg1);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 14) {
            class24 var32 = field404[arg3];
            if (var32 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(6);
                field326.method2263(Statics.field265);
                field326.method2263(arg3);
                field326.method2273(Statics.field1172);
                field326.method2263(Statics.field2702);
                field326.method2276(class106.field1696[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(115);
            field326.method2222(Statics.field1726 + arg0);
            field326.method2263(arg3 >> 14 & 0x7FFF);
            field326.method2373(Statics.field1776 + arg1);
            field326.method2222(field442);
            field326.method2218(Statics.field270);
            field326.method2215(class106.field1696[82] ? 1 : 0);
        }
        if (arg2 == 18) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(136);
            field326.method2216(arg3);
            field326.method2276(class106.field1696[82] ? 1 : 0);
            field326.method2373(Statics.field1726 + arg0);
            field326.method2373(Statics.field1776 + arg1);
        }
        if (arg2 == 38) {
            method1628();
            class172 var33 = class172.method2211(arg1);
            field352 = 1;
            Statics.field265 = arg0;
            Statics.field1172 = arg1;
            Statics.field2702 = arg3;
            method2197(var33);
            field440 = class38.method3814(16748608) + class204.method868(arg3).field3022 + class38.method3814(16777215);
            if (field440 == null) {
                field440 = "null";
            }
            return;
        }
        if (arg2 == 1002) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field326.method2480(174);
            field326.method2222(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class36 var34 = field534[arg3];
            if (var34 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(49);
                field326.method2253(class106.field1696[82] ? 1 : 0);
                field326.method2373(arg3);
            }
        }
        if (arg2 == 41) {
            field326.method2480(217);
            field326.method2274(arg1);
            field326.method2222(arg0);
            field326.method2263(arg3);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 47) {
            class24 var35 = field404[arg3];
            if (var35 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(73);
                field326.method2373(arg3);
                field326.method2215(class106.field1696[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field326.method2480(229);
            field326.method2218(arg1);
            class172 var36 = class172.method2211(arg1);
            if (var36.field2325 != null && var36.field2325[0][0] == 5) {
                int var37 = var36.field2325[0][1];
                class168.field2174[var37] = 1 - class168.field2174[var37];
                method2939(var37);
            }
        }
        if (arg2 == 33) {
            field326.method2480(201);
            field326.method2216(arg0);
            field326.method2273(arg1);
            field326.method2216(arg3);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 19) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(4);
            field326.method2216(arg3);
            field326.method2373(Statics.field1776 + arg1);
            field326.method2346(class106.field1696[82] ? 1 : 0);
            field326.method2216(Statics.field1726 + arg0);
        }
        if (arg2 == 3) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(203);
            field326.method2263(Statics.field1776 + arg1);
            field326.method2222(Statics.field1726 + arg0);
            field326.method2346(class106.field1696[82] ? 1 : 0);
            field326.method2222(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(158);
            field326.method2276(class106.field1696[82] ? 1 : 0);
            field326.method2222(arg3);
            field326.method2373(Statics.field1776 + arg1);
            field326.method2222(Statics.field1726 + arg0);
        }
        if (arg2 == 40) {
            field326.method2480(3);
            field326.method2263(arg0);
            field326.method2274(arg1);
            field326.method2216(arg3);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 15) {
            class24 var38 = field404[arg3];
            if (var38 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(48);
                field326.method2373(field442);
                field326.method2253(class106.field1696[82] ? 1 : 0);
                field326.method2373(arg3);
                field326.method2218(Statics.field270);
            }
        }
        if (arg2 == 6) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(252);
            field326.method2222(Statics.field1776 + arg1);
            field326.method2216(arg3 >> 14 & 0x7FFF);
            field326.method2215(class106.field1696[82] ? 1 : 0);
            field326.method2222(Statics.field1726 + arg0);
        }
        if (arg2 == 20) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(137);
            field326.method2263(Statics.field1776 + arg1);
            field326.method2216(Statics.field1726 + arg0);
            field326.method2263(arg3);
            field326.method2346(class106.field1696[82] ? 1 : 0);
        }
        if (arg2 == 10) {
            class36 var39 = field534[arg3];
            if (var39 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(53);
                field326.method2215(class106.field1696[82] ? 1 : 0);
                field326.method2222(arg3);
            }
        }
        if (arg2 == 17) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(140);
            field326.method2216(Statics.field1776 + arg1);
            field326.method2222(Statics.field1726 + arg0);
            field326.method2216(field442);
            field326.method2276(class106.field1696[82] ? 1 : 0);
            field326.method2263(arg3);
            field326.method2258(Statics.field270);
        }
        if (arg2 == 29) {
            field326.method2480(229);
            field326.method2218(arg1);
            class172 var40 = class172.method2211(arg1);
            if (var40.field2325 != null && var40.field2325[0][0] == 5) {
                int var41 = var40.field2325[0][1];
                if (class168.field2174[var41] != var40.field2322[0]) {
                    class168.field2174[var41] = var40.field2322[0];
                    method2939(var41);
                }
            }
        }
        if (arg2 == 31) {
            field326.method2480(28);
            field326.method2218(arg1);
            field326.method2273(Statics.field1172);
            field326.method2263(Statics.field265);
            field326.method2373(Statics.field2702);
            field326.method2263(arg3);
            field326.method2216(arg0);
            field395 = 0;
            Statics.field733 = class172.method2211(arg1);
            field396 = arg0;
        }
        if (arg2 == 45) {
            class24 var42 = field404[arg3];
            if (var42 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(90);
                field326.method2253(class106.field1696[82] ? 1 : 0);
                field326.method2373(arg3);
            }
        }
        if (arg2 == 49) {
            class24 var43 = field404[arg3];
            if (var43 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(32);
                field326.method2373(arg3);
                field326.method2346(class106.field1696[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class36 var44 = field534[arg3];
            if (var44 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(65);
                field326.method2222(field442);
                field326.method2263(arg3);
                field326.method2273(Statics.field270);
                field326.method2253(class106.field1696[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field551 = arg6;
            field392 = arg7;
            field394 = 2;
            field334 = 0;
            field521 = arg0;
            field335 = arg1;
            field326.method2480(234);
            field326.method2215(class106.field1696[82] ? 1 : 0);
            field326.method2216(Statics.field1776 + arg1);
            field326.method2222(arg3 >> 14 & 0x7FFF);
            field326.method2216(Statics.field1726 + arg0);
        }
        if (arg2 == 44) {
            class24 var45 = field404[arg3];
            if (var45 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(164);
                field326.method2216(arg3);
                field326.method2276(class106.field1696[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class36 var46 = field534[arg3];
            if (var46 != null) {
                field551 = arg6;
                field392 = arg7;
                field394 = 2;
                field334 = 0;
                field521 = arg0;
                field335 = arg1;
                field326.method2480(78);
                field326.method2373(arg3);
                field326.method2346(class106.field1696[82] ? 1 : 0);
            }
        }
        if (field352 != 0) {
            field352 = 0;
            method2197(class172.method2211(Statics.field1172));
        }
        if (field441) {
            method1628();
        }
        if (Statics.field733 != null && field395 == 0) {
            method2197(Statics.field733);
        }
    }

    @ObfuscatedName("dp.ck(IIIII)V")
    public static void method1981(int arg0, int arg1, int arg2, int arg3) {
        class172 var4 = class172.method14(arg0, arg1);
        if (var4 != null && var4.field2262 != null) {
            class19 var5 = new class19();
            var5.field190 = var4;
            var5.field197 = var4.field2262;
            class33.method887(var5, 200000);
        }
        field538 = arg3;
        field441 = true;
        Statics.field270 = arg0;
        field442 = arg1;
        Statics.field2072 = arg2;
        method2197(var4);
    }

    @ObfuscatedName("cz.cf(B)V")
    public static void method1628() {
        if (!field441) {
            return;
        }
        class172 var0 = class172.method14(Statics.field270, field442);
        if (var0 != null && var0.field2335 != null) {
            class19 var1 = new class19();
            var1.field190 = var0;
            var1.field197 = var0.field2335;
            class33.method887(var1, 200000);
        }
        field441 = false;
        method2197(var0);
    }

    @ObfuscatedName("af.cj(IIB)V")
    public static void method767(int arg0, int arg1) {
        field326.method2480(192);
        field326.method2263(arg1);
        field326.method2218(arg0);
    }

    @ObfuscatedName("by.cz(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1107(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        Statics.method739(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("dw.cq(I)I")
    public static final int method2062() {
        if (field424 <= 0) {
            return -1;
        } else if (field433 && class106.field1696[81] && field432 != -1) {
            return field432;
        } else {
            return field424 - 1;
        }
    }

    @ObfuscatedName("j.cs(B)V")
    public static void method191() {
        for (int var0 = 0; var0 < field424; var0++) {
            int var1 = field427[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field424 - 1) {
                    for (int var3 = var0; var3 < field424 - 1; var3++) {
                        field388[var3] = field388[var3 + 1];
                        field430[var3] = field430[var3 + 1];
                        field427[var3] = field427[var3 + 1];
                        field524[var3] = field524[var3 + 1];
                        field425[var3] = field425[var3 + 1];
                        field339[var3] = field339[var3 + 1];
                    }
                }
                field424--;
            }
        }
    }

    @ObfuscatedName("s.cy(II)Ljava/lang/String;")
    public static String method180(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field430[arg0].length() > 0) {
            return field388[arg0] + class176.field2476 + field430[arg0];
        } else {
            return field388[arg0];
        }
    }

    @ObfuscatedName("cs.cl(IIIIB)V")
    public static final void method1808(int arg0, int arg1, int arg2, int arg3) {
        if (field352 == 0 && !field441) {
            method1107(class176.field2511, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class83.field1403; var6++) {
            int var7 = class83.field1404[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2347.method1666(Statics.field533, var8, var9, var7) >= 0) {
                    class203 var12 = class203.method579(var11);
                    if (var12.field2966 != null) {
                        var12 = var12.method3475();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field352 == 1) {
                        method1107(class176.field2506, field440 + " " + class38.field780 + " " + class38.method3814(65535) + var12.field2935, 1, var7, var8, var9);
                    } else if (!field441) {
                        String[] var13 = var12.field2974;
                        if (field457) {
                            var13 = method2125(var13);
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
                                    method1107(var13[var14], class38.method3814(65535) + var12.field2935, var15, var7, var8, var9);
                                }
                            }
                        }
                        method1107(class176.field2507, class38.method3814(65535) + var12.field2935, 1002, var12.field2942 << 14, var8, var9);
                    } else if ((Statics.field2072 & 0x4) == 4) {
                        method1107(field439, field393 + " " + class38.field780 + " " + class38.method3814(65535) + var12.field2935, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class36 var16 = field534[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field762.field3043 == 1 && (var16.field629 & 0x7F) == 64 && (var16.field601 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field322; var17++) {
                            class36 var18 = field534[field351[var17]];
                            if (var18 != null && var16 != var18 && var18.field762.field3043 == 1 && var16.field629 == var18.field629 && var16.field601 == var18.field601) {
                                method2156(var18.field762, field351[var17], var8, var9);
                            }
                        }
                        int var19 = class46.field892;
                        int[] var20 = class46.field895;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class24 var22 = field404[var20[var21]];
                            if (var22 != null && var16.field629 == var22.field629 && var16.field601 == var22.field601) {
                                method197(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method2156(var16.field762, var11, var8, var9);
                }
                if (var10 == 0) {
                    class24 var23 = field404[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field629 & 0x7F) == 64 && (var23.field601 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field322; var24++) {
                            class36 var25 = field534[field351[var24]];
                            if (var25 != null && var25.field762.field3043 == 1 && var23.field629 == var25.field629 && var23.field601 == var25.field601) {
                                method2156(var25.field762, field351[var24], var8, var9);
                            }
                        }
                        int var26 = class46.field892;
                        int[] var27 = class46.field895;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class24 var29 = field404[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field629 == var29.field629 && var23.field601 == var29.field601) {
                                method197(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field473 == var11) {
                        var4 = var7;
                    } else {
                        method197(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class150 var30 = field415[Statics.field533][var8][var9];
                    if (var30 != null) {
                        for (class44 var31 = (class44) var30.method2667(); var31 != null; var31 = (class44) var30.method2669()) {
                            class204 var32 = class204.method868(var31.field880);
                            if (field352 == 1) {
                                method1107(class176.field2506, field440 + " " + class38.field780 + " " + class38.method3814(16748608) + var32.field3022, 16, var31.field880, var8, var9);
                            } else if (!field441) {
                                String[] var33 = var32.field3003;
                                if (field457) {
                                    var33 = method2125(var33);
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
                                        method1107(var33[var34], class38.method3814(16748608) + var32.field3022, var35, var31.field880, var8, var9);
                                    } else if (var34 == 2) {
                                        method1107(class176.field2359, class38.method3814(16748608) + var32.field3022, 20, var31.field880, var8, var9);
                                    }
                                }
                                method1107(class176.field2507, class38.method3814(16748608) + var32.field3022, 1004, var31.field880, var8, var9);
                            } else if ((Statics.field2072 & 0x1) == 1) {
                                method1107(field439, field393 + " " + class38.field780 + " " + class38.method3814(16748608) + var32.field3022, 17, var31.field880, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class24 var38 = field404[field473];
            method197(var38, field473, var36, var37);
        }
    }

    @ObfuscatedName("dc.cg(Lgx;IIIB)V")
    public static final void method2156(class205 arg0, int arg1, int arg2, int arg3) {
        if (field424 >= 400) {
            return;
        }
        if (arg0.field3040 != null) {
            arg0 = arg0.method3591();
        }
        if (arg0 == null || !arg0.field3062 || arg0.field3069 && field311 != arg1) {
            return;
        }
        String var4 = arg0.field3056;
        if (arg0.field3059 != 0) {
            var4 = var4 + method651(arg0.field3059, Statics.field233.field241) + " " + class38.field782 + class176.field2512 + arg0.field3059 + class38.field779;
        }
        if (arg0.field3069 && field431) {
            method1107(class176.field2507, class38.method3814(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field352 == 1) {
            method1107(class176.field2506, field440 + " " + class38.field780 + " " + class38.method3814(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field441) {
            int var5 = arg0.field3069 && field431 ? 2000 : 0;
            String[] var6 = arg0.field3054;
            if (field457) {
                var6 = method2125(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class176.field2508)) {
                        int var8 = 0;
                        if (var7 == 0) {
                            var8 = var5 + 9;
                        }
                        if (var7 == 1) {
                            var8 = var5 + 10;
                        }
                        if (var7 == 2) {
                            var8 = var5 + 11;
                        }
                        if (var7 == 3) {
                            var8 = var5 + 12;
                        }
                        if (var7 == 4) {
                            var8 = var5 + 13;
                        }
                        method1107(var6[var7], class38.method3814(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class176.field2508)) {
                        short var10 = 0;
                        if (field308 != class41.field808) {
                            if (field308 == class41.field806 || field308 == class41.field810 && arg0.field3059 > Statics.field233.field241) {
                                var10 = 2000;
                            }
                            int var11 = 0;
                            if (var9 == 0) {
                                var11 = var10 + 9;
                            }
                            if (var9 == 1) {
                                var11 = var10 + 10;
                            }
                            if (var9 == 2) {
                                var11 = var10 + 11;
                            }
                            if (var9 == 3) {
                                var11 = var10 + 12;
                            }
                            if (var9 == 4) {
                                var11 = var10 + 13;
                            }
                            method1107(var6[var9], class38.method3814(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3069 || !field431) {
                method1107(class176.field2507, class38.method3814(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2072 & 0x2) == 2) {
            method1107(field439, field393 + " " + class38.field780 + " " + class38.method3814(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("i.cn(Lo;IIII)V")
    public static final void method197(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field233 == arg0 || field424 >= 400) {
            return;
        }
        String var4;
        if (arg0.field242 == 0) {
            var4 = arg0.field244[0] + arg0.field266 + arg0.field244[1] + method651(arg0.field241, Statics.field233.field241) + " " + class38.field782 + class176.field2512 + arg0.field241 + class38.field779 + arg0.field244[2];
        } else {
            var4 = arg0.field244[0] + arg0.field266 + arg0.field244[1] + " " + class38.field782 + class176.field2379 + arg0.field242 + class38.field779 + arg0.field244[2];
        }
        if (field352 == 1) {
            method1107(class176.field2506, field440 + " " + class38.field780 + " " + class38.method3814(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field441) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field411[var5] != null) {
                    short var6 = 0;
                    if (field411[var5].equalsIgnoreCase(class176.field2508)) {
                        if (field307 == class41.field808) {
                            continue;
                        }
                        if (field307 == class41.field806 || field307 == class41.field810 && arg0.field241 > Statics.field233.field241) {
                            var6 = 2000;
                        }
                        if (Statics.field233.field251 != 0 && arg0.field251 != 0) {
                            if (Statics.field233.field251 == arg0.field251) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field412[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field410[var5] + var6;
                    method1107(field411[var5], class38.method3814(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2072 & 0x8) == 8) {
            method1107(field439, field393 + " " + class38.field780 + " " + class38.method3814(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field424; var9++) {
            if (field427[var9] == 23) {
                field430[var9] = class38.method3814(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ak.ce(IIB)Ljava/lang/String;")
    public static final String method651(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method3814(16711680);
        } else if (var2 < -6) {
            return class38.method3814(16723968);
        } else if (var2 < -3) {
            return class38.method3814(16740352);
        } else if (var2 < 0) {
            return class38.method3814(16756736);
        } else if (var2 > 9) {
            return class38.method3814(65280);
        } else if (var2 > 6) {
            return class38.method3814(4259584);
        } else if (var2 > 3) {
            return class38.method3814(8453888);
        } else if (var2 > 0) {
            return class38.method3814(12648192);
        } else {
            return class38.method3814(16776960);
        }
    }

    @ObfuscatedName("hb.cr(IIIIIIIII)V")
    public static final void method3787(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class172.method1982(arg0)) {
            Statics.field118 = null;
            method2908(Statics.field1985[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field118 != null) {
                method2908(Statics.field118, -1412584499, arg1, arg2, arg3, arg4, Statics.field1887, Statics.field761, arg7);
                Statics.field118 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field369[var8] = true;
            }
        } else {
            field369[arg7] = true;
        }
    }

    @ObfuscatedName("fi.cc([Lfc;IIIIIIIII)V")
    public static final void method2908(class172[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class224.method3860(arg2, arg3, arg4, arg5);
        class85.method1564();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class172 var10 = arg0[var9];
            if (var10 != null && (var10.field2227 == arg1 || arg1 == -1412584499 && field459 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field362[field491] = var10.field2320 + arg6;
                    field495[field491] = var10.field2222 + arg7;
                    field544[field491] = var10.field2336;
                    field569[field491] = var10.field2341;
                    var11 = ++field491 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2292 = var11;
                var10.field2340 = field291;
                if (!var10.field2324 || !method834(var10)) {
                    if (var10.field2212 > 0) {
                        method2459(var10);
                    }
                    int var12 = var10.field2320 + arg6;
                    int var13 = var10.field2222 + arg7;
                    int var14 = var10.field2242;
                    if (field459 == var10) {
                        if (arg1 != -1412584499 && !var10.field2291) {
                            Statics.field118 = arg0;
                            Statics.field1887 = arg6;
                            Statics.field761 = arg7;
                            continue;
                        }
                        if (field470 && field464) {
                            int var15 = class116.field1806;
                            int var16 = class116.field1807;
                            int var17 = var15 - field493;
                            int var18 = var16 - field462;
                            if (var17 < field381) {
                                var17 = field381;
                            }
                            if (var10.field2336 + var17 > field381 + field497.field2336) {
                                var17 = field381 + field497.field2336 - var10.field2336;
                            }
                            if (var18 < field466) {
                                var18 = field466;
                            }
                            if (var10.field2341 + var18 > field466 + field497.field2341) {
                                var18 = field466 + field497.field2341 - var10.field2341;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2291) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2331 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2331 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2336 + var12;
                        int var26 = var10.field2341 + var13;
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
                        int var29 = var10.field2336 + var12;
                        int var30 = var10.field2341 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2324 || var19 < var21 && var20 < var22) {
                        if (var10.field2212 != 0) {
                            if (var10.field2212 == 1336) {
                                if (field559) {
                                    var13 += 15;
                                    Statics.field1543.method3703("Fps:" + field1773, var10.field2336 + var12, var13, 16776960, -1);
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
                                    Statics.field1543.method3703("Mem:" + var32 + "k", var10.field2336 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2212 == 1337) {
                                field434 = var12;
                                field547 = var13;
                                method1914(var12, var13, var10.field2336, var10.field2341);
                                field369[var10.field2292] = true;
                                class224.method3860(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2212 == 1338) {
                                Statics.method2743(var10, var12, var13, var11);
                                class224.method3860(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2212 == 1339) {
                                class167 var34 = var10.method3011(false);
                                if (var34 != null) {
                                    if (field523 < 3) {
                                        Statics.field1205.method4008(var12, var13, var34.field2168, var34.field2166, 25, 25, field368, 256, var34.field2167, var34.field2165);
                                    } else {
                                        class224.method3903(var12, var13, 0, var34.field2167, var34.field2165);
                                    }
                                }
                                class224.method3860(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2331 == 0) {
                            if (!var10.field2324 && method834(var10) && Statics.field921 != var10) {
                                continue;
                            }
                            if (!var10.field2324) {
                                if (var10.field2234 > var10.field2263 - var10.field2341) {
                                    var10.field2234 = var10.field2263 - var10.field2341;
                                }
                                if (var10.field2234 < 0) {
                                    var10.field2234 = 0;
                                }
                            }
                            method2908(arg0, var10.field2208, var19, var20, var21, var22, var12 - var10.field2229, var13 - var10.field2234, var11);
                            if (var10.field2332 != null) {
                                method2908(var10.field2332, var10.field2208, var19, var20, var21, var22, var12 - var10.field2229, var13 - var10.field2234, var11);
                            }
                            class18 var35 = (class18) field447.method2611((long) var10.field2208);
                            if (var35 != null) {
                                method3787(var35.field179, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class224.method3860(arg2, arg3, arg4, arg5);
                            class85.method1564();
                        }
                        if (field500 || field453[var11] || field383 > 1) {
                            if (var10.field2331 == 0 && !var10.field2324 && var10.field2263 > var10.field2341) {
                                int var36 = var10.field2336 + var12;
                                int var37 = var10.field2234;
                                int var38 = var10.field2341;
                                int var39 = var10.field2263;
                                Statics.field1953[0].method3932(var36, var13);
                                Statics.field1953[1].method3932(var36, var13 + var38 - 16);
                                class224.method3866(var36, var13 + 16, 16, var38 - 32, field361);
                                int var40 = (var38 - 32) * var38 / var39;
                                if (var40 < 8) {
                                    var40 = 8;
                                }
                                int var41 = (var38 - 32 - var40) * var37 / (var39 - var38);
                                class224.method3866(var36, var13 + 16 + var41, 16, var40, field435);
                                class224.method3857(var36, var13 + 16 + var41, var40, field364);
                                class224.method3857(var36 + 1, var13 + 16 + var41, var40, field364);
                                class224.method3874(var36, var13 + 16 + var41, 16, field364);
                                class224.method3874(var36, var13 + 17 + var41, 16, field364);
                                class224.method3857(var36 + 15, var13 + 16 + var41, var40, field363);
                                class224.method3857(var36 + 14, var13 + 17 + var41, var40 - 1, field363);
                                class224.method3874(var36, var13 + 15 + var41 + var40, 16, field363);
                                class224.method3874(var36 + 1, var13 + 14 + var41 + var40, 15, field363);
                            }
                            if (var10.field2331 != 1) {
                                if (var10.field2331 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var10.field2220; var43++) {
                                        for (int var44 = 0; var44 < var10.field2219; var44++) {
                                            int var45 = (var10.field2274 + 32) * var44 + var12;
                                            int var46 = (var10.field2275 + 32) * var43 + var13;
                                            if (var42 < 20) {
                                                var45 += var10.field2224[var42];
                                                var46 += var10.field2277[var42];
                                            }
                                            if (var10.field2326[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var10.field2326[var42] - 1;
                                                if (var45 + 32 > arg2 && var45 < arg4 && var46 + 32 > arg3 && var46 < arg5 || Statics.field1628 == var10 && field489 == var42) {
                                                    class229 var50;
                                                    if (field352 == 1 && Statics.field265 == var42 && Statics.field1172 == var10.field2208) {
                                                        var50 = class204.method2454(var49, var10.field2327[var42], 2, 0, 2, false);
                                                    } else {
                                                        var50 = class204.method2454(var49, var10.field2327[var42], 1, 3153952, 2, false);
                                                    }
                                                    if (var50 == null) {
                                                        method2197(var10);
                                                    } else if (Statics.field1628 == var10 && field489 == var42) {
                                                        int var51 = class116.field1806 - field541;
                                                        int var52 = class116.field1807 - field399;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (field405 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method3987(var45 + var51, var46 + var52, 128);
                                                        if (arg1 != -1) {
                                                            class172 var53 = arg0[arg1 & 0xFFFF];
                                                            if (var46 + var52 < class224.field3212 && var53.field2234 > 0) {
                                                                int var54 = field359 * (class224.field3212 - var46 - var52) / 3;
                                                                if (var54 > field359 * 10) {
                                                                    var54 = field359 * 10;
                                                                }
                                                                if (var54 > var53.field2234) {
                                                                    var54 = var53.field2234;
                                                                }
                                                                var53.field2234 -= var54;
                                                                field399 += var54;
                                                                method2197(var53);
                                                            }
                                                            if (var46 + var52 + 32 > class224.field3214 && var53.field2234 < var53.field2263 - var53.field2341) {
                                                                int var55 = field359 * (var46 + var52 + 32 - class224.field3214) / 3;
                                                                if (var55 > field359 * 10) {
                                                                    var55 = field359 * 10;
                                                                }
                                                                if (var55 > var53.field2263 - var53.field2341 - var53.field2234) {
                                                                    var55 = var53.field2263 - var53.field2341 - var53.field2234;
                                                                }
                                                                var53.field2234 += var55;
                                                                field399 -= var55;
                                                                method2197(var53);
                                                            }
                                                        }
                                                    } else if (Statics.field733 == var10 && field396 == var42) {
                                                        var50.method3987(var45, var46, 128);
                                                    } else {
                                                        var50.method3981(var45, var46);
                                                    }
                                                }
                                            } else if (var10.field2278 != null && var42 < 20) {
                                                class229 var56 = var10.method2995(var42);
                                                if (var56 != null) {
                                                    var56.method3981(var45, var46);
                                                } else if (class172.field2206) {
                                                    method2197(var10);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var10.field2331 == 3) {
                                    int var57;
                                    if (method3064(var10)) {
                                        var57 = var10.field2280;
                                        if (Statics.field921 == var10 && var10.field2236 != 0) {
                                            var57 = var10.field2236;
                                        }
                                    } else {
                                        var57 = var10.field2233;
                                        if (Statics.field921 == var10 && var10.field2235 != 0) {
                                            var57 = var10.field2235;
                                        }
                                    }
                                    if (var10.field2237) {
                                        switch(var10.field2239.field3220) {
                                            case 1:
                                                class224.method3867(var12, var13, var10.field2336, var10.field2341, var10.field2233, var10.field2280, 256 - (var10.field2242 & 0xFF), 256 - (var10.field2249 & 0xFF));
                                                break;
                                            case 2:
                                                class224.method3868(var12, var13, var10.field2336, var10.field2341, var10.field2233, var10.field2280, 256 - (var10.field2242 & 0xFF), 256 - (var10.field2249 & 0xFF));
                                                break;
                                            case 3:
                                                class224.method3869(var12, var13, var10.field2336, var10.field2341, var10.field2233, var10.field2280, 256 - (var10.field2242 & 0xFF), 256 - (var10.field2249 & 0xFF));
                                                break;
                                            case 4:
                                                class224.method3870(var12, var13, var10.field2336, var10.field2341, var10.field2233, var10.field2280, 256 - (var10.field2242 & 0xFF), 256 - (var10.field2249 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class224.method3866(var12, var13, var10.field2336, var10.field2341, var57);
                                                } else {
                                                    class224.method3878(var12, var13, var10.field2336, var10.field2341, var57, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class224.method3872(var12, var13, var10.field2336, var10.field2341, var57);
                                    } else {
                                        class224.method3873(var12, var13, var10.field2336, var10.field2341, var57, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2331 == 4) {
                                    class208 var58 = var10.method2994();
                                    if (var58 != null) {
                                        String var59 = var10.field2268;
                                        int var60;
                                        if (method3064(var10)) {
                                            var60 = var10.field2280;
                                            if (Statics.field921 == var10 && var10.field2236 != 0) {
                                                var60 = var10.field2236;
                                            }
                                            if (var10.field2269.length() > 0) {
                                                var59 = var10.field2269;
                                            }
                                        } else {
                                            var60 = var10.field2233;
                                            if (Statics.field921 == var10 && var10.field2235 != 0) {
                                                var60 = var10.field2235;
                                            }
                                        }
                                        if (var10.field2324 && var10.field2328 != -1) {
                                            class204 var61 = class204.method868(var10.field2328);
                                            var59 = var61.field3022;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field3000 == 1 || var10.field2329 != 1) && var10.field2329 != -1) {
                                                var59 = class38.method3814(16748608) + var59 + class38.field783 + " " + 'x' + method169(var10.field2329);
                                            }
                                        }
                                        if (field450 == var10) {
                                            class176 var10000 = (class176) null;
                                            var59 = class176.field2514;
                                            var60 = var10.field2233;
                                        }
                                        if (!var10.field2324) {
                                            var59 = method2101(var59, var10);
                                        }
                                        var58.method3692(var59, var12, var13, var10.field2336, var10.field2341, var60, var10.field2273 ? 0 : -1, var10.field2271, var10.field2272, var10.field2288);
                                    } else if (class172.field2206) {
                                        method2197(var10);
                                    }
                                } else if (var10.field2331 == 5) {
                                    if (var10.field2324) {
                                        class229 var63;
                                        if (var10.field2328 == -1) {
                                            var63 = var10.method2993(false);
                                        } else {
                                            var63 = class204.method2454(var10.field2328, var10.field2329, var10.field2247, var10.field2248, var10.field2266, false);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field3243;
                                            int var65 = var63.field3244;
                                            if (var10.field2246) {
                                                class224.method3861(var12, var13, var10.field2336 + var12, var10.field2341 + var13);
                                                int var66 = (var10.field2336 + (var64 - 1)) / var64;
                                                int var67 = (var10.field2341 + (var65 - 1)) / var65;
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var10.field2197 != 0) {
                                                            var63.method3978(var64 / 2 + var64 * var68 + var12, var65 / 2 + var65 * var69 + var13, var10.field2197, 4096);
                                                        } else if (var14 == 0) {
                                                            var63.method3981(var64 * var68 + var12, var65 * var69 + var13);
                                                        } else {
                                                            var63.method3987(var64 * var68 + var12, var65 * var69 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class224.method3860(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var70 = var10.field2336 * 4096 / var64;
                                                if (var10.field2197 != 0) {
                                                    var63.method3978(var10.field2336 / 2 + var12, var10.field2341 / 2 + var13, var10.field2197, var70);
                                                } else if (var14 != 0) {
                                                    var63.method3989(var12, var13, var10.field2336, var10.field2341, 256 - (var14 & 0xFF));
                                                } else if (var10.field2336 == var64 && var10.field2341 == var65) {
                                                    var63.method3981(var12, var13);
                                                } else {
                                                    var63.method4030(var12, var13, var10.field2336, var10.field2341);
                                                }
                                            }
                                        } else if (class172.field2206) {
                                            method2197(var10);
                                        }
                                    } else {
                                        class229 var62 = var10.method2993(method3064(var10));
                                        if (var62 != null) {
                                            var62.method3981(var12, var13);
                                        } else if (class172.field2206) {
                                            method2197(var10);
                                        }
                                    }
                                } else if (var10.field2331 == 6) {
                                    boolean var71 = method3064(var10);
                                    int var72;
                                    if (var71) {
                                        var72 = var10.field2256;
                                    } else {
                                        var72 = var10.field2255;
                                    }
                                    class83 var73 = null;
                                    int var74 = 0;
                                    if (var10.field2328 != -1) {
                                        class204 var75 = class204.method868(var10.field2328);
                                        if (var75 != null) {
                                            class204 var76 = var75.method3531(var10.field2329);
                                            var73 = var76.method3530(1);
                                            if (var73 == null) {
                                                method2197(var10);
                                            } else {
                                                var73.method1489();
                                                var74 = var73.field1532 / 2;
                                            }
                                        }
                                    } else if (var10.field2251 == 5) {
                                        if (var10.field2232 == 0) {
                                            var73 = field560.method2972((class207) null, -1, (class207) null, -1);
                                        } else {
                                            var73 = Statics.field233.method230();
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var10.method2996((class207) null, -1, var71, Statics.field233.field237);
                                        if (var73 == null && class172.field2206) {
                                            method2197(var10);
                                        }
                                    } else {
                                        class207 var77 = class207.method3621(var72);
                                        var73 = var10.method2996(var77, var10.field2330, var71, Statics.field233.field237);
                                        if (var73 == null && class172.field2206) {
                                            method2197(var10);
                                        }
                                    }
                                    class85.method1567(var10.field2336 / 2 + var12, var10.field2341 / 2 + var13);
                                    int var78 = var10.field2245 * class85.field1434[var10.field2264] >> 16;
                                    int var79 = var10.field2245 * class85.field1442[var10.field2264] >> 16;
                                    if (var73 != null) {
                                        if (var10.field2324) {
                                            var73.method1489();
                                            if (var10.field2231) {
                                                var73.method1504(0, var10.field2300, var10.field2313, var10.field2264, var10.field2257, var10.field2258 + var74 + var78, var10.field2258 + var79, var10.field2245);
                                            } else {
                                                var73.method1501(0, var10.field2300, var10.field2313, var10.field2264, var10.field2257, var10.field2258 + var74 + var78, var10.field2258 + var79);
                                            }
                                        } else {
                                            var73.method1501(0, var10.field2300, 0, var10.field2264, 0, var78, var79);
                                        }
                                    }
                                    class85.method1595();
                                } else {
                                    if (var10.field2331 == 7) {
                                        class208 var80 = var10.method2994();
                                        if (var80 == null) {
                                            if (class172.field2206) {
                                                method2197(var10);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var10.field2220; var82++) {
                                            for (int var83 = 0; var83 < var10.field2219; var83++) {
                                                if (var10.field2326[var81] > 0) {
                                                    class204 var84 = class204.method868(var10.field2326[var81] - 1);
                                                    String var85;
                                                    if (var84.field3000 != 1 && var10.field2327[var81] == 1) {
                                                        var85 = class38.method3814(16748608) + var84.field3022 + class38.field783;
                                                    } else {
                                                        var85 = class38.method3814(16748608) + var84.field3022 + class38.field783 + " " + 'x' + method169(var10.field2327[var81]);
                                                    }
                                                    int var86 = (var10.field2274 + 115) * var83 + var12;
                                                    int var87 = (var10.field2275 + 12) * var82 + var13;
                                                    if (var10.field2271 == 0) {
                                                        var80.method3701(var85, var86, var87, var10.field2233, var10.field2273 ? 0 : -1);
                                                    } else if (var10.field2271 == 1) {
                                                        var80.method3724(var85, var10.field2336 / 2 + var86, var87, var10.field2233, var10.field2273 ? 0 : -1);
                                                    } else {
                                                        var80.method3703(var85, var10.field2336 + var86 - 1, var87, var10.field2233, var10.field2273 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var10.field2331 == 8 && Statics.field143 == var10 && field438 == field437) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class208 var90 = Statics.field1543;
                                        String var91 = var10.field2268;
                                        String var92 = method2101(var91, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class38.field781);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            int var95 = var90.method3691(var94);
                                            if (var95 > var88) {
                                                var88 = var95;
                                            }
                                            var89 += var90.field3112 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var96 = var10.field2336 + var12 - 5 - var88;
                                        int var97 = var10.field2341 + var13 + 5;
                                        if (var96 < var12 + 5) {
                                            var96 = var12 + 5;
                                        }
                                        if (var88 + var96 > arg4) {
                                            var96 = arg4 - var88;
                                        }
                                        if (var89 + var97 > arg5) {
                                            var97 = arg5 - var89;
                                        }
                                        class224.method3866(var96, var97, var88, var89, 16777120);
                                        class224.method3872(var96, var97, var88, var89, 0);
                                        String var98 = var10.field2268;
                                        int var99 = var90.field3112 + var97 + 2;
                                        String var100 = method2101(var98, var10);
                                        while (var100.length() > 0) {
                                            int var101 = var100.indexOf(class38.field781);
                                            String var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = "";
                                            } else {
                                                var102 = var100.substring(0, var101);
                                                var100 = var100.substring(var101 + 4);
                                            }
                                            var90.method3701(var102, var96 + 3, var99, 0, -1);
                                            var99 += var90.field3112 + 1;
                                        }
                                    }
                                    if (var10.field2331 == 9) {
                                        if (var10.field2283 == 1) {
                                            int var103;
                                            int var104;
                                            int var105;
                                            int var106;
                                            if (var10.field2226) {
                                                var103 = var12;
                                                var104 = var10.field2341 + var13;
                                                var105 = var10.field2336 + var12;
                                                var106 = var13;
                                            } else {
                                                var103 = var12;
                                                var104 = var13;
                                                var105 = var10.field2336 + var12;
                                                var106 = var10.field2341 + var13;
                                            }
                                            class224.method3864(var103, var104, var105, var106, var10.field2233);
                                        } else {
                                            int var107 = var10.field2336 >= 0 ? var10.field2336 : -var10.field2336;
                                            int var108 = var10.field2341 >= 0 ? var10.field2341 : -var10.field2341;
                                            int var109 = var107;
                                            if (var107 < var108) {
                                                var109 = var108;
                                            }
                                            if (var109 != 0) {
                                                int var110 = (var10.field2336 << 16) / var109;
                                                int var111 = (var10.field2341 << 16) / var109;
                                                if (var111 <= var110) {
                                                    var110 = -var110;
                                                } else {
                                                    var111 = -var111;
                                                }
                                                int var112 = var10.field2283 * var111 >> 17;
                                                int var113 = var10.field2283 * var111 + 1 >> 17;
                                                int var114 = var10.field2283 * var110 >> 17;
                                                int var115 = var10.field2283 * var110 + 1 >> 17;
                                                int var116 = var12 + var112;
                                                int var117 = var12 - var113;
                                                int var118 = var10.field2336 + var12 - var113;
                                                int var119 = var10.field2336 + var12 + var112;
                                                int var120 = var13 + var114;
                                                int var121 = var13 - var115;
                                                int var122 = var10.field2341 + var13 - var115;
                                                int var123 = var10.field2341 + var13 + var114;
                                                class85.method1572(var116, var117, var118);
                                                class85.method1575(var120, var121, var122, var116, var117, var118, var10.field2233);
                                                class85.method1572(var116, var118, var119);
                                                class85.method1575(var120, var122, var123, var116, var118, var119, var10.field2233);
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

    @ObfuscatedName("dj.ci(Ljava/lang/String;Lfc;B)Ljava/lang/String;")
    public static String method2101(String arg0, class172 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + Statics.method3078(method29(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2 != null) {
                    var5 = class215.method1876(Statics.field2.field1656);
                    if (Statics.field2.field1658 != null) {
                        var5 = (String) Statics.field2.field1658;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("r.co(II)Ljava/lang/String;")
    public static final String method169(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field776 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method3814(65408) + var1.substring(0, var1.length() - 8) + class176.field2538 + " " + class38.field782 + var1 + class38.field779 + class38.field783;
        } else if (var1.length() > 6) {
            return " " + class38.method3814(16777215) + var1.substring(0, var1.length() - 4) + class176.field2519 + " " + class38.field782 + var1 + class38.field779 + class38.field783;
        } else {
            return " " + class38.method3814(16776960) + var1 + class38.field783;
        }
    }

    @ObfuscatedName("e.cv(ZI)V")
    public static final void method189(boolean arg0) {
        int var1 = field446;
        int var2 = Statics.field2761;
        int var3 = Statics.field2727;
        if (class172.method1982(var1)) {
            method1391(Statics.field1985[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("ba.cp(Lfc;B)V")
    public static void method1356(class172 arg0) {
        class172 var1 = arg0.field2227 == -1 ? null : class172.method2211(arg0.field2227);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2761;
            var3 = Statics.field2727;
        } else {
            var2 = var1.field2336;
            var3 = var1.field2341;
        }
        method64(arg0, var2, var3, false);
        method2847(arg0, var2, var3);
    }

    @ObfuscatedName("fi.ca([Lfc;Lfc;ZI)V")
    public static void method2917(class172[] arg0, class172 arg1, boolean arg2) {
        int var3 = arg1.field2241 == 0 ? arg1.field2336 : arg1.field2241;
        int var4 = arg1.field2263 == 0 ? arg1.field2341 : arg1.field2263;
        method1391(arg0, arg1.field2208, var3, var4, arg2);
        if (arg1.field2332 != null) {
            method1391(arg1.field2332, arg1.field2208, var3, var4, arg2);
        }
        class18 var5 = (class18) field447.method2611((long) arg1.field2208);
        if (var5 != null) {
            int var6 = var5.field179;
            if (class172.method1982(var6)) {
                method1391(Statics.field1985[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2212 == 1337) {
        }
    }

    @ObfuscatedName("bz.cd([Lfc;IIIZB)V")
    public static void method1391(class172[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class172 var6 = arg0[var5];
            if (var6 != null && var6.field2227 == arg1) {
                method64(var6, arg2, arg3, arg4);
                method2847(var6, arg2, arg3);
                if (var6.field2229 > var6.field2241 - var6.field2336) {
                    var6.field2229 = var6.field2241 - var6.field2336;
                }
                if (var6.field2229 < 0) {
                    var6.field2229 = 0;
                }
                if (var6.field2234 > var6.field2263 - var6.field2341) {
                    var6.field2234 = var6.field2263 - var6.field2341;
                }
                if (var6.field2234 < 0) {
                    var6.field2234 = 0;
                }
                if (var6.field2331 == 0) {
                    method2917(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("p.cw(Lfc;IIZI)V")
    public static void method64(class172 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2336;
        int var5 = arg0.field2341;
        if (arg0.field2281 == 0) {
            arg0.field2336 = arg0.field2219;
        } else if (arg0.field2281 == 1) {
            arg0.field2336 = arg1 - arg0.field2219;
        } else if (arg0.field2281 == 2) {
            arg0.field2336 = arg0.field2219 * arg1 >> 14;
        }
        if (arg0.field2216 == 0) {
            arg0.field2341 = arg0.field2220;
        } else if (arg0.field2216 == 1) {
            arg0.field2341 = arg2 - arg0.field2220;
        } else if (arg0.field2216 == 2) {
            arg0.field2341 = arg0.field2220 * arg2 >> 14;
        }
        if (arg0.field2281 == 4) {
            arg0.field2336 = arg0.field2341 * arg0.field2339 / arg0.field2342;
        }
        if (arg0.field2216 == 4) {
            arg0.field2341 = arg0.field2342 * arg0.field2336 / arg0.field2339;
        }
        if (field456 && arg0.field2331 == 0) {
            if (arg0.field2341 < 5 && arg0.field2336 < 5) {
                arg0.field2341 = 5;
                arg0.field2336 = 5;
            } else {
                if (arg0.field2341 <= 0) {
                    arg0.field2341 = 5;
                }
                if (arg0.field2336 <= 0) {
                    arg0.field2336 = 5;
                }
            }
        }
        if (arg0.field2212 == 1337) {
            field458 = arg0;
        }
        if (arg3 && arg0.field2317 != null && (arg0.field2336 != var4 || arg0.field2341 != var5)) {
            class19 var6 = new class19();
            var6.field190 = arg0;
            var6.field197 = arg0.field2317;
            field485.method2662(var6);
        }
    }

    @ObfuscatedName("fd.ch(Lfc;IIB)V")
    public static void method2847(class172 arg0, int arg1, int arg2) {
        if (arg0.field2213 == 0) {
            arg0.field2320 = arg0.field2217;
        } else if (arg0.field2213 == 1) {
            arg0.field2320 = (arg1 - arg0.field2336) / 2 + arg0.field2217;
        } else if (arg0.field2213 == 2) {
            arg0.field2320 = arg1 - arg0.field2336 - arg0.field2217;
        } else if (arg0.field2213 == 3) {
            arg0.field2320 = arg0.field2217 * arg1 >> 14;
        } else if (arg0.field2213 == 4) {
            arg0.field2320 = (arg0.field2217 * arg1 >> 14) + (arg1 - arg0.field2336) / 2;
        } else {
            arg0.field2320 = arg1 - arg0.field2336 - (arg0.field2217 * arg1 >> 14);
        }
        if (arg0.field2207 == 0) {
            arg0.field2222 = arg0.field2218;
        } else if (arg0.field2207 == 1) {
            arg0.field2222 = (arg2 - arg0.field2341) / 2 + arg0.field2218;
        } else if (arg0.field2207 == 2) {
            arg0.field2222 = arg2 - arg0.field2341 - arg0.field2218;
        } else if (arg0.field2207 == 3) {
            arg0.field2222 = arg0.field2218 * arg2 >> 14;
        } else if (arg0.field2207 == 4) {
            arg0.field2222 = (arg0.field2218 * arg2 >> 14) + (arg2 - arg0.field2341) / 2;
        } else {
            arg0.field2222 = arg2 - arg0.field2341 - (arg0.field2218 * arg2 >> 14);
        }
        if (!field456 || arg0.field2331 != 0) {
            return;
        }
        if (arg0.field2320 < 0) {
            arg0.field2320 = 0;
        } else if (arg0.field2336 + arg0.field2320 > arg1) {
            arg0.field2320 = arg1 - arg0.field2336;
        }
        if (arg0.field2222 < 0) {
            arg0.field2222 = 0;
        } else if (arg0.field2341 + arg0.field2222 > arg2) {
            arg0.field2222 = arg2 - arg0.field2341;
        }
    }

    @ObfuscatedName("di.dg(Lfc;IIIIIII)V")
    public static final void method2133(class172 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field283) {
            field366 = 32;
        } else {
            field366 = 0;
        }
        field283 = false;
        if (class116.field1800 == 1 || !Statics.field663 && class116.field1800 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2234 -= 4;
                method2197(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2234 += 4;
                method2197(arg0);
            } else if (arg5 >= arg1 - field366 && arg5 < field366 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2234 = (arg4 - arg3) * var8 / var9;
                method2197(arg0);
                field283 = true;
            }
        }
        if (field484 == 0) {
            return;
        }
        int var10 = arg0.field2336;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2234 += field484 * 45;
            method2197(arg0);
        }
    }

    @ObfuscatedName("fm.dl(Lfc;I)Z")
    public static final boolean method3064(class172 arg0) {
        if (arg0.field2321 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2321.length; var1++) {
            int var2 = method29(arg0, var1);
            int var3 = arg0.field2322[var1];
            if (arg0.field2321[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2321[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2321[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("q.dk(Lfc;IB)I")
    public static final int method29(class172 arg0, int arg1) {
        if (arg0.field2325 == null || arg1 >= arg0.field2325.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2325[arg1];
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
                    var7 = field419[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field420[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field421[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class172 var11 = class172.method2211(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class204.method868(var12).field3002 || field285)) {
                        for (int var13 = 0; var13 < var11.field2326.length; var13++) {
                            if (var12 + 1 == var11.field2326[var13]) {
                                var7 += var11.field2327[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class168.field2174[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class175.field2356[field420[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class168.field2174[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field233.field241;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class175.field2355[var14]) {
                            var7 += field420[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class172 var17 = class172.method2211(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class204.method868(var18).field3002 || field285)) {
                        for (int var19 = 0; var19 < var17.field2326.length; var19++) {
                            if (var18 + 1 == var17.field2326[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field451;
                }
                if (var6 == 12) {
                    var7 = field452;
                }
                if (var6 == 13) {
                    int var20 = class168.field2174[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class168.method1112(var22);
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
                    var7 = (Statics.field233.field629 >> 7) + Statics.field1726;
                }
                if (var6 == 19) {
                    var7 = (Statics.field233.field601 >> 7) + Statics.field1776;
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

    @ObfuscatedName("dd.do(Lfc;III)V")
    public static final void method2212(class172 arg0, int arg1, int arg2) {
        if (arg0.field2211 == 1) {
            method1107(arg0.field2314, "", 24, 0, 0, arg0.field2208);
        }
        if (arg0.field2211 == 2 && !field441) {
            String var3;
            if (Statics.method3327(method1872(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2287 == null || arg0.field2287.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2287;
            }
            if (var3 != null) {
                method1107(var3, class38.method3814(65280) + arg0.field2214, 25, 0, -1, arg0.field2208);
            }
        }
        if (arg0.field2211 == 3) {
            method1107(class176.field2515, "", 26, 0, 0, arg0.field2208);
        }
        if (arg0.field2211 == 4) {
            method1107(arg0.field2314, "", 28, 0, 0, arg0.field2208);
        }
        if (arg0.field2211 == 5) {
            method1107(arg0.field2314, "", 29, 0, 0, arg0.field2208);
        }
        if (arg0.field2211 == 6 && field450 == null) {
            method1107(arg0.field2314, "", 30, 0, -1, arg0.field2208);
        }
        if (arg0.field2331 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2341; var6++) {
                for (int var7 = 0; var7 < arg0.field2336; var7++) {
                    int var8 = (arg0.field2274 + 32) * var7;
                    int var9 = (arg0.field2275 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2224[var5];
                        var9 += arg0.field2277[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field400 = var5;
                        Statics.field84 = arg0;
                        if (arg0.field2326[var5] > 0) {
                            class204 var10 = class204.method868(arg0.field2326[var5] - 1);
                            if (field352 == 1 && class173.method173(method1872(arg0))) {
                                if (Statics.field1172 != arg0.field2208 || Statics.field265 != var5) {
                                    method1107(class176.field2506, field440 + " " + class38.field780 + " " + class38.method3814(16748608) + var10.field3022, 31, var10.field3016, var5, arg0.field2208);
                                }
                            } else if (!field441 || !class173.method173(method1872(arg0))) {
                                String[] var11 = var10.field3004;
                                if (field457) {
                                    var11 = method2125(var11);
                                }
                                int var12 = var10.method3563();
                                if (class173.method173(method1872(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        boolean var14 = var12 == var13;
                                        if (var11 != null && var11[var13] != null) {
                                            byte var15;
                                            if (var13 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            Statics.method739(var11[var13], class38.method3814(16748608) + var10.field3022, var15, var10.field3016, var5, arg0.field2208, var14);
                                        } else if (var13 == 4) {
                                            Statics.method739(class176.field2360, class38.method3814(16748608) + var10.field3022, 37, var10.field3016, var5, arg0.field2208, var14);
                                        }
                                    }
                                }
                                if (class173.method649(method1872(arg0))) {
                                    method1107(class176.field2506, class38.method3814(16748608) + var10.field3022, 38, var10.field3016, var5, arg0.field2208);
                                }
                                if (class173.method173(method1872(arg0)) && var11 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        boolean var17 = var12 == var16;
                                        if (var11[var16] != null) {
                                            byte var18 = 0;
                                            if (var16 == 0) {
                                                var18 = 33;
                                            }
                                            if (var16 == 1) {
                                                var18 = 34;
                                            }
                                            if (var16 == 2) {
                                                var18 = 35;
                                            }
                                            Statics.method739(var11[var16], class38.method3814(16748608) + var10.field3022, var18, var10.field3016, var5, arg0.field2208, var17);
                                        }
                                    }
                                }
                                String[] var19 = arg0.field2279;
                                if (field457) {
                                    var19 = method2125(var19);
                                }
                                if (var19 != null) {
                                    for (int var20 = 4; var20 >= 0; var20--) {
                                        if (var19[var20] != null) {
                                            byte var21 = 0;
                                            if (var20 == 0) {
                                                var21 = 39;
                                            }
                                            if (var20 == 1) {
                                                var21 = 40;
                                            }
                                            if (var20 == 2) {
                                                var21 = 41;
                                            }
                                            if (var20 == 3) {
                                                var21 = 42;
                                            }
                                            if (var20 == 4) {
                                                var21 = 43;
                                            }
                                            method1107(var19[var20], class38.method3814(16748608) + var10.field3022, var21, var10.field3016, var5, arg0.field2208);
                                        }
                                    }
                                }
                                method1107(class176.field2507, class38.method3814(16748608) + var10.field3022, 1005, var10.field3016, var5, arg0.field2208);
                            } else if ((Statics.field2072 & 0x10) == 16) {
                                method1107(field439, field393 + " " + class38.field780 + " " + class38.method3814(16748608) + var10.field3022, 32, var10.field3016, var5, arg0.field2208);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2324) {
            return;
        }
        if (!field441) {
            for (int var22 = 9; var22 >= 5; var22--) {
                String var23 = method3082(arg0, var22);
                if (var23 != null) {
                    method1107(var23, arg0.field2260, 1007, var22 + 1, arg0.field2209, arg0.field2208);
                }
            }
            String var24;
            if (Statics.method3327(method1872(arg0)) == 0) {
                var24 = null;
            } else if (arg0.field2287 == null || arg0.field2287.trim().length() == 0) {
                var24 = null;
            } else {
                var24 = arg0.field2287;
            }
            if (var24 != null) {
                method1107(var24, arg0.field2260, 25, 0, arg0.field2209, arg0.field2208);
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                String var27 = method3082(arg0, var26);
                if (var27 != null) {
                    method1107(var27, arg0.field2260, 57, var26 + 1, arg0.field2209, arg0.field2208);
                }
            }
            int var28 = method1872(arg0);
            boolean var29 = (var28 & 0x1) != 0;
            if (var29) {
                method1107(class176.field2364, "", 30, 0, arg0.field2209, arg0.field2208);
            }
        } else if (class173.method1820(method1872(arg0)) && (Statics.field2072 & 0x20) == 32) {
            method1107(field439, field393 + " " + class38.field780 + " " + arg0.field2260, 58, 0, arg0.field2209, arg0.field2208);
        }
    }

    @ObfuscatedName("z.dy(IIIIIIII)V")
    public static final void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class172.method1982(arg0)) {
            method2466(Statics.field1985[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("em.dx([Lfc;IIIIIIII)V")
    public static final void method2466(class172[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class172 var9 = arg0[var8];
            if (var9 != null && (!var9.field2324 || var9.field2331 == 0 || var9.field2286 || method1872(var9) != 0 || field497 == var9 || var9.field2212 == 1338) && var9.field2227 == arg1 && (!var9.field2324 || !method834(var9))) {
                int var10 = var9.field2320 + arg6;
                int var11 = var9.field2222 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2331 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2331 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2336 + var10;
                    int var19 = var9.field2341 + var11;
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
                    int var22 = var9.field2336 + var10;
                    int var23 = var9.field2341 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field459 == var9) {
                    field377 = true;
                    field468 = var10;
                    field398 = var11;
                }
                if (!var9.field2324 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1806;
                    int var25 = class116.field1807;
                    if (class116.field1812 != 0) {
                        var24 = class116.field1803;
                        var25 = class116.field1814;
                    }
                    if (var9.field2212 == 1337) {
                        if (!field290 && !field423 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1808(var24, var25, var12, var13);
                        }
                    } else if (var9.field2212 == 1338) {
                        method2042(var9, var10, var11);
                    } else {
                        if (!field423 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2212(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2331 == 0) {
                            if (!var9.field2324 && method834(var9) && Statics.field921 != var9) {
                                continue;
                            }
                            method2466(arg0, var9.field2208, var12, var13, var14, var15, var10 - var9.field2229, var11 - var9.field2234);
                            if (var9.field2332 != null) {
                                method2466(var9.field2332, var9.field2208, var12, var13, var14, var15, var10 - var9.field2229, var11 - var9.field2234);
                            }
                            class18 var26 = (class18) field447.method2611((long) var9.field2208);
                            if (var26 != null) {
                                if (var26.field180 == 0 && class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15 && !field423 && !field456) {
                                    for (class19 var27 = (class19) field485.method2666(); var27 != null; var27 = (class19) field485.method2668()) {
                                        if (var27.field189) {
                                            var27.method2652();
                                            var27.field190.field2333 = false;
                                        }
                                    }
                                    if (Statics.field1639 == 0) {
                                        field459 = null;
                                        field497 = null;
                                    }
                                    if (!field423) {
                                        method2143();
                                    }
                                }
                                method102(var26.field179, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2324) {
                            if (var9.field2276) {
                                if (class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                    for (class19 var28 = (class19) field485.method2666(); var28 != null; var28 = (class19) field485.method2668()) {
                                        if (var28.field189) {
                                            var28.method2652();
                                            var28.field190.field2333 = false;
                                        }
                                    }
                                    if (Statics.field1639 == 0) {
                                        field459 = null;
                                        field497 = null;
                                    }
                                    if (!field423) {
                                        field388[0] = class176.field2532;
                                        field430[0] = "";
                                        field427[0] = 1006;
                                        field424 = 1;
                                    }
                                }
                            } else if (var9.field2204 && class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                for (class19 var29 = (class19) field485.method2666(); var29 != null; var29 = (class19) field485.method2668()) {
                                    if (var29.field189 && var29.field190.field2309 == var29.field197) {
                                        var29.method2652();
                                    }
                                }
                            }
                            boolean var30;
                            if (class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                var30 = true;
                            } else {
                                var30 = false;
                            }
                            boolean var31 = false;
                            if ((class116.field1800 == 1 || !Statics.field663 && class116.field1800 == 4) && var30) {
                                var31 = true;
                            }
                            boolean var32 = false;
                            if ((class116.field1812 == 1 || !Statics.field663 && class116.field1812 == 4) && class116.field1803 >= var12 && class116.field1814 >= var13 && class116.field1803 < var14 && class116.field1814 < var15) {
                                var32 = true;
                            }
                            if (var32) {
                                method893(var9, class116.field1803 - var10, class116.field1814 - var11);
                            }
                            if (field459 != null && field459 != var9 && var30 && class173.method3042(method1872(var9))) {
                                field463 = var9;
                            }
                            if (field497 == var9) {
                                field464 = true;
                                field381 = var10;
                                field466 = var11;
                            }
                            if (var9.field2286) {
                                if (var30 && field484 != 0 && var9.field2309 != null) {
                                    class19 var33 = new class19();
                                    var33.field189 = true;
                                    var33.field190 = var9;
                                    var33.field188 = field484;
                                    var33.field197 = var9.field2309;
                                    field485.method2662(var33);
                                }
                                if (field459 != null || Statics.field1628 != null || field423) {
                                    var32 = false;
                                    var31 = false;
                                    var30 = false;
                                }
                                if (!var9.field2334 && var32) {
                                    var9.field2334 = true;
                                    if (var9.field2290 != null) {
                                        class19 var34 = new class19();
                                        var34.field189 = true;
                                        var34.field190 = var9;
                                        var34.field194 = class116.field1803 - var10;
                                        var34.field188 = class116.field1814 - var11;
                                        var34.field197 = var9.field2290;
                                        field485.method2662(var34);
                                    }
                                }
                                if (var9.field2334 && var31 && var9.field2210 != null) {
                                    class19 var35 = new class19();
                                    var35.field189 = true;
                                    var35.field190 = var9;
                                    var35.field194 = class116.field1806 - var10;
                                    var35.field188 = class116.field1807 - var11;
                                    var35.field197 = var9.field2210;
                                    field485.method2662(var35);
                                }
                                if (var9.field2334 && !var31) {
                                    var9.field2334 = false;
                                    if (var9.field2303 != null) {
                                        class19 var36 = new class19();
                                        var36.field189 = true;
                                        var36.field190 = var9;
                                        var36.field194 = class116.field1806 - var10;
                                        var36.field188 = class116.field1807 - var11;
                                        var36.field197 = var9.field2303;
                                        field487.method2662(var36);
                                    }
                                }
                                if (var31 && var9.field2293 != null) {
                                    class19 var37 = new class19();
                                    var37.field189 = true;
                                    var37.field190 = var9;
                                    var37.field194 = class116.field1806 - var10;
                                    var37.field188 = class116.field1807 - var11;
                                    var37.field197 = var9.field2293;
                                    field485.method2662(var37);
                                }
                                if (!var9.field2333 && var30) {
                                    var9.field2333 = true;
                                    if (var9.field2294 != null) {
                                        class19 var38 = new class19();
                                        var38.field189 = true;
                                        var38.field190 = var9;
                                        var38.field194 = class116.field1806 - var10;
                                        var38.field188 = class116.field1807 - var11;
                                        var38.field197 = var9.field2294;
                                        field485.method2662(var38);
                                    }
                                }
                                if (var9.field2333 && var30 && var9.field2295 != null) {
                                    class19 var39 = new class19();
                                    var39.field189 = true;
                                    var39.field190 = var9;
                                    var39.field194 = class116.field1806 - var10;
                                    var39.field188 = class116.field1807 - var11;
                                    var39.field197 = var9.field2295;
                                    field485.method2662(var39);
                                }
                                if (var9.field2333 && !var30) {
                                    var9.field2333 = false;
                                    if (var9.field2296 != null) {
                                        class19 var40 = new class19();
                                        var40.field189 = true;
                                        var40.field190 = var9;
                                        var40.field194 = class116.field1806 - var10;
                                        var40.field188 = class116.field1807 - var11;
                                        var40.field197 = var9.field2296;
                                        field487.method2662(var40);
                                    }
                                }
                                if (var9.field2307 != null) {
                                    class19 var41 = new class19();
                                    var41.field190 = var9;
                                    var41.field197 = var9.field2307;
                                    field477.method2662(var41);
                                }
                                if (var9.field2301 != null && field444 > var9.field2230) {
                                    if (var9.field2302 == null || field444 - var9.field2230 > 32) {
                                        class19 var46 = new class19();
                                        var46.field190 = var9;
                                        var46.field197 = var9.field2301;
                                        field485.method2662(var46);
                                    } else {
                                        label495: for (int var42 = var9.field2230; var42 < field444; var42++) {
                                            int var43 = field472[var42 & 0x1F];
                                            for (int var44 = 0; var44 < var9.field2302.length; var44++) {
                                                if (var9.field2302[var44] == var43) {
                                                    class19 var45 = new class19();
                                                    var45.field190 = var9;
                                                    var45.field197 = var9.field2301;
                                                    field485.method2662(var45);
                                                    break label495;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2230 = field444;
                                }
                                if (var9.field2270 != null && field475 > var9.field2337) {
                                    if (var9.field2265 == null || field475 - var9.field2337 > 32) {
                                        class19 var51 = new class19();
                                        var51.field190 = var9;
                                        var51.field197 = var9.field2270;
                                        field485.method2662(var51);
                                    } else {
                                        label471: for (int var47 = var9.field2337; var47 < field475; var47++) {
                                            int var48 = field454[var47 & 0x1F];
                                            for (int var49 = 0; var49 < var9.field2265.length; var49++) {
                                                if (var9.field2265[var49] == var48) {
                                                    class19 var50 = new class19();
                                                    var50.field190 = var9;
                                                    var50.field197 = var9.field2270;
                                                    field485.method2662(var50);
                                                    break label471;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2337 = field475;
                                }
                                if (var9.field2305 != null && field365 > var9.field2338) {
                                    if (var9.field2306 == null || field365 - var9.field2338 > 32) {
                                        class19 var56 = new class19();
                                        var56.field190 = var9;
                                        var56.field197 = var9.field2305;
                                        field485.method2662(var56);
                                    } else {
                                        label447: for (int var52 = var9.field2338; var52 < field365; var52++) {
                                            int var53 = field476[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2306.length; var54++) {
                                                if (var9.field2306[var54] == var53) {
                                                    class19 var55 = new class19();
                                                    var55.field190 = var9;
                                                    var55.field197 = var9.field2305;
                                                    field485.method2662(var55);
                                                    break label447;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2338 = field365;
                                }
                                if (field478 > var9.field2201 && var9.field2310 != null) {
                                    class19 var57 = new class19();
                                    var57.field190 = var9;
                                    var57.field197 = var9.field2310;
                                    field485.method2662(var57);
                                }
                                if (field479 > var9.field2201 && var9.field2312 != null) {
                                    class19 var58 = new class19();
                                    var58.field190 = var9;
                                    var58.field197 = var9.field2312;
                                    field485.method2662(var58);
                                }
                                if (field480 > var9.field2201 && var9.field2318 != null) {
                                    class19 var59 = new class19();
                                    var59.field190 = var9;
                                    var59.field197 = var9.field2318;
                                    field485.method2662(var59);
                                }
                                if (field481 > var9.field2201 && var9.field2223 != null) {
                                    class19 var60 = new class19();
                                    var60.field190 = var9;
                                    var60.field197 = var9.field2223;
                                    field485.method2662(var60);
                                }
                                if (field482 > var9.field2201 && var9.field2319 != null) {
                                    class19 var61 = new class19();
                                    var61.field190 = var9;
                                    var61.field197 = var9.field2319;
                                    field485.method2662(var61);
                                }
                                if (field483 > var9.field2201 && var9.field2221 != null) {
                                    class19 var62 = new class19();
                                    var62.field190 = var9;
                                    var62.field197 = var9.field2221;
                                    field485.method2662(var62);
                                }
                                var9.field2201 = field312;
                                if (var9.field2311 != null) {
                                    for (int var63 = 0; var63 < field509; var63++) {
                                        class19 var64 = new class19();
                                        var64.field190 = var9;
                                        var64.field192 = field511[var63];
                                        var64.field199 = field445[var63];
                                        var64.field197 = var9.field2311;
                                        field485.method2662(var64);
                                    }
                                }
                            }
                        }
                        if (!var9.field2324 && field459 == null && Statics.field1628 == null && !field423) {
                            if ((var9.field2323 >= 0 || var9.field2235 != 0) && class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                if (var9.field2323 >= 0) {
                                    Statics.field921 = arg0[var9.field2323];
                                } else {
                                    Statics.field921 = var9;
                                }
                            }
                            if (var9.field2331 == 8 && class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                Statics.field143 = var9;
                            }
                            if (var9.field2263 > var9.field2341) {
                                method2133(var9, var9.field2336 + var10, var11, var9.field2341, var9.field2263, class116.field1806, class116.field1807);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.dq(IIB)V")
    public static final void method573(int arg0, int arg1) {
        if (class172.method1982(arg0)) {
            method1360(Statics.field1985[arg0], arg1);
        }
    }

    @ObfuscatedName("ba.dp([Lfc;II)V")
    public static final void method1360(class172[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class172 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2331 == 0) {
                    if (var3.field2332 != null) {
                        method1360(var3.field2332, arg1);
                    }
                    class18 var4 = (class18) field447.method2611((long) var3.field2208);
                    if (var4 != null) {
                        method573(var4.field179, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2315 != null) {
                    class19 var5 = new class19();
                    var5.field190 = var3;
                    var5.field197 = var3.field2315;
                    class33.method887(var5, 200000);
                }
                if (arg1 == 1 && var3.field2316 != null) {
                    if (var3.field2209 >= 0) {
                        class172 var6 = class172.method2211(var3.field2208);
                        if (var6 == null || var6.field2332 == null || var3.field2209 >= var6.field2332.length || var6.field2332[var3.field2209] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field190 = var3;
                    var7.field197 = var3.field2316;
                    class33.method887(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("ah.df(Lfc;III)V")
    public static final void method893(class172 arg0, int arg1, int arg2) {
        if (field459 != null || field423 || arg0 == null || method1144(arg0) == null) {
            return;
        }
        field459 = arg0;
        field497 = method1144(arg0);
        field493 = arg1;
        field462 = arg2;
        Statics.field1639 = 0;
        field470 = false;
        int var3 = method2062();
        if (var3 != -1) {
            method1945(var3);
        }
    }

    @ObfuscatedName("dy.dw(IS)V")
    public static void method1945(int arg0) {
        Statics.field488 = new class39();
        Statics.field488.field789 = field425[arg0];
        Statics.field488.field787 = field339[arg0];
        Statics.field488.field786 = field427[arg0];
        Statics.field488.field788 = field524[arg0];
        Statics.field488.field785 = field388[arg0];
    }

    @ObfuscatedName("cz.dh(III)V")
    public static void method1631(int arg0, int arg1) {
        class39 var2 = Statics.field488;
        method1832(var2.field789, var2.field787, var2.field786, var2.field788, var2.field785, var2.field785, arg0, arg1);
        Statics.field488 = null;
    }

    @ObfuscatedName("dm.ds(Lfc;I)V")
    public static void method2197(class172 arg0) {
        if (field386 == arg0.field2340) {
            field369[arg0.field2292] = true;
        }
    }

    @ObfuscatedName("bb.di(Lfc;B)Lfc;")
    public static class172 method1144(class172 arg0) {
        class172 var1 = method1911(arg0);
        if (var1 == null) {
            var1 = arg0.field2253;
        }
        return var1;
    }

    @ObfuscatedName("dj.da([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2125(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cp.dv(II)V")
    public static final void method1830(int arg0) {
        if (!class172.method1982(arg0)) {
            return;
        }
        class172[] var1 = Statics.field1985[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class172 var3 = var1[var2];
            if (var3 != null) {
                var3.field2330 = 0;
                var3.field2215 = 0;
            }
        }
    }

    @ObfuscatedName("cz.dc([Lfc;IS)V")
    public static final void method1630(class172[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class172 var3 = arg0[var2];
            if (var3 != null && var3.field2227 == arg1 && (!var3.field2324 || !method834(var3))) {
                if (var3.field2331 == 0) {
                    if (!var3.field2324 && method834(var3) && Statics.field921 != var3) {
                        continue;
                    }
                    method1630(arg0, var3.field2208);
                    if (var3.field2332 != null) {
                        method1630(var3.field2332, var3.field2208);
                    }
                    class18 var4 = (class18) field447.method2611((long) var3.field2208);
                    if (var4 != null) {
                        int var5 = var4.field179;
                        if (class172.method1982(var5)) {
                            method1630(Statics.field1985[var5], -1);
                        }
                    }
                }
                if (var3.field2331 == 6) {
                    if (var3.field2255 != -1 || var3.field2256 != -1) {
                        boolean var6 = method3064(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2256;
                        } else {
                            var7 = var3.field2255;
                        }
                        if (var7 != -1) {
                            class207 var8 = class207.method3621(var7);
                            var3.field2215 += field359;
                            while (var3.field2215 > var8.field3092[var3.field2330]) {
                                var3.field2215 -= var8.field3092[var3.field2330];
                                var3.field2330++;
                                if (var3.field2330 >= var8.field3093.length) {
                                    var3.field2330 -= var8.field3094;
                                    if (var3.field2330 < 0 || var3.field2330 >= var8.field3093.length) {
                                        var3.field2330 = 0;
                                    }
                                }
                                method2197(var3);
                            }
                        }
                    }
                    if (var3.field2261 != 0 && !var3.field2324) {
                        int var9 = var3.field2261 >> 16;
                        int var10 = var3.field2261 << 16 >> 16;
                        int var11 = field359 * var9;
                        int var12 = field359 * var10;
                        var3.field2264 = var3.field2264 + var11 & 0x7FF;
                        var3.field2300 = var3.field2300 + var12 & 0x7FF;
                        method2197(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fj.de(II)V")
    public static final void method2939(int arg0) {
        Statics.method2453();
        for (class32 var1 = (class32) class32.field710.method2666(); var1 != null; var1 = (class32) class32.field710.method2668()) {
            if (var1.field712 != null) {
                var1.method652();
            }
        }
        int var2 = class190.method1975(arg0).field2786;
        if (var2 == 0) {
            return;
        }
        int var3 = class168.field2174[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1566(0.9D);
                ((class75) Statics.field1438).method1361(0.9D);
            }
            if (var3 == 2) {
                class85.method1566(0.8D);
                ((class75) Statics.field1438).method1361(0.8D);
            }
            if (var3 == 3) {
                class85.method1566(0.7D);
                ((class75) Statics.field1438).method1361(0.7D);
            }
            if (var3 == 4) {
                class85.method1566(0.6D);
                ((class75) Statics.field1438).method1361(0.6D);
            }
            class204.method223();
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
            if (field502 != var4) {
                if (field502 == 0 && field525 != -1) {
                    class160.method888(Statics.field200, field525, 0, var4, false);
                    field526 = false;
                } else if (var4 == 0) {
                    class160.method219();
                    field526 = false;
                } else {
                    class160.method3279(var4);
                }
                field502 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field552 = 127;
            }
            if (var3 == 1) {
                field552 = 96;
            }
            if (var3 == 2) {
                field552 = 64;
            }
            if (var3 == 3) {
                field552 = 32;
            }
            if (var3 == 4) {
                field552 = 0;
            }
        }
        if (var2 == 5) {
            field422 = var3;
        }
        if (var2 == 6) {
            field448 = var3;
        }
        if (var2 == 9) {
            field449 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field528 = 127;
            }
            if (var3 == 1) {
                field528 = 96;
            }
            if (var3 == 2) {
                field528 = 64;
            }
            if (var3 == 3) {
                field528 = 32;
            }
            if (var3 == 4) {
                field528 = 0;
            }
        }
        if (var2 == 17) {
            field311 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class41[] var5 = new class41[] { class41.field810, class41.field808, class41.field806, class41.field807 };
            field307 = (class41) class125.method707(var5, var3);
            if (field307 == null) {
                field307 = class41.field810;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field473 = -1;
            } else {
                field473 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class41[] var6 = new class41[] { class41.field810, class41.field808, class41.field806, class41.field807 };
        field308 = (class41) class125.method707(var6, var3);
        if (field308 == null) {
            field308 = class41.field810;
        }
    }

    @ObfuscatedName("en.dn(Lfc;I)V")
    public static final void method2459(class172 arg0) {
        int var1 = arg0.field2212;
        if (var1 == 324) {
            if (field561 == -1) {
                field561 = arg0.field2243;
                field562 = arg0.field2244;
            }
            if (field560.field2180) {
                arg0.field2243 = field561;
            } else {
                arg0.field2243 = field562;
            }
        } else if (var1 == 325) {
            if (field561 == -1) {
                field561 = arg0.field2243;
                field562 = arg0.field2244;
            }
            if (field560.field2180) {
                arg0.field2243 = field562;
            } else {
                arg0.field2243 = field561;
            }
        } else if (var1 == 327) {
            arg0.field2264 = 150;
            arg0.field2300 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2251 = 5;
            arg0.field2232 = 0;
        } else if (var1 == 328) {
            arg0.field2264 = 150;
            arg0.field2300 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2251 = 5;
            arg0.field2232 = 1;
        }
    }

    @ObfuscatedName("ct.dm(Li;ZB)V")
    public static final void method1633(class18 arg0, boolean arg1) {
        int var2 = arg0.field179;
        int var3 = (int) arg0.field2034;
        arg0.method2652();
        if (arg1) {
            class172.method593(var2);
        }
        for (class155 var4 = (class155) field428.method2614(); var4 != null; var4 = (class155) field428.method2615()) {
            if ((var4.field2034 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method2652();
            }
        }
        class172 var5 = class172.method2211(var3);
        if (var5 != null) {
            method2197(var5);
        }
        method191();
        if (field446 != -1) {
            method573(field446, 1);
        }
    }

    @ObfuscatedName("o.dr(Lfc;I)Z")
    public static final boolean method242(class172 arg0) {
        int var1 = arg0.field2212;
        if (var1 == 205) {
            field490 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field560.method2966(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field560.method2958(var4, var5 == 1);
        }
        if (var1 == 324) {
            field560.method2949(false);
        }
        if (var1 == 325) {
            field560.method2949(true);
        }
        if (var1 == 326) {
            field326.method2480(141);
            field560.method2947(field326);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.db(IIIILhu;Lfu;I)V")
    public static final void method752(int arg0, int arg1, int arg2, int arg3, class229 arg4, class167 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method759(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field368 + field354 & 0x7FF;
        int var8 = class85.field1434[var7];
        int var9 = class85.field1442[var7];
        int var10 = var8 * 256 / (field356 + 256);
        int var11 = var9 * 256 / (field356 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field360.method3993(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ag.dd(IIIILhu;Lfu;I)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, class229 arg4, class167 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field368 + field354 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1434[var6];
        int var9 = class85.field1442[var6];
        int var10 = var8 * 256 / (field356 + 256);
        int var11 = var9 * 256 / (field356 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4038(arg5.field2168 / 2 + var12 - arg4.field3243 / 2, arg5.field2166 / 2 - var13 - arg4.field3244 / 2, arg0, arg1, arg5.field2168, arg5.field2166, arg5.field2167, arg5.field2165);
        } else {
            arg4.method3981(arg5.field2168 / 2 + arg0 + var12 - arg4.field3243 / 2, arg5.field2166 / 2 + arg1 - var13 - arg4.field3244 / 2);
        }
    }

    @ObfuscatedName("i.du(Ljava/lang/String;ZI)Z")
    public static boolean method200(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class212.method1943(arg0, Statics.field758);
        for (int var3 = 0; var3 < field554; var3++) {
            if (var2.equalsIgnoreCase(class212.method1943(field455[var3].field162, Statics.field758)) && (!arg1 || field455[var3].field154 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class212.method1943(Statics.field233.field266, Statics.field758))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("n.eg(Ljava/lang/String;I)Z")
    public static boolean method28(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class212.method1943(arg0, Statics.field758);
        for (int var2 = 0; var2 < field558; var2++) {
            class20 var3 = field465[var2];
            if (var1.equalsIgnoreCase(class212.method1943(var3.field205, Statics.field758))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class212.method1943(var3.field209, Statics.field758))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dt.en(Ljava/lang/String;I)V")
    public static final void method1920(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field554 < 200 || field407 == 1) || field554 >= 400) {
            class48.method196(30, "", class176.field2536);
            return;
        }
        String var1 = class212.method1943(arg0, Statics.field758);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field554; var2++) {
            class15 var3 = field455[var2];
            String var4 = class212.method1943(var3.field162, Statics.field758);
            if (var4 != null && var4.equals(var1)) {
                class48.method196(30, "", arg0 + class176.field2561);
                return;
            }
            if (var3.field152 != null) {
                String var5 = class212.method1943(var3.field152, Statics.field758);
                if (var5 != null && var5.equals(var1)) {
                    class48.method196(30, "", arg0 + class176.field2561);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field558; var6++) {
            class20 var7 = field465[var6];
            String var8 = class212.method1943(var7.field205, Statics.field758);
            if (var8 != null && var8.equals(var1)) {
                class48.method196(30, "", class176.field2448 + arg0 + class176.field2529);
                return;
            }
            if (var7.field209 != null) {
                String var9 = class212.method1943(var7.field209, Statics.field758);
                if (var9 != null && var9.equals(var1)) {
                    class48.method196(30, "", class176.field2448 + arg0 + class176.field2529);
                    return;
                }
            }
        }
        if (class212.method1943(Statics.field233.field266, Statics.field758).equals(var1)) {
            class48.method196(30, "", class176.field2526);
        } else {
            field326.method2480(209);
            field326.method2215(class130.method740(arg0));
            field326.method2351(arg0);
        }
    }

    @ObfuscatedName("di.em(Ljava/lang/String;I)V")
    public static final void method2140(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method1943(arg0, Statics.field758);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field558; var2++) {
            class20 var3 = field465[var2];
            String var4 = var3.field205;
            String var5 = class212.method1943(var4, Statics.field758);
            if (class222.method1389(arg0, var1, var4, var5)) {
                field558--;
                for (int var6 = var2; var6 < field558; var6++) {
                    field465[var6] = field465[var6 + 1];
                }
                field479 = field312;
                field326.method2480(11);
                field326.method2215(class130.method740(arg0));
                field326.method2351(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dr.eh(Ljava/lang/String;B)V")
    public static final void method2201(String arg0) {
        if (Statics.field295 != null) {
            field326.method2480(124);
            field326.method2215(class130.method740(arg0));
            field326.method2351(arg0);
        }
    }

    @ObfuscatedName("az.es(Ljava/lang/String;B)V")
    public static final void method639(String arg0) {
        if (!arg0.equals("")) {
            field326.method2480(117);
            field326.method2215(class130.method740(arg0));
            field326.method2351(arg0);
        }
    }

    @ObfuscatedName("ch.ee(Lfc;I)I")
    public static int method1872(class172 arg0) {
        class155 var1 = (class155) field428.method2611(((long) arg0.field2208 << 32) + (long) arg0.field2209);
        return var1 == null ? arg0.field2238 : var1.field2047;
    }

    @ObfuscatedName("dt.er(Lfc;S)Lfc;")
    public static class172 method1911(class172 arg0) {
        int var1 = method1872(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class172.method2211(arg0.field2227);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("an.ex(Lfc;B)Z")
    public static boolean method834(class172 arg0) {
        if (field456) {
            if (method1872(arg0) != 0) {
                return false;
            }
            if (arg0.field2331 == 0) {
                return false;
            }
        }
        return arg0.field2228;
    }

    @ObfuscatedName("ge.el(Lfc;II)Ljava/lang/String;")
    public static String method3082(class172 arg0, int arg1) {
        int var2 = method1872(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2308 == null) {
            return null;
        } else if (arg0.field2282 == null || arg0.field2282.length <= arg1 || arg0.field2282[arg1] == null || arg0.field2282[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2282[arg1];
        }
    }

    @ObfuscatedName("k.et(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method185(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field284 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field284 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field284 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field284 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field284 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field288 != null) {
            var3 = "/p=" + Statics.field288;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field287 + "/a=" + Statics.field98 + var3 + "/";
    }

    @ObfuscatedName("fn.ef(Ljava/lang/String;I)V")
    public static void method3056(String arg0) {
        Statics.field288 = arg0;
        try {
            String var1 = Statics.field280.getParameter(class219.field3193.field3194);
            String var2 = Statics.field280.getParameter(class219.field3181.field3194);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class139.method2097(class132.method1336() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field280;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("z.ep([BII)V")
    public static void method99(byte[] arg0, int arg1) {
        if (field298 == null) {
            field298 = new byte[24];
        }
        class140.method2516(arg0, arg1, field298, 0, 24);
    }

    @ObfuscatedName("bb.eb(Ldu;B)V")
    public static void method1150(class130 arg0) {
        if (field298 == null) {
            byte[] var1 = class105.method216();
            arg0.method2255(var1, 0, var1.length);
        } else {
            arg0.method2255(field298, 0, field298.length);
        }
    }
}

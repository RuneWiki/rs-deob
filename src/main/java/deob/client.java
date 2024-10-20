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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.a")
    public static boolean field281 = true;

    @ObfuscatedName("client.f")
    public static int field282 = 1;

    @ObfuscatedName("client.c")
    public static int field482 = 0;

    @ObfuscatedName("client.l")
    public static int field417 = 0;

    @ObfuscatedName("client.t")
    public static boolean field286 = false;

    @ObfuscatedName("client.m")
    public static boolean field287 = false;

    @ObfuscatedName("client.q")
    public static int field473 = 0;

    @ObfuscatedName("client.k")
    public static int field289 = 0;

    @ObfuscatedName("client.r")
    public static boolean field302 = true;

    @ObfuscatedName("client.h")
    public static int field291 = 0;

    @ObfuscatedName("client.s")
    public static long field292 = -1L;

    @ObfuscatedName("client.w")
    public static class118[] field412 = new class118[4];

    @ObfuscatedName("client.o")
    public static int field340 = -1;

    @ObfuscatedName("client.b")
    public static int field294 = -1;

    @ObfuscatedName("client.aj")
    public static int field295 = -1;

    @ObfuscatedName("client.ag")
    public static boolean field296 = true;

    @ObfuscatedName("client.al")
    public static boolean field297 = false;

    @ObfuscatedName("client.an")
    public static int field298 = 0;

    @ObfuscatedName("client.af")
    public static int field299 = 0;

    @ObfuscatedName("client.aa")
    public static int field300 = 0;

    @ObfuscatedName("client.ax")
    public static int field545 = 0;

    @ObfuscatedName("client.ai")
    public static int field531 = 0;

    @ObfuscatedName("client.ah")
    public static int field427 = 0;

    @ObfuscatedName("client.av")
    public static int field535 = 0;

    @ObfuscatedName("client.at")
    public static int field305 = 0;

    @ObfuscatedName("client.az")
    public static int field324 = 0;

    @ObfuscatedName("client.ak")
    public static class41 field307 = class41.field799;

    @ObfuscatedName("client.aq")
    public static class41 field308 = class41.field799;

    @ObfuscatedName("client.am")
    public static int field543 = 0;

    @ObfuscatedName("client.ab")
    public static int field311 = 0;

    @ObfuscatedName("client.as")
    public static int field312 = 0;

    @ObfuscatedName("client.br")
    public static int field317 = 0;

    @ObfuscatedName("client.bd")
    public static int field330 = 0;

    @ObfuscatedName("client.bs")
    public static int field319 = 0;

    @ObfuscatedName("client.bx")
    public static int field320 = 0;

    @ObfuscatedName("client.bp")
    public static int field321 = 0;

    @ObfuscatedName("client.ci")
    public static class36[] field322 = new class36[32768];

    @ObfuscatedName("client.co")
    public static int field323 = 0;

    @ObfuscatedName("client.cr")
    public static int[] field484 = new int[32768];

    @ObfuscatedName("client.cs")
    public static int field325 = 0;

    @ObfuscatedName("client.cl")
    public static int[] field371 = new int[250];

    @ObfuscatedName("client.cb")
    public static class160 field327 = new class160(5000);

    @ObfuscatedName("client.cv")
    public static class160 field418 = new class160(5000);

    @ObfuscatedName("client.cm")
    public static class160 field410 = new class160(15000);

    @ObfuscatedName("client.cq")
    public static int field329 = 0;

    @ObfuscatedName("client.cu")
    public static int field375 = 0;

    @ObfuscatedName("client.ce")
    public static int field309 = 0;

    @ObfuscatedName("client.cg")
    public static int field333 = 0;

    @ObfuscatedName("client.ch")
    public static int field334 = 0;

    @ObfuscatedName("client.cn")
    public static int field335 = 0;

    @ObfuscatedName("client.cz")
    public static int field336 = 0;

    @ObfuscatedName("client.cw")
    public static int field337 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field338 = false;

    @ObfuscatedName("client.du")
    public static int field339 = 0;

    @ObfuscatedName("client.dl")
    public static int field457 = 1;

    @ObfuscatedName("client.ds")
    public static int field341 = 0;

    @ObfuscatedName("client.dj")
    public static int field342 = 1;

    @ObfuscatedName("client.de")
    public static int field343 = 0;

    @ObfuscatedName("client.dg")
    public static boolean field435 = false;

    @ObfuscatedName("client.dt")
    public static int[][][] field346 = new int[4][13][13];

    @ObfuscatedName("client.dx")
    public static final int[] field347 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dy")
    public static int field348 = 0;

    @ObfuscatedName("client.dc")
    public static int field349 = 2;

    @ObfuscatedName("client.dv")
    public static int field395 = 0;

    @ObfuscatedName("client.dz")
    public static int field332 = 2;

    @ObfuscatedName("client.dm")
    public static int field352 = 0;

    @ObfuscatedName("client.ec")
    public static int field354 = 1;

    @ObfuscatedName("client.ee")
    public static int field303 = 0;

    @ObfuscatedName("client.ek")
    public static int field355 = 0;

    @ObfuscatedName("client.el")
    public static int field356 = 2;

    @ObfuscatedName("client.ei")
    public static int field357 = 0;

    @ObfuscatedName("client.ej")
    public static int field358 = 1;

    @ObfuscatedName("client.er")
    public static int field474 = 0;

    @ObfuscatedName("client.ex")
    public static int field463 = 0;

    @ObfuscatedName("client.ev")
    public static int field361 = 2301979;

    @ObfuscatedName("client.ew")
    public static int field479 = 5063219;

    @ObfuscatedName("client.em")
    public static int field452 = 3353893;

    @ObfuscatedName("client.en")
    public static int field364 = 7759444;

    @ObfuscatedName("client.ez")
    public static boolean field365 = false;

    @ObfuscatedName("client.et")
    public static int field366 = 0;

    @ObfuscatedName("client.fj")
    public static int field521 = 128;

    @ObfuscatedName("client.fv")
    public static int field368 = 0;

    @ObfuscatedName("client.fb")
    public static int field386 = 0;

    @ObfuscatedName("client.fi")
    public static int field370 = 0;

    @ObfuscatedName("client.fh")
    public static int field522 = 0;

    @ObfuscatedName("client.fw")
    public static int field372 = 0;

    @ObfuscatedName("client.fa")
    public static int field373 = 50;

    @ObfuscatedName("client.fe")
    public static int field374 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field516 = false;

    @ObfuscatedName("client.fs")
    public static int field407 = 0;

    @ObfuscatedName("client.fr")
    public static int field377 = 0;

    @ObfuscatedName("client.fd")
    public static int field378 = 50;

    @ObfuscatedName("client.fc")
    public static int[] field379 = new int[field378];

    @ObfuscatedName("client.fp")
    public static int[] field440 = new int[field378];

    @ObfuscatedName("client.fl")
    public static int[] field381 = new int[field378];

    @ObfuscatedName("client.ff")
    public static int[] field382 = new int[field378];

    @ObfuscatedName("client.fz")
    public static int[] field444 = new int[field378];

    @ObfuscatedName("client.fu")
    public static int[] field408 = new int[field378];

    @ObfuscatedName("client.ft")
    public static int[] field385 = new int[field378];

    @ObfuscatedName("client.gt")
    public static String[] field424 = new String[field378];

    @ObfuscatedName("client.ge")
    public static int[][] field387 = new int[104][104];

    @ObfuscatedName("client.gy")
    public static int field388 = 0;

    @ObfuscatedName("client.gk")
    public static int field389 = -1;

    @ObfuscatedName("client.gr")
    public static int field492 = -1;

    @ObfuscatedName("client.gm")
    public static int field391 = 0;

    @ObfuscatedName("client.gv")
    public static int field392 = 0;

    @ObfuscatedName("client.gu")
    public static int field393 = 0;

    @ObfuscatedName("client.gl")
    public static int field394 = 0;

    @ObfuscatedName("client.go")
    public static int field532 = 0;

    @ObfuscatedName("client.gd")
    public static int field396 = 0;

    @ObfuscatedName("client.gz")
    public static int field397 = 0;

    @ObfuscatedName("client.gf")
    public static int field398 = 0;

    @ObfuscatedName("client.gh")
    public static int field399 = 0;

    @ObfuscatedName("client.gq")
    public static int field400 = 0;

    @ObfuscatedName("client.gc")
    public static boolean field401 = false;

    @ObfuscatedName("client.gg")
    public static int field402 = 0;

    @ObfuscatedName("client.gx")
    public static int field403 = 0;

    @ObfuscatedName("client.gp")
    public static class24[] field434 = new class24[2048];

    @ObfuscatedName("client.gi")
    public static int field405 = -1;

    @ObfuscatedName("client.gj")
    public static int field462 = 0;

    @ObfuscatedName("client.hz")
    public static int field331 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field460 = new int[1000];

    @ObfuscatedName("client.hd")
    public static final int[] field409 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hj")
    public static String[] field467 = new String[8];

    @ObfuscatedName("client.hc")
    public static boolean[] field411 = new boolean[8];

    @ObfuscatedName("client.hu")
    public static int[] field310 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hf")
    public static int field413 = -1;

    @ObfuscatedName("client.he")
    public static class129[][][] field414 = new class129[4][104][104];

    @ObfuscatedName("client.ha")
    public static class129 field546 = new class129();

    @ObfuscatedName("client.hr")
    public static class129 field416 = new class129();

    @ObfuscatedName("client.hm")
    public static class129 field406 = new class129();

    @ObfuscatedName("client.hg")
    public static int[] field376 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field419 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field420 = new int[25];

    @ObfuscatedName("client.hs")
    public static int field304 = 0;

    @ObfuscatedName("client.hw")
    public static boolean field422 = false;

    @ObfuscatedName("client.hy")
    public static int field423 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field318 = new int[500];

    @ObfuscatedName("client.ho")
    public static int[] field425 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field426 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field314 = new int[500];

    @ObfuscatedName("client.ir")
    public static String[] field428 = new String[500];

    @ObfuscatedName("client.ia")
    public static String[] field429 = new String[500];

    @ObfuscatedName("client.ik")
    public static int field430 = -1;

    @ObfuscatedName("client.ih")
    public static int field431 = -1;

    @ObfuscatedName("client.in")
    public static int field432 = 0;

    @ObfuscatedName("client.iu")
    public static int field362 = 50;

    @ObfuscatedName("client.iq")
    public static int field448 = 0;

    @ObfuscatedName("client.it")
    public static String field469 = null;

    @ObfuscatedName("client.io")
    public static boolean field436 = false;

    @ObfuscatedName("client.im")
    public static int field437 = -1;

    @ObfuscatedName("client.ig")
    public static int field438 = -1;

    @ObfuscatedName("client.ii")
    public static String field439 = null;

    @ObfuscatedName("client.ib")
    public static String field283 = null;

    @ObfuscatedName("client.if")
    public static int field441 = -1;

    @ObfuscatedName("client.ij")
    public static class126 field442 = new class126(8);

    @ObfuscatedName("client.iz")
    public static int field446 = 0;

    @ObfuscatedName("client.jn")
    public static int field559 = 0;

    @ObfuscatedName("client.jl")
    public static class170 field538 = null;

    @ObfuscatedName("client.jr")
    public static int field524 = 0;

    @ObfuscatedName("client.jf")
    public static int field552 = 0;

    @ObfuscatedName("client.jv")
    public static int field353 = 0;

    @ObfuscatedName("client.jt")
    public static int field449 = -1;

    @ObfuscatedName("client.ju")
    public static boolean field450 = false;

    @ObfuscatedName("client.jo")
    public static boolean field415 = false;

    @ObfuscatedName("client.jg")
    public static boolean field301 = false;

    @ObfuscatedName("client.ja")
    public static class170 field453 = null;

    @ObfuscatedName("client.jq")
    public static class170 field454 = null;

    @ObfuscatedName("client.jc")
    public static class170 field455 = null;

    @ObfuscatedName("client.jp")
    public static int field456 = 0;

    @ObfuscatedName("client.jj")
    public static int field551 = 0;

    @ObfuscatedName("client.je")
    public static class170 field458 = null;

    @ObfuscatedName("client.js")
    public static boolean field459 = false;

    @ObfuscatedName("client.jd")
    public static int field491 = -1;

    @ObfuscatedName("client.jb")
    public static int field285 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field526 = false;

    @ObfuscatedName("client.jh")
    public static int field510 = -1;

    @ObfuscatedName("client.jk")
    public static int field464 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field465 = false;

    @ObfuscatedName("client.kd")
    public static int field447 = 1;

    @ObfuscatedName("client.kn")
    public static int[] field288 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field468 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field472 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field470 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field471 = new int[32];

    @ObfuscatedName("client.ku")
    public static int field345 = 0;

    @ObfuscatedName("client.kl")
    public static int field290 = 0;

    @ObfuscatedName("client.kh")
    public static int field461 = 0;

    @ObfuscatedName("client.kw")
    public static int field475 = 0;

    @ObfuscatedName("client.ko")
    public static int field550 = 0;

    @ObfuscatedName("client.kg")
    public static int field477 = 0;

    @ObfuscatedName("client.km")
    public static int field478 = 0;

    @ObfuscatedName("client.ky")
    public static int field525 = 0;

    @ObfuscatedName("client.kc")
    public static class129 field480 = new class129();

    @ObfuscatedName("client.kp")
    public static class129 field481 = new class129();

    @ObfuscatedName("client.kj")
    public static class129 field326 = new class129();

    @ObfuscatedName("client.kv")
    public static class126 field483 = new class126(512);

    @ObfuscatedName("client.kz")
    public static int field534 = 0;

    @ObfuscatedName("client.kk")
    public static int field485 = -2;

    @ObfuscatedName("client.kf")
    public static boolean[] field486 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static boolean[] field487 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field488 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static int[] field489 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field490 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field503 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field451 = new int[100];

    @ObfuscatedName("client.lt")
    public static int field493 = 0;

    @ObfuscatedName("client.ln")
    public static long field380 = 0L;

    @ObfuscatedName("client.lm")
    public static boolean field495 = true;

    @ObfuscatedName("client.lh")
    public static int field496 = 1;

    @ObfuscatedName("client.lv")
    public static int field497 = 503;

    @ObfuscatedName("client.ly")
    public static int[] field498 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.la")
    public static int field499 = 0;

    @ObfuscatedName("client.ll")
    public static int field500 = 0;

    @ObfuscatedName("client.lx")
    public static String field555 = "";

    @ObfuscatedName("client.lr")
    public static long[] field502 = new long[100];

    @ObfuscatedName("client.lq")
    public static int field433 = 0;

    @ObfuscatedName("client.li")
    public static int field504 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field505 = new int[128];

    @ObfuscatedName("client.mp")
    public static int[] field506 = new int[128];

    @ObfuscatedName("client.md")
    public static long field507 = -1L;

    @ObfuscatedName("client.me")
    public static String field508 = null;

    @ObfuscatedName("client.my")
    public static String field509 = null;

    @ObfuscatedName("client.mm")
    public static int field360 = -1;

    @ObfuscatedName("client.mi")
    public static int field363 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field512 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field513 = new int[1000];

    @ObfuscatedName("client.mb")
    public static class225[] field306 = new class225[1000];

    @ObfuscatedName("client.mq")
    public static int field515 = 0;

    @ObfuscatedName("client.ma")
    public static int field548 = 0;

    @ObfuscatedName("client.mg")
    public static int field544 = 0;

    @ObfuscatedName("client.mv")
    public static int field518 = 255;

    @ObfuscatedName("client.mz")
    public static int field445 = -1;

    @ObfuscatedName("client.mn")
    public static boolean field520 = false;

    @ObfuscatedName("client.nb")
    public static int field359 = 127;

    @ObfuscatedName("client.ng")
    public static int field558 = 127;

    @ObfuscatedName("client.nq")
    public static int field517 = 0;

    @ObfuscatedName("client.nw")
    public static int[] field501 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field293 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field527 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field528 = new int[50];

    @ObfuscatedName("client.np")
    public static class54[] field529 = new class54[50];

    @ObfuscatedName("client.nv")
    public static boolean field530 = false;

    @ObfuscatedName("client.nl")
    public static boolean[] field494 = new boolean[5];

    @ObfuscatedName("client.ok")
    public static int[] field369 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field533 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field316 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field511 = new int[5];

    @ObfuscatedName("client.om")
    public static short field536 = 256;

    @ObfuscatedName("client.og")
    public static short field537 = 205;

    @ObfuscatedName("client.ol")
    public static short field390 = 256;

    @ObfuscatedName("client.oc")
    public static short field539 = 320;

    @ObfuscatedName("client.ou")
    public static short field540 = 1;

    @ObfuscatedName("client.or")
    public static short field541 = 32767;

    @ObfuscatedName("client.of")
    public static short field542 = 1;

    @ObfuscatedName("client.oq")
    public static short field514 = 32767;

    @ObfuscatedName("client.ow")
    public static int field421 = 0;

    @ObfuscatedName("client.on")
    public static int field519 = 0;

    @ObfuscatedName("client.oz")
    public static int field443 = 0;

    @ObfuscatedName("client.oy")
    public static int field547 = 0;

    @ObfuscatedName("client.oh")
    public static int field476 = 0;

    @ObfuscatedName("client.oe")
    public static int field549 = 0;

    @ObfuscatedName("client.oa")
    public static int field466 = 0;

    @ObfuscatedName("client.op")
    public static class15[] field351 = new class15[400];

    @ObfuscatedName("client.ov")
    public static class131 field384 = new class131();

    @ObfuscatedName("client.os")
    public static int field553 = 0;

    @ObfuscatedName("client.ox")
    public static class20[] field554 = new class20[400];

    @ObfuscatedName("client.ot")
    public static class167 field561 = new class167();

    @ObfuscatedName("client.pb")
    public static int field556 = -1;

    @ObfuscatedName("client.pn")
    public static int field557 = -1;

    @ObfuscatedName("client.pw")
    public static class5[] field383 = new class5[8];

    @ObfuscatedName("client.po")
    public static long field367 = -1L;

    @ObfuscatedName("client.pt")
    public static long field560 = -1L;

    @ObfuscatedName("client.pi")
    public static final class23 field404 = new class23();

    @ObfuscatedName("client.pa")
    public static int[] field562 = new int[50];

    @ObfuscatedName("client.pj")
    public static int[] field563 = new int[50];

    @ObfuscatedName("client.i(I)V")
    public final void method244() {
    }

    public final void init() {
        if (!this.method1958()) {
            return;
        }
        class215[] var1 = class215.method806();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class215 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3157);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3157)) {
                    case 1:
                        Statics.field3168 = var4;
                        break;
                    case 2:
                        field473 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field284 = class179.method1786(Integer.parseInt(var4));
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class38.field784)) {
                        }
                        break;
                    case 5:
                        Statics.field171 = var4;
                        break;
                    case 6:
                        field482 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field3035 = Integer.parseInt(var4);
                        break;
                    case 8:
                        field282 = Integer.parseInt(var4);
                        break;
                    case 9:
                        field417 = Integer.parseInt(var4);
                    case 10:
                    case 12:
                    case 13:
                    default:
                        break;
                    case 11:
                        Statics.field2332 = Integer.parseInt(var4);
                        break;
                    case 14:
                        class180[] var5 = new class180[] { class180.field2667, class180.field2665, class180.field2661, class180.field2663, class180.field2662, class180.field2666 };
                        Statics.field140 = (class180) class149.method3057(var5, Integer.parseInt(var4));
                        if (Statics.field140 == class180.field2661) {
                            Statics.field210 = class229.field3242;
                        } else {
                            Statics.field210 = class229.field3239;
                        }
                        break;
                    case 15:
                        if (var4.equalsIgnoreCase(class38.field784)) {
                            field286 = true;
                        } else {
                            field286 = false;
                        }
                }
            }
        }
        class88.field1523 = false;
        field287 = false;
        Statics.field2070 = this.getCodeBase().getHost();
        String var6 = Statics.field284.field2657;
        byte var7 = 0;
        try {
            class105.method3577("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class102.method3043((String) null, var9);
        }
        Statics.field280 = this;
        this.method1956(765, 503, 130);
    }

    @ObfuscatedName("client.c(B)V")
    public final void method246() {
        Statics.field1720 = field417 == 0 ? 43594 : field282 + 40000;
        Statics.field91 = field417 == 0 ? 443 : field282 + 50000;
        Statics.field1352 = Statics.field1720;
        Statics.field2099 = class168.field2167;
        Statics.field3230 = class168.field2172;
        Statics.field2162 = class168.field2173;
        Statics.field666 = class168.field2169;
        class106.method615();
        class106.method2520(Statics.field2146);
        Canvas var1 = Statics.field2146;
        var1.addMouseListener(class116.field1799);
        var1.addMouseMotionListener(class116.field1799);
        var1.addFocusListener(class116.field1799);
        Statics.field2664 = class113.method1783();
        if (Statics.field2664 != null) {
            Statics.field2664.method1890(Statics.field2146);
        }
        Statics.field61 = new class117(255, class105.field1677, class105.field1678, 500000);
        class74 var2 = null;
        class31 var3 = new class31();
        try {
            var2 = class105.method843("", Statics.field140.field2670, false);
            byte[] var4 = new byte[(int) var2.method1297()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method1298(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class31(new class154(var4));
        } catch (Exception var12) {
        }
        try {
            if (var2 != null) {
                var2.method1295();
            }
        } catch (Exception var11) {
        }
        Statics.field22 = var3;
        Statics.field2119 = this.getToolkit().getSystemClipboard();
        class115.method858(this, Statics.field1643);
        if (field417 != 0) {
            field297 = true;
        }
        int var10 = Statics.field22.field688;
        field380 = 0L;
        if (var10 >= 2) {
            field495 = true;
        } else {
            field495 = false;
        }
        method680();
        if (field289 >= 25) {
            field327.method2832(112);
            field327.method2573(method3134());
            field327.method2731(Statics.field2);
            field327.method2731(Statics.field1100);
        }
        field1769 = true;
    }

    @ObfuscatedName("client.g(B)V")
    public final void method484() {
        field291++;
        this.method453();
        class184.method111();
        try {
            if (class139.field1901 == 1) {
                int var1 = Statics.field1900.method2411();
                if (var1 > 0 && Statics.field1900.method2335()) {
                    int var2 = var1 - Statics.field1905;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1900.method2380(var2);
                } else {
                    Statics.field1900.method2404();
                    Statics.field1900.method2332();
                    if (Statics.field1904 == null) {
                        class139.field1901 = 0;
                    } else {
                        class139.field1901 = 2;
                    }
                    Statics.field915 = null;
                    Statics.field1726 = null;
                }
            }
        } catch (Exception var9) {
            var9.printStackTrace();
            Statics.field1900.method2404();
            class139.field1901 = 0;
            Statics.field915 = null;
            Statics.field1726 = null;
            Statics.field1904 = null;
        }
        method732();
        class106.method1781();
        class116.method864();
        if (Statics.field2664 != null) {
            int var4 = Statics.field2664.method1886();
            field525 = var4;
        }
        if (field289 == 0) {
            method3039();
            Statics.field80.method1787();
            for (int var5 = 0; var5 < 32; var5++) {
                field1773[var5] = 0L;
            }
            for (int var6 = 0; var6 < 32; var6++) {
                field1756[var6] = 0L;
            }
            Statics.field754 = 0;
        } else if (field289 == 5) {
            class42.method153(this);
            method3039();
            Statics.field80.method1787();
            for (int var7 = 0; var7 < 32; var7++) {
                field1773[var7] = 0L;
            }
            for (int var8 = 0; var8 < 32; var8++) {
                field1756[var8] = 0L;
            }
            Statics.field754 = 0;
        } else if (field289 == 10 || field289 == 11) {
            class42.method153(this);
        } else if (field289 == 20) {
            class42.method153(this);
            method1068();
        } else if (field289 == 25) {
            method856();
        }
        if (field289 == 30) {
            method2524();
        } else if (field289 == 40 || field289 == 45) {
            method1068();
        }
    }

    @ObfuscatedName("client.z(I)V")
    public final void method248() {
        boolean var1;
        label173: {
            try {
                if (class139.field1901 == 2) {
                    if (Statics.field915 == null) {
                        Statics.field915 = class145.method2511(Statics.field1904, Statics.field921, Statics.field3);
                        if (Statics.field915 == null) {
                            var1 = false;
                            break label173;
                        }
                    }
                    if (Statics.field1726 == null) {
                        Statics.field1726 = new class61(Statics.field211, Statics.field1903);
                    }
                    if (Statics.field1900.method2330(Statics.field915, Statics.field1902, Statics.field1726, 22050)) {
                        Statics.field1900.method2343();
                        Statics.field1900.method2380(Statics.field1467);
                        Statics.field1900.method2333(Statics.field915, Statics.field917);
                        class139.field1901 = 0;
                        Statics.field915 = null;
                        Statics.field1726 = null;
                        Statics.field1904 = null;
                        var1 = true;
                        break label173;
                    }
                }
            } catch (Exception var18) {
                var18.printStackTrace();
                Statics.field1900.method2404();
                class139.field1901 = 0;
                Statics.field915 = null;
                Statics.field1726 = null;
                Statics.field1904 = null;
            }
            var1 = false;
        }
        if (var1 && field520 && Statics.field523 != null) {
            Statics.field523.method1006();
        }
        if (field289 == 10 || field289 == 20 || field289 == 30) {
            if (field380 != 0L && class156.method118() > field380) {
                int var4 = method3134();
                field380 = 0L;
                if (var4 >= 2) {
                    field495 = true;
                } else {
                    field495 = false;
                }
                method680();
                if (field289 >= 25) {
                    field327.method2832(112);
                    field327.method2573(method3134());
                    field327.method2731(Statics.field2);
                    field327.method2731(Statics.field1100);
                }
                field1769 = true;
            } else if (field1772) {
                method2800();
            }
        }
        Dimension var5 = this.method1950();
        if (Statics.field1212 != var5.width || Statics.field116 != var5.height || field1771) {
            method680();
            field380 = class156.method118() + 500L;
            field1771 = false;
        }
        boolean var6 = false;
        if (field1769) {
            field1769 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field486[var7] = true;
            }
        }
        if (var6) {
            method589();
        }
        if (field289 == 0) {
            class114.method1598(class42.field826, class42.field827, (Color) null, var6);
        } else if (field289 == 5) {
            class42.method117(Statics.field1622, Statics.field1187, Statics.field236, var6);
        } else if (field289 == 10 || field289 == 11) {
            class42.method117(Statics.field1622, Statics.field1187, Statics.field236, var6);
        } else if (field289 == 20) {
            class42.method117(Statics.field1622, Statics.field1187, Statics.field236, var6);
        } else if (field289 == 25) {
            if (field343 == 1) {
                if (field339 > field457) {
                    field457 = field339;
                }
                int var8 = (field457 * 50 - field339 * 50) / field457;
                method1529(class174.field2348 + class38.field780 + class38.field778 + var8 + "%" + class38.field776, false);
            } else if (field343 == 2) {
                if (field341 > field342) {
                    field342 = field341;
                }
                int var9 = (field342 * 50 - field341 * 50) / field342 + 50;
                method1529(class174.field2348 + class38.field780 + class38.field778 + var9 + "%" + class38.field776, false);
            } else {
                method1529(class174.field2348, false);
            }
        } else if (field289 == 30) {
            method208();
        } else if (field289 == 40) {
            method1529(class174.field2571 + class38.field780 + class174.field2525, false);
        } else if (field289 == 45) {
            method1529(class174.field2494, false);
        }
        if (field289 == 30 && field493 == 0 && !var6) {
            try {
                Graphics var10 = Statics.field2146.getGraphics();
                for (int var11 = 0; var11 < field534; var11++) {
                    if (field487[var11]) {
                        Statics.field1759.method3743(var10, field489[var11], field490[var11], field503[var11], field451[var11]);
                        field487[var11] = false;
                    }
                }
            } catch (Exception var17) {
                Statics.field2146.repaint();
            }
        } else if (field289 > 0) {
            try {
                Graphics var13 = Statics.field2146.getGraphics();
                Statics.field1759.method3745(var13, 0, 0);
                for (int var14 = 0; var14 < field534; var14++) {
                    field487[var14] = false;
                }
            } catch (Exception var16) {
                Statics.field2146.repaint();
            }
        }
    }

    @ObfuscatedName("client.t(B)V")
    public final void method271() {
        if (Statics.field1542.method825()) {
            Statics.field1542.method829();
        }
        if (Statics.field2797 != null) {
            Statics.field2797.field219 = false;
        }
        Statics.field2797 = null;
        if (Statics.field775 != null) {
            Statics.field775.method1916();
            Statics.field775 = null;
        }
        class106.method1881();
        if (class116.field1799 != null) {
            class116 var1 = class116.field1799;
            synchronized (class116.field1799) {
                class116.field1799 = null;
            }
        }
        Statics.field2664 = null;
        if (Statics.field523 != null) {
            Statics.field523.method1007();
        }
        if (Statics.field151 != null) {
            Statics.field151.method1007();
        }
        class186.method704();
        class184.method3055();
        class105.method813();
    }

    @ObfuscatedName("v.m(II)V")
    public static void method177(int arg0) {
        if (field289 == arg0) {
            return;
        }
        if (field289 == 0) {
            Statics.field2659 = null;
            Statics.field753 = null;
            Statics.field1746 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field330 = 0;
            field319 = 0;
            field320 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1644 != null) {
            Statics.field1644.method1916();
            Statics.field1644 = null;
        }
        if (field289 == 25) {
            field343 = 0;
            field339 = 0;
            field457 = 1;
            field341 = 0;
            field342 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method725(Statics.field2146, Statics.field957, Statics.field5, true, 0);
        } else if (arg0 == 20) {
            class42.method725(Statics.field2146, Statics.field957, Statics.field5, true, field289 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method725(Statics.field2146, Statics.field957, Statics.field5, false, 4);
        } else if (Statics.field2174) {
            Statics.field808 = null;
            Statics.field809 = null;
            Statics.field760 = null;
            Statics.field810 = null;
            Statics.field841 = null;
            Statics.field3247 = null;
            Statics.field789 = null;
            Statics.field812 = null;
            Statics.field81 = null;
            Statics.field68 = null;
            Statics.field205 = null;
            Statics.field134 = null;
            Statics.field1103 = null;
            Statics.field2731 = null;
            Statics.field817 = null;
            Statics.field818 = null;
            Statics.field1301 = null;
            Statics.field1200 = null;
            Statics.field1532 = null;
            Statics.field1628 = null;
            Statics.field49 = null;
            Statics.field814 = null;
            class139.field1901 = 1;
            Statics.field1904 = null;
            Statics.field921 = -1;
            Statics.field3 = -1;
            Statics.field1467 = 0;
            Statics.field917 = false;
            Statics.field1905 = 2;
            class186.method1596(true);
            Statics.field2174 = false;
        }
        field289 = arg0;
    }

    @ObfuscatedName("client.q(I)V")
    public void method453() {
        if (field289 != 1000) {
            boolean var1 = class186.method3054();
            if (!var1) {
                this.method504();
            }
        }
    }

    @ObfuscatedName("client.e(I)V")
    public void method504() {
        if (class186.field2741 >= 4) {
            this.method1948("js5crc");
            field289 = 1000;
            return;
        }
        if (class186.field2737 >= 4) {
            if (field289 <= 5) {
                this.method1948("js5io");
                field289 = 1000;
                return;
            }
            field312 = 3000;
            class186.field2737 = 3;
        }
        if (--field312 + 1 > 0) {
            return;
        }
        try {
            if (field311 == 0) {
                Statics.field903 = Statics.field882.method1814(Statics.field2070, Statics.field1352);
                field311++;
            }
            if (field311 == 1) {
                if (Statics.field903.field1649 == 2) {
                    this.method252(-1);
                    return;
                }
                if (Statics.field903.field1649 == 1) {
                    field311++;
                }
            }
            if (field311 == 2) {
                Statics.field279 = new class111((Socket) Statics.field903.field1653, Statics.field882);
                class154 var1 = new class154(5);
                var1.method2573(15);
                var1.method2576(130);
                Statics.field279.method1908(var1.field2078, 0, 5);
                field311++;
                Statics.field313 = class156.method118();
            }
            if (field311 == 3) {
                if (field289 <= 5 || Statics.field279.method1907() > 0) {
                    int var2 = Statics.field279.method1911();
                    if (var2 != 0) {
                        this.method252(var2);
                        return;
                    }
                    field311++;
                } else if (class156.method118() - Statics.field313 > 30000L) {
                    this.method252(-2);
                    return;
                }
            }
            if (field311 == 4) {
                class186.method707(Statics.field279, field289 > 20);
                Statics.field903 = null;
                Statics.field279 = null;
                field311 = 0;
                field317 = 0;
            }
        } catch (IOException var4) {
            this.method252(-3);
        }
    }

    @ObfuscatedName("client.v(II)V")
    public void method252(int arg0) {
        Statics.field903 = null;
        Statics.field279 = null;
        field311 = 0;
        if (Statics.field1720 == Statics.field1352) {
            Statics.field1352 = Statics.field91;
        } else {
            Statics.field1352 = Statics.field1720;
        }
        field317++;
        if (field317 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field289 <= 5) {
                this.method1948("js5connect_full");
                field289 = 1000;
            } else {
                field312 = 3000;
            }
        } else if (field317 >= 2 && arg0 == 6) {
            this.method1948("js5connect_outofdate");
            field289 = 1000;
        } else if (field317 >= 4) {
            if (field289 <= 5) {
                this.method1948("js5connect");
                field289 = 1000;
            } else {
                field312 = 3000;
            }
        }
    }

    @ObfuscatedName("fr.j(I)V")
    public static void method3039() {
        if (field543 == 0) {
            Statics.field57 = new class88(4, 104, 104, class11.field104);
            for (int var0 = 0; var0 < 4; var0++) {
                field412[var0] = new class118(104, 104);
            }
            Statics.field2669 = new class225(512, 512);
            class42.field827 = class174.field2351;
            class42.field826 = 5;
            field543 = 20;
        } else if (field543 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1439[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1635(var1, 500, 800, 512, 334);
            class42.field827 = class174.field2599;
            class42.field826 = 10;
            field543 = 30;
        } else if (field543 == 30) {
            Statics.field47 = method99(0, false, true, true);
            Statics.field121 = method99(1, false, true, true);
            Statics.field937 = method99(2, true, false, true);
            Statics.field350 = method99(3, false, true, true);
            Statics.field95 = method99(4, false, true, true);
            Statics.field564 = method99(5, true, true, true);
            Statics.field782 = method99(6, true, true, false);
            Statics.field315 = method99(7, false, true, true);
            Statics.field5 = method99(8, false, true, true);
            Statics.field50 = method99(9, false, true, true);
            Statics.field957 = method99(10, false, true, true);
            Statics.field2137 = method99(11, false, true, true);
            Statics.field1899 = method99(12, false, true, true);
            Statics.field1844 = method99(13, true, false, true);
            Statics.field137 = method99(14, false, true, false);
            Statics.field344 = method99(15, false, true, true);
            class42.field827 = class174.field2353;
            class42.field826 = 20;
            field543 = 40;
        } else if (field543 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field47.method3155() * 4 / 100;
            int var8 = var7 + Statics.field121.method3155() * 4 / 100;
            int var9 = var8 + Statics.field937.method3155() * 2 / 100;
            int var10 = var9 + Statics.field350.method3155() * 2 / 100;
            int var11 = var10 + Statics.field95.method3155() * 6 / 100;
            int var12 = var11 + Statics.field564.method3155() * 4 / 100;
            int var13 = var12 + Statics.field782.method3155() * 2 / 100;
            int var14 = var13 + Statics.field315.method3155() * 60 / 100;
            int var15 = var14 + Statics.field5.method3155() * 2 / 100;
            int var16 = var15 + Statics.field50.method3155() * 2 / 100;
            int var17 = var16 + Statics.field957.method3155() * 2 / 100;
            int var18 = var17 + Statics.field2137.method3155() * 2 / 100;
            int var19 = var18 + Statics.field1899.method3155() * 2 / 100;
            int var20 = var19 + Statics.field1844.method3155() * 2 / 100;
            int var21 = var20 + Statics.field137.method3155() * 2 / 100;
            int var22 = var21 + Statics.field344.method3155() * 2 / 100;
            if (var22 == 100) {
                class42.field827 = class174.field2380;
                class42.field826 = 30;
                field543 = 45;
            } else {
                if (var22 != 0) {
                    class42.field827 = class174.field2354 + var22 + "%";
                }
                class42.field826 = 30;
            }
        } else if (field543 == 45) {
            class58.method242(22050, !field287, 2);
            class140 var23 = new class140();
            var23.method2413(9, 128);
            Statics.field523 = class58.method176(Statics.field882, Statics.field2146, 0, 22050);
            Statics.field523.method1009(var23);
            class185 var24 = Statics.field344;
            class185 var25 = Statics.field137;
            class185 var26 = Statics.field95;
            Statics.field1902 = var24;
            Statics.field1903 = var25;
            Statics.field211 = var26;
            Statics.field1900 = var23;
            Statics.field151 = class58.method176(Statics.field882, Statics.field2146, 1, 2048);
            Statics.field223 = new class52();
            Statics.field151.method1009(Statics.field223);
            Statics.field1962 = new class66(22050, Statics.field66);
            class42.field827 = class174.field2356;
            class42.field826 = 35;
            field543 = 50;
        } else if (field543 == 50) {
            int var27 = 0;
            if (Statics.field1187 == null) {
                class185 var28 = Statics.field5;
                class185 var29 = Statics.field1844;
                int var30 = var28.method3076("p11_full");
                int var31 = var28.method3077(var30, "");
                class209 var32 = class226.method1081(var28, var29, var30, var31);
                Statics.field1187 = var32;
            } else {
                var27++;
            }
            if (Statics.field236 == null) {
                class185 var33 = Statics.field5;
                class185 var34 = Statics.field1844;
                int var35 = var33.method3076("p12_full");
                int var36 = var33.method3077(var35, "");
                class209 var37 = class226.method1081(var33, var34, var35, var36);
                Statics.field236 = var37;
            } else {
                var27++;
            }
            if (Statics.field1622 == null) {
                class185 var38 = Statics.field5;
                class185 var39 = Statics.field1844;
                int var40 = var38.method3076("b12_full");
                int var41 = var38.method3077(var40, "");
                class209 var42 = class226.method1081(var38, var39, var40, var41);
                Statics.field1622 = var42;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class42.field827 = class174.field2399 + var27 * 100 / 3 + "%";
                class42.field826 = 40;
            } else {
                Statics.field1596 = new class231(true);
                class42.field827 = class174.field2358;
                class42.field826 = 40;
                field543 = 60;
            }
        } else if (field543 == 60) {
            int var43 = class42.method1594(Statics.field957, Statics.field5);
            byte var44 = 9;
            if (var43 < var44) {
                class42.field827 = class174.field2359 + var43 * 100 / var44 + "%";
                class42.field826 = 50;
            } else {
                class42.field827 = class174.field2417;
                class42.field826 = 50;
                method177(5);
                field543 = 70;
            }
        } else if (field543 == 70) {
            if (Statics.field937.method3081()) {
                class201.method2557(Statics.field937);
                class192.method2078(Statics.field937);
                class193.method3037(Statics.field937, Statics.field315);
                class198.method2326(Statics.field937, Statics.field315, field287);
                class200.method31(Statics.field937, Statics.field315);
                class199.method2525(Statics.field937, Statics.field315, field286, Statics.field1187);
                class202.method2496(Statics.field937, Statics.field47, Statics.field121);
                class185 var46 = Statics.field937;
                class185 var47 = Statics.field315;
                Statics.field2779 = var46;
                Statics.field2782 = var47;
                class185 var48 = Statics.field937;
                Statics.field2837 = var48;
                class188.method1850(Statics.field937);
                class170.method210(Statics.field350, Statics.field315, Statics.field5, Statics.field1844);
                class185 var49 = Statics.field937;
                Statics.field2749 = var49;
                class185 var50 = Statics.field937;
                Statics.field2848 = var50;
                class189.method202(Statics.field937);
                class185 var51 = Statics.field937;
                Statics.field2765 = var51;
                Statics.field1542 = new class47();
                class197.method697(Statics.field937, Statics.field5, Statics.field1844);
                class194.method2068(Statics.field937, Statics.field5);
                class42.field827 = class174.field2362;
                class42.field826 = 60;
                field543 = 80;
            } else {
                class42.field827 = class174.field2361 + Statics.field937.method3154() + "%";
                class42.field826 = 60;
            }
        } else if (field543 == 80) {
            int var52 = 0;
            if (Statics.field74 == null) {
                class185 var53 = Statics.field5;
                int var54 = var53.method3076("compass");
                int var55 = var53.method3077(var54, "");
                class225 var56 = class226.method1340(var53, var54, var55);
                Statics.field74 = var56;
            } else {
                var52++;
            }
            if (Statics.field902 == null) {
                class185 var57 = Statics.field5;
                int var58 = var57.method3076("mapedge");
                int var59 = var57.method3077(var58, "");
                class225 var60 = class226.method1340(var57, var58, var59);
                Statics.field902 = var60;
            } else {
                var52++;
            }
            if (Statics.field1781 == null) {
                Statics.field1781 = class226.method2801(Statics.field5, "mapscene", "");
            } else {
                var52++;
            }
            if (Statics.field3105 == null) {
                Statics.field3105 = class226.method593(Statics.field5, "mapfunction", "");
            } else {
                var52++;
            }
            if (Statics.field1937 == null) {
                Statics.field1937 = class226.method593(Statics.field5, "headicons_pk", "");
            } else {
                var52++;
            }
            if (Statics.field67 == null) {
                Statics.field67 = class226.method593(Statics.field5, "headicons_prayer", "");
            } else {
                var52++;
            }
            if (Statics.field254 == null) {
                Statics.field254 = class226.method593(Statics.field5, "headicons_hint", "");
            } else {
                var52++;
            }
            if (Statics.field2170 == null) {
                Statics.field2170 = class226.method593(Statics.field5, "mapmarker", "");
            } else {
                var52++;
            }
            if (Statics.field2002 == null) {
                Statics.field2002 = class226.method593(Statics.field5, "cross", "");
            } else {
                var52++;
            }
            if (Statics.field2130 == null) {
                Statics.field2130 = class226.method593(Statics.field5, "mapdots", "");
            } else {
                var52++;
            }
            if (Statics.field1201 == null) {
                Statics.field1201 = class226.method2801(Statics.field5, "scrollbar", "");
            } else {
                var52++;
            }
            if (Statics.field1627 == null) {
                Statics.field1627 = class226.method2801(Statics.field5, "mod_icons", "");
            } else {
                var52++;
            }
            if (var52 < 12) {
                class42.field827 = class174.field2363 + var52 * 100 / 12 + "%";
                class42.field826 = 70;
            } else {
                Statics.field3091 = Statics.field1627;
                Statics.field902.method3967();
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 41.0D) - 20;
                for (int var65 = 0; var65 < Statics.field3105.length; var65++) {
                    Statics.field3105[var65].method3875(var61 + var64, var62 + var64, var63 + var64);
                }
                Statics.field1781[0].method3841(var61 + var64, var62 + var64, var63 + var64);
                class42.field827 = class174.field2406;
                class42.field826 = 70;
                field543 = 90;
            }
        } else if (field543 == 90) {
            if (Statics.field50.method3081()) {
                class75 var66 = new class75(Statics.field50, Statics.field5, 20, 0.8D, field287 ? 64 : 128);
                class85.method1535(var66);
                class85.method1536(0.8D);
                class42.field827 = class174.field2401;
                class42.field826 = 90;
                field543 = 110;
            } else {
                class42.field827 = class174.field2347 + Statics.field50.method3154() + "%";
                class42.field826 = 90;
            }
        } else if (field543 == 110) {
            Statics.field2797 = new class21();
            Statics.field882.method1815(Statics.field2797, 10);
            class42.field827 = class174.field2452;
            class42.field826 = 94;
            field543 = 120;
        } else if (field543 == 120) {
            if (Statics.field957.method3079("huffman", "")) {
                class146 var67 = new class146(Statics.field957.method3078("huffman", ""));
                Statics.field3107 = var67;
                class42.field827 = class174.field2369;
                class42.field826 = 96;
                field543 = 130;
            } else {
                class42.field827 = class174.field2368 + "%";
                class42.field826 = 96;
            }
        } else if (field543 == 130) {
            if (!Statics.field350.method3081()) {
                class42.field827 = class174.field2370 + Statics.field350.method3154() * 4 / 5 + "%";
                class42.field826 = 100;
            } else if (!Statics.field1899.method3081()) {
                class42.field827 = class174.field2370 + (80 + Statics.field1899.method3154() / 6) + "%";
                class42.field826 = 100;
            } else if (Statics.field1844.method3081()) {
                class42.field827 = class174.field2371;
                class42.field826 = 100;
                field543 = 140;
            } else {
                class42.field827 = class174.field2370 + (96 + Statics.field1844.method3154() / 20) + "%";
                class42.field826 = 100;
            }
        } else if (field543 == 140) {
            method177(10);
        }
    }

    @ObfuscatedName("d.p(IZZZB)Lgy;")
    public static class185 method99(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1677 != null) {
            var4 = new class117(arg0, class105.field1677, Statics.field3161[arg0], 1000000);
        }
        return new class185(var4, Statics.field61, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bn.k(I)V")
    public static final void method1068() {
        try {
            if (field330 == 0) {
                if (Statics.field775 != null) {
                    Statics.field775.method1916();
                    Statics.field775 = null;
                }
                Statics.field3224 = null;
                field338 = false;
                field319 = 0;
                field330 = 1;
            }
            if (field330 == 1) {
                if (Statics.field3224 == null) {
                    Statics.field3224 = Statics.field882.method1814(Statics.field2070, Statics.field1352);
                }
                if (Statics.field3224.field1649 == 2) {
                    throw new IOException();
                }
                if (Statics.field3224.field1649 == 1) {
                    Statics.field775 = new class111((Socket) Statics.field3224.field1653, Statics.field882);
                    Statics.field3224 = null;
                    field330 = 2;
                }
            }
            if (field330 == 2) {
                field327.field2073 = 0;
                field327.method2573(14);
                Statics.field775.method1908(field327.field2078, 0, 1);
                field410.field2073 = 0;
                field330 = 3;
            }
            if (field330 == 3) {
                if (Statics.field523 != null) {
                    Statics.field523.method1005();
                }
                if (Statics.field151 != null) {
                    Statics.field151.method1005();
                }
                int var0 = Statics.field775.method1911();
                if (Statics.field523 != null) {
                    Statics.field523.method1005();
                }
                if (Statics.field151 != null) {
                    Statics.field151.method1005();
                }
                if (var0 != 0) {
                    Statics.method724(var0);
                    return;
                }
                field410.field2073 = 0;
                field330 = 5;
            }
            if (field330 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field327.field2073 = 0;
                field327.method2573(1);
                field327.method2573(class42.field835.method728());
                field327.method2576(var1[0]);
                field327.method2576(var1[1]);
                field327.method2576(var1[2]);
                field327.method2576(var1[3]);
                switch(class42.field835.field1623) {
                    case 0:
                    case 3:
                        field327.method2727(Statics.field1748);
                        field327.field2073 += 5;
                        break;
                    case 1:
                        field327.method2576((Integer) Statics.field22.field692.get(class208.method3324(class42.field813)));
                        field327.field2073 += 4;
                        break;
                    case 2:
                        field327.field2073 += 8;
                }
                field327.method2624(class42.field834);
                field327.method2609(class40.field798, class40.field794);
                field418.field2073 = 0;
                if (field289 == 40) {
                    field418.method2573(18);
                } else {
                    field418.method2573(16);
                }
                field418.method2731(0);
                int var2 = field418.field2073;
                field418.method2576(130);
                field418.method2582(field327.field2078, 0, field327.field2073);
                int var3 = field418.field2073;
                field418.method2624(class42.field813);
                field418.method2573((field495 ? 1 : 0) << 1 | (field287 ? 1 : 0));
                field418.method2731(Statics.field2);
                field418.method2731(Statics.field1100);
                class160 var4 = field418;
                byte[] var5 = new byte[24];
                try {
                    class105.field1683.method1265(0L);
                    class105.field1683.method1267(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var27) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2582(var5, 0, 24);
                field418.method2624(Statics.field3168);
                field418.method2576(Statics.field2332);
                class154 var9 = new class154(Statics.field1596.method4008());
                Statics.field1596.method4005(var9);
                field418.method2582(var9.field2078, 0, var9.field2078.length);
                field418.method2573(Statics.field3035);
                field418.method2576(Statics.field47.field2699);
                field418.method2576(Statics.field121.field2699);
                field418.method2576(Statics.field937.field2699);
                field418.method2576(Statics.field350.field2699);
                field418.method2576(Statics.field95.field2699);
                field418.method2576(Statics.field564.field2699);
                field418.method2576(Statics.field782.field2699);
                field418.method2576(Statics.field315.field2699);
                field418.method2576(Statics.field5.field2699);
                field418.method2576(Statics.field50.field2699);
                field418.method2576(Statics.field957.field2699);
                field418.method2576(Statics.field2137.field2699);
                field418.method2576(Statics.field1899.field2699);
                field418.method2576(Statics.field1844.field2699);
                field418.method2576(Statics.field137.field2699);
                field418.method2576(Statics.field344.field2699);
                field418.method2607(var1, var3, field418.field2073);
                field418.method2584(field418.field2073 - var2);
                Statics.field775.method1908(field418.field2078, 0, field418.field2073);
                field327.method2831(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field410.method2831(var1);
                field330 = 6;
            }
            if (field330 == 6 && Statics.field775.method1907() > 0) {
                int var11 = Statics.field775.method1911();
                if (var11 == 21 && field289 == 20) {
                    field330 = 7;
                } else if (var11 == 2) {
                    field330 = 9;
                } else if (var11 == 15 && field289 == 40) {
                    field329 = -1;
                    field330 = 13;
                } else if (var11 == 23 && field320 < 1) {
                    field320++;
                    field330 = 0;
                } else if (var11 == 29) {
                    field330 = 11;
                } else {
                    Statics.method724(var11);
                    return;
                }
            }
            if (field330 == 7 && Statics.field775.method1907() > 0) {
                field321 = (Statics.field775.method1911() + 3) * 60;
                field330 = 8;
            }
            if (field330 == 8) {
                field319 = 0;
                class42.method2080(class174.field2560, class174.field2376, field321 / 60 + class174.field2515);
                if (--field321 <= 0) {
                    field330 = 0;
                }
            } else {
                if (field330 == 9 && Statics.field775.method1907() >= 13) {
                    boolean var12 = Statics.field775.method1911() == 1;
                    Statics.field775.method1904(field410.field2078, 0, 4);
                    field410.field2073 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field410.method2833() << 24;
                        int var15 = var14 | field410.method2833() << 16;
                        int var16 = var15 | field410.method2833() << 8;
                        int var17 = var16 | field410.method2833();
                        int var18 = class208.method3324(class42.field813);
                        if (Statics.field22.field692.size() >= 10 && !Statics.field22.field692.containsKey(var18)) {
                            Iterator var19 = Statics.field22.field692.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field22.field692.put(var18, var17);
                        class31.method109();
                    }
                    field353 = Statics.field775.method1911();
                    field450 = Statics.field775.method1911() == 1;
                    field405 = Statics.field775.method1911();
                    field405 <<= 0x8;
                    field405 += Statics.field775.method1911();
                    field462 = Statics.field775.method1911();
                    Statics.field775.method1904(field410.field2078, 0, 1);
                    field410.field2073 = 0;
                    field375 = field410.method2833();
                    Statics.field775.method1904(field410.field2078, 0, 2);
                    field410.field2073 = 0;
                    field329 = field410.method2581();
                    try {
                        class101.method1800(Statics.field280, "zap");
                    } catch (Throwable var26) {
                    }
                    field330 = 10;
                }
                if (field330 != 10) {
                    if (field330 == 11 && Statics.field775.method1907() >= 2) {
                        field410.field2073 = 0;
                        Statics.field775.method1904(field410.field2078, 0, 2);
                        field410.field2073 = 0;
                        Statics.field1977 = field410.method2581();
                        field330 = 12;
                    }
                    if (field330 == 12 && Statics.field775.method1907() >= Statics.field1977) {
                        field410.field2073 = 0;
                        Statics.field775.method1904(field410.field2078, 0, Statics.field1977);
                        field410.field2073 = 0;
                        String var21 = field410.method2778();
                        String var22 = field410.method2778();
                        String var23 = field410.method2778();
                        class42.method2080(var21, var22, var23);
                        method177(10);
                    }
                    if (field330 == 13) {
                        if (field329 == -1) {
                            if (Statics.field775.method1907() < 2) {
                                return;
                            }
                            Statics.field775.method1904(field410.field2078, 0, 2);
                            field410.field2073 = 0;
                            field329 = field410.method2581();
                        }
                        if (Statics.field775.method1907() >= field329) {
                            Statics.field775.method1904(field410.field2078, 0, field329);
                            field410.field2073 = 0;
                            int var24 = field329;
                            method190();
                            class46.method708(field410);
                            if (field410.field2073 != var24) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field319++;
                        if (field319 > 2000) {
                            if (field320 < 1) {
                                if (Statics.field1720 == Statics.field1352) {
                                    Statics.field1352 = Statics.field91;
                                } else {
                                    Statics.field1352 = Statics.field1720;
                                }
                                field320++;
                                field330 = 0;
                            } else {
                                Statics.method724(-3);
                            }
                        }
                    }
                } else if (Statics.field775.method1907() >= field329) {
                    field410.field2073 = 0;
                    Statics.field775.method1904(field410.field2078, 0, field329);
                    method1342();
                    class46.method708(field410);
                    Statics.field232 = -1;
                    method683(false);
                    field375 = -1;
                }
            }
        } catch (IOException var28) {
            if (field320 < 1) {
                if (Statics.field1720 == Statics.field1352) {
                    Statics.field1352 = Statics.field91;
                } else {
                    Statics.field1352 = Statics.field1720;
                }
                field320++;
                field330 = 0;
            } else {
                Statics.method724(-2);
            }
        }
    }

    @ObfuscatedName("bf.r(I)V")
    public static void method1342() {
        field292 = -1L;
        field295 = -1;
        Statics.field2797.field215 = 0;
        Statics.field220 = true;
        field296 = true;
        field507 = -1L;
        class228.field3229 = new class127();
        field327.field2073 = 0;
        field410.field2073 = 0;
        field375 = -1;
        field334 = -1;
        field335 = -1;
        field336 = -1;
        field309 = 0;
        field298 = 0;
        field337 = 0;
        field299 = 0;
        field423 = 0;
        field422 = false;
        class116.field1784 = 0;
        class48.field924.clear();
        class48.field923.method2158();
        class48.field922.method2300();
        class48.field920 = 0;
        field448 = 0;
        field436 = false;
        field517 = 0;
        field348 = (int) (Math.random() * 100.0D) - 50;
        field395 = (int) (Math.random() * 110.0D) - 55;
        field352 = (int) (Math.random() * 80.0D) - 40;
        field355 = (int) (Math.random() * 120.0D) - 60;
        field357 = (int) (Math.random() * 30.0D) - 20;
        field368 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field544 = 0;
        field360 = -1;
        field515 = 0;
        field548 = 0;
        field307 = class41.field799;
        field308 = class41.field799;
        field323 = 0;
        class46.method3250();
        for (int var0 = 0; var0 < 2048; var0++) {
            field434[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field322[var1] = null;
        }
        field413 = -1;
        field416.method2236();
        field406.method2236();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field414[var2][var3][var4] = null;
                }
            }
        }
        field546 = new class129();
        field466 = 0;
        field549 = 0;
        field553 = 0;
        for (int var5 = 0; var5 < Statics.field2751; var5++) {
            class188 var6 = class188.method672(var5);
            if (var6 != null) {
                class166.field2149[var5] = 0;
                class166.field2147[var5] = 0;
            }
        }
        Statics.field1542.method817();
        field449 = -1;
        if (field441 != -1) {
            int var7 = field441;
            if (var7 != -1 && Statics.field55[var7]) {
                Statics.field2246.method3073(var7);
                if (Statics.field2279[var7] != null) {
                    boolean var8 = true;
                    for (int var9 = 0; var9 < Statics.field2279[var7].length; var9++) {
                        if (Statics.field2279[var7][var9] != null) {
                            if (Statics.field2279[var7][var9].field2300 == 2) {
                                var8 = false;
                            } else {
                                Statics.field2279[var7][var9] = null;
                            }
                        }
                    }
                    if (var8) {
                        Statics.field2279[var7] = null;
                    }
                    Statics.field55[var7] = false;
                }
            }
        }
        for (class18 var10 = (class18) field442.method2195(); var10 != null; var10 = (class18) field442.method2194()) {
            method32(var10, true);
        }
        field441 = -1;
        field442 = new class126(8);
        field538 = null;
        field422 = false;
        field423 = 0;
        field561.method2922((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var11 = 0; var11 < 8; var11++) {
            field467[var11] = null;
            field411[var11] = false;
        }
        Statics.method2810();
        field302 = true;
        for (int var12 = 0; var12 < 100; var12++) {
            field486[var12] = true;
        }
        field327.method2832(112);
        field327.method2573(method3134());
        field327.method2731(Statics.field2);
        field327.method2731(Statics.field1100);
        field508 = null;
        Statics.field1985 = 0;
        Statics.field697 = null;
        for (int var13 = 0; var13 < 8; var13++) {
            field383[var13] = new class5();
        }
        Statics.field124 = null;
    }

    @ObfuscatedName("y.y(B)V")
    public static void method190() {
        field327.field2073 = 0;
        field410.field2073 = 0;
        field375 = -1;
        field334 = -1;
        field335 = -1;
        field336 = -1;
        field329 = 0;
        field309 = 0;
        field298 = 0;
        field423 = 0;
        field422 = false;
        field544 = 0;
        field515 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field434[var0] = null;
        }
        Statics.field2019 = null;
        for (int var1 = 0; var1 < field322.length; var1++) {
            class36 var2 = field322[var1];
            if (var2 != null) {
                var2.field626 = -1;
                var2.field614 = false;
            }
        }
        Statics.method2810();
        method177(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field486[var3] = true;
        }
        field327.method2832(112);
        field327.method2573(method3134());
        field327.method2731(Statics.field2);
        field327.method2731(Statics.field1100);
    }

    @ObfuscatedName("m.s(I)V")
    public static final void method151() {
        if (Statics.field775 != null) {
            Statics.field775.method1916();
            Statics.field775 = null;
        }
        method1442();
        Statics.field57.method1705();
        for (int var0 = 0; var0 < 4; var0++) {
            field412[var0].method2084();
        }
        System.gc();
        class139.field1901 = 1;
        Statics.field1904 = null;
        Statics.field921 = -1;
        Statics.field3 = -1;
        Statics.field1467 = 0;
        Statics.field917 = false;
        Statics.field1905 = 2;
        field445 = -1;
        field520 = false;
        class32.method3040();
        method177(10);
    }

    @ObfuscatedName("cr.w(I)V")
    public static final void method1442() {
        class201.method1901();
        Statics.method3045();
        class193.method853();
        class198.field2905.method2176();
        class198.field2930.method2176();
        class198.field2885.method2176();
        class198.field2909.method2176();
        Statics.method710();
        class199.method2311();
        class202.field3045.method2176();
        class202.field3041.method2176();
        class191.field2769.method2176();
        class191.field2770.method2176();
        Statics.method80();
        class188.field2753.method2176();
        class197.field2855.method2176();
        class197.field2856.method2176();
        class197.field2857.method2176();
        class194.field2816.method2176();
        class194.field2825.method2176();
        class167.method1292();
        class170.method1798();
        ((class75) Statics.field1435).method1321();
        class49.field930.method2176();
        Statics.field47.method3074();
        Statics.field121.method3074();
        Statics.field350.method3074();
        Statics.field95.method3074();
        Statics.field564.method3074();
        Statics.field782.method3074();
        Statics.field315.method3074();
        Statics.field5.method3074();
        Statics.field50.method3074();
        Statics.field957.method3074();
        Statics.field2137.method3074();
        Statics.field1899.method3074();
    }

    @ObfuscatedName("ce.n(B)V")
    public static final void method1775() {
        if (field337 > 0) {
            method151();
        } else {
            method177(40);
            Statics.field1644 = Statics.field775;
            Statics.field775 = null;
        }
    }

    @ObfuscatedName("ea.o(B)V")
    public static final void method2524() {
        if (field298 > 1) {
            field298--;
        }
        if (field337 > 0) {
            field337--;
        }
        if (field338) {
            field338 = false;
            method1775();
            return;
        }
        if (!field422) {
            field428[0] = class174.field2533;
            field429[0] = "";
            field426[0] = 1006;
            field423 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field775 == null) {
                var1 = false;
            } else {
                label2637: {
                    try {
                        int var2 = Statics.field775.method1907();
                        if (var2 == 0) {
                            var1 = false;
                            break label2637;
                        }
                        if (field375 == -1) {
                            Statics.field775.method1904(field410.field2078, 0, 1);
                            field410.field2073 = 0;
                            field375 = field410.method2833();
                            field329 = class213.field3131[field375];
                            var2--;
                        }
                        if (field329 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2637;
                            }
                            Statics.field775.method1904(field410.field2078, 0, 1);
                            field329 = field410.field2078[0] & 0xFF;
                            var2--;
                        }
                        if (field329 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2637;
                            }
                            Statics.field775.method1904(field410.field2078, 0, 2);
                            field410.field2073 = 0;
                            field329 = field410.method2581();
                            var2 -= 2;
                        }
                        if (var2 < field329) {
                            var1 = false;
                            break label2637;
                        }
                        field410.field2073 = 0;
                        Statics.field775.method1904(field410.field2078, 0, field329);
                        field309 = 0;
                        field336 = field335;
                        field335 = field334;
                        field334 = field375;
                        if (field375 == 250) {
                            boolean var3 = field410.method2617() == 1;
                            int var4 = field410.method2593();
                            class170 var5 = class170.method786(var4);
                            if (var5.field2206 != var3) {
                                var5.field2206 = var3;
                                method88(var5);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 172) {
                            String var6 = field410.method2778();
                            int var7 = field410.method2615();
                            int var8 = field410.method2708();
                            if (var7 >= 1 && var7 <= 8) {
                                if (var6.equalsIgnoreCase("null")) {
                                    var6 = null;
                                }
                                field467[var7 - 1] = var6;
                                field411[var7 - 1] = var8 == 0;
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 3) {
                            int var9 = field410.method2749();
                            int var10 = field410.method2581();
                            class166.field2149[var10] = var9;
                            if (class166.field2147[var10] != var9) {
                                class166.field2147[var10] = var9;
                            }
                            method3325(var10);
                            field288[++field468 - 1 & 0x1F] = var10;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 158) {
                            class46.method3250();
                            for (int var11 = 0; var11 < 2048; var11++) {
                                field434[var11] = null;
                            }
                            class46.method708(field410);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 63) {
                            int var12 = field410.method2633();
                            class170 var13 = class170.method786(var12);
                            for (int var14 = 0; var14 < var13.field2295.length; var14++) {
                                var13.field2295[var14] = -1;
                                var13.field2295[var14] = 0;
                            }
                            method88(var13);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 189) {
                            int var15 = field410.method2735();
                            field441 = var15;
                            method65(field441, Statics.field2, Statics.field1100, false);
                            method2829(var15);
                            class33.method187(field441);
                            for (int var16 = 0; var16 < 100; var16++) {
                                field486[var16] = true;
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 223) {
                            field515 = field410.method2708();
                            if (field515 == 255) {
                                field515 = 0;
                            }
                            field548 = field410.method2708();
                            if (field548 == 255) {
                                field548 = 0;
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 55) {
                            field530 = true;
                            Statics.field961 = field410.method2708();
                            Statics.field21 = field410.method2708();
                            Statics.field2062 = field410.method2581();
                            Statics.field1080 = field410.method2708();
                            Statics.field926 = field410.method2708();
                            if (Statics.field926 >= 100) {
                                int var17 = Statics.field961 * 128 + 64;
                                int var18 = Statics.field21 * 128 + 64;
                                int var19 = method3046(var17, var18, Statics.field1075) - Statics.field2062;
                                int var20 = var17 - Statics.field771;
                                int var21 = var19 - Statics.field773;
                                int var22 = var18 - Statics.field1288;
                                int var23 = (int) Math.sqrt((double) (var20 * var20 + var22 * var22));
                                Statics.field2151 = (int) (Math.atan2((double) var21, (double) var23) * 325.949D) & 0x7FF;
                                Statics.field274 = (int) (Math.atan2((double) var20, (double) var22) * -325.949D) & 0x7FF;
                                if (Statics.field2151 < 128) {
                                    Statics.field2151 = 128;
                                }
                                if (Statics.field2151 > 383) {
                                    Statics.field2151 = 383;
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 167) {
                            int var24 = field410.method2766();
                            int var25 = field410.method2781();
                            int var26 = field410.method2632();
                            class170 var27 = class170.method786(var26);
                            if (var27.field2195 != var25 || var27.field2196 != var24 || var27.field2231 != 0 || var27.field2192 != 0) {
                                var27.field2195 = var25;
                                var27.field2196 = var24;
                                var27.field2231 = 0;
                                var27.field2192 = 0;
                                method88(var27);
                                method167(var27);
                                if (var27.field2300 == 0) {
                                    method98(Statics.field2279[var26 >> 16], var27, false);
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 30) {
                            int var28 = field410.method2708();
                            class217[] var29 = new class217[] { class217.field3163, class217.field3166, class217.field3164 };
                            class217[] var30 = var29;
                            int var31 = 0;
                            class217 var33;
                            while (true) {
                                if (var31 >= var30.length) {
                                    var33 = null;
                                    break;
                                }
                                class217 var32 = var30[var31];
                                if (var32.field3162 == var28) {
                                    var33 = var32;
                                    break;
                                }
                                var31++;
                            }
                            Statics.field1468 = var33;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 13) {
                            String var34 = field410.method2778();
                            int var35 = field410.method2581();
                            byte var36 = field410.method2754();
                            boolean var37 = false;
                            if (var36 == -128) {
                                var37 = true;
                            }
                            if (var37) {
                                if (Statics.field1985 == 0) {
                                    field375 = -1;
                                    var1 = true;
                                    break label2637;
                                }
                                boolean var38 = false;
                                int var39;
                                for (var39 = 0; var39 < Statics.field1985 && (!Statics.field697[var39].field275.equals(var34) || Statics.field697[var39].field273 != var35); var39++) {
                                }
                                if (var39 < Statics.field1985) {
                                    while (var39 < Statics.field1985 - 1) {
                                        Statics.field697[var39] = Statics.field697[var39 + 1];
                                        var39++;
                                    }
                                    Statics.field1985--;
                                    Statics.field697[Statics.field1985] = null;
                                }
                            } else {
                                field410.method2778();
                                class25 var40 = new class25();
                                var40.field275 = var34;
                                var40.field272 = class205.method2433(var40.field275, Statics.field210);
                                var40.field273 = var35;
                                var40.field271 = var36;
                                int var41;
                                for (var41 = Statics.field1985 - 1; var41 >= 0; var41--) {
                                    int var42 = Statics.field697[var41].field272.compareTo(var40.field272);
                                    if (var42 == 0) {
                                        Statics.field697[var41].field273 = var35;
                                        Statics.field697[var41].field271 = var36;
                                        if (var34.equals(Statics.field2019.field244)) {
                                            Statics.field1832 = var36;
                                        }
                                        field475 = field447;
                                        field375 = -1;
                                        var1 = true;
                                        break label2637;
                                    }
                                    if (var42 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1985 >= Statics.field697.length) {
                                    field375 = -1;
                                    var1 = true;
                                    break label2637;
                                }
                                for (int var43 = Statics.field1985 - 1; var43 > var41; var43--) {
                                    Statics.field697[var43 + 1] = Statics.field697[var43];
                                }
                                if (Statics.field1985 == 0) {
                                    Statics.field697 = new class25[100];
                                }
                                Statics.field697[var41 + 1] = var40;
                                Statics.field1985++;
                                if (var34.equals(Statics.field2019.field244)) {
                                    Statics.field1832 = var36;
                                }
                            }
                            field475 = field447;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 143) {
                            int var44 = field410.method2776();
                            boolean var45 = field410.method2708() == 1;
                            String var46 = "";
                            boolean var47 = false;
                            if (var45) {
                                var46 = field410.method2778();
                                if (method2918(var46)) {
                                    var47 = true;
                                }
                            }
                            String var48 = field410.method2778();
                            if (!var47) {
                                class48.method100(var44, var46, var48);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 219) {
                            field299 = field410.method2708();
                            if (field299 == 1) {
                                field300 = field410.method2581();
                            }
                            if (field299 >= 2 && field299 <= 6) {
                                if (field299 == 2) {
                                    field305 = 64;
                                    field324 = 64;
                                }
                                if (field299 == 3) {
                                    field305 = 0;
                                    field324 = 64;
                                }
                                if (field299 == 4) {
                                    field305 = 128;
                                    field324 = 64;
                                }
                                if (field299 == 5) {
                                    field305 = 64;
                                    field324 = 0;
                                }
                                if (field299 == 6) {
                                    field305 = 64;
                                    field324 = 128;
                                }
                                field299 = 2;
                                field531 = field410.method2581();
                                field427 = field410.method2581();
                                field535 = field410.method2708();
                            }
                            if (field299 == 10) {
                                field545 = field410.method2581();
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 25) {
                            field530 = true;
                            Statics.field238 = field410.method2708();
                            Statics.field108 = field410.method2708();
                            Statics.field1777 = field410.method2581();
                            Statics.field2005 = field410.method2708();
                            Statics.field2001 = field410.method2708();
                            if (Statics.field2001 >= 100) {
                                Statics.field771 = Statics.field238 * 128 + 64;
                                Statics.field1288 = Statics.field108 * 128 + 64;
                                Statics.field773 = method3046(Statics.field771, Statics.field1288, Statics.field1075) - Statics.field1777;
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 180) {
                            method1834(field410.method2778());
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 36) {
                            String var49 = field410.method2778();
                            Object[] var50 = new Object[var49.length() + 1];
                            for (int var51 = var49.length() - 1; var51 >= 0; var51--) {
                                if (var49.charAt(var51) == 's') {
                                    var50[var51 + 1] = field410.method2778();
                                } else {
                                    var50[var51 + 1] = Integer.valueOf(field410.method2593());
                                }
                            }
                            var50[0] = Integer.valueOf(field410.method2593());
                            class19 var52 = new class19();
                            var52.field204 = var50;
                            class33.method857(var52, 200000);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 249) {
                            if (field441 != -1) {
                                int var53 = field441;
                                if (class170.method1780(var53)) {
                                    method2439(Statics.field2279[var53], 0);
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 61) {
                            int var54 = field410.method2593();
                            int var55 = field410.method2593();
                            if (Statics.field78 == null || !Statics.field78.isValid()) {
                                try {
                                    Iterator var56 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var56.hasNext()) {
                                        GarbageCollectorMXBean var57 = (GarbageCollectorMXBean) var56.next();
                                        if (var57.isValid()) {
                                            Statics.field78 = var57;
                                            field560 = -1L;
                                            field367 = -1L;
                                        }
                                    }
                                } catch (Throwable var403) {
                                }
                            }
                            long var59 = class156.method118();
                            int var61 = -1;
                            if (Statics.field78 != null) {
                                long var62 = Statics.field78.getCollectionTime();
                                if (field367 != -1L) {
                                    long var64 = var62 - field367;
                                    long var66 = var59 - field560;
                                    if (var66 != 0L) {
                                        var61 = (int) (var64 * 100L / var66);
                                    }
                                }
                                field367 = var62;
                                field560 = var59;
                            }
                            field327.method2832(47);
                            field327.method2613(field1764);
                            field327.method2630(var54);
                            field327.method2631(var55);
                            field327.method2614(var61);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 184) {
                            Statics.method693();
                            field552 = field410.method2781();
                            field478 = field447;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 78) {
                            method683(false);
                            field410.method2833();
                            int var68 = field410.method2581();
                            class46.method726(field410, var68);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 62) {
                            int var69 = field410.method2735();
                            class13.method3036(var69);
                            field472[++field470 - 1 & 0x1F] = var69 & 0x7FFF;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 32) {
                            field410.field2073 += 28;
                            if (field410.method2668()) {
                                class160 var70 = field410;
                                int var71 = field410.field2073 - 28;
                                if (class105.field1683 != null) {
                                    try {
                                        class105.field1683.method1265(0L);
                                        class105.field1683.method1290(var70.field2078, var71, 24);
                                    } catch (Exception var400) {
                                    }
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 216) {
                            int var73 = field410.method2593();
                            class18 var74 = (class18) field442.method2190((long) var73);
                            if (var74 != null) {
                                method32(var74, true);
                            }
                            if (field538 != null) {
                                method88(field538);
                                field538 = null;
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 157) {
                            method151();
                            field375 = -1;
                            var1 = false;
                            break label2637;
                        }
                        if (field375 == 182) {
                            field298 = field410.method2575() * 30;
                            field478 = field447;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 102) {
                            int var75 = field410.method2735();
                            byte var76 = field410.method2754();
                            class166.field2149[var75] = var76;
                            if (class166.field2147[var75] != var76) {
                                class166.field2147[var75] = var76;
                            }
                            method3325(var75);
                            field288[++field468 - 1 & 0x1F] = var75;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 133) {
                            int var77 = field410.method2593();
                            int var78 = field410.method2581();
                            if (var77 < -70000) {
                                var78 += 32768;
                            }
                            class170 var79;
                            if (var77 >= 0) {
                                var79 = class170.method786(var77);
                            } else {
                                var79 = null;
                            }
                            if (var79 != null) {
                                for (int var80 = 0; var80 < var79.field2295.length; var80++) {
                                    var79.field2295[var80] = 0;
                                    var79.field2305[var80] = 0;
                                }
                            }
                            class13.method1080(var78);
                            int var81 = field410.method2581();
                            for (int var82 = 0; var82 < var81; var82++) {
                                int var83 = field410.method2708();
                                if (var83 == 255) {
                                    var83 = field410.method2632();
                                }
                                int var84 = field410.method2735();
                                if (var79 != null && var82 < var79.field2295.length) {
                                    var79.field2295[var82] = var84;
                                    var79.field2305[var82] = var83;
                                }
                                class13.method2(var78, var82, var84 - 1, var83);
                            }
                            if (var79 != null) {
                                method88(var79);
                            }
                            Statics.method693();
                            field472[++field470 - 1 & 0x1F] = var78 & 0x7FFF;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 231) {
                            Statics.method693();
                            int var85 = field410.method2616();
                            int var86 = field410.method2708();
                            int var87 = field410.method2749();
                            field420[var85] = var87;
                            field376[var85] = var86;
                            field419[var85] = 1;
                            for (int var88 = 0; var88 < 98; var88++) {
                                if (var87 >= class173.field2334[var88]) {
                                    field419[var85] = var88 + 2;
                                }
                            }
                            field471[++field345 - 1 & 0x1F] = var85;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 210) {
                            int var89 = field410.method2735();
                            if (var89 == 65535) {
                                var89 = -1;
                            }
                            if (var89 == -1 && !field520) {
                                class139.method119();
                            } else if (var89 != -1 && field445 != var89 && field518 != 0 && !field520) {
                                class139.method1593(2, Statics.field782, var89, 0, field518, false);
                            }
                            field445 = var89;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 176) {
                            int var90 = field410.method2628();
                            int var91 = field410.method2735();
                            if (var91 == 65535) {
                                var91 = -1;
                            }
                            if (field518 != 0 && var91 != -1) {
                                class139.method1900(Statics.field2137, var91, 0, field518, false);
                                field520 = true;
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 124) {
                            String var92 = field410.method2778();
                            String var93 = class210.method3657(class208.method590(class211.method729(field410)));
                            class48.method100(6, var92, var93);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 155) {
                            class160 var94 = field410;
                            int var95 = field329;
                            class227 var96 = new class227();
                            var96.field3221 = var94.method2708();
                            var96.field3222 = var94.method2593();
                            var96.field3220 = new int[var96.field3221];
                            var96.field3223 = new int[var96.field3221];
                            var96.field3228 = new Field[var96.field3221];
                            var96.field3225 = new int[var96.field3221];
                            var96.field3226 = new Method[var96.field3221];
                            var96.field3227 = new byte[var96.field3221][][];
                            for (int var97 = 0; var97 < var96.field3221; var97++) {
                                try {
                                    int var98 = var94.method2708();
                                    if (var98 == 0 || var98 == 1 || var98 == 2) {
                                        String var99 = var94.method2778();
                                        String var100 = var94.method2778();
                                        int var101 = 0;
                                        if (var98 == 1) {
                                            var101 = var94.method2593();
                                        }
                                        var96.field3220[var97] = var98;
                                        var96.field3225[var97] = var101;
                                        if (class228.method591(var99).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var96.field3228[var97] = class228.method591(var99).getDeclaredField(var100);
                                    } else if (var98 == 3 || var98 == 4) {
                                        String var102 = var94.method2778();
                                        String var103 = var94.method2778();
                                        int var104 = var94.method2708();
                                        String[] var105 = new String[var104];
                                        for (int var106 = 0; var106 < var104; var106++) {
                                            var105[var106] = var94.method2778();
                                        }
                                        String var107 = var94.method2778();
                                        byte[][] var108 = new byte[var104][];
                                        if (var98 == 3) {
                                            for (int var109 = 0; var109 < var104; var109++) {
                                                int var110 = var94.method2593();
                                                var108[var109] = new byte[var110];
                                                var94.method2787(var108[var109], 0, var110);
                                            }
                                        }
                                        var96.field3220[var97] = var98;
                                        Class[] var111 = new Class[var104];
                                        for (int var112 = 0; var112 < var104; var112++) {
                                            var111[var112] = class228.method591(var105[var112]);
                                        }
                                        Class var113 = class228.method591(var107);
                                        if (class228.method591(var102).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var114 = class228.method591(var102).getDeclaredMethods();
                                        Method[] var115 = var114;
                                        for (int var116 = 0; var116 < var115.length; var116++) {
                                            Method var117 = var115[var116];
                                            if (var117.getName().equals(var103)) {
                                                Class[] var118 = var117.getParameterTypes();
                                                if (var111.length == var118.length) {
                                                    boolean var119 = true;
                                                    for (int var120 = 0; var120 < var111.length; var120++) {
                                                        if (var111[var120] != var118[var120]) {
                                                            var119 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var119 && var113 == var117.getReturnType()) {
                                                        var96.field3226[var97] = var117;
                                                    }
                                                }
                                            }
                                        }
                                        var96.field3227[var97] = var108;
                                    }
                                } catch (ClassNotFoundException var404) {
                                    var96.field3223[var97] = -1;
                                } catch (SecurityException var405) {
                                    var96.field3223[var97] = -2;
                                } catch (NullPointerException var406) {
                                    var96.field3223[var97] = -3;
                                } catch (Exception var407) {
                                    var96.field3223[var97] = -4;
                                } catch (Throwable var408) {
                                    var96.field3223[var97] = -5;
                                }
                            }
                            class228.field3229.method2222(var96);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 190) {
                            for (int var126 = 0; var126 < class166.field2147.length; var126++) {
                                if (class166.field2149[var126] != class166.field2147[var126]) {
                                    class166.field2147[var126] = class166.field2149[var126];
                                    method3325(var126);
                                    field288[++field468 - 1 & 0x1F] = var126;
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 86 || field375 == 225 || field375 == 132 || field375 == 95 || field375 == 27 || field375 == 236 || field375 == 51 || field375 == 181 || field375 == 46 || field375 == 137) {
                            method1809();
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 211) {
                            Statics.field581 = field410.method2708();
                            Statics.field235 = field410.method2616();
                            for (int var127 = Statics.field235; var127 < Statics.field235 + 8; var127++) {
                                for (int var128 = Statics.field581; var128 < Statics.field581 + 8; var128++) {
                                    if (field414[Statics.field1075][var127][var128] != null) {
                                        field414[Statics.field1075][var127][var128] = null;
                                        method782(var127, var128);
                                    }
                                }
                            }
                            for (class26 var129 = (class26) field546.method2242(); var129 != null; var129 = (class26) field546.method2244()) {
                                if (var129.field569 >= Statics.field235 && var129.field569 < Statics.field235 + 8 && var129.field570 >= Statics.field581 && var129.field570 < Statics.field581 + 8 && Statics.field1075 == var129.field585) {
                                    var129.field578 = 0;
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 17) {
                            while (field410.field2073 < field329) {
                                boolean var130 = field410.method2708() == 1;
                                String var131 = field410.method2778();
                                String var132 = field410.method2778();
                                int var133 = field410.method2581();
                                int var134 = field410.method2708();
                                int var135 = field410.method2708();
                                boolean var136 = (var135 & 0x2) != 0;
                                boolean var137 = (var135 & 0x1) != 0;
                                if (var133 > 0) {
                                    field410.method2778();
                                    field410.method2708();
                                    field410.method2593();
                                }
                                field410.method2778();
                                for (int var138 = 0; var138 < field549; var138++) {
                                    class15 var139 = field351[var138];
                                    if (var130) {
                                        if (var132.equals(var139.field156)) {
                                            var139.field156 = var131;
                                            var139.field158 = var132;
                                            var131 = null;
                                            break;
                                        }
                                    } else if (var131.equals(var139.field156)) {
                                        if (var139.field157 != var133) {
                                            boolean var140 = true;
                                            for (class17 var141 = (class17) field384.method2267(); var141 != null; var141 = (class17) field384.method2270()) {
                                                if (var141.field176.equals(var131)) {
                                                    if (var133 != 0 && var141.field177 == 0) {
                                                        var141.method2282();
                                                        var140 = false;
                                                    } else if (var133 == 0 && var141.field177 != 0) {
                                                        var141.method2282();
                                                        var140 = false;
                                                    }
                                                }
                                            }
                                            if (var140) {
                                                field384.method2268(new class17(var131, var133));
                                            }
                                            var139.field157 = var133;
                                        }
                                        var139.field158 = var132;
                                        var139.field161 = var134;
                                        var139.field159 = var136;
                                        var139.field155 = var137;
                                        var131 = null;
                                        break;
                                    }
                                }
                                if (var131 != null && field549 < 400) {
                                    class15 var142 = new class15();
                                    field351[field549] = var142;
                                    var142.field156 = var131;
                                    var142.field158 = var132;
                                    var142.field157 = var133;
                                    var142.field161 = var134;
                                    var142.field159 = var136;
                                    var142.field155 = var137;
                                    field549++;
                                }
                            }
                            field466 = 2;
                            field461 = field447;
                            boolean var143 = false;
                            int var144 = field549;
                            while (var144 > 0) {
                                boolean var145 = true;
                                var144--;
                                for (int var146 = 0; var146 < var144; var146++) {
                                    boolean var147 = false;
                                    class15 var148 = field351[var146];
                                    class15 var149 = field351[var146 + 1];
                                    if (field282 != var148.field157 && field282 == var149.field157) {
                                        var147 = true;
                                    }
                                    if (!var147 && var148.field157 == 0 && var149.field157 != 0) {
                                        var147 = true;
                                    }
                                    if (!var147 && !var148.field159 && var149.field159) {
                                        var147 = true;
                                    }
                                    if (!var147 && !var148.field155 && var149.field155) {
                                        var147 = true;
                                    }
                                    if (var147) {
                                        class15 var150 = field351[var146];
                                        field351[var146] = field351[var146 + 1];
                                        field351[var146 + 1] = var150;
                                        var145 = false;
                                    }
                                }
                                if (var145) {
                                    break;
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 117) {
                            int var151 = field410.method2581();
                            int var152 = field410.method2593();
                            class170 var153 = class170.method786(var152);
                            if (var153 != null && var153.field2300 == 0) {
                                if (var151 > var153.field2210 - var153.field2202) {
                                    var151 = var153.field2210 - var153.field2202;
                                }
                                if (var151 < 0) {
                                    var151 = 0;
                                }
                                if (var153.field2239 != var151) {
                                    var153.field2239 = var151;
                                    method88(var153);
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 141) {
                            int var154 = field329 + field410.field2073;
                            int var155 = field410.method2581();
                            int var156 = field410.method2581();
                            if (field441 != var155) {
                                field441 = var155;
                                method65(field441, Statics.field2, Statics.field1100, false);
                                method2829(field441);
                                class33.method187(field441);
                                for (int var157 = 0; var157 < 100; var157++) {
                                    field486[var157] = true;
                                }
                            }
                            while (var156-- > 0) {
                                int var158 = field410.method2593();
                                int var159 = field410.method2581();
                                int var160 = field410.method2708();
                                class18 var161 = (class18) field442.method2190((long) var158);
                                if (var161 != null && var161.field186 != var159) {
                                    method32(var161, true);
                                    var161 = null;
                                }
                                if (var161 == null) {
                                    var161 = method195(var158, var159, var160);
                                }
                                var161.field184 = true;
                            }
                            for (class18 var162 = (class18) field442.method2195(); var162 != null; var162 = (class18) field442.method2194()) {
                                if (var162.field184) {
                                    var162.field184 = false;
                                } else {
                                    method32(var162, true);
                                }
                            }
                            field483 = new class126(512);
                            while (field410.field2073 < var154) {
                                int var163 = field410.method2593();
                                int var164 = field410.method2581();
                                int var165 = field410.method2581();
                                int var166 = field410.method2593();
                                for (int var167 = var164; var167 <= var165; var167++) {
                                    long var168 = ((long) var163 << 32) + (long) var167;
                                    field483.method2191(new class134(var166), var168);
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 41) {
                            field475 = field447;
                            if (field329 == 0) {
                                field508 = null;
                                field509 = null;
                                Statics.field1985 = 0;
                                Statics.field697 = null;
                                field375 = -1;
                                var1 = true;
                            } else {
                                field509 = field410.method2778();
                                long var170 = field410.method2721();
                                field508 = class206.method1899(var170);
                                Statics.field2148 = field410.method2754();
                                int var172 = field410.method2708();
                                if (var172 == 255) {
                                    field375 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1985 = var172;
                                    class25[] var173 = new class25[100];
                                    for (int var174 = 0; var174 < Statics.field1985; var174++) {
                                        var173[var174] = new class25();
                                        var173[var174].field275 = field410.method2778();
                                        var173[var174].field272 = class205.method2433(var173[var174].field275, Statics.field210);
                                        var173[var174].field273 = field410.method2581();
                                        var173[var174].field271 = field410.method2754();
                                        field410.method2778();
                                        if (var173[var174].field275.equals(Statics.field2019.field244)) {
                                            Statics.field1832 = var173[var174].field271;
                                        }
                                    }
                                    boolean var175 = false;
                                    int var176 = Statics.field1985;
                                    while (var176 > 0) {
                                        boolean var177 = true;
                                        var176--;
                                        for (int var178 = 0; var178 < var176; var178++) {
                                            if (var173[var178].field272.compareTo(var173[var178 + 1].field272) > 0) {
                                                class25 var179 = var173[var178];
                                                var173[var178] = var173[var178 + 1];
                                                var173[var178 + 1] = var179;
                                                var177 = false;
                                            }
                                        }
                                        if (var177) {
                                            break;
                                        }
                                    }
                                    Statics.field697 = var173;
                                    field375 = -1;
                                    var1 = true;
                                }
                            }
                            break label2637;
                        }
                        if (field375 == 162) {
                            int var180 = field410.method2632();
                            int var181 = field410.method2749();
                            class18 var182 = (class18) field442.method2190((long) var180);
                            class18 var183 = (class18) field442.method2190((long) var181);
                            if (var183 != null) {
                                method32(var183, var182 == null || var182.field186 != var183.field186);
                            }
                            if (var182 != null) {
                                var182.method2228();
                                field442.method2191(var182, (long) var181);
                            }
                            class170 var184 = class170.method786(var180);
                            if (var184 != null) {
                                method88(var184);
                            }
                            class170 var185 = class170.method786(var181);
                            if (var185 != null) {
                                method88(var185);
                                method98(Statics.field2279[var185.field2186 >>> 16], var185, true);
                            }
                            if (field441 != -1) {
                                int var186 = field441;
                                if (class170.method1780(var186)) {
                                    method2439(Statics.field2279[var186], 1);
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 208) {
                            field544 = field410.method2708();
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 224) {
                            int var187 = field410.method2593();
                            int var188 = field410.method2575();
                            class170 var189 = class170.method786(var187);
                            if (var189.field2229 != 1 || var189.field2230 != var188) {
                                var189.field2229 = 1;
                                var189.field2230 = var188;
                                method88(var189);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 233) {
                            boolean var190 = field410.method2708() == 1;
                            if (var190) {
                                Statics.field46 = class156.method118() - field410.method2721();
                                Statics.field124 = new class2(field410, true);
                            } else {
                                Statics.field124 = null;
                            }
                            field477 = field447;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 206) {
                            method2073(false);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 164) {
                            int var191 = field410.method2593();
                            int var192 = field410.method2708();
                            int var193 = field410.method2581();
                            class18 var194 = (class18) field442.method2190((long) var191);
                            if (var194 != null) {
                                method32(var194, var194.field186 != var193);
                            }
                            method195(var191, var193, var192);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 58) {
                            for (int var195 = 0; var195 < field434.length; var195++) {
                                if (field434[var195] != null) {
                                    field434[var195].field632 = -1;
                                }
                            }
                            for (int var196 = 0; var196 < field322.length; var196++) {
                                if (field322[var196] != null) {
                                    field322[var196].field632 = -1;
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 45) {
                            int var197 = field410.method2581();
                            if (var197 == 65535) {
                                var197 = -1;
                            }
                            int var198 = field410.method2632();
                            int var199 = field410.method2749();
                            int var200 = field410.method2735();
                            if (var200 == 65535) {
                                var200 = -1;
                            }
                            for (int var201 = var197; var201 <= var200; var201++) {
                                long var202 = ((long) var198 << 32) + (long) var201;
                                class128 var204 = field483.method2190(var202);
                                if (var204 != null) {
                                    var204.method2228();
                                }
                                field483.method2191(new class134(var199), var202);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 92) {
                            String var205 = field410.method2778();
                            long var206 = (long) field410.method2581();
                            long var208 = (long) field410.method2599();
                            class178 var210 = (class178) class149.method3057(class178.method212(), field410.method2708());
                            long var211 = (var206 << 32) + var208;
                            boolean var213 = false;
                            for (int var214 = 0; var214 < 100; var214++) {
                                if (field502[var214] == var211) {
                                    var213 = true;
                                    break;
                                }
                            }
                            if (method2918(var205)) {
                                var213 = true;
                            }
                            if (!var213 && field403 == 0) {
                                field502[field433] = var211;
                                field433 = (field433 + 1) % 100;
                                class160 var215 = field410;
                                String var219;
                                try {
                                    int var216 = var215.method2776();
                                    if (var216 > 32767) {
                                        var216 = 32767;
                                    }
                                    byte[] var217 = new byte[var216];
                                    var215.field2073 += Statics.field3107.method2519(var215.field2078, var215.field2073, var217, 0, var216);
                                    String var218 = class204.method3145(var217, 0, var216);
                                    var219 = var218;
                                } catch (Exception var399) {
                                    var219 = "Cabbage";
                                }
                                String var222 = class210.method3657(class208.method590(var219));
                                byte var223;
                                if (var210.field2650) {
                                    var223 = 7;
                                } else {
                                    var223 = 3;
                                }
                                if (var210.field2642 == -1) {
                                    class48.method100(var223, var205, var222);
                                } else {
                                    class48.method100(var223, class38.method1903(var210.field2642) + var205, var222);
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 103) {
                            method683(true);
                            field410.method2833();
                            int var224 = field410.method2581();
                            class46.method726(field410, var224);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 188) {
                            while (field410.field2073 < field329) {
                                int var225 = field410.method2708();
                                boolean var226 = (var225 & 0x1) == 1;
                                String var227 = field410.method2778();
                                String var228 = field410.method2778();
                                field410.method2778();
                                for (int var229 = 0; var229 < field553; var229++) {
                                    class20 var230 = field554[var229];
                                    if (var226) {
                                        if (var228.equals(var230.field212)) {
                                            var230.field212 = var227;
                                            var230.field206 = var228;
                                            var227 = null;
                                            break;
                                        }
                                    } else if (var227.equals(var230.field212)) {
                                        var230.field212 = var227;
                                        var230.field206 = var228;
                                        var227 = null;
                                        break;
                                    }
                                }
                                if (var227 != null && field553 < 400) {
                                    class20 var231 = new class20();
                                    field554[field553] = var231;
                                    var231.field212 = var227;
                                    var231.field206 = var228;
                                    field553++;
                                }
                            }
                            field461 = field447;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 116) {
                            int var232 = field410.method2633();
                            int var233 = field410.method2575();
                            class170 var234 = class170.method786(var232);
                            if (var234.field2229 != 2 || var234.field2230 != var233) {
                                var234.field2229 = 2;
                                var234.field2230 = var233;
                                method88(var234);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 229) {
                            int var235 = field410.method2708();
                            int var236 = field410.method2708();
                            int var237 = field410.method2708();
                            int var238 = field410.method2708();
                            field494[var235] = true;
                            field369[var235] = var236;
                            field533[var235] = var237;
                            field316[var235] = var238;
                            field511[var235] = 0;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 135) {
                            int var239 = field410.method2749();
                            int var240 = field410.method2766();
                            class170 var241 = class170.method786(var239);
                            if (var241.field2251 != var240 || var240 == -1) {
                                var241.field2251 = var240;
                                var241.field2216 = 0;
                                var241.field2309 = 0;
                                method88(var241);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 107) {
                            int var242 = field410.method2632();
                            Statics.field1176 = Statics.field882.method1825(var242);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 242) {
                            Statics.field235 = field410.method2616();
                            Statics.field581 = field410.method2616();
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 209) {
                            String var243 = field410.method2778();
                            long var244 = field410.method2721();
                            long var246 = (long) field410.method2581();
                            long var248 = (long) field410.method2599();
                            class178 var250 = (class178) class149.method3057(class178.method212(), field410.method2708());
                            long var251 = (var246 << 32) + var248;
                            boolean var253 = false;
                            for (int var254 = 0; var254 < 100; var254++) {
                                if (field502[var254] == var251) {
                                    var253 = true;
                                    break;
                                }
                            }
                            if (var250.field2649 && method2918(var243)) {
                                var253 = true;
                            }
                            if (!var253 && field403 == 0) {
                                field502[field433] = var251;
                                field433 = (field433 + 1) % 100;
                                class160 var255 = field410;
                                String var259;
                                try {
                                    int var256 = var255.method2776();
                                    if (var256 > 32767) {
                                        var256 = 32767;
                                    }
                                    byte[] var257 = new byte[var256];
                                    var255.field2073 += Statics.field3107.method2519(var255.field2078, var255.field2073, var257, 0, var256);
                                    String var258 = class204.method3145(var257, 0, var256);
                                    var259 = var258;
                                } catch (Exception var398) {
                                    var259 = "Cabbage";
                                }
                                String var262 = class210.method3657(class208.method590(var259));
                                if (var250.field2642 == -1) {
                                    class48.method3642(9, var243, var262, class206.method3041(var244));
                                } else {
                                    class48.method3642(9, class38.method1903(var250.field2642) + var243, var262, class206.method3041(var244));
                                }
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 88) {
                            method2073(true);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 34) {
                            int var263 = field410.method2632();
                            int var264 = field410.method2592();
                            int var265 = var264 >> 10 & 0x1F;
                            int var266 = var264 >> 5 & 0x1F;
                            int var267 = var264 & 0x1F;
                            int var268 = (var267 << 3) + (var265 << 19) + (var266 << 11);
                            class170 var269 = class170.method786(var263);
                            if (var269.field2211 != var268) {
                                var269.field2211 = var268;
                                method88(var269);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 147) {
                            int var270 = field410.method2581();
                            int var271 = field410.method2708();
                            int var272 = field410.method2581();
                            method2130(var270, var271, var272);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 232) {
                            int var273 = field410.method2708();
                            if (field410.method2708() == 0) {
                                field383[var273] = new class5();
                                field410.field2073 += 18;
                            } else {
                                field410.field2073--;
                                field383[var273] = new class5(field410, false);
                            }
                            field550 = field447;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 235) {
                            int var274 = field410.method2592();
                            int var275 = field410.method2735();
                            int var276 = field410.method2632();
                            class170 var277 = class170.method786(var276);
                            var277.field2242 = (var275 << 16) + var274;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 150) {
                            field466 = 1;
                            field461 = field447;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 239) {
                            field530 = false;
                            for (int var278 = 0; var278 < 5; var278++) {
                                field494[var278] = false;
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 222) {
                            class30 var279 = new class30();
                            var279.field682 = field410.method2778();
                            var279.field679 = field410.method2581();
                            int var280 = field410.method2593();
                            var279.field678 = var280;
                            method177(45);
                            Statics.field775.method1916();
                            Statics.field775 = null;
                            class42.method2432(var279);
                            field375 = -1;
                            var1 = false;
                            break label2637;
                        }
                        if (field375 == 205) {
                            int var281 = field410.method2593();
                            int var282 = field410.method2581();
                            if (var281 < -70000) {
                                var282 += 32768;
                            }
                            class170 var283;
                            if (var281 >= 0) {
                                var283 = class170.method786(var281);
                            } else {
                                var283 = null;
                            }
                            while (field410.field2073 < field329) {
                                int var284 = field410.method2776();
                                int var285 = field410.method2581();
                                int var286 = 0;
                                if (var285 != 0) {
                                    var286 = field410.method2708();
                                    if (var286 == 255) {
                                        var286 = field410.method2593();
                                    }
                                }
                                if (var283 != null && var284 >= 0 && var284 < var283.field2295.length) {
                                    var283.field2295[var284] = var285;
                                    var283.field2305[var284] = var286;
                                }
                                class13.method2(var282, var284, var285 - 1, var286);
                            }
                            if (var283 != null) {
                                method88(var283);
                            }
                            Statics.method693();
                            field472[++field470 - 1 & 0x1F] = var282 & 0x7FFF;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 65) {
                            class46.method726(field410, field329);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 165) {
                            String var287 = field410.method2778();
                            int var288 = field410.method2633();
                            class170 var289 = class170.method786(var288);
                            if (!var287.equals(var289.field2188)) {
                                var289.field2188 = var287;
                                method88(var289);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 142) {
                            int var290 = field410.method2749();
                            class170 var291 = class170.method786(var290);
                            var291.field2229 = 3;
                            var291.field2230 = Statics.field2019.field256.method2928();
                            method88(var291);
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 151) {
                            field499 = field410.method2708();
                            field500 = field410.method2708();
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 221) {
                            for (int var292 = 0; var292 < Statics.field2751; var292++) {
                                class188 var293 = class188.method672(var292);
                                if (var293 != null) {
                                    class166.field2149[var292] = 0;
                                    class166.field2147[var292] = 0;
                                }
                            }
                            Statics.method693();
                            field468 += 32;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 37) {
                            Statics.method693();
                            field524 = field410.method2708();
                            field478 = field447;
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 67) {
                            int var294 = field410.method2593();
                            int var295 = field410.method2581();
                            if (var295 == 65535) {
                                var295 = -1;
                            }
                            int var296 = field410.method2593();
                            class170 var297 = class170.method786(var294);
                            if (var297.field2185) {
                                var297.field2249 = var295;
                                var297.field2307 = var296;
                                class199 var299 = Statics.method1768(var295);
                                var297.field2285 = var299.field2950;
                                var297.field2182 = var299.field2938;
                                var297.field2311 = var299.field2952;
                                var297.field2235 = var299.field2953;
                                var297.field2179 = var299.field2954;
                                var297.field2240 = var299.field2949;
                                if (var299.field2962 == 1) {
                                    var297.field2245 = 1;
                                } else {
                                    var297.field2245 = 2;
                                }
                                if (var297.field2232 > 0) {
                                    var297.field2240 = var297.field2240 * 32 / var297.field2232;
                                } else if (var297.field2238 > 0) {
                                    var297.field2240 = var297.field2240 * 32 / var297.field2238;
                                }
                                method88(var297);
                            } else {
                                if (var295 == -1) {
                                    var297.field2229 = 0;
                                    field375 = -1;
                                    var1 = true;
                                    break label2637;
                                }
                                class199 var298 = Statics.method1768(var295);
                                var297.field2229 = 4;
                                var297.field2230 = var295;
                                var297.field2285 = var298.field2950;
                                var297.field2182 = var298.field2938;
                                var297.field2240 = var298.field2949 * 100 / var296;
                                method88(var297);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 53) {
                            Statics.field235 = field410.method2615();
                            Statics.field581 = field410.method2616();
                            while (field410.field2073 < field329) {
                                field375 = field410.method2708();
                                method1809();
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        if (field375 == 101) {
                            int var300 = field410.method2633();
                            int var301 = field410.method2592();
                            int var302 = field410.method2735();
                            int var303 = field410.method2592();
                            class170 var304 = class170.method786(var300);
                            if (var304.field2285 != var303 || var304.field2182 != var301 || var304.field2240 != var302) {
                                var304.field2285 = var303;
                                var304.field2182 = var301;
                                var304.field2240 = var302;
                                method88(var304);
                            }
                            field375 = -1;
                            var1 = true;
                            break label2637;
                        }
                        class102.method3043("" + field375 + class38.field777 + field335 + class38.field777 + field336 + class38.field777 + field329, (Throwable) null);
                        method151();
                    } catch (IOException var409) {
                        method1775();
                    } catch (Exception var410) {
                        String var307 = "" + field375 + class38.field777 + field335 + class38.field777 + field336 + class38.field777 + field329 + class38.field777 + (Statics.field1465 + Statics.field2019.field655[0]) + class38.field777 + (Statics.field129 + Statics.field2019.field610[0]) + class38.field777;
                        for (int var308 = 0; var308 < field329 && var308 < 50; var308++) {
                            var307 = var307 + field410.field2078[var308] + class38.field777;
                        }
                        class102.method3043(var307, var410);
                        method151();
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
            class227 var309 = (class227) class228.field3229.method2209();
            boolean var310;
            if (var309 == null) {
                var310 = false;
            } else {
                var310 = true;
            }
            if (!var310) {
                Object var312 = Statics.field2797.field214;
                synchronized (Statics.field2797.field214) {
                    if (!field281) {
                        Statics.field2797.field215 = 0;
                    } else if (class116.field1795 != 0 || Statics.field2797.field215 >= 40) {
                        field327.method2832(218);
                        field327.method2573(0);
                        int var313 = field327.field2073;
                        int var314 = 0;
                        for (int var315 = 0; var315 < Statics.field2797.field215 && field327.field2073 - var313 < 240; var315++) {
                            var314++;
                            int var316 = Statics.field2797.field217[var315];
                            if (var316 < 0) {
                                var316 = 0;
                            } else if (var316 > 502) {
                                var316 = 502;
                            }
                            int var317 = Statics.field2797.field216[var315];
                            if (var317 < 0) {
                                var317 = 0;
                            } else if (var317 > 764) {
                                var317 = 764;
                            }
                            int var318 = var316 * 765 + var317;
                            if (Statics.field2797.field217[var315] == -1 && Statics.field2797.field216[var315] == -1) {
                                var317 = -1;
                                var316 = -1;
                                var318 = 524287;
                            }
                            if (field340 != var317 || field294 != var316) {
                                int var319 = var317 - field340;
                                field340 = var317;
                                int var320 = var316 - field294;
                                field294 = var316;
                                if (field295 < 8 && var319 >= -32 && var319 <= 31 && var320 >= -32 && var320 <= 31) {
                                    var319 += 32;
                                    var320 += 32;
                                    field327.method2731((field295 << 12) + (var319 << 6) + var320);
                                    field295 = 0;
                                } else if (field295 < 8) {
                                    field327.method2727((field295 << 19) + 8388608 + var318);
                                    field295 = 0;
                                } else {
                                    field327.method2576((field295 << 19) + -1073741824 + var318);
                                    field295 = 0;
                                }
                            } else if (field295 < 2047) {
                                field295++;
                            }
                        }
                        field327.method2585(field327.field2073 - var313);
                        if (var314 >= Statics.field2797.field215) {
                            Statics.field2797.field215 = 0;
                        } else {
                            Statics.field2797.field215 -= var314;
                            for (int var321 = 0; var321 < Statics.field2797.field215; var321++) {
                                Statics.field2797.field216[var321] = Statics.field2797.field216[var314 + var321];
                                Statics.field2797.field217[var321] = Statics.field2797.field217[var314 + var321];
                            }
                        }
                    }
                }
                if (class116.field1795 == 1 || !Statics.field1298 && class116.field1795 == 4 || class116.field1795 == 2) {
                    long var323 = (class116.field1798 - field292) / 50L;
                    if (var323 > 4095L) {
                        var323 = 4095L;
                    }
                    field292 = class116.field1798;
                    int var325 = class116.field1797;
                    if (var325 < 0) {
                        var325 = 0;
                    } else if (var325 > Statics.field1100) {
                        var325 = Statics.field1100;
                    }
                    int var326 = class116.field1792;
                    if (var326 < 0) {
                        var326 = 0;
                    } else if (var326 > Statics.field2) {
                        var326 = Statics.field2;
                    }
                    int var327 = (int) var323;
                    field327.method2832(19);
                    field327.method2731((class116.field1795 == 2 ? 1 : 0) + (var327 << 1));
                    field327.method2731(var326);
                    field327.method2731(var325);
                }
                if (class106.field1711 > 0) {
                    field327.method2832(88);
                    field327.method2731(0);
                    int var328 = field327.field2073;
                    long var329 = class156.method118();
                    for (int var331 = 0; var331 < class106.field1711; var331++) {
                        long var332 = var329 - field507;
                        if (var332 > 16777215L) {
                            var332 = 16777215L;
                        }
                        field507 = var329;
                        field327.method2629((int) var332);
                        field327.method2613(class106.field1707[var331]);
                    }
                    field327.method2584(field327.field2073 - var328);
                }
                if (field374 > 0) {
                    field374--;
                }
                if (class106.field1701[96] || class106.field1701[97] || class106.field1701[98] || class106.field1701[99]) {
                    field516 = true;
                }
                if (field516 && field374 <= 0) {
                    field374 = 20;
                    field516 = false;
                    field327.method2832(242);
                    field327.method2622(field368);
                    field327.method2731(field521);
                }
                if (Statics.field220 && !field296) {
                    field296 = true;
                    field327.method2832(42);
                    field327.method2573(1);
                }
                if (!Statics.field220 && field296) {
                    field296 = false;
                    field327.method2832(42);
                    field327.method2573(0);
                }
                if (Statics.field1075 != field360) {
                    field360 = Statics.field1075;
                    method1797(Statics.field1075);
                }
                if (field289 != 30) {
                    return;
                }
                method3241();
                method2131();
                field309++;
                if (field309 > 750) {
                    if (field337 > 0) {
                        method151();
                    } else {
                        method177(40);
                        Statics.field1644 = Statics.field775;
                        Statics.field775 = null;
                    }
                    return;
                }
                int var334 = class46.field889;
                int[] var335 = class46.field893;
                for (int var336 = 0; var336 < var334; var336++) {
                    class24 var337 = field434[var335[var336]];
                    if (var337 != null) {
                        Statics.method678(var337, 1);
                    }
                }
                method1835();
                int[] var338 = class46.field893;
                for (int var339 = 0; var339 < class46.field889; var339++) {
                    class24 var340 = field434[var338[var339]];
                    if (var340 != null && var340.field616 > 0) {
                        var340.field616--;
                        if (var340.field616 == 0) {
                            var340.field613 = null;
                        }
                    }
                }
                for (int var341 = 0; var341 < field323; var341++) {
                    int var342 = field484[var341];
                    class36 var343 = field322[var342];
                    if (var343 != null && var343.field616 > 0) {
                        var343.field616--;
                        if (var343.field616 == 0) {
                            var343.field613 = null;
                        }
                    }
                }
                field463++;
                if (field394 != 0) {
                    field393 += 20;
                    if (field393 >= 400) {
                        field394 = 0;
                    }
                }
                if (Statics.field2165 != null) {
                    field532++;
                    if (field532 >= 15) {
                        method88(Statics.field2165);
                        Statics.field2165 = null;
                    }
                }
                class170 var344 = Statics.field2759;
                class170 var345 = Statics.field242;
                Statics.field2759 = null;
                Statics.field242 = null;
                field458 = null;
                field526 = false;
                field459 = false;
                field504 = 0;
                while (class106.method3347() && field504 < 128) {
                    if (field353 >= 2 && class106.field1701[82] && Statics.field2135 == 66) {
                        String var346 = class48.method595();
                        Statics.field2119.setContents(new StringSelection(var346), (ClipboardOwner) null);
                    } else {
                        field506[field504] = Statics.field2135;
                        field505[field504] = Statics.field2632;
                        field504++;
                    }
                }
                if (field441 != -1) {
                    method3151(field441, 0, 0, Statics.field2, Statics.field1100, 0, 0);
                }
                field447++;
                while (true) {
                    class19 var347;
                    class170 var348;
                    class170 var349;
                    do {
                        var347 = (class19) field481.method2240();
                        if (var347 == null) {
                            while (true) {
                                class19 var350;
                                class170 var351;
                                class170 var352;
                                do {
                                    var350 = (class19) field326.method2240();
                                    if (var350 == null) {
                                        while (true) {
                                            class19 var353;
                                            class170 var354;
                                            class170 var355;
                                            do {
                                                var353 = (class19) field480.method2240();
                                                if (var353 == null) {
                                                    method1779();
                                                    if (field454 != null) {
                                                        method88(field454);
                                                        Statics.field1582++;
                                                        if (field526 && field459) {
                                                            int var356 = class116.field1789;
                                                            int var357 = class116.field1790 * -1088631201;
                                                            int var358 = var356 - field456;
                                                            int var359 = var357 - field551;
                                                            if (var358 < field491) {
                                                                var358 = field491;
                                                            }
                                                            if (field454.field2201 + var358 > field491 + field455.field2201) {
                                                                var358 = field491 + field455.field2201 - field454.field2201;
                                                            }
                                                            if (var359 < field285) {
                                                                var359 = field285;
                                                            }
                                                            if (field454.field2202 + var359 > field285 + field455.field2202) {
                                                                var359 = field285 + field455.field2202 - field454.field2202;
                                                            }
                                                            int var360 = var358 - field510;
                                                            int var361 = var359 - field464;
                                                            int var362 = field454.field2262;
                                                            if (Statics.field1582 > field454.field2263 && (var360 > var362 || var360 < -var362 || var361 > var362 || var361 < -var362)) {
                                                                field465 = true;
                                                            }
                                                            int var363 = field455.field2207 + (var358 - field491);
                                                            int var364 = field455.field2239 + (var359 - field285);
                                                            if (field454.field2275 != null && field465) {
                                                                class19 var365 = new class19();
                                                                var365.field196 = field454;
                                                                var365.field192 = var363;
                                                                var365.field191 = var364;
                                                                var365.field204 = field454.field2275;
                                                                class33.method857(var365, 200000);
                                                            }
                                                            if (class116.field1788 == 0) {
                                                                if (field465) {
                                                                    if (field454.field2276 != null) {
                                                                        class19 var366 = new class19();
                                                                        var366.field196 = field454;
                                                                        var366.field192 = var363;
                                                                        var366.field191 = var364;
                                                                        var366.field195 = field458;
                                                                        var366.field204 = field454.field2276;
                                                                        class33.method857(var366, 200000);
                                                                    }
                                                                    if (field458 != null && method2437(field454) != null) {
                                                                        field327.method2832(224);
                                                                        field327.method2622(field454.field2187);
                                                                        field327.method2631(field454.field2186);
                                                                        field327.method2631(field458.field2186);
                                                                        field327.method2731(field454.field2249);
                                                                        field327.method2622(field458.field2187);
                                                                        field327.method2731(field458.field2249);
                                                                    }
                                                                } else if ((field304 == 1 || method79(field423 - 1)) && field423 > 2) {
                                                                    method859(field510 + field456, field551 + field464);
                                                                } else if (field423 > 0) {
                                                                    method2017(field510 + field456, field551 + field464);
                                                                }
                                                                field454 = null;
                                                            }
                                                        } else if (Statics.field1582 > 1) {
                                                            field454 = null;
                                                        }
                                                    }
                                                    if (Statics.field716 != null) {
                                                        method88(Statics.field716);
                                                        field402++;
                                                        if (class116.field1788 == 0) {
                                                            if (field401) {
                                                                if (Statics.field716 == Statics.field145 && field400 != field397) {
                                                                    class170 var367 = Statics.field716;
                                                                    byte var368 = 0;
                                                                    if (field559 == 1 && var367.field2190 == 206) {
                                                                        var368 = 1;
                                                                    }
                                                                    if (var367.field2295[field400] <= 0) {
                                                                        var368 = 0;
                                                                    }
                                                                    int var369 = method1782(var367);
                                                                    boolean var370 = (var369 >> 29 & 0x1) != 0;
                                                                    if (var370) {
                                                                        int var371 = field397;
                                                                        int var372 = field400;
                                                                        var367.field2295[var372] = var367.field2295[var371];
                                                                        var367.field2305[var372] = var367.field2305[var371];
                                                                        var367.field2295[var371] = -1;
                                                                        var367.field2305[var371] = 0;
                                                                    } else if (var368 == 1) {
                                                                        int var373 = field397;
                                                                        int var374 = field400;
                                                                        while (var373 != var374) {
                                                                            if (var373 > var374) {
                                                                                var367.method2966(var373 - 1, var373);
                                                                                var373--;
                                                                            } else if (var373 < var374) {
                                                                                var367.method2966(var373 + 1, var373);
                                                                                var373++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var367.method2966(field400, field397);
                                                                    }
                                                                    field327.method2832(32);
                                                                    field327.method2620(field397);
                                                                    field327.method2613(var368);
                                                                    field327.method2755(field400);
                                                                    field327.method2576(Statics.field716.field2186);
                                                                }
                                                            } else if ((field304 == 1 || method79(field423 - 1)) && field423 > 2) {
                                                                method859(field398, field399);
                                                            } else if (field423 > 0) {
                                                                method2017(field398, field399);
                                                            }
                                                            field532 = 10;
                                                            class116.field1795 = 0;
                                                            Statics.field716 = null;
                                                        } else if (field402 >= 5 && (class116.field1789 > field398 + 5 || class116.field1789 < field398 - 5 || class116.field1790 * -1088631201 > field399 + 5 || class116.field1790 * -1088631201 < field399 - 5)) {
                                                            field401 = true;
                                                        }
                                                    }
                                                    if (class88.field1471 != -1) {
                                                        int var375 = class88.field1471;
                                                        int var376 = class88.field1505;
                                                        field327.method2832(164);
                                                        field327.method2573(5);
                                                        field327.method2613(class106.field1701[82] ? (class106.field1701[81] ? 2 : 1) : 0);
                                                        field327.method2755(Statics.field1465 + var375);
                                                        field327.method2622(Statics.field129 + var376);
                                                        class88.field1471 = -1;
                                                        field391 = class116.field1792;
                                                        field392 = class116.field1797;
                                                        field394 = 1;
                                                        field393 = 0;
                                                        field515 = var375;
                                                        field548 = var376;
                                                    }
                                                    if (Statics.field2759 != var344) {
                                                        if (var344 != null) {
                                                            method88(var344);
                                                        }
                                                        if (Statics.field2759 != null) {
                                                            method88(Statics.field2759);
                                                        }
                                                    }
                                                    if (Statics.field242 != var345 && field432 == field362) {
                                                        if (var345 != null) {
                                                            method88(var345);
                                                        }
                                                        if (Statics.field242 != null) {
                                                            method88(Statics.field242);
                                                        }
                                                    }
                                                    if (Statics.field242 == null) {
                                                        if (field432 > 0) {
                                                            field432--;
                                                        }
                                                    } else if (field432 < field362) {
                                                        field432++;
                                                        if (field432 == field362) {
                                                            method88(Statics.field242);
                                                        }
                                                    }
                                                    int var377 = field348 + Statics.field2019.field612;
                                                    int var378 = field395 + Statics.field2019.field601;
                                                    if (Statics.field237 - var377 < -500 || Statics.field237 - var377 > 500 || Statics.field2069 - var378 < -500 || Statics.field2069 - var378 > 500) {
                                                        Statics.field237 = var377;
                                                        Statics.field2069 = var378;
                                                    }
                                                    if (Statics.field237 != var377) {
                                                        Statics.field237 += (var377 - Statics.field237) / 16;
                                                    }
                                                    if (Statics.field2069 != var378) {
                                                        Statics.field2069 += (var378 - Statics.field2069) / 16;
                                                    }
                                                    if (class116.field1788 == 4 && Statics.field1298) {
                                                        int var379 = class116.field1790 * -1088631201 - field372 * -1088631201;
                                                        field370 = var379 * 2;
                                                        field372 = (var379 == -1 || var379 == 1 ? class116.field1790 * -1088631201 : (field372 * -1088631201 + class116.field1790 * -1088631201) / 2) * 2063535519;
                                                        int var380 = field522 - class116.field1789;
                                                        field386 = var380 * 2;
                                                        field522 = var380 == -1 || var380 == 1 ? class116.field1789 : (field522 + class116.field1789) / 2;
                                                    } else {
                                                        if (class106.field1701[96]) {
                                                            field386 += (-24 - field386) / 2;
                                                        } else if (class106.field1701[97]) {
                                                            field386 += (24 - field386) / 2;
                                                        } else {
                                                            field386 /= 2;
                                                        }
                                                        if (class106.field1701[98]) {
                                                            field370 += (12 - field370) / 2;
                                                        } else if (class106.field1701[99]) {
                                                            field370 += (-12 - field370) / 2;
                                                        } else {
                                                            field370 /= 2;
                                                        }
                                                        field372 = class116.field1790;
                                                        field522 = class116.field1789;
                                                    }
                                                    field368 = field386 / 2 + field368 & 0x7FF;
                                                    field521 += field370 / 2;
                                                    if (field521 < 128) {
                                                        field521 = 128;
                                                    }
                                                    if (field521 > 383) {
                                                        field521 = 383;
                                                    }
                                                    int var381 = Statics.field237 >> 7;
                                                    int var382 = Statics.field2069 >> 7;
                                                    int var383 = method3046(Statics.field237, Statics.field2069, Statics.field1075);
                                                    int var384 = 0;
                                                    if (var381 > 3 && var382 > 3 && var381 < 100 && var382 < 100) {
                                                        for (int var385 = var381 - 4; var385 <= var381 + 4; var385++) {
                                                            for (int var386 = var382 - 4; var386 <= var382 + 4; var386++) {
                                                                int var387 = Statics.field1075;
                                                                if (var387 < 3 && (class11.field101[1][var385][var386] & 0x2) == 2) {
                                                                    var387++;
                                                                }
                                                                int var388 = var383 - class11.field104[var387][var385][var386];
                                                                if (var388 > var384) {
                                                                    var384 = var388;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var389 = var384 * 192;
                                                    if (var389 > 98048) {
                                                        var389 = 98048;
                                                    }
                                                    if (var389 < 32768) {
                                                        var389 = 32768;
                                                    }
                                                    if (var389 > field407) {
                                                        field407 += (var389 - field407) / 24;
                                                    } else if (var389 < field407) {
                                                        field407 += (var389 - field407) / 80;
                                                    }
                                                    if (field530) {
                                                        method96();
                                                    }
                                                    for (int var390 = 0; var390 < 5; var390++) {
                                                        int var10002 = field511[var390]++;
                                                    }
                                                    Statics.field1542.method816();
                                                    int var391 = class116.method1796();
                                                    int var392 = class106.field1712;
                                                    if (var391 > 15000 && var392 > 15000) {
                                                        field337 = 250;
                                                        class116.field1784 = 14500;
                                                        field327.method2832(76);
                                                    }
                                                    field303++;
                                                    if (field303 > 500) {
                                                        field303 = 0;
                                                        int var394 = (int) (Math.random() * 8.0D);
                                                        if ((var394 & 0x1) == 1) {
                                                            field348 += field349;
                                                        }
                                                        if ((var394 & 0x2) == 2) {
                                                            field395 += field332;
                                                        }
                                                        if ((var394 & 0x4) == 4) {
                                                            field352 += field354;
                                                        }
                                                    }
                                                    if (field348 < -50) {
                                                        field349 = 2;
                                                    }
                                                    if (field348 > 50) {
                                                        field349 = -2;
                                                    }
                                                    if (field395 < -55) {
                                                        field332 = 2;
                                                    }
                                                    if (field395 > 55) {
                                                        field332 = -2;
                                                    }
                                                    if (field352 < -40) {
                                                        field354 = 1;
                                                    }
                                                    if (field352 > 40) {
                                                        field354 = -1;
                                                    }
                                                    field474++;
                                                    if (field474 > 500) {
                                                        field474 = 0;
                                                        int var395 = (int) (Math.random() * 8.0D);
                                                        if ((var395 & 0x1) == 1) {
                                                            field355 += field356;
                                                        }
                                                        if ((var395 & 0x2) == 2) {
                                                            field357 += field358;
                                                        }
                                                    }
                                                    if (field355 < -60) {
                                                        field356 = 2;
                                                    }
                                                    if (field355 > 60) {
                                                        field356 = -2;
                                                    }
                                                    if (field357 < -20) {
                                                        field358 = 1;
                                                    }
                                                    if (field357 > 10) {
                                                        field358 = -1;
                                                    }
                                                    for (class17 var396 = (class17) field384.method2267(); var396 != null; var396 = (class17) field384.method2270()) {
                                                        if ((long) var396.field181 < class156.method118() / 1000L - 5L) {
                                                            if (var396.field177 > 0) {
                                                                class48.method100(5, "", var396.field176 + class174.field2483);
                                                            }
                                                            if (var396.field177 == 0) {
                                                                class48.method100(5, "", var396.field176 + class174.field2350);
                                                            }
                                                            var396.method2282();
                                                        }
                                                    }
                                                    field333++;
                                                    if (field333 > 50) {
                                                        field327.method2832(217);
                                                    }
                                                    try {
                                                        if (Statics.field775 != null && field327.field2073 > 0) {
                                                            Statics.field775.method1908(field327.field2078, 0, field327.field2073);
                                                            field327.field2073 = 0;
                                                            field333 = 0;
                                                        }
                                                    } catch (IOException var401) {
                                                        if (field337 > 0) {
                                                            method151();
                                                        } else {
                                                            method177(40);
                                                            Statics.field1644 = Statics.field775;
                                                            Statics.field775 = null;
                                                        }
                                                    }
                                                    return;
                                                }
                                                var354 = var353.field196;
                                                if (var354.field2187 < 0) {
                                                    break;
                                                }
                                                var355 = class170.method786(var354.field2266);
                                            } while (var355 == null || var355.field2310 == null || var354.field2187 >= var355.field2310.length || var355.field2310[var354.field2187] != var354);
                                            class33.method857(var353, 200000);
                                        }
                                    }
                                    var351 = var350.field196;
                                    if (var351.field2187 < 0) {
                                        break;
                                    }
                                    var352 = class170.method786(var351.field2266);
                                } while (var352 == null || var352.field2310 == null || var351.field2187 >= var352.field2310.length || var352.field2310[var351.field2187] != var351);
                                class33.method857(var350, 200000);
                            }
                        }
                        var348 = var347.field196;
                        if (var348.field2187 < 0) {
                            break;
                        }
                        var349 = class170.method786(var348.field2266);
                    } while (var349 == null || var349.field2310 == null || var348.field2187 >= var349.field2310.length || var349.field2310[var348.field2187] != var348);
                    class33.method9(var347);
                }
            }
            field327.method2832(227);
            field327.method2573(0);
            int var311 = field327.field2073;
            class228.method213(field327);
            field327.method2585(field327.field2073 - var311);
        }
    }

    @ObfuscatedName("ak.b(B)V")
    public static final void method732() {
        if (Statics.field151 != null) {
            Statics.field151.method1004();
        }
        if (Statics.field523 != null) {
            Statics.field523.method1004();
        }
    }

    @ObfuscatedName("dq.aj(B)V")
    public static final void method2131() {
        for (int var0 = 0; var0 < field517; var0++) {
            int var10002 = field527[var0]--;
            if (field527[var0] >= -10) {
                class54 var2 = field529[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method940(Statics.field95, field501[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field527[var0] += var2.method935();
                    field529[var0] = var2;
                }
                if (field527[var0] < 0) {
                    int var9;
                    if (field528[var0] == 0) {
                        var9 = field359;
                    } else {
                        int var3 = (field528[var0] & 0xFF) * 128;
                        int var4 = field528[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2019.field612;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field528[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2019.field601;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field527[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field558 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method938().method979(Statics.field1962);
                        class67 var11 = class67.method1100(var10, 100, var9);
                        var11.method1103(field293[var0] - 1);
                        Statics.field223.method874(var11);
                    }
                    field527[var0] = -100;
                }
            } else {
                field517--;
                for (int var1 = var0; var1 < field517; var1++) {
                    field501[var1] = field501[var1 + 1];
                    field529[var1] = field529[var1 + 1];
                    field293[var1] = field293[var1 + 1];
                    field527[var1] = field527[var1 + 1];
                    field528[var1] = field528[var1 + 1];
                }
                var0--;
            }
        }
        if (field520 && !class139.method194()) {
            if (field518 != 0 && field445 != -1) {
                class139.method1900(Statics.field782, field445, 0, field518, false);
            }
            field520 = false;
        }
    }

    @ObfuscatedName("bf.ag(Lgg;IIIB)V")
    public static void method1341(class202 arg0, int arg1, int arg2, int arg3) {
        if (field517 >= 50 || field558 == 0 || arg0.field3050 == null || arg1 >= arg0.field3050.length) {
            return;
        }
        int var4 = arg0.field3050[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field501[field517] = var5;
        field293[field517] = var6;
        field527[field517] = 0;
        field529[field517] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field528[field517] = (var8 << 16) + (var9 << 8) + var7;
        field517++;
    }

    @ObfuscatedName("dq.al(IIII)V")
    public static void method2130(int arg0, int arg1, int arg2) {
        if (field359 == 0 || arg1 == 0 || field517 >= 50) {
            return;
        }
        field501[field517] = arg0;
        field293[field517] = arg1;
        field527[field517] = arg2;
        field529[field517] = null;
        field528[field517] = 0;
        field517++;
    }

    @ObfuscatedName("d.af(I)V")
    public static final void method96() {
        int var0 = Statics.field238 * 128 + 64;
        int var1 = Statics.field108 * 128 + 64;
        int var2 = method3046(var0, var1, Statics.field1075) - Statics.field1777;
        if (Statics.field771 < var0) {
            Statics.field771 += Statics.field2001 * (var0 - Statics.field771) / 1000 + Statics.field2005;
            if (Statics.field771 > var0) {
                Statics.field771 = var0;
            }
        }
        if (Statics.field771 > var0) {
            Statics.field771 -= Statics.field2001 * (Statics.field771 - var0) / 1000 + Statics.field2005;
            if (Statics.field771 < var0) {
                Statics.field771 = var0;
            }
        }
        if (Statics.field773 < var2) {
            Statics.field773 += Statics.field2001 * (var2 - Statics.field773) / 1000 + Statics.field2005;
            if (Statics.field773 > var2) {
                Statics.field773 = var2;
            }
        }
        if (Statics.field773 > var2) {
            Statics.field773 -= Statics.field2001 * (Statics.field773 - var2) / 1000 + Statics.field2005;
            if (Statics.field773 < var2) {
                Statics.field773 = var2;
            }
        }
        if (Statics.field1288 < var1) {
            Statics.field1288 += Statics.field2001 * (var1 - Statics.field1288) / 1000 + Statics.field2005;
            if (Statics.field1288 > var1) {
                Statics.field1288 = var1;
            }
        }
        if (Statics.field1288 > var1) {
            Statics.field1288 -= Statics.field2001 * (Statics.field1288 - var1) / 1000 + Statics.field2005;
            if (Statics.field1288 < var1) {
                Statics.field1288 = var1;
            }
        }
        int var3 = Statics.field961 * 128 + 64;
        int var4 = Statics.field21 * 128 + 64;
        int var5 = method3046(var3, var4, Statics.field1075) - Statics.field2062;
        int var6 = var3 - Statics.field771;
        int var7 = var5 - Statics.field773;
        int var8 = var4 - Statics.field1288;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2151 < var10) {
            Statics.field2151 += Statics.field926 * (var10 - Statics.field2151) / 1000 + Statics.field1080;
            if (Statics.field2151 > var10) {
                Statics.field2151 = var10;
            }
        }
        if (Statics.field2151 > var10) {
            Statics.field2151 -= Statics.field926 * (Statics.field2151 - var10) / 1000 + Statics.field1080;
            if (Statics.field2151 < var10) {
                Statics.field2151 = var10;
            }
        }
        int var12 = var11 - Statics.field274;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field274 += Statics.field926 * var12 / 1000 + Statics.field1080;
            Statics.field274 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field274 -= Statics.field926 * -var12 / 1000 + Statics.field1080;
            Statics.field274 &= 0x7FF;
        }
        int var13 = var11 - Statics.field274;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field274 = var11;
        }
    }

    @ObfuscatedName("cc.aa(I)V")
    public static final void method1835() {
        for (int var0 = 0; var0 < field323; var0++) {
            int var1 = field484[var0];
            class36 var2 = field322[var1];
            if (var2 != null) {
                Statics.method678(var2, var2.field761.field3008);
            }
        }
    }

    @ObfuscatedName("f.ai(Lag;I)V")
    public static final void method42(class28 arg0) {
        if (field291 == arg0.field647 || arg0.field632 == -1 || arg0.field653 != 0 || arg0.field634 + 1 > class202.method3327(arg0.field632).field3049[arg0.field633]) {
            int var1 = arg0.field647 - arg0.field611;
            int var2 = field291 - arg0.field611;
            int var3 = arg0.field642 * 128 + arg0.field604 * 64;
            int var4 = arg0.field644 * 128 + arg0.field604 * 64;
            int var5 = arg0.field619 * 128 + arg0.field604 * 64;
            int var6 = arg0.field643 * 128 + arg0.field604 * 64;
            arg0.field612 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field601 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field658 = 0;
        arg0.field651 = arg0.field648;
        arg0.field656 = arg0.field651;
    }

    @ObfuscatedName("cr.ah(Lag;I)V")
    public static final void method1441(class28 arg0) {
        arg0.field629 = arg0.field605;
        if (arg0.field654 == 0) {
            arg0.field658 = 0;
            return;
        }
        if (arg0.field632 != -1 && arg0.field653 == 0) {
            class202 var1 = class202.method3327(arg0.field632);
            if (arg0.field659 > 0 && var1.field3053 == 0) {
                arg0.field658++;
                return;
            }
            if (arg0.field659 <= 0 && var1.field3040 == 0) {
                arg0.field658++;
                return;
            }
        }
        int var2 = arg0.field612;
        int var3 = arg0.field601;
        int var4 = arg0.field655[arg0.field654 - 1] * 128 + arg0.field604 * 64;
        int var5 = arg0.field610[arg0.field654 - 1] * 128 + arg0.field604 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field651 = 1280;
            } else if (var3 > var5) {
                arg0.field651 = 1792;
            } else {
                arg0.field651 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field651 = 768;
            } else if (var3 > var5) {
                arg0.field651 = 256;
            } else {
                arg0.field651 = 512;
            }
        } else if (var3 < var5) {
            arg0.field651 = 1024;
        } else if (var3 > var5) {
            arg0.field651 = 0;
        }
        byte var6 = arg0.field657[arg0.field654 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field612 = var4;
            arg0.field601 = var5;
            arg0.field654--;
            if (arg0.field659 > 0) {
                arg0.field659--;
            }
            return;
        }
        int var7 = arg0.field651 - arg0.field656 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field609;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field608;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field615;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field640;
        }
        if (var8 == -1) {
            var8 = arg0.field608;
        }
        arg0.field629 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field761.field3021;
        }
        if (var10) {
            if (arg0.field656 != arg0.field651 && arg0.field626 == -1 && arg0.field617 != 0) {
                var9 = 2;
            }
            if (arg0.field654 > 2) {
                var9 = 6;
            }
            if (arg0.field654 > 3) {
                var9 = 8;
            }
            if (arg0.field658 > 0 && arg0.field654 > 1) {
                var9 = 8;
                arg0.field658--;
            }
        } else {
            if (arg0.field654 > 1) {
                var9 = 6;
            }
            if (arg0.field654 > 2) {
                var9 = 8;
            }
            if (arg0.field658 > 0 && arg0.field654 > 1) {
                var9 = 8;
                arg0.field658--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field629 == arg0.field608 && arg0.field623 != -1) {
            arg0.field629 = arg0.field623;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field612 += var9;
                if (arg0.field612 > var4) {
                    arg0.field612 = var4;
                }
            } else if (var2 > var4) {
                arg0.field612 -= var9;
                if (arg0.field612 < var4) {
                    arg0.field612 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field601 += var9;
                if (arg0.field601 > var5) {
                    arg0.field601 = var5;
                }
            } else if (var3 > var5) {
                arg0.field601 -= var9;
                if (arg0.field601 < var5) {
                    arg0.field601 = var5;
                }
            }
        }
        if (arg0.field612 == var4 && arg0.field601 == var5) {
            arg0.field654--;
            if (arg0.field659 > 0) {
                arg0.field659--;
            }
        }
    }

    @ObfuscatedName("aq.av(Lag;I)V")
    public static final void method764(class28 arg0) {
        if (arg0.field617 == 0) {
            return;
        }
        if (arg0.field626 != -1) {
            class28 var1 = null;
            if (arg0.field626 < 32768) {
                var1 = field322[arg0.field626];
            } else if (arg0.field626 >= 32768) {
                var1 = field434[arg0.field626 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field612 - var1.field612;
                int var3 = arg0.field601 - var1.field601;
                if (var2 != 0 || var3 != 0) {
                    arg0.field651 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field614) {
                arg0.field626 = -1;
                arg0.field614 = false;
            }
        }
        if (arg0.field628 != -1 && (arg0.field654 == 0 || arg0.field658 > 0)) {
            arg0.field651 = arg0.field628;
            arg0.field628 = -1;
        }
        int var4 = arg0.field651 - arg0.field656 & 0x7FF;
        if (var4 == 0 && arg0.field614) {
            arg0.field626 = -1;
            arg0.field614 = false;
        }
        if (var4 == 0) {
            arg0.field625 = 0;
            return;
        }
        arg0.field625++;
        if (var4 > 1024) {
            arg0.field656 -= arg0.field617;
            boolean var5 = true;
            if (var4 < arg0.field617 || var4 > 2048 - arg0.field617) {
                arg0.field656 = arg0.field651;
                var5 = false;
            }
            if (arg0.field629 == arg0.field605 && (arg0.field625 > 25 || var5)) {
                if (arg0.field606 == -1) {
                    arg0.field629 = arg0.field608;
                } else {
                    arg0.field629 = arg0.field606;
                }
            }
        } else {
            arg0.field656 += arg0.field617;
            boolean var6 = true;
            if (var4 < arg0.field617 || var4 > 2048 - arg0.field617) {
                arg0.field656 = arg0.field651;
                var6 = false;
            }
            if (arg0.field629 == arg0.field605 && (arg0.field625 > 25 || var6)) {
                if (arg0.field627 == -1) {
                    arg0.field629 = arg0.field608;
                } else {
                    arg0.field629 = arg0.field627;
                }
            }
        }
        arg0.field656 &= 0x7FF;
    }

    @ObfuscatedName("gt.az(S)I")
    public static int method3134() {
        return field495 ? 2 : 1;
    }

    @ObfuscatedName("en.ad(I)V")
    public static void method2800() {
        Canvas var0 = Statics.field2146;
        var0.removeKeyListener(class106.field1690);
        var0.removeFocusListener(class106.field1690);
        class106.field1704 = -1;
        class116.method731(Statics.field2146);
        if (Statics.field2664 != null) {
            Statics.field2664.method1885(Statics.field2146);
        }
        Statics.field280.method1938();
        Statics.field2146.setBackground(Color.black);
        class106.method2520(Statics.field2146);
        Canvas var1 = Statics.field2146;
        var1.addMouseListener(class116.field1799);
        var1.addMouseMotionListener(class116.field1799);
        var1.addFocusListener(class116.field1799);
        if (Statics.field2664 != null) {
            Statics.field2664.method1890(Statics.field2146);
        }
        if (field441 != -1) {
            method65(field441, Statics.field2, Statics.field1100, false);
        }
        field1771 = true;
    }

    @ObfuscatedName("aa.aw(I)V")
    public static void method680() {
        client var0 = Statics.field280;
        synchronized (Statics.field280) {
            Container var1 = Statics.field280.method1949();
            if (var1 != null) {
                Statics.field1212 = Math.max(var1.getSize().width, Statics.field1906);
                Statics.field116 = Math.max(var1.getSize().height, Statics.field1741);
                if (Statics.field1616 == var1) {
                    Insets var2 = Statics.field1616.getInsets();
                    Statics.field1212 -= var2.right + var2.left;
                    Statics.field116 -= var2.top + var2.bottom;
                }
                if (Statics.field1212 <= 0) {
                    Statics.field1212 = 1;
                }
                if (Statics.field116 <= 0) {
                    Statics.field116 = 1;
                }
                if (method3134() == 1) {
                    Statics.field2 = field496 * 765;
                    Statics.field1100 = field497;
                } else {
                    Statics.field2 = Math.min(Statics.field1212, 7680);
                    Statics.field1100 = Math.min(Statics.field116, 2160);
                }
                field1766 = (Statics.field1212 - Statics.field2) / 2;
                field1767 = 0;
                Statics.field2146.setSize(Statics.field2, Statics.field1100);
                int var3 = Statics.field2;
                int var4 = Statics.field1100;
                Canvas var5 = Statics.field2146;
                class221 var7;
                try {
                    class219 var6 = new class219();
                    var6.method3738(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var12) {
                    class224 var9 = new class224();
                    var9.method3738(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field1759 = var7;
                if (Statics.field1616 == var1) {
                    Insets var10 = Statics.field1616.getInsets();
                    Statics.field2146.setLocation(field1766 + var10.left, field1767 + var10.top);
                } else {
                    Statics.field2146.setLocation(field1766, field1767);
                }
                method601();
                if (field441 != -1) {
                    method65(field441, Statics.field2, Statics.field1100, true);
                }
                method589();
            }
        }
    }

    @ObfuscatedName("aj.ak(B)V")
    public static void method601() {
        int var0 = Statics.field2;
        int var1 = Statics.field1100;
        if (Statics.field1212 < var0) {
            int var2 = Statics.field1212;
        }
        if (Statics.field116 < var1) {
            int var3 = Statics.field116;
        }
        if (Statics.field22 != null) {
            try {
                class101.method1801(Statics.field280, "resize", new Object[] { method3134() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("client.aq(I)V")
    public static void method589() {
        int var0 = field1766;
        int var1 = field1767;
        int var2 = Statics.field1212 - Statics.field2 - var0;
        int var3 = Statics.field116 - Statics.field1100 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field280.method1949();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1616 == var4) {
                Insets var7 = Statics.field1616.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field116);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1212, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1212 + var5 - var2, var6, var2, Statics.field116);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field116 + var6 - var3, Statics.field1212, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("w.ac(B)V")
    public static final void method208() {
        if (field441 != -1) {
            int var0 = field441;
            if (class170.method1780(var0)) {
                method1429(Statics.field2279[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field534; var1++) {
            if (field486[var1]) {
                field487[var1] = true;
            }
            field488[var1] = field486[var1];
            field486[var1] = false;
        }
        field485 = field291;
        field430 = -1;
        field431 = -1;
        Statics.field145 = null;
        if (field441 != -1) {
            field534 = 0;
            Statics.method734(field441, 0, 0, Statics.field2, Statics.field1100, 0, 0, -1);
        }
        class220.method3750();
        if (field422) {
            int var2 = Statics.field1831;
            int var3 = Statics.field2079;
            int var4 = Statics.field221;
            int var5 = Statics.field1584;
            int var6 = 6116423;
            class220.method3779(var2, var3, var4, var5, var6);
            class220.method3779(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class220.method3763(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field1622.method3658(class174.field2489, var2 + 3, var3 + 14, var6, -1);
            int var7 = class116.field1789;
            int var8 = class116.field1790 * -1088631201;
            for (int var9 = 0; var9 < field423; var9++) {
                int var10 = (field423 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                class209 var12 = Statics.field1622;
                String var13;
                if (field429[var9].length() > 0) {
                    var13 = field428[var9] + class174.field2360 + field429[var9];
                } else {
                    var13 = field428[var9];
                }
                var12.method3658(var13, var2 + 3, var10, var11, 0);
            }
            method2570(Statics.field1831, Statics.field2079, Statics.field221, Statics.field1584);
        } else if (field430 != -1) {
            method174(field430, field431);
        }
        if (field493 == 3) {
            for (int var14 = 0; var14 < field534; var14++) {
                if (field488[var14]) {
                    class220.method3762(field489[var14], field490[var14], field503[var14], field451[var14], 16711935, 128);
                } else if (field487[var14]) {
                    class220.method3762(field489[var14], field490[var14], field503[var14], field451[var14], 16711680, 128);
                }
            }
        }
        int var15 = Statics.field1075;
        int var16 = Statics.field2019.field612;
        int var17 = Statics.field2019.field601;
        int var18 = field463;
        for (class32 var19 = (class32) class32.field704.method2242(); var19 != null; var19 = (class32) class32.field704.method2244()) {
            if (var19.field706 != -1 || var19.field710 != null) {
                int var20 = 0;
                if (var16 > var19.field703) {
                    var20 += var16 - var19.field703;
                } else if (var16 < var19.field701) {
                    var20 += var19.field701 - var16;
                }
                if (var17 > var19.field717) {
                    var20 += var17 - var19.field717;
                } else if (var17 < var19.field702) {
                    var20 += var19.field702 - var17;
                }
                if (var20 - 64 > var19.field705 || field558 == 0 || var19.field700 != var15) {
                    if (var19.field707 != null) {
                        Statics.field223.method888(var19.field707);
                        var19.field707 = null;
                    }
                    if (var19.field699 != null) {
                        Statics.field223.method888(var19.field699);
                        var19.field699 = null;
                    }
                } else {
                    var20 -= 64;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    int var21 = field558 * (var19.field705 - var20) / var19.field705;
                    class54 var10000;
                    if (var19.field707 != null) {
                        var19.field707.method1104(var21);
                    } else if (var19.field706 >= 0) {
                        var10000 = (class54) null;
                        class54 var22 = class54.method940(Statics.field95, var19.field706, 0);
                        if (var22 != null) {
                            class56 var23 = var22.method938().method979(Statics.field1962);
                            class67 var24 = class67.method1100(var23, 100, var21);
                            var24.method1103(-1);
                            Statics.field223.method874(var24);
                            var19.field707 = var24;
                        }
                    }
                    if (var19.field699 != null) {
                        var19.field699.method1104(var21);
                        if (!var19.field699.method2227()) {
                            var19.field699 = null;
                        }
                    } else if (var19.field710 != null && (var19.field711 -= var18) <= 0) {
                        int var25 = (int) (Math.random() * (double) var19.field710.length);
                        var10000 = (class54) null;
                        class54 var26 = class54.method940(Statics.field95, var19.field710[var25], 0);
                        if (var26 != null) {
                            class56 var27 = var26.method938().method979(Statics.field1962);
                            class67 var28 = class67.method1100(var27, 100, var21);
                            var28.method1103(0);
                            Statics.field223.method874(var28);
                            var19.field699 = var28;
                            var19.field711 = var19.field708 + (int) (Math.random() * (double) (var19.field709 - var19.field708));
                        }
                    }
                }
            }
        }
        field463 = 0;
    }

    @ObfuscatedName("cl.am(Ljava/lang/String;ZB)V")
    public static final void method1529(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field236.method3655(arg0, 250);
        int var6 = Statics.field236.method3656(arg0, 250) * 13;
        class220.method3779(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3763(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field236.method3662(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method313(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2570(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2146.getGraphics();
            Statics.field1759.method3745(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2146.repaint();
        }
    }

    @ObfuscatedName("ak.ay(IIIII)V")
    public static final void method733(int arg0, int arg1, int arg2, int arg3) {
        field388++;
        method84(class16.field173);
        boolean var4 = false;
        if (field413 >= 0) {
            int var5 = class46.field889;
            int[] var6 = class46.field893;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field413 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method84(class16.field168);
        }
        method175(true);
        method84(var4 ? class16.field169 : class16.field166);
        method175(false);
        for (class43 var8 = (class43) field416.method2242(); var8 != null; var8 = (class43) field416.method2244()) {
            if (Statics.field1075 != var8.field870 || field291 > var8.field855) {
                var8.method2228();
            } else if (field291 >= var8.field861) {
                if (var8.field858 > 0) {
                    class36 var9 = field322[var8.field858 - 1];
                    if (var9 != null && var9.field612 >= 0 && var9.field612 < 13312 && var9.field601 >= 0 && var9.field601 < 13312) {
                        var8.method766(var9.field612, var9.field601, method3046(var9.field612, var9.field601, var8.field870) - var8.field877, field291);
                    }
                }
                if (var8.field858 < 0) {
                    int var10 = -var8.field858 - 1;
                    class24 var11;
                    if (field405 == var10) {
                        var11 = Statics.field2019;
                    } else {
                        var11 = field434[var10];
                    }
                    if (var11 != null && var11.field612 >= 0 && var11.field612 < 13312 && var11.field601 >= 0 && var11.field601 < 13312) {
                        var8.method766(var11.field612, var11.field601, method3046(var11.field612, var11.field601, var8.field870) - var8.field877, field291);
                    }
                }
                var8.method767(field463);
                Statics.field57.method1616(Statics.field1075, (int) var8.field860, (int) var8.field854, (int) var8.field862, 60, var8, var8.field868, -1, false);
            }
        }
        method718();
        method3490(arg0, arg1, arg2, arg3, true);
        int var12 = field421;
        int var13 = field519;
        int var14 = field443;
        int var15 = field547;
        class220.method3751(var12, var13, var12 + var14, var13 + var15);
        class85.method1544();
        if (!field530) {
            int var16 = field521;
            if (field407 / 256 > var16) {
                var16 = field407 / 256;
            }
            if (field494[4] && field533[4] + 128 > var16) {
                var16 = field533[4] + 128;
            }
            int var17 = field368 + field352 & 0x7FF;
            method3479(Statics.field237, method3046(Statics.field2019.field612, Statics.field2019.field601, Statics.field1075) - field373, Statics.field2069, var16, var17, var16 * 3 + 600);
        }
        int var30;
        if (field530) {
            var30 = Statics.method120();
        } else {
            int var18;
            if (Statics.field22.field691) {
                var18 = Statics.field1075;
            } else {
                label298: {
                    int var19 = 3;
                    if (Statics.field2151 < 310) {
                        int var20 = Statics.field771 >> 7;
                        int var21 = Statics.field1288 >> 7;
                        int var22 = Statics.field2019.field612 >> 7;
                        int var23 = Statics.field2019.field601 >> 7;
                        if (var20 < 0 || var21 < 0 || var20 >= 104 || var21 >= 104) {
                            var18 = Statics.field1075;
                            break label298;
                        }
                        if ((class11.field101[Statics.field1075][var20][var21] & 0x4) != 0) {
                            var19 = Statics.field1075;
                        }
                        int var24;
                        if (var22 > var20) {
                            var24 = var22 - var20;
                        } else {
                            var24 = var20 - var22;
                        }
                        int var25;
                        if (var23 > var21) {
                            var25 = var23 - var21;
                        } else {
                            var25 = var21 - var23;
                        }
                        if (var24 > var25) {
                            int var26 = var25 * 65536 / var24;
                            int var27 = 32768;
                            while (var20 != var22) {
                                if (var20 < var22) {
                                    var20++;
                                } else if (var20 > var22) {
                                    var20--;
                                }
                                if ((class11.field101[Statics.field1075][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field1075;
                                }
                                var27 += var26;
                                if (var27 >= 65536) {
                                    var27 -= 65536;
                                    if (var21 < var23) {
                                        var21++;
                                    } else if (var21 > var23) {
                                        var21--;
                                    }
                                    if ((class11.field101[Statics.field1075][var20][var21] & 0x4) != 0) {
                                        var19 = Statics.field1075;
                                    }
                                }
                            }
                        } else {
                            int var28 = var24 * 65536 / var25;
                            int var29 = 32768;
                            while (var21 != var23) {
                                if (var21 < var23) {
                                    var21++;
                                } else if (var21 > var23) {
                                    var21--;
                                }
                                if ((class11.field101[Statics.field1075][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field1075;
                                }
                                var29 += var28;
                                if (var29 >= 65536) {
                                    var29 -= 65536;
                                    if (var20 < var22) {
                                        var20++;
                                    } else if (var20 > var22) {
                                        var20--;
                                    }
                                    if ((class11.field101[Statics.field1075][var20][var21] & 0x4) != 0) {
                                        var19 = Statics.field1075;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field2019.field612 >= 0 && Statics.field2019.field601 >= 0 && Statics.field2019.field612 < 13312 && Statics.field2019.field601 < 13312) {
                        if ((class11.field101[Statics.field1075][Statics.field2019.field612 >> 7][Statics.field2019.field601 >> 7] & 0x4) != 0) {
                            var19 = Statics.field1075;
                        }
                        var18 = var19;
                    } else {
                        var18 = Statics.field1075;
                    }
                }
            }
            var30 = var18;
        }
        int var31 = Statics.field771;
        int var32 = Statics.field773;
        int var33 = Statics.field1288;
        int var34 = Statics.field2151;
        int var35 = Statics.field274;
        for (int var36 = 0; var36 < 5; var36++) {
            if (field494[var36]) {
                int var37 = (int) (Math.random() * (double) (field369[var36] * 2 + 1) - (double) field369[var36] + Math.sin((double) field316[var36] / 100.0D * (double) field511[var36]) * (double) field533[var36]);
                if (var36 == 0) {
                    Statics.field771 += var37;
                }
                if (var36 == 1) {
                    Statics.field773 += var37;
                }
                if (var36 == 2) {
                    Statics.field1288 += var37;
                }
                if (var36 == 3) {
                    Statics.field274 = Statics.field274 + var37 & 0x7FF;
                }
                if (var36 == 4) {
                    Statics.field2151 += var37;
                    if (Statics.field2151 < 128) {
                        Statics.field2151 = 128;
                    }
                    if (Statics.field2151 > 383) {
                        Statics.field2151 = 383;
                    }
                }
            }
        }
        int var38 = class116.field1789;
        int var39 = class116.field1790 * -1088631201;
        if (class116.field1795 != 0) {
            var38 = class116.field1792;
            var39 = class116.field1797;
        }
        if (var38 >= var12 && var38 < var12 + var14 && var39 >= var13 && var39 < var13 + var15) {
            class83.field1411 = true;
            class83.field1414 = 0;
            class83.field1412 = var38 - var12;
            class83.field1413 = var39 - var13;
        } else {
            class83.field1411 = false;
            class83.field1414 = 0;
        }
        method732();
        class220.method3779(var12, var13, var14, var15, 0);
        method732();
        int var40 = class85.field1438;
        class85.field1438 = field476;
        Statics.field57.method1638(Statics.field771, Statics.field773, Statics.field1288, Statics.field2151, Statics.field274, var30);
        class85.field1438 = var40;
        method732();
        Statics.field57.method1614();
        method29(var12, var13, var14, var15);
        method597(var12, var13);
        ((class75) Statics.field1435).method1332(field463);
        method600(var12, var13, var14, var15);
        Statics.field771 = var31;
        Statics.field773 = var32;
        Statics.field1288 = var33;
        Statics.field2151 = var34;
        Statics.field274 = var35;
        if (field302 && class186.method719(true, false) == 0) {
            field302 = false;
        }
        if (field302) {
            class220.method3779(var12, var13, var14, var15, 0);
            method1529(class174.field2348, false);
        }
    }

    @ObfuscatedName("gh.ar(IIIIZB)V")
    public static final void method3490(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field537 - field536) * var5 / 100 + field536;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field542) {
            short var8 = field542;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field541) {
                var6 = field541;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3750();
                    class220.method3779(arg0, arg1, var10, arg3, -16777216);
                    class220.method3779(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field514) {
            short var11 = field514;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field540) {
                var6 = field540;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3750();
                    class220.method3779(arg0, arg1, arg2, var13, -16777216);
                    class220.method3779(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field539 - field390) * var5 / 100 + field390;
        field476 = arg3 * var6 * var14 / 85504 << 1;
        if (field443 != arg2 || field547 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1439[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1635(var15, 500, 800, arg2, arg3);
        }
        field421 = arg0;
        field519 = arg1;
        field443 = arg2;
        field547 = arg3;
    }

    @ObfuscatedName("d.ab(Lj;B)V")
    public static final void method84(class16 arg0) {
        if (Statics.field2019.field612 >> 7 == field515 && Statics.field2019.field601 >> 7 == field548) {
            field515 = 0;
        }
        int var1 = class46.field889;
        int[] var2 = class46.field893;
        int var3 = var1;
        if (class16.field173 == arg0 || class16.field168 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field173 == arg0) {
                var5 = Statics.field2019;
                var6 = Statics.field2019.field245 << 14;
            } else if (class16.field168 == arg0) {
                var5 = field434[field413];
                var6 = field413 << 14;
            } else {
                var5 = field434[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field169 == arg0 && field413 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method221() && !var5.field261) {
                var5.field247 = false;
                if ((field287 && var1 > 50 || var1 > 200) && class16.field173 != arg0 && var5.field629 == var5.field605) {
                    var5.field247 = true;
                }
                int var7 = var5.field612 >> 7;
                int var8 = var5.field601 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field240 == null || field291 < var5.field268 || field291 >= var5.field250) {
                        if ((var5.field612 & 0x7F) == 64 && (var5.field601 & 0x7F) == 64) {
                            if (field388 == field387[var7][var8]) {
                                continue;
                            }
                            field387[var7][var8] = field388;
                        }
                        var5.field248 = method3046(var5.field612, var5.field601, Statics.field1075);
                        Statics.field57.method1616(Statics.field1075, var5.field612, var5.field601, var5.field248, 60, var5, var5.field656, var6, var5.field603);
                    } else {
                        var5.field247 = false;
                        var5.field248 = method3046(var5.field612, var5.field601, Statics.field1075);
                        Statics.field57.method1671(Statics.field1075, var5.field612, var5.field601, var5.field248, 60, var5, var5.field656, var6, var5.field255, var5.field259, var5.field257, var5.field258);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.as(ZB)V")
    public static final void method175(boolean arg0) {
        for (int var1 = 0; var1 < field323; var1++) {
            class36 var2 = field322[field484[var1]];
            int var3 = (field484[var1] << 14) + 536870912;
            if (var2 != null && var2.method221() && var2.field761.field3012 == arg0 && var2.field761.method3499()) {
                int var4 = var2.field612 >> 7;
                int var5 = var2.field601 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field604 == 1 && (var2.field612 & 0x7F) == 64 && (var2.field601 & 0x7F) == 64) {
                        if (field388 == field387[var4][var5]) {
                            continue;
                        }
                        field387[var4][var5] = field388;
                    }
                    if (!var2.field761.field3010) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field57.method1616(Statics.field1075, var2.field612, var2.field601, method3046(var2.field612 + (var2.field604 * 64 - 64), var2.field601 + (var2.field604 * 64 - 64), Statics.field1075), var2.field604 * 64 - 64 + 60, var2, var2.field656, var3, var2.field603);
                }
            }
        }
    }

    @ObfuscatedName("av.ap(I)V")
    public static final void method718() {
        for (class34 var0 = (class34) field406.method2242(); var0 != null; var0 = (class34) field406.method2244()) {
            if (Statics.field1075 != var0.field736 || var0.field743) {
                var0.method2228();
            } else if (field291 >= var0.field734) {
                var0.method691(field463);
                if (var0.field743) {
                    var0.method2228();
                } else {
                    Statics.field57.method1616(var0.field736, var0.field737, var0.field738, var0.field739, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("aj.ao(III)V")
    public static final void method597(int arg0, int arg1) {
        if (field299 == 2) {
            method180((field531 - Statics.field1465 << 7) + field305, (field427 - Statics.field129 << 7) + field324, field535 * 2);
            if (field389 > -1 && field291 % 20 < 10) {
                Statics.field254[0].method3884(field389 + arg0 - 12, field492 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ay.au(Lag;IIIIII)V")
    public static final void method783(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method221()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field761;
            if (var6.field3017 != null) {
                var6 = var6.method3498();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field889;
        int[] var8 = class46.field893;
        int var9 = 3;
        if (!arg0.field638.method2213()) {
            method620(arg0, arg0.field650 + 15);
            for (class35 var10 = (class35) arg0.field638.method2209(); var10 != null; var10 = (class35) arg0.field638.method2211()) {
                class29 var11 = var10.method703(field291);
                if (var11 != null) {
                    class194 var12 = var10.field748;
                    class225 var13 = var12.method3310();
                    class225 var14 = var12.method3312();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2828;
                    } else {
                        if (var12.field2821 * 2 < var14.field3205) {
                            var15 = var12.field2821;
                        }
                        var16 = var14.field3205 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field291 - var11.field663;
                    int var20 = var11.field661 * var16 / var12.field2828;
                    int var23;
                    if (var11.field664 > var19) {
                        int var21 = var12.field2824 == 0 ? 0 : var19 / var12.field2824 * var12.field2824;
                        int var22 = var11.field662 * var16 / var12.field2828;
                        var23 = (var20 - var22) * var21 / var11.field664 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field664 + var12.field2815 - var19;
                        if (var12.field2823 >= 0) {
                            var17 = (var24 << 8) / (var12.field2815 - var12.field2823);
                        }
                    }
                    if (var11.field661 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field389 + arg2 - (var16 >> 1);
                    int var26 = field492 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field389 > -1) {
                            class220.method3779(var25, var26, var23, 5, 65280);
                            class220.method3779(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3204;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3910(var27, var26, var17);
                            class220.method3786(var27, var26, var27 + var28, var26 + var29);
                            var14.method3910(var27, var26, var17);
                        } else {
                            var13.method3884(var27, var26);
                            class220.method3786(var27, var26, var27 + var28, var26 + var29);
                            var14.method3884(var27, var26);
                        }
                        class220.method3751(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method699()) {
                    var10.method2228();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field261) {
                return;
            }
            if (var30.field241 != -1 || var30.field243 != -1) {
                method620(arg0, arg0.field650 + 15);
                if (field389 > -1) {
                    if (var30.field241 != -1) {
                        Statics.field1937[var30.field241].method3884(field389 + arg2 - 12, field492 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field243 != -1) {
                        Statics.field67[var30.field243].method3884(field389 + arg2 - 12, field492 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field299 == 10 && field545 == var8[arg1]) {
                method620(arg0, arg0.field650 + 15);
                if (field389 > -1) {
                    Statics.field254[1].method3884(field389 + arg2 - 12, field492 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field761;
            if (var31.field3017 != null) {
                var31 = var31.method3498();
            }
            if (var31.field3015 >= 0 && var31.field3015 < Statics.field67.length) {
                method620(arg0, arg0.field650 + 15);
                if (field389 > -1) {
                    Statics.field67[var31.field3015].method3884(field389 + arg2 - 12, field492 + arg3 - 30);
                }
            }
            if (field299 == 1 && field300 == field484[arg1 - var7] && field291 % 20 < 10) {
                method620(arg0, arg0.field650 + 15);
                if (field389 > -1) {
                    Statics.field254[0].method3884(field389 + arg2 - 12, field492 + arg3 - 28);
                }
            }
        }
        if (arg0.field613 != null && (arg1 >= var7 || !arg0.field622 && (field499 == 4 || !arg0.field646 && (field499 == 0 || field499 == 3 || field499 == 1 && method1069(((class24) arg0).field244, false))))) {
            method620(arg0, arg0.field650);
            if (field389 > -1 && field377 < field378) {
                field382[field377] = Statics.field1622.method3665(arg0.field613) / 2;
                field381[field377] = Statics.field1622.field3088;
                field379[field377] = field389;
                field440[field377] = field492;
                field444[field377] = arg0.field600;
                field408[field377] = arg0.field618;
                field385[field377] = arg0.field616;
                field424[field377] = arg0.field613;
                field377++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field602[var32];
            int var34 = arg0.field620[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field291) {
                    continue;
                }
                var35 = class197.method1089(arg0.field620[var32]);
                var36 = var35.field2874;
                if (var35 != null && var35.field2875 != null) {
                    var35 = var35.method3349();
                    if (var35 == null) {
                        arg0.field602[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field645[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method1089(var37);
                if (var38 != null && var38.field2875 != null) {
                    var38 = var38.method3349();
                }
            }
            if (var33 - var36 <= field291) {
                if (var35 == null) {
                    arg0.field602[var32] = -1;
                } else {
                    method620(arg0, arg0.field650 / 2);
                    if (field389 > -1) {
                        if (var32 == 1) {
                            field492 -= 20;
                        }
                        if (var32 == 2) {
                            field389 -= 15;
                            field492 -= 10;
                        }
                        if (var32 == 3) {
                            field389 += 15;
                            field492 -= 10;
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
                        class225 var51 = null;
                        class225 var52 = null;
                        class225 var53 = null;
                        class225 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class225 var64 = var35.method3351();
                        if (var64 != null) {
                            var43 = var64.field3205;
                            int var65 = var64.field3204;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3210;
                        }
                        class225 var66 = var35.method3352();
                        if (var66 != null) {
                            var44 = var66.field3205;
                            int var67 = var66.field3204;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3210;
                        }
                        class225 var68 = var35.method3353();
                        if (var68 != null) {
                            var45 = var68.field3205;
                            int var69 = var68.field3204;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3210;
                        }
                        class225 var70 = var35.method3354();
                        if (var70 != null) {
                            var46 = var70.field3205;
                            int var71 = var70.field3204;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3210;
                        }
                        if (var38 != null) {
                            var51 = var38.method3351();
                            if (var51 != null) {
                                var55 = var51.field3205;
                                int var72 = var51.field3204;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3210;
                            }
                            var52 = var38.method3352();
                            if (var52 != null) {
                                var56 = var52.field3205;
                                int var73 = var52.field3204;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3210;
                            }
                            var53 = var38.method3353();
                            if (var53 != null) {
                                var57 = var53.field3205;
                                int var74 = var53.field3204;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3210;
                            }
                            var54 = var38.method3354();
                            if (var54 != null) {
                                var58 = var54.field3205;
                                int var75 = var54.field3204;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3210;
                            }
                        }
                        class209 var76 = var35.method3383();
                        if (var76 == null) {
                            var76 = Statics.field1187;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field1187;
                        } else {
                            var77 = var38.method3383();
                            if (var77 == null) {
                                var77 = Statics.field1187;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3348(arg0.field652[var32]);
                        int var83 = var76.method3665(var82);
                        if (var38 != null) {
                            var79 = var38.method3348(arg0.field624[var32]);
                            var81 = var77.method3665(var79);
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
                        int var100 = arg0.field602[var32] - field291;
                        int var101 = var35.field2869 - var35.field2869 * var100 / var35.field2874;
                        int var102 = var35.field2870 * var100 / var35.field2874 + -var35.field2870;
                        int var103 = field389 + arg2 - (var92 >> 1) + var101;
                        int var104 = field492 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2858 + var104 + 15;
                        int var108 = var107 - var76.field3089;
                        int var109 = var76.field3095 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2858 + var104 + 15;
                            int var111 = var110 - var77.field3089;
                            int var112 = var77.field3095 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2871 >= 0) {
                            var115 = (var100 << 8) / (var35.field2874 - var35.field2871);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3910(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3910(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3910(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3910(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3659(var82, var90 + var103, var107, var35.field2863, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3910(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3910(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3910(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3910(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3659(var79, var98 + var103, var110, var38.field2863, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3884(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3884(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3884(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3884(var93 + var103 - var50, var104);
                            }
                            var76.method3658(var82, var90 + var103, var107, var35.field2863 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3884(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3884(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3884(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3884(var97 + var103 - var62, var104);
                                }
                                var77.method3658(var79, var98 + var103, var110, var38.field2863 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.bw(IIIII)V")
    public static final void method29(int arg0, int arg1, int arg2, int arg3) {
        field377 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class46.field889;
        int[] var7 = class46.field893;
        for (int var8 = 0; var8 < field323 + var6; var8++) {
            class28 var9;
            if (var8 < var6) {
                var9 = field434[var7[var8]];
                if (field413 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field322[field484[var8 - var6]];
            }
            method783(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method783(field434[field413], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field377; var10++) {
            int var11 = field379[var10];
            int var12 = field440[var10];
            int var13 = field382[var10];
            int var14 = field381[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field440[var16] - field381[var16] && var12 - var14 < field440[var16] + 2 && var11 - var13 < field382[var16] + field379[var16] && var11 + var13 > field379[var16] - field382[var16] && field440[var16] - field381[var16] < var12) {
                        var12 = field440[var16] - field381[var16];
                        var15 = true;
                    }
                }
            }
            field389 = field379[var10];
            field492 = field440[var10] = var12;
            String var17 = field424[var10];
            if (field446 == 0) {
                int var18 = 16776960;
                if (field444[var10] < 6) {
                    var18 = field498[field444[var10]];
                }
                if (field444[var10] == 6) {
                    var18 = field388 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field444[var10] == 7) {
                    var18 = field388 % 20 < 10 ? 255 : 65535;
                }
                if (field444[var10] == 8) {
                    var18 = field388 % 20 < 10 ? 45056 : 8454016;
                }
                if (field444[var10] == 9) {
                    int var19 = 150 - field385[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field444[var10] == 10) {
                    int var20 = 150 - field385[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field444[var10] == 11) {
                    int var21 = 150 - field385[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field408[var10] == 0) {
                    Statics.field1622.method3661(var17, field389 + arg0, field492 + arg1, var18, 0);
                }
                if (field408[var10] == 1) {
                    Statics.field1622.method3701(var17, field389 + arg0, field492 + arg1, var18, 0, field388);
                }
                if (field408[var10] == 2) {
                    Statics.field1622.method3713(var17, field389 + arg0, field492 + arg1, var18, 0, field388);
                }
                if (field408[var10] == 3) {
                    Statics.field1622.method3686(var17, field389 + arg0, field492 + arg1, var18, 0, field388, 150 - field385[var10]);
                }
                if (field408[var10] == 4) {
                    int var22 = (150 - field385[var10]) * (Statics.field1622.method3665(var17) + 100) / 150;
                    class220.method3786(field389 + arg0 - 50, arg1, field389 + arg0 + 50, arg1 + arg3);
                    Statics.field1622.method3658(var17, field389 + arg0 + 50 - var22, field492 + arg1, var18, 0);
                    class220.method3751(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field408[var10] == 5) {
                    int var23 = 150 - field385[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class220.method3786(arg0, field492 + arg1 - Statics.field1622.field3088 - 1, arg0 + arg2, field492 + arg1 + 5);
                    Statics.field1622.method3661(var17, field389 + arg0, field492 + arg1 + var24, var18, 0);
                    class220.method3751(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1622.method3661(var17, field389 + arg0, field492 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ex.bv(I)V")
    public static final void method2310() {
        field403 = 0;
        int var0 = (Statics.field2019.field612 >> 7) + Statics.field1465;
        int var1 = (Statics.field2019.field601 >> 7) + Statics.field129;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field403 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field403 = 1;
        }
        if (field403 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field403 = 0;
        }
    }

    @ObfuscatedName("aj.bz(IIIIB)V")
    public static final void method600(int arg0, int arg1, int arg2, int arg3) {
        if (field394 == 1) {
            Statics.field2002[field393 / 100].method3884(field391 - 8, field392 - 8);
        }
        if (field394 == 2) {
            Statics.field2002[field393 / 100 + 4].method3884(field391 - 8, field392 - 8);
        }
        method2310();
    }

    @ObfuscatedName("al.be(Lag;II)V")
    public static final void method620(class28 arg0, int arg1) {
        method180(arg0.field612, arg0.field601, arg1);
    }

    @ObfuscatedName("p.bt(IIII)V")
    public static final void method180(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field389 = -1;
            field492 = -1;
            return;
        }
        int var3 = method3046(arg0, arg1, Statics.field1075) - arg2;
        int var4 = arg0 - Statics.field771;
        int var5 = var3 - Statics.field773;
        int var6 = arg1 - Statics.field1288;
        int var7 = class85.field1439[Statics.field2151];
        int var8 = class85.field1429[Statics.field2151];
        int var9 = class85.field1439[Statics.field274];
        int var10 = class85.field1429[Statics.field274];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field389 = field476 * var11 / var15 + field443 / 2;
            field492 = field476 * var14 / var15 + field547 / 2;
        } else {
            field389 = -1;
            field492 = -1;
        }
    }

    @ObfuscatedName("fp.bm(IIIB)I")
    public static final int method3046(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field101[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field104[var5][var3][var4] + class11.field104[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field104[var5][var3][var4 + 1] + class11.field104[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("gh.bb(IIIIIIS)V")
    public static final void method3479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1439[var6];
            int var12 = class85.field1429[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1439[var7];
            int var15 = class85.field1429[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field771 = arg0 - var8;
        Statics.field773 = arg1 - var9;
        Statics.field1288 = arg2 - var10;
        Statics.field2151 = arg3;
        Statics.field274 = arg4;
    }

    @ObfuscatedName("ax.bu(ZB)V")
    public static final void method683(boolean arg0) {
        field435 = arg0;
        if (!field435) {
            int var1 = field410.method2735();
            int var2 = field410.method2735();
            int var3 = field410.method2581();
            Statics.field1355 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1355[var4][var5] = field410.method2593();
                }
            }
            Statics.field2708 = new int[var3];
            Statics.field660 = new int[var3];
            Statics.field583 = new int[var3];
            Statics.field1681 = new byte[var3][];
            Statics.field60 = new byte[var3][];
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
                        Statics.field2708[var7] = var10;
                        Statics.field660[var7] = Statics.field564.method3076("m" + var8 + "_" + var9);
                        Statics.field583[var7] = Statics.field564.method3076("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method191(var1, var2);
            return;
        }
        int var11 = field410.method2592();
        int var12 = field410.method2735();
        int var13 = field410.method2581();
        field410.method2834();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field410.method2835(1);
                    if (var17 == 1) {
                        field346[var14][var15][var16] = field410.method2835(26);
                    } else {
                        field346[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field410.method2843();
        Statics.field1355 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1355[var18][var19] = field410.method2593();
            }
        }
        Statics.field2708 = new int[var13];
        Statics.field660 = new int[var13];
        Statics.field583 = new int[var13];
        Statics.field1681 = new byte[var13][];
        Statics.field60 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field346[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2708[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2708[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field660[var20] = Statics.field564.method3076("m" + var29 + "_" + var30);
                            Statics.field583[var20] = Statics.field564.method3076("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method191(var11, var12);
    }

    @ObfuscatedName("h.bn(III)V")
    public static final void method191(int arg0, int arg1) {
        if (Statics.field232 == arg0 && Statics.field32 == arg1) {
            return;
        }
        Statics.field232 = arg0;
        Statics.field32 = arg1;
        method177(25);
        method1529(class174.field2348, true);
        int var2 = Statics.field1465;
        int var3 = Statics.field129;
        Statics.field1465 = (arg0 - 6) * 8;
        Statics.field129 = (arg1 - 6) * 8;
        int var4 = Statics.field1465 - var2;
        int var5 = Statics.field129 - var3;
        int var6 = Statics.field1465;
        int var7 = Statics.field129;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field322[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field655[var10] -= var4;
                    var9.field610[var10] -= var5;
                }
                var9.field612 -= var4 * 128;
                var9.field601 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field434[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field655[var13] -= var4;
                    var12.field610[var13] -= var5;
                }
                var12.field612 -= var4 * 128;
                var12.field601 -= var5 * 128;
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
        for (class26 var25 = (class26) field546.method2242(); var25 != null; var25 = (class26) field546.method2244()) {
            var25.field569 -= var4;
            var25.field570 -= var5;
            if (var25.field569 < 0 || var25.field570 < 0 || var25.field569 >= 104 || var25.field570 >= 104) {
                var25.method2228();
            }
        }
        if (field515 != 0) {
            field515 -= var4;
            field548 -= var5;
        }
        field517 = 0;
        field530 = false;
        field360 = -1;
        field406.method2236();
        field416.method2236();
        for (int var26 = 0; var26 < 4; var26++) {
            field412[var26].method2084();
        }
    }

    @ObfuscatedName("s.by(ZI)V")
    public static final void method200(boolean arg0) {
        method732();
        field333++;
        if (field333 < 50 && !arg0) {
            return;
        }
        field333 = 0;
        if (field338 || Statics.field775 == null) {
            return;
        }
        field327.method2832(217);
        try {
            Statics.field775.method1908(field327.field2078, 0, field327.field2073);
            field327.field2073 = 0;
        } catch (IOException var2) {
            field338 = true;
        }
    }

    @ObfuscatedName("ap.bl(I)V")
    public static final void method856() {
        method200(false);
        field339 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1681.length; var1++) {
            if (Statics.field660[var1] != -1 && Statics.field1681[var1] == null) {
                Statics.field1681[var1] = Statics.field564.method3071(Statics.field660[var1], 0);
                if (Statics.field1681[var1] == null) {
                    var0 = false;
                    field339++;
                }
            }
            if (Statics.field583[var1] != -1 && Statics.field60[var1] == null) {
                Statics.field60[var1] = Statics.field564.method3131(Statics.field583[var1], 0, Statics.field1355[var1]);
                if (Statics.field60[var1] == null) {
                    var0 = false;
                    field339++;
                }
            }
        }
        if (!var0) {
            field343 = 1;
            return;
        }
        field341 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1681.length; var3++) {
            byte[] var4 = Statics.field60[var3];
            if (var4 != null) {
                int var5 = (Statics.field2708[var3] >> 8) * 64 - Statics.field1465;
                int var6 = (Statics.field2708[var3] & 0xFF) * 64 - Statics.field129;
                if (field435) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class154 var9 = new class154(var4);
                int var10 = -1;
                label1121: while (true) {
                    int var11 = var9.method2776();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2776();
                            if (var16 == 0) {
                                continue label1121;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2708() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class198 var22 = class198.method1443(var10);
                                if (var19 != 22 || !field287 || var22.field2900 != 0 || var22.field2924 == 1 || var22.field2919) {
                                    if (!var22.method3390()) {
                                        field341++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2776();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2708();
                    }
                }
            }
        }
        if (!var2) {
            field343 = 2;
            return;
        }
        if (field343 != 0) {
            method1529(class174.field2348 + class38.field780 + class38.field778 + 100 + "%" + class38.field776, true);
        }
        method732();
        method1442();
        method732();
        Statics.field57.method1705();
        method732();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field412[var23].method2084();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class11.field101[var24][var25][var26] = 0;
                }
            }
        }
        method732();
        class11.field96 = 99;
        Statics.field110 = new byte[4][104][104];
        Statics.field115 = new byte[4][104][104];
        Statics.field99 = new byte[4][104][104];
        Statics.field2625 = new byte[4][104][104];
        Statics.field3190 = new int[4][105][105];
        Statics.field2620 = new byte[4][105][105];
        Statics.field2786 = new int[105][105];
        Statics.field222 = new int[104];
        Statics.field100 = new int[104];
        Statics.field2792 = new int[104];
        Statics.field797 = new int[104];
        Statics.field1588 = new int[104];
        int var27 = Statics.field1681.length;
        class32.method3040();
        method200(true);
        if (!field435) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field2708[var28] >> 8) * 64 - Statics.field1465;
                int var30 = (Statics.field2708[var28] & 0xFF) * 64 - Statics.field129;
                byte[] var31 = Statics.field1681[var28];
                if (var31 != null) {
                    method732();
                    int var32 = Statics.field232 * 8 - 48;
                    int var33 = Statics.field32 * 8 - 48;
                    class118[] var34 = field412;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field1821[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class154 var38 = new class154(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class11.method1595(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field2708[var42] >> 8) * 64 - Statics.field1465;
                int var44 = (Statics.field2708[var42] & 0xFF) * 64 - Statics.field129;
                byte[] var45 = Statics.field1681[var42];
                if (var45 == null && Statics.field32 < 800) {
                    method732();
                    class11.method3056(var43, var44, 64, 64);
                }
            }
            method200(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field60[var46];
                if (var47 != null) {
                    int var48 = (Statics.field2708[var46] >> 8) * 64 - Statics.field1465;
                    int var49 = (Statics.field2708[var46] & 0xFF) * 64 - Statics.field129;
                    method732();
                    class88 var50 = Statics.field57;
                    class118[] var51 = field412;
                    class154 var52 = new class154(var47);
                    int var53 = -1;
                    while (true) {
                        int var54 = var52.method2776();
                        if (var54 == 0) {
                            break;
                        }
                        var53 += var54;
                        int var55 = 0;
                        while (true) {
                            int var56 = var52.method2776();
                            if (var56 == 0) {
                                break;
                            }
                            var55 += var56 - 1;
                            int var57 = var55 & 0x3F;
                            int var58 = var55 >> 6 & 0x3F;
                            int var59 = var55 >> 12;
                            int var60 = var52.method2708();
                            int var61 = var60 >> 2;
                            int var62 = var60 & 0x3;
                            int var63 = var48 + var58;
                            int var64 = var49 + var57;
                            if (var63 > 0 && var64 > 0 && var63 < 103 && var64 < 103) {
                                int var65 = var59;
                                if ((class11.field101[1][var63][var64] & 0x2) == 2) {
                                    var65 = var59 - 1;
                                }
                                class118 var66 = null;
                                if (var65 >= 0) {
                                    var66 = var51[var65];
                                }
                                class11.method173(var59, var63, var64, var53, var62, var61, var50, var66);
                            }
                        }
                    }
                }
            }
        }
        if (field435) {
            for (int var67 = 0; var67 < 4; var67++) {
                method732();
                for (int var68 = 0; var68 < 13; var68++) {
                    for (int var69 = 0; var69 < 13; var69++) {
                        boolean var70 = false;
                        int var71 = field346[var67][var68][var69];
                        if (var71 != -1) {
                            int var72 = var71 >> 24 & 0x3;
                            int var73 = var71 >> 1 & 0x3;
                            int var74 = var71 >> 14 & 0x3FF;
                            int var75 = var71 >> 3 & 0x7FF;
                            int var76 = (var74 / 8 << 8) + var75 / 8;
                            for (int var77 = 0; var77 < Statics.field2708.length; var77++) {
                                if (Statics.field2708[var77] == var76 && Statics.field1681[var77] != null) {
                                    class11.method3606(Statics.field1681[var77], var67, var68 * 8, var69 * 8, var72, (var74 & 0x7) * 8, (var75 & 0x7) * 8, var73, field412);
                                    var70 = true;
                                    break;
                                }
                            }
                        }
                        if (!var70) {
                            int var78 = var67;
                            int var79 = var68 * 8;
                            int var80 = var69 * 8;
                            for (int var81 = 0; var81 < 8; var81++) {
                                for (int var82 = 0; var82 < 8; var82++) {
                                    class11.field104[var78][var79 + var81][var80 + var82] = 0;
                                }
                            }
                            if (var79 > 0) {
                                for (int var83 = 1; var83 < 8; var83++) {
                                    class11.field104[var78][var79][var80 + var83] = class11.field104[var78][var79 - 1][var80 + var83];
                                }
                            }
                            if (var80 > 0) {
                                for (int var84 = 1; var84 < 8; var84++) {
                                    class11.field104[var78][var79 + var84][var80] = class11.field104[var78][var79 + var84][var80 - 1];
                                }
                            }
                            if (var79 > 0 && class11.field104[var78][var79 - 1][var80] != 0) {
                                class11.field104[var78][var79][var80] = class11.field104[var78][var79 - 1][var80];
                            } else if (var80 > 0 && class11.field104[var78][var79][var80 - 1] != 0) {
                                class11.field104[var78][var79][var80] = class11.field104[var78][var79][var80 - 1];
                            } else if (var79 > 0 && var80 > 0 && class11.field104[var78][var79 - 1][var80 - 1] != 0) {
                                class11.field104[var78][var79][var80] = class11.field104[var78][var79 - 1][var80 - 1];
                            }
                        }
                    }
                }
            }
            for (int var85 = 0; var85 < 13; var85++) {
                for (int var86 = 0; var86 < 13; var86++) {
                    int var87 = field346[0][var85][var86];
                    if (var87 == -1) {
                        class11.method3056(var85 * 8, var86 * 8, 8, 8);
                    }
                }
            }
            method200(true);
            for (int var88 = 0; var88 < 4; var88++) {
                method732();
                for (int var89 = 0; var89 < 13; var89++) {
                    for (int var90 = 0; var90 < 13; var90++) {
                        int var91 = field346[var88][var89][var90];
                        if (var91 != -1) {
                            int var92 = var91 >> 24 & 0x3;
                            int var93 = var91 >> 1 & 0x3;
                            int var94 = var91 >> 14 & 0x3FF;
                            int var95 = var91 >> 3 & 0x7FF;
                            int var96 = (var94 / 8 << 8) + var95 / 8;
                            for (int var97 = 0; var97 < Statics.field2708.length; var97++) {
                                if (Statics.field2708[var97] == var96 && Statics.field60[var97] != null) {
                                    class11.method2081(Statics.field60[var97], var88, var89 * 8, var90 * 8, var92, (var94 & 0x7) * 8, (var95 & 0x7) * 8, var93, Statics.field57, field412);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method200(true);
        method1442();
        method732();
        class88 var98 = Statics.field57;
        class118[] var99 = field412;
        for (int var100 = 0; var100 < 4; var100++) {
            for (int var101 = 0; var101 < 104; var101++) {
                for (int var102 = 0; var102 < 104; var102++) {
                    if ((class11.field101[var100][var101][var102] & 0x1) == 1) {
                        int var103 = var100;
                        if ((class11.field101[1][var101][var102] & 0x2) == 2) {
                            var103 = var100 - 1;
                        }
                        if (var103 >= 0) {
                            var99[var103].method2087(var101, var102);
                        }
                    }
                }
            }
        }
        class11.field94 += (int) (Math.random() * 5.0D) - 2;
        if (class11.field94 < -8) {
            class11.field94 = -8;
        }
        if (class11.field94 > 8) {
            class11.field94 = 8;
        }
        class11.field98 += (int) (Math.random() * 5.0D) - 2;
        if (class11.field98 < -16) {
            class11.field98 = -16;
        }
        if (class11.field98 > 16) {
            class11.field98 = 16;
        }
        for (int var104 = 0; var104 < 4; var104++) {
            byte[][] var105 = Statics.field2620[var104];
            int var106 = (int) Math.sqrt(5100.0D);
            int var107 = var106 * 768 >> 8;
            for (int var108 = 1; var108 < 103; var108++) {
                for (int var109 = 1; var109 < 103; var109++) {
                    int var110 = class11.field104[var104][var109 + 1][var108] - class11.field104[var104][var109 - 1][var108];
                    int var111 = class11.field104[var104][var109][var108 + 1] - class11.field104[var104][var109][var108 - 1];
                    int var112 = (int) Math.sqrt((double) (var111 * var111 + var110 * var110 + 65536));
                    int var113 = (var110 << 8) / var112;
                    int var114 = 65536 / var112;
                    int var115 = (var111 << 8) / var112;
                    int var116 = (var115 * -50 + var113 * -50 + var114 * -10) / var107 + 96;
                    int var117 = (var105[var109][var108] >> 1) + (var105[var109][var108 + 1] >> 3) + (var105[var109][var108 - 1] >> 2) + (var105[var109 - 1][var108] >> 2) + (var105[var109 + 1][var108] >> 3);
                    Statics.field2786[var109][var108] = var116 - var117;
                }
            }
            for (int var118 = 0; var118 < 104; var118++) {
                Statics.field222[var118] = 0;
                Statics.field100[var118] = 0;
                Statics.field2792[var118] = 0;
                Statics.field797[var118] = 0;
                Statics.field1588[var118] = 0;
            }
            for (int var119 = -5; var119 < 109; var119++) {
                for (int var120 = 0; var120 < 104; var120++) {
                    int var121 = var119 + 5;
                    int var10002;
                    if (var121 >= 0 && var121 < 104) {
                        int var122 = Statics.field110[var104][var121][var120] & 0xFF;
                        if (var122 > 0) {
                            int var123 = var122 - 1;
                            class192 var124 = (class192) class192.field2790.method2186((long) var123);
                            class192 var125;
                            if (var124 == null) {
                                byte[] var126 = Statics.field2796.method3071(1, var123);
                                class192 var127 = new class192();
                                if (var126 != null) {
                                    var127.method3269(new class154(var126), var123);
                                }
                                var127.method3255();
                                class192.field2790.method2179(var127, (long) var123);
                                var125 = var127;
                            } else {
                                var125 = var124;
                            }
                            Statics.field222[var120] += var125.field2788;
                            Statics.field100[var120] += var125.field2789;
                            Statics.field2792[var120] += var125.field2785;
                            Statics.field797[var120] += var125.field2791;
                            var10002 = Statics.field1588[var120]++;
                        }
                    }
                    int var129 = var119 - 5;
                    if (var129 >= 0 && var129 < 104) {
                        int var130 = Statics.field110[var104][var129][var120] & 0xFF;
                        if (var130 > 0) {
                            int var131 = var130 - 1;
                            class192 var132 = (class192) class192.field2790.method2186((long) var131);
                            class192 var133;
                            if (var132 == null) {
                                byte[] var134 = Statics.field2796.method3071(1, var131);
                                class192 var135 = new class192();
                                if (var134 != null) {
                                    var135.method3269(new class154(var134), var131);
                                }
                                var135.method3255();
                                class192.field2790.method2179(var135, (long) var131);
                                var133 = var135;
                            } else {
                                var133 = var132;
                            }
                            Statics.field222[var120] -= var133.field2788;
                            Statics.field100[var120] -= var133.field2789;
                            Statics.field2792[var120] -= var133.field2785;
                            Statics.field797[var120] -= var133.field2791;
                            var10002 = Statics.field1588[var120]--;
                        }
                    }
                }
                if (var119 >= 1 && var119 < 103) {
                    int var137 = 0;
                    int var138 = 0;
                    int var139 = 0;
                    int var140 = 0;
                    int var141 = 0;
                    for (int var142 = -5; var142 < 109; var142++) {
                        int var143 = var142 + 5;
                        if (var143 >= 0 && var143 < 104) {
                            var137 += Statics.field222[var143];
                            var138 += Statics.field100[var143];
                            var139 += Statics.field2792[var143];
                            var140 += Statics.field797[var143];
                            var141 += Statics.field1588[var143];
                        }
                        int var144 = var142 - 5;
                        if (var144 >= 0 && var144 < 104) {
                            var137 -= Statics.field222[var144];
                            var138 -= Statics.field100[var144];
                            var139 -= Statics.field2792[var144];
                            var140 -= Statics.field797[var144];
                            var141 -= Statics.field1588[var144];
                        }
                        if (var142 >= 1 && var142 < 103 && (!field287 || (class11.field101[0][var119][var142] & 0x2) != 0 || (class11.field101[var104][var119][var142] & 0x10) == 0)) {
                            if (var104 < class11.field96) {
                                class11.field96 = var104;
                            }
                            int var145 = Statics.field110[var104][var119][var142] & 0xFF;
                            int var146 = Statics.field115[var104][var119][var142] & 0xFF;
                            if (var145 > 0 || var146 > 0) {
                                int var147 = class11.field104[var104][var119][var142];
                                int var148 = class11.field104[var104][var119 + 1][var142];
                                int var149 = class11.field104[var104][var119 + 1][var142 + 1];
                                int var150 = class11.field104[var104][var119][var142 + 1];
                                int var151 = Statics.field2786[var119][var142];
                                int var152 = Statics.field2786[var119 + 1][var142];
                                int var153 = Statics.field2786[var119 + 1][var142 + 1];
                                int var154 = Statics.field2786[var119][var142 + 1];
                                int var155 = -1;
                                int var156 = -1;
                                if (var145 > 0) {
                                    int var157 = var137 * 256 / var140;
                                    int var158 = var138 / var141;
                                    int var159 = var139 / var141;
                                    var155 = class11.method3326(var157, var158, var159);
                                    int var160 = class11.field94 + var157 & 0xFF;
                                    int var161 = class11.field98 + var159;
                                    if (var161 < 0) {
                                        var161 = 0;
                                    } else if (var161 > 255) {
                                        var161 = 255;
                                    }
                                    var156 = class11.method3326(var160, var158, var161);
                                }
                                if (var104 > 0) {
                                    boolean var162 = true;
                                    if (var145 == 0 && Statics.field99[var104][var119][var142] != 0) {
                                        var162 = false;
                                    }
                                    if (var146 > 0 && !class201.method1934(var146 - 1).field3026) {
                                        var162 = false;
                                    }
                                    if (var162 && var147 == var148 && var147 == var149 && var147 == var150) {
                                        Statics.field3190[var104][var119][var142] |= 0x924;
                                    }
                                }
                                int var163 = 0;
                                if (var156 != -1) {
                                    var163 = class85.field1448[class11.method3177(var156, 96)];
                                }
                                if (var146 == 0) {
                                    var98.method1605(var104, var119, var142, 0, 0, -1, var147, var148, var149, var150, class11.method3177(var155, var151), class11.method3177(var155, var152), class11.method3177(var155, var153), class11.method3177(var155, var154), 0, 0, 0, 0, var163, 0);
                                } else {
                                    int var164 = Statics.field99[var104][var119][var142] + 1;
                                    byte var165 = Statics.field2625[var104][var119][var142];
                                    class201 var166 = class201.method1934(var146 - 1);
                                    int var167 = var166.field3031;
                                    int var168;
                                    int var169;
                                    if (var167 >= 0) {
                                        var168 = Statics.field1435.method1317(var167);
                                        var169 = -1;
                                    } else if (var166.field3036 == 16711935) {
                                        var169 = -2;
                                        var167 = -1;
                                        var168 = -2;
                                    } else {
                                        var169 = class11.method3326(var166.field3029, var166.field3027, var166.field3023);
                                        int var170 = class11.field94 + var166.field3029 & 0xFF;
                                        int var171 = class11.field98 + var166.field3023;
                                        if (var171 < 0) {
                                            var171 = 0;
                                        } else if (var171 > 255) {
                                            var171 = 255;
                                        }
                                        var168 = class11.method3326(var170, var166.field3027, var171);
                                    }
                                    int var172 = 0;
                                    if (var168 != -2) {
                                        var172 = class85.field1448[Statics.method1933(var168, 96)];
                                    }
                                    if (var166.field3028 != -1) {
                                        int var173 = class11.field94 + var166.field3032 & 0xFF;
                                        int var174 = class11.field98 + var166.field3034;
                                        if (var174 < 0) {
                                            var174 = 0;
                                        } else if (var174 > 255) {
                                            var174 = 255;
                                        }
                                        int var175 = class11.method3326(var173, var166.field3033, var174);
                                        var172 = class85.field1448[Statics.method1933(var175, 96)];
                                    }
                                    var98.method1605(var104, var119, var142, var164, var165, var167, var147, var148, var149, var150, class11.method3177(var155, var151), class11.method3177(var155, var152), class11.method3177(var155, var153), class11.method3177(var155, var154), Statics.method1933(var169, var151), Statics.method1933(var169, var152), Statics.method1933(var169, var153), Statics.method1933(var169, var154), var163, var172);
                                }
                            }
                        }
                    }
                }
            }
            for (int var176 = 1; var176 < 103; var176++) {
                for (int var177 = 1; var177 < 103; var177++) {
                    var98.method1656(var104, var177, var176, Statics.method204(var104, var177, var176));
                }
            }
            Statics.field110[var104] = (byte[][]) null;
            Statics.field115[var104] = (byte[][]) null;
            Statics.field99[var104] = (byte[][]) null;
            Statics.field2625[var104] = (byte[][]) null;
            Statics.field2620[var104] = (byte[][]) null;
        }
        var98.method1631(-50, -10, -50);
        for (int var178 = 0; var178 < 104; var178++) {
            for (int var179 = 0; var179 < 104; var179++) {
                if ((class11.field101[1][var178][var179] & 0x2) == 2) {
                    var98.method1677(var178, var179);
                }
            }
        }
        int var180 = 1;
        int var181 = 2;
        int var182 = 4;
        for (int var183 = 0; var183 < 4; var183++) {
            if (var183 > 0) {
                var180 <<= 0x3;
                var181 <<= 0x3;
                var182 <<= 0x3;
            }
            for (int var184 = 0; var184 <= var183; var184++) {
                for (int var185 = 0; var185 <= 104; var185++) {
                    for (int var186 = 0; var186 <= 104; var186++) {
                        if ((Statics.field3190[var184][var186][var185] & var180) != 0) {
                            int var187 = var185;
                            int var188 = var185;
                            int var189 = var184;
                            int var190 = var184;
                            while (var187 > 0 && (Statics.field3190[var184][var186][var187 - 1] & var180) != 0) {
                                var187--;
                            }
                            while (var188 < 104 && (Statics.field3190[var184][var186][var188 + 1] & var180) != 0) {
                                var188++;
                            }
                            label657: while (var189 > 0) {
                                for (int var191 = var187; var191 <= var188; var191++) {
                                    if ((Statics.field3190[var189 - 1][var186][var191] & var180) == 0) {
                                        break label657;
                                    }
                                }
                                var189--;
                            }
                            label646: while (var190 < var183) {
                                for (int var192 = var187; var192 <= var188; var192++) {
                                    if ((Statics.field3190[var190 + 1][var186][var192] & var180) == 0) {
                                        break label646;
                                    }
                                }
                                var190++;
                            }
                            int var193 = (var190 + 1 - var189) * (var188 - var187 + 1);
                            if (var193 >= 8) {
                                short var194 = 240;
                                int var195 = class11.field104[var190][var186][var187] - var194;
                                int var196 = class11.field104[var189][var186][var187];
                                class88.method1603(var183, 1, var186 * 128, var186 * 128, var187 * 128, var188 * 128 + 128, var195, var196);
                                for (int var197 = var189; var197 <= var190; var197++) {
                                    for (int var198 = var187; var198 <= var188; var198++) {
                                        Statics.field3190[var197][var186][var198] &= ~var180;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3190[var184][var186][var185] & var181) != 0) {
                            int var199 = var186;
                            int var200 = var186;
                            int var201 = var184;
                            int var202 = var184;
                            while (var199 > 0 && (Statics.field3190[var184][var199 - 1][var185] & var181) != 0) {
                                var199--;
                            }
                            while (var200 < 104 && (Statics.field3190[var184][var200 + 1][var185] & var181) != 0) {
                                var200++;
                            }
                            label710: while (var201 > 0) {
                                for (int var203 = var199; var203 <= var200; var203++) {
                                    if ((Statics.field3190[var201 - 1][var203][var185] & var181) == 0) {
                                        break label710;
                                    }
                                }
                                var201--;
                            }
                            label699: while (var202 < var183) {
                                for (int var204 = var199; var204 <= var200; var204++) {
                                    if ((Statics.field3190[var202 + 1][var204][var185] & var181) == 0) {
                                        break label699;
                                    }
                                }
                                var202++;
                            }
                            int var205 = (var202 + 1 - var201) * (var200 - var199 + 1);
                            if (var205 >= 8) {
                                short var206 = 240;
                                int var207 = class11.field104[var202][var199][var185] - var206;
                                int var208 = class11.field104[var201][var199][var185];
                                class88.method1603(var183, 2, var199 * 128, var200 * 128 + 128, var185 * 128, var185 * 128, var207, var208);
                                for (int var209 = var201; var209 <= var202; var209++) {
                                    for (int var210 = var199; var210 <= var200; var210++) {
                                        Statics.field3190[var209][var210][var185] &= ~var181;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3190[var184][var186][var185] & var182) != 0) {
                            int var211 = var186;
                            int var212 = var186;
                            int var213 = var185;
                            int var214 = var185;
                            while (var213 > 0 && (Statics.field3190[var184][var186][var213 - 1] & var182) != 0) {
                                var213--;
                            }
                            while (var214 < 104 && (Statics.field3190[var184][var186][var214 + 1] & var182) != 0) {
                                var214++;
                            }
                            label763: while (var211 > 0) {
                                for (int var215 = var213; var215 <= var214; var215++) {
                                    if ((Statics.field3190[var184][var211 - 1][var215] & var182) == 0) {
                                        break label763;
                                    }
                                }
                                var211--;
                            }
                            label752: while (var212 < 104) {
                                for (int var216 = var213; var216 <= var214; var216++) {
                                    if ((Statics.field3190[var184][var212 + 1][var216] & var182) == 0) {
                                        break label752;
                                    }
                                }
                                var212++;
                            }
                            if ((var212 - var211 + 1) * (var214 - var213 + 1) >= 4) {
                                int var217 = class11.field104[var184][var211][var213];
                                class88.method1603(var183, 4, var211 * 128, var212 * 128 + 128, var213 * 128, var214 * 128 + 128, var217, var217);
                                for (int var218 = var211; var218 <= var212; var218++) {
                                    for (int var219 = var213; var219 <= var214; var219++) {
                                        Statics.field3190[var184][var218][var219] &= ~var182;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method200(true);
        int var220 = class11.field96;
        if (var220 > Statics.field1075) {
            var220 = Statics.field1075;
        }
        if (var220 < Statics.field1075 - 1) {
            int var221 = Statics.field1075 - 1;
        }
        if (field287) {
            Statics.field57.method1743(class11.field96);
        } else {
            Statics.field57.method1743(0);
        }
        for (int var222 = 0; var222 < 104; var222++) {
            for (int var223 = 0; var223 < 104; var223++) {
                method782(var222, var223);
            }
        }
        method732();
        method179();
        class198.field2930.method2176();
        if (Statics.field1616 != null) {
            field327.method2832(116);
            field327.method2576(1057001181);
        }
        if (!field435) {
            int var224 = (Statics.field232 - 6) / 8;
            int var225 = (Statics.field232 + 6) / 8;
            int var226 = (Statics.field32 - 6) / 8;
            int var227 = (Statics.field32 + 6) / 8;
            for (int var228 = var224 - 1; var228 <= var225 + 1; var228++) {
                for (int var229 = var226 - 1; var229 <= var227 + 1; var229++) {
                    if (var228 < var224 || var228 > var225 || var229 < var226 || var229 > var227) {
                        Statics.field564.method3080("m" + var228 + "_" + var229);
                        Statics.field564.method3080("l" + var228 + "_" + var229);
                    }
                }
            }
        }
        method177(30);
        method732();
        Statics.field110 = (byte[][][]) null;
        Statics.field115 = (byte[][][]) null;
        Statics.field99 = (byte[][][]) null;
        Statics.field2625 = (byte[][][]) null;
        Statics.field3190 = (int[][][]) null;
        Statics.field2620 = (byte[][][]) null;
        Statics.field2786 = (int[][]) null;
        Statics.field222 = null;
        Statics.field100 = null;
        Statics.field2792 = null;
        Statics.field797 = null;
        Statics.field1588 = null;
        field327.method2832(49);
        Statics.field80.method1787();
        for (int var230 = 0; var230 < 32; var230++) {
            field1773[var230] = 0L;
        }
        for (int var231 = 0; var231 < 32; var231++) {
            field1756[var231] = 0L;
        }
        Statics.field754 = 0;
    }

    @ObfuscatedName("ck.bi(IB)V")
    public static final void method1797(int arg0) {
        int[] var1 = Statics.field2669.field3203;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class11.field101[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field57.method1634(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class11.field101[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field57.method1634(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2669.method3874();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class11.field101[arg0][var10][var9] & 0x18) == 0) {
                    method2077(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class11.field101[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2077(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field363 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field57.method1629(Statics.field1075, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method1443(var14).field2883;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field412[Statics.field1075].field1821;
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
                        field306[field363] = Statics.field3105[var15];
                        field512[field363] = var16;
                        field513[field363] = var17;
                        field363++;
                    }
                }
            }
        }
        Statics.field1759.method3832();
    }

    @ObfuscatedName("dw.bo(IIIIIB)V")
    public static final void method2077(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field57.method1626(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field57.method1644(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2669.field3203;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method1443(var12);
            if (var13.field2910 == -1) {
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
                class223 var14 = Statics.field1781[var13.field2910];
                if (var14 != null) {
                    int var15 = (var13.field2896 * 4 - var14.field3196) / 2;
                    int var16 = (var13.field2932 * 4 - var14.field3191) / 2;
                    var14.method3839(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2932) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field57.method1628(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field57.method1644(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method1443(var21);
            if (var22.field2910 != -1) {
                class223 var23 = Statics.field1781[var22.field2910];
                if (var23 != null) {
                    int var24 = (var22.field2896 * 4 - var23.field3196) / 2;
                    int var25 = (var22.field2932 * 4 - var23.field3191) / 2;
                    var23.method3839(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2932) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2669.field3203;
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
        int var29 = Statics.field57.method1629(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method1443(var30);
        if (var31.field2910 == -1) {
            return;
        }
        class223 var32 = Statics.field1781[var31.field2910];
        if (var32 != null) {
            int var33 = (var31.field2896 * 4 - var32.field3196) / 2;
            int var34 = (var31.field2932 * 4 - var32.field3191) / 2;
            var32.method3839(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2932) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("cx.br(I)V")
    public static final void method1809() {
        if (field375 == 95) {
            int var0 = field410.method2708();
            int var1 = (var0 >> 4 & 0x7) + Statics.field235;
            int var2 = (var0 & 0x7) + Statics.field581;
            int var3 = field410.method2581();
            int var4 = field410.method2708();
            int var5 = field410.method2581();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class34 var8 = new class34(var3, Statics.field1075, var6, var7, method3046(var6, var7, Statics.field1075) - var4, var5, field291);
                field406.method2245(var8);
            }
        } else if (field375 == 225) {
            int var9 = field410.method2708();
            int var10 = (var9 >> 4 & 0x7) + Statics.field235;
            int var11 = (var9 & 0x7) + Statics.field581;
            int var12 = field410.method2581();
            int var13 = field410.method2581();
            int var14 = field410.method2581();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                class129 var15 = field414[Statics.field1075][var10][var11];
                if (var15 != null) {
                    for (class44 var16 = (class44) var15.method2242(); var16 != null; var16 = (class44) var15.method2244()) {
                        if ((var12 & 0x7FFF) == var16.field879 && var16.field878 == var13) {
                            var16.field878 = var14;
                            break;
                        }
                    }
                    method782(var10, var11);
                }
            }
        } else if (field375 == 236) {
            int var17 = field410.method2615();
            int var18 = (var17 >> 4 & 0x7) + Statics.field235;
            int var19 = (var17 & 0x7) + Statics.field581;
            int var20 = field410.method2735();
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class129 var21 = field414[Statics.field1075][var18][var19];
                if (var21 != null) {
                    for (class44 var22 = (class44) var21.method2242(); var22 != null; var22 = (class44) var21.method2244()) {
                        if ((var20 & 0x7FFF) == var22.field879) {
                            var22.method2228();
                            break;
                        }
                    }
                    if (var21.method2242() == null) {
                        field414[Statics.field1075][var18][var19] = null;
                    }
                    method782(var18, var19);
                }
            }
        } else if (field375 == 137) {
            int var23 = field410.method2708();
            int var24 = (var23 >> 4 & 0x7) + Statics.field235;
            int var25 = (var23 & 0x7) + Statics.field581;
            int var26 = field410.method2592();
            int var27 = field410.method2708();
            int var28 = var27 >> 2;
            int var29 = var27 & 0x3;
            int var30 = field347[var28];
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                method3251(Statics.field1075, var24, var25, var30, var26, var28, var29, 0, -1);
            }
        } else if (field375 == 181) {
            int var31 = field410.method2616();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field347[var32];
            int var35 = field410.method2581();
            int var36 = field410.method2708();
            int var37 = (var36 >> 4 & 0x7) + Statics.field235;
            int var38 = (var36 & 0x7) + Statics.field581;
            if (var37 >= 0 && var38 >= 0 && var37 < 103 && var38 < 103) {
                if (var34 == 0) {
                    class91 var39 = Statics.field57.method1690(Statics.field1075, var37, var38);
                    if (var39 != null) {
                        int var40 = var39.field1543 >> 14 & 0x7FFF;
                        if (var32 == 2) {
                            var39.field1548 = new class50(var40, 2, var33 + 4, Statics.field1075, var37, var38, var35, false, var39.field1548);
                            var39.field1550 = new class50(var40, 2, var33 + 1 & 0x3, Statics.field1075, var37, var38, var35, false, var39.field1550);
                        } else {
                            var39.field1548 = new class50(var40, var32, var33, Statics.field1075, var37, var38, var35, false, var39.field1548);
                        }
                    }
                }
                if (var34 == 1) {
                    class96 var41 = Statics.field57.method1688(Statics.field1075, var37, var38);
                    if (var41 != null) {
                        int var42 = var41.field1594 >> 14 & 0x7FFF;
                        if (var32 == 4 || var32 == 5) {
                            var41.field1592 = new class50(var42, 4, var33, Statics.field1075, var37, var38, var35, false, var41.field1592);
                        } else if (var32 == 6) {
                            var41.field1592 = new class50(var42, 4, var33 + 4, Statics.field1075, var37, var38, var35, false, var41.field1592);
                        } else if (var32 == 7) {
                            var41.field1592 = new class50(var42, 4, (var33 + 2 & 0x3) + 4, Statics.field1075, var37, var38, var35, false, var41.field1592);
                        } else if (var32 == 8) {
                            var41.field1592 = new class50(var42, 4, var33 + 4, Statics.field1075, var37, var38, var35, false, var41.field1592);
                            var41.field1593 = new class50(var42, 4, (var33 + 2 & 0x3) + 4, Statics.field1075, var37, var38, var35, false, var41.field1593);
                        }
                    }
                }
                if (var34 == 2) {
                    class97 var43 = Statics.field57.method1645(Statics.field1075, var37, var38);
                    if (var32 == 11) {
                        var32 = 10;
                    }
                    if (var43 != null) {
                        var43.field1604 = new class50(var43.field1601 >> 14 & 0x7FFF, var32, var33, Statics.field1075, var37, var38, var35, false, var43.field1604);
                    }
                }
                if (var34 == 3) {
                    class79 var44 = Statics.field57.method1625(Statics.field1075, var37, var38);
                    if (var44 != null) {
                        var44.field1291 = new class50(var44.field1292 >> 14 & 0x7FFF, 22, var33, Statics.field1075, var37, var38, var35, false, var44.field1291);
                    }
                }
            }
        } else {
            if (field375 == 86) {
                int var45 = field410.method2708();
                int var46 = (var45 >> 4 & 0x7) + Statics.field235;
                int var47 = (var45 & 0x7) + Statics.field581;
                int var48 = field410.method2581();
                int var49 = field410.method2708();
                int var50 = var49 >> 4 & 0xF;
                int var51 = var49 & 0x7;
                int var52 = field410.method2708();
                if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                    int var53 = var50 + 1;
                    if (Statics.field2019.field655[0] >= var46 - var53 && Statics.field2019.field655[0] <= var46 + var53 && Statics.field2019.field610[0] >= var47 - var53 && Statics.field2019.field610[0] <= var47 + var53 && field558 != 0 && var51 > 0 && field517 < 50) {
                        field501[field517] = var48;
                        field293[field517] = var51;
                        field527[field517] = var52;
                        field529[field517] = null;
                        field528[field517] = (var46 << 16) + (var47 << 8) + var50;
                        field517++;
                    }
                }
            }
            if (field375 == 51) {
                int var54 = field410.method2575();
                int var55 = field410.method2616();
                int var56 = (var55 >> 4 & 0x7) + Statics.field235;
                int var57 = (var55 & 0x7) + Statics.field581;
                int var58 = field410.method2735();
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                    class44 var59 = new class44();
                    var59.field879 = var54;
                    var59.field878 = var58;
                    if (field414[Statics.field1075][var56][var57] == null) {
                        field414[Statics.field1075][var56][var57] = new class129();
                    }
                    field414[Statics.field1075][var56][var57].method2245(var59);
                    method782(var56, var57);
                }
            } else {
                if (field375 == 132) {
                    int var60 = field410.method2592();
                    int var61 = field410.method2616();
                    int var62 = (var61 >> 4 & 0x7) + Statics.field235;
                    int var63 = (var61 & 0x7) + Statics.field581;
                    byte var64 = field410.method2627();
                    int var65 = field410.method2575();
                    byte var66 = field410.method2779();
                    int var67 = field410.method2616();
                    int var68 = var67 >> 2;
                    int var69 = var67 & 0x3;
                    int var70 = field347[var68];
                    byte var71 = field410.method2779();
                    byte var72 = field410.method2754();
                    int var73 = field410.method2581();
                    int var74 = field410.method2581();
                    class24 var75;
                    if (field405 == var65) {
                        var75 = Statics.field2019;
                    } else {
                        var75 = field434[var65];
                    }
                    if (var75 != null) {
                        class198 var76 = class198.method1443(var74);
                        int var77;
                        int var78;
                        if (var69 == 1 || var69 == 3) {
                            var77 = var76.field2932;
                            var78 = var76.field2896;
                        } else {
                            var77 = var76.field2896;
                            var78 = var76.field2932;
                        }
                        int var79 = (var77 >> 1) + var62;
                        int var80 = (var77 + 1 >> 1) + var62;
                        int var81 = (var78 >> 1) + var63;
                        int var82 = (var78 + 1 >> 1) + var63;
                        int[][] var83 = class11.field104[Statics.field1075];
                        int var84 = var83[var79][var81] + var83[var80][var81] + var83[var79][var82] + var83[var80][var82] >> 2;
                        int var85 = (var62 << 7) + (var77 << 6);
                        int var86 = (var63 << 7) + (var78 << 6);
                        class83 var87 = var76.method3386(var68, var69, var83, var85, var84, var86);
                        if (var87 != null) {
                            method3251(Statics.field1075, var62, var63, var70, -1, 0, 0, var60 + 1, var73 + 1);
                            var75.field268 = field291 + var60;
                            var75.field250 = field291 + var73;
                            var75.field240 = var87;
                            var75.field251 = var62 * 128 + var77 * 64;
                            var75.field253 = var63 * 128 + var78 * 64;
                            var75.field252 = var84;
                            if (var64 > var66) {
                                byte var88 = var64;
                                var64 = var66;
                                var66 = var88;
                            }
                            if (var72 > var71) {
                                byte var89 = var72;
                                var72 = var71;
                                var71 = var89;
                            }
                            var75.field255 = var62 + var64;
                            var75.field257 = var62 + var66;
                            var75.field259 = var63 + var72;
                            var75.field258 = var63 + var71;
                        }
                    }
                }
                if (field375 == 46) {
                    int var90 = field410.method2708();
                    int var91 = var90 >> 2;
                    int var92 = var90 & 0x3;
                    int var93 = field347[var91];
                    int var94 = field410.method2615();
                    int var95 = (var94 >> 4 & 0x7) + Statics.field235;
                    int var96 = (var94 & 0x7) + Statics.field581;
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        method3251(Statics.field1075, var95, var96, var93, -1, var91, var92, 0, -1);
                    }
                } else if (field375 == 27) {
                    int var97 = field410.method2708();
                    int var98 = (var97 >> 4 & 0x7) + Statics.field235;
                    int var99 = (var97 & 0x7) + Statics.field581;
                    int var100 = var98 + field410.method2754();
                    int var101 = var99 + field410.method2754();
                    int var102 = field410.method2781();
                    int var103 = field410.method2581();
                    int var104 = field410.method2708() * 4;
                    int var105 = field410.method2708() * 4;
                    int var106 = field410.method2581();
                    int var107 = field410.method2581();
                    int var108 = field410.method2708();
                    int var109 = field410.method2708();
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                        int var110 = var98 * 128 + 64;
                        int var111 = var99 * 128 + 64;
                        int var112 = var100 * 128 + 64;
                        int var113 = var101 * 128 + 64;
                        class43 var114 = new class43(var103, Statics.field1075, var110, var111, method3046(var110, var111, Statics.field1075) - var104, field291 + var106, field291 + var107, var108, var109, var102, var105);
                        var114.method766(var112, var113, method3046(var112, var113, Statics.field1075) - var105, field291 + var106);
                        field416.method2245(var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gl.bd(IIIIIIIIIB)V")
    public static final void method3251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field546.method2242(); var10 != null; var10 = (class26) field546.method2244()) {
            if (var10.field585 == arg0 && var10.field569 == arg1 && var10.field570 == arg2 && var10.field568 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field585 = arg0;
            var9.field568 = arg3;
            var9.field569 = arg1;
            var9.field570 = arg2;
            method2030(var9);
            field546.method2245(var9);
        }
        var9.field573 = arg4;
        var9.field582 = arg5;
        var9.field586 = arg6;
        var9.field577 = arg7;
        var9.field578 = arg8;
    }

    @ObfuscatedName("j.bs(B)V")
    public static final void method179() {
        for (class26 var0 = (class26) field546.method2242(); var0 != null; var0 = (class26) field546.method2244()) {
            if (var0.field578 == -1) {
                var0.field577 = 0;
                method2030(var0);
            } else {
                var0.method2228();
            }
        }
    }

    @ObfuscatedName("dp.bx(Lb;I)V")
    public static final void method2030(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field568 == 0) {
            var1 = Statics.field57.method1626(arg0.field585, arg0.field569, arg0.field570);
        }
        if (arg0.field568 == 1) {
            var1 = Statics.field57.method1627(arg0.field585, arg0.field569, arg0.field570);
        }
        if (arg0.field568 == 2) {
            var1 = Statics.field57.method1628(arg0.field585, arg0.field569, arg0.field570);
        }
        if (arg0.field568 == 3) {
            var1 = Statics.field57.method1629(arg0.field585, arg0.field569, arg0.field570);
        }
        if (var1 != 0) {
            int var5 = Statics.field57.method1644(arg0.field585, arg0.field569, arg0.field570, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field571 = var2;
        arg0.field575 = var3;
        arg0.field572 = var4;
    }

    @ObfuscatedName("gl.bp(I)V")
    public static final void method3241() {
        for (class26 var0 = (class26) field546.method2242(); var0 != null; var0 = (class26) field546.method2244()) {
            if (var0.field578 > 0) {
                var0.field578--;
            }
            if (var0.field578 != 0) {
                if (var0.field577 > 0) {
                    var0.field577--;
                }
                if (var0.field577 == 0 && var0.field569 >= 1 && var0.field570 >= 1 && var0.field569 <= 102 && var0.field570 <= 102 && (var0.field573 < 0 || class11.method1978(var0.field573, var0.field582))) {
                    method779(var0.field585, var0.field568, var0.field569, var0.field570, var0.field573, var0.field586, var0.field582);
                    var0.field577 = -1;
                    if (var0.field573 == var0.field571 && var0.field571 == -1) {
                        var0.method2228();
                    } else if (var0.field573 == var0.field571 && var0.field586 == var0.field572 && var0.field582 == var0.field575) {
                        var0.method2228();
                    }
                }
            } else if (var0.field571 < 0 || class11.method1978(var0.field571, var0.field575)) {
                method779(var0.field585, var0.field568, var0.field569, var0.field570, var0.field571, var0.field572, var0.field575);
                var0.method2228();
            }
        }
    }

    @ObfuscatedName("ay.bk(IIIIIIIB)V")
    public static final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field287 && Statics.field1075 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field57.method1626(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field57.method1627(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field57.method1628(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field57.method1629(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field57.method1644(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field57.method1759(arg0, arg2, arg3);
                class198 var15 = class198.method1443(var12);
                if (var15.field2924 != 0) {
                    field412[arg0].method2090(arg2, arg3, var13, var14, var15.field2899);
                }
            }
            if (arg1 == 1) {
                Statics.field57.method1618(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field57.method1602(arg0, arg2, arg3);
                class198 var16 = class198.method1443(var12);
                if (var16.field2896 + arg2 > 103 || var16.field2896 + arg3 > 103 || var16.field2932 + arg2 > 103 || var16.field2932 + arg3 > 103) {
                    return;
                }
                if (var16.field2924 != 0) {
                    field412[arg0].method2091(arg2, arg3, var16.field2896, var16.field2932, var14, var16.field2899);
                }
            }
            if (arg1 == 3) {
                Statics.field57.method1622(arg0, arg2, arg3);
                class198 var17 = class198.method1443(var12);
                if (var17.field2924 == 1) {
                    field412[arg0].method2093(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field101[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class11.method2915(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field57, field412[arg0]);
    }

    @ObfuscatedName("ay.ba(IIB)V")
    public static final void method782(int arg0, int arg1) {
        class129 var2 = field414[Statics.field1075][arg0][arg1];
        if (var2 == null) {
            Statics.field57.method1648(Statics.field1075, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2242(); var6 != null; var6 = (class44) var2.method2244()) {
            class199 var7 = Statics.method1768(var6.field879);
            long var8 = (long) var7.field2956;
            if (var7.field2962 == 1) {
                var8 = (long) (var6.field878 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field57.method1648(Statics.field1075, arg0, arg1);
            return;
        }
        var2.method2238(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2242(); var12 != null; var12 = (class44) var2.method2244()) {
            if (var5.field879 != var12.field879) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field879 != var12.field879 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field57.method1607(Statics.field1075, arg0, arg1, method3046(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1075), var5, var13, var10, var11);
    }

    @ObfuscatedName("dw.bh(ZI)V")
    public static final void method2073(boolean arg0) {
        field331 = 0;
        field325 = 0;
        field410.method2834();
        int var1 = field410.method2835(8);
        if (var1 < field323) {
            for (int var2 = var1; var2 < field323; var2++) {
                field460[++field331 - 1] = field484[var2];
            }
        }
        if (var1 > field323) {
            throw new RuntimeException("");
        }
        field323 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field484[var3];
            class36 var5 = field322[var4];
            int var6 = field410.method2835(1);
            if (var6 == 0) {
                field484[++field323 - 1] = var4;
                var5.field631 = field291;
            } else {
                int var7 = field410.method2835(2);
                if (var7 == 0) {
                    field484[++field323 - 1] = var4;
                    var5.field631 = field291;
                    field371[++field325 - 1] = var4;
                } else if (var7 == 1) {
                    field484[++field323 - 1] = var4;
                    var5.field631 = field291;
                    int var8 = field410.method2835(3);
                    var5.method716(var8, (byte) 1);
                    int var9 = field410.method2835(1);
                    if (var9 == 1) {
                        field371[++field325 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field484[++field323 - 1] = var4;
                    var5.field631 = field291;
                    int var10 = field410.method2835(3);
                    var5.method716(var10, (byte) 2);
                    int var11 = field410.method2835(3);
                    var5.method716(var11, (byte) 2);
                    int var12 = field410.method2835(1);
                    if (var12 == 1) {
                        field371[++field325 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field460[++field331 - 1] = var4;
                }
            }
        }
        while (field410.method2836(field329) >= 27) {
            int var13 = field410.method2835(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field322[var13] == null) {
                field322[var13] = new class36();
                var17 = true;
            }
            class36 var18 = field322[var13];
            field484[++field323 - 1] = var13;
            var18.field631 = field291;
            int var19 = field410.method2835(1);
            var18.field761 = class200.method614(field410.method2835(14));
            int var20;
            if (arg0) {
                var20 = field410.method2835(8);
                if (var20 > 127) {
                    var20 -= 256;
                }
            } else {
                var20 = field410.method2835(5);
                if (var20 > 15) {
                    var20 -= 32;
                }
            }
            int var21;
            if (arg0) {
                var21 = field410.method2835(8);
                if (var21 > 127) {
                    var21 -= 256;
                }
            } else {
                var21 = field410.method2835(5);
                if (var21 > 15) {
                    var21 -= 32;
                }
            }
            int var22 = field310[field410.method2835(3)];
            if (var17) {
                var18.field651 = var18.field656 = var22;
            }
            int var23 = field410.method2835(1);
            if (var23 == 1) {
                field371[++field325 - 1] = var13;
            }
            var18.field604 = var18.field761.field3008;
            var18.field617 = var18.field761.field3016;
            if (var18.field617 == 0) {
                var18.field656 = 0;
            }
            var18.field608 = var18.field761.field3001;
            var18.field609 = var18.field761.field3020;
            var18.field640 = var18.field761.field2996;
            var18.field615 = var18.field761.field3002;
            var18.field605 = var18.field761.field2993;
            var18.field606 = var18.field761.field2988;
            var18.field627 = var18.field761.field2998;
            var18.method711(Statics.field2019.field655[0] + var20, Statics.field2019.field610[0] + var21, var19 == 1);
        }
        field410.method2843();
        method14();
        for (int var14 = 0; var14 < field331; var14++) {
            int var15 = field460[var14];
            if (field291 != field322[var15].field631) {
                field322[var15].field761 = null;
                field322[var15] = null;
            }
        }
        if (field329 != field410.field2073) {
            throw new RuntimeException(field410.field2073 + class38.field777 + field329);
        }
        for (int var16 = 0; var16 < field323; var16++) {
            if (field322[field484[var16]] == null) {
                throw new RuntimeException(var16 + class38.field777 + field323);
            }
        }
    }

    @ObfuscatedName("x.bj(B)V")
    public static final void method14() {
        for (int var0 = 0; var0 < field325; var0++) {
            int var1 = field371[var0];
            class36 var2 = field322[var1];
            int var3 = field410.method2708();
            if ((var3 & 0x10) != 0) {
                var2.field637 = field410.method2735();
                int var4 = field410.method2632();
                var2.field641 = var4 >> 16;
                var2.field649 = (var4 & 0xFFFF) + field291;
                var2.field635 = 0;
                var2.field639 = 0;
                if (var2.field649 > field291) {
                    var2.field635 = -1;
                }
                if (var2.field637 == 65535) {
                    var2.field637 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var5 = field410.method2735();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field410.method2615();
                if (var2.field632 == var5 && var5 != -1) {
                    int var7 = class202.method3327(var5).field3054;
                    if (var7 == 1) {
                        var2.field633 = 0;
                        var2.field634 = 0;
                        var2.field653 = var6;
                        var2.field636 = 0;
                    }
                    if (var7 == 2) {
                        var2.field636 = 0;
                    }
                } else if (var5 == -1 || var2.field632 == -1 || class202.method3327(var5).field3037 >= class202.method3327(var2.field632).field3037) {
                    var2.field632 = var5;
                    var2.field633 = 0;
                    var2.field634 = 0;
                    var2.field653 = var6;
                    var2.field636 = 0;
                    var2.field659 = var2.field654;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field761 = class200.method614(field410.method2592());
                var2.field604 = var2.field761.field3008;
                var2.field617 = var2.field761.field3016;
                var2.field608 = var2.field761.field3001;
                var2.field609 = var2.field761.field3020;
                var2.field640 = var2.field761.field2996;
                var2.field615 = var2.field761.field3002;
                var2.field605 = var2.field761.field2993;
                var2.field606 = var2.field761.field2988;
                var2.field627 = var2.field761.field2998;
            }
            if ((var3 & 0x1) != 0) {
                var2.field613 = field410.method2778();
                var2.field616 = 100;
            }
            if ((var3 & 0x8) != 0) {
                int var8 = field410.method2592();
                int var9 = field410.method2581();
                int var10 = var2.field612 - (var8 - Statics.field1465 - Statics.field1465) * 64;
                int var11 = var2.field601 - (var9 - Statics.field129 - Statics.field129) * 64;
                if (var10 != 0 || var11 != 0) {
                    var2.field628 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field626 = field410.method2575();
                if (var2.field626 == 65535) {
                    var2.field626 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var12 = field410.method2616();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = field410.method2776();
                        if (var17 == 32767) {
                            var17 = field410.method2776();
                            var15 = field410.method2776();
                            var14 = field410.method2776();
                            var16 = field410.method2776();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = field410.method2776();
                        }
                        int var18 = field410.method2776();
                        var2.method612(var17, var15, var14, var16, field291, var18);
                    }
                }
                int var19 = field410.method2708();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = field410.method2776();
                        int var22 = field410.method2776();
                        if (var22 == 32767) {
                            var2.method606(var21);
                        } else {
                            int var23 = field410.method2776();
                            int var24 = field410.method2617();
                            int var25 = var22 > 0 ? field410.method2616() : var24;
                            var2.method605(var21, field291, var22, var23, var24, var25);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.bq(Ln;IIBI)V")
    public static final void method171(class24 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field655[0];
        int var5 = arg0.field610[0];
        int var6 = arg0.method216();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class119.method762(var4, var5, arg0.method216(), method240(arg1, arg2), field412[arg0.field262], true, field562, field563);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method220(field562[var8], field563[var8], arg3);
            }
        }
    }

    @ObfuscatedName("o.bf(III)Ldq;")
    public static class120 method240(int arg0, int arg1) {
        field404.field1839 = arg0;
        field404.field1841 = arg1;
        field404.field1842 = 1;
        field404.field1838 = 1;
        return field404;
    }

    @ObfuscatedName("e.bc(III)V")
    public static final void method174(int arg0, int arg1) {
        if (field423 < 2 && field448 == 0 && !field436) {
            return;
        }
        String var2;
        if (field448 == 1 && field423 < 2) {
            var2 = class174.field2486 + class174.field2360 + field469 + " " + class38.field779;
        } else if (field436 && field423 < 2) {
            var2 = field439 + class174.field2360 + field283 + " " + class38.field779;
        } else {
            int var3 = field423 - 1;
            String var4;
            if (field429[var3].length() > 0) {
                var4 = field428[var3] + class174.field2360 + field429[var3];
            } else {
                var4 = field428[var3];
            }
            var2 = var4;
        }
        if (field423 > 2) {
            var2 = var2 + class38.method689(16777215) + " " + '/' + " " + (field423 - 2) + class174.field2433;
        }
        Statics.field1622.method3666(var2, arg0 + 4, arg1 + 15, 16777215, 0, field291 / 1000);
    }

    @ObfuscatedName("client.bg(IIIIS)V")
    public static final void method313(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field534; var4++) {
            if (field503[var4] + field489[var4] > arg0 && field489[var4] < arg0 + arg2 && field490[var4] + field451[var4] > arg1 && field490[var4] < arg1 + arg3) {
                field486[var4] = true;
            }
        }
    }

    @ObfuscatedName("em.cd(IIIII)V")
    public static final void method2570(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field534; var4++) {
            if (field503[var4] + field489[var4] > arg0 && field489[var4] < arg0 + arg2 && field490[var4] + field451[var4] > arg1 && field490[var4] < arg1 + arg3) {
                field487[var4] = true;
            }
        }
    }

    @ObfuscatedName("ch.ci(B)V")
    public static final void method1779() {
        method77();
        if (Statics.field716 != null || field454 != null) {
            return;
        }
        int var12;
        int var13;
        label203: {
            int var0 = class116.field1795;
            if (field422) {
                if (var0 != 1 && (Statics.field1298 || var0 != 4)) {
                    int var1 = class116.field1789;
                    int var2 = class116.field1790 * -1088631201;
                    if (var1 < Statics.field1831 - 10 || var1 > Statics.field221 + Statics.field1831 + 10 || var2 < Statics.field2079 - 10 || var2 > Statics.field2079 + Statics.field1584 + 10) {
                        field422 = false;
                        method313(Statics.field1831, Statics.field2079, Statics.field221, Statics.field1584);
                    }
                }
                if (var0 == 1 || !Statics.field1298 && var0 == 4) {
                    int var3 = Statics.field1831;
                    int var4 = Statics.field2079;
                    int var5 = Statics.field221;
                    int var6 = class116.field1792;
                    int var7 = class116.field1797;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field423; var9++) {
                        int var10 = (field423 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method199(var8);
                    }
                    field422 = false;
                    method313(Statics.field1831, Statics.field2079, Statics.field221, Statics.field1584);
                }
            } else {
                if ((var0 == 1 || !Statics.field1298 && var0 == 4) && field423 > 0) {
                    int var11 = field426[field423 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field318[field423 - 1];
                        var13 = field425[field423 - 1];
                        class170 var14 = class170.method786(var13);
                        int var15 = method1782(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label203;
                        }
                        int var17 = method1782(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (var18) {
                            break label203;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field1298 && var0 == 4) && (field304 == 1 && field423 > 2 || method79(field423 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field1298 && var0 == 4) && field423 > 0) {
                    method199(field423 - 1);
                }
                if (var0 == 2 && field423 > 0) {
                    method859(class116.field1792, class116.field1797);
                }
            }
            return;
        }
        if (Statics.field716 != null && !field401 && field304 != 1 && !method79(field423 - 1) && field423 > 0) {
            method2017(field398, field399);
        }
        field401 = false;
        field402 = 0;
        if (Statics.field716 != null) {
            method88(Statics.field716);
        }
        Statics.field716 = class170.method786(var13);
        field397 = var12;
        field398 = class116.field1792;
        field399 = class116.field1797;
        if (field423 > 0) {
            method1293(field423 - 1);
        }
        method88(Statics.field716);
    }

    @ObfuscatedName("ao.co(III)V")
    public static final void method859(int arg0, int arg1) {
        int var2 = Statics.field1622.method3665(class174.field2489);
        for (int var3 = 0; var3 < field423; var3++) {
            class209 var4 = Statics.field1622;
            String var5;
            if (field429[var3].length() > 0) {
                var5 = field428[var3] + class174.field2360 + field429[var3];
            } else {
                var5 = field428[var3];
            }
            int var6 = var4.method3665(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field423 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field2) {
            var8 = Statics.field2 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1100) {
            var9 = Statics.field1100 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field422 = true;
        Statics.field1831 = var8;
        Statics.field2079 = var9;
        Statics.field221 = var2;
        Statics.field1584 = field423 * 15 + 22;
    }

    @ObfuscatedName("c.cr(IS)Z")
    public static final boolean method79(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field426[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("s.cs(IB)V")
    public static final void method199(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field318[arg0];
        int var2 = field425[arg0];
        int var3 = field426[arg0];
        int var4 = field314[arg0];
        String var5 = field428[arg0];
        String var6 = field429[arg0];
        method692(var1, var2, var3, var4, var5, var6, class116.field1792, class116.field1797);
    }

    @ObfuscatedName("ai.cl(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method692(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 30 && field538 == null) {
            method2438(arg1, arg0);
            field538 = class170.method2816(arg1, arg0);
            method88(field538);
        }
        if (arg2 == 9) {
            class36 var8 = field322[arg3];
            if (var8 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(145);
                field327.method2613(class106.field1701[82] ? 1 : 0);
                field327.method2622(arg3);
            }
        }
        if (arg2 == 20) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(12);
            field327.method2731(Statics.field1465 + arg0);
            field327.method2620(Statics.field129 + arg1);
            field327.method2612(class106.field1701[82] ? 1 : 0);
            field327.method2755(arg3);
        }
        if (arg2 == 6) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(71);
            field327.method2613(class106.field1701[82] ? 1 : 0);
            field327.method2731(Statics.field1465 + arg0);
            field327.method2620(arg3 >> 14 & 0x7FFF);
            field327.method2755(Statics.field129 + arg1);
        }
        if (arg2 == 1003) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            class36 var9 = field322[arg3];
            if (var9 != null) {
                class200 var10 = var9.field761;
                if (var10.field3017 != null) {
                    var10 = var10.method3498();
                }
                if (var10 != null) {
                    field327.method2832(208);
                    field327.method2755(var10.field2991);
                }
            }
        }
        if (arg2 == 25) {
            class170 var11 = class170.method2816(arg1, arg0);
            if (var11 != null) {
                method188();
                int var14 = method1782(var11);
                int var15 = var14 >> 11 & 0x3F;
                method690(arg1, arg0, var15, var11.field2249);
                field448 = 0;
                field439 = method688(var11);
                if (field439 == null) {
                    field439 = "Null";
                }
                if (var11.field2185) {
                    field283 = var11.field2259 + class38.method689(16777215);
                } else {
                    field283 = class38.method689(65280) + var11.field2302 + class38.method689(16777215);
                }
            }
            return;
        }
        if (arg2 == 33) {
            field327.method2832(2);
            field327.method2631(arg1);
            field327.method2622(arg0);
            field327.method2731(arg3);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 13) {
            class36 var16 = field322[arg3];
            if (var16 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(192);
                field327.method2622(arg3);
                field327.method2573(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class36 var17 = field322[arg3];
            if (var17 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(159);
                field327.method2622(arg3);
                field327.method2613(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class24 var18 = field434[arg3];
            if (var18 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(240);
                field327.method2620(arg3);
                field327.method2614(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class24 var19 = field434[arg3];
            if (var19 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(204);
                field327.method2755(Statics.field53);
                field327.method2576(Statics.field2931);
                field327.method2731(Statics.field170);
                field327.method2614(class106.field1701[82] ? 1 : 0);
                field327.method2731(arg3);
            }
        }
        if (arg2 == 22) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(74);
            field327.method2620(Statics.field129 + arg1);
            field327.method2755(Statics.field1465 + arg0);
            field327.method2573(class106.field1701[82] ? 1 : 0);
            field327.method2620(arg3);
        }
        if (arg2 == 1002) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field327.method2832(205);
            field327.method2622(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 23) {
            Statics.field57.method1637(Statics.field1075, arg0, arg1);
        }
        if (arg2 == 31) {
            field327.method2832(225);
            field327.method2731(arg0);
            field327.method2731(Statics.field170);
            field327.method2630(arg1);
            field327.method2622(Statics.field53);
            field327.method2630(Statics.field2931);
            field327.method2755(arg3);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 18) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(20);
            field327.method2622(Statics.field129 + arg1);
            field327.method2755(Statics.field1465 + arg0);
            field327.method2755(arg3);
            field327.method2612(class106.field1701[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field327.method2832(194);
            field327.method2755(field437);
            field327.method2755(arg0);
            field327.method2631(arg1);
            field327.method2755(arg3);
            field327.method2661(Statics.field17);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 45) {
            class24 var20 = field434[arg3];
            if (var20 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(139);
                field327.method2613(class106.field1701[82] ? 1 : 0);
                field327.method2731(arg3);
            }
        }
        if (arg2 == 21) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(11);
            field327.method2755(Statics.field129 + arg1);
            field327.method2622(Statics.field1465 + arg0);
            field327.method2573(class106.field1701[82] ? 1 : 0);
            field327.method2622(arg3);
        }
        if (arg2 == 58) {
            class170 var21 = class170.method2816(arg1, arg0);
            if (var21 != null) {
                field327.method2832(199);
                field327.method2755(field437);
                field327.method2620(field438);
                field327.method2755(arg0);
                field327.method2661(arg1);
                field327.method2630(Statics.field17);
                field327.method2622(var21.field2249);
            }
        }
        if (arg2 == 29) {
            field327.method2832(253);
            field327.method2576(arg1);
            class170 var22 = class170.method786(arg1);
            if (var22.field2284 != null && var22.field2284[0][0] == 5) {
                int var23 = var22.field2284[0][1];
                if (class166.field2147[var23] != var22.field2208[0]) {
                    class166.field2147[var23] = var22.field2208[0];
                    method3325(var23);
                }
            }
        }
        if (arg2 == 12) {
            class36 var24 = field322[arg3];
            if (var24 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(180);
                field327.method2731(arg3);
                field327.method2612(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(250);
            field327.method2731(Statics.field129 + arg1);
            field327.method2573(class106.field1701[82] ? 1 : 0);
            field327.method2630(Statics.field2931);
            field327.method2622(arg3 >> 14 & 0x7FFF);
            field327.method2755(Statics.field53);
            field327.method2755(Statics.field170);
            field327.method2755(Statics.field1465 + arg0);
        }
        if (arg2 == 26) {
            field327.method2832(249);
            for (class18 var25 = (class18) field442.method2195(); var25 != null; var25 = (class18) field442.method2194()) {
                if (var25.field183 == 0 || var25.field183 == 3) {
                    method32(var25, true);
                }
            }
            if (field538 != null) {
                method88(field538);
                field538 = null;
            }
        }
        if (arg2 == 49) {
            class24 var26 = field434[arg3];
            if (var26 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(245);
                field327.method2620(arg3);
                field327.method2612(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field327.method2832(179);
            field327.method2755(arg3);
            field327.method2622(arg0);
            field327.method2630(arg1);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 46) {
            class24 var27 = field434[arg3];
            if (var27 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(144);
                field327.method2620(arg3);
                field327.method2612(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(3);
            field327.method2731(arg3 >> 14 & 0x7FFF);
            field327.method2755(Statics.field1465 + arg0);
            field327.method2731(field437);
            field327.method2576(Statics.field17);
            field327.method2755(Statics.field129 + arg1);
            field327.method2614(class106.field1701[82] ? 1 : 0);
        }
        if (arg2 == 47) {
            class24 var28 = field434[arg3];
            if (var28 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(175);
                field327.method2614(class106.field1701[82] ? 1 : 0);
                field327.method2755(arg3);
            }
        }
        if (arg2 == 1001) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(229);
            field327.method2612(class106.field1701[82] ? 1 : 0);
            field327.method2731(Statics.field1465 + arg0);
            field327.method2620(Statics.field129 + arg1);
            field327.method2622(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 28) {
            field327.method2832(253);
            field327.method2576(arg1);
            class170 var29 = class170.method786(arg1);
            if (var29.field2284 != null && var29.field2284[0][0] == 5) {
                int var30 = var29.field2284[0][1];
                class166.field2147[var30] = 1 - class166.field2147[var30];
                method3325(var30);
            }
        }
        if (arg2 == 34) {
            field327.method2832(244);
            field327.method2622(arg3);
            field327.method2661(arg1);
            field327.method2755(arg0);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var31 = class170.method2816(arg1, arg0);
            if (var31 != null) {
                method112(arg3, arg1, arg0, var31.field2249, arg5);
            }
        }
        if (arg2 == 1005) {
            class170 var32 = class170.method786(arg1);
            if (var32 == null || var32.field2305[arg0] < 100000) {
                field327.method2832(72);
                field327.method2622(arg3);
            } else {
                class48.method100(27, "", var32.field2305[arg0] + " x " + Statics.method1768(arg3).field2944);
            }
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 37) {
            field327.method2832(236);
            field327.method2620(arg3);
            field327.method2631(arg1);
            field327.method2755(arg0);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 3) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(203);
            field327.method2612(class106.field1701[82] ? 1 : 0);
            field327.method2731(Statics.field129 + arg1);
            field327.method2731(arg3 >> 14 & 0x7FFF);
            field327.method2731(Statics.field1465 + arg0);
        }
        if (arg2 == 39) {
            field327.method2832(146);
            field327.method2620(arg3);
            field327.method2576(arg1);
            field327.method2622(arg0);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 35) {
            field327.method2832(171);
            field327.method2620(arg0);
            field327.method2620(arg3);
            field327.method2661(arg1);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 17) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(166);
            field327.method2731(field437);
            field327.method2620(Statics.field129 + arg1);
            field327.method2612(class106.field1701[82] ? 1 : 0);
            field327.method2731(Statics.field1465 + arg0);
            field327.method2576(Statics.field17);
            field327.method2622(arg3);
        }
        if (arg2 == 51) {
            class24 var33 = field434[arg3];
            if (var33 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(141);
                field327.method2731(arg3);
                field327.method2612(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field327.method2832(152);
            field327.method2620(arg3);
            field327.method2622(arg0);
            field327.method2631(arg1);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 50) {
            class24 var34 = field434[arg3];
            if (var34 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(103);
                field327.method2614(class106.field1701[82] ? 1 : 0);
                field327.method2620(arg3);
            }
        }
        if (arg2 == 19) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(46);
            field327.method2755(arg3);
            field327.method2573(class106.field1701[82] ? 1 : 0);
            field327.method2731(Statics.field129 + arg1);
            field327.method2620(Statics.field1465 + arg0);
        }
        if (arg2 == 8) {
            class36 var35 = field322[arg3];
            if (var35 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(129);
                field327.method2620(arg3);
                field327.method2613(class106.field1701[82] ? 1 : 0);
                field327.method2576(Statics.field17);
                field327.method2755(field437);
            }
        }
        if (arg2 == 48) {
            class24 var36 = field434[arg3];
            if (var36 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(202);
                field327.method2614(class106.field1701[82] ? 1 : 0);
                field327.method2622(arg3);
            }
        }
        if (arg2 == 16) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(228);
            field327.method2614(class106.field1701[82] ? 1 : 0);
            field327.method2576(Statics.field2931);
            field327.method2731(Statics.field53);
            field327.method2755(Statics.field170);
            field327.method2731(Statics.field1465 + arg0);
            field327.method2731(Statics.field129 + arg1);
            field327.method2620(arg3);
        }
        if (arg2 == 43) {
            field327.method2832(119);
            field327.method2731(arg3);
            field327.method2630(arg1);
            field327.method2755(arg0);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 41) {
            field327.method2832(53);
            field327.method2622(arg3);
            field327.method2661(arg1);
            field327.method2622(arg0);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 15) {
            class24 var37 = field434[arg3];
            if (var37 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(84);
                field327.method2755(arg3);
                field327.method2614(class106.field1701[82] ? 1 : 0);
                field327.method2755(field437);
                field327.method2576(Statics.field17);
            }
        }
        if (arg2 == 1004) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field327.method2832(72);
            field327.method2622(arg3);
        }
        if (arg2 == 40) {
            field327.method2832(181);
            field327.method2755(arg0);
            field327.method2731(arg3);
            field327.method2576(arg1);
            field532 = 0;
            Statics.field2165 = class170.method786(arg1);
            field396 = arg0;
        }
        if (arg2 == 38) {
            method188();
            class170 var38 = class170.method786(arg1);
            field448 = 1;
            Statics.field170 = arg0;
            Statics.field2931 = arg1;
            Statics.field53 = arg3;
            method88(var38);
            field469 = class38.method689(16748608) + Statics.method1768(arg3).field2944 + class38.method689(16777215);
            if (field469 == null) {
                field469 = "null";
            }
            return;
        }
        if (arg2 == 4) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(241);
            field327.method2613(class106.field1701[82] ? 1 : 0);
            field327.method2622(arg3 >> 14 & 0x7FFF);
            field327.method2620(Statics.field1465 + arg0);
            field327.method2620(Statics.field129 + arg1);
        }
        if (arg2 == 5) {
            field391 = arg6;
            field392 = arg7;
            field394 = 2;
            field393 = 0;
            field515 = arg0;
            field548 = arg1;
            field327.method2832(26);
            field327.method2731(arg3 >> 14 & 0x7FFF);
            field327.method2613(class106.field1701[82] ? 1 : 0);
            field327.method2731(Statics.field129 + arg1);
            field327.method2731(Statics.field1465 + arg0);
        }
        if (arg2 == 10) {
            class36 var39 = field322[arg3];
            if (var39 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(189);
                field327.method2613(class106.field1701[82] ? 1 : 0);
                field327.method2622(arg3);
            }
        }
        if (arg2 == 24) {
            class170 var40 = class170.method786(arg1);
            boolean var41 = true;
            if (var40.field2190 > 0) {
                var41 = method27(var40);
            }
            if (var41) {
                field327.method2832(253);
                field327.method2576(arg1);
            }
        }
        if (arg2 == 7) {
            class36 var42 = field322[arg3];
            if (var42 != null) {
                field391 = arg6;
                field392 = arg7;
                field394 = 2;
                field393 = 0;
                field515 = arg0;
                field548 = arg1;
                field327.method2832(106);
                field327.method2755(Statics.field170);
                field327.method2755(Statics.field53);
                field327.method2630(Statics.field2931);
                field327.method2620(arg3);
                field327.method2612(class106.field1701[82] ? 1 : 0);
            }
        }
        if (field448 != 0) {
            field448 = 0;
            method88(class170.method786(Statics.field2931));
        }
        if (field436) {
            method188();
        }
        if (Statics.field2165 != null && field532 == 0) {
            method88(Statics.field2165);
        }
    }

    @ObfuscatedName("ay.cy(ILjava/lang/String;B)V")
    public static void method781(int arg0, String arg1) {
        int var2 = class46.field889;
        int[] var3 = class46.field893;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class24 var6 = field434[var3[var5]];
            if (var6 != null && Statics.field2019 != var6 && var6.field244 != null && var6.field244.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field327.method2832(240);
                    field327.method2620(var3[var5]);
                    field327.method2614(0);
                } else if (arg0 == 4) {
                    field327.method2832(175);
                    field327.method2614(0);
                    field327.method2755(var3[var5]);
                } else if (arg0 == 6) {
                    field327.method2832(245);
                    field327.method2620(var3[var5]);
                    field327.method2612(0);
                } else if (arg0 == 7) {
                    field327.method2832(103);
                    field327.method2614(0);
                    field327.method2620(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class48.method100(4, "", class174.field2485 + arg1);
        }
    }

    @ObfuscatedName("ax.cp(IIIII)V")
    public static void method690(int arg0, int arg1, int arg2, int arg3) {
        class170 var4 = class170.method2816(arg0, arg1);
        if (var4 != null && var4.field2277 != null) {
            class19 var5 = new class19();
            var5.field196 = var4;
            var5.field204 = var4.field2277;
            class33.method857(var5, 200000);
        }
        field438 = arg3;
        field436 = true;
        Statics.field17 = arg0;
        field437 = arg1;
        Statics.field3159 = arg2;
        method88(var4);
    }

    @ObfuscatedName("r.cj(B)V")
    public static void method188() {
        if (!field436) {
            return;
        }
        class170 var0 = class170.method2816(Statics.field17, field437);
        if (var0 != null && var0.field2298 != null) {
            class19 var1 = new class19();
            var1.field196 = var0;
            var1.field204 = var0.field2298;
            class33.method857(var1, 200000);
        }
        field436 = false;
        method88(var0);
    }

    @ObfuscatedName("eg.cb(IIB)V")
    public static void method2438(int arg0, int arg1) {
        field327.method2832(148);
        field327.method2576(arg0);
        field327.method2731(arg1);
    }

    @ObfuscatedName("g.cv(IIIILjava/lang/String;I)V")
    public static void method112(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class170 var5 = class170.method2816(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2286 != null) {
            class19 var6 = new class19();
            var6.field196 = var5;
            var6.field193 = arg0;
            var6.field198 = arg4;
            var6.field204 = var5.field2286;
            class33.method857(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2190 > 0) {
            var7 = method27(var5);
        }
        if (!var7 || !class171.method178(method1782(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field327.method2832(109);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
        if (arg0 == 2) {
            field327.method2832(37);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
        if (arg0 == 3) {
            field327.method2832(213);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
        if (arg0 == 4) {
            field327.method2832(77);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
        if (arg0 == 5) {
            field327.method2832(215);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
        if (arg0 == 6) {
            field327.method2832(176);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
        if (arg0 == 7) {
            field327.method2832(96);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
        if (arg0 == 8) {
            field327.method2832(142);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
        if (arg0 == 9) {
            field327.method2832(102);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
        if (arg0 == 10) {
            field327.method2832(68);
            field327.method2576(arg1);
            field327.method2731(arg2);
            field327.method2731(arg3);
        }
    }

    @ObfuscatedName("c.cm(I)V")
    public static final void method77() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field423 - 1; var1++) {
                if (field426[var1] < 1000 && field426[var1 + 1] > 1000) {
                    String var2 = field429[var1];
                    field429[var1] = field429[var1 + 1];
                    field429[var1 + 1] = var2;
                    String var3 = field428[var1];
                    field428[var1] = field428[var1 + 1];
                    field428[var1 + 1] = var3;
                    int var4 = field426[var1];
                    field426[var1] = field426[var1 + 1];
                    field426[var1 + 1] = var4;
                    int var5 = field318[var1];
                    field318[var1] = field318[var1 + 1];
                    field318[var1 + 1] = var5;
                    int var6 = field425[var1];
                    field425[var1] = field425[var1 + 1];
                    field425[var1 + 1] = var6;
                    int var7 = field314[var1];
                    field314[var1] = field314[var1 + 1];
                    field314[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("cd.cq(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1427(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field422 || field423 >= 500) {
            return;
        }
        field428[field423] = arg0;
        field429[field423] = arg1;
        field426[field423] = arg2;
        field314[field423] = arg3;
        field318[field423] = arg4;
        field425[field423] = arg5;
        field423++;
    }

    @ObfuscatedName("cx.cu(I)V")
    public static void method1808() {
        for (int var0 = 0; var0 < field423; var0++) {
            int var1 = field426[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field423 - 1) {
                    for (int var3 = var0; var3 < field423 - 1; var3++) {
                        field428[var3] = field428[var3 + 1];
                        field429[var3] = field429[var3 + 1];
                        field426[var3] = field426[var3 + 1];
                        field314[var3] = field314[var3 + 1];
                        field318[var3] = field318[var3 + 1];
                        field425[var3] = field425[var3 + 1];
                    }
                }
                field423--;
            }
        }
    }

    @ObfuscatedName("bj.ce(Lgq;IIII)V")
    public static final void method1314(class200 arg0, int arg1, int arg2, int arg3) {
        if (field423 >= 400) {
            return;
        }
        if (arg0.field3017 != null) {
            arg0 = arg0.method3498();
        }
        if (arg0 == null || !arg0.field3010 || arg0.field3022 && field449 != arg1) {
            return;
        }
        String var4 = arg0.field2992;
        if (arg0.field3009 != 0) {
            int var6 = arg0.field3009;
            int var7 = Statics.field2019.field246;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class38.method689(16711680);
            } else if (var8 < -6) {
                var9 = class38.method689(16723968);
            } else if (var8 < -3) {
                var9 = class38.method689(16740352);
            } else if (var8 < 0) {
                var9 = class38.method689(16756736);
            } else if (var8 > 9) {
                var9 = class38.method689(65280);
            } else if (var8 > 6) {
                var9 = class38.method689(4259584);
            } else if (var8 > 3) {
                var9 = class38.method689(8453888);
            } else if (var8 > 0) {
                var9 = class38.method689(12648192);
            } else {
                var9 = class38.method689(16776960);
            }
            var4 = var4 + var9 + " " + class38.field778 + class174.field2527 + arg0.field3009 + class38.field776;
        }
        if (field448 == 1) {
            method1427(class174.field2486, field469 + " " + class38.field779 + " " + class38.method689(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field436) {
            String[] var10 = arg0.field3007;
            if (field301) {
                var10 = method113(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class174.field2488)) {
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
                        method1427(var10[var11], class38.method689(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class174.field2488)) {
                        short var14 = 0;
                        if (field308 != class41.field799) {
                            if (field308 == class41.field803 || field308 == class41.field800 && arg0.field3009 > Statics.field2019.field246) {
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
                            method1427(var10[var13], class38.method689(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method1427(class174.field2487, class38.method689(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field3159 & 0x2) == 2) {
            method1427(field439, field283 + " " + class38.field779 + " " + class38.method689(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("e.cn([Lfo;IIIIIIIII)V")
    public static final void method172(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3751(arg2, arg3, arg4, arg5);
        class85.method1544();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2266 == arg1 || arg1 == -1412584499 && field454 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field489[field534] = var10.field2278 + arg6;
                    field490[field534] = var10.field2244 + arg7;
                    field503[field534] = var10.field2201;
                    field451[field534] = var10.field2202;
                    var11 = ++field534 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2317 = var11;
                var10.field2318 = field291;
                if (!var10.field2185 || !method1770(var10)) {
                    if (var10.field2190 > 0) {
                        int var12 = var10.field2190;
                        if (var12 == 324) {
                            if (field556 == -1) {
                                field556 = var10.field2221;
                                field557 = var10.field2241;
                            }
                            if (field561.field2154) {
                                var10.field2221 = field556;
                            } else {
                                var10.field2221 = field557;
                            }
                        } else if (var12 == 325) {
                            if (field556 == -1) {
                                field556 = var10.field2221;
                                field557 = var10.field2241;
                            }
                            if (field561.field2154) {
                                var10.field2221 = field557;
                            } else {
                                var10.field2221 = field556;
                            }
                        } else if (var12 == 327) {
                            var10.field2285 = 150;
                            var10.field2182 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2229 = 5;
                            var10.field2230 = 0;
                        } else if (var12 == 328) {
                            var10.field2285 = 150;
                            var10.field2182 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2229 = 5;
                            var10.field2230 = 1;
                        }
                    }
                    int var13 = var10.field2278 + arg6;
                    int var14 = var10.field2244 + arg7;
                    int var15 = var10.field2217;
                    if (field454 == var10) {
                        if (arg1 != -1412584499 && !var10.field2264) {
                            Statics.field123 = arg0;
                            Statics.field1722 = arg6;
                            Statics.field164 = arg7;
                            continue;
                        }
                        if (field465 && field459) {
                            int var16 = class116.field1789;
                            int var17 = class116.field1790 * -1088631201;
                            int var18 = var16 - field456;
                            int var19 = var17 - field551;
                            if (var18 < field491) {
                                var18 = field491;
                            }
                            if (var10.field2201 + var18 > field491 + field455.field2201) {
                                var18 = field491 + field455.field2201 - var10.field2201;
                            }
                            if (var19 < field285) {
                                var19 = field285;
                            }
                            if (var10.field2202 + var19 > field285 + field455.field2202) {
                                var19 = field285 + field455.field2202 - var10.field2202;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2264) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2300 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2300 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2201 + var13;
                        int var27 = var10.field2202 + var14;
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
                        int var30 = var10.field2201 + var13;
                        int var31 = var10.field2202 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2185 || var20 < var22 && var21 < var23) {
                        if (var10.field2190 != 0) {
                            if (var10.field2190 == 1336) {
                                if (field297) {
                                    var14 += 15;
                                    Statics.field236.method3660("Fps:" + field1764, var10.field2201 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field287) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field287) {
                                        var34 = 16711680;
                                    }
                                    Statics.field236.method3660("Mem:" + var33 + "k", var10.field2201 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2190 == 1337) {
                                field430 = var13;
                                field431 = var14;
                                method733(var13, var14, var10.field2201, var10.field2202);
                                field486[var10.field2317] = true;
                                class220.method3751(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2190 == 1338) {
                                method3337(var10, var13, var14, var11);
                                class220.method3751(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2190 == 1339) {
                                class165 var35 = var10.method2976(false);
                                if (var35 != null) {
                                    if (field544 < 3) {
                                        Statics.field74.method3895(var13, var14, var35.field2144, var35.field2140, 25, 25, field368, 256, var35.field2139, var35.field2142);
                                    } else {
                                        class220.method3770(var13, var14, 0, var35.field2139, var35.field2142);
                                    }
                                }
                                class220.method3751(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2300 == 0) {
                            if (!var10.field2185 && method1770(var10) && Statics.field2759 != var10) {
                                continue;
                            }
                            if (!var10.field2185) {
                                if (var10.field2239 > var10.field2210 - var10.field2202) {
                                    var10.field2239 = var10.field2210 - var10.field2202;
                                }
                                if (var10.field2239 < 0) {
                                    var10.field2239 = 0;
                                }
                            }
                            method172(arg0, var10.field2186, var20, var21, var22, var23, var13 - var10.field2207, var14 - var10.field2239, var11);
                            if (var10.field2310 != null) {
                                method172(var10.field2310, var10.field2186, var20, var21, var22, var23, var13 - var10.field2207, var14 - var10.field2239, var11);
                            }
                            class18 var36 = (class18) field442.method2190((long) var10.field2186);
                            if (var36 != null) {
                                Statics.method734(var36.field186, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class220.method3751(arg2, arg3, arg4, arg5);
                            class85.method1544();
                        }
                        if (field495 || field488[var11] || field493 > 1) {
                            if (var10.field2300 == 0 && !var10.field2185 && var10.field2210 > var10.field2202) {
                                int var37 = var10.field2201 + var13;
                                int var38 = var10.field2239;
                                int var39 = var10.field2202;
                                int var40 = var10.field2210;
                                Statics.field1201[0].method3839(var37, var14);
                                Statics.field1201[1].method3839(var37, var14 + var39 - 16);
                                class220.method3779(var37, var14 + 16, 16, var39 - 32, field361);
                                int var41 = (var39 - 32) * var39 / var40;
                                if (var41 < 8) {
                                    var41 = 8;
                                }
                                int var42 = (var39 - 32 - var41) * var38 / (var40 - var39);
                                class220.method3779(var37, var14 + 16 + var42, 16, var41, field479);
                                class220.method3767(var37, var14 + 16 + var42, var41, field364);
                                class220.method3767(var37 + 1, var14 + 16 + var42, var41, field364);
                                class220.method3765(var37, var14 + 16 + var42, 16, field364);
                                class220.method3765(var37, var14 + 17 + var42, 16, field364);
                                class220.method3767(var37 + 15, var14 + 16 + var42, var41, field452);
                                class220.method3767(var37 + 14, var14 + 17 + var42, var41 - 1, field452);
                                class220.method3765(var37, var14 + 15 + var42 + var41, 16, field452);
                                class220.method3765(var37 + 1, var14 + 14 + var42 + var41, 15, field452);
                            }
                            if (var10.field2300 != 1) {
                                if (var10.field2300 == 2) {
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < var10.field2280; var44++) {
                                        for (int var45 = 0; var45 < var10.field2238; var45++) {
                                            int var46 = (var10.field2252 + 32) * var45 + var13;
                                            int var47 = (var10.field2253 + 32) * var44 + var14;
                                            if (var43 < 20) {
                                                var46 += var10.field2254[var43];
                                                var47 += var10.field2255[var43];
                                            }
                                            if (var10.field2295[var43] > 0) {
                                                boolean var48 = false;
                                                boolean var49 = false;
                                                int var50 = var10.field2295[var43] - 1;
                                                if (var46 + 32 > arg2 && var46 < arg4 && var47 + 32 > arg3 && var47 < arg5 || Statics.field716 == var10 && field397 == var43) {
                                                    class225 var51;
                                                    if (field448 == 1 && Statics.field170 == var43 && Statics.field2931 == var10.field2186) {
                                                        var51 = class199.method763(var50, var10.field2305[var43], 2, 0, 2, false);
                                                    } else {
                                                        var51 = class199.method763(var50, var10.field2305[var43], 1, 3153952, 2, false);
                                                    }
                                                    if (var51 == null) {
                                                        method88(var10);
                                                    } else if (Statics.field716 == var10 && field397 == var43) {
                                                        int var52 = class116.field1789 - field398;
                                                        int var53 = class116.field1790 * -1088631201 - field399;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (field402 < 5) {
                                                            var52 = 0;
                                                            var53 = 0;
                                                        }
                                                        var51.method3910(var46 + var52, var47 + var53, 128);
                                                        if (arg1 != -1) {
                                                            class170 var54 = arg0[arg1 & 0xFFFF];
                                                            if (var47 + var53 < class220.field3173 && var54.field2239 > 0) {
                                                                int var55 = field463 * (class220.field3173 - var47 - var53) / 3;
                                                                if (var55 > field463 * 10) {
                                                                    var55 = field463 * 10;
                                                                }
                                                                if (var55 > var54.field2239) {
                                                                    var55 = var54.field2239;
                                                                }
                                                                var54.field2239 -= var55;
                                                                field399 += var55;
                                                                method88(var54);
                                                            }
                                                            if (var47 + var53 + 32 > class220.field3174 && var54.field2239 < var54.field2210 - var54.field2202) {
                                                                int var56 = field463 * (var47 + var53 + 32 - class220.field3174) / 3;
                                                                if (var56 > field463 * 10) {
                                                                    var56 = field463 * 10;
                                                                }
                                                                if (var56 > var54.field2210 - var54.field2202 - var54.field2239) {
                                                                    var56 = var54.field2210 - var54.field2202 - var54.field2239;
                                                                }
                                                                var54.field2239 += var56;
                                                                field399 -= var56;
                                                                method88(var54);
                                                            }
                                                        }
                                                    } else if (Statics.field2165 == var10 && field396 == var43) {
                                                        var51.method3910(var46, var47, 128);
                                                    } else {
                                                        var51.method3884(var46, var47);
                                                    }
                                                }
                                            } else if (var10.field2191 != null && var43 < 20) {
                                                class225 var57 = var10.method2974(var43);
                                                if (var57 != null) {
                                                    var57.method3884(var46, var47);
                                                } else if (class170.field2184) {
                                                    method88(var10);
                                                }
                                            }
                                            var43++;
                                        }
                                    }
                                } else if (var10.field2300 == 3) {
                                    int var58;
                                    if (method1778(var10)) {
                                        var58 = var10.field2212;
                                        if (Statics.field2759 == var10 && var10.field2214 != 0) {
                                            var58 = var10.field2214;
                                        }
                                    } else {
                                        var58 = var10.field2211;
                                        if (Statics.field2759 == var10 && var10.field2213 != 0) {
                                            var58 = var10.field2213;
                                        }
                                    }
                                    if (var10.field2236) {
                                        switch(var10.field2220.field3187) {
                                            case 1:
                                                class220.method3830(var13, var14, var10.field2201, var10.field2202, var10.field2211, var10.field2212, 256 - (var10.field2217 & 0xFF), 256 - (var10.field2281 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3801(var13, var14, var10.field2201, var10.field2202, var10.field2211, var10.field2212, 256 - (var10.field2217 & 0xFF), 256 - (var10.field2281 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3828(var13, var14, var10.field2201, var10.field2202, var10.field2211, var10.field2212, 256 - (var10.field2217 & 0xFF), 256 - (var10.field2281 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3761(var13, var14, var10.field2201, var10.field2202, var10.field2211, var10.field2212, 256 - (var10.field2217 & 0xFF), 256 - (var10.field2281 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class220.method3779(var13, var14, var10.field2201, var10.field2202, var58);
                                                } else {
                                                    class220.method3762(var13, var14, var10.field2201, var10.field2202, var58, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class220.method3763(var13, var14, var10.field2201, var10.field2202, var58);
                                    } else {
                                        class220.method3764(var13, var14, var10.field2201, var10.field2202, var58, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2300 == 4) {
                                    class209 var59 = var10.method2981();
                                    if (var59 != null) {
                                        String var60 = var10.field2188;
                                        int var61;
                                        if (method1778(var10)) {
                                            var61 = var10.field2212;
                                            if (Statics.field2759 == var10 && var10.field2214 != 0) {
                                                var61 = var10.field2214;
                                            }
                                            if (var10.field2247.length() > 0) {
                                                var60 = var10.field2247;
                                            }
                                        } else {
                                            var61 = var10.field2211;
                                            if (Statics.field2759 == var10 && var10.field2213 != 0) {
                                                var61 = var10.field2213;
                                            }
                                        }
                                        if (var10.field2185 && var10.field2249 != -1) {
                                            class199 var62 = Statics.method1768(var10.field2249);
                                            var60 = var62.field2944;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field2962 == 1 || var10.field2307 != 1) && var10.field2307 != -1) {
                                                var60 = class38.method689(16748608) + var60 + class38.field781 + " " + 'x' + method3732(var10.field2307);
                                            }
                                        }
                                        if (field538 == var10) {
                                            class174 var10000 = (class174) null;
                                            var60 = class174.field2494;
                                            var61 = var10.field2211;
                                        }
                                        if (!var10.field2185) {
                                            var60 = method3044(var60, var10);
                                        }
                                        var59.method3662(var60, var13, var14, var10.field2201, var10.field2202, var61, var10.field2219 ? 0 : -1, var10.field2177, var10.field2215, var10.field2248);
                                    } else if (class170.field2184) {
                                        method88(var10);
                                    }
                                } else if (var10.field2300 == 5) {
                                    if (var10.field2185) {
                                        class225 var64;
                                        if (var10.field2249 == -1) {
                                            var64 = var10.method2972(false);
                                        } else {
                                            var64 = class199.method763(var10.field2249, var10.field2307, var10.field2225, var10.field2226, var10.field2245, false);
                                        }
                                        if (var64 != null) {
                                            int var65 = var64.field3206;
                                            int var66 = var64.field3208;
                                            if (var10.field2224) {
                                                class220.method3786(var13, var14, var10.field2201 + var13, var10.field2202 + var14);
                                                int var67 = (var10.field2201 + (var65 - 1)) / var65;
                                                int var68 = (var10.field2202 + (var66 - 1)) / var66;
                                                for (int var69 = 0; var69 < var67; var69++) {
                                                    for (int var70 = 0; var70 < var68; var70++) {
                                                        if (var10.field2223 != 0) {
                                                            var64.method3897(var65 / 2 + var65 * var69 + var13, var66 / 2 + var66 * var70 + var14, var10.field2223, 4096);
                                                        } else if (var15 == 0) {
                                                            var64.method3884(var65 * var69 + var13, var66 * var70 + var14);
                                                        } else {
                                                            var64.method3910(var65 * var69 + var13, var66 * var70 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3751(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var71 = var10.field2201 * 4096 / var65;
                                                if (var10.field2223 != 0) {
                                                    var64.method3897(var10.field2201 / 2 + var13, var10.field2202 / 2 + var14, var10.field2223, var71);
                                                } else if (var15 != 0) {
                                                    var64.method3892(var13, var14, var10.field2201, var10.field2202, 256 - (var15 & 0xFF));
                                                } else if (var10.field2201 == var65 && var10.field2202 == var66) {
                                                    var64.method3884(var13, var14);
                                                } else {
                                                    var64.method3961(var13, var14, var10.field2201, var10.field2202);
                                                }
                                            }
                                        } else if (class170.field2184) {
                                            method88(var10);
                                        }
                                    } else {
                                        class225 var63 = var10.method2972(method1778(var10));
                                        if (var63 != null) {
                                            var63.method3884(var13, var14);
                                        } else if (class170.field2184) {
                                            method88(var10);
                                        }
                                    }
                                } else if (var10.field2300 == 6) {
                                    boolean var72 = method1778(var10);
                                    int var73;
                                    if (var72) {
                                        var73 = var10.field2234;
                                    } else {
                                        var73 = var10.field2251;
                                    }
                                    class83 var74 = null;
                                    int var75 = 0;
                                    if (var10.field2249 != -1) {
                                        class199 var76 = Statics.method1768(var10.field2249);
                                        if (var76 != null) {
                                            class199 var77 = var76.method3434(var10.field2307);
                                            var74 = var77.method3433(1);
                                            if (var74 == null) {
                                                method88(var10);
                                            } else {
                                                var74.method1462();
                                                var75 = var74.field1541 / 2;
                                            }
                                        }
                                    } else if (var10.field2229 == 5) {
                                        if (var10.field2230 == 0) {
                                            var74 = field561.method2955((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var74 = Statics.field2019.method217();
                                        }
                                    } else if (var73 == -1) {
                                        var74 = var10.method2969((class202) null, -1, var72, Statics.field2019.field256);
                                        if (var74 == null && class170.field2184) {
                                            method88(var10);
                                        }
                                    } else {
                                        class202 var78 = class202.method3327(var73);
                                        var74 = var10.method2969(var78, var10.field2216, var72, Statics.field2019.field256);
                                        if (var74 == null && class170.field2184) {
                                            method88(var10);
                                        }
                                    }
                                    class85.method1534(var10.field2201 / 2 + var13, var10.field2202 / 2 + var14);
                                    int var79 = var10.field2240 * class85.field1439[var10.field2285] >> 16;
                                    int var80 = var10.field2240 * class85.field1429[var10.field2285] >> 16;
                                    if (var74 != null) {
                                        if (var10.field2185) {
                                            var74.method1462();
                                            if (var10.field2243) {
                                                var74.method1522(0, var10.field2182, var10.field2311, var10.field2285, var10.field2235, var10.field2179 + var75 + var79, var10.field2179 + var80, var10.field2240);
                                            } else {
                                                var74.method1461(0, var10.field2182, var10.field2311, var10.field2285, var10.field2235, var10.field2179 + var75 + var79, var10.field2179 + var80);
                                            }
                                        } else {
                                            var74.method1461(0, var10.field2182, 0, var10.field2285, 0, var79, var80);
                                        }
                                    }
                                    class85.method1574();
                                } else {
                                    if (var10.field2300 == 7) {
                                        class209 var81 = var10.method2981();
                                        if (var81 == null) {
                                            if (class170.field2184) {
                                                method88(var10);
                                            }
                                            continue;
                                        }
                                        int var82 = 0;
                                        for (int var83 = 0; var83 < var10.field2280; var83++) {
                                            for (int var84 = 0; var84 < var10.field2238; var84++) {
                                                if (var10.field2295[var82] > 0) {
                                                    class199 var85 = Statics.method1768(var10.field2295[var82] - 1);
                                                    String var86;
                                                    if (var85.field2962 != 1 && var10.field2305[var82] == 1) {
                                                        var86 = class38.method689(16748608) + var85.field2944 + class38.field781;
                                                    } else {
                                                        var86 = class38.method689(16748608) + var85.field2944 + class38.field781 + " " + 'x' + method3732(var10.field2305[var82]);
                                                    }
                                                    int var87 = (var10.field2252 + 115) * var84 + var13;
                                                    int var88 = (var10.field2253 + 12) * var83 + var14;
                                                    if (var10.field2177 == 0) {
                                                        var81.method3658(var86, var87, var88, var10.field2211, var10.field2219 ? 0 : -1);
                                                    } else if (var10.field2177 == 1) {
                                                        var81.method3661(var86, var10.field2201 / 2 + var87, var88, var10.field2211, var10.field2219 ? 0 : -1);
                                                    } else {
                                                        var81.method3660(var86, var10.field2201 + var87 - 1, var88, var10.field2211, var10.field2219 ? 0 : -1);
                                                    }
                                                }
                                                var82++;
                                            }
                                        }
                                    }
                                    if (var10.field2300 == 8 && Statics.field242 == var10 && field432 == field362) {
                                        int var89 = 0;
                                        int var90 = 0;
                                        class209 var91 = Statics.field236;
                                        String var92 = var10.field2188;
                                        String var93 = method3044(var92, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class38.field780);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            int var96 = var91.method3665(var95);
                                            if (var96 > var89) {
                                                var89 = var96;
                                            }
                                            var90 += var91.field3088 + 1;
                                        }
                                        var89 += 6;
                                        var90 += 7;
                                        int var97 = var10.field2201 + var13 - 5 - var89;
                                        int var98 = var10.field2202 + var14 + 5;
                                        if (var97 < var13 + 5) {
                                            var97 = var13 + 5;
                                        }
                                        if (var89 + var97 > arg4) {
                                            var97 = arg4 - var89;
                                        }
                                        if (var90 + var98 > arg5) {
                                            var98 = arg5 - var90;
                                        }
                                        class220.method3779(var97, var98, var89, var90, 16777120);
                                        class220.method3763(var97, var98, var89, var90, 0);
                                        String var99 = var10.field2188;
                                        int var100 = var91.field3088 + var98 + 2;
                                        String var101 = method3044(var99, var10);
                                        while (var101.length() > 0) {
                                            int var102 = var101.indexOf(class38.field780);
                                            String var103;
                                            if (var102 == -1) {
                                                var103 = var101;
                                                var101 = "";
                                            } else {
                                                var103 = var101.substring(0, var102);
                                                var101 = var101.substring(var102 + 4);
                                            }
                                            var91.method3658(var103, var97 + 3, var100, 0, -1);
                                            var100 += var91.field3088 + 1;
                                        }
                                    }
                                    if (var10.field2300 == 9) {
                                        if (var10.field2237 == 1) {
                                            int var104;
                                            int var105;
                                            int var106;
                                            int var107;
                                            if (var10.field2227) {
                                                var104 = var13;
                                                var105 = var10.field2202 + var14;
                                                var106 = var10.field2201 + var13;
                                                var107 = var14;
                                            } else {
                                                var104 = var13;
                                                var105 = var14;
                                                var106 = var10.field2201 + var13;
                                                var107 = var10.field2202 + var14;
                                            }
                                            class220.method3769(var104, var105, var106, var107, var10.field2211);
                                        } else {
                                            int var108 = var10.field2201 >= 0 ? var10.field2201 : -var10.field2201;
                                            int var109 = var10.field2202 >= 0 ? var10.field2202 : -var10.field2202;
                                            int var110 = var108;
                                            if (var108 < var109) {
                                                var110 = var109;
                                            }
                                            if (var110 != 0) {
                                                int var111 = (var10.field2201 << 16) / var110;
                                                int var112 = (var10.field2202 << 16) / var110;
                                                if (var112 <= var111) {
                                                    var111 = -var111;
                                                } else {
                                                    var112 = -var112;
                                                }
                                                int var113 = var10.field2237 * var112 >> 17;
                                                int var114 = var10.field2237 * var112 + 1 >> 17;
                                                int var115 = var10.field2237 * var111 >> 17;
                                                int var116 = var10.field2237 * var111 + 1 >> 17;
                                                int var117 = var13 + var113;
                                                int var118 = var13 - var114;
                                                int var119 = var10.field2201 + var13 - var114;
                                                int var120 = var10.field2201 + var13 + var113;
                                                int var121 = var14 + var115;
                                                int var122 = var14 - var116;
                                                int var123 = var10.field2202 + var14 - var116;
                                                int var124 = var10.field2202 + var14 + var115;
                                                class85.method1539(var117, var118, var119);
                                                class85.method1542(var121, var122, var123, var117, var118, var119, var10.field2211);
                                                class85.method1539(var117, var119, var120);
                                                class85.method1542(var121, var123, var124, var117, var119, var120, var10.field2211);
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

    @ObfuscatedName("fc.cz(Ljava/lang/String;Lfo;I)Ljava/lang/String;")
    public static String method3044(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2558(method211(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1176 != null) {
                    int var6 = Statics.field1176.field1651;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field1176.field1653 != null) {
                        var5 = (String) Statics.field1176.field1653;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("hn.cw(II)Ljava/lang/String;")
    public static final String method3732(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field777 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method689(65408) + var1.substring(0, var1.length() - 8) + class174.field2497 + " " + class38.field778 + var1 + class38.field776 + class38.field781;
        } else if (var1.length() > 6) {
            return " " + class38.method689(16777215) + var1.substring(0, var1.length() - 4) + class174.field2499 + " " + class38.field778 + var1 + class38.field776 + class38.field781;
        } else {
            return " " + class38.method689(16776960) + var1 + class38.field781;
        }
    }

    @ObfuscatedName("q.ca(Lfo;I)V")
    public static void method167(class170 arg0) {
        class170 var1 = arg0.field2266 == -1 ? null : class170.method786(arg0.field2266);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2;
            var3 = Statics.field1100;
        } else {
            var2 = var1.field2201;
            var3 = var1.field2202;
        }
        method18(arg0, var2, var3, false);
        method15(arg0, var2, var3);
    }

    @ObfuscatedName("d.ck([Lfo;Lfo;ZI)V")
    public static void method98(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2209 == 0 ? arg1.field2201 : arg1.field2209;
        int var4 = arg1.field2210 == 0 ? arg1.field2202 : arg1.field2210;
        method3238(arg0, arg1.field2186, var3, var4, arg2);
        if (arg1.field2310 != null) {
            method3238(arg1.field2310, arg1.field2186, var3, var4, arg2);
        }
        class18 var5 = (class18) field442.method2190((long) arg1.field2186);
        if (var5 != null) {
            method65(var5.field186, var3, var4, arg2);
        }
        if (arg1.field2190 == 1337) {
        }
    }

    @ObfuscatedName("f.cf(IIIZI)V")
    public static final void method65(int arg0, int arg1, int arg2, boolean arg3) {
        if (class170.method1780(arg0)) {
            method3238(Statics.field2279[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gu.cx([Lfo;IIIZI)V")
    public static void method3238(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2266 == arg1) {
                method18(var6, arg2, arg3, arg4);
                method15(var6, arg2, arg3);
                if (var6.field2207 > var6.field2209 - var6.field2201) {
                    var6.field2207 = var6.field2209 - var6.field2201;
                }
                if (var6.field2207 < 0) {
                    var6.field2207 = 0;
                }
                if (var6.field2239 > var6.field2210 - var6.field2202) {
                    var6.field2239 = var6.field2210 - var6.field2202;
                }
                if (var6.field2239 < 0) {
                    var6.field2239 = 0;
                }
                if (var6.field2300 == 0) {
                    method98(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("i.ct(Lfo;IIZI)V")
    public static void method18(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2201;
        int var5 = arg0.field2202;
        if (arg0.field2198 == 0) {
            arg0.field2201 = arg0.field2238;
        } else if (arg0.field2198 == 1) {
            arg0.field2201 = arg1 - arg0.field2238;
        } else if (arg0.field2198 == 2) {
            arg0.field2201 = arg0.field2238 * arg1 >> 14;
        }
        if (arg0.field2194 == 0) {
            arg0.field2202 = arg0.field2280;
        } else if (arg0.field2194 == 1) {
            arg0.field2202 = arg2 - arg0.field2280;
        } else if (arg0.field2194 == 2) {
            arg0.field2202 = arg0.field2280 * arg2 >> 14;
        }
        if (arg0.field2198 == 4) {
            arg0.field2201 = arg0.field2203 * arg0.field2202 / arg0.field2222;
        }
        if (arg0.field2194 == 4) {
            arg0.field2202 = arg0.field2222 * arg0.field2201 / arg0.field2203;
        }
        if (field415 && arg0.field2300 == 0) {
            if (arg0.field2202 < 5 && arg0.field2201 < 5) {
                arg0.field2202 = 5;
                arg0.field2201 = 5;
            } else {
                if (arg0.field2202 <= 0) {
                    arg0.field2202 = 5;
                }
                if (arg0.field2201 <= 0) {
                    arg0.field2201 = 5;
                }
            }
        }
        if (arg0.field2190 == 1337) {
            field453 = arg0;
        }
        if (arg3 && arg0.field2228 != null && (arg0.field2201 != var4 || arg0.field2202 != var5)) {
            class19 var6 = new class19();
            var6.field196 = arg0;
            var6.field204 = arg0.field2228;
            field480.method2245(var6);
        }
    }

    @ObfuscatedName("x.cc(Lfo;III)V")
    public static void method15(class170 arg0, int arg1, int arg2) {
        if (arg0.field2231 == 0) {
            arg0.field2278 = arg0.field2195;
        } else if (arg0.field2231 == 1) {
            arg0.field2278 = (arg1 - arg0.field2201) / 2 + arg0.field2195;
        } else if (arg0.field2231 == 2) {
            arg0.field2278 = arg1 - arg0.field2201 - arg0.field2195;
        } else if (arg0.field2231 == 3) {
            arg0.field2278 = arg0.field2195 * arg1 >> 14;
        } else if (arg0.field2231 == 4) {
            arg0.field2278 = (arg0.field2195 * arg1 >> 14) + (arg1 - arg0.field2201) / 2;
        } else {
            arg0.field2278 = arg1 - arg0.field2201 - (arg0.field2195 * arg1 >> 14);
        }
        if (arg0.field2192 == 0) {
            arg0.field2244 = arg0.field2196;
        } else if (arg0.field2192 == 1) {
            arg0.field2244 = (arg2 - arg0.field2202) / 2 + arg0.field2196;
        } else if (arg0.field2192 == 2) {
            arg0.field2244 = arg2 - arg0.field2202 - arg0.field2196;
        } else if (arg0.field2192 == 3) {
            arg0.field2244 = arg0.field2196 * arg2 >> 14;
        } else if (arg0.field2192 == 4) {
            arg0.field2244 = (arg0.field2196 * arg2 >> 14) + (arg2 - arg0.field2202) / 2;
        } else {
            arg0.field2244 = arg2 - arg0.field2202 - (arg0.field2196 * arg2 >> 14);
        }
        if (!field415 || arg0.field2300 != 0) {
            return;
        }
        if (arg0.field2278 < 0) {
            arg0.field2278 = 0;
        } else if (arg0.field2278 + arg0.field2201 > arg1) {
            arg0.field2278 = arg1 - arg0.field2201;
        }
        if (arg0.field2244 < 0) {
            arg0.field2244 = 0;
        } else if (arg0.field2244 + arg0.field2202 > arg2) {
            arg0.field2244 = arg2 - arg0.field2202;
        }
    }

    @ObfuscatedName("bm.dd(Lfo;IIIIIIB)V")
    public static final void method1041(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field365) {
            field366 = 32;
        } else {
            field366 = 0;
        }
        field365 = false;
        if (class116.field1788 == 1 || !Statics.field1298 && class116.field1788 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2239 -= 4;
                method88(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2239 += 4;
                method88(arg0);
            } else if (arg5 >= arg1 - field366 && arg5 < field366 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2239 = (arg4 - arg3) * var8 / var9;
                method88(arg0);
                field365 = true;
            }
        }
        if (field525 == 0) {
            return;
        }
        int var10 = arg0.field2201;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2239 += field525 * 45;
            method88(arg0);
        }
    }

    @ObfuscatedName("ev.dk(II)Ljava/lang/String;")
    public static final String method2558(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ch.di(Lfo;B)Z")
    public static final boolean method1778(class170 arg0) {
        if (arg0.field2299 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2299.length; var1++) {
            int var2 = method211(arg0, var1);
            int var3 = arg0.field2208[var1];
            if (arg0.field2299[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2299[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2299[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("w.dh(Lfo;IB)I")
    public static final int method211(class170 arg0, int arg1) {
        if (arg0.field2284 == null || arg1 >= arg0.field2284.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2284[arg1];
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
                    var7 = field376[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field419[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field420[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = class170.method786(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method1768(var12).field2957 || field286)) {
                        for (int var13 = 0; var13 < var11.field2295.length; var13++) {
                            if (var12 + 1 == var11.field2295[var13]) {
                                var7 += var11.field2305[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2147[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2334[field419[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2147[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2019.field246;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2336[var14]) {
                            var7 += field419[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = class170.method786(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method1768(var18).field2957 || field286)) {
                        for (int var19 = 0; var19 < var17.field2295.length; var19++) {
                            if (var18 + 1 == var17.field2295[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field524;
                }
                if (var6 == 12) {
                    var7 = field552;
                }
                if (var6 == 13) {
                    int var20 = class166.field2147[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method1810(var22);
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
                    var7 = (Statics.field2019.field612 >> 7) + Statics.field1465;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2019.field601 >> 7) + Statics.field129;
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

    @ObfuscatedName("de.du(Lfo;III)V")
    public static final void method1931(class170 arg0, int arg1, int arg2) {
        if (arg0.field2189 == 1) {
            method1427(arg0.field2303, "", 24, 0, 0, arg0.field2186);
        }
        if (arg0.field2189 == 2 && !field436) {
            String var3 = method688(arg0);
            if (var3 != null) {
                method1427(var3, class38.method689(65280) + arg0.field2302, 25, 0, -1, arg0.field2186);
            }
        }
        if (arg0.field2189 == 3) {
            method1427(class174.field2495, "", 26, 0, 0, arg0.field2186);
        }
        if (arg0.field2189 == 4) {
            method1427(arg0.field2303, "", 28, 0, 0, arg0.field2186);
        }
        if (arg0.field2189 == 5) {
            method1427(arg0.field2303, "", 29, 0, 0, arg0.field2186);
        }
        if (arg0.field2189 == 6 && field538 == null) {
            method1427(arg0.field2303, "", 30, 0, -1, arg0.field2186);
        }
        if (arg0.field2300 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2202; var5++) {
                for (int var6 = 0; var6 < arg0.field2201; var6++) {
                    int var7 = (arg0.field2252 + 32) * var6;
                    int var8 = (arg0.field2253 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2254[var4];
                        var8 += arg0.field2255[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field400 = var4;
                        Statics.field145 = arg0;
                        if (arg0.field2295[var4] > 0) {
                            class199 var9 = Statics.method1768(arg0.field2295[var4] - 1);
                            if (field448 == 1 && class171.method851(method1782(arg0))) {
                                if (Statics.field2931 != arg0.field2186 || Statics.field170 != var4) {
                                    method1427(class174.field2486, field469 + " " + class38.field779 + " " + class38.method689(16748608) + var9.field2944, 31, var9.field2959, var4, arg0.field2186);
                                }
                            } else if (!field436 || !class171.method851(method1782(arg0))) {
                                String[] var10 = var9.field2979;
                                if (field301) {
                                    var10 = method113(var10);
                                }
                                if (class171.method851(method1782(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method1427(var10[var11], class38.method689(16748608) + var9.field2944, var12, var9.field2959, var4, arg0.field2186);
                                        } else if (var11 == 4) {
                                            method1427(class174.field2340, class38.method689(16748608) + var9.field2944, 37, var9.field2959, var4, arg0.field2186);
                                        }
                                    }
                                }
                                if (class171.method239(method1782(arg0))) {
                                    method1427(class174.field2486, class38.method689(16748608) + var9.field2944, 38, var9.field2959, var4, arg0.field2186);
                                }
                                if (class171.method851(method1782(arg0)) && var10 != null) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var10[var13] != null) {
                                            byte var14 = 0;
                                            if (var13 == 0) {
                                                var14 = 33;
                                            }
                                            if (var13 == 1) {
                                                var14 = 34;
                                            }
                                            if (var13 == 2) {
                                                var14 = 35;
                                            }
                                            method1427(var10[var13], class38.method689(16748608) + var9.field2944, var14, var9.field2959, var4, arg0.field2186);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2257;
                                if (field301) {
                                    var15 = method113(var15);
                                }
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method1427(var15[var16], class38.method689(16748608) + var9.field2944, var17, var9.field2959, var4, arg0.field2186);
                                        }
                                    }
                                }
                                method1427(class174.field2487, class38.method689(16748608) + var9.field2944, 1005, var9.field2959, var4, arg0.field2186);
                            } else if ((Statics.field3159 & 0x10) == 16) {
                                method1427(field439, field283 + " " + class38.field779 + " " + class38.method689(16748608) + var9.field2944, 32, var9.field2959, var4, arg0.field2186);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2185) {
            return;
        }
        if (!field436) {
            for (int var18 = 9; var18 >= 5; var18--) {
                String var19;
                if (!class171.method178(method1782(arg0), var18) && arg0.field2286 == null) {
                    var19 = null;
                } else if (arg0.field2260 == null || arg0.field2260.length <= var18 || arg0.field2260[var18] == null || arg0.field2260[var18].trim().length() == 0) {
                    var19 = null;
                } else {
                    var19 = arg0.field2260[var18];
                }
                if (var19 != null) {
                    method1427(var19, arg0.field2259, 1007, var18 + 1, arg0.field2187, arg0.field2186);
                }
            }
            String var21 = method688(arg0);
            if (var21 != null) {
                method1427(var21, arg0.field2259, 25, 0, arg0.field2187, arg0.field2186);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                String var23;
                if (!class171.method178(method1782(arg0), var22) && arg0.field2286 == null) {
                    var23 = null;
                } else if (arg0.field2260 == null || arg0.field2260.length <= var22 || arg0.field2260[var22] == null || arg0.field2260[var22].trim().length() == 0) {
                    var23 = null;
                } else {
                    var23 = arg0.field2260[var22];
                }
                if (var23 != null) {
                    method1427(var23, arg0.field2259, 57, var22 + 1, arg0.field2187, arg0.field2186);
                }
            }
            if (class171.method850(method1782(arg0))) {
                method1427(class174.field2344, "", 30, 0, arg0.field2187, arg0.field2186);
            }
        } else if (class171.method2961(method1782(arg0)) && (Statics.field3159 & 0x20) == 32) {
            method1427(field439, field283 + " " + class38.field779 + " " + arg0.field2259, 58, 0, arg0.field2187, arg0.field2186);
        }
    }

    @ObfuscatedName("ge.dl(IIIIIIII)V")
    public static final void method3151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class170.method1780(arg0)) {
            method1774(Statics.field2279[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ce.ds([Lfo;IIIIIIIB)V")
    public static final void method1774(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2185 || var9.field2300 == 0 || var9.field2308 || method1782(var9) != 0 || field455 == var9 || var9.field2190 == 1338) && var9.field2266 == arg1 && (!var9.field2185 || !method1770(var9))) {
                int var10 = var9.field2278 + arg6;
                int var11 = var9.field2244 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2300 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2300 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2201 + var10;
                    int var19 = var9.field2202 + var11;
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
                    int var22 = var9.field2201 + var10;
                    int var23 = var9.field2202 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field454 == var9) {
                    field526 = true;
                    field510 = var10;
                    field464 = var11;
                }
                if (!var9.field2185 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1789;
                    int var25 = class116.field1790 * -1088631201;
                    if (class116.field1795 != 0) {
                        var24 = class116.field1792;
                        var25 = class116.field1797;
                    }
                    if (var9.field2190 == 1337) {
                        if (!field302 && !field422 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field448 == 0 && !field436) {
                                method1427(class174.field2491, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class83.field1414; var28++) {
                                int var29 = class83.field1415[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field57.method1644(Statics.field1075, var30, var31, var29) >= 0) {
                                        class198 var34 = class198.method1443(var33);
                                        if (var34.field2912 != null) {
                                            var34 = var34.method3420();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field448 == 1) {
                                            method1427(class174.field2486, field469 + " " + class38.field779 + " " + class38.method689(65535) + var34.field2891, 1, var29, var30, var31);
                                        } else if (!field436) {
                                            String[] var35 = var34.field2916;
                                            if (field301) {
                                                var35 = method113(var35);
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
                                                        method1427(var35[var36], class38.method689(65535) + var34.field2891, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method1427(class174.field2487, class38.method689(65535) + var34.field2891, 1002, var34.field2888 << 14, var30, var31);
                                        } else if ((Statics.field3159 & 0x4) == 4) {
                                            method1427(field439, field283 + " " + class38.field779 + " " + class38.method689(65535) + var34.field2891, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class36 var38 = field322[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field761.field3008 == 1 && (var38.field612 & 0x7F) == 64 && (var38.field601 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field323; var39++) {
                                                class36 var40 = field322[field484[var39]];
                                                if (var40 != null && var38 != var40 && var40.field761.field3008 == 1 && var38.field612 == var40.field612 && var38.field601 == var40.field601) {
                                                    method1314(var40.field761, field484[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class46.field889;
                                            int[] var42 = class46.field893;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class24 var44 = field434[var42[var43]];
                                                if (var44 != null && var38.field612 == var44.field612 && var38.field601 == var44.field601) {
                                                    Statics.method152(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method1314(var38.field761, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class24 var45 = field434[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field612 & 0x7F) == 64 && (var45.field601 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field323; var46++) {
                                                class36 var47 = field322[field484[var46]];
                                                if (var47 != null && var47.field761.field3008 == 1 && var45.field612 == var47.field612 && var45.field601 == var47.field601) {
                                                    method1314(var47.field761, field484[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class46.field889;
                                            int[] var49 = class46.field893;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class24 var51 = field434[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field612 == var51.field612 && var45.field601 == var51.field601) {
                                                    Statics.method152(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field413 == var33) {
                                            var26 = var29;
                                        } else {
                                            Statics.method152(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class129 var52 = field414[Statics.field1075][var30][var31];
                                        if (var52 != null) {
                                            for (class44 var53 = (class44) var52.method2243(); var53 != null; var53 = (class44) var52.method2241()) {
                                                class199 var54 = Statics.method1768(var53.field879);
                                                if (field448 == 1) {
                                                    method1427(class174.field2486, field469 + " " + class38.field779 + " " + class38.method689(16748608) + var54.field2944, 16, var53.field879, var30, var31);
                                                } else if (!field436) {
                                                    String[] var55 = var54.field2961;
                                                    if (field301) {
                                                        var55 = method113(var55);
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
                                                            method1427(var55[var56], class38.method689(16748608) + var54.field2944, var57, var53.field879, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method1427(class174.field2339, class38.method689(16748608) + var54.field2944, 20, var53.field879, var30, var31);
                                                        }
                                                    }
                                                    method1427(class174.field2487, class38.method689(16748608) + var54.field2944, 1004, var53.field879, var30, var31);
                                                } else if ((Statics.field3159 & 0x1) == 1) {
                                                    method1427(field439, field283 + " " + class38.field779 + " " + class38.method689(16748608) + var54.field2944, 17, var53.field879, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class24 var60 = field434[field413];
                                Statics.method152(var60, field413, var58, var59);
                            }
                        }
                    } else if (var9.field2190 != 1338) {
                        if (!field422 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1931(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2300 == 0) {
                            if (!var9.field2185 && method1770(var9) && Statics.field2759 != var9) {
                                continue;
                            }
                            method1774(arg0, var9.field2186, var12, var13, var14, var15, var10 - var9.field2207, var11 - var9.field2239);
                            if (var9.field2310 != null) {
                                method1774(var9.field2310, var9.field2186, var12, var13, var14, var15, var10 - var9.field2207, var11 - var9.field2239);
                            }
                            class18 var75 = (class18) field442.method2190((long) var9.field2186);
                            if (var75 != null) {
                                if (var75.field183 == 0 && class116.field1789 >= var12 && class116.field1790 * -1088631201 >= var13 && class116.field1789 < var14 && class116.field1790 * -1088631201 < var15 && !field422 && !field415) {
                                    for (class19 var76 = (class19) field480.method2242(); var76 != null; var76 = (class19) field480.method2244()) {
                                        if (var76.field190) {
                                            var76.method2228();
                                            var76.field196.field2199 = false;
                                        }
                                    }
                                    if (Statics.field1582 == 0) {
                                        field454 = null;
                                        field455 = null;
                                    }
                                    if (!field422) {
                                        field428[0] = class174.field2533;
                                        field429[0] = "";
                                        field426[0] = 1006;
                                        field423 = 1;
                                    }
                                }
                                method3151(var75.field186, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2185) {
                            if (var9.field2205) {
                                if (class116.field1789 >= var12 && class116.field1790 * -1088631201 >= var13 && class116.field1789 < var14 && class116.field1790 * -1088631201 < var15) {
                                    for (class19 var77 = (class19) field480.method2242(); var77 != null; var77 = (class19) field480.method2244()) {
                                        if (var77.field190) {
                                            var77.method2228();
                                            var77.field196.field2199 = false;
                                        }
                                    }
                                    if (Statics.field1582 == 0) {
                                        field454 = null;
                                        field455 = null;
                                    }
                                    if (!field422) {
                                        field428[0] = class174.field2533;
                                        field429[0] = "";
                                        field426[0] = 1006;
                                        field423 = 1;
                                    }
                                }
                            } else if (var9.field2320 && class116.field1789 >= var12 && class116.field1790 * -1088631201 >= var13 && class116.field1789 < var14 && class116.field1790 * -1088631201 < var15) {
                                for (class19 var78 = (class19) field480.method2242(); var78 != null; var78 = (class19) field480.method2244()) {
                                    if (var78.field190 && var78.field196.field2287 == var78.field204) {
                                        var78.method2228();
                                    }
                                }
                            }
                            boolean var79;
                            if (class116.field1789 >= var12 && class116.field1790 * -1088631201 >= var13 && class116.field1789 < var14 && class116.field1790 * -1088631201 < var15) {
                                var79 = true;
                            } else {
                                var79 = false;
                            }
                            boolean var80 = false;
                            if ((class116.field1788 == 1 || !Statics.field1298 && class116.field1788 == 4) && var79) {
                                var80 = true;
                            }
                            boolean var81 = false;
                            if ((class116.field1795 == 1 || !Statics.field1298 && class116.field1795 == 4) && class116.field1792 >= var12 && class116.field1797 >= var13 && class116.field1792 < var14 && class116.field1797 < var15) {
                                var81 = true;
                            }
                            if (var81) {
                                method1769(var9, class116.field1792 - var10, class116.field1797 - var11);
                            }
                            if (field454 != null && field454 != var9 && var79) {
                                int var82 = method1782(var9);
                                boolean var83 = (var82 >> 20 & 0x1) != 0;
                                if (var83) {
                                    field458 = var9;
                                }
                            }
                            if (field455 == var9) {
                                field459 = true;
                                field491 = var10;
                                field285 = var11;
                            }
                            if (var9.field2308) {
                                if (var79 && field525 != 0 && var9.field2287 != null) {
                                    class19 var84 = new class19();
                                    var84.field190 = true;
                                    var84.field196 = var9;
                                    var84.field191 = field525;
                                    var84.field204 = var9.field2287;
                                    field480.method2245(var84);
                                }
                                if (field454 != null || Statics.field716 != null || field422) {
                                    var81 = false;
                                    var80 = false;
                                    var79 = false;
                                }
                                if (!var9.field2312 && var81) {
                                    var9.field2312 = true;
                                    if (var9.field2268 != null) {
                                        class19 var85 = new class19();
                                        var85.field190 = true;
                                        var85.field196 = var9;
                                        var85.field192 = class116.field1792 - var10;
                                        var85.field191 = class116.field1797 - var11;
                                        var85.field204 = var9.field2268;
                                        field480.method2245(var85);
                                    }
                                }
                                if (var9.field2312 && var80 && var9.field2269 != null) {
                                    class19 var86 = new class19();
                                    var86.field190 = true;
                                    var86.field196 = var9;
                                    var86.field192 = class116.field1789 - var10;
                                    var86.field191 = class116.field1790 * -1088631201 - var11;
                                    var86.field204 = var9.field2269;
                                    field480.method2245(var86);
                                }
                                if (var9.field2312 && !var80) {
                                    var9.field2312 = false;
                                    if (var9.field2270 != null) {
                                        class19 var87 = new class19();
                                        var87.field190 = true;
                                        var87.field196 = var9;
                                        var87.field192 = class116.field1789 - var10;
                                        var87.field191 = class116.field1790 * -1088631201 - var11;
                                        var87.field204 = var9.field2270;
                                        field326.method2245(var87);
                                    }
                                }
                                if (var80 && var9.field2271 != null) {
                                    class19 var88 = new class19();
                                    var88.field190 = true;
                                    var88.field196 = var9;
                                    var88.field192 = class116.field1789 - var10;
                                    var88.field191 = class116.field1790 * -1088631201 - var11;
                                    var88.field204 = var9.field2271;
                                    field480.method2245(var88);
                                }
                                if (!var9.field2199 && var79) {
                                    var9.field2199 = true;
                                    if (var9.field2272 != null) {
                                        class19 var89 = new class19();
                                        var89.field190 = true;
                                        var89.field196 = var9;
                                        var89.field192 = class116.field1789 - var10;
                                        var89.field191 = class116.field1790 * -1088631201 - var11;
                                        var89.field204 = var9.field2272;
                                        field480.method2245(var89);
                                    }
                                }
                                if (var9.field2199 && var79 && var9.field2233 != null) {
                                    class19 var90 = new class19();
                                    var90.field190 = true;
                                    var90.field196 = var9;
                                    var90.field192 = class116.field1789 - var10;
                                    var90.field191 = class116.field1790 * -1088631201 - var11;
                                    var90.field204 = var9.field2233;
                                    field480.method2245(var90);
                                }
                                if (var9.field2199 && !var79) {
                                    var9.field2199 = false;
                                    if (var9.field2274 != null) {
                                        class19 var91 = new class19();
                                        var91.field190 = true;
                                        var91.field196 = var9;
                                        var91.field192 = class116.field1789 - var10;
                                        var91.field191 = class116.field1790 * -1088631201 - var11;
                                        var91.field204 = var9.field2274;
                                        field326.method2245(var91);
                                    }
                                }
                                if (var9.field2273 != null) {
                                    class19 var92 = new class19();
                                    var92.field196 = var9;
                                    var92.field204 = var9.field2273;
                                    field481.method2245(var92);
                                }
                                if (var9.field2304 != null && field468 > var9.field2314) {
                                    if (var9.field2193 == null || field468 - var9.field2314 > 32) {
                                        class19 var97 = new class19();
                                        var97.field196 = var9;
                                        var97.field204 = var9.field2304;
                                        field480.method2245(var97);
                                    } else {
                                        label796: for (int var93 = var9.field2314; var93 < field468; var93++) {
                                            int var94 = field288[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var9.field2193.length; var95++) {
                                                if (var9.field2193[var95] == var94) {
                                                    class19 var96 = new class19();
                                                    var96.field196 = var9;
                                                    var96.field204 = var9.field2304;
                                                    field480.method2245(var96);
                                                    break label796;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2314 = field468;
                                }
                                if (var9.field2176 != null && field470 > var9.field2315) {
                                    if (var9.field2282 == null || field470 - var9.field2315 > 32) {
                                        class19 var102 = new class19();
                                        var102.field196 = var9;
                                        var102.field204 = var9.field2176;
                                        field480.method2245(var102);
                                    } else {
                                        label772: for (int var98 = var9.field2315; var98 < field470; var98++) {
                                            int var99 = field472[var98 & 0x1F];
                                            for (int var100 = 0; var100 < var9.field2282.length; var100++) {
                                                if (var9.field2282[var100] == var99) {
                                                    class19 var101 = new class19();
                                                    var101.field196 = var9;
                                                    var101.field204 = var9.field2176;
                                                    field480.method2245(var101);
                                                    break label772;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2315 = field470;
                                }
                                if (var9.field2283 != null && field345 > var9.field2316) {
                                    if (var9.field2250 == null || field345 - var9.field2316 > 32) {
                                        class19 var107 = new class19();
                                        var107.field196 = var9;
                                        var107.field204 = var9.field2283;
                                        field480.method2245(var107);
                                    } else {
                                        label748: for (int var103 = var9.field2316; var103 < field345; var103++) {
                                            int var104 = field471[var103 & 0x1F];
                                            for (int var105 = 0; var105 < var9.field2250.length; var105++) {
                                                if (var9.field2250[var105] == var104) {
                                                    class19 var106 = new class19();
                                                    var106.field196 = var9;
                                                    var106.field204 = var9.field2283;
                                                    field480.method2245(var106);
                                                    break label748;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2316 = field345;
                                }
                                if (field290 > var9.field2313 && var9.field2288 != null) {
                                    class19 var108 = new class19();
                                    var108.field196 = var9;
                                    var108.field204 = var9.field2288;
                                    field480.method2245(var108);
                                }
                                if (field461 > var9.field2313 && var9.field2180 != null) {
                                    class19 var109 = new class19();
                                    var109.field196 = var9;
                                    var109.field204 = var9.field2180;
                                    field480.method2245(var109);
                                }
                                if (field475 > var9.field2313 && var9.field2291 != null) {
                                    class19 var110 = new class19();
                                    var110.field196 = var9;
                                    var110.field204 = var9.field2291;
                                    field480.method2245(var110);
                                }
                                if (field550 > var9.field2313 && var9.field2296 != null) {
                                    class19 var111 = new class19();
                                    var111.field196 = var9;
                                    var111.field204 = var9.field2296;
                                    field480.method2245(var111);
                                }
                                if (field477 > var9.field2313 && var9.field2297 != null) {
                                    class19 var112 = new class19();
                                    var112.field196 = var9;
                                    var112.field204 = var9.field2297;
                                    field480.method2245(var112);
                                }
                                if (field478 > var9.field2313 && var9.field2292 != null) {
                                    class19 var113 = new class19();
                                    var113.field196 = var9;
                                    var113.field204 = var9.field2292;
                                    field480.method2245(var113);
                                }
                                var9.field2313 = field447;
                                if (var9.field2289 != null) {
                                    for (int var114 = 0; var114 < field504; var114++) {
                                        class19 var115 = new class19();
                                        var115.field196 = var9;
                                        var115.field202 = field506[var114];
                                        var115.field194 = field505[var114];
                                        var115.field204 = var9.field2289;
                                        field480.method2245(var115);
                                    }
                                }
                            }
                        }
                        if (!var9.field2185 && field454 == null && Statics.field716 == null && !field422) {
                            if ((var9.field2301 >= 0 || var9.field2213 != 0) && class116.field1789 >= var12 && class116.field1790 * -1088631201 >= var13 && class116.field1789 < var14 && class116.field1790 * -1088631201 < var15) {
                                if (var9.field2301 >= 0) {
                                    Statics.field2759 = arg0[var9.field2301];
                                } else {
                                    Statics.field2759 = var9;
                                }
                            }
                            if (var9.field2300 == 8 && class116.field1789 >= var12 && class116.field1790 * -1088631201 >= var13 && class116.field1789 < var14 && class116.field1790 * -1088631201 < var15) {
                                Statics.field242 = var9;
                            }
                            if (var9.field2210 > var9.field2202) {
                                method1041(var9, var9.field2201 + var10, var11, var9.field2202, var9.field2210, class116.field1789, class116.field1790 * -1088631201);
                            }
                        }
                    } else if ((field544 == 0 || field544 == 3) && (class116.field1795 == 1 || !Statics.field1298 && class116.field1795 == 4)) {
                        class165 var61 = var9.method2976(true);
                        if (var61 != null) {
                            int var62 = class116.field1792 - var10;
                            int var63 = class116.field1797 - var11;
                            if (var61.method2917(var62, var63)) {
                                int var64 = var62 - var61.field2144 / 2;
                                int var65 = var63 - var61.field2140 / 2;
                                int var66 = field368 + field355 & 0x7FF;
                                int var67 = class85.field1439[var66];
                                int var68 = class85.field1429[var66];
                                int var69 = (field357 + 256) * var67 >> 8;
                                int var70 = (field357 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field2019.field612 + var71 >> 7;
                                int var74 = Statics.field2019.field601 - var72 >> 7;
                                field327.method2832(93);
                                field327.method2573(18);
                                field327.method2613(class106.field1701[82] ? (class106.field1701[81] ? 2 : 1) : 0);
                                field327.method2755(Statics.field1465 + var73);
                                field327.method2622(Statics.field129 + var74);
                                field327.method2573(var64);
                                field327.method2573(var65);
                                field327.method2731(field368);
                                field327.method2573(57);
                                field327.method2573(field355);
                                field327.method2573(field357);
                                field327.method2573(89);
                                field327.method2731(Statics.field2019.field612);
                                field327.method2731(Statics.field2019.field601);
                                field327.method2573(63);
                                field515 = var73;
                                field548 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eg.dj([Lfo;II)V")
    public static final void method2439(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2300 == 0) {
                    if (var3.field2310 != null) {
                        method2439(var3.field2310, arg1);
                    }
                    class18 var4 = (class18) field442.method2190((long) var3.field2186);
                    if (var4 != null) {
                        int var5 = var4.field186;
                        if (class170.method1780(var5)) {
                            method2439(Statics.field2279[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2293 != null) {
                    class19 var6 = new class19();
                    var6.field196 = var3;
                    var6.field204 = var3.field2293;
                    class33.method857(var6, 200000);
                }
                if (arg1 == 1 && var3.field2294 != null) {
                    if (var3.field2187 >= 0) {
                        class170 var7 = class170.method786(var3.field2186);
                        if (var7 == null || var7.field2310 == null || var3.field2187 >= var7.field2310.length || var7.field2310[var3.field2187] != var3) {
                            continue;
                        }
                    }
                    class19 var8 = new class19();
                    var8.field196 = var3;
                    var8.field204 = var3.field2294;
                    class33.method857(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("cq.de(Lfo;III)V")
    public static final void method1769(class170 arg0, int arg1, int arg2) {
        if (field454 != null || field422 || arg0 == null) {
            return;
        }
        class170 var3 = method2437(arg0);
        if (var3 == null) {
            var3 = arg0.field2261;
        }
        if (var3 == null) {
            return;
        }
        field454 = arg0;
        class170 var5 = method2437(arg0);
        if (var5 == null) {
            var5 = arg0.field2261;
        }
        field455 = var5;
        field456 = arg1;
        field551 = arg2;
        Statics.field1582 = 0;
        field465 = false;
        if (field423 > 0) {
            method1293(field423 - 1);
        }
        return;
    }

    @ObfuscatedName("bh.dn(II)V")
    public static void method1293(int arg0) {
        Statics.field90 = new class39();
        Statics.field90.field788 = field318[arg0];
        Statics.field90.field786 = field425[arg0];
        Statics.field90.field787 = field426[arg0];
        Statics.field90.field785 = field314[arg0];
        Statics.field90.field791 = field428[arg0];
    }

    @ObfuscatedName("dp.dp(IIB)V")
    public static void method2017(int arg0, int arg1) {
        class39 var2 = Statics.field90;
        method692(var2.field788, var2.field786, var2.field787, var2.field785, var2.field791, var2.field791, arg0, arg1);
        Statics.field90 = null;
    }

    @ObfuscatedName("d.do(Lfo;I)V")
    public static void method88(class170 arg0) {
        if (field485 == arg0.field2318) {
            field486[arg0.field2317] = true;
        }
    }

    @ObfuscatedName("g.df([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method113(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("fx.db(IB)V")
    public static final void method2829(int arg0) {
        if (!class170.method1780(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2279[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2216 = 0;
                var3.field2309 = 0;
            }
        }
    }

    @ObfuscatedName("cd.dq([Lfo;II)V")
    public static final void method1429(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2266 == arg1 && (!var3.field2185 || !method1770(var3))) {
                if (var3.field2300 == 0) {
                    if (!var3.field2185 && method1770(var3) && Statics.field2759 != var3) {
                        continue;
                    }
                    method1429(arg0, var3.field2186);
                    if (var3.field2310 != null) {
                        method1429(var3.field2310, var3.field2186);
                    }
                    class18 var4 = (class18) field442.method2190((long) var3.field2186);
                    if (var4 != null) {
                        int var5 = var4.field186;
                        if (class170.method1780(var5)) {
                            method1429(Statics.field2279[var5], -1);
                        }
                    }
                }
                if (var3.field2300 == 6) {
                    if (var3.field2251 != -1 || var3.field2234 != -1) {
                        boolean var6 = method1778(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2234;
                        } else {
                            var7 = var3.field2251;
                        }
                        if (var7 != -1) {
                            class202 var8 = class202.method3327(var7);
                            var3.field2309 += field463;
                            while (var3.field2309 > var8.field3049[var3.field2216]) {
                                var3.field2309 -= var8.field3049[var3.field2216];
                                var3.field2216++;
                                if (var3.field2216 >= var8.field3042.length) {
                                    var3.field2216 -= var8.field3046;
                                    if (var3.field2216 < 0 || var3.field2216 >= var8.field3042.length) {
                                        var3.field2216 = 0;
                                    }
                                }
                                method88(var3);
                            }
                        }
                    }
                    if (var3.field2242 != 0 && !var3.field2185) {
                        int var9 = var3.field2242 >> 16;
                        int var10 = var3.field2242 << 16 >> 16;
                        int var11 = field463 * var9;
                        int var12 = field463 * var10;
                        var3.field2285 = var3.field2285 + var11 & 0x7FF;
                        var3.field2182 = var3.field2182 + var12 & 0x7FF;
                        method88(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gd.dg(II)V")
    public static final void method3325(int arg0) {
        Statics.method693();
        for (class32 var1 = (class32) class32.field704.method2242(); var1 != null; var1 = (class32) class32.field704.method2244()) {
            if (var1.field713 != null) {
                var1.method675();
            }
        }
        int var2 = class188.method672(arg0).field2750;
        if (var2 == 0) {
            return;
        }
        int var3 = class166.field2147[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1536(0.9D);
                ((class75) Statics.field1435).method1316(0.9D);
            }
            if (var3 == 2) {
                class85.method1536(0.8D);
                ((class75) Statics.field1435).method1316(0.8D);
            }
            if (var3 == 3) {
                class85.method1536(0.7D);
                ((class75) Statics.field1435).method1316(0.7D);
            }
            if (var3 == 4) {
                class85.method1536(0.6D);
                ((class75) Statics.field1435).method1316(0.6D);
            }
            class199.field2941.method2176();
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
                if (field518 == 0 && field445 != -1) {
                    class139.method1900(Statics.field782, field445, 0, var4, false);
                    field520 = false;
                } else if (var4 == 0) {
                    class139.method119();
                    field520 = false;
                } else {
                    class139.method871(var4);
                }
                field518 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field359 = 127;
            }
            if (var3 == 1) {
                field359 = 96;
            }
            if (var3 == 2) {
                field359 = 64;
            }
            if (var3 == 3) {
                field359 = 32;
            }
            if (var3 == 4) {
                field359 = 0;
            }
        }
        if (var2 == 5) {
            field304 = var3;
        }
        if (var2 == 6) {
            field446 = var3;
        }
        if (var2 == 9) {
            field559 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field558 = 127;
            }
            if (var3 == 1) {
                field558 = 96;
            }
            if (var3 == 2) {
                field558 = 64;
            }
            if (var3 == 3) {
                field558 = 32;
            }
            if (var3 == 4) {
                field558 = 0;
            }
        }
        if (var2 == 17) {
            field449 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class41[] var5 = new class41[] { class41.field803, class41.field799, class41.field801, class41.field800 };
            field307 = (class41) class149.method3057(var5, var3);
            if (field307 == null) {
                field307 = class41.field800;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field413 = -1;
            } else {
                field413 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class41[] var6 = new class41[] { class41.field803, class41.field799, class41.field801, class41.field800 };
        field308 = (class41) class149.method3057(var6, var3);
        if (field308 == null) {
            field308 = class41.field800;
        }
    }

    @ObfuscatedName("h.dt(IIII)Lk;")
    public static final class18 method195(int arg0, int arg1, int arg2) {
        class18 var3 = new class18();
        var3.field186 = arg1;
        var3.field183 = arg2;
        field442.method2191(var3, (long) arg0);
        method2829(arg1);
        class170 var4 = class170.method786(arg0);
        method88(var4);
        if (field538 != null) {
            method88(field538);
            field538 = null;
        }
        method1808();
        method98(Statics.field2279[arg0 >> 16], var4, false);
        class33.method187(arg1);
        if (field441 != -1) {
            int var5 = field441;
            if (class170.method1780(var5)) {
                method2439(Statics.field2279[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("a.dx(Lk;ZB)V")
    public static final void method32(class18 arg0, boolean arg1) {
        int var2 = arg0.field186;
        int var3 = (int) arg0.field1867;
        arg0.method2228();
        if (arg1 && var2 != -1 && Statics.field55[var2]) {
            Statics.field2246.method3073(var2);
            if (Statics.field2279[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2279[var2].length; var5++) {
                    if (Statics.field2279[var2][var5] != null) {
                        if (Statics.field2279[var2][var5].field2300 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2279[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2279[var2] = null;
                }
                Statics.field55[var2] = false;
            }
        }
        method181(var2);
        class170 var6 = class170.method786(var3);
        if (var6 != null) {
            method88(var6);
        }
        method1808();
        if (field441 != -1) {
            int var7 = field441;
            if (class170.method1780(var7)) {
                method2439(Statics.field2279[var7], 1);
            }
        }
    }

    @ObfuscatedName("i.da(Lfo;I)Z")
    public static final boolean method27(class170 arg0) {
        int var1 = arg0.field2190;
        if (var1 == 205) {
            field337 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field561.method2923(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field561.method2924(var4, var5 == 1);
        }
        if (var1 == 324) {
            field561.method2958(false);
        }
        if (var1 == 325) {
            field561.method2958(true);
        }
        if (var1 == 326) {
            field327.method2832(130);
            field561.method2926(field327);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gb.dr(Lfo;IIII)V")
    public static final void method3337(class170 arg0, int arg1, int arg2, int arg3) {
        method732();
        class165 var4 = arg0.method2976(false);
        if (var4 == null) {
            return;
        }
        class220.method3751(arg1, arg2, var4.field2144 + arg1, var4.field2140 + arg2);
        if (field544 == 2 || field544 == 5) {
            class220.method3770(arg1, arg2, 0, var4.field2139, var4.field2142);
        } else {
            int var5 = field368 + field355 & 0x7FF;
            int var6 = Statics.field2019.field612 / 32 + 48;
            int var7 = 464 - Statics.field2019.field601 / 32;
            Statics.field2669.method3895(arg1, arg2, var4.field2144, var4.field2140, var6, var7, var5, field357 + 256, var4.field2139, var4.field2142);
            for (int var8 = 0; var8 < field363; var8++) {
                int var9 = field512[var8] * 4 + 2 - Statics.field2019.field612 / 32;
                int var10 = field513[var8] * 4 + 2 - Statics.field2019.field601 / 32;
                method3594(arg1, arg2, var9, var10, field306[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class129 var13 = field414[Statics.field1075][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2019.field612 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2019.field601 / 32;
                        method3594(arg1, arg2, var14, var15, Statics.field2130[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field323; var16++) {
                class36 var17 = field322[field484[var16]];
                if (var17 != null && var17.method221()) {
                    class200 var18 = var17.field761;
                    if (var18 != null && var18.field3017 != null) {
                        var18 = var18.method3498();
                    }
                    if (var18 != null && var18.field3011 && var18.field3010) {
                        int var19 = var17.field612 / 32 - Statics.field2019.field612 / 32;
                        int var20 = var17.field601 / 32 - Statics.field2019.field601 / 32;
                        method3594(arg1, arg2, var19, var20, Statics.field2130[1], var4);
                    }
                }
            }
            int var21 = class46.field889;
            int[] var22 = class46.field893;
            for (int var23 = 0; var23 < var21; var23++) {
                class24 var24 = field434[var22[var23]];
                if (var24 != null && var24.method221() && !var24.field261 && Statics.field2019 != var24) {
                    int var25 = var24.field612 / 32 - Statics.field2019.field612 / 32;
                    int var26 = var24.field601 / 32 - Statics.field2019.field601 / 32;
                    boolean var27 = false;
                    if (method1069(var24.field244, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field1985; var29++) {
                        if (var24.field244.equals(Statics.field697[var29].field275)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2019.field260 != 0 && var24.field260 != 0 && Statics.field2019.field260 == var24.field260) {
                        var30 = true;
                    }
                    if (var27) {
                        method3594(arg1, arg2, var25, var26, Statics.field2130[3], var4);
                    } else if (var30) {
                        method3594(arg1, arg2, var25, var26, Statics.field2130[4], var4);
                    } else if (var28) {
                        method3594(arg1, arg2, var25, var26, Statics.field2130[5], var4);
                    } else {
                        method3594(arg1, arg2, var25, var26, Statics.field2130[2], var4);
                    }
                }
            }
            if (field299 != 0 && field291 % 20 < 10) {
                if (field299 == 1 && field300 >= 0 && field300 < field322.length) {
                    class36 var31 = field322[field300];
                    if (var31 != null) {
                        int var32 = var31.field612 / 32 - Statics.field2019.field612 / 32;
                        int var33 = var31.field601 / 32 - Statics.field2019.field601 / 32;
                        method160(arg1, arg2, var32, var33, Statics.field2170[1], var4);
                    }
                }
                if (field299 == 2) {
                    int var34 = field531 * 4 - Statics.field1465 * 4 + 2 - Statics.field2019.field612 / 32;
                    int var35 = field427 * 4 - Statics.field129 * 4 + 2 - Statics.field2019.field601 / 32;
                    method160(arg1, arg2, var34, var35, Statics.field2170[1], var4);
                }
                if (field299 == 10 && field545 >= 0 && field545 < field434.length) {
                    class24 var36 = field434[field545];
                    if (var36 != null) {
                        int var37 = var36.field612 / 32 - Statics.field2019.field612 / 32;
                        int var38 = var36.field601 / 32 - Statics.field2019.field601 / 32;
                        method160(arg1, arg2, var37, var38, Statics.field2170[1], var4);
                    }
                }
            }
            if (field515 != 0) {
                int var39 = field515 * 4 + 2 - Statics.field2019.field612 / 32;
                int var40 = field548 * 4 + 2 - Statics.field2019.field601 / 32;
                method3594(arg1, arg2, var39, var40, Statics.field2170[0], var4);
            }
            if (!Statics.field2019.field261) {
                class220.method3779(var4.field2144 / 2 + arg1 - 1, var4.field2140 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field487[arg3] = true;
    }

    @ObfuscatedName("q.dy(IIIILhs;Lfi;I)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3594(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field368 + field355 & 0x7FF;
        int var8 = class85.field1439[var7];
        int var9 = class85.field1429[var7];
        int var10 = var8 * 256 / (field357 + 256);
        int var11 = var9 * 256 / (field357 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field902.method3889(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("gw.dc(IIIILhs;Lfi;B)V")
    public static final void method3594(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field368 + field355 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1439[var6];
        int var9 = class85.field1429[var6];
        int var10 = var8 * 256 / (field357 + 256);
        int var11 = var9 * 256 / (field357 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3894(arg5.field2144 / 2 + var12 - arg4.field3206 / 2, arg5.field2140 / 2 - var13 - arg4.field3208 / 2, arg0, arg1, arg5.field2144, arg5.field2140, arg5.field2139, arg5.field2142);
        } else {
            arg4.method3884(arg5.field2144 / 2 + arg0 + var12 - arg4.field3206 / 2, arg5.field2140 / 2 + arg1 - var13 - arg4.field3208 / 2);
        }
    }

    @ObfuscatedName("bn.dv(Ljava/lang/String;ZI)Z")
    public static boolean method1069(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method2433(arg0, Statics.field210);
        for (int var3 = 0; var3 < field549; var3++) {
            if (var2.equalsIgnoreCase(class205.method2433(field351[var3].field156, Statics.field210)) && (!arg1 || field351[var3].field157 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method2433(Statics.field2019.field244, Statics.field210))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fi.dz(Ljava/lang/String;I)Z")
    public static boolean method2918(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method2433(arg0, Statics.field210);
        for (int var2 = 0; var2 < field553; var2++) {
            class20 var3 = field554[var2];
            if (var1.equalsIgnoreCase(class205.method2433(var3.field212, Statics.field210))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method2433(var3.field206, Statics.field210))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("at.dm(Ljava/lang/String;I)V")
    public static final void method720(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field549 < 200 || field462 == 1) || field549 >= 400) {
            class48.method100(30, "", class174.field2502);
            return;
        }
        String var1 = class205.method2433(arg0, Statics.field210);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field549; var2++) {
            class15 var3 = field351[var2];
            String var4 = class205.method2433(var3.field156, Statics.field210);
            if (var4 != null && var4.equals(var1)) {
                class48.method100(30, "", arg0 + class174.field2470);
                return;
            }
            if (var3.field158 != null) {
                String var5 = class205.method2433(var3.field158, Statics.field210);
                if (var5 != null && var5.equals(var1)) {
                    class48.method100(30, "", arg0 + class174.field2470);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field553; var6++) {
            class20 var7 = field554[var6];
            String var8 = class205.method2433(var7.field212, Statics.field210);
            if (var8 != null && var8.equals(var1)) {
                class48.method100(30, "", class174.field2510 + arg0 + class174.field2509);
                return;
            }
            if (var7.field206 != null) {
                String var9 = class205.method2433(var7.field206, Statics.field210);
                if (var9 != null && var9.equals(var1)) {
                    class48.method100(30, "", class174.field2510 + arg0 + class174.field2509);
                    return;
                }
            }
        }
        if (class205.method2433(Statics.field2019.field244, Statics.field210).equals(var1)) {
            class48.method100(30, "", class174.field2372);
        } else {
            field327.method2832(222);
            field327.method2573(class154.method2553(arg0));
            field327.method2624(arg0);
        }
    }

    @ObfuscatedName("bn.ec(Ljava/lang/String;ZI)V")
    public static final void method1067(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field553 < 100 || field462 == 1) || field553 >= 400) {
            class48.method100(31, "", class174.field2504);
            return;
        }
        String var2 = class205.method2433(arg0, Statics.field210);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field553; var3++) {
            class20 var4 = field554[var3];
            String var5 = class205.method2433(var4.field212, Statics.field210);
            if (var5 != null && var5.equals(var2)) {
                class48.method100(31, "", arg0 + class174.field2505);
                return;
            }
            if (var4.field206 != null) {
                String var6 = class205.method2433(var4.field206, Statics.field210);
                if (var6 != null && var6.equals(var2)) {
                    class48.method100(31, "", arg0 + class174.field2505);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field549; var7++) {
            class15 var8 = field351[var7];
            String var9 = class205.method2433(var8.field156, Statics.field210);
            if (var9 != null && var9.equals(var2)) {
                class48.method100(31, "", class174.field2480 + arg0 + class174.field2520);
                return;
            }
            if (var8.field158 != null) {
                String var10 = class205.method2433(var8.field158, Statics.field210);
                if (var10 != null && var10.equals(var2)) {
                    class48.method100(31, "", class174.field2480 + arg0 + class174.field2520);
                    return;
                }
            }
        }
        if (class205.method2433(Statics.field2019.field244, Statics.field210).equals(var2)) {
            class48.method100(31, "", class174.field2507);
        } else {
            field327.method2832(231);
            field327.method2573(class154.method2553(arg0));
            field327.method2624(arg0);
        }
    }

    @ObfuscatedName("x.ee(Ljava/lang/String;I)V")
    public static final void method10(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class205.method2433(arg0, Statics.field210);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field553; var2++) {
            class20 var3 = field554[var2];
            String var4 = var3.field212;
            String var5 = class205.method2433(var4, Statics.field210);
            if (class218.method3019(arg0, var1, var4, var5)) {
                field553--;
                for (int var6 = var2; var6 < field553; var6++) {
                    field554[var6] = field554[var6 + 1];
                }
                field461 = field447;
                field327.method2832(127);
                field327.method2573(class154.method2553(arg0));
                field327.method2624(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dh.ek(Ljava/lang/String;II)V")
    public static final void method1895(String arg0, int arg1) {
        field327.method2832(184);
        field327.method2573(class154.method2553(arg0) + 1);
        field327.method2573(arg1);
        field327.method2624(arg0);
    }

    @ObfuscatedName("dk.el(Ljava/lang/String;I)V")
    public static final void method1860(String arg0) {
        if (!arg0.equals("")) {
            field327.method2832(7);
            field327.method2573(class154.method2553(arg0));
            field327.method2624(arg0);
        }
    }

    @ObfuscatedName("p.ei(II)V")
    public static void method181(int arg0) {
        for (class134 var1 = (class134) field483.method2195(); var1 != null; var1 = (class134) field483.method2194()) {
            if ((var1.field1867 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method2228();
            }
        }
    }

    @ObfuscatedName("cz.ej(Lfo;B)I")
    public static int method1782(class170 arg0) {
        class134 var1 = (class134) field483.method2190(((long) arg0.field2186 << 32) + (long) arg0.field2187);
        return var1 == null ? arg0.field2258 : var1.field1882;
    }

    @ObfuscatedName("eg.er(Lfo;I)Lfo;")
    public static class170 method2437(class170 arg0) {
        int var1 = class171.method727(method1782(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class170.method786(arg0.field2266);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cq.ex(Lfo;I)Z")
    public static boolean method1770(class170 arg0) {
        if (field415) {
            if (method1782(arg0) != 0) {
                return false;
            }
            if (arg0.field2300 == 0) {
                return false;
            }
        }
        return arg0.field2206;
    }

    @ObfuscatedName("ax.ey(Lfo;I)Ljava/lang/String;")
    public static String method688(class170 arg0) {
        int var1 = method1782(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2265 == null || arg0.field2265.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2265;
        }
    }

    @ObfuscatedName("fi.ed(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2916(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field417 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field417 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field417 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field417 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field417 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field3168 != null) {
            var3 = "/p=" + Statics.field3168;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field473 + "/a=" + Statics.field2332 + var3 + "/";
    }

    @ObfuscatedName("cc.eg(Ljava/lang/String;I)V")
    public static void method1834(String arg0) {
        Statics.field3168 = arg0;
        try {
            String var1 = Statics.field280.getParameter(class215.field3150.field3157);
            String var2 = Statics.field280.getParameter(class215.field3155.field3157);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class163.method2965(class156.method118() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field280;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }
}

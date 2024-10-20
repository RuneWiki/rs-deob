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
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.r")
    public static boolean field550 = true;

    @ObfuscatedName("client.w")
    public static class118[] field339 = new class118[4];

    @ObfuscatedName("client.j")
    public static int field329 = 1;

    @ObfuscatedName("client.q")
    public static int field481 = 0;

    @ObfuscatedName("client.n")
    public static int field282 = 0;

    @ObfuscatedName("client.g")
    public static boolean field284 = false;

    @ObfuscatedName("client.i")
    public static boolean field279 = false;

    @ObfuscatedName("client.v")
    public static int field286 = 0;

    @ObfuscatedName("client.f")
    public static int field308 = 0;

    @ObfuscatedName("client.z")
    public static boolean field288 = true;

    @ObfuscatedName("client.u")
    public static int field454 = 0;

    @ObfuscatedName("client.b")
    public static long field290 = 1L;

    @ObfuscatedName("client.e")
    public static int field291 = -1;

    @ObfuscatedName("client.l")
    public static int field292 = -1;

    @ObfuscatedName("client.ap")
    public static int field366 = -1;

    @ObfuscatedName("client.aq")
    public static boolean field450 = true;

    @ObfuscatedName("client.aw")
    public static boolean field442 = false;

    @ObfuscatedName("client.as")
    public static int field326 = 0;

    @ObfuscatedName("client.ah")
    public static int field297 = 0;

    @ObfuscatedName("client.aa")
    public static int field298 = 0;

    @ObfuscatedName("client.ai")
    public static int field299 = 0;

    @ObfuscatedName("client.af")
    public static int field349 = 0;

    @ObfuscatedName("client.aj")
    public static int field429 = 0;

    @ObfuscatedName("client.am")
    public static int field302 = 0;

    @ObfuscatedName("client.ar")
    public static int field303 = 0;

    @ObfuscatedName("client.ad")
    public static int field304 = 0;

    @ObfuscatedName("client.ac")
    public static class41 field305 = class41.field811;

    @ObfuscatedName("client.ag")
    public static class41 field306 = class41.field811;

    @ObfuscatedName("client.au")
    public static int field295 = 0;

    @ObfuscatedName("client.ab")
    public static int field356 = 0;

    @ObfuscatedName("client.al")
    public static int field309 = 0;

    @ObfuscatedName("client.bw")
    public static int field311 = 0;

    @ObfuscatedName("client.bj")
    public static int field547 = 0;

    @ObfuscatedName("client.bs")
    public static int field313 = 0;

    @ObfuscatedName("client.ba")
    public static int field314 = 0;

    @ObfuscatedName("client.bn")
    public static int field320 = 0;

    @ObfuscatedName("client.ch")
    public static class36[] field317 = new class36[32768];

    @ObfuscatedName("client.cf")
    public static int field318 = 0;

    @ObfuscatedName("client.ct")
    public static int[] field555 = new int[32768];

    @ObfuscatedName("client.cu")
    public static int field312 = 0;

    @ObfuscatedName("client.ck")
    public static int[] field321 = new int[250];

    @ObfuscatedName("client.ca")
    public static class167 field322 = new class167(5000);

    @ObfuscatedName("client.cw")
    public static class167 field323 = new class167(5000);

    @ObfuscatedName("client.cg")
    public static class167 field324 = new class167(15000);

    @ObfuscatedName("client.cz")
    public static int field325 = 0;

    @ObfuscatedName("client.cv")
    public static int field287 = 0;

    @ObfuscatedName("client.cp")
    public static int field327 = 0;

    @ObfuscatedName("client.cx")
    public static int field328 = 0;

    @ObfuscatedName("client.cl")
    public static int field285 = 0;

    @ObfuscatedName("client.cm")
    public static int field330 = 0;

    @ObfuscatedName("client.cr")
    public static int field331 = 0;

    @ObfuscatedName("client.cs")
    public static int field332 = 0;

    @ObfuscatedName("client.cj")
    public static boolean field333 = false;

    @ObfuscatedName("client.dt")
    public static int field280 = 0;

    @ObfuscatedName("client.dd")
    public static int field335 = 1;

    @ObfuscatedName("client.da")
    public static int field336 = 0;

    @ObfuscatedName("client.dm")
    public static int field466 = 1;

    @ObfuscatedName("client.du")
    public static int field338 = 0;

    @ObfuscatedName("client.dz")
    public static boolean field549 = false;

    @ObfuscatedName("client.dg")
    public static int[][][] field341 = new int[4][13][13];

    @ObfuscatedName("client.di")
    public static final int[] field541 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dw")
    public static int field343 = 0;

    @ObfuscatedName("client.do")
    public static int field344 = 2;

    @ObfuscatedName("client.db")
    public static int field443 = 0;

    @ObfuscatedName("client.dk")
    public static int field346 = 2;

    @ObfuscatedName("client.dh")
    public static int field347 = 0;

    @ObfuscatedName("client.em")
    public static int field348 = 1;

    @ObfuscatedName("client.ec")
    public static int field422 = 0;

    @ObfuscatedName("client.ed")
    public static int field536 = 0;

    @ObfuscatedName("client.ei")
    public static int field351 = 2;

    @ObfuscatedName("client.et")
    public static int field352 = 0;

    @ObfuscatedName("client.ep")
    public static int field353 = 1;

    @ObfuscatedName("client.ew")
    public static int field342 = 0;

    @ObfuscatedName("client.eh")
    public static int field355 = 0;

    @ObfuscatedName("client.ee")
    public static int field491 = 2301979;

    @ObfuscatedName("client.eb")
    public static int field357 = 5063219;

    @ObfuscatedName("client.ey")
    public static int field358 = 3353893;

    @ObfuscatedName("client.ef")
    public static int field359 = 7759444;

    @ObfuscatedName("client.es")
    public static boolean field360 = false;

    @ObfuscatedName("client.en")
    public static int field315 = 0;

    @ObfuscatedName("client.fq")
    public static int field362 = 128;

    @ObfuscatedName("client.fb")
    public static int field363 = 0;

    @ObfuscatedName("client.fs")
    public static int field364 = 0;

    @ObfuscatedName("client.fp")
    public static int field365 = 0;

    @ObfuscatedName("client.fg")
    public static int field307 = 0;

    @ObfuscatedName("client.ft")
    public static int field367 = 0;

    @ObfuscatedName("client.fh")
    public static int field368 = 50;

    @ObfuscatedName("client.fa")
    public static int field507 = 0;

    @ObfuscatedName("client.fj")
    public static boolean field495 = false;

    @ObfuscatedName("client.fi")
    public static int field371 = 0;

    @ObfuscatedName("client.fl")
    public static int field372 = 0;

    @ObfuscatedName("client.fv")
    public static int field373 = 50;

    @ObfuscatedName("client.fn")
    public static int[] field374 = new int[field373];

    @ObfuscatedName("client.fx")
    public static int[] field375 = new int[field373];

    @ObfuscatedName("client.fz")
    public static int[] field520 = new int[field373];

    @ObfuscatedName("client.fd")
    public static int[] field377 = new int[field373];

    @ObfuscatedName("client.fr")
    public static int[] field378 = new int[field373];

    @ObfuscatedName("client.fu")
    public static int[] field379 = new int[field373];

    @ObfuscatedName("client.fw")
    public static int[] field380 = new int[field373];

    @ObfuscatedName("client.gh")
    public static String[] field381 = new String[field373];

    @ObfuscatedName("client.ga")
    public static int[][] field405 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field452 = 0;

    @ObfuscatedName("client.gi")
    public static int field384 = -1;

    @ObfuscatedName("client.ge")
    public static int field385 = -1;

    @ObfuscatedName("client.gz")
    public static int field386 = 0;

    @ObfuscatedName("client.gw")
    public static int field387 = 0;

    @ObfuscatedName("client.gt")
    public static int field465 = 0;

    @ObfuscatedName("client.gx")
    public static int field521 = 0;

    @ObfuscatedName("client.gs")
    public static int field390 = 0;

    @ObfuscatedName("client.gy")
    public static int field391 = 0;

    @ObfuscatedName("client.gp")
    public static int field392 = 0;

    @ObfuscatedName("client.gb")
    public static int field393 = 0;

    @ObfuscatedName("client.gm")
    public static int field498 = 0;

    @ObfuscatedName("client.gl")
    public static int field382 = 0;

    @ObfuscatedName("client.go")
    public static boolean field505 = false;

    @ObfuscatedName("client.gc")
    public static int field396 = 0;

    @ObfuscatedName("client.gk")
    public static int field398 = 0;

    @ObfuscatedName("client.gd")
    public static class24[] field399 = new class24[2048];

    @ObfuscatedName("client.gn")
    public static int field473 = -1;

    @ObfuscatedName("client.gj")
    public static int field504 = 0;

    @ObfuscatedName("client.ho")
    public static int field402 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field403 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field419 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ha")
    public static String[] field428 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field406 = new boolean[8];

    @ObfuscatedName("client.hs")
    public static int[] field407 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field408 = -1;

    @ObfuscatedName("client.hp")
    public static class129[][][] field409 = new class129[4][104][104];

    @ObfuscatedName("client.hr")
    public static class129 field301 = new class129();

    @ObfuscatedName("client.hb")
    public static class129 field411 = new class129();

    @ObfuscatedName("client.hz")
    public static class129 field412 = new class129();

    @ObfuscatedName("client.hj")
    public static int[] field319 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field414 = new int[25];

    @ObfuscatedName("client.hd")
    public static int[] field345 = new int[25];

    @ObfuscatedName("client.hv")
    public static int field544 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field417 = false;

    @ObfuscatedName("client.hf")
    public static int field418 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field424 = new int[500];

    @ObfuscatedName("client.hx")
    public static int[] field420 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field554 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field445 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field423 = new String[500];

    @ObfuscatedName("client.iw")
    public static String[] field370 = new String[500];

    @ObfuscatedName("client.il")
    public static int field425 = -1;

    @ObfuscatedName("client.if")
    public static int field426 = -1;

    @ObfuscatedName("client.iy")
    public static int field427 = 0;

    @ObfuscatedName("client.iu")
    public static int field456 = 50;

    @ObfuscatedName("client.ib")
    public static int field526 = 0;

    @ObfuscatedName("client.is")
    public static String field432 = null;

    @ObfuscatedName("client.iq")
    public static boolean field433 = false;

    @ObfuscatedName("client.in")
    public static int field434 = -1;

    @ObfuscatedName("client.im")
    public static int field435 = -1;

    @ObfuscatedName("client.ij")
    public static String field436 = null;

    @ObfuscatedName("client.ie")
    public static String field437 = null;

    @ObfuscatedName("client.ii")
    public static int field438 = -1;

    @ObfuscatedName("client.it")
    public static class126 field439 = new class126(8);

    @ObfuscatedName("client.ip")
    public static int field440 = 0;

    @ObfuscatedName("client.jj")
    public static int field441 = 0;

    @ObfuscatedName("client.jf")
    public static class151 field310 = null;

    @ObfuscatedName("client.jl")
    public static int field316 = 0;

    @ObfuscatedName("client.jb")
    public static int field444 = 0;

    @ObfuscatedName("client.js")
    public static int field397 = 0;

    @ObfuscatedName("client.ji")
    public static int field446 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field447 = false;

    @ObfuscatedName("client.je")
    public static boolean field487 = false;

    @ObfuscatedName("client.jz")
    public static boolean field395 = false;

    @ObfuscatedName("client.jp")
    public static class151 field468 = null;

    @ObfuscatedName("client.ja")
    public static class151 field451 = null;

    @ObfuscatedName("client.jk")
    public static class151 field421 = null;

    @ObfuscatedName("client.jr")
    public static int field453 = 0;

    @ObfuscatedName("client.jo")
    public static int field361 = 0;

    @ObfuscatedName("client.jw")
    public static class151 field455 = null;

    @ObfuscatedName("client.jd")
    public static boolean field389 = false;

    @ObfuscatedName("client.jn")
    public static int field457 = -1;

    @ObfuscatedName("client.jc")
    public static int field458 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field459 = false;

    @ObfuscatedName("client.jh")
    public static int field376 = -1;

    @ObfuscatedName("client.jx")
    public static int field556 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field461 = false;

    @ObfuscatedName("client.kg")
    public static int field463 = 1;

    @ObfuscatedName("client.ky")
    public static int[] field394 = new int[32];

    @ObfuscatedName("client.ku")
    public static int field562 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field404 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field467 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field449 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field469 = 0;

    @ObfuscatedName("client.kz")
    public static int field470 = 0;

    @ObfuscatedName("client.kr")
    public static int field471 = 0;

    @ObfuscatedName("client.ka")
    public static int field472 = 0;

    @ObfuscatedName("client.kl")
    public static int field416 = 0;

    @ObfuscatedName("client.ke")
    public static int field294 = 0;

    @ObfuscatedName("client.km")
    public static int field475 = 0;

    @ObfuscatedName("client.kd")
    public static int field476 = 0;

    @ObfuscatedName("client.kh")
    public static class129 field477 = new class129();

    @ObfuscatedName("client.kp")
    public static class129 field478 = new class129();

    @ObfuscatedName("client.kc")
    public static class129 field479 = new class129();

    @ObfuscatedName("client.kn")
    public static class126 field480 = new class126(512);

    @ObfuscatedName("client.ks")
    public static int field289 = 0;

    @ObfuscatedName("client.ki")
    public static int field482 = -2;

    @ObfuscatedName("client.kb")
    public static boolean[] field483 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field484 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static boolean[] field537 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static int[] field340 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field277 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field488 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field489 = new int[100];

    @ObfuscatedName("client.ls")
    public static int field490 = 0;

    @ObfuscatedName("client.lq")
    public static long field485 = 0L;

    @ObfuscatedName("client.li")
    public static boolean field492 = true;

    @ObfuscatedName("client.lm")
    public static int field538 = 765;

    @ObfuscatedName("client.lf")
    public static int field494 = 1;

    @ObfuscatedName("client.lc")
    public static int[] field499 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lj")
    public static int field496 = 0;

    @ObfuscatedName("client.la")
    public static int field497 = 0;

    @ObfuscatedName("client.lw")
    public static String field560 = "";

    @ObfuscatedName("client.lo")
    public static long[] field559 = new long[100];

    @ObfuscatedName("client.lu")
    public static int field500 = 0;

    @ObfuscatedName("client.ly")
    public static int field501 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field502 = new int[128];

    @ObfuscatedName("client.mt")
    public static int[] field503 = new int[128];

    @ObfuscatedName("client.ms")
    public static long field337 = -1L;

    @ObfuscatedName("client.mp")
    public static String field300 = null;

    @ObfuscatedName("client.mx")
    public static String field506 = null;

    @ObfuscatedName("client.mk")
    public static int field383 = -1;

    @ObfuscatedName("client.ma")
    public static int field508 = 0;

    @ObfuscatedName("client.mh")
    public static int[] field509 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field510 = new int[1000];

    @ObfuscatedName("client.me")
    public static class225[] field511 = new class225[1000];

    @ObfuscatedName("client.mz")
    public static int field512 = 0;

    @ObfuscatedName("client.my")
    public static int field524 = 0;

    @ObfuscatedName("client.ml")
    public static int field515 = 0;

    @ObfuscatedName("client.mf")
    public static int field516 = 255;

    @ObfuscatedName("client.mb")
    public static int field517 = -1;

    @ObfuscatedName("client.mw")
    public static boolean field518 = false;

    @ObfuscatedName("client.nz")
    public static int field519 = 127;

    @ObfuscatedName("client.ne")
    public static int field513 = 127;

    @ObfuscatedName("client.ni")
    public static int field462 = 0;

    @ObfuscatedName("client.np")
    public static int[] field474 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field523 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field534 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field525 = new int[50];

    @ObfuscatedName("client.nm")
    public static class54[] field401 = new class54[50];

    @ObfuscatedName("client.nv")
    public static boolean field527 = false;

    @ObfuscatedName("client.nn")
    public static boolean[] field528 = new boolean[5];

    @ObfuscatedName("client.oc")
    public static int[] field529 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field530 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field388 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field532 = new int[5];

    @ObfuscatedName("client.om")
    public static short field369 = 256;

    @ObfuscatedName("client.or")
    public static short field293 = 205;

    @ObfuscatedName("client.oa")
    public static short field535 = 256;

    @ObfuscatedName("client.oj")
    public static short field522 = 320;

    @ObfuscatedName("client.ot")
    public static short field448 = 1;

    @ObfuscatedName("client.oi")
    public static short field413 = 32767;

    @ObfuscatedName("client.ou")
    public static short field539 = 1;

    @ObfuscatedName("client.ok")
    public static short field540 = 32767;

    @ObfuscatedName("client.oy")
    public static int field281 = 0;

    @ObfuscatedName("client.ow")
    public static int field542 = 0;

    @ObfuscatedName("client.oz")
    public static int field543 = 0;

    @ObfuscatedName("client.ox")
    public static int field460 = 0;

    @ObfuscatedName("client.oe")
    public static int field545 = 0;

    @ObfuscatedName("client.od")
    public static int field546 = 0;

    @ObfuscatedName("client.ol")
    public static int field334 = 0;

    @ObfuscatedName("client.ob")
    public static class15[] field548 = new class15[400];

    @ObfuscatedName("client.of")
    public static class131 field410 = new class131();

    @ObfuscatedName("client.os")
    public static int field486 = 0;

    @ObfuscatedName("client.op")
    public static class20[] field551 = new class20[400];

    @ObfuscatedName("client.oq")
    public static class148 field552 = new class148();

    @ObfuscatedName("client.pc")
    public static int field553 = -1;

    @ObfuscatedName("client.pa")
    public static int field296 = -1;

    @ObfuscatedName("client.pq")
    public static class5[] field531 = new class5[8];

    @ObfuscatedName("client.pf")
    public static long field350 = -1L;

    @ObfuscatedName("client.pi")
    public static long field557 = -1L;

    @ObfuscatedName("client.pv")
    public static final class23 field558 = new class23();

    @ObfuscatedName("client.pk")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.pu")
    public static int[] field464 = new int[50];

    @ObfuscatedName("client.w(I)V")
    public final void method265() {
    }

    public final void init() {
        if (!this.method2017()) {
            return;
        }
        class215[] var1 = class215.method3047();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class215 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3152);
            if (var4 != null) {
                int var6;
                class179[] var7;
                int var8;
                switch(Integer.parseInt(var3.field3152)) {
                    case 1:
                        Statics.field215 = var4;
                        continue;
                    case 2:
                        if (var4.equalsIgnoreCase(class38.field790)) {
                            field284 = true;
                        } else {
                            field284 = false;
                        }
                        continue;
                    case 3:
                        Statics.field1686 = Integer.parseInt(var4);
                        continue;
                    case 4:
                        Statics.field13 = var4;
                        continue;
                    case 5:
                        if (var4.equalsIgnoreCase(class38.field790)) {
                        }
                        continue;
                    case 6:
                        class180[] var5 = new class180[] { class180.field2680, class180.field2675, class180.field2671, class180.field2681, class180.field2677, class180.field2673 };
                        Statics.field230 = (class180) class156.method725(var5, Integer.parseInt(var4));
                        if (Statics.field230 == class180.field2675) {
                            Statics.field283 = class229.field3240;
                        } else {
                            Statics.field283 = class229.field3242;
                        }
                        continue;
                    case 7:
                        field329 = Integer.parseInt(var4);
                    case 8:
                    case 11:
                    case 13:
                    default:
                        continue;
                    case 9:
                        field286 = Integer.parseInt(var4);
                        continue;
                    case 10:
                        Statics.field3085 = Integer.parseInt(var4);
                        continue;
                    case 12:
                        field481 = Integer.parseInt(var4);
                        continue;
                    case 14:
                        field282 = Integer.parseInt(var4);
                        continue;
                    case 15:
                        var6 = Integer.parseInt(var4);
                        var7 = class179.method1352();
                        var8 = 0;
                }
                class179 var10;
                while (true) {
                    if (var8 >= var7.length) {
                        var10 = null;
                        break;
                    }
                    class179 var9 = var7[var8];
                    if (var9.field2661 == var6) {
                        var10 = var9;
                        break;
                    }
                    var8++;
                }
                Statics.field171 = var10;
            }
        }
        method803();
        Statics.field94 = this.getCodeBase().getHost();
        String var11 = Statics.field171.field2665;
        byte var12 = 0;
        try {
            Statics.field178 = 16;
            Statics.field1693 = var12;
            try {
                Statics.field2208 = System.getProperty("os.name");
            } catch (Exception var25) {
                Statics.field2208 = "Unknown";
            }
            Statics.field1196 = Statics.field2208.toLowerCase();
            try {
                Statics.field969 = System.getProperty("user.home");
                if (Statics.field969 != null) {
                    Statics.field969 = Statics.field969 + "/";
                }
            } catch (Exception var24) {
            }
            try {
                if (Statics.field1196.startsWith("win")) {
                    if (Statics.field969 == null) {
                        Statics.field969 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field969 == null) {
                    Statics.field969 = System.getenv("HOME");
                }
                if (Statics.field969 != null) {
                    Statics.field969 = Statics.field969 + "/";
                }
            } catch (Exception var23) {
            }
            if (Statics.field969 == null) {
                Statics.field969 = "~/";
            }
            Statics.field1199 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field969, "/tmp/", "" };
            Statics.field1698 = new String[] { ".jagex_cache_" + Statics.field1693, ".file_store_" + Statics.field1693 };
            label119: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field3283 = class105.method743("oldschool", var11, var16);
                if (!Statics.field3283.exists()) {
                    Statics.field3283.mkdirs();
                }
                File[] var17 = Statics.field3283.listFiles();
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
                    if (!class105.method647(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            class108.method3203(Statics.field3283);
            class105.method3373();
            class105.field1695 = new class73(new class74(class108.method1856("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class105.field1696 = new class73(new class74(class108.method1856("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field121 = new class73[Statics.field178];
            for (int var21 = 0; var21 < Statics.field178; var21++) {
                Statics.field121[var21] = new class73(new class74(class108.method1856("main_file_cache.idx" + var21), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var26) {
            class102.method706((String) null, var26);
        }
        Statics.field278 = this;
        this.method1959(765, 503, 133);
    }

    @ObfuscatedName("ae.c(I)V")
    public static final void method803() {
        class88.field1524 = false;
        field279 = false;
    }

    @ObfuscatedName("client.g(I)V")
    public final void method267() {
        Statics.field2217 = field282 == 0 ? 43594 : field329 + 40000;
        Statics.field55 = field282 == 0 ? 443 : field329 + 50000;
        Statics.field493 = Statics.field2217;
        Statics.field2021 = class149.field2032;
        Statics.field1662 = class149.field2030;
        Statics.field3232 = class149.field2031;
        Statics.field2308 = class149.field2035;
        if (Statics.field1688.toLowerCase().indexOf("microsoft") == -1) {
            class106.field1722[44] = 71;
            class106.field1722[45] = 26;
            class106.field1722[46] = 72;
            class106.field1722[47] = 73;
            class106.field1722[59] = 57;
            class106.field1722[61] = 27;
            class106.field1722[91] = 42;
            class106.field1722[92] = 74;
            class106.field1722[93] = 43;
            class106.field1722[192] = 28;
            class106.field1722[222] = 58;
            class106.field1722[520] = 59;
        } else {
            class106.field1722[186] = 57;
            class106.field1722[187] = 27;
            class106.field1722[188] = 71;
            class106.field1722[189] = 26;
            class106.field1722[190] = 72;
            class106.field1722[191] = 73;
            class106.field1722[192] = 58;
            class106.field1722[219] = 42;
            class106.field1722[220] = 74;
            class106.field1722[221] = 43;
            class106.field1722[222] = 59;
            class106.field1722[223] = 28;
        }
        Canvas var1 = Statics.field729;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class106.field1701);
        var1.addFocusListener(class106.field1701);
        class116.method1618(Statics.field729);
        class107 var2;
        try {
            var2 = new class107();
        } catch (Throwable var9) {
            var2 = null;
        }
        Statics.field77 = var2;
        if (Statics.field77 != null) {
            Statics.field77.method1900(Statics.field729);
        }
        Statics.field1685 = new class117(255, class105.field1695, class105.field1696, 500000);
        Statics.field1457 = class31.method3525();
        Statics.field234 = this.getToolkit().getSystemClipboard();
        String var5 = Statics.field708;
        class115.field1793 = this;
        class115.field1786 = var5;
        if (field282 != 0) {
            field442 = true;
        }
        int var6 = Statics.field1457.field685;
        field485 = 0L;
        if (var6 >= 2) {
            field492 = true;
        } else {
            field492 = false;
        }
        method885();
        if (field308 >= 25) {
            field322.method2993(245);
            class167 var7 = field322;
            int var8 = field492 ? 2 : 1;
            var7.method2718(var8);
            field322.method2900(Statics.field124);
            field322.method2900(Statics.field2000);
        }
        field1777 = true;
    }

    @ObfuscatedName("client.i(I)V")
    public final void method327() {
        field454++;
        this.method464();
        class184.method1787();
        try {
            if (class139.field1911 == 1) {
                int var1 = Statics.field1907.method2421();
                if (var1 > 0 && Statics.field1907.method2315()) {
                    int var2 = var1 - Statics.field166;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1907.method2308(var2);
                } else {
                    Statics.field1907.method2314();
                    Statics.field1907.method2312();
                    if (Statics.field11 == null) {
                        class139.field1911 = 0;
                    } else {
                        class139.field1911 = 2;
                    }
                    Statics.field1914 = null;
                    Statics.field2025 = null;
                }
            }
        } catch (Exception var106) {
            var106.printStackTrace();
            Statics.field1907.method2314();
            class139.field1911 = 0;
            Statics.field1914 = null;
            Statics.field2025 = null;
            Statics.field11 = null;
        }
        method34();
        class106.method1796();
        class116.method262();
        if (Statics.field77 != null) {
            int var4 = Statics.field77.method1902();
            field476 = var4;
        }
        if (field308 == 0) {
            method3238();
            class114.method3241();
        } else if (field308 == 5) {
            class42.method748(this);
            method3238();
            class114.method3241();
        } else if (field308 == 10 || field308 == 11) {
            class42.method748(this);
        } else if (field308 == 20) {
            class42.method748(this);
            method700();
        } else if (field308 == 25) {
            method1615();
        }
        if (field308 == 30) {
            if (field326 > 1) {
                field326--;
            }
            if (field332 > 0) {
                field332--;
            }
            if (field333) {
                field333 = false;
                method17();
            } else {
                if (!field417) {
                    field423[0] = class174.field2578;
                    field370[0] = "";
                    field554[0] = 1006;
                    field418 = 1;
                }
                for (int var5 = 0; var5 < 100 && Statics.method1376(); var5++) {
                }
                if (field308 == 30) {
                    while (true) {
                        class227 var6 = (class227) class228.field3233.method2191();
                        boolean var7;
                        if (var6 == null) {
                            var7 = false;
                        } else {
                            var7 = true;
                        }
                        if (!var7) {
                            Object var9 = Statics.field1558.field211;
                            synchronized (Statics.field1558.field211) {
                                if (!field550) {
                                    Statics.field1558.field212 = 0;
                                } else if (class116.field1805 != 0 || Statics.field1558.field212 >= 40) {
                                    field322.method2993(156);
                                    field322.method2718(0);
                                    int var10 = field322.field2267;
                                    int var11 = 0;
                                    for (int var12 = 0; var12 < Statics.field1558.field212 && field322.field2267 - var10 < 240; var12++) {
                                        var11++;
                                        int var13 = Statics.field1558.field219[var12];
                                        if (var13 < 0) {
                                            var13 = 0;
                                        } else if (var13 > 502) {
                                            var13 = 502;
                                        }
                                        int var14 = Statics.field1558.field213[var12];
                                        if (var14 < 0) {
                                            var14 = 0;
                                        } else if (var14 > 764) {
                                            var14 = 764;
                                        }
                                        int var15 = var13 * 765 + var14;
                                        if (Statics.field1558.field219[var12] == -1 && Statics.field1558.field213[var12] == -1) {
                                            var14 = -1;
                                            var13 = -1;
                                            var15 = 524287;
                                        }
                                        if (field291 != var14 || field292 != var13) {
                                            int var16 = var14 - field291;
                                            field291 = var14;
                                            int var17 = var13 - field292;
                                            field292 = var13;
                                            if (field366 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                                var16 += 32;
                                                var17 += 32;
                                                field322.method2900((field366 << 12) + (var16 << 6) + var17);
                                                field366 = 0;
                                            } else if (field366 < 8) {
                                                field322.method2720((field366 << 19) + 8388608 + var15);
                                                field366 = 0;
                                            } else {
                                                field322.method2863((field366 << 19) + -1073741824 + var15);
                                                field366 = 0;
                                            }
                                        } else if (field366 < 2047) {
                                            field366++;
                                        }
                                    }
                                    field322.method2730(field322.field2267 - var10);
                                    if (var11 >= Statics.field1558.field212) {
                                        Statics.field1558.field212 = 0;
                                    } else {
                                        Statics.field1558.field212 -= var11;
                                        for (int var18 = 0; var18 < Statics.field1558.field212; var18++) {
                                            Statics.field1558.field213[var18] = Statics.field1558.field213[var11 + var18];
                                            Statics.field1558.field219[var18] = Statics.field1558.field219[var11 + var18];
                                        }
                                    }
                                }
                            }
                            if (class116.field1805 == 1 || !Statics.field1810 && class116.field1805 == 4 || class116.field1805 == 2) {
                                long var20 = (class116.field1807 - field290 * -1L) / 50L;
                                if (var20 > 4095L) {
                                    var20 = 4095L;
                                }
                                field290 = class116.field1807 * -1L;
                                int var22 = class116.field1808;
                                if (var22 < 0) {
                                    var22 = 0;
                                } else if (var22 > Statics.field2000) {
                                    var22 = Statics.field2000;
                                }
                                int var23 = class116.field1801;
                                if (var23 < 0) {
                                    var23 = 0;
                                } else if (var23 > Statics.field124) {
                                    var23 = Statics.field124;
                                }
                                int var24 = (int) var20;
                                field322.method2993(87);
                                field322.method2900((var24 << 1) + (class116.field1805 == 2 ? 1 : 0));
                                field322.method2900(var23);
                                field322.method2900(var22);
                            }
                            if (class106.field1717 > 0) {
                                field322.method2993(82);
                                field322.method2900(0);
                                int var25 = field322.field2267;
                                long var26 = class163.method225();
                                for (int var28 = 0; var28 < class106.field1717; var28++) {
                                    long var29 = var26 - field337;
                                    if (var29 > 16777215L) {
                                        var29 = 16777215L;
                                    }
                                    field337 = var26;
                                    field322.method2773((int) var29);
                                    field322.method2718(class106.field1716[var28]);
                                }
                                field322.method2862(field322.field2267 - var25);
                            }
                            if (field507 > 0) {
                                field507--;
                            }
                            if (class106.field1713[96] || class106.field1713[97] || class106.field1713[98] || class106.field1713[99]) {
                                field495 = true;
                            }
                            if (field495 && field507 <= 0) {
                                field507 = 20;
                                field495 = false;
                                field322.method2993(7);
                                field322.method2900(field363);
                                field322.method2767(field362);
                            }
                            if (Statics.field1631 && !field450) {
                                field450 = true;
                                field322.method2993(52);
                                field322.method2718(1);
                            }
                            if (!Statics.field1631 && field450) {
                                field450 = false;
                                field322.method2993(52);
                                field322.method2718(0);
                            }
                            if (Statics.field937 != field383) {
                                field383 = Statics.field937;
                                method3050(Statics.field937);
                            }
                            if (field308 == 30) {
                                method3051();
                                method1107();
                                field327++;
                                if (field327 > 750) {
                                    method17();
                                } else {
                                    int var31 = class46.field902;
                                    int[] var32 = class46.field903;
                                    for (int var33 = 0; var33 < var31; var33++) {
                                        class24 var34 = field399[var32[var33]];
                                        if (var34 != null) {
                                            method1310(var34, 1);
                                        }
                                    }
                                    for (int var35 = 0; var35 < field318; var35++) {
                                        int var36 = field555[var35];
                                        class36 var37 = field317[var36];
                                        if (var37 != null) {
                                            method1310(var37, var37.field764.field2988);
                                        }
                                    }
                                    method1804();
                                    field355++;
                                    if (field521 != 0) {
                                        field465 += 20;
                                        if (field465 >= 400) {
                                            field521 = 0;
                                        }
                                    }
                                    if (Statics.field709 != null) {
                                        field390++;
                                        if (field390 >= 15) {
                                            method29(Statics.field709);
                                            Statics.field709 = null;
                                        }
                                    }
                                    class151 var38 = Statics.field1908;
                                    class151 var39 = Statics.field1894;
                                    Statics.field1908 = null;
                                    Statics.field1894 = null;
                                    field455 = null;
                                    field459 = false;
                                    field389 = false;
                                    field501 = 0;
                                    while (true) {
                                        while (class106.method3605() && field501 < 128) {
                                            if (field397 >= 2 && class106.field1713[82] && Statics.field894 == 66) {
                                                String var40 = class48.method2948();
                                                Statics.field234.setContents(new StringSelection(var40), (ClipboardOwner) null);
                                            } else {
                                                field503[field501] = Statics.field894;
                                                field502[field501] = Statics.field274;
                                                field501++;
                                            }
                                        }
                                        if (field438 != -1) {
                                            method113(field438, 0, 0, Statics.field124, Statics.field2000, 0, 0);
                                        }
                                        field463++;
                                        while (true) {
                                            class19 var41;
                                            class151 var42;
                                            class151 var43;
                                            do {
                                                var41 = (class19) field478.method2223();
                                                if (var41 == null) {
                                                    while (true) {
                                                        class19 var44;
                                                        class151 var45;
                                                        class151 var46;
                                                        do {
                                                            var44 = (class19) field479.method2223();
                                                            if (var44 == null) {
                                                                while (true) {
                                                                    class19 var47;
                                                                    class151 var48;
                                                                    class151 var49;
                                                                    do {
                                                                        var47 = (class19) field477.method2223();
                                                                        if (var47 == null) {
                                                                            method609();
                                                                            if (Statics.field2666 == null && field451 == null) {
                                                                                int var50 = class116.field1805;
                                                                                if (field417) {
                                                                                    if (var50 != 1 && (Statics.field1810 || var50 != 4)) {
                                                                                        int var51 = class116.field1800;
                                                                                        int var52 = class116.field1795;
                                                                                        if (var51 < Statics.field2276 - 10 || var51 > Statics.field2276 + Statics.field1652 + 10 || var52 < Statics.field3167 - 10 || var52 > Statics.field3167 + Statics.field202 + 10) {
                                                                                            field417 = false;
                                                                                            method814(Statics.field2276, Statics.field3167, Statics.field1652, Statics.field202);
                                                                                        }
                                                                                    }
                                                                                    if (var50 == 1 || !Statics.field1810 && var50 == 4) {
                                                                                        int var53 = Statics.field2276;
                                                                                        int var54 = Statics.field3167;
                                                                                        int var55 = Statics.field1652;
                                                                                        int var56 = class116.field1801;
                                                                                        int var57 = class116.field1808;
                                                                                        int var58 = -1;
                                                                                        for (int var59 = 0; var59 < field418; var59++) {
                                                                                            int var60 = (field418 - 1 - var59) * 15 + var54 + 31;
                                                                                            if (var56 > var53 && var56 < var53 + var55 && var57 > var60 - 13 && var57 < var60 + 3) {
                                                                                                var58 = var59;
                                                                                            }
                                                                                        }
                                                                                        if (var58 != -1) {
                                                                                            method1124(var58);
                                                                                        }
                                                                                        field417 = false;
                                                                                        method814(Statics.field2276, Statics.field3167, Statics.field1652, Statics.field202);
                                                                                    }
                                                                                } else {
                                                                                    label1042: {
                                                                                        if ((var50 == 1 || !Statics.field1810 && var50 == 4) && field418 > 0) {
                                                                                            int var61 = field554[field418 - 1];
                                                                                            if (var61 == 39 || var61 == 40 || var61 == 41 || var61 == 42 || var61 == 43 || var61 == 33 || var61 == 34 || var61 == 35 || var61 == 36 || var61 == 37 || var61 == 38 || var61 == 1005) {
                                                                                                label1029: {
                                                                                                    int var62 = field424[field418 - 1];
                                                                                                    int var63 = field420[field418 - 1];
                                                                                                    class151 var64 = class151.method744(var63);
                                                                                                    int var65 = method1786(var64);
                                                                                                    boolean var66 = (var65 >> 28 & 0x1) != 0;
                                                                                                    if (!var66) {
                                                                                                        class152 var10000 = (class152) null;
                                                                                                        if (!class152.method692(method1786(var64))) {
                                                                                                            break label1029;
                                                                                                        }
                                                                                                    }
                                                                                                    if (Statics.field2666 != null && !field505 && field544 != 1 && !method199(field418 - 1) && field418 > 0) {
                                                                                                        int var67 = field393;
                                                                                                        int var68 = field498;
                                                                                                        class39 var69 = Statics.field159;
                                                                                                        method5(var69.field797, var69.field792, var69.field793, var69.field794, var69.field791, var69.field791, var67, var68);
                                                                                                        Statics.field159 = null;
                                                                                                    }
                                                                                                    field505 = false;
                                                                                                    field396 = 0;
                                                                                                    if (Statics.field2666 != null) {
                                                                                                        method29(Statics.field2666);
                                                                                                    }
                                                                                                    Statics.field2666 = class151.method744(var63);
                                                                                                    field392 = var62;
                                                                                                    field393 = class116.field1801;
                                                                                                    field498 = class116.field1808;
                                                                                                    if (field418 > 0) {
                                                                                                        method71(field418 - 1);
                                                                                                    }
                                                                                                    method29(Statics.field2666);
                                                                                                    break label1042;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ((var50 == 1 || !Statics.field1810 && var50 == 4) && (field544 == 1 && field418 > 2 || method199(field418 - 1))) {
                                                                                            var50 = 2;
                                                                                        }
                                                                                        if ((var50 == 1 || !Statics.field1810 && var50 == 4) && field418 > 0) {
                                                                                            method1124(field418 - 1);
                                                                                        }
                                                                                        if (var50 == 2 && field418 > 0) {
                                                                                            method640(class116.field1801, class116.field1808);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field451 != null) {
                                                                                method816();
                                                                            }
                                                                            if (Statics.field2666 != null) {
                                                                                method29(Statics.field2666);
                                                                                field396++;
                                                                                if (class116.field1806 == 0) {
                                                                                    if (field505) {
                                                                                        if (Statics.field3115 == Statics.field2666 && field392 != field382) {
                                                                                            class151 var70 = Statics.field2666;
                                                                                            byte var71 = 0;
                                                                                            if (field441 == 1 && var70.field2061 == 206) {
                                                                                                var71 = 1;
                                                                                            }
                                                                                            if (var70.field2168[field382] <= 0) {
                                                                                                var71 = 0;
                                                                                            }
                                                                                            if (class152.method692(method1786(var70))) {
                                                                                                int var72 = field392;
                                                                                                int var73 = field382;
                                                                                                var70.field2168[var73] = var70.field2168[var72];
                                                                                                var70.field2163[var73] = var70.field2163[var72];
                                                                                                var70.field2168[var72] = -1;
                                                                                                var70.field2163[var72] = 0;
                                                                                            } else if (var71 == 1) {
                                                                                                int var74 = field392;
                                                                                                int var75 = field382;
                                                                                                while (var74 != var75) {
                                                                                                    if (var74 > var75) {
                                                                                                        var70.method2589(var74 - 1, var74);
                                                                                                        var74--;
                                                                                                    } else if (var74 < var75) {
                                                                                                        var70.method2589(var74 + 1, var74);
                                                                                                        var74++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var70.method2589(field382, field392);
                                                                                            }
                                                                                            field322.method2993(105);
                                                                                            field322.method2767(field392);
                                                                                            field322.method2767(field382);
                                                                                            field322.method2838(var71);
                                                                                            field322.method2775(Statics.field2666.field2050);
                                                                                        }
                                                                                    } else if ((field544 == 1 || method199(field418 - 1)) && field418 > 2) {
                                                                                        method640(field393, field498);
                                                                                    } else if (field418 > 0) {
                                                                                        int var76 = field393;
                                                                                        int var77 = field498;
                                                                                        class39 var78 = Statics.field159;
                                                                                        method5(var78.field797, var78.field792, var78.field793, var78.field794, var78.field791, var78.field791, var76, var77);
                                                                                        Statics.field159 = null;
                                                                                    }
                                                                                    field390 = 10;
                                                                                    class116.field1805 = 0;
                                                                                    Statics.field2666 = null;
                                                                                } else if (field396 >= 5 && (class116.field1800 > field393 + 5 || class116.field1800 < field393 - 5 || class116.field1795 > field498 + 5 || class116.field1795 < field498 - 5)) {
                                                                                    field505 = true;
                                                                                }
                                                                            }
                                                                            if (class88.method1660()) {
                                                                                int var79 = class88.field1486;
                                                                                int var80 = class88.field1511;
                                                                                field322.method2993(233);
                                                                                field322.method2718(5);
                                                                                field322.method2765(Statics.field1792 + var79);
                                                                                field322.method2900(Statics.field663 + var80);
                                                                                field322.method2758(class106.field1713[82] ? (class106.field1713[81] ? 2 : 1) : 0);
                                                                                class88.method1706();
                                                                                field386 = class116.field1801;
                                                                                field387 = class116.field1808;
                                                                                field521 = 1;
                                                                                field465 = 0;
                                                                                field512 = var79;
                                                                                field524 = var80;
                                                                            }
                                                                            if (Statics.field1908 != var38) {
                                                                                if (var38 != null) {
                                                                                    method29(var38);
                                                                                }
                                                                                if (Statics.field1908 != null) {
                                                                                    method29(Statics.field1908);
                                                                                }
                                                                            }
                                                                            if (Statics.field1894 != var39 && field456 == field427) {
                                                                                if (var39 != null) {
                                                                                    method29(var39);
                                                                                }
                                                                                if (Statics.field1894 != null) {
                                                                                    method29(Statics.field1894);
                                                                                }
                                                                            }
                                                                            if (Statics.field1894 == null) {
                                                                                if (field427 > 0) {
                                                                                    field427--;
                                                                                }
                                                                            } else if (field427 < field456) {
                                                                                field427++;
                                                                                if (field456 == field427) {
                                                                                    method29(Statics.field1894);
                                                                                }
                                                                            }
                                                                            method96();
                                                                            if (field527) {
                                                                                int var81 = Statics.field892 * 128 + 64;
                                                                                int var82 = Statics.field1423 * 128 + 64;
                                                                                int var83 = method1789(var81, var82, Statics.field937) - Statics.field2836;
                                                                                if (Statics.field3056 < var81) {
                                                                                    Statics.field3056 += Statics.field241 * (var81 - Statics.field3056) / 1000 + Statics.field2283;
                                                                                    if (Statics.field3056 > var81) {
                                                                                        Statics.field3056 = var81;
                                                                                    }
                                                                                }
                                                                                if (Statics.field3056 > var81) {
                                                                                    Statics.field3056 -= Statics.field241 * (Statics.field3056 - var81) / 1000 + Statics.field2283;
                                                                                    if (Statics.field3056 < var81) {
                                                                                        Statics.field3056 = var81;
                                                                                    }
                                                                                }
                                                                                if (Statics.field716 < var83) {
                                                                                    Statics.field716 += Statics.field241 * (var83 - Statics.field716) / 1000 + Statics.field2283;
                                                                                    if (Statics.field716 > var83) {
                                                                                        Statics.field716 = var83;
                                                                                    }
                                                                                }
                                                                                if (Statics.field716 > var83) {
                                                                                    Statics.field716 -= Statics.field241 * (Statics.field716 - var83) / 1000 + Statics.field2283;
                                                                                    if (Statics.field716 < var83) {
                                                                                        Statics.field716 = var83;
                                                                                    }
                                                                                }
                                                                                if (Statics.field173 < var82) {
                                                                                    Statics.field173 += Statics.field241 * (var82 - Statics.field173) / 1000 + Statics.field2283;
                                                                                    if (Statics.field173 > var82) {
                                                                                        Statics.field173 = var82;
                                                                                    }
                                                                                }
                                                                                if (Statics.field173 > var82) {
                                                                                    Statics.field173 -= Statics.field241 * (Statics.field173 - var82) / 1000 + Statics.field2283;
                                                                                    if (Statics.field173 < var82) {
                                                                                        Statics.field173 = var82;
                                                                                    }
                                                                                }
                                                                                int var84 = Statics.field2636 * 128 + 64;
                                                                                int var85 = Statics.field1724 * 128 + 64;
                                                                                int var86 = method1789(var84, var85, Statics.field937) - Statics.field1570;
                                                                                int var87 = var84 - Statics.field3056;
                                                                                int var88 = var86 - Statics.field716;
                                                                                int var89 = var85 - Statics.field173;
                                                                                int var90 = (int) Math.sqrt((double) (var87 * var87 + var89 * var89));
                                                                                int var91 = (int) (Math.atan2((double) var88, (double) var90) * 325.949D) & 0x7FF;
                                                                                int var92 = (int) (Math.atan2((double) var87, (double) var89) * -325.949D) & 0x7FF;
                                                                                if (var91 < 128) {
                                                                                    var91 = 128;
                                                                                }
                                                                                if (var91 > 383) {
                                                                                    var91 = 383;
                                                                                }
                                                                                if (Statics.field2796 < var91) {
                                                                                    Statics.field2796 += Statics.field960 * (var91 - Statics.field2796) / 1000 + Statics.field400;
                                                                                    if (Statics.field2796 > var91) {
                                                                                        Statics.field2796 = var91;
                                                                                    }
                                                                                }
                                                                                if (Statics.field2796 > var91) {
                                                                                    Statics.field2796 -= Statics.field960 * (Statics.field2796 - var91) / 1000 + Statics.field400;
                                                                                    if (Statics.field2796 < var91) {
                                                                                        Statics.field2796 = var91;
                                                                                    }
                                                                                }
                                                                                int var93 = var92 - Statics.field37;
                                                                                if (var93 > 1024) {
                                                                                    var93 -= 2048;
                                                                                }
                                                                                if (var93 < -1024) {
                                                                                    var93 += 2048;
                                                                                }
                                                                                if (var93 > 0) {
                                                                                    Statics.field37 += Statics.field960 * var93 / 1000 + Statics.field400;
                                                                                    Statics.field37 &= 0x7FF;
                                                                                }
                                                                                if (var93 < 0) {
                                                                                    Statics.field37 -= Statics.field960 * -var93 / 1000 + Statics.field400;
                                                                                    Statics.field37 &= 0x7FF;
                                                                                }
                                                                                int var94 = var92 - Statics.field37;
                                                                                if (var94 > 1024) {
                                                                                    var94 -= 2048;
                                                                                }
                                                                                if (var94 < -1024) {
                                                                                    var94 += 2048;
                                                                                }
                                                                                if (var94 < 0 && var93 > 0 || var94 > 0 && var93 < 0) {
                                                                                    Statics.field37 = var92;
                                                                                }
                                                                            }
                                                                            for (int var95 = 0; var95 < 5; var95++) {
                                                                                int var10002 = field532[var95]++;
                                                                            }
                                                                            Statics.field914.method824();
                                                                            int var96 = ++class116.field1794 - 1;
                                                                            int var98 = class106.field1721;
                                                                            if (var96 > 15000 && var98 > 15000) {
                                                                                field332 = 250;
                                                                                class116.field1794 = 14500;
                                                                                field322.method2993(216);
                                                                            }
                                                                            field422++;
                                                                            if (field422 > 500) {
                                                                                field422 = 0;
                                                                                int var100 = (int) (Math.random() * 8.0D);
                                                                                if ((var100 & 0x1) == 1) {
                                                                                    field343 += field344;
                                                                                }
                                                                                if ((var100 & 0x2) == 2) {
                                                                                    field443 += field346;
                                                                                }
                                                                                if ((var100 & 0x4) == 4) {
                                                                                    field347 += field348;
                                                                                }
                                                                            }
                                                                            if (field343 < -50) {
                                                                                field344 = 2;
                                                                            }
                                                                            if (field343 > 50) {
                                                                                field344 = -2;
                                                                            }
                                                                            if (field443 < -55) {
                                                                                field346 = 2;
                                                                            }
                                                                            if (field443 > 55) {
                                                                                field346 = -2;
                                                                            }
                                                                            if (field347 < -40) {
                                                                                field348 = 1;
                                                                            }
                                                                            if (field347 > 40) {
                                                                                field348 = -1;
                                                                            }
                                                                            field342++;
                                                                            if (field342 > 500) {
                                                                                field342 = 0;
                                                                                int var101 = (int) (Math.random() * 8.0D);
                                                                                if ((var101 & 0x1) == 1) {
                                                                                    field536 += field351;
                                                                                }
                                                                                if ((var101 & 0x2) == 2) {
                                                                                    field352 += field353;
                                                                                }
                                                                            }
                                                                            if (field536 < -60) {
                                                                                field351 = 2;
                                                                            }
                                                                            if (field536 > 60) {
                                                                                field351 = -2;
                                                                            }
                                                                            if (field352 < -20) {
                                                                                field353 = 1;
                                                                            }
                                                                            if (field352 > 10) {
                                                                                field353 = -1;
                                                                            }
                                                                            for (class17 var102 = (class17) field410.method2257(); var102 != null; var102 = (class17) field410.method2258()) {
                                                                                if ((long) var102.field174 < class163.method225() / 1000L - 5L) {
                                                                                    if (var102.field176 > 0) {
                                                                                        class48.method888(5, "", var102.field168 + class174.field2589);
                                                                                    }
                                                                                    if (var102.field176 == 0) {
                                                                                        class48.method888(5, "", var102.field168 + class174.field2487);
                                                                                    }
                                                                                    var102.method2266();
                                                                                }
                                                                            }
                                                                            field328++;
                                                                            if (field328 > 50) {
                                                                                field322.method2993(212);
                                                                            }
                                                                            try {
                                                                                if (Statics.field2658 != null && field322.field2267 > 0) {
                                                                                    Statics.field2658.method1935(field322.field2258, 0, field322.field2267);
                                                                                    field322.field2267 = 0;
                                                                                    field328 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var104) {
                                                                                method17();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var48 = var47.field191;
                                                                        if (var48.field2051 < 0) {
                                                                            break;
                                                                        }
                                                                        var49 = class151.method744(var48.field2127);
                                                                    } while (var49 == null || var49.field2174 == null || var48.field2051 >= var49.field2174.length || var49.field2174[var48.field2051] != var48);
                                                                    class33.method119(var47);
                                                                }
                                                            }
                                                            var45 = var44.field191;
                                                            if (var45.field2051 < 0) {
                                                                break;
                                                            }
                                                            var46 = class151.method744(var45.field2127);
                                                        } while (var46 == null || var46.field2174 == null || var45.field2051 >= var46.field2174.length || var46.field2174[var45.field2051] != var45);
                                                        class33.method119(var44);
                                                    }
                                                }
                                                var42 = var41.field191;
                                                if (var42.field2051 < 0) {
                                                    break;
                                                }
                                                var43 = class151.method744(var42.field2127);
                                            } while (var43 == null || var43.field2174 == null || var42.field2051 >= var43.field2174.length || var43.field2174[var42.field2051] != var42);
                                            class33.method119(var41);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        field322.method2993(5);
                        field322.method2718(0);
                        int var8 = field322.field2267;
                        class228.method2702(field322);
                        field322.method2730(field322.field2267 - var8);
                    }
                }
            }
        } else if (field308 == 40 || field308 == 45) {
            method700();
        }
    }

    @ObfuscatedName("client.v(B)V")
    public final void method269() {
        boolean var1;
        label288: {
            try {
                if (class139.field1911 == 2) {
                    if (Statics.field1914 == null) {
                        Statics.field1914 = class145.method2520(Statics.field11, Statics.field1916, Statics.field972);
                        if (Statics.field1914 == null) {
                            var1 = false;
                            break label288;
                        }
                    }
                    if (Statics.field2025 == null) {
                        Statics.field2025 = new class61(Statics.field1909, Statics.field1912);
                    }
                    if (Statics.field1907.method2335(Statics.field1914, Statics.field1910, Statics.field2025, 22050)) {
                        Statics.field1907.method2429();
                        Statics.field1907.method2308(Statics.field1632);
                        Statics.field1907.method2313(Statics.field1914, Statics.field1913);
                        class139.field1911 = 0;
                        Statics.field1914 = null;
                        Statics.field2025 = null;
                        Statics.field11 = null;
                        var1 = true;
                        break label288;
                    }
                }
            } catch (Exception var34) {
                var34.printStackTrace();
                Statics.field1907.method2314();
                class139.field1911 = 0;
                Statics.field1914 = null;
                Statics.field2025 = null;
                Statics.field11 = null;
            }
            var1 = false;
        }
        if (var1 && field518 && Statics.field1945 != null) {
            Statics.field1945.method1041();
        }
        if (field308 == 10 || field308 == 20 || field308 == 30) {
            if (field485 != 0L && class163.method225() > field485) {
                int var4 = field492 ? 2 : 1;
                method733(var4);
            } else if (field1783) {
                method624();
            }
        }
        Dimension var5 = this.method1970();
        if (Statics.field85 != var5.width || Statics.field1085 != var5.height || field1779) {
            method885();
            field485 = class163.method225() + 500L;
            field1779 = false;
        }
        boolean var6 = false;
        if (field1777) {
            field1777 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field483[var7] = true;
            }
        }
        if (var6) {
            method821();
        }
        if (field308 == 0) {
            class114.method1379(class42.field850, class42.field840, (Color) null, var6);
        } else if (field308 == 5) {
            class42.method646(Statics.field177, Statics.field856, Statics.field962, var6);
        } else if (field308 == 10 || field308 == 11) {
            class42.method646(Statics.field177, Statics.field856, Statics.field962, var6);
        } else if (field308 == 20) {
            class42.method646(Statics.field177, Statics.field856, Statics.field962, var6);
        } else if (field308 == 25) {
            if (field338 == 1) {
                if (field280 > field335) {
                    field335 = field280;
                }
                int var8 = (field335 * 50 - field280 * 50) / field335;
                method1826(class174.field2351 + class38.field781 + class38.field784 + var8 + "%" + class38.field782, false);
            } else if (field338 == 2) {
                if (field336 > field466) {
                    field466 = field336;
                }
                int var9 = (field466 * 50 - field336 * 50) / field466 + 50;
                method1826(class174.field2351 + class38.field781 + class38.field784 + var9 + "%" + class38.field782, false);
            } else {
                method1826(class174.field2351, false);
            }
        } else if (field308 == 30) {
            if (field438 != -1) {
                method752(field438);
            }
            for (int var10 = 0; var10 < field289; var10++) {
                if (field483[var10]) {
                    field484[var10] = true;
                }
                field537[var10] = field483[var10];
                field483[var10] = false;
            }
            field482 = field454;
            field425 = -1;
            field426 = -1;
            Statics.field3115 = null;
            if (field438 != -1) {
                field289 = 0;
                method1899(field438, 0, 0, Statics.field124, Statics.field2000, 0, 0, -1);
            }
            class220.method3751();
            if (field417) {
                method1813();
            } else if (field425 != -1) {
                Statics.method75(field425, field426);
            }
            if (field490 == 3) {
                for (int var11 = 0; var11 < field289; var11++) {
                    if (field537[var11]) {
                        class220.method3757(field340[var11], field277[var11], field488[var11], field489[var11], 16711935, 128);
                    } else if (field484[var11]) {
                        class220.method3757(field340[var11], field277[var11], field488[var11], field489[var11], 16711680, 128);
                    }
                }
            }
            int var12 = Statics.field937;
            int var13 = Statics.field1425.field619;
            int var14 = Statics.field1425.field609;
            int var15 = field355;
            for (class32 var16 = (class32) class32.field694.method2243(); var16 != null; var16 = (class32) class32.field694.method2238()) {
                if (var16.field695 != -1 || var16.field696 != null) {
                    int var17 = 0;
                    if (var13 > var16.field697) {
                        var17 += var13 - var16.field697;
                    } else if (var13 < var16.field700) {
                        var17 += var16.field700 - var13;
                    }
                    if (var14 > var16.field705) {
                        var17 += var14 - var16.field705;
                    } else if (var14 < var16.field693) {
                        var17 += var16.field693 - var14;
                    }
                    if (var17 - 64 > var16.field699 || field513 == 0 || var16.field704 != var12) {
                        if (var16.field701 != null) {
                            Statics.field2291.method892(var16.field701);
                            var16.field701 = null;
                        }
                        if (var16.field706 != null) {
                            Statics.field2291.method892(var16.field706);
                            var16.field706 = null;
                        }
                    } else {
                        var17 -= 64;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = field513 * (var16.field699 - var17) / var16.field699;
                        class54 var10000;
                        if (var16.field701 != null) {
                            var16.field701.method1147(var18);
                        } else if (var16.field695 >= 0) {
                            var10000 = (class54) null;
                            class54 var19 = class54.method959(Statics.field153, var16.field695, 0);
                            if (var19 != null) {
                                class56 var20 = var19.method953().method999(Statics.field238);
                                class67 var21 = class67.method1240(var20, 100, var18);
                                var21.method1146(-1);
                                Statics.field2291.method891(var21);
                                var16.field701 = var21;
                            }
                        }
                        if (var16.field706 != null) {
                            var16.field706.method1147(var18);
                            if (!var16.field706.method2213()) {
                                var16.field706 = null;
                            }
                        } else if (var16.field696 != null && (var16.field698 -= var15) <= 0) {
                            int var22 = (int) (Math.random() * (double) var16.field696.length);
                            var10000 = (class54) null;
                            class54 var23 = class54.method959(Statics.field153, var16.field696[var22], 0);
                            if (var23 != null) {
                                class56 var24 = var23.method953().method999(Statics.field238);
                                class67 var25 = class67.method1240(var24, 100, var18);
                                var25.method1146(0);
                                Statics.field2291.method891(var25);
                                var16.field706 = var25;
                                var16.field698 = var16.field702 + (int) (Math.random() * (double) (var16.field703 - var16.field702));
                            }
                        }
                    }
                }
            }
            field355 = 0;
        } else if (field308 == 40) {
            method1826(class174.field2497 + class38.field781 + class174.field2353, false);
        } else if (field308 == 45) {
            method1826(class174.field2455, false);
        }
        if (field308 == 30 && field490 == 0 && !var6) {
            try {
                Graphics var26 = Statics.field729.getGraphics();
                for (int var27 = 0; var27 < field289; var27++) {
                    if (field484[var27]) {
                        Statics.field144.method3740(var26, field340[var27], field277[var27], field488[var27], field489[var27]);
                        field484[var27] = false;
                    }
                }
            } catch (Exception var33) {
                Statics.field729.repaint();
            }
        } else if (field308 > 0) {
            try {
                Graphics var29 = Statics.field729.getGraphics();
                Statics.field144.method3739(var29, 0, 0);
                for (int var30 = 0; var30 < field289; var30++) {
                    field484[var30] = false;
                }
            } catch (Exception var32) {
                Statics.field729.repaint();
            }
        }
    }

    @ObfuscatedName("client.a(I)V")
    public final void method546() {
        if (Statics.field914.method829()) {
            Statics.field914.method826();
        }
        if (Statics.field1558 != null) {
            Statics.field1558.field216 = false;
        }
        Statics.field1558 = null;
        if (Statics.field2658 != null) {
            Statics.field2658.method1945();
            Statics.field2658 = null;
        }
        if (class106.field1701 != null) {
            class106 var1 = class106.field1701;
            synchronized (class106.field1701) {
                class106.field1701 = null;
            }
        }
        class116.method111();
        Statics.field77 = null;
        if (Statics.field1945 != null) {
            Statics.field1945.method1033();
        }
        if (Statics.field761 != null) {
            Statics.field761.method1033();
        }
        class186.method1855();
        Object var3 = class184.field2713;
        synchronized (class184.field2713) {
            if (class184.field2716 != 0) {
                class184.field2716 = 1;
                try {
                    class184.field2713.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class105.method1928();
    }

    @ObfuscatedName("g.h(II)V")
    public static void method168(int arg0) {
        if (field308 == arg0) {
            return;
        }
        if (field308 == 0) {
            class114.method1097();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field547 = 0;
            field313 = 0;
            field314 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2309 != null) {
            Statics.field2309.method1945();
            Statics.field2309 = null;
        }
        if (field308 == 25) {
            field338 = 0;
            field280 = 0;
            field335 = 1;
            field336 = 0;
            field466 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method746(Statics.field729, Statics.field2629, Statics.field148, true, 0);
        } else if (arg0 == 20) {
            class42.method746(Statics.field729, Statics.field2629, Statics.field148, true, field308 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method746(Statics.field729, Statics.field2629, Statics.field148, false, 4);
        } else if (Statics.field846) {
            Statics.field822 = null;
            Statics.field821 = null;
            Statics.field824 = null;
            Statics.field2210 = null;
            Statics.field2033 = null;
            Statics.field12 = null;
            Statics.field825 = null;
            Statics.field1080 = null;
            Statics.field2678 = null;
            Statics.field3252 = null;
            Statics.field2856 = null;
            Statics.field1053 = null;
            Statics.field1679 = null;
            Statics.field71 = null;
            Statics.field48 = null;
            Statics.field3072 = null;
            Statics.field830 = null;
            Statics.field829 = null;
            Statics.field1084 = null;
            Statics.field1819 = null;
            Statics.field848 = null;
            Statics.field834 = null;
            class139.method1852(2);
            class186.method1788(true);
            Statics.field846 = false;
        }
        field308 = arg0;
    }

    @ObfuscatedName("client.p(I)V")
    public void method464() {
        if (field308 != 1000) {
            boolean var1 = class186.method815();
            if (!var1) {
                this.method359();
            }
        }
    }

    @ObfuscatedName("client.t(B)V")
    public void method359() {
        if (class186.field2746 >= 4) {
            this.method1969("js5crc");
            field308 = 1000;
            return;
        }
        if (class186.field2747 >= 4) {
            if (field308 <= 5) {
                this.method1969("js5io");
                field308 = 1000;
                return;
            }
            field309 = 3000;
            class186.field2747 = 3;
        }
        if (--field309 + 1 > 0) {
            return;
        }
        try {
            if (field356 == 0) {
                Statics.field175 = Statics.field1094.method1830(Statics.field94, Statics.field493);
                field356++;
            }
            if (field356 == 1) {
                if (Statics.field175.field1668 == 2) {
                    this.method273(-1);
                    return;
                }
                if (Statics.field175.field1668 == 1) {
                    field356++;
                }
            }
            if (field356 == 2) {
                Statics.field45 = new class111((Socket) Statics.field175.field1676, Statics.field1094);
                class161 var1 = new class161(5);
                var1.method2718(15);
                var1.method2863(133);
                Statics.field45.method1935(var1.field2258, 0, 5);
                field356++;
                Statics.field2800 = class163.method225();
            }
            if (field356 == 3) {
                if (field308 <= 5 || Statics.field45.method1933() > 0) {
                    int var2 = Statics.field45.method1930();
                    if (var2 != 0) {
                        this.method273(var2);
                        return;
                    }
                    field356++;
                } else if (class163.method225() - Statics.field2800 > 30000L) {
                    this.method273(-2);
                    return;
                }
            }
            if (field356 == 4) {
                class111 var3 = Statics.field45;
                boolean var4 = field308 > 20;
                if (Statics.field2749 != null) {
                    try {
                        Statics.field2749.method1945();
                    } catch (Exception var14) {
                    }
                    Statics.field2749 = null;
                }
                Statics.field2749 = var3;
                class186.method1788(var4);
                class186.field2745.field2267 = 0;
                Statics.field1763 = null;
                Statics.field750 = null;
                class186.field2736 = 0;
                while (true) {
                    class182 var6 = (class182) class186.field2734.method2174();
                    if (var6 == null) {
                        while (true) {
                            class182 var7 = (class182) class186.field2741.method2174();
                            if (var7 == null) {
                                if (class186.field2729 != 0) {
                                    try {
                                        class161 var8 = new class161(4);
                                        var8.method2718(4);
                                        var8.method2718(class186.field2729);
                                        var8.method2900(0);
                                        Statics.field2749.method1935(var8.field2258, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2749.method1945();
                                        } catch (Exception var12) {
                                        }
                                        class186.field2747++;
                                        Statics.field2749 = null;
                                    }
                                }
                                class186.field2739 = 0;
                                Statics.field2731 = class163.method225();
                                Statics.field175 = null;
                                Statics.field45 = null;
                                field356 = 0;
                                field311 = 0;
                                return;
                            }
                            class186.field2730.method2130(var7);
                            class186.field2742.method2173(var7, var7.field1874);
                            class186.field2732++;
                            class186.field2740--;
                        }
                    }
                    class186.field2737.method2173(var6, var6.field1874);
                    class186.field2733++;
                    class186.field2735--;
                }
            }
        } catch (IOException var15) {
            this.method273(-3);
        }
    }

    @ObfuscatedName("client.f(II)V")
    public void method273(int arg0) {
        Statics.field175 = null;
        Statics.field45 = null;
        field356 = 0;
        if (Statics.field493 == Statics.field2217) {
            Statics.field493 = Statics.field55;
        } else {
            Statics.field493 = Statics.field2217;
        }
        field311++;
        if (field311 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field308 <= 5) {
                this.method1969("js5connect_full");
                field308 = 1000;
            } else {
                field309 = 3000;
            }
        } else if (field311 >= 2 && arg0 == 6) {
            this.method1969("js5connect_outofdate");
            field308 = 1000;
        } else if (field311 >= 4) {
            if (field308 <= 5) {
                this.method1969("js5connect");
                field308 = 1000;
            } else {
                field309 = 3000;
            }
        }
    }

    @ObfuscatedName("gt.z(I)V")
    public static void method3238() {
        if (field295 == 0) {
            Statics.field1114 = new class88(4, 104, 104, class12.field115);
            for (int var0 = 0; var0 < 4; var0++) {
                field339[var0] = new class118(104, 104);
            }
            Statics.field57 = new class225(512, 512);
            class42.field840 = class174.field2354;
            class42.field850 = 5;
            field295 = 20;
        } else if (field295 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1429[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1656(var1, 500, 800, 512, 334);
            class42.field840 = class174.field2355;
            class42.field850 = 10;
            field295 = 30;
        } else if (field295 == 30) {
            Statics.field2192 = method186(0, false, true, true);
            Statics.field3 = method186(1, false, true, true);
            Statics.field354 = method186(2, true, false, true);
            Statics.field2298 = method186(3, false, true, true);
            Statics.field153 = method186(4, false, true, true);
            Statics.field787 = method186(5, true, true, true);
            Statics.field924 = method186(6, true, true, false);
            Statics.field2331 = method186(7, false, true, true);
            Statics.field148 = method186(8, false, true, true);
            Statics.field2325 = method186(9, false, true, true);
            Statics.field2629 = method186(10, false, true, true);
            Statics.field110 = method186(11, false, true, true);
            Statics.field1764 = method186(12, false, true, true);
            Statics.field575 = method186(13, true, false, true);
            Statics.field1850 = method186(14, false, true, false);
            Statics.field1687 = method186(15, false, true, true);
            class42.field840 = class174.field2356;
            class42.field850 = 20;
            field295 = 40;
        } else if (field295 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2192.method3155() * 4 / 100;
            int var8 = var7 + Statics.field3.method3155() * 4 / 100;
            int var9 = var8 + Statics.field354.method3155() * 2 / 100;
            int var10 = var9 + Statics.field2298.method3155() * 2 / 100;
            int var11 = var10 + Statics.field153.method3155() * 6 / 100;
            int var12 = var11 + Statics.field787.method3155() * 4 / 100;
            int var13 = var12 + Statics.field924.method3155() * 2 / 100;
            int var14 = var13 + Statics.field2331.method3155() * 60 / 100;
            int var15 = var14 + Statics.field148.method3155() * 2 / 100;
            int var16 = var15 + Statics.field2325.method3155() * 2 / 100;
            int var17 = var16 + Statics.field2629.method3155() * 2 / 100;
            int var18 = var17 + Statics.field110.method3155() * 2 / 100;
            int var19 = var18 + Statics.field1764.method3155() * 2 / 100;
            int var20 = var19 + Statics.field575.method3155() * 2 / 100;
            int var21 = var20 + Statics.field1850.method3155() * 2 / 100;
            int var22 = var21 + Statics.field1687.method3155() * 2 / 100;
            if (var22 == 100) {
                class42.field840 = class174.field2563;
                class42.field850 = 30;
                field295 = 45;
            } else {
                if (var22 != 0) {
                    class42.field840 = class174.field2357 + var22 + "%";
                }
                class42.field850 = 30;
            }
        } else if (field295 == 45) {
            boolean var23 = !field279;
            Statics.field1046 = 22050;
            Statics.field1058 = var23;
            Statics.field2921 = 2;
            class140 var24 = new class140();
            var24.method2378(9, 128);
            Statics.field1945 = class58.method31(Statics.field1094, Statics.field729, 0, 22050);
            Statics.field1945.method1029(var24);
            class139.method2430(Statics.field1687, Statics.field1850, Statics.field153, var24);
            Statics.field761 = class58.method31(Statics.field1094, Statics.field729, 1, 2048);
            Statics.field2291 = new class52();
            Statics.field761.method1029(Statics.field2291);
            Statics.field238 = new class66(22050, Statics.field1046);
            class42.field840 = class174.field2604;
            class42.field850 = 35;
            field295 = 50;
        } else if (field295 == 50) {
            int var25 = 0;
            if (Statics.field856 == null) {
                Statics.field856 = class226.method1799(Statics.field148, Statics.field575, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field962 == null) {
                Statics.field962 = class226.method1799(Statics.field148, Statics.field575, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field177 == null) {
                Statics.field177 = class226.method1799(Statics.field148, Statics.field575, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class42.field840 = class174.field2442 + var25 * 100 / 3 + "%";
                class42.field850 = 40;
            } else {
                Statics.field3053 = new class231(true);
                class42.field840 = class174.field2361;
                class42.field850 = 40;
                field295 = 60;
            }
        } else if (field295 == 60) {
            class185 var26 = Statics.field2629;
            class185 var27 = Statics.field148;
            int var28 = 0;
            if (var26.method3083("title.jpg", "")) {
                var28++;
            }
            if (var27.method3083("logo", "")) {
                var28++;
            }
            if (var27.method3083("logo_deadman_mode", "")) {
                var28++;
            }
            if (var27.method3083("titlebox", "")) {
                var28++;
            }
            if (var27.method3083("titlebutton", "")) {
                var28++;
            }
            if (var27.method3083("runes", "")) {
                var28++;
            }
            if (var27.method3083("title_mute", "")) {
                var28++;
            }
            if (var27.method3084("options_radio_buttons,0")) {
                var28++;
            }
            if (var27.method3084("options_radio_buttons,2")) {
                var28++;
            }
            var27.method3083("sl_back", "");
            var27.method3083("sl_flags", "");
            var27.method3083("sl_arrows", "");
            var27.method3083("sl_stars", "");
            var27.method3083("sl_button", "");
            byte var31 = 9;
            if (var28 < var31) {
                class42.field840 = class174.field2603 + var28 * 100 / var31 + "%";
                class42.field850 = 50;
            } else {
                class42.field840 = class174.field2363;
                class42.field850 = 50;
                method168(5);
                field295 = 70;
            }
        } else if (field295 == 70) {
            if (Statics.field354.method3069()) {
                class201.method1798(Statics.field354);
                class185 var33 = Statics.field354;
                Statics.field2793 = var33;
                class185 var34 = Statics.field354;
                class185 var35 = Statics.field2331;
                Statics.field2804 = var34;
                Statics.field2801 = var35;
                Statics.field2811 = Statics.field2804.method3075(3);
                class198.method2036(Statics.field354, Statics.field2331, field279);
                class200.method1924(Statics.field354, Statics.field2331);
                class185 var36 = Statics.field354;
                class185 var37 = Statics.field2331;
                boolean var38 = field284;
                class209 var39 = Statics.field856;
                Statics.field3080 = var36;
                Statics.field2931 = var37;
                Statics.field2932 = var38;
                Statics.field925 = Statics.field3080.method3075(10);
                Statics.field3071 = var39;
                class185 var40 = Statics.field354;
                class185 var41 = Statics.field2192;
                class185 var42 = Statics.field3;
                Statics.field3046 = var40;
                Statics.field3049 = var41;
                Statics.field3035 = var42;
                class185 var43 = Statics.field354;
                class185 var44 = Statics.field2331;
                Statics.field2774 = var43;
                Statics.field2778 = var44;
                class195.method2031(Statics.field354);
                class185 var45 = Statics.field354;
                Statics.field2760 = var45;
                Statics.field2756 = Statics.field2760.method3075(16);
                class185 var46 = Statics.field2298;
                class185 var47 = Statics.field2331;
                class185 var48 = Statics.field148;
                class185 var49 = Statics.field575;
                Statics.field2214 = var46;
                Statics.field1725 = var47;
                Statics.field3110 = var48;
                Statics.field897 = var49;
                Statics.field2043 = new class151[Statics.field2214.method3062()][];
                Statics.field2172 = new boolean[Statics.field2214.method3062()];
                class185 var50 = Statics.field354;
                Statics.field2751 = var50;
                class196.method124(Statics.field354);
                class189.method3273(Statics.field354);
                class185 var51 = Statics.field354;
                Statics.field2770 = var51;
                Statics.field914 = new class47();
                class197.method3005(Statics.field354, Statics.field148, Statics.field575);
                class185 var52 = Statics.field354;
                class185 var53 = Statics.field148;
                Statics.field2827 = var52;
                Statics.field2816 = var53;
                class42.field840 = class174.field2365;
                class42.field850 = 60;
                field295 = 80;
            } else {
                class42.field840 = class174.field2364 + Statics.field354.method3161() + "%";
                class42.field850 = 60;
            }
        } else if (field295 == 80) {
            int var54 = 0;
            if (Statics.field181 == null) {
                class185 var55 = Statics.field148;
                int var56 = var55.method3076("compass");
                int var57 = var55.method3077(var56, "");
                class225 var58 = class226.method1109(var55, var56, var57);
                Statics.field181 = var58;
            } else {
                var54++;
            }
            if (Statics.field2753 == null) {
                class185 var59 = Statics.field148;
                int var60 = var59.method3076("mapedge");
                int var61 = var59.method3077(var60, "");
                class225 var62 = class226.method1109(var59, var60, var61);
                Statics.field2753 = var62;
            } else {
                var54++;
            }
            if (Statics.field235 == null) {
                Statics.field235 = class226.method1619(Statics.field148, "mapscene", "");
            } else {
                var54++;
            }
            if (Statics.field1649 == null) {
                Statics.field1649 = class226.method623(Statics.field148, "mapfunction", "");
            } else {
                var54++;
            }
            if (Statics.field1667 == null) {
                Statics.field1667 = class226.method623(Statics.field148, "headicons_pk", "");
            } else {
                var54++;
            }
            if (Statics.field1592 == null) {
                Statics.field1592 = class226.method623(Statics.field148, "headicons_prayer", "");
            } else {
                var54++;
            }
            if (Statics.field964 == null) {
                Statics.field964 = class226.method623(Statics.field148, "headicons_hint", "");
            } else {
                var54++;
            }
            if (Statics.field53 == null) {
                Statics.field53 = class226.method623(Statics.field148, "mapmarker", "");
            } else {
                var54++;
            }
            if (Statics.field743 == null) {
                Statics.field743 = class226.method623(Statics.field148, "cross", "");
            } else {
                var54++;
            }
            if (Statics.field240 == null) {
                Statics.field240 = class226.method623(Statics.field148, "mapdots", "");
            } else {
                var54++;
            }
            if (Statics.field3220 == null) {
                Statics.field3220 = class226.method1619(Statics.field148, "scrollbar", "");
            } else {
                var54++;
            }
            if (Statics.field1700 == null) {
                Statics.field1700 = class226.method1619(Statics.field148, "mod_icons", "");
            } else {
                var54++;
            }
            if (var54 < 12) {
                class42.field840 = class174.field2465 + var54 * 100 / 12 + "%";
                class42.field850 = 70;
            } else {
                Statics.field3091 = Statics.field1700;
                Statics.field2753.method3938();
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 41.0D) - 20;
                for (int var67 = 0; var67 < Statics.field1649.length; var67++) {
                    Statics.field1649[var67].method3859(var63 + var66, var64 + var66, var65 + var66);
                }
                Statics.field235[0].method3828(var63 + var66, var64 + var66, var65 + var66);
                class42.field840 = class174.field2540;
                class42.field850 = 70;
                field295 = 90;
            }
        } else if (field295 == 90) {
            if (Statics.field2325.method3069()) {
                class75 var68 = new class75(Statics.field2325, Statics.field148, 20, 0.8D, field279 ? 64 : 128);
                class85.method1561(var68);
                class85.method1562(0.8D);
                class42.field840 = class174.field2369;
                class42.field850 = 90;
                field295 = 110;
            } else {
                class42.field840 = class174.field2368 + Statics.field2325.method3161() + "%";
                class42.field850 = 90;
            }
        } else if (field295 == 110) {
            Statics.field1558 = new class21();
            Statics.field1094.method1831(Statics.field1558, 10);
            class42.field840 = class174.field2370;
            class42.field850 = 94;
            field295 = 120;
        } else if (field295 == 120) {
            if (Statics.field2629.method3083("huffman", "")) {
                class153 var69 = new class153(Statics.field2629.method3133("huffman", ""));
                Statics.method3177(var69);
                class42.field840 = class174.field2372;
                class42.field850 = 96;
                field295 = 130;
            } else {
                class42.field840 = class174.field2371 + "%";
                class42.field850 = 96;
            }
        } else if (field295 == 130) {
            if (!Statics.field2298.method3069()) {
                class42.field840 = class174.field2373 + Statics.field2298.method3161() * 4 / 5 + "%";
                class42.field850 = 100;
            } else if (!Statics.field1764.method3069()) {
                class42.field840 = class174.field2373 + (80 + Statics.field1764.method3161() / 6) + "%";
                class42.field850 = 100;
            } else if (Statics.field575.method3069()) {
                class42.field840 = class174.field2374;
                class42.field850 = 100;
                field295 = 140;
            } else {
                class42.field840 = class174.field2373 + (96 + Statics.field575.method3161() / 20) + "%";
                class42.field850 = 100;
            }
        } else if (field295 == 140) {
            method168(10);
        }
    }

    @ObfuscatedName("i.u(IZZZI)Lgf;")
    public static class185 method186(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1695 != null) {
            var4 = new class117(arg0, class105.field1695, Statics.field121[arg0], 1000000);
        }
        return new class185(var4, Statics.field1685, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aa.b(I)V")
    public static final void method700() {
        try {
            if (field547 == 0) {
                if (Statics.field2658 != null) {
                    Statics.field2658.method1945();
                    Statics.field2658 = null;
                }
                Statics.field2024 = null;
                field333 = false;
                field313 = 0;
                field547 = 1;
            }
            if (field547 == 1) {
                if (Statics.field2024 == null) {
                    Statics.field2024 = Statics.field1094.method1830(Statics.field94, Statics.field493);
                }
                if (Statics.field2024.field1668 == 2) {
                    throw new IOException();
                }
                if (Statics.field2024.field1668 == 1) {
                    Statics.field2658 = new class111((Socket) Statics.field2024.field1676, Statics.field1094);
                    Statics.field2024 = null;
                    field547 = 2;
                }
            }
            if (field547 == 2) {
                field322.field2267 = 0;
                field322.method2718(14);
                Statics.field2658.method1935(field322.field2258, 0, 1);
                field324.field2267 = 0;
                field547 = 3;
            }
            if (field547 == 3) {
                if (Statics.field1945 != null) {
                    Statics.field1945.method1069();
                }
                if (Statics.field761 != null) {
                    Statics.field761.method1069();
                }
                int var0 = Statics.field2658.method1930();
                if (Statics.field1945 != null) {
                    Statics.field1945.method1069();
                }
                if (Statics.field761 != null) {
                    Statics.field761.method1069();
                }
                if (var0 != 0) {
                    method1917(var0);
                    return;
                }
                field324.field2267 = 0;
                field547 = 5;
            }
            if (field547 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field322.field2267 = 0;
                field322.method2718(1);
                field322.method2718(class42.field855.method755());
                field322.method2863(var1[0]);
                field322.method2863(var1[1]);
                field322.method2863(var1[2]);
                field322.method2863(var1[3]);
                switch(class42.field855.field1627) {
                    case 0:
                    case 2:
                        field322.method2720(Statics.field28);
                        field322.field2267 += 5;
                        break;
                    case 1:
                        field322.method2863((Integer) Statics.field1457.field689.get(class208.method1475(class42.field841)));
                        field322.field2267 += 4;
                        break;
                    case 3:
                        field322.field2267 += 8;
                }
                field322.method2903(class42.field845);
                field322.method2910(class40.field807, class40.field800);
                field323.field2267 = 0;
                if (field308 == 40) {
                    field323.method2718(18);
                } else {
                    field323.method2718(16);
                }
                field323.method2900(0);
                int var2 = field323.field2267;
                field323.method2863(133);
                field323.method2727(field322.field2258, 0, field322.field2267);
                int var3 = field323.field2267;
                field323.method2903(class42.field841);
                field323.method2718((field492 ? 1 : 0) << 1 | (field279 ? 1 : 0));
                field323.method2900(Statics.field124);
                field323.method2900(Statics.field2000);
                class105.method874(field323);
                field323.method2903(Statics.field13);
                field323.method2863(Statics.field1686);
                class161 var4 = new class161(Statics.field3053.method4007());
                Statics.field3053.method4011(var4);
                field323.method2727(var4.field2258, 0, var4.field2258.length);
                field323.method2718(Statics.field3085);
                field323.method2863(0);
                field323.method2863(Statics.field2192.field2707);
                field323.method2863(Statics.field3.field2707);
                field323.method2863(Statics.field354.field2707);
                field323.method2863(Statics.field2298.field2707);
                field323.method2863(Statics.field153.field2707);
                field323.method2863(Statics.field787.field2707);
                field323.method2863(Statics.field924.field2707);
                field323.method2863(Statics.field2331.field2707);
                field323.method2863(Statics.field148.field2707);
                field323.method2863(Statics.field2325.field2707);
                field323.method2863(Statics.field2629.field2707);
                field323.method2863(Statics.field110.field2707);
                field323.method2863(Statics.field1764.field2707);
                field323.method2863(Statics.field575.field2707);
                field323.method2863(Statics.field1850.field2707);
                field323.method2863(Statics.field1687.field2707);
                field323.method2751(var1, var3, field323.field2267);
                field323.method2862(field323.field2267 - var2);
                Statics.field2658.method1935(field323.field2258, 0, field323.field2267);
                field322.method2972(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field324.method2972(var1);
                field547 = 6;
            }
            if (field547 == 6 && Statics.field2658.method1933() > 0) {
                int var6 = Statics.field2658.method1930();
                if (var6 == 21 && field308 == 20) {
                    field547 = 7;
                } else if (var6 == 2) {
                    field547 = 9;
                } else if (var6 == 15 && field308 == 40) {
                    field325 = -1;
                    field547 = 13;
                } else if (var6 == 23 && field314 < 1) {
                    field314++;
                    field547 = 0;
                } else if (var6 == 29) {
                    field547 = 11;
                } else {
                    method1917(var6);
                    return;
                }
            }
            if (field547 == 7 && Statics.field2658.method1933() > 0) {
                field320 = (Statics.field2658.method1930() + 3) * 60;
                field547 = 8;
            }
            if (field547 == 8) {
                field313 = 0;
                class42.method2568(class174.field2378, class174.field2379, field320 / 60 + class174.field2411);
                if (--field320 <= 0) {
                    field547 = 0;
                }
            } else {
                if (field547 == 9 && Statics.field2658.method1933() >= 13) {
                    boolean var7 = Statics.field2658.method1930() == 1;
                    Statics.field2658.method1934(field324.field2258, 0, 4);
                    field324.field2267 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field324.method2988() << 24;
                        int var10 = var9 | field324.method2988() << 16;
                        int var11 = var10 | field324.method2988() << 8;
                        int var12 = var11 | field324.method2988();
                        int var13 = class208.method1475(class42.field841);
                        if (Statics.field1457.field689.size() >= 10 && !Statics.field1457.field689.containsKey(var13)) {
                            Iterator var14 = Statics.field1457.field689.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1457.field689.put(var13, var12);
                        class31.method40();
                    }
                    field397 = Statics.field2658.method1930();
                    field447 = Statics.field2658.method1930() == 1;
                    field473 = Statics.field2658.method1930();
                    field473 <<= 0x8;
                    field473 += Statics.field2658.method1930();
                    field504 = Statics.field2658.method1930();
                    Statics.field2658.method1934(field324.field2258, 0, 1);
                    field324.field2267 = 0;
                    field287 = field324.method2988();
                    Statics.field2658.method1934(field324.field2258, 0, 2);
                    field324.field2267 = 0;
                    field325 = field324.method2735();
                    try {
                        class101.method1815(Statics.field278, "zap");
                    } catch (Throwable var41) {
                    }
                    field547 = 10;
                }
                if (field547 != 10) {
                    if (field547 == 11 && Statics.field2658.method1933() >= 2) {
                        field324.field2267 = 0;
                        Statics.field2658.method1934(field324.field2258, 0, 2);
                        field324.field2267 = 0;
                        Statics.field2717 = field324.method2735();
                        field547 = 12;
                    }
                    if (field547 == 12 && Statics.field2658.method1933() >= Statics.field2717) {
                        field324.field2267 = 0;
                        Statics.field2658.method1934(field324.field2258, 0, Statics.field2717);
                        field324.field2267 = 0;
                        String var30 = field324.method2740();
                        String var31 = field324.method2740();
                        String var32 = field324.method2740();
                        class42.method2568(var30, var31, var32);
                        method168(10);
                    }
                    if (field547 == 13) {
                        if (field325 == -1) {
                            if (Statics.field2658.method1933() < 2) {
                                return;
                            }
                            Statics.field2658.method1934(field324.field2258, 0, 2);
                            field324.field2267 = 0;
                            field325 = field324.method2735();
                        }
                        if (Statics.field2658.method1933() >= field325) {
                            Statics.field2658.method1934(field324.field2258, 0, field325);
                            field324.field2267 = 0;
                            int var33 = field325;
                            field322.field2267 = 0;
                            field324.field2267 = 0;
                            field287 = -1;
                            field285 = -1;
                            field330 = -1;
                            field331 = -1;
                            field325 = 0;
                            field327 = 0;
                            field326 = 0;
                            field418 = 0;
                            field417 = false;
                            field515 = 0;
                            field512 = 0;
                            for (int var34 = 0; var34 < 2048; var34++) {
                                field399[var34] = null;
                            }
                            Statics.field1425 = null;
                            for (int var35 = 0; var35 < field317.length; var35++) {
                                class36 var36 = field317[var35];
                                if (var36 != null) {
                                    var36.field627 = -1;
                                    var36.field618 = false;
                                }
                            }
                            class13.method823();
                            method168(30);
                            for (int var37 = 0; var37 < 100; var37++) {
                                field483[var37] = true;
                            }
                            field322.method2993(245);
                            class167 var38 = field322;
                            int var39 = field492 ? 2 : 1;
                            var38.method2718(var39);
                            field322.method2900(Statics.field124);
                            field322.method2900(Statics.field2000);
                            class46.method622(field324);
                            if (field324.field2267 != var33) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field313++;
                        if (field313 > 2000) {
                            if (field314 < 1) {
                                if (Statics.field493 == Statics.field2217) {
                                    Statics.field493 = Statics.field55;
                                } else {
                                    Statics.field493 = Statics.field2217;
                                }
                                field314++;
                                field547 = 0;
                            } else {
                                method1917(-3);
                            }
                        }
                    }
                } else if (Statics.field2658.method1933() >= field325) {
                    field324.field2267 = 0;
                    Statics.field2658.method1934(field324.field2258, 0, field325);
                    field290 = 1L;
                    field366 = -1;
                    Statics.field1558.field212 = 0;
                    Statics.field1631 = true;
                    field450 = true;
                    field337 = -1L;
                    class228.field3233 = new class127();
                    field322.field2267 = 0;
                    field324.field2267 = 0;
                    field287 = -1;
                    field285 = -1;
                    field330 = -1;
                    field331 = -1;
                    field327 = 0;
                    field326 = 0;
                    field332 = 0;
                    field297 = 0;
                    field418 = 0;
                    field417 = false;
                    class116.field1794 = 0;
                    class48.field928.clear();
                    class48.field926.method2142();
                    class48.field927.method2286();
                    class48.field929 = 0;
                    field526 = 0;
                    field433 = false;
                    field462 = 0;
                    field343 = (int) (Math.random() * 100.0D) - 50;
                    field443 = (int) (Math.random() * 110.0D) - 55;
                    field347 = (int) (Math.random() * 80.0D) - 40;
                    field536 = (int) (Math.random() * 120.0D) - 60;
                    field352 = (int) (Math.random() * 30.0D) - 20;
                    field363 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field515 = 0;
                    field383 = -1;
                    field512 = 0;
                    field524 = 0;
                    field305 = class41.field811;
                    field306 = class41.field811;
                    field318 = 0;
                    class46.field902 = 0;
                    for (int var16 = 0; var16 < 2048; var16++) {
                        class46.field901[var16] = null;
                        class46.field900[var16] = 1;
                    }
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field399[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field317[var18] = null;
                    }
                    field408 = -1;
                    field411.method2219();
                    field412.method2219();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field409[var19][var20][var21] = null;
                            }
                        }
                    }
                    field301 = new class129();
                    field334 = 0;
                    field546 = 0;
                    field486 = 0;
                    for (int var22 = 0; var22 < Statics.field2756; var22++) {
                        class188 var23 = class188.method1927(var22);
                        if (var23 != null) {
                            class147.field2010[var22] = 0;
                            class147.field2012[var22] = 0;
                        }
                    }
                    Statics.field914.method841();
                    field446 = -1;
                    if (field438 != -1) {
                        class151.method206(field438);
                    }
                    for (class18 var24 = (class18) field439.method2174(); var24 != null; var24 = (class18) field439.method2175()) {
                        method753(var24, true);
                    }
                    field438 = -1;
                    field439 = new class126(8);
                    field310 = null;
                    field417 = false;
                    field418 = 0;
                    field552.method2539((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var25 = 0; var25 < 8; var25++) {
                        field428[var25] = null;
                        field406[var25] = false;
                    }
                    class13.method823();
                    field288 = true;
                    for (int var26 = 0; var26 < 100; var26++) {
                        field483[var26] = true;
                    }
                    field322.method2993(245);
                    class167 var27 = field322;
                    int var28 = field492 ? 2 : 1;
                    var27.method2718(var28);
                    field322.method2900(Statics.field124);
                    field322.method2900(Statics.field2000);
                    field300 = null;
                    Statics.field1190 = 0;
                    Statics.field1464 = null;
                    for (int var29 = 0; var29 < 8; var29++) {
                        field531[var29] = new class5();
                    }
                    Statics.field577 = null;
                    class46.method622(field324);
                    Statics.field651 = -1;
                    method886(false);
                    field287 = -1;
                }
            }
        } catch (IOException var42) {
            if (field314 < 1) {
                if (Statics.field493 == Statics.field2217) {
                    Statics.field493 = Statics.field55;
                } else {
                    Statics.field493 = Statics.field2217;
                }
                field314++;
                field547 = 0;
            } else {
                method1917(-2);
            }
        }
    }

    @ObfuscatedName("dq.m(IB)V")
    public static void method1917(int arg0) {
        if (arg0 == -3) {
            class42.method2568(class174.field2594, class174.field2382, class174.field2383);
        } else if (arg0 == -2) {
            class42.method2568(class174.field2384, class174.field2385, class174.field2386);
        } else if (arg0 == -1) {
            class42.method2568(class174.field2387, class174.field2459, class174.field2389);
        } else if (arg0 == 3) {
            class42.field835 = 3;
        } else if (arg0 == 4) {
            class42.method2568(class174.field2390, class174.field2417, class174.field2583);
        } else if (arg0 == 5) {
            class42.method2568(class174.field2584, class174.field2399, class174.field2395);
        } else if (arg0 == 6) {
            class42.method2568(class174.field2396, class174.field2564, class174.field2360);
        } else if (arg0 == 7) {
            class42.method2568(class174.field2618, class174.field2400, class174.field2401);
        } else if (arg0 == 8) {
            class42.method2568(class174.field2402, class174.field2403, class174.field2404);
        } else if (arg0 == 9) {
            class42.method2568(class174.field2405, class174.field2406, class174.field2407);
        } else if (arg0 == 10) {
            class42.method2568(class174.field2551, class174.field2409, class174.field2410);
        } else if (arg0 == 11) {
            class42.method2568(class174.field2366, class174.field2412, class174.field2413);
        } else if (arg0 == 12) {
            class42.method2568(class174.field2345, class174.field2415, class174.field2416);
        } else if (arg0 == 13) {
            class42.method2568(class174.field2408, class174.field2343, class174.field2486);
        } else if (arg0 == 14) {
            class42.method2568(class174.field2420, class174.field2398, class174.field2422);
        } else if (arg0 == 16) {
            class42.method2568(class174.field2423, class174.field2424, class174.field2425);
        } else if (arg0 == 17) {
            class42.method2568(class174.field2426, class174.field2504, class174.field2428);
        } else if (arg0 == 18) {
            class42.method2568(class174.field2429, class174.field2430, class174.field2431);
        } else if (arg0 == 19) {
            class42.method2568(class174.field2432, class174.field2433, class174.field2434);
        } else if (arg0 == 20) {
            class42.method2568(class174.field2496, class174.field2349, class174.field2380);
        } else if (arg0 == 22) {
            class42.method2568(class174.field2608, class174.field2439, class174.field2440);
        } else if (arg0 == 23) {
            class42.method2568(class174.field2441, class174.field2592, class174.field2575);
        } else if (arg0 == 24) {
            class42.method2568(class174.field2444, class174.field2445, class174.field2418);
        } else if (arg0 == 25) {
            class42.method2568(class174.field2447, class174.field2448, class174.field2509);
        } else if (arg0 == 26) {
            class42.method2568(class174.field2446, class174.field2470, class174.field2610);
        } else if (arg0 == 27) {
            class42.method2568(class174.field2453, class174.field2454, class174.field2452);
        } else if (arg0 == 31) {
            class42.method2568(class174.field2462, class174.field2463, class174.field2464);
        } else if (arg0 == 32) {
            class42.method2568(class174.field2367, class174.field2466, class174.field2467);
        } else if (arg0 == 37) {
            class42.method2568(class174.field2468, class174.field2469, class174.field2577);
        } else if (arg0 == 38) {
            class42.method2568(class174.field2471, class174.field2473, class174.field2593);
        } else if (arg0 == 55) {
            class42.method2568(class174.field2474, class174.field2506, class174.field2352);
        } else if (arg0 == 56) {
            class42.method2568(class174.field2477, class174.field2478, class174.field2479);
            method168(11);
            return;
        } else if (arg0 == 57) {
            class42.method2568(class174.field2549, class174.field2481, class174.field2482);
            method168(11);
            return;
        } else {
            class42.method2568(class174.field2580, class174.field2484, class174.field2485);
        }
        method168(10);
    }

    @ObfuscatedName("ds.e(I)V")
    public static final void method2032() {
        if (Statics.field2658 != null) {
            Statics.field2658.method1945();
            Statics.field2658 = null;
        }
        method804();
        Statics.field1114.method1621();
        for (int var0 = 0; var0 < 4; var0++) {
            field339[var0].method2084();
        }
        System.gc();
        class139.method1852(2);
        field517 = -1;
        field518 = false;
        for (class32 var1 = (class32) class32.field694.method2243(); var1 != null; var1 = (class32) class32.field694.method2238()) {
            if (var1.field701 != null) {
                Statics.field2291.method892(var1.field701);
                var1.field701 = null;
            }
            if (var1.field706 != null) {
                Statics.field2291.method892(var1.field706);
                var1.field706 = null;
            }
        }
        class32.field694.method2219();
        method168(10);
    }

    @ObfuscatedName("ae.l(I)V")
    public static final void method804() {
        class201.method2638();
        class192.field2795.method2161();
        class193.field2809.method2161();
        class198.method1();
        class200.method2947();
        class199.method695();
        class202.field3050.method2161();
        class202.field3037.method2161();
        class191.method2533();
        class195.field2831.method2161();
        class188.field2757.method2161();
        class197.field2858.method2161();
        class197.field2854.method2161();
        class197.field2855.method2161();
        class194.method690();
        class148.field2023.method2161();
        Statics.method2655();
        ((class75) Statics.field1449).method1359();
        class49.field945.method2161();
        Statics.field2192.method3080();
        Statics.field3.method3080();
        Statics.field2298.method3080();
        Statics.field153.method3080();
        Statics.field787.method3080();
        Statics.field924.method3080();
        Statics.field2331.method3080();
        Statics.field148.method3080();
        Statics.field2325.method3080();
        Statics.field2629.method3080();
        Statics.field110.method3080();
        Statics.field1764.method3080();
    }

    @ObfuscatedName("y.x(I)V")
    public static final void method17() {
        if (field332 > 0) {
            method2032();
        } else {
            method168(40);
            Statics.field2309 = Statics.field2658;
            Statics.field2658 = null;
        }
    }

    @ObfuscatedName("r.ap(I)V")
    public static final void method34() {
        if (Statics.field761 != null) {
            Statics.field761.method1067();
        }
        if (Statics.field1945 != null) {
            Statics.field1945.method1067();
        }
    }

    @ObfuscatedName("bf.aq(B)V")
    public static final void method1107() {
        for (int var0 = 0; var0 < field462; var0++) {
            int var10002 = field534[var0]--;
            if (field534[var0] >= -10) {
                class54 var2 = field401[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method959(Statics.field153, field474[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field534[var0] += var2.method955();
                    field401[var0] = var2;
                }
                if (field534[var0] < 0) {
                    int var9;
                    if (field525[var0] == 0) {
                        var9 = field519;
                    } else {
                        int var3 = (field525[var0] & 0xFF) * 128;
                        int var4 = field525[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1425.field619;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field525[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1425.field609;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field534[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field513 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method953().method999(Statics.field238);
                        class67 var11 = class67.method1240(var10, 100, var9);
                        var11.method1146(field523[var0] - 1);
                        Statics.field2291.method891(var11);
                    }
                    field534[var0] = -100;
                }
            } else {
                field462--;
                for (int var1 = var0; var1 < field462; var1++) {
                    field474[var1] = field474[var1 + 1];
                    field401[var1] = field401[var1 + 1];
                    field523[var1] = field523[var1 + 1];
                    field534[var1] = field534[var1 + 1];
                    field525[var1] = field525[var1 + 1];
                }
                var0--;
            }
        }
        if (!field518) {
            return;
        }
        boolean var12;
        if (class139.field1911 == 0) {
            var12 = Statics.field1907.method2315();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field516 != 0 && field517 != -1) {
                class139.method2715(Statics.field924, field517, 0, field516, false);
            }
            field518 = false;
        }
    }

    @ObfuscatedName("c.aw(Lgc;IIII)V")
    public static void method120(class202 arg0, int arg1, int arg2, int arg3) {
        if (field462 >= 50 || field513 == 0 || arg0.field3039 == null || arg1 >= arg0.field3039.length) {
            return;
        }
        int var4 = arg0.field3039[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field474[field462] = var5;
        field523[field462] = var6;
        field534[field462] = 0;
        field401[field462] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field525[field462] = (var8 << 16) + (var9 << 8) + var7;
        field462++;
    }

    @ObfuscatedName("ci.as(IIII)V")
    public static void method1461(int arg0, int arg1, int arg2) {
        if (field519 == 0 || arg1 == 0 || field462 >= 50) {
            return;
        }
        field474[field462] = arg0;
        field523[field462] = arg1;
        field534[field462] = arg2;
        field401[field462] = null;
        field525[field462] = 0;
        field462++;
    }

    @ObfuscatedName("cr.ah(I)V")
    public static final void method1804() {
        int[] var0 = class46.field903;
        for (int var1 = 0; var1 < class46.field902; var1++) {
            class24 var2 = field399[var0[var1]];
            if (var2 != null && var2.field607 > 0) {
                var2.field607--;
                if (var2.field607 == 0) {
                    var2.field604 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field318; var3++) {
            int var4 = field555[var3];
            class36 var5 = field317[var4];
            if (var5 != null && var5.field607 > 0) {
                var5.field607--;
                if (var5.field607 == 0) {
                    var5.field604 = null;
                }
            }
        }
    }

    @ObfuscatedName("q.aa(B)V")
    public static final void method96() {
        int var0 = field343 + Statics.field1425.field619;
        int var1 = field443 + Statics.field1425.field609;
        if (Statics.field953 - var0 < -500 || Statics.field953 - var0 > 500 || Statics.field1112 - var1 < -500 || Statics.field1112 - var1 > 500) {
            Statics.field953 = var0;
            Statics.field1112 = var1;
        }
        if (Statics.field953 != var0) {
            Statics.field953 += (var0 - Statics.field953) / 16;
        }
        if (Statics.field1112 != var1) {
            Statics.field1112 += (var1 - Statics.field1112) / 16;
        }
        if (class116.field1806 == 4 && Statics.field1810) {
            int var2 = class116.field1795 - field367;
            field365 = var2 * 2;
            field367 = var2 == -1 || var2 == 1 ? class116.field1795 : (field367 + class116.field1795) / 2;
            int var3 = field307 - class116.field1800;
            field364 = var3 * 2;
            field307 = var3 == -1 || var3 == 1 ? class116.field1800 : (field307 + class116.field1800) / 2;
        } else {
            if (class106.field1713[96]) {
                field364 += (-24 - field364) / 2;
            } else if (class106.field1713[97]) {
                field364 += (24 - field364) / 2;
            } else {
                field364 /= 2;
            }
            if (class106.field1713[98]) {
                field365 += (12 - field365) / 2;
            } else if (class106.field1713[99]) {
                field365 += (-12 - field365) / 2;
            } else {
                field365 /= 2;
            }
            field367 = class116.field1795;
            field307 = class116.field1800;
        }
        field363 = field364 / 2 + field363 & 0x7FF;
        field362 += field365 / 2;
        if (field362 < 128) {
            field362 = 128;
        }
        if (field362 > 383) {
            field362 = 383;
        }
        int var4 = Statics.field953 >> 7;
        int var5 = Statics.field1112 >> 7;
        int var6 = method1789(Statics.field953, Statics.field1112, Statics.field937);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field937;
                    if (var10 < 3 && (class12.field96[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class12.field115[var10][var8][var9];
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
        if (var12 > field371) {
            field371 += (var12 - field371) / 24;
        } else if (var12 < field371) {
            field371 += (var12 - field371) / 80;
        }
    }

    @ObfuscatedName("bt.ai(Laq;IB)V")
    public static final void method1310(class28 arg0, int arg1) {
        if (arg0.field637 > field454) {
            method2997(arg0);
        } else if (arg0.field638 >= field454) {
            if (field454 == arg0.field638 || arg0.field623 == -1 || arg0.field626 != 0 || arg0.field625 + 1 > class202.method1368(arg0.field623).field3040[arg0.field624]) {
                int var2 = arg0.field638 - arg0.field637;
                int var3 = field454 - arg0.field637;
                int var4 = arg0.field633 * 128 + arg0.field598 * 64;
                int var5 = arg0.field635 * 128 + arg0.field598 * 64;
                int var6 = arg0.field634 * 128 + arg0.field598 * 64;
                int var7 = arg0.field606 * 128 + arg0.field598 * 64;
                arg0.field619 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field609 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field639 = 0;
            arg0.field642 = arg0.field617;
            arg0.field596 = arg0.field642;
        } else {
            method2714(arg0);
        }
        if (arg0.field619 < 128 || arg0.field609 < 128 || arg0.field619 >= 13184 || arg0.field609 >= 13184) {
            arg0.field623 = -1;
            arg0.field628 = -1;
            arg0.field637 = 0;
            arg0.field638 = 0;
            arg0.field619 = arg0.field629[0] * 128 + arg0.field598 * 64;
            arg0.field609 = arg0.field641[0] * 128 + arg0.field598 * 64;
            arg0.method635();
        }
        if (Statics.field1425 == arg0 && (arg0.field619 < 1536 || arg0.field609 < 1536 || arg0.field619 >= 11776 || arg0.field609 >= 11776)) {
            arg0.field623 = -1;
            arg0.field628 = -1;
            arg0.field637 = 0;
            arg0.field638 = 0;
            arg0.field619 = arg0.field629[0] * 128 + arg0.field598 * 64;
            arg0.field609 = arg0.field641[0] * 128 + arg0.field598 * 64;
            arg0.method635();
        }
        method3237(arg0);
        arg0.field594 = false;
        if (arg0.field620 != -1) {
            class202 var8 = class202.method1368(arg0.field620);
            if (var8 == null || var8.field3038 == null) {
                arg0.field620 = -1;
            } else {
                arg0.field622++;
                if (arg0.field621 < var8.field3038.length && arg0.field622 > var8.field3040[arg0.field621]) {
                    arg0.field622 = 1;
                    arg0.field621++;
                    method120(var8, arg0.field621, arg0.field619, arg0.field609);
                }
                if (arg0.field621 >= var8.field3038.length) {
                    arg0.field622 = 0;
                    arg0.field621 = 0;
                    method120(var8, arg0.field621, arg0.field619, arg0.field609);
                }
            }
        }
        if (arg0.field628 != -1 && field454 >= arg0.field631) {
            if (arg0.field648 < 0) {
                arg0.field648 = 0;
            }
            int var9 = class191.method188(arg0.field628).field2779;
            if (var9 == -1) {
                arg0.field628 = -1;
            } else {
                class202 var10 = class202.method1368(var9);
                if (var10 == null || var10.field3038 == null) {
                    arg0.field628 = -1;
                } else {
                    arg0.field630++;
                    if (arg0.field648 < var10.field3038.length && arg0.field630 > var10.field3040[arg0.field648]) {
                        arg0.field630 = 1;
                        arg0.field648++;
                        method120(var10, arg0.field648, arg0.field619, arg0.field609);
                    }
                    if (arg0.field648 >= var10.field3038.length && (arg0.field648 < 0 || arg0.field648 >= var10.field3038.length)) {
                        arg0.field628 = -1;
                    }
                }
            }
        }
        if (arg0.field623 != -1 && arg0.field626 <= 1) {
            class202 var11 = class202.method1368(arg0.field623);
            if (var11.field3034 == 1 && arg0.field646 > 0 && arg0.field637 <= field454 && arg0.field638 < field454) {
                arg0.field626 = 1;
                return;
            }
        }
        if (arg0.field623 != -1 && arg0.field626 == 0) {
            class202 var12 = class202.method1368(arg0.field623);
            if (var12 == null || var12.field3038 == null) {
                arg0.field623 = -1;
            } else {
                arg0.field625++;
                if (arg0.field624 < var12.field3038.length && arg0.field625 > var12.field3040[arg0.field624]) {
                    arg0.field625 = 1;
                    arg0.field624++;
                    method120(var12, arg0.field624, arg0.field619, arg0.field609);
                }
                if (arg0.field624 >= var12.field3038.length) {
                    arg0.field624 -= var12.field3042;
                    arg0.field591++;
                    if (arg0.field591 >= var12.field3048) {
                        arg0.field623 = -1;
                    } else if (arg0.field624 >= 0 && arg0.field624 < var12.field3038.length) {
                        method120(var12, arg0.field624, arg0.field619, arg0.field609);
                    } else {
                        arg0.field623 = -1;
                    }
                }
                arg0.field594 = var12.field3044;
            }
        }
        if (arg0.field626 > 0) {
            arg0.field626--;
        }
    }

    @ObfuscatedName("ft.af(Laq;I)V")
    public static final void method2997(class28 arg0) {
        int var1 = arg0.field637 - field454;
        int var2 = arg0.field633 * 128 + arg0.field598 * 64;
        int var3 = arg0.field635 * 128 + arg0.field598 * 64;
        arg0.field619 += (var2 - arg0.field619) / var1;
        arg0.field609 += (var3 - arg0.field609) / var1;
        arg0.field639 = 0;
        arg0.field642 = arg0.field617;
    }

    @ObfuscatedName("fy.aj(Laq;I)V")
    public static final void method2714(class28 arg0) {
        arg0.field620 = arg0.field652;
        if (arg0.field645 == 0) {
            arg0.field639 = 0;
            return;
        }
        if (arg0.field623 != -1 && arg0.field626 == 0) {
            class202 var1 = class202.method1368(arg0.field623);
            if (arg0.field646 > 0 && var1.field3034 == 0) {
                arg0.field639++;
                return;
            }
            if (arg0.field646 <= 0 && var1.field3033 == 0) {
                arg0.field639++;
                return;
            }
        }
        int var2 = arg0.field619;
        int var3 = arg0.field609;
        int var4 = arg0.field629[arg0.field645 - 1] * 128 + arg0.field598 * 64;
        int var5 = arg0.field641[arg0.field645 - 1] * 128 + arg0.field598 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field642 = 1280;
            } else if (var3 > var5) {
                arg0.field642 = 1792;
            } else {
                arg0.field642 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field642 = 768;
            } else if (var3 > var5) {
                arg0.field642 = 256;
            } else {
                arg0.field642 = 512;
            }
        } else if (var3 < var5) {
            arg0.field642 = 1024;
        } else if (var3 > var5) {
            arg0.field642 = 0;
        }
        byte var6 = arg0.field595[arg0.field645 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field619 = var4;
            arg0.field609 = var5;
            arg0.field645--;
            if (arg0.field646 > 0) {
                arg0.field646--;
            }
            return;
        }
        int var7 = arg0.field642 - arg0.field596 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field600;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field599;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field602;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field601;
        }
        if (var8 == -1) {
            var8 = arg0.field599;
        }
        arg0.field620 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field764.field3016;
        }
        if (var10) {
            if (arg0.field642 != arg0.field596 && arg0.field627 == -1 && arg0.field644 != 0) {
                var9 = 2;
            }
            if (arg0.field645 > 2) {
                var9 = 6;
            }
            if (arg0.field645 > 3) {
                var9 = 8;
            }
            if (arg0.field639 > 0 && arg0.field645 > 1) {
                var9 = 8;
                arg0.field639--;
            }
        } else {
            if (arg0.field645 > 1) {
                var9 = 6;
            }
            if (arg0.field645 > 2) {
                var9 = 8;
            }
            if (arg0.field639 > 0 && arg0.field645 > 1) {
                var9 = 8;
                arg0.field639--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field620 == arg0.field599 && arg0.field603 != -1) {
            arg0.field620 = arg0.field603;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field619 += var9;
                if (arg0.field619 > var4) {
                    arg0.field619 = var4;
                }
            } else if (var2 > var4) {
                arg0.field619 -= var9;
                if (arg0.field619 < var4) {
                    arg0.field619 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field609 += var9;
                if (arg0.field609 > var5) {
                    arg0.field609 = var5;
                }
            } else if (var3 > var5) {
                arg0.field609 -= var9;
                if (arg0.field609 < var5) {
                    arg0.field609 = var5;
                }
            }
        }
        if (arg0.field619 == var4 && arg0.field609 == var5) {
            arg0.field645--;
            if (arg0.field646 > 0) {
                arg0.field646--;
            }
        }
    }

    @ObfuscatedName("gt.am(Laq;I)V")
    public static final void method3237(class28 arg0) {
        if (arg0.field644 == 0) {
            return;
        }
        if (arg0.field627 != -1) {
            class28 var1 = null;
            if (arg0.field627 < 32768) {
                var1 = field317[arg0.field627];
            } else if (arg0.field627 >= 32768) {
                var1 = field399[arg0.field627 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field619 - var1.field619;
                int var3 = arg0.field609 - var1.field609;
                if (var2 != 0 || var3 != 0) {
                    arg0.field642 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field618) {
                arg0.field627 = -1;
                arg0.field618 = false;
            }
        }
        if (arg0.field636 != -1 && (arg0.field645 == 0 || arg0.field639 > 0)) {
            arg0.field642 = arg0.field636;
            arg0.field636 = -1;
        }
        int var4 = arg0.field642 - arg0.field596 & 0x7FF;
        if (var4 == 0 && arg0.field618) {
            arg0.field627 = -1;
            arg0.field618 = false;
        }
        if (var4 == 0) {
            arg0.field592 = 0;
            return;
        }
        arg0.field592++;
        if (var4 > 1024) {
            arg0.field596 -= arg0.field644;
            boolean var5 = true;
            if (var4 < arg0.field644 || var4 > 2048 - arg0.field644) {
                arg0.field596 = arg0.field642;
                var5 = false;
            }
            if (arg0.field652 == arg0.field620 && (arg0.field592 > 25 || var5)) {
                if (arg0.field597 == -1) {
                    arg0.field620 = arg0.field599;
                } else {
                    arg0.field620 = arg0.field597;
                }
            }
        } else {
            arg0.field596 += arg0.field644;
            boolean var6 = true;
            if (var4 < arg0.field644 || var4 > 2048 - arg0.field644) {
                arg0.field596 = arg0.field642;
                var6 = false;
            }
            if (arg0.field652 == arg0.field620 && (arg0.field592 > 25 || var6)) {
                if (arg0.field643 == -1) {
                    arg0.field620 = arg0.field599;
                } else {
                    arg0.field620 = arg0.field643;
                }
            }
        }
        arg0.field596 &= 0x7FF;
    }

    @ObfuscatedName("v.ar(Le;III)V")
    public static void method189(class24 arg0, int arg1, int arg2) {
        if (arg0.field623 == arg1 && arg1 != -1) {
            int var3 = class202.method1368(arg1).field3051;
            if (var3 == 1) {
                arg0.field624 = 0;
                arg0.field625 = 0;
                arg0.field626 = arg2;
                arg0.field591 = 0;
            }
            if (var3 == 2) {
                arg0.field591 = 0;
            }
        } else if (arg1 == -1 || arg0.field623 == -1 || class202.method1368(arg1).field3041 >= class202.method1368(arg0.field623).field3041) {
            arg0.field623 = arg1;
            arg0.field624 = 0;
            arg0.field625 = 0;
            arg0.field626 = arg2;
            arg0.field591 = 0;
            arg0.field646 = arg0.field645;
        }
    }

    @ObfuscatedName("ar.ad(II)V")
    public static void method733(int arg0) {
        field485 = 0L;
        if (arg0 >= 2) {
            field492 = true;
        } else {
            field492 = false;
        }
        method885();
        if (field308 >= 25) {
            field322.method2993(245);
            class167 var1 = field322;
            int var2 = field492 ? 2 : 1;
            var1.method2718(var2);
            field322.method2900(Statics.field124);
            field322.method2900(Statics.field2000);
        }
        field1777 = true;
    }

    @ObfuscatedName("ap.ay(I)V")
    public static void method624() {
        Canvas var0 = Statics.field729;
        var0.removeKeyListener(class106.field1701);
        var0.removeFocusListener(class106.field1701);
        class106.field1720 = -1;
        class116.method3236(Statics.field729);
        if (Statics.field77 != null) {
            Statics.field77.method1914(Statics.field729);
        }
        Statics.field278.method1960();
        Statics.field729.setBackground(Color.black);
        Canvas var1 = Statics.field729;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class106.field1701);
        var1.addFocusListener(class106.field1701);
        class116.method1618(Statics.field729);
        if (Statics.field77 != null) {
            Statics.field77.method1900(Statics.field729);
        }
        if (field438 != -1) {
            method118(false);
        }
        field1779 = true;
    }

    @ObfuscatedName("ak.ao(I)V")
    public static void method885() {
        client var0 = Statics.field278;
        synchronized (Statics.field278) {
            Container var1 = Statics.field278.method2018();
            if (var1 != null) {
                Statics.field85 = Math.max(var1.getSize().width, Statics.field1756);
                Statics.field1085 = Math.max(var1.getSize().height, Statics.field1760);
                if (Statics.field1352 == var1) {
                    Insets var2 = Statics.field1352.getInsets();
                    Statics.field85 -= var2.right + var2.left;
                    Statics.field1085 -= var2.top + var2.bottom;
                }
                if (Statics.field85 <= 0) {
                    Statics.field85 = 1;
                }
                if (Statics.field1085 <= 0) {
                    Statics.field1085 = 1;
                }
                int var3 = field492 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field124 = field538;
                    Statics.field2000 = field494 * 503;
                } else {
                    Statics.field124 = Math.min(Statics.field85, 7680);
                    Statics.field2000 = Math.min(Statics.field1085, 2160);
                }
                field1775 = (Statics.field85 - Statics.field124) / 2;
                field1776 = 0;
                Statics.field729.setSize(Statics.field124, Statics.field2000);
                int var4 = Statics.field124;
                int var5 = Statics.field2000;
                Canvas var6 = Statics.field729;
                class221 var8;
                try {
                    class219 var7 = new class219();
                    var7.method3738(var4, var5, var6);
                    var8 = var7;
                } catch (Throwable var21) {
                    class224 var10 = new class224();
                    var10.method3738(var4, var5, var6);
                    var8 = var10;
                }
                Statics.field144 = var8;
                if (Statics.field1352 == var1) {
                    Insets var11 = Statics.field1352.getInsets();
                    Statics.field729.setLocation(field1775 + var11.left, field1776 + var11.top);
                } else {
                    Statics.field729.setLocation(field1775, field1776);
                }
                int var12 = Statics.field124;
                int var13 = Statics.field2000;
                if (Statics.field85 < var12) {
                    int var14 = Statics.field85;
                }
                if (Statics.field1085 < var13) {
                    int var15 = Statics.field1085;
                }
                if (Statics.field1457 != null) {
                    try {
                        client var16 = Statics.field278;
                        int var17 = field492 ? 2 : 1;
                        class101.method1816(var16, "resize", new Object[] { var17 });
                    } catch (Throwable var20) {
                    }
                }
                if (field438 != -1) {
                    method118(true);
                }
                method821();
            }
        }
    }

    @ObfuscatedName("ab.ac(I)V")
    public static void method821() {
        int var0 = field1775;
        int var1 = field1776;
        int var2 = Statics.field85 - Statics.field124 - var0;
        int var3 = Statics.field1085 - Statics.field2000 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field278.method2018();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1352 == var4) {
                Insets var7 = Statics.field1352.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1085);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field85, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field85 + var5 - var2, var6, var2, Statics.field1085);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1085 + var6 - var3, Statics.field85, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("cd.ag(Ljava/lang/String;ZB)V")
    public static final void method1826(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field962.method3652(arg0, 250);
        int var6 = Statics.field962.method3653(arg0, 250) * 13;
        class220.method3783(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3764(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field962.method3658(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method814(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field729.getGraphics();
                Statics.field144.method3739(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field729.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field289; var13++) {
            if (field488[var13] + field340[var13] > var9 && field340[var13] < var9 + var11 && field489[var13] + field277[var13] > var10 && field277[var13] < var10 + var12) {
                field484[var13] = true;
            }
        }
    }

    @ObfuscatedName("ai.at(IIIIB)V")
    public static final void method712(int arg0, int arg1, int arg2, int arg3) {
        field452++;
        method2037(class16.field167);
        boolean var4 = false;
        if (field408 >= 0) {
            int var5 = class46.field902;
            int[] var6 = class46.field903;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field408 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method2037(class16.field164);
        }
        method2668(true);
        method2037(var4 ? class16.field165 : class16.field162);
        method2668(false);
        method13();
        method49();
        method3609(arg0, arg1, arg2, arg3, true);
        int var8 = field281;
        int var9 = field542;
        int var10 = field543;
        int var11 = field460;
        class220.method3752(var8, var9, var8 + var10, var9 + var11);
        class85.method1556();
        if (!field527) {
            int var12 = field362;
            if (field371 / 256 > var12) {
                var12 = field371 / 256;
            }
            if (field528[4] && field530[4] + 128 > var12) {
                var12 = field530[4] + 128;
            }
            int var13 = field363 + field347 & 0x7FF;
            method3393(Statics.field953, method1789(Statics.field1425.field619, Statics.field1425.field609, Statics.field937) - field368, Statics.field1112, var12, var13, var12 * 3 + 600);
        }
        int var26;
        if (field527) {
            int var27;
            if (Statics.field1457.field686) {
                var27 = Statics.field937;
            } else {
                int var28 = method1789(Statics.field3056, Statics.field173, Statics.field937);
                if (var28 - Statics.field716 >= 800 || (class12.field96[Statics.field937][Statics.field3056 >> 7][Statics.field173 >> 7] & 0x4) == 0) {
                    var27 = 3;
                } else {
                    var27 = Statics.field937;
                }
            }
            var26 = var27;
        } else {
            int var14;
            if (Statics.field1457.field686) {
                var14 = Statics.field937;
            } else {
                label271: {
                    int var15 = 3;
                    if (Statics.field2796 < 310) {
                        int var16 = Statics.field3056 >> 7;
                        int var17 = Statics.field173 >> 7;
                        int var18 = Statics.field1425.field619 >> 7;
                        int var19 = Statics.field1425.field609 >> 7;
                        if (var16 < 0 || var17 < 0 || var16 >= 104 || var17 >= 104) {
                            var14 = Statics.field937;
                            break label271;
                        }
                        if ((class12.field96[Statics.field937][var16][var17] & 0x4) != 0) {
                            var15 = Statics.field937;
                        }
                        int var20;
                        if (var18 > var16) {
                            var20 = var18 - var16;
                        } else {
                            var20 = var16 - var18;
                        }
                        int var21;
                        if (var19 > var17) {
                            var21 = var19 - var17;
                        } else {
                            var21 = var17 - var19;
                        }
                        if (var20 > var21) {
                            int var22 = var21 * 65536 / var20;
                            int var23 = 32768;
                            while (var16 != var18) {
                                if (var16 < var18) {
                                    var16++;
                                } else if (var16 > var18) {
                                    var16--;
                                }
                                if ((class12.field96[Statics.field937][var16][var17] & 0x4) != 0) {
                                    var15 = Statics.field937;
                                }
                                var23 += var22;
                                if (var23 >= 65536) {
                                    var23 -= 65536;
                                    if (var17 < var19) {
                                        var17++;
                                    } else if (var17 > var19) {
                                        var17--;
                                    }
                                    if ((class12.field96[Statics.field937][var16][var17] & 0x4) != 0) {
                                        var15 = Statics.field937;
                                    }
                                }
                            }
                        } else {
                            int var24 = var20 * 65536 / var21;
                            int var25 = 32768;
                            while (var17 != var19) {
                                if (var17 < var19) {
                                    var17++;
                                } else if (var17 > var19) {
                                    var17--;
                                }
                                if ((class12.field96[Statics.field937][var16][var17] & 0x4) != 0) {
                                    var15 = Statics.field937;
                                }
                                var25 += var24;
                                if (var25 >= 65536) {
                                    var25 -= 65536;
                                    if (var16 < var18) {
                                        var16++;
                                    } else if (var16 > var18) {
                                        var16--;
                                    }
                                    if ((class12.field96[Statics.field937][var16][var17] & 0x4) != 0) {
                                        var15 = Statics.field937;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field1425.field619 >= 0 && Statics.field1425.field609 >= 0 && Statics.field1425.field619 < 13312 && Statics.field1425.field609 < 13312) {
                        if ((class12.field96[Statics.field937][Statics.field1425.field619 >> 7][Statics.field1425.field609 >> 7] & 0x4) != 0) {
                            var15 = Statics.field937;
                        }
                        var14 = var15;
                    } else {
                        var14 = Statics.field937;
                    }
                }
            }
            var26 = var14;
        }
        int var29 = Statics.field3056;
        int var30 = Statics.field716;
        int var31 = Statics.field173;
        int var32 = Statics.field2796;
        int var33 = Statics.field37;
        for (int var34 = 0; var34 < 5; var34++) {
            if (field528[var34]) {
                int var35 = (int) (Math.random() * (double) (field529[var34] * 2 + 1) - (double) field529[var34] + Math.sin((double) field388[var34] / 100.0D * (double) field532[var34]) * (double) field530[var34]);
                if (var34 == 0) {
                    Statics.field3056 += var35;
                }
                if (var34 == 1) {
                    Statics.field716 += var35;
                }
                if (var34 == 2) {
                    Statics.field173 += var35;
                }
                if (var34 == 3) {
                    Statics.field37 = Statics.field37 + var35 & 0x7FF;
                }
                if (var34 == 4) {
                    Statics.field2796 += var35;
                    if (Statics.field2796 < 128) {
                        Statics.field2796 = 128;
                    }
                    if (Statics.field2796 > 383) {
                        Statics.field2796 = 383;
                    }
                }
            }
        }
        int var36 = class116.field1800;
        int var37 = class116.field1795;
        if (class116.field1805 != 0) {
            var36 = class116.field1801;
            var37 = class116.field1808;
        }
        if (var36 >= var8 && var36 < var8 + var10 && var37 >= var9 && var37 < var9 + var11) {
            class83.field1408 = true;
            class83.field1400 = 0;
            class83.field1356 = var36 - var8;
            class83.field1410 = var37 - var9;
        } else {
            class83.field1408 = false;
            class83.field1400 = 0;
        }
        method34();
        class220.method3783(var8, var9, var10, var11, 0);
        method34();
        int var38 = class85.field1438;
        class85.field1438 = field545;
        Statics.field1114.method1662(Statics.field3056, Statics.field716, Statics.field173, Statics.field2796, Statics.field37, var26);
        class85.field1438 = var38;
        method34();
        Statics.field1114.method1684();
        method1869(var8, var9, var10, var11);
        method762(var8, var9);
        ((class75) Statics.field1449).method1360(field355);
        if (field521 == 1) {
            Statics.field743[field465 / 100].method3875(field386 - 8, field387 - 8);
        }
        if (field521 == 2) {
            Statics.field743[field465 / 100 + 4].method3875(field386 - 8, field387 - 8);
        }
        method1110();
        Statics.field3056 = var29;
        Statics.field716 = var30;
        Statics.field173 = var31;
        Statics.field2796 = var32;
        Statics.field37 = var33;
        if (field288) {
            byte var39 = 0;
            int var40 = class186.field2735 + class186.field2733 + var39;
            if (var40 == 0) {
                field288 = false;
            }
        }
        if (field288) {
            class220.method3783(var8, var9, var10, var11, 0);
            method1826(class174.field2351, false);
        }
    }

    @ObfuscatedName("gn.au(IIIIZI)V")
    public static final void method3609(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field293 - field369) * var5 / 100 + field369;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field539) {
            short var8 = field539;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field413) {
                var6 = field413;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3751();
                    class220.method3783(arg0, arg1, var10, arg3, -16777216);
                    class220.method3783(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field540) {
            short var11 = field540;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field448) {
                var6 = field448;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3751();
                    class220.method3783(arg0, arg1, arg2, var13, -16777216);
                    class220.method3783(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field522 - field535) * var5 / 100 + field535;
        field545 = arg3 * var6 * var14 / 85504 << 1;
        if (field543 != arg2 || field460 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1429[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1656(var15, 500, 800, arg2, arg3);
        }
        field281 = arg0;
        field542 = arg1;
        field543 = arg2;
        field460 = arg3;
    }

    @ObfuscatedName("ds.ax(Lh;B)V")
    public static final void method2037(class16 arg0) {
        if (Statics.field1425.field619 >> 7 == field512 && Statics.field1425.field609 >> 7 == field524) {
            field512 = 0;
        }
        int var1 = class46.field902;
        int[] var2 = class46.field903;
        int var3 = var1;
        if (class16.field167 == arg0 || class16.field164 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field167 == arg0) {
                var5 = Statics.field1425;
                var6 = Statics.field1425.field257 << 14;
            } else if (class16.field164 == arg0) {
                var5 = field399[field408];
                var6 = field408 << 14;
            } else {
                var5 = field399[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field165 == arg0 && field408 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method242() && !var5.field263) {
                var5.field261 = false;
                if ((field279 && var1 > 50 || var1 > 200) && class16.field167 != arg0 && var5.field652 == var5.field620) {
                    var5.field261 = true;
                }
                int var7 = var5.field619 >> 7;
                int var8 = var5.field609 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field248 == null || field454 < var5.field268 || field454 >= var5.field252) {
                        if ((var5.field619 & 0x7F) == 64 && (var5.field609 & 0x7F) == 64) {
                            if (field452 == field405[var7][var8]) {
                                continue;
                            }
                            field405[var7][var8] = field452;
                        }
                        var5.field250 = method1789(var5.field619, var5.field609, Statics.field937);
                        Statics.field1114.method1632(Statics.field937, var5.field619, var5.field609, var5.field250, 60, var5, var5.field596, var6, var5.field594);
                    } else {
                        var5.field261 = false;
                        var5.field250 = method1789(var5.field619, var5.field609, Statics.field937);
                        Statics.field1114.method1633(Statics.field937, var5.field619, var5.field609, var5.field250, 60, var5, var5.field596, var6, var5.field265, var5.field255, var5.field251, var5.field260);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ef.ae(ZB)V")
    public static final void method2668(boolean arg0) {
        for (int var1 = 0; var1 < field318; var1++) {
            class36 var2 = field317[field555[var1]];
            int var3 = (field555[var1] << 14) + 536870912;
            if (var2 != null && var2.method242() && var2.field764.field3010 == arg0 && var2.field764.method3486()) {
                int var4 = var2.field619 >> 7;
                int var5 = var2.field609 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field598 == 1 && (var2.field619 & 0x7F) == 64 && (var2.field609 & 0x7F) == 64) {
                        if (field452 == field405[var4][var5]) {
                            continue;
                        }
                        field405[var4][var5] = field452;
                    }
                    if (!var2.field764.field3015) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1114.method1632(Statics.field937, var2.field619, var2.field609, method1789(var2.field619 + (var2.field598 * 64 - 64), var2.field609 + (var2.field598 * 64 - 64), Statics.field937), var2.field598 * 64 - 64 + 60, var2, var2.field596, var3, var2.field594);
                }
            }
        }
    }

    @ObfuscatedName("k.ab(I)V")
    public static final void method13() {
        for (class43 var0 = (class43) field411.method2243(); var0 != null; var0 = (class43) field411.method2238()) {
            if (Statics.field937 != var0.field863 || field454 > var0.field866) {
                var0.method2214();
            } else if (field454 >= var0.field865) {
                if (var0.field864 > 0) {
                    class36 var1 = field317[var0.field864 - 1];
                    if (var1 != null && var1.field619 >= 0 && var1.field619 < 13312 && var1.field609 >= 0 && var1.field609 < 13312) {
                        var0.method790(var1.field619, var1.field609, method1789(var1.field619, var1.field609, var0.field863) - var0.field871, field454);
                    }
                }
                if (var0.field864 < 0) {
                    int var2 = -var0.field864 - 1;
                    class24 var3;
                    if (field473 == var2) {
                        var3 = Statics.field1425;
                    } else {
                        var3 = field399[var2];
                    }
                    if (var3 != null && var3.field619 >= 0 && var3.field619 < 13312 && var3.field609 >= 0 && var3.field609 < 13312) {
                        var0.method790(var3.field619, var3.field609, method1789(var3.field619, var3.field609, var0.field863) - var0.field871, field454);
                    }
                }
                var0.method784(field355);
                Statics.field1114.method1632(Statics.field937, (int) var0.field860, (int) var0.field872, (int) var0.field873, 60, var0, var0.field869, -1, false);
            }
        }
    }

    @ObfuscatedName("w.al(I)V")
    public static final void method49() {
        for (class34 var0 = (class34) field412.method2243(); var0 != null; var0 = (class34) field412.method2238()) {
            if (Statics.field937 != var0.field749 || var0.field745) {
                var0.method2214();
            } else if (field454 >= var0.field737) {
                var0.method713(field355);
                if (var0.field745) {
                    var0.method2214();
                } else {
                    Statics.field1114.method1632(var0.field749, var0.field739, var0.field740, var0.field747, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ag.az(III)V")
    public static final void method762(int arg0, int arg1) {
        if (field297 == 2) {
            method204((field349 - Statics.field1792 << 7) + field303, (field429 - Statics.field663 << 7) + field304, field302 * 2);
            if (field384 > -1 && field454 % 20 < 10) {
                Statics.field964[0].method3875(field384 + arg0 - 12, field385 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("be.av(Laq;IIIIII)V")
    public static final void method1138(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method242()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field764;
            if (var6.field3012 != null) {
                var6 = var6.method3513();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field902;
        int[] var8 = class46.field903;
        int var9 = 3;
        if (!arg0.field616.method2208()) {
            method2704(arg0, arg0.field593 + 15);
            for (class35 var10 = (class35) arg0.field616.method2191(); var10 != null; var10 = (class35) arg0.field616.method2193()) {
                class29 var11 = var10.method720(field454);
                if (var11 != null) {
                    class194 var12 = var10.field752;
                    class225 var13 = var12.method3299();
                    class225 var14 = var12.method3310();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2828;
                    } else {
                        if (var12.field2825 * 2 < var14.field3201) {
                            var15 = var12.field2825;
                        }
                        var16 = var14.field3201 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field454 - var11.field655;
                    int var20 = var11.field657 * var16 / var12.field2828;
                    int var23;
                    if (var11.field658 > var19) {
                        int var21 = var12.field2824 == 0 ? 0 : var19 / var12.field2824 * var12.field2824;
                        int var22 = var11.field656 * var16 / var12.field2828;
                        var23 = (var20 - var22) * var21 / var11.field658 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field658 + var12.field2817 - var19;
                        if (var12.field2823 >= 0) {
                            var17 = (var24 << 8) / (var12.field2817 - var12.field2823);
                        }
                    }
                    if (var11.field657 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field384 + arg2 - (var16 >> 1);
                    int var26 = field385 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field384 > -1) {
                            class220.method3783(var25, var26, var23, 5, 65280);
                            class220.method3783(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3209;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3874(var27, var26, var17);
                            class220.method3753(var27, var26, var27 + var28, var26 + var29);
                            var14.method3874(var27, var26, var17);
                        } else {
                            var13.method3875(var27, var26);
                            class220.method3753(var27, var26, var27 + var28, var26 + var29);
                            var14.method3875(var27, var26);
                        }
                        class220.method3752(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method719()) {
                    var10.method2214();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field263) {
                return;
            }
            if (var30.field245 != -1 || var30.field246 != -1) {
                method2704(arg0, arg0.field593 + 15);
                if (field384 > -1) {
                    if (var30.field245 != -1) {
                        Statics.field1667[var30.field245].method3875(field384 + arg2 - 12, field385 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field246 != -1) {
                        Statics.field1592[var30.field246].method3875(field384 + arg2 - 12, field385 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field297 == 10 && field299 == var8[arg1]) {
                method2704(arg0, arg0.field593 + 15);
                if (field384 > -1) {
                    Statics.field964[1].method3875(field384 + arg2 - 12, field385 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field764;
            if (var31.field3012 != null) {
                var31 = var31.method3513();
            }
            if (var31.field2986 >= 0 && var31.field2986 < Statics.field1592.length) {
                method2704(arg0, arg0.field593 + 15);
                if (field384 > -1) {
                    Statics.field1592[var31.field2986].method3875(field384 + arg2 - 12, field385 + arg3 - 30);
                }
            }
            if (field297 == 1 && field298 == field555[arg1 - var7] && field454 % 20 < 10) {
                method2704(arg0, arg0.field593 + 15);
                if (field384 > -1) {
                    Statics.field964[0].method3875(field384 + arg2 - 12, field385 + arg3 - 28);
                }
            }
        }
        if (arg0.field604 != null && (arg1 >= var7 || !arg0.field647 && (field496 == 4 || !arg0.field605 && (field496 == 0 || field496 == 3 || field496 == 1 && method1121(((class24) arg0).field262, false))))) {
            method2704(arg0, arg0.field593);
            if (field384 > -1 && field372 < field373) {
                field377[field372] = Statics.field177.method3667(arg0.field604) / 2;
                field520[field372] = Statics.field177.field3087;
                field374[field372] = field384;
                field375[field372] = field385;
                field378[field372] = arg0.field608;
                field379[field372] = arg0.field649;
                field380[field372] = arg0.field607;
                field381[field372] = arg0.field604;
                field372++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field613[var32];
            int var34 = arg0.field611[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field454) {
                    continue;
                }
                var35 = class197.method2653(arg0.field611[var32]);
                var36 = var35.field2859;
                if (var35 != null && var35.field2871 != null) {
                    var35 = var35.method3348();
                    if (var35 == null) {
                        arg0.field613[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field614[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method2653(var37);
                if (var38 != null && var38.field2871 != null) {
                    var38 = var38.method3348();
                }
            }
            if (var33 - var36 <= field454) {
                if (var35 == null) {
                    arg0.field613[var32] = -1;
                } else {
                    method2704(arg0, arg0.field593 / 2);
                    if (field384 > -1) {
                        if (var32 == 1) {
                            field385 -= 20;
                        }
                        if (var32 == 2) {
                            field384 -= 15;
                            field385 -= 10;
                        }
                        if (var32 == 3) {
                            field384 += 15;
                            field385 -= 10;
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
                        class225 var64 = var35.method3369();
                        if (var64 != null) {
                            var43 = var64.field3201;
                            int var65 = var64.field3209;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3203;
                        }
                        class225 var66 = var35.method3351();
                        if (var66 != null) {
                            var44 = var66.field3201;
                            int var67 = var66.field3209;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3203;
                        }
                        class225 var68 = var35.method3352();
                        if (var68 != null) {
                            var45 = var68.field3201;
                            int var69 = var68.field3209;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3203;
                        }
                        class225 var70 = var35.method3353();
                        if (var70 != null) {
                            var46 = var70.field3201;
                            int var71 = var70.field3209;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3203;
                        }
                        if (var38 != null) {
                            var51 = var38.method3369();
                            if (var51 != null) {
                                var55 = var51.field3201;
                                int var72 = var51.field3209;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3203;
                            }
                            var52 = var38.method3351();
                            if (var52 != null) {
                                var56 = var52.field3201;
                                int var73 = var52.field3209;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3203;
                            }
                            var53 = var38.method3352();
                            if (var53 != null) {
                                var57 = var53.field3201;
                                int var74 = var53.field3209;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3203;
                            }
                            var54 = var38.method3353();
                            if (var54 != null) {
                                var58 = var54.field3201;
                                int var75 = var54.field3209;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3203;
                            }
                        }
                        class209 var76 = var35.method3370();
                        if (var76 == null) {
                            var76 = Statics.field856;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field856;
                        } else {
                            var77 = var38.method3370();
                            if (var77 == null) {
                                var77 = Statics.field856;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3349(arg0.field612[var32]);
                        int var83 = var76.method3667(var82);
                        if (var38 != null) {
                            var79 = var38.method3349(arg0.field615[var32]);
                            var81 = var77.method3667(var79);
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
                        int var100 = arg0.field613[var32] - field454;
                        int var101 = var35.field2864 - var35.field2864 * var100 / var35.field2859;
                        int var102 = var35.field2862 * var100 / var35.field2859 + -var35.field2862;
                        int var103 = field384 + arg2 - (var92 >> 1) + var101;
                        int var104 = field385 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2869 + var104 + 15;
                        int var108 = var107 - var76.field3094;
                        int var109 = var76.field3095 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2869 + var104 + 15;
                            int var111 = var110 - var77.field3094;
                            int var112 = var77.field3095 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2866 >= 0) {
                            var115 = (var100 << 8) / (var35.field2859 - var35.field2866);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3874(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3874(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3874(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3874(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3666(var82, var90 + var103, var107, var35.field2873, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3874(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3874(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3874(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3874(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3666(var79, var98 + var103, var110, var38.field2873, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3875(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3875(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3875(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3875(var93 + var103 - var50, var104);
                            }
                            var76.method3699(var82, var90 + var103, var107, var35.field2873 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3875(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3875(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3875(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3875(var97 + var103 - var62, var104);
                                }
                                var77.method3699(var79, var98 + var103, var110, var38.field2873 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.ak(IIIII)V")
    public static final void method1869(int arg0, int arg1, int arg2, int arg3) {
        field372 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class46.field902;
        int[] var7 = class46.field903;
        for (int var8 = 0; var8 < field318 + var6; var8++) {
            class28 var9;
            if (var8 < var6) {
                var9 = field399[var7[var8]];
                if (field408 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field317[field555[var8 - var6]];
            }
            method1138(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1138(field399[field408], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field372; var10++) {
            int var11 = field374[var10];
            int var12 = field375[var10];
            int var13 = field377[var10];
            int var14 = field520[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field375[var16] - field520[var16] && var12 - var14 < field375[var16] + 2 && var11 - var13 < field377[var16] + field374[var16] && var11 + var13 > field374[var16] - field377[var16] && field375[var16] - field520[var16] < var12) {
                        var12 = field375[var16] - field520[var16];
                        var15 = true;
                    }
                }
            }
            field384 = field374[var10];
            field385 = field375[var10] = var12;
            String var17 = field381[var10];
            if (field440 == 0) {
                int var18 = 16776960;
                if (field378[var10] < 6) {
                    var18 = field499[field378[var10]];
                }
                if (field378[var10] == 6) {
                    var18 = field452 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field378[var10] == 7) {
                    var18 = field452 % 20 < 10 ? 255 : 65535;
                }
                if (field378[var10] == 8) {
                    var18 = field452 % 20 < 10 ? 45056 : 8454016;
                }
                if (field378[var10] == 9) {
                    int var19 = 150 - field380[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field378[var10] == 10) {
                    int var20 = 150 - field380[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field378[var10] == 11) {
                    int var21 = 150 - field380[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field379[var10] == 0) {
                    Statics.field177.method3657(var17, field384 + arg0, field385 + arg1, var18, 0);
                }
                if (field379[var10] == 1) {
                    Statics.field177.method3659(var17, field384 + arg0, field385 + arg1, var18, 0, field452);
                }
                if (field379[var10] == 2) {
                    Statics.field177.method3654(var17, field384 + arg0, field385 + arg1, var18, 0, field452);
                }
                if (field379[var10] == 3) {
                    Statics.field177.method3661(var17, field384 + arg0, field385 + arg1, var18, 0, field452, 150 - field380[var10]);
                }
                if (field379[var10] == 4) {
                    int var22 = (150 - field380[var10]) * (Statics.field177.method3667(var17) + 100) / 150;
                    class220.method3753(field384 + arg0 - 50, arg1, field384 + arg0 + 50, arg1 + arg3);
                    Statics.field177.method3699(var17, field384 + arg0 + 50 - var22, field385 + arg1, var18, 0);
                    class220.method3752(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field379[var10] == 5) {
                    int var23 = 150 - field380[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class220.method3753(arg0, field385 + arg1 - Statics.field177.field3087 - 1, arg0 + arg2, field385 + arg1 + 5);
                    Statics.field177.method3657(var17, field384 + arg0, field385 + arg1 + var24, var18, 0);
                    class220.method3752(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field177.method3657(var17, field384 + arg0, field385 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("bf.an(B)V")
    public static final void method1110() {
        field398 = 0;
        int var0 = (Statics.field1425.field619 >> 7) + Statics.field1792;
        int var1 = (Statics.field1425.field609 >> 7) + Statics.field663;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field398 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field398 = 1;
        }
        if (field398 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field398 = 0;
        }
    }

    @ObfuscatedName("fc.bb(Laq;IS)V")
    public static final void method2704(class28 arg0, int arg1) {
        method204(arg0.field619, arg0.field609, arg1);
    }

    @ObfuscatedName("f.bm(IIIB)V")
    public static final void method204(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field384 = -1;
            field385 = -1;
            return;
        }
        int var3 = method1789(arg0, arg1, Statics.field937) - arg2;
        int var4 = arg0 - Statics.field3056;
        int var5 = var3 - Statics.field716;
        int var6 = arg1 - Statics.field173;
        int var7 = class85.field1429[Statics.field2796];
        int var8 = class85.field1453[Statics.field2796];
        int var9 = class85.field1429[Statics.field37];
        int var10 = class85.field1453[Statics.field37];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field384 = field545 * var11 / var15 + field543 / 2;
            field385 = field545 * var14 / var15 + field460 / 2;
        } else {
            field384 = -1;
            field385 = -1;
        }
    }

    @ObfuscatedName("cg.bz(IIIS)I")
    public static final int method1789(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class12.field96[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class12.field115[var5][var3][var4] + class12.field115[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class12.field115[var5][var3][var4 + 1] + class12.field115[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("gb.bl(IIIIIII)V")
    public static final void method3393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1429[var6];
            int var12 = class85.field1453[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1429[var7];
            int var15 = class85.field1453[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field3056 = arg0 - var8;
        Statics.field716 = arg1 - var9;
        Statics.field173 = arg2 - var10;
        Statics.field2796 = arg3;
        Statics.field37 = arg4;
    }

    @ObfuscatedName("ak.bh(ZB)V")
    public static final void method886(boolean arg0) {
        field549 = arg0;
        if (!field549) {
            int var1 = field324.method2768();
            int var2 = field324.method2768();
            int var3 = field324.method2735();
            Statics.field1538 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1538[var4][var5] = field324.method2868();
                }
            }
            Statics.field217 = new int[var3];
            Statics.field86 = new int[var3];
            Statics.field1424 = new int[var3];
            Statics.field2284 = new byte[var3][];
            Statics.field1221 = new byte[var3][];
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
                        Statics.field217[var7] = var10;
                        Statics.field86[var7] = Statics.field787.method3076("m" + var8 + "_" + var9);
                        Statics.field1424[var7] = Statics.field787.method3076("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method200(var1, var2);
            return;
        }
        int var11 = field324.method2768();
        int var12 = field324.method2768();
        int var13 = field324.method2735();
        field324.method2973();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field324.method2974(1);
                    if (var17 == 1) {
                        field341[var14][var15][var16] = field324.method2974(26);
                    } else {
                        field341[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field324.method2975();
        Statics.field1538 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1538[var18][var19] = field324.method2868();
            }
        }
        Statics.field217 = new int[var13];
        Statics.field86 = new int[var13];
        Statics.field1424 = new int[var13];
        Statics.field2284 = new byte[var13][];
        Statics.field1221 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field341[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field217[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field217[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field86[var20] = Statics.field787.method3076("m" + var29 + "_" + var30);
                            Statics.field1424[var20] = Statics.field787.method3076("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method200(var12, var11);
    }

    @ObfuscatedName("p.bc(IIB)V")
    public static final void method200(int arg0, int arg1) {
        if (Statics.field651 == arg0 && Statics.field26 == arg1) {
            return;
        }
        Statics.field651 = arg0;
        Statics.field26 = arg1;
        method168(25);
        method1826(class174.field2351, true);
        int var2 = Statics.field1792;
        int var3 = Statics.field663;
        Statics.field1792 = (arg0 - 6) * 8;
        Statics.field663 = (arg1 - 6) * 8;
        int var4 = Statics.field1792 - var2;
        int var5 = Statics.field663 - var3;
        int var6 = Statics.field1792;
        int var7 = Statics.field663;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field317[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field629[var10] -= var4;
                    var9.field641[var10] -= var5;
                }
                var9.field619 -= var4 * 128;
                var9.field609 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field399[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field629[var13] -= var4;
                    var12.field641[var13] -= var5;
                }
                var12.field619 -= var4 * 128;
                var12.field609 -= var5 * 128;
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
                        field409[var24][var20][var21] = field409[var24][var22][var23];
                    } else {
                        field409[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class26 var25 = (class26) field301.method2243(); var25 != null; var25 = (class26) field301.method2238()) {
            var25.field565 -= var4;
            var25.field566 -= var5;
            if (var25.field565 < 0 || var25.field566 < 0 || var25.field565 >= 104 || var25.field566 >= 104) {
                var25.method2214();
            }
        }
        if (field512 != 0) {
            field512 -= var4;
            field524 -= var5;
        }
        field462 = 0;
        field527 = false;
        field383 = -1;
        field412.method2219();
        field411.method2219();
        for (int var26 = 0; var26 < 4; var26++) {
            field339[var26].method2084();
        }
    }

    @ObfuscatedName("ef.bx(ZI)V")
    public static final void method2667(boolean arg0) {
        method34();
        field328++;
        if (field328 < 50 && !arg0) {
            return;
        }
        field328 = 0;
        if (field333 || Statics.field2658 == null) {
            return;
        }
        field322.method2993(212);
        try {
            Statics.field2658.method1935(field322.field2258, 0, field322.field2267);
            field322.field2267 = 0;
        } catch (IOException var2) {
            field333 = true;
        }
    }

    @ObfuscatedName("cn.bi(I)V")
    public static final void method1615() {
        method2667(false);
        field280 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2284.length; var1++) {
            if (Statics.field86[var1] != -1 && Statics.field2284[var1] == null) {
                Statics.field2284[var1] = Statics.field787.method3065(Statics.field86[var1], 0);
                if (Statics.field2284[var1] == null) {
                    var0 = false;
                    field280++;
                }
            }
            if (Statics.field1424[var1] != -1 && Statics.field1221[var1] == null) {
                Statics.field1221[var1] = Statics.field787.method3066(Statics.field1424[var1], 0, Statics.field1538[var1]);
                if (Statics.field1221[var1] == null) {
                    var0 = false;
                    field280++;
                }
            }
        }
        if (!var0) {
            field338 = 1;
            return;
        }
        field336 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2284.length; var3++) {
            byte[] var4 = Statics.field1221[var3];
            if (var4 != null) {
                int var5 = (Statics.field217[var3] >> 8) * 64 - Statics.field1792;
                int var6 = (Statics.field217[var3] & 0xFF) * 64 - Statics.field663;
                if (field549) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class161 var9 = new class161(var4);
                int var10 = -1;
                label672: while (true) {
                    int var11 = var9.method2745();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2745();
                            if (var16 == 0) {
                                continue label672;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2733() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class198 var22 = class198.method2703(var10);
                                if (var19 != 22 || !field279 || var22.field2911 != 0 || var22.field2902 == 1 || var22.field2913) {
                                    if (!var22.method3386()) {
                                        field336++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2745();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2733();
                    }
                }
            }
        }
        if (!var2) {
            field338 = 2;
            return;
        }
        if (field338 != 0) {
            method1826(class174.field2351 + class38.field781 + class38.field784 + 100 + "%" + class38.field782, true);
        }
        method34();
        method804();
        method34();
        Statics.field1114.method1621();
        method34();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field339[var23].method2084();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class12.field96[var24][var25][var26] = 0;
                }
            }
        }
        method34();
        class12.field116 = 99;
        Statics.field98 = new byte[4][104][104];
        Statics.field112 = new byte[4][104][104];
        Statics.field2767 = new byte[4][104][104];
        Statics.field100 = new byte[4][104][104];
        Statics.field56 = new int[4][105][105];
        Statics.field799 = new byte[4][105][105];
        Statics.field3154 = new int[105][105];
        Statics.field934 = new int[104];
        Statics.field101 = new int[104];
        Statics.field207 = new int[104];
        Statics.field63 = new int[104];
        Statics.field930 = new int[104];
        int var27 = Statics.field2284.length;
        for (class32 var28 = (class32) class32.field694.method2243(); var28 != null; var28 = (class32) class32.field694.method2238()) {
            if (var28.field701 != null) {
                Statics.field2291.method892(var28.field701);
                var28.field701 = null;
            }
            if (var28.field706 != null) {
                Statics.field2291.method892(var28.field706);
                var28.field706 = null;
            }
        }
        class32.field694.method2219();
        method2667(true);
        if (!field549) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field217[var29] >> 8) * 64 - Statics.field1792;
                int var31 = (Statics.field217[var29] & 0xFF) * 64 - Statics.field663;
                byte[] var32 = Statics.field2284[var29];
                if (var32 != null) {
                    method34();
                    int var33 = Statics.field651 * 8 - 48;
                    int var34 = Statics.field26 * 8 - 48;
                    class118[] var35 = field339;
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 64; var37++) {
                            for (int var38 = 0; var38 < 64; var38++) {
                                if (var30 + var37 > 0 && var30 + var37 < 103 && var31 + var38 > 0 && var31 + var38 < 103) {
                                    var35[var36].field1833[var30 + var37][var31 + var38] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class161 var39 = new class161(var32);
                    for (int var40 = 0; var40 < 4; var40++) {
                        for (int var41 = 0; var41 < 64; var41++) {
                            for (int var42 = 0; var42 < 64; var42++) {
                                class12.method203(var39, var40, var30 + var41, var31 + var42, var33, var34, 0);
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < var27; var43++) {
                int var44 = (Statics.field217[var43] >> 8) * 64 - Statics.field1792;
                int var45 = (Statics.field217[var43] & 0xFF) * 64 - Statics.field663;
                byte[] var46 = Statics.field2284[var43];
                if (var46 == null && Statics.field26 < 800) {
                    method34();
                    class12.method2969(var44, var45, 64, 64);
                }
            }
            method2667(true);
            for (int var47 = 0; var47 < var27; var47++) {
                byte[] var48 = Statics.field1221[var47];
                if (var48 != null) {
                    int var49 = (Statics.field217[var47] >> 8) * 64 - Statics.field1792;
                    int var50 = (Statics.field217[var47] & 0xFF) * 64 - Statics.field663;
                    method34();
                    class88 var51 = Statics.field1114;
                    class118[] var52 = field339;
                    class161 var53 = new class161(var48);
                    int var54 = -1;
                    while (true) {
                        int var55 = var53.method2745();
                        if (var55 == 0) {
                            break;
                        }
                        var54 += var55;
                        int var56 = 0;
                        while (true) {
                            int var57 = var53.method2745();
                            if (var57 == 0) {
                                break;
                            }
                            var56 += var57 - 1;
                            int var58 = var56 & 0x3F;
                            int var59 = var56 >> 6 & 0x3F;
                            int var60 = var56 >> 12;
                            int var61 = var53.method2733();
                            int var62 = var61 >> 2;
                            int var63 = var61 & 0x3;
                            int var64 = var49 + var59;
                            int var65 = var50 + var58;
                            if (var64 > 0 && var65 > 0 && var64 < 103 && var65 < 103) {
                                int var66 = var60;
                                if ((class12.field96[1][var64][var65] & 0x2) == 2) {
                                    var66 = var60 - 1;
                                }
                                class118 var67 = null;
                                if (var66 >= 0) {
                                    var67 = var52[var66];
                                }
                                class12.method2970(var60, var64, var65, var54, var63, var62, var51, var67);
                            }
                        }
                    }
                }
            }
        }
        if (field549) {
            for (int var68 = 0; var68 < 4; var68++) {
                method34();
                for (int var69 = 0; var69 < 13; var69++) {
                    for (int var70 = 0; var70 < 13; var70++) {
                        boolean var71 = false;
                        int var72 = field341[var68][var69][var70];
                        if (var72 != -1) {
                            int var73 = var72 >> 24 & 0x3;
                            int var74 = var72 >> 1 & 0x3;
                            int var75 = var72 >> 14 & 0x3FF;
                            int var76 = var72 >> 3 & 0x7FF;
                            int var77 = (var75 / 8 << 8) + var76 / 8;
                            for (int var78 = 0; var78 < Statics.field217.length; var78++) {
                                if (Statics.field217[var78] == var77 && Statics.field2284[var78] != null) {
                                    byte[] var79 = Statics.field2284[var78];
                                    int var80 = var69 * 8;
                                    int var81 = var70 * 8;
                                    int var82 = (var75 & 0x7) * 8;
                                    int var83 = (var76 & 0x7) * 8;
                                    class118[] var84 = field339;
                                    for (int var85 = 0; var85 < 8; var85++) {
                                        for (int var86 = 0; var86 < 8; var86++) {
                                            if (var80 + var85 > 0 && var80 + var85 < 103 && var81 + var86 > 0 && var81 + var86 < 103) {
                                                var84[var68].field1833[var80 + var85][var81 + var86] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class161 var87 = new class161(var79);
                                    for (int var88 = 0; var88 < 4; var88++) {
                                        for (int var89 = 0; var89 < 64; var89++) {
                                            for (int var90 = 0; var90 < 64; var90++) {
                                                if (var73 == var88 && var89 >= var82 && var89 < var82 + 8 && var90 >= var83 && var90 < var83 + 8) {
                                                    class12.method203(var87, var68, var80 + class150.method1795(var89 & 0x7, var90 & 0x7, var74), var81 + class150.method2431(var89 & 0x7, var90 & 0x7, var74), 0, 0, var74);
                                                } else {
                                                    class12.method203(var87, 0, -1, -1, 0, 0, 0);
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
                            int var91 = var68;
                            int var92 = var69 * 8;
                            int var93 = var70 * 8;
                            for (int var94 = 0; var94 < 8; var94++) {
                                for (int var95 = 0; var95 < 8; var95++) {
                                    class12.field115[var91][var92 + var94][var93 + var95] = 0;
                                }
                            }
                            if (var92 > 0) {
                                for (int var96 = 1; var96 < 8; var96++) {
                                    class12.field115[var91][var92][var93 + var96] = class12.field115[var91][var92 - 1][var93 + var96];
                                }
                            }
                            if (var93 > 0) {
                                for (int var97 = 1; var97 < 8; var97++) {
                                    class12.field115[var91][var92 + var97][var93] = class12.field115[var91][var92 + var97][var93 - 1];
                                }
                            }
                            if (var92 > 0 && class12.field115[var91][var92 - 1][var93] != 0) {
                                class12.field115[var91][var92][var93] = class12.field115[var91][var92 - 1][var93];
                            } else if (var93 > 0 && class12.field115[var91][var92][var93 - 1] != 0) {
                                class12.field115[var91][var92][var93] = class12.field115[var91][var92][var93 - 1];
                            } else if (var92 > 0 && var93 > 0 && class12.field115[var91][var92 - 1][var93 - 1] != 0) {
                                class12.field115[var91][var92][var93] = class12.field115[var91][var92 - 1][var93 - 1];
                            }
                        }
                    }
                }
            }
            for (int var98 = 0; var98 < 13; var98++) {
                for (int var99 = 0; var99 < 13; var99++) {
                    int var100 = field341[0][var98][var99];
                    if (var100 == -1) {
                        class12.method2969(var98 * 8, var99 * 8, 8, 8);
                    }
                }
            }
            method2667(true);
            for (int var101 = 0; var101 < 4; var101++) {
                method34();
                for (int var102 = 0; var102 < 13; var102++) {
                    label424: for (int var103 = 0; var103 < 13; var103++) {
                        int var104 = field341[var101][var102][var103];
                        if (var104 != -1) {
                            int var105 = var104 >> 24 & 0x3;
                            int var106 = var104 >> 1 & 0x3;
                            int var107 = var104 >> 14 & 0x3FF;
                            int var108 = var104 >> 3 & 0x7FF;
                            int var109 = (var107 / 8 << 8) + var108 / 8;
                            for (int var110 = 0; var110 < Statics.field217.length; var110++) {
                                if (Statics.field217[var110] == var109 && Statics.field1221[var110] != null) {
                                    byte[] var111 = Statics.field1221[var110];
                                    int var112 = var102 * 8;
                                    int var113 = var103 * 8;
                                    int var114 = (var107 & 0x7) * 8;
                                    int var115 = (var108 & 0x7) * 8;
                                    class88 var116 = Statics.field1114;
                                    class118[] var117 = field339;
                                    class161 var118 = new class161(var111);
                                    int var119 = -1;
                                    while (true) {
                                        int var120 = var118.method2745();
                                        if (var120 == 0) {
                                            continue label424;
                                        }
                                        var119 += var120;
                                        int var121 = 0;
                                        while (true) {
                                            int var122 = var118.method2745();
                                            if (var122 == 0) {
                                                break;
                                            }
                                            var121 += var122 - 1;
                                            int var123 = var121 & 0x3F;
                                            int var124 = var121 >> 6 & 0x3F;
                                            int var125 = var121 >> 12;
                                            int var126 = var118.method2733();
                                            int var127 = var126 >> 2;
                                            int var128 = var126 & 0x3;
                                            if (var105 == var125 && var124 >= var114 && var124 < var114 + 8 && var123 >= var115 && var123 < var115 + 8) {
                                                class198 var129 = class198.method2703(var119);
                                                int var131 = var124 & 0x7;
                                                int var132 = var123 & 0x7;
                                                int var134 = var129.field2919;
                                                int var135 = var129.field2891;
                                                if ((var128 & 0x1) == 1) {
                                                    int var136 = var134;
                                                    var134 = var135;
                                                    var135 = var136;
                                                }
                                                int var137 = var106 & 0x3;
                                                int var138;
                                                if (var137 == 0) {
                                                    var138 = var131;
                                                } else if (var137 == 1) {
                                                    var138 = var132;
                                                } else if (var137 == 2) {
                                                    var138 = 7 - var131 - (var134 - 1);
                                                } else {
                                                    var138 = 7 - var132 - (var135 - 1);
                                                }
                                                int var139 = var112 + var138;
                                                int var141 = var124 & 0x7;
                                                int var142 = var123 & 0x7;
                                                int var144 = var129.field2919;
                                                int var145 = var129.field2891;
                                                if ((var128 & 0x1) == 1) {
                                                    int var146 = var144;
                                                    var144 = var145;
                                                    var145 = var146;
                                                }
                                                int var147 = var106 & 0x3;
                                                int var148;
                                                if (var147 == 0) {
                                                    var148 = var142;
                                                } else if (var147 == 1) {
                                                    var148 = 7 - var141 - (var144 - 1);
                                                } else if (var147 == 2) {
                                                    var148 = 7 - var142 - (var145 - 1);
                                                } else {
                                                    var148 = var141;
                                                }
                                                int var149 = var113 + var148;
                                                if (var139 > 0 && var149 > 0 && var139 < 103 && var149 < 103) {
                                                    int var150 = var101;
                                                    if ((class12.field96[1][var139][var149] & 0x2) == 2) {
                                                        var150 = var101 - 1;
                                                    }
                                                    class118 var151 = null;
                                                    if (var150 >= 0) {
                                                        var151 = var117[var150];
                                                    }
                                                    class12.method2970(var101, var139, var149, var119, var106 + var128 & 0x3, var127, var116, var151);
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
        method2667(true);
        method804();
        method34();
        class12.method1806(Statics.field1114, field339);
        method2667(true);
        int var152 = class12.field116;
        if (var152 > Statics.field937) {
            var152 = Statics.field937;
        }
        if (var152 < Statics.field937 - 1) {
            int var153 = Statics.field937 - 1;
        }
        if (field279) {
            Statics.field1114.method1622(class12.field116);
        } else {
            Statics.field1114.method1622(0);
        }
        for (int var154 = 0; var154 < 104; var154++) {
            for (int var155 = 0; var155 < 104; var155++) {
                method161(var154, var155);
            }
        }
        method34();
        method613();
        class198.field2878.method2161();
        if (Statics.field1352 != null) {
            field322.method2993(101);
            field322.method2863(1057001181);
        }
        if (!field549) {
            int var156 = (Statics.field651 - 6) / 8;
            int var157 = (Statics.field651 + 6) / 8;
            int var158 = (Statics.field26 - 6) / 8;
            int var159 = (Statics.field26 + 6) / 8;
            for (int var160 = var156 - 1; var160 <= var157 + 1; var160++) {
                for (int var161 = var158 - 1; var161 <= var159 + 1; var161++) {
                    if (var160 < var156 || var160 > var157 || var161 < var158 || var161 > var159) {
                        Statics.field787.method3087("m" + var160 + "_" + var161);
                        Statics.field787.method3087("l" + var160 + "_" + var161);
                    }
                }
            }
        }
        method168(30);
        method34();
        class12.method202();
        field322.method2993(74);
        class114.method3241();
    }

    @ObfuscatedName("fl.bf(IS)V")
    public static final void method3050(int arg0) {
        int[] var1 = Statics.field57.field3202;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class12.field96[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1114.method1655(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class12.field96[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1114.method1655(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field57.method3858();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class12.field96[arg0][var10][var9] & 0x18) == 0) {
                    method2636(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class12.field96[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2636(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field508 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1114.method1650(Statics.field937, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method2703(var14).field2900;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field339[Statics.field937].field1833;
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
                        field511[field508] = Statics.field1649[var15];
                        field509[field508] = var16;
                        field510[field508] = var17;
                        field508++;
                    }
                }
            }
        }
        Statics.field144.method3819();
    }

    @ObfuscatedName("ee.bk(IIIIIB)V")
    public static final void method2636(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1114.method1647(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1114.method1651(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field57.field3202;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method2703(var12);
            if (var13.field2904 == -1) {
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
                class223 var14 = Statics.field235[var13.field2904];
                if (var14 != null) {
                    int var15 = (var13.field2919 * 4 - var14.field3191) / 2;
                    int var16 = (var13.field2891 * 4 - var14.field3192) / 2;
                    var14.method3829(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2891) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1114.method1754(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1114.method1651(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method2703(var21);
            if (var22.field2904 != -1) {
                class223 var23 = Statics.field235[var22.field2904];
                if (var23 != null) {
                    int var24 = (var22.field2919 * 4 - var23.field3191) / 2;
                    int var25 = (var22.field2891 * 4 - var23.field3192) / 2;
                    var23.method3829(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2891) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field57.field3202;
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
        int var29 = Statics.field1114.method1650(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method2703(var30);
        if (var31.field2904 == -1) {
            return;
        }
        class223 var32 = Statics.field235[var31.field2904];
        if (var32 != null) {
            int var33 = (var31.field2919 * 4 - var32.field3191) / 2;
            int var34 = (var31.field2891 * 4 - var32.field3192) / 2;
            var32.method3829(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2891) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ay.bp(B)V")
    public static final void method749() {
        if (field287 == 82) {
            int var0 = field324.method2769();
            int var1 = field324.method2898();
            int var2 = (var1 >> 4 & 0x7) + Statics.field200;
            int var3 = (var1 & 0x7) + Statics.field154;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class129 var4 = field409[Statics.field937][var2][var3];
                if (var4 != null) {
                    for (class44 var5 = (class44) var4.method2243(); var5 != null; var5 = (class44) var4.method2238()) {
                        if ((var0 & 0x7FFF) == var5.field887) {
                            var5.method2214();
                            break;
                        }
                    }
                    if (var4.method2243() == null) {
                        field409[Statics.field937][var2][var3] = null;
                    }
                    method161(var2, var3);
                }
            }
        } else if (field287 == 115) {
            int var6 = field324.method2733();
            int var7 = (var6 >> 4 & 0x7) + Statics.field200;
            int var8 = (var6 & 0x7) + Statics.field154;
            int var9 = field324.method2735();
            int var10 = field324.method2735();
            int var11 = field324.method2735();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class129 var12 = field409[Statics.field937][var7][var8];
                if (var12 != null) {
                    for (class44 var13 = (class44) var12.method2243(); var13 != null; var13 = (class44) var12.method2238()) {
                        if ((var9 & 0x7FFF) == var13.field887 && var13.field885 == var10) {
                            var13.field885 = var11;
                            break;
                        }
                    }
                    method161(var7, var8);
                }
            }
        } else if (field287 == 141) {
            int var14 = field324.method2898();
            int var15 = (var14 >> 4 & 0x7) + Statics.field200;
            int var16 = (var14 & 0x7) + Statics.field154;
            int var17 = field324.method2898();
            int var18 = var17 >> 2;
            int var19 = var17 & 0x3;
            int var20 = field541[var18];
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                method41(Statics.field937, var15, var16, var20, -1, var18, var19, 0, -1);
            }
        } else if (field287 == 160) {
            int var21 = field324.method2733();
            int var22 = (var21 >> 4 & 0x7) + Statics.field200;
            int var23 = (var21 & 0x7) + Statics.field154;
            int var24 = field324.method2735();
            int var25 = field324.method2733();
            int var26 = field324.method2735();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                int var27 = var22 * 128 + 64;
                int var28 = var23 * 128 + 64;
                class34 var29 = new class34(var24, Statics.field937, var27, var28, method1789(var27, var28, Statics.field937) - var25, var26, field454);
                field412.method2220(var29);
            }
        } else if (field287 == 165) {
            int var30 = field324.method2769();
            int var31 = field324.method2768();
            int var32 = field324.method2898();
            int var33 = (var32 >> 4 & 0x7) + Statics.field200;
            int var34 = (var32 & 0x7) + Statics.field154;
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                class44 var35 = new class44();
                var35.field887 = var31;
                var35.field885 = var30;
                if (field409[Statics.field937][var33][var34] == null) {
                    field409[Statics.field937][var33][var34] = new class129();
                }
                field409[Statics.field937][var33][var34].method2220(var35);
                method161(var33, var34);
            }
        } else if (field287 == 77) {
            int var36 = field324.method2733();
            int var37 = (var36 >> 4 & 0x7) + Statics.field200;
            int var38 = (var36 & 0x7) + Statics.field154;
            int var39 = var37 + field324.method2734();
            int var40 = var38 + field324.method2734();
            int var41 = field324.method2736();
            int var42 = field324.method2735();
            int var43 = field324.method2733() * 4;
            int var44 = field324.method2733() * 4;
            int var45 = field324.method2735();
            int var46 = field324.method2735();
            int var47 = field324.method2733();
            int var48 = field324.method2733();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104 && var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var42 != 65535) {
                int var49 = var37 * 128 + 64;
                int var50 = var38 * 128 + 64;
                int var51 = var39 * 128 + 64;
                int var52 = var40 * 128 + 64;
                class43 var53 = new class43(var42, Statics.field937, var49, var50, method1789(var49, var50, Statics.field937) - var43, field454 + var45, field454 + var46, var47, var48, var41, var44);
                var53.method790(var51, var52, method1789(var51, var52, Statics.field937) - var44, field454 + var45);
                field411.method2220(var53);
            }
        } else if (field287 == 136) {
            int var54 = field324.method2759();
            int var55 = var54 >> 2;
            int var56 = var54 & 0x3;
            int var57 = field541[var55];
            int var58 = field324.method2843();
            int var59 = field324.method2759();
            int var60 = (var59 >> 4 & 0x7) + Statics.field200;
            int var61 = (var59 & 0x7) + Statics.field154;
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                method41(Statics.field937, var60, var61, var57, var58, var55, var56, 0, -1);
            }
        } else if (field287 == 234) {
            int var62 = field324.method2898();
            int var63 = var62 >> 2;
            int var64 = var62 & 0x3;
            int var65 = field541[var63];
            int var66 = field324.method2769();
            int var67 = field324.method2760();
            int var68 = (var67 >> 4 & 0x7) + Statics.field200;
            int var69 = (var67 & 0x7) + Statics.field154;
            if (var68 >= 0 && var69 >= 0 && var68 < 103 && var69 < 103) {
                if (var65 == 0) {
                    class91 var70 = Statics.field1114.method1643(Statics.field937, var68, var69);
                    if (var70 != null) {
                        int var71 = var70.field1553 >> 14 & 0x7FFF;
                        if (var63 == 2) {
                            var70.field1551 = new class50(var71, 2, var64 + 4, Statics.field937, var68, var69, var66, false, var70.field1551);
                            var70.field1552 = new class50(var71, 2, var64 + 1 & 0x3, Statics.field937, var68, var69, var66, false, var70.field1552);
                        } else {
                            var70.field1551 = new class50(var71, var63, var64, Statics.field937, var68, var69, var66, false, var70.field1551);
                        }
                    }
                }
                if (var65 == 1) {
                    class96 var72 = Statics.field1114.method1644(Statics.field937, var68, var69);
                    if (var72 != null) {
                        int var73 = var72.field1603 >> 14 & 0x7FFF;
                        if (var63 == 4 || var63 == 5) {
                            var72.field1601 = new class50(var73, 4, var64, Statics.field937, var68, var69, var66, false, var72.field1601);
                        } else if (var63 == 6) {
                            var72.field1601 = new class50(var73, 4, var64 + 4, Statics.field937, var68, var69, var66, false, var72.field1601);
                        } else if (var63 == 7) {
                            var72.field1601 = new class50(var73, 4, (var64 + 2 & 0x3) + 4, Statics.field937, var68, var69, var66, false, var72.field1601);
                        } else if (var63 == 8) {
                            var72.field1601 = new class50(var73, 4, var64 + 4, Statics.field937, var68, var69, var66, false, var72.field1601);
                            var72.field1602 = new class50(var73, 4, (var64 + 2 & 0x3) + 4, Statics.field937, var68, var69, var66, false, var72.field1602);
                        }
                    }
                }
                if (var65 == 2) {
                    class97 var74 = Statics.field1114.method1645(Statics.field937, var68, var69);
                    if (var63 == 11) {
                        var63 = 10;
                    }
                    if (var74 != null) {
                        var74.field1620 = new class50(var74.field1617 >> 14 & 0x7FFF, var63, var64, Statics.field937, var68, var69, var66, false, var74.field1620);
                    }
                }
                if (var65 == 3) {
                    class79 var75 = Statics.field1114.method1646(Statics.field937, var68, var69);
                    if (var75 != null) {
                        var75.field1294 = new class50(var75.field1298 >> 14 & 0x7FFF, 22, var64, Statics.field937, var68, var69, var66, false, var75.field1294);
                    }
                }
            }
        } else {
            if (field287 == 194) {
                byte var76 = field324.method2764();
                byte var77 = field324.method2762();
                int var78 = field324.method2735();
                int var79 = field324.method2735();
                int var80 = field324.method2769();
                byte var81 = field324.method2762();
                byte var82 = field324.method2763();
                int var83 = field324.method2759();
                int var84 = var83 >> 2;
                int var85 = var83 & 0x3;
                int var86 = field541[var84];
                int var87 = field324.method2843();
                int var88 = field324.method2760();
                int var89 = (var88 >> 4 & 0x7) + Statics.field200;
                int var90 = (var88 & 0x7) + Statics.field154;
                class24 var91;
                if (field473 == var79) {
                    var91 = Statics.field1425;
                } else {
                    var91 = field399[var79];
                }
                if (var91 != null) {
                    class198 var92 = class198.method2703(var78);
                    int var93;
                    int var94;
                    if (var85 == 1 || var85 == 3) {
                        var93 = var92.field2891;
                        var94 = var92.field2919;
                    } else {
                        var93 = var92.field2919;
                        var94 = var92.field2891;
                    }
                    int var95 = (var93 >> 1) + var89;
                    int var96 = (var93 + 1 >> 1) + var89;
                    int var97 = (var94 >> 1) + var90;
                    int var98 = (var94 + 1 >> 1) + var90;
                    int[][] var99 = class12.field115[Statics.field937];
                    int var100 = var99[var95][var97] + var99[var96][var97] + var99[var95][var98] + var99[var96][var98] >> 2;
                    int var101 = (var89 << 7) + (var93 << 6);
                    int var102 = (var90 << 7) + (var94 << 6);
                    class83 var103 = var92.method3388(var84, var85, var99, var101, var100, var102);
                    if (var103 != null) {
                        method41(Statics.field937, var89, var90, var86, -1, 0, 0, var80 + 1, var87 + 1);
                        var91.field268 = field454 + var80;
                        var91.field252 = field454 + var87;
                        var91.field248 = var103;
                        var91.field253 = var89 * 128 + var93 * 64;
                        var91.field259 = var90 * 128 + var94 * 64;
                        var91.field256 = var100;
                        if (var82 > var81) {
                            byte var104 = var82;
                            var82 = var81;
                            var81 = var104;
                        }
                        if (var76 > var77) {
                            byte var105 = var76;
                            var76 = var77;
                            var77 = var105;
                        }
                        var91.field265 = var82 + var89;
                        var91.field251 = var81 + var89;
                        var91.field255 = var76 + var90;
                        var91.field260 = var77 + var90;
                    }
                }
            }
            if (field287 == 197) {
                int var106 = field324.method2733();
                int var107 = (var106 >> 4 & 0x7) + Statics.field200;
                int var108 = (var106 & 0x7) + Statics.field154;
                int var109 = field324.method2735();
                int var110 = field324.method2733();
                int var111 = var110 >> 4 & 0xF;
                int var112 = var110 & 0x7;
                int var113 = field324.method2733();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var114 = var111 + 1;
                    if (Statics.field1425.field629[0] >= var107 - var114 && Statics.field1425.field629[0] <= var107 + var114 && Statics.field1425.field641[0] >= var108 - var114 && Statics.field1425.field641[0] <= var108 + var114 && field513 != 0 && var112 > 0 && field462 < 50) {
                        field474[field462] = var109;
                        field523[field462] = var112;
                        field534[field462] = var113;
                        field401[field462] = null;
                        field525[field462] = (var107 << 16) + (var108 << 8) + var111;
                        field462++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.br(IIIIIIIIII)V")
    public static final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field301.method2243(); var10 != null; var10 = (class26) field301.method2238()) {
            if (var10.field576 == arg0 && var10.field565 == arg1 && var10.field566 == arg2 && var10.field564 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field576 = arg0;
            var9.field564 = arg3;
            var9.field565 = arg1;
            var9.field566 = arg2;
            method3060(var9);
            field301.method2220(var9);
        }
        var9.field570 = arg4;
        var9.field572 = arg5;
        var9.field571 = arg6;
        var9.field567 = arg7;
        var9.field574 = arg8;
    }

    @ObfuscatedName("x.be(I)V")
    public static final void method613() {
        for (class26 var0 = (class26) field301.method2243(); var0 != null; var0 = (class26) field301.method2238()) {
            if (var0.field574 == -1) {
                var0.field567 = 0;
                method3060(var0);
            } else {
                var0.method2214();
            }
        }
    }

    @ObfuscatedName("fu.bw(Lx;I)V")
    public static final void method3060(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field564 == 0) {
            var1 = Statics.field1114.method1647(arg0.field576, arg0.field565, arg0.field566);
        }
        if (arg0.field564 == 1) {
            var1 = Statics.field1114.method1648(arg0.field576, arg0.field565, arg0.field566);
        }
        if (arg0.field564 == 2) {
            var1 = Statics.field1114.method1754(arg0.field576, arg0.field565, arg0.field566);
        }
        if (arg0.field564 == 3) {
            var1 = Statics.field1114.method1650(arg0.field576, arg0.field565, arg0.field566);
        }
        if (var1 != 0) {
            int var5 = Statics.field1114.method1651(arg0.field576, arg0.field565, arg0.field566, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field563 = var2;
        arg0.field573 = var3;
        arg0.field568 = var4;
    }

    @ObfuscatedName("fn.bj(I)V")
    public static final void method3051() {
        for (class26 var0 = (class26) field301.method2243(); var0 != null; var0 = (class26) field301.method2238()) {
            if (var0.field574 > 0) {
                var0.field574--;
            }
            if (var0.field574 != 0) {
                if (var0.field567 > 0) {
                    var0.field567--;
                }
                if (var0.field567 == 0 && var0.field565 >= 1 && var0.field566 >= 1 && var0.field565 <= 102 && var0.field566 <= 102 && (var0.field570 < 0 || class12.method127(var0.field570, var0.field572))) {
                    method792(var0.field576, var0.field564, var0.field565, var0.field566, var0.field570, var0.field571, var0.field572);
                    var0.field567 = -1;
                    if (var0.field570 == var0.field563 && var0.field563 == -1) {
                        var0.method2214();
                    } else if (var0.field570 == var0.field563 && var0.field571 == var0.field568 && var0.field573 == var0.field572) {
                        var0.method2214();
                    }
                }
            } else if (var0.field563 < 0 || class12.method127(var0.field563, var0.field573)) {
                method792(var0.field576, var0.field564, var0.field565, var0.field566, var0.field563, var0.field568, var0.field573);
                var0.method2214();
            }
        }
    }

    @ObfuscatedName("au.bs(IIIIIIII)V")
    public static final void method792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field279 && Statics.field937 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1114.method1647(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1114.method1648(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1114.method1754(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1114.method1650(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1114.method1651(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1114.method1638(arg0, arg2, arg3);
                class198 var15 = class198.method2703(var12);
                if (var15.field2902 != 0) {
                    field339[arg0].method2112(arg2, arg3, var13, var14, var15.field2877);
                }
            }
            if (arg1 == 1) {
                Statics.field1114.method1639(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1114.method1640(arg0, arg2, arg3);
                class198 var16 = class198.method2703(var12);
                if (var16.field2919 + arg2 > 103 || var16.field2919 + arg3 > 103 || var16.field2891 + arg2 > 103 || var16.field2891 + arg3 > 103) {
                    return;
                }
                if (var16.field2902 != 0) {
                    field339[arg0].method2093(arg2, arg3, var16.field2919, var16.field2891, var14, var16.field2877);
                }
            }
            if (arg1 == 3) {
                Statics.field1114.method1641(arg0, arg2, arg3);
                class198 var17 = class198.method2703(var12);
                if (var17.field2902 == 1) {
                    field339[arg0].method2092(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class12.field96[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field1114;
        class118 var20 = field339[arg0];
        class198 var21 = class198.method2703(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2891;
            var23 = var21.field2919;
        } else {
            var22 = var21.field2919;
            var23 = var21.field2891;
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
        int[][] var28 = class12.field115[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2911 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2915 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var34 = var21.method3388(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1627(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2902 == 1) {
                var20.method2114(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var57 = var21.method3388(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1670(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2902 != 0) {
                var20.method2083(arg2, arg3, var22, var23, var21.field2877);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var35 = var21.method3388(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1670(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2902 != 0) {
                var20.method2083(arg2, arg3, var22, var23, var21.field2877);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var36 = var21.method3388(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1629(arg0, arg2, arg3, var29, var36, (class90) null, class12.field108[arg5], 0, var32, var33);
            if (var21.field2902 != 0) {
                var20.method2089(arg2, arg3, arg6, arg5, var21.field2877);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var37 = var21.method3388(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1629(arg0, arg2, arg3, var29, var37, (class90) null, class12.field117[arg5], 0, var32, var33);
            if (var21.field2902 != 0) {
                var20.method2089(arg2, arg3, arg6, arg5, var21.field2877);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var39 = var21.method3388(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3388(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2887, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1629(arg0, arg2, arg3, var29, var39, var40, class12.field108[arg5], class12.field108[var38], var32, var33);
            if (var21.field2902 != 0) {
                var20.method2089(arg2, arg3, arg6, arg5, var21.field2877);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var41 = var21.method3388(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1629(arg0, arg2, arg3, var29, var41, (class90) null, class12.field117[arg5], 0, var32, var33);
            if (var21.field2902 != 0) {
                var20.method2089(arg2, arg3, arg6, arg5, var21.field2877);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var42 = var21.method3388(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1670(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2902 != 0) {
                var20.method2083(arg2, arg3, var22, var23, var21.field2877);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var43 = var21.method3388(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1630(arg0, arg2, arg3, var29, var43, (class90) null, class12.field108[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1647(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class198.method2703(var45 >> 14 & 0x7FFF).field2899;
            }
            class90 var46;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var46 = var21.method3388(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1630(arg0, arg2, arg3, var29, var46, (class90) null, class12.field108[arg5], 0, class12.field104[arg5] * var44, class12.field105[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1647(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class198.method2703(var48 >> 14 & 0x7FFF).field2899 / 2;
            }
            class90 var49;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var49 = var21.method3388(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1630(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class12.field106[arg5] * var47, class12.field99[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var51 = var21.method3388(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1630(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1647(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class198.method2703(var53 >> 14 & 0x7FFF).field2899 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2887 == -1 && var21.field2916 == null) {
                var55 = var21.method3388(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3388(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2887, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2887, true, (class90) null);
            }
            var19.method1630(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class12.field106[arg5] * var52, class12.field99[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("g.ba(III)V")
    public static final void method161(int arg0, int arg1) {
        class129 var2 = field409[Statics.field937][arg0][arg1];
        if (var2 == null) {
            Statics.field1114.method1768(Statics.field937, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2243(); var6 != null; var6 = (class44) var2.method2238()) {
            class199 var7 = class199.method2569(var6.field887);
            long var8 = (long) var7.field2955;
            if (var7.field2968 == 1) {
                var8 = (long) (var6.field885 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1114.method1768(Statics.field937, arg0, arg1);
            return;
        }
        var2.method2221(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2243(); var12 != null; var12 = (class44) var2.method2238()) {
            if (var5.field887 != var12.field887) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field887 != var12.field887 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1114.method1628(Statics.field937, arg0, arg1, method1789(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field937), var5, var13, var10, var11);
    }

    @ObfuscatedName("r.bn(ZI)V")
    public static final void method44(boolean arg0) {
        field402 = 0;
        field312 = 0;
        field324.method2973();
        int var1 = field324.method2974(8);
        if (var1 < field318) {
            for (int var2 = var1; var2 < field318; var2++) {
                field403[++field402 - 1] = field555[var2];
            }
        }
        if (var1 > field318) {
            throw new RuntimeException("");
        }
        field318 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field555[var3];
            class36 var5 = field317[var4];
            int var6 = field324.method2974(1);
            if (var6 == 0) {
                field555[++field318 - 1] = var4;
                var5.field640 = field454;
            } else {
                int var7 = field324.method2974(2);
                if (var7 == 0) {
                    field555[++field318 - 1] = var4;
                    var5.field640 = field454;
                    field321[++field312 - 1] = var4;
                } else if (var7 == 1) {
                    field555[++field318 - 1] = var4;
                    var5.field640 = field454;
                    int var8 = field324.method2974(3);
                    var5.method727(var8, (byte) 1);
                    int var9 = field324.method2974(1);
                    if (var9 == 1) {
                        field321[++field312 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field555[++field318 - 1] = var4;
                    var5.field640 = field454;
                    int var10 = field324.method2974(3);
                    var5.method727(var10, (byte) 2);
                    int var11 = field324.method2974(3);
                    var5.method727(var11, (byte) 2);
                    int var12 = field324.method2974(1);
                    if (var12 == 1) {
                        field321[++field312 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field403[++field402 - 1] = var4;
                }
            }
        }
        method42(arg0);
        method230();
        for (int var13 = 0; var13 < field402; var13++) {
            int var14 = field403[var13];
            if (field454 != field317[var14].field640) {
                field317[var14].field764 = null;
                field317[var14] = null;
            }
        }
        if (field325 != field324.field2267) {
            throw new RuntimeException(field324.field2267 + class38.field779 + field325);
        }
        for (int var15 = 0; var15 < field318; var15++) {
            if (field317[field555[var15]] == null) {
                throw new RuntimeException(var15 + class38.field779 + field318);
            }
        }
    }

    @ObfuscatedName("r.bv(ZB)V")
    public static final void method42(boolean arg0) {
        while (true) {
            if (field324.method2976(field325) >= 27) {
                int var1 = field324.method2974(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field317[var1] == null) {
                        field317[var1] = new class36();
                        var2 = true;
                    }
                    class36 var3 = field317[var1];
                    field555[++field318 - 1] = var1;
                    var3.field640 = field454;
                    int var4 = field324.method2974(1);
                    int var5 = field407[field324.method2974(3)];
                    if (var2) {
                        var3.field642 = var3.field596 = var5;
                    }
                    int var6 = field324.method2974(1);
                    if (var6 == 1) {
                        field321[++field312 - 1] = var1;
                    }
                    int var7;
                    if (arg0) {
                        var7 = field324.method2974(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field324.method2974(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    var3.field764 = class200.method818(field324.method2974(14));
                    int var8;
                    if (arg0) {
                        var8 = field324.method2974(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field324.method2974(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field598 = var3.field764.field2988;
                    var3.field644 = var3.field764.field2985;
                    if (var3.field644 == 0) {
                        var3.field596 = 0;
                    }
                    var3.field599 = var3.field764.field2994;
                    var3.field600 = var3.field764.field3008;
                    var3.field601 = var3.field764.field2996;
                    var3.field602 = var3.field764.field2997;
                    var3.field652 = var3.field764.field2991;
                    var3.field597 = var3.field764.field2992;
                    var3.field643 = var3.field764.field2993;
                    var3.method726(Statics.field1425.field629[0] + var7, Statics.field1425.field641[0] + var8, var4 == 1);
                    continue;
                }
            }
            field324.method2975();
            return;
        }
    }

    @ObfuscatedName("m.bt(I)V")
    public static final void method230() {
        for (int var0 = 0; var0 < field312; var0++) {
            int var1 = field321[var0];
            class36 var2 = field317[var1];
            int var3 = field324.method2733();
            if ((var3 & 0x10) != 0) {
                int var4 = field324.method2768();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field324.method2898();
                if (var2.field623 == var4 && var4 != -1) {
                    int var6 = class202.method1368(var4).field3051;
                    if (var6 == 1) {
                        var2.field624 = 0;
                        var2.field625 = 0;
                        var2.field626 = var5;
                        var2.field591 = 0;
                    }
                    if (var6 == 2) {
                        var2.field591 = 0;
                    }
                } else if (var4 == -1 || var2.field623 == -1 || class202.method1368(var4).field3041 >= class202.method1368(var2.field623).field3041) {
                    var2.field623 = var4;
                    var2.field624 = 0;
                    var2.field625 = 0;
                    var2.field626 = var5;
                    var2.field591 = 0;
                    var2.field646 = var2.field645;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var7 = field324.method2735();
                int var8 = field324.method2735();
                int var9 = var2.field619 - (var7 - Statics.field1792 - Statics.field1792) * 64;
                int var10 = var2.field609 - (var8 - Statics.field663 - Statics.field663) * 64;
                if (var9 != 0 || var10 != 0) {
                    var2.field636 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field627 = field324.method2768();
                if (var2.field627 == 65535) {
                    var2.field627 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field764 = class200.method818(field324.method2769());
                var2.field598 = var2.field764.field2988;
                var2.field644 = var2.field764.field2985;
                var2.field599 = var2.field764.field2994;
                var2.field600 = var2.field764.field3008;
                var2.field601 = var2.field764.field2996;
                var2.field602 = var2.field764.field2997;
                var2.field652 = var2.field764.field2991;
                var2.field597 = var2.field764.field2992;
                var2.field643 = var2.field764.field2993;
            }
            if ((var3 & 0x40) != 0) {
                var2.field628 = field324.method2843();
                int var11 = field324.method2778();
                var2.field632 = var11 >> 16;
                var2.field631 = (var11 & 0xFFFF) + field454;
                var2.field648 = 0;
                var2.field630 = 0;
                if (var2.field631 > field454) {
                    var2.field648 = -1;
                }
                if (var2.field628 == 65535) {
                    var2.field628 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field604 = field324.method2740();
                var2.field607 = 100;
            }
            if ((var3 & 0x4) != 0) {
                int var12 = field324.method2759();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = field324.method2745();
                        if (var17 == 32767) {
                            var17 = field324.method2745();
                            var15 = field324.method2745();
                            var14 = field324.method2745();
                            var16 = field324.method2745();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = field324.method2745();
                        }
                        int var18 = field324.method2745();
                        var2.method627(var17, var15, var14, var16, field454, var18);
                    }
                }
                int var19 = field324.method2898();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = field324.method2745();
                        int var22 = field324.method2745();
                        if (var22 == 32767) {
                            var2.method628(var21);
                        } else {
                            int var23 = field324.method2745();
                            int var24 = field324.method2898();
                            int var25 = var22 > 0 ? field324.method2759() : var24;
                            var2.method625(var21, field454, var22, var23, var24, var25);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.bu(Le;IIBB)V")
    public static final void method875(class24 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field629[0];
        int var5 = arg0.field641[0];
        int var6 = arg0.method237();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method237();
        field558.field1847 = arg1;
        field558.field1848 = arg2;
        field558.field1849 = 1;
        field558.field1851 = 1;
        class23 var8 = field558;
        class23 var9 = var8;
        class118 var10 = field339[arg0.field264];
        int[] var11 = field533;
        int[] var12 = field464;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class119.field1839[var13][var14] = 0;
                class119.field1841[var13][var14] = 99999999;
            }
        }
        boolean var30;
        if (var7 == 1) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class119.field1839[var17][var18] = 99;
            class119.field1841[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class119.field1843[var21] = var4;
            int var79 = var21 + 1;
            class119.field1844[var21] = var5;
            int[][] var23 = var10.field1833;
            boolean var28;
            while (true) {
                if (var79 == var22) {
                    Statics.field1845 = var15;
                    Statics.field1723 = var16;
                    var28 = false;
                    break;
                }
                var15 = class119.field1843[var22];
                var16 = class119.field1844[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var10.field1829;
                int var27 = var16 - var10.field1830;
                if (var9.method224(1, var15, var16, var10)) {
                    Statics.field1845 = var15;
                    Statics.field1723 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class119.field1841[var24][var25] + 1;
                if (var24 > 0 && class119.field1839[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                    class119.field1843[var79] = var15 - 1;
                    class119.field1844[var79] = var16;
                    var79 = var79 + 1 & 0xFFF;
                    class119.field1839[var24 - 1][var25] = 2;
                    class119.field1841[var24 - 1][var25] = var29;
                }
                if (var24 < 127 && class119.field1839[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                    class119.field1843[var79] = var15 + 1;
                    class119.field1844[var79] = var16;
                    var79 = var79 + 1 & 0xFFF;
                    class119.field1839[var24 + 1][var25] = 8;
                    class119.field1841[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class119.field1839[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class119.field1843[var79] = var15;
                    class119.field1844[var79] = var16 - 1;
                    var79 = var79 + 1 & 0xFFF;
                    class119.field1839[var24][var25 - 1] = 1;
                    class119.field1841[var24][var25 - 1] = var29;
                }
                if (var25 < 127 && class119.field1839[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class119.field1843[var79] = var15;
                    class119.field1844[var79] = var16 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class119.field1839[var24][var25 + 1] = 4;
                    class119.field1841[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class119.field1839[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class119.field1843[var79] = var15 - 1;
                    class119.field1844[var79] = var16 - 1;
                    var79 = var79 + 1 & 0xFFF;
                    class119.field1839[var24 - 1][var25 - 1] = 3;
                    class119.field1841[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 127 && var25 > 0 && class119.field1839[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class119.field1843[var79] = var15 + 1;
                    class119.field1844[var79] = var16 - 1;
                    var79 = var79 + 1 & 0xFFF;
                    class119.field1839[var24 + 1][var25 - 1] = 9;
                    class119.field1841[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 127 && class119.field1839[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class119.field1843[var79] = var15 - 1;
                    class119.field1844[var79] = var16 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class119.field1839[var24 - 1][var25 + 1] = 6;
                    class119.field1841[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 127 && var25 < 127 && class119.field1839[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class119.field1843[var79] = var15 + 1;
                    class119.field1844[var79] = var16 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class119.field1839[var24 + 1][var25 + 1] = 12;
                    class119.field1841[var24 + 1][var25 + 1] = var29;
                }
            }
            var30 = var28;
        } else if (var7 == 2) {
            var30 = class119.method1800(var4, var5, var8, var10);
        } else {
            int var31 = var4;
            int var32 = var5;
            byte var33 = 64;
            byte var34 = 64;
            int var35 = var4 - var33;
            int var36 = var5 - var34;
            class119.field1839[var33][var34] = 99;
            class119.field1841[var33][var34] = 0;
            byte var37 = 0;
            int var38 = 0;
            class119.field1843[var37] = var4;
            int var80 = var37 + 1;
            class119.field1844[var37] = var5;
            int[][] var39 = var10.field1833;
            boolean var44;
            label514: while (true) {
                label512: while (true) {
                    int var40;
                    int var41;
                    int var42;
                    int var43;
                    int var45;
                    do {
                        do {
                            do {
                                label489: do {
                                    if (var80 == var38) {
                                        Statics.field1845 = var31;
                                        Statics.field1723 = var32;
                                        var44 = false;
                                        break label514;
                                    }
                                    var31 = class119.field1843[var38];
                                    var32 = class119.field1844[var38];
                                    var38 = var38 + 1 & 0xFFF;
                                    var40 = var31 - var35;
                                    var41 = var32 - var36;
                                    var42 = var31 - var10.field1829;
                                    var43 = var32 - var10.field1830;
                                    if (var9.method224(var7, var31, var32, var10)) {
                                        Statics.field1845 = var31;
                                        Statics.field1723 = var32;
                                        var44 = true;
                                        break label514;
                                    }
                                    var45 = class119.field1841[var40][var41] + 1;
                                    if (var40 > 0 && class119.field1839[var40 - 1][var41] == 0 && (var39[var42 - 1][var43] & 0x124010E) == 0 && (var39[var42 - 1][var7 + var43 - 1] & 0x1240138) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class119.field1843[var80] = var31 - 1;
                                                class119.field1844[var80] = var32;
                                                var80 = var80 + 1 & 0xFFF;
                                                class119.field1839[var40 - 1][var41] = 2;
                                                class119.field1841[var40 - 1][var41] = var45;
                                                break;
                                            }
                                            if ((var39[var42 - 1][var43 + var46] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class119.field1839[var40 + 1][var41] == 0 && (var39[var7 + var42][var43] & 0x1240183) == 0 && (var39[var7 + var42][var7 + var43 - 1] & 0x12401E0) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class119.field1843[var80] = var31 + 1;
                                                class119.field1844[var80] = var32;
                                                var80 = var80 + 1 & 0xFFF;
                                                class119.field1839[var40 + 1][var41] = 8;
                                                class119.field1841[var40 + 1][var41] = var45;
                                                break;
                                            }
                                            if ((var39[var7 + var42][var43 + var47] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var41 > 0 && class119.field1839[var40][var41 - 1] == 0 && (var39[var42][var43 - 1] & 0x124010E) == 0 && (var39[var7 + var42 - 1][var43 - 1] & 0x1240183) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class119.field1843[var80] = var31;
                                                class119.field1844[var80] = var32 - 1;
                                                var80 = var80 + 1 & 0xFFF;
                                                class119.field1839[var40][var41 - 1] = 1;
                                                class119.field1841[var40][var41 - 1] = var45;
                                                break;
                                            }
                                            if ((var39[var42 + var48][var43 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var41 < 128 - var7 && class119.field1839[var40][var41 + 1] == 0 && (var39[var42][var7 + var43] & 0x1240138) == 0 && (var39[var7 + var42 - 1][var7 + var43] & 0x12401E0) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7 - 1) {
                                                class119.field1843[var80] = var31;
                                                class119.field1844[var80] = var32 + 1;
                                                var80 = var80 + 1 & 0xFFF;
                                                class119.field1839[var40][var41 + 1] = 4;
                                                class119.field1841[var40][var41 + 1] = var45;
                                                break;
                                            }
                                            if ((var39[var42 + var49][var7 + var43] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var40 > 0 && var41 > 0 && class119.field1839[var40 - 1][var41 - 1] == 0 && (var39[var42 - 1][var43 - 1] & 0x124010E) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class119.field1843[var80] = var31 - 1;
                                                class119.field1844[var80] = var32 - 1;
                                                var80 = var80 + 1 & 0xFFF;
                                                class119.field1839[var40 - 1][var41 - 1] = 3;
                                                class119.field1841[var40 - 1][var41 - 1] = var45;
                                                break;
                                            }
                                            if ((var39[var42 - 1][var43 - 1 + var50] & 0x124013E) != 0 || (var39[var42 - 1 + var50][var43 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && var41 > 0 && class119.field1839[var40 + 1][var41 - 1] == 0 && (var39[var7 + var42][var43 - 1] & 0x1240183) == 0) {
                                        int var51 = 1;
                                        while (true) {
                                            if (var51 >= var7) {
                                                class119.field1843[var80] = var31 + 1;
                                                class119.field1844[var80] = var32 - 1;
                                                var80 = var80 + 1 & 0xFFF;
                                                class119.field1839[var40 + 1][var41 - 1] = 9;
                                                class119.field1841[var40 + 1][var41 - 1] = var45;
                                                break;
                                            }
                                            if ((var39[var7 + var42][var43 - 1 + var51] & 0x12401E3) != 0 || (var39[var42 + var51][var43 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var51++;
                                        }
                                    }
                                    if (var40 > 0 && var41 < 128 - var7 && class119.field1839[var40 - 1][var41 + 1] == 0 && (var39[var42 - 1][var7 + var43] & 0x1240138) == 0) {
                                        for (int var52 = 1; var52 < var7; var52++) {
                                            if ((var39[var42 - 1][var43 + var52] & 0x124013E) != 0 || (var39[var42 - 1 + var52][var7 + var43] & 0x12401F8) != 0) {
                                                continue label489;
                                            }
                                        }
                                        class119.field1843[var80] = var31 - 1;
                                        class119.field1844[var80] = var32 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class119.field1839[var40 - 1][var41 + 1] = 6;
                                        class119.field1841[var40 - 1][var41 + 1] = var45;
                                    }
                                } while (var40 >= 128 - var7);
                            } while (var41 >= 128 - var7);
                        } while (class119.field1839[var40 + 1][var41 + 1] != 0);
                    } while ((var39[var7 + var42][var7 + var43] & 0x12401E0) != 0);
                    for (int var53 = 1; var53 < var7; var53++) {
                        if ((var39[var42 + var53][var7 + var43] & 0x12401F8) != 0 || (var39[var7 + var42][var43 + var53] & 0x12401E3) != 0) {
                            continue label512;
                        }
                    }
                    class119.field1843[var80] = var31 + 1;
                    class119.field1844[var80] = var32 + 1;
                    var80 = var80 + 1 & 0xFFF;
                    class119.field1839[var40 + 1][var41 + 1] = 12;
                    class119.field1841[var40 + 1][var41 + 1] = var45;
                }
            }
            var30 = var44;
        }
        int var72;
        label570: {
            int var54 = var4 - 64;
            int var55 = var5 - 64;
            int var56 = Statics.field1845;
            int var57 = Statics.field1723;
            if (!var30) {
                int var58 = Integer.MAX_VALUE;
                int var59 = Integer.MAX_VALUE;
                byte var60 = 10;
                int var61 = var9.field1847;
                int var62 = var9.field1848;
                int var63 = var9.field1849;
                int var64 = var9.field1851;
                for (int var65 = var61 - var60; var65 <= var60 + var61; var65++) {
                    for (int var66 = var62 - var60; var66 <= var60 + var62; var66++) {
                        int var67 = var65 - var54;
                        int var68 = var66 - var55;
                        if (var67 >= 0 && var68 >= 0 && var67 < 128 && var68 < 128 && class119.field1841[var67][var68] < 100) {
                            int var69 = 0;
                            if (var65 < var61) {
                                var69 = var61 - var65;
                            } else if (var65 > var61 + var63 - 1) {
                                var69 = var65 - (var61 + var63 - 1);
                            }
                            int var70 = 0;
                            if (var66 < var62) {
                                var70 = var62 - var66;
                            } else if (var66 > var62 + var64 - 1) {
                                var70 = var66 - (var62 + var64 - 1);
                            }
                            int var71 = var69 * var69 + var70 * var70;
                            if (var71 < var58 || var58 == var71 && class119.field1841[var67][var68] < var59) {
                                var58 = var71;
                                var59 = class119.field1841[var67][var68];
                                var56 = var65;
                                var57 = var66;
                            }
                        }
                    }
                }
                if (var58 == Integer.MAX_VALUE) {
                    var72 = -1;
                    break label570;
                }
            }
            if (var4 == var56 && var5 == var57) {
                var72 = 0;
            } else {
                byte var73 = 0;
                class119.field1843[var73] = var56;
                int var81 = var73 + 1;
                class119.field1844[var73] = var57;
                int var74;
                int var75 = var74 = class119.field1839[var56 - var54][var57 - var55];
                while (var4 != var56 || var5 != var57) {
                    if (var74 != var75) {
                        var74 = var75;
                        class119.field1843[var81] = var56;
                        class119.field1844[var81++] = var57;
                    }
                    if ((var75 & 0x2) != 0) {
                        var56++;
                    } else if ((var75 & 0x8) != 0) {
                        var56--;
                    }
                    if ((var75 & 0x1) != 0) {
                        var57++;
                    } else if ((var75 & 0x4) != 0) {
                        var57--;
                    }
                    var75 = class119.field1839[var56 - var54][var57 - var55];
                }
                int var76 = 0;
                while (var81-- > 0) {
                    var11[var76] = class119.field1843[var81];
                    var12[var76++] = class119.field1844[var81];
                    if (var76 >= var11.length) {
                        break;
                    }
                }
                var72 = var76;
            }
        }
        int var77 = var72;
        if (var72 >= 1) {
            for (int var78 = 0; var78 < var77 - 1; var78++) {
                arg0.method241(field533[var78], field464[var78], arg3);
            }
        }
    }

    @ObfuscatedName("ce.bo(B)V")
    public static final void method1813() {
        int var0 = Statics.field2276;
        int var1 = Statics.field3167;
        int var2 = Statics.field1652;
        int var3 = Statics.field202;
        int var4 = 6116423;
        class220.method3783(var0, var1, var2, var3, var4);
        class220.method3783(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class220.method3764(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field177.method3699(class174.field2492, var0 + 3, var1 + 14, var4, -1);
        int var5 = class116.field1800;
        int var6 = class116.field1795;
        for (int var7 = 0; var7 < field418; var7++) {
            int var8 = (field418 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class209 var10 = Statics.field177;
            String var11;
            if (field370[var7].length() > 0) {
                var11 = field423[var7] + class174.field2499 + field370[var7];
            } else {
                var11 = field423[var7];
            }
            var10.method3699(var11, var0 + 3, var8, var9, 0);
        }
        method610(Statics.field2276, Statics.field3167, Statics.field1652, Statics.field202);
    }

    @ObfuscatedName("ae.bg(IIIIB)V")
    public static final void method814(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field289; var4++) {
            if (field488[var4] + field340[var4] > arg0 && field340[var4] < arg0 + arg2 && field489[var4] + field277[var4] > arg1 && field277[var4] < arg1 + arg3) {
                field483[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.bq(IIIII)V")
    public static final void method610(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field289; var4++) {
            if (field488[var4] + field340[var4] > arg0 && field340[var4] < arg0 + arg2 && field489[var4] + field277[var4] > arg1 && field277[var4] < arg1 + arg3) {
                field484[var4] = true;
            }
        }
    }

    @ObfuscatedName("aq.ci(III)V")
    public static final void method640(int arg0, int arg1) {
        int var2 = Statics.field177.method3667(class174.field2492);
        for (int var3 = 0; var3 < field418; var3++) {
            class209 var4 = Statics.field177;
            String var5;
            if (field370[var3].length() > 0) {
                var5 = field423[var3] + class174.field2499 + field370[var3];
            } else {
                var5 = field423[var3];
            }
            int var6 = var4.method3667(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field418 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field124) {
            var8 = Statics.field124 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2000) {
            var9 = Statics.field2000 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field1114.method1688(Statics.field937, arg0, arg1, false);
        field417 = true;
        Statics.field2276 = var8;
        Statics.field3167 = var9;
        Statics.field1652 = var2;
        Statics.field202 = field418 * 15 + 22;
    }

    @ObfuscatedName("p.ch(II)Z")
    public static final boolean method199(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field554[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bp.cf(II)V")
    public static final void method1124(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field424[arg0];
        int var2 = field420[arg0];
        int var3 = field554[arg0];
        int var4 = field445[arg0];
        String var5 = field423[arg0];
        String var6 = field370[arg0];
        method5(var1, var2, var3, var4, var5, var6, class116.field1801, class116.field1808);
    }

    @ObfuscatedName("k.ct(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 51) {
            class24 var8 = field399[arg3];
            if (var8 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(117);
                field322.method2765(arg3);
                field322.method2757(class106.field1713[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field322.method2993(194);
            field322.method2777(arg1);
            field322.method2766(arg3);
            field322.method2766(arg0);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 6) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(207);
            field322.method2765(Statics.field1792 + arg0);
            field322.method2767(arg3 >> 14 & 0x7FFF);
            field322.method2766(Statics.field663 + arg1);
            field322.method2838(class106.field1713[82] ? 1 : 0);
        }
        if (arg2 == 1003) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            class36 var9 = field317[arg3];
            if (var9 != null) {
                class200 var10 = var9.field764;
                if (var10.field3012 != null) {
                    var10 = var10.method3513();
                }
                if (var10 != null) {
                    field322.method2993(220);
                    field322.method2767(var10.field3011);
                }
            }
        }
        if (arg2 == 1002) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field322.method2993(154);
            field322.method2765(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 42) {
            field322.method2993(126);
            field322.method2765(arg3);
            field322.method2765(arg0);
            field322.method2863(arg1);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 47) {
            class24 var11 = field399[arg3];
            if (var11 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(36);
                field322.method2758(class106.field1713[82] ? 1 : 0);
                field322.method2766(arg3);
            }
        }
        if (arg2 == 4) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(163);
            field322.method2766(arg3 >> 14 & 0x7FFF);
            field322.method2718(class106.field1713[82] ? 1 : 0);
            field322.method2765(Statics.field1792 + arg0);
            field322.method2900(Statics.field663 + arg1);
        }
        if (arg2 == 43) {
            field322.method2993(198);
            field322.method2775(arg1);
            field322.method2767(arg0);
            field322.method2766(arg3);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 48) {
            class24 var12 = field399[arg3];
            if (var12 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(70);
                field322.method2766(arg3);
                field322.method2758(class106.field1713[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(140);
            field322.method2766(Statics.field663 + arg1);
            field322.method2900(Statics.field431);
            field322.method2775(Statics.field2314);
            field322.method2900(Statics.field1792 + arg0);
            field322.method2757(class106.field1713[82] ? 1 : 0);
            field322.method2900(arg3 >> 14 & 0x7FFF);
            field322.method2767(Statics.field430);
        }
        if (arg2 == 7) {
            class36 var13 = field317[arg3];
            if (var13 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(236);
                field322.method2776(Statics.field2314);
                field322.method2900(Statics.field430);
                field322.method2767(arg3);
                field322.method2766(Statics.field431);
                field322.method2757(class106.field1713[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class151 var14 = class151.method1382(arg1, arg0);
            if (var14 != null) {
                method72();
                int var15 = method1786(var14);
                int var16 = var15 >> 11 & 0x3F;
                int var18 = var14.field2066;
                class151 var19 = class151.method1382(arg1, arg0);
                if (var19 != null && var19.field2097 != null) {
                    class19 var20 = new class19();
                    var20.field191 = var19;
                    var20.field199 = var19.field2097;
                    class33.method119(var20);
                }
                field435 = var18;
                field433 = true;
                Statics.field801 = arg1;
                field434 = arg0;
                Statics.field2940 = var16;
                method29(var19);
                field526 = 0;
                field436 = method1375(var14);
                if (field436 == null) {
                    field436 = "Null";
                }
                if (var14.field2049) {
                    field437 = var14.field2099 + class38.method2958(16777215);
                } else {
                    field437 = class38.method2958(65280) + var14.field2166 + class38.method2958(16777215);
                }
            }
            return;
        }
        if (arg2 == 1004) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field322.method2993(231);
            field322.method2766(arg3);
        }
        if (arg2 == 10) {
            class36 var21 = field317[arg3];
            if (var21 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(206);
                field322.method2718(class106.field1713[82] ? 1 : 0);
                field322.method2900(arg3);
            }
        }
        if (arg2 == 3) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(185);
            field322.method2767(arg3 >> 14 & 0x7FFF);
            field322.method2767(Statics.field663 + arg1);
            field322.method2765(Statics.field1792 + arg0);
            field322.method2757(class106.field1713[82] ? 1 : 0);
        }
        if (arg2 == 33) {
            field322.method2993(11);
            field322.method2777(arg1);
            field322.method2900(arg0);
            field322.method2765(arg3);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class151 var22 = class151.method1382(arg1, arg0);
            if (var22 != null) {
                method222(arg3, arg1, arg0, var22.field2066, arg5);
            }
        }
        if (arg2 == 20) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(47);
            field322.method2765(Statics.field1792 + arg0);
            field322.method2765(arg3);
            field322.method2758(class106.field1713[82] ? 1 : 0);
            field322.method2767(Statics.field663 + arg1);
        }
        if (arg2 == 44) {
            class24 var23 = field399[arg3];
            if (var23 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(174);
                field322.method2767(arg3);
                field322.method2757(class106.field1713[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field322.method2993(24);
            field322.method2766(arg3);
            field322.method2767(arg0);
            field322.method2777(arg1);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 50) {
            class24 var24 = field399[arg3];
            if (var24 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(48);
                field322.method2766(arg3);
                field322.method2758(class106.field1713[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field322.method2993(148);
            field322.method2863(arg1);
            class151 var25 = class151.method744(arg1);
            if (var25.field2162 != null && var25.field2162[0][0] == 5) {
                int var26 = var25.field2162[0][1];
                if (class147.field2012[var26] != var25.field2120[0]) {
                    class147.field2012[var26] = var25.field2120[0];
                    method3088(var26);
                }
            }
        }
        if (arg2 == 49) {
            class24 var27 = field399[arg3];
            if (var27 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(147);
                field322.method2900(arg3);
                field322.method2718(class106.field1713[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class36 var28 = field317[arg3];
            if (var28 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(99);
                field322.method2900(arg3);
                field322.method2718(class106.field1713[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field322.method2993(196);
            field322.method2775(arg1);
            field322.method2766(arg3);
            field322.method2765(arg0);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 12) {
            class36 var29 = field317[arg3];
            if (var29 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(240);
                field322.method2718(class106.field1713[82] ? 1 : 0);
                field322.method2766(arg3);
            }
        }
        if (arg2 == 22) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(38);
            field322.method2718(class106.field1713[82] ? 1 : 0);
            field322.method2767(Statics.field663 + arg1);
            field322.method2766(Statics.field1792 + arg0);
            field322.method2766(arg3);
        }
        if (arg2 == 41) {
            field322.method2993(25);
            field322.method2766(arg0);
            field322.method2775(arg1);
            field322.method2765(arg3);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 31) {
            field322.method2993(255);
            field322.method2776(Statics.field2314);
            field322.method2766(arg3);
            field322.method2777(arg1);
            field322.method2900(arg0);
            field322.method2765(Statics.field431);
            field322.method2766(Statics.field430);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 11) {
            class36 var30 = field317[arg3];
            if (var30 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(42);
                field322.method2767(arg3);
                field322.method2838(class106.field1713[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(77);
            field322.method2766(arg3);
            field322.method2767(Statics.field663 + arg1);
            field322.method2757(class106.field1713[82] ? 1 : 0);
            field322.method2900(Statics.field1792 + arg0);
        }
        if (arg2 == 19) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(183);
            field322.method2718(class106.field1713[82] ? 1 : 0);
            field322.method2900(Statics.field1792 + arg0);
            field322.method2900(arg3);
            field322.method2900(Statics.field663 + arg1);
        }
        if (arg2 == 58) {
            class151 var31 = class151.method1382(arg1, arg0);
            if (var31 != null) {
                field322.method2993(133);
                field322.method2767(arg0);
                field322.method2777(arg1);
                field322.method2765(field434);
                field322.method2765(field435);
                field322.method2776(Statics.field801);
                field322.method2765(var31.field2066);
            }
        }
        if (arg2 == 16) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(139);
            field322.method2765(Statics.field663 + arg1);
            field322.method2766(Statics.field430);
            field322.method2838(class106.field1713[82] ? 1 : 0);
            field322.method2777(Statics.field2314);
            field322.method2900(Statics.field431);
            field322.method2766(arg3);
            field322.method2767(Statics.field1792 + arg0);
        }
        if (arg2 == 14) {
            class24 var32 = field399[arg3];
            if (var32 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(103);
                field322.method2767(Statics.field430);
                field322.method2776(Statics.field2314);
                field322.method2757(class106.field1713[82] ? 1 : 0);
                field322.method2767(Statics.field431);
                field322.method2767(arg3);
            }
        }
        if (arg2 == 39) {
            field322.method2993(69);
            field322.method2900(arg3);
            field322.method2765(arg0);
            field322.method2777(arg1);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 30 && field310 == null) {
            method261(arg1, arg0);
            field310 = class151.method1382(arg1, arg0);
            method29(field310);
        }
        if (arg2 == 13) {
            class36 var33 = field317[arg3];
            if (var33 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(65);
                field322.method2758(class106.field1713[82] ? 1 : 0);
                field322.method2900(arg3);
            }
        }
        if (arg2 == 21) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(97);
            field322.method2767(Statics.field663 + arg1);
            field322.method2766(arg3);
            field322.method2767(Statics.field1792 + arg0);
            field322.method2718(class106.field1713[82] ? 1 : 0);
        }
        if (arg2 == 8) {
            class36 var34 = field317[arg3];
            if (var34 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(175);
                field322.method2758(class106.field1713[82] ? 1 : 0);
                field322.method2775(Statics.field801);
                field322.method2767(field434);
                field322.method2765(arg3);
            }
        }
        if (arg2 == 32) {
            field322.method2993(85);
            field322.method2900(arg3);
            field322.method2776(Statics.field801);
            field322.method2767(field434);
            field322.method2863(arg1);
            field322.method2766(arg0);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 5) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(227);
            field322.method2765(arg3 >> 14 & 0x7FFF);
            field322.method2765(Statics.field1792 + arg0);
            field322.method2765(Statics.field663 + arg1);
            field322.method2758(class106.field1713[82] ? 1 : 0);
        }
        if (arg2 == 1005) {
            class151 var35 = class151.method744(arg1);
            if (var35 == null || var35.field2163[arg0] < 100000) {
                field322.method2993(231);
                field322.method2766(arg3);
            } else {
                class48.method888(27, "", var35.field2163[arg0] + " x " + class199.method2569(arg3).field2938);
            }
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 46) {
            class24 var36 = field399[arg3];
            if (var36 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(21);
                field322.method2718(class106.field1713[82] ? 1 : 0);
                field322.method2900(arg3);
            }
        }
        if (arg2 == 35) {
            field322.method2993(119);
            field322.method2900(arg3);
            field322.method2766(arg0);
            field322.method2863(arg1);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 40) {
            field322.method2993(28);
            field322.method2766(arg3);
            field322.method2775(arg1);
            field322.method2767(arg0);
            field390 = 0;
            Statics.field709 = class151.method744(arg1);
            field391 = arg0;
        }
        if (arg2 == 26) {
            method1923();
        }
        if (arg2 == 45) {
            class24 var37 = field399[arg3];
            if (var37 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(88);
                field322.method2838(class106.field1713[82] ? 1 : 0);
                field322.method2900(arg3);
            }
        }
        if (arg2 == 28) {
            field322.method2993(148);
            field322.method2863(arg1);
            class151 var38 = class151.method744(arg1);
            if (var38.field2162 != null && var38.field2162[0][0] == 5) {
                int var39 = var38.field2162[0][1];
                class147.field2012[var39] = 1 - class147.field2012[var39];
                method3088(var39);
            }
        }
        if (arg2 == 38) {
            method72();
            class151 var40 = class151.method744(arg1);
            field526 = 1;
            Statics.field430 = arg0;
            Statics.field2314 = arg1;
            Statics.field431 = arg3;
            method29(var40);
            field432 = class38.method2958(16748608) + class199.method2569(arg3).field2938 + class38.method2958(16777215);
            if (field432 == null) {
                field432 = "null";
            }
            return;
        }
        if (arg2 == 1001) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(134);
            field322.method2766(Statics.field663 + arg1);
            field322.method2767(arg3 >> 14 & 0x7FFF);
            field322.method2718(class106.field1713[82] ? 1 : 0);
            field322.method2767(Statics.field1792 + arg0);
        }
        if (arg2 == 15) {
            class24 var41 = field399[arg3];
            if (var41 != null) {
                field386 = arg6;
                field387 = arg7;
                field521 = 2;
                field465 = 0;
                field512 = arg0;
                field524 = arg1;
                field322.method2993(95);
                field322.method2766(field434);
                field322.method2758(class106.field1713[82] ? 1 : 0);
                field322.method2775(Statics.field801);
                field322.method2766(arg3);
            }
        }
        if (arg2 == 17) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(29);
            field322.method2758(class106.field1713[82] ? 1 : 0);
            field322.method2765(Statics.field663 + arg1);
            field322.method2767(field434);
            field322.method2775(Statics.field801);
            field322.method2767(Statics.field1792 + arg0);
            field322.method2767(arg3);
        }
        if (arg2 == 24) {
            class151 var42 = class151.method744(arg1);
            boolean var43 = true;
            if (var42.field2061 > 0) {
                var43 = method732(var42);
            }
            if (var43) {
                field322.method2993(148);
                field322.method2863(arg1);
            }
        }
        if (arg2 == 23) {
            if (field417) {
                Statics.field1114.method1659();
            } else {
                Statics.field1114.method1688(Statics.field937, arg0, arg1, true);
            }
        }
        if (arg2 == 2) {
            field386 = arg6;
            field387 = arg7;
            field521 = 2;
            field465 = 0;
            field512 = arg0;
            field524 = arg1;
            field322.method2993(209);
            field322.method2775(Statics.field801);
            field322.method2757(class106.field1713[82] ? 1 : 0);
            field322.method2767(field434);
            field322.method2900(arg3 >> 14 & 0x7FFF);
            field322.method2766(Statics.field1792 + arg0);
            field322.method2765(Statics.field663 + arg1);
        }
        if (field526 != 0) {
            field526 = 0;
            method29(class151.method744(Statics.field2314));
        }
        if (field433) {
            method72();
        }
        if (Statics.field709 != null && field390 == 0) {
            method29(Statics.field709);
        }
    }

    @ObfuscatedName("dd.cu(ILjava/lang/String;I)V")
    public static void method1926(int arg0, String arg1) {
        int var2 = class46.field902;
        int[] var3 = class46.field903;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class24 var6 = field399[var3[var5]];
            if (var6 != null && Statics.field1425 != var6 && var6.field262 != null && var6.field262.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field322.method2993(174);
                    field322.method2767(var3[var5]);
                    field322.method2757(0);
                } else if (arg0 == 4) {
                    field322.method2993(36);
                    field322.method2758(0);
                    field322.method2766(var3[var5]);
                } else if (arg0 == 6) {
                    field322.method2993(147);
                    field322.method2900(var3[var5]);
                    field322.method2718(0);
                } else if (arg0 == 7) {
                    field322.method2993(48);
                    field322.method2766(var3[var5]);
                    field322.method2758(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class48.method888(4, "", class174.field2488 + arg1);
        }
    }

    @ObfuscatedName("w.ck(I)V")
    public static void method72() {
        if (!field433) {
            return;
        }
        class151 var0 = class151.method1382(Statics.field801, field434);
        if (var0 != null && var0.field2142 != null) {
            class19 var1 = new class19();
            var1.field191 = var0;
            var1.field199 = var0.field2142;
            class33.method119(var1);
        }
        field433 = false;
        method29(var0);
    }

    @ObfuscatedName("e.cy(III)V")
    public static void method261(int arg0, int arg1) {
        field322.method2993(136);
        field322.method2776(arg0);
        field322.method2900(arg1);
    }

    @ObfuscatedName("b.cn(IIIILjava/lang/String;B)V")
    public static void method222(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class151 var5 = class151.method1382(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2065 != null) {
            class19 var6 = new class19();
            var6.field191 = var5;
            var6.field194 = arg0;
            var6.field201 = arg4;
            var6.field199 = var5.field2065;
            class33.method119(var6);
        }
        boolean var7 = true;
        if (var5.field2061 > 0) {
            var7 = method732(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method1786(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field322.method2993(20);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
        if (arg0 == 2) {
            field322.method2993(116);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
        if (arg0 == 3) {
            field322.method2993(129);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
        if (arg0 == 4) {
            field322.method2993(211);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
        if (arg0 == 5) {
            field322.method2993(9);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
        if (arg0 == 6) {
            field322.method2993(159);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
        if (arg0 == 7) {
            field322.method2993(221);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
        if (arg0 == 8) {
            field322.method2993(90);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
        if (arg0 == 9) {
            field322.method2993(168);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
        if (arg0 == 10) {
            field322.method2993(205);
            field322.method2863(arg1);
            field322.method2900(arg2);
            field322.method2900(arg3);
        }
    }

    @ObfuscatedName("client.co(I)V")
    public static final void method609() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field418 - 1; var1++) {
                if (field554[var1] < 1000 && field554[var1 + 1] > 1000) {
                    String var2 = field370[var1];
                    field370[var1] = field370[var1 + 1];
                    field370[var1 + 1] = var2;
                    String var3 = field423[var1];
                    field423[var1] = field423[var1 + 1];
                    field423[var1 + 1] = var3;
                    int var4 = field554[var1];
                    field554[var1] = field554[var1 + 1];
                    field554[var1 + 1] = var4;
                    int var5 = field424[var1];
                    field424[var1] = field424[var1 + 1];
                    field424[var1 + 1] = var5;
                    int var6 = field420[var1];
                    field420[var1] = field420[var1 + 1];
                    field420[var1 + 1] = var6;
                    int var7 = field445[var1];
                    field445[var1] = field445[var1 + 1];
                    field445[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("u.ca(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method208(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field417 || field418 >= 500) {
            return;
        }
        field423[field418] = arg0;
        field370[field418] = arg1;
        field554[field418] = arg2;
        field445[field418] = arg3;
        field424[field418] = arg4;
        field420[field418] = arg5;
        field418++;
    }

    @ObfuscatedName("c.cw(B)V")
    public static void method125() {
        for (int var0 = 0; var0 < field418; var0++) {
            if (method22(field554[var0])) {
                if (var0 < field418 - 1) {
                    for (int var1 = var0; var1 < field418 - 1; var1++) {
                        field423[var1] = field423[var1 + 1];
                        field370[var1] = field370[var1 + 1];
                        field554[var1] = field554[var1 + 1];
                        field445[var1] = field445[var1 + 1];
                        field424[var1] = field424[var1 + 1];
                        field420[var1] = field420[var1 + 1];
                    }
                }
                field418--;
            }
        }
    }

    @ObfuscatedName("y.cg(II)Z")
    public static boolean method22(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("aj.cz(IIIIB)V")
    public static final void method724(int arg0, int arg1, int arg2, int arg3) {
        if (field526 == 0 && !field433) {
            method208(class174.field2546, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class83.field1400; var6++) {
            int var7 = class83.field1412[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1114.method1651(Statics.field937, var8, var9, var7) >= 0) {
                    class198 var12 = class198.method2703(var11);
                    if (var12.field2916 != null) {
                        var12 = var12.method3409();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field526 == 1) {
                        method208(class174.field2489, field432 + " " + class38.field783 + " " + class38.method2958(65535) + var12.field2885, 1, var7, var8, var9);
                    } else if (!field433) {
                        String[] var13 = var12.field2893;
                        if (field395) {
                            var13 = method171(var13);
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
                                    method208(var13[var14], class38.method2958(65535) + var12.field2885, var15, var7, var8, var9);
                                }
                            }
                        }
                        method208(class174.field2472, class38.method2958(65535) + var12.field2885, 1002, var12.field2882 << 14, var8, var9);
                    } else if ((Statics.field2940 & 0x4) == 4) {
                        method208(field436, field437 + " " + class38.field783 + " " + class38.method2958(65535) + var12.field2885, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class36 var16 = field317[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field764.field2988 == 1 && (var16.field619 & 0x7F) == 64 && (var16.field609 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field318; var17++) {
                            class36 var18 = field317[field555[var17]];
                            if (var18 != null && var16 != var18 && var18.field764.field2988 == 1 && var16.field619 == var18.field619 && var16.field609 == var18.field609) {
                                method74(var18.field764, field555[var17], var8, var9);
                            }
                        }
                        int var19 = class46.field902;
                        int[] var20 = class46.field903;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class24 var22 = field399[var20[var21]];
                            if (var22 != null && var16.field619 == var22.field619 && var16.field609 == var22.field609) {
                                method191(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method74(var16.field764, var11, var8, var9);
                }
                if (var10 == 0) {
                    class24 var23 = field399[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field619 & 0x7F) == 64 && (var23.field609 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field318; var24++) {
                            class36 var25 = field317[field555[var24]];
                            if (var25 != null && var25.field764.field2988 == 1 && var23.field619 == var25.field619 && var23.field609 == var25.field609) {
                                method74(var25.field764, field555[var24], var8, var9);
                            }
                        }
                        int var26 = class46.field902;
                        int[] var27 = class46.field903;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class24 var29 = field399[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field619 == var29.field619 && var23.field609 == var29.field609) {
                                method191(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field408 == var11) {
                        var4 = var7;
                    } else {
                        method191(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class129 var30 = field409[Statics.field937][var8][var9];
                    if (var30 != null) {
                        for (class44 var31 = (class44) var30.method2226(); var31 != null; var31 = (class44) var30.method2249()) {
                            class199 var32 = class199.method2569(var31.field887);
                            if (field526 == 1) {
                                method208(class174.field2489, field432 + " " + class38.field783 + " " + class38.method2958(16748608) + var32.field2938, 16, var31.field887, var8, var9);
                            } else if (!field433) {
                                String[] var33 = var32.field2952;
                                if (field395) {
                                    var33 = method171(var33);
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
                                        method208(var33[var34], class38.method2958(16748608) + var32.field2938, var35, var31.field887, var8, var9);
                                    } else if (var34 == 2) {
                                        method208(class174.field2451, class38.method2958(16748608) + var32.field2938, 20, var31.field887, var8, var9);
                                    }
                                }
                                method208(class174.field2472, class38.method2958(16748608) + var32.field2938, 1004, var31.field887, var8, var9);
                            } else if ((Statics.field2940 & 0x1) == 1) {
                                method208(field436, field437 + " " + class38.field783 + " " + class38.method2958(16748608) + var32.field2938, 17, var31.field887, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class24 var38 = field399[field408];
            method191(var38, field408, var36, var37);
        }
    }

    @ObfuscatedName("j.cv(Lgl;IIII)V")
    public static final void method74(class200 arg0, int arg1, int arg2, int arg3) {
        if (field418 >= 400) {
            return;
        }
        if (arg0.field3012 != null) {
            arg0 = arg0.method3513();
        }
        if (arg0 == null || !arg0.field3015 || arg0.field3017 && field446 != arg1) {
            return;
        }
        String var4 = arg0.field2995;
        if (arg0.field3004 != 0) {
            var4 = var4 + method129(arg0.field3004, Statics.field1425.field267) + " " + class38.field784 + class174.field2495 + arg0.field3004 + class38.field782;
        }
        if (field526 == 1) {
            method208(class174.field2489, field432 + " " + class38.field783 + " " + class38.method2958(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field433) {
            String[] var5 = arg0.field3002;
            if (field395) {
                var5 = method171(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class174.field2491)) {
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
                        method208(var5[var6], class38.method2958(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class174.field2491)) {
                        short var9 = 0;
                        if (field306 != class41.field811) {
                            if (field306 == class41.field818 || field306 == class41.field819 && arg0.field3004 > Statics.field1425.field267) {
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
                            method208(var5[var8], class38.method2958(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method208(class174.field2472, class38.method2958(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2940 & 0x2) == 2) {
            method208(field436, field437 + " " + class38.field783 + " " + class38.method2958(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("a.cp(Le;IIIB)V")
    public static final void method191(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1425 == arg0 || field418 >= 400) {
            return;
        }
        String var4;
        if (arg0.field249 == 0) {
            var4 = arg0.field247[0] + arg0.field262 + arg0.field247[1] + method129(arg0.field267, Statics.field1425.field267) + " " + class38.field784 + class174.field2495 + arg0.field267 + class38.field782 + arg0.field247[2];
        } else {
            var4 = arg0.field247[0] + arg0.field262 + arg0.field247[1] + " " + class38.field784 + class174.field2421 + arg0.field249 + class38.field782 + arg0.field247[2];
        }
        if (field526 == 1) {
            method208(class174.field2489, field432 + " " + class38.field783 + " " + class38.method2958(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field433) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field428[var5] != null) {
                    short var6 = 0;
                    if (field428[var5].equalsIgnoreCase(class174.field2491)) {
                        if (field305 == class41.field811) {
                            continue;
                        }
                        if (field305 == class41.field818 || field305 == class41.field819 && arg0.field267 > Statics.field1425.field267) {
                            var6 = 2000;
                        }
                        if (Statics.field1425.field258 != 0 && arg0.field258 != 0) {
                            if (Statics.field1425.field258 == arg0.field258) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field406[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field419[var5] + var6;
                    method208(field428[var5], class38.method2958(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2940 & 0x8) == 8) {
            method208(field436, field437 + " " + class38.field783 + " " + class38.method2958(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field418; var9++) {
            if (field554[var9] == 23) {
                field370[var9] = class38.method2958(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("s.cx(III)Ljava/lang/String;")
    public static final String method129(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method2958(16711680);
        } else if (var2 < -6) {
            return class38.method2958(16723968);
        } else if (var2 < -3) {
            return class38.method2958(16740352);
        } else if (var2 < 0) {
            return class38.method2958(16756736);
        } else if (var2 > 9) {
            return class38.method2958(65280);
        } else if (var2 > 6) {
            return class38.method2958(4259584);
        } else if (var2 > 3) {
            return class38.method2958(8453888);
        } else if (var2 > 0) {
            return class38.method2958(12648192);
        } else {
            return class38.method2958(16776960);
        }
    }

    @ObfuscatedName("dv.cl(IIIIIIIII)V")
    public static final void method1899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class151.method194(arg0)) {
            Statics.field1079 = null;
            Statics.method735(Statics.field2043[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1079 != null) {
                Statics.method735(Statics.field1079, -1412584499, arg1, arg2, arg3, arg4, Statics.field52, Statics.field722, arg7);
                Statics.field1079 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field483[var8] = true;
            }
        } else {
            field483[arg7] = true;
        }
    }

    @ObfuscatedName("b.cr(Ljava/lang/String;Lee;B)Ljava/lang/String;")
    public static String method216(String arg0, class151 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1381(method215(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1650 != null) {
                    int var6 = Statics.field1650.field1671;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field1650.field1676 != null) {
                        var5 = (String) Statics.field1650.field1676;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("x.cs(II)Ljava/lang/String;")
    public static final String method616(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field779 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method2958(65408) + var1.substring(0, var1.length() - 8) + class174.field2500 + " " + class38.field784 + var1 + class38.field782 + class38.field785;
        } else if (var1.length() > 6) {
            return " " + class38.method2958(16777215) + var1.substring(0, var1.length() - 4) + class174.field2617 + " " + class38.field784 + var1 + class38.field782 + class38.field785;
        } else {
            return " " + class38.method2958(16776960) + var1 + class38.field785;
        }
    }

    @ObfuscatedName("n.cj(ZB)V")
    public static final void method118(boolean arg0) {
        int var1 = field438;
        int var2 = Statics.field124;
        int var3 = Statics.field2000;
        if (class151.method194(var1)) {
            method1374(Statics.field2043[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("cb.ce(Lee;B)V")
    public static void method1851(class151 arg0) {
        class151 var1 = arg0.field2127 == -1 ? null : class151.method744(arg0.field2127);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field124;
            var3 = Statics.field2000;
        } else {
            var2 = var1.field2108;
            var3 = var1.field2169;
        }
        method745(arg0, var2, var3, false);
        method110(arg0, var2, var3);
    }

    @ObfuscatedName("m.cq([Lee;Lee;ZB)V")
    public static void method234(class151[] arg0, class151 arg1, boolean arg2) {
        int var3 = arg1.field2073 == 0 ? arg1.field2108 : arg1.field2073;
        int var4 = arg1.field2111 == 0 ? arg1.field2169 : arg1.field2111;
        method1374(arg0, arg1.field2050, var3, var4, arg2);
        if (arg1.field2174 != null) {
            method1374(arg1.field2174, arg1.field2050, var3, var4, arg2);
        }
        class18 var5 = (class18) field439.method2171((long) arg1.field2050);
        if (var5 != null) {
            int var6 = var5.field184;
            if (class151.method194(var6)) {
                method1374(Statics.field2043[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2061 == 1337) {
        }
    }

    @ObfuscatedName("by.cd([Lee;IIIZI)V")
    public static void method1374(class151[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class151 var6 = arg0[var5];
            if (var6 != null && var6.field2127 == arg1) {
                method745(var6, arg2, arg3, arg4);
                method110(var6, arg2, arg3);
                if (var6.field2095 > var6.field2073 - var6.field2108) {
                    var6.field2095 = var6.field2073 - var6.field2108;
                }
                if (var6.field2095 < 0) {
                    var6.field2095 = 0;
                }
                if (var6.field2072 > var6.field2111 - var6.field2169) {
                    var6.field2072 = var6.field2111 - var6.field2169;
                }
                if (var6.field2072 < 0) {
                    var6.field2072 = 0;
                }
                if (var6.field2089 == 0) {
                    method234(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ay.cc(Lee;IIZI)V")
    public static void method745(class151 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2108;
        int var5 = arg0.field2169;
        if (arg0.field2057 == 0) {
            arg0.field2108 = arg0.field2052;
        } else if (arg0.field2057 == 1) {
            arg0.field2108 = arg1 - arg0.field2052;
        } else if (arg0.field2057 == 2) {
            arg0.field2108 = arg0.field2052 * arg1 >> 14;
        }
        if (arg0.field2152 == 0) {
            arg0.field2169 = arg0.field2062;
        } else if (arg0.field2152 == 1) {
            arg0.field2169 = arg2 - arg0.field2062;
        } else if (arg0.field2152 == 2) {
            arg0.field2169 = arg0.field2062 * arg2 >> 14;
        }
        if (arg0.field2057 == 4) {
            arg0.field2108 = arg0.field2169 * arg0.field2067 / arg0.field2068;
        }
        if (arg0.field2152 == 4) {
            arg0.field2169 = arg0.field2108 * arg0.field2068 / arg0.field2067;
        }
        if (field487 && arg0.field2089 == 0) {
            if (arg0.field2169 < 5 && arg0.field2108 < 5) {
                arg0.field2169 = 5;
                arg0.field2108 = 5;
            } else {
                if (arg0.field2169 <= 0) {
                    arg0.field2169 = 5;
                }
                if (arg0.field2108 <= 0) {
                    arg0.field2108 = 5;
                }
            }
        }
        if (arg0.field2061 == 1337) {
            field468 = arg0;
        }
        if (arg3 && arg0.field2159 != null && (arg0.field2108 != var4 || arg0.field2169 != var5)) {
            class19 var6 = new class19();
            var6.field191 = arg0;
            var6.field199 = arg0.field2159;
            field477.method2220(var6);
        }
    }

    @ObfuscatedName("d.cb(Lee;III)V")
    public static void method110(class151 arg0, int arg1, int arg2) {
        if (arg0.field2112 == 0) {
            arg0.field2143 = arg0.field2059;
        } else if (arg0.field2112 == 1) {
            arg0.field2143 = (arg1 - arg0.field2108) / 2 + arg0.field2059;
        } else if (arg0.field2112 == 2) {
            arg0.field2143 = arg1 - arg0.field2108 - arg0.field2059;
        } else if (arg0.field2112 == 3) {
            arg0.field2143 = arg0.field2059 * arg1 >> 14;
        } else if (arg0.field2112 == 4) {
            arg0.field2143 = (arg0.field2059 * arg1 >> 14) + (arg1 - arg0.field2108) / 2;
        } else {
            arg0.field2143 = arg1 - arg0.field2108 - (arg0.field2059 * arg1 >> 14);
        }
        if (arg0.field2180 == 0) {
            arg0.field2064 = arg0.field2060;
        } else if (arg0.field2180 == 1) {
            arg0.field2064 = (arg2 - arg0.field2169) / 2 + arg0.field2060;
        } else if (arg0.field2180 == 2) {
            arg0.field2064 = arg2 - arg0.field2169 - arg0.field2060;
        } else if (arg0.field2180 == 3) {
            arg0.field2064 = arg0.field2060 * arg2 >> 14;
        } else if (arg0.field2180 == 4) {
            arg0.field2064 = (arg0.field2060 * arg2 >> 14) + (arg2 - arg0.field2169) / 2;
        } else {
            arg0.field2064 = arg2 - arg0.field2169 - (arg0.field2060 * arg2 >> 14);
        }
        if (!field487 || arg0.field2089 != 0) {
            return;
        }
        if (arg0.field2143 < 0) {
            arg0.field2143 = 0;
        } else if (arg0.field2143 + arg0.field2108 > arg1) {
            arg0.field2143 = arg1 - arg0.field2108;
        }
        if (arg0.field2064 < 0) {
            arg0.field2064 = 0;
        } else if (arg0.field2169 + arg0.field2064 > arg2) {
            arg0.field2064 = arg2 - arg0.field2169;
        }
    }

    @ObfuscatedName("ft.dj(Lee;IIIIIII)V")
    public static final void method2981(class151 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field360) {
            field315 = 32;
        } else {
            field315 = 0;
        }
        field360 = false;
        if (class116.field1806 == 1 || !Statics.field1810 && class116.field1806 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2072 -= 4;
                method29(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2072 += 4;
                method29(arg0);
            } else if (arg5 >= arg1 - field315 && arg5 < field315 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2072 = (arg4 - arg3) * var8 / var9;
                method29(arg0);
                field360 = true;
            }
        }
        if (field476 == 0) {
            return;
        }
        int var10 = arg0.field2108;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2072 += field476 * 45;
            method29(arg0);
        }
    }

    @ObfuscatedName("bo.dv(II)Ljava/lang/String;")
    public static final String method1381(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("fx.dn(Lee;B)Z")
    public static final boolean method3053(class151 arg0) {
        if (arg0.field2042 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2042.length; var1++) {
            int var2 = method215(arg0, var1);
            int var3 = arg0.field2120[var1];
            if (arg0.field2042[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2042[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2042[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("b.dq(Lee;II)I")
    public static final int method215(class151 arg0, int arg1) {
        if (arg0.field2162 == null || arg1 >= arg0.field2162.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2162[arg1];
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
                    var7 = field319[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field414[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field345[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class151 var11 = class151.method744(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method2569(var12).field2951 || field284)) {
                        for (int var13 = 0; var13 < var11.field2168.length; var13++) {
                            if (var12 + 1 == var11.field2168[var13]) {
                                var7 += var11.field2163[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class147.field2012[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2335[field414[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class147.field2012[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1425.field267;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2334[var14]) {
                            var7 += field414[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class151 var17 = class151.method744(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method2569(var18).field2951 || field284)) {
                        for (int var19 = 0; var19 < var17.field2168.length; var19++) {
                            if (var18 + 1 == var17.field2168[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field316;
                }
                if (var6 == 12) {
                    var7 = field444;
                }
                if (var6 == 13) {
                    int var20 = class147.field2012[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class147.method128(var22);
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
                    var7 = (Statics.field1425.field619 >> 7) + Statics.field1792;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1425.field609 >> 7) + Statics.field663;
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

    @ObfuscatedName("al.dt(Lee;III)V")
    public static final void method866(class151 arg0, int arg1, int arg2) {
        if (arg0.field2053 == 1) {
            method208(arg0.field2054, "", 24, 0, 0, arg0.field2050);
        }
        if (arg0.field2053 == 2 && !field433) {
            String var3 = method1375(arg0);
            if (var3 != null) {
                method208(var3, class38.method2958(65280) + arg0.field2166, 25, 0, -1, arg0.field2050);
            }
        }
        if (arg0.field2053 == 3) {
            method208(class174.field2427, "", 26, 0, 0, arg0.field2050);
        }
        if (arg0.field2053 == 4) {
            method208(arg0.field2054, "", 28, 0, 0, arg0.field2050);
        }
        if (arg0.field2053 == 5) {
            method208(arg0.field2054, "", 29, 0, 0, arg0.field2050);
        }
        if (arg0.field2053 == 6 && field310 == null) {
            method208(arg0.field2054, "", 30, 0, -1, arg0.field2050);
        }
        if (arg0.field2089 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2169; var5++) {
                for (int var6 = 0; var6 < arg0.field2108; var6++) {
                    int var7 = (arg0.field2119 + 32) * var6;
                    int var8 = (arg0.field2117 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2118[var4];
                        var8 += arg0.field2110[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field382 = var4;
                        Statics.field3115 = arg0;
                        if (arg0.field2168[var4] > 0) {
                            label314: {
                                class199 var9 = class199.method2569(arg0.field2168[var4] - 1);
                                if (field526 == 1) {
                                    int var10 = method1786(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field2314 != arg0.field2050 || Statics.field430 != var4) {
                                            method208(class174.field2489, field432 + " " + class38.field783 + " " + class38.method2958(16748608) + var9.field2938, 31, var9.field2936, var4, arg0.field2050);
                                        }
                                        break label314;
                                    }
                                }
                                if (field433) {
                                    int var12 = method1786(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field2940 & 0x10) == 16) {
                                            method208(field436, field437 + " " + class38.field783 + " " + class38.method2958(16748608) + var9.field2938, 32, var9.field2936, var4, arg0.field2050);
                                        }
                                        break label314;
                                    }
                                }
                                String[] var14 = var9.field2961;
                                if (field395) {
                                    var14 = method171(var14);
                                }
                                int var15 = method1786(arg0);
                                boolean var16 = (var15 >> 30 & 0x1) != 0;
                                if (var16) {
                                    for (int var17 = 4; var17 >= 3; var17--) {
                                        if (var14 != null && var14[var17] != null) {
                                            byte var18;
                                            if (var17 == 3) {
                                                var18 = 36;
                                            } else {
                                                var18 = 37;
                                            }
                                            method208(var14[var17], class38.method2958(16748608) + var9.field2938, var18, var9.field2936, var4, arg0.field2050);
                                        } else if (var17 == 4) {
                                            method208(class174.field2483, class38.method2958(16748608) + var9.field2938, 37, var9.field2936, var4, arg0.field2050);
                                        }
                                    }
                                }
                                int var19 = method1786(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method208(class174.field2489, class38.method2958(16748608) + var9.field2938, 38, var9.field2936, var4, arg0.field2050);
                                }
                                int var21 = method1786(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22 && var14 != null) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var14[var23] != null) {
                                            byte var24 = 0;
                                            if (var23 == 0) {
                                                var24 = 33;
                                            }
                                            if (var23 == 1) {
                                                var24 = 34;
                                            }
                                            if (var23 == 2) {
                                                var24 = 35;
                                            }
                                            method208(var14[var23], class38.method2958(16748608) + var9.field2938, var24, var9.field2936, var4, arg0.field2050);
                                        }
                                    }
                                }
                                String[] var25 = arg0.field2121;
                                if (field395) {
                                    var25 = method171(var25);
                                }
                                if (var25 != null) {
                                    for (int var26 = 4; var26 >= 0; var26--) {
                                        if (var25[var26] != null) {
                                            byte var27 = 0;
                                            if (var26 == 0) {
                                                var27 = 39;
                                            }
                                            if (var26 == 1) {
                                                var27 = 40;
                                            }
                                            if (var26 == 2) {
                                                var27 = 41;
                                            }
                                            if (var26 == 3) {
                                                var27 = 42;
                                            }
                                            if (var26 == 4) {
                                                var27 = 43;
                                            }
                                            method208(var25[var26], class38.method2958(16748608) + var9.field2938, var27, var9.field2936, var4, arg0.field2050);
                                        }
                                    }
                                }
                                method208(class174.field2472, class38.method2958(16748608) + var9.field2938, 1005, var9.field2936, var4, arg0.field2050);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2049) {
            return;
        }
        if (field433) {
            int var28 = method1786(arg0);
            boolean var29 = (var28 >> 21 & 0x1) != 0;
            if (var29 && (Statics.field2940 & 0x20) == 32) {
                method208(field436, field437 + " " + class38.field783 + " " + arg0.field2099, 58, 0, arg0.field2051, arg0.field2050);
            }
            return;
        }
        for (int var30 = 9; var30 >= 5; var30--) {
            int var31 = method1786(arg0);
            boolean var32 = (var31 >> var30 + 1 & 0x1) != 0;
            String var33;
            if (!var32 && arg0.field2065 == null) {
                var33 = null;
            } else if (arg0.field2124 == null || arg0.field2124.length <= var30 || arg0.field2124[var30] == null || arg0.field2124[var30].trim().length() == 0) {
                var33 = null;
            } else {
                var33 = arg0.field2124[var30];
            }
            if (var33 != null) {
                method208(var33, arg0.field2099, 1007, var30 + 1, arg0.field2051, arg0.field2050);
            }
        }
        String var35 = method1375(arg0);
        if (var35 != null) {
            method208(var35, arg0.field2099, 25, 0, arg0.field2051, arg0.field2050);
        }
        for (int var36 = 4; var36 >= 0; var36--) {
            String var37 = method213(arg0, var36);
            if (var37 != null) {
                method208(var37, arg0.field2099, 57, var36 + 1, arg0.field2051, arg0.field2050);
            }
        }
        if (class152.method873(method1786(arg0))) {
            method208(class174.field2388, "", 30, 0, arg0.field2051, arg0.field2050);
        }
    }

    @ObfuscatedName("d.dd(IIIIIIIS)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class151.method194(arg0)) {
            method193(Statics.field2043[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("h.da([Lee;IIIIIIIB)V")
    public static final void method193(class151[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class151 var9 = arg0[var8];
            if (var9 != null && (!var9.field2049 || var9.field2089 == 0 || var9.field2130 || method1786(var9) != 0 || field421 == var9 || var9.field2061 == 1338) && var9.field2127 == arg1 && (!var9.field2049 || !Statics.method871(var9))) {
                int var10 = var9.field2143 + arg6;
                int var11 = var9.field2064 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2089 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2089 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2108 + var10;
                    int var19 = var9.field2169 + var11;
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
                    int var22 = var9.field2108 + var10;
                    int var23 = var9.field2169 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field451 == var9) {
                    field459 = true;
                    field376 = var10;
                    field556 = var11;
                }
                if (!var9.field2049 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1800;
                    int var25 = class116.field1795;
                    if (class116.field1805 != 0) {
                        var24 = class116.field1801;
                        var25 = class116.field1808;
                    }
                    if (var9.field2061 == 1337) {
                        if (!field288 && !field417 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method724(var24, var25, var12, var13);
                        }
                    } else if (var9.field2061 != 1338) {
                        if (!field417 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method866(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2089 == 0) {
                            if (!var9.field2049 && Statics.method871(var9) && Statics.field1908 != var9) {
                                continue;
                            }
                            method193(arg0, var9.field2050, var12, var13, var14, var15, var10 - var9.field2095, var11 - var9.field2072);
                            if (var9.field2174 != null) {
                                method193(var9.field2174, var9.field2050, var12, var13, var14, var15, var10 - var9.field2095, var11 - var9.field2072);
                            }
                            class18 var40 = (class18) field439.method2171((long) var9.field2050);
                            if (var40 != null) {
                                if (var40.field179 == 0 && class116.field1800 >= var12 && class116.field1795 >= var13 && class116.field1800 < var14 && class116.field1795 < var15 && !field417 && !field487) {
                                    for (class19 var41 = (class19) field477.method2243(); var41 != null; var41 = (class19) field477.method2238()) {
                                        if (var41.field193) {
                                            var41.method2214();
                                            var41.field191.field2175 = false;
                                        }
                                    }
                                    if (Statics.field231 == 0) {
                                        field451 = null;
                                        field421 = null;
                                    }
                                    if (!field417) {
                                        field423[0] = class174.field2578;
                                        field370[0] = "";
                                        field554[0] = 1006;
                                        field418 = 1;
                                    }
                                }
                                method113(var40.field184, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2049) {
                            if (var9.field2183) {
                                if (class116.field1800 >= var12 && class116.field1795 >= var13 && class116.field1800 < var14 && class116.field1795 < var15) {
                                    for (class19 var42 = (class19) field477.method2243(); var42 != null; var42 = (class19) field477.method2238()) {
                                        if (var42.field193) {
                                            var42.method2214();
                                            var42.field191.field2175 = false;
                                        }
                                    }
                                    if (Statics.field231 == 0) {
                                        field451 = null;
                                        field421 = null;
                                    }
                                    if (!field417) {
                                        field423[0] = class174.field2578;
                                        field370[0] = "";
                                        field554[0] = 1006;
                                        field418 = 1;
                                    }
                                }
                            } else if (var9.field2184 && class116.field1800 >= var12 && class116.field1795 >= var13 && class116.field1800 < var14 && class116.field1795 < var15) {
                                for (class19 var43 = (class19) field477.method2243(); var43 != null; var43 = (class19) field477.method2238()) {
                                    if (var43.field193 && var43.field191.field2107 == var43.field199) {
                                        var43.method2214();
                                    }
                                }
                            }
                            boolean var44;
                            if (class116.field1800 >= var12 && class116.field1795 >= var13 && class116.field1800 < var14 && class116.field1795 < var15) {
                                var44 = true;
                            } else {
                                var44 = false;
                            }
                            boolean var45 = false;
                            if ((class116.field1806 == 1 || !Statics.field1810 && class116.field1806 == 4) && var44) {
                                var45 = true;
                            }
                            boolean var46 = false;
                            if ((class116.field1805 == 1 || !Statics.field1810 && class116.field1805 == 4) && class116.field1801 >= var12 && class116.field1808 >= var13 && class116.field1801 < var14 && class116.field1808 < var15) {
                                var46 = true;
                            }
                            if (var46) {
                                method612(var9, class116.field1801 - var10, class116.field1808 - var11);
                            }
                            if (field451 != null && field451 != var9 && var44 && class152.method198(method1786(var9))) {
                                field455 = var9;
                            }
                            if (field421 == var9) {
                                field389 = true;
                                field457 = var10;
                                field458 = var11;
                            }
                            if (var9.field2130) {
                                if (var44 && field476 != 0 && var9.field2107 != null) {
                                    class19 var47 = new class19();
                                    var47.field193 = true;
                                    var47.field191 = var9;
                                    var47.field189 = field476;
                                    var47.field199 = var9.field2107;
                                    field477.method2220(var47);
                                }
                                if (field451 != null || Statics.field2666 != null || field417) {
                                    var46 = false;
                                    var45 = false;
                                    var44 = false;
                                }
                                if (!var9.field2176 && var46) {
                                    var9.field2176 = true;
                                    if (var9.field2132 != null) {
                                        class19 var48 = new class19();
                                        var48.field193 = true;
                                        var48.field191 = var9;
                                        var48.field192 = class116.field1801 - var10;
                                        var48.field189 = class116.field1808 - var11;
                                        var48.field199 = var9.field2132;
                                        field477.method2220(var48);
                                    }
                                }
                                if (var9.field2176 && var45 && var9.field2133 != null) {
                                    class19 var49 = new class19();
                                    var49.field193 = true;
                                    var49.field191 = var9;
                                    var49.field192 = class116.field1800 - var10;
                                    var49.field189 = class116.field1795 - var11;
                                    var49.field199 = var9.field2133;
                                    field477.method2220(var49);
                                }
                                if (var9.field2176 && !var45) {
                                    var9.field2176 = false;
                                    if (var9.field2134 != null) {
                                        class19 var50 = new class19();
                                        var50.field193 = true;
                                        var50.field191 = var9;
                                        var50.field192 = class116.field1800 - var10;
                                        var50.field189 = class116.field1795 - var11;
                                        var50.field199 = var9.field2134;
                                        field479.method2220(var50);
                                    }
                                }
                                if (var45 && var9.field2135 != null) {
                                    class19 var51 = new class19();
                                    var51.field193 = true;
                                    var51.field191 = var9;
                                    var51.field192 = class116.field1800 - var10;
                                    var51.field189 = class116.field1795 - var11;
                                    var51.field199 = var9.field2135;
                                    field477.method2220(var51);
                                }
                                if (!var9.field2175 && var44) {
                                    var9.field2175 = true;
                                    if (var9.field2136 != null) {
                                        class19 var52 = new class19();
                                        var52.field193 = true;
                                        var52.field191 = var9;
                                        var52.field192 = class116.field1800 - var10;
                                        var52.field189 = class116.field1795 - var11;
                                        var52.field199 = var9.field2136;
                                        field477.method2220(var52);
                                    }
                                }
                                if (var9.field2175 && var44 && var9.field2137 != null) {
                                    class19 var53 = new class19();
                                    var53.field193 = true;
                                    var53.field191 = var9;
                                    var53.field192 = class116.field1800 - var10;
                                    var53.field189 = class116.field1795 - var11;
                                    var53.field199 = var9.field2137;
                                    field477.method2220(var53);
                                }
                                if (var9.field2175 && !var44) {
                                    var9.field2175 = false;
                                    if (var9.field2138 != null) {
                                        class19 var54 = new class19();
                                        var54.field193 = true;
                                        var54.field191 = var9;
                                        var54.field192 = class116.field1800 - var10;
                                        var54.field189 = class116.field1795 - var11;
                                        var54.field199 = var9.field2138;
                                        field479.method2220(var54);
                                    }
                                }
                                if (var9.field2149 != null) {
                                    class19 var55 = new class19();
                                    var55.field191 = var9;
                                    var55.field199 = var9.field2149;
                                    field478.method2220(var55);
                                }
                                if (var9.field2074 != null && field562 > var9.field2086) {
                                    if (var9.field2128 == null || field562 - var9.field2086 > 32) {
                                        class19 var60 = new class19();
                                        var60.field191 = var9;
                                        var60.field199 = var9.field2074;
                                        field477.method2220(var60);
                                    } else {
                                        label523: for (int var56 = var9.field2086; var56 < field562; var56++) {
                                            int var57 = field394[var56 & 0x1F];
                                            for (int var58 = 0; var58 < var9.field2128.length; var58++) {
                                                if (var9.field2128[var58] == var57) {
                                                    class19 var59 = new class19();
                                                    var59.field191 = var9;
                                                    var59.field199 = var9.field2074;
                                                    field477.method2220(var59);
                                                    break label523;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2086 = field562;
                                }
                                if (var9.field2145 != null && field467 > var9.field2179) {
                                    if (var9.field2146 == null || field467 - var9.field2179 > 32) {
                                        class19 var65 = new class19();
                                        var65.field191 = var9;
                                        var65.field199 = var9.field2145;
                                        field477.method2220(var65);
                                    } else {
                                        label499: for (int var61 = var9.field2179; var61 < field467; var61++) {
                                            int var62 = field404[var61 & 0x1F];
                                            for (int var63 = 0; var63 < var9.field2146.length; var63++) {
                                                if (var9.field2146[var63] == var62) {
                                                    class19 var64 = new class19();
                                                    var64.field191 = var9;
                                                    var64.field199 = var9.field2145;
                                                    field477.method2220(var64);
                                                    break label499;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2179 = field467;
                                }
                                if (var9.field2087 != null && field469 > var9.field2150) {
                                    if (var9.field2148 == null || field469 - var9.field2150 > 32) {
                                        class19 var70 = new class19();
                                        var70.field191 = var9;
                                        var70.field199 = var9.field2087;
                                        field477.method2220(var70);
                                    } else {
                                        label475: for (int var66 = var9.field2150; var66 < field469; var66++) {
                                            int var67 = field449[var66 & 0x1F];
                                            for (int var68 = 0; var68 < var9.field2148.length; var68++) {
                                                if (var9.field2148[var68] == var67) {
                                                    class19 var69 = new class19();
                                                    var69.field191 = var9;
                                                    var69.field199 = var9.field2087;
                                                    field477.method2220(var69);
                                                    break label475;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2150 = field469;
                                }
                                if (field470 > var9.field2167 && var9.field2071 != null) {
                                    class19 var71 = new class19();
                                    var71.field191 = var9;
                                    var71.field199 = var9.field2071;
                                    field477.method2220(var71);
                                }
                                if (field471 > var9.field2167 && var9.field2154 != null) {
                                    class19 var72 = new class19();
                                    var72.field191 = var9;
                                    var72.field199 = var9.field2154;
                                    field477.method2220(var72);
                                }
                                if (field472 > var9.field2167 && var9.field2155 != null) {
                                    class19 var73 = new class19();
                                    var73.field191 = var9;
                                    var73.field199 = var9.field2155;
                                    field477.method2220(var73);
                                }
                                if (field416 > var9.field2167 && var9.field2160 != null) {
                                    class19 var74 = new class19();
                                    var74.field191 = var9;
                                    var74.field199 = var9.field2160;
                                    field477.method2220(var74);
                                }
                                if (field294 > var9.field2167 && var9.field2056 != null) {
                                    class19 var75 = new class19();
                                    var75.field191 = var9;
                                    var75.field199 = var9.field2056;
                                    field477.method2220(var75);
                                }
                                if (field475 > var9.field2167 && var9.field2156 != null) {
                                    class19 var76 = new class19();
                                    var76.field191 = var9;
                                    var76.field199 = var9.field2156;
                                    field477.method2220(var76);
                                }
                                var9.field2167 = field463;
                                if (var9.field2153 != null) {
                                    for (int var77 = 0; var77 < field501; var77++) {
                                        class19 var78 = new class19();
                                        var78.field191 = var9;
                                        var78.field196 = field503[var77];
                                        var78.field197 = field502[var77];
                                        var78.field199 = var9.field2153;
                                        field477.method2220(var78);
                                    }
                                }
                            }
                        }
                        if (!var9.field2049 && field451 == null && Statics.field2666 == null && !field417) {
                            if ((var9.field2147 >= 0 || var9.field2077 != 0) && class116.field1800 >= var12 && class116.field1795 >= var13 && class116.field1800 < var14 && class116.field1795 < var15) {
                                if (var9.field2147 >= 0) {
                                    Statics.field1908 = arg0[var9.field2147];
                                } else {
                                    Statics.field1908 = var9;
                                }
                            }
                            if (var9.field2089 == 8 && class116.field1800 >= var12 && class116.field1795 >= var13 && class116.field1800 < var14 && class116.field1795 < var15) {
                                Statics.field1894 = var9;
                            }
                            if (var9.field2111 > var9.field2169) {
                                method2981(var9, var9.field2108 + var10, var11, var9.field2169, var9.field2111, class116.field1800, class116.field1795);
                            }
                        }
                    } else if ((field515 == 0 || field515 == 3) && (class116.field1805 == 1 || !Statics.field1810 && class116.field1805 == 4)) {
                        class146 var26 = var9.method2584(true);
                        if (var26 != null) {
                            int var27 = class116.field1801 - var10;
                            int var28 = class116.field1808 - var11;
                            if (var26.method2532(var27, var28)) {
                                int var29 = var27 - var26.field2008 / 2;
                                int var30 = var28 - var26.field2005 / 2;
                                int var31 = field536 + field363 & 0x7FF;
                                int var32 = class85.field1429[var31];
                                int var33 = class85.field1453[var31];
                                int var34 = (field352 + 256) * var32 >> 8;
                                int var35 = (field352 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field1425.field619 + var36 >> 7;
                                int var39 = Statics.field1425.field609 - var37 >> 7;
                                field322.method2993(57);
                                field322.method2718(18);
                                field322.method2765(Statics.field1792 + var38);
                                field322.method2900(Statics.field663 + var39);
                                field322.method2758(class106.field1713[82] ? (class106.field1713[81] ? 2 : 1) : 0);
                                field322.method2718(var29);
                                field322.method2718(var30);
                                field322.method2900(field363);
                                field322.method2718(57);
                                field322.method2718(field536);
                                field322.method2718(field352);
                                field322.method2718(89);
                                field322.method2900(Statics.field1425.field619);
                                field322.method2900(Statics.field1425.field609);
                                field322.method2718(63);
                                field512 = var38;
                                field524 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ez.dm(III)V")
    public static final void method2575(int arg0, int arg1) {
        if (class151.method194(arg0)) {
            method638(Statics.field2043[arg0], arg1);
        }
    }

    @ObfuscatedName("aq.du([Lee;II)V")
    public static final void method638(class151[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class151 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2089 == 0) {
                    if (var3.field2174 != null) {
                        method638(var3.field2174, arg1);
                    }
                    class18 var4 = (class18) field439.method2171((long) var3.field2050);
                    if (var4 != null) {
                        method2575(var4.field184, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2157 != null) {
                    class19 var5 = new class19();
                    var5.field191 = var3;
                    var5.field199 = var3.field2157;
                    class33.method119(var5);
                }
                if (arg1 == 1 && var3.field2158 != null) {
                    if (var3.field2051 >= 0) {
                        class151 var6 = class151.method744(var3.field2050);
                        if (var6 == null || var6.field2174 == null || var3.field2051 >= var6.field2174.length || var6.field2174[var3.field2051] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field191 = var3;
                    var7.field199 = var3.field2158;
                    class33.method119(var7);
                }
            }
        }
    }

    @ObfuscatedName("x.dr(Lee;III)V")
    public static final void method612(class151 arg0, int arg1, int arg2) {
        if (field451 != null || field417 || arg0 == null) {
            return;
        }
        class151 var3 = arg0;
        int var4 = class152.method710(method1786(arg0));
        class151 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class151.method744(var3.field2127);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class151 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2125;
        }
        if (var7 == null) {
            return;
        }
        field451 = arg0;
        class151 var9 = arg0;
        int var10 = class152.method710(method1786(arg0));
        class151 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class151.method744(var9.field2127);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class151 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2125;
        }
        field421 = var13;
        field453 = arg1;
        field361 = arg2;
        Statics.field231 = 0;
        field461 = false;
        if (field418 > 0) {
            method71(field418 - 1);
        }
        return;
    }

    @ObfuscatedName("ae.ds(B)V")
    public static final void method816() {
        method29(field451);
        Statics.field231++;
        if (field459 && field389) {
            int var0 = class116.field1800;
            int var1 = class116.field1795;
            int var2 = var0 - field453;
            int var3 = var1 - field361;
            if (var2 < field457) {
                var2 = field457;
            }
            if (field451.field2108 + var2 > field457 + field421.field2108) {
                var2 = field457 + field421.field2108 - field451.field2108;
            }
            if (var3 < field458) {
                var3 = field458;
            }
            if (field451.field2169 + var3 > field458 + field421.field2169) {
                var3 = field458 + field421.field2169 - field451.field2169;
            }
            int var4 = var2 - field376;
            int var5 = var3 - field556;
            int var6 = field451.field2126;
            if (Statics.field231 > field451.field2098 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field461 = true;
            }
            int var7 = field421.field2095 + (var2 - field457);
            int var8 = field421.field2072 + (var3 - field458);
            if (field451.field2139 != null && field461) {
                class19 var9 = new class19();
                var9.field191 = field451;
                var9.field192 = var7;
                var9.field189 = var8;
                var9.field199 = field451.field2139;
                class33.method119(var9);
            }
            if (class116.field1806 == 0) {
                if (field461) {
                    if (field451.field2140 != null) {
                        class19 var10 = new class19();
                        var10.field191 = field451;
                        var10.field192 = var7;
                        var10.field189 = var8;
                        var10.field195 = field455;
                        var10.field199 = field451.field2140;
                        class33.method119(var10);
                    }
                    if (field455 != null) {
                        class151 var11 = field451;
                        int var12 = class152.method710(method1786(var11));
                        class151 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class151.method744(var11.field2127);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field322.method2993(46);
                            field322.method2900(field451.field2051);
                            field322.method2766(field455.field2066);
                            field322.method2900(field455.field2051);
                            field322.method2863(field455.field2050);
                            field322.method2863(field451.field2050);
                            field322.method2766(field451.field2066);
                        }
                    }
                } else if ((field544 == 1 || method199(field418 - 1)) && field418 > 2) {
                    method640(field453 + field376, field556 + field361);
                } else if (field418 > 0) {
                    int var15 = field453 + field376;
                    int var16 = field556 + field361;
                    class39 var17 = Statics.field159;
                    method5(var17.field797, var17.field792, var17.field793, var17.field794, var17.field791, var17.field791, var15, var16);
                    Statics.field159 = null;
                }
                field451 = null;
            }
        } else if (Statics.field231 > 1) {
            field451 = null;
        }
    }

    @ObfuscatedName("w.dc(IB)V")
    public static void method71(int arg0) {
        Statics.field159 = new class39();
        Statics.field159.field797 = field424[arg0];
        Statics.field159.field792 = field420[arg0];
        Statics.field159.field793 = field554[arg0];
        Statics.field159.field794 = field445[arg0];
        Statics.field159.field791 = field423[arg0];
    }

    @ObfuscatedName("o.dx(Lee;S)V")
    public static void method29(class151 arg0) {
        if (field482 == arg0.field2182) {
            field483[arg0.field2181] = true;
        }
    }

    @ObfuscatedName("aq.de(I)V")
    public static void method639() {
        for (class18 var0 = (class18) field439.method2174(); var0 != null; var0 = (class18) field439.method2175()) {
            int var1 = var0.field184;
            if (class151.method194(var1)) {
                boolean var2 = true;
                class151[] var3 = Statics.field2043[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2049;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1874;
                    class151 var6 = class151.method744(var5);
                    if (var6 != null) {
                        method29(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.dy([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method171(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("o.dl(IB)V")
    public static final void method24(int arg0) {
        if (!class151.method194(arg0)) {
            return;
        }
        class151[] var1 = Statics.field2043[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class151 var3 = var1[var2];
            if (var3 != null) {
                var3.field2055 = 0;
                var3.field2177 = 0;
            }
        }
    }

    @ObfuscatedName("ao.dz(II)V")
    public static final void method752(int arg0) {
        if (class151.method194(arg0)) {
            method3423(Statics.field2043[arg0], -1);
        }
    }

    @ObfuscatedName("gb.dg([Lee;IS)V")
    public static final void method3423(class151[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class151 var3 = arg0[var2];
            if (var3 != null && var3.field2127 == arg1 && (!var3.field2049 || !Statics.method871(var3))) {
                if (var3.field2089 == 0) {
                    if (!var3.field2049 && Statics.method871(var3) && Statics.field1908 != var3) {
                        continue;
                    }
                    method3423(arg0, var3.field2050);
                    if (var3.field2174 != null) {
                        method3423(var3.field2174, var3.field2050);
                    }
                    class18 var4 = (class18) field439.method2171((long) var3.field2050);
                    if (var4 != null) {
                        method752(var4.field184);
                    }
                }
                if (var3.field2089 == 6) {
                    if (var3.field2165 != -1 || var3.field2075 != -1) {
                        boolean var5 = method3053(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2075;
                        } else {
                            var6 = var3.field2165;
                        }
                        if (var6 != -1) {
                            class202 var7 = class202.method1368(var6);
                            var3.field2177 += field355;
                            while (var3.field2177 > var7.field3040[var3.field2055]) {
                                var3.field2177 -= var7.field3040[var3.field2055];
                                var3.field2055++;
                                if (var3.field2055 >= var7.field3038.length) {
                                    var3.field2055 -= var7.field3042;
                                    if (var3.field2055 < 0 || var3.field2055 >= var7.field3038.length) {
                                        var3.field2055 = 0;
                                    }
                                }
                                method29(var3);
                            }
                        }
                    }
                    if (var3.field2106 != 0 && !var3.field2049) {
                        int var8 = var3.field2106 >> 16;
                        int var9 = var3.field2106 << 16 >> 16;
                        int var10 = field355 * var8;
                        int var11 = field355 * var9;
                        var3.field2101 = var3.field2101 + var10 & 0x7FF;
                        var3.field2102 = var3.field2102 + var11 & 0x7FF;
                        method29(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gh.di(IB)V")
    public static final void method3088(int arg0) {
        method639();
        class32.method233();
        int var1 = class188.method1927(arg0).field2758;
        if (var1 == 0) {
            return;
        }
        int var2 = class147.field2012[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class85.method1562(0.9D);
                ((class75) Statics.field1449).method1354(0.9D);
            }
            if (var2 == 2) {
                class85.method1562(0.8D);
                ((class75) Statics.field1449).method1354(0.8D);
            }
            if (var2 == 3) {
                class85.method1562(0.7D);
                ((class75) Statics.field1449).method1354(0.7D);
            }
            if (var2 == 4) {
                class85.method1562(0.6D);
                ((class75) Statics.field1449).method1354(0.6D);
            }
            class199.method121();
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
            if (field516 != var3) {
                if (field516 == 0 && field517 != -1) {
                    class139.method2715(Statics.field924, field517, 0, var3, false);
                    field518 = false;
                } else if (var3 == 0) {
                    class139.method1616();
                    field518 = false;
                } else if (class139.field1911 == 0) {
                    Statics.field1907.method2308(var3);
                } else {
                    Statics.field1632 = var3;
                }
                field516 = var3;
            }
        }
        if (var1 == 4) {
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
        if (var1 == 5) {
            field544 = var2;
        }
        if (var1 == 6) {
            field440 = var2;
        }
        if (var1 == 9) {
            field441 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field513 = 127;
            }
            if (var2 == 1) {
                field513 = 96;
            }
            if (var2 == 2) {
                field513 = 64;
            }
            if (var2 == 3) {
                field513 = 32;
            }
            if (var2 == 4) {
                field513 = 0;
            }
        }
        if (var1 == 17) {
            field446 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field305 = (class41) class156.method725(class41.method48(), var2);
            if (field305 == null) {
                field305 = class41.field819;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field408 = -1;
            } else {
                field408 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field306 = (class41) class156.method725(class41.method48(), var2);
            if (field306 == null) {
                field306 = class41.field819;
            }
        }
    }

    @ObfuscatedName("dt.df(B)V")
    public static final void method1923() {
        field322.method2993(158);
        for (class18 var0 = (class18) field439.method2174(); var0 != null; var0 = (class18) field439.method2175()) {
            if (var0.field179 == 0 || var0.field179 == 3) {
                method753(var0, true);
            }
        }
        if (field310 != null) {
            method29(field310);
            field310 = null;
        }
    }

    @ObfuscatedName("be.dp(IIII)Lt;")
    public static final class18 method1137(int arg0, int arg1, int arg2) {
        class18 var3 = new class18();
        var3.field184 = arg1;
        var3.field179 = arg2;
        field439.method2173(var3, (long) arg0);
        method24(arg1);
        class151 var4 = class151.method744(arg0);
        method29(var4);
        if (field310 != null) {
            method29(field310);
            field310 = null;
        }
        method125();
        method234(Statics.field2043[arg0 >> 16], var4, false);
        class33.method2120(arg1);
        if (field438 != -1) {
            method2575(field438, 1);
        }
        return var3;
    }

    @ObfuscatedName("ao.dw(Lt;ZI)V")
    public static final void method753(class18 arg0, boolean arg1) {
        int var2 = arg0.field184;
        int var3 = (int) arg0.field1874;
        arg0.method2214();
        if (arg1) {
            class151.method206(var2);
        }
        method793(var2);
        class151 var4 = class151.method744(var3);
        if (var4 != null) {
            method29(var4);
        }
        method125();
        if (field438 != -1) {
            method2575(field438, 1);
        }
    }

    @ObfuscatedName("am.do(Lee;I)Z")
    public static final boolean method732(class151 arg0) {
        int var1 = arg0.field2061;
        if (var1 == 205) {
            field332 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field552.method2566(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field552.method2541(var4, var5 == 1);
        }
        if (var1 == 324) {
            field552.method2542(false);
        }
        if (var1 == 325) {
            field552.method2542(true);
        }
        if (var1 == 326) {
            field322.method2993(215);
            field552.method2549(field322);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.db(Lee;IIII)V")
    public static final void method201(class151 arg0, int arg1, int arg2, int arg3) {
        method34();
        class146 var4 = arg0.method2584(false);
        if (var4 == null) {
            return;
        }
        class220.method3752(arg1, arg2, var4.field2008 + arg1, var4.field2005 + arg2);
        if (field515 == 2 || field515 == 5) {
            class220.method3771(arg1, arg2, 0, var4.field2007, var4.field2004);
        } else {
            int var5 = field536 + field363 & 0x7FF;
            int var6 = Statics.field1425.field619 / 32 + 48;
            int var7 = 464 - Statics.field1425.field609 / 32;
            Statics.field57.method3879(arg1, arg2, var4.field2008, var4.field2005, var6, var7, var5, field352 + 256, var4.field2007, var4.field2004);
            for (int var8 = 0; var8 < field508; var8++) {
                int var9 = field509[var8] * 4 + 2 - Statics.field1425.field619 / 32;
                int var10 = field510[var8] * 4 + 2 - Statics.field1425.field609 / 32;
                method1805(arg1, arg2, var9, var10, field511[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class129 var13 = field409[Statics.field937][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1425.field619 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1425.field609 / 32;
                        method1805(arg1, arg2, var14, var15, Statics.field240[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field318; var16++) {
                class36 var17 = field317[field555[var16]];
                if (var17 != null && var17.method242()) {
                    class200 var18 = var17.field764;
                    if (var18 != null && var18.field3012 != null) {
                        var18 = var18.method3513();
                    }
                    if (var18 != null && var18.field3003 && var18.field3015) {
                        int var19 = var17.field619 / 32 - Statics.field1425.field619 / 32;
                        int var20 = var17.field609 / 32 - Statics.field1425.field609 / 32;
                        method1805(arg1, arg2, var19, var20, Statics.field240[1], var4);
                    }
                }
            }
            int var21 = class46.field902;
            int[] var22 = class46.field903;
            for (int var23 = 0; var23 < var21; var23++) {
                class24 var24 = field399[var22[var23]];
                if (var24 != null && var24.method242() && !var24.field263 && Statics.field1425 != var24) {
                    int var25 = var24.field619 / 32 - Statics.field1425.field619 / 32;
                    int var26 = var24.field609 / 32 - Statics.field1425.field609 / 32;
                    boolean var27 = false;
                    if (method1121(var24.field262, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field1190; var29++) {
                        if (var24.field262.equals(Statics.field1464[var29].field271)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field1425.field258 != 0 && var24.field258 != 0 && Statics.field1425.field258 == var24.field258) {
                        var30 = true;
                    }
                    if (var27) {
                        method1805(arg1, arg2, var25, var26, Statics.field240[3], var4);
                    } else if (var30) {
                        method1805(arg1, arg2, var25, var26, Statics.field240[4], var4);
                    } else if (var28) {
                        method1805(arg1, arg2, var25, var26, Statics.field240[5], var4);
                    } else {
                        method1805(arg1, arg2, var25, var26, Statics.field240[2], var4);
                    }
                }
            }
            if (field297 != 0 && field454 % 20 < 10) {
                if (field297 == 1 && field298 >= 0 && field298 < field317.length) {
                    class36 var31 = field317[field298];
                    if (var31 != null) {
                        int var32 = var31.field619 / 32 - Statics.field1425.field619 / 32;
                        int var33 = var31.field609 / 32 - Statics.field1425.field609 / 32;
                        method100(arg1, arg2, var32, var33, Statics.field53[1], var4);
                    }
                }
                if (field297 == 2) {
                    int var34 = field349 * 4 - Statics.field1792 * 4 + 2 - Statics.field1425.field619 / 32;
                    int var35 = field429 * 4 - Statics.field663 * 4 + 2 - Statics.field1425.field609 / 32;
                    method100(arg1, arg2, var34, var35, Statics.field53[1], var4);
                }
                if (field297 == 10 && field299 >= 0 && field299 < field399.length) {
                    class24 var36 = field399[field299];
                    if (var36 != null) {
                        int var37 = var36.field619 / 32 - Statics.field1425.field619 / 32;
                        int var38 = var36.field609 / 32 - Statics.field1425.field609 / 32;
                        method100(arg1, arg2, var37, var38, Statics.field53[1], var4);
                    }
                }
            }
            if (field512 != 0) {
                int var39 = field512 * 4 + 2 - Statics.field1425.field619 / 32;
                int var40 = field524 * 4 + 2 - Statics.field1425.field609 / 32;
                method1805(arg1, arg2, var39, var40, Statics.field53[0], var4);
            }
            if (!Statics.field1425.field263) {
                class220.method3783(var4.field2008 / 2 + arg1 - 1, var4.field2005 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field484[arg3] = true;
    }

    @ObfuscatedName("q.dk(IIIILhv;Lel;I)V")
    public static final void method100(int arg0, int arg1, int arg2, int arg3, class225 arg4, class146 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1805(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field536 + field363 & 0x7FF;
        int var8 = class85.field1429[var7];
        int var9 = class85.field1453[var7];
        int var10 = var8 * 256 / (field352 + 256);
        int var11 = var9 * 256 / (field352 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2753.method3880(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("cs.dh(IIIILhv;Lel;I)V")
    public static final void method1805(int arg0, int arg1, int arg2, int arg3, class225 arg4, class146 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field536 + field363 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1429[var6];
        int var9 = class85.field1453[var6];
        int var10 = var8 * 256 / (field352 + 256);
        int var11 = var9 * 256 / (field352 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3868(arg5.field2008 / 2 + var12 - arg4.field3206 / 2, arg5.field2005 / 2 - var13 - arg4.field3211 / 2, arg0, arg1, arg5.field2008, arg5.field2005, arg5.field2007, arg5.field2004);
        } else {
            arg4.method3875(arg5.field2008 / 2 + arg0 + var12 - arg4.field3206 / 2, arg5.field2005 / 2 + arg1 - var13 - arg4.field3211 / 2);
        }
    }

    @ObfuscatedName("bp.em(Ljava/lang/String;ZI)Z")
    public static boolean method1121(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method3535(arg0, Statics.field283);
        for (int var3 = 0; var3 < field546; var3++) {
            if (var2.equalsIgnoreCase(class205.method3535(field548[var3].field158, Statics.field283)) && (!arg1 || field548[var3].field151 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method3535(Statics.field1425.field262, Statics.field283))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.ec(Ljava/lang/String;I)Z")
    public static boolean method21(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method3535(arg0, Statics.field283);
        for (int var2 = 0; var2 < field486; var2++) {
            class20 var3 = field551[var2];
            if (var1.equalsIgnoreCase(class205.method3535(var3.field208, Statics.field283))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method3535(var3.field204, Statics.field283))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("a.ed(Ljava/lang/String;I)V")
    public static final void method190(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class205.method3535(arg0, Statics.field283);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field546; var2++) {
            class15 var3 = field548[var2];
            String var4 = var3.field158;
            String var5 = class205.method3535(var4, Statics.field283);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field546--;
                for (int var7 = var2; var7 < field546; var7++) {
                    field548[var7] = field548[var7 + 1];
                }
                field471 = field463;
                field322.method2993(114);
                field322.method2718(class161.method1885(arg0));
                field322.method2903(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cr.ei(Ljava/lang/String;I)V")
    public static final void method1803(String arg0) {
        if (Statics.field1464 != null) {
            field322.method2993(40);
            field322.method2718(class161.method1885(arg0));
            field322.method2903(arg0);
        }
    }

    @ObfuscatedName("az.et(Ljava/lang/String;I)V")
    public static final void method870(String arg0) {
        if (!arg0.equals("")) {
            field322.method2993(84);
            field322.method2718(class161.method1885(arg0));
            field322.method2903(arg0);
        }
    }

    @ObfuscatedName("fb.ep(B)V")
    public static final void method2945() {
        field322.method2993(84);
        field322.method2718(0);
    }

    @ObfuscatedName("au.ew(IB)V")
    public static void method793(int arg0) {
        for (class134 var1 = (class134) field480.method2174(); var1 != null; var1 = (class134) field480.method2175()) {
            if ((var1.field1874 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method2214();
            }
        }
    }

    @ObfuscatedName("cw.eh(Lee;B)I")
    public static int method1786(class151 arg0) {
        class134 var1 = (class134) field480.method2171(((long) arg0.field2050 << 32) + (long) arg0.field2051);
        return var1 == null ? arg0.field2170 : var1.field1888;
    }

    @ObfuscatedName("u.ex(Lee;II)Ljava/lang/String;")
    public static String method213(class151 arg0, int arg1) {
        int var2 = method1786(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2065 == null) {
            return null;
        } else if (arg0.field2124 == null || arg0.field2124.length <= arg1 || arg0.field2124[arg1] == null || arg0.field2124[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2124[arg1];
        }
    }

    @ObfuscatedName("by.eg(Lee;I)Ljava/lang/String;")
    public static String method1375(class151 arg0) {
        int var1 = method1786(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2129 == null || arg0.field2129.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2129;
        }
    }

    @ObfuscatedName("q.eq(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method97(String arg0, boolean arg1) {
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
        if (Statics.field13 != null) {
            var3 = "/p=" + Statics.field13;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field286 + "/a=" + Statics.field1686 + var3 + "/";
    }

    @ObfuscatedName("x.eo(Ljava/lang/String;I)V")
    public static void method615(String arg0) {
        Statics.field13 = arg0;
        try {
            String var1 = Statics.field278.getParameter(class215.field3149.field3152);
            String var2 = Statics.field278.getParameter(class215.field3150.field3152);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class163.method225() + 94608000000L;
                class170.field2320.setTime(new Date(var6));
                int var8 = class170.field2320.get(7);
                int var9 = class170.field2320.get(5);
                int var10 = class170.field2320.get(2);
                int var11 = class170.field2320.get(1);
                int var12 = class170.field2320.get(11);
                int var13 = class170.field2320.get(12);
                int var14 = class170.field2320.get(13);
                String var15 = class170.field2315[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class170.field2319[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field278;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("dc.ej(Ljava/lang/String;ZI)V")
    public static void method2057(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field925; var5++) {
            class199 var6 = class199.method2569(var5);
            if ((!arg1 || var6.field2976) && var6.field2977 == -1 && var6.field2938.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2280 = -1;
                    Statics.field1545 = null;
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
        Statics.field1545 = var3;
        Statics.field163 = 0;
        Statics.field2280 = var4;
        String[] var9 = new String[Statics.field2280];
        for (int var10 = 0; var10 < Statics.field2280; var10++) {
            var9[var10] = class199.method2569(var3[var10]).field2938;
        }
        short[] var11 = Statics.field1545;
        class158.method614(var9, var11, 0, var9.length - 1);
    }
}

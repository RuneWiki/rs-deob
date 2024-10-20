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
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.q")
    public static boolean field294 = true;

    @ObfuscatedName("client.o")
    public static int field544 = 1;

    @ObfuscatedName("client.g")
    public static int field431 = 0;

    @ObfuscatedName("client.b")
    public static int field297 = 0;

    @ObfuscatedName("client.w")
    public static class108[] field521 = new class108[4];

    @ObfuscatedName("client.k")
    public static boolean field504 = false;

    @ObfuscatedName("client.z")
    public static boolean field300 = false;

    @ObfuscatedName("client.v")
    public static int field301 = 0;

    @ObfuscatedName("client.r")
    public static int field303 = 0;

    @ObfuscatedName("client.u")
    public static boolean field333 = true;

    @ObfuscatedName("client.a")
    public static int field548 = 0;

    @ObfuscatedName("client.h")
    public static long field366 = 1L;

    @ObfuscatedName("client.n")
    public static int field574 = -1;

    @ObfuscatedName("client.i")
    public static int field308 = -1;

    @ObfuscatedName("client.ad")
    public static int field309 = -1;

    @ObfuscatedName("client.aq")
    public static boolean field310 = true;

    @ObfuscatedName("client.ak")
    public static boolean field528 = false;

    @ObfuscatedName("client.au")
    public static int field531 = 0;

    @ObfuscatedName("client.ao")
    public static int field420 = 0;

    @ObfuscatedName("client.am")
    public static int field314 = 0;

    @ObfuscatedName("client.ah")
    public static int field563 = 0;

    @ObfuscatedName("client.aj")
    public static int field316 = 0;

    @ObfuscatedName("client.ar")
    public static int field317 = 0;

    @ObfuscatedName("client.ae")
    public static int field511 = 0;

    @ObfuscatedName("client.al")
    public static int field319 = 0;

    @ObfuscatedName("client.ay")
    public static int field320 = 0;

    @ObfuscatedName("client.ac")
    public static class21 field321 = class21.field582;

    @ObfuscatedName("client.az")
    public static class21 field307 = class21.field582;

    @ObfuscatedName("client.ai")
    public static int field324 = 0;

    @ObfuscatedName("client.aa")
    public static int field325 = 0;

    @ObfuscatedName("client.ax")
    public static int field344 = 0;

    @ObfuscatedName("client.bt")
    public static int field421 = 0;

    @ObfuscatedName("client.bp")
    public static int field493 = 0;

    @ObfuscatedName("client.bx")
    public static int field330 = 0;

    @ObfuscatedName("client.bi")
    public static int field331 = 0;

    @ObfuscatedName("client.bm")
    public static int field500 = 0;

    @ObfuscatedName("client.cv")
    public static class35[] field438 = new class35[32768];

    @ObfuscatedName("client.co")
    public static int field334 = 0;

    @ObfuscatedName("client.cy")
    public static int[] field335 = new int[32768];

    @ObfuscatedName("client.cx")
    public static int field306 = 0;

    @ObfuscatedName("client.ce")
    public static int[] field337 = new int[250];

    @ObfuscatedName("client.cs")
    public static class122 field338 = new class122(5000);

    @ObfuscatedName("client.ck")
    public static class122 field332 = new class122(5000);

    @ObfuscatedName("client.cb")
    public static class122 field411 = new class122(15000);

    @ObfuscatedName("client.cj")
    public static int field341 = 0;

    @ObfuscatedName("client.cc")
    public static int field342 = 0;

    @ObfuscatedName("client.cg")
    public static int field343 = 0;

    @ObfuscatedName("client.ch")
    public static int field550 = 0;

    @ObfuscatedName("client.ct")
    public static int field345 = 0;

    @ObfuscatedName("client.cf")
    public static int field346 = 0;

    @ObfuscatedName("client.cq")
    public static int field347 = 0;

    @ObfuscatedName("client.cl")
    public static int field348 = 0;

    @ObfuscatedName("client.cz")
    public static boolean field435 = false;

    @ObfuscatedName("client.dh")
    public static int field350 = 0;

    @ObfuscatedName("client.dd")
    public static int field351 = 1;

    @ObfuscatedName("client.de")
    public static int field352 = 0;

    @ObfuscatedName("client.da")
    public static int field358 = 1;

    @ObfuscatedName("client.ds")
    public static int field463 = 0;

    @ObfuscatedName("client.dj")
    public static boolean field356 = false;

    @ObfuscatedName("client.dx")
    public static int[][][] field449 = new int[4][13][13];

    @ObfuscatedName("client.dn")
    public static final int[] field414 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dy")
    public static int field359 = 0;

    @ObfuscatedName("client.dq")
    public static int field360 = 2;

    @ObfuscatedName("client.dz")
    public static int field361 = 0;

    @ObfuscatedName("client.dg")
    public static int field362 = 2;

    @ObfuscatedName("client.dk")
    public static int field363 = 0;

    @ObfuscatedName("client.ey")
    public static int field364 = 1;

    @ObfuscatedName("client.ep")
    public static int field365 = 0;

    @ObfuscatedName("client.ec")
    public static int field443 = 0;

    @ObfuscatedName("client.es")
    public static int field367 = 2;

    @ObfuscatedName("client.ef")
    public static int field295 = 0;

    @ObfuscatedName("client.en")
    public static int field460 = 1;

    @ObfuscatedName("client.eh")
    public static int field370 = 0;

    @ObfuscatedName("client.er")
    public static int field371 = 0;

    @ObfuscatedName("client.el")
    public static int field372 = 2301979;

    @ObfuscatedName("client.eo")
    public static int field373 = 5063219;

    @ObfuscatedName("client.eu")
    public static int field409 = 3353893;

    @ObfuscatedName("client.ed")
    public static int field375 = 7759444;

    @ObfuscatedName("client.ex")
    public static boolean field456 = false;

    @ObfuscatedName("client.fa")
    public static int field377 = 0;

    @ObfuscatedName("client.fw")
    public static int field378 = 128;

    @ObfuscatedName("client.fg")
    public static int field442 = 0;

    @ObfuscatedName("client.fz")
    public static int field302 = 0;

    @ObfuscatedName("client.fk")
    public static int field381 = 0;

    @ObfuscatedName("client.fo")
    public static int field382 = 0;

    @ObfuscatedName("client.fr")
    public static int field383 = 0;

    @ObfuscatedName("client.fx")
    public static int field384 = 50;

    @ObfuscatedName("client.fc")
    public static int field349 = 0;

    @ObfuscatedName("client.fd")
    public static boolean field386 = false;

    @ObfuscatedName("client.fs")
    public static int field404 = 0;

    @ObfuscatedName("client.fm")
    public static int field388 = 0;

    @ObfuscatedName("client.fq")
    public static int field492 = 50;

    @ObfuscatedName("client.fj")
    public static int[] field390 = new int[field492];

    @ObfuscatedName("client.ff")
    public static int[] field391 = new int[field492];

    @ObfuscatedName("client.fe")
    public static int[] field392 = new int[field492];

    @ObfuscatedName("client.fh")
    public static int[] field393 = new int[field492];

    @ObfuscatedName("client.fu")
    public static int[] field394 = new int[field492];

    @ObfuscatedName("client.fy")
    public static int[] field395 = new int[field492];

    @ObfuscatedName("client.gh")
    public static int[] field396 = new int[field492];

    @ObfuscatedName("client.gt")
    public static String[] field357 = new String[field492];

    @ObfuscatedName("client.go")
    public static int[][] field398 = new int[104][104];

    @ObfuscatedName("client.gs")
    public static int field399 = 0;

    @ObfuscatedName("client.gm")
    public static int field400 = -1;

    @ObfuscatedName("client.gp")
    public static int field401 = -1;

    @ObfuscatedName("client.gw")
    public static int field402 = 0;

    @ObfuscatedName("client.gx")
    public static int field403 = 0;

    @ObfuscatedName("client.gl")
    public static int field315 = 0;

    @ObfuscatedName("client.gb")
    public static int field515 = 0;

    @ObfuscatedName("client.gf")
    public static int field406 = 0;

    @ObfuscatedName("client.gq")
    public static int field407 = 0;

    @ObfuscatedName("client.ge")
    public static int field557 = 0;

    @ObfuscatedName("client.gu")
    public static int field541 = 0;

    @ObfuscatedName("client.gd")
    public static int field318 = 0;

    @ObfuscatedName("client.gy")
    public static int field412 = 0;

    @ObfuscatedName("client.gk")
    public static boolean field299 = false;

    @ObfuscatedName("client.gg")
    public static int field413 = 0;

    @ObfuscatedName("client.gz")
    public static int field468 = 0;

    @ObfuscatedName("client.gn")
    public static class3[] field415 = new class3[2048];

    @ObfuscatedName("client.gj")
    public static int field416 = -1;

    @ObfuscatedName("client.hj")
    public static int field451 = 0;

    @ObfuscatedName("client.hq")
    public static int field430 = 0;

    @ObfuscatedName("client.hz")
    public static int[] field419 = new int[1000];

    @ObfuscatedName("client.hk")
    public static final int[] field379 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ha")
    public static String[] field354 = new String[8];

    @ObfuscatedName("client.hi")
    public static boolean[] field422 = new boolean[8];

    @ObfuscatedName("client.hh")
    public static int[] field340 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field424 = -1;

    @ObfuscatedName("client.hf")
    public static class199[][][] field425 = new class199[4][104][104];

    @ObfuscatedName("client.hy")
    public static class199 field426 = new class199();

    @ObfuscatedName("client.hx")
    public static class199 field427 = new class199();

    @ObfuscatedName("client.ho")
    public static class199 field428 = new class199();

    @ObfuscatedName("client.hb")
    public static int[] field387 = new int[25];

    @ObfuscatedName("client.hd")
    public static int[] field417 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field339 = new int[25];

    @ObfuscatedName("client.hs")
    public static int field432 = 0;

    @ObfuscatedName("client.hg")
    public static boolean field433 = false;

    @ObfuscatedName("client.hw")
    public static int field434 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field410 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field539 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field437 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field555 = new int[500];

    @ObfuscatedName("client.iy")
    public static String[] field439 = new String[500];

    @ObfuscatedName("client.io")
    public static String[] field440 = new String[500];

    @ObfuscatedName("client.ik")
    public static int field436 = -1;

    @ObfuscatedName("client.in")
    public static int field490 = -1;

    @ObfuscatedName("client.ir")
    public static int field326 = 0;

    @ObfuscatedName("client.ij")
    public static int field523 = 50;

    @ObfuscatedName("client.iw")
    public static int field445 = 0;

    @ObfuscatedName("client.it")
    public static String field527 = null;

    @ObfuscatedName("client.id")
    public static boolean field323 = false;

    @ObfuscatedName("client.if")
    public static int field448 = -1;

    @ObfuscatedName("client.il")
    public static int field376 = -1;

    @ObfuscatedName("client.ic")
    public static String field450 = null;

    @ObfuscatedName("client.ii")
    public static String field397 = null;

    @ObfuscatedName("client.ih")
    public static int field452 = -1;

    @ObfuscatedName("client.ig")
    public static class196 field453 = new class196(8);

    @ObfuscatedName("client.jr")
    public static int field385 = 0;

    @ObfuscatedName("client.jh")
    public static int field455 = 0;

    @ObfuscatedName("client.jq")
    public static class173 field405 = null;

    @ObfuscatedName("client.jm")
    public static int field517 = 0;

    @ObfuscatedName("client.jk")
    public static int field458 = 0;

    @ObfuscatedName("client.jw")
    public static int field368 = 0;

    @ObfuscatedName("client.jz")
    public static int field529 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field461 = false;

    @ObfuscatedName("client.jn")
    public static boolean field454 = false;

    @ObfuscatedName("client.jl")
    public static boolean field369 = false;

    @ObfuscatedName("client.jf")
    public static class173 field464 = null;

    @ObfuscatedName("client.jg")
    public static class173 field465 = null;

    @ObfuscatedName("client.jj")
    public static class173 field466 = null;

    @ObfuscatedName("client.je")
    public static int field467 = 0;

    @ObfuscatedName("client.jc")
    public static int field355 = 0;

    @ObfuscatedName("client.jx")
    public static class173 field469 = null;

    @ObfuscatedName("client.jo")
    public static boolean field470 = false;

    @ObfuscatedName("client.ja")
    public static int field471 = -1;

    @ObfuscatedName("client.jv")
    public static int field472 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field429 = false;

    @ObfuscatedName("client.ju")
    public static int field474 = -1;

    @ObfuscatedName("client.jy")
    public static int field457 = -1;

    @ObfuscatedName("client.ji")
    public static boolean field476 = false;

    @ObfuscatedName("client.kr")
    public static int field477 = 1;

    @ObfuscatedName("client.kv")
    public static int[] field478 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field479 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field480 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field481 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field482 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field483 = 0;

    @ObfuscatedName("client.kx")
    public static int field484 = 0;

    @ObfuscatedName("client.ke")
    public static int field485 = 0;

    @ObfuscatedName("client.kd")
    public static int field507 = 0;

    @ObfuscatedName("client.kq")
    public static int field499 = 0;

    @ObfuscatedName("client.kt")
    public static int field488 = 0;

    @ObfuscatedName("client.ka")
    public static int field459 = 0;

    @ObfuscatedName("client.ks")
    public static int field441 = 0;

    @ObfuscatedName("client.kz")
    public static class199 field491 = new class199();

    @ObfuscatedName("client.kp")
    public static class199 field545 = new class199();

    @ObfuscatedName("client.kh")
    public static class199 field556 = new class199();

    @ObfuscatedName("client.ki")
    public static class196 field494 = new class196(512);

    @ObfuscatedName("client.ky")
    public static int field495 = 0;

    @ObfuscatedName("client.ko")
    public static int field496 = -2;

    @ObfuscatedName("client.lo")
    public static boolean[] field497 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field498 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static boolean[] field389 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static int[] field418 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field501 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field304 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field374 = new int[100];

    @ObfuscatedName("client.ln")
    public static int field311 = 0;

    @ObfuscatedName("client.lw")
    public static long field505 = 0L;

    @ObfuscatedName("client.li")
    public static boolean field506 = true;

    @ObfuscatedName("client.ly")
    public static int field292 = 1;

    @ObfuscatedName("client.lc")
    public static int field508 = 1;

    @ObfuscatedName("client.lt")
    public static int[] field509 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lv")
    public static int field510 = 0;

    @ObfuscatedName("client.lm")
    public static int field444 = 0;

    @ObfuscatedName("client.lb")
    public static String field512 = "";

    @ObfuscatedName("client.lp")
    public static long[] field513 = new long[100];

    @ObfuscatedName("client.ll")
    public static int field514 = 0;

    @ObfuscatedName("client.lx")
    public static int field537 = 0;

    @ObfuscatedName("client.mu")
    public static int[] field516 = new int[128];

    @ObfuscatedName("client.mm")
    public static int[] field296 = new int[128];

    @ObfuscatedName("client.md")
    public static long field518 = -1L;

    @ObfuscatedName("client.mo")
    public static String field519 = null;

    @ObfuscatedName("client.mi")
    public static String field520 = null;

    @ObfuscatedName("client.mk")
    public static int field329 = -1;

    @ObfuscatedName("client.mf")
    public static int field522 = 0;

    @ObfuscatedName("client.my")
    public static int[] field328 = new int[1000];

    @ObfuscatedName("client.mw")
    public static int[] field524 = new int[1000];

    @ObfuscatedName("client.mx")
    public static class79[] field525 = new class79[1000];

    @ObfuscatedName("client.mr")
    public static int field526 = 0;

    @ObfuscatedName("client.me")
    public static int field353 = 0;

    @ObfuscatedName("client.mz")
    public static int field487 = 0;

    @ObfuscatedName("client.mv")
    public static int field546 = 255;

    @ObfuscatedName("client.mj")
    public static int field530 = -1;

    @ObfuscatedName("client.mg")
    public static boolean field462 = false;

    @ObfuscatedName("client.nb")
    public static int field532 = 127;

    @ObfuscatedName("client.ns")
    public static int field533 = 127;

    @ObfuscatedName("client.nt")
    public static int field534 = 0;

    @ObfuscatedName("client.nr")
    public static int[] field535 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field536 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field312 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field538 = new int[50];

    @ObfuscatedName("client.nu")
    public static class59[] field322 = new class59[50];

    @ObfuscatedName("client.nc")
    public static boolean field540 = false;

    @ObfuscatedName("client.ok")
    public static boolean[] field542 = new boolean[5];

    @ObfuscatedName("client.ox")
    public static int[] field543 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field446 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field305 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field558 = new int[5];

    @ObfuscatedName("client.ou")
    public static short field547 = 256;

    @ObfuscatedName("client.oj")
    public static short field408 = 205;

    @ObfuscatedName("client.oi")
    public static short field549 = 256;

    @ObfuscatedName("client.oh")
    public static short field503 = 320;

    @ObfuscatedName("client.oa")
    public static short field551 = 1;

    @ObfuscatedName("client.oz")
    public static short field552 = 32767;

    @ObfuscatedName("client.ov")
    public static short field553 = 1;

    @ObfuscatedName("client.oe")
    public static short field554 = 32767;

    @ObfuscatedName("client.ob")
    public static int field570 = 0;

    @ObfuscatedName("client.op")
    public static int field423 = 0;

    @ObfuscatedName("client.os")
    public static int field475 = 0;

    @ObfuscatedName("client.ow")
    public static int field313 = 0;

    @ObfuscatedName("client.og")
    public static int field559 = 0;

    @ObfuscatedName("client.oq")
    public static int field560 = 0;

    @ObfuscatedName("client.oy")
    public static int field561 = 0;

    @ObfuscatedName("client.ol")
    public static class18[] field562 = new class18[400];

    @ObfuscatedName("client.or")
    public static class195 field298 = new class195();

    @ObfuscatedName("client.oo")
    public static int field564 = 0;

    @ObfuscatedName("client.oc")
    public static class8[] field565 = new class8[400];

    @ObfuscatedName("client.pu")
    public static class179 field572 = new class179();

    @ObfuscatedName("client.pd")
    public static int field567 = -1;

    @ObfuscatedName("client.pb")
    public static int field568 = -1;

    @ObfuscatedName("client.ps")
    public static class220[] field569 = new class220[8];

    @ObfuscatedName("client.pw")
    public static long field473 = -1L;

    @ObfuscatedName("client.ph")
    public static long field571 = -1L;

    @ObfuscatedName("client.po")
    public static final class11 field380 = new class11();

    @ObfuscatedName("client.pp")
    public static int[] field573 = new int[50];

    @ObfuscatedName("client.pq")
    public static int[] field336 = new int[50];

    @ObfuscatedName("client.o(B)V")
    public final void method344() {
    }

    public final void init() {
        if (!this.method2848()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3040, class190.field3052, class190.field3048, class190.field3047, class190.field3041, class190.field3051, class190.field3045, class190.field3053, class190.field3043, class190.field3042, class190.field3050, class190.field3044, class190.field3054, class190.field3046, class190.field3049 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3055);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3055)) {
                    case 1:
                        field297 = Integer.parseInt(var5);
                    case 2:
                    case 10:
                    case 14:
                    default:
                        break;
                    case 3:
                        Statics.field679 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field671 = var5;
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field27)) {
                            field504 = true;
                        } else {
                            field504 = false;
                        }
                        break;
                    case 6:
                        field431 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field3148 = Integer.parseInt(var5);
                        break;
                    case 8:
                        int var6 = Integer.parseInt(var5);
                        class153[] var7 = class153.method2323();
                        int var8 = 0;
                        class153 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class153 var9 = var7[var8];
                            if (var9.field2265 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field631 = var10;
                        break;
                    case 9:
                        field301 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field544 = Integer.parseInt(var5);
                        break;
                    case 12:
                        if (var5.equalsIgnoreCase(class2.field27)) {
                        }
                        break;
                    case 13:
                        Statics.field447 = var5;
                        break;
                    case 15:
                        Statics.field2613 = (class154) class109.method2675(class154.method2924(), Integer.parseInt(var5));
                        if (Statics.field2613 == class154.field2276) {
                            Statics.field489 = class212.field3125;
                        } else {
                            Statics.field489 = class212.field3129;
                        }
                }
            }
        }
        class86.field1499 = false;
        field300 = false;
        Statics.field1036 = this.getCodeBase().getHost();
        String var11 = Statics.field631.field2261;
        byte var12 = 0;
        try {
            Statics.field2130 = 16;
            Statics.field1205 = var12;
            try {
                Statics.field2229 = System.getProperty("os.name");
            } catch (Exception var58) {
                Statics.field2229 = "Unknown";
            }
            Statics.field808 = Statics.field2229.toLowerCase();
            try {
                Statics.field2001 = System.getProperty("user.home");
                if (Statics.field2001 != null) {
                    Statics.field2001 = Statics.field2001 + "/";
                }
            } catch (Exception var57) {
            }
            try {
                if (Statics.field808.startsWith("win")) {
                    if (Statics.field2001 == null) {
                        Statics.field2001 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2001 == null) {
                    Statics.field2001 = System.getenv("HOME");
                }
                if (Statics.field2001 != null) {
                    Statics.field2001 = Statics.field2001 + "/";
                }
            } catch (Exception var56) {
            }
            if (Statics.field2001 == null) {
                Statics.field2001 = "~/";
            }
            Statics.field1374 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2001, "/tmp/", "" };
            Statics.field1856 = new String[] { ".jagex_cache_" + Statics.field1205, ".file_store_" + Statics.field1205 };
            int var16 = 0;
            label280: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field2232 = new File(Statics.field2001, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field2232.exists()) {
                    try {
                        class227 var21 = new class227(Statics.field2232, "rw", 10000L);
                        class119 var22 = new class119((int) var21.method3816());
                        while (var22.field1988 < var22.field1986.length) {
                            int var23 = var21.method3812(var22.field1986, var22.field1988, var22.field1986.length - var22.field1988);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field1988 += var23;
                        }
                        var22.field1988 = 0;
                        int var24 = var22.method2388();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method2388();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method2535();
                            if (var25 == 1) {
                                var19 = var22.method2535();
                            }
                        } else {
                            var18 = var22.method2462();
                            if (var25 == 1) {
                                var19 = var22.method2462();
                            }
                        }
                        var21.method3817();
                    } catch (IOException var61) {
                        var61.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class149.method714(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label255: for (int var29 = 0; var29 < Statics.field1856.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field1374.length; var30++) {
                            File var31 = new File(Statics.field1374[var30] + Statics.field1856[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class149.method714(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label255;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field2001 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
                    var20 = true;
                }
                if (var19 != null) {
                    File var32 = new File(var19);
                    File var33 = new File(var18);
                    try {
                        File[] var34 = var32.listFiles();
                        File[] var35 = var34;
                        for (int var36 = 0; var36 < var35.length; var36++) {
                            File var37 = var35[var36];
                            File var38 = new File(var33, var37.getName());
                            boolean var39 = var37.renameTo(var38);
                            if (!var39) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var60) {
                        var60.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    class149.method3645(new File(var18), (File) null);
                }
                File var41 = new File(var18);
                Statics.field777 = var41;
                if (!Statics.field777.exists()) {
                    Statics.field777.mkdirs();
                }
                File[] var42 = Statics.field777.listFiles();
                if (var42 == null) {
                    break;
                }
                File[] var43 = var42;
                int var44 = 0;
                while (true) {
                    if (var44 >= var43.length) {
                        break label280;
                    }
                    File var45 = var43[var44];
                    if (!class149.method714(var45, false)) {
                        var16++;
                        break;
                    }
                    var44++;
                }
            }
            File var46 = Statics.field777;
            Statics.field2082 = var46;
            if (!Statics.field2082.exists()) {
                throw new RuntimeException("");
            }
            class135.field2083 = true;
            try {
                File var47 = new File(Statics.field2001, "random.dat");
                if (var47.exists()) {
                    class149.field2233 = new class228(new class227(var47, "rw", 25L), 24, 0);
                } else {
                    label208: for (int var48 = 0; var48 < Statics.field1856.length; var48++) {
                        for (int var49 = 0; var49 < Statics.field1374.length; var49++) {
                            File var50 = new File(Statics.field1374[var49] + Statics.field1856[var48] + File.separatorChar + "random.dat");
                            if (var50.exists()) {
                                class149.field2233 = new class228(new class227(var50, "rw", 25L), 24, 0);
                                break label208;
                            }
                        }
                    }
                }
                if (class149.field2233 == null) {
                    RandomAccessFile var51 = new RandomAccessFile(var47, "rw");
                    int var52 = var51.read();
                    var51.seek(0L);
                    var51.write(var52);
                    var51.seek(0L);
                    var51.close();
                    class149.field2233 = new class228(new class227(var47, "rw", 25L), 24, 0);
                }
            } catch (IOException var59) {
            }
            class149.field2236 = new class228(new class227(class135.method2305("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2235 = new class228(new class227(class135.method2305("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1862 = new class228[Statics.field2130];
            for (int var54 = 0; var54 < Statics.field2130; var54++) {
                Statics.field1862[var54] = new class228(new class227(class135.method2305("main_file_cache.idx" + var54), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var62) {
            class148.method2819((String) null, var62);
        }
        Statics.field293 = this;
        this.method2846(765, 503, 99);
    }

    @ObfuscatedName("client.m(I)V")
    public final void method234() {
        Statics.field1379 = field297 == 0 ? 43594 : field544 + 40000;
        Statics.field192 = field297 == 0 ? 443 : field544 + 50000;
        Statics.field1967 = Statics.field1379;
        Statics.field2636 = class174.field2879;
        Statics.field2905 = class174.field2876;
        Statics.field2629 = class174.field2877;
        Statics.field273 = class174.field2878;
        class137.method1602();
        class137.method2259(Statics.field1652);
        Canvas var1 = Statics.field1652;
        var1.addMouseListener(class140.field2160);
        var1.addMouseMotionListener(class140.field2160);
        var1.addFocusListener(class140.field2160);
        class145 var2;
        try {
            var2 = new class145();
        } catch (Throwable var6) {
            var2 = null;
        }
        Statics.field177 = var2;
        if (Statics.field177 != null) {
            Statics.field177.method2686(Statics.field1652);
        }
        Statics.field1070 = new class134(255, class149.field2236, class149.field2235, 500000);
        Statics.field1371 = class9.method2164();
        Statics.field1943 = this.getToolkit().getSystemClipboard();
        String var5 = Statics.field66;
        class138.field2135 = this;
        class138.field2134 = var5;
        if (field297 != 0) {
            field528 = true;
        }
        method2330(Statics.field1371.field144);
    }

    @ObfuscatedName("client.b(I)V")
    public final void method235() {
        field548++;
        this.method238();
        while (true) {
            class199 var1 = class170.field2697;
            class169 var2;
            synchronized (class170.field2697) {
                var2 = (class169) class170.field2698.method3542();
            }
            if (var2 == null) {
                try {
                    if (class183.field2945 == 1) {
                        int var4 = Statics.field2941.method3361();
                        if (var4 > 0 && Statics.field2941.method3389()) {
                            int var5 = var4 - Statics.field2260;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2941.method3360(var5);
                        } else {
                            Statics.field2941.method3366();
                            Statics.field2941.method3408();
                            if (Statics.field2579 == null) {
                                class183.field2945 = 0;
                            } else {
                                class183.field2945 = 2;
                            }
                            Statics.field2188 = null;
                            Statics.field1373 = null;
                        }
                    }
                } catch (Exception var17) {
                    var17.printStackTrace();
                    Statics.field2941.method3366();
                    class183.field2945 = 0;
                    Statics.field2188 = null;
                    Statics.field1373 = null;
                    Statics.field2579 = null;
                }
                method1013();
                class137 var7 = class137.field2115;
                synchronized (class137.field2115) {
                    class137.field2101++;
                    class137.field2125 = class137.field2127;
                    class137.field2118 = 0;
                    if (class137.field2120 >= 0) {
                        while (class137.field2120 != class137.field2119) {
                            int var9 = class137.field2104[class137.field2119];
                            class137.field2119 = class137.field2119 + 1 & 0x7F;
                            if (var9 < 0) {
                                class137.field2117[~var9] = false;
                            } else {
                                if (!class137.field2117[var9] && class137.field2118 < class137.field2123.length - 1) {
                                    class137.field2123[++class137.field2118 - 1] = var9;
                                }
                                class137.field2117[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class137.field2117[var8] = false;
                        }
                        class137.field2120 = class137.field2119;
                    }
                    class137.field2127 = class137.field2126;
                }
                class140 var11 = class140.field2160;
                synchronized (class140.field2160) {
                    class140.field2150 = class140.field2147;
                    class140.field2151 = class140.field2149;
                    class140.field2152 = class140.field2157;
                    class140.field2162 = class140.field2153;
                    class140.field2163 = class140.field2145;
                    class140.field2159 = class140.field2155;
                    class140.field2154 = class140.field2156;
                    class140.field2153 = 0;
                }
                if (Statics.field177 != null) {
                    int var13 = Statics.field177.method2688();
                    field441 = var13;
                }
                if (field303 == 0) {
                    method719();
                    class144.method48();
                } else if (field303 == 5) {
                    class32.method107(this);
                    method719();
                    class144.method48();
                } else if (field303 == 10 || field303 == 11) {
                    class32.method107(this);
                } else if (field303 == 20) {
                    class32.method107(this);
                    method99();
                } else if (field303 == 25) {
                    method3146();
                }
                if (field303 == 30) {
                    method1784();
                } else if (field303 == 40 || field303 == 45) {
                    method99();
                }
                return;
            }
            var2.field2692.method3131(var2.field2689, (int) var2.field3107, var2.field2687, false);
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method367() {
        boolean var1;
        label303: {
            try {
                if (class183.field2945 == 2) {
                    if (Statics.field2188 == null) {
                        Statics.field2188 = class180.method3279(Statics.field2579, Statics.field634, Statics.field2010);
                        if (Statics.field2188 == null) {
                            var1 = false;
                            break label303;
                        }
                    }
                    if (Statics.field1373 == null) {
                        Statics.field1373 = new class60(Statics.field2942, Statics.field3215);
                    }
                    if (Statics.field2941.method3362(Statics.field2188, Statics.field2944, Statics.field1373, 22050)) {
                        Statics.field2941.method3363();
                        Statics.field2941.method3360(Statics.field2047);
                        Statics.field2941.method3365(Statics.field2188, Statics.field2633);
                        class183.field2945 = 0;
                        Statics.field2188 = null;
                        Statics.field1373 = null;
                        Statics.field2579 = null;
                        var1 = true;
                        break label303;
                    }
                }
            } catch (Exception var40) {
                var40.printStackTrace();
                Statics.field2941.method3366();
                class183.field2945 = 0;
                Statics.field2188 = null;
                Statics.field1373 = null;
                Statics.field2579 = null;
            }
            var1 = false;
        }
        if (var1 && field462 && Statics.field1608 != null) {
            Statics.field1608.method1178();
        }
        if (field303 == 10 || field303 == 20 || field303 == 30) {
            if (field505 != 0L && class115.method2266() > field505) {
                int var4 = field506 ? 2 : 1;
                method2330(var4);
            } else if (field2205) {
                Canvas var5 = Statics.field1652;
                var5.removeKeyListener(class137.field2115);
                var5.removeFocusListener(class137.field2115);
                class137.field2120 = -1;
                Canvas var6 = Statics.field1652;
                var6.removeMouseListener(class140.field2160);
                var6.removeMouseMotionListener(class140.field2160);
                var6.removeFocusListener(class140.field2160);
                class140.field2147 = 0;
                if (Statics.field177 != null) {
                    Statics.field177.method2687(Statics.field1652);
                }
                Statics.field293.method2847();
                Statics.field1652.setBackground(Color.black);
                class137.method2259(Statics.field1652);
                Canvas var7 = Statics.field1652;
                var7.addMouseListener(class140.field2160);
                var7.addMouseMotionListener(class140.field2160);
                var7.addFocusListener(class140.field2160);
                if (Statics.field177 != null) {
                    Statics.field177.method2686(Statics.field1652);
                }
                if (field452 != -1) {
                    int var8 = field452;
                    int var9 = Statics.field1543;
                    int var10 = Statics.field121;
                    if (class173.method2073(var8)) {
                        method2651(Statics.field2868[var8], -1, var9, var10, false);
                    }
                }
                field2204 = true;
            }
        }
        Dimension var11 = this.method2857();
        if (Statics.field2587 != var11.width || Statics.field1607 != var11.height || field2204) {
            method150();
            field505 = class115.method2266() + 500L;
            field2204 = false;
        }
        boolean var12 = false;
        if (field2202) {
            field2202 = false;
            var12 = true;
            for (int var13 = 0; var13 < 100; var13++) {
                field497[var13] = true;
            }
        }
        if (var12) {
            method147();
        }
        if (field303 == 0) {
            class144.method584(class32.field733, class32.field747, (Color) null, var12);
        } else if (field303 == 5) {
            class32.method148(Statics.field163, Statics.field1441, Statics.field1782, var12);
        } else if (field303 == 10 || field303 == 11) {
            class32.method148(Statics.field163, Statics.field1441, Statics.field1782, var12);
        } else if (field303 == 20) {
            class32.method148(Statics.field163, Statics.field1441, Statics.field1782, var12);
        } else if (field303 == 25) {
            if (field463 == 1) {
                if (field350 > field351) {
                    field351 = field350;
                }
                int var14 = (field351 * 50 - field350 * 50) / field351;
                method2447(class157.field2307 + class2.field14 + class2.field17 + var14 + "%" + class2.field18, false);
            } else if (field463 == 2) {
                if (field352 > field358) {
                    field358 = field352;
                }
                int var15 = (field358 * 50 - field352 * 50) / field358 + 50;
                method2447(class157.field2307 + class2.field14 + class2.field17 + var15 + "%" + class2.field18, false);
            } else {
                method2447(class157.field2307, false);
            }
        } else if (field303 == 30) {
            if (field452 != -1) {
                method114(field452);
            }
            for (int var16 = 0; var16 < field495; var16++) {
                if (field497[var16]) {
                    field498[var16] = true;
                }
                field389[var16] = field497[var16];
                field497[var16] = false;
            }
            field496 = field548;
            field436 = -1;
            field490 = -1;
            Statics.field766 = null;
            if (field452 != -1) {
                field495 = 0;
                method597(field452, 0, 0, Statics.field1543, Statics.field121, 0, 0, -1);
            }
            class80.method1700();
            if (field433) {
                method2820();
            } else if (field436 != -1) {
                Statics.method2979(field436, field490);
            }
            if (field311 == 3) {
                for (int var17 = 0; var17 < field495; var17++) {
                    if (field389[var17]) {
                        class80.method1706(field418[var17], field501[var17], field304[var17], field374[var17], 16711935, 128);
                    } else if (field498[var17]) {
                        class80.method1706(field418[var17], field501[var17], field304[var17], field374[var17], 16711680, 128);
                    }
                }
            }
            int var18 = Statics.field124;
            int var19 = Statics.field143.field861;
            int var20 = Statics.field143.field812;
            int var21 = field371;
            for (class24 var22 = (class24) class24.field610.method3544(); var22 != null; var22 = (class24) class24.field610.method3538()) {
                if (var22.field614 != -1 || var22.field618 != null) {
                    int var23 = 0;
                    if (var19 > var22.field611) {
                        var23 += var19 - var22.field611;
                    } else if (var19 < var22.field624) {
                        var23 += var22.field624 - var19;
                    }
                    if (var20 > var22.field612) {
                        var23 += var20 - var22.field612;
                    } else if (var20 < var22.field613) {
                        var23 += var22.field613 - var20;
                    }
                    if (var23 - 64 > var22.field615 || field533 == 0 || var22.field608 != var18) {
                        if (var22.field609 != null) {
                            Statics.field256.method1138(var22.field609);
                            var22.field609 = null;
                        }
                        if (var22.field620 != null) {
                            Statics.field256.method1138(var22.field620);
                            var22.field620 = null;
                        }
                    } else {
                        var23 -= 64;
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        int var24 = field533 * (var22.field615 - var23) / var22.field615;
                        class59 var10000;
                        if (var22.field609 != null) {
                            var22.field609.method1348(var24);
                        } else if (var22.field614 >= 0) {
                            var10000 = (class59) null;
                            class59 var25 = class59.method1232(Statics.field623, var22.field614, 0);
                            if (var25 != null) {
                                class63 var26 = var25.method1229().method1270(Statics.field1783);
                                class65 var27 = class65.method1292(var26, 100, var24);
                                var27.method1295(-1);
                                Statics.field256.method1137(var27);
                                var22.field609 = var27;
                            }
                        }
                        if (var22.field620 != null) {
                            var22.field620.method1348(var24);
                            if (!var22.field620.method3621()) {
                                var22.field620 = null;
                            }
                        } else if (var22.field618 != null && (var22.field619 -= var21) <= 0) {
                            int var28 = (int) (Math.random() * (double) var22.field618.length);
                            var10000 = (class59) null;
                            class59 var29 = class59.method1232(Statics.field623, var22.field618[var28], 0);
                            if (var29 != null) {
                                class63 var30 = var29.method1229().method1270(Statics.field1783);
                                class65 var31 = class65.method1292(var30, 100, var24);
                                var31.method1295(0);
                                Statics.field256.method1137(var31);
                                var22.field620 = var31;
                                var22.field619 = var22.field607 + (int) (Math.random() * (double) (var22.field617 - var22.field607));
                            }
                        }
                    }
                }
            }
            field371 = 0;
        } else if (field303 == 40) {
            method2447(class157.field2374 + class2.field14 + class157.field2309, false);
        } else if (field303 == 45) {
            method2447(class157.field2451, false);
        }
        if (field303 == 30 && field311 == 0 && !var12) {
            try {
                Graphics var32 = Statics.field1652.getGraphics();
                for (int var33 = 0; var33 < field495; var33++) {
                    if (field498[var33]) {
                        Statics.field157.method1537(var32, field418[var33], field501[var33], field304[var33], field374[var33]);
                        field498[var33] = false;
                    }
                }
            } catch (Exception var39) {
                Statics.field1652.repaint();
            }
        } else if (field303 > 0) {
            try {
                Graphics var35 = Statics.field1652.getGraphics();
                Statics.field157.method1536(var35, 0, 0);
                for (int var36 = 0; var36 < field495; var36++) {
                    field498[var36] = false;
                }
            } catch (Exception var38) {
                Statics.field1652.repaint();
            }
        }
    }

    @ObfuscatedName("client.t(B)V")
    public final void method537() {
        if (Statics.field284.method229()) {
            Statics.field284.method203();
        }
        if (Statics.field1870 != null) {
            Statics.field1870.field205 = false;
        }
        Statics.field1870 = null;
        if (Statics.field213 != null) {
            Statics.field213.method2823();
            Statics.field213 = null;
        }
        class137.method2656();
        class140.method2075();
        Statics.field177 = null;
        if (Statics.field1608 != null) {
            Statics.field1608.method1179();
        }
        if (Statics.field682 != null) {
            Statics.field682.method1179();
        }
        if (Statics.field2176 != null) {
            Statics.field2176.method2823();
        }
        Object var1 = class170.field2695;
        synchronized (class170.field2695) {
            if (class170.field2696 != 0) {
                class170.field2696 = 1;
                try {
                    class170.field2695.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        class149.method2676();
    }

    @ObfuscatedName("cw.w(II)V")
    public static void method2162(int arg0) {
        if (field303 == arg0) {
            return;
        }
        if (field303 == 0) {
            class144.method3170();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field493 = 0;
            field330 = 0;
            field331 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field807 != null) {
            Statics.field807.method2823();
            Statics.field807 = null;
        }
        if (field303 == 25) {
            field463 = 0;
            field350 = 0;
            field351 = 1;
            field352 = 0;
            field358 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method2298(Statics.field1652, Statics.field211, Statics.field1143, true, 0);
        } else if (arg0 == 20) {
            class32.method2298(Statics.field1652, Statics.field211, Statics.field1143, true, field303 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method2298(Statics.field1652, Statics.field211, Statics.field1143, false, 4);
        } else if (Statics.field734) {
            Statics.field737 = null;
            Statics.field155 = null;
            Statics.field716 = null;
            Statics.field717 = null;
            Statics.field718 = null;
            Statics.field3109 = null;
            Statics.field719 = null;
            Statics.field732 = null;
            Statics.field602 = null;
            Statics.field2693 = null;
            Statics.field12 = null;
            Statics.field2039 = null;
            Statics.field122 = null;
            Statics.field227 = null;
            Statics.field720 = null;
            Statics.field702 = null;
            Statics.field2006 = null;
            Statics.field724 = null;
            Statics.field1084 = null;
            Statics.field2040 = null;
            Statics.field290 = null;
            Statics.field715 = null;
            class183.method668(2);
            class171.method577(true);
            Statics.field734 = false;
        }
        field303 = arg0;
    }

    @ObfuscatedName("client.x(B)V")
    public void method238() {
        if (field303 == 1000) {
            return;
        }
        long var1 = class115.method2266();
        int var3 = (int) (var1 - Statics.field2705);
        Statics.field2705 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class171.field2716 += var3;
        boolean var4;
        if (class171.field2719 == 0 && class171.field2707 == 0 && class171.field2723 == 0 && class171.field2721 == 0) {
            var4 = true;
        } else if (Statics.field2176 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class171.field2716 > 30000) {
                        throw new IOException();
                    }
                    while (class171.field2707 < 20 && class171.field2721 > 0) {
                        class172 var5 = (class172) class171.field2704.method3512();
                        class119 var6 = new class119(4);
                        var6.method2503(1);
                        var6.method2507((int) var5.field3107);
                        Statics.field2176.method2840(var6.field1986, 0, 4);
                        class171.field2706.method3518(var5, var5.field3107);
                        class171.field2721--;
                        class171.field2707++;
                    }
                    while (class171.field2719 < 20 && class171.field2723 > 0) {
                        class172 var7 = (class172) class171.field2708.method3599();
                        class119 var8 = new class119(4);
                        var8.method2503(0);
                        var8.method2507((int) var7.field3107);
                        Statics.field2176.method2840(var8.field1986, 0, 4);
                        var7.method3603();
                        class171.field2711.method3518(var7, var7.field3107);
                        class171.field2723--;
                        class171.field2719++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2176.method2824();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class171.field2716 = 0;
                        byte var11 = 0;
                        if (Statics.field222 == null) {
                            var11 = 8;
                        } else if (class171.field2714 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class171.field2713.field1988;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2176.method2825(class171.field2713.field1986, class171.field2713.field1988, var12);
                            if (class171.field2718 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class171.field2713.field1986[class171.field2713.field1988 + var13] ^= class171.field2718;
                                }
                            }
                            class171.field2713.field1988 += var12;
                            if (class171.field2713.field1988 < var11) {
                                break;
                            }
                            if (Statics.field222 == null) {
                                class171.field2713.field1988 = 0;
                                int var14 = class171.field2713.method2388();
                                int var15 = class171.field2713.method2440();
                                int var16 = class171.field2713.method2388();
                                int var17 = class171.field2713.method2393();
                                long var18 = (long) ((var14 << 16) + var15);
                                class172 var20 = (class172) class171.field2706.method3509(var18);
                                Statics.field1998 = true;
                                if (var20 == null) {
                                    var20 = (class172) class171.field2711.method3509(var18);
                                    Statics.field1998 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field222 = var20;
                                Statics.field1748 = new class119(var17 + var21 + Statics.field222.field2727);
                                Statics.field1748.method2503(var16);
                                Statics.field1748.method2376(var17);
                                class171.field2714 = 8;
                                class171.field2713.field1988 = 0;
                            } else if (class171.field2714 == 0) {
                                if (class171.field2713.field1986[0] == -1) {
                                    class171.field2714 = 1;
                                    class171.field2713.field1988 = 0;
                                } else {
                                    Statics.field222 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1748.field1986.length - Statics.field222.field2727;
                            int var23 = 512 - class171.field2714;
                            if (var23 > var22 - Statics.field1748.field1988) {
                                var23 = var22 - Statics.field1748.field1988;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2176.method2825(Statics.field1748.field1986, Statics.field1748.field1988, var23);
                            if (class171.field2718 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1748.field1986[Statics.field1748.field1988 + var24] ^= class171.field2718;
                                }
                            }
                            Statics.field1748.field1988 += var23;
                            class171.field2714 += var23;
                            if (Statics.field1748.field1988 == var22) {
                                if (Statics.field222.field3107 == 16711935L) {
                                    Statics.field693 = Statics.field1748;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class168 var26 = class171.field2717[var25];
                                        if (var26 != null) {
                                            Statics.field693.field1988 = var25 * 8 + 5;
                                            int var27 = Statics.field693.method2393();
                                            int var28 = Statics.field693.method2393();
                                            var26.method3129(var27, var28);
                                        }
                                    }
                                } else {
                                    class171.field2710.reset();
                                    class171.field2710.update(Statics.field1748.field1986, 0, var22);
                                    int var29 = (int) class171.field2710.getValue();
                                    if (Statics.field222.field2726 != var29) {
                                        try {
                                            Statics.field2176.method2823();
                                        } catch (Exception var35) {
                                        }
                                        class171.field2724++;
                                        Statics.field2176 = null;
                                        class171.field2718 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class171.field2724 = 0;
                                    class171.field2720 = 0;
                                    Statics.field222.field2729.method3130((int) (Statics.field222.field3107 & 0xFFFFL), Statics.field1748.field1986, (Statics.field222.field3107 & 0xFF0000L) == 16711680L, Statics.field1998);
                                }
                                Statics.field222.method3620();
                                if (Statics.field1998) {
                                    class171.field2707--;
                                } else {
                                    class171.field2719--;
                                }
                                class171.field2714 = 0;
                                Statics.field222 = null;
                                Statics.field1748 = null;
                            } else {
                                if (class171.field2714 != 512) {
                                    break;
                                }
                                class171.field2714 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2176.method2823();
                } catch (Exception var34) {
                }
                class171.field2720++;
                Statics.field2176 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method239();
        }
    }

    @ObfuscatedName("client.k(I)V")
    public void method239() {
        if (class171.field2724 >= 4) {
            this.method2866("js5crc");
            field303 = 1000;
            return;
        }
        if (class171.field2720 >= 4) {
            if (field303 <= 5) {
                this.method2866("js5io");
                field303 = 1000;
                return;
            }
            field344 = 3000;
            class171.field2720 = 3;
        }
        if (--field344 + 1 > 0) {
            return;
        }
        try {
            if (field325 == 0) {
                Statics.field622 = Statics.field93.method2722(Statics.field1036, Statics.field1967);
                field325++;
            }
            if (field325 == 1) {
                if (Statics.field622.field2215 == 2) {
                    this.method240(-1);
                    return;
                }
                if (Statics.field622.field2215 == 1) {
                    field325++;
                }
            }
            if (field325 == 2) {
                Statics.field2132 = new class143((Socket) Statics.field622.field2211, Statics.field93);
                class119 var1 = new class119(5);
                var1.method2503(15);
                var1.method2376(99);
                Statics.field2132.method2840(var1.field1986, 0, 5);
                field325++;
                Statics.field1973 = class115.method2266();
            }
            if (field325 == 3) {
                if (field303 <= 5 || Statics.field2132.method2824() > 0) {
                    int var2 = Statics.field2132.method2826();
                    if (var2 != 0) {
                        this.method240(var2);
                        return;
                    }
                    field325++;
                } else if (class115.method2266() - Statics.field1973 > 30000L) {
                    this.method240(-2);
                    return;
                }
            }
            if (field325 == 4) {
                class171.method731(Statics.field2132, field303 > 20);
                Statics.field622 = null;
                Statics.field2132 = null;
                field325 = 0;
                field421 = 0;
            }
        } catch (IOException var4) {
            this.method240(-3);
        }
    }

    @ObfuscatedName("client.z(II)V")
    public void method240(int arg0) {
        Statics.field622 = null;
        Statics.field2132 = null;
        field325 = 0;
        if (Statics.field1967 == Statics.field1379) {
            Statics.field1967 = Statics.field192;
        } else {
            Statics.field1967 = Statics.field1379;
        }
        field421++;
        if (field421 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field303 <= 5) {
                this.method2866("js5connect_full");
                field303 = 1000;
            } else {
                field344 = 3000;
            }
        } else if (field421 >= 2 && arg0 == 6) {
            this.method2866("js5connect_outofdate");
            field303 = 1000;
        } else if (field421 >= 4) {
            if (field303 <= 5) {
                this.method2866("js5connect");
                field303 = 1000;
            } else {
                field344 = 3000;
            }
        }
    }

    @ObfuscatedName("ar.v(I)V")
    public static void method719() {
        if (field324 == 0) {
            Statics.field136 = new class86(4, 104, 104, class6.field80);
            for (int var0 = 0; var0 < 4; var0++) {
                field521[var0] = new class108(104, 104);
            }
            Statics.field1090 = new class79(512, 512);
            class32.field747 = class157.field2456;
            class32.field733 = 5;
            field324 = 20;
        } else if (field324 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1550[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1826(var1, 500, 800, 512, 334);
            class32.field747 = class157.field2502;
            class32.field733 = 10;
            field324 = 30;
        } else if (field324 == 30) {
            Statics.field1032 = method2941(0, false, true, true);
            Statics.field765 = method2941(1, false, true, true);
            Statics.field1971 = method2941(2, true, false, true);
            Statics.field637 = method2941(3, false, true, true);
            Statics.field623 = method2941(4, false, true, true);
            Statics.field1757 = method2941(5, true, true, true);
            Statics.field1868 = method2941(6, true, true, false);
            Statics.field2077 = method2941(7, false, true, true);
            Statics.field1143 = method2941(8, false, true, true);
            Statics.field327 = method2941(9, false, true, true);
            Statics.field211 = method2941(10, false, true, true);
            Statics.field2699 = method2941(11, false, true, true);
            Statics.field1951 = method2941(12, false, true, true);
            Statics.field3147 = method2941(13, true, false, true);
            Statics.field676 = method2941(14, false, true, false);
            Statics.field2076 = method2941(15, false, true, true);
            class32.field747 = class157.field2548;
            class32.field733 = 20;
            field324 = 40;
        } else if (field324 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1032.method3127() * 4 / 100;
            int var8 = var7 + Statics.field765.method3127() * 4 / 100;
            int var9 = var8 + Statics.field1971.method3127() * 2 / 100;
            int var10 = var9 + Statics.field637.method3127() * 2 / 100;
            int var11 = var10 + Statics.field623.method3127() * 6 / 100;
            int var12 = var11 + Statics.field1757.method3127() * 4 / 100;
            int var13 = var12 + Statics.field1868.method3127() * 2 / 100;
            int var14 = var13 + Statics.field2077.method3127() * 60 / 100;
            int var15 = var14 + Statics.field1143.method3127() * 2 / 100;
            int var16 = var15 + Statics.field327.method3127() * 2 / 100;
            int var17 = var16 + Statics.field211.method3127() * 2 / 100;
            int var18 = var17 + Statics.field2699.method3127() * 2 / 100;
            int var19 = var18 + Statics.field1951.method3127() * 2 / 100;
            int var20 = var19 + Statics.field3147.method3127() * 2 / 100;
            int var21 = var20 + Statics.field676.method3127() * 2 / 100;
            int var22 = var21 + Statics.field2076.method3127() * 2 / 100;
            if (var22 == 100) {
                class32.field747 = class157.field2445;
                class32.field733 = 30;
                field324 = 45;
            } else {
                if (var22 != 0) {
                    class32.field747 = class157.field2313 + var22 + "%";
                }
                class32.field733 = 30;
            }
        } else if (field324 == 45) {
            class57.method2171(22050, !field300, 2);
            class184 var23 = new class184();
            var23.method3429(9, 128);
            Statics.field1608 = class57.method3214(Statics.field93, Statics.field1652, 0, 22050);
            Statics.field1608.method1202(var23);
            class183.method3169(Statics.field2076, Statics.field676, Statics.field623, var23);
            Statics.field682 = class57.method3214(Statics.field93, Statics.field1652, 1, 2048);
            Statics.field256 = new class56();
            Statics.field682.method1202(Statics.field256);
            Statics.field1783 = new class75(22050, Statics.field1167);
            class32.field747 = class157.field2315;
            class32.field733 = 35;
            field324 = 50;
        } else if (field324 == 50) {
            int var24 = 0;
            if (Statics.field1441 == null) {
                Statics.field1441 = class77.method935(Statics.field1143, Statics.field3147, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field1782 == null) {
                class168 var25 = Statics.field1143;
                class168 var26 = Statics.field3147;
                int var27 = var25.method3056("p12_full");
                int var28 = var25.method3091(var27, "");
                class224 var29 = class77.method1082(var25, var26, var27, var28);
                Statics.field1782 = var29;
            } else {
                var24++;
            }
            if (Statics.field163 == null) {
                Statics.field163 = class77.method935(Statics.field1143, Statics.field3147, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class32.field747 = class157.field2316 + var24 * 100 / 3 + "%";
                class32.field733 = 40;
            } else {
                Statics.field656 = new class160(true);
                class32.field747 = class157.field2540;
                class32.field733 = 40;
                field324 = 60;
            }
        } else if (field324 == 60) {
            class168 var30 = Statics.field211;
            class168 var31 = Statics.field1143;
            int var32 = 0;
            if (var30.method3101("title.jpg", "")) {
                var32++;
            }
            if (var31.method3101("logo", "")) {
                var32++;
            }
            if (var31.method3101("logo_deadman_mode", "")) {
                var32++;
            }
            if (var31.method3101("titlebox", "")) {
                var32++;
            }
            if (var31.method3101("titlebutton", "")) {
                var32++;
            }
            if (var31.method3101("runes", "")) {
                var32++;
            }
            if (var31.method3101("title_mute", "")) {
                var32++;
            }
            if (var31.method3068("options_radio_buttons,0")) {
                var32++;
            }
            if (var31.method3068("options_radio_buttons,2")) {
                var32++;
            }
            var31.method3101("sl_back", "");
            var31.method3101("sl_flags", "");
            var31.method3101("sl_arrows", "");
            var31.method3101("sl_stars", "");
            var31.method3101("sl_button", "");
            int var35 = class32.method893();
            if (var32 < var35) {
                class32.field747 = class157.field2318 + var32 * 100 / var35 + "%";
                class32.field733 = 50;
            } else {
                class32.field747 = class157.field2319;
                class32.field733 = 50;
                method2162(5);
                field324 = 70;
            }
        } else if (field324 == 70) {
            if (Statics.field1971.method3054()) {
                class168 var36 = Statics.field1971;
                Statics.field1029 = var36;
                class168 var37 = Statics.field1971;
                Statics.field979 = var37;
                class45.method2660(Statics.field1971, Statics.field2077);
                class168 var38 = Statics.field1971;
                class168 var39 = Statics.field2077;
                boolean var40 = field300;
                Statics.field921 = var38;
                Statics.field3036 = var39;
                class41.field955 = var40;
                class168 var41 = Statics.field1971;
                class168 var42 = Statics.field2077;
                Statics.field906 = var41;
                Statics.field882 = var42;
                class168 var43 = Statics.field1971;
                class168 var44 = Statics.field2077;
                boolean var45 = field504;
                class224 var46 = Statics.field1441;
                Statics.field2895 = var43;
                Statics.field1118 = var44;
                Statics.field575 = var45;
                Statics.field875 = Statics.field2895.method3085(10);
                Statics.field2637 = var46;
                class168 var47 = Statics.field1971;
                class168 var48 = Statics.field1032;
                class168 var49 = Statics.field765;
                Statics.field991 = var47;
                Statics.field1963 = var48;
                Statics.field2630 = var49;
                Statics.method561(Statics.field1971, Statics.field2077);
                class168 var50 = Statics.field1971;
                Statics.field2635 = var50;
                class168 var51 = Statics.field1971;
                Statics.field1147 = var51;
                Statics.field1030 = Statics.field1147.method3085(16);
                class168 var52 = Statics.field637;
                class168 var53 = Statics.field2077;
                class168 var54 = Statics.field1143;
                class168 var55 = Statics.field3147;
                Statics.field2733 = var52;
                Statics.field2734 = var53;
                Statics.field774 = var54;
                Statics.field2735 = var55;
                Statics.field2868 = new class173[Statics.field2733.method3106()][];
                Statics.field2780 = new boolean[Statics.field2733.method3106()];
                class51.method701(Statics.field1971);
                class168 var56 = Statics.field1971;
                Statics.field1069 = var56;
                class168 var57 = Statics.field1971;
                Statics.field1034 = var57;
                class168 var58 = Statics.field1971;
                Statics.field1080 = var58;
                Statics.field284 = new class20();
                class32.field747 = class157.field2321;
                class32.field733 = 60;
                field324 = 80;
            } else {
                class32.field747 = class157.field2320 + Statics.field1971.method3134() + "%";
                class32.field733 = 60;
            }
        } else if (field324 == 80) {
            int var59 = 0;
            if (Statics.field1372 == null) {
                class168 var60 = Statics.field1143;
                int var61 = var60.method3056("compass");
                int var62 = var60.method3091(var61, "");
                class79 var63;
                if (class77.method729(var60, var61, var62)) {
                    class79 var64 = new class79();
                    var64.field1395 = Statics.field1365;
                    var64.field1396 = Statics.field1366;
                    var64.field1393 = Statics.field1370[0];
                    var64.field1394 = Statics.field1376[0];
                    var64.field1398 = Statics.field2631[0];
                    var64.field1392 = Statics.field224[0];
                    int var65 = var64.field1398 * var64.field1392;
                    byte[] var66 = Statics.field2035[0];
                    var64.field1401 = new int[var65];
                    for (int var67 = 0; var67 < var65; var67++) {
                        var64.field1401[var67] = Statics.field1954[var66[var67] & 0xFF];
                    }
                    class77.method757();
                    var63 = var64;
                } else {
                    var63 = null;
                }
                Statics.field1372 = var63;
            } else {
                var59++;
            }
            if (Statics.field1363 == null) {
                class168 var70 = Statics.field1143;
                int var71 = var70.method3056("mapedge");
                int var72 = var70.method3091(var71, "");
                class79 var73;
                if (class77.method729(var70, var71, var72)) {
                    class79 var74 = new class79();
                    var74.field1395 = Statics.field1365;
                    var74.field1396 = Statics.field1366;
                    var74.field1393 = Statics.field1370[0];
                    var74.field1394 = Statics.field1376[0];
                    var74.field1398 = Statics.field2631[0];
                    var74.field1392 = Statics.field224[0];
                    int var75 = var74.field1398 * var74.field1392;
                    byte[] var76 = Statics.field2035[0];
                    var74.field1401 = new int[var75];
                    for (int var77 = 0; var77 < var75; var77++) {
                        var74.field1401[var77] = Statics.field1954[var76[var77] & 0xFF];
                    }
                    class77.method757();
                    var73 = var74;
                } else {
                    var73 = null;
                }
                Statics.field1363 = var73;
            } else {
                var59++;
            }
            if (Statics.field1337 == null) {
                Statics.field1337 = class77.method657(Statics.field1143, "mapscene", "");
            } else {
                var59++;
            }
            if (Statics.field2004 == null) {
                Statics.field2004 = class77.method582(Statics.field1143, "mapfunction", "");
            } else {
                var59++;
            }
            if (Statics.field179 == null) {
                Statics.field179 = class77.method582(Statics.field1143, "hitmarks", "");
            } else {
                var59++;
            }
            if (Statics.field2142 == null) {
                Statics.field2142 = class77.method582(Statics.field1143, "headicons_pk", "");
            } else {
                var59++;
            }
            if (Statics.field1898 == null) {
                Statics.field1898 = class77.method582(Statics.field1143, "headicons_prayer", "");
            } else {
                var59++;
            }
            if (Statics.field750 == null) {
                Statics.field750 = class77.method582(Statics.field1143, "headicons_hint", "");
            } else {
                var59++;
            }
            if (Statics.field1588 == null) {
                Statics.field1588 = class77.method582(Statics.field1143, "mapmarker", "");
            } else {
                var59++;
            }
            if (Statics.field3167 == null) {
                Statics.field3167 = class77.method582(Statics.field1143, "cross", "");
            } else {
                var59++;
            }
            if (Statics.field1360 == null) {
                Statics.field1360 = class77.method582(Statics.field1143, "mapdots", "");
            } else {
                var59++;
            }
            if (Statics.field220 == null) {
                Statics.field220 = class77.method657(Statics.field1143, "scrollbar", "");
            } else {
                var59++;
            }
            if (Statics.field283 == null) {
                Statics.field283 = class77.method657(Statics.field1143, "mod_icons", "");
            } else {
                var59++;
            }
            if (var59 < 13) {
                class32.field747 = class157.field2322 + var59 * 100 / 13 + "%";
                class32.field733 = 70;
            } else {
                Statics.field3179 = Statics.field283;
                Statics.field1363.method1610();
                int var80 = (int) (Math.random() * 21.0D) - 10;
                int var81 = (int) (Math.random() * 21.0D) - 10;
                int var82 = (int) (Math.random() * 21.0D) - 10;
                int var83 = (int) (Math.random() * 41.0D) - 20;
                for (int var84 = 0; var84 < Statics.field2004.length; var84++) {
                    Statics.field2004[var84].method1609(var80 + var83, var81 + var83, var82 + var83);
                }
                Statics.field1337[0].method1760(var80 + var83, var81 + var83, var82 + var83);
                class32.field747 = class157.field2386;
                class32.field733 = 70;
                field324 = 90;
            }
        } else if (field324 == 90) {
            if (Statics.field327.method3054()) {
                class95 var85 = new class95(Statics.field327, Statics.field1143, 20, 0.8D, field300 ? 64 : 128);
                class91.method1974(var85);
                class91.method1975(0.8D);
                class32.field747 = class157.field2538;
                class32.field733 = 90;
                field324 = 110;
            } else {
                class32.field747 = class157.field2324 + Statics.field327.method3134() + "%";
                class32.field733 = 90;
            }
        } else if (field324 == 110) {
            Statics.field1870 = new class14();
            Statics.field93.method2736(Statics.field1870, 10);
            class32.field747 = class157.field2304;
            class32.field733 = 94;
            field324 = 120;
        } else if (field324 == 120) {
            if (Statics.field211.method3101("huffman", "")) {
                class113 var86 = new class113(Statics.field211.method3066("huffman", ""));
                Statics.field3168 = var86;
                class32.field747 = class157.field2398;
                class32.field733 = 96;
                field324 = 130;
            } else {
                class32.field747 = class157.field2327 + "%";
                class32.field733 = 96;
            }
        } else if (field324 == 130) {
            if (!Statics.field637.method3054()) {
                class32.field747 = class157.field2329 + Statics.field637.method3134() * 4 / 5 + "%";
                class32.field733 = 100;
            } else if (!Statics.field1951.method3054()) {
                class32.field747 = class157.field2329 + (80 + Statics.field1951.method3134() / 6) + "%";
                class32.field733 = 100;
            } else if (Statics.field3147.method3054()) {
                class32.field747 = class157.field2330;
                class32.field733 = 100;
                field324 = 140;
            } else {
                class32.field747 = class157.field2329 + (96 + Statics.field3147.method3134() / 20) + "%";
                class32.field733 = 100;
            }
        } else if (field324 == 140) {
            method2162(10);
        }
    }

    @ObfuscatedName("ee.j(IZZZI)Lfr;")
    public static class168 method2941(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2236 != null) {
            var4 = new class134(arg0, class149.field2236, Statics.field1862[arg0], 1000000);
        }
        return new class168(var4, Statics.field1070, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("p.f(I)V")
    public static final void method99() {
        try {
            if (field493 == 0) {
                if (Statics.field213 != null) {
                    Statics.field213.method2823();
                    Statics.field213 = null;
                }
                Statics.field587 = null;
                field435 = false;
                field330 = 0;
                field493 = 1;
            }
            if (field493 == 1) {
                if (Statics.field587 == null) {
                    Statics.field587 = Statics.field93.method2722(Statics.field1036, Statics.field1967);
                }
                if (Statics.field587.field2215 == 2) {
                    throw new IOException();
                }
                if (Statics.field587.field2215 == 1) {
                    Statics.field213 = new class143((Socket) Statics.field587.field2211, Statics.field93);
                    Statics.field587 = null;
                    field493 = 2;
                }
            }
            if (field493 == 2) {
                field338.field1988 = 0;
                field338.method2503(14);
                Statics.field213.method2840(field338.field1986, 0, 1);
                field411.field1988 = 0;
                field493 = 3;
            }
            if (field493 == 3) {
                if (Statics.field1608 != null) {
                    Statics.field1608.method1177();
                }
                if (Statics.field682 != null) {
                    Statics.field682.method1177();
                }
                int var0 = Statics.field213.method2826();
                if (Statics.field1608 != null) {
                    Statics.field1608.method1177();
                }
                if (Statics.field682 != null) {
                    Statics.field682.method1177();
                }
                if (var0 != 0) {
                    method97(var0);
                    return;
                }
                field411.field1988 = 0;
                field493 = 5;
            }
            if (field493 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field338.field1988 = 0;
                field338.method2503(1);
                field338.method2503(class32.field741.method567());
                field338.method2376(var1[0]);
                field338.method2376(var1[1]);
                field338.method2376(var1[2]);
                field338.method2376(var1[3]);
                switch(class32.field741.field2585) {
                    case 0:
                        field338.field1988 += 8;
                        break;
                    case 1:
                    case 3:
                        field338.method2507(Statics.field2925);
                        field338.field1988 += 5;
                        break;
                    case 2:
                        field338.method2376((Integer) Statics.field1371.field137.get(class163.method664(class32.field739)));
                        field338.field1988 += 4;
                }
                field338.method2379(class32.field740);
                field338.method2408(class5.field73, class5.field72);
                field332.field1988 = 0;
                if (field303 == 40) {
                    field332.method2503(18);
                } else {
                    field332.method2503(16);
                }
                field332.method2374(0);
                int var2 = field332.field1988;
                field332.method2376(99);
                field332.method2420(field338.field1986, 0, field338.field1988);
                int var3 = field332.field1988;
                field332.method2379(class32.field739);
                field332.method2503((field506 ? 1 : 0) << 1 | (field300 ? 1 : 0));
                field332.method2374(Statics.field1543);
                field332.method2374(Statics.field121);
                class122 var4 = field332;
                byte[] var5 = new byte[24];
                try {
                    class149.field2233.method3836(0L);
                    class149.field2233.method3838(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var37) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2420(var5, 0, 24);
                field332.method2379(Statics.field447);
                field332.method2376(Statics.field3148);
                class119 var9 = new class119(Statics.field656.method2965());
                Statics.field656.method2980(var9);
                field332.method2420(var9.field1986, 0, var9.field1986.length);
                field332.method2503(Statics.field679);
                field332.method2376(Statics.field1032.field2669);
                field332.method2376(Statics.field765.field2669);
                field332.method2376(Statics.field1971.field2669);
                field332.method2376(Statics.field637.field2669);
                field332.method2376(Statics.field623.field2669);
                field332.method2376(Statics.field1757.field2669);
                field332.method2376(Statics.field1868.field2669);
                field332.method2376(Statics.field2077.field2669);
                field332.method2376(Statics.field1143.field2669);
                field332.method2376(Statics.field327.field2669);
                field332.method2376(Statics.field211.field2669);
                field332.method2376(Statics.field2699.field2669);
                field332.method2376(Statics.field1951.field2669);
                field332.method2376(Statics.field3147.field2669);
                field332.method2376(Statics.field676.field2669);
                field332.method2376(Statics.field2076.field2669);
                field332.method2406(var1, var3, field332.field1988);
                field332.method2384(field332.field1988 - var2);
                Statics.field213.method2840(field332.field1986, 0, field332.field1988);
                field338.method2626(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field411.method2626(var1);
                field493 = 6;
            }
            if (field493 == 6 && Statics.field213.method2824() > 0) {
                int var11 = Statics.field213.method2826();
                if (var11 == 21 && field303 == 20) {
                    field493 = 7;
                } else if (var11 == 2) {
                    field493 = 9;
                } else if (var11 == 15 && field303 == 40) {
                    field341 = -1;
                    field493 = 13;
                } else if (var11 == 23 && field331 < 1) {
                    field331++;
                    field493 = 0;
                } else if (var11 == 29) {
                    field493 = 11;
                } else {
                    method97(var11);
                    return;
                }
            }
            if (field493 == 7 && Statics.field213.method2824() > 0) {
                field500 = (Statics.field213.method2826() + 3) * 60;
                field493 = 8;
            }
            if (field493 == 8) {
                field330 = 0;
                class32.method2964(class157.field2334, class157.field2335, field500 / 60 + class157.field2336);
                if (--field500 <= 0) {
                    field493 = 0;
                }
            } else {
                if (field493 == 9 && Statics.field213.method2824() >= 13) {
                    boolean var12 = Statics.field213.method2826() == 1;
                    Statics.field213.method2825(field411.field1986, 0, 4);
                    field411.field1988 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field411.method2623() << 24;
                        int var15 = var14 | field411.method2623() << 16;
                        int var16 = var15 | field411.method2623() << 8;
                        int var17 = var16 | field411.method2623();
                        int var18 = class163.method664(class32.field739);
                        if (Statics.field1371.field137.size() >= 10 && !Statics.field1371.field137.containsKey(var18)) {
                            Iterator var19 = Statics.field1371.field137.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field1371.field137.put(var18, var17);
                        class9.method3716();
                    }
                    field368 = Statics.field213.method2826();
                    field461 = Statics.field213.method2826() == 1;
                    field416 = Statics.field213.method2826();
                    field416 <<= 0x8;
                    field416 += Statics.field213.method2826();
                    field451 = Statics.field213.method2826();
                    Statics.field213.method2825(field411.field1986, 0, 1);
                    field411.field1988 = 0;
                    field342 = field411.method2623();
                    Statics.field213.method2825(field411.field1986, 0, 2);
                    field411.field1988 = 0;
                    field341 = field411.method2440();
                    if (field451 == 1) {
                        try {
                            client var20 = Statics.field293;
                            JSObject.getWindow(var20).call("zap", (Object[]) null);
                        } catch (Throwable var36) {
                        }
                    } else {
                        try {
                            client var22 = Statics.field293;
                            JSObject.getWindow(var22).call("unzap", (Object[]) null);
                        } catch (Throwable var35) {
                        }
                    }
                    field493 = 10;
                }
                if (field493 != 10) {
                    if (field493 == 11 && Statics.field213.method2824() >= 2) {
                        field411.field1988 = 0;
                        Statics.field213.method2825(field411.field1986, 0, 2);
                        field411.field1988 = 0;
                        Statics.field661 = field411.method2440();
                        field493 = 12;
                    }
                    if (field493 == 12 && Statics.field213.method2824() >= Statics.field661) {
                        field411.field1988 = 0;
                        Statics.field213.method2825(field411.field1986, 0, Statics.field661);
                        field411.field1988 = 0;
                        String var24 = field411.method2396();
                        String var25 = field411.method2396();
                        String var26 = field411.method2396();
                        class32.method2964(var24, var25, var26);
                        method2162(10);
                    }
                    if (field493 == 13) {
                        if (field341 == -1) {
                            if (Statics.field213.method2824() < 2) {
                                return;
                            }
                            Statics.field213.method2825(field411.field1986, 0, 2);
                            field411.field1988 = 0;
                            field341 = field411.method2440();
                        }
                        if (Statics.field213.method2824() >= field341) {
                            Statics.field213.method2825(field411.field1986, 0, field341);
                            field411.field1988 = 0;
                            int var27 = field341;
                            field338.field1988 = 0;
                            field411.field1988 = 0;
                            field342 = -1;
                            field345 = -1;
                            field346 = -1;
                            field347 = -1;
                            field341 = 0;
                            field343 = 0;
                            field531 = 0;
                            field434 = 0;
                            field433 = false;
                            field487 = 0;
                            field526 = 0;
                            for (int var28 = 0; var28 < 2048; var28++) {
                                field415[var28] = null;
                            }
                            Statics.field143 = null;
                            for (int var29 = 0; var29 < field438.length; var29++) {
                                class35 var30 = field438[var29];
                                if (var30 != null) {
                                    var30.field840 = -1;
                                    var30.field853 = false;
                                }
                            }
                            class16.field225 = new class196(32);
                            method2162(30);
                            for (int var31 = 0; var31 < 100; var31++) {
                                field497[var31] = true;
                            }
                            field338.method2622(61);
                            class122 var32 = field338;
                            int var33 = field506 ? 2 : 1;
                            var32.method2503(var33);
                            field338.method2374(Statics.field1543);
                            field338.method2374(Statics.field121);
                            class33.method50(field411);
                            if (field411.field1988 != var27) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field330++;
                        if (field330 > 2000) {
                            if (field331 < 1) {
                                if (Statics.field1967 == Statics.field1379) {
                                    Statics.field1967 = Statics.field192;
                                } else {
                                    Statics.field1967 = Statics.field1379;
                                }
                                field331++;
                                field493 = 0;
                            } else {
                                method97(-3);
                            }
                        }
                    }
                } else if (Statics.field213.method2824() >= field341) {
                    field411.field1988 = 0;
                    Statics.field213.method2825(field411.field1986, 0, field341);
                    method2257();
                    class33.method50(field411);
                    Statics.field1073 = -1;
                    method2934(false);
                    field342 = -1;
                }
            }
        } catch (IOException var38) {
            if (field331 < 1) {
                if (Statics.field1967 == Statics.field1379) {
                    Statics.field1967 = Statics.field192;
                } else {
                    Statics.field1967 = Statics.field1379;
                }
                field331++;
                field493 = 0;
            } else {
                method97(-2);
            }
        }
    }

    @ObfuscatedName("db.c(B)V")
    public static void method2257() {
        field366 = 1L;
        field309 = -1;
        Statics.field1870.field209 = 0;
        Statics.field1874 = true;
        field310 = true;
        field518 = -1L;
        class211.method2332();
        field338.field1988 = 0;
        field411.field1988 = 0;
        field342 = -1;
        field345 = -1;
        field346 = -1;
        field347 = -1;
        field343 = 0;
        field531 = 0;
        field348 = 0;
        field420 = 0;
        field434 = 0;
        field433 = false;
        class140.field2146 = 0;
        class12.method756();
        field445 = 0;
        field323 = false;
        field534 = 0;
        field359 = (int) (Math.random() * 100.0D) - 50;
        field361 = (int) (Math.random() * 110.0D) - 55;
        field363 = (int) (Math.random() * 80.0D) - 40;
        field443 = (int) (Math.random() * 120.0D) - 60;
        field295 = (int) (Math.random() * 30.0D) - 20;
        field442 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field487 = 0;
        field329 = -1;
        field526 = 0;
        field353 = 0;
        field321 = class21.field582;
        field307 = class21.field582;
        field334 = 0;
        Statics.method749();
        for (int var0 = 0; var0 < 2048; var0++) {
            field415[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field438[var1] = null;
        }
        field424 = -1;
        field427.method3568();
        field428.method3568();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field425[var2][var3][var4] = null;
                }
            }
        }
        field426 = new class199();
        field561 = 0;
        field560 = 0;
        field564 = 0;
        for (int var5 = 0; var5 < Statics.field1030; var5++) {
            class53 var6 = class53.method753(var5);
            if (var6 != null) {
                class176.field2888[var5] = 0;
                class176.field2889[var5] = 0;
            }
        }
        Statics.field284.method213();
        field529 = -1;
        if (field452 != -1) {
            class173.method3644(field452);
        }
        for (class4 var7 = (class4) field453.method3512(); var7 != null; var7 = (class4) field453.method3513()) {
            method1214(var7, true);
        }
        field452 = -1;
        field453 = new class196(8);
        field405 = null;
        field433 = false;
        field434 = 0;
        field572.method3240((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field354[var8] = null;
            field422[var8] = false;
        }
        class16.field225 = new class196(32);
        field333 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field497[var9] = true;
        }
        field338.method2622(61);
        class122 var10 = field338;
        int var11 = field506 ? 2 : 1;
        var10.method2503(var11);
        field338.method2374(Statics.field1543);
        field338.method2374(Statics.field121);
        field519 = null;
        Statics.field1944 = 0;
        Statics.field2189 = null;
        for (int var12 = 0; var12 < 8; var12++) {
            field569[var12] = new class220();
        }
        Statics.field2642 = null;
    }

    @ObfuscatedName("p.s(II)V")
    public static void method97(int arg0) {
        if (arg0 == -3) {
            class32.method2964(class157.field2337, class157.field2466, class157.field2339);
        } else if (arg0 == -2) {
            class32.method2964(class157.field2437, class157.field2341, class157.field2461);
        } else if (arg0 == -1) {
            class32.method2964(class157.field2463, class157.field2344, class157.field2323);
        } else if (arg0 == 3) {
            class32.method2964(class157.field2455, class157.field2423, class157.field2348);
        } else if (arg0 == 4) {
            class32.method2964(class157.field2349, class157.field2534, class157.field2541);
        } else if (arg0 == 5) {
            class32.method2964(class157.field2308, class157.field2353, class157.field2495);
        } else if (arg0 == 6) {
            class32.method2964(class157.field2488, class157.field2356, class157.field2357);
        } else if (arg0 == 7) {
            class32.method2964(class157.field2358, class157.field2477, class157.field2360);
        } else if (arg0 == 8) {
            class32.method2964(class157.field2361, class157.field2362, class157.field2517);
        } else if (arg0 == 9) {
            class32.method2964(class157.field2364, class157.field2365, class157.field2366);
        } else if (arg0 == 10) {
            class32.method2964(class157.field2367, class157.field2338, class157.field2369);
        } else if (arg0 == 11) {
            class32.method2964(class157.field2370, class157.field2371, class157.field2441);
        } else if (arg0 == 12) {
            class32.method2964(class157.field2454, class157.field2317, class157.field2375);
        } else if (arg0 == 13) {
            class32.method2964(class157.field2376, class157.field2377, class157.field2378);
        } else if (arg0 == 14) {
            class32.method2964(class157.field2314, class157.field2380, class157.field2381);
        } else if (arg0 == 16) {
            class32.method2964(class157.field2382, class157.field2550, class157.field2384);
        } else if (arg0 == 17) {
            class32.method2964(class157.field2408, class157.field2450, class157.field2387);
        } else if (arg0 == 18) {
            class32.method2964(class157.field2388, class157.field2389, class157.field2390);
        } else if (arg0 == 19) {
            class32.method2964(class157.field2429, class157.field2392, class157.field2393);
        } else if (arg0 == 20) {
            class32.method2964(class157.field2394, class157.field2395, class157.field2547);
        } else if (arg0 == 22) {
            class32.method2964(class157.field2401, class157.field2480, class157.field2399);
        } else if (arg0 == 23) {
            class32.method2964(class157.field2400, class157.field2457, class157.field2402);
        } else if (arg0 == 24) {
            class32.method2964(class157.field2403, class157.field2404, class157.field2405);
        } else if (arg0 == 25) {
            class32.method2964(class157.field2406, class157.field2407, class157.field2373);
        } else if (arg0 == 26) {
            class32.method2964(class157.field2409, class157.field2379, class157.field2417);
        } else if (arg0 == 27) {
            class32.method2964(class157.field2412, class157.field2413, class157.field2340);
        } else if (arg0 == 31) {
            class32.method2964(class157.field2421, class157.field2422, class157.field2346);
        } else if (arg0 == 32) {
            class32.method2964(class157.field2424, class157.field2425, class157.field2325);
        } else if (arg0 == 37) {
            class32.method2964(class157.field2427, class157.field2411, class157.field2414);
        } else if (arg0 == 38) {
            class32.method2964(class157.field2342, class157.field2467, class157.field2432);
        } else if (arg0 == 55) {
            class32.method2964(class157.field2557, class157.field2434, class157.field2435);
        } else if (arg0 == 56) {
            class32.method2964(class157.field2436, class157.field2397, class157.field2438);
            method2162(11);
            return;
        } else if (arg0 == 57) {
            class32.method2964(class157.field2439, class157.field2368, class157.field2537);
            method2162(11);
            return;
        } else {
            class32.method2964(class157.field2442, class157.field2383, class157.field2444);
        }
        method2162(10);
    }

    @ObfuscatedName("as.r(I)V")
    public static final void method884() {
        if (Statics.field213 != null) {
            Statics.field213.method2823();
            Statics.field213 = null;
        }
        method581();
        Statics.field136.method1792();
        for (int var0 = 0; var0 < 4; var0++) {
            field521[var0].method2261();
        }
        System.gc();
        class183.method668(2);
        field530 = -1;
        field462 = false;
        for (class24 var1 = (class24) class24.field610.method3544(); var1 != null; var1 = (class24) class24.field610.method3538()) {
            if (var1.field609 != null) {
                Statics.field256.method1138(var1.field609);
                var1.field609 = null;
            }
            if (var1.field620 != null) {
                Statics.field256.method1138(var1.field620);
                var1.field620 = null;
            }
        }
        class24.field610.method3568();
        method2162(10);
    }

    @ObfuscatedName("h.u(I)V")
    public static final void method581() {
        class47.method661();
        class42.method650();
        class45.method155();
        class41.method2071();
        class40.field883.method3481();
        class40.field914.method3481();
        class52.field1095.method3481();
        class52.field1096.method3481();
        class52.field1109.method3481();
        class43.field982.method3481();
        class43.field983.method3481();
        class44.method112();
        class48.method942();
        class53.field1145.method3481();
        class179.method656();
        class173.method2643();
        ((class95) Statics.field1564).method2067();
        class23.field598.method3481();
        Statics.field1032.method3063();
        Statics.field765.method3063();
        Statics.field637.method3063();
        Statics.field623.method3063();
        Statics.field1757.method3063();
        Statics.field1868.method3063();
        Statics.field2077.method3063();
        Statics.field1143.method3063();
        Statics.field327.method3063();
        Statics.field211.method3063();
        Statics.field2699.method3063();
        Statics.field1951.method3063();
    }

    @ObfuscatedName("au.a(I)V")
    public static final void method659() {
        if (field348 > 0) {
            method884();
        } else {
            method2162(40);
            Statics.field807 = Statics.field213;
            Statics.field213 = null;
        }
    }

    @ObfuscatedName("ce.h(B)V")
    public static final void method1784() {
        if (field531 > 1) {
            field531--;
        }
        if (field348 > 0) {
            field348--;
        }
        if (field435) {
            field435 = false;
            method659();
            return;
        }
        if (!field433) {
            field439[0] = class157.field2560;
            field440[0] = "";
            field437[0] = 1006;
            field434 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field213 == null) {
                var1 = false;
            } else {
                label2602: {
                    try {
                        int var2 = Statics.field213.method2824();
                        if (var2 == 0) {
                            var1 = false;
                            break label2602;
                        }
                        if (field342 == -1) {
                            Statics.field213.method2825(field411.field1986, 0, 1);
                            field411.field1988 = 0;
                            field342 = field411.method2623();
                            field341 = class188.field3031[field342];
                            var2--;
                        }
                        if (field341 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2602;
                            }
                            Statics.field213.method2825(field411.field1986, 0, 1);
                            field341 = field411.field1986[0] & 0xFF;
                            var2--;
                        }
                        if (field341 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2602;
                            }
                            Statics.field213.method2825(field411.field1986, 0, 2);
                            field411.field1988 = 0;
                            field341 = field411.method2440();
                            var2 -= 2;
                        }
                        if (var2 < field341) {
                            var1 = false;
                            break label2602;
                        }
                        field411.field1988 = 0;
                        Statics.field213.method2825(field411.field1986, 0, field341);
                        field343 = 0;
                        field347 = field346;
                        field346 = field345;
                        field345 = field342;
                        if (field342 == 215) {
                            class122 var3 = field411;
                            int var4 = field341;
                            class210 var5 = new class210();
                            var5.field3119 = var3.method2388();
                            var5.field3112 = var3.method2393();
                            var5.field3118 = new int[var5.field3119];
                            var5.field3113 = new int[var5.field3119];
                            var5.field3114 = new Field[var5.field3119];
                            var5.field3115 = new int[var5.field3119];
                            var5.field3116 = new Method[var5.field3119];
                            var5.field3117 = new byte[var5.field3119][][];
                            for (int var6 = 0; var6 < var5.field3119; var6++) {
                                try {
                                    int var7 = var3.method2388();
                                    if (var7 == 0 || var7 == 1 || var7 == 2) {
                                        String var8 = var3.method2396();
                                        String var9 = var3.method2396();
                                        int var10 = 0;
                                        if (var7 == 1) {
                                            var10 = var3.method2393();
                                        }
                                        var5.field3118[var6] = var7;
                                        var5.field3115[var6] = var10;
                                        if (Statics.method2302(var8).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var5.field3114[var6] = Statics.method2302(var8).getDeclaredField(var9);
                                    } else if (var7 == 3 || var7 == 4) {
                                        String var11 = var3.method2396();
                                        String var12 = var3.method2396();
                                        int var13 = var3.method2388();
                                        String[] var14 = new String[var13];
                                        for (int var15 = 0; var15 < var13; var15++) {
                                            var14[var15] = var3.method2396();
                                        }
                                        String var16 = var3.method2396();
                                        byte[][] var17 = new byte[var13][];
                                        if (var7 == 3) {
                                            for (int var18 = 0; var18 < var13; var18++) {
                                                int var19 = var3.method2393();
                                                var17[var18] = new byte[var19];
                                                var3.method2399(var17[var18], 0, var19);
                                            }
                                        }
                                        var5.field3118[var6] = var7;
                                        Class[] var20 = new Class[var13];
                                        for (int var21 = 0; var21 < var13; var21++) {
                                            var20[var21] = Statics.method2302(var14[var21]);
                                        }
                                        Class var22 = Statics.method2302(var16);
                                        if (Statics.method2302(var11).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var23 = Statics.method2302(var11).getDeclaredMethods();
                                        Method[] var24 = var23;
                                        for (int var25 = 0; var25 < var24.length; var25++) {
                                            Method var26 = var24[var25];
                                            if (var26.getName().equals(var12)) {
                                                Class[] var27 = var26.getParameterTypes();
                                                if (var20.length == var27.length) {
                                                    boolean var28 = true;
                                                    for (int var29 = 0; var29 < var20.length; var29++) {
                                                        if (var20[var29] != var27[var29]) {
                                                            var28 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var28 && var22 == var26.getReturnType()) {
                                                        var5.field3116[var6] = var26;
                                                    }
                                                }
                                            }
                                        }
                                        var5.field3117[var6] = var17;
                                    }
                                } catch (ClassNotFoundException var409) {
                                    var5.field3113[var6] = -1;
                                } catch (SecurityException var410) {
                                    var5.field3113[var6] = -2;
                                } catch (NullPointerException var411) {
                                    var5.field3113[var6] = -3;
                                } catch (Exception var412) {
                                    var5.field3113[var6] = -4;
                                } catch (Throwable var413) {
                                    var5.field3113[var6] = -5;
                                }
                            }
                            class211.field3120.method3575(var5);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 36) {
                            field540 = true;
                            Statics.field899 = field411.method2388();
                            Statics.field566 = field411.method2388();
                            Statics.field1037 = field411.method2440();
                            Statics.field232 = field411.method2388();
                            Statics.field776 = field411.method2388();
                            if (Statics.field776 >= 100) {
                                Statics.field2161 = Statics.field899 * 128 + 64;
                                Statics.field2286 = Statics.field566 * 128 + 64;
                                Statics.field989 = method881(Statics.field2161, Statics.field2286, Statics.field124) - Statics.field1037;
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 81) {
                            class33.method2945(field411, field341);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 70) {
                            int var35 = field411.method2390();
                            if (var35 == 65535) {
                                var35 = -1;
                            }
                            int var36 = field411.method2393();
                            int var37 = field411.method2432();
                            class173 var38 = class173.method793(var37);
                            if (var38.field2779) {
                                var38.field2860 = var35;
                                var38.field2861 = var36;
                                class52 var40 = class52.method646(var35);
                                var38.field2769 = var40.field1106;
                                var38.field2792 = var40.field1134;
                                var38.field2793 = var40.field1108;
                                var38.field2830 = var40.field1131;
                                var38.field2790 = var40.field1110;
                                var38.field2794 = var40.field1105;
                                if (var40.field1111 == 1) {
                                    var38.field2798 = 1;
                                } else {
                                    var38.field2798 = 2;
                                }
                                if (var38.field2795 > 0) {
                                    var38.field2794 = var38.field2794 * 32 / var38.field2795;
                                } else if (var38.field2753 > 0) {
                                    var38.field2794 = var38.field2794 * 32 / var38.field2753;
                                }
                                method13(var38);
                            } else {
                                if (var35 == -1) {
                                    var38.field2783 = 0;
                                    field342 = -1;
                                    var1 = true;
                                    break label2602;
                                }
                                class52 var39 = class52.method646(var35);
                                var38.field2783 = 4;
                                var38.field2786 = var35;
                                var38.field2769 = var39.field1106;
                                var38.field2792 = var39.field1134;
                                var38.field2794 = var39.field1105 * 100 / var36;
                                method13(var38);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 177) {
                            field507 = field477;
                            if (field341 == 0) {
                                field519 = null;
                                field520 = null;
                                Statics.field1944 = 0;
                                Statics.field2189 = null;
                                field342 = -1;
                                var1 = true;
                            } else {
                                field520 = field411.method2396();
                                long var41 = field411.method2394();
                                long var43 = var41;
                                String var45;
                                if (var41 <= 0L || var41 >= 6582952005840035281L) {
                                    var45 = null;
                                } else if (var41 % 37L == 0L) {
                                    var45 = null;
                                } else {
                                    int var46 = 0;
                                    for (long var47 = var41; var47 != 0L; var47 /= 37L) {
                                        var46++;
                                    }
                                    StringBuilder var49 = new StringBuilder(var46);
                                    while (var43 != 0L) {
                                        long var50 = var43;
                                        var43 /= 37L;
                                        var49.append(class162.field2632[(int) (var50 - var43 * 37L)]);
                                    }
                                    var45 = var49.reverse().toString();
                                }
                                field519 = var45;
                                Statics.field1593 = field411.method2389();
                                int var52 = field411.method2388();
                                if (var52 == 255) {
                                    field342 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1944 = var52;
                                    class25[] var53 = new class25[100];
                                    for (int var54 = 0; var54 < Statics.field1944; var54++) {
                                        var53[var54] = new class25();
                                        var53[var54].field630 = field411.method2396();
                                        var53[var54].field629 = class164.method2070(var53[var54].field630, Statics.field489);
                                        var53[var54].field632 = field411.method2440();
                                        var53[var54].field628 = field411.method2389();
                                        field411.method2396();
                                        if (var53[var54].field630.equals(Statics.field143.field48)) {
                                            Statics.field3198 = var53[var54].field628;
                                        }
                                    }
                                    boolean var55 = false;
                                    int var56 = Statics.field1944;
                                    while (var56 > 0) {
                                        boolean var57 = true;
                                        var56--;
                                        for (int var58 = 0; var58 < var56; var58++) {
                                            if (var53[var58].field629.compareTo(var53[var58 + 1].field629) > 0) {
                                                class25 var59 = var53[var58];
                                                var53[var58] = var53[var58 + 1];
                                                var53[var58 + 1] = var59;
                                                var57 = false;
                                            }
                                        }
                                        if (var57) {
                                            break;
                                        }
                                    }
                                    Statics.field2189 = var53;
                                    field342 = -1;
                                    var1 = true;
                                }
                            }
                            break label2602;
                        }
                        if (field342 == 119) {
                            Statics.field1784 = field411.method2415();
                            Statics.field282 = field411.method2550();
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 184) {
                            int var60 = field411.method2393();
                            int var61 = field411.method2440();
                            if (var60 < -70000) {
                                var61 += 32768;
                            }
                            class173 var62;
                            if (var60 >= 0) {
                                var62 = class173.method793(var60);
                            } else {
                                var62 = null;
                            }
                            if (var62 != null) {
                                for (int var63 = 0; var63 < var62.field2765.length; var63++) {
                                    var62.field2765[var63] = 0;
                                    var62.field2755[var63] = 0;
                                }
                            }
                            class16.method1962(var61);
                            int var64 = field411.method2440();
                            for (int var65 = 0; var65 < var64; var65++) {
                                int var66 = field411.method2388();
                                if (var66 == 255) {
                                    var66 = field411.method2500();
                                }
                                int var67 = field411.method2424();
                                if (var62 != null && var65 < var62.field2765.length) {
                                    var62.field2765[var65] = var67;
                                    var62.field2755[var65] = var66;
                                }
                                class16.method945(var61, var65, var67 - 1, var66);
                            }
                            if (var62 != null) {
                                method13(var62);
                            }
                            method992();
                            field480[++field481 - 1 & 0x1F] = var61 & 0x7FFF;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 137) {
                            int var68 = field411.method2500();
                            int var69 = field411.method2393();
                            class4 var70 = (class4) field453.method3509((long) var69);
                            class4 var71 = (class4) field453.method3509((long) var68);
                            if (var71 != null) {
                                method1214(var71, var70 == null || var70.field64 != var71.field64);
                            }
                            if (var70 != null) {
                                var70.method3620();
                                field453.method3518(var70, (long) var68);
                            }
                            class173 var72 = class173.method793(var69);
                            if (var72 != null) {
                                method13(var72);
                            }
                            class173 var73 = class173.method793(var68);
                            if (var73 != null) {
                                method13(var73);
                                method186(Statics.field2868[var73.field2742 >>> 16], var73, true);
                            }
                            if (field452 != -1) {
                                method2329(field452, 1);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 1) {
                            method982(true);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 129) {
                            int var74 = field411.method2440();
                            int var75 = field411.method2388();
                            int var76 = field411.method2440();
                            if (field532 != 0 && var75 != 0 && field534 < 50) {
                                field535[field534] = var74;
                                field536[field534] = var75;
                                field312[field534] = var76;
                                field322[field534] = null;
                                field538[field534] = 0;
                                field534++;
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 141) {
                            method884();
                            field342 = -1;
                            var1 = false;
                            break label2602;
                        }
                        if (field342 == 185) {
                            class26 var80 = new class26();
                            var80.field657 = field411.method2396();
                            var80.field646 = field411.method2440();
                            int var81 = field411.method2393();
                            var80.field642 = var81;
                            method2162(45);
                            Statics.field213.method2823();
                            Statics.field213 = null;
                            class32.method580(var80);
                            field342 = -1;
                            var1 = false;
                            break label2602;
                        }
                        if (field342 == 205) {
                            int var82 = field411.method2440();
                            int var83 = field411.method2390();
                            int var84 = field411.method2424();
                            int var85 = field411.method2504();
                            class173 var86 = class173.method793(var85);
                            if (var86.field2769 != var82 || var86.field2792 != var84 || var86.field2794 != var83) {
                                var86.field2769 = var82;
                                var86.field2792 = var84;
                                var86.field2794 = var83;
                                method13(var86);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 22) {
                            int var87 = field411.method2425();
                            int var88 = field411.method2504();
                            class173 var89 = class173.method793(var88);
                            if (var89.field2783 != 1 || var89.field2786 != var87) {
                                var89.field2783 = 1;
                                var89.field2786 = var87;
                                method13(var89);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 110) {
                            field510 = field411.method2388();
                            field444 = field411.method2388();
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 23) {
                            boolean var90 = field411.method2513() == 1;
                            int var91 = field411.method2504();
                            class173 var92 = class173.method793(var91);
                            if (var92.field2762 != var90) {
                                var92.field2762 = var90;
                                method13(var92);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 168) {
                            field411.field1988 += 28;
                            if (field411.method2410()) {
                                class122 var93 = field411;
                                int var94 = field411.field1988 - 28;
                                if (class149.field2233 != null) {
                                    try {
                                        class149.field2233.method3836(0L);
                                        class149.field2233.method3841(var93.field1986, var94, 24);
                                    } catch (Exception var406) {
                                    }
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 21) {
                            field540 = true;
                            Statics.field2886 = field411.method2388();
                            Statics.field168 = field411.method2388();
                            Statics.field2207 = field411.method2440();
                            Statics.field240 = field411.method2388();
                            Statics.field3032 = field411.method2388();
                            if (Statics.field3032 >= 100) {
                                int var96 = Statics.field2886 * 128 + 64;
                                int var97 = Statics.field168 * 128 + 64;
                                int var98 = method881(var96, var97, Statics.field124) - Statics.field2207;
                                int var99 = var96 - Statics.field2161;
                                int var100 = var98 - Statics.field989;
                                int var101 = var97 - Statics.field2286;
                                int var102 = (int) Math.sqrt((double) (var99 * var99 + var101 * var101));
                                Statics.field1610 = (int) (Math.atan2((double) var100, (double) var102) * 325.949D) & 0x7FF;
                                Statics.field2924 = (int) (Math.atan2((double) var99, (double) var101) * -325.949D) & 0x7FF;
                                if (Statics.field1610 < 128) {
                                    Statics.field1610 = 128;
                                }
                                if (Statics.field1610 > 383) {
                                    Statics.field1610 = 383;
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 125) {
                            int var103 = field411.method2393();
                            int var104 = field411.method2391();
                            class173 var105 = class173.method793(var103);
                            if (var105.field2788 != var104 || var104 == -1) {
                                var105.field2788 = var104;
                                var105.field2862 = 0;
                                var105.field2863 = 0;
                                method13(var105);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 42) {
                            Statics.method749();
                            for (int var106 = 0; var106 < 2048; var106++) {
                                field415[var106] = null;
                            }
                            class33.method50(field411);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 111) {
                            for (int var107 = 0; var107 < Statics.field1030; var107++) {
                                class53 var108 = class53.method753(var107);
                                if (var108 != null) {
                                    class176.field2888[var107] = 0;
                                    class176.field2889[var107] = 0;
                                }
                            }
                            method992();
                            field479 += 32;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 201) {
                            int var109 = field411.method2388();
                            int var110 = field411.method2388();
                            int var111 = field411.method2388();
                            int var112 = field411.method2388();
                            field542[var109] = true;
                            field543[var109] = var110;
                            field446[var109] = var111;
                            field305[var109] = var112;
                            field558[var109] = 0;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 253) {
                            int var113 = field411.method2500();
                            Statics.field2180 = Statics.field93.method2728(var113);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 25) {
                            boolean var114 = field411.method2388() == 1;
                            if (var114) {
                                Statics.field1353 = class115.method2266() - field411.method2394();
                                Statics.field2642 = new class221(field411, true);
                            } else {
                                Statics.field2642 = null;
                            }
                            field488 = field477;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 52) {
                            int var115 = field411.method2440();
                            field452 = var115;
                            int var116 = field452;
                            int var117 = Statics.field1543;
                            int var118 = Statics.field121;
                            if (class173.method2073(var116)) {
                                method2651(Statics.field2868[var116], -1, var117, var118, false);
                            }
                            method849(var115);
                            class37.method164(field452);
                            for (int var119 = 0; var119 < 100; var119++) {
                                field497[var119] = true;
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 206) {
                            method2944(field411.method2396());
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 34) {
                            int var120 = field411.method2426();
                            int var121 = field411.method2426();
                            int var122 = field411.method2504();
                            class173 var123 = class173.method793(var122);
                            if (var123.field2751 != var121 || var123.field2808 != var120 || var123.field2747 != 0 || var123.field2869 != 0) {
                                var123.field2751 = var121;
                                var123.field2808 = var120;
                                var123.field2747 = 0;
                                var123.field2869 = 0;
                                method13(var123);
                                method228(var123);
                                if (var123.field2744 == 0) {
                                    method186(Statics.field2868[var122 >> 16], var123, false);
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 240) {
                            byte var124 = field411.method2417();
                            int var125 = field411.method2425();
                            class176.field2888[var125] = var124;
                            if (class176.field2889[var125] != var124) {
                                class176.field2889[var125] = var124;
                                method2821(var125);
                            }
                            field478[++field479 - 1 & 0x1F] = var125;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 14) {
                            method992();
                            int var126 = field411.method2432();
                            int var127 = field411.method2550();
                            int var128 = field411.method2415();
                            field339[var128] = var126;
                            field387[var128] = var127;
                            field417[var128] = 1;
                            for (int var129 = 0; var129 < 98; var129++) {
                                if (var126 >= class155.field2284[var129]) {
                                    field417[var128] = var129 + 2;
                                }
                            }
                            field482[++field483 - 1 & 0x1F] = var128;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 196) {
                            while (field411.field1988 < field341) {
                                int var130 = field411.method2388();
                                boolean var131 = (var130 & 0x1) == 1;
                                String var132 = field411.method2396();
                                String var133 = field411.method2396();
                                field411.method2396();
                                for (int var134 = 0; var134 < field564; var134++) {
                                    class8 var135 = field565[var134];
                                    if (var131) {
                                        if (var133.equals(var135.field131)) {
                                            var135.field131 = var132;
                                            var135.field129 = var133;
                                            var132 = null;
                                            break;
                                        }
                                    } else if (var132.equals(var135.field131)) {
                                        var135.field131 = var132;
                                        var135.field129 = var133;
                                        var132 = null;
                                        break;
                                    }
                                }
                                if (var132 != null && field564 < 400) {
                                    class8 var136 = new class8();
                                    field565[field564] = var136;
                                    var136.field131 = var132;
                                    var136.field129 = var133;
                                    field564++;
                                }
                            }
                            field485 = field477;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 5) {
                            int var137 = field411.method2393();
                            int var138 = field411.method2390();
                            class173 var139 = class173.method793(var137);
                            if (var139 != null && var139.field2744 == 0) {
                                if (var138 > var139.field2791 - var139.field2758) {
                                    var138 = var139.field2791 - var139.field2758;
                                }
                                if (var138 < 0) {
                                    var138 = 0;
                                }
                                if (var139.field2764 != var138) {
                                    var139.field2764 = var138;
                                    method13(var139);
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 161) {
                            for (int var140 = 0; var140 < class176.field2889.length; var140++) {
                                if (class176.field2889[var140] != class176.field2888[var140]) {
                                    class176.field2889[var140] = class176.field2888[var140];
                                    method2821(var140);
                                    field478[++field479 - 1 & 0x1F] = var140;
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 252) {
                            field531 = field411.method2425() * 30;
                            field459 = field477;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 150) {
                            int var141 = field411.method2424();
                            if (var141 == 65535) {
                                var141 = -1;
                            }
                            method1968(var141);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 231) {
                            int var142 = field411.method2424();
                            if (var142 == 65535) {
                                var142 = -1;
                            }
                            int var143 = field411.method2560();
                            method794(var142, var143);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 188) {
                            method2934(true);
                            field411.method2623();
                            int var144 = field411.method2440();
                            class33.method2945(field411, var144);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 199) {
                            field540 = false;
                            for (int var145 = 0; var145 < 5; var145++) {
                                field542[var145] = false;
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 60) {
                            int var146 = field411.method2504();
                            class173 var147 = class173.method793(var146);
                            for (int var148 = 0; var148 < var147.field2765.length; var148++) {
                                var147.field2765[var148] = -1;
                                var147.field2765[var148] = 0;
                            }
                            method13(var147);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 160) {
                            int var149 = field411.method2440();
                            int var150 = field411.method2425();
                            int var151 = field411.method2500();
                            class173 var152 = class173.method793(var151);
                            var152.field2796 = (var149 << 16) + var150;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 217) {
                            method2934(false);
                            field411.method2623();
                            int var153 = field411.method2440();
                            class33.method2945(field411, var153);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 51) {
                            field526 = field411.method2388();
                            if (field526 == 255) {
                                field526 = 0;
                            }
                            field353 = field411.method2388();
                            if (field353 == 255) {
                                field353 = 0;
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 24) {
                            String var154 = field411.method2396();
                            Object[] var155 = new Object[var154.length() + 1];
                            for (int var156 = var154.length() - 1; var156 >= 0; var156--) {
                                if (var154.charAt(var156) == 's') {
                                    var155[var156 + 1] = field411.method2396();
                                } else {
                                    var155[var156 + 1] = Integer.valueOf(field411.method2393());
                                }
                            }
                            var155[0] = Integer.valueOf(field411.method2393());
                            class1 var157 = new class1();
                            var157.field13 = var155;
                            class37.method2961(var157);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 118) {
                            int var158 = field411.method2390();
                            class16 var159 = (class16) class16.field225.method3509((long) var158);
                            if (var159 != null) {
                                var159.method3620();
                            }
                            field480[++field481 - 1 & 0x1F] = var158 & 0x7FFF;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 239) {
                            String var160 = field411.method2396();
                            long var161 = (long) field411.method2440();
                            long var163 = (long) field411.method2460();
                            class152 var165 = (class152) class109.method2675(class152.method2691(), field411.method2388());
                            long var166 = (var161 << 32) + var163;
                            boolean var168 = false;
                            for (int var169 = 0; var169 < 100; var169++) {
                                if (field513[var169] == var166) {
                                    var168 = true;
                                    break;
                                }
                            }
                            if (method601(var160)) {
                                var168 = true;
                            }
                            if (!var168 && field468 == 0) {
                                field513[field514] = var166;
                                field514 = (field514 + 1) % 100;
                                class122 var170 = field411;
                                String var171 = class222.method2716(var170, 32767);
                                String var172 = class223.method3734(class163.method1965(var171));
                                byte var173;
                                if (var165.field2254) {
                                    var173 = 7;
                                } else {
                                    var173 = 3;
                                }
                                if (var165.field2255 == -1) {
                                    class12.method755(var173, var160, var172);
                                } else {
                                    class12.method755(var173, class2.method1210(var165.field2255) + var160, var172);
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 251) {
                            int var174 = field411.method2432();
                            int var175 = field411.method2390();
                            int var176 = field411.method2550();
                            class4 var177 = (class4) field453.method3509((long) var174);
                            if (var177 != null) {
                                method1214(var177, var177.field64 != var175);
                            }
                            method113(var174, var175, var176);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 178) {
                            int var178 = field411.method2440();
                            int var179 = field411.method2432();
                            int var180 = var178 >> 10 & 0x1F;
                            int var181 = var178 >> 5 & 0x1F;
                            int var182 = var178 & 0x1F;
                            int var183 = (var182 << 3) + (var180 << 19) + (var181 << 11);
                            class173 var184 = class173.method793(var179);
                            if (var184.field2815 != var183) {
                                var184.field2815 = var183;
                                method13(var184);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 88) {
                            field420 = field411.method2388();
                            if (field420 == 1) {
                                field314 = field411.method2440();
                            }
                            if (field420 >= 2 && field420 <= 6) {
                                if (field420 == 2) {
                                    field319 = 64;
                                    field320 = 64;
                                }
                                if (field420 == 3) {
                                    field319 = 0;
                                    field320 = 64;
                                }
                                if (field420 == 4) {
                                    field319 = 128;
                                    field320 = 64;
                                }
                                if (field420 == 5) {
                                    field319 = 64;
                                    field320 = 0;
                                }
                                if (field420 == 6) {
                                    field319 = 64;
                                    field320 = 128;
                                }
                                field420 = 2;
                                field316 = field411.method2440();
                                field317 = field411.method2440();
                                field511 = field411.method2388();
                            }
                            if (field420 == 10) {
                                field563 = field411.method2440();
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 198) {
                            int var185 = field411.method2393();
                            class4 var186 = (class4) field453.method3509((long) var185);
                            if (var186 != null) {
                                method1214(var186, true);
                            }
                            if (field405 != null) {
                                method13(field405);
                                field405 = null;
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 211) {
                            field487 = field411.method2388();
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 116 || field342 == 228 || field342 == 207 || field342 == 53 || field342 == 103 || field342 == 50 || field342 == 148 || field342 == 26 || field342 == 48 || field342 == 12) {
                            method640();
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 139) {
                            int var187 = field411.method2504();
                            int var188 = field411.method2440();
                            if (var188 == 65535) {
                                var188 = -1;
                            }
                            int var189 = field411.method2424();
                            if (var189 == 65535) {
                                var189 = -1;
                            }
                            int var190 = field411.method2504();
                            for (int var191 = var188; var191 <= var189; var191++) {
                                long var192 = ((long) var190 << 32) + (long) var191;
                                class208 var194 = field494.method3509(var192);
                                if (var194 != null) {
                                    var194.method3620();
                                }
                                field494.method3518(new class201(var187), var192);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 15) {
                            method982(false);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 46) {
                            method992();
                            field458 = field411.method2391();
                            field459 = field477;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 127) {
                            Statics.field282 = field411.method2550();
                            Statics.field1784 = field411.method2513();
                            for (int var195 = Statics.field1784; var195 < Statics.field1784 + 8; var195++) {
                                for (int var196 = Statics.field282; var196 < Statics.field282 + 8; var196++) {
                                    if (field425[Statics.field124][var195][var196] != null) {
                                        field425[Statics.field124][var195][var196] = null;
                                        method563(var195, var196);
                                    }
                                }
                            }
                            for (class17 var197 = (class17) field426.method3544(); var197 != null; var197 = (class17) field426.method3538()) {
                                if (var197.field234 >= Statics.field1784 && var197.field234 < Statics.field1784 + 8 && var197.field235 >= Statics.field282 && var197.field235 < Statics.field282 + 8 && Statics.field124 == var197.field247) {
                                    var197.field245 = 0;
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 108) {
                            int var198 = field411.method2500();
                            String var199 = field411.method2396();
                            class173 var200 = class173.method793(var198);
                            if (!var199.equals(var200.field2841)) {
                                var200.field2841 = var199;
                                method13(var200);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 136) {
                            int var201 = field341 + field411.field1988;
                            int var202 = field411.method2440();
                            int var203 = field411.method2440();
                            if (field452 != var202) {
                                field452 = var202;
                                int var204 = field452;
                                int var205 = Statics.field1543;
                                int var206 = Statics.field121;
                                if (class173.method2073(var204)) {
                                    method2651(Statics.field2868[var204], -1, var205, var206, false);
                                }
                                method849(field452);
                                class37.method164(field452);
                                for (int var207 = 0; var207 < 100; var207++) {
                                    field497[var207] = true;
                                }
                            }
                            while (var203-- > 0) {
                                int var208 = field411.method2393();
                                int var209 = field411.method2440();
                                int var210 = field411.method2388();
                                class4 var211 = (class4) field453.method3509((long) var208);
                                if (var211 != null && var211.field64 != var209) {
                                    method1214(var211, true);
                                    var211 = null;
                                }
                                if (var211 == null) {
                                    var211 = method113(var208, var209, var210);
                                }
                                var211.field65 = true;
                            }
                            for (class4 var212 = (class4) field453.method3512(); var212 != null; var212 = (class4) field453.method3513()) {
                                if (var212.field65) {
                                    var212.field65 = false;
                                } else {
                                    method1214(var212, true);
                                }
                            }
                            field494 = new class196(512);
                            while (field411.field1988 < var201) {
                                int var213 = field411.method2393();
                                int var214 = field411.method2440();
                                int var215 = field411.method2440();
                                int var216 = field411.method2393();
                                for (int var217 = var214; var217 <= var215; var217++) {
                                    long var218 = ((long) var213 << 32) + (long) var217;
                                    field494.method3518(new class201(var216), var218);
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 174) {
                            String var220 = field411.method2396();
                            int var221 = field411.method2440();
                            byte var222 = field411.method2389();
                            boolean var223 = false;
                            if (var222 == -128) {
                                var223 = true;
                            }
                            if (var223) {
                                if (Statics.field1944 == 0) {
                                    field342 = -1;
                                    var1 = true;
                                    break label2602;
                                }
                                boolean var224 = false;
                                int var225;
                                for (var225 = 0; var225 < Statics.field1944 && (!Statics.field2189[var225].field630.equals(var220) || Statics.field2189[var225].field632 != var221); var225++) {
                                }
                                if (var225 < Statics.field1944) {
                                    while (var225 < Statics.field1944 - 1) {
                                        Statics.field2189[var225] = Statics.field2189[var225 + 1];
                                        var225++;
                                    }
                                    Statics.field1944--;
                                    Statics.field2189[Statics.field1944] = null;
                                }
                            } else {
                                field411.method2396();
                                class25 var226 = new class25();
                                var226.field630 = var220;
                                var226.field629 = class164.method2070(var226.field630, Statics.field489);
                                var226.field632 = var221;
                                var226.field628 = var222;
                                int var227;
                                for (var227 = Statics.field1944 - 1; var227 >= 0; var227--) {
                                    int var228 = Statics.field2189[var227].field629.compareTo(var226.field629);
                                    if (var228 == 0) {
                                        Statics.field2189[var227].field632 = var221;
                                        Statics.field2189[var227].field628 = var222;
                                        if (var220.equals(Statics.field143.field48)) {
                                            Statics.field3198 = var222;
                                        }
                                        field507 = field477;
                                        field342 = -1;
                                        var1 = true;
                                        break label2602;
                                    }
                                    if (var228 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1944 >= Statics.field2189.length) {
                                    field342 = -1;
                                    var1 = true;
                                    break label2602;
                                }
                                for (int var229 = Statics.field1944 - 1; var229 > var227; var229--) {
                                    Statics.field2189[var229 + 1] = Statics.field2189[var229];
                                }
                                if (Statics.field1944 == 0) {
                                    Statics.field2189 = new class25[100];
                                }
                                Statics.field2189[var227 + 1] = var226;
                                Statics.field1944++;
                                if (var220.equals(Statics.field143.field48)) {
                                    Statics.field3198 = var222;
                                }
                            }
                            field507 = field477;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 92) {
                            int var230 = field411.method2388();
                            int var231 = field411.method2550();
                            String var232 = field411.method2396();
                            if (var231 >= 1 && var231 <= 8) {
                                if (var232.equalsIgnoreCase("null")) {
                                    var232 = null;
                                }
                                field354[var231 - 1] = var232;
                                field422[var231 - 1] = var230 == 0;
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 112) {
                            String var233 = field411.method2396();
                            class122 var234 = field411;
                            String var235 = class222.method2716(var234, 32767);
                            String var236 = class223.method3734(class163.method1965(var235));
                            class12.method755(6, var233, var236);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 64) {
                            while (field411.field1988 < field341) {
                                boolean var237 = field411.method2388() == 1;
                                String var238 = field411.method2396();
                                String var239 = field411.method2396();
                                int var240 = field411.method2440();
                                int var241 = field411.method2388();
                                int var242 = field411.method2388();
                                boolean var243 = (var242 & 0x2) != 0;
                                boolean var244 = (var242 & 0x1) != 0;
                                if (var240 > 0) {
                                    field411.method2396();
                                    field411.method2388();
                                    field411.method2393();
                                }
                                field411.method2396();
                                for (int var245 = 0; var245 < field560; var245++) {
                                    class18 var246 = field562[var245];
                                    if (var237) {
                                        if (var239.equals(var246.field249)) {
                                            var246.field249 = var238;
                                            var246.field261 = var239;
                                            var238 = null;
                                            break;
                                        }
                                    } else if (var238.equals(var246.field249)) {
                                        if (var246.field250 != var240) {
                                            boolean var247 = true;
                                            for (class39 var248 = (class39) field298.method3499(); var248 != null; var248 = (class39) field298.method3500()) {
                                                if (var248.field877.equals(var238)) {
                                                    if (var240 != 0 && var248.field874 == 0) {
                                                        var248.method3617();
                                                        var247 = false;
                                                    } else if (var240 == 0 && var248.field874 != 0) {
                                                        var248.method3617();
                                                        var247 = false;
                                                    }
                                                }
                                            }
                                            if (var247) {
                                                field298.method3498(new class39(var238, var240));
                                            }
                                            var246.field250 = var240;
                                        }
                                        var246.field261 = var239;
                                        var246.field251 = var241;
                                        var246.field252 = var243;
                                        var246.field253 = var244;
                                        var238 = null;
                                        break;
                                    }
                                }
                                if (var238 != null && field560 < 400) {
                                    class18 var249 = new class18();
                                    field562[field560] = var249;
                                    var249.field249 = var238;
                                    var249.field261 = var239;
                                    var249.field250 = var240;
                                    var249.field251 = var241;
                                    var249.field252 = var243;
                                    var249.field253 = var244;
                                    field560++;
                                }
                            }
                            field561 = 2;
                            field485 = field477;
                            boolean var250 = false;
                            int var251 = field560;
                            while (var251 > 0) {
                                boolean var252 = true;
                                var251--;
                                for (int var253 = 0; var253 < var251; var253++) {
                                    boolean var254 = false;
                                    class18 var255 = field562[var253];
                                    class18 var256 = field562[var253 + 1];
                                    if (field544 != var255.field250 && field544 == var256.field250) {
                                        var254 = true;
                                    }
                                    if (!var254 && var255.field250 == 0 && var256.field250 != 0) {
                                        var254 = true;
                                    }
                                    if (!var254 && !var255.field252 && var256.field252) {
                                        var254 = true;
                                    }
                                    if (!var254 && !var255.field253 && var256.field253) {
                                        var254 = true;
                                    }
                                    if (var254) {
                                        class18 var257 = field562[var253];
                                        field562[var253] = field562[var253 + 1];
                                        field562[var253 + 1] = var257;
                                        var252 = false;
                                    }
                                }
                                if (var252) {
                                    break;
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 210) {
                            for (int var258 = 0; var258 < field415.length; var258++) {
                                if (field415[var258] != null) {
                                    field415[var258].field842 = -1;
                                }
                            }
                            for (int var259 = 0; var259 < field438.length; var259++) {
                                if (field438[var259] != null) {
                                    field438[var259].field842 = -1;
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 183) {
                            int var260 = field411.method2452();
                            boolean var261 = field411.method2388() == 1;
                            String var262 = "";
                            boolean var263 = false;
                            if (var261) {
                                var262 = field411.method2396();
                                if (method601(var262)) {
                                    var263 = true;
                                }
                            }
                            String var264 = field411.method2396();
                            if (!var263) {
                                class12.method755(var260, var262, var264);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 72) {
                            field561 = 1;
                            field485 = field477;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 29) {
                            if (field452 != -1) {
                                method2329(field452, 0);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 13) {
                            method992();
                            field517 = field411.method2388();
                            field459 = field477;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 33) {
                            Statics.field616 = class130.method1009(field411.method2388());
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 75) {
                            int var265 = field411.method2393();
                            int var266 = field411.method2393();
                            if (Statics.field1142 == null || !Statics.field1142.isValid()) {
                                try {
                                    Iterator var267 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var267.hasNext()) {
                                        GarbageCollectorMXBean var268 = (GarbageCollectorMXBean) var267.next();
                                        if (var268.isValid()) {
                                            Statics.field1142 = var268;
                                            field571 = -1L;
                                            field473 = -1L;
                                        }
                                    }
                                } catch (Throwable var408) {
                                }
                            }
                            long var270 = class115.method2266();
                            int var272 = -1;
                            if (Statics.field1142 != null) {
                                long var273 = Statics.field1142.getCollectionTime();
                                if (field473 != -1L) {
                                    long var275 = var273 - field473;
                                    long var277 = var270 - field571;
                                    if (var277 != 0L) {
                                        var272 = (int) (var275 * 100L / var277);
                                    }
                                }
                                field473 = var273;
                                field571 = var270;
                            }
                            field338.method2622(41);
                            field338.method2380(var265);
                            field338.method2430(var266);
                            field338.method2451(field2198);
                            field338.method2413(var272);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 173) {
                            int var279 = field411.method2504();
                            class173 var280 = class173.method793(var279);
                            var280.field2783 = 3;
                            var280.field2786 = Statics.field143.field34.method3248();
                            method13(var280);
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 27) {
                            int var281 = field411.method2425();
                            int var282 = field411.method2432();
                            class173 var283 = class173.method793(var282);
                            if (var283.field2783 != 2 || var283.field2786 != var281) {
                                var283.field2783 = 2;
                                var283.field2786 = var281;
                                method13(var283);
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 247) {
                            int var284 = field411.method2432();
                            int var285 = field411.method2425();
                            class176.field2888[var285] = var284;
                            if (class176.field2889[var285] != var284) {
                                class176.field2889[var285] = var284;
                                method2821(var285);
                            }
                            field478[++field479 - 1 & 0x1F] = var285;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 134) {
                            String var286 = field411.method2396();
                            long var287 = field411.method2394();
                            long var289 = (long) field411.method2440();
                            long var291 = (long) field411.method2460();
                            class152 var293 = (class152) class109.method2675(class152.method2691(), field411.method2388());
                            long var294 = (var289 << 32) + var291;
                            boolean var296 = false;
                            for (int var297 = 0; var297 < 100; var297++) {
                                if (field513[var297] == var294) {
                                    var296 = true;
                                    break;
                                }
                            }
                            if (var293.field2257 && method601(var286)) {
                                var296 = true;
                            }
                            if (!var296 && field468 == 0) {
                                field513[field514] = var294;
                                field514 = (field514 + 1) % 100;
                                String var298 = class223.method3734(class163.method1965(class222.method224(field411)));
                                if (var293.field2255 == -1) {
                                    class12.method583(9, var286, var298, class162.method2619(var287));
                                } else {
                                    class12.method583(9, class2.method1210(var293.field2255) + var286, var298, class162.method2619(var287));
                                }
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 202) {
                            Statics.field1784 = field411.method2550();
                            Statics.field282 = field411.method2550();
                            while (field411.field1988 < field341) {
                                field342 = field411.method2388();
                                method640();
                            }
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 43) {
                            int var299 = field411.method2388();
                            if (field411.method2388() == 0) {
                                field569[var299] = new class220();
                                field411.field1988 += 18;
                            } else {
                                field411.field1988--;
                                field569[var299] = new class220(field411, false);
                            }
                            field499 = field477;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        if (field342 == 49) {
                            int var300 = field411.method2393();
                            int var301 = field411.method2440();
                            if (var300 < -70000) {
                                var301 += 32768;
                            }
                            class173 var302;
                            if (var300 >= 0) {
                                var302 = class173.method793(var300);
                            } else {
                                var302 = null;
                            }
                            while (field411.field1988 < field341) {
                                int var303 = field411.method2452();
                                int var304 = field411.method2440();
                                int var305 = 0;
                                if (var304 != 0) {
                                    var305 = field411.method2388();
                                    if (var305 == 255) {
                                        var305 = field411.method2393();
                                    }
                                }
                                if (var302 != null && var303 >= 0 && var303 < var302.field2765.length) {
                                    var302.field2765[var303] = var304;
                                    var302.field2755[var303] = var305;
                                }
                                class16.method945(var301, var303, var304 - 1, var305);
                            }
                            if (var302 != null) {
                                method13(var302);
                            }
                            method992();
                            field480[++field481 - 1 & 0x1F] = var301 & 0x7FFF;
                            field342 = -1;
                            var1 = true;
                            break label2602;
                        }
                        class148.method2819("" + field342 + class2.field15 + field346 + class2.field15 + field347 + class2.field15 + field341, (Throwable) null);
                        method884();
                    } catch (IOException var414) {
                        method659();
                    } catch (Exception var415) {
                        String var308 = "" + field342 + class2.field15 + field346 + class2.field15 + field347 + class2.field15 + field341 + class2.field15 + (Statics.field233 + Statics.field143.field865[0]) + class2.field15 + (Statics.field647 + Statics.field143.field866[0]) + class2.field15;
                        for (int var309 = 0; var309 < field341 && var309 < 50; var309++) {
                            var308 = var308 + field411.field1986[var309] + class2.field15;
                        }
                        class148.method2819(var308, var415);
                        method884();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field303 != 30) {
            return;
        }
        while (class211.method3631()) {
            field338.method2622(95);
            field338.method2503(0);
            int var310 = field338.field1988;
            class211.method1969(field338);
            field338.method2385(field338.field1988 - var310);
        }
        Object var311 = Statics.field1870.field207;
        synchronized (Statics.field1870.field207) {
            if (!field294) {
                Statics.field1870.field209 = 0;
            } else if (class140.field2162 != 0 || Statics.field1870.field209 >= 40) {
                field338.method2622(232);
                field338.method2503(0);
                int var312 = field338.field1988;
                int var313 = 0;
                for (int var314 = 0; var314 < Statics.field1870.field209 && field338.field1988 - var312 < 240; var314++) {
                    var313++;
                    int var315 = Statics.field1870.field201[var314];
                    if (var315 < 0) {
                        var315 = 0;
                    } else if (var315 > 502) {
                        var315 = 502;
                    }
                    int var316 = Statics.field1870.field200[var314];
                    if (var316 < 0) {
                        var316 = 0;
                    } else if (var316 > 764) {
                        var316 = 764;
                    }
                    int var317 = var315 * 765 + var316;
                    if (Statics.field1870.field201[var314] == -1 && Statics.field1870.field200[var314] == -1) {
                        var316 = -1;
                        var315 = -1;
                        var317 = 524287;
                    }
                    if (field574 != var316 || field308 != var315) {
                        int var318 = var316 - field574;
                        field574 = var316;
                        int var319 = var315 - field308;
                        field308 = var315;
                        if (field309 < 8 && var318 >= -32 && var318 <= 31 && var319 >= -32 && var319 <= 31) {
                            var318 += 32;
                            var319 += 32;
                            field338.method2374((field309 << 12) + (var318 << 6) + var319);
                            field309 = 0;
                        } else if (field309 < 8) {
                            field338.method2507((field309 << 19) + 8388608 + var317);
                            field309 = 0;
                        } else {
                            field338.method2376((field309 << 19) + -1073741824 + var317);
                            field309 = 0;
                        }
                    } else if (field309 < 2047) {
                        field309++;
                    }
                }
                field338.method2385(field338.field1988 - var312);
                if (var313 >= Statics.field1870.field209) {
                    Statics.field1870.field209 = 0;
                } else {
                    Statics.field1870.field209 -= var313;
                    for (int var320 = 0; var320 < Statics.field1870.field209; var320++) {
                        Statics.field1870.field200[var320] = Statics.field1870.field200[var313 + var320];
                        Statics.field1870.field201[var320] = Statics.field1870.field201[var313 + var320];
                    }
                }
            }
        }
        if (class140.field2162 == 1 || !Statics.field592 && class140.field2162 == 4 || class140.field2162 == 2) {
            long var322 = (class140.field2154 - field366 * -1L) / 50L;
            if (var322 > 4095L) {
                var322 = 4095L;
            }
            field366 = class140.field2154 * -1L;
            int var324 = class140.field2159;
            if (var324 < 0) {
                var324 = 0;
            } else if (var324 > Statics.field121) {
                var324 = Statics.field121;
            }
            int var325 = class140.field2163;
            if (var325 < 0) {
                var325 = 0;
            } else if (var325 > Statics.field1543) {
                var325 = Statics.field1543;
            }
            int var326 = (int) var322;
            field338.method2622(75);
            field338.method2374((class140.field2162 == 2 ? 1 : 0) + (var326 << 1));
            field338.method2374(var325);
            field338.method2374(var324);
        }
        if (class137.field2118 > 0) {
            field338.method2622(179);
            field338.method2374(0);
            int var327 = field338.field1988;
            long var328 = class115.method2266();
            for (int var330 = 0; var330 < class137.field2118; var330++) {
                long var331 = var328 - field518;
                if (var331 > 16777215L) {
                    var331 = 16777215L;
                }
                field518 = var328;
                field338.method2451(class137.field2123[var330]);
                field338.method2507((int) var331);
            }
            field338.method2384(field338.field1988 - var327);
        }
        if (field349 > 0) {
            field349--;
        }
        if (class137.field2117[96] || class137.field2117[97] || class137.field2117[98] || class137.field2117[99]) {
            field386 = true;
        }
        if (field386 && field349 <= 0) {
            field349 = 20;
            field386 = false;
            field338.method2622(74);
            field338.method2374(field378);
            field338.method2374(field442);
        }
        if (Statics.field1874 && !field310) {
            field310 = true;
            field338.method2622(142);
            field338.method2503(1);
        }
        if (!Statics.field1874 && field310) {
            field310 = false;
            field338.method2622(142);
            field338.method2503(0);
        }
        method2072();
        if (field303 != 30) {
            return;
        }
        method124();
        method188();
        field343++;
        if (field343 > 750) {
            method659();
            return;
        }
        int var333 = class33.field755;
        int[] var334 = class33.field754;
        for (int var335 = 0; var335 < var333; var335++) {
            class3 var336 = field415[var334[var335]];
            if (var336 != null) {
                method692(var336, 1);
            }
        }
        method713();
        int[] var337 = class33.field754;
        for (int var338 = 0; var338 < class33.field755; var338++) {
            class3 var339 = field415[var337[var338]];
            if (var339 != null && var339.field822 > 0) {
                var339.field822--;
                if (var339.field822 == 0) {
                    var339.field811 = null;
                }
            }
        }
        for (int var340 = 0; var340 < field334; var340++) {
            int var341 = field335[var340];
            class35 var342 = field438[var341];
            if (var342 != null && var342.field822 > 0) {
                var342.field822--;
                if (var342.field822 == 0) {
                    var342.field811 = null;
                }
            }
        }
        field371++;
        if (field515 != 0) {
            field315 += 20;
            if (field315 >= 400) {
                field515 = 0;
            }
        }
        if (Statics.field228 != null) {
            field406++;
            if (field406 >= 15) {
                method13(Statics.field228);
                Statics.field228 = null;
            }
        }
        class173 var343 = Statics.field218;
        class173 var344 = Statics.field2245;
        Statics.field218 = null;
        Statics.field2245 = null;
        field469 = null;
        field429 = false;
        field470 = false;
        field537 = 0;
        while (class137.method654() && field537 < 128) {
            if (field368 >= 2 && class137.field2117[82] && Statics.field2037 == 66) {
                String var345 = "";
                Iterator var346 = class12.field174.iterator();
                while (var346.hasNext()) {
                    class36 var347 = (class36) var346.next();
                    var345 = var345 + var347.field791 + ':' + var347.field790 + '\n';
                }
                Statics.field1943.setContents(new StringSelection(var345), (ClipboardOwner) null);
            } else {
                field296[field537] = Statics.field2037;
                field516[field537] = Statics.field1742;
                field537++;
            }
        }
        if (field452 != -1) {
            method1066(field452, 0, 0, Statics.field1543, Statics.field121, 0, 0);
        }
        field477++;
        while (true) {
            class1 var350;
            class173 var351;
            class173 var352;
            do {
                var350 = (class1) field545.method3542();
                if (var350 == null) {
                    while (true) {
                        class1 var353;
                        class173 var354;
                        class173 var355;
                        do {
                            var353 = (class1) field556.method3542();
                            if (var353 == null) {
                                while (true) {
                                    class1 var356;
                                    class173 var357;
                                    class173 var358;
                                    do {
                                        var356 = (class1) field491.method3542();
                                        if (var356 == null) {
                                            method26();
                                            if (field465 != null) {
                                                method13(field465);
                                                Statics.field3061++;
                                                if (field429 && field470) {
                                                    int var359 = class140.field2151;
                                                    int var360 = class140.field2152;
                                                    int var361 = var359 - field467;
                                                    int var362 = var360 - field355;
                                                    if (var361 < field471) {
                                                        var361 = field471;
                                                    }
                                                    if (field465.field2831 + var361 > field471 + field466.field2831) {
                                                        var361 = field471 + field466.field2831 - field465.field2831;
                                                    }
                                                    if (var362 < field472) {
                                                        var362 = field472;
                                                    }
                                                    if (field465.field2758 + var362 > field472 + field466.field2758) {
                                                        var362 = field472 + field466.field2758 - field465.field2758;
                                                    }
                                                    int var363 = var361 - field474;
                                                    int var364 = var362 - field457;
                                                    int var365 = field465.field2773;
                                                    if (Statics.field3061 > field465.field2800 && (var363 > var365 || var363 < -var365 || var364 > var365 || var364 < -var365)) {
                                                        field476 = true;
                                                    }
                                                    int var366 = field466.field2763 + (var361 - field471);
                                                    int var367 = field466.field2764 + (var362 - field472);
                                                    if (field465.field2829 != null && field476) {
                                                        class1 var368 = new class1();
                                                        var368.field7 = field465;
                                                        var368.field4 = var366;
                                                        var368.field5 = var367;
                                                        var368.field13 = field465.field2829;
                                                        class37.method2961(var368);
                                                    }
                                                    if (class140.field2150 == 0) {
                                                        if (field476) {
                                                            if (field465.field2820 != null) {
                                                                class1 var369 = new class1();
                                                                var369.field7 = field465;
                                                                var369.field4 = var366;
                                                                var369.field5 = var367;
                                                                var369.field1 = field469;
                                                                var369.field13 = field465.field2820;
                                                                class37.method2961(var369);
                                                            }
                                                            if (field469 != null) {
                                                                class173 var370 = field465;
                                                                int var371 = method46(var370);
                                                                int var372 = var371 >> 17 & 0x7;
                                                                int var373 = var372;
                                                                class173 var374;
                                                                if (var372 == 0) {
                                                                    var374 = null;
                                                                } else {
                                                                    int var375 = 0;
                                                                    while (true) {
                                                                        if (var375 >= var373) {
                                                                            var374 = var370;
                                                                            break;
                                                                        }
                                                                        var370 = class173.method793(var370.field2754);
                                                                        if (var370 == null) {
                                                                            var374 = null;
                                                                            break;
                                                                        }
                                                                        var375++;
                                                                    }
                                                                }
                                                                if (var374 != null) {
                                                                    field338.method2622(122);
                                                                    field338.method2431(field465.field2817);
                                                                    field338.method2431(field469.field2817);
                                                                    field338.method2380(field465.field2742);
                                                                    field338.method2429(field469.field2742);
                                                                    field338.method2374(field469.field2860);
                                                                    field338.method2431(field465.field2860);
                                                                }
                                                            }
                                                        } else if ((field432 == 1 || method2973(field434 - 1)) && field434 > 2) {
                                                            method2309(field474 + field467, field457 + field355);
                                                        } else if (field434 > 0) {
                                                            method1783(field474 + field467, field457 + field355);
                                                        }
                                                        field465 = null;
                                                    }
                                                } else if (Statics.field3061 > 1) {
                                                    field465 = null;
                                                }
                                            }
                                            if (Statics.field1955 != null) {
                                                method13(Statics.field1955);
                                                field413++;
                                                if (class140.field2150 == 0) {
                                                    if (field299) {
                                                        if (Statics.field766 == Statics.field1955 && field557 != field412) {
                                                            class173 var376 = Statics.field1955;
                                                            byte var377 = 0;
                                                            if (field455 == 1 && var376.field2746 == 206) {
                                                                var377 = 1;
                                                            }
                                                            if (var376.field2765[field412] <= 0) {
                                                                var377 = 0;
                                                            }
                                                            if (class178.method643(method46(var376))) {
                                                                int var378 = field557;
                                                                int var379 = field412;
                                                                var376.field2765[var379] = var376.field2765[var378];
                                                                var376.field2755[var379] = var376.field2755[var378];
                                                                var376.field2765[var378] = -1;
                                                                var376.field2755[var378] = 0;
                                                            } else if (var377 == 1) {
                                                                int var380 = field557;
                                                                int var381 = field412;
                                                                while (var380 != var381) {
                                                                    if (var380 > var381) {
                                                                        var376.method3175(var380 - 1, var380);
                                                                        var380--;
                                                                    } else if (var380 < var381) {
                                                                        var376.method3175(var380 + 1, var380);
                                                                        var380++;
                                                                    }
                                                                }
                                                            } else {
                                                                var376.method3175(field412, field557);
                                                            }
                                                            field338.method2622(207);
                                                            field338.method2374(field557);
                                                            field338.method2413(var377);
                                                            field338.method2380(Statics.field1955.field2742);
                                                            field338.method2422(field412);
                                                        }
                                                    } else if ((field432 == 1 || method2973(field434 - 1)) && field434 > 2) {
                                                        method2309(field541, field318);
                                                    } else if (field434 > 0) {
                                                        method1783(field541, field318);
                                                    }
                                                    field406 = 10;
                                                    class140.field2162 = 0;
                                                    Statics.field1955 = null;
                                                } else if (field413 >= 5 && (class140.field2151 > field541 + 5 || class140.field2151 < field541 - 5 || class140.field2152 > field318 + 5 || class140.field2152 < field318 - 5)) {
                                                    field299 = true;
                                                }
                                            }
                                            if (class86.field1455 != -1) {
                                                int var382 = class86.field1455;
                                                int var383 = class86.field1480;
                                                field338.method2622(215);
                                                field338.method2503(5);
                                                field338.method2413(class137.field2117[82] ? (class137.field2117[81] ? 2 : 1) : 0);
                                                field338.method2374(Statics.field647 + var383);
                                                field338.method2431(Statics.field233 + var382);
                                                class86.field1455 = -1;
                                                field402 = class140.field2163;
                                                field403 = class140.field2159;
                                                field515 = 1;
                                                field315 = 0;
                                                field526 = var382;
                                                field353 = var383;
                                            }
                                            if (Statics.field218 != var343) {
                                                if (var343 != null) {
                                                    method13(var343);
                                                }
                                                if (Statics.field218 != null) {
                                                    method13(Statics.field218);
                                                }
                                            }
                                            if (Statics.field2245 != var344 && field523 == field326) {
                                                if (var344 != null) {
                                                    method13(var344);
                                                }
                                                if (Statics.field2245 != null) {
                                                    method13(Statics.field2245);
                                                }
                                            }
                                            if (Statics.field2245 == null) {
                                                if (field326 > 0) {
                                                    field326--;
                                                }
                                            } else if (field326 < field523) {
                                                field326++;
                                                if (field523 == field326) {
                                                    method13(Statics.field2245);
                                                }
                                            }
                                            method1507();
                                            if (field540) {
                                                int var384 = Statics.field899 * 128 + 64;
                                                int var385 = Statics.field566 * 128 + 64;
                                                int var386 = method881(var384, var385, Statics.field124) - Statics.field1037;
                                                if (Statics.field2161 < var384) {
                                                    Statics.field2161 += Statics.field776 * (var384 - Statics.field2161) / 1000 + Statics.field232;
                                                    if (Statics.field2161 > var384) {
                                                        Statics.field2161 = var384;
                                                    }
                                                }
                                                if (Statics.field2161 > var384) {
                                                    Statics.field2161 -= Statics.field776 * (Statics.field2161 - var384) / 1000 + Statics.field232;
                                                    if (Statics.field2161 < var384) {
                                                        Statics.field2161 = var384;
                                                    }
                                                }
                                                if (Statics.field989 < var386) {
                                                    Statics.field989 += Statics.field776 * (var386 - Statics.field989) / 1000 + Statics.field232;
                                                    if (Statics.field989 > var386) {
                                                        Statics.field989 = var386;
                                                    }
                                                }
                                                if (Statics.field989 > var386) {
                                                    Statics.field989 -= Statics.field776 * (Statics.field989 - var386) / 1000 + Statics.field232;
                                                    if (Statics.field989 < var386) {
                                                        Statics.field989 = var386;
                                                    }
                                                }
                                                if (Statics.field2286 < var385) {
                                                    Statics.field2286 += Statics.field776 * (var385 - Statics.field2286) / 1000 + Statics.field232;
                                                    if (Statics.field2286 > var385) {
                                                        Statics.field2286 = var385;
                                                    }
                                                }
                                                if (Statics.field2286 > var385) {
                                                    Statics.field2286 -= Statics.field776 * (Statics.field2286 - var385) / 1000 + Statics.field232;
                                                    if (Statics.field2286 < var385) {
                                                        Statics.field2286 = var385;
                                                    }
                                                }
                                                int var387 = Statics.field2886 * 128 + 64;
                                                int var388 = Statics.field168 * 128 + 64;
                                                int var389 = method881(var387, var388, Statics.field124) - Statics.field2207;
                                                int var390 = var387 - Statics.field2161;
                                                int var391 = var389 - Statics.field989;
                                                int var392 = var388 - Statics.field2286;
                                                int var393 = (int) Math.sqrt((double) (var390 * var390 + var392 * var392));
                                                int var394 = (int) (Math.atan2((double) var391, (double) var393) * 325.949D) & 0x7FF;
                                                int var395 = (int) (Math.atan2((double) var390, (double) var392) * -325.949D) & 0x7FF;
                                                if (var394 < 128) {
                                                    var394 = 128;
                                                }
                                                if (var394 > 383) {
                                                    var394 = 383;
                                                }
                                                if (Statics.field1610 < var394) {
                                                    Statics.field1610 += Statics.field3032 * (var394 - Statics.field1610) / 1000 + Statics.field240;
                                                    if (Statics.field1610 > var394) {
                                                        Statics.field1610 = var394;
                                                    }
                                                }
                                                if (Statics.field1610 > var394) {
                                                    Statics.field1610 -= Statics.field3032 * (Statics.field1610 - var394) / 1000 + Statics.field240;
                                                    if (Statics.field1610 < var394) {
                                                        Statics.field1610 = var394;
                                                    }
                                                }
                                                int var396 = var395 - Statics.field2924;
                                                if (var396 > 1024) {
                                                    var396 -= 2048;
                                                }
                                                if (var396 < -1024) {
                                                    var396 += 2048;
                                                }
                                                if (var396 > 0) {
                                                    Statics.field2924 += Statics.field3032 * var396 / 1000 + Statics.field240;
                                                    Statics.field2924 &= 0x7FF;
                                                }
                                                if (var396 < 0) {
                                                    Statics.field2924 -= Statics.field3032 * -var396 / 1000 + Statics.field240;
                                                    Statics.field2924 &= 0x7FF;
                                                }
                                                int var397 = var395 - Statics.field2924;
                                                if (var397 > 1024) {
                                                    var397 -= 2048;
                                                }
                                                if (var397 < -1024) {
                                                    var397 += 2048;
                                                }
                                                if (var397 < 0 && var396 > 0 || var397 > 0 && var396 < 0) {
                                                    Statics.field2924 = var395;
                                                }
                                            }
                                            for (int var398 = 0; var398 < 5; var398++) {
                                                int var10002 = field558[var398]++;
                                            }
                                            Statics.field284.method205();
                                            int var399 = class140.method2053();
                                            int var400 = class137.method2055();
                                            if (var399 > 15000 && var400 > 15000) {
                                                field348 = 250;
                                                class140.field2146 = 14500;
                                                field338.method2622(246);
                                            }
                                            field365++;
                                            if (field365 > 500) {
                                                field365 = 0;
                                                int var401 = (int) (Math.random() * 8.0D);
                                                if ((var401 & 0x1) == 1) {
                                                    field359 += field360;
                                                }
                                                if ((var401 & 0x2) == 2) {
                                                    field361 += field362;
                                                }
                                                if ((var401 & 0x4) == 4) {
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
                                                field362 = 2;
                                            }
                                            if (field361 > 55) {
                                                field362 = -2;
                                            }
                                            if (field363 < -40) {
                                                field364 = 1;
                                            }
                                            if (field363 > 40) {
                                                field364 = -1;
                                            }
                                            field370++;
                                            if (field370 > 500) {
                                                field370 = 0;
                                                int var402 = (int) (Math.random() * 8.0D);
                                                if ((var402 & 0x1) == 1) {
                                                    field443 += field367;
                                                }
                                                if ((var402 & 0x2) == 2) {
                                                    field295 += field460;
                                                }
                                            }
                                            if (field443 < -60) {
                                                field367 = 2;
                                            }
                                            if (field443 > 60) {
                                                field367 = -2;
                                            }
                                            if (field295 < -20) {
                                                field460 = 1;
                                            }
                                            if (field295 > 10) {
                                                field460 = -1;
                                            }
                                            for (class39 var403 = (class39) field298.method3499(); var403 != null; var403 = (class39) field298.method3500()) {
                                                if ((long) var403.field879 < class115.method2266() / 1000L - 5L) {
                                                    if (var403.field874 > 0) {
                                                        class12.method755(5, "", var403.field877 + class157.field2396);
                                                    }
                                                    if (var403.field874 == 0) {
                                                        class12.method755(5, "", var403.field877 + class157.field2446);
                                                    }
                                                    var403.method3617();
                                                }
                                            }
                                            field550++;
                                            if (field550 > 50) {
                                                field338.method2622(94);
                                            }
                                            try {
                                                if (Statics.field213 != null && field338.field1988 > 0) {
                                                    Statics.field213.method2840(field338.field1986, 0, field338.field1988);
                                                    field338.field1988 = 0;
                                                    field550 = 0;
                                                }
                                            } catch (IOException var405) {
                                                method659();
                                            }
                                            return;
                                        }
                                        var357 = var356.field7;
                                        if (var357.field2817 < 0) {
                                            break;
                                        }
                                        var358 = class173.method793(var357.field2754);
                                    } while (var358 == null || var358.field2864 == null || var357.field2817 >= var358.field2864.length || var358.field2864[var357.field2817] != var357);
                                    class37.method2961(var356);
                                }
                            }
                            var354 = var353.field7;
                            if (var354.field2817 < 0) {
                                break;
                            }
                            var355 = class173.method793(var354.field2754);
                        } while (var355 == null || var355.field2864 == null || var354.field2817 >= var355.field2864.length || var355.field2864[var354.field2817] != var354);
                        class37.method2961(var353);
                    }
                }
                var351 = var350.field7;
                if (var351.field2817 < 0) {
                    break;
                }
                var352 = class173.method793(var351.field2754);
            } while (var352 == null || var352.field2864 == null || var351.field2817 >= var352.field2864.length || var352.field2864[var351.field2817] != var351);
            class37.method2961(var350);
        }
    }

    @ObfuscatedName("aw.y(I)V")
    public static final void method1013() {
        if (Statics.field682 != null) {
            Statics.field682.method1193();
        }
        if (Statics.field1608 != null) {
            Statics.field1608.method1193();
        }
    }

    @ObfuscatedName("s.d(S)V")
    public static final void method188() {
        for (int var0 = 0; var0 < field534; var0++) {
            int var10002 = field312[var0]--;
            if (field312[var0] >= -10) {
                class59 var2 = field322[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1232(Statics.field623, field535[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field312[var0] += var2.method1230();
                    field322[var0] = var2;
                }
                if (field312[var0] < 0) {
                    int var9;
                    if (field538[var0] == 0) {
                        var9 = field532;
                    } else {
                        int var3 = (field538[var0] & 0xFF) * 128;
                        int var4 = field538[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field143.field861;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field538[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field143.field812;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field312[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field533 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1229().method1270(Statics.field1783);
                        class65 var11 = class65.method1292(var10, 100, var9);
                        var11.method1295(field536[var0] - 1);
                        Statics.field256.method1137(var11);
                    }
                    field312[var0] = -100;
                }
            } else {
                field534--;
                for (int var1 = var0; var1 < field534; var1++) {
                    field535[var1] = field535[var1 + 1];
                    field322[var1] = field322[var1 + 1];
                    field536[var1] = field536[var1 + 1];
                    field312[var1] = field312[var1 + 1];
                    field538[var1] = field538[var1 + 1];
                }
                var0--;
            }
        }
        if (!field462) {
            return;
        }
        boolean var12;
        if (class183.field2945 == 0) {
            var12 = Statics.field2941.method3389();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field546 != 0 && field530 != -1) {
                class183.method995(Statics.field1868, field530, 0, field546, false);
            }
            field462 = false;
        }
    }

    @ObfuscatedName("dx.n(Las;IIII)V")
    public static void method2642(class43 arg0, int arg1, int arg2, int arg3) {
        if (field534 >= 50 || field533 == 0 || arg0.field987 == null || arg1 >= arg0.field987.length) {
            return;
        }
        int var4 = arg0.field987[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field535[field534] = var5;
        field536[field534] = var6;
        field312[field534] = 0;
        field322[field534] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field538[field534] = (var8 << 16) + (var9 << 8) + var7;
        field534++;
    }

    @ObfuscatedName("ck.i(IB)V")
    public static void method1968(int arg0) {
        if (arg0 == -1 && !field462) {
            Statics.field2941.method3366();
            class183.field2945 = 1;
            Statics.field2579 = null;
        } else if (arg0 != -1 && field530 != arg0 && field546 != 0 && !field462) {
            class183.method2076(2, Statics.field1868, arg0, 0, field546, false);
        }
        field530 = arg0;
    }

    @ObfuscatedName("ab.ad(IIB)V")
    public static void method794(int arg0, int arg1) {
        if (field546 != 0 && arg0 != -1) {
            class183.method995(Statics.field2699, arg0, 0, field546, false);
            field462 = true;
        }
    }

    @ObfuscatedName("cl.aq(I)V")
    public static final void method2072() {
        if (Statics.field124 == field329) {
            return;
        }
        field329 = Statics.field124;
        int var0 = Statics.field124;
        int[] var1 = Statics.field1090.field1401;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field77[var0][var6][var4] & 0x18) == 0) {
                    Statics.field136.method1825(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class6.field77[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field136.method1825(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1090.method1605();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field77[var0][var10][var9] & 0x18) == 0) {
                    method73(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class6.field77[var0 + 1][var10][var9] & 0x8) != 0) {
                    method73(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field522 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field136.method1820(Statics.field124, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method2705(var14).field948;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field521[Statics.field124].field1887;
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
                        field525[field522] = Statics.field2004[var15];
                        field328[field522] = var16;
                        field524[field522] = var17;
                        field522++;
                    }
                }
            }
        }
        Statics.field157.method1595();
    }

    @ObfuscatedName("bk.ak(Lfd;IIB)V")
    public static final void method1244(class173 arg0, int arg1, int arg2) {
        if (field487 != 0 && field487 != 3 || class140.field2162 != 1 && Statics.field592 || class140.field2162 != 4) {
            return;
        }
        class175 var3 = arg0.method3180(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2163 - arg1;
        int var5 = class140.field2159 - arg2;
        if (!var3.method3219(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2883 / 2;
        int var7 = var5 - var3.field2882 / 2;
        int var8 = field443 + field442 & 0x7FF;
        int var9 = class91.field1550[var8];
        int var10 = class91.field1568[var8];
        int var11 = (field295 + 256) * var9 >> 8;
        int var12 = (field295 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field143.field861 + var13 >> 7;
        int var16 = Statics.field143.field812 - var14 >> 7;
        field338.method2622(118);
        field338.method2503(18);
        field338.method2413(class137.field2117[82] ? (class137.field2117[81] ? 2 : 1) : 0);
        field338.method2374(Statics.field647 + var16);
        field338.method2431(Statics.field233 + var15);
        field338.method2503(var6);
        field338.method2503(var7);
        field338.method2374(field442);
        field338.method2503(57);
        field338.method2503(field443);
        field338.method2503(field295);
        field338.method2503(89);
        field338.method2374(Statics.field143.field861);
        field338.method2374(Statics.field143.field812);
        field338.method2503(63);
        field526 = var15;
        field353 = var16;
    }

    @ObfuscatedName("bg.au(B)V")
    public static final void method1507() {
        int var0 = field359 + Statics.field143.field861;
        int var1 = field361 + Statics.field143.field812;
        if (Statics.field185 - var0 < -500 || Statics.field185 - var0 > 500 || Statics.field216 - var1 < -500 || Statics.field216 - var1 > 500) {
            Statics.field185 = var0;
            Statics.field216 = var1;
        }
        if (Statics.field185 != var0) {
            Statics.field185 += (var0 - Statics.field185) / 16;
        }
        if (Statics.field216 != var1) {
            Statics.field216 += (var1 - Statics.field216) / 16;
        }
        if (class140.field2150 == 4 && Statics.field592) {
            int var2 = class140.field2152 - field383;
            field381 = var2 * 2;
            field383 = var2 == -1 || var2 == 1 ? class140.field2152 : (field383 + class140.field2152) / 2;
            int var3 = field382 - class140.field2151;
            field302 = var3 * 2;
            field382 = var3 == -1 || var3 == 1 ? class140.field2151 : (field382 + class140.field2151) / 2;
        } else {
            if (class137.field2117[96]) {
                field302 += (-24 - field302) / 2;
            } else if (class137.field2117[97]) {
                field302 += (24 - field302) / 2;
            } else {
                field302 /= 2;
            }
            if (class137.field2117[98]) {
                field381 += (12 - field381) / 2;
            } else if (class137.field2117[99]) {
                field381 += (-12 - field381) / 2;
            } else {
                field381 /= 2;
            }
            field383 = class140.field2152;
            field382 = class140.field2151;
        }
        field442 = field302 / 2 + field442 & 0x7FF;
        field378 += field381 / 2;
        if (field378 < 128) {
            field378 = 128;
        }
        if (field378 > 383) {
            field378 = 383;
        }
        int var4 = Statics.field185 >> 7;
        int var5 = Statics.field216 >> 7;
        int var6 = method881(Statics.field185, Statics.field216, Statics.field124);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field124;
                    if (var10 < 3 && (class6.field77[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field80[var10][var8][var9];
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
        if (var12 > field404) {
            field404 += (var12 - field404) / 24;
        } else if (var12 < field404) {
            field404 += (var12 - field404) / 80;
        }
    }

    @ObfuscatedName("ah.ao(I)V")
    public static final void method713() {
        for (int var0 = 0; var0 < field334; var0++) {
            int var1 = field335[var0];
            class35 var2 = field438[var1];
            if (var2 != null) {
                method692(var2, var2.field782.field887);
            }
        }
    }

    @ObfuscatedName("am.am(Lay;IS)V")
    public static final void method692(class38 arg0, int arg1) {
        if (arg0.field856 > field548) {
            int var2 = arg0.field856 - field548;
            int var3 = arg0.field833 * 64 + arg0.field825 * 128;
            int var4 = arg0.field854 * 128 + arg0.field833 * 64;
            arg0.field861 += (var3 - arg0.field861) / var2;
            arg0.field812 += (var4 - arg0.field812) / var2;
            arg0.field868 = 0;
            arg0.field818 = arg0.field843;
        } else if (arg0.field837 >= field548) {
            if (field548 == arg0.field837 || arg0.field842 == -1 || arg0.field845 != 0 || arg0.field844 + 1 > class43.method2304(arg0.field842).field984[arg0.field824]) {
                int var5 = arg0.field837 - arg0.field856;
                int var6 = field548 - arg0.field856;
                int var7 = arg0.field833 * 64 + arg0.field825 * 128;
                int var8 = arg0.field854 * 128 + arg0.field833 * 64;
                int var9 = arg0.field833 * 64 + arg0.field827 * 128;
                int var10 = arg0.field855 * 128 + arg0.field833 * 64;
                arg0.field861 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field812 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field868 = 0;
            arg0.field818 = arg0.field843;
            arg0.field813 = arg0.field818;
        } else {
            method144(arg0);
        }
        if (arg0.field861 < 128 || arg0.field812 < 128 || arg0.field861 >= 13184 || arg0.field812 >= 13184) {
            arg0.field842 = -1;
            arg0.field871 = -1;
            arg0.field856 = 0;
            arg0.field837 = 0;
            arg0.field861 = arg0.field865[0] * 128 + arg0.field833 * 64;
            arg0.field812 = arg0.field866[0] * 128 + arg0.field833 * 64;
            arg0.method743();
        }
        if (Statics.field143 == arg0 && (arg0.field861 < 1536 || arg0.field812 < 1536 || arg0.field861 >= 11776 || arg0.field812 >= 11776)) {
            arg0.field842 = -1;
            arg0.field871 = -1;
            arg0.field856 = 0;
            arg0.field837 = 0;
            arg0.field861 = arg0.field865[0] * 128 + arg0.field833 * 64;
            arg0.field812 = arg0.field866[0] * 128 + arg0.field833 * 64;
            arg0.method743();
        }
        if (arg0.field863 != 0) {
            if (arg0.field840 != -1) {
                class38 var11 = null;
                if (arg0.field840 < 32768) {
                    var11 = field438[arg0.field840];
                } else if (arg0.field840 >= 32768) {
                    var11 = field415[arg0.field840 - 32768];
                }
                if (var11 != null) {
                    int var12 = arg0.field861 - var11.field861;
                    int var13 = arg0.field812 - var11.field812;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field818 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field853) {
                    arg0.field840 = -1;
                    arg0.field853 = false;
                }
            }
            if (arg0.field828 != -1 && (arg0.field864 == 0 || arg0.field868 > 0)) {
                arg0.field818 = arg0.field828;
                arg0.field828 = -1;
            }
            int var14 = arg0.field818 - arg0.field813 & 0x7FF;
            if (var14 == 0 && arg0.field853) {
                arg0.field840 = -1;
                arg0.field853 = false;
            }
            if (var14 == 0) {
                arg0.field862 = 0;
            } else {
                arg0.field862++;
                if (var14 > 1024) {
                    arg0.field813 -= arg0.field863;
                    boolean var15 = true;
                    if (var14 < arg0.field863 || var14 > 2048 - arg0.field863) {
                        arg0.field813 = arg0.field818;
                        var15 = false;
                    }
                    if (arg0.field839 == arg0.field816 && (arg0.field862 > 25 || var15)) {
                        if (arg0.field817 == -1) {
                            arg0.field839 = arg0.field819;
                        } else {
                            arg0.field839 = arg0.field817;
                        }
                    }
                } else {
                    arg0.field813 += arg0.field863;
                    boolean var16 = true;
                    if (var14 < arg0.field863 || var14 > 2048 - arg0.field863) {
                        arg0.field813 = arg0.field818;
                        var16 = false;
                    }
                    if (arg0.field839 == arg0.field816 && (arg0.field862 > 25 || var16)) {
                        if (arg0.field858 == -1) {
                            arg0.field839 = arg0.field819;
                        } else {
                            arg0.field839 = arg0.field858;
                        }
                    }
                }
                arg0.field813 &= 0x7FF;
            }
        }
        method117(arg0);
    }

    @ObfuscatedName("k.ah(Lay;I)V")
    public static final void method144(class38 arg0) {
        arg0.field839 = arg0.field816;
        if (arg0.field864 == 0) {
            arg0.field868 = 0;
            return;
        }
        if (arg0.field842 != -1 && arg0.field845 == 0) {
            class43 var1 = class43.method2304(arg0.field842);
            if (arg0.field847 > 0 && var1.field995 == 0) {
                arg0.field868++;
                return;
            }
            if (arg0.field847 <= 0 && var1.field996 == 0) {
                arg0.field868++;
                return;
            }
        }
        int var2 = arg0.field861;
        int var3 = arg0.field812;
        int var4 = arg0.field865[arg0.field864 - 1] * 128 + arg0.field833 * 64;
        int var5 = arg0.field866[arg0.field864 - 1] * 128 + arg0.field833 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field818 = 1280;
            } else if (var3 > var5) {
                arg0.field818 = 1792;
            } else {
                arg0.field818 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field818 = 768;
            } else if (var3 > var5) {
                arg0.field818 = 256;
            } else {
                arg0.field818 = 512;
            }
        } else if (var3 < var5) {
            arg0.field818 = 1024;
        } else if (var3 > var5) {
            arg0.field818 = 0;
        }
        byte var6 = arg0.field857[arg0.field864 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field861 = var4;
            arg0.field812 = var5;
            arg0.field864--;
            if (arg0.field847 > 0) {
                arg0.field847--;
            }
            return;
        }
        int var7 = arg0.field818 - arg0.field813 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field820;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field819;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field869;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field821;
        }
        if (var8 == -1) {
            var8 = arg0.field819;
        }
        arg0.field839 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field782.field915;
        }
        if (var10) {
            if (arg0.field818 != arg0.field813 && arg0.field840 == -1 && arg0.field863 != 0) {
                var9 = 2;
            }
            if (arg0.field864 > 2) {
                var9 = 6;
            }
            if (arg0.field864 > 3) {
                var9 = 8;
            }
            if (arg0.field868 > 0 && arg0.field864 > 1) {
                var9 = 8;
                arg0.field868--;
            }
        } else {
            if (arg0.field864 > 1) {
                var9 = 6;
            }
            if (arg0.field864 > 2) {
                var9 = 8;
            }
            if (arg0.field868 > 0 && arg0.field864 > 1) {
                var9 = 8;
                arg0.field868--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field839 == arg0.field819 && arg0.field823 != -1) {
            arg0.field839 = arg0.field823;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field861 += var9;
                if (arg0.field861 > var4) {
                    arg0.field861 = var4;
                }
            } else if (var2 > var4) {
                arg0.field861 -= var9;
                if (arg0.field861 < var4) {
                    arg0.field861 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field812 += var9;
                if (arg0.field812 > var5) {
                    arg0.field812 = var5;
                }
            } else if (var3 > var5) {
                arg0.field812 -= var9;
                if (arg0.field812 < var5) {
                    arg0.field812 = var5;
                }
            }
        }
        if (arg0.field861 == var4 && arg0.field812 == var5) {
            arg0.field864--;
            if (arg0.field847 > 0) {
                arg0.field847--;
            }
        }
    }

    @ObfuscatedName("t.aj(Lay;I)V")
    public static final void method117(class38 arg0) {
        arg0.field814 = false;
        if (arg0.field839 != -1) {
            class43 var1 = class43.method2304(arg0.field839);
            if (var1 == null || var1.field981 == null) {
                arg0.field839 = -1;
            } else {
                arg0.field852++;
                if (arg0.field841 < var1.field981.length && arg0.field852 > var1.field984[arg0.field841]) {
                    arg0.field852 = 1;
                    arg0.field841++;
                    method2642(var1, arg0.field841, arg0.field861, arg0.field812);
                }
                if (arg0.field841 >= var1.field981.length) {
                    arg0.field852 = 0;
                    arg0.field841 = 0;
                    method2642(var1, arg0.field841, arg0.field861, arg0.field812);
                }
            }
        }
        if (arg0.field871 != -1 && field548 >= arg0.field850) {
            if (arg0.field848 < 0) {
                arg0.field848 = 0;
            }
            int var2 = class44.method3632(arg0.field871).field1004;
            if (var2 == -1) {
                arg0.field871 = -1;
            } else {
                class43 var3 = class43.method2304(var2);
                if (var3 == null || var3.field981 == null) {
                    arg0.field871 = -1;
                } else {
                    arg0.field849++;
                    if (arg0.field848 < var3.field981.length && arg0.field849 > var3.field984[arg0.field848]) {
                        arg0.field849 = 1;
                        arg0.field848++;
                        method2642(var3, arg0.field848, arg0.field861, arg0.field812);
                    }
                    if (arg0.field848 >= var3.field981.length && (arg0.field848 < 0 || arg0.field848 >= var3.field981.length)) {
                        arg0.field871 = -1;
                    }
                }
            }
        }
        if (arg0.field842 != -1 && arg0.field845 <= 1) {
            class43 var4 = class43.method2304(arg0.field842);
            if (var4.field995 == 1 && arg0.field847 > 0 && arg0.field856 <= field548 && arg0.field837 < field548) {
                arg0.field845 = 1;
                return;
            }
        }
        if (arg0.field842 != -1 && arg0.field845 == 0) {
            class43 var5 = class43.method2304(arg0.field842);
            if (var5 == null || var5.field981 == null) {
                arg0.field842 = -1;
            } else {
                arg0.field844++;
                if (arg0.field824 < var5.field981.length && arg0.field844 > var5.field984[arg0.field824]) {
                    arg0.field844 = 1;
                    arg0.field824++;
                    method2642(var5, arg0.field824, arg0.field861, arg0.field812);
                }
                if (arg0.field824 >= var5.field981.length) {
                    arg0.field824 -= var5.field988;
                    arg0.field846++;
                    if (arg0.field846 >= var5.field994) {
                        arg0.field842 = -1;
                    } else if (arg0.field824 >= 0 && arg0.field824 < var5.field981.length) {
                        method2642(var5, arg0.field824, arg0.field861, arg0.field812);
                    } else {
                        arg0.field842 = -1;
                    }
                }
                arg0.field814 = var5.field990;
            }
        }
        if (arg0.field845 > 0) {
            arg0.field845--;
        }
    }

    @ObfuscatedName("ba.ar(Lq;III)V")
    public static void method1594(class3 arg0, int arg1, int arg2) {
        if (arg0.field842 == arg1 && arg1 != -1) {
            int var3 = class43.method2304(arg1).field997;
            if (var3 == 1) {
                arg0.field824 = 0;
                arg0.field844 = 0;
                arg0.field845 = arg2;
                arg0.field846 = 0;
            }
            if (var3 == 2) {
                arg0.field846 = 0;
            }
        } else if (arg1 == -1 || arg0.field842 == -1 || class43.method2304(arg1).field1001 >= class43.method2304(arg0.field842).field1001) {
            arg0.field842 = arg1;
            arg0.field824 = 0;
            arg0.field844 = 0;
            arg0.field845 = arg2;
            arg0.field846 = 0;
            arg0.field847 = arg0.field864;
        }
    }

    @ObfuscatedName("dw.ae(IB)V")
    public static void method2330(int arg0) {
        field505 = 0L;
        if (arg0 >= 2) {
            field506 = true;
        } else {
            field506 = false;
        }
        method150();
        if (field303 >= 25) {
            field338.method2622(61);
            class122 var1 = field338;
            int var2 = field506 ? 2 : 1;
            var1.method2503(var2);
            field338.method2374(Statics.field1543);
            field338.method2374(Statics.field121);
        }
        field2202 = true;
    }

    @ObfuscatedName("z.al(I)V")
    public static void method150() {
        client var0 = Statics.field293;
        synchronized (Statics.field293) {
            Container var1 = Statics.field293.method2856();
            if (var1 != null) {
                Statics.field2587 = Math.max(var1.getSize().width, Statics.field792);
                Statics.field1607 = Math.max(var1.getSize().height, Statics.field1345);
                if (Statics.field2022 == var1) {
                    Insets var2 = Statics.field2022.getInsets();
                    Statics.field2587 -= var2.right + var2.left;
                    Statics.field1607 -= var2.top + var2.bottom;
                }
                if (Statics.field2587 <= 0) {
                    Statics.field2587 = 1;
                }
                if (Statics.field1607 <= 0) {
                    Statics.field1607 = 1;
                }
                int var3 = field506 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field1543 = field292 * 765;
                    Statics.field121 = field508 * 503;
                } else {
                    Statics.field1543 = Math.min(Statics.field2587, 7680);
                    Statics.field121 = Math.min(Statics.field1607, 2160);
                }
                field2200 = (Statics.field2587 - Statics.field1543) / 2;
                field2201 = 0;
                Statics.field1652.setSize(Statics.field1543, Statics.field121);
                Statics.field157 = class78.method98(Statics.field1543, Statics.field121, Statics.field1652);
                if (Statics.field2022 == var1) {
                    Insets var4 = Statics.field2022.getInsets();
                    Statics.field1652.setLocation(field2200 + var4.left, field2201 + var4.top);
                } else {
                    Statics.field1652.setLocation(field2200, field2201);
                }
                method3124();
                if (field452 != -1) {
                    int var5 = field452;
                    int var6 = Statics.field1543;
                    int var7 = Statics.field121;
                    if (class173.method2073(var5)) {
                        method2651(Statics.field2868[var5], -1, var6, var7, true);
                    }
                }
                method147();
            }
        }
    }

    @ObfuscatedName("fo.ay(B)V")
    public static void method3124() {
        int var0 = Statics.field1543;
        int var1 = Statics.field121;
        if (Statics.field2587 < var0) {
            int var2 = Statics.field2587;
        }
        if (Statics.field1607 < var1) {
            int var3 = Statics.field1607;
        }
        if (Statics.field1371 == null) {
            return;
        }
        try {
            client var4 = Statics.field293;
            int var5 = field506 ? 2 : 1;
            Object[] var6 = new Object[] { var5 };
            JSObject.getWindow(var4).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("z.ag(I)V")
    public static void method147() {
        int var0 = field2200;
        int var1 = field2201;
        int var2 = Statics.field2587 - Statics.field1543 - var0;
        int var3 = Statics.field1607 - Statics.field121 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field293.method2856();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field2022 == var4) {
                Insets var7 = Statics.field2022.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1607);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2587, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2587 + var5 - var2, var6, var2, Statics.field1607);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1607 + var6 - var3, Statics.field2587, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("dl.ab(Ljava/lang/String;ZI)V")
    public static final void method2447(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1782.method3732(arg0, 250);
        int var6 = Statics.field1782.method3733(arg0, 250) * 13;
        class80.method1737(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1709(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1782.method3738(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method149(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1652.getGraphics();
                Statics.field157.method1536(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1652.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field495; var13++) {
            if (field418[var13] + field304[var13] > var9 && field418[var13] < var9 + var11 && field501[var13] + field374[var13] > var10 && field501[var13] < var10 + var12) {
                field498[var13] = true;
            }
        }
    }

    @ObfuscatedName("fo.ac(IIIII)V")
    public static final void method3117(int arg0, int arg1, int arg2, int arg3) {
        field399++;
        method2056(class34.field771);
        boolean var4 = false;
        if (field424 >= 0) {
            int var5 = class33.field755;
            int[] var6 = class33.field754;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field424 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method2056(class34.field769);
        }
        method655(true);
        method2056(var4 ? class34.field772 : class34.field773);
        method655(false);
        for (class7 var8 = (class7) field427.method3544(); var8 != null; var8 = (class7) field427.method3538()) {
            if (Statics.field124 != var8.field96 || field548 > var8.field95) {
                var8.method3620();
            } else if (field548 >= var8.field107) {
                if (var8.field105 > 0) {
                    class35 var9 = field438[var8.field105 - 1];
                    if (var9 != null && var9.field861 >= 0 && var9.field861 < 13312 && var9.field812 >= 0 && var9.field812 < 13312) {
                        var8.method91(var9.field861, var9.field812, method881(var9.field861, var9.field812, var8.field96) - var8.field100, field548);
                    }
                }
                if (var8.field105 < 0) {
                    int var10 = -var8.field105 - 1;
                    class3 var11;
                    if (field416 == var10) {
                        var11 = Statics.field143;
                    } else {
                        var11 = field415[var10];
                    }
                    if (var11 != null && var11.field861 >= 0 && var11.field861 < 13312 && var11.field812 >= 0 && var11.field812 < 13312) {
                        var8.method91(var11.field861, var11.field812, method881(var11.field861, var11.field812, var8.field96) - var8.field100, field548);
                    }
                }
                var8.method96(field371);
                Statics.field136.method1803(Statics.field124, (int) var8.field101, (int) var8.field110, (int) var8.field109, 60, var8, var8.field115, -1, false);
            }
        }
        method120();
        method1010(arg0, arg1, arg2, arg3, true);
        int var12 = field570;
        int var13 = field423;
        int var14 = field475;
        int var15 = field313;
        class80.method1701(var12, var13, var12 + var14, var13 + var15);
        class91.method1971();
        if (!field540) {
            int var16 = field378;
            if (field404 / 256 > var16) {
                var16 = field404 / 256;
            }
            if (field542[4] && field446[4] + 128 > var16) {
                var16 = field446[4] + 128;
            }
            int var17 = field442 + field363 & 0x7FF;
            int var18 = Statics.field185;
            int var19 = method881(Statics.field143.field861, Statics.field143.field812, Statics.field124) - field384;
            int var20 = Statics.field216;
            int var21 = var16 * 3 + 600;
            int var22 = 2048 - var16 & 0x7FF;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 0;
            int var25 = 0;
            int var26 = var21;
            if (var22 != 0) {
                int var27 = class91.field1550[var22];
                int var28 = class91.field1568[var22];
                int var29 = var25 * var28 - var21 * var27 >> 16;
                var26 = var25 * var27 + var21 * var28 >> 16;
                var25 = var29;
            }
            if (var23 != 0) {
                int var30 = class91.field1550[var23];
                int var31 = class91.field1568[var23];
                int var32 = var24 * var31 + var26 * var30 >> 16;
                var26 = var26 * var31 - var24 * var30 >> 16;
                var24 = var32;
            }
            Statics.field2161 = var18 - var24;
            Statics.field989 = var19 - var25;
            Statics.field2286 = var20 - var26;
            Statics.field1610 = var16;
            Statics.field2924 = var17;
        }
        int var33;
        if (field540) {
            int var34;
            if (Statics.field1371.field139) {
                var34 = Statics.field124;
            } else {
                int var35 = method881(Statics.field2161, Statics.field2286, Statics.field124);
                if (var35 - Statics.field989 >= 800 || (class6.field77[Statics.field124][Statics.field2161 >> 7][Statics.field2286 >> 7] & 0x4) == 0) {
                    var34 = 3;
                } else {
                    var34 = Statics.field124;
                }
            }
            var33 = var34;
        } else {
            var33 = method2170();
        }
        int var36 = Statics.field2161;
        int var37 = Statics.field989;
        int var38 = Statics.field2286;
        int var39 = Statics.field1610;
        int var40 = Statics.field2924;
        for (int var41 = 0; var41 < 5; var41++) {
            if (field542[var41]) {
                int var42 = (int) (Math.random() * (double) (field543[var41] * 2 + 1) - (double) field543[var41] + Math.sin((double) field305[var41] / 100.0D * (double) field558[var41]) * (double) field446[var41]);
                if (var41 == 0) {
                    Statics.field2161 += var42;
                }
                if (var41 == 1) {
                    Statics.field989 += var42;
                }
                if (var41 == 2) {
                    Statics.field2286 += var42;
                }
                if (var41 == 3) {
                    Statics.field2924 = Statics.field2924 + var42 & 0x7FF;
                }
                if (var41 == 4) {
                    Statics.field1610 += var42;
                    if (Statics.field1610 < 128) {
                        Statics.field1610 = 128;
                    }
                    if (Statics.field1610 > 383) {
                        Statics.field1610 = 383;
                    }
                }
            }
        }
        int var43 = class140.field2151;
        int var44 = class140.field2152;
        if (class140.field2162 != 0) {
            var43 = class140.field2163;
            var44 = class140.field2159;
        }
        if (var43 >= var12 && var43 < var12 + var14 && var44 >= var13 && var44 < var13 + var15) {
            class105.field1842 = true;
            class105.field1806 = 0;
            class105.field1843 = var43 - var12;
            class105.field1805 = var44 - var13;
        } else {
            class105.field1842 = false;
            class105.field1806 = 0;
        }
        method1013();
        class80.method1737(var12, var13, var14, var15, 0);
        method1013();
        int var45 = class91.field1553;
        class91.field1553 = field559;
        Statics.field136.method1829(Statics.field2161, Statics.field989, Statics.field2286, Statics.field1610, Statics.field2924, var33);
        class91.field1553 = var45;
        method1013();
        Statics.field136.method1806();
        field388 = 0;
        boolean var46 = false;
        int var47 = -1;
        int var48 = class33.field755;
        int[] var49 = class33.field754;
        for (int var50 = 0; var50 < field334 + var48; var50++) {
            class38 var51;
            if (var50 < var48) {
                var51 = field415[var49[var50]];
                if (field424 == var49[var50]) {
                    var46 = true;
                    var47 = var50;
                    continue;
                }
            } else {
                var51 = field438[field335[var50 - var48]];
            }
            method2714(var51, var50, var12, var13, var14, var15);
        }
        if (var46) {
            method2714(field415[field424], var47, var12, var13, var14, var15);
        }
        for (int var52 = 0; var52 < field388; var52++) {
            int var53 = field390[var52];
            int var54 = field391[var52];
            int var55 = field393[var52];
            int var56 = field392[var52];
            boolean var57 = true;
            while (var57) {
                var57 = false;
                for (int var58 = 0; var58 < var52; var58++) {
                    if (var54 + 2 > field391[var58] - field392[var58] && var54 - var56 < field391[var58] + 2 && var53 - var55 < field393[var58] + field390[var58] && var53 + var55 > field390[var58] - field393[var58] && field391[var58] - field392[var58] < var54) {
                        var54 = field391[var58] - field392[var58];
                        var57 = true;
                    }
                }
            }
            field400 = field390[var52];
            field401 = field391[var52] = var54;
            String var59 = field357[var52];
            if (field385 == 0) {
                int var60 = 16776960;
                if (field394[var52] < 6) {
                    var60 = field509[field394[var52]];
                }
                if (field394[var52] == 6) {
                    var60 = field399 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field394[var52] == 7) {
                    var60 = field399 % 20 < 10 ? 255 : 65535;
                }
                if (field394[var52] == 8) {
                    var60 = field399 % 20 < 10 ? 45056 : 8454016;
                }
                if (field394[var52] == 9) {
                    int var61 = 150 - field396[var52];
                    if (var61 < 50) {
                        var60 = var61 * 1280 + 16711680;
                    } else if (var61 < 100) {
                        var60 = 16776960 - (var61 - 50) * 327680;
                    } else if (var61 < 150) {
                        var60 = (var61 - 100) * 5 + 65280;
                    }
                }
                if (field394[var52] == 10) {
                    int var62 = 150 - field396[var52];
                    if (var62 < 50) {
                        var60 = var62 * 5 + 16711680;
                    } else if (var62 < 100) {
                        var60 = 16711935 - (var62 - 50) * 327680;
                    } else if (var62 < 150) {
                        var60 = (var62 - 100) * 327680 + 255 - (var62 - 100) * 5;
                    }
                }
                if (field394[var52] == 11) {
                    int var63 = 150 - field396[var52];
                    if (var63 < 50) {
                        var60 = 16777215 - var63 * 327685;
                    } else if (var63 < 100) {
                        var60 = (var63 - 50) * 327685 + 65280;
                    } else if (var63 < 150) {
                        var60 = 16777215 - (var63 - 100) * 327680;
                    }
                }
                if (field395[var52] == 0) {
                    Statics.field163.method3755(var59, field400 + var12, field401 + var13, var60, 0);
                }
                if (field395[var52] == 1) {
                    Statics.field163.method3739(var59, field400 + var12, field401 + var13, var60, 0, field399);
                }
                if (field395[var52] == 2) {
                    Statics.field163.method3740(var59, field400 + var12, field401 + var13, var60, 0, field399);
                }
                if (field395[var52] == 3) {
                    Statics.field163.method3741(var59, field400 + var12, field401 + var13, var60, 0, field399, 150 - field396[var52]);
                }
                if (field395[var52] == 4) {
                    int var64 = (150 - field396[var52]) * (Statics.field163.method3730(var59) + 100) / 150;
                    class80.method1702(field400 + var12 - 50, var13, field400 + var12 + 50, var13 + var15);
                    Statics.field163.method3735(var59, field400 + var12 + 50 - var64, field401 + var13, var60, 0);
                    class80.method1701(var12, var13, var12 + var14, var13 + var15);
                }
                if (field395[var52] == 5) {
                    int var65 = 150 - field396[var52];
                    int var66 = 0;
                    if (var65 < 25) {
                        var66 = var65 - 25;
                    } else if (var65 > 125) {
                        var66 = var65 - 125;
                    }
                    class80.method1702(var12, field401 + var13 - Statics.field163.field3176 - 1, var12 + var14, field401 + var13 + 5);
                    Statics.field163.method3755(var59, field400 + var12, field401 + var13 + var66, var60, 0);
                    class80.method1701(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field163.method3755(var59, field400 + var12, field401 + var13, 16776960, 0);
            }
        }
        method89(var12, var13);
        ((class95) Statics.field1564).method2058(field371);
        if (field515 == 1) {
            Statics.field3167[field315 / 100].method1618(field402 - 8, field403 - 8);
        }
        if (field515 == 2) {
            Statics.field3167[field315 / 100 + 4].method1618(field402 - 8, field403 - 8);
        }
        field468 = 0;
        int var67 = (Statics.field143.field861 >> 7) + Statics.field233;
        int var68 = (Statics.field143.field812 >> 7) + Statics.field647;
        if (var67 >= 3053 && var67 <= 3156 && var68 >= 3056 && var68 <= 3136) {
            field468 = 1;
        }
        if (var67 >= 3072 && var67 <= 3118 && var68 >= 9492 && var68 <= 9535) {
            field468 = 1;
        }
        if (field468 == 1 && var67 >= 3139 && var67 <= 3199 && var68 >= 3008 && var68 <= 3062) {
            field468 = 0;
        }
        Statics.field2161 = var36;
        Statics.field989 = var37;
        Statics.field2286 = var38;
        Statics.field1610 = var39;
        Statics.field2924 = var40;
        if (field333) {
            byte var69 = 0;
            int var70 = class171.field2721 + class171.field2707 + var69;
            if (var70 == 0) {
                field333 = false;
            }
        }
        if (field333) {
            class80.method1737(var12, var13, var14, var15, 0);
            method2447(class157.field2307, false);
        }
    }

    @ObfuscatedName("at.az(IIIIZB)V")
    public static final void method1010(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field408 - field547) * var5 / 100 + field547;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field553) {
            short var8 = field553;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field552) {
                var6 = field552;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1700();
                    class80.method1737(arg0, arg1, var10, arg3, -16777216);
                    class80.method1737(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field554) {
            short var11 = field554;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field551) {
                var6 = field551;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1700();
                    class80.method1737(arg0, arg1, arg2, var13, -16777216);
                    class80.method1737(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field503 - field549) * var5 / 100 + field549;
        field559 = arg3 * var6 * var14 / 85504 << 1;
        if (field475 != arg2 || field313 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1550[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1826(var15, 500, 800, arg2, arg3);
        }
        field570 = arg0;
        field423 = arg1;
        field475 = arg2;
        field313 = arg3;
    }

    @ObfuscatedName("ch.as(Laj;I)V")
    public static final void method2056(class34 arg0) {
        if (Statics.field143.field861 >> 7 == field526 && Statics.field143.field812 >> 7 == field353) {
            field526 = 0;
        }
        int var1 = class33.field755;
        int[] var2 = class33.field754;
        int var3 = var1;
        if (class34.field771 == arg0 || class34.field769 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field771 == arg0) {
                var5 = Statics.field143;
                var6 = Statics.field143.field55 << 14;
            } else if (class34.field769 == arg0) {
                var5 = field415[field424];
                var6 = field424 << 14;
            } else {
                var5 = field415[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field772 == arg0 && field424 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method22() && !var5.field56) {
                var5.field51 = false;
                if ((field300 && var1 > 50 || var1 > 200) && class34.field771 != arg0 && var5.field839 == var5.field816) {
                    var5.field51 = true;
                }
                int var7 = var5.field861 >> 7;
                int var8 = var5.field812 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field46 == null || field548 < var5.field50 || field548 >= var5.field36) {
                        if ((var5.field861 & 0x7F) == 64 && (var5.field812 & 0x7F) == 64) {
                            if (field399 == field398[var7][var8]) {
                                continue;
                            }
                            field398[var7][var8] = field399;
                        }
                        var5.field40 = method881(var5.field861, var5.field812, Statics.field124);
                        Statics.field136.method1803(Statics.field124, var5.field861, var5.field812, var5.field40, 60, var5, var5.field813, var6, var5.field814);
                    } else {
                        var5.field51 = false;
                        var5.field40 = method881(var5.field861, var5.field812, Statics.field124);
                        Statics.field136.method1804(Statics.field124, var5.field861, var5.field812, var5.field40, 60, var5, var5.field813, var6, var5.field33, var5.field41, var5.field49, var5.field37);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.ai(ZB)V")
    public static final void method655(boolean arg0) {
        for (int var1 = 0; var1 < field334; var1++) {
            class35 var2 = field438[field335[var1]];
            int var3 = (field335[var1] << 14) + 536870912;
            if (var2 != null && var2.method22() && var2.field782.field895 == arg0 && var2.field782.method783()) {
                int var4 = var2.field861 >> 7;
                int var5 = var2.field812 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field833 == 1 && (var2.field861 & 0x7F) == 64 && (var2.field812 & 0x7F) == 64) {
                        if (field399 == field398[var4][var5]) {
                            continue;
                        }
                        field398[var4][var5] = field399;
                    }
                    if (!var2.field782.field888) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field136.method1803(Statics.field124, var2.field861, var2.field812, method881(var2.field861 + (var2.field833 * 64 - 64), var2.field812 + (var2.field833 * 64 - 64), Statics.field124), var2.field833 * 64 - 64 + 60, var2, var2.field813, var3, var2.field814);
                }
            }
        }
    }

    @ObfuscatedName("w.an(I)V")
    public static final void method120() {
        for (class30 var0 = (class30) field428.method3544(); var0 != null; var0 = (class30) field428.method3538()) {
            if (Statics.field124 != var0.field699 || var0.field690) {
                var0.method3620();
            } else if (field548 >= var0.field691) {
                var0.method658(field371);
                if (var0.field690) {
                    var0.method3620();
                } else {
                    Statics.field136.method1803(var0.field699, var0.field701, var0.field694, var0.field695, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ci.ap(B)I")
    public static final int method2170() {
        if (Statics.field1371.field139) {
            return Statics.field124;
        }
        int var0 = 3;
        if (Statics.field1610 < 310) {
            int var1 = Statics.field2161 >> 7;
            int var2 = Statics.field2286 >> 7;
            int var3 = Statics.field143.field861 >> 7;
            int var4 = Statics.field143.field812 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field124;
            }
            if ((class6.field77[Statics.field124][var1][var2] & 0x4) != 0) {
                var0 = Statics.field124;
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
                    if ((class6.field77[Statics.field124][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field124;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field77[Statics.field124][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field124;
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
                    if ((class6.field77[Statics.field124][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field124;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field77[Statics.field124][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field124;
                        }
                    }
                }
            }
        }
        if (Statics.field143.field861 >= 0 && Statics.field143.field812 >= 0 && Statics.field143.field861 < 13312 && Statics.field143.field812 < 13312) {
            if ((class6.field77[Statics.field124][Statics.field143.field861 >> 7][Statics.field143.field812 >> 7] & 0x4) != 0) {
                var0 = Statics.field124;
            }
            return var0;
        } else {
            return Statics.field124;
        }
    }

    @ObfuscatedName("m.aa(III)V")
    public static final void method89(int arg0, int arg1) {
        if (field420 == 2) {
            method45((field316 - Statics.field233 << 7) + field319, (field317 - Statics.field647 << 7) + field320, field511 * 2);
            if (field400 > -1 && field548 % 20 < 10) {
                Statics.field750[0].method1618(field400 + arg0 - 12, field401 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("es.ax(Lay;IIIIII)V")
    public static final void method2714(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method22()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field782;
            if (var6.field892 != null) {
                var6 = var6.method762();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field755;
        int[] var8 = class33.field754;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field56) {
                return;
            }
            if (var10.field35 != -1 || var10.field42 != -1) {
                method1508(arg0, arg0.field860 + 15);
                if (field400 > -1) {
                    if (var10.field35 != -1) {
                        Statics.field2142[var10.field35].method1618(field400 + arg2 - 12, field401 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field42 != -1) {
                        Statics.field1898[var10.field42].method1618(field400 + arg2 - 12, field401 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field420 == 10 && field563 == var8[arg1]) {
                method1508(arg0, arg0.field860 + 15);
                if (field400 > -1) {
                    Statics.field750[1].method1618(field400 + arg2 - 12, field401 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field782;
            if (var11.field892 != null) {
                var11 = var11.method762();
            }
            if (var11.field909 >= 0 && var11.field909 < Statics.field1898.length) {
                method1508(arg0, arg0.field860 + 15);
                if (field400 > -1) {
                    Statics.field1898[var11.field909].method1618(field400 + arg2 - 12, field401 + arg3 - 30);
                }
            }
            if (field420 == 1 && field314 == field335[arg1 - var7] && field548 % 20 < 10) {
                method1508(arg0, arg0.field860 + 15);
                if (field400 > -1) {
                    Statics.field750[0].method1618(field400 + arg2 - 12, field401 + arg3 - 28);
                }
            }
        }
        if (arg0.field811 != null && (arg1 >= var7 || !arg0.field826 && (field510 == 4 || !arg0.field838 && (field510 == 0 || field510 == 3 || field510 == 1 && Statics.method2169(((class3) arg0).field48, false))))) {
            method1508(arg0, arg0.field860);
            if (field400 > -1 && field388 < field492) {
                field393[field388] = Statics.field163.method3730(arg0.field811) / 2;
                field392[field388] = Statics.field163.field3176;
                field390[field388] = field400;
                field391[field388] = field401;
                field394[field388] = arg0.field867;
                field395[field388] = arg0.field829;
                field396[field388] = arg0.field822;
                field357[field388] = arg0.field811;
                field388++;
            }
        }
        if (arg0.field836 > field548) {
            method1508(arg0, arg0.field860 + 15);
            if (field400 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field782;
                    var12 = var13.field894;
                }
                int var14 = arg0.field834 * var12 / arg0.field835;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field834 > 0) {
                    var14 = 1;
                }
                class80.method1737(field400 + arg2 - var12 / 2, field401 + arg3 - 3, var14, 5, 65280);
                class80.method1737(field400 + arg2 - var12 / 2 + var14, field401 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field832[var15] > field548) {
                method1508(arg0, arg0.field860 / 2);
                if (field400 > -1) {
                    if (var15 == 1) {
                        field401 -= 20;
                    }
                    if (var15 == 2) {
                        field400 -= 15;
                        field401 -= 10;
                    }
                    if (var15 == 3) {
                        field400 += 15;
                        field401 -= 10;
                    }
                    Statics.field179[arg0.field831[var15]].method1618(field400 + arg2 - 12, field401 + arg3 - 12);
                    Statics.field1441.method3755(Integer.toString(arg0.field830[var15]), field400 + arg2 - 1, field401 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("bg.av(Lay;II)V")
    public static final void method1508(class38 arg0, int arg1) {
        method45(arg0.field861, arg0.field812, arg1);
    }

    @ObfuscatedName("o.at(IIII)V")
    public static final void method45(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field400 = -1;
            field401 = -1;
            return;
        }
        int var3 = method881(arg0, arg1, Statics.field124) - arg2;
        int var4 = arg0 - Statics.field2161;
        int var5 = var3 - Statics.field989;
        int var6 = arg1 - Statics.field2286;
        int var7 = class91.field1550[Statics.field1610];
        int var8 = class91.field1568[Statics.field1610];
        int var9 = class91.field1550[Statics.field2924];
        int var10 = class91.field1568[Statics.field2924];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field400 = field559 * var11 / var15 + field475 / 2;
            field401 = field559 * var14 / var15 + field313 / 2;
        } else {
            field400 = -1;
            field401 = -1;
        }
    }

    @ObfuscatedName("as.aw(IIII)I")
    public static final int method881(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field77[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field80[var5][var3][var4] + class6.field80[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field80[var5][var3][var4 + 1] + class6.field80[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ee.af(ZB)V")
    public static final void method2934(boolean arg0) {
        field356 = arg0;
        if (!field356) {
            int var1 = field411.method2425();
            int var2 = field411.method2425();
            int var3 = field411.method2440();
            Statics.field2921 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2921[var4][var5] = field411.method2393();
                }
            }
            Statics.field2645 = new int[var3];
            Statics.field2247 = new int[var3];
            Statics.field2002 = new int[var3];
            Statics.field195 = new byte[var3][];
            Statics.field1141 = new byte[var3][];
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
                        Statics.field2645[var7] = var10;
                        Statics.field2247[var7] = Statics.field1757.method3056("m" + var8 + "_" + var9);
                        Statics.field2002[var7] = Statics.field1757.method3056("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method194(var2, var1);
            return;
        }
        int var11 = field411.method2425();
        int var12 = field411.method2390();
        int var13 = field411.method2440();
        field411.method2624();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field411.method2625(1);
                    if (var17 == 1) {
                        field449[var14][var15][var16] = field411.method2625(26);
                    } else {
                        field449[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field411.method2636();
        Statics.field2921 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field2921[var18][var19] = field411.method2393();
            }
        }
        Statics.field2645 = new int[var13];
        Statics.field2247 = new int[var13];
        Statics.field2002 = new int[var13];
        Statics.field195 = new byte[var13][];
        Statics.field1141 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field449[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2645[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2645[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2247[var20] = Statics.field1757.method3056("m" + var29 + "_" + var30);
                            Statics.field2002[var20] = Statics.field1757.method3056("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method194(var12, var11);
    }

    @ObfuscatedName("r.bz(IIB)V")
    public static final void method194(int arg0, int arg1) {
        if (Statics.field1073 == arg0 && Statics.field3111 == arg1) {
            return;
        }
        Statics.field1073 = arg0;
        Statics.field3111 = arg1;
        method2162(25);
        method2447(class157.field2307, true);
        int var2 = Statics.field233;
        int var3 = Statics.field647;
        Statics.field233 = (arg0 - 6) * 8;
        Statics.field647 = (arg1 - 6) * 8;
        int var4 = Statics.field233 - var2;
        int var5 = Statics.field647 - var3;
        int var6 = Statics.field233;
        int var7 = Statics.field647;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field438[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field865[var10] -= var4;
                    var9.field866[var10] -= var5;
                }
                var9.field861 -= var4 * 128;
                var9.field812 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field415[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field865[var13] -= var4;
                    var12.field866[var13] -= var5;
                }
                var12.field861 -= var4 * 128;
                var12.field812 -= var5 * 128;
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
                        field425[var24][var20][var21] = field425[var24][var22][var23];
                    } else {
                        field425[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field426.method3544(); var25 != null; var25 = (class17) field426.method3538()) {
            var25.field234 -= var4;
            var25.field235 -= var5;
            if (var25.field234 < 0 || var25.field235 < 0 || var25.field234 >= 104 || var25.field235 >= 104) {
                var25.method3620();
            }
        }
        if (field526 != 0) {
            field526 -= var4;
            field353 -= var5;
        }
        field534 = 0;
        field540 = false;
        field329 = -1;
        field428.method3568();
        field427.method3568();
        for (int var26 = 0; var26 < 4; var26++) {
            field521[var26].method2261();
        }
    }

    @ObfuscatedName("ap.bb(ZB)V")
    public static final void method953(boolean arg0) {
        method1013();
        field550++;
        if (field550 < 50 && !arg0) {
            return;
        }
        field550 = 0;
        if (field435 || Statics.field213 == null) {
            return;
        }
        field338.method2622(94);
        try {
            Statics.field213.method2840(field338.field1986, 0, field338.field1988);
            field338.field1988 = 0;
        } catch (IOException var2) {
            field435 = true;
        }
    }

    @ObfuscatedName("fx.bf(B)V")
    public static final void method3146() {
        method953(false);
        field350 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field195.length; var1++) {
            if (Statics.field2247[var1] != -1 && Statics.field195[var1] == null) {
                Statics.field195[var1] = Statics.field1757.method3050(Statics.field2247[var1], 0);
                if (Statics.field195[var1] == null) {
                    var0 = false;
                    field350++;
                }
            }
            if (Statics.field2002[var1] != -1 && Statics.field1141[var1] == null) {
                Statics.field1141[var1] = Statics.field1757.method3051(Statics.field2002[var1], 0, Statics.field2921[var1]);
                if (Statics.field1141[var1] == null) {
                    var0 = false;
                    field350++;
                }
            }
        }
        if (!var0) {
            field463 = 1;
            return;
        }
        field352 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field195.length; var3++) {
            byte[] var4 = Statics.field1141[var3];
            if (var4 != null) {
                int var5 = (Statics.field2645[var3] >> 8) * 64 - Statics.field233;
                int var6 = (Statics.field2645[var3] & 0xFF) * 64 - Statics.field647;
                if (field356) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method939(var4, var5, var6);
            }
        }
        if (!var2) {
            field463 = 2;
            return;
        }
        if (field463 != 0) {
            method2447(class157.field2307 + class2.field14 + class2.field17 + 100 + "%" + class2.field18, true);
        }
        method1013();
        method581();
        method1013();
        Statics.field136.method1792();
        method1013();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field521[var7].method2261();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field77[var8][var9][var10] = 0;
                }
            }
        }
        method1013();
        class6.field78 = 99;
        Statics.field79 = new byte[4][104][104];
        Statics.field76 = new byte[4][104][104];
        Statics.field81 = new byte[4][104][104];
        Statics.field1540 = new byte[4][104][104];
        Statics.field2912 = new int[4][105][105];
        Statics.field132 = new byte[4][105][105];
        Statics.field1386 = new int[105][105];
        Statics.field1964 = new int[104];
        Statics.field84 = new int[104];
        Statics.field1962 = new int[104];
        Statics.field254 = new int[104];
        Statics.field32 = new int[104];
        int var11 = Statics.field195.length;
        for (class24 var12 = (class24) class24.field610.method3544(); var12 != null; var12 = (class24) class24.field610.method3538()) {
            if (var12.field609 != null) {
                Statics.field256.method1138(var12.field609);
                var12.field609 = null;
            }
            if (var12.field620 != null) {
                Statics.field256.method1138(var12.field620);
                var12.field620 = null;
            }
        }
        class24.field610.method3568();
        method953(true);
        if (!field356) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field2645[var13] >> 8) * 64 - Statics.field233;
                int var15 = (Statics.field2645[var13] & 0xFF) * 64 - Statics.field647;
                byte[] var16 = Statics.field195[var13];
                if (var16 != null) {
                    method1013();
                    int var17 = Statics.field1073 * 8 - 48;
                    int var18 = Statics.field3111 * 8 - 48;
                    class108[] var19 = field521;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field1887[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class119 var23 = new class119(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                class6.method837(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (Statics.field2645[var27] >> 8) * 64 - Statics.field233;
                int var29 = (Statics.field2645[var27] & 0xFF) * 64 - Statics.field647;
                byte[] var30 = Statics.field195[var27];
                if (var30 == null && Statics.field3111 < 800) {
                    method1013();
                    class6.method2781(var28, var29, 64, 64);
                }
            }
            method953(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = Statics.field1141[var31];
                if (var32 != null) {
                    int var33 = (Statics.field2645[var31] >> 8) * 64 - Statics.field233;
                    int var34 = (Statics.field2645[var31] & 0xFF) * 64 - Statics.field647;
                    method1013();
                    class86 var35 = Statics.field136;
                    class108[] var36 = field521;
                    class119 var37 = new class119(var32);
                    int var38 = -1;
                    while (true) {
                        int var39 = var37.method2452();
                        if (var39 == 0) {
                            break;
                        }
                        var38 += var39;
                        int var40 = 0;
                        while (true) {
                            int var41 = var37.method2452();
                            if (var41 == 0) {
                                break;
                            }
                            var40 += var41 - 1;
                            int var42 = var40 & 0x3F;
                            int var43 = var40 >> 6 & 0x3F;
                            int var44 = var40 >> 12;
                            int var45 = var37.method2388();
                            int var46 = var45 >> 2;
                            int var47 = var45 & 0x3;
                            int var48 = var33 + var43;
                            int var49 = var34 + var42;
                            if (var48 > 0 && var49 > 0 && var48 < 103 && var49 < 103) {
                                int var50 = var44;
                                if ((class6.field77[1][var48][var49] & 0x2) == 2) {
                                    var50 = var44 - 1;
                                }
                                class108 var51 = null;
                                if (var50 >= 0) {
                                    var51 = var36[var50];
                                }
                                class6.method2984(var44, var48, var49, var38, var47, var46, var35, var51);
                            }
                        }
                    }
                }
            }
        }
        if (field356) {
            for (int var52 = 0; var52 < 4; var52++) {
                method1013();
                for (int var53 = 0; var53 < 13; var53++) {
                    for (int var54 = 0; var54 < 13; var54++) {
                        boolean var55 = false;
                        int var56 = field449[var52][var53][var54];
                        if (var56 != -1) {
                            int var57 = var56 >> 24 & 0x3;
                            int var58 = var56 >> 1 & 0x3;
                            int var59 = var56 >> 14 & 0x3FF;
                            int var60 = var56 >> 3 & 0x7FF;
                            int var61 = (var59 / 8 << 8) + var60 / 8;
                            for (int var62 = 0; var62 < Statics.field2645.length; var62++) {
                                if (Statics.field2645[var62] == var61 && Statics.field195[var62] != null) {
                                    class6.method184(Statics.field195[var62], var52, var53 * 8, var54 * 8, var57, (var59 & 0x7) * 8, (var60 & 0x7) * 8, var58, field521);
                                    var55 = true;
                                    break;
                                }
                            }
                        }
                        if (!var55) {
                            int var63 = var52;
                            int var64 = var53 * 8;
                            int var65 = var54 * 8;
                            for (int var66 = 0; var66 < 8; var66++) {
                                for (int var67 = 0; var67 < 8; var67++) {
                                    class6.field80[var63][var64 + var66][var65 + var67] = 0;
                                }
                            }
                            if (var64 > 0) {
                                for (int var68 = 1; var68 < 8; var68++) {
                                    class6.field80[var63][var64][var65 + var68] = class6.field80[var63][var64 - 1][var65 + var68];
                                }
                            }
                            if (var65 > 0) {
                                for (int var69 = 1; var69 < 8; var69++) {
                                    class6.field80[var63][var64 + var69][var65] = class6.field80[var63][var64 + var69][var65 - 1];
                                }
                            }
                            if (var64 > 0 && class6.field80[var63][var64 - 1][var65] != 0) {
                                class6.field80[var63][var64][var65] = class6.field80[var63][var64 - 1][var65];
                            } else if (var65 > 0 && class6.field80[var63][var64][var65 - 1] != 0) {
                                class6.field80[var63][var64][var65] = class6.field80[var63][var64][var65 - 1];
                            } else if (var64 > 0 && var65 > 0 && class6.field80[var63][var64 - 1][var65 - 1] != 0) {
                                class6.field80[var63][var64][var65] = class6.field80[var63][var64 - 1][var65 - 1];
                            }
                        }
                    }
                }
            }
            for (int var70 = 0; var70 < 13; var70++) {
                for (int var71 = 0; var71 < 13; var71++) {
                    int var72 = field449[0][var70][var71];
                    if (var72 == -1) {
                        class6.method2781(var70 * 8, var71 * 8, 8, 8);
                    }
                }
            }
            method953(true);
            for (int var73 = 0; var73 < 4; var73++) {
                method1013();
                for (int var74 = 0; var74 < 13; var74++) {
                    label940: for (int var75 = 0; var75 < 13; var75++) {
                        int var76 = field449[var73][var74][var75];
                        if (var76 != -1) {
                            int var77 = var76 >> 24 & 0x3;
                            int var78 = var76 >> 1 & 0x3;
                            int var79 = var76 >> 14 & 0x3FF;
                            int var80 = var76 >> 3 & 0x7FF;
                            int var81 = (var79 / 8 << 8) + var80 / 8;
                            for (int var82 = 0; var82 < Statics.field2645.length; var82++) {
                                if (Statics.field2645[var82] == var81 && Statics.field1141[var82] != null) {
                                    byte[] var83 = Statics.field1141[var82];
                                    int var84 = var74 * 8;
                                    int var85 = var75 * 8;
                                    int var86 = (var79 & 0x7) * 8;
                                    int var87 = (var80 & 0x7) * 8;
                                    class86 var88 = Statics.field136;
                                    class108[] var89 = field521;
                                    class119 var90 = new class119(var83);
                                    int var91 = -1;
                                    while (true) {
                                        int var92 = var90.method2452();
                                        if (var92 == 0) {
                                            continue label940;
                                        }
                                        var91 += var92;
                                        int var93 = 0;
                                        while (true) {
                                            int var94 = var90.method2452();
                                            if (var94 == 0) {
                                                break;
                                            }
                                            var93 += var94 - 1;
                                            int var95 = var93 & 0x3F;
                                            int var96 = var93 >> 6 & 0x3F;
                                            int var97 = var93 >> 12;
                                            int var98 = var90.method2388();
                                            int var99 = var98 >> 2;
                                            int var100 = var98 & 0x3;
                                            if (var77 == var97 && var96 >= var86 && var96 < var86 + 8 && var95 >= var87 && var95 < var87 + 8) {
                                                class41 var101 = class41.method2705(var91);
                                                int var102 = var84 + class177.method2972(var96 & 0x7, var95 & 0x7, var78, var101.field969, var101.field952, var100);
                                                int var104 = var96 & 0x7;
                                                int var105 = var95 & 0x7;
                                                int var107 = var101.field969;
                                                int var108 = var101.field952;
                                                if ((var100 & 0x1) == 1) {
                                                    int var109 = var107;
                                                    var107 = var108;
                                                    var108 = var109;
                                                }
                                                int var110 = var78 & 0x3;
                                                int var111;
                                                if (var110 == 0) {
                                                    var111 = var105;
                                                } else if (var110 == 1) {
                                                    var111 = 7 - var104 - (var107 - 1);
                                                } else if (var110 == 2) {
                                                    var111 = 7 - var105 - (var108 - 1);
                                                } else {
                                                    var111 = var104;
                                                }
                                                int var112 = var85 + var111;
                                                if (var102 > 0 && var112 > 0 && var102 < 103 && var112 < 103) {
                                                    int var113 = var73;
                                                    if ((class6.field77[1][var102][var112] & 0x2) == 2) {
                                                        var113 = var73 - 1;
                                                    }
                                                    class108 var114 = null;
                                                    if (var113 >= 0) {
                                                        var114 = var89[var113];
                                                    }
                                                    class6.method2984(var73, var102, var112, var91, var78 + var100 & 0x3, var99, var88, var114);
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
        method953(true);
        method581();
        method1013();
        class86 var115 = Statics.field136;
        class108[] var116 = field521;
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 < 104; var118++) {
                for (int var119 = 0; var119 < 104; var119++) {
                    if ((class6.field77[var117][var118][var119] & 0x1) == 1) {
                        int var120 = var117;
                        if ((class6.field77[1][var118][var119] & 0x2) == 2) {
                            var120 = var117 - 1;
                        }
                        if (var120 >= 0) {
                            var116[var120].method2264(var118, var119);
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
        class6.field90 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field90 < -16) {
            class6.field90 = -16;
        }
        if (class6.field90 > 16) {
            class6.field90 = 16;
        }
        for (int var121 = 0; var121 < 4; var121++) {
            byte[][] var122 = Statics.field132[var121];
            int var123 = (int) Math.sqrt(5100.0D);
            int var124 = var123 * 768 >> 8;
            for (int var125 = 1; var125 < 103; var125++) {
                for (int var126 = 1; var126 < 103; var126++) {
                    int var127 = class6.field80[var121][var126 + 1][var125] - class6.field80[var121][var126 - 1][var125];
                    int var128 = class6.field80[var121][var126][var125 + 1] - class6.field80[var121][var126][var125 - 1];
                    int var129 = (int) Math.sqrt((double) (var128 * var128 + var127 * var127 + 65536));
                    int var130 = (var127 << 8) / var129;
                    int var131 = 65536 / var129;
                    int var132 = (var128 << 8) / var129;
                    int var133 = (var132 * -50 + var130 * -50 + var131 * -10) / var124 + 96;
                    int var134 = (var122[var126][var125] >> 1) + (var122[var126][var125 + 1] >> 3) + (var122[var126][var125 - 1] >> 2) + (var122[var126 - 1][var125] >> 2) + (var122[var126 + 1][var125] >> 3);
                    Statics.field1386[var126][var125] = var133 - var134;
                }
            }
            for (int var135 = 0; var135 < 104; var135++) {
                Statics.field1964[var135] = 0;
                Statics.field84[var135] = 0;
                Statics.field1962[var135] = 0;
                Statics.field254[var135] = 0;
                Statics.field32[var135] = 0;
            }
            for (int var136 = -5; var136 < 109; var136++) {
                for (int var137 = 0; var137 < 104; var137++) {
                    int var138 = var136 + 5;
                    int var10002;
                    if (var138 >= 0 && var138 < 104) {
                        int var139 = Statics.field79[var121][var138][var137] & 0xFF;
                        if (var139 > 0) {
                            class42 var140 = class42.method750(var139 - 1);
                            Statics.field1964[var137] += var140.field976;
                            Statics.field84[var137] += var140.field974;
                            Statics.field1962[var137] += var140.field975;
                            Statics.field254[var137] += var140.field972;
                            var10002 = Statics.field32[var137]++;
                        }
                    }
                    int var141 = var136 - 5;
                    if (var141 >= 0 && var141 < 104) {
                        int var142 = Statics.field79[var121][var141][var137] & 0xFF;
                        if (var142 > 0) {
                            class42 var143 = class42.method750(var142 - 1);
                            Statics.field1964[var137] -= var143.field976;
                            Statics.field84[var137] -= var143.field974;
                            Statics.field1962[var137] -= var143.field975;
                            Statics.field254[var137] -= var143.field972;
                            var10002 = Statics.field32[var137]--;
                        }
                    }
                }
                if (var136 >= 1 && var136 < 103) {
                    int var144 = 0;
                    int var145 = 0;
                    int var146 = 0;
                    int var147 = 0;
                    int var148 = 0;
                    for (int var149 = -5; var149 < 109; var149++) {
                        int var150 = var149 + 5;
                        if (var150 >= 0 && var150 < 104) {
                            var144 += Statics.field1964[var150];
                            var145 += Statics.field84[var150];
                            var146 += Statics.field1962[var150];
                            var147 += Statics.field254[var150];
                            var148 += Statics.field32[var150];
                        }
                        int var151 = var149 - 5;
                        if (var151 >= 0 && var151 < 104) {
                            var144 -= Statics.field1964[var151];
                            var145 -= Statics.field84[var151];
                            var146 -= Statics.field1962[var151];
                            var147 -= Statics.field254[var151];
                            var148 -= Statics.field32[var151];
                        }
                        if (var149 >= 1 && var149 < 103 && (!field300 || (class6.field77[0][var136][var149] & 0x2) != 0 || (class6.field77[var121][var136][var149] & 0x10) == 0)) {
                            if (var121 < class6.field78) {
                                class6.field78 = var121;
                            }
                            int var152 = Statics.field79[var121][var136][var149] & 0xFF;
                            int var153 = Statics.field76[var121][var136][var149] & 0xFF;
                            if (var152 > 0 || var153 > 0) {
                                int var154 = class6.field80[var121][var136][var149];
                                int var155 = class6.field80[var121][var136 + 1][var149];
                                int var156 = class6.field80[var121][var136 + 1][var149 + 1];
                                int var157 = class6.field80[var121][var136][var149 + 1];
                                int var158 = Statics.field1386[var136][var149];
                                int var159 = Statics.field1386[var136 + 1][var149];
                                int var160 = Statics.field1386[var136 + 1][var149 + 1];
                                int var161 = Statics.field1386[var136][var149 + 1];
                                int var162 = -1;
                                int var163 = -1;
                                if (var152 > 0) {
                                    int var164 = var144 * 256 / var147;
                                    int var165 = var145 / var148;
                                    int var166 = var146 / var148;
                                    var162 = class6.method1260(var164, var165, var166);
                                    int var167 = class6.field89 + var164 & 0xFF;
                                    int var168 = class6.field90 + var166;
                                    if (var168 < 0) {
                                        var168 = 0;
                                    } else if (var168 > 255) {
                                        var168 = 255;
                                    }
                                    var163 = class6.method1260(var167, var165, var168);
                                }
                                if (var121 > 0) {
                                    boolean var169 = true;
                                    if (var152 == 0 && Statics.field81[var121][var136][var149] != 0) {
                                        var169 = false;
                                    }
                                    if (var153 > 0) {
                                        int var170 = var153 - 1;
                                        class47 var171 = (class47) class47.field1053.method3478((long) var170);
                                        class47 var172;
                                        if (var171 == null) {
                                            byte[] var173 = Statics.field1029.method3050(4, var170);
                                            class47 var174 = new class47();
                                            if (var173 != null) {
                                                var174.method959(new class119(var173), var170);
                                            }
                                            var174.method958();
                                            class47.field1053.method3479(var174, (long) var170);
                                            var172 = var174;
                                        } else {
                                            var172 = var171;
                                        }
                                        if (!var172.field1046) {
                                            var169 = false;
                                        }
                                    }
                                    if (var169 && var154 == var155 && var154 == var156 && var154 == var157) {
                                        Statics.field2912[var121][var136][var149] |= 0x924;
                                    }
                                }
                                int var175 = 0;
                                if (var163 != -1) {
                                    var175 = class91.field1563[class6.method145(var163, 96)];
                                }
                                if (var153 == 0) {
                                    var115.method1797(var121, var136, var149, 0, 0, -1, var154, var155, var156, var157, class6.method145(var162, var158), class6.method145(var162, var159), class6.method145(var162, var160), class6.method145(var162, var161), 0, 0, 0, 0, var175, 0);
                                } else {
                                    int var176 = Statics.field81[var121][var136][var149] + 1;
                                    byte var177 = Statics.field1540[var121][var136][var149];
                                    int var178 = var153 - 1;
                                    class47 var179 = (class47) class47.field1053.method3478((long) var178);
                                    class47 var180;
                                    if (var179 == null) {
                                        byte[] var181 = Statics.field1029.method3050(4, var178);
                                        class47 var182 = new class47();
                                        if (var181 != null) {
                                            var182.method959(new class119(var181), var178);
                                        }
                                        var182.method958();
                                        class47.field1053.method3479(var182, (long) var178);
                                        var180 = var182;
                                    } else {
                                        var180 = var179;
                                    }
                                    int var184 = var180.field1047;
                                    int var185;
                                    int var186;
                                    if (var184 >= 0) {
                                        var185 = Statics.field1564.method2039(var184);
                                        var186 = -1;
                                    } else if (var180.field1044 == 16711935) {
                                        var186 = -2;
                                        var184 = -1;
                                        var185 = -2;
                                    } else {
                                        var186 = class6.method1260(var180.field1048, var180.field1049, var180.field1050);
                                        int var187 = class6.field89 + var180.field1048 & 0xFF;
                                        int var188 = class6.field90 + var180.field1050;
                                        if (var188 < 0) {
                                            var188 = 0;
                                        } else if (var188 > 255) {
                                            var188 = 255;
                                        }
                                        var185 = class6.method1260(var187, var180.field1049, var188);
                                    }
                                    int var189 = 0;
                                    if (var185 != -2) {
                                        var189 = class91.field1563[Statics.method712(var185, 96)];
                                    }
                                    if (var180.field1045 != -1) {
                                        int var190 = class6.field89 + var180.field1054 & 0xFF;
                                        int var191 = class6.field90 + var180.field1051;
                                        if (var191 < 0) {
                                            var191 = 0;
                                        } else if (var191 > 255) {
                                            var191 = 255;
                                        }
                                        int var192 = class6.method1260(var190, var180.field1052, var191);
                                        var189 = class91.field1563[Statics.method712(var192, 96)];
                                    }
                                    var115.method1797(var121, var136, var149, var176, var177, var184, var154, var155, var156, var157, class6.method145(var162, var158), class6.method145(var162, var159), class6.method145(var162, var160), class6.method145(var162, var161), Statics.method712(var186, var158), Statics.method712(var186, var159), Statics.method712(var186, var160), Statics.method712(var186, var161), var175, var189);
                                }
                            }
                        }
                    }
                }
            }
            for (int var193 = 1; var193 < 103; var193++) {
                for (int var194 = 1; var194 < 103; var194++) {
                    var115.method1796(var121, var194, var193, class6.method2678(var121, var194, var193));
                }
            }
            Statics.field79[var121] = (byte[][]) null;
            Statics.field76[var121] = (byte[][]) null;
            Statics.field81[var121] = (byte[][]) null;
            Statics.field1540[var121] = (byte[][]) null;
            Statics.field132[var121] = (byte[][]) null;
        }
        var115.method1843(-50, -10, -50);
        for (int var195 = 0; var195 < 104; var195++) {
            for (int var196 = 0; var196 < 104; var196++) {
                if ((class6.field77[1][var195][var196] & 0x2) == 2) {
                    var115.method1794(var195, var196);
                }
            }
        }
        int var197 = 1;
        int var198 = 2;
        int var199 = 4;
        for (int var200 = 0; var200 < 4; var200++) {
            if (var200 > 0) {
                var197 <<= 0x3;
                var198 <<= 0x3;
                var199 <<= 0x3;
            }
            for (int var201 = 0; var201 <= var200; var201++) {
                for (int var202 = 0; var202 <= 104; var202++) {
                    for (int var203 = 0; var203 <= 104; var203++) {
                        if ((Statics.field2912[var201][var203][var202] & var197) != 0) {
                            int var204 = var202;
                            int var205 = var202;
                            int var206 = var201;
                            int var207 = var201;
                            while (var204 > 0 && (Statics.field2912[var201][var203][var204 - 1] & var197) != 0) {
                                var204--;
                            }
                            while (var205 < 104 && (Statics.field2912[var201][var203][var205 + 1] & var197) != 0) {
                                var205++;
                            }
                            label675: while (var206 > 0) {
                                for (int var208 = var204; var208 <= var205; var208++) {
                                    if ((Statics.field2912[var206 - 1][var203][var208] & var197) == 0) {
                                        break label675;
                                    }
                                }
                                var206--;
                            }
                            label664: while (var207 < var200) {
                                for (int var209 = var204; var209 <= var205; var209++) {
                                    if ((Statics.field2912[var207 + 1][var203][var209] & var197) == 0) {
                                        break label664;
                                    }
                                }
                                var207++;
                            }
                            int var210 = (var207 + 1 - var206) * (var205 - var204 + 1);
                            if (var210 >= 8) {
                                short var211 = 240;
                                int var212 = class6.field80[var207][var203][var204] - var211;
                                int var213 = class6.field80[var206][var203][var204];
                                class86.method1795(var200, 1, var203 * 128, var203 * 128, var204 * 128, var205 * 128 + 128, var212, var213);
                                for (int var214 = var206; var214 <= var207; var214++) {
                                    for (int var215 = var204; var215 <= var205; var215++) {
                                        Statics.field2912[var214][var203][var215] &= ~var197;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2912[var201][var203][var202] & var198) != 0) {
                            int var216 = var203;
                            int var217 = var203;
                            int var218 = var201;
                            int var219 = var201;
                            while (var216 > 0 && (Statics.field2912[var201][var216 - 1][var202] & var198) != 0) {
                                var216--;
                            }
                            while (var217 < 104 && (Statics.field2912[var201][var217 + 1][var202] & var198) != 0) {
                                var217++;
                            }
                            label728: while (var218 > 0) {
                                for (int var220 = var216; var220 <= var217; var220++) {
                                    if ((Statics.field2912[var218 - 1][var220][var202] & var198) == 0) {
                                        break label728;
                                    }
                                }
                                var218--;
                            }
                            label717: while (var219 < var200) {
                                for (int var221 = var216; var221 <= var217; var221++) {
                                    if ((Statics.field2912[var219 + 1][var221][var202] & var198) == 0) {
                                        break label717;
                                    }
                                }
                                var219++;
                            }
                            int var222 = (var219 + 1 - var218) * (var217 - var216 + 1);
                            if (var222 >= 8) {
                                short var223 = 240;
                                int var224 = class6.field80[var219][var216][var202] - var223;
                                int var225 = class6.field80[var218][var216][var202];
                                class86.method1795(var200, 2, var216 * 128, var217 * 128 + 128, var202 * 128, var202 * 128, var224, var225);
                                for (int var226 = var218; var226 <= var219; var226++) {
                                    for (int var227 = var216; var227 <= var217; var227++) {
                                        Statics.field2912[var226][var227][var202] &= ~var198;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2912[var201][var203][var202] & var199) != 0) {
                            int var228 = var203;
                            int var229 = var203;
                            int var230 = var202;
                            int var231 = var202;
                            while (var230 > 0 && (Statics.field2912[var201][var203][var230 - 1] & var199) != 0) {
                                var230--;
                            }
                            while (var231 < 104 && (Statics.field2912[var201][var203][var231 + 1] & var199) != 0) {
                                var231++;
                            }
                            label781: while (var228 > 0) {
                                for (int var232 = var230; var232 <= var231; var232++) {
                                    if ((Statics.field2912[var201][var228 - 1][var232] & var199) == 0) {
                                        break label781;
                                    }
                                }
                                var228--;
                            }
                            label770: while (var229 < 104) {
                                for (int var233 = var230; var233 <= var231; var233++) {
                                    if ((Statics.field2912[var201][var229 + 1][var233] & var199) == 0) {
                                        break label770;
                                    }
                                }
                                var229++;
                            }
                            if ((var229 - var228 + 1) * (var231 - var230 + 1) >= 4) {
                                int var234 = class6.field80[var201][var228][var230];
                                class86.method1795(var200, 4, var228 * 128, var229 * 128 + 128, var230 * 128, var231 * 128 + 128, var234, var234);
                                for (int var235 = var228; var235 <= var229; var235++) {
                                    for (int var236 = var230; var236 <= var231; var236++) {
                                        Statics.field2912[var201][var235][var236] &= ~var199;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method953(true);
        int var237 = class6.field78;
        if (var237 > Statics.field124) {
            var237 = Statics.field124;
        }
        if (var237 < Statics.field124 - 1) {
            int var238 = Statics.field124 - 1;
        }
        if (field300) {
            Statics.field136.method1793(class6.field78);
        } else {
            Statics.field136.method1793(0);
        }
        for (int var239 = 0; var239 < 104; var239++) {
            for (int var240 = 0; var240 < 104; var240++) {
                method563(var239, var240);
            }
        }
        method1013();
        method6();
        class41.field923.method3481();
        if (Statics.field2022 != null) {
            field338.method2622(167);
            field338.method2376(1057001181);
        }
        if (!field356) {
            int var241 = (Statics.field1073 - 6) / 8;
            int var242 = (Statics.field1073 + 6) / 8;
            int var243 = (Statics.field3111 - 6) / 8;
            int var244 = (Statics.field3111 + 6) / 8;
            for (int var245 = var241 - 1; var245 <= var242 + 1; var245++) {
                for (int var246 = var243 - 1; var246 <= var244 + 1; var246++) {
                    if (var245 < var241 || var245 > var242 || var246 < var243 || var246 > var244) {
                        Statics.field1757.method3069("m" + var245 + "_" + var246);
                        Statics.field1757.method3069("l" + var245 + "_" + var246);
                    }
                }
            }
        }
        method2162(30);
        method1013();
        Statics.field79 = (byte[][][]) null;
        Statics.field76 = (byte[][][]) null;
        Statics.field81 = (byte[][][]) null;
        Statics.field1540 = (byte[][][]) null;
        Statics.field2912 = (int[][][]) null;
        Statics.field132 = (byte[][][]) null;
        Statics.field1386 = (int[][]) null;
        Statics.field1964 = null;
        Statics.field84 = null;
        Statics.field1962 = null;
        Statics.field254 = null;
        Statics.field32 = null;
        field338.method2622(37);
        class144.method48();
    }

    @ObfuscatedName("m.bv(IIIIII)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field136.method1850(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field136.method1821(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1090.field1401;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2705(var12);
            if (var13.field949 == -1) {
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
                class81 var14 = Statics.field1337[var13.field949];
                if (var14 != null) {
                    int var15 = (var13.field969 * 4 - var14.field1411) / 2;
                    int var16 = (var13.field952 * 4 - var14.field1416) / 2;
                    var14.method1761(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field952) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field136.method1877(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field136.method1821(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2705(var21);
            if (var22.field949 != -1) {
                class81 var23 = Statics.field1337[var22.field949];
                if (var23 != null) {
                    int var24 = (var22.field969 * 4 - var23.field1411) / 2;
                    int var25 = (var22.field952 * 4 - var23.field1416) / 2;
                    var23.method1761(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field952) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1090.field1401;
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
        int var29 = Statics.field136.method1820(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2705(var30);
        if (var31.field949 == -1) {
            return;
        }
        class81 var32 = Statics.field1337[var31.field949];
        if (var32 != null) {
            int var33 = (var31.field969 * 4 - var32.field1411) / 2;
            int var34 = (var31.field952 * 4 - var32.field1416) / 2;
            var32.method1761(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field952) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ad.bs(B)V")
    public static final void method640() {
        if (field342 == 148) {
            int var0 = field411.method2440();
            int var1 = field411.method2513();
            int var2 = (var1 >> 4 & 0x7) + Statics.field1784;
            int var3 = (var1 & 0x7) + Statics.field282;
            int var4 = field411.method2425();
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class29 var5 = new class29();
                var5.field689 = var0;
                var5.field684 = var4;
                if (field425[Statics.field124][var2][var3] == null) {
                    field425[Statics.field124][var2][var3] = new class199();
                }
                field425[Statics.field124][var2][var3].method3567(var5);
                method563(var2, var3);
            }
        } else if (field342 == 53) {
            int var6 = field411.method2388();
            int var7 = (var6 >> 4 & 0x7) + Statics.field1784;
            int var8 = (var6 & 0x7) + Statics.field282;
            int var9 = field411.method2440();
            int var10 = field411.method2388();
            int var11 = field411.method2440();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                int var12 = var7 * 128 + 64;
                int var13 = var8 * 128 + 64;
                class30 var14 = new class30(var9, Statics.field124, var12, var13, method881(var12, var13, Statics.field124) - var10, var11, field548);
                field428.method3567(var14);
            }
        } else {
            if (field342 == 207) {
                int var15 = field411.method2424();
                int var16 = field411.method2440();
                byte var17 = field411.method2418();
                byte var18 = field411.method2418();
                int var19 = field411.method2390();
                byte var20 = field411.method2546();
                byte var21 = field411.method2417();
                int var22 = field411.method2440();
                int var23 = field411.method2388();
                int var24 = var23 >> 2;
                int var25 = var23 & 0x3;
                int var26 = field414[var24];
                int var27 = field411.method2415();
                int var28 = (var27 >> 4 & 0x7) + Statics.field1784;
                int var29 = (var27 & 0x7) + Statics.field282;
                class3 var30;
                if (field416 == var19) {
                    var30 = Statics.field143;
                } else {
                    var30 = field415[var19];
                }
                if (var30 != null) {
                    class41 var31 = class41.method2705(var15);
                    int var32;
                    int var33;
                    if (var25 == 1 || var25 == 3) {
                        var32 = var31.field952;
                        var33 = var31.field969;
                    } else {
                        var32 = var31.field969;
                        var33 = var31.field952;
                    }
                    int var34 = (var32 >> 1) + var28;
                    int var35 = (var32 + 1 >> 1) + var28;
                    int var36 = (var33 >> 1) + var29;
                    int var37 = (var33 + 1 >> 1) + var29;
                    int[][] var38 = class6.field80[Statics.field124];
                    int var39 = var38[var34][var36] + var38[var35][var36] + var38[var34][var37] + var38[var35][var37] >> 2;
                    int var40 = (var28 << 7) + (var32 << 6);
                    int var41 = (var29 << 7) + (var33 << 6);
                    class105 var42 = var31.method803(var24, var25, var38, var40, var39, var41);
                    if (var42 != null) {
                        method2923(Statics.field124, var28, var29, var26, -1, 0, 0, var22 + 1, var16 + 1);
                        var30.field50 = field548 + var22;
                        var30.field36 = field548 + var16;
                        var30.field46 = var42;
                        var30.field43 = var28 * 128 + var32 * 64;
                        var30.field45 = var29 * 128 + var33 * 64;
                        var30.field44 = var39;
                        if (var17 > var20) {
                            byte var43 = var17;
                            var17 = var20;
                            var20 = var43;
                        }
                        if (var18 > var21) {
                            byte var44 = var18;
                            var18 = var21;
                            var21 = var44;
                        }
                        var30.field33 = var17 + var28;
                        var30.field49 = var20 + var28;
                        var30.field41 = var18 + var29;
                        var30.field37 = var21 + var29;
                    }
                }
            }
            if (field342 == 103) {
                int var45 = field411.method2388();
                int var46 = (var45 >> 4 & 0x7) + Statics.field1784;
                int var47 = (var45 & 0x7) + Statics.field282;
                int var48 = var46 + field411.method2389();
                int var49 = var47 + field411.method2389();
                int var50 = field411.method2391();
                int var51 = field411.method2440();
                int var52 = field411.method2388() * 4;
                int var53 = field411.method2388() * 4;
                int var54 = field411.method2440();
                int var55 = field411.method2440();
                int var56 = field411.method2388();
                int var57 = field411.method2388();
                if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104 && var51 != 65535) {
                    int var58 = var46 * 128 + 64;
                    int var59 = var47 * 128 + 64;
                    int var60 = var48 * 128 + 64;
                    int var61 = var49 * 128 + 64;
                    class7 var62 = new class7(var51, Statics.field124, var58, var59, method881(var58, var59, Statics.field124) - var52, field548 + var54, field548 + var55, var56, var57, var50, var53);
                    var62.method91(var60, var61, method881(var60, var61, Statics.field124) - var53, field548 + var54);
                    field427.method3567(var62);
                }
            } else {
                if (field342 == 116) {
                    int var63 = field411.method2388();
                    int var64 = (var63 >> 4 & 0x7) + Statics.field1784;
                    int var65 = (var63 & 0x7) + Statics.field282;
                    int var66 = field411.method2440();
                    int var67 = field411.method2388();
                    int var68 = var67 >> 4 & 0xF;
                    int var69 = var67 & 0x7;
                    int var70 = field411.method2388();
                    if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                        int var71 = var68 + 1;
                        if (Statics.field143.field865[0] >= var64 - var71 && Statics.field143.field865[0] <= var64 + var71 && Statics.field143.field866[0] >= var65 - var71 && Statics.field143.field866[0] <= var65 + var71 && field533 != 0 && var69 > 0 && field534 < 50) {
                            field535[field534] = var66;
                            field536[field534] = var69;
                            field312[field534] = var70;
                            field322[field534] = null;
                            field538[field534] = (var64 << 16) + (var65 << 8) + var68;
                            field534++;
                        }
                    }
                }
                if (field342 == 12) {
                    int var72 = field411.method2440();
                    int var73 = field411.method2513();
                    int var74 = var73 >> 2;
                    int var75 = var73 & 0x3;
                    int var76 = field414[var74];
                    int var77 = field411.method2550();
                    int var78 = (var77 >> 4 & 0x7) + Statics.field1784;
                    int var79 = (var77 & 0x7) + Statics.field282;
                    if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                        method2923(Statics.field124, var78, var79, var76, var72, var74, var75, 0, -1);
                    }
                } else if (field342 == 26) {
                    int var80 = field411.method2550();
                    int var81 = var80 >> 2;
                    int var82 = var80 & 0x3;
                    int var83 = field414[var81];
                    int var84 = field411.method2424();
                    int var85 = field411.method2513();
                    int var86 = (var85 >> 4 & 0x7) + Statics.field1784;
                    int var87 = (var85 & 0x7) + Statics.field282;
                    if (var86 >= 0 && var87 >= 0 && var86 < 103 && var87 < 103) {
                        if (var83 == 0) {
                            class87 var88 = Statics.field136.method1813(Statics.field124, var86, var87);
                            if (var88 != null) {
                                int var89 = var88.field1516 >> 14 & 0x7FFF;
                                if (var81 == 2) {
                                    var88.field1511 = new class13(var89, 2, var82 + 4, Statics.field124, var86, var87, var84, false, var88.field1511);
                                    var88.field1512 = new class13(var89, 2, var82 + 1 & 0x3, Statics.field124, var86, var87, var84, false, var88.field1512);
                                } else {
                                    var88.field1511 = new class13(var89, var81, var82, Statics.field124, var86, var87, var84, false, var88.field1511);
                                }
                            }
                        }
                        if (var83 == 1) {
                            class94 var90 = Statics.field136.method1853(Statics.field124, var86, var87);
                            if (var90 != null) {
                                int var91 = var90.field1586 >> 14 & 0x7FFF;
                                if (var81 == 4 || var81 == 5) {
                                    var90.field1585 = new class13(var91, 4, var82, Statics.field124, var86, var87, var84, false, var90.field1585);
                                } else if (var81 == 6) {
                                    var90.field1585 = new class13(var91, 4, var82 + 4, Statics.field124, var86, var87, var84, false, var90.field1585);
                                } else if (var81 == 7) {
                                    var90.field1585 = new class13(var91, 4, (var82 + 2 & 0x3) + 4, Statics.field124, var86, var87, var84, false, var90.field1585);
                                } else if (var81 == 8) {
                                    var90.field1585 = new class13(var91, 4, var82 + 4, Statics.field124, var86, var87, var84, false, var90.field1585);
                                    var90.field1589 = new class13(var91, 4, (var82 + 2 & 0x3) + 4, Statics.field124, var86, var87, var84, false, var90.field1589);
                                }
                            }
                        }
                        if (var83 == 2) {
                            class98 var92 = Statics.field136.method1815(Statics.field124, var86, var87);
                            if (var81 == 11) {
                                var81 = 10;
                            }
                            if (var92 != null) {
                                var92.field1651 = new class13(var92.field1637 >> 14 & 0x7FFF, var81, var82, Statics.field124, var86, var87, var84, false, var92.field1651);
                            }
                        }
                        if (var83 == 3) {
                            class93 var93 = Statics.field136.method1816(Statics.field124, var86, var87);
                            if (var93 != null) {
                                var93.field1576 = new class13(var93.field1569 >> 14 & 0x7FFF, 22, var82, Statics.field124, var86, var87, var84, false, var93.field1576);
                            }
                        }
                    }
                } else if (field342 == 228) {
                    int var94 = field411.method2388();
                    int var95 = (var94 >> 4 & 0x7) + Statics.field1784;
                    int var96 = (var94 & 0x7) + Statics.field282;
                    int var97 = field411.method2440();
                    int var98 = field411.method2440();
                    int var99 = field411.method2440();
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        class199 var100 = field425[Statics.field124][var95][var96];
                        if (var100 != null) {
                            for (class29 var101 = (class29) var100.method3544(); var101 != null; var101 = (class29) var100.method3538()) {
                                if ((var97 & 0x7FFF) == var101.field689 && var101.field684 == var98) {
                                    var101.field684 = var99;
                                    break;
                                }
                            }
                            method563(var95, var96);
                        }
                    }
                } else if (field342 == 50) {
                    int var102 = field411.method2513();
                    int var103 = (var102 >> 4 & 0x7) + Statics.field1784;
                    int var104 = (var102 & 0x7) + Statics.field282;
                    int var105 = field411.method2440();
                    if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                        class199 var106 = field425[Statics.field124][var103][var104];
                        if (var106 != null) {
                            for (class29 var107 = (class29) var106.method3544(); var107 != null; var107 = (class29) var106.method3538()) {
                                if ((var105 & 0x7FFF) == var107.field689) {
                                    var107.method3620();
                                    break;
                                }
                            }
                            if (var106.method3544() == null) {
                                field425[Statics.field124][var103][var104] = null;
                            }
                            method563(var103, var104);
                        }
                    }
                } else if (field342 == 48) {
                    int var108 = field411.method2415();
                    int var109 = var108 >> 2;
                    int var110 = var108 & 0x3;
                    int var111 = field414[var109];
                    int var112 = field411.method2513();
                    int var113 = (var112 >> 4 & 0x7) + Statics.field1784;
                    int var114 = (var112 & 0x7) + Statics.field282;
                    if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                        method2923(Statics.field124, var113, var114, var111, -1, var109, var110, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eq.br(IIIIIIIIII)V")
    public static final void method2923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field426.method3544(); var10 != null; var10 = (class17) field426.method3538()) {
            if (var10.field247 == arg0 && var10.field234 == arg1 && var10.field235 == arg2 && var10.field243 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field247 = arg0;
            var9.field243 = arg3;
            var9.field234 = arg1;
            var9.field235 = arg2;
            method840(var9);
            field426.method3567(var9);
        }
        var9.field239 = arg4;
        var9.field241 = arg5;
        var9.field242 = arg6;
        var9.field246 = arg7;
        var9.field245 = arg8;
    }

    @ObfuscatedName("e.bu(I)V")
    public static final void method6() {
        for (class17 var0 = (class17) field426.method3544(); var0 != null; var0 = (class17) field426.method3538()) {
            if (var0.field245 == -1) {
                var0.field246 = 0;
                method840(var0);
            } else {
                var0.method3620();
            }
        }
    }

    @ObfuscatedName("ac.bk(Lc;I)V")
    public static final void method840(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field243 == 0) {
            var1 = Statics.field136.method1850(arg0.field247, arg0.field234, arg0.field235);
        }
        if (arg0.field243 == 1) {
            var1 = Statics.field136.method1818(arg0.field247, arg0.field234, arg0.field235);
        }
        if (arg0.field243 == 2) {
            var1 = Statics.field136.method1877(arg0.field247, arg0.field234, arg0.field235);
        }
        if (arg0.field243 == 3) {
            var1 = Statics.field136.method1820(arg0.field247, arg0.field234, arg0.field235);
        }
        if (var1 != 0) {
            int var5 = Statics.field136.method1821(arg0.field247, arg0.field234, arg0.field235, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field236 = var2;
        arg0.field238 = var3;
        arg0.field237 = var4;
    }

    @ObfuscatedName("x.bc(I)V")
    public static final void method124() {
        for (class17 var0 = (class17) field426.method3544(); var0 != null; var0 = (class17) field426.method3538()) {
            if (var0.field245 > 0) {
                var0.field245--;
            }
            if (var0.field245 != 0) {
                if (var0.field246 > 0) {
                    var0.field246--;
                }
                if (var0.field246 == 0 && var0.field234 >= 1 && var0.field235 >= 1 && var0.field234 <= 102 && var0.field235 <= 102 && (var0.field239 < 0 || class6.method586(var0.field239, var0.field241))) {
                    method1963(var0.field247, var0.field243, var0.field234, var0.field235, var0.field239, var0.field242, var0.field241);
                    var0.field246 = -1;
                    if (var0.field239 == var0.field236 && var0.field236 == -1) {
                        var0.method3620();
                    } else if (var0.field239 == var0.field236 && var0.field242 == var0.field237 && var0.field241 == var0.field238) {
                        var0.method3620();
                    }
                }
            } else if (var0.field236 < 0 || class6.method586(var0.field236, var0.field238)) {
                method1963(var0.field247, var0.field243, var0.field234, var0.field235, var0.field236, var0.field237, var0.field238);
                var0.method3620();
            }
        }
    }

    @ObfuscatedName("cn.bn(IIIIIIII)V")
    public static final void method1963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field300 && Statics.field124 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field136.method1850(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field136.method1818(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field136.method1877(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field136.method1820(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field136.method1821(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field136.method1809(arg0, arg2, arg3);
                class41 var15 = class41.method2705(var12);
                if (var15.field937 != 0) {
                    field521[arg0].method2297(arg2, arg3, var13, var14, var15.field938);
                }
            }
            if (arg1 == 1) {
                Statics.field136.method1902(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field136.method1807(arg0, arg2, arg3);
                class41 var16 = class41.method2705(var12);
                if (var16.field969 + arg2 > 103 || var16.field969 + arg3 > 103 || var16.field952 + arg2 > 103 || var16.field952 + arg3 > 103) {
                    return;
                }
                if (var16.field937 != 0) {
                    field521[arg0].method2267(arg2, arg3, var16.field969, var16.field952, var14, var16.field938);
                }
            }
            if (arg1 == 3) {
                Statics.field136.method1811(arg0, arg2, arg3);
                class41 var17 = class41.method2705(var12);
                if (var17.field937 == 1) {
                    field521[arg0].method2263(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field77[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field136;
        class108 var20 = field521[arg0];
        class41 var21 = class41.method2705(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field952;
            var23 = var21.field969;
        } else {
            var22 = var21.field969;
            var23 = var21.field952;
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
        int[][] var28 = class6.field80[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field939 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field929 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field943 == -1 && var21.field961 == null) {
                var34 = var21.method803(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1798(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field937 == 1) {
                var20.method2265(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field943 == -1 && var21.field961 == null) {
                var57 = var21.method803(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1802(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field937 != 0) {
                var20.method2286(arg2, arg3, var22, var23, var21.field938);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field943 == -1 && var21.field961 == null) {
                var35 = var21.method803(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1802(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2286(arg2, arg3, var22, var23, var21.field938);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field943 == -1 && var21.field961 == null) {
                var36 = var21.method803(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1800(arg0, arg2, arg3, var29, var36, (class85) null, class6.field83[arg5], 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2262(arg2, arg3, arg6, arg5, var21.field938);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field943 == -1 && var21.field961 == null) {
                var37 = var21.method803(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1800(arg0, arg2, arg3, var29, var37, (class85) null, class6.field94[arg5], 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2262(arg2, arg3, arg6, arg5, var21.field938);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field943 == -1 && var21.field961 == null) {
                var39 = var21.method803(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method803(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field943, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1800(arg0, arg2, arg3, var29, var39, var40, class6.field83[arg5], class6.field83[var38], var32, var33);
            if (var21.field937 != 0) {
                var20.method2262(arg2, arg3, arg6, arg5, var21.field938);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field943 == -1 && var21.field961 == null) {
                var41 = var21.method803(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1800(arg0, arg2, arg3, var29, var41, (class85) null, class6.field94[arg5], 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2262(arg2, arg3, arg6, arg5, var21.field938);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field943 == -1 && var21.field961 == null) {
                var42 = var21.method803(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1802(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2286(arg2, arg3, var22, var23, var21.field938);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field943 == -1 && var21.field961 == null) {
                var43 = var21.method803(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1959(arg0, arg2, arg3, var29, var43, (class85) null, class6.field83[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1850(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method2705(var45 >> 14 & 0x7FFF).field944;
            }
            class85 var46;
            if (var21.field943 == -1 && var21.field961 == null) {
                var46 = var21.method803(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1959(arg0, arg2, arg3, var29, var46, (class85) null, class6.field83[arg5], 0, class6.field86[arg5] * var44, class6.field85[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1850(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method2705(var48 >> 14 & 0x7FFF).field944 / 2;
            }
            class85 var49;
            if (var21.field943 == -1 && var21.field961 == null) {
                var49 = var21.method803(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1959(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field87[arg5] * var47, class6.field88[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field943 == -1 && var21.field961 == null) {
                var51 = var21.method803(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1959(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1850(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method2705(var53 >> 14 & 0x7FFF).field944 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field943 == -1 && var21.field961 == null) {
                var55 = var21.method803(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method803(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field943, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field943, true, (class85) null);
            }
            var19.method1959(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field87[arg5] * var52, class6.field88[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("a.bl(III)V")
    public static final void method563(int arg0, int arg1) {
        class199 var2 = field425[Statics.field124][arg0][arg1];
        if (var2 == null) {
            Statics.field136.method1812(Statics.field124, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3544(); var6 != null; var6 = (class29) var2.method3538()) {
            class52 var7 = class52.method646(var6.field689);
            long var8 = (long) var7.field1112;
            if (var7.field1111 == 1) {
                var8 = (long) (var6.field684 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field136.method1812(Statics.field124, arg0, arg1);
            return;
        }
        var2.method3540(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3544(); var12 != null; var12 = (class29) var2.method3538()) {
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
        Statics.field136.method1960(Statics.field124, arg0, arg1, method881(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field124), var5, var13, var10, var11);
    }

    @ObfuscatedName("ax.by(ZB)V")
    public static final void method982(boolean arg0) {
        field430 = 0;
        field306 = 0;
        field411.method2624();
        int var1 = field411.method2625(8);
        if (var1 < field334) {
            for (int var2 = var1; var2 < field334; var2++) {
                field419[++field430 - 1] = field335[var2];
            }
        }
        if (var1 > field334) {
            throw new RuntimeException("");
        }
        field334 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field335[var3];
            class35 var5 = field438[var4];
            int var6 = field411.method2625(1);
            if (var6 == 0) {
                field335[++field334 - 1] = var4;
                var5.field859 = field548;
            } else {
                int var7 = field411.method2625(2);
                if (var7 == 0) {
                    field335[++field334 - 1] = var4;
                    var5.field859 = field548;
                    field337[++field306 - 1] = var4;
                } else if (var7 == 1) {
                    field335[++field334 - 1] = var4;
                    var5.field859 = field548;
                    int var8 = field411.method2625(3);
                    var5.method721(var8, (byte) 1);
                    int var9 = field411.method2625(1);
                    if (var9 == 1) {
                        field337[++field306 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field335[++field334 - 1] = var4;
                    var5.field859 = field548;
                    int var10 = field411.method2625(3);
                    var5.method721(var10, (byte) 2);
                    int var11 = field411.method2625(3);
                    var5.method721(var11, (byte) 2);
                    int var12 = field411.method2625(1);
                    if (var12 == 1) {
                        field337[++field306 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field419[++field430 - 1] = var4;
                }
            }
        }
        method666(arg0);
        method2276();
        for (int var13 = 0; var13 < field430; var13++) {
            int var14 = field419[var13];
            if (field548 != field438[var14].field859) {
                field438[var14].field782 = null;
                field438[var14] = null;
            }
        }
        if (field341 != field411.field1988) {
            throw new RuntimeException(field411.field1988 + class2.field15 + field341);
        }
        for (int var15 = 0; var15 < field334; var15++) {
            if (field438[field335[var15]] == null) {
                throw new RuntimeException(var15 + class2.field15 + field334);
            }
        }
    }

    @ObfuscatedName("ao.bh(ZI)V")
    public static final void method666(boolean arg0) {
        while (true) {
            if (field411.method2627(field341) >= 27) {
                int var1 = field411.method2625(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field438[var1] == null) {
                        field438[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field438[var1];
                    field335[++field334 - 1] = var1;
                    var3.field859 = field548;
                    int var4 = field411.method2625(1);
                    int var5 = field411.method2625(1);
                    if (var5 == 1) {
                        field337[++field306 - 1] = var1;
                    }
                    int var6 = field340[field411.method2625(3)];
                    if (var2) {
                        var3.field818 = var3.field813 = var6;
                    }
                    int var7;
                    if (arg0) {
                        var7 = field411.method2625(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field411.method2625(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8;
                    if (arg0) {
                        var8 = field411.method2625(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field411.method2625(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field782 = class40.method710(field411.method2625(14));
                    var3.field833 = var3.field782.field887;
                    var3.field863 = var3.field782.field910;
                    if (var3.field863 == 0) {
                        var3.field813 = 0;
                    }
                    var3.field819 = var3.field782.field893;
                    var3.field820 = var3.field782.field884;
                    var3.field821 = var3.field782.field916;
                    var3.field869 = var3.field782.field896;
                    var3.field816 = var3.field782.field890;
                    var3.field817 = var3.field782.field891;
                    var3.field858 = var3.field782.field917;
                    var3.method716(Statics.field143.field865[0] + var7, Statics.field143.field866[0] + var8, var4 == 1);
                    continue;
                }
            }
            field411.method2636();
            return;
        }
    }

    @ObfuscatedName("do.be(I)V")
    public static final void method2276() {
        for (int var0 = 0; var0 < field306; var0++) {
            int var1 = field337[var0];
            class35 var2 = field438[var1];
            int var3 = field411.method2388();
            if ((var3 & 0x8) != 0) {
                int var4 = field411.method2415();
                int var5 = field411.method2550();
                var2.method744(var4, var5, field548);
                var2.field836 = field548 + 300;
                var2.field834 = field411.method2390();
                var2.field835 = field411.method2424();
            }
            if ((var3 & 0x4) != 0) {
                int var6 = field411.method2440();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field411.method2415();
                if (var2.field842 == var6 && var6 != -1) {
                    int var8 = class43.method2304(var6).field997;
                    if (var8 == 1) {
                        var2.field824 = 0;
                        var2.field844 = 0;
                        var2.field845 = var7;
                        var2.field846 = 0;
                    }
                    if (var8 == 2) {
                        var2.field846 = 0;
                    }
                } else if (var6 == -1 || var2.field842 == -1 || class43.method2304(var6).field1001 >= class43.method2304(var2.field842).field1001) {
                    var2.field842 = var6;
                    var2.field824 = 0;
                    var2.field844 = 0;
                    var2.field845 = var7;
                    var2.field846 = 0;
                    var2.field847 = var2.field864;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field840 = field411.method2390();
                if (var2.field840 == 65535) {
                    var2.field840 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var9 = field411.method2388();
                int var10 = field411.method2415();
                var2.method744(var9, var10, field548);
                var2.field836 = field548 + 300;
                var2.field834 = field411.method2424();
                var2.field835 = field411.method2424();
            }
            if ((var3 & 0x2) != 0) {
                var2.field811 = field411.method2396();
                var2.field822 = 100;
            }
            if ((var3 & 0x20) != 0) {
                int var11 = field411.method2425();
                int var12 = field411.method2440();
                int var13 = var2.field861 - (var11 - Statics.field233 - Statics.field233) * 64;
                int var14 = var2.field812 - (var12 - Statics.field647 - Statics.field647) * 64;
                if (var13 != 0 || var14 != 0) {
                    var2.field828 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field782 = class40.method710(field411.method2440());
                var2.field833 = var2.field782.field887;
                var2.field863 = var2.field782.field910;
                var2.field819 = var2.field782.field893;
                var2.field820 = var2.field782.field884;
                var2.field821 = var2.field782.field916;
                var2.field869 = var2.field782.field896;
                var2.field816 = var2.field782.field890;
                var2.field817 = var2.field782.field891;
                var2.field858 = var2.field782.field917;
            }
            if ((var3 & 0x40) != 0) {
                var2.field871 = field411.method2440();
                int var15 = field411.method2504();
                var2.field851 = var15 >> 16;
                var2.field850 = (var15 & 0xFFFF) + field548;
                var2.field848 = 0;
                var2.field849 = 0;
                if (var2.field850 > field548) {
                    var2.field848 = -1;
                }
                if (var2.field871 == 65535) {
                    var2.field871 = -1;
                }
            }
        }
    }

    @ObfuscatedName("bo.bt(IIB)Ldv;")
    public static class107 method1533(int arg0, int arg1) {
        field380.field1871 = arg0;
        field380.field1872 = arg1;
        field380.field1867 = 1;
        field380.field1869 = 1;
        return field380;
    }

    @ObfuscatedName("et.bx(B)V")
    public static final void method2820() {
        int var0 = Statics.field1039;
        int var1 = Statics.field2688;
        int var2 = Statics.field1900;
        int var3 = Statics.field1352;
        int var4 = 6116423;
        class80.method1737(var0, var1, var2, var3, var4);
        class80.method1737(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1709(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field163.method3735(class157.field2305, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2151;
        int var6 = class140.field2152;
        for (int var7 = 0; var7 < field434; var7++) {
            int var8 = (field434 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field163.method3735(method736(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field1039;
        int var11 = Statics.field2688;
        int var12 = Statics.field1900;
        int var13 = Statics.field1352;
        for (int var14 = 0; var14 < field495; var14++) {
            if (field418[var14] + field304[var14] > var10 && field418[var14] < var10 + var12 && field501[var14] + field374[var14] > var11 && field501[var14] < var11 + var13) {
                field498[var14] = true;
            }
        }
    }

    @ObfuscatedName("z.bi(IIIIB)V")
    public static final void method149(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field495; var4++) {
            if (field418[var4] + field304[var4] > arg0 && field418[var4] < arg0 + arg2 && field501[var4] + field374[var4] > arg1 && field501[var4] < arg1 + arg3) {
                field497[var4] = true;
            }
        }
    }

    @ObfuscatedName("q.bm(B)V")
    public static final void method26() {
        method183();
        if (Statics.field1955 != null || field465 != null) {
            return;
        }
        int var12;
        int var13;
        label203: {
            int var0 = class140.field2162;
            if (field433) {
                if (var0 != 1 && (Statics.field592 || var0 != 4)) {
                    int var1 = class140.field2151;
                    int var2 = class140.field2152;
                    if (var1 < Statics.field1039 - 10 || var1 > Statics.field1900 + Statics.field1039 + 10 || var2 < Statics.field2688 - 10 || var2 > Statics.field2688 + Statics.field1352 + 10) {
                        field433 = false;
                        method149(Statics.field1039, Statics.field2688, Statics.field1900, Statics.field1352);
                    }
                }
                if (var0 == 1 || !Statics.field592 && var0 == 4) {
                    int var3 = Statics.field1039;
                    int var4 = Statics.field2688;
                    int var5 = Statics.field1900;
                    int var6 = class140.field2163;
                    int var7 = class140.field2159;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field434; var9++) {
                        int var10 = (field434 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method1591(var8);
                    }
                    field433 = false;
                    method149(Statics.field1039, Statics.field2688, Statics.field1900, Statics.field1352);
                }
            } else {
                if ((var0 == 1 || !Statics.field592 && var0 == 4) && field434 > 0) {
                    int var11 = field437[field434 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field410[field434 - 1];
                        var13 = field539[field434 - 1];
                        class173 var14 = class173.method793(var13);
                        int var15 = method46(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label203;
                        }
                        int var17 = method46(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (var18) {
                            break label203;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field592 && var0 == 4) && (field432 == 1 && field434 > 2 || method2973(field434 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field592 && var0 == 4) && field434 > 0) {
                    method1591(field434 - 1);
                }
                if (var0 == 2 && field434 > 0) {
                    method2309(class140.field2163, class140.field2159);
                }
            }
            return;
        }
        if (Statics.field1955 != null && !field299 && field432 != 1 && !method2973(field434 - 1) && field434 > 0) {
            method1783(field541, field318);
        }
        field299 = false;
        field413 = 0;
        if (Statics.field1955 != null) {
            method13(Statics.field1955);
        }
        Statics.field1955 = class173.method793(var13);
        field557 = var12;
        field541 = class140.field2163;
        field318 = class140.field2159;
        if (field434 > 0) {
            int var19 = field434 - 1;
            Statics.field815 = new class31();
            Statics.field815.field709 = field410[var19];
            Statics.field815.field705 = field539[var19];
            Statics.field815.field712 = field437[var19];
            Statics.field815.field707 = field555[var19];
            Statics.field815.field708 = field439[var19];
        }
        method13(Statics.field1955);
    }

    @ObfuscatedName("de.bd(III)V")
    public static final void method2309(int arg0, int arg1) {
        int var2 = Statics.field163.method3730(class157.field2305);
        for (int var3 = 0; var3 < field434; var3++) {
            int var4 = Statics.field163.method3730(method736(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field434 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1543) {
            var6 = Statics.field1543 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field121) {
            var7 = Statics.field121 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field433 = true;
        Statics.field1039 = var6;
        Statics.field2688 = var7;
        Statics.field1900 = var2;
        Statics.field1352 = field434 * 15 + 22;
    }

    @ObfuscatedName("fi.bg(II)Z")
    public static final boolean method2973(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field437[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bq.bw(IS)V")
    public static final void method1591(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field410[arg0];
        int var2 = field539[arg0];
        int var3 = field437[arg0];
        int var4 = field555[arg0];
        String var5 = field439[arg0];
        String var6 = field440[arg0];
        method2777(var1, var2, var3, var4, var5, var6, class140.field2163, class140.field2159);
    }

    @ObfuscatedName("er.bo(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2777(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 38) {
            method2307();
            class173 var8 = class173.method793(arg1);
            field445 = 1;
            Statics.field1380 = arg0;
            Statics.field198 = arg1;
            Statics.field1085 = arg3;
            method13(var8);
            field527 = class2.method195(16748608) + class52.method646(arg3).field1113 + class2.method195(16777215);
            if (field527 == null) {
                field527 = "null";
            }
            return;
        }
        if (arg2 == 40) {
            field338.method2622(3);
            field338.method2380(arg1);
            field338.method2431(arg3);
            field338.method2431(arg0);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 37) {
            field338.method2622(101);
            field338.method2401(arg0);
            field338.method2376(arg1);
            field338.method2422(arg3);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 47) {
            class3 var9 = field415[arg3];
            if (var9 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(238);
                field338.method2503(class137.field2117[82] ? 1 : 0);
                field338.method2422(arg3);
            }
        }
        if (arg2 == 3) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(225);
            field338.method2422(arg3 >> 14 & 0x7FFF);
            field338.method2451(class137.field2117[82] ? 1 : 0);
            field338.method2422(Statics.field233 + arg0);
            field338.method2422(Statics.field647 + arg1);
        }
        if (arg2 == 51) {
            class3 var10 = field415[arg3];
            if (var10 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(119);
                field338.method2511(class137.field2117[82] ? 1 : 0);
                field338.method2431(arg3);
            }
        }
        if (arg2 == 12) {
            class35 var11 = field438[arg3];
            if (var11 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(165);
                field338.method2451(class137.field2117[82] ? 1 : 0);
                field338.method2401(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var12 = field415[arg3];
            if (var12 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(159);
                field338.method2374(arg3);
                field338.method2511(class137.field2117[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(50);
            field338.method2451(class137.field2117[82] ? 1 : 0);
            field338.method2374(arg3 >> 14 & 0x7FFF);
            field338.method2401(Statics.field1085);
            field338.method2380(Statics.field198);
            field338.method2422(Statics.field233 + arg0);
            field338.method2431(Statics.field647 + arg1);
            field338.method2422(Statics.field1380);
        }
        if (arg2 == 26) {
            field338.method2622(110);
            for (class4 var13 = (class4) field453.method3512(); var13 != null; var13 = (class4) field453.method3513()) {
                if (var13.field63 == 0 || var13.field63 == 3) {
                    method1214(var13, true);
                }
            }
            if (field405 != null) {
                method13(field405);
                field405 = null;
            }
        }
        if (arg2 == 6) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(10);
            field338.method2451(class137.field2117[82] ? 1 : 0);
            field338.method2422(Statics.field647 + arg1);
            field338.method2422(arg3 >> 14 & 0x7FFF);
            field338.method2431(Statics.field233 + arg0);
        }
        if (arg2 == 21) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(175);
            field338.method2401(Statics.field233 + arg0);
            field338.method2422(Statics.field647 + arg1);
            field338.method2422(arg3);
            field338.method2413(class137.field2117[82] ? 1 : 0);
        }
        if (arg2 == 19) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(114);
            field338.method2422(Statics.field647 + arg1);
            field338.method2422(arg3);
            field338.method2503(class137.field2117[82] ? 1 : 0);
            field338.method2374(Statics.field233 + arg0);
        }
        if (arg2 == 58) {
            class173 var14 = class173.method732(arg1, arg0);
            if (var14 != null) {
                field338.method2622(236);
                field338.method2374(field448);
                field338.method2422(arg0);
                field338.method2380(Statics.field1899);
                field338.method2376(arg1);
                field338.method2422(var14.field2860);
                field338.method2422(field376);
            }
        }
        if (arg2 == 30 && field405 == null) {
            field338.method2622(63);
            field338.method2431(arg0);
            field338.method2429(arg1);
            field405 = class173.method732(arg1, arg0);
            method13(field405);
        }
        if (arg2 == 22) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(51);
            field338.method2451(class137.field2117[82] ? 1 : 0);
            field338.method2401(arg3);
            field338.method2431(Statics.field233 + arg0);
            field338.method2422(Statics.field647 + arg1);
        }
        if (arg2 == 49) {
            class3 var15 = field415[arg3];
            if (var15 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(117);
                field338.method2422(arg3);
                field338.method2451(class137.field2117[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field338.method2622(203);
            field338.method2376(arg1);
            class173 var16 = class173.method793(arg1);
            if (var16.field2852 != null && var16.field2852[0][0] == 5) {
                int var17 = var16.field2852[0][1];
                class176.field2889[var17] = 1 - class176.field2889[var17];
                method2821(var17);
            }
        }
        if (arg2 == 44) {
            class3 var18 = field415[arg3];
            if (var18 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(158);
                field338.method2511(class137.field2117[82] ? 1 : 0);
                field338.method2374(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field136.method1828(Statics.field124, arg0, arg1);
        }
        if (arg2 == 1003) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            class35 var19 = field438[arg3];
            if (var19 != null) {
                class40 var20 = var19.field782;
                if (var20.field892 != null) {
                    var20 = var20.method762();
                }
                if (var20 != null) {
                    field338.method2622(78);
                    field338.method2374(var20.field885);
                }
            }
        }
        if (arg2 == 10) {
            class35 var21 = field438[arg3];
            if (var21 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(153);
                field338.method2374(arg3);
                field338.method2503(class137.field2117[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field338.method2622(237);
            field338.method2431(arg3);
            field338.method2401(arg0);
            field338.method2430(arg1);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 16) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(239);
            field338.method2401(arg3);
            field338.method2429(Statics.field198);
            field338.method2422(Statics.field1085);
            field338.method2374(Statics.field233 + arg0);
            field338.method2413(class137.field2117[82] ? 1 : 0);
            field338.method2401(Statics.field1380);
            field338.method2401(Statics.field647 + arg1);
        }
        if (arg2 == 13) {
            class35 var22 = field438[arg3];
            if (var22 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(1);
                field338.method2413(class137.field2117[82] ? 1 : 0);
                field338.method2422(arg3);
            }
        }
        if (arg2 == 8) {
            class35 var23 = field438[arg3];
            if (var23 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(222);
                field338.method2413(class137.field2117[82] ? 1 : 0);
                field338.method2431(arg3);
                field338.method2401(field448);
                field338.method2430(Statics.field1899);
            }
        }
        if (arg2 == 36) {
            field338.method2622(2);
            field338.method2422(arg0);
            field338.method2376(arg1);
            field338.method2374(arg3);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 32) {
            field338.method2622(27);
            field338.method2422(arg0);
            field338.method2380(arg1);
            field338.method2376(Statics.field1899);
            field338.method2431(field448);
            field338.method2422(arg3);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 24) {
            class173 var24 = class173.method793(arg1);
            boolean var25 = true;
            if (var24.field2746 > 0) {
                var25 = method2325(var24);
            }
            if (var25) {
                field338.method2622(203);
                field338.method2376(arg1);
            }
        }
        if (arg2 == 50) {
            class3 var26 = field415[arg3];
            if (var26 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(210);
                field338.method2401(arg3);
                field338.method2451(class137.field2117[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var27 = class173.method732(arg1, arg0);
            if (var27 != null) {
                int var28 = var27.field2860;
                class173 var29 = class173.method732(arg1, arg0);
                if (var29 != null) {
                    if (var29.field2840 != null) {
                        class1 var30 = new class1();
                        var30.field7 = var29;
                        var30.field6 = arg3;
                        var30.field10 = arg5;
                        var30.field13 = var29.field2840;
                        class37.method2961(var30);
                    }
                    boolean var31 = true;
                    if (var29.field2746 > 0) {
                        var31 = method2325(var29);
                    }
                    if (var31 && class178.method725(method46(var29), arg3 - 1)) {
                        if (arg3 == 1) {
                            field338.method2622(81);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                        if (arg3 == 2) {
                            field338.method2622(226);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                        if (arg3 == 3) {
                            field338.method2622(35);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                        if (arg3 == 4) {
                            field338.method2622(206);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                        if (arg3 == 5) {
                            field338.method2622(132);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                        if (arg3 == 6) {
                            field338.method2622(21);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                        if (arg3 == 7) {
                            field338.method2622(125);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                        if (arg3 == 8) {
                            field338.method2622(152);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                        if (arg3 == 9) {
                            field338.method2622(20);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                        if (arg3 == 10) {
                            field338.method2622(92);
                            field338.method2376(arg1);
                            field338.method2374(arg0);
                            field338.method2374(var28);
                        }
                    }
                }
            }
        }
        if (arg2 == 31) {
            field338.method2622(123);
            field338.method2374(arg3);
            field338.method2429(Statics.field198);
            field338.method2429(arg1);
            field338.method2431(Statics.field1380);
            field338.method2431(arg0);
            field338.method2431(Statics.field1085);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 46) {
            class3 var32 = field415[arg3];
            if (var32 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(87);
                field338.method2431(arg3);
                field338.method2413(class137.field2117[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var33 = field415[arg3];
            if (var33 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(166);
                field338.method2503(class137.field2117[82] ? 1 : 0);
                field338.method2422(arg3);
            }
        }
        if (arg2 == 43) {
            field338.method2622(40);
            field338.method2376(arg1);
            field338.method2422(arg3);
            field338.method2374(arg0);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 15) {
            class3 var34 = field415[arg3];
            if (var34 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(55);
                field338.method2429(Statics.field1899);
                field338.method2374(arg3);
                field338.method2431(field448);
                field338.method2511(class137.field2117[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field338.method2622(255);
            field338.method2376(arg1);
            field338.method2431(arg3);
            field338.method2401(arg0);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 5) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(11);
            field338.method2401(arg3 >> 14 & 0x7FFF);
            field338.method2422(Statics.field233 + arg0);
            field338.method2422(Statics.field647 + arg1);
            field338.method2413(class137.field2117[82] ? 1 : 0);
        }
        if (arg2 == 29) {
            field338.method2622(203);
            field338.method2376(arg1);
            class173 var35 = class173.method793(arg1);
            if (var35.field2852 != null && var35.field2852[0][0] == 5) {
                int var36 = var35.field2852[0][1];
                if (class176.field2889[var36] != var35.field2761[0]) {
                    class176.field2889[var36] = var35.field2761[0];
                    method2821(var36);
                }
            }
        }
        if (arg2 == 2) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(229);
            field338.method2422(arg3 >> 14 & 0x7FFF);
            field338.method2503(class137.field2117[82] ? 1 : 0);
            field338.method2401(field448);
            field338.method2429(Statics.field1899);
            field338.method2422(Statics.field233 + arg0);
            field338.method2431(Statics.field647 + arg1);
        }
        if (arg2 == 18) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(139);
            field338.method2374(Statics.field233 + arg0);
            field338.method2511(class137.field2117[82] ? 1 : 0);
            field338.method2422(arg3);
            field338.method2422(Statics.field647 + arg1);
        }
        if (arg2 == 1005) {
            class173 var37 = class173.method793(arg1);
            if (var37 == null || var37.field2755[arg0] < 100000) {
                field338.method2622(7);
                field338.method2422(arg3);
            } else {
                class12.method755(27, "", var37.field2755[arg0] + " x " + class52.method646(arg3).field1113);
            }
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 20) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(103);
            field338.method2422(Statics.field647 + arg1);
            field338.method2374(arg3);
            field338.method2422(Statics.field233 + arg0);
            field338.method2503(class137.field2117[82] ? 1 : 0);
        }
        if (arg2 == 11) {
            class35 var38 = field438[arg3];
            if (var38 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(104);
                field338.method2413(class137.field2117[82] ? 1 : 0);
                field338.method2374(arg3);
            }
        }
        if (arg2 == 9) {
            class35 var39 = field438[arg3];
            if (var39 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(247);
                field338.method2431(arg3);
                field338.method2511(class137.field2117[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field338.method2622(26);
            field338.method2401(arg0);
            field338.method2422(arg3);
            field338.method2380(arg1);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 33) {
            field338.method2622(48);
            field338.method2422(arg0);
            field338.method2380(arg1);
            field338.method2431(arg3);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 1001) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(219);
            field338.method2374(arg3 >> 14 & 0x7FFF);
            field338.method2413(class137.field2117[82] ? 1 : 0);
            field338.method2374(Statics.field647 + arg1);
            field338.method2401(Statics.field233 + arg0);
        }
        if (arg2 == 1002) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field338.method2622(58);
            field338.method2401(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 7) {
            class35 var40 = field438[arg3];
            if (var40 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(212);
                field338.method2401(Statics.field1085);
                field338.method2376(Statics.field198);
                field338.method2422(arg3);
                field338.method2451(class137.field2117[82] ? 1 : 0);
                field338.method2374(Statics.field1380);
            }
        }
        if (arg2 == 4) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(216);
            field338.method2431(arg3 >> 14 & 0x7FFF);
            field338.method2511(class137.field2117[82] ? 1 : 0);
            field338.method2401(Statics.field233 + arg0);
            field338.method2401(Statics.field647 + arg1);
        }
        if (arg2 == 35) {
            field338.method2622(170);
            field338.method2430(arg1);
            field338.method2401(arg0);
            field338.method2401(arg3);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (arg2 == 25) {
            class173 var41 = class173.method732(arg1, arg0);
            if (var41 != null) {
                method2307();
                int var42 = method46(var41);
                int var43 = var42 >> 11 & 0x3F;
                int var45 = var41.field2860;
                class173 var46 = class173.method732(arg1, arg0);
                if (var46 != null && var46.field2760 != null) {
                    class1 var47 = new class1();
                    var47.field7 = var46;
                    var47.field13 = var46.field2760;
                    class37.method2961(var47);
                }
                field376 = var45;
                field323 = true;
                Statics.field1899 = arg1;
                field448 = arg0;
                Statics.field2005 = var43;
                method13(var46);
                field445 = 0;
                field450 = method859(var41);
                if (field450 == null) {
                    field450 = "Null";
                }
                if (var41.field2779) {
                    field397 = var41.field2813 + class2.method195(16777215);
                } else {
                    field397 = class2.method195(65280) + var41.field2856 + class2.method195(16777215);
                }
            }
            return;
        }
        if (arg2 == 17) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field526 = arg0;
            field353 = arg1;
            field338.method2622(13);
            field338.method2374(arg3);
            field338.method2376(Statics.field1899);
            field338.method2401(field448);
            field338.method2503(class137.field2117[82] ? 1 : 0);
            field338.method2401(Statics.field647 + arg1);
            field338.method2401(Statics.field233 + arg0);
        }
        if (arg2 == 14) {
            class3 var48 = field415[arg3];
            if (var48 != null) {
                field402 = arg6;
                field403 = arg7;
                field515 = 2;
                field315 = 0;
                field526 = arg0;
                field353 = arg1;
                field338.method2622(223);
                field338.method2430(Statics.field198);
                field338.method2431(arg3);
                field338.method2503(class137.field2117[82] ? 1 : 0);
                field338.method2401(Statics.field1380);
                field338.method2422(Statics.field1085);
            }
        }
        if (arg2 == 1004) {
            field402 = arg6;
            field403 = arg7;
            field515 = 2;
            field315 = 0;
            field338.method2622(7);
            field338.method2422(arg3);
        }
        if (arg2 == 42) {
            field338.method2622(86);
            field338.method2401(arg0);
            field338.method2431(arg3);
            field338.method2380(arg1);
            field406 = 0;
            Statics.field228 = class173.method793(arg1);
            field407 = arg0;
        }
        if (field445 != 0) {
            field445 = 0;
            method13(class173.method793(Statics.field198));
        }
        if (field323) {
            method2307();
        }
        if (Statics.field228 != null && field406 == 0) {
            method13(Statics.field228);
        }
    }

    @ObfuscatedName("dd.bj(I)V")
    public static void method2307() {
        if (!field323) {
            return;
        }
        class173 var0 = class173.method732(Statics.field1899, field448);
        if (var0 != null && var0.field2832 != null) {
            class1 var1 = new class1();
            var1.field7 = var0;
            var1.field13 = var0.field2832;
            class37.method2961(var1);
        }
        field323 = false;
        method13(var0);
    }

    @ObfuscatedName("s.bq(I)V")
    public static final void method183() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field434 - 1; var1++) {
                if (field437[var1] < 1000 && field437[var1 + 1] > 1000) {
                    String var2 = field440[var1];
                    field440[var1] = field440[var1 + 1];
                    field440[var1 + 1] = var2;
                    String var3 = field439[var1];
                    field439[var1] = field439[var1 + 1];
                    field439[var1 + 1] = var3;
                    int var4 = field437[var1];
                    field437[var1] = field437[var1 + 1];
                    field437[var1 + 1] = var4;
                    int var5 = field410[var1];
                    field410[var1] = field410[var1 + 1];
                    field410[var1 + 1] = var5;
                    int var6 = field539[var1];
                    field539[var1] = field539[var1 + 1];
                    field539[var1 + 1] = var6;
                    int var7 = field555[var1];
                    field555[var1] = field555[var1 + 1];
                    field555[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("l.ba(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field433 || field434 >= 500) {
            return;
        }
        field439[field434] = arg0;
        field440[field434] = arg1;
        field437[field434] = arg2;
        field555[field434] = arg3;
        field410[field434] = arg4;
        field539[field434] = arg5;
        field434++;
    }

    @ObfuscatedName("eo.cr(I)V")
    public static void method2953() {
        for (int var0 = 0; var0 < field434; var0++) {
            if (method136(field437[var0])) {
                if (var0 < field434 - 1) {
                    for (int var1 = var0; var1 < field434 - 1; var1++) {
                        field439[var1] = field439[var1 + 1];
                        field440[var1] = field440[var1 + 1];
                        field437[var1] = field437[var1 + 1];
                        field555[var1] = field555[var1 + 1];
                        field410[var1] = field410[var1 + 1];
                        field539[var1] = field539[var1 + 1];
                    }
                }
                field434--;
            }
        }
    }

    @ObfuscatedName("k.cv(IB)Z")
    public static boolean method136(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("al.co(IB)Ljava/lang/String;")
    public static String method736(int arg0) {
        return field440[arg0].length() > 0 ? field439[arg0] + class157.field2458 + field440[arg0] : field439[arg0];
    }

    @ObfuscatedName("u.cx(Lq;IIII)V")
    public static final void method210(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field143 == arg0 || field434 >= 400) {
            return;
        }
        String var4;
        if (arg0.field39 == 0) {
            var4 = arg0.field57[0] + arg0.field48 + arg0.field57[1] + method741(arg0.field38, Statics.field143.field38) + " " + class2.field17 + class157.field2326 + arg0.field38 + class2.field18 + arg0.field57[2];
        } else {
            var4 = arg0.field57[0] + arg0.field48 + arg0.field57[1] + " " + class2.field17 + class157.field2372 + arg0.field39 + class2.field18 + arg0.field57[2];
        }
        if (field445 == 1) {
            method1(class157.field2448, field527 + " " + class2.field25 + " " + class2.method195(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field323) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field354[var5] != null) {
                    short var6 = 0;
                    if (field354[var5].equalsIgnoreCase(class157.field2559)) {
                        if (field321 == class21.field579) {
                            continue;
                        }
                        if (field321 == class21.field577 || field321 == class21.field582 && arg0.field38 > Statics.field143.field38) {
                            var6 = 2000;
                        }
                        if (Statics.field143.field52 != 0 && arg0.field52 != 0) {
                            if (Statics.field143.field52 == arg0.field52) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field422[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field379[var5] + var6;
                    method1(field354[var5], class2.method195(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2005 & 0x8) == 8) {
            method1(field450, field397 + " " + class2.field25 + " " + class2.method195(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field434; var9++) {
            if (field437[var9] == 23) {
                field440[var9] = class2.method195(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("al.ce(IIB)Ljava/lang/String;")
    public static final String method741(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method195(16711680);
        } else if (var2 < -6) {
            return class2.method195(16723968);
        } else if (var2 < -3) {
            return class2.method195(16740352);
        } else if (var2 < 0) {
            return class2.method195(16756736);
        } else if (var2 > 9) {
            return class2.method195(65280);
        } else if (var2 > 6) {
            return class2.method195(4259584);
        } else if (var2 > 3) {
            return class2.method195(8453888);
        } else if (var2 > 0) {
            return class2.method195(12648192);
        } else {
            return class2.method195(16776960);
        }
    }

    @ObfuscatedName("d.cd(IIIIIIIII)V")
    public static final void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method2073(arg0)) {
            Statics.field2628 = null;
            method955(Statics.field2868[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2628 != null) {
                method955(Statics.field2628, -1412584499, arg1, arg2, arg3, arg4, Statics.field130, Statics.field74, arg7);
                Statics.field2628 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field497[var8] = true;
            }
        } else {
            field497[arg7] = true;
        }
    }

    @ObfuscatedName("ap.cp([Lfd;IIIIIIIIB)V")
    public static final void method955(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1701(arg2, arg3, arg4, arg5);
        class91.method1971();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2754 == arg1 || arg1 == -1412584499 && field465 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field418[field495] = var10.field2774 + arg6;
                    field501[field495] = var10.field2835 + arg7;
                    field304[field495] = var10.field2831;
                    field374[field495] = var10.field2758;
                    var11 = ++field495 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2871 = var11;
                var10.field2872 = field548;
                if (!var10.field2779 || !method2653(var10)) {
                    if (var10.field2746 > 0) {
                        method2682(var10);
                    }
                    int var12 = var10.field2774 + arg6;
                    int var13 = var10.field2835 + arg7;
                    int var14 = var10.field2771;
                    if (field465 == var10) {
                        if (arg1 != -1412584499 && !var10.field2818) {
                            Statics.field2628 = arg0;
                            Statics.field130 = arg6;
                            Statics.field74 = arg7;
                            continue;
                        }
                        if (field476 && field470) {
                            int var15 = class140.field2151;
                            int var16 = class140.field2152;
                            int var17 = var15 - field467;
                            int var18 = var16 - field355;
                            if (var17 < field471) {
                                var17 = field471;
                            }
                            if (var10.field2831 + var17 > field471 + field466.field2831) {
                                var17 = field471 + field466.field2831 - var10.field2831;
                            }
                            if (var18 < field472) {
                                var18 = field472;
                            }
                            if (var10.field2758 + var18 > field472 + field466.field2758) {
                                var18 = field472 + field466.field2758 - var10.field2758;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2818) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2744 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2744 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2831 + var12;
                        int var26 = var10.field2758 + var13;
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
                        int var29 = var10.field2831 + var12;
                        int var30 = var10.field2758 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2779 || var19 < var21 && var20 < var22) {
                        if (var10.field2746 != 0) {
                            if (var10.field2746 == 1336) {
                                if (field528) {
                                    var13 += 15;
                                    Statics.field1782.method3736("Fps:" + field2198, var10.field2831 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field300) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field300) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1782.method3736("Mem:" + var32 + "k", var10.field2831 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2746 == 1337) {
                                field436 = var12;
                                field490 = var13;
                                method3117(var12, var13, var10.field2831, var10.field2758);
                                field497[var10.field2871] = true;
                                class80.method1701(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2746 == 1338) {
                                method2958(var10, var12, var13, var11);
                                class80.method1701(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2746 == 1339) {
                                Statics.method2054(var10, var12, var13, var11);
                                class80.method1701(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2744 == 0) {
                            if (!var10.field2779 && method2653(var10) && Statics.field218 != var10) {
                                continue;
                            }
                            if (!var10.field2779) {
                                if (var10.field2764 > var10.field2791 - var10.field2758) {
                                    var10.field2764 = var10.field2791 - var10.field2758;
                                }
                                if (var10.field2764 < 0) {
                                    var10.field2764 = 0;
                                }
                            }
                            method955(arg0, var10.field2742, var19, var20, var21, var22, var12 - var10.field2763, var13 - var10.field2764, var11);
                            if (var10.field2864 != null) {
                                method955(var10.field2864, var10.field2742, var19, var20, var21, var22, var12 - var10.field2763, var13 - var10.field2764, var11);
                            }
                            class4 var34 = (class4) field453.method3509((long) var10.field2742);
                            if (var34 != null) {
                                method597(var34.field64, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1701(arg2, arg3, arg4, arg5);
                            class91.method1971();
                        }
                        if (field506 || field389[var11] || field311 > 1) {
                            if (var10.field2744 == 0 && !var10.field2779 && var10.field2791 > var10.field2758) {
                                int var35 = var10.field2831 + var12;
                                int var36 = var10.field2764;
                                int var37 = var10.field2758;
                                int var38 = var10.field2791;
                                Statics.field220[0].method1761(var35, var13);
                                Statics.field220[1].method1761(var35, var13 + var37 - 16);
                                class80.method1737(var35, var13 + 16, 16, var37 - 32, field372);
                                int var39 = (var37 - 32) * var37 / var38;
                                if (var39 < 8) {
                                    var39 = 8;
                                }
                                int var40 = (var37 - 32 - var39) * var36 / (var38 - var37);
                                class80.method1737(var35, var13 + 16 + var40, 16, var39, field373);
                                class80.method1738(var35, var13 + 16 + var40, var39, field375);
                                class80.method1738(var35 + 1, var13 + 16 + var40, var39, field375);
                                class80.method1711(var35, var13 + 16 + var40, 16, field375);
                                class80.method1711(var35, var13 + 17 + var40, 16, field375);
                                class80.method1738(var35 + 15, var13 + 16 + var40, var39, field409);
                                class80.method1738(var35 + 14, var13 + 17 + var40, var39 - 1, field409);
                                class80.method1711(var35, var13 + 15 + var40 + var39, 16, field409);
                                class80.method1711(var35 + 1, var13 + 14 + var40 + var39, 15, field409);
                            }
                            if (var10.field2744 != 1) {
                                if (var10.field2744 == 2) {
                                    int var41 = 0;
                                    for (int var42 = 0; var42 < var10.field2766; var42++) {
                                        for (int var43 = 0; var43 < var10.field2753; var43++) {
                                            int var44 = (var10.field2811 + 32) * var43 + var12;
                                            int var45 = (var10.field2776 + 32) * var42 + var13;
                                            if (var41 < 20) {
                                                var44 += var10.field2743[var41];
                                                var45 += var10.field2809[var41];
                                            }
                                            if (var10.field2765[var41] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var10.field2765[var41] - 1;
                                                if (var44 + 32 > arg2 && var44 < arg4 && var45 + 32 > arg3 && var45 < arg5 || Statics.field1955 == var10 && field557 == var41) {
                                                    class79 var49;
                                                    if (field445 == 1 && Statics.field1380 == var41 && Statics.field198 == var10.field2742) {
                                                        var49 = class52.method185(var48, var10.field2755[var41], 2, 0, 2, false);
                                                    } else {
                                                        var49 = class52.method185(var48, var10.field2755[var41], 1, 3153952, 2, false);
                                                    }
                                                    if (var49 == null) {
                                                        method13(var10);
                                                    } else if (Statics.field1955 == var10 && field557 == var41) {
                                                        int var50 = class140.field2151 - field541;
                                                        int var51 = class140.field2152 - field318;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (field413 < 5) {
                                                            var50 = 0;
                                                            var51 = 0;
                                                        }
                                                        var49.method1693(var44 + var50, var45 + var51, 128);
                                                        if (arg1 != -1) {
                                                            class173 var52 = arg0[arg1 & 0xFFFF];
                                                            if (var45 + var51 < class80.field1405 && var52.field2764 > 0) {
                                                                int var53 = field371 * (class80.field1405 - var45 - var51) / 3;
                                                                if (var53 > field371 * 10) {
                                                                    var53 = field371 * 10;
                                                                }
                                                                if (var53 > var52.field2764) {
                                                                    var53 = var52.field2764;
                                                                }
                                                                var52.field2764 -= var53;
                                                                field318 += var53;
                                                                method13(var52);
                                                            }
                                                            if (var45 + var51 + 32 > class80.field1402 && var52.field2764 < var52.field2791 - var52.field2758) {
                                                                int var54 = field371 * (var45 + var51 + 32 - class80.field1402) / 3;
                                                                if (var54 > field371 * 10) {
                                                                    var54 = field371 * 10;
                                                                }
                                                                if (var54 > var52.field2791 - var52.field2758 - var52.field2764) {
                                                                    var54 = var52.field2791 - var52.field2758 - var52.field2764;
                                                                }
                                                                var52.field2764 += var54;
                                                                field318 -= var54;
                                                                method13(var52);
                                                            }
                                                        }
                                                    } else if (Statics.field228 == var10 && field407 == var41) {
                                                        var49.method1693(var44, var45, 128);
                                                    } else {
                                                        var49.method1618(var44, var45);
                                                    }
                                                }
                                            } else if (var10.field2810 != null && var41 < 20) {
                                                class79 var55 = var10.method3178(var41);
                                                if (var55 != null) {
                                                    var55.method1618(var44, var45);
                                                } else if (class173.field2740) {
                                                    method13(var10);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                } else if (var10.field2744 == 3) {
                                    int var56;
                                    if (method2775(var10)) {
                                        var56 = var10.field2768;
                                        if (Statics.field218 == var10 && var10.field2770 != 0) {
                                            var56 = var10.field2770;
                                        }
                                    } else {
                                        var56 = var10.field2815;
                                        if (Statics.field218 == var10 && var10.field2855 != 0) {
                                            var56 = var10.field2855;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2767) {
                                            class80.method1737(var12, var13, var10.field2831, var10.field2758, var56);
                                        } else {
                                            class80.method1709(var12, var13, var10.field2831, var10.field2758, var56);
                                        }
                                    } else if (var10.field2767) {
                                        class80.method1706(var12, var13, var10.field2831, var10.field2758, var56, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1727(var12, var13, var10.field2831, var10.field2758, var56, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2744 == 4) {
                                    class224 var57 = var10.method3177();
                                    if (var57 != null) {
                                        String var58 = var10.field2841;
                                        int var59;
                                        if (method2775(var10)) {
                                            var59 = var10.field2768;
                                            if (Statics.field218 == var10 && var10.field2770 != 0) {
                                                var59 = var10.field2770;
                                            }
                                            if (var10.field2801.length() > 0) {
                                                var58 = var10.field2801;
                                            }
                                        } else {
                                            var59 = var10.field2815;
                                            if (Statics.field218 == var10 && var10.field2855 != 0) {
                                                var59 = var10.field2855;
                                            }
                                        }
                                        if (var10.field2779 && var10.field2860 != -1) {
                                            class52 var60 = class52.method646(var10.field2860);
                                            var58 = var60.field1113;
                                            if (var58 == null) {
                                                var58 = "null";
                                            }
                                            if ((var60.field1111 == 1 || var10.field2861 != 1) && var10.field2861 != -1) {
                                                var58 = class2.method195(16748608) + var58 + class2.field21 + " " + 'x' + method161(var10.field2861);
                                            }
                                        }
                                        if (field405 == var10) {
                                            class157 var10000 = (class157) null;
                                            var58 = class157.field2451;
                                            var59 = var10.field2815;
                                        }
                                        if (!var10.field2779) {
                                            var58 = method1964(var58, var10);
                                        }
                                        var57.method3738(var58, var12, var13, var10.field2831, var10.field2758, var59, var10.field2805 ? 0 : -1, var10.field2803, var10.field2804, var10.field2802);
                                    } else if (class173.field2740) {
                                        method13(var10);
                                    }
                                } else if (var10.field2744 == 5) {
                                    if (var10.field2779) {
                                        class79 var62;
                                        if (var10.field2860 == -1) {
                                            var62 = var10.method3176(false);
                                        } else {
                                            var62 = class52.method185(var10.field2860, var10.field2861, var10.field2858, var10.field2749, var10.field2798, false);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field1395;
                                            int var64 = var62.field1396;
                                            if (var10.field2778) {
                                                class80.method1702(var12, var13, var10.field2831 + var12, var10.field2758 + var13);
                                                int var65 = (var10.field2831 + (var63 - 1)) / var63;
                                                int var66 = (var10.field2758 + (var64 - 1)) / var64;
                                                for (int var67 = 0; var67 < var65; var67++) {
                                                    for (int var68 = 0; var68 < var66; var68++) {
                                                        if (var10.field2777 != 0) {
                                                            var62.method1631(var63 / 2 + var63 * var67 + var12, var64 / 2 + var64 * var68 + var13, var10.field2777, 4096);
                                                        } else if (var14 == 0) {
                                                            var62.method1618(var63 * var67 + var12, var64 * var68 + var13);
                                                        } else {
                                                            var62.method1693(var63 * var67 + var12, var64 * var68 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1701(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var69 = var10.field2831 * 4096 / var63;
                                                if (var10.field2777 != 0) {
                                                    var62.method1631(var10.field2831 / 2 + var12, var10.field2758 / 2 + var13, var10.field2777, var69);
                                                } else if (var14 != 0) {
                                                    var62.method1626(var12, var13, var10.field2831, var10.field2758, 256 - (var14 & 0xFF));
                                                } else if (var10.field2831 == var63 && var10.field2758 == var64) {
                                                    var62.method1618(var12, var13);
                                                } else {
                                                    var62.method1620(var12, var13, var10.field2831, var10.field2758);
                                                }
                                            }
                                        } else if (class173.field2740) {
                                            method13(var10);
                                        }
                                    } else {
                                        class79 var61 = var10.method3176(method2775(var10));
                                        if (var61 != null) {
                                            var61.method1618(var12, var13);
                                        } else if (class173.field2740) {
                                            method13(var10);
                                        }
                                    }
                                } else if (var10.field2744 == 6) {
                                    boolean var70 = method2775(var10);
                                    int var71;
                                    if (var70) {
                                        var71 = var10.field2757;
                                    } else {
                                        var71 = var10.field2788;
                                    }
                                    class105 var72 = null;
                                    int var73 = 0;
                                    if (var10.field2860 != -1) {
                                        class52 var74 = class52.method646(var10.field2860);
                                        if (var74 != null) {
                                            class52 var75 = var74.method1074(var10.field2861);
                                            var72 = var75.method1031(1);
                                            if (var72 == null) {
                                                method13(var10);
                                            } else {
                                                var72.method2195();
                                                var73 = var72.field1442 / 2;
                                            }
                                        }
                                    } else if (var10.field2783 == 5) {
                                        if (var10.field2786 == 0) {
                                            var72 = field572.method3246((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var72 = Statics.field143.method18();
                                        }
                                    } else if (var71 == -1) {
                                        var72 = var10.method3179((class43) null, -1, var70, Statics.field143.field34);
                                        if (var72 == null && class173.field2740) {
                                            method13(var10);
                                        }
                                    } else {
                                        class43 var76 = class43.method2304(var71);
                                        var72 = var10.method3179(var76, var10.field2862, var70, Statics.field143.field34);
                                        if (var72 == null && class173.field2740) {
                                            method13(var10);
                                        }
                                    }
                                    class91.method1994(var10.field2831 / 2 + var12, var10.field2758 / 2 + var13);
                                    int var77 = var10.field2794 * class91.field1550[var10.field2769] >> 16;
                                    int var78 = var10.field2794 * class91.field1568[var10.field2769] >> 16;
                                    if (var72 != null) {
                                        if (var10.field2779) {
                                            var72.method2195();
                                            if (var10.field2797) {
                                                var72.method2187(0, var10.field2792, var10.field2793, var10.field2769, var10.field2830, var10.field2790 + var73 + var77, var10.field2790 + var78, var10.field2794);
                                            } else {
                                                var72.method2186(0, var10.field2792, var10.field2793, var10.field2769, var10.field2830, var10.field2790 + var73 + var77, var10.field2790 + var78);
                                            }
                                        } else {
                                            var72.method2186(0, var10.field2792, 0, var10.field2769, 0, var77, var78);
                                        }
                                    }
                                    class91.method1972();
                                } else {
                                    if (var10.field2744 == 7) {
                                        class224 var79 = var10.method3177();
                                        if (var79 == null) {
                                            if (class173.field2740) {
                                                method13(var10);
                                            }
                                            continue;
                                        }
                                        int var80 = 0;
                                        for (int var81 = 0; var81 < var10.field2766; var81++) {
                                            for (int var82 = 0; var82 < var10.field2753; var82++) {
                                                if (var10.field2765[var80] > 0) {
                                                    class52 var83 = class52.method646(var10.field2765[var80] - 1);
                                                    String var84;
                                                    if (var83.field1111 != 1 && var10.field2755[var80] == 1) {
                                                        var84 = class2.method195(16748608) + var83.field1113 + class2.field21;
                                                    } else {
                                                        var84 = class2.method195(16748608) + var83.field1113 + class2.field21 + " " + 'x' + method161(var10.field2755[var80]);
                                                    }
                                                    int var85 = (var10.field2811 + 115) * var82 + var12;
                                                    int var86 = (var10.field2776 + 12) * var81 + var13;
                                                    if (var10.field2803 == 0) {
                                                        var79.method3735(var84, var85, var86, var10.field2815, var10.field2805 ? 0 : -1);
                                                    } else if (var10.field2803 == 1) {
                                                        var79.method3755(var84, var10.field2831 / 2 + var85, var86, var10.field2815, var10.field2805 ? 0 : -1);
                                                    } else {
                                                        var79.method3736(var84, var10.field2831 + var85 - 1, var86, var10.field2815, var10.field2805 ? 0 : -1);
                                                    }
                                                }
                                                var80++;
                                            }
                                        }
                                    }
                                    if (var10.field2744 == 8 && Statics.field2245 == var10 && field523 == field326) {
                                        int var87 = 0;
                                        int var88 = 0;
                                        class224 var89 = Statics.field1782;
                                        String var90 = var10.field2841;
                                        String var91 = method1964(var90, var10);
                                        while (var91.length() > 0) {
                                            int var92 = var91.indexOf(class2.field14);
                                            String var93;
                                            if (var92 == -1) {
                                                var93 = var91;
                                                var91 = "";
                                            } else {
                                                var93 = var91.substring(0, var92);
                                                var91 = var91.substring(var92 + 4);
                                            }
                                            int var94 = var89.method3730(var93);
                                            if (var94 > var87) {
                                                var87 = var94;
                                            }
                                            var88 += var89.field3176 + 1;
                                        }
                                        var87 += 6;
                                        var88 += 7;
                                        int var95 = var10.field2831 + var12 - 5 - var87;
                                        int var96 = var10.field2758 + var13 + 5;
                                        if (var95 < var12 + 5) {
                                            var95 = var12 + 5;
                                        }
                                        if (var87 + var95 > arg4) {
                                            var95 = arg4 - var87;
                                        }
                                        if (var88 + var96 > arg5) {
                                            var96 = arg5 - var88;
                                        }
                                        class80.method1737(var95, var96, var87, var88, 16777120);
                                        class80.method1709(var95, var96, var87, var88, 0);
                                        String var97 = var10.field2841;
                                        int var98 = var89.field3176 + var96 + 2;
                                        String var99 = method1964(var97, var10);
                                        while (var99.length() > 0) {
                                            int var100 = var99.indexOf(class2.field14);
                                            String var101;
                                            if (var100 == -1) {
                                                var101 = var99;
                                                var99 = "";
                                            } else {
                                                var101 = var99.substring(0, var100);
                                                var99 = var99.substring(var100 + 4);
                                            }
                                            var89.method3735(var101, var95 + 3, var98, 0, -1);
                                            var98 += var89.field3176 + 1;
                                        }
                                    }
                                    if (var10.field2744 == 9) {
                                        if (var10.field2859 == 1) {
                                            int var102;
                                            int var103;
                                            int var104;
                                            int var105;
                                            if (var10.field2731) {
                                                var102 = var12;
                                                var103 = var10.field2758 + var13;
                                                var104 = var10.field2831 + var12;
                                                var105 = var13;
                                            } else {
                                                var102 = var12;
                                                var103 = var13;
                                                var104 = var10.field2831 + var12;
                                                var105 = var10.field2758 + var13;
                                            }
                                            class80.method1698(var102, var103, var104, var105, var10.field2815);
                                        } else {
                                            int var106 = var10.field2831 >= 0 ? var10.field2831 : -var10.field2831;
                                            int var107 = var10.field2758 >= 0 ? var10.field2758 : -var10.field2758;
                                            int var108 = var106;
                                            if (var106 < var107) {
                                                var108 = var107;
                                            }
                                            if (var108 != 0) {
                                                int var109 = (var10.field2831 << 16) / var108;
                                                int var110 = (var10.field2758 << 16) / var108;
                                                if (var110 <= var109) {
                                                    var109 = -var109;
                                                } else {
                                                    var110 = -var110;
                                                }
                                                int var111 = var10.field2859 * var110 >> 17;
                                                int var112 = var10.field2859 * var110 + 1 >> 17;
                                                int var113 = var10.field2859 * var109 >> 17;
                                                int var114 = var10.field2859 * var109 + 1 >> 17;
                                                int var115 = var12 + var111;
                                                int var116 = var12 - var112;
                                                int var117 = var10.field2831 + var12 - var112;
                                                int var118 = var10.field2831 + var12 + var111;
                                                int var119 = var13 + var113;
                                                int var120 = var13 - var114;
                                                int var121 = var10.field2758 + var13 - var114;
                                                int var122 = var10.field2758 + var13 + var113;
                                                class91.method1978(var115, var116, var117);
                                                class91.method2015(var119, var120, var121, var115, var116, var117, var10.field2815);
                                                class91.method1978(var115, var117, var118);
                                                class91.method2015(var119, var121, var122, var115, var117, var118, var10.field2815);
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

    @ObfuscatedName("cn.cn(Ljava/lang/String;Lfd;I)Ljava/lang/String;")
    public static String method1964(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method752(arg1, var2 - 1);
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
                if (Statics.field2180 != null) {
                    var8 = class163.method2931(Statics.field2180.field2214);
                    if (Statics.field2180.field2211 != null) {
                        var8 = (String) Statics.field2180.field2211;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.cs(II)Ljava/lang/String;")
    public static final String method161(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field15 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method195(65408) + var1.substring(0, var1.length() - 8) + class157.field2347 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else if (var1.length() > 6) {
            return " " + class2.method195(16777215) + var1.substring(0, var1.length() - 4) + class157.field2328 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else {
            return " " + class2.method195(16776960) + var1 + class2.field21;
        }
    }

    @ObfuscatedName("u.ck(Lfd;I)V")
    public static void method228(class173 arg0) {
        class173 var1 = arg0.field2754 == -1 ? null : class173.method793(arg0.field2754);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1543;
            var3 = Statics.field121;
        } else {
            var2 = var1.field2831;
            var3 = var1.field2758;
        }
        method665(arg0, var2, var3, false);
        Statics.method2(arg0, var2, var3);
    }

    @ObfuscatedName("s.cb([Lfd;Lfd;ZB)V")
    public static void method186(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2752 == 0 ? arg1.field2831 : arg1.field2752;
        int var4 = arg1.field2791 == 0 ? arg1.field2758 : arg1.field2791;
        method2651(arg0, arg1.field2742, var3, var4, arg2);
        if (arg1.field2864 != null) {
            method2651(arg1.field2864, arg1.field2742, var3, var4, arg2);
        }
        class4 var5 = (class4) field453.method3509((long) arg1.field2742);
        if (var5 != null) {
            method2990(var5.field64, var3, var4, arg2);
        }
        if (arg1.field2746 == 1337) {
        }
    }

    @ObfuscatedName("fb.cj(IIIZI)V")
    public static final void method2990(int arg0, int arg1, int arg2, boolean arg3) {
        if (class173.method2073(arg0)) {
            method2651(Statics.field2868[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dn.cc([Lfd;IIIZB)V")
    public static void method2651(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2754 == arg1) {
                method665(var6, arg2, arg3, arg4);
                Statics.method2(var6, arg2, arg3);
                if (var6.field2763 > var6.field2752 - var6.field2831) {
                    var6.field2763 = var6.field2752 - var6.field2831;
                }
                if (var6.field2763 < 0) {
                    var6.field2763 = 0;
                }
                if (var6.field2764 > var6.field2791 - var6.field2758) {
                    var6.field2764 = var6.field2791 - var6.field2758;
                }
                if (var6.field2764 < 0) {
                    var6.field2764 = 0;
                }
                if (var6.field2744 == 0) {
                    method186(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("au.cg(Lfd;IIZB)V")
    public static void method665(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2831;
        int var5 = arg0.field2758;
        if (arg0.field2736 == 0) {
            arg0.field2831 = arg0.field2753;
        } else if (arg0.field2736 == 1) {
            arg0.field2831 = arg1 - arg0.field2753;
        } else if (arg0.field2736 == 2) {
            arg0.field2831 = arg0.field2753 * arg1 >> 14;
        }
        if (arg0.field2750 == 0) {
            arg0.field2758 = arg0.field2766;
        } else if (arg0.field2750 == 1) {
            arg0.field2758 = arg2 - arg0.field2766;
        } else if (arg0.field2750 == 2) {
            arg0.field2758 = arg0.field2766 * arg2 >> 14;
        }
        if (arg0.field2736 == 4) {
            arg0.field2831 = arg0.field2759 * arg0.field2758 / arg0.field2816;
        }
        if (arg0.field2750 == 4) {
            arg0.field2758 = arg0.field2831 * arg0.field2816 / arg0.field2759;
        }
        if (field454 && arg0.field2744 == 0) {
            if (arg0.field2758 < 5 && arg0.field2831 < 5) {
                arg0.field2758 = 5;
                arg0.field2831 = 5;
            } else {
                if (arg0.field2758 <= 0) {
                    arg0.field2758 = 5;
                }
                if (arg0.field2831 <= 0) {
                    arg0.field2831 = 5;
                }
            }
        }
        if (arg0.field2746 == 1337) {
            field464 = arg0;
        }
        if (arg3 && arg0.field2849 != null && (arg0.field2831 != var4 || arg0.field2758 != var5)) {
            class1 var6 = new class1();
            var6.field7 = arg0;
            var6.field13 = arg0.field2849;
            field491.method3567(var6);
        }
    }

    @ObfuscatedName("eh.ct(Lfd;B)Z")
    public static final boolean method2775(class173 arg0) {
        if (arg0.field2853 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2853.length; var1++) {
            int var2 = method752(arg0, var1);
            int var3 = arg0.field2761[var1];
            if (arg0.field2853[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2853[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2853[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ag.cf(Lfd;IB)I")
    public static final int method752(class173 arg0, int arg1) {
        if (arg0.field2852 == null || arg1 >= arg0.field2852.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2852[arg1];
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
                    var7 = field387[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field417[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field339[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method793(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method646(var12).field1101 || field504)) {
                        for (int var13 = 0; var13 < var11.field2765.length; var13++) {
                            if (var12 + 1 == var11.field2765[var13]) {
                                var7 += var11.field2755[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2889[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2284[field417[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2889[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field143.field38;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2283[var14]) {
                            var7 += field417[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method793(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method646(var18).field1101 || field504)) {
                        for (int var19 = 0; var19 < var17.field2765.length; var19++) {
                            if (var18 + 1 == var17.field2765[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field517;
                }
                if (var6 == 12) {
                    var7 = field458;
                }
                if (var6 == 13) {
                    int var20 = class176.field2889[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method1245(var22);
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
                    var7 = (Statics.field143.field861 >> 7) + Statics.field233;
                }
                if (var6 == 19) {
                    var7 = (Statics.field143.field812 >> 7) + Statics.field647;
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

    @ObfuscatedName("eq.cq(Lfd;IIB)V")
    public static final void method2922(class173 arg0, int arg1, int arg2) {
        if (arg0.field2745 == 1) {
            method1(arg0.field2857, "", 24, 0, 0, arg0.field2742);
        }
        if (arg0.field2745 == 2 && !field323) {
            String var3 = method859(arg0);
            if (var3 != null) {
                method1(var3, class2.method195(65280) + arg0.field2856, 25, 0, -1, arg0.field2742);
            }
        }
        if (arg0.field2745 == 3) {
            method1(class157.field2459, "", 26, 0, 0, arg0.field2742);
        }
        if (arg0.field2745 == 4) {
            method1(arg0.field2857, "", 28, 0, 0, arg0.field2742);
        }
        if (arg0.field2745 == 5) {
            method1(arg0.field2857, "", 29, 0, 0, arg0.field2742);
        }
        if (arg0.field2745 == 6 && field405 == null) {
            method1(arg0.field2857, "", 30, 0, -1, arg0.field2742);
        }
        if (arg0.field2744 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2758; var5++) {
                for (int var6 = 0; var6 < arg0.field2831; var6++) {
                    int var7 = (arg0.field2811 + 32) * var6;
                    int var8 = (arg0.field2776 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2743[var4];
                        var8 += arg0.field2809[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field412 = var4;
                        Statics.field766 = arg0;
                        if (arg0.field2765[var4] > 0) {
                            class52 var9 = class52.method646(arg0.field2765[var4] - 1);
                            if (field445 == 1 && class178.method1790(method46(arg0))) {
                                if (Statics.field198 != arg0.field2742 || Statics.field1380 != var4) {
                                    method1(class157.field2448, field527 + " " + class2.field25 + " " + class2.method195(16748608) + var9.field1113, 31, var9.field1098, var4, arg0.field2742);
                                }
                            } else if (!field323 || !class178.method1790(method46(arg0))) {
                                String[] var10 = var9.field1125;
                                if (field369) {
                                    var10 = method1782(var10);
                                }
                                if (class178.method1790(method46(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method1(var10[var11], class2.method195(16748608) + var9.field1113, var12, var9.field1098, var4, arg0.field2742);
                                        } else if (var11 == 4) {
                                            method1(class157.field2299, class2.method195(16748608) + var9.field1113, 37, var9.field1098, var4, arg0.field2742);
                                        }
                                    }
                                }
                                if (class178.method3025(method46(arg0))) {
                                    method1(class157.field2448, class2.method195(16748608) + var9.field1113, 38, var9.field1098, var4, arg0.field2742);
                                }
                                if (class178.method1790(method46(arg0)) && var10 != null) {
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
                                            method1(var10[var13], class2.method195(16748608) + var9.field1113, var14, var9.field1098, var4, arg0.field2742);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2844;
                                if (field369) {
                                    var15 = method1782(var15);
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
                                            method1(var15[var16], class2.method195(16748608) + var9.field1113, var17, var9.field1098, var4, arg0.field2742);
                                        }
                                    }
                                }
                                method1(class157.field2449, class2.method195(16748608) + var9.field1113, 1005, var9.field1098, var4, arg0.field2742);
                            } else if ((Statics.field2005 & 0x10) == 16) {
                                method1(field450, field397 + " " + class2.field25 + " " + class2.method195(16748608) + var9.field1113, 32, var9.field1098, var4, arg0.field2742);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2779) {
            return;
        }
        if (!field323) {
            for (int var18 = 9; var18 >= 5; var18--) {
                String var19;
                if (!class178.method725(method46(arg0), var18) && arg0.field2840 == null) {
                    var19 = null;
                } else if (arg0.field2814 == null || arg0.field2814.length <= var18 || arg0.field2814[var18] == null || arg0.field2814[var18].trim().length() == 0) {
                    var19 = null;
                } else {
                    var19 = arg0.field2814[var18];
                }
                if (var19 != null) {
                    method1(var19, arg0.field2813, 1007, var18 + 1, arg0.field2817, arg0.field2742);
                }
            }
            String var21 = method859(arg0);
            if (var21 != null) {
                method1(var21, arg0.field2813, 25, 0, arg0.field2817, arg0.field2742);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                String var23;
                if (!class178.method725(method46(arg0), var22) && arg0.field2840 == null) {
                    var23 = null;
                } else if (arg0.field2814 == null || arg0.field2814.length <= var22 || arg0.field2814[var22] == null || arg0.field2814[var22].trim().length() == 0) {
                    var23 = null;
                } else {
                    var23 = arg0.field2814[var22];
                }
                if (var23 != null) {
                    method1(var23, arg0.field2813, 57, var22 + 1, arg0.field2817, arg0.field2742);
                }
            }
            int var25 = method46(arg0);
            boolean var26 = (var25 & 0x1) != 0;
            if (var26) {
                method1(class157.field2303, "", 30, 0, arg0.field2817, arg0.field2742);
            }
        } else if (class178.method598(method46(arg0)) && (Statics.field2005 & 0x20) == 32) {
            method1(field450, field397 + " " + class2.field25 + " " + arg0.field2813, 58, 0, arg0.field2817, arg0.field2742);
        }
    }

    @ObfuscatedName("af.cl(IIIIIIIB)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class173.method2073(arg0)) {
            method2249(Statics.field2868[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("db.cz([Lfd;IIIIIIII)V")
    public static final void method2249(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2779 || var9.field2744 == 0 || var9.field2772 || method46(var9) != 0 || field466 == var9 || var9.field2746 == 1338) && var9.field2754 == arg1 && (!var9.field2779 || !method2653(var9))) {
                int var10 = var9.field2774 + arg6;
                int var11 = var9.field2835 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2744 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2744 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2831 + var10;
                    int var19 = var9.field2758 + var11;
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
                    int var22 = var9.field2831 + var10;
                    int var23 = var9.field2758 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field465 == var9) {
                    field429 = true;
                    field474 = var10;
                    field457 = var11;
                }
                if (!var9.field2779 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2151;
                    int var25 = class140.field2152;
                    if (class140.field2162 != 0) {
                        var24 = class140.field2163;
                        var25 = class140.field2159;
                    }
                    if (var9.field2746 == 1337) {
                        if (!field333 && !field433 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field445 == 0 && !field323) {
                                method1(class157.field2453, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1806; var28++) {
                                int var29 = class105.field1846[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field136.method1821(Statics.field124, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method2705(var33);
                                        if (var34.field961 != null) {
                                            var34 = var34.method819();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field445 == 1) {
                                            method1(class157.field2448, field527 + " " + class2.field25 + " " + class2.method195(65535) + var34.field936, 1, var29, var30, var31);
                                        } else if (!field323) {
                                            String[] var35 = var34.field947;
                                            if (field369) {
                                                var35 = method1782(var35);
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
                                                        method1(var35[var36], class2.method195(65535) + var34.field936, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method1(class157.field2449, class2.method195(65535) + var34.field936, 1002, var34.field927 << 14, var30, var31);
                                        } else if ((Statics.field2005 & 0x4) == 4) {
                                            method1(field450, field397 + " " + class2.field25 + " " + class2.method195(65535) + var34.field936, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field438[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field782.field887 == 1 && (var38.field861 & 0x7F) == 64 && (var38.field812 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field334; var39++) {
                                                class35 var40 = field438[field335[var39]];
                                                if (var40 != null && var38 != var40 && var40.field782.field887 == 1 && var38.field861 == var40.field861 && var38.field812 == var40.field812) {
                                                    Statics.method1788(var40.field782, field335[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field755;
                                            int[] var42 = class33.field754;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field415[var42[var43]];
                                                if (var44 != null && var38.field861 == var44.field861 && var38.field812 == var44.field812) {
                                                    method210(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        Statics.method1788(var38.field782, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field415[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field861 & 0x7F) == 64 && (var45.field812 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field334; var46++) {
                                                class35 var47 = field438[field335[var46]];
                                                if (var47 != null && var47.field782.field887 == 1 && var45.field861 == var47.field861 && var45.field812 == var47.field812) {
                                                    Statics.method1788(var47.field782, field335[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field755;
                                            int[] var49 = class33.field754;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field415[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field861 == var51.field861 && var45.field812 == var51.field812) {
                                                    method210(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field424 == var33) {
                                            var26 = var29;
                                        } else {
                                            method210(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field425[Statics.field124][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3545(); var53 != null; var53 = (class29) var52.method3547()) {
                                                class52 var54 = class52.method646(var53.field689);
                                                if (field445 == 1) {
                                                    method1(class157.field2448, field527 + " " + class2.field25 + " " + class2.method195(16748608) + var54.field1113, 16, var53.field689, var30, var31);
                                                } else if (!field323) {
                                                    String[] var55 = var54.field1114;
                                                    if (field369) {
                                                        var55 = method1782(var55);
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
                                                            method1(var55[var56], class2.method195(16748608) + var54.field1113, var57, var53.field689, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method1(class157.field2298, class2.method195(16748608) + var54.field1113, 20, var53.field689, var30, var31);
                                                        }
                                                    }
                                                    method1(class157.field2449, class2.method195(16748608) + var54.field1113, 1004, var53.field689, var30, var31);
                                                } else if ((Statics.field2005 & 0x1) == 1) {
                                                    method1(field450, field397 + " " + class2.field25 + " " + class2.method195(16748608) + var54.field1113, 17, var53.field689, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field415[field424];
                                method210(var60, field424, var58, var59);
                            }
                        }
                    } else if (var9.field2746 == 1338) {
                        method1244(var9, var10, var11);
                    } else {
                        if (!field433 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2922(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2744 == 0) {
                            if (!var9.field2779 && method2653(var9) && Statics.field218 != var9) {
                                continue;
                            }
                            method2249(arg0, var9.field2742, var12, var13, var14, var15, var10 - var9.field2763, var11 - var9.field2764);
                            if (var9.field2864 != null) {
                                method2249(var9.field2864, var9.field2742, var12, var13, var14, var15, var10 - var9.field2763, var11 - var9.field2764);
                            }
                            class4 var61 = (class4) field453.method3509((long) var9.field2742);
                            if (var61 != null) {
                                if (var61.field63 == 0 && class140.field2151 >= var12 && class140.field2152 >= var13 && class140.field2151 < var14 && class140.field2152 < var15 && !field433 && !field454) {
                                    for (class1 var62 = (class1) field491.method3544(); var62 != null; var62 = (class1) field491.method3538()) {
                                        if (var62.field2) {
                                            var62.method3620();
                                            var62.field7.field2865 = false;
                                        }
                                    }
                                    if (Statics.field3061 == 0) {
                                        field465 = null;
                                        field466 = null;
                                    }
                                    if (!field433) {
                                        field439[0] = class157.field2560;
                                        field440[0] = "";
                                        field437[0] = 1006;
                                        field434 = 1;
                                    }
                                }
                                method1066(var61.field64, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2779) {
                            if (var9.field2873) {
                                if (class140.field2151 >= var12 && class140.field2152 >= var13 && class140.field2151 < var14 && class140.field2152 < var15) {
                                    for (class1 var63 = (class1) field491.method3544(); var63 != null; var63 = (class1) field491.method3538()) {
                                        if (var63.field2) {
                                            var63.method3620();
                                            var63.field7.field2865 = false;
                                        }
                                    }
                                    if (Statics.field3061 == 0) {
                                        field465 = null;
                                        field466 = null;
                                    }
                                    if (!field433) {
                                        field439[0] = class157.field2560;
                                        field440[0] = "";
                                        field437[0] = 1006;
                                        field434 = 1;
                                    }
                                }
                            } else if (var9.field2874 && class140.field2151 >= var12 && class140.field2152 >= var13 && class140.field2151 < var14 && class140.field2152 < var15) {
                                for (class1 var64 = (class1) field491.method3544(); var64 != null; var64 = (class1) field491.method3538()) {
                                    if (var64.field2 && var64.field7.field2839 == var64.field13) {
                                        var64.method3620();
                                    }
                                }
                            }
                            boolean var65;
                            if (class140.field2151 >= var12 && class140.field2152 >= var13 && class140.field2151 < var14 && class140.field2152 < var15) {
                                var65 = true;
                            } else {
                                var65 = false;
                            }
                            boolean var66 = false;
                            if ((class140.field2150 == 1 || !Statics.field592 && class140.field2150 == 4) && var65) {
                                var66 = true;
                            }
                            boolean var67 = false;
                            if ((class140.field2162 == 1 || !Statics.field592 && class140.field2162 == 4) && class140.field2163 >= var12 && class140.field2159 >= var13 && class140.field2163 < var14 && class140.field2159 < var15) {
                                var67 = true;
                            }
                            if (var67) {
                                method3462(var9, class140.field2163 - var10, class140.field2159 - var11);
                            }
                            if (field465 != null && field465 != var9 && var65) {
                                int var68 = method46(var9);
                                boolean var69 = (var68 >> 20 & 0x1) != 0;
                                if (var69) {
                                    field469 = var9;
                                }
                            }
                            if (field466 == var9) {
                                field470 = true;
                                field471 = var10;
                                field472 = var11;
                            }
                            if (var9.field2772) {
                                if (var65 && field441 != 0 && var9.field2839 != null) {
                                    class1 var70 = new class1();
                                    var70.field2 = true;
                                    var70.field7 = var9;
                                    var70.field5 = field441;
                                    var70.field13 = var9.field2839;
                                    field491.method3567(var70);
                                }
                                if (field465 != null || Statics.field1955 != null || field433) {
                                    var67 = false;
                                    var66 = false;
                                    var65 = false;
                                }
                                if (!var9.field2866 && var67) {
                                    var9.field2866 = true;
                                    if (var9.field2822 != null) {
                                        class1 var71 = new class1();
                                        var71.field2 = true;
                                        var71.field7 = var9;
                                        var71.field4 = class140.field2163 - var10;
                                        var71.field5 = class140.field2159 - var11;
                                        var71.field13 = var9.field2822;
                                        field491.method3567(var71);
                                    }
                                }
                                if (var9.field2866 && var66 && var9.field2823 != null) {
                                    class1 var72 = new class1();
                                    var72.field2 = true;
                                    var72.field7 = var9;
                                    var72.field4 = class140.field2151 - var10;
                                    var72.field5 = class140.field2152 - var11;
                                    var72.field13 = var9.field2823;
                                    field491.method3567(var72);
                                }
                                if (var9.field2866 && !var66) {
                                    var9.field2866 = false;
                                    if (var9.field2824 != null) {
                                        class1 var73 = new class1();
                                        var73.field2 = true;
                                        var73.field7 = var9;
                                        var73.field4 = class140.field2151 - var10;
                                        var73.field5 = class140.field2152 - var11;
                                        var73.field13 = var9.field2824;
                                        field556.method3567(var73);
                                    }
                                }
                                if (var66 && var9.field2825 != null) {
                                    class1 var74 = new class1();
                                    var74.field2 = true;
                                    var74.field7 = var9;
                                    var74.field4 = class140.field2151 - var10;
                                    var74.field5 = class140.field2152 - var11;
                                    var74.field13 = var9.field2825;
                                    field491.method3567(var74);
                                }
                                if (!var9.field2865 && var65) {
                                    var9.field2865 = true;
                                    if (var9.field2826 != null) {
                                        class1 var75 = new class1();
                                        var75.field2 = true;
                                        var75.field7 = var9;
                                        var75.field4 = class140.field2151 - var10;
                                        var75.field5 = class140.field2152 - var11;
                                        var75.field13 = var9.field2826;
                                        field491.method3567(var75);
                                    }
                                }
                                if (var9.field2865 && var65 && var9.field2827 != null) {
                                    class1 var76 = new class1();
                                    var76.field2 = true;
                                    var76.field7 = var9;
                                    var76.field4 = class140.field2151 - var10;
                                    var76.field5 = class140.field2152 - var11;
                                    var76.field13 = var9.field2827;
                                    field491.method3567(var76);
                                }
                                if (var9.field2865 && !var65) {
                                    var9.field2865 = false;
                                    if (var9.field2828 != null) {
                                        class1 var77 = new class1();
                                        var77.field2 = true;
                                        var77.field7 = var9;
                                        var77.field4 = class140.field2151 - var10;
                                        var77.field5 = class140.field2152 - var11;
                                        var77.field13 = var9.field2828;
                                        field556.method3567(var77);
                                    }
                                }
                                if (var9.field2741 != null) {
                                    class1 var78 = new class1();
                                    var78.field7 = var9;
                                    var78.field13 = var9.field2741;
                                    field545.method3567(var78);
                                }
                                if (var9.field2833 != null && field479 > var9.field2787) {
                                    if (var9.field2834 == null || field479 - var9.field2787 > 32) {
                                        class1 var83 = new class1();
                                        var83.field7 = var9;
                                        var83.field13 = var9.field2833;
                                        field491.method3567(var83);
                                    } else {
                                        label829: for (int var79 = var9.field2787; var79 < field479; var79++) {
                                            int var80 = field478[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var9.field2834.length; var81++) {
                                                if (var9.field2834[var81] == var80) {
                                                    class1 var82 = new class1();
                                                    var82.field7 = var9;
                                                    var82.field13 = var9.field2833;
                                                    field491.method3567(var82);
                                                    break label829;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2787 = field479;
                                }
                                if (var9.field2843 != null && field481 > var9.field2819) {
                                    if (var9.field2836 == null || field481 - var9.field2819 > 32) {
                                        class1 var88 = new class1();
                                        var88.field7 = var9;
                                        var88.field13 = var9.field2843;
                                        field491.method3567(var88);
                                    } else {
                                        label805: for (int var84 = var9.field2819; var84 < field481; var84++) {
                                            int var85 = field480[var84 & 0x1F];
                                            for (int var86 = 0; var86 < var9.field2836.length; var86++) {
                                                if (var9.field2836[var86] == var85) {
                                                    class1 var87 = new class1();
                                                    var87.field7 = var9;
                                                    var87.field13 = var9.field2843;
                                                    field491.method3567(var87);
                                                    break label805;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2819 = field481;
                                }
                                if (var9.field2837 != null && field483 > var9.field2870) {
                                    if (var9.field2838 == null || field483 - var9.field2870 > 32) {
                                        class1 var93 = new class1();
                                        var93.field7 = var9;
                                        var93.field13 = var9.field2837;
                                        field491.method3567(var93);
                                    } else {
                                        label781: for (int var89 = var9.field2870; var89 < field483; var89++) {
                                            int var90 = field482[var89 & 0x1F];
                                            for (int var91 = 0; var91 < var9.field2838.length; var91++) {
                                                if (var9.field2838[var91] == var90) {
                                                    class1 var92 = new class1();
                                                    var92.field7 = var9;
                                                    var92.field13 = var9.field2837;
                                                    field491.method3567(var92);
                                                    break label781;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2870 = field483;
                                }
                                if (field484 > var9.field2867 && var9.field2842 != null) {
                                    class1 var94 = new class1();
                                    var94.field7 = var9;
                                    var94.field13 = var9.field2842;
                                    field491.method3567(var94);
                                }
                                if (field485 > var9.field2867 && var9.field2789 != null) {
                                    class1 var95 = new class1();
                                    var95.field7 = var9;
                                    var95.field13 = var9.field2789;
                                    field491.method3567(var95);
                                }
                                if (field507 > var9.field2867 && var9.field2845 != null) {
                                    class1 var96 = new class1();
                                    var96.field7 = var9;
                                    var96.field13 = var9.field2845;
                                    field491.method3567(var96);
                                }
                                if (field499 > var9.field2867 && var9.field2850 != null) {
                                    class1 var97 = new class1();
                                    var97.field7 = var9;
                                    var97.field13 = var9.field2850;
                                    field491.method3567(var97);
                                }
                                if (field488 > var9.field2867 && var9.field2851 != null) {
                                    class1 var98 = new class1();
                                    var98.field7 = var9;
                                    var98.field13 = var9.field2851;
                                    field491.method3567(var98);
                                }
                                if (field459 > var9.field2867 && var9.field2846 != null) {
                                    class1 var99 = new class1();
                                    var99.field7 = var9;
                                    var99.field13 = var9.field2846;
                                    field491.method3567(var99);
                                }
                                var9.field2867 = field477;
                                if (var9.field2732 != null) {
                                    for (int var100 = 0; var100 < field537; var100++) {
                                        class1 var101 = new class1();
                                        var101.field7 = var9;
                                        var101.field8 = field296[var100];
                                        var101.field9 = field516[var100];
                                        var101.field13 = var9.field2732;
                                        field491.method3567(var101);
                                    }
                                }
                            }
                        }
                        if (!var9.field2779 && field465 == null && Statics.field1955 == null && !field433) {
                            if ((var9.field2748 >= 0 || var9.field2855 != 0) && class140.field2151 >= var12 && class140.field2152 >= var13 && class140.field2151 < var14 && class140.field2152 < var15) {
                                if (var9.field2748 >= 0) {
                                    Statics.field218 = arg0[var9.field2748];
                                } else {
                                    Statics.field218 = var9;
                                }
                            }
                            if (var9.field2744 == 8 && class140.field2151 >= var12 && class140.field2152 >= var13 && class140.field2151 < var14 && class140.field2152 < var15) {
                                Statics.field2245 = var9;
                            }
                            if (var9.field2791 > var9.field2758) {
                                int var102 = var9.field2831 + var10;
                                int var103 = var9.field2758;
                                int var104 = var9.field2791;
                                int var105 = class140.field2151;
                                int var106 = class140.field2152;
                                if (field456) {
                                    field377 = 32;
                                } else {
                                    field377 = 0;
                                }
                                field456 = false;
                                if (class140.field2150 == 1 || !Statics.field592 && class140.field2150 == 4) {
                                    if (var105 >= var102 && var105 < var102 + 16 && var106 >= var11 && var106 < var11 + 16) {
                                        var9.field2764 -= 4;
                                        method13(var9);
                                    } else if (var105 >= var102 && var105 < var102 + 16 && var106 >= var11 + var103 - 16 && var106 < var11 + var103) {
                                        var9.field2764 += 4;
                                        method13(var9);
                                    } else if (var105 >= var102 - field377 && var105 < field377 + var102 + 16 && var106 >= var11 + 16 && var106 < var11 + var103 - 16) {
                                        int var107 = (var103 - 32) * var103 / var104;
                                        if (var107 < 8) {
                                            var107 = 8;
                                        }
                                        int var108 = var106 - var11 - 16 - var107 / 2;
                                        int var109 = var103 - 32 - var107;
                                        var9.field2764 = (var104 - var103) * var108 / var109;
                                        method13(var9);
                                        field456 = true;
                                    }
                                }
                                if (field441 != 0) {
                                    int var110 = var9.field2831;
                                    if (var105 >= var102 - var110 && var106 >= var11 && var105 < var102 + 16 && var106 <= var11 + var103) {
                                        var9.field2764 += field441 * 45;
                                        method13(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.cm(III)V")
    public static final void method2329(int arg0, int arg1) {
        if (class173.method2073(arg0)) {
            method2069(Statics.field2868[arg0], arg1);
        }
    }

    @ObfuscatedName("ct.cw([Lfd;IB)V")
    public static final void method2069(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2744 == 0) {
                    if (var3.field2864 != null) {
                        method2069(var3.field2864, arg1);
                    }
                    class4 var4 = (class4) field453.method3509((long) var3.field2742);
                    if (var4 != null) {
                        method2329(var4.field64, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2847 != null) {
                    class1 var5 = new class1();
                    var5.field7 = var3;
                    var5.field13 = var3.field2847;
                    class37.method2961(var5);
                }
                if (arg1 == 1 && var3.field2848 != null) {
                    if (var3.field2817 >= 0) {
                        class173 var6 = class173.method793(var3.field2742);
                        if (var6 == null || var6.field2864 == null || var3.field2817 >= var6.field2864.length || var6.field2864[var3.field2817] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field7 = var3;
                    var7.field13 = var3.field2848;
                    class37.method2961(var7);
                }
            }
        }
    }

    @ObfuscatedName("gt.ca(Lfd;III)V")
    public static final void method3462(class173 arg0, int arg1, int arg2) {
        if (field465 != null || field433 || arg0 == null || method163(arg0) == null) {
            return;
        }
        field465 = arg0;
        field466 = method163(arg0);
        field467 = arg1;
        field355 = arg2;
        Statics.field3061 = 0;
        field476 = false;
        if (field434 <= 0) {
            return;
        }
        int var3 = field434 - 1;
        Statics.field815 = new class31();
        Statics.field815.field709 = field410[var3];
        Statics.field815.field705 = field539[var3];
        Statics.field815.field712 = field437[var3];
        Statics.field815.field707 = field555[var3];
        Statics.field815.field708 = field439[var3];
    }

    @ObfuscatedName("ce.ci(IIB)V")
    public static void method1783(int arg0, int arg1) {
        class31 var2 = Statics.field815;
        method2777(var2.field709, var2.field705, var2.field712, var2.field707, var2.field708, var2.field708, arg0, arg1);
        Statics.field815 = null;
    }

    @ObfuscatedName("e.cu(Lfd;I)V")
    public static void method13(class173 arg0) {
        if (field496 == arg0.field2872) {
            field497[arg0.field2871] = true;
        }
    }

    @ObfuscatedName("av.dt(I)V")
    public static void method992() {
        for (class4 var0 = (class4) field453.method3512(); var0 != null; var0 = (class4) field453.method3513()) {
            int var1 = var0.field64;
            if (class173.method2073(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2868[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2779;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3107;
                    class173 var6 = class173.method793(var5);
                    if (var6 != null) {
                        method13(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.db(Lfd;I)Lfd;")
    public static class173 method163(class173 arg0) {
        class173 var1 = arg0;
        int var2 = method46(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class173 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class173.method793(var1.field2754);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class173 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2799;
        }
        return var7;
    }

    @ObfuscatedName("ce.dv([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1782(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("az.do(IS)V")
    public static final void method849(int arg0) {
        if (!class173.method2073(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2868[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2862 = 0;
                var3.field2863 = 0;
            }
        }
    }

    @ObfuscatedName("t.dh(II)V")
    public static final void method114(int arg0) {
        if (class173.method2073(arg0)) {
            method602(Statics.field2868[arg0], -1);
        }
    }

    @ObfuscatedName("n.dd([Lfd;II)V")
    public static final void method602(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2754 == arg1 && (!var3.field2779 || !method2653(var3))) {
                if (var3.field2744 == 0) {
                    if (!var3.field2779 && method2653(var3) && Statics.field218 != var3) {
                        continue;
                    }
                    method602(arg0, var3.field2742);
                    if (var3.field2864 != null) {
                        method602(var3.field2864, var3.field2742);
                    }
                    class4 var4 = (class4) field453.method3509((long) var3.field2742);
                    if (var4 != null) {
                        method114(var4.field64);
                    }
                }
                if (var3.field2744 == 6) {
                    if (var3.field2788 != -1 || var3.field2757 != -1) {
                        boolean var5 = method2775(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2757;
                        } else {
                            var6 = var3.field2788;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method2304(var6);
                            var3.field2863 += field371;
                            while (var3.field2863 > var7.field984[var3.field2862]) {
                                var3.field2863 -= var7.field984[var3.field2862];
                                var3.field2862++;
                                if (var3.field2862 >= var7.field981.length) {
                                    var3.field2862 -= var7.field988;
                                    if (var3.field2862 < 0 || var3.field2862 >= var7.field981.length) {
                                        var3.field2862 = 0;
                                    }
                                }
                                method13(var3);
                            }
                        }
                    }
                    if (var3.field2796 != 0 && !var3.field2779) {
                        int var8 = var3.field2796 >> 16;
                        int var9 = var3.field2796 << 16 >> 16;
                        int var10 = field371 * var8;
                        int var11 = field371 * var9;
                        var3.field2769 = var3.field2769 + var10 & 0x7FF;
                        var3.field2792 = var3.field2792 + var11 & 0x7FF;
                        method13(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("et.de(IB)V")
    public static final void method2821(int arg0) {
        method992();
        class24.method182();
        int var1 = class53.method753(arg0).field1149;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2889[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method1975(0.9D);
                ((class95) Statics.field1564).method2057(0.9D);
            }
            if (var2 == 2) {
                class91.method1975(0.8D);
                ((class95) Statics.field1564).method2057(0.8D);
            }
            if (var2 == 3) {
                class91.method1975(0.7D);
                ((class95) Statics.field1564).method2057(0.7D);
            }
            if (var2 == 4) {
                class91.method1975(0.6D);
                ((class95) Statics.field1564).method2057(0.6D);
            }
            class52.method895();
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
            if (field546 != var3) {
                if (field546 == 0 && field530 != -1) {
                    class183.method995(Statics.field1868, field530, 0, var3, false);
                    field462 = false;
                } else if (var3 == 0) {
                    Statics.field2941.method3366();
                    class183.field2945 = 1;
                    Statics.field2579 = null;
                    field462 = false;
                } else if (class183.field2945 == 0) {
                    Statics.field2941.method3360(var3);
                } else {
                    Statics.field2047 = var3;
                }
                field546 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field532 = 127;
            }
            if (var2 == 1) {
                field532 = 96;
            }
            if (var2 == 2) {
                field532 = 64;
            }
            if (var2 == 3) {
                field532 = 32;
            }
            if (var2 == 4) {
                field532 = 0;
            }
        }
        if (var1 == 5) {
            field432 = var2;
        }
        if (var1 == 6) {
            field385 = var2;
        }
        if (var1 == 9) {
            field455 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field533 = 127;
            }
            if (var2 == 1) {
                field533 = 96;
            }
            if (var2 == 2) {
                field533 = 64;
            }
            if (var2 == 3) {
                field533 = 32;
            }
            if (var2 == 4) {
                field533 = 0;
            }
        }
        if (var1 == 17) {
            field529 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field321 = (class21) class109.method2675(class21.method90(), var2);
            if (field321 == null) {
                field321 = class21.field582;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field424 = -1;
            } else {
                field424 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field307 = (class21) class109.method2675(class21.method90(), var2);
            if (field307 == null) {
                field307 = class21.field582;
            }
        }
    }

    @ObfuscatedName("dq.da(Lfd;I)V")
    public static final void method2682(class173 arg0) {
        int var1 = arg0.field2746;
        if (var1 == 324) {
            if (field567 == -1) {
                field567 = arg0.field2775;
                field568 = arg0.field2806;
            }
            if (field572.field2901) {
                arg0.field2775 = field567;
            } else {
                arg0.field2775 = field568;
            }
        } else if (var1 == 325) {
            if (field567 == -1) {
                field567 = arg0.field2775;
                field568 = arg0.field2806;
            }
            if (field572.field2901) {
                arg0.field2775 = field568;
            } else {
                arg0.field2775 = field567;
            }
        } else if (var1 == 327) {
            arg0.field2769 = 150;
            arg0.field2792 = (int) (Math.sin((double) field548 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2783 = 5;
            arg0.field2786 = 0;
        } else if (var1 == 328) {
            arg0.field2769 = 150;
            arg0.field2792 = (int) (Math.sin((double) field548 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2783 = 5;
            arg0.field2786 = 1;
        }
    }

    @ObfuscatedName("t.ds(IIII)Lo;")
    public static final class4 method113(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field64 = arg1;
        var3.field63 = arg2;
        field453.method3518(var3, (long) arg0);
        method849(arg1);
        class173 var4 = class173.method793(arg0);
        method13(var4);
        if (field405 != null) {
            method13(field405);
            field405 = null;
        }
        method2953();
        method186(Statics.field2868[arg0 >> 16], var4, false);
        class37.method164(arg1);
        if (field452 != -1) {
            method2329(field452, 1);
        }
        return var3;
    }

    @ObfuscatedName("bs.dr(Lo;ZB)V")
    public static final void method1214(class4 arg0, boolean arg1) {
        int var2 = arg0.field64;
        int var3 = (int) arg0.field3107;
        arg0.method3620();
        if (arg1) {
            class173.method3644(var2);
        }
        for (class201 var4 = (class201) field494.method3512(); var4 != null; var4 = (class201) field494.method3513()) {
            if ((long) var2 == (var4.field3107 >> 48 & 0xFFFFL)) {
                var4.method3620();
            }
        }
        class173 var5 = class173.method793(var3);
        if (var5 != null) {
            method13(var5);
        }
        method2953();
        if (field452 != -1) {
            method2329(field452, 1);
        }
    }

    @ObfuscatedName("du.du(Lfd;I)Z")
    public static final boolean method2325(class173 arg0) {
        int var1 = arg0.field2746;
        if (var1 == 205) {
            field348 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field572.method3241(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field572.method3242(var4, var5 == 1);
        }
        if (var1 == 324) {
            field572.method3243(false);
        }
        if (var1 == 325) {
            field572.method3243(true);
        }
        if (var1 == 326) {
            field338.method2622(113);
            field572.method3244(field338);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("eu.dw(Lfd;IIII)V")
    public static final void method2958(class173 arg0, int arg1, int arg2, int arg3) {
        method1013();
        class175 var4 = arg0.method3180(false);
        if (var4 == null) {
            return;
        }
        class80.method1701(arg1, arg2, var4.field2883 + arg1, var4.field2882 + arg2);
        if (field487 == 2 || field487 == 5) {
            class80.method1734(arg1, arg2, 0, var4.field2884, var4.field2881);
        } else {
            int var5 = field443 + field442 & 0x7FF;
            int var6 = Statics.field143.field861 / 32 + 48;
            int var7 = 464 - Statics.field143.field812 / 32;
            Statics.field1090.method1654(arg1, arg2, var4.field2883, var4.field2882, var6, var7, var5, field295 + 256, var4.field2884, var4.field2881);
            for (int var8 = 0; var8 < field522; var8++) {
                int var9 = field328[var8] * 4 + 2 - Statics.field143.field861 / 32;
                int var10 = field524[var8] * 4 + 2 - Statics.field143.field812 / 32;
                method177(arg1, arg2, var9, var10, field525[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field425[Statics.field124][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field143.field861 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field143.field812 / 32;
                        method177(arg1, arg2, var14, var15, Statics.field1360[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field334; var16++) {
                class35 var17 = field438[field335[var16]];
                if (var17 != null && var17.method22()) {
                    class40 var18 = var17.field782;
                    if (var18 != null && var18.field892 != null) {
                        var18 = var18.method762();
                    }
                    if (var18 != null && var18.field911 && var18.field888) {
                        int var19 = var17.field861 / 32 - Statics.field143.field861 / 32;
                        int var20 = var17.field812 / 32 - Statics.field143.field812 / 32;
                        method177(arg1, arg2, var19, var20, Statics.field1360[1], var4);
                    }
                }
            }
            int var21 = class33.field755;
            int[] var22 = class33.field754;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field415[var22[var23]];
                if (var24 != null && var24.method22() && !var24.field56 && Statics.field143 != var24) {
                    int var25 = var24.field861 / 32 - Statics.field143.field861 / 32;
                    int var26 = var24.field812 / 32 - Statics.field143.field812 / 32;
                    boolean var27 = false;
                    if (Statics.method2169(var24.field48, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field1944; var29++) {
                        if (var24.field48.equals(Statics.field2189[var29].field630)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field143.field52 != 0 && var24.field52 != 0 && Statics.field143.field52 == var24.field52) {
                        var30 = true;
                    }
                    if (var27) {
                        method177(arg1, arg2, var25, var26, Statics.field1360[3], var4);
                    } else if (var30) {
                        method177(arg1, arg2, var25, var26, Statics.field1360[4], var4);
                    } else if (var28) {
                        method177(arg1, arg2, var25, var26, Statics.field1360[5], var4);
                    } else {
                        method177(arg1, arg2, var25, var26, Statics.field1360[2], var4);
                    }
                }
            }
            if (field420 != 0 && field548 % 20 < 10) {
                if (field420 == 1 && field314 >= 0 && field314 < field438.length) {
                    class35 var31 = field438[field314];
                    if (var31 != null) {
                        int var32 = var31.field861 / 32 - Statics.field143.field861 / 32;
                        int var33 = var31.field812 / 32 - Statics.field143.field812 / 32;
                        method2306(arg1, arg2, var32, var33, Statics.field1588[1], var4);
                    }
                }
                if (field420 == 2) {
                    int var34 = field316 * 4 - Statics.field233 * 4 + 2 - Statics.field143.field861 / 32;
                    int var35 = field317 * 4 - Statics.field647 * 4 + 2 - Statics.field143.field812 / 32;
                    method2306(arg1, arg2, var34, var35, Statics.field1588[1], var4);
                }
                if (field420 == 10 && field563 >= 0 && field563 < field415.length) {
                    class3 var36 = field415[field563];
                    if (var36 != null) {
                        int var37 = var36.field861 / 32 - Statics.field143.field861 / 32;
                        int var38 = var36.field812 / 32 - Statics.field143.field812 / 32;
                        method2306(arg1, arg2, var37, var38, Statics.field1588[1], var4);
                    }
                }
            }
            if (field526 != 0) {
                int var39 = field526 * 4 + 2 - Statics.field143.field861 / 32;
                int var40 = field353 * 4 + 2 - Statics.field143.field812 / 32;
                method177(arg1, arg2, var39, var40, Statics.field1588[0], var4);
            }
            if (!Statics.field143.field56) {
                class80.method1737(var4.field2883 / 2 + arg1 - 1, var4.field2882 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field498[arg3] = true;
    }

    @ObfuscatedName("dd.dp(IIIILcr;Lfm;I)V")
    public static final void method2306(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method177(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field443 + field442 & 0x7FF;
        int var8 = class91.field1550[var7];
        int var9 = class91.field1568[var7];
        int var10 = var8 * 256 / (field295 + 256);
        int var11 = var9 * 256 / (field295 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1363.method1635(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("f.dl(IIIILcr;Lfm;I)V")
    public static final void method177(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field443 + field442 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1550[var6];
        int var9 = class91.field1568[var6];
        int var10 = var8 * 256 / (field295 + 256);
        int var11 = var9 * 256 / (field295 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1628(arg5.field2883 / 2 + var12 - arg4.field1395 / 2, arg5.field2882 / 2 - var13 - arg4.field1396 / 2, arg0, arg1, arg5.field2883, arg5.field2882, arg5.field2884, arg5.field2881);
        } else {
            arg4.method1618(arg5.field2883 / 2 + arg0 + var12 - arg4.field1395 / 2, arg5.field2882 / 2 + arg1 - var13 - arg4.field1396 / 2);
        }
    }

    @ObfuscatedName("n.dj(Ljava/lang/String;I)Z")
    public static boolean method601(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method2070(arg0, Statics.field489);
        for (int var2 = 0; var2 < field564; var2++) {
            class8 var3 = field565[var2];
            if (var1.equalsIgnoreCase(class164.method2070(var3.field131, Statics.field489))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method2070(var3.field129, Statics.field489))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bo.dx(Ljava/lang/String;I)V")
    public static final void method1528(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method2070(arg0, Statics.field489);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field564; var2++) {
            class8 var3 = field565[var2];
            String var4 = var3.field131;
            String var5 = class164.method2070(var4, Statics.field489);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field564--;
                for (int var7 = var2; var7 < field564; var7++) {
                    field565[var7] = field565[var7 + 1];
                }
                field485 = field477;
                field338.method2622(129);
                field338.method2503(class119.method156(arg0));
                field338.method2379(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("j.dn(Ljava/lang/String;I)V")
    public static final void method162(String arg0) {
        if (Statics.field2189 != null) {
            field338.method2622(180);
            field338.method2503(class119.method156(arg0));
            field338.method2379(arg0);
        }
    }

    @ObfuscatedName("au.dm(I)V")
    public static final void method663() {
        field338.method2622(64);
        field338.method2503(0);
    }

    @ObfuscatedName("o.dc(Lfd;B)I")
    public static int method46(class173 arg0) {
        class201 var1 = (class201) field494.method3509(((long) arg0.field2742 << 32) + (long) arg0.field2817);
        return var1 == null ? arg0.field2812 : var1.field3092;
    }

    @ObfuscatedName("dm.dy(Lfd;I)Z")
    public static boolean method2653(class173 arg0) {
        if (field454) {
            if (method46(arg0) != 0) {
                return false;
            }
            if (arg0.field2744 == 0) {
                return false;
            }
        }
        return arg0.field2762;
    }

    @ObfuscatedName("az.dq(Lfd;I)Ljava/lang/String;")
    public static String method859(class173 arg0) {
        int var1 = method46(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2756 == null || arg0.field2756.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2756;
        }
    }

    @ObfuscatedName("eq.dz(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2918(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field297 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field297 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field297 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field297 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field297 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field447 != null) {
            var3 = "/p=" + Statics.field447;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field301 + "/a=" + Statics.field3148 + var3 + "/";
    }

    @ObfuscatedName("eg.dg(Ljava/lang/String;I)V")
    public static void method2944(String arg0) {
        Statics.field447 = arg0;
        try {
            String var1 = Statics.field293.getParameter(class190.field3052.field3055);
            String var2 = Statics.field293.getParameter(class190.field3046.field3055);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class111.method1257(class115.method2266() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field293;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }
}

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
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.i")
    public static boolean field438 = true;

    @ObfuscatedName("client.q")
    public static int field357 = 1;

    @ObfuscatedName("client.p")
    public static int field287 = 0;

    @ObfuscatedName("client.f")
    public static int field324 = 0;

    @ObfuscatedName("client.w")
    public static class108[] field346 = new class108[4];

    @ObfuscatedName("client.k")
    public static boolean field290 = false;

    @ObfuscatedName("client.o")
    public static boolean field291 = false;

    @ObfuscatedName("client.u")
    public static int field315 = 0;

    @ObfuscatedName("client.z")
    public static int field536 = 0;

    @ObfuscatedName("client.r")
    public static boolean field294 = true;

    @ObfuscatedName("client.d")
    public static int field295 = 0;

    @ObfuscatedName("client.n")
    public static long field296 = -1L;

    @ObfuscatedName("client.b")
    public static int field396 = -1;

    @ObfuscatedName("client.e")
    public static int field298 = -1;

    @ObfuscatedName("client.ai")
    public static int field367 = -1;

    @ObfuscatedName("client.ao")
    public static boolean field490 = true;

    @ObfuscatedName("client.af")
    public static boolean field301 = false;

    @ObfuscatedName("client.ab")
    public static int field464 = 0;

    @ObfuscatedName("client.ax")
    public static int field303 = 0;

    @ObfuscatedName("client.ap")
    public static int field304 = 0;

    @ObfuscatedName("client.as")
    public static int field305 = 0;

    @ObfuscatedName("client.av")
    public static int field333 = 0;

    @ObfuscatedName("client.am")
    public static int field307 = 0;

    @ObfuscatedName("client.aa")
    public static int field393 = 0;

    @ObfuscatedName("client.aq")
    public static int field408 = 0;

    @ObfuscatedName("client.ad")
    public static int field310 = 0;

    @ObfuscatedName("client.ae")
    public static class21 field311 = class21.field576;

    @ObfuscatedName("client.az")
    public static int field312 = 0;

    @ObfuscatedName("client.al")
    public static int field313 = 0;

    @ObfuscatedName("client.at")
    public static int field314 = 0;

    @ObfuscatedName("client.bu")
    public static int field517 = 0;

    @ObfuscatedName("client.bc")
    public static int field318 = 0;

    @ObfuscatedName("client.bb")
    public static int field319 = 0;

    @ObfuscatedName("client.bq")
    public static int field320 = 0;

    @ObfuscatedName("client.bz")
    public static int field537 = 0;

    @ObfuscatedName("client.cg")
    public static class35[] field326 = new class35[32768];

    @ObfuscatedName("client.cm")
    public static int field316 = 0;

    @ObfuscatedName("client.cn")
    public static int[] field325 = new int[32768];

    @ObfuscatedName("client.cb")
    public static int field336 = 0;

    @ObfuscatedName("client.ce")
    public static int[] field327 = new int[250];

    @ObfuscatedName("client.ck")
    public static class122 field329 = new class122(5000);

    @ObfuscatedName("client.ct")
    public static class122 field330 = new class122(5000);

    @ObfuscatedName("client.cd")
    public static class122 field331 = new class122(15000);

    @ObfuscatedName("client.cs")
    public static int field444 = 0;

    @ObfuscatedName("client.cw")
    public static int field523 = 0;

    @ObfuscatedName("client.cu")
    public static int field450 = 0;

    @ObfuscatedName("client.cv")
    public static int field335 = 0;

    @ObfuscatedName("client.cr")
    public static int field454 = 0;

    @ObfuscatedName("client.cx")
    public static int field362 = 0;

    @ObfuscatedName("client.cy")
    public static int field338 = 0;

    @ObfuscatedName("client.cf")
    public static int field339 = 0;

    @ObfuscatedName("client.cj")
    public static boolean field529 = false;

    @ObfuscatedName("client.dl")
    public static int field341 = 0;

    @ObfuscatedName("client.dh")
    public static int field366 = 1;

    @ObfuscatedName("client.dj")
    public static int field343 = 0;

    @ObfuscatedName("client.df")
    public static int field540 = 1;

    @ObfuscatedName("client.dg")
    public static int field345 = 0;

    @ObfuscatedName("client.dv")
    public static boolean field354 = false;

    @ObfuscatedName("client.dn")
    public static int[][][] field556 = new int[4][13][13];

    @ObfuscatedName("client.dd")
    public static final int[] field508 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dy")
    public static int field350 = 0;

    @ObfuscatedName("client.dx")
    public static int field521 = 2;

    @ObfuscatedName("client.do")
    public static int field352 = 0;

    @ObfuscatedName("client.dr")
    public static int field353 = 2;

    @ObfuscatedName("client.da")
    public static int field572 = 0;

    @ObfuscatedName("client.dc")
    public static int field355 = 1;

    @ObfuscatedName("client.eh")
    public static int field356 = 0;

    @ObfuscatedName("client.et")
    public static int field358 = 0;

    @ObfuscatedName("client.ee")
    public static int field419 = 2;

    @ObfuscatedName("client.el")
    public static int field359 = 0;

    @ObfuscatedName("client.ew")
    public static int field360 = 1;

    @ObfuscatedName("client.ev")
    public static int field361 = 0;

    @ObfuscatedName("client.ex")
    public static int field351 = 0;

    @ObfuscatedName("client.eq")
    public static int field364 = 2301979;

    @ObfuscatedName("client.er")
    public static int field561 = 5063219;

    @ObfuscatedName("client.ey")
    public static int field401 = 3353893;

    @ObfuscatedName("client.ea")
    public static int field474 = 7759444;

    @ObfuscatedName("client.en")
    public static boolean field368 = false;

    @ObfuscatedName("client.es")
    public static int field369 = 0;

    @ObfuscatedName("client.fp")
    public static int field370 = 128;

    @ObfuscatedName("client.fw")
    public static int field371 = 0;

    @ObfuscatedName("client.fi")
    public static int field372 = 0;

    @ObfuscatedName("client.fz")
    public static int field373 = 0;

    @ObfuscatedName("client.fe")
    public static int field374 = 0;

    @ObfuscatedName("client.fv")
    public static int field344 = 0;

    @ObfuscatedName("client.fb")
    public static int field376 = 50;

    @ObfuscatedName("client.ft")
    public static int field377 = 0;

    @ObfuscatedName("client.fd")
    public static boolean field378 = false;

    @ObfuscatedName("client.fu")
    public static int field475 = 0;

    @ObfuscatedName("client.fs")
    public static int field380 = 0;

    @ObfuscatedName("client.fy")
    public static int field455 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field382 = new int[field455];

    @ObfuscatedName("client.fx")
    public static int[] field383 = new int[field455];

    @ObfuscatedName("client.fo")
    public static int[] field434 = new int[field455];

    @ObfuscatedName("client.fn")
    public static int[] field385 = new int[field455];

    @ObfuscatedName("client.ff")
    public static int[] field386 = new int[field455];

    @ObfuscatedName("client.fk")
    public static int[] field387 = new int[field455];

    @ObfuscatedName("client.fr")
    public static int[] field388 = new int[field455];

    @ObfuscatedName("client.go")
    public static String[] field389 = new String[field455];

    @ObfuscatedName("client.gt")
    public static int[][] field445 = new int[104][104];

    @ObfuscatedName("client.ge")
    public static int field391 = 0;

    @ObfuscatedName("client.gn")
    public static int field539 = -1;

    @ObfuscatedName("client.gi")
    public static int field286 = -1;

    @ObfuscatedName("client.ga")
    public static int field394 = 0;

    @ObfuscatedName("client.gy")
    public static int field395 = 0;

    @ObfuscatedName("client.gp")
    public static int field485 = 0;

    @ObfuscatedName("client.gs")
    public static int field447 = 0;

    @ObfuscatedName("client.gf")
    public static int field398 = 0;

    @ObfuscatedName("client.gk")
    public static int field399 = 0;

    @ObfuscatedName("client.gb")
    public static int field400 = 0;

    @ObfuscatedName("client.gd")
    public static int field365 = 0;

    @ObfuscatedName("client.gu")
    public static int field402 = 0;

    @ObfuscatedName("client.gc")
    public static int field413 = 0;

    @ObfuscatedName("client.gw")
    public static boolean field404 = false;

    @ObfuscatedName("client.gv")
    public static int field405 = 0;

    @ObfuscatedName("client.gg")
    public static int field406 = 0;

    @ObfuscatedName("client.gl")
    public static class3[] field407 = new class3[2048];

    @ObfuscatedName("client.gj")
    public static int field288 = -1;

    @ObfuscatedName("client.gr")
    public static int field562 = 0;

    @ObfuscatedName("client.hx")
    public static int field410 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field411 = new int[1000];

    @ObfuscatedName("client.ha")
    public static final int[] field297 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hh")
    public static String[] field414 = new String[8];

    @ObfuscatedName("client.hm")
    public static boolean[] field415 = new boolean[8];

    @ObfuscatedName("client.hu")
    public static int[] field518 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ho")
    public static int field509 = -1;

    @ObfuscatedName("client.hz")
    public static class199[][][] field418 = new class199[4][104][104];

    @ObfuscatedName("client.hy")
    public static class199 field499 = new class199();

    @ObfuscatedName("client.hg")
    public static class199 field302 = new class199();

    @ObfuscatedName("client.hc")
    public static class199 field448 = new class199();

    @ObfuscatedName("client.hq")
    public static int[] field379 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field392 = new int[25];

    @ObfuscatedName("client.hd")
    public static int[] field440 = new int[25];

    @ObfuscatedName("client.ht")
    public static int field425 = 0;

    @ObfuscatedName("client.hp")
    public static boolean field334 = false;

    @ObfuscatedName("client.hv")
    public static int field427 = 0;

    @ObfuscatedName("client.hr")
    public static int[] field428 = new int[500];

    @ObfuscatedName("client.he")
    public static int[] field429 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field497 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field347 = new int[500];

    @ObfuscatedName("client.il")
    public static String[] field432 = new String[500];

    @ObfuscatedName("client.ii")
    public static String[] field433 = new String[500];

    @ObfuscatedName("client.ik")
    public static int field308 = -1;

    @ObfuscatedName("client.ih")
    public static int field551 = -1;

    @ObfuscatedName("client.is")
    public static int field436 = 0;

    @ObfuscatedName("client.io")
    public static int field437 = 50;

    @ObfuscatedName("client.id")
    public static int field409 = 0;

    @ObfuscatedName("client.iq")
    public static String field439 = null;

    @ObfuscatedName("client.iu")
    public static boolean field496 = false;

    @ObfuscatedName("client.ia")
    public static int field506 = -1;

    @ObfuscatedName("client.ib")
    public static int field442 = -1;

    @ObfuscatedName("client.ix")
    public static String field443 = null;

    @ObfuscatedName("client.in")
    public static String field501 = null;

    @ObfuscatedName("client.it")
    public static int field422 = -1;

    @ObfuscatedName("client.if")
    public static class196 field446 = new class196(8);

    @ObfuscatedName("client.iw")
    public static int field285 = 0;

    @ObfuscatedName("client.jj")
    public static int field563 = 0;

    @ObfuscatedName("client.jp")
    public static class173 field449 = null;

    @ObfuscatedName("client.jw")
    public static int field462 = 0;

    @ObfuscatedName("client.ju")
    public static int field451 = 0;

    @ObfuscatedName("client.jq")
    public static int field452 = 0;

    @ObfuscatedName("client.jh")
    public static int field453 = -1;

    @ObfuscatedName("client.js")
    public static boolean field300 = false;

    @ObfuscatedName("client.jb")
    public static boolean field431 = false;

    @ObfuscatedName("client.jc")
    public static boolean field456 = false;

    @ObfuscatedName("client.jm")
    public static class173 field457 = null;

    @ObfuscatedName("client.jv")
    public static class173 field458 = null;

    @ObfuscatedName("client.jt")
    public static class173 field420 = null;

    @ObfuscatedName("client.jf")
    public static int field460 = 0;

    @ObfuscatedName("client.jo")
    public static int field461 = 0;

    @ObfuscatedName("client.jx")
    public static class173 field532 = null;

    @ObfuscatedName("client.je")
    public static boolean field463 = false;

    @ObfuscatedName("client.jk")
    public static int field473 = -1;

    @ObfuscatedName("client.jl")
    public static int field510 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field466 = false;

    @ObfuscatedName("client.jr")
    public static int field342 = -1;

    @ObfuscatedName("client.jd")
    public static int field468 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field289 = false;

    @ObfuscatedName("client.kd")
    public static int field470 = 1;

    @ObfuscatedName("client.kf")
    public static int[] field471 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field472 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field375 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field332 = 0;

    @ObfuscatedName("client.km")
    public static int[] field381 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field476 = 0;

    @ObfuscatedName("client.kt")
    public static int field477 = 0;

    @ObfuscatedName("client.ko")
    public static int field478 = 0;

    @ObfuscatedName("client.ke")
    public static int field479 = 0;

    @ObfuscatedName("client.kb")
    public static int field571 = 0;

    @ObfuscatedName("client.kc")
    public static int field481 = 0;

    @ObfuscatedName("client.ks")
    public static int field482 = 0;

    @ObfuscatedName("client.kw")
    public static int field483 = 0;

    @ObfuscatedName("client.kq")
    public static class199 field484 = new class199();

    @ObfuscatedName("client.kh")
    public static class199 field348 = new class199();

    @ObfuscatedName("client.ku")
    public static class199 field486 = new class199();

    @ObfuscatedName("client.kl")
    public static class196 field423 = new class196(512);

    @ObfuscatedName("client.kg")
    public static int field488 = 0;

    @ObfuscatedName("client.kz")
    public static int field489 = -2;

    @ObfuscatedName("client.kr")
    public static boolean[] field554 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static boolean[] field491 = new boolean[100];

    @ObfuscatedName("client.lw")
    public static boolean[] field441 = new boolean[100];

    @ObfuscatedName("client.la")
    public static int[] field493 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field494 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field467 = new int[100];

    @ObfuscatedName("client.lc")
    public static int field465 = 0;

    @ObfuscatedName("client.lt")
    public static long field498 = 0L;

    @ObfuscatedName("client.lk")
    public static boolean field403 = true;

    @ObfuscatedName("client.li")
    public static int field500 = 765;

    @ObfuscatedName("client.ls")
    public static int field421 = 503;

    @ObfuscatedName("client.lm")
    public static int[] field502 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lg")
    public static int field503 = 0;

    @ObfuscatedName("client.lp")
    public static int field504 = 0;

    @ObfuscatedName("client.lb")
    public static String field505 = "";

    @ObfuscatedName("client.lh")
    public static long[] field306 = new long[100];

    @ObfuscatedName("client.lu")
    public static int field507 = 0;

    @ObfuscatedName("client.ly")
    public static int field435 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field397 = new int[128];

    @ObfuscatedName("client.mz")
    public static int[] field416 = new int[128];

    @ObfuscatedName("client.mv")
    public static long field511 = -1L;

    @ObfuscatedName("client.mr")
    public static String field512 = null;

    @ObfuscatedName("client.mw")
    public static String field513 = null;

    @ObfuscatedName("client.mj")
    public static int field514 = -1;

    @ObfuscatedName("client.mo")
    public static int field515 = 0;

    @ObfuscatedName("client.mh")
    public static int[] field516 = new int[1000];

    @ObfuscatedName("client.me")
    public static int[] field480 = new int[1000];

    @ObfuscatedName("client.mu")
    public static class79[] field492 = new class79[1000];

    @ObfuscatedName("client.mf")
    public static int field519 = 0;

    @ObfuscatedName("client.mp")
    public static int field520 = 0;

    @ObfuscatedName("client.ml")
    public static int field541 = 0;

    @ObfuscatedName("client.my")
    public static int field522 = 255;

    @ObfuscatedName("client.mn")
    public static int field538 = -1;

    @ObfuscatedName("client.mb")
    public static boolean field340 = false;

    @ObfuscatedName("client.ng")
    public static int field525 = 127;

    @ObfuscatedName("client.nz")
    public static int field526 = 127;

    @ObfuscatedName("client.nd")
    public static int field527 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field528 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field292 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field531 = new int[50];

    @ObfuscatedName("client.nm")
    public static class59[] field564 = new class59[50];

    @ObfuscatedName("client.nr")
    public static boolean field533 = false;

    @ObfuscatedName("client.nt")
    public static boolean[] field534 = new boolean[5];

    @ObfuscatedName("client.ot")
    public static int[] field535 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field417 = new int[5];

    @ObfuscatedName("client.oc")
    public static int[] field293 = new int[5];

    @ObfuscatedName("client.oy")
    public static int[] field390 = new int[5];

    @ObfuscatedName("client.oj")
    public static short field487 = 256;

    @ObfuscatedName("client.ow")
    public static short field459 = 205;

    @ObfuscatedName("client.ov")
    public static short field430 = 256;

    @ObfuscatedName("client.om")
    public static short field542 = 320;

    @ObfuscatedName("client.ou")
    public static short field543 = 1;

    @ObfuscatedName("client.oq")
    public static short field544 = 32767;

    @ObfuscatedName("client.og")
    public static short field545 = 1;

    @ObfuscatedName("client.od")
    public static short field546 = 32767;

    @ObfuscatedName("client.of")
    public static int field547 = 0;

    @ObfuscatedName("client.os")
    public static int field548 = 0;

    @ObfuscatedName("client.ox")
    public static int field549 = 0;

    @ObfuscatedName("client.oh")
    public static int field550 = 0;

    @ObfuscatedName("client.or")
    public static int field384 = 0;

    @ObfuscatedName("client.oo")
    public static int field552 = 0;

    @ObfuscatedName("client.oi")
    public static int field553 = 0;

    @ObfuscatedName("client.oa")
    public static class18[] field426 = new class18[400];

    @ObfuscatedName("client.ol")
    public static class195 field555 = new class195();

    @ObfuscatedName("client.op")
    public static int field317 = 0;

    @ObfuscatedName("client.on")
    public static class8[] field557 = new class8[400];

    @ObfuscatedName("client.ok")
    public static class179 field558 = new class179();

    @ObfuscatedName("client.ph")
    public static int field559 = -1;

    @ObfuscatedName("client.py")
    public static int field560 = -1;

    @ObfuscatedName("client.pj")
    public static class220[] field349 = new class220[8];

    @ObfuscatedName("client.ps")
    public static long field469 = -1L;

    @ObfuscatedName("client.px")
    public static long field337 = -1L;

    @ObfuscatedName("client.pt")
    public static final class11 field565 = new class11();

    @ObfuscatedName("client.pa")
    public static int[] field566 = new int[50];

    @ObfuscatedName("client.pb")
    public static int[] field567 = new int[50];

    @ObfuscatedName("client.i(I)V")
    public final void method224() {
    }

    public final void init() {
        if (!this.method2863()) {
            return;
        }
        class190[] var1 = class190.method1929();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class190 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3054);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3054)) {
                    case 2:
                        Statics.field3118 = var4;
                        break;
                    case 3:
                        Statics.field524 = class153.method2199(Integer.parseInt(var4));
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class2.field16)) {
                        }
                        break;
                    case 5:
                        field357 = Integer.parseInt(var4);
                    case 6:
                    default:
                        break;
                    case 7:
                        Statics.field2189 = Integer.parseInt(var4);
                        break;
                    case 8:
                        field315 = Integer.parseInt(var4);
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field16)) {
                            field290 = true;
                        } else {
                            field290 = false;
                        }
                        break;
                    case 10:
                        Statics.field13 = Integer.parseInt(var4);
                        break;
                    case 11:
                        Statics.field679 = var4;
                        break;
                    case 12:
                        Statics.field628 = (class154) class109.method706(class154.method552(), Integer.parseInt(var4));
                        if (Statics.field628 == class154.field2273) {
                            Statics.field195 = class212.field3115;
                        } else {
                            Statics.field195 = class212.field3123;
                        }
                        break;
                    case 13:
                        field287 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field324 = Integer.parseInt(var4);
                }
            }
        }
        class86.field1476 = false;
        field291 = false;
        Statics.field2278 = this.getCodeBase().getHost();
        String var5 = Statics.field524.field2261;
        byte var6 = 0;
        try {
            Statics.field588 = 16;
            Statics.field2026 = var6;
            try {
                Statics.field255 = System.getProperty("os.name");
            } catch (Exception var51) {
                Statics.field255 = "Unknown";
            }
            Statics.field2023 = Statics.field255.toLowerCase();
            try {
                Statics.field137 = System.getProperty("user.home");
                if (Statics.field137 != null) {
                    Statics.field137 = Statics.field137 + "/";
                }
            } catch (Exception var50) {
            }
            try {
                if (Statics.field2023.startsWith("win")) {
                    if (Statics.field137 == null) {
                        Statics.field137 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field137 == null) {
                    Statics.field137 = System.getenv("HOME");
                }
                if (Statics.field137 != null) {
                    Statics.field137 = Statics.field137 + "/";
                }
            } catch (Exception var49) {
            }
            if (Statics.field137 == null) {
                Statics.field137 = "~/";
            }
            Statics.field2175 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field137, "/tmp/", "" };
            Statics.field2081 = new String[] { ".jagex_cache_" + Statics.field2026, ".file_store_" + Statics.field2026 };
            int var10 = 0;
            label259: while (var10 < 4) {
                String var11 = var10 == 0 ? "" : "" + var10;
                Statics.field1961 = new File(Statics.field137, "jagex_cl_oldschool_" + var5 + var11 + ".dat");
                String var12 = null;
                String var13 = null;
                boolean var14 = false;
                if (Statics.field1961.exists()) {
                    try {
                        class227 var15 = new class227(Statics.field1961, "rw", 10000L);
                        class119 var16 = new class119((int) var15.method3819());
                        while (var16.field1988 < var16.field1989.length) {
                            int var17 = var15.method3820(var16.field1989, var16.field1988, var16.field1989.length - var16.field1988);
                            if (var17 == -1) {
                                throw new IOException();
                            }
                            var16.field1988 += var17;
                        }
                        var16.field1988 = 0;
                        int var18 = var16.method2320();
                        if (var18 < 1 || var18 > 3) {
                            throw new IOException("" + var18);
                        }
                        int var19 = 0;
                        if (var18 > 1) {
                            var19 = var16.method2320();
                        }
                        if (var18 <= 2) {
                            var12 = var16.method2421();
                            if (var19 == 1) {
                                var13 = var16.method2421();
                            }
                        } else {
                            var12 = var16.method2461();
                            if (var19 == 1) {
                                var13 = var16.method2461();
                            }
                        }
                        var15.method3822();
                    } catch (IOException var53) {
                        var53.printStackTrace();
                    }
                    if (var12 != null) {
                        File var21 = new File(var12);
                        if (!var21.exists()) {
                            var12 = null;
                        }
                    }
                    if (var12 != null) {
                        File var22 = new File(var12, "test.dat");
                        if (!class149.method563(var22, true)) {
                            var12 = null;
                        }
                    }
                }
                if (var12 == null && var10 == 0) {
                    label234: for (int var23 = 0; var23 < Statics.field2081.length; var23++) {
                        for (int var24 = 0; var24 < Statics.field2175.length; var24++) {
                            File var25 = new File(Statics.field2175[var24] + Statics.field2081[var23] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var25.exists() && class149.method563(new File(var25, "test.dat"), true)) {
                                var12 = var25.toString();
                                var14 = true;
                                break label234;
                            }
                        }
                    }
                }
                if (var12 == null) {
                    var12 = Statics.field137 + File.separatorChar + "jagexcache" + var11 + File.separatorChar + "oldschool" + File.separatorChar + var5 + File.separatorChar;
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
                    } catch (Exception var52) {
                        var52.printStackTrace();
                    }
                    var14 = true;
                }
                if (var14) {
                    File var35 = new File(var12);
                    Object var36 = null;
                    try {
                        class227 var37 = new class227(Statics.field1961, "rw", 10000L);
                        class119 var38 = new class119(500);
                        var38.method2305(3);
                        var38.method2305(var36 == null ? 0 : 1);
                        var38.method2313(var35.getPath());
                        if (var36 != null) {
                            var38.method2313(((File) var36).getPath());
                        }
                        var37.method3817(var38.field1989, 0, var38.field1988);
                        var37.method3822();
                    } catch (IOException var48) {
                        var48.printStackTrace();
                    }
                }
                File var40 = new File(var12);
                Statics.field2227 = var40;
                if (!Statics.field2227.exists()) {
                    Statics.field2227.mkdirs();
                }
                File[] var41 = Statics.field2227.listFiles();
                if (var41 == null) {
                    break;
                }
                File[] var42 = var41;
                int var43 = 0;
                while (true) {
                    if (var43 >= var42.length) {
                        break label259;
                    }
                    File var44 = var42[var43];
                    if (!class149.method563(var44, false)) {
                        var10++;
                        break;
                    }
                    var43++;
                }
            }
            File var45 = Statics.field2227;
            Statics.field585 = var45;
            if (!Statics.field585.exists()) {
                throw new RuntimeException("");
            }
            class135.field2087 = true;
            class149.method512();
            class149.field2231 = new class228(new class227(class135.method2115("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2230 = new class228(new class227(class135.method2115("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field3157 = new class228[Statics.field588];
            for (int var46 = 0; var46 < Statics.field588; var46++) {
                Statics.field3157[var46] = new class228(new class227(class135.method2115("main_file_cache.idx" + var46), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var54) {
            class148.method2106((String) null, var54);
        }
        Statics.field3128 = this;
        this.method2865(765, 503, 91);
    }

    @ObfuscatedName("client.p(I)V")
    public final void method226() {
        Statics.field2070 = field324 == 0 ? 43594 : field357 + 40000;
        Statics.field322 = field324 == 0 ? 443 : field357 + 50000;
        Statics.field248 = Statics.field2070;
        Statics.field1997 = class174.field2876;
        Statics.field160 = class174.field2877;
        Statics.field2725 = class174.field2874;
        Statics.field2062 = class174.field2875;
        if (Statics.field2101.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2112[44] = 71;
            class137.field2112[45] = 26;
            class137.field2112[46] = 72;
            class137.field2112[47] = 73;
            class137.field2112[59] = 57;
            class137.field2112[61] = 27;
            class137.field2112[91] = 42;
            class137.field2112[92] = 74;
            class137.field2112[93] = 43;
            class137.field2112[192] = 28;
            class137.field2112[222] = 58;
            class137.field2112[520] = 59;
        } else {
            class137.field2112[186] = 57;
            class137.field2112[187] = 27;
            class137.field2112[188] = 71;
            class137.field2112[189] = 26;
            class137.field2112[190] = 72;
            class137.field2112[191] = 73;
            class137.field2112[192] = 58;
            class137.field2112[219] = 42;
            class137.field2112[220] = 74;
            class137.field2112[221] = 43;
            class137.field2112[222] = 59;
            class137.field2112[223] = 28;
        }
        Statics.method982(Statics.field2029);
        class140.method2682(Statics.field2029);
        class145 var1;
        try {
            var1 = new class145();
        } catch (Throwable var15) {
            var1 = null;
        }
        Statics.field208 = var1;
        if (Statics.field208 != null) {
            Statics.field208.method2645(Statics.field2029);
        }
        Statics.field675 = new class134(255, class149.field2231, class149.field2230, 500000);
        class227 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class149.method1169("", Statics.field628.field2272, false);
            byte[] var5 = new byte[(int) var3.method3819()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3820(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class119(var5));
        } catch (Exception var16) {
        }
        try {
            if (var3 != null) {
                var3.method3822();
            }
        } catch (Exception var14) {
        }
        Statics.field1028 = var4;
        Statics.field1167 = this.getToolkit().getSystemClipboard();
        String var12 = Statics.field1956;
        class138.field2137 = this;
        class138.field2134 = var12;
        if (field324 != 0) {
            field301 = true;
        }
        int var13 = Statics.field1028.field147;
        field498 = 0L;
        if (var13 >= 2) {
            field403 = true;
        } else {
            field403 = false;
        }
        method1045();
        if (field536 >= 25) {
            Statics.method932();
        }
        field2202 = true;
    }

    @ObfuscatedName("client.c(I)V")
    public final void method227() {
        field295++;
        this.method244();
        while (true) {
            class199 var1 = class170.field2698;
            class169 var2;
            synchronized (class170.field2698) {
                var2 = (class169) class170.field2695.method3543();
            }
            if (var2 == null) {
                try {
                    if (class183.field2943 == 1) {
                        int var4 = Statics.field2944.method3384();
                        if (var4 > 0 && Statics.field2944.method3349()) {
                            int var5 = var4 - Statics.field1865;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2944.method3342(var5);
                        } else {
                            Statics.field2944.method3348();
                            Statics.field2944.method3418();
                            if (Statics.field2942 == null) {
                                class183.field2943 = 0;
                            } else {
                                class183.field2943 = 2;
                            }
                            Statics.field1406 = null;
                            Statics.field674 = null;
                        }
                    }
                } catch (Exception var174) {
                    var174.printStackTrace();
                    Statics.field2944.method3348();
                    class183.field2943 = 0;
                    Statics.field1406 = null;
                    Statics.field674 = null;
                    Statics.field2942 = null;
                }
                method800();
                class137.method1936();
                class140 var7 = class140.field2164;
                synchronized (class140.field2164) {
                    class140.field2153 = class140.field2150;
                    class140.field2163 = class140.field2148;
                    class140.field2155 = class140.field2152;
                    class140.field2160 = class140.field2154;
                    class140.field2161 = class140.field2157;
                    class140.field2151 = class140.field2158;
                    class140.field2162 = class140.field2159;
                    class140.field2154 = 0;
                }
                if (Statics.field208 != null) {
                    int var9 = Statics.field208.method2644();
                    field483 = var9;
                }
                if (field536 == 0) {
                    method880();
                    Statics.field1367.method2663();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2198[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2196[var11] = 0L;
                    }
                    Statics.field3190 = 0;
                } else if (field536 == 5) {
                    class32.method604(this);
                    method880();
                    Statics.field1367.method2663();
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2198[var12] = 0L;
                    }
                    for (int var13 = 0; var13 < 32; var13++) {
                        field2196[var13] = 0L;
                    }
                    Statics.field3190 = 0;
                } else if (field536 == 10 || field536 == 11) {
                    class32.method604(this);
                } else if (field536 == 20) {
                    class32.method604(this);
                    method659();
                } else if (field536 == 25) {
                    method122();
                }
                if (field536 == 30) {
                    if (field464 > 1) {
                        field464--;
                    }
                    if (field339 > 0) {
                        field339--;
                    }
                    if (field529) {
                        field529 = false;
                        method469();
                    } else {
                        if (!field334) {
                            field432[0] = class157.field2304;
                            field433[0] = "";
                            field497[0] = 1006;
                            field427 = 1;
                        }
                        for (int var14 = 0; var14 < 100 && Statics.method1208(); var14++) {
                        }
                        if (field536 == 30) {
                            while (class211.method2914()) {
                                field329.method2565(226);
                                field329.method2305(0);
                                int var15 = field329.field1988;
                                class211.method2714(field329);
                                field329.method2317(field329.field1988 - var15);
                            }
                            Object var16 = Statics.field2065.field194;
                            synchronized (Statics.field2065.field194) {
                                if (!field438) {
                                    Statics.field2065.field197 = 0;
                                } else if (class140.field2160 != 0 || Statics.field2065.field197 >= 40) {
                                    field329.method2565(173);
                                    field329.method2305(0);
                                    int var17 = field329.field1988;
                                    int var18 = 0;
                                    for (int var19 = 0; var19 < Statics.field2065.field197 && field329.field1988 - var17 < 240; var19++) {
                                        var18++;
                                        int var20 = Statics.field2065.field198[var19];
                                        if (var20 < 0) {
                                            var20 = 0;
                                        } else if (var20 > 502) {
                                            var20 = 502;
                                        }
                                        int var21 = Statics.field2065.field193[var19];
                                        if (var21 < 0) {
                                            var21 = 0;
                                        } else if (var21 > 764) {
                                            var21 = 764;
                                        }
                                        int var22 = var20 * 765 + var21;
                                        if (Statics.field2065.field198[var19] == -1 && Statics.field2065.field193[var19] == -1) {
                                            var21 = -1;
                                            var20 = -1;
                                            var22 = 524287;
                                        }
                                        if (field396 != var21 || field298 != var20) {
                                            int var23 = var21 - field396;
                                            field396 = var21;
                                            int var24 = var20 - field298;
                                            field298 = var20;
                                            if (field367 < 8 && var23 >= -32 && var23 <= 31 && var24 >= -32 && var24 <= 31) {
                                                var23 += 32;
                                                var24 += 32;
                                                field329.method2501((field367 << 12) + (var23 << 6) + var24);
                                                field367 = 0;
                                            } else if (field367 < 8) {
                                                field329.method2512((field367 << 19) + 8388608 + var22);
                                                field367 = 0;
                                            } else {
                                                field329.method2308((field367 << 19) + -1073741824 + var22);
                                                field367 = 0;
                                            }
                                        } else if (field367 < 2047) {
                                            field367++;
                                        }
                                    }
                                    field329.method2317(field329.field1988 - var17);
                                    if (var18 >= Statics.field2065.field197) {
                                        Statics.field2065.field197 = 0;
                                    } else {
                                        Statics.field2065.field197 -= var18;
                                        for (int var25 = 0; var25 < Statics.field2065.field197; var25++) {
                                            Statics.field2065.field193[var25] = Statics.field2065.field193[var18 + var25];
                                            Statics.field2065.field198[var25] = Statics.field2065.field198[var18 + var25];
                                        }
                                    }
                                }
                            }
                            if (class140.field2160 == 1 || !Statics.field1954 && class140.field2160 == 4 || class140.field2160 == 2) {
                                long var27 = (class140.field2162 - field296) / 50L;
                                if (var27 > 4095L) {
                                    var27 = 4095L;
                                }
                                field296 = class140.field2162;
                                int var29 = class140.field2151;
                                if (var29 < 0) {
                                    var29 = 0;
                                } else if (var29 > Statics.field1605) {
                                    var29 = Statics.field1605;
                                }
                                int var30 = class140.field2161;
                                if (var30 < 0) {
                                    var30 = 0;
                                } else if (var30 > Statics.field999) {
                                    var30 = Statics.field999;
                                }
                                int var31 = (int) var27;
                                field329.method2565(51);
                                field329.method2501((var31 << 1) + (class140.field2160 == 2 ? 1 : 0));
                                field329.method2501(var30);
                                field329.method2501(var29);
                            }
                            if (class137.field2102 > 0) {
                                field329.method2565(239);
                                field329.method2501(0);
                                int var32 = field329.field1988;
                                long var33 = class115.method2007();
                                for (int var35 = 0; var35 < class137.field2102; var35++) {
                                    long var36 = var33 - field511;
                                    if (var36 > 16777215L) {
                                        var36 = 16777215L;
                                    }
                                    field511 = var33;
                                    field329.method2342(class137.field2124[var35]);
                                    field329.method2519((int) var36);
                                }
                                field329.method2316(field329.field1988 - var32);
                            }
                            if (field377 > 0) {
                                field377--;
                            }
                            if (class137.field2125[96] || class137.field2125[97] || class137.field2125[98] || class137.field2125[99]) {
                                field378 = true;
                            }
                            if (field378 && field377 <= 0) {
                                field377 = 20;
                                field378 = false;
                                field329.method2565(58);
                                field329.method2353(field370);
                                field329.method2513(field371);
                            }
                            if (Statics.field2579 && !field490) {
                                field490 = true;
                                field329.method2565(142);
                                field329.method2305(1);
                            }
                            if (!Statics.field2579 && field490) {
                                field490 = false;
                                field329.method2565(142);
                                field329.method2305(0);
                            }
                            if (Statics.field880 != field514) {
                                field514 = Statics.field880;
                                int var38 = Statics.field880;
                                int[] var39 = Statics.field1014.field1421;
                                int var40 = var39.length;
                                for (int var41 = 0; var41 < var40; var41++) {
                                    var39[var41] = 0;
                                }
                                int var42 = 1;
                                while (true) {
                                    if (var42 >= 103) {
                                        int var45 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var46 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field1014.method1568();
                                        for (int var47 = 1; var47 < 103; var47++) {
                                            for (int var48 = 1; var48 < 103; var48++) {
                                                if ((class6.field79[var38][var48][var47] & 0x18) == 0) {
                                                    method606(var38, var48, var47, var45, var46);
                                                }
                                                if (var38 < 3 && (class6.field79[var38 + 1][var48][var47] & 0x8) != 0) {
                                                    method606(var38 + 1, var48, var47, var45, var46);
                                                }
                                            }
                                        }
                                        field515 = 0;
                                        for (int var49 = 0; var49 < 104; var49++) {
                                            for (int var50 = 0; var50 < 104; var50++) {
                                                int var51 = Statics.field184.method1784(Statics.field880, var49, var50);
                                                if (var51 != 0) {
                                                    int var52 = var51 >> 14 & 0x7FFF;
                                                    int var53 = class41.method961(var52).field957;
                                                    if (var53 >= 0) {
                                                        int var54 = var49;
                                                        int var55 = var50;
                                                        if (var53 != 22 && var53 != 29 && var53 != 34 && var53 != 36 && var53 != 46 && var53 != 47 && var53 != 48) {
                                                            int[][] var56 = field346[Statics.field880].field1885;
                                                            for (int var57 = 0; var57 < 10; var57++) {
                                                                int var58 = (int) (Math.random() * 4.0D);
                                                                if (var58 == 0 && var54 > 0 && var54 > var49 - 3 && (var56[var54 - 1][var55] & 0x1240108) == 0) {
                                                                    var54--;
                                                                }
                                                                if (var58 == 1 && var54 < 103 && var54 < var49 + 3 && (var56[var54 + 1][var55] & 0x1240180) == 0) {
                                                                    var54++;
                                                                }
                                                                if (var58 == 2 && var55 > 0 && var55 > var50 - 3 && (var56[var54][var55 - 1] & 0x1240102) == 0) {
                                                                    var55--;
                                                                }
                                                                if (var58 == 3 && var55 < 103 && var55 < var50 + 3 && (var56[var54][var55 + 1] & 0x1240120) == 0) {
                                                                    var55++;
                                                                }
                                                            }
                                                        }
                                                        field492[field515] = Statics.field886[var53];
                                                        field516[field515] = var54;
                                                        field480[field515] = var55;
                                                        field515++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field687.method1563();
                                        break;
                                    }
                                    int var43 = (103 - var42) * 2048 + 24628;
                                    for (int var44 = 1; var44 < 103; var44++) {
                                        if ((class6.field79[var38][var44][var42] & 0x18) == 0) {
                                            Statics.field184.method1888(var39, var43, 512, var38, var44, var42);
                                        }
                                        if (var38 < 3 && (class6.field79[var38 + 1][var44][var42] & 0x8) != 0) {
                                            Statics.field184.method1888(var39, var43, 512, var38 + 1, var44, var42);
                                        }
                                        var43 += 4;
                                    }
                                    var42++;
                                }
                            }
                            if (field536 == 30) {
                                for (class17 var59 = (class17) field499.method3546(); var59 != null; var59 = (class17) field499.method3548()) {
                                    if (var59.field236 > 0) {
                                        var59.field236--;
                                    }
                                    if (var59.field236 != 0) {
                                        if (var59.field231 > 0) {
                                            var59.field231--;
                                        }
                                        if (var59.field231 == 0 && var59.field227 >= 1 && var59.field228 >= 1 && var59.field227 <= 102 && var59.field228 <= 102) {
                                            if (var59.field226 >= 0) {
                                                int var60 = var59.field226;
                                                int var61 = var59.field234;
                                                class41 var62 = class41.method961(var60);
                                                if (var61 == 11) {
                                                    var61 = 10;
                                                }
                                                if (var61 >= 5 && var61 <= 8) {
                                                    var61 = 4;
                                                }
                                                boolean var63 = var62.method798(var61);
                                                if (!var63) {
                                                    continue;
                                                }
                                            }
                                            method155(var59.field237, var59.field235, var59.field227, var59.field228, var59.field226, var59.field233, var59.field234);
                                            var59.field231 = -1;
                                            if (var59.field239 == var59.field226 && var59.field239 == -1) {
                                                var59.method3625();
                                            } else if (var59.field239 == var59.field226 && var59.field233 == var59.field230 && var59.field234 == var59.field229) {
                                                var59.method3625();
                                            }
                                        }
                                    } else if (var59.field239 < 0 || Statics.method605(var59.field239, var59.field229)) {
                                        method155(var59.field237, var59.field235, var59.field227, var59.field228, var59.field239, var59.field230, var59.field229);
                                        var59.method3625();
                                    }
                                }
                                method2021();
                                field450++;
                                if (field450 > 750) {
                                    method469();
                                } else {
                                    int var64 = class33.field761;
                                    int[] var65 = class33.field765;
                                    for (int var66 = 0; var66 < var64; var66++) {
                                        class3 var67 = field407[var65[var66]];
                                        if (var67 != null) {
                                            method177(var67, 1);
                                        }
                                    }
                                    method2696();
                                    int[] var68 = class33.field765;
                                    for (int var69 = 0; var69 < class33.field761; var69++) {
                                        class3 var70 = field407[var68[var69]];
                                        if (var70 != null && var70.field833 > 0) {
                                            var70.field833--;
                                            if (var70.field833 == 0) {
                                                var70.field845 = null;
                                            }
                                        }
                                    }
                                    for (int var71 = 0; var71 < field316; var71++) {
                                        int var72 = field325[var71];
                                        class35 var73 = field326[var72];
                                        if (var73 != null && var73.field833 > 0) {
                                            var73.field833--;
                                            if (var73.field833 == 0) {
                                                var73.field845 = null;
                                            }
                                        }
                                    }
                                    field351++;
                                    if (field447 != 0) {
                                        field485 += 20;
                                        if (field485 >= 400) {
                                            field447 = 0;
                                        }
                                    }
                                    if (Statics.field14 != null) {
                                        field398++;
                                        if (field398 >= 15) {
                                            method2930(Statics.field14);
                                            Statics.field14 = null;
                                        }
                                    }
                                    class173 var74 = Statics.field2632;
                                    class173 var75 = Statics.field3061;
                                    Statics.field2632 = null;
                                    Statics.field3061 = null;
                                    field532 = null;
                                    field466 = false;
                                    field463 = false;
                                    field435 = 0;
                                    while (true) {
                                        while (class137.method93() && field435 < 128) {
                                            if (field452 >= 2 && class137.field2125[82] && Statics.field1629 == 66) {
                                                String var76 = class12.method36();
                                                Statics.field1167.setContents(new StringSelection(var76), (ClipboardOwner) null);
                                            } else {
                                                field416[field435] = Statics.field1629;
                                                field397[field435] = Statics.field2111;
                                                field435++;
                                            }
                                        }
                                        if (field422 != -1) {
                                            int var77 = field422;
                                            int var78 = Statics.field999;
                                            int var79 = Statics.field1605;
                                            if (class173.method2942(var77)) {
                                                method1180(Statics.field2793[var77], -1, 0, 0, var78, var79, 0, 0);
                                            }
                                        }
                                        field470++;
                                        while (true) {
                                            class1 var80;
                                            class173 var81;
                                            class173 var82;
                                            do {
                                                var80 = (class1) field348.method3543();
                                                if (var80 == null) {
                                                    while (true) {
                                                        class1 var83;
                                                        class173 var84;
                                                        class173 var85;
                                                        do {
                                                            var83 = (class1) field486.method3543();
                                                            if (var83 == null) {
                                                                while (true) {
                                                                    class1 var86;
                                                                    class173 var87;
                                                                    class173 var88;
                                                                    do {
                                                                        var86 = (class1) field484.method3543();
                                                                        if (var86 == null) {
                                                                            boolean var89 = false;
                                                                            while (!var89) {
                                                                                var89 = true;
                                                                                for (int var90 = 0; var90 < field427 - 1; var90++) {
                                                                                    if (field497[var90] < 1000 && field497[var90 + 1] > 1000) {
                                                                                        String var91 = field433[var90];
                                                                                        field433[var90] = field433[var90 + 1];
                                                                                        field433[var90 + 1] = var91;
                                                                                        String var92 = field432[var90];
                                                                                        field432[var90] = field432[var90 + 1];
                                                                                        field432[var90 + 1] = var92;
                                                                                        int var93 = field497[var90];
                                                                                        field497[var90] = field497[var90 + 1];
                                                                                        field497[var90 + 1] = var93;
                                                                                        int var94 = field428[var90];
                                                                                        field428[var90] = field428[var90 + 1];
                                                                                        field428[var90 + 1] = var94;
                                                                                        int var95 = field429[var90];
                                                                                        field429[var90] = field429[var90 + 1];
                                                                                        field429[var90 + 1] = var95;
                                                                                        int var96 = field347[var90];
                                                                                        field347[var90] = field347[var90 + 1];
                                                                                        field347[var90 + 1] = var96;
                                                                                        var89 = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (Statics.field2585 == null && field458 == null) {
                                                                                int var97 = class140.field2160;
                                                                                if (field334) {
                                                                                    if (var97 != 1 && (Statics.field1954 || var97 != 4)) {
                                                                                        int var98 = class140.field2163;
                                                                                        int var99 = class140.field2155;
                                                                                        if (var98 < Statics.field2050 - 10 || var98 > Statics.field780 + Statics.field2050 + 10 || var99 < Statics.field152 - 10 || var99 > Statics.field152 + Statics.field127 + 10) {
                                                                                            field334 = false;
                                                                                            method2995(Statics.field2050, Statics.field152, Statics.field780, Statics.field127);
                                                                                        }
                                                                                    }
                                                                                    if (var97 == 1 || !Statics.field1954 && var97 == 4) {
                                                                                        int var100 = Statics.field2050;
                                                                                        int var101 = Statics.field152;
                                                                                        int var102 = Statics.field780;
                                                                                        int var103 = class140.field2161;
                                                                                        int var104 = class140.field2151;
                                                                                        int var105 = -1;
                                                                                        for (int var106 = 0; var106 < field427; var106++) {
                                                                                            int var107 = (field427 - 1 - var106) * 15 + var101 + 31;
                                                                                            if (var103 > var100 && var103 < var100 + var102 && var104 > var107 - 13 && var104 < var107 + 3) {
                                                                                                var105 = var106;
                                                                                            }
                                                                                        }
                                                                                        if (var105 != -1 && var105 >= 0) {
                                                                                            int var108 = field428[var105];
                                                                                            int var109 = field429[var105];
                                                                                            int var110 = field497[var105];
                                                                                            int var111 = field347[var105];
                                                                                            String var112 = field432[var105];
                                                                                            String var113 = field433[var105];
                                                                                            method87(var108, var109, var110, var111, var112, var113, class140.field2161, class140.field2151);
                                                                                        }
                                                                                        field334 = false;
                                                                                        method2995(Statics.field2050, Statics.field152, Statics.field780, Statics.field127);
                                                                                    }
                                                                                } else {
                                                                                    label1504: {
                                                                                        int var115;
                                                                                        int var116;
                                                                                        label1550: {
                                                                                            if ((var97 == 1 || !Statics.field1954 && var97 == 4) && field427 > 0) {
                                                                                                int var114 = field497[field427 - 1];
                                                                                                if (var114 == 39 || var114 == 40 || var114 == 41 || var114 == 42 || var114 == 43 || var114 == 33 || var114 == 34 || var114 == 35 || var114 == 36 || var114 == 37 || var114 == 38 || var114 == 1005) {
                                                                                                    var115 = field428[field427 - 1];
                                                                                                    var116 = field429[field427 - 1];
                                                                                                    class173 var117 = class173.method81(var116);
                                                                                                    int var118 = method39(var117);
                                                                                                    boolean var119 = (var118 >> 28 & 0x1) != 0;
                                                                                                    if (var119) {
                                                                                                        break label1550;
                                                                                                    }
                                                                                                    class178 var10000 = (class178) null;
                                                                                                    if (class178.method2240(method39(var117))) {
                                                                                                        break label1550;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if ((var97 == 1 || !Statics.field1954 && var97 == 4) && (field425 == 1 && field427 > 2 || method2265(field427 - 1))) {
                                                                                                var97 = 2;
                                                                                            }
                                                                                            if ((var97 == 1 || !Statics.field1954 && var97 == 4) && field427 > 0) {
                                                                                                int var120 = field427 - 1;
                                                                                                if (var120 >= 0) {
                                                                                                    int var121 = field428[var120];
                                                                                                    int var122 = field429[var120];
                                                                                                    int var123 = field497[var120];
                                                                                                    int var124 = field347[var120];
                                                                                                    String var125 = field432[var120];
                                                                                                    String var126 = field433[var120];
                                                                                                    method87(var121, var122, var123, var124, var125, var126, class140.field2161, class140.field2151);
                                                                                                }
                                                                                            }
                                                                                            if (var97 == 2 && field427 > 0) {
                                                                                                method687(class140.field2161, class140.field2151);
                                                                                            }
                                                                                            break label1504;
                                                                                        }
                                                                                        if (Statics.field2585 != null && !field404 && field425 != 1 && !method2265(field427 - 1) && field427 > 0) {
                                                                                            method33(field365, field402);
                                                                                        }
                                                                                        field404 = false;
                                                                                        field405 = 0;
                                                                                        if (Statics.field2585 != null) {
                                                                                            method2930(Statics.field2585);
                                                                                        }
                                                                                        Statics.field2585 = class173.method81(var116);
                                                                                        field400 = var115;
                                                                                        field365 = class140.field2161;
                                                                                        field402 = class140.field2151;
                                                                                        if (field427 > 0) {
                                                                                            method2198(field427 - 1);
                                                                                        }
                                                                                        method2930(Statics.field2585);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field458 != null) {
                                                                                method3108();
                                                                            }
                                                                            if (Statics.field2585 != null) {
                                                                                method2930(Statics.field2585);
                                                                                field405++;
                                                                                if (class140.field2153 == 0) {
                                                                                    if (field404) {
                                                                                        if (Statics.field2585 == Statics.field1891 && field413 != field400) {
                                                                                            class173 var127 = Statics.field2585;
                                                                                            byte var128 = 0;
                                                                                            if (field563 == 1 && var127.field2745 == 206) {
                                                                                                var128 = 1;
                                                                                            }
                                                                                            if (var127.field2857[field413] <= 0) {
                                                                                                var128 = 0;
                                                                                            }
                                                                                            if (class178.method2240(method39(var127))) {
                                                                                                int var129 = field400;
                                                                                                int var130 = field413;
                                                                                                var127.field2857[var130] = var127.field2857[var129];
                                                                                                var127.field2732[var130] = var127.field2732[var129];
                                                                                                var127.field2857[var129] = -1;
                                                                                                var127.field2732[var129] = 0;
                                                                                            } else if (var128 == 1) {
                                                                                                int var131 = field400;
                                                                                                int var132 = field413;
                                                                                                while (var131 != var132) {
                                                                                                    if (var131 > var132) {
                                                                                                        var127.method3166(var131 - 1, var131);
                                                                                                        var131--;
                                                                                                    } else if (var131 < var132) {
                                                                                                        var127.method3166(var131 + 1, var131);
                                                                                                        var131++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var127.method3166(field413, field400);
                                                                                            }
                                                                                            field329.method2565(85);
                                                                                            field329.method2501(field413);
                                                                                            field329.method2343(var128);
                                                                                            field329.method2308(Statics.field2585.field2741);
                                                                                            field329.method2352(field400);
                                                                                        }
                                                                                    } else if ((field425 == 1 || method2265(field427 - 1)) && field427 > 2) {
                                                                                        method687(field365, field402);
                                                                                    } else if (field427 > 0) {
                                                                                        method33(field365, field402);
                                                                                    }
                                                                                    field398 = 10;
                                                                                    class140.field2160 = 0;
                                                                                    Statics.field2585 = null;
                                                                                } else if (field405 >= 5 && (class140.field2163 > field365 + 5 || class140.field2163 < field365 - 5 || class140.field2155 > field402 + 5 || class140.field2155 < field402 - 5)) {
                                                                                    field404 = true;
                                                                                }
                                                                            }
                                                                            if (class86.field1494 != -1) {
                                                                                int var133 = class86.field1494;
                                                                                int var134 = class86.field1503;
                                                                                field329.method2565(148);
                                                                                field329.method2305(5);
                                                                                field329.method2353(Statics.field77 + var133);
                                                                                field329.method2352(Statics.field271 + var134);
                                                                                field329.method2344(class137.field2125[82] ? (class137.field2125[81] ? 2 : 1) : 0);
                                                                                class86.field1494 = -1;
                                                                                field394 = class140.field2161;
                                                                                field395 = class140.field2151;
                                                                                field447 = 1;
                                                                                field485 = 0;
                                                                                field519 = var133;
                                                                                field520 = var134;
                                                                            }
                                                                            if (Statics.field2632 != var74) {
                                                                                if (var74 != null) {
                                                                                    method2930(var74);
                                                                                }
                                                                                if (Statics.field2632 != null) {
                                                                                    method2930(Statics.field2632);
                                                                                }
                                                                            }
                                                                            if (Statics.field3061 != var75 && field437 == field436) {
                                                                                if (var75 != null) {
                                                                                    method2930(var75);
                                                                                }
                                                                                if (Statics.field3061 != null) {
                                                                                    method2930(Statics.field3061);
                                                                                }
                                                                            }
                                                                            if (Statics.field3061 == null) {
                                                                                if (field436 > 0) {
                                                                                    field436--;
                                                                                }
                                                                            } else if (field436 < field437) {
                                                                                field436++;
                                                                                if (field437 == field436) {
                                                                                    method2930(Statics.field3061);
                                                                                }
                                                                            }
                                                                            int var135 = field350 + Statics.field2683.field861;
                                                                            int var136 = field352 + Statics.field2683.field818;
                                                                            if (Statics.field1592 - var135 < -500 || Statics.field1592 - var135 > 500 || Statics.field1063 - var136 < -500 || Statics.field1063 - var136 > 500) {
                                                                                Statics.field1592 = var135;
                                                                                Statics.field1063 = var136;
                                                                            }
                                                                            if (Statics.field1592 != var135) {
                                                                                Statics.field1592 += (var135 - Statics.field1592) / 16;
                                                                            }
                                                                            if (Statics.field1063 != var136) {
                                                                                Statics.field1063 += (var136 - Statics.field1063) / 16;
                                                                            }
                                                                            if (class140.field2153 == 4 && Statics.field1954) {
                                                                                int var137 = class140.field2155 - field344;
                                                                                field373 = var137 * 2;
                                                                                field344 = var137 == -1 || var137 == 1 ? class140.field2155 : (field344 + class140.field2155) / 2;
                                                                                int var138 = field374 - class140.field2163;
                                                                                field372 = var138 * 2;
                                                                                field374 = var138 == -1 || var138 == 1 ? class140.field2163 : (field374 + class140.field2163) / 2;
                                                                            } else {
                                                                                if (class137.field2125[96]) {
                                                                                    field372 += (-24 - field372) / 2;
                                                                                } else if (class137.field2125[97]) {
                                                                                    field372 += (24 - field372) / 2;
                                                                                } else {
                                                                                    field372 /= 2;
                                                                                }
                                                                                if (class137.field2125[98]) {
                                                                                    field373 += (12 - field373) / 2;
                                                                                } else if (class137.field2125[99]) {
                                                                                    field373 += (-12 - field373) / 2;
                                                                                } else {
                                                                                    field373 /= 2;
                                                                                }
                                                                                field344 = class140.field2155;
                                                                                field374 = class140.field2163;
                                                                            }
                                                                            field371 = field372 / 2 + field371 & 0x7FF;
                                                                            field370 += field373 / 2;
                                                                            if (field370 < 128) {
                                                                                field370 = 128;
                                                                            }
                                                                            if (field370 > 383) {
                                                                                field370 = 383;
                                                                            }
                                                                            int var139 = Statics.field1592 >> 7;
                                                                            int var140 = Statics.field1063 >> 7;
                                                                            int var141 = method4(Statics.field1592, Statics.field1063, Statics.field880);
                                                                            int var142 = 0;
                                                                            if (var139 > 3 && var140 > 3 && var139 < 100 && var140 < 100) {
                                                                                for (int var143 = var139 - 4; var143 <= var139 + 4; var143++) {
                                                                                    for (int var144 = var140 - 4; var144 <= var140 + 4; var144++) {
                                                                                        int var145 = Statics.field880;
                                                                                        if (var145 < 3 && (class6.field79[1][var143][var144] & 0x2) == 2) {
                                                                                            var145++;
                                                                                        }
                                                                                        int var146 = var141 - class6.field80[var145][var143][var144];
                                                                                        if (var146 > var142) {
                                                                                            var142 = var146;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var147 = var142 * 192;
                                                                            if (var147 > 98048) {
                                                                                var147 = 98048;
                                                                            }
                                                                            if (var147 < 32768) {
                                                                                var147 = 32768;
                                                                            }
                                                                            if (var147 > field475) {
                                                                                field475 += (var147 - field475) / 24;
                                                                            } else if (var147 < field475) {
                                                                                field475 += (var147 - field475) / 80;
                                                                            }
                                                                            if (field533) {
                                                                                int var148 = Statics.field1790 * 128 + 64;
                                                                                int var149 = Statics.field589 * 128 + 64;
                                                                                int var150 = method4(var148, var149, Statics.field880) - Statics.field192;
                                                                                if (Statics.field1619 < var148) {
                                                                                    Statics.field1619 += Statics.field863 * (var148 - Statics.field1619) / 1000 + Statics.field1070;
                                                                                    if (Statics.field1619 > var148) {
                                                                                        Statics.field1619 = var148;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1619 > var148) {
                                                                                    Statics.field1619 -= Statics.field863 * (Statics.field1619 - var148) / 1000 + Statics.field1070;
                                                                                    if (Statics.field1619 < var148) {
                                                                                        Statics.field1619 = var148;
                                                                                    }
                                                                                }
                                                                                if (Statics.field630 < var150) {
                                                                                    Statics.field630 += Statics.field863 * (var150 - Statics.field630) / 1000 + Statics.field1070;
                                                                                    if (Statics.field630 > var150) {
                                                                                        Statics.field630 = var150;
                                                                                    }
                                                                                }
                                                                                if (Statics.field630 > var150) {
                                                                                    Statics.field630 -= Statics.field863 * (Statics.field630 - var150) / 1000 + Statics.field1070;
                                                                                    if (Statics.field630 < var150) {
                                                                                        Statics.field630 = var150;
                                                                                    }
                                                                                }
                                                                                if (Statics.field701 < var149) {
                                                                                    Statics.field701 += Statics.field863 * (var149 - Statics.field701) / 1000 + Statics.field1070;
                                                                                    if (Statics.field701 > var149) {
                                                                                        Statics.field701 = var149;
                                                                                    }
                                                                                }
                                                                                if (Statics.field701 > var149) {
                                                                                    Statics.field701 -= Statics.field863 * (Statics.field701 - var149) / 1000 + Statics.field1070;
                                                                                    if (Statics.field701 < var149) {
                                                                                        Statics.field701 = var149;
                                                                                    }
                                                                                }
                                                                                int var151 = Statics.field1872 * 128 + 64;
                                                                                int var152 = Statics.field794 * 128 + 64;
                                                                                int var153 = method4(var151, var152, Statics.field880) - Statics.field1598;
                                                                                int var154 = var151 - Statics.field1619;
                                                                                int var155 = var153 - Statics.field630;
                                                                                int var156 = var152 - Statics.field701;
                                                                                int var157 = (int) Math.sqrt((double) (var154 * var154 + var156 * var156));
                                                                                int var158 = (int) (Math.atan2((double) var155, (double) var157) * 325.949D) & 0x7FF;
                                                                                int var159 = (int) (Math.atan2((double) var154, (double) var156) * -325.949D) & 0x7FF;
                                                                                if (var158 < 128) {
                                                                                    var158 = 128;
                                                                                }
                                                                                if (var158 > 383) {
                                                                                    var158 = 383;
                                                                                }
                                                                                if (Statics.field651 < var158) {
                                                                                    Statics.field651 += Statics.field753 * (var158 - Statics.field651) / 1000 + Statics.field1395;
                                                                                    if (Statics.field651 > var158) {
                                                                                        Statics.field651 = var158;
                                                                                    }
                                                                                }
                                                                                if (Statics.field651 > var158) {
                                                                                    Statics.field651 -= Statics.field753 * (Statics.field651 - var158) / 1000 + Statics.field1395;
                                                                                    if (Statics.field651 < var158) {
                                                                                        Statics.field651 = var158;
                                                                                    }
                                                                                }
                                                                                int var160 = var159 - Statics.field1007;
                                                                                if (var160 > 1024) {
                                                                                    var160 -= 2048;
                                                                                }
                                                                                if (var160 < -1024) {
                                                                                    var160 += 2048;
                                                                                }
                                                                                if (var160 > 0) {
                                                                                    Statics.field1007 += Statics.field753 * var160 / 1000 + Statics.field1395;
                                                                                    Statics.field1007 &= 0x7FF;
                                                                                }
                                                                                if (var160 < 0) {
                                                                                    Statics.field1007 -= Statics.field753 * -var160 / 1000 + Statics.field1395;
                                                                                    Statics.field1007 &= 0x7FF;
                                                                                }
                                                                                int var161 = var159 - Statics.field1007;
                                                                                if (var161 > 1024) {
                                                                                    var161 -= 2048;
                                                                                }
                                                                                if (var161 < -1024) {
                                                                                    var161 += 2048;
                                                                                }
                                                                                if (var161 < 0 && var160 > 0 || var161 > 0 && var160 < 0) {
                                                                                    Statics.field1007 = var159;
                                                                                }
                                                                            }
                                                                            for (int var162 = 0; var162 < 5; var162++) {
                                                                                int var10002 = field390[var162]++;
                                                                            }
                                                                            Statics.field751.method220();
                                                                            int var163 = class140.method2675();
                                                                            int var164 = class137.field2129;
                                                                            if (var163 > 15000 && var164 > 15000) {
                                                                                field339 = 250;
                                                                                class140.method474(14500);
                                                                                field329.method2565(80);
                                                                            }
                                                                            field356++;
                                                                            if (field356 > 500) {
                                                                                field356 = 0;
                                                                                int var166 = (int) (Math.random() * 8.0D);
                                                                                if ((var166 & 0x1) == 1) {
                                                                                    field350 += field521;
                                                                                }
                                                                                if ((var166 & 0x2) == 2) {
                                                                                    field352 += field353;
                                                                                }
                                                                                if ((var166 & 0x4) == 4) {
                                                                                    field572 += field355;
                                                                                }
                                                                            }
                                                                            if (field350 < -50) {
                                                                                field521 = 2;
                                                                            }
                                                                            if (field350 > 50) {
                                                                                field521 = -2;
                                                                            }
                                                                            if (field352 < -55) {
                                                                                field353 = 2;
                                                                            }
                                                                            if (field352 > 55) {
                                                                                field353 = -2;
                                                                            }
                                                                            if (field572 < -40) {
                                                                                field355 = 1;
                                                                            }
                                                                            if (field572 > 40) {
                                                                                field355 = -1;
                                                                            }
                                                                            field361++;
                                                                            if (field361 > 500) {
                                                                                field361 = 0;
                                                                                int var167 = (int) (Math.random() * 8.0D);
                                                                                if ((var167 & 0x1) == 1) {
                                                                                    field358 += field419;
                                                                                }
                                                                                if ((var167 & 0x2) == 2) {
                                                                                    field359 += field360;
                                                                                }
                                                                            }
                                                                            if (field358 < -60) {
                                                                                field419 = 2;
                                                                            }
                                                                            if (field358 > 60) {
                                                                                field419 = -2;
                                                                            }
                                                                            if (field359 < -20) {
                                                                                field360 = 1;
                                                                            }
                                                                            if (field359 > 10) {
                                                                                field360 = -1;
                                                                            }
                                                                            for (class39 var168 = (class39) field555.method3501(); var168 != null; var168 = (class39) field555.method3502()) {
                                                                                if ((long) var168.field883 < class115.method2007() / 1000L - 5L) {
                                                                                    if (var168.field881 > 0) {
                                                                                        class12.method2263(5, "", var168.field878 + class157.field2469);
                                                                                    }
                                                                                    if (var168.field881 == 0) {
                                                                                        class12.method2263(5, "", var168.field878 + class157.field2353);
                                                                                    }
                                                                                    var168.method3624();
                                                                                }
                                                                            }
                                                                            field335++;
                                                                            if (field335 > 50) {
                                                                                field329.method2565(7);
                                                                            }
                                                                            try {
                                                                                if (Statics.field328 != null && field329.field1988 > 0) {
                                                                                    Statics.field328.method2799(field329.field1989, 0, field329.field1988);
                                                                                    field329.field1988 = 0;
                                                                                    field335 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var170) {
                                                                                method469();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var87 = var86.field8;
                                                                        if (var87.field2866 < 0) {
                                                                            break;
                                                                        }
                                                                        var88 = class173.method81(var87.field2760);
                                                                    } while (var88 == null || var88.field2863 == null || var87.field2866 >= var88.field2863.length || var88.field2863[var87.field2866] != var87);
                                                                    class37.method2637(var86);
                                                                }
                                                            }
                                                            var84 = var83.field8;
                                                            if (var84.field2866 < 0) {
                                                                break;
                                                            }
                                                            var85 = class173.method81(var84.field2760);
                                                        } while (var85 == null || var85.field2863 == null || var84.field2866 >= var85.field2863.length || var85.field2863[var84.field2866] != var84);
                                                        class37.method2637(var83);
                                                    }
                                                }
                                                var81 = var80.field8;
                                                if (var81.field2866 < 0) {
                                                    break;
                                                }
                                                var82 = class173.method81(var81.field2760);
                                            } while (var82 == null || var82.field2863 == null || var81.field2866 >= var82.field2863.length || var82.field2863[var81.field2866] != var81);
                                            class37.method2637(var80);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field536 == 40 || field536 == 45) {
                    method659();
                }
                return;
            }
            var2.field2687.method3086(var2.field2686, (int) var2.field3100, var2.field2689, false);
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method228() {
        boolean var1;
        label193: {
            try {
                if (class183.field2943 == 2) {
                    if (Statics.field1406 == null) {
                        Statics.field1406 = class180.method3265(Statics.field2942, Statics.field2945, Statics.field1229);
                        if (Statics.field1406 == null) {
                            var1 = false;
                            break label193;
                        }
                    }
                    if (Statics.field674 == null) {
                        Statics.field674 = new class60(Statics.field2941, Statics.field2940);
                    }
                    if (Statics.field2944.method3344(Statics.field1406, Statics.field2947, Statics.field674, 22050)) {
                        Statics.field2944.method3345();
                        Statics.field2944.method3342(Statics.field31);
                        Statics.field2944.method3421(Statics.field1406, Statics.field2946);
                        class183.field2943 = 0;
                        Statics.field1406 = null;
                        Statics.field674 = null;
                        Statics.field2942 = null;
                        var1 = true;
                        break label193;
                    }
                }
            } catch (Exception var22) {
                var22.printStackTrace();
                Statics.field2944.method3348();
                class183.field2943 = 0;
                Statics.field1406 = null;
                Statics.field674 = null;
                Statics.field2942 = null;
            }
            var1 = false;
        }
        if (var1 && field340 && Statics.field2123 != null) {
            Statics.field2123.method1142();
        }
        if (field536 == 10 || field536 == 20 || field536 == 30) {
            if (field498 != 0L && class115.method2007() > field498) {
                int var4 = field403 ? 2 : 1;
                field498 = 0L;
                if (var4 >= 2) {
                    field403 = true;
                } else {
                    field403 = false;
                }
                method1045();
                if (field536 >= 25) {
                    Statics.method932();
                }
                field2202 = true;
            } else if (field2205) {
                class137.method2253(Statics.field2029);
                Canvas var5 = Statics.field2029;
                var5.removeMouseListener(class140.field2164);
                var5.removeMouseMotionListener(class140.field2164);
                var5.removeFocusListener(class140.field2164);
                class140.field2150 = 0;
                if (Statics.field208 != null) {
                    Statics.field208.method2643(Statics.field2029);
                }
                Statics.field3128.method2824();
                Statics.field2029.setBackground(Color.black);
                Statics.method982(Statics.field2029);
                class140.method2682(Statics.field2029);
                if (Statics.field208 != null) {
                    Statics.field208.method2645(Statics.field2029);
                }
                if (field422 != -1) {
                    int var6 = field422;
                    int var7 = Statics.field999;
                    int var8 = Statics.field1605;
                    if (class173.method2942(var6)) {
                        method1937(Statics.field2793[var6], -1, var7, var8, false);
                    }
                }
                field2204 = true;
            }
        }
        Dimension var9 = this.method2840();
        if (Statics.field1615 != var9.width || Statics.field587 != var9.height || field2204) {
            method1045();
            field498 = class115.method2007() + 500L;
            field2204 = false;
        }
        boolean var10 = false;
        if (field2202) {
            field2202 = false;
            var10 = true;
            for (int var11 = 0; var11 < 100; var11++) {
                field554[var11] = true;
            }
        }
        if (var10) {
            Statics.method533();
        }
        if (field536 == 0) {
            class144.method42(class32.field735, class32.field719, (Color) null, var10);
        } else if (field536 == 5) {
            class32.method2256(Statics.field232, Statics.field2889, Statics.field2071, var10);
        } else if (field536 == 10 || field536 == 11) {
            class32.method2256(Statics.field232, Statics.field2889, Statics.field2071, var10);
        } else if (field536 == 20) {
            class32.method2256(Statics.field232, Statics.field2889, Statics.field2071, var10);
        } else if (field536 == 25) {
            if (field345 == 1) {
                if (field341 > field366) {
                    field366 = field341;
                }
                int var12 = (field366 * 50 - field341 * 50) / field366;
                method178(class157.field2549 + class2.field22 + class2.field19 + var12 + "%" + class2.field20, false);
            } else if (field345 == 2) {
                if (field343 > field540) {
                    field540 = field343;
                }
                int var13 = (field540 * 50 - field343 * 50) / field540 + 50;
                method178(class157.field2549 + class2.field22 + class2.field19 + var13 + "%" + class2.field20, false);
            } else {
                method178(class157.field2549, false);
            }
        } else if (field536 == 30) {
            method1464();
        } else if (field536 == 40) {
            method178(class157.field2404 + class2.field22 + class157.field2307, false);
        } else if (field536 == 45) {
            method178(class157.field2381, false);
        }
        if (field536 == 30 && field465 == 0 && !var10) {
            try {
                Graphics var14 = Statics.field2029.getGraphics();
                for (int var15 = 0; var15 < field488; var15++) {
                    if (field491[var15]) {
                        Statics.field687.method1491(var14, field493[var15], field494[var15], field495[var15], field467[var15]);
                        field491[var15] = false;
                    }
                }
            } catch (Exception var21) {
                Statics.field2029.repaint();
            }
        } else if (field536 > 0) {
            try {
                Graphics var17 = Statics.field2029.getGraphics();
                Statics.field687.method1518(var17, 0, 0);
                for (int var18 = 0; var18 < field488; var18++) {
                    field491[var18] = false;
                }
            } catch (Exception var20) {
                Statics.field2029.repaint();
            }
        }
    }

    @ObfuscatedName("client.y(I)V")
    public final void method229() {
        if (Statics.field751.method199()) {
            Statics.field751.method196();
        }
        if (Statics.field2065 != null) {
            Statics.field2065.field191 = false;
        }
        Statics.field2065 = null;
        if (Statics.field328 != null) {
            Statics.field328.method2802();
            Statics.field328 = null;
        }
        if (class137.field2118 != null) {
            class137 var1 = class137.field2118;
            synchronized (class137.field2118) {
                class137.field2118 = null;
            }
        }
        class140.method654();
        Statics.field208 = null;
        if (Statics.field2123 != null) {
            Statics.field2123.method1143();
        }
        if (Statics.field1043 != null) {
            Statics.field1043.method1143();
        }
        class171.method2713();
        Object var3 = class170.field2692;
        synchronized (class170.field2692) {
            if (class170.field2693 != 0) {
                class170.field2693 = 1;
                try {
                    class170.field2692.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class149.field2231.method3842();
            for (int var6 = 0; var6 < Statics.field588; var6++) {
                Statics.field3157[var6].method3842();
            }
            class149.field2230.method3842();
            class149.field2232.method3842();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("s.w(IB)V")
    public static void method158(int arg0) {
        if (field536 == arg0) {
            return;
        }
        if (field536 == 0) {
            class144.method943();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field318 = 0;
            field319 = 0;
            field320 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field170 != null) {
            Statics.field170.method2802();
            Statics.field170 = null;
        }
        if (field536 == 25) {
            field345 = 0;
            field341 = 0;
            field366 = 1;
            field343 = 0;
            field540 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method602(Statics.field2029, Statics.field2649, Statics.field1391, true, 0);
        } else if (arg0 == 20) {
            class32.method602(Statics.field2029, Statics.field2649, Statics.field1391, true, field536 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method602(Statics.field2029, Statics.field2649, Statics.field1391, false, 4);
        } else if (Statics.field746) {
            Statics.field723 = null;
            Statics.field728 = null;
            Statics.field733 = null;
            Statics.field721 = null;
            Statics.field1044 = null;
            Statics.field627 = null;
            Statics.field3037 = null;
            Statics.field722 = null;
            Statics.field716 = null;
            Statics.field656 = null;
            Statics.field136 = null;
            Statics.field132 = null;
            Statics.field2719 = null;
            Statics.field187 = null;
            Statics.field263 = null;
            Statics.field280 = null;
            Statics.field718 = null;
            Statics.field2903 = null;
            Statics.field2010 = null;
            Statics.field681 = null;
            Statics.field2067 = null;
            Statics.field186 = null;
            class183.method2633(2);
            class171.method556(true);
            Statics.field746 = false;
        }
        field536 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method244() {
        if (field536 != 1000) {
            boolean var1 = class171.method1521();
            if (!var1) {
                this.method231();
            }
        }
    }

    @ObfuscatedName("client.v(I)V")
    public void method231() {
        if (class171.field2720 >= 4) {
            this.method2833("js5crc");
            field536 = 1000;
            return;
        }
        if (class171.field2704 >= 4) {
            if (field536 <= 5) {
                this.method2833("js5io");
                field536 = 1000;
                return;
            }
            field314 = 3000;
            class171.field2704 = 3;
        }
        if (--field314 + 1 > 0) {
            return;
        }
        try {
            if (field313 == 0) {
                Statics.field218 = Statics.field1935.method2688(Statics.field2278, Statics.field248);
                field313++;
            }
            if (field313 == 1) {
                if (Statics.field218.field2215 == 2) {
                    this.method232(-1);
                    return;
                }
                if (Statics.field218.field2215 == 1) {
                    field313++;
                }
            }
            if (field313 == 2) {
                Statics.field1748 = new class143((Socket) Statics.field218.field2219, Statics.field1935);
                class119 var1 = new class119(5);
                var1.method2305(15);
                var1.method2308(91);
                Statics.field1748.method2799(var1.field1989, 0, 5);
                field313++;
                Statics.field216 = class115.method2007();
            }
            if (field313 == 3) {
                if (field536 <= 5 || Statics.field1748.method2797() > 0) {
                    int var2 = Statics.field1748.method2805();
                    if (var2 != 0) {
                        this.method232(var2);
                        return;
                    }
                    field313++;
                } else if (class115.method2007() - Statics.field216 > 30000L) {
                    this.method232(-2);
                    return;
                }
            }
            if (field313 == 4) {
                class171.method111(Statics.field1748, field536 > 20);
                Statics.field218 = null;
                Statics.field1748 = null;
                field313 = 0;
                field517 = 0;
            }
        } catch (IOException var4) {
            this.method232(-3);
        }
    }

    @ObfuscatedName("client.k(IB)V")
    public void method232(int arg0) {
        Statics.field218 = null;
        Statics.field1748 = null;
        field313 = 0;
        if (Statics.field248 == Statics.field2070) {
            Statics.field248 = Statics.field322;
        } else {
            Statics.field248 = Statics.field2070;
        }
        field517++;
        if (field517 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field536 <= 5) {
                this.method2833("js5connect_full");
                field536 = 1000;
            } else {
                field314 = 3000;
            }
        } else if (field517 >= 2 && arg0 == 6) {
            this.method2833("js5connect_outofdate");
            field536 = 1000;
        } else if (field517 >= 4) {
            if (field536 <= 5) {
                this.method2833("js5connect");
                field536 = 1000;
            } else {
                field314 = 3000;
            }
        }
    }

    @ObfuscatedName("ac.o(B)V")
    public static void method880() {
        if (field312 == 0) {
            Statics.field184 = new class86(4, 104, 104, class6.field80);
            for (int var0 = 0; var0 < 4; var0++) {
                field346[var0] = new class108(104, 104);
            }
            Statics.field1014 = new class79(512, 512);
            class32.field719 = class157.field2308;
            class32.field735 = 5;
            field312 = 20;
        } else if (field312 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1561[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1889(var1, 500, 800, 512, 334);
            class32.field719 = class157.field2456;
            class32.field735 = 10;
            field312 = 30;
        } else if (field312 == 30) {
            Statics.field1110 = method572(0, false, true, true);
            Statics.field2629 = method572(1, false, true, true);
            Statics.field309 = method572(2, true, false, true);
            Statics.field1613 = method572(3, false, true, true);
            Statics.field1042 = method572(4, false, true, true);
            Statics.field321 = method572(5, true, true, true);
            Statics.field264 = method572(6, true, true, false);
            Statics.field3188 = method572(7, false, true, true);
            Statics.field1391 = method572(8, false, true, true);
            Statics.field424 = method572(9, false, true, true);
            Statics.field2649 = method572(10, false, true, true);
            Statics.field117 = method572(11, false, true, true);
            Statics.field798 = method572(12, false, true, true);
            Statics.field771 = method572(13, true, false, true);
            Statics.field1380 = method572(14, false, true, false);
            Statics.field124 = method572(15, false, true, true);
            class32.field719 = class157.field2310;
            class32.field735 = 20;
            field312 = 40;
        } else if (field312 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1110.method3083() * 4 / 100;
            int var8 = var7 + Statics.field2629.method3083() * 4 / 100;
            int var9 = var8 + Statics.field309.method3083() * 2 / 100;
            int var10 = var9 + Statics.field1613.method3083() * 2 / 100;
            int var11 = var10 + Statics.field1042.method3083() * 6 / 100;
            int var12 = var11 + Statics.field321.method3083() * 4 / 100;
            int var13 = var12 + Statics.field264.method3083() * 2 / 100;
            int var14 = var13 + Statics.field3188.method3083() * 60 / 100;
            int var15 = var14 + Statics.field1391.method3083() * 2 / 100;
            int var16 = var15 + Statics.field424.method3083() * 2 / 100;
            int var17 = var16 + Statics.field2649.method3083() * 2 / 100;
            int var18 = var17 + Statics.field117.method3083() * 2 / 100;
            int var19 = var18 + Statics.field798.method3083() * 2 / 100;
            int var20 = var19 + Statics.field771.method3083() * 2 / 100;
            int var21 = var20 + Statics.field1380.method3083() * 2 / 100;
            int var22 = var21 + Statics.field124.method3083() * 2 / 100;
            if (var22 == 100) {
                class32.field719 = class157.field2312;
                class32.field735 = 30;
                field312 = 45;
            } else {
                if (var22 != 0) {
                    class32.field719 = class157.field2334 + var22 + "%";
                }
                class32.field735 = 30;
            }
        } else if (field312 == 45) {
            class57.method2910(22050, !field291, 2);
            class184 var23 = new class184();
            var23.method3399(9, 128);
            Statics.field2123 = class57.method148(Statics.field1935, Statics.field2029, 0, 22050);
            Statics.field2123.method1178(var23);
            class168 var24 = Statics.field124;
            class168 var25 = Statics.field1380;
            class168 var26 = Statics.field1042;
            Statics.field2947 = var24;
            Statics.field2940 = var25;
            Statics.field2941 = var26;
            Statics.field2944 = var23;
            Statics.field1043 = class57.method148(Statics.field1935, Statics.field2029, 1, 2048);
            Statics.field1633 = new class56();
            Statics.field1043.method1178(Statics.field1633);
            Statics.field1535 = new class75(22050, Statics.field1199);
            class32.field719 = class157.field2313;
            class32.field735 = 35;
            field312 = 50;
        } else if (field312 == 50) {
            int var27 = 0;
            if (Statics.field2889 == null) {
                Statics.field2889 = class77.method970(Statics.field1391, Statics.field771, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field2071 == null) {
                Statics.field2071 = class77.method970(Statics.field1391, Statics.field771, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field232 == null) {
                Statics.field232 = class77.method970(Statics.field1391, Statics.field771, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class32.field719 = class157.field2314 + var27 * 100 / 3 + "%";
                class32.field735 = 40;
            } else {
                Statics.field811 = new class160(true);
                class32.field719 = class157.field2472;
                class32.field735 = 40;
                field312 = 60;
            }
        } else if (field312 == 60) {
            int var28 = class32.method2641(Statics.field2649, Statics.field1391);
            byte var29 = 8;
            if (var28 < var29) {
                class32.field719 = class157.field2316 + var28 * 100 / var29 + "%";
                class32.field735 = 50;
            } else {
                class32.field719 = class157.field2317;
                class32.field735 = 50;
                method158(5);
                field312 = 70;
            }
        } else if (field312 == 70) {
            if (Statics.field309.method3011()) {
                class168 var31 = Statics.field309;
                Statics.field1055 = var31;
                class168 var32 = Statics.field309;
                Statics.field981 = var32;
                class168 var33 = Statics.field309;
                class168 var34 = Statics.field3188;
                Statics.field1031 = var33;
                Statics.field1030 = var34;
                Statics.field1033 = Statics.field1031.method3017(3);
                class41.method3129(Statics.field309, Statics.field3188, field291);
                class168 var35 = Statics.field309;
                class168 var36 = Statics.field3188;
                Statics.field896 = var35;
                Statics.field923 = var36;
                class52.method553(Statics.field309, Statics.field3188, field290, Statics.field2889);
                class168 var37 = Statics.field309;
                class168 var38 = Statics.field1110;
                class168 var39 = Statics.field2629;
                Statics.field1008 = var37;
                Statics.field989 = var38;
                Statics.field993 = var39;
                class44.method628(Statics.field309, Statics.field3188);
                class168 var40 = Statics.field309;
                Statics.field1083 = var40;
                class168 var41 = Statics.field309;
                Statics.field1168 = var41;
                Statics.field1170 = Statics.field1168.method3017(16);
                class168 var42 = Statics.field1613;
                class168 var43 = Statics.field3188;
                class168 var44 = Statics.field1391;
                class168 var45 = Statics.field771;
                Statics.field2744 = var42;
                Statics.field2733 = var43;
                Statics.field2851 = var44;
                Statics.field1947 = var45;
                Statics.field2793 = new class173[Statics.field2744.method3053()][];
                Statics.field2731 = new boolean[Statics.field2744.method3053()];
                class51.method1930(Statics.field309);
                class168 var46 = Statics.field309;
                Statics.field1097 = var46;
                class46.method2889(Statics.field309);
                class168 var47 = Statics.field309;
                Statics.field1102 = var47;
                Statics.field751 = new class20();
                class32.field719 = class157.field2319;
                class32.field735 = 60;
                field312 = 80;
            } else {
                class32.field719 = class157.field2311 + Statics.field309.method3094() + "%";
                class32.field735 = 60;
            }
        } else if (field312 == 80) {
            int var48 = 0;
            if (Statics.field2007 == null) {
                class168 var49 = Statics.field1391;
                int var50 = var49.method3022("compass");
                int var51 = var49.method3023(var50, "");
                class79 var52 = class77.method2105(var49, var50, var51);
                Statics.field2007 = var52;
            } else {
                var48++;
            }
            if (Statics.field3056 == null) {
                class168 var53 = Statics.field1391;
                int var54 = var53.method3022("mapedge");
                int var55 = var53.method3023(var54, "");
                class79 var56 = class77.method2105(var53, var54, var55);
                Statics.field3056 = var56;
            } else {
                var48++;
            }
            if (Statics.field171 == null) {
                Statics.field171 = class77.method45(Statics.field1391, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field886 == null) {
                Statics.field886 = class77.method102(Statics.field1391, "mapfunction", "");
            } else {
                var48++;
            }
            if (Statics.field173 == null) {
                Statics.field173 = class77.method102(Statics.field1391, "hitmarks", "");
            } else {
                var48++;
            }
            if (Statics.field1079 == null) {
                Statics.field1079 = class77.method102(Statics.field1391, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field2142 == null) {
                Statics.field2142 = class77.method102(Statics.field1391, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field582 == null) {
                Statics.field582 = class77.method102(Statics.field1391, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field363 == null) {
                Statics.field363 = class77.method102(Statics.field1391, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field2209 == null) {
                Statics.field2209 = class77.method102(Statics.field1391, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field2052 == null) {
                Statics.field2052 = class77.method102(Statics.field1391, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field774 == null) {
                Statics.field774 = class77.method45(Statics.field1391, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field2626 == null) {
                Statics.field2626 = class77.method45(Statics.field1391, "mod_icons", "");
            } else {
                var48++;
            }
            if (var48 < 13) {
                class32.field719 = class157.field2320 + var48 * 100 / 13 + "%";
                class32.field735 = 70;
            } else {
                Statics.field3167 = Statics.field2626;
                Statics.field3056.method1570();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                for (int var61 = 0; var61 < Statics.field886.length; var61++) {
                    Statics.field886[var61].method1569(var57 + var60, var58 + var60, var59 + var60);
                }
                Statics.field171[0].method1720(var57 + var60, var58 + var60, var59 + var60);
                class32.field719 = class157.field2342;
                class32.field735 = 70;
                field312 = 90;
            }
        } else if (field312 == 90) {
            if (Statics.field424.method3011()) {
                class95 var62 = new class95(Statics.field424, Statics.field1391, 20, 0.8D, field291 ? 64 : 128);
                class91.method1944(var62);
                class91.method1946(0.8D);
                class32.field719 = class157.field2384;
                class32.field735 = 90;
                field312 = 110;
            } else {
                class32.field719 = class157.field2364 + Statics.field424.method3094() + "%";
                class32.field735 = 90;
            }
        } else if (field312 == 110) {
            Statics.field2065 = new class14();
            Statics.field1935.method2689(Statics.field2065, 10);
            class32.field719 = class157.field2324;
            class32.field735 = 94;
            field312 = 120;
        } else if (field312 == 120) {
            if (Statics.field2649.method3025("huffman", "")) {
                class113 var63 = new class113(Statics.field2649.method3049("huffman", ""));
                Statics.field2633 = var63;
                class32.field719 = class157.field2559;
                class32.field735 = 96;
                field312 = 130;
            } else {
                class32.field719 = class157.field2325 + "%";
                class32.field735 = 96;
            }
        } else if (field312 == 130) {
            if (!Statics.field1613.method3011()) {
                class32.field719 = class157.field2422 + Statics.field1613.method3094() * 4 / 5 + "%";
                class32.field735 = 100;
            } else if (!Statics.field798.method3011()) {
                class32.field719 = class157.field2422 + (80 + Statics.field798.method3094() / 6) + "%";
                class32.field735 = 100;
            } else if (Statics.field771.method3011()) {
                class32.field719 = class157.field2375;
                class32.field735 = 100;
                field312 = 140;
            } else {
                class32.field719 = class157.field2422 + (96 + Statics.field771.method3094() / 20) + "%";
                class32.field735 = 100;
            }
        } else if (field312 == 140) {
            method158(10);
        }
    }

    @ObfuscatedName("b.u(IZZZB)Lfb;")
    public static class168 method572(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2231 != null) {
            var4 = new class134(arg0, class149.field2231, Statics.field3157[arg0], 1000000);
        }
        return new class168(var4, Statics.field675, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ap.s(I)V")
    public static final void method659() {
        try {
            if (field318 == 0) {
                if (Statics.field328 != null) {
                    Statics.field328.method2802();
                    Statics.field328 = null;
                }
                Statics.field1053 = null;
                field529 = false;
                field319 = 0;
                field318 = 1;
            }
            if (field318 == 1) {
                if (Statics.field1053 == null) {
                    Statics.field1053 = Statics.field1935.method2688(Statics.field2278, Statics.field248);
                }
                if (Statics.field1053.field2215 == 2) {
                    throw new IOException();
                }
                if (Statics.field1053.field2215 == 1) {
                    Statics.field328 = new class143((Socket) Statics.field1053.field2219, Statics.field1935);
                    Statics.field1053 = null;
                    field318 = 2;
                }
            }
            if (field318 == 2) {
                field329.field1988 = 0;
                field329.method2305(14);
                Statics.field328.method2799(field329.field1989, 0, 1);
                field331.field1988 = 0;
                field318 = 3;
            }
            if (field318 == 3) {
                if (Statics.field2123 != null) {
                    Statics.field2123.method1141();
                }
                if (Statics.field1043 != null) {
                    Statics.field1043.method1141();
                }
                int var0 = Statics.field328.method2805();
                if (Statics.field2123 != null) {
                    Statics.field2123.method1141();
                }
                if (Statics.field1043 != null) {
                    Statics.field1043.method1141();
                }
                if (var0 != 0) {
                    method1048(var0);
                    return;
                }
                field331.field1988 = 0;
                field318 = 5;
            }
            if (field318 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field329.field1988 = 0;
                field329.method2305(1);
                field329.method2305(class32.field743.method531());
                field329.method2308(var1[0]);
                field329.method2308(var1[1]);
                field329.method2308(var1[2]);
                field329.method2308(var1[3]);
                switch(class32.field743.field2583) {
                    case 0:
                    case 2:
                        field329.method2512(Statics.field2069);
                        field329.field1988 += 5;
                        break;
                    case 1:
                        field329.field1988 += 8;
                        break;
                    case 3:
                        field329.method2308((Integer) Statics.field1028.field144.get(class163.method2195(class32.field741)));
                        field329.field1988 += 4;
                }
                field329.method2311(class32.field742);
                field329.method2339(class5.field76, class5.field71);
                field330.field1988 = 0;
                if (field536 == 40) {
                    field330.method2305(18);
                } else {
                    field330.method2305(16);
                }
                field330.method2501(0);
                int var2 = field330.field1988;
                field330.method2308(91);
                field330.method2452(field329.field1989, 0, field329.field1988);
                int var3 = field330.field1988;
                field330.method2311(class32.field741);
                field330.method2305((field403 ? 1 : 0) << 1 | (field291 ? 1 : 0));
                field330.method2501(Statics.field999);
                field330.method2501(Statics.field1605);
                class122 var4 = field330;
                byte[] var5 = new byte[24];
                try {
                    class149.field2232.method3839(0L);
                    class149.field2232.method3838(var5);
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
                var4.method2452(var5, 0, 24);
                field330.method2311(Statics.field3118);
                field330.method2308(Statics.field2189);
                class119 var9 = new class119(Statics.field811.method2936());
                Statics.field811.method2935(var9);
                field330.method2452(var9.field1989, 0, var9.field1989.length);
                field330.method2305(Statics.field13);
                field330.method2308(Statics.field1110.field2666);
                field330.method2308(Statics.field2629.field2666);
                field330.method2308(Statics.field309.field2666);
                field330.method2308(Statics.field1613.field2666);
                field330.method2308(Statics.field1042.field2666);
                field330.method2308(Statics.field321.field2666);
                field330.method2308(Statics.field264.field2666);
                field330.method2308(Statics.field3188.field2666);
                field330.method2308(Statics.field1391.field2666);
                field330.method2308(Statics.field424.field2666);
                field330.method2308(Statics.field2649.field2666);
                field330.method2308(Statics.field117.field2666);
                field330.method2308(Statics.field798.field2666);
                field330.method2308(Statics.field771.field2666);
                field330.method2308(Statics.field1380.field2666);
                field330.method2308(Statics.field124.field2666);
                field330.method2483(var1, var3, field330.field1988);
                field330.method2316(field330.field1988 - var2);
                Statics.field328.method2799(field330.field1989, 0, field330.field1988);
                field329.method2564(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field331.method2564(var1);
                field318 = 6;
            }
            if (field318 == 6 && Statics.field328.method2797() > 0) {
                int var11 = Statics.field328.method2805();
                if (var11 == 21 && field536 == 20) {
                    field318 = 7;
                } else if (var11 == 2) {
                    field318 = 9;
                } else if (var11 == 15 && field536 == 40) {
                    field444 = -1;
                    field318 = 13;
                } else if (var11 == 23 && field320 < 1) {
                    field320++;
                    field318 = 0;
                } else if (var11 == 29) {
                    field318 = 11;
                } else {
                    method1048(var11);
                    return;
                }
            }
            if (field318 == 7 && Statics.field328.method2797() > 0) {
                field537 = (Statics.field328.method2805() + 3) * 60;
                field318 = 8;
            }
            if (field318 == 8) {
                field319 = 0;
                class32.method1557(class157.field2332, class157.field2333, field537 / 60 + class157.field2412);
                if (--field537 <= 0) {
                    field318 = 0;
                }
            } else {
                if (field318 == 9 && Statics.field328.method2797() >= 13) {
                    boolean var12 = Statics.field328.method2805() == 1;
                    Statics.field328.method2798(field331.field1989, 0, 4);
                    field331.field1988 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field331.method2579() << 24;
                        int var15 = var14 | field331.method2579() << 16;
                        int var16 = var15 | field331.method2579() << 8;
                        int var17 = var16 | field331.method2579();
                        int var18 = class163.method2195(class32.field741);
                        if (Statics.field1028.field144.size() >= 10 && !Statics.field1028.field144.containsKey(var18)) {
                            Iterator var19 = Statics.field1028.field144.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field1028.field144.put(var18, var17);
                        class9.method2738();
                    }
                    field452 = Statics.field328.method2805();
                    field300 = Statics.field328.method2805() == 1;
                    field288 = Statics.field328.method2805();
                    field288 <<= 0x8;
                    field288 += Statics.field328.method2805();
                    field562 = Statics.field328.method2805();
                    Statics.field328.method2798(field331.field1989, 0, 1);
                    field331.field1988 = 0;
                    field523 = field331.method2579();
                    Statics.field328.method2798(field331.field1989, 0, 2);
                    field331.field1988 = 0;
                    field444 = field331.method2322();
                    if (field562 == 1) {
                        try {
                            client var20 = Statics.field3128;
                            JSObject.getWindow(var20).call("zap", (Object[]) null);
                        } catch (Throwable var34) {
                        }
                    } else {
                        try {
                            client var22 = Statics.field3128;
                            JSObject.getWindow(var22).call("unzap", (Object[]) null);
                        } catch (Throwable var33) {
                        }
                    }
                    field318 = 10;
                }
                if (field318 != 10) {
                    if (field318 == 11 && Statics.field328.method2797() >= 2) {
                        field331.field1988 = 0;
                        Statics.field328.method2798(field331.field1989, 0, 2);
                        field331.field1988 = 0;
                        Statics.field213 = field331.method2322();
                        field318 = 12;
                    }
                    if (field318 == 12 && Statics.field328.method2797() >= Statics.field213) {
                        field331.field1988 = 0;
                        Statics.field328.method2798(field331.field1989, 0, Statics.field213);
                        field331.field1988 = 0;
                        String var24 = field331.method2350();
                        String var25 = field331.method2350();
                        String var26 = field331.method2350();
                        class32.method1557(var24, var25, var26);
                        method158(10);
                    }
                    if (field318 == 13) {
                        if (field444 == -1) {
                            if (Statics.field328.method2797() < 2) {
                                return;
                            }
                            Statics.field328.method2798(field331.field1989, 0, 2);
                            field331.field1988 = 0;
                            field444 = field331.method2322();
                        }
                        if (Statics.field328.method2797() >= field444) {
                            Statics.field328.method2798(field331.field1989, 0, field444);
                            field331.field1988 = 0;
                            int var27 = field444;
                            field329.field1988 = 0;
                            field331.field1988 = 0;
                            field523 = -1;
                            field454 = -1;
                            field362 = -1;
                            field338 = -1;
                            field444 = 0;
                            field450 = 0;
                            field464 = 0;
                            field427 = 0;
                            field334 = false;
                            field541 = 0;
                            field519 = 0;
                            for (int var28 = 0; var28 < 2048; var28++) {
                                field407[var28] = null;
                            }
                            Statics.field2683 = null;
                            for (int var29 = 0; var29 < field326.length; var29++) {
                                class35 var30 = field326[var29];
                                if (var30 != null) {
                                    var30.field842 = -1;
                                    var30.field843 = false;
                                }
                            }
                            class16.method115();
                            method158(30);
                            for (int var31 = 0; var31 < 100; var31++) {
                                field554[var31] = true;
                            }
                            Statics.method932();
                            class33.method729(field331);
                            if (field331.field1988 != var27) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field319++;
                        if (field319 > 2000) {
                            if (field320 < 1) {
                                if (Statics.field248 == Statics.field2070) {
                                    Statics.field248 = Statics.field322;
                                } else {
                                    Statics.field248 = Statics.field2070;
                                }
                                field320++;
                                field318 = 0;
                            } else {
                                method1048(-3);
                            }
                        }
                    }
                } else if (Statics.field328.method2797() >= field444) {
                    field331.field1988 = 0;
                    Statics.field328.method2798(field331.field1989, 0, field444);
                    method699();
                    class33.method729(field331);
                    Statics.field1756 = -1;
                    method2658(false);
                    field523 = -1;
                }
            }
        } catch (IOException var36) {
            if (field320 < 1) {
                if (Statics.field248 == Statics.field2070) {
                    Statics.field248 = Statics.field322;
                } else {
                    Statics.field248 = Statics.field2070;
                }
                field320++;
                field318 = 0;
            } else {
                method1048(-2);
            }
        }
    }

    @ObfuscatedName("aa.g(I)V")
    public static void method699() {
        field296 = -1L;
        field367 = -1;
        Statics.field2065.field197 = 0;
        Statics.field2579 = true;
        field490 = true;
        field511 = -1L;
        class211.field3114 = new class202();
        field329.field1988 = 0;
        field331.field1988 = 0;
        field523 = -1;
        field454 = -1;
        field362 = -1;
        field338 = -1;
        field450 = 0;
        field464 = 0;
        field339 = 0;
        field303 = 0;
        field427 = 0;
        field334 = false;
        class140.method474(0);
        class12.method3656();
        field409 = 0;
        field496 = false;
        field527 = 0;
        field350 = (int) (Math.random() * 100.0D) - 50;
        field352 = (int) (Math.random() * 110.0D) - 55;
        field572 = (int) (Math.random() * 80.0D) - 40;
        field358 = (int) (Math.random() * 120.0D) - 60;
        field359 = (int) (Math.random() * 30.0D) - 20;
        field371 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field541 = 0;
        field514 = -1;
        field519 = 0;
        field520 = 0;
        field311 = class21.field576;
        field316 = 0;
        class33.method2794();
        for (int var0 = 0; var0 < 2048; var0++) {
            field407[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field326[var1] = null;
        }
        field509 = -1;
        field302.method3540();
        field448.method3540();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field418[var2][var3][var4] = null;
                }
            }
        }
        field499 = new class199();
        field553 = 0;
        field552 = 0;
        field317 = 0;
        for (int var5 = 0; var5 < Statics.field1170; var5++) {
            class53 var6 = class53.method2941(var5);
            if (var6 != null) {
                class176.field2894[var5] = 0;
                class176.field2896[var5] = 0;
            }
        }
        Statics.field751.method194();
        field453 = -1;
        if (field422 != -1) {
            int var7 = field422;
            if (var7 != -1 && Statics.field2731[var7]) {
                Statics.field2744.method3019(var7);
                if (Statics.field2793[var7] != null) {
                    boolean var8 = true;
                    for (int var9 = 0; var9 < Statics.field2793[var7].length; var9++) {
                        if (Statics.field2793[var7][var9] != null) {
                            if (Statics.field2793[var7][var9].field2743 == 2) {
                                var8 = false;
                            } else {
                                Statics.field2793[var7][var9] = null;
                            }
                        }
                    }
                    if (var8) {
                        Statics.field2793[var7] = null;
                    }
                    Statics.field2731[var7] = false;
                }
            }
        }
        for (class4 var10 = (class4) field446.method3515(); var10 != null; var10 = (class4) field446.method3516()) {
            method184(var10, true);
        }
        field422 = -1;
        field446 = new class196(8);
        field449 = null;
        field334 = false;
        field427 = 0;
        field558.method3230((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var11 = 0; var11 < 8; var11++) {
            field414[var11] = null;
            field415[var11] = false;
        }
        class16.method115();
        field294 = true;
        for (int var12 = 0; var12 < 100; var12++) {
            field554[var12] = true;
        }
        Statics.method932();
        field512 = null;
        Statics.field2229 = 0;
        Statics.field174 = null;
        for (int var13 = 0; var13 < 8; var13++) {
            field349[var13] = new class220();
        }
        Statics.field162 = null;
    }

    @ObfuscatedName("bm.x(II)V")
    public static void method1048(int arg0) {
        if (arg0 == -3) {
            class32.method1557(class157.field2335, class157.field2336, class157.field2337);
        } else if (arg0 == -2) {
            class32.method1557(class157.field2338, class157.field2339, class157.field2340);
        } else if (arg0 == -1) {
            class32.method1557(class157.field2341, class157.field2455, class157.field2354);
        } else if (arg0 == 3) {
            class32.method1557(class157.field2297, class157.field2435, class157.field2346);
        } else if (arg0 == 4) {
            class32.method1557(class157.field2347, class157.field2493, class157.field2368);
        } else if (arg0 == 5) {
            class32.method1557(class157.field2350, class157.field2351, class157.field2471);
        } else if (arg0 == 6) {
            class32.method1557(class157.field2349, class157.field2306, class157.field2355);
        } else if (arg0 == 7) {
            class32.method1557(class157.field2427, class157.field2357, class157.field2539);
        } else if (arg0 == 8) {
            class32.method1557(class157.field2359, class157.field2360, class157.field2361);
        } else if (arg0 == 9) {
            class32.method1557(class157.field2362, class157.field2363, class157.field2454);
        } else if (arg0 == 10) {
            class32.method1557(class157.field2365, class157.field2321, class157.field2367);
        } else if (arg0 == 11) {
            class32.method1557(class157.field2477, class157.field2305, class157.field2370);
        } else if (arg0 == 12) {
            class32.method1557(class157.field2371, class157.field2372, class157.field2373);
        } else if (arg0 == 13) {
            class32.method1557(class157.field2374, class157.field2535, class157.field2376);
        } else if (arg0 == 14) {
            class32.method1557(class157.field2377, class157.field2492, class157.field2394);
        } else if (arg0 == 16) {
            class32.method1557(class157.field2380, class157.field2379, class157.field2382);
        } else if (arg0 == 17) {
            class32.method1557(class157.field2383, class157.field2443, class157.field2385);
        } else if (arg0 == 18) {
            class32.method1557(class157.field2560, class157.field2396, class157.field2388);
        } else if (arg0 == 19) {
            class32.method1557(class157.field2389, class157.field2390, class157.field2391);
        } else if (arg0 == 20) {
            class32.method1557(class157.field2511, class157.field2393, class157.field2462);
        } else if (arg0 == 22) {
            class32.method1557(class157.field2395, class157.field2406, class157.field2352);
        } else if (arg0 == 23) {
            class32.method1557(class157.field2398, class157.field2506, class157.field2400);
        } else if (arg0 == 24) {
            class32.method1557(class157.field2401, class157.field2402, class157.field2403);
        } else if (arg0 == 25) {
            class32.method1557(class157.field2512, class157.field2405, class157.field2392);
        } else if (arg0 == 26) {
            class32.method1557(class157.field2407, class157.field2408, class157.field2409);
        } else if (arg0 == 27) {
            class32.method1557(class157.field2410, class157.field2411, class157.field2424);
        } else if (arg0 == 31) {
            class32.method1557(class157.field2419, class157.field2420, class157.field2421);
        } else if (arg0 == 32) {
            class32.method1557(class157.field2533, class157.field2423, class157.field2447);
        } else if (arg0 == 37) {
            class32.method1557(class157.field2425, class157.field2426, class157.field2554);
        } else if (arg0 == 38) {
            class32.method1557(class157.field2428, class157.field2295, class157.field2430);
        } else if (arg0 == 55) {
            class32.method1557(class157.field2431, class157.field2432, class157.field2433);
        } else if (arg0 == 56) {
            class32.method1557(class157.field2434, class157.field2397, class157.field2436);
            method158(11);
            return;
        } else if (arg0 == 57) {
            class32.method1557(class157.field2437, class157.field2438, class157.field2439);
            method158(11);
            return;
        } else {
            class32.method1557(class157.field2440, class157.field2399, class157.field2442);
        }
        method158(10);
    }

    @ObfuscatedName("ey.a(I)V")
    public static final void method2924() {
        if (Statics.field328 != null) {
            Statics.field328.method2802();
            Statics.field328 = null;
        }
        method623();
        Statics.field184.method1755();
        for (int var0 = 0; var0 < 4; var0++) {
            field346[var0].method2232();
        }
        System.gc();
        class183.method2633(2);
        field538 = -1;
        field340 = false;
        class24.method37();
        method158(10);
    }

    @ObfuscatedName("ab.t(I)V")
    public static final void method623() {
        class47.method96();
        class42.method2114();
        class45.field1032.method3483();
        class41.field932.method3483();
        class41.field944.method3483();
        class41.field933.method3483();
        class41.field934.method3483();
        class40.field926.method3483();
        class40.field891.method3483();
        class52.method571();
        class43.method2751();
        class44.method2200();
        class48.field1071.method3483();
        class53.method3460();
        class179.method176();
        class173.field2818.method3483();
        class173.field2822.method3483();
        class173.field2737.method3483();
        class173.field2738.method3483();
        ((class95) Statics.field1576).method2015();
        class23.field592.method3483();
        Statics.field1110.method3058();
        Statics.field2629.method3058();
        Statics.field1613.method3058();
        Statics.field1042.method3058();
        Statics.field321.method3058();
        Statics.field264.method3058();
        Statics.field3188.method3058();
        Statics.field1391.method3058();
        Statics.field424.method3058();
        Statics.field2649.method3058();
        Statics.field117.method3058();
        Statics.field798.method3058();
    }

    @ObfuscatedName("client.z(B)V")
    public static final void method469() {
        if (field339 > 0) {
            method2924();
        } else {
            method158(40);
            Statics.field170 = Statics.field328;
            Statics.field328 = null;
        }
    }

    @ObfuscatedName("ae.r(B)V")
    public static final void method800() {
        if (Statics.field1043 != null) {
            Statics.field1043.method1139();
        }
        if (Statics.field2123 != null) {
            Statics.field2123.method1139();
        }
    }

    @ObfuscatedName("cj.d(I)V")
    public static final void method2021() {
        for (int var0 = 0; var0 < field527; var0++) {
            int var10002 = field530[var0]--;
            if (field530[var0] >= -10) {
                class59 var2 = field564[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1204(Statics.field1042, field528[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field530[var0] += var2.method1194();
                    field564[var0] = var2;
                }
                if (field530[var0] < 0) {
                    int var9;
                    if (field531[var0] == 0) {
                        var9 = field525;
                    } else {
                        int var3 = (field531[var0] & 0xFF) * 128;
                        int var4 = field531[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2683.field861;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field531[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2683.field818;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field530[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field526 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1196().method1232(Statics.field1535);
                        class65 var11 = class65.method1256(var10, 100, var9);
                        var11.method1294(field292[var0] - 1);
                        Statics.field1633.method1122(var11);
                    }
                    field530[var0] = -100;
                }
            } else {
                field527--;
                for (int var1 = var0; var1 < field527; var1++) {
                    field528[var1] = field528[var1 + 1];
                    field564[var1] = field564[var1 + 1];
                    field292[var1] = field292[var1 + 1];
                    field530[var1] = field530[var1 + 1];
                    field531[var1] = field531[var1 + 1];
                }
                var0--;
            }
        }
        if (!field340) {
            return;
        }
        boolean var12;
        if (class183.field2943 == 0) {
            var12 = Statics.field2944.method3349();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field522 != 0 && field538 != -1) {
                class183.method3635(Statics.field264, field538, 0, field522, false);
            }
            field340 = false;
        }
    }

    @ObfuscatedName("aa.n(Laz;IIII)V")
    public static void method704(class43 arg0, int arg1, int arg2, int arg3) {
        if (field527 >= 50 || field526 == 0 || arg0.field996 == null || arg1 >= arg0.field996.length) {
            return;
        }
        int var4 = arg0.field996[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field528[field527] = var5;
        field292[field527] = var6;
        field530[field527] = 0;
        field564[field527] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field531[field527] = (var8 << 16) + (var9 << 8) + var7;
        field527++;
    }

    @ObfuscatedName("ey.j(IIII)V")
    public static void method2923(int arg0, int arg1, int arg2) {
        if (field525 == 0 || arg1 == 0 || field527 >= 50) {
            return;
        }
        field528[field527] = arg0;
        field292[field527] = arg1;
        field530[field527] = arg2;
        field564[field527] = null;
        field531[field527] = 0;
        field527++;
    }

    @ObfuscatedName("fz.b(Lfu;III)V")
    public static final void method2994(class173 arg0, int arg1, int arg2) {
        if (field541 != 0 && field541 != 3 || class140.field2160 != 1 && Statics.field1954 || class140.field2160 != 4) {
            return;
        }
        class175 var3 = arg0.method3169(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2161 - arg1;
        int var5 = class140.field2151 - arg2;
        if (!var3.method3192(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2883 / 2;
        int var7 = var5 - var3.field2881 / 2;
        int var8 = field371 + field358 & 0x7FF;
        int var9 = class91.field1561[var8];
        int var10 = class91.field1585[var8];
        int var11 = (field359 + 256) * var9 >> 8;
        int var12 = (field359 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field2683.field861 + var13 >> 7;
        int var16 = Statics.field2683.field818 - var14 >> 7;
        field329.method2565(177);
        field329.method2305(18);
        field329.method2353(Statics.field77 + var15);
        field329.method2352(Statics.field271 + var16);
        field329.method2344(class137.field2125[82] ? (class137.field2125[81] ? 2 : 1) : 0);
        field329.method2305(var6);
        field329.method2305(var7);
        field329.method2501(field371);
        field329.method2305(57);
        field329.method2305(field358);
        field329.method2305(field359);
        field329.method2305(89);
        field329.method2501(Statics.field2683.field861);
        field329.method2501(Statics.field2683.field818);
        field329.method2305(63);
        field519 = var15;
        field520 = var16;
    }

    @ObfuscatedName("ev.e(I)V")
    public static final void method2696() {
        for (int var0 = 0; var0 < field316; var0++) {
            int var1 = field325[var0];
            class35 var2 = field326[var1];
            if (var2 != null) {
                method177(var2, var2.field785.field894);
            }
        }
    }

    @ObfuscatedName("x.ai(Lad;II)V")
    public static final void method177(class38 arg0, int arg1) {
        if (arg0.field830 > field295) {
            method875(arg0);
        } else if (arg0.field847 >= field295) {
            if (field295 == arg0.field847 || arg0.field848 == -1 || arg0.field855 != 0 || arg0.field850 + 1 > class43.method2257(arg0.field848).field995[arg0.field856]) {
                int var2 = arg0.field847 - arg0.field830;
                int var3 = field295 - arg0.field830;
                int var4 = arg0.field826 * 128 + arg0.field821 * 64;
                int var5 = arg0.field860 * 128 + arg0.field821 * 64;
                int var6 = arg0.field859 * 128 + arg0.field821 * 64;
                int var7 = arg0.field823 * 128 + arg0.field821 * 64;
                arg0.field861 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field818 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field874 = 0;
            arg0.field867 = arg0.field836;
            arg0.field819 = arg0.field867;
        } else {
            method2628(arg0);
        }
        if (arg0.field861 < 128 || arg0.field818 < 128 || arg0.field861 >= 13184 || arg0.field818 >= 13184) {
            arg0.field848 = -1;
            arg0.field853 = -1;
            arg0.field830 = 0;
            arg0.field847 = 0;
            arg0.field861 = arg0.field871[0] * 128 + arg0.field821 * 64;
            arg0.field818 = arg0.field872[0] * 128 + arg0.field821 * 64;
            arg0.method715();
        }
        if (Statics.field2683 == arg0 && (arg0.field861 < 1536 || arg0.field818 < 1536 || arg0.field861 >= 11776 || arg0.field818 >= 11776)) {
            arg0.field848 = -1;
            arg0.field853 = -1;
            arg0.field830 = 0;
            arg0.field847 = 0;
            arg0.field861 = arg0.field871[0] * 128 + arg0.field821 * 64;
            arg0.field818 = arg0.field872[0] * 128 + arg0.field821 * 64;
            arg0.method715();
        }
        if (arg0.field869 != 0) {
            if (arg0.field842 != -1) {
                class38 var8 = null;
                if (arg0.field842 < 32768) {
                    var8 = field326[arg0.field842];
                } else if (arg0.field842 >= 32768) {
                    var8 = field407[arg0.field842 - 32768];
                }
                if (var8 != null) {
                    int var9 = arg0.field861 - var8.field861;
                    int var10 = arg0.field818 - var8.field818;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field867 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field843) {
                    arg0.field842 = -1;
                    arg0.field843 = false;
                }
            }
            if (arg0.field844 != -1 && (arg0.field870 == 0 || arg0.field874 > 0)) {
                arg0.field867 = arg0.field844;
                arg0.field844 = -1;
            }
            int var11 = arg0.field867 - arg0.field819 & 0x7FF;
            if (var11 == 0 && arg0.field843) {
                arg0.field842 = -1;
                arg0.field843 = false;
            }
            if (var11 == 0) {
                arg0.field868 = 0;
            } else {
                arg0.field868++;
                if (var11 > 1024) {
                    arg0.field819 -= arg0.field869;
                    boolean var12 = true;
                    if (var11 < arg0.field869 || var11 > 2048 - arg0.field869) {
                        arg0.field819 = arg0.field867;
                        var12 = false;
                    }
                    if (arg0.field849 == arg0.field822 && (arg0.field868 > 25 || var12)) {
                        if (arg0.field832 == -1) {
                            arg0.field849 = arg0.field825;
                        } else {
                            arg0.field849 = arg0.field832;
                        }
                    }
                } else {
                    arg0.field819 += arg0.field869;
                    boolean var13 = true;
                    if (var11 < arg0.field869 || var11 > 2048 - arg0.field869) {
                        arg0.field819 = arg0.field867;
                        var13 = false;
                    }
                    if (arg0.field849 == arg0.field822 && (arg0.field868 > 25 || var13)) {
                        if (arg0.field824 == -1) {
                            arg0.field849 = arg0.field825;
                        } else {
                            arg0.field849 = arg0.field824;
                        }
                    }
                }
                arg0.field819 &= 0x7FF;
            }
        }
        method874(arg0);
    }

    @ObfuscatedName("ac.ao(Lad;B)V")
    public static final void method875(class38 arg0) {
        int var1 = arg0.field830 - field295;
        int var2 = arg0.field826 * 128 + arg0.field821 * 64;
        int var3 = arg0.field860 * 128 + arg0.field821 * 64;
        arg0.field861 += (var2 - arg0.field861) / var1;
        arg0.field818 += (var3 - arg0.field818) / var1;
        arg0.field874 = 0;
        arg0.field867 = arg0.field836;
    }

    @ObfuscatedName("do.af(Lad;I)V")
    public static final void method2628(class38 arg0) {
        arg0.field849 = arg0.field822;
        if (arg0.field870 == 0) {
            arg0.field874 = 0;
            return;
        }
        if (arg0.field848 != -1 && arg0.field855 == 0) {
            class43 var1 = class43.method2257(arg0.field848);
            if (arg0.field875 > 0 && var1.field1009 == 0) {
                arg0.field874++;
                return;
            }
            if (arg0.field875 <= 0 && var1.field1005 == 0) {
                arg0.field874++;
                return;
            }
        }
        int var2 = arg0.field861;
        int var3 = arg0.field818;
        int var4 = arg0.field871[arg0.field870 - 1] * 128 + arg0.field821 * 64;
        int var5 = arg0.field872[arg0.field870 - 1] * 128 + arg0.field821 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field867 = 1280;
            } else if (var3 > var5) {
                arg0.field867 = 1792;
            } else {
                arg0.field867 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field867 = 768;
            } else if (var3 > var5) {
                arg0.field867 = 256;
            } else {
                arg0.field867 = 512;
            }
        } else if (var3 < var5) {
            arg0.field867 = 1024;
        } else if (var3 > var5) {
            arg0.field867 = 0;
        }
        byte var6 = arg0.field873[arg0.field870 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field861 = var4;
            arg0.field818 = var5;
            arg0.field870--;
            if (arg0.field875 > 0) {
                arg0.field875--;
            }
            return;
        }
        int var7 = arg0.field867 - arg0.field819 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field831;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field825;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field862;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field827;
        }
        if (var8 == -1) {
            var8 = arg0.field825;
        }
        arg0.field849 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field785.field888;
        }
        if (var10) {
            if (arg0.field867 != arg0.field819 && arg0.field842 == -1 && arg0.field869 != 0) {
                var9 = 2;
            }
            if (arg0.field870 > 2) {
                var9 = 6;
            }
            if (arg0.field870 > 3) {
                var9 = 8;
            }
            if (arg0.field874 > 0 && arg0.field870 > 1) {
                var9 = 8;
                arg0.field874--;
            }
        } else {
            if (arg0.field870 > 1) {
                var9 = 6;
            }
            if (arg0.field870 > 2) {
                var9 = 8;
            }
            if (arg0.field874 > 0 && arg0.field870 > 1) {
                var9 = 8;
                arg0.field874--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field849 == arg0.field825 && arg0.field829 != -1) {
            arg0.field849 = arg0.field829;
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
                arg0.field818 += var9;
                if (arg0.field818 > var5) {
                    arg0.field818 = var5;
                }
            } else if (var3 > var5) {
                arg0.field818 -= var9;
                if (arg0.field818 < var5) {
                    arg0.field818 = var5;
                }
            }
        }
        if (arg0.field861 == var4 && arg0.field818 == var5) {
            arg0.field870--;
            if (arg0.field875 > 0) {
                arg0.field875--;
            }
        }
    }

    @ObfuscatedName("ac.ab(Lad;I)V")
    public static final void method874(class38 arg0) {
        arg0.field820 = false;
        if (arg0.field849 != -1) {
            class43 var1 = class43.method2257(arg0.field849);
            if (var1 == null || var1.field988 == null) {
                arg0.field849 = -1;
            } else {
                arg0.field864++;
                if (arg0.field846 < var1.field988.length && arg0.field864 > var1.field995[arg0.field846]) {
                    arg0.field864 = 1;
                    arg0.field846++;
                    method704(var1, arg0.field846, arg0.field861, arg0.field818);
                }
                if (arg0.field846 >= var1.field988.length) {
                    arg0.field864 = 0;
                    arg0.field846 = 0;
                    method704(var1, arg0.field846, arg0.field861, arg0.field818);
                }
            }
        }
        if (arg0.field853 != -1 && field295 >= arg0.field851) {
            if (arg0.field876 < 0) {
                arg0.field876 = 0;
            }
            int var2 = class44.method2239(arg0.field853).field1017;
            if (var2 == -1) {
                arg0.field853 = -1;
            } else {
                class43 var3 = class43.method2257(var2);
                if (var3 == null || var3.field988 == null) {
                    arg0.field853 = -1;
                } else {
                    arg0.field858++;
                    if (arg0.field876 < var3.field988.length && arg0.field858 > var3.field995[arg0.field876]) {
                        arg0.field858 = 1;
                        arg0.field876++;
                        method704(var3, arg0.field876, arg0.field861, arg0.field818);
                    }
                    if (arg0.field876 >= var3.field988.length && (arg0.field876 < 0 || arg0.field876 >= var3.field988.length)) {
                        arg0.field853 = -1;
                    }
                }
            }
        }
        if (arg0.field848 != -1 && arg0.field855 <= 1) {
            class43 var4 = class43.method2257(arg0.field848);
            if (var4.field1009 == 1 && arg0.field875 > 0 && arg0.field830 <= field295 && arg0.field847 < field295) {
                arg0.field855 = 1;
                return;
            }
        }
        if (arg0.field848 != -1 && arg0.field855 == 0) {
            class43 var5 = class43.method2257(arg0.field848);
            if (var5 == null || var5.field988 == null) {
                arg0.field848 = -1;
            } else {
                arg0.field850++;
                if (arg0.field856 < var5.field988.length && arg0.field850 > var5.field995[arg0.field856]) {
                    arg0.field850 = 1;
                    arg0.field856++;
                    method704(var5, arg0.field856, arg0.field861, arg0.field818);
                }
                if (arg0.field856 >= var5.field988.length) {
                    arg0.field856 -= var5.field990;
                    arg0.field852++;
                    if (arg0.field852 >= var5.field1003) {
                        arg0.field848 = -1;
                    } else if (arg0.field856 >= 0 && arg0.field856 < var5.field988.length) {
                        method704(var5, arg0.field856, arg0.field861, arg0.field818);
                    } else {
                        arg0.field848 = -1;
                    }
                }
                arg0.field820 = var5.field1010;
            }
        }
        if (arg0.field855 > 0) {
            arg0.field855--;
        }
    }

    @ObfuscatedName("de.ax(Li;III)V")
    public static void method2196(class3 arg0, int arg1, int arg2) {
        if (arg0.field848 == arg1 && arg1 != -1) {
            int var3 = class43.method2257(arg1).field1006;
            if (var3 == 1) {
                arg0.field856 = 0;
                arg0.field850 = 0;
                arg0.field855 = arg2;
                arg0.field852 = 0;
            }
            if (var3 == 2) {
                arg0.field852 = 0;
            }
        } else if (arg1 == -1 || arg0.field848 == -1 || class43.method2257(arg1).field997 >= class43.method2257(arg0.field848).field997) {
            arg0.field848 = arg1;
            arg0.field856 = 0;
            arg0.field850 = 0;
            arg0.field855 = arg2;
            arg0.field852 = 0;
            arg0.field875 = arg0.field870;
        }
    }

    @ObfuscatedName("bm.as(I)V")
    public static void method1045() {
        client var0 = Statics.field3128;
        synchronized (Statics.field3128) {
            Container var1 = Statics.field3128.method2834();
            if (var1 != null) {
                Statics.field1615 = Math.max(var1.getSize().width, Statics.field1404);
                Statics.field587 = Math.max(var1.getSize().height, Statics.field591);
                if (Statics.field1996 == var1) {
                    Insets var2 = Statics.field1996.getInsets();
                    Statics.field1615 -= var2.right + var2.left;
                    Statics.field587 -= var2.top + var2.bottom;
                }
                if (Statics.field1615 <= 0) {
                    Statics.field1615 = 1;
                }
                if (Statics.field587 <= 0) {
                    Statics.field587 = 1;
                }
                int var3 = field403 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field999 = field500;
                    Statics.field1605 = field421;
                } else {
                    Statics.field999 = Math.min(Statics.field1615, 7680);
                    Statics.field1605 = Math.min(Statics.field587, 2160);
                }
                field2200 = (Statics.field1615 - Statics.field999) / 2;
                field2201 = 0;
                Statics.field2029.setSize(Statics.field999, Statics.field1605);
                Statics.field687 = class78.method2642(Statics.field999, Statics.field1605, Statics.field2029);
                if (Statics.field1996 == var1) {
                    Insets var4 = Statics.field1996.getInsets();
                    Statics.field2029.setLocation(field2200 + var4.left, field2201 + var4.top);
                } else {
                    Statics.field2029.setLocation(field2200, field2201);
                }
                method910();
                if (field422 != -1) {
                    int var5 = field422;
                    int var6 = Statics.field999;
                    int var7 = Statics.field1605;
                    if (class173.method2942(var5)) {
                        method1937(Statics.field2793[var5], -1, var6, var7, true);
                    }
                }
                Statics.method533();
            }
        }
    }

    @ObfuscatedName("al.av(I)V")
    public static void method910() {
        int var0 = Statics.field999;
        int var1 = Statics.field1605;
        if (Statics.field1615 < var0) {
            int var2 = Statics.field1615;
        }
        if (Statics.field587 < var1) {
            int var3 = Statics.field587;
        }
        if (Statics.field1028 == null) {
            return;
        }
        try {
            client var4 = Statics.field3128;
            int var5 = field403 ? 2 : 1;
            Object[] var6 = new Object[] { var5 };
            JSObject.getWindow(var4).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("bg.aa(B)V")
    public static final void method1464() {
        if (field422 != -1) {
            int var0 = field422;
            if (class173.method2942(var0)) {
                method3186(Statics.field2793[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field488; var1++) {
            if (field554[var1]) {
                field491[var1] = true;
            }
            field441[var1] = field554[var1];
            field554[var1] = false;
        }
        field489 = field295;
        field308 = -1;
        field551 = -1;
        Statics.field1891 = null;
        if (field422 != -1) {
            field488 = 0;
            method3236(field422, 0, 0, Statics.field999, Statics.field1605, 0, 0, -1);
        }
        class80.method1656();
        if (field334) {
            int var2 = Statics.field2050;
            int var3 = Statics.field152;
            int var4 = Statics.field780;
            int var5 = Statics.field127;
            int var6 = 6116423;
            class80.method1663(var2, var3, var4, var5, var6);
            class80.method1663(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class80.method1689(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field232.method3734(class157.field2449, var2 + 3, var3 + 14, var6, -1);
            int var7 = class140.field2163;
            int var8 = class140.field2155;
            for (int var9 = 0; var9 < field427; var9++) {
                int var10 = (field427 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                class224 var12 = Statics.field232;
                String var13;
                if (field433[var9].length() > 0) {
                    var13 = field432[var9] + class157.field2329 + field433[var9];
                } else {
                    var13 = field432[var9];
                }
                var12.method3734(var13, var2 + 3, var10, var11, 0);
            }
            method79(Statics.field2050, Statics.field152, Statics.field780, Statics.field127);
        } else if (field308 != -1) {
            method2246(field308, field551);
        }
        if (field465 == 3) {
            for (int var14 = 0; var14 < field488; var14++) {
                if (field441[var14]) {
                    class80.method1662(field493[var14], field494[var14], field495[var14], field467[var14], 16711935, 128);
                } else if (field491[var14]) {
                    class80.method1662(field493[var14], field494[var14], field495[var14], field467[var14], 16711680, 128);
                }
            }
        }
        int var15 = Statics.field880;
        int var16 = Statics.field2683.field861;
        int var17 = Statics.field2683.field818;
        int var18 = field351;
        for (class24 var19 = (class24) class24.field607.method3546(); var19 != null; var19 = (class24) class24.field607.method3548()) {
            if (var19.field619 != -1 || var19.field615 != null) {
                int var20 = 0;
                if (var16 > var19.field608) {
                    var20 += var16 - var19.field608;
                } else if (var16 < var19.field603) {
                    var20 += var19.field603 - var16;
                }
                if (var17 > var19.field604) {
                    var20 += var17 - var19.field604;
                } else if (var17 < var19.field614) {
                    var20 += var19.field614 - var17;
                }
                if (var20 - 64 > var19.field605 || field526 == 0 || var19.field602 != var15) {
                    if (var19.field609 != null) {
                        Statics.field1633.method1114(var19.field609);
                        var19.field609 = null;
                    }
                    if (var19.field601 != null) {
                        Statics.field1633.method1114(var19.field601);
                        var19.field601 = null;
                    }
                } else {
                    var20 -= 64;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    int var21 = field526 * (var19.field605 - var20) / var19.field605;
                    class59 var10000;
                    if (var19.field609 != null) {
                        var19.field609.method1259(var21);
                    } else if (var19.field619 >= 0) {
                        var10000 = (class59) null;
                        class59 var22 = class59.method1204(Statics.field1042, var19.field619, 0);
                        if (var22 != null) {
                            class63 var23 = var22.method1196().method1232(Statics.field1535);
                            class65 var24 = class65.method1256(var23, 100, var21);
                            var24.method1294(-1);
                            Statics.field1633.method1122(var24);
                            var19.field609 = var24;
                        }
                    }
                    if (var19.field601 != null) {
                        var19.field601.method1259(var21);
                        if (!var19.field601.method3633()) {
                            var19.field601 = null;
                        }
                    } else if (var19.field615 != null && (var19.field613 -= var18) <= 0) {
                        int var25 = (int) (Math.random() * (double) var19.field615.length);
                        var10000 = (class59) null;
                        class59 var26 = class59.method1204(Statics.field1042, var19.field615[var25], 0);
                        if (var26 != null) {
                            class63 var27 = var26.method1196().method1232(Statics.field1535);
                            class65 var28 = class65.method1256(var27, 100, var21);
                            var28.method1294(0);
                            Statics.field1633.method1122(var28);
                            var19.field601 = var28;
                            var19.field613 = var19.field610 + (int) (Math.random() * (double) (var19.field611 - var19.field610));
                        }
                    }
                }
            }
        }
        field351 = 0;
    }

    @ObfuscatedName("x.aq(Ljava/lang/String;ZS)V")
    public static final void method178(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2071.method3731(arg0, 250);
        int var6 = Statics.field2071.method3732(arg0, 250) * 13;
        class80.method1663(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1689(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2071.method3737(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2995(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method79(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2029.getGraphics();
            Statics.field687.method1518(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2029.repaint();
        }
    }

    @ObfuscatedName("aa.ad(IIIIB)V")
    public static final void method702(int arg0, int arg1, int arg2, int arg3) {
        field391++;
        Statics.method1931(class34.field781);
        boolean var4 = false;
        if (field509 >= 0) {
            int var5 = class33.field761;
            int[] var6 = class33.field765;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field509 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            Statics.method1931(class34.field775);
        }
        method721(true);
        Statics.method1931(var4 ? class34.field777 : class34.field782);
        method721(false);
        method153();
        for (class30 var8 = (class30) field448.method3546(); var8 != null; var8 = (class30) field448.method3548()) {
            if (Statics.field880 != var8.field692 || var8.field699) {
                var8.method3625();
            } else if (field295 >= var8.field698) {
                var8.method619(field351);
                if (var8.field699) {
                    var8.method3625();
                } else {
                    Statics.field184.method1766(var8.field692, var8.field693, var8.field694, var8.field695, 60, var8, 0, -1, false);
                }
            }
        }
        method6(arg0, arg1, arg2, arg3, true);
        int var9 = field547;
        int var10 = field548;
        int var11 = field549;
        int var12 = field550;
        class80.method1679(var9, var10, var9 + var11, var10 + var12);
        class91.method1940();
        if (!field533) {
            int var13 = field370;
            if (field475 / 256 > var13) {
                var13 = field475 / 256;
            }
            if (field534[4] && field417[4] + 128 > var13) {
                var13 = field417[4] + 128;
            }
            int var14 = field572 + field371 & 0x7FF;
            int var15 = Statics.field1592;
            int var16 = method4(Statics.field2683.field861, Statics.field2683.field818, Statics.field880) - field376;
            int var17 = Statics.field1063;
            int var18 = var13 * 3 + 600;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 2048 - var14 & 0x7FF;
            int var21 = 0;
            int var22 = 0;
            int var23 = var18;
            if (var19 != 0) {
                int var24 = class91.field1561[var19];
                int var25 = class91.field1585[var19];
                int var26 = var22 * var25 - var18 * var24 >> 16;
                var23 = var22 * var24 + var18 * var25 >> 16;
                var22 = var26;
            }
            if (var20 != 0) {
                int var27 = class91.field1561[var20];
                int var28 = class91.field1585[var20];
                int var29 = var21 * var28 + var23 * var27 >> 16;
                var23 = var23 * var28 - var21 * var27 >> 16;
                var21 = var29;
            }
            Statics.field1619 = var15 - var21;
            Statics.field630 = var16 - var22;
            Statics.field701 = var17 - var23;
            Statics.field651 = var13;
            Statics.field1007 = var14;
        }
        int var30;
        if (field533) {
            int var31;
            if (Statics.field1028.field141) {
                var31 = Statics.field880;
            } else {
                int var32 = method4(Statics.field1619, Statics.field701, Statics.field880);
                if (var32 - Statics.field630 >= 800 || (class6.field79[Statics.field880][Statics.field1619 >> 7][Statics.field701 >> 7] & 0x4) == 0) {
                    var31 = 3;
                } else {
                    var31 = Statics.field880;
                }
            }
            var30 = var31;
        } else {
            var30 = method95();
        }
        int var33 = Statics.field1619;
        int var34 = Statics.field630;
        int var35 = Statics.field701;
        int var36 = Statics.field651;
        int var37 = Statics.field1007;
        for (int var38 = 0; var38 < 5; var38++) {
            if (field534[var38]) {
                int var39 = (int) (Math.random() * (double) (field535[var38] * 2 + 1) - (double) field535[var38] + Math.sin((double) field293[var38] / 100.0D * (double) field390[var38]) * (double) field417[var38]);
                if (var38 == 0) {
                    Statics.field1619 += var39;
                }
                if (var38 == 1) {
                    Statics.field630 += var39;
                }
                if (var38 == 2) {
                    Statics.field701 += var39;
                }
                if (var38 == 3) {
                    Statics.field1007 = Statics.field1007 + var39 & 0x7FF;
                }
                if (var38 == 4) {
                    Statics.field651 += var39;
                    if (Statics.field651 < 128) {
                        Statics.field651 = 128;
                    }
                    if (Statics.field651 > 383) {
                        Statics.field651 = 383;
                    }
                }
            }
        }
        int var40 = class140.field2163;
        int var41 = class140.field2155;
        if (class140.field2160 != 0) {
            var40 = class140.field2161;
            var41 = class140.field2151;
        }
        if (var40 >= var9 && var40 < var9 + var11 && var41 >= var10 && var41 < var10 + var12) {
            class105.field1847 = true;
            class105.field1850 = 0;
            class105.field1813 = var40 - var9;
            class105.field1856 = var41 - var10;
        } else {
            class105.field1847 = false;
            class105.field1850 = 0;
        }
        method800();
        class80.method1663(var9, var10, var11, var12, 0);
        method800();
        int var42 = class91.field1570;
        class91.field1570 = field384;
        Statics.field184.method1826(Statics.field1619, Statics.field630, Statics.field701, Statics.field651, Statics.field1007, var30);
        class91.field1570 = var42;
        method800();
        Statics.field184.method1769();
        method88(var9, var10, var11, var12);
        if (field303 == 2) {
            method151((field333 - Statics.field77 << 7) + field408, (field307 - Statics.field271 << 7) + field310, field393 * 2);
            if (field539 > -1 && field295 % 20 < 10) {
                Statics.field582[0].method1589(field539 + var9 - 12, field286 + var10 - 28);
            }
        }
        ((class95) Statics.field1576).method2014(field351);
        method2789(var9, var10, var11, var12);
        Statics.field1619 = var33;
        Statics.field630 = var34;
        Statics.field701 = var35;
        Statics.field651 = var36;
        Statics.field1007 = var37;
        if (field294 && class171.method2012(true, false) == 0) {
            field294 = false;
        }
        if (field294) {
            class80.method1663(var9, var10, var11, var12, 0);
            method178(class157.field2549, false);
        }
    }

    @ObfuscatedName("m.ar(IIIIZI)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field459 - field487) * var5 / 100 + field487;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field545) {
            short var8 = field545;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field544) {
                var6 = field544;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1656();
                    class80.method1663(arg0, arg1, var10, arg3, -16777216);
                    class80.method1663(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field546) {
            short var11 = field546;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field543) {
                var6 = field543;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1656();
                    class80.method1663(arg0, arg1, arg2, var13, -16777216);
                    class80.method1663(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field542 - field430) * var5 / 100 + field430;
        field384 = arg3 * var6 * var14 / 85504 << 1;
        if (field549 != arg2 || field550 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1561[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1889(var15, 500, 800, arg2, arg3);
        }
        field547 = arg0;
        field548 = arg1;
        field549 = arg2;
        field550 = arg3;
    }

    @ObfuscatedName("ad.ae(ZI)V")
    public static final void method721(boolean arg0) {
        for (int var1 = 0; var1 < field316; var1++) {
            class35 var2 = field326[field325[var1]];
            int var3 = (field325[var1] << 14) + 536870912;
            if (var2 != null && var2.method14() && var2.field785.field913 == arg0 && var2.field785.method727()) {
                int var4 = var2.field861 >> 7;
                int var5 = var2.field818 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field821 == 1 && (var2.field861 & 0x7F) == 64 && (var2.field818 & 0x7F) == 64) {
                        if (field391 == field445[var4][var5]) {
                            continue;
                        }
                        field445[var4][var5] = field391;
                    }
                    if (!var2.field785.field889) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field184.method1766(Statics.field880, var2.field861, var2.field818, method4(var2.field861 + (var2.field821 * 64 - 64), var2.field818 + (var2.field821 * 64 - 64), Statics.field880), var2.field821 * 64 - 64 + 60, var2, var2.field819, var3, var2.field820);
                }
            }
        }
    }

    @ObfuscatedName("o.ak(I)V")
    public static final void method153() {
        for (class7 var0 = (class7) field302.method3546(); var0 != null; var0 = (class7) field302.method3548()) {
            if (Statics.field880 != var0.field99 || field295 > var0.field106) {
                var0.method3625();
            } else if (field295 >= var0.field104) {
                if (var0.field108 > 0) {
                    class35 var1 = field326[var0.field108 - 1];
                    if (var1 != null && var1.field861 >= 0 && var1.field861 < 13312 && var1.field818 >= 0 && var1.field818 < 13312) {
                        var0.method89(var1.field861, var1.field818, method4(var1.field861, var1.field818, var0.field99) - var0.field103, field295);
                    }
                }
                if (var0.field108 < 0) {
                    int var2 = -var0.field108 - 1;
                    class3 var3;
                    if (field288 == var2) {
                        var3 = Statics.field2683;
                    } else {
                        var3 = field407[var2];
                    }
                    if (var3 != null && var3.field861 >= 0 && var3.field861 < 13312 && var3.field818 >= 0 && var3.field818 < 13312) {
                        var0.method89(var3.field861, var3.field818, method4(var3.field861, var3.field818, var0.field99) - var0.field103, field295);
                    }
                }
                var0.method82(field351);
                Statics.field184.method1766(Statics.field880, (int) var0.field110, (int) var0.field115, (int) var0.field121, 60, var0, var0.field118, -1, false);
            }
        }
    }

    @ObfuscatedName("y.az(B)I")
    public static final int method95() {
        if (Statics.field1028.field141) {
            return Statics.field880;
        }
        int var0 = 3;
        if (Statics.field651 < 310) {
            int var1 = Statics.field1619 >> 7;
            int var2 = Statics.field701 >> 7;
            int var3 = Statics.field2683.field861 >> 7;
            int var4 = Statics.field2683.field818 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field880;
            }
            if ((class6.field79[Statics.field880][var1][var2] & 0x4) != 0) {
                var0 = Statics.field880;
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
                    if ((class6.field79[Statics.field880][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field880;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field79[Statics.field880][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field880;
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
                    if ((class6.field79[Statics.field880][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field880;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field79[Statics.field880][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field880;
                        }
                    }
                }
            }
        }
        if (Statics.field2683.field861 >= 0 && Statics.field2683.field818 >= 0 && Statics.field2683.field861 < 13312 && Statics.field2683.field818 < 13312) {
            if ((class6.field79[Statics.field880][Statics.field2683.field861 >> 7][Statics.field2683.field818 >> 7] & 0x4) != 0) {
                var0 = Statics.field880;
            }
            return var0;
        } else {
            return Statics.field880;
        }
    }

    @ObfuscatedName("ey.ac(Lad;IIIIIS)V")
    public static final void method2921(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method14()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field785;
            if (var6.field898 != null) {
                var6 = var6.method731();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field761;
        int[] var8 = class33.field765;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field51) {
                return;
            }
            if (var10.field34 != -1 || var10.field35 != -1) {
                method1482(arg0, arg0.field866 + 15);
                if (field539 > -1) {
                    if (var10.field34 != -1) {
                        Statics.field1079[var10.field34].method1589(field539 + arg2 - 12, field286 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field35 != -1) {
                        Statics.field2142[var10.field35].method1589(field539 + arg2 - 12, field286 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field303 == 10 && field305 == var8[arg1]) {
                method1482(arg0, arg0.field866 + 15);
                if (field539 > -1) {
                    Statics.field582[1].method1589(field539 + arg2 - 12, field286 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field785;
            if (var11.field898 != null) {
                var11 = var11.method731();
            }
            if (var11.field916 >= 0 && var11.field916 < Statics.field2142.length) {
                method1482(arg0, arg0.field866 + 15);
                if (field539 > -1) {
                    Statics.field2142[var11.field916].method1589(field539 + arg2 - 12, field286 + arg3 - 30);
                }
            }
            if (field303 == 1 && field304 == field325[arg1 - var7] && field295 % 20 < 10) {
                method1482(arg0, arg0.field866 + 15);
                if (field539 > -1) {
                    Statics.field582[0].method1589(field539 + arg2 - 12, field286 + arg3 - 28);
                }
            }
        }
        if (arg0.field845 != null && (arg1 >= var7 || !arg0.field854 && (field503 == 4 || !arg0.field838 && (field503 == 0 || field503 == 3 || field503 == 1 && method838(((class3) arg0).field56, false))))) {
            method1482(arg0, arg0.field866);
            if (field539 > -1 && field380 < field455) {
                field385[field380] = Statics.field232.method3729(arg0.field845) / 2;
                field434[field380] = Statics.field232.field3164;
                field382[field380] = field539;
                field383[field380] = field286;
                field386[field380] = arg0.field834;
                field387[field380] = arg0.field835;
                field388[field380] = arg0.field833;
                field389[field380] = arg0.field845;
                field380++;
            }
        }
        if (arg0.field839 > field295) {
            method1482(arg0, arg0.field866 + 15);
            if (field539 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field785;
                    var12 = var13.field924;
                }
                int var14 = arg0.field840 * var12 / arg0.field841;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field840 > 0) {
                    var14 = 1;
                }
                class80.method1663(field539 + arg2 - var12 / 2, field286 + arg3 - 3, var14, 5, 65280);
                class80.method1663(field539 + arg2 - var12 / 2 + var14, field286 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field828[var15] > field295) {
                method1482(arg0, arg0.field866 / 2);
                if (field539 > -1) {
                    if (var15 == 1) {
                        field286 -= 20;
                    }
                    if (var15 == 2) {
                        field539 -= 15;
                        field286 -= 10;
                    }
                    if (var15 == 3) {
                        field539 += 15;
                        field286 -= 10;
                    }
                    Statics.field173[arg0.field837[var15]].method1589(field539 + arg2 - 12, field286 + arg3 - 12);
                    Statics.field2889.method3788(Integer.toString(arg0.field817[var15]), field539 + arg2 - 1, field286 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("f.ay(IIIIB)V")
    public static final void method88(int arg0, int arg1, int arg2, int arg3) {
        field380 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field761;
        int[] var7 = class33.field765;
        for (int var8 = 0; var8 < field316 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field407[var7[var8]];
                if (field509 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field326[field325[var8 - var6]];
            }
            method2921(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2921(field407[field509], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field380; var10++) {
            int var11 = field382[var10];
            int var12 = field383[var10];
            int var13 = field385[var10];
            int var14 = field434[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field383[var16] - field434[var16] && var12 - var14 < field383[var16] + 2 && var11 - var13 < field385[var16] + field382[var16] && var11 + var13 > field382[var16] - field385[var16] && field383[var16] - field434[var16] < var12) {
                        var12 = field383[var16] - field434[var16];
                        var15 = true;
                    }
                }
            }
            field539 = field382[var10];
            field286 = field383[var10] = var12;
            String var17 = field389[var10];
            if (field285 == 0) {
                int var18 = 16776960;
                if (field386[var10] < 6) {
                    var18 = field502[field386[var10]];
                }
                if (field386[var10] == 6) {
                    var18 = field391 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field386[var10] == 7) {
                    var18 = field391 % 20 < 10 ? 255 : 65535;
                }
                if (field386[var10] == 8) {
                    var18 = field391 % 20 < 10 ? 45056 : 8454016;
                }
                if (field386[var10] == 9) {
                    int var19 = 150 - field388[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field386[var10] == 10) {
                    int var20 = 150 - field388[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field386[var10] == 11) {
                    int var21 = 150 - field388[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field387[var10] == 0) {
                    Statics.field232.method3788(var17, field539 + arg0, field286 + arg1, var18, 0);
                }
                if (field387[var10] == 1) {
                    Statics.field232.method3743(var17, field539 + arg0, field286 + arg1, var18, 0, field391);
                }
                if (field387[var10] == 2) {
                    Statics.field232.method3739(var17, field539 + arg0, field286 + arg1, var18, 0, field391);
                }
                if (field387[var10] == 3) {
                    Statics.field232.method3740(var17, field539 + arg0, field286 + arg1, var18, 0, field391, 150 - field388[var10]);
                }
                if (field387[var10] == 4) {
                    int var22 = (150 - field388[var10]) * (Statics.field232.method3729(var17) + 100) / 150;
                    class80.method1658(field539 + arg0 - 50, arg1, field539 + arg0 + 50, arg1 + arg3);
                    Statics.field232.method3734(var17, field539 + arg0 + 50 - var22, field286 + arg1, var18, 0);
                    class80.method1679(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field387[var10] == 5) {
                    int var23 = 150 - field388[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1658(arg0, field286 + arg1 - Statics.field232.field3164 - 1, arg0 + arg2, field286 + arg1 + 5);
                    Statics.field232.method3788(var17, field539 + arg0, field286 + arg1 + var24, var18, 0);
                    class80.method1679(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field232.method3788(var17, field539 + arg0, field286 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("eg.al(IIIIB)V")
    public static final void method2789(int arg0, int arg1, int arg2, int arg3) {
        if (field447 == 1) {
            Statics.field2209[field485 / 100].method1589(field394 - 8, field395 - 8);
        }
        if (field447 == 2) {
            Statics.field2209[field485 / 100 + 4].method1589(field394 - 8, field395 - 8);
        }
        field406 = 0;
        int var4 = (Statics.field2683.field861 >> 7) + Statics.field77;
        int var5 = (Statics.field2683.field818 >> 7) + Statics.field271;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field406 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field406 = 1;
        }
        if (field406 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field406 = 0;
        }
    }

    @ObfuscatedName("bk.at(Lad;IB)V")
    public static final void method1482(class38 arg0, int arg1) {
        method151(arg0.field861, arg0.field818, arg1);
    }

    @ObfuscatedName("o.aj(IIIB)V")
    public static final void method151(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field539 = -1;
            field286 = -1;
            return;
        }
        int var3 = method4(arg0, arg1, Statics.field880) - arg2;
        int var4 = arg0 - Statics.field1619;
        int var5 = var3 - Statics.field630;
        int var6 = arg1 - Statics.field701;
        int var7 = class91.field1561[Statics.field651];
        int var8 = class91.field1585[Statics.field651];
        int var9 = class91.field1561[Statics.field1007];
        int var10 = class91.field1585[Statics.field1007];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field539 = field384 * var11 / var15 + field549 / 2;
            field286 = field384 * var14 / var15 + field550 / 2;
        } else {
            field539 = -1;
            field286 = -1;
        }
    }

    @ObfuscatedName("h.aw(IIII)I")
    public static final int method4(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field79[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field80[var5][var3][var4] + class6.field80[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field80[var5][var3][var4 + 1] + class6.field80[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ee.au(ZI)V")
    public static final void method2658(boolean arg0) {
        field354 = arg0;
        if (!field354) {
            int var1 = field331.method2409();
            int var2 = field331.method2382();
            int var3 = field331.method2322();
            Statics.field148 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field148[var4][var5] = field331.method2324();
                }
            }
            Statics.field1104 = new int[var3];
            Statics.field590 = new int[var3];
            Statics.field952 = new int[var3];
            Statics.field279 = new byte[var3][];
            Statics.field2092 = new byte[var3][];
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
                        Statics.field1104[var7] = var10;
                        Statics.field590[var7] = Statics.field321.method3022("m" + var8 + "_" + var9);
                        Statics.field952[var7] = Statics.field321.method3022("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method558(var2, var1);
            return;
        }
        int var11 = field331.method2322();
        int var12 = field331.method2382();
        int var13 = field331.method2322();
        field331.method2574();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field331.method2594(1);
                    if (var17 == 1) {
                        field556[var14][var15][var16] = field331.method2594(26);
                    } else {
                        field556[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field331.method2569();
        Statics.field148 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field148[var18][var19] = field331.method2324();
            }
        }
        Statics.field1104 = new int[var13];
        Statics.field590 = new int[var13];
        Statics.field952 = new int[var13];
        Statics.field279 = new byte[var13][];
        Statics.field2092 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field556[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1104[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1104[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field590[var20] = Statics.field321.method3022("m" + var29 + "_" + var30);
                            Statics.field952[var20] = Statics.field321.method3022("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method558(var12, var11);
    }

    @ObfuscatedName("j.ah(III)V")
    public static final void method558(int arg0, int arg1) {
        if (Statics.field1756 == arg0 && Statics.field249 == arg1) {
            return;
        }
        Statics.field1756 = arg0;
        Statics.field249 = arg1;
        method158(25);
        method178(class157.field2549, true);
        int var2 = Statics.field77;
        int var3 = Statics.field271;
        Statics.field77 = (arg0 - 6) * 8;
        Statics.field271 = (arg1 - 6) * 8;
        int var4 = Statics.field77 - var2;
        int var5 = Statics.field271 - var3;
        int var6 = Statics.field77;
        int var7 = Statics.field271;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field326[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field871[var10] -= var4;
                    var9.field872[var10] -= var5;
                }
                var9.field861 -= var4 * 128;
                var9.field818 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field407[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field871[var13] -= var4;
                    var12.field872[var13] -= var5;
                }
                var12.field861 -= var4 * 128;
                var12.field818 -= var5 * 128;
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
                        field418[var24][var20][var21] = field418[var24][var22][var23];
                    } else {
                        field418[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field499.method3546(); var25 != null; var25 = (class17) field499.method3548()) {
            var25.field227 -= var4;
            var25.field228 -= var5;
            if (var25.field227 < 0 || var25.field228 < 0 || var25.field227 >= 104 || var25.field228 >= 104) {
                var25.method3625();
            }
        }
        if (field519 != 0) {
            field519 -= var4;
            field520 -= var5;
        }
        field527 = 0;
        field533 = false;
        field514 = -1;
        field448.method3540();
        field302.method3540();
    }

    @ObfuscatedName("q.an(ZB)V")
    public static final void method35(boolean arg0) {
        method800();
        field335++;
        if (field335 < 50 && !arg0) {
            return;
        }
        field335 = 0;
        if (field529 || Statics.field328 == null) {
            return;
        }
        field329.method2565(7);
        try {
            Statics.field328.method2799(field329.field1989, 0, field329.field1988);
            field329.field1988 = 0;
        } catch (IOException var2) {
            field529 = true;
        }
    }

    @ObfuscatedName("v.bm(B)V")
    public static final void method122() {
        method35(false);
        field341 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field279.length; var1++) {
            if (Statics.field590[var1] != -1 && Statics.field279[var1] == null) {
                Statics.field279[var1] = Statics.field321.method3051(Statics.field590[var1], 0);
                if (Statics.field279[var1] == null) {
                    var0 = false;
                    field341++;
                }
            }
            if (Statics.field952[var1] != -1 && Statics.field2092[var1] == null) {
                Statics.field2092[var1] = Statics.field321.method3008(Statics.field952[var1], 0, Statics.field148[var1]);
                if (Statics.field2092[var1] == null) {
                    var0 = false;
                    field341++;
                }
            }
        }
        if (!var0) {
            field345 = 1;
            return;
        }
        field343 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field279.length; var3++) {
            byte[] var4 = Statics.field2092[var3];
            if (var4 != null) {
                int var5 = (Statics.field1104[var3] >> 8) * 64 - Statics.field77;
                int var6 = (Statics.field1104[var3] & 0xFF) * 64 - Statics.field271;
                if (field354) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method3455(var4, var5, var6);
            }
        }
        if (!var2) {
            field345 = 2;
            return;
        }
        if (field345 != 0) {
            method178(class157.field2549 + class2.field22 + class2.field19 + 100 + "%" + class2.field20, true);
        }
        method800();
        method623();
        method800();
        Statics.field184.method1755();
        method800();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field346[var7].method2232();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field79[var8][var9][var10] = 0;
                }
            }
        }
        method800();
        class6.field94 = 99;
        Statics.field81 = new byte[4][104][104];
        Statics.field82 = new byte[4][104][104];
        Statics.field2089 = new byte[4][104][104];
        Statics.field85 = new byte[4][104][104];
        Statics.field2174 = new int[4][105][105];
        Statics.field84 = new byte[4][105][105];
        Statics.field1363 = new int[105][105];
        Statics.field190 = new int[104];
        Statics.field2049 = new int[104];
        Statics.field92 = new int[104];
        Statics.field86 = new int[104];
        Statics.field1966 = new int[104];
        int var11 = Statics.field279.length;
        class24.method37();
        method35(true);
        if (!field354) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field1104[var12] >> 8) * 64 - Statics.field77;
                int var14 = (Statics.field1104[var12] & 0xFF) * 64 - Statics.field271;
                byte[] var15 = Statics.field279[var12];
                if (var15 != null) {
                    method800();
                    int var16 = Statics.field1756 * 8 - 48;
                    int var17 = Statics.field249 * 8 - 48;
                    class108[] var18 = field346;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field1885[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class119 var22 = new class119(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class6.method3208(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field1104[var26] >> 8) * 64 - Statics.field77;
                int var28 = (Statics.field1104[var26] & 0xFF) * 64 - Statics.field271;
                byte[] var29 = Statics.field279[var26];
                if (var29 == null && Statics.field249 < 800) {
                    method800();
                    class6.method180(var27, var28, 64, 64);
                }
            }
            method35(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field2092[var30];
                if (var31 != null) {
                    int var32 = (Statics.field1104[var30] >> 8) * 64 - Statics.field77;
                    int var33 = (Statics.field1104[var30] & 0xFF) * 64 - Statics.field271;
                    method800();
                    class6.method32(var31, var32, var33, Statics.field184, field346);
                }
            }
        }
        if (field354) {
            for (int var34 = 0; var34 < 4; var34++) {
                method800();
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        boolean var37 = false;
                        int var38 = field556[var34][var35][var36];
                        if (var38 != -1) {
                            int var39 = var38 >> 24 & 0x3;
                            int var40 = var38 >> 1 & 0x3;
                            int var41 = var38 >> 14 & 0x3FF;
                            int var42 = var38 >> 3 & 0x7FF;
                            int var43 = (var41 / 8 << 8) + var42 / 8;
                            for (int var44 = 0; var44 < Statics.field1104.length; var44++) {
                                if (Statics.field1104[var44] == var43 && Statics.field279[var44] != null) {
                                    byte[] var45 = Statics.field279[var44];
                                    int var46 = var35 * 8;
                                    int var47 = var36 * 8;
                                    int var48 = (var41 & 0x7) * 8;
                                    int var49 = (var42 & 0x7) * 8;
                                    class108[] var50 = field346;
                                    for (int var51 = 0; var51 < 8; var51++) {
                                        for (int var52 = 0; var52 < 8; var52++) {
                                            if (var46 + var51 > 0 && var46 + var51 < 103 && var47 + var52 > 0 && var47 + var52 < 103) {
                                                var50[var34].field1885[var46 + var51][var47 + var52] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class119 var53 = new class119(var45);
                                    for (int var54 = 0; var54 < 4; var54++) {
                                        for (int var55 = 0; var55 < 64; var55++) {
                                            for (int var56 = 0; var56 < 64; var56++) {
                                                if (var39 == var54 && var55 >= var48 && var55 < var48 + 8 && var56 >= var49 && var56 < var49 + 8) {
                                                    int var60 = var55 & 0x7;
                                                    int var61 = var56 & 0x7;
                                                    int var63 = var40 & 0x3;
                                                    int var64;
                                                    if (var63 == 0) {
                                                        var64 = var60;
                                                    } else if (var63 == 1) {
                                                        var64 = var61;
                                                    } else if (var63 == 2) {
                                                        var64 = 7 - var60;
                                                    } else {
                                                        var64 = 7 - var61;
                                                    }
                                                    class6.method3208(var53, var34, var46 + var64, var47 + class177.method575(var55 & 0x7, var56 & 0x7, var40), 0, 0, var40);
                                                } else {
                                                    class6.method3208(var53, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class6.method1750(var34, var35 * 8, var36 * 8);
                        }
                    }
                }
            }
            for (int var65 = 0; var65 < 13; var65++) {
                for (int var66 = 0; var66 < 13; var66++) {
                    int var67 = field556[0][var65][var66];
                    if (var67 == -1) {
                        class6.method180(var65 * 8, var66 * 8, 8, 8);
                    }
                }
            }
            method35(true);
            for (int var68 = 0; var68 < 4; var68++) {
                method800();
                for (int var69 = 0; var69 < 13; var69++) {
                    label344: for (int var70 = 0; var70 < 13; var70++) {
                        int var71 = field556[var68][var69][var70];
                        if (var71 != -1) {
                            int var72 = var71 >> 24 & 0x3;
                            int var73 = var71 >> 1 & 0x3;
                            int var74 = var71 >> 14 & 0x3FF;
                            int var75 = var71 >> 3 & 0x7FF;
                            int var76 = (var74 / 8 << 8) + var75 / 8;
                            for (int var77 = 0; var77 < Statics.field1104.length; var77++) {
                                if (Statics.field1104[var77] == var76 && Statics.field2092[var77] != null) {
                                    byte[] var78 = Statics.field2092[var77];
                                    int var79 = var69 * 8;
                                    int var80 = var70 * 8;
                                    int var81 = (var74 & 0x7) * 8;
                                    int var82 = (var75 & 0x7) * 8;
                                    class86 var83 = Statics.field184;
                                    class108[] var84 = field346;
                                    class119 var85 = new class119(var78);
                                    int var86 = -1;
                                    while (true) {
                                        int var87 = var85.method2332();
                                        if (var87 == 0) {
                                            continue label344;
                                        }
                                        var86 += var87;
                                        int var88 = 0;
                                        while (true) {
                                            int var89 = var85.method2332();
                                            if (var89 == 0) {
                                                break;
                                            }
                                            var88 += var89 - 1;
                                            int var90 = var88 & 0x3F;
                                            int var91 = var88 >> 6 & 0x3F;
                                            int var92 = var88 >> 12;
                                            int var93 = var85.method2320();
                                            int var94 = var93 >> 2;
                                            int var95 = var93 & 0x3;
                                            if (var72 == var92 && var91 >= var81 && var91 < var81 + 8 && var90 >= var82 && var90 < var82 + 8) {
                                                class41 var96 = class41.method961(var86);
                                                int var97 = var79 + class177.method2683(var91 & 0x7, var90 & 0x7, var73, var96.field962, var96.field945, var95);
                                                int var98 = var80 + class177.method92(var91 & 0x7, var90 & 0x7, var73, var96.field962, var96.field945, var95);
                                                if (var97 > 0 && var98 > 0 && var97 < 103 && var98 < 103) {
                                                    int var99 = var68;
                                                    if ((class6.field79[1][var97][var98] & 0x2) == 2) {
                                                        var99 = var68 - 1;
                                                    }
                                                    class108 var100 = null;
                                                    if (var99 >= 0) {
                                                        var100 = var84[var99];
                                                    }
                                                    class6.method1559(var68, var97, var98, var86, var73 + var95 & 0x3, var94, var83, var100);
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
        method35(true);
        method623();
        method800();
        class6.method1938(Statics.field184, field346);
        method35(true);
        int var101 = class6.field94;
        if (var101 > Statics.field880) {
            var101 = Statics.field880;
        }
        if (var101 < Statics.field880 - 1) {
            int var102 = Statics.field880 - 1;
        }
        if (field291) {
            Statics.field184.method1756(class6.field94);
        } else {
            Statics.field184.method1756(0);
        }
        for (int var103 = 0; var103 < 104; var103++) {
            for (int var104 = 0; var104 < 104; var104++) {
                method2634(var103, var104);
            }
        }
        method800();
        method896();
        class41.field944.method3483();
        if (Statics.field1996 != null) {
            field329.method2565(100);
            field329.method2308(1057001181);
        }
        if (!field354) {
            int var105 = (Statics.field1756 - 6) / 8;
            int var106 = (Statics.field1756 + 6) / 8;
            int var107 = (Statics.field249 - 6) / 8;
            int var108 = (Statics.field249 + 6) / 8;
            for (int var109 = var105 - 1; var109 <= var106 + 1; var109++) {
                for (int var110 = var107 - 1; var110 <= var108 + 1; var110++) {
                    if (var109 < var105 || var109 > var106 || var110 < var107 || var110 > var108) {
                        Statics.field321.method3027("m" + var109 + "_" + var110);
                        Statics.field321.method3027("l" + var109 + "_" + var110);
                    }
                }
            }
        }
        method158(30);
        method800();
        Statics.field81 = (byte[][][]) null;
        Statics.field82 = (byte[][][]) null;
        Statics.field2089 = (byte[][][]) null;
        Statics.field85 = (byte[][][]) null;
        Statics.field2174 = (int[][][]) null;
        Statics.field84 = (byte[][][]) null;
        Statics.field1363 = (int[][]) null;
        Statics.field190 = null;
        Statics.field2049 = null;
        Statics.field92 = null;
        Statics.field86 = null;
        Statics.field1966 = null;
        field329.method2565(156);
        Statics.field1367.method2663();
        for (int var111 = 0; var111 < 32; var111++) {
            field2198[var111] = 0L;
        }
        for (int var112 = 0; var112 < 32; var112++) {
            field2196[var112] = 0L;
        }
        Statics.field3190 = 0;
    }

    @ObfuscatedName("ao.bo(IIIIIB)V")
    public static final void method606(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field184.method1781(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field184.method1858(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1014.field1421;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method961(var12);
            if (var13.field964 == -1) {
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
                class81 var14 = Statics.field171[var13.field964];
                if (var14 != null) {
                    int var15 = (var13.field962 * 4 - var14.field1431) / 2;
                    int var16 = (var13.field945 * 4 - var14.field1432) / 2;
                    var14.method1721(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field945) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field184.method1783(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field184.method1858(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method961(var21);
            if (var22.field964 != -1) {
                class81 var23 = Statics.field171[var22.field964];
                if (var23 != null) {
                    int var24 = (var22.field962 * 4 - var23.field1431) / 2;
                    int var25 = (var22.field945 * 4 - var23.field1432) / 2;
                    var23.method1721(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field945) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1014.field1421;
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
        int var29 = Statics.field184.method1784(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method961(var30);
        if (var31.field964 == -1) {
            return;
        }
        class81 var32 = Statics.field171[var31.field964];
        if (var32 != null) {
            int var33 = (var31.field962 * 4 - var32.field1431) / 2;
            int var34 = (var31.field945 * 4 - var32.field1432) / 2;
            var32.method1721(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field945) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dj.ba(B)V")
    public static final void method2241() {
        if (field523 == 73) {
            int var0 = field331.method2417();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2085;
            int var2 = (var0 & 0x7) + Statics.field779;
            int var3 = field331.method2345();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field508[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method689(Statics.field880, var1, var2, var6, -1, var4, var5, 0, -1);
            }
        } else if (field523 == 156) {
            int var7 = field331.method2409();
            int var8 = field331.method2320();
            int var9 = (var8 >> 4 & 0x7) + Statics.field2085;
            int var10 = (var8 & 0x7) + Statics.field779;
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                class199 var11 = field418[Statics.field880][var9][var10];
                if (var11 != null) {
                    for (class29 var12 = (class29) var11.method3546(); var12 != null; var12 = (class29) var11.method3548()) {
                        if ((var7 & 0x7FFF) == var12.field688) {
                            var12.method3625();
                            break;
                        }
                    }
                    if (var11.method3546() == null) {
                        field418[Statics.field880][var9][var10] = null;
                    }
                    method2634(var9, var10);
                }
            }
        } else if (field523 == 98) {
            int var13 = field331.method2356();
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = field508[var14];
            int var17 = field331.method2382();
            int var18 = field331.method2356();
            int var19 = (var18 >> 4 & 0x7) + Statics.field2085;
            int var20 = (var18 & 0x7) + Statics.field779;
            if (var19 >= 0 && var20 >= 0 && var19 < 103 && var20 < 103) {
                if (var16 == 0) {
                    class87 var21 = Statics.field184.method1777(Statics.field880, var19, var20);
                    if (var21 != null) {
                        int var22 = var21.field1528 >> 14 & 0x7FFF;
                        if (var14 == 2) {
                            var21.field1526 = new class13(var22, 2, var15 + 4, Statics.field880, var19, var20, var17, false, var21.field1526);
                            var21.field1527 = new class13(var22, 2, var15 + 1 & 0x3, Statics.field880, var19, var20, var17, false, var21.field1527);
                        } else {
                            var21.field1526 = new class13(var22, var14, var15, Statics.field880, var19, var20, var17, false, var21.field1526);
                        }
                    }
                }
                if (var16 == 1) {
                    class94 var23 = Statics.field184.method1778(Statics.field880, var19, var20);
                    if (var23 != null) {
                        int var24 = var23.field1602 >> 14 & 0x7FFF;
                        if (var14 == 4 || var14 == 5) {
                            var23.field1609 = new class13(var24, 4, var15, Statics.field880, var19, var20, var17, false, var23.field1609);
                        } else if (var14 == 6) {
                            var23.field1609 = new class13(var24, 4, var15 + 4, Statics.field880, var19, var20, var17, false, var23.field1609);
                        } else if (var14 == 7) {
                            var23.field1609 = new class13(var24, 4, (var15 + 2 & 0x3) + 4, Statics.field880, var19, var20, var17, false, var23.field1609);
                        } else if (var14 == 8) {
                            var23.field1609 = new class13(var24, 4, var15 + 4, Statics.field880, var19, var20, var17, false, var23.field1609);
                            var23.field1610 = new class13(var24, 4, (var15 + 2 & 0x3) + 4, Statics.field880, var19, var20, var17, false, var23.field1610);
                        }
                    }
                }
                if (var16 == 2) {
                    class98 var25 = Statics.field184.method1779(Statics.field880, var19, var20);
                    if (var14 == 11) {
                        var14 = 10;
                    }
                    if (var25 != null) {
                        var25.field1659 = new class13(var25.field1670 >> 14 & 0x7FFF, var14, var15, Statics.field880, var19, var20, var17, false, var25.field1659);
                    }
                }
                if (var16 == 3) {
                    class93 var26 = Statics.field184.method1780(Statics.field880, var19, var20);
                    if (var26 != null) {
                        var26.field1586 = new class13(var26.field1594 >> 14 & 0x7FFF, 22, var15, Statics.field880, var19, var20, var17, false, var26.field1586);
                    }
                }
            }
        } else if (field523 == 216) {
            int var27 = field331.method2320();
            int var28 = (var27 >> 4 & 0x7) + Statics.field2085;
            int var29 = (var27 & 0x7) + Statics.field779;
            int var30 = field331.method2322();
            int var31 = field331.method2322();
            int var32 = field331.method2322();
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                class199 var33 = field418[Statics.field880][var28][var29];
                if (var33 != null) {
                    for (class29 var34 = (class29) var33.method3546(); var34 != null; var34 = (class29) var33.method3548()) {
                        if ((var30 & 0x7FFF) == var34.field688 && var34.field682 == var31) {
                            var34.field682 = var32;
                            break;
                        }
                    }
                    method2634(var28, var29);
                }
            }
        } else if (field523 == 177) {
            int var35 = field331.method2320();
            int var36 = (var35 >> 4 & 0x7) + Statics.field2085;
            int var37 = (var35 & 0x7) + Statics.field779;
            int var38 = var36 + field331.method2425();
            int var39 = var37 + field331.method2425();
            int var40 = field331.method2323();
            int var41 = field331.method2322();
            int var42 = field331.method2320() * 4;
            int var43 = field331.method2320() * 4;
            int var44 = field331.method2322();
            int var45 = field331.method2322();
            int var46 = field331.method2320();
            int var47 = field331.method2320();
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var41 != 65535) {
                int var48 = var36 * 128 + 64;
                int var49 = var37 * 128 + 64;
                int var50 = var38 * 128 + 64;
                int var51 = var39 * 128 + 64;
                class7 var52 = new class7(var41, Statics.field880, var48, var49, method4(var48, var49, Statics.field880) - var42, field295 + var44, field295 + var45, var46, var47, var40, var43);
                var52.method89(var50, var51, method4(var50, var51, Statics.field880) - var43, field295 + var44);
                field302.method3541(var52);
            }
        } else {
            if (field523 == 221) {
                int var53 = field331.method2320();
                int var54 = (var53 >> 4 & 0x7) + Statics.field2085;
                int var55 = (var53 & 0x7) + Statics.field779;
                int var56 = field331.method2322();
                int var57 = field331.method2320();
                int var58 = var57 >> 4 & 0xF;
                int var59 = var57 & 0x7;
                int var60 = field331.method2320();
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                    int var61 = var58 + 1;
                    if (Statics.field2683.field871[0] >= var54 - var61 && Statics.field2683.field871[0] <= var54 + var61 && Statics.field2683.field872[0] >= var55 - var61 && Statics.field2683.field872[0] <= var55 + var61 && field526 != 0 && var59 > 0 && field527 < 50) {
                        field528[field527] = var56;
                        field292[field527] = var59;
                        field530[field527] = var60;
                        field564[field527] = null;
                        field531[field527] = (var54 << 16) + (var55 << 8) + var58;
                        field527++;
                    }
                }
            }
            if (field523 == 181) {
                byte var62 = field331.method2349();
                int var63 = field331.method2409();
                int var64 = field331.method2345();
                int var65 = var64 >> 2;
                int var66 = var64 & 0x3;
                int var67 = field508[var65];
                int var68 = field331.method2345();
                int var69 = (var68 >> 4 & 0x7) + Statics.field2085;
                int var70 = (var68 & 0x7) + Statics.field779;
                int var71 = field331.method2354();
                int var72 = field331.method2382();
                byte var73 = field331.method2303();
                byte var74 = field331.method2430();
                int var75 = field331.method2382();
                byte var76 = field331.method2349();
                class3 var77;
                if (field288 == var71) {
                    var77 = Statics.field2683;
                } else {
                    var77 = field407[var71];
                }
                if (var77 != null) {
                    class41 var78 = class41.method961(var63);
                    int var79;
                    int var80;
                    if (var66 == 1 || var66 == 3) {
                        var79 = var78.field945;
                        var80 = var78.field962;
                    } else {
                        var79 = var78.field962;
                        var80 = var78.field945;
                    }
                    int var81 = (var79 >> 1) + var69;
                    int var82 = (var79 + 1 >> 1) + var69;
                    int var83 = (var80 >> 1) + var70;
                    int var84 = (var80 + 1 >> 1) + var70;
                    int[][] var85 = class6.field80[Statics.field880];
                    int var86 = var85[var81][var83] + var85[var82][var83] + var85[var81][var84] + var85[var82][var84] >> 2;
                    int var87 = (var69 << 7) + (var79 << 6);
                    int var88 = (var70 << 7) + (var80 << 6);
                    class105 var89 = var78.method764(var65, var66, var85, var87, var86, var88);
                    if (var89 != null) {
                        method689(Statics.field880, var69, var70, var67, -1, 0, 0, var75 + 1, var72 + 1);
                        var77.field39 = field295 + var75;
                        var77.field48 = field295 + var72;
                        var77.field45 = var89;
                        var77.field33 = var69 * 128 + var79 * 64;
                        var77.field49 = var70 * 128 + var80 * 64;
                        var77.field42 = var86;
                        if (var76 > var62) {
                            byte var90 = var76;
                            var76 = var62;
                            var62 = var90;
                        }
                        if (var73 > var74) {
                            byte var91 = var73;
                            var73 = var74;
                            var74 = var91;
                        }
                        var77.field46 = var69 + var76;
                        var77.field47 = var62 + var69;
                        var77.field43 = var70 + var73;
                        var77.field41 = var70 + var74;
                    }
                }
            }
            if (field523 == 186) {
                int var92 = field331.method2320();
                int var93 = (var92 >> 4 & 0x7) + Statics.field2085;
                int var94 = (var92 & 0x7) + Statics.field779;
                int var95 = field331.method2322();
                int var96 = field331.method2320();
                int var97 = field331.method2322();
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    int var98 = var93 * 128 + 64;
                    int var99 = var94 * 128 + 64;
                    class30 var100 = new class30(var95, Statics.field880, var98, var99, method4(var98, var99, Statics.field880) - var96, var97, field295);
                    field448.method3541(var100);
                }
            } else if (field523 == 13) {
                int var101 = field331.method2322();
                int var102 = field331.method2354();
                int var103 = field331.method2417();
                int var104 = (var103 >> 4 & 0x7) + Statics.field2085;
                int var105 = (var103 & 0x7) + Statics.field779;
                if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                    class29 var106 = new class29();
                    var106.field688 = var101;
                    var106.field682 = var102;
                    if (field418[Statics.field880][var104][var105] == null) {
                        field418[Statics.field880][var104][var105] = new class199();
                    }
                    field418[Statics.field880][var104][var105].method3541(var106);
                    method2634(var104, var105);
                }
            } else if (field523 == 1) {
                int var107 = field331.method2409();
                int var108 = field331.method2345();
                int var109 = (var108 >> 4 & 0x7) + Statics.field2085;
                int var110 = (var108 & 0x7) + Statics.field779;
                int var111 = field331.method2356();
                int var112 = var111 >> 2;
                int var113 = var111 & 0x3;
                int var114 = field508[var112];
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                    method689(Statics.field880, var109, var110, var114, var107, var112, var113, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("as.bj(IIIIIIIIII)V")
    public static final void method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field499.method3546(); var10 != null; var10 = (class17) field499.method3548()) {
            if (var10.field237 == arg0 && var10.field227 == arg1 && var10.field228 == arg2 && var10.field235 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field237 = arg0;
            var9.field235 = arg3;
            var9.field227 = arg1;
            var9.field228 = arg2;
            method152(var9);
            field499.method3541(var9);
        }
        var9.field226 = arg4;
        var9.field234 = arg5;
        var9.field233 = arg6;
        var9.field231 = arg7;
        var9.field236 = arg8;
    }

    @ObfuscatedName("ay.bx(S)V")
    public static final void method896() {
        for (class17 var0 = (class17) field499.method3546(); var0 != null; var0 = (class17) field499.method3548()) {
            if (var0.field236 == -1) {
                var0.field231 = 0;
                method152(var0);
            } else {
                var0.method3625();
            }
        }
    }

    @ObfuscatedName("o.bi(Lx;I)V")
    public static final void method152(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field235 == 0) {
            var1 = Statics.field184.method1781(arg0.field237, arg0.field227, arg0.field228);
        }
        if (arg0.field235 == 1) {
            var1 = Statics.field184.method1782(arg0.field237, arg0.field227, arg0.field228);
        }
        if (arg0.field235 == 2) {
            var1 = Statics.field184.method1783(arg0.field237, arg0.field227, arg0.field228);
        }
        if (arg0.field235 == 3) {
            var1 = Statics.field184.method1784(arg0.field237, arg0.field227, arg0.field228);
        }
        if (var1 != 0) {
            int var5 = Statics.field184.method1858(arg0.field237, arg0.field227, arg0.field228, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field239 = var2;
        arg0.field229 = var3;
        arg0.field230 = var4;
    }

    @ObfuscatedName("u.be(IIIIIIIB)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field291 && Statics.field880 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field184.method1781(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field184.method1782(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field184.method1783(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field184.method1784(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field184.method1858(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field184.method1772(arg0, arg2, arg3);
                class41 var15 = class41.method961(var12);
                if (var15.field946 != 0) {
                    field346[arg0].method2224(arg2, arg3, var13, var14, var15.field947);
                }
            }
            if (arg1 == 1) {
                Statics.field184.method1773(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field184.method1774(arg0, arg2, arg3);
                class41 var16 = class41.method961(var12);
                if (var16.field962 + arg2 > 103 || var16.field962 + arg3 > 103 || var16.field945 + arg2 > 103 || var16.field945 + arg3 > 103) {
                    return;
                }
                if (var16.field946 != 0) {
                    field346[arg0].method2209(arg2, arg3, var16.field962, var16.field945, var14, var16.field947);
                }
            }
            if (arg1 == 3) {
                Statics.field184.method1775(arg0, arg2, arg3);
                class41 var17 = class41.method961(var12);
                if (var17.field946 == 1) {
                    field346[arg0].method2214(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field79[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        Statics.method878(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field184, field346[arg0]);
    }

    @ObfuscatedName("da.bp(III)V")
    public static final void method2634(int arg0, int arg1) {
        class199 var2 = field418[Statics.field880][arg0][arg1];
        if (var2 == null) {
            Statics.field184.method1776(Statics.field880, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3546(); var6 != null; var6 = (class29) var2.method3548()) {
            class52 var7 = class52.method2933(var6.field688);
            long var8 = (long) var7.field1123;
            if (var7.field1135 == 1) {
                var8 = (long) (var6.field682 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field184.method1776(Statics.field880, arg0, arg1);
            return;
        }
        var2.method3542(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3546(); var12 != null; var12 = (class29) var2.method3548()) {
            if (var5.field688 != var12.field688) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field688 != var12.field688 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field184.method1762(Statics.field880, arg0, arg1, method4(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field880), var5, var13, var10, var11);
    }

    @ObfuscatedName("ax.br(ZB)V")
    public static final void method625(boolean arg0) {
        field410 = 0;
        field336 = 0;
        field331.method2574();
        int var1 = field331.method2594(8);
        if (var1 < field316) {
            for (int var2 = var1; var2 < field316; var2++) {
                field411[++field410 - 1] = field325[var2];
            }
        }
        if (var1 > field316) {
            throw new RuntimeException("");
        }
        field316 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field325[var3];
            class35 var5 = field326[var4];
            int var6 = field331.method2594(1);
            if (var6 == 0) {
                field325[++field316 - 1] = var4;
                var5.field865 = field295;
            } else {
                int var7 = field331.method2594(2);
                if (var7 == 0) {
                    field325[++field316 - 1] = var4;
                    var5.field865 = field295;
                    field327[++field336 - 1] = var4;
                } else if (var7 == 1) {
                    field325[++field316 - 1] = var4;
                    var5.field865 = field295;
                    int var8 = field331.method2594(3);
                    var5.method691(var8, (byte) 1);
                    int var9 = field331.method2594(1);
                    if (var9 == 1) {
                        field327[++field336 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field325[++field316 - 1] = var4;
                    var5.field865 = field295;
                    int var10 = field331.method2594(3);
                    var5.method691(var10, (byte) 2);
                    int var11 = field331.method2594(3);
                    var5.method691(var11, (byte) 2);
                    int var12 = field331.method2594(1);
                    if (var12 == 1) {
                        field327[++field336 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field411[++field410 - 1] = var4;
                }
            }
        }
        method2558(arg0);
        for (int var13 = 0; var13 < field336; var13++) {
            int var14 = field327[var13];
            class35 var15 = field326[var14];
            int var16 = field331.method2320();
            if ((var16 & 0x4) != 0) {
                int var17 = field331.method2356();
                int var18 = field331.method2345();
                var15.method722(var17, var18, field295);
                var15.field839 = field295 + 300;
                var15.field840 = field331.method2322();
                var15.field841 = field331.method2354();
            }
            if ((var16 & 0x20) != 0) {
                var15.field842 = field331.method2354();
                if (var15.field842 == 65535) {
                    var15.field842 = -1;
                }
            }
            if ((var16 & 0x80) != 0) {
                var15.field845 = field331.method2350();
                var15.field833 = 100;
            }
            if ((var16 & 0x8) != 0) {
                int var19 = field331.method2322();
                int var20 = field331.method2409();
                int var21 = var15.field861 - (var19 - Statics.field77 - Statics.field77) * 64;
                int var22 = var15.field818 - (var20 - Statics.field271 - Statics.field271) * 64;
                if (var21 != 0 || var22 != 0) {
                    var15.field844 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                }
            }
            if ((var16 & 0x1) != 0) {
                var15.field853 = field331.method2382();
                int var23 = field331.method2438();
                var15.field857 = var23 >> 16;
                var15.field851 = (var23 & 0xFFFF) + field295;
                var15.field876 = 0;
                var15.field858 = 0;
                if (var15.field851 > field295) {
                    var15.field876 = -1;
                }
                if (var15.field853 == 65535) {
                    var15.field853 = -1;
                }
            }
            if ((var16 & 0x40) != 0) {
                int var24 = field331.method2417();
                int var25 = field331.method2320();
                var15.method722(var24, var25, field295);
                var15.field839 = field295 + 300;
                var15.field840 = field331.method2354();
                var15.field841 = field331.method2354();
            }
            if ((var16 & 0x2) != 0) {
                int var26 = field331.method2322();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = field331.method2356();
                if (var15.field848 == var26 && var26 != -1) {
                    int var28 = class43.method2257(var26).field1006;
                    if (var28 == 1) {
                        var15.field856 = 0;
                        var15.field850 = 0;
                        var15.field855 = var27;
                        var15.field852 = 0;
                    }
                    if (var28 == 2) {
                        var15.field852 = 0;
                    }
                } else if (var26 == -1 || var15.field848 == -1 || class43.method2257(var26).field997 >= class43.method2257(var15.field848).field997) {
                    var15.field848 = var26;
                    var15.field856 = 0;
                    var15.field850 = 0;
                    var15.field855 = var27;
                    var15.field852 = 0;
                    var15.field875 = var15.field870;
                }
            }
            if ((var16 & 0x10) != 0) {
                var15.field785 = class40.method2608(field331.method2382());
                var15.field821 = var15.field785.field894;
                var15.field869 = var15.field785.field900;
                var15.field825 = var15.field785.field893;
                var15.field831 = var15.field785.field901;
                var15.field827 = var15.field785.field902;
                var15.field862 = var15.field785.field903;
                var15.field822 = var15.field785.field897;
                var15.field832 = var15.field785.field899;
                var15.field824 = var15.field785.field912;
            }
        }
        for (int var29 = 0; var29 < field410; var29++) {
            int var30 = field411[var29];
            if (field295 != field326[var30].field865) {
                field326[var30].field785 = null;
                field326[var30] = null;
            }
        }
        if (field444 != field331.field1988) {
            throw new RuntimeException(field331.field1988 + class2.field17 + field444);
        }
        for (int var31 = 0; var31 < field316; var31++) {
            if (field326[field325[var31]] == null) {
                throw new RuntimeException(var31 + class2.field17 + field316);
            }
        }
    }

    @ObfuscatedName("dn.by(ZI)V")
    public static final void method2558(boolean arg0) {
        while (true) {
            if (field331.method2570(field444) >= 27) {
                int var1 = field331.method2594(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field326[var1] == null) {
                        field326[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field326[var1];
                    field325[++field316 - 1] = var1;
                    var3.field865 = field295;
                    var3.field785 = class40.method2608(field331.method2594(14));
                    int var4 = field331.method2594(1);
                    int var5;
                    if (arg0) {
                        var5 = field331.method2594(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field331.method2594(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6;
                    if (arg0) {
                        var6 = field331.method2594(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field331.method2594(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field331.method2594(1);
                    if (var7 == 1) {
                        field327[++field336 - 1] = var1;
                    }
                    int var8 = field518[field331.method2594(3)];
                    if (var2) {
                        var3.field867 = var3.field819 = var8;
                    }
                    var3.field821 = var3.field785.field894;
                    var3.field869 = var3.field785.field900;
                    if (var3.field869 == 0) {
                        var3.field819 = 0;
                    }
                    var3.field825 = var3.field785.field893;
                    var3.field831 = var3.field785.field901;
                    var3.field827 = var3.field785.field902;
                    var3.field862 = var3.field785.field903;
                    var3.field822 = var3.field785.field897;
                    var3.field832 = var3.field785.field899;
                    var3.field824 = var3.field785.field912;
                    var3.method692(Statics.field2683.field871[0] + var6, Statics.field2683.field872[0] + var5, var4 == 1);
                    continue;
                }
            }
            field331.method2569();
            return;
        }
    }

    @ObfuscatedName("s.bs(Li;IIBI)V")
    public static final void method159(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field871[0];
        int var5 = arg0.field872[0];
        if (var4 < 0 || var4 >= 104 || var5 < 0 || var5 >= 104 || arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
            return;
        }
        int var6 = arg0.method10();
        class107 var7 = method2624(arg1, arg2);
        class108 var8 = field346[arg0.field52];
        int[] var9 = field566;
        int[] var10 = field567;
        for (int var11 = 0; var11 < 128; var11++) {
            for (int var12 = 0; var12 < 128; var12++) {
                class106.field1859[var11][var12] = 0;
                class106.field1860[var11][var12] = 99999999;
            }
        }
        boolean var28;
        if (var6 == 1) {
            int var13 = var4;
            int var14 = var5;
            byte var15 = 64;
            byte var16 = 64;
            int var17 = var4 - var15;
            int var18 = var5 - var16;
            class106.field1859[var15][var16] = 99;
            class106.field1860[var15][var16] = 0;
            byte var19 = 0;
            int var20 = 0;
            class106.field1858[var19] = var4;
            int var77 = var19 + 1;
            class106.field1864[var19] = var5;
            int[][] var21 = var8.field1885;
            boolean var26;
            while (true) {
                if (var77 == var20) {
                    Statics.field1861 = var13;
                    Statics.field1862 = var14;
                    var26 = false;
                    break;
                }
                var13 = class106.field1858[var20];
                var14 = class106.field1864[var20];
                var20 = var20 + 1 & 0xFFF;
                int var22 = var13 - var17;
                int var23 = var14 - var18;
                int var24 = var13 - var8.field1874;
                int var25 = var14 - var8.field1882;
                if (var7.method117(1, var13, var14, var8)) {
                    Statics.field1861 = var13;
                    Statics.field1862 = var14;
                    var26 = true;
                    break;
                }
                int var27 = class106.field1860[var22][var23] + 1;
                if (var22 > 0 && class106.field1859[var22 - 1][var23] == 0 && (var21[var24 - 1][var25] & 0x1240108) == 0) {
                    class106.field1858[var77] = var13 - 1;
                    class106.field1864[var77] = var14;
                    var77 = var77 + 1 & 0xFFF;
                    class106.field1859[var22 - 1][var23] = 2;
                    class106.field1860[var22 - 1][var23] = var27;
                }
                if (var22 < 127 && class106.field1859[var22 + 1][var23] == 0 && (var21[var24 + 1][var25] & 0x1240180) == 0) {
                    class106.field1858[var77] = var13 + 1;
                    class106.field1864[var77] = var14;
                    var77 = var77 + 1 & 0xFFF;
                    class106.field1859[var22 + 1][var23] = 8;
                    class106.field1860[var22 + 1][var23] = var27;
                }
                if (var23 > 0 && class106.field1859[var22][var23 - 1] == 0 && (var21[var24][var25 - 1] & 0x1240102) == 0) {
                    class106.field1858[var77] = var13;
                    class106.field1864[var77] = var14 - 1;
                    var77 = var77 + 1 & 0xFFF;
                    class106.field1859[var22][var23 - 1] = 1;
                    class106.field1860[var22][var23 - 1] = var27;
                }
                if (var23 < 127 && class106.field1859[var22][var23 + 1] == 0 && (var21[var24][var25 + 1] & 0x1240120) == 0) {
                    class106.field1858[var77] = var13;
                    class106.field1864[var77] = var14 + 1;
                    var77 = var77 + 1 & 0xFFF;
                    class106.field1859[var22][var23 + 1] = 4;
                    class106.field1860[var22][var23 + 1] = var27;
                }
                if (var22 > 0 && var23 > 0 && class106.field1859[var22 - 1][var23 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x124010E) == 0 && (var21[var24 - 1][var25] & 0x1240108) == 0 && (var21[var24][var25 - 1] & 0x1240102) == 0) {
                    class106.field1858[var77] = var13 - 1;
                    class106.field1864[var77] = var14 - 1;
                    var77 = var77 + 1 & 0xFFF;
                    class106.field1859[var22 - 1][var23 - 1] = 3;
                    class106.field1860[var22 - 1][var23 - 1] = var27;
                }
                if (var22 < 127 && var23 > 0 && class106.field1859[var22 + 1][var23 - 1] == 0 && (var21[var24 + 1][var25 - 1] & 0x1240183) == 0 && (var21[var24 + 1][var25] & 0x1240180) == 0 && (var21[var24][var25 - 1] & 0x1240102) == 0) {
                    class106.field1858[var77] = var13 + 1;
                    class106.field1864[var77] = var14 - 1;
                    var77 = var77 + 1 & 0xFFF;
                    class106.field1859[var22 + 1][var23 - 1] = 9;
                    class106.field1860[var22 + 1][var23 - 1] = var27;
                }
                if (var22 > 0 && var23 < 127 && class106.field1859[var22 - 1][var23 + 1] == 0 && (var21[var24 - 1][var25 + 1] & 0x1240138) == 0 && (var21[var24 - 1][var25] & 0x1240108) == 0 && (var21[var24][var25 + 1] & 0x1240120) == 0) {
                    class106.field1858[var77] = var13 - 1;
                    class106.field1864[var77] = var14 + 1;
                    var77 = var77 + 1 & 0xFFF;
                    class106.field1859[var22 - 1][var23 + 1] = 6;
                    class106.field1860[var22 - 1][var23 + 1] = var27;
                }
                if (var22 < 127 && var23 < 127 && class106.field1859[var22 + 1][var23 + 1] == 0 && (var21[var24 + 1][var25 + 1] & 0x12401E0) == 0 && (var21[var24 + 1][var25] & 0x1240180) == 0 && (var21[var24][var25 + 1] & 0x1240120) == 0) {
                    class106.field1858[var77] = var13 + 1;
                    class106.field1864[var77] = var14 + 1;
                    var77 = var77 + 1 & 0xFFF;
                    class106.field1859[var22 + 1][var23 + 1] = 12;
                    class106.field1860[var22 + 1][var23 + 1] = var27;
                }
            }
            var28 = var26;
        } else if (var6 == 2) {
            var28 = class106.method723(var4, var5, var7, var8);
        } else {
            int var29 = var4;
            int var30 = var5;
            byte var31 = 64;
            byte var32 = 64;
            int var33 = var4 - var31;
            int var34 = var5 - var32;
            class106.field1859[var31][var32] = 99;
            class106.field1860[var31][var32] = 0;
            byte var35 = 0;
            int var36 = 0;
            class106.field1858[var35] = var4;
            int var78 = var35 + 1;
            class106.field1864[var35] = var5;
            int[][] var37 = var8.field1885;
            boolean var42;
            label514: while (true) {
                label512: while (true) {
                    int var38;
                    int var39;
                    int var40;
                    int var41;
                    int var43;
                    do {
                        do {
                            do {
                                label489: do {
                                    if (var78 == var36) {
                                        Statics.field1861 = var29;
                                        Statics.field1862 = var30;
                                        var42 = false;
                                        break label514;
                                    }
                                    var29 = class106.field1858[var36];
                                    var30 = class106.field1864[var36];
                                    var36 = var36 + 1 & 0xFFF;
                                    var38 = var29 - var33;
                                    var39 = var30 - var34;
                                    var40 = var29 - var8.field1874;
                                    var41 = var30 - var8.field1882;
                                    if (var7.method117(var6, var29, var30, var8)) {
                                        Statics.field1861 = var29;
                                        Statics.field1862 = var30;
                                        var42 = true;
                                        break label514;
                                    }
                                    var43 = class106.field1860[var38][var39] + 1;
                                    if (var38 > 0 && class106.field1859[var38 - 1][var39] == 0 && (var37[var40 - 1][var41] & 0x124010E) == 0 && (var37[var40 - 1][var6 + var41 - 1] & 0x1240138) == 0) {
                                        int var44 = 1;
                                        while (true) {
                                            if (var44 >= var6 - 1) {
                                                class106.field1858[var78] = var29 - 1;
                                                class106.field1864[var78] = var30;
                                                var78 = var78 + 1 & 0xFFF;
                                                class106.field1859[var38 - 1][var39] = 2;
                                                class106.field1860[var38 - 1][var39] = var43;
                                                break;
                                            }
                                            if ((var37[var40 - 1][var41 + var44] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var44++;
                                        }
                                    }
                                    if (var38 < 128 - var6 && class106.field1859[var38 + 1][var39] == 0 && (var37[var6 + var40][var41] & 0x1240183) == 0 && (var37[var6 + var40][var6 + var41 - 1] & 0x12401E0) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= var6 - 1) {
                                                class106.field1858[var78] = var29 + 1;
                                                class106.field1864[var78] = var30;
                                                var78 = var78 + 1 & 0xFFF;
                                                class106.field1859[var38 + 1][var39] = 8;
                                                class106.field1860[var38 + 1][var39] = var43;
                                                break;
                                            }
                                            if ((var37[var6 + var40][var41 + var45] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var39 > 0 && class106.field1859[var38][var39 - 1] == 0 && (var37[var40][var41 - 1] & 0x124010E) == 0 && (var37[var6 + var40 - 1][var41 - 1] & 0x1240183) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var6 - 1) {
                                                class106.field1858[var78] = var29;
                                                class106.field1864[var78] = var30 - 1;
                                                var78 = var78 + 1 & 0xFFF;
                                                class106.field1859[var38][var39 - 1] = 1;
                                                class106.field1860[var38][var39 - 1] = var43;
                                                break;
                                            }
                                            if ((var37[var40 + var46][var41 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var39 < 128 - var6 && class106.field1859[var38][var39 + 1] == 0 && (var37[var40][var6 + var41] & 0x1240138) == 0 && (var37[var6 + var40 - 1][var6 + var41] & 0x12401E0) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var6 - 1) {
                                                class106.field1858[var78] = var29;
                                                class106.field1864[var78] = var30 + 1;
                                                var78 = var78 + 1 & 0xFFF;
                                                class106.field1859[var38][var39 + 1] = 4;
                                                class106.field1860[var38][var39 + 1] = var43;
                                                break;
                                            }
                                            if ((var37[var40 + var47][var6 + var41] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var38 > 0 && var39 > 0 && class106.field1859[var38 - 1][var39 - 1] == 0 && (var37[var40 - 1][var41 - 1] & 0x124010E) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var6) {
                                                class106.field1858[var78] = var29 - 1;
                                                class106.field1864[var78] = var30 - 1;
                                                var78 = var78 + 1 & 0xFFF;
                                                class106.field1859[var38 - 1][var39 - 1] = 3;
                                                class106.field1860[var38 - 1][var39 - 1] = var43;
                                                break;
                                            }
                                            if ((var37[var40 - 1][var41 - 1 + var48] & 0x124013E) != 0 || (var37[var40 - 1 + var48][var41 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var38 < 128 - var6 && var39 > 0 && class106.field1859[var38 + 1][var39 - 1] == 0 && (var37[var6 + var40][var41 - 1] & 0x1240183) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var6) {
                                                class106.field1858[var78] = var29 + 1;
                                                class106.field1864[var78] = var30 - 1;
                                                var78 = var78 + 1 & 0xFFF;
                                                class106.field1859[var38 + 1][var39 - 1] = 9;
                                                class106.field1860[var38 + 1][var39 - 1] = var43;
                                                break;
                                            }
                                            if ((var37[var6 + var40][var41 - 1 + var49] & 0x12401E3) != 0 || (var37[var40 + var49][var41 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var38 > 0 && var39 < 128 - var6 && class106.field1859[var38 - 1][var39 + 1] == 0 && (var37[var40 - 1][var6 + var41] & 0x1240138) == 0) {
                                        for (int var50 = 1; var50 < var6; var50++) {
                                            if ((var37[var40 - 1][var41 + var50] & 0x124013E) != 0 || (var37[var40 - 1 + var50][var6 + var41] & 0x12401F8) != 0) {
                                                continue label489;
                                            }
                                        }
                                        class106.field1858[var78] = var29 - 1;
                                        class106.field1864[var78] = var30 + 1;
                                        var78 = var78 + 1 & 0xFFF;
                                        class106.field1859[var38 - 1][var39 + 1] = 6;
                                        class106.field1860[var38 - 1][var39 + 1] = var43;
                                    }
                                } while (var38 >= 128 - var6);
                            } while (var39 >= 128 - var6);
                        } while (class106.field1859[var38 + 1][var39 + 1] != 0);
                    } while ((var37[var6 + var40][var6 + var41] & 0x12401E0) != 0);
                    for (int var51 = 1; var51 < var6; var51++) {
                        if ((var37[var40 + var51][var6 + var41] & 0x12401F8) != 0 || (var37[var6 + var40][var41 + var51] & 0x12401E3) != 0) {
                            continue label512;
                        }
                    }
                    class106.field1858[var78] = var29 + 1;
                    class106.field1864[var78] = var30 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class106.field1859[var38 + 1][var39 + 1] = 12;
                    class106.field1860[var38 + 1][var39 + 1] = var43;
                }
            }
            var28 = var42;
        }
        int var70;
        label570: {
            int var52 = var4 - 64;
            int var53 = var5 - 64;
            int var54 = Statics.field1861;
            int var55 = Statics.field1862;
            if (!var28) {
                int var56 = Integer.MAX_VALUE;
                int var57 = Integer.MAX_VALUE;
                byte var58 = 10;
                int var59 = var7.field1867;
                int var60 = var7.field1868;
                int var61 = var7.field1869;
                int var62 = var7.field1871;
                for (int var63 = var59 - var58; var63 <= var58 + var59; var63++) {
                    for (int var64 = var60 - var58; var64 <= var58 + var60; var64++) {
                        int var65 = var63 - var52;
                        int var66 = var64 - var53;
                        if (var65 >= 0 && var66 >= 0 && var65 < 128 && var66 < 128 && class106.field1860[var65][var66] < 100) {
                            int var67 = 0;
                            if (var63 < var59) {
                                var67 = var59 - var63;
                            } else if (var63 > var59 + var61 - 1) {
                                var67 = var63 - (var59 + var61 - 1);
                            }
                            int var68 = 0;
                            if (var64 < var60) {
                                var68 = var60 - var64;
                            } else if (var64 > var60 + var62 - 1) {
                                var68 = var64 - (var60 + var62 - 1);
                            }
                            int var69 = var67 * var67 + var68 * var68;
                            if (var69 < var56 || var56 == var69 && class106.field1860[var65][var66] < var57) {
                                var56 = var69;
                                var57 = class106.field1860[var65][var66];
                                var54 = var63;
                                var55 = var64;
                            }
                        }
                    }
                }
                if (var56 == Integer.MAX_VALUE) {
                    var70 = -1;
                    break label570;
                }
            }
            if (var4 == var54 && var5 == var55) {
                var70 = 0;
            } else {
                byte var71 = 0;
                class106.field1858[var71] = var54;
                int var79 = var71 + 1;
                class106.field1864[var71] = var55;
                int var72;
                int var73 = var72 = class106.field1859[var54 - var52][var55 - var53];
                while (var4 != var54 || var5 != var55) {
                    if (var72 != var73) {
                        var72 = var73;
                        class106.field1858[var79] = var54;
                        class106.field1864[var79++] = var55;
                    }
                    if ((var73 & 0x2) != 0) {
                        var54++;
                    } else if ((var73 & 0x8) != 0) {
                        var54--;
                    }
                    if ((var73 & 0x1) != 0) {
                        var55++;
                    } else if ((var73 & 0x4) != 0) {
                        var55--;
                    }
                    var73 = class106.field1859[var54 - var52][var55 - var53];
                }
                int var74 = 0;
                while (var79-- > 0) {
                    var9[var74] = class106.field1858[var79];
                    var10[var74++] = class106.field1864[var79];
                    if (var74 >= var9.length) {
                        break;
                    }
                }
                var70 = var74;
            }
        }
        int var75 = var70;
        if (var70 >= 1) {
            for (int var76 = 0; var76 < var75 - 1; var76++) {
                arg0.method17(field566[var76], field567[var76], arg3);
            }
        }
    }

    @ObfuscatedName("dx.bu(IIB)Ldt;")
    public static class107 method2624(int arg0, int arg1) {
        field565.field1867 = arg0;
        field565.field1868 = arg1;
        field565.field1869 = 1;
        field565.field1871 = 1;
        return field565;
    }

    @ObfuscatedName("df.bf(III)V")
    public static final void method2246(int arg0, int arg1) {
        if (field427 < 2 && field409 == 0 && !field496) {
            return;
        }
        String var2;
        if (field409 == 1 && field427 < 2) {
            var2 = class157.field2446 + class157.field2329 + field439 + " " + class2.field21;
        } else if (field496 && field427 < 2) {
            var2 = field443 + class157.field2329 + field501 + " " + class2.field21;
        } else {
            int var3 = field427 - 1;
            String var4;
            if (field433[var3].length() > 0) {
                var4 = field432[var3] + class157.field2329 + field433[var3];
            } else {
                var4 = field432[var3];
            }
            var2 = var4;
        }
        if (field427 > 2) {
            var2 = var2 + class2.method3047(16777215) + " " + '/' + " " + (field427 - 2) + class157.field2552;
        }
        Statics.field232.method3741(var2, arg0 + 4, arg1 + 15, 16777215, 0, field295 / 1000);
    }

    @ObfuscatedName("fe.bc(IIIII)V")
    public static final void method2995(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field488; var4++) {
            if (field495[var4] + field493[var4] > arg0 && field493[var4] < arg0 + arg2 && field494[var4] + field467[var4] > arg1 && field494[var4] < arg1 + arg3) {
                field554[var4] = true;
            }
        }
    }

    @ObfuscatedName("c.bb(IIIII)V")
    public static final void method79(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field488; var4++) {
            if (field495[var4] + field493[var4] > arg0 && field493[var4] < arg0 + arg2 && field494[var4] + field467[var4] > arg1 && field494[var4] < arg1 + arg3) {
                field491[var4] = true;
            }
        }
    }

    @ObfuscatedName("as.bq(IIB)V")
    public static final void method687(int arg0, int arg1) {
        int var2 = Statics.field232.method3729(class157.field2449);
        for (int var3 = 0; var3 < field427; var3++) {
            class224 var4 = Statics.field232;
            String var5;
            if (field433[var3].length() > 0) {
                var5 = field432[var3] + class157.field2329 + field433[var3];
            } else {
                var5 = field432[var3];
            }
            int var6 = var4.method3729(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field427 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field999) {
            var8 = Statics.field999 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1605) {
            var9 = Statics.field1605 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field334 = true;
        Statics.field2050 = var8;
        Statics.field152 = var9;
        Statics.field780 = var2;
        Statics.field127 = field427 * 15 + 22;
    }

    @ObfuscatedName("dk.bz(IB)Z")
    public static final boolean method2265(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field497[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bd.bt(Lax;III)V")
    public static final void method1564(class31 arg0, int arg1, int arg2) {
        method87(arg0.field705, arg0.field706, arg0.field707, arg0.field708, arg0.field709, arg0.field709, arg1, arg2);
    }

    @ObfuscatedName("f.bv(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method87(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 19) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(238);
            field329.method2513(Statics.field77 + arg0);
            field329.method2343(class137.field2125[82] ? 1 : 0);
            field329.method2513(Statics.field271 + arg1);
            field329.method2501(arg3);
        }
        if (arg2 == 32) {
            field329.method2565(210);
            field329.method2501(arg0);
            field329.method2353(arg3);
            field329.method2308(Statics.field1227);
            field329.method2361(arg1);
            field329.method2513(field506);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 23) {
            Statics.field184.method1904(Statics.field880, arg0, arg1);
        }
        if (arg2 == 1002) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field329.method2565(146);
            field329.method2513(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class35 var8 = field326[arg3];
            if (var8 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(95);
                field329.method2353(arg3);
                field329.method2344(class137.field2125[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class3 var9 = field407[arg3];
            if (var9 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(42);
                field329.method2342(class137.field2125[82] ? 1 : 0);
                field329.method2352(arg3);
            }
        }
        if (arg2 == 18) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(188);
            field329.method2342(class137.field2125[82] ? 1 : 0);
            field329.method2501(Statics.field77 + arg0);
            field329.method2353(arg3);
            field329.method2353(Statics.field271 + arg1);
        }
        if (arg2 == 16) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(211);
            field329.method2353(Statics.field1627);
            field329.method2513(Statics.field77 + arg0);
            field329.method2305(class137.field2125[82] ? 1 : 0);
            field329.method2501(Statics.field1004);
            field329.method2501(Statics.field271 + arg1);
            field329.method2361(Statics.field165);
            field329.method2352(arg3);
        }
        if (arg2 == 34) {
            field329.method2565(232);
            field329.method2513(arg3);
            field329.method2363(arg1);
            field329.method2352(arg0);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 35) {
            field329.method2565(23);
            field329.method2308(arg1);
            field329.method2501(arg0);
            field329.method2513(arg3);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 30 && field449 == null) {
            field329.method2565(246);
            field329.method2513(arg0);
            field329.method2363(arg1);
            field449 = class173.method2625(arg1, arg0);
            method2930(field449);
        }
        if (arg2 == 1003) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            class35 var10 = field326[arg3];
            if (var10 != null) {
                class40 var11 = var10.field785;
                if (var11.field898 != null) {
                    var11 = var11.method731();
                }
                if (var11 != null) {
                    field329.method2565(130);
                    field329.method2513(var11.field892);
                }
            }
        }
        if (arg2 == 26) {
            method2925();
        }
        if (arg2 == 46) {
            class3 var12 = field407[arg3];
            if (var12 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(255);
                field329.method2352(arg3);
                field329.method2342(class137.field2125[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(224);
            field329.method2343(class137.field2125[82] ? 1 : 0);
            field329.method2353(Statics.field271 + arg1);
            field329.method2352(arg3 >> 14 & 0x7FFF);
            field329.method2353(Statics.field77 + arg0);
        }
        if (arg2 == 49) {
            class3 var13 = field407[arg3];
            if (var13 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(49);
                field329.method2305(class137.field2125[82] ? 1 : 0);
                field329.method2513(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var14 = field407[arg3];
            if (var14 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(179);
                field329.method2501(arg3);
                field329.method2342(class137.field2125[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(203);
            field329.method2352(Statics.field271 + arg1);
            field329.method2513(Statics.field77 + arg0);
            field329.method2305(class137.field2125[82] ? 1 : 0);
            field329.method2501(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 43) {
            field329.method2565(30);
            field329.method2501(arg0);
            field329.method2353(arg3);
            field329.method2362(arg1);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var15 = class173.method2625(arg1, arg0);
            if (var15 != null) {
                method2635(arg3, arg1, arg0, var15.field2859, arg5);
            }
        }
        if (arg2 == 58) {
            class173 var16 = class173.method2625(arg1, arg0);
            if (var16 != null) {
                field329.method2565(117);
                field329.method2353(field442);
                field329.method2353(arg0);
                field329.method2501(var16.field2859);
                field329.method2361(Statics.field1227);
                field329.method2362(arg1);
                field329.method2513(field506);
            }
        }
        if (arg2 == 4) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(235);
            field329.method2501(arg3 >> 14 & 0x7FFF);
            field329.method2353(Statics.field77 + arg0);
            field329.method2513(Statics.field271 + arg1);
            field329.method2342(class137.field2125[82] ? 1 : 0);
        }
        if (arg2 == 20) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(46);
            field329.method2353(Statics.field271 + arg1);
            field329.method2501(Statics.field77 + arg0);
            field329.method2513(arg3);
            field329.method2343(class137.field2125[82] ? 1 : 0);
        }
        if (arg2 == 1005) {
            class173 var17 = class173.method81(arg1);
            if (var17 == null || var17.field2732[arg0] < 100000) {
                field329.method2565(41);
                field329.method2501(arg3);
            } else {
                class12.method2263(27, "", var17.field2732[arg0] + " x " + class52.method2933(arg3).field1124);
            }
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 12) {
            class35 var18 = field326[arg3];
            if (var18 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(167);
                field329.method2352(arg3);
                field329.method2342(class137.field2125[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var19 = field407[arg3];
            if (var19 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(82);
                field329.method2305(class137.field2125[82] ? 1 : 0);
                field329.method2513(arg3);
            }
        }
        if (arg2 == 1) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(101);
            field329.method2513(arg3 >> 14 & 0x7FFF);
            field329.method2353(Statics.field1004);
            field329.method2344(class137.field2125[82] ? 1 : 0);
            field329.method2308(Statics.field165);
            field329.method2513(Statics.field77 + arg0);
            field329.method2501(Statics.field1627);
            field329.method2353(Statics.field271 + arg1);
        }
        if (arg2 == 42) {
            field329.method2565(91);
            field329.method2363(arg1);
            field329.method2501(arg3);
            field329.method2352(arg0);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 50) {
            class3 var20 = field407[arg3];
            if (var20 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(87);
                field329.method2352(arg3);
                field329.method2343(class137.field2125[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field329.method2565(38);
            field329.method2308(arg1);
            class173 var21 = class173.method81(arg1);
            if (var21.field2764 != null && var21.field2764[0][0] == 5) {
                int var22 = var21.field2764[0][1];
                class176.field2896[var22] = 1 - class176.field2896[var22];
                method2979(var22);
            }
        }
        if (arg2 == 8) {
            class35 var23 = field326[arg3];
            if (var23 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(73);
                field329.method2513(arg3);
                field329.method2308(Statics.field1227);
                field329.method2343(class137.field2125[82] ? 1 : 0);
                field329.method2513(field506);
            }
        }
        if (arg2 == 37) {
            field329.method2565(44);
            field329.method2513(arg3);
            field329.method2308(arg1);
            field329.method2353(arg0);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 29) {
            field329.method2565(38);
            field329.method2308(arg1);
            class173 var24 = class173.method81(arg1);
            if (var24.field2764 != null && var24.field2764[0][0] == 5) {
                int var25 = var24.field2764[0][1];
                if (class176.field2896[var25] != var24.field2853[0]) {
                    class176.field2896[var25] = var24.field2853[0];
                    method2979(var25);
                }
            }
        }
        if (arg2 == 10) {
            class35 var26 = field326[arg3];
            if (var26 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(60);
                field329.method2352(arg3);
                field329.method2344(class137.field2125[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class173 var27 = class173.method2625(arg1, arg0);
            if (var27 != null) {
                method2008();
                int var28 = method39(var27);
                int var29 = var28 >> 11 & 0x3F;
                int var31 = var27.field2859;
                class173 var32 = class173.method2625(arg1, arg0);
                if (var32 != null && var32.field2830 != null) {
                    class1 var33 = new class1();
                    var33.field8 = var32;
                    var33.field6 = var32.field2830;
                    class37.method2637(var33);
                }
                field442 = var31;
                field496 = true;
                Statics.field1227 = arg1;
                field506 = arg0;
                Statics.field72 = var29;
                method2930(var32);
                field409 = 0;
                field443 = method2626(var27);
                if (field443 == null) {
                    field443 = "Null";
                }
                if (var27.field2740) {
                    field501 = var27.field2812 + class2.method3047(16777215);
                } else {
                    field501 = class2.method3047(65280) + var27.field2855 + class2.method3047(16777215);
                }
            }
            return;
        }
        if (arg2 == 1001) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(54);
            field329.method2501(arg3 >> 14 & 0x7FFF);
            field329.method2501(Statics.field77 + arg0);
            field329.method2344(class137.field2125[82] ? 1 : 0);
            field329.method2501(Statics.field271 + arg1);
        }
        if (arg2 == 41) {
            field329.method2565(108);
            field329.method2501(arg3);
            field329.method2352(arg0);
            field329.method2308(arg1);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 21) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(64);
            field329.method2501(Statics.field271 + arg1);
            field329.method2513(arg3);
            field329.method2352(Statics.field77 + arg0);
            field329.method2305(class137.field2125[82] ? 1 : 0);
        }
        if (arg2 == 33) {
            field329.method2565(183);
            field329.method2362(arg1);
            field329.method2513(arg0);
            field329.method2353(arg3);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 47) {
            class3 var34 = field407[arg3];
            if (var34 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(157);
                field329.method2353(arg3);
                field329.method2344(class137.field2125[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(47);
            field329.method2513(field506);
            field329.method2353(Statics.field271 + arg1);
            field329.method2305(class137.field2125[82] ? 1 : 0);
            field329.method2501(arg3);
            field329.method2352(Statics.field77 + arg0);
            field329.method2308(Statics.field1227);
        }
        if (arg2 == 36) {
            field329.method2565(160);
            field329.method2501(arg0);
            field329.method2308(arg1);
            field329.method2352(arg3);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 24) {
            class173 var35 = class173.method81(arg1);
            boolean var36 = true;
            if (var35.field2745 > 0) {
                var36 = Statics.method522(var35);
            }
            if (var36) {
                field329.method2565(38);
                field329.method2308(arg1);
            }
        }
        if (arg2 == 2) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(114);
            field329.method2353(arg3 >> 14 & 0x7FFF);
            field329.method2361(Statics.field1227);
            field329.method2501(field506);
            field329.method2352(Statics.field77 + arg0);
            field329.method2342(class137.field2125[82] ? 1 : 0);
            field329.method2353(Statics.field271 + arg1);
        }
        if (arg2 == 15) {
            class3 var37 = field407[arg3];
            if (var37 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(200);
                field329.method2501(field506);
                field329.method2344(class137.field2125[82] ? 1 : 0);
                field329.method2353(arg3);
                field329.method2361(Statics.field1227);
            }
        }
        if (arg2 == 39) {
            field329.method2565(212);
            field329.method2353(arg0);
            field329.method2362(arg1);
            field329.method2353(arg3);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 7) {
            class35 var38 = field326[arg3];
            if (var38 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(219);
                field329.method2344(class137.field2125[82] ? 1 : 0);
                field329.method2361(Statics.field165);
                field329.method2513(arg3);
                field329.method2501(Statics.field1627);
                field329.method2501(Statics.field1004);
            }
        }
        if (arg2 == 22) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(201);
            field329.method2343(class137.field2125[82] ? 1 : 0);
            field329.method2352(Statics.field77 + arg0);
            field329.method2513(arg3);
            field329.method2513(Statics.field271 + arg1);
        }
        if (arg2 == 3) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field519 = arg0;
            field520 = arg1;
            field329.method2565(190);
            field329.method2501(Statics.field77 + arg0);
            field329.method2344(class137.field2125[82] ? 1 : 0);
            field329.method2501(Statics.field271 + arg1);
            field329.method2501(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 11) {
            class35 var39 = field326[arg3];
            if (var39 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(161);
                field329.method2353(arg3);
                field329.method2343(class137.field2125[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class35 var40 = field326[arg3];
            if (var40 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(248);
                field329.method2343(class137.field2125[82] ? 1 : 0);
                field329.method2513(arg3);
            }
        }
        if (arg2 == 40) {
            field329.method2565(32);
            field329.method2513(arg3);
            field329.method2361(arg1);
            field329.method2353(arg0);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 1004) {
            field394 = arg6;
            field395 = arg7;
            field447 = 2;
            field485 = 0;
            field329.method2565(41);
            field329.method2501(arg3);
        }
        if (arg2 == 38) {
            method2008();
            class173 var41 = class173.method81(arg1);
            field409 = 1;
            Statics.field1004 = arg0;
            Statics.field165 = arg1;
            Statics.field1627 = arg3;
            method2930(var41);
            field439 = class2.method3047(16748608) + class52.method2933(arg3).field1124 + class2.method3047(16777215);
            if (field439 == null) {
                field439 = "null";
            }
            return;
        }
        if (arg2 == 31) {
            field329.method2565(214);
            field329.method2308(Statics.field165);
            field329.method2308(arg1);
            field329.method2352(Statics.field1004);
            field329.method2513(Statics.field1627);
            field329.method2513(arg0);
            field329.method2501(arg3);
            field398 = 0;
            Statics.field14 = class173.method81(arg1);
            field399 = arg0;
        }
        if (arg2 == 48) {
            class3 var42 = field407[arg3];
            if (var42 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(71);
                field329.method2343(class137.field2125[82] ? 1 : 0);
                field329.method2513(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var43 = field407[arg3];
            if (var43 != null) {
                field394 = arg6;
                field395 = arg7;
                field447 = 2;
                field485 = 0;
                field519 = arg0;
                field520 = arg1;
                field329.method2565(22);
                field329.method2501(Statics.field1627);
                field329.method2342(class137.field2125[82] ? 1 : 0);
                field329.method2501(Statics.field1004);
                field329.method2361(Statics.field165);
                field329.method2352(arg3);
            }
        }
        if (field409 != 0) {
            field409 = 0;
            method2930(class173.method81(Statics.field165));
        }
        if (field496) {
            method2008();
        }
        if (Statics.field14 != null && field398 == 0) {
            method2930(Statics.field14);
        }
    }

    @ObfuscatedName("cv.bw(I)V")
    public static void method2008() {
        if (!field496) {
            return;
        }
        class173 var0 = class173.method2625(Statics.field1227, field506);
        if (var0 != null && var0.field2747 != null) {
            class1 var1 = new class1();
            var1.field8 = var0;
            var1.field6 = var0.field2747;
            class37.method2637(var1);
        }
        field496 = false;
        method2930(var0);
    }

    @ObfuscatedName("da.bk(IIIILjava/lang/String;I)V")
    public static void method2635(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class173 var5 = class173.method2625(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2839 != null) {
            class1 var6 = new class1();
            var6.field8 = var5;
            var6.field3 = arg0;
            var6.field10 = arg4;
            var6.field6 = var5.field2839;
            class37.method2637(var6);
        }
        boolean var7 = true;
        if (var5.field2745 > 0) {
            var7 = Statics.method522(var5);
        }
        if (!var7 || !class178.method573(method39(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field329.method2565(76);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
        if (arg0 == 2) {
            field329.method2565(216);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
        if (arg0 == 3) {
            field329.method2565(184);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
        if (arg0 == 4) {
            field329.method2565(25);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
        if (arg0 == 5) {
            field329.method2565(69);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
        if (arg0 == 6) {
            field329.method2565(103);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
        if (arg0 == 7) {
            field329.method2565(50);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
        if (arg0 == 8) {
            field329.method2565(176);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
        if (arg0 == 9) {
            field329.method2565(119);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
        if (arg0 == 10) {
            field329.method2565(121);
            field329.method2308(arg1);
            field329.method2501(arg2);
            field329.method2501(arg3);
        }
    }

    @ObfuscatedName("h.bh(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field334 || field427 >= 500) {
            return;
        }
        field432[field427] = arg0;
        field433[field427] = arg1;
        field497[field427] = arg2;
        field347[field427] = arg3;
        field428[field427] = arg4;
        field429[field427] = arg5;
        field427++;
    }

    @ObfuscatedName("g.bn(S)V")
    public static void method175() {
        for (int var0 = 0; var0 < field427; var0++) {
            if (method703(field497[var0])) {
                if (var0 < field427 - 1) {
                    for (int var1 = var0; var1 < field427 - 1; var1++) {
                        field432[var1] = field432[var1 + 1];
                        field433[var1] = field433[var1 + 1];
                        field497[var1] = field497[var1 + 1];
                        field347[var1] = field347[var1 + 1];
                        field428[var1] = field428[var1 + 1];
                        field429[var1] = field429[var1 + 1];
                    }
                }
                field427--;
            }
        }
    }

    @ObfuscatedName("aa.bd(II)Z")
    public static boolean method703(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("f.cg(Lag;IIII)V")
    public static final void method91(class40 arg0, int arg1, int arg2, int arg3) {
        if (field427 >= 400) {
            return;
        }
        if (arg0.field898 != null) {
            arg0 = arg0.method731();
        }
        if (arg0 == null || !arg0.field889 || arg0.field890 && field453 != arg1) {
            return;
        }
        String var4 = arg0.field922;
        if (arg0.field910 != 0) {
            var4 = var4 + Statics.method809(arg0.field910, Statics.field2683.field36) + " " + class2.field19 + class157.field2452 + arg0.field910 + class2.field20;
        }
        if (field409 == 1) {
            method2(class157.field2446, field439 + " " + class2.field21 + " " + class2.method3047(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field496) {
            String[] var5 = arg0.field908;
            if (field456) {
                var5 = Statics.method1175(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2470)) {
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
                        method2(var5[var6], class2.method3047(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2470)) {
                        short var9 = 0;
                        if (field311 == class21.field578 || field311 == class21.field576 && arg0.field910 > Statics.field2683.field36) {
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
                        method2(var5[var8], class2.method3047(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2(class157.field2318, class2.method3047(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field72 & 0x2) == 2) {
            method2(field443, field501 + " " + class2.field21 + " " + class2.method3047(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("c.cm(Li;IIIB)V")
    public static final void method50(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2683 == arg0 || field427 >= 400) {
            return;
        }
        String var4;
        if (arg0.field37 == 0) {
            var4 = arg0.field56 + Statics.method809(arg0.field36, Statics.field2683.field36) + " " + class2.field19 + class157.field2452 + arg0.field36 + class2.field20;
        } else {
            var4 = arg0.field56 + " " + class2.field19 + class157.field2444 + arg0.field37 + class2.field20;
        }
        if (field409 == 1) {
            method2(class157.field2446, field439 + " " + class2.field21 + " " + class2.method3047(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field496) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field414[var5] != null) {
                    short var6 = 0;
                    if (field414[var5].equalsIgnoreCase(class157.field2470)) {
                        if (field311 == class21.field578 || field311 == class21.field576 && arg0.field36 > Statics.field2683.field36) {
                            var6 = 2000;
                        }
                        if (Statics.field2683.field50 != 0 && arg0.field50 != 0) {
                            if (Statics.field2683.field50 == arg0.field50) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field415[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field297[var5] + var6;
                    method2(field414[var5], class2.method3047(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field72 & 0x8) == 8) {
            method2(field443, field501 + " " + class2.field21 + " " + class2.method3047(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field427; var9++) {
            if (field497[var9] == 23) {
                field433[var9] = class2.method3047(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("fn.cb(IIIIIIIIB)V")
    public static final void method3236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method2942(arg0)) {
            Statics.field140 = null;
            method580(Statics.field2793[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field140 != null) {
                method580(Statics.field140, -1412584499, arg1, arg2, arg3, arg4, Statics.field65, Statics.field684, arg7);
                Statics.field140 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field554[var8] = true;
            }
        } else {
            field554[arg7] = true;
        }
    }

    @ObfuscatedName("e.ce([Lfu;IIIIIIIII)V")
    public static final void method580(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1679(arg2, arg3, arg4, arg5);
        class91.method1940();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2760 == arg1 || arg1 == -1412584499 && field458 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field493[field488] = var10.field2754 + arg6;
                    field494[field488] = var10.field2755 + arg7;
                    field495[field488] = var10.field2756;
                    field467[field488] = var10.field2757;
                    var11 = ++field488 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2870 = var11;
                var10.field2742 = field295;
                if (!var10.field2740 || !method120(var10)) {
                    if (var10.field2745 > 0) {
                        method756(var10);
                    }
                    int var12 = var10.field2754 + arg6;
                    int var13 = var10.field2755 + arg7;
                    int var14 = var10.field2752;
                    if (field458 == var10) {
                        if (arg1 != -1412584499 && !var10.field2817) {
                            Statics.field140 = arg0;
                            Statics.field65 = arg6;
                            Statics.field684 = arg7;
                            continue;
                        }
                        if (field289 && field463) {
                            int var15 = class140.field2163;
                            int var16 = class140.field2155;
                            int var17 = var15 - field460;
                            int var18 = var16 - field461;
                            if (var17 < field473) {
                                var17 = field473;
                            }
                            if (var10.field2756 + var17 > field473 + field420.field2756) {
                                var17 = field473 + field420.field2756 - var10.field2756;
                            }
                            if (var18 < field510) {
                                var18 = field510;
                            }
                            if (var10.field2757 + var18 > field510 + field420.field2757) {
                                var18 = field510 + field420.field2757 - var10.field2757;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2817) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2743 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2743 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2756 + var12;
                        int var26 = var10.field2757 + var13;
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
                        int var29 = var10.field2756 + var12;
                        int var30 = var10.field2757 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2740 || var19 < var21 && var20 < var22) {
                        if (var10.field2745 != 0) {
                            if (var10.field2745 == 1336) {
                                if (field301) {
                                    var13 += 15;
                                    Statics.field2071.method3735("Fps:" + field2197, var10.field2756 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field291) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field291) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2071.method3735("Mem:" + var32 + "k", var10.field2756 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2745 == 1337) {
                                field308 = var12;
                                field551 = var13;
                                method702(var12, var13, var10.field2756, var10.field2757);
                                field554[var10.field2870] = true;
                                class80.method1679(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2745 == 1338) {
                                method800();
                                class175 var34 = var10.method3169(false);
                                if (var34 != null) {
                                    class80.method1679(var12, var13, var34.field2883 + var12, var34.field2881 + var13);
                                    if (field541 == 2 || field541 == 5) {
                                        class80.method1672(var12, var13, 0, var34.field2892, var34.field2882);
                                    } else {
                                        int var35 = field371 + field358 & 0x7FF;
                                        int var36 = Statics.field2683.field861 / 32 + 48;
                                        int var37 = 464 - Statics.field2683.field818 / 32;
                                        Statics.field1014.method1633(var12, var13, var34.field2883, var34.field2881, var36, var37, var35, field359 + 256, var34.field2892, var34.field2882);
                                        for (int var38 = 0; var38 < field515; var38++) {
                                            int var39 = field516[var38] * 4 + 2 - Statics.field2683.field861 / 32;
                                            int var40 = field480[var38] * 4 + 2 - Statics.field2683.field818 / 32;
                                            method2616(var12, var13, var39, var40, field492[var38], var34);
                                        }
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= 104) {
                                                for (int var46 = 0; var46 < field316; var46++) {
                                                    class35 var47 = field326[field325[var46]];
                                                    if (var47 != null && var47.method14()) {
                                                        class40 var48 = var47.field785;
                                                        if (var48 != null && var48.field898 != null) {
                                                            var48 = var48.method731();
                                                        }
                                                        if (var48 != null && var48.field909 && var48.field889) {
                                                            int var49 = var47.field861 / 32 - Statics.field2683.field861 / 32;
                                                            int var50 = var47.field818 / 32 - Statics.field2683.field818 / 32;
                                                            method2616(var12, var13, var49, var50, Statics.field2052[1], var34);
                                                        }
                                                    }
                                                }
                                                int var51 = class33.field761;
                                                int[] var52 = class33.field765;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    class3 var54 = field407[var52[var53]];
                                                    if (var54 != null && var54.method14() && !var54.field51 && Statics.field2683 != var54) {
                                                        int var55 = var54.field861 / 32 - Statics.field2683.field861 / 32;
                                                        int var56 = var54.field818 / 32 - Statics.field2683.field818 / 32;
                                                        boolean var57 = false;
                                                        if (method838(var54.field56, true)) {
                                                            var57 = true;
                                                        }
                                                        boolean var58 = false;
                                                        for (int var59 = 0; var59 < Statics.field2229; var59++) {
                                                            if (var54.field56.equals(Statics.field174[var59].field621)) {
                                                                var58 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var60 = false;
                                                        if (Statics.field2683.field50 != 0 && var54.field50 != 0 && Statics.field2683.field50 == var54.field50) {
                                                            var60 = true;
                                                        }
                                                        if (var57) {
                                                            method2616(var12, var13, var55, var56, Statics.field2052[3], var34);
                                                        } else if (var60) {
                                                            method2616(var12, var13, var55, var56, Statics.field2052[4], var34);
                                                        } else if (var58) {
                                                            method2616(var12, var13, var55, var56, Statics.field2052[5], var34);
                                                        } else {
                                                            method2616(var12, var13, var55, var56, Statics.field2052[2], var34);
                                                        }
                                                    }
                                                }
                                                if (field303 != 0 && field295 % 20 < 10) {
                                                    if (field303 == 1 && field304 >= 0 && field304 < field326.length) {
                                                        class35 var61 = field326[field304];
                                                        if (var61 != null) {
                                                            int var62 = var61.field861 / 32 - Statics.field2683.field861 / 32;
                                                            int var63 = var61.field818 / 32 - Statics.field2683.field818 / 32;
                                                            method567(var12, var13, var62, var63, Statics.field363[1], var34);
                                                        }
                                                    }
                                                    if (field303 == 2) {
                                                        int var64 = field333 * 4 - Statics.field77 * 4 + 2 - Statics.field2683.field861 / 32;
                                                        int var65 = field307 * 4 - Statics.field271 * 4 + 2 - Statics.field2683.field818 / 32;
                                                        method567(var12, var13, var64, var65, Statics.field363[1], var34);
                                                    }
                                                    if (field303 == 10 && field305 >= 0 && field305 < field407.length) {
                                                        class3 var66 = field407[field305];
                                                        if (var66 != null) {
                                                            int var67 = var66.field861 / 32 - Statics.field2683.field861 / 32;
                                                            int var68 = var66.field818 / 32 - Statics.field2683.field818 / 32;
                                                            method567(var12, var13, var67, var68, Statics.field363[1], var34);
                                                        }
                                                    }
                                                }
                                                if (field519 != 0) {
                                                    int var69 = field519 * 4 + 2 - Statics.field2683.field861 / 32;
                                                    int var70 = field520 * 4 + 2 - Statics.field2683.field818 / 32;
                                                    method2616(var12, var13, var69, var70, Statics.field363[0], var34);
                                                }
                                                if (!Statics.field2683.field51) {
                                                    class80.method1663(var34.field2883 / 2 + var12 - 1, var34.field2881 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                class199 var43 = field418[Statics.field880][var41][var42];
                                                if (var43 != null) {
                                                    int var44 = var41 * 4 + 2 - Statics.field2683.field861 / 32;
                                                    int var45 = var42 * 4 + 2 - Statics.field2683.field818 / 32;
                                                    method2616(var12, var13, var44, var45, Statics.field2052[0], var34);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    field491[var11] = true;
                                }
                                class80.method1679(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2745 == 1339) {
                                method574(var10, var12, var13, var11);
                                class80.method1679(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2743 == 0) {
                            if (!var10.field2740 && method120(var10) && Statics.field2632 != var10) {
                                continue;
                            }
                            if (!var10.field2740) {
                                if (var10.field2763 > var10.field2765 - var10.field2757) {
                                    var10.field2763 = var10.field2765 - var10.field2757;
                                }
                                if (var10.field2763 < 0) {
                                    var10.field2763 = 0;
                                }
                            }
                            method580(arg0, var10.field2741, var19, var20, var21, var22, var12 - var10.field2762, var13 - var10.field2763, var11);
                            if (var10.field2863 != null) {
                                method580(var10.field2863, var10.field2741, var19, var20, var21, var22, var12 - var10.field2762, var13 - var10.field2763, var11);
                            }
                            class4 var71 = (class4) field446.method3519((long) var10.field2741);
                            if (var71 != null) {
                                method3236(var71.field60, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1679(arg2, arg3, arg4, arg5);
                            class91.method1940();
                        }
                        if (field403 || field441[var11] || field465 > 1) {
                            if (var10.field2743 == 0 && !var10.field2740 && var10.field2765 > var10.field2757) {
                                int var72 = var10.field2756 + var12;
                                int var73 = var10.field2763;
                                int var74 = var10.field2757;
                                int var75 = var10.field2765;
                                Statics.field774[0].method1721(var72, var13);
                                Statics.field774[1].method1721(var72, var13 + var74 - 16);
                                class80.method1663(var72, var13 + 16, 16, var74 - 32, field364);
                                int var76 = (var74 - 32) * var74 / var75;
                                if (var76 < 8) {
                                    var76 = 8;
                                }
                                int var77 = (var74 - 32 - var76) * var73 / (var75 - var74);
                                class80.method1663(var72, var13 + 16 + var77, 16, var76, field561);
                                class80.method1654(var72, var13 + 16 + var77, var76, field474);
                                class80.method1654(var72 + 1, var13 + 16 + var77, var76, field474);
                                class80.method1671(var72, var13 + 16 + var77, 16, field474);
                                class80.method1671(var72, var13 + 17 + var77, 16, field474);
                                class80.method1654(var72 + 15, var13 + 16 + var77, var76, field401);
                                class80.method1654(var72 + 14, var13 + 17 + var77, var76 - 1, field401);
                                class80.method1671(var72, var13 + 15 + var77 + var76, 16, field401);
                                class80.method1671(var72 + 1, var13 + 14 + var77 + var76, 15, field401);
                            }
                            if (var10.field2743 != 1) {
                                if (var10.field2743 == 2) {
                                    int var78 = 0;
                                    for (int var79 = 0; var79 < var10.field2753; var79++) {
                                        for (int var80 = 0; var80 < var10.field2748; var80++) {
                                            int var81 = (var10.field2805 + 32) * var80 + var12;
                                            int var82 = (var10.field2806 + 32) * var79 + var13;
                                            if (var78 < 20) {
                                                var81 += var10.field2850[var78];
                                                var82 += var10.field2771[var78];
                                            }
                                            if (var10.field2857[var78] > 0) {
                                                boolean var83 = false;
                                                boolean var84 = false;
                                                int var85 = var10.field2857[var78] - 1;
                                                if (var81 + 32 > arg2 && var81 < arg4 && var82 + 32 > arg3 && var82 < arg5 || Statics.field2585 == var10 && field400 == var78) {
                                                    class79 var86;
                                                    if (field409 == 1 && Statics.field1004 == var78 && Statics.field165 == var10.field2741) {
                                                        var86 = class52.method2820(var85, var10.field2732[var78], 2, 0, 2, false);
                                                    } else {
                                                        var86 = class52.method2820(var85, var10.field2732[var78], 1, 3153952, 2, false);
                                                    }
                                                    if (var86 == null) {
                                                        method2930(var10);
                                                    } else if (Statics.field2585 == var10 && field400 == var78) {
                                                        int var87 = class140.field2163 - field365;
                                                        int var88 = class140.field2155 - field402;
                                                        if (var87 < 5 && var87 > -5) {
                                                            var87 = 0;
                                                        }
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (field405 < 5) {
                                                            var87 = 0;
                                                            var88 = 0;
                                                        }
                                                        var86.method1626(var81 + var87, var82 + var88, 128);
                                                        if (arg1 != -1) {
                                                            class173 var89 = arg0[arg1 & 0xFFFF];
                                                            if (var82 + var88 < class80.field1427 && var89.field2763 > 0) {
                                                                int var90 = field351 * (class80.field1427 - var82 - var88) / 3;
                                                                if (var90 > field351 * 10) {
                                                                    var90 = field351 * 10;
                                                                }
                                                                if (var90 > var89.field2763) {
                                                                    var90 = var89.field2763;
                                                                }
                                                                var89.field2763 -= var90;
                                                                field402 += var90;
                                                                method2930(var89);
                                                            }
                                                            if (var82 + var88 + 32 > class80.field1426 && var89.field2763 < var89.field2765 - var89.field2757) {
                                                                int var91 = field351 * (var82 + var88 + 32 - class80.field1426) / 3;
                                                                if (var91 > field351 * 10) {
                                                                    var91 = field351 * 10;
                                                                }
                                                                if (var91 > var89.field2765 - var89.field2757 - var89.field2763) {
                                                                    var91 = var89.field2765 - var89.field2757 - var89.field2763;
                                                                }
                                                                var89.field2763 += var91;
                                                                field402 -= var91;
                                                                method2930(var89);
                                                            }
                                                        }
                                                    } else if (Statics.field14 == var10 && field399 == var78) {
                                                        var86.method1626(var81, var82, 128);
                                                    } else {
                                                        var86.method1589(var81, var82);
                                                    }
                                                }
                                            } else if (var10.field2809 != null && var78 < 20) {
                                                class79 var92 = var10.method3148(var78);
                                                if (var92 != null) {
                                                    var92.method1589(var81, var82);
                                                } else if (class173.field2769) {
                                                    method2930(var10);
                                                }
                                            }
                                            var78++;
                                        }
                                    }
                                } else if (var10.field2743 == 3) {
                                    int var93;
                                    if (method2750(var10)) {
                                        var93 = var10.field2767;
                                        if (Statics.field2632 == var10 && var10.field2750 != 0) {
                                            var93 = var10.field2750;
                                        }
                                    } else {
                                        var93 = var10.field2766;
                                        if (Statics.field2632 == var10 && var10.field2772 != 0) {
                                            var93 = var10.field2772;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2770) {
                                            class80.method1663(var12, var13, var10.field2756, var10.field2757, var93);
                                        } else {
                                            class80.method1689(var12, var13, var10.field2756, var10.field2757, var93);
                                        }
                                    } else if (var10.field2770) {
                                        class80.method1662(var12, var13, var10.field2756, var10.field2757, var93, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1705(var12, var13, var10.field2756, var10.field2757, var93, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2743 == 4) {
                                    class224 var94 = var10.method3147();
                                    if (var94 != null) {
                                        String var95 = var10.field2799;
                                        int var96;
                                        if (method2750(var10)) {
                                            var96 = var10.field2767;
                                            if (Statics.field2632 == var10 && var10.field2750 != 0) {
                                                var96 = var10.field2750;
                                            }
                                            if (var10.field2800.length() > 0) {
                                                var95 = var10.field2800;
                                            }
                                        } else {
                                            var96 = var10.field2766;
                                            if (Statics.field2632 == var10 && var10.field2772 != 0) {
                                                var96 = var10.field2772;
                                            }
                                        }
                                        if (var10.field2740 && var10.field2859 != -1) {
                                            class52 var97 = class52.method2933(var10.field2859);
                                            var95 = var97.field1124;
                                            if (var95 == null) {
                                                var95 = "null";
                                            }
                                            if ((var97.field1135 == 1 || var10.field2860 != 1) && var10.field2860 != -1) {
                                                var95 = class2.method3047(16748608) + var95 + class2.field23 + " " + 'x' + method549(var10.field2860);
                                            }
                                        }
                                        if (field449 == var10) {
                                            class157 var10000 = (class157) null;
                                            var95 = class157.field2381;
                                            var96 = var10.field2766;
                                        }
                                        if (!var10.field2740) {
                                            var95 = method1747(var95, var10);
                                        }
                                        var94.method3737(var95, var12, var13, var10.field2756, var10.field2757, var96, var10.field2804 ? 0 : -1, var10.field2802, var10.field2803, var10.field2837);
                                    } else if (class173.field2769) {
                                        method2930(var10);
                                    }
                                } else if (var10.field2743 == 5) {
                                    if (var10.field2740) {
                                        class79 var99;
                                        if (var10.field2859 == -1) {
                                            var99 = var10.method3146(false);
                                        } else {
                                            var99 = class52.method2820(var10.field2859, var10.field2860, var10.field2778, var10.field2801, var10.field2797, false);
                                        }
                                        if (var99 != null) {
                                            int var100 = var99.field1415;
                                            int var101 = var99.field1413;
                                            if (var10.field2777) {
                                                class80.method1658(var12, var13, var10.field2756 + var12, var10.field2757 + var13);
                                                int var102 = (var10.field2756 + (var100 - 1)) / var100;
                                                int var103 = (var10.field2757 + (var101 - 1)) / var101;
                                                for (int var104 = 0; var104 < var102; var104++) {
                                                    for (int var105 = 0; var105 < var103; var105++) {
                                                        if (var10.field2776 != 0) {
                                                            var99.method1590(var100 / 2 + var100 * var104 + var12, var101 / 2 + var101 * var105 + var13, var10.field2776, 4096);
                                                        } else if (var14 == 0) {
                                                            var99.method1589(var100 * var104 + var12, var101 * var105 + var13);
                                                        } else {
                                                            var99.method1626(var100 * var104 + var12, var101 * var105 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1679(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var106 = var10.field2756 * 4096 / var100;
                                                if (var10.field2776 != 0) {
                                                    var99.method1590(var10.field2756 / 2 + var12, var10.field2757 / 2 + var13, var10.field2776, var106);
                                                } else if (var14 != 0) {
                                                    var99.method1586(var12, var13, var10.field2756, var10.field2757, 256 - (var14 & 0xFF));
                                                } else if (var10.field2756 == var100 && var10.field2757 == var101) {
                                                    var99.method1589(var12, var13);
                                                } else {
                                                    var99.method1580(var12, var13, var10.field2756, var10.field2757);
                                                }
                                            }
                                        } else if (class173.field2769) {
                                            method2930(var10);
                                        }
                                    } else {
                                        class79 var98 = var10.method3146(method2750(var10));
                                        if (var98 != null) {
                                            var98.method1589(var12, var13);
                                        } else if (class173.field2769) {
                                            method2930(var10);
                                        }
                                    }
                                } else if (var10.field2743 == 6) {
                                    boolean var107 = method2750(var10);
                                    int var108;
                                    if (var107) {
                                        var108 = var10.field2787;
                                    } else {
                                        var108 = var10.field2814;
                                    }
                                    class105 var109 = null;
                                    int var110 = 0;
                                    if (var10.field2859 != -1) {
                                        class52 var111 = class52.method2933(var10.field2859);
                                        if (var111 != null) {
                                            class52 var112 = var111.method981(var10.field2860);
                                            var109 = var112.method980(1);
                                            if (var109 == null) {
                                                method2930(var10);
                                            } else {
                                                var109.method2121();
                                                var110 = var109.field1458 / 2;
                                            }
                                        }
                                    } else if (var10.field2782 == 5) {
                                        if (var10.field2783 == 0) {
                                            var109 = field558.method3246((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var109 = Statics.field2683.method34();
                                        }
                                    } else if (var108 == -1) {
                                        var109 = var10.method3152((class43) null, -1, var107, Statics.field2683.field32);
                                        if (var109 == null && class173.field2769) {
                                            method2930(var10);
                                        }
                                    } else {
                                        class43 var113 = class43.method2257(var108);
                                        var109 = var10.method3152(var113, var10.field2739, var107, Statics.field2683.field32);
                                        if (var109 == null && class173.field2769) {
                                            method2930(var10);
                                        }
                                    }
                                    class91.method1943(var10.field2756 / 2 + var12, var10.field2757 / 2 + var13);
                                    int var114 = var10.field2871 * class91.field1561[var10.field2790] >> 16;
                                    int var115 = var10.field2871 * class91.field1585[var10.field2790] >> 16;
                                    if (var109 != null) {
                                        if (var10.field2740) {
                                            var109.method2121();
                                            if (var10.field2796) {
                                                var109.method2133(0, var10.field2791, var10.field2865, var10.field2790, var10.field2864, var10.field2789 + var110 + var114, var10.field2789 + var115, var10.field2871);
                                            } else {
                                                var109.method2132(0, var10.field2791, var10.field2865, var10.field2790, var10.field2864, var10.field2789 + var110 + var114, var10.field2789 + var115);
                                            }
                                        } else {
                                            var109.method2132(0, var10.field2791, 0, var10.field2790, 0, var114, var115);
                                        }
                                    }
                                    class91.method1942();
                                } else {
                                    if (var10.field2743 == 7) {
                                        class224 var116 = var10.method3147();
                                        if (var116 == null) {
                                            if (class173.field2769) {
                                                method2930(var10);
                                            }
                                            continue;
                                        }
                                        int var117 = 0;
                                        for (int var118 = 0; var118 < var10.field2753; var118++) {
                                            for (int var119 = 0; var119 < var10.field2748; var119++) {
                                                if (var10.field2857[var117] > 0) {
                                                    class52 var120 = class52.method2933(var10.field2857[var117] - 1);
                                                    String var121;
                                                    if (var120.field1135 != 1 && var10.field2732[var117] == 1) {
                                                        var121 = class2.method3047(16748608) + var120.field1124 + class2.field23;
                                                    } else {
                                                        var121 = class2.method3047(16748608) + var120.field1124 + class2.field23 + " " + 'x' + method549(var10.field2732[var117]);
                                                    }
                                                    int var122 = (var10.field2805 + 115) * var119 + var12;
                                                    int var123 = (var10.field2806 + 12) * var118 + var13;
                                                    if (var10.field2802 == 0) {
                                                        var116.method3734(var121, var122, var123, var10.field2766, var10.field2804 ? 0 : -1);
                                                    } else if (var10.field2802 == 1) {
                                                        var116.method3788(var121, var10.field2756 / 2 + var122, var123, var10.field2766, var10.field2804 ? 0 : -1);
                                                    } else {
                                                        var116.method3735(var121, var10.field2756 + var122 - 1, var123, var10.field2766, var10.field2804 ? 0 : -1);
                                                    }
                                                }
                                                var117++;
                                            }
                                        }
                                    }
                                    if (var10.field2743 == 8 && Statics.field3061 == var10 && field437 == field436) {
                                        int var124 = 0;
                                        int var125 = 0;
                                        class224 var126 = Statics.field2071;
                                        String var127 = var10.field2799;
                                        String var128 = method1747(var127, var10);
                                        while (var128.length() > 0) {
                                            int var129 = var128.indexOf(class2.field22);
                                            String var130;
                                            if (var129 == -1) {
                                                var130 = var128;
                                                var128 = "";
                                            } else {
                                                var130 = var128.substring(0, var129);
                                                var128 = var128.substring(var129 + 4);
                                            }
                                            int var131 = var126.method3729(var130);
                                            if (var131 > var124) {
                                                var124 = var131;
                                            }
                                            var125 += var126.field3164 + 1;
                                        }
                                        var124 += 6;
                                        var125 += 7;
                                        int var132 = var10.field2756 + var12 - 5 - var124;
                                        int var133 = var10.field2757 + var13 + 5;
                                        if (var132 < var12 + 5) {
                                            var132 = var12 + 5;
                                        }
                                        if (var124 + var132 > arg4) {
                                            var132 = arg4 - var124;
                                        }
                                        if (var125 + var133 > arg5) {
                                            var133 = arg5 - var125;
                                        }
                                        class80.method1663(var132, var133, var124, var125, 16777120);
                                        class80.method1689(var132, var133, var124, var125, 0);
                                        String var134 = var10.field2799;
                                        int var135 = var126.field3164 + var133 + 2;
                                        String var136 = method1747(var134, var10);
                                        while (var136.length() > 0) {
                                            int var137 = var136.indexOf(class2.field22);
                                            String var138;
                                            if (var137 == -1) {
                                                var138 = var136;
                                                var136 = "";
                                            } else {
                                                var138 = var136.substring(0, var137);
                                                var136 = var136.substring(var137 + 4);
                                            }
                                            var126.method3734(var138, var132 + 3, var135, 0, -1);
                                            var135 += var126.field3164 + 1;
                                        }
                                    }
                                    if (var10.field2743 == 9) {
                                        if (var10.field2831 == 1) {
                                            int var139;
                                            int var140;
                                            int var141;
                                            int var142;
                                            if (var10.field2773) {
                                                var139 = var12;
                                                var140 = var10.field2757 + var13;
                                                var141 = var10.field2756 + var12;
                                                var142 = var13;
                                            } else {
                                                var139 = var12;
                                                var140 = var13;
                                                var141 = var10.field2756 + var12;
                                                var142 = var10.field2757 + var13;
                                            }
                                            class80.method1701(var139, var140, var141, var142, var10.field2766);
                                        } else {
                                            int var143 = var10.field2756 >= 0 ? var10.field2756 : -var10.field2756;
                                            int var144 = var10.field2757 >= 0 ? var10.field2757 : -var10.field2757;
                                            int var145 = var143;
                                            if (var143 < var144) {
                                                var145 = var144;
                                            }
                                            if (var145 != 0) {
                                                int var146 = (var10.field2756 << 16) / var145;
                                                int var147 = (var10.field2757 << 16) / var145;
                                                if (var147 <= var146) {
                                                    var146 = -var146;
                                                } else {
                                                    var147 = -var147;
                                                }
                                                int var148 = var10.field2831 * var147 >> 17;
                                                int var149 = var10.field2831 * var147 + 1 >> 17;
                                                int var150 = var10.field2831 * var146 >> 17;
                                                int var151 = var10.field2831 * var146 + 1 >> 17;
                                                int var152 = var12 + var148;
                                                int var153 = var12 - var149;
                                                int var154 = var10.field2756 + var12 - var149;
                                                int var155 = var10.field2756 + var12 + var148;
                                                int var156 = var13 + var150;
                                                int var157 = var13 - var151;
                                                int var158 = var10.field2757 + var13 - var151;
                                                int var159 = var10.field2757 + var13 + var150;
                                                class91.method1966(var152, var153, var154);
                                                class91.method1950(var156, var157, var158, var152, var153, var154, var10.field2766);
                                                class91.method1966(var152, var154, var155);
                                                class91.method1950(var156, var158, var159, var152, var154, var155, var10.field2766);
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

    @ObfuscatedName("co.co(Ljava/lang/String;Lfu;B)Ljava/lang/String;")
    public static String method1747(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2908(method690(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2282 != null) {
                    int var6 = Statics.field2282.field2211;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field2282.field2219 != null) {
                        var5 = (String) Statics.field2282.field2219;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("d.cz(IB)Ljava/lang/String;")
    public static final String method549(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3047(65408) + var1.substring(0, var1.length() - 8) + class157.field2457 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method3047(16777215) + var1.substring(0, var1.length() - 4) + class157.field2459 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else {
            return " " + class2.method3047(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("co.ci(Lfu;I)V")
    public static void method1748(class173 arg0) {
        class173 var1 = arg0.field2760 == -1 ? null : class173.method81(arg0.field2760);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field999;
            var3 = Statics.field1605;
        } else {
            var2 = var1.field2756;
            var3 = var1.field2757;
        }
        method40(arg0, var2, var3, false);
        method1558(arg0, var2, var3);
    }

    @ObfuscatedName("ds.ck([Lfu;Lfu;ZI)V")
    public static void method2255(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2815 == 0 ? arg1.field2756 : arg1.field2815;
        int var4 = arg1.field2765 == 0 ? arg1.field2757 : arg1.field2765;
        method1937(arg0, arg1.field2741, var3, var4, arg2);
        if (arg1.field2863 != null) {
            method1937(arg1.field2863, arg1.field2741, var3, var4, arg2);
        }
        class4 var5 = (class4) field446.method3519((long) arg1.field2741);
        if (var5 != null) {
            int var6 = var5.field60;
            if (class173.method2942(var6)) {
                method1937(Statics.field2793[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2745 == 1337) {
        }
    }

    @ObfuscatedName("cs.ct([Lfu;IIIZI)V")
    public static void method1937(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2760 == arg1) {
                method40(var6, arg2, arg3, arg4);
                method1558(var6, arg2, arg3);
                if (var6.field2762 > var6.field2815 - var6.field2756) {
                    var6.field2762 = var6.field2815 - var6.field2756;
                }
                if (var6.field2762 < 0) {
                    var6.field2762 = 0;
                }
                if (var6.field2763 > var6.field2765 - var6.field2757) {
                    var6.field2763 = var6.field2765 - var6.field2757;
                }
                if (var6.field2763 < 0) {
                    var6.field2763 = 0;
                }
                if (var6.field2743 == 0) {
                    method2255(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("p.cd(Lfu;IIZI)V")
    public static void method40(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2756;
        int var5 = arg0.field2757;
        if (arg0.field2736 == 0) {
            arg0.field2756 = arg0.field2748;
        } else if (arg0.field2736 == 1) {
            arg0.field2756 = arg1 - arg0.field2748;
        } else if (arg0.field2736 == 2) {
            arg0.field2756 = arg0.field2748 * arg1 >> 14;
        }
        if (arg0.field2749 == 0) {
            arg0.field2757 = arg0.field2753;
        } else if (arg0.field2749 == 1) {
            arg0.field2757 = arg2 - arg0.field2753;
        } else if (arg0.field2749 == 2) {
            arg0.field2757 = arg0.field2753 * arg2 >> 14;
        }
        if (arg0.field2736 == 4) {
            arg0.field2756 = arg0.field2758 * arg0.field2757 / arg0.field2759;
        }
        if (arg0.field2749 == 4) {
            arg0.field2757 = arg0.field2759 * arg0.field2756 / arg0.field2758;
        }
        if (field431 && arg0.field2743 == 0) {
            if (arg0.field2757 < 5 && arg0.field2756 < 5) {
                arg0.field2757 = 5;
                arg0.field2756 = 5;
            } else {
                if (arg0.field2757 <= 0) {
                    arg0.field2757 = 5;
                }
                if (arg0.field2756 <= 0) {
                    arg0.field2756 = 5;
                }
            }
        }
        if (arg0.field2745 == 1337) {
            field457 = arg0;
        }
        if (arg3 && arg0.field2788 != null && (arg0.field2756 != var4 || arg0.field2757 != var5)) {
            class1 var6 = new class1();
            var6.field8 = arg0;
            var6.field6 = arg0.field2788;
            field484.method3541(var6);
        }
    }

    @ObfuscatedName("bn.cs(Lfu;III)V")
    public static void method1558(class173 arg0, int arg1, int arg2) {
        if (arg0.field2832 == 0) {
            arg0.field2754 = arg0.field2848;
        } else if (arg0.field2832 == 1) {
            arg0.field2754 = (arg1 - arg0.field2756) / 2 + arg0.field2848;
        } else if (arg0.field2832 == 2) {
            arg0.field2754 = arg1 - arg0.field2756 - arg0.field2848;
        } else if (arg0.field2832 == 3) {
            arg0.field2754 = arg0.field2848 * arg1 >> 14;
        } else if (arg0.field2832 == 4) {
            arg0.field2754 = (arg0.field2848 * arg1 >> 14) + (arg1 - arg0.field2756) / 2;
        } else {
            arg0.field2754 = arg1 - arg0.field2756 - (arg0.field2848 * arg1 >> 14);
        }
        if (arg0.field2780 == 0) {
            arg0.field2755 = arg0.field2751;
        } else if (arg0.field2780 == 1) {
            arg0.field2755 = (arg2 - arg0.field2757) / 2 + arg0.field2751;
        } else if (arg0.field2780 == 2) {
            arg0.field2755 = arg2 - arg0.field2757 - arg0.field2751;
        } else if (arg0.field2780 == 3) {
            arg0.field2755 = arg0.field2751 * arg2 >> 14;
        } else if (arg0.field2780 == 4) {
            arg0.field2755 = (arg0.field2751 * arg2 >> 14) + (arg2 - arg0.field2757) / 2;
        } else {
            arg0.field2755 = arg2 - arg0.field2757 - (arg0.field2751 * arg2 >> 14);
        }
        if (!field431 || arg0.field2743 != 0) {
            return;
        }
        if (arg0.field2754 < 0) {
            arg0.field2754 = 0;
        } else if (arg0.field2756 + arg0.field2754 > arg1) {
            arg0.field2754 = arg1 - arg0.field2756;
        }
        if (arg0.field2755 < 0) {
            arg0.field2755 = 0;
        } else if (arg0.field2757 + arg0.field2755 > arg2) {
            arg0.field2755 = arg2 - arg0.field2757;
        }
    }

    @ObfuscatedName("ed.cw(II)Ljava/lang/String;")
    public static final String method2908(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ei.cu(Lfu;I)Z")
    public static final boolean method2750(class173 arg0) {
        if (arg0.field2852 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2852.length; var1++) {
            int var2 = method690(arg0, var1);
            int var3 = arg0.field2853[var1];
            if (arg0.field2852[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2852[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2852[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("av.cv(Lfu;II)I")
    public static final int method690(class173 arg0, int arg1) {
        if (arg0.field2764 == null || arg1 >= arg0.field2764.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2764[arg1];
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
                    var7 = field379[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field392[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field440[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method81(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method2933(var12).field1128 || field290)) {
                        for (int var13 = 0; var13 < var11.field2857.length; var13++) {
                            if (var12 + 1 == var11.field2857[var13]) {
                                var7 += var11.field2732[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2896[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2281[field392[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2896[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2683.field36;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2283[var14]) {
                            var7 += field392[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method81(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method2933(var18).field1128 || field290)) {
                        for (int var19 = 0; var19 < var17.field2857.length; var19++) {
                            if (var18 + 1 == var17.field2857[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field462;
                }
                if (var6 == 12) {
                    var7 = field451;
                }
                if (var6 == 13) {
                    int var20 = class176.field2896[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method624(var22);
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
                    var7 = (Statics.field2683.field861 >> 7) + Statics.field77;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2683.field818 >> 7) + Statics.field271;
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

    @ObfuscatedName("ak.cr(IIIIIIII)V")
    public static final void method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class173.method2942(arg0)) {
            method1180(Statics.field2793[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("bj.cx([Lfu;IIIIIIII)V")
    public static final void method1180(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2740 || var9.field2743 == 0 || var9.field2819 || method39(var9) != 0 || field420 == var9 || var9.field2745 == 1338) && var9.field2760 == arg1 && (!var9.field2740 || !method120(var9))) {
                int var10 = var9.field2754 + arg6;
                int var11 = var9.field2755 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2743 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2743 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2756 + var10;
                    int var19 = var9.field2757 + var11;
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
                    int var22 = var9.field2756 + var10;
                    int var23 = var9.field2757 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field458 == var9) {
                    field466 = true;
                    field342 = var10;
                    field468 = var11;
                }
                if (!var9.field2740 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2163;
                    int var25 = class140.field2155;
                    if (class140.field2160 != 0) {
                        var24 = class140.field2161;
                        var25 = class140.field2151;
                    }
                    if (var9.field2745 == 1337) {
                        if (!field294 && !field334 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field409 == 0 && !field496) {
                                method2(class157.field2451, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1850; var28++) {
                                int var29 = class105.field1851[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field184.method1858(Statics.field880, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method961(var33);
                                        if (var34.field970 != null) {
                                            var34 = var34.method766();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field409 == 1) {
                                            method2(class157.field2446, field439 + " " + class2.field21 + " " + class2.method3047(65535) + var34.field978, 1, var29, var30, var31);
                                        } else if (!field496) {
                                            String[] var35 = var34.field956;
                                            if (field456) {
                                                var35 = Statics.method1175(var35);
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
                                                        method2(var35[var36], class2.method3047(65535) + var34.field978, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2(class157.field2318, class2.method3047(65535) + var34.field978, 1002, var34.field936 << 14, var30, var31);
                                        } else if ((Statics.field72 & 0x4) == 4) {
                                            method2(field443, field501 + " " + class2.field21 + " " + class2.method3047(65535) + var34.field978, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field326[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field785.field894 == 1 && (var38.field861 & 0x7F) == 64 && (var38.field818 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field316; var39++) {
                                                class35 var40 = field326[field325[var39]];
                                                if (var40 != null && var38 != var40 && var40.field785.field894 == 1 && var38.field861 == var40.field861 && var38.field818 == var40.field818) {
                                                    method91(var40.field785, field325[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field761;
                                            int[] var42 = class33.field765;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field407[var42[var43]];
                                                if (var44 != null && var38.field861 == var44.field861 && var38.field818 == var44.field818) {
                                                    method50(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method91(var38.field785, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field407[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field861 & 0x7F) == 64 && (var45.field818 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field316; var46++) {
                                                class35 var47 = field326[field325[var46]];
                                                if (var47 != null && var47.field785.field894 == 1 && var45.field861 == var47.field861 && var45.field818 == var47.field818) {
                                                    method91(var47.field785, field325[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field761;
                                            int[] var49 = class33.field765;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field407[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field861 == var51.field861 && var45.field818 == var51.field818) {
                                                    method50(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field509 == var33) {
                                            var26 = var29;
                                        } else {
                                            method50(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field418[Statics.field880][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3547(); var53 != null; var53 = (class29) var52.method3549()) {
                                                class52 var54 = class52.method2933(var53.field688);
                                                if (field409 == 1) {
                                                    method2(class157.field2446, field439 + " " + class2.field21 + " " + class2.method3047(16748608) + var54.field1124, 16, var53.field688, var30, var31);
                                                } else if (!field496) {
                                                    String[] var55 = var54.field1138;
                                                    if (field456) {
                                                        var55 = Statics.method1175(var55);
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
                                                            method2(var55[var56], class2.method3047(16748608) + var54.field1124, var57, var53.field688, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method2(class157.field2296, class2.method3047(16748608) + var54.field1124, 20, var53.field688, var30, var31);
                                                        }
                                                    }
                                                    method2(class157.field2318, class2.method3047(16748608) + var54.field1124, 1004, var53.field688, var30, var31);
                                                } else if ((Statics.field72 & 0x1) == 1) {
                                                    method2(field443, field501 + " " + class2.field21 + " " + class2.method3047(16748608) + var54.field1124, 17, var53.field688, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field407[field509];
                                method50(var60, field509, var58, var59);
                            }
                        }
                    } else if (var9.field2745 == 1338) {
                        method2994(var9, var10, var11);
                    } else {
                        if (!field334 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var61 = var24 - var10;
                            int var62 = var25 - var11;
                            if (var9.field2779 == 1) {
                                method2(var9.field2827, "", 24, 0, 0, var9.field2741);
                            }
                            if (var9.field2779 == 2 && !field496) {
                                String var63 = method2626(var9);
                                if (var63 != null) {
                                    method2(var63, class2.method3047(65280) + var9.field2855, 25, 0, -1, var9.field2741);
                                }
                            }
                            if (var9.field2779 == 3) {
                                method2(class157.field2479, "", 26, 0, 0, var9.field2741);
                            }
                            if (var9.field2779 == 4) {
                                method2(var9.field2827, "", 28, 0, 0, var9.field2741);
                            }
                            if (var9.field2779 == 5) {
                                method2(var9.field2827, "", 29, 0, 0, var9.field2741);
                            }
                            if (var9.field2779 == 6 && field449 == null) {
                                method2(var9.field2827, "", 30, 0, -1, var9.field2741);
                            }
                            if (var9.field2743 == 2) {
                                int var64 = 0;
                                for (int var65 = 0; var65 < var9.field2757; var65++) {
                                    for (int var66 = 0; var66 < var9.field2756; var66++) {
                                        int var67 = (var9.field2805 + 32) * var66;
                                        int var68 = (var9.field2806 + 32) * var65;
                                        if (var64 < 20) {
                                            var67 += var9.field2850[var64];
                                            var68 += var9.field2771[var64];
                                        }
                                        if (var61 >= var67 && var62 >= var68 && var61 < var67 + 32 && var62 < var68 + 32) {
                                            field413 = var64;
                                            Statics.field1891 = var9;
                                            if (var9.field2857[var64] > 0) {
                                                label1353: {
                                                    class52 var69 = class52.method2933(var9.field2857[var64] - 1);
                                                    if (field409 == 1) {
                                                        int var70 = method39(var9);
                                                        boolean var71 = (var70 >> 30 & 0x1) != 0;
                                                        if (var71) {
                                                            if (Statics.field165 != var9.field2741 || Statics.field1004 != var64) {
                                                                method2(class157.field2446, field439 + " " + class2.field21 + " " + class2.method3047(16748608) + var69.field1124, 31, var69.field1151, var64, var9.field2741);
                                                            }
                                                            break label1353;
                                                        }
                                                    }
                                                    if (field496) {
                                                        int var72 = method39(var9);
                                                        boolean var73 = (var72 >> 30 & 0x1) != 0;
                                                        if (var73) {
                                                            if ((Statics.field72 & 0x10) == 16) {
                                                                method2(field443, field501 + " " + class2.field21 + " " + class2.method3047(16748608) + var69.field1124, 32, var69.field1151, var64, var9.field2741);
                                                            }
                                                            break label1353;
                                                        }
                                                    }
                                                    String[] var74 = var69.field1139;
                                                    if (field456) {
                                                        var74 = Statics.method1175(var74);
                                                    }
                                                    int var75 = method39(var9);
                                                    boolean var76 = (var75 >> 30 & 0x1) != 0;
                                                    if (var76) {
                                                        for (int var77 = 4; var77 >= 3; var77--) {
                                                            if (var74 != null && var74[var77] != null) {
                                                                byte var78;
                                                                if (var77 == 3) {
                                                                    var78 = 36;
                                                                } else {
                                                                    var78 = 37;
                                                                }
                                                                method2(var74[var77], class2.method3047(16748608) + var69.field1124, var78, var69.field1151, var64, var9.field2741);
                                                            } else if (var77 == 4) {
                                                                method2(class157.field2465, class2.method3047(16748608) + var69.field1124, 37, var69.field1151, var64, var9.field2741);
                                                            }
                                                        }
                                                    }
                                                    class178 var10000 = (class178) null;
                                                    if (class178.method116(method39(var9))) {
                                                        method2(class157.field2446, class2.method3047(16748608) + var69.field1124, 38, var69.field1151, var64, var9.field2741);
                                                    }
                                                    int var79 = method39(var9);
                                                    boolean var80 = (var79 >> 30 & 0x1) != 0;
                                                    if (var80 && var74 != null) {
                                                        for (int var81 = 2; var81 >= 0; var81--) {
                                                            if (var74[var81] != null) {
                                                                byte var82 = 0;
                                                                if (var81 == 0) {
                                                                    var82 = 33;
                                                                }
                                                                if (var81 == 1) {
                                                                    var82 = 34;
                                                                }
                                                                if (var81 == 2) {
                                                                    var82 = 35;
                                                                }
                                                                method2(var74[var81], class2.method3047(16748608) + var69.field1124, var82, var69.field1151, var64, var9.field2741);
                                                            }
                                                        }
                                                    }
                                                    String[] var83 = var9.field2810;
                                                    if (field456) {
                                                        var83 = Statics.method1175(var83);
                                                    }
                                                    if (var83 != null) {
                                                        for (int var84 = 4; var84 >= 0; var84--) {
                                                            if (var83[var84] != null) {
                                                                byte var85 = 0;
                                                                if (var84 == 0) {
                                                                    var85 = 39;
                                                                }
                                                                if (var84 == 1) {
                                                                    var85 = 40;
                                                                }
                                                                if (var84 == 2) {
                                                                    var85 = 41;
                                                                }
                                                                if (var84 == 3) {
                                                                    var85 = 42;
                                                                }
                                                                if (var84 == 4) {
                                                                    var85 = 43;
                                                                }
                                                                method2(var83[var84], class2.method3047(16748608) + var69.field1124, var85, var69.field1151, var64, var9.field2741);
                                                            }
                                                        }
                                                    }
                                                    method2(class157.field2318, class2.method3047(16748608) + var69.field1124, 1005, var69.field1151, var64, var9.field2741);
                                                }
                                            }
                                        }
                                        var64++;
                                    }
                                }
                            }
                            if (var9.field2740) {
                                if (!field496) {
                                    for (int var86 = 9; var86 >= 5; var86--) {
                                        String var87;
                                        if (!class178.method573(method39(var9), var86) && var9.field2839 == null) {
                                            var87 = null;
                                        } else if (var9.field2823 == null || var9.field2823.length <= var86 || var9.field2823[var86] == null || var9.field2823[var86].trim().length() == 0) {
                                            var87 = null;
                                        } else {
                                            var87 = var9.field2823[var86];
                                        }
                                        if (var87 != null) {
                                            method2(var87, var9.field2812, 1007, var86 + 1, var9.field2866, var9.field2741);
                                        }
                                    }
                                    String var89 = method2626(var9);
                                    if (var89 != null) {
                                        method2(var89, var9.field2812, 25, 0, var9.field2866, var9.field2741);
                                    }
                                    for (int var90 = 4; var90 >= 0; var90--) {
                                        String var91;
                                        if (!class178.method573(method39(var9), var90) && var9.field2839 == null) {
                                            var91 = null;
                                        } else if (var9.field2823 == null || var9.field2823.length <= var90 || var9.field2823[var90] == null || var9.field2823[var90].trim().length() == 0) {
                                            var91 = null;
                                        } else {
                                            var91 = var9.field2823[var90];
                                        }
                                        if (var91 != null) {
                                            method2(var91, var9.field2812, 57, var90 + 1, var9.field2866, var9.field2741);
                                        }
                                    }
                                    if (class178.method2912(method39(var9))) {
                                        method2(class157.field2301, "", 30, 0, var9.field2866, var9.field2741);
                                    }
                                } else if (class178.method90(method39(var9)) && (Statics.field72 & 0x20) == 32) {
                                    method2(field443, field501 + " " + class2.field21 + " " + var9.field2812, 58, 0, var9.field2866, var9.field2741);
                                }
                            }
                        }
                        if (var9.field2743 == 0) {
                            if (!var9.field2740 && method120(var9) && Statics.field2632 != var9) {
                                continue;
                            }
                            method1180(arg0, var9.field2741, var12, var13, var14, var15, var10 - var9.field2762, var11 - var9.field2763);
                            if (var9.field2863 != null) {
                                method1180(var9.field2863, var9.field2741, var12, var13, var14, var15, var10 - var9.field2762, var11 - var9.field2763);
                            }
                            class4 var93 = (class4) field446.method3519((long) var9.field2741);
                            if (var93 != null) {
                                if (var93.field64 == 0 && class140.field2163 >= var12 && class140.field2155 >= var13 && class140.field2163 < var14 && class140.field2155 < var15 && !field334 && !field431) {
                                    for (class1 var94 = (class1) field484.method3546(); var94 != null; var94 = (class1) field484.method3548()) {
                                        if (var94.field2) {
                                            var94.method3625();
                                            var94.field8.field2872 = false;
                                        }
                                    }
                                    if (Statics.field1049 == 0) {
                                        field458 = null;
                                        field420 = null;
                                    }
                                    if (!field334) {
                                        field432[0] = class157.field2304;
                                        field433[0] = "";
                                        field497[0] = 1006;
                                        field427 = 1;
                                    }
                                }
                                method819(var93.field60, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2740) {
                            if (var9.field2807) {
                                if (class140.field2163 >= var12 && class140.field2155 >= var13 && class140.field2163 < var14 && class140.field2155 < var15) {
                                    for (class1 var95 = (class1) field484.method3546(); var95 != null; var95 = (class1) field484.method3548()) {
                                        if (var95.field2) {
                                            var95.method3625();
                                            var95.field8.field2872 = false;
                                        }
                                    }
                                    if (Statics.field1049 == 0) {
                                        field458 = null;
                                        field420 = null;
                                    }
                                    if (!field334) {
                                        field432[0] = class157.field2304;
                                        field433[0] = "";
                                        field497[0] = 1006;
                                        field427 = 1;
                                    }
                                }
                            } else if (var9.field2873 && class140.field2163 >= var12 && class140.field2155 >= var13 && class140.field2163 < var14 && class140.field2155 < var15) {
                                for (class1 var96 = (class1) field484.method3546(); var96 != null; var96 = (class1) field484.method3548()) {
                                    if (var96.field2 && var96.field8.field2840 == var96.field6) {
                                        var96.method3625();
                                    }
                                }
                            }
                            boolean var97;
                            if (class140.field2163 >= var12 && class140.field2155 >= var13 && class140.field2163 < var14 && class140.field2155 < var15) {
                                var97 = true;
                            } else {
                                var97 = false;
                            }
                            boolean var98 = false;
                            if ((class140.field2153 == 1 || !Statics.field1954 && class140.field2153 == 4) && var97) {
                                var98 = true;
                            }
                            boolean var99 = false;
                            if ((class140.field2160 == 1 || !Statics.field1954 && class140.field2160 == 4) && class140.field2161 >= var12 && class140.field2151 >= var13 && class140.field2161 < var14 && class140.field2151 < var15) {
                                var99 = true;
                            }
                            if (var99) {
                                method569(var9, class140.field2161 - var10, class140.field2151 - var11);
                            }
                            if (field458 != null && field458 != var9 && var97) {
                                int var100 = method39(var9);
                                boolean var101 = (var100 >> 20 & 0x1) != 0;
                                if (var101) {
                                    field532 = var9;
                                }
                            }
                            if (field420 == var9) {
                                field463 = true;
                                field473 = var10;
                                field510 = var11;
                            }
                            if (var9.field2819) {
                                if (var97 && field483 != 0 && var9.field2840 != null) {
                                    class1 var102 = new class1();
                                    var102.field2 = true;
                                    var102.field8 = var9;
                                    var102.field1 = field483;
                                    var102.field6 = var9.field2840;
                                    field484.method3541(var102);
                                }
                                if (field458 != null || Statics.field2585 != null || field334) {
                                    var99 = false;
                                    var98 = false;
                                    var97 = false;
                                }
                                if (!var9.field2816 && var99) {
                                    var9.field2816 = true;
                                    if (var9.field2846 != null) {
                                        class1 var103 = new class1();
                                        var103.field2 = true;
                                        var103.field8 = var9;
                                        var103.field4 = class140.field2161 - var10;
                                        var103.field1 = class140.field2151 - var11;
                                        var103.field6 = var9.field2846;
                                        field484.method3541(var103);
                                    }
                                }
                                if (var9.field2816 && var98 && var9.field2730 != null) {
                                    class1 var104 = new class1();
                                    var104.field2 = true;
                                    var104.field8 = var9;
                                    var104.field4 = class140.field2163 - var10;
                                    var104.field1 = class140.field2155 - var11;
                                    var104.field6 = var9.field2730;
                                    field484.method3541(var104);
                                }
                                if (var9.field2816 && !var98) {
                                    var9.field2816 = false;
                                    if (var9.field2861 != null) {
                                        class1 var105 = new class1();
                                        var105.field2 = true;
                                        var105.field8 = var9;
                                        var105.field4 = class140.field2163 - var10;
                                        var105.field1 = class140.field2155 - var11;
                                        var105.field6 = var9.field2861;
                                        field486.method3541(var105);
                                    }
                                }
                                if (var98 && var9.field2824 != null) {
                                    class1 var106 = new class1();
                                    var106.field2 = true;
                                    var106.field8 = var9;
                                    var106.field4 = class140.field2163 - var10;
                                    var106.field1 = class140.field2155 - var11;
                                    var106.field6 = var9.field2824;
                                    field484.method3541(var106);
                                }
                                if (!var9.field2872 && var97) {
                                    var9.field2872 = true;
                                    if (var9.field2825 != null) {
                                        class1 var107 = new class1();
                                        var107.field2 = true;
                                        var107.field8 = var9;
                                        var107.field4 = class140.field2163 - var10;
                                        var107.field1 = class140.field2155 - var11;
                                        var107.field6 = var9.field2825;
                                        field484.method3541(var107);
                                    }
                                }
                                if (var9.field2872 && var97 && var9.field2826 != null) {
                                    class1 var108 = new class1();
                                    var108.field2 = true;
                                    var108.field8 = var9;
                                    var108.field4 = class140.field2163 - var10;
                                    var108.field1 = class140.field2155 - var11;
                                    var108.field6 = var9.field2826;
                                    field484.method3541(var108);
                                }
                                if (var9.field2872 && !var97) {
                                    var9.field2872 = false;
                                    if (var9.field2868 != null) {
                                        class1 var109 = new class1();
                                        var109.field2 = true;
                                        var109.field8 = var9;
                                        var109.field4 = class140.field2163 - var10;
                                        var109.field1 = class140.field2155 - var11;
                                        var109.field6 = var9.field2868;
                                        field486.method3541(var109);
                                    }
                                }
                                if (var9.field2838 != null) {
                                    class1 var110 = new class1();
                                    var110.field8 = var9;
                                    var110.field6 = var9.field2838;
                                    field348.method3541(var110);
                                }
                                if (var9.field2746 != null && field472 > var9.field2867) {
                                    if (var9.field2833 == null || field472 - var9.field2867 > 32) {
                                        class1 var115 = new class1();
                                        var115.field8 = var9;
                                        var115.field6 = var9.field2746;
                                        field484.method3541(var115);
                                    } else {
                                        label1004: for (int var111 = var9.field2867; var111 < field472; var111++) {
                                            int var112 = field471[var111 & 0x1F];
                                            for (int var113 = 0; var113 < var9.field2833.length; var113++) {
                                                if (var9.field2833[var113] == var112) {
                                                    class1 var114 = new class1();
                                                    var114.field8 = var9;
                                                    var114.field6 = var9.field2746;
                                                    field484.method3541(var114);
                                                    break label1004;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2867 = field472;
                                }
                                if (var9.field2821 != null && field332 > var9.field2792) {
                                    if (var9.field2835 == null || field332 - var9.field2792 > 32) {
                                        class1 var120 = new class1();
                                        var120.field8 = var9;
                                        var120.field6 = var9.field2821;
                                        field484.method3541(var120);
                                    } else {
                                        label980: for (int var116 = var9.field2792; var116 < field332; var116++) {
                                            int var117 = field375[var116 & 0x1F];
                                            for (int var118 = 0; var118 < var9.field2835.length; var118++) {
                                                if (var9.field2835[var118] == var117) {
                                                    class1 var119 = new class1();
                                                    var119.field8 = var9;
                                                    var119.field6 = var9.field2821;
                                                    field484.method3541(var119);
                                                    break label980;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2792 = field332;
                                }
                                if (var9.field2836 != null && field476 > var9.field2869) {
                                    if (var9.field2786 == null || field476 - var9.field2869 > 32) {
                                        class1 var125 = new class1();
                                        var125.field8 = var9;
                                        var125.field6 = var9.field2836;
                                        field484.method3541(var125);
                                    } else {
                                        label956: for (int var121 = var9.field2869; var121 < field476; var121++) {
                                            int var122 = field381[var121 & 0x1F];
                                            for (int var123 = 0; var123 < var9.field2786.length; var123++) {
                                                if (var9.field2786[var123] == var122) {
                                                    class1 var124 = new class1();
                                                    var124.field8 = var9;
                                                    var124.field6 = var9.field2836;
                                                    field484.method3541(var124);
                                                    break label956;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2869 = field476;
                                }
                                if (field477 > var9.field2834 && var9.field2841 != null) {
                                    class1 var126 = new class1();
                                    var126.field8 = var9;
                                    var126.field6 = var9.field2841;
                                    field484.method3541(var126);
                                }
                                if (field478 > var9.field2834 && var9.field2843 != null) {
                                    class1 var127 = new class1();
                                    var127.field8 = var9;
                                    var127.field6 = var9.field2843;
                                    field484.method3541(var127);
                                }
                                if (field479 > var9.field2834 && var9.field2844 != null) {
                                    class1 var128 = new class1();
                                    var128.field8 = var9;
                                    var128.field6 = var9.field2844;
                                    field484.method3541(var128);
                                }
                                if (field571 > var9.field2834 && var9.field2849 != null) {
                                    class1 var129 = new class1();
                                    var129.field8 = var9;
                                    var129.field6 = var9.field2849;
                                    field484.method3541(var129);
                                }
                                if (field481 > var9.field2834 && var9.field2856 != null) {
                                    class1 var130 = new class1();
                                    var130.field8 = var9;
                                    var130.field6 = var9.field2856;
                                    field484.method3541(var130);
                                }
                                if (field482 > var9.field2834 && var9.field2845 != null) {
                                    class1 var131 = new class1();
                                    var131.field8 = var9;
                                    var131.field6 = var9.field2845;
                                    field484.method3541(var131);
                                }
                                var9.field2834 = field470;
                                if (var9.field2842 != null) {
                                    for (int var132 = 0; var132 < field435; var132++) {
                                        class1 var133 = new class1();
                                        var133.field8 = var9;
                                        var133.field11 = field416[var132];
                                        var133.field9 = field397[var132];
                                        var133.field6 = var9.field2842;
                                        field484.method3541(var133);
                                    }
                                }
                            }
                        }
                        if (!var9.field2740 && field458 == null && Statics.field2585 == null && !field334) {
                            if ((var9.field2854 >= 0 || var9.field2772 != 0) && class140.field2163 >= var12 && class140.field2155 >= var13 && class140.field2163 < var14 && class140.field2155 < var15) {
                                if (var9.field2854 >= 0) {
                                    Statics.field2632 = arg0[var9.field2854];
                                } else {
                                    Statics.field2632 = var9;
                                }
                            }
                            if (var9.field2743 == 8 && class140.field2163 >= var12 && class140.field2155 >= var13 && class140.field2163 < var14 && class140.field2155 < var15) {
                                Statics.field3061 = var9;
                            }
                            if (var9.field2765 > var9.field2757) {
                                int var134 = var9.field2756 + var10;
                                int var135 = var9.field2757;
                                int var136 = var9.field2765;
                                int var137 = class140.field2163;
                                int var138 = class140.field2155;
                                if (field368) {
                                    field369 = 32;
                                } else {
                                    field369 = 0;
                                }
                                field368 = false;
                                if (class140.field2153 == 1 || !Statics.field1954 && class140.field2153 == 4) {
                                    if (var137 >= var134 && var137 < var134 + 16 && var138 >= var11 && var138 < var11 + 16) {
                                        var9.field2763 -= 4;
                                        method2930(var9);
                                    } else if (var137 >= var134 && var137 < var134 + 16 && var138 >= var11 + var135 - 16 && var138 < var11 + var135) {
                                        var9.field2763 += 4;
                                        method2930(var9);
                                    } else if (var137 >= var134 - field369 && var137 < field369 + var134 + 16 && var138 >= var11 + 16 && var138 < var11 + var135 - 16) {
                                        int var139 = (var135 - 32) * var135 / var136;
                                        if (var139 < 8) {
                                            var139 = 8;
                                        }
                                        int var140 = var138 - var11 - 16 - var139 / 2;
                                        int var141 = var135 - 32 - var139;
                                        var9.field2763 = (var136 - var135) * var140 / var141;
                                        method2930(var9);
                                        field368 = true;
                                    }
                                }
                                if (field483 != 0) {
                                    int var142 = var9.field2756;
                                    if (var137 >= var134 - var142 && var138 >= var11 && var137 < var134 + 16 && var138 <= var11 + var135) {
                                        var9.field2763 += field483 * 45;
                                        method2930(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.cy([Lfu;II)V")
    public static final void method698(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2743 == 0) {
                    if (var3.field2863 != null) {
                        method698(var3.field2863, arg1);
                    }
                    class4 var4 = (class4) field446.method3519((long) var3.field2741);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class173.method2942(var5)) {
                            method698(Statics.field2793[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2734 != null) {
                    class1 var6 = new class1();
                    var6.field8 = var3;
                    var6.field6 = var3.field2734;
                    class37.method2637(var6);
                }
                if (arg1 == 1 && var3.field2847 != null) {
                    if (var3.field2866 >= 0) {
                        class173 var7 = class173.method81(var3.field2741);
                        if (var7 == null || var7.field2863 == null || var3.field2866 >= var7.field2863.length || var7.field2863[var3.field2866] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field8 = var3;
                    var8.field6 = var3.field2847;
                    class37.method2637(var8);
                }
            }
        }
    }

    @ObfuscatedName("j.cf(Lfu;IIB)V")
    public static final void method569(class173 arg0, int arg1, int arg2) {
        if (field458 != null || field334 || arg0 == null) {
            return;
        }
        class173 var3 = method2110(arg0);
        if (var3 == null) {
            var3 = arg0.field2858;
        }
        if (var3 == null) {
            return;
        }
        field458 = arg0;
        class173 var5 = method2110(arg0);
        if (var5 == null) {
            var5 = arg0.field2858;
        }
        field420 = var5;
        field460 = arg1;
        field461 = arg2;
        Statics.field1049 = 0;
        field289 = false;
        if (field427 > 0) {
            method2198(field427 - 1);
        }
        return;
    }

    @ObfuscatedName("fb.cj(I)V")
    public static final void method3108() {
        method2930(field458);
        Statics.field1049++;
        if (field466 && field463) {
            int var0 = class140.field2163;
            int var1 = class140.field2155;
            int var2 = var0 - field460;
            int var3 = var1 - field461;
            if (var2 < field473) {
                var2 = field473;
            }
            if (field458.field2756 + var2 > field473 + field420.field2756) {
                var2 = field473 + field420.field2756 - field458.field2756;
            }
            if (var3 < field510) {
                var3 = field510;
            }
            if (field458.field2757 + var3 > field510 + field420.field2757) {
                var3 = field510 + field420.field2757 - field458.field2757;
            }
            int var4 = var2 - field342;
            int var5 = var3 - field468;
            int var6 = field458.field2735;
            if (Statics.field1049 > field458.field2813 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field289 = true;
            }
            int var7 = field420.field2762 + (var2 - field473);
            int var8 = field420.field2763 + (var3 - field510);
            if (field458.field2828 != null && field289) {
                class1 var9 = new class1();
                var9.field8 = field458;
                var9.field4 = var7;
                var9.field1 = var8;
                var9.field6 = field458.field2828;
                class37.method2637(var9);
            }
            if (class140.field2153 == 0) {
                if (field289) {
                    if (field458.field2829 != null) {
                        class1 var10 = new class1();
                        var10.field8 = field458;
                        var10.field4 = var7;
                        var10.field1 = var8;
                        var10.field7 = field532;
                        var10.field6 = field458.field2829;
                        class37.method2637(var10);
                    }
                    if (field532 != null && method2110(field458) != null) {
                        field329.method2565(206);
                        field329.method2362(field532.field2741);
                        field329.method2353(field458.field2866);
                        field329.method2513(field532.field2859);
                        field329.method2513(field532.field2866);
                        field329.method2361(field458.field2741);
                        field329.method2353(field458.field2859);
                    }
                } else if ((field425 == 1 || method2265(field427 - 1)) && field427 > 2) {
                    method687(field460 + field342, field468 + field461);
                } else if (field427 > 0) {
                    method33(field460 + field342, field468 + field461);
                }
                field458 = null;
            }
        } else if (Statics.field1049 > 1) {
            field458 = null;
        }
    }

    @ObfuscatedName("dt.cc(II)V")
    public static void method2198(int arg0) {
        Statics.field242 = new class31();
        Statics.field242.field705 = field428[arg0];
        Statics.field242.field706 = field429[arg0];
        Statics.field242.field707 = field497[arg0];
        Statics.field242.field708 = field347[arg0];
        Statics.field242.field709 = field432[arg0];
    }

    @ObfuscatedName("i.cl(IIB)V")
    public static void method33(int arg0, int arg1) {
        method1564(Statics.field242, arg0, arg1);
        Statics.field242 = null;
    }

    @ObfuscatedName("es.ch(Lfu;I)V")
    public static void method2930(class173 arg0) {
        if (field489 == arg0.field2742) {
            field554[arg0.field2870] = true;
        }
    }

    @ObfuscatedName("cc.ca(I)V")
    public static void method2023() {
        for (class4 var0 = (class4) field446.method3515(); var0 != null; var0 = (class4) field446.method3516()) {
            int var1 = var0.field60;
            if (class173.method2942(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2793[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2740;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3100;
                    class173 var6 = class173.method81(var5);
                    if (var6 != null) {
                        method2930(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.cq(II)V")
    public static final void method697(int arg0) {
        if (!class173.method2942(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2793[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2739 = 0;
                var3.field2862 = 0;
            }
        }
    }

    @ObfuscatedName("fu.db([Lfu;II)V")
    public static final void method3186(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2760 == arg1 && (!var3.field2740 || !method120(var3))) {
                if (var3.field2743 == 0) {
                    if (!var3.field2740 && method120(var3) && Statics.field2632 != var3) {
                        continue;
                    }
                    method3186(arg0, var3.field2741);
                    if (var3.field2863 != null) {
                        method3186(var3.field2863, var3.field2741);
                    }
                    class4 var4 = (class4) field446.method3519((long) var3.field2741);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class173.method2942(var5)) {
                            method3186(Statics.field2793[var5], -1);
                        }
                    }
                }
                if (var3.field2743 == 6) {
                    if (var3.field2814 != -1 || var3.field2787 != -1) {
                        boolean var6 = method2750(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2787;
                        } else {
                            var7 = var3.field2814;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method2257(var7);
                            var3.field2862 += field351;
                            while (var3.field2862 > var8.field995[var3.field2739]) {
                                var3.field2862 -= var8.field995[var3.field2739];
                                var3.field2739++;
                                if (var3.field2739 >= var8.field988.length) {
                                    var3.field2739 -= var8.field990;
                                    if (var3.field2739 < 0 || var3.field2739 >= var8.field988.length) {
                                        var3.field2739 = 0;
                                    }
                                }
                                method2930(var3);
                            }
                        }
                    }
                    if (var3.field2795 != 0 && !var3.field2740) {
                        int var9 = var3.field2795 >> 16;
                        int var10 = var3.field2795 << 16 >> 16;
                        int var11 = field351 * var9;
                        int var12 = field351 * var10;
                        var3.field2790 = var3.field2790 + var11 & 0x7FF;
                        var3.field2791 = var3.field2791 + var12 & 0x7FF;
                        method2930(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fi.de(IB)V")
    public static final void method2979(int arg0) {
        method2023();
        class24.method2107();
        int var1 = class53.method2941(arg0).field1174;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2896[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method1946(0.9D);
                ((class95) Statics.field1576).method2013(0.9D);
            }
            if (var2 == 2) {
                class91.method1946(0.8D);
                ((class95) Statics.field1576).method2013(0.8D);
            }
            if (var2 == 3) {
                class91.method1946(0.7D);
                ((class95) Statics.field1576).method2013(0.7D);
            }
            if (var2 == 4) {
                class91.method1946(0.6D);
                ((class95) Statics.field1576).method2013(0.6D);
            }
            class52.method94();
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
            if (field522 != var3) {
                if (field522 == 0 && field538 != -1) {
                    class183.method3635(Statics.field264, field538, 0, var3, false);
                    field340 = false;
                } else if (var3 == 0) {
                    Statics.field2944.method3348();
                    class183.field2943 = 1;
                    Statics.field2942 = null;
                    field340 = false;
                } else if (class183.field2943 == 0) {
                    Statics.field2944.method3342(var3);
                } else {
                    Statics.field31 = var3;
                }
                field522 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field525 = 127;
            }
            if (var2 == 1) {
                field525 = 96;
            }
            if (var2 == 2) {
                field525 = 64;
            }
            if (var2 == 3) {
                field525 = 32;
            }
            if (var2 == 4) {
                field525 = 0;
            }
        }
        if (var1 == 5) {
            field425 = var2;
        }
        if (var1 == 6) {
            field285 = var2;
        }
        if (var1 == 9) {
            field563 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field526 = 127;
            }
            if (var2 == 1) {
                field526 = 96;
            }
            if (var2 == 2) {
                field526 = 64;
            }
            if (var2 == 3) {
                field526 = 32;
            }
            if (var2 == 4) {
                field526 = 0;
            }
        }
        if (var1 == 17) {
            field453 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field311 = (class21) class109.method706(class21.method2736(), var2);
            if (field311 == null) {
                field311 = class21.field576;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field509 = -1;
        } else {
            field509 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("ag.dt(Lfu;B)V")
    public static final void method756(class173 arg0) {
        int var1 = arg0.field2745;
        if (var1 == 324) {
            if (field559 == -1) {
                field559 = arg0.field2774;
                field560 = arg0.field2775;
            }
            if (field558.field2904) {
                arg0.field2774 = field559;
            } else {
                arg0.field2774 = field560;
            }
        } else if (var1 == 325) {
            if (field559 == -1) {
                field559 = arg0.field2774;
                field560 = arg0.field2775;
            }
            if (field558.field2904) {
                arg0.field2774 = field560;
            } else {
                arg0.field2774 = field559;
            }
        } else if (var1 == 327) {
            arg0.field2790 = 150;
            arg0.field2791 = (int) (Math.sin((double) field295 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2782 = 5;
            arg0.field2783 = 0;
        } else if (var1 == 328) {
            arg0.field2790 = 150;
            arg0.field2791 = (int) (Math.sin((double) field295 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2782 = 5;
            arg0.field2783 = 1;
        }
    }

    @ObfuscatedName("ey.dl(I)V")
    public static final void method2925() {
        field329.method2565(175);
        for (class4 var0 = (class4) field446.method3515(); var0 != null; var0 = (class4) field446.method3516()) {
            if (var0.field64 == 0 || var0.field64 == 3) {
                method184(var0, true);
            }
        }
        if (field449 != null) {
            method2930(field449);
            field449 = null;
        }
    }

    @ObfuscatedName("t.dh(Lq;ZI)V")
    public static final void method184(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field3100;
        arg0.method3625();
        if (arg1 && var2 != -1 && Statics.field2731[var2]) {
            Statics.field2744.method3019(var2);
            if (Statics.field2793[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2793[var2].length; var5++) {
                    if (Statics.field2793[var2][var5] != null) {
                        if (Statics.field2793[var2][var5].field2743 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2793[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2793[var2] = null;
                }
                Statics.field2731[var2] = false;
            }
        }
        for (class201 var6 = (class201) field423.method3515(); var6 != null; var6 = (class201) field423.method3516()) {
            if ((var6.field3100 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3625();
            }
        }
        class173 var7 = class173.method81(var3);
        if (var7 != null) {
            method2930(var7);
        }
        method175();
        if (field422 != -1) {
            int var8 = field422;
            if (class173.method2942(var8)) {
                method698(Statics.field2793[var8], 1);
            }
        }
    }

    @ObfuscatedName("b.df(Lfu;IIII)V")
    public static final void method574(class173 arg0, int arg1, int arg2, int arg3) {
        class175 var4 = arg0.method3169(false);
        if (var4 == null) {
            return;
        }
        if (field541 < 3) {
            Statics.field2007.method1633(arg1, arg2, var4.field2883, var4.field2881, 25, 25, field371, 256, var4.field2892, var4.field2882);
        } else {
            class80.method1672(arg1, arg2, 0, var4.field2892, var4.field2882);
        }
    }

    @ObfuscatedName("j.dg(IIIILcg;Lfy;I)V")
    public static final void method567(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2616(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field371 + field358 & 0x7FF;
        int var8 = class91.field1561[var7];
        int var9 = class91.field1585[var7];
        int var10 = var8 * 256 / (field359 + 256);
        int var11 = var9 * 256 / (field359 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field3056.method1584(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("dy.du(IIIILcg;Lfy;I)V")
    public static final void method2616(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field371 + field358 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1561[var6];
        int var9 = class91.field1585[var6];
        int var10 = var8 * 256 / (field359 + 256);
        int var11 = var9 * 256 / (field359 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1588(arg5.field2883 / 2 + var12 - arg4.field1415 / 2, arg5.field2881 / 2 - var13 - arg4.field1413 / 2, arg0, arg1, arg5.field2883, arg5.field2881, arg5.field2892, arg5.field2882);
        } else {
            arg4.method1589(arg5.field2883 / 2 + arg0 + var12 - arg4.field1415 / 2, arg5.field2881 / 2 + arg1 - var13 - arg4.field1413 / 2);
        }
    }

    @ObfuscatedName("az.ds(Ljava/lang/String;ZB)Z")
    public static boolean method838(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method188(arg0, Statics.field195);
        for (int var3 = 0; var3 < field552; var3++) {
            if (var2.equalsIgnoreCase(class164.method188(field426[var3].field244, Statics.field195)) && (!arg1 || field426[var3].field243 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method188(Statics.field2683.field56, Statics.field195))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.dq(Ljava/lang/String;I)Z")
    public static boolean method741(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method188(arg0, Statics.field195);
        for (int var2 = 0; var2 < field317; var2++) {
            class8 var3 = field557[var2];
            if (var1.equalsIgnoreCase(class164.method188(var3.field135, Statics.field195))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method188(var3.field128, Statics.field195))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ch.dk(Ljava/lang/String;ZI)V")
    public static final void method2108(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field317 < 100 || field562 == 1) || field317 >= 400) {
            class12.method2263(31, "", class157.field2327);
            return;
        }
        String var2 = class164.method188(arg0, Statics.field195);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field317; var3++) {
            class8 var4 = field557[var3];
            String var5 = class164.method188(var4.field135, Statics.field195);
            if (var5 != null && var5.equals(var2)) {
                class12.method2263(31, "", arg0 + class157.field2348);
                return;
            }
            if (var4.field128 != null) {
                String var6 = class164.method188(var4.field128, Statics.field195);
                if (var6 != null && var6.equals(var2)) {
                    class12.method2263(31, "", arg0 + class157.field2348);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field552; var7++) {
            class18 var8 = field426[var7];
            String var9 = class164.method188(var8.field244, Statics.field195);
            if (var9 != null && var9.equals(var2)) {
                class12.method2263(31, "", class157.field2541 + arg0 + class157.field2505);
                return;
            }
            if (var8.field245 != null) {
                String var10 = class164.method188(var8.field245, Statics.field195);
                if (var10 != null && var10.equals(var2)) {
                    class12.method2263(31, "", class157.field2541 + arg0 + class157.field2505);
                    return;
                }
            }
        }
        if (class164.method188(Statics.field2683.field56, Statics.field195).equals(var2)) {
            class12.method2263(31, "", class157.field2467);
        } else {
            field329.method2565(218);
            field329.method2305(class119.method537(arg0));
            field329.method2311(arg0);
        }
    }

    @ObfuscatedName("ea.dw(Ljava/lang/String;I)V")
    public static final void method2928(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method188(arg0, Statics.field195);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field317; var2++) {
            class8 var3 = field557[var2];
            String var4 = var3.field135;
            String var5 = class164.method188(var4, Statics.field195);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field317--;
                for (int var7 = var2; var7 < field317; var7++) {
                    field557[var7] = field557[var7 + 1];
                }
                field478 = field470;
                field329.method2565(207);
                field329.method2305(class119.method537(arg0));
                field329.method2311(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("o.dz(Ljava/lang/String;I)V")
    public static final void method150(String arg0) {
        if (!arg0.equals("")) {
            field329.method2565(174);
            field329.method2305(class119.method537(arg0));
            field329.method2311(arg0);
        }
    }

    @ObfuscatedName("p.dp(Lfu;B)I")
    public static int method39(class173 arg0) {
        class201 var1 = (class201) field423.method3519(((long) arg0.field2741 << 32) + (long) arg0.field2866);
        return var1 == null ? arg0.field2811 : var1.field3087;
    }

    @ObfuscatedName("ca.dv(Lfu;I)Lfu;")
    public static class173 method2110(class173 arg0) {
        int var1 = class178.method113(method39(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method81(arg0.field2760);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("v.dn(Lfu;S)Z")
    public static boolean method120(class173 arg0) {
        if (field431) {
            if (method39(arg0) != 0) {
                return false;
            }
            if (arg0.field2743 == 0) {
                return false;
            }
        }
        return arg0.field2761;
    }

    @ObfuscatedName("dx.dd(Lfu;I)Ljava/lang/String;")
    public static String method2626(class173 arg0) {
        int var1 = method39(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2768 == null || arg0.field2768.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2768;
        }
    }

    @ObfuscatedName("cd.di(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method1932(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field324 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field324 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field324 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field324 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field324 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field3118 != null) {
            var3 = "/p=" + Statics.field3118;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field315 + "/a=" + Statics.field2189 + var3 + "/";
    }
}

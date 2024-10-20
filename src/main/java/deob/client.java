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

public final class client extends class144 {

    @ObfuscatedName("client.f")
    public static boolean field276 = true;

    @ObfuscatedName("client.l")
    public static int field422 = 1;

    @ObfuscatedName("client.u")
    public static int field278 = 0;

    @ObfuscatedName("client.h")
    public static int field280 = 0;

    @ObfuscatedName("client.k")
    public static boolean field282 = false;

    @ObfuscatedName("client.s")
    public static boolean field528 = false;

    @ObfuscatedName("client.w")
    public static class108[] field336 = new class108[4];

    @ObfuscatedName("client.e")
    public static int field284 = 0;

    @ObfuscatedName("client.n")
    public static int field297 = 0;

    @ObfuscatedName("client.v")
    public static boolean field533 = true;

    @ObfuscatedName("client.q")
    public static int field287 = 0;

    @ObfuscatedName("client.d")
    public static long field288 = 1L;

    @ObfuscatedName("client.c")
    public static int field289 = -1;

    @ObfuscatedName("client.b")
    public static int field299 = -1;

    @ObfuscatedName("client.aa")
    public static int field551 = -1;

    @ObfuscatedName("client.ao")
    public static boolean field292 = true;

    @ObfuscatedName("client.as")
    public static boolean field293 = false;

    @ObfuscatedName("client.ae")
    public static int field487 = 0;

    @ObfuscatedName("client.ai")
    public static int field430 = 0;

    @ObfuscatedName("client.am")
    public static int field312 = 0;

    @ObfuscatedName("client.ax")
    public static int field283 = 0;

    @ObfuscatedName("client.ay")
    public static int field503 = 0;

    @ObfuscatedName("client.az")
    public static int field438 = 0;

    @ObfuscatedName("client.av")
    public static int field300 = 0;

    @ObfuscatedName("client.ap")
    public static int field301 = 0;

    @ObfuscatedName("client.at")
    public static int field350 = 0;

    @ObfuscatedName("client.ar")
    public static class21 field277 = class21.field561;

    @ObfuscatedName("client.ah")
    public static class21 field304 = class21.field561;

    @ObfuscatedName("client.ag")
    public static int field322 = 0;

    @ObfuscatedName("client.aw")
    public static int field506 = 0;

    @ObfuscatedName("client.ad")
    public static int field389 = 0;

    @ObfuscatedName("client.bp")
    public static int field309 = 0;

    @ObfuscatedName("client.bh")
    public static int field310 = 0;

    @ObfuscatedName("client.bd")
    public static int field311 = 0;

    @ObfuscatedName("client.bs")
    public static int field308 = 0;

    @ObfuscatedName("client.bw")
    public static int field313 = 0;

    @ObfuscatedName("client.cb")
    public static class35[] field314 = new class35[32768];

    @ObfuscatedName("client.cp")
    public static int field315 = 0;

    @ObfuscatedName("client.cw")
    public static int[] field316 = new int[32768];

    @ObfuscatedName("client.ca")
    public static int field445 = 0;

    @ObfuscatedName("client.cz")
    public static int[] field318 = new int[250];

    @ObfuscatedName("client.co")
    public static class122 field319 = new class122(5000);

    @ObfuscatedName("client.cf")
    public static class122 field320 = new class122(5000);

    @ObfuscatedName("client.cg")
    public static class122 field321 = new class122(15000);

    @ObfuscatedName("client.cr")
    public static int field290 = 0;

    @ObfuscatedName("client.cj")
    public static int field447 = 0;

    @ObfuscatedName("client.cd")
    public static int field324 = 0;

    @ObfuscatedName("client.cl")
    public static int field325 = 0;

    @ObfuscatedName("client.ce")
    public static int field326 = 0;

    @ObfuscatedName("client.ct")
    public static int field327 = 0;

    @ObfuscatedName("client.cc")
    public static int field328 = 0;

    @ObfuscatedName("client.ck")
    public static int field401 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field330 = false;

    @ObfuscatedName("client.do")
    public static int field331 = 0;

    @ObfuscatedName("client.dz")
    public static int field332 = 1;

    @ObfuscatedName("client.dr")
    public static int field333 = 0;

    @ObfuscatedName("client.dn")
    public static int field334 = 1;

    @ObfuscatedName("client.dl")
    public static int field486 = 0;

    @ObfuscatedName("client.df")
    public static boolean field337 = false;

    @ObfuscatedName("client.de")
    public static int[][][] field338 = new int[4][13][13];

    @ObfuscatedName("client.dp")
    public static final int[] field339 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dy")
    public static int field523 = 0;

    @ObfuscatedName("client.di")
    public static int field341 = 2;

    @ObfuscatedName("client.dg")
    public static int field342 = 0;

    @ObfuscatedName("client.dx")
    public static int field393 = 2;

    @ObfuscatedName("client.dj")
    public static int field344 = 0;

    @ObfuscatedName("client.em")
    public static int field345 = 1;

    @ObfuscatedName("client.ec")
    public static int field346 = 0;

    @ObfuscatedName("client.ex")
    public static int field347 = 0;

    @ObfuscatedName("client.er")
    public static int field444 = 2;

    @ObfuscatedName("client.ea")
    public static int field349 = 0;

    @ObfuscatedName("client.ep")
    public static int field357 = 1;

    @ObfuscatedName("client.ei")
    public static int field351 = 0;

    @ObfuscatedName("client.et")
    public static int field421 = 0;

    @ObfuscatedName("client.ev")
    public static int field481 = 2301979;

    @ObfuscatedName("client.ed")
    public static int field377 = 5063219;

    @ObfuscatedName("client.el")
    public static int field385 = 3353893;

    @ObfuscatedName("client.ef")
    public static int field279 = 7759444;

    @ObfuscatedName("client.ek")
    public static boolean field359 = false;

    @ObfuscatedName("client.fm")
    public static int field360 = 0;

    @ObfuscatedName("client.fc")
    public static int field361 = 128;

    @ObfuscatedName("client.fr")
    public static int field435 = 0;

    @ObfuscatedName("client.fp")
    public static int field363 = 0;

    @ObfuscatedName("client.fk")
    public static int field364 = 0;

    @ObfuscatedName("client.fa")
    public static int field365 = 0;

    @ObfuscatedName("client.fg")
    public static int field366 = 0;

    @ObfuscatedName("client.fx")
    public static int field367 = 50;

    @ObfuscatedName("client.fl")
    public static int field368 = 0;

    @ObfuscatedName("client.fv")
    public static boolean field369 = false;

    @ObfuscatedName("client.fe")
    public static int field370 = 0;

    @ObfuscatedName("client.fh")
    public static int field386 = 0;

    @ObfuscatedName("client.fu")
    public static int field372 = 50;

    @ObfuscatedName("client.ff")
    public static int[] field373 = new int[field372];

    @ObfuscatedName("client.fy")
    public static int[] field374 = new int[field372];

    @ObfuscatedName("client.fw")
    public static int[] field302 = new int[field372];

    @ObfuscatedName("client.fz")
    public static int[] field376 = new int[field372];

    @ObfuscatedName("client.fi")
    public static int[] field555 = new int[field372];

    @ObfuscatedName("client.fs")
    public static int[] field378 = new int[field372];

    @ObfuscatedName("client.gc")
    public static int[] field353 = new int[field372];

    @ObfuscatedName("client.gv")
    public static String[] field395 = new String[field372];

    @ObfuscatedName("client.gy")
    public static int[][] field306 = new int[104][104];

    @ObfuscatedName("client.gr")
    public static int field382 = 0;

    @ObfuscatedName("client.gb")
    public static int field383 = -1;

    @ObfuscatedName("client.gk")
    public static int field396 = -1;

    @ObfuscatedName("client.gi")
    public static int field521 = 0;

    @ObfuscatedName("client.ga")
    public static int field400 = 0;

    @ObfuscatedName("client.gh")
    public static int field362 = 0;

    @ObfuscatedName("client.ge")
    public static int field388 = 0;

    @ObfuscatedName("client.gg")
    public static int field307 = 0;

    @ObfuscatedName("client.gq")
    public static int field390 = 0;

    @ObfuscatedName("client.gf")
    public static int field391 = 0;

    @ObfuscatedName("client.gu")
    public static int field392 = 0;

    @ObfuscatedName("client.go")
    public static int field510 = 0;

    @ObfuscatedName("client.gn")
    public static int field394 = 0;

    @ObfuscatedName("client.gm")
    public static boolean field441 = false;

    @ObfuscatedName("client.gd")
    public static int field490 = 0;

    @ObfuscatedName("client.gx")
    public static int field397 = 0;

    @ObfuscatedName("client.gp")
    public static class3[] field398 = new class3[2048];

    @ObfuscatedName("client.gt")
    public static int field524 = -1;

    @ObfuscatedName("client.hv")
    public static int field352 = 0;

    @ObfuscatedName("client.hx")
    public static int field414 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field402 = new int[1000];

    @ObfuscatedName("client.hg")
    public static final int[] field403 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hr")
    public static String[] field329 = new String[8];

    @ObfuscatedName("client.hq")
    public static boolean[] field405 = new boolean[8];

    @ObfuscatedName("client.hc")
    public static int[] field406 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ha")
    public static int field407 = -1;

    @ObfuscatedName("client.hf")
    public static class199[][][] field408 = new class199[4][104][104];

    @ObfuscatedName("client.hs")
    public static class199 field409 = new class199();

    @ObfuscatedName("client.hp")
    public static class199 field410 = new class199();

    @ObfuscatedName("client.ht")
    public static class199 field492 = new class199();

    @ObfuscatedName("client.hk")
    public static int[] field412 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field413 = new int[25];

    @ObfuscatedName("client.ho")
    public static int[] field348 = new int[25];

    @ObfuscatedName("client.hu")
    public static int field415 = 0;

    @ObfuscatedName("client.hm")
    public static boolean field501 = false;

    @ObfuscatedName("client.hy")
    public static int field417 = 0;

    @ObfuscatedName("client.hz")
    public static int[] field418 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field419 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field420 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field416 = new int[500];

    @ObfuscatedName("client.if")
    public static String[] field298 = new String[500];

    @ObfuscatedName("client.ig")
    public static String[] field423 = new String[500];

    @ObfuscatedName("client.ii")
    public static int field424 = -1;

    @ObfuscatedName("client.il")
    public static int field425 = -1;

    @ObfuscatedName("client.id")
    public static int field426 = 0;

    @ObfuscatedName("client.ip")
    public static int field286 = 50;

    @ObfuscatedName("client.ib")
    public static int field399 = 0;

    @ObfuscatedName("client.it")
    public static String field429 = null;

    @ObfuscatedName("client.ie")
    public static boolean field547 = false;

    @ObfuscatedName("client.io")
    public static int field356 = -1;

    @ObfuscatedName("client.iy")
    public static int field380 = -1;

    @ObfuscatedName("client.ir")
    public static String field433 = null;

    @ObfuscatedName("client.in")
    public static String field434 = null;

    @ObfuscatedName("client.iw")
    public static int field439 = -1;

    @ObfuscatedName("client.ic")
    public static class196 field305 = new class196(8);

    @ObfuscatedName("client.jc")
    public static int field437 = 0;

    @ObfuscatedName("client.je")
    public static int field294 = 0;

    @ObfuscatedName("client.jf")
    public static class173 field546 = null;

    @ObfuscatedName("client.ji")
    public static int field440 = 0;

    @ObfuscatedName("client.jn")
    public static int field432 = 0;

    @ObfuscatedName("client.jo")
    public static int field442 = 0;

    @ObfuscatedName("client.jp")
    public static int field464 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field384 = false;

    @ObfuscatedName("client.jt")
    public static boolean field443 = false;

    @ObfuscatedName("client.jm")
    public static boolean field375 = false;

    @ObfuscatedName("client.jk")
    public static class173 field536 = null;

    @ObfuscatedName("client.jr")
    public static class173 field448 = null;

    @ObfuscatedName("client.jq")
    public static class173 field449 = null;

    @ObfuscatedName("client.jg")
    public static int field450 = 0;

    @ObfuscatedName("client.jl")
    public static int field451 = 0;

    @ObfuscatedName("client.ju")
    public static class173 field452 = null;

    @ObfuscatedName("client.jz")
    public static boolean field453 = false;

    @ObfuscatedName("client.jv")
    public static int field454 = -1;

    @ObfuscatedName("client.jh")
    public static int field455 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field456 = false;

    @ObfuscatedName("client.js")
    public static int field457 = -1;

    @ObfuscatedName("client.jj")
    public static int field458 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field518 = false;

    @ObfuscatedName("client.ke")
    public static int field460 = 1;

    @ObfuscatedName("client.kq")
    public static int[] field461 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field462 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field509 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field531 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field465 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field466 = 0;

    @ObfuscatedName("client.kd")
    public static int field467 = 0;

    @ObfuscatedName("client.kr")
    public static int field459 = 0;

    @ObfuscatedName("client.ks")
    public static int field469 = 0;

    @ObfuscatedName("client.kf")
    public static int field470 = 0;

    @ObfuscatedName("client.kh")
    public static int field471 = 0;

    @ObfuscatedName("client.kj")
    public static int field472 = 0;

    @ObfuscatedName("client.kt")
    public static int field473 = 0;

    @ObfuscatedName("client.kg")
    public static class199 field474 = new class199();

    @ObfuscatedName("client.km")
    public static class199 field358 = new class199();

    @ObfuscatedName("client.kc")
    public static class199 field476 = new class199();

    @ObfuscatedName("client.kn")
    public static class196 field477 = new class196(512);

    @ObfuscatedName("client.kb")
    public static int field478 = 0;

    @ObfuscatedName("client.kv")
    public static int field479 = -2;

    @ObfuscatedName("client.li")
    public static boolean[] field371 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static boolean[] field497 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static boolean[] field482 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static int[] field483 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field484 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field485 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field527 = new int[100];

    @ObfuscatedName("client.le")
    public static int field317 = 0;

    @ObfuscatedName("client.lg")
    public static long field488 = 0L;

    @ObfuscatedName("client.ly")
    public static boolean field427 = true;

    @ObfuscatedName("client.ln")
    public static int field512 = 765;

    @ObfuscatedName("client.lh")
    public static int field491 = 1;

    @ObfuscatedName("client.ls")
    public static int[] field381 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lq")
    public static int field493 = 0;

    @ObfuscatedName("client.ld")
    public static int field494 = 0;

    @ObfuscatedName("client.lo")
    public static String field495 = "";

    @ObfuscatedName("client.lt")
    public static long[] field303 = new long[100];

    @ObfuscatedName("client.lp")
    public static int field404 = 0;

    @ObfuscatedName("client.lr")
    public static int field498 = 0;

    @ObfuscatedName("client.mb")
    public static int[] field499 = new int[128];

    @ObfuscatedName("client.ma")
    public static int[] field496 = new int[128];

    @ObfuscatedName("client.my")
    public static long field274 = -1L;

    @ObfuscatedName("client.mk")
    public static String field502 = null;

    @ObfuscatedName("client.ms")
    public static String field296 = null;

    @ObfuscatedName("client.mf")
    public static int field504 = -1;

    @ObfuscatedName("client.mt")
    public static int field505 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field323 = new int[1000];

    @ObfuscatedName("client.mw")
    public static int[] field507 = new int[1000];

    @ObfuscatedName("client.mi")
    public static class79[] field508 = new class79[1000];

    @ObfuscatedName("client.mz")
    public static int field538 = 0;

    @ObfuscatedName("client.mn")
    public static int field295 = 0;

    @ObfuscatedName("client.mq")
    public static int field511 = 0;

    @ObfuscatedName("client.mc")
    public static int field544 = 255;

    @ObfuscatedName("client.mr")
    public static int field513 = -1;

    @ObfuscatedName("client.mg")
    public static boolean field514 = false;

    @ObfuscatedName("client.nm")
    public static int field515 = 127;

    @ObfuscatedName("client.ng")
    public static int field516 = 127;

    @ObfuscatedName("client.ni")
    public static int field517 = 0;

    @ObfuscatedName("client.nc")
    public static int[] field463 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field519 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field520 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field468 = new int[50];

    @ObfuscatedName("client.nv")
    public static class59[] field522 = new class59[50];

    @ObfuscatedName("client.nk")
    public static boolean field335 = false;

    @ObfuscatedName("client.od")
    public static boolean[] field428 = new boolean[5];

    @ObfuscatedName("client.ok")
    public static int[] field525 = new int[5];

    @ObfuscatedName("client.og")
    public static int[] field526 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field291 = new int[5];

    @ObfuscatedName("client.oa")
    public static int[] field475 = new int[5];

    @ObfuscatedName("client.om")
    public static short field529 = 256;

    @ObfuscatedName("client.ol")
    public static short field530 = 205;

    @ObfuscatedName("client.oh")
    public static short field489 = 256;

    @ObfuscatedName("client.oc")
    public static short field532 = 320;

    @ObfuscatedName("client.ox")
    public static short field387 = 1;

    @ObfuscatedName("client.oe")
    public static short field534 = 32767;

    @ObfuscatedName("client.oi")
    public static short field535 = 1;

    @ObfuscatedName("client.ot")
    public static short field285 = 32767;

    @ObfuscatedName("client.os")
    public static int field537 = 0;

    @ObfuscatedName("client.ou")
    public static int field436 = 0;

    @ObfuscatedName("client.oo")
    public static int field539 = 0;

    @ObfuscatedName("client.oq")
    public static int field540 = 0;

    @ObfuscatedName("client.oy")
    public static int field541 = 0;

    @ObfuscatedName("client.oj")
    public static int field542 = 0;

    @ObfuscatedName("client.oz")
    public static int field543 = 0;

    @ObfuscatedName("client.or")
    public static class18[] field411 = new class18[400];

    @ObfuscatedName("client.on")
    public static class195 field545 = new class195();

    @ObfuscatedName("client.ov")
    public static int field355 = 0;

    @ObfuscatedName("client.op")
    public static class8[] field446 = new class8[400];

    @ObfuscatedName("client.pi")
    public static class179 field548 = new class179();

    @ObfuscatedName("client.po")
    public static int field549 = -1;

    @ObfuscatedName("client.ph")
    public static int field550 = -1;

    @ObfuscatedName("client.pe")
    public static class220[] field500 = new class220[8];

    @ObfuscatedName("client.pt")
    public static long field552 = -1L;

    @ObfuscatedName("client.pr")
    public static long field553 = -1L;

    @ObfuscatedName("client.pf")
    public static final class11 field554 = new class11();

    @ObfuscatedName("client.pu")
    public static int[] field431 = new int[50];

    @ObfuscatedName("client.pw")
    public static int[] field556 = new int[50];

    @ObfuscatedName("client.m(I)V")
    public final void method379() {
    }

    public final void init() {
        if (!this.method2866()) {
            return;
        }
        class190[] var1 = class190.method2965();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class190 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3056);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3056)) {
                    case 3:
                        field422 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field284 = Integer.parseInt(var4);
                        break;
                    case 5:
                        field278 = Integer.parseInt(var4);
                        break;
                    case 6:
                        Statics.field1147 = Integer.parseInt(var4);
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                            field282 = true;
                        } else {
                            field282 = false;
                        }
                    case 8:
                    default:
                        break;
                    case 9:
                        field280 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field774 = Integer.parseInt(var4);
                        break;
                    case 11:
                        int var5 = Integer.parseInt(var4);
                        class153[] var6 = class153.method2860();
                        int var7 = 0;
                        class153 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class153 var8 = var6[var7];
                            if (var8.field2267 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field480 = var9;
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                        }
                        break;
                    case 13:
                        Statics.field166 = var4;
                        break;
                    case 14:
                        Statics.field185 = var4;
                        break;
                    case 15:
                        Statics.field2688 = (class154) Statics.method625(Statics.method2166(), Integer.parseInt(var4));
                        if (Statics.field2688 == class154.field2274) {
                            Statics.field281 = class212.field3126;
                        } else {
                            Statics.field281 = class212.field3119;
                        }
                }
            }
        }
        method3000();
        Statics.field960 = this.getCodeBase().getHost();
        String var10 = Statics.field480.field2264;
        byte var11 = 0;
        try {
            Statics.field2216 = 16;
            Statics.field563 = var11;
            try {
                Statics.field200 = System.getProperty("os.name");
            } catch (Exception var25) {
                Statics.field200 = "Unknown";
            }
            Statics.field30 = Statics.field200.toLowerCase();
            try {
                Statics.field15 = System.getProperty("user.home");
                if (Statics.field15 != null) {
                    Statics.field15 = Statics.field15 + "/";
                }
            } catch (Exception var24) {
            }
            try {
                if (Statics.field30.startsWith("win")) {
                    if (Statics.field15 == null) {
                        Statics.field15 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field15 == null) {
                    Statics.field15 = System.getenv("HOME");
                }
                if (Statics.field15 != null) {
                    Statics.field15 = Statics.field15 + "/";
                }
            } catch (Exception var23) {
            }
            if (Statics.field15 == null) {
                Statics.field15 = "~/";
            }
            Statics.field3037 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field15, "/tmp/", "" };
            Statics.field210 = new String[] { ".jagex_cache_" + Statics.field563, ".file_store_" + Statics.field563 };
            label123: for (int var15 = 0; var15 < 4; var15++) {
                Statics.field2227 = class149.method2833("oldschool", var10, var15);
                if (!Statics.field2227.exists()) {
                    Statics.field2227.mkdirs();
                }
                File[] var16 = Statics.field2227.listFiles();
                if (var16 == null) {
                    break;
                }
                File[] var17 = var16;
                int var18 = 0;
                while (true) {
                    if (var18 >= var17.length) {
                        break label123;
                    }
                    File var19 = var17[var18];
                    if (!class149.method4(var19, false)) {
                        break;
                    }
                    var18++;
                }
            }
            File var20 = Statics.field2227;
            Statics.field2066 = var20;
            if (!Statics.field2066.exists()) {
                throw new RuntimeException("");
            }
            class135.field2067 = true;
            class149.method2288();
            class149.field2222 = new class228(new class227(class135.method1059("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2223 = new class228(new class227(class135.method1059("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field748 = new class228[Statics.field2216];
            for (int var21 = 0; var21 < Statics.field2216; var21++) {
                Statics.field748[var21] = new class228(new class227(class135.method1059("main_file_cache.idx" + var21), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var26) {
            class148.method769((String) null, var26);
        }
        Statics.field275 = this;
        this.method2936(765, 503, 100);
    }

    @ObfuscatedName("fn.l(I)V")
    public static final void method3000() {
        class86.field1500 = false;
        field528 = false;
    }

    @ObfuscatedName("client.u(I)V")
    public final void method531() {
        Statics.field165 = field280 == 0 ? 43594 : field422 + 40000;
        Statics.field1990 = field280 == 0 ? 443 : field422 + 50000;
        Statics.field220 = Statics.field165;
        Statics.field155 = class174.field2873;
        Statics.field1980 = class174.field2870;
        Statics.field1024 = class174.field2871;
        Statics.field2905 = class174.field2872;
        class137.method2975();
        Canvas var1 = Statics.field245;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2101);
        var1.addFocusListener(class137.field2101);
        class140.method767(Statics.field245);
        class145 var2;
        try {
            var2 = new class145();
        } catch (Throwable var5) {
            var2 = null;
        }
        Statics.field1955 = var2;
        if (Statics.field1955 != null) {
            Statics.field1955.method2696(Statics.field245);
        }
        Statics.field1023 = new class134(255, class149.field2222, class149.field2223, 500000);
        Statics.field2278 = class9.method2841();
        Statics.field1086 = this.getToolkit().getSystemClipboard();
        class138.method2170(this, Statics.field985);
        if (field280 != 0) {
            field293 = true;
        }
        int var4 = Statics.field2278.field133;
        field488 = 0L;
        if (var4 >= 2) {
            field427 = true;
        } else {
            field427 = false;
        }
        method2674();
        if (field297 >= 25) {
            method247();
        }
        field2187 = true;
    }

    @ObfuscatedName("client.a(I)V")
    public final void method539() {
        field287++;
        this.method264();
        while (true) {
            class199 var1 = class170.field2695;
            class169 var2;
            synchronized (class170.field2695) {
                var2 = (class169) class170.field2692.method3604();
            }
            if (var2 == null) {
                try {
                    if (class183.field2941 == 1) {
                        int var4 = Statics.field2944.method3416();
                        if (var4 > 0 && Statics.field2944.method3422()) {
                            int var5 = var4 - Statics.field2875;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2944.method3415(var5);
                        } else {
                            Statics.field2944.method3421();
                            Statics.field2944.method3419();
                            if (Statics.field3039 == null) {
                                class183.field2941 = 0;
                            } else {
                                class183.field2941 = 2;
                            }
                            Statics.field2214 = null;
                            Statics.field1519 = null;
                        }
                    }
                } catch (Exception var464) {
                    var464.printStackTrace();
                    Statics.field2944.method3421();
                    class183.field2941 = 0;
                    Statics.field2214 = null;
                    Statics.field1519 = null;
                    Statics.field3039 = null;
                }
                method2697();
                class137.method2994();
                class140.method2039();
                if (Statics.field1955 != null) {
                    int var7 = Statics.field1955.method2699();
                    field473 = var7;
                }
                if (field297 == 0) {
                    method1001();
                    Statics.field1027.method2712();
                    for (int var8 = 0; var8 < 32; var8++) {
                        field2183[var8] = 0L;
                    }
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2184[var9] = 0L;
                    }
                    Statics.field1752 = 0;
                } else if (field297 == 5) {
                    class32.method60(this);
                    method1001();
                    class144.method1250();
                } else if (field297 == 10 || field297 == 11) {
                    class32.method60(this);
                } else if (field297 == 20) {
                    class32.method60(this);
                    method740();
                } else if (field297 == 25) {
                    method2719();
                }
                if (field297 == 30) {
                    if (field487 > 1) {
                        field487--;
                    }
                    if (field401 > 0) {
                        field401--;
                    }
                    if (field330) {
                        field330 = false;
                        if (field401 > 0) {
                            method1587();
                        } else {
                            method695(40);
                            Statics.field139 = Statics.field171;
                            Statics.field171 = null;
                        }
                    } else {
                        if (!field501) {
                            field298[0] = class157.field2534;
                            field423[0] = "";
                            field420[0] = 1006;
                            field417 = 1;
                        }
                        for (int var10 = 0; var10 < 100; var10++) {
                            boolean var11;
                            if (Statics.field171 == null) {
                                var11 = false;
                            } else {
                                label3387: {
                                    try {
                                        int var12 = Statics.field171.method2845();
                                        if (var12 == 0) {
                                            var11 = false;
                                            break label3387;
                                        }
                                        if (field447 == -1) {
                                            Statics.field171.method2849(field321.field1981, 0, 1);
                                            field321.field1982 = 0;
                                            field447 = field321.method2632();
                                            field290 = class188.field3036[field447];
                                            var12--;
                                        }
                                        if (field290 == -1) {
                                            if (var12 <= 0) {
                                                var11 = false;
                                                break label3387;
                                            }
                                            Statics.field171.method2849(field321.field1981, 0, 1);
                                            field290 = field321.field1981[0] & 0xFF;
                                            var12--;
                                        }
                                        if (field290 == -2) {
                                            if (var12 <= 1) {
                                                var11 = false;
                                                break label3387;
                                            }
                                            Statics.field171.method2849(field321.field1981, 0, 2);
                                            field321.field1982 = 0;
                                            field290 = field321.method2374();
                                            var12 -= 2;
                                        }
                                        if (var12 < field290) {
                                            var11 = false;
                                            break label3387;
                                        }
                                        field321.field1982 = 0;
                                        Statics.field171.method2849(field321.field1981, 0, field290);
                                        field324 = 0;
                                        field328 = field327;
                                        field327 = field326;
                                        field326 = field447;
                                        if (field447 == 92) {
                                            field335 = true;
                                            Statics.field2022 = field321.method2372();
                                            Statics.field1379 = field321.method2372();
                                            Statics.field2061 = field321.method2374();
                                            Statics.field725 = field321.method2372();
                                            Statics.field3106 = field321.method2372();
                                            if (Statics.field3106 >= 100) {
                                                int var13 = Statics.field2022 * 128 + 64;
                                                int var14 = Statics.field1379 * 128 + 64;
                                                int var15 = method745(var13, var14, Statics.field135) - Statics.field2061;
                                                int var16 = var13 - Statics.field673;
                                                int var17 = var15 - Statics.field2054;
                                                int var18 = var14 - Statics.field1375;
                                                int var19 = (int) Math.sqrt((double) (var16 * var16 + var18 * var18));
                                                Statics.field170 = (int) (Math.atan2((double) var17, (double) var19) * 325.949D) & 0x7FF;
                                                Statics.field1435 = (int) (Math.atan2((double) var16, (double) var18) * -325.949D) & 0x7FF;
                                                if (Statics.field170 < 128) {
                                                    Statics.field170 = 128;
                                                }
                                                if (Statics.field170 > 383) {
                                                    Statics.field170 = 383;
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 188) {
                                            String var20 = field321.method2380();
                                            Object[] var21 = new Object[var20.length() + 1];
                                            for (int var22 = var20.length() - 1; var22 >= 0; var22--) {
                                                if (var20.charAt(var22) == 's') {
                                                    var21[var22 + 1] = field321.method2380();
                                                } else {
                                                    var21[var22 + 1] = Integer.valueOf(field321.method2377());
                                                }
                                            }
                                            var21[0] = Integer.valueOf(field321.method2377());
                                            class1 var23 = new class1();
                                            var23.field11 = var21;
                                            class37.method3221(var23);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 185) {
                                            method2303(false);
                                            field321.method2632();
                                            int var24 = field321.method2374();
                                            class122 var25 = field321;
                                            int var26 = var25.field1982;
                                            class33.field741 = 0;
                                            class33.method1031(var25);
                                            class33.method1003(var25);
                                            if (var25.field1982 - var26 != var24) {
                                                throw new RuntimeException(var25.field1982 - var26 + " " + var24);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 33) {
                                            field543 = 1;
                                            field459 = field460;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 239) {
                                            String var27 = field321.method2380();
                                            int var28 = field321.method2374();
                                            byte var29 = field321.method2373();
                                            boolean var30 = false;
                                            if (var29 == -128) {
                                                var30 = true;
                                            }
                                            if (var30) {
                                                if (Statics.field965 == 0) {
                                                    field447 = -1;
                                                    var11 = true;
                                                    break label3387;
                                                }
                                                boolean var31 = false;
                                                int var32;
                                                for (var32 = 0; var32 < Statics.field965 && (!Statics.field1668[var32].field605.equals(var27) || Statics.field1668[var32].field607 != var28); var32++) {
                                                }
                                                if (var32 < Statics.field965) {
                                                    while (var32 < Statics.field965 - 1) {
                                                        Statics.field1668[var32] = Statics.field1668[var32 + 1];
                                                        var32++;
                                                    }
                                                    Statics.field965--;
                                                    Statics.field1668[Statics.field965] = null;
                                                }
                                            } else {
                                                field321.method2380();
                                                class25 var33 = new class25();
                                                var33.field605 = var27;
                                                var33.field606 = class164.method2834(var33.field605, Statics.field281);
                                                var33.field607 = var28;
                                                var33.field608 = var29;
                                                int var34;
                                                for (var34 = Statics.field965 - 1; var34 >= 0; var34--) {
                                                    int var35 = Statics.field1668[var34].field606.compareTo(var33.field606);
                                                    if (var35 == 0) {
                                                        Statics.field1668[var34].field607 = var28;
                                                        Statics.field1668[var34].field608 = var29;
                                                        if (var27.equals(Statics.field13.field35)) {
                                                            Statics.field2138 = var29;
                                                        }
                                                        field469 = field460;
                                                        field447 = -1;
                                                        var11 = true;
                                                        break label3387;
                                                    }
                                                    if (var35 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field965 >= Statics.field1668.length) {
                                                    field447 = -1;
                                                    var11 = true;
                                                    break label3387;
                                                }
                                                for (int var36 = Statics.field965 - 1; var36 > var34; var36--) {
                                                    Statics.field1668[var36 + 1] = Statics.field1668[var36];
                                                }
                                                if (Statics.field965 == 0) {
                                                    Statics.field1668 = new class25[100];
                                                }
                                                Statics.field1668[var34 + 1] = var33;
                                                Statics.field965++;
                                                if (var27.equals(Statics.field13.field35)) {
                                                    Statics.field2138 = var29;
                                                }
                                            }
                                            field469 = field460;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 35) {
                                            int var37 = field321.method2416();
                                            int var38 = field321.method2374();
                                            class173 var39 = class173.method1002(var37);
                                            if (var39.field2778 != 2 || var39.field2777 != var38) {
                                                var39.field2778 = 2;
                                                var39.field2777 = var38;
                                                method908(var39);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 137) {
                                            field430 = field321.method2372();
                                            if (field430 == 1) {
                                                field312 = field321.method2374();
                                            }
                                            if (field430 >= 2 && field430 <= 6) {
                                                if (field430 == 2) {
                                                    field301 = 64;
                                                    field350 = 64;
                                                }
                                                if (field430 == 3) {
                                                    field301 = 0;
                                                    field350 = 64;
                                                }
                                                if (field430 == 4) {
                                                    field301 = 128;
                                                    field350 = 64;
                                                }
                                                if (field430 == 5) {
                                                    field301 = 64;
                                                    field350 = 0;
                                                }
                                                if (field430 == 6) {
                                                    field301 = 64;
                                                    field350 = 128;
                                                }
                                                field430 = 2;
                                                field503 = field321.method2374();
                                                field438 = field321.method2374();
                                                field300 = field321.method2372();
                                            }
                                            if (field430 == 10) {
                                                field283 = field321.method2374();
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 79) {
                                            String var40 = field321.method2380();
                                            long var41 = field321.method2570();
                                            long var43 = (long) field321.method2374();
                                            long var45 = (long) field321.method2376();
                                            class152[] var47 = new class152[] { class152.field2254, class152.field2250, class152.field2253, class152.field2251, class152.field2252 };
                                            class152 var48 = (class152) Statics.method625(var47, field321.method2372());
                                            long var49 = (var43 << 32) + var45;
                                            boolean var51 = false;
                                            for (int var52 = 0; var52 < 100; var52++) {
                                                if (field303[var52] == var49) {
                                                    var51 = true;
                                                    break;
                                                }
                                            }
                                            if (var48.field2258 && method847(var40)) {
                                                var51 = true;
                                            }
                                            if (!var51 && field397 == 0) {
                                                field303[field404] = var49;
                                                field404 = (field404 + 1) % 100;
                                                String var53 = class223.method3842(class163.method2686(class222.method2964(field321)));
                                                if (var48.field2256 == -1) {
                                                    class12.method1957(9, var40, var53, class162.method202(var41));
                                                } else {
                                                    class12.method1957(9, class2.method256(var48.field2256) + var40, var53, class162.method202(var41));
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 147) {
                                            field538 = field321.method2372();
                                            if (field538 == 255) {
                                                field538 = 0;
                                            }
                                            field295 = field321.method2372();
                                            if (field295 == 255) {
                                                field295 = 0;
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 207) {
                                            int var54 = field321.method2397();
                                            String var55 = field321.method2380();
                                            int var56 = field321.method2399();
                                            if (var56 >= 1 && var56 <= 8) {
                                                if (var55.equalsIgnoreCase("null")) {
                                                    var55 = null;
                                                }
                                                field329[var56 - 1] = var55;
                                                field405[var56 - 1] = var54 == 0;
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 19) {
                                            field335 = false;
                                            for (int var57 = 0; var57 < 5; var57++) {
                                                field428[var57] = false;
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 203) {
                                            int var58 = field321.method2377();
                                            int var59 = field321.method2374();
                                            if (var58 < -70000) {
                                                var59 += 32768;
                                            }
                                            class173 var60;
                                            if (var58 >= 0) {
                                                var60 = class173.method1002(var58);
                                            } else {
                                                var60 = null;
                                            }
                                            if (var60 != null) {
                                                for (int var61 = 0; var61 < var60.field2851.length; var61++) {
                                                    var60.field2851[var61] = 0;
                                                    var60.field2852[var61] = 0;
                                                }
                                            }
                                            class16.method681(var59);
                                            int var62 = field321.method2374();
                                            for (int var63 = 0; var63 < var62; var63++) {
                                                int var64 = field321.method2399();
                                                if (var64 == 255) {
                                                    var64 = field321.method2417();
                                                }
                                                int var65 = field321.method2408();
                                                if (var60 != null && var63 < var60.field2851.length) {
                                                    var60.field2851[var63] = var65;
                                                    var60.field2852[var63] = var64;
                                                }
                                                class16.method1027(var59, var63, var65 - 1, var64);
                                            }
                                            if (var60 != null) {
                                                method908(var60);
                                            }
                                            method1208();
                                            field509[++field531 - 1 & 0x1F] = var59 & 0x7FFF;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 74) {
                                            int var66 = field321.method2499();
                                            int var67 = field321.method2407();
                                            int var68 = var67 >> 10 & 0x1F;
                                            int var69 = var67 >> 5 & 0x1F;
                                            int var70 = var67 & 0x1F;
                                            int var71 = (var70 << 3) + (var68 << 19) + (var69 << 11);
                                            class173 var72 = class173.method1002(var66);
                                            if (var72.field2825 != var71) {
                                                var72.field2825 = var71;
                                                method908(var72);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 111) {
                                            int var73 = field321.method2374();
                                            int var74 = field321.method2417();
                                            int var75 = field321.method2408();
                                            class173 var76 = class173.method1002(var74);
                                            var76.field2798 = (var73 << 16) + var75;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 127) {
                                            int var77 = field321.method2407();
                                            field439 = var77;
                                            method630(false);
                                            method922(var77);
                                            class37.method2043(field439);
                                            for (int var78 = 0; var78 < 100; var78++) {
                                                field371[var78] = true;
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 126) {
                                            field469 = field460;
                                            if (field290 == 0) {
                                                field502 = null;
                                                field296 = null;
                                                Statics.field965 = 0;
                                                Statics.field1668 = null;
                                                field447 = -1;
                                                var11 = true;
                                                break label3387;
                                            }
                                            field296 = field321.method2380();
                                            long var79 = field321.method2570();
                                            field502 = class162.method955(var79);
                                            Statics.field92 = field321.method2373();
                                            int var81 = field321.method2372();
                                            if (var81 == 255) {
                                                field447 = -1;
                                                var11 = true;
                                                break label3387;
                                            }
                                            Statics.field965 = var81;
                                            class25[] var82 = new class25[100];
                                            for (int var83 = 0; var83 < Statics.field965; var83++) {
                                                var82[var83] = new class25();
                                                var82[var83].field605 = field321.method2380();
                                                var82[var83].field606 = class164.method2834(var82[var83].field605, Statics.field281);
                                                var82[var83].field607 = field321.method2374();
                                                var82[var83].field608 = field321.method2373();
                                                field321.method2380();
                                                if (var82[var83].field605.equals(Statics.field13.field35)) {
                                                    Statics.field2138 = var82[var83].field608;
                                                }
                                            }
                                            boolean var84 = false;
                                            int var85 = Statics.field965;
                                            while (var85 > 0) {
                                                boolean var86 = true;
                                                var85--;
                                                for (int var87 = 0; var87 < var85; var87++) {
                                                    if (var82[var87].field606.compareTo(var82[var87 + 1].field606) > 0) {
                                                        class25 var88 = var82[var87];
                                                        var82[var87] = var82[var87 + 1];
                                                        var82[var87 + 1] = var88;
                                                        var86 = false;
                                                    }
                                                }
                                                if (var86) {
                                                    break;
                                                }
                                            }
                                            Statics.field1668 = var82;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 234) {
                                            class26 var89 = new class26();
                                            var89.field625 = field321.method2380();
                                            var89.field622 = field321.method2374();
                                            int var90 = field321.method2377();
                                            var89.field623 = var90;
                                            method695(45);
                                            Statics.field171.method2843();
                                            Statics.field171 = null;
                                            class32.method666(var89);
                                            field447 = -1;
                                            var11 = false;
                                            break label3387;
                                        }
                                        if (field447 == 100) {
                                            field487 = field321.method2408() * 30;
                                            field472 = field460;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 88) {
                                            method1208();
                                            field432 = field321.method2375();
                                            field472 = field460;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 43) {
                                            String var91 = field321.method2380();
                                            String var92 = class223.method3842(class163.method2686(class222.method2964(field321)));
                                            class12.method1029(6, var91, var92);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 201) {
                                            int var93 = field321.method2375();
                                            int var94 = field321.method2409();
                                            int var95 = field321.method2377();
                                            class173 var96 = class173.method1002(var95);
                                            if (var96.field2744 != var93 || var96.field2793 != var94 || var96.field2740 != 0 || var96.field2741 != 0) {
                                                var96.field2744 = var93;
                                                var96.field2793 = var94;
                                                var96.field2740 = 0;
                                                var96.field2741 = 0;
                                                method908(var96);
                                                method185(var96);
                                                if (var96.field2737 == 0) {
                                                    method735(Statics.field2858[var95 >> 16], var96, false);
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 59) {
                                            field493 = field321.method2372();
                                            field494 = field321.method2372();
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 123) {
                                            int var97 = field321.method2384();
                                            boolean var98 = field321.method2372() == 1;
                                            String var99 = "";
                                            boolean var100 = false;
                                            if (var98) {
                                                var99 = field321.method2380();
                                                if (method847(var99)) {
                                                    var100 = true;
                                                }
                                            }
                                            String var101 = field321.method2380();
                                            if (!var100) {
                                                class12.method1029(var97, var99, var101);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 20) {
                                            Statics.field199 = field321.method2399();
                                            Statics.field2020 = field321.method2372();
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 171) {
                                            int var102 = field321.method2417();
                                            int var103 = field321.method2410();
                                            class173 var104 = class173.method1002(var102);
                                            if (var104.field2803 != var103 || var103 == -1) {
                                                var104.field2803 = var103;
                                                var104.field2855 = 0;
                                                var104.field2774 = 0;
                                                method908(var104);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 40) {
                                            for (int var105 = 0; var105 < Statics.field1144; var105++) {
                                                class53 var106 = (class53) class53.field1145.method3543((long) var105);
                                                class53 var107;
                                                if (var106 == null) {
                                                    byte[] var108 = Statics.field1150.method3124(16, var105);
                                                    class53 var109 = new class53();
                                                    if (var108 != null) {
                                                        var109.method1083(new class119(var108));
                                                    }
                                                    class53.field1145.method3540(var109, (long) var105);
                                                    var107 = var109;
                                                } else {
                                                    var107 = var106;
                                                }
                                                if (var107 != null) {
                                                    class176.field2888[var105] = 0;
                                                    class176.field2885[var105] = 0;
                                                }
                                            }
                                            method1208();
                                            field462 += 32;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 178) {
                                            String var111 = field321.method2380();
                                            long var112 = (long) field321.method2374();
                                            long var114 = (long) field321.method2376();
                                            class152[] var116 = new class152[] { class152.field2254, class152.field2250, class152.field2253, class152.field2251, class152.field2252 };
                                            class152 var117 = (class152) Statics.method625(var116, field321.method2372());
                                            long var118 = (var112 << 32) + var114;
                                            boolean var120 = false;
                                            for (int var121 = 0; var121 < 100; var121++) {
                                                if (field303[var121] == var118) {
                                                    var120 = true;
                                                    break;
                                                }
                                            }
                                            if (method847(var111)) {
                                                var120 = true;
                                            }
                                            if (!var120 && field397 == 0) {
                                                field303[field404] = var118;
                                                field404 = (field404 + 1) % 100;
                                                String var122 = class223.method3842(class163.method2686(class222.method2964(field321)));
                                                byte var123;
                                                if (var117.field2257) {
                                                    var123 = 7;
                                                } else {
                                                    var123 = 3;
                                                }
                                                if (var117.field2256 == -1) {
                                                    class12.method1029(var123, var111, var122);
                                                } else {
                                                    class12.method1029(var123, class2.method256(var117.field2256) + var111, var122);
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 24) {
                                            int var124 = field321.method2408();
                                            if (var124 == 65535) {
                                                var124 = -1;
                                            }
                                            int var125 = field321.method2499();
                                            int var126 = field321.method2377();
                                            int var127 = field321.method2408();
                                            if (var127 == 65535) {
                                                var127 = -1;
                                            }
                                            for (int var128 = var127; var128 <= var124; var128++) {
                                                long var129 = ((long) var126 << 32) + (long) var128;
                                                class208 var131 = field477.method3571(var129);
                                                if (var131 != null) {
                                                    var131.method3700();
                                                }
                                                field477.method3574(new class201(var125), var129);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 139) {
                                            field335 = true;
                                            Statics.field777 = field321.method2372();
                                            Statics.field1989 = field321.method2372();
                                            Statics.field1089 = field321.method2374();
                                            Statics.field1964 = field321.method2372();
                                            Statics.field1541 = field321.method2372();
                                            if (Statics.field1541 >= 100) {
                                                Statics.field673 = Statics.field777 * 128 + 64;
                                                Statics.field1375 = Statics.field1989 * 128 + 64;
                                                Statics.field2054 = method745(Statics.field673, Statics.field1375, Statics.field135) - Statics.field1089;
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 173) {
                                            int var132 = field321.method2374();
                                            int var133 = field321.method2372();
                                            int var134 = field321.method2374();
                                            method771(var132, var133, var134);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 210 || field447 == 143 || field447 == 34 || field447 == 236 || field447 == 213 || field447 == 238 || field447 == 116 || field447 == 73 || field447 == 226 || field447 == 62) {
                                            method48();
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 31) {
                                            int var135 = field321.method2499();
                                            class173 var136 = class173.method1002(var135);
                                            for (int var137 = 0; var137 < var136.field2851.length; var137++) {
                                                var136.field2851[var137] = -1;
                                                var136.field2851[var137] = 0;
                                            }
                                            method908(var136);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 93) {
                                            int var138 = field321.method2406();
                                            int var139 = field321.method2406();
                                            int var140 = field321.method2417();
                                            int var141 = field321.method2408();
                                            class173 var142 = class173.method1002(var140);
                                            if (var142.field2784 != var141 || var142.field2761 != var139 || var142.field2788 != var138) {
                                                var142.field2784 = var141;
                                                var142.field2761 = var139;
                                                var142.field2788 = var138;
                                                method908(var142);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 39) {
                                            class122 var143 = field321;
                                            int var144 = field290;
                                            int var145 = var143.field1982;
                                            class33.field741 = 0;
                                            class33.method1031(var143);
                                            class33.method1003(var143);
                                            if (var143.field1982 - var145 != var144) {
                                                throw new RuntimeException(var143.field1982 - var145 + " " + var144);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 41) {
                                            field321.field1982 += 28;
                                            if (field321.method2393()) {
                                                class149.method2836(field321, field321.field1982 - 28);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 26) {
                                            method2837(field321.method2380());
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 189) {
                                            for (int var146 = 0; var146 < class176.field2885.length; var146++) {
                                                if (class176.field2888[var146] != class176.field2885[var146]) {
                                                    class176.field2885[var146] = class176.field2888[var146];
                                                    method2724(var146);
                                                    field461[++field462 - 1 & 0x1F] = var146;
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 28) {
                                            int var147 = field321.method2372();
                                            int var148 = field321.method2372();
                                            int var149 = field321.method2372();
                                            int var150 = field321.method2372();
                                            field428[var147] = true;
                                            field525[var147] = var148;
                                            field526[var147] = var149;
                                            field291[var147] = var150;
                                            field475[var147] = 0;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 32) {
                                            int var151 = field321.method2399();
                                            int var152 = field321.method2374();
                                            int var153 = field321.method2417();
                                            class4 var154 = (class4) field305.method3571((long) var153);
                                            if (var154 != null) {
                                                method121(var154, var154.field64 != var152);
                                            }
                                            class4 var155 = new class4();
                                            var155.field64 = var152;
                                            var155.field62 = var151;
                                            field305.method3574(var155, (long) var153);
                                            method922(var152);
                                            class173 var156 = class173.method1002(var153);
                                            method908(var156);
                                            if (field546 != null) {
                                                method908(field546);
                                                field546 = null;
                                            }
                                            for (int var157 = 0; var157 < field417; var157++) {
                                                if (method2611(field420[var157])) {
                                                    if (var157 < field417 - 1) {
                                                        for (int var158 = var157; var158 < field417 - 1; var158++) {
                                                            field298[var158] = field298[var158 + 1];
                                                            field423[var158] = field423[var158 + 1];
                                                            field420[var158] = field420[var158 + 1];
                                                            field416[var158] = field416[var158 + 1];
                                                            field418[var158] = field418[var158 + 1];
                                                            field419[var158] = field419[var158 + 1];
                                                        }
                                                    }
                                                    field417--;
                                                }
                                            }
                                            method735(Statics.field2858[var153 >> 16], var156, false);
                                            class37.method2043(var152);
                                            if (field439 != -1) {
                                                method189(field439, 1);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 136) {
                                            method1208();
                                            int var159 = field321.method2372();
                                            int var160 = field321.method2397();
                                            int var161 = field321.method2499();
                                            field348[var159] = var161;
                                            field412[var159] = var160;
                                            field413[var159] = 1;
                                            for (int var162 = 0; var162 < 98; var162++) {
                                                if (var161 >= class155.field2286[var162]) {
                                                    field413[var159] = var162 + 2;
                                                }
                                            }
                                            field465[++field466 - 1 & 0x1F] = var159;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 146) {
                                            int var163 = field321.method2377();
                                            int var164 = field321.method2374();
                                            if (var163 < -70000) {
                                                var164 += 32768;
                                            }
                                            class173 var165;
                                            if (var163 >= 0) {
                                                var165 = class173.method1002(var163);
                                            } else {
                                                var165 = null;
                                            }
                                            while (field321.field1982 < field290) {
                                                int var166 = field321.method2384();
                                                int var167 = field321.method2374();
                                                int var168 = 0;
                                                if (var167 != 0) {
                                                    var168 = field321.method2372();
                                                    if (var168 == 255) {
                                                        var168 = field321.method2377();
                                                    }
                                                }
                                                if (var165 != null && var166 >= 0 && var166 < var165.field2851.length) {
                                                    var165.field2851[var166] = var167;
                                                    var165.field2852[var166] = var168;
                                                }
                                                class16.method1027(var164, var166, var167 - 1, var168);
                                            }
                                            if (var165 != null) {
                                                method908(var165);
                                            }
                                            method1208();
                                            field509[++field531 - 1 & 0x1F] = var164 & 0x7FFF;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 108) {
                                            Statics.field2020 = field321.method2372();
                                            Statics.field199 = field321.method2399();
                                            while (field321.field1982 < field290) {
                                                field447 = field321.method2372();
                                                method48();
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 191) {
                                            method2303(true);
                                            field321.method2632();
                                            int var169 = field321.method2374();
                                            class122 var170 = field321;
                                            int var171 = var170.field1982;
                                            class33.field741 = 0;
                                            class33.method1031(var170);
                                            class33.method1003(var170);
                                            if (var170.field1982 - var171 != var169) {
                                                throw new RuntimeException(var170.field1982 - var171 + " " + var169);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 50) {
                                            boolean var172 = field321.method2372() == 1;
                                            if (var172) {
                                                Statics.field760 = class115.method2038() - field321.method2570();
                                                Statics.field2194 = new class221(field321, true);
                                            } else {
                                                Statics.field2194 = null;
                                            }
                                            field471 = field460;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 237) {
                                            int var173 = field321.method2372();
                                            class130[] var174 = new class130[] { class130.field2044, class130.field2048, class130.field2046 };
                                            class130[] var175 = var174;
                                            int var176 = 0;
                                            class130 var178;
                                            while (true) {
                                                if (var176 >= var175.length) {
                                                    var178 = null;
                                                    break;
                                                }
                                                class130 var177 = var175[var176];
                                                if (var177.field2047 == var173) {
                                                    var178 = var177;
                                                    break;
                                                }
                                                var176++;
                                            }
                                            Statics.field2641 = var178;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 219) {
                                            method1488(false);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 172) {
                                            boolean var179 = field321.method2395() == 1;
                                            int var180 = field321.method2416();
                                            class173 var181 = class173.method1002(var180);
                                            if (var181.field2725 != var179) {
                                                var181.field2725 = var179;
                                                method908(var181);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 38) {
                                            int var182 = field321.method2377();
                                            int var183 = field321.method2406();
                                            class173 var184 = class173.method1002(var182);
                                            if (var184.field2778 != 1 || var184.field2777 != var183) {
                                                var184.field2778 = 1;
                                                var184.field2777 = var183;
                                                method908(var184);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 141) {
                                            int var185 = field321.method2499();
                                            int var186 = field321.method2407();
                                            class173 var187 = class173.method1002(var185);
                                            if (var187 != null && var187.field2737 == 0) {
                                                if (var186 > var187.field2766 - var187.field2751) {
                                                    var186 = var187.field2766 - var187.field2751;
                                                }
                                                if (var186 < 0) {
                                                    var186 = 0;
                                                }
                                                if (var187.field2763 != var186) {
                                                    var187.field2763 = var186;
                                                    method908(var187);
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 12) {
                                            int var188 = field321.method2377();
                                            Statics.field69 = Statics.field631.method2744(var188);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 161) {
                                            int var189 = field321.method2377();
                                            class4 var190 = (class4) field305.method3571((long) var189);
                                            if (var190 != null) {
                                                method121(var190, true);
                                            }
                                            if (field546 != null) {
                                                method908(field546);
                                                field546 = null;
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 208) {
                                            while (field321.field1982 < field290) {
                                                boolean var191 = field321.method2372() == 1;
                                                String var192 = field321.method2380();
                                                String var193 = field321.method2380();
                                                int var194 = field321.method2374();
                                                int var195 = field321.method2372();
                                                int var196 = field321.method2372();
                                                boolean var197 = (var196 & 0x2) != 0;
                                                boolean var198 = (var196 & 0x1) != 0;
                                                if (var194 > 0) {
                                                    field321.method2380();
                                                    field321.method2372();
                                                    field321.method2377();
                                                }
                                                field321.method2380();
                                                for (int var199 = 0; var199 < field542; var199++) {
                                                    class18 var200 = field411[var199];
                                                    if (var191) {
                                                        if (var193.equals(var200.field238)) {
                                                            var200.field238 = var192;
                                                            var200.field242 = var193;
                                                            var192 = null;
                                                            break;
                                                        }
                                                    } else if (var192.equals(var200.field238)) {
                                                        if (var200.field239 != var194) {
                                                            boolean var201 = true;
                                                            for (class39 var202 = (class39) field545.method3561(); var202 != null; var202 = (class39) field545.method3562()) {
                                                                if (var202.field860.equals(var192)) {
                                                                    if (var194 != 0 && var202.field861 == 0) {
                                                                        var202.method3698();
                                                                        var201 = false;
                                                                    } else if (var194 == 0 && var202.field861 != 0) {
                                                                        var202.method3698();
                                                                        var201 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var201) {
                                                                field545.method3569(new class39(var192, var194));
                                                            }
                                                            var200.field239 = var194;
                                                        }
                                                        var200.field242 = var193;
                                                        var200.field240 = var195;
                                                        var200.field244 = var197;
                                                        var200.field241 = var198;
                                                        var192 = null;
                                                        break;
                                                    }
                                                }
                                                if (var192 != null && field542 < 400) {
                                                    class18 var203 = new class18();
                                                    field411[field542] = var203;
                                                    var203.field238 = var192;
                                                    var203.field242 = var193;
                                                    var203.field239 = var194;
                                                    var203.field240 = var195;
                                                    var203.field244 = var197;
                                                    var203.field241 = var198;
                                                    field542++;
                                                }
                                            }
                                            field543 = 2;
                                            field459 = field460;
                                            boolean var204 = false;
                                            int var205 = field542;
                                            while (var205 > 0) {
                                                boolean var206 = true;
                                                var205--;
                                                for (int var207 = 0; var207 < var205; var207++) {
                                                    boolean var208 = false;
                                                    class18 var209 = field411[var207];
                                                    class18 var210 = field411[var207 + 1];
                                                    if (field422 != var209.field239 && field422 == var210.field239) {
                                                        var208 = true;
                                                    }
                                                    if (!var208 && var209.field239 == 0 && var210.field239 != 0) {
                                                        var208 = true;
                                                    }
                                                    if (!var208 && !var209.field244 && var210.field244) {
                                                        var208 = true;
                                                    }
                                                    if (!var208 && !var209.field241 && var210.field241) {
                                                        var208 = true;
                                                    }
                                                    if (var208) {
                                                        class18 var211 = field411[var207];
                                                        field411[var207] = field411[var207 + 1];
                                                        field411[var207 + 1] = var211;
                                                        var206 = false;
                                                    }
                                                }
                                                if (var206) {
                                                    break;
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 95) {
                                            method1488(true);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 223) {
                                            field511 = field321.method2372();
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 224) {
                                            int var212 = field321.method2407();
                                            int var213 = field321.method2417();
                                            class176.field2888[var212] = var213;
                                            if (class176.field2885[var212] != var213) {
                                                class176.field2885[var212] = var213;
                                                method2724(var212);
                                            }
                                            field461[++field462 - 1 & 0x1F] = var212;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 170) {
                                            int var214 = field321.method2374();
                                            if (var214 == 65535) {
                                                var214 = -1;
                                            }
                                            if (var214 == -1 && !field514) {
                                                Statics.field2944.method3421();
                                                class183.field2941 = 1;
                                                Statics.field3039 = null;
                                            } else if (var214 != -1 && field513 != var214 && field544 != 0 && !field514) {
                                                class168 var215 = Statics.field2166;
                                                int var216 = field544;
                                                class183.field2941 = 1;
                                                Statics.field3039 = var215;
                                                Statics.field2946 = var214;
                                                Statics.field779 = 0;
                                                Statics.field2943 = var216;
                                                Statics.field2587 = false;
                                                Statics.field2875 = 2;
                                            }
                                            field513 = var214;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 235) {
                                            int var217 = field321.method2406();
                                            if (var217 == 65535) {
                                                var217 = -1;
                                            }
                                            int var218 = field321.method2412();
                                            if (field544 != 0 && var217 != -1) {
                                                class183.method869(Statics.field1986, var217, 0, field544, false);
                                                field514 = true;
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 245) {
                                            int var219 = field321.method2377();
                                            class173 var220 = class173.method1002(var219);
                                            var220.field2778 = 3;
                                            var220.field2777 = Statics.field13.field32.method3321();
                                            method908(var220);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 1) {
                                            byte var221 = field321.method2400();
                                            int var222 = field321.method2408();
                                            class176.field2888[var222] = var221;
                                            if (class176.field2885[var222] != var221) {
                                                class176.field2885[var222] = var221;
                                                method2724(var222);
                                            }
                                            field461[++field462 - 1 & 0x1F] = var222;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 252) {
                                            while (field321.field1982 < field290) {
                                                int var223 = field321.method2372();
                                                boolean var224 = (var223 & 0x1) == 1;
                                                String var225 = field321.method2380();
                                                String var226 = field321.method2380();
                                                field321.method2380();
                                                for (int var227 = 0; var227 < field355; var227++) {
                                                    class8 var228 = field446[var227];
                                                    if (var224) {
                                                        if (var226.equals(var228.field131)) {
                                                            var228.field131 = var225;
                                                            var228.field127 = var226;
                                                            var225 = null;
                                                            break;
                                                        }
                                                    } else if (var225.equals(var228.field131)) {
                                                        var228.field131 = var225;
                                                        var228.field127 = var226;
                                                        var225 = null;
                                                        break;
                                                    }
                                                }
                                                if (var225 != null && field355 < 400) {
                                                    class8 var229 = new class8();
                                                    field446[field355] = var229;
                                                    var229.field131 = var225;
                                                    var229.field127 = var226;
                                                    field355++;
                                                }
                                            }
                                            field459 = field460;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 106) {
                                            method1587();
                                            field447 = -1;
                                            var11 = false;
                                            break label3387;
                                        }
                                        if (field447 == 36) {
                                            class211.method589(field321, field290);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 101) {
                                            int var230 = field321.method2408();
                                            class16 var231 = (class16) class16.field217.method3571((long) var230);
                                            if (var231 != null) {
                                                var231.method3700();
                                            }
                                            field509[++field531 - 1 & 0x1F] = var230 & 0x7FFF;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 167) {
                                            Statics.field2020 = field321.method2397();
                                            Statics.field199 = field321.method2399();
                                            for (int var232 = Statics.field2020; var232 < Statics.field2020 + 8; var232++) {
                                                for (int var233 = Statics.field199; var233 < Statics.field199 + 8; var233++) {
                                                    if (field408[Statics.field135][var232][var233] != null) {
                                                        field408[Statics.field135][var232][var233] = null;
                                                        method3245(var232, var233);
                                                    }
                                                }
                                            }
                                            for (class17 var234 = (class17) field409.method3606(); var234 != null; var234 = (class17) field409.method3608()) {
                                                if (var234.field225 >= Statics.field2020 && var234.field225 < Statics.field2020 + 8 && var234.field226 >= Statics.field199 && var234.field226 < Statics.field199 + 8 && Statics.field135 == var234.field227) {
                                                    var234.field234 = 0;
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 27) {
                                            method1208();
                                            field440 = field321.method2372();
                                            field472 = field460;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 131) {
                                            int var235 = field321.method2416();
                                            String var236 = field321.method2380();
                                            class173 var237 = class173.method1002(var235);
                                            if (!var236.equals(var237.field2757)) {
                                                var237.field2757 = var236;
                                                method908(var237);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 196) {
                                            int var238 = field290 + field321.field1982;
                                            int var239 = field321.method2374();
                                            int var240 = field321.method2374();
                                            if (field439 != var239) {
                                                field439 = var239;
                                                method630(false);
                                                method922(field439);
                                                class37.method2043(field439);
                                                for (int var241 = 0; var241 < 100; var241++) {
                                                    field371[var241] = true;
                                                }
                                            }
                                            while (var240-- > 0) {
                                                int var242 = field321.method2377();
                                                int var243 = field321.method2374();
                                                int var244 = field321.method2372();
                                                class4 var245 = (class4) field305.method3571((long) var242);
                                                if (var245 != null && var245.field64 != var243) {
                                                    method121(var245, true);
                                                    var245 = null;
                                                }
                                                if (var245 == null) {
                                                    class4 var246 = new class4();
                                                    var246.field64 = var243;
                                                    var246.field62 = var244;
                                                    field305.method3574(var246, (long) var242);
                                                    method922(var243);
                                                    class173 var247 = class173.method1002(var242);
                                                    method908(var247);
                                                    if (field546 != null) {
                                                        method908(field546);
                                                        field546 = null;
                                                    }
                                                    for (int var248 = 0; var248 < field417; var248++) {
                                                        if (method2611(field420[var248])) {
                                                            if (var248 < field417 - 1) {
                                                                for (int var249 = var248; var249 < field417 - 1; var249++) {
                                                                    field298[var249] = field298[var249 + 1];
                                                                    field423[var249] = field423[var249 + 1];
                                                                    field420[var249] = field420[var249 + 1];
                                                                    field416[var249] = field416[var249 + 1];
                                                                    field418[var249] = field418[var249 + 1];
                                                                    field419[var249] = field419[var249 + 1];
                                                                }
                                                            }
                                                            field417--;
                                                        }
                                                    }
                                                    method735(Statics.field2858[var242 >> 16], var247, false);
                                                    class37.method2043(var243);
                                                    if (field439 != -1) {
                                                        method189(field439, 1);
                                                    }
                                                    var245 = var246;
                                                }
                                                var245.field63 = true;
                                            }
                                            for (class4 var251 = (class4) field305.method3570(); var251 != null; var251 = (class4) field305.method3575()) {
                                                if (var251.field63) {
                                                    var251.field63 = false;
                                                } else {
                                                    method121(var251, true);
                                                }
                                            }
                                            field477 = new class196(512);
                                            while (field321.field1982 < var238) {
                                                int var252 = field321.method2377();
                                                int var253 = field321.method2374();
                                                int var254 = field321.method2374();
                                                int var255 = field321.method2377();
                                                for (int var256 = var253; var256 <= var254; var256++) {
                                                    long var257 = ((long) var252 << 32) + (long) var256;
                                                    field477.method3574(new class201(var255), var257);
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 154) {
                                            int var259 = field321.method2377();
                                            int var260 = field321.method2377();
                                            if (Statics.field154 == null || !Statics.field154.isValid()) {
                                                try {
                                                    Iterator var261 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var261.hasNext()) {
                                                        GarbageCollectorMXBean var262 = (GarbageCollectorMXBean) var261.next();
                                                        if (var262.isValid()) {
                                                            Statics.field154 = var262;
                                                            field553 = -1L;
                                                            field552 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var461) {
                                                }
                                            }
                                            long var264 = class115.method2038();
                                            int var266 = -1;
                                            if (Statics.field154 != null) {
                                                long var267 = Statics.field154.getCollectionTime();
                                                if (field552 != -1L) {
                                                    long var269 = var267 - field552;
                                                    long var271 = var264 - field553;
                                                    if (var271 != 0L) {
                                                        var266 = (int) (var269 * 100L / var271);
                                                    }
                                                }
                                                field552 = var267;
                                                field553 = var264;
                                            }
                                            field319.method2621(113);
                                            field319.method2394(field2182);
                                            field319.method2360(var259);
                                            field319.method2414(var260);
                                            field319.method2394(var266);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 37) {
                                            class33.field734 = 0;
                                            for (int var273 = 0; var273 < 2048; var273++) {
                                                class33.field733[var273] = null;
                                                class33.field732[var273] = 1;
                                            }
                                            for (int var274 = 0; var274 < 2048; var274++) {
                                                field398[var274] = null;
                                            }
                                            class33.method2980(field321);
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 165) {
                                            int var275 = field321.method2372();
                                            if (field321.method2372() == 0) {
                                                field500[var275] = new class220();
                                                field321.field1982 += 18;
                                            } else {
                                                field321.field1982--;
                                                field500[var275] = new class220(field321, false);
                                            }
                                            field470 = field460;
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 76) {
                                            for (int var276 = 0; var276 < field398.length; var276++) {
                                                if (field398[var276] != null) {
                                                    field398[var276].field830 = -1;
                                                }
                                            }
                                            for (int var277 = 0; var277 < field314.length; var277++) {
                                                if (field314[var277] != null) {
                                                    field314[var277].field830 = -1;
                                                }
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 57) {
                                            int var278 = field321.method2416();
                                            int var279 = field321.method2377();
                                            class4 var280 = (class4) field305.method3571((long) var278);
                                            class4 var281 = (class4) field305.method3571((long) var279);
                                            if (var281 != null) {
                                                method121(var281, var280 == null || var280.field64 != var281.field64);
                                            }
                                            if (var280 != null) {
                                                var280.method3700();
                                                field305.method3574(var280, (long) var279);
                                            }
                                            class173 var282 = class173.method1002(var278);
                                            if (var282 != null) {
                                                method908(var282);
                                            }
                                            class173 var283 = class173.method1002(var279);
                                            if (var283 != null) {
                                                method908(var283);
                                                method735(Statics.field2858[var283.field2735 >>> 16], var283, true);
                                            }
                                            if (field439 != -1) {
                                                method189(field439, 1);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 56) {
                                            if (field439 != -1) {
                                                method189(field439, 0);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        if (field447 == 176) {
                                            int var284 = field321.method2407();
                                            if (var284 == 65535) {
                                                var284 = -1;
                                            }
                                            int var285 = field321.method2416();
                                            int var286 = field321.method2377();
                                            class173 var287 = class173.method1002(var286);
                                            if (var287.field2734) {
                                                var287.field2853 = var284;
                                                var287.field2854 = var285;
                                                class52 var289 = class52.method154(var284);
                                                var287.field2784 = var289.field1106;
                                                var287.field2761 = var289.field1104;
                                                var287.field2786 = var289.field1090;
                                                var287.field2782 = var289.field1140;
                                                var287.field2783 = var289.field1131;
                                                var287.field2788 = var289.field1130;
                                                if (var289.field1111 == 1) {
                                                    var287.field2780 = 1;
                                                } else {
                                                    var287.field2780 = 2;
                                                }
                                                if (var287.field2790 > 0) {
                                                    var287.field2788 = var287.field2788 * 32 / var287.field2790;
                                                } else if (var287.field2861 > 0) {
                                                    var287.field2788 = var287.field2788 * 32 / var287.field2861;
                                                }
                                                method908(var287);
                                            } else {
                                                if (var284 == -1) {
                                                    var287.field2778 = 0;
                                                    field447 = -1;
                                                    var11 = true;
                                                    break label3387;
                                                }
                                                class52 var288 = class52.method154(var284);
                                                var287.field2778 = 4;
                                                var287.field2777 = var284;
                                                var287.field2784 = var288.field1106;
                                                var287.field2761 = var288.field1104;
                                                var287.field2788 = var288.field1130 * 100 / var285;
                                                method908(var287);
                                            }
                                            field447 = -1;
                                            var11 = true;
                                            break label3387;
                                        }
                                        class148.method769("" + field447 + class2.field19 + field327 + class2.field19 + field328 + class2.field19 + field290, (Throwable) null);
                                        method1587();
                                    } catch (IOException var462) {
                                        if (field401 > 0) {
                                            method1587();
                                        } else {
                                            method695(40);
                                            Statics.field139 = Statics.field171;
                                            Statics.field171 = null;
                                        }
                                    } catch (Exception var463) {
                                        String var292 = "" + field447 + class2.field19 + field327 + class2.field19 + field328 + class2.field19 + field290 + class2.field19 + (Statics.field1054 + Statics.field13.field810[0]) + class2.field19 + (Statics.field2630 + Statics.field13.field817[0]) + class2.field19;
                                        for (int var293 = 0; var293 < field290 && var293 < 50; var293++) {
                                            var292 = var292 + field321.field1981[var293] + class2.field19;
                                        }
                                        class148.method769(var292, var463);
                                        method1587();
                                    }
                                    var11 = true;
                                }
                            }
                            if (!var11) {
                                break;
                            }
                        }
                        if (field297 == 30) {
                            while (class211.method2156()) {
                                field319.method2621(13);
                                field319.method2357(0);
                                int var294 = field319.field1982;
                                class211.method2838(field319);
                                field319.method2369(field319.field1982 - var294);
                            }
                            Object var295 = Statics.field2633.field189;
                            synchronized (Statics.field2633.field189) {
                                if (!field276) {
                                    Statics.field2633.field191 = 0;
                                } else if (class140.field2141 != 0 || Statics.field2633.field191 >= 40) {
                                    field319.method2621(22);
                                    field319.method2357(0);
                                    int var296 = field319.field1982;
                                    int var297 = 0;
                                    for (int var298 = 0; var298 < Statics.field2633.field191 && field319.field1982 - var296 < 240; var298++) {
                                        var297++;
                                        int var299 = Statics.field2633.field192[var298];
                                        if (var299 < 0) {
                                            var299 = 0;
                                        } else if (var299 > 502) {
                                            var299 = 502;
                                        }
                                        int var300 = Statics.field2633.field188[var298];
                                        if (var300 < 0) {
                                            var300 = 0;
                                        } else if (var300 > 764) {
                                            var300 = 764;
                                        }
                                        int var301 = var299 * 765 + var300;
                                        if (Statics.field2633.field192[var298] == -1 && Statics.field2633.field188[var298] == -1) {
                                            var300 = -1;
                                            var299 = -1;
                                            var301 = 524287;
                                        }
                                        if (field289 != var300 || field299 != var299) {
                                            int var302 = var300 - field289;
                                            field289 = var300;
                                            int var303 = var299 - field299;
                                            field299 = var299;
                                            if (field551 < 8 && var302 >= -32 && var302 <= 31 && var303 >= -32 && var303 <= 31) {
                                                var302 += 32;
                                                var303 += 32;
                                                field319.method2358((field551 << 12) + (var302 << 6) + var303);
                                                field551 = 0;
                                            } else if (field551 < 8) {
                                                field319.method2359((field551 << 19) + 8388608 + var301);
                                                field551 = 0;
                                            } else {
                                                field319.method2360((field551 << 19) + -1073741824 + var301);
                                                field551 = 0;
                                            }
                                        } else if (field551 < 2047) {
                                            field551++;
                                        }
                                    }
                                    field319.method2369(field319.field1982 - var296);
                                    if (var297 >= Statics.field2633.field191) {
                                        Statics.field2633.field191 = 0;
                                    } else {
                                        Statics.field2633.field191 -= var297;
                                        for (int var304 = 0; var304 < Statics.field2633.field191; var304++) {
                                            Statics.field2633.field188[var304] = Statics.field2633.field188[var297 + var304];
                                            Statics.field2633.field192[var304] = Statics.field2633.field192[var297 + var304];
                                        }
                                    }
                                }
                            }
                            if (class140.field2141 == 1 || !Statics.field753 && class140.field2141 == 4 || class140.field2141 == 2) {
                                long var306 = (class140.field2144 - field288 * -1L) / 50L;
                                if (var306 > 4095L) {
                                    var306 = 4095L;
                                }
                                field288 = class140.field2144 * -1L;
                                int var308 = class140.field2143;
                                if (var308 < 0) {
                                    var308 = 0;
                                } else if (var308 > Statics.field2102) {
                                    var308 = Statics.field2102;
                                }
                                int var309 = class140.field2131;
                                if (var309 < 0) {
                                    var309 = 0;
                                } else if (var309 > Statics.field2049) {
                                    var309 = Statics.field2049;
                                }
                                int var310 = (int) var306;
                                field319.method2621(192);
                                field319.method2358((var310 << 1) + (class140.field2141 == 2 ? 1 : 0));
                                field319.method2358(var309);
                                field319.method2358(var308);
                            }
                            if (class137.field2109 > 0) {
                                field319.method2621(241);
                                field319.method2358(0);
                                int var311 = field319.field1982;
                                long var312 = class115.method2038();
                                for (int var314 = 0; var314 < class137.field2109; var314++) {
                                    long var315 = var312 - field274;
                                    if (var315 > 16777215L) {
                                        var315 = 16777215L;
                                    }
                                    field274 = var312;
                                    field319.method2468(class137.field2108[var314]);
                                    field319.method2411((int) var315);
                                }
                                field319.method2555(field319.field1982 - var311);
                            }
                            if (field368 > 0) {
                                field368--;
                            }
                            if (class137.field2115[96] || class137.field2115[97] || class137.field2115[98] || class137.field2115[99]) {
                                field369 = true;
                            }
                            if (field369 && field368 <= 0) {
                                field368 = 20;
                                field369 = false;
                                field319.method2621(202);
                                field319.method2403(field435);
                                field319.method2566(field361);
                            }
                            if (Statics.field1517 && !field292) {
                                field292 = true;
                                field319.method2621(250);
                                field319.method2357(1);
                            }
                            if (!Statics.field1517 && field292) {
                                field292 = false;
                                field319.method2621(250);
                                field319.method2357(0);
                            }
                            if (Statics.field135 != field504) {
                                field504 = Statics.field135;
                                int var317 = Statics.field135;
                                int[] var318 = Statics.field1656.field1395;
                                int var319 = var318.length;
                                for (int var320 = 0; var320 < var319; var320++) {
                                    var318[var320] = 0;
                                }
                                int var321 = 1;
                                while (true) {
                                    if (var321 >= 103) {
                                        int var324 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var325 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field1656.method1647();
                                        for (int var326 = 1; var326 < 103; var326++) {
                                            for (int var327 = 1; var327 < 103; var327++) {
                                                if ((class6.field87[var317][var327][var326] & 0x18) == 0) {
                                                    method119(var317, var327, var326, var324, var325);
                                                }
                                                if (var317 < 3 && (class6.field87[var317 + 1][var327][var326] & 0x8) != 0) {
                                                    method119(var317 + 1, var327, var326, var324, var325);
                                                }
                                            }
                                        }
                                        field505 = 0;
                                        for (int var328 = 0; var328 < 104; var328++) {
                                            for (int var329 = 0; var329 < 104; var329++) {
                                                int var330 = Statics.field611.method1943(Statics.field135, var328, var329);
                                                if (var330 != 0) {
                                                    int var331 = var330 >> 14 & 0x7FFF;
                                                    int var332 = class41.method736(var331).field911;
                                                    if (var332 >= 0) {
                                                        int var333 = var328;
                                                        int var334 = var329;
                                                        if (var332 != 22 && var332 != 29 && var332 != 34 && var332 != 36 && var332 != 46 && var332 != 47 && var332 != 48) {
                                                            int[][] var335 = field336[Statics.field135].field1880;
                                                            for (int var336 = 0; var336 < 10; var336++) {
                                                                int var337 = (int) (Math.random() * 4.0D);
                                                                if (var337 == 0 && var333 > 0 && var333 > var328 - 3 && (var335[var333 - 1][var334] & 0x1240108) == 0) {
                                                                    var333--;
                                                                }
                                                                if (var337 == 1 && var333 < 103 && var333 < var328 + 3 && (var335[var333 + 1][var334] & 0x1240180) == 0) {
                                                                    var333++;
                                                                }
                                                                if (var337 == 2 && var334 > 0 && var334 > var329 - 3 && (var335[var333][var334 - 1] & 0x1240102) == 0) {
                                                                    var334--;
                                                                }
                                                                if (var337 == 3 && var334 < 103 && var334 < var329 + 3 && (var335[var333][var334 + 1] & 0x1240120) == 0) {
                                                                    var334++;
                                                                }
                                                            }
                                                        }
                                                        field508[field505] = Statics.field193[var332];
                                                        field323[field505] = var333;
                                                        field507[field505] = var334;
                                                        field505++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field1441.method1591();
                                        break;
                                    }
                                    int var322 = (103 - var321) * 2048 + 24628;
                                    for (int var323 = 1; var323 < 103; var323++) {
                                        if ((class6.field87[var317][var323][var321] & 0x18) == 0) {
                                            Statics.field611.method1827(var318, var322, 512, var317, var323, var321);
                                        }
                                        if (var317 < 3 && (class6.field87[var317 + 1][var323][var321] & 0x8) != 0) {
                                            Statics.field611.method1827(var318, var322, 512, var317 + 1, var323, var321);
                                        }
                                        var322 += 4;
                                    }
                                    var321++;
                                }
                            }
                            if (field297 == 30) {
                                for (class17 var338 = (class17) field409.method3606(); var338 != null; var338 = (class17) field409.method3608()) {
                                    if (var338.field234 > 0) {
                                        var338.field234--;
                                    }
                                    if (var338.field234 == 0) {
                                        if (var338.field233 >= 0) {
                                            int var339 = var338.field233;
                                            int var340 = var338.field229;
                                            class41 var341 = class41.method736(var339);
                                            if (var340 == 11) {
                                                var340 = 10;
                                            }
                                            if (var340 >= 5 && var340 <= 8) {
                                                var340 = 4;
                                            }
                                            boolean var342 = var341.method814(var340);
                                            if (!var342) {
                                                continue;
                                            }
                                        }
                                        method201(var338.field227, var338.field224, var338.field225, var338.field226, var338.field233, var338.field228, var338.field229);
                                        var338.method3700();
                                    } else {
                                        if (var338.field223 > 0) {
                                            var338.field223--;
                                        }
                                        if (var338.field223 == 0 && var338.field225 >= 1 && var338.field226 >= 1 && var338.field225 <= 102 && var338.field226 <= 102) {
                                            if (var338.field230 >= 0) {
                                                int var343 = var338.field230;
                                                int var344 = var338.field232;
                                                class41 var345 = class41.method736(var343);
                                                if (var344 == 11) {
                                                    var344 = 10;
                                                }
                                                if (var344 >= 5 && var344 <= 8) {
                                                    var344 = 4;
                                                }
                                                boolean var346 = var345.method814(var344);
                                                if (!var346) {
                                                    continue;
                                                }
                                            }
                                            method201(var338.field227, var338.field224, var338.field225, var338.field226, var338.field230, var338.field231, var338.field232);
                                            var338.field223 = -1;
                                            if (var338.field233 == var338.field230 && var338.field233 == -1) {
                                                var338.method3700();
                                            } else if (var338.field233 == var338.field230 && var338.field231 == var338.field228 && var338.field232 == var338.field229) {
                                                var338.method3700();
                                            }
                                        }
                                    }
                                }
                                int var10002;
                                for (int var347 = 0; var347 < field517; var347++) {
                                    var10002 = field520[var347]--;
                                    if (field520[var347] >= -10) {
                                        class59 var349 = field522[var347];
                                        if (var349 == null) {
                                            class59 var465 = (class59) null;
                                            var349 = class59.method1227(Statics.field2584, field463[var347], 0);
                                            if (var349 == null) {
                                                continue;
                                            }
                                            field520[var347] += var349.method1224();
                                            field522[var347] = var349;
                                        }
                                        if (field520[var347] < 0) {
                                            int var356;
                                            if (field468[var347] == 0) {
                                                var356 = field515;
                                            } else {
                                                int var350 = (field468[var347] & 0xFF) * 128;
                                                int var351 = field468[var347] >> 16 & 0xFF;
                                                int var352 = var351 * 128 + 64 - Statics.field13.field847;
                                                if (var352 < 0) {
                                                    var352 = -var352;
                                                }
                                                int var353 = field468[var347] >> 8 & 0xFF;
                                                int var354 = var353 * 128 + 64 - Statics.field13.field835;
                                                if (var354 < 0) {
                                                    var354 = -var354;
                                                }
                                                int var355 = var352 + var354 - 128;
                                                if (var355 > var350) {
                                                    field520[var347] = -100;
                                                    continue;
                                                }
                                                if (var355 < 0) {
                                                    var355 = 0;
                                                }
                                                var356 = field516 * (var350 - var355) / var350;
                                            }
                                            if (var356 > 0) {
                                                class63 var357 = var349.method1225().method1262(Statics.field1775);
                                                class65 var358 = class65.method1401(var357, 100, var356);
                                                var358.method1290(field519[var347] - 1);
                                                Statics.field236.method1166(var358);
                                            }
                                            field520[var347] = -100;
                                        }
                                    } else {
                                        field517--;
                                        for (int var348 = var347; var348 < field517; var348++) {
                                            field463[var348] = field463[var348 + 1];
                                            field522[var348] = field522[var348 + 1];
                                            field519[var348] = field519[var348 + 1];
                                            field520[var348] = field520[var348 + 1];
                                            field468[var348] = field468[var348 + 1];
                                        }
                                        var347--;
                                    }
                                }
                                if (field514) {
                                    boolean var359;
                                    if (class183.field2941 == 0) {
                                        var359 = Statics.field2944.method3422();
                                    } else {
                                        var359 = true;
                                    }
                                    if (!var359) {
                                        if (field544 != 0 && field513 != -1) {
                                            class183.method869(Statics.field2166, field513, 0, field544, false);
                                        }
                                        field514 = false;
                                    }
                                }
                                field324++;
                                if (field324 <= 750) {
                                    method3222();
                                    for (int var360 = 0; var360 < field315; var360++) {
                                        int var361 = field316[var360];
                                        class35 var362 = field314[var361];
                                        if (var362 != null) {
                                            method600(var362, var362.field762.field872);
                                        }
                                    }
                                    method3220();
                                    field421++;
                                    if (field388 != 0) {
                                        field362 += 20;
                                        if (field362 >= 400) {
                                            field388 = 0;
                                        }
                                    }
                                    if (Statics.field157 != null) {
                                        field307++;
                                        if (field307 >= 15) {
                                            method908(Statics.field157);
                                            Statics.field157 = null;
                                        }
                                    }
                                    class173 var363 = Statics.field66;
                                    class173 var364 = Statics.field141;
                                    Statics.field66 = null;
                                    Statics.field141 = null;
                                    field452 = null;
                                    field456 = false;
                                    field453 = false;
                                    field498 = 0;
                                    while (true) {
                                        while (class137.method176() && field498 < 128) {
                                            if (field442 >= 2 && class137.field2115[82] && Statics.field2096 == 66) {
                                                String var365 = class12.method1960();
                                                Statics.field1086.setContents(new StringSelection(var365), (ClipboardOwner) null);
                                            } else {
                                                field496[field498] = Statics.field2096;
                                                field499[field498] = Statics.field209;
                                                field498++;
                                            }
                                        }
                                        if (field439 != -1) {
                                            method3533(field439, 0, 0, Statics.field2049, Statics.field2102, 0, 0);
                                        }
                                        field460++;
                                        while (true) {
                                            class1 var366;
                                            class173 var367;
                                            class173 var368;
                                            do {
                                                var366 = (class1) field358.method3604();
                                                if (var366 == null) {
                                                    while (true) {
                                                        class1 var369;
                                                        class173 var370;
                                                        class173 var371;
                                                        do {
                                                            var369 = (class1) field476.method3604();
                                                            if (var369 == null) {
                                                                while (true) {
                                                                    class1 var372;
                                                                    class173 var373;
                                                                    class173 var374;
                                                                    do {
                                                                        var372 = (class1) field474.method3604();
                                                                        if (var372 == null) {
                                                                            boolean var375 = false;
                                                                            while (!var375) {
                                                                                var375 = true;
                                                                                for (int var376 = 0; var376 < field417 - 1; var376++) {
                                                                                    if (field420[var376] < 1000 && field420[var376 + 1] > 1000) {
                                                                                        String var377 = field423[var376];
                                                                                        field423[var376] = field423[var376 + 1];
                                                                                        field423[var376 + 1] = var377;
                                                                                        String var378 = field298[var376];
                                                                                        field298[var376] = field298[var376 + 1];
                                                                                        field298[var376 + 1] = var378;
                                                                                        int var379 = field420[var376];
                                                                                        field420[var376] = field420[var376 + 1];
                                                                                        field420[var376 + 1] = var379;
                                                                                        int var380 = field418[var376];
                                                                                        field418[var376] = field418[var376 + 1];
                                                                                        field418[var376 + 1] = var380;
                                                                                        int var381 = field419[var376];
                                                                                        field419[var376] = field419[var376 + 1];
                                                                                        field419[var376 + 1] = var381;
                                                                                        int var382 = field416[var376];
                                                                                        field416[var376] = field416[var376 + 1];
                                                                                        field416[var376 + 1] = var382;
                                                                                        var375 = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (Statics.field27 == null && field448 == null) {
                                                                                int var383 = class140.field2141;
                                                                                if (field501) {
                                                                                    if (var383 != 1 && (Statics.field753 || var383 != 4)) {
                                                                                        int var384 = class140.field2135;
                                                                                        int var385 = class140.field2136;
                                                                                        if (var384 < Statics.field254 - 10 || var384 > Statics.field254 + Statics.field10 + 10 || var385 < Statics.field794 - 10 || var385 > Statics.field794 + Statics.field268 + 10) {
                                                                                            field501 = false;
                                                                                            method3529(Statics.field254, Statics.field794, Statics.field10, Statics.field268);
                                                                                        }
                                                                                    }
                                                                                    if (var383 == 1 || !Statics.field753 && var383 == 4) {
                                                                                        int var386 = Statics.field254;
                                                                                        int var387 = Statics.field794;
                                                                                        int var388 = Statics.field10;
                                                                                        int var389 = class140.field2131;
                                                                                        int var390 = class140.field2143;
                                                                                        int var391 = -1;
                                                                                        for (int var392 = 0; var392 < field417; var392++) {
                                                                                            int var393 = (field417 - 1 - var392) * 15 + var387 + 31;
                                                                                            if (var389 > var386 && var389 < var386 + var388 && var390 > var393 - 13 && var390 < var393 + 3) {
                                                                                                var391 = var392;
                                                                                            }
                                                                                        }
                                                                                        if (var391 != -1) {
                                                                                            method198(var391);
                                                                                        }
                                                                                        field501 = false;
                                                                                        method3529(Statics.field254, Statics.field794, Statics.field10, Statics.field268);
                                                                                    }
                                                                                } else {
                                                                                    label3439: {
                                                                                        int var395;
                                                                                        int var396;
                                                                                        label3508: {
                                                                                            if ((var383 == 1 || !Statics.field753 && var383 == 4) && field417 > 0) {
                                                                                                int var394 = field420[field417 - 1];
                                                                                                if (var394 == 39 || var394 == 40 || var394 == 41 || var394 == 42 || var394 == 43 || var394 == 33 || var394 == 34 || var394 == 35 || var394 == 36 || var394 == 37 || var394 == 38 || var394 == 1005) {
                                                                                                    var395 = field418[field417 - 1];
                                                                                                    var396 = field419[field417 - 1];
                                                                                                    class173 var397 = class173.method1002(var396);
                                                                                                    if (class178.method207(method122(var397))) {
                                                                                                        break label3508;
                                                                                                    }
                                                                                                    int var398 = method122(var397);
                                                                                                    boolean var399 = (var398 >> 29 & 0x1) != 0;
                                                                                                    if (var399) {
                                                                                                        break label3508;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (var383 == 1 || !Statics.field753 && var383 == 4) {
                                                                                                label3501: {
                                                                                                    if (field415 != 1 || field417 <= 2) {
                                                                                                        int var405 = field417 - 1;
                                                                                                        boolean var406;
                                                                                                        if (var405 < 0) {
                                                                                                            var406 = false;
                                                                                                        } else {
                                                                                                            int var407 = field420[var405];
                                                                                                            if (var407 >= 2000) {
                                                                                                                var407 -= 2000;
                                                                                                            }
                                                                                                            if (var407 == 1007) {
                                                                                                                var406 = true;
                                                                                                            } else {
                                                                                                                var406 = false;
                                                                                                            }
                                                                                                        }
                                                                                                        if (!var406) {
                                                                                                            break label3501;
                                                                                                        }
                                                                                                    }
                                                                                                    var383 = 2;
                                                                                                }
                                                                                            }
                                                                                            if ((var383 == 1 || !Statics.field753 && var383 == 4) && field417 > 0) {
                                                                                                method198(field417 - 1);
                                                                                            }
                                                                                            if (var383 == 2 && field417 > 0) {
                                                                                                method2977(class140.field2131, class140.field2143);
                                                                                            }
                                                                                            break label3439;
                                                                                        }
                                                                                        if (Statics.field27 != null && !field441 && field415 != 1) {
                                                                                            int var400 = field417 - 1;
                                                                                            boolean var401;
                                                                                            if (var400 < 0) {
                                                                                                var401 = false;
                                                                                            } else {
                                                                                                int var402 = field420[var400];
                                                                                                if (var402 >= 2000) {
                                                                                                    var402 -= 2000;
                                                                                                }
                                                                                                if (var402 == 1007) {
                                                                                                    var401 = true;
                                                                                                } else {
                                                                                                    var401 = false;
                                                                                                }
                                                                                            }
                                                                                            if (!var401 && field417 > 0) {
                                                                                                int var403 = field392;
                                                                                                int var404 = field510;
                                                                                                method2171(Statics.field2626, var403, var404);
                                                                                                Statics.field2626 = null;
                                                                                            }
                                                                                        }
                                                                                        field441 = false;
                                                                                        field490 = 0;
                                                                                        if (Statics.field27 != null) {
                                                                                            method908(Statics.field27);
                                                                                        }
                                                                                        Statics.field27 = class173.method1002(var396);
                                                                                        field391 = var395;
                                                                                        field392 = class140.field2131;
                                                                                        field510 = class140.field2143;
                                                                                        if (field417 > 0) {
                                                                                            method3291(field417 - 1);
                                                                                        }
                                                                                        method908(Statics.field27);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field448 != null) {
                                                                                method2162();
                                                                            }
                                                                            if (Statics.field27 != null) {
                                                                                method908(Statics.field27);
                                                                                field490++;
                                                                                if (class140.field2134 == 0) {
                                                                                    if (!field441) {
                                                                                        label2236: {
                                                                                            label2235: {
                                                                                                if (field415 != 1) {
                                                                                                    int var416 = field417 - 1;
                                                                                                    boolean var417;
                                                                                                    if (var416 < 0) {
                                                                                                        var417 = false;
                                                                                                    } else {
                                                                                                        int var418 = field420[var416];
                                                                                                        if (var418 >= 2000) {
                                                                                                            var418 -= 2000;
                                                                                                        }
                                                                                                        if (var418 == 1007) {
                                                                                                            var417 = true;
                                                                                                        } else {
                                                                                                            var417 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var417) {
                                                                                                        break label2235;
                                                                                                    }
                                                                                                }
                                                                                                if (field417 > 2) {
                                                                                                    method2977(field392, field510);
                                                                                                    break label2236;
                                                                                                }
                                                                                            }
                                                                                            if (field417 > 0) {
                                                                                                int var419 = field392;
                                                                                                int var420 = field510;
                                                                                                method2171(Statics.field2626, var419, var420);
                                                                                                Statics.field2626 = null;
                                                                                            }
                                                                                        }
                                                                                    } else if (Statics.field679 == Statics.field27 && field394 != field391) {
                                                                                        class173 var408 = Statics.field27;
                                                                                        byte var409 = 0;
                                                                                        if (field294 == 1 && var408.field2739 == 206) {
                                                                                            var409 = 1;
                                                                                        }
                                                                                        if (var408.field2851[field394] <= 0) {
                                                                                            var409 = 0;
                                                                                        }
                                                                                        int var410 = method122(var408);
                                                                                        boolean var411 = (var410 >> 29 & 0x1) != 0;
                                                                                        if (var411) {
                                                                                            int var412 = field391;
                                                                                            int var413 = field394;
                                                                                            var408.field2851[var413] = var408.field2851[var412];
                                                                                            var408.field2852[var413] = var408.field2852[var412];
                                                                                            var408.field2851[var412] = -1;
                                                                                            var408.field2852[var412] = 0;
                                                                                        } else if (var409 == 1) {
                                                                                            int var414 = field391;
                                                                                            int var415 = field394;
                                                                                            while (var414 != var415) {
                                                                                                if (var414 > var415) {
                                                                                                    var408.method3229(var414 - 1, var414);
                                                                                                    var414--;
                                                                                                } else if (var414 < var415) {
                                                                                                    var408.method3229(var414 + 1, var414);
                                                                                                    var414++;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var408.method3229(field394, field391);
                                                                                        }
                                                                                        field319.method2621(201);
                                                                                        field319.method2358(field391);
                                                                                        field319.method2383(field394);
                                                                                        field319.method2360(Statics.field27.field2735);
                                                                                        field319.method2394(var409);
                                                                                    }
                                                                                    field307 = 10;
                                                                                    class140.field2141 = 0;
                                                                                    Statics.field27 = null;
                                                                                } else if (field490 >= 5 && (class140.field2135 > field392 + 5 || class140.field2135 < field392 - 5 || class140.field2136 > field510 + 5 || class140.field2136 < field510 - 5)) {
                                                                                    field441 = true;
                                                                                }
                                                                            }
                                                                            if (class86.field1479 != -1) {
                                                                                int var421 = class86.field1479;
                                                                                int var422 = class86.field1480;
                                                                                field319.method2621(166);
                                                                                field319.method2357(5);
                                                                                field319.method2358(Statics.field2630 + var422);
                                                                                field319.method2468(class137.field2115[82] ? (class137.field2115[81] ? 2 : 1) : 0);
                                                                                field319.method2566(Statics.field1054 + var421);
                                                                                class86.field1479 = -1;
                                                                                field521 = class140.field2131;
                                                                                field400 = class140.field2143;
                                                                                field388 = 1;
                                                                                field362 = 0;
                                                                                field538 = var421;
                                                                                field295 = var422;
                                                                            }
                                                                            if (Statics.field66 != var363) {
                                                                                if (var363 != null) {
                                                                                    method908(var363);
                                                                                }
                                                                                if (Statics.field66 != null) {
                                                                                    method908(Statics.field66);
                                                                                }
                                                                            }
                                                                            if (Statics.field141 != var364 && field426 == field286) {
                                                                                if (var364 != null) {
                                                                                    method908(var364);
                                                                                }
                                                                                if (Statics.field141 != null) {
                                                                                    method908(Statics.field141);
                                                                                }
                                                                            }
                                                                            if (Statics.field141 == null) {
                                                                                if (field426 > 0) {
                                                                                    field426--;
                                                                                }
                                                                            } else if (field426 < field286) {
                                                                                field426++;
                                                                                if (field426 == field286) {
                                                                                    method908(Statics.field141);
                                                                                }
                                                                            }
                                                                            int var423 = field523 + Statics.field13.field847;
                                                                            int var424 = field342 + Statics.field13.field835;
                                                                            if (Statics.field255 - var423 < -500 || Statics.field255 - var423 > 500 || Statics.field610 - var424 < -500 || Statics.field610 - var424 > 500) {
                                                                                Statics.field255 = var423;
                                                                                Statics.field610 = var424;
                                                                            }
                                                                            if (Statics.field255 != var423) {
                                                                                Statics.field255 += (var423 - Statics.field255) / 16;
                                                                            }
                                                                            if (Statics.field610 != var424) {
                                                                                Statics.field610 += (var424 - Statics.field610) / 16;
                                                                            }
                                                                            if (class140.field2134 == 4 && Statics.field753) {
                                                                                int var425 = class140.field2136 - field366;
                                                                                field364 = var425 * 2;
                                                                                field366 = var425 == -1 || var425 == 1 ? class140.field2136 : (field366 + class140.field2136) / 2;
                                                                                int var426 = field365 - class140.field2135;
                                                                                field363 = var426 * 2;
                                                                                field365 = var426 == -1 || var426 == 1 ? class140.field2135 : (field365 + class140.field2135) / 2;
                                                                            } else {
                                                                                if (class137.field2115[96]) {
                                                                                    field363 += (-24 - field363) / 2;
                                                                                } else if (class137.field2115[97]) {
                                                                                    field363 += (24 - field363) / 2;
                                                                                } else {
                                                                                    field363 /= 2;
                                                                                }
                                                                                if (class137.field2115[98]) {
                                                                                    field364 += (12 - field364) / 2;
                                                                                } else if (class137.field2115[99]) {
                                                                                    field364 += (-12 - field364) / 2;
                                                                                } else {
                                                                                    field364 /= 2;
                                                                                }
                                                                                field366 = class140.field2136;
                                                                                field365 = class140.field2135;
                                                                            }
                                                                            field435 = field363 / 2 + field435 & 0x7FF;
                                                                            field361 += field364 / 2;
                                                                            if (field361 < 128) {
                                                                                field361 = 128;
                                                                            }
                                                                            if (field361 > 383) {
                                                                                field361 = 383;
                                                                            }
                                                                            int var427 = Statics.field255 >> 7;
                                                                            int var428 = Statics.field610 >> 7;
                                                                            int var429 = method745(Statics.field255, Statics.field610, Statics.field135);
                                                                            int var430 = 0;
                                                                            if (var427 > 3 && var428 > 3 && var427 < 100 && var428 < 100) {
                                                                                for (int var431 = var427 - 4; var431 <= var427 + 4; var431++) {
                                                                                    for (int var432 = var428 - 4; var432 <= var428 + 4; var432++) {
                                                                                        int var433 = Statics.field135;
                                                                                        if (var433 < 3 && (class6.field87[1][var431][var432] & 0x2) == 2) {
                                                                                            var433++;
                                                                                        }
                                                                                        int var434 = var429 - class6.field80[var433][var431][var432];
                                                                                        if (var434 > var430) {
                                                                                            var430 = var434;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var435 = var430 * 192;
                                                                            if (var435 > 98048) {
                                                                                var435 = 98048;
                                                                            }
                                                                            if (var435 < 32768) {
                                                                                var435 = 32768;
                                                                            }
                                                                            if (var435 > field370) {
                                                                                field370 += (var435 - field370) / 24;
                                                                            } else if (var435 < field370) {
                                                                                field370 += (var435 - field370) / 80;
                                                                            }
                                                                            if (field335) {
                                                                                int var436 = Statics.field777 * 128 + 64;
                                                                                int var437 = Statics.field1989 * 128 + 64;
                                                                                int var438 = method745(var436, var437, Statics.field135) - Statics.field1089;
                                                                                if (Statics.field673 < var436) {
                                                                                    Statics.field673 += Statics.field1541 * (var436 - Statics.field673) / 1000 + Statics.field1964;
                                                                                    if (Statics.field673 > var436) {
                                                                                        Statics.field673 = var436;
                                                                                    }
                                                                                }
                                                                                if (Statics.field673 > var436) {
                                                                                    Statics.field673 -= Statics.field1541 * (Statics.field673 - var436) / 1000 + Statics.field1964;
                                                                                    if (Statics.field673 < var436) {
                                                                                        Statics.field673 = var436;
                                                                                    }
                                                                                }
                                                                                if (Statics.field2054 < var438) {
                                                                                    Statics.field2054 += Statics.field1541 * (var438 - Statics.field2054) / 1000 + Statics.field1964;
                                                                                    if (Statics.field2054 > var438) {
                                                                                        Statics.field2054 = var438;
                                                                                    }
                                                                                }
                                                                                if (Statics.field2054 > var438) {
                                                                                    Statics.field2054 -= Statics.field1541 * (Statics.field2054 - var438) / 1000 + Statics.field1964;
                                                                                    if (Statics.field2054 < var438) {
                                                                                        Statics.field2054 = var438;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1375 < var437) {
                                                                                    Statics.field1375 += Statics.field1541 * (var437 - Statics.field1375) / 1000 + Statics.field1964;
                                                                                    if (Statics.field1375 > var437) {
                                                                                        Statics.field1375 = var437;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1375 > var437) {
                                                                                    Statics.field1375 -= Statics.field1541 * (Statics.field1375 - var437) / 1000 + Statics.field1964;
                                                                                    if (Statics.field1375 < var437) {
                                                                                        Statics.field1375 = var437;
                                                                                    }
                                                                                }
                                                                                int var439 = Statics.field2022 * 128 + 64;
                                                                                int var440 = Statics.field1379 * 128 + 64;
                                                                                int var441 = method745(var439, var440, Statics.field135) - Statics.field2061;
                                                                                int var442 = var439 - Statics.field673;
                                                                                int var443 = var441 - Statics.field2054;
                                                                                int var444 = var440 - Statics.field1375;
                                                                                int var445 = (int) Math.sqrt((double) (var442 * var442 + var444 * var444));
                                                                                int var446 = (int) (Math.atan2((double) var443, (double) var445) * 325.949D) & 0x7FF;
                                                                                int var447 = (int) (Math.atan2((double) var442, (double) var444) * -325.949D) & 0x7FF;
                                                                                if (var446 < 128) {
                                                                                    var446 = 128;
                                                                                }
                                                                                if (var446 > 383) {
                                                                                    var446 = 383;
                                                                                }
                                                                                if (Statics.field170 < var446) {
                                                                                    Statics.field170 += Statics.field3106 * (var446 - Statics.field170) / 1000 + Statics.field725;
                                                                                    if (Statics.field170 > var446) {
                                                                                        Statics.field170 = var446;
                                                                                    }
                                                                                }
                                                                                if (Statics.field170 > var446) {
                                                                                    Statics.field170 -= Statics.field3106 * (Statics.field170 - var446) / 1000 + Statics.field725;
                                                                                    if (Statics.field170 < var446) {
                                                                                        Statics.field170 = var446;
                                                                                    }
                                                                                }
                                                                                int var448 = var447 - Statics.field1435;
                                                                                if (var448 > 1024) {
                                                                                    var448 -= 2048;
                                                                                }
                                                                                if (var448 < -1024) {
                                                                                    var448 += 2048;
                                                                                }
                                                                                if (var448 > 0) {
                                                                                    Statics.field1435 += Statics.field3106 * var448 / 1000 + Statics.field725;
                                                                                    Statics.field1435 &= 0x7FF;
                                                                                }
                                                                                if (var448 < 0) {
                                                                                    Statics.field1435 -= Statics.field3106 * -var448 / 1000 + Statics.field725;
                                                                                    Statics.field1435 &= 0x7FF;
                                                                                }
                                                                                int var449 = var447 - Statics.field1435;
                                                                                if (var449 > 1024) {
                                                                                    var449 -= 2048;
                                                                                }
                                                                                if (var449 < -1024) {
                                                                                    var449 += 2048;
                                                                                }
                                                                                if (var449 < 0 && var448 > 0 || var449 > 0 && var448 < 0) {
                                                                                    Statics.field1435 = var447;
                                                                                }
                                                                            }
                                                                            for (int var450 = 0; var450 < 5; var450++) {
                                                                                var10002 = field475[var450]++;
                                                                            }
                                                                            Statics.field1440.method224();
                                                                            int var451 = class140.method2722();
                                                                            int var452 = class137.field2095;
                                                                            if (var451 > 15000 && var452 > 15000) {
                                                                                field401 = 250;
                                                                                class140.method670(14500);
                                                                                field319.method2621(191);
                                                                            }
                                                                            field346++;
                                                                            if (field346 > 500) {
                                                                                field346 = 0;
                                                                                int var454 = (int) (Math.random() * 8.0D);
                                                                                if ((var454 & 0x1) == 1) {
                                                                                    field523 += field341;
                                                                                }
                                                                                if ((var454 & 0x2) == 2) {
                                                                                    field342 += field393;
                                                                                }
                                                                                if ((var454 & 0x4) == 4) {
                                                                                    field344 += field345;
                                                                                }
                                                                            }
                                                                            if (field523 < -50) {
                                                                                field341 = 2;
                                                                            }
                                                                            if (field523 > 50) {
                                                                                field341 = -2;
                                                                            }
                                                                            if (field342 < -55) {
                                                                                field393 = 2;
                                                                            }
                                                                            if (field342 > 55) {
                                                                                field393 = -2;
                                                                            }
                                                                            if (field344 < -40) {
                                                                                field345 = 1;
                                                                            }
                                                                            if (field344 > 40) {
                                                                                field345 = -1;
                                                                            }
                                                                            field351++;
                                                                            if (field351 > 500) {
                                                                                field351 = 0;
                                                                                int var455 = (int) (Math.random() * 8.0D);
                                                                                if ((var455 & 0x1) == 1) {
                                                                                    field347 += field444;
                                                                                }
                                                                                if ((var455 & 0x2) == 2) {
                                                                                    field349 += field357;
                                                                                }
                                                                            }
                                                                            if (field347 < -60) {
                                                                                field444 = 2;
                                                                            }
                                                                            if (field347 > 60) {
                                                                                field444 = -2;
                                                                            }
                                                                            if (field349 < -20) {
                                                                                field357 = 1;
                                                                            }
                                                                            if (field349 > 10) {
                                                                                field357 = -1;
                                                                            }
                                                                            for (class39 var456 = (class39) field545.method3561(); var456 != null; var456 = (class39) field545.method3562()) {
                                                                                if ((long) var456.field864 < class115.method2038() / 1000L - 5L) {
                                                                                    if (var456.field861 > 0) {
                                                                                        class12.method1029(5, "", var456.field860 + class157.field2310);
                                                                                    }
                                                                                    if (var456.field861 == 0) {
                                                                                        class12.method1029(5, "", var456.field860 + class157.field2555);
                                                                                    }
                                                                                    var456.method3698();
                                                                                }
                                                                            }
                                                                            field325++;
                                                                            if (field325 > 50) {
                                                                                field319.method2621(136);
                                                                            }
                                                                            try {
                                                                                if (Statics.field171 != null && field319.field1982 > 0) {
                                                                                    Statics.field171.method2863(field319.field1981, 0, field319.field1982);
                                                                                    field319.field1982 = 0;
                                                                                    field325 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var459) {
                                                                                if (field401 > 0) {
                                                                                    method1587();
                                                                                } else {
                                                                                    method695(40);
                                                                                    Statics.field139 = Statics.field171;
                                                                                    Statics.field171 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var373 = var372.field3;
                                                                        if (var373.field2736 < 0) {
                                                                            break;
                                                                        }
                                                                        var374 = class173.method1002(var373.field2743);
                                                                    } while (var374 == null || var374.field2807 == null || var373.field2736 >= var374.field2807.length || var374.field2807[var373.field2736] != var373);
                                                                    class37.method3221(var372);
                                                                }
                                                            }
                                                            var370 = var369.field3;
                                                            if (var370.field2736 < 0) {
                                                                break;
                                                            }
                                                            var371 = class173.method1002(var370.field2743);
                                                        } while (var371 == null || var371.field2807 == null || var370.field2736 >= var371.field2807.length || var371.field2807[var370.field2736] != var370);
                                                        class37.method3221(var369);
                                                    }
                                                }
                                                var367 = var366.field3;
                                                if (var367.field2736 < 0) {
                                                    break;
                                                }
                                                var368 = class173.method1002(var367.field2743);
                                            } while (var368 == null || var368.field2807 == null || var367.field2736 >= var368.field2807.length || var368.field2807[var367.field2736] != var367);
                                            class37.method3221(var366);
                                        }
                                    }
                                } else if (field401 > 0) {
                                    method1587();
                                } else {
                                    method695(40);
                                    Statics.field139 = Statics.field171;
                                    Statics.field171 = null;
                                }
                            }
                        }
                    }
                } else if (field297 == 40 || field297 == 45) {
                    method740();
                }
                return;
            }
            var2.field2687.method3176(var2.field2684, (int) var2.field3105, var2.field2686, false);
        }
    }

    @ObfuscatedName("client.h(B)V")
    public final void method309() {
        boolean var1 = class183.method2739();
        if (var1 && field514 && Statics.field213 != null) {
            Statics.field213.method1209();
        }
        if (field297 == 10 || field297 == 20 || field297 == 30) {
            if (field488 != 0L && class115.method2038() > field488) {
                int var2 = method679();
                field488 = 0L;
                if (var2 >= 2) {
                    field427 = true;
                } else {
                    field427 = false;
                }
                method2674();
                if (field297 >= 25) {
                    method247();
                }
                field2187 = true;
            } else if (field2190) {
                Canvas var3 = Statics.field245;
                var3.removeKeyListener(class137.field2101);
                var3.removeFocusListener(class137.field2101);
                class137.field2105 = -1;
                Canvas var4 = Statics.field245;
                var4.removeMouseListener(class140.field2142);
                var4.removeMouseMotionListener(class140.field2142);
                var4.removeFocusListener(class140.field2142);
                class140.field2146 = 0;
                if (Statics.field1955 != null) {
                    Statics.field1955.method2698(Statics.field245);
                }
                Statics.field275.method2871();
                Statics.field245.setBackground(Color.black);
                Canvas var5 = Statics.field245;
                var5.setFocusTraversalKeysEnabled(false);
                var5.addKeyListener(class137.field2101);
                var5.addFocusListener(class137.field2101);
                class140.method767(Statics.field245);
                if (Statics.field1955 != null) {
                    Statics.field1955.method2696(Statics.field245);
                }
                if (field439 != -1) {
                    method630(false);
                }
                field2192 = true;
            }
        }
        Dimension var6 = this.method2878();
        if (Statics.field253 != var6.width || Statics.field586 != var6.height || field2192) {
            method2674();
            field488 = class115.method2038() + 500L;
            field2192 = false;
        }
        boolean var7 = false;
        if (field2187) {
            field2187 = false;
            var7 = true;
            for (int var8 = 0; var8 < 100; var8++) {
                field371[var8] = true;
            }
        }
        if (var7) {
            method204();
        }
        if (field297 == 0) {
            int var9 = class32.field708;
            String var10 = class32.field701;
            Color var11 = null;
            try {
                Graphics var12 = Statics.field245.getGraphics();
                if (Statics.field1085 == null) {
                    Statics.field1085 = new Font("Helvetica", 1, 13);
                    Statics.field1513 = Statics.field245.getFontMetrics(Statics.field1085);
                }
                if (var7) {
                    var12.setColor(Color.black);
                    var12.fillRect(0, 0, Statics.field2049, Statics.field2102);
                }
                if (var11 == null) {
                    var11 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1761 == null) {
                        Statics.field1761 = Statics.field245.createImage(304, 34);
                    }
                    Graphics var13 = Statics.field1761.getGraphics();
                    var13.setColor(var11);
                    var13.drawRect(0, 0, 303, 33);
                    var13.fillRect(2, 2, var9 * 3, 30);
                    var13.setColor(Color.black);
                    var13.drawRect(1, 1, 301, 31);
                    var13.fillRect(var9 * 3 + 2, 2, 300 - var9 * 3, 30);
                    var13.setFont(Statics.field1085);
                    var13.setColor(Color.white);
                    var13.drawString(var10, (304 - Statics.field1513.stringWidth(var10)) / 2, 22);
                    var12.drawImage(Statics.field1761, Statics.field2049 / 2 - 152, Statics.field2102 / 2 - 18, (ImageObserver) null);
                } catch (Exception var26) {
                    int var15 = Statics.field2049 / 2 - 152;
                    int var16 = Statics.field2102 / 2 - 18;
                    var12.setColor(var11);
                    var12.drawRect(var15, var16, 303, 33);
                    var12.fillRect(var15 + 2, var16 + 2, var9 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(var15 + 1, var16 + 1, 301, 31);
                    var12.fillRect(var9 * 3 + var15 + 2, var16 + 2, 300 - var9 * 3, 30);
                    var12.setFont(Statics.field1085);
                    var12.setColor(Color.white);
                    var12.drawString(var10, var15 + (304 - Statics.field1513.stringWidth(var10)) / 2, var16 + 22);
                }
            } catch (Exception var27) {
                Statics.field245.repaint();
            }
        } else if (field297 == 5) {
            class32.method1515(Statics.field2175, Statics.field1533, Statics.field140, var7);
        } else if (field297 == 10 || field297 == 11) {
            class32.method1515(Statics.field2175, Statics.field1533, Statics.field140, var7);
        } else if (field297 == 20) {
            class32.method1515(Statics.field2175, Statics.field1533, Statics.field140, var7);
        } else if (field297 == 25) {
            if (field486 == 1) {
                if (field331 > field332) {
                    field332 = field331;
                }
                int var18 = (field332 * 50 - field331 * 50) / field332;
                method846(class157.field2307 + class2.field21 + class2.field22 + var18 + "%" + class2.field25, false);
            } else if (field486 == 2) {
                if (field333 > field334) {
                    field334 = field333;
                }
                int var19 = (field334 * 50 - field333 * 50) / field334 + 50;
                method846(class157.field2307 + class2.field21 + class2.field22 + var19 + "%" + class2.field25, false);
            } else {
                method846(class157.field2307, false);
            }
        } else if (field297 == 30) {
            method684();
        } else if (field297 == 40) {
            method846(class157.field2308 + class2.field21 + class157.field2521, false);
        } else if (field297 == 45) {
            method846(class157.field2454, false);
        }
        if (field297 == 30 && field317 == 0 && !var7) {
            try {
                Graphics var20 = Statics.field245.getGraphics();
                for (int var21 = 0; var21 < field478; var21++) {
                    if (field497[var21]) {
                        Statics.field1441.method1519(var20, field483[var21], field484[var21], field485[var21], field527[var21]);
                        field497[var21] = false;
                    }
                }
            } catch (Exception var29) {
                Statics.field245.repaint();
            }
        } else if (field297 > 0) {
            try {
                Graphics var23 = Statics.field245.getGraphics();
                Statics.field1441.method1516(var23, 0, 0);
                for (int var24 = 0; var24 < field478; var24++) {
                    field497[var24] = false;
                }
            } catch (Exception var28) {
                Statics.field245.repaint();
            }
        }
    }

    @ObfuscatedName("client.i(B)V")
    public final void method263() {
        if (Statics.field1440.method216()) {
            Statics.field1440.method218();
        }
        if (Statics.field2633 != null) {
            Statics.field2633.field201 = false;
        }
        Statics.field2633 = null;
        if (Statics.field171 != null) {
            Statics.field171.method2843();
            Statics.field171 = null;
        }
        class137.method2042();
        if (class140.field2142 != null) {
            class140 var1 = class140.field2142;
            synchronized (class140.field2142) {
                class140.field2142 = null;
            }
        }
        Statics.field1955 = null;
        if (Statics.field213 != null) {
            Statics.field213.method1187();
        }
        if (Statics.field676 != null) {
            Statics.field676.method1187();
        }
        class171.method43();
        Object var3 = class170.field2691;
        synchronized (class170.field2691) {
            if (class170.field2694 != 0) {
                class170.field2694 = 1;
                try {
                    class170.field2691.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class149.field2222.method3916();
            for (int var6 = 0; var6 < Statics.field2216; var6++) {
                Statics.field748[var6].method3916();
            }
            class149.field2223.method3916();
            class149.field2221.method3916();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("am.t(IB)V")
    public static void method695(int arg0) {
        if (field297 == arg0) {
            return;
        }
        if (field297 == 0) {
            Statics.field1761 = null;
            Statics.field1085 = null;
            Statics.field1513 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field310 = 0;
            field311 = 0;
            field308 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field139 != null) {
            Statics.field139.method2843();
            Statics.field139 = null;
        }
        if (field297 == 25) {
            field486 = 0;
            field331 = 0;
            field332 = 1;
            field333 = 0;
            field334 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method2694(Statics.field245, Statics.field1072, Statics.field71, true, 0);
        } else if (arg0 == 20) {
            class32.method2694(Statics.field245, Statics.field1072, Statics.field71, true, field297 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method2694(Statics.field245, Statics.field1072, Statics.field71, false, 4);
        } else if (Statics.field707) {
            Statics.field3149 = null;
            Statics.field719 = null;
            Statics.field1750 = null;
            Statics.field2241 = null;
            Statics.field694 = null;
            Statics.field756 = null;
            Statics.field2635 = null;
            Statics.field778 = null;
            Statics.field2036 = null;
            Statics.field750 = null;
            Statics.field649 = null;
            Statics.field1749 = null;
            Statics.field2290 = null;
            Statics.field160 = null;
            Statics.field1842 = null;
            Statics.field2211 = null;
            Statics.field704 = null;
            Statics.field700 = null;
            Statics.field2145 = null;
            Statics.field2895 = null;
            Statics.field1515 = null;
            Statics.field2654 = null;
            class183.method1081(2);
            class171.method2721(true);
            Statics.field707 = false;
        }
        field297 = arg0;
    }

    @ObfuscatedName("client.k(I)V")
    public void method264() {
        if (field297 != 1000) {
            boolean var1 = class171.method2041();
            if (!var1) {
                this.method265();
            }
        }
    }

    @ObfuscatedName("client.s(I)V")
    public void method265() {
        if (class171.field2696 >= 4) {
            this.method2876("js5crc");
            field297 = 1000;
            return;
        }
        if (class171.field2705 >= 4) {
            if (field297 <= 5) {
                this.method2876("js5io");
                field297 = 1000;
                return;
            }
            field389 = 3000;
            class171.field2705 = 3;
        }
        if (--field389 + 1 > 0) {
            return;
        }
        try {
            if (field506 == 0) {
                Statics.field1046 = Statics.field631.method2743(Statics.field960, Statics.field220);
                field506++;
            }
            if (field506 == 1) {
                if (Statics.field1046.field2199 == 2) {
                    this.method266(-1);
                    return;
                }
                if (Statics.field1046.field2199 == 1) {
                    field506++;
                }
            }
            if (field506 == 2) {
                Statics.field161 = new class143((Socket) Statics.field1046.field2205, Statics.field631);
                class119 var1 = new class119(5);
                var1.method2357(15);
                var1.method2360(100);
                Statics.field161.method2863(var1.field1981, 0, 5);
                field506++;
                Statics.field1385 = class115.method2038();
            }
            if (field506 == 3) {
                if (field297 <= 5 || Statics.field161.method2845() > 0) {
                    int var2 = Statics.field161.method2844();
                    if (var2 != 0) {
                        this.method266(var2);
                        return;
                    }
                    field506++;
                } else if (class115.method2038() - Statics.field1385 > 30000L) {
                    this.method266(-2);
                    return;
                }
            }
            if (field506 == 4) {
                class143 var3 = Statics.field161;
                boolean var4 = field297 > 20;
                if (Statics.field2716 != null) {
                    try {
                        Statics.field2716.method2843();
                    } catch (Exception var14) {
                    }
                    Statics.field2716 = null;
                }
                Statics.field2716 = var3;
                class171.method2721(var4);
                class171.field2710.field1982 = 0;
                Statics.field1055 = null;
                Statics.field2709 = null;
                class171.field2715 = 0;
                while (true) {
                    class172 var6 = (class172) class171.field2704.method3570();
                    if (var6 == null) {
                        while (true) {
                            class172 var7 = (class172) class171.field2706.method3570();
                            if (var7 == null) {
                                if (class171.field2714 != 0) {
                                    try {
                                        class119 var8 = new class119(4);
                                        var8.method2357(4);
                                        var8.method2357(class171.field2714);
                                        var8.method2358(0);
                                        Statics.field2716.method2863(var8.field1981, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2716.method2843();
                                        } catch (Exception var12) {
                                        }
                                        class171.field2705++;
                                        Statics.field2716 = null;
                                    }
                                }
                                class171.field2697 = 0;
                                Statics.field2698 = class115.method2038();
                                Statics.field1046 = null;
                                Statics.field161 = null;
                                field506 = 0;
                                field309 = 0;
                                return;
                            }
                            class171.field2708.method3668(var7);
                            class171.field2717.method3574(var7, var7.field3105);
                            class171.field2701++;
                            class171.field2707--;
                        }
                    }
                    class171.field2699.method3574(var6, var6.field3105);
                    class171.field2700++;
                    class171.field2702--;
                }
            }
        } catch (IOException var15) {
            this.method266(-3);
        }
    }

    @ObfuscatedName("client.w(II)V")
    public void method266(int arg0) {
        Statics.field1046 = null;
        Statics.field161 = null;
        field506 = 0;
        if (Statics.field220 == Statics.field165) {
            Statics.field220 = Statics.field1990;
        } else {
            Statics.field220 = Statics.field165;
        }
        field309++;
        if (field309 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field297 <= 5) {
                this.method2876("js5connect_full");
                field297 = 1000;
            } else {
                field389 = 3000;
            }
        } else if (field309 >= 2 && arg0 == 6) {
            this.method2876("js5connect_outofdate");
            field297 = 1000;
        } else if (field309 >= 4) {
            if (field297 <= 5) {
                this.method2876("js5connect");
                field297 = 1000;
            } else {
                field389 = 3000;
            }
        }
    }

    @ObfuscatedName("af.e(S)V")
    public static void method1001() {
        if (field322 == 0) {
            Statics.field611 = new class86(4, 104, 104, class6.field80);
            for (int var0 = 0; var0 < 4; var0++) {
                field336[var0] = new class108(104, 104);
            }
            Statics.field1656 = new class79(512, 512);
            class32.field701 = class157.field2446;
            class32.field708 = 5;
            field322 = 20;
        } else if (field322 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1572[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1891(var1, 500, 800, 512, 334);
            class32.field701 = class157.field2311;
            class32.field708 = 10;
            field322 = 30;
        } else if (field322 == 30) {
            Statics.field1020 = method3350(0, false, true, true);
            Statics.field1580 = method3350(1, false, true, true);
            Statics.field1088 = method3350(2, true, false, true);
            Statics.field2918 = method3350(3, false, true, true);
            Statics.field2584 = method3350(4, false, true, true);
            Statics.field186 = method3350(5, true, true, true);
            Statics.field2166 = method3350(6, true, true, false);
            Statics.field2269 = method3350(7, false, true, true);
            Statics.field71 = method3350(8, false, true, true);
            Statics.field587 = method3350(9, false, true, true);
            Statics.field1072 = method3350(10, false, true, true);
            Statics.field1986 = method3350(11, false, true, true);
            Statics.field91 = method3350(12, false, true, true);
            Statics.field132 = method3350(13, true, false, true);
            Statics.field2279 = method3350(14, false, true, false);
            Statics.field1365 = method3350(15, false, true, true);
            class32.field701 = class157.field2451;
            class32.field708 = 20;
            field322 = 40;
        } else if (field322 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1020.method3173() * 4 / 100;
            int var8 = var7 + Statics.field1580.method3173() * 4 / 100;
            int var9 = var8 + Statics.field1088.method3173() * 2 / 100;
            int var10 = var9 + Statics.field2918.method3173() * 2 / 100;
            int var11 = var10 + Statics.field2584.method3173() * 6 / 100;
            int var12 = var11 + Statics.field186.method3173() * 4 / 100;
            int var13 = var12 + Statics.field2166.method3173() * 2 / 100;
            int var14 = var13 + Statics.field2269.method3173() * 60 / 100;
            int var15 = var14 + Statics.field71.method3173() * 2 / 100;
            int var16 = var15 + Statics.field587.method3173() * 2 / 100;
            int var17 = var16 + Statics.field1072.method3173() * 2 / 100;
            int var18 = var17 + Statics.field1986.method3173() * 2 / 100;
            int var19 = var18 + Statics.field91.method3173() * 2 / 100;
            int var20 = var19 + Statics.field132.method3173() * 2 / 100;
            int var21 = var20 + Statics.field2279.method3173() * 2 / 100;
            int var22 = var21 + Statics.field1365.method3173() * 2 / 100;
            if (var22 == 100) {
                class32.field701 = class157.field2345;
                class32.field708 = 30;
                field322 = 45;
            } else {
                if (var22 != 0) {
                    class32.field701 = class157.field2439 + var22 + "%";
                }
                class32.field708 = 30;
            }
        } else if (field322 == 45) {
            boolean var23 = !field528;
            Statics.field1184 = 22050;
            Statics.field3216 = var23;
            Statics.field1163 = 2;
            class184 var24 = new class184();
            var24.method3423(9, 128);
            Statics.field213 = class57.method759(Statics.field631, Statics.field245, 0, 22050);
            Statics.field213.method1183(var24);
            class168 var25 = Statics.field1365;
            class168 var26 = Statics.field2279;
            class168 var27 = Statics.field2584;
            Statics.field2940 = var25;
            Statics.field2938 = var26;
            Statics.field2939 = var27;
            Statics.field2944 = var24;
            Statics.field676 = class57.method759(Statics.field631, Statics.field245, 1, 2048);
            Statics.field236 = new class56();
            Statics.field676.method1183(Statics.field236);
            Statics.field1775 = new class75(22050, Statics.field1184);
            class32.field701 = class157.field2445;
            class32.field708 = 35;
            field322 = 50;
        } else if (field322 == 50) {
            int var28 = 0;
            if (Statics.field1533 == null) {
                Statics.field1533 = Statics.method2256(Statics.field71, Statics.field132, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field140 == null) {
                Statics.field140 = Statics.method2256(Statics.field71, Statics.field132, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field2175 == null) {
                Statics.field2175 = Statics.method2256(Statics.field71, Statics.field132, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class32.field701 = class157.field2316 + var28 * 100 / 3 + "%";
                class32.field708 = 40;
            } else {
                Statics.field2030 = new class160(true);
                class32.field701 = class157.field2317;
                class32.field708 = 40;
                field322 = 60;
            }
        } else if (field322 == 60) {
            int var29 = class32.method147(Statics.field1072, Statics.field71);
            int var30 = class32.method921();
            if (var29 < var30) {
                class32.field701 = class157.field2318 + var29 * 100 / var30 + "%";
                class32.field708 = 50;
            } else {
                class32.field701 = class157.field2319;
                class32.field708 = 50;
                method695(5);
                field322 = 70;
            }
        } else if (field322 == 70) {
            if (Statics.field1088.method3088()) {
                class47.method2291(Statics.field1088);
                class42.method668(Statics.field1088);
                class168 var31 = Statics.field1088;
                class168 var32 = Statics.field2269;
                Statics.field1013 = var31;
                Statics.field1010 = var32;
                Statics.field1009 = Statics.field1013.method3094(3);
                class168 var33 = Statics.field1088;
                class168 var34 = Statics.field2269;
                boolean var35 = field528;
                Statics.field991 = var33;
                Statics.field3214 = var34;
                class41.field925 = var35;
                class40.method2252(Statics.field1088, Statics.field2269);
                class52.method2062(Statics.field1088, Statics.field2269, field282, Statics.field1533);
                class43.method118(Statics.field1088, Statics.field1020, Statics.field1580);
                class168 var36 = Statics.field1088;
                class168 var37 = Statics.field2269;
                Statics.field992 = var36;
                Statics.field1001 = var37;
                class168 var38 = Statics.field1088;
                Statics.field1047 = var38;
                class53.method1962(Statics.field1088);
                Statics.method2169(Statics.field2918, Statics.field2269, Statics.field71, Statics.field132);
                class168 var39 = Statics.field1088;
                Statics.field1082 = var39;
                class49.method2312(Statics.field1088);
                class168 var40 = Statics.field1088;
                Statics.field1028 = var40;
                class50.method1586(Statics.field1088);
                Statics.field1440 = new class20();
                class32.field701 = class157.field2430;
                class32.field708 = 60;
                field322 = 80;
            } else {
                class32.field701 = class157.field2320 + Statics.field1088.method3179() + "%";
                class32.field708 = 60;
            }
        } else if (field322 == 80) {
            int var41 = 0;
            if (Statics.field564 == null) {
                Statics.field564 = class77.method585(Statics.field71, "compass", "");
            } else {
                var41++;
            }
            if (Statics.field602 == null) {
                Statics.field602 = class77.method585(Statics.field71, "mapedge", "");
            } else {
                var41++;
            }
            if (Statics.field1987 == null) {
                Statics.field1987 = class77.method862(Statics.field71, "mapscene", "");
            } else {
                var41++;
            }
            if (Statics.field193 == null) {
                Statics.field193 = class77.method751(Statics.field71, "mapfunction", "");
            } else {
                var41++;
            }
            if (Statics.field194 == null) {
                Statics.field194 = class77.method751(Statics.field71, "hitmarks", "");
            } else {
                var41++;
            }
            if (Statics.field1373 == null) {
                Statics.field1373 = class77.method751(Statics.field71, "headicons_pk", "");
            } else {
                var41++;
            }
            if (Statics.field2237 == null) {
                Statics.field2237 = class77.method751(Statics.field71, "headicons_prayer", "");
            } else {
                var41++;
            }
            if (Statics.field343 == null) {
                Statics.field343 = class77.method751(Statics.field71, "headicons_hint", "");
            } else {
                var41++;
            }
            if (Statics.field354 == null) {
                Statics.field354 = class77.method751(Statics.field71, "mapmarker", "");
            } else {
                var41++;
            }
            if (Statics.field1966 == null) {
                Statics.field1966 = class77.method751(Statics.field71, "cross", "");
            } else {
                var41++;
            }
            if (Statics.field156 == null) {
                Statics.field156 = class77.method751(Statics.field71, "mapdots", "");
            } else {
                var41++;
            }
            if (Statics.field2942 == null) {
                Statics.field2942 = class77.method862(Statics.field71, "scrollbar", "");
            } else {
                var41++;
            }
            if (Statics.field761 == null) {
                Statics.field761 = class77.method862(Statics.field71, "mod_icons", "");
            } else {
                var41++;
            }
            if (var41 < 13) {
                class32.field701 = class157.field2303 + var41 * 100 / 13 + "%";
                class32.field708 = 70;
            } else {
                Statics.field3186 = Statics.field761;
                Statics.field602.method1599();
                int var42 = (int) (Math.random() * 21.0D) - 10;
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 21.0D) - 10;
                int var45 = (int) (Math.random() * 41.0D) - 20;
                for (int var46 = 0; var46 < Statics.field193.length; var46++) {
                    Statics.field193[var46].method1685(var42 + var45, var43 + var45, var44 + var45);
                }
                Statics.field1987[0].method1757(var42 + var45, var43 + var45, var44 + var45);
                class32.field701 = class157.field2323;
                class32.field708 = 70;
                field322 = 90;
            }
        } else if (field322 == 90) {
            if (Statics.field587.method3088()) {
                class95 var47 = new class95(Statics.field587, Statics.field71, 20, 0.8D, field528 ? 64 : 128);
                class91.method2018(var47);
                class91.method2011(0.8D);
                class32.field701 = class157.field2325;
                class32.field708 = 90;
                field322 = 110;
            } else {
                class32.field701 = class157.field2313 + Statics.field587.method3179() + "%";
                class32.field708 = 90;
            }
        } else if (field322 == 110) {
            Statics.field2633 = new class14();
            Statics.field631.method2747(Statics.field2633, 10);
            class32.field701 = class157.field2479;
            class32.field708 = 94;
            field322 = 120;
        } else if (field322 == 120) {
            if (Statics.field1072.method3102("huffman", "")) {
                class113 var48 = new class113(Statics.field1072.method3101("huffman", ""));
                class222.method2290(var48);
                class32.field701 = class157.field2328;
                class32.field708 = 96;
                field322 = 130;
            } else {
                class32.field701 = class157.field2502 + "%";
                class32.field708 = 96;
            }
        } else if (field322 == 130) {
            if (!Statics.field2918.method3088()) {
                class32.field701 = class157.field2329 + Statics.field2918.method3179() * 4 / 5 + "%";
                class32.field708 = 100;
            } else if (!Statics.field91.method3088()) {
                class32.field701 = class157.field2329 + (80 + Statics.field91.method3179() / 6) + "%";
                class32.field708 = 100;
            } else if (Statics.field132.method3088()) {
                class32.field701 = class157.field2330;
                class32.field708 = 100;
                field322 = 140;
            } else {
                class32.field701 = class157.field2329 + (96 + Statics.field132.method3179() / 20) + "%";
                class32.field708 = 100;
            }
        } else if (field322 == 140) {
            method695(10);
        }
    }

    @ObfuscatedName("fi.z(IZZZI)Lfg;")
    public static class168 method3350(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2222 != null) {
            var4 = new class134(arg0, class149.field2222, Statics.field748[arg0], 1000000);
        }
        return new class168(var4, Statics.field1023, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("az.p(B)V")
    public static final void method740() {
        try {
            if (field310 == 0) {
                if (Statics.field171 != null) {
                    Statics.field171.method2843();
                    Statics.field171 = null;
                }
                Statics.field260 = null;
                field330 = false;
                field311 = 0;
                field310 = 1;
            }
            if (field310 == 1) {
                if (Statics.field260 == null) {
                    Statics.field260 = Statics.field631.method2743(Statics.field960, Statics.field220);
                }
                if (Statics.field260.field2199 == 2) {
                    throw new IOException();
                }
                if (Statics.field260.field2199 == 1) {
                    Statics.field171 = new class143((Socket) Statics.field260.field2205, Statics.field631);
                    Statics.field260 = null;
                    field310 = 2;
                }
            }
            if (field310 == 2) {
                field319.field1982 = 0;
                field319.method2357(14);
                Statics.field171.method2863(field319.field1981, 0, 1);
                field321.field1982 = 0;
                field310 = 3;
            }
            if (field310 == 3) {
                if (Statics.field213 != null) {
                    Statics.field213.method1185();
                }
                if (Statics.field676 != null) {
                    Statics.field676.method1185();
                }
                int var0 = Statics.field171.method2844();
                if (Statics.field213 != null) {
                    Statics.field213.method1185();
                }
                if (Statics.field676 != null) {
                    Statics.field676.method1185();
                }
                if (var0 != 0) {
                    method667(var0);
                    return;
                }
                field321.field1982 = 0;
                field310 = 5;
            }
            if (field310 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field319.field1982 = 0;
                field319.method2357(1);
                field319.method2357(class32.field721.method578());
                field319.method2360(var1[0]);
                field319.method2360(var1[1]);
                field319.method2360(var1[2]);
                field319.method2360(var1[3]);
                switch(class32.field721.field2581) {
                    case 0:
                    case 3:
                        field319.method2359(Statics.field65);
                        field319.field1982 += 5;
                        break;
                    case 1:
                        field319.method2360((Integer) Statics.field2278.field138.get(class163.method588(class32.field714)));
                        field319.field1982 += 4;
                        break;
                    case 2:
                        field319.field1982 += 8;
                }
                field319.method2363(class32.field727);
                field319.method2391(class5.field68, class5.field70);
                field320.field1982 = 0;
                if (field297 == 40) {
                    field320.method2357(18);
                } else {
                    field320.method2357(16);
                }
                field320.method2358(0);
                int var2 = field320.field1982;
                field320.method2360(100);
                field320.method2366(field319.field1981, 0, field319.field1982);
                int var3 = field320.field1982;
                field320.method2363(class32.field714);
                field320.method2357((field427 ? 1 : 0) << 1 | (field528 ? 1 : 0));
                field320.method2358(Statics.field2049);
                field320.method2358(Statics.field2102);
                class122 var4 = field320;
                byte[] var5 = new byte[24];
                try {
                    class149.field2221.method3915(0L);
                    class149.field2221.method3917(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var29) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2366(var5, 0, 24);
                field320.method2363(Statics.field166);
                field320.method2360(Statics.field1147);
                class119 var9 = new class119(Statics.field2030.method2987());
                Statics.field2030.method2986(var9);
                field320.method2366(var9.field1981, 0, var9.field1981.length);
                field320.method2357(Statics.field774);
                field320.method2360(Statics.field1020.field2662);
                field320.method2360(Statics.field1580.field2662);
                field320.method2360(Statics.field1088.field2662);
                field320.method2360(Statics.field2918.field2662);
                field320.method2360(Statics.field2584.field2662);
                field320.method2360(Statics.field186.field2662);
                field320.method2360(Statics.field2166.field2662);
                field320.method2360(Statics.field2269.field2662);
                field320.method2360(Statics.field71.field2662);
                field320.method2360(Statics.field587.field2662);
                field320.method2360(Statics.field1072.field2662);
                field320.method2360(Statics.field1986.field2662);
                field320.method2360(Statics.field91.field2662);
                field320.method2360(Statics.field132.field2662);
                field320.method2360(Statics.field2279.field2662);
                field320.method2360(Statics.field1365.field2662);
                field320.method2525(var1, var3, field320.field1982);
                field320.method2555(field320.field1982 - var2);
                Statics.field171.method2863(field320.field1981, 0, field320.field1982);
                field319.method2618(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field321.method2618(var1);
                field310 = 6;
            }
            if (field310 == 6 && Statics.field171.method2845() > 0) {
                int var11 = Statics.field171.method2844();
                if (var11 == 21 && field297 == 20) {
                    field310 = 7;
                } else if (var11 == 2) {
                    field310 = 9;
                } else if (var11 == 15 && field297 == 40) {
                    field290 = -1;
                    field310 = 13;
                } else if (var11 == 23 && field308 < 1) {
                    field308++;
                    field310 = 0;
                } else if (var11 == 29) {
                    field310 = 11;
                } else {
                    method667(var11);
                    return;
                }
            }
            if (field310 == 7 && Statics.field171.method2845() > 0) {
                field313 = (Statics.field171.method2844() + 3) * 60;
                field310 = 8;
            }
            if (field310 == 8) {
                field311 = 0;
                class32.method139(class157.field2334, class157.field2538, field313 / 60 + class157.field2563);
                if (--field313 <= 0) {
                    field310 = 0;
                }
            } else {
                if (field310 == 9 && Statics.field171.method2845() >= 13) {
                    boolean var12 = Statics.field171.method2844() == 1;
                    Statics.field171.method2849(field321.field1981, 0, 4);
                    field321.field1982 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field321.method2632() << 24;
                        int var15 = var14 | field321.method2632() << 16;
                        int var16 = var15 | field321.method2632() << 8;
                        int var17 = var16 | field321.method2632();
                        int var18 = class163.method588(class32.field714);
                        if (Statics.field2278.field138.size() >= 10 && !Statics.field2278.field138.containsKey(var18)) {
                            Iterator var19 = Statics.field2278.field138.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field2278.field138.put(var18, var17);
                        class9.method2680();
                    }
                    field442 = Statics.field171.method2844();
                    field384 = Statics.field171.method2844() == 1;
                    field524 = Statics.field171.method2844();
                    field524 <<= 0x8;
                    field524 += Statics.field171.method2844();
                    field352 = Statics.field171.method2844();
                    Statics.field171.method2849(field321.field1981, 0, 1);
                    field321.field1982 = 0;
                    field447 = field321.method2632();
                    Statics.field171.method2849(field321.field1981, 0, 2);
                    field321.field1982 = 0;
                    field290 = field321.method2374();
                    if (field352 == 1) {
                        try {
                            class132.method2707(Statics.field275, "zap");
                        } catch (Throwable var28) {
                        }
                    } else {
                        try {
                            class132.method2707(Statics.field275, "unzap");
                        } catch (Throwable var27) {
                        }
                    }
                    field310 = 10;
                }
                if (field310 != 10) {
                    if (field310 == 11 && Statics.field171.method2845() >= 2) {
                        field321.field1982 = 0;
                        Statics.field171.method2849(field321.field1981, 0, 2);
                        field321.field1982 = 0;
                        Statics.field162 = field321.method2374();
                        field310 = 12;
                    }
                    if (field310 == 12 && Statics.field171.method2845() >= Statics.field162) {
                        field321.field1982 = 0;
                        Statics.field171.method2849(field321.field1981, 0, Statics.field162);
                        field321.field1982 = 0;
                        String var22 = field321.method2380();
                        String var23 = field321.method2380();
                        String var24 = field321.method2380();
                        class32.method139(var22, var23, var24);
                        method695(10);
                    }
                    if (field310 == 13) {
                        if (field290 == -1) {
                            if (Statics.field171.method2845() < 2) {
                                return;
                            }
                            Statics.field171.method2849(field321.field1981, 0, 2);
                            field321.field1982 = 0;
                            field290 = field321.method2374();
                        }
                        if (Statics.field171.method2845() >= field290) {
                            Statics.field171.method2849(field321.field1981, 0, field290);
                            field321.field1982 = 0;
                            int var25 = field290;
                            method3043();
                            class33.method2980(field321);
                            if (field321.field1982 != var25) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field311++;
                        if (field311 > 2000) {
                            if (field308 < 1) {
                                if (Statics.field220 == Statics.field165) {
                                    Statics.field220 = Statics.field1990;
                                } else {
                                    Statics.field220 = Statics.field165;
                                }
                                field308++;
                                field310 = 0;
                            } else {
                                method667(-3);
                            }
                        }
                    }
                } else if (Statics.field171.method2845() >= field290) {
                    field321.field1982 = 0;
                    Statics.field171.method2849(field321.field1981, 0, field290);
                    method671();
                    class33.method2980(field321);
                    Statics.field2085 = -1;
                    method2303(false);
                    field447 = -1;
                }
            }
        } catch (IOException var30) {
            if (field308 < 1) {
                if (Statics.field220 == Statics.field165) {
                    Statics.field220 = Statics.field1990;
                } else {
                    Statics.field220 = Statics.field165;
                }
                field308++;
                field310 = 0;
            } else {
                method667(-2);
            }
        }
    }

    @ObfuscatedName("ao.r(I)V")
    public static void method671() {
        field288 = 1L;
        field551 = -1;
        Statics.field2633.field191 = 0;
        Statics.field1517 = true;
        field292 = true;
        field274 = -1L;
        class211.field3117 = new class202();
        field319.field1982 = 0;
        field321.field1982 = 0;
        field447 = -1;
        field326 = -1;
        field327 = -1;
        field328 = -1;
        field324 = 0;
        field487 = 0;
        field401 = 0;
        field430 = 0;
        field417 = 0;
        field501 = false;
        class140.method670(0);
        class12.field172.clear();
        class12.field167.method3588();
        class12.field173.method3633();
        class12.field168 = 0;
        field399 = 0;
        field547 = false;
        field517 = 0;
        field523 = (int) (Math.random() * 100.0D) - 50;
        field342 = (int) (Math.random() * 110.0D) - 55;
        field344 = (int) (Math.random() * 80.0D) - 40;
        field347 = (int) (Math.random() * 120.0D) - 60;
        field349 = (int) (Math.random() * 30.0D) - 20;
        field435 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field511 = 0;
        field504 = -1;
        field538 = 0;
        field295 = 0;
        field277 = class21.field560;
        field304 = class21.field560;
        field315 = 0;
        class33.field734 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field733[var0] = null;
            class33.field732[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field398[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field314[var2] = null;
        }
        field407 = -1;
        field410.method3600();
        field492.method3600();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field408[var3][var4][var5] = null;
                }
            }
        }
        field409 = new class199();
        field543 = 0;
        field542 = 0;
        field355 = 0;
        for (int var6 = 0; var6 < Statics.field1144; var6++) {
            class53 var7 = class53.method799(var6);
            if (var7 != null) {
                class176.field2888[var6] = 0;
                class176.field2885[var6] = 0;
            }
        }
        Statics.field1440.method244();
        field464 = -1;
        if (field439 != -1) {
            class173.method2616(field439);
        }
        for (class4 var8 = (class4) field305.method3570(); var8 != null; var8 = (class4) field305.method3575()) {
            method121(var8, true);
        }
        field439 = -1;
        field305 = new class196(8);
        field546 = null;
        field501 = false;
        field417 = 0;
        field548.method3300((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field329[var9] = null;
            field405[var9] = false;
        }
        class16.field217 = new class196(32);
        field533 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field371[var10] = true;
        }
        method247();
        field502 = null;
        Statics.field965 = 0;
        Statics.field1668 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field500[var11] = new class220();
        }
        Statics.field2194 = null;
    }

    @ObfuscatedName("fc.g(I)V")
    public static void method3043() {
        field319.field1982 = 0;
        field321.field1982 = 0;
        field447 = -1;
        field326 = -1;
        field327 = -1;
        field328 = -1;
        field290 = 0;
        field324 = 0;
        field487 = 0;
        field417 = 0;
        field501 = false;
        field511 = 0;
        field538 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field398[var0] = null;
        }
        Statics.field13 = null;
        for (int var1 = 0; var1 < field314.length; var1++) {
            class35 var2 = field314[var1];
            if (var2 != null) {
                var2.field824 = -1;
                var2.field825 = false;
            }
        }
        class16.method196();
        method695(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field371[var3] = true;
        }
        method247();
    }

    @ObfuscatedName("aa.n(II)V")
    public static void method667(int arg0) {
        if (arg0 == -3) {
            class32.method139(class157.field2337, class157.field2376, class157.field2339);
        } else if (arg0 == -2) {
            class32.method139(class157.field2340, class157.field2384, class157.field2342);
        } else if (arg0 == -1) {
            class32.method139(class157.field2343, class157.field2344, class157.field2417);
        } else if (arg0 == 3) {
            class32.method139(class157.field2346, class157.field2347, class157.field2348);
        } else if (arg0 == 4) {
            class32.method139(class157.field2349, class157.field2467, class157.field2351);
        } else if (arg0 == 5) {
            class32.method139(class157.field2352, class157.field2353, class157.field2354);
        } else if (arg0 == 6) {
            class32.method139(class157.field2355, class157.field2356, class157.field2357);
        } else if (arg0 == 7) {
            class32.method139(class157.field2358, class157.field2359, class157.field2360);
        } else if (arg0 == 8) {
            class32.method139(class157.field2361, class157.field2485, class157.field2387);
        } else if (arg0 == 9) {
            class32.method139(class157.field2324, class157.field2365, class157.field2528);
        } else if (arg0 == 10) {
            class32.method139(class157.field2367, class157.field2368, class157.field2395);
        } else if (arg0 == 11) {
            class32.method139(class157.field2535, class157.field2441, class157.field2567);
        } else if (arg0 == 12) {
            class32.method139(class157.field2373, class157.field2402, class157.field2375);
        } else if (arg0 == 13) {
            class32.method139(class157.field2371, class157.field2377, class157.field2378);
        } else if (arg0 == 14) {
            class32.method139(class157.field2379, class157.field2458, class157.field2381);
        } else if (arg0 == 16) {
            class32.method139(class157.field2382, class157.field2486, class157.field2399);
        } else if (arg0 == 17) {
            class32.method139(class157.field2385, class157.field2386, class157.field2473);
        } else if (arg0 == 18) {
            class32.method139(class157.field2388, class157.field2389, class157.field2309);
        } else if (arg0 == 19) {
            class32.method139(class157.field2391, class157.field2392, class157.field2393);
        } else if (arg0 == 20) {
            class32.method139(class157.field2394, class157.field2570, class157.field2396);
        } else if (arg0 == 22) {
            class32.method139(class157.field2397, class157.field2398, class157.field2478);
        } else if (arg0 == 23) {
            class32.method139(class157.field2400, class157.field2401, class157.field2306);
        } else if (arg0 == 24) {
            class32.method139(class157.field2419, class157.field2404, class157.field2405);
        } else if (arg0 == 25) {
            class32.method139(class157.field2484, class157.field2426, class157.field2526);
        } else if (arg0 == 26) {
            class32.method139(class157.field2409, class157.field2440, class157.field2411);
        } else if (arg0 == 27) {
            class32.method139(class157.field2412, class157.field2413, class157.field2414);
        } else if (arg0 == 31) {
            class32.method139(class157.field2421, class157.field2483, class157.field2423);
        } else if (arg0 == 32) {
            class32.method139(class157.field2424, class157.field2425, class157.field2335);
        } else if (arg0 == 37) {
            class32.method139(class157.field2427, class157.field2459, class157.field2429);
        } else if (arg0 == 38) {
            class32.method139(class157.field2456, class157.field2431, class157.field2432);
        } else if (arg0 == 55) {
            class32.method139(class157.field2433, class157.field2434, class157.field2435);
        } else if (arg0 == 56) {
            class32.method139(class157.field2436, class157.field2437, class157.field2438);
            method695(11);
            return;
        } else if (arg0 == 57) {
            class32.method139(class157.field2529, class157.field2363, class157.field2511);
            method695(11);
            return;
        } else {
            class32.method139(class157.field2442, class157.field2443, class157.field2444);
        }
        method695(10);
    }

    @ObfuscatedName("bv.y(I)V")
    public static final void method1587() {
        if (Statics.field171 != null) {
            Statics.field171.method2843();
            Statics.field171 = null;
        }
        method3268();
        Statics.field611.method1933();
        for (int var0 = 0; var0 < 4; var0++) {
            field336[var0].method2280();
        }
        System.gc();
        class183.method1081(2);
        field513 = -1;
        field514 = false;
        class24.method3271();
        method695(10);
    }

    @ObfuscatedName("fe.v(I)V")
    public static final void method3268() {
        class47.field1034.method3541();
        class42.method3532();
        class45.field1021.method3541();
        class41.method605();
        class40.method117();
        class52.method584();
        class43.method2();
        class44.field994.method3541();
        class44.field995.method3541();
        class48.field1048.method3541();
        class53.method45();
        class179.field2907.method3541();
        class173.field2729.method3541();
        class173.field2730.method3541();
        class173.field2731.method3541();
        class173.field2732.method3541();
        ((class95) Statics.field1570).method2047();
        class23.field578.method3541();
        Statics.field1020.method3097();
        Statics.field1580.method3097();
        Statics.field2918.method3097();
        Statics.field2584.method3097();
        Statics.field186.method3097();
        Statics.field2166.method3097();
        Statics.field2269.method3097();
        Statics.field71.method3097();
        Statics.field587.method3097();
        Statics.field1072.method3097();
        Statics.field1986.method3097();
        Statics.field91.method3097();
    }

    @ObfuscatedName("em.q(B)V")
    public static final void method2697() {
        if (Statics.field676 != null) {
            Statics.field676.method1184();
        }
        if (Statics.field213 != null) {
            Statics.field213.method1184();
        }
    }

    @ObfuscatedName("hl.x(Lak;IIII)V")
    public static void method3713(class43 arg0, int arg1, int arg2, int arg3) {
        if (field517 >= 50 || field516 == 0 || arg0.field972 == null || arg1 >= arg0.field972.length) {
            return;
        }
        int var4 = arg0.field972[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field463[field517] = var5;
        field519[field517] = var6;
        field520[field517] = 0;
        field522[field517] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field468[field517] = (var8 << 16) + (var9 << 8) + var7;
        field517++;
    }

    @ObfuscatedName("al.d(IIIB)V")
    public static void method771(int arg0, int arg1, int arg2) {
        if (field515 == 0 || arg1 == 0 || field517 >= 50) {
            return;
        }
        field463[field517] = arg0;
        field519[field517] = arg1;
        field520[field517] = arg2;
        field522[field517] = null;
        field468[field517] = 0;
        field517++;
    }

    @ObfuscatedName("fl.o(I)V")
    public static final void method3220() {
        int[] var0 = class33.field731;
        for (int var1 = 0; var1 < class33.field734; var1++) {
            class3 var2 = field398[var0[var1]];
            if (var2 != null && var2.field815 > 0) {
                var2.field815--;
                if (var2.field815 == 0) {
                    var2.field853 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field315; var3++) {
            int var4 = field316[var3];
            class35 var5 = field314[var4];
            if (var5 != null && var5.field815 > 0) {
                var5.field815--;
                if (var5.field815 == 0) {
                    var5.field853 = null;
                }
            }
        }
    }

    @ObfuscatedName("fl.c(I)V")
    public static final void method3222() {
        int var0 = class33.field734;
        int[] var1 = class33.field731;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field398[var1[var2]];
            if (var3 != null) {
                method600(var3, 1);
            }
        }
    }

    @ObfuscatedName("x.b(Lat;IB)V")
    public static final void method600(class38 arg0, int arg1) {
        if (arg0.field844 > field287) {
            int var2 = arg0.field844 - field287;
            int var3 = arg0.field840 * 128 + arg0.field803 * 64;
            int var4 = arg0.field843 * 128 + arg0.field803 * 64;
            arg0.field847 += (var3 - arg0.field847) / var2;
            arg0.field835 += (var4 - arg0.field835) / var2;
            arg0.field832 = 0;
            arg0.field849 = arg0.field846;
        } else if (arg0.field845 >= field287) {
            if (field287 == arg0.field845 || arg0.field830 == -1 || arg0.field833 != 0 || arg0.field842 + 1 > class43.method575(arg0.field830).field976[arg0.field831]) {
                int var5 = arg0.field845 - arg0.field844;
                int var6 = field287 - arg0.field844;
                int var7 = arg0.field840 * 128 + arg0.field803 * 64;
                int var8 = arg0.field843 * 128 + arg0.field803 * 64;
                int var9 = arg0.field841 * 128 + arg0.field803 * 64;
                int var10 = arg0.field822 * 128 + arg0.field803 * 64;
                arg0.field847 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field835 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field832 = 0;
            arg0.field849 = arg0.field846;
            arg0.field801 = arg0.field849;
        } else {
            arg0.field827 = arg0.field804;
            if (arg0.field852 == 0) {
                arg0.field832 = 0;
            } else {
                label334: {
                    if (arg0.field830 != -1 && arg0.field833 == 0) {
                        class43 var11 = class43.method575(arg0.field830);
                        if (arg0.field857 > 0 && var11.field981 == 0) {
                            arg0.field832++;
                            break label334;
                        }
                        if (arg0.field857 <= 0 && var11.field986 == 0) {
                            arg0.field832++;
                            break label334;
                        }
                    }
                    int var12 = arg0.field847;
                    int var13 = arg0.field835;
                    int var14 = arg0.field810[arg0.field852 - 1] * 128 + arg0.field803 * 64;
                    int var15 = arg0.field817[arg0.field852 - 1] * 128 + arg0.field803 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field849 = 1280;
                        } else if (var13 > var15) {
                            arg0.field849 = 1792;
                        } else {
                            arg0.field849 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field849 = 768;
                        } else if (var13 > var15) {
                            arg0.field849 = 256;
                        } else {
                            arg0.field849 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field849 = 1024;
                    } else if (var13 > var15) {
                        arg0.field849 = 0;
                    }
                    byte var16 = arg0.field856[arg0.field852 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field849 - arg0.field801 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field808;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field807;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field819;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field823;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field807;
                        }
                        arg0.field827 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class35) {
                            var20 = ((class35) arg0).field762.field900;
                        }
                        if (var20) {
                            if (arg0.field849 != arg0.field801 && arg0.field824 == -1 && arg0.field851 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field852 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field852 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field832 > 0 && arg0.field852 > 1) {
                                var19 = 8;
                                arg0.field832--;
                            }
                        } else {
                            if (arg0.field852 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field852 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field832 > 0 && arg0.field852 > 1) {
                                var19 = 8;
                                arg0.field832--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field827 == arg0.field807 && arg0.field811 != -1) {
                            arg0.field827 = arg0.field811;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field847 += var19;
                                if (arg0.field847 > var14) {
                                    arg0.field847 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field847 -= var19;
                                if (arg0.field847 < var14) {
                                    arg0.field847 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field835 += var19;
                                if (arg0.field835 > var15) {
                                    arg0.field835 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field835 -= var19;
                                if (arg0.field835 < var15) {
                                    arg0.field835 = var15;
                                }
                            }
                        }
                        if (arg0.field847 == var14 && arg0.field835 == var15) {
                            arg0.field852--;
                            if (arg0.field857 > 0) {
                                arg0.field857--;
                            }
                        }
                    } else {
                        arg0.field847 = var14;
                        arg0.field835 = var15;
                        arg0.field852--;
                        if (arg0.field857 > 0) {
                            arg0.field857--;
                        }
                    }
                }
            }
        }
        if (arg0.field847 < 128 || arg0.field835 < 128 || arg0.field847 >= 13184 || arg0.field835 >= 13184) {
            arg0.field830 = -1;
            arg0.field806 = -1;
            arg0.field844 = 0;
            arg0.field845 = 0;
            arg0.field847 = arg0.field810[0] * 128 + arg0.field803 * 64;
            arg0.field835 = arg0.field817[0] * 128 + arg0.field803 * 64;
            arg0.method760();
        }
        if (Statics.field13 == arg0 && (arg0.field847 < 1536 || arg0.field835 < 1536 || arg0.field847 >= 11776 || arg0.field835 >= 11776)) {
            arg0.field830 = -1;
            arg0.field806 = -1;
            arg0.field844 = 0;
            arg0.field845 = 0;
            arg0.field847 = arg0.field810[0] * 128 + arg0.field803 * 64;
            arg0.field835 = arg0.field817[0] * 128 + arg0.field803 * 64;
            arg0.method760();
        }
        method44(arg0);
        arg0.field802 = false;
        if (arg0.field827 != -1) {
            class43 var21 = class43.method575(arg0.field827);
            if (var21 == null || var21.field974 == null) {
                arg0.field827 = -1;
            } else {
                arg0.field829++;
                if (arg0.field828 < var21.field974.length && arg0.field829 > var21.field976[arg0.field828]) {
                    arg0.field829 = 1;
                    arg0.field828++;
                    method3713(var21, arg0.field828, arg0.field847, arg0.field835);
                }
                if (arg0.field828 >= var21.field974.length) {
                    arg0.field829 = 0;
                    arg0.field828 = 0;
                    method3713(var21, arg0.field828, arg0.field847, arg0.field835);
                }
            }
        }
        if (arg0.field806 != -1 && field287 >= arg0.field838) {
            if (arg0.field836 < 0) {
                arg0.field836 = 0;
            }
            int var22 = class44.method152(arg0.field806).field1006;
            if (var22 == -1) {
                arg0.field806 = -1;
            } else {
                class43 var23 = class43.method575(var22);
                if (var23 == null || var23.field974 == null) {
                    arg0.field806 = -1;
                } else {
                    arg0.field809++;
                    if (arg0.field836 < var23.field974.length && arg0.field809 > var23.field976[arg0.field836]) {
                        arg0.field809 = 1;
                        arg0.field836++;
                        method3713(var23, arg0.field836, arg0.field847, arg0.field835);
                    }
                    if (arg0.field836 >= var23.field974.length && (arg0.field836 < 0 || arg0.field836 >= var23.field974.length)) {
                        arg0.field806 = -1;
                    }
                }
            }
        }
        if (arg0.field830 != -1 && arg0.field833 <= 1) {
            class43 var24 = class43.method575(arg0.field830);
            if (var24.field981 == 1 && arg0.field857 > 0 && arg0.field844 <= field287 && arg0.field845 < field287) {
                arg0.field833 = 1;
                return;
            }
        }
        if (arg0.field830 != -1 && arg0.field833 == 0) {
            class43 var25 = class43.method575(arg0.field830);
            if (var25 == null || var25.field974 == null) {
                arg0.field830 = -1;
            } else {
                arg0.field842++;
                if (arg0.field831 < var25.field974.length && arg0.field842 > var25.field976[arg0.field831]) {
                    arg0.field842 = 1;
                    arg0.field831++;
                    method3713(var25, arg0.field831, arg0.field847, arg0.field835);
                }
                if (arg0.field831 >= var25.field974.length) {
                    arg0.field831 -= var25.field978;
                    arg0.field855++;
                    if (arg0.field855 >= var25.field984) {
                        arg0.field830 = -1;
                    } else if (arg0.field831 >= 0 && arg0.field831 < var25.field974.length) {
                        method3713(var25, arg0.field831, arg0.field847, arg0.field835);
                    } else {
                        arg0.field830 = -1;
                    }
                }
                arg0.field802 = var25.field980;
            }
        }
        if (arg0.field833 > 0) {
            arg0.field833--;
        }
    }

    @ObfuscatedName("l.aa(Lat;B)V")
    public static final void method44(class38 arg0) {
        if (arg0.field851 == 0) {
            return;
        }
        if (arg0.field824 != -1) {
            class38 var1 = null;
            if (arg0.field824 < 32768) {
                var1 = field314[arg0.field824];
            } else if (arg0.field824 >= 32768) {
                var1 = field398[arg0.field824 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field847 - var1.field847;
                int var3 = arg0.field835 - var1.field835;
                if (var2 != 0 || var3 != 0) {
                    arg0.field849 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field825) {
                arg0.field824 = -1;
                arg0.field825 = false;
            }
        }
        if (arg0.field826 != -1 && (arg0.field852 == 0 || arg0.field832 > 0)) {
            arg0.field849 = arg0.field826;
            arg0.field826 = -1;
        }
        int var4 = arg0.field849 - arg0.field801 & 0x7FF;
        if (var4 == 0 && arg0.field825) {
            arg0.field824 = -1;
            arg0.field825 = false;
        }
        if (var4 == 0) {
            arg0.field858 = 0;
            return;
        }
        arg0.field858++;
        if (var4 > 1024) {
            arg0.field801 -= arg0.field851;
            boolean var5 = true;
            if (var4 < arg0.field851 || var4 > 2048 - arg0.field851) {
                arg0.field801 = arg0.field849;
                var5 = false;
            }
            if (arg0.field827 == arg0.field804 && (arg0.field858 > 25 || var5)) {
                if (arg0.field805 == -1) {
                    arg0.field827 = arg0.field807;
                } else {
                    arg0.field827 = arg0.field805;
                }
            }
        } else {
            arg0.field801 += arg0.field851;
            boolean var6 = true;
            if (var4 < arg0.field851 || var4 > 2048 - arg0.field851) {
                arg0.field801 = arg0.field849;
                var6 = false;
            }
            if (arg0.field827 == arg0.field804 && (arg0.field858 > 25 || var6)) {
                if (arg0.field850 == -1) {
                    arg0.field827 = arg0.field807;
                } else {
                    arg0.field827 = arg0.field850;
                }
            }
        }
        arg0.field801 &= 0x7FF;
    }

    @ObfuscatedName("fv.ao(Lf;III)V")
    public static void method3263(class3 arg0, int arg1, int arg2) {
        if (arg0.field830 == arg1 && arg1 != -1) {
            int var3 = class43.method575(arg1).field970;
            if (var3 == 1) {
                arg0.field831 = 0;
                arg0.field842 = 0;
                arg0.field833 = arg2;
                arg0.field855 = 0;
            }
            if (var3 == 2) {
                arg0.field855 = 0;
            }
        } else if (arg1 == -1 || arg0.field830 == -1 || class43.method575(arg1).field971 >= class43.method575(arg0.field830).field971) {
            arg0.field830 = arg1;
            arg0.field831 = 0;
            arg0.field842 = 0;
            arg0.field833 = arg2;
            arg0.field855 = 0;
            arg0.field857 = arg0.field852;
        }
    }

    @ObfuscatedName("ao.as(I)I")
    public static int method679() {
        return field427 ? 2 : 1;
    }

    @ObfuscatedName("v.ae(B)V")
    public static void method247() {
        field319.method2621(118);
        field319.method2357(method679());
        field319.method2358(Statics.field2049);
        field319.method2358(Statics.field2102);
    }

    @ObfuscatedName("dy.ai(I)V")
    public static void method2674() {
        client var0 = Statics.field275;
        synchronized (Statics.field275) {
            Container var1 = Statics.field275.method2877();
            if (var1 != null) {
                Statics.field253 = Math.max(var1.getSize().width, Statics.field144);
                Statics.field586 = Math.max(var1.getSize().height, Statics.field1886);
                if (Statics.field903 == var1) {
                    Insets var2 = Statics.field903.getInsets();
                    Statics.field253 -= var2.right + var2.left;
                    Statics.field586 -= var2.top + var2.bottom;
                }
                if (Statics.field253 <= 0) {
                    Statics.field253 = 1;
                }
                if (Statics.field586 <= 0) {
                    Statics.field586 = 1;
                }
                if (method679() == 1) {
                    Statics.field2049 = field512;
                    Statics.field2102 = field491 * 503;
                } else {
                    Statics.field2049 = Math.min(Statics.field253, 7680);
                    Statics.field2102 = Math.min(Statics.field586, 2160);
                }
                field2189 = (Statics.field253 - Statics.field2049) / 2;
                field2186 = 0;
                Statics.field245.setSize(Statics.field2049, Statics.field2102);
                int var3 = Statics.field2049;
                int var4 = Statics.field2102;
                Canvas var5 = Statics.field245;
                class78 var7;
                try {
                    class82 var6 = new class82();
                    var6.method1520(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var12) {
                    class76 var9 = new class76();
                    var9.method1520(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field1441 = var7;
                if (Statics.field903 == var1) {
                    Insets var10 = Statics.field903.getInsets();
                    Statics.field245.setLocation(field2189 + var10.left, field2186 + var10.top);
                } else {
                    Statics.field245.setLocation(field2189, field2186);
                }
                method3();
                if (field439 != -1) {
                    method630(true);
                }
                method204();
            }
        }
    }

    @ObfuscatedName("j.am(I)V")
    public static void method3() {
        int var0 = Statics.field2049;
        int var1 = Statics.field2102;
        if (Statics.field253 < var0) {
            int var2 = Statics.field253;
        }
        if (Statics.field586 < var1) {
            int var3 = Statics.field586;
        }
        if (Statics.field2278 != null) {
            try {
                class132.method2705(Statics.field275, "resize", new Object[] { method679() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("n.ax(I)V")
    public static void method204() {
        int var0 = field2189;
        int var1 = field2186;
        int var2 = Statics.field253 - Statics.field2049 - var0;
        int var3 = Statics.field586 - Statics.field2102 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field275.method2877();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field903 == var4) {
                Insets var7 = Statics.field903.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field586);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field253, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field253 + var5 - var2, var6, var2, Statics.field586);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field586 + var6 - var3, Statics.field253, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("as.ay(I)V")
    public static final void method684() {
        if (field439 != -1) {
            int var0 = field439;
            if (class173.method3172(var0)) {
                method2307(Statics.field2858[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field478; var1++) {
            if (field371[var1]) {
                field497[var1] = true;
            }
            field482[var1] = field371[var1];
            field371[var1] = false;
        }
        field479 = field287;
        field424 = -1;
        field425 = -1;
        Statics.field679 = null;
        if (field439 != -1) {
            field478 = 0;
            method2258(field439, 0, 0, Statics.field2049, Statics.field2102, 0, 0, -1);
        }
        class80.method1752();
        if (field501) {
            int var7 = Statics.field254;
            int var8 = Statics.field794;
            int var9 = Statics.field10;
            int var10 = Statics.field268;
            int var11 = 6116423;
            class80.method1697(var7, var8, var9, var10, var11);
            class80.method1697(var7 + 1, var8 + 1, var9 - 2, 16, 0);
            class80.method1692(var7 + 1, var8 + 18, var9 - 2, var10 - 19, 0);
            Statics.field2175.method3809(class157.field2297, var7 + 3, var8 + 14, var11, -1);
            int var12 = class140.field2135;
            int var13 = class140.field2136;
            for (int var14 = 0; var14 < field417; var14++) {
                int var15 = (field417 - 1 - var14) * 15 + var8 + 31;
                int var16 = 16777215;
                if (var12 > var7 && var12 < var7 + var9 && var13 > var15 - 13 && var13 < var15 + 3) {
                    var16 = 16776960;
                }
                Statics.field2175.method3809(method2257(var14), var7 + 3, var15, var16, 0);
            }
            int var17 = Statics.field254;
            int var18 = Statics.field794;
            int var19 = Statics.field10;
            int var20 = Statics.field268;
            for (int var21 = 0; var21 < field478; var21++) {
                if (field485[var21] + field483[var21] > var17 && field483[var21] < var17 + var19 && field527[var21] + field484[var21] > var18 && field484[var21] < var18 + var20) {
                    field497[var21] = true;
                }
            }
        } else if (field424 != -1) {
            int var2 = field424;
            int var3 = field425;
            if (field417 >= 2 || field399 != 0 || field547) {
                String var4;
                if (field399 == 1 && field417 < 2) {
                    var4 = class157.field2327 + class157.field2517 + field429 + " " + class2.field24;
                } else if (field547 && field417 < 2) {
                    var4 = field433 + class157.field2517 + field434 + " " + class2.field24;
                } else {
                    int var5 = field417 - 1;
                    String var6;
                    if (field423[var5].length() > 0) {
                        var6 = field298[var5] + class157.field2517 + field423[var5];
                    } else {
                        var6 = field298[var5];
                    }
                    var4 = var6;
                }
                if (field417 > 2) {
                    var4 = var4 + class2.method1505(16777215) + " " + '/' + " " + (field417 - 2) + class157.field2474;
                }
                Statics.field2175.method3817(var4, var2 + 4, var3 + 15, 16777215, 0, field287 / 1000);
            }
        }
        if (field317 == 3) {
            for (int var22 = 0; var22 < field478; var22++) {
                if (field482[var22]) {
                    class80.method1698(field483[var22], field484[var22], field485[var22], field527[var22], 16711935, 128);
                } else if (field497[var22]) {
                    class80.method1698(field483[var22], field484[var22], field485[var22], field527[var22], 16711680, 128);
                }
            }
        }
        class24.method1025(Statics.field135, Statics.field13.field847, Statics.field13.field835, field421);
        field421 = 0;
    }

    @ObfuscatedName("ar.az(Ljava/lang/String;ZI)V")
    public static final void method846(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field140.method3836(arg0, 250);
        int var6 = Statics.field140.method3822(arg0, 250) * 13;
        class80.method1697(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1692(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field140.method3813(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3529(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field245.getGraphics();
                Statics.field1441.method1516(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field245.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field478; var13++) {
            if (field485[var13] + field483[var13] > var9 && field483[var13] < var9 + var11 && field527[var13] + field484[var13] > var10 && field484[var13] < var10 + var12) {
                field497[var13] = true;
            }
        }
    }

    @ObfuscatedName("am.av(IIIIZI)V")
    public static final void method716(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field530 - field529) * var5 / 100 + field529;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field535) {
            short var8 = field535;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field534) {
                var6 = field534;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1752();
                    class80.method1697(arg0, arg1, var10, arg3, -16777216);
                    class80.method1697(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field285) {
            short var11 = field285;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field387) {
                var6 = field387;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1752();
                    class80.method1697(arg0, arg1, arg2, var13, -16777216);
                    class80.method1697(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field532 - field489) * var5 / 100 + field489;
        field541 = arg3 * var6 * var14 / 85504 << 1;
        if (field539 != arg2 || field540 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1572[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1891(var15, 500, 800, arg2, arg3);
        }
        field537 = arg0;
        field436 = arg1;
        field539 = arg2;
        field540 = arg3;
    }

    @ObfuscatedName("h.ap(Lay;I)V")
    public static final void method109(class34 arg0) {
        if (Statics.field13.field847 >> 7 == field538 && Statics.field13.field835 >> 7 == field295) {
            field538 = 0;
        }
        int var1 = class33.field734;
        int[] var2 = class33.field731;
        int var3 = var1;
        if (class34.field754 == arg0 || class34.field749 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field754 == arg0) {
                var5 = Statics.field13;
                var6 = Statics.field13.field59 << 14;
            } else if (class34.field749 == arg0) {
                var5 = field398[field407];
                var6 = field407 << 14;
            } else {
                var5 = field398[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field751 == arg0 && field407 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method21() && !var5.field36) {
                var5.field50 = false;
                if ((field528 && var1 > 50 || var1 > 200) && class34.field754 != arg0 && var5.field827 == var5.field804) {
                    var5.field50 = true;
                }
                int var7 = var5.field847 >> 7;
                int var8 = var5.field835 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field45 == null || field287 < var5.field40 || field287 >= var5.field41) {
                        if ((var5.field847 & 0x7F) == 64 && (var5.field835 & 0x7F) == 64) {
                            if (field382 == field306[var7][var8]) {
                                continue;
                            }
                            field306[var7][var8] = field382;
                        }
                        var5.field39 = method745(var5.field847, var5.field835, Statics.field135);
                        Statics.field611.method1804(Statics.field135, var5.field847, var5.field835, var5.field39, 60, var5, var5.field801, var6, var5.field802);
                    } else {
                        var5.field50 = false;
                        var5.field39 = method745(var5.field847, var5.field835, Statics.field135);
                        Statics.field611.method1805(Statics.field135, var5.field847, var5.field835, var5.field39, 60, var5, var5.field801, var6, var5.field46, var5.field53, var5.field48, var5.field49);
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.at(ZI)V")
    public static final void method772(boolean arg0) {
        for (int var1 = 0; var1 < field315; var1++) {
            class35 var2 = field314[field316[var1]];
            int var3 = (field316[var1] << 14) + 536870912;
            if (var2 != null && var2.method21() && var2.field762.field891 == arg0 && var2.field762.method793()) {
                int var4 = var2.field847 >> 7;
                int var5 = var2.field835 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field803 == 1 && (var2.field847 & 0x7F) == 64 && (var2.field835 & 0x7F) == 64) {
                        if (field382 == field306[var4][var5]) {
                            continue;
                        }
                        field306[var4][var5] = field382;
                    }
                    if (!var2.field762.field882) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field611.method1804(Statics.field135, var2.field847, var2.field835, method745(var2.field847 + (var2.field803 * 64 - 64), var2.field835 + (var2.field803 * 64 - 64), Statics.field135), var2.field803 * 64 - 64 + 60, var2, var2.field801, var3, var2.field802);
                }
            }
        }
    }

    @ObfuscatedName("ax.al(B)V")
    public static final void method734() {
        for (class30 var0 = (class30) field492.method3606(); var0 != null; var0 = (class30) field492.method3608()) {
            if (Statics.field135 != var0.field665 || var0.field663) {
                var0.method3700();
            } else if (field287 >= var0.field664) {
                var0.method686(field421);
                if (var0.field663) {
                    var0.method3700();
                } else {
                    Statics.field611.method1804(var0.field665, var0.field666, var0.field667, var0.field677, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("at.ac(B)I")
    public static final int method768() {
        if (Statics.field2278.field143) {
            return Statics.field135;
        } else {
            int var0 = method745(Statics.field673, Statics.field1375, Statics.field135);
            return var0 - Statics.field2054 >= 800 || (class6.field87[Statics.field135][Statics.field673 >> 7][Statics.field1375 >> 7] & 0x4) == 0 ? 3 : Statics.field135;
        }
    }

    @ObfuscatedName("l.ar(III)V")
    public static final void method46(int arg0, int arg1) {
        if (field430 == 2) {
            method146((field503 - Statics.field1054 << 7) + field301, (field438 - Statics.field2630 << 7) + field350, field300 * 2);
            if (field383 > -1 && field287 % 20 < 10) {
                Statics.field343[0].method1607(field383 + arg0 - 12, field396 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("cd.ah(Lat;IIIIII)V")
    public static final void method2037(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method21()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field762;
            if (var6.field896 != null) {
                var6 = var6.method779();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field734;
        int[] var8 = class33.field731;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field36) {
                return;
            }
            if (var10.field47 != -1 || var10.field34 != -1) {
                method1593(arg0, arg0.field812 + 15);
                if (field383 > -1) {
                    if (var10.field47 != -1) {
                        Statics.field1373[var10.field47].method1607(field383 + arg2 - 12, field396 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field34 != -1) {
                        Statics.field2237[var10.field34].method1607(field383 + arg2 - 12, field396 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field430 == 10 && field283 == var8[arg1]) {
                method1593(arg0, arg0.field812 + 15);
                if (field383 > -1) {
                    Statics.field343[1].method1607(field383 + arg2 - 12, field396 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field762;
            if (var11.field896 != null) {
                var11 = var11.method779();
            }
            if (var11.field894 >= 0 && var11.field894 < Statics.field2237.length) {
                method1593(arg0, arg0.field812 + 15);
                if (field383 > -1) {
                    Statics.field2237[var11.field894].method1607(field383 + arg2 - 12, field396 + arg3 - 30);
                }
            }
            if (field430 == 1 && field312 == field316[arg1 - var7] && field287 % 20 < 10) {
                method1593(arg0, arg0.field812 + 15);
                if (field383 > -1) {
                    Statics.field343[0].method1607(field383 + arg2 - 12, field396 + arg3 - 28);
                }
            }
        }
        if (arg0.field853 != null && (arg1 >= var7 || !arg0.field814 && (field493 == 4 || !arg0.field813 && (field493 == 0 || field493 == 3 || field493 == 1 && method134(((class3) arg0).field35, false))))) {
            method1593(arg0, arg0.field812);
            if (field383 > -1 && field386 < field372) {
                field376[field386] = Statics.field2175.method3896(arg0.field853) / 2;
                field302[field386] = Statics.field2175.field3183;
                field373[field386] = field383;
                field374[field386] = field396;
                field555[field386] = arg0.field816;
                field378[field386] = arg0.field799;
                field353[field386] = arg0.field815;
                field395[field386] = arg0.field853;
                field386++;
            }
        }
        if (arg0.field821 > field287) {
            method1593(arg0, arg0.field812 + 15);
            if (field383 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field762;
                    var12 = var13.field902;
                }
                int var14 = arg0.field834 * var12 / arg0.field854;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field834 > 0) {
                    var14 = 1;
                }
                class80.method1697(field383 + arg2 - var12 / 2, field396 + arg3 - 3, var14, 5, 65280);
                class80.method1697(field383 + arg2 - var12 / 2 + var14, field396 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field820[var15] > field287) {
                method1593(arg0, arg0.field812 / 2);
                if (field383 > -1) {
                    if (var15 == 1) {
                        field396 -= 20;
                    }
                    if (var15 == 2) {
                        field383 -= 15;
                        field396 -= 10;
                    }
                    if (var15 == 3) {
                        field383 += 15;
                        field396 -= 10;
                    }
                    Statics.field194[arg0.field848[var15]].method1607(field383 + arg2 - 12, field396 + arg3 - 12);
                    Statics.field1533.method3812(Integer.toString(arg0.field818[var15]), field383 + arg2 - 1, field396 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ay.ak(IIIIB)V")
    public static final void method737(int arg0, int arg1, int arg2, int arg3) {
        field386 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field734;
        int[] var7 = class33.field731;
        for (int var8 = 0; var8 < field315 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field398[var7[var8]];
                if (field407 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field314[field316[var8 - var6]];
            }
            method2037(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2037(field398[field407], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field386; var10++) {
            int var11 = field373[var10];
            int var12 = field374[var10];
            int var13 = field376[var10];
            int var14 = field302[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field374[var16] - field302[var16] && var12 - var14 < field374[var16] + 2 && var11 - var13 < field376[var16] + field373[var16] && var11 + var13 > field373[var16] - field376[var16] && field374[var16] - field302[var16] < var12) {
                        var12 = field374[var16] - field302[var16];
                        var15 = true;
                    }
                }
            }
            field383 = field373[var10];
            field396 = field374[var10] = var12;
            String var17 = field395[var10];
            if (field437 == 0) {
                int var18 = 16776960;
                if (field555[var10] < 6) {
                    var18 = field381[field555[var10]];
                }
                if (field555[var10] == 6) {
                    var18 = field382 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field555[var10] == 7) {
                    var18 = field382 % 20 < 10 ? 255 : 65535;
                }
                if (field555[var10] == 8) {
                    var18 = field382 % 20 < 10 ? 45056 : 8454016;
                }
                if (field555[var10] == 9) {
                    int var19 = 150 - field353[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field555[var10] == 10) {
                    int var20 = 150 - field353[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field555[var10] == 11) {
                    int var21 = 150 - field353[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field378[var10] == 0) {
                    Statics.field2175.method3812(var17, field383 + arg0, field396 + arg1, var18, 0);
                }
                if (field378[var10] == 1) {
                    Statics.field2175.method3814(var17, field383 + arg0, field396 + arg1, var18, 0, field382);
                }
                if (field378[var10] == 2) {
                    Statics.field2175.method3887(var17, field383 + arg0, field396 + arg1, var18, 0, field382);
                }
                if (field378[var10] == 3) {
                    Statics.field2175.method3816(var17, field383 + arg0, field396 + arg1, var18, 0, field382, 150 - field353[var10]);
                }
                if (field378[var10] == 4) {
                    int var22 = (150 - field353[var10]) * (Statics.field2175.method3896(var17) + 100) / 150;
                    class80.method1694(field383 + arg0 - 50, arg1, field383 + arg0 + 50, arg1 + arg3);
                    Statics.field2175.method3809(var17, field383 + arg0 + 50 - var22, field396 + arg1, var18, 0);
                    class80.method1693(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field378[var10] == 5) {
                    int var23 = 150 - field353[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1694(arg0, field396 + arg1 - Statics.field2175.field3183 - 1, arg0 + arg2, field396 + arg1 + 5);
                    Statics.field2175.method3812(var17, field383 + arg0, field396 + arg1 + var24, var18, 0);
                    class80.method1693(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2175.method3812(var17, field383 + arg0, field396 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("hn.ag(I)V")
    public static final void method3733() {
        field397 = 0;
        int var0 = (Statics.field13.field847 >> 7) + Statics.field1054;
        int var1 = (Statics.field13.field835 >> 7) + Statics.field2630;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field397 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field397 = 1;
        }
        if (field397 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field397 = 0;
        }
    }

    @ObfuscatedName("ct.aq(IIIIB)V")
    public static final void method2057(int arg0, int arg1, int arg2, int arg3) {
        if (field388 == 1) {
            Statics.field1966[field362 / 100].method1607(field521 - 8, field400 - 8);
        }
        if (field388 == 2) {
            Statics.field1966[field362 / 100 + 4].method1607(field521 - 8, field400 - 8);
        }
        method3733();
    }

    @ObfuscatedName("bv.au(Lat;II)V")
    public static final void method1593(class38 arg0, int arg1) {
        method146(arg0.field847, arg0.field835, arg1);
    }

    @ObfuscatedName("k.aw(IIII)V")
    public static final void method146(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field383 = -1;
            field396 = -1;
            return;
        }
        int var3 = method745(arg0, arg1, Statics.field135) - arg2;
        int var4 = arg0 - Statics.field673;
        int var5 = var3 - Statics.field2054;
        int var6 = arg1 - Statics.field1375;
        int var7 = class91.field1572[Statics.field170];
        int var8 = class91.field1574[Statics.field170];
        int var9 = class91.field1572[Statics.field1435];
        int var10 = class91.field1574[Statics.field1435];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field383 = field541 * var11 / var15 + field539 / 2;
            field396 = field541 * var14 / var15 + field540 / 2;
        } else {
            field383 = -1;
            field396 = -1;
        }
    }

    @ObfuscatedName("az.ad(IIIB)I")
    public static final int method745(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field87[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field80[var5][var3][var4] + class6.field80[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field80[var5][var3][var4 + 1] + class6.field80[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dd.af(ZI)V")
    public static final void method2303(boolean arg0) {
        field337 = arg0;
        if (!field337) {
            int var1 = field321.method2408();
            int var2 = field321.method2407();
            int var3 = field321.method2374();
            Statics.field198 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field198[var4][var5] = field321.method2377();
                }
            }
            Statics.field1052 = new int[var3];
            Statics.field1045 = new int[var3];
            Statics.field1576 = new int[var3];
            Statics.field1378 = new byte[var3][];
            Statics.field271 = new byte[var3][];
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
                        Statics.field1052[var7] = var10;
                        Statics.field1045[var7] = Statics.field186.method3099("m" + var8 + "_" + var9);
                        Statics.field1576[var7] = Statics.field186.method3099("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2723(var2, var1);
            return;
        }
        int var11 = field321.method2408();
        int var12 = field321.method2406();
        int var13 = field321.method2374();
        field321.method2623();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field321.method2622(1);
                    if (var17 == 1) {
                        field338[var14][var15][var16] = field321.method2622(26);
                    } else {
                        field338[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field321.method2636();
        Statics.field198 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field198[var18][var19] = field321.method2377();
            }
        }
        Statics.field1052 = new int[var13];
        Statics.field1045 = new int[var13];
        Statics.field1576 = new int[var13];
        Statics.field1378 = new byte[var13][];
        Statics.field271 = new byte[var13][];
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
                            if (Statics.field1052[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1052[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1045[var20] = Statics.field186.method3099("m" + var29 + "_" + var30);
                            Statics.field1576[var20] = Statics.field186.method3099("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2723(var12, var11);
    }

    @ObfuscatedName("ex.aj(III)V")
    public static final void method2723(int arg0, int arg1) {
        if (Statics.field2085 == arg0 && Statics.field1148 == arg1) {
            return;
        }
        Statics.field2085 = arg0;
        Statics.field1148 = arg1;
        method695(25);
        method846(class157.field2307, true);
        int var2 = Statics.field1054;
        int var3 = Statics.field2630;
        Statics.field1054 = (arg0 - 6) * 8;
        Statics.field2630 = (arg1 - 6) * 8;
        int var4 = Statics.field1054 - var2;
        int var5 = Statics.field2630 - var3;
        int var6 = Statics.field1054;
        int var7 = Statics.field2630;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field314[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field810[var10] -= var4;
                    var9.field817[var10] -= var5;
                }
                var9.field847 -= var4 * 128;
                var9.field835 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field398[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field810[var13] -= var4;
                    var12.field817[var13] -= var5;
                }
                var12.field847 -= var4 * 128;
                var12.field835 -= var5 * 128;
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
                        field408[var24][var20][var21] = field408[var24][var22][var23];
                    } else {
                        field408[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field409.method3606(); var25 != null; var25 = (class17) field409.method3608()) {
            var25.field225 -= var4;
            var25.field226 -= var5;
            if (var25.field225 < 0 || var25.field226 < 0 || var25.field225 >= 104 || var25.field226 >= 104) {
                var25.method3700();
            }
        }
        if (field538 != 0) {
            field538 -= var4;
            field295 -= var5;
        }
        field517 = 0;
        field335 = false;
        field504 = -1;
        field492.method3600();
        field410.method3600();
        for (int var26 = 0; var26 < 4; var26++) {
            field336[var26].method2280();
        }
    }

    @ObfuscatedName("o.ab(ZI)V")
    public static final void method615(boolean arg0) {
        method2697();
        field325++;
        if (field325 < 50 && !arg0) {
            return;
        }
        field325 = 0;
        if (field330 || Statics.field171 == null) {
            return;
        }
        field319.method2621(136);
        try {
            Statics.field171.method2863(field319.field1981, 0, field319.field1982);
            field319.field1982 = 0;
        } catch (IOException var2) {
            field330 = true;
        }
    }

    @ObfuscatedName("ex.an(I)V")
    public static final void method2719() {
        method615(false);
        field331 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1378.length; var1++) {
            if (Statics.field1045[var1] != -1 && Statics.field1378[var1] == null) {
                Statics.field1378[var1] = Statics.field186.method3124(Statics.field1045[var1], 0);
                if (Statics.field1378[var1] == null) {
                    var0 = false;
                    field331++;
                }
            }
            if (Statics.field1576[var1] != -1 && Statics.field271[var1] == null) {
                Statics.field271[var1] = Statics.field186.method3109(Statics.field1576[var1], 0, Statics.field198[var1]);
                if (Statics.field271[var1] == null) {
                    var0 = false;
                    field331++;
                }
            }
        }
        if (!var0) {
            field486 = 1;
            return;
        }
        field333 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1378.length; var3++) {
            byte[] var4 = Statics.field271[var3];
            if (var4 != null) {
                int var5 = (Statics.field1052[var3] >> 8) * 64 - Statics.field1054;
                int var6 = (Statics.field1052[var3] & 0xFF) * 64 - Statics.field2630;
                if (field337) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class119 var9 = new class119(var4);
                int var10 = -1;
                label453: while (true) {
                    int var11 = var9.method2384();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2384();
                            if (var16 == 0) {
                                continue label453;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2372() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class41 var22 = class41.method736(var10);
                                if (var19 != 22 || !field528 || var22.field938 != 0 || var22.field922 == 1 || var22.field906) {
                                    if (!var22.method810()) {
                                        field333++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2384();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2372();
                    }
                }
            }
        }
        if (!var2) {
            field486 = 2;
            return;
        }
        if (field486 != 0) {
            method846(class157.field2307 + class2.field21 + class2.field22 + 100 + "%" + class2.field25, true);
        }
        method2697();
        method3268();
        method2697();
        Statics.field611.method1933();
        method2697();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field336[var23].method2280();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field87[var24][var25][var26] = 0;
                }
            }
        }
        method2697();
        class6.method2040();
        int var27 = Statics.field1378.length;
        class24.method3271();
        method615(true);
        if (!field337) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1052[var28] >> 8) * 64 - Statics.field1054;
                int var30 = (Statics.field1052[var28] & 0xFF) * 64 - Statics.field2630;
                byte[] var31 = Statics.field1378[var28];
                if (var31 != null) {
                    method2697();
                    class6.method137(var31, var29, var30, Statics.field2085 * 8 - 48, Statics.field1148 * 8 - 48, field336);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field1052[var32] >> 8) * 64 - Statics.field1054;
                int var34 = (Statics.field1052[var32] & 0xFF) * 64 - Statics.field2630;
                byte[] var35 = Statics.field1378[var32];
                if (var35 == null && Statics.field1148 < 800) {
                    method2697();
                    class6.method13(var33, var34, 64, 64);
                }
            }
            method615(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field271[var36];
                if (var37 != null) {
                    int var38 = (Statics.field1052[var36] >> 8) * 64 - Statics.field1054;
                    int var39 = (Statics.field1052[var36] & 0xFF) * 64 - Statics.field2630;
                    method2697();
                    class6.method2970(var37, var38, var39, Statics.field611, field336);
                }
            }
        }
        if (field337) {
            for (int var40 = 0; var40 < 4; var40++) {
                method2697();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        boolean var43 = false;
                        int var44 = field338[var40][var41][var42];
                        if (var44 != -1) {
                            int var45 = var44 >> 24 & 0x3;
                            int var46 = var44 >> 1 & 0x3;
                            int var47 = var44 >> 14 & 0x3FF;
                            int var48 = var44 >> 3 & 0x7FF;
                            int var49 = (var47 / 8 << 8) + var48 / 8;
                            for (int var50 = 0; var50 < Statics.field1052.length; var50++) {
                                if (Statics.field1052[var50] == var49 && Statics.field1378[var50] != null) {
                                    class6.method234(Statics.field1378[var50], var40, var41 * 8, var42 * 8, var45, (var47 & 0x7) * 8, (var48 & 0x7) * 8, var46, field336);
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var43) {
                            class6.method186(var40, var41 * 8, var42 * 8);
                        }
                    }
                }
            }
            for (int var51 = 0; var51 < 13; var51++) {
                for (int var52 = 0; var52 < 13; var52++) {
                    int var53 = field338[0][var51][var52];
                    if (var53 == -1) {
                        class6.method13(var51 * 8, var52 * 8, 8, 8);
                    }
                }
            }
            method615(true);
            for (int var54 = 0; var54 < 4; var54++) {
                method2697();
                for (int var55 = 0; var55 < 13; var55++) {
                    label328: for (int var56 = 0; var56 < 13; var56++) {
                        int var57 = field338[var54][var55][var56];
                        if (var57 != -1) {
                            int var58 = var57 >> 24 & 0x3;
                            int var59 = var57 >> 1 & 0x3;
                            int var60 = var57 >> 14 & 0x3FF;
                            int var61 = var57 >> 3 & 0x7FF;
                            int var62 = (var60 / 8 << 8) + var61 / 8;
                            for (int var63 = 0; var63 < Statics.field1052.length; var63++) {
                                if (Statics.field1052[var63] == var62 && Statics.field271[var63] != null) {
                                    byte[] var64 = Statics.field271[var63];
                                    int var65 = var55 * 8;
                                    int var66 = var56 * 8;
                                    int var67 = (var60 & 0x7) * 8;
                                    int var68 = (var61 & 0x7) * 8;
                                    class86 var69 = Statics.field611;
                                    class108[] var70 = field336;
                                    class119 var71 = new class119(var64);
                                    int var72 = -1;
                                    while (true) {
                                        int var73 = var71.method2384();
                                        if (var73 == 0) {
                                            continue label328;
                                        }
                                        var72 += var73;
                                        int var74 = 0;
                                        while (true) {
                                            int var75 = var71.method2384();
                                            if (var75 == 0) {
                                                break;
                                            }
                                            var74 += var75 - 1;
                                            int var76 = var74 & 0x3F;
                                            int var77 = var74 >> 6 & 0x3F;
                                            int var78 = var74 >> 12;
                                            int var79 = var71.method2372();
                                            int var80 = var79 >> 2;
                                            int var81 = var79 & 0x3;
                                            if (var58 == var78 && var77 >= var67 && var77 < var67 + 8 && var76 >= var68 && var76 < var68 + 8) {
                                                class41 var82 = class41.method736(var72);
                                                int var84 = var77 & 0x7;
                                                int var85 = var76 & 0x7;
                                                int var87 = var82.field920;
                                                int var88 = var82.field921;
                                                if ((var81 & 0x1) == 1) {
                                                    int var89 = var87;
                                                    var87 = var88;
                                                    var88 = var89;
                                                }
                                                int var90 = var59 & 0x3;
                                                int var91;
                                                if (var90 == 0) {
                                                    var91 = var84;
                                                } else if (var90 == 1) {
                                                    var91 = var85;
                                                } else if (var90 == 2) {
                                                    var91 = 7 - var84 - (var87 - 1);
                                                } else {
                                                    var91 = 7 - var85 - (var88 - 1);
                                                }
                                                int var92 = var65 + var91;
                                                int var93 = var66 + class177.method2311(var77 & 0x7, var76 & 0x7, var59, var82.field920, var82.field921, var81);
                                                if (var92 > 0 && var93 > 0 && var92 < 103 && var93 < 103) {
                                                    int var94 = var54;
                                                    if ((class6.field87[1][var92][var93] & 0x2) == 2) {
                                                        var94 = var54 - 1;
                                                    }
                                                    class108 var95 = null;
                                                    if (var94 >= 0) {
                                                        var95 = var70[var94];
                                                    }
                                                    class6.method184(var54, var92, var93, var72, var59 + var81 & 0x3, var80, var69, var95);
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
        method615(true);
        method3268();
        method2697();
        class6.method870(Statics.field611, field336);
        method615(true);
        int var96 = class6.field75;
        if (var96 > Statics.field135) {
            var96 = Statics.field135;
        }
        if (var96 < Statics.field135 - 1) {
            int var97 = Statics.field135 - 1;
        }
        if (field528) {
            Statics.field611.method1839(class6.field75);
        } else {
            Statics.field611.method1839(0);
        }
        for (int var98 = 0; var98 < 104; var98++) {
            for (int var99 = 0; var99 < 104; var99++) {
                method3245(var98, var99);
            }
        }
        method2697();
        for (class17 var100 = (class17) field409.method3606(); var100 != null; var100 = (class17) field409.method3608()) {
            if (var100.field234 == -1) {
                var100.field223 = 0;
                method603(var100);
            } else {
                var100.method3700();
            }
        }
        class41.field908.method3541();
        if (Statics.field903 != null) {
            field319.method2621(210);
            field319.method2360(1057001181);
        }
        if (!field337) {
            int var101 = (Statics.field2085 - 6) / 8;
            int var102 = (Statics.field2085 + 6) / 8;
            int var103 = (Statics.field1148 - 6) / 8;
            int var104 = (Statics.field1148 + 6) / 8;
            for (int var105 = var101 - 1; var105 <= var102 + 1; var105++) {
                for (int var106 = var103 - 1; var106 <= var104 + 1; var106++) {
                    if (var105 < var101 || var105 > var102 || var106 < var103 || var106 > var104) {
                        Statics.field186.method3166("m" + var105 + "_" + var106);
                        Statics.field186.method3166("l" + var105 + "_" + var106);
                    }
                }
            }
        }
        method695(30);
        method2697();
        class6.method2299();
        field319.method2621(213);
        Statics.field1027.method2712();
        for (int var107 = 0; var107 < 32; var107++) {
            field2183[var107] = 0L;
        }
        for (int var108 = 0; var108 < 32; var108++) {
            field2184[var108] = 0L;
        }
        Statics.field1752 = 0;
    }

    @ObfuscatedName("i.bj(IIIIII)V")
    public static final void method119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field611.method1819(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field611.method1823(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1656.field1395;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method736(var12);
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
                class81 var14 = Statics.field1987[var13.field935];
                if (var14 != null) {
                    int var15 = (var13.field920 * 4 - var14.field1408) / 2;
                    int var16 = (var13.field921 * 4 - var14.field1411) / 2;
                    var14.method1758(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field921) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field611.method1907(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field611.method1823(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method736(var21);
            if (var22.field935 != -1) {
                class81 var23 = Statics.field1987[var22.field935];
                if (var23 != null) {
                    int var24 = (var22.field920 * 4 - var23.field1408) / 2;
                    int var25 = (var22.field921 * 4 - var23.field1411) / 2;
                    var23.method1758(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field921) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1656.field1395;
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
        int var29 = Statics.field611.method1943(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method736(var30);
        if (var31.field935 == -1) {
            return;
        }
        class81 var32 = Statics.field1987[var31.field935];
        if (var32 != null) {
            int var33 = (var31.field920 * 4 - var32.field1408) / 2;
            int var34 = (var31.field921 * 4 - var32.field1411) / 2;
            var32.method1758(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field921) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("u.bn(I)V")
    public static final void method48() {
        if (field447 == 73) {
            int var0 = field321.method2408();
            int var1 = field321.method2372();
            int var2 = (var1 >> 4 & 0x7) + Statics.field2020;
            int var3 = (var1 & 0x7) + Statics.field199;
            int var4 = field321.method2399();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field339[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 103 && var3 < 103) {
                if (var7 == 0) {
                    class87 var8 = Statics.field611.method1815(Statics.field135, var2, var3);
                    if (var8 != null) {
                        int var9 = var8.field1514 >> 14 & 0x7FFF;
                        if (var5 == 2) {
                            var8.field1512 = new class13(var9, 2, var6 + 4, Statics.field135, var2, var3, var0, false, var8.field1512);
                            var8.field1506 = new class13(var9, 2, var6 + 1 & 0x3, Statics.field135, var2, var3, var0, false, var8.field1506);
                        } else {
                            var8.field1512 = new class13(var9, var5, var6, Statics.field135, var2, var3, var0, false, var8.field1512);
                        }
                    }
                }
                if (var7 == 1) {
                    class94 var10 = Statics.field611.method1816(Statics.field135, var2, var3);
                    if (var10 != null) {
                        int var11 = var10.field1596 >> 14 & 0x7FFF;
                        if (var5 == 4 || var5 == 5) {
                            var10.field1594 = new class13(var11, 4, var6, Statics.field135, var2, var3, var0, false, var10.field1594);
                        } else if (var5 == 6) {
                            var10.field1594 = new class13(var11, 4, var6 + 4, Statics.field135, var2, var3, var0, false, var10.field1594);
                        } else if (var5 == 7) {
                            var10.field1594 = new class13(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field135, var2, var3, var0, false, var10.field1594);
                        } else if (var5 == 8) {
                            var10.field1594 = new class13(var11, 4, var6 + 4, Statics.field135, var2, var3, var0, false, var10.field1594);
                            var10.field1587 = new class13(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field135, var2, var3, var0, false, var10.field1587);
                        }
                    }
                }
                if (var7 == 2) {
                    class98 var12 = Statics.field611.method1817(Statics.field135, var2, var3);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var12 != null) {
                        var12.field1645 = new class13(var12.field1654 >> 14 & 0x7FFF, var5, var6, Statics.field135, var2, var3, var0, false, var12.field1645);
                    }
                }
                if (var7 == 3) {
                    class93 var13 = Statics.field611.method1904(Statics.field135, var2, var3);
                    if (var13 != null) {
                        var13.field1578 = new class13(var13.field1575 >> 14 & 0x7FFF, 22, var6, Statics.field135, var2, var3, var0, false, var13.field1578);
                    }
                }
            }
        } else if (field447 == 213) {
            int var14 = field321.method2372();
            int var15 = (var14 >> 4 & 0x7) + Statics.field2020;
            int var16 = (var14 & 0x7) + Statics.field199;
            int var17 = var15 + field321.method2373();
            int var18 = var16 + field321.method2373();
            int var19 = field321.method2375();
            int var20 = field321.method2374();
            int var21 = field321.method2372() * 4;
            int var22 = field321.method2372() * 4;
            int var23 = field321.method2374();
            int var24 = field321.method2374();
            int var25 = field321.method2372();
            int var26 = field321.method2372();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var20 != 65535) {
                int var27 = var15 * 128 + 64;
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                class7 var31 = new class7(var20, Statics.field135, var27, var28, method745(var27, var28, Statics.field135) - var21, field287 + var23, field287 + var24, var25, var26, var19, var22);
                var31.method112(var29, var30, method745(var29, var30, Statics.field135) - var22, field287 + var23);
                field410.method3603(var31);
            }
        } else if (field447 == 62) {
            int var32 = field321.method2399();
            int var33 = var32 >> 2;
            int var34 = var32 & 0x3;
            int var35 = field339[var33];
            int var36 = field321.method2407();
            int var37 = field321.method2397();
            int var38 = (var37 >> 4 & 0x7) + Statics.field2020;
            int var39 = (var37 & 0x7) + Statics.field199;
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                Statics.method1785(Statics.field135, var38, var39, var35, var36, var33, var34, 0, -1);
            }
        } else {
            if (field447 == 210) {
                int var40 = field321.method2372();
                int var41 = (var40 >> 4 & 0x7) + Statics.field2020;
                int var42 = (var40 & 0x7) + Statics.field199;
                int var43 = field321.method2374();
                int var44 = field321.method2372();
                int var45 = var44 >> 4 & 0xF;
                int var46 = var44 & 0x7;
                int var47 = field321.method2372();
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    int var48 = var45 + 1;
                    if (Statics.field13.field810[0] >= var41 - var48 && Statics.field13.field810[0] <= var41 + var48 && Statics.field13.field817[0] >= var42 - var48 && Statics.field13.field817[0] <= var42 + var48 && field516 != 0 && var46 > 0 && field517 < 50) {
                        field463[field517] = var43;
                        field519[field517] = var46;
                        field520[field517] = var47;
                        field522[field517] = null;
                        field468[field517] = (var41 << 16) + (var42 << 8) + var45;
                        field517++;
                    }
                }
            }
            if (field447 == 238) {
                int var49 = field321.method2374();
                int var50 = field321.method2399();
                int var51 = (var50 >> 4 & 0x7) + Statics.field2020;
                int var52 = (var50 & 0x7) + Statics.field199;
                if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                    class199 var53 = field408[Statics.field135][var51][var52];
                    if (var53 != null) {
                        for (class29 var54 = (class29) var53.method3606(); var54 != null; var54 = (class29) var53.method3608()) {
                            if ((var49 & 0x7FFF) == var54.field661) {
                                var54.method3700();
                                break;
                            }
                        }
                        if (var53.method3606() == null) {
                            field408[Statics.field135][var51][var52] = null;
                        }
                        method3245(var51, var52);
                    }
                }
            } else if (field447 == 143) {
                int var55 = field321.method2372();
                int var56 = (var55 >> 4 & 0x7) + Statics.field2020;
                int var57 = (var55 & 0x7) + Statics.field199;
                int var58 = field321.method2374();
                int var59 = field321.method2374();
                int var60 = field321.method2374();
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                    class199 var61 = field408[Statics.field135][var56][var57];
                    if (var61 != null) {
                        for (class29 var62 = (class29) var61.method3606(); var62 != null; var62 = (class29) var61.method3608()) {
                            if ((var58 & 0x7FFF) == var62.field661 && var62.field659 == var59) {
                                var62.field659 = var60;
                                break;
                            }
                        }
                        method3245(var56, var57);
                    }
                }
            } else if (field447 == 116) {
                int var63 = field321.method2406();
                int var64 = field321.method2395();
                int var65 = (var64 >> 4 & 0x7) + Statics.field2020;
                int var66 = (var64 & 0x7) + Statics.field199;
                int var67 = field321.method2406();
                if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                    class29 var68 = new class29();
                    var68.field661 = var67;
                    var68.field659 = var63;
                    if (field408[Statics.field135][var65][var66] == null) {
                        field408[Statics.field135][var65][var66] = new class199();
                    }
                    field408[Statics.field135][var65][var66].method3603(var68);
                    method3245(var65, var66);
                }
            } else {
                if (field447 == 34) {
                    int var69 = field321.method2374();
                    int var70 = field321.method2395();
                    int var71 = (var70 >> 4 & 0x7) + Statics.field2020;
                    int var72 = (var70 & 0x7) + Statics.field199;
                    int var73 = field321.method2408();
                    byte var74 = field321.method2400();
                    int var75 = field321.method2407();
                    byte var76 = field321.method2573();
                    int var77 = field321.method2407();
                    int var78 = field321.method2399();
                    int var79 = var78 >> 2;
                    int var80 = var78 & 0x3;
                    int var81 = field339[var79];
                    byte var82 = field321.method2573();
                    byte var83 = field321.method2402();
                    class3 var84;
                    if (field524 == var69) {
                        var84 = Statics.field13;
                    } else {
                        var84 = field398[var69];
                    }
                    if (var84 != null) {
                        class41 var85 = class41.method736(var75);
                        int var86;
                        int var87;
                        if (var80 == 1 || var80 == 3) {
                            var86 = var85.field921;
                            var87 = var85.field920;
                        } else {
                            var86 = var85.field920;
                            var87 = var85.field921;
                        }
                        int var88 = (var86 >> 1) + var71;
                        int var89 = (var86 + 1 >> 1) + var71;
                        int var90 = (var87 >> 1) + var72;
                        int var91 = (var87 + 1 >> 1) + var72;
                        int[][] var92 = class6.field80[Statics.field135];
                        int var93 = var92[var88][var90] + var92[var89][var90] + var92[var88][var91] + var92[var89][var91] >> 2;
                        int var94 = (var71 << 7) + (var86 << 6);
                        int var95 = (var72 << 7) + (var87 << 6);
                        class105 var96 = var85.method817(var79, var80, var92, var94, var93, var95);
                        if (var96 != null) {
                            Statics.method1785(Statics.field135, var71, var72, var81, -1, 0, 0, var77 + 1, var73 + 1);
                            var84.field40 = field287 + var77;
                            var84.field41 = field287 + var73;
                            var84.field45 = var96;
                            var84.field42 = var71 * 128 + var86 * 64;
                            var84.field44 = var72 * 128 + var87 * 64;
                            var84.field43 = var93;
                            if (var82 > var74) {
                                byte var97 = var82;
                                var82 = var74;
                                var74 = var97;
                            }
                            if (var76 > var83) {
                                byte var98 = var76;
                                var76 = var83;
                                var83 = var98;
                            }
                            var84.field46 = var71 + var82;
                            var84.field48 = var71 + var74;
                            var84.field53 = var72 + var76;
                            var84.field49 = var72 + var83;
                        }
                    }
                }
                if (field447 == 236) {
                    int var99 = field321.method2372();
                    int var100 = (var99 >> 4 & 0x7) + Statics.field2020;
                    int var101 = (var99 & 0x7) + Statics.field199;
                    int var102 = field321.method2374();
                    int var103 = field321.method2372();
                    int var104 = field321.method2374();
                    if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                        int var105 = var100 * 128 + 64;
                        int var106 = var101 * 128 + 64;
                        class30 var107 = new class30(var102, Statics.field135, var105, var106, method745(var105, var106, Statics.field135) - var103, var104, field287);
                        field492.method3603(var107);
                    }
                } else if (field447 == 226) {
                    int var108 = field321.method2399();
                    int var109 = (var108 >> 4 & 0x7) + Statics.field2020;
                    int var110 = (var108 & 0x7) + Statics.field199;
                    int var111 = field321.method2372();
                    int var112 = var111 >> 2;
                    int var113 = var111 & 0x3;
                    int var114 = field339[var112];
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                        Statics.method1785(Statics.field135, var109, var110, var114, -1, var112, var113, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.bm(Lg;I)V")
    public static final void method603(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field224 == 0) {
            var1 = Statics.field611.method1819(arg0.field227, arg0.field225, arg0.field226);
        }
        if (arg0.field224 == 1) {
            var1 = Statics.field611.method1820(arg0.field227, arg0.field225, arg0.field226);
        }
        if (arg0.field224 == 2) {
            var1 = Statics.field611.method1907(arg0.field227, arg0.field225, arg0.field226);
        }
        if (arg0.field224 == 3) {
            var1 = Statics.field611.method1943(arg0.field227, arg0.field225, arg0.field226);
        }
        if (var1 != 0) {
            int var5 = Statics.field611.method1823(arg0.field227, arg0.field225, arg0.field226, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field233 = var2;
        arg0.field229 = var3;
        arg0.field228 = var4;
    }

    @ObfuscatedName("g.bc(IIIIIIII)V")
    public static final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field528 && Statics.field135 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field611.method1819(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field611.method1820(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field611.method1907(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field611.method1943(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field611.method1823(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field611.method1810(arg0, arg2, arg3);
                class41 var15 = class41.method736(var12);
                if (var15.field922 != 0) {
                    field336[arg0].method2266(arg2, arg3, var13, var14, var15.field923);
                }
            }
            if (arg1 == 1) {
                Statics.field611.method1925(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field611.method1792(arg0, arg2, arg3);
                class41 var16 = class41.method736(var12);
                if (var16.field920 + arg2 > 103 || var16.field920 + arg3 > 103 || var16.field921 + arg2 > 103 || var16.field921 + arg3 > 103) {
                    return;
                }
                if (var16.field922 != 0) {
                    field336[arg0].method2282(arg2, arg3, var16.field920, var16.field921, var14, var16.field923);
                }
            }
            if (arg1 == 3) {
                Statics.field611.method1813(arg0, arg2, arg3);
                class41 var17 = class41.method736(var12);
                if (var17.field922 == 1) {
                    field336[arg0].method2268(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field87[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field611;
        class108 var20 = field336[arg0];
        class41 var21 = class41.method736(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field921;
            var23 = var21.field920;
        } else {
            var22 = var21.field920;
            var23 = var21.field921;
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
        if (var21.field938 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field945 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field926 == -1 && var21.field946 == null) {
                var34 = var21.method817(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1799(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field922 == 1) {
                var20.method2283(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field926 == -1 && var21.field946 == null) {
                var57 = var21.method817(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1803(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field922 != 0) {
                var20.method2262(arg2, arg3, var22, var23, var21.field923);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field926 == -1 && var21.field946 == null) {
                var35 = var21.method817(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1803(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field922 != 0) {
                var20.method2262(arg2, arg3, var22, var23, var21.field923);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field926 == -1 && var21.field946 == null) {
                var36 = var21.method817(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1840(arg0, arg2, arg3, var29, var36, (class85) null, class6.field83[arg5], 0, var32, var33);
            if (var21.field922 != 0) {
                var20.method2286(arg2, arg3, arg6, arg5, var21.field923);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field926 == -1 && var21.field946 == null) {
                var37 = var21.method817(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1840(arg0, arg2, arg3, var29, var37, (class85) null, class6.field84[arg5], 0, var32, var33);
            if (var21.field922 != 0) {
                var20.method2286(arg2, arg3, arg6, arg5, var21.field923);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field926 == -1 && var21.field946 == null) {
                var39 = var21.method817(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method817(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field926, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1840(arg0, arg2, arg3, var29, var39, var40, class6.field83[arg5], class6.field83[var38], var32, var33);
            if (var21.field922 != 0) {
                var20.method2286(arg2, arg3, arg6, arg5, var21.field923);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field926 == -1 && var21.field946 == null) {
                var41 = var21.method817(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1840(arg0, arg2, arg3, var29, var41, (class85) null, class6.field84[arg5], 0, var32, var33);
            if (var21.field922 != 0) {
                var20.method2286(arg2, arg3, arg6, arg5, var21.field923);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field926 == -1 && var21.field946 == null) {
                var42 = var21.method817(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1803(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field922 != 0) {
                var20.method2262(arg2, arg3, var22, var23, var21.field923);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field926 == -1 && var21.field946 == null) {
                var43 = var21.method817(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1942(arg0, arg2, arg3, var29, var43, (class85) null, class6.field83[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1819(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method736(var45 >> 14 & 0x7FFF).field929;
            }
            class85 var46;
            if (var21.field926 == -1 && var21.field946 == null) {
                var46 = var21.method817(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1942(arg0, arg2, arg3, var29, var46, (class85) null, class6.field83[arg5], 0, class6.field79[arg5] * var44, class6.field88[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1819(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method736(var48 >> 14 & 0x7FFF).field929 / 2;
            }
            class85 var49;
            if (var21.field926 == -1 && var21.field946 == null) {
                var49 = var21.method817(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1942(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field73[arg5] * var47, class6.field85[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field926 == -1 && var21.field946 == null) {
                var51 = var21.method817(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1942(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1819(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method736(var53 >> 14 & 0x7FFF).field929 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field926 == -1 && var21.field946 == null) {
                var55 = var21.method817(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method817(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field926, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field926, true, (class85) null);
            }
            var19.method1942(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field73[arg5] * var52, class6.field85[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("fv.bu(III)V")
    public static final void method3245(int arg0, int arg1) {
        class199 var2 = field408[Statics.field135][arg0][arg1];
        if (var2 == null) {
            Statics.field611.method1814(Statics.field135, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3606(); var6 != null; var6 = (class29) var2.method3608()) {
            class52 var7 = class52.method154(var6.field661);
            long var8 = (long) var7.field1112;
            if (var7.field1111 == 1) {
                var8 = (long) (var6.field659 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field611.method1814(Statics.field135, arg0, arg1);
            return;
        }
        var2.method3602(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3606(); var12 != null; var12 = (class29) var2.method3608()) {
            if (var5.field661 != var12.field661) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field661 != var12.field661 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field611.method1800(Statics.field135, arg0, arg1, method745(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field135), var5, var13, var10, var11);
    }

    @ObfuscatedName("br.ba(ZI)V")
    public static final void method1488(boolean arg0) {
        field414 = 0;
        field445 = 0;
        method2695();
        method2687(arg0);
        method3223();
        for (int var1 = 0; var1 < field414; var1++) {
            int var2 = field402[var1];
            if (field287 != field314[var2].field800) {
                field314[var2].field762 = null;
                field314[var2] = null;
            }
        }
        if (field290 != field321.field1982) {
            throw new RuntimeException(field321.field1982 + class2.field19 + field290);
        }
        for (int var3 = 0; var3 < field315; var3++) {
            if (field314[field316[var3]] == null) {
                throw new RuntimeException(var3 + class2.field19 + field315);
            }
        }
    }

    @ObfuscatedName("dj.bi(I)V")
    public static final void method2695() {
        field321.method2623();
        int var0 = field321.method2622(8);
        if (var0 < field315) {
            for (int var1 = var0; var1 < field315; var1++) {
                field402[++field414 - 1] = field316[var1];
            }
        }
        if (var0 > field315) {
            throw new RuntimeException("");
        }
        field315 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field316[var2];
            class35 var4 = field314[var3];
            int var5 = field321.method2622(1);
            if (var5 == 0) {
                field316[++field315 - 1] = var3;
                var4.field800 = field287;
            } else {
                int var6 = field321.method2622(2);
                if (var6 == 0) {
                    field316[++field315 - 1] = var3;
                    var4.field800 = field287;
                    field318[++field445 - 1] = var3;
                } else if (var6 == 1) {
                    field316[++field315 - 1] = var3;
                    var4.field800 = field287;
                    int var7 = field321.method2622(3);
                    var4.method739(var7, (byte) 1);
                    int var8 = field321.method2622(1);
                    if (var8 == 1) {
                        field318[++field445 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field316[++field315 - 1] = var3;
                    var4.field800 = field287;
                    int var9 = field321.method2622(3);
                    var4.method739(var9, (byte) 2);
                    int var10 = field321.method2622(3);
                    var4.method739(var10, (byte) 2);
                    int var11 = field321.method2622(1);
                    if (var11 == 1) {
                        field318[++field445 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field402[++field414 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("di.bq(ZI)V")
    public static final void method2687(boolean arg0) {
        while (true) {
            if (field321.method2624(field290) >= 27) {
                int var1 = field321.method2622(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field314[var1] == null) {
                        field314[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field314[var1];
                    field316[++field315 - 1] = var1;
                    var3.field800 = field287;
                    int var4 = field321.method2622(1);
                    int var5 = field321.method2622(1);
                    if (var5 == 1) {
                        field318[++field445 - 1] = var1;
                    }
                    int var6;
                    if (arg0) {
                        var6 = field321.method2622(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field321.method2622(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field406[field321.method2622(3)];
                    if (var2) {
                        var3.field849 = var3.field801 = var7;
                    }
                    var3.field762 = class40.method609(field321.method2622(14));
                    int var8;
                    if (arg0) {
                        var8 = field321.method2622(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field321.method2622(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field803 = var3.field762.field872;
                    var3.field851 = var3.field762.field895;
                    if (var3.field851 == 0) {
                        var3.field801 = 0;
                    }
                    var3.field807 = var3.field762.field878;
                    var3.field808 = var3.field762.field905;
                    var3.field823 = var3.field762.field897;
                    var3.field819 = var3.field762.field881;
                    var3.field804 = var3.field762.field873;
                    var3.field805 = var3.field762.field867;
                    var3.field850 = var3.field762.field868;
                    var3.method738(Statics.field13.field810[0] + var8, Statics.field13.field817[0] + var6, var4 == 1);
                    continue;
                }
            }
            field321.method2636();
            return;
        }
    }

    @ObfuscatedName("fl.bk(B)V")
    public static final void method3223() {
        for (int var0 = 0; var0 < field445; var0++) {
            int var1 = field318[var0];
            class35 var2 = field314[var1];
            int var3 = field321.method2372();
            if ((var3 & 0x2) != 0) {
                var2.field762 = class40.method609(field321.method2408());
                var2.field803 = var2.field762.field872;
                var2.field851 = var2.field762.field895;
                var2.field807 = var2.field762.field878;
                var2.field808 = var2.field762.field905;
                var2.field823 = var2.field762.field897;
                var2.field819 = var2.field762.field881;
                var2.field804 = var2.field762.field873;
                var2.field805 = var2.field762.field867;
                var2.field850 = var2.field762.field868;
            }
            if ((var3 & 0x8) != 0) {
                var2.field806 = field321.method2408();
                int var4 = field321.method2377();
                var2.field839 = var4 >> 16;
                var2.field838 = (var4 & 0xFFFF) + field287;
                var2.field836 = 0;
                var2.field809 = 0;
                if (var2.field838 > field287) {
                    var2.field836 = -1;
                }
                if (var2.field806 == 65535) {
                    var2.field806 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field853 = field321.method2380();
                var2.field815 = 100;
            }
            if ((var3 & 0x20) != 0) {
                int var5 = field321.method2408();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field321.method2372();
                if (var2.field830 == var5 && var5 != -1) {
                    int var7 = class43.method575(var5).field970;
                    if (var7 == 1) {
                        var2.field831 = 0;
                        var2.field842 = 0;
                        var2.field833 = var6;
                        var2.field855 = 0;
                    }
                    if (var7 == 2) {
                        var2.field855 = 0;
                    }
                } else if (var5 == -1 || var2.field830 == -1 || class43.method575(var5).field971 >= class43.method575(var2.field830).field971) {
                    var2.field830 = var5;
                    var2.field831 = 0;
                    var2.field842 = 0;
                    var2.field833 = var6;
                    var2.field855 = 0;
                    var2.field857 = var2.field852;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field824 = field321.method2406();
                if (var2.field824 == 65535) {
                    var2.field824 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var8 = field321.method2395();
                int var9 = field321.method2395();
                var2.method761(var8, var9, field287);
                var2.field821 = field287 + 300;
                var2.field834 = field321.method2408();
                var2.field854 = field321.method2374();
            }
            if ((var3 & 0x1) != 0) {
                int var10 = field321.method2407();
                int var11 = field321.method2407();
                int var12 = var2.field847 - (var10 - Statics.field1054 - Statics.field1054) * 64;
                int var13 = var2.field835 - (var11 - Statics.field2630 - Statics.field2630) * 64;
                if (var12 != 0 || var13 != 0) {
                    var2.field826 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var14 = field321.method2395();
                int var15 = field321.method2372();
                var2.method761(var14, var15, field287);
                var2.field821 = field287 + 300;
                var2.field834 = field321.method2374();
                var2.field854 = field321.method2407();
            }
        }
    }

    @ObfuscatedName("ed.be(Lf;IIBB)V")
    public static final void method2972(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field810[0];
        int var5 = arg0.field817[0];
        int var6 = arg0.method16();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method16();
        field554.field1861 = arg1;
        field554.field1859 = arg2;
        field554.field1860 = 1;
        field554.field1866 = 1;
        class11 var8 = field554;
        class11 var9 = var8;
        class108 var10 = field336[arg0.field57];
        int[] var11 = field431;
        int[] var12 = field556;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class106.field1843[var13][var14] = 0;
                class106.field1844[var13][var14] = 99999999;
            }
        }
        boolean var15;
        if (var7 == 1) {
            var15 = class106.method586(var4, var5, var8, var10);
        } else if (var7 == 2) {
            var15 = class106.method1590(var4, var5, var8, var10);
        } else {
            int var16 = var4;
            int var17 = var5;
            byte var18 = 64;
            byte var19 = 64;
            int var20 = var4 - var18;
            int var21 = var5 - var19;
            class106.field1843[var18][var19] = 99;
            class106.field1844[var18][var19] = 0;
            byte var22 = 0;
            int var23 = 0;
            class106.field1846[var22] = var4;
            int var64 = var22 + 1;
            class106.field1849[var22] = var5;
            int[][] var24 = var10.field1880;
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
                                        Statics.field1845 = var16;
                                        Statics.field1852 = var17;
                                        var29 = false;
                                        break label421;
                                    }
                                    var16 = class106.field1846[var23];
                                    var17 = class106.field1849[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    var25 = var16 - var20;
                                    var26 = var17 - var21;
                                    var27 = var16 - var10.field1882;
                                    var28 = var17 - var10.field1884;
                                    if (var9.method150(var7, var16, var17, var10)) {
                                        Statics.field1845 = var16;
                                        Statics.field1852 = var17;
                                        var29 = true;
                                        break label421;
                                    }
                                    var30 = class106.field1844[var25][var26] + 1;
                                    if (var25 > 0 && class106.field1843[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x124010E) == 0 && (var24[var27 - 1][var7 + var28 - 1] & 0x1240138) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (var31 >= var7 - 1) {
                                                class106.field1846[var64] = var16 - 1;
                                                class106.field1849[var64] = var17;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1843[var25 - 1][var26] = 2;
                                                class106.field1844[var25 - 1][var26] = var30;
                                                break;
                                            }
                                            if ((var24[var27 - 1][var28 + var31] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var31++;
                                        }
                                    }
                                    if (var25 < 128 - var7 && class106.field1843[var25 + 1][var26] == 0 && (var24[var7 + var27][var28] & 0x1240183) == 0 && (var24[var7 + var27][var7 + var28 - 1] & 0x12401E0) == 0) {
                                        int var32 = 1;
                                        while (true) {
                                            if (var32 >= var7 - 1) {
                                                class106.field1846[var64] = var16 + 1;
                                                class106.field1849[var64] = var17;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1843[var25 + 1][var26] = 8;
                                                class106.field1844[var25 + 1][var26] = var30;
                                                break;
                                            }
                                            if ((var24[var7 + var27][var28 + var32] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var32++;
                                        }
                                    }
                                    if (var26 > 0 && class106.field1843[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x124010E) == 0 && (var24[var7 + var27 - 1][var28 - 1] & 0x1240183) == 0) {
                                        int var33 = 1;
                                        while (true) {
                                            if (var33 >= var7 - 1) {
                                                class106.field1846[var64] = var16;
                                                class106.field1849[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1843[var25][var26 - 1] = 1;
                                                class106.field1844[var25][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 + var33][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var33++;
                                        }
                                    }
                                    if (var26 < 128 - var7 && class106.field1843[var25][var26 + 1] == 0 && (var24[var27][var7 + var28] & 0x1240138) == 0 && (var24[var7 + var27 - 1][var7 + var28] & 0x12401E0) == 0) {
                                        int var34 = 1;
                                        while (true) {
                                            if (var34 >= var7 - 1) {
                                                class106.field1846[var64] = var16;
                                                class106.field1849[var64] = var17 + 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1843[var25][var26 + 1] = 4;
                                                class106.field1844[var25][var26 + 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 + var34][var7 + var28] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var34++;
                                        }
                                    }
                                    if (var25 > 0 && var26 > 0 && class106.field1843[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0) {
                                        int var35 = 1;
                                        while (true) {
                                            if (var35 >= var7) {
                                                class106.field1846[var64] = var16 - 1;
                                                class106.field1849[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1843[var25 - 1][var26 - 1] = 3;
                                                class106.field1844[var25 - 1][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 - 1][var28 - 1 + var35] & 0x124013E) != 0 || (var24[var27 - 1 + var35][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var35++;
                                        }
                                    }
                                    if (var25 < 128 - var7 && var26 > 0 && class106.field1843[var25 + 1][var26 - 1] == 0 && (var24[var7 + var27][var28 - 1] & 0x1240183) == 0) {
                                        int var36 = 1;
                                        while (true) {
                                            if (var36 >= var7) {
                                                class106.field1846[var64] = var16 + 1;
                                                class106.field1849[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1843[var25 + 1][var26 - 1] = 9;
                                                class106.field1844[var25 + 1][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var7 + var27][var28 - 1 + var36] & 0x12401E3) != 0 || (var24[var27 + var36][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var36++;
                                        }
                                    }
                                    if (var25 > 0 && var26 < 128 - var7 && class106.field1843[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var7 + var28] & 0x1240138) == 0) {
                                        for (int var37 = 1; var37 < var7; var37++) {
                                            if ((var24[var27 - 1][var28 + var37] & 0x124013E) != 0 || (var24[var27 - 1 + var37][var7 + var28] & 0x12401F8) != 0) {
                                                continue label396;
                                            }
                                        }
                                        class106.field1846[var64] = var16 - 1;
                                        class106.field1849[var64] = var17 + 1;
                                        var64 = var64 + 1 & 0xFFF;
                                        class106.field1843[var25 - 1][var26 + 1] = 6;
                                        class106.field1844[var25 - 1][var26 + 1] = var30;
                                    }
                                } while (var25 >= 128 - var7);
                            } while (var26 >= 128 - var7);
                        } while (class106.field1843[var25 + 1][var26 + 1] != 0);
                    } while ((var24[var7 + var27][var7 + var28] & 0x12401E0) != 0);
                    for (int var38 = 1; var38 < var7; var38++) {
                        if ((var24[var27 + var38][var7 + var28] & 0x12401F8) != 0 || (var24[var7 + var27][var28 + var38] & 0x12401E3) != 0) {
                            continue label419;
                        }
                    }
                    class106.field1846[var64] = var16 + 1;
                    class106.field1849[var64] = var17 + 1;
                    var64 = var64 + 1 & 0xFFF;
                    class106.field1843[var25 + 1][var26 + 1] = 12;
                    class106.field1844[var25 + 1][var26 + 1] = var30;
                }
            }
            var15 = var29;
        }
        int var57;
        label467: {
            int var39 = var4 - 64;
            int var40 = var5 - 64;
            int var41 = Statics.field1845;
            int var42 = Statics.field1852;
            if (!var15) {
                int var43 = Integer.MAX_VALUE;
                int var44 = Integer.MAX_VALUE;
                byte var45 = 10;
                int var46 = var9.field1861;
                int var47 = var9.field1859;
                int var48 = var9.field1860;
                int var49 = var9.field1866;
                for (int var50 = var46 - var45; var50 <= var45 + var46; var50++) {
                    for (int var51 = var47 - var45; var51 <= var45 + var47; var51++) {
                        int var52 = var50 - var39;
                        int var53 = var51 - var40;
                        if (var52 >= 0 && var53 >= 0 && var52 < 128 && var53 < 128 && class106.field1844[var52][var53] < 100) {
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
                            if (var56 < var43 || var43 == var56 && class106.field1844[var52][var53] < var44) {
                                var43 = var56;
                                var44 = class106.field1844[var52][var53];
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
                class106.field1846[var58] = var41;
                int var65 = var58 + 1;
                class106.field1849[var58] = var42;
                int var59;
                int var60 = var59 = class106.field1843[var41 - var39][var42 - var40];
                while (var4 != var41 || var5 != var42) {
                    if (var59 != var60) {
                        var59 = var60;
                        class106.field1846[var65] = var41;
                        class106.field1849[var65++] = var42;
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
                    var60 = class106.field1843[var41 - var39][var42 - var40];
                }
                int var61 = 0;
                while (var65-- > 0) {
                    var11[var61] = class106.field1846[var65];
                    var12[var61++] = class106.field1849[var65];
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
                arg0.method19(field431[var63], field556[var63], arg3);
            }
        }
    }

    @ObfuscatedName("gb.bl(IIIII)V")
    public static final void method3529(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field478; var4++) {
            if (field485[var4] + field483[var4] > arg0 && field483[var4] < arg0 + arg2 && field527[var4] + field484[var4] > arg1 && field484[var4] < arg1 + arg3) {
                field371[var4] = true;
            }
        }
    }

    @ObfuscatedName("ef.bg(IIB)V")
    public static final void method2977(int arg0, int arg1) {
        int var2 = Statics.field2175.method3896(class157.field2297);
        for (int var3 = 0; var3 < field417; var3++) {
            class224 var4 = Statics.field2175;
            String var5;
            if (field423[var3].length() > 0) {
                var5 = field298[var3] + class157.field2517 + field423[var3];
            } else {
                var5 = field298[var3];
            }
            int var6 = var4.method3896(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field417 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field2049) {
            var8 = Statics.field2049 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2102) {
            var9 = Statics.field2102 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field501 = true;
        Statics.field254 = var8;
        Statics.field794 = var9;
        Statics.field10 = var2;
        Statics.field268 = field417 * 15 + 22;
    }

    @ObfuscatedName("r.bt(II)V")
    public static final void method198(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field418[arg0];
        int var2 = field419[arg0];
        int var3 = field420[arg0];
        int var4 = field416[arg0];
        String var5 = field298[arg0];
        String var6 = field423[arg0];
        method2789(var1, var2, var3, var4, var5, var6, class140.field2131, class140.field2143);
    }

    @ObfuscatedName("ci.bp(Lai;III)V")
    public static final void method2171(class31 arg0, int arg1, int arg2) {
        method2789(arg0.field689, arg0.field681, arg0.field682, arg0.field687, arg0.field684, arg0.field684, arg1, arg2);
    }

    @ObfuscatedName("ei.bh(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2789(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 16) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(84);
            field319.method2414(Statics.field1661);
            field319.method2566(Statics.field2630 + arg1);
            field319.method2566(arg3);
            field319.method2357(class137.field2115[82] ? 1 : 0);
            field319.method2566(Statics.field1358);
            field319.method2403(Statics.field1054 + arg0);
            field319.method2358(Statics.field3156);
        }
        if (arg2 == 49) {
            class3 var8 = field398[arg3];
            if (var8 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(62);
                field319.method2358(arg3);
                field319.method2357(class137.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class173 var9 = class173.method3744(arg1, arg0);
            if (var9 != null) {
                field319.method2621(36);
                field319.method2358(arg0);
                field319.method2360(arg1);
                field319.method2358(field380);
                field319.method2403(var9.field2853);
                field319.method2358(field356);
                field319.method2465(Statics.field1387);
            }
        }
        if (arg2 == 36) {
            field319.method2621(247);
            field319.method2465(arg1);
            field319.method2403(arg3);
            field319.method2383(arg0);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 11) {
            class35 var10 = field314[arg3];
            if (var10 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(51);
                field319.method2566(arg3);
                field319.method2394(class137.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field319.method2621(90);
            field319.method2360(arg1);
            class173 var11 = class173.method1002(arg1);
            if (var11.field2845 != null && var11.field2845[0][0] == 5) {
                int var12 = var11.field2845[0][1];
                if (class176.field2885[var12] != var11.field2759[0]) {
                    class176.field2885[var12] = var11.field2759[0];
                    method2724(var12);
                }
            }
        }
        if (arg2 == 32) {
            field319.method2621(245);
            field319.method2465(arg1);
            field319.method2413(Statics.field1387);
            field319.method2403(arg0);
            field319.method2383(arg3);
            field319.method2566(field356);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 41) {
            field319.method2621(82);
            field319.method2566(arg3);
            field319.method2403(arg0);
            field319.method2414(arg1);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 12) {
            class35 var13 = field314[arg3];
            if (var13 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(83);
                field319.method2468(class137.field2115[82] ? 1 : 0);
                field319.method2566(arg3);
            }
        }
        if (arg2 == 13) {
            class35 var14 = field314[arg3];
            if (var14 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(233);
                field319.method2394(class137.field2115[82] ? 1 : 0);
                field319.method2358(arg3);
            }
        }
        if (arg2 == 8) {
            class35 var15 = field314[arg3];
            if (var15 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(108);
                field319.method2465(Statics.field1387);
                field319.method2358(field356);
                field319.method2394(class137.field2115[82] ? 1 : 0);
                field319.method2566(arg3);
            }
        }
        if (arg2 == 20) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(206);
            field319.method2383(Statics.field1054 + arg0);
            field319.method2358(Statics.field2630 + arg1);
            field319.method2468(class137.field2115[82] ? 1 : 0);
            field319.method2566(arg3);
        }
        if (arg2 == 1004) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field319.method2621(104);
            field319.method2403(arg3);
        }
        if (arg2 == 21) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(253);
            field319.method2566(Statics.field2630 + arg1);
            field319.method2403(arg3);
            field319.method2468(class137.field2115[82] ? 1 : 0);
            field319.method2566(Statics.field1054 + arg0);
        }
        if (arg2 == 30 && field546 == null) {
            method2059(arg1, arg0);
            field546 = class173.method3744(arg1, arg0);
            method908(field546);
        }
        if (arg2 == 9) {
            class35 var16 = field314[arg3];
            if (var16 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(95);
                field319.method2566(arg3);
                field319.method2468(class137.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            method587();
        }
        if (arg2 == 1002) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field319.method2621(157);
            field319.method2566(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var17 = class173.method3744(arg1, arg0);
            if (var17 != null) {
                int var18 = var17.field2853;
                class173 var19 = class173.method3744(arg1, arg0);
                if (var19 != null) {
                    if (var19.field2767 != null) {
                        class1 var20 = new class1();
                        var20.field3 = var19;
                        var20.field17 = arg3;
                        var20.field7 = arg5;
                        var20.field11 = var19.field2767;
                        class37.method3221(var20);
                    }
                    boolean var21 = true;
                    if (var19.field2739 > 0) {
                        var21 = method2962(var19);
                    }
                    if (var21) {
                        int var22 = method122(var19);
                        int var23 = arg3 - 1;
                        boolean var24 = (var22 >> var23 + 1 & 0x1) != 0;
                        if (var24) {
                            if (arg3 == 1) {
                                field319.method2621(65);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                            if (arg3 == 2) {
                                field319.method2621(238);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                            if (arg3 == 3) {
                                field319.method2621(222);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                            if (arg3 == 4) {
                                field319.method2621(165);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                            if (arg3 == 5) {
                                field319.method2621(185);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                            if (arg3 == 6) {
                                field319.method2621(224);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                            if (arg3 == 7) {
                                field319.method2621(252);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                            if (arg3 == 8) {
                                field319.method2621(159);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                            if (arg3 == 9) {
                                field319.method2621(47);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                            if (arg3 == 10) {
                                field319.method2621(111);
                                field319.method2360(arg1);
                                field319.method2358(arg0);
                                field319.method2358(var18);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 38) {
            method628();
            class173 var25 = class173.method1002(arg1);
            field399 = 1;
            Statics.field3156 = arg0;
            Statics.field1661 = arg1;
            Statics.field1358 = arg3;
            method908(var25);
            field429 = class2.method1505(16748608) + class52.method154(arg3).field1100 + class2.method1505(16777215);
            if (field429 == null) {
                field429 = "null";
            }
            return;
        }
        if (arg2 == 48) {
            class3 var26 = field398[arg3];
            if (var26 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(109);
                field319.method2503(class137.field2115[82] ? 1 : 0);
                field319.method2403(arg3);
            }
        }
        if (arg2 == 46) {
            class3 var27 = field398[arg3];
            if (var27 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(85);
                field319.method2394(class137.field2115[82] ? 1 : 0);
                field319.method2383(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var28 = field398[arg3];
            if (var28 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(55);
                field319.method2394(class137.field2115[82] ? 1 : 0);
                field319.method2403(arg3);
            }
        }
        if (arg2 == 5) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(188);
            field319.method2403(arg3 >> 14 & 0x7FFF);
            field319.method2403(Statics.field1054 + arg0);
            field319.method2468(class137.field2115[82] ? 1 : 0);
            field319.method2383(Statics.field2630 + arg1);
        }
        if (arg2 == 3) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(219);
            field319.method2403(Statics.field2630 + arg1);
            field319.method2566(Statics.field1054 + arg0);
            field319.method2394(class137.field2115[82] ? 1 : 0);
            field319.method2358(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 34) {
            field319.method2621(53);
            field319.method2566(arg0);
            field319.method2465(arg1);
            field319.method2383(arg3);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 19) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(105);
            field319.method2383(arg3);
            field319.method2358(Statics.field1054 + arg0);
            field319.method2403(Statics.field2630 + arg1);
            field319.method2394(class137.field2115[82] ? 1 : 0);
        }
        if (arg2 == 37) {
            field319.method2621(7);
            field319.method2383(arg3);
            field319.method2566(arg0);
            field319.method2360(arg1);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 18) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(195);
            field319.method2503(class137.field2115[82] ? 1 : 0);
            field319.method2358(Statics.field2630 + arg1);
            field319.method2383(Statics.field1054 + arg0);
            field319.method2383(arg3);
        }
        if (arg2 == 15) {
            class3 var29 = field398[arg3];
            if (var29 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(243);
                field319.method2358(field356);
                field319.method2358(arg3);
                field319.method2357(class137.field2115[82] ? 1 : 0);
                field319.method2414(Statics.field1387);
            }
        }
        if (arg2 == 22) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(194);
            field319.method2358(Statics.field1054 + arg0);
            field319.method2358(arg3);
            field319.method2403(Statics.field2630 + arg1);
            field319.method2468(class137.field2115[82] ? 1 : 0);
        }
        if (arg2 == 42) {
            field319.method2621(173);
            field319.method2403(arg3);
            field319.method2383(arg0);
            field319.method2414(arg1);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 47) {
            class3 var30 = field398[arg3];
            if (var30 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(67);
                field319.method2468(class137.field2115[82] ? 1 : 0);
                field319.method2403(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var31 = field398[arg3];
            if (var31 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(220);
                field319.method2383(Statics.field3156);
                field319.method2360(Statics.field1661);
                field319.method2566(arg3);
                field319.method2394(class137.field2115[82] ? 1 : 0);
                field319.method2403(Statics.field1358);
            }
        }
        if (arg2 == 10) {
            class35 var32 = field314[arg3];
            if (var32 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(200);
                field319.method2503(class137.field2115[82] ? 1 : 0);
                field319.method2383(arg3);
            }
        }
        if (arg2 == 39) {
            field319.method2621(56);
            field319.method2566(arg3);
            field319.method2358(arg0);
            field319.method2465(arg1);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 51) {
            class3 var33 = field398[arg3];
            if (var33 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(73);
                field319.method2357(class137.field2115[82] ? 1 : 0);
                field319.method2566(arg3);
            }
        }
        if (arg2 == 6) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(41);
            field319.method2357(class137.field2115[82] ? 1 : 0);
            field319.method2358(arg3 >> 14 & 0x7FFF);
            field319.method2383(Statics.field1054 + arg0);
            field319.method2566(Statics.field2630 + arg1);
        }
        if (arg2 == 1) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(204);
            field319.method2358(arg3 >> 14 & 0x7FFF);
            field319.method2383(Statics.field2630 + arg1);
            field319.method2358(Statics.field1054 + arg0);
            field319.method2358(Statics.field1358);
            field319.method2566(Statics.field3156);
            field319.method2468(class137.field2115[82] ? 1 : 0);
            field319.method2413(Statics.field1661);
        }
        if (arg2 == 23) {
            Statics.field611.method1830(Statics.field135, arg0, arg1);
        }
        if (arg2 == 40) {
            field319.method2621(5);
            field319.method2403(arg0);
            field319.method2413(arg1);
            field319.method2566(arg3);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 45) {
            class3 var34 = field398[arg3];
            if (var34 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(153);
                field319.method2383(arg3);
                field319.method2468(class137.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field319.method2621(70);
            field319.method2566(Statics.field1358);
            field319.method2360(Statics.field1661);
            field319.method2403(Statics.field3156);
            field319.method2403(arg3);
            field319.method2383(arg0);
            field319.method2360(arg1);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 17) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(234);
            field319.method2566(arg3);
            field319.method2503(class137.field2115[82] ? 1 : 0);
            field319.method2465(Statics.field1387);
            field319.method2566(field356);
            field319.method2358(Statics.field1054 + arg0);
            field319.method2566(Statics.field2630 + arg1);
        }
        if (arg2 == 28) {
            field319.method2621(90);
            field319.method2360(arg1);
            class173 var35 = class173.method1002(arg1);
            if (var35.field2845 != null && var35.field2845[0][0] == 5) {
                int var36 = var35.field2845[0][1];
                class176.field2885[var36] = 1 - class176.field2885[var36];
                method2724(var36);
            }
        }
        if (arg2 == 33) {
            field319.method2621(133);
            field319.method2383(arg0);
            field319.method2383(arg3);
            field319.method2414(arg1);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 4) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(178);
            field319.method2468(class137.field2115[82] ? 1 : 0);
            field319.method2566(Statics.field1054 + arg0);
            field319.method2383(Statics.field2630 + arg1);
            field319.method2383(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1005) {
            class173 var37 = class173.method1002(arg1);
            if (var37 == null || var37.field2852[arg0] < 100000) {
                field319.method2621(104);
                field319.method2403(arg3);
            } else {
                class12.method1029(27, "", var37.field2852[arg0] + " x " + class52.method154(arg3).field1100);
            }
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 7) {
            class35 var38 = field314[arg3];
            if (var38 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(156);
                field319.method2566(Statics.field3156);
                field319.method2503(class137.field2115[82] ? 1 : 0);
                field319.method2383(arg3);
                field319.method2383(Statics.field1358);
                field319.method2414(Statics.field1661);
            }
        }
        if (arg2 == 1001) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(126);
            field319.method2503(class137.field2115[82] ? 1 : 0);
            field319.method2403(Statics.field2630 + arg1);
            field319.method2383(arg3 >> 14 & 0x7FFF);
            field319.method2383(Statics.field1054 + arg0);
        }
        if (arg2 == 44) {
            class3 var39 = field398[arg3];
            if (var39 != null) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                field538 = arg0;
                field295 = arg1;
                field319.method2621(91);
                field319.method2394(class137.field2115[82] ? 1 : 0);
                field319.method2403(arg3);
            }
        }
        if (arg2 == 2) {
            field521 = arg6;
            field400 = arg7;
            field388 = 2;
            field362 = 0;
            field538 = arg0;
            field295 = arg1;
            field319.method2621(182);
            field319.method2357(class137.field2115[82] ? 1 : 0);
            field319.method2358(Statics.field2630 + arg1);
            field319.method2358(arg3 >> 14 & 0x7FFF);
            field319.method2358(field356);
            field319.method2414(Statics.field1387);
            field319.method2358(Statics.field1054 + arg0);
        }
        if (arg2 == 43) {
            field319.method2621(237);
            field319.method2566(arg0);
            field319.method2465(arg1);
            field319.method2383(arg3);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 == 24) {
            class173 var40 = class173.method1002(arg1);
            boolean var41 = true;
            if (var40.field2739 > 0) {
                var41 = method2962(var40);
            }
            if (var41) {
                field319.method2621(90);
                field319.method2360(arg1);
            }
        }
        if (arg2 == 35) {
            field319.method2621(148);
            field319.method2465(arg1);
            field319.method2383(arg3);
            field319.method2566(arg0);
            field307 = 0;
            Statics.field157 = class173.method1002(arg1);
            field390 = arg0;
        }
        if (arg2 != 25) {
            if (arg2 == 1003) {
                field521 = arg6;
                field400 = arg7;
                field388 = 2;
                field362 = 0;
                class35 var50 = field314[arg3];
                if (var50 != null) {
                    class40 var51 = var50.field762;
                    if (var51.field896 != null) {
                        var51 = var51.method779();
                    }
                    if (var51 != null) {
                        field319.method2621(117);
                        field319.method2566(var51.field870);
                    }
                }
            }
            if (field399 != 0) {
                field399 = 0;
                method908(class173.method1002(Statics.field1661));
            }
            if (field547) {
                method628();
            }
            if (Statics.field157 != null && field307 == 0) {
                method908(Statics.field157);
            }
            return;
        }
        class173 var42 = class173.method3744(arg1, arg0);
        if (var42 == null) {
            return;
        }
        method628();
        int var45 = method122(var42);
        int var46 = var45 >> 11 & 0x3F;
        method203(arg1, arg0, var46, var42.field2853);
        field399 = 0;
        int var47 = method122(var42);
        int var48 = var47 >> 11 & 0x3F;
        String var49;
        if (var48 == 0) {
            var49 = null;
        } else if (var42.field2812 == null || var42.field2812.trim().length() == 0) {
            var49 = null;
        } else {
            var49 = var42.field2812;
        }
        field433 = var49;
        if (field433 == null) {
            field433 = "Null";
        }
        if (var42.field2734) {
            field434 = var42.field2806 + class2.method1505(16777215);
        } else {
            field434 = class2.method1505(65280) + var42.field2849 + class2.method1505(16777215);
        }
    }

    @ObfuscatedName("n.bd(IIIIB)V")
    public static void method203(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method3744(arg0, arg1);
        if (var4 != null && var4.field2859 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field11 = var4.field2859;
            class37.method3221(var5);
        }
        field380 = arg3;
        field547 = true;
        Statics.field1387 = arg0;
        field356 = arg1;
        Statics.field2125 = arg2;
        method908(var4);
    }

    @ObfuscatedName("o.bs(I)V")
    public static void method628() {
        if (!field547) {
            return;
        }
        class173 var0 = class173.method3744(Statics.field1387, field356);
        if (var0 != null && var0.field2817 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field11 = var0.field2817;
            class37.method3221(var1);
        }
        field547 = false;
        method908(var0);
    }

    @ObfuscatedName("ck.bw(III)V")
    public static void method2059(int arg0, int arg1) {
        field319.method2621(66);
        field319.method2383(arg1);
        field319.method2413(arg0);
    }

    @ObfuscatedName("b.bz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method665(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field501 || field417 >= 500) {
            return;
        }
        field298[field417] = arg0;
        field423[field417] = arg1;
        field420[field417] = arg2;
        field416[field417] = arg3;
        field418[field417] = arg4;
        field419[field417] = arg5;
        field417++;
    }

    @ObfuscatedName("df.br(II)Z")
    public static boolean method2611(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("db.bx(II)Ljava/lang/String;")
    public static String method2257(int arg0) {
        return field423[arg0].length() > 0 ? field298[arg0] + class157.field2517 + field423[arg0] : field298[arg0];
    }

    @ObfuscatedName("al.by(IIIII)V")
    public static final void method770(int arg0, int arg1, int arg2, int arg3) {
        if (field399 == 0 && !field547) {
            method665(class157.field2453, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class105.field1834; var6++) {
            int var7 = class105.field1835[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field611.method1823(Statics.field135, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method736(var11);
                    if (var12.field946 != null) {
                        var12 = var12.method813();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field399 == 1) {
                        method665(class157.field2327, field429 + " " + class2.field24 + " " + class2.method1505(65535) + var12.field915, 1, var7, var8, var9);
                    } else if (!field547) {
                        String[] var13 = var12.field932;
                        if (field375) {
                            var13 = method2941(var13);
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
                                    method665(var13[var14], class2.method1505(65535) + var12.field915, var15, var7, var8, var9);
                                }
                            }
                        }
                        method665(class157.field2449, class2.method1505(65535) + var12.field915, 1002, var12.field936 << 14, var8, var9);
                    } else if ((Statics.field2125 & 0x4) == 4) {
                        method665(field433, field434 + " " + class2.field24 + " " + class2.method1505(65535) + var12.field915, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field314[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field762.field872 == 1 && (var16.field847 & 0x7F) == 64 && (var16.field835 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field315; var17++) {
                            class35 var18 = field314[field316[var17]];
                            if (var18 != null && var16 != var18 && var18.field762.field872 == 1 && var16.field847 == var18.field847 && var16.field835 == var18.field835) {
                                method2310(var18.field762, field316[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field734;
                        int[] var20 = class33.field731;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field398[var20[var21]];
                            if (var22 != null && var16.field847 == var22.field847 && var16.field835 == var22.field835) {
                                method2061(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method2310(var16.field762, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field398[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field847 & 0x7F) == 64 && (var23.field835 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field315; var24++) {
                            class35 var25 = field314[field316[var24]];
                            if (var25 != null && var25.field762.field872 == 1 && var23.field847 == var25.field847 && var23.field835 == var25.field835) {
                                method2310(var25.field762, field316[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field734;
                        int[] var27 = class33.field731;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field398[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field847 == var29.field847 && var23.field835 == var29.field835) {
                                method2061(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field407 == var11) {
                        var4 = var7;
                    } else {
                        method2061(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class199 var30 = field408[Statics.field135][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3619(); var31 != null; var31 = (class29) var30.method3609()) {
                            class52 var32 = class52.method154(var31.field661);
                            if (field399 == 1) {
                                method665(class157.field2327, field429 + " " + class2.field24 + " " + class2.method1505(16748608) + var32.field1100, 16, var31.field661, var8, var9);
                            } else if (!field547) {
                                String[] var33 = var32.field1109;
                                if (field375) {
                                    var33 = method2941(var33);
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
                                        method665(var33[var34], class2.method1505(16748608) + var32.field1100, var35, var31.field661, var8, var9);
                                    } else if (var34 == 2) {
                                        method665(class157.field2298, class2.method1505(16748608) + var32.field1100, 20, var31.field661, var8, var9);
                                    }
                                }
                                method665(class157.field2449, class2.method1505(16748608) + var32.field1100, 1004, var31.field661, var8, var9);
                            } else if ((Statics.field2125 & 0x1) == 1) {
                                method665(field433, field434 + " " + class2.field24 + " " + class2.method1505(16748608) + var32.field1100, 17, var31.field661, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field398[field407];
            method2061(var38, field407, var36, var37);
        }
    }

    @ObfuscatedName("dq.bb(Lac;IIII)V")
    public static final void method2310(class40 arg0, int arg1, int arg2, int arg3) {
        if (field417 >= 400) {
            return;
        }
        if (arg0.field896 != null) {
            arg0 = arg0.method779();
        }
        if (arg0 == null || !arg0.field882 || arg0.field899 && field464 != arg1) {
            return;
        }
        String var4 = arg0.field871;
        if (arg0.field888 != 0) {
            var4 = var4 + method2661(arg0.field888, Statics.field13.field54) + " " + class2.field22 + class157.field2448 + arg0.field888 + class2.field25;
        }
        if (field399 == 1) {
            method665(class157.field2327, field429 + " " + class2.field24 + " " + class2.method1505(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field547) {
            String[] var5 = arg0.field886;
            if (field375) {
                var5 = method2941(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2450)) {
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
                        method665(var5[var6], class2.method1505(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2450)) {
                        short var9 = 0;
                        if (field304 != class21.field561) {
                            if (field304 == class21.field566 || field304 == class21.field560 && arg0.field888 > Statics.field13.field54) {
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
                            method665(var5[var8], class2.method1505(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method665(class157.field2449, class2.method1505(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2125 & 0x2) == 2) {
            method665(field433, field434 + " " + class2.field24 + " " + class2.method1505(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cn.bo(Lf;IIII)V")
    public static final void method2061(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field13 == arg0 || field417 >= 400) {
            return;
        }
        String var4;
        if (arg0.field38 == 0) {
            var4 = arg0.field33[0] + arg0.field35 + arg0.field33[1] + method2661(arg0.field54, Statics.field13.field54) + " " + class2.field22 + class157.field2448 + arg0.field54 + class2.field25 + arg0.field33[2];
        } else {
            var4 = arg0.field33[0] + arg0.field35 + arg0.field33[1] + " " + class2.field22 + class157.field2455 + arg0.field38 + class2.field25 + arg0.field33[2];
        }
        if (field399 == 1) {
            method665(class157.field2327, field429 + " " + class2.field24 + " " + class2.method1505(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field547) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field329[var5] != null) {
                    short var6 = 0;
                    if (field329[var5].equalsIgnoreCase(class157.field2450)) {
                        if (field277 == class21.field561) {
                            continue;
                        }
                        if (field277 == class21.field566 || field277 == class21.field560 && arg0.field54 > Statics.field13.field54) {
                            var6 = 2000;
                        }
                        if (Statics.field13.field51 != 0 && arg0.field51 != 0) {
                            if (Statics.field13.field51 == arg0.field51) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field405[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field403[var5] + var6;
                    method665(field329[var5], class2.method1505(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2125 & 0x8) == 8) {
            method665(field433, field434 + " " + class2.field24 + " " + class2.method1505(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field417; var9++) {
            if (field420[var9] == 23) {
                field423[var9] = class2.method1505(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("du.bv(III)Ljava/lang/String;")
    public static final String method2661(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1505(16711680);
        } else if (var2 < -6) {
            return class2.method1505(16723968);
        } else if (var2 < -3) {
            return class2.method1505(16740352);
        } else if (var2 < 0) {
            return class2.method1505(16756736);
        } else if (var2 > 9) {
            return class2.method1505(65280);
        } else if (var2 > 6) {
            return class2.method1505(4259584);
        } else if (var2 > 3) {
            return class2.method1505(8453888);
        } else if (var2 > 0) {
            return class2.method1505(12648192);
        } else {
            return class2.method1505(16776960);
        }
    }

    @ObfuscatedName("db.cq(IIIIIIIII)V")
    public static final void method2258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method3172(arg0)) {
            Statics.field837 = null;
            method2300(Statics.field2858[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field837 != null) {
                method2300(Statics.field837, -1412584499, arg1, arg2, arg3, arg4, Statics.field158, Statics.field1071, arg7);
                Statics.field837 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field371[var8] = true;
            }
        } else {
            field371[arg7] = true;
        }
    }

    @ObfuscatedName("dd.cb([Lfv;IIIIIIIIB)V")
    public static final void method2300(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1693(arg2, arg3, arg4, arg5);
        class91.method1964();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2743 == arg1 || arg1 == -1412584499 && field448 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field483[field478] = var10.field2847 + arg6;
                    field484[field478] = var10.field2749 + arg7;
                    field485[field478] = var10.field2750;
                    field527[field478] = var10.field2751;
                    var11 = ++field478 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2864 = var11;
                var10.field2834 = field287;
                if (!var10.field2734 || !method2973(var10)) {
                    if (var10.field2739 > 0) {
                        method2692(var10);
                    }
                    int var12 = var10.field2847 + arg6;
                    int var13 = var10.field2749 + arg7;
                    int var14 = var10.field2785;
                    if (field448 == var10) {
                        if (arg1 != -1412584499 && !var10.field2811) {
                            Statics.field837 = arg0;
                            Statics.field158 = arg6;
                            Statics.field1071 = arg7;
                            continue;
                        }
                        if (field518 && field453) {
                            int var15 = class140.field2135;
                            int var16 = class140.field2136;
                            int var17 = var15 - field450;
                            int var18 = var16 - field451;
                            if (var17 < field454) {
                                var17 = field454;
                            }
                            if (var10.field2750 + var17 > field454 + field449.field2750) {
                                var17 = field454 + field449.field2750 - var10.field2750;
                            }
                            if (var18 < field455) {
                                var18 = field455;
                            }
                            if (var10.field2751 + var18 > field455 + field449.field2751) {
                                var18 = field455 + field449.field2751 - var10.field2751;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2811) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2737 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2737 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2750 + var12;
                        int var26 = var10.field2751 + var13;
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
                        int var29 = var10.field2750 + var12;
                        int var30 = var10.field2751 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2734 || var19 < var21 && var20 < var22) {
                        if (var10.field2739 != 0) {
                            if (var10.field2739 == 1336) {
                                if (field293) {
                                    var13 += 15;
                                    Statics.field140.method3811("Fps:" + field2182, var10.field2750 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field528) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field528) {
                                        var33 = 16711680;
                                    }
                                    Statics.field140.method3811("Mem:" + var32 + "k", var10.field2750 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2739 == 1337) {
                                field424 = var12;
                                field425 = var13;
                                int var36 = var10.field2750;
                                int var37 = var10.field2751;
                                field382++;
                                method109(class34.field754);
                                boolean var38 = false;
                                if (field407 >= 0) {
                                    int var39 = class33.field734;
                                    int[] var40 = class33.field731;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field407 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method109(class34.field749);
                                }
                                method772(true);
                                method109(var38 ? class34.field751 : class34.field755);
                                method772(false);
                                for (class7 var42 = (class7) field410.method3606(); var42 != null; var42 = (class7) field410.method3608()) {
                                    if (Statics.field135 != var42.field96 || field287 > var42.field101) {
                                        var42.method3700();
                                    } else if (field287 >= var42.field100) {
                                        if (var42.field104 > 0) {
                                            class35 var43 = field314[var42.field104 - 1];
                                            if (var43 != null && var43.field847 >= 0 && var43.field847 < 13312 && var43.field835 >= 0 && var43.field835 < 13312) {
                                                var42.method112(var43.field847, var43.field835, method745(var43.field847, var43.field835, var42.field96) - var42.field99, field287);
                                            }
                                        }
                                        if (var42.field104 < 0) {
                                            int var44 = -var42.field104 - 1;
                                            class3 var45;
                                            if (field524 == var44) {
                                                var45 = Statics.field13;
                                            } else {
                                                var45 = field398[var44];
                                            }
                                            if (var45 != null && var45.field847 >= 0 && var45.field847 < 13312 && var45.field835 >= 0 && var45.field835 < 13312) {
                                                var42.method112(var45.field847, var45.field835, method745(var45.field847, var45.field835, var42.field96) - var42.field99, field287);
                                            }
                                        }
                                        var42.method104(field421);
                                        Statics.field611.method1804(Statics.field135, (int) var42.field106, (int) var42.field107, (int) var42.field97, 60, var42, var42.field105, -1, false);
                                    }
                                }
                                method734();
                                method716(var12, var13, var36, var37, true);
                                int var46 = field537;
                                int var47 = field436;
                                int var48 = field539;
                                int var49 = field540;
                                class80.method1693(var46, var47, var46 + var48, var47 + var49);
                                class91.method1964();
                                if (!field335) {
                                    int var50 = field361;
                                    if (field370 / 256 > var50) {
                                        var50 = field370 / 256;
                                    }
                                    if (field428[4] && field526[4] + 128 > var50) {
                                        var50 = field526[4] + 128;
                                    }
                                    int var51 = field435 + field344 & 0x7FF;
                                    int var52 = Statics.field255;
                                    int var53 = method745(Statics.field13.field847, Statics.field13.field835, Statics.field135) - field367;
                                    int var54 = Statics.field610;
                                    int var55 = var50 * 3 + 600;
                                    int var56 = 2048 - var50 & 0x7FF;
                                    int var57 = 2048 - var51 & 0x7FF;
                                    int var58 = 0;
                                    int var59 = 0;
                                    int var60 = var55;
                                    if (var56 != 0) {
                                        int var61 = class91.field1572[var56];
                                        int var62 = class91.field1574[var56];
                                        int var63 = var59 * var62 - var55 * var61 >> 16;
                                        var60 = var59 * var61 + var55 * var62 >> 16;
                                        var59 = var63;
                                    }
                                    if (var57 != 0) {
                                        int var64 = class91.field1572[var57];
                                        int var65 = class91.field1574[var57];
                                        int var66 = var58 * var65 + var60 * var64 >> 16;
                                        var60 = var60 * var65 - var58 * var64 >> 16;
                                        var58 = var66;
                                    }
                                    Statics.field673 = var52 - var58;
                                    Statics.field2054 = var53 - var59;
                                    Statics.field1375 = var54 - var60;
                                    Statics.field170 = var50;
                                    Statics.field1435 = var51;
                                }
                                int var79;
                                if (field335) {
                                    var79 = method768();
                                } else {
                                    int var67;
                                    if (Statics.field2278.field143) {
                                        var67 = Statics.field135;
                                    } else {
                                        label1314: {
                                            int var68 = 3;
                                            if (Statics.field170 < 310) {
                                                int var69 = Statics.field673 >> 7;
                                                int var70 = Statics.field1375 >> 7;
                                                int var71 = Statics.field13.field847 >> 7;
                                                int var72 = Statics.field13.field835 >> 7;
                                                if (var69 < 0 || var70 < 0 || var69 >= 104 || var70 >= 104) {
                                                    var67 = Statics.field135;
                                                    break label1314;
                                                }
                                                if ((class6.field87[Statics.field135][var69][var70] & 0x4) != 0) {
                                                    var68 = Statics.field135;
                                                }
                                                int var73;
                                                if (var71 > var69) {
                                                    var73 = var71 - var69;
                                                } else {
                                                    var73 = var69 - var71;
                                                }
                                                int var74;
                                                if (var72 > var70) {
                                                    var74 = var72 - var70;
                                                } else {
                                                    var74 = var70 - var72;
                                                }
                                                if (var73 > var74) {
                                                    int var75 = var74 * 65536 / var73;
                                                    int var76 = 32768;
                                                    while (var69 != var71) {
                                                        if (var69 < var71) {
                                                            var69++;
                                                        } else if (var69 > var71) {
                                                            var69--;
                                                        }
                                                        if ((class6.field87[Statics.field135][var69][var70] & 0x4) != 0) {
                                                            var68 = Statics.field135;
                                                        }
                                                        var76 += var75;
                                                        if (var76 >= 65536) {
                                                            var76 -= 65536;
                                                            if (var70 < var72) {
                                                                var70++;
                                                            } else if (var70 > var72) {
                                                                var70--;
                                                            }
                                                            if ((class6.field87[Statics.field135][var69][var70] & 0x4) != 0) {
                                                                var68 = Statics.field135;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var77 = var73 * 65536 / var74;
                                                    int var78 = 32768;
                                                    while (var70 != var72) {
                                                        if (var70 < var72) {
                                                            var70++;
                                                        } else if (var70 > var72) {
                                                            var70--;
                                                        }
                                                        if ((class6.field87[Statics.field135][var69][var70] & 0x4) != 0) {
                                                            var68 = Statics.field135;
                                                        }
                                                        var78 += var77;
                                                        if (var78 >= 65536) {
                                                            var78 -= 65536;
                                                            if (var69 < var71) {
                                                                var69++;
                                                            } else if (var69 > var71) {
                                                                var69--;
                                                            }
                                                            if ((class6.field87[Statics.field135][var69][var70] & 0x4) != 0) {
                                                                var68 = Statics.field135;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field13.field847 >= 0 && Statics.field13.field835 >= 0 && Statics.field13.field847 < 13312 && Statics.field13.field835 < 13312) {
                                                if ((class6.field87[Statics.field135][Statics.field13.field847 >> 7][Statics.field13.field835 >> 7] & 0x4) != 0) {
                                                    var68 = Statics.field135;
                                                }
                                                var67 = var68;
                                            } else {
                                                var67 = Statics.field135;
                                            }
                                        }
                                    }
                                    var79 = var67;
                                }
                                int var80 = Statics.field673;
                                int var81 = Statics.field2054;
                                int var82 = Statics.field1375;
                                int var83 = Statics.field170;
                                int var84 = Statics.field1435;
                                for (int var85 = 0; var85 < 5; var85++) {
                                    if (field428[var85]) {
                                        int var86 = (int) (Math.random() * (double) (field525[var85] * 2 + 1) - (double) field525[var85] + Math.sin((double) field291[var85] / 100.0D * (double) field475[var85]) * (double) field526[var85]);
                                        if (var85 == 0) {
                                            Statics.field673 += var86;
                                        }
                                        if (var85 == 1) {
                                            Statics.field2054 += var86;
                                        }
                                        if (var85 == 2) {
                                            Statics.field1375 += var86;
                                        }
                                        if (var85 == 3) {
                                            Statics.field1435 = Statics.field1435 + var86 & 0x7FF;
                                        }
                                        if (var85 == 4) {
                                            Statics.field170 += var86;
                                            if (Statics.field170 < 128) {
                                                Statics.field170 = 128;
                                            }
                                            if (Statics.field170 > 383) {
                                                Statics.field170 = 383;
                                            }
                                        }
                                    }
                                }
                                int var87 = class140.field2135;
                                int var88 = class140.field2136;
                                if (class140.field2141 != 0) {
                                    var87 = class140.field2131;
                                    var88 = class140.field2143;
                                }
                                if (var87 >= var46 && var87 < var46 + var48 && var88 >= var47 && var88 < var47 + var49) {
                                    class105.field1831 = true;
                                    class105.field1834 = 0;
                                    class105.field1832 = var87 - var46;
                                    class105.field1833 = var88 - var47;
                                } else {
                                    class105.field1831 = false;
                                    class105.field1834 = 0;
                                }
                                method2697();
                                class80.method1697(var46, var47, var48, var49, 0);
                                method2697();
                                int var89 = class91.field1554;
                                class91.field1554 = field541;
                                Statics.field611.method1831(Statics.field673, Statics.field2054, Statics.field1375, Statics.field170, Statics.field1435, var79);
                                class91.field1554 = var89;
                                method2697();
                                Statics.field611.method1807();
                                method737(var46, var47, var48, var49);
                                method46(var46, var47);
                                ((class95) Statics.field1570).method2048(field421);
                                method2057(var46, var47, var48, var49);
                                Statics.field673 = var80;
                                Statics.field2054 = var81;
                                Statics.field1375 = var82;
                                Statics.field170 = var83;
                                Statics.field1435 = var84;
                                if (field533 && class171.method1030(true, false) == 0) {
                                    field533 = false;
                                }
                                if (field533) {
                                    class80.method1697(var46, var47, var48, var49, 0);
                                    method846(class157.field2307, false);
                                }
                                field371[var10.field2864] = true;
                                class80.method1693(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2739 == 1338) {
                                method2697();
                                class175 var90 = var10.method3227(false);
                                if (var90 != null) {
                                    class80.method1693(var12, var13, var90.field2883 + var12, var90.field2878 + var13);
                                    if (field511 == 2 || field511 == 5) {
                                        class80.method1695(var12, var13, 0, var90.field2880, var90.field2879);
                                    } else {
                                        int var91 = field435 + field347 & 0x7FF;
                                        int var92 = Statics.field13.field847 / 32 + 48;
                                        int var93 = 464 - Statics.field13.field835 / 32;
                                        Statics.field1656.method1616(var12, var13, var90.field2883, var90.field2878, var92, var93, var91, field349 + 256, var90.field2880, var90.field2879);
                                        for (int var94 = 0; var94 < field505; var94++) {
                                            int var95 = field323[var94] * 4 + 2 - Statics.field13.field847 / 32;
                                            int var96 = field507[var94] * 4 + 2 - Statics.field13.field835 / 32;
                                            method149(var12, var13, var95, var96, field508[var94], var90);
                                        }
                                        int var97 = 0;
                                        while (true) {
                                            if (var97 >= 104) {
                                                for (int var102 = 0; var102 < field315; var102++) {
                                                    class35 var103 = field314[field316[var102]];
                                                    if (var103 != null && var103.method21()) {
                                                        class40 var104 = var103.field762;
                                                        if (var104 != null && var104.field896 != null) {
                                                            var104 = var104.method779();
                                                        }
                                                        if (var104 != null && var104.field887 && var104.field882) {
                                                            int var105 = var103.field847 / 32 - Statics.field13.field847 / 32;
                                                            int var106 = var103.field835 / 32 - Statics.field13.field835 / 32;
                                                            method149(var12, var13, var105, var106, Statics.field156[1], var90);
                                                        }
                                                    }
                                                }
                                                int var107 = class33.field734;
                                                int[] var108 = class33.field731;
                                                for (int var109 = 0; var109 < var107; var109++) {
                                                    class3 var110 = field398[var108[var109]];
                                                    if (var110 != null && var110.method21() && !var110.field36 && Statics.field13 != var110) {
                                                        int var111 = var110.field847 / 32 - Statics.field13.field847 / 32;
                                                        int var112 = var110.field835 / 32 - Statics.field13.field835 / 32;
                                                        boolean var113 = false;
                                                        if (method134(var110.field35, true)) {
                                                            var113 = true;
                                                        }
                                                        boolean var114 = false;
                                                        for (int var115 = 0; var115 < Statics.field965; var115++) {
                                                            if (var110.field35.equals(Statics.field1668[var115].field605)) {
                                                                var114 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var116 = false;
                                                        if (Statics.field13.field51 != 0 && var110.field51 != 0 && Statics.field13.field51 == var110.field51) {
                                                            var116 = true;
                                                        }
                                                        if (var113) {
                                                            method149(var12, var13, var111, var112, Statics.field156[3], var90);
                                                        } else if (var116) {
                                                            method149(var12, var13, var111, var112, Statics.field156[4], var90);
                                                        } else if (var114) {
                                                            method149(var12, var13, var111, var112, Statics.field156[5], var90);
                                                        } else {
                                                            method149(var12, var13, var111, var112, Statics.field156[2], var90);
                                                        }
                                                    }
                                                }
                                                if (field430 != 0 && field287 % 20 < 10) {
                                                    if (field430 == 1 && field312 >= 0 && field312 < field314.length) {
                                                        class35 var117 = field314[field312];
                                                        if (var117 != null) {
                                                            int var118 = var117.field847 / 32 - Statics.field13.field847 / 32;
                                                            int var119 = var117.field835 / 32 - Statics.field13.field835 / 32;
                                                            method179(var12, var13, var118, var119, Statics.field354[1], var90);
                                                        }
                                                    }
                                                    if (field430 == 2) {
                                                        int var120 = field503 * 4 - Statics.field1054 * 4 + 2 - Statics.field13.field847 / 32;
                                                        int var121 = field438 * 4 - Statics.field2630 * 4 + 2 - Statics.field13.field835 / 32;
                                                        method179(var12, var13, var120, var121, Statics.field354[1], var90);
                                                    }
                                                    if (field430 == 10 && field283 >= 0 && field283 < field398.length) {
                                                        class3 var122 = field398[field283];
                                                        if (var122 != null) {
                                                            int var123 = var122.field847 / 32 - Statics.field13.field847 / 32;
                                                            int var124 = var122.field835 / 32 - Statics.field13.field835 / 32;
                                                            method179(var12, var13, var123, var124, Statics.field354[1], var90);
                                                        }
                                                    }
                                                }
                                                if (field538 != 0) {
                                                    int var125 = field538 * 4 + 2 - Statics.field13.field847 / 32;
                                                    int var126 = field295 * 4 + 2 - Statics.field13.field835 / 32;
                                                    method149(var12, var13, var125, var126, Statics.field354[0], var90);
                                                }
                                                if (!Statics.field13.field36) {
                                                    class80.method1697(var90.field2883 / 2 + var12 - 1, var90.field2878 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var98 = 0; var98 < 104; var98++) {
                                                class199 var99 = field408[Statics.field135][var97][var98];
                                                if (var99 != null) {
                                                    int var100 = var97 * 4 + 2 - Statics.field13.field847 / 32;
                                                    int var101 = var98 * 4 + 2 - Statics.field13.field835 / 32;
                                                    method149(var12, var13, var100, var101, Statics.field156[0], var90);
                                                }
                                            }
                                            var97++;
                                        }
                                    }
                                    field497[var11] = true;
                                }
                                class80.method1693(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2739 == 1339) {
                                method136(var10, var12, var13, var11);
                                class80.method1693(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2737 == 0) {
                            if (!var10.field2734 && method2973(var10) && Statics.field66 != var10) {
                                continue;
                            }
                            if (!var10.field2734) {
                                if (var10.field2763 > var10.field2766 - var10.field2751) {
                                    var10.field2763 = var10.field2766 - var10.field2751;
                                }
                                if (var10.field2763 < 0) {
                                    var10.field2763 = 0;
                                }
                            }
                            method2300(arg0, var10.field2735, var19, var20, var21, var22, var12 - var10.field2756, var13 - var10.field2763, var11);
                            if (var10.field2807 != null) {
                                method2300(var10.field2807, var10.field2735, var19, var20, var21, var22, var12 - var10.field2756, var13 - var10.field2763, var11);
                            }
                            class4 var127 = (class4) field305.method3571((long) var10.field2735);
                            if (var127 != null) {
                                method2258(var127.field64, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1693(arg2, arg3, arg4, arg5);
                            class91.method1964();
                        }
                        if (field427 || field482[var11] || field317 > 1) {
                            if (var10.field2737 == 0 && !var10.field2734 && var10.field2766 > var10.field2751) {
                                int var128 = var10.field2750 + var12;
                                int var129 = var10.field2763;
                                int var130 = var10.field2751;
                                int var131 = var10.field2766;
                                Statics.field2942[0].method1758(var128, var13);
                                Statics.field2942[1].method1758(var128, var13 + var130 - 16);
                                class80.method1697(var128, var13 + 16, 16, var130 - 32, field481);
                                int var132 = (var130 - 32) * var130 / var131;
                                if (var132 < 8) {
                                    var132 = 8;
                                }
                                int var133 = (var130 - 32 - var132) * var129 / (var131 - var130);
                                class80.method1697(var128, var13 + 16 + var133, 16, var132, field377);
                                class80.method1732(var128, var13 + 16 + var133, var132, field279);
                                class80.method1732(var128 + 1, var13 + 16 + var133, var132, field279);
                                class80.method1708(var128, var13 + 16 + var133, 16, field279);
                                class80.method1708(var128, var13 + 17 + var133, 16, field279);
                                class80.method1732(var128 + 15, var13 + 16 + var133, var132, field385);
                                class80.method1732(var128 + 14, var13 + 17 + var133, var132 - 1, field385);
                                class80.method1708(var128, var13 + 15 + var133 + var132, 16, field385);
                                class80.method1708(var128 + 1, var13 + 14 + var133 + var132, 15, field385);
                            }
                            if (var10.field2737 != 1) {
                                if (var10.field2737 == 2) {
                                    int var134 = 0;
                                    for (int var135 = 0; var135 < var10.field2747; var135++) {
                                        for (int var136 = 0; var136 < var10.field2861; var136++) {
                                            int var137 = (var10.field2762 + 32) * var136 + var12;
                                            int var138 = (var10.field2800 + 32) * var135 + var13;
                                            if (var134 < 20) {
                                                var137 += var10.field2801[var134];
                                                var138 += var10.field2802[var134];
                                            }
                                            if (var10.field2851[var134] > 0) {
                                                boolean var139 = false;
                                                boolean var140 = false;
                                                int var141 = var10.field2851[var134] - 1;
                                                if (var137 + 32 > arg2 && var137 < arg4 && var138 + 32 > arg3 && var138 < arg5 || Statics.field27 == var10 && field391 == var134) {
                                                    class79 var142;
                                                    if (field399 == 1 && Statics.field3156 == var134 && Statics.field1661 == var10.field2735) {
                                                        var142 = class52.method2693(var141, var10.field2852[var134], 2, 0, 2, false);
                                                    } else {
                                                        var142 = class52.method2693(var141, var10.field2852[var134], 1, 3153952, 2, false);
                                                    }
                                                    if (var142 == null) {
                                                        method908(var10);
                                                    } else if (Statics.field27 == var10 && field391 == var134) {
                                                        int var143 = class140.field2135 - field392;
                                                        int var144 = class140.field2136 - field510;
                                                        if (var143 < 5 && var143 > -5) {
                                                            var143 = 0;
                                                        }
                                                        if (var144 < 5 && var144 > -5) {
                                                            var144 = 0;
                                                        }
                                                        if (field490 < 5) {
                                                            var143 = 0;
                                                            var144 = 0;
                                                        }
                                                        var142.method1668(var137 + var143, var138 + var144, 128);
                                                        if (arg1 != -1) {
                                                            class173 var145 = arg0[arg1 & 0xFFFF];
                                                            if (var138 + var144 < class80.field1404 && var145.field2763 > 0) {
                                                                int var146 = field421 * (class80.field1404 - var138 - var144) / 3;
                                                                if (var146 > field421 * 10) {
                                                                    var146 = field421 * 10;
                                                                }
                                                                if (var146 > var145.field2763) {
                                                                    var146 = var145.field2763;
                                                                }
                                                                var145.field2763 -= var146;
                                                                field510 += var146;
                                                                method908(var145);
                                                            }
                                                            if (var138 + var144 + 32 > class80.field1403 && var145.field2763 < var145.field2766 - var145.field2751) {
                                                                int var147 = field421 * (var138 + var144 + 32 - class80.field1403) / 3;
                                                                if (var147 > field421 * 10) {
                                                                    var147 = field421 * 10;
                                                                }
                                                                if (var147 > var145.field2766 - var145.field2751 - var145.field2763) {
                                                                    var147 = var145.field2766 - var145.field2751 - var145.field2763;
                                                                }
                                                                var145.field2763 += var147;
                                                                field510 -= var147;
                                                                method908(var145);
                                                            }
                                                        }
                                                    } else if (Statics.field157 == var10 && field390 == var134) {
                                                        var142.method1668(var137, var138, 128);
                                                    } else {
                                                        var142.method1607(var137, var138);
                                                    }
                                                }
                                            } else if (var10.field2820 != null && var134 < 20) {
                                                class79 var148 = var10.method3232(var134);
                                                if (var148 != null) {
                                                    var148.method1607(var137, var138);
                                                } else if (class173.field2746) {
                                                    method908(var10);
                                                }
                                            }
                                            var134++;
                                        }
                                    }
                                } else if (var10.field2737 == 3) {
                                    int var149;
                                    if (method3004(var10)) {
                                        var149 = var10.field2840;
                                        if (Statics.field66 == var10 && var10.field2768 != 0) {
                                            var149 = var10.field2768;
                                        }
                                    } else {
                                        var149 = var10.field2825;
                                        if (Statics.field66 == var10 && var10.field2814 != 0) {
                                            var149 = var10.field2814;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2764) {
                                            class80.method1697(var12, var13, var10.field2750, var10.field2751, var149);
                                        } else {
                                            class80.method1692(var12, var13, var10.field2750, var10.field2751, var149);
                                        }
                                    } else if (var10.field2764) {
                                        class80.method1698(var12, var13, var10.field2750, var10.field2751, var149, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1702(var12, var13, var10.field2750, var10.field2751, var149, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2737 == 4) {
                                    class224 var150 = var10.method3231();
                                    if (var150 != null) {
                                        String var151 = var10.field2757;
                                        int var152;
                                        if (method3004(var10)) {
                                            var152 = var10.field2840;
                                            if (Statics.field66 == var10 && var10.field2768 != 0) {
                                                var152 = var10.field2768;
                                            }
                                            if (var10.field2794.length() > 0) {
                                                var151 = var10.field2794;
                                            }
                                        } else {
                                            var152 = var10.field2825;
                                            if (Statics.field66 == var10 && var10.field2814 != 0) {
                                                var152 = var10.field2814;
                                            }
                                        }
                                        if (var10.field2734 && var10.field2853 != -1) {
                                            class52 var153 = class52.method154(var10.field2853);
                                            var151 = var153.field1100;
                                            if (var151 == null) {
                                                var151 = "null";
                                            }
                                            if ((var153.field1111 == 1 || var10.field2854 != 1) && var10.field2854 != -1) {
                                                String var154 = class2.method1505(16748608) + var151 + class2.field26 + " " + 'x';
                                                int var155 = var10.field2854;
                                                String var156 = Integer.toString(var155);
                                                for (int var157 = var156.length() - 3; var157 > 0; var157 -= 3) {
                                                    var156 = var156.substring(0, var157) + class2.field19 + var156.substring(var157);
                                                }
                                                String var158;
                                                StringBuilder var10000;
                                                class157 var10001;
                                                if (var156.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method1505(65408)).append(var156.substring(0, var156.length() - 8));
                                                    var10001 = (class157) null;
                                                    var158 = var10000.append(class157.field2566).append(" ").append(class2.field22).append(var156).append(class2.field25).append(class2.field26).toString();
                                                } else if (var156.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method1505(16777215)).append(var156.substring(0, var156.length() - 4));
                                                    var10001 = (class157) null;
                                                    var158 = var10000.append(class157.field2461).append(" ").append(class2.field22).append(var156).append(class2.field25).append(class2.field26).toString();
                                                } else {
                                                    var158 = " " + class2.method1505(16776960) + var156 + class2.field26;
                                                }
                                                var151 = var154 + var158;
                                            }
                                        }
                                        if (field546 == var10) {
                                            class157 var226 = (class157) null;
                                            var151 = class157.field2454;
                                            var152 = var10.field2825;
                                        }
                                        if (!var10.field2734) {
                                            var151 = method194(var151, var10);
                                        }
                                        var150.method3813(var151, var12, var13, var10.field2750, var10.field2751, var152, var10.field2745 ? 0 : -1, var10.field2796, var10.field2797, var10.field2789);
                                    } else if (class173.field2746) {
                                        method908(var10);
                                    }
                                } else if (var10.field2737 == 5) {
                                    if (var10.field2734) {
                                        class79 var160;
                                        if (var10.field2853 == -1) {
                                            var160 = var10.method3230(false);
                                        } else {
                                            var160 = class52.method2693(var10.field2853, var10.field2854, var10.field2772, var10.field2773, var10.field2780, false);
                                        }
                                        if (var160 != null) {
                                            int var161 = var160.field1389;
                                            int var162 = var160.field1400;
                                            if (var10.field2771) {
                                                class80.method1694(var12, var13, var10.field2750 + var12, var10.field2751 + var13);
                                                int var163 = (var10.field2750 + (var161 - 1)) / var161;
                                                int var164 = (var10.field2751 + (var162 - 1)) / var162;
                                                for (int var165 = 0; var165 < var163; var165++) {
                                                    for (int var166 = 0; var166 < var164; var166++) {
                                                        if (var10.field2770 != 0) {
                                                            var160.method1619(var161 / 2 + var161 * var165 + var12, var162 / 2 + var162 * var166 + var13, var10.field2770, 4096);
                                                        } else if (var14 == 0) {
                                                            var160.method1607(var161 * var165 + var12, var162 * var166 + var13);
                                                        } else {
                                                            var160.method1668(var161 * var165 + var12, var162 * var166 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1693(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var167 = var10.field2750 * 4096 / var161;
                                                if (var10.field2770 != 0) {
                                                    var160.method1619(var10.field2750 / 2 + var12, var10.field2751 / 2 + var13, var10.field2770, var167);
                                                } else if (var14 != 0) {
                                                    var160.method1614(var12, var13, var10.field2750, var10.field2751, 256 - (var14 & 0xFF));
                                                } else if (var10.field2750 == var161 && var10.field2751 == var162) {
                                                    var160.method1607(var12, var13);
                                                } else {
                                                    var160.method1608(var12, var13, var10.field2750, var10.field2751);
                                                }
                                            }
                                        } else if (class173.field2746) {
                                            method908(var10);
                                        }
                                    } else {
                                        class79 var159 = var10.method3230(method3004(var10));
                                        if (var159 != null) {
                                            var159.method1607(var12, var13);
                                        } else if (class173.field2746) {
                                            method908(var10);
                                        }
                                    }
                                } else if (var10.field2737 == 6) {
                                    boolean var168 = method3004(var10);
                                    int var169;
                                    if (var168) {
                                        var169 = var10.field2781;
                                    } else {
                                        var169 = var10.field2803;
                                    }
                                    class105 var170 = null;
                                    int var171 = 0;
                                    if (var10.field2853 != -1) {
                                        class52 var172 = class52.method154(var10.field2853);
                                        if (var172 != null) {
                                            class52 var173 = var172.method1040(var10.field2854);
                                            var170 = var173.method1039(1);
                                            if (var170 == null) {
                                                method908(var10);
                                            } else {
                                                var170.method2179();
                                                var171 = var170.field1442 / 2;
                                            }
                                        }
                                    } else if (var10.field2778 == 5) {
                                        if (var10.field2777 == 0) {
                                            var170 = field548.method3306((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var170 = Statics.field13.method17();
                                        }
                                    } else if (var169 == -1) {
                                        var170 = var10.method3233((class43) null, -1, var168, Statics.field13.field32);
                                        if (var170 == null && class173.field2746) {
                                            method908(var10);
                                        }
                                    } else {
                                        class43 var174 = class43.method575(var169);
                                        var170 = var10.method3233(var174, var10.field2855, var168, Statics.field13.field32);
                                        if (var170 == null && class173.field2746) {
                                            method908(var10);
                                        }
                                    }
                                    class91.method1967(var10.field2750 / 2 + var12, var10.field2751 / 2 + var13);
                                    int var175 = var10.field2788 * class91.field1572[var10.field2784] >> 16;
                                    int var176 = var10.field2788 * class91.field1574[var10.field2784] >> 16;
                                    if (var170 != null) {
                                        if (var10.field2734) {
                                            var170.method2179();
                                            if (var10.field2754) {
                                                var170.method2192(0, var10.field2761, var10.field2786, var10.field2784, var10.field2782, var10.field2783 + var171 + var175, var10.field2783 + var176, var10.field2788);
                                            } else {
                                                var170.method2222(0, var10.field2761, var10.field2786, var10.field2784, var10.field2782, var10.field2783 + var171 + var175, var10.field2783 + var176);
                                            }
                                        } else {
                                            var170.method2222(0, var10.field2761, 0, var10.field2784, 0, var175, var176);
                                        }
                                    }
                                    class91.method1966();
                                } else {
                                    if (var10.field2737 == 7) {
                                        class224 var177 = var10.method3231();
                                        if (var177 == null) {
                                            if (class173.field2746) {
                                                method908(var10);
                                            }
                                            continue;
                                        }
                                        int var178 = 0;
                                        for (int var179 = 0; var179 < var10.field2747; var179++) {
                                            for (int var180 = 0; var180 < var10.field2861; var180++) {
                                                if (var10.field2851[var178] > 0) {
                                                    class52 var181 = class52.method154(var10.field2851[var178] - 1);
                                                    String var182;
                                                    if (var181.field1111 != 1 && var10.field2852[var178] == 1) {
                                                        var182 = class2.method1505(16748608) + var181.field1100 + class2.field26;
                                                    } else {
                                                        String var183 = class2.method1505(16748608) + var181.field1100 + class2.field26 + " " + 'x';
                                                        int var184 = var10.field2852[var178];
                                                        String var185 = Integer.toString(var184);
                                                        for (int var186 = var185.length() - 3; var186 > 0; var186 -= 3) {
                                                            var185 = var185.substring(0, var186) + class2.field19 + var185.substring(var186);
                                                        }
                                                        String var187;
                                                        if (var185.length() > 9) {
                                                            var187 = " " + class2.method1505(65408) + var185.substring(0, var185.length() - 8) + class157.field2566 + " " + class2.field22 + var185 + class2.field25 + class2.field26;
                                                        } else if (var185.length() > 6) {
                                                            var187 = " " + class2.method1505(16777215) + var185.substring(0, var185.length() - 4) + class157.field2461 + " " + class2.field22 + var185 + class2.field25 + class2.field26;
                                                        } else {
                                                            var187 = " " + class2.method1505(16776960) + var185 + class2.field26;
                                                        }
                                                        var182 = var183 + var187;
                                                    }
                                                    int var188 = (var10.field2762 + 115) * var180 + var12;
                                                    int var189 = (var10.field2800 + 12) * var179 + var13;
                                                    if (var10.field2796 == 0) {
                                                        var177.method3809(var182, var188, var189, var10.field2825, var10.field2745 ? 0 : -1);
                                                    } else if (var10.field2796 == 1) {
                                                        var177.method3812(var182, var10.field2750 / 2 + var188, var189, var10.field2825, var10.field2745 ? 0 : -1);
                                                    } else {
                                                        var177.method3811(var182, var10.field2750 + var188 - 1, var189, var10.field2825, var10.field2745 ? 0 : -1);
                                                    }
                                                }
                                                var178++;
                                            }
                                        }
                                    }
                                    if (var10.field2737 == 8 && Statics.field141 == var10 && field426 == field286) {
                                        int var190 = 0;
                                        int var191 = 0;
                                        class224 var192 = Statics.field140;
                                        String var193 = var10.field2757;
                                        String var194 = method194(var193, var10);
                                        while (var194.length() > 0) {
                                            int var195 = var194.indexOf(class2.field21);
                                            String var196;
                                            if (var195 == -1) {
                                                var196 = var194;
                                                var194 = "";
                                            } else {
                                                var196 = var194.substring(0, var195);
                                                var194 = var194.substring(var195 + 4);
                                            }
                                            int var197 = var192.method3896(var196);
                                            if (var197 > var190) {
                                                var190 = var197;
                                            }
                                            var191 += var192.field3183 + 1;
                                        }
                                        var190 += 6;
                                        var191 += 7;
                                        int var198 = var10.field2750 + var12 - 5 - var190;
                                        int var199 = var10.field2751 + var13 + 5;
                                        if (var198 < var12 + 5) {
                                            var198 = var12 + 5;
                                        }
                                        if (var190 + var198 > arg4) {
                                            var198 = arg4 - var190;
                                        }
                                        if (var191 + var199 > arg5) {
                                            var199 = arg5 - var191;
                                        }
                                        class80.method1697(var198, var199, var190, var191, 16777120);
                                        class80.method1692(var198, var199, var190, var191, 0);
                                        String var200 = var10.field2757;
                                        int var201 = var192.field3183 + var199 + 2;
                                        String var202 = method194(var200, var10);
                                        while (var202.length() > 0) {
                                            int var203 = var202.indexOf(class2.field21);
                                            String var204;
                                            if (var203 == -1) {
                                                var204 = var202;
                                                var202 = "";
                                            } else {
                                                var204 = var202.substring(0, var203);
                                                var202 = var202.substring(var203 + 4);
                                            }
                                            var192.method3809(var204, var198 + 3, var201, 0, -1);
                                            var201 += var192.field3183 + 1;
                                        }
                                    }
                                    if (var10.field2737 == 9) {
                                        if (var10.field2833 == 1) {
                                            int var205;
                                            int var206;
                                            int var207;
                                            int var208;
                                            if (var10.field2809) {
                                                var205 = var12;
                                                var206 = var10.field2751 + var13;
                                                var207 = var10.field2750 + var12;
                                                var208 = var13;
                                            } else {
                                                var205 = var12;
                                                var206 = var13;
                                                var207 = var10.field2750 + var12;
                                                var208 = var10.field2751 + var13;
                                            }
                                            class80.method1707(var205, var206, var207, var208, var10.field2825);
                                        } else {
                                            int var209 = var10.field2750 >= 0 ? var10.field2750 : -var10.field2750;
                                            int var210 = var10.field2751 >= 0 ? var10.field2751 : -var10.field2751;
                                            int var211 = var209;
                                            if (var209 < var210) {
                                                var211 = var210;
                                            }
                                            if (var211 != 0) {
                                                int var212 = (var10.field2750 << 16) / var211;
                                                int var213 = (var10.field2751 << 16) / var211;
                                                if (var213 <= var212) {
                                                    var212 = -var212;
                                                } else {
                                                    var213 = -var213;
                                                }
                                                int var214 = var10.field2833 * var213 >> 17;
                                                int var215 = var10.field2833 * var213 + 1 >> 17;
                                                int var216 = var10.field2833 * var212 >> 17;
                                                int var217 = var10.field2833 * var212 + 1 >> 17;
                                                int var218 = var12 + var214;
                                                int var219 = var12 - var215;
                                                int var220 = var10.field2750 + var12 - var215;
                                                int var221 = var10.field2750 + var12 + var214;
                                                int var222 = var13 + var216;
                                                int var223 = var13 - var217;
                                                int var224 = var10.field2751 + var13 - var217;
                                                int var225 = var10.field2751 + var13 + var216;
                                                class91.method2008(var218, var219, var220);
                                                class91.method1975(var222, var223, var224, var218, var219, var220, var10.field2825);
                                                class91.method2008(var218, var220, var221);
                                                class91.method1975(var222, var224, var225, var218, var220, var221, var10.field2825);
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

    @ObfuscatedName("r.cp(Ljava/lang/String;Lfv;I)Ljava/lang/String;")
    public static String method194(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method577(arg1, var2 - 1);
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
                if (Statics.field69 != null) {
                    var8 = class163.method2574(Statics.field69.field2203);
                    if (Statics.field69.field2205 != null) {
                        var8 = (String) Statics.field69.field2205;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("c.cw(ZI)V")
    public static final void method630(boolean arg0) {
        int var1 = field439;
        int var2 = Statics.field2049;
        int var3 = Statics.field2102;
        if (class173.method3172(var1)) {
            method2044(Statics.field2858[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("r.ca(Lfv;B)V")
    public static void method185(class173 arg0) {
        class173 var1 = arg0.field2743 == -1 ? null : class173.method1002(arg0.field2743);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2049;
            var3 = Statics.field2102;
        } else {
            var2 = var1.field2750;
            var3 = var1.field2751;
        }
        method1010(arg0, var2, var3, false);
        method183(arg0, var2, var3);
    }

    @ObfuscatedName("ay.cz([Lfv;Lfv;ZI)V")
    public static void method735(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2857 == 0 ? arg1.field2750 : arg1.field2857;
        int var4 = arg1.field2766 == 0 ? arg1.field2751 : arg1.field2766;
        method2044(arg0, arg1.field2735, var3, var4, arg2);
        if (arg1.field2807 != null) {
            method2044(arg1.field2807, arg1.field2735, var3, var4, arg2);
        }
        class4 var5 = (class4) field305.method3571((long) arg1.field2735);
        if (var5 != null) {
            int var6 = var5.field64;
            if (class173.method3172(var6)) {
                method2044(Statics.field2858[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2739 == 1337) {
        }
    }

    @ObfuscatedName("cl.cm([Lfv;IIIZI)V")
    public static void method2044(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2743 == arg1) {
                method1010(var6, arg2, arg3, arg4);
                method183(var6, arg2, arg3);
                if (var6.field2756 > var6.field2857 - var6.field2750) {
                    var6.field2756 = var6.field2857 - var6.field2750;
                }
                if (var6.field2756 < 0) {
                    var6.field2756 = 0;
                }
                if (var6.field2763 > var6.field2766 - var6.field2751) {
                    var6.field2763 = var6.field2766 - var6.field2751;
                }
                if (var6.field2763 < 0) {
                    var6.field2763 = 0;
                }
                if (var6.field2737 == 0) {
                    method735(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("aj.ch(Lfv;IIZI)V")
    public static void method1010(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2750;
        int var5 = arg0.field2751;
        if (arg0.field2742 == 0) {
            arg0.field2750 = arg0.field2861;
        } else if (arg0.field2742 == 1) {
            arg0.field2750 = arg1 - arg0.field2861;
        } else if (arg0.field2742 == 2) {
            arg0.field2750 = arg0.field2861 * arg1 >> 14;
        }
        if (arg0.field2838 == 0) {
            arg0.field2751 = arg0.field2747;
        } else if (arg0.field2838 == 1) {
            arg0.field2751 = arg2 - arg0.field2747;
        } else if (arg0.field2838 == 2) {
            arg0.field2751 = arg0.field2747 * arg2 >> 14;
        }
        if (arg0.field2742 == 4) {
            arg0.field2750 = arg0.field2752 * arg0.field2751 / arg0.field2753;
        }
        if (arg0.field2838 == 4) {
            arg0.field2751 = arg0.field2753 * arg0.field2750 / arg0.field2752;
        }
        if (field443 && arg0.field2737 == 0) {
            if (arg0.field2751 < 5 && arg0.field2750 < 5) {
                arg0.field2751 = 5;
                arg0.field2750 = 5;
            } else {
                if (arg0.field2751 <= 0) {
                    arg0.field2751 = 5;
                }
                if (arg0.field2750 <= 0) {
                    arg0.field2750 = 5;
                }
            }
        }
        if (arg0.field2739 == 1337) {
            field536 = arg0;
        }
        if (arg3 && arg0.field2842 != null && (arg0.field2750 != var4 || arg0.field2751 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field11 = arg0.field2842;
            field474.method3603(var6);
        }
    }

    @ObfuscatedName("z.cx(Lfv;III)V")
    public static void method183(class173 arg0, int arg1, int arg2) {
        if (arg0.field2740 == 0) {
            arg0.field2847 = arg0.field2744;
        } else if (arg0.field2740 == 1) {
            arg0.field2847 = (arg1 - arg0.field2750) / 2 + arg0.field2744;
        } else if (arg0.field2740 == 2) {
            arg0.field2847 = arg1 - arg0.field2750 - arg0.field2744;
        } else if (arg0.field2740 == 3) {
            arg0.field2847 = arg0.field2744 * arg1 >> 14;
        } else if (arg0.field2740 == 4) {
            arg0.field2847 = (arg0.field2744 * arg1 >> 14) + (arg1 - arg0.field2750) / 2;
        } else {
            arg0.field2847 = arg1 - arg0.field2750 - (arg0.field2744 * arg1 >> 14);
        }
        if (arg0.field2741 == 0) {
            arg0.field2749 = arg0.field2793;
        } else if (arg0.field2741 == 1) {
            arg0.field2749 = (arg2 - arg0.field2751) / 2 + arg0.field2793;
        } else if (arg0.field2741 == 2) {
            arg0.field2749 = arg2 - arg0.field2751 - arg0.field2793;
        } else if (arg0.field2741 == 3) {
            arg0.field2749 = arg0.field2793 * arg2 >> 14;
        } else if (arg0.field2741 == 4) {
            arg0.field2749 = (arg0.field2793 * arg2 >> 14) + (arg2 - arg0.field2751) / 2;
        } else {
            arg0.field2749 = arg2 - arg0.field2751 - (arg0.field2793 * arg2 >> 14);
        }
        if (!field443 || arg0.field2737 != 0) {
            return;
        }
        if (arg0.field2847 < 0) {
            arg0.field2847 = 0;
        } else if (arg0.field2847 + arg0.field2750 > arg1) {
            arg0.field2847 = arg1 - arg0.field2750;
        }
        if (arg0.field2749 < 0) {
            arg0.field2749 = 0;
        } else if (arg0.field2751 + arg0.field2749 > arg2) {
            arg0.field2749 = arg2 - arg0.field2751;
        }
    }

    @ObfuscatedName("fn.co(Lfv;I)Z")
    public static final boolean method3004(class173 arg0) {
        if (arg0.field2846 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2846.length; var1++) {
            int var2 = method577(arg0, var1);
            int var3 = arg0.field2759[var1];
            if (arg0.field2846[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2846[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2846[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("client.cf(Lfv;II)I")
    public static final int method577(class173 arg0, int arg1) {
        if (arg0.field2845 == null || arg1 >= arg0.field2845.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2845[arg1];
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
                    var7 = field412[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field413[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field348[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method1002(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method154(var12).field1113 || field282)) {
                        for (int var13 = 0; var13 < var11.field2851.length; var13++) {
                            if (var12 + 1 == var11.field2851[var13]) {
                                var7 += var11.field2852[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2885[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2286[field413[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2885[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field13.field54;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2282[var14]) {
                            var7 += field413[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method1002(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method154(var18).field1113 || field282)) {
                        for (int var19 = 0; var19 < var17.field2851.length; var19++) {
                            if (var18 + 1 == var17.field2851[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field440;
                }
                if (var6 == 12) {
                    var7 = field432;
                }
                if (var6 == 13) {
                    int var20 = class176.field2885[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method2999(var22);
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
                    var7 = (Statics.field13.field847 >> 7) + Statics.field1054;
                }
                if (var6 == 19) {
                    var7 = (Statics.field13.field835 >> 7) + Statics.field2630;
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

    @ObfuscatedName("ar.cg(Lfv;III)V")
    public static final void method829(class173 arg0, int arg1, int arg2) {
        if (arg0.field2738 == 1) {
            method665(arg0.field2850, "", 24, 0, 0, arg0.field2735);
        }
        if (arg0.field2738 == 2 && !field547) {
            int var3 = method122(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2812 == null || arg0.field2812.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2812;
            }
            if (var5 != null) {
                method665(var5, class2.method1505(65280) + arg0.field2849, 25, 0, -1, arg0.field2735);
            }
        }
        if (arg0.field2738 == 3) {
            method665(class157.field2364, "", 26, 0, 0, arg0.field2735);
        }
        if (arg0.field2738 == 4) {
            method665(arg0.field2850, "", 28, 0, 0, arg0.field2735);
        }
        if (arg0.field2738 == 5) {
            method665(arg0.field2850, "", 29, 0, 0, arg0.field2735);
        }
        if (arg0.field2738 == 6 && field546 == null) {
            method665(arg0.field2850, "", 30, 0, -1, arg0.field2735);
        }
        if (arg0.field2737 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2751; var8++) {
                for (int var9 = 0; var9 < arg0.field2750; var9++) {
                    int var10 = (arg0.field2762 + 32) * var9;
                    int var11 = (arg0.field2800 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2801[var7];
                        var11 += arg0.field2802[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field394 = var7;
                        Statics.field679 = arg0;
                        if (arg0.field2851[var7] > 0) {
                            class52 var12 = class52.method154(arg0.field2851[var7] - 1);
                            if (field399 == 1 && class178.method1017(method122(arg0))) {
                                if (Statics.field1661 != arg0.field2735 || Statics.field3156 != var7) {
                                    method665(class157.field2327, field429 + " " + class2.field24 + " " + class2.method1505(16748608) + var12.field1100, 31, var12.field1098, var7, arg0.field2735);
                                }
                            } else if (!field547 || !class178.method1017(method122(arg0))) {
                                String[] var13 = var12.field1117;
                                if (field375) {
                                    var13 = method2941(var13);
                                }
                                if (class178.method1017(method122(arg0))) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            method665(var13[var14], class2.method1505(16748608) + var12.field1100, var15, var12.field1098, var7, arg0.field2735);
                                        } else if (var14 == 4) {
                                            method665(class157.field2420, class2.method1505(16748608) + var12.field1100, 37, var12.field1098, var7, arg0.field2735);
                                        }
                                    }
                                }
                                int var16 = method122(arg0);
                                boolean var17 = (var16 >> 31 & 0x1) != 0;
                                if (var17) {
                                    method665(class157.field2327, class2.method1505(16748608) + var12.field1100, 38, var12.field1098, var7, arg0.field2735);
                                }
                                class178 var10000 = (class178) null;
                                if (class178.method1017(method122(arg0)) && var13 != null) {
                                    for (int var18 = 2; var18 >= 0; var18--) {
                                        if (var13[var18] != null) {
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
                                            method665(var13[var18], class2.method1505(16748608) + var12.field1100, var19, var12.field1098, var7, arg0.field2735);
                                        }
                                    }
                                }
                                String[] var20 = arg0.field2804;
                                if (field375) {
                                    var20 = method2941(var20);
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
                                            method665(var20[var21], class2.method1505(16748608) + var12.field1100, var22, var12.field1098, var7, arg0.field2735);
                                        }
                                    }
                                }
                                method665(class157.field2449, class2.method1505(16748608) + var12.field1100, 1005, var12.field1098, var7, arg0.field2735);
                            } else if ((Statics.field2125 & 0x10) == 16) {
                                method665(field433, field434 + " " + class2.field24 + " " + class2.method1505(16748608) + var12.field1100, 32, var12.field1098, var7, arg0.field2735);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2734) {
            return;
        }
        if (!field547) {
            for (int var23 = 9; var23 >= 5; var23--) {
                String var24 = Statics.method155(arg0, var23);
                if (var24 != null) {
                    method665(var24, arg0.field2806, 1007, var23 + 1, arg0.field2736, arg0.field2735);
                }
            }
            int var25 = method122(arg0);
            int var26 = var25 >> 11 & 0x3F;
            String var27;
            if (var26 == 0) {
                var27 = null;
            } else if (arg0.field2812 == null || arg0.field2812.trim().length() == 0) {
                var27 = null;
            } else {
                var27 = arg0.field2812;
            }
            if (var27 != null) {
                method665(var27, arg0.field2806, 25, 0, arg0.field2736, arg0.field2735);
            }
            for (int var29 = 4; var29 >= 0; var29--) {
                String var30 = Statics.method155(arg0, var29);
                if (var30 != null) {
                    method665(var30, arg0.field2806, 57, var29 + 1, arg0.field2736, arg0.field2735);
                }
            }
            if (class178.method2797(method122(arg0))) {
                method665(class157.field2312, "", 30, 0, arg0.field2736, arg0.field2735);
            }
        } else if (class178.method746(method122(arg0)) && (Statics.field2125 & 0x20) == 32) {
            method665(field433, field434 + " " + class2.field24 + " " + arg0.field2806, 58, 0, arg0.field2736, arg0.field2735);
        }
    }

    @ObfuscatedName("gh.cr(IIIIIIII)V")
    public static final void method3533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class173.method3172(arg0)) {
            method212(Statics.field2858[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("y.cj([Lfv;IIIIIIIB)V")
    public static final void method212(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2734 || var9.field2737 == 0 || var9.field2813 || method122(var9) != 0 || field449 == var9 || var9.field2739 == 1338) && var9.field2743 == arg1 && (!var9.field2734 || !method2973(var9))) {
                int var10 = var9.field2847 + arg6;
                int var11 = var9.field2749 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2737 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2737 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2750 + var10;
                    int var19 = var9.field2751 + var11;
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
                    int var22 = var9.field2750 + var10;
                    int var23 = var9.field2751 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field448 == var9) {
                    field456 = true;
                    field457 = var10;
                    field458 = var11;
                }
                if (!var9.field2734 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2135;
                    int var25 = class140.field2136;
                    if (class140.field2141 != 0) {
                        var24 = class140.field2131;
                        var25 = class140.field2143;
                    }
                    if (var9.field2739 == 1337) {
                        if (!field533 && !field501 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method770(var24, var25, var12, var13);
                        }
                    } else if (var9.field2739 != 1338) {
                        if (!field501 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method829(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2737 == 0) {
                            if (!var9.field2734 && method2973(var9) && Statics.field66 != var9) {
                                continue;
                            }
                            method212(arg0, var9.field2735, var12, var13, var14, var15, var10 - var9.field2756, var11 - var9.field2763);
                            if (var9.field2807 != null) {
                                method212(var9.field2807, var9.field2735, var12, var13, var14, var15, var10 - var9.field2756, var11 - var9.field2763);
                            }
                            class4 var40 = (class4) field305.method3571((long) var9.field2735);
                            if (var40 != null) {
                                if (var40.field62 == 0 && class140.field2135 >= var12 && class140.field2136 >= var13 && class140.field2135 < var14 && class140.field2136 < var15 && !field501 && !field443) {
                                    for (class1 var41 = (class1) field474.method3606(); var41 != null; var41 = (class1) field474.method3608()) {
                                        if (var41.field2) {
                                            var41.method3700();
                                            var41.field3.field2860 = false;
                                        }
                                    }
                                    if (Statics.field626 == 0) {
                                        field448 = null;
                                        field449 = null;
                                    }
                                    if (!field501) {
                                        field298[0] = class157.field2534;
                                        field423[0] = "";
                                        field420[0] = 1006;
                                        field417 = 1;
                                    }
                                }
                                method3533(var40.field64, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2734) {
                            if (var9.field2866) {
                                if (class140.field2135 >= var12 && class140.field2136 >= var13 && class140.field2135 < var14 && class140.field2136 < var15) {
                                    for (class1 var42 = (class1) field474.method3606(); var42 != null; var42 = (class1) field474.method3608()) {
                                        if (var42.field2) {
                                            var42.method3700();
                                            var42.field3.field2860 = false;
                                        }
                                    }
                                    if (Statics.field626 == 0) {
                                        field448 = null;
                                        field449 = null;
                                    }
                                    if (!field501) {
                                        field298[0] = class157.field2534;
                                        field423[0] = "";
                                        field420[0] = 1006;
                                        field417 = 1;
                                    }
                                }
                            } else if (var9.field2748 && class140.field2135 >= var12 && class140.field2136 >= var13 && class140.field2135 < var14 && class140.field2136 < var15) {
                                for (class1 var43 = (class1) field474.method3606(); var43 != null; var43 = (class1) field474.method3608()) {
                                    if (var43.field2 && var43.field3.field2808 == var43.field11) {
                                        var43.method3700();
                                    }
                                }
                            }
                            boolean var44;
                            if (class140.field2135 >= var12 && class140.field2136 >= var13 && class140.field2135 < var14 && class140.field2136 < var15) {
                                var44 = true;
                            } else {
                                var44 = false;
                            }
                            boolean var45 = false;
                            if ((class140.field2134 == 1 || !Statics.field753 && class140.field2134 == 4) && var44) {
                                var45 = true;
                            }
                            boolean var46 = false;
                            if ((class140.field2141 == 1 || !Statics.field753 && class140.field2141 == 4) && class140.field2131 >= var12 && class140.field2143 >= var13 && class140.field2131 < var14 && class140.field2143 < var15) {
                                var46 = true;
                            }
                            if (var46) {
                                method616(var9, class140.field2131 - var10, class140.field2143 - var11);
                            }
                            if (field448 != null && field448 != var9 && var44 && class178.method694(method122(var9))) {
                                field452 = var9;
                            }
                            if (field449 == var9) {
                                field453 = true;
                                field454 = var10;
                                field455 = var11;
                            }
                            if (var9.field2813) {
                                if (var44 && field473 != 0 && var9.field2808 != null) {
                                    class1 var47 = new class1();
                                    var47.field2 = true;
                                    var47.field3 = var9;
                                    var47.field5 = field473;
                                    var47.field11 = var9.field2808;
                                    field474.method3603(var47);
                                }
                                if (field448 != null || Statics.field27 != null || field501) {
                                    var46 = false;
                                    var45 = false;
                                    var44 = false;
                                }
                                if (!var9.field2831 && var46) {
                                    var9.field2831 = true;
                                    if (var9.field2815 != null) {
                                        class1 var48 = new class1();
                                        var48.field2 = true;
                                        var48.field3 = var9;
                                        var48.field4 = class140.field2131 - var10;
                                        var48.field5 = class140.field2143 - var11;
                                        var48.field11 = var9.field2815;
                                        field474.method3603(var48);
                                    }
                                }
                                if (var9.field2831 && var45 && var9.field2816 != null) {
                                    class1 var49 = new class1();
                                    var49.field2 = true;
                                    var49.field3 = var9;
                                    var49.field4 = class140.field2135 - var10;
                                    var49.field5 = class140.field2136 - var11;
                                    var49.field11 = var9.field2816;
                                    field474.method3603(var49);
                                }
                                if (var9.field2831 && !var45) {
                                    var9.field2831 = false;
                                    if (var9.field2856 != null) {
                                        class1 var50 = new class1();
                                        var50.field2 = true;
                                        var50.field3 = var9;
                                        var50.field4 = class140.field2135 - var10;
                                        var50.field5 = class140.field2136 - var11;
                                        var50.field11 = var9.field2856;
                                        field476.method3603(var50);
                                    }
                                }
                                if (var45 && var9.field2818 != null) {
                                    class1 var51 = new class1();
                                    var51.field2 = true;
                                    var51.field3 = var9;
                                    var51.field4 = class140.field2135 - var10;
                                    var51.field5 = class140.field2136 - var11;
                                    var51.field11 = var9.field2818;
                                    field474.method3603(var51);
                                }
                                if (!var9.field2860 && var44) {
                                    var9.field2860 = true;
                                    if (var9.field2760 != null) {
                                        class1 var52 = new class1();
                                        var52.field2 = true;
                                        var52.field3 = var9;
                                        var52.field4 = class140.field2135 - var10;
                                        var52.field5 = class140.field2136 - var11;
                                        var52.field11 = var9.field2760;
                                        field474.method3603(var52);
                                    }
                                }
                                if (var9.field2860 && var44 && var9.field2799 != null) {
                                    class1 var53 = new class1();
                                    var53.field2 = true;
                                    var53.field3 = var9;
                                    var53.field4 = class140.field2135 - var10;
                                    var53.field5 = class140.field2136 - var11;
                                    var53.field11 = var9.field2799;
                                    field474.method3603(var53);
                                }
                                if (var9.field2860 && !var44) {
                                    var9.field2860 = false;
                                    if (var9.field2821 != null) {
                                        class1 var54 = new class1();
                                        var54.field2 = true;
                                        var54.field3 = var9;
                                        var54.field4 = class140.field2135 - var10;
                                        var54.field5 = class140.field2136 - var11;
                                        var54.field11 = var9.field2821;
                                        field476.method3603(var54);
                                    }
                                }
                                if (var9.field2832 != null) {
                                    class1 var55 = new class1();
                                    var55.field3 = var9;
                                    var55.field11 = var9.field2832;
                                    field358.method3603(var55);
                                }
                                if (var9.field2826 != null && field462 > var9.field2765) {
                                    if (var9.field2827 == null || field462 - var9.field2765 > 32) {
                                        class1 var60 = new class1();
                                        var60.field3 = var9;
                                        var60.field11 = var9.field2826;
                                        field474.method3603(var60);
                                    } else {
                                        label584: for (int var56 = var9.field2765; var56 < field462; var56++) {
                                            int var57 = field461[var56 & 0x1F];
                                            for (int var58 = 0; var58 < var9.field2827.length; var58++) {
                                                if (var9.field2827[var58] == var57) {
                                                    class1 var59 = new class1();
                                                    var59.field3 = var9;
                                                    var59.field11 = var9.field2826;
                                                    field474.method3603(var59);
                                                    break label584;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2765 = field462;
                                }
                                if (var9.field2828 != null && field531 > var9.field2862) {
                                    if (var9.field2758 == null || field531 - var9.field2862 > 32) {
                                        class1 var65 = new class1();
                                        var65.field3 = var9;
                                        var65.field11 = var9.field2828;
                                        field474.method3603(var65);
                                    } else {
                                        label560: for (int var61 = var9.field2862; var61 < field531; var61++) {
                                            int var62 = field509[var61 & 0x1F];
                                            for (int var63 = 0; var63 < var9.field2758.length; var63++) {
                                                if (var9.field2758[var63] == var62) {
                                                    class1 var64 = new class1();
                                                    var64.field3 = var9;
                                                    var64.field11 = var9.field2828;
                                                    field474.method3603(var64);
                                                    break label560;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2862 = field531;
                                }
                                if (var9.field2830 != null && field466 > var9.field2863) {
                                    if (var9.field2795 == null || field466 - var9.field2863 > 32) {
                                        class1 var70 = new class1();
                                        var70.field3 = var9;
                                        var70.field11 = var9.field2830;
                                        field474.method3603(var70);
                                    } else {
                                        label536: for (int var66 = var9.field2863; var66 < field466; var66++) {
                                            int var67 = field465[var66 & 0x1F];
                                            for (int var68 = 0; var68 < var9.field2795.length; var68++) {
                                                if (var9.field2795[var68] == var67) {
                                                    class1 var69 = new class1();
                                                    var69.field3 = var9;
                                                    var69.field11 = var9.field2830;
                                                    field474.method3603(var69);
                                                    break label536;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2863 = field466;
                                }
                                if (field467 > var9.field2819 && var9.field2835 != null) {
                                    class1 var71 = new class1();
                                    var71.field3 = var9;
                                    var71.field11 = var9.field2835;
                                    field474.method3603(var71);
                                }
                                if (field459 > var9.field2819 && var9.field2837 != null) {
                                    class1 var72 = new class1();
                                    var72.field3 = var9;
                                    var72.field11 = var9.field2837;
                                    field474.method3603(var72);
                                }
                                if (field469 > var9.field2819 && var9.field2755 != null) {
                                    class1 var73 = new class1();
                                    var73.field3 = var9;
                                    var73.field11 = var9.field2755;
                                    field474.method3603(var73);
                                }
                                if (field470 > var9.field2819 && var9.field2843 != null) {
                                    class1 var74 = new class1();
                                    var74.field3 = var9;
                                    var74.field11 = var9.field2843;
                                    field474.method3603(var74);
                                }
                                if (field471 > var9.field2819 && var9.field2844 != null) {
                                    class1 var75 = new class1();
                                    var75.field3 = var9;
                                    var75.field11 = var9.field2844;
                                    field474.method3603(var75);
                                }
                                if (field472 > var9.field2819 && var9.field2839 != null) {
                                    class1 var76 = new class1();
                                    var76.field3 = var9;
                                    var76.field11 = var9.field2839;
                                    field474.method3603(var76);
                                }
                                var9.field2819 = field460;
                                if (var9.field2733 != null) {
                                    for (int var77 = 0; var77 < field498; var77++) {
                                        class1 var78 = new class1();
                                        var78.field3 = var9;
                                        var78.field8 = field496[var77];
                                        var78.field9 = field499[var77];
                                        var78.field11 = var9.field2733;
                                        field474.method3603(var78);
                                    }
                                }
                            }
                        }
                        if (!var9.field2734 && field448 == null && Statics.field27 == null && !field501) {
                            if ((var9.field2848 >= 0 || var9.field2814 != 0) && class140.field2135 >= var12 && class140.field2136 >= var13 && class140.field2135 < var14 && class140.field2136 < var15) {
                                if (var9.field2848 >= 0) {
                                    Statics.field66 = arg0[var9.field2848];
                                } else {
                                    Statics.field66 = var9;
                                }
                            }
                            if (var9.field2737 == 8 && class140.field2135 >= var12 && class140.field2136 >= var13 && class140.field2135 < var14 && class140.field2136 < var15) {
                                Statics.field141 = var9;
                            }
                            if (var9.field2766 > var9.field2751) {
                                int var79 = var9.field2750 + var10;
                                int var80 = var9.field2751;
                                int var81 = var9.field2766;
                                int var82 = class140.field2135;
                                int var83 = class140.field2136;
                                if (field359) {
                                    field360 = 32;
                                } else {
                                    field360 = 0;
                                }
                                field359 = false;
                                if (class140.field2134 == 1 || !Statics.field753 && class140.field2134 == 4) {
                                    if (var82 >= var79 && var82 < var79 + 16 && var83 >= var11 && var83 < var11 + 16) {
                                        var9.field2763 -= 4;
                                        method908(var9);
                                    } else if (var82 >= var79 && var82 < var79 + 16 && var83 >= var11 + var80 - 16 && var83 < var11 + var80) {
                                        var9.field2763 += 4;
                                        method908(var9);
                                    } else if (var82 >= var79 - field360 && var82 < field360 + var79 + 16 && var83 >= var11 + 16 && var83 < var11 + var80 - 16) {
                                        int var84 = (var80 - 32) * var80 / var81;
                                        if (var84 < 8) {
                                            var84 = 8;
                                        }
                                        int var85 = var83 - var11 - 16 - var84 / 2;
                                        int var86 = var80 - 32 - var84;
                                        var9.field2763 = (var81 - var80) * var85 / var86;
                                        method908(var9);
                                        field359 = true;
                                    }
                                }
                                if (field473 != 0) {
                                    int var87 = var9.field2750;
                                    if (var82 >= var79 - var87 && var83 >= var11 && var82 < var79 + 16 && var83 <= var11 + var80) {
                                        var9.field2763 += field473 * 45;
                                        method908(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field511 == 0 || field511 == 3) && (class140.field2141 == 1 || !Statics.field753 && class140.field2141 == 4)) {
                        class175 var26 = var9.method3227(true);
                        if (var26 != null) {
                            int var27 = class140.field2131 - var10;
                            int var28 = class140.field2143 - var11;
                            if (var26.method3273(var27, var28)) {
                                int var29 = var27 - var26.field2883 / 2;
                                int var30 = var28 - var26.field2878 / 2;
                                int var31 = field435 + field347 & 0x7FF;
                                int var32 = class91.field1572[var31];
                                int var33 = class91.field1574[var31];
                                int var34 = (field349 + 256) * var32 >> 8;
                                int var35 = (field349 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field13.field847 + var36 >> 7;
                                int var39 = Statics.field13.field835 - var37 >> 7;
                                field319.method2621(171);
                                field319.method2357(18);
                                field319.method2358(Statics.field2630 + var39);
                                field319.method2468(class137.field2115[82] ? (class137.field2115[81] ? 2 : 1) : 0);
                                field319.method2566(Statics.field1054 + var38);
                                field319.method2357(var29);
                                field319.method2357(var30);
                                field319.method2358(field435);
                                field319.method2357(57);
                                field319.method2357(field347);
                                field319.method2357(field349);
                                field319.method2357(89);
                                field319.method2358(Statics.field13.field847);
                                field319.method2358(Statics.field13.field835);
                                field319.method2357(63);
                                field538 = var38;
                                field295 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.cd(III)V")
    public static final void method189(int arg0, int arg1) {
        if (class173.method3172(arg0)) {
            method178(Statics.field2858[arg0], arg1);
        }
    }

    @ObfuscatedName("e.cl([Lfv;II)V")
    public static final void method178(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2737 == 0) {
                    if (var3.field2807 != null) {
                        method178(var3.field2807, arg1);
                    }
                    class4 var4 = (class4) field305.method3571((long) var3.field2735);
                    if (var4 != null) {
                        method189(var4.field64, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2836 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field11 = var3.field2836;
                    class37.method3221(var5);
                }
                if (arg1 == 1 && var3.field2841 != null) {
                    if (var3.field2736 >= 0) {
                        class173 var6 = class173.method1002(var3.field2735);
                        if (var6 == null || var6.field2807 == null || var3.field2736 >= var6.field2807.length || var6.field2807[var3.field2736] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field11 = var3.field2841;
                    class37.method3221(var7);
                }
            }
        }
    }

    @ObfuscatedName("o.ce(Lfv;III)V")
    public static final void method616(class173 arg0, int arg1, int arg2) {
        if (field448 != null || field501 || arg0 == null || method680(arg0) == null) {
            return;
        }
        field448 = arg0;
        class173 var3 = method2978(arg0);
        if (var3 == null) {
            var3 = arg0.field2776;
        }
        field449 = var3;
        field450 = arg1;
        field451 = arg2;
        Statics.field626 = 0;
        field518 = false;
        if (field417 > 0) {
            method3291(field417 - 1);
        }
    }

    @ObfuscatedName("cv.ct(I)V")
    public static final void method2162() {
        method908(field448);
        Statics.field626++;
        if (field456 && field453) {
            int var0 = class140.field2135;
            int var1 = class140.field2136;
            int var2 = var0 - field450;
            int var3 = var1 - field451;
            if (var2 < field454) {
                var2 = field454;
            }
            if (field448.field2750 + var2 > field454 + field449.field2750) {
                var2 = field454 + field449.field2750 - field448.field2750;
            }
            if (var3 < field455) {
                var3 = field455;
            }
            if (field448.field2751 + var3 > field455 + field449.field2751) {
                var3 = field455 + field449.field2751 - field448.field2751;
            }
            int var4 = var2 - field457;
            int var5 = var3 - field458;
            int var6 = field448.field2805;
            if (Statics.field626 > field448.field2810 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field518 = true;
            }
            int var7 = field449.field2756 + (var2 - field454);
            int var8 = field449.field2763 + (var3 - field455);
            if (field448.field2822 != null && field518) {
                class1 var9 = new class1();
                var9.field3 = field448;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field11 = field448.field2822;
                class37.method3221(var9);
            }
            if (class140.field2134 == 0) {
                if (field518) {
                    if (field448.field2823 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field448;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field16 = field452;
                        var10.field11 = field448.field2823;
                        class37.method3221(var10);
                    }
                    if (field452 != null && method2978(field448) != null) {
                        field319.method2621(190);
                        field319.method2403(field448.field2853);
                        field319.method2403(field452.field2853);
                        field319.method2566(field448.field2736);
                        field319.method2413(field452.field2735);
                        field319.method2360(field448.field2735);
                        field319.method2358(field452.field2736);
                    }
                } else {
                    label99: {
                        label72: {
                            if (field415 != 1) {
                                int var11 = field417 - 1;
                                boolean var12;
                                if (var11 < 0) {
                                    var12 = false;
                                } else {
                                    int var13 = field420[var11];
                                    if (var13 >= 2000) {
                                        var13 -= 2000;
                                    }
                                    if (var13 == 1007) {
                                        var12 = true;
                                    } else {
                                        var12 = false;
                                    }
                                }
                                if (!var12) {
                                    break label72;
                                }
                            }
                            if (field417 > 2) {
                                method2977(field457 + field450, field458 + field451);
                                break label99;
                            }
                        }
                        if (field417 > 0) {
                            int var14 = field457 + field450;
                            int var15 = field458 + field451;
                            method2171(Statics.field2626, var14, var15);
                            Statics.field2626 = null;
                        }
                    }
                }
                field448 = null;
            }
        } else if (Statics.field626 > 1) {
            field448 = null;
        }
    }

    @ObfuscatedName("fy.cc(II)V")
    public static void method3291(int arg0) {
        Statics.field2626 = new class31();
        Statics.field2626.field689 = field418[arg0];
        Statics.field2626.field681 = field419[arg0];
        Statics.field2626.field682 = field420[arg0];
        Statics.field2626.field687 = field416[arg0];
        Statics.field2626.field684 = field298[arg0];
    }

    @ObfuscatedName("ak.ck(Lfv;B)V")
    public static void method908(class173 arg0) {
        if (field479 == arg0.field2834) {
            field371[arg0.field2864] = true;
        }
    }

    @ObfuscatedName("bc.cn(B)V")
    public static void method1208() {
        for (class4 var0 = (class4) field305.method3570(); var0 != null; var0 = (class4) field305.method3575()) {
            int var1 = var0.field64;
            if (class173.method3172(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2858[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2734;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3105;
                    class173 var6 = class173.method1002(var5);
                    if (var6 != null) {
                        method908(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.cy(Lfv;B)Lfv;")
    public static class173 method680(class173 arg0) {
        class173 var1 = method2978(arg0);
        if (var1 == null) {
            var1 = arg0.field2776;
        }
        return var1;
    }

    @ObfuscatedName("eb.cu([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2941(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ag.cs(II)V")
    public static final void method922(int arg0) {
        if (!class173.method3172(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2858[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2855 = 0;
                var3.field2774 = 0;
            }
        }
    }

    @ObfuscatedName("dq.cv([Lfv;II)V")
    public static final void method2307(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2743 == arg1 && (!var3.field2734 || !method2973(var3))) {
                if (var3.field2737 == 0) {
                    if (!var3.field2734 && method2973(var3) && Statics.field66 != var3) {
                        continue;
                    }
                    method2307(arg0, var3.field2735);
                    if (var3.field2807 != null) {
                        method2307(var3.field2807, var3.field2735);
                    }
                    class4 var4 = (class4) field305.method3571((long) var3.field2735);
                    if (var4 != null) {
                        int var5 = var4.field64;
                        if (class173.method3172(var5)) {
                            method2307(Statics.field2858[var5], -1);
                        }
                    }
                }
                if (var3.field2737 == 6) {
                    if (var3.field2803 != -1 || var3.field2781 != -1) {
                        boolean var6 = method3004(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2781;
                        } else {
                            var7 = var3.field2803;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method575(var7);
                            var3.field2774 += field421;
                            while (var3.field2774 > var8.field976[var3.field2855]) {
                                var3.field2774 -= var8.field976[var3.field2855];
                                var3.field2855++;
                                if (var3.field2855 >= var8.field974.length) {
                                    var3.field2855 -= var8.field978;
                                    if (var3.field2855 < 0 || var3.field2855 >= var8.field974.length) {
                                        var3.field2855 = 0;
                                    }
                                }
                                method908(var3);
                            }
                        }
                    }
                    if (var3.field2798 != 0 && !var3.field2734) {
                        int var9 = var3.field2798 >> 16;
                        int var10 = var3.field2798 << 16 >> 16;
                        int var11 = field421 * var9;
                        int var12 = field421 * var10;
                        var3.field2784 = var3.field2784 + var11 & 0x7FF;
                        var3.field2761 = var3.field2761 + var12 & 0x7FF;
                        method908(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.ci(II)V")
    public static final void method2724(int arg0) {
        method1208();
        class24.method2738();
        class53 var1 = (class53) class53.field1145.method3543((long) arg0);
        class53 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1150.method3124(16, arg0);
            class53 var4 = new class53();
            if (var3 != null) {
                var4.method1083(new class119(var3));
            }
            class53.field1145.method3540(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1146;
        if (var5 == 0) {
            return;
        }
        int var6 = class176.field2885[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class91.method2011(0.9D);
                ((class95) Statics.field1570).method2046(0.9D);
            }
            if (var6 == 2) {
                class91.method2011(0.8D);
                ((class95) Statics.field1570).method2046(0.8D);
            }
            if (var6 == 3) {
                class91.method2011(0.7D);
                ((class95) Statics.field1570).method2046(0.7D);
            }
            if (var6 == 4) {
                class91.method2011(0.6D);
                ((class95) Statics.field1570).method2046(0.6D);
            }
            class52.field1096.method3541();
        }
        if (var5 == 3) {
            short var7 = 0;
            if (var6 == 0) {
                var7 = 255;
            }
            if (var6 == 1) {
                var7 = 192;
            }
            if (var6 == 2) {
                var7 = 128;
            }
            if (var6 == 3) {
                var7 = 64;
            }
            if (var6 == 4) {
                var7 = 0;
            }
            if (field544 != var7) {
                if (field544 == 0 && field513 != -1) {
                    class183.method869(Statics.field2166, field513, 0, var7, false);
                    field514 = false;
                } else if (var7 == 0) {
                    Statics.field2944.method3421();
                    class183.field2941 = 1;
                    Statics.field3039 = null;
                    field514 = false;
                } else if (class183.field2941 == 0) {
                    Statics.field2944.method3415(var7);
                } else {
                    Statics.field2943 = var7;
                }
                field544 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field515 = 127;
            }
            if (var6 == 1) {
                field515 = 96;
            }
            if (var6 == 2) {
                field515 = 64;
            }
            if (var6 == 3) {
                field515 = 32;
            }
            if (var6 == 4) {
                field515 = 0;
            }
        }
        if (var5 == 5) {
            field415 = var6;
        }
        if (var5 == 6) {
            field437 = var6;
        }
        if (var5 == 9) {
            field294 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field516 = 127;
            }
            if (var6 == 1) {
                field516 = 96;
            }
            if (var6 == 2) {
                field516 = 64;
            }
            if (var6 == 3) {
                field516 = 32;
            }
            if (var6 == 4) {
                field516 = 0;
            }
        }
        if (var5 == 17) {
            field464 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            field277 = (class21) Statics.method625(class21.method2158(), var6);
            if (field277 == null) {
                field277 = class21.field560;
            }
        }
        if (var5 == 19) {
            if (var6 == -1) {
                field407 = -1;
            } else {
                field407 = var6 & 0x7FF;
            }
        }
        if (var5 == 22) {
            field304 = (class21) Statics.method625(class21.method2158(), var6);
            if (field304 == null) {
                field304 = class21.field560;
            }
        }
    }

    @ObfuscatedName("dx.da(Lfv;B)V")
    public static final void method2692(class173 arg0) {
        int var1 = arg0.field2739;
        if (var1 == 324) {
            if (field549 == -1) {
                field549 = arg0.field2867;
                field550 = arg0.field2769;
            }
            if (field548.field2901) {
                arg0.field2867 = field549;
            } else {
                arg0.field2867 = field550;
            }
        } else if (var1 == 325) {
            if (field549 == -1) {
                field549 = arg0.field2867;
                field550 = arg0.field2769;
            }
            if (field548.field2901) {
                arg0.field2867 = field550;
            } else {
                arg0.field2867 = field549;
            }
        } else if (var1 == 327) {
            arg0.field2784 = 150;
            arg0.field2761 = (int) (Math.sin((double) field287 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2778 = 5;
            arg0.field2777 = 0;
        } else if (var1 == 328) {
            arg0.field2784 = 150;
            arg0.field2761 = (int) (Math.sin((double) field287 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2778 = 5;
            arg0.field2777 = 1;
        }
    }

    @ObfuscatedName("q.dt(B)V")
    public static final void method587() {
        field319.method2621(254);
        for (class4 var0 = (class4) field305.method3570(); var0 != null; var0 = (class4) field305.method3575()) {
            if (var0.field62 == 0 || var0.field62 == 3) {
                method121(var0, true);
            }
        }
        if (field546 != null) {
            method908(field546);
            field546 = null;
        }
    }

    @ObfuscatedName("i.db(Ll;ZB)V")
    public static final void method121(class4 arg0, boolean arg1) {
        int var2 = arg0.field64;
        int var3 = (int) arg0.field3105;
        arg0.method3700();
        if (arg1) {
            class173.method2616(var2);
        }
        method180(var2);
        class173 var4 = class173.method1002(var3);
        if (var4 != null) {
            method908(var4);
        }
        for (int var5 = 0; var5 < field417; var5++) {
            if (method2611(field420[var5])) {
                if (var5 < field417 - 1) {
                    for (int var6 = var5; var6 < field417 - 1; var6++) {
                        field298[var6] = field298[var6 + 1];
                        field423[var6] = field423[var6 + 1];
                        field420[var6] = field420[var6 + 1];
                        field416[var6] = field416[var6 + 1];
                        field418[var6] = field418[var6 + 1];
                        field419[var6] = field419[var6 + 1];
                    }
                }
                field417--;
            }
        }
        if (field439 != -1) {
            method189(field439, 1);
        }
    }

    @ObfuscatedName("eh.dh(Lfv;B)Z")
    public static final boolean method2962(class173 arg0) {
        int var1 = arg0.field2739;
        if (var1 == 205) {
            field401 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field548.method3301(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field548.method3307(var4, var5 == 1);
        }
        if (var1 == 324) {
            field548.method3303(false);
        }
        if (var1 == 325) {
            field548.method3303(true);
        }
        if (var1 == 326) {
            field319.method2621(207);
            field548.method3304(field319);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.do(Lfv;IIII)V")
    public static final void method136(class173 arg0, int arg1, int arg2, int arg3) {
        class175 var4 = arg0.method3227(false);
        if (var4 == null) {
            return;
        }
        if (field511 < 3) {
            Statics.field564.method1616(arg1, arg2, var4.field2883, var4.field2878, 25, 25, field435, 256, var4.field2880, var4.field2879);
        } else {
            class80.method1695(arg1, arg2, 0, var4.field2880, var4.field2879);
        }
    }

    @ObfuscatedName("e.dz(IIIILcq;Lfh;I)V")
    public static final void method179(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method149(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field435 + field347 & 0x7FF;
        int var8 = class91.field1572[var7];
        int var9 = class91.field1574[var7];
        int var10 = var8 * 256 / (field349 + 256);
        int var11 = var9 * 256 / (field349 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field602.method1618(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("k.dr(IIIILcq;Lfh;I)V")
    public static final void method149(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field435 + field347 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1572[var6];
        int var9 = class91.field1574[var6];
        int var10 = var8 * 256 / (field349 + 256);
        int var11 = var9 * 256 / (field349 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1648(arg5.field2883 / 2 + var12 - arg4.field1389 / 2, arg5.field2878 / 2 - var13 - arg4.field1400 / 2, arg0, arg1, arg5.field2883, arg5.field2878, arg5.field2880, arg5.field2879);
        } else {
            arg4.method1607(arg5.field2883 / 2 + arg0 + var12 - arg4.field1389 / 2, arg5.field2878 / 2 + arg1 - var13 - arg4.field1400 / 2);
        }
    }

    @ObfuscatedName("t.dn(Ljava/lang/String;ZI)Z")
    public static boolean method134(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method2834(arg0, Statics.field281);
        for (int var3 = 0; var3 < field542; var3++) {
            if (var2.equalsIgnoreCase(class164.method2834(field411[var3].field238, Statics.field281)) && (!arg1 || field411[var3].field239 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method2834(Statics.field13.field35, Statics.field281))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ar.dl(Ljava/lang/String;B)Z")
    public static boolean method847(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method2834(arg0, Statics.field281);
        for (int var2 = 0; var2 < field355; var2++) {
            class8 var3 = field446[var2];
            if (var1.equalsIgnoreCase(class164.method2834(var3.field131, Statics.field281))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method2834(var3.field127, Statics.field281))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("at.dv(Ljava/lang/String;I)V")
    public static final void method766(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method2834(arg0, Statics.field281);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field355; var2++) {
            class8 var3 = field446[var2];
            String var4 = var3.field131;
            String var5 = class164.method2834(var4, Statics.field281);
            if (class129.method990(arg0, var1, var4, var5)) {
                field355--;
                for (int var6 = var2; var6 < field355; var6++) {
                    field446[var6] = field446[var6 + 1];
                }
                field459 = field460;
                field319.method2621(144);
                field319.method2357(class119.method2163(arg0));
                field319.method2363(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("e.dd(II)V")
    public static void method180(int arg0) {
        for (class201 var1 = (class201) field477.method3570(); var1 != null; var1 = (class201) field477.method3575()) {
            if ((var1.field3105 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3700();
            }
        }
    }

    @ObfuscatedName("i.dq(Lfv;S)I")
    public static int method122(class173 arg0) {
        class201 var1 = (class201) field477.method3571(((long) arg0.field2735 << 32) + (long) arg0.field2736);
        return var1 == null ? arg0.field2865 : var1.field3090;
    }

    @ObfuscatedName("ef.ds(Lfv;B)Lfv;")
    public static class173 method2978(class173 arg0) {
        int var1 = class178.method200(method122(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method1002(arg0.field2743);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("el.dw(Lfv;I)Z")
    public static boolean method2973(class173 arg0) {
        if (field443) {
            if (method122(arg0) != 0) {
                return false;
            }
            if (arg0.field2737 == 0) {
                return false;
            }
        }
        return arg0.field2725;
    }

    @ObfuscatedName("d.dk(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method608(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field280 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field280 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field280 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field280 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field280 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field166 != null) {
            var3 = "/p=" + Statics.field166;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field284 + "/a=" + Statics.field1147 + var3 + "/";
    }

    @ObfuscatedName("ej.df(Ljava/lang/String;B)V")
    public static void method2837(String arg0) {
        Statics.field166 = arg0;
        try {
            String var1 = Statics.field275.getParameter(class190.field3045.field3056);
            String var2 = Statics.field275.getParameter(class190.field3052.field3056);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class111.method255(class115.method2038() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class132.method2706(Statics.field275, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("h.de(Ljava/lang/String;ZI)V")
    public static void method114(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1093; var5++) {
            class52 var6 = class52.method154(var5);
            if ((!arg1 || var6.field1138) && var6.field1115 == -1 && var6.field1100.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field269 = -1;
                    Statics.field1940 = null;
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
        Statics.field1940 = var3;
        Statics.field1545 = 0;
        Statics.field269 = var4;
        String[] var9 = new String[Statics.field269];
        for (int var10 = 0; var10 < Statics.field269; var10++) {
            var9[var10] = class52.method154(var3[var10]).field1100;
        }
        short[] var11 = Statics.field1940;
        class124.method254(var9, var11, 0, var9.length - 1);
    }
}

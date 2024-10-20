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
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class148 {

    @ObfuscatedName("client.e")
    public static boolean field299 = true;

    @ObfuscatedName("client.g")
    public static int field300 = 1;

    @ObfuscatedName("client.n")
    public static int field308 = 0;

    @ObfuscatedName("client.d")
    public static int field515 = 0;

    @ObfuscatedName("client.j")
    public static boolean field304 = false;

    @ObfuscatedName("client.s")
    public static boolean field305 = false;

    @ObfuscatedName("client.p")
    public static int field311 = 0;

    @ObfuscatedName("client.w")
    public static class112[] field410 = new class112[4];

    @ObfuscatedName("client.z")
    public static int field386 = 0;

    @ObfuscatedName("client.q")
    public static boolean field440 = true;

    @ObfuscatedName("client.o")
    public static int field333 = 0;

    @ObfuscatedName("client.f")
    public static long field526 = 1L;

    @ObfuscatedName("client.t")
    public static int field537 = -1;

    @ObfuscatedName("client.a")
    public static int field314 = -1;

    @ObfuscatedName("client.am")
    public static int field371 = -1;

    @ObfuscatedName("client.as")
    public static boolean field563 = true;

    @ObfuscatedName("client.ad")
    public static boolean field317 = false;

    @ObfuscatedName("client.af")
    public static int field318 = 0;

    @ObfuscatedName("client.ak")
    public static int field307 = 0;

    @ObfuscatedName("client.aq")
    public static int field320 = 0;

    @ObfuscatedName("client.an")
    public static int field321 = 0;

    @ObfuscatedName("client.ag")
    public static int field322 = 0;

    @ObfuscatedName("client.al")
    public static int field530 = 0;

    @ObfuscatedName("client.au")
    public static int field324 = 0;

    @ObfuscatedName("client.ar")
    public static int field541 = 0;

    @ObfuscatedName("client.aw")
    public static int field326 = 0;

    @ObfuscatedName("client.ax")
    public static class22 field327 = class22.field608;

    @ObfuscatedName("client.ac")
    public static class22 field328 = class22.field608;

    @ObfuscatedName("client.ap")
    public static int field399 = 0;

    @ObfuscatedName("client.ab")
    public static int field330 = 0;

    @ObfuscatedName("client.aj")
    public static int field331 = 0;

    @ObfuscatedName("client.bd")
    public static int field335 = 0;

    @ObfuscatedName("client.bz")
    public static int field336 = 0;

    @ObfuscatedName("client.br")
    public static int field367 = 0;

    @ObfuscatedName("client.be")
    public static int field488 = 0;

    @ObfuscatedName("client.bt")
    public static int field339 = 0;

    @ObfuscatedName("client.cj")
    public static class37[] field341 = new class37[32768];

    @ObfuscatedName("client.ci")
    public static int field342 = 0;

    @ObfuscatedName("client.cm")
    public static int[] field343 = new int[32768];

    @ObfuscatedName("client.cc")
    public static int field344 = 0;

    @ObfuscatedName("client.cs")
    public static int[] field556 = new int[250];

    @ObfuscatedName("client.cw")
    public static class126 field379 = new class126(5000);

    @ObfuscatedName("client.cp")
    public static class126 field347 = new class126(5000);

    @ObfuscatedName("client.cx")
    public static class126 field348 = new class126(15000);

    @ObfuscatedName("client.cr")
    public static int field349 = 0;

    @ObfuscatedName("client.cq")
    public static int field350 = 0;

    @ObfuscatedName("client.cn")
    public static int field351 = 0;

    @ObfuscatedName("client.cf")
    public static int field481 = 0;

    @ObfuscatedName("client.cv")
    public static int field353 = 0;

    @ObfuscatedName("client.cb")
    public static int field422 = 0;

    @ObfuscatedName("client.cg")
    public static int field355 = 0;

    @ObfuscatedName("client.cz")
    public static int field356 = 0;

    @ObfuscatedName("client.cd")
    public static boolean field357 = false;

    @ObfuscatedName("client.do")
    public static int field358 = 0;

    @ObfuscatedName("client.dp")
    public static int field359 = 1;

    @ObfuscatedName("client.dq")
    public static int field360 = 0;

    @ObfuscatedName("client.da")
    public static int field302 = 1;

    @ObfuscatedName("client.dz")
    public static int field362 = 0;

    @ObfuscatedName("client.du")
    public static boolean field352 = false;

    @ObfuscatedName("client.dm")
    public static int[][][] field365 = new int[4][13][13];

    @ObfuscatedName("client.dn")
    public static final int[] field366 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dh")
    public static int field301 = 0;

    @ObfuscatedName("client.dy")
    public static int field484 = 2;

    @ObfuscatedName("client.de")
    public static int field369 = 0;

    @ObfuscatedName("client.dl")
    public static int field370 = 2;

    @ObfuscatedName("client.dk")
    public static int field499 = 0;

    @ObfuscatedName("client.eq")
    public static int field372 = 1;

    @ObfuscatedName("client.ez")
    public static int field373 = 0;

    @ObfuscatedName("client.ed")
    public static int field482 = 0;

    @ObfuscatedName("client.eo")
    public static int field375 = 2;

    @ObfuscatedName("client.en")
    public static int field376 = 0;

    @ObfuscatedName("client.ei")
    public static int field438 = 1;

    @ObfuscatedName("client.el")
    public static int field378 = 0;

    @ObfuscatedName("client.ep")
    public static int field421 = 0;

    @ObfuscatedName("client.ea")
    public static int field381 = 2301979;

    @ObfuscatedName("client.ej")
    public static int field382 = 5063219;

    @ObfuscatedName("client.er")
    public static int field383 = 3353893;

    @ObfuscatedName("client.ec")
    public static int field384 = 7759444;

    @ObfuscatedName("client.eg")
    public static boolean field385 = false;

    @ObfuscatedName("client.eh")
    public static int field363 = 0;

    @ObfuscatedName("client.ft")
    public static int field387 = 128;

    @ObfuscatedName("client.fj")
    public static int field388 = 0;

    @ObfuscatedName("client.fi")
    public static int field389 = 0;

    @ObfuscatedName("client.ff")
    public static int field390 = 0;

    @ObfuscatedName("client.fo")
    public static int field391 = 0;

    @ObfuscatedName("client.fq")
    public static int field392 = 0;

    @ObfuscatedName("client.fm")
    public static int field580 = 50;

    @ObfuscatedName("client.fu")
    public static int field394 = 0;

    @ObfuscatedName("client.fp")
    public static boolean field309 = false;

    @ObfuscatedName("client.fs")
    public static int field396 = 0;

    @ObfuscatedName("client.fx")
    public static int field397 = 0;

    @ObfuscatedName("client.fl")
    public static int field398 = 50;

    @ObfuscatedName("client.fk")
    public static int[] field468 = new int[field398];

    @ObfuscatedName("client.fe")
    public static int[] field400 = new int[field398];

    @ObfuscatedName("client.fz")
    public static int[] field401 = new int[field398];

    @ObfuscatedName("client.fg")
    public static int[] field402 = new int[field398];

    @ObfuscatedName("client.fd")
    public static int[] field566 = new int[field398];

    @ObfuscatedName("client.fn")
    public static int[] field377 = new int[field398];

    @ObfuscatedName("client.fh")
    public static int[] field405 = new int[field398];

    @ObfuscatedName("client.gh")
    public static String[] field406 = new String[field398];

    @ObfuscatedName("client.gk")
    public static int[][] field407 = new int[104][104];

    @ObfuscatedName("client.ga")
    public static int field408 = 0;

    @ObfuscatedName("client.gq")
    public static int field446 = -1;

    @ObfuscatedName("client.gc")
    public static int field419 = -1;

    @ObfuscatedName("client.gn")
    public static int field500 = 0;

    @ObfuscatedName("client.go")
    public static int field412 = 0;

    @ObfuscatedName("client.gs")
    public static int field413 = 0;

    @ObfuscatedName("client.gx")
    public static int field414 = 0;

    @ObfuscatedName("client.gd")
    public static int field415 = 0;

    @ObfuscatedName("client.gi")
    public static int field416 = 0;

    @ObfuscatedName("client.gb")
    public static int field417 = 0;

    @ObfuscatedName("client.gp")
    public static int field418 = 0;

    @ObfuscatedName("client.gv")
    public static int field393 = 0;

    @ObfuscatedName("client.gg")
    public static int field455 = 0;

    @ObfuscatedName("client.gl")
    public static boolean field557 = false;

    @ObfuscatedName("client.gy")
    public static int field424 = 0;

    @ObfuscatedName("client.gz")
    public static int field443 = 0;

    @ObfuscatedName("client.gf")
    public static class3[] field420 = new class3[2048];

    @ObfuscatedName("client.gm")
    public static int field425 = -1;

    @ObfuscatedName("client.gw")
    public static int field354 = 0;

    @ObfuscatedName("client.hy")
    public static int field315 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field428 = new int[1000];

    @ObfuscatedName("client.hg")
    public static final int[] field429 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hb")
    public static String[] field430 = new String[8];

    @ObfuscatedName("client.hf")
    public static boolean[] field431 = new boolean[8];

    @ObfuscatedName("client.hu")
    public static int[] field432 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hm")
    public static int field433 = -1;

    @ObfuscatedName("client.hl")
    public static class203[][][] field434 = new class203[4][104][104];

    @ObfuscatedName("client.ho")
    public static class203 field572 = new class203();

    @ObfuscatedName("client.hc")
    public static class203 field436 = new class203();

    @ObfuscatedName("client.hn")
    public static class203 field437 = new class203();

    @ObfuscatedName("client.hj")
    public static int[] field368 = new int[25];

    @ObfuscatedName("client.hq")
    public static int[] field439 = new int[25];

    @ObfuscatedName("client.ha")
    public static int[] field323 = new int[25];

    @ObfuscatedName("client.hs")
    public static int field441 = 0;

    @ObfuscatedName("client.ht")
    public static boolean field442 = false;

    @ObfuscatedName("client.hp")
    public static int field411 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field444 = new int[500];

    @ObfuscatedName("client.hr")
    public static int[] field445 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field346 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field447 = new int[500];

    @ObfuscatedName("client.ih")
    public static String[] field470 = new String[500];

    @ObfuscatedName("client.ib")
    public static String[] field449 = new String[500];

    @ObfuscatedName("client.if")
    public static int field450 = -1;

    @ObfuscatedName("client.ia")
    public static int field496 = -1;

    @ObfuscatedName("client.ip")
    public static int field361 = 0;

    @ObfuscatedName("client.ir")
    public static int field453 = 50;

    @ObfuscatedName("client.im")
    public static int field454 = 0;

    @ObfuscatedName("client.it")
    public static String field313 = null;

    @ObfuscatedName("client.iy")
    public static boolean field456 = false;

    @ObfuscatedName("client.ic")
    public static int field457 = -1;

    @ObfuscatedName("client.iz")
    public static int field458 = -1;

    @ObfuscatedName("client.iu")
    public static String field459 = null;

    @ObfuscatedName("client.ii")
    public static String field460 = null;

    @ObfuscatedName("client.id")
    public static int field374 = -1;

    @ObfuscatedName("client.ij")
    public static class200 field462 = new class200(8);

    @ObfuscatedName("client.iw")
    public static int field463 = 0;

    @ObfuscatedName("client.jv")
    public static int field464 = 0;

    @ObfuscatedName("client.jy")
    public static class177 field465 = null;

    @ObfuscatedName("client.jm")
    public static int field551 = 0;

    @ObfuscatedName("client.jk")
    public static int field467 = 0;

    @ObfuscatedName("client.jn")
    public static int field466 = 0;

    @ObfuscatedName("client.jq")
    public static int field567 = -1;

    @ObfuscatedName("client.je")
    public static boolean field517 = false;

    @ObfuscatedName("client.js")
    public static boolean field471 = false;

    @ObfuscatedName("client.jz")
    public static boolean field472 = false;

    @ObfuscatedName("client.jx")
    public static class177 field536 = null;

    @ObfuscatedName("client.jp")
    public static class177 field474 = null;

    @ObfuscatedName("client.jw")
    public static class177 field475 = null;

    @ObfuscatedName("client.jf")
    public static int field476 = 0;

    @ObfuscatedName("client.jl")
    public static int field513 = 0;

    @ObfuscatedName("client.ju")
    public static class177 field461 = null;

    @ObfuscatedName("client.jc")
    public static boolean field479 = false;

    @ObfuscatedName("client.ja")
    public static int field480 = -1;

    @ObfuscatedName("client.jj")
    public static int field325 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field586 = false;

    @ObfuscatedName("client.jh")
    public static int field483 = -1;

    @ObfuscatedName("client.jo")
    public static int field448 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field485 = false;

    @ObfuscatedName("client.kj")
    public static int field486 = 1;

    @ObfuscatedName("client.kh")
    public static int[] field487 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field427 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field489 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field490 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field491 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field492 = 0;

    @ObfuscatedName("client.ko")
    public static int field493 = 0;

    @ObfuscatedName("client.kk")
    public static int field494 = 0;

    @ObfuscatedName("client.kz")
    public static int field571 = 0;

    @ObfuscatedName("client.kt")
    public static int field576 = 0;

    @ObfuscatedName("client.kv")
    public static int field497 = 0;

    @ObfuscatedName("client.km")
    public static int field498 = 0;

    @ObfuscatedName("client.ku")
    public static int field531 = 0;

    @ObfuscatedName("client.kl")
    public static class203 field523 = new class203();

    @ObfuscatedName("client.ks")
    public static class203 field501 = new class203();

    @ObfuscatedName("client.kn")
    public static class203 field502 = new class203();

    @ObfuscatedName("client.kb")
    public static class200 field503 = new class200(512);

    @ObfuscatedName("client.kc")
    public static int field426 = 0;

    @ObfuscatedName("client.ky")
    public static int field452 = -2;

    @ObfuscatedName("client.kg")
    public static boolean[] field495 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field507 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static boolean[] field508 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static int[] field577 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field510 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field511 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field512 = new int[100];

    @ObfuscatedName("client.lb")
    public static int field403 = 0;

    @ObfuscatedName("client.lo")
    public static long field423 = 0L;

    @ObfuscatedName("client.lg")
    public static boolean field329 = true;

    @ObfuscatedName("client.la")
    public static int field516 = 765;

    @ObfuscatedName("client.lh")
    public static int field316 = 503;

    @ObfuscatedName("client.lt")
    public static int[] field518 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.li")
    public static int field519 = 0;

    @ObfuscatedName("client.lr")
    public static int field520 = 0;

    @ObfuscatedName("client.lk")
    public static String field506 = "";

    @ObfuscatedName("client.lw")
    public static long[] field522 = new long[100];

    @ObfuscatedName("client.ll")
    public static int field469 = 0;

    @ObfuscatedName("client.ln")
    public static int field524 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field337 = new int[128];

    @ObfuscatedName("client.mb")
    public static int[] field478 = new int[128];

    @ObfuscatedName("client.mg")
    public static long field527 = -1L;

    @ObfuscatedName("client.mo")
    public static String field542 = null;

    @ObfuscatedName("client.mi")
    public static String field529 = null;

    @ObfuscatedName("client.mp")
    public static int field473 = -1;

    @ObfuscatedName("client.ma")
    public static int field310 = 0;

    @ObfuscatedName("client.ms")
    public static int[] field509 = new int[1000];

    @ObfuscatedName("client.mj")
    public static int[] field533 = new int[1000];

    @ObfuscatedName("client.mf")
    public static class82[] field534 = new class82[1000];

    @ObfuscatedName("client.mn")
    public static int field535 = 0;

    @ObfuscatedName("client.mw")
    public static int field435 = 0;

    @ObfuscatedName("client.mx")
    public static int field404 = 0;

    @ObfuscatedName("client.mt")
    public static int field514 = 255;

    @ObfuscatedName("client.mz")
    public static int field539 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field540 = false;

    @ObfuscatedName("client.nm")
    public static int field548 = 127;

    @ObfuscatedName("client.nc")
    public static int field409 = 127;

    @ObfuscatedName("client.nl")
    public static int field543 = 0;

    @ObfuscatedName("client.no")
    public static int[] field544 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field545 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field546 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field547 = new int[50];

    @ObfuscatedName("client.nq")
    public static class62[] field555 = new class62[50];

    @ObfuscatedName("client.ni")
    public static boolean field549 = false;

    @ObfuscatedName("client.nr")
    public static boolean[] field521 = new boolean[5];

    @ObfuscatedName("client.of")
    public static int[] field552 = new int[5];

    @ObfuscatedName("client.oz")
    public static int[] field553 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field554 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field505 = new int[5];

    @ObfuscatedName("client.ow")
    public static short field319 = 256;

    @ObfuscatedName("client.oi")
    public static short field298 = 205;

    @ObfuscatedName("client.ov")
    public static short field558 = 256;

    @ObfuscatedName("client.os")
    public static short field559 = 320;

    @ObfuscatedName("client.om")
    public static short field560 = 1;

    @ObfuscatedName("client.oo")
    public static short field395 = 32767;

    @ObfuscatedName("client.ob")
    public static short field562 = 1;

    @ObfuscatedName("client.oc")
    public static short field561 = 32767;

    @ObfuscatedName("client.ot")
    public static int field338 = 0;

    @ObfuscatedName("client.ol")
    public static int field565 = 0;

    @ObfuscatedName("client.op")
    public static int field538 = 0;

    @ObfuscatedName("client.or")
    public static int field525 = 0;

    @ObfuscatedName("client.oe")
    public static int field568 = 0;

    @ObfuscatedName("client.og")
    public static int field569 = 0;

    @ObfuscatedName("client.oh")
    public static int field570 = 0;

    @ObfuscatedName("client.ou")
    public static class18[] field306 = new class18[400];

    @ObfuscatedName("client.oj")
    public static class199 field504 = new class199();

    @ObfuscatedName("client.oy")
    public static int field573 = 0;

    @ObfuscatedName("client.oq")
    public static class8[] field528 = new class8[400];

    @ObfuscatedName("client.ox")
    public static class183 field575 = new class183();

    @ObfuscatedName("client.pa")
    public static int field574 = -1;

    @ObfuscatedName("client.px")
    public static int field564 = -1;

    @ObfuscatedName("client.ps")
    public static class224[] field578 = new class224[8];

    @ObfuscatedName("client.pb")
    public static long field579 = -1L;

    @ObfuscatedName("client.pk")
    public static long field451 = -1L;

    @ObfuscatedName("client.pv")
    public static final class11 field581 = new class11();

    @ObfuscatedName("client.pz")
    public static int[] field582 = new int[50];

    @ObfuscatedName("client.pf")
    public static int[] field583 = new int[50];

    @ObfuscatedName("client.e(I)V")
    public final void method284() {
    }

    public final void init() {
        if (!this.method2892()) {
            return;
        }
        class194[] var1 = class194.method2795();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class194 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3126);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3126)) {
                    case 1:
                        Statics.field73 = var4;
                        break;
                    case 2:
                        Statics.field2786 = Integer.parseInt(var4);
                        break;
                    case 3:
                        int var6 = Integer.parseInt(var4);
                        class157[] var7 = new class157[] { class157.field2322, class157.field2323, class157.field2324, class157.field2327 };
                        class157[] var8 = var7;
                        int var9 = 0;
                        class157 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class157 var10 = var8[var9];
                            if (var10.field2328 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field1956 = var11;
                        break;
                    case 4:
                        field300 = Integer.parseInt(var4);
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class2.field21)) {
                        }
                        break;
                    case 6:
                        Statics.field80 = var4;
                    case 7:
                    case 8:
                    case 13:
                    default:
                        break;
                    case 9:
                        Statics.field345 = Integer.parseInt(var4);
                        break;
                    case 10:
                        class158[] var5 = new class158[] { class158.field2334, class158.field2340, class158.field2333, class158.field2341, class158.field2338, class158.field2335 };
                        Statics.field2005 = (class158) class113.method2810(var5, Integer.parseInt(var4));
                        if (Statics.field2005 == class158.field2338) {
                            Statics.field303 = class216.field3190;
                        } else {
                            Statics.field303 = class216.field3197;
                        }
                        break;
                    case 11:
                        field515 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field308 = Integer.parseInt(var4);
                        break;
                    case 14:
                        if (var4.equalsIgnoreCase(class2.field21)) {
                            field304 = true;
                        } else {
                            field304 = false;
                        }
                        break;
                    case 15:
                        field311 = Integer.parseInt(var4);
                }
            }
        }
        class90.field1519 = false;
        field305 = false;
        Statics.field1079 = this.getCodeBase().getHost();
        String var12 = Statics.field1956.field2326;
        byte var13 = 0;
        try {
            Statics.field2283 = 16;
            Statics.field1427 = var13;
            try {
                Statics.field2060 = System.getProperty("os.name");
            } catch (Exception var27) {
                Statics.field2060 = "Unknown";
            }
            Statics.field1658 = Statics.field2060.toLowerCase();
            try {
                Statics.field2281 = System.getProperty("user.home");
                if (Statics.field2281 != null) {
                    Statics.field2281 = Statics.field2281 + "/";
                }
            } catch (Exception var26) {
            }
            try {
                if (Statics.field1658.startsWith("win")) {
                    if (Statics.field2281 == null) {
                        Statics.field2281 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2281 == null) {
                    Statics.field2281 = System.getenv("HOME");
                }
                if (Statics.field2281 != null) {
                    Statics.field2281 = Statics.field2281 + "/";
                }
            } catch (Exception var25) {
            }
            if (Statics.field2281 == null) {
                Statics.field2281 = "~/";
            }
            Statics.field2051 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2281, "/tmp/", "" };
            Statics.field1818 = new String[] { ".jagex_cache_" + Statics.field1427, ".file_store_" + Statics.field1427 };
            label123: for (int var17 = 0; var17 < 4; var17++) {
                Statics.field2282 = class153.method2718("oldschool", var12, var17);
                if (!Statics.field2282.exists()) {
                    Statics.field2282.mkdirs();
                }
                File[] var18 = Statics.field2282.listFiles();
                if (var18 == null) {
                    break;
                }
                File[] var19 = var18;
                int var20 = 0;
                while (true) {
                    if (var20 >= var19.length) {
                        break label123;
                    }
                    File var21 = var19[var20];
                    if (!class153.method1812(var21, false)) {
                        break;
                    }
                    var20++;
                }
            }
            File var22 = Statics.field2282;
            Statics.field1830 = var22;
            if (!Statics.field1830.exists()) {
                throw new RuntimeException("");
            }
            class139.field2134 = true;
            Statics.method2825();
            class153.field2287 = new class232(new class231(class139.method126("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class153.field2286 = new class232(new class231(class139.method126("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2026 = new class232[Statics.field2283];
            for (int var23 = 0; var23 < Statics.field2283; var23++) {
                Statics.field2026[var23] = new class232(new class231(class139.method126("main_file_cache.idx" + var23), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var28) {
            class152.method2021((String) null, var28);
        }
        Statics.field2707 = this;
        this.method2905(765, 503, 126);
    }

    @ObfuscatedName("client.n(S)V")
    public final void method441() {
        Statics.field1127 = field515 == 0 ? 43594 : field300 + 40000;
        Statics.field1732 = field515 == 0 ? 443 : field300 + 50000;
        Statics.field1409 = Statics.field1127;
        Statics.field2976 = class178.field2938;
        Statics.field273 = class178.field2939;
        Statics.field2977 = class178.field2940;
        Statics.field2978 = class178.field2941;
        if (Statics.field1615.toLowerCase().indexOf("microsoft") == -1) {
            class141.field2177[44] = 71;
            class141.field2177[45] = 26;
            class141.field2177[46] = 72;
            class141.field2177[47] = 73;
            class141.field2177[59] = 57;
            class141.field2177[61] = 27;
            class141.field2177[91] = 42;
            class141.field2177[92] = 74;
            class141.field2177[93] = 43;
            class141.field2177[192] = 28;
            class141.field2177[222] = 58;
            class141.field2177[520] = 59;
        } else {
            class141.field2177[186] = 57;
            class141.field2177[187] = 27;
            class141.field2177[188] = 71;
            class141.field2177[189] = 26;
            class141.field2177[190] = 72;
            class141.field2177[191] = 73;
            class141.field2177[192] = 58;
            class141.field2177[219] = 42;
            class141.field2177[220] = 74;
            class141.field2177[221] = 43;
            class141.field2177[222] = 59;
            class141.field2177[223] = 28;
        }
        class141.method1832(Statics.field2694);
        class144.method1525(Statics.field2694);
        Statics.field1218 = class135.method160();
        if (Statics.field1218 != null) {
            Statics.field1218.method2723(Statics.field2694);
        }
        Statics.field1222 = new class138(255, class153.field2287, class153.field2286, 500000);
        Statics.field43 = class9.method552();
        Statics.field1730 = this.getToolkit().getSystemClipboard();
        String var2 = Statics.field727;
        class142.field2191 = this;
        class142.field2185 = var2;
        if (field515 != 0) {
            field317 = true;
        }
        int var3 = Statics.field43.field162;
        field423 = 0L;
        if (var3 >= 2) {
            field329 = true;
        } else {
            field329 = false;
        }
        method2863();
        if (field386 >= 25) {
            method1523();
        }
        field2254 = true;
    }

    @ObfuscatedName("client.u(I)V")
    public final void method354() {
        field333++;
        this.method236();
        while (true) {
            class203 var1 = class174.field2757;
            class173 var2;
            synchronized (class174.field2757) {
                var2 = (class173) class174.field2758.method3611();
            }
            if (var2 == null) {
                class187.method540();
                method3709();
                class141 var4 = class141.field2174;
                synchronized (class141.field2174) {
                    class141.field2183++;
                    class141.field2160 = class141.field2176;
                    class141.field2173 = 0;
                    if (class141.field2169 >= 0) {
                        while (class141.field2169 != class141.field2168) {
                            int var6 = class141.field2161[class141.field2168];
                            class141.field2168 = class141.field2168 + 1 & 0x7F;
                            if (var6 < 0) {
                                class141.field2166[~var6] = false;
                            } else {
                                if (!class141.field2166[var6] && class141.field2173 < class141.field2157.length - 1) {
                                    class141.field2157[++class141.field2173 - 1] = var6;
                                }
                                class141.field2166[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class141.field2166[var5] = false;
                        }
                        class141.field2169 = class141.field2168;
                    }
                    class141.field2176 = class141.field2175;
                }
                class144 var8 = class144.field2208;
                synchronized (class144.field2208) {
                    class144.field2204 = class144.field2206;
                    class144.field2205 = class144.field2202;
                    class144.field2207 = class144.field2203 * -1990952231;
                    class144.field2211 = class144.field2201;
                    class144.field2212 = class144.field2214;
                    class144.field2213 = class144.field2209;
                    class144.field2199 = class144.field2210;
                    class144.field2201 = 0;
                }
                if (Statics.field1218 != null) {
                    int var10 = Statics.field1218.method2722();
                    field531 = var10;
                }
                if (field386 == 0) {
                    method1627();
                    class148.method3048();
                } else if (field386 == 5) {
                    class34.method1230(this);
                    method1627();
                    class148.method3048();
                } else if (field386 == 10 || field386 == 11) {
                    class34.method1230(this);
                } else if (field386 == 20) {
                    class34.method1230(this);
                    method2701();
                } else if (field386 == 25) {
                    method547(false);
                    field358 = 0;
                    boolean var11 = true;
                    for (int var12 = 0; var12 < Statics.field77.length; var12++) {
                        if (Statics.field2228[var12] != -1 && Statics.field77[var12] == null) {
                            Statics.field77[var12] = Statics.field174.method3086(Statics.field2228[var12], 0);
                            if (Statics.field77[var12] == null) {
                                var11 = false;
                                field358++;
                            }
                        }
                        if (Statics.field587[var12] != -1 && Statics.field2780[var12] == null) {
                            Statics.field2780[var12] = Statics.field174.method3084(Statics.field587[var12], 0, Statics.field1979[var12]);
                            if (Statics.field2780[var12] == null) {
                                var11 = false;
                                field358++;
                            }
                        }
                    }
                    if (var11) {
                        field360 = 0;
                        boolean var13 = true;
                        for (int var14 = 0; var14 < Statics.field77.length; var14++) {
                            byte[] var15 = Statics.field2780[var14];
                            if (var15 != null) {
                                int var16 = (Statics.field252[var14] >> 8) * 64 - Statics.field3127;
                                int var17 = (Statics.field252[var14] & 0xFF) * 64 - Statics.field1671;
                                if (field352) {
                                    var16 = 10;
                                    var17 = 10;
                                }
                                boolean var19 = true;
                                class123 var20 = new class123(var15);
                                int var21 = -1;
                                label1568: while (true) {
                                    int var22 = var20.method2433();
                                    if (var22 == 0) {
                                        var13 &= var19;
                                        break;
                                    }
                                    var21 += var22;
                                    int var23 = 0;
                                    boolean var24 = false;
                                    while (true) {
                                        while (!var24) {
                                            int var26 = var20.method2433();
                                            if (var26 == 0) {
                                                continue label1568;
                                            }
                                            var23 += var26 - 1;
                                            int var27 = var23 & 0x3F;
                                            int var28 = var23 >> 6 & 0x3F;
                                            int var29 = var20.method2404() >> 2;
                                            int var30 = var16 + var28;
                                            int var31 = var17 + var27;
                                            if (var30 > 0 && var31 > 0 && var30 < 103 && var31 < 103) {
                                                class43 var32 = class43.method117(var21);
                                                if (var29 != 22 || !field305 || var32.field964 != 0 || var32.field962 == 1 || var32.field983) {
                                                    if (!var32.method812()) {
                                                        field360++;
                                                        var19 = false;
                                                    }
                                                    var24 = true;
                                                }
                                            }
                                        }
                                        int var25 = var20.method2433();
                                        if (var25 == 0) {
                                            break;
                                        }
                                        var20.method2404();
                                    }
                                }
                            }
                        }
                        if (var13) {
                            if (field362 != 0) {
                                method3020(class161.field2517 + class2.field25 + class2.field22 + 100 + "%" + class2.field19, true);
                            }
                            method3709();
                            method1233();
                            method3709();
                            Statics.field2091.method1834();
                            method3709();
                            System.gc();
                            for (int var34 = 0; var34 < 4; var34++) {
                                field410[var34].method2283();
                            }
                            for (int var35 = 0; var35 < 4; var35++) {
                                for (int var36 = 0; var36 < 104; var36++) {
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        class6.field86[var35][var36][var37] = 0;
                                    }
                                }
                            }
                            method3709();
                            class6.method1626();
                            int var38 = Statics.field77.length;
                            class25.method111();
                            method547(true);
                            if (!field352) {
                                int var39 = 0;
                                label1506: while (true) {
                                    if (var39 >= var38) {
                                        for (int var53 = 0; var53 < var38; var53++) {
                                            int var54 = (Statics.field252[var53] >> 8) * 64 - Statics.field3127;
                                            int var55 = (Statics.field252[var53] & 0xFF) * 64 - Statics.field1671;
                                            byte[] var56 = Statics.field77[var53];
                                            if (var56 == null && Statics.field281 < 800) {
                                                method3709();
                                                class6.method731(var54, var55, 64, 64);
                                            }
                                        }
                                        method547(true);
                                        int var57 = 0;
                                        while (true) {
                                            if (var57 >= var38) {
                                                break label1506;
                                            }
                                            byte[] var58 = Statics.field2780[var57];
                                            if (var58 != null) {
                                                int var59 = (Statics.field252[var57] >> 8) * 64 - Statics.field3127;
                                                int var60 = (Statics.field252[var57] & 0xFF) * 64 - Statics.field1671;
                                                method3709();
                                                class90 var61 = Statics.field2091;
                                                class112[] var62 = field410;
                                                class123 var63 = new class123(var58);
                                                int var64 = -1;
                                                while (true) {
                                                    int var65 = var63.method2433();
                                                    if (var65 == 0) {
                                                        break;
                                                    }
                                                    var64 += var65;
                                                    int var66 = 0;
                                                    while (true) {
                                                        int var67 = var63.method2433();
                                                        if (var67 == 0) {
                                                            break;
                                                        }
                                                        var66 += var67 - 1;
                                                        int var68 = var66 & 0x3F;
                                                        int var69 = var66 >> 6 & 0x3F;
                                                        int var70 = var66 >> 12;
                                                        int var71 = var63.method2404();
                                                        int var72 = var71 >> 2;
                                                        int var73 = var71 & 0x3;
                                                        int var74 = var59 + var69;
                                                        int var75 = var60 + var68;
                                                        if (var74 > 0 && var75 > 0 && var74 < 103 && var75 < 103) {
                                                            int var76 = var70;
                                                            if ((class6.field86[1][var74][var75] & 0x2) == 2) {
                                                                var76 = var70 - 1;
                                                            }
                                                            class112 var77 = null;
                                                            if (var76 >= 0) {
                                                                var77 = var62[var76];
                                                            }
                                                            class6.method535(var70, var74, var75, var64, var73, var72, var61, var77);
                                                        }
                                                    }
                                                }
                                            }
                                            var57++;
                                        }
                                    }
                                    int var40 = (Statics.field252[var39] >> 8) * 64 - Statics.field3127;
                                    int var41 = (Statics.field252[var39] & 0xFF) * 64 - Statics.field1671;
                                    byte[] var42 = Statics.field77[var39];
                                    if (var42 != null) {
                                        method3709();
                                        int var43 = Statics.field2066 * 8 - 48;
                                        int var44 = Statics.field281 * 8 - 48;
                                        class112[] var45 = field410;
                                        int var46 = 0;
                                        label1503: while (true) {
                                            if (var46 >= 4) {
                                                class123 var49 = new class123(var42);
                                                int var50 = 0;
                                                while (true) {
                                                    if (var50 >= 4) {
                                                        break label1503;
                                                    }
                                                    for (int var51 = 0; var51 < 64; var51++) {
                                                        for (int var52 = 0; var52 < 64; var52++) {
                                                            class6.method2988(var49, var50, var40 + var51, var41 + var52, var43, var44, 0);
                                                        }
                                                    }
                                                    var50++;
                                                }
                                            }
                                            for (int var47 = 0; var47 < 64; var47++) {
                                                for (int var48 = 0; var48 < 64; var48++) {
                                                    if (var40 + var47 > 0 && var40 + var47 < 103 && var41 + var48 > 0 && var41 + var48 < 103) {
                                                        var45[var46].field1951[var40 + var47][var41 + var48] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var46++;
                                        }
                                    }
                                    var39++;
                                }
                            }
                            if (field352) {
                                int var78 = 0;
                                label1439: while (true) {
                                    if (var78 >= 4) {
                                        for (int var96 = 0; var96 < 13; var96++) {
                                            for (int var97 = 0; var97 < 13; var97++) {
                                                int var98 = field365[0][var96][var97];
                                                if (var98 == -1) {
                                                    class6.method731(var96 * 8, var97 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method547(true);
                                        int var99 = 0;
                                        while (true) {
                                            if (var99 >= 4) {
                                                break label1439;
                                            }
                                            method3709();
                                            for (int var100 = 0; var100 < 13; var100++) {
                                                label1362: for (int var101 = 0; var101 < 13; var101++) {
                                                    int var102 = field365[var99][var100][var101];
                                                    if (var102 != -1) {
                                                        int var103 = var102 >> 24 & 0x3;
                                                        int var104 = var102 >> 1 & 0x3;
                                                        int var105 = var102 >> 14 & 0x3FF;
                                                        int var106 = var102 >> 3 & 0x7FF;
                                                        int var107 = (var105 / 8 << 8) + var106 / 8;
                                                        for (int var108 = 0; var108 < Statics.field252.length; var108++) {
                                                            if (Statics.field252[var108] == var107 && Statics.field2780[var108] != null) {
                                                                byte[] var109 = Statics.field2780[var108];
                                                                int var110 = var100 * 8;
                                                                int var111 = var101 * 8;
                                                                int var112 = (var105 & 0x7) * 8;
                                                                int var113 = (var106 & 0x7) * 8;
                                                                class90 var114 = Statics.field2091;
                                                                class112[] var115 = field410;
                                                                class123 var116 = new class123(var109);
                                                                int var117 = -1;
                                                                while (true) {
                                                                    int var118 = var116.method2433();
                                                                    if (var118 == 0) {
                                                                        continue label1362;
                                                                    }
                                                                    var117 += var118;
                                                                    int var119 = 0;
                                                                    while (true) {
                                                                        int var120 = var116.method2433();
                                                                        if (var120 == 0) {
                                                                            break;
                                                                        }
                                                                        var119 += var120 - 1;
                                                                        int var121 = var119 & 0x3F;
                                                                        int var122 = var119 >> 6 & 0x3F;
                                                                        int var123 = var119 >> 12;
                                                                        int var124 = var116.method2404();
                                                                        int var125 = var124 >> 2;
                                                                        int var126 = var124 & 0x3;
                                                                        if (var103 == var123 && var122 >= var112 && var122 < var112 + 8 && var121 >= var113 && var121 < var113 + 8) {
                                                                            class43 var127 = class43.method117(var117);
                                                                            int var129 = var122 & 0x7;
                                                                            int var130 = var121 & 0x7;
                                                                            int var132 = var127.field960;
                                                                            int var133 = var127.field961;
                                                                            if ((var126 & 0x1) == 1) {
                                                                                int var134 = var132;
                                                                                var132 = var133;
                                                                                var133 = var134;
                                                                            }
                                                                            int var135 = var104 & 0x3;
                                                                            int var136;
                                                                            if (var135 == 0) {
                                                                                var136 = var129;
                                                                            } else if (var135 == 1) {
                                                                                var136 = var130;
                                                                            } else if (var135 == 2) {
                                                                                var136 = 7 - var129 - (var132 - 1);
                                                                            } else {
                                                                                var136 = 7 - var130 - (var133 - 1);
                                                                            }
                                                                            int var137 = var110 + var136;
                                                                            int var138 = var111 + class181.method3186(var122 & 0x7, var121 & 0x7, var104, var127.field960, var127.field961, var126);
                                                                            if (var137 > 0 && var138 > 0 && var137 < 103 && var138 < 103) {
                                                                                int var139 = var99;
                                                                                if ((class6.field86[1][var137][var138] & 0x2) == 2) {
                                                                                    var139 = var99 - 1;
                                                                                }
                                                                                class112 var140 = null;
                                                                                if (var139 >= 0) {
                                                                                    var140 = var115[var139];
                                                                                }
                                                                                class6.method535(var99, var137, var138, var117, var104 + var126 & 0x3, var125, var114, var140);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var99++;
                                        }
                                    }
                                    method3709();
                                    for (int var79 = 0; var79 < 13; var79++) {
                                        for (int var80 = 0; var80 < 13; var80++) {
                                            boolean var81 = false;
                                            int var82 = field365[var78][var79][var80];
                                            if (var82 != -1) {
                                                int var83 = var82 >> 24 & 0x3;
                                                int var84 = var82 >> 1 & 0x3;
                                                int var85 = var82 >> 14 & 0x3FF;
                                                int var86 = var82 >> 3 & 0x7FF;
                                                int var87 = (var85 / 8 << 8) + var86 / 8;
                                                for (int var88 = 0; var88 < Statics.field252.length; var88++) {
                                                    if (Statics.field252[var88] == var87 && Statics.field77[var88] != null) {
                                                        class6.method2678(Statics.field77[var88], var78, var79 * 8, var80 * 8, var83, (var85 & 0x7) * 8, (var86 & 0x7) * 8, var84, field410);
                                                        var81 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var81) {
                                                int var89 = var78;
                                                int var90 = var79 * 8;
                                                int var91 = var80 * 8;
                                                for (int var92 = 0; var92 < 8; var92++) {
                                                    for (int var93 = 0; var93 < 8; var93++) {
                                                        class6.field96[var89][var90 + var92][var91 + var93] = 0;
                                                    }
                                                }
                                                if (var90 > 0) {
                                                    for (int var94 = 1; var94 < 8; var94++) {
                                                        class6.field96[var89][var90][var91 + var94] = class6.field96[var89][var90 - 1][var91 + var94];
                                                    }
                                                }
                                                if (var91 > 0) {
                                                    for (int var95 = 1; var95 < 8; var95++) {
                                                        class6.field96[var89][var90 + var95][var91] = class6.field96[var89][var90 + var95][var91 - 1];
                                                    }
                                                }
                                                if (var90 > 0 && class6.field96[var89][var90 - 1][var91] != 0) {
                                                    class6.field96[var89][var90][var91] = class6.field96[var89][var90 - 1][var91];
                                                } else if (var91 > 0 && class6.field96[var89][var90][var91 - 1] != 0) {
                                                    class6.field96[var89][var90][var91] = class6.field96[var89][var90][var91 - 1];
                                                } else if (var90 > 0 && var91 > 0 && class6.field96[var89][var90 - 1][var91 - 1] != 0) {
                                                    class6.field96[var89][var90][var91] = class6.field96[var89][var90 - 1][var91 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var78++;
                                }
                            }
                            method547(true);
                            method1233();
                            method3709();
                            class6.method225(Statics.field2091, field410);
                            method547(true);
                            int var141 = class6.field87;
                            if (var141 > Statics.field2760) {
                                var141 = Statics.field2760;
                            }
                            if (var141 < Statics.field2760 - 1) {
                                int var142 = Statics.field2760 - 1;
                            }
                            if (field305) {
                                Statics.field2091.method2015(class6.field87);
                            } else {
                                Statics.field2091.method2015(0);
                            }
                            for (int var143 = 0; var143 < 104; var143++) {
                                for (int var144 = 0; var144 < 104; var144++) {
                                    method3210(var143, var144);
                                }
                            }
                            method3709();
                            method2604();
                            class43.field948.method3533();
                            if (Statics.field16 != null) {
                                field379.method2661(163);
                                field379.method2569(1057001181);
                            }
                            if (!field352) {
                                int var145 = (Statics.field2066 - 6) / 8;
                                int var146 = (Statics.field2066 + 6) / 8;
                                int var147 = (Statics.field281 - 6) / 8;
                                int var148 = (Statics.field281 + 6) / 8;
                                for (int var149 = var145 - 1; var149 <= var146 + 1; var149++) {
                                    for (int var150 = var147 - 1; var150 <= var148 + 1; var150++) {
                                        if (var149 < var145 || var149 > var146 || var150 < var147 || var150 > var148) {
                                            Statics.field174.method3103("m" + var149 + "_" + var150);
                                            Statics.field174.method3103("l" + var149 + "_" + var150);
                                        }
                                    }
                                }
                            }
                            method2342(30);
                            method3709();
                            Statics.field103 = (byte[][][]) null;
                            Statics.field89 = (byte[][][]) null;
                            Statics.field90 = (byte[][][]) null;
                            Statics.field91 = (byte[][][]) null;
                            Statics.field108 = (int[][][]) null;
                            Statics.field802 = (byte[][][]) null;
                            Statics.field92 = (int[][]) null;
                            Statics.field93 = null;
                            Statics.field2752 = null;
                            Statics.field94 = null;
                            Statics.field95 = null;
                            Statics.field2 = null;
                            field379.method2661(48);
                            class148.method3048();
                        } else {
                            field362 = 2;
                        }
                    } else {
                        field362 = 1;
                    }
                }
                if (field386 == 30) {
                    if (field318 > 1) {
                        field318--;
                    }
                    if (field356 > 0) {
                        field356--;
                    }
                    if (field357) {
                        field357 = false;
                        if (field356 > 0) {
                            method868();
                        } else {
                            method2342(40);
                            Statics.field1251 = Statics.field994;
                            Statics.field994 = null;
                        }
                    } else {
                        if (!field442) {
                            field470[0] = class161.field2480;
                            field449[0] = "";
                            field346[0] = 1006;
                            field411 = 1;
                        }
                        for (int var151 = 0; var151 < 100 && method3184(); var151++) {
                        }
                        if (field386 == 30) {
                            while (class215.method2109()) {
                                field379.method2661(146);
                                field379.method2389(0);
                                int var152 = field379.field2046;
                                class215.method3073(field379);
                                field379.method2423(field379.field2046 - var152);
                            }
                            Object var153 = Statics.field312.field217;
                            synchronized (Statics.field312.field217) {
                                if (!field299) {
                                    Statics.field312.field212 = 0;
                                } else if (class144.field2211 != 0 || Statics.field312.field212 >= 40) {
                                    field379.method2661(122);
                                    field379.method2389(0);
                                    int var154 = field379.field2046;
                                    int var155 = 0;
                                    for (int var156 = 0; var156 < Statics.field312.field212 && field379.field2046 - var154 < 240; var156++) {
                                        var155++;
                                        int var157 = Statics.field312.field210[var156];
                                        if (var157 < 0) {
                                            var157 = 0;
                                        } else if (var157 > 502) {
                                            var157 = 502;
                                        }
                                        int var158 = Statics.field312.field213[var156];
                                        if (var158 < 0) {
                                            var158 = 0;
                                        } else if (var158 > 764) {
                                            var158 = 764;
                                        }
                                        int var159 = var157 * 765 + var158;
                                        if (Statics.field312.field210[var156] == -1 && Statics.field312.field213[var156] == -1) {
                                            var158 = -1;
                                            var157 = -1;
                                            var159 = 524287;
                                        }
                                        if (field537 != var158 || field314 != var157) {
                                            int var160 = var158 - field537;
                                            field537 = var158;
                                            int var161 = var157 - field314;
                                            field314 = var157;
                                            if (field371 < 8 && var160 >= -32 && var160 <= 31 && var161 >= -32 && var161 <= 31) {
                                                var160 += 32;
                                                var161 += 32;
                                                field379.method2561((field371 << 12) + (var160 << 6) + var161);
                                                field371 = 0;
                                            } else if (field371 < 8) {
                                                field379.method2391((field371 << 19) + 8388608 + var159);
                                                field371 = 0;
                                            } else {
                                                field379.method2569((field371 << 19) + -1073741824 + var159);
                                                field371 = 0;
                                            }
                                        } else if (field371 < 2047) {
                                            field371++;
                                        }
                                    }
                                    field379.method2423(field379.field2046 - var154);
                                    if (var155 >= Statics.field312.field212) {
                                        Statics.field312.field212 = 0;
                                    } else {
                                        Statics.field312.field212 -= var155;
                                        for (int var162 = 0; var162 < Statics.field312.field212; var162++) {
                                            Statics.field312.field213[var162] = Statics.field312.field213[var155 + var162];
                                            Statics.field312.field210[var162] = Statics.field312.field210[var155 + var162];
                                        }
                                    }
                                }
                            }
                            if (class144.field2211 == 1 || !Statics.field82 && class144.field2211 == 4 || class144.field2211 == 2) {
                                long var164 = (class144.field2199 - field526 * -1L) / 50L;
                                if (var164 > 4095L) {
                                    var164 = 4095L;
                                }
                                field526 = class144.field2199 * -1L;
                                int var166 = class144.field2213;
                                if (var166 < 0) {
                                    var166 = 0;
                                } else if (var166 > Statics.field1429) {
                                    var166 = Statics.field1429;
                                }
                                int var167 = class144.field2212;
                                if (var167 < 0) {
                                    var167 = 0;
                                } else if (var167 > Statics.field1268) {
                                    var167 = Statics.field1268;
                                }
                                int var168 = (int) var164;
                                field379.method2661(57);
                                field379.method2561((var168 << 1) + (class144.field2211 == 2 ? 1 : 0));
                                field379.method2561(var167);
                                field379.method2561(var166);
                            }
                            if (class141.field2173 > 0) {
                                field379.method2661(224);
                                field379.method2561(0);
                                int var169 = field379.field2046;
                                long var170 = class119.method719();
                                for (int var172 = 0; var172 < class141.field2173; var172++) {
                                    long var173 = var170 - field527;
                                    if (var173 > 16777215L) {
                                        var173 = 16777215L;
                                    }
                                    field527 = var170;
                                    field379.method2444((int) var173);
                                    field379.method2389(class141.field2157[var172]);
                                }
                                field379.method2496(field379.field2046 - var169);
                            }
                            if (field394 > 0) {
                                field394--;
                            }
                            if (class141.field2166[96] || class141.field2166[97] || class141.field2166[98] || class141.field2166[99]) {
                                field309 = true;
                            }
                            if (field309 && field394 <= 0) {
                                field394 = 20;
                                field309 = false;
                                field379.method2661(45);
                                field379.method2532(field387);
                                field379.method2561(field388);
                            }
                            if (Statics.field834 && !field563) {
                                field563 = true;
                                field379.method2661(56);
                                field379.method2389(1);
                            }
                            if (!Statics.field834 && field563) {
                                field563 = false;
                                field379.method2661(56);
                                field379.method2389(0);
                            }
                            Statics.method554();
                            if (field386 == 30) {
                                for (class17 var175 = (class17) field572.method3597(); var175 != null; var175 = (class17) field572.method3599()) {
                                    if (var175.field243 > 0) {
                                        var175.field243--;
                                    }
                                    if (var175.field243 != 0) {
                                        if (var175.field245 > 0) {
                                            var175.field245--;
                                        }
                                        if (var175.field245 == 0 && var175.field244 >= 1 && var175.field261 >= 1 && var175.field244 <= 102 && var175.field261 <= 102 && (var175.field249 < 0 || class6.method2717(var175.field249, var175.field251))) {
                                            method3068(var175.field253, var175.field247, var175.field244, var175.field261, var175.field249, var175.field250, var175.field251);
                                            var175.field245 = -1;
                                            if (var175.field258 == var175.field249 && var175.field258 == -1) {
                                                var175.method3706();
                                            } else if (var175.field258 == var175.field249 && var175.field250 == var175.field242 && var175.field251 == var175.field248) {
                                                var175.method3706();
                                            }
                                        }
                                    } else if (var175.field258 < 0 || class6.method2717(var175.field258, var175.field248)) {
                                        method3068(var175.field253, var175.field247, var175.field244, var175.field261, var175.field258, var175.field242, var175.field248);
                                        var175.method3706();
                                    }
                                }
                                method650();
                                field351++;
                                if (field351 <= 750) {
                                    int var176 = class35.field780;
                                    int[] var177 = class35.field787;
                                    for (int var178 = 0; var178 < var176; var178++) {
                                        class3 var179 = field420[var177[var178]];
                                        if (var179 != null) {
                                            method158(var179, 1);
                                        }
                                    }
                                    for (int var180 = 0; var180 < field342; var180++) {
                                        int var181 = field343[var180];
                                        class37 var182 = field341[var181];
                                        if (var182 != null) {
                                            method158(var182, var182.field803.field911);
                                        }
                                    }
                                    method153();
                                    field421++;
                                    if (field414 != 0) {
                                        field413 += 20;
                                        if (field413 >= 400) {
                                            field414 = 0;
                                        }
                                    }
                                    if (Statics.field896 != null) {
                                        field415++;
                                        if (field415 >= 15) {
                                            method654(Statics.field896);
                                            Statics.field896 = null;
                                        }
                                    }
                                    class177 var183 = Statics.field1154;
                                    class177 var184 = Statics.field268;
                                    Statics.field1154 = null;
                                    Statics.field268 = null;
                                    field461 = null;
                                    field586 = false;
                                    field479 = false;
                                    field524 = 0;
                                    while (true) {
                                        while (class141.method730() && field524 < 128) {
                                            if (field466 >= 2 && class141.field2166[82] && Statics.field598 == 66) {
                                                String var185 = "";
                                                Iterator var186 = class12.field193.iterator();
                                                while (var186.hasNext()) {
                                                    class38 var187 = (class38) var186.next();
                                                    var185 = var185 + var187.field813 + ':' + var187.field815 + '\n';
                                                }
                                                Statics.field1730.setContents(new StringSelection(var185), (ClipboardOwner) null);
                                            } else {
                                                field478[field524] = Statics.field598;
                                                field337[field524] = Statics.field2094;
                                                field524++;
                                            }
                                        }
                                        if (field374 != -1) {
                                            int var190 = field374;
                                            int var191 = Statics.field1268;
                                            int var192 = Statics.field1429;
                                            if (class177.method163(var190)) {
                                                method2352(Statics.field2824[var190], -1, 0, 0, var191, var192, 0, 0);
                                            }
                                        }
                                        field486++;
                                        while (true) {
                                            class1 var193;
                                            class177 var194;
                                            class177 var195;
                                            do {
                                                var193 = (class1) field501.method3611();
                                                if (var193 == null) {
                                                    while (true) {
                                                        class1 var196;
                                                        class177 var197;
                                                        class177 var198;
                                                        do {
                                                            var196 = (class1) field502.method3611();
                                                            if (var196 == null) {
                                                                while (true) {
                                                                    class1 var199;
                                                                    class177 var200;
                                                                    class177 var201;
                                                                    do {
                                                                        var199 = (class1) field523.method3611();
                                                                        if (var199 == null) {
                                                                            method87();
                                                                            if (field474 != null) {
                                                                                method50();
                                                                            }
                                                                            if (Statics.field1822 != null) {
                                                                                method654(Statics.field1822);
                                                                                field424++;
                                                                                if (class144.field2204 == 0) {
                                                                                    if (field557) {
                                                                                        if (Statics.field70 == Statics.field1822 && field455 != field417) {
                                                                                            class177 var202 = Statics.field1822;
                                                                                            byte var203 = 0;
                                                                                            if (field464 == 1 && var202.field2936 == 206) {
                                                                                                var203 = 1;
                                                                                            }
                                                                                            if (var202.field2910[field455] <= 0) {
                                                                                                var203 = 0;
                                                                                            }
                                                                                            if (class182.method2710(method93(var202))) {
                                                                                                int var204 = field417;
                                                                                                int var205 = field455;
                                                                                                var202.field2910[var205] = var202.field2910[var204];
                                                                                                var202.field2874[var205] = var202.field2874[var204];
                                                                                                var202.field2910[var204] = -1;
                                                                                                var202.field2874[var204] = 0;
                                                                                            } else if (var203 == 1) {
                                                                                                int var206 = field417;
                                                                                                int var207 = field455;
                                                                                                while (var206 != var207) {
                                                                                                    if (var206 > var207) {
                                                                                                        var202.method3230(var206 - 1, var206);
                                                                                                        var206--;
                                                                                                    } else if (var206 < var207) {
                                                                                                        var202.method3230(var206 + 1, var206);
                                                                                                        var206++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var202.method3230(field455, field417);
                                                                                            }
                                                                                            field379.method2661(117);
                                                                                            field379.method2429(var203);
                                                                                            field379.method2591(Statics.field1822.field2803);
                                                                                            field379.method2560(field455);
                                                                                            field379.method2437(field417);
                                                                                        }
                                                                                    } else if ((field441 == 1 || method2108(field411 - 1)) && field411 > 2) {
                                                                                        method226(field418, field393);
                                                                                    } else if (field411 > 0) {
                                                                                        method2197(field418, field393);
                                                                                    }
                                                                                    field415 = 10;
                                                                                    class144.field2211 = 0;
                                                                                    Statics.field1822 = null;
                                                                                } else if (field424 >= 5 && (class144.field2205 > field418 + 5 || class144.field2205 < field418 - 5 || class144.field2207 * 900883817 > field393 + 5 || class144.field2207 * 900883817 < field393 - 5)) {
                                                                                    field557 = true;
                                                                                }
                                                                            }
                                                                            if (class90.field1573 != -1) {
                                                                                int var208 = class90.field1573;
                                                                                int var209 = class90.field1512;
                                                                                field379.method2661(12);
                                                                                field379.method2389(5);
                                                                                field379.method2429(class141.field2166[82] ? (class141.field2166[81] ? 2 : 1) : 0);
                                                                                field379.method2561(Statics.field1671 + var209);
                                                                                field379.method2437(Statics.field3127 + var208);
                                                                                class90.field1573 = -1;
                                                                                field500 = class144.field2212;
                                                                                field412 = class144.field2213;
                                                                                field414 = 1;
                                                                                field413 = 0;
                                                                                field535 = var208;
                                                                                field435 = var209;
                                                                            }
                                                                            if (Statics.field1154 != var183) {
                                                                                if (var183 != null) {
                                                                                    method654(var183);
                                                                                }
                                                                                if (Statics.field1154 != null) {
                                                                                    method654(Statics.field1154);
                                                                                }
                                                                            }
                                                                            if (Statics.field268 != var184 && field453 == field361) {
                                                                                if (var184 != null) {
                                                                                    method654(var184);
                                                                                }
                                                                                if (Statics.field268 != null) {
                                                                                    method654(Statics.field268);
                                                                                }
                                                                            }
                                                                            if (Statics.field268 == null) {
                                                                                if (field361 > 0) {
                                                                                    field361--;
                                                                                }
                                                                            } else if (field361 < field453) {
                                                                                field361++;
                                                                                if (field453 == field361) {
                                                                                    method654(Statics.field268);
                                                                                }
                                                                            }
                                                                            int var210 = field301 + Statics.field2137.field879;
                                                                            int var211 = field369 + Statics.field2137.field837;
                                                                            if (Statics.field176 - var210 < -500 || Statics.field176 - var210 > 500 || Statics.field2343 - var211 < -500 || Statics.field2343 - var211 > 500) {
                                                                                Statics.field176 = var210;
                                                                                Statics.field2343 = var211;
                                                                            }
                                                                            if (Statics.field176 != var210) {
                                                                                Statics.field176 += (var210 - Statics.field176) / 16;
                                                                            }
                                                                            if (Statics.field2343 != var211) {
                                                                                Statics.field2343 += (var211 - Statics.field2343) / 16;
                                                                            }
                                                                            if (class144.field2204 == 4 && Statics.field82) {
                                                                                int var212 = class144.field2207 * 900883817 - field392 * 900883817;
                                                                                field390 = var212 * 2;
                                                                                field392 = (var212 == -1 || var212 == 1 ? class144.field2207 * 900883817 : (field392 * 900883817 + class144.field2207 * 900883817) / 2) * -1990952231;
                                                                                int var213 = field391 - class144.field2205;
                                                                                field389 = var213 * 2;
                                                                                field391 = var213 == -1 || var213 == 1 ? class144.field2205 : (field391 + class144.field2205) / 2;
                                                                            } else {
                                                                                if (class141.field2166[96]) {
                                                                                    field389 += (-24 - field389) / 2;
                                                                                } else if (class141.field2166[97]) {
                                                                                    field389 += (24 - field389) / 2;
                                                                                } else {
                                                                                    field389 /= 2;
                                                                                }
                                                                                if (class141.field2166[98]) {
                                                                                    field390 += (12 - field390) / 2;
                                                                                } else if (class141.field2166[99]) {
                                                                                    field390 += (-12 - field390) / 2;
                                                                                } else {
                                                                                    field390 /= 2;
                                                                                }
                                                                                field392 = class144.field2207;
                                                                                field391 = class144.field2205;
                                                                            }
                                                                            field388 = field389 / 2 + field388 & 0x7FF;
                                                                            field387 += field390 / 2;
                                                                            if (field387 < 128) {
                                                                                field387 = 128;
                                                                            }
                                                                            if (field387 > 383) {
                                                                                field387 = 383;
                                                                            }
                                                                            int var214 = Statics.field176 >> 7;
                                                                            int var215 = Statics.field2343 >> 7;
                                                                            int var216 = method182(Statics.field176, Statics.field2343, Statics.field2760);
                                                                            int var217 = 0;
                                                                            if (var214 > 3 && var215 > 3 && var214 < 100 && var215 < 100) {
                                                                                for (int var218 = var214 - 4; var218 <= var214 + 4; var218++) {
                                                                                    for (int var219 = var215 - 4; var219 <= var215 + 4; var219++) {
                                                                                        int var220 = Statics.field2760;
                                                                                        if (var220 < 3 && (class6.field86[1][var218][var219] & 0x2) == 2) {
                                                                                            var220++;
                                                                                        }
                                                                                        int var221 = var216 - class6.field96[var220][var218][var219];
                                                                                        if (var221 > var217) {
                                                                                            var217 = var221;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var222 = var217 * 192;
                                                                            if (var222 > 98048) {
                                                                                var222 = 98048;
                                                                            }
                                                                            if (var222 < 32768) {
                                                                                var222 = 32768;
                                                                            }
                                                                            if (var222 > field396) {
                                                                                field396 += (var222 - field396) / 24;
                                                                            } else if (var222 < field396) {
                                                                                field396 += (var222 - field396) / 80;
                                                                            }
                                                                            if (field549) {
                                                                                int var223 = Statics.field2019 * 128 + 64;
                                                                                int var224 = Statics.field1446 * 128 + 64;
                                                                                int var225 = method182(var223, var224, Statics.field2760) - Statics.field1618;
                                                                                if (Statics.field708 < var223) {
                                                                                    Statics.field708 += Statics.field2331 * (var223 - Statics.field708) / 1000 + Statics.field590;
                                                                                    if (Statics.field708 > var223) {
                                                                                        Statics.field708 = var223;
                                                                                    }
                                                                                }
                                                                                if (Statics.field708 > var223) {
                                                                                    Statics.field708 -= Statics.field2331 * (Statics.field708 - var223) / 1000 + Statics.field590;
                                                                                    if (Statics.field708 < var223) {
                                                                                        Statics.field708 = var223;
                                                                                    }
                                                                                }
                                                                                if (Statics.field698 < var225) {
                                                                                    Statics.field698 += Statics.field2331 * (var225 - Statics.field698) / 1000 + Statics.field590;
                                                                                    if (Statics.field698 > var225) {
                                                                                        Statics.field698 = var225;
                                                                                    }
                                                                                }
                                                                                if (Statics.field698 > var225) {
                                                                                    Statics.field698 -= Statics.field2331 * (Statics.field698 - var225) / 1000 + Statics.field590;
                                                                                    if (Statics.field698 < var225) {
                                                                                        Statics.field698 = var225;
                                                                                    }
                                                                                }
                                                                                if (Statics.field796 < var224) {
                                                                                    Statics.field796 += Statics.field2331 * (var224 - Statics.field796) / 1000 + Statics.field590;
                                                                                    if (Statics.field796 > var224) {
                                                                                        Statics.field796 = var224;
                                                                                    }
                                                                                }
                                                                                if (Statics.field796 > var224) {
                                                                                    Statics.field796 -= Statics.field2331 * (Statics.field796 - var224) / 1000 + Statics.field590;
                                                                                    if (Statics.field796 < var224) {
                                                                                        Statics.field796 = var224;
                                                                                    }
                                                                                }
                                                                                int var226 = Statics.field658 * 128 + 64;
                                                                                int var227 = Statics.field3066 * 128 + 64;
                                                                                int var228 = method182(var226, var227, Statics.field2760) - Statics.field364;
                                                                                int var229 = var226 - Statics.field708;
                                                                                int var230 = var228 - Statics.field698;
                                                                                int var231 = var227 - Statics.field796;
                                                                                int var232 = (int) Math.sqrt((double) (var229 * var229 + var231 * var231));
                                                                                int var233 = (int) (Math.atan2((double) var230, (double) var232) * 325.949D) & 0x7FF;
                                                                                int var234 = (int) (Math.atan2((double) var229, (double) var231) * -325.949D) & 0x7FF;
                                                                                if (var233 < 128) {
                                                                                    var233 = 128;
                                                                                }
                                                                                if (var233 > 383) {
                                                                                    var233 = 383;
                                                                                }
                                                                                if (Statics.field612 < var233) {
                                                                                    Statics.field612 += Statics.field173 * (var233 - Statics.field612) / 1000 + Statics.field550;
                                                                                    if (Statics.field612 > var233) {
                                                                                        Statics.field612 = var233;
                                                                                    }
                                                                                }
                                                                                if (Statics.field612 > var233) {
                                                                                    Statics.field612 -= Statics.field173 * (Statics.field612 - var233) / 1000 + Statics.field550;
                                                                                    if (Statics.field612 < var233) {
                                                                                        Statics.field612 = var233;
                                                                                    }
                                                                                }
                                                                                int var235 = var234 - Statics.field2709;
                                                                                if (var235 > 1024) {
                                                                                    var235 -= 2048;
                                                                                }
                                                                                if (var235 < -1024) {
                                                                                    var235 += 2048;
                                                                                }
                                                                                if (var235 > 0) {
                                                                                    Statics.field2709 += Statics.field173 * var235 / 1000 + Statics.field550;
                                                                                    Statics.field2709 &= 0x7FF;
                                                                                }
                                                                                if (var235 < 0) {
                                                                                    Statics.field2709 -= Statics.field173 * -var235 / 1000 + Statics.field550;
                                                                                    Statics.field2709 &= 0x7FF;
                                                                                }
                                                                                int var236 = var234 - Statics.field2709;
                                                                                if (var236 > 1024) {
                                                                                    var236 -= 2048;
                                                                                }
                                                                                if (var236 < -1024) {
                                                                                    var236 += 2048;
                                                                                }
                                                                                if (var236 < 0 && var235 > 0 || var236 > 0 && var235 < 0) {
                                                                                    Statics.field2709 = var234;
                                                                                }
                                                                            }
                                                                            for (int var237 = 0; var237 < 5; var237++) {
                                                                                int var10002 = field505[var237]++;
                                                                            }
                                                                            Statics.field85.method217();
                                                                            int var238 = ++class144.field2200 - 1;
                                                                            int var240 = class141.field2183;
                                                                            if (var238 > 15000 && var240 > 15000) {
                                                                                field356 = 250;
                                                                                class144.field2200 = 14500;
                                                                                field379.method2661(97);
                                                                            }
                                                                            field373++;
                                                                            if (field373 > 500) {
                                                                                field373 = 0;
                                                                                int var242 = (int) (Math.random() * 8.0D);
                                                                                if ((var242 & 0x1) == 1) {
                                                                                    field301 += field484;
                                                                                }
                                                                                if ((var242 & 0x2) == 2) {
                                                                                    field369 += field370;
                                                                                }
                                                                                if ((var242 & 0x4) == 4) {
                                                                                    field499 += field372;
                                                                                }
                                                                            }
                                                                            if (field301 < -50) {
                                                                                field484 = 2;
                                                                            }
                                                                            if (field301 > 50) {
                                                                                field484 = -2;
                                                                            }
                                                                            if (field369 < -55) {
                                                                                field370 = 2;
                                                                            }
                                                                            if (field369 > 55) {
                                                                                field370 = -2;
                                                                            }
                                                                            if (field499 < -40) {
                                                                                field372 = 1;
                                                                            }
                                                                            if (field499 > 40) {
                                                                                field372 = -1;
                                                                            }
                                                                            field378++;
                                                                            if (field378 > 500) {
                                                                                field378 = 0;
                                                                                int var243 = (int) (Math.random() * 8.0D);
                                                                                if ((var243 & 0x1) == 1) {
                                                                                    field482 += field375;
                                                                                }
                                                                                if ((var243 & 0x2) == 2) {
                                                                                    field376 += field438;
                                                                                }
                                                                            }
                                                                            if (field482 < -60) {
                                                                                field375 = 2;
                                                                            }
                                                                            if (field482 > 60) {
                                                                                field375 = -2;
                                                                            }
                                                                            if (field376 < -20) {
                                                                                field438 = 1;
                                                                            }
                                                                            if (field376 > 10) {
                                                                                field438 = -1;
                                                                            }
                                                                            for (class41 var244 = (class41) field504.method3556(); var244 != null; var244 = (class41) field504.method3562()) {
                                                                                if ((long) var244.field898 < class119.method719() / 1000L - 5L) {
                                                                                    if (var244.field904 > 0) {
                                                                                        class12.method2280(5, "", var244.field902 + class161.field2500);
                                                                                    }
                                                                                    if (var244.field904 == 0) {
                                                                                        class12.method2280(5, "", var244.field902 + class161.field2501);
                                                                                    }
                                                                                    var244.method3696();
                                                                                }
                                                                            }
                                                                            field481++;
                                                                            if (field481 > 50) {
                                                                                field379.method2661(210);
                                                                            }
                                                                            try {
                                                                                if (Statics.field994 != null && field379.field2046 > 0) {
                                                                                    Statics.field994.method2874(field379.field2049, 0, field379.field2046);
                                                                                    field379.field2046 = 0;
                                                                                    field481 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var248) {
                                                                                if (field356 > 0) {
                                                                                    method868();
                                                                                } else {
                                                                                    method2342(40);
                                                                                    Statics.field1251 = Statics.field994;
                                                                                    Statics.field994 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var200 = var199.field14;
                                                                        if (var200.field2804 < 0) {
                                                                            break;
                                                                        }
                                                                        var201 = class177.method3198(var200.field2822);
                                                                    } while (var201 == null || var201.field2830 == null || var200.field2804 >= var201.field2830.length || var201.field2830[var200.field2804] != var200);
                                                                    class39.method147(var199);
                                                                }
                                                            }
                                                            var197 = var196.field14;
                                                            if (var197.field2804 < 0) {
                                                                break;
                                                            }
                                                            var198 = class177.method3198(var197.field2822);
                                                        } while (var198 == null || var198.field2830 == null || var197.field2804 >= var198.field2830.length || var198.field2830[var197.field2804] != var197);
                                                        class39.method147(var196);
                                                    }
                                                }
                                                var194 = var193.field14;
                                                if (var194.field2804 < 0) {
                                                    break;
                                                }
                                                var195 = class177.method3198(var194.field2822);
                                            } while (var195 == null || var195.field2830 == null || var194.field2804 >= var195.field2830.length || var195.field2830[var194.field2804] != var194);
                                            class39.method147(var193);
                                        }
                                    }
                                } else if (field356 > 0) {
                                    method868();
                                } else {
                                    method2342(40);
                                    Statics.field1251 = Statics.field994;
                                    Statics.field994 = null;
                                }
                            }
                        }
                    }
                } else if (field386 == 40 || field386 == 45) {
                    method2701();
                }
                return;
            }
            var2.field2750.method3166(var2.field2751, (int) var2.field3176, var2.field2749, false);
        }
    }

    @ObfuscatedName("client.d(I)V")
    public final void method507() {
        boolean var1;
        label205: {
            try {
                if (class187.field3011 == 2) {
                    if (Statics.field1144 == null) {
                        Statics.field1144 = class184.method3337(Statics.field801, Statics.field1824, Statics.field3016);
                        if (Statics.field1144 == null) {
                            var1 = false;
                            break label205;
                        }
                    }
                    if (Statics.field220 == null) {
                        Statics.field220 = new class63(Statics.field3013, Statics.field3015);
                    }
                    if (Statics.field3014.method3441(Statics.field1144, Statics.field3012, Statics.field220, 22050)) {
                        Statics.field3014.method3414();
                        Statics.field3014.method3411(Statics.field3017);
                        Statics.field3014.method3415(Statics.field1144, Statics.field3018);
                        class187.field3011 = 0;
                        Statics.field1144 = null;
                        Statics.field220 = null;
                        Statics.field801 = null;
                        var1 = true;
                        break label205;
                    }
                }
            } catch (Exception var29) {
                var29.printStackTrace();
                Statics.field3014.method3494();
                class187.field3011 = 0;
                Statics.field1144 = null;
                Statics.field220 = null;
                Statics.field801 = null;
            }
            var1 = false;
        }
        if (var1 && field540 && Statics.field684 != null) {
            Statics.field684.method1183();
        }
        if (field386 == 10 || field386 == 20 || field386 == 30) {
            if (field423 != 0L && class119.method719() > field423) {
                int var4 = field329 ? 2 : 1;
                field423 = 0L;
                if (var4 >= 2) {
                    field329 = true;
                } else {
                    field329 = false;
                }
                method2863();
                if (field386 >= 25) {
                    method1523();
                }
                field2254 = true;
            } else if (field2247) {
                method2969();
            }
        }
        Dimension var5 = this.method2902();
        if (Statics.field2013 != var5.width || Statics.field277 != var5.height || field2248) {
            method2863();
            field423 = class119.method719() + 500L;
            field2248 = false;
        }
        boolean var6 = false;
        if (field2254) {
            field2254 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field495[var7] = true;
            }
        }
        if (var6) {
            method2603();
        }
        if (field386 == 0) {
            int var8 = class34.field757;
            String var9 = class34.field770;
            Color var10 = null;
            try {
                Graphics var11 = Statics.field2694.getGraphics();
                if (Statics.field685 == null) {
                    Statics.field685 = new Font("Helvetica", 1, 13);
                    Statics.field2747 = Statics.field2694.getFontMetrics(Statics.field685);
                }
                if (var6) {
                    var11.setColor(Color.black);
                    var11.fillRect(0, 0, Statics.field1268, Statics.field1429);
                }
                if (var10 == null) {
                    var10 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1825 == null) {
                        Statics.field1825 = Statics.field2694.createImage(304, 34);
                    }
                    Graphics var12 = Statics.field1825.getGraphics();
                    var12.setColor(var10);
                    var12.drawRect(0, 0, 303, 33);
                    var12.fillRect(2, 2, var8 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(1, 1, 301, 31);
                    var12.fillRect(var8 * 3 + 2, 2, 300 - var8 * 3, 30);
                    var12.setFont(Statics.field685);
                    var12.setColor(Color.white);
                    var12.drawString(var9, (304 - Statics.field2747.stringWidth(var9)) / 2, 22);
                    var11.drawImage(Statics.field1825, Statics.field1268 / 2 - 152, Statics.field1429 / 2 - 18, (ImageObserver) null);
                } catch (Exception var25) {
                    int var14 = Statics.field1268 / 2 - 152;
                    int var15 = Statics.field1429 / 2 - 18;
                    var11.setColor(var10);
                    var11.drawRect(var14, var15, 303, 33);
                    var11.fillRect(var14 + 2, var15 + 2, var8 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(var14 + 1, var15 + 1, 301, 31);
                    var11.fillRect(var8 * 3 + var14 + 2, var15 + 2, 300 - var8 * 3, 30);
                    var11.setFont(Statics.field685);
                    var11.setColor(Color.white);
                    var11.drawString(var9, var14 + (304 - Statics.field2747.stringWidth(var9)) / 2, var15 + 22);
                }
            } catch (Exception var26) {
                Statics.field2694.repaint();
            }
        } else if (field386 == 5) {
            class34.method2693(Statics.field812, Statics.field738, Statics.field2124, var6);
        } else if (field386 == 10 || field386 == 11) {
            class34.method2693(Statics.field812, Statics.field738, Statics.field2124, var6);
        } else if (field386 == 20) {
            class34.method2693(Statics.field812, Statics.field738, Statics.field2124, var6);
        } else if (field386 == 25) {
            if (field362 == 1) {
                if (field358 > field359) {
                    field359 = field358;
                }
                int var17 = (field359 * 50 - field358 * 50) / field359;
                method3020(class161.field2517 + class2.field25 + class2.field22 + var17 + "%" + class2.field19, false);
            } else if (field362 == 2) {
                if (field360 > field302) {
                    field302 = field360;
                }
                int var18 = (field302 * 50 - field360 * 50) / field302 + 50;
                method3020(class161.field2517 + class2.field25 + class2.field22 + var18 + "%" + class2.field19, false);
            } else {
                method3020(class161.field2517, false);
            }
        } else if (field386 == 30) {
            Statics.method2992();
        } else if (field386 == 40) {
            method3020(class161.field2366 + class2.field25 + class161.field2367, false);
        } else if (field386 == 45) {
            method3020(class161.field2511, false);
        }
        if (field386 == 30 && field403 == 0 && !var6) {
            try {
                Graphics var19 = Statics.field2694.getGraphics();
                for (int var20 = 0; var20 < field426; var20++) {
                    if (field507[var20]) {
                        Statics.field3217.method1555(var19, field577[var20], field510[var20], field511[var20], field512[var20]);
                        field507[var20] = false;
                    }
                }
            } catch (Exception var28) {
                Statics.field2694.repaint();
            }
        } else if (field386 > 0) {
            try {
                Graphics var22 = Statics.field2694.getGraphics();
                Statics.field3217.method1553(var22, 0, 0);
                for (int var23 = 0; var23 < field426; var23++) {
                    field507[var23] = false;
                }
            } catch (Exception var27) {
                Statics.field2694.repaint();
            }
        }
    }

    @ObfuscatedName("client.l(B)V")
    public final void method235() {
        if (Statics.field85.method227()) {
            Statics.field85.method201();
        }
        if (Statics.field312 != null) {
            Statics.field312.field214 = false;
        }
        Statics.field312 = null;
        if (Statics.field994 != null) {
            Statics.field994.method2875();
            Statics.field994 = null;
        }
        if (class141.field2174 != null) {
            class141 var1 = class141.field2174;
            synchronized (class141.field2174) {
                class141.field2174 = null;
            }
        }
        class144.method56();
        Statics.field1218 = null;
        if (Statics.field684 != null) {
            Statics.field684.method1224();
        }
        if (Statics.field653 != null) {
            Statics.field653.method1224();
        }
        if (Statics.field2769 != null) {
            Statics.field2769.method2875();
        }
        class174.method1637();
        class153.method2110();
    }

    @ObfuscatedName("dx.m(II)V")
    public static void method2342(int arg0) {
        if (field386 == arg0) {
            return;
        }
        if (field386 == 0) {
            class148.method2666();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field336 = 0;
            field367 = 0;
            field488 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1251 != null) {
            Statics.field1251.method2875();
            Statics.field1251 = null;
        }
        if (field386 == 25) {
            field362 = 0;
            field358 = 0;
            field359 = 1;
            field360 = 0;
            field302 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class34.method4(Statics.field2694, Statics.field2140, Statics.field1200, true, 0);
        } else if (arg0 == 20) {
            class34.method4(Statics.field2694, Statics.field2140, Statics.field1200, true, field386 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class34.method4(Statics.field2694, Statics.field2140, Statics.field1200, false, 4);
        } else {
            class34.method525();
        }
        field386 = arg0;
    }

    @ObfuscatedName("client.j(I)V")
    public void method236() {
        if (field386 == 1000) {
            return;
        }
        long var1 = class119.method719();
        int var3 = (int) (var1 - Statics.field2708);
        Statics.field2708 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class175.field2762 += var3;
        boolean var4;
        if (class175.field2771 == 0 && class175.field2761 == 0 && class175.field2778 == 0 && class175.field2764 == 0) {
            var4 = true;
        } else if (Statics.field2769 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class175.field2762 > 30000) {
                        throw new IOException();
                    }
                    while (class175.field2761 < 20 && class175.field2764 > 0) {
                        class176 var5 = (class176) class175.field2763.method3567();
                        class123 var6 = new class123(4);
                        var6.method2389(1);
                        var6.method2391((int) var5.field3176);
                        Statics.field2769.method2874(var6.field2049, 0, 4);
                        class175.field2765.method3565(var5, var5.field3176);
                        class175.field2764--;
                        class175.field2761++;
                    }
                    while (class175.field2771 < 20 && class175.field2778 > 0) {
                        class176 var7 = (class176) class175.field2766.method3659();
                        class123 var8 = new class123(4);
                        var8.method2389(0);
                        var8.method2391((int) var7.field3176);
                        Statics.field2769.method2874(var8.field2049, 0, 4);
                        var7.method3676();
                        class175.field2770.method3565(var7, var7.field3176);
                        class175.field2778--;
                        class175.field2771++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2769.method2872();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class175.field2762 = 0;
                        byte var11 = 0;
                        if (Statics.field3063 == null) {
                            var11 = 8;
                        } else if (class175.field2767 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class175.field2779.field2046;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2769.method2873(class175.field2779.field2049, class175.field2779.field2046, var12);
                            if (class175.field2777 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class175.field2779.field2049[class175.field2779.field2046 + var13] ^= class175.field2777;
                                }
                            }
                            class175.field2779.field2046 += var12;
                            if (class175.field2779.field2046 < var11) {
                                break;
                            }
                            if (Statics.field3063 == null) {
                                class175.field2779.field2046 = 0;
                                int var14 = class175.field2779.method2404();
                                int var15 = class175.field2779.method2406();
                                int var16 = class175.field2779.method2404();
                                int var17 = class175.field2779.method2409();
                                long var18 = (long) ((var14 << 16) + var15);
                                class176 var20 = (class176) class175.field2765.method3564(var18);
                                Statics.field2772 = true;
                                if (var20 == null) {
                                    var20 = (class176) class175.field2770.method3564(var18);
                                    Statics.field2772 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3063 = var20;
                                Statics.field256 = new class123(var17 + var21 + Statics.field3063.field2785);
                                Statics.field256.method2389(var16);
                                Statics.field256.method2569(var17);
                                class175.field2767 = 8;
                                class175.field2779.field2046 = 0;
                            } else if (class175.field2767 == 0) {
                                if (class175.field2779.field2049[0] == -1) {
                                    class175.field2767 = 1;
                                    class175.field2779.field2046 = 0;
                                } else {
                                    Statics.field3063 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field256.field2049.length - Statics.field3063.field2785;
                            int var23 = 512 - class175.field2767;
                            if (var23 > var22 - Statics.field256.field2046) {
                                var23 = var22 - Statics.field256.field2046;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2769.method2873(Statics.field256.field2049, Statics.field256.field2046, var23);
                            if (class175.field2777 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field256.field2049[Statics.field256.field2046 + var24] ^= class175.field2777;
                                }
                            }
                            Statics.field256.field2046 += var23;
                            class175.field2767 += var23;
                            if (Statics.field256.field2046 == var22) {
                                if (Statics.field3063.field3176 == 16711935L) {
                                    Statics.field707 = Statics.field256;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class172 var26 = class175.field2776[var25];
                                        if (var26 != null) {
                                            Statics.field707.field2046 = var25 * 8 + 5;
                                            int var27 = Statics.field707.method2409();
                                            int var28 = Statics.field707.method2409();
                                            var26.method3164(var27, var28);
                                        }
                                    }
                                } else {
                                    class175.field2775.reset();
                                    class175.field2775.update(Statics.field256.field2049, 0, var22);
                                    int var29 = (int) class175.field2775.getValue();
                                    if (Statics.field3063.field2784 != var29) {
                                        try {
                                            Statics.field2769.method2875();
                                        } catch (Exception var35) {
                                        }
                                        class175.field2774++;
                                        Statics.field2769 = null;
                                        class175.field2777 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class175.field2774 = 0;
                                    class175.field2773 = 0;
                                    Statics.field3063.field2791.method3165((int) (Statics.field3063.field3176 & 0xFFFFL), Statics.field256.field2049, (Statics.field3063.field3176 & 0xFF0000L) == 16711680L, Statics.field2772);
                                }
                                Statics.field3063.method3706();
                                if (Statics.field2772) {
                                    class175.field2761--;
                                } else {
                                    class175.field2771--;
                                }
                                class175.field2767 = 0;
                                Statics.field3063 = null;
                                Statics.field256 = null;
                            } else {
                                if (class175.field2767 != 512) {
                                    break;
                                }
                                class175.field2767 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2769.method2875();
                } catch (Exception var34) {
                }
                class175.field2773++;
                Statics.field2769 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method237();
        }
    }

    @ObfuscatedName("client.y(I)V")
    public void method237() {
        if (class175.field2774 >= 4) {
            this.method2897("js5crc");
            field386 = 1000;
            return;
        }
        if (class175.field2773 >= 4) {
            if (field386 <= 5) {
                this.method2897("js5io");
                field386 = 1000;
                return;
            }
            field331 = 3000;
            class175.field2773 = 3;
        }
        if (--field331 + 1 > 0) {
            return;
        }
        try {
            if (field330 == 0) {
                Statics.field2017 = Statics.field899.method2772(Statics.field1079, Statics.field1409);
                field330++;
            }
            if (field330 == 1) {
                if (Statics.field2017.field2266 == 2) {
                    this.method238(-1);
                    return;
                }
                if (Statics.field2017.field2266 == 1) {
                    field330++;
                }
            }
            if (field330 == 2) {
                Statics.field665 = new class147((Socket) Statics.field2017.field2271, Statics.field899);
                class123 var1 = new class123(5);
                var1.method2389(15);
                var1.method2569(126);
                Statics.field665.method2874(var1.field2049, 0, 5);
                field330++;
                Statics.field818 = class119.method719();
            }
            if (field330 == 3) {
                if (field386 <= 5 || Statics.field665.method2872() > 0) {
                    int var2 = Statics.field665.method2871();
                    if (var2 != 0) {
                        this.method238(var2);
                        return;
                    }
                    field330++;
                } else if (class119.method719() - Statics.field818 > 30000L) {
                    this.method238(-2);
                    return;
                }
            }
            if (field330 == 4) {
                class175.method768(Statics.field665, field386 > 20);
                Statics.field2017 = null;
                Statics.field665 = null;
                field330 = 0;
                field335 = 0;
            }
        } catch (IOException var4) {
            this.method238(-3);
        }
    }

    @ObfuscatedName("client.s(II)V")
    public void method238(int arg0) {
        Statics.field2017 = null;
        Statics.field665 = null;
        field330 = 0;
        if (Statics.field1409 == Statics.field1127) {
            Statics.field1409 = Statics.field1732;
        } else {
            Statics.field1409 = Statics.field1127;
        }
        field335++;
        if (field335 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field386 <= 5) {
                this.method2897("js5connect_full");
                field386 = 1000;
            } else {
                field331 = 3000;
            }
        } else if (field335 >= 2 && arg0 == 6) {
            this.method2897("js5connect_outofdate");
            field386 = 1000;
        } else if (field335 >= 4) {
            if (field386 <= 5) {
                this.method2897("js5connect");
                field386 = 1000;
            } else {
                field331 = 3000;
            }
        }
    }

    @ObfuscatedName("cj.p(B)V")
    public static void method1627() {
        if (field399 == 0) {
            Statics.field2091 = new class90(4, 104, 104, class6.field96);
            for (int var0 = 0; var0 < 4; var0++) {
                field410[var0] = new class112(104, 104);
            }
            Statics.field2954 = new class82(512, 512);
            class34.field770 = class161.field2398;
            class34.field757 = 5;
            field399 = 20;
        } else if (field399 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class95.field1624[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class90.method1869(var1, 500, 800, 512, 334);
            class34.field770 = class161.field2415;
            class34.field757 = 10;
            field399 = 30;
        } else if (field399 == 30) {
            Statics.field332 = method49(0, false, true, true);
            Statics.field2008 = method49(1, false, true, true);
            Statics.field234 = method49(2, true, false, true);
            Statics.field599 = method49(3, false, true, true);
            Statics.field1930 = method49(4, false, true, true);
            Statics.field174 = method49(5, true, true, true);
            Statics.field477 = method49(6, true, true, false);
            Statics.field1689 = method49(7, false, true, true);
            Statics.field1200 = method49(8, false, true, true);
            Statics.field334 = method49(9, false, true, true);
            Statics.field2140 = method49(10, false, true, true);
            Statics.field105 = method49(11, false, true, true);
            Statics.field2016 = method49(12, false, true, true);
            Statics.field2706 = method49(13, true, false, true);
            Statics.field2180 = method49(14, false, true, false);
            Statics.field673 = method49(15, false, true, true);
            class34.field770 = class161.field2370;
            class34.field757 = 20;
            field399 = 40;
        } else if (field399 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field332.method3162() * 4 / 100;
            int var8 = var7 + Statics.field2008.method3162() * 4 / 100;
            int var9 = var8 + Statics.field234.method3162() * 2 / 100;
            int var10 = var9 + Statics.field599.method3162() * 2 / 100;
            int var11 = var10 + Statics.field1930.method3162() * 6 / 100;
            int var12 = var11 + Statics.field174.method3162() * 4 / 100;
            int var13 = var12 + Statics.field477.method3162() * 2 / 100;
            int var14 = var13 + Statics.field1689.method3162() * 60 / 100;
            int var15 = var14 + Statics.field1200.method3162() * 2 / 100;
            int var16 = var15 + Statics.field334.method3162() * 2 / 100;
            int var17 = var16 + Statics.field2140.method3162() * 2 / 100;
            int var18 = var17 + Statics.field105.method3162() * 2 / 100;
            int var19 = var18 + Statics.field2016.method3162() * 2 / 100;
            int var20 = var19 + Statics.field2706.method3162() * 2 / 100;
            int var21 = var20 + Statics.field2180.method3162() * 2 / 100;
            int var22 = var21 + Statics.field673.method3162() * 2 / 100;
            if (var22 == 100) {
                class34.field770 = class161.field2372;
                class34.field757 = 30;
                field399 = 45;
            } else {
                if (var22 != 0) {
                    class34.field770 = class161.field2371 + var22 + "%";
                }
                class34.field757 = 30;
            }
        } else if (field399 == 45) {
            boolean var23 = !field305;
            Statics.field1240 = 22050;
            Statics.field3222 = var23;
            Statics.field1232 = 2;
            class188 var24 = new class188();
            var24.method3417(9, 128);
            Statics.field684 = class60.method3061(Statics.field899, Statics.field2694, 0, 22050);
            Statics.field684.method1228(var24);
            class187.method3185(Statics.field673, Statics.field2180, Statics.field1930, var24);
            Statics.field653 = class60.method3061(Statics.field899, Statics.field2694, 1, 2048);
            Statics.field12 = new class59();
            Statics.field653.method1228(Statics.field12);
            Statics.field2080 = new class78(22050, Statics.field1240);
            class34.field770 = class161.field2373;
            class34.field757 = 35;
            field399 = 50;
        } else if (field399 == 50) {
            int var25 = 0;
            if (Statics.field738 == null) {
                Statics.field738 = class80.method854(Statics.field1200, Statics.field2706, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field2124 == null) {
                Statics.field2124 = class80.method854(Statics.field1200, Statics.field2706, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field812 == null) {
                Statics.field812 = class80.method854(Statics.field1200, Statics.field2706, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class34.field770 = class161.field2374 + var25 * 100 / 3 + "%";
                class34.field757 = 40;
            } else {
                Statics.field2651 = new class164(true);
                class34.field770 = class161.field2375;
                class34.field757 = 40;
                field399 = 60;
            }
        } else if (field399 == 60) {
            class172 var26 = Statics.field2140;
            class172 var27 = Statics.field1200;
            int var28 = 0;
            if (var26.method3154("title.jpg", "")) {
                var28++;
            }
            if (var27.method3154("logo", "")) {
                var28++;
            }
            if (var27.method3154("logo_deadman_mode", "")) {
                var28++;
            }
            if (var27.method3154("titlebox", "")) {
                var28++;
            }
            if (var27.method3154("titlebutton", "")) {
                var28++;
            }
            if (var27.method3154("runes", "")) {
                var28++;
            }
            if (var27.method3154("title_mute", "")) {
                var28++;
            }
            if (var27.method3102("options_radio_buttons,0")) {
                var28++;
            }
            if (var27.method3102("options_radio_buttons,2")) {
                var28++;
            }
            var27.method3154("sl_back", "");
            var27.method3154("sl_flags", "");
            var27.method3154("sl_arrows", "");
            var27.method3154("sl_stars", "");
            var27.method3154("sl_button", "");
            int var31 = class34.method518();
            if (var28 < var31) {
                class34.field770 = class161.field2376 + var28 * 100 / var31 + "%";
                class34.field757 = 50;
            } else {
                class34.field770 = class161.field2474;
                class34.field757 = 50;
                method2342(5);
                field399 = 70;
            }
        } else if (field399 == 70) {
            if (Statics.field234.method3109()) {
                class49.method653(Statics.field234);
                class44.method721(Statics.field234);
                class172 var32 = Statics.field234;
                class172 var33 = Statics.field1689;
                Statics.field1055 = var32;
                Statics.field1047 = var33;
                Statics.field2713 = Statics.field1055.method3093(3);
                class43.method145(Statics.field234, Statics.field1689, field305);
                class172 var34 = Statics.field234;
                class172 var35 = Statics.field1689;
                Statics.field920 = var34;
                Statics.field906 = var35;
                class172 var36 = Statics.field234;
                class172 var37 = Statics.field1689;
                boolean var38 = field304;
                class228 var39 = Statics.field738;
                Statics.field2097 = var36;
                Statics.field1167 = var37;
                Statics.field3265 = var38;
                Statics.field1158 = Statics.field2097.method3093(10);
                Statics.field1508 = var39;
                class172 var40 = Statics.field234;
                class172 var41 = Statics.field332;
                class172 var42 = Statics.field2008;
                Statics.field1011 = var40;
                Statics.field1008 = var41;
                Statics.field1009 = var42;
                class172 var43 = Statics.field234;
                class172 var44 = Statics.field1689;
                Statics.field1039 = var43;
                Statics.field1032 = var44;
                class51.method186(Statics.field234);
                class172 var45 = Statics.field234;
                Statics.field3216 = var45;
                Statics.field1221 = Statics.field3216.method3093(16);
                class172 var46 = Statics.field599;
                class172 var47 = Statics.field1689;
                class172 var48 = Statics.field1200;
                class172 var49 = Statics.field2706;
                Statics.field1946 = var46;
                Statics.field2794 = var47;
                Statics.field2795 = var48;
                Statics.field2833 = var49;
                Statics.field2824 = new class177[Statics.field1946.method3094()][];
                Statics.field2793 = new boolean[Statics.field1946.method3094()];
                class55.method804(Statics.field234);
                class53.method3255(Statics.field234);
                class48.method2022(Statics.field234);
                class54.method1828(Statics.field234);
                Statics.field85 = new class20();
                class172 var50 = Statics.field234;
                class172 var51 = Statics.field1200;
                class172 var52 = Statics.field2706;
                Statics.field1128 = var50;
                Statics.field1116 = var51;
                Statics.field1103 = var52;
                class172 var53 = Statics.field234;
                class172 var54 = Statics.field1200;
                Statics.field1083 = var53;
                Statics.field2194 = var54;
                class34.field770 = class161.field2379;
                class34.field757 = 60;
                field399 = 80;
            } else {
                class34.field770 = class161.field2417 + Statics.field234.method3168() + "%";
                class34.field757 = 60;
            }
        } else if (field399 == 80) {
            int var55 = 0;
            if (Statics.field1108 == null) {
                class172 var56 = Statics.field1200;
                int var57 = var56.method3098("compass");
                int var58 = var56.method3099(var57, "");
                class82 var59 = class80.method14(var56, var57, var58);
                Statics.field1108 = var59;
            } else {
                var55++;
            }
            if (Statics.field2033 == null) {
                class172 var60 = Statics.field1200;
                int var61 = var60.method3098("mapedge");
                int var62 = var60.method3099(var61, "");
                class82 var63 = class80.method14(var60, var61, var62);
                Statics.field2033 = var63;
            } else {
                var55++;
            }
            if (Statics.field2280 == null) {
                Statics.field2280 = class80.method1038(Statics.field1200, "mapscene", "");
            } else {
                var55++;
            }
            if (Statics.field805 == null) {
                Statics.field805 = class80.method728(Statics.field1200, "mapfunction", "");
            } else {
                var55++;
            }
            if (Statics.field65 == null) {
                Statics.field65 = class80.method728(Statics.field1200, "headicons_pk", "");
            } else {
                var55++;
            }
            if (Statics.field1402 == null) {
                Statics.field1402 = class80.method728(Statics.field1200, "headicons_prayer", "");
            } else {
                var55++;
            }
            if (Statics.field2131 == null) {
                Statics.field2131 = class80.method728(Statics.field1200, "headicons_hint", "");
            } else {
                var55++;
            }
            if (Statics.field67 == null) {
                Statics.field67 = class80.method728(Statics.field1200, "mapmarker", "");
            } else {
                var55++;
            }
            if (Statics.field640 == null) {
                Statics.field640 = class80.method728(Statics.field1200, "cross", "");
            } else {
                var55++;
            }
            if (Statics.field1589 == null) {
                Statics.field1589 = class80.method728(Statics.field1200, "mapdots", "");
            } else {
                var55++;
            }
            if (Statics.field3223 == null) {
                Statics.field3223 = class80.method1038(Statics.field1200, "scrollbar", "");
            } else {
                var55++;
            }
            if (Statics.field380 == null) {
                Statics.field380 = class80.method1038(Statics.field1200, "mod_icons", "");
            } else {
                var55++;
            }
            if (var55 < 12) {
                class34.field770 = class161.field2380 + var55 * 100 / 12 + "%";
                class34.field757 = 70;
            } else {
                Statics.field3247 = Statics.field380;
                Statics.field2033.method1647();
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 41.0D) - 20;
                for (int var68 = 0; var68 < Statics.field805.length; var68++) {
                    Statics.field805[var68].method1643(var64 + var67, var65 + var67, var66 + var67);
                }
                Statics.field2280[0].method1799(var64 + var67, var65 + var67, var66 + var67);
                class34.field770 = class161.field2381;
                class34.field757 = 70;
                field399 = 90;
            }
        } else if (field399 == 90) {
            if (Statics.field334.method3109()) {
                class99 var69 = new class99(Statics.field334, Statics.field1200, 20, 0.8D, field305 ? 64 : 128);
                class95.method2029(var69);
                class95.method2062(0.8D);
                class34.field770 = class161.field2383;
                class34.field757 = 90;
                field399 = 110;
            } else {
                class34.field770 = class161.field2626 + Statics.field334.method3168() + "%";
                class34.field757 = 90;
            }
        } else if (field399 == 110) {
            Statics.field312 = new class14();
            Statics.field899.method2773(Statics.field312, 10);
            class34.field770 = class161.field2384;
            class34.field757 = 94;
            field399 = 120;
        } else if (field399 == 120) {
            if (Statics.field2140.method3154("huffman", "")) {
                class117 var70 = new class117(Statics.field2140.method3100("huffman", ""));
                Statics.field3237 = var70;
                class34.field770 = class161.field2386;
                class34.field757 = 96;
                field399 = 130;
            } else {
                class34.field770 = class161.field2385 + "%";
                class34.field757 = 96;
            }
        } else if (field399 == 130) {
            if (!Statics.field599.method3109()) {
                class34.field770 = class161.field2387 + Statics.field599.method3168() * 4 / 5 + "%";
                class34.field757 = 100;
            } else if (!Statics.field2016.method3109()) {
                class34.field770 = class161.field2387 + (80 + Statics.field2016.method3168() / 6) + "%";
                class34.field757 = 100;
            } else if (Statics.field2706.method3109()) {
                class34.field770 = class161.field2388;
                class34.field757 = 100;
                field399 = 140;
            } else {
                class34.field770 = class161.field2387 + (96 + Statics.field2706.method3168() / 20) + "%";
                class34.field757 = 100;
            }
        } else if (field399 == 140) {
            method2342(10);
        }
    }

    @ObfuscatedName("e.v(IZZZB)Lfp;")
    public static class172 method49(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class138 var4 = null;
        if (class153.field2287 != null) {
            var4 = new class138(arg0, class153.field2287, Statics.field2026[arg0], 1000000);
        }
        return new class172(var4, Statics.field1222, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dk.r(I)V")
    public static final void method2701() {
        try {
            if (field336 == 0) {
                if (Statics.field994 != null) {
                    Statics.field994.method2875();
                    Statics.field994 = null;
                }
                Statics.field2782 = null;
                field357 = false;
                field367 = 0;
                field336 = 1;
            }
            if (field336 == 1) {
                if (Statics.field2782 == null) {
                    Statics.field2782 = Statics.field899.method2772(Statics.field1079, Statics.field1409);
                }
                if (Statics.field2782.field2266 == 2) {
                    throw new IOException();
                }
                if (Statics.field2782.field2266 == 1) {
                    Statics.field994 = new class147((Socket) Statics.field2782.field2271, Statics.field899);
                    Statics.field2782 = null;
                    field336 = 2;
                }
            }
            if (field336 == 2) {
                field379.field2046 = 0;
                field379.method2389(14);
                Statics.field994.method2874(field379.field2049, 0, 1);
                field348.field2046 = 0;
                field336 = 3;
            }
            if (field336 == 3) {
                if (Statics.field684 != null) {
                    Statics.field684.method1221();
                }
                if (Statics.field653 != null) {
                    Statics.field653.method1221();
                }
                int var0 = Statics.field994.method2871();
                if (Statics.field684 != null) {
                    Statics.field684.method1221();
                }
                if (Statics.field653 != null) {
                    Statics.field653.method1221();
                }
                if (var0 != 0) {
                    method5(var0);
                    return;
                }
                field348.field2046 = 0;
                field336 = 5;
            }
            if (field336 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field379.field2046 = 0;
                field379.method2389(1);
                field379.method2389(class34.field766.method527());
                field379.method2569(var1[0]);
                field379.method2569(var1[1]);
                field379.method2569(var1[2]);
                field379.method2569(var1[3]);
                switch(class34.field766.field2652) {
                    case 0:
                        field379.field2046 += 8;
                        break;
                    case 1:
                    case 2:
                        field379.method2391(Statics.field2337);
                        field379.field2046 += 5;
                        break;
                    case 3:
                        field379.method2569((Integer) Statics.field43.field156.get(class167.method3053(class34.field764)));
                        field379.field2046 += 4;
                }
                field379.method2395(class34.field765);
                field379.method2425(class5.field84, class5.field78);
                field347.field2046 = 0;
                if (field386 == 40) {
                    field347.method2389(18);
                } else {
                    field347.method2389(16);
                }
                field347.method2561(0);
                int var2 = field347.field2046;
                field347.method2569(126);
                field347.method2441(field379.field2049, 0, field379.field2046);
                int var3 = field347.field2046;
                field347.method2395(class34.field764);
                field347.method2389((field329 ? 1 : 0) << 1 | (field305 ? 1 : 0));
                field347.method2561(Statics.field1268);
                field347.method2561(Statics.field1429);
                class126 var4 = field347;
                byte[] var5 = new byte[24];
                try {
                    class153.field2284.method3922(0L);
                    class153.field2284.method3924(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var28) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2441(var5, 0, 24);
                field347.method2395(Statics.field80);
                field347.method2569(Statics.field345);
                class123 var9 = new class123(Statics.field2651.method2996());
                Statics.field2651.method2995(var9);
                field347.method2441(var9.field2049, 0, var9.field2049.length);
                field347.method2389(Statics.field2786);
                field347.method2569(Statics.field332.field2728);
                field347.method2569(Statics.field2008.field2728);
                field347.method2569(Statics.field234.field2728);
                field347.method2569(Statics.field599.field2728);
                field347.method2569(Statics.field1930.field2728);
                field347.method2569(Statics.field174.field2728);
                field347.method2569(Statics.field477.field2728);
                field347.method2569(Statics.field1689.field2728);
                field347.method2569(Statics.field1200.field2728);
                field347.method2569(Statics.field334.field2728);
                field347.method2569(Statics.field2140.field2728);
                field347.method2569(Statics.field105.field2728);
                field347.method2569(Statics.field2016.field2728);
                field347.method2569(Statics.field2706.field2728);
                field347.method2569(Statics.field2180.field2728);
                field347.method2569(Statics.field673.field2728);
                field347.method2489(var1, var3, field347.field2046);
                field347.method2496(field347.field2046 - var2);
                Statics.field994.method2874(field347.field2049, 0, field347.field2046);
                field379.method2643(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field348.method2643(var1);
                field336 = 6;
            }
            if (field336 == 6 && Statics.field994.method2872() > 0) {
                int var11 = Statics.field994.method2871();
                if (var11 == 21 && field386 == 20) {
                    field336 = 7;
                } else if (var11 == 2) {
                    field336 = 9;
                } else if (var11 == 15 && field386 == 40) {
                    field349 = -1;
                    field336 = 13;
                } else if (var11 == 23 && field488 < 1) {
                    field488++;
                    field336 = 0;
                } else if (var11 == 29) {
                    field336 = 11;
                } else {
                    method5(var11);
                    return;
                }
            }
            if (field336 == 7 && Statics.field994.method2872() > 0) {
                field339 = (Statics.field994.method2871() + 3) * 60;
                field336 = 8;
            }
            if (field336 == 8) {
                field367 = 0;
                class34.method89(class161.field2604, class161.field2393, field339 / 60 + class161.field2394);
                if (--field339 <= 0) {
                    field336 = 0;
                }
            } else {
                if (field336 == 9 && Statics.field994.method2872() >= 13) {
                    boolean var12 = Statics.field994.method2871() == 1;
                    Statics.field994.method2873(field348.field2049, 0, 4);
                    field348.field2046 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field348.method2648() << 24;
                        int var15 = var14 | field348.method2648() << 16;
                        int var16 = var15 | field348.method2648() << 8;
                        int var17 = var16 | field348.method2648();
                        int var18 = class167.method3053(class34.field764);
                        if (Statics.field43.field156.size() >= 10 && !Statics.field43.field156.containsKey(var18)) {
                            Iterator var19 = Statics.field43.field156.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field43.field156.put(var18, var17);
                        class9.method2679();
                    }
                    field466 = Statics.field994.method2871();
                    field517 = Statics.field994.method2871() == 1;
                    field425 = Statics.field994.method2871();
                    field425 <<= 0x8;
                    field425 += Statics.field994.method2871();
                    field354 = Statics.field994.method2871();
                    Statics.field994.method2873(field348.field2049, 0, 1);
                    field348.field2046 = 0;
                    field350 = field348.method2648();
                    Statics.field994.method2873(field348.field2049, 0, 2);
                    field348.field2046 = 0;
                    field349 = field348.method2406();
                    try {
                        client var20 = Statics.field2707;
                        JSObject.getWindow(var20).call("zap", (Object[]) null);
                    } catch (Throwable var27) {
                    }
                    field336 = 10;
                }
                if (field336 != 10) {
                    if (field336 == 11 && Statics.field994.method2872() >= 2) {
                        field348.field2046 = 0;
                        Statics.field994.method2873(field348.field2049, 0, 2);
                        field348.field2046 = 0;
                        Statics.field138 = field348.method2406();
                        field336 = 12;
                    }
                    if (field336 == 12 && Statics.field994.method2872() >= Statics.field138) {
                        field348.field2046 = 0;
                        Statics.field994.method2873(field348.field2049, 0, Statics.field138);
                        field348.field2046 = 0;
                        String var22 = field348.method2412();
                        String var23 = field348.method2412();
                        String var24 = field348.method2412();
                        class34.method89(var22, var23, var24);
                        method2342(10);
                    }
                    if (field336 == 13) {
                        if (field349 == -1) {
                            if (Statics.field994.method2872() < 2) {
                                return;
                            }
                            Statics.field994.method2873(field348.field2049, 0, 2);
                            field348.field2046 = 0;
                            field349 = field348.method2406();
                        }
                        if (Statics.field994.method2872() >= field349) {
                            Statics.field994.method2873(field348.field2049, 0, field349);
                            field348.field2046 = 0;
                            int var25 = field349;
                            method168();
                            class35.method53(field348);
                            if (field348.field2046 != var25) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field367++;
                        if (field367 > 2000) {
                            if (field488 < 1) {
                                if (Statics.field1409 == Statics.field1127) {
                                    Statics.field1409 = Statics.field1732;
                                } else {
                                    Statics.field1409 = Statics.field1127;
                                }
                                field488++;
                                field336 = 0;
                            } else {
                                method5(-3);
                            }
                        }
                    }
                } else if (Statics.field994.method2872() >= field349) {
                    field348.field2046 = 0;
                    Statics.field994.method2873(field348.field2049, 0, field349);
                    method740();
                    class35.method53(field348);
                    Statics.field2066 = -1;
                    method2092(false);
                    field350 = -1;
                }
            }
        } catch (IOException var29) {
            if (field488 < 1) {
                if (Statics.field1409 == Statics.field1127) {
                    Statics.field1409 = Statics.field1732;
                } else {
                    Statics.field1409 = Statics.field1127;
                }
                field488++;
                field336 = 0;
            } else {
                method5(-2);
            }
        }
    }

    @ObfuscatedName("aw.c(B)V")
    public static void method740() {
        field526 = 1L;
        field371 = -1;
        Statics.field312.field212 = 0;
        Statics.field834 = true;
        field563 = true;
        field527 = -1L;
        class215.field3188 = new class206();
        field379.field2046 = 0;
        field348.field2046 = 0;
        field350 = -1;
        field353 = -1;
        field422 = -1;
        field355 = -1;
        field351 = 0;
        field318 = 0;
        field356 = 0;
        field307 = 0;
        field411 = 0;
        field442 = false;
        class144.field2200 = 0;
        class12.method156();
        field454 = 0;
        field456 = false;
        field543 = 0;
        field301 = (int) (Math.random() * 100.0D) - 50;
        field369 = (int) (Math.random() * 110.0D) - 55;
        field499 = (int) (Math.random() * 80.0D) - 40;
        field482 = (int) (Math.random() * 120.0D) - 60;
        field376 = (int) (Math.random() * 30.0D) - 20;
        field388 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field404 = 0;
        field473 = -1;
        field535 = 0;
        field435 = 0;
        field327 = class22.field608;
        field328 = class22.field608;
        field342 = 0;
        class35.field780 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class35.field785[var0] = null;
            class35.field778[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field420[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field341[var2] = null;
        }
        field433 = -1;
        field436.method3615();
        field437.method3615();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field434[var3][var4][var5] = null;
                }
            }
        }
        field572 = new class203();
        field570 = 0;
        field569 = 0;
        field573 = 0;
        for (int var6 = 0; var6 < Statics.field1221; var6++) {
            class57 var7 = class57.method948(var6);
            if (var7 != null) {
                class180.field2957[var6] = 0;
                class180.field2955[var6] = 0;
            }
        }
        Statics.field85.method199();
        field567 = -1;
        if (field374 != -1) {
            int var8 = field374;
            if (var8 != -1 && Statics.field2793[var8]) {
                Statics.field1946.method3095(var8);
                if (Statics.field2824[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2824[var8].length; var10++) {
                        if (Statics.field2824[var8][var10] != null) {
                            if (Statics.field2824[var8][var10].field2805 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2824[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2824[var8] = null;
                    }
                    Statics.field2793[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field462.method3567(); var11 != null; var11 = (class4) field462.method3568()) {
            method3510(var11, true);
        }
        field374 = -1;
        field462 = new class200(8);
        field465 = null;
        field442 = false;
        field411 = 0;
        field575.method3298((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field430[var12] = null;
            field431[var12] = false;
        }
        class16.method88();
        field440 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field495[var13] = true;
        }
        method1523();
        field542 = null;
        Statics.field897 = 0;
        Statics.field2233 = null;
        for (int var14 = 0; var14 < 8; var14++) {
            field578[var14] = new class224();
        }
        Statics.field2123 = null;
    }

    @ObfuscatedName("c.w(I)V")
    public static void method168() {
        field379.field2046 = 0;
        field348.field2046 = 0;
        field350 = -1;
        field353 = -1;
        field422 = -1;
        field355 = -1;
        field349 = 0;
        field351 = 0;
        field318 = 0;
        field411 = 0;
        field442 = false;
        field404 = 0;
        field535 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field420[var0] = null;
        }
        Statics.field2137 = null;
        for (int var1 = 0; var1 < field341.length; var1++) {
            class37 var2 = field341[var1];
            if (var2 != null) {
                var2.field869 = -1;
                var2.field891 = false;
            }
        }
        class16.method88();
        method2342(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field495[var3] = true;
        }
        method1523();
    }

    @ObfuscatedName("h.x(II)V")
    public static void method5(int arg0) {
        if (arg0 == -3) {
            class34.method89(class161.field2586, class161.field2364, class161.field2397);
        } else if (arg0 == -2) {
            class34.method89(class161.field2629, class161.field2547, class161.field2400);
        } else if (arg0 == -1) {
            class34.method89(class161.field2401, class161.field2428, class161.field2403);
        } else if (arg0 == 3) {
            class34.field747 = 3;
        } else if (arg0 == 4) {
            class34.method89(class161.field2404, class161.field2405, class161.field2406);
        } else if (arg0 == 5) {
            class34.method89(class161.field2378, class161.field2410, class161.field2426);
        } else if (arg0 == 6) {
            class34.method89(class161.field2554, class161.field2411, class161.field2402);
        } else if (arg0 == 7) {
            class34.method89(class161.field2564, class161.field2414, class161.field2399);
        } else if (arg0 == 8) {
            class34.method89(class161.field2416, class161.field2448, class161.field2438);
        } else if (arg0 == 9) {
            class34.method89(class161.field2419, class161.field2582, class161.field2421);
        } else if (arg0 == 10) {
            class34.method89(class161.field2524, class161.field2423, class161.field2424);
        } else if (arg0 == 11) {
            class34.method89(class161.field2425, class161.field2537, class161.field2427);
        } else if (arg0 == 12) {
            class34.method89(class161.field2420, class161.field2412, class161.field2430);
        } else if (arg0 == 13) {
            class34.method89(class161.field2433, class161.field2432, class161.field2559);
        } else if (arg0 == 14) {
            class34.method89(class161.field2434, class161.field2435, class161.field2436);
        } else if (arg0 == 16) {
            class34.method89(class161.field2631, class161.field2413, class161.field2439);
        } else if (arg0 == 17) {
            class34.method89(class161.field2440, class161.field2441, class161.field2442);
        } else if (arg0 == 18) {
            class34.method89(class161.field2543, class161.field2444, class161.field2445);
        } else if (arg0 == 19) {
            class34.method89(class161.field2446, class161.field2447, class161.field2535);
        } else if (arg0 == 20) {
            class34.method89(class161.field2449, class161.field2570, class161.field2451);
        } else if (arg0 == 22) {
            class34.method89(class161.field2518, class161.field2453, class161.field2443);
        } else if (arg0 == 23) {
            class34.method89(class161.field2455, class161.field2456, class161.field2457);
        } else if (arg0 == 24) {
            class34.method89(class161.field2591, class161.field2476, class161.field2361);
        } else if (arg0 == 25) {
            class34.method89(class161.field2461, class161.field2462, class161.field2463);
        } else if (arg0 == 26) {
            class34.method89(class161.field2464, class161.field2465, class161.field2466);
        } else if (arg0 == 27) {
            class34.method89(class161.field2467, class161.field2523, class161.field2469);
        } else if (arg0 == 31) {
            class34.method89(class161.field2634, class161.field2368, class161.field2478);
        } else if (arg0 == 32) {
            class34.method89(class161.field2507, class161.field2472, class161.field2481);
        } else if (arg0 == 37) {
            class34.method89(class161.field2482, class161.field2483, class161.field2566);
        } else if (arg0 == 38) {
            class34.method89(class161.field2485, class161.field2486, class161.field2487);
        } else if (arg0 == 55) {
            class34.method89(class161.field2488, class161.field2593, class161.field2490);
        } else if (arg0 == 56) {
            class34.method89(class161.field2491, class161.field2459, class161.field2358);
            method2342(11);
            return;
        } else if (arg0 == 57) {
            class34.method89(class161.field2408, class161.field2495, class161.field2496);
            method2342(11);
            return;
        } else {
            class34.method89(class161.field2497, class161.field2498, class161.field2499);
        }
        method2342(10);
    }

    @ObfuscatedName("aa.k(I)V")
    public static final void method868() {
        if (Statics.field994 != null) {
            Statics.field994.method2875();
            Statics.field994 = null;
        }
        method1233();
        Statics.field2091.method1834();
        for (int var0 = 0; var0 < 4; var0++) {
            field410[var0].method2283();
        }
        System.gc();
        class187.field3011 = 1;
        Statics.field801 = null;
        Statics.field1824 = -1;
        Statics.field3016 = -1;
        Statics.field3017 = 0;
        Statics.field3018 = false;
        Statics.field1155 = 2;
        field539 = -1;
        field540 = false;
        class25.method111();
        method2342(10);
    }

    @ObfuscatedName("ba.z(B)V")
    public static final void method1233() {
        class49.field1068.method3533();
        class44.field997.method3533();
        class47.method729();
        class43.method181();
        class42.method51();
        class56.field1168.method3533();
        class56.field1164.method3533();
        class56.field1170.method3533();
        class45.method658();
        class46.field1030.method3533();
        class46.field1031.method3533();
        class51.method2();
        class57.field1224.method3533();
        class52.field1109.method3533();
        class52.field1111.method3533();
        class52.field1107.method3533();
        class50.method1132();
        class183.method3262();
        class177.field2902.method3533();
        class177.field2818.method3533();
        class177.field2799.method3533();
        class177.field2800.method3533();
        ((class99) Statics.field1639).method2095();
        class24.field622.method3533();
        Statics.field332.method3096();
        Statics.field2008.method3096();
        Statics.field599.method3096();
        Statics.field1930.method3096();
        Statics.field174.method3096();
        Statics.field477.method3096();
        Statics.field1689.method3096();
        Statics.field1200.method3096();
        Statics.field334.method3096();
        Statics.field2140.method3096();
        Statics.field105.method3096();
        Statics.field2016.method3096();
    }

    @ObfuscatedName("hg.q(I)V")
    public static final void method3709() {
        if (Statics.field653 != null) {
            Statics.field653.method1205();
        }
        if (Statics.field684 != null) {
            Statics.field684.method1205();
        }
    }

    @ObfuscatedName("aq.o(B)V")
    public static final void method650() {
        for (int var0 = 0; var0 < field543; var0++) {
            int var10002 = field546[var0]--;
            if (field546[var0] >= -10) {
                class62 var2 = field555[var0];
                if (var2 == null) {
                    class62 var10000 = (class62) null;
                    var2 = class62.method1259(Statics.field1930, field544[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field546[var0] += var2.method1251();
                    field555[var0] = var2;
                }
                if (field546[var0] < 0) {
                    int var9;
                    if (field547[var0] == 0) {
                        var9 = field548;
                    } else {
                        int var3 = (field547[var0] & 0xFF) * 128;
                        int var4 = field547[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2137.field879;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field547[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2137.field837;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field546[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field409 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class66 var10 = var2.method1250().method1291(Statics.field2080);
                        class68 var11 = class68.method1312(var10, 100, var9);
                        var11.method1339(field545[var0] - 1);
                        Statics.field12.method1143(var11);
                    }
                    field546[var0] = -100;
                }
            } else {
                field543--;
                for (int var1 = var0; var1 < field543; var1++) {
                    field544[var1] = field544[var1 + 1];
                    field555[var1] = field555[var1 + 1];
                    field545[var1] = field545[var1 + 1];
                    field546[var1] = field546[var1 + 1];
                    field547[var1] = field547[var1 + 1];
                }
                var0--;
            }
        }
        if (!field540) {
            return;
        }
        boolean var12;
        if (class187.field3011 == 0) {
            var12 = Statics.field3014.method3416();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field514 != 0 && field539 != -1) {
                class187.method2091(Statics.field477, field539, 0, field514, false);
            }
            field540 = false;
        }
    }

    @ObfuscatedName("dd.f(Laa;IIIB)V")
    public static void method2196(class45 arg0, int arg1, int arg2, int arg3) {
        if (field543 >= 50 || field409 == 0 || arg0.field1025 == null || arg1 >= arg0.field1025.length) {
            return;
        }
        int var4 = arg0.field1025[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field544[field543] = var5;
        field545[field543] = var6;
        field546[field543] = 0;
        field555[field543] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field547[field543] = (var8 << 16) + (var9 << 8) + var7;
        field543++;
    }

    @ObfuscatedName("dr.b(II)V")
    public static void method2326(int arg0) {
        if (arg0 == -1 && !field540) {
            class187.method646();
        } else if (arg0 != -1 && field539 != arg0 && field514 != 0 && !field540) {
            class172 var1 = Statics.field477;
            int var2 = field514;
            class187.field3011 = 1;
            Statics.field801 = var1;
            Statics.field1824 = arg0;
            Statics.field3016 = 0;
            Statics.field3017 = var2;
            Statics.field3018 = false;
            Statics.field1155 = 2;
        }
        field539 = arg0;
    }

    @ObfuscatedName("c.t(III)V")
    public static void method173(int arg0, int arg1) {
        if (field514 != 0 && arg0 != -1) {
            class187.method2091(Statics.field105, arg0, 0, field514, false);
            field540 = true;
        }
    }

    @ObfuscatedName("v.am(B)V")
    public static final void method153() {
        int[] var0 = class35.field787;
        for (int var1 = 0; var1 < class35.field780; var1++) {
            class3 var2 = field420[var0[var1]];
            if (var2 != null && var2.field848 > 0) {
                var2.field848--;
                if (var2.field848 == 0) {
                    var2.field862 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field342; var3++) {
            int var4 = field343[var3];
            class37 var5 = field341[var4];
            if (var5 != null && var5.field848 > 0) {
                var5.field848--;
                if (var5.field848 == 0) {
                    var5.field862 = null;
                }
            }
        }
    }

    @ObfuscatedName("af.as(Ljava/lang/String;B)V")
    public static final void method634(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field43.field155 = !Statics.field43.field155;
            class9.method2679();
            if (Statics.field43.field155) {
                class12.method2280(99, "", "Roofs are now all hidden");
            } else {
                class12.method2280(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field317 = !field317;
        }
        if (field466 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field317 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field317 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field356 > 0) {
                    method868();
                } else {
                    method2342(40);
                    Statics.field1251 = Statics.field994;
                    Statics.field994 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field515 == 2) {
                throw new RuntimeException();
            }
        }
        field379.method2661(177);
        field379.method2389(arg0.length() + 1);
        field379.method2395(arg0);
    }

    @ObfuscatedName("r.ad(Lao;II)V")
    public static final void method158(class40 arg0, int arg1) {
        if (arg0.field882 > field333) {
            int var2 = arg0.field882 - field333;
            int var3 = arg0.field842 * 128 + arg0.field840 * 64;
            int var4 = arg0.field880 * 128 + arg0.field840 * 64;
            arg0.field879 += (var3 - arg0.field879) / var2;
            arg0.field837 += (var4 - arg0.field837) / var2;
            arg0.field894 = 0;
            arg0.field887 = arg0.field893;
        } else if (arg0.field883 >= field333) {
            if (field333 == arg0.field883 || arg0.field868 == -1 || arg0.field852 != 0 || arg0.field881 + 1 > class45.method3523(arg0.field868).field1020[arg0.field854]) {
                int var5 = arg0.field883 - arg0.field882;
                int var6 = field333 - arg0.field882;
                int var7 = arg0.field842 * 128 + arg0.field840 * 64;
                int var8 = arg0.field880 * 128 + arg0.field840 * 64;
                int var9 = arg0.field859 * 128 + arg0.field840 * 64;
                int var10 = arg0.field856 * 128 + arg0.field840 * 64;
                arg0.field879 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field837 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field894 = 0;
            arg0.field887 = arg0.field893;
            arg0.field838 = arg0.field887;
        } else {
            method998(arg0);
        }
        if (arg0.field879 < 128 || arg0.field837 < 128 || arg0.field879 >= 13184 || arg0.field837 >= 13184) {
            arg0.field868 = -1;
            arg0.field873 = -1;
            arg0.field882 = 0;
            arg0.field883 = 0;
            arg0.field879 = arg0.field857[0] * 128 + arg0.field840 * 64;
            arg0.field837 = arg0.field858[0] * 128 + arg0.field840 * 64;
            arg0.method752();
        }
        if (Statics.field2137 == arg0 && (arg0.field879 < 1536 || arg0.field837 < 1536 || arg0.field879 >= 11776 || arg0.field837 >= 11776)) {
            arg0.field868 = -1;
            arg0.field873 = -1;
            arg0.field882 = 0;
            arg0.field883 = 0;
            arg0.field879 = arg0.field857[0] * 128 + arg0.field840 * 64;
            arg0.field837 = arg0.field858[0] * 128 + arg0.field840 * 64;
            arg0.method752();
        }
        if (arg0.field889 != 0) {
            if (arg0.field869 != -1) {
                class40 var11 = null;
                if (arg0.field869 < 32768) {
                    var11 = field341[arg0.field869];
                } else if (arg0.field869 >= 32768) {
                    var11 = field420[arg0.field869 - 32768];
                }
                if (var11 != null) {
                    int var12 = arg0.field879 - var11.field879;
                    int var13 = arg0.field837 - var11.field837;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field887 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field891) {
                    arg0.field869 = -1;
                    arg0.field891 = false;
                }
            }
            if (arg0.field864 != -1 && (arg0.field890 == 0 || arg0.field894 > 0)) {
                arg0.field887 = arg0.field864;
                arg0.field864 = -1;
            }
            int var14 = arg0.field887 - arg0.field838 & 0x7FF;
            if (var14 == 0 && arg0.field891) {
                arg0.field869 = -1;
                arg0.field891 = false;
            }
            if (var14 == 0) {
                arg0.field888 = 0;
            } else {
                arg0.field888++;
                if (var14 > 1024) {
                    arg0.field838 -= arg0.field889;
                    boolean var15 = true;
                    if (var14 < arg0.field889 || var14 > 2048 - arg0.field889) {
                        arg0.field838 = arg0.field887;
                        var15 = false;
                    }
                    if (arg0.field886 == arg0.field865 && (arg0.field888 > 25 || var15)) {
                        if (arg0.field863 == -1) {
                            arg0.field865 = arg0.field860;
                        } else {
                            arg0.field865 = arg0.field863;
                        }
                    }
                } else {
                    arg0.field838 += arg0.field889;
                    boolean var16 = true;
                    if (var14 < arg0.field889 || var14 > 2048 - arg0.field889) {
                        arg0.field838 = arg0.field887;
                        var16 = false;
                    }
                    if (arg0.field886 == arg0.field865 && (arg0.field888 > 25 || var16)) {
                        if (arg0.field843 == -1) {
                            arg0.field865 = arg0.field860;
                        } else {
                            arg0.field865 = arg0.field843;
                        }
                    }
                }
                arg0.field838 &= 0x7FF;
            }
        }
        method2191(arg0);
    }

    @ObfuscatedName("ae.af(Lao;B)V")
    public static final void method998(class40 arg0) {
        arg0.field865 = arg0.field886;
        if (arg0.field890 == 0) {
            arg0.field894 = 0;
            return;
        }
        if (arg0.field868 != -1 && arg0.field852 == 0) {
            class45 var1 = class45.method3523(arg0.field868);
            if (arg0.field895 > 0 && var1.field1017 == 0) {
                arg0.field894++;
                return;
            }
            if (arg0.field895 <= 0 && var1.field1024 == 0) {
                arg0.field894++;
                return;
            }
        }
        int var2 = arg0.field879;
        int var3 = arg0.field837;
        int var4 = arg0.field857[arg0.field890 - 1] * 128 + arg0.field840 * 64;
        int var5 = arg0.field858[arg0.field890 - 1] * 128 + arg0.field840 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field887 = 1280;
            } else if (var3 > var5) {
                arg0.field887 = 1792;
            } else {
                arg0.field887 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field887 = 768;
            } else if (var3 > var5) {
                arg0.field887 = 256;
            } else {
                arg0.field887 = 512;
            }
        } else if (var3 < var5) {
            arg0.field887 = 1024;
        } else if (var3 > var5) {
            arg0.field887 = 0;
        }
        byte var6 = arg0.field851[arg0.field890 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field879 = var4;
            arg0.field837 = var5;
            arg0.field890--;
            if (arg0.field895 > 0) {
                arg0.field895--;
            }
            return;
        }
        int var7 = arg0.field887 - arg0.field838 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field845;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field860;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field847;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field846;
        }
        if (var8 == -1) {
            var8 = arg0.field860;
        }
        arg0.field865 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class37) {
            var10 = ((class37) arg0).field803.field940;
        }
        if (var10) {
            if (arg0.field887 != arg0.field838 && arg0.field869 == -1 && arg0.field889 != 0) {
                var9 = 2;
            }
            if (arg0.field890 > 2) {
                var9 = 6;
            }
            if (arg0.field890 > 3) {
                var9 = 8;
            }
            if (arg0.field894 > 0 && arg0.field890 > 1) {
                var9 = 8;
                arg0.field894--;
            }
        } else {
            if (arg0.field890 > 1) {
                var9 = 6;
            }
            if (arg0.field890 > 2) {
                var9 = 8;
            }
            if (arg0.field894 > 0 && arg0.field890 > 1) {
                var9 = 8;
                arg0.field894--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field865 == arg0.field860 && arg0.field844 != -1) {
            arg0.field865 = arg0.field844;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field879 += var9;
                if (arg0.field879 > var4) {
                    arg0.field879 = var4;
                }
            } else if (var2 > var4) {
                arg0.field879 -= var9;
                if (arg0.field879 < var4) {
                    arg0.field879 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field837 += var9;
                if (arg0.field837 > var5) {
                    arg0.field837 = var5;
                }
            } else if (var3 > var5) {
                arg0.field837 -= var9;
                if (arg0.field837 < var5) {
                    arg0.field837 = var5;
                }
            }
        }
        if (arg0.field879 == var4 && arg0.field837 == var5) {
            arg0.field890--;
            if (arg0.field895 > 0) {
                arg0.field895--;
            }
        }
    }

    @ObfuscatedName("db.ak(Lao;I)V")
    public static final void method2191(class40 arg0) {
        arg0.field839 = false;
        if (arg0.field865 != -1) {
            class45 var1 = class45.method3523(arg0.field865);
            if (var1 == null || var1.field1012 == null) {
                arg0.field865 = -1;
            } else {
                arg0.field867++;
                if (arg0.field866 < var1.field1012.length && arg0.field867 > var1.field1020[arg0.field866]) {
                    arg0.field867 = 1;
                    arg0.field866++;
                    method2196(var1, arg0.field866, arg0.field879, arg0.field837);
                }
                if (arg0.field866 >= var1.field1012.length) {
                    arg0.field867 = 0;
                    arg0.field866 = 0;
                    method2196(var1, arg0.field866, arg0.field879, arg0.field837);
                }
            }
        }
        if (arg0.field873 != -1 && field333 >= arg0.field836) {
            if (arg0.field874 < 0) {
                arg0.field874 = 0;
            }
            int var2 = class46.method895(arg0.field873).field1034;
            if (var2 == -1) {
                arg0.field873 = -1;
            } else {
                class45 var3 = class45.method3523(var2);
                if (var3 == null || var3.field1012 == null) {
                    arg0.field873 = -1;
                } else {
                    arg0.field875++;
                    if (arg0.field874 < var3.field1012.length && arg0.field875 > var3.field1020[arg0.field874]) {
                        arg0.field875 = 1;
                        arg0.field874++;
                        method2196(var3, arg0.field874, arg0.field879, arg0.field837);
                    }
                    if (arg0.field874 >= var3.field1012.length && (arg0.field874 < 0 || arg0.field874 >= var3.field1012.length)) {
                        arg0.field873 = -1;
                    }
                }
            }
        }
        if (arg0.field868 != -1 && arg0.field852 <= 1) {
            class45 var4 = class45.method3523(arg0.field868);
            if (var4.field1017 == 1 && arg0.field895 > 0 && arg0.field882 <= field333 && arg0.field883 < field333) {
                arg0.field852 = 1;
                return;
            }
        }
        if (arg0.field868 != -1 && arg0.field852 == 0) {
            class45 var5 = class45.method3523(arg0.field868);
            if (var5 == null || var5.field1012 == null) {
                arg0.field868 = -1;
            } else {
                arg0.field881++;
                if (arg0.field854 < var5.field1012.length && arg0.field881 > var5.field1020[arg0.field854]) {
                    arg0.field881 = 1;
                    arg0.field854++;
                    method2196(var5, arg0.field854, arg0.field879, arg0.field837);
                }
                if (arg0.field854 >= var5.field1012.length) {
                    arg0.field854 -= var5.field1013;
                    arg0.field872++;
                    if (arg0.field872 >= var5.field1022) {
                        arg0.field868 = -1;
                    } else if (arg0.field854 >= 0 && arg0.field854 < var5.field1012.length) {
                        method2196(var5, arg0.field854, arg0.field879, arg0.field837);
                    } else {
                        arg0.field868 = -1;
                    }
                }
                arg0.field839 = var5.field1018;
            }
        }
        if (arg0.field852 > 0) {
            arg0.field852--;
        }
    }

    @ObfuscatedName("am.aq(Le;III)V")
    public static void method570(class3 arg0, int arg1, int arg2) {
        if (arg0.field868 == arg1 && arg1 != -1) {
            int var3 = class45.method3523(arg1).field1007;
            if (var3 == 1) {
                arg0.field854 = 0;
                arg0.field881 = 0;
                arg0.field852 = arg2;
                arg0.field872 = 0;
            }
            if (var3 == 2) {
                arg0.field872 = 0;
            }
        } else if (arg1 == -1 || arg0.field868 == -1 || class45.method3523(arg1).field1015 >= class45.method3523(arg0.field868).field1015) {
            arg0.field868 = arg1;
            arg0.field854 = 0;
            arg0.field881 = 0;
            arg0.field852 = arg2;
            arg0.field872 = 0;
            arg0.field895 = arg0.field890;
        }
    }

    @ObfuscatedName("er.an(I)V")
    public static void method2969() {
        Canvas var0 = Statics.field2694;
        var0.removeKeyListener(class141.field2174);
        var0.removeFocusListener(class141.field2174);
        class141.field2169 = -1;
        Statics.method2020(Statics.field2694);
        if (Statics.field1218 != null) {
            Statics.field1218.method2720(Statics.field2694);
        }
        Statics.field2707.method2943();
        Statics.field2694.setBackground(Color.black);
        Canvas var1 = Statics.field2694;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class141.field2174);
        var1.addFocusListener(class141.field2174);
        class144.method1525(Statics.field2694);
        if (Statics.field1218 != null) {
            Statics.field1218.method2723(Statics.field2694);
        }
        if (field374 != -1) {
            method1634(false);
        }
        field2248 = true;
    }

    @ObfuscatedName("bh.ag(I)V")
    public static void method1523() {
        field379.method2661(215);
        class126 var0 = field379;
        int var1 = field329 ? 2 : 1;
        var0.method2389(var1);
        field379.method2561(Statics.field1268);
        field379.method2561(Statics.field1429);
    }

    @ObfuscatedName("ey.al(B)V")
    public static void method2863() {
        client var0 = Statics.field2707;
        synchronized (Statics.field2707) {
            Container var1 = Statics.field2707.method2912();
            if (var1 != null) {
                Statics.field2013 = Math.max(var1.getSize().width, Statics.field2015);
                Statics.field277 = Math.max(var1.getSize().height, Statics.field2103);
                if (Statics.field16 == var1) {
                    Insets var2 = Statics.field16.getInsets();
                    Statics.field2013 -= var2.right + var2.left;
                    Statics.field277 -= var2.top + var2.bottom;
                }
                if (Statics.field2013 <= 0) {
                    Statics.field2013 = 1;
                }
                if (Statics.field277 <= 0) {
                    Statics.field277 = 1;
                }
                int var3 = field329 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field1268 = field516;
                    Statics.field1429 = field316;
                } else {
                    Statics.field1268 = Math.min(Statics.field2013, 7680);
                    Statics.field1429 = Math.min(Statics.field277, 2160);
                }
                field2242 = (Statics.field2013 - Statics.field1268) / 2;
                field2253 = 0;
                Statics.field2694.setSize(Statics.field1268, Statics.field1429);
                Statics.field3217 = class81.method946(Statics.field1268, Statics.field1429, Statics.field2694);
                if (Statics.field16 == var1) {
                    Insets var4 = Statics.field16.getInsets();
                    Statics.field2694.setLocation(field2242 + var4.left, field2253 + var4.top);
                } else {
                    Statics.field2694.setLocation(field2242, field2253);
                }
                method2113();
                if (field374 != -1) {
                    method1634(true);
                }
                method2603();
            }
        }
    }

    @ObfuscatedName("ck.au(I)V")
    public static void method2113() {
        int var0 = Statics.field1268;
        int var1 = Statics.field1429;
        if (Statics.field2013 < var0) {
            int var2 = Statics.field2013;
        }
        if (Statics.field277 < var1) {
            int var3 = Statics.field277;
        }
        if (Statics.field43 == null) {
            return;
        }
        try {
            client var4 = Statics.field2707;
            int var5 = field329 ? 2 : 1;
            Object[] var6 = new Object[] { var5 };
            JSObject.getWindow(var4).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("dn.ar(I)V")
    public static void method2603() {
        int var0 = field2242;
        int var1 = field2253;
        int var2 = Statics.field2013 - Statics.field1268 - var0;
        int var3 = Statics.field277 - Statics.field1429 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field2707.method2912();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field16 == var4) {
                Insets var7 = Statics.field16.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field277);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2013, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2013 + var5 - var2, var6, var2, Statics.field277);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field277 + var6 - var3, Statics.field2013, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("fo.ah(Ljava/lang/String;ZB)V")
    public static final void method3020(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2124.method3816(arg0, 250);
        int var6 = Statics.field2124.method3836(arg0, 250) * 13;
        class83.method1755(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class83.method1758(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2124.method3823(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2867(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field2694.getGraphics();
                Statics.field3217.method1553(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field2694.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field426; var13++) {
            if (field577[var13] + field511[var13] > var9 && field577[var13] < var9 + var11 && field512[var13] + field510[var13] > var10 && field510[var13] < var10 + var12) {
                field507[var13] = true;
            }
        }
    }

    @ObfuscatedName("fh.ax(Lau;I)V")
    public static final void method3293(class36 arg0) {
        if (Statics.field2137.field879 >> 7 == field535 && Statics.field2137.field837 >> 7 == field435) {
            field535 = 0;
        }
        int var1 = class35.field780;
        int[] var2 = class35.field787;
        int var3 = var1;
        if (class36.field800 == arg0 || class36.field797 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class36.field800 == arg0) {
                var5 = Statics.field2137;
                var6 = Statics.field2137.field55 << 14;
            } else if (class36.field797 == arg0) {
                var5 = field420[field433];
                var6 = field433 << 14;
            } else {
                var5 = field420[var2[var4]];
                var6 = var2[var4] << 14;
                if (class36.field794 == arg0 && field433 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method22() && !var5.field46) {
                var5.field51 = false;
                if ((field305 && var1 > 50 || var1 > 200) && class36.field800 != arg0 && var5.field886 == var5.field865) {
                    var5.field51 = true;
                }
                int var7 = var5.field879 >> 7;
                int var8 = var5.field837 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field49 == null || field333 < var5.field32 || field333 >= var5.field42) {
                        if ((var5.field879 & 0x7F) == 64 && (var5.field837 & 0x7F) == 64) {
                            if (field408 == field407[var7][var8]) {
                                continue;
                            }
                            field407[var7][var8] = field408;
                        }
                        var5.field40 = method182(var5.field879, var5.field837, Statics.field2760);
                        Statics.field2091.method1845(Statics.field2760, var5.field879, var5.field837, var5.field40, 60, var5, var5.field838, var6, var5.field839);
                    } else {
                        var5.field51 = false;
                        var5.field40 = method182(var5.field879, var5.field837, Statics.field2760);
                        Statics.field2091.method1940(Statics.field2760, var5.field879, var5.field837, var5.field40, 60, var5, var5.field838, var6, var5.field47, var5.field48, var5.field58, var5.field50);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.ac(ZI)V")
    public static final void method57(boolean arg0) {
        for (int var1 = 0; var1 < field342; var1++) {
            class37 var2 = field341[field343[var1]];
            int var3 = (field343[var1] << 14) + 536870912;
            if (var2 != null && var2.method22() && var2.field803.field930 == arg0 && var2.field803.method798()) {
                int var4 = var2.field879 >> 7;
                int var5 = var2.field837 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field840 == 1 && (var2.field879 & 0x7F) == 64 && (var2.field837 & 0x7F) == 64) {
                        if (field408 == field407[var4][var5]) {
                            continue;
                        }
                        field407[var4][var5] = field408;
                    }
                    if (!var2.field803.field938) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2091.method1845(Statics.field2760, var2.field879, var2.field837, method182(var2.field879 + (var2.field840 * 64 - 64), var2.field837 + (var2.field840 * 64 - 64), Statics.field2760), var2.field840 * 64 - 64 + 60, var2, var2.field838, var3, var2.field839);
                }
            }
        }
    }

    @ObfuscatedName("l.ai(III)V")
    public static final void method98(int arg0, int arg1) {
        if (field307 == 2) {
            method2328((field322 - Statics.field3127 << 7) + field541, (field530 - Statics.field1671 << 7) + field326, field324 * 2);
            if (field446 > -1 && field333 % 20 < 10) {
                Statics.field2131[0].method1712(field446 + arg0 - 12, field419 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ba.ap(Lao;IIIIIS)V")
    public static final void method1232(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method22()) {
            return;
        }
        if (arg0 instanceof class37) {
            class42 var6 = ((class37) arg0).field803;
            if (var6.field939 != null) {
                var6 = var6.method779();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class35.field780;
        int[] var8 = class35.field787;
        int var9 = 3;
        if (!arg0.field861.method3636()) {
            method3(arg0, arg0.field871 + 15);
            for (class27 var10 = (class27) arg0.field861.method3633(); var10 != null; var10 = (class27) arg0.field861.method3635()) {
                class21 var11 = var10.method576(field333);
                if (var11 != null) {
                    class50 var12 = var10.field663;
                    class82 var13 = var12.method970();
                    class82 var14 = var12.method969();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field1086;
                    } else {
                        if (var12.field1081 * 2 < var14.field1455) {
                            var15 = var12.field1081;
                        }
                        var16 = var14.field1455 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field333 - var11.field595;
                    int var20 = var11.field592 * var16 / var12.field1086;
                    int var23;
                    if (var11.field593 > var19) {
                        int var21 = var12.field1080 == 0 ? 0 : var19 / var12.field1080 * var12.field1080;
                        int var22 = var11.field591 * var16 / var12.field1086;
                        var23 = (var20 - var22) * var21 / var11.field593 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field593 + var12.field1088 - var19;
                        if (var12.field1087 >= 0) {
                            var17 = (var24 << 8) / (var12.field1088 - var12.field1087);
                        }
                    }
                    if (var11.field592 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field446 + arg2 - (var16 >> 1);
                    int var26 = field419 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field446 > -1) {
                            class83.method1755(var25, var26, var23, 5, 65280);
                            class83.method1755(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field1456;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method1658(var27, var26, var17);
                            class83.method1730(var27, var26, var27 + var28, var26 + var29);
                            var14.method1658(var27, var26, var17);
                        } else {
                            var13.method1712(var27, var26);
                            class83.method1730(var27, var26, var27 + var28, var26 + var29);
                            var14.method1712(var27, var26);
                        }
                        class83.method1733(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method573()) {
                    var10.method3706();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class3 var30 = (class3) arg0;
            if (var30.field46) {
                return;
            }
            if (var30.field41 != -1 || var30.field35 != -1) {
                method3(arg0, arg0.field871 + 15);
                if (field446 > -1) {
                    if (var30.field41 != -1) {
                        Statics.field65[var30.field41].method1712(field446 + arg2 - 12, field419 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field35 != -1) {
                        Statics.field1402[var30.field35].method1712(field446 + arg2 - 12, field419 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field307 == 10 && field321 == var8[arg1]) {
                method3(arg0, arg0.field871 + 15);
                if (field446 > -1) {
                    Statics.field2131[1].method1712(field446 + arg2 - 12, field419 + arg3 - var9);
                }
            }
        } else {
            class42 var31 = ((class37) arg0).field803;
            if (var31.field939 != null) {
                var31 = var31.method779();
            }
            if (var31.field936 >= 0 && var31.field936 < Statics.field1402.length) {
                method3(arg0, arg0.field871 + 15);
                if (field446 > -1) {
                    Statics.field1402[var31.field936].method1712(field446 + arg2 - 12, field419 + arg3 - 30);
                }
            }
            if (field307 == 1 && field320 == field343[arg1 - var7] && field333 % 20 < 10) {
                method3(arg0, arg0.field871 + 15);
                if (field446 > -1) {
                    Statics.field2131[0].method1712(field446 + arg2 - 12, field419 + arg3 - 28);
                }
            }
        }
        if (arg0.field862 != null && (arg1 >= var7 || !arg0.field884 && (field519 == 4 || !arg0.field850 && (field519 == 0 || field519 == 3 || field519 == 1 && method1(((class3) arg0).field37, false))))) {
            method3(arg0, arg0.field871);
            if (field446 > -1 && field397 < field398) {
                field402[field397] = Statics.field812.method3814(arg0.field862) / 2;
                field401[field397] = Statics.field812.field3244;
                field468[field397] = field446;
                field400[field397] = field419;
                field566[field397] = arg0.field853;
                field377[field397] = arg0.field892;
                field405[field397] = arg0.field848;
                field406[field397] = arg0.field862;
                field397++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field876[var32];
            int var34 = arg0.field878[var32];
            class52 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field333) {
                    continue;
                }
                var35 = class52.method3277(arg0.field878[var32]);
                var36 = var35.field1113;
                if (var35 != null && var35.field1105 != null) {
                    var35 = var35.method1003();
                    if (var35 == null) {
                        arg0.field876[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field870[var32];
            class52 var38 = null;
            if (var37 >= 0) {
                var38 = class52.method3277(var37);
                if (var38 != null && var38.field1105 != null) {
                    var38 = var38.method1003();
                }
            }
            if (var33 - var36 <= field333) {
                if (var35 == null) {
                    arg0.field876[var32] = -1;
                } else {
                    method3(arg0, arg0.field871 / 2);
                    if (field446 > -1) {
                        if (var32 == 1) {
                            field419 -= 20;
                        }
                        if (var32 == 2) {
                            field446 -= 15;
                            field419 -= 10;
                        }
                        if (var32 == 3) {
                            field446 += 15;
                            field419 -= 10;
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
                        class82 var64 = var35.method1005();
                        if (var64 != null) {
                            var43 = var64.field1455;
                            int var65 = var64.field1456;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field1459;
                        }
                        class82 var66 = var35.method1006();
                        if (var66 != null) {
                            var44 = var66.field1455;
                            int var67 = var66.field1456;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field1459;
                        }
                        class82 var68 = var35.method1007();
                        if (var68 != null) {
                            var45 = var68.field1455;
                            int var69 = var68.field1456;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field1459;
                        }
                        class82 var70 = var35.method1008();
                        if (var70 != null) {
                            var46 = var70.field1455;
                            int var71 = var70.field1456;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field1459;
                        }
                        if (var38 != null) {
                            var51 = var38.method1005();
                            if (var51 != null) {
                                var55 = var51.field1455;
                                int var72 = var51.field1456;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field1459;
                            }
                            var52 = var38.method1006();
                            if (var52 != null) {
                                var56 = var52.field1455;
                                int var73 = var52.field1456;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field1459;
                            }
                            var53 = var38.method1007();
                            if (var53 != null) {
                                var57 = var53.field1455;
                                int var74 = var53.field1456;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field1459;
                            }
                            var54 = var38.method1008();
                            if (var54 != null) {
                                var58 = var54.field1455;
                                int var75 = var54.field1456;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field1459;
                            }
                        }
                        class228 var76 = var35.method1025();
                        if (var76 == null) {
                            var76 = Statics.field738;
                        }
                        class228 var77;
                        if (var38 == null) {
                            var77 = Statics.field738;
                        } else {
                            var77 = var38.method1025();
                            if (var77 == null) {
                                var77 = Statics.field738;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method1004(arg0.field849[var32]);
                        int var83 = var76.method3814(var82);
                        if (var38 != null) {
                            var79 = var38.method1004(arg0.field841[var32]);
                            var81 = var77.method3814(var79);
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
                        int var100 = arg0.field876[var32] - field333;
                        int var101 = var35.field1118 - var35.field1118 * var100 / var35.field1113;
                        int var102 = var35.field1119 * var100 / var35.field1113 + -var35.field1119;
                        int var103 = field446 + arg2 - (var92 >> 1) + var101;
                        int var104 = field419 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field1123 + var104 + 15;
                        int var108 = var107 - var76.field3245;
                        int var109 = var76.field3250 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field1123 + var104 + 15;
                            int var111 = var110 - var77.field3245;
                            int var112 = var77.field3250 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field1120 >= 0) {
                            var115 = (var100 << 8) / (var35.field1113 - var35.field1120);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method1658(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method1658(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method1658(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method1658(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3820(var82, var90 + var103, var107, var35.field1112, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1658(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method1658(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method1658(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1658(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3820(var79, var98 + var103, var110, var38.field1112, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method1712(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method1712(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method1712(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method1712(var93 + var103 - var50, var104);
                            }
                            var76.method3876(var82, var90 + var103, var107, var35.field1112 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1712(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method1712(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method1712(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1712(var97 + var103 - var62, var104);
                                }
                                var77.method3876(var79, var98 + var103, var110, var38.field1112 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.aa(IIIII)V")
    public static final void method21(int arg0, int arg1, int arg2, int arg3) {
        field397 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class35.field780;
        int[] var7 = class35.field787;
        for (int var8 = 0; var8 < field342 + var6; var8++) {
            class40 var9;
            if (var8 < var6) {
                var9 = field420[var7[var8]];
                if (field433 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field341[field343[var8 - var6]];
            }
            method1232(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1232(field420[field433], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field397; var10++) {
            int var11 = field468[var10];
            int var12 = field400[var10];
            int var13 = field402[var10];
            int var14 = field401[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field400[var16] - field401[var16] && var12 - var14 < field400[var16] + 2 && var11 - var13 < field468[var16] + field402[var16] && var11 + var13 > field468[var16] - field402[var16] && field400[var16] - field401[var16] < var12) {
                        var12 = field400[var16] - field401[var16];
                        var15 = true;
                    }
                }
            }
            field446 = field468[var10];
            field419 = field400[var10] = var12;
            String var17 = field406[var10];
            if (field463 == 0) {
                int var18 = 16776960;
                if (field566[var10] < 6) {
                    var18 = field518[field566[var10]];
                }
                if (field566[var10] == 6) {
                    var18 = field408 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field566[var10] == 7) {
                    var18 = field408 % 20 < 10 ? 255 : 65535;
                }
                if (field566[var10] == 8) {
                    var18 = field408 % 20 < 10 ? 45056 : 8454016;
                }
                if (field566[var10] == 9) {
                    int var19 = 150 - field405[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field566[var10] == 10) {
                    int var20 = 150 - field405[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field566[var10] == 11) {
                    int var21 = 150 - field405[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field377[var10] == 0) {
                    Statics.field812.method3822(var17, field446 + arg0, field419 + arg1, var18, 0);
                }
                if (field377[var10] == 1) {
                    Statics.field812.method3824(var17, field446 + arg0, field419 + arg1, var18, 0, field408);
                }
                if (field377[var10] == 2) {
                    Statics.field812.method3825(var17, field446 + arg0, field419 + arg1, var18, 0, field408);
                }
                if (field377[var10] == 3) {
                    Statics.field812.method3826(var17, field446 + arg0, field419 + arg1, var18, 0, field408, 150 - field405[var10]);
                }
                if (field377[var10] == 4) {
                    int var22 = (150 - field405[var10]) * (Statics.field812.method3814(var17) + 100) / 150;
                    class83.method1730(field446 + arg0 - 50, arg1, field446 + arg0 + 50, arg1 + arg3);
                    Statics.field812.method3876(var17, field446 + arg0 + 50 - var22, field419 + arg1, var18, 0);
                    class83.method1733(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field377[var10] == 5) {
                    int var23 = 150 - field405[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class83.method1730(arg0, field419 + arg1 - Statics.field812.field3244 - 1, arg0 + arg2, field419 + arg1 + 5);
                    Statics.field812.method3822(var17, field446 + arg0, field419 + arg1 + var24, var18, 0);
                    class83.method1733(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field812.method3822(var17, field446 + arg0, field419 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("gh.ay(IIIIB)V")
    public static final void method3326(int arg0, int arg1, int arg2, int arg3) {
        if (field414 == 1) {
            Statics.field640[field413 / 100].method1712(field500 - 8, field412 - 8);
        }
        if (field414 == 2) {
            Statics.field640[field413 / 100 + 4].method1712(field500 - 8, field412 - 8);
        }
        field443 = 0;
        int var4 = (Statics.field2137.field879 >> 7) + Statics.field3127;
        int var5 = (Statics.field2137.field837 >> 7) + Statics.field1671;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field443 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field443 = 1;
        }
        if (field443 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field443 = 0;
        }
    }

    @ObfuscatedName("i.ab(Lao;II)V")
    public static final void method3(class40 arg0, int arg1) {
        method2328(arg0.field879, arg0.field837, arg1);
    }

    @ObfuscatedName("df.aj(IIII)V")
    public static final void method2328(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field446 = -1;
            field419 = -1;
            return;
        }
        int var3 = method182(arg0, arg1, Statics.field2760) - arg2;
        int var4 = arg0 - Statics.field708;
        int var5 = var3 - Statics.field698;
        int var6 = arg1 - Statics.field796;
        int var7 = class95.field1624[Statics.field612];
        int var8 = class95.field1643[Statics.field612];
        int var9 = class95.field1624[Statics.field2709];
        int var10 = class95.field1643[Statics.field2709];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field446 = field568 * var11 / var15 + field538 / 2;
            field419 = field568 * var14 / var15 + field525 / 2;
        } else {
            field446 = -1;
            field419 = -1;
        }
    }

    @ObfuscatedName("w.az(IIII)I")
    public static final int method182(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field86[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field96[var5][var3][var4] + class6.field96[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field96[var5][var3][var4 + 1] + class6.field96[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cg.av(ZI)V")
    public static final void method2092(boolean arg0) {
        field352 = arg0;
        if (!field352) {
            int var1 = field348.method2432();
            int var2 = field348.method2388();
            int var3 = field348.method2406();
            Statics.field1979 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1979[var4][var5] = field348.method2409();
                }
            }
            Statics.field252 = new int[var3];
            Statics.field2228 = new int[var3];
            Statics.field587 = new int[var3];
            Statics.field77 = new byte[var3][];
            Statics.field2780 = new byte[var3][];
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
                        Statics.field252[var7] = var10;
                        Statics.field2228[var7] = Statics.field174.method3098("m" + var8 + "_" + var9);
                        Statics.field587[var7] = Statics.field174.method3098("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method192(var1, var2);
            return;
        }
        int var11 = field348.method2432();
        int var12 = field348.method2406();
        int var13 = field348.method2406();
        field348.method2646();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field348.method2647(1);
                    if (var17 == 1) {
                        field365[var14][var15][var16] = field348.method2647(26);
                    } else {
                        field365[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field348.method2650();
        Statics.field1979 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1979[var18][var19] = field348.method2409();
            }
        }
        Statics.field252 = new int[var13];
        Statics.field2228 = new int[var13];
        Statics.field587 = new int[var13];
        Statics.field77 = new byte[var13][];
        Statics.field2780 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field365[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field252[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field252[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2228[var20] = Statics.field174.method3098("m" + var29 + "_" + var30);
                            Statics.field587[var20] = Statics.field174.method3098("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method192(var11, var12);
    }

    @ObfuscatedName("k.ae(III)V")
    public static final void method192(int arg0, int arg1) {
        if (Statics.field2066 == arg0 && Statics.field281 == arg1) {
            return;
        }
        Statics.field2066 = arg0;
        Statics.field281 = arg1;
        method2342(25);
        method3020(class161.field2517, true);
        int var2 = Statics.field3127;
        int var3 = Statics.field1671;
        Statics.field3127 = (arg0 - 6) * 8;
        Statics.field1671 = (arg1 - 6) * 8;
        int var4 = Statics.field3127 - var2;
        int var5 = Statics.field1671 - var3;
        int var6 = Statics.field3127;
        int var7 = Statics.field1671;
        for (int var8 = 0; var8 < 32768; var8++) {
            class37 var9 = field341[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field857[var10] -= var4;
                    var9.field858[var10] -= var5;
                }
                var9.field879 -= var4 * 128;
                var9.field837 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field420[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field857[var13] -= var4;
                    var12.field858[var13] -= var5;
                }
                var12.field879 -= var4 * 128;
                var12.field837 -= var5 * 128;
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
                        field434[var24][var20][var21] = field434[var24][var22][var23];
                    } else {
                        field434[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field572.method3597(); var25 != null; var25 = (class17) field572.method3599()) {
            var25.field244 -= var4;
            var25.field261 -= var5;
            if (var25.field244 < 0 || var25.field261 < 0 || var25.field244 >= 104 || var25.field261 >= 104) {
                var25.method3706();
            }
        }
        if (field535 != 0) {
            field535 -= var4;
            field435 -= var5;
        }
        field543 = 0;
        field549 = false;
        field473 = -1;
        field437.method3615();
        field436.method3615();
        for (int var26 = 0; var26 < 4; var26++) {
            field410[var26].method2283();
        }
    }

    @ObfuscatedName("f.at(ZB)V")
    public static final void method547(boolean arg0) {
        method3709();
        field481++;
        if (field481 < 50 && !arg0) {
            return;
        }
        field481 = 0;
        if (field357 || Statics.field994 == null) {
            return;
        }
        field379.method2661(210);
        try {
            Statics.field994.method2874(field379.field2049, 0, field379.field2046);
            field379.field2046 = 0;
        } catch (IOException var2) {
            field357 = true;
        }
    }

    @ObfuscatedName("ar.bc(IIIIII)V")
    public static final void method734(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2091.method1860(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2091.method1877(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2954.field1465;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class43 var13 = class43.method117(var12);
            if (var13.field957 == -1) {
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
                class84 var14 = Statics.field2280[var13.field957];
                if (var14 != null) {
                    int var15 = (var13.field960 * 4 - var14.field1475) / 2;
                    int var16 = (var13.field961 * 4 - var14.field1476) / 2;
                    var14.method1807(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field961) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2091.method1862(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2091.method1877(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class43 var22 = class43.method117(var21);
            if (var22.field957 != -1) {
                class84 var23 = Statics.field2280[var22.field957];
                if (var23 != null) {
                    int var24 = (var22.field960 * 4 - var23.field1475) / 2;
                    int var25 = (var22.field961 * 4 - var23.field1476) / 2;
                    var23.method1807(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field961) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2954.field1465;
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
        int var29 = Statics.field2091.method1934(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class43 var31 = class43.method117(var30);
        if (var31.field957 == -1) {
            return;
        }
        class84 var32 = Statics.field2280[var31.field957];
        if (var32 != null) {
            int var33 = (var31.field960 * 4 - var32.field1475) / 2;
            int var34 = (var31.field961 * 4 - var32.field1476) / 2;
            var32.method1807(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field961) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("fp.bv(I)Z")
    public static final boolean method3184() {
        if (Statics.field994 == null) {
            return false;
        }
        try {
            int var0 = Statics.field994.method2872();
            if (var0 == 0) {
                return false;
            }
            if (field350 == -1) {
                Statics.field994.method2873(field348.field2049, 0, 1);
                field348.field2046 = 0;
                field350 = field348.method2648();
                field349 = class192.field3108[field350];
                var0--;
            }
            if (field349 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field994.method2873(field348.field2049, 0, 1);
                field349 = field348.field2049[0] & 0xFF;
                var0--;
            }
            if (field349 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field994.method2873(field348.field2049, 0, 2);
                field348.field2046 = 0;
                field349 = field348.method2406();
                var0 -= 2;
            }
            if (var0 < field349) {
                return false;
            }
            field348.field2046 = 0;
            Statics.field994.method2873(field348.field2049, 0, field349);
            field351 = 0;
            field355 = field422;
            field422 = field353;
            field353 = field350;
            if (field350 == 80) {
                int var1 = field348.method2388();
                int var2 = field348.method2575();
                class180.field2957[var1] = var2;
                if (class180.field2955[var1] != var2) {
                    class180.field2955[var1] = var2;
                }
                method2835(var1);
                field487[++field427 - 1 & 0x1F] = var1;
                field350 = -1;
                return true;
            }
            if (field350 == 188) {
                class28 var3 = new class28();
                var3.field678 = field348.method2412();
                var3.field675 = field348.method2406();
                int var4 = field348.method2409();
                var3.field671 = var4;
                method2342(45);
                Statics.field994.method2875();
                Statics.field994 = null;
                class34.method185(var3);
                field350 = -1;
                return false;
            }
            if (field350 == 231) {
                field549 = true;
                Statics.field658 = field348.method2404();
                Statics.field3066 = field348.method2404();
                Statics.field364 = field348.method2406();
                Statics.field550 = field348.method2404();
                Statics.field173 = field348.method2404();
                if (Statics.field173 >= 100) {
                    int var5 = Statics.field658 * 128 + 64;
                    int var6 = Statics.field3066 * 128 + 64;
                    int var7 = method182(var5, var6, Statics.field2760) - Statics.field364;
                    int var8 = var5 - Statics.field708;
                    int var9 = var7 - Statics.field698;
                    int var10 = var6 - Statics.field796;
                    int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
                    Statics.field612 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
                    Statics.field2709 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 0x7FF;
                    if (Statics.field612 < 128) {
                        Statics.field612 = 128;
                    }
                    if (Statics.field612 > 383) {
                        Statics.field612 = 383;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 223 || field350 == 40 || field350 == 217 || field350 == 252 || field350 == 180 || field350 == 12 || field350 == 122 || field350 == 61 || field350 == 243 || field350 == 28) {
                method71();
                field350 = -1;
                return true;
            }
            if (field350 == 95) {
                method868();
                field350 = -1;
                return false;
            }
            if (field350 == 202) {
                field404 = field348.method2404();
                field350 = -1;
                return true;
            }
            if (field350 == 19) {
                int var12 = field348.method2406();
                int var13 = field348.method2404();
                int var14 = field348.method2406();
                if (field548 != 0 && var13 != 0 && field543 < 50) {
                    field544[field543] = var12;
                    field545[field543] = var13;
                    field546[field543] = var14;
                    field555[field543] = null;
                    field547[field543] = 0;
                    field543++;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 0) {
                while (field348.field2046 < field349) {
                    int var18 = field348.method2404();
                    boolean var19 = (var18 & 0x1) == 1;
                    String var20 = field348.method2412();
                    String var21 = field348.method2412();
                    field348.method2412();
                    for (int var22 = 0; var22 < field573; var22++) {
                        class8 var23 = field528[var22];
                        if (var19) {
                            if (var21.equals(var23.field149)) {
                                var23.field149 = var20;
                                var23.field143 = var21;
                                var20 = null;
                                break;
                            }
                        } else if (var20.equals(var23.field149)) {
                            var23.field149 = var20;
                            var23.field143 = var21;
                            var20 = null;
                            break;
                        }
                    }
                    if (var20 != null && field573 < 400) {
                        class8 var24 = new class8();
                        field528[field573] = var24;
                        var24.field149 = var20;
                        var24.field143 = var21;
                        field573++;
                    }
                }
                field494 = field486;
                field350 = -1;
                return true;
            }
            if (field350 == 47) {
                class35.field780 = 0;
                for (int var25 = 0; var25 < 2048; var25++) {
                    class35.field785[var25] = null;
                    class35.field778[var25] = 1;
                }
                for (int var26 = 0; var26 < 2048; var26++) {
                    field420[var26] = null;
                }
                class35.method53(field348);
                field350 = -1;
                return true;
            }
            if (field350 == 240) {
                int var27 = field348.method2404();
                if (field348.method2404() == 0) {
                    field578[var27] = new class224();
                    field348.field2046 += 18;
                } else {
                    field348.field2046--;
                    field578[var27] = new class224(field348, false);
                }
                field576 = field486;
                field350 = -1;
                return true;
            }
            if (field350 == 78) {
                int var28 = field348.method2409();
                class4 var29 = (class4) field462.method3564((long) var28);
                if (var29 != null) {
                    method3510(var29, true);
                }
                if (field465 != null) {
                    method654(field465);
                    field465 = null;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 26) {
                byte var30 = field348.method2405();
                int var31 = field348.method2432();
                class180.field2957[var31] = var30;
                if (class180.field2955[var31] != var30) {
                    class180.field2955[var31] = var30;
                }
                method2835(var31);
                field487[++field427 - 1 & 0x1F] = var31;
                field350 = -1;
                return true;
            }
            if (field350 == 106) {
                method962();
                int var32 = field348.method2404();
                int var33 = field348.method2450();
                int var34 = field348.method2513();
                field323[var32] = var33;
                field368[var32] = var34;
                field439[var32] = 1;
                for (int var35 = 0; var35 < 98; var35++) {
                    if (var33 >= class159.field2346[var35]) {
                        field439[var32] = var35 + 2;
                    }
                }
                field491[++field492 - 1 & 0x1F] = var32;
                field350 = -1;
                return true;
            }
            if (field350 == 5) {
                method2092(true);
                field348.method2648();
                int var36 = field348.method2406();
                class35.method567(field348, var36);
                field350 = -1;
                return true;
            }
            if (field350 == 131) {
                for (int var37 = 0; var37 < Statics.field1221; var37++) {
                    class57 var38 = class57.method948(var37);
                    if (var38 != null) {
                        class180.field2957[var37] = 0;
                        class180.field2955[var37] = 0;
                    }
                }
                method962();
                field427 += 32;
                field350 = -1;
                return true;
            }
            if (field350 == 222) {
                class126 var39 = field348;
                int var40 = field349;
                class214 var41 = new class214();
                var41.field3180 = var39.method2404();
                var41.field3185 = var39.method2409();
                var41.field3179 = new int[var41.field3180];
                var41.field3182 = new int[var41.field3180];
                var41.field3183 = new Field[var41.field3180];
                var41.field3184 = new int[var41.field3180];
                var41.field3186 = new Method[var41.field3180];
                var41.field3181 = new byte[var41.field3180][][];
                for (int var42 = 0; var42 < var41.field3180; var42++) {
                    try {
                        int var43 = var39.method2404();
                        if (var43 == 0 || var43 == 1 || var43 == 2) {
                            String var44 = var39.method2412();
                            String var45 = var39.method2412();
                            int var46 = 0;
                            if (var43 == 1) {
                                var46 = var39.method2409();
                            }
                            var41.field3179[var42] = var43;
                            var41.field3184[var42] = var46;
                            if (class215.method2971(var44).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var41.field3183[var42] = class215.method2971(var44).getDeclaredField(var45);
                        } else if (var43 == 3 || var43 == 4) {
                            String var47 = var39.method2412();
                            String var48 = var39.method2412();
                            int var49 = var39.method2404();
                            String[] var50 = new String[var49];
                            for (int var51 = 0; var51 < var49; var51++) {
                                var50[var51] = var39.method2412();
                            }
                            String var52 = var39.method2412();
                            byte[][] var53 = new byte[var49][];
                            if (var43 == 3) {
                                for (int var54 = 0; var54 < var49; var54++) {
                                    int var55 = var39.method2409();
                                    var53[var54] = new byte[var55];
                                    var39.method2415(var53[var54], 0, var55);
                                }
                            }
                            var41.field3179[var42] = var43;
                            Class[] var56 = new Class[var49];
                            for (int var57 = 0; var57 < var49; var57++) {
                                var56[var57] = class215.method2971(var50[var57]);
                            }
                            Class var58 = class215.method2971(var52);
                            if (class215.method2971(var47).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var59 = class215.method2971(var47).getDeclaredMethods();
                            Method[] var60 = var59;
                            for (int var61 = 0; var61 < var60.length; var61++) {
                                Method var62 = var60[var61];
                                if (var62.getName().equals(var48)) {
                                    Class[] var63 = var62.getParameterTypes();
                                    if (var56.length == var63.length) {
                                        boolean var64 = true;
                                        for (int var65 = 0; var65 < var56.length; var65++) {
                                            if (var56[var65] != var63[var65]) {
                                                var64 = false;
                                                break;
                                            }
                                        }
                                        if (var64 && var58 == var62.getReturnType()) {
                                            var41.field3186[var42] = var62;
                                        }
                                    }
                                }
                            }
                            var41.field3181[var42] = var53;
                        }
                    } catch (ClassNotFoundException var332) {
                        var41.field3182[var42] = -1;
                    } catch (SecurityException var333) {
                        var41.field3182[var42] = -2;
                    } catch (NullPointerException var334) {
                        var41.field3182[var42] = -3;
                    } catch (Exception var335) {
                        var41.field3182[var42] = -4;
                    } catch (Throwable var336) {
                        var41.field3182[var42] = -5;
                    }
                }
                class215.field3188.method3630(var41);
                field350 = -1;
                return true;
            }
            if (field350 == 206) {
                int var71 = field348.method2430();
                int var72 = field348.method2449();
                int var73 = field348.method2430();
                class177 var74 = class177.method3198(var72);
                if (var74.field2843 != var73 || var74.field2813 != var71 || var74.field2808 != 0 || var74.field2809 != 0) {
                    var74.field2843 = var73;
                    var74.field2813 = var71;
                    var74.field2808 = 0;
                    var74.field2809 = 0;
                    method654(var74);
                    method2341(var74);
                    if (var74.field2805 == 0) {
                        method2703(Statics.field2824[var72 >> 16], var74, false);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 22) {
                int var75 = field348.method2575();
                int var76 = field348.method2585();
                class177 var77 = class177.method3198(var75);
                if (var77 != null && var77.field2805 == 0) {
                    if (var76 > var77.field2915 - var77.field2819) {
                        var76 = var77.field2915 - var77.field2819;
                    }
                    if (var76 < 0) {
                        var76 = 0;
                    }
                    if (var77.field2825 != var76) {
                        var77.field2825 = var76;
                        method654(var77);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 121) {
                int var78 = field348.method2409();
                int var79 = field348.method2450();
                class4 var80 = (class4) field462.method3564((long) var79);
                class4 var81 = (class4) field462.method3564((long) var78);
                if (var81 != null) {
                    method3510(var81, var80 == null || var80.field63 != var81.field63);
                }
                if (var80 != null) {
                    var80.method3706();
                    field462.method3565(var80, (long) var78);
                }
                class177 var82 = class177.method3198(var79);
                if (var82 != null) {
                    method654(var82);
                }
                class177 var83 = class177.method3198(var78);
                if (var83 != null) {
                    method654(var83);
                    method2703(Statics.field2824[var83.field2803 >>> 16], var83, true);
                }
                if (field374 != -1) {
                    int var84 = field374;
                    if (class177.method163(var84)) {
                        method973(Statics.field2824[var84], 1);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 168) {
                int var85 = field348.method2409();
                int var86 = field348.method2406();
                if (var85 < -70000) {
                    var86 += 32768;
                }
                class177 var87;
                if (var85 >= 0) {
                    var87 = class177.method3198(var85);
                } else {
                    var87 = null;
                }
                while (field348.field2046 < field349) {
                    int var88 = field348.method2433();
                    int var89 = field348.method2406();
                    int var90 = 0;
                    if (var89 != 0) {
                        var90 = field348.method2404();
                        if (var90 == 255) {
                            var90 = field348.method2409();
                        }
                    }
                    if (var87 != null && var88 >= 0 && var88 < var87.field2910.length) {
                        var87.field2910[var88] = var89;
                        var87.field2874[var88] = var90;
                    }
                    class16.method191(var86, var88, var89 - 1, var90);
                }
                if (var87 != null) {
                    method654(var87);
                }
                method962();
                field489[++field490 - 1 & 0x1F] = var86 & 0x7FFF;
                field350 = -1;
                return true;
            }
            if (field350 == 165) {
                boolean var91 = field348.method2404() == 1;
                int var92 = field348.method2575();
                class177 var93 = class177.method3198(var92);
                if (var93.field2823 != var91) {
                    var93.field2823 = var91;
                    method654(var93);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 53) {
                field348.field2046 += 28;
                if (field348.method2427()) {
                    class153.method1223(field348, field348.field2046 - 28);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 138) {
                method2320(true);
                field350 = -1;
                return true;
            }
            if (field350 == 124) {
                field318 = field348.method2585() * 30;
                field498 = field486;
                field350 = -1;
                return true;
            }
            if (field350 == 212) {
                int var94 = field348.method2409();
                int var95 = field348.method2449();
                int var96 = field348.method2388();
                if (var96 == 65535) {
                    var96 = -1;
                }
                int var97 = field348.method2432();
                if (var97 == 65535) {
                    var97 = -1;
                }
                for (int var98 = var96; var98 <= var97; var98++) {
                    long var99 = ((long) var94 << 32) + (long) var98;
                    class212 var101 = field503.method3564(var99);
                    if (var101 != null) {
                        var101.method3706();
                    }
                    field503.method3565(new class205(var95), var99);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 210) {
                int var102 = field348.method2575();
                class177 var103 = class177.method3198(var102);
                var103.field2846 = 3;
                var103.field2847 = Statics.field2137.field33.method3302();
                method654(var103);
                field350 = -1;
                return true;
            }
            if (field350 == 242) {
                Statics.field1798 = field348.method2404();
                Statics.field1215 = field348.method2431();
                field350 = -1;
                return true;
            }
            if (field350 == 172) {
                method2092(false);
                field348.method2648();
                int var104 = field348.method2406();
                class35.method567(field348, var104);
                field350 = -1;
                return true;
            }
            if (field350 == 209) {
                method962();
                field467 = field348.method2407();
                field498 = field486;
                field350 = -1;
                return true;
            }
            if (field350 == 93) {
                int var105 = field348.method2575();
                Statics.field182 = Statics.field899.method2793(var105);
                field350 = -1;
                return true;
            }
            if (field350 == 115) {
                Statics.field1798 = field348.method2513();
                Statics.field1215 = field348.method2513();
                for (int var106 = Statics.field1215; var106 < Statics.field1215 + 8; var106++) {
                    for (int var107 = Statics.field1798; var107 < Statics.field1798 + 8; var107++) {
                        if (field434[Statics.field2760][var106][var107] != null) {
                            field434[Statics.field2760][var106][var107] = null;
                            method3210(var106, var107);
                        }
                    }
                }
                for (class17 var108 = (class17) field572.method3597(); var108 != null; var108 = (class17) field572.method3599()) {
                    if (var108.field244 >= Statics.field1215 && var108.field244 < Statics.field1215 + 8 && var108.field261 >= Statics.field1798 && var108.field261 < Statics.field1798 + 8 && Statics.field2760 == var108.field253) {
                        var108.field243 = 0;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 100) {
                field519 = field348.method2404();
                field520 = field348.method2404();
                field350 = -1;
                return true;
            }
            if (field350 == 20) {
                int var109 = field348.method2449();
                int var110 = field348.method2432();
                class177 var111 = class177.method3198(var109);
                if (var111.field2846 != 2 || var111.field2847 != var110) {
                    var111.field2846 = 2;
                    var111.field2847 = var110;
                    method654(var111);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 220) {
                method555(field348.method2412());
                field350 = -1;
                return true;
            }
            if (field350 == 201) {
                String var112 = field348.method2412();
                int var113 = field348.method2513();
                int var114 = field348.method2431();
                if (var113 >= 1 && var113 <= 8) {
                    if (var112.equalsIgnoreCase("null")) {
                        var112 = null;
                    }
                    field430[var113 - 1] = var112;
                    field431[var113 - 1] = var114 == 0;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 234) {
                int var115 = field348.method2442();
                int var116 = field348.method2449();
                class177 var117 = class177.method3198(var116);
                if (var117.field2829 != var115 || var115 == -1) {
                    var117.field2829 = var115;
                    var117.field2935 = 0;
                    var117.field2926 = 0;
                    method654(var117);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 198) {
                if (field374 != -1) {
                    int var118 = field374;
                    if (class177.method163(var118)) {
                        method973(Statics.field2824[var118], 0);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 30) {
                method962();
                field551 = field348.method2404();
                field498 = field486;
                field350 = -1;
                return true;
            }
            if (field350 == 123) {
                field535 = field348.method2404();
                if (field535 == 255) {
                    field535 = 0;
                }
                field435 = field348.method2404();
                if (field435 == 255) {
                    field435 = 0;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 189) {
                String var119 = field348.method2412();
                Object[] var120 = new Object[var119.length() + 1];
                for (int var121 = var119.length() - 1; var121 >= 0; var121--) {
                    if (var119.charAt(var121) == 's') {
                        var120[var121 + 1] = field348.method2412();
                    } else {
                        var120[var121 + 1] = Integer.valueOf(field348.method2409());
                    }
                }
                var120[0] = Integer.valueOf(field348.method2409());
                class1 var122 = new class1();
                var122.field9 = var120;
                class39.method147(var122);
                field350 = -1;
                return true;
            }
            if (field350 == 166) {
                int var123 = field348.method2585();
                int var124 = field348.method2450();
                class177 var125 = class177.method3198(var124);
                if (var125.field2846 != 1 || var125.field2847 != var123) {
                    var125.field2846 = 1;
                    var125.field2847 = var123;
                    method654(var125);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 248) {
                int var126 = field348.method2433();
                boolean var127 = field348.method2404() == 1;
                String var128 = "";
                boolean var129 = false;
                if (var127) {
                    var128 = field348.method2412();
                    if (method2692(var128)) {
                        var129 = true;
                    }
                }
                String var130 = field348.method2412();
                if (!var129) {
                    class12.method2280(var126, var128, var130);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 66) {
                int var131 = field348.method2449();
                int var132 = field348.method2585();
                int var133 = field348.method2406();
                int var134 = field348.method2388();
                class177 var135 = class177.method3198(var131);
                if (var135.field2880 != var134 || var135.field2907 != var133 || var135.field2857 != var132) {
                    var135.field2880 = var134;
                    var135.field2907 = var133;
                    var135.field2857 = var132;
                    method654(var135);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 140) {
                int var136 = field348.method2575();
                class177 var137 = class177.method3198(var136);
                for (int var138 = 0; var138 < var137.field2910.length; var138++) {
                    var137.field2910[var138] = -1;
                    var137.field2910[var138] = 0;
                }
                method654(var137);
                field350 = -1;
                return true;
            }
            if (field350 == 104) {
                int var139 = field348.method2432();
                if (var139 == 65535) {
                    var139 = -1;
                }
                int var140 = field348.method2450();
                int var141 = field348.method2450();
                class177 var142 = class177.method3198(var140);
                if (var142.field2863) {
                    var142.field2923 = var139;
                    var142.field2924 = var141;
                    class56 var144 = class56.method2018(var139);
                    var142.field2880 = var144.field1179;
                    var142.field2907 = var144.field1180;
                    var142.field2856 = var144.field1181;
                    var142.field2914 = var144.field1182;
                    var142.field2899 = var144.field1183;
                    var142.field2857 = var144.field1178;
                    if (var144.field1184 == 1) {
                        var142.field2861 = 1;
                    } else {
                        var142.field2861 = 2;
                    }
                    if (var142.field2792 > 0) {
                        var142.field2857 = var142.field2857 * 32 / var142.field2792;
                    } else if (var142.field2814 > 0) {
                        var142.field2857 = var142.field2857 * 32 / var142.field2814;
                    }
                    method654(var142);
                } else if (var139 == -1) {
                    var142.field2846 = 0;
                    field350 = -1;
                    return true;
                } else {
                    class56 var143 = class56.method2018(var139);
                    var142.field2846 = 4;
                    var142.field2847 = var139;
                    var142.field2880 = var143.field1179;
                    var142.field2907 = var143.field1180;
                    var142.field2857 = var143.field1178 * 100 / var141;
                    method654(var142);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 219) {
                int var145 = field348.method2432();
                int var146 = field348.method2575();
                int var147 = var145 >> 10 & 0x1F;
                int var148 = var145 >> 5 & 0x1F;
                int var149 = var145 & 0x1F;
                int var150 = (var149 << 3) + (var147 << 19) + (var148 << 11);
                class177 var151 = class177.method3198(var146);
                if (var151.field2828 != var150) {
                    var151.field2828 = var150;
                    method654(var151);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 251) {
                class35.method567(field348, field349);
                field350 = -1;
                return true;
            }
            if (field350 == 247) {
                int var152 = field348.method2585();
                class16 var153 = (class16) class16.field240.method3564((long) var152);
                if (var153 != null) {
                    var153.method3706();
                }
                field489[++field490 - 1 & 0x1F] = var152 & 0x7FFF;
                field350 = -1;
                return true;
            }
            if (field350 == 81) {
                int var154 = field348.method2406();
                field374 = var154;
                method1634(false);
                method558(var154);
                class39.method129(field374);
                for (int var155 = 0; var155 < 100; var155++) {
                    field495[var155] = true;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 70) {
                field571 = field486;
                if (field349 == 0) {
                    field542 = null;
                    field529 = null;
                    Statics.field897 = 0;
                    Statics.field2233 = null;
                    field350 = -1;
                    return true;
                }
                field529 = field348.method2412();
                long var156 = field348.method2426();
                long var158 = var156;
                String var160;
                if (var156 <= 0L || var156 >= 6582952005840035281L) {
                    var160 = null;
                } else if (var156 % 37L == 0L) {
                    var160 = null;
                } else {
                    int var161 = 0;
                    for (long var162 = var156; var162 != 0L; var162 /= 37L) {
                        var161++;
                    }
                    StringBuilder var164 = new StringBuilder(var161);
                    while (var158 != 0L) {
                        long var165 = var158;
                        var158 /= 37L;
                        var164.append(class166.field2699[(int) (var165 - var158 * 37L)]);
                    }
                    var160 = var164.reverse().toString();
                }
                field542 = var160;
                Statics.field225 = field348.method2405();
                int var167 = field348.method2404();
                if (var167 == 255) {
                    field350 = -1;
                    return true;
                }
                Statics.field897 = var167;
                class26[] var168 = new class26[100];
                for (int var169 = 0; var169 < Statics.field897; var169++) {
                    var168[var169] = new class26();
                    var168[var169].field646 = field348.method2412();
                    var168[var169].field652 = class168.method2023(var168[var169].field646, Statics.field303);
                    var168[var169].field647 = field348.method2406();
                    var168[var169].field648 = field348.method2405();
                    field348.method2412();
                    if (var168[var169].field646.equals(Statics.field2137.field37)) {
                        Statics.field714 = var168[var169].field648;
                    }
                }
                boolean var170 = false;
                int var171 = Statics.field897;
                while (var171 > 0) {
                    boolean var172 = true;
                    var171--;
                    for (int var173 = 0; var173 < var171; var173++) {
                        if (var168[var173].field652.compareTo(var168[var173 + 1].field652) > 0) {
                            class26 var174 = var168[var173];
                            var168[var173] = var168[var173 + 1];
                            var168[var173 + 1] = var174;
                            var172 = false;
                        }
                    }
                    if (var172) {
                        break;
                    }
                }
                Statics.field2233 = var168;
                field350 = -1;
                return true;
            }
            if (field350 == 16) {
                int var175 = field348.method2431();
                int var176 = field348.method2406();
                int var177 = field348.method2450();
                class4 var178 = (class4) field462.method3564((long) var177);
                if (var178 != null) {
                    method3510(var178, var178.field63 != var176);
                }
                method1039(var177, var176, var175);
                field350 = -1;
                return true;
            }
            if (field350 == 236) {
                field570 = 1;
                field494 = field486;
                field350 = -1;
                return true;
            }
            if (field350 == 35) {
                field549 = true;
                Statics.field2019 = field348.method2404();
                Statics.field1446 = field348.method2404();
                Statics.field1618 = field348.method2406();
                Statics.field590 = field348.method2404();
                Statics.field2331 = field348.method2404();
                if (Statics.field2331 >= 100) {
                    Statics.field708 = Statics.field2019 * 128 + 64;
                    Statics.field796 = Statics.field1446 * 128 + 64;
                    Statics.field698 = method182(Statics.field708, Statics.field796, Statics.field2760) - Statics.field1618;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 87) {
                int var179 = field348.method2409();
                int var180 = field348.method2409();
                if (Statics.field1831 == null || !Statics.field1831.isValid()) {
                    try {
                        Iterator var181 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var181.hasNext()) {
                            GarbageCollectorMXBean var182 = (GarbageCollectorMXBean) var181.next();
                            if (var182.isValid()) {
                                Statics.field1831 = var182;
                                field451 = -1L;
                                field579 = -1L;
                            }
                        }
                    } catch (Throwable var331) {
                    }
                }
                long var184 = class119.method719();
                int var186 = -1;
                if (Statics.field1831 != null) {
                    long var187 = Statics.field1831.getCollectionTime();
                    if (field579 != -1L) {
                        long var189 = var187 - field579;
                        long var191 = var184 - field451;
                        if (var191 != 0L) {
                            var186 = (int) (var189 * 100L / var191);
                        }
                    }
                    field579 = var187;
                    field451 = var184;
                }
                field379.method2661(145);
                field379.method2428(var186);
                field379.method2429(field2249);
                field379.method2470(var179);
                field379.method2591(var180);
                field350 = -1;
                return true;
            }
            if (field350 == 151) {
                int var193 = field348.method2409();
                int var194 = field348.method2406();
                if (var193 < -70000) {
                    var194 += 32768;
                }
                class177 var195;
                if (var193 >= 0) {
                    var195 = class177.method3198(var193);
                } else {
                    var195 = null;
                }
                if (var195 != null) {
                    for (int var196 = 0; var196 < var195.field2910.length; var196++) {
                        var195.field2910[var196] = 0;
                        var195.field2874[var196] = 0;
                    }
                }
                class16 var197 = (class16) class16.field240.method3564((long) var194);
                if (var197 != null) {
                    for (int var198 = 0; var198 < var197.field232.length; var198++) {
                        var197.field232[var198] = -1;
                        var197.field233[var198] = 0;
                    }
                }
                int var199 = field348.method2406();
                for (int var200 = 0; var200 < var199; var200++) {
                    int var201 = field348.method2404();
                    if (var201 == 255) {
                        var201 = field348.method2575();
                    }
                    int var202 = field348.method2432();
                    if (var195 != null && var200 < var195.field2910.length) {
                        var195.field2910[var200] = var202;
                        var195.field2874[var200] = var201;
                    }
                    class16.method191(var194, var200, var202 - 1, var201);
                }
                if (var195 != null) {
                    method654(var195);
                }
                method962();
                field489[++field490 - 1 & 0x1F] = var194 & 0x7FFF;
                field350 = -1;
                return true;
            }
            if (field350 == 162) {
                String var203 = field348.method2412();
                long var204 = field348.method2426();
                long var206 = (long) field348.method2406();
                long var208 = (long) field348.method2408();
                class156[] var210 = new class156[] { class156.field2315, class156.field2312, class156.field2313, class156.field2311, class156.field2310, class156.field2320 };
                class156 var211 = (class156) class113.method2810(var210, field348.method2404());
                long var212 = (var206 << 32) + var208;
                boolean var214 = false;
                for (int var215 = 0; var215 < 100; var215++) {
                    if (field522[var215] == var212) {
                        var214 = true;
                        break;
                    }
                }
                if (var211.field2321 && method2692(var203)) {
                    var214 = true;
                }
                if (!var214 && field443 == 0) {
                    field522[field469] = var212;
                    field469 = (field469 + 1) % 100;
                    class126 var216 = field348;
                    String var220;
                    try {
                        int var217 = var216.method2433();
                        if (var217 > 32767) {
                            var217 = 32767;
                        }
                        byte[] var218 = new byte[var217];
                        var216.field2046 += Statics.field3237.method2339(var216.field2049, var216.field2046, var218, 0, var217);
                        String var219 = class169.method2828(var218, 0, var217);
                        var220 = var219;
                    } catch (Exception var330) {
                        var220 = "Cabbage";
                    }
                    String var223 = class227.method3818(class167.method2702(var220));
                    if (var211.field2318 == -1) {
                        class12.method639(9, var203, var223, class166.method2114(var204));
                    } else {
                        class12.method639(9, class2.method2279(var211.field2318) + var203, var223, class166.method2114(var204));
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 159) {
                boolean var224 = field348.method2404() == 1;
                if (var224) {
                    Statics.field832 = class119.method719() - field348.method2426();
                    Statics.field2123 = new class225(field348, true);
                } else {
                    Statics.field2123 = null;
                }
                field497 = field486;
                field350 = -1;
                return true;
            }
            if (field350 == 129) {
                int var225 = field348.method2404();
                class134[] var226 = class134.method10();
                int var227 = 0;
                class134 var229;
                while (true) {
                    if (var227 >= var226.length) {
                        var229 = null;
                        break;
                    }
                    class134 var228 = var226[var227];
                    if (var228.field2113 == var225) {
                        var229 = var228;
                        break;
                    }
                    var227++;
                }
                Statics.field2755 = var229;
                field350 = -1;
                return true;
            }
            if (field350 == 88) {
                int var230 = field349 + field348.field2046;
                int var231 = field348.method2406();
                int var232 = field348.method2406();
                if (field374 != var231) {
                    field374 = var231;
                    method1634(false);
                    method558(field374);
                    class39.method129(field374);
                    for (int var233 = 0; var233 < 100; var233++) {
                        field495[var233] = true;
                    }
                }
                while (var232-- > 0) {
                    int var234 = field348.method2409();
                    int var235 = field348.method2406();
                    int var236 = field348.method2404();
                    class4 var237 = (class4) field462.method3564((long) var234);
                    if (var237 != null && var237.field63 != var235) {
                        method3510(var237, true);
                        var237 = null;
                    }
                    if (var237 == null) {
                        var237 = method1039(var234, var235, var236);
                    }
                    var237.field68 = true;
                }
                for (class4 var238 = (class4) field462.method3567(); var238 != null; var238 = (class4) field462.method3568()) {
                    if (var238.field68) {
                        var238.field68 = false;
                    } else {
                        method3510(var238, true);
                    }
                }
                field503 = new class200(512);
                while (field348.field2046 < var230) {
                    int var239 = field348.method2409();
                    int var240 = field348.method2406();
                    int var241 = field348.method2406();
                    int var242 = field348.method2409();
                    for (int var243 = var240; var243 <= var241; var243++) {
                        long var244 = ((long) var239 << 32) + (long) var243;
                        field503.method3565(new class205(var242), var244);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 27) {
                method2320(false);
                field350 = -1;
                return true;
            }
            if (field350 == 239) {
                int var246 = field348.method2450();
                String var247 = field348.method2412();
                class177 var248 = class177.method3198(var246);
                if (!var247.equals(var248.field2855)) {
                    var248.field2855 = var247;
                    method654(var248);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 57) {
                for (int var249 = 0; var249 < class180.field2955.length; var249++) {
                    if (class180.field2957[var249] != class180.field2955[var249]) {
                        class180.field2955[var249] = class180.field2957[var249];
                        method2835(var249);
                        field487[++field427 - 1 & 0x1F] = var249;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 117) {
                Statics.field1215 = field348.method2513();
                Statics.field1798 = field348.method2404();
                while (field348.field2046 < field349) {
                    field350 = field348.method2404();
                    method71();
                }
                field350 = -1;
                return true;
            }
            if (field350 == 101) {
                String var250 = field348.method2412();
                int var251 = field348.method2406();
                byte var252 = field348.method2405();
                boolean var253 = false;
                if (var252 == -128) {
                    var253 = true;
                }
                if (var253) {
                    if (Statics.field897 == 0) {
                        field350 = -1;
                        return true;
                    }
                    boolean var254 = false;
                    int var255;
                    for (var255 = 0; var255 < Statics.field897 && (!Statics.field2233[var255].field646.equals(var250) || Statics.field2233[var255].field647 != var251); var255++) {
                    }
                    if (var255 < Statics.field897) {
                        while (var255 < Statics.field897 - 1) {
                            Statics.field2233[var255] = Statics.field2233[var255 + 1];
                            var255++;
                        }
                        Statics.field897--;
                        Statics.field2233[Statics.field897] = null;
                    }
                } else {
                    field348.method2412();
                    class26 var256 = new class26();
                    var256.field646 = var250;
                    var256.field652 = class168.method2023(var256.field646, Statics.field303);
                    var256.field647 = var251;
                    var256.field648 = var252;
                    int var257;
                    for (var257 = Statics.field897 - 1; var257 >= 0; var257--) {
                        int var258 = Statics.field2233[var257].field652.compareTo(var256.field652);
                        if (var258 == 0) {
                            Statics.field2233[var257].field647 = var251;
                            Statics.field2233[var257].field648 = var252;
                            if (var250.equals(Statics.field2137.field37)) {
                                Statics.field714 = var252;
                            }
                            field571 = field486;
                            field350 = -1;
                            return true;
                        }
                        if (var258 < 0) {
                            break;
                        }
                    }
                    if (Statics.field897 >= Statics.field2233.length) {
                        field350 = -1;
                        return true;
                    }
                    for (int var259 = Statics.field897 - 1; var259 > var257; var259--) {
                        Statics.field2233[var259 + 1] = Statics.field2233[var259];
                    }
                    if (Statics.field897 == 0) {
                        Statics.field2233 = new class26[100];
                    }
                    Statics.field2233[var257 + 1] = var256;
                    Statics.field897++;
                    if (var250.equals(Statics.field2137.field37)) {
                        Statics.field714 = var252;
                    }
                }
                field571 = field486;
                field350 = -1;
                return true;
            }
            if (field350 == 86) {
                String var260 = field348.method2412();
                long var261 = (long) field348.method2406();
                long var263 = (long) field348.method2408();
                class156[] var265 = new class156[] { class156.field2315, class156.field2312, class156.field2313, class156.field2311, class156.field2310, class156.field2320 };
                class156 var266 = (class156) class113.method2810(var265, field348.method2404());
                long var267 = (var261 << 32) + var263;
                boolean var269 = false;
                for (int var270 = 0; var270 < 100; var270++) {
                    if (field522[var270] == var267) {
                        var269 = true;
                        break;
                    }
                }
                if (method2692(var260)) {
                    var269 = true;
                }
                if (!var269 && field443 == 0) {
                    field522[field469] = var267;
                    field469 = (field469 + 1) % 100;
                    class126 var271 = field348;
                    String var275;
                    try {
                        int var272 = var271.method2433();
                        if (var272 > 32767) {
                            var272 = 32767;
                        }
                        byte[] var273 = new byte[var272];
                        var271.field2046 += Statics.field3237.method2339(var271.field2049, var271.field2046, var273, 0, var272);
                        String var274 = class169.method2828(var273, 0, var272);
                        var275 = var274;
                    } catch (Exception var329) {
                        var275 = "Cabbage";
                    }
                    String var278 = class227.method3818(class167.method2702(var275));
                    byte var279;
                    if (var266.field2316) {
                        var279 = 7;
                    } else {
                        var279 = 3;
                    }
                    if (var266.field2318 == -1) {
                        class12.method2280(var279, var260, var278);
                    } else {
                        class12.method2280(var279, class2.method2279(var266.field2318) + var260, var278);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 71) {
                for (int var280 = 0; var280 < field420.length; var280++) {
                    if (field420[var280] != null) {
                        field420[var280].field868 = -1;
                    }
                }
                for (int var281 = 0; var281 < field341.length; var281++) {
                    if (field341[var281] != null) {
                        field341[var281].field868 = -1;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 7) {
                field549 = false;
                for (int var282 = 0; var282 < 5; var282++) {
                    field521[var282] = false;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 116) {
                field307 = field348.method2404();
                if (field307 == 1) {
                    field320 = field348.method2406();
                }
                if (field307 >= 2 && field307 <= 6) {
                    if (field307 == 2) {
                        field541 = 64;
                        field326 = 64;
                    }
                    if (field307 == 3) {
                        field541 = 0;
                        field326 = 64;
                    }
                    if (field307 == 4) {
                        field541 = 128;
                        field326 = 64;
                    }
                    if (field307 == 5) {
                        field541 = 64;
                        field326 = 0;
                    }
                    if (field307 == 6) {
                        field541 = 64;
                        field326 = 128;
                    }
                    field307 = 2;
                    field322 = field348.method2406();
                    field530 = field348.method2406();
                    field324 = field348.method2404();
                }
                if (field307 == 10) {
                    field321 = field348.method2406();
                }
                field350 = -1;
                return true;
            }
            if (field350 == 232) {
                int var283 = field348.method2404();
                int var284 = field348.method2404();
                int var285 = field348.method2404();
                int var286 = field348.method2404();
                field521[var283] = true;
                field552[var283] = var284;
                field553[var283] = var285;
                field554[var283] = var286;
                field505[var283] = 0;
                field350 = -1;
                return true;
            }
            if (field350 == 54) {
                int var287 = field348.method2388();
                if (var287 == 65535) {
                    var287 = -1;
                }
                method2326(var287);
                field350 = -1;
                return true;
            }
            if (field350 == 69) {
                int var288 = field348.method2408();
                int var289 = field348.method2406();
                if (var289 == 65535) {
                    var289 = -1;
                }
                method173(var289, var288);
                field350 = -1;
                return true;
            }
            if (field350 == 111) {
                while (field348.field2046 < field349) {
                    boolean var290 = field348.method2404() == 1;
                    String var291 = field348.method2412();
                    String var292 = field348.method2412();
                    int var293 = field348.method2406();
                    int var294 = field348.method2404();
                    int var295 = field348.method2404();
                    boolean var296 = (var295 & 0x2) != 0;
                    boolean var297 = (var295 & 0x1) != 0;
                    if (var293 > 0) {
                        field348.method2412();
                        field348.method2404();
                        field348.method2409();
                    }
                    field348.method2412();
                    for (int var298 = 0; var298 < field569; var298++) {
                        class18 var299 = field306[var298];
                        if (var290) {
                            if (var292.equals(var299.field264)) {
                                var299.field264 = var291;
                                var299.field263 = var292;
                                var291 = null;
                                break;
                            }
                        } else if (var291.equals(var299.field264)) {
                            if (var299.field275 != var293) {
                                boolean var300 = true;
                                for (class41 var301 = (class41) field504.method3556(); var301 != null; var301 = (class41) field504.method3562()) {
                                    if (var301.field902.equals(var291)) {
                                        if (var293 != 0 && var301.field904 == 0) {
                                            var301.method3696();
                                            var300 = false;
                                        } else if (var293 == 0 && var301.field904 != 0) {
                                            var301.method3696();
                                            var300 = false;
                                        }
                                    }
                                }
                                if (var300) {
                                    field504.method3555(new class41(var291, var293));
                                }
                                var299.field275 = var293;
                            }
                            var299.field263 = var292;
                            var299.field265 = var294;
                            var299.field272 = var296;
                            var299.field267 = var297;
                            var291 = null;
                            break;
                        }
                    }
                    if (var291 != null && field569 < 400) {
                        class18 var302 = new class18();
                        field306[field569] = var302;
                        var302.field264 = var291;
                        var302.field263 = var292;
                        var302.field275 = var293;
                        var302.field265 = var294;
                        var302.field272 = var296;
                        var302.field267 = var297;
                        field569++;
                    }
                }
                field570 = 2;
                field494 = field486;
                boolean var303 = false;
                int var304 = field569;
                while (var304 > 0) {
                    boolean var305 = true;
                    var304--;
                    for (int var306 = 0; var306 < var304; var306++) {
                        boolean var307 = false;
                        class18 var308 = field306[var306];
                        class18 var309 = field306[var306 + 1];
                        if (field300 != var308.field275 && field300 == var309.field275) {
                            var307 = true;
                        }
                        if (!var307 && var308.field275 == 0 && var309.field275 != 0) {
                            var307 = true;
                        }
                        if (!var307 && !var308.field272 && var309.field272) {
                            var307 = true;
                        }
                        if (!var307 && !var308.field267 && var309.field267) {
                            var307 = true;
                        }
                        if (var307) {
                            class18 var310 = field306[var306];
                            field306[var306] = field306[var306 + 1];
                            field306[var306 + 1] = var310;
                            var305 = false;
                        }
                    }
                    if (var305) {
                        break;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 118) {
                String var311 = field348.method2412();
                class126 var312 = field348;
                String var316;
                try {
                    int var313 = var312.method2433();
                    if (var313 > 32767) {
                        var313 = 32767;
                    }
                    byte[] var314 = new byte[var313];
                    var312.field2046 += Statics.field3237.method2339(var312.field2049, var312.field2046, var314, 0, var313);
                    String var315 = class169.method2828(var314, 0, var313);
                    var316 = var315;
                } catch (Exception var328) {
                    var316 = "Cabbage";
                }
                String var319 = class227.method3818(class167.method2702(var316));
                class12.method2280(6, var311, var319);
                field350 = -1;
                return true;
            }
            if (field350 == 60) {
                int var320 = field348.method2575();
                int var321 = field348.method2585();
                int var322 = field348.method2585();
                class177 var323 = class177.method3198(var320);
                var323.field2859 = (var321 << 16) + var322;
                field350 = -1;
                return true;
            }
            class152.method2021("" + field350 + class2.field20 + field422 + class2.field20 + field355 + class2.field20 + field349, (Throwable) null);
            method868();
        } catch (IOException var337) {
            if (field356 > 0) {
                method868();
            } else {
                method2342(40);
                Statics.field1251 = Statics.field994;
                Statics.field994 = null;
            }
        } catch (Exception var338) {
            String var326 = "" + field350 + class2.field20 + field422 + class2.field20 + field355 + class2.field20 + field349 + class2.field20 + (Statics.field3127 + Statics.field2137.field857[0]) + class2.field20 + (Statics.field1671 + Statics.field2137.field858[0]) + class2.field20;
            for (int var327 = 0; var327 < field349 && var327 < 50; var327++) {
                var326 = var326 + field348.field2049[var327] + class2.field20;
            }
            class152.method2021(var326, var338);
            method868();
        }
        return true;
    }

    @ObfuscatedName("u.bi(I)V")
    public static final void method71() {
        if (field350 == 180) {
            int var0 = field348.method2404();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1215;
            int var2 = (var0 & 0x7) + Statics.field1798;
            int var3 = var1 + field348.method2405();
            int var4 = var2 + field348.method2405();
            int var5 = field348.method2407();
            int var6 = field348.method2406();
            int var7 = field348.method2404() * 4;
            int var8 = field348.method2404() * 4;
            int var9 = field348.method2406();
            int var10 = field348.method2406();
            int var11 = field348.method2404();
            int var12 = field348.method2404();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class7 var17 = new class7(var6, Statics.field2760, var13, var14, method182(var13, var14, Statics.field2760) - var7, field333 + var9, field333 + var10, var11, var12, var5, var8);
                var17.method94(var15, var16, method182(var15, var16, Statics.field2760) - var8, field333 + var9);
                field436.method3617(var17);
            }
        } else if (field350 == 252) {
            int var18 = field348.method2404();
            int var19 = (var18 >> 4 & 0x7) + Statics.field1215;
            int var20 = (var18 & 0x7) + Statics.field1798;
            int var21 = field348.method2406();
            int var22 = field348.method2404();
            int var23 = field348.method2406();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                int var24 = var19 * 128 + 64;
                int var25 = var20 * 128 + 64;
                class32 var26 = new class32(var21, Statics.field2760, var24, var25, method182(var24, var25, Statics.field2760) - var22, var23, field333);
                field437.method3617(var26);
            }
        } else if (field350 == 243) {
            int var27 = field348.method2431();
            int var28 = var27 >> 2;
            int var29 = var27 & 0x3;
            int var30 = field366[var28];
            int var31 = field348.method2480();
            int var32 = (var31 >> 4 & 0x7) + Statics.field1215;
            int var33 = (var31 & 0x7) + Statics.field1798;
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                method54(Statics.field2760, var32, var33, var30, -1, var28, var29, 0, -1);
            }
        } else if (field350 == 122) {
            int var34 = field348.method2431();
            int var35 = (var34 >> 4 & 0x7) + Statics.field1215;
            int var36 = (var34 & 0x7) + Statics.field1798;
            int var37 = field348.method2432();
            int var38 = field348.method2388();
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class31 var39 = new class31();
                var39.field710 = var38;
                var39.field711 = var37;
                if (field434[Statics.field2760][var35][var36] == null) {
                    field434[Statics.field2760][var35][var36] = new class203();
                }
                field434[Statics.field2760][var35][var36].method3617(var39);
                method3210(var35, var36);
            }
        } else {
            if (field350 == 223) {
                int var40 = field348.method2404();
                int var41 = (var40 >> 4 & 0x7) + Statics.field1215;
                int var42 = (var40 & 0x7) + Statics.field1798;
                int var43 = field348.method2406();
                int var44 = field348.method2404();
                int var45 = var44 >> 4 & 0xF;
                int var46 = var44 & 0x7;
                int var47 = field348.method2404();
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    int var48 = var45 + 1;
                    if (Statics.field2137.field857[0] >= var41 - var48 && Statics.field2137.field857[0] <= var41 + var48 && Statics.field2137.field858[0] >= var42 - var48 && Statics.field2137.field858[0] <= var42 + var48 && field409 != 0 && var46 > 0 && field543 < 50) {
                        field544[field543] = var43;
                        field545[field543] = var46;
                        field546[field543] = var47;
                        field555[field543] = null;
                        field547[field543] = (var41 << 16) + (var42 << 8) + var45;
                        field543++;
                    }
                }
            }
            if (field350 == 40) {
                int var49 = field348.method2404();
                int var50 = (var49 >> 4 & 0x7) + Statics.field1215;
                int var51 = (var49 & 0x7) + Statics.field1798;
                int var52 = field348.method2406();
                int var53 = field348.method2406();
                int var54 = field348.method2406();
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    class203 var55 = field434[Statics.field2760][var50][var51];
                    if (var55 != null) {
                        for (class31 var56 = (class31) var55.method3597(); var56 != null; var56 = (class31) var55.method3599()) {
                            if ((var52 & 0x7FFF) == var56.field710 && var56.field711 == var53) {
                                var56.field711 = var54;
                                break;
                            }
                        }
                        method3210(var50, var51);
                    }
                }
            } else if (field350 == 61) {
                int var57 = field348.method2585();
                int var58 = field348.method2480();
                int var59 = var58 >> 2;
                int var60 = var58 & 0x3;
                int var61 = field366[var59];
                int var62 = field348.method2404();
                int var63 = (var62 >> 4 & 0x7) + Statics.field1215;
                int var64 = (var62 & 0x7) + Statics.field1798;
                if (var63 >= 0 && var64 >= 0 && var63 < 103 && var64 < 103) {
                    if (var61 == 0) {
                        class91 var65 = Statics.field2091.method1948(Statics.field2760, var63, var64);
                        if (var65 != null) {
                            int var66 = var65.field1583 >> 14 & 0x7FFF;
                            if (var59 == 2) {
                                var65.field1579 = new class13(var66, 2, var60 + 4, Statics.field2760, var63, var64, var57, false, var65.field1579);
                                var65.field1584 = new class13(var66, 2, var60 + 1 & 0x3, Statics.field2760, var63, var64, var57, false, var65.field1584);
                            } else {
                                var65.field1579 = new class13(var66, var59, var60, Statics.field2760, var63, var64, var57, false, var65.field1579);
                            }
                        }
                    }
                    if (var61 == 1) {
                        class98 var67 = Statics.field2091.method1900(Statics.field2760, var63, var64);
                        if (var67 != null) {
                            int var68 = var67.field1665 >> 14 & 0x7FFF;
                            if (var59 == 4 || var59 == 5) {
                                var67.field1666 = new class13(var68, 4, var60, Statics.field2760, var63, var64, var57, false, var67.field1666);
                            } else if (var59 == 6) {
                                var67.field1666 = new class13(var68, 4, var60 + 4, Statics.field2760, var63, var64, var57, false, var67.field1666);
                            } else if (var59 == 7) {
                                var67.field1666 = new class13(var68, 4, (var60 + 2 & 0x3) + 4, Statics.field2760, var63, var64, var57, false, var67.field1666);
                            } else if (var59 == 8) {
                                var67.field1666 = new class13(var68, 4, var60 + 4, Statics.field2760, var63, var64, var57, false, var67.field1666);
                                var67.field1664 = new class13(var68, 4, (var60 + 2 & 0x3) + 4, Statics.field2760, var63, var64, var57, false, var67.field1664);
                            }
                        }
                    }
                    if (var61 == 2) {
                        class102 var69 = Statics.field2091.method1858(Statics.field2760, var63, var64);
                        if (var59 == 11) {
                            var59 = 10;
                        }
                        if (var69 != null) {
                            var69.field1719 = new class13(var69.field1727 >> 14 & 0x7FFF, var59, var60, Statics.field2760, var63, var64, var57, false, var69.field1719);
                        }
                    }
                    if (var61 == 3) {
                        class97 var70 = Statics.field2091.method1953(Statics.field2760, var63, var64);
                        if (var70 != null) {
                            var70.field1647 = new class13(var70.field1645 >> 14 & 0x7FFF, 22, var60, Statics.field2760, var63, var64, var57, false, var70.field1647);
                        }
                    }
                }
            } else if (field350 == 28) {
                int var71 = field348.method2480();
                int var72 = (var71 >> 4 & 0x7) + Statics.field1215;
                int var73 = (var71 & 0x7) + Statics.field1798;
                int var74 = field348.method2406();
                int var75 = field348.method2480();
                int var76 = var75 >> 2;
                int var77 = var75 & 0x3;
                int var78 = field366[var76];
                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                    method54(Statics.field2760, var72, var73, var78, var74, var76, var77, 0, -1);
                }
            } else {
                if (field350 == 217) {
                    byte var79 = field348.method2599();
                    byte var80 = field348.method2434();
                    int var81 = field348.method2432();
                    int var82 = field348.method2480();
                    int var83 = (var82 >> 4 & 0x7) + Statics.field1215;
                    int var84 = (var82 & 0x7) + Statics.field1798;
                    int var85 = field348.method2513();
                    int var86 = var85 >> 2;
                    int var87 = var85 & 0x3;
                    int var88 = field366[var86];
                    int var89 = field348.method2406();
                    int var90 = field348.method2585();
                    int var91 = field348.method2388();
                    byte var92 = field348.method2599();
                    byte var93 = field348.method2599();
                    class3 var94;
                    if (field425 == var91) {
                        var94 = Statics.field2137;
                    } else {
                        var94 = field420[var91];
                    }
                    if (var94 != null) {
                        class43 var95 = class43.method117(var81);
                        int var96;
                        int var97;
                        if (var87 == 1 || var87 == 3) {
                            var96 = var95.field961;
                            var97 = var95.field960;
                        } else {
                            var96 = var95.field960;
                            var97 = var95.field961;
                        }
                        int var98 = (var96 >> 1) + var83;
                        int var99 = (var96 + 1 >> 1) + var83;
                        int var100 = (var97 >> 1) + var84;
                        int var101 = (var97 + 1 >> 1) + var84;
                        int[][] var102 = class6.field96[Statics.field2760];
                        int var103 = var102[var98][var100] + var102[var99][var100] + var102[var98][var101] + var102[var99][var101] >> 2;
                        int var104 = (var83 << 7) + (var96 << 6);
                        int var105 = (var84 << 7) + (var97 << 6);
                        class109 var106 = var95.method811(var86, var87, var102, var104, var103, var105);
                        if (var106 != null) {
                            method54(Statics.field2760, var83, var84, var88, -1, 0, 0, var89 + 1, var90 + 1);
                            var94.field32 = field333 + var89;
                            var94.field42 = field333 + var90;
                            var94.field49 = var106;
                            var94.field60 = var83 * 128 + var96 * 64;
                            var94.field52 = var84 * 128 + var97 * 64;
                            var94.field45 = var103;
                            if (var80 > var92) {
                                byte var107 = var80;
                                var80 = var92;
                                var92 = var107;
                            }
                            if (var93 > var79) {
                                byte var108 = var93;
                                var93 = var79;
                                var79 = var108;
                            }
                            var94.field47 = var80 + var83;
                            var94.field58 = var83 + var92;
                            var94.field48 = var84 + var93;
                            var94.field50 = var79 + var84;
                        }
                    }
                }
                if (field350 == 12) {
                    int var109 = field348.method2513();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field1215;
                    int var111 = (var109 & 0x7) + Statics.field1798;
                    int var112 = field348.method2585();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class203 var113 = field434[Statics.field2760][var110][var111];
                        if (var113 != null) {
                            for (class31 var114 = (class31) var113.method3597(); var114 != null; var114 = (class31) var113.method3599()) {
                                if ((var112 & 0x7FFF) == var114.field710) {
                                    var114.method3706();
                                    break;
                                }
                            }
                            if (var113.method3597() == null) {
                                field434[Statics.field2760][var110][var111] = null;
                            }
                            method3210(var110, var111);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.by(IIIIIIIIII)V")
    public static final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field572.method3597(); var10 != null; var10 = (class17) field572.method3599()) {
            if (var10.field253 == arg0 && var10.field244 == arg1 && var10.field261 == arg2 && var10.field247 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field253 = arg0;
            var9.field247 = arg3;
            var9.field244 = arg1;
            var9.field261 = arg2;
            method162(var9);
            field572.method3617(var9);
        }
        var9.field249 = arg4;
        var9.field251 = arg5;
        var9.field250 = arg6;
        var9.field245 = arg7;
        var9.field243 = arg8;
    }

    @ObfuscatedName("dn.bu(B)V")
    public static final void method2604() {
        for (class17 var0 = (class17) field572.method3597(); var0 != null; var0 = (class17) field572.method3599()) {
            if (var0.field243 == -1) {
                var0.field245 = 0;
                method162(var0);
            } else {
                var0.method3706();
            }
        }
    }

    @ObfuscatedName("r.bb(Lw;I)V")
    public static final void method162(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field247 == 0) {
            var1 = Statics.field2091.method1860(arg0.field253, arg0.field244, arg0.field261);
        }
        if (arg0.field247 == 1) {
            var1 = Statics.field2091.method1861(arg0.field253, arg0.field244, arg0.field261);
        }
        if (arg0.field247 == 2) {
            var1 = Statics.field2091.method1862(arg0.field253, arg0.field244, arg0.field261);
        }
        if (arg0.field247 == 3) {
            var1 = Statics.field2091.method1934(arg0.field253, arg0.field244, arg0.field261);
        }
        if (var1 != 0) {
            int var5 = Statics.field2091.method1877(arg0.field253, arg0.field244, arg0.field261, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field258 = var2;
        arg0.field248 = var3;
        arg0.field242 = var4;
    }

    @ObfuscatedName("fc.bx(IIIIIIIB)V")
    public static final void method3068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field305 && Statics.field2760 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2091.method1860(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2091.method1861(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2091.method1862(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2091.method1934(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2091.method1877(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2091.method1851(arg0, arg2, arg3);
                class43 var15 = class43.method117(var12);
                if (var15.field962 != 0) {
                    field410[arg0].method2289(arg2, arg3, var13, var14, var15.field963);
                }
            }
            if (arg1 == 1) {
                Statics.field2091.method1852(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2091.method1853(arg0, arg2, arg3);
                class43 var16 = class43.method117(var12);
                if (var16.field960 + arg2 > 103 || var16.field960 + arg3 > 103 || var16.field961 + arg2 > 103 || var16.field961 + arg3 > 103) {
                    return;
                }
                if (var16.field962 != 0) {
                    field410[arg0].method2290(arg2, arg3, var16.field960, var16.field961, var14, var16.field963);
                }
            }
            if (arg1 == 3) {
                Statics.field2091.method1951(arg0, arg2, arg3);
                class43 var17 = class43.method117(var12);
                if (var17.field962 == 1) {
                    field410[arg0].method2292(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field86[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class90 var19 = Statics.field2091;
        class112 var20 = field410[arg0];
        class43 var21 = class43.method117(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field961;
            var23 = var21.field960;
        } else {
            var22 = var21.field960;
            var23 = var21.field961;
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
        int[][] var28 = class6.field96[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field964 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field985 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class89 var34;
            if (var21.field956 == -1 && var21.field986 == null) {
                var34 = var21.method811(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1946(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field962 == 1) {
                var20.method2287(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class89 var57;
            if (var21.field956 == -1 && var21.field986 == null) {
                var57 = var21.method811(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            if (var57 != null) {
                var19.method1844(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field962 != 0) {
                var20.method2284(arg2, arg3, var22, var23, var21.field963);
            }
        } else if (arg6 >= 12) {
            class89 var35;
            if (var21.field956 == -1 && var21.field986 == null) {
                var35 = var21.method811(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1844(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field962 != 0) {
                var20.method2284(arg2, arg3, var22, var23, var21.field963);
            }
        } else if (arg6 == 0) {
            class89 var36;
            if (var21.field956 == -1 && var21.field986 == null) {
                var36 = var21.method811(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1842(arg0, arg2, arg3, var29, var36, (class89) null, class6.field106[arg5], 0, var32, var33);
            if (var21.field962 != 0) {
                var20.method2303(arg2, arg3, arg6, arg5, var21.field963);
            }
        } else if (arg6 == 1) {
            class89 var37;
            if (var21.field956 == -1 && var21.field986 == null) {
                var37 = var21.method811(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1842(arg0, arg2, arg3, var29, var37, (class89) null, class6.field98[arg5], 0, var32, var33);
            if (var21.field962 != 0) {
                var20.method2303(arg2, arg3, arg6, arg5, var21.field963);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class89 var39;
            class89 var40;
            if (var21.field956 == -1 && var21.field986 == null) {
                var39 = var21.method811(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method811(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field956, true, (class89) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1842(arg0, arg2, arg3, var29, var39, var40, class6.field106[arg5], class6.field106[var38], var32, var33);
            if (var21.field962 != 0) {
                var20.method2303(arg2, arg3, arg6, arg5, var21.field963);
            }
        } else if (arg6 == 3) {
            class89 var41;
            if (var21.field956 == -1 && var21.field986 == null) {
                var41 = var21.method811(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1842(arg0, arg2, arg3, var29, var41, (class89) null, class6.field98[arg5], 0, var32, var33);
            if (var21.field962 != 0) {
                var20.method2303(arg2, arg3, arg6, arg5, var21.field963);
            }
        } else if (arg6 == 9) {
            class89 var42;
            if (var21.field956 == -1 && var21.field986 == null) {
                var42 = var21.method811(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1844(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field962 != 0) {
                var20.method2284(arg2, arg3, var22, var23, var21.field963);
            }
        } else if (arg6 == 4) {
            class89 var43;
            if (var21.field956 == -1 && var21.field986 == null) {
                var43 = var21.method811(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1843(arg0, arg2, arg3, var29, var43, (class89) null, class6.field106[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1860(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class43.method117(var45 >> 14 & 0x7FFF).field945;
            }
            class89 var46;
            if (var21.field956 == -1 && var21.field986 == null) {
                var46 = var21.method811(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1843(arg0, arg2, arg3, var29, var46, (class89) null, class6.field106[arg5], 0, class6.field99[arg5] * var44, class6.field100[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1860(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class43.method117(var48 >> 14 & 0x7FFF).field945 / 2;
            }
            class89 var49;
            if (var21.field956 == -1 && var21.field986 == null) {
                var49 = var21.method811(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1843(arg0, arg2, arg3, var29, var49, (class89) null, 256, arg5, class6.field101[arg5] * var47, class6.field102[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class89 var51;
            if (var21.field956 == -1 && var21.field986 == null) {
                var51 = var21.method811(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1843(arg0, arg2, arg3, var29, var51, (class89) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1860(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class43.method117(var53 >> 14 & 0x7FFF).field945 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class89 var55;
            class89 var56;
            if (var21.field956 == -1 && var21.field986 == null) {
                var55 = var21.method811(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method811(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field956, true, (class89) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field956, true, (class89) null);
            }
            var19.method1843(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field101[arg5] * var52, class6.field102[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("fl.ba(IIB)V")
    public static final void method3210(int arg0, int arg1) {
        class203 var2 = field434[Statics.field2760][arg0][arg1];
        if (var2 == null) {
            Statics.field2091.method1855(Statics.field2760, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class31 var5 = null;
        for (class31 var6 = (class31) var2.method3597(); var6 != null; var6 = (class31) var2.method3599()) {
            class56 var7 = class56.method2018(var6.field710);
            long var8 = (long) var7.field1187;
            if (var7.field1184 == 1) {
                var8 = (long) (var6.field711 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2091.method1855(Statics.field2760, arg0, arg1);
            return;
        }
        var2.method3593(var5);
        class31 var10 = null;
        class31 var11 = null;
        for (class31 var12 = (class31) var2.method3597(); var12 != null; var12 = (class31) var2.method3599()) {
            if (var5.field710 != var12.field710) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field710 != var12.field710 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2091.method1841(Statics.field2760, arg0, arg1, method182(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2760), var5, var13, var10, var11);
    }

    @ObfuscatedName("da.bq(ZI)V")
    public static final void method2320(boolean arg0) {
        field315 = 0;
        field344 = 0;
        field348.method2646();
        int var1 = field348.method2647(8);
        if (var1 < field342) {
            for (int var2 = var1; var2 < field342; var2++) {
                field428[++field315 - 1] = field343[var2];
            }
        }
        if (var1 > field342) {
            throw new RuntimeException("");
        }
        field342 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field343[var3];
            class37 var5 = field341[var4];
            int var6 = field348.method2647(1);
            if (var6 == 0) {
                field343[++field342 - 1] = var4;
                var5.field885 = field333;
            } else {
                int var7 = field348.method2647(2);
                if (var7 == 0) {
                    field343[++field342 - 1] = var4;
                    var5.field885 = field333;
                    field556[++field344 - 1] = var4;
                } else if (var7 == 1) {
                    field343[++field342 - 1] = var4;
                    var5.field885 = field333;
                    int var8 = field348.method2647(3);
                    var5.method727(var8, (byte) 1);
                    int var9 = field348.method2647(1);
                    if (var9 == 1) {
                        field556[++field344 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field343[++field342 - 1] = var4;
                    var5.field885 = field333;
                    int var10 = field348.method2647(3);
                    var5.method727(var10, (byte) 2);
                    int var11 = field348.method2647(3);
                    var5.method727(var11, (byte) 2);
                    int var12 = field348.method2647(1);
                    if (var12 == 1) {
                        field556[++field344 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field428[++field315 - 1] = var4;
                }
            }
        }
        method2019(arg0);
        method146();
        for (int var13 = 0; var13 < field315; var13++) {
            int var14 = field428[var13];
            if (field333 != field341[var14].field885) {
                field341[var14].field803 = null;
                field341[var14] = null;
            }
        }
        if (field349 != field348.field2046) {
            throw new RuntimeException(field348.field2046 + class2.field20 + field349);
        }
        for (int var15 = 0; var15 < field342; var15++) {
            if (field341[field343[var15]] == null) {
                throw new RuntimeException(var15 + class2.field20 + field342);
            }
        }
    }

    @ObfuscatedName("cn.bs(ZI)V")
    public static final void method2019(boolean arg0) {
        while (true) {
            if (field348.method2649(field349) >= 27) {
                int var1 = field348.method2647(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field341[var1] == null) {
                        field341[var1] = new class37();
                        var2 = true;
                    }
                    class37 var3 = field341[var1];
                    field343[++field342 - 1] = var1;
                    var3.field885 = field333;
                    int var4;
                    if (arg0) {
                        var4 = field348.method2647(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field348.method2647(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    var3.field803 = class42.method187(field348.method2647(14));
                    int var5 = field432[field348.method2647(3)];
                    if (var2) {
                        var3.field887 = var3.field838 = var5;
                    }
                    int var6 = field348.method2647(1);
                    if (var6 == 1) {
                        field556[++field344 - 1] = var1;
                    }
                    int var7 = field348.method2647(1);
                    int var8;
                    if (arg0) {
                        var8 = field348.method2647(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field348.method2647(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field840 = var3.field803.field911;
                    var3.field889 = var3.field803.field934;
                    if (var3.field889 == 0) {
                        var3.field838 = 0;
                    }
                    var3.field860 = var3.field803.field917;
                    var3.field845 = var3.field803.field931;
                    var3.field846 = var3.field803.field919;
                    var3.field847 = var3.field803.field908;
                    var3.field886 = var3.field803.field935;
                    var3.field863 = var3.field803.field922;
                    var3.field843 = var3.field803.field916;
                    var3.method722(Statics.field2137.field857[0] + var4, Statics.field2137.field858[0] + var8, var7 == 1);
                    continue;
                }
            }
            field348.method2650();
            return;
        }
    }

    @ObfuscatedName("p.bn(B)V")
    public static final void method146() {
        for (int var0 = 0; var0 < field344; var0++) {
            int var1 = field556[var0];
            class37 var2 = field341[var1];
            int var3 = field348.method2404();
            if ((var3 & 0x8) != 0) {
                int var4 = field348.method2406();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field348.method2513();
                if (var2.field868 == var4 && var4 != -1) {
                    int var6 = class45.method3523(var4).field1007;
                    if (var6 == 1) {
                        var2.field854 = 0;
                        var2.field881 = 0;
                        var2.field852 = var5;
                        var2.field872 = 0;
                    }
                    if (var6 == 2) {
                        var2.field872 = 0;
                    }
                } else if (var4 == -1 || var2.field868 == -1 || class45.method3523(var4).field1015 >= class45.method3523(var2.field868).field1015) {
                    var2.field868 = var4;
                    var2.field854 = 0;
                    var2.field881 = 0;
                    var2.field852 = var5;
                    var2.field872 = 0;
                    var2.field895 = var2.field890;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field873 = field348.method2388();
                int var7 = field348.method2449();
                var2.field877 = var7 >> 16;
                var2.field836 = (var7 & 0xFFFF) + field333;
                var2.field874 = 0;
                var2.field875 = 0;
                if (var2.field836 > field333) {
                    var2.field874 = -1;
                }
                if (var2.field873 == 65535) {
                    var2.field873 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field803 = class42.method187(field348.method2406());
                var2.field840 = var2.field803.field911;
                var2.field889 = var2.field803.field934;
                var2.field860 = var2.field803.field917;
                var2.field845 = var2.field803.field931;
                var2.field846 = var2.field803.field919;
                var2.field847 = var2.field803.field908;
                var2.field886 = var2.field803.field935;
                var2.field863 = var2.field803.field922;
                var2.field843 = var2.field803.field916;
            }
            if ((var3 & 0x4) != 0) {
                int var8 = field348.method2480();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = field348.method2433();
                        if (var13 == 32767) {
                            var13 = field348.method2433();
                            var11 = field348.method2433();
                            var10 = field348.method2433();
                            var12 = field348.method2433();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = field348.method2433();
                        }
                        int var14 = field348.method2433();
                        var2.method753(var13, var11, var10, var12, field333, var14);
                    }
                }
                int var15 = field348.method2404();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = field348.method2433();
                        int var18 = field348.method2433();
                        if (var18 == 32767) {
                            var2.method755(var17);
                        } else {
                            int var19 = field348.method2433();
                            int var20 = field348.method2404();
                            int var21 = var18 > 0 ? field348.method2431() : var20;
                            var2.method754(var17, field333, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field869 = field348.method2432();
                if (var2.field869 == 65535) {
                    var2.field869 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var22 = field348.method2585();
                int var23 = field348.method2585();
                int var24 = var2.field879 - (var22 - Statics.field3127 - Statics.field3127) * 64;
                int var25 = var2.field837 - (var23 - Statics.field1671 - Statics.field1671) * 64;
                if (var24 != 0 || var25 != 0) {
                    var2.field864 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field862 = field348.method2412();
                var2.field848 = 100;
            }
        }
    }

    @ObfuscatedName("aa.bj(III)V")
    public static final void method898(int arg0, int arg1) {
        if (field411 < 2 && field454 == 0 && !field456) {
            return;
        }
        String var2;
        if (field454 == 1 && field411 < 2) {
            var2 = class161.field2503 + class161.field2513 + field313 + " " + class2.field24;
        } else if (field456 && field411 < 2) {
            var2 = field459 + class161.field2513 + field460 + " " + class2.field24;
        } else {
            int var3 = field411 - 1;
            String var4;
            if (field449[var3].length() > 0) {
                var4 = field470[var3] + class161.field2513 + field449[var3];
            } else {
                var4 = field470[var3];
            }
            var2 = var4;
        }
        if (field411 > 2) {
            var2 = var2 + class2.method2762(16777215) + " " + '/' + " " + (field411 - 2) + class161.field2548;
        }
        Statics.field812.method3827(var2, arg0 + 4, arg1 + 15, 16777215, 0, field333 / 1000);
    }

    @ObfuscatedName("eu.bp(I)V")
    public static final void method2826() {
        int var0 = Statics.field2229;
        int var1 = Statics.field2102;
        int var2 = Statics.field703;
        int var3 = Statics.field3134;
        int var4 = 6116423;
        class83.method1755(var0, var1, var2, var3, var4);
        class83.method1755(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class83.method1758(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field812.method3876(class161.field2555, var0 + 3, var1 + 14, var4, -1);
        int var5 = class144.field2205;
        int var6 = class144.field2207 * 900883817;
        for (int var7 = 0; var7 < field411; var7++) {
            int var8 = (field411 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class228 var10 = Statics.field812;
            String var11;
            if (field449[var7].length() > 0) {
                var11 = field470[var7] + class161.field2513 + field449[var7];
            } else {
                var11 = field470[var7];
            }
            var10.method3876(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field2229;
        int var13 = Statics.field2102;
        int var14 = Statics.field703;
        int var15 = Statics.field3134;
        for (int var16 = 0; var16 < field426; var16++) {
            if (field577[var16] + field511[var16] > var12 && field577[var16] < var12 + var14 && field512[var16] + field510[var16] > var13 && field510[var16] < var13 + var15) {
                field507[var16] = true;
            }
        }
    }

    @ObfuscatedName("ex.bd(IIIII)V")
    public static final void method2867(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field426; var4++) {
            if (field577[var4] + field511[var4] > arg0 && field577[var4] < arg0 + arg2 && field512[var4] + field510[var4] > arg1 && field510[var4] < arg1 + arg3) {
                field495[var4] = true;
            }
        }
    }

    @ObfuscatedName("u.bz(I)V")
    public static final void method87() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field411 - 1; var1++) {
                if (field346[var1] < 1000 && field346[var1 + 1] > 1000) {
                    String var2 = field449[var1];
                    field449[var1] = field449[var1 + 1];
                    field449[var1 + 1] = var2;
                    String var3 = field470[var1];
                    field470[var1] = field470[var1 + 1];
                    field470[var1 + 1] = var3;
                    int var4 = field346[var1];
                    field346[var1] = field346[var1 + 1];
                    field346[var1 + 1] = var4;
                    int var5 = field444[var1];
                    field444[var1] = field444[var1 + 1];
                    field444[var1 + 1] = var5;
                    int var6 = field445[var1];
                    field445[var1] = field445[var1 + 1];
                    field445[var1 + 1] = var6;
                    int var7 = field447[var1];
                    field447[var1] = field447[var1 + 1];
                    field447[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field1822 != null || field474 != null) {
            return;
        }
        int var8 = class144.field2211;
        if (field442) {
            if (var8 != 1 && (Statics.field82 || var8 != 4)) {
                int var9 = class144.field2205;
                int var10 = class144.field2207 * 900883817;
                if (var9 < Statics.field2229 - 10 || var9 > Statics.field703 + Statics.field2229 + 10 || var10 < Statics.field2102 - 10 || var10 > Statics.field3134 + Statics.field2102 + 10) {
                    field442 = false;
                    method2867(Statics.field2229, Statics.field2102, Statics.field703, Statics.field3134);
                }
            }
            if (var8 == 1 || !Statics.field82 && var8 == 4) {
                int var11 = Statics.field2229;
                int var12 = Statics.field2102;
                int var13 = Statics.field703;
                int var14 = class144.field2212;
                int var15 = class144.field2213;
                int var16 = -1;
                for (int var17 = 0; var17 < field411; var17++) {
                    int var18 = (field411 - 1 - var17) * 15 + var12 + 31;
                    if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                        var16 = var17;
                    }
                }
                if (var16 != -1) {
                    method1813(var16);
                }
                field442 = false;
                method2867(Statics.field2229, Statics.field2102, Statics.field703, Statics.field3134);
            }
            return;
        }
        if ((var8 == 1 || !Statics.field82 && var8 == 4) && field411 > 0) {
            int var19 = field346[field411 - 1];
            if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                int var20 = field444[field411 - 1];
                int var21 = field445[field411 - 1];
                class177 var22 = class177.method3198(var21);
                if (class182.method2737(method93(var22)) || class182.method2710(method93(var22))) {
                    if (Statics.field1822 != null && !field557 && field441 != 1 && !method2108(field411 - 1) && field411 > 0) {
                        method2197(field418, field393);
                    }
                    field557 = false;
                    field424 = 0;
                    if (Statics.field1822 != null) {
                        method654(Statics.field1822);
                    }
                    Statics.field1822 = class177.method3198(var21);
                    field417 = var20;
                    field418 = class144.field2212;
                    field393 = class144.field2213;
                    if (field411 > 0) {
                        method624(field411 - 1);
                    }
                    method654(Statics.field1822);
                    return;
                }
            }
        }
        if ((var8 == 1 || !Statics.field82 && var8 == 4) && (field441 == 1 && field411 > 2 || method2108(field411 - 1))) {
            var8 = 2;
        }
        if ((var8 == 1 || !Statics.field82 && var8 == 4) && field411 > 0) {
            method1813(field411 - 1);
        }
        if (var8 == 2 && field411 > 0) {
            method226(class144.field2212, class144.field2213);
        }
    }

    @ObfuscatedName("z.br(III)V")
    public static final void method226(int arg0, int arg1) {
        int var2 = Statics.field812.method3814(class161.field2555);
        for (int var3 = 0; var3 < field411; var3++) {
            class228 var4 = Statics.field812;
            String var5;
            if (field449[var3].length() > 0) {
                var5 = field470[var3] + class161.field2513 + field449[var3];
            } else {
                var5 = field470[var3];
            }
            int var6 = var4.method3814(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field411 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1268) {
            var8 = Statics.field1268 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1429) {
            var9 = Statics.field1429 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field442 = true;
        Statics.field2229 = var8;
        Statics.field2102 = var9;
        Statics.field703 = var2;
        Statics.field3134 = field411 * 15 + 22;
    }

    @ObfuscatedName("cd.be(II)Z")
    public static final boolean method2108(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field346[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cu.bf(IB)V")
    public static final void method1813(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field444[arg0];
        int var2 = field445[arg0];
        int var3 = field346[arg0];
        int var4 = field447[arg0];
        String var5 = field470[arg0];
        String var6 = field449[arg0];
        method1577(var1, var2, var3, var4, var5, var6, class144.field2212, class144.field2213);
    }

    @ObfuscatedName("ca.bt(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1577(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 23) {
            Statics.field2091.method1888(Statics.field2760, arg0, arg1);
        }
        if (arg2 == 6) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(38);
            field379.method2560(arg3 >> 14 & 0x7FFF);
            field379.method2561(Statics.field3127 + arg0);
            field379.method2526(class141.field2166[82] ? 1 : 0);
            field379.method2532(Statics.field1671 + arg1);
        }
        if (arg2 == 5) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(212);
            field379.method2532(arg3 >> 14 & 0x7FFF);
            field379.method2532(Statics.field3127 + arg0);
            field379.method2429(class141.field2166[82] ? 1 : 0);
            field379.method2561(Statics.field1671 + arg1);
        }
        if (arg2 == 8) {
            class37 var8 = field341[arg3];
            if (var8 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(101);
                field379.method2389(class141.field2166[82] ? 1 : 0);
                field379.method2437(arg3);
                field379.method2470(Statics.field66);
                field379.method2532(field457);
            }
        }
        if (arg2 == 51) {
            class3 var9 = field420[arg3];
            if (var9 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(176);
                field379.method2532(arg3);
                field379.method2526(class141.field2166[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class37 var10 = field341[arg3];
            if (var10 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(91);
                field379.method2389(class141.field2166[82] ? 1 : 0);
                field379.method2437(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var11 = field420[arg3];
            if (var11 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(172);
                field379.method2591(Statics.field66);
                field379.method2428(class141.field2166[82] ? 1 : 0);
                field379.method2437(arg3);
                field379.method2560(field457);
            }
        }
        if (arg2 == 58) {
            class177 var12 = class177.method2742(arg1, arg0);
            if (var12 != null) {
                field379.method2661(153);
                field379.method2470(Statics.field66);
                field379.method2437(field457);
                field379.method2561(field458);
                field379.method2437(arg0);
                field379.method2470(arg1);
                field379.method2532(var12.field2923);
            }
        }
        if (arg2 == 49) {
            class3 var13 = field420[arg3];
            if (var13 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(94);
                field379.method2532(arg3);
                field379.method2429(class141.field2166[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field379.method2661(214);
            field379.method2560(arg0);
            field379.method2532(arg3);
            field379.method2569(arg1);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 10) {
            class37 var14 = field341[arg3];
            if (var14 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(200);
                field379.method2560(arg3);
                field379.method2428(class141.field2166[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(84);
            field379.method2429(class141.field2166[82] ? 1 : 0);
            field379.method2532(Statics.field1671 + arg1);
            field379.method2437(Statics.field3127 + arg0);
            field379.method2437(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 31) {
            field379.method2661(88);
            field379.method2516(arg1);
            field379.method2437(arg0);
            field379.method2437(Statics.field642);
            field379.method2437(arg3);
            field379.method2591(Statics.field2198);
            field379.method2532(Statics.field97);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 16) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(68);
            field379.method2532(arg3);
            field379.method2561(Statics.field3127 + arg0);
            field379.method2437(Statics.field97);
            field379.method2569(Statics.field2198);
            field379.method2437(Statics.field642);
            field379.method2532(Statics.field1671 + arg1);
            field379.method2389(class141.field2166[82] ? 1 : 0);
        }
        if (arg2 == 11) {
            class37 var15 = field341[arg3];
            if (var15 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(140);
                field379.method2389(class141.field2166[82] ? 1 : 0);
                field379.method2532(arg3);
            }
        }
        if (arg2 == 19) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(185);
            field379.method2526(class141.field2166[82] ? 1 : 0);
            field379.method2532(arg3);
            field379.method2560(Statics.field1671 + arg1);
            field379.method2437(Statics.field3127 + arg0);
        }
        if (arg2 == 24) {
            class177 var16 = class177.method3198(arg1);
            boolean var17 = true;
            if (var16.field2936 > 0) {
                var17 = method2761(var16);
            }
            if (var17) {
                field379.method2661(25);
                field379.method2569(arg1);
            }
        }
        if (arg2 == 2) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(70);
            field379.method2560(Statics.field1671 + arg1);
            field379.method2532(arg3 >> 14 & 0x7FFF);
            field379.method2532(Statics.field3127 + arg0);
            field379.method2470(Statics.field66);
            field379.method2560(field457);
            field379.method2428(class141.field2166[82] ? 1 : 0);
        }
        if (arg2 == 7) {
            class37 var18 = field341[arg3];
            if (var18 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(209);
                field379.method2560(Statics.field642);
                field379.method2526(class141.field2166[82] ? 1 : 0);
                field379.method2532(arg3);
                field379.method2470(Statics.field2198);
                field379.method2532(Statics.field97);
            }
        }
        if (arg2 == 25) {
            class177 var19 = class177.method2742(arg1, arg0);
            if (var19 != null) {
                method2338();
                int var20 = class182.method2866(method93(var19));
                int var21 = var19.field2923;
                class177 var22 = class177.method2742(arg1, arg0);
                if (var22 != null && var22.field2894 != null) {
                    class1 var23 = new class1();
                    var23.field14 = var22;
                    var23.field9 = var22.field2894;
                    class39.method147(var23);
                }
                field458 = var21;
                field456 = true;
                Statics.field66 = arg1;
                field457 = arg0;
                Statics.field286 = var20;
                method654(var22);
                field454 = 0;
                field459 = method2721(var19);
                if (field459 == null) {
                    field459 = "Null";
                }
                if (var19.field2863) {
                    field460 = var19.field2876 + class2.method2762(16777215);
                } else {
                    field460 = class2.method2762(65280) + var19.field2919 + class2.method2762(16777215);
                }
            }
            return;
        }
        if (arg2 == 1005) {
            class177 var24 = class177.method3198(arg1);
            if (var24 == null || var24.field2874[arg0] < 100000) {
                field379.method2661(255);
                field379.method2437(arg3);
            } else {
                class12.method2280(27, "", var24.field2874[arg0] + " x " + class56.method2018(arg3).field1216);
            }
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 43) {
            field379.method2661(142);
            field379.method2561(arg3);
            field379.method2532(arg0);
            field379.method2516(arg1);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 35) {
            field379.method2661(126);
            field379.method2561(arg3);
            field379.method2470(arg1);
            field379.method2560(arg0);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 37) {
            field379.method2661(181);
            field379.method2561(arg0);
            field379.method2516(arg1);
            field379.method2437(arg3);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 45) {
            class3 var25 = field420[arg3];
            if (var25 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(82);
                field379.method2526(class141.field2166[82] ? 1 : 0);
                field379.method2560(arg3);
            }
        }
        if (arg2 == 26) {
            method183();
        }
        if (arg2 == 21) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(171);
            field379.method2560(arg3);
            field379.method2526(class141.field2166[82] ? 1 : 0);
            field379.method2561(Statics.field1671 + arg1);
            field379.method2560(Statics.field3127 + arg0);
        }
        if (arg2 == 1004) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field379.method2661(255);
            field379.method2437(arg3);
        }
        if (arg2 == 38) {
            method2338();
            class177 var26 = class177.method3198(arg1);
            field454 = 1;
            Statics.field642 = arg0;
            Statics.field2198 = arg1;
            Statics.field97 = arg3;
            method654(var26);
            field313 = class2.method2762(16748608) + class56.method2018(arg3).field1216 + class2.method2762(16777215);
            if (field313 == null) {
                field313 = "null";
            }
            return;
        }
        if (arg2 == 33) {
            field379.method2661(95);
            field379.method2532(arg0);
            field379.method2470(arg1);
            field379.method2561(arg3);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 48) {
            class3 var27 = field420[arg3];
            if (var27 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(226);
                field379.method2561(arg3);
                field379.method2429(class141.field2166[82] ? 1 : 0);
            }
        }
        if (arg2 == 47) {
            class3 var28 = field420[arg3];
            if (var28 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(92);
                field379.method2560(arg3);
                field379.method2429(class141.field2166[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(108);
            field379.method2560(Statics.field1671 + arg1);
            field379.method2437(Statics.field3127 + arg0);
            field379.method2429(class141.field2166[82] ? 1 : 0);
            field379.method2532(arg3);
        }
        if (arg2 == 1) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(236);
            field379.method2516(Statics.field2198);
            field379.method2532(Statics.field1671 + arg1);
            field379.method2560(arg3 >> 14 & 0x7FFF);
            field379.method2561(Statics.field642);
            field379.method2532(Statics.field97);
            field379.method2561(Statics.field3127 + arg0);
            field379.method2429(class141.field2166[82] ? 1 : 0);
        }
        if (arg2 == 28) {
            field379.method2661(25);
            field379.method2569(arg1);
            class177 var29 = class177.method3198(arg1);
            if (var29.field2865 != null && var29.field2865[0][0] == 5) {
                int var30 = var29.field2865[0][1];
                class180.field2955[var30] = 1 - class180.field2955[var30];
                method2835(var30);
            }
        }
        if (arg2 == 42) {
            field379.method2661(143);
            field379.method2560(arg0);
            field379.method2569(arg1);
            field379.method2437(arg3);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 9) {
            class37 var31 = field341[arg3];
            if (var31 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(128);
                field379.method2526(class141.field2166[82] ? 1 : 0);
                field379.method2560(arg3);
            }
        }
        if (arg2 == 20) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(100);
            field379.method2429(class141.field2166[82] ? 1 : 0);
            field379.method2561(arg3);
            field379.method2560(Statics.field3127 + arg0);
            field379.method2560(Statics.field1671 + arg1);
        }
        if (arg2 == 44) {
            class3 var32 = field420[arg3];
            if (var32 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(58);
                field379.method2561(arg3);
                field379.method2526(class141.field2166[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class177 var33 = class177.method2742(arg1, arg0);
            if (var33 != null) {
                int var34 = var33.field2923;
                class177 var35 = class177.method2742(arg1, arg0);
                if (var35 != null) {
                    if (var35.field2903 != null) {
                        class1 var36 = new class1();
                        var36.field14 = var35;
                        var36.field10 = arg3;
                        var36.field1 = arg5;
                        var36.field9 = var35.field2903;
                        class39.method147(var36);
                    }
                    boolean var37 = true;
                    if (var35.field2936 > 0) {
                        var37 = method2761(var35);
                    }
                    if (var37) {
                        int var38 = method93(var35);
                        int var39 = arg3 - 1;
                        boolean var40 = (var38 >> var39 + 1 & 0x1) != 0;
                        if (var40) {
                            if (arg3 == 1) {
                                field379.method2661(164);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                            if (arg3 == 2) {
                                field379.method2661(231);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                            if (arg3 == 3) {
                                field379.method2661(207);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                            if (arg3 == 4) {
                                field379.method2661(225);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                            if (arg3 == 5) {
                                field379.method2661(78);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                            if (arg3 == 6) {
                                field379.method2661(134);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                            if (arg3 == 7) {
                                field379.method2661(61);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                            if (arg3 == 8) {
                                field379.method2661(241);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                            if (arg3 == 9) {
                                field379.method2661(30);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                            if (arg3 == 10) {
                                field379.method2661(131);
                                field379.method2569(arg1);
                                field379.method2561(arg0);
                                field379.method2561(var34);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 41) {
            field379.method2661(115);
            field379.method2561(arg3);
            field379.method2532(arg0);
            field379.method2591(arg1);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 17) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(102);
            field379.method2561(field457);
            field379.method2561(Statics.field1671 + arg1);
            field379.method2437(Statics.field3127 + arg0);
            field379.method2591(Statics.field66);
            field379.method2437(arg3);
            field379.method2428(class141.field2166[82] ? 1 : 0);
        }
        if (arg2 == 1003) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            class37 var41 = field341[arg3];
            if (var41 != null) {
                class42 var42 = var41.field803;
                if (var42.field939 != null) {
                    var42 = var42.method779();
                }
                if (var42 != null) {
                    field379.method2661(244);
                    field379.method2560(var42.field909);
                }
            }
        }
        if (arg2 == 4) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(80);
            field379.method2560(arg3 >> 14 & 0x7FFF);
            field379.method2437(Statics.field1671 + arg1);
            field379.method2532(Statics.field3127 + arg0);
            field379.method2526(class141.field2166[82] ? 1 : 0);
        }
        if (arg2 == 30 && field465 == null) {
            Statics.method2968(arg1, arg0);
            field465 = class177.method2742(arg1, arg0);
            method654(field465);
        }
        if (arg2 == 32) {
            field379.method2661(29);
            field379.method2561(arg3);
            field379.method2569(arg1);
            field379.method2437(arg0);
            field379.method2560(field457);
            field379.method2591(Statics.field66);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 29) {
            field379.method2661(25);
            field379.method2569(arg1);
            class177 var43 = class177.method3198(arg1);
            if (var43.field2865 != null && var43.field2865[0][0] == 5) {
                int var44 = var43.field2865[0][1];
                if (class180.field2955[var44] != var43.field2917[0]) {
                    class180.field2955[var44] = var43.field2917[0];
                    method2835(var44);
                }
            }
        }
        if (arg2 == 50) {
            class3 var45 = field420[arg3];
            if (var45 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(127);
                field379.method2389(class141.field2166[82] ? 1 : 0);
                field379.method2532(arg3);
            }
        }
        if (arg2 == 46) {
            class3 var46 = field420[arg3];
            if (var46 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(26);
                field379.method2560(arg3);
                field379.method2526(class141.field2166[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field379.method2661(103);
            field379.method2437(arg3);
            field379.method2437(arg0);
            field379.method2569(arg1);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 40) {
            field379.method2661(132);
            field379.method2591(arg1);
            field379.method2437(arg0);
            field379.method2437(arg3);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 39) {
            field379.method2661(0);
            field379.method2532(arg0);
            field379.method2470(arg1);
            field379.method2561(arg3);
            field415 = 0;
            Statics.field896 = class177.method3198(arg1);
            field416 = arg0;
        }
        if (arg2 == 1002) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field379.method2661(144);
            field379.method2561(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 12) {
            class37 var47 = field341[arg3];
            if (var47 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(20);
                field379.method2429(class141.field2166[82] ? 1 : 0);
                field379.method2560(arg3);
            }
        }
        if (arg2 == 18) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(86);
            field379.method2561(Statics.field1671 + arg1);
            field379.method2561(arg3);
            field379.method2428(class141.field2166[82] ? 1 : 0);
            field379.method2560(Statics.field3127 + arg0);
        }
        if (arg2 == 3) {
            field500 = arg6;
            field412 = arg7;
            field414 = 2;
            field413 = 0;
            field535 = arg0;
            field435 = arg1;
            field379.method2661(149);
            field379.method2561(Statics.field1671 + arg1);
            field379.method2429(class141.field2166[82] ? 1 : 0);
            field379.method2560(arg3 >> 14 & 0x7FFF);
            field379.method2437(Statics.field3127 + arg0);
        }
        if (arg2 == 14) {
            class3 var48 = field420[arg3];
            if (var48 != null) {
                field500 = arg6;
                field412 = arg7;
                field414 = 2;
                field413 = 0;
                field535 = arg0;
                field435 = arg1;
                field379.method2661(42);
                field379.method2428(class141.field2166[82] ? 1 : 0);
                field379.method2569(Statics.field2198);
                field379.method2532(Statics.field97);
                field379.method2437(Statics.field642);
                field379.method2561(arg3);
            }
        }
        if (field454 != 0) {
            field454 = 0;
            method654(class177.method3198(Statics.field2198));
        }
        if (field456) {
            method2338();
        }
        if (Statics.field896 != null && field415 == 0) {
            method654(Statics.field896);
        }
    }

    @ObfuscatedName("df.bw(I)V")
    public static void method2338() {
        if (!field456) {
            return;
        }
        class177 var0 = class177.method2742(Statics.field66, field457);
        if (var0 != null && var0.field2911 != null) {
            class1 var1 = new class1();
            var1.field14 = var0;
            var1.field9 = var0.field2911;
            class39.method147(var1);
        }
        field456 = false;
        method654(var0);
    }

    @ObfuscatedName("ed.bm(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2714(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field442 || field411 >= 500) {
            return;
        }
        field470[field411] = arg0;
        field449[field411] = arg1;
        field346[field411] = arg2;
        field447[field411] = arg3;
        field444[field411] = arg4;
        field445[field411] = arg5;
        field411++;
    }

    @ObfuscatedName("ap.bk(I)V")
    public static void method861() {
        for (int var0 = 0; var0 < field411; var0++) {
            if (method2340(field346[var0])) {
                if (var0 < field411 - 1) {
                    for (int var1 = var0; var1 < field411 - 1; var1++) {
                        field470[var1] = field470[var1 + 1];
                        field449[var1] = field449[var1 + 1];
                        field346[var1] = field346[var1 + 1];
                        field447[var1] = field447[var1 + 1];
                        field444[var1] = field444[var1 + 1];
                        field445[var1] = field445[var1 + 1];
                    }
                }
                field411--;
            }
        }
    }

    @ObfuscatedName("dx.bh(IB)Z")
    public static boolean method2340(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("j.bg(Lac;IIII)V")
    public static final void method122(class42 arg0, int arg1, int arg2, int arg3) {
        if (field411 >= 400) {
            return;
        }
        if (arg0.field939 != null) {
            arg0 = arg0.method779();
        }
        if (arg0 == null || !arg0.field938 || arg0.field928 && field567 != arg1) {
            return;
        }
        String var4 = arg0.field910;
        if (arg0.field927 != 0) {
            var4 = var4 + method161(arg0.field927, Statics.field2137.field38) + " " + class2.field22 + class161.field2509 + arg0.field927 + class2.field19;
        }
        if (field454 == 1) {
            method2714(class161.field2503, field313 + " " + class2.field24 + " " + class2.method2762(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field456) {
            String[] var5 = arg0.field925;
            if (field472) {
                var5 = method184(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class161.field2505)) {
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
                        method2714(var5[var6], class2.method2762(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class161.field2505)) {
                        short var9 = 0;
                        if (field328 != class22.field608) {
                            if (field328 == class22.field602 || field328 == class22.field607 && arg0.field927 > Statics.field2137.field38) {
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
                            method2714(var5[var8], class2.method2762(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2714(class161.field2504, class2.method2762(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field286 & 0x2) == 2) {
            method2714(field459, field460 + " " + class2.field24 + " " + class2.method2762(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("e.bl(Le;IIII)V")
    public static final void method18(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2137 == arg0 || field411 >= 400) {
            return;
        }
        String var4;
        if (arg0.field39 == 0) {
            var4 = arg0.field44[0] + arg0.field37 + arg0.field44[1] + method161(arg0.field38, Statics.field2137.field38) + " " + class2.field22 + class161.field2509 + arg0.field38 + class2.field19 + arg0.field44[2];
        } else {
            var4 = arg0.field44[0] + arg0.field37 + arg0.field44[1] + " " + class2.field22 + class161.field2510 + arg0.field39 + class2.field19 + arg0.field44[2];
        }
        if (field454 == 1) {
            method2714(class161.field2503, field313 + " " + class2.field24 + " " + class2.method2762(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field456) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field430[var5] != null) {
                    short var6 = 0;
                    if (field430[var5].equalsIgnoreCase(class161.field2505)) {
                        if (field327 == class22.field608) {
                            continue;
                        }
                        if (field327 == class22.field602 || field327 == class22.field607 && arg0.field38 > Statics.field2137.field38) {
                            var6 = 2000;
                        }
                        if (Statics.field2137.field53 != 0 && arg0.field53 != 0) {
                            if (Statics.field2137.field53 == arg0.field53) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field431[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field429[var5] + var6;
                    method2714(field430[var5], class2.method2762(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field286 & 0x8) == 8) {
            method2714(field459, field460 + " " + class2.field24 + " " + class2.method2762(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field411; var9++) {
            if (field346[var9] == 23) {
                field449[var9] = class2.method2762(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("r.ca(III)Ljava/lang/String;")
    public static final String method161(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2762(16711680);
        } else if (var2 < -6) {
            return class2.method2762(16723968);
        } else if (var2 < -3) {
            return class2.method2762(16740352);
        } else if (var2 < 0) {
            return class2.method2762(16756736);
        } else if (var2 > 9) {
            return class2.method2762(65280);
        } else if (var2 > 6) {
            return class2.method2762(4259584);
        } else if (var2 > 3) {
            return class2.method2762(8453888);
        } else if (var2 > 0) {
            return class2.method2762(12648192);
        } else {
            return class2.method2762(16776960);
        }
    }

    @ObfuscatedName("ht.cj(IIIIIIIII)V")
    public static final void method3808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class177.method163(arg0)) {
            Statics.field2089 = null;
            method155(Statics.field2824[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2089 != null) {
                method155(Statics.field2089, -1412584499, arg1, arg2, arg3, arg4, Statics.field3264, Statics.field2336, arg7);
                Statics.field2089 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field495[var8] = true;
            }
        } else {
            field495[arg7] = true;
        }
    }

    @ObfuscatedName("v.ci([Lfe;IIIIIIIII)V")
    public static final void method155(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83.method1733(arg2, arg3, arg4, arg5);
        class95.method2035();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class177 var10 = arg0[var9];
            if (var10 != null && (var10.field2822 == arg1 || arg1 == -1412584499 && field474 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field577[field426] = var10.field2816 + arg6;
                    field510[field426] = var10.field2817 + arg7;
                    field511[field426] = var10.field2906;
                    field512[field426] = var10.field2819;
                    var11 = ++field426 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2934 = var11;
                var10.field2901 = field333;
                if (!var10.field2863 || !method1827(var10)) {
                    if (var10.field2936 > 0) {
                        int var12 = var10.field2936;
                        if (var12 == 324) {
                            if (field574 == -1) {
                                field574 = var10.field2853;
                                field564 = var10.field2827;
                            }
                            if (field575.field2974) {
                                var10.field2853 = field574;
                            } else {
                                var10.field2853 = field564;
                            }
                        } else if (var12 == 325) {
                            if (field574 == -1) {
                                field574 = var10.field2853;
                                field564 = var10.field2827;
                            }
                            if (field575.field2974) {
                                var10.field2853 = field564;
                            } else {
                                var10.field2853 = field574;
                            }
                        } else if (var12 == 327) {
                            var10.field2880 = 150;
                            var10.field2907 = (int) (Math.sin((double) field333 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2846 = 5;
                            var10.field2847 = 0;
                        } else if (var12 == 328) {
                            var10.field2880 = 150;
                            var10.field2907 = (int) (Math.sin((double) field333 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2846 = 5;
                            var10.field2847 = 1;
                        }
                    }
                    int var13 = var10.field2816 + arg6;
                    int var14 = var10.field2817 + arg7;
                    int var15 = var10.field2834;
                    if (field474 == var10) {
                        if (arg1 != -1412584499 && !var10.field2881) {
                            Statics.field2089 = arg0;
                            Statics.field3264 = arg6;
                            Statics.field2336 = arg7;
                            continue;
                        }
                        if (field485 && field479) {
                            int var16 = class144.field2205;
                            int var17 = class144.field2207 * 900883817;
                            int var18 = var16 - field476;
                            int var19 = var17 - field513;
                            if (var18 < field480) {
                                var18 = field480;
                            }
                            if (var10.field2906 + var18 > field480 + field475.field2906) {
                                var18 = field480 + field475.field2906 - var10.field2906;
                            }
                            if (var19 < field325) {
                                var19 = field325;
                            }
                            if (var10.field2819 + var19 > field325 + field475.field2819) {
                                var19 = field325 + field475.field2819 - var10.field2819;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2881) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2805 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2805 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2906 + var13;
                        int var27 = var10.field2819 + var14;
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
                        int var30 = var10.field2906 + var13;
                        int var31 = var10.field2819 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2863 || var20 < var22 && var21 < var23) {
                        if (var10.field2936 != 0) {
                            if (var10.field2936 == 1336) {
                                if (field317) {
                                    var14 += 15;
                                    Statics.field2124.method3821("Fps:" + field2249, var10.field2906 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field305) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field305) {
                                        var34 = 16711680;
                                    }
                                    Statics.field2124.method3821("Mem:" + var33 + "k", var10.field2906 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2936 == 1337) {
                                field450 = var13;
                                field496 = var14;
                                int var37 = var10.field2906;
                                int var38 = var10.field2819;
                                field408++;
                                method3293(class36.field800);
                                boolean var39 = false;
                                if (field433 >= 0) {
                                    int var40 = class35.field780;
                                    int[] var41 = class35.field787;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field433 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method3293(class36.field797);
                                }
                                method57(true);
                                method3293(var39 ? class36.field794 : class36.field799);
                                method57(false);
                                for (class7 var43 = (class7) field436.method3597(); var43 != null; var43 = (class7) field436.method3599()) {
                                    if (Statics.field2760 != var43.field139 || field333 > var43.field119) {
                                        var43.method3706();
                                    } else if (field333 >= var43.field118) {
                                        if (var43.field122 > 0) {
                                            class37 var44 = field341[var43.field122 - 1];
                                            if (var44 != null && var44.field879 >= 0 && var44.field879 < 13312 && var44.field837 >= 0 && var44.field837 < 13312) {
                                                var43.method94(var44.field879, var44.field837, method182(var44.field879, var44.field837, var43.field139) - var43.field132, field333);
                                            }
                                        }
                                        if (var43.field122 < 0) {
                                            int var45 = -var43.field122 - 1;
                                            class3 var46;
                                            if (field425 == var45) {
                                                var46 = Statics.field2137;
                                            } else {
                                                var46 = field420[var45];
                                            }
                                            if (var46 != null && var46.field879 >= 0 && var46.field879 < 13312 && var46.field837 >= 0 && var46.field837 < 13312) {
                                                var43.method94(var46.field879, var46.field837, method182(var46.field879, var46.field837, var43.field139) - var43.field132, field333);
                                            }
                                        }
                                        var43.method91(field421);
                                        Statics.field2091.method1845(Statics.field2760, (int) var43.field124, (int) var43.field117, (int) var43.field126, 60, var43, var43.field136, -1, false);
                                    }
                                }
                                for (class32 var47 = (class32) field437.method3597(); var47 != null; var47 = (class32) field437.method3599()) {
                                    if (Statics.field2760 != var47.field717 || var47.field716) {
                                        var47.method3706();
                                    } else if (field333 >= var47.field731) {
                                        var47.method649(field421);
                                        if (var47.field716) {
                                            var47.method3706();
                                        } else {
                                            Statics.field2091.method1845(var47.field717, var47.field718, var47.field724, var47.field720, 60, var47, 0, -1, false);
                                        }
                                    }
                                }
                                Statics.method2985(var13, var14, var37, var38, true);
                                int var48 = field338;
                                int var49 = field565;
                                int var50 = field538;
                                int var51 = field525;
                                class83.method1733(var48, var49, var48 + var50, var49 + var51);
                                class95.method2035();
                                if (!field549) {
                                    int var52 = field387;
                                    if (field396 / 256 > var52) {
                                        var52 = field396 / 256;
                                    }
                                    if (field521[4] && field553[4] + 128 > var52) {
                                        var52 = field553[4] + 128;
                                    }
                                    int var53 = field499 + field388 & 0x7FF;
                                    int var54 = Statics.field176;
                                    int var55 = method182(Statics.field2137.field879, Statics.field2137.field837, Statics.field2760) - field580;
                                    int var56 = Statics.field2343;
                                    int var57 = var52 * 3 + 600;
                                    int var58 = 2048 - var52 & 0x7FF;
                                    int var59 = 2048 - var53 & 0x7FF;
                                    int var60 = 0;
                                    int var61 = 0;
                                    int var62 = var57;
                                    if (var58 != 0) {
                                        int var63 = class95.field1624[var58];
                                        int var64 = class95.field1643[var58];
                                        int var65 = var61 * var64 - var57 * var63 >> 16;
                                        var62 = var61 * var63 + var57 * var64 >> 16;
                                        var61 = var65;
                                    }
                                    if (var59 != 0) {
                                        int var66 = class95.field1624[var59];
                                        int var67 = class95.field1643[var59];
                                        int var68 = var60 * var67 + var62 * var66 >> 16;
                                        var62 = var62 * var67 - var60 * var66 >> 16;
                                        var60 = var68;
                                    }
                                    Statics.field708 = var54 - var60;
                                    Statics.field698 = var55 - var61;
                                    Statics.field796 = var56 - var62;
                                    Statics.field612 = var52;
                                    Statics.field2709 = var53;
                                }
                                int var81;
                                if (field549) {
                                    int var82;
                                    if (Statics.field43.field155) {
                                        var82 = Statics.field2760;
                                    } else {
                                        int var83 = method182(Statics.field708, Statics.field796, Statics.field2760);
                                        if (var83 - Statics.field698 >= 800 || (class6.field86[Statics.field2760][Statics.field708 >> 7][Statics.field796 >> 7] & 0x4) == 0) {
                                            var82 = 3;
                                        } else {
                                            var82 = Statics.field2760;
                                        }
                                    }
                                    var81 = var82;
                                } else {
                                    int var69;
                                    if (Statics.field43.field155) {
                                        var69 = Statics.field2760;
                                    } else {
                                        label1320: {
                                            int var70 = 3;
                                            if (Statics.field612 < 310) {
                                                int var71 = Statics.field708 >> 7;
                                                int var72 = Statics.field796 >> 7;
                                                int var73 = Statics.field2137.field879 >> 7;
                                                int var74 = Statics.field2137.field837 >> 7;
                                                if (var71 < 0 || var72 < 0 || var71 >= 104 || var72 >= 104) {
                                                    var69 = Statics.field2760;
                                                    break label1320;
                                                }
                                                if ((class6.field86[Statics.field2760][var71][var72] & 0x4) != 0) {
                                                    var70 = Statics.field2760;
                                                }
                                                int var75;
                                                if (var73 > var71) {
                                                    var75 = var73 - var71;
                                                } else {
                                                    var75 = var71 - var73;
                                                }
                                                int var76;
                                                if (var74 > var72) {
                                                    var76 = var74 - var72;
                                                } else {
                                                    var76 = var72 - var74;
                                                }
                                                if (var75 > var76) {
                                                    int var77 = var76 * 65536 / var75;
                                                    int var78 = 32768;
                                                    while (var71 != var73) {
                                                        if (var71 < var73) {
                                                            var71++;
                                                        } else if (var71 > var73) {
                                                            var71--;
                                                        }
                                                        if ((class6.field86[Statics.field2760][var71][var72] & 0x4) != 0) {
                                                            var70 = Statics.field2760;
                                                        }
                                                        var78 += var77;
                                                        if (var78 >= 65536) {
                                                            var78 -= 65536;
                                                            if (var72 < var74) {
                                                                var72++;
                                                            } else if (var72 > var74) {
                                                                var72--;
                                                            }
                                                            if ((class6.field86[Statics.field2760][var71][var72] & 0x4) != 0) {
                                                                var70 = Statics.field2760;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var79 = var75 * 65536 / var76;
                                                    int var80 = 32768;
                                                    while (var72 != var74) {
                                                        if (var72 < var74) {
                                                            var72++;
                                                        } else if (var72 > var74) {
                                                            var72--;
                                                        }
                                                        if ((class6.field86[Statics.field2760][var71][var72] & 0x4) != 0) {
                                                            var70 = Statics.field2760;
                                                        }
                                                        var80 += var79;
                                                        if (var80 >= 65536) {
                                                            var80 -= 65536;
                                                            if (var71 < var73) {
                                                                var71++;
                                                            } else if (var71 > var73) {
                                                                var71--;
                                                            }
                                                            if ((class6.field86[Statics.field2760][var71][var72] & 0x4) != 0) {
                                                                var70 = Statics.field2760;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field2137.field879 >= 0 && Statics.field2137.field837 >= 0 && Statics.field2137.field879 < 13312 && Statics.field2137.field837 < 13312) {
                                                if ((class6.field86[Statics.field2760][Statics.field2137.field879 >> 7][Statics.field2137.field837 >> 7] & 0x4) != 0) {
                                                    var70 = Statics.field2760;
                                                }
                                                var69 = var70;
                                            } else {
                                                var69 = Statics.field2760;
                                            }
                                        }
                                    }
                                    var81 = var69;
                                }
                                int var84 = Statics.field708;
                                int var85 = Statics.field698;
                                int var86 = Statics.field796;
                                int var87 = Statics.field612;
                                int var88 = Statics.field2709;
                                for (int var89 = 0; var89 < 5; var89++) {
                                    if (field521[var89]) {
                                        int var90 = (int) (Math.random() * (double) (field552[var89] * 2 + 1) - (double) field552[var89] + Math.sin((double) field554[var89] / 100.0D * (double) field505[var89]) * (double) field553[var89]);
                                        if (var89 == 0) {
                                            Statics.field708 += var90;
                                        }
                                        if (var89 == 1) {
                                            Statics.field698 += var90;
                                        }
                                        if (var89 == 2) {
                                            Statics.field796 += var90;
                                        }
                                        if (var89 == 3) {
                                            Statics.field2709 = Statics.field2709 + var90 & 0x7FF;
                                        }
                                        if (var89 == 4) {
                                            Statics.field612 += var90;
                                            if (Statics.field612 < 128) {
                                                Statics.field612 = 128;
                                            }
                                            if (Statics.field612 > 383) {
                                                Statics.field612 = 383;
                                            }
                                        }
                                    }
                                }
                                int var91 = class144.field2205;
                                int var92 = class144.field2207 * 900883817;
                                if (class144.field2211 != 0) {
                                    var91 = class144.field2212;
                                    var92 = class144.field2213;
                                }
                                if (var91 >= var48 && var91 < var48 + var50 && var92 >= var49 && var92 < var49 + var51) {
                                    class109.field1856 = true;
                                    class109.field1869 = 0;
                                    class109.field1912 = var91 - var48;
                                    class109.field1865 = var92 - var49;
                                } else {
                                    class109.field1856 = false;
                                    class109.field1869 = 0;
                                }
                                method3709();
                                class83.method1755(var48, var49, var50, var51, 0);
                                method3709();
                                int var93 = class95.field1629;
                                class95.field1629 = field568;
                                Statics.field2091.method1949(Statics.field708, Statics.field698, Statics.field796, Statics.field612, Statics.field2709, var81);
                                class95.field1629 = var93;
                                method3709();
                                Statics.field2091.method1943();
                                method21(var48, var49, var50, var51);
                                method98(var48, var49);
                                ((class99) Statics.field1639).method2097(field421);
                                method3326(var48, var49, var50, var51);
                                Statics.field708 = var84;
                                Statics.field698 = var85;
                                Statics.field796 = var86;
                                Statics.field612 = var87;
                                Statics.field2709 = var88;
                                if (field440 && class175.method2198(true, false) == 0) {
                                    field440 = false;
                                }
                                if (field440) {
                                    class83.method1755(var48, var49, var50, var51, 0);
                                    method3020(class161.field2517, false);
                                }
                                field495[var10.field2934] = true;
                                class83.method1733(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2936 == 1338) {
                                method3709();
                                class179 var94 = var10.method3248(false);
                                if (var94 != null) {
                                    class83.method1733(var13, var14, var94.field2949 + var13, var94.field2948 + var14);
                                    if (field404 == 2 || field404 == 5) {
                                        class83.method1752(var13, var14, 0, var94.field2952, var94.field2947);
                                    } else {
                                        int var95 = field482 + field388 & 0x7FF;
                                        int var96 = Statics.field2137.field879 / 32 + 48;
                                        int var97 = 464 - Statics.field2137.field837 / 32;
                                        Statics.field2954.method1663(var13, var14, var94.field2949, var94.field2948, var96, var97, var95, field376 + 256, var94.field2952, var94.field2947);
                                        for (int var98 = 0; var98 < field310; var98++) {
                                            int var99 = field509[var98] * 4 + 2 - Statics.field2137.field879 / 32;
                                            int var100 = field533[var98] * 4 + 2 - Statics.field2137.field837 / 32;
                                            method188(var13, var14, var99, var100, field534[var98], var94);
                                        }
                                        int var101 = 0;
                                        while (true) {
                                            if (var101 >= 104) {
                                                for (int var106 = 0; var106 < field342; var106++) {
                                                    class37 var107 = field341[field343[var106]];
                                                    if (var107 != null && var107.method22()) {
                                                        class42 var108 = var107.field803;
                                                        if (var108 != null && var108.field939 != null) {
                                                            var108 = var108.method779();
                                                        }
                                                        if (var108 != null && var108.field926 && var108.field938) {
                                                            int var109 = var107.field879 / 32 - Statics.field2137.field879 / 32;
                                                            int var110 = var107.field837 / 32 - Statics.field2137.field837 / 32;
                                                            method188(var13, var14, var109, var110, Statics.field1589[1], var94);
                                                        }
                                                    }
                                                }
                                                int var111 = class35.field780;
                                                int[] var112 = class35.field787;
                                                for (int var113 = 0; var113 < var111; var113++) {
                                                    class3 var114 = field420[var112[var113]];
                                                    if (var114 != null && var114.method22() && !var114.field46 && Statics.field2137 != var114) {
                                                        int var115 = var114.field879 / 32 - Statics.field2137.field879 / 32;
                                                        int var116 = var114.field837 / 32 - Statics.field2137.field837 / 32;
                                                        boolean var117 = false;
                                                        if (method1(var114.field37, true)) {
                                                            var117 = true;
                                                        }
                                                        boolean var118 = false;
                                                        for (int var119 = 0; var119 < Statics.field897; var119++) {
                                                            if (var114.field37.equals(Statics.field2233[var119].field646)) {
                                                                var118 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var120 = false;
                                                        if (Statics.field2137.field53 != 0 && var114.field53 != 0 && Statics.field2137.field53 == var114.field53) {
                                                            var120 = true;
                                                        }
                                                        if (var117) {
                                                            method188(var13, var14, var115, var116, Statics.field1589[3], var94);
                                                        } else if (var120) {
                                                            method188(var13, var14, var115, var116, Statics.field1589[4], var94);
                                                        } else if (var118) {
                                                            method188(var13, var14, var115, var116, Statics.field1589[5], var94);
                                                        } else {
                                                            method188(var13, var14, var115, var116, Statics.field1589[2], var94);
                                                        }
                                                    }
                                                }
                                                if (field307 != 0 && field333 % 20 < 10) {
                                                    if (field307 == 1 && field320 >= 0 && field320 < field341.length) {
                                                        class37 var121 = field341[field320];
                                                        if (var121 != null) {
                                                            int var122 = var121.field879 / 32 - Statics.field2137.field879 / 32;
                                                            int var123 = var121.field837 / 32 - Statics.field2137.field837 / 32;
                                                            method655(var13, var14, var122, var123, Statics.field67[1], var94);
                                                        }
                                                    }
                                                    if (field307 == 2) {
                                                        int var124 = field322 * 4 - Statics.field3127 * 4 + 2 - Statics.field2137.field879 / 32;
                                                        int var125 = field530 * 4 - Statics.field1671 * 4 + 2 - Statics.field2137.field837 / 32;
                                                        method655(var13, var14, var124, var125, Statics.field67[1], var94);
                                                    }
                                                    if (field307 == 10 && field321 >= 0 && field321 < field420.length) {
                                                        class3 var126 = field420[field321];
                                                        if (var126 != null) {
                                                            int var127 = var126.field879 / 32 - Statics.field2137.field879 / 32;
                                                            int var128 = var126.field837 / 32 - Statics.field2137.field837 / 32;
                                                            method655(var13, var14, var127, var128, Statics.field67[1], var94);
                                                        }
                                                    }
                                                }
                                                if (field535 != 0) {
                                                    int var129 = field535 * 4 + 2 - Statics.field2137.field879 / 32;
                                                    int var130 = field435 * 4 + 2 - Statics.field2137.field837 / 32;
                                                    method188(var13, var14, var129, var130, Statics.field67[0], var94);
                                                }
                                                if (!Statics.field2137.field46) {
                                                    class83.method1755(var94.field2949 / 2 + var13 - 1, var94.field2948 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var102 = 0; var102 < 104; var102++) {
                                                class203 var103 = field434[Statics.field2760][var101][var102];
                                                if (var103 != null) {
                                                    int var104 = var101 * 4 + 2 - Statics.field2137.field879 / 32;
                                                    int var105 = var102 * 4 + 2 - Statics.field2137.field837 / 32;
                                                    method188(var13, var14, var104, var105, Statics.field1589[0], var94);
                                                }
                                            }
                                            var101++;
                                        }
                                    }
                                    field507[var11] = true;
                                }
                                class83.method1733(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2936 == 1339) {
                                class179 var131 = var10.method3248(false);
                                if (var131 != null) {
                                    if (field404 < 3) {
                                        Statics.field1108.method1663(var13, var14, var131.field2949, var131.field2948, 25, 25, field388, 256, var131.field2952, var131.field2947);
                                    } else {
                                        class83.method1752(var13, var14, 0, var131.field2952, var131.field2947);
                                    }
                                }
                                class83.method1733(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2805 == 0) {
                            if (!var10.field2863 && method1827(var10) && Statics.field1154 != var10) {
                                continue;
                            }
                            if (!var10.field2863) {
                                if (var10.field2825 > var10.field2915 - var10.field2819) {
                                    var10.field2825 = var10.field2915 - var10.field2819;
                                }
                                if (var10.field2825 < 0) {
                                    var10.field2825 = 0;
                                }
                            }
                            method155(arg0, var10.field2803, var20, var21, var22, var23, var13 - var10.field2858, var14 - var10.field2825, var11);
                            if (var10.field2830 != null) {
                                method155(var10.field2830, var10.field2803, var20, var21, var22, var23, var13 - var10.field2858, var14 - var10.field2825, var11);
                            }
                            class4 var132 = (class4) field462.method3564((long) var10.field2803);
                            if (var132 != null) {
                                method3808(var132.field63, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class83.method1733(arg2, arg3, arg4, arg5);
                            class95.method2035();
                        }
                        if (field329 || field508[var11] || field403 > 1) {
                            if (var10.field2805 == 0 && !var10.field2863 && var10.field2915 > var10.field2819) {
                                method13(var10.field2906 + var13, var14, var10.field2825, var10.field2819, var10.field2915);
                            }
                            if (var10.field2805 != 1) {
                                if (var10.field2805 == 2) {
                                    int var133 = 0;
                                    for (int var134 = 0; var134 < var10.field2815; var134++) {
                                        for (int var135 = 0; var135 < var10.field2814; var135++) {
                                            int var136 = (var10.field2869 + 32) * var135 + var13;
                                            int var137 = (var10.field2870 + 32) * var134 + var14;
                                            if (var133 < 20) {
                                                var136 += var10.field2837[var133];
                                                var137 += var10.field2872[var133];
                                            }
                                            if (var10.field2910[var133] > 0) {
                                                boolean var138 = false;
                                                boolean var139 = false;
                                                int var140 = var10.field2910[var133] - 1;
                                                if (var136 + 32 > arg2 && var136 < arg4 && var137 + 32 > arg3 && var137 < arg5 || Statics.field1822 == var10 && field417 == var133) {
                                                    class82 var141;
                                                    if (field454 == 1 && Statics.field642 == var133 && Statics.field2198 == var10.field2803) {
                                                        var141 = class56.method3348(var140, var10.field2874[var133], 2, 0, 2, false);
                                                    } else {
                                                        var141 = class56.method3348(var140, var10.field2874[var133], 1, 3153952, 2, false);
                                                    }
                                                    if (var141 == null) {
                                                        method654(var10);
                                                    } else if (Statics.field1822 == var10 && field417 == var133) {
                                                        int var142 = class144.field2205 - field418;
                                                        int var143 = class144.field2207 * 900883817 - field393;
                                                        if (var142 < 5 && var142 > -5) {
                                                            var142 = 0;
                                                        }
                                                        if (var143 < 5 && var143 > -5) {
                                                            var143 = 0;
                                                        }
                                                        if (field424 < 5) {
                                                            var142 = 0;
                                                            var143 = 0;
                                                        }
                                                        var141.method1658(var136 + var142, var137 + var143, 128);
                                                        if (arg1 != -1) {
                                                            class177 var144 = arg0[arg1 & 0xFFFF];
                                                            if (var137 + var143 < class83.field1467 && var144.field2825 > 0) {
                                                                int var145 = field421 * (class83.field1467 - var137 - var143) / 3;
                                                                if (var145 > field421 * 10) {
                                                                    var145 = field421 * 10;
                                                                }
                                                                if (var145 > var144.field2825) {
                                                                    var145 = var144.field2825;
                                                                }
                                                                var144.field2825 -= var145;
                                                                field393 += var145;
                                                                method654(var144);
                                                            }
                                                            if (var137 + var143 + 32 > class83.field1470 && var144.field2825 < var144.field2915 - var144.field2819) {
                                                                int var146 = field421 * (var137 + var143 + 32 - class83.field1470) / 3;
                                                                if (var146 > field421 * 10) {
                                                                    var146 = field421 * 10;
                                                                }
                                                                if (var146 > var144.field2915 - var144.field2819 - var144.field2825) {
                                                                    var146 = var144.field2915 - var144.field2819 - var144.field2825;
                                                                }
                                                                var144.field2825 += var146;
                                                                field393 -= var146;
                                                                method654(var144);
                                                            }
                                                        }
                                                    } else if (Statics.field896 == var10 && field416 == var133) {
                                                        var141.method1658(var136, var137, 128);
                                                    } else {
                                                        var141.method1712(var136, var137);
                                                    }
                                                }
                                            } else if (var10.field2873 != null && var133 < 20) {
                                                class82 var147 = var10.method3216(var133);
                                                if (var147 != null) {
                                                    var147.method1712(var136, var137);
                                                } else if (class177.field2801) {
                                                    method654(var10);
                                                }
                                            }
                                            var133++;
                                        }
                                    }
                                } else if (var10.field2805 == 3) {
                                    int var148;
                                    if (method3187(var10)) {
                                        var148 = var10.field2802;
                                        if (Statics.field1154 == var10 && var10.field2831 != 0) {
                                            var148 = var10.field2831;
                                        }
                                    } else {
                                        var148 = var10.field2828;
                                        if (Statics.field1154 == var10 && var10.field2820 != 0) {
                                            var148 = var10.field2820;
                                        }
                                    }
                                    if (var10.field2832) {
                                        switch(var10.field2879.field1484) {
                                            case 1:
                                                class83.method1740(var13, var14, var10.field2906, var10.field2819, var10.field2828, var10.field2802, 256 - (var10.field2834 & 0xFF), 256 - (var10.field2835 & 0xFF));
                                                break;
                                            case 2:
                                                class83.method1788(var13, var14, var10.field2906, var10.field2819, var10.field2828, var10.field2802, 256 - (var10.field2834 & 0xFF), 256 - (var10.field2835 & 0xFF));
                                                break;
                                            case 3:
                                                class83.method1742(var13, var14, var10.field2906, var10.field2819, var10.field2828, var10.field2802, 256 - (var10.field2834 & 0xFF), 256 - (var10.field2835 & 0xFF));
                                                break;
                                            case 4:
                                                class83.method1743(var13, var14, var10.field2906, var10.field2819, var10.field2828, var10.field2802, 256 - (var10.field2834 & 0xFF), 256 - (var10.field2835 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class83.method1755(var13, var14, var10.field2906, var10.field2819, var148);
                                                } else {
                                                    class83.method1738(var13, var14, var10.field2906, var10.field2819, var148, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class83.method1758(var13, var14, var10.field2906, var10.field2819, var148);
                                    } else {
                                        class83.method1786(var13, var14, var10.field2906, var10.field2819, var148, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2805 == 4) {
                                    class228 var149 = var10.method3222();
                                    if (var149 != null) {
                                        String var150 = var10.field2855;
                                        int var151;
                                        if (method3187(var10)) {
                                            var151 = var10.field2802;
                                            if (Statics.field1154 == var10 && var10.field2831 != 0) {
                                                var151 = var10.field2831;
                                            }
                                            if (var10.field2864.length() > 0) {
                                                var150 = var10.field2864;
                                            }
                                        } else {
                                            var151 = var10.field2828;
                                            if (Statics.field1154 == var10 && var10.field2820 != 0) {
                                                var151 = var10.field2820;
                                            }
                                        }
                                        if (var10.field2863 && var10.field2923 != -1) {
                                            class56 var152 = class56.method2018(var10.field2923);
                                            var150 = var152.field1216;
                                            if (var150 == null) {
                                                var150 = "null";
                                            }
                                            if ((var152.field1184 == 1 || var10.field2924 != 1) && var10.field2924 != -1) {
                                                var150 = class2.method2762(16748608) + var150 + class2.field26 + " " + 'x' + method2098(var10.field2924);
                                            }
                                        }
                                        if (field465 == var10) {
                                            class161 var10000 = (class161) null;
                                            var150 = class161.field2511;
                                            var151 = var10.field2828;
                                        }
                                        if (!var10.field2863) {
                                            var150 = method652(var150, var10);
                                        }
                                        var149.method3823(var150, var13, var14, var10.field2906, var10.field2819, var151, var10.field2868 ? 0 : -1, var10.field2866, var10.field2867, var10.field2871);
                                    } else if (class177.field2801) {
                                        method654(var10);
                                    }
                                } else if (var10.field2805 == 5) {
                                    if (var10.field2863) {
                                        class82 var154;
                                        if (var10.field2923 == -1) {
                                            var154 = var10.method3217(false);
                                        } else {
                                            var154 = class56.method3348(var10.field2923, var10.field2924, var10.field2842, var10.field2798, var10.field2861, false);
                                        }
                                        if (var154 != null) {
                                            int var155 = var154.field1454;
                                            int var156 = var154.field1460;
                                            if (var10.field2841) {
                                                class83.method1730(var13, var14, var10.field2906 + var13, var10.field2819 + var14);
                                                int var157 = (var10.field2906 + (var155 - 1)) / var155;
                                                int var158 = (var10.field2819 + (var156 - 1)) / var156;
                                                for (int var159 = 0; var159 < var157; var159++) {
                                                    for (int var160 = 0; var160 < var158; var160++) {
                                                        if (var10.field2844 != 0) {
                                                            var154.method1665(var155 / 2 + var155 * var159 + var13, var156 / 2 + var156 * var160 + var14, var10.field2844, 4096);
                                                        } else if (var15 == 0) {
                                                            var154.method1712(var155 * var159 + var13, var156 * var160 + var14);
                                                        } else {
                                                            var154.method1658(var155 * var159 + var13, var156 * var160 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class83.method1733(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var161 = var10.field2906 * 4096 / var155;
                                                if (var10.field2844 != 0) {
                                                    var154.method1665(var10.field2906 / 2 + var13, var10.field2819 / 2 + var14, var10.field2844, var161);
                                                } else if (var15 != 0) {
                                                    var154.method1710(var13, var14, var10.field2906, var10.field2819, 256 - (var15 & 0xFF));
                                                } else if (var10.field2906 == var155 && var10.field2819 == var156) {
                                                    var154.method1712(var13, var14);
                                                } else {
                                                    var154.method1651(var13, var14, var10.field2906, var10.field2819);
                                                }
                                            }
                                        } else if (class177.field2801) {
                                            method654(var10);
                                        }
                                    } else {
                                        class82 var153 = var10.method3217(method3187(var10));
                                        if (var153 != null) {
                                            var153.method1712(var13, var14);
                                        } else if (class177.field2801) {
                                            method654(var10);
                                        }
                                    }
                                } else if (var10.field2805 == 6) {
                                    boolean var162 = method3187(var10);
                                    int var163;
                                    if (var162) {
                                        var163 = var10.field2851;
                                    } else {
                                        var163 = var10.field2829;
                                    }
                                    class109 var164 = null;
                                    int var165 = 0;
                                    if (var10.field2923 != -1) {
                                        class56 var166 = class56.method2018(var10.field2923);
                                        if (var166 != null) {
                                            class56 var167 = var166.method1088(var10.field2924);
                                            var164 = var167.method1119(1);
                                            if (var164 == null) {
                                                method654(var10);
                                            } else {
                                                var164.method2204();
                                                var165 = var164.field1511 / 2;
                                            }
                                        }
                                    } else if (var10.field2846 == 5) {
                                        if (var10.field2847 == 0) {
                                            var164 = field575.method3304((class45) null, -1, (class45) null, -1);
                                        } else {
                                            var164 = Statics.field2137.method47();
                                        }
                                    } else if (var163 == -1) {
                                        var164 = var10.method3220((class45) null, -1, var162, Statics.field2137.field33);
                                        if (var164 == null && class177.field2801) {
                                            method654(var10);
                                        }
                                    } else {
                                        class45 var168 = class45.method3523(var163);
                                        var164 = var10.method3220(var168, var10.field2935, var162, Statics.field2137.field33);
                                        if (var164 == null && class177.field2801) {
                                            method654(var10);
                                        }
                                    }
                                    class95.method2028(var10.field2906 / 2 + var13, var10.field2819 / 2 + var14);
                                    int var169 = var10.field2857 * class95.field1624[var10.field2880] >> 16;
                                    int var170 = var10.field2857 * class95.field1643[var10.field2880] >> 16;
                                    if (var164 != null) {
                                        if (var10.field2863) {
                                            var164.method2204();
                                            if (var10.field2860) {
                                                var164.method2217(0, var10.field2907, var10.field2856, var10.field2880, var10.field2914, var10.field2899 + var165 + var169, var10.field2899 + var170, var10.field2857);
                                            } else {
                                                var164.method2216(0, var10.field2907, var10.field2856, var10.field2880, var10.field2914, var10.field2899 + var165 + var169, var10.field2899 + var170);
                                            }
                                        } else {
                                            var164.method2216(0, var10.field2907, 0, var10.field2880, 0, var169, var170);
                                        }
                                    }
                                    class95.method2027();
                                } else {
                                    if (var10.field2805 == 7) {
                                        class228 var171 = var10.method3222();
                                        if (var171 == null) {
                                            if (class177.field2801) {
                                                method654(var10);
                                            }
                                            continue;
                                        }
                                        int var172 = 0;
                                        for (int var173 = 0; var173 < var10.field2815; var173++) {
                                            for (int var174 = 0; var174 < var10.field2814; var174++) {
                                                if (var10.field2910[var172] > 0) {
                                                    class56 var175 = class56.method2018(var10.field2910[var172] - 1);
                                                    String var176;
                                                    if (var175.field1184 != 1 && var10.field2874[var172] == 1) {
                                                        var176 = class2.method2762(16748608) + var175.field1216 + class2.field26;
                                                    } else {
                                                        var176 = class2.method2762(16748608) + var175.field1216 + class2.field26 + " " + 'x' + method2098(var10.field2874[var172]);
                                                    }
                                                    int var177 = (var10.field2869 + 115) * var174 + var13;
                                                    int var178 = (var10.field2870 + 12) * var173 + var14;
                                                    if (var10.field2866 == 0) {
                                                        var171.method3876(var176, var177, var178, var10.field2828, var10.field2868 ? 0 : -1);
                                                    } else if (var10.field2866 == 1) {
                                                        var171.method3822(var176, var10.field2906 / 2 + var177, var178, var10.field2828, var10.field2868 ? 0 : -1);
                                                    } else {
                                                        var171.method3821(var176, var10.field2906 + var177 - 1, var178, var10.field2828, var10.field2868 ? 0 : -1);
                                                    }
                                                }
                                                var172++;
                                            }
                                        }
                                    }
                                    if (var10.field2805 == 8 && Statics.field268 == var10 && field453 == field361) {
                                        int var179 = 0;
                                        int var180 = 0;
                                        class228 var181 = Statics.field2124;
                                        String var182 = var10.field2855;
                                        String var183 = method652(var182, var10);
                                        while (var183.length() > 0) {
                                            int var184 = var183.indexOf(class2.field25);
                                            String var185;
                                            if (var184 == -1) {
                                                var185 = var183;
                                                var183 = "";
                                            } else {
                                                var185 = var183.substring(0, var184);
                                                var183 = var183.substring(var184 + 4);
                                            }
                                            int var186 = var181.method3814(var185);
                                            if (var186 > var179) {
                                                var179 = var186;
                                            }
                                            var180 += var181.field3244 + 1;
                                        }
                                        var179 += 6;
                                        var180 += 7;
                                        int var187 = var10.field2906 + var13 - 5 - var179;
                                        int var188 = var10.field2819 + var14 + 5;
                                        if (var187 < var13 + 5) {
                                            var187 = var13 + 5;
                                        }
                                        if (var179 + var187 > arg4) {
                                            var187 = arg4 - var179;
                                        }
                                        if (var180 + var188 > arg5) {
                                            var188 = arg5 - var180;
                                        }
                                        class83.method1755(var187, var188, var179, var180, 16777120);
                                        class83.method1758(var187, var188, var179, var180, 0);
                                        String var189 = var10.field2855;
                                        int var190 = var181.field3244 + var188 + 2;
                                        String var191 = method652(var189, var10);
                                        while (var191.length() > 0) {
                                            int var192 = var191.indexOf(class2.field25);
                                            String var193;
                                            if (var192 == -1) {
                                                var193 = var191;
                                                var191 = "";
                                            } else {
                                                var193 = var191.substring(0, var192);
                                                var191 = var191.substring(var192 + 4);
                                            }
                                            var181.method3876(var193, var187 + 3, var190, 0, -1);
                                            var190 += var181.field3244 + 1;
                                        }
                                    }
                                    if (var10.field2805 == 9) {
                                        if (var10.field2836 == 1) {
                                            int var194;
                                            int var195;
                                            int var196;
                                            int var197;
                                            if (var10.field2840) {
                                                var194 = var13;
                                                var195 = var10.field2819 + var14;
                                                var196 = var10.field2906 + var13;
                                                var197 = var14;
                                            } else {
                                                var194 = var13;
                                                var195 = var14;
                                                var196 = var10.field2906 + var13;
                                                var197 = var10.field2819 + var14;
                                            }
                                            class83.method1751(var194, var195, var196, var197, var10.field2828);
                                        } else {
                                            int var198 = var10.field2906 >= 0 ? var10.field2906 : -var10.field2906;
                                            int var199 = var10.field2819 >= 0 ? var10.field2819 : -var10.field2819;
                                            int var200 = var198;
                                            if (var198 < var199) {
                                                var200 = var199;
                                            }
                                            if (var200 != 0) {
                                                int var201 = (var10.field2906 << 16) / var200;
                                                int var202 = (var10.field2819 << 16) / var200;
                                                if (var202 <= var201) {
                                                    var201 = -var201;
                                                } else {
                                                    var202 = -var202;
                                                }
                                                int var203 = var10.field2836 * var202 >> 17;
                                                int var204 = var10.field2836 * var202 + 1 >> 17;
                                                int var205 = var10.field2836 * var201 >> 17;
                                                int var206 = var10.field2836 * var201 + 1 >> 17;
                                                int var207 = var13 + var203;
                                                int var208 = var13 - var204;
                                                int var209 = var10.field2906 + var13 - var204;
                                                int var210 = var10.field2906 + var13 + var203;
                                                int var211 = var14 + var205;
                                                int var212 = var14 - var206;
                                                int var213 = var10.field2819 + var14 - var206;
                                                int var214 = var10.field2819 + var14 + var205;
                                                class95.method2033(var207, var208, var209);
                                                class95.method2036(var211, var212, var213, var207, var208, var209, var10.field2828);
                                                class95.method2033(var207, var209, var210);
                                                class95.method2036(var211, var213, var214, var207, var209, var210, var10.field2828);
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

    @ObfuscatedName("aq.cm(Ljava/lang/String;Lfe;I)Ljava/lang/String;")
    public static String method652(String arg0, class177 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method767(arg1, var2 - 1);
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
                if (Statics.field182 != null) {
                    var8 = class167.method150(Statics.field182.field2269);
                    if (Statics.field182.field2271 != null) {
                        var8 = (String) Statics.field182.field2271;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cd.cc(IB)Ljava/lang/String;")
    public static final String method2098(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field20 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2762(65408) + var1.substring(0, var1.length() - 8) + class161.field2514 + " " + class2.field22 + var1 + class2.field19 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method2762(16777215) + var1.substring(0, var1.length() - 4) + class161.field2516 + " " + class2.field22 + var1 + class2.field19 + class2.field26;
        } else {
            return " " + class2.method2762(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("ci.cs(ZI)V")
    public static final void method1634(boolean arg0) {
        method1134(field374, Statics.field1268, Statics.field1429, arg0);
    }

    @ObfuscatedName("dx.ch(Lfe;B)V")
    public static void method2341(class177 arg0) {
        class177 var1 = arg0.field2822 == -1 ? null : class177.method3198(arg0.field2822);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1268;
            var3 = Statics.field1429;
        } else {
            var2 = var1.field2906;
            var3 = var1.field2819;
        }
        method532(arg0, var2, var3, false);
        method2017(arg0, var2, var3);
    }

    @ObfuscatedName("eq.cu([Lfe;Lfe;ZI)V")
    public static void method2703(class177[] arg0, class177 arg1, boolean arg2) {
        int var3 = arg1.field2826 == 0 ? arg1.field2906 : arg1.field2826;
        int var4 = arg1.field2915 == 0 ? arg1.field2819 : arg1.field2915;
        method157(arg0, arg1.field2803, var3, var4, arg2);
        if (arg1.field2830 != null) {
            method157(arg1.field2830, arg1.field2803, var3, var4, arg2);
        }
        class4 var5 = (class4) field462.method3564((long) arg1.field2803);
        if (var5 != null) {
            int var6 = var5.field63;
            if (class177.method163(var6)) {
                method157(Statics.field2824[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2936 == 1337) {
        }
    }

    @ObfuscatedName("by.cl(IIIZI)V")
    public static final void method1134(int arg0, int arg1, int arg2, boolean arg3) {
        if (class177.method163(arg0)) {
            method157(Statics.field2824[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("r.cw([Lfe;IIIZB)V")
    public static void method157(class177[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class177 var6 = arg0[var5];
            if (var6 != null && var6.field2822 == arg1) {
                method532(var6, arg2, arg3, arg4);
                method2017(var6, arg2, arg3);
                if (var6.field2858 > var6.field2826 - var6.field2906) {
                    var6.field2858 = var6.field2826 - var6.field2906;
                }
                if (var6.field2858 < 0) {
                    var6.field2858 = 0;
                }
                if (var6.field2825 > var6.field2915 - var6.field2819) {
                    var6.field2825 = var6.field2915 - var6.field2819;
                }
                if (var6.field2825 < 0) {
                    var6.field2825 = 0;
                }
                if (var6.field2805 == 0) {
                    method2703(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("o.cp(Lfe;IIZI)V")
    public static void method532(class177 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2906;
        int var5 = arg0.field2819;
        if (arg0.field2810 == 0) {
            arg0.field2906 = arg0.field2814;
        } else if (arg0.field2810 == 1) {
            arg0.field2906 = arg1 - arg0.field2814;
        } else if (arg0.field2810 == 2) {
            arg0.field2906 = arg0.field2814 * arg1 >> 14;
        }
        if (arg0.field2811 == 0) {
            arg0.field2819 = arg0.field2815;
        } else if (arg0.field2811 == 1) {
            arg0.field2819 = arg2 - arg0.field2815;
        } else if (arg0.field2811 == 2) {
            arg0.field2819 = arg0.field2815 * arg2 >> 14;
        }
        if (arg0.field2810 == 4) {
            arg0.field2906 = arg0.field2898 * arg0.field2819 / arg0.field2821;
        }
        if (arg0.field2811 == 4) {
            arg0.field2819 = arg0.field2906 * arg0.field2821 / arg0.field2898;
        }
        if (field471 && arg0.field2805 == 0) {
            if (arg0.field2819 < 5 && arg0.field2906 < 5) {
                arg0.field2819 = 5;
                arg0.field2906 = 5;
            } else {
                if (arg0.field2819 <= 0) {
                    arg0.field2819 = 5;
                }
                if (arg0.field2906 <= 0) {
                    arg0.field2906 = 5;
                }
            }
        }
        if (arg0.field2936 == 1337) {
            field536 = arg0;
        }
        if (arg3 && arg0.field2912 != null && (arg0.field2906 != var4 || arg0.field2819 != var5)) {
            class1 var6 = new class1();
            var6.field14 = arg0;
            var6.field9 = arg0.field2912;
            field523.method3617(var6);
        }
    }

    @ObfuscatedName("cr.cx(Lfe;III)V")
    public static void method2017(class177 arg0, int arg1, int arg2) {
        if (arg0.field2808 == 0) {
            arg0.field2816 = arg0.field2843;
        } else if (arg0.field2808 == 1) {
            arg0.field2816 = (arg1 - arg0.field2906) / 2 + arg0.field2843;
        } else if (arg0.field2808 == 2) {
            arg0.field2816 = arg1 - arg0.field2906 - arg0.field2843;
        } else if (arg0.field2808 == 3) {
            arg0.field2816 = arg0.field2843 * arg1 >> 14;
        } else if (arg0.field2808 == 4) {
            arg0.field2816 = (arg0.field2843 * arg1 >> 14) + (arg1 - arg0.field2906) / 2;
        } else {
            arg0.field2816 = arg1 - arg0.field2906 - (arg0.field2843 * arg1 >> 14);
        }
        if (arg0.field2809 == 0) {
            arg0.field2817 = arg0.field2813;
        } else if (arg0.field2809 == 1) {
            arg0.field2817 = (arg2 - arg0.field2819) / 2 + arg0.field2813;
        } else if (arg0.field2809 == 2) {
            arg0.field2817 = arg2 - arg0.field2819 - arg0.field2813;
        } else if (arg0.field2809 == 3) {
            arg0.field2817 = arg0.field2813 * arg2 >> 14;
        } else if (arg0.field2809 == 4) {
            arg0.field2817 = (arg0.field2813 * arg2 >> 14) + (arg2 - arg0.field2819) / 2;
        } else {
            arg0.field2817 = arg2 - arg0.field2819 - (arg0.field2813 * arg2 >> 14);
        }
        if (!field471 || arg0.field2805 != 0) {
            return;
        }
        if (arg0.field2816 < 0) {
            arg0.field2816 = 0;
        } else if (arg0.field2906 + arg0.field2816 > arg1) {
            arg0.field2816 = arg1 - arg0.field2906;
        }
        if (arg0.field2817 < 0) {
            arg0.field2817 = 0;
        } else if (arg0.field2819 + arg0.field2817 > arg2) {
            arg0.field2817 = arg2 - arg0.field2819;
        }
    }

    @ObfuscatedName("h.cr(IIIIII)V")
    public static final void method13(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field3223[0].method1807(arg0, arg1);
        Statics.field3223[1].method1807(arg0, arg1 + arg3 - 16);
        class83.method1755(arg0, arg1 + 16, 16, arg3 - 32, field381);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class83.method1755(arg0, arg1 + 16 + var6, 16, var5, field382);
        class83.method1747(arg0, arg1 + 16 + var6, var5, field384);
        class83.method1747(arg0 + 1, arg1 + 16 + var6, var5, field384);
        class83.method1781(arg0, arg1 + 16 + var6, 16, field384);
        class83.method1781(arg0, arg1 + 17 + var6, 16, field384);
        class83.method1747(arg0 + 15, arg1 + 16 + var6, var5, field383);
        class83.method1747(arg0 + 14, arg1 + 17 + var6, var5 - 1, field383);
        class83.method1781(arg0, arg1 + 15 + var6 + var5, 16, field383);
        class83.method1781(arg0 + 1, arg1 + 14 + var6 + var5, 15, field383);
    }

    @ObfuscatedName("fs.cq(Lfe;I)Z")
    public static final boolean method3187(class177 arg0) {
        if (arg0.field2889 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2889.length; var1++) {
            int var2 = method767(arg0, var1);
            int var3 = arg0.field2917[var1];
            if (arg0.field2889[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2889[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2889[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ax.cn(Lfe;IB)I")
    public static final int method767(class177 arg0, int arg1) {
        if (arg0.field2865 == null || arg1 >= arg0.field2865.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2865[arg1];
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
                    var7 = field368[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field439[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field323[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class177 var11 = class177.method3198(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class56.method2018(var12).field1191 || field304)) {
                        for (int var13 = 0; var13 < var11.field2910.length; var13++) {
                            if (var12 + 1 == var11.field2910[var13]) {
                                var7 += var11.field2874[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class180.field2955[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class159.field2346[field439[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class180.field2955[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2137.field38;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class159.field2345[var14]) {
                            var7 += field439[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class177 var17 = class177.method3198(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class56.method2018(var18).field1191 || field304)) {
                        for (int var19 = 0; var19 < var17.field2910.length; var19++) {
                            if (var18 + 1 == var17.field2910[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field551;
                }
                if (var6 == 12) {
                    var7 = field467;
                }
                if (var6 == 13) {
                    int var20 = class180.field2955[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class180.method123(var22);
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
                    var7 = (Statics.field2137.field879 >> 7) + Statics.field3127;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2137.field837 >> 7) + Statics.field1671;
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

    @ObfuscatedName("ci.cf(Lfe;IIB)V")
    public static final void method1635(class177 arg0, int arg1, int arg2) {
        if (arg0.field2806 == 1) {
            method2714(arg0.field2920, "", 24, 0, 0, arg0.field2803);
        }
        if (arg0.field2806 == 2 && !field456) {
            String var3 = method2721(arg0);
            if (var3 != null) {
                method2714(var3, class2.method2762(65280) + arg0.field2919, 25, 0, -1, arg0.field2803);
            }
        }
        if (arg0.field2806 == 3) {
            method2714(class161.field2512, "", 26, 0, 0, arg0.field2803);
        }
        if (arg0.field2806 == 4) {
            method2714(arg0.field2920, "", 28, 0, 0, arg0.field2803);
        }
        if (arg0.field2806 == 5) {
            method2714(arg0.field2920, "", 29, 0, 0, arg0.field2803);
        }
        if (arg0.field2806 == 6 && field465 == null) {
            method2714(arg0.field2920, "", 30, 0, -1, arg0.field2803);
        }
        if (arg0.field2805 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2819; var5++) {
                for (int var6 = 0; var6 < arg0.field2906; var6++) {
                    int var7 = (arg0.field2869 + 32) * var6;
                    int var8 = (arg0.field2870 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2837[var4];
                        var8 += arg0.field2872[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field455 = var4;
                        Statics.field70 = arg0;
                        if (arg0.field2910[var4] > 0) {
                            class56 var9 = class56.method2018(arg0.field2910[var4] - 1);
                            if (field454 == 1 && class182.method144(method93(arg0))) {
                                if (Statics.field2198 != arg0.field2803 || Statics.field642 != var4) {
                                    method2714(class161.field2503, field313 + " " + class2.field24 + " " + class2.method2762(16748608) + var9.field1216, 31, var9.field1171, var4, arg0.field2803);
                                }
                            } else if (!field456 || !class182.method144(method93(arg0))) {
                                String[] var10 = var9.field1209;
                                if (field472) {
                                    var10 = method184(var10);
                                }
                                if (class182.method144(method93(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method2714(var10[var11], class2.method2762(16748608) + var9.field1216, var12, var9.field1171, var4, arg0.field2803);
                                        } else if (var11 == 4) {
                                            method2714(class161.field2625, class2.method2762(16748608) + var9.field1216, 37, var9.field1171, var4, arg0.field2803);
                                        }
                                    }
                                }
                                int var13 = method93(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method2714(class161.field2503, class2.method2762(16748608) + var9.field1216, 38, var9.field1171, var4, arg0.field2803);
                                }
                                class182 var10000 = (class182) null;
                                if (class182.method144(method93(arg0)) && var10 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var10[var15] != null) {
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 33;
                                            }
                                            if (var15 == 1) {
                                                var16 = 34;
                                            }
                                            if (var15 == 2) {
                                                var16 = 35;
                                            }
                                            method2714(var10[var15], class2.method2762(16748608) + var9.field1216, var16, var9.field1171, var4, arg0.field2803);
                                        }
                                    }
                                }
                                String[] var17 = arg0.field2921;
                                if (field472) {
                                    var17 = method184(var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 39;
                                            }
                                            if (var18 == 1) {
                                                var19 = 40;
                                            }
                                            if (var18 == 2) {
                                                var19 = 41;
                                            }
                                            if (var18 == 3) {
                                                var19 = 42;
                                            }
                                            if (var18 == 4) {
                                                var19 = 43;
                                            }
                                            method2714(var17[var18], class2.method2762(16748608) + var9.field1216, var19, var9.field1171, var4, arg0.field2803);
                                        }
                                    }
                                }
                                method2714(class161.field2504, class2.method2762(16748608) + var9.field1216, 1005, var9.field1171, var4, arg0.field2803);
                            } else if ((Statics.field286 & 0x10) == 16) {
                                method2714(field459, field460 + " " + class2.field24 + " " + class2.method2762(16748608) + var9.field1216, 32, var9.field1171, var4, arg0.field2803);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2863) {
            return;
        }
        if (!field456) {
            for (int var20 = 9; var20 >= 5; var20--) {
                int var21 = method93(arg0);
                boolean var22 = (var21 >> var20 + 1 & 0x1) != 0;
                String var23;
                if (!var22 && arg0.field2903 == null) {
                    var23 = null;
                } else if (arg0.field2877 == null || arg0.field2877.length <= var20 || arg0.field2877[var20] == null || arg0.field2877[var20].trim().length() == 0) {
                    var23 = null;
                } else {
                    var23 = arg0.field2877[var20];
                }
                if (var23 != null) {
                    method2714(var23, arg0.field2876, 1007, var20 + 1, arg0.field2804, arg0.field2803);
                }
            }
            String var25 = method2721(arg0);
            if (var25 != null) {
                method2714(var25, arg0.field2876, 25, 0, arg0.field2804, arg0.field2803);
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                int var27 = method93(arg0);
                boolean var28 = (var27 >> var26 + 1 & 0x1) != 0;
                String var29;
                if (!var28 && arg0.field2903 == null) {
                    var29 = null;
                } else if (arg0.field2877 == null || arg0.field2877.length <= var26 || arg0.field2877[var26] == null || arg0.field2877[var26].trim().length() == 0) {
                    var29 = null;
                } else {
                    var29 = arg0.field2877[var26];
                }
                if (var29 != null) {
                    method2714(var29, arg0.field2876, 57, var26 + 1, arg0.field2804, arg0.field2803);
                }
            }
            if (class182.method583(method93(arg0))) {
                method2714(class161.field2362, "", 30, 0, arg0.field2804, arg0.field2803);
            }
        } else if (class182.method1809(method93(arg0)) && (Statics.field286 & 0x20) == 32) {
            method2714(field459, field460 + " " + class2.field24 + " " + arg0.field2876, 58, 0, arg0.field2804, arg0.field2803);
        }
    }

    @ObfuscatedName("dc.cv([Lfe;IIIIIIII)V")
    public static final void method2352(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class177 var9 = arg0[var8];
            if (var9 != null && (!var9.field2863 || var9.field2805 == 0 || var9.field2883 || method93(var9) != 0 || field475 == var9 || var9.field2936 == 1338) && var9.field2822 == arg1 && (!var9.field2863 || !method1827(var9))) {
                int var10 = var9.field2816 + arg6;
                int var11 = var9.field2817 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2805 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2805 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2906 + var10;
                    int var19 = var9.field2819 + var11;
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
                    int var22 = var9.field2906 + var10;
                    int var23 = var9.field2819 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field474 == var9) {
                    field586 = true;
                    field483 = var10;
                    field448 = var11;
                }
                if (!var9.field2863 || var12 < var14 && var13 < var15) {
                    int var24 = class144.field2205;
                    int var25 = class144.field2207 * 900883817;
                    if (class144.field2211 != 0) {
                        var24 = class144.field2212;
                        var25 = class144.field2213;
                    }
                    if (var9.field2936 == 1337) {
                        if (!field440 && !field442 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field454 == 0 && !field456) {
                                method2714(class161.field2508, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class109.field1869; var28++) {
                                int var29 = class109.field1915[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field2091.method1877(Statics.field2760, var30, var31, var29) >= 0) {
                                        class43 var34 = class43.method117(var33);
                                        if (var34.field986 != null) {
                                            var34 = var34.method847();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field454 == 1) {
                                            method2714(class161.field2503, field313 + " " + class2.field24 + " " + class2.method2762(65535) + var34.field982, 1, var29, var30, var31);
                                        } else if (!field456) {
                                            String[] var35 = var34.field972;
                                            if (field472) {
                                                var35 = method184(var35);
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
                                                        method2714(var35[var36], class2.method2762(65535) + var34.field982, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2714(class161.field2504, class2.method2762(65535) + var34.field982, 1002, var34.field955 << 14, var30, var31);
                                        } else if ((Statics.field286 & 0x4) == 4) {
                                            method2714(field459, field460 + " " + class2.field24 + " " + class2.method2762(65535) + var34.field982, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class37 var38 = field341[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field803.field911 == 1 && (var38.field879 & 0x7F) == 64 && (var38.field837 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field342; var39++) {
                                                class37 var40 = field341[field343[var39]];
                                                if (var40 != null && var38 != var40 && var40.field803.field911 == 1 && var38.field879 == var40.field879 && var38.field837 == var40.field837) {
                                                    method122(var40.field803, field343[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class35.field780;
                                            int[] var42 = class35.field787;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field420[var42[var43]];
                                                if (var44 != null && var38.field879 == var44.field879 && var38.field837 == var44.field837) {
                                                    method18(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method122(var38.field803, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field420[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field879 & 0x7F) == 64 && (var45.field837 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field342; var46++) {
                                                class37 var47 = field341[field343[var46]];
                                                if (var47 != null && var47.field803.field911 == 1 && var45.field879 == var47.field879 && var45.field837 == var47.field837) {
                                                    method122(var47.field803, field343[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class35.field780;
                                            int[] var49 = class35.field787;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field420[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field879 == var51.field879 && var45.field837 == var51.field837) {
                                                    method18(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field433 == var33) {
                                            var26 = var29;
                                        } else {
                                            method18(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class203 var52 = field434[Statics.field2760][var30][var31];
                                        if (var52 != null) {
                                            for (class31 var53 = (class31) var52.method3598(); var53 != null; var53 = (class31) var52.method3600()) {
                                                class56 var54 = class56.method2018(var53.field710);
                                                if (field454 == 1) {
                                                    method2714(class161.field2503, field313 + " " + class2.field24 + " " + class2.method2762(16748608) + var54.field1216, 16, var53.field710, var30, var31);
                                                } else if (!field456) {
                                                    String[] var55 = var54.field1188;
                                                    if (field472) {
                                                        var55 = method184(var55);
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
                                                            method2714(var55[var56], class2.method2762(16748608) + var54.field1216, var57, var53.field710, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method2714(class161.field2356, class2.method2762(16748608) + var54.field1216, 20, var53.field710, var30, var31);
                                                        }
                                                    }
                                                    method2714(class161.field2504, class2.method2762(16748608) + var54.field1216, 1004, var53.field710, var30, var31);
                                                } else if ((Statics.field286 & 0x1) == 1) {
                                                    method2714(field459, field460 + " " + class2.field24 + " " + class2.method2762(16748608) + var54.field1216, 17, var53.field710, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field420[field433];
                                method18(var60, field433, var58, var59);
                            }
                        }
                    } else if (var9.field2936 != 1338) {
                        if (!field442 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1635(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2805 == 0) {
                            if (!var9.field2863 && method1827(var9) && Statics.field1154 != var9) {
                                continue;
                            }
                            method2352(arg0, var9.field2803, var12, var13, var14, var15, var10 - var9.field2858, var11 - var9.field2825);
                            if (var9.field2830 != null) {
                                method2352(var9.field2830, var9.field2803, var12, var13, var14, var15, var10 - var9.field2858, var11 - var9.field2825);
                            }
                            class4 var75 = (class4) field462.method3564((long) var9.field2803);
                            if (var75 != null) {
                                if (var75.field71 == 0 && class144.field2205 >= var12 && class144.field2207 * 900883817 >= var13 && class144.field2205 < var14 && class144.field2207 * 900883817 < var15 && !field442 && !field471) {
                                    for (class1 var76 = (class1) field523.method3597(); var76 != null; var76 = (class1) field523.method3599()) {
                                        if (var76.field6) {
                                            var76.method3706();
                                            var76.field14.field2928 = false;
                                        }
                                    }
                                    if (Statics.field827 == 0) {
                                        field474 = null;
                                        field475 = null;
                                    }
                                    if (!field442) {
                                        field470[0] = class161.field2480;
                                        field449[0] = "";
                                        field346[0] = 1006;
                                        field411 = 1;
                                    }
                                }
                                int var77 = var75.field63;
                                if (class177.method163(var77)) {
                                    method2352(Statics.field2824[var77], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2863) {
                            if (var9.field2875) {
                                if (class144.field2205 >= var12 && class144.field2207 * 900883817 >= var13 && class144.field2205 < var14 && class144.field2207 * 900883817 < var15) {
                                    for (class1 var78 = (class1) field523.method3597(); var78 != null; var78 = (class1) field523.method3599()) {
                                        if (var78.field6) {
                                            var78.method3706();
                                            var78.field14.field2928 = false;
                                        }
                                    }
                                    if (Statics.field827 == 0) {
                                        field474 = null;
                                        field475 = null;
                                    }
                                    if (!field442) {
                                        field470[0] = class161.field2480;
                                        field449[0] = "";
                                        field346[0] = 1006;
                                        field411 = 1;
                                    }
                                }
                            } else if (var9.field2937 && class144.field2205 >= var12 && class144.field2207 * 900883817 >= var13 && class144.field2205 < var14 && class144.field2207 * 900883817 < var15) {
                                for (class1 var79 = (class1) field523.method3597(); var79 != null; var79 = (class1) field523.method3599()) {
                                    if (var79.field6 && var79.field14.field2904 == var79.field9) {
                                        var79.method3706();
                                    }
                                }
                            }
                            boolean var80;
                            if (class144.field2205 >= var12 && class144.field2207 * 900883817 >= var13 && class144.field2205 < var14 && class144.field2207 * 900883817 < var15) {
                                var80 = true;
                            } else {
                                var80 = false;
                            }
                            boolean var81 = false;
                            if ((class144.field2204 == 1 || !Statics.field82 && class144.field2204 == 4) && var80) {
                                var81 = true;
                            }
                            boolean var82 = false;
                            if ((class144.field2211 == 1 || !Statics.field82 && class144.field2211 == 4) && class144.field2212 >= var12 && class144.field2213 >= var13 && class144.field2212 < var14 && class144.field2213 < var15) {
                                var82 = true;
                            }
                            if (var82) {
                                method40(var9, class144.field2212 - var10, class144.field2213 - var11);
                            }
                            if (field474 != null && field474 != var9 && var80) {
                                int var83 = method93(var9);
                                boolean var84 = (var83 >> 20 & 0x1) != 0;
                                if (var84) {
                                    field461 = var9;
                                }
                            }
                            if (field475 == var9) {
                                field479 = true;
                                field480 = var10;
                                field325 = var11;
                            }
                            if (var9.field2883) {
                                if (var80 && field531 != 0 && var9.field2904 != null) {
                                    class1 var85 = new class1();
                                    var85.field6 = true;
                                    var85.field14 = var9;
                                    var85.field5 = field531;
                                    var85.field9 = var9.field2904;
                                    field523.method3617(var85);
                                }
                                if (field474 != null || Statics.field1822 != null || field442) {
                                    var82 = false;
                                    var81 = false;
                                    var80 = false;
                                }
                                if (!var9.field2929 && var82) {
                                    var9.field2929 = true;
                                    if (var9.field2885 != null) {
                                        class1 var86 = new class1();
                                        var86.field6 = true;
                                        var86.field14 = var9;
                                        var86.field4 = class144.field2212 - var10;
                                        var86.field5 = class144.field2213 - var11;
                                        var86.field9 = var9.field2885;
                                        field523.method3617(var86);
                                    }
                                }
                                if (var9.field2929 && var81 && var9.field2886 != null) {
                                    class1 var87 = new class1();
                                    var87.field6 = true;
                                    var87.field14 = var9;
                                    var87.field4 = class144.field2205 - var10;
                                    var87.field5 = class144.field2207 * 900883817 - var11;
                                    var87.field9 = var9.field2886;
                                    field523.method3617(var87);
                                }
                                if (var9.field2929 && !var81) {
                                    var9.field2929 = false;
                                    if (var9.field2895 != null) {
                                        class1 var88 = new class1();
                                        var88.field6 = true;
                                        var88.field14 = var9;
                                        var88.field4 = class144.field2205 - var10;
                                        var88.field5 = class144.field2207 * 900883817 - var11;
                                        var88.field9 = var9.field2895;
                                        field502.method3617(var88);
                                    }
                                }
                                if (var81 && var9.field2888 != null) {
                                    class1 var89 = new class1();
                                    var89.field6 = true;
                                    var89.field14 = var9;
                                    var89.field4 = class144.field2205 - var10;
                                    var89.field5 = class144.field2207 * 900883817 - var11;
                                    var89.field9 = var9.field2888;
                                    field523.method3617(var89);
                                }
                                if (!var9.field2928 && var80) {
                                    var9.field2928 = true;
                                    if (var9.field2839 != null) {
                                        class1 var90 = new class1();
                                        var90.field6 = true;
                                        var90.field14 = var9;
                                        var90.field4 = class144.field2205 - var10;
                                        var90.field5 = class144.field2207 * 900883817 - var11;
                                        var90.field9 = var9.field2839;
                                        field523.method3617(var90);
                                    }
                                }
                                if (var9.field2928 && var80 && var9.field2890 != null) {
                                    class1 var91 = new class1();
                                    var91.field6 = true;
                                    var91.field14 = var9;
                                    var91.field4 = class144.field2205 - var10;
                                    var91.field5 = class144.field2207 * 900883817 - var11;
                                    var91.field9 = var9.field2890;
                                    field523.method3617(var91);
                                }
                                if (var9.field2928 && !var80) {
                                    var9.field2928 = false;
                                    if (var9.field2891 != null) {
                                        class1 var92 = new class1();
                                        var92.field6 = true;
                                        var92.field14 = var9;
                                        var92.field4 = class144.field2205 - var10;
                                        var92.field5 = class144.field2207 * 900883817 - var11;
                                        var92.field9 = var9.field2891;
                                        field502.method3617(var92);
                                    }
                                }
                                if (var9.field2927 != null) {
                                    class1 var93 = new class1();
                                    var93.field14 = var9;
                                    var93.field9 = var9.field2927;
                                    field501.method3617(var93);
                                }
                                if (var9.field2896 != null && field427 > var9.field2931) {
                                    if (var9.field2897 == null || field427 - var9.field2931 > 32) {
                                        class1 var98 = new class1();
                                        var98.field14 = var9;
                                        var98.field9 = var9.field2896;
                                        field523.method3617(var98);
                                    } else {
                                        label860: for (int var94 = var9.field2931; var94 < field427; var94++) {
                                            int var95 = field487[var94 & 0x1F];
                                            for (int var96 = 0; var96 < var9.field2897.length; var96++) {
                                                if (var9.field2897[var96] == var95) {
                                                    class1 var97 = new class1();
                                                    var97.field14 = var9;
                                                    var97.field9 = var9.field2896;
                                                    field523.method3617(var97);
                                                    break label860;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2931 = field427;
                                }
                                if (var9.field2852 != null && field490 > var9.field2932) {
                                    if (var9.field2918 == null || field490 - var9.field2932 > 32) {
                                        class1 var103 = new class1();
                                        var103.field14 = var9;
                                        var103.field9 = var9.field2852;
                                        field523.method3617(var103);
                                    } else {
                                        label836: for (int var99 = var9.field2932; var99 < field490; var99++) {
                                            int var100 = field489[var99 & 0x1F];
                                            for (int var101 = 0; var101 < var9.field2918.length; var101++) {
                                                if (var9.field2918[var101] == var100) {
                                                    class1 var102 = new class1();
                                                    var102.field14 = var9;
                                                    var102.field9 = var9.field2852;
                                                    field523.method3617(var102);
                                                    break label836;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2932 = field490;
                                }
                                if (var9.field2900 != null && field492 > var9.field2933) {
                                    if (var9.field2796 == null || field492 - var9.field2933 > 32) {
                                        class1 var108 = new class1();
                                        var108.field14 = var9;
                                        var108.field9 = var9.field2900;
                                        field523.method3617(var108);
                                    } else {
                                        label812: for (int var104 = var9.field2933; var104 < field492; var104++) {
                                            int var105 = field491[var104 & 0x1F];
                                            for (int var106 = 0; var106 < var9.field2796.length; var106++) {
                                                if (var9.field2796[var106] == var105) {
                                                    class1 var107 = new class1();
                                                    var107.field14 = var9;
                                                    var107.field9 = var9.field2900;
                                                    field523.method3617(var107);
                                                    break label812;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2933 = field492;
                                }
                                if (field493 > var9.field2812 && var9.field2905 != null) {
                                    class1 var109 = new class1();
                                    var109.field14 = var9;
                                    var109.field9 = var9.field2905;
                                    field523.method3617(var109);
                                }
                                if (field494 > var9.field2812 && var9.field2916 != null) {
                                    class1 var110 = new class1();
                                    var110.field14 = var9;
                                    var110.field9 = var9.field2916;
                                    field523.method3617(var110);
                                }
                                if (field571 > var9.field2812 && var9.field2887 != null) {
                                    class1 var111 = new class1();
                                    var111.field14 = var9;
                                    var111.field9 = var9.field2887;
                                    field523.method3617(var111);
                                }
                                if (field576 > var9.field2812 && var9.field2913 != null) {
                                    class1 var112 = new class1();
                                    var112.field14 = var9;
                                    var112.field9 = var9.field2913;
                                    field523.method3617(var112);
                                }
                                if (field497 > var9.field2812 && var9.field2838 != null) {
                                    class1 var113 = new class1();
                                    var113.field14 = var9;
                                    var113.field9 = var9.field2838;
                                    field523.method3617(var113);
                                }
                                if (field498 > var9.field2812 && var9.field2854 != null) {
                                    class1 var114 = new class1();
                                    var114.field14 = var9;
                                    var114.field9 = var9.field2854;
                                    field523.method3617(var114);
                                }
                                var9.field2812 = field486;
                                if (var9.field2930 != null) {
                                    for (int var115 = 0; var115 < field524; var115++) {
                                        class1 var116 = new class1();
                                        var116.field14 = var9;
                                        var116.field8 = field478[var115];
                                        var116.field18 = field337[var115];
                                        var116.field9 = var9.field2930;
                                        field523.method3617(var116);
                                    }
                                }
                            }
                        }
                        if (!var9.field2863 && field474 == null && Statics.field1822 == null && !field442) {
                            if ((var9.field2797 >= 0 || var9.field2820 != 0) && class144.field2205 >= var12 && class144.field2207 * 900883817 >= var13 && class144.field2205 < var14 && class144.field2207 * 900883817 < var15) {
                                if (var9.field2797 >= 0) {
                                    Statics.field1154 = arg0[var9.field2797];
                                } else {
                                    Statics.field1154 = var9;
                                }
                            }
                            if (var9.field2805 == 8 && class144.field2205 >= var12 && class144.field2207 * 900883817 >= var13 && class144.field2205 < var14 && class144.field2207 * 900883817 < var15) {
                                Statics.field268 = var9;
                            }
                            if (var9.field2915 > var9.field2819) {
                                int var117 = var9.field2906 + var10;
                                int var118 = var9.field2819;
                                int var119 = var9.field2915;
                                int var120 = class144.field2205;
                                int var121 = class144.field2207 * 900883817;
                                if (field385) {
                                    field363 = 32;
                                } else {
                                    field363 = 0;
                                }
                                field385 = false;
                                if (class144.field2204 == 1 || !Statics.field82 && class144.field2204 == 4) {
                                    if (var120 >= var117 && var120 < var117 + 16 && var121 >= var11 && var121 < var11 + 16) {
                                        var9.field2825 -= 4;
                                        method654(var9);
                                    } else if (var120 >= var117 && var120 < var117 + 16 && var121 >= var11 + var118 - 16 && var121 < var11 + var118) {
                                        var9.field2825 += 4;
                                        method654(var9);
                                    } else if (var120 >= var117 - field363 && var120 < field363 + var117 + 16 && var121 >= var11 + 16 && var121 < var11 + var118 - 16) {
                                        int var122 = (var118 - 32) * var118 / var119;
                                        if (var122 < 8) {
                                            var122 = 8;
                                        }
                                        int var123 = var121 - var11 - 16 - var122 / 2;
                                        int var124 = var118 - 32 - var122;
                                        var9.field2825 = (var119 - var118) * var123 / var124;
                                        method654(var9);
                                        field385 = true;
                                    }
                                }
                                if (field531 != 0) {
                                    int var125 = var9.field2906;
                                    if (var120 >= var117 - var125 && var121 >= var11 && var120 < var117 + 16 && var121 <= var11 + var118) {
                                        var9.field2825 += field531 * 45;
                                        method654(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field404 == 0 || field404 == 3) && (class144.field2211 == 1 || !Statics.field82 && class144.field2211 == 4)) {
                        class179 var61 = var9.method3248(true);
                        if (var61 != null) {
                            int var62 = class144.field2212 - var10;
                            int var63 = class144.field2213 - var11;
                            if (var61.method3261(var62, var63)) {
                                int var64 = var62 - var61.field2949 / 2;
                                int var65 = var63 - var61.field2948 / 2;
                                int var66 = field482 + field388 & 0x7FF;
                                int var67 = class95.field1624[var66];
                                int var68 = class95.field1643[var66];
                                int var69 = (field376 + 256) * var67 >> 8;
                                int var70 = (field376 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field2137.field879 + var71 >> 7;
                                int var74 = Statics.field2137.field837 - var72 >> 7;
                                field379.method2661(227);
                                field379.method2389(18);
                                field379.method2429(class141.field2166[82] ? (class141.field2166[81] ? 2 : 1) : 0);
                                field379.method2561(Statics.field1671 + var74);
                                field379.method2437(Statics.field3127 + var73);
                                field379.method2389(var64);
                                field379.method2389(var65);
                                field379.method2561(field388);
                                field379.method2389(57);
                                field379.method2389(field482);
                                field379.method2389(field376);
                                field379.method2389(89);
                                field379.method2561(Statics.field2137.field879);
                                field379.method2561(Statics.field2137.field837);
                                field379.method2389(63);
                                field535 = var73;
                                field435 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.cb([Lfe;II)V")
    public static final void method973(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2805 == 0) {
                    if (var3.field2830 != null) {
                        method973(var3.field2830, arg1);
                    }
                    class4 var4 = (class4) field462.method3564((long) var3.field2803);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (class177.method163(var5)) {
                            method973(Statics.field2824[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2807 != null) {
                    class1 var6 = new class1();
                    var6.field14 = var3;
                    var6.field9 = var3.field2807;
                    class39.method147(var6);
                }
                if (arg1 == 1 && var3.field2850 != null) {
                    if (var3.field2804 >= 0) {
                        class177 var7 = class177.method3198(var3.field2803);
                        if (var7 == null || var7.field2830 == null || var3.field2804 >= var7.field2830.length || var7.field2830[var3.field2804] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field14 = var3;
                    var8.field9 = var3.field2850;
                    class39.method147(var8);
                }
            }
        }
    }

    @ObfuscatedName("e.cg(Lfe;III)V")
    public static final void method40(class177 arg0, int arg1, int arg2) {
        if (field474 != null || field442 || arg0 == null) {
            return;
        }
        class177 var3 = arg0;
        int var4 = class182.method750(method93(arg0));
        class177 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class177.method3198(var3.field2822);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class177 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2878;
        }
        if (var7 == null) {
            return;
        }
        field474 = arg0;
        class177 var9 = arg0;
        int var10 = class182.method750(method93(arg0));
        class177 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class177.method3198(var9.field2822);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class177 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2878;
        }
        field475 = var13;
        field476 = arg1;
        field513 = arg2;
        Statics.field827 = 0;
        field485 = false;
        if (field411 > 0) {
            method624(field411 - 1);
        }
        return;
    }

    @ObfuscatedName("e.cz(I)V")
    public static final void method50() {
        method654(field474);
        Statics.field827++;
        if (field586 && field479) {
            int var0 = class144.field2205;
            int var1 = class144.field2207 * 900883817;
            int var2 = var0 - field476;
            int var3 = var1 - field513;
            if (var2 < field480) {
                var2 = field480;
            }
            if (field474.field2906 + var2 > field480 + field475.field2906) {
                var2 = field480 + field475.field2906 - field474.field2906;
            }
            if (var3 < field325) {
                var3 = field325;
            }
            if (field474.field2819 + var3 > field325 + field475.field2819) {
                var3 = field325 + field475.field2819 - field474.field2819;
            }
            int var4 = var2 - field483;
            int var5 = var3 - field448;
            int var6 = field474.field2908;
            if (Statics.field827 > field474.field2925 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field485 = true;
            }
            int var7 = field475.field2858 + (var2 - field480);
            int var8 = field475.field2825 + (var3 - field325);
            if (field474.field2892 != null && field485) {
                class1 var9 = new class1();
                var9.field14 = field474;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field9 = field474.field2892;
                class39.method147(var9);
            }
            if (class144.field2204 == 0) {
                if (field485) {
                    if (field474.field2893 != null) {
                        class1 var10 = new class1();
                        var10.field14 = field474;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field7 = field461;
                        var10.field9 = field474.field2893;
                        class39.method147(var10);
                    }
                    if (field461 != null) {
                        class177 var11 = field474;
                        int var12 = class182.method750(method93(var11));
                        class177 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class177.method3198(var11.field2822);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field379.method2661(201);
                            field379.method2516(field461.field2803);
                            field379.method2470(field474.field2803);
                            field379.method2532(field461.field2923);
                            field379.method2437(field474.field2923);
                            field379.method2532(field474.field2804);
                            field379.method2437(field461.field2804);
                        }
                    }
                } else if ((field441 == 1 || method2108(field411 - 1)) && field411 > 2) {
                    method226(field483 + field476, field513 + field448);
                } else if (field411 > 0) {
                    method2197(field483 + field476, field513 + field448);
                }
                field474 = null;
            }
        } else if (Statics.field827 > 1) {
            field474 = null;
        }
    }

    @ObfuscatedName("ad.cd(II)V")
    public static void method624(int arg0) {
        Statics.field154 = new class33();
        Statics.field154.field740 = field444[arg0];
        Statics.field154.field734 = field445[arg0];
        Statics.field154.field733 = field346[arg0];
        Statics.field154.field737 = field447[arg0];
        Statics.field154.field736 = field470[arg0];
    }

    @ObfuscatedName("dd.ce(III)V")
    public static void method2197(int arg0, int arg1) {
        class33 var2 = Statics.field154;
        method1577(var2.field740, var2.field734, var2.field733, var2.field737, var2.field736, var2.field736, arg0, arg1);
        Statics.field154 = null;
    }

    @ObfuscatedName("an.ct(Lfe;I)V")
    public static void method654(class177 arg0) {
        if (field452 == arg0.field2901) {
            field495[arg0.field2934] = true;
        }
    }

    @ObfuscatedName("az.cy(S)V")
    public static void method962() {
        for (class4 var0 = (class4) field462.method3567(); var0 != null; var0 = (class4) field462.method3568()) {
            int var1 = var0.field63;
            if (class177.method163(var1)) {
                boolean var2 = true;
                class177[] var3 = Statics.field2824[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2863;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3176;
                    class177 var6 = class177.method3198(var5);
                    if (var6 != null) {
                        method654(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.ck([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method184(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("t.co(II)V")
    public static final void method558(int arg0) {
        if (!class177.method163(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2824[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3 != null) {
                var3.field2935 = 0;
                var3.field2926 = 0;
            }
        }
    }

    @ObfuscatedName("e.di(II)V")
    public static final void method36(int arg0) {
        if (class177.method163(arg0)) {
            method2016(Statics.field2824[arg0], -1);
        }
    }

    @ObfuscatedName("cr.db([Lfe;II)V")
    public static final void method2016(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null && var3.field2822 == arg1 && (!var3.field2863 || !method1827(var3))) {
                if (var3.field2805 == 0) {
                    if (!var3.field2863 && method1827(var3) && Statics.field1154 != var3) {
                        continue;
                    }
                    method2016(arg0, var3.field2803);
                    if (var3.field2830 != null) {
                        method2016(var3.field2830, var3.field2803);
                    }
                    class4 var4 = (class4) field462.method3564((long) var3.field2803);
                    if (var4 != null) {
                        method36(var4.field63);
                    }
                }
                if (var3.field2805 == 6) {
                    if (var3.field2829 != -1 || var3.field2851 != -1) {
                        boolean var5 = method3187(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2851;
                        } else {
                            var6 = var3.field2829;
                        }
                        if (var6 != -1) {
                            class45 var7 = class45.method3523(var6);
                            var3.field2926 += field421;
                            while (var3.field2926 > var7.field1020[var3.field2935]) {
                                var3.field2926 -= var7.field1020[var3.field2935];
                                var3.field2935++;
                                if (var3.field2935 >= var7.field1012.length) {
                                    var3.field2935 -= var7.field1013;
                                    if (var3.field2935 < 0 || var3.field2935 >= var7.field1012.length) {
                                        var3.field2935 = 0;
                                    }
                                }
                                method654(var3);
                            }
                        }
                    }
                    if (var3.field2859 != 0 && !var3.field2863) {
                        int var8 = var3.field2859 >> 16;
                        int var9 = var3.field2859 << 16 >> 16;
                        int var10 = field421 * var8;
                        int var11 = field421 * var9;
                        var3.field2880 = var3.field2880 + var10 & 0x7FF;
                        var3.field2907 = var3.field2907 + var11 & 0x7FF;
                        method654(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ee.dd(II)V")
    public static final void method2835(int arg0) {
        method962();
        class25.method3181();
        int var1 = class57.method948(arg0).field1219;
        if (var1 == 0) {
            return;
        }
        int var2 = class180.field2955[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class95.method2062(0.9D);
                ((class99) Statics.field1639).method2102(0.9D);
            }
            if (var2 == 2) {
                class95.method2062(0.8D);
                ((class99) Statics.field1639).method2102(0.8D);
            }
            if (var2 == 3) {
                class95.method2062(0.7D);
                ((class99) Statics.field1639).method2102(0.7D);
            }
            if (var2 == 4) {
                class95.method2062(0.6D);
                ((class99) Statics.field1639).method2102(0.6D);
            }
            class56.field1170.method3533();
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
            if (field514 != var3) {
                if (field514 == 0 && field539 != -1) {
                    class187.method2091(Statics.field477, field539, 0, var3, false);
                    field540 = false;
                } else if (var3 == 0) {
                    class187.method646();
                    field540 = false;
                } else if (class187.field3011 == 0) {
                    Statics.field3014.method3411(var3);
                } else {
                    Statics.field3017 = var3;
                }
                field514 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field548 = 127;
            }
            if (var2 == 1) {
                field548 = 96;
            }
            if (var2 == 2) {
                field548 = 64;
            }
            if (var2 == 3) {
                field548 = 32;
            }
            if (var2 == 4) {
                field548 = 0;
            }
        }
        if (var1 == 5) {
            field441 = var2;
        }
        if (var1 == 6) {
            field463 = var2;
        }
        if (var1 == 9) {
            field464 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field409 = 127;
            }
            if (var2 == 1) {
                field409 = 96;
            }
            if (var2 == 2) {
                field409 = 64;
            }
            if (var2 == 3) {
                field409 = 32;
            }
            if (var2 == 4) {
                field409 = 0;
            }
        }
        if (var1 == 17) {
            field567 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field327 = (class22) class113.method2810(class22.method152(), var2);
            if (field327 == null) {
                field327 = class22.field607;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field433 = -1;
            } else {
                field433 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field328 = (class22) class113.method2810(class22.method152(), var2);
            if (field328 == null) {
                field328 = class22.field607;
            }
        }
    }

    @ObfuscatedName("w.dj(I)V")
    public static final void method183() {
        field379.method2661(129);
        for (class4 var0 = (class4) field462.method3567(); var0 != null; var0 = (class4) field462.method3568()) {
            if (var0.field71 == 0 || var0.field71 == 3) {
                method3510(var0, true);
            }
        }
        if (field465 != null) {
            method654(field465);
            field465 = null;
        }
    }

    @ObfuscatedName("at.do(IIII)Lg;")
    public static final class4 method1039(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field63 = arg1;
        var3.field71 = arg2;
        field462.method3565(var3, (long) arg0);
        method558(arg1);
        class177 var4 = class177.method3198(arg0);
        method654(var4);
        if (field465 != null) {
            method654(field465);
            field465 = null;
        }
        method861();
        method2703(Statics.field2824[arg0 >> 16], var4, false);
        class39.method129(arg1);
        if (field374 != -1) {
            int var5 = field374;
            if (class177.method163(var5)) {
                method973(Statics.field2824[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("gn.dp(Lg;ZI)V")
    public static final void method3510(class4 arg0, boolean arg1) {
        int var2 = arg0.field63;
        int var3 = (int) arg0.field3176;
        arg0.method3706();
        if (arg1 && var2 != -1 && Statics.field2793[var2]) {
            Statics.field1946.method3095(var2);
            if (Statics.field2824[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2824[var2].length; var5++) {
                    if (Statics.field2824[var2][var5] != null) {
                        if (Statics.field2824[var2][var5].field2805 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2824[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2824[var2] = null;
                }
                Statics.field2793[var2] = false;
            }
        }
        for (class205 var6 = (class205) field503.method3567(); var6 != null; var6 = (class205) field503.method3568()) {
            if ((long) var2 == (var6.field3176 >> 48 & 0xFFFFL)) {
                var6.method3706();
            }
        }
        class177 var7 = class177.method3198(var3);
        if (var7 != null) {
            method654(var7);
        }
        method861();
        if (field374 != -1) {
            int var8 = field374;
            if (class177.method163(var8)) {
                method973(Statics.field2824[var8], 1);
            }
        }
    }

    @ObfuscatedName("ep.dq(Lfe;I)Z")
    public static final boolean method2761(class177 arg0) {
        int var1 = arg0.field2936;
        if (var1 == 205) {
            field356 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field575.method3311(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field575.method3300(var4, var5 == 1);
        }
        if (var1 == 324) {
            field575.method3301(false);
        }
        if (var1 == 325) {
            field575.method3301(true);
        }
        if (var1 == 326) {
            field379.method2661(107);
            field575.method3318(field379);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.da(IIIILcm;Lfg;S)V")
    public static final void method655(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method188(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field482 + field388 & 0x7FF;
        int var8 = class95.field1624[var7];
        int var9 = class95.field1643[var7];
        int var10 = var8 * 256 / (field376 + 256);
        int var11 = var9 * 256 / (field376 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2033.method1664(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("k.dz(IIIILcm;Lfg;B)V")
    public static final void method188(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field482 + field388 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class95.field1624[var6];
        int var9 = class95.field1643[var6];
        int var10 = var8 * 256 / (field376 + 256);
        int var11 = var9 * 256 / (field376 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1662(arg5.field2949 / 2 + var12 - arg4.field1454 / 2, arg5.field2948 / 2 - var13 - arg4.field1460 / 2, arg0, arg1, arg5.field2949, arg5.field2948, arg5.field2952, arg5.field2947);
        } else {
            arg4.method1712(arg5.field2949 / 2 + arg0 + var12 - arg4.field1454 / 2, arg5.field2948 / 2 + arg1 - var13 - arg4.field1460 / 2);
        }
    }

    @ObfuscatedName("i.dg(Ljava/lang/String;ZB)Z")
    public static boolean method1(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class168.method2023(arg0, Statics.field303);
        for (int var3 = 0; var3 < field569; var3++) {
            if (var2.equalsIgnoreCase(class168.method2023(field306[var3].field264, Statics.field303)) && (!arg1 || field306[var3].field275 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class168.method2023(Statics.field2137.field37, Statics.field303))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dl.dr(Ljava/lang/String;I)Z")
    public static boolean method2692(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class168.method2023(arg0, Statics.field303);
        for (int var2 = 0; var2 < field573; var2++) {
            class8 var3 = field528[var2];
            if (var1.equalsIgnoreCase(class168.method2023(var3.field149, Statics.field303))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class168.method2023(var3.field143, Statics.field303))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bi.dt(Ljava/lang/String;I)V")
    public static final void method1078(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field569 < 200 || field354 == 1) || field569 >= 400) {
            class12.method2280(30, "", class161.field2519);
            return;
        }
        String var1 = class168.method2023(arg0, Statics.field303);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field569; var2++) {
            class18 var3 = field306[var2];
            String var4 = class168.method2023(var3.field264, Statics.field303);
            if (var4 != null && var4.equals(var1)) {
                class12.method2280(30, "", arg0 + class161.field2520);
                return;
            }
            if (var3.field263 != null) {
                String var5 = class168.method2023(var3.field263, Statics.field303);
                if (var5 != null && var5.equals(var1)) {
                    class12.method2280(30, "", arg0 + class161.field2520);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field573; var6++) {
            class8 var7 = field528[var6];
            String var8 = class168.method2023(var7.field149, Statics.field303);
            if (var8 != null && var8.equals(var1)) {
                class12.method2280(30, "", class161.field2525 + arg0 + class161.field2526);
                return;
            }
            if (var7.field143 != null) {
                String var9 = class168.method2023(var7.field143, Statics.field303);
                if (var9 != null && var9.equals(var1)) {
                    class12.method2280(30, "", class161.field2525 + arg0 + class161.field2526);
                    return;
                }
            }
        }
        if (class168.method2023(Statics.field2137.field37, Statics.field303).equals(var1)) {
            class12.method2280(30, "", class161.field2601);
        } else {
            field379.method2661(5);
            field379.method2389(class123.method538(arg0));
            field379.method2395(arg0);
        }
    }

    @ObfuscatedName("av.df(Ljava/lang/String;B)V")
    public static final void method986(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class168.method2023(arg0, Statics.field303);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field569; var2++) {
            class18 var3 = field306[var2];
            String var4 = var3.field264;
            String var5 = class168.method2023(var4, Statics.field303);
            if (class133.method886(arg0, var1, var4, var5)) {
                field569--;
                for (int var6 = var2; var6 < field569; var6++) {
                    field306[var6] = field306[var6 + 1];
                }
                field494 = field486;
                field379.method2661(188);
                field379.method2389(class123.method538(arg0));
                field379.method2395(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("n.dx(Ljava/lang/String;I)V")
    public static final void method55(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class168.method2023(arg0, Statics.field303);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field573; var2++) {
            class8 var3 = field528[var2];
            String var4 = var3.field149;
            String var5 = class168.method2023(var4, Statics.field303);
            if (class133.method886(arg0, var1, var4, var5)) {
                field573--;
                for (int var6 = var2; var6 < field573; var6++) {
                    field528[var6] = field528[var6 + 1];
                }
                field494 = field486;
                field379.method2661(37);
                field379.method2389(class123.method538(arg0));
                field379.method2395(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("o.dw(Ljava/lang/String;II)V")
    public static final void method537(String arg0, int arg1) {
        field379.method2661(36);
        field379.method2389(class123.method538(arg0) + 1);
        field379.method2389(arg1);
        field379.method2395(arg0);
    }

    @ObfuscatedName("d.dc(Lfe;B)I")
    public static int method93(class177 arg0) {
        class205 var1 = (class205) field503.method3564(((long) arg0.field2803 << 32) + (long) arg0.field2804);
        return var1 == null ? arg0.field2909 : var1.field3160;
    }

    @ObfuscatedName("cw.du(Lfe;B)Z")
    public static boolean method1827(class177 arg0) {
        if (field471) {
            if (method93(arg0) != 0) {
                return false;
            }
            if (arg0.field2805 == 0) {
                return false;
            }
        }
        return arg0.field2823;
    }

    @ObfuscatedName("en.dm(Lfe;B)Ljava/lang/String;")
    public static String method2721(class177 arg0) {
        if (class182.method2866(method93(arg0)) == 0) {
            return null;
        } else if (arg0.field2882 == null || arg0.field2882.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2882;
        }
    }

    @ObfuscatedName("dw.dn(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2345(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field515 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field515 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field515 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field515 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field515 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field80 != null) {
            var3 = "/p=" + Statics.field80;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field311 + "/a=" + Statics.field345 + var3 + "/";
    }

    @ObfuscatedName("b.ds(Ljava/lang/String;I)V")
    public static void method555(String arg0) {
        Statics.field80 = arg0;
        try {
            String var1 = Statics.field2707.getParameter(class194.field3121.field3126);
            String var2 = Statics.field2707.getParameter(class194.field3124.field3126);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class119.method719() + 94608000000L;
                class115.field2004.setTime(new Date(var6));
                int var8 = class115.field2004.get(7);
                int var9 = class115.field2004.get(5);
                int var10 = class115.field2004.get(2);
                int var11 = class115.field2004.get(1);
                int var12 = class115.field2004.get(11);
                int var13 = class115.field2004.get(12);
                int var14 = class115.field2004.get(13);
                String var15 = class115.field2003[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class115.field2007[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field2707;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }
}

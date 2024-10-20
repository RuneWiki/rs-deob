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
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.k")
    public static boolean field272 = true;

    @ObfuscatedName("client.t")
    public static int field273 = 1;

    @ObfuscatedName("client.g")
    public static int field486 = 0;

    @ObfuscatedName("client.i")
    public static int field301 = 0;

    @ObfuscatedName("client.w")
    public static class108[] field334 = new class108[4];

    @ObfuscatedName("client.q")
    public static boolean field454 = false;

    @ObfuscatedName("client.f")
    public static boolean field278 = false;

    @ObfuscatedName("client.d")
    public static int field279 = 0;

    @ObfuscatedName("client.b")
    public static int field379 = 0;

    @ObfuscatedName("client.s")
    public static boolean field525 = true;

    @ObfuscatedName("client.v")
    public static int field285 = 0;

    @ObfuscatedName("client.j")
    public static long field286 = 1L;

    @ObfuscatedName("client.n")
    public static int field287 = -1;

    @ObfuscatedName("client.p")
    public static int field288 = -1;

    @ObfuscatedName("client.aj")
    public static int field289 = -1;

    @ObfuscatedName("client.aq")
    public static boolean field533 = true;

    @ObfuscatedName("client.aw")
    public static boolean field291 = false;

    @ObfuscatedName("client.az")
    public static int field300 = 0;

    @ObfuscatedName("client.at")
    public static int field293 = 0;

    @ObfuscatedName("client.af")
    public static int field294 = 0;

    @ObfuscatedName("client.ax")
    public static int field295 = 0;

    @ObfuscatedName("client.ac")
    public static int field296 = 0;

    @ObfuscatedName("client.am")
    public static int field297 = 0;

    @ObfuscatedName("client.ao")
    public static int field298 = 0;

    @ObfuscatedName("client.ad")
    public static int field299 = 0;

    @ObfuscatedName("client.ak")
    public static int field536 = 0;

    @ObfuscatedName("client.ai")
    public static class21 field490 = class21.field566;

    @ObfuscatedName("client.ar")
    public static int field302 = 0;

    @ObfuscatedName("client.ag")
    public static int field303 = 0;

    @ObfuscatedName("client.ab")
    public static int field438 = 0;

    @ObfuscatedName("client.br")
    public static int field306 = 0;

    @ObfuscatedName("client.bs")
    public static int field392 = 0;

    @ObfuscatedName("client.bv")
    public static int field308 = 0;

    @ObfuscatedName("client.bd")
    public static int field309 = 0;

    @ObfuscatedName("client.bp")
    public static int field446 = 0;

    @ObfuscatedName("client.cd")
    public static class35[] field312 = new class35[32768];

    @ObfuscatedName("client.co")
    public static int field313 = 0;

    @ObfuscatedName("client.cp")
    public static int[] field314 = new int[32768];

    @ObfuscatedName("client.ce")
    public static int field436 = 0;

    @ObfuscatedName("client.cm")
    public static int[] field538 = new int[250];

    @ObfuscatedName("client.cr")
    public static class122 field317 = new class122(5000);

    @ObfuscatedName("client.cq")
    public static class122 field557 = new class122(5000);

    @ObfuscatedName("client.cl")
    public static class122 field319 = new class122(5000);

    @ObfuscatedName("client.cs")
    public static int field320 = 0;

    @ObfuscatedName("client.cg")
    public static int field321 = 0;

    @ObfuscatedName("client.ci")
    public static int field363 = 0;

    @ObfuscatedName("client.cu")
    public static int field323 = 0;

    @ObfuscatedName("client.cb")
    public static int field331 = 0;

    @ObfuscatedName("client.cz")
    public static int field325 = 0;

    @ObfuscatedName("client.cc")
    public static int field326 = 0;

    @ObfuscatedName("client.cx")
    public static int field327 = 0;

    @ObfuscatedName("client.cv")
    public static boolean field552 = false;

    @ObfuscatedName("client.dj")
    public static int field329 = 0;

    @ObfuscatedName("client.dw")
    public static int field506 = 1;

    @ObfuscatedName("client.dr")
    public static int field499 = 0;

    @ObfuscatedName("client.dn")
    public static int field332 = 1;

    @ObfuscatedName("client.dc")
    public static int field333 = 0;

    @ObfuscatedName("client.dh")
    public static boolean field464 = false;

    @ObfuscatedName("client.dq")
    public static int[][][] field336 = new int[4][13][13];

    @ObfuscatedName("client.dg")
    public static final int[] field445 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.de")
    public static int field338 = 0;

    @ObfuscatedName("client.do")
    public static int field339 = 2;

    @ObfuscatedName("client.dx")
    public static int field340 = 0;

    @ObfuscatedName("client.dy")
    public static int field341 = 2;

    @ObfuscatedName("client.dd")
    public static int field369 = 0;

    @ObfuscatedName("client.dl")
    public static int field343 = 1;

    @ObfuscatedName("client.eo")
    public static int field378 = 0;

    @ObfuscatedName("client.eb")
    public static int field345 = 0;

    @ObfuscatedName("client.eg")
    public static int field346 = 2;

    @ObfuscatedName("client.el")
    public static int field347 = 0;

    @ObfuscatedName("client.ef")
    public static int field494 = 1;

    @ObfuscatedName("client.ex")
    public static int field349 = 0;

    @ObfuscatedName("client.ej")
    public static int field397 = 0;

    @ObfuscatedName("client.ei")
    public static int field355 = 2301979;

    @ObfuscatedName("client.eh")
    public static int field356 = 5063219;

    @ObfuscatedName("client.eu")
    public static int field357 = 3353893;

    @ObfuscatedName("client.ew")
    public static int field358 = 7759444;

    @ObfuscatedName("client.en")
    public static boolean field359 = false;

    @ObfuscatedName("client.ep")
    public static int field372 = 0;

    @ObfuscatedName("client.fe")
    public static int field435 = 128;

    @ObfuscatedName("client.fb")
    public static int field362 = 0;

    @ObfuscatedName("client.fu")
    public static int field350 = 0;

    @ObfuscatedName("client.fn")
    public static int field364 = 0;

    @ObfuscatedName("client.fq")
    public static int field315 = 0;

    @ObfuscatedName("client.fj")
    public static int field366 = 0;

    @ObfuscatedName("client.fm")
    public static int field427 = 50;

    @ObfuscatedName("client.ff")
    public static int field368 = 0;

    @ObfuscatedName("client.fc")
    public static boolean field276 = false;

    @ObfuscatedName("client.fo")
    public static int field542 = 0;

    @ObfuscatedName("client.fv")
    public static int field371 = 0;

    @ObfuscatedName("client.fs")
    public static int field367 = 50;

    @ObfuscatedName("client.fi")
    public static int[] field546 = new int[field367];

    @ObfuscatedName("client.fk")
    public static int[] field424 = new int[field367];

    @ObfuscatedName("client.fg")
    public static int[] field375 = new int[field367];

    @ObfuscatedName("client.fp")
    public static int[] field376 = new int[field367];

    @ObfuscatedName("client.fx")
    public static int[] field377 = new int[field367];

    @ObfuscatedName("client.fl")
    public static int[] field493 = new int[field367];

    @ObfuscatedName("client.fz")
    public static int[] field311 = new int[field367];

    @ObfuscatedName("client.gx")
    public static String[] field380 = new String[field367];

    @ObfuscatedName("client.gb")
    public static int[][] field381 = new int[104][104];

    @ObfuscatedName("client.ga")
    public static int field481 = 0;

    @ObfuscatedName("client.go")
    public static int field498 = -1;

    @ObfuscatedName("client.gf")
    public static int field549 = -1;

    @ObfuscatedName("client.gk")
    public static int field385 = 0;

    @ObfuscatedName("client.gp")
    public static int field386 = 0;

    @ObfuscatedName("client.gl")
    public static int field277 = 0;

    @ObfuscatedName("client.gh")
    public static int field521 = 0;

    @ObfuscatedName("client.gu")
    public static int field389 = 0;

    @ObfuscatedName("client.gg")
    public static int field390 = 0;

    @ObfuscatedName("client.gy")
    public static int field391 = 0;

    @ObfuscatedName("client.gi")
    public static int field510 = 0;

    @ObfuscatedName("client.gj")
    public static int field373 = 0;

    @ObfuscatedName("client.gd")
    public static int field394 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field395 = false;

    @ObfuscatedName("client.gs")
    public static int field365 = 0;

    @ObfuscatedName("client.gt")
    public static int field403 = 0;

    @ObfuscatedName("client.gn")
    public static class3[] field404 = new class3[2048];

    @ObfuscatedName("client.gr")
    public static int field399 = -1;

    @ObfuscatedName("client.gc")
    public static int field400 = 0;

    @ObfuscatedName("client.hh")
    public static int field401 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field304 = new int[1000];

    @ObfuscatedName("client.he")
    public static final int[] field393 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hm")
    public static String[] field444 = new String[8];

    @ObfuscatedName("client.hc")
    public static boolean[] field405 = new boolean[8];

    @ObfuscatedName("client.hd")
    public static int[] field406 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hk")
    public static int field548 = -1;

    @ObfuscatedName("client.hz")
    public static class199[][][] field408 = new class199[4][104][104];

    @ObfuscatedName("client.hx")
    public static class199 field409 = new class199();

    @ObfuscatedName("client.hn")
    public static class199 field423 = new class199();

    @ObfuscatedName("client.ht")
    public static class199 field411 = new class199();

    @ObfuscatedName("client.hq")
    public static int[] field412 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field413 = new int[25];

    @ObfuscatedName("client.hf")
    public static int[] field414 = new int[25];

    @ObfuscatedName("client.hl")
    public static int field271 = 0;

    @ObfuscatedName("client.hu")
    public static boolean field416 = false;

    @ObfuscatedName("client.hy")
    public static int field342 = 0;

    @ObfuscatedName("client.hs")
    public static int[] field418 = new int[500];

    @ObfuscatedName("client.hr")
    public static int[] field419 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field420 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field344 = new int[500];

    @ObfuscatedName("client.ig")
    public static String[] field396 = new String[500];

    @ObfuscatedName("client.in")
    public static String[] field281 = new String[500];

    @ObfuscatedName("client.ik")
    public static int field318 = -1;

    @ObfuscatedName("client.id")
    public static int field513 = -1;

    @ObfuscatedName("client.if")
    public static int field426 = 0;

    @ObfuscatedName("client.ip")
    public static int field348 = 50;

    @ObfuscatedName("client.iy")
    public static int field428 = 0;

    @ObfuscatedName("client.ih")
    public static String field429 = null;

    @ObfuscatedName("client.iv")
    public static boolean field430 = false;

    @ObfuscatedName("client.ij")
    public static int field431 = -1;

    @ObfuscatedName("client.im")
    public static int field432 = -1;

    @ObfuscatedName("client.is")
    public static String field433 = null;

    @ObfuscatedName("client.iz")
    public static String field434 = null;

    @ObfuscatedName("client.it")
    public static int field284 = -1;

    @ObfuscatedName("client.ia")
    public static class196 field421 = new class196(8);

    @ObfuscatedName("client.il")
    public static int field468 = 0;

    @ObfuscatedName("client.js")
    public static int field504 = 0;

    @ObfuscatedName("client.jf")
    public static class173 field439 = null;

    @ObfuscatedName("client.jp")
    public static int field440 = 0;

    @ObfuscatedName("client.jo")
    public static int field441 = 0;

    @ObfuscatedName("client.jg")
    public static int field442 = 0;

    @ObfuscatedName("client.jz")
    public static int field360 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field437 = false;

    @ObfuscatedName("client.jk")
    public static boolean field410 = false;

    @ObfuscatedName("client.jl")
    public static boolean field507 = false;

    @ObfuscatedName("client.ju")
    public static class173 field447 = null;

    @ObfuscatedName("client.jn")
    public static class173 field528 = null;

    @ObfuscatedName("client.jx")
    public static class173 field449 = null;

    @ObfuscatedName("client.jm")
    public static int field450 = 0;

    @ObfuscatedName("client.jq")
    public static int field451 = 0;

    @ObfuscatedName("client.jt")
    public static class173 field452 = null;

    @ObfuscatedName("client.jr")
    public static boolean field453 = false;

    @ObfuscatedName("client.ja")
    public static int field484 = -1;

    @ObfuscatedName("client.jw")
    public static int field455 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field456 = false;

    @ObfuscatedName("client.je")
    public static int field457 = -1;

    @ObfuscatedName("client.jc")
    public static int field415 = -1;

    @ObfuscatedName("client.ji")
    public static boolean field459 = false;

    @ObfuscatedName("client.kh")
    public static int field460 = 1;

    @ObfuscatedName("client.kf")
    public static int[] field461 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field540 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field463 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field382 = 0;

    @ObfuscatedName("client.kn")
    public static int[] field384 = new int[32];

    @ObfuscatedName("client.km")
    public static int field466 = 0;

    @ObfuscatedName("client.ku")
    public static int field467 = 0;

    @ObfuscatedName("client.ka")
    public static int field324 = 0;

    @ObfuscatedName("client.kc")
    public static int field469 = 0;

    @ObfuscatedName("client.kk")
    public static int field470 = 0;

    @ObfuscatedName("client.kp")
    public static int field471 = 0;

    @ObfuscatedName("client.kj")
    public static int field472 = 0;

    @ObfuscatedName("client.kv")
    public static int field473 = 0;

    @ObfuscatedName("client.kz")
    public static class199 field458 = new class199();

    @ObfuscatedName("client.ky")
    public static class199 field475 = new class199();

    @ObfuscatedName("client.ke")
    public static class199 field476 = new class199();

    @ObfuscatedName("client.kg")
    public static class196 field477 = new class196(512);

    @ObfuscatedName("client.ks")
    public static int field478 = 0;

    @ObfuscatedName("client.kx")
    public static int field290 = -2;

    @ObfuscatedName("client.ko")
    public static boolean[] field480 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field511 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static boolean[] field482 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static int[] field483 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field322 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field485 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.lq")
    public static int field370 = 0;

    @ObfuscatedName("client.li")
    public static long field488 = 0L;

    @ObfuscatedName("client.lm")
    public static boolean field489 = true;

    @ObfuscatedName("client.lt")
    public static int field448 = 1;

    @ObfuscatedName("client.ll")
    public static int field425 = 1;

    @ObfuscatedName("client.lr")
    public static int[] field351 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lf")
    public static int field328 = 0;

    @ObfuscatedName("client.ls")
    public static int field280 = 0;

    @ObfuscatedName("client.lz")
    public static String field422 = "";

    @ObfuscatedName("client.ln")
    public static long[] field496 = new long[100];

    @ObfuscatedName("client.lo")
    public static int field497 = 0;

    @ObfuscatedName("client.ld")
    public static int field417 = 0;

    @ObfuscatedName("client.ly")
    public static int[] field479 = new int[128];

    @ObfuscatedName("client.mr")
    public static int[] field500 = new int[128];

    @ObfuscatedName("client.mi")
    public static long field501 = -1L;

    @ObfuscatedName("client.ms")
    public static String field502 = null;

    @ObfuscatedName("client.mx")
    public static String field503 = null;

    @ObfuscatedName("client.mf")
    public static int field310 = -1;

    @ObfuscatedName("client.mn")
    public static int field505 = 0;

    @ObfuscatedName("client.mu")
    public static int[] field307 = new int[1000];

    @ObfuscatedName("client.ml")
    public static int[] field487 = new int[1000];

    @ObfuscatedName("client.md")
    public static class79[] field398 = new class79[1000];

    @ObfuscatedName("client.mo")
    public static int field523 = 0;

    @ObfuscatedName("client.mh")
    public static int field492 = 0;

    @ObfuscatedName("client.my")
    public static int field474 = 0;

    @ObfuscatedName("client.mg")
    public static int field512 = 255;

    @ObfuscatedName("client.mz")
    public static int field462 = -1;

    @ObfuscatedName("client.mb")
    public static boolean field514 = false;

    @ObfuscatedName("client.ng")
    public static int field515 = 127;

    @ObfuscatedName("client.ne")
    public static int field516 = 127;

    @ObfuscatedName("client.nr")
    public static int field517 = 0;

    @ObfuscatedName("client.nm")
    public static int[] field518 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field519 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field520 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field282 = new int[50];

    @ObfuscatedName("client.nu")
    public static class59[] field522 = new class59[50];

    @ObfuscatedName("client.nj")
    public static boolean field508 = false;

    @ObfuscatedName("client.nf")
    public static boolean[] field374 = new boolean[5];

    @ObfuscatedName("client.or")
    public static int[] field465 = new int[5];

    @ObfuscatedName("client.oz")
    public static int[] field526 = new int[5];

    @ObfuscatedName("client.og")
    public static int[] field527 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field292 = new int[5];

    @ObfuscatedName("client.ot")
    public static short field529 = 256;

    @ObfuscatedName("client.oi")
    public static short field388 = 205;

    @ObfuscatedName("client.oa")
    public static short field531 = 256;

    @ObfuscatedName("client.ob")
    public static short field532 = 320;

    @ObfuscatedName("client.ol")
    public static short field330 = 1;

    @ObfuscatedName("client.of")
    public static short field337 = 32767;

    @ObfuscatedName("client.on")
    public static short field535 = 1;

    @ObfuscatedName("client.oy")
    public static short field551 = 32767;

    @ObfuscatedName("client.ou")
    public static int field537 = 0;

    @ObfuscatedName("client.oo")
    public static int field534 = 0;

    @ObfuscatedName("client.os")
    public static int field316 = 0;

    @ObfuscatedName("client.oe")
    public static int field550 = 0;

    @ObfuscatedName("client.oj")
    public static int field541 = 0;

    @ObfuscatedName("client.oc")
    public static int field335 = 0;

    @ObfuscatedName("client.oq")
    public static int field543 = 0;

    @ObfuscatedName("client.od")
    public static class18[] field544 = new class18[400];

    @ObfuscatedName("client.op")
    public static class195 field545 = new class195();

    @ObfuscatedName("client.ok")
    public static int field274 = 0;

    @ObfuscatedName("client.ox")
    public static class8[] field547 = new class8[400];

    @ObfuscatedName("client.ov")
    public static class179 field402 = new class179();

    @ObfuscatedName("client.pg")
    public static int field283 = -1;

    @ObfuscatedName("client.pk")
    public static int field539 = -1;

    @ObfuscatedName("client.pb")
    public static class220[] field524 = new class220[8];

    @ObfuscatedName("client.pu")
    public static long field407 = -1L;

    @ObfuscatedName("client.px")
    public static long field553 = -1L;

    @ObfuscatedName("client.pq")
    public static final class11 field554 = new class11();

    @ObfuscatedName("client.ps")
    public static int[] field555 = new int[50];

    @ObfuscatedName("client.pa")
    public static int[] field556 = new int[50];

    @ObfuscatedName("client.h(I)V")
    public final void method229() {
    }

    public final void init() {
        if (!this.method2784()) {
            return;
        }
        class190[] var1 = class190.method3114();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class190 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3048);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3048)) {
                    case 1:
                        Statics.field443 = Integer.parseInt(var4);
                        break;
                    case 2:
                        field486 = Integer.parseInt(var4);
                    case 3:
                    case 9:
                    case 14:
                    default:
                        break;
                    case 4:
                        Statics.field158 = var4;
                        break;
                    case 5:
                        int var5 = Integer.parseInt(var4);
                        class153[] var6 = class153.method2158();
                        int var7 = 0;
                        class153 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class153 var8 = var6[var7];
                            if (var8.field2250 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field275 = var9;
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field26)) {
                            field454 = true;
                        } else {
                            field454 = false;
                        }
                        break;
                    case 7:
                        Statics.field383 = var4;
                        break;
                    case 8:
                        field273 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field509 = Integer.parseInt(var4);
                        break;
                    case 11:
                        field301 = Integer.parseInt(var4);
                        break;
                    case 12:
                        class154[] var10 = new class154[] { class154.field2259, class154.field2256, class154.field2263, class154.field2258, class154.field2257, class154.field2260 };
                        Statics.field591 = (class154) class109.method2565(var10, Integer.parseInt(var4));
                        if (Statics.field591 == class154.field2259) {
                            Statics.field1742 = class212.field3113;
                        } else {
                            Statics.field1742 = class212.field3110;
                        }
                        break;
                    case 13:
                        field279 = Integer.parseInt(var4);
                        break;
                    case 15:
                        if (var4.equalsIgnoreCase(class2.field26)) {
                        }
                }
            }
        }
        method613();
        Statics.field660 = this.getCodeBase().getHost();
        String var11 = Statics.field275.field2249;
        byte var12 = 0;
        try {
            class149.method177("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class148.method2598((String) null, var14);
        }
        Statics.field3099 = this;
        this.method2789(765, 503, 89);
    }

    @ObfuscatedName("p.t(I)V")
    public static final void method613() {
        class86.field1442 = false;
        field278 = false;
    }

    @ObfuscatedName("client.g(I)V")
    public final void method231() {
        Statics.field787 = field301 == 0 ? 43594 : field273 + 40000;
        Statics.field20 = field301 == 0 ? 443 : field273 + 50000;
        Statics.field2896 = Statics.field787;
        Statics.field2904 = class174.field2879;
        Statics.field2905 = class174.field2875;
        Statics.field2037 = class174.field2874;
        Statics.field1931 = class174.field2877;
        if (Statics.field2066.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2095[44] = 71;
            class137.field2095[45] = 26;
            class137.field2095[46] = 72;
            class137.field2095[47] = 73;
            class137.field2095[59] = 57;
            class137.field2095[61] = 27;
            class137.field2095[91] = 42;
            class137.field2095[92] = 74;
            class137.field2095[93] = 43;
            class137.field2095[192] = 28;
            class137.field2095[222] = 58;
            class137.field2095[520] = 59;
        } else {
            class137.field2095[186] = 57;
            class137.field2095[187] = 27;
            class137.field2095[188] = 71;
            class137.field2095[189] = 26;
            class137.field2095[190] = 72;
            class137.field2095[191] = 73;
            class137.field2095[192] = 58;
            class137.field2095[219] = 42;
            class137.field2095[220] = 74;
            class137.field2095[221] = 43;
            class137.field2095[222] = 59;
            class137.field2095[223] = 28;
        }
        Canvas var1 = Statics.field1839;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2087);
        var1.addFocusListener(class137.field2087);
        Canvas var2 = Statics.field1839;
        var2.addMouseListener(class140.field2114);
        var2.addMouseMotionListener(class140.field2114);
        var2.addFocusListener(class140.field2114);
        Statics.field29 = class131.method2606();
        if (Statics.field29 != null) {
            Statics.field29.method2614(Statics.field1839);
        }
        Statics.field131 = new class134(255, class149.field2204, class149.field2205, 500000);
        class227 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class149.method1999("", Statics.field591.field2262, false);
            byte[] var5 = new byte[(int) var3.method3824()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3827(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class119(var5));
        } catch (Exception var15) {
        }
        try {
            if (var3 != null) {
                var3.method3826();
            }
        } catch (Exception var14) {
        }
        Statics.field2046 = var4;
        Statics.field1060 = this.getToolkit().getSystemClipboard();
        String var12 = Statics.field733;
        class138.field2103 = this;
        class138.field2105 = var12;
        if (field301 != 0) {
            field291 = true;
        }
        int var13 = Statics.field2046.field140;
        field488 = 0L;
        if (var13 >= 2) {
            field489 = true;
        } else {
            field489 = false;
        }
        method611();
        if (field379 >= 25) {
            field317.method2544(160);
            field317.method2276(method591());
            field317.method2451(Statics.field1604);
            field317.method2451(Statics.field776);
        }
        field2171 = true;
    }

    @ObfuscatedName("client.o(I)V")
    public final void method232() {
        field285++;
        this.method235();
        while (true) {
            class199 var1 = class170.field2694;
            class169 var2;
            synchronized (class170.field2694) {
                var2 = (class169) class170.field2692.method3556();
            }
            if (var2 == null) {
                try {
                    if (class183.field2940 == 1) {
                        int var4 = Statics.field2936.method3361();
                        if (var4 > 0 && Statics.field2936.method3367()) {
                            int var5 = var4 - Statics.field1162;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2936.method3453(var5);
                        } else {
                            Statics.field2936.method3366();
                            Statics.field2936.method3364();
                            if (Statics.field2941 == null) {
                                class183.field2940 = 0;
                            } else {
                                class183.field2940 = 2;
                            }
                            Statics.field2943 = null;
                            Statics.field2888 = null;
                        }
                    }
                } catch (Exception var611) {
                    var611.printStackTrace();
                    Statics.field2936.method3366();
                    class183.field2940 = 0;
                    Statics.field2943 = null;
                    Statics.field2888 = null;
                    Statics.field2941 = null;
                }
                method565();
                class137 var7 = class137.field2087;
                synchronized (class137.field2087) {
                    class137.field2089++;
                    class137.field2091 = class137.field2093;
                    class137.field2090 = 0;
                    if (class137.field2086 >= 0) {
                        while (class137.field2086 != class137.field2085) {
                            int var9 = class137.field2094[class137.field2085];
                            class137.field2085 = class137.field2085 + 1 & 0x7F;
                            if (var9 < 0) {
                                class137.field2075[~var9] = false;
                            } else {
                                if (!class137.field2075[var9] && class137.field2090 < class137.field2069.length - 1) {
                                    class137.field2069[++class137.field2090 - 1] = var9;
                                }
                                class137.field2075[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class137.field2075[var8] = false;
                        }
                        class137.field2086 = class137.field2085;
                    }
                    class137.field2093 = class137.field2092;
                }
                class140.method2604();
                if (Statics.field29 != null) {
                    int var11 = Statics.field29.method2616();
                    field473 = var11;
                }
                int var10002;
                if (field379 == 0) {
                    method227();
                    class144.method1998();
                } else if (field379 == 5) {
                    class32.method564(this);
                    method227();
                    class144.method1998();
                } else if (field379 == 10 || field379 == 11) {
                    class32.method564(this);
                } else if (field379 == 20) {
                    class32.method564(this);
                    method2211();
                } else if (field379 == 25) {
                    method957(false);
                    field329 = 0;
                    boolean var12 = true;
                    for (int var13 = 0; var13 < Statics.field1097.length; var13++) {
                        if (Statics.field709[var13] != -1 && Statics.field1097[var13] == null) {
                            Statics.field1097[var13] = Statics.field169.method2994(Statics.field709[var13], 0);
                            if (Statics.field1097[var13] == null) {
                                var12 = false;
                                field329++;
                            }
                        }
                        if (Statics.field791[var13] != -1 && Statics.field34[var13] == null) {
                            Statics.field34[var13] = Statics.field169.method2995(Statics.field791[var13], 0, Statics.field1601[var13]);
                            if (Statics.field34[var13] == null) {
                                var12 = false;
                                field329++;
                            }
                        }
                    }
                    if (var12) {
                        field499 = 0;
                        boolean var14 = true;
                        for (int var15 = 0; var15 < Statics.field1097.length; var15++) {
                            byte[] var16 = Statics.field34[var15];
                            if (var16 != null) {
                                int var17 = (Statics.field1734[var15] >> 8) * 64 - Statics.field14;
                                int var18 = (Statics.field1734[var15] & 0xFF) * 64 - Statics.field1436;
                                if (field464) {
                                    var17 = 10;
                                    var18 = 10;
                                }
                                boolean var20 = true;
                                class119 var21 = new class119(var16);
                                int var22 = -1;
                                label3560: while (true) {
                                    int var23 = var21.method2301();
                                    if (var23 == 0) {
                                        var14 &= var20;
                                        break;
                                    }
                                    var22 += var23;
                                    int var24 = 0;
                                    boolean var25 = false;
                                    while (true) {
                                        while (!var25) {
                                            int var27 = var21.method2301();
                                            if (var27 == 0) {
                                                continue label3560;
                                            }
                                            var24 += var27 - 1;
                                            int var28 = var24 & 0x3F;
                                            int var29 = var24 >> 6 & 0x3F;
                                            int var30 = var21.method2291() >> 2;
                                            int var31 = var17 + var29;
                                            int var32 = var18 + var28;
                                            if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                                                class41 var33 = class41.method2760(var22);
                                                if (var30 != 22 || !field278 || var33.field942 != 0 || var33.field974 == 1 || var33.field961) {
                                                    if (!var33.method756()) {
                                                        field499++;
                                                        var20 = false;
                                                    }
                                                    var25 = true;
                                                }
                                            }
                                        }
                                        int var26 = var21.method2301();
                                        if (var26 == 0) {
                                            break;
                                        }
                                        var21.method2291();
                                    }
                                }
                            }
                        }
                        if (var14) {
                            if (field333 != 0) {
                                method2225(class157.field2295 + class2.field18 + class2.field21 + 100 + "%" + class2.field22, true);
                            }
                            method565();
                            method2203();
                            method565();
                            Statics.field1976.method1735();
                            method565();
                            System.gc();
                            for (int var35 = 0; var35 < 4; var35++) {
                                field334[var35].method2202();
                            }
                            for (int var36 = 0; var36 < 4; var36++) {
                                for (int var37 = 0; var37 < 104; var37++) {
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        class6.field78[var36][var37][var38] = 0;
                                    }
                                }
                            }
                            method565();
                            class6.method2755();
                            int var39 = Statics.field1097.length;
                            for (class24 var40 = (class24) class24.field607.method3558(); var40 != null; var40 = (class24) class24.field607.method3554()) {
                                if (var40.field604 != null) {
                                    Statics.field198.method1093(var40.field604);
                                    var40.field604 = null;
                                }
                                if (var40.field611 != null) {
                                    Statics.field198.method1093(var40.field611);
                                    var40.field611 = null;
                                }
                            }
                            class24.field607.method3560();
                            method957(true);
                            if (!field464) {
                                for (int var41 = 0; var41 < var39; var41++) {
                                    int var42 = (Statics.field1734[var41] >> 8) * 64 - Statics.field14;
                                    int var43 = (Statics.field1734[var41] & 0xFF) * 64 - Statics.field1436;
                                    byte[] var44 = Statics.field1097[var41];
                                    if (var44 != null) {
                                        method565();
                                        class6.method947(var44, var42, var43, Statics.field206 * 8 - 48, Statics.field2984 * 8 - 48, field334);
                                    }
                                }
                                for (int var45 = 0; var45 < var39; var45++) {
                                    int var46 = (Statics.field1734[var45] >> 8) * 64 - Statics.field14;
                                    int var47 = (Statics.field1734[var45] & 0xFF) * 64 - Statics.field1436;
                                    byte[] var48 = Statics.field1097[var45];
                                    if (var48 == null && Statics.field2984 < 800) {
                                        method565();
                                        class6.method150(var46, var47, 64, 64);
                                    }
                                }
                                method957(true);
                                for (int var49 = 0; var49 < var39; var49++) {
                                    byte[] var50 = Statics.field34[var49];
                                    if (var50 != null) {
                                        int var51 = (Statics.field1734[var49] >> 8) * 64 - Statics.field14;
                                        int var52 = (Statics.field1734[var49] & 0xFF) * 64 - Statics.field1436;
                                        method565();
                                        class86 var53 = Statics.field1976;
                                        class108[] var54 = field334;
                                        class119 var55 = new class119(var50);
                                        int var56 = -1;
                                        while (true) {
                                            int var57 = var55.method2301();
                                            if (var57 == 0) {
                                                break;
                                            }
                                            var56 += var57;
                                            int var58 = 0;
                                            while (true) {
                                                int var59 = var55.method2301();
                                                if (var59 == 0) {
                                                    break;
                                                }
                                                var58 += var59 - 1;
                                                int var60 = var58 & 0x3F;
                                                int var61 = var58 >> 6 & 0x3F;
                                                int var62 = var58 >> 12;
                                                int var63 = var55.method2291();
                                                int var64 = var63 >> 2;
                                                int var65 = var63 & 0x3;
                                                int var66 = var51 + var61;
                                                int var67 = var52 + var60;
                                                if (var66 > 0 && var67 > 0 && var66 < 103 && var67 < 103) {
                                                    int var68 = var62;
                                                    if ((class6.field78[1][var66][var67] & 0x2) == 2) {
                                                        var68 = var62 - 1;
                                                    }
                                                    class108 var69 = null;
                                                    if (var68 >= 0) {
                                                        var69 = var54[var68];
                                                    }
                                                    class6.method960(var62, var66, var67, var56, var65, var64, var53, var69);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field464) {
                                int var70 = 0;
                                label3459: while (true) {
                                    if (var70 >= 4) {
                                        for (int var81 = 0; var81 < 13; var81++) {
                                            for (int var82 = 0; var82 < 13; var82++) {
                                                int var83 = field336[0][var81][var82];
                                                if (var83 == -1) {
                                                    class6.method150(var81 * 8, var82 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method957(true);
                                        int var84 = 0;
                                        while (true) {
                                            if (var84 >= 4) {
                                                break label3459;
                                            }
                                            method565();
                                            for (int var85 = 0; var85 < 13; var85++) {
                                                for (int var86 = 0; var86 < 13; var86++) {
                                                    int var87 = field336[var84][var85][var86];
                                                    if (var87 != -1) {
                                                        int var88 = var87 >> 24 & 0x3;
                                                        int var89 = var87 >> 1 & 0x3;
                                                        int var90 = var87 >> 14 & 0x3FF;
                                                        int var91 = var87 >> 3 & 0x7FF;
                                                        int var92 = (var90 / 8 << 8) + var91 / 8;
                                                        for (int var93 = 0; var93 < Statics.field1734.length; var93++) {
                                                            if (Statics.field1734[var93] == var92 && Statics.field34[var93] != null) {
                                                                class6.method687(Statics.field34[var93], var84, var85 * 8, var86 * 8, var88, (var90 & 0x7) * 8, (var91 & 0x7) * 8, var89, Statics.field1976, field334);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var84++;
                                        }
                                    }
                                    method565();
                                    for (int var71 = 0; var71 < 13; var71++) {
                                        for (int var72 = 0; var72 < 13; var72++) {
                                            boolean var73 = false;
                                            int var74 = field336[var70][var71][var72];
                                            if (var74 != -1) {
                                                int var75 = var74 >> 24 & 0x3;
                                                int var76 = var74 >> 1 & 0x3;
                                                int var77 = var74 >> 14 & 0x3FF;
                                                int var78 = var74 >> 3 & 0x7FF;
                                                int var79 = (var77 / 8 << 8) + var78 / 8;
                                                for (int var80 = 0; var80 < Statics.field1734.length; var80++) {
                                                    if (Statics.field1734[var80] == var79 && Statics.field1097[var80] != null) {
                                                        class6.method633(Statics.field1097[var80], var70, var71 * 8, var72 * 8, var75, (var77 & 0x7) * 8, (var78 & 0x7) * 8, var76, field334);
                                                        var73 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var73) {
                                                class6.method1456(var70, var71 * 8, var72 * 8);
                                            }
                                        }
                                    }
                                    var70++;
                                }
                            }
                            method957(true);
                            method2203();
                            method565();
                            class86 var94 = Statics.field1976;
                            class108[] var95 = field334;
                            for (int var96 = 0; var96 < 4; var96++) {
                                for (int var97 = 0; var97 < 104; var97++) {
                                    for (int var98 = 0; var98 < 104; var98++) {
                                        if ((class6.field78[var96][var97][var98] & 0x1) == 1) {
                                            int var99 = var96;
                                            if ((class6.field78[1][var97][var98] & 0x2) == 2) {
                                                var99 = var96 - 1;
                                            }
                                            if (var99 >= 0) {
                                                var95[var99].method2169(var97, var98);
                                            }
                                        }
                                    }
                                }
                            }
                            class6.field86 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field86 < -8) {
                                class6.field86 = -8;
                            }
                            if (class6.field86 > 8) {
                                class6.field86 = 8;
                            }
                            class6.field87 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field87 < -16) {
                                class6.field87 = -16;
                            }
                            if (class6.field87 > 16) {
                                class6.field87 = 16;
                            }
                            for (int var100 = 0; var100 < 4; var100++) {
                                byte[][] var101 = Statics.field2057[var100];
                                int var102 = (int) Math.sqrt(5100.0D);
                                int var103 = var102 * 768 >> 8;
                                for (int var104 = 1; var104 < 103; var104++) {
                                    for (int var105 = 1; var105 < 103; var105++) {
                                        int var106 = class6.field85[var100][var105 + 1][var104] - class6.field85[var100][var105 - 1][var104];
                                        int var107 = class6.field85[var100][var105][var104 + 1] - class6.field85[var100][var105][var104 - 1];
                                        int var108 = (int) Math.sqrt((double) (var107 * var107 + var106 * var106 + 65536));
                                        int var109 = (var106 << 8) / var108;
                                        int var110 = 65536 / var108;
                                        int var111 = (var107 << 8) / var108;
                                        int var112 = (var111 * -50 + var109 * -50 + var110 * -10) / var103 + 96;
                                        int var113 = (var101[var105][var104] >> 1) + (var101[var105][var104 + 1] >> 3) + (var101[var105][var104 - 1] >> 2) + (var101[var105 - 1][var104] >> 2) + (var101[var105 + 1][var104] >> 3);
                                        Statics.field250[var105][var104] = var112 - var113;
                                    }
                                }
                                for (int var114 = 0; var114 < 104; var114++) {
                                    Statics.field1069[var114] = 0;
                                    Statics.field214[var114] = 0;
                                    Statics.field1988[var114] = 0;
                                    Statics.field1085[var114] = 0;
                                    Statics.field782[var114] = 0;
                                }
                                for (int var115 = -5; var115 < 109; var115++) {
                                    for (int var116 = 0; var116 < 104; var116++) {
                                        int var117 = var115 + 5;
                                        if (var117 >= 0 && var117 < 104) {
                                            int var118 = Statics.field76[var100][var117][var116] & 0xFF;
                                            if (var118 > 0) {
                                                int var119 = var118 - 1;
                                                class42 var120 = (class42) class42.field982.method3485((long) var119);
                                                class42 var121;
                                                if (var120 == null) {
                                                    byte[] var122 = Statics.field977.method2994(1, var119);
                                                    class42 var123 = new class42();
                                                    if (var122 != null) {
                                                        var123.method806(new class119(var122), var119);
                                                    }
                                                    var123.method803();
                                                    class42.field982.method3487(var123, (long) var119);
                                                    var121 = var123;
                                                } else {
                                                    var121 = var120;
                                                }
                                                Statics.field1069[var116] += var121.field978;
                                                Statics.field214[var116] += var121.field981;
                                                Statics.field1988[var116] += var121.field980;
                                                Statics.field1085[var116] += var121.field983;
                                                var10002 = Statics.field782[var116]++;
                                            }
                                        }
                                        int var125 = var115 - 5;
                                        if (var125 >= 0 && var125 < 104) {
                                            int var126 = Statics.field76[var100][var125][var116] & 0xFF;
                                            if (var126 > 0) {
                                                int var127 = var126 - 1;
                                                class42 var128 = (class42) class42.field982.method3485((long) var127);
                                                class42 var129;
                                                if (var128 == null) {
                                                    byte[] var130 = Statics.field977.method2994(1, var127);
                                                    class42 var131 = new class42();
                                                    if (var130 != null) {
                                                        var131.method806(new class119(var130), var127);
                                                    }
                                                    var131.method803();
                                                    class42.field982.method3487(var131, (long) var127);
                                                    var129 = var131;
                                                } else {
                                                    var129 = var128;
                                                }
                                                Statics.field1069[var116] -= var129.field978;
                                                Statics.field214[var116] -= var129.field981;
                                                Statics.field1988[var116] -= var129.field980;
                                                Statics.field1085[var116] -= var129.field983;
                                                var10002 = Statics.field782[var116]--;
                                            }
                                        }
                                    }
                                    if (var115 >= 1 && var115 < 103) {
                                        int var133 = 0;
                                        int var134 = 0;
                                        int var135 = 0;
                                        int var136 = 0;
                                        int var137 = 0;
                                        for (int var138 = -5; var138 < 109; var138++) {
                                            int var139 = var138 + 5;
                                            if (var139 >= 0 && var139 < 104) {
                                                var133 += Statics.field1069[var139];
                                                var134 += Statics.field214[var139];
                                                var135 += Statics.field1988[var139];
                                                var136 += Statics.field1085[var139];
                                                var137 += Statics.field782[var139];
                                            }
                                            int var140 = var138 - 5;
                                            if (var140 >= 0 && var140 < 104) {
                                                var133 -= Statics.field1069[var140];
                                                var134 -= Statics.field214[var140];
                                                var135 -= Statics.field1988[var140];
                                                var136 -= Statics.field1085[var140];
                                                var137 -= Statics.field782[var140];
                                            }
                                            if (var138 >= 1 && var138 < 103 && (!field278 || (class6.field78[0][var115][var138] & 0x2) != 0 || (class6.field78[var100][var115][var138] & 0x10) == 0)) {
                                                if (var100 < class6.field90) {
                                                    class6.field90 = var100;
                                                }
                                                int var141 = Statics.field76[var100][var115][var138] & 0xFF;
                                                int var142 = Statics.field77[var100][var115][var138] & 0xFF;
                                                if (var141 > 0 || var142 > 0) {
                                                    int var143 = class6.field85[var100][var115][var138];
                                                    int var144 = class6.field85[var100][var115 + 1][var138];
                                                    int var145 = class6.field85[var100][var115 + 1][var138 + 1];
                                                    int var146 = class6.field85[var100][var115][var138 + 1];
                                                    int var147 = Statics.field250[var115][var138];
                                                    int var148 = Statics.field250[var115 + 1][var138];
                                                    int var149 = Statics.field250[var115 + 1][var138 + 1];
                                                    int var150 = Statics.field250[var115][var138 + 1];
                                                    int var151 = -1;
                                                    int var152 = -1;
                                                    if (var141 > 0) {
                                                        int var153 = var133 * 256 / var136;
                                                        int var154 = var134 / var137;
                                                        int var155 = var135 / var137;
                                                        var151 = class6.method3475(var153, var154, var155);
                                                        int var156 = class6.field86 + var153 & 0xFF;
                                                        int var157 = class6.field87 + var155;
                                                        if (var157 < 0) {
                                                            var157 = 0;
                                                        } else if (var157 > 255) {
                                                            var157 = 255;
                                                        }
                                                        var152 = class6.method3475(var156, var154, var157);
                                                    }
                                                    if (var100 > 0) {
                                                        boolean var158 = true;
                                                        if (var141 == 0 && Statics.field73[var100][var115][var138] != 0) {
                                                            var158 = false;
                                                        }
                                                        if (var142 > 0 && !class47.method9(var142 - 1).field1059) {
                                                            var158 = false;
                                                        }
                                                        if (var158 && var143 == var144 && var143 == var145 && var143 == var146) {
                                                            Statics.field2243[var100][var115][var138] |= 0x924;
                                                        }
                                                    }
                                                    int var159 = 0;
                                                    if (var152 != -1) {
                                                        var159 = class91.field1562[class6.method2761(var152, 96)];
                                                    }
                                                    if (var142 == 0) {
                                                        var94.method1740(var100, var115, var138, 0, 0, -1, var143, var144, var145, var146, class6.method2761(var151, var147), class6.method2761(var151, var148), class6.method2761(var151, var149), class6.method2761(var151, var150), 0, 0, 0, 0, var159, 0);
                                                    } else {
                                                        int var160 = Statics.field73[var100][var115][var138] + 1;
                                                        byte var161 = Statics.field79[var100][var115][var138];
                                                        class47 var162 = class47.method9(var142 - 1);
                                                        int var163 = var162.field1044;
                                                        int var164;
                                                        int var165;
                                                        if (var163 >= 0) {
                                                            var164 = Statics.field1563.method1963(var163);
                                                            var165 = -1;
                                                        } else if (var162.field1046 == 16711935) {
                                                            var165 = -2;
                                                            var163 = -1;
                                                            var164 = -2;
                                                        } else {
                                                            var165 = class6.method3475(var162.field1050, var162.field1055, var162.field1052);
                                                            int var166 = class6.field86 + var162.field1050 & 0xFF;
                                                            int var167 = class6.field87 + var162.field1052;
                                                            if (var167 < 0) {
                                                                var167 = 0;
                                                            } else if (var167 > 255) {
                                                                var167 = 255;
                                                            }
                                                            var164 = class6.method3475(var166, var162.field1055, var167);
                                                        }
                                                        int var168 = 0;
                                                        if (var164 != -2) {
                                                            var168 = class91.field1562[class6.method35(var164, 96)];
                                                        }
                                                        if (var162.field1049 != -1) {
                                                            int var169 = class6.field86 + var162.field1053 & 0xFF;
                                                            int var170 = class6.field87 + var162.field1047;
                                                            if (var170 < 0) {
                                                                var170 = 0;
                                                            } else if (var170 > 255) {
                                                                var170 = 255;
                                                            }
                                                            int var171 = class6.method3475(var169, var162.field1054, var170);
                                                            var168 = class91.field1562[class6.method35(var171, 96)];
                                                        }
                                                        var94.method1740(var100, var115, var138, var160, var161, var163, var143, var144, var145, var146, class6.method2761(var151, var147), class6.method2761(var151, var148), class6.method2761(var151, var149), class6.method2761(var151, var150), class6.method35(var165, var147), class6.method35(var165, var148), class6.method35(var165, var149), class6.method35(var165, var150), var159, var168);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var172 = 1; var172 < 103; var172++) {
                                    for (int var173 = 1; var173 < 103; var173++) {
                                        int var178;
                                        if ((class6.field78[var100][var173][var172] & 0x8) != 0) {
                                            var178 = 0;
                                        } else if (var100 <= 0 || (class6.field78[1][var173][var172] & 0x2) == 0) {
                                            var178 = var100;
                                        } else {
                                            var178 = var100 - 1;
                                        }
                                        var94.method1736(var100, var173, var172, var178);
                                    }
                                }
                                Statics.field76[var100] = (byte[][]) null;
                                Statics.field77[var100] = (byte[][]) null;
                                Statics.field73[var100] = (byte[][]) null;
                                Statics.field79[var100] = (byte[][]) null;
                                Statics.field2057[var100] = (byte[][]) null;
                            }
                            var94.method1766(-50, -10, -50);
                            for (int var179 = 0; var179 < 104; var179++) {
                                for (int var180 = 0; var180 < 104; var180++) {
                                    if ((class6.field78[1][var179][var180] & 0x2) == 2) {
                                        var94.method1852(var179, var180);
                                    }
                                }
                            }
                            int var181 = 1;
                            int var182 = 2;
                            int var183 = 4;
                            for (int var184 = 0; var184 < 4; var184++) {
                                if (var184 > 0) {
                                    var181 <<= 0x3;
                                    var182 <<= 0x3;
                                    var183 <<= 0x3;
                                }
                                for (int var185 = 0; var185 <= var184; var185++) {
                                    for (int var186 = 0; var186 <= 104; var186++) {
                                        for (int var187 = 0; var187 <= 104; var187++) {
                                            if ((Statics.field2243[var185][var187][var186] & var181) != 0) {
                                                int var188 = var186;
                                                int var189 = var186;
                                                int var190 = var185;
                                                int var191 = var185;
                                                while (var188 > 0 && (Statics.field2243[var185][var187][var188 - 1] & var181) != 0) {
                                                    var188--;
                                                }
                                                while (var189 < 104 && (Statics.field2243[var185][var187][var189 + 1] & var181) != 0) {
                                                    var189++;
                                                }
                                                label3144: while (var190 > 0) {
                                                    for (int var192 = var188; var192 <= var189; var192++) {
                                                        if ((Statics.field2243[var190 - 1][var187][var192] & var181) == 0) {
                                                            break label3144;
                                                        }
                                                    }
                                                    var190--;
                                                }
                                                label3133: while (var191 < var184) {
                                                    for (int var193 = var188; var193 <= var189; var193++) {
                                                        if ((Statics.field2243[var191 + 1][var187][var193] & var181) == 0) {
                                                            break label3133;
                                                        }
                                                    }
                                                    var191++;
                                                }
                                                int var194 = (var191 + 1 - var190) * (var189 - var188 + 1);
                                                if (var194 >= 8) {
                                                    short var195 = 240;
                                                    int var196 = class6.field85[var191][var187][var188] - var195;
                                                    int var197 = class6.field85[var190][var187][var188];
                                                    class86.method1738(var184, 1, var187 * 128, var187 * 128, var188 * 128, var189 * 128 + 128, var196, var197);
                                                    for (int var198 = var190; var198 <= var191; var198++) {
                                                        for (int var199 = var188; var199 <= var189; var199++) {
                                                            Statics.field2243[var198][var187][var199] &= ~var181;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2243[var185][var187][var186] & var182) != 0) {
                                                int var200 = var187;
                                                int var201 = var187;
                                                int var202 = var185;
                                                int var203 = var185;
                                                while (var200 > 0 && (Statics.field2243[var185][var200 - 1][var186] & var182) != 0) {
                                                    var200--;
                                                }
                                                while (var201 < 104 && (Statics.field2243[var185][var201 + 1][var186] & var182) != 0) {
                                                    var201++;
                                                }
                                                label3197: while (var202 > 0) {
                                                    for (int var204 = var200; var204 <= var201; var204++) {
                                                        if ((Statics.field2243[var202 - 1][var204][var186] & var182) == 0) {
                                                            break label3197;
                                                        }
                                                    }
                                                    var202--;
                                                }
                                                label3186: while (var203 < var184) {
                                                    for (int var205 = var200; var205 <= var201; var205++) {
                                                        if ((Statics.field2243[var203 + 1][var205][var186] & var182) == 0) {
                                                            break label3186;
                                                        }
                                                    }
                                                    var203++;
                                                }
                                                int var206 = (var203 + 1 - var202) * (var201 - var200 + 1);
                                                if (var206 >= 8) {
                                                    short var207 = 240;
                                                    int var208 = class6.field85[var203][var200][var186] - var207;
                                                    int var209 = class6.field85[var202][var200][var186];
                                                    class86.method1738(var184, 2, var200 * 128, var201 * 128 + 128, var186 * 128, var186 * 128, var208, var209);
                                                    for (int var210 = var202; var210 <= var203; var210++) {
                                                        for (int var211 = var200; var211 <= var201; var211++) {
                                                            Statics.field2243[var210][var211][var186] &= ~var182;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2243[var185][var187][var186] & var183) != 0) {
                                                int var212 = var187;
                                                int var213 = var187;
                                                int var214 = var186;
                                                int var215 = var186;
                                                while (var214 > 0 && (Statics.field2243[var185][var187][var214 - 1] & var183) != 0) {
                                                    var214--;
                                                }
                                                while (var215 < 104 && (Statics.field2243[var185][var187][var215 + 1] & var183) != 0) {
                                                    var215++;
                                                }
                                                label3250: while (var212 > 0) {
                                                    for (int var216 = var214; var216 <= var215; var216++) {
                                                        if ((Statics.field2243[var185][var212 - 1][var216] & var183) == 0) {
                                                            break label3250;
                                                        }
                                                    }
                                                    var212--;
                                                }
                                                label3239: while (var213 < 104) {
                                                    for (int var217 = var214; var217 <= var215; var217++) {
                                                        if ((Statics.field2243[var185][var213 + 1][var217] & var183) == 0) {
                                                            break label3239;
                                                        }
                                                    }
                                                    var213++;
                                                }
                                                if ((var213 - var212 + 1) * (var215 - var214 + 1) >= 4) {
                                                    int var218 = class6.field85[var185][var212][var214];
                                                    class86.method1738(var184, 4, var212 * 128, var213 * 128 + 128, var214 * 128, var215 * 128 + 128, var218, var218);
                                                    for (int var219 = var212; var219 <= var213; var219++) {
                                                        for (int var220 = var214; var220 <= var215; var220++) {
                                                            Statics.field2243[var185][var219][var220] &= ~var183;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method957(true);
                            int var221 = class6.field90;
                            if (var221 > Statics.field2983) {
                                var221 = Statics.field2983;
                            }
                            if (var221 < Statics.field2983 - 1) {
                                int var222 = Statics.field2983 - 1;
                            }
                            if (field278) {
                                Statics.field1976.method1829(class6.field90);
                            } else {
                                Statics.field1976.method1829(0);
                            }
                            for (int var223 = 0; var223 < 104; var223++) {
                                for (int var224 = 0; var224 < 104; var224++) {
                                    Statics.method3129(var223, var224);
                                }
                            }
                            method565();
                            method96();
                            class41.field926.method3488();
                            if (Statics.field2011 != null) {
                                field317.method2544(25);
                                field317.method2484(1057001181);
                            }
                            if (!field464) {
                                int var225 = (Statics.field206 - 6) / 8;
                                int var226 = (Statics.field206 + 6) / 8;
                                int var227 = (Statics.field2984 - 6) / 8;
                                int var228 = (Statics.field2984 + 6) / 8;
                                for (int var229 = var225 - 1; var229 <= var226 + 1; var229++) {
                                    for (int var230 = var227 - 1; var230 <= var228 + 1; var230++) {
                                        if (var229 < var225 || var229 > var226 || var230 < var227 || var230 > var228) {
                                            Statics.field169.method3014("m" + var229 + "_" + var230);
                                            Statics.field169.method3014("l" + var229 + "_" + var230);
                                        }
                                    }
                                }
                            }
                            method145(30);
                            method565();
                            Statics.field76 = (byte[][][]) null;
                            Statics.field77 = (byte[][][]) null;
                            Statics.field73 = (byte[][][]) null;
                            Statics.field79 = (byte[][][]) null;
                            Statics.field2243 = (int[][][]) null;
                            Statics.field2057 = (byte[][][]) null;
                            Statics.field250 = (int[][]) null;
                            Statics.field1069 = null;
                            Statics.field214 = null;
                            Statics.field1988 = null;
                            Statics.field1085 = null;
                            Statics.field782 = null;
                            field317.method2544(107);
                            class144.method1998();
                        } else {
                            field333 = 2;
                        }
                    } else {
                        field333 = 1;
                    }
                }
                if (field379 == 30) {
                    if (field300 > 1) {
                        field300--;
                    }
                    if (field327 > 0) {
                        field327--;
                    }
                    if (field552) {
                        field552 = false;
                        method124();
                    } else {
                        if (!field416) {
                            field396[0] = class157.field2522;
                            field281[0] = "";
                            field420[0] = 1006;
                            field342 = 1;
                        }
                        for (int var231 = 0; var231 < 100; var231++) {
                            boolean var232;
                            if (Statics.field254 == null) {
                                var232 = false;
                            } else {
                                label3823: {
                                    try {
                                        int var233 = Statics.field254.method2765();
                                        if (var233 == 0) {
                                            var232 = false;
                                            break label3823;
                                        }
                                        if (field321 == -1) {
                                            Statics.field254.method2768(field319.field1956, 0, 1);
                                            field319.field1955 = 0;
                                            field321 = field319.method2528();
                                            field320 = class188.field3029[field321];
                                            var233--;
                                        }
                                        if (field320 == -1) {
                                            if (var233 <= 0) {
                                                var232 = false;
                                                break label3823;
                                            }
                                            Statics.field254.method2768(field319.field1956, 0, 1);
                                            field320 = field319.field1956[0] & 0xFF;
                                            var233--;
                                        }
                                        if (field320 == -2) {
                                            if (var233 <= 1) {
                                                var232 = false;
                                                break label3823;
                                            }
                                            Statics.field254.method2768(field319.field1956, 0, 2);
                                            field319.field1955 = 0;
                                            field320 = field319.method2293();
                                            var233 -= 2;
                                        }
                                        if (var233 < field320) {
                                            var232 = false;
                                            break label3823;
                                        }
                                        field319.field1955 = 0;
                                        Statics.field254.method2768(field319.field1956, 0, field320);
                                        field363 = 0;
                                        field326 = field325;
                                        field325 = field331;
                                        field331 = field321;
                                        if (field321 == 148) {
                                            int var234 = field319.method2335();
                                            int var235 = field319.method2293();
                                            int var236 = field319.method2326();
                                            int var237 = field319.method2427();
                                            class173 var238 = class173.method708(var234);
                                            if (var238.field2840 != var235 || var238.field2791 != var236 || var238.field2790 != var237) {
                                                var238.field2840 = var235;
                                                var238.field2791 = var236;
                                                var238.field2790 = var237;
                                                method643(var238);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 89) {
                                            field523 = field319.method2291();
                                            if (field523 == 255) {
                                                field523 = 0;
                                            }
                                            field492 = field319.method2291();
                                            if (field492 == 255) {
                                                field492 = 0;
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 128) {
                                            int var239 = field319.method2427();
                                            field284 = var239;
                                            int var240 = field284;
                                            int var241 = Statics.field1604;
                                            int var242 = Statics.field776;
                                            if (class173.method4(var240)) {
                                                method173(Statics.field2827[var240], -1, var241, var242, false);
                                            }
                                            method580(var239);
                                            class37.method698(field284);
                                            for (int var243 = 0; var243 < 100; var243++) {
                                                field480[var243] = true;
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 6) {
                                            String var244 = field319.method2299();
                                            long var245 = (long) field319.method2293();
                                            long var247 = (long) field319.method2402();
                                            class152[] var249 = new class152[] { class152.field2237, class152.field2234, class152.field2236, class152.field2242, class152.field2235 };
                                            class152 var250 = (class152) class109.method2565(var249, field319.method2291());
                                            long var251 = (var245 << 32) + var247;
                                            boolean var253 = false;
                                            for (int var254 = 0; var254 < 100; var254++) {
                                                if (field496[var254] == var251) {
                                                    var253 = true;
                                                    break;
                                                }
                                            }
                                            if (method109(var244)) {
                                                var253 = true;
                                            }
                                            if (!var253 && field403 == 0) {
                                                field496[field497] = var251;
                                                field497 = (field497 + 1) % 100;
                                                class122 var255 = field319;
                                                String var259;
                                                try {
                                                    int var256 = var255.method2301();
                                                    if (var256 > 32767) {
                                                        var256 = 32767;
                                                    }
                                                    byte[] var257 = new byte[var256];
                                                    var255.field1955 += Statics.field3157.method2213(var255.field1956, var255.field1955, var257, 0, var256);
                                                    String var258 = class165.method92(var257, 0, var256);
                                                    var259 = var258;
                                                } catch (Exception var604) {
                                                    var259 = "Cabbage";
                                                }
                                                String var262 = class223.method3736(class163.method961(var259));
                                                byte var263;
                                                if (var250.field2244) {
                                                    var263 = 7;
                                                } else {
                                                    var263 = 3;
                                                }
                                                if (var250.field2239 == -1) {
                                                    class12.method156(var263, var244, var262);
                                                } else {
                                                    class12.method156(var263, class2.method2000(var250.field2239) + var244, var262);
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 196) {
                                            int var264 = field319.method2296();
                                            class4 var265 = (class4) field421.method3521((long) var264);
                                            if (var265 != null) {
                                                Statics.method691(var265, true);
                                            }
                                            if (field439 != null) {
                                                method643(field439);
                                                field439 = null;
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 16) {
                                            int var266 = field319.method2439();
                                            int var267 = field319.method2439();
                                            int var268 = field319.method2335();
                                            class173 var269 = class173.method708(var268);
                                            if (var269.field2853 != var267 || var269.field2806 != var266 || var269.field2746 != 0 || var269.field2747 != 0) {
                                                var269.field2853 = var267;
                                                var269.field2806 = var266;
                                                var269.field2746 = 0;
                                                var269.field2747 = 0;
                                                method643(var269);
                                                method984(var269);
                                                if (var269.field2770 == 0) {
                                                    method2567(Statics.field2827[var268 >> 16], var269, false);
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 243) {
                                            int var270 = field319.method2296();
                                            int var271 = field319.method2386();
                                            class4 var272 = (class4) field421.method3521((long) var271);
                                            class4 var273 = (class4) field421.method3521((long) var270);
                                            if (var273 != null) {
                                                Statics.method691(var273, var272 == null || var272.field67 != var273.field67);
                                            }
                                            if (var272 != null) {
                                                var272.method3646();
                                                field421.method3531(var272, (long) var270);
                                            }
                                            class173 var274 = class173.method708(var271);
                                            if (var274 != null) {
                                                method643(var274);
                                            }
                                            class173 var275 = class173.method708(var270);
                                            if (var275 != null) {
                                                method643(var275);
                                                method2567(Statics.field2827[var275.field2822 >>> 16], var275, true);
                                            }
                                            if (field284 != -1) {
                                                method2084(field284, 1);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 167) {
                                            int var276 = field319.method2291();
                                            int var277 = field319.method2291();
                                            int var278 = field319.method2291();
                                            int var279 = field319.method2291();
                                            field374[var276] = true;
                                            field465[var276] = var277;
                                            field526[var276] = var278;
                                            field527[var276] = var279;
                                            field292[var276] = 0;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 33) {
                                            Statics.field2634 = field319.method2423();
                                            Statics.field192 = field319.method2423();
                                            for (int var280 = Statics.field2634; var280 < Statics.field2634 + 8; var280++) {
                                                for (int var281 = Statics.field192; var281 < Statics.field192 + 8; var281++) {
                                                    if (field408[Statics.field2983][var280][var281] != null) {
                                                        field408[Statics.field2983][var280][var281] = null;
                                                        Statics.method3129(var280, var281);
                                                    }
                                                }
                                            }
                                            for (class17 var282 = (class17) field409.method3558(); var282 != null; var282 = (class17) field409.method3554()) {
                                                if (var282.field220 >= Statics.field2634 && var282.field220 < Statics.field2634 + 8 && var282.field221 >= Statics.field192 && var282.field221 < Statics.field192 + 8 && Statics.field2983 == var282.field228) {
                                                    var282.field234 = 0;
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 175) {
                                            method1525(false);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 232) {
                                            Statics.method567(field319, field320);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 238) {
                                            boolean var283 = field319.method2350() == 1;
                                            int var284 = field319.method2418();
                                            class173 var285 = class173.method708(var284);
                                            if (var285.field2761 != var283) {
                                                var285.field2761 = var283;
                                                method643(var285);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 63) {
                                            field469 = field460;
                                            if (field320 == 0) {
                                                field502 = null;
                                                field503 = null;
                                                Statics.field91 = 0;
                                                Statics.field209 = null;
                                                field321 = -1;
                                                var232 = true;
                                                break label3823;
                                            }
                                            field503 = field319.method2299();
                                            long var286 = field319.method2297();
                                            field502 = class162.method2607(var286);
                                            Statics.field159 = field319.method2292();
                                            int var288 = field319.method2291();
                                            if (var288 == 255) {
                                                field321 = -1;
                                                var232 = true;
                                                break label3823;
                                            }
                                            Statics.field91 = var288;
                                            class25[] var289 = new class25[100];
                                            for (int var290 = 0; var290 < Statics.field91; var290++) {
                                                var289[var290] = new class25();
                                                var289[var290].field617 = field319.method2299();
                                                var289[var290].field618 = Statics.method716(var289[var290].field617, Statics.field1742);
                                                var289[var290].field619 = field319.method2293();
                                                var289[var290].field621 = field319.method2292();
                                                field319.method2299();
                                                if (var289[var290].field617.equals(Statics.field2644.field35)) {
                                                    Statics.field1930 = var289[var290].field621;
                                                }
                                            }
                                            boolean var291 = false;
                                            int var292 = Statics.field91;
                                            while (var292 > 0) {
                                                boolean var293 = true;
                                                var292--;
                                                for (int var294 = 0; var294 < var292; var294++) {
                                                    if (var289[var294].field618.compareTo(var289[var294 + 1].field618) > 0) {
                                                        class25 var295 = var289[var294];
                                                        var289[var294] = var289[var294 + 1];
                                                        var289[var294 + 1] = var295;
                                                        var293 = false;
                                                    }
                                                }
                                                if (var293) {
                                                    break;
                                                }
                                            }
                                            Statics.field209 = var289;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 99) {
                                            int var296 = field319.method2418();
                                            String var297 = field319.method2299();
                                            class173 var298 = class173.method708(var296);
                                            if (!var297.equals(var298.field2799)) {
                                                var298.field2799 = var297;
                                                method643(var298);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 226) {
                                            int var299 = field319.method2335();
                                            class173 var300 = class173.method708(var299);
                                            var300.field2821 = 3;
                                            var300.field2835 = Statics.field2644.field43.method3272();
                                            method643(var300);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 59) {
                                            field300 = field319.method2427() * 30;
                                            field472 = field460;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 140) {
                                            class26 var301 = new class26();
                                            var301.field636 = field319.method2299();
                                            var301.field628 = field319.method2293();
                                            int var302 = field319.method2296();
                                            var301.field643 = var302;
                                            method145(45);
                                            Statics.field254.method2763();
                                            Statics.field254 = null;
                                            class32.method617(var301);
                                            field321 = -1;
                                            var232 = false;
                                            break label3823;
                                        }
                                        if (field321 == 72) {
                                            int var303 = field319.method2427();
                                            int var304 = field319.method2296();
                                            class173 var305 = class173.method708(var304);
                                            if (var305 != null && var305.field2770 == 0) {
                                                if (var303 > var305.field2750 - var305.field2740) {
                                                    var303 = var305.field2750 - var305.field2740;
                                                }
                                                if (var303 < 0) {
                                                    var303 = 0;
                                                }
                                                if (var305.field2763 != var303) {
                                                    var305.field2763 = var303;
                                                    method643(var305);
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 197) {
                                            int var306 = field319.method2418();
                                            int var307 = field319.method2427();
                                            class176.field2886[var307] = var306;
                                            if (class176.field2887[var307] != var306) {
                                                class176.field2887[var307] = var306;
                                                method1219(var307);
                                            }
                                            field461[++field540 - 1 & 0x1F] = var307;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 47) {
                                            boolean var308 = field319.method2291() == 1;
                                            if (var308) {
                                                Statics.field200 = class115.method2622() - field319.method2297();
                                                Statics.field2645 = new class221(field319, true);
                                            } else {
                                                Statics.field2645 = null;
                                            }
                                            field471 = field460;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 168) {
                                            String var309 = field319.method2299();
                                            Statics.field158 = var309;
                                            try {
                                                String var310 = Statics.field3099.getParameter(class190.field3045.field3048);
                                                String var311 = Statics.field3099.getParameter(class190.field3046.field3048);
                                                String var312 = var310 + "settings=" + var309 + "; version=1; path=/; domain=" + var311;
                                                String var313;
                                                if (var309.length() == 0) {
                                                    var313 = var312 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                                } else {
                                                    var313 = var312 + "; Expires=" + class111.method1048(class115.method2622() + 94608000000L) + "; Max-Age=" + 94608000L;
                                                }
                                                class132.method2628(Statics.field3099, "document.cookie=\"" + var313 + "\"");
                                            } catch (Throwable var603) {
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 3) {
                                            int var315 = field319.method2423();
                                            int var316 = field319.method2423();
                                            String var317 = field319.method2299();
                                            if (var315 >= 1 && var315 <= 8) {
                                                if (var317.equalsIgnoreCase("null")) {
                                                    var317 = null;
                                                }
                                                field444[var315 - 1] = var317;
                                                field405[var315 - 1] = var316 == 0;
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 245) {
                                            method3152();
                                            field440 = field319.method2291();
                                            field472 = field460;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 53) {
                                            method683();
                                            field321 = -1;
                                            var232 = false;
                                            break label3823;
                                        }
                                        if (field321 == 111) {
                                            int var318 = field320 + field319.field1955;
                                            int var319 = field319.method2293();
                                            int var320 = field319.method2293();
                                            if (field284 != var319) {
                                                field284 = var319;
                                                int var321 = field284;
                                                int var322 = Statics.field1604;
                                                int var323 = Statics.field776;
                                                if (class173.method4(var321)) {
                                                    method173(Statics.field2827[var321], -1, var322, var323, false);
                                                }
                                                method580(field284);
                                                class37.method698(field284);
                                                for (int var324 = 0; var324 < 100; var324++) {
                                                    field480[var324] = true;
                                                }
                                            }
                                            while (var320-- > 0) {
                                                int var325 = field319.method2296();
                                                int var326 = field319.method2293();
                                                int var327 = field319.method2291();
                                                class4 var328 = (class4) field421.method3521((long) var325);
                                                if (var328 != null && var328.field67 != var326) {
                                                    Statics.method691(var328, true);
                                                    var328 = null;
                                                }
                                                if (var328 == null) {
                                                    var328 = method1892(var325, var326, var327);
                                                }
                                                var328.field63 = true;
                                            }
                                            for (class4 var329 = (class4) field421.method3520(); var329 != null; var329 = (class4) field421.method3533()) {
                                                if (var329.field63) {
                                                    var329.field63 = false;
                                                } else {
                                                    Statics.method691(var329, true);
                                                }
                                            }
                                            field477 = new class196(512);
                                            while (field319.field1955 < var318) {
                                                int var330 = field319.method2296();
                                                int var331 = field319.method2293();
                                                int var332 = field319.method2293();
                                                int var333 = field319.method2296();
                                                for (int var334 = var331; var334 <= var332; var334++) {
                                                    long var335 = ((long) var330 << 32) + (long) var334;
                                                    field477.method3531(new class201(var333), var335);
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 171) {
                                            int var337 = field319.method2418();
                                            int var338 = field319.method2418();
                                            int var339 = field319.method2293();
                                            if (var339 == 65535) {
                                                var339 = -1;
                                            }
                                            class173 var340 = class173.method708(var338);
                                            if (var340.field2844) {
                                                var340.field2859 = var339;
                                                var340.field2860 = var337;
                                                class52 var342 = class52.method971(var339);
                                                var340.field2840 = var342.field1119;
                                                var340.field2791 = var342.field1120;
                                                var340.field2792 = var342.field1104;
                                                var340.field2788 = var342.field1122;
                                                var340.field2789 = var342.field1123;
                                                var340.field2790 = var342.field1118;
                                                if (var342.field1121 == 1) {
                                                    var340.field2797 = 1;
                                                } else {
                                                    var340.field2797 = 2;
                                                }
                                                if (var340.field2794 > 0) {
                                                    var340.field2790 = var340.field2790 * 32 / var340.field2794;
                                                } else if (var340.field2752 > 0) {
                                                    var340.field2790 = var340.field2790 * 32 / var340.field2752;
                                                }
                                                method643(var340);
                                            } else {
                                                if (var339 == -1) {
                                                    var340.field2821 = 0;
                                                    field321 = -1;
                                                    var232 = true;
                                                    break label3823;
                                                }
                                                class52 var341 = class52.method971(var339);
                                                var340.field2821 = 4;
                                                var340.field2835 = var339;
                                                var340.field2840 = var341.field1119;
                                                var340.field2791 = var341.field1120;
                                                var340.field2790 = var341.field1118 * 100 / var337;
                                                method643(var340);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 194) {
                                            if (field284 != -1) {
                                                method2084(field284, 0);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 192) {
                                            int var343 = field319.method2293();
                                            if (var343 == 65535) {
                                                var343 = -1;
                                            }
                                            if (var343 == -1 && !field514) {
                                                Statics.field2936.method3366();
                                                class183.field2940 = 1;
                                                Statics.field2941 = null;
                                            } else if (var343 != -1 && field462 != var343 && field512 != 0 && !field514) {
                                                class183.method2238(2, Statics.field24, var343, 0, field512, false);
                                            }
                                            field462 = var343;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 29) {
                                            int var344 = field319.method2427();
                                            if (var344 == 65535) {
                                                var344 = -1;
                                            }
                                            int var345 = field319.method2336();
                                            if (field512 != 0 && var344 != -1) {
                                                class183.method2886(Statics.field259, var344, 0, field512, false);
                                                field514 = true;
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 234) {
                                            field508 = true;
                                            Statics.field622 = field319.method2291();
                                            Statics.field191 = field319.method2291();
                                            Statics.field1729 = field319.method2293();
                                            Statics.field589 = field319.method2291();
                                            Statics.field1083 = field319.method2291();
                                            if (Statics.field1083 >= 100) {
                                                int var346 = Statics.field622 * 128 + 64;
                                                int var347 = Statics.field191 * 128 + 64;
                                                int var348 = method2209(var346, var347, Statics.field2983) - Statics.field1729;
                                                int var349 = var346 - Statics.field1366;
                                                int var350 = var348 - Statics.field1071;
                                                int var351 = var347 - Statics.field2126;
                                                int var352 = (int) Math.sqrt((double) (var349 * var349 + var351 * var351));
                                                Statics.field28 = (int) (Math.atan2((double) var350, (double) var352) * 325.949D) & 0x7FF;
                                                Statics.field633 = (int) (Math.atan2((double) var349, (double) var351) * -325.949D) & 0x7FF;
                                                if (Statics.field28 < 128) {
                                                    Statics.field28 = 128;
                                                }
                                                if (Statics.field28 > 383) {
                                                    Statics.field28 = 383;
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 116) {
                                            int var353 = field319.method2326();
                                            class16.method1728(var353);
                                            field463[++field382 - 1 & 0x1F] = var353 & 0x7FFF;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 31) {
                                            int var354 = field319.method2335();
                                            int var355 = field319.method2326();
                                            class173 var356 = class173.method708(var354);
                                            if (var356.field2821 != 1 || var356.field2835 != var355) {
                                                var356.field2821 = 1;
                                                var356.field2835 = var355;
                                                method643(var356);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 161) {
                                            int var357 = field319.method2301();
                                            boolean var358 = field319.method2291() == 1;
                                            String var359 = "";
                                            boolean var360 = false;
                                            if (var358) {
                                                var359 = field319.method2299();
                                                if (method109(var359)) {
                                                    var360 = true;
                                                }
                                            }
                                            String var361 = field319.method2299();
                                            if (!var360) {
                                                class12.method156(var357, var359, var361);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 142) {
                                            int var362 = field319.method2291();
                                            if (field319.method2291() == 0) {
                                                field524[var362] = new class220();
                                                field319.field1955 += 18;
                                            } else {
                                                field319.field1955--;
                                                field524[var362] = new class220(field319, false);
                                            }
                                            field470 = field460;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 14) {
                                            while (field319.field1955 < field320) {
                                                int var363 = field319.method2291();
                                                boolean var364 = (var363 & 0x1) == 1;
                                                String var365 = field319.method2299();
                                                String var366 = field319.method2299();
                                                field319.method2299();
                                                for (int var367 = 0; var367 < field274; var367++) {
                                                    class8 var368 = field547[var367];
                                                    if (var364) {
                                                        if (var366.equals(var368.field124)) {
                                                            var368.field124 = var365;
                                                            var368.field129 = var366;
                                                            var365 = null;
                                                            break;
                                                        }
                                                    } else if (var365.equals(var368.field124)) {
                                                        var368.field124 = var365;
                                                        var368.field129 = var366;
                                                        var365 = null;
                                                        break;
                                                    }
                                                }
                                                if (var365 != null && field274 < 400) {
                                                    class8 var369 = new class8();
                                                    field547[field274] = var369;
                                                    var369.field124 = var365;
                                                    var369.field129 = var366;
                                                    field274++;
                                                }
                                            }
                                            field324 = field460;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 236) {
                                            Statics.field2634 = field319.method2350();
                                            Statics.field192 = field319.method2319();
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 12) {
                                            method183(false);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 113) {
                                            int var370 = field319.method2326();
                                            int var371 = field319.method2386();
                                            int var372 = var370 >> 10 & 0x1F;
                                            int var373 = var370 >> 5 & 0x1F;
                                            int var374 = var370 & 0x1F;
                                            int var375 = (var374 << 3) + (var372 << 19) + (var373 << 11);
                                            class173 var376 = class173.method708(var371);
                                            if (var376.field2766 != var375) {
                                                var376.field2766 = var375;
                                                method643(var376);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 204) {
                                            Statics.field624 = class130.method2896(field319.method2291());
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 242) {
                                            method3152();
                                            int var377 = field319.method2319();
                                            int var378 = field319.method2296();
                                            int var379 = field319.method2319();
                                            field414[var379] = var378;
                                            field412[var379] = var377;
                                            field413[var379] = 1;
                                            for (int var380 = 0; var380 < 98; var380++) {
                                                if (var378 >= class155.field2266[var380]) {
                                                    field413[var379] = var380 + 2;
                                                }
                                            }
                                            field384[++field466 - 1 & 0x1F] = var379;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 25) {
                                            int var381 = field319.method2319();
                                            int var382 = field319.method2418();
                                            int var383 = field319.method2327();
                                            class4 var384 = (class4) field421.method3521((long) var382);
                                            if (var384 != null) {
                                                Statics.method691(var384, var384.field67 != var383);
                                            }
                                            method1892(var382, var383, var381);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 213) {
                                            field319.field1955 += 28;
                                            if (field319.method2420()) {
                                                class149.method707(field319, field319.field1955 - 28);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 37) {
                                            field508 = true;
                                            Statics.field2264 = field319.method2291();
                                            Statics.field1090 = field319.method2291();
                                            Statics.field126 = field319.method2293();
                                            Statics.field1844 = field319.method2291();
                                            Statics.field558 = field319.method2291();
                                            if (Statics.field558 >= 100) {
                                                Statics.field1366 = Statics.field2264 * 128 + 64;
                                                Statics.field2126 = Statics.field1090 * 128 + 64;
                                                Statics.field1071 = method2209(Statics.field1366, Statics.field2126, Statics.field2983) - Statics.field126;
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 247) {
                                            int var385 = field319.method2418();
                                            Statics.field3139 = Statics.field1993.method2663(var385);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 69 || field321 == 162 || field321 == 224 || field321 == 160 || field321 == 248 || field321 == 211 || field321 == 139 || field321 == 174 || field321 == 231 || field321 == 149) {
                                            Statics.method815();
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 119) {
                                            String var386 = field319.method2299();
                                            Object[] var387 = new Object[var386.length() + 1];
                                            for (int var388 = var386.length() - 1; var388 >= 0; var388--) {
                                                if (var386.charAt(var388) == 's') {
                                                    var387[var388 + 1] = field319.method2299();
                                                } else {
                                                    var387[var388 + 1] = Integer.valueOf(field319.method2296());
                                                }
                                            }
                                            var387[0] = Integer.valueOf(field319.method2296());
                                            class1 var389 = new class1();
                                            var389.field17 = var387;
                                            class37.method103(var389);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 93) {
                                            String var390 = field319.method2299();
                                            class122 var391 = field319;
                                            String var395;
                                            try {
                                                int var392 = var391.method2301();
                                                if (var392 > 32767) {
                                                    var392 = 32767;
                                                }
                                                byte[] var393 = new byte[var392];
                                                var391.field1955 += Statics.field3157.method2213(var391.field1956, var391.field1955, var393, 0, var392);
                                                String var394 = class165.method92(var393, 0, var392);
                                                var395 = var394;
                                            } catch (Exception var602) {
                                                var395 = "Cabbage";
                                            }
                                            String var398 = class223.method3736(class163.method961(var395));
                                            class12.method156(6, var390, var398);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 223) {
                                            byte var399 = field319.method2320();
                                            int var400 = field319.method2427();
                                            class176.field2886[var400] = var399;
                                            if (class176.field2887[var400] != var399) {
                                                class176.field2887[var400] = var399;
                                                method1219(var400);
                                            }
                                            field461[++field540 - 1 & 0x1F] = var400;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 155) {
                                            int var401 = field319.method2296();
                                            int var402 = field319.method2293();
                                            if (var401 < -70000) {
                                                var402 += 32768;
                                            }
                                            class173 var403;
                                            if (var401 >= 0) {
                                                var403 = class173.method708(var401);
                                            } else {
                                                var403 = null;
                                            }
                                            while (field319.field1955 < field320) {
                                                int var404 = field319.method2301();
                                                int var405 = field319.method2293();
                                                int var406 = 0;
                                                if (var405 != 0) {
                                                    var406 = field319.method2291();
                                                    if (var406 == 255) {
                                                        var406 = field319.method2296();
                                                    }
                                                }
                                                if (var403 != null && var404 >= 0 && var404 < var403.field2857.length) {
                                                    var403.field2857[var404] = var405;
                                                    var403.field2858[var404] = var406;
                                                }
                                                class16.method2898(var402, var404, var405 - 1, var406);
                                            }
                                            if (var403 != null) {
                                                method643(var403);
                                            }
                                            method3152();
                                            field463[++field382 - 1 & 0x1F] = var402 & 0x7FFF;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 230) {
                                            for (int var407 = 0; var407 < Statics.field1156; var407++) {
                                                class53 var408 = Statics.method619(var407);
                                                if (var408 != null) {
                                                    class176.field2886[var407] = 0;
                                                    class176.field2887[var407] = 0;
                                                }
                                            }
                                            method3152();
                                            field540 += 32;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 19) {
                                            class33.method8(field319, field320);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 102) {
                                            field543 = 1;
                                            field324 = field460;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 141) {
                                            method183(true);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 81) {
                                            field328 = field319.method2291();
                                            field280 = field319.method2291();
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 188) {
                                            int var409 = field319.method2296();
                                            int var410 = field319.method2296();
                                            if (Statics.field2157 == null || !Statics.field2157.isValid()) {
                                                try {
                                                    Iterator var411 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var411.hasNext()) {
                                                        GarbageCollectorMXBean var412 = (GarbageCollectorMXBean) var411.next();
                                                        if (var412.isValid()) {
                                                            Statics.field2157 = var412;
                                                            field553 = -1L;
                                                            field407 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var607) {
                                                }
                                            }
                                            long var414 = class115.method2622();
                                            int var416 = -1;
                                            if (Statics.field2157 != null) {
                                                long var417 = Statics.field2157.getCollectionTime();
                                                if (field407 != -1L) {
                                                    long var419 = var417 - field407;
                                                    long var421 = var414 - field553;
                                                    if (var421 != 0L) {
                                                        var416 = (int) (var419 * 100L / var421);
                                                    }
                                                }
                                                field407 = var417;
                                                field553 = var414;
                                            }
                                            field317.method2544(144);
                                            field317.method2315(field2175);
                                            field317.method2484(var409);
                                            field317.method2405(var410);
                                            field317.method2316(var416);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 166) {
                                            int var423 = field319.method2326();
                                            int var424 = field319.method2326();
                                            int var425 = field319.method2296();
                                            class173 var426 = class173.method708(var425);
                                            var426.field2795 = (var423 << 16) + var424;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 46) {
                                            int var427 = field319.method2418();
                                            int var428 = field319.method2327();
                                            if (var428 == 65535) {
                                                var428 = -1;
                                            }
                                            int var429 = field319.method2335();
                                            int var430 = field319.method2326();
                                            if (var430 == 65535) {
                                                var430 = -1;
                                            }
                                            for (int var431 = var430; var431 <= var428; var431++) {
                                                long var432 = ((long) var427 << 32) + (long) var431;
                                                class208 var434 = field477.method3521(var432);
                                                if (var434 != null) {
                                                    var434.method3646();
                                                }
                                                field477.method3531(new class201(var429), var432);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 121) {
                                            int var435 = field319.method2303();
                                            int var436 = field319.method2386();
                                            class173 var437 = class173.method708(var436);
                                            if (var437.field2786 != var435 || var435 == -1) {
                                                var437.field2786 = var435;
                                                var437.field2861 = 0;
                                                var437.field2800 = 0;
                                                method643(var437);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 8) {
                                            field508 = false;
                                            for (int var438 = 0; var438 < 5; var438++) {
                                                field374[var438] = false;
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 11) {
                                            field293 = field319.method2291();
                                            if (field293 == 1) {
                                                field294 = field319.method2293();
                                            }
                                            if (field293 >= 2 && field293 <= 6) {
                                                if (field293 == 2) {
                                                    field299 = 64;
                                                    field536 = 64;
                                                }
                                                if (field293 == 3) {
                                                    field299 = 0;
                                                    field536 = 64;
                                                }
                                                if (field293 == 4) {
                                                    field299 = 128;
                                                    field536 = 64;
                                                }
                                                if (field293 == 5) {
                                                    field299 = 64;
                                                    field536 = 0;
                                                }
                                                if (field293 == 6) {
                                                    field299 = 64;
                                                    field536 = 128;
                                                }
                                                field293 = 2;
                                                field296 = field319.method2293();
                                                field297 = field319.method2293();
                                                field298 = field319.method2291();
                                            }
                                            if (field293 == 10) {
                                                field295 = field319.method2293();
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 217) {
                                            for (int var439 = 0; var439 < field404.length; var439++) {
                                                if (field404[var439] != null) {
                                                    field404[var439].field846 = -1;
                                                }
                                            }
                                            for (int var440 = 0; var440 < field312.length; var440++) {
                                                if (field312[var440] != null) {
                                                    field312[var440].field846 = -1;
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 96) {
                                            Statics.field2634 = field319.method2291();
                                            Statics.field192 = field319.method2350();
                                            while (field319.field1955 < field320) {
                                                field321 = field319.method2291();
                                                Statics.method815();
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 246) {
                                            for (int var441 = 0; var441 < class176.field2887.length; var441++) {
                                                if (class176.field2887[var441] != class176.field2886[var441]) {
                                                    class176.field2887[var441] = class176.field2886[var441];
                                                    method1219(var441);
                                                    field461[++field540 - 1 & 0x1F] = var441;
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 94) {
                                            int var442 = field319.method2327();
                                            int var443 = field319.method2386();
                                            class173 var444 = class173.method708(var443);
                                            if (var444.field2821 != 2 || var444.field2835 != var442) {
                                                var444.field2821 = 2;
                                                var444.field2835 = var442;
                                                method643(var444);
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 82) {
                                            while (field319.field1955 < field320) {
                                                boolean var445 = field319.method2291() == 1;
                                                String var446 = field319.method2299();
                                                String var447 = field319.method2299();
                                                int var448 = field319.method2293();
                                                int var449 = field319.method2291();
                                                int var450 = field319.method2291();
                                                boolean var451 = (var450 & 0x2) != 0;
                                                boolean var452 = (var450 & 0x1) != 0;
                                                if (var448 > 0) {
                                                    field319.method2299();
                                                    field319.method2291();
                                                    field319.method2296();
                                                }
                                                field319.method2299();
                                                for (int var453 = 0; var453 < field335; var453++) {
                                                    class18 var454 = field544[var453];
                                                    if (var445) {
                                                        if (var447.equals(var454.field237)) {
                                                            var454.field237 = var446;
                                                            var454.field241 = var447;
                                                            var446 = null;
                                                            break;
                                                        }
                                                    } else if (var446.equals(var454.field237)) {
                                                        if (var454.field238 != var448) {
                                                            boolean var455 = true;
                                                            for (class39 var456 = (class39) field545.method3513(); var456 != null; var456 = (class39) field545.method3512()) {
                                                                if (var456.field879.equals(var446)) {
                                                                    if (var448 != 0 && var456.field874 == 0) {
                                                                        var456.method3643();
                                                                        var455 = false;
                                                                    } else if (var448 == 0 && var456.field874 != 0) {
                                                                        var456.method3643();
                                                                        var455 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var455) {
                                                                field545.method3511(new class39(var446, var448));
                                                            }
                                                            var454.field238 = var448;
                                                        }
                                                        var454.field241 = var447;
                                                        var454.field236 = var449;
                                                        var454.field239 = var451;
                                                        var454.field240 = var452;
                                                        var446 = null;
                                                        break;
                                                    }
                                                }
                                                if (var446 != null && field335 < 400) {
                                                    class18 var457 = new class18();
                                                    field544[field335] = var457;
                                                    var457.field237 = var446;
                                                    var457.field241 = var447;
                                                    var457.field238 = var448;
                                                    var457.field236 = var449;
                                                    var457.field239 = var451;
                                                    var457.field240 = var452;
                                                    field335++;
                                                }
                                            }
                                            field543 = 2;
                                            field324 = field460;
                                            boolean var458 = false;
                                            int var459 = field335;
                                            while (var459 > 0) {
                                                boolean var460 = true;
                                                var459--;
                                                for (int var461 = 0; var461 < var459; var461++) {
                                                    boolean var462 = false;
                                                    class18 var463 = field544[var461];
                                                    class18 var464 = field544[var461 + 1];
                                                    if (field273 != var463.field238 && field273 == var464.field238) {
                                                        var462 = true;
                                                    }
                                                    if (!var462 && var463.field238 == 0 && var464.field238 != 0) {
                                                        var462 = true;
                                                    }
                                                    if (!var462 && !var463.field239 && var464.field239) {
                                                        var462 = true;
                                                    }
                                                    if (!var462 && !var463.field240 && var464.field240) {
                                                        var462 = true;
                                                    }
                                                    if (var462) {
                                                        class18 var465 = field544[var461];
                                                        field544[var461] = field544[var461 + 1];
                                                        field544[var461 + 1] = var465;
                                                        var460 = false;
                                                    }
                                                }
                                                if (var460) {
                                                    break;
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 146) {
                                            int var466 = field319.method2296();
                                            class173 var467 = class173.method708(var466);
                                            for (int var468 = 0; var468 < var467.field2857.length; var468++) {
                                                var467.field2857[var468] = -1;
                                                var467.field2857[var468] = 0;
                                            }
                                            method643(var467);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 107) {
                                            int var469 = field319.method2293();
                                            int var470 = field319.method2291();
                                            int var471 = field319.method2293();
                                            if (field515 != 0 && var470 != 0 && field517 < 50) {
                                                field518[field517] = var469;
                                                field519[field517] = var470;
                                                field520[field517] = var471;
                                                field522[field517] = null;
                                                field282[field517] = 0;
                                                field517++;
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 32) {
                                            field474 = field319.method2291();
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 85) {
                                            int var475 = field319.method2296();
                                            int var476 = field319.method2293();
                                            if (var475 < -70000) {
                                                var476 += 32768;
                                            }
                                            class173 var477;
                                            if (var475 >= 0) {
                                                var477 = class173.method708(var475);
                                            } else {
                                                var477 = null;
                                            }
                                            if (var477 != null) {
                                                for (int var478 = 0; var478 < var477.field2857.length; var478++) {
                                                    var477.field2857[var478] = 0;
                                                    var477.field2858[var478] = 0;
                                                }
                                            }
                                            class16.method663(var476);
                                            int var479 = field319.method2293();
                                            for (int var480 = 0; var480 < var479; var480++) {
                                                int var481 = field319.method2427();
                                                int var482 = field319.method2291();
                                                if (var482 == 255) {
                                                    var482 = field319.method2418();
                                                }
                                                if (var477 != null && var480 < var477.field2857.length) {
                                                    var477.field2857[var480] = var481;
                                                    var477.field2858[var480] = var482;
                                                }
                                                class16.method2898(var476, var480, var481 - 1, var482);
                                            }
                                            if (var477 != null) {
                                                method643(var477);
                                            }
                                            method3152();
                                            field463[++field382 - 1 & 0x1F] = var476 & 0x7FFF;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 237) {
                                            String var483 = field319.method2299();
                                            long var484 = field319.method2297();
                                            long var486 = (long) field319.method2293();
                                            long var488 = (long) field319.method2402();
                                            class152[] var490 = new class152[] { class152.field2237, class152.field2234, class152.field2236, class152.field2242, class152.field2235 };
                                            class152 var491 = (class152) class109.method2565(var490, field319.method2291());
                                            long var492 = (var486 << 32) + var488;
                                            boolean var494 = false;
                                            for (int var495 = 0; var495 < 100; var495++) {
                                                if (field496[var495] == var492) {
                                                    var494 = true;
                                                    break;
                                                }
                                            }
                                            if (var491.field2241 && method109(var483)) {
                                                var494 = true;
                                            }
                                            if (!var494 && field403 == 0) {
                                                field496[field497] = var492;
                                                field497 = (field497 + 1) % 100;
                                                class122 var496 = field319;
                                                String var500;
                                                try {
                                                    int var497 = var496.method2301();
                                                    if (var497 > 32767) {
                                                        var497 = 32767;
                                                    }
                                                    byte[] var498 = new byte[var497];
                                                    var496.field1955 += Statics.field3157.method2213(var496.field1956, var496.field1955, var498, 0, var497);
                                                    String var499 = class165.method92(var498, 0, var497);
                                                    var500 = var499;
                                                } catch (Exception var601) {
                                                    var500 = "Cabbage";
                                                }
                                                String var503 = class223.method3736(class163.method961(var500));
                                                if (var491.field2239 == -1) {
                                                    class12.method126(9, var483, var503, class162.method1549(var484));
                                                } else {
                                                    class12.method126(9, class2.method2000(var491.field2239) + var483, var503, class162.method1549(var484));
                                                }
                                            }
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 49) {
                                            String var504 = field319.method2299();
                                            int var505 = field319.method2293();
                                            byte var506 = field319.method2292();
                                            boolean var507 = false;
                                            if (var506 == -128) {
                                                var507 = true;
                                            }
                                            if (var507) {
                                                if (Statics.field91 == 0) {
                                                    field321 = -1;
                                                    var232 = true;
                                                    break label3823;
                                                }
                                                boolean var508 = false;
                                                int var509;
                                                for (var509 = 0; var509 < Statics.field91 && (!Statics.field209[var509].field617.equals(var504) || Statics.field209[var509].field619 != var505); var509++) {
                                                }
                                                if (var509 < Statics.field91) {
                                                    while (var509 < Statics.field91 - 1) {
                                                        Statics.field209[var509] = Statics.field209[var509 + 1];
                                                        var509++;
                                                    }
                                                    Statics.field91--;
                                                    Statics.field209[Statics.field91] = null;
                                                }
                                            } else {
                                                field319.method2299();
                                                class25 var510 = new class25();
                                                var510.field617 = var504;
                                                var510.field618 = Statics.method716(var510.field617, Statics.field1742);
                                                var510.field619 = var505;
                                                var510.field621 = var506;
                                                int var511;
                                                for (var511 = Statics.field91 - 1; var511 >= 0; var511--) {
                                                    int var512 = Statics.field209[var511].field618.compareTo(var510.field618);
                                                    if (var512 == 0) {
                                                        Statics.field209[var511].field619 = var505;
                                                        Statics.field209[var511].field621 = var506;
                                                        if (var504.equals(Statics.field2644.field35)) {
                                                            Statics.field1930 = var506;
                                                        }
                                                        field469 = field460;
                                                        field321 = -1;
                                                        var232 = true;
                                                        break label3823;
                                                    }
                                                    if (var512 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field91 >= Statics.field209.length) {
                                                    field321 = -1;
                                                    var232 = true;
                                                    break label3823;
                                                }
                                                for (int var513 = Statics.field91 - 1; var513 > var511; var513--) {
                                                    Statics.field209[var513 + 1] = Statics.field209[var513];
                                                }
                                                if (Statics.field91 == 0) {
                                                    Statics.field209 = new class25[100];
                                                }
                                                Statics.field209[var511 + 1] = var510;
                                                Statics.field91++;
                                                if (var504.equals(Statics.field2644.field35)) {
                                                    Statics.field1930 = var506;
                                                }
                                            }
                                            field469 = field460;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 123) {
                                            method3152();
                                            field441 = field319.method2439();
                                            field472 = field460;
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        if (field321 == 7) {
                                            method1525(true);
                                            field321 = -1;
                                            var232 = true;
                                            break label3823;
                                        }
                                        class148.method2598("" + field321 + class2.field19 + field325 + class2.field19 + field326 + class2.field19 + field320, (Throwable) null);
                                        method683();
                                    } catch (IOException var608) {
                                        method124();
                                    } catch (Exception var609) {
                                        String var516 = "" + field321 + class2.field19 + field325 + class2.field19 + field326 + class2.field19 + field320 + class2.field19 + (Statics.field14 + Statics.field2644.field866[0]) + class2.field19 + (Statics.field1436 + Statics.field2644.field867[0]) + class2.field19;
                                        for (int var517 = 0; var517 < field320 && var517 < 50; var517++) {
                                            var516 = var516 + field319.field1956[var517] + class2.field19;
                                        }
                                        class148.method2598(var516, var609);
                                        method683();
                                    }
                                    var232 = true;
                                }
                            }
                            if (!var232) {
                                break;
                            }
                        }
                        if (field379 == 30) {
                            while (class211.method3237()) {
                                field317.method2544(132);
                                field317.method2276(0);
                                int var518 = field317.field1955;
                                class211.method709(field317);
                                field317.method2450(field317.field1955 - var518);
                            }
                            Object var519 = Statics.field1929.field185;
                            synchronized (Statics.field1929.field185) {
                                if (!field272) {
                                    Statics.field1929.field190 = 0;
                                } else if (class140.field2122 != 0 || Statics.field1929.field190 >= 40) {
                                    field317.method2544(194);
                                    field317.method2276(0);
                                    int var520 = field317.field1955;
                                    int var521 = 0;
                                    for (int var522 = 0; var522 < Statics.field1929.field190 && field317.field1955 - var520 < 240; var522++) {
                                        var521++;
                                        int var523 = Statics.field1929.field188[var522];
                                        if (var523 < 0) {
                                            var523 = 0;
                                        } else if (var523 > 502) {
                                            var523 = 502;
                                        }
                                        int var524 = Statics.field1929.field187[var522];
                                        if (var524 < 0) {
                                            var524 = 0;
                                        } else if (var524 > 764) {
                                            var524 = 764;
                                        }
                                        int var525 = var523 * 765 + var524;
                                        if (Statics.field1929.field188[var522] == -1 && Statics.field1929.field187[var522] == -1) {
                                            var524 = -1;
                                            var523 = -1;
                                            var525 = 524287;
                                        }
                                        if (field287 != var524 || field288 != var523) {
                                            int var526 = var524 - field287;
                                            field287 = var524;
                                            int var527 = var523 - field288;
                                            field288 = var523;
                                            if (field289 < 8 && var526 >= -32 && var526 <= 31 && var527 >= -32 && var527 <= 31) {
                                                var526 += 32;
                                                var527 += 32;
                                                field317.method2451((field289 << 12) + (var526 << 6) + var527);
                                                field289 = 0;
                                            } else if (field289 < 8) {
                                                field317.method2278((field289 << 19) + 8388608 + var525);
                                                field289 = 0;
                                            } else {
                                                field317.method2484((field289 << 19) + -1073741824 + var525);
                                                field289 = 0;
                                            }
                                        } else if (field289 < 2047) {
                                            field289++;
                                        }
                                    }
                                    field317.method2450(field317.field1955 - var520);
                                    if (var521 >= Statics.field1929.field190) {
                                        Statics.field1929.field190 = 0;
                                    } else {
                                        Statics.field1929.field190 -= var521;
                                        for (int var528 = 0; var528 < Statics.field1929.field190; var528++) {
                                            Statics.field1929.field187[var528] = Statics.field1929.field187[var521 + var528];
                                            Statics.field1929.field188[var528] = Statics.field1929.field188[var521 + var528];
                                        }
                                    }
                                }
                            }
                            if (class140.field2122 == 1 || !Statics.field208 && class140.field2122 == 4 || class140.field2122 == 2) {
                                long var530 = (class140.field2121 - field286 * -1L) / 50L;
                                if (var530 > 4095L) {
                                    var530 = 4095L;
                                }
                                field286 = class140.field2121 * -1L;
                                int var532 = class140.field2117;
                                if (var532 < 0) {
                                    var532 = 0;
                                } else if (var532 > Statics.field776) {
                                    var532 = Statics.field776;
                                }
                                int var533 = class140.field2123;
                                if (var533 < 0) {
                                    var533 = 0;
                                } else if (var533 > Statics.field1604) {
                                    var533 = Statics.field1604;
                                }
                                int var534 = (int) var530;
                                field317.method2544(250);
                                field317.method2451((class140.field2122 == 2 ? 1 : 0) + (var534 << 1));
                                field317.method2451(var533);
                                field317.method2451(var532);
                            }
                            if (class137.field2090 > 0) {
                                field317.method2544(189);
                                field317.method2451(0);
                                int var535 = field317.field1955;
                                long var536 = class115.method2622();
                                for (int var538 = 0; var538 < class137.field2090; var538++) {
                                    long var539 = var536 - field501;
                                    if (var539 > 16777215L) {
                                        var539 = 16777215L;
                                    }
                                    field501 = var536;
                                    field317.method2315(class137.field2069[var538]);
                                    field317.method2330((int) var539);
                                }
                                field317.method2328(field317.field1955 - var535);
                            }
                            if (field368 > 0) {
                                field368--;
                            }
                            if (class137.field2075[96] || class137.field2075[97] || class137.field2075[98] || class137.field2075[99]) {
                                field276 = true;
                            }
                            if (field276 && field368 <= 0) {
                                field368 = 20;
                                field276 = false;
                                field317.method2544(93);
                                field317.method2323(field362);
                                field317.method2325(field435);
                            }
                            if (Statics.field2691 && !field533) {
                                field533 = true;
                                field317.method2544(94);
                                field317.method2276(1);
                            }
                            if (!Statics.field2691 && field533) {
                                field533 = false;
                                field317.method2544(94);
                                field317.method2276(0);
                            }
                            method161();
                            if (field379 == 30) {
                                method171();
                                method946();
                                field363++;
                                if (field363 > 750) {
                                    method124();
                                } else {
                                    method125();
                                    method2902();
                                    method102();
                                    field397++;
                                    if (field521 != 0) {
                                        field277 += 20;
                                        if (field277 >= 400) {
                                            field521 = 0;
                                        }
                                    }
                                    if (Statics.field230 != null) {
                                        field389++;
                                        if (field389 >= 15) {
                                            method643(Statics.field230);
                                            Statics.field230 = null;
                                        }
                                    }
                                    class173 var541 = Statics.field1841;
                                    class173 var542 = Statics.field165;
                                    Statics.field1841 = null;
                                    Statics.field165 = null;
                                    field452 = null;
                                    field456 = false;
                                    field453 = false;
                                    field417 = 0;
                                    while (true) {
                                        while (Statics.method2752() && field417 < 128) {
                                            if (field442 >= 2 && class137.field2075[82] && Statics.field2230 == 66) {
                                                String var543 = "";
                                                Iterator var544 = class12.field171.iterator();
                                                while (var544.hasNext()) {
                                                    class36 var545 = (class36) var544.next();
                                                    var543 = var543 + var545.field786 + ':' + var545.field788 + '\n';
                                                }
                                                Statics.field1060.setContents(new StringSelection(var543), (ClipboardOwner) null);
                                            } else {
                                                field500[field417] = Statics.field2230;
                                                field479[field417] = Statics.field167;
                                                field417++;
                                            }
                                        }
                                        if (field284 != -1) {
                                            method2891(field284, 0, 0, Statics.field1604, Statics.field776, 0, 0);
                                        }
                                        field460++;
                                        while (true) {
                                            class1 var548;
                                            class173 var549;
                                            class173 var550;
                                            do {
                                                var548 = (class1) field475.method3556();
                                                if (var548 == null) {
                                                    while (true) {
                                                        class1 var551;
                                                        class173 var552;
                                                        class173 var553;
                                                        do {
                                                            var551 = (class1) field476.method3556();
                                                            if (var551 == null) {
                                                                while (true) {
                                                                    class1 var554;
                                                                    class173 var555;
                                                                    class173 var556;
                                                                    do {
                                                                        var554 = (class1) field458.method3556();
                                                                        if (var554 == null) {
                                                                            method3214();
                                                                            if (field528 != null) {
                                                                                method643(field528);
                                                                                Statics.field920++;
                                                                                if (field456 && field453) {
                                                                                    int var557 = class140.field2116;
                                                                                    int var558 = class140.field2120;
                                                                                    int var559 = var557 - field450;
                                                                                    int var560 = var558 - field451;
                                                                                    if (var559 < field484) {
                                                                                        var559 = field484;
                                                                                    }
                                                                                    if (field528.field2855 + var559 > field484 + field449.field2855) {
                                                                                        var559 = field484 + field449.field2855 - field528.field2855;
                                                                                    }
                                                                                    if (var560 < field455) {
                                                                                        var560 = field455;
                                                                                    }
                                                                                    if (field528.field2740 + var560 > field455 + field449.field2740) {
                                                                                        var560 = field455 + field449.field2740 - field528.field2740;
                                                                                    }
                                                                                    int var561 = var559 - field457;
                                                                                    int var562 = var560 - field415;
                                                                                    int var563 = field528.field2815;
                                                                                    if (Statics.field920 > field528.field2836 && (var561 > var563 || var561 < -var563 || var562 > var563 || var562 < -var563)) {
                                                                                        field459 = true;
                                                                                    }
                                                                                    int var564 = field449.field2826 + (var559 - field484);
                                                                                    int var565 = field449.field2763 + (var560 - field455);
                                                                                    if (field528.field2828 != null && field459) {
                                                                                        class1 var566 = new class1();
                                                                                        var566.field3 = field528;
                                                                                        var566.field4 = var564;
                                                                                        var566.field5 = var565;
                                                                                        var566.field17 = field528.field2828;
                                                                                        class37.method103(var566);
                                                                                    }
                                                                                    if (class140.field2115 == 0) {
                                                                                        if (field459) {
                                                                                            if (field528.field2829 != null) {
                                                                                                class1 var567 = new class1();
                                                                                                var567.field3 = field528;
                                                                                                var567.field4 = var564;
                                                                                                var567.field5 = var565;
                                                                                                var567.field7 = field452;
                                                                                                var567.field17 = field528.field2829;
                                                                                                class37.method103(var567);
                                                                                            }
                                                                                            if (field452 != null && method635(field528) != null) {
                                                                                                field317.method2544(154);
                                                                                                field317.method2323(field452.field2742);
                                                                                                field317.method2405(field528.field2822);
                                                                                                field317.method2451(field528.field2742);
                                                                                                field317.method2325(field452.field2859);
                                                                                                field317.method2323(field528.field2859);
                                                                                                field317.method2405(field452.field2822);
                                                                                            }
                                                                                        } else if ((field271 == 1 || method1896(field342 - 1)) && field342 > 2) {
                                                                                            method3205(field457 + field450, field451 + field415);
                                                                                        } else if (field342 > 0) {
                                                                                            method3071(field457 + field450, field451 + field415);
                                                                                        }
                                                                                        field528 = null;
                                                                                    }
                                                                                } else if (Statics.field920 > 1) {
                                                                                    field528 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field1096 != null) {
                                                                                method643(Statics.field1096);
                                                                                field365++;
                                                                                if (class140.field2115 == 0) {
                                                                                    if (field395) {
                                                                                        if (Statics.field62 == Statics.field1096 && field394 != field391) {
                                                                                            class173 var568 = Statics.field1096;
                                                                                            byte var569 = 0;
                                                                                            if (field504 == 1 && var568.field2834 == 206) {
                                                                                                var569 = 1;
                                                                                            }
                                                                                            if (var568.field2857[field394] <= 0) {
                                                                                                var569 = 0;
                                                                                            }
                                                                                            int var570 = method1035(var568);
                                                                                            boolean var571 = (var570 >> 29 & 0x1) != 0;
                                                                                            if (var571) {
                                                                                                int var572 = field391;
                                                                                                int var573 = field394;
                                                                                                var568.field2857[var573] = var568.field2857[var572];
                                                                                                var568.field2858[var573] = var568.field2858[var572];
                                                                                                var568.field2857[var572] = -1;
                                                                                                var568.field2858[var572] = 0;
                                                                                            } else if (var569 == 1) {
                                                                                                int var574 = field391;
                                                                                                int var575 = field394;
                                                                                                while (var574 != var575) {
                                                                                                    if (var574 > var575) {
                                                                                                        var568.method3182(var574 - 1, var574);
                                                                                                        var574--;
                                                                                                    } else if (var574 < var575) {
                                                                                                        var568.method3182(var574 + 1, var574);
                                                                                                        var574++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var568.method3182(field394, field391);
                                                                                            }
                                                                                            field317.method2544(124);
                                                                                            field317.method2334(Statics.field1096.field2822);
                                                                                            field317.method2400(var569);
                                                                                            field317.method2325(field394);
                                                                                            field317.method2451(field391);
                                                                                        }
                                                                                    } else if ((field271 == 1 || method1896(field342 - 1)) && field342 > 2) {
                                                                                        method3205(field510, field373);
                                                                                    } else if (field342 > 0) {
                                                                                        method3071(field510, field373);
                                                                                    }
                                                                                    field389 = 10;
                                                                                    class140.field2122 = 0;
                                                                                    Statics.field1096 = null;
                                                                                } else if (field365 >= 5 && (class140.field2116 > field510 + 5 || class140.field2116 < field510 - 5 || class140.field2120 > field373 + 5 || class140.field2120 < field373 - 5)) {
                                                                                    field395 = true;
                                                                                }
                                                                            }
                                                                            if (class86.field1473 != -1) {
                                                                                int var576 = class86.field1473;
                                                                                int var577 = class86.field1491;
                                                                                field317.method2544(142);
                                                                                field317.method2276(5);
                                                                                field317.method2315(class137.field2075[82] ? (class137.field2075[81] ? 2 : 1) : 0);
                                                                                field317.method2451(Statics.field1436 + var577);
                                                                                field317.method2323(Statics.field14 + var576);
                                                                                class86.field1473 = -1;
                                                                                field385 = class140.field2123;
                                                                                field386 = class140.field2117;
                                                                                field521 = 1;
                                                                                field277 = 0;
                                                                                field523 = var576;
                                                                                field492 = var577;
                                                                            }
                                                                            if (Statics.field1841 != var541) {
                                                                                if (var541 != null) {
                                                                                    method643(var541);
                                                                                }
                                                                                if (Statics.field1841 != null) {
                                                                                    method643(Statics.field1841);
                                                                                }
                                                                            }
                                                                            if (Statics.field165 != var542 && field426 == field348) {
                                                                                if (var542 != null) {
                                                                                    method643(var542);
                                                                                }
                                                                                if (Statics.field165 != null) {
                                                                                    method643(Statics.field165);
                                                                                }
                                                                            }
                                                                            if (Statics.field165 == null) {
                                                                                if (field426 > 0) {
                                                                                    field426--;
                                                                                }
                                                                            } else if (field426 < field348) {
                                                                                field426++;
                                                                                if (field426 == field348) {
                                                                                    method643(Statics.field165);
                                                                                }
                                                                            }
                                                                            method48();
                                                                            if (field508) {
                                                                                int var578 = Statics.field2264 * 128 + 64;
                                                                                int var579 = Statics.field1090 * 128 + 64;
                                                                                int var580 = method2209(var578, var579, Statics.field2983) - Statics.field126;
                                                                                if (Statics.field1366 < var578) {
                                                                                    Statics.field1366 += Statics.field558 * (var578 - Statics.field1366) / 1000 + Statics.field1844;
                                                                                    if (Statics.field1366 > var578) {
                                                                                        Statics.field1366 = var578;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1366 > var578) {
                                                                                    Statics.field1366 -= Statics.field558 * (Statics.field1366 - var578) / 1000 + Statics.field1844;
                                                                                    if (Statics.field1366 < var578) {
                                                                                        Statics.field1366 = var578;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1071 < var580) {
                                                                                    Statics.field1071 += Statics.field558 * (var580 - Statics.field1071) / 1000 + Statics.field1844;
                                                                                    if (Statics.field1071 > var580) {
                                                                                        Statics.field1071 = var580;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1071 > var580) {
                                                                                    Statics.field1071 -= Statics.field558 * (Statics.field1071 - var580) / 1000 + Statics.field1844;
                                                                                    if (Statics.field1071 < var580) {
                                                                                        Statics.field1071 = var580;
                                                                                    }
                                                                                }
                                                                                if (Statics.field2126 < var579) {
                                                                                    Statics.field2126 += Statics.field558 * (var579 - Statics.field2126) / 1000 + Statics.field1844;
                                                                                    if (Statics.field2126 > var579) {
                                                                                        Statics.field2126 = var579;
                                                                                    }
                                                                                }
                                                                                if (Statics.field2126 > var579) {
                                                                                    Statics.field2126 -= Statics.field558 * (Statics.field2126 - var579) / 1000 + Statics.field1844;
                                                                                    if (Statics.field2126 < var579) {
                                                                                        Statics.field2126 = var579;
                                                                                    }
                                                                                }
                                                                                int var581 = Statics.field622 * 128 + 64;
                                                                                int var582 = Statics.field191 * 128 + 64;
                                                                                int var583 = method2209(var581, var582, Statics.field2983) - Statics.field1729;
                                                                                int var584 = var581 - Statics.field1366;
                                                                                int var585 = var583 - Statics.field1071;
                                                                                int var586 = var582 - Statics.field2126;
                                                                                int var587 = (int) Math.sqrt((double) (var584 * var584 + var586 * var586));
                                                                                int var588 = (int) (Math.atan2((double) var585, (double) var587) * 325.949D) & 0x7FF;
                                                                                int var589 = (int) (Math.atan2((double) var584, (double) var586) * -325.949D) & 0x7FF;
                                                                                if (var588 < 128) {
                                                                                    var588 = 128;
                                                                                }
                                                                                if (var588 > 383) {
                                                                                    var588 = 383;
                                                                                }
                                                                                if (Statics.field28 < var588) {
                                                                                    Statics.field28 += Statics.field1083 * (var588 - Statics.field28) / 1000 + Statics.field589;
                                                                                    if (Statics.field28 > var588) {
                                                                                        Statics.field28 = var588;
                                                                                    }
                                                                                }
                                                                                if (Statics.field28 > var588) {
                                                                                    Statics.field28 -= Statics.field1083 * (Statics.field28 - var588) / 1000 + Statics.field589;
                                                                                    if (Statics.field28 < var588) {
                                                                                        Statics.field28 = var588;
                                                                                    }
                                                                                }
                                                                                int var590 = var589 - Statics.field633;
                                                                                if (var590 > 1024) {
                                                                                    var590 -= 2048;
                                                                                }
                                                                                if (var590 < -1024) {
                                                                                    var590 += 2048;
                                                                                }
                                                                                if (var590 > 0) {
                                                                                    Statics.field633 += Statics.field1083 * var590 / 1000 + Statics.field589;
                                                                                    Statics.field633 &= 0x7FF;
                                                                                }
                                                                                if (var590 < 0) {
                                                                                    Statics.field633 -= Statics.field1083 * -var590 / 1000 + Statics.field589;
                                                                                    Statics.field633 &= 0x7FF;
                                                                                }
                                                                                int var591 = var589 - Statics.field633;
                                                                                if (var591 > 1024) {
                                                                                    var591 -= 2048;
                                                                                }
                                                                                if (var591 < -1024) {
                                                                                    var591 += 2048;
                                                                                }
                                                                                if (var591 < 0 && var590 > 0 || var591 > 0 && var590 < 0) {
                                                                                    Statics.field633 = var589;
                                                                                }
                                                                            }
                                                                            for (int var592 = 0; var592 < 5; var592++) {
                                                                                var10002 = field292[var592]++;
                                                                            }
                                                                            Statics.field2670.method197();
                                                                            int var593 = ++class140.field2111 - 1;
                                                                            int var595 = class137.method3196();
                                                                            if (var593 > 15000 && var595 > 15000) {
                                                                                field327 = 250;
                                                                                class140.field2111 = 14500;
                                                                                field317.method2544(120);
                                                                            }
                                                                            field378++;
                                                                            if (field378 > 500) {
                                                                                field378 = 0;
                                                                                int var596 = (int) (Math.random() * 8.0D);
                                                                                if ((var596 & 0x1) == 1) {
                                                                                    field338 += field339;
                                                                                }
                                                                                if ((var596 & 0x2) == 2) {
                                                                                    field340 += field341;
                                                                                }
                                                                                if ((var596 & 0x4) == 4) {
                                                                                    field369 += field343;
                                                                                }
                                                                            }
                                                                            if (field338 < -50) {
                                                                                field339 = 2;
                                                                            }
                                                                            if (field338 > 50) {
                                                                                field339 = -2;
                                                                            }
                                                                            if (field340 < -55) {
                                                                                field341 = 2;
                                                                            }
                                                                            if (field340 > 55) {
                                                                                field341 = -2;
                                                                            }
                                                                            if (field369 < -40) {
                                                                                field343 = 1;
                                                                            }
                                                                            if (field369 > 40) {
                                                                                field343 = -1;
                                                                            }
                                                                            field349++;
                                                                            if (field349 > 500) {
                                                                                field349 = 0;
                                                                                int var597 = (int) (Math.random() * 8.0D);
                                                                                if ((var597 & 0x1) == 1) {
                                                                                    field345 += field346;
                                                                                }
                                                                                if ((var597 & 0x2) == 2) {
                                                                                    field347 += field494;
                                                                                }
                                                                            }
                                                                            if (field345 < -60) {
                                                                                field346 = 2;
                                                                            }
                                                                            if (field345 > 60) {
                                                                                field346 = -2;
                                                                            }
                                                                            if (field347 < -20) {
                                                                                field494 = 1;
                                                                            }
                                                                            if (field347 > 10) {
                                                                                field494 = -1;
                                                                            }
                                                                            for (class39 var598 = (class39) field545.method3513(); var598 != null; var598 = (class39) field545.method3512()) {
                                                                                if ((long) var598.field872 < class115.method2622() / 1000L - 5L) {
                                                                                    if (var598.field874 > 0) {
                                                                                        class12.method156(5, "", var598.field879 + class157.field2433);
                                                                                    }
                                                                                    if (var598.field874 == 0) {
                                                                                        class12.method156(5, "", var598.field879 + class157.field2434);
                                                                                    }
                                                                                    var598.method3643();
                                                                                }
                                                                            }
                                                                            field323++;
                                                                            if (field323 > 50) {
                                                                                field317.method2544(125);
                                                                            }
                                                                            try {
                                                                                if (Statics.field254 != null && field317.field1955 > 0) {
                                                                                    Statics.field254.method2767(field317.field1956, 0, field317.field1955);
                                                                                    field317.field1955 = 0;
                                                                                    field323 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var600) {
                                                                                method124();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var555 = var554.field3;
                                                                        if (var555.field2742 < 0) {
                                                                            break;
                                                                        }
                                                                        var556 = class173.method708(var555.field2802);
                                                                    } while (var556 == null || var556.field2811 == null || var555.field2742 >= var556.field2811.length || var556.field2811[var555.field2742] != var555);
                                                                    class37.method103(var554);
                                                                }
                                                            }
                                                            var552 = var551.field3;
                                                            if (var552.field2742 < 0) {
                                                                break;
                                                            }
                                                            var553 = class173.method708(var552.field2802);
                                                        } while (var553 == null || var553.field2811 == null || var552.field2742 >= var553.field2811.length || var553.field2811[var552.field2742] != var552);
                                                        class37.method103(var551);
                                                    }
                                                }
                                                var549 = var548.field3;
                                                if (var549.field2742 < 0) {
                                                    break;
                                                }
                                                var550 = class173.method708(var549.field2802);
                                            } while (var550 == null || var550.field2811 == null || var549.field2742 >= var550.field2811.length || var550.field2811[var549.field2742] != var549);
                                            class37.method103(var548);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field379 == 40 || field379 == 45) {
                    method2211();
                }
                return;
            }
            var2.field2685.method3077(var2.field2686, (int) var2.field3096, var2.field2684, false);
        }
    }

    @ObfuscatedName("client.i(B)V")
    public final void method329() {
        boolean var1 = class183.method3247();
        if (var1 && field514 && Statics.field1936 != null) {
            Statics.field1936.method1139();
        }
        if (field379 == 10 || field379 == 20 || field379 == 30) {
            if (field488 != 0L && class115.method2622() > field488) {
                int var2 = method591();
                field488 = 0L;
                if (var2 >= 2) {
                    field489 = true;
                } else {
                    field489 = false;
                }
                method611();
                if (field379 >= 25) {
                    field317.method2544(160);
                    field317.method2276(method591());
                    field317.method2451(Statics.field1604);
                    field317.method2451(Statics.field776);
                }
                field2171 = true;
            } else if (field2159) {
                Canvas var3 = Statics.field1839;
                var3.removeKeyListener(class137.field2087);
                var3.removeFocusListener(class137.field2087);
                class137.field2086 = -1;
                class140.method2223(Statics.field1839);
                if (Statics.field29 != null) {
                    Statics.field29.method2613(Statics.field1839);
                }
                Statics.field3099.method2791();
                Statics.field1839.setBackground(Color.black);
                Canvas var4 = Statics.field1839;
                var4.setFocusTraversalKeysEnabled(false);
                var4.addKeyListener(class137.field2087);
                var4.addFocusListener(class137.field2087);
                Canvas var5 = Statics.field1839;
                var5.addMouseListener(class140.field2114);
                var5.addMouseMotionListener(class140.field2114);
                var5.addFocusListener(class140.field2114);
                if (Statics.field29 != null) {
                    Statics.field29.method2614(Statics.field1839);
                }
                if (field284 != -1) {
                    int var6 = field284;
                    int var7 = Statics.field1604;
                    int var8 = Statics.field776;
                    if (class173.method4(var6)) {
                        method173(Statics.field2827[var6], -1, var7, var8, false);
                    }
                }
                field2173 = true;
            }
        }
        Dimension var9 = this.method2820();
        if (Statics.field1848 != var9.width || Statics.field559 != var9.height || field2173) {
            method611();
            field488 = class115.method2622() + 500L;
            field2173 = false;
        }
        boolean var10 = false;
        if (field2171) {
            field2171 = false;
            var10 = true;
            for (int var11 = 0; var11 < 100; var11++) {
                field480[var11] = true;
            }
        }
        if (var10) {
            method159();
        }
        if (field379 == 0) {
            class144.method130(class32.field730, class32.field731, (Color) null, var10);
        } else if (field379 == 5) {
            class32.method909(Statics.field1645, Statics.field2143, Statics.field766, var10);
        } else if (field379 == 10 || field379 == 11) {
            class32.method909(Statics.field1645, Statics.field2143, Statics.field766, var10);
        } else if (field379 == 20) {
            class32.method909(Statics.field1645, Statics.field2143, Statics.field766, var10);
        } else if (field379 == 25) {
            if (field333 == 1) {
                if (field329 > field506) {
                    field506 = field329;
                }
                int var12 = (field506 * 50 - field329 * 50) / field506;
                method2225(class157.field2295 + class2.field18 + class2.field21 + var12 + "%" + class2.field22, false);
            } else if (field333 == 2) {
                if (field499 > field332) {
                    field332 = field499;
                }
                int var13 = (field332 * 50 - field499 * 50) / field332 + 50;
                method2225(class157.field2295 + class2.field18 + class2.field21 + var13 + "%" + class2.field22, false);
            } else {
                method2225(class157.field2295, false);
            }
        } else if (field379 == 30) {
            method1733();
        } else if (field379 == 40) {
            method2225(class157.field2296 + class2.field18 + class157.field2482, false);
        } else if (field379 == 45) {
            method2225(class157.field2287, false);
        }
        if (field379 == 30 && field370 == 0 && !var10) {
            try {
                Graphics var14 = Statics.field1839.getGraphics();
                for (int var15 = 0; var15 < field478; var15++) {
                    if (field511[var15]) {
                        Statics.field211.method1487(var14, field483[var15], field322[var15], field485[var15], field495[var15]);
                        field511[var15] = false;
                    }
                }
            } catch (Exception var21) {
                Statics.field1839.repaint();
            }
        } else if (field379 > 0) {
            try {
                Graphics var17 = Statics.field1839.getGraphics();
                Statics.field211.method1486(var17, 0, 0);
                for (int var18 = 0; var18 < field478; var18++) {
                    field511[var18] = false;
                }
            } catch (Exception var20) {
                Statics.field1839.repaint();
            }
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method234() {
        if (Statics.field2670.method222()) {
            Statics.field2670.method195();
        }
        if (Statics.field1929 != null) {
            Statics.field1929.field184 = false;
        }
        Statics.field1929 = null;
        if (Statics.field254 != null) {
            Statics.field254.method2763();
            Statics.field254 = null;
        }
        class137.method2899();
        class140.method110();
        Statics.field29 = null;
        if (Statics.field1936 != null) {
            Statics.field1936.method1140();
        }
        if (Statics.field2677 != null) {
            Statics.field2677.method1140();
        }
        class171.method634();
        class170.method2205();
        try {
            class149.field2204.method3841();
            for (int var1 = 0; var1 < Statics.field3192; var1++) {
                Statics.field2206[var1].method3841();
            }
            class149.field2205.method3841();
            class149.field2203.method3841();
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("q.m(II)V")
    public static void method145(int arg0) {
        if (field379 == arg0) {
            return;
        }
        if (field379 == 0) {
            class144.method2164();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field392 = 0;
            field308 = 0;
            field309 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field875 != null) {
            Statics.field875.method2763();
            Statics.field875 = null;
        }
        if (field379 == 25) {
            field333 = 0;
            field329 = 0;
            field506 = 1;
            field499 = 0;
            field332 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method1472(Statics.field1839, Statics.field579, Statics.field2154, true, 0);
        } else if (arg0 == 20) {
            Statics.method1472(Statics.field1839, Statics.field579, Statics.field2154, true, field379 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method1472(Statics.field1839, Statics.field579, Statics.field2154, false, 4);
        } else if (Statics.field740) {
            Statics.field726 = null;
            Statics.field710 = null;
            Statics.field1164 = null;
            Statics.field711 = null;
            Statics.field712 = null;
            Statics.field750 = null;
            Statics.field2988 = null;
            Statics.field739 = null;
            Statics.field715 = null;
            Statics.field1532 = null;
            Statics.field580 = null;
            Statics.field164 = null;
            Statics.field2255 = null;
            Statics.field203 = null;
            Statics.field2725 = null;
            Statics.field13 = null;
            Statics.field1004 = null;
            Statics.field707 = null;
            Statics.field706 = null;
            Statics.field2697 = null;
            Statics.field724 = null;
            Statics.field725 = null;
            class183.method3690(2);
            class171.method2578(true);
            Statics.field740 = false;
        }
        field379 = arg0;
    }

    @ObfuscatedName("client.r(B)V")
    public void method235() {
        if (field379 != 1000) {
            boolean var1 = class171.method158();
            if (!var1) {
                this.method236();
            }
        }
    }

    @ObfuscatedName("client.y(B)V")
    public void method236() {
        if (class171.field2713 >= 4) {
            this.method2794("js5crc");
            field379 = 1000;
            return;
        }
        if (class171.field2718 >= 4) {
            if (field379 <= 5) {
                this.method2794("js5io");
                field379 = 1000;
                return;
            }
            field438 = 3000;
            class171.field2718 = 3;
        }
        if (--field438 + 1 > 0) {
            return;
        }
        try {
            if (field303 == 0) {
                Statics.field2642 = Statics.field1993.method2660(Statics.field660, Statics.field2896);
                field303++;
            }
            if (field303 == 1) {
                if (Statics.field2642.field2184 == 2) {
                    this.method237(-1);
                    return;
                }
                if (Statics.field2642.field2184 == 1) {
                    field303++;
                }
            }
            if (field303 == 2) {
                Statics.field361 = new class143((Socket) Statics.field2642.field2188, Statics.field1993);
                class119 var1 = new class119(5);
                var1.method2276(15);
                var1.method2484(89);
                Statics.field361.method2767(var1.field1956, 0, 5);
                field303++;
                Statics.field561 = class115.method2622();
            }
            if (field303 == 3) {
                if (field379 <= 5 || Statics.field361.method2765() > 0) {
                    int var2 = Statics.field361.method2764();
                    if (var2 != 0) {
                        this.method237(var2);
                        return;
                    }
                    field303++;
                } else if (class115.method2622() - Statics.field561 > 30000L) {
                    this.method237(-2);
                    return;
                }
            }
            if (field303 == 4) {
                class143 var3 = Statics.field361;
                boolean var4 = field379 > 20;
                if (Statics.field2706 != null) {
                    try {
                        Statics.field2706.method2763();
                    } catch (Exception var14) {
                    }
                    Statics.field2706 = null;
                }
                Statics.field2706 = var3;
                class171.method2578(var4);
                class171.field2700.field1955 = 0;
                Statics.field1542 = null;
                Statics.field1589 = null;
                class171.field2712 = 0;
                while (true) {
                    class172 var6 = (class172) class171.field2708.method3520();
                    if (var6 == null) {
                        while (true) {
                            class172 var7 = (class172) class171.field2709.method3520();
                            if (var7 == null) {
                                if (class171.field2707 != 0) {
                                    try {
                                        class119 var8 = new class119(4);
                                        var8.method2276(4);
                                        var8.method2276(class171.field2707);
                                        var8.method2451(0);
                                        Statics.field2706.method2767(var8.field1956, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2706.method2763();
                                        } catch (Exception var12) {
                                        }
                                        class171.field2718++;
                                        Statics.field2706 = null;
                                    }
                                }
                                class171.field2699 = 0;
                                Statics.field2701 = class115.method2622();
                                Statics.field2642 = null;
                                Statics.field361 = null;
                                field303 = 0;
                                field306 = 0;
                                return;
                            }
                            class171.field2717.method3610(var7);
                            class171.field2705.method3531(var7, var7.field3096);
                            class171.field2704++;
                            class171.field2710--;
                        }
                    }
                    class171.field2702.method3531(var6, var6.field3096);
                    class171.field2703++;
                    class171.field2716--;
                }
            }
        } catch (IOException var15) {
            this.method237(-3);
        }
    }

    @ObfuscatedName("client.q(II)V")
    public void method237(int arg0) {
        Statics.field2642 = null;
        Statics.field361 = null;
        field303 = 0;
        if (Statics.field787 == Statics.field2896) {
            Statics.field2896 = Statics.field20;
        } else {
            Statics.field2896 = Statics.field787;
        }
        field306++;
        if (field306 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field379 <= 5) {
                this.method2794("js5connect_full");
                field379 = 1000;
            } else {
                field438 = 3000;
            }
        } else if (field306 >= 2 && arg0 == 6) {
            this.method2794("js5connect_outofdate");
            field379 = 1000;
        } else if (field306 >= 4) {
            if (field379 <= 5) {
                this.method2794("js5connect");
                field379 = 1000;
            } else {
                field438 = 3000;
            }
        }
    }

    @ObfuscatedName("b.f(I)V")
    public static void method227() {
        if (field302 == 0) {
            Statics.field1976 = new class86(4, 104, 104, class6.field85);
            for (int var0 = 0; var0 < 4; var0++) {
                field334[var0] = new class108(104, 104);
            }
            Statics.field560 = new class79(512, 512);
            class32.field731 = class157.field2298;
            class32.field730 = 5;
            field302 = 20;
        } else if (field302 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1566[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1770(var1, 500, 800, 512, 334);
            class32.field731 = class157.field2299;
            class32.field730 = 10;
            field302 = 30;
        } else if (field302 == 30) {
            Statics.field72 = method119(0, false, true, true);
            Statics.field1644 = method119(1, false, true, true);
            Statics.field2719 = method119(2, true, false, true);
            Statics.field2560 = method119(3, false, true, true);
            Statics.field1977 = method119(4, false, true, true);
            Statics.field169 = method119(5, true, true, true);
            Statics.field24 = method119(6, true, true, false);
            Statics.field1743 = method119(7, false, true, true);
            Statics.field2154 = method119(8, false, true, true);
            Statics.field801 = method119(9, false, true, true);
            Statics.field579 = method119(10, false, true, true);
            Statics.field259 = method119(11, false, true, true);
            Statics.field1746 = method119(12, false, true, true);
            Statics.field128 = method119(13, true, false, true);
            Statics.field213 = method119(14, false, true, false);
            Statics.field305 = method119(15, false, true, true);
            class32.field731 = class157.field2300;
            class32.field730 = 20;
            field302 = 40;
        } else if (field302 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field72.method3073() * 4 / 100;
            int var8 = var7 + Statics.field1644.method3073() * 4 / 100;
            int var9 = var8 + Statics.field2719.method3073() * 2 / 100;
            int var10 = var9 + Statics.field2560.method3073() * 2 / 100;
            int var11 = var10 + Statics.field1977.method3073() * 6 / 100;
            int var12 = var11 + Statics.field169.method3073() * 4 / 100;
            int var13 = var12 + Statics.field24.method3073() * 2 / 100;
            int var14 = var13 + Statics.field1743.method3073() * 60 / 100;
            int var15 = var14 + Statics.field2154.method3073() * 2 / 100;
            int var16 = var15 + Statics.field801.method3073() * 2 / 100;
            int var17 = var16 + Statics.field579.method3073() * 2 / 100;
            int var18 = var17 + Statics.field259.method3073() * 2 / 100;
            int var19 = var18 + Statics.field1746.method3073() * 2 / 100;
            int var20 = var19 + Statics.field128.method3073() * 2 / 100;
            int var21 = var20 + Statics.field213.method3073() * 2 / 100;
            int var22 = var21 + Statics.field305.method3073() * 2 / 100;
            if (var22 == 100) {
                class32.field731 = class157.field2461;
                class32.field730 = 30;
                field302 = 45;
            } else {
                if (var22 != 0) {
                    class32.field731 = class157.field2301 + var22 + "%";
                }
                class32.field730 = 30;
            }
        } else if (field302 == 45) {
            class57.method1520(22050, !field278, 2);
            class184 var23 = new class184();
            var23.method3430(9, 128);
            Statics.field1936 = class57.method117(Statics.field1993, Statics.field1839, 0, 22050);
            Statics.field1936.method1143(var23);
            class183.method2759(Statics.field305, Statics.field213, Statics.field1977, var23);
            Statics.field2677 = class57.method117(Statics.field1993, Statics.field1839, 1, 2048);
            Statics.field198 = new class56();
            Statics.field2677.method1143(Statics.field198);
            Statics.field2273 = new class75(22050, Statics.field1191);
            class32.field731 = class157.field2403;
            class32.field730 = 35;
            field302 = 50;
        } else if (field302 == 50) {
            int var24 = 0;
            if (Statics.field2143 == null) {
                Statics.field2143 = class77.method2082(Statics.field2154, Statics.field128, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field766 == null) {
                Statics.field766 = class77.method2082(Statics.field2154, Statics.field128, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field1645 == null) {
                Statics.field1645 = class77.method2082(Statics.field2154, Statics.field128, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class32.field731 = class157.field2304 + var24 * 100 / 3 + "%";
                class32.field730 = 40;
            } else {
                Statics.field692 = new class160(true);
                class32.field731 = class157.field2305;
                class32.field730 = 40;
                field302 = 60;
            }
        } else if (field302 == 60) {
            class168 var25 = Statics.field579;
            class168 var26 = Statics.field2154;
            int var27 = 0;
            if (var25.method3012("title.jpg", "")) {
                var27++;
            }
            if (var26.method3012("logo", "")) {
                var27++;
            }
            if (var26.method3012("titlebox", "")) {
                var27++;
            }
            if (var26.method3012("titlebutton", "")) {
                var27++;
            }
            if (var26.method3012("runes", "")) {
                var27++;
            }
            if (var26.method3012("title_mute", "")) {
                var27++;
            }
            if (var26.method3007("options_radio_buttons,0")) {
                var27++;
            }
            if (var26.method3007("options_radio_buttons,2")) {
                var27++;
            }
            var26.method3012("sl_back", "");
            var26.method3012("sl_flags", "");
            var26.method3012("sl_arrows", "");
            var26.method3012("sl_stars", "");
            var26.method3012("sl_button", "");
            int var30 = class32.method719();
            if (var27 < var30) {
                class32.field731 = class157.field2306 + var27 * 100 / var30 + "%";
                class32.field730 = 50;
            } else {
                class32.field731 = class157.field2307;
                class32.field730 = 50;
                method145(5);
                field302 = 70;
            }
        } else if (field302 == 70) {
            if (Statics.field2719.method2999()) {
                class168 var31 = Statics.field2719;
                Statics.field1051 = var31;
                class168 var32 = Statics.field2719;
                Statics.field977 = var32;
                class168 var33 = Statics.field2719;
                class168 var34 = Statics.field1743;
                Statics.field1029 = var33;
                Statics.field1031 = var34;
                Statics.field1033 = Statics.field1029.method3046(3);
                class41.method178(Statics.field2719, Statics.field1743, field278);
                class40.method1481(Statics.field2719, Statics.field1743);
                class52.method3476(Statics.field2719, Statics.field1743, field454, Statics.field2143);
                class43.method554(Statics.field2719, Statics.field72, Statics.field1644);
                class168 var35 = Statics.field2719;
                class168 var36 = Statics.field1743;
                Statics.field1010 = var35;
                Statics.field1006 = var36;
                class168 var37 = Statics.field2719;
                Statics.field1067 = var37;
                class53.method2081(Statics.field2719);
                class173.method1996(Statics.field2560, Statics.field1743, Statics.field2154, Statics.field128);
                class168 var38 = Statics.field2719;
                Statics.field1093 = var38;
                class168 var39 = Statics.field2719;
                Statics.field2897 = var39;
                class168 var40 = Statics.field2719;
                Statics.field1042 = var40;
                class168 var41 = Statics.field2719;
                Statics.field1089 = var41;
                Statics.field2670 = new class20();
                class32.field731 = class157.field2430;
                class32.field730 = 60;
                field302 = 80;
            } else {
                class32.field731 = class157.field2308 + Statics.field2719.method3080() + "%";
                class32.field730 = 60;
            }
        } else if (field302 == 80) {
            int var42 = 0;
            if (Statics.field1160 == null) {
                Statics.field1160 = class77.method1891(Statics.field2154, "compass", "");
            } else {
                var42++;
            }
            if (Statics.field573 == null) {
                Statics.field573 = class77.method1891(Statics.field2154, "mapedge", "");
            } else {
                var42++;
            }
            if (Statics.field186 == null) {
                Statics.field186 = class77.method706(Statics.field2154, "mapscene", "");
            } else {
                var42++;
            }
            if (Statics.field491 == null) {
                Statics.field491 = class77.method186(Statics.field2154, "mapfunction", "");
            } else {
                var42++;
            }
            if (Statics.field602 == null) {
                Statics.field602 = class77.method186(Statics.field2154, "hitmarks", "");
            } else {
                var42++;
            }
            if (Statics.field3191 == null) {
                Statics.field3191 = class77.method186(Statics.field2154, "headicons_pk", "");
            } else {
                var42++;
            }
            if (Statics.field1 == null) {
                Statics.field1 = class77.method186(Statics.field2154, "headicons_prayer", "");
            } else {
                var42++;
            }
            if (Statics.field1072 == null) {
                Statics.field1072 = class77.method186(Statics.field2154, "headicons_hint", "");
            } else {
                var42++;
            }
            if (Statics.field352 == null) {
                Statics.field352 = class77.method186(Statics.field2154, "mapmarker", "");
            } else {
                var42++;
            }
            if (Statics.field353 == null) {
                Statics.field353 = class77.method186(Statics.field2154, "cross", "");
            } else {
                var42++;
            }
            if (Statics.field354 == null) {
                Statics.field354 = class77.method186(Statics.field2154, "mapdots", "");
            } else {
                var42++;
            }
            if (Statics.field2024 == null) {
                Statics.field2024 = class77.method706(Statics.field2154, "scrollbar", "");
            } else {
                var42++;
            }
            if (Statics.field1380 == null) {
                Statics.field1380 = class77.method706(Statics.field2154, "mod_icons", "");
            } else {
                var42++;
            }
            if (var42 < 13) {
                class32.field731 = class157.field2310 + var42 * 100 / 13 + "%";
                class32.field730 = 70;
            } else {
                Statics.field3168 = Statics.field1380;
                Statics.field573.method1592();
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 21.0D) - 10;
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 41.0D) - 20;
                for (int var47 = 0; var47 < Statics.field491.length; var47++) {
                    Statics.field491[var47].method1566(var43 + var46, var44 + var46, var45 + var46);
                }
                Statics.field186[0].method1715(var43 + var46, var44 + var46, var45 + var46);
                class32.field731 = class157.field2311;
                class32.field730 = 70;
                field302 = 90;
            }
        } else if (field302 == 90) {
            if (Statics.field801.method2999()) {
                class95 var48 = new class95(Statics.field801, Statics.field2154, 20, 0.8D, field278 ? 64 : 128);
                class91.method1916(var48);
                class91.method1951(0.8D);
                class32.field731 = class157.field2313;
                class32.field730 = 90;
                field302 = 110;
            } else {
                class32.field731 = class157.field2528 + Statics.field801.method3080() + "%";
                class32.field730 = 90;
            }
        } else if (field302 == 110) {
            Statics.field1929 = new class14();
            Statics.field1993.method2680(Statics.field1929, 10);
            class32.field731 = class157.field2314;
            class32.field730 = 94;
            field302 = 120;
        } else if (field302 == 120) {
            if (Statics.field579.method3012("huffman", "")) {
                class113 var49 = new class113(Statics.field579.method3054("huffman", ""));
                Statics.field3157 = var49;
                class32.field731 = class157.field2316;
                class32.field730 = 96;
                field302 = 130;
            } else {
                class32.field731 = class157.field2315 + "%";
                class32.field730 = 96;
            }
        } else if (field302 == 130) {
            if (!Statics.field2560.method2999()) {
                class32.field731 = class157.field2317 + Statics.field2560.method3080() * 4 / 5 + "%";
                class32.field730 = 100;
            } else if (!Statics.field1746.method2999()) {
                class32.field731 = class157.field2317 + (80 + Statics.field1746.method3080() / 6) + "%";
                class32.field730 = 100;
            } else if (Statics.field128.method2999()) {
                class32.field731 = class157.field2318;
                class32.field730 = 100;
                field302 = 140;
            } else {
                class32.field731 = class157.field2317 + (96 + Statics.field128.method3080() / 20) + "%";
                class32.field730 = 100;
            }
        } else if (field302 == 140) {
            method145(10);
        }
    }

    @ObfuscatedName("m.x(IZZZI)Lfm;")
    public static class168 method119(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2204 != null) {
            var4 = new class134(arg0, class149.field2204, Statics.field2206[arg0], 1000000);
        }
        return new class168(var4, Statics.field131, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dp.d(B)V")
    public static final void method2211() {
        try {
            if (field392 == 0) {
                if (Statics.field254 != null) {
                    Statics.field254.method2763();
                    Statics.field254 = null;
                }
                Statics.field2245 = null;
                field552 = false;
                field308 = 0;
                field392 = 1;
            }
            if (field392 == 1) {
                if (Statics.field2245 == null) {
                    Statics.field2245 = Statics.field1993.method2660(Statics.field660, Statics.field2896);
                }
                if (Statics.field2245.field2184 == 2) {
                    throw new IOException();
                }
                if (Statics.field2245.field2184 == 1) {
                    Statics.field254 = new class143((Socket) Statics.field2245.field2188, Statics.field1993);
                    Statics.field2245 = null;
                    field392 = 2;
                }
            }
            if (field392 == 2) {
                field317.field1955 = 0;
                field317.method2276(14);
                Statics.field254.method2767(field317.field1956, 0, 1);
                field319.field1955 = 0;
                field392 = 3;
            }
            if (field392 == 3) {
                if (Statics.field1936 != null) {
                    Statics.field1936.method1170();
                }
                if (Statics.field2677 != null) {
                    Statics.field2677.method1170();
                }
                int var0 = Statics.field254.method2764();
                if (Statics.field1936 != null) {
                    Statics.field1936.method1170();
                }
                if (Statics.field2677 != null) {
                    Statics.field2677.method1170();
                }
                if (var0 != 0) {
                    method879(var0);
                    return;
                }
                field319.field1955 = 0;
                field392 = 5;
            }
            if (field392 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field317.field1955 = 0;
                field317.method2276(1);
                field317.method2276(class32.field738.method548());
                field317.method2484(var1[0]);
                field317.method2484(var1[1]);
                field317.method2484(var1[2]);
                field317.method2484(var1[3]);
                switch(class32.field738.field2575) {
                    case 0:
                        field317.method2484((Integer) Statics.field2046.field136.get(class163.method106(class32.field736)));
                        field317.field1955 += 4;
                        break;
                    case 1:
                    case 2:
                        field317.method2278(Statics.field2220);
                        field317.field1955 += 5;
                        break;
                    case 3:
                        field317.field1955 += 8;
                }
                field317.method2282(class32.field737);
                field317.method2311(class5.field69, class5.field68);
                field557.field1955 = 0;
                if (field379 == 40) {
                    field557.method2276(18);
                } else {
                    field557.method2276(16);
                }
                field557.method2451(0);
                int var2 = field557.field1955;
                field557.method2484(89);
                field557.method2285(field317.field1956, 0, field317.field1955);
                int var3 = field557.field1955;
                field557.method2282(class32.field736);
                field557.method2276((field489 ? 1 : 0) << 1 | (field278 ? 1 : 0));
                field557.method2451(Statics.field1604);
                field557.method2451(Statics.field776);
                class149.method2643(field557);
                field557.method2282(Statics.field158);
                field557.method2484(Statics.field509);
                class119 var4 = new class119(Statics.field692.method2907());
                Statics.field692.method2914(var4);
                field557.method2285(var4.field1956, 0, var4.field1956.length);
                field557.method2276(Statics.field443);
                field557.method2484(Statics.field72.field2664);
                field557.method2484(Statics.field1644.field2664);
                field557.method2484(Statics.field2719.field2664);
                field557.method2484(Statics.field2560.field2664);
                field557.method2484(Statics.field1977.field2664);
                field557.method2484(Statics.field169.field2664);
                field557.method2484(Statics.field24.field2664);
                field557.method2484(Statics.field1743.field2664);
                field557.method2484(Statics.field2154.field2664);
                field557.method2484(Statics.field801.field2664);
                field557.method2484(Statics.field579.field2664);
                field557.method2484(Statics.field259.field2664);
                field557.method2484(Statics.field1746.field2664);
                field557.method2484(Statics.field128.field2664);
                field557.method2484(Statics.field213.field2664);
                field557.method2484(Statics.field305.field2664);
                field557.method2309(var1, var3, field557.field1955);
                field557.method2328(field557.field1955 - var2);
                Statics.field254.method2767(field557.field1956, 0, field557.field1955);
                field317.method2527(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field319.method2527(var1);
                field392 = 6;
            }
            if (field392 == 6 && Statics.field254.method2765() > 0) {
                int var6 = Statics.field254.method2764();
                if (var6 == 21 && field379 == 20) {
                    field392 = 7;
                } else if (var6 == 2) {
                    field392 = 9;
                } else if (var6 == 15 && field379 == 40) {
                    field320 = -1;
                    field392 = 13;
                } else if (var6 == 23 && field309 < 1) {
                    field309++;
                    field392 = 0;
                } else if (var6 == 29) {
                    field392 = 11;
                } else {
                    method879(var6);
                    return;
                }
            }
            if (field392 == 7 && Statics.field254.method2765() > 0) {
                field446 = (Statics.field254.method2764() + 3) * 60;
                field392 = 8;
            }
            if (field392 == 8) {
                field308 = 0;
                class32.method2973(class157.field2376, class157.field2323, field446 / 60 + class157.field2324);
                if (--field446 <= 0) {
                    field392 = 0;
                }
            } else {
                if (field392 == 9 && Statics.field254.method2765() >= 13) {
                    boolean var7 = Statics.field254.method2764() == 1;
                    Statics.field254.method2768(field319.field1956, 0, 4);
                    field319.field1955 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field319.method2528() << 24;
                        int var10 = var9 | field319.method2528() << 16;
                        int var11 = var10 | field319.method2528() << 8;
                        int var12 = var11 | field319.method2528();
                        int var13 = class163.method106(class32.field736);
                        if (Statics.field2046.field136.size() >= 10 && !Statics.field2046.field136.containsKey(var13)) {
                            Iterator var14 = Statics.field2046.field136.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2046.field136.put(var13, var12);
                        class9.method1993();
                    }
                    field442 = Statics.field254.method2764();
                    field437 = Statics.field254.method2764() == 1;
                    field399 = Statics.field254.method2764();
                    field399 <<= 0x8;
                    field399 += Statics.field254.method2764();
                    field400 = Statics.field254.method2764();
                    Statics.field254.method2768(field319.field1956, 0, 1);
                    field319.field1955 = 0;
                    field321 = field319.method2528();
                    Statics.field254.method2768(field319.field1956, 0, 2);
                    field319.field1955 = 0;
                    field320 = field319.method2293();
                    if (field400 == 1) {
                        try {
                            client var15 = Statics.field3099;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field3099;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var24) {
                        }
                    }
                    field392 = 10;
                }
                if (field392 != 10) {
                    if (field392 == 11 && Statics.field254.method2765() >= 2) {
                        field319.field1955 = 0;
                        Statics.field254.method2768(field319.field1956, 0, 2);
                        field319.field1955 = 0;
                        Statics.field387 = field319.method2293();
                        field392 = 12;
                    }
                    if (field392 == 12 && Statics.field254.method2765() >= Statics.field387) {
                        field319.field1955 = 0;
                        Statics.field254.method2768(field319.field1956, 0, Statics.field387);
                        field319.field1955 = 0;
                        String var19 = field319.method2299();
                        String var20 = field319.method2299();
                        String var21 = field319.method2299();
                        class32.method2973(var19, var20, var21);
                        method145(10);
                    }
                    if (field392 == 13) {
                        if (field320 == -1) {
                            if (Statics.field254.method2765() < 2) {
                                return;
                            }
                            Statics.field254.method2768(field319.field1956, 0, 2);
                            field319.field1955 = 0;
                            field320 = field319.method2293();
                        }
                        if (Statics.field254.method2765() >= field320) {
                            Statics.field254.method2768(field319.field1956, 0, field320);
                            field319.field1955 = 0;
                            int var22 = field320;
                            method2947();
                            class33.method45(field319);
                            if (field319.field1955 != var22) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field308++;
                        if (field308 > 2000) {
                            if (field309 < 1) {
                                if (Statics.field787 == Statics.field2896) {
                                    Statics.field2896 = Statics.field20;
                                } else {
                                    Statics.field2896 = Statics.field787;
                                }
                                field309++;
                                field392 = 0;
                            } else {
                                method879(-3);
                            }
                        }
                    }
                } else if (Statics.field254.method2765() >= field320) {
                    field319.field1955 = 0;
                    Statics.field254.method2768(field319.field1956, 0, field320);
                    method226();
                    class33.method45(field319);
                    Statics.field206 = -1;
                    method183(false);
                    field321 = -1;
                }
            }
        } catch (IOException var26) {
            if (field309 < 1) {
                if (Statics.field787 == Statics.field2896) {
                    Statics.field2896 = Statics.field20;
                } else {
                    Statics.field2896 = Statics.field787;
                }
                field309++;
                field392 = 0;
            } else {
                method879(-2);
            }
        }
    }

    @ObfuscatedName("b.e(I)V")
    public static void method226() {
        field286 = 1L;
        field289 = -1;
        Statics.field1929.field190 = 0;
        Statics.field2691 = true;
        field533 = true;
        field501 = -1L;
        class211.method2901();
        field317.field1955 = 0;
        field319.field1955 = 0;
        field321 = -1;
        field331 = -1;
        field325 = -1;
        field326 = -1;
        field363 = 0;
        field300 = 0;
        field327 = 0;
        field293 = 0;
        field342 = 0;
        field416 = false;
        class140.field2111 = 0;
        class12.method948();
        field428 = 0;
        field430 = false;
        field517 = 0;
        field338 = (int) (Math.random() * 100.0D) - 50;
        field340 = (int) (Math.random() * 110.0D) - 55;
        field369 = (int) (Math.random() * 80.0D) - 40;
        field345 = (int) (Math.random() * 120.0D) - 60;
        field347 = (int) (Math.random() * 30.0D) - 20;
        field362 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field474 = 0;
        field310 = -1;
        field523 = 0;
        field492 = 0;
        field490 = class21.field566;
        field313 = 0;
        class33.method128();
        for (int var0 = 0; var0 < 2048; var0++) {
            field404[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field312[var1] = null;
        }
        field548 = -1;
        field423.method3560();
        field411.method3560();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field408[var2][var3][var4] = null;
                }
            }
        }
        field409 = new class199();
        field543 = 0;
        field335 = 0;
        field274 = 0;
        for (int var5 = 0; var5 < Statics.field1156; var5++) {
            class53 var6 = Statics.method619(var5);
            if (var6 != null) {
                class176.field2886[var5] = 0;
                class176.field2887[var5] = 0;
            }
        }
        Statics.field2670.method193();
        field360 = -1;
        if (field284 != -1) {
            class173.method104(field284);
        }
        for (class4 var7 = (class4) field421.method3520(); var7 != null; var7 = (class4) field421.method3533()) {
            Statics.method691(var7, true);
        }
        field284 = -1;
        field421 = new class196(8);
        field439 = null;
        field416 = false;
        field342 = 0;
        field402.method3265((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field444[var8] = null;
            field405[var8] = false;
        }
        class16.field215 = new class196(32);
        field525 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field480[var9] = true;
        }
        field317.method2544(160);
        field317.method2276(method591());
        field317.method2451(Statics.field1604);
        field317.method2451(Statics.field776);
        field502 = null;
        Statics.field91 = 0;
        Statics.field209 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field524[var10] = new class220();
        }
        Statics.field2645 = null;
    }

    @ObfuscatedName("fb.l(I)V")
    public static void method2947() {
        field317.field1955 = 0;
        field319.field1955 = 0;
        field321 = -1;
        field331 = -1;
        field325 = -1;
        field326 = -1;
        field320 = 0;
        field363 = 0;
        field300 = 0;
        field342 = 0;
        field416 = false;
        field474 = 0;
        field523 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field404[var0] = null;
        }
        Statics.field2644 = null;
        for (int var1 = 0; var1 < field312.length; var1++) {
            class35 var2 = field312[var1];
            if (var2 != null) {
                var2.field837 = -1;
                var2.field838 = false;
            }
        }
        class16.field215 = new class196(32);
        method145(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field480[var3] = true;
        }
        field317.method2544(160);
        field317.method2276(method591());
        field317.method2451(Statics.field1604);
        field317.method2451(Statics.field776);
    }

    @ObfuscatedName("as.u(IB)V")
    public static void method879(int arg0) {
        if (arg0 == -3) {
            class32.method2973(class157.field2325, class157.field2288, class157.field2541);
        } else if (arg0 == -2) {
            class32.method2973(class157.field2389, class157.field2494, class157.field2330);
        } else if (arg0 == -1) {
            class32.method2973(class157.field2331, class157.field2526, class157.field2532);
        } else if (arg0 == 3) {
            class32.method2973(class157.field2334, class157.field2552, class157.field2336);
        } else if (arg0 == 4) {
            class32.method2973(class157.field2337, class157.field2338, class157.field2384);
        } else if (arg0 == 5) {
            class32.method2973(class157.field2340, class157.field2341, class157.field2358);
        } else if (arg0 == 6) {
            class32.method2973(class157.field2343, class157.field2344, class157.field2345);
        } else if (arg0 == 7) {
            class32.method2973(class157.field2346, class157.field2347, class157.field2550);
        } else if (arg0 == 8) {
            class32.method2973(class157.field2297, class157.field2312, class157.field2351);
        } else if (arg0 == 9) {
            class32.method2973(class157.field2352, class157.field2441, class157.field2354);
        } else if (arg0 == 10) {
            class32.method2973(class157.field2355, class157.field2356, class157.field2357);
        } else if (arg0 == 11) {
            class32.method2973(class157.field2537, class157.field2411, class157.field2519);
        } else if (arg0 == 12) {
            class32.method2973(class157.field2412, class157.field2362, class157.field2363);
        } else if (arg0 == 13) {
            class32.method2973(class157.field2364, class157.field2365, class157.field2502);
        } else if (arg0 == 14) {
            class32.method2973(class157.field2367, class157.field2368, class157.field2402);
        } else if (arg0 == 16) {
            class32.method2973(class157.field2405, class157.field2371, class157.field2372);
        } else if (arg0 == 17) {
            class32.method2973(class157.field2373, class157.field2374, class157.field2375);
        } else if (arg0 == 18) {
            class32.method2973(class157.field2440, class157.field2328, class157.field2378);
        } else if (arg0 == 19) {
            class32.method2973(class157.field2524, class157.field2380, class157.field2381);
        } else if (arg0 == 20) {
            class32.method2973(class157.field2370, class157.field2383, class157.field2459);
        } else if (arg0 == 22) {
            class32.method2973(class157.field2419, class157.field2421, class157.field2464);
        } else if (arg0 == 23) {
            class32.method2973(class157.field2388, class157.field2309, class157.field2466);
        } else if (arg0 == 24) {
            class32.method2973(class157.field2391, class157.field2392, class157.field2393);
        } else if (arg0 == 25) {
            class32.method2973(class157.field2394, class157.field2395, class157.field2396);
        } else if (arg0 == 26) {
            class32.method2973(class157.field2397, class157.field2342, class157.field2480);
        } else if (arg0 == 27) {
            class32.method2973(class157.field2400, class157.field2401, class157.field2538);
        } else if (arg0 == 31) {
            class32.method2973(class157.field2409, class157.field2491, class157.field2453);
        } else if (arg0 == 32) {
            class32.method2973(class157.field2417, class157.field2469, class157.field2414);
        } else if (arg0 == 37) {
            class32.method2973(class157.field2415, class157.field2416, class157.field2369);
        } else if (arg0 == 38) {
            class32.method2973(class157.field2418, class157.field2457, class157.field2420);
        } else if (arg0 == 55) {
            class32.method2973(class157.field2329, class157.field2422, class157.field2413);
        } else if (arg0 == 56) {
            class32.method2973(class157.field2424, class157.field2425, class157.field2426);
            method145(11);
            return;
        } else if (arg0 == 57) {
            class32.method2973(class157.field2427, class157.field2428, class157.field2429);
            method145(11);
            return;
        } else {
            class32.method2973(class157.field2320, class157.field2431, class157.field2432);
        }
        method145(10);
    }

    @ObfuscatedName("ac.a(I)V")
    public static final void method683() {
        if (Statics.field254 != null) {
            Statics.field254.method2763();
            Statics.field254 = null;
        }
        method2203();
        Statics.field1976.method1735();
        for (int var0 = 0; var0 < 4; var0++) {
            field334[var0].method2202();
        }
        System.gc();
        class183.method3690(2);
        field462 = -1;
        field514 = false;
        for (class24 var1 = (class24) class24.field607.method3558(); var1 != null; var1 = (class24) class24.field607.method3554()) {
            if (var1.field604 != null) {
                Statics.field198.method1093(var1.field604);
                var1.field604 = null;
            }
            if (var1.field611 != null) {
                Statics.field198.method1093(var1.field611);
                var1.field611 = null;
            }
        }
        class24.field607.method3560();
        method145(10);
    }

    @ObfuscatedName("dj.b(I)V")
    public static final void method2203() {
        class47.method155();
        class42.method556();
        class45.field1026.method3488();
        class41.method132();
        class40.field885.method3488();
        class40.field886.method3488();
        class52.method176();
        class43.field984.method3488();
        class43.field988.method3488();
        class44.field1007.method3488();
        class44.field1008.method3488();
        class48.method568();
        class53.field1157.method3488();
        class179.method1997();
        class173.method2207();
        ((class95) Statics.field1563).method1985();
        class23.field584.method3488();
        Statics.field72.method3004();
        Statics.field1644.method3004();
        Statics.field2560.method3004();
        Statics.field1977.method3004();
        Statics.field169.method3004();
        Statics.field24.method3004();
        Statics.field1743.method3004();
        Statics.field2154.method3004();
        Statics.field801.method3004();
        Statics.field579.method3004();
        Statics.field259.method3004();
        Statics.field1746.method3004();
    }

    @ObfuscatedName("r.s(I)V")
    public static final void method124() {
        if (field327 > 0) {
            method683();
        } else {
            method145(40);
            Statics.field875 = Statics.field254;
            Statics.field254 = null;
        }
    }

    @ObfuscatedName("v.v(I)V")
    public static final void method565() {
        if (Statics.field2677 != null) {
            Statics.field2677.method1137();
        }
        if (Statics.field1936 != null) {
            Statics.field1936.method1137();
        }
    }

    @ObfuscatedName("al.j(I)V")
    public static final void method946() {
        for (int var0 = 0; var0 < field517; var0++) {
            int var10002 = field520[var0]--;
            if (field520[var0] >= -10) {
                class59 var2 = field522[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1199(Statics.field1977, field518[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field520[var0] += var2.method1195();
                    field522[var0] = var2;
                }
                if (field520[var0] < 0) {
                    int var9;
                    if (field282[var0] == 0) {
                        var9 = field515;
                    } else {
                        int var3 = (field282[var0] & 0xFF) * 128;
                        int var4 = field282[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2644.field859;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field282[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2644.field839;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field520[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field516 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1194().method1229(Statics.field2273);
                        class65 var11 = class65.method1333(var10, 100, var9);
                        var11.method1257(field519[var0] - 1);
                        Statics.field198.method1092(var11);
                    }
                    field520[var0] = -100;
                }
            } else {
                field517--;
                for (int var1 = var0; var1 < field517; var1++) {
                    field518[var1] = field518[var1 + 1];
                    field522[var1] = field522[var1 + 1];
                    field519[var1] = field519[var1 + 1];
                    field520[var1] = field520[var1 + 1];
                    field282[var1] = field282[var1 + 1];
                }
                var0--;
            }
        }
        if (!field514) {
            return;
        }
        boolean var12;
        if (class183.field2940 == 0) {
            var12 = Statics.field2936.method3367();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field512 != 0 && field462 != -1) {
                class183.method2886(Statics.field24, field462, 0, field512, false);
            }
            field514 = false;
        }
    }

    @ObfuscatedName("fy.z(Lar;IIII)V")
    public static void method2905(class43 arg0, int arg1, int arg2, int arg3) {
        if (field517 >= 50 || field516 == 0 || arg0.field997 == null || arg1 >= arg0.field997.length) {
            return;
        }
        int var4 = arg0.field997[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field518[field517] = var5;
        field519[field517] = var6;
        field520[field517] = 0;
        field522[field517] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field282[field517] = (var8 << 16) + (var9 << 8) + var7;
        field517++;
    }

    @ObfuscatedName("cw.n(IIS)V")
    public static void method2003(int arg0, int arg1) {
        if (field512 != 0 && arg0 != -1) {
            class183.method2886(Statics.field259, arg0, 0, field512, false);
            field514 = true;
        }
    }

    @ObfuscatedName("x.p(I)V")
    public static final void method161() {
        if (Statics.field2983 != field310) {
            field310 = Statics.field2983;
            method632(Statics.field2983);
        }
    }

    @ObfuscatedName("i.aj(I)V")
    public static final void method102() {
        int[] var0 = class33.field757;
        for (int var1 = 0; var1 < class33.field754; var1++) {
            class3 var2 = field404[var0[var1]];
            if (var2 != null && var2.field828 > 0) {
                var2.field828--;
                if (var2.field828 == 0) {
                    var2.field864 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field313; var3++) {
            int var4 = field314[var3];
            class35 var5 = field312[var4];
            if (var5 != null && var5.field828 > 0) {
                var5.field828--;
                if (var5.field828 == 0) {
                    var5.field864 = null;
                }
            }
        }
    }

    @ObfuscatedName("g.aq(I)V")
    public static final void method48() {
        int var0 = field338 + Statics.field2644.field859;
        int var1 = field340 + Statics.field2644.field839;
        if (Statics.field1735 - var0 < -500 || Statics.field1735 - var0 > 500 || Statics.field1868 - var1 < -500 || Statics.field1868 - var1 > 500) {
            Statics.field1735 = var0;
            Statics.field1868 = var1;
        }
        if (Statics.field1735 != var0) {
            Statics.field1735 += (var0 - Statics.field1735) / 16;
        }
        if (Statics.field1868 != var1) {
            Statics.field1868 += (var1 - Statics.field1868) / 16;
        }
        if (class140.field2115 == 4 && Statics.field208) {
            int var2 = class140.field2120 - field366;
            field364 = var2 * 2;
            field366 = var2 == -1 || var2 == 1 ? class140.field2120 : (field366 + class140.field2120) / 2;
            int var3 = field315 - class140.field2116;
            field350 = var3 * 2;
            field315 = var3 == -1 || var3 == 1 ? class140.field2116 : (field315 + class140.field2116) / 2;
        } else {
            if (class137.field2075[96]) {
                field350 += (-24 - field350) / 2;
            } else if (class137.field2075[97]) {
                field350 += (24 - field350) / 2;
            } else {
                field350 /= 2;
            }
            if (class137.field2075[98]) {
                field364 += (12 - field364) / 2;
            } else if (class137.field2075[99]) {
                field364 += (-12 - field364) / 2;
            } else {
                field364 /= 2;
            }
            field366 = class140.field2120;
            field315 = class140.field2116;
        }
        field362 = field350 / 2 + field362 & 0x7FF;
        field435 += field364 / 2;
        if (field435 < 128) {
            field435 = 128;
        }
        if (field435 > 383) {
            field435 = 383;
        }
        int var4 = Statics.field1735 >> 7;
        int var5 = Statics.field1868 >> 7;
        int var6 = method2209(Statics.field1735, Statics.field1868, Statics.field2983);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field2983;
                    if (var10 < 3 && (class6.field78[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field85[var10][var8][var9];
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
        if (var12 > field542) {
            field542 += (var12 - field542) / 24;
        } else if (var12 < field542) {
            field542 += (var12 - field542) / 80;
        }
    }

    @ObfuscatedName("r.aw(I)V")
    public static final void method125() {
        int var0 = class33.field754;
        int[] var1 = class33.field757;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field404[var1[var2]];
            if (var3 != null) {
                method2086(var3, 1);
            }
        }
    }

    @ObfuscatedName("fa.az(B)V")
    public static final void method2902() {
        for (int var0 = 0; var0 < field313; var0++) {
            int var1 = field314[var0];
            class35 var2 = field312[var1];
            if (var2 != null) {
                method2086(var2, var2.field781.field890);
            }
        }
    }

    @ObfuscatedName("ca.at(Lak;II)V")
    public static final void method2086(class38 arg0, int arg1) {
        if (arg0.field857 > field285) {
            method2758(arg0);
        } else if (arg0.field832 >= field285) {
            method134(arg0);
        } else {
            arg0.field850 = arg0.field817;
            if (arg0.field829 == 0) {
                arg0.field812 = 0;
            } else {
                label322: {
                    if (arg0.field846 != -1 && arg0.field858 == 0) {
                        class43 var2 = class43.method2648(arg0.field846);
                        if (arg0.field870 > 0 && var2.field1000 == 0) {
                            arg0.field812++;
                            break label322;
                        }
                        if (arg0.field870 <= 0 && var2.field1001 == 0) {
                            arg0.field812++;
                            break label322;
                        }
                    }
                    int var3 = arg0.field859;
                    int var4 = arg0.field839;
                    int var5 = arg0.field866[arg0.field829 - 1] * 128 + arg0.field816 * 64;
                    int var6 = arg0.field867[arg0.field829 - 1] * 128 + arg0.field816 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field825 = 1280;
                        } else if (var4 > var6) {
                            arg0.field825 = 1792;
                        } else {
                            arg0.field825 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field825 = 768;
                        } else if (var4 > var6) {
                            arg0.field825 = 256;
                        } else {
                            arg0.field825 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field825 = 1024;
                    } else if (var4 > var6) {
                        arg0.field825 = 0;
                    }
                    byte var7 = arg0.field868[arg0.field829 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field825 - arg0.field814 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field821;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field820;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field823;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field822;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field820;
                        }
                        arg0.field850 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class35) {
                            var11 = ((class35) arg0).field781.field917;
                        }
                        if (var11) {
                            if (arg0.field825 != arg0.field814 && arg0.field837 == -1 && arg0.field843 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field829 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field829 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field812 > 0 && arg0.field829 > 1) {
                                var10 = 8;
                                arg0.field812--;
                            }
                        } else {
                            if (arg0.field829 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field829 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field812 > 0 && arg0.field829 > 1) {
                                var10 = 8;
                                arg0.field812--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field850 == arg0.field820 && arg0.field824 != -1) {
                            arg0.field850 = arg0.field824;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field859 += var10;
                                if (arg0.field859 > var5) {
                                    arg0.field859 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field859 -= var10;
                                if (arg0.field859 < var5) {
                                    arg0.field859 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field839 += var10;
                                if (arg0.field839 > var6) {
                                    arg0.field839 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field839 -= var10;
                                if (arg0.field839 < var6) {
                                    arg0.field839 = var6;
                                }
                            }
                        }
                        if (arg0.field859 == var5 && arg0.field839 == var6) {
                            arg0.field829--;
                            if (arg0.field870 > 0) {
                                arg0.field870--;
                            }
                        }
                    } else {
                        arg0.field859 = var5;
                        arg0.field839 = var6;
                        arg0.field829--;
                        if (arg0.field870 > 0) {
                            arg0.field870--;
                        }
                    }
                }
            }
        }
        if (arg0.field859 < 128 || arg0.field839 < 128 || arg0.field859 >= 13184 || arg0.field839 >= 13184) {
            arg0.field846 = -1;
            arg0.field848 = -1;
            arg0.field857 = 0;
            arg0.field832 = 0;
            arg0.field859 = arg0.field866[0] * 128 + arg0.field816 * 64;
            arg0.field839 = arg0.field867[0] * 128 + arg0.field816 * 64;
            arg0.method710();
        }
        if (Statics.field2644 == arg0 && (arg0.field859 < 1536 || arg0.field839 < 1536 || arg0.field859 >= 11776 || arg0.field839 >= 11776)) {
            arg0.field846 = -1;
            arg0.field848 = -1;
            arg0.field857 = 0;
            arg0.field832 = 0;
            arg0.field859 = arg0.field866[0] * 128 + arg0.field816 * 64;
            arg0.field839 = arg0.field867[0] * 128 + arg0.field816 * 64;
            arg0.method710();
        }
        method172(arg0);
        arg0.field815 = false;
        if (arg0.field850 != -1) {
            class43 var12 = class43.method2648(arg0.field850);
            if (var12 == null || var12.field987 == null) {
                arg0.field850 = -1;
            } else {
                arg0.field842++;
                if (arg0.field841 < var12.field987.length && arg0.field842 > var12.field991[arg0.field841]) {
                    arg0.field842 = 1;
                    arg0.field841++;
                    method2905(var12, arg0.field841, arg0.field859, arg0.field839);
                }
                if (arg0.field841 >= var12.field987.length) {
                    arg0.field842 = 0;
                    arg0.field841 = 0;
                    method2905(var12, arg0.field841, arg0.field859, arg0.field839);
                }
            }
        }
        if (arg0.field848 != -1 && field285 >= arg0.field851) {
            if (arg0.field849 < 0) {
                arg0.field849 = 0;
            }
            int var13 = class44.method1037(arg0.field848).field1016;
            if (var13 == -1) {
                arg0.field848 = -1;
            } else {
                class43 var14 = class43.method2648(var13);
                if (var14 == null || var14.field987 == null) {
                    arg0.field848 = -1;
                } else {
                    arg0.field833++;
                    if (arg0.field849 < var14.field987.length && arg0.field833 > var14.field991[arg0.field849]) {
                        arg0.field833 = 1;
                        arg0.field849++;
                        method2905(var14, arg0.field849, arg0.field859, arg0.field839);
                    }
                    if (arg0.field849 >= var14.field987.length && (arg0.field849 < 0 || arg0.field849 >= var14.field987.length)) {
                        arg0.field848 = -1;
                    }
                }
            }
        }
        if (arg0.field846 != -1 && arg0.field858 <= 1) {
            class43 var15 = class43.method2648(arg0.field846);
            if (var15.field1000 == 1 && arg0.field870 > 0 && arg0.field857 <= field285 && arg0.field832 < field285) {
                arg0.field858 = 1;
                return;
            }
        }
        if (arg0.field846 != -1 && arg0.field858 == 0) {
            class43 var16 = class43.method2648(arg0.field846);
            if (var16 == null || var16.field987 == null) {
                arg0.field846 = -1;
            } else {
                arg0.field845++;
                if (arg0.field844 < var16.field987.length && arg0.field845 > var16.field991[arg0.field844]) {
                    arg0.field845 = 1;
                    arg0.field844++;
                    method2905(var16, arg0.field844, arg0.field859, arg0.field839);
                }
                if (arg0.field844 >= var16.field987.length) {
                    arg0.field844 -= var16.field993;
                    arg0.field852++;
                    if (arg0.field852 >= var16.field989) {
                        arg0.field846 = -1;
                    } else if (arg0.field844 >= 0 && arg0.field844 < var16.field987.length) {
                        method2905(var16, arg0.field844, arg0.field859, arg0.field839);
                    } else {
                        arg0.field846 = -1;
                    }
                }
                arg0.field815 = var16.field995;
            }
        }
        if (arg0.field858 > 0) {
            arg0.field858--;
        }
    }

    @ObfuscatedName("er.af(Lak;I)V")
    public static final void method2758(class38 arg0) {
        int var1 = arg0.field857 - field285;
        int var2 = arg0.field853 * 128 + arg0.field816 * 64;
        int var3 = arg0.field830 * 128 + arg0.field816 * 64;
        arg0.field859 += (var2 - arg0.field859) / var1;
        arg0.field839 += (var3 - arg0.field839) / var1;
        arg0.field812 = 0;
        arg0.field825 = arg0.field819;
    }

    @ObfuscatedName("q.ax(Lak;I)V")
    public static final void method134(class38 arg0) {
        if (field285 == arg0.field832 || arg0.field846 == -1 || arg0.field858 != 0 || arg0.field845 + 1 > class43.method2648(arg0.field846).field991[arg0.field844]) {
            int var1 = arg0.field832 - arg0.field857;
            int var2 = field285 - arg0.field857;
            int var3 = arg0.field853 * 128 + arg0.field816 * 64;
            int var4 = arg0.field830 * 128 + arg0.field816 * 64;
            int var5 = arg0.field854 * 128 + arg0.field816 * 64;
            int var6 = arg0.field856 * 128 + arg0.field816 * 64;
            arg0.field859 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field839 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field812 = 0;
        arg0.field825 = arg0.field819;
        arg0.field814 = arg0.field825;
    }

    @ObfuscatedName("e.ac(Lak;I)V")
    public static final void method172(class38 arg0) {
        if (arg0.field843 == 0) {
            return;
        }
        if (arg0.field837 != -1) {
            class38 var1 = null;
            if (arg0.field837 < 32768) {
                var1 = field312[arg0.field837];
            } else if (arg0.field837 >= 32768) {
                var1 = field404[arg0.field837 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field859 - var1.field859;
                int var3 = arg0.field839 - var1.field839;
                if (var2 != 0 || var3 != 0) {
                    arg0.field825 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field838) {
                arg0.field837 = -1;
                arg0.field838 = false;
            }
        }
        if (arg0.field847 != -1 && (arg0.field829 == 0 || arg0.field812 > 0)) {
            arg0.field825 = arg0.field847;
            arg0.field847 = -1;
        }
        int var4 = arg0.field825 - arg0.field814 & 0x7FF;
        if (var4 == 0 && arg0.field838) {
            arg0.field837 = -1;
            arg0.field838 = false;
        }
        if (var4 == 0) {
            arg0.field860 = 0;
            return;
        }
        arg0.field860++;
        if (var4 > 1024) {
            arg0.field814 -= arg0.field843;
            boolean var5 = true;
            if (var4 < arg0.field843 || var4 > 2048 - arg0.field843) {
                arg0.field814 = arg0.field825;
                var5 = false;
            }
            if (arg0.field850 == arg0.field817 && (arg0.field860 > 25 || var5)) {
                if (arg0.field818 == -1) {
                    arg0.field850 = arg0.field820;
                } else {
                    arg0.field850 = arg0.field818;
                }
            }
        } else {
            arg0.field814 += arg0.field843;
            boolean var6 = true;
            if (var4 < arg0.field843 || var4 > 2048 - arg0.field843) {
                arg0.field814 = arg0.field825;
                var6 = false;
            }
            if (arg0.field850 == arg0.field817 && (arg0.field860 > 25 || var6)) {
                if (arg0.field862 == -1) {
                    arg0.field850 = arg0.field820;
                } else {
                    arg0.field850 = arg0.field862;
                }
            }
        }
        arg0.field814 &= 0x7FF;
    }

    @ObfuscatedName("fn.am(Lk;III)V")
    public static void method2980(class3 arg0, int arg1, int arg2) {
        if (arg0.field846 == arg1 && arg1 != -1) {
            int var3 = class43.method2648(arg1).field1002;
            if (var3 == 1) {
                arg0.field844 = 0;
                arg0.field845 = 0;
                arg0.field858 = arg2;
                arg0.field852 = 0;
            }
            if (var3 == 2) {
                arg0.field852 = 0;
            }
        } else if (arg1 == -1 || arg0.field846 == -1 || class43.method2648(arg1).field996 >= class43.method2648(arg0.field846).field996) {
            arg0.field846 = arg1;
            arg0.field844 = 0;
            arg0.field845 = 0;
            arg0.field858 = arg2;
            arg0.field852 = 0;
            arg0.field870 = arg0.field829;
        }
    }

    @ObfuscatedName("p.ao(I)I")
    public static int method591() {
        return field489 ? 2 : 1;
    }

    @ObfuscatedName("p.ad(I)V")
    public static void method611() {
        client var0 = Statics.field3099;
        synchronized (Statics.field3099) {
            Container var1 = Statics.field3099.method2795();
            if (var1 != null) {
                Statics.field1848 = Math.max(var1.getSize().width, Statics.field2155);
                Statics.field559 = Math.max(var1.getSize().height, Statics.field2050);
                if (Statics.field2011 == var1) {
                    Insets var2 = Statics.field2011.getInsets();
                    Statics.field1848 -= var2.right + var2.left;
                    Statics.field559 -= var2.top + var2.bottom;
                }
                if (Statics.field1848 <= 0) {
                    Statics.field1848 = 1;
                }
                if (Statics.field559 <= 0) {
                    Statics.field559 = 1;
                }
                if (method591() == 1) {
                    Statics.field1604 = field448 * 765;
                    Statics.field776 = field425 * 503;
                } else {
                    Statics.field1604 = Math.min(Statics.field1848, 7680);
                    Statics.field776 = Math.min(Statics.field559, 2160);
                }
                field2169 = (Statics.field1848 - Statics.field1604) / 2;
                field2165 = 0;
                Statics.field1839.setSize(Statics.field1604, Statics.field776);
                int var3 = Statics.field1604;
                int var4 = Statics.field776;
                Canvas var5 = Statics.field1839;
                class78 var7;
                try {
                    class82 var6 = new class82();
                    var6.method1488(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var23) {
                    class76 var9 = new class76();
                    var9.method1488(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field211 = var7;
                if (Statics.field2011 == var1) {
                    Insets var10 = Statics.field2011.getInsets();
                    Statics.field1839.setLocation(field2169 + var10.left, field2165 + var10.top);
                } else {
                    Statics.field1839.setLocation(field2169, field2165);
                }
                int var11 = Statics.field1604;
                int var12 = Statics.field776;
                if (Statics.field1848 < var11) {
                    int var13 = Statics.field1848;
                }
                if (Statics.field559 < var12) {
                    int var14 = Statics.field559;
                }
                if (Statics.field2046 != null) {
                    try {
                        client var15 = Statics.field3099;
                        Object[] var16 = new Object[] { method591() };
                        JSObject.getWindow(var15).call("resize", var16);
                    } catch (Throwable var22) {
                    }
                }
                if (field284 != -1) {
                    int var18 = field284;
                    int var19 = Statics.field1604;
                    int var20 = Statics.field776;
                    if (class173.method4(var18)) {
                        method173(Statics.field2827[var18], -1, var19, var20, true);
                    }
                }
                method159();
            }
        }
    }

    @ObfuscatedName("x.ak(I)V")
    public static void method159() {
        int var0 = field2169;
        int var1 = field2165;
        int var2 = Statics.field1848 - Statics.field1604 - var0;
        int var3 = Statics.field559 - Statics.field776 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field3099.method2795();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field2011 == var4) {
                Insets var7 = Statics.field2011.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field559);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1848, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1848 + var5 - var2, var6, var2, Statics.field559);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field559 + var6 - var3, Statics.field1848, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("cj.au(B)V")
    public static final void method1733() {
        if (field284 != -1) {
            int var0 = field284;
            if (class173.method4(var0)) {
                method18(Statics.field2827[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field478; var1++) {
            if (field480[var1]) {
                field511[var1] = true;
            }
            field482[var1] = field480[var1];
            field480[var1] = false;
        }
        field290 = field285;
        field318 = -1;
        field513 = -1;
        Statics.field62 = null;
        if (field284 != -1) {
            field478 = 0;
            method720(field284, 0, 0, Statics.field1604, Statics.field776, 0, 0, -1);
        }
        class80.method1654();
        if (field416) {
            int var5 = Statics.field661;
            int var6 = Statics.field3140;
            int var7 = Statics.field1541;
            int var8 = Statics.field2623;
            int var9 = 6116423;
            class80.method1661(var5, var6, var7, var8, var9);
            class80.method1661(var5 + 1, var6 + 1, var7 - 2, 16, 0);
            class80.method1683(var5 + 1, var6 + 18, var7 - 2, var8 - 19, 0);
            Statics.field1645.method3737(class157.field2327, var5 + 3, var6 + 14, var9, -1);
            int var10 = class140.field2116;
            int var11 = class140.field2120;
            for (int var12 = 0; var12 < field342; var12++) {
                int var13 = (field342 - 1 - var12) * 15 + var6 + 31;
                int var14 = 16777215;
                if (var10 > var5 && var10 < var5 + var7 && var11 > var13 - 13 && var11 < var13 + 3) {
                    var14 = 16776960;
                }
                Statics.field1645.method3737(method2702(var12), var5 + 3, var13, var14, 0);
            }
            method1983(Statics.field661, Statics.field3140, Statics.field1541, Statics.field2623);
        } else if (field318 != -1) {
            int var2 = field318;
            int var3 = field513;
            if (field342 >= 2 || field428 != 0 || field430) {
                String var4;
                if (field428 == 1 && field342 < 2) {
                    var4 = class157.field2436 + class157.field2446 + field429 + " " + class2.field23;
                } else if (field430 && field342 < 2) {
                    var4 = field433 + class157.field2446 + field434 + " " + class2.field23;
                } else {
                    var4 = method2702(field342 - 1);
                }
                if (field342 > 2) {
                    var4 = var4 + class2.method22(16777215) + " " + '/' + " " + (field342 - 2) + class157.field2387;
                }
                Statics.field1645.method3744(var4, var2 + 4, var3 + 15, 16777215, 0, field285 / 1000);
            }
        }
        if (field370 == 3) {
            for (int var15 = 0; var15 < field478; var15++) {
                if (field482[var15]) {
                    class80.method1704(field483[var15], field322[var15], field485[var15], field495[var15], 16711935, 128);
                } else if (field511[var15]) {
                    class80.method1704(field483[var15], field322[var15], field485[var15], field495[var15], 16711680, 128);
                }
            }
        }
        Statics.method162(Statics.field2983, Statics.field2644.field859, Statics.field2644.field839, field397);
        field397 = 0;
    }

    @ObfuscatedName("di.aa(Ljava/lang/String;ZB)V")
    public static final void method2225(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field766.method3734(arg0, 250);
        int var6 = Statics.field766.method3735(arg0, 250) * 13;
        class80.method1661(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1683(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field766.method3799(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3656(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1983(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1839.getGraphics();
            Statics.field211.method1486(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1839.repaint();
        }
    }

    @ObfuscatedName("as.ai(IIIII)V")
    public static final void method881(int arg0, int arg1, int arg2, int arg3) {
        field481++;
        Statics.method1521(class34.field777);
        boolean var4 = false;
        if (field548 >= 0) {
            int var5 = class33.field754;
            int[] var6 = class33.field757;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field548 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            Statics.method1521(class34.field774);
        }
        method2971(true);
        Statics.method1521(var4 ? class34.field772 : class34.field773);
        method2971(false);
        for (class7 var8 = (class7) field423.method3558(); var8 != null; var8 = (class7) field423.method3554()) {
            if (Statics.field2983 != var8.field116 || field285 > var8.field105) {
                var8.method3646();
            } else if (field285 >= var8.field101) {
                if (var8.field98 > 0) {
                    class35 var9 = field312[var8.field98 - 1];
                    if (var9 != null && var9.field859 >= 0 && var9.field859 < 13312 && var9.field839 >= 0 && var9.field839 < 13312) {
                        var8.method94(var9.field859, var9.field839, method2209(var9.field859, var9.field839, var8.field116) - var8.field100, field285);
                    }
                }
                if (var8.field98 < 0) {
                    int var10 = -var8.field98 - 1;
                    class3 var11;
                    if (field399 == var10) {
                        var11 = Statics.field2644;
                    } else {
                        var11 = field404[var10];
                    }
                    if (var11 != null && var11.field859 >= 0 && var11.field859 < 13312 && var11.field839 >= 0 && var11.field839 < 13312) {
                        var8.method94(var11.field859, var11.field839, method2209(var11.field859, var11.field839, var8.field116) - var8.field100, field285);
                    }
                }
                var8.method93(field397);
                Statics.field1976.method1832(Statics.field2983, (int) var8.field107, (int) var8.field109, (int) var8.field96, 60, var8, var8.field115, -1, false);
            }
        }
        Statics.method715();
        method682(arg0, arg1, arg2, arg3, true);
        int var12 = field537;
        int var13 = field534;
        int var14 = field316;
        int var15 = field550;
        class80.method1655(var12, var13, var12 + var14, var13 + var15);
        class91.method1954();
        if (!field508) {
            int var16 = field435;
            if (field542 / 256 > var16) {
                var16 = field542 / 256;
            }
            if (field374[4] && field526[4] + 128 > var16) {
                var16 = field526[4] + 128;
            }
            int var17 = field369 + field362 & 0x7FF;
            method3655(Statics.field1735, method2209(Statics.field2644.field859, Statics.field2644.field839, Statics.field2983) - field427, Statics.field1868, var16, var17, var16 * 3 + 600);
        }
        int var30;
        if (field508) {
            var30 = method3195();
        } else {
            int var18;
            if (Statics.field2046.field133) {
                var18 = Statics.field2983;
            } else {
                int var19 = 3;
                if (Statics.field28 < 310) {
                    int var20 = Statics.field1366 >> 7;
                    int var21 = Statics.field2126 >> 7;
                    int var22 = Statics.field2644.field859 >> 7;
                    int var23 = Statics.field2644.field839 >> 7;
                    if ((class6.field78[Statics.field2983][var20][var21] & 0x4) != 0) {
                        var19 = Statics.field2983;
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
                            if ((class6.field78[Statics.field2983][var20][var21] & 0x4) != 0) {
                                var19 = Statics.field2983;
                            }
                            var27 += var26;
                            if (var27 >= 65536) {
                                var27 -= 65536;
                                if (var21 < var23) {
                                    var21++;
                                } else if (var21 > var23) {
                                    var21--;
                                }
                                if ((class6.field78[Statics.field2983][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field2983;
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
                            if ((class6.field78[Statics.field2983][var20][var21] & 0x4) != 0) {
                                var19 = Statics.field2983;
                            }
                            var29 += var28;
                            if (var29 >= 65536) {
                                var29 -= 65536;
                                if (var20 < var22) {
                                    var20++;
                                } else if (var20 > var22) {
                                    var20--;
                                }
                                if ((class6.field78[Statics.field2983][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field2983;
                                }
                            }
                        }
                    }
                }
                if ((class6.field78[Statics.field2983][Statics.field2644.field859 >> 7][Statics.field2644.field839 >> 7] & 0x4) != 0) {
                    var19 = Statics.field2983;
                }
                var18 = var19;
            }
            var30 = var18;
        }
        int var31 = Statics.field1366;
        int var32 = Statics.field1071;
        int var33 = Statics.field2126;
        int var34 = Statics.field28;
        int var35 = Statics.field633;
        for (int var36 = 0; var36 < 5; var36++) {
            if (field374[var36]) {
                int var37 = (int) (Math.random() * (double) (field465[var36] * 2 + 1) - (double) field465[var36] + Math.sin((double) field527[var36] / 100.0D * (double) field292[var36]) * (double) field526[var36]);
                if (var36 == 0) {
                    Statics.field1366 += var37;
                }
                if (var36 == 1) {
                    Statics.field1071 += var37;
                }
                if (var36 == 2) {
                    Statics.field2126 += var37;
                }
                if (var36 == 3) {
                    Statics.field633 = Statics.field633 + var37 & 0x7FF;
                }
                if (var36 == 4) {
                    Statics.field28 += var37;
                    if (Statics.field28 < 128) {
                        Statics.field28 = 128;
                    }
                    if (Statics.field28 > 383) {
                        Statics.field28 = 383;
                    }
                }
            }
        }
        int var38 = class140.field2116;
        int var39 = class140.field2120;
        if (class140.field2122 != 0) {
            var38 = class140.field2123;
            var39 = class140.field2117;
        }
        if (var38 >= var12 && var38 < var12 + var14 && var39 >= var13 && var39 < var13 + var15) {
            class105.field1834 = true;
            class105.field1827 = 0;
            class105.field1825 = var38 - var12;
            class105.field1826 = var39 - var13;
        } else {
            class105.field1834 = false;
            class105.field1827 = 0;
        }
        method565();
        class80.method1661(var12, var13, var14, var15, 0);
        method565();
        int var40 = class91.field1554;
        class91.field1554 = field541;
        Statics.field1976.method1773(Statics.field1366, Statics.field1071, Statics.field2126, Statics.field28, Statics.field633, var30);
        class91.field1554 = var40;
        method565();
        Statics.field1976.method1767();
        field371 = 0;
        boolean var41 = false;
        int var42 = -1;
        int var43 = class33.field754;
        int[] var44 = class33.field757;
        for (int var45 = 0; var45 < field313 + var43; var45++) {
            class38 var46;
            if (var45 < var43) {
                var46 = field404[var44[var45]];
                if (field548 == var44[var45]) {
                    var41 = true;
                    var42 = var45;
                    continue;
                }
            } else {
                var46 = field312[field314[var45 - var43]];
            }
            method2609(var46, var45, var12, var13, var14, var15);
        }
        if (var41) {
            method2609(field404[field548], var42, var12, var13, var14, var15);
        }
        for (int var47 = 0; var47 < field371; var47++) {
            int var48 = field546[var47];
            int var49 = field424[var47];
            int var50 = field376[var47];
            int var51 = field375[var47];
            boolean var52 = true;
            while (var52) {
                var52 = false;
                for (int var53 = 0; var53 < var47; var53++) {
                    if (var49 + 2 > field424[var53] - field375[var53] && var49 - var51 < field424[var53] + 2 && var48 - var50 < field546[var53] + field376[var53] && var48 + var50 > field546[var53] - field376[var53] && field424[var53] - field375[var53] < var49) {
                        var49 = field424[var53] - field375[var53];
                        var52 = true;
                    }
                }
            }
            field498 = field546[var47];
            field549 = field424[var47] = var49;
            String var54 = field380[var47];
            if (field468 == 0) {
                int var55 = 16776960;
                if (field377[var47] < 6) {
                    var55 = field351[field377[var47]];
                }
                if (field377[var47] == 6) {
                    var55 = field481 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field377[var47] == 7) {
                    var55 = field481 % 20 < 10 ? 255 : 65535;
                }
                if (field377[var47] == 8) {
                    var55 = field481 % 20 < 10 ? 45056 : 8454016;
                }
                if (field377[var47] == 9) {
                    int var56 = 150 - field311[var47];
                    if (var56 < 50) {
                        var55 = var56 * 1280 + 16711680;
                    } else if (var56 < 100) {
                        var55 = 16776960 - (var56 - 50) * 327680;
                    } else if (var56 < 150) {
                        var55 = (var56 - 100) * 5 + 65280;
                    }
                }
                if (field377[var47] == 10) {
                    int var57 = 150 - field311[var47];
                    if (var57 < 50) {
                        var55 = var57 * 5 + 16711680;
                    } else if (var57 < 100) {
                        var55 = 16711935 - (var57 - 50) * 327680;
                    } else if (var57 < 150) {
                        var55 = (var57 - 100) * 327680 + 255 - (var57 - 100) * 5;
                    }
                }
                if (field377[var47] == 11) {
                    int var58 = 150 - field311[var47];
                    if (var58 < 50) {
                        var55 = 16777215 - var58 * 327685;
                    } else if (var58 < 100) {
                        var55 = (var58 - 50) * 327685 + 65280;
                    } else if (var58 < 150) {
                        var55 = 16777215 - (var58 - 100) * 327680;
                    }
                }
                if (field493[var47] == 0) {
                    Statics.field1645.method3739(var54, field498 + var12, field549 + var13, var55, 0);
                }
                if (field493[var47] == 1) {
                    Statics.field1645.method3741(var54, field498 + var12, field549 + var13, var55, 0, field481);
                }
                if (field493[var47] == 2) {
                    Statics.field1645.method3742(var54, field498 + var12, field549 + var13, var55, 0, field481);
                }
                if (field493[var47] == 3) {
                    Statics.field1645.method3777(var54, field498 + var12, field549 + var13, var55, 0, field481, 150 - field311[var47]);
                }
                if (field493[var47] == 4) {
                    int var59 = (150 - field311[var47]) * (Statics.field1645.method3732(var54) + 100) / 150;
                    class80.method1656(field498 + var12 - 50, var13, field498 + var12 + 50, var13 + var15);
                    Statics.field1645.method3737(var54, field498 + var12 + 50 - var59, field549 + var13, var55, 0);
                    class80.method1655(var12, var13, var12 + var14, var13 + var15);
                }
                if (field493[var47] == 5) {
                    int var60 = 150 - field311[var47];
                    int var61 = 0;
                    if (var60 < 25) {
                        var61 = var60 - 25;
                    } else if (var60 > 125) {
                        var61 = var60 - 125;
                    }
                    class80.method1656(var12, field549 + var13 - Statics.field1645.field3165 - 1, var12 + var14, field549 + var13 + 5);
                    Statics.field1645.method3739(var54, field498 + var12, field549 + var13 + var61, var55, 0);
                    class80.method1655(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field1645.method3739(var54, field498 + var12, field549 + var13, 16776960, 0);
            }
        }
        if (field293 == 2) {
            method576((field296 - Statics.field14 << 7) + field299, (field297 - Statics.field1436 << 7) + field536, field298 * 2);
            if (field498 > -1 && field285 % 20 < 10) {
                Statics.field1072[0].method1574(field498 + var12 - 12, field549 + var13 - 28);
            }
        }
        ((class95) Statics.field1563).method1991(field397);
        Statics.method1553(var12, var13, var14, var15);
        Statics.field1366 = var31;
        Statics.field1071 = var32;
        Statics.field2126 = var33;
        Statics.field28 = var34;
        Statics.field633 = var35;
        if (field525) {
            byte var62 = 0;
            int var63 = class171.field2716 + class171.field2703 + var62;
            if (var63 == 0) {
                field525 = false;
            }
        }
        if (field525) {
            class80.method1661(var12, var13, var14, var15, 0);
            method2225(class157.field2295, false);
        }
    }

    @ObfuscatedName("ax.av(IIIIZB)V")
    public static final void method682(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field388 - field529) * var5 / 100 + field529;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field535) {
            short var8 = field535;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field337) {
                var6 = field337;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1654();
                    class80.method1661(arg0, arg1, var10, arg3, -16777216);
                    class80.method1661(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field551) {
            short var11 = field551;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field330) {
                var6 = field330;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1654();
                    class80.method1661(arg0, arg1, arg2, var13, -16777216);
                    class80.method1661(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field532 - field531) * var5 / 100 + field531;
        field541 = arg3 * var6 * var14 / 85504 << 1;
        if (field316 != arg2 || field550 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1566[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1770(var15, 500, 800, arg2, arg3);
        }
        field537 = arg0;
        field534 = arg1;
        field316 = arg2;
        field550 = arg3;
    }

    @ObfuscatedName("fu.as(ZI)V")
    public static final void method2971(boolean arg0) {
        for (int var1 = 0; var1 < field313; var1++) {
            class35 var2 = field312[field314[var1]];
            int var3 = (field314[var1] << 14) + 536870912;
            if (var2 != null && var2.method17() && var2.field781.field889 == arg0 && var2.field781.method729()) {
                int var4 = var2.field859 >> 7;
                int var5 = var2.field839 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field816 == 1 && (var2.field859 & 0x7F) == 64 && (var2.field839 & 0x7F) == 64) {
                        if (field481 == field381[var4][var5]) {
                            continue;
                        }
                        field381[var4][var5] = field481;
                    }
                    if (!var2.field781.field916) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1976.method1832(Statics.field2983, var2.field859, var2.field839, method2209(var2.field859 + (var2.field816 * 64 - 64), var2.field839 + (var2.field816 * 64 - 64), Statics.field2983), var2.field816 * 64 - 64 + 60, var2, var2.field814, var3, var2.field815);
                }
            }
        }
    }

    @ObfuscatedName("fs.ag(I)I")
    public static final int method3195() {
        if (Statics.field2046.field133) {
            return Statics.field2983;
        } else {
            int var0 = method2209(Statics.field1366, Statics.field2126, Statics.field2983);
            return var0 - Statics.field1071 >= 800 || (class6.field78[Statics.field2983][Statics.field1366 >> 7][Statics.field2126 >> 7] & 0x4) == 0 ? 3 : Statics.field2983;
        }
    }

    @ObfuscatedName("dl.ab(Lak;IIIIIB)V")
    public static final void method2609(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method17()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field781;
            if (var6.field884 != null) {
                var6 = var6.method750();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field754;
        int[] var8 = class33.field757;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field51) {
                return;
            }
            if (var10.field56 != -1 || var10.field54 != -1) {
                method2599(arg0, arg0.field861 + 15);
                if (field498 > -1) {
                    if (var10.field56 != -1) {
                        Statics.field3191[var10.field56].method1574(field498 + arg2 - 12, field549 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field54 != -1) {
                        Statics.field1[var10.field54].method1574(field498 + arg2 - 12, field549 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field293 == 10 && field295 == var8[arg1]) {
                method2599(arg0, arg0.field861 + 15);
                if (field498 > -1) {
                    Statics.field1072[1].method1574(field498 + arg2 - 12, field549 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field781;
            if (var11.field884 != null) {
                var11 = var11.method750();
            }
            if (var11.field911 >= 0 && var11.field911 < Statics.field1.length) {
                method2599(arg0, arg0.field861 + 15);
                if (field498 > -1) {
                    Statics.field1[var11.field911].method1574(field498 + arg2 - 12, field549 + arg3 - 30);
                }
            }
            if (field293 == 1 && field294 == field314[arg1 - var7] && field285 % 20 < 10) {
                method2599(arg0, arg0.field861 + 15);
                if (field498 > -1) {
                    Statics.field1072[0].method1574(field498 + arg2 - 12, field549 + arg3 - 28);
                }
            }
        }
        if (arg0.field864 != null && (arg1 >= var7 || !arg0.field827 && (field328 == 4 || !arg0.field826 && (field328 == 0 || field328 == 3 || field328 == 1 && method983(((class3) arg0).field35, false))))) {
            method2599(arg0, arg0.field861);
            if (field498 > -1 && field371 < field367) {
                field376[field371] = Statics.field1645.method3732(arg0.field864) / 2;
                field375[field371] = Statics.field1645.field3165;
                field546[field371] = field498;
                field424[field371] = field549;
                field377[field371] = arg0.field840;
                field493[field371] = arg0.field869;
                field311[field371] = arg0.field828;
                field380[field371] = arg0.field864;
                field371++;
            }
        }
        if (arg0.field834 > field285) {
            method2599(arg0, arg0.field861 + 15);
            if (field498 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field781;
                    var12 = var13.field918;
                }
                int var14 = arg0.field835 * var12 / arg0.field836;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field835 > 0) {
                    var14 = 1;
                }
                class80.method1661(field498 + arg2 - var12 / 2, field549 + arg3 - 3, var14, 5, 65280);
                class80.method1661(field498 + arg2 - var12 / 2 + var14, field549 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field865[var15] > field285) {
                method2599(arg0, arg0.field861 / 2);
                if (field498 > -1) {
                    if (var15 == 1) {
                        field549 -= 20;
                    }
                    if (var15 == 2) {
                        field498 -= 15;
                        field549 -= 10;
                    }
                    if (var15 == 3) {
                        field498 += 15;
                        field549 -= 10;
                    }
                    Statics.field602[arg0.field863[var15]].method1574(field498 + arg2 - 12, field549 + arg3 - 12);
                    Statics.field2143.method3739(Integer.toString(arg0.field831[var15]), field498 + arg2 - 1, field549 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ac.al(I)V")
    public static final void method686() {
        field403 = 0;
        int var0 = (Statics.field2644.field859 >> 7) + Statics.field14;
        int var1 = (Statics.field2644.field839 >> 7) + Statics.field1436;
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

    @ObfuscatedName("dx.ay(Lak;IB)V")
    public static final void method2599(class38 arg0, int arg1) {
        method576(arg0.field859, arg0.field839, arg1);
    }

    @ObfuscatedName("z.an(IIII)V")
    public static final void method576(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field498 = -1;
            field549 = -1;
            return;
        }
        int var3 = method2209(arg0, arg1, Statics.field2983) - arg2;
        int var4 = arg0 - Statics.field1366;
        int var5 = var3 - Statics.field1071;
        int var6 = arg1 - Statics.field2126;
        int var7 = class91.field1566[Statics.field28];
        int var8 = class91.field1567[Statics.field28];
        int var9 = class91.field1566[Statics.field633];
        int var10 = class91.field1567[Statics.field633];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field498 = field541 * var11 / var15 + field316 / 2;
            field549 = field541 * var14 / var15 + field550 / 2;
        } else {
            field498 = -1;
            field549 = -1;
        }
    }

    @ObfuscatedName("dn.ah(IIII)I")
    public static final int method2209(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field78[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field85[var5][var3][var4] + class6.field85[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field85[var5][var3][var4 + 1] + class6.field85[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ho.be(IIIIIII)V")
    public static final void method3655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class91.field1566[var6];
            int var12 = class91.field1567[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class91.field1566[var7];
            int var15 = class91.field1567[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1366 = arg0 - var8;
        Statics.field1071 = arg1 - var9;
        Statics.field2126 = arg2 - var10;
        Statics.field28 = arg3;
        Statics.field633 = arg4;
    }

    @ObfuscatedName("a.bb(ZI)V")
    public static final void method183(boolean arg0) {
        field464 = arg0;
        if (!field464) {
            int var1 = field319.method2327();
            int var2 = field319.method2293();
            int var3 = (field320 - field319.field1955) / 16;
            Statics.field1601 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1601[var4][var5] = field319.method2296();
                }
            }
            Statics.field1734 = new int[var3];
            Statics.field709 = new int[var3];
            Statics.field791 = new int[var3];
            Statics.field1097 = new byte[var3][];
            Statics.field34 = new byte[var3][];
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
                        Statics.field1734[var7] = var10;
                        Statics.field709[var7] = Statics.field169.method3009("m" + var8 + "_" + var9);
                        Statics.field791[var7] = Statics.field169.method3009("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2895(var2, var1);
            return;
        }
        int var11 = field319.method2326();
        int var12 = field319.method2326();
        field319.method2533();
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 13; var14++) {
                for (int var15 = 0; var15 < 13; var15++) {
                    int var16 = field319.method2530(1);
                    if (var16 == 1) {
                        field336[var13][var14][var15] = field319.method2530(26);
                    } else {
                        field336[var13][var14][var15] = -1;
                    }
                }
            }
        }
        field319.method2531();
        int var17 = (field320 - field319.field1955) / 16;
        Statics.field1601 = new int[var17][4];
        for (int var18 = 0; var18 < var17; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1601[var18][var19] = field319.method2296();
            }
        }
        Statics.field1734 = new int[var17];
        Statics.field709 = new int[var17];
        Statics.field791 = new int[var17];
        Statics.field1097 = new byte[var17][];
        Statics.field34 = new byte[var17][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field336[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1734[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1734[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field709[var20] = Statics.field169.method3009("m" + var29 + "_" + var30);
                            Statics.field791[var20] = Statics.field169.method3009("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2895(var11, var12);
    }

    @ObfuscatedName("ew.bx(III)V")
    public static final void method2895(int arg0, int arg1) {
        if (Statics.field206 == arg0 && Statics.field2984 == arg1) {
            return;
        }
        Statics.field206 = arg0;
        Statics.field2984 = arg1;
        method145(25);
        method2225(class157.field2295, true);
        int var2 = Statics.field14;
        int var3 = Statics.field1436;
        Statics.field14 = (arg0 - 6) * 8;
        Statics.field1436 = (arg1 - 6) * 8;
        int var4 = Statics.field14 - var2;
        int var5 = Statics.field1436 - var3;
        int var6 = Statics.field14;
        int var7 = Statics.field1436;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field312[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field866[var10] -= var4;
                    var9.field867[var10] -= var5;
                }
                var9.field859 -= var4 * 128;
                var9.field839 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field404[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field866[var13] -= var4;
                    var12.field867[var13] -= var5;
                }
                var12.field859 -= var4 * 128;
                var12.field839 -= var5 * 128;
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
        for (class17 var25 = (class17) field409.method3558(); var25 != null; var25 = (class17) field409.method3554()) {
            var25.field220 -= var4;
            var25.field221 -= var5;
            if (var25.field220 < 0 || var25.field221 < 0 || var25.field220 >= 104 || var25.field221 >= 104) {
                var25.method3646();
            }
        }
        if (field523 != 0) {
            field523 -= var4;
            field492 -= var5;
        }
        field517 = 0;
        field508 = false;
        field310 = -1;
        field411.method3560();
        field423.method3560();
    }

    @ObfuscatedName("ae.bk(ZI)V")
    public static final void method957(boolean arg0) {
        method565();
        field323++;
        if (field323 < 50 && !arg0) {
            return;
        }
        field323 = 0;
        if (field552 || Statics.field254 == null) {
            return;
        }
        field317.method2544(125);
        try {
            Statics.field254.method2767(field317.field1956, 0, field317.field1955);
            field317.field1955 = 0;
        } catch (IOException var2) {
            field552 = true;
        }
    }

    @ObfuscatedName("aq.bo(IB)V")
    public static final void method632(int arg0) {
        int[] var1 = Statics.field560.field1389;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field78[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1976.method1769(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field78[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1976.method1769(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field560.method1565();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field78[arg0][var10][var9] & 0x18) == 0) {
                    method175(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field78[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method175(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field505 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1976.method1764(Statics.field2983, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method2760(var14).field951;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field334[Statics.field2983].field1864;
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
                        field398[field505] = Statics.field491[var15];
                        field307[field505] = var16;
                        field487[field505] = var17;
                        field505++;
                    }
                }
            }
        }
        Statics.field211.method1557();
    }

    @ObfuscatedName("e.bi(IIIIII)V")
    public static final void method175(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1976.method1761(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1976.method1754(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field560.field1389;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2760(var12);
            if (var13.field952 == -1) {
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
                class81 var14 = Statics.field186[var13.field952];
                if (var14 != null) {
                    int var15 = (var13.field958 * 4 - var14.field1410) / 2;
                    int var16 = (var13.field939 * 4 - var14.field1408) / 2;
                    var14.method1706(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field939) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1976.method1763(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1976.method1754(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2760(var21);
            if (var22.field952 != -1) {
                class81 var23 = Statics.field186[var22.field952];
                if (var23 != null) {
                    int var24 = (var22.field958 * 4 - var23.field1410) / 2;
                    int var25 = (var22.field939 * 4 - var23.field1408) / 2;
                    var23.method1706(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field939) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field560.field1389;
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
        int var29 = Statics.field1976.method1764(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2760(var30);
        if (var31.field952 == -1) {
            return;
        }
        class81 var32 = Statics.field186[var31.field952];
        if (var32 != null) {
            int var33 = (var31.field958 * 4 - var32.field1410) / 2;
            int var34 = (var31.field939 * 4 - var32.field1408) / 2;
            var32.method1706(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field939) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("t.bc(IIIIIIIIII)V")
    public static final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field409.method3558(); var10 != null; var10 = (class17) field409.method3554()) {
            if (var10.field228 == arg0 && var10.field220 == arg1 && var10.field221 == arg2 && var10.field219 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field228 = arg0;
            var9.field219 = arg3;
            var9.field220 = arg1;
            var9.field221 = arg2;
            method37(var9);
            field409.method3585(var9);
        }
        var9.field226 = arg4;
        var9.field227 = arg5;
        var9.field224 = arg6;
        var9.field229 = arg7;
        var9.field234 = arg8;
    }

    @ObfuscatedName("i.bt(I)V")
    public static final void method96() {
        for (class17 var0 = (class17) field409.method3558(); var0 != null; var0 = (class17) field409.method3554()) {
            if (var0.field234 == -1) {
                var0.field229 = 0;
                method37(var0);
            } else {
                var0.method3646();
            }
        }
    }

    @ObfuscatedName("k.bm(Ll;I)V")
    public static final void method37(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field219 == 0) {
            var1 = Statics.field1976.method1761(arg0.field228, arg0.field220, arg0.field221);
        }
        if (arg0.field219 == 1) {
            var1 = Statics.field1976.method1762(arg0.field228, arg0.field220, arg0.field221);
        }
        if (arg0.field219 == 2) {
            var1 = Statics.field1976.method1763(arg0.field228, arg0.field220, arg0.field221);
        }
        if (arg0.field219 == 3) {
            var1 = Statics.field1976.method1764(arg0.field228, arg0.field220, arg0.field221);
        }
        if (var1 != 0) {
            int var5 = Statics.field1976.method1754(arg0.field228, arg0.field220, arg0.field221, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field222 = var2;
        arg0.field218 = var3;
        arg0.field223 = var4;
    }

    @ObfuscatedName("e.bn(B)V")
    public static final void method171() {
        for (class17 var0 = (class17) field409.method3558(); var0 != null; var0 = (class17) field409.method3554()) {
            if (var0.field234 > 0) {
                var0.field234--;
            }
            if (var0.field234 == 0) {
                if (var0.field222 >= 0) {
                    int var1 = var0.field222;
                    int var2 = var0.field218;
                    class41 var3 = class41.method2760(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method752(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method105(var0.field228, var0.field219, var0.field220, var0.field221, var0.field222, var0.field223, var0.field218);
                var0.method3646();
            } else {
                if (var0.field229 > 0) {
                    var0.field229--;
                }
                if (var0.field229 == 0 && var0.field220 >= 1 && var0.field221 >= 1 && var0.field220 <= 102 && var0.field221 <= 102) {
                    if (var0.field226 >= 0) {
                        int var5 = var0.field226;
                        int var6 = var0.field227;
                        class41 var7 = class41.method2760(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method752(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method105(var0.field228, var0.field219, var0.field220, var0.field221, var0.field226, var0.field224, var0.field227);
                    var0.field229 = -1;
                    if (var0.field226 == var0.field222 && var0.field222 == -1) {
                        var0.method3646();
                    } else if (var0.field226 == var0.field222 && var0.field224 == var0.field223 && var0.field227 == var0.field218) {
                        var0.method3646();
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.by(IIIIIIII)V")
    public static final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field278 && Statics.field2983 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1976.method1761(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1976.method1762(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1976.method1763(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1976.method1764(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1976.method1754(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1976.method1822(arg0, arg2, arg3);
                class41 var15 = class41.method2760(var12);
                if (var15.field974 != 0) {
                    field334[arg0].method2165(arg2, arg3, var13, var14, var15.field941);
                }
            }
            if (arg1 == 1) {
                Statics.field1976.method1787(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1976.method1853(arg0, arg2, arg3);
                class41 var16 = class41.method2760(var12);
                if (var16.field958 + arg2 > 103 || var16.field958 + arg3 > 103 || var16.field939 + arg2 > 103 || var16.field939 + arg3 > 103) {
                    return;
                }
                if (var16.field974 != 0) {
                    field334[arg0].method2184(arg2, arg3, var16.field958, var16.field939, var14, var16.field941);
                }
            }
            if (arg1 == 3) {
                Statics.field1976.method1755(arg0, arg2, arg3);
                class41 var17 = class41.method2760(var12);
                if (var17.field974 == 1) {
                    field334[arg0].method2175(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field78[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method610(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1976, field334[arg0]);
    }

    @ObfuscatedName("bf.bs(ZI)V")
    public static final void method1525(boolean arg0) {
        field401 = 0;
        field436 = 0;
        method2638();
        while (field319.method2526(field320) >= 27) {
            int var1 = field319.method2530(15);
            if (var1 == 32767) {
                break;
            }
            boolean var5 = false;
            if (field312[var1] == null) {
                field312[var1] = new class35();
                var5 = true;
            }
            class35 var6 = field312[var1];
            field314[++field313 - 1] = var1;
            var6.field871 = field285;
            int var7 = field319.method2530(1);
            int var8 = field406[field319.method2530(3)];
            if (var5) {
                var6.field825 = var6.field814 = var8;
            }
            int var9;
            if (arg0) {
                var9 = field319.method2530(8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = field319.method2530(5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10;
            if (arg0) {
                var10 = field319.method2530(8);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = field319.method2530(5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            var6.field781 = Statics.method618(field319.method2530(14));
            int var11 = field319.method2530(1);
            if (var11 == 1) {
                field538[++field436 - 1] = var1;
            }
            var6.field816 = var6.field781.field890;
            var6.field843 = var6.field781.field912;
            if (var6.field843 == 0) {
                var6.field814 = 0;
            }
            var6.field820 = var6.field781.field887;
            var6.field821 = var6.field781.field905;
            var6.field822 = var6.field781.field897;
            var6.field823 = var6.field781.field898;
            var6.field817 = var6.field781.field914;
            var6.field818 = var6.field781.field893;
            var6.field862 = var6.field781.field894;
            var6.method689(Statics.field2644.field866[0] + var10, Statics.field2644.field867[0] + var9, var7 == 1);
        }
        field319.method2531();
        method2088();
        for (int var2 = 0; var2 < field401; var2++) {
            int var3 = field304[var2];
            if (field285 != field312[var3].field871) {
                field312[var3].field781 = null;
                field312[var3] = null;
            }
        }
        if (field320 != field319.field1955) {
            throw new RuntimeException(field319.field1955 + class2.field19 + field320);
        }
        for (int var4 = 0; var4 < field313; var4++) {
            if (field312[field314[var4]] == null) {
                throw new RuntimeException(var4 + class2.field19 + field313);
            }
        }
    }

    @ObfuscatedName("eg.bv(I)V")
    public static final void method2638() {
        field319.method2533();
        int var0 = field319.method2530(8);
        if (var0 < field313) {
            for (int var1 = var0; var1 < field313; var1++) {
                field304[++field401 - 1] = field314[var1];
            }
        }
        if (var0 > field313) {
            throw new RuntimeException("");
        }
        field313 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field314[var2];
            class35 var4 = field312[var3];
            int var5 = field319.method2530(1);
            if (var5 == 0) {
                field314[++field313 - 1] = var3;
                var4.field871 = field285;
            } else {
                int var6 = field319.method2530(2);
                if (var6 == 0) {
                    field314[++field313 - 1] = var3;
                    var4.field871 = field285;
                    field538[++field436 - 1] = var3;
                } else if (var6 == 1) {
                    field314[++field313 - 1] = var3;
                    var4.field871 = field285;
                    int var7 = field319.method2530(3);
                    var4.method690(var7, (byte) 1);
                    int var8 = field319.method2530(1);
                    if (var8 == 1) {
                        field538[++field436 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field314[++field313 - 1] = var3;
                    var4.field871 = field285;
                    int var9 = field319.method2530(3);
                    var4.method690(var9, (byte) 2);
                    int var10 = field319.method2530(3);
                    var4.method690(var10, (byte) 2);
                    int var11 = field319.method2530(1);
                    if (var11 == 1) {
                        field538[++field436 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field304[++field401 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("cy.bd(I)V")
    public static final void method2088() {
        for (int var0 = 0; var0 < field436; var0++) {
            int var1 = field538[var0];
            class35 var2 = field312[var1];
            int var3 = field319.method2291();
            if ((var3 & 0x40) != 0) {
                int var4 = field319.method2427();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field319.method2291();
                if (var2.field846 == var4 && var4 != -1) {
                    int var6 = class43.method2648(var4).field1002;
                    if (var6 == 1) {
                        var2.field844 = 0;
                        var2.field845 = 0;
                        var2.field858 = var5;
                        var2.field852 = 0;
                    }
                    if (var6 == 2) {
                        var2.field852 = 0;
                    }
                } else if (var4 == -1 || var2.field846 == -1 || class43.method2648(var4).field996 >= class43.method2648(var2.field846).field996) {
                    var2.field846 = var4;
                    var2.field844 = 0;
                    var2.field845 = 0;
                    var2.field858 = var5;
                    var2.field852 = 0;
                    var2.field870 = var2.field829;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field848 = field319.method2326();
                int var7 = field319.method2418();
                var2.field855 = var7 >> 16;
                var2.field851 = (var7 & 0xFFFF) + field285;
                var2.field849 = 0;
                var2.field833 = 0;
                if (var2.field851 > field285) {
                    var2.field849 = -1;
                }
                if (var2.field848 == 65535) {
                    var2.field848 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var8 = field319.method2319();
                int var9 = field319.method2350();
                var2.method711(var8, var9, field285);
                var2.field834 = field285 + 300;
                var2.field835 = field319.method2327();
                var2.field836 = field319.method2327();
            }
            if ((var3 & 0x1) != 0) {
                var2.field837 = field319.method2293();
                if (var2.field837 == 65535) {
                    var2.field837 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var10 = field319.method2423();
                int var11 = field319.method2291();
                var2.method711(var10, var11, field285);
                var2.field834 = field285 + 300;
                var2.field835 = field319.method2293();
                var2.field836 = field319.method2326();
            }
            if ((var3 & 0x4) != 0) {
                var2.field781 = Statics.method618(field319.method2326());
                var2.field816 = var2.field781.field890;
                var2.field843 = var2.field781.field912;
                var2.field820 = var2.field781.field887;
                var2.field821 = var2.field781.field905;
                var2.field822 = var2.field781.field897;
                var2.field823 = var2.field781.field898;
                var2.field817 = var2.field781.field914;
                var2.field818 = var2.field781.field893;
                var2.field862 = var2.field781.field894;
            }
            if ((var3 & 0x2) != 0) {
                int var12 = field319.method2427();
                int var13 = field319.method2326();
                int var14 = var2.field866[0] + var2.field866[0] - (var12 - Statics.field14 - Statics.field14);
                int var15 = var2.field867[0] + var2.field867[0] - (var13 - Statics.field1436 - Statics.field1436);
                if (var14 != 0 || var15 != 0) {
                    var2.field847 = (int) (Math.atan2((double) var14, (double) var15) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field864 = field319.method2299();
                var2.field828 = 100;
            }
        }
    }

    @ObfuscatedName("am.bp(III)Lds;")
    public static class107 method688(int arg0, int arg1) {
        field554.field1847 = arg0;
        field554.field1845 = arg1;
        field554.field1846 = 1;
        field554.field1850 = 1;
        return field554;
    }

    @ObfuscatedName("ho.bq(IIIII)V")
    public static final void method3656(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field478; var4++) {
            if (field485[var4] + field483[var4] > arg0 && field483[var4] < arg0 + arg2 && field495[var4] + field322[var4] > arg1 && field322[var4] < arg1 + arg3) {
                field480[var4] = true;
            }
        }
    }

    @ObfuscatedName("cz.bh(IIIII)V")
    public static final void method1983(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field478; var4++) {
            if (field485[var4] + field483[var4] > arg0 && field483[var4] < arg0 + arg2 && field495[var4] + field322[var4] > arg1 && field322[var4] < arg1 + arg3) {
                field511[var4] = true;
            }
        }
    }

    @ObfuscatedName("fk.ba(B)V")
    public static final void method3214() {
        method160();
        if (Statics.field1096 != null || field528 != null) {
            return;
        }
        int var12;
        int var13;
        label199: {
            int var0 = class140.field2122;
            if (field416) {
                if (var0 != 1 && (Statics.field208 || var0 != 4)) {
                    int var1 = class140.field2116;
                    int var2 = class140.field2120;
                    if (var1 < Statics.field661 - 10 || var1 > Statics.field661 + Statics.field1541 + 10 || var2 < Statics.field3140 - 10 || var2 > Statics.field3140 + Statics.field2623 + 10) {
                        field416 = false;
                        method3656(Statics.field661, Statics.field3140, Statics.field1541, Statics.field2623);
                    }
                }
                if (var0 == 1 || !Statics.field208 && var0 == 4) {
                    int var3 = Statics.field661;
                    int var4 = Statics.field3140;
                    int var5 = Statics.field1541;
                    int var6 = class140.field2123;
                    int var7 = class140.field2117;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field342; var9++) {
                        int var10 = (field342 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        Statics.method2583(var8);
                    }
                    field416 = false;
                    method3656(Statics.field661, Statics.field3140, Statics.field1541, Statics.field2623);
                }
            } else {
                if ((var0 == 1 || !Statics.field208 && var0 == 4) && field342 > 0) {
                    int var11 = field420[field342 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field418[field342 - 1];
                        var13 = field419[field342 - 1];
                        class173 var14 = class173.method708(var13);
                        if (class178.method1205(method1035(var14))) {
                            break label199;
                        }
                        int var15 = method1035(var14);
                        boolean var16 = (var15 >> 29 & 0x1) != 0;
                        if (var16) {
                            break label199;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field208 && var0 == 4) && (field271 == 1 && field342 > 2 || method1896(field342 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field208 && var0 == 4) && field342 > 0) {
                    int var18 = field342 - 1;
                    if (var18 >= 0) {
                        int var19 = field418[var18];
                        int var20 = field419[var18];
                        int var21 = field420[var18];
                        int var22 = field344[var18];
                        String var23 = field396[var18];
                        String var24 = field281[var18];
                        method1978(var19, var20, var21, var22, var23, var24, class140.field2123, class140.field2117);
                    }
                }
                if (var0 == 2 && field342 > 0) {
                    method3205(class140.field2123, class140.field2117);
                }
            }
            return;
        }
        if (Statics.field1096 != null && !field395 && field271 != 1 && !method1896(field342 - 1) && field342 > 0) {
            method3071(field510, field373);
        }
        field395 = false;
        field365 = 0;
        if (Statics.field1096 != null) {
            method643(Statics.field1096);
        }
        Statics.field1096 = class173.method708(var13);
        field391 = var12;
        field510 = class140.field2123;
        field373 = class140.field2117;
        if (field342 > 0) {
            int var17 = field342 - 1;
            Statics.field671 = new class31();
            Statics.field671.field705 = field418[var17];
            Statics.field671.field697 = field419[var17];
            Statics.field671.field698 = field420[var17];
            Statics.field671.field699 = field344[var17];
            Statics.field671.field700 = field396[var17];
        }
        method643(Statics.field1096);
    }

    @ObfuscatedName("fi.bz(IIB)V")
    public static final void method3205(int arg0, int arg1) {
        int var2 = Statics.field1645.method3732(class157.field2327);
        for (int var3 = 0; var3 < field342; var3++) {
            int var4 = Statics.field1645.method3732(method2702(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field342 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1604) {
            var6 = Statics.field1604 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field776) {
            var7 = Statics.field776 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field416 = true;
        Statics.field661 = var6;
        Statics.field3140 = var7;
        Statics.field1541 = var2;
        Statics.field2623 = field342 * 15 + 22;
    }

    @ObfuscatedName("cs.bw(IB)Z")
    public static final boolean method1896(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field420[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("m.bg(Lat;IIB)V")
    public static final void method118(class31 arg0, int arg1, int arg2) {
        method1978(arg0.field705, arg0.field697, arg0.field698, arg0.field699, arg0.field700, arg0.field700, arg1, arg2);
    }

    @ObfuscatedName("cu.bf(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 15) {
            class3 var8 = field404[arg3];
            if (var8 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(199);
                field317.method2325(arg3);
                field317.method2315(class137.field2075[82] ? 1 : 0);
                field317.method2416(field431);
                field317.method2405(Statics.field1035);
            }
        }
        if (arg2 == 22) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(90);
            field317.method2323(Statics.field14 + arg0);
            field317.method2451(Statics.field1436 + arg1);
            field317.method2451(arg3);
            field317.method2315(class137.field2075[82] ? 1 : 0);
        }
        if (arg2 == 5) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(45);
            field317.method2325(Statics.field14 + arg0);
            field317.method2323(arg3 >> 14 & 0x7FFF);
            field317.method2315(class137.field2075[82] ? 1 : 0);
            field317.method2323(Statics.field1436 + arg1);
        }
        if (arg2 == 32) {
            field317.method2544(51);
            field317.method2325(arg0);
            field317.method2405(Statics.field1035);
            field317.method2334(arg1);
            field317.method2325(field431);
            field317.method2416(arg3);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 11) {
            class35 var9 = field312[arg3];
            if (var9 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(235);
                field317.method2400(class137.field2075[82] ? 1 : 0);
                field317.method2451(arg3);
            }
        }
        if (arg2 == 49) {
            class3 var10 = field404[arg3];
            if (var10 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(183);
                field317.method2416(arg3);
                field317.method2316(class137.field2075[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field317.method2544(188);
            field317.method2484(arg1);
            field317.method2334(Statics.field2178);
            field317.method2325(arg0);
            field317.method2325(arg3);
            field317.method2451(Statics.field1981);
            field317.method2451(Statics.field1505);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 1) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(48);
            field317.method2333(Statics.field2178);
            field317.method2316(class137.field2075[82] ? 1 : 0);
            field317.method2451(Statics.field1981);
            field317.method2325(Statics.field1505);
            field317.method2451(arg3 >> 14 & 0x7FFF);
            field317.method2416(Statics.field1436 + arg1);
            field317.method2451(Statics.field14 + arg0);
        }
        if (arg2 == 24) {
            class173 var11 = class173.method708(arg1);
            boolean var12 = true;
            if (var11.field2834 > 0) {
                var12 = method2525(var11);
            }
            if (var12) {
                field317.method2544(195);
                field317.method2484(arg1);
            }
        }
        if (arg2 == 44) {
            class3 var13 = field404[arg3];
            if (var13 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(9);
                field317.method2416(arg3);
                field317.method2315(class137.field2075[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field317.method2544(221);
            field317.method2484(arg1);
            field317.method2416(arg0);
            field317.method2323(arg3);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 19) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(126);
            field317.method2451(Statics.field1436 + arg1);
            field317.method2325(arg3);
            field317.method2276(class137.field2075[82] ? 1 : 0);
            field317.method2416(Statics.field14 + arg0);
        }
        if (arg2 == 42) {
            field317.method2544(202);
            field317.method2323(arg0);
            field317.method2484(arg1);
            field317.method2325(arg3);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 25) {
            class173 var14 = class173.method3108(arg1, arg0);
            if (var14 != null) {
                method1484();
                int var15 = class178.method2575(method1035(var14));
                int var16 = var14.field2859;
                class173 var17 = class173.method3108(arg1, arg0);
                if (var17 != null && var17.field2777 != null) {
                    class1 var18 = new class1();
                    var18.field3 = var17;
                    var18.field17 = var17.field2777;
                    class37.method103(var18);
                }
                field432 = var16;
                field430 = true;
                Statics.field1035 = arg1;
                field431 = arg0;
                Statics.field2616 = var15;
                method643(var17);
                field428 = 0;
                String var19;
                if (class178.method2575(method1035(var14)) == 0) {
                    var19 = null;
                } else if (var14.field2818 == null || var14.field2818.trim().length() == 0) {
                    var19 = null;
                } else {
                    var19 = var14.field2818;
                }
                field433 = var19;
                if (field433 == null) {
                    field433 = "Null";
                }
                if (var14.field2844) {
                    field434 = var14.field2812 + class2.method22(16777215);
                } else {
                    field434 = class2.method22(65280) + var14.field2867 + class2.method22(16777215);
                }
            }
            return;
        }
        if (arg2 == 34) {
            field317.method2544(247);
            field317.method2325(arg3);
            field317.method2325(arg0);
            field317.method2334(arg1);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 37) {
            field317.method2544(255);
            field317.method2451(arg3);
            field317.method2334(arg1);
            field317.method2325(arg0);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 1002) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field317.method2544(224);
            field317.method2416(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 12) {
            class35 var20 = field312[arg3];
            if (var20 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(24);
                field317.method2325(arg3);
                field317.method2316(class137.field2075[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var21 = class173.method3108(arg1, arg0);
            if (var21 != null) {
                int var22 = var21.field2859;
                class173 var23 = class173.method3108(arg1, arg0);
                if (var23 != null) {
                    if (var23.field2839 != null) {
                        class1 var24 = new class1();
                        var24.field3 = var23;
                        var24.field6 = arg3;
                        var24.field2 = arg5;
                        var24.field17 = var23.field2839;
                        class37.method103(var24);
                    }
                    boolean var25 = true;
                    if (var23.field2834 > 0) {
                        var25 = method2525(var23);
                    }
                    if (var25 && class178.method40(method1035(var23), arg3 - 1)) {
                        if (arg3 == 1) {
                            field317.method2544(46);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                        if (arg3 == 2) {
                            field317.method2544(79);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                        if (arg3 == 3) {
                            field317.method2544(231);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                        if (arg3 == 4) {
                            field317.method2544(80);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                        if (arg3 == 5) {
                            field317.method2544(178);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                        if (arg3 == 6) {
                            field317.method2544(191);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                        if (arg3 == 7) {
                            field317.method2544(78);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                        if (arg3 == 8) {
                            field317.method2544(10);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                        if (arg3 == 9) {
                            field317.method2544(212);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                        if (arg3 == 10) {
                            field317.method2544(223);
                            field317.method2484(arg1);
                            field317.method2451(arg0);
                            field317.method2451(var22);
                        }
                    }
                }
            }
        }
        if (arg2 == 29) {
            field317.method2544(195);
            field317.method2484(arg1);
            class173 var26 = class173.method708(arg1);
            if (var26.field2851 != null && var26.field2851[0][0] == 5) {
                int var27 = var26.field2851[0][1];
                if (class176.field2887[var27] != var26.field2832[0]) {
                    class176.field2887[var27] = var26.field2832[0];
                    method1219(var27);
                }
            }
        }
        if (arg2 == 21) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(56);
            field317.method2451(Statics.field14 + arg0);
            field317.method2316(class137.field2075[82] ? 1 : 0);
            field317.method2323(Statics.field1436 + arg1);
            field317.method2325(arg3);
        }
        if (arg2 == 7) {
            class35 var28 = field312[arg3];
            if (var28 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(137);
                field317.method2325(arg3);
                field317.method2316(class137.field2075[82] ? 1 : 0);
                field317.method2451(Statics.field1981);
                field317.method2334(Statics.field2178);
                field317.method2451(Statics.field1505);
            }
        }
        if (arg2 == 16) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(229);
            field317.method2325(arg3);
            field317.method2451(Statics.field14 + arg0);
            field317.method2416(Statics.field1505);
            field317.method2451(Statics.field1981);
            field317.method2323(Statics.field1436 + arg1);
            field317.method2334(Statics.field2178);
            field317.method2315(class137.field2075[82] ? 1 : 0);
        }
        if (arg2 == 50) {
            class3 var29 = field404[arg3];
            if (var29 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(110);
                field317.method2315(class137.field2075[82] ? 1 : 0);
                field317.method2451(arg3);
            }
        }
        if (arg2 == 39) {
            field317.method2544(13);
            field317.method2334(arg1);
            field317.method2416(arg3);
            field317.method2451(arg0);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 28) {
            field317.method2544(195);
            field317.method2484(arg1);
            class173 var30 = class173.method708(arg1);
            if (var30.field2851 != null && var30.field2851[0][0] == 5) {
                int var31 = var30.field2851[0][1];
                class176.field2887[var31] = 1 - class176.field2887[var31];
                method1219(var31);
            }
        }
        if (arg2 == 1005) {
            class173 var32 = class173.method708(arg1);
            if (var32 == null || var32.field2858[arg0] < 100000) {
                field317.method2544(34);
                field317.method2323(arg3);
            } else {
                class12.method156(27, "", var32.field2858[arg0] + " x " + class52.method971(arg3).field1145);
            }
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 1003) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            class35 var33 = field312[arg3];
            if (var33 != null) {
                class40 var34 = var33.field781;
                if (var34.field884 != null) {
                    var34 = var34.method750();
                }
                if (var34 != null) {
                    field317.method2544(123);
                    field317.method2325(var34.field919);
                }
            }
        }
        if (arg2 == 4) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(63);
            field317.method2325(Statics.field14 + arg0);
            field317.method2323(Statics.field1436 + arg1);
            field317.method2323(arg3 >> 14 & 0x7FFF);
            field317.method2400(class137.field2075[82] ? 1 : 0);
        }
        if (arg2 == 58) {
            class173 var35 = class173.method3108(arg1, arg0);
            if (var35 != null) {
                field317.method2544(122);
                field317.method2323(field431);
                field317.method2333(arg1);
                field317.method2416(field432);
                field317.method2405(Statics.field1035);
                field317.method2323(arg0);
                field317.method2451(var35.field2859);
            }
        }
        if (arg2 == 18) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(87);
            field317.method2451(arg3);
            field317.method2315(class137.field2075[82] ? 1 : 0);
            field317.method2451(Statics.field1436 + arg1);
            field317.method2451(Statics.field14 + arg0);
        }
        if (arg2 == 14) {
            class3 var36 = field404[arg3];
            if (var36 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(62);
                field317.method2333(Statics.field2178);
                field317.method2451(Statics.field1505);
                field317.method2325(arg3);
                field317.method2276(class137.field2075[82] ? 1 : 0);
                field317.method2325(Statics.field1981);
            }
        }
        if (arg2 == 38) {
            method1484();
            class173 var37 = class173.method708(arg1);
            field428 = 1;
            Statics.field1505 = arg0;
            Statics.field2178 = arg1;
            Statics.field1981 = arg3;
            method643(var37);
            field429 = class2.method22(16748608) + class52.method971(arg3).field1145 + class2.method22(16777215);
            if (field429 == null) {
                field429 = "null";
            }
            return;
        }
        if (arg2 == 45) {
            class3 var38 = field404[arg3];
            if (var38 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(249);
                field317.method2323(arg3);
                field317.method2276(class137.field2075[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class35 var39 = field312[arg3];
            if (var39 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(40);
                field317.method2416(arg3);
                field317.method2316(class137.field2075[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field439 == null) {
            method642(arg1, arg0);
            field439 = class173.method3108(arg1, arg0);
            method643(field439);
        }
        if (arg2 == 6) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(7);
            field317.method2416(Statics.field1436 + arg1);
            field317.method2315(class137.field2075[82] ? 1 : 0);
            field317.method2451(Statics.field14 + arg0);
            field317.method2451(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 17) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(135);
            field317.method2333(Statics.field1035);
            field317.method2323(arg3);
            field317.method2416(Statics.field1436 + arg1);
            field317.method2325(field431);
            field317.method2276(class137.field2075[82] ? 1 : 0);
            field317.method2323(Statics.field14 + arg0);
        }
        if (arg2 == 40) {
            field317.method2544(197);
            field317.method2484(arg1);
            field317.method2451(arg0);
            field317.method2451(arg3);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 23) {
            Statics.field1976.method1772(Statics.field2983, arg0, arg1);
        }
        if (arg2 == 8) {
            class35 var40 = field312[arg3];
            if (var40 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(28);
                field317.method2416(arg3);
                field317.method2334(Statics.field1035);
                field317.method2325(field431);
                field317.method2400(class137.field2075[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var41 = field404[arg3];
            if (var41 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(29);
                field317.method2323(arg3);
                field317.method2316(class137.field2075[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            method705();
        }
        if (arg2 == 1001) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(244);
            field317.method2316(class137.field2075[82] ? 1 : 0);
            field317.method2451(Statics.field1436 + arg1);
            field317.method2451(arg3 >> 14 & 0x7FFF);
            field317.method2451(Statics.field14 + arg0);
        }
        if (arg2 == 47) {
            class3 var42 = field404[arg3];
            if (var42 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(43);
                field317.method2276(class137.field2075[82] ? 1 : 0);
                field317.method2416(arg3);
            }
        }
        if (arg2 == 3) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(175);
            field317.method2451(Statics.field14 + arg0);
            field317.method2325(Statics.field1436 + arg1);
            field317.method2276(class137.field2075[82] ? 1 : 0);
            field317.method2325(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class35 var43 = field312[arg3];
            if (var43 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(74);
                field317.method2325(arg3);
                field317.method2400(class137.field2075[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class3 var44 = field404[arg3];
            if (var44 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(75);
                field317.method2323(arg3);
                field317.method2400(class137.field2075[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field317.method2544(228);
            field317.method2333(arg1);
            field317.method2323(arg3);
            field317.method2416(arg0);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 36) {
            field317.method2544(241);
            field317.method2416(arg0);
            field317.method2333(arg1);
            field317.method2323(arg3);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 10) {
            class35 var45 = field312[arg3];
            if (var45 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(81);
                field317.method2316(class137.field2075[82] ? 1 : 0);
                field317.method2323(arg3);
            }
        }
        if (arg2 == 20) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(26);
            field317.method2323(Statics.field14 + arg0);
            field317.method2276(class137.field2075[82] ? 1 : 0);
            field317.method2416(arg3);
            field317.method2451(Statics.field1436 + arg1);
        }
        if (arg2 == 51) {
            class3 var46 = field404[arg3];
            if (var46 != null) {
                field385 = arg6;
                field386 = arg7;
                field521 = 2;
                field277 = 0;
                field523 = arg0;
                field492 = arg1;
                field317.method2544(226);
                field317.method2400(class137.field2075[82] ? 1 : 0);
                field317.method2323(arg3);
            }
        }
        if (arg2 == 1004) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field317.method2544(34);
            field317.method2323(arg3);
        }
        if (arg2 == 33) {
            field317.method2544(141);
            field317.method2334(arg1);
            field317.method2416(arg0);
            field317.method2451(arg3);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 35) {
            field317.method2544(111);
            field317.method2325(arg3);
            field317.method2405(arg1);
            field317.method2416(arg0);
            field389 = 0;
            Statics.field230 = class173.method708(arg1);
            field390 = arg0;
        }
        if (arg2 == 2) {
            field385 = arg6;
            field386 = arg7;
            field521 = 2;
            field277 = 0;
            field523 = arg0;
            field492 = arg1;
            field317.method2544(165);
            field317.method2325(field431);
            field317.method2416(Statics.field1436 + arg1);
            field317.method2315(class137.field2075[82] ? 1 : 0);
            field317.method2451(arg3 >> 14 & 0x7FFF);
            field317.method2323(Statics.field14 + arg0);
            field317.method2334(Statics.field1035);
        }
        if (field428 != 0) {
            field428 = 0;
            method643(class173.method708(Statics.field2178));
        }
        if (field430) {
            method1484();
        }
        if (Statics.field230 != null && field389 == 0) {
            method643(Statics.field230);
        }
    }

    @ObfuscatedName("bl.bu(I)V")
    public static void method1484() {
        if (!field430) {
            return;
        }
        class173 var0 = class173.method3108(Statics.field1035, field431);
        if (var0 != null && var0.field2831 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field17 = var0.field2831;
            class37.method103(var1);
        }
        field430 = false;
        method643(var0);
    }

    @ObfuscatedName("at.cd(III)V")
    public static void method642(int arg0, int arg1) {
        field317.method2544(91);
        field317.method2333(arg0);
        field317.method2416(arg1);
    }

    @ObfuscatedName("x.co(I)V")
    public static final void method160() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field342 - 1; var1++) {
                if (field420[var1] < 1000 && field420[var1 + 1] > 1000) {
                    String var2 = field281[var1];
                    field281[var1] = field281[var1 + 1];
                    field281[var1 + 1] = var2;
                    String var3 = field396[var1];
                    field396[var1] = field396[var1 + 1];
                    field396[var1 + 1] = var3;
                    int var4 = field420[var1];
                    field420[var1] = field420[var1 + 1];
                    field420[var1 + 1] = var4;
                    int var5 = field418[var1];
                    field418[var1] = field418[var1 + 1];
                    field418[var1 + 1] = var5;
                    int var6 = field419[var1];
                    field419[var1] = field419[var1 + 1];
                    field419[var1 + 1] = var6;
                    int var7 = field344[var1];
                    field344[var1] = field344[var1 + 1];
                    field344[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ak.cp(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method718(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field416 || field342 >= 500) {
            return;
        }
        field396[field342] = arg0;
        field281[field342] = arg1;
        field420[field342] = arg2;
        field344[field342] = arg3;
        field418[field342] = arg4;
        field419[field342] = arg5;
        field342++;
    }

    @ObfuscatedName("eq.ce(B)V")
    public static void method2717() {
        for (int var0 = 0; var0 < field342; var0++) {
            if (method3113(field420[var0])) {
                if (var0 < field342 - 1) {
                    for (int var1 = var0; var1 < field342 - 1; var1++) {
                        field396[var1] = field396[var1 + 1];
                        field281[var1] = field281[var1 + 1];
                        field420[var1] = field420[var1 + 1];
                        field344[var1] = field344[var1 + 1];
                        field418[var1] = field418[var1 + 1];
                        field419[var1] = field419[var1 + 1];
                    }
                }
                field342--;
            }
        }
    }

    @ObfuscatedName("fr.cm(II)Z")
    public static boolean method3113(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("em.ck(II)Ljava/lang/String;")
    public static String method2702(int arg0) {
        return field281[arg0].length() > 0 ? field396[arg0] + class157.field2446 + field281[arg0] : field396[arg0];
    }

    @ObfuscatedName("s.cj(Laa;IIII)V")
    public static final void method553(class40 arg0, int arg1, int arg2, int arg3) {
        if (field342 >= 400) {
            return;
        }
        if (arg0.field884 != null) {
            arg0 = arg0.method750();
        }
        if (arg0 == null || !arg0.field916 || arg0.field907 && field360 != arg1) {
            return;
        }
        String var4 = arg0.field888;
        if (arg0.field921 != 0) {
            var4 = var4 + method684(arg0.field921, Statics.field2644.field32) + " " + class2.field21 + class157.field2438 + arg0.field921 + class2.field22;
        }
        if (field428 == 1) {
            method718(class157.field2436, field429 + " " + class2.field23 + " " + class2.method22(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field430) {
            String[] var5 = arg0.field903;
            if (field507) {
                var5 = method906(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2521)) {
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
                        method718(var5[var6], class2.method22(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2521)) {
                        short var9 = 0;
                        if (field490 == class21.field563 || field490 == class21.field566 && arg0.field921 > Statics.field2644.field32) {
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
                        method718(var5[var8], class2.method22(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method718(class157.field2353, class2.method22(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2616 & 0x2) == 2) {
            method718(field433, field434 + " " + class2.field23 + " " + class2.method22(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("be.cn(Lk;IIII)V")
    public static final void method1047(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2644 == arg0 || field342 >= 400) {
            return;
        }
        String var4;
        if (arg0.field37 == 0) {
            var4 = arg0.field35 + method684(arg0.field32, Statics.field2644.field32) + " " + class2.field21 + class157.field2438 + arg0.field32 + class2.field22;
        } else {
            var4 = arg0.field35 + " " + class2.field21 + class157.field2350 + arg0.field37 + class2.field22;
        }
        if (field428 == 1) {
            method718(class157.field2436, field429 + " " + class2.field23 + " " + class2.method22(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field430) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field444[var5] != null) {
                    short var6 = 0;
                    if (field444[var5].equalsIgnoreCase(class157.field2521)) {
                        if (field490 == class21.field563 || field490 == class21.field566 && arg0.field32 > Statics.field2644.field32) {
                            var6 = 2000;
                        }
                        if (Statics.field2644.field50 != 0 && arg0.field50 != 0) {
                            if (Statics.field2644.field50 == arg0.field50) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field405[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field393[var5] + var6;
                    method718(field444[var5], class2.method22(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2616 & 0x8) == 8) {
            method718(field433, field434 + " " + class2.field23 + " " + class2.method22(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field342; var9++) {
            if (field420[var9] == 23) {
                field281[var9] = class2.method22(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ac.cr(III)Ljava/lang/String;")
    public static final String method684(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method22(16711680);
        } else if (var2 < -6) {
            return class2.method22(16723968);
        } else if (var2 < -3) {
            return class2.method22(16740352);
        } else if (var2 < 0) {
            return class2.method22(16756736);
        } else if (var2 > 9) {
            return class2.method22(65280);
        } else if (var2 > 6) {
            return class2.method22(4259584);
        } else if (var2 > 3) {
            return class2.method22(8453888);
        } else if (var2 > 0) {
            return class2.method22(12648192);
        } else {
            return class2.method22(16776960);
        }
    }

    @ObfuscatedName("au.cq(IIIIIIIII)V")
    public static final void method720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method4(arg0)) {
            Statics.field2109 = null;
            method614(Statics.field2827[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2109 != null) {
                method614(Statics.field2109, -1412584499, arg1, arg2, arg3, arg4, Statics.field673, Statics.field137, arg7);
                Statics.field2109 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field480[var8] = true;
            }
        } else {
            field480[arg7] = true;
        }
    }

    @ObfuscatedName("p.cl([Lfo;IIIIIIIII)V")
    public static final void method614(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1655(arg2, arg3, arg4, arg5);
        class91.method1954();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2802 == arg1 || arg1 == -1412584499 && field528 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field483[field478] = var10.field2754 + arg6;
                    field322[field478] = var10.field2755 + arg7;
                    field485[field478] = var10.field2855;
                    field495[field478] = var10.field2740;
                    var11 = ++field478 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2793 = var11;
                var10.field2871 = field285;
                if (!var10.field2844 || !method546(var10)) {
                    if (var10.field2834 > 0) {
                        Statics.method699(var10);
                    }
                    int var12 = var10.field2754 + arg6;
                    int var13 = var10.field2755 + arg7;
                    int var14 = var10.field2771;
                    if (field528 == var10) {
                        if (arg1 != -1412584499 && !var10.field2817) {
                            Statics.field2109 = arg0;
                            Statics.field673 = arg6;
                            Statics.field137 = arg7;
                            continue;
                        }
                        if (field459 && field453) {
                            int var15 = class140.field2116;
                            int var16 = class140.field2120;
                            int var17 = var15 - field450;
                            int var18 = var16 - field451;
                            if (var17 < field484) {
                                var17 = field484;
                            }
                            if (var10.field2855 + var17 > field484 + field449.field2855) {
                                var17 = field484 + field449.field2855 - var10.field2855;
                            }
                            if (var18 < field455) {
                                var18 = field455;
                            }
                            if (var10.field2740 + var18 > field455 + field449.field2740) {
                                var18 = field455 + field449.field2740 - var10.field2740;
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
                    if (var10.field2770 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2770 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2855 + var12;
                        int var26 = var10.field2740 + var13;
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
                        int var29 = var10.field2855 + var12;
                        int var30 = var10.field2740 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2844 || var19 < var21 && var20 < var22) {
                        if (var10.field2834 != 0) {
                            if (var10.field2834 == 1336) {
                                if (field291) {
                                    var13 += 15;
                                    Statics.field766.method3803("Fps:" + field2175, var10.field2855 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field278) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field278) {
                                        var33 = 16711680;
                                    }
                                    Statics.field766.method3803("Mem:" + var32 + "k", var10.field2855 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2834 == 1337) {
                                field318 = var12;
                                field513 = var13;
                                method881(var12, var13, var10.field2855, var10.field2740);
                                field480[var10.field2793] = true;
                                class80.method1655(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2834 == 1338) {
                                method116(var10, var12, var13, var11);
                                class80.method1655(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2834 == 1339) {
                                method2754(var10, var12, var13, var11);
                                class80.method1655(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2770 == 0) {
                            if (!var10.field2844 && method546(var10) && Statics.field1841 != var10) {
                                continue;
                            }
                            if (!var10.field2844) {
                                if (var10.field2763 > var10.field2750 - var10.field2740) {
                                    var10.field2763 = var10.field2750 - var10.field2740;
                                }
                                if (var10.field2763 < 0) {
                                    var10.field2763 = 0;
                                }
                            }
                            method614(arg0, var10.field2822, var19, var20, var21, var22, var12 - var10.field2826, var13 - var10.field2763, var11);
                            if (var10.field2811 != null) {
                                method614(var10.field2811, var10.field2822, var19, var20, var21, var22, var12 - var10.field2826, var13 - var10.field2763, var11);
                            }
                            class4 var34 = (class4) field421.method3521((long) var10.field2822);
                            if (var34 != null) {
                                method720(var34.field67, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1655(arg2, arg3, arg4, arg5);
                            class91.method1954();
                        }
                        if (field489 || field482[var11] || field370 > 1) {
                            if (var10.field2770 == 0 && !var10.field2844 && var10.field2750 > var10.field2740) {
                                method3162(var10.field2855 + var12, var13, var10.field2763, var10.field2740, var10.field2750);
                            }
                            if (var10.field2770 != 1) {
                                if (var10.field2770 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2753; var36++) {
                                        for (int var37 = 0; var37 < var10.field2752; var37++) {
                                            int var38 = (var10.field2805 + 32) * var37 + var12;
                                            int var39 = (var10.field2841 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2738[var35];
                                                var39 += var10.field2808[var35];
                                            }
                                            if (var10.field2857[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2857[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field1096 == var10 && field391 == var35) {
                                                    class79 var43;
                                                    if (field428 == 1 && Statics.field1505 == var35 && Statics.field2178 == var10.field2822) {
                                                        var43 = class52.method563(var42, var10.field2858[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class52.method563(var42, var10.field2858[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method643(var10);
                                                    } else if (Statics.field1096 == var10 && field391 == var35) {
                                                        int var44 = class140.field2116 - field510;
                                                        int var45 = class140.field2120 - field373;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field365 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method1580(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class173 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class80.field1396 && var46.field2763 > 0) {
                                                                int var47 = field397 * (class80.field1396 - var39 - var45) / 3;
                                                                if (var47 > field397 * 10) {
                                                                    var47 = field397 * 10;
                                                                }
                                                                if (var47 > var46.field2763) {
                                                                    var47 = var46.field2763;
                                                                }
                                                                var46.field2763 -= var47;
                                                                field373 += var47;
                                                                method643(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class80.field1400 && var46.field2763 < var46.field2750 - var46.field2740) {
                                                                int var48 = field397 * (var39 + var45 + 32 - class80.field1400) / 3;
                                                                if (var48 > field397 * 10) {
                                                                    var48 = field397 * 10;
                                                                }
                                                                if (var48 > var46.field2750 - var46.field2740 - var46.field2763) {
                                                                    var48 = var46.field2750 - var46.field2740 - var46.field2763;
                                                                }
                                                                var46.field2763 += var48;
                                                                field373 -= var48;
                                                                method643(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field230 == var10 && field390 == var35) {
                                                        var43.method1580(var38, var39, 128);
                                                    } else {
                                                        var43.method1574(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2809 != null && var35 < 20) {
                                                class79 var49 = var10.method3145(var35);
                                                if (var49 != null) {
                                                    var49.method1574(var38, var39);
                                                } else if (class173.field2739) {
                                                    method643(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2770 == 3) {
                                    int var50;
                                    if (method1982(var10)) {
                                        var50 = var10.field2820;
                                        if (Statics.field1841 == var10 && var10.field2769 != 0) {
                                            var50 = var10.field2769;
                                        }
                                    } else {
                                        var50 = var10.field2766;
                                        if (Statics.field1841 == var10 && var10.field2768 != 0) {
                                            var50 = var10.field2768;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2760) {
                                            class80.method1661(var12, var13, var10.field2855, var10.field2740, var50);
                                        } else {
                                            class80.method1683(var12, var13, var10.field2855, var10.field2740, var50);
                                        }
                                    } else if (var10.field2760) {
                                        class80.method1704(var12, var13, var10.field2855, var10.field2740, var50, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1666(var12, var13, var10.field2855, var10.field2740, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2770 == 4) {
                                    class224 var51 = var10.method3160();
                                    if (var51 != null) {
                                        String var52 = var10.field2799;
                                        int var53;
                                        if (method1982(var10)) {
                                            var53 = var10.field2820;
                                            if (Statics.field1841 == var10 && var10.field2769 != 0) {
                                                var53 = var10.field2769;
                                            }
                                            if (var10.field2862.length() > 0) {
                                                var52 = var10.field2862;
                                            }
                                        } else {
                                            var53 = var10.field2766;
                                            if (Statics.field1841 == var10 && var10.field2768 != 0) {
                                                var53 = var10.field2768;
                                            }
                                        }
                                        if (var10.field2844 && var10.field2859 != -1) {
                                            class52 var54 = class52.method971(var10.field2859);
                                            var52 = var54.field1145;
                                            if (var52 == null) {
                                                var52 = "null";
                                            }
                                            if ((var54.field1121 == 1 || var10.field2860 != 1) && var10.field2860 != -1) {
                                                var52 = class2.method22(16748608) + var52 + class2.field27 + " " + 'x' + method904(var10.field2860);
                                            }
                                        }
                                        if (field439 == var10) {
                                            class157 var10000 = (class157) null;
                                            var52 = class157.field2287;
                                            var53 = var10.field2766;
                                        }
                                        if (!var10.field2844) {
                                            var52 = method1894(var52, var10);
                                        }
                                        var51.method3799(var52, var12, var13, var10.field2855, var10.field2740, var53, var10.field2804 ? 0 : -1, var10.field2868, var10.field2803, var10.field2801);
                                    } else if (class173.field2739) {
                                        method643(var10);
                                    }
                                } else if (var10.field2770 == 5) {
                                    if (var10.field2844) {
                                        class79 var56;
                                        if (var10.field2859 == -1) {
                                            var56 = var10.method3143(false);
                                        } else {
                                            var56 = class52.method563(var10.field2859, var10.field2860, var10.field2778, var10.field2779, var10.field2797, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field1391;
                                            int var58 = var56.field1390;
                                            if (var10.field2772) {
                                                class80.method1656(var12, var13, var10.field2855 + var12, var10.field2740 + var13);
                                                int var59 = (var10.field2855 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2740 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2776 != 0) {
                                                            var56.method1587(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2776, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method1574(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method1580(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1655(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2855 * 4096 / var57;
                                                if (var10.field2776 != 0) {
                                                    var56.method1587(var10.field2855 / 2 + var12, var10.field2740 / 2 + var13, var10.field2776, var63);
                                                } else if (var14 != 0) {
                                                    var56.method1582(var12, var13, var10.field2855, var10.field2740, 256 - (var14 & 0xFF));
                                                } else if (var10.field2855 == var57 && var10.field2740 == var58) {
                                                    var56.method1574(var12, var13);
                                                } else {
                                                    var56.method1637(var12, var13, var10.field2855, var10.field2740);
                                                }
                                            }
                                        } else if (class173.field2739) {
                                            method643(var10);
                                        }
                                    } else {
                                        class79 var55 = var10.method3143(method1982(var10));
                                        if (var55 != null) {
                                            var55.method1574(var12, var13);
                                        } else if (class173.field2739) {
                                            method643(var10);
                                        }
                                    }
                                } else if (var10.field2770 == 6) {
                                    boolean var64 = method1982(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2787;
                                    } else {
                                        var65 = var10.field2786;
                                    }
                                    class105 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2859 != -1) {
                                        class52 var68 = class52.method971(var10.field2859);
                                        if (var68 != null) {
                                            class52 var69 = var68.method1033(var10.field2860);
                                            var66 = var69.method992(1);
                                            if (var66 == null) {
                                                method643(var10);
                                            } else {
                                                var66.method2095();
                                                var67 = var66.field1437 / 2;
                                            }
                                        }
                                    } else if (var10.field2821 == 5) {
                                        if (var10.field2835 == 0) {
                                            var66 = field402.method3245((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var66 = Statics.field2644.method13();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3146((class43) null, -1, var64, Statics.field2644.field43);
                                        if (var66 == null && class173.field2739) {
                                            method643(var10);
                                        }
                                    } else {
                                        class43 var70 = class43.method2648(var65);
                                        var66 = var10.method3146(var70, var10.field2861, var64, Statics.field2644.field43);
                                        if (var66 == null && class173.field2739) {
                                            method643(var10);
                                        }
                                    }
                                    class91.method1903(var10.field2855 / 2 + var12, var10.field2740 / 2 + var13);
                                    int var71 = var10.field2790 * class91.field1566[var10.field2840] >> 16;
                                    int var72 = var10.field2790 * class91.field1567[var10.field2840] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2844) {
                                            var66.method2095();
                                            if (var10.field2796) {
                                                var66.method2145(0, var10.field2791, var10.field2792, var10.field2840, var10.field2788, var10.field2789 + var67 + var71, var10.field2789 + var72, var10.field2790);
                                            } else {
                                                var66.method2107(0, var10.field2791, var10.field2792, var10.field2840, var10.field2788, var10.field2789 + var67 + var71, var10.field2789 + var72);
                                            }
                                        } else {
                                            var66.method2107(0, var10.field2791, 0, var10.field2840, 0, var71, var72);
                                        }
                                    }
                                    class91.method1902();
                                } else {
                                    if (var10.field2770 == 7) {
                                        class224 var73 = var10.method3160();
                                        if (var73 == null) {
                                            if (class173.field2739) {
                                                method643(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2753; var75++) {
                                            for (int var76 = 0; var76 < var10.field2752; var76++) {
                                                if (var10.field2857[var74] > 0) {
                                                    class52 var77 = class52.method971(var10.field2857[var74] - 1);
                                                    String var78;
                                                    if (var77.field1121 != 1 && var10.field2858[var74] == 1) {
                                                        var78 = class2.method22(16748608) + var77.field1145 + class2.field27;
                                                    } else {
                                                        var78 = class2.method22(16748608) + var77.field1145 + class2.field27 + " " + 'x' + method904(var10.field2858[var74]);
                                                    }
                                                    int var79 = (var10.field2805 + 115) * var76 + var12;
                                                    int var80 = (var10.field2841 + 12) * var75 + var13;
                                                    if (var10.field2868 == 0) {
                                                        var73.method3737(var78, var79, var80, var10.field2766, var10.field2804 ? 0 : -1);
                                                    } else if (var10.field2868 == 1) {
                                                        var73.method3739(var78, var10.field2855 / 2 + var79, var80, var10.field2766, var10.field2804 ? 0 : -1);
                                                    } else {
                                                        var73.method3803(var78, var10.field2855 + var79 - 1, var80, var10.field2766, var10.field2804 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2770 == 8 && Statics.field165 == var10 && field426 == field348) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class224 var83 = Statics.field766;
                                        String var84 = var10.field2799;
                                        String var85 = method1894(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class2.field18);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method3732(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3165 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2855 + var12 - 5 - var81;
                                        int var90 = var10.field2740 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class80.method1661(var89, var90, var81, var82, 16777120);
                                        class80.method1683(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2799;
                                        int var92 = var83.field3165 + var90 + 2;
                                        String var93 = method1894(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class2.field18);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method3737(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3165 + 1;
                                        }
                                    }
                                    if (var10.field2770 == 9) {
                                        if (var10.field2849 == 1) {
                                            int var96;
                                            int var97;
                                            int var98;
                                            int var99;
                                            if (var10.field2737) {
                                                var96 = var12;
                                                var97 = var10.field2740 + var13;
                                                var98 = var10.field2855 + var12;
                                                var99 = var13;
                                            } else {
                                                var96 = var12;
                                                var97 = var13;
                                                var98 = var10.field2855 + var12;
                                                var99 = var10.field2740 + var13;
                                            }
                                            class80.method1667(var96, var97, var98, var99, var10.field2766);
                                        } else {
                                            int var100 = var10.field2855 >= 0 ? var10.field2855 : -var10.field2855;
                                            int var101 = var10.field2740 >= 0 ? var10.field2740 : -var10.field2740;
                                            int var102 = var100;
                                            if (var100 < var101) {
                                                var102 = var101;
                                            }
                                            if (var102 != 0) {
                                                int var103 = (var10.field2855 << 16) / var102;
                                                int var104 = (var10.field2740 << 16) / var102;
                                                if (var104 <= var103) {
                                                    var103 = -var103;
                                                } else {
                                                    var104 = -var104;
                                                }
                                                int var105 = var10.field2849 * var104 >> 17;
                                                int var106 = var10.field2849 * var104 + 1 >> 17;
                                                int var107 = var10.field2849 * var103 >> 17;
                                                int var108 = var10.field2849 * var103 + 1 >> 17;
                                                int var109 = var12 + var105;
                                                int var110 = var12 - var106;
                                                int var111 = var10.field2855 + var12 - var106;
                                                int var112 = var10.field2855 + var12 + var105;
                                                int var113 = var13 + var107;
                                                int var114 = var13 - var108;
                                                int var115 = var10.field2740 + var13 - var108;
                                                int var116 = var10.field2740 + var13 + var107;
                                                class91.method1908(var109, var110, var111);
                                                class91.method1911(var113, var114, var115, var109, var110, var111, var10.field2766);
                                                class91.method1908(var109, var111, var112);
                                                class91.method1911(var113, var115, var116, var109, var111, var112, var10.field2766);
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

    @ObfuscatedName("cl.cs(Ljava/lang/String;Lfo;B)Ljava/lang/String;")
    public static String method1894(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2721(arg1, var2 - 1);
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
                if (Statics.field3139 != null) {
                    int var9 = Statics.field3139.field2185;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field3139.field2188 != null) {
                        var8 = (String) Statics.field3139.field2188;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ap.cg(II)Ljava/lang/String;")
    public static final String method904(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method22(65408) + var1.substring(0, var1.length() - 8) + class157.field2509 + " " + class2.field21 + var1 + class2.field22 + class2.field27;
        } else if (var1.length() > 6) {
            return " " + class2.method22(16777215) + var1.substring(0, var1.length() - 4) + class157.field2449 + " " + class2.field21 + var1 + class2.field22 + class2.field27;
        } else {
            return " " + class2.method22(16776960) + var1 + class2.field27;
        }
    }

    @ObfuscatedName("an.ci(Lfo;I)V")
    public static void method984(class173 arg0) {
        class173 var1 = arg0.field2802 == -1 ? null : class173.method708(arg0.field2802);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1604;
            var3 = Statics.field776;
        } else {
            var2 = var1.field2855;
            var3 = var1.field2740;
        }
        method926(arg0, var2, var3, false);
        method108(arg0, var2, var3);
    }

    @ObfuscatedName("dk.cu([Lfo;Lfo;ZI)V")
    public static void method2567(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2764 == 0 ? arg1.field2855 : arg1.field2764;
        int var4 = arg1.field2750 == 0 ? arg1.field2740 : arg1.field2750;
        method173(arg0, arg1.field2822, var3, var4, arg2);
        if (arg1.field2811 != null) {
            method173(arg1.field2811, arg1.field2822, var3, var4, arg2);
        }
        class4 var5 = (class4) field421.method3521((long) arg1.field2822);
        if (var5 != null) {
            int var6 = var5.field67;
            if (class173.method4(var6)) {
                method173(Statics.field2827[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2834 == 1337) {
        }
    }

    @ObfuscatedName("e.cb([Lfo;IIIZB)V")
    public static void method173(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2802 == arg1) {
                method926(var6, arg2, arg3, arg4);
                method108(var6, arg2, arg3);
                if (var6.field2826 > var6.field2764 - var6.field2855) {
                    var6.field2826 = var6.field2764 - var6.field2855;
                }
                if (var6.field2826 < 0) {
                    var6.field2826 = 0;
                }
                if (var6.field2763 > var6.field2750 - var6.field2740) {
                    var6.field2763 = var6.field2750 - var6.field2740;
                }
                if (var6.field2763 < 0) {
                    var6.field2763 = 0;
                }
                if (var6.field2770 == 0) {
                    method2567(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ab.cz(Lfo;IIZB)V")
    public static void method926(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2855;
        int var5 = arg0.field2740;
        if (arg0.field2748 == 0) {
            arg0.field2855 = arg0.field2752;
        } else if (arg0.field2748 == 1) {
            arg0.field2855 = arg1 - arg0.field2752;
        } else if (arg0.field2748 == 2) {
            arg0.field2855 = arg0.field2752 * arg1 >> 14;
        }
        if (arg0.field2749 == 0) {
            arg0.field2740 = arg0.field2753;
        } else if (arg0.field2749 == 1) {
            arg0.field2740 = arg2 - arg0.field2753;
        } else if (arg0.field2749 == 2) {
            arg0.field2740 = arg0.field2753 * arg2 >> 14;
        }
        if (arg0.field2748 == 4) {
            arg0.field2855 = arg0.field2758 * arg0.field2740 / arg0.field2759;
        }
        if (arg0.field2749 == 4) {
            arg0.field2740 = arg0.field2855 * arg0.field2759 / arg0.field2758;
        }
        if (field410 && arg0.field2770 == 0) {
            if (arg0.field2740 < 5 && arg0.field2855 < 5) {
                arg0.field2740 = 5;
                arg0.field2855 = 5;
            } else {
                if (arg0.field2740 <= 0) {
                    arg0.field2740 = 5;
                }
                if (arg0.field2855 <= 0) {
                    arg0.field2855 = 5;
                }
            }
        }
        if (arg0.field2834 == 1337) {
            field447 = arg0;
        }
        if (arg3 && arg0.field2848 != null && (arg0.field2855 != var4 || arg0.field2740 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field17 = arg0.field2848;
            field458.method3585(var6);
        }
    }

    @ObfuscatedName("w.cc(Lfo;III)V")
    public static void method108(class173 arg0, int arg1, int arg2) {
        if (arg0.field2746 == 0) {
            arg0.field2754 = arg0.field2853;
        } else if (arg0.field2746 == 1) {
            arg0.field2754 = (arg1 - arg0.field2855) / 2 + arg0.field2853;
        } else if (arg0.field2746 == 2) {
            arg0.field2754 = arg1 - arg0.field2855 - arg0.field2853;
        } else if (arg0.field2746 == 3) {
            arg0.field2754 = arg0.field2853 * arg1 >> 14;
        } else if (arg0.field2746 == 4) {
            arg0.field2754 = (arg0.field2853 * arg1 >> 14) + (arg1 - arg0.field2855) / 2;
        } else {
            arg0.field2754 = arg1 - arg0.field2855 - (arg0.field2853 * arg1 >> 14);
        }
        if (arg0.field2747 == 0) {
            arg0.field2755 = arg0.field2806;
        } else if (arg0.field2747 == 1) {
            arg0.field2755 = (arg2 - arg0.field2740) / 2 + arg0.field2806;
        } else if (arg0.field2747 == 2) {
            arg0.field2755 = arg2 - arg0.field2740 - arg0.field2806;
        } else if (arg0.field2747 == 3) {
            arg0.field2755 = arg0.field2806 * arg2 >> 14;
        } else if (arg0.field2747 == 4) {
            arg0.field2755 = (arg0.field2806 * arg2 >> 14) + (arg2 - arg0.field2740) / 2;
        } else {
            arg0.field2755 = arg2 - arg0.field2740 - (arg0.field2806 * arg2 >> 14);
        }
        if (!field410 || arg0.field2770 != 0) {
            return;
        }
        if (arg0.field2754 < 0) {
            arg0.field2754 = 0;
        } else if (arg0.field2855 + arg0.field2754 > arg1) {
            arg0.field2754 = arg1 - arg0.field2855;
        }
        if (arg0.field2755 < 0) {
            arg0.field2755 = 0;
        } else if (arg0.field2755 + arg0.field2740 > arg2) {
            arg0.field2755 = arg2 - arg0.field2740;
        }
    }

    @ObfuscatedName("fo.cx(IIIIIB)V")
    public static final void method3162(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2024[0].method1706(arg0, arg1);
        Statics.field2024[1].method1706(arg0, arg1 + arg3 - 16);
        class80.method1661(arg0, arg1 + 16, 16, arg3 - 32, field355);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1661(arg0, arg1 + 16 + var6, 16, var5, field356);
        class80.method1674(arg0, arg1 + 16 + var6, var5, field358);
        class80.method1674(arg0 + 1, arg1 + 16 + var6, var5, field358);
        class80.method1664(arg0, arg1 + 16 + var6, 16, field358);
        class80.method1664(arg0, arg1 + 17 + var6, 16, field358);
        class80.method1674(arg0 + 15, arg1 + 16 + var6, var5, field357);
        class80.method1674(arg0 + 14, arg1 + 17 + var6, var5 - 1, field357);
        class80.method1664(arg0, arg1 + 15 + var6 + var5, 16, field357);
        class80.method1664(arg0 + 1, arg1 + 14 + var6 + var5, 15, field357);
    }

    @ObfuscatedName("cb.cv(Lfo;B)Z")
    public static final boolean method1982(class173 arg0) {
        if (arg0.field2852 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2852.length; var1++) {
            int var2 = method2721(arg0, var1);
            int var3 = arg0.field2832[var1];
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

    @ObfuscatedName("ey.cw(Lfo;II)I")
    public static final int method2721(class173 arg0, int arg1) {
        if (arg0.field2851 == null || arg1 >= arg0.field2851.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2851[arg1];
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
                    var7 = field414[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method708(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method971(var12).field1130 || field454)) {
                        for (int var13 = 0; var13 < var11.field2857.length; var13++) {
                            if (var12 + 1 == var11.field2857[var13]) {
                                var7 += var11.field2858[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2887[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2266[field413[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2887[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2644.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2269[var14]) {
                            var7 += field413[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method708(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method971(var18).field1130 || field454)) {
                        for (int var19 = 0; var19 < var17.field2857.length; var19++) {
                            if (var18 + 1 == var17.field2857[var19]) {
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
                    var7 = field441;
                }
                if (var6 == 13) {
                    int var20 = class176.field2887[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method43(var22);
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
                    var7 = (Statics.field2644.field859 >> 7) + Statics.field14;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2644.field839 >> 7) + Statics.field1436;
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

    @ObfuscatedName("eu.ch(IIIIIIIS)V")
    public static final void method2891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class173.method4(arg0)) {
            method1036(Statics.field2827[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ah.ct([Lfo;IIIIIIIB)V")
    public static final void method1036(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2844 || var9.field2770 == 0 || var9.field2819 || method1035(var9) != 0 || field449 == var9 || var9.field2834 == 1338) && var9.field2802 == arg1 && (!var9.field2844 || !method546(var9))) {
                int var10 = var9.field2754 + arg6;
                int var11 = var9.field2755 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2770 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2770 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2855 + var10;
                    int var19 = var9.field2740 + var11;
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
                    int var22 = var9.field2855 + var10;
                    int var23 = var9.field2740 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field528 == var9) {
                    field456 = true;
                    field457 = var10;
                    field415 = var11;
                }
                if (!var9.field2844 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2116;
                    int var25 = class140.field2120;
                    if (class140.field2122 != 0) {
                        var24 = class140.field2123;
                        var25 = class140.field2117;
                    }
                    if (var9.field2834 == 1337) {
                        if (!field525 && !field416 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field428 == 0 && !field430) {
                                method718(class157.field2442, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1827; var28++) {
                                int var29 = class105.field1828[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field1976.method1754(Statics.field2983, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method2760(var33);
                                        if (var34.field953 != null) {
                                            var34 = var34.method783();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field428 == 1) {
                                            method718(class157.field2436, field429 + " " + class2.field23 + " " + class2.method22(65535) + var34.field933, 1, var29, var30, var31);
                                        } else if (!field430) {
                                            String[] var35 = var34.field950;
                                            if (field507) {
                                                var35 = method906(var35);
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
                                                        method718(var35[var36], class2.method22(65535) + var34.field933, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method718(class157.field2353, class2.method22(65535) + var34.field933, 1002, var34.field928 << 14, var30, var31);
                                        } else if ((Statics.field2616 & 0x4) == 4) {
                                            method718(field433, field434 + " " + class2.field23 + " " + class2.method22(65535) + var34.field933, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field312[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field781.field890 == 1 && (var38.field859 & 0x7F) == 64 && (var38.field839 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field313; var39++) {
                                                class35 var40 = field312[field314[var39]];
                                                if (var40 != null && var38 != var40 && var40.field781.field890 == 1 && var38.field859 == var40.field859 && var38.field839 == var40.field839) {
                                                    method553(var40.field781, field314[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field754;
                                            int[] var42 = class33.field757;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field404[var42[var43]];
                                                if (var44 != null && var38.field859 == var44.field859 && var38.field839 == var44.field839) {
                                                    method1047(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method553(var38.field781, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field404[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field859 & 0x7F) == 64 && (var45.field839 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field313; var46++) {
                                                class35 var47 = field312[field314[var46]];
                                                if (var47 != null && var47.field781.field890 == 1 && var45.field859 == var47.field859 && var45.field839 == var47.field839) {
                                                    method553(var47.field781, field314[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field754;
                                            int[] var49 = class33.field757;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field404[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field859 == var51.field859 && var45.field839 == var51.field839) {
                                                    method1047(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field548 == var33) {
                                            var26 = var29;
                                        } else {
                                            method1047(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field408[Statics.field2983][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3559(); var53 != null; var53 = (class29) var52.method3561()) {
                                                class52 var54 = class52.method971(var53.field679);
                                                if (field428 == 1) {
                                                    method718(class157.field2436, field429 + " " + class2.field23 + " " + class2.method22(16748608) + var54.field1145, 16, var53.field679, var30, var31);
                                                } else if (!field430) {
                                                    String[] var55 = var54.field1124;
                                                    if (field507) {
                                                        var55 = method906(var55);
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
                                                            method718(var55[var56], class2.method22(16748608) + var54.field1145, var57, var53.field679, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method718(class157.field2286, class2.method22(16748608) + var54.field1145, 20, var53.field679, var30, var31);
                                                        }
                                                    }
                                                    method718(class157.field2353, class2.method22(16748608) + var54.field1145, 1004, var53.field679, var30, var31);
                                                } else if ((Statics.field2616 & 0x1) == 1) {
                                                    method718(field433, field434 + " " + class2.field23 + " " + class2.method22(16748608) + var54.field1145, 17, var53.field679, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field404[field548];
                                method1047(var60, field548, var58, var59);
                            }
                        }
                    } else if (var9.field2834 != 1338) {
                        if (!field416 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2744 == 1) {
                                method718(var9.field2856, "", 24, 0, 0, var9.field2822);
                            }
                            if (var9.field2744 == 2 && !field430) {
                                String var77;
                                if (class178.method2575(method1035(var9)) == 0) {
                                    var77 = null;
                                } else if (var9.field2818 == null || var9.field2818.trim().length() == 0) {
                                    var77 = null;
                                } else {
                                    var77 = var9.field2818;
                                }
                                if (var77 != null) {
                                    method718(var77, class2.method22(65280) + var9.field2867, 25, 0, -1, var9.field2822);
                                }
                            }
                            if (var9.field2744 == 3) {
                                method718(class157.field2460, "", 26, 0, 0, var9.field2822);
                            }
                            if (var9.field2744 == 4) {
                                method718(var9.field2856, "", 28, 0, 0, var9.field2822);
                            }
                            if (var9.field2744 == 5) {
                                method718(var9.field2856, "", 29, 0, 0, var9.field2822);
                            }
                            if (var9.field2744 == 6 && field439 == null) {
                                method718(var9.field2856, "", 30, 0, -1, var9.field2822);
                            }
                            if (var9.field2770 == 2) {
                                int var79 = 0;
                                for (int var80 = 0; var80 < var9.field2740; var80++) {
                                    for (int var81 = 0; var81 < var9.field2855; var81++) {
                                        int var82 = (var9.field2805 + 32) * var81;
                                        int var83 = (var9.field2841 + 32) * var80;
                                        if (var79 < 20) {
                                            var82 += var9.field2738[var79];
                                            var83 += var9.field2808[var79];
                                        }
                                        if (var75 >= var82 && var76 >= var83 && var75 < var82 + 32 && var76 < var83 + 32) {
                                            field394 = var79;
                                            Statics.field62 = var9;
                                            if (var9.field2857[var79] > 0) {
                                                class52 var84 = class52.method971(var9.field2857[var79] - 1);
                                                if (field428 == 1 && class178.method944(method1035(var9))) {
                                                    if (Statics.field2178 != var9.field2822 || Statics.field1505 != var79) {
                                                        method718(class157.field2436, field429 + " " + class2.field23 + " " + class2.method22(16748608) + var84.field1145, 31, var84.field1151, var79, var9.field2822);
                                                    }
                                                } else if (!field430 || !class178.method944(method1035(var9))) {
                                                    String[] var85 = var84.field1128;
                                                    if (field507) {
                                                        var85 = method906(var85);
                                                    }
                                                    if (class178.method944(method1035(var9))) {
                                                        for (int var86 = 4; var86 >= 3; var86--) {
                                                            if (var85 != null && var85[var86] != null) {
                                                                byte var87;
                                                                if (var86 == 3) {
                                                                    var87 = 36;
                                                                } else {
                                                                    var87 = 37;
                                                                }
                                                                method718(var85[var86], class2.method22(16748608) + var84.field1145, var87, var84.field1151, var79, var9.field2822);
                                                            } else if (var86 == 4) {
                                                                method718(class157.field2361, class2.method22(16748608) + var84.field1145, 37, var84.field1151, var79, var9.field2822);
                                                            }
                                                        }
                                                    }
                                                    if (class178.method2210(method1035(var9))) {
                                                        method718(class157.field2436, class2.method22(16748608) + var84.field1145, 38, var84.field1151, var79, var9.field2822);
                                                    }
                                                    if (class178.method944(method1035(var9)) && var85 != null) {
                                                        for (int var88 = 2; var88 >= 0; var88--) {
                                                            if (var85[var88] != null) {
                                                                byte var89 = 0;
                                                                if (var88 == 0) {
                                                                    var89 = 33;
                                                                }
                                                                if (var88 == 1) {
                                                                    var89 = 34;
                                                                }
                                                                if (var88 == 2) {
                                                                    var89 = 35;
                                                                }
                                                                method718(var85[var88], class2.method22(16748608) + var84.field1145, var89, var84.field1151, var79, var9.field2822);
                                                            }
                                                        }
                                                    }
                                                    String[] var90 = var9.field2810;
                                                    if (field507) {
                                                        var90 = method906(var90);
                                                    }
                                                    if (var90 != null) {
                                                        for (int var91 = 4; var91 >= 0; var91--) {
                                                            if (var90[var91] != null) {
                                                                byte var92 = 0;
                                                                if (var91 == 0) {
                                                                    var92 = 39;
                                                                }
                                                                if (var91 == 1) {
                                                                    var92 = 40;
                                                                }
                                                                if (var91 == 2) {
                                                                    var92 = 41;
                                                                }
                                                                if (var91 == 3) {
                                                                    var92 = 42;
                                                                }
                                                                if (var91 == 4) {
                                                                    var92 = 43;
                                                                }
                                                                method718(var90[var91], class2.method22(16748608) + var84.field1145, var92, var84.field1151, var79, var9.field2822);
                                                            }
                                                        }
                                                    }
                                                    method718(class157.field2353, class2.method22(16748608) + var84.field1145, 1005, var84.field1151, var79, var9.field2822);
                                                } else if ((Statics.field2616 & 0x10) == 16) {
                                                    method718(field433, field434 + " " + class2.field23 + " " + class2.method22(16748608) + var84.field1145, 32, var84.field1151, var79, var9.field2822);
                                                }
                                            }
                                        }
                                        var79++;
                                    }
                                }
                            }
                            if (var9.field2844) {
                                if (!field430) {
                                    for (int var93 = 9; var93 >= 5; var93--) {
                                        String var94 = method620(var9, var93);
                                        if (var94 != null) {
                                            method718(var94, var9.field2812, 1007, var93 + 1, var9.field2742, var9.field2822);
                                        }
                                    }
                                    String var95;
                                    if (class178.method2575(method1035(var9)) == 0) {
                                        var95 = null;
                                    } else if (var9.field2818 == null || var9.field2818.trim().length() == 0) {
                                        var95 = null;
                                    } else {
                                        var95 = var9.field2818;
                                    }
                                    if (var95 != null) {
                                        method718(var95, var9.field2812, 25, 0, var9.field2742, var9.field2822);
                                    }
                                    for (int var97 = 4; var97 >= 0; var97--) {
                                        String var98 = method620(var9, var97);
                                        if (var98 != null) {
                                            method718(var98, var9.field2812, 57, var97 + 1, var9.field2742, var9.field2822);
                                        }
                                    }
                                    if (class178.method1980(method1035(var9))) {
                                        method718(class157.field2291, "", 30, 0, var9.field2742, var9.field2822);
                                    }
                                } else if (class178.method717(method1035(var9)) && (Statics.field2616 & 0x20) == 32) {
                                    method718(field433, field434 + " " + class2.field23 + " " + var9.field2812, 58, 0, var9.field2742, var9.field2822);
                                }
                            }
                        }
                        if (var9.field2770 == 0) {
                            if (!var9.field2844 && method546(var9) && Statics.field1841 != var9) {
                                continue;
                            }
                            method1036(arg0, var9.field2822, var12, var13, var14, var15, var10 - var9.field2826, var11 - var9.field2763);
                            if (var9.field2811 != null) {
                                method1036(var9.field2811, var9.field2822, var12, var13, var14, var15, var10 - var9.field2826, var11 - var9.field2763);
                            }
                            class4 var99 = (class4) field421.method3521((long) var9.field2822);
                            if (var99 != null) {
                                if (var99.field59 == 0 && class140.field2116 >= var12 && class140.field2120 >= var13 && class140.field2116 < var14 && class140.field2120 < var15 && !field416 && !field410) {
                                    for (class1 var100 = (class1) field458.method3558(); var100 != null; var100 = (class1) field458.method3554()) {
                                        if (var100.field10) {
                                            var100.method3646();
                                            var100.field3.field2864 = false;
                                        }
                                    }
                                    if (Statics.field920 == 0) {
                                        field528 = null;
                                        field449 = null;
                                    }
                                    if (!field416) {
                                        field396[0] = class157.field2522;
                                        field281[0] = "";
                                        field420[0] = 1006;
                                        field342 = 1;
                                    }
                                }
                                method2891(var99.field67, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2844) {
                            if (var9.field2872) {
                                if (class140.field2116 >= var12 && class140.field2120 >= var13 && class140.field2116 < var14 && class140.field2120 < var15) {
                                    for (class1 var101 = (class1) field458.method3558(); var101 != null; var101 = (class1) field458.method3554()) {
                                        if (var101.field10) {
                                            var101.method3646();
                                            var101.field3.field2864 = false;
                                        }
                                    }
                                    if (Statics.field920 == 0) {
                                        field528 = null;
                                        field449 = null;
                                    }
                                    if (!field416) {
                                        field396[0] = class157.field2522;
                                        field281[0] = "";
                                        field420[0] = 1006;
                                        field342 = 1;
                                    }
                                }
                            } else if (var9.field2873 && class140.field2116 >= var12 && class140.field2120 >= var13 && class140.field2116 < var14 && class140.field2120 < var15) {
                                for (class1 var102 = (class1) field458.method3558(); var102 != null; var102 = (class1) field458.method3554()) {
                                    if (var102.field10 && var102.field3.field2846 == var102.field17) {
                                        var102.method3646();
                                    }
                                }
                            }
                            boolean var103;
                            if (class140.field2116 >= var12 && class140.field2120 >= var13 && class140.field2116 < var14 && class140.field2120 < var15) {
                                var103 = true;
                            } else {
                                var103 = false;
                            }
                            boolean var104 = false;
                            if ((class140.field2115 == 1 || !Statics.field208 && class140.field2115 == 4) && var103) {
                                var104 = true;
                            }
                            boolean var105 = false;
                            if ((class140.field2122 == 1 || !Statics.field208 && class140.field2122 == 4) && class140.field2123 >= var12 && class140.field2117 >= var13 && class140.field2123 < var14 && class140.field2117 < var15) {
                                var105 = true;
                            }
                            if (var105) {
                                method154(var9, class140.field2123 - var10, class140.field2117 - var11);
                            }
                            if (field528 != null && field528 != var9 && var103 && class178.method571(method1035(var9))) {
                                field452 = var9;
                            }
                            if (field449 == var9) {
                                field453 = true;
                                field484 = var10;
                                field455 = var11;
                            }
                            if (var9.field2819) {
                                if (var103 && field473 != 0 && var9.field2846 != null) {
                                    class1 var106 = new class1();
                                    var106.field10 = true;
                                    var106.field3 = var9;
                                    var106.field5 = field473;
                                    var106.field17 = var9.field2846;
                                    field458.method3585(var106);
                                }
                                if (field528 != null || Statics.field1096 != null || field416) {
                                    var105 = false;
                                    var104 = false;
                                    var103 = false;
                                }
                                if (!var9.field2865 && var105) {
                                    var9.field2865 = true;
                                    if (var9.field2765 != null) {
                                        class1 var107 = new class1();
                                        var107.field10 = true;
                                        var107.field3 = var9;
                                        var107.field4 = class140.field2123 - var10;
                                        var107.field5 = class140.field2117 - var11;
                                        var107.field17 = var9.field2765;
                                        field458.method3585(var107);
                                    }
                                }
                                if (var9.field2865 && var104 && var9.field2833 != null) {
                                    class1 var108 = new class1();
                                    var108.field10 = true;
                                    var108.field3 = var9;
                                    var108.field4 = class140.field2116 - var10;
                                    var108.field5 = class140.field2120 - var11;
                                    var108.field17 = var9.field2833;
                                    field458.method3585(var108);
                                }
                                if (var9.field2865 && !var104) {
                                    var9.field2865 = false;
                                    if (var9.field2823 != null) {
                                        class1 var109 = new class1();
                                        var109.field10 = true;
                                        var109.field3 = var9;
                                        var109.field4 = class140.field2116 - var10;
                                        var109.field5 = class140.field2120 - var11;
                                        var109.field17 = var9.field2823;
                                        field476.method3585(var109);
                                    }
                                }
                                if (var104 && var9.field2824 != null) {
                                    class1 var110 = new class1();
                                    var110.field10 = true;
                                    var110.field3 = var9;
                                    var110.field4 = class140.field2116 - var10;
                                    var110.field5 = class140.field2120 - var11;
                                    var110.field17 = var9.field2824;
                                    field458.method3585(var110);
                                }
                                if (!var9.field2864 && var103) {
                                    var9.field2864 = true;
                                    if (var9.field2741 != null) {
                                        class1 var111 = new class1();
                                        var111.field10 = true;
                                        var111.field3 = var9;
                                        var111.field4 = class140.field2116 - var10;
                                        var111.field5 = class140.field2120 - var11;
                                        var111.field17 = var9.field2741;
                                        field458.method3585(var111);
                                    }
                                }
                                if (var9.field2864 && var103 && var9.field2842 != null) {
                                    class1 var112 = new class1();
                                    var112.field10 = true;
                                    var112.field3 = var9;
                                    var112.field4 = class140.field2116 - var10;
                                    var112.field5 = class140.field2120 - var11;
                                    var112.field17 = var9.field2842;
                                    field458.method3585(var112);
                                }
                                if (var9.field2864 && !var103) {
                                    var9.field2864 = false;
                                    if (var9.field2830 != null) {
                                        class1 var113 = new class1();
                                        var113.field10 = true;
                                        var113.field3 = var9;
                                        var113.field4 = class140.field2116 - var10;
                                        var113.field5 = class140.field2120 - var11;
                                        var113.field17 = var9.field2830;
                                        field476.method3585(var113);
                                    }
                                }
                                if (var9.field2838 != null) {
                                    class1 var114 = new class1();
                                    var114.field3 = var9;
                                    var114.field17 = var9.field2838;
                                    field475.method3585(var114);
                                }
                                if (var9.field2773 != null && field540 > var9.field2783) {
                                    if (var9.field2751 == null || field540 - var9.field2783 > 32) {
                                        class1 var119 = new class1();
                                        var119.field3 = var9;
                                        var119.field17 = var9.field2773;
                                        field458.method3585(var119);
                                    } else {
                                        label1006: for (int var115 = var9.field2783; var115 < field540; var115++) {
                                            int var116 = field461[var115 & 0x1F];
                                            for (int var117 = 0; var117 < var9.field2751.length; var117++) {
                                                if (var9.field2751[var117] == var116) {
                                                    class1 var118 = new class1();
                                                    var118.field3 = var9;
                                                    var118.field17 = var9.field2773;
                                                    field458.method3585(var118);
                                                    break label1006;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2783 = field540;
                                }
                                if (var9.field2816 != null && field382 > var9.field2743) {
                                    if (var9.field2782 == null || field382 - var9.field2743 > 32) {
                                        class1 var124 = new class1();
                                        var124.field3 = var9;
                                        var124.field17 = var9.field2816;
                                        field458.method3585(var124);
                                    } else {
                                        label982: for (int var120 = var9.field2743; var120 < field382; var120++) {
                                            int var121 = field463[var120 & 0x1F];
                                            for (int var122 = 0; var122 < var9.field2782.length; var122++) {
                                                if (var9.field2782[var122] == var121) {
                                                    class1 var123 = new class1();
                                                    var123.field3 = var9;
                                                    var123.field17 = var9.field2816;
                                                    field458.method3585(var123);
                                                    break label982;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2743 = field382;
                                }
                                if (var9.field2807 != null && field466 > var9.field2869) {
                                    if (var9.field2837 == null || field466 - var9.field2869 > 32) {
                                        class1 var129 = new class1();
                                        var129.field3 = var9;
                                        var129.field17 = var9.field2807;
                                        field458.method3585(var129);
                                    } else {
                                        label958: for (int var125 = var9.field2869; var125 < field466; var125++) {
                                            int var126 = field384[var125 & 0x1F];
                                            for (int var127 = 0; var127 < var9.field2837.length; var127++) {
                                                if (var9.field2837[var127] == var126) {
                                                    class1 var128 = new class1();
                                                    var128.field3 = var9;
                                                    var128.field17 = var9.field2807;
                                                    field458.method3585(var128);
                                                    break label958;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2869 = field466;
                                }
                                if (field467 > var9.field2866 && var9.field2863 != null) {
                                    class1 var130 = new class1();
                                    var130.field3 = var9;
                                    var130.field17 = var9.field2863;
                                    field458.method3585(var130);
                                }
                                if (field324 > var9.field2866 && var9.field2843 != null) {
                                    class1 var131 = new class1();
                                    var131.field3 = var9;
                                    var131.field17 = var9.field2843;
                                    field458.method3585(var131);
                                }
                                if (field469 > var9.field2866 && var9.field2785 != null) {
                                    class1 var132 = new class1();
                                    var132.field3 = var9;
                                    var132.field17 = var9.field2785;
                                    field458.method3585(var132);
                                }
                                if (field470 > var9.field2866 && var9.field2767 != null) {
                                    class1 var133 = new class1();
                                    var133.field3 = var9;
                                    var133.field17 = var9.field2767;
                                    field458.method3585(var133);
                                }
                                if (field471 > var9.field2866 && var9.field2850 != null) {
                                    class1 var134 = new class1();
                                    var134.field3 = var9;
                                    var134.field17 = var9.field2850;
                                    field458.method3585(var134);
                                }
                                if (field472 > var9.field2866 && var9.field2845 != null) {
                                    class1 var135 = new class1();
                                    var135.field3 = var9;
                                    var135.field17 = var9.field2845;
                                    field458.method3585(var135);
                                }
                                var9.field2866 = field460;
                                if (var9.field2825 != null) {
                                    for (int var136 = 0; var136 < field417; var136++) {
                                        class1 var137 = new class1();
                                        var137.field3 = var9;
                                        var137.field8 = field500[var136];
                                        var137.field9 = field479[var136];
                                        var137.field17 = var9.field2825;
                                        field458.method3585(var137);
                                    }
                                }
                            }
                        }
                        if (!var9.field2844 && field528 == null && Statics.field1096 == null && !field416) {
                            if ((var9.field2854 >= 0 || var9.field2768 != 0) && class140.field2116 >= var12 && class140.field2120 >= var13 && class140.field2116 < var14 && class140.field2120 < var15) {
                                if (var9.field2854 >= 0) {
                                    Statics.field1841 = arg0[var9.field2854];
                                } else {
                                    Statics.field1841 = var9;
                                }
                            }
                            if (var9.field2770 == 8 && class140.field2116 >= var12 && class140.field2120 >= var13 && class140.field2116 < var14 && class140.field2120 < var15) {
                                Statics.field165 = var9;
                            }
                            if (var9.field2750 > var9.field2740) {
                                int var138 = var9.field2855 + var10;
                                int var139 = var9.field2740;
                                int var140 = var9.field2750;
                                int var141 = class140.field2116;
                                int var142 = class140.field2120;
                                if (field359) {
                                    field372 = 32;
                                } else {
                                    field372 = 0;
                                }
                                field359 = false;
                                if (class140.field2115 == 1 || !Statics.field208 && class140.field2115 == 4) {
                                    if (var141 >= var138 && var141 < var138 + 16 && var142 >= var11 && var142 < var11 + 16) {
                                        var9.field2763 -= 4;
                                        method643(var9);
                                    } else if (var141 >= var138 && var141 < var138 + 16 && var142 >= var11 + var139 - 16 && var142 < var11 + var139) {
                                        var9.field2763 += 4;
                                        method643(var9);
                                    } else if (var141 >= var138 - field372 && var141 < field372 + var138 + 16 && var142 >= var11 + 16 && var142 < var11 + var139 - 16) {
                                        int var143 = (var139 - 32) * var139 / var140;
                                        if (var143 < 8) {
                                            var143 = 8;
                                        }
                                        int var144 = var142 - var11 - 16 - var143 / 2;
                                        int var145 = var139 - 32 - var143;
                                        var9.field2763 = (var140 - var139) * var144 / var145;
                                        method643(var9);
                                        field359 = true;
                                    }
                                }
                                if (field473 != 0) {
                                    int var146 = var9.field2855;
                                    if (var141 >= var138 - var146 && var142 >= var11 && var141 < var138 + 16 && var142 <= var11 + var139) {
                                        var9.field2763 += field473 * 45;
                                        method643(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field474 == 0 || field474 == 3) && (class140.field2122 == 1 || !Statics.field208 && class140.field2122 == 4)) {
                        class175 var61 = var9.method3147(true);
                        if (var61 != null) {
                            int var62 = class140.field2123 - var10;
                            int var63 = class140.field2117 - var11;
                            if (var61.method3193(var62, var63)) {
                                int var64 = var62 - var61.field2881 / 2;
                                int var65 = var63 - var61.field2884 / 2;
                                int var66 = field362 + field345 & 0x7FF;
                                int var67 = class91.field1566[var66];
                                int var68 = class91.field1567[var66];
                                int var69 = (field347 + 256) * var67 >> 8;
                                int var70 = (field347 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field2644.field859 + var71 >> 7;
                                int var74 = Statics.field2644.field839 - var72 >> 7;
                                field317.method2544(218);
                                field317.method2276(18);
                                field317.method2315(class137.field2075[82] ? (class137.field2075[81] ? 2 : 1) : 0);
                                field317.method2451(Statics.field1436 + var74);
                                field317.method2323(Statics.field14 + var73);
                                field317.method2276(var64);
                                field317.method2276(var65);
                                field317.method2451(field362);
                                field317.method2276(57);
                                field317.method2276(field345);
                                field317.method2276(field347);
                                field317.method2276(89);
                                field317.method2451(Statics.field2644.field859);
                                field317.method2451(Statics.field2644.field839);
                                field317.method2276(63);
                                field523 = var73;
                                field492 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ca.cf(III)V")
    public static final void method2084(int arg0, int arg1) {
        if (class173.method4(arg0)) {
            method2887(Statics.field2827[arg0], arg1);
        }
    }

    @ObfuscatedName("eh.ca([Lfo;IS)V")
    public static final void method2887(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2770 == 0) {
                    if (var3.field2811 != null) {
                        method2887(var3.field2811, arg1);
                    }
                    class4 var4 = (class4) field421.method3521((long) var3.field2822);
                    if (var4 != null) {
                        method2084(var4.field67, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2870 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field17 = var3.field2870;
                    class37.method103(var5);
                }
                if (arg1 == 1 && var3.field2847 != null) {
                    if (var3.field2742 >= 0) {
                        class173 var6 = class173.method708(var3.field2822);
                        if (var6 == null || var6.field2811 == null || var3.field2742 >= var6.field2811.length || var6.field2811[var3.field2742] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field17 = var3.field2847;
                    class37.method103(var7);
                }
            }
        }
    }

    @ObfuscatedName("f.cy(Lfo;III)V")
    public static final void method154(class173 arg0, int arg1, int arg2) {
        if (field528 != null || field416 || arg0 == null || method615(arg0) == null) {
            return;
        }
        field528 = arg0;
        field449 = method615(arg0);
        field450 = arg1;
        field451 = arg2;
        Statics.field920 = 0;
        field459 = false;
        if (field342 <= 0) {
            return;
        }
        int var3 = field342 - 1;
        Statics.field671 = new class31();
        Statics.field671.field705 = field418[var3];
        Statics.field671.field697 = field419[var3];
        Statics.field671.field698 = field420[var3];
        Statics.field671.field699 = field344[var3];
        Statics.field671.field700 = field396[var3];
    }

    @ObfuscatedName("fj.dt(III)V")
    public static void method3071(int arg0, int arg1) {
        method118(Statics.field671, arg0, arg1);
        Statics.field671 = null;
    }

    @ObfuscatedName("at.du(Lfo;B)V")
    public static void method643(class173 arg0) {
        if (field290 == arg0.field2871) {
            field480[arg0.field2793] = true;
        }
    }

    @ObfuscatedName("fo.ds(I)V")
    public static void method3152() {
        for (class4 var0 = (class4) field421.method3520(); var0 != null; var0 = (class4) field421.method3533()) {
            int var1 = var0.field67;
            if (class173.method4(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2827[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2844;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3096;
                    class173 var6 = class173.method708(var5);
                    if (var6 != null) {
                        method643(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.dj(Lfo;I)Lfo;")
    public static class173 method615(class173 arg0) {
        class173 var1 = method635(arg0);
        if (var1 == null) {
            var1 = arg0.field2814;
        }
        return var1;
    }

    @ObfuscatedName("ap.dw([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method906(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("n.dr(IB)V")
    public static final void method580(int arg0) {
        if (!class173.method4(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2827[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2861 = 0;
                var3.field2800 = 0;
            }
        }
    }

    @ObfuscatedName("k.dn([Lfo;II)V")
    public static final void method18(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2802 == arg1 && (!var3.field2844 || !method546(var3))) {
                if (var3.field2770 == 0) {
                    if (!var3.field2844 && method546(var3) && Statics.field1841 != var3) {
                        continue;
                    }
                    method18(arg0, var3.field2822);
                    if (var3.field2811 != null) {
                        method18(var3.field2811, var3.field2822);
                    }
                    class4 var4 = (class4) field421.method3521((long) var3.field2822);
                    if (var4 != null) {
                        int var5 = var4.field67;
                        if (class173.method4(var5)) {
                            method18(Statics.field2827[var5], -1);
                        }
                    }
                }
                if (var3.field2770 == 6) {
                    if (var3.field2786 != -1 || var3.field2787 != -1) {
                        boolean var6 = method1982(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2787;
                        } else {
                            var7 = var3.field2786;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method2648(var7);
                            var3.field2800 += field397;
                            while (var3.field2800 > var8.field991[var3.field2861]) {
                                var3.field2800 -= var8.field991[var3.field2861];
                                var3.field2861++;
                                if (var3.field2861 >= var8.field987.length) {
                                    var3.field2861 -= var8.field993;
                                    if (var3.field2861 < 0 || var3.field2861 >= var8.field987.length) {
                                        var3.field2861 = 0;
                                    }
                                }
                                method643(var3);
                            }
                        }
                    }
                    if (var3.field2795 != 0 && !var3.field2844) {
                        int var9 = var3.field2795 >> 16;
                        int var10 = var3.field2795 << 16 >> 16;
                        int var11 = field397 * var9;
                        int var12 = field397 * var10;
                        var3.field2840 = var3.field2840 + var11 & 0x7FF;
                        var3.field2791 = var3.field2791 + var12 & 0x7FF;
                        method643(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bc.dc(II)V")
    public static final void method1219(int arg0) {
        method3152();
        for (class24 var1 = (class24) class24.field607.method3558(); var1 != null; var1 = (class24) class24.field607.method3554()) {
            if (var1.field610 != null) {
                var1.method573();
            }
        }
        int var2 = Statics.method619(arg0).field1158;
        if (var2 == 0) {
            return;
        }
        int var3 = class176.field2887[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class91.method1951(0.9D);
                ((class95) Statics.field1563).method1984(0.9D);
            }
            if (var3 == 2) {
                class91.method1951(0.8D);
                ((class95) Statics.field1563).method1984(0.8D);
            }
            if (var3 == 3) {
                class91.method1951(0.7D);
                ((class95) Statics.field1563).method1984(0.7D);
            }
            if (var3 == 4) {
                class91.method1951(0.6D);
                ((class95) Statics.field1563).method1984(0.6D);
            }
            class52.method151();
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
            if (field512 != var4) {
                if (field512 == 0 && field462 != -1) {
                    class183.method2886(Statics.field24, field462, 0, var4, false);
                    field514 = false;
                } else if (var4 == 0) {
                    Statics.field2936.method3366();
                    class183.field2940 = 1;
                    Statics.field2941 = null;
                    field514 = false;
                } else if (class183.field2940 == 0) {
                    Statics.field2936.method3453(var4);
                } else {
                    Statics.field2698 = var4;
                }
                field512 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field515 = 127;
            }
            if (var3 == 1) {
                field515 = 96;
            }
            if (var3 == 2) {
                field515 = 64;
            }
            if (var3 == 3) {
                field515 = 32;
            }
            if (var3 == 4) {
                field515 = 0;
            }
        }
        if (var2 == 5) {
            field271 = var3;
        }
        if (var2 == 6) {
            field468 = var3;
        }
        if (var2 == 9) {
            field504 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field516 = 127;
            }
            if (var3 == 1) {
                field516 = 96;
            }
            if (var3 == 2) {
                field516 = 64;
            }
            if (var3 == 3) {
                field516 = 32;
            }
            if (var3 == 4) {
                field516 = 0;
            }
        }
        if (var2 == 17) {
            field360 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field490 = (class21) class109.method2565(class21.method945(), var3);
            if (field490 == null) {
                field490 = class21.field566;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field548 = -1;
        } else {
            field548 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("ad.di(B)V")
    public static final void method705() {
        field317.method2544(251);
        for (class4 var0 = (class4) field421.method3520(); var0 != null; var0 = (class4) field421.method3533()) {
            if (var0.field59 == 0 || var0.field59 == 3) {
                Statics.method691(var0, true);
            }
        }
        if (field439 != null) {
            method643(field439);
            field439 = null;
        }
    }

    @ObfuscatedName("cr.da(IIII)Lt;")
    public static final class4 method1892(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field67 = arg1;
        var3.field59 = arg2;
        field421.method3531(var3, (long) arg0);
        method580(arg1);
        class173 var4 = class173.method708(arg0);
        method643(var4);
        if (field439 != null) {
            method643(field439);
            field439 = null;
        }
        method2717();
        method2567(Statics.field2827[arg0 >> 16], var4, false);
        class37.method698(arg1);
        if (field284 != -1) {
            method2084(field284, 1);
        }
        return var3;
    }

    @ObfuscatedName("dq.dz(Lfo;I)Z")
    public static final boolean method2525(class173 arg0) {
        int var1 = arg0.field2834;
        if (var1 == 205) {
            field327 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field402.method3240(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field402.method3248(var4, var5 == 1);
        }
        if (var1 == 324) {
            field402.method3239(false);
        }
        if (var1 == 325) {
            field402.method3239(true);
        }
        if (var1 == 326) {
            field317.method2544(47);
            field402.method3274(field317);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("m.dm(Lfo;IIII)V")
    public static final void method116(class173 arg0, int arg1, int arg2, int arg3) {
        method565();
        class175 var4 = arg0.method3147(false);
        if (var4 == null) {
            return;
        }
        class80.method1655(arg1, arg2, var4.field2881 + arg1, var4.field2884 + arg2);
        if (field474 == 2 || field474 == 5) {
            class80.method1689(arg1, arg2, 0, var4.field2883, var4.field2882);
        } else {
            int var5 = field362 + field345 & 0x7FF;
            int var6 = Statics.field2644.field859 / 32 + 48;
            int var7 = 464 - Statics.field2644.field839 / 32;
            Statics.field560.method1611(arg1, arg2, var4.field2881, var4.field2884, var6, var7, var5, field347 + 256, var4.field2883, var4.field2882);
            for (int var8 = 0; var8 < field505; var8++) {
                int var9 = field307[var8] * 4 + 2 - Statics.field2644.field859 / 32;
                int var10 = field487[var8] * 4 + 2 - Statics.field2644.field839 / 32;
                method39(arg1, arg2, var9, var10, field398[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field408[Statics.field2983][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2644.field859 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2644.field839 / 32;
                        method39(arg1, arg2, var14, var15, Statics.field354[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field313; var16++) {
                class35 var17 = field312[field314[var16]];
                if (var17 != null && var17.method17()) {
                    class40 var18 = var17.field781;
                    if (var18 != null && var18.field884 != null) {
                        var18 = var18.method750();
                    }
                    if (var18 != null && var18.field904 && var18.field916) {
                        int var19 = var17.field859 / 32 - Statics.field2644.field859 / 32;
                        int var20 = var17.field839 / 32 - Statics.field2644.field839 / 32;
                        method39(arg1, arg2, var19, var20, Statics.field354[1], var4);
                    }
                }
            }
            int var21 = class33.field754;
            int[] var22 = class33.field757;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field404[var22[var23]];
                if (var24 != null && var24.method17() && !var24.field51 && Statics.field2644 != var24) {
                    int var25 = var24.field859 / 32 - Statics.field2644.field859 / 32;
                    int var26 = var24.field839 / 32 - Statics.field2644.field839 / 32;
                    boolean var27 = false;
                    if (method983(var24.field35, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field91; var29++) {
                        if (var24.field35.equals(Statics.field209[var29].field617)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2644.field50 != 0 && var24.field50 != 0 && Statics.field2644.field50 == var24.field50) {
                        var30 = true;
                    }
                    if (var27) {
                        method39(arg1, arg2, var25, var26, Statics.field354[3], var4);
                    } else if (var30) {
                        method39(arg1, arg2, var25, var26, Statics.field354[4], var4);
                    } else if (var28) {
                        method39(arg1, arg2, var25, var26, Statics.field354[5], var4);
                    } else {
                        method39(arg1, arg2, var25, var26, Statics.field354[2], var4);
                    }
                }
            }
            if (field293 != 0 && field285 % 20 < 10) {
                if (field293 == 1 && field294 >= 0 && field294 < field312.length) {
                    class35 var31 = field312[field294];
                    if (var31 != null) {
                        int var32 = var31.field859 / 32 - Statics.field2644.field859 / 32;
                        int var33 = var31.field839 / 32 - Statics.field2644.field839 / 32;
                        method2916(arg1, arg2, var32, var33, Statics.field352[1], var4);
                    }
                }
                if (field293 == 2) {
                    int var34 = field296 * 4 - Statics.field14 * 4 + 2 - Statics.field2644.field859 / 32;
                    int var35 = field297 * 4 - Statics.field1436 * 4 + 2 - Statics.field2644.field839 / 32;
                    method2916(arg1, arg2, var34, var35, Statics.field352[1], var4);
                }
                if (field293 == 10 && field295 >= 0 && field295 < field404.length) {
                    class3 var36 = field404[field295];
                    if (var36 != null) {
                        int var37 = var36.field859 / 32 - Statics.field2644.field859 / 32;
                        int var38 = var36.field839 / 32 - Statics.field2644.field839 / 32;
                        method2916(arg1, arg2, var37, var38, Statics.field352[1], var4);
                    }
                }
            }
            if (field523 != 0) {
                int var39 = field523 * 4 + 2 - Statics.field2644.field859 / 32;
                int var40 = field492 * 4 + 2 - Statics.field2644.field839 / 32;
                method39(arg1, arg2, var39, var40, Statics.field352[0], var4);
            }
            if (!Statics.field2644.field51) {
                class80.method1661(var4.field2881 / 2 + arg1 - 1, var4.field2884 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field511[arg3] = true;
    }

    @ObfuscatedName("et.df(Lfo;IIIS)V")
    public static final void method2754(class173 arg0, int arg1, int arg2, int arg3) {
        class175 var4 = arg0.method3147(false);
        if (var4 == null) {
            return;
        }
        if (field474 < 3) {
            Statics.field1160.method1611(arg1, arg2, var4.field2881, var4.field2884, 25, 25, field362, 256, var4.field2883, var4.field2882);
        } else {
            class80.method1689(arg1, arg2, 0, var4.field2883, var4.field2882);
        }
    }

    @ObfuscatedName("fy.dh(IIIILcd;Lfs;B)V")
    public static final void method2916(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method39(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field362 + field345 & 0x7FF;
        int var8 = class91.field1566[var7];
        int var9 = class91.field1567[var7];
        int var10 = var8 * 256 / (field347 + 256);
        int var11 = var9 * 256 / (field347 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field573.method1586(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("k.dq(IIIILcd;Lfs;I)V")
    public static final void method39(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field362 + field345 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1566[var6];
        int var9 = class91.field1567[var6];
        int var10 = var8 * 256 / (field347 + 256);
        int var11 = var9 * 256 / (field347 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1626(arg5.field2881 / 2 + var12 - arg4.field1391 / 2, arg5.field2884 / 2 - var13 - arg4.field1390 / 2, arg0, arg1, arg5.field2881, arg5.field2884, arg5.field2883, arg5.field2882);
        } else {
            arg4.method1574(arg5.field2881 / 2 + arg0 + var12 - arg4.field1391 / 2, arg5.field2884 / 2 + arg1 - var13 - arg4.field1390 / 2);
        }
    }

    @ObfuscatedName("an.dg(Ljava/lang/String;ZB)Z")
    public static boolean method983(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = Statics.method716(arg0, Statics.field1742);
        for (int var3 = 0; var3 < field335; var3++) {
            if (var2.equalsIgnoreCase(Statics.method716(field544[var3].field237, Statics.field1742)) && (!arg1 || field544[var3].field238 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(Statics.method716(Statics.field2644.field35, Statics.field1742))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("w.dk(Ljava/lang/String;B)Z")
    public static boolean method109(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = Statics.method716(arg0, Statics.field1742);
        for (int var2 = 0; var2 < field274; var2++) {
            class8 var3 = field547[var2];
            if (var1.equalsIgnoreCase(Statics.method716(var3.field124, Statics.field1742))) {
                return true;
            }
            if (var1.equalsIgnoreCase(Statics.method716(var3.field129, Statics.field1742))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cz.db(Ljava/lang/String;I)V")
    public static final void method1992(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field335 < 200 || field400 == 1) || field335 >= 400) {
            class12.method156(30, "", class157.field2452);
            return;
        }
        String var1 = Statics.method716(arg0, Statics.field1742);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field335; var2++) {
            class18 var3 = field544[var2];
            String var4 = Statics.method716(var3.field237, Statics.field1742);
            if (var4 != null && var4.equals(var1)) {
                class12.method156(30, "", arg0 + class157.field2472);
                return;
            }
            if (var3.field241 != null) {
                String var5 = Statics.method716(var3.field241, Statics.field1742);
                if (var5 != null && var5.equals(var1)) {
                    class12.method156(30, "", arg0 + class157.field2472);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field274; var6++) {
            class8 var7 = field547[var6];
            String var8 = Statics.method716(var7.field124, Statics.field1742);
            if (var8 != null && var8.equals(var1)) {
                class12.method156(30, "", class157.field2559 + arg0 + class157.field2406);
                return;
            }
            if (var7.field129 != null) {
                String var9 = Statics.method716(var7.field129, Statics.field1742);
                if (var9 != null && var9.equals(var1)) {
                    class12.method156(30, "", class157.field2559 + arg0 + class157.field2406);
                    return;
                }
            }
        }
        if (Statics.method716(Statics.field2644.field35, Statics.field1742).equals(var1)) {
            class12.method156(30, "", class157.field2456);
        } else {
            field317.method2544(114);
            field317.method2276(class119.method224(arg0));
            field317.method2282(arg0);
        }
    }

    @ObfuscatedName("cw.de(Ljava/lang/String;ZI)V")
    public static final void method2004(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field274 < 100 || field400 == 1) || field274 >= 400) {
            class12.method156(31, "", class157.field2454);
            return;
        }
        String var2 = Statics.method716(arg0, Statics.field1742);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field274; var3++) {
            class8 var4 = field547[var3];
            String var5 = Statics.method716(var4.field124, Statics.field1742);
            if (var5 != null && var5.equals(var2)) {
                class12.method156(31, "", arg0 + class157.field2455);
                return;
            }
            if (var4.field129 != null) {
                String var6 = Statics.method716(var4.field129, Statics.field1742);
                if (var6 != null && var6.equals(var2)) {
                    class12.method156(31, "", arg0 + class157.field2455);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field335; var7++) {
            class18 var8 = field544[var7];
            String var9 = Statics.method716(var8.field237, Statics.field1742);
            if (var9 != null && var9.equals(var2)) {
                class12.method156(31, "", class157.field2535 + arg0 + class157.field2390);
                return;
            }
            if (var8.field241 != null) {
                String var10 = Statics.method716(var8.field241, Statics.field1742);
                if (var10 != null && var10.equals(var2)) {
                    class12.method156(31, "", class157.field2535 + arg0 + class157.field2390);
                    return;
                }
            }
        }
        if (Statics.method716(Statics.field2644.field35, Statics.field1742).equals(var2)) {
            class12.method156(31, "", class157.field2546);
        } else {
            field317.method2544(203);
            field317.method2276(class119.method224(arg0));
            field317.method2282(arg0);
        }
    }

    @ObfuscatedName("w.do(Ljava/lang/String;I)V")
    public static final void method107(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = Statics.method716(arg0, Statics.field1742);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field274; var2++) {
            class8 var3 = field547[var2];
            String var4 = var3.field124;
            String var5 = Statics.method716(var4, Statics.field1742);
            if (class129.method641(arg0, var1, var4, var5)) {
                field274--;
                for (int var6 = var2; var6 < field274; var6++) {
                    field547[var6] = field547[var6 + 1];
                }
                field324 = field460;
                field317.method2544(96);
                field317.method2276(class119.method224(arg0));
                field317.method2282(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ac.dx(Ljava/lang/String;IB)V")
    public static final void method685(String arg0, int arg1) {
        field317.method2544(66);
        field317.method2276(class119.method224(arg0) + 1);
        field317.method2316(arg1);
        field317.method2282(arg0);
    }

    @ObfuscatedName("a.dy(Ljava/lang/String;I)V")
    public static final void method187(String arg0) {
        if (Statics.field209 != null) {
            field317.method2544(88);
            field317.method2276(class119.method224(arg0));
            field317.method2282(arg0);
        }
    }

    @ObfuscatedName("ah.dd(Lfo;S)I")
    public static int method1035(class173 arg0) {
        class201 var1 = (class201) field477.method3521(((long) arg0.field2822 << 32) + (long) arg0.field2742);
        return var1 == null ? arg0.field2781 : var1.field3083;
    }

    @ObfuscatedName("aw.dl(Lfo;B)Lfo;")
    public static class173 method635(class173 arg0) {
        int var1 = class178.method525(method1035(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method708(arg0.field2802);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("client.eo(Lfo;I)Z")
    public static boolean method546(class173 arg0) {
        if (field410) {
            if (method1035(arg0) != 0) {
                return false;
            }
            if (arg0.field2770 == 0) {
                return false;
            }
        }
        return arg0.field2761;
    }

    @ObfuscatedName("aj.eb(Lfo;II)Ljava/lang/String;")
    public static String method620(class173 arg0, int arg1) {
        if (!class178.method40(method1035(arg0), arg1) && arg0.field2839 == null) {
            return null;
        } else if (arg0.field2732 == null || arg0.field2732.length <= arg1 || arg0.field2732[arg1] == null || arg0.field2732[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2732[arg1];
        }
    }

    @ObfuscatedName("ag.eg(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method919(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field301 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field301 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field301 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field301 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field301 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field158 != null) {
            var3 = "/p=" + Statics.field158;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field279 + "/a=" + Statics.field509 + var3 + "/";
    }

    @ObfuscatedName("ed.el(Ljava/lang/String;ZI)V")
    public static void method2769(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2032; var5++) {
            class52 var6 = class52.method971(var5);
            if ((!arg1 || var6.field1132) && var6.field1144 == -1 && var6.field1145.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1762 = -1;
                    Statics.field883 = null;
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
        Statics.field883 = var3;
        Statics.field1964 = 0;
        Statics.field1762 = var4;
        String[] var9 = new String[Statics.field1762];
        for (int var10 = 0; var10 < Statics.field1762; var10++) {
            var9[var10] = class52.method971(var3[var10]).field1145;
        }
        short[] var11 = Statics.field883;
        class124.method1995(var9, var11, 0, var9.length - 1);
    }
}

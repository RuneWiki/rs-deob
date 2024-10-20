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
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

public final class client extends class136 {

    @ObfuscatedName("client.g")
    public static boolean field325 = true;

    @ObfuscatedName("client.u")
    public static int field256 = 1;

    @ObfuscatedName("client.q")
    public static int field385 = 0;

    @ObfuscatedName("client.v")
    public static int field455 = 0;

    @ObfuscatedName("client.j")
    public static boolean field407 = false;

    @ObfuscatedName("client.m")
    public static boolean field263 = false;

    @ObfuscatedName("client.a")
    public static int field264 = 0;

    @ObfuscatedName("client.t")
    public static int field268 = 0;

    @ObfuscatedName("client.w")
    public static class220[] field320 = new class220[4];

    @ObfuscatedName("client.p")
    public static boolean field341 = true;

    @ObfuscatedName("client.z")
    public static int field270 = 0;

    @ObfuscatedName("client.s")
    public static long field271 = 1L;

    @ObfuscatedName("client.b")
    public static int field272 = -1;

    @ObfuscatedName("client.e")
    public static int field273 = -1;

    @ObfuscatedName("client.ar")
    public static int field274 = -1;

    @ObfuscatedName("client.av")
    public static boolean field275 = true;

    @ObfuscatedName("client.ae")
    public static boolean field276 = false;

    @ObfuscatedName("client.aq")
    public static int field470 = 0;

    @ObfuscatedName("client.ay")
    public static int field515 = 0;

    @ObfuscatedName("client.ac")
    public static int field390 = 0;

    @ObfuscatedName("client.ao")
    public static int field280 = 0;

    @ObfuscatedName("client.ab")
    public static int field296 = 0;

    @ObfuscatedName("client.at")
    public static int field282 = 0;

    @ObfuscatedName("client.ai")
    public static int field283 = 0;

    @ObfuscatedName("client.aa")
    public static int field284 = 0;

    @ObfuscatedName("client.ap")
    public static int field484 = 0;

    @ObfuscatedName("client.ad")
    public static class111 field286 = new class111(new byte[5000]);

    @ObfuscatedName("client.az")
    public static class19 field287 = class19.field545;

    @ObfuscatedName("client.al")
    public static int field288 = 0;

    @ObfuscatedName("client.ag")
    public static int field462 = 0;

    @ObfuscatedName("client.an")
    public static int field290 = 0;

    @ObfuscatedName("client.bi")
    public static int field293 = 0;

    @ObfuscatedName("client.by")
    public static int field294 = 0;

    @ObfuscatedName("client.bt")
    public static int field516 = 0;

    @ObfuscatedName("client.bq")
    public static int field329 = 0;

    @ObfuscatedName("client.bs")
    public static int field308 = 0;

    @ObfuscatedName("client.cw")
    public static class32[] field299 = new class32[32768];

    @ObfuscatedName("client.ch")
    public static int field300 = 0;

    @ObfuscatedName("client.cy")
    public static int[] field301 = new int[32768];

    @ObfuscatedName("client.co")
    public static class114 field302 = new class114(5000);

    @ObfuscatedName("client.cr")
    public static class114 field303 = new class114(5000);

    @ObfuscatedName("client.cd")
    public static class114 field304 = new class114(5000);

    @ObfuscatedName("client.ck")
    public static int field305 = 0;

    @ObfuscatedName("client.ce")
    public static int field279 = 0;

    @ObfuscatedName("client.cn")
    public static int field307 = 0;

    @ObfuscatedName("client.ca")
    public static int field373 = 0;

    @ObfuscatedName("client.ct")
    public static int field524 = 0;

    @ObfuscatedName("client.ci")
    public static int field310 = 0;

    @ObfuscatedName("client.cz")
    public static int field311 = 0;

    @ObfuscatedName("client.cl")
    public static int field312 = 0;

    @ObfuscatedName("client.cc")
    public static boolean field313 = false;

    @ObfuscatedName("client.cu")
    public static int field314 = 0;

    @ObfuscatedName("client.dm")
    public static int field315 = 0;

    @ObfuscatedName("client.do")
    public static int field443 = 1;

    @ObfuscatedName("client.ds")
    public static int field456 = 0;

    @ObfuscatedName("client.db")
    public static int field318 = 1;

    @ObfuscatedName("client.dk")
    public static int field319 = 0;

    @ObfuscatedName("client.dj")
    public static boolean field519 = false;

    @ObfuscatedName("client.dg")
    public static int[][][] field322 = new int[4][13][13];

    @ObfuscatedName("client.dv")
    public static final int[] field323 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dc")
    public static int field354 = 0;

    @ObfuscatedName("client.du")
    public static int field489 = 2;

    @ObfuscatedName("client.dn")
    public static int field344 = 0;

    @ObfuscatedName("client.dw")
    public static int field327 = 2;

    @ObfuscatedName("client.dy")
    public static int field328 = 0;

    @ObfuscatedName("client.dt")
    public static int field289 = 1;

    @ObfuscatedName("client.dh")
    public static int field330 = 0;

    @ObfuscatedName("client.ep")
    public static int field269 = 0;

    @ObfuscatedName("client.eo")
    public static int field332 = 2;

    @ObfuscatedName("client.ec")
    public static int field429 = 0;

    @ObfuscatedName("client.ev")
    public static int field334 = 1;

    @ObfuscatedName("client.ej")
    public static int field335 = 0;

    @ObfuscatedName("client.ea")
    public static int field422 = 0;

    @ObfuscatedName("client.eg")
    public static int field339 = 2301979;

    @ObfuscatedName("client.em")
    public static int field395 = 5063219;

    @ObfuscatedName("client.ez")
    public static int field400 = 3353893;

    @ObfuscatedName("client.el")
    public static int field342 = 7759444;

    @ObfuscatedName("client.ey")
    public static boolean field324 = false;

    @ObfuscatedName("client.ew")
    public static int field376 = 0;

    @ObfuscatedName("client.fo")
    public static int field345 = 128;

    @ObfuscatedName("client.fj")
    public static int field346 = 0;

    @ObfuscatedName("client.fn")
    public static int field347 = 0;

    @ObfuscatedName("client.fu")
    public static int field363 = 0;

    @ObfuscatedName("client.fq")
    public static int field349 = 0;

    @ObfuscatedName("client.fv")
    public static int field350 = 0;

    @ObfuscatedName("client.fx")
    public static int field351 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field352 = false;

    @ObfuscatedName("client.fa")
    public static int field353 = 0;

    @ObfuscatedName("client.fi")
    public static int field438 = 0;

    @ObfuscatedName("client.fr")
    public static int field355 = 50;

    @ObfuscatedName("client.fz")
    public static int[] field356 = new int[field355];

    @ObfuscatedName("client.ft")
    public static int[] field357 = new int[field355];

    @ObfuscatedName("client.ff")
    public static int[] field358 = new int[field355];

    @ObfuscatedName("client.fe")
    public static int[] field388 = new int[field355];

    @ObfuscatedName("client.fy")
    public static int[] field333 = new int[field355];

    @ObfuscatedName("client.fw")
    public static int[] field361 = new int[field355];

    @ObfuscatedName("client.fs")
    public static int[] field362 = new int[field355];

    @ObfuscatedName("client.fh")
    public static String[] field343 = new String[field355];

    @ObfuscatedName("client.fp")
    public static int[][] field488 = new int[104][104];

    @ObfuscatedName("client.gl")
    public static int field365 = 0;

    @ObfuscatedName("client.ga")
    public static int field285 = -1;

    @ObfuscatedName("client.gh")
    public static int field367 = -1;

    @ObfuscatedName("client.gf")
    public static int field368 = 0;

    @ObfuscatedName("client.gr")
    public static int field369 = 0;

    @ObfuscatedName("client.gy")
    public static int field370 = 0;

    @ObfuscatedName("client.gm")
    public static int field371 = 0;

    @ObfuscatedName("client.gk")
    public static int field372 = 0;

    @ObfuscatedName("client.gx")
    public static int field530 = 0;

    @ObfuscatedName("client.gg")
    public static int field374 = 0;

    @ObfuscatedName("client.go")
    public static int field375 = 0;

    @ObfuscatedName("client.gw")
    public static int field451 = 0;

    @ObfuscatedName("client.gn")
    public static int field377 = 0;

    @ObfuscatedName("client.gj")
    public static boolean field378 = false;

    @ObfuscatedName("client.gt")
    public static int field379 = 0;

    @ObfuscatedName("client.gv")
    public static int field380 = 0;

    @ObfuscatedName("client.ge")
    public static class3[] field381 = new class3[2048];

    @ObfuscatedName("client.gp")
    public static int field382 = 0;

    @ObfuscatedName("client.gs")
    public static int[] field383 = new int[2048];

    @ObfuscatedName("client.gz")
    public static int field306 = 0;

    @ObfuscatedName("client.gc")
    public static int[] field317 = new int[2048];

    @ObfuscatedName("client.hu")
    public static class111[] field386 = new class111[2048];

    @ObfuscatedName("client.hm")
    public static int field281 = -1;

    @ObfuscatedName("client.ho")
    public static int field442 = 0;

    @ObfuscatedName("client.hb")
    public static int field464 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field502 = new int[1000];

    @ObfuscatedName("client.hw")
    public static final int[] field391 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hk")
    public static String[] field478 = new String[8];

    @ObfuscatedName("client.hj")
    public static boolean[] field393 = new boolean[8];

    @ObfuscatedName("client.hy")
    public static int[] field394 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hx")
    public static int field406 = -1;

    @ObfuscatedName("client.hl")
    public static class190[][][] field396 = new class190[4][104][104];

    @ObfuscatedName("client.hc")
    public static class190 field445 = new class190();

    @ObfuscatedName("client.ht")
    public static class190 field398 = new class190();

    @ObfuscatedName("client.hq")
    public static class190 field399 = new class190();

    @ObfuscatedName("client.hi")
    public static int[] field265 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field401 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field402 = new int[25];

    @ObfuscatedName("client.hh")
    public static int field403 = 0;

    @ObfuscatedName("client.ha")
    public static boolean field404 = false;

    @ObfuscatedName("client.ip")
    public static int field405 = 0;

    @ObfuscatedName("client.il")
    public static int[] field262 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field511 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field392 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field409 = new int[500];

    @ObfuscatedName("client.in")
    public static String[] field410 = new String[500];

    @ObfuscatedName("client.ig")
    public static String[] field411 = new String[500];

    @ObfuscatedName("client.if")
    public static int field412 = -1;

    @ObfuscatedName("client.iu")
    public static int field413 = -1;

    @ObfuscatedName("client.iv")
    public static int field414 = 0;

    @ObfuscatedName("client.ia")
    public static int field415 = 50;

    @ObfuscatedName("client.ik")
    public static int field416 = 0;

    @ObfuscatedName("client.ix")
    public static String field417 = null;

    @ObfuscatedName("client.ii")
    public static boolean field418 = false;

    @ObfuscatedName("client.it")
    public static int field419 = -1;

    @ObfuscatedName("client.io")
    public static int field420 = -1;

    @ObfuscatedName("client.iy")
    public static String field421 = null;

    @ObfuscatedName("client.jl")
    public static String field389 = null;

    @ObfuscatedName("client.jx")
    public static int field423 = -1;

    @ObfuscatedName("client.jd")
    public static class187 field424 = new class187(8);

    @ObfuscatedName("client.jo")
    public static int field425 = 0;

    @ObfuscatedName("client.jf")
    public static int field500 = 0;

    @ObfuscatedName("client.jg")
    public static class164 field540 = null;

    @ObfuscatedName("client.jp")
    public static int field428 = 0;

    @ObfuscatedName("client.jz")
    public static int field291 = 0;

    @ObfuscatedName("client.js")
    public static int field430 = 0;

    @ObfuscatedName("client.jr")
    public static int field431 = -1;

    @ObfuscatedName("client.jj")
    public static boolean field432 = false;

    @ObfuscatedName("client.jm")
    public static boolean field433 = false;

    @ObfuscatedName("client.jy")
    public static boolean field434 = false;

    @ObfuscatedName("client.ja")
    public static class164 field297 = null;

    @ObfuscatedName("client.jh")
    public static class164 field436 = null;

    @ObfuscatedName("client.jc")
    public static class164 field437 = null;

    @ObfuscatedName("client.jk")
    public static int field512 = 0;

    @ObfuscatedName("client.jt")
    public static int field266 = 0;

    @ObfuscatedName("client.jw")
    public static class164 field440 = null;

    @ObfuscatedName("client.ju")
    public static boolean field441 = false;

    @ObfuscatedName("client.jv")
    public static int field538 = -1;

    @ObfuscatedName("client.jb")
    public static int field491 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field444 = false;

    @ObfuscatedName("client.je")
    public static int field476 = -1;

    @ObfuscatedName("client.jq")
    public static int field397 = -1;

    @ObfuscatedName("client.ji")
    public static boolean field514 = false;

    @ObfuscatedName("client.kd")
    public static int field448 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field257 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field295 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field435 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field321 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field453 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field454 = 0;

    @ObfuscatedName("client.kg")
    public static int field278 = 0;

    @ObfuscatedName("client.kw")
    public static int field472 = 0;

    @ObfuscatedName("client.kz")
    public static int field366 = 0;

    @ObfuscatedName("client.ki")
    public static int field446 = 0;

    @ObfuscatedName("client.kq")
    public static int field459 = 0;

    @ObfuscatedName("client.kk")
    public static int field460 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field461 = new int[2000];

    @ObfuscatedName("client.kv")
    public static String[] field439 = new String[1000];

    @ObfuscatedName("client.ky")
    public static int field463 = 0;

    @ObfuscatedName("client.ko")
    public static class190 field258 = new class190();

    @ObfuscatedName("client.ks")
    public static class190 field465 = new class190();

    @ObfuscatedName("client.km")
    public static class190 field466 = new class190();

    @ObfuscatedName("client.ls")
    public static class187 field467 = new class187(512);

    @ObfuscatedName("client.lm")
    public static int field468 = 0;

    @ObfuscatedName("client.lh")
    public static int field469 = -2;

    @ObfuscatedName("client.lg")
    public static boolean[] field486 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field471 = new boolean[100];

    @ObfuscatedName("client.le")
    public static boolean[] field452 = new boolean[100];

    @ObfuscatedName("client.li")
    public static int[] field316 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field426 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field475 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field493 = new int[100];

    @ObfuscatedName("client.lx")
    public static int field477 = 0;

    @ObfuscatedName("client.lf")
    public static long field408 = 0L;

    @ObfuscatedName("client.lk")
    public static boolean field340 = true;

    @ObfuscatedName("client.lr")
    public static int field480 = 765;

    @ObfuscatedName("client.ld")
    public static int field255 = 1;

    @ObfuscatedName("client.lp")
    public static int[] field482 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lv")
    public static int field483 = 0;

    @ObfuscatedName("client.lq")
    public static int field387 = 0;

    @ObfuscatedName("client.lw")
    public static String field485 = "";

    @ObfuscatedName("client.my")
    public static long[] field267 = new long[100];

    @ObfuscatedName("client.ma")
    public static int field359 = 0;

    @ObfuscatedName("client.mf")
    public static int field326 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field541 = new int[128];

    @ObfuscatedName("client.mv")
    public static int[] field490 = new int[128];

    @ObfuscatedName("client.mb")
    public static long field427 = -1L;

    @ObfuscatedName("client.mx")
    public static String field492 = null;

    @ObfuscatedName("client.mh")
    public static String field539 = null;

    @ObfuscatedName("client.mn")
    public static int field527 = -1;

    @ObfuscatedName("client.mr")
    public static int field495 = 0;

    @ObfuscatedName("client.mp")
    public static int[] field496 = new int[1000];

    @ObfuscatedName("client.mc")
    public static int[] field497 = new int[1000];

    @ObfuscatedName("client.mk")
    public static class74[] field498 = new class74[1000];

    @ObfuscatedName("client.mo")
    public static int field499 = 0;

    @ObfuscatedName("client.ml")
    public static int field364 = 0;

    @ObfuscatedName("client.nr")
    public static int field501 = 0;

    @ObfuscatedName("client.nh")
    public static int field487 = 255;

    @ObfuscatedName("client.ne")
    public static int field503 = -1;

    @ObfuscatedName("client.nf")
    public static boolean field504 = false;

    @ObfuscatedName("client.np")
    public static int field505 = 127;

    @ObfuscatedName("client.nc")
    public static int field292 = 127;

    @ObfuscatedName("client.nm")
    public static int field507 = 0;

    @ObfuscatedName("client.no")
    public static int[] field508 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field509 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field510 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field479 = new int[50];

    @ObfuscatedName("client.ny")
    public static class54[] field336 = new class54[50];

    @ObfuscatedName("client.nl")
    public static boolean field513 = false;

    @ObfuscatedName("client.om")
    public static boolean[] field494 = new boolean[5];

    @ObfuscatedName("client.oy")
    public static int[] field447 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field309 = new int[5];

    @ObfuscatedName("client.ok")
    public static int[] field517 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field518 = new int[5];

    @ObfuscatedName("client.oe")
    public static short field506 = 256;

    @ObfuscatedName("client.oc")
    public static short field520 = 205;

    @ObfuscatedName("client.oi")
    public static short field521 = 256;

    @ObfuscatedName("client.ox")
    public static short field522 = 320;

    @ObfuscatedName("client.op")
    public static short field523 = 1;

    @ObfuscatedName("client.ot")
    public static short field473 = 32767;

    @ObfuscatedName("client.ol")
    public static short field525 = 1;

    @ObfuscatedName("client.ou")
    public static short field526 = 32767;

    @ObfuscatedName("client.oq")
    public static int field331 = 0;

    @ObfuscatedName("client.ob")
    public static int field528 = 0;

    @ObfuscatedName("client.og")
    public static int field529 = 0;

    @ObfuscatedName("client.of")
    public static int field338 = 0;

    @ObfuscatedName("client.oa")
    public static int field531 = 0;

    @ObfuscatedName("client.oo")
    public static int field532 = 0;

    @ObfuscatedName("client.od")
    public static int field533 = 0;

    @ObfuscatedName("client.on")
    public static class17[] field534 = new class17[400];

    @ObfuscatedName("client.pn")
    public static class186 field535 = new class186();

    @ObfuscatedName("client.pe")
    public static int field536 = 0;

    @ObfuscatedName("client.pf")
    public static class8[] field537 = new class8[400];

    @ObfuscatedName("client.pq")
    public static class170 field360 = new class170();

    @ObfuscatedName("client.pj")
    public static int field450 = -1;

    @ObfuscatedName("client.px")
    public static int field449 = -1;

    @ObfuscatedName("client.pt")
    public static class211[] field253 = new class211[8];

    @ObfuscatedName("client.g(I)V")
    public final void method209() {
    }

    public final void init() {
        if (!this.method2733()) {
            return;
        }
        class181[] var1 = new class181[] { class181.field2960, class181.field2950, class181.field2949, class181.field2961, class181.field2958, class181.field2952, class181.field2951, class181.field2955, class181.field2956, class181.field2957, class181.field2963, class181.field2962, class181.field2954, class181.field2965, class181.field2948 };
        class181[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class181 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2959);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2959)) {
                    case 1:
                        class145[] var6 = new class145[] { class145.field2174, class145.field2173, class145.field2170, class145.field2172, class145.field2171, class145.field2175 };
                        Statics.field260 = (class145) class101.method1845(var6, Integer.parseInt(var5));
                        if (Statics.field260 == class145.field2175) {
                            Statics.field261 = class203.field3043;
                        } else {
                            Statics.field261 = class203.field3038;
                        }
                        break;
                    case 2:
                        field264 = Integer.parseInt(var5);
                    case 3:
                    case 8:
                    case 12:
                    default:
                        break;
                    case 4:
                        Statics.field457 = class144.method3198(Integer.parseInt(var5));
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field22)) {
                            field407 = true;
                        } else {
                            field407 = false;
                        }
                        break;
                    case 6:
                        field455 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field384 = var5;
                        break;
                    case 9:
                        Statics.field1944 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field385 = Integer.parseInt(var5);
                        break;
                    case 11:
                        Statics.field277 = Integer.parseInt(var5);
                        break;
                    case 13:
                        field256 = Integer.parseInt(var5);
                        break;
                    case 14:
                        if (var5.equalsIgnoreCase(class2.field22)) {
                        }
                        break;
                    case 15:
                        Statics.field259 = var5;
                }
            }
        }
        method570();
        Statics.field1306 = this.getCodeBase().getHost();
        String var7 = Statics.field457.field2168;
        byte var8 = 0;
        try {
            class141.method815("oldschool", var7, var8, 16);
        } catch (Exception var10) {
            class140.method530((String) null, var10);
        }
        Statics.field254 = this;
        this.method2731(765, 503, 81);
    }

    @ObfuscatedName("b.q(B)V")
    public static final void method570() {
        class81.field1390 = false;
        field263 = false;
    }

    @ObfuscatedName("client.r(I)V")
    public final void method185() {
        Statics.field1878 = field455 == 0 ? 43594 : field256 + 40000;
        Statics.field230 = field455 == 0 ? 443 : field256 + 50000;
        Statics.field2033 = Statics.field1878;
        Statics.field1005 = class165.field2772;
        Statics.field1541 = class165.field2771;
        Statics.field2809 = class165.field2773;
        Statics.field2808 = class165.field2774;
        class129.method2548();
        Canvas var1 = Statics.field594;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class129.field1994);
        var1.addFocusListener(class129.field1994);
        Canvas var2 = Statics.field594;
        var2.addMouseListener(class132.field2043);
        var2.addMouseMotionListener(class132.field2043);
        var2.addFocusListener(class132.field2043);
        Statics.field1274 = class123.method2702();
        if (Statics.field1274 != null) {
            Statics.field1274.method2564(Statics.field594);
        }
        Statics.field51 = new class126(255, class141.field2126, class141.field2136, 500000);
        class218 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class141.method2031("", Statics.field260.field2176, false);
            byte[] var5 = new byte[(int) var3.method3742()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3758(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class111(var5));
        } catch (Exception var15) {
        }
        try {
            if (var3 != null) {
                var3.method3741();
            }
        } catch (Exception var14) {
        }
        Statics.field1877 = var4;
        Statics.field232 = this.getToolkit().getSystemClipboard();
        String var12 = Statics.field199;
        class130.field2024 = this;
        class130.field2023 = var12;
        if (field455 != 0) {
            field276 = true;
        }
        int var13 = Statics.field1877.field132;
        field408 = 0L;
        if (var13 >= 2) {
            field340 = true;
        } else {
            field340 = false;
        }
        method2546();
        if (field268 >= 25) {
            field302.method2477(217);
            field302.method2204(method112());
            field302.method2205(Statics.field3047);
            field302.method2205(Statics.field187);
        }
        field2088 = true;
    }

    @ObfuscatedName("client.v(I)V")
    public final void method186() {
        field270++;
        this.method341();
        class161.method2853();
        try {
            if (class174.field2843 == 1) {
                int var1 = Statics.field2842.method3273();
                if (var1 > 0 && Statics.field2842.method3278()) {
                    int var2 = var1 - Statics.field2845;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2842.method3306(var2);
                } else {
                    Statics.field2842.method3277();
                    Statics.field2842.method3276();
                    if (Statics.field2844 == null) {
                        class174.field2843 = 0;
                    } else {
                        class174.field2843 = 2;
                    }
                    Statics.field733 = null;
                    Statics.field2800 = null;
                }
            }
        } catch (Exception var208) {
            var208.printStackTrace();
            Statics.field2842.method3277();
            class174.field2843 = 0;
            Statics.field733 = null;
            Statics.field2800 = null;
            Statics.field2844 = null;
        }
        method986();
        class129.method11();
        class132.method2527();
        if (Statics.field1274 != null) {
            int var4 = Statics.field1274.method2552();
            field463 = var4;
        }
        if (field268 == 0) {
            method2470();
            class136.method26();
        } else if (field268 == 5) {
            class30.method977(this);
            method2470();
            class136.method26();
        } else if (field268 == 10 || field268 == 11) {
            class30.method977(this);
        } else if (field268 == 20) {
            class30.method977(this);
            method2144();
        } else if (field268 == 25) {
            method36(false);
            field315 = 0;
            boolean var5 = true;
            for (int var6 = 0; var6 < Statics.field14.length; var6++) {
                if (Statics.field632[var6] != -1 && Statics.field14[var6] == null) {
                    Statics.field14[var6] = Statics.field1087.method2940(Statics.field632[var6], 0);
                    if (Statics.field14[var6] == null) {
                        var5 = false;
                        field315++;
                    }
                }
                if (Statics.field116[var6] != -1 && Statics.field1907[var6] == null) {
                    Statics.field1907[var6] = Statics.field1087.method2941(Statics.field116[var6], 0, Statics.field222[var6]);
                    if (Statics.field1907[var6] == null) {
                        var5 = false;
                        field315++;
                    }
                }
            }
            if (var5) {
                field456 = 0;
                boolean var7 = true;
                for (int var8 = 0; var8 < Statics.field14.length; var8++) {
                    byte[] var9 = Statics.field1907[var8];
                    if (var9 != null) {
                        int var10 = (Statics.field1897[var8] >> 8) * 64 - Statics.field120;
                        int var11 = (Statics.field1897[var8] & 0xFF) * 64 - Statics.field124;
                        if (field519) {
                            var10 = 10;
                            var11 = 10;
                        }
                        boolean var13 = true;
                        class111 var14 = new class111(var9);
                        int var15 = -1;
                        label1028: while (true) {
                            int var16 = var14.method2368();
                            if (var16 == 0) {
                                var7 &= var13;
                                break;
                            }
                            var15 += var16;
                            int var17 = 0;
                            boolean var18 = false;
                            while (true) {
                                while (!var18) {
                                    int var20 = var14.method2368();
                                    if (var20 == 0) {
                                        continue label1028;
                                    }
                                    var17 += var20 - 1;
                                    int var21 = var17 & 0x3F;
                                    int var22 = var17 >> 6 & 0x3F;
                                    int var23 = var14.method2219() >> 2;
                                    int var24 = var10 + var22;
                                    int var25 = var11 + var21;
                                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                                        class38 var26 = class38.method150(var15);
                                        if (var23 != 22 || !field263 || var26.field878 != 0 || var26.field876 == 1 || var26.field897) {
                                            if (!var26.method699()) {
                                                field456++;
                                                var13 = false;
                                            }
                                            var18 = true;
                                        }
                                    }
                                }
                                int var19 = var14.method2368();
                                if (var19 == 0) {
                                    break;
                                }
                                var14.method2219();
                            }
                        }
                    }
                }
                if (var7) {
                    if (field319 != 0) {
                        method178(class148.field2207 + class2.field18 + class2.field20 + 100 + "%" + class2.field19, true);
                    }
                    method986();
                    method2545();
                    method986();
                    Statics.field2621.method1744();
                    method986();
                    System.gc();
                    for (int var28 = 0; var28 < 4; var28++) {
                        field320[var28].method3816();
                    }
                    for (int var29 = 0; var29 < 4; var29++) {
                        for (int var30 = 0; var30 < 104; var30++) {
                            for (int var31 = 0; var31 < 104; var31++) {
                                class6.field82[var29][var30][var31] = 0;
                            }
                        }
                    }
                    method986();
                    class6.method3035();
                    int var32 = Statics.field14.length;
                    class22.method526();
                    method36(true);
                    if (!field519) {
                        for (int var33 = 0; var33 < var32; var33++) {
                            int var34 = (Statics.field1897[var33] >> 8) * 64 - Statics.field120;
                            int var35 = (Statics.field1897[var33] & 0xFF) * 64 - Statics.field124;
                            byte[] var36 = Statics.field14[var33];
                            if (var36 != null) {
                                method986();
                                class6.method2032(var36, var34, var35, Statics.field2599 * 8 - 48, Statics.field1584 * 8 - 48, field320);
                            }
                        }
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var38 = (Statics.field1897[var37] >> 8) * 64 - Statics.field120;
                            int var39 = (Statics.field1897[var37] & 0xFF) * 64 - Statics.field124;
                            byte[] var40 = Statics.field14[var37];
                            if (var40 == null && Statics.field1584 < 800) {
                                method986();
                                class6.method2857(var38, var39, 64, 64);
                            }
                        }
                        method36(true);
                        for (int var41 = 0; var41 < var32; var41++) {
                            byte[] var42 = Statics.field1907[var41];
                            if (var42 != null) {
                                int var43 = (Statics.field1897[var41] >> 8) * 64 - Statics.field120;
                                int var44 = (Statics.field1897[var41] & 0xFF) * 64 - Statics.field124;
                                method986();
                                class81 var45 = Statics.field2621;
                                class220[] var46 = field320;
                                class111 var47 = new class111(var42);
                                int var48 = -1;
                                while (true) {
                                    int var49 = var47.method2368();
                                    if (var49 == 0) {
                                        break;
                                    }
                                    var48 += var49;
                                    int var50 = 0;
                                    while (true) {
                                        int var51 = var47.method2368();
                                        if (var51 == 0) {
                                            break;
                                        }
                                        var50 += var51 - 1;
                                        int var52 = var50 & 0x3F;
                                        int var53 = var50 >> 6 & 0x3F;
                                        int var54 = var50 >> 12;
                                        int var55 = var47.method2219();
                                        int var56 = var55 >> 2;
                                        int var57 = var55 & 0x3;
                                        int var58 = var43 + var53;
                                        int var59 = var44 + var52;
                                        if (var58 > 0 && var59 > 0 && var58 < 103 && var59 < 103) {
                                            int var60 = var54;
                                            if ((class6.field82[1][var58][var59] & 0x2) == 2) {
                                                var60 = var54 - 1;
                                            }
                                            class220 var61 = null;
                                            if (var60 >= 0) {
                                                var61 = var46[var60];
                                            }
                                            class6.method3056(var54, var58, var59, var48, var57, var56, var45, var61);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field519) {
                        int var62 = 0;
                        label933: while (true) {
                            if (var62 >= 4) {
                                for (int var73 = 0; var73 < 13; var73++) {
                                    for (int var74 = 0; var74 < 13; var74++) {
                                        int var75 = field322[0][var73][var74];
                                        if (var75 == -1) {
                                            class6.method2857(var73 * 8, var74 * 8, 8, 8);
                                        }
                                    }
                                }
                                method36(true);
                                int var76 = 0;
                                while (true) {
                                    if (var76 >= 4) {
                                        break label933;
                                    }
                                    method986();
                                    for (int var77 = 0; var77 < 13; var77++) {
                                        for (int var78 = 0; var78 < 13; var78++) {
                                            int var79 = field322[var76][var77][var78];
                                            if (var79 != -1) {
                                                int var80 = var79 >> 24 & 0x3;
                                                int var81 = var79 >> 1 & 0x3;
                                                int var82 = var79 >> 14 & 0x3FF;
                                                int var83 = var79 >> 3 & 0x7FF;
                                                int var84 = (var82 / 8 << 8) + var83 / 8;
                                                for (int var85 = 0; var85 < Statics.field1897.length; var85++) {
                                                    if (Statics.field1897[var85] == var84 && Statics.field1907[var85] != null) {
                                                        class6.method2(Statics.field1907[var85], var76, var77 * 8, var78 * 8, var80, (var82 & 0x7) * 8, (var83 & 0x7) * 8, var81, Statics.field2621, field320);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var76++;
                                }
                            }
                            method986();
                            for (int var63 = 0; var63 < 13; var63++) {
                                for (int var64 = 0; var64 < 13; var64++) {
                                    boolean var65 = false;
                                    int var66 = field322[var62][var63][var64];
                                    if (var66 != -1) {
                                        int var67 = var66 >> 24 & 0x3;
                                        int var68 = var66 >> 1 & 0x3;
                                        int var69 = var66 >> 14 & 0x3FF;
                                        int var70 = var66 >> 3 & 0x7FF;
                                        int var71 = (var69 / 8 << 8) + var70 / 8;
                                        for (int var72 = 0; var72 < Statics.field1897.length; var72++) {
                                            if (Statics.field1897[var72] == var71 && Statics.field14[var72] != null) {
                                                class6.method27(Statics.field14[var72], var62, var63 * 8, var64 * 8, var67, (var69 & 0x7) * 8, (var70 & 0x7) * 8, var68, field320);
                                                var65 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var65) {
                                        class6.method142(var62, var63 * 8, var64 * 8);
                                    }
                                }
                            }
                            var62++;
                        }
                    }
                    method36(true);
                    method2545();
                    method986();
                    class81 var86 = Statics.field2621;
                    class220[] var87 = field320;
                    for (int var88 = 0; var88 < 4; var88++) {
                        for (int var89 = 0; var89 < 104; var89++) {
                            for (int var90 = 0; var90 < 104; var90++) {
                                if ((class6.field82[var88][var89][var90] & 0x1) == 1) {
                                    int var91 = var88;
                                    if ((class6.field82[1][var89][var90] & 0x2) == 2) {
                                        var91 = var88 - 1;
                                    }
                                    if (var91 >= 0) {
                                        var87[var91].method3789(var89, var90);
                                    }
                                }
                            }
                        }
                    }
                    class6.field84 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field84 < -8) {
                        class6.field84 = -8;
                    }
                    if (class6.field84 > 8) {
                        class6.field84 = 8;
                    }
                    class6.field80 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field80 < -16) {
                        class6.field80 = -16;
                    }
                    if (class6.field80 > 16) {
                        class6.field80 = 16;
                    }
                    for (int var92 = 0; var92 < 4; var92++) {
                        byte[][] var93 = Statics.field1920[var92];
                        int var94 = (int) Math.sqrt(5100.0D);
                        int var95 = var94 * 768 >> 8;
                        for (int var96 = 1; var96 < 103; var96++) {
                            for (int var97 = 1; var97 < 103; var97++) {
                                int var98 = class6.field88[var92][var97 + 1][var96] - class6.field88[var92][var97 - 1][var96];
                                int var99 = class6.field88[var92][var97][var96 + 1] - class6.field88[var92][var97][var96 - 1];
                                int var100 = (int) Math.sqrt((double) (var99 * var99 + var98 * var98 + 65536));
                                int var101 = (var98 << 8) / var100;
                                int var102 = 65536 / var100;
                                int var103 = (var99 << 8) / var100;
                                int var104 = (var103 * -50 + var101 * -50 + var102 * -10) / var95 + 96;
                                int var105 = (var93[var97][var96] >> 1) + (var93[var97][var96 + 1] >> 3) + (var93[var97][var96 - 1] >> 2) + (var93[var97 - 1][var96] >> 2) + (var93[var97 + 1][var96] >> 3);
                                Statics.field3107[var97][var96] = var104 - var105;
                            }
                        }
                        for (int var106 = 0; var106 < 104; var106++) {
                            Statics.field71[var106] = 0;
                            Statics.field183[var106] = 0;
                            Statics.field1370[var106] = 0;
                            Statics.field2015[var106] = 0;
                            Statics.field74[var106] = 0;
                        }
                        for (int var107 = -5; var107 < 109; var107++) {
                            for (int var108 = 0; var108 < 104; var108++) {
                                int var109 = var107 + 5;
                                int var10002;
                                if (var109 >= 0 && var109 < 104) {
                                    int var110 = Statics.field2622[var92][var109][var108] & 0xFF;
                                    if (var110 > 0) {
                                        class39 var111 = class39.method822(var110 - 1);
                                        Statics.field71[var108] += var111.field911;
                                        Statics.field183[var108] += var111.field912;
                                        Statics.field1370[var108] += var111.field913;
                                        Statics.field2015[var108] += var111.field914;
                                        var10002 = Statics.field74[var108]++;
                                    }
                                }
                                int var112 = var107 - 5;
                                if (var112 >= 0 && var112 < 104) {
                                    int var113 = Statics.field2622[var92][var112][var108] & 0xFF;
                                    if (var113 > 0) {
                                        class39 var114 = class39.method822(var113 - 1);
                                        Statics.field71[var108] -= var114.field911;
                                        Statics.field183[var108] -= var114.field912;
                                        Statics.field1370[var108] -= var114.field913;
                                        Statics.field2015[var108] -= var114.field914;
                                        var10002 = Statics.field74[var108]--;
                                    }
                                }
                            }
                            if (var107 >= 1 && var107 < 103) {
                                int var115 = 0;
                                int var116 = 0;
                                int var117 = 0;
                                int var118 = 0;
                                int var119 = 0;
                                for (int var120 = -5; var120 < 109; var120++) {
                                    int var121 = var120 + 5;
                                    if (var121 >= 0 && var121 < 104) {
                                        var115 += Statics.field71[var121];
                                        var116 += Statics.field183[var121];
                                        var117 += Statics.field1370[var121];
                                        var118 += Statics.field2015[var121];
                                        var119 += Statics.field74[var121];
                                    }
                                    int var122 = var120 - 5;
                                    if (var122 >= 0 && var122 < 104) {
                                        var115 -= Statics.field71[var122];
                                        var116 -= Statics.field183[var122];
                                        var117 -= Statics.field1370[var122];
                                        var118 -= Statics.field2015[var122];
                                        var119 -= Statics.field74[var122];
                                    }
                                    if (var120 >= 1 && var120 < 103 && (!field263 || (class6.field82[0][var107][var120] & 0x2) != 0 || (class6.field82[var92][var107][var120] & 0x10) == 0 && class6.method2025(var92, var107, var120) == field314)) {
                                        if (var92 < class6.field73) {
                                            class6.field73 = var92;
                                        }
                                        int var123 = Statics.field2622[var92][var107][var120] & 0xFF;
                                        int var124 = Statics.field57[var92][var107][var120] & 0xFF;
                                        if (var123 > 0 || var124 > 0) {
                                            int var125 = class6.field88[var92][var107][var120];
                                            int var126 = class6.field88[var92][var107 + 1][var120];
                                            int var127 = class6.field88[var92][var107 + 1][var120 + 1];
                                            int var128 = class6.field88[var92][var107][var120 + 1];
                                            int var129 = Statics.field3107[var107][var120];
                                            int var130 = Statics.field3107[var107 + 1][var120];
                                            int var131 = Statics.field3107[var107 + 1][var120 + 1];
                                            int var132 = Statics.field3107[var107][var120 + 1];
                                            int var133 = -1;
                                            int var134 = -1;
                                            if (var123 > 0) {
                                                int var135 = var115 * 256 / var118;
                                                int var136 = var116 / var119;
                                                int var137 = var117 / var119;
                                                var133 = class6.method135(var135, var136, var137);
                                                int var138 = class6.field84 + var135 & 0xFF;
                                                int var139 = class6.field80 + var137;
                                                if (var139 < 0) {
                                                    var139 = 0;
                                                } else if (var139 > 255) {
                                                    var139 = 255;
                                                }
                                                var134 = class6.method135(var138, var136, var139);
                                            }
                                            if (var92 > 0) {
                                                boolean var140 = true;
                                                if (var123 == 0 && Statics.field75[var92][var107][var120] != 0) {
                                                    var140 = false;
                                                }
                                                if (var124 > 0 && !class43.method164(var124 - 1).field985) {
                                                    var140 = false;
                                                }
                                                if (var140 && var125 == var126 && var125 == var127 && var125 == var128) {
                                                    Statics.field1845[var92][var107][var120] |= 0x924;
                                                }
                                            }
                                            int var141 = 0;
                                            if (var134 != -1) {
                                                var141 = class86.field1489[class6.method1404(var134, 96)];
                                            }
                                            if (var124 == 0) {
                                                var86.method1674(var92, var107, var120, 0, 0, -1, var125, var126, var127, var128, class6.method1404(var133, var129), class6.method1404(var133, var130), class6.method1404(var133, var131), class6.method1404(var133, var132), 0, 0, 0, 0, var141, 0);
                                            } else {
                                                int var142 = Statics.field75[var92][var107][var120] + 1;
                                                byte var143 = Statics.field3021[var92][var107][var120];
                                                class43 var144 = class43.method164(var124 - 1);
                                                int var145 = var144.field982;
                                                int var146;
                                                int var147;
                                                if (var145 >= 0) {
                                                    var146 = Statics.field1498.method1919(var145);
                                                    var147 = -1;
                                                } else if (var144.field983 == 16711935) {
                                                    var147 = -2;
                                                    var145 = -1;
                                                    var146 = -2;
                                                } else {
                                                    var147 = class6.method135(var144.field987, var144.field988, var144.field986);
                                                    int var148 = class6.field84 + var144.field987 & 0xFF;
                                                    int var149 = class6.field80 + var144.field986;
                                                    if (var149 < 0) {
                                                        var149 = 0;
                                                    } else if (var149 > 255) {
                                                        var149 = 255;
                                                    }
                                                    var146 = class6.method135(var148, var144.field988, var149);
                                                }
                                                int var150 = 0;
                                                if (var146 != -2) {
                                                    var150 = class86.field1489[class6.method833(var146, 96)];
                                                }
                                                if (var144.field993 != -1) {
                                                    int var151 = class6.field84 + var144.field992 & 0xFF;
                                                    int var152 = class6.field80 + var144.field990;
                                                    if (var152 < 0) {
                                                        var152 = 0;
                                                    } else if (var152 > 255) {
                                                        var152 = 255;
                                                    }
                                                    int var153 = class6.method135(var151, var144.field991, var152);
                                                    var150 = class86.field1489[class6.method833(var153, 96)];
                                                }
                                                var86.method1674(var92, var107, var120, var142, var143, var145, var125, var126, var127, var128, class6.method1404(var133, var129), class6.method1404(var133, var130), class6.method1404(var133, var131), class6.method1404(var133, var132), class6.method833(var147, var129), class6.method833(var147, var130), class6.method833(var147, var131), class6.method833(var147, var132), var141, var150);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var154 = 1; var154 < 103; var154++) {
                            for (int var155 = 1; var155 < 103; var155++) {
                                var86.method1815(var92, var155, var154, class6.method2025(var92, var155, var154));
                            }
                        }
                        Statics.field2622[var92] = (byte[][]) null;
                        Statics.field57[var92] = (byte[][]) null;
                        Statics.field75[var92] = (byte[][]) null;
                        Statics.field3021[var92] = (byte[][]) null;
                        Statics.field1920[var92] = (byte[][]) null;
                    }
                    var86.method1682(-50, -10, -50);
                    for (int var156 = 0; var156 < 104; var156++) {
                        for (int var157 = 0; var157 < 104; var157++) {
                            if ((class6.field82[1][var156][var157] & 0x2) == 2) {
                                var86.method1776(var156, var157);
                            }
                        }
                    }
                    int var158 = 1;
                    int var159 = 2;
                    int var160 = 4;
                    for (int var161 = 0; var161 < 4; var161++) {
                        if (var161 > 0) {
                            var158 <<= 0x3;
                            var159 <<= 0x3;
                            var160 <<= 0x3;
                        }
                        for (int var162 = 0; var162 <= var161; var162++) {
                            for (int var163 = 0; var163 <= 104; var163++) {
                                for (int var164 = 0; var164 <= 104; var164++) {
                                    if ((Statics.field1845[var162][var164][var163] & var158) != 0) {
                                        int var165 = var163;
                                        int var166 = var163;
                                        int var167 = var162;
                                        int var168 = var162;
                                        while (var165 > 0 && (Statics.field1845[var162][var164][var165 - 1] & var158) != 0) {
                                            var165--;
                                        }
                                        while (var166 < 104 && (Statics.field1845[var162][var164][var166 + 1] & var158) != 0) {
                                            var166++;
                                        }
                                        label623: while (var167 > 0) {
                                            for (int var169 = var165; var169 <= var166; var169++) {
                                                if ((Statics.field1845[var167 - 1][var164][var169] & var158) == 0) {
                                                    break label623;
                                                }
                                            }
                                            var167--;
                                        }
                                        label612: while (var168 < var161) {
                                            for (int var170 = var165; var170 <= var166; var170++) {
                                                if ((Statics.field1845[var168 + 1][var164][var170] & var158) == 0) {
                                                    break label612;
                                                }
                                            }
                                            var168++;
                                        }
                                        int var171 = (var168 + 1 - var167) * (var166 - var165 + 1);
                                        if (var171 >= 8) {
                                            short var172 = 240;
                                            int var173 = class6.field88[var168][var164][var165] - var172;
                                            int var174 = class6.field88[var167][var164][var165];
                                            class81.method1672(var161, 1, var164 * 128, var164 * 128, var165 * 128, var166 * 128 + 128, var173, var174);
                                            for (int var175 = var167; var175 <= var168; var175++) {
                                                for (int var176 = var165; var176 <= var166; var176++) {
                                                    Statics.field1845[var175][var164][var176] &= ~var158;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1845[var162][var164][var163] & var159) != 0) {
                                        int var177 = var164;
                                        int var178 = var164;
                                        int var179 = var162;
                                        int var180 = var162;
                                        while (var177 > 0 && (Statics.field1845[var162][var177 - 1][var163] & var159) != 0) {
                                            var177--;
                                        }
                                        while (var178 < 104 && (Statics.field1845[var162][var178 + 1][var163] & var159) != 0) {
                                            var178++;
                                        }
                                        label676: while (var179 > 0) {
                                            for (int var181 = var177; var181 <= var178; var181++) {
                                                if ((Statics.field1845[var179 - 1][var181][var163] & var159) == 0) {
                                                    break label676;
                                                }
                                            }
                                            var179--;
                                        }
                                        label665: while (var180 < var161) {
                                            for (int var182 = var177; var182 <= var178; var182++) {
                                                if ((Statics.field1845[var180 + 1][var182][var163] & var159) == 0) {
                                                    break label665;
                                                }
                                            }
                                            var180++;
                                        }
                                        int var183 = (var180 + 1 - var179) * (var178 - var177 + 1);
                                        if (var183 >= 8) {
                                            short var184 = 240;
                                            int var185 = class6.field88[var180][var177][var163] - var184;
                                            int var186 = class6.field88[var179][var177][var163];
                                            class81.method1672(var161, 2, var177 * 128, var178 * 128 + 128, var163 * 128, var163 * 128, var185, var186);
                                            for (int var187 = var179; var187 <= var180; var187++) {
                                                for (int var188 = var177; var188 <= var178; var188++) {
                                                    Statics.field1845[var187][var188][var163] &= ~var159;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1845[var162][var164][var163] & var160) != 0) {
                                        int var189 = var164;
                                        int var190 = var164;
                                        int var191 = var163;
                                        int var192 = var163;
                                        while (var191 > 0 && (Statics.field1845[var162][var164][var191 - 1] & var160) != 0) {
                                            var191--;
                                        }
                                        while (var192 < 104 && (Statics.field1845[var162][var164][var192 + 1] & var160) != 0) {
                                            var192++;
                                        }
                                        label729: while (var189 > 0) {
                                            for (int var193 = var191; var193 <= var192; var193++) {
                                                if ((Statics.field1845[var162][var189 - 1][var193] & var160) == 0) {
                                                    break label729;
                                                }
                                            }
                                            var189--;
                                        }
                                        label718: while (var190 < 104) {
                                            for (int var194 = var191; var194 <= var192; var194++) {
                                                if ((Statics.field1845[var162][var190 + 1][var194] & var160) == 0) {
                                                    break label718;
                                                }
                                            }
                                            var190++;
                                        }
                                        if ((var190 - var189 + 1) * (var192 - var191 + 1) >= 4) {
                                            int var195 = class6.field88[var162][var189][var191];
                                            class81.method1672(var161, 4, var189 * 128, var190 * 128 + 128, var191 * 128, var192 * 128 + 128, var195, var195);
                                            for (int var196 = var189; var196 <= var190; var196++) {
                                                for (int var197 = var191; var197 <= var192; var197++) {
                                                    Statics.field1845[var162][var196][var197] &= ~var160;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method36(true);
                    int var198 = class6.field73;
                    if (var198 > Statics.field1086) {
                        var198 = Statics.field1086;
                    }
                    if (var198 < Statics.field1086 - 1) {
                        int var199 = Statics.field1086 - 1;
                    }
                    if (field263) {
                        Statics.field2621.method1761(class6.field73);
                    } else {
                        Statics.field2621.method1761(0);
                    }
                    for (int var200 = 0; var200 < 104; var200++) {
                        for (int var201 = 0; var201 < 104; var201++) {
                            method140(var200, var201);
                        }
                    }
                    method986();
                    method547();
                    class38.field877.method3404();
                    if (Statics.field732 != null) {
                        field302.method2477(136);
                        field302.method2369(1057001181);
                    }
                    if (!field519) {
                        int var202 = (Statics.field2599 - 6) / 8;
                        int var203 = (Statics.field2599 + 6) / 8;
                        int var204 = (Statics.field1584 - 6) / 8;
                        int var205 = (Statics.field1584 + 6) / 8;
                        for (int var206 = var202 - 1; var206 <= var203 + 1; var206++) {
                            for (int var207 = var204 - 1; var207 <= var205 + 1; var207++) {
                                if (var206 < var202 || var206 > var203 || var207 < var204 || var207 > var205) {
                                    Statics.field1087.method2960("m" + var206 + "_" + var207);
                                    Statics.field1087.method2960("l" + var206 + "_" + var207);
                                }
                            }
                        }
                    }
                    method2543(30);
                    method986();
                    class6.method538();
                    field302.method2477(142);
                    class136.method26();
                } else {
                    field319 = 2;
                }
            } else {
                field319 = 1;
            }
        }
        if (field268 == 30) {
            method172();
        } else if (field268 == 40 || field268 == 45) {
            method2144();
        }
    }

    @ObfuscatedName("client.y(I)V")
    public final void method436() {
        boolean var1 = class174.method1405();
        if (var1 && field504 && Statics.field602 != null) {
            Statics.field602.method1075();
        }
        if (field268 == 10 || field268 == 20 || field268 == 30) {
            if (field408 != 0L && class107.method2661() > field408) {
                int var2 = method112();
                field408 = 0L;
                if (var2 >= 2) {
                    field340 = true;
                } else {
                    field340 = false;
                }
                method2546();
                if (field268 >= 25) {
                    field302.method2477(217);
                    field302.method2204(method112());
                    field302.method2205(Statics.field3047);
                    field302.method2205(Statics.field187);
                }
                field2088 = true;
            } else if (field2097) {
                Canvas var3 = Statics.field594;
                var3.removeKeyListener(class129.field1994);
                var3.removeFocusListener(class129.field1994);
                class129.field2001 = -1;
                class132.method2533(Statics.field594);
                if (Statics.field1274 != null) {
                    Statics.field1274.method2562(Statics.field594);
                }
                Statics.field254.method2783();
                Statics.field594.setBackground(Color.black);
                Canvas var4 = Statics.field594;
                var4.setFocusTraversalKeysEnabled(false);
                var4.addKeyListener(class129.field1994);
                var4.addFocusListener(class129.field1994);
                Canvas var5 = Statics.field594;
                var5.addMouseListener(class132.field2043);
                var5.addMouseMotionListener(class132.field2043);
                var5.addFocusListener(class132.field2043);
                if (Statics.field1274 != null) {
                    Statics.field1274.method2564(Statics.field594);
                }
                if (field423 != -1) {
                    method1108(false);
                }
                field2096 = true;
            }
        }
        Dimension var6 = this.method2742();
        if (Statics.field1857 != var6.width || Statics.field936 != var6.height || field2096) {
            method2546();
            field408 = class107.method2661() + 500L;
            field2096 = false;
        }
        boolean var7 = false;
        if (field2088) {
            field2088 = false;
            var7 = true;
            for (int var8 = 0; var8 < 100; var8++) {
                field486[var8] = true;
            }
        }
        if (var7) {
            Statics.method1107();
        }
        if (field268 == 0) {
            int var9 = class30.field688;
            String var10 = class30.field691;
            Color var11 = null;
            try {
                Graphics var12 = Statics.field594.getGraphics();
                if (Statics.field998 == null) {
                    Statics.field998 = new Font("Helvetica", 1, 13);
                    Statics.field1678 = Statics.field594.getFontMetrics(Statics.field998);
                }
                if (var7) {
                    var12.setColor(Color.black);
                    var12.fillRect(0, 0, Statics.field3047, Statics.field187);
                }
                if (var11 == null) {
                    var11 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field200 == null) {
                        Statics.field200 = Statics.field594.createImage(304, 34);
                    }
                    Graphics var13 = Statics.field200.getGraphics();
                    var13.setColor(var11);
                    var13.drawRect(0, 0, 303, 33);
                    var13.fillRect(2, 2, var9 * 3, 30);
                    var13.setColor(Color.black);
                    var13.drawRect(1, 1, 301, 31);
                    var13.fillRect(var9 * 3 + 2, 2, 300 - var9 * 3, 30);
                    var13.setFont(Statics.field998);
                    var13.setColor(Color.white);
                    var13.drawString(var10, (304 - Statics.field1678.stringWidth(var10)) / 2, 22);
                    var12.drawImage(Statics.field200, Statics.field3047 / 2 - 152, Statics.field187 / 2 - 18, (ImageObserver) null);
                } catch (Exception var26) {
                    int var15 = Statics.field3047 / 2 - 152;
                    int var16 = Statics.field187 / 2 - 18;
                    var12.setColor(var11);
                    var12.drawRect(var15, var16, 303, 33);
                    var12.fillRect(var15 + 2, var16 + 2, var9 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(var15 + 1, var16 + 1, 301, 31);
                    var12.fillRect(var9 * 3 + var15 + 2, var16 + 2, 300 - var9 * 3, 30);
                    var12.setFont(Statics.field998);
                    var12.setColor(Color.white);
                    var12.drawString(var10, var15 + (304 - Statics.field1678.stringWidth(var10)) / 2, var16 + 22);
                }
            } catch (Exception var27) {
                Statics.field594.repaint();
            }
        } else if (field268 == 5) {
            class30.method60(Statics.field250, Statics.field3020, Statics.field1540, var7);
        } else if (field268 == 10 || field268 == 11) {
            class30.method60(Statics.field250, Statics.field3020, Statics.field1540, var7);
        } else if (field268 == 20) {
            class30.method60(Statics.field250, Statics.field3020, Statics.field1540, var7);
        } else if (field268 == 25) {
            if (field319 == 1) {
                if (field315 > field443) {
                    field443 = field315;
                }
                int var18 = (field443 * 50 - field315 * 50) / field443;
                method178(class148.field2207 + class2.field18 + class2.field20 + var18 + "%" + class2.field19, false);
            } else if (field319 == 2) {
                if (field456 > field318) {
                    field318 = field456;
                }
                int var19 = (field318 * 50 - field456 * 50) / field318 + 50;
                method178(class148.field2207 + class2.field18 + class2.field20 + var19 + "%" + class2.field19, false);
            } else {
                method178(class148.field2207, false);
            }
        } else if (field268 == 30) {
            method544();
        } else if (field268 == 40) {
            method178(class148.field2208 + class2.field18 + class148.field2209, false);
        } else if (field268 == 45) {
            method178(class148.field2356, false);
        }
        if (field268 == 30 && field477 == 0 && !var7) {
            try {
                Graphics var20 = Statics.field594.getGraphics();
                for (int var21 = 0; var21 < field468; var21++) {
                    if (field471[var21]) {
                        Statics.field816.method1409(var20, field316[var21], field426[var21], field475[var21], field493[var21]);
                        field471[var21] = false;
                    }
                }
            } catch (Exception var29) {
                Statics.field594.repaint();
            }
        } else if (field268 > 0) {
            try {
                Graphics var23 = Statics.field594.getGraphics();
                Statics.field816.method1408(var23, 0, 0);
                for (int var24 = 0; var24 < field468; var24++) {
                    field471[var24] = false;
                }
            } catch (Exception var28) {
                Statics.field594.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method188() {
        if (Statics.field1928 != null) {
            Statics.field1928.field181 = false;
        }
        Statics.field1928 = null;
        if (Statics.field1863 != null) {
            Statics.field1863.method2708();
            Statics.field1863 = null;
        }
        class129.method42();
        if (class132.field2043 != null) {
            class132 var1 = class132.field2043;
            synchronized (class132.field2043) {
                class132.field2043 = null;
            }
        }
        Statics.field1274 = null;
        if (Statics.field602 != null) {
            Statics.field602.method1074();
        }
        if (Statics.field185 != null) {
            Statics.field185.method1074();
        }
        if (Statics.field2609 != null) {
            Statics.field2609.method2708();
        }
        Object var3 = class161.field2593;
        synchronized (class161.field2593) {
            if (class161.field2594 != 0) {
                class161.field2594 = 1;
                try {
                    class161.field2593.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class141.method675();
    }

    @ObfuscatedName("de.c(II)V")
    public static void method2543(int arg0) {
        if (field268 == arg0) {
            return;
        }
        if (field268 == 0) {
            class136.method831();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field294 = 0;
            field516 = 0;
            field329 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field207 != null) {
            Statics.field207.method2708();
            Statics.field207 = null;
        }
        if (field268 == 25) {
            field319 = 0;
            field315 = 0;
            field443 = 1;
            field456 = 0;
            field318 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method2511(Statics.field594, Statics.field1523, Statics.field2964, true, 0);
        } else if (arg0 == 20) {
            class30.method2511(Statics.field594, Statics.field1523, Statics.field2964, true, field268 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method2511(Statics.field594, Statics.field1523, Statics.field2964, false, 4);
        } else {
            class30.method3121();
        }
        field268 = arg0;
    }

    @ObfuscatedName("client.j(I)V")
    public void method341() {
        if (field268 != 1000) {
            boolean var1 = class162.method2741();
            if (!var1) {
                this.method190();
            }
        }
    }

    @ObfuscatedName("client.m(I)V")
    public void method190() {
        if (class162.field2616 >= 4) {
            this.method2740("js5crc");
            field268 = 1000;
            return;
        }
        if (class162.field2617 >= 4) {
            if (field268 <= 5) {
                this.method2740("js5io");
                field268 = 1000;
                return;
            }
            field290 = 3000;
            class162.field2617 = 3;
        }
        if (--field290 + 1 > 0) {
            return;
        }
        try {
            if (field462 == 0) {
                Statics.field548 = Statics.field1007.method2606(Statics.field1306, Statics.field2033);
                field462++;
            }
            if (field462 == 1) {
                if (Statics.field548.field2105 == 2) {
                    this.method191(-1);
                    return;
                }
                if (Statics.field548.field2105 == 1) {
                    field462++;
                }
            }
            if (field462 == 2) {
                Statics.field1945 = new class135((Socket) Statics.field548.field2101, Statics.field1007);
                class111 var1 = new class111(5);
                var1.method2204(15);
                var1.method2369(81);
                Statics.field1945.method2717(var1.field1860, 0, 5);
                field462++;
                Statics.field229 = class107.method2661();
            }
            if (field462 == 3) {
                if (field268 <= 5 || Statics.field1945.method2704() > 0) {
                    int var2 = Statics.field1945.method2705();
                    if (var2 != 0) {
                        this.method191(var2);
                        return;
                    }
                    field462++;
                } else if (class107.method2661() - Statics.field229 > 30000L) {
                    this.method191(-2);
                    return;
                }
            }
            if (field462 == 4) {
                class162.method660(Statics.field1945, field268 > 20);
                Statics.field548 = null;
                Statics.field1945 = null;
                field462 = 0;
                field293 = 0;
            }
        } catch (IOException var4) {
            this.method191(-3);
        }
    }

    @ObfuscatedName("client.a(II)V")
    public void method191(int arg0) {
        Statics.field548 = null;
        Statics.field1945 = null;
        field462 = 0;
        if (Statics.field2033 == Statics.field1878) {
            Statics.field2033 = Statics.field230;
        } else {
            Statics.field2033 = Statics.field1878;
        }
        field293++;
        if (field293 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field268 <= 5) {
                this.method2740("js5connect_full");
                field268 = 1000;
            } else {
                field290 = 3000;
            }
        } else if (field293 >= 2 && arg0 == 6) {
            this.method2740("js5connect_outofdate");
            field268 = 1000;
        } else if (field293 >= 4) {
            if (field268 <= 5) {
                this.method2740("js5connect");
                field268 = 1000;
            } else {
                field290 = 3000;
            }
        }
    }

    @ObfuscatedName("dq.f(S)V")
    public static void method2470() {
        if (field288 == 0) {
            Statics.field2621 = new class81(4, 104, 104, class6.field88);
            for (int var0 = 0; var0 < 4; var0++) {
                field320[var0] = new class220(104, 104);
            }
            Statics.field13 = new class74(512, 512);
            class30.field691 = class148.field2412;
            class30.field688 = 5;
            field288 = 20;
        } else if (field288 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1501[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1708(var1, 500, 800, 512, 334);
            class30.field691 = class148.field2211;
            class30.field688 = 10;
            field288 = 30;
        } else if (field288 == 30) {
            Statics.field2797 = method10(0, false, true, true);
            Statics.field994 = method10(1, false, true, true);
            Statics.field481 = method10(2, true, false, true);
            Statics.field157 = method10(3, false, true, true);
            Statics.field996 = method10(4, false, true, true);
            Statics.field1087 = method10(5, true, true, true);
            Statics.field1311 = method10(6, true, true, false);
            Statics.field2524 = method10(7, false, true, true);
            Statics.field2964 = method10(8, false, true, true);
            Statics.field348 = method10(9, false, true, true);
            Statics.field1523 = method10(10, false, true, true);
            Statics.field2166 = method10(11, false, true, true);
            Statics.field86 = method10(12, false, true, true);
            Statics.field1534 = method10(13, true, false, true);
            Statics.field711 = method10(14, false, true, false);
            Statics.field211 = method10(15, false, true, true);
            class30.field691 = class148.field2212;
            class30.field688 = 20;
            field288 = 40;
        } else if (field288 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2797.method3016() * 4 / 100;
            int var8 = var7 + Statics.field994.method3016() * 4 / 100;
            int var9 = var8 + Statics.field481.method3016() * 2 / 100;
            int var10 = var9 + Statics.field157.method3016() * 2 / 100;
            int var11 = var10 + Statics.field996.method3016() * 6 / 100;
            int var12 = var11 + Statics.field1087.method3016() * 4 / 100;
            int var13 = var12 + Statics.field1311.method3016() * 2 / 100;
            int var14 = var13 + Statics.field2524.method3016() * 60 / 100;
            int var15 = var14 + Statics.field2964.method3016() * 2 / 100;
            int var16 = var15 + Statics.field348.method3016() * 2 / 100;
            int var17 = var16 + Statics.field1523.method3016() * 2 / 100;
            int var18 = var17 + Statics.field2166.method3016() * 2 / 100;
            int var19 = var18 + Statics.field86.method3016() * 2 / 100;
            int var20 = var19 + Statics.field1534.method3016() * 2 / 100;
            int var21 = var20 + Statics.field711.method3016() * 2 / 100;
            int var22 = var21 + Statics.field211.method3016() * 2 / 100;
            if (var22 == 100) {
                class30.field691 = class148.field2214;
                class30.field688 = 30;
                field288 = 45;
            } else {
                if (var22 != 0) {
                    class30.field691 = class148.field2213 + var22 + "%";
                }
                class30.field688 = 30;
            }
        } else if (field288 == 45) {
            class52.method32(22050, !field263, 2);
            class175 var23 = new class175();
            var23.method3279(9, 128);
            Statics.field602 = class52.method1939(Statics.field1007, Statics.field594, 0, 22050);
            Statics.field602.method1078(var23);
            class174.method2651(Statics.field211, Statics.field711, Statics.field996, var23);
            Statics.field185 = class52.method1939(Statics.field1007, Statics.field594, 1, 2048);
            Statics.field2120 = new class51();
            Statics.field185.method1078(Statics.field2120);
            Statics.field2529 = new class70(22050, Statics.field1685);
            class30.field691 = class148.field2215;
            class30.field688 = 35;
            field288 = 50;
        } else if (field288 == 50) {
            int var24 = 0;
            if (Statics.field3020 == null) {
                class159 var25 = Statics.field2964;
                class159 var26 = Statics.field1534;
                int var27 = var25.method3008("p11_full");
                int var28 = var25.method2956(var27, "");
                class215 var29;
                if (class72.method2037(var25, var27, var28)) {
                    byte[] var30 = var26.method2940(var27, var28);
                    class215 var31;
                    if (var30 == null) {
                        var31 = null;
                    } else {
                        class215 var32 = new class215(var30, Statics.field1308, Statics.field637, Statics.field1318, Statics.field1313, Statics.field1934, Statics.field1876);
                        Statics.method139();
                        var31 = var32;
                    }
                    var29 = var31;
                } else {
                    var29 = null;
                }
                Statics.field3020 = var29;
            } else {
                var24++;
            }
            if (Statics.field1540 == null) {
                class159 var34 = Statics.field2964;
                class159 var35 = Statics.field1534;
                int var36 = var34.method3008("p12_full");
                int var37 = var34.method2956(var36, "");
                class215 var38;
                if (class72.method2037(var34, var36, var37)) {
                    byte[] var39 = var35.method2940(var36, var37);
                    class215 var40;
                    if (var39 == null) {
                        var40 = null;
                    } else {
                        class215 var41 = new class215(var39, Statics.field1308, Statics.field637, Statics.field1318, Statics.field1313, Statics.field1934, Statics.field1876);
                        Statics.method139();
                        var40 = var41;
                    }
                    var38 = var40;
                } else {
                    var38 = null;
                }
                Statics.field1540 = var38;
            } else {
                var24++;
            }
            if (Statics.field250 == null) {
                class159 var43 = Statics.field2964;
                class159 var44 = Statics.field1534;
                int var45 = var43.method3008("b12_full");
                int var46 = var43.method2956(var45, "");
                class215 var47;
                if (class72.method2037(var43, var45, var46)) {
                    byte[] var48 = var44.method2940(var45, var46);
                    class215 var49;
                    if (var48 == null) {
                        var49 = null;
                    } else {
                        class215 var50 = new class215(var48, Statics.field1308, Statics.field637, Statics.field1318, Statics.field1313, Statics.field1934, Statics.field1876);
                        Statics.method139();
                        var49 = var50;
                    }
                    var47 = var49;
                } else {
                    var47 = null;
                }
                Statics.field250 = var47;
            } else {
                var24++;
            }
            if (var24 < 3) {
                class30.field691 = class148.field2373 + var24 * 100 / 3 + "%";
                class30.field688 = 40;
            } else {
                Statics.field2572 = new class151(true);
                class30.field691 = class148.field2322;
                class30.field688 = 40;
                field288 = 60;
            }
        } else if (field288 == 60) {
            class159 var52 = Statics.field1523;
            class159 var53 = Statics.field2964;
            int var54 = 0;
            if (var52.method2958("title.jpg", "")) {
                var54++;
            }
            if (var53.method2958("logo", "")) {
                var54++;
            }
            if (var53.method2958("titlebox", "")) {
                var54++;
            }
            if (var53.method2958("titlebutton", "")) {
                var54++;
            }
            if (var53.method2958("runes", "")) {
                var54++;
            }
            if (var53.method2958("title_mute", "")) {
                var54++;
            }
            if (var53.method3001("options_radio_buttons,0")) {
                var54++;
            }
            if (var53.method3001("options_radio_buttons,2")) {
                var54++;
            }
            var53.method2958("sl_back", "");
            var53.method2958("sl_flags", "");
            var53.method2958("sl_arrows", "");
            var53.method2958("sl_stars", "");
            var53.method2958("sl_button", "");
            byte var57 = 8;
            if (var54 < var57) {
                class30.field691 = class148.field2218 + var54 * 100 / var57 + "%";
                class30.field688 = 50;
            } else {
                class30.field691 = class148.field2219;
                class30.field688 = 50;
                method2543(5);
                field288 = 70;
            }
        } else if (field288 == 70) {
            if (Statics.field481.method2944()) {
                class43.method2030(Statics.field481);
                class39.method814(Statics.field481);
                class159 var59 = Statics.field481;
                class159 var60 = Statics.field2524;
                Statics.field976 = var59;
                Statics.field967 = var60;
                Statics.field973 = Statics.field976.method2950(3);
                class38.method2840(Statics.field481, Statics.field2524, field263);
                class37.method2565(Statics.field481, Statics.field2524);
                class159 var61 = Statics.field481;
                class159 var62 = Statics.field2524;
                boolean var63 = field407;
                class215 var64 = Statics.field3020;
                Statics.field1031 = var61;
                Statics.field1032 = var62;
                Statics.field1834 = var63;
                Statics.field1475 = Statics.field1031.method2950(10);
                Statics.field1055 = var64;
                class40.method137(Statics.field481, Statics.field2797, Statics.field994);
                class159 var65 = Statics.field481;
                class159 var66 = Statics.field2524;
                Statics.field946 = var65;
                Statics.field1830 = var66;
                class159 var67 = Statics.field481;
                Statics.field1003 = var67;
                class48.method181(Statics.field481);
                class164.method1932(Statics.field157, Statics.field2524, Statics.field2964, Statics.field1534);
                class159 var68 = Statics.field481;
                Statics.field1021 = var68;
                class45.method579(Statics.field481);
                class30.field691 = class148.field2221;
                class30.field688 = 60;
                field288 = 80;
            } else {
                class30.field691 = class148.field2220 + Statics.field481.method3022() + "%";
                class30.field688 = 60;
            }
        } else if (field288 == 80) {
            int var69 = 0;
            if (Statics.field1375 == null) {
                Statics.field1375 = class72.method3054(Statics.field2964, "compass", "");
            } else {
                var69++;
            }
            if (Statics.field337 == null) {
                Statics.field337 = class72.method3054(Statics.field2964, "mapedge", "");
            } else {
                var69++;
            }
            if (Statics.field223 == null) {
                Statics.field223 = class72.method2690(Statics.field2964, "mapscene", "");
            } else {
                var69++;
            }
            if (Statics.field17 == null) {
                Statics.field17 = class72.method1471(Statics.field2964, "mapfunction", "");
            } else {
                var69++;
            }
            if (Statics.field42 == null) {
                Statics.field42 = class72.method1471(Statics.field2964, "hitmarks", "");
            } else {
                var69++;
            }
            if (Statics.field251 == null) {
                Statics.field251 = class72.method1471(Statics.field2964, "headicons_pk", "");
            } else {
                var69++;
            }
            if (Statics.field1843 == null) {
                Statics.field1843 = class72.method1471(Statics.field2964, "headicons_prayer", "");
            } else {
                var69++;
            }
            if (Statics.field150 == null) {
                Statics.field150 = class72.method1471(Statics.field2964, "headicons_hint", "");
            } else {
                var69++;
            }
            if (Statics.field1138 == null) {
                Statics.field1138 = class72.method1471(Statics.field2964, "mapmarker", "");
            } else {
                var69++;
            }
            if (Statics.field458 == null) {
                Statics.field458 = class72.method1471(Statics.field2964, "cross", "");
            } else {
                var69++;
            }
            if (Statics.field1139 == null) {
                Statics.field1139 = class72.method1471(Statics.field2964, "mapdots", "");
            } else {
                var69++;
            }
            if (Statics.field1307 == null) {
                Statics.field1307 = class72.method2690(Statics.field2964, "scrollbar", "");
            } else {
                var69++;
            }
            if (Statics.field2179 == null) {
                Statics.field2179 = class72.method2690(Statics.field2964, "mod_icons", "");
            } else {
                var69++;
            }
            if (var69 < 13) {
                class30.field691 = class148.field2310 + var69 * 100 / 13 + "%";
                class30.field688 = 70;
            } else {
                Statics.field3096 = Statics.field2179;
                Statics.field337.method1488();
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 41.0D) - 20;
                for (int var74 = 0; var74 < Statics.field17.length; var74++) {
                    Statics.field17[var74].method1487(var70 + var73, var71 + var73, var72 + var73);
                }
                Statics.field223[0].method1646(var70 + var73, var71 + var73, var72 + var73);
                class30.field691 = class148.field2223;
                class30.field688 = 70;
                field288 = 90;
            }
        } else if (field288 == 90) {
            if (Statics.field348.method2944()) {
                class90 var75 = new class90(Statics.field348, Statics.field2964, 20, 0.8D, field263 ? 64 : 128);
                class86.method1901(var75);
                class86.method1854(0.8D);
                class30.field691 = class148.field2434;
                class30.field688 = 90;
                field288 = 110;
            } else {
                class30.field691 = class148.field2224 + Statics.field348.method3022() + "%";
                class30.field688 = 90;
            }
        } else if (field288 == 110) {
            Statics.field1928 = new class13();
            Statics.field1007.method2607(Statics.field1928, 10);
            class30.field691 = class148.field2226;
            class30.field688 = 94;
            field288 = 120;
        } else if (field288 == 120) {
            if (Statics.field1523.method2958("huffman", "")) {
                class105 var76 = new class105(Statics.field1523.method2951("huffman", ""));
                Statics.field3082 = var76;
                class30.field691 = class148.field2426;
                class30.field688 = 96;
                field288 = 130;
            } else {
                class30.field691 = class148.field2414 + "%";
                class30.field688 = 96;
            }
        } else if (field288 == 130) {
            if (!Statics.field157.method2944()) {
                class30.field691 = class148.field2229 + Statics.field157.method3022() * 4 / 5 + "%";
                class30.field688 = 100;
            } else if (!Statics.field86.method2944()) {
                class30.field691 = class148.field2229 + (80 + Statics.field86.method3022() / 6) + "%";
                class30.field688 = 100;
            } else if (Statics.field1534.method2944()) {
                class30.field691 = class148.field2230;
                class30.field688 = 100;
                field288 = 140;
            } else {
                class30.field691 = class148.field2229 + (96 + Statics.field1534.method3022() / 20) + "%";
                class30.field688 = 100;
            }
        } else if (field288 == 140) {
            method2543(10);
        }
    }

    @ObfuscatedName("l.i(IZZZB)Lfc;")
    public static class159 method10(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2126 != null) {
            var4 = new class126(arg0, class141.field2126, Statics.field1027[arg0], 1000000);
        }
        return new class159(var4, Statics.field51, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dl.n(I)V")
    public static final void method2144() {
        try {
            if (field294 == 0) {
                if (Statics.field1863 != null) {
                    Statics.field1863.method2708();
                    Statics.field1863 = null;
                }
                Statics.field910 = null;
                field313 = false;
                field516 = 0;
                field294 = 1;
            }
            if (field294 == 1) {
                if (Statics.field910 == null) {
                    Statics.field910 = Statics.field1007.method2606(Statics.field1306, Statics.field2033);
                }
                if (Statics.field910.field2105 == 2) {
                    throw new IOException();
                }
                if (Statics.field910.field2105 == 1) {
                    Statics.field1863 = new class135((Socket) Statics.field910.field2101, Statics.field1007);
                    Statics.field910 = null;
                    field294 = 2;
                }
            }
            if (field294 == 2) {
                field302.field1861 = 0;
                field302.method2204(14);
                Statics.field1863.method2717(field302.field1860, 0, 1);
                field304.field1861 = 0;
                field294 = 3;
            }
            if (field294 == 3) {
                if (Statics.field602 != null) {
                    Statics.field602.method1070();
                }
                if (Statics.field185 != null) {
                    Statics.field185.method1070();
                }
                int var0 = Statics.field1863.method2705();
                if (Statics.field602 != null) {
                    Statics.field602.method1070();
                }
                if (Statics.field185 != null) {
                    Statics.field185.method1070();
                }
                if (var0 != 0) {
                    Statics.method2692(var0);
                    return;
                }
                field304.field1861 = 0;
                field294 = 5;
            }
            if (field294 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field302.field1861 = 0;
                field302.method2204(1);
                field302.method2204(class30.field686.method525());
                field302.method2369(var1[0]);
                field302.method2369(var1[1]);
                field302.method2369(var1[2]);
                field302.method2369(var1[3]);
                switch(class30.field686.field2488) {
                    case 0:
                    case 1:
                        field302.method2206(Statics.field699);
                        field302.field1861 += 5;
                        break;
                    case 2:
                        field302.field1861 += 8;
                        break;
                    case 3:
                        field302.method2369((Integer) Statics.field1877.field131.get(class154.method2481(class30.field696)));
                        field302.field1861 += 4;
                }
                field302.method2269(class30.field697);
                field302.method2239(class5.field67, class5.field65);
                field303.field1861 = 0;
                if (field268 == 40) {
                    field303.method2204(18);
                } else {
                    field303.method2204(16);
                }
                field303.method2205(0);
                int var2 = field303.field1861;
                field303.method2369(81);
                field303.method2213(field302.field1860, 0, field302.field1861);
                int var3 = field303.field1861;
                field303.method2269(class30.field696);
                field303.method2204((field340 ? 1 : 0) << 1 | (field263 ? 1 : 0));
                field303.method2205(Statics.field3047);
                field303.method2205(Statics.field187);
                class114 var4 = field303;
                byte[] var5 = new byte[24];
                try {
                    class141.field2131.method3764(0L);
                    class141.field2131.method3763(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var25) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2213(var5, 0, 24);
                field303.method2269(Statics.field259);
                field303.method2369(Statics.field277);
                class111 var9 = new class111(Statics.field2572.method2862());
                Statics.field2572.method2861(var9);
                field303.method2213(var9.field1860, 0, var9.field1860.length);
                field303.method2204(Statics.field1944);
                field303.method2369(Statics.field2797.field2567);
                field303.method2369(Statics.field994.field2567);
                field303.method2369(Statics.field481.field2567);
                field303.method2369(Statics.field157.field2567);
                field303.method2369(Statics.field996.field2567);
                field303.method2369(Statics.field1087.field2567);
                field303.method2369(Statics.field1311.field2567);
                field303.method2369(Statics.field2524.field2567);
                field303.method2369(Statics.field2964.field2567);
                field303.method2369(Statics.field348.field2567);
                field303.method2369(Statics.field1523.field2567);
                field303.method2369(Statics.field2166.field2567);
                field303.method2369(Statics.field86.field2567);
                field303.method2369(Statics.field1534.field2567);
                field303.method2369(Statics.field711.field2567);
                field303.method2369(Statics.field211.field2567);
                field303.method2237(var1, var3, field303.field1861);
                field303.method2396(field303.field1861 - var2);
                Statics.field1863.method2717(field303.field1860, 0, field303.field1861);
                field302.method2476(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field304.method2476(var1);
                field294 = 6;
            }
            if (field294 == 6 && Statics.field1863.method2704() > 0) {
                int var11 = Statics.field1863.method2705();
                if (var11 == 21 && field268 == 20) {
                    field294 = 7;
                } else if (var11 == 2) {
                    field294 = 9;
                } else if (var11 == 15 && field268 == 40) {
                    method635();
                    return;
                } else if (var11 == 23 && field329 < 1) {
                    field329++;
                    field294 = 0;
                } else {
                    Statics.method2692(var11);
                    return;
                }
            }
            if (field294 == 7 && Statics.field1863.method2704() > 0) {
                field308 = (Statics.field1863.method2705() + 3) * 60;
                field294 = 8;
            }
            if (field294 == 8) {
                field516 = 0;
                class30.method641(class148.field2411, class148.field2444, field308 / 60 + class148.field2449);
                if (--field308 <= 0) {
                    field294 = 0;
                }
            } else {
                if (field294 == 9 && Statics.field1863.method2704() >= 13) {
                    boolean var12 = Statics.field1863.method2705() == 1;
                    Statics.field1863.method2707(field304.field1860, 0, 4);
                    field304.field1861 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field304.method2478() << 24;
                        int var15 = var14 | field304.method2478() << 16;
                        int var16 = var15 | field304.method2478() << 8;
                        int var17 = var16 | field304.method2478();
                        int var18 = class154.method2481(class30.field696);
                        if (Statics.field1877.field131.size() >= 10 && !Statics.field1877.field131.containsKey(var18)) {
                            Iterator var19 = Statics.field1877.field131.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field1877.field131.put(var18, var17);
                        class9.method2588();
                    }
                    field430 = Statics.field1863.method2705();
                    field432 = Statics.field1863.method2705() == 1;
                    field281 = Statics.field1863.method2705();
                    field281 <<= 0x8;
                    field281 += Statics.field1863.method2705();
                    field442 = Statics.field1863.method2705();
                    Statics.field1863.method2707(field304.field1860, 0, 1);
                    field304.field1861 = 0;
                    field279 = field304.method2478();
                    Statics.field1863.method2707(field304.field1860, 0, 2);
                    field304.field1861 = 0;
                    field305 = field304.method2397();
                    if (field442 == 1) {
                        try {
                            class124.method2569(Statics.field254, "zap");
                        } catch (Throwable var24) {
                        }
                    } else {
                        try {
                            class124.method2569(Statics.field254, "unzap");
                        } catch (Throwable var23) {
                        }
                    }
                    field294 = 10;
                }
                if (field294 != 10) {
                    field516++;
                    if (field516 > 2000) {
                        if (field329 < 1) {
                            if (Statics.field2033 == Statics.field1878) {
                                Statics.field2033 = Statics.field230;
                            } else {
                                Statics.field2033 = Statics.field1878;
                            }
                            field329++;
                            field294 = 0;
                        } else {
                            Statics.method2692(-3);
                        }
                    }
                } else if (Statics.field1863.method2704() >= field305) {
                    field304.field1861 = 0;
                    Statics.field1863.method2707(field304.field1860, 0, field305);
                    method168();
                    Statics.field2599 = -1;
                    method2560(false);
                    field279 = -1;
                }
            }
        } catch (IOException var26) {
            if (field329 < 1) {
                if (Statics.field2033 == Statics.field1878) {
                    Statics.field2033 = Statics.field230;
                } else {
                    Statics.field2033 = Statics.field1878;
                }
                field329++;
                field294 = 0;
            } else {
                Statics.method2692(-2);
            }
        }
    }

    @ObfuscatedName("i.x(I)V")
    public static void method168() {
        field271 = 1L;
        field274 = -1;
        Statics.field1928.field180 = 0;
        Statics.field2162 = true;
        field275 = true;
        field427 = -1L;
        class202.method2855();
        field302.field1861 = 0;
        field304.field1861 = 0;
        field279 = -1;
        field310 = -1;
        field311 = -1;
        field312 = -1;
        field307 = 0;
        field470 = 0;
        field524 = 0;
        field515 = 0;
        field405 = 0;
        field404 = false;
        class132.field2037 = 0;
        class11.field158.clear();
        class11.field153.method3455();
        class11.field154.method3505();
        class11.field155 = 0;
        field416 = 0;
        field418 = false;
        field507 = 0;
        field354 = (int) (Math.random() * 100.0D) - 50;
        field344 = (int) (Math.random() * 110.0D) - 55;
        field328 = (int) (Math.random() * 80.0D) - 40;
        field269 = (int) (Math.random() * 120.0D) - 60;
        field429 = (int) (Math.random() * 30.0D) - 20;
        field346 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field501 = 0;
        field527 = -1;
        field499 = 0;
        field364 = 0;
        field287 = class19.field545;
        field382 = 0;
        field300 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field381[var0] = null;
            field386[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field299[var1] = null;
        }
        Statics.field571 = field381[2047] = new class3();
        field406 = -1;
        field398.method3483();
        field399.method3483();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field396[var2][var3][var4] = null;
                }
            }
        }
        field445 = new class190();
        field533 = 0;
        field532 = 0;
        field536 = 0;
        for (int var5 = 0; var5 < Statics.field1090; var5++) {
            class48 var6 = class48.method2695(var5);
            if (var6 != null) {
                class167.field2786[var5] = 0;
                class167.field2791[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field461.length; var7++) {
            field461[var7] = -1;
        }
        field431 = -1;
        if (field423 != -1) {
            class164.method720(field423);
        }
        for (class4 var8 = (class4) field424.method3438(); var8 != null; var8 = (class4) field424.method3439()) {
            method2033(var8, true);
        }
        field423 = -1;
        field424 = new class187(8);
        field540 = null;
        field404 = false;
        field405 = 0;
        field360.method3146((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field478[var9] = null;
            field393[var9] = false;
        }
        class15.method145();
        field341 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field486[var10] = true;
        }
        field302.method2477(217);
        field302.method2204(method112());
        field302.method2205(Statics.field3047);
        field302.method2205(Statics.field187);
        field492 = null;
        Statics.field1316 = 0;
        Statics.field1925 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field253[var11] = new class211();
        }
        Statics.field1469 = null;
    }

    @ObfuscatedName("ao.h(B)V")
    public static void method635() {
        field302.field1861 = 0;
        field304.field1861 = 0;
        field279 = -1;
        field310 = -1;
        field311 = -1;
        field312 = -1;
        field305 = 0;
        field307 = 0;
        field470 = 0;
        field405 = 0;
        field404 = false;
        field501 = 0;
        field499 = 0;
        for (int var0 = 0; var0 < field381.length; var0++) {
            if (field381[var0] != null) {
                field381[var0].field788 = -1;
            }
        }
        for (int var1 = 0; var1 < field299.length; var1++) {
            if (field299[var1] != null) {
                field299[var1].field788 = -1;
            }
        }
        class15.method145();
        method2543(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field486[var2] = true;
        }
        field302.method2477(217);
        field302.method2204(method112());
        field302.method2205(Statics.field3047);
        field302.method2205(Statics.field187);
    }

    @ObfuscatedName("gt.w(I)V")
    public static final void method3569() {
        if (Statics.field1863 != null) {
            Statics.field1863.method2708();
            Statics.field1863 = null;
        }
        method2545();
        Statics.field2621.method1744();
        for (int var0 = 0; var0 < 4; var0++) {
            field320[var0].method3816();
        }
        System.gc();
        class174.method553(2);
        field503 = -1;
        field504 = false;
        class22.method526();
        method2543(10);
    }

    @ObfuscatedName("de.p(I)V")
    public static final void method2545() {
        class43.method29();
        class39.method2147();
        class42.method633();
        class38.method623();
        class37.field823.method3404();
        class37.field824.method3404();
        class47.method632();
        class40.field923.method3404();
        class40.field928.method3404();
        class41.field956.method3404();
        class41.field947.method3404();
        class44.field999.method3404();
        class48.field1083.method3404();
        class170.field2810.method3404();
        class164.field2633.method3404();
        class164.field2634.method3404();
        class164.field2635.method3404();
        class164.field2656.method3404();
        ((class90) Statics.field1498).method1941();
        class20.field554.method3404();
        Statics.field2797.method2948();
        Statics.field994.method2948();
        Statics.field157.method2948();
        Statics.field996.method2948();
        Statics.field1087.method2948();
        Statics.field1311.method2948();
        Statics.field2524.method2948();
        Statics.field2964.method2948();
        Statics.field348.method2948();
        Statics.field1523.method2948();
        Statics.field2166.method2948();
        Statics.field86.method2948();
    }

    @ObfuscatedName("ay.z(I)V")
    public static final void method624() {
        if (field524 > 0) {
            method3569();
        } else {
            method2543(40);
            Statics.field207 = Statics.field1863;
            Statics.field1863 = null;
        }
    }

    @ObfuscatedName("x.s(I)V")
    public static final void method172() {
        if (field470 > 1) {
            field470--;
        }
        if (field524 > 0) {
            field524--;
        }
        if (field313) {
            field313 = false;
            method624();
            return;
        }
        if (!field404) {
            field410[0] = class148.field2427;
            field411[0] = "";
            field392[0] = 1006;
            field405 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field1863 == null) {
                var1 = false;
            } else {
                label2614: {
                    try {
                        int var2 = Statics.field1863.method2704();
                        if (var2 == 0) {
                            var1 = false;
                            break label2614;
                        }
                        if (field279 == -1) {
                            Statics.field1863.method2707(field304.field1860, 0, 1);
                            field304.field1861 = 0;
                            field279 = field304.method2478();
                            field305 = class179.field2944[field279];
                            var2--;
                        }
                        if (field305 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2614;
                            }
                            Statics.field1863.method2707(field304.field1860, 0, 1);
                            field305 = field304.field1860[0] & 0xFF;
                            var2--;
                        }
                        if (field305 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2614;
                            }
                            Statics.field1863.method2707(field304.field1860, 0, 2);
                            field304.field1861 = 0;
                            field305 = field304.method2397();
                            var2 -= 2;
                        }
                        if (var2 < field305) {
                            var1 = false;
                            break label2614;
                        }
                        field304.field1861 = 0;
                        Statics.field1863.method2707(field304.field1860, 0, field305);
                        field307 = 0;
                        field312 = field311;
                        field311 = field310;
                        field310 = field279;
                        if (field279 == 212) {
                            String var3 = field304.method2339();
                            class114 var4 = field304;
                            String var8;
                            try {
                                int var5 = var4.method2368();
                                if (var5 > 32767) {
                                    var5 = 32767;
                                }
                                byte[] var6 = new byte[var5];
                                var4.field1861 += Statics.field3082.method2137(var4.field1860, var4.field1861, var6, 0, var5);
                                String var7 = class156.method2161(var6, 0, var5);
                                var8 = var7;
                            } catch (Exception var382) {
                                var8 = "Cabbage";
                            }
                            String var11 = class214.method3736(class154.method2515(var8));
                            class11.method626(6, var3, var11);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 242) {
                            field513 = true;
                            Statics.field573 = field304.method2219();
                            Statics.field1369 = field304.method2219();
                            Statics.field1119 = field304.method2397();
                            Statics.field1896 = field304.method2219();
                            Statics.field197 = field304.method2219();
                            if (Statics.field197 >= 100) {
                                int var12 = Statics.field573 * 128 + 64;
                                int var13 = Statics.field1369 * 128 + 64;
                                int var14 = method3111(var12, var13, Statics.field1086) - Statics.field1119;
                                int var15 = var12 - Statics.field962;
                                int var16 = var14 - Statics.field565;
                                int var17 = var13 - Statics.field1305;
                                int var18 = (int) Math.sqrt((double) (var15 * var15 + var17 * var17));
                                Statics.field802 = (int) (Math.atan2((double) var16, (double) var18) * 325.949D) & 0x7FF;
                                Statics.field66 = (int) (Math.atan2((double) var15, (double) var17) * -325.949D) & 0x7FF;
                                if (Statics.field802 < 128) {
                                    Statics.field802 = 128;
                                }
                                if (Statics.field802 > 383) {
                                    Statics.field802 = 383;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 178) {
                            method661();
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 119) {
                            int var19 = field304.method2367();
                            Statics.field2116 = Statics.field1007.method2608(var19);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 7) {
                            field515 = field304.method2219();
                            if (field515 == 1) {
                                field390 = field304.method2397();
                            }
                            if (field515 >= 2 && field515 <= 6) {
                                if (field515 == 2) {
                                    field284 = 64;
                                    field484 = 64;
                                }
                                if (field515 == 3) {
                                    field284 = 0;
                                    field484 = 64;
                                }
                                if (field515 == 4) {
                                    field284 = 128;
                                    field484 = 64;
                                }
                                if (field515 == 5) {
                                    field284 = 64;
                                    field484 = 0;
                                }
                                if (field515 == 6) {
                                    field284 = 64;
                                    field484 = 128;
                                }
                                field515 = 2;
                                field296 = field304.method2397();
                                field282 = field304.method2397();
                                field283 = field304.method2219();
                            }
                            if (field515 == 10) {
                                field280 = field304.method2397();
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 121) {
                            method3617();
                            field428 = field304.method2219();
                            field460 = field448;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 29) {
                            field533 = 1;
                            field472 = field448;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 170) {
                            method3617();
                            field291 = field304.method2222();
                            field460 = field448;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 96) {
                            for (int var20 = 0; var20 < Statics.field1090; var20++) {
                                class48 var21 = class48.method2695(var20);
                                if (var21 != null) {
                                    class167.field2786[var20] = 0;
                                    class167.field2791[var20] = 0;
                                }
                            }
                            method3617();
                            field295 += 32;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 48) {
                            field501 = field304.method2219();
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 173) {
                            int var22 = field304.method2367();
                            int var23 = field304.method2256();
                            int var24 = field304.method2397();
                            class164 var25 = class164.method2499(var22);
                            var25.field2642 = (var23 << 16) + var24;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 22) {
                            int var26 = field304.method2265();
                            int var27 = field304.method2273();
                            class4 var28 = (class4) field424.method3435((long) var27);
                            class4 var29 = (class4) field424.method3435((long) var26);
                            if (var29 != null) {
                                method2033(var29, var28 == null || var28.field62 != var29.field62);
                            }
                            if (var28 != null) {
                                var28.method3564();
                                field424.method3436(var28, (long) var26);
                            }
                            class164 var30 = class164.method2499(var27);
                            if (var30 != null) {
                                method33(var30);
                            }
                            class164 var31 = class164.method2499(var26);
                            if (var31 != null) {
                                method33(var31);
                                method693(Statics.field2743[var31.field2710 >>> 16], var31, true);
                            }
                            if (field423 != -1) {
                                method1955(field423, 1);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 21) {
                            method2539(false);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 25) {
                            int var32 = field304.method2273();
                            int var33 = field304.method2397();
                            if (var32 < -70000) {
                                var33 += 32768;
                            }
                            class164 var34;
                            if (var32 >= 0) {
                                var34 = class164.method2499(var32);
                            } else {
                                var34 = null;
                            }
                            if (var34 != null) {
                                for (int var35 = 0; var35 < var34.field2755.length; var35++) {
                                    var34.field2755[var35] = 0;
                                    var34.field2665[var35] = 0;
                                }
                            }
                            Statics.method2662(var33);
                            int var36 = field304.method2397();
                            for (int var37 = 0; var37 < var36; var37++) {
                                int var38 = field304.method2254();
                                int var39 = field304.method2219();
                                if (var39 == 255) {
                                    var39 = field304.method2367();
                                }
                                if (var34 != null && var37 < var34.field2755.length) {
                                    var34.field2755[var37] = var38;
                                    var34.field2665[var37] = var39;
                                }
                                class15.method143(var33, var37, var38 - 1, var39);
                            }
                            if (var34 != null) {
                                method33(var34);
                            }
                            method3617();
                            field435[++field321 - 1 & 0x1F] = var33 & 0x7FFF;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 104) {
                            for (int var40 = 0; var40 < field381.length; var40++) {
                                if (field381[var40] != null) {
                                    field381[var40].field793 = -1;
                                }
                            }
                            for (int var41 = 0; var41 < field299.length; var41++) {
                                if (field299[var41] != null) {
                                    field299[var41].field793 = -1;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 4) {
                            for (int var42 = 0; var42 < class167.field2791.length; var42++) {
                                if (class167.field2791[var42] != class167.field2786[var42]) {
                                    class167.field2791[var42] = class167.field2786[var42];
                                    method3038(var42);
                                    field257[++field295 - 1 & 0x1F] = var42;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 238) {
                            String var43 = field304.method2339();
                            long var44 = field304.method2292();
                            long var46 = (long) field304.method2397();
                            long var48 = (long) field304.method2258();
                            class143 var50 = (class143) class101.method1845(class143.method169(), field304.method2219());
                            long var51 = (var46 << 32) + var48;
                            boolean var53 = false;
                            for (int var54 = 0; var54 < 100; var54++) {
                                if (field267[var54] == var51) {
                                    var53 = true;
                                    break;
                                }
                            }
                            if (var50.field2148 && method2043(var43)) {
                                var53 = true;
                            }
                            if (!var53 && field380 == 0) {
                                field267[field359] = var51;
                                field359 = (field359 + 1) % 100;
                                class114 var55 = field304;
                                String var59;
                                try {
                                    int var56 = var55.method2368();
                                    if (var56 > 32767) {
                                        var56 = 32767;
                                    }
                                    byte[] var57 = new byte[var56];
                                    var55.field1861 += Statics.field3082.method2137(var55.field1860, var55.field1861, var57, 0, var56);
                                    String var58 = class156.method2161(var57, 0, var56);
                                    var59 = var58;
                                } catch (Exception var381) {
                                    var59 = "Cabbage";
                                }
                                String var62 = class214.method3736(class154.method2515(var59));
                                if (var50.field2149 == -1) {
                                    class11.method2041(9, var43, var62, class153.method2131(var44));
                                } else {
                                    class11.method2041(9, class2.method1661(var50.field2149) + var43, var62, class153.method2131(var44));
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 201) {
                            field470 = field304.method2397() * 30;
                            field460 = field448;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 196) {
                            method2560(true);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 60 || field279 == 84 || field279 == 113 || field279 == 160 || field279 == 149 || field279 == 180 || field279 == 202 || field279 == 15 || field279 == 229 || field279 == 179) {
                            method146();
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 167) {
                            boolean var63 = field304.method2219() == 1;
                            if (var63) {
                                Statics.field186 = class107.method2661() - field304.method2292();
                                Statics.field1469 = new class212(field304, true);
                            } else {
                                Statics.field1469 = null;
                            }
                            field459 = field448;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 58) {
                            int var64 = field304.method2219();
                            int var65 = field304.method2219();
                            int var66 = field304.method2219();
                            int var67 = field304.method2219();
                            field494[var64] = true;
                            field447[var64] = var65;
                            field309[var64] = var66;
                            field517[var64] = var67;
                            field518[var64] = 0;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 145) {
                            int var68 = field304.method2397();
                            byte var69 = field304.method2249();
                            class167.field2786[var68] = var69;
                            if (class167.field2791[var68] != var69) {
                                class167.field2791[var68] = var69;
                                method3038(var68);
                            }
                            field257[++field295 - 1 & 0x1F] = var68;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 13) {
                            int var70 = field304.method2219();
                            if (field304.method2219() == 0) {
                                field253[var70] = new class211();
                                field304.field1861 += 18;
                            } else {
                                field304.field1861--;
                                field253[var70] = new class211(field304, false);
                            }
                            field446 = field448;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 79) {
                            int var71 = field304.method2368();
                            boolean var72 = field304.method2219() == 1;
                            String var73 = "";
                            boolean var74 = false;
                            if (var72) {
                                var73 = field304.method2339();
                                if (method2043(var73)) {
                                    var74 = true;
                                }
                            }
                            String var75 = field304.method2339();
                            if (!var74) {
                                class11.method626(var71, var73, var75);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 246) {
                            int var76 = field304.method2273();
                            int var77 = field304.method2397();
                            if (var76 < -70000) {
                                var77 += 32768;
                            }
                            class164 var78;
                            if (var76 >= 0) {
                                var78 = class164.method2499(var76);
                            } else {
                                var78 = null;
                            }
                            while (field304.field1861 < field305) {
                                int var79 = field304.method2368();
                                int var80 = field304.method2397();
                                int var81 = 0;
                                if (var80 != 0) {
                                    var81 = field304.method2219();
                                    if (var81 == 255) {
                                        var81 = field304.method2273();
                                    }
                                }
                                if (var78 != null && var79 >= 0 && var79 < var78.field2755.length) {
                                    var78.field2755[var79] = var80;
                                    var78.field2665[var79] = var81;
                                }
                                class15.method143(var77, var79, var80 - 1, var81);
                            }
                            if (var78 != null) {
                                method33(var78);
                            }
                            method3617();
                            field435[++field321 - 1 & 0x1F] = var77 & 0x7FFF;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 86) {
                            if (field423 != -1) {
                                method1955(field423, 0);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 244) {
                            field513 = false;
                            for (int var82 = 0; var82 < 5; var82++) {
                                field494[var82] = false;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 19) {
                            int var83 = field304.method2255();
                            if (var83 == 65535) {
                                var83 = -1;
                            }
                            method3568(var83);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 200) {
                            int var84 = field304.method2256();
                            if (var84 == 65535) {
                                var84 = -1;
                            }
                            int var85 = field304.method2260();
                            if (field487 != 0 && var84 != -1) {
                                Statics.method3179(Statics.field2166, var84, 0, field487, false);
                                field504 = true;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 185) {
                            method2814(field304.method2339());
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 205) {
                            int var86 = field304.method2367();
                            int var87 = field304.method2397();
                            class167.field2786[var87] = var86;
                            if (class167.field2791[var87] != var86) {
                                class167.field2791[var87] = var86;
                                method3038(var87);
                            }
                            field257[++field295 - 1 & 0x1F] = var87;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 158) {
                            int var88 = field304.method2273();
                            class164 var89 = class164.method2499(var88);
                            var89.field2747 = 3;
                            var89.field2681 = Statics.field571.field29.method3154();
                            method33(var89);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 214) {
                            String var90 = field304.method2339();
                            int var91 = field304.method2273();
                            class164 var92 = class164.method2499(var91);
                            if (!var90.equals(var92.field2697)) {
                                var92.field2697 = var90;
                                method33(var92);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 61) {
                            int var93 = field304.method2245();
                            int var94 = field304.method2245();
                            String var95 = field304.method2339();
                            if (var93 >= 1 && var93 <= 8) {
                                if (var95.equalsIgnoreCase("null")) {
                                    var95 = null;
                                }
                                field478[var93 - 1] = var95;
                                field393[var93 - 1] = var94 == 0;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 92) {
                            int var96 = field304.method2265();
                            int var97 = field304.method2352();
                            class164 var98 = class164.method2499(var96);
                            if (var98.field2684 != var97 || var97 == -1) {
                                var98.field2684 = var97;
                                var98.field2759 = 0;
                                var98.field2760 = 0;
                                method33(var98);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 35) {
                            int var99 = field304.method2245();
                            int var100 = field304.method2397();
                            int var101 = field304.method2366();
                            class4 var102 = (class4) field424.method3435((long) var101);
                            if (var102 != null) {
                                method2033(var102, var102.field62 != var100);
                            }
                            method2029(var101, var100, var99);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 207) {
                            int var103 = field304.method2255();
                            if (var103 == 65535) {
                                var103 = -1;
                            }
                            int var104 = field304.method2265();
                            int var105 = field304.method2397();
                            if (var105 == 65535) {
                                var105 = -1;
                            }
                            int var106 = field304.method2366();
                            for (int var107 = var103; var107 <= var105; var107++) {
                                long var108 = ((long) var104 << 32) + (long) var107;
                                class199 var110 = field467.method3435(var108);
                                if (var110 != null) {
                                    var110.method3564();
                                }
                                field467.method3436(new class192(var106), var108);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 234) {
                            Statics.field645 = field304.method2246();
                            Statics.field808 = field304.method2247();
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 222) {
                            int var111 = field304.method2256();
                            field423 = var111;
                            method1108(false);
                            method918(var111);
                            class34.method533(field423);
                            for (int var112 = 0; var112 < 100; var112++) {
                                field486[var112] = true;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 65) {
                            Statics.field921 = class122.method627(field304.method2219());
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 127) {
                            int var113 = field304.method2273();
                            class164 var114 = class164.method2499(var113);
                            for (int var115 = 0; var115 < var114.field2755.length; var115++) {
                                var114.field2755[var115] = -1;
                                var114.field2755[var115] = 0;
                            }
                            method33(var114);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 63) {
                            method2539(true);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 154) {
                            int var116 = field304.method2397();
                            int var117 = field304.method2219();
                            int var118 = field304.method2397();
                            method25(var116, var117, var118);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 47) {
                            int var119 = field304.method2256();
                            class15.method1844(var119);
                            field435[++field321 - 1 & 0x1F] = var119 & 0x7FFF;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 181) {
                            int var120 = field304.method2265();
                            int var121 = field304.method2255();
                            class164 var122 = class164.method2499(var120);
                            if (var122.field2747 != 2 || var122.field2681 != var121) {
                                var122.field2747 = 2;
                                var122.field2681 = var121;
                                method33(var122);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 41) {
                            int var123 = field305 + field304.field1861;
                            int var124 = field304.method2397();
                            int var125 = field304.method2397();
                            if (field423 != var124) {
                                field423 = var124;
                                method1108(false);
                                method918(field423);
                                class34.method533(field423);
                                for (int var126 = 0; var126 < 100; var126++) {
                                    field486[var126] = true;
                                }
                            }
                            while (var125-- > 0) {
                                int var127 = field304.method2273();
                                int var128 = field304.method2397();
                                int var129 = field304.method2219();
                                class4 var130 = (class4) field424.method3435((long) var127);
                                if (var130 != null && var130.field62 != var128) {
                                    method2033(var130, true);
                                    var130 = null;
                                }
                                if (var130 == null) {
                                    var130 = method2029(var127, var128, var129);
                                }
                                var130.field56 = true;
                            }
                            for (class4 var131 = (class4) field424.method3438(); var131 != null; var131 = (class4) field424.method3439()) {
                                if (var131.field56) {
                                    var131.field56 = false;
                                } else {
                                    method2033(var131, true);
                                }
                            }
                            field467 = new class187(512);
                            while (field304.field1861 < var123) {
                                int var132 = field304.method2273();
                                int var133 = field304.method2397();
                                int var134 = field304.method2397();
                                int var135 = field304.method2273();
                                for (int var136 = var133; var136 <= var134; var136++) {
                                    long var137 = ((long) var132 << 32) + (long) var136;
                                    field467.method3436(new class192(var135), var137);
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 137) {
                            int var139 = field304.method2273();
                            int var140 = field304.method2265();
                            int var141 = field304.method2254();
                            if (var141 == 65535) {
                                var141 = -1;
                            }
                            class164 var142 = class164.method2499(var139);
                            if (var142.field2657) {
                                var142.field2757 = var141;
                                var142.field2758 = var140;
                                class47 var144 = class47.method2700(var141);
                                var142.field2680 = var144.field1045;
                                var142.field2689 = var144.field1046;
                                var142.field2753 = var144.field1047;
                                var142.field2686 = var144.field1070;
                                var142.field2687 = var144.field1049;
                                var142.field2691 = var144.field1059;
                                if (var144.field1080 == 1) {
                                    var142.field2695 = 1;
                                } else {
                                    var142.field2695 = 2;
                                }
                                if (var142.field2638 > 0) {
                                    var142.field2691 = var142.field2691 * 32 / var142.field2638;
                                } else if (var142.field2650 > 0) {
                                    var142.field2691 = var142.field2691 * 32 / var142.field2650;
                                }
                                method33(var142);
                            } else {
                                if (var141 == -1) {
                                    var142.field2747 = 0;
                                    field279 = -1;
                                    var1 = true;
                                    break label2614;
                                }
                                class47 var143 = class47.method2700(var141);
                                var142.field2747 = 4;
                                var142.field2681 = var141;
                                var142.field2680 = var143.field1045;
                                var142.field2689 = var143.field1046;
                                var142.field2691 = var143.field1059 * 100 / var140;
                                method33(var142);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 32) {
                            int var145 = field304.method2367();
                            boolean var146 = field304.method2246() == 1;
                            class164 var147 = class164.method2499(var145);
                            if (var147.field2674 != var146) {
                                var147.field2674 = var146;
                                method33(var147);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 143) {
                            Statics.field645 = field304.method2246();
                            Statics.field808 = field304.method2219();
                            while (field304.field1861 < field305) {
                                field279 = field304.method2219();
                                method146();
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 87) {
                            method3569();
                            field279 = -1;
                            var1 = false;
                            break label2614;
                        }
                        if (field279 == 209) {
                            int var148 = field304.method2255();
                            int var149 = field304.method2366();
                            class164 var150 = class164.method2499(var149);
                            if (var150 != null && var150.field2756 == 0) {
                                if (var148 > var150.field2663 - var150.field2655) {
                                    var148 = var150.field2663 - var150.field2655;
                                }
                                if (var148 < 0) {
                                    var148 = 0;
                                }
                                if (var150.field2661 != var148) {
                                    var150.field2661 = var148;
                                    method33(var150);
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 146) {
                            field483 = field304.method2219();
                            field387 = field304.method2219();
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 120) {
                            int var151 = field304.method2219();
                            int var152 = field304.method2219();
                            int var153 = field304.method2246();
                            Statics.field1086 = var153 >> 1;
                            Statics.field571.method643(var152, var151, (var153 & 0x1) == 1);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 211) {
                            class24 var154 = new class24();
                            var154.field614 = field304.method2339();
                            var154.field611 = field304.method2397();
                            int var155 = field304.method2273();
                            var154.field620 = var155;
                            method2543(45);
                            Statics.field1863.method2708();
                            Statics.field1863 = null;
                            class30.method521(var154);
                            field279 = -1;
                            var1 = false;
                            break label2614;
                        }
                        if (field279 == 131) {
                            int var156 = field304.method2256();
                            int var157 = field304.method2265();
                            int var158 = field304.method2255();
                            int var159 = field304.method2256();
                            class164 var160 = class164.method2499(var157);
                            if (var160.field2680 != var158 || var160.field2689 != var156 || var160.field2691 != var159) {
                                var160.field2680 = var158;
                                var160.field2689 = var156;
                                var160.field2691 = var159;
                                method33(var160);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 132) {
                            field304.field1861 += 28;
                            if (field304.method2241()) {
                                class141.method107(field304, field304.field1861 - 28);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 198) {
                            while (field304.field1861 < field305) {
                                boolean var161 = field304.method2219() == 1;
                                String var162 = field304.method2339();
                                String var163 = field304.method2339();
                                int var164 = field304.method2397();
                                int var165 = field304.method2219();
                                int var166 = field304.method2219();
                                boolean var167 = (var166 & 0x2) != 0;
                                boolean var168 = (var166 & 0x1) != 0;
                                if (var164 > 0) {
                                    field304.method2339();
                                    field304.method2219();
                                    field304.method2273();
                                }
                                field304.method2339();
                                for (int var169 = 0; var169 < field532; var169++) {
                                    class17 var170 = field534[var169];
                                    if (var161) {
                                        if (var163.equals(var170.field233)) {
                                            var170.field233 = var162;
                                            var170.field231 = var163;
                                            var162 = null;
                                            break;
                                        }
                                    } else if (var162.equals(var170.field233)) {
                                        if (var170.field236 != var164) {
                                            boolean var171 = true;
                                            for (class36 var172 = (class36) field535.method3424(); var172 != null; var172 = (class36) field535.method3422()) {
                                                if (var172.field814.equals(var162)) {
                                                    if (var164 != 0 && var172.field820 == 0) {
                                                        var172.method3562();
                                                        var171 = false;
                                                    } else if (var164 == 0 && var172.field820 != 0) {
                                                        var172.method3562();
                                                        var171 = false;
                                                    }
                                                }
                                            }
                                            if (var171) {
                                                field535.method3423(new class36(var162, var164));
                                            }
                                            var170.field236 = var164;
                                        }
                                        var170.field231 = var163;
                                        var170.field234 = var165;
                                        var170.field235 = var167;
                                        var170.field238 = var168;
                                        var162 = null;
                                        break;
                                    }
                                }
                                if (var162 != null && field532 < 400) {
                                    class17 var173 = new class17();
                                    field534[field532] = var173;
                                    var173.field233 = var162;
                                    var173.field231 = var163;
                                    var173.field236 = var164;
                                    var173.field234 = var165;
                                    var173.field235 = var167;
                                    var173.field238 = var168;
                                    field532++;
                                }
                            }
                            field533 = 2;
                            field472 = field448;
                            boolean var174 = false;
                            int var175 = field532;
                            while (var175 > 0) {
                                boolean var176 = true;
                                var175--;
                                for (int var177 = 0; var177 < var175; var177++) {
                                    boolean var178 = false;
                                    class17 var179 = field534[var177];
                                    class17 var180 = field534[var177 + 1];
                                    if (field256 != var179.field236 && field256 == var180.field236) {
                                        var178 = true;
                                    }
                                    if (!var178 && var179.field236 == 0 && var180.field236 != 0) {
                                        var178 = true;
                                    }
                                    if (!var178 && !var179.field235 && var180.field235) {
                                        var178 = true;
                                    }
                                    if (!var178 && !var179.field238 && var180.field238) {
                                        var178 = true;
                                    }
                                    if (var178) {
                                        class17 var181 = field534[var177];
                                        field534[var177] = field534[var177 + 1];
                                        field534[var177 + 1] = var181;
                                        var176 = false;
                                    }
                                }
                                if (var176) {
                                    break;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 117) {
                            int var182 = field304.method2367();
                            int var183 = field304.method2385();
                            int var184 = field304.method2259();
                            class164 var185 = class164.method2499(var182);
                            if (var185.field2648 != var183 || var185.field2649 != var184 || var185.field2764 != 0 || var185.field2645 != 0) {
                                var185.field2648 = var183;
                                var185.field2649 = var184;
                                var185.field2764 = 0;
                                var185.field2645 = 0;
                                method33(var185);
                                method163(var185);
                                if (var185.field2756 == 0) {
                                    method693(Statics.field2743[var182 >> 16], var185, false);
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 106) {
                            field513 = true;
                            Statics.field813 = field304.method2219();
                            Statics.field2975 = field304.method2219();
                            Statics.field1011 = field304.method2397();
                            Statics.field1937 = field304.method2219();
                            Statics.field608 = field304.method2219();
                            if (Statics.field608 >= 100) {
                                Statics.field962 = Statics.field813 * 128 + 64;
                                Statics.field1305 = Statics.field2975 * 128 + 64;
                                Statics.field565 = method3111(Statics.field962, Statics.field1305, Statics.field1086) - Statics.field1011;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 148) {
                            Statics.field645 = field304.method2246();
                            Statics.field808 = field304.method2245();
                            for (int var186 = Statics.field808; var186 < Statics.field808 + 8; var186++) {
                                for (int var187 = Statics.field645; var187 < Statics.field645 + 8; var187++) {
                                    if (field396[Statics.field1086][var186][var187] != null) {
                                        field396[Statics.field1086][var186][var187] = null;
                                        method140(var186, var187);
                                    }
                                }
                            }
                            for (class16 var188 = (class16) field445.method3499(); var188 != null; var188 = (class16) field445.method3482()) {
                                if (var188.field214 >= Statics.field808 && var188.field214 < Statics.field808 + 8 && var188.field213 >= Statics.field645 && var188.field213 < Statics.field645 + 8 && Statics.field1086 == var188.field224) {
                                    var188.field221 = 0;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 182) {
                            method3617();
                            int var189 = field304.method2367();
                            int var190 = field304.method2245();
                            int var191 = field304.method2246();
                            field402[var191] = var189;
                            field265[var191] = var190;
                            field401[var191] = 1;
                            for (int var192 = 0; var192 < 98; var192++) {
                                if (var189 >= class146.field2181[var192]) {
                                    field401[var191] = var192 + 2;
                                }
                            }
                            field453[++field454 - 1 & 0x1F] = var191;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 129) {
                            class202.method2872(field304, field305);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 45) {
                            field499 = field304.method2219();
                            if (field499 == 255) {
                                field499 = 0;
                            }
                            field364 = field304.method2219();
                            if (field364 == 255) {
                                field364 = 0;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 73) {
                            int var193 = field304.method2273();
                            class4 var194 = (class4) field424.method3435((long) var193);
                            if (var194 != null) {
                                method2033(var194, true);
                            }
                            if (field540 != null) {
                                method33(field540);
                                field540 = null;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 236) {
                            String var195 = field304.method2339();
                            long var196 = (long) field304.method2397();
                            long var198 = (long) field304.method2258();
                            class143 var200 = (class143) class101.method1845(class143.method169(), field304.method2219());
                            long var201 = (var196 << 32) + var198;
                            boolean var203 = false;
                            for (int var204 = 0; var204 < 100; var204++) {
                                if (field267[var204] == var201) {
                                    var203 = true;
                                    break;
                                }
                            }
                            if (method2043(var195)) {
                                var203 = true;
                            }
                            if (!var203 && field380 == 0) {
                                field267[field359] = var201;
                                field359 = (field359 + 1) % 100;
                                class114 var205 = field304;
                                String var209;
                                try {
                                    int var206 = var205.method2368();
                                    if (var206 > 32767) {
                                        var206 = 32767;
                                    }
                                    byte[] var207 = new byte[var206];
                                    var205.field1861 += Statics.field3082.method2137(var205.field1860, var205.field1861, var207, 0, var206);
                                    String var208 = class156.method2161(var207, 0, var206);
                                    var209 = var208;
                                } catch (Exception var380) {
                                    var209 = "Cabbage";
                                }
                                String var212 = class214.method3736(class154.method2515(var209));
                                byte var213;
                                if (var200.field2143) {
                                    var213 = 7;
                                } else {
                                    var213 = 3;
                                }
                                if (var200.field2149 == -1) {
                                    class11.method626(var213, var195, var212);
                                } else {
                                    class11.method626(var213, class2.method1661(var200.field2149) + var195, var212);
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 68) {
                            int var214 = field304.method2265();
                            int var215 = field304.method2255();
                            class164 var216 = class164.method2499(var214);
                            if (var216.field2747 != 1 || var216.field2681 != var215) {
                                var216.field2747 = 1;
                                var216.field2681 = var215;
                                method33(var216);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 134) {
                            String var217 = field304.method2339();
                            int var218 = field304.method2397();
                            byte var219 = field304.method2220();
                            boolean var220 = false;
                            if (var219 == -128) {
                                var220 = true;
                            }
                            if (var220) {
                                if (Statics.field1316 == 0) {
                                    field279 = -1;
                                    var1 = true;
                                    break label2614;
                                }
                                boolean var221 = false;
                                int var222;
                                for (var222 = 0; var222 < Statics.field1316 && (!Statics.field1925[var222].field604.equals(var217) || Statics.field1925[var222].field600 != var218); var222++) {
                                }
                                if (var222 < Statics.field1316) {
                                    while (var222 < Statics.field1316 - 1) {
                                        Statics.field1925[var222] = Statics.field1925[var222 + 1];
                                        var222++;
                                    }
                                    Statics.field1316--;
                                    Statics.field1925[Statics.field1316] = null;
                                }
                            } else {
                                field304.method2339();
                                class23 var223 = new class23();
                                var223.field604 = var217;
                                var223.field599 = class155.method2880(var223.field604, Statics.field261);
                                var223.field600 = var218;
                                var223.field603 = var219;
                                int var224;
                                for (var224 = Statics.field1316 - 1; var224 >= 0; var224--) {
                                    int var225 = Statics.field1925[var224].field599.compareTo(var223.field599);
                                    if (var225 == 0) {
                                        Statics.field1925[var224].field600 = var218;
                                        Statics.field1925[var224].field603 = var219;
                                        if (var217.equals(Statics.field571.field38)) {
                                            Statics.field2796 = var219;
                                        }
                                        field366 = field448;
                                        field279 = -1;
                                        var1 = true;
                                        break label2614;
                                    }
                                    if (var225 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1316 >= Statics.field1925.length) {
                                    field279 = -1;
                                    var1 = true;
                                    break label2614;
                                }
                                for (int var226 = Statics.field1316 - 1; var226 > var224; var226--) {
                                    Statics.field1925[var226 + 1] = Statics.field1925[var226];
                                }
                                if (Statics.field1316 == 0) {
                                    Statics.field1925 = new class23[100];
                                }
                                Statics.field1925[var224 + 1] = var223;
                                Statics.field1316++;
                                if (var217.equals(Statics.field571.field38)) {
                                    Statics.field2796 = var219;
                                }
                            }
                            field366 = field448;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 114) {
                            method2560(false);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 71) {
                            int var227 = field304.method2273();
                            int var228 = field304.method2254();
                            int var229 = var228 >> 10 & 0x1F;
                            int var230 = var228 >> 5 & 0x1F;
                            int var231 = var228 & 0x1F;
                            int var232 = (var231 << 3) + (var229 << 19) + (var230 << 11);
                            class164 var233 = class164.method2499(var227);
                            if (var233.field2639 != var232) {
                                var233.field2639 = var232;
                                method33(var233);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 250) {
                            while (field304.field1861 < field305) {
                                int var234 = field304.method2219();
                                boolean var235 = (var234 & 0x1) == 1;
                                String var236 = field304.method2339();
                                String var237 = field304.method2339();
                                field304.method2339();
                                for (int var238 = 0; var238 < field536; var238++) {
                                    class8 var239 = field537[var238];
                                    if (var235) {
                                        if (var237.equals(var239.field127)) {
                                            var239.field127 = var236;
                                            var239.field121 = var237;
                                            var236 = null;
                                            break;
                                        }
                                    } else if (var236.equals(var239.field127)) {
                                        var239.field127 = var236;
                                        var239.field121 = var237;
                                        var236 = null;
                                        break;
                                    }
                                }
                                if (var236 != null && field536 < 400) {
                                    class8 var240 = new class8();
                                    field537[field536] = var240;
                                    var240.field127 = var236;
                                    var240.field121 = var237;
                                    field536++;
                                }
                            }
                            field472 = field448;
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        if (field279 == 85) {
                            field366 = field448;
                            if (field305 == 0) {
                                field492 = null;
                                field539 = null;
                                Statics.field1316 = 0;
                                Statics.field1925 = null;
                                field279 = -1;
                                var1 = true;
                            } else {
                                field539 = field304.method2339();
                                long var241 = field304.method2292();
                                field492 = class153.method2691(var241);
                                Statics.field723 = field304.method2220();
                                int var243 = field304.method2219();
                                if (var243 == 255) {
                                    field279 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1316 = var243;
                                    class23[] var244 = new class23[100];
                                    for (int var245 = 0; var245 < Statics.field1316; var245++) {
                                        var244[var245] = new class23();
                                        var244[var245].field604 = field304.method2339();
                                        var244[var245].field599 = class155.method2880(var244[var245].field604, Statics.field261);
                                        var244[var245].field600 = field304.method2397();
                                        var244[var245].field603 = field304.method2220();
                                        field304.method2339();
                                        if (var244[var245].field604.equals(Statics.field571.field38)) {
                                            Statics.field2796 = var244[var245].field603;
                                        }
                                    }
                                    boolean var246 = false;
                                    int var247 = Statics.field1316;
                                    while (var247 > 0) {
                                        boolean var248 = true;
                                        var247--;
                                        for (int var249 = 0; var249 < var247; var249++) {
                                            if (var244[var249].field599.compareTo(var244[var249 + 1].field599) > 0) {
                                                class23 var250 = var244[var249];
                                                var244[var249] = var244[var249 + 1];
                                                var244[var249 + 1] = var250;
                                                var248 = false;
                                            }
                                        }
                                        if (var248) {
                                            break;
                                        }
                                    }
                                    Statics.field1925 = var244;
                                    field279 = -1;
                                    var1 = true;
                                }
                            }
                            break label2614;
                        }
                        if (field279 == 192) {
                            String var251 = field304.method2339();
                            Object[] var252 = new Object[var251.length() + 1];
                            for (int var253 = var251.length() - 1; var253 >= 0; var253--) {
                                if (var251.charAt(var253) == 's') {
                                    var252[var253 + 1] = field304.method2339();
                                } else {
                                    var252[var253 + 1] = Integer.valueOf(field304.method2273());
                                }
                            }
                            var252[0] = Integer.valueOf(field304.method2273());
                            class1 var254 = new class1();
                            var254.field8 = var252;
                            class34.method74(var254);
                            field279 = -1;
                            var1 = true;
                            break label2614;
                        }
                        class140.method530("" + field279 + class2.field21 + field311 + class2.field21 + field312 + class2.field21 + field305, (Throwable) null);
                        method3569();
                    } catch (IOException var384) {
                        method624();
                    } catch (Exception var385) {
                        String var257 = "" + field279 + class2.field21 + field311 + class2.field21 + field312 + class2.field21 + field305 + class2.field21 + (Statics.field120 + Statics.field571.field803[0]) + class2.field21 + (Statics.field124 + Statics.field571.field786[0]) + class2.field21;
                        for (int var258 = 0; var258 < field305 && var258 < 50; var258++) {
                            var257 = var257 + field304.field1860[var258] + class2.field21;
                        }
                        class140.method530(var257, var385);
                        method3569();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field268 != 30) {
            return;
        }
        while (class202.method2842()) {
            field302.method2477(249);
            field302.method2204(0);
            int var259 = field302.field1861;
            class202.method2810(field302);
            field302.method2203(field302.field1861 - var259);
        }
        Object var260 = Statics.field1928.field178;
        synchronized (Statics.field1928.field178) {
            if (!field325) {
                Statics.field1928.field180 = 0;
            } else if (class132.field2047 != 0 || Statics.field1928.field180 >= 40) {
                field302.method2477(11);
                field302.method2204(0);
                int var261 = field302.field1861;
                int var262 = 0;
                for (int var263 = 0; var263 < Statics.field1928.field180 && field302.field1861 - var261 < 240; var263++) {
                    var262++;
                    int var264 = Statics.field1928.field189[var263];
                    if (var264 < 0) {
                        var264 = 0;
                    } else if (var264 > 502) {
                        var264 = 502;
                    }
                    int var265 = Statics.field1928.field184[var263];
                    if (var265 < 0) {
                        var265 = 0;
                    } else if (var265 > 764) {
                        var265 = 764;
                    }
                    int var266 = var264 * 765 + var265;
                    if (Statics.field1928.field189[var263] == -1 && Statics.field1928.field184[var263] == -1) {
                        var265 = -1;
                        var264 = -1;
                        var266 = 524287;
                    }
                    if (field272 != var265 || field273 != var264) {
                        int var267 = var265 - field272;
                        field272 = var265;
                        int var268 = var264 - field273;
                        field273 = var264;
                        if (field274 < 8 && var267 >= -32 && var267 <= 31 && var268 >= -32 && var268 <= 31) {
                            var267 += 32;
                            var268 += 32;
                            field302.method2205((field274 << 12) + (var267 << 6) + var268);
                            field274 = 0;
                        } else if (field274 < 8) {
                            field302.method2206((field274 << 19) + 8388608 + var266);
                            field274 = 0;
                        } else {
                            field302.method2369((field274 << 19) + -1073741824 + var266);
                            field274 = 0;
                        }
                    } else if (field274 < 2047) {
                        field274++;
                    }
                }
                field302.method2203(field302.field1861 - var261);
                if (var262 >= Statics.field1928.field180) {
                    Statics.field1928.field180 = 0;
                } else {
                    Statics.field1928.field180 -= var262;
                    for (int var269 = 0; var269 < Statics.field1928.field180; var269++) {
                        Statics.field1928.field184[var269] = Statics.field1928.field184[var262 + var269];
                        Statics.field1928.field189[var269] = Statics.field1928.field189[var262 + var269];
                    }
                }
            }
        }
        if (class132.field2047 == 1 || !Statics.field1276 && class132.field2047 == 4 || class132.field2047 == 2) {
            long var271 = (class132.field2039 - field271 * -1L) / 50L;
            if (var271 > 4095L) {
                var271 = 4095L;
            }
            field271 = class132.field2039 * -1L;
            int var273 = class132.field2055;
            if (var273 < 0) {
                var273 = 0;
            } else if (var273 > Statics.field187) {
                var273 = Statics.field187;
            }
            int var274 = class132.field2049;
            if (var274 < 0) {
                var274 = 0;
            } else if (var274 > Statics.field3047) {
                var274 = Statics.field3047;
            }
            int var275 = (int) var271;
            field302.method2477(132);
            field302.method2205((var275 << 1) + (class132.field2047 == 2 ? 1 : 0));
            field302.method2205(var274);
            field302.method2205(var273);
        }
        if (class129.field2009 > 0) {
            field302.method2477(212);
            field302.method2205(0);
            int var276 = field302.field1861;
            long var277 = class107.method2661();
            for (int var279 = 0; var279 < class129.field2009; var279++) {
                long var280 = var277 - field427;
                if (var280 > 16777215L) {
                    var280 = 16777215L;
                }
                field427 = var277;
                field302.method2244(class129.field2019[var279]);
                field302.method2206((int) var280);
            }
            field302.method2396(field302.field1861 - var276);
        }
        if (field351 > 0) {
            field351--;
        }
        if (class129.field2010[96] || class129.field2010[97] || class129.field2010[98] || class129.field2010[99]) {
            field352 = true;
        }
        if (field352 && field351 <= 0) {
            field351 = 20;
            field352 = false;
            field302.method2477(60);
            field302.method2205(field345);
            field302.method2251(field346);
        }
        if (Statics.field2162 && !field275) {
            field275 = true;
            field302.method2477(236);
            field302.method2204(1);
        }
        if (!Statics.field2162 && field275) {
            field275 = false;
            field302.method2477(236);
            field302.method2204(0);
        }
        if (field263 && Statics.field1086 != field314) {
            method628(Statics.field2599, Statics.field1584, Statics.field1086, Statics.field571.field803[0], Statics.field571.field786[0]);
        } else if (Statics.field1086 != field527) {
            field527 = Statics.field1086;
            int var282 = Statics.field1086;
            int[] var283 = Statics.field13.field1330;
            int var284 = var283.length;
            for (int var285 = 0; var285 < var284; var285++) {
                var283[var285] = 0;
            }
            for (int var286 = 1; var286 < 103; var286++) {
                int var287 = (103 - var286) * 2048 + 24628;
                for (int var288 = 1; var288 < 103; var288++) {
                    if ((class6.field82[var282][var288][var286] & 0x18) == 0) {
                        Statics.field2621.method1703(var283, var287, 512, var282, var288, var286);
                    }
                    if (var282 < 3 && (class6.field82[var282 + 1][var288][var286] & 0x8) != 0) {
                        Statics.field2621.method1703(var283, var287, 512, var282 + 1, var288, var286);
                    }
                    var287 += 4;
                }
            }
            int var289 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var290 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field13.method1486();
            for (int var291 = 1; var291 < 103; var291++) {
                for (int var292 = 1; var292 < 103; var292++) {
                    if ((class6.field82[var282][var292][var291] & 0x18) == 0) {
                        method2026(var282, var292, var291, var289, var290);
                    }
                    if (var282 < 3 && (class6.field82[var282 + 1][var292][var291] & 0x8) != 0) {
                        method2026(var282 + 1, var292, var291, var289, var290);
                    }
                }
            }
            field495 = 0;
            for (int var293 = 0; var293 < 104; var293++) {
                for (int var294 = 0; var294 < 104; var294++) {
                    int var295 = Statics.field2621.method1698(Statics.field1086, var293, var294);
                    if (var295 != 0) {
                        int var296 = var295 >> 14 & 0x7FFF;
                        int var297 = class38.method150(var296).field887;
                        if (var297 >= 0) {
                            int var298 = var293;
                            int var299 = var294;
                            if (var297 != 22 && var297 != 29 && var297 != 34 && var297 != 36 && var297 != 46 && var297 != 47 && var297 != 48) {
                                int[][] var300 = field320[Statics.field1086].field3131;
                                for (int var301 = 0; var301 < 10; var301++) {
                                    int var302 = (int) (Math.random() * 4.0D);
                                    if (var302 == 0 && var298 > 0 && var298 > var293 - 3 && (var300[var298 - 1][var299] & 0x1240108) == 0) {
                                        var298--;
                                    }
                                    if (var302 == 1 && var298 < 103 && var298 < var293 + 3 && (var300[var298 + 1][var299] & 0x1240180) == 0) {
                                        var298++;
                                    }
                                    if (var302 == 2 && var299 > 0 && var299 > var294 - 3 && (var300[var298][var299 - 1] & 0x1240102) == 0) {
                                        var299--;
                                    }
                                    if (var302 == 3 && var299 < 103 && var299 < var294 + 3 && (var300[var298][var299 + 1] & 0x1240120) == 0) {
                                        var299++;
                                    }
                                }
                            }
                            field498[field495] = Statics.field17[var297];
                            field496[field495] = var298;
                            field497[field495] = var299;
                            field495++;
                        }
                    }
                }
            }
            Statics.field816.method1475();
        }
        if (field268 != 30) {
            return;
        }
        for (class16 var303 = (class16) field445.method3499(); var303 != null; var303 = (class16) field445.method3482()) {
            if (var303.field221 > 0) {
                var303.field221--;
            }
            if (var303.field221 != 0) {
                if (var303.field220 > 0) {
                    var303.field220--;
                }
                if (var303.field220 == 0 && var303.field214 >= 1 && var303.field213 >= 1 && var303.field214 <= 102 && var303.field213 <= 102 && (var303.field217 < 0 || class6.method6(var303.field217, var303.field219))) {
                    method37(var303.field224, var303.field210, var303.field214, var303.field213, var303.field217, var303.field215, var303.field219);
                    var303.field220 = -1;
                    if (var303.field226 == var303.field217 && var303.field226 == -1) {
                        var303.method3564();
                    } else if (var303.field226 == var303.field217 && var303.field225 == var303.field215 && var303.field228 == var303.field219) {
                        var303.method3564();
                    }
                }
            } else if (var303.field226 < 0 || class6.method6(var303.field226, var303.field228)) {
                method37(var303.field224, var303.field210, var303.field214, var303.field213, var303.field226, var303.field225, var303.field228);
                var303.method3564();
            }
        }
        int var10002;
        for (int var304 = 0; var304 < field507; var304++) {
            var10002 = field510[var304]--;
            if (field510[var304] >= -10) {
                class54 var306 = field336[var304];
                if (var306 == null) {
                    class54 var386 = (class54) null;
                    var306 = class54.method1129(Statics.field996, field508[var304], 0);
                    if (var306 == null) {
                        continue;
                    }
                    field510[var304] += var306.method1128();
                    field336[var304] = var306;
                }
                if (field510[var304] < 0) {
                    int var313;
                    if (field479[var304] == 0) {
                        var313 = field505;
                    } else {
                        int var307 = (field479[var304] & 0xFF) * 128;
                        int var308 = field479[var304] >> 16 & 0xFF;
                        int var309 = var308 * 128 + 64 - Statics.field571.field804;
                        if (var309 < 0) {
                            var309 = -var309;
                        }
                        int var310 = field479[var304] >> 8 & 0xFF;
                        int var311 = var310 * 128 + 64 - Statics.field571.field750;
                        if (var311 < 0) {
                            var311 = -var311;
                        }
                        int var312 = var309 + var311 - 128;
                        if (var312 > var307) {
                            field510[var304] = -100;
                            continue;
                        }
                        if (var312 < 0) {
                            var312 = 0;
                        }
                        var313 = field292 * (var307 - var312) / var307;
                    }
                    if (var313 > 0) {
                        class58 var314 = var306.method1122().method1162(Statics.field2529);
                        class60 var315 = class60.method1184(var314, 100, var313);
                        var315.method1187(field509[var304] - 1);
                        Statics.field2120.method1026(var315);
                    }
                    field510[var304] = -100;
                }
            } else {
                field507--;
                for (int var305 = var304; var305 < field507; var305++) {
                    field508[var305] = field508[var305 + 1];
                    field336[var305] = field336[var305 + 1];
                    field509[var305] = field509[var305 + 1];
                    field510[var305] = field510[var305 + 1];
                    field479[var305] = field479[var305 + 1];
                }
                var304--;
            }
        }
        if (field504) {
            boolean var316;
            if (class174.field2843 == 0) {
                var316 = Statics.field2842.method3278();
            } else {
                var316 = true;
            }
            if (!var316) {
                if (field487 != 0 && field503 != -1) {
                    Statics.method3179(Statics.field1311, field503, 0, field487, false);
                }
                field504 = false;
            }
        }
        field307++;
        if (field307 > 750) {
            method624();
            return;
        }
        for (int var317 = -1; var317 < field382; var317++) {
            int var318;
            if (var317 == -1) {
                var318 = 2047;
            } else {
                var318 = field383[var317];
            }
            class3 var319 = field381[var318];
            if (var319 != null) {
                method535(var319, 1);
            }
        }
        for (int var320 = 0; var320 < field300; var320++) {
            int var321 = field301[var320];
            class32 var322 = field299[var321];
            if (var322 != null) {
                method535(var322, var322.field725.field827);
            }
        }
        method2653();
        field422++;
        if (field371 != 0) {
            field370 += 20;
            if (field370 >= 400) {
                field371 = 0;
            }
        }
        if (Statics.field662 != null) {
            field372++;
            if (field372 >= 15) {
                method33(Statics.field662);
                Statics.field662 = null;
            }
        }
        class164 var323 = Statics.field552;
        class164 var324 = Statics.field142;
        Statics.field552 = null;
        Statics.field142 = null;
        field440 = null;
        field444 = false;
        field441 = false;
        field326 = 0;
        while (class129.method1843() && field326 < 128) {
            if (field430 >= 2 && class129.field2010[82] && Statics.field2002 == 66) {
                String var325 = "";
                Iterator var326 = class11.field153.iterator();
                while (var326.hasNext()) {
                    class33 var327 = (class33) var326.next();
                    var325 = var325 + var327.field726 + ':' + var327.field727 + '\n';
                }
                Statics.field232.setContents(new StringSelection(var325), (ClipboardOwner) null);
            } else {
                field490[field326] = Statics.field2002;
                field541[field326] = Statics.field1815;
                field326++;
            }
        }
        method1952(field423, 0, 0, Statics.field3047, Statics.field187, 0, 0);
        field448++;
        while (true) {
            class1 var330;
            class164 var331;
            class164 var332;
            do {
                var330 = (class1) field465.method3473();
                if (var330 == null) {
                    while (true) {
                        class1 var333;
                        class164 var334;
                        class164 var335;
                        do {
                            var333 = (class1) field466.method3473();
                            if (var333 == null) {
                                while (true) {
                                    class1 var336;
                                    class164 var337;
                                    class164 var338;
                                    do {
                                        var336 = (class1) field258.method3473();
                                        if (var336 == null) {
                                            method2549();
                                            if (field436 != null) {
                                                method33(field436);
                                                Statics.field3062++;
                                                if (field444 && field441) {
                                                    int var339 = class132.field2041;
                                                    int var340 = class132.field2050;
                                                    int var341 = var339 - field512;
                                                    int var342 = var340 - field266;
                                                    if (var341 < field538) {
                                                        var341 = field538;
                                                    }
                                                    if (field436.field2654 + var341 > field538 + field437.field2654) {
                                                        var341 = field538 + field437.field2654 - field436.field2654;
                                                    }
                                                    if (var342 < field491) {
                                                        var342 = field491;
                                                    }
                                                    if (field436.field2655 + var342 > field491 + field437.field2655) {
                                                        var342 = field491 + field437.field2655 - field436.field2655;
                                                    }
                                                    int var343 = var341 - field476;
                                                    int var344 = var342 - field397;
                                                    int var345 = field436.field2641;
                                                    if (Statics.field3062 > field436.field2698 && (var343 > var345 || var343 < -var345 || var344 > var345 || var344 < -var345)) {
                                                        field514 = true;
                                                    }
                                                    int var346 = field437.field2660 + (var341 - field538);
                                                    int var347 = field437.field2661 + (var342 - field491);
                                                    if (field436.field2726 != null && field514) {
                                                        class1 var348 = new class1();
                                                        var348.field10 = field436;
                                                        var348.field4 = var346;
                                                        var348.field5 = var347;
                                                        var348.field8 = field436.field2726;
                                                        class34.method74(var348);
                                                    }
                                                    if (class132.field2040 == 0) {
                                                        if (field514) {
                                                            if (field436.field2727 != null) {
                                                                class1 var349 = new class1();
                                                                var349.field10 = field436;
                                                                var349.field4 = var346;
                                                                var349.field5 = var347;
                                                                var349.field7 = field440;
                                                                var349.field8 = field436.field2727;
                                                                class34.method74(var349);
                                                            }
                                                            if (field440 != null) {
                                                                class164 var350 = field436;
                                                                int var351 = method683(var350);
                                                                int var352 = var351 >> 17 & 0x7;
                                                                int var353 = var352;
                                                                class164 var354;
                                                                if (var352 == 0) {
                                                                    var354 = null;
                                                                } else {
                                                                    int var355 = 0;
                                                                    while (true) {
                                                                        if (var355 >= var353) {
                                                                            var354 = var350;
                                                                            break;
                                                                        }
                                                                        var350 = class164.method2499(var350.field2658);
                                                                        if (var350 == null) {
                                                                            var354 = null;
                                                                            break;
                                                                        }
                                                                        var355++;
                                                                    }
                                                                }
                                                                if (var354 != null) {
                                                                    field302.method2477(223);
                                                                    field302.method2252(field436.field2757);
                                                                    field302.method2205(field440.field2757);
                                                                    field302.method2424(field440.field2640);
                                                                    field302.method2266(field440.field2710);
                                                                    field302.method2314(field436.field2710);
                                                                    field302.method2205(field436.field2640);
                                                                }
                                                            }
                                                        } else if ((field403 == 1 || method2873(field405 - 1)) && field405 > 2) {
                                                            method7(field512 + field476, field397 + field266);
                                                        } else if (field405 > 0) {
                                                            int var356 = field512 + field476;
                                                            int var357 = field397 + field266;
                                                            class29 var358 = Statics.field710;
                                                            method1106(var358.field665, var358.field664, var358.field667, var358.field666, var358.field669, var358.field669, var356, var357);
                                                            Statics.field710 = null;
                                                        }
                                                        field436 = null;
                                                    }
                                                } else if (Statics.field3062 > 1) {
                                                    field436 = null;
                                                }
                                            }
                                            if (Statics.field1014 != null) {
                                                method33(Statics.field1014);
                                                field379++;
                                                if (class132.field2040 == 0) {
                                                    if (field378) {
                                                        if (Statics.field164 == Statics.field1014 && field377 != field374) {
                                                            class164 var359 = Statics.field1014;
                                                            byte var360 = 0;
                                                            if (field500 == 1 && var359.field2717 == 206) {
                                                                var360 = 1;
                                                            }
                                                            if (var359.field2755[field377] <= 0) {
                                                                var360 = 0;
                                                            }
                                                            if (class169.method177(method683(var359))) {
                                                                int var361 = field374;
                                                                int var362 = field377;
                                                                var359.field2755[var362] = var359.field2755[var361];
                                                                var359.field2665[var362] = var359.field2665[var361];
                                                                var359.field2755[var361] = -1;
                                                                var359.field2665[var361] = 0;
                                                            } else if (var360 == 1) {
                                                                int var363 = field374;
                                                                int var364 = field377;
                                                                while (var363 != var364) {
                                                                    if (var363 > var364) {
                                                                        var359.method3105(var363 - 1, var363);
                                                                        var363--;
                                                                    } else if (var363 < var364) {
                                                                        var359.method3105(var363 + 1, var363);
                                                                        var363++;
                                                                    }
                                                                }
                                                            } else {
                                                                var359.method3105(field377, field374);
                                                            }
                                                            field302.method2477(36);
                                                            field302.method2252(field374);
                                                            field302.method2424(field377);
                                                            field302.method2204(var360);
                                                            field302.method2314(Statics.field1014.field2710);
                                                        }
                                                    } else if ((field403 == 1 || method2873(field405 - 1)) && field405 > 2) {
                                                        method7(field375, field451);
                                                    } else if (field405 > 0) {
                                                        int var365 = field375;
                                                        int var366 = field451;
                                                        class29 var367 = Statics.field710;
                                                        method1106(var367.field665, var367.field664, var367.field667, var367.field666, var367.field669, var367.field669, var365, var366);
                                                        Statics.field710 = null;
                                                    }
                                                    field372 = 10;
                                                    class132.field2047 = 0;
                                                    Statics.field1014 = null;
                                                } else if (field379 >= 5 && (class132.field2041 > field375 + 5 || class132.field2041 < field375 - 5 || class132.field2050 > field451 + 5 || class132.field2050 < field451 - 5)) {
                                                    field378 = true;
                                                }
                                            }
                                            if (class81.field1412 != -1) {
                                                int var368 = class81.field1412;
                                                int var369 = class81.field1413;
                                                field302.method2477(69);
                                                field302.method2204(5);
                                                field302.method2424(Statics.field120 + var368);
                                                field302.method2324(class129.field2010[82] ? (class129.field2010[81] ? 2 : 1) : 0);
                                                field302.method2251(Statics.field124 + var369);
                                                class81.field1412 = -1;
                                                field368 = class132.field2049;
                                                field369 = class132.field2055;
                                                field371 = 1;
                                                field370 = 0;
                                                field499 = var368;
                                                field364 = var369;
                                            }
                                            if (Statics.field552 != var323) {
                                                if (var323 != null) {
                                                    method33(var323);
                                                }
                                                if (Statics.field552 != null) {
                                                    method33(Statics.field552);
                                                }
                                            }
                                            if (Statics.field142 != var324 && field415 == field414) {
                                                if (var324 != null) {
                                                    method33(var324);
                                                }
                                                if (Statics.field142 != null) {
                                                    method33(Statics.field142);
                                                }
                                            }
                                            if (Statics.field142 == null) {
                                                if (field414 > 0) {
                                                    field414--;
                                                }
                                            } else if (field414 < field415) {
                                                field414++;
                                                if (field415 == field414) {
                                                    method33(Statics.field142);
                                                }
                                            }
                                            method2932();
                                            if (field513) {
                                                method2146();
                                            }
                                            for (int var370 = 0; var370 < 5; var370++) {
                                                var10002 = field518[var370]++;
                                            }
                                            int var371 = ++class132.field2037 - 1;
                                            int var373 = class129.field2013;
                                            if (var371 > 15000 && var373 > 15000) {
                                                field524 = 250;
                                                class132.field2037 = 14500;
                                                field302.method2477(191);
                                            }
                                            field330++;
                                            if (field330 > 500) {
                                                field330 = 0;
                                                int var375 = (int) (Math.random() * 8.0D);
                                                if ((var375 & 0x1) == 1) {
                                                    field354 += field489;
                                                }
                                                if ((var375 & 0x2) == 2) {
                                                    field344 += field327;
                                                }
                                                if ((var375 & 0x4) == 4) {
                                                    field328 += field289;
                                                }
                                            }
                                            if (field354 < -50) {
                                                field489 = 2;
                                            }
                                            if (field354 > 50) {
                                                field489 = -2;
                                            }
                                            if (field344 < -55) {
                                                field327 = 2;
                                            }
                                            if (field344 > 55) {
                                                field327 = -2;
                                            }
                                            if (field328 < -40) {
                                                field289 = 1;
                                            }
                                            if (field328 > 40) {
                                                field289 = -1;
                                            }
                                            field335++;
                                            if (field335 > 500) {
                                                field335 = 0;
                                                int var376 = (int) (Math.random() * 8.0D);
                                                if ((var376 & 0x1) == 1) {
                                                    field269 += field332;
                                                }
                                                if ((var376 & 0x2) == 2) {
                                                    field429 += field334;
                                                }
                                            }
                                            if (field269 < -60) {
                                                field332 = 2;
                                            }
                                            if (field269 > 60) {
                                                field332 = -2;
                                            }
                                            if (field429 < -20) {
                                                field334 = 1;
                                            }
                                            if (field429 > 10) {
                                                field334 = -1;
                                            }
                                            for (class36 var377 = (class36) field535.method3424(); var377 != null; var377 = (class36) field535.method3422()) {
                                                if ((long) var377.field817 < class107.method2661() / 1000L - 5L) {
                                                    if (var377.field820 > 0) {
                                                        class11.method626(5, "", var377.field814 + class148.field2345);
                                                    }
                                                    if (var377.field820 == 0) {
                                                        class11.method626(5, "", var377.field814 + class148.field2346);
                                                    }
                                                    var377.method3562();
                                                }
                                            }
                                            field373++;
                                            if (field373 > 50) {
                                                field302.method2477(5);
                                            }
                                            try {
                                                if (Statics.field1863 != null && field302.field1861 > 0) {
                                                    Statics.field1863.method2717(field302.field1860, 0, field302.field1861);
                                                    field302.field1861 = 0;
                                                    field373 = 0;
                                                }
                                            } catch (IOException var379) {
                                                method624();
                                            }
                                            return;
                                        }
                                        var337 = var336.field10;
                                        if (var337.field2640 < 0) {
                                            break;
                                        }
                                        var338 = class164.method2499(var337.field2658);
                                    } while (var338 == null || var338.field2761 == null || var337.field2640 >= var338.field2761.length || var338.field2761[var337.field2640] != var337);
                                    class34.method74(var336);
                                }
                            }
                            var334 = var333.field10;
                            if (var334.field2640 < 0) {
                                break;
                            }
                            var335 = class164.method2499(var334.field2658);
                        } while (var335 == null || var335.field2761 == null || var334.field2640 >= var335.field2761.length || var335.field2761[var334.field2640] != var334);
                        class34.method74(var333);
                    }
                }
                var331 = var330.field10;
                if (var331.field2640 < 0) {
                    break;
                }
                var332 = class164.method2499(var331.field2658);
            } while (var332 == null || var332.field2761 == null || var331.field2640 >= var332.field2761.length || var332.field2761[var331.field2640] != var331);
            class34.method74(var330);
        }
    }

    @ObfuscatedName("an.d(B)V")
    public static final void method986() {
        if (Statics.field185 != null) {
            Statics.field185.method1069();
        }
        if (Statics.field602 != null) {
            Statics.field602.method1069();
        }
    }

    @ObfuscatedName("w.b(Law;IIIB)V")
    public static void method529(class40 arg0, int arg1, int arg2, int arg3) {
        if (field507 >= 50 || field292 == 0 || arg0.field930 == null || arg1 >= arg0.field930.length) {
            return;
        }
        int var4 = arg0.field930[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field508[field507] = var5;
        field509[field507] = var6;
        field510[field507] = 0;
        field336[field507] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field479[field507] = (var8 << 16) + (var9 << 8) + var7;
        field507++;
    }

    @ObfuscatedName("g.e(IIII)V")
    public static void method25(int arg0, int arg1, int arg2) {
        if (field505 == 0 || arg1 == 0 || field507 >= 50) {
            return;
        }
        field508[field507] = arg0;
        field509[field507] = arg1;
        field510[field507] = arg2;
        field336[field507] = null;
        field479[field507] = 0;
        field507++;
    }

    @ObfuscatedName("gt.ar(II)V")
    public static void method3568(int arg0) {
        if (arg0 == -1 && !field504) {
            Statics.field2842.method3277();
            class174.field2843 = 1;
            Statics.field2844 = null;
        } else if (arg0 != -1 && field503 != arg0 && field487 != 0 && !field504) {
            class159 var1 = Statics.field1311;
            int var2 = field487;
            class174.field2843 = 1;
            Statics.field2844 = var1;
            Statics.field1279 = arg0;
            Statics.field722 = 0;
            Statics.field2793 = var2;
            Statics.field159 = false;
            Statics.field2845 = 2;
        }
        field503 = arg0;
    }

    @ObfuscatedName("dm.av(Lfu;IIB)V")
    public static final void method2153(class164 arg0, int arg1, int arg2) {
        if (field501 != 0 && field501 != 3 || class132.field2047 != 1 && Statics.field1276 || class132.field2047 != 4) {
            return;
        }
        class166 var3 = arg0.method3073();
        if (var3 == null) {
            return;
        }
        int var4 = class132.field2049 - arg1;
        int var5 = class132.field2055 - arg2;
        if (!var3.method3113(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2783 / 2;
        int var7 = var5 - var3.field2782 / 2;
        int var8 = field346 + field269 & 0x7FF;
        int var9 = class86.field1501[var8];
        int var10 = class86.field1478[var8];
        int var11 = (field429 + 256) * var9 >> 8;
        int var12 = (field429 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field571.field804 + var13 >> 7;
        int var16 = Statics.field571.field750 - var14 >> 7;
        field302.method2477(84);
        field302.method2204(18);
        field302.method2424(Statics.field120 + var15);
        field302.method2324(class129.field2010[82] ? (class129.field2010[81] ? 2 : 1) : 0);
        field302.method2251(Statics.field124 + var16);
        field302.method2204(var6);
        field302.method2204(var7);
        field302.method2205(field346);
        field302.method2204(57);
        field302.method2204(field269);
        field302.method2204(field429);
        field302.method2204(89);
        field302.method2205(Statics.field571.field804);
        field302.method2205(Statics.field571.field750);
        field302.method2204(63);
        field499 = var15;
        field364 = var16;
    }

    @ObfuscatedName("dt.ae(B)V")
    public static final void method2653() {
        for (int var0 = -1; var0 < field382; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field383[var0];
            }
            class3 var2 = field381[var1];
            if (var2 != null && var2.field765 > 0) {
                var2.field765--;
                if (var2.field765 == 0) {
                    var2.field776 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field300; var3++) {
            int var4 = field301[var3];
            class32 var5 = field299[var4];
            if (var5 != null && var5.field765 > 0) {
                var5.field765--;
                if (var5.field765 == 0) {
                    var5.field776 = null;
                }
            }
        }
    }

    @ObfuscatedName("dp.aq(I)V")
    public static final void method2146() {
        int var0 = Statics.field813 * 128 + 64;
        int var1 = Statics.field2975 * 128 + 64;
        int var2 = method3111(var0, var1, Statics.field1086) - Statics.field1011;
        if (Statics.field962 < var0) {
            Statics.field962 += Statics.field608 * (var0 - Statics.field962) / 1000 + Statics.field1937;
            if (Statics.field962 > var0) {
                Statics.field962 = var0;
            }
        }
        if (Statics.field962 > var0) {
            Statics.field962 -= Statics.field608 * (Statics.field962 - var0) / 1000 + Statics.field1937;
            if (Statics.field962 < var0) {
                Statics.field962 = var0;
            }
        }
        if (Statics.field565 < var2) {
            Statics.field565 += Statics.field608 * (var2 - Statics.field565) / 1000 + Statics.field1937;
            if (Statics.field565 > var2) {
                Statics.field565 = var2;
            }
        }
        if (Statics.field565 > var2) {
            Statics.field565 -= Statics.field608 * (Statics.field565 - var2) / 1000 + Statics.field1937;
            if (Statics.field565 < var2) {
                Statics.field565 = var2;
            }
        }
        if (Statics.field1305 < var1) {
            Statics.field1305 += Statics.field608 * (var1 - Statics.field1305) / 1000 + Statics.field1937;
            if (Statics.field1305 > var1) {
                Statics.field1305 = var1;
            }
        }
        if (Statics.field1305 > var1) {
            Statics.field1305 -= Statics.field608 * (Statics.field1305 - var1) / 1000 + Statics.field1937;
            if (Statics.field1305 < var1) {
                Statics.field1305 = var1;
            }
        }
        int var3 = Statics.field573 * 128 + 64;
        int var4 = Statics.field1369 * 128 + 64;
        int var5 = method3111(var3, var4, Statics.field1086) - Statics.field1119;
        int var6 = var3 - Statics.field962;
        int var7 = var5 - Statics.field565;
        int var8 = var4 - Statics.field1305;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field802 < var10) {
            Statics.field802 += Statics.field197 * (var10 - Statics.field802) / 1000 + Statics.field1896;
            if (Statics.field802 > var10) {
                Statics.field802 = var10;
            }
        }
        if (Statics.field802 > var10) {
            Statics.field802 -= Statics.field197 * (Statics.field802 - var10) / 1000 + Statics.field1896;
            if (Statics.field802 < var10) {
                Statics.field802 = var10;
            }
        }
        int var12 = var11 - Statics.field66;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field66 += Statics.field197 * var12 / 1000 + Statics.field1896;
            Statics.field66 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field66 -= Statics.field197 * -var12 / 1000 + Statics.field1896;
            Statics.field66 &= 0x7FF;
        }
        int var13 = var11 - Statics.field66;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field66 = var11;
        }
    }

    @ObfuscatedName("et.ay(I)V")
    public static final void method2932() {
        int var0 = field354 + Statics.field571.field804;
        int var1 = field344 + Statics.field571.field750;
        if (Statics.field1669 - var0 < -500 || Statics.field1669 - var0 > 500 || Statics.field2129 - var1 < -500 || Statics.field2129 - var1 > 500) {
            Statics.field1669 = var0;
            Statics.field2129 = var1;
        }
        if (Statics.field1669 != var0) {
            Statics.field1669 += (var0 - Statics.field1669) / 16;
        }
        if (Statics.field2129 != var1) {
            Statics.field2129 += (var1 - Statics.field2129) / 16;
        }
        if (class132.field2040 == 4 && Statics.field1276) {
            int var2 = class132.field2050 - field350;
            field363 = var2 * 2;
            field350 = var2 == -1 || var2 == 1 ? class132.field2050 : (field350 + class132.field2050) / 2;
            int var3 = field349 - class132.field2041;
            field347 = var3 * 2;
            field349 = var3 == -1 || var3 == 1 ? class132.field2041 : (field349 + class132.field2041) / 2;
        } else {
            if (class129.field2010[96]) {
                field347 += (-24 - field347) / 2;
            } else if (class129.field2010[97]) {
                field347 += (24 - field347) / 2;
            } else {
                field347 /= 2;
            }
            if (class129.field2010[98]) {
                field363 += (12 - field363) / 2;
            } else if (class129.field2010[99]) {
                field363 += (-12 - field363) / 2;
            } else {
                field363 /= 2;
            }
            field350 = class132.field2050;
            field349 = class132.field2041;
        }
        field346 = field347 / 2 + field346 & 0x7FF;
        field345 += field363 / 2;
        if (field345 < 128) {
            field345 = 128;
        }
        if (field345 > 383) {
            field345 = 383;
        }
        int var4 = Statics.field1669 >> 7;
        int var5 = Statics.field2129 >> 7;
        int var6 = method3111(Statics.field1669, Statics.field2129, Statics.field1086);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1086;
                    if (var10 < 3 && (class6.field82[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field88[var10][var8][var9];
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
        if (var12 > field353) {
            field353 += (var12 - field353) / 24;
        } else if (var12 < field353) {
            field353 += (var12 - field353) / 80;
        }
    }

    @ObfuscatedName("w.ac(Lat;II)V")
    public static final void method535(class35 arg0, int arg1) {
        if (arg0.field794 > field270) {
            method774(arg0);
        } else if (arg0.field795 >= field270) {
            method2694(arg0);
        } else {
            method836(arg0);
        }
        if (arg0.field804 < 128 || arg0.field750 < 128 || arg0.field804 >= 13184 || arg0.field750 >= 13184) {
            arg0.field793 = -1;
            arg0.field785 = -1;
            arg0.field794 = 0;
            arg0.field795 = 0;
            arg0.field804 = arg0.field803[0] * 128 + arg0.field753 * 64;
            arg0.field750 = arg0.field786[0] * 128 + arg0.field753 * 64;
            arg0.method658();
        }
        if (Statics.field571 == arg0 && (arg0.field804 < 1536 || arg0.field750 < 1536 || arg0.field804 >= 11776 || arg0.field750 >= 11776)) {
            arg0.field793 = -1;
            arg0.field785 = -1;
            arg0.field794 = 0;
            arg0.field795 = 0;
            arg0.field804 = arg0.field803[0] * 128 + arg0.field753 * 64;
            arg0.field750 = arg0.field786[0] * 128 + arg0.field753 * 64;
            arg0.method658();
        }
        method3567(arg0);
        arg0.field752 = false;
        if (arg0.field777 != -1) {
            class40 var2 = class40.method567(arg0.field777);
            if (var2 == null || var2.field927 == null) {
                arg0.field777 = -1;
            } else {
                arg0.field779++;
                if (arg0.field778 < var2.field927.length && arg0.field779 > var2.field929[arg0.field778]) {
                    arg0.field779 = 1;
                    arg0.field778++;
                    method529(var2, arg0.field778, arg0.field804, arg0.field750);
                }
                if (arg0.field778 >= var2.field927.length) {
                    arg0.field779 = 0;
                    arg0.field778 = 0;
                    method529(var2, arg0.field778, arg0.field804, arg0.field750);
                }
            }
        }
        if (arg0.field785 != -1 && field270 >= arg0.field792) {
            if (arg0.field783 < 0) {
                arg0.field783 = 0;
            }
            int var3 = class41.method2537(arg0.field785).field954;
            if (var3 == -1) {
                arg0.field785 = -1;
            } else {
                class40 var4 = class40.method567(var3);
                if (var4 == null || var4.field927 == null) {
                    arg0.field785 = -1;
                } else {
                    arg0.field787++;
                    if (arg0.field783 < var4.field927.length && arg0.field787 > var4.field929[arg0.field783]) {
                        arg0.field787 = 1;
                        arg0.field783++;
                        method529(var4, arg0.field783, arg0.field804, arg0.field750);
                    }
                    if (arg0.field783 >= var4.field927.length && (arg0.field783 < 0 || arg0.field783 >= var4.field927.length)) {
                        arg0.field785 = -1;
                    }
                }
            }
        }
        if (arg0.field793 != -1 && arg0.field770 <= 1) {
            class40 var5 = class40.method567(arg0.field793);
            if (var5.field938 == 1 && arg0.field807 > 0 && arg0.field794 <= field270 && arg0.field795 < field270) {
                arg0.field770 = 1;
                return;
            }
        }
        if (arg0.field793 != -1 && arg0.field770 == 0) {
            class40 var6 = class40.method567(arg0.field793);
            if (var6 == null || var6.field927 == null) {
                arg0.field793 = -1;
            } else {
                arg0.field782++;
                if (arg0.field781 < var6.field927.length && arg0.field782 > var6.field929[arg0.field781]) {
                    arg0.field782 = 1;
                    arg0.field781++;
                    method529(var6, arg0.field781, arg0.field804, arg0.field750);
                }
                if (arg0.field781 >= var6.field927.length) {
                    arg0.field781 -= var6.field924;
                    arg0.field784++;
                    if (arg0.field784 >= var6.field937) {
                        arg0.field793 = -1;
                    } else if (arg0.field781 >= 0 && arg0.field781 < var6.field927.length) {
                        method529(var6, arg0.field781, arg0.field804, arg0.field750);
                    } else {
                        arg0.field793 = -1;
                    }
                }
                arg0.field752 = var6.field933;
            }
        }
        if (arg0.field770 > 0) {
            arg0.field770--;
        }
    }

    @ObfuscatedName("ad.ao(Lat;I)V")
    public static final void method774(class35 arg0) {
        int var1 = arg0.field794 - field270;
        int var2 = arg0.field790 * 128 + arg0.field753 * 64;
        int var3 = arg0.field797 * 128 + arg0.field753 * 64;
        arg0.field804 += (var2 - arg0.field804) / var1;
        arg0.field750 += (var3 - arg0.field750) / var1;
        arg0.field806 = 0;
        if (arg0.field766 == 0) {
            arg0.field811 = 1024;
        }
        if (arg0.field766 == 1) {
            arg0.field811 = 1536;
        }
        if (arg0.field766 == 2) {
            arg0.field811 = 0;
        }
        if (arg0.field766 == 3) {
            arg0.field811 = 512;
        }
    }

    @ObfuscatedName("ec.ab(Lat;I)V")
    public static final void method2694(class35 arg0) {
        if (field270 == arg0.field795 || arg0.field793 == -1 || arg0.field770 != 0 || arg0.field782 + 1 > class40.method567(arg0.field793).field929[arg0.field781]) {
            int var1 = arg0.field795 - arg0.field794;
            int var2 = field270 - arg0.field794;
            int var3 = arg0.field790 * 128 + arg0.field753 * 64;
            int var4 = arg0.field797 * 128 + arg0.field753 * 64;
            int var5 = arg0.field791 * 128 + arg0.field753 * 64;
            int var6 = arg0.field753 * 64 + arg0.field751 * 128;
            arg0.field804 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field750 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field806 = 0;
        if (arg0.field766 == 0) {
            arg0.field811 = 1024;
        }
        if (arg0.field766 == 1) {
            arg0.field811 = 1536;
        }
        if (arg0.field766 == 2) {
            arg0.field811 = 0;
        }
        if (arg0.field766 == 3) {
            arg0.field811 = 512;
        }
        arg0.field749 = arg0.field811;
    }

    @ObfuscatedName("az.at(Lat;I)V")
    public static final void method836(class35 arg0) {
        arg0.field777 = arg0.field754;
        if (arg0.field762 == 0) {
            arg0.field806 = 0;
            return;
        }
        if (arg0.field793 != -1 && arg0.field770 == 0) {
            class40 var1 = class40.method567(arg0.field793);
            if (arg0.field807 > 0 && var1.field938 == 0) {
                arg0.field806++;
                return;
            }
            if (arg0.field807 <= 0 && var1.field939 == 0) {
                arg0.field806++;
                return;
            }
        }
        int var2 = arg0.field804;
        int var3 = arg0.field750;
        int var4 = arg0.field803[arg0.field762 - 1] * 128 + arg0.field753 * 64;
        int var5 = arg0.field786[arg0.field762 - 1] * 128 + arg0.field753 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field804 = var4;
            arg0.field750 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field811 = 1280;
            } else if (var3 > var5) {
                arg0.field811 = 1792;
            } else {
                arg0.field811 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field811 = 768;
            } else if (var3 > var5) {
                arg0.field811 = 256;
            } else {
                arg0.field811 = 512;
            }
        } else if (var3 < var5) {
            arg0.field811 = 1024;
        } else if (var3 > var5) {
            arg0.field811 = 0;
        }
        int var6 = arg0.field811 - arg0.field749 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field758;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field757;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field760;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field759;
        }
        if (var7 == -1) {
            var7 = arg0.field757;
        }
        arg0.field777 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class32) {
            var9 = ((class32) arg0).field725.field832;
        }
        if (var9) {
            if (arg0.field811 != arg0.field749 && arg0.field788 == -1 && arg0.field801 != 0) {
                var8 = 2;
            }
            if (arg0.field762 > 2) {
                var8 = 6;
            }
            if (arg0.field762 > 3) {
                var8 = 8;
            }
            if (arg0.field806 > 0 && arg0.field762 > 1) {
                var8 = 8;
                arg0.field806--;
            }
        } else {
            if (arg0.field762 > 1) {
                var8 = 6;
            }
            if (arg0.field762 > 2) {
                var8 = 8;
            }
            if (arg0.field806 > 0 && arg0.field762 > 1) {
                var8 = 8;
                arg0.field806--;
            }
        }
        if (arg0.field805[arg0.field762 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field777 == arg0.field757 && arg0.field799 != -1) {
            arg0.field777 = arg0.field799;
        }
        if (var2 < var4) {
            arg0.field804 += var8;
            if (arg0.field804 > var4) {
                arg0.field804 = var4;
            }
        } else if (var2 > var4) {
            arg0.field804 -= var8;
            if (arg0.field804 < var4) {
                arg0.field804 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field750 += var8;
            if (arg0.field750 > var5) {
                arg0.field750 = var5;
            }
        } else if (var3 > var5) {
            arg0.field750 -= var8;
            if (arg0.field750 < var5) {
                arg0.field750 = var5;
            }
        }
        if (arg0.field804 == var4 && arg0.field750 == var5) {
            arg0.field762--;
            if (arg0.field807 > 0) {
                arg0.field807--;
            }
        }
    }

    @ObfuscatedName("gt.ai(Lat;S)V")
    public static final void method3567(class35 arg0) {
        if (arg0.field801 == 0) {
            return;
        }
        if (arg0.field788 != -1 && arg0.field788 < 32768) {
            class32 var1 = field299[arg0.field788];
            if (var1 != null) {
                int var2 = arg0.field804 - var1.field804;
                int var3 = arg0.field750 - var1.field750;
                if (var2 != 0 || var3 != 0) {
                    arg0.field811 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field788 >= 32768) {
            int var4 = arg0.field788 - 32768;
            if (field281 == var4) {
                var4 = 2047;
            }
            class3 var5 = field381[var4];
            if (var5 != null) {
                int var6 = arg0.field804 - var5.field804;
                int var7 = arg0.field750 - var5.field750;
                if (var6 != 0 || var7 != 0) {
                    arg0.field811 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field775 != 0 || arg0.field780 != 0) && (arg0.field762 == 0 || arg0.field806 > 0)) {
            int var8 = arg0.field804 - (arg0.field775 * 64 - Statics.field120 * 64 - Statics.field120 * 64);
            int var9 = arg0.field750 - (arg0.field780 * 64 - Statics.field124 * 64 - Statics.field124 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field811 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field775 = 0;
            arg0.field780 = 0;
        }
        int var10 = arg0.field811 - arg0.field749 & 0x7FF;
        if (var10 == 0) {
            arg0.field800 = 0;
            return;
        }
        arg0.field800++;
        if (var10 > 1024) {
            arg0.field749 -= arg0.field801;
            boolean var11 = true;
            if (var10 < arg0.field801 || var10 > 2048 - arg0.field801) {
                arg0.field749 = arg0.field811;
                var11 = false;
            }
            if (arg0.field777 == arg0.field754 && (arg0.field800 > 25 || var11)) {
                if (arg0.field755 == -1) {
                    arg0.field777 = arg0.field757;
                } else {
                    arg0.field777 = arg0.field755;
                }
            }
        } else {
            arg0.field749 += arg0.field801;
            boolean var12 = true;
            if (var10 < arg0.field801 || var10 > 2048 - arg0.field801) {
                arg0.field749 = arg0.field811;
                var12 = false;
            }
            if (arg0.field777 == arg0.field754 && (arg0.field800 > 25 || var12)) {
                if (arg0.field756 == -1) {
                    arg0.field777 = arg0.field757;
                } else {
                    arg0.field777 = arg0.field756;
                }
            }
        }
        arg0.field749 &= 0x7FF;
    }

    @ObfuscatedName("bu.aa(Lg;III)V")
    public static void method1473(class3 arg0, int arg1, int arg2) {
        if (arg0.field793 == arg1 && arg1 != -1) {
            int var3 = class40.method567(arg1).field940;
            if (var3 == 1) {
                arg0.field781 = 0;
                arg0.field782 = 0;
                arg0.field770 = arg2;
                arg0.field784 = 0;
            }
            if (var3 == 2) {
                arg0.field784 = 0;
            }
        } else if (arg1 == -1 || arg0.field793 == -1 || class40.method567(arg1).field934 >= class40.method567(arg0.field793).field934) {
            arg0.field793 = arg1;
            arg0.field781 = 0;
            arg0.field782 = 0;
            arg0.field770 = arg2;
            arg0.field784 = 0;
            arg0.field807 = arg0.field762;
        }
    }

    @ObfuscatedName("c.ap(I)I")
    public static int method112() {
        return field340 ? 2 : 1;
    }

    @ObfuscatedName("de.ad(I)V")
    public static void method2546() {
        client var0 = Statics.field254;
        synchronized (Statics.field254) {
            Container var1 = Statics.field254.method2784();
            if (var1 != null) {
                Statics.field1857 = Math.max(var1.getSize().width, Statics.field212);
                Statics.field936 = Math.max(var1.getSize().height, Statics.field1958);
                if (Statics.field732 == var1) {
                    Insets var2 = Statics.field732.getInsets();
                    Statics.field1857 -= var2.right + var2.left;
                    Statics.field936 -= var2.top + var2.bottom;
                }
                if (Statics.field1857 <= 0) {
                    Statics.field1857 = 1;
                }
                if (Statics.field936 <= 0) {
                    Statics.field936 = 1;
                }
                if (method112() == 1) {
                    Statics.field3047 = field480;
                    Statics.field187 = field255 * 503;
                } else {
                    Statics.field3047 = Math.min(Statics.field1857, 7680);
                    Statics.field187 = Math.min(Statics.field936, 2160);
                }
                field2092 = (Statics.field1857 - Statics.field3047) / 2;
                field2087 = 0;
                Statics.field594.setSize(Statics.field3047, Statics.field187);
                Statics.field816 = class73.method813(Statics.field3047, Statics.field187, Statics.field594);
                if (Statics.field732 == var1) {
                    Insets var3 = Statics.field732.getInsets();
                    Statics.field594.setLocation(field2092 + var3.left, field2087 + var3.top);
                } else {
                    Statics.field594.setLocation(field2092, field2087);
                }
                int var4 = Statics.field3047;
                int var5 = Statics.field187;
                if (Statics.field1857 < var4) {
                    int var6 = Statics.field1857;
                }
                if (Statics.field936 < var5) {
                    int var7 = Statics.field936;
                }
                if (Statics.field1877 != null) {
                    try {
                        class124.method2570(Statics.field254, "resize", new Object[] { method112() });
                    } catch (Throwable var10) {
                    }
                }
                if (field423 != -1) {
                    method1108(true);
                }
                Statics.method1107();
            }
        }
    }

    @ObfuscatedName("p.ax(I)V")
    public static final void method544() {
        if (field423 != -1) {
            int var0 = field423;
            if (class164.method817(var0)) {
                method2519(Statics.field2743[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field468; var1++) {
            if (field486[var1]) {
                field471[var1] = true;
            }
            field452[var1] = field486[var1];
            field486[var1] = false;
        }
        field469 = field270;
        field412 = -1;
        field413 = -1;
        Statics.field164 = null;
        if (field423 != -1) {
            field468 = 0;
            method811(field423, 0, 0, Statics.field3047, Statics.field187, 0, 0, -1);
        }
        class75.method1601();
        if (field404) {
            method2132();
        } else if (field412 != -1) {
            int var2 = field412;
            int var3 = field413;
            if (field405 >= 2 || field416 != 0 || field418) {
                String var4;
                if (field416 == 1 && field405 < 2) {
                    var4 = class148.field2217 + class148.field2358 + field417 + " " + class2.field23;
                } else if (field418 && field405 < 2) {
                    var4 = field421 + class148.field2358 + field389 + " " + class2.field23;
                } else {
                    var4 = method586(field405 - 1);
                }
                if (field405 > 2) {
                    var4 = var4 + class2.method3034(16777215) + " " + '/' + " " + (field405 - 2) + class148.field2352;
                }
                Statics.field250.method3655(var4, var2 + 4, var3 + 15, 16777215, 0, field270 / 1000);
            }
        }
        if (field477 == 3) {
            for (int var5 = 0; var5 < field468; var5++) {
                if (field452[var5]) {
                    class75.method1591(field316[var5], field426[var5], field475[var5], field493[var5], 16711935, 128);
                } else if (field471[var5]) {
                    class75.method1591(field316[var5], field426[var5], field475[var5], field493[var5], 16711680, 128);
                }
            }
        }
        int var6 = Statics.field1086;
        int var7 = Statics.field571.field804;
        int var8 = Statics.field571.field750;
        int var9 = field422;
        for (class22 var10 = (class22) class22.field583.method3499(); var10 != null; var10 = (class22) class22.field583.method3482()) {
            if (var10.field584 != -1 || var10.field588 != null) {
                int var11 = 0;
                if (var7 > var10.field581) {
                    var11 += var7 - var10.field581;
                } else if (var7 < var10.field582) {
                    var11 += var10.field582 - var7;
                }
                if (var8 > var10.field590) {
                    var11 += var8 - var10.field590;
                } else if (var8 < var10.field580) {
                    var11 += var10.field580 - var8;
                }
                if (var11 - 64 > var10.field579 || field292 == 0 || var10.field578 != var6) {
                    if (var10.field585 != null) {
                        Statics.field2120.method1032(var10.field585);
                        var10.field585 = null;
                    }
                    if (var10.field596 != null) {
                        Statics.field2120.method1032(var10.field596);
                        var10.field596 = null;
                    }
                } else {
                    var11 -= 64;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = field292 * (var10.field579 - var11) / var10.field579;
                    class54 var10000;
                    if (var10.field585 != null) {
                        var10.field585.method1188(var12);
                    } else if (var10.field584 >= 0) {
                        var10000 = (class54) null;
                        class54 var13 = class54.method1129(Statics.field996, var10.field584, 0);
                        if (var13 != null) {
                            class58 var14 = var13.method1122().method1162(Statics.field2529);
                            class60 var15 = class60.method1184(var14, 100, var12);
                            var15.method1187(-1);
                            Statics.field2120.method1026(var15);
                            var10.field585 = var15;
                        }
                    }
                    if (var10.field596 != null) {
                        var10.field596.method1188(var12);
                        if (!var10.field596.method3566()) {
                            var10.field596 = null;
                        }
                    } else if (var10.field588 != null && (var10.field592 -= var9) <= 0) {
                        int var16 = (int) (Math.random() * (double) var10.field588.length);
                        var10000 = (class54) null;
                        class54 var17 = class54.method1129(Statics.field996, var10.field588[var16], 0);
                        if (var17 != null) {
                            class58 var18 = var17.method1122().method1162(Statics.field2529);
                            class60 var19 = class60.method1184(var18, 100, var12);
                            var19.method1187(0);
                            Statics.field2120.method1026(var19);
                            var10.field596 = var19;
                            var10.field592 = var10.field586 + (int) (Math.random() * (double) (var10.field587 - var10.field586));
                        }
                    }
                }
            }
        }
        field422 = 0;
    }

    @ObfuscatedName("h.az(Ljava/lang/String;ZI)V")
    public static final void method178(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1540.method3653(arg0, 250);
        int var6 = Statics.field1540.method3654(arg0, 250) * 13;
        class75.method1592(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1640(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1540.method3734(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method84(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1400(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field594.getGraphics();
            Statics.field816.method1408(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field594.repaint();
        }
    }

    @ObfuscatedName("v.af(IIIII)V")
    public static final void method93(int arg0, int arg1, int arg2, int arg3) {
        field365++;
        method3118(class31.field715);
        boolean var4 = false;
        if (field406 >= 0) {
            for (int var5 = 0; var5 < field382; var5++) {
                if (field406 == field383[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method3118(class31.field718);
        }
        method1935(true);
        method3118(var4 ? class31.field717 : class31.field716);
        method1935(false);
        method555();
        method691();
        method167(arg0, arg1, arg2, arg3, true);
        int var6 = field331;
        int var7 = field528;
        int var8 = field529;
        int var9 = field338;
        class75.method1586(var6, var7, var6 + var8, var7 + var9);
        class86.method1849();
        if (!field513) {
            int var10 = field345;
            if (field353 / 256 > var10) {
                var10 = field353 / 256;
            }
            if (field494[4] && field309[4] + 128 > var10) {
                var10 = field309[4] + 128;
            }
            int var11 = field346 + field328 & 0x7FF;
            method1667(Statics.field1669, method3111(Statics.field571.field804, Statics.field571.field750, Statics.field1086) - 50, Statics.field2129, var10, var11, var10 * 3 + 600);
        }
        int var12;
        if (field513) {
            var12 = method2547();
        } else {
            var12 = Statics.method978();
        }
        int var13 = Statics.field962;
        int var14 = Statics.field565;
        int var15 = Statics.field1305;
        int var16 = Statics.field802;
        int var17 = Statics.field66;
        for (int var18 = 0; var18 < 5; var18++) {
            if (field494[var18]) {
                int var19 = (int) (Math.random() * (double) (field447[var18] * 2 + 1) - (double) field447[var18] + Math.sin((double) field517[var18] / 100.0D * (double) field518[var18]) * (double) field309[var18]);
                if (var18 == 0) {
                    Statics.field962 += var19;
                }
                if (var18 == 1) {
                    Statics.field565 += var19;
                }
                if (var18 == 2) {
                    Statics.field1305 += var19;
                }
                if (var18 == 3) {
                    Statics.field66 = Statics.field66 + var19 & 0x7FF;
                }
                if (var18 == 4) {
                    Statics.field802 += var19;
                    if (Statics.field802 < 128) {
                        Statics.field802 = 128;
                    }
                    if (Statics.field802 > 383) {
                        Statics.field802 = 383;
                    }
                }
            }
        }
        int var20 = class132.field2041;
        int var21 = class132.field2050;
        if (class132.field2047 != 0) {
            var20 = class132.field2049;
            var21 = class132.field2055;
        }
        if (var20 >= var6 && var20 < var6 + var8 && var21 >= var7 && var21 < var7 + var9) {
            class100.field1764 = true;
            class100.field1718 = 0;
            class100.field1765 = var20 - var6;
            class100.field1766 = var21 - var7;
        } else {
            class100.field1764 = false;
            class100.field1718 = 0;
        }
        method986();
        class75.method1592(var6, var7, var8, var9, 0);
        method986();
        int var22 = class86.field1484;
        class86.field1484 = field531;
        Statics.field2621.method1707(Statics.field962, Statics.field565, Statics.field1305, Statics.field802, Statics.field66, var12);
        class86.field1484 = var22;
        method986();
        Statics.field2621.method1700();
        method2858(var6, var7, var8, var9);
        Statics.method905(var6, var7);
        ((class90) Statics.field1498).method1942(field422);
        if (field371 == 1) {
            Statics.field458[field370 / 100].method1489(field368 - 8, field369 - 8);
        }
        if (field371 == 2) {
            Statics.field458[field370 / 100 + 4].method1489(field368 - 8, field369 - 8);
        }
        field380 = 0;
        int var23 = (Statics.field571.field804 >> 7) + Statics.field120;
        int var24 = (Statics.field571.field750 >> 7) + Statics.field124;
        if (var23 >= 3053 && var23 <= 3156 && var24 >= 3056 && var24 <= 3136) {
            field380 = 1;
        }
        if (var23 >= 3072 && var23 <= 3118 && var24 >= 9492 && var24 <= 9535) {
            field380 = 1;
        }
        if (field380 == 1 && var23 >= 3139 && var23 <= 3199 && var24 >= 3008 && var24 <= 3062) {
            field380 = 0;
        }
        Statics.field962 = var13;
        Statics.field565 = var14;
        Statics.field1305 = var15;
        Statics.field802 = var16;
        Statics.field66 = var17;
        if (field341) {
            byte var25 = 0;
            int var26 = class162.field2620 + class162.field2604 + var25;
            if (var26 == 0) {
                field341 = false;
            }
        }
        if (field341) {
            class75.method1592(var6, var7, var8, var9, 0);
            method178(class148.field2207, false);
        }
    }

    @ObfuscatedName("i.al(IIIIZB)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field520 - field506) * var5 / 100 + field506;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field525) {
            short var8 = field525;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field473) {
                var6 = field473;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class75.method1601();
                    class75.method1592(arg0, arg1, var10, arg3, -16777216);
                    class75.method1592(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field526) {
            short var11 = field526;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field523) {
                var6 = field523;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class75.method1601();
                    class75.method1592(arg0, arg1, arg2, var13, -16777216);
                    class75.method1592(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field531 = arg3 * var6 / 334 << 1;
        if (field529 != arg2 || field338 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < 9; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var18 = class86.field1501[var16];
                var14[var15] = var17 * var18 >> 16;
            }
            class81.method1708(var14, 500, 800, arg2, arg3);
        }
        field331 = arg0;
        field528 = arg1;
        field529 = arg2;
        field338 = arg3;
    }

    @ObfuscatedName("fk.ak(Lay;B)V")
    public static final void method3118(class31 arg0) {
        if (Statics.field571.field804 >> 7 == field499 && Statics.field571.field750 >> 7 == field364) {
            field499 = 0;
        }
        int var1 = field382;
        if (class31.field715 == arg0 || class31.field718 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field715 == arg0) {
                var3 = Statics.field571;
                var4 = 33538048;
            } else if (class31.field718 == arg0) {
                var3 = field381[field406];
                var4 = field406 << 14;
            } else {
                var3 = field381[field383[var2]];
                var4 = field383[var2] << 14;
                if (class31.field717 == arg0 && field406 == field383[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method15() && !var3.field47) {
                var3.field45 = false;
                if ((field263 && field382 > 50 || field382 > 200) && class31.field715 != arg0 && var3.field777 == var3.field754) {
                    var3.field45 = true;
                }
                int var5 = var3.field804 >> 7;
                int var6 = var3.field750 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field270 < var3.field28 || field270 >= var3.field31) {
                        if ((var3.field804 & 0x7F) == 64 && (var3.field750 & 0x7F) == 64) {
                            if (field365 == field488[var5][var6]) {
                                continue;
                            }
                            field488[var5][var6] = field365;
                        }
                        var3.field34 = method3111(var3.field804, var3.field750, Statics.field1086);
                        Statics.field2621.method1680(Statics.field1086, var3.field804, var3.field750, var3.field34, 60, var3, var3.field749, var4, var3.field752);
                    } else {
                        var3.field45 = false;
                        var3.field34 = method3111(var3.field804, var3.field750, Statics.field1086);
                        Statics.field2621.method1745(Statics.field1086, var3.field804, var3.field750, var3.field34, 60, var3, var3.field749, var4, var3.field41, var3.field44, var3.field43, var3.field36);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.as(ZI)V")
    public static final void method1935(boolean arg0) {
        for (int var1 = 0; var1 < field300; var1++) {
            class32 var2 = field299[field301[var1]];
            int var3 = (field301[var1] << 14) + 536870912;
            if (var2 != null && var2.method15() && var2.field725.field846 == arg0 && var2.field725.method670()) {
                int var4 = var2.field804 >> 7;
                int var5 = var2.field750 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field753 == 1 && (var2.field804 & 0x7F) == 64 && (var2.field750 & 0x7F) == 64) {
                        if (field365 == field488[var4][var5]) {
                            continue;
                        }
                        field488[var4][var5] = field365;
                    }
                    if (!var2.field725.field829) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2621.method1680(Statics.field1086, var2.field804, var2.field750, method3111(var2.field804 + (var2.field753 * 64 - 64), var2.field750 + (var2.field753 * 64 - 64), Statics.field1086), var2.field753 * 64 - 64 + 60, var2, var2.field749, var3, var2.field752);
                }
            }
        }
    }

    @ObfuscatedName("z.ag(B)V")
    public static final void method555() {
        for (class7 var0 = (class7) field398.method3499(); var0 != null; var0 = (class7) field398.method3482()) {
            if (Statics.field1086 != var0.field92 || field270 > var0.field103) {
                var0.method3564();
            } else if (field270 >= var0.field97) {
                if (var0.field98 > 0) {
                    class32 var1 = field299[var0.field98 - 1];
                    if (var1 != null && var1.field804 >= 0 && var1.field804 < 13312 && var1.field750 >= 0 && var1.field750 < 13312) {
                        var0.method92(var1.field804, var1.field750, method3111(var1.field804, var1.field750, var0.field92) - var0.field96, field270);
                    }
                }
                if (var0.field98 < 0) {
                    int var2 = -var0.field98 - 1;
                    class3 var3;
                    if (field281 == var2) {
                        var3 = Statics.field571;
                    } else {
                        var3 = field381[var2];
                    }
                    if (var3 != null && var3.field804 >= 0 && var3.field804 < 13312 && var3.field750 >= 0 && var3.field750 < 13312) {
                        var0.method92(var3.field804, var3.field750, method3111(var3.field804, var3.field750, var0.field92) - var0.field96, field270);
                    }
                }
                var0.method89(field422);
                Statics.field2621.method1680(Statics.field1086, (int) var0.field104, (int) var0.field113, (int) var0.field105, 60, var0, var0.field111, -1, false);
            }
        }
    }

    @ObfuscatedName("aa.an(I)V")
    public static final void method691() {
        for (class28 var0 = (class28) field399.method3499(); var0 != null; var0 = (class28) field399.method3482()) {
            if (Statics.field1086 != var0.field652 || var0.field659) {
                var0.method3564();
            } else if (field270 >= var0.field651) {
                var0.method581(field422);
                if (var0.field659) {
                    var0.method3564();
                } else {
                    Statics.field2621.method1680(var0.field652, var0.field653, var0.field650, var0.field654, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("de.am(B)I")
    public static final int method2547() {
        if (Statics.field1877.field130) {
            return Statics.field1086;
        } else {
            int var0 = method3111(Statics.field962, Statics.field1305, Statics.field1086);
            return var0 - Statics.field565 >= 800 || (class6.field82[Statics.field1086][Statics.field962 >> 7][Statics.field1305 >> 7] & 0x4) == 0 ? 3 : Statics.field1086;
        }
    }

    @ObfuscatedName("cp.ah(Lat;IIIIII)V")
    public static final void method2044(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method15()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field725;
            if (var6.field851 != null) {
                var6 = var6.method669();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field382) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field47) {
                return;
            }
            if (var8.field48 != -1 || var8.field30 != -1) {
                method556(arg0, arg0.field789 + 15);
                if (field285 > -1) {
                    if (var8.field48 != -1) {
                        Statics.field251[var8.field48].method1489(field285 + arg2 - 12, field367 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field30 != -1) {
                        Statics.field1843[var8.field30].method1489(field285 + arg2 - 12, field367 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field515 == 10 && field280 == field383[arg1]) {
                method556(arg0, arg0.field789 + 15);
                if (field285 > -1) {
                    Statics.field150[1].method1489(field285 + arg2 - 12, field367 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field725;
            if (var9.field851 != null) {
                var9 = var9.method669();
            }
            if (var9.field849 >= 0 && var9.field849 < Statics.field1843.length) {
                method556(arg0, arg0.field789 + 15);
                if (field285 > -1) {
                    Statics.field1843[var9.field849].method1489(field285 + arg2 - 12, field367 + arg3 - 30);
                }
            }
            if (field515 == 1 && field390 == field301[arg1 - field382] && field270 % 20 < 10) {
                method556(arg0, arg0.field789 + 15);
                if (field285 > -1) {
                    Statics.field150[0].method1489(field285 + arg2 - 12, field367 + arg3 - 28);
                }
            }
        }
        if (arg0.field776 != null && (arg1 >= field382 || !arg0.field764 && (field483 == 4 || !arg0.field763 && (field483 == 0 || field483 == 3 || field483 == 1 && method1662(((class3) arg0).field38, false))))) {
            method556(arg0, arg0.field789);
            if (field285 > -1 && field438 < field355) {
                field388[field438] = Statics.field250.method3651(arg0.field776) / 2;
                field358[field438] = Statics.field250.field3089;
                field356[field438] = field285;
                field357[field438] = field367;
                field333[field438] = arg0.field812;
                field361[field438] = arg0.field761;
                field362[field438] = arg0.field765;
                field343[field438] = arg0.field776;
                field438++;
            }
        }
        if (arg0.field771 > field270) {
            method556(arg0, arg0.field789 + 15);
            if (field285 > -1) {
                int var10;
                if (arg1 < field382) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field725;
                    var10 = var11.field857;
                }
                int var12 = arg0.field772 * var10 / arg0.field773;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field772 > 0) {
                    var12 = 1;
                }
                class75.method1592(field285 + arg2 - var10 / 2, field367 + arg3 - 3, var12, 5, 65280);
                class75.method1592(field285 + arg2 - var10 / 2 + var12, field367 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field798[var13] > field270) {
                method556(arg0, arg0.field789 / 2);
                if (field285 > -1) {
                    if (var13 == 1) {
                        field367 -= 20;
                    }
                    if (var13 == 2) {
                        field285 -= 15;
                        field367 -= 10;
                    }
                    if (var13 == 3) {
                        field285 += 15;
                        field367 -= 10;
                    }
                    Statics.field42[arg0.field769[var13]].method1489(field285 + arg2 - 12, field367 + arg3 - 12);
                    Statics.field3020.method3658(Integer.toString(arg0.field768[var13]), field285 + arg2 - 1, field367 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("er.ba(IIIII)V")
    public static final void method2858(int arg0, int arg1, int arg2, int arg3) {
        field438 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field382 + field300; var6++) {
            class35 var7;
            if (var6 == -1) {
                var7 = Statics.field571;
            } else if (var6 < field382) {
                var7 = field381[field383[var6]];
                if (field406 == field383[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field299[field301[var6 - field382]];
            }
            method2044(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2044(field381[field406], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field438; var8++) {
            int var9 = field356[var8];
            int var10 = field357[var8];
            int var11 = field388[var8];
            int var12 = field358[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field357[var14] - field358[var14] && var10 - var12 < field357[var14] + 2 && var9 - var11 < field388[var14] + field356[var14] && var9 + var11 > field356[var14] - field388[var14] && field357[var14] - field358[var14] < var10) {
                        var10 = field357[var14] - field358[var14];
                        var13 = true;
                    }
                }
            }
            field285 = field356[var8];
            field367 = field357[var8] = var10;
            String var15 = field343[var8];
            if (field425 == 0) {
                int var16 = 16776960;
                if (field333[var8] < 6) {
                    var16 = field482[field333[var8]];
                }
                if (field333[var8] == 6) {
                    var16 = field365 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field333[var8] == 7) {
                    var16 = field365 % 20 < 10 ? 255 : 65535;
                }
                if (field333[var8] == 8) {
                    var16 = field365 % 20 < 10 ? 45056 : 8454016;
                }
                if (field333[var8] == 9) {
                    int var17 = 150 - field362[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field333[var8] == 10) {
                    int var18 = 150 - field362[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field333[var8] == 11) {
                    int var19 = 150 - field362[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field361[var8] == 0) {
                    Statics.field250.method3658(var15, field285 + arg0, field367 + arg1, var16, 0);
                }
                if (field361[var8] == 1) {
                    Statics.field250.method3693(var15, field285 + arg0, field367 + arg1, var16, 0, field365);
                }
                if (field361[var8] == 2) {
                    Statics.field250.method3664(var15, field285 + arg0, field367 + arg1, var16, 0, field365);
                }
                if (field361[var8] == 3) {
                    Statics.field250.method3662(var15, field285 + arg0, field367 + arg1, var16, 0, field365, 150 - field362[var8]);
                }
                if (field361[var8] == 4) {
                    int var20 = (150 - field362[var8]) * (Statics.field250.method3651(var15) + 100) / 150;
                    class75.method1617(field285 + arg0 - 50, arg1, field285 + arg0 + 50, arg1 + arg3);
                    Statics.field250.method3656(var15, field285 + arg0 + 50 - var20, field367 + arg1, var16, 0);
                    class75.method1586(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field361[var8] == 5) {
                    int var21 = 150 - field362[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class75.method1617(arg0, field367 + arg1 - Statics.field250.field3089 - 1, arg0 + arg2, field367 + arg1 + 5);
                    Statics.field250.method3658(var15, field285 + arg0, field367 + arg1 + var22, var16, 0);
                    class75.method1586(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field250.method3658(var15, field285 + arg0, field367 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("z.bm(Lat;II)V")
    public static final void method556(class35 arg0, int arg1) {
        method35(arg0.field804, arg0.field750, arg1);
    }

    @ObfuscatedName("q.bx(IIIB)V")
    public static final void method35(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field285 = -1;
            field367 = -1;
            return;
        }
        int var3 = method3111(arg0, arg1, Statics.field1086) - arg2;
        int var4 = arg0 - Statics.field962;
        int var5 = var3 - Statics.field565;
        int var6 = arg1 - Statics.field1305;
        int var7 = class86.field1501[Statics.field802];
        int var8 = class86.field1478[Statics.field802];
        int var9 = class86.field1501[Statics.field66];
        int var10 = class86.field1478[Statics.field66];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field285 = field531 * var11 / var15 + field529 / 2;
            field367 = field531 * var14 / var15 + field338 / 2;
        } else {
            field285 = -1;
            field367 = -1;
        }
    }

    @ObfuscatedName("fq.bb(IIII)I")
    public static final int method3111(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field82[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field88[var5][var3][var4] + class6.field88[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field88[var5][var3][var4 + 1] + class6.field88[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ch.bd(IIIIIIB)V")
    public static final void method1667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class86.field1501[var6];
            int var12 = class86.field1478[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class86.field1501[var7];
            int var15 = class86.field1478[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field962 = arg0 - var8;
        Statics.field565 = arg1 - var9;
        Statics.field1305 = arg2 - var10;
        Statics.field802 = arg3;
        Statics.field66 = arg4;
    }

    @ObfuscatedName("dd.bz(ZI)V")
    public static final void method2560(boolean arg0) {
        field519 = arg0;
        if (!field519) {
            int var1 = field304.method2219();
            int var2 = field304.method2256();
            int var3 = field304.method2397();
            int var4 = field304.method2255();
            int var5 = field304.method2256();
            int var6 = (field305 - field304.field1861) / 16;
            Statics.field222 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field222[var7][var8] = field304.method2367();
                }
            }
            Statics.field1897 = new int[var6];
            Statics.field632 = new int[var6];
            Statics.field116 = new int[var6];
            Statics.field14 = new byte[var6][];
            Statics.field1907 = new byte[var6][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1897[var10] = var13;
                        Statics.field632[var10] = Statics.field1087.method3008("m" + var11 + "_" + var12);
                        Statics.field116[var10] = Statics.field1087.method3008("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method628(var4, var2, var1, var3, var5);
            return;
        }
        int var14 = field304.method2255();
        field304.method2479();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field304.method2482(1);
                    if (var18 == 1) {
                        field322[var15][var16][var17] = field304.method2482(26);
                    } else {
                        field322[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field304.method2475();
        int var19 = (field305 - field304.field1861) / 16;
        Statics.field222 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field222[var20][var21] = field304.method2265();
            }
        }
        int var22 = field304.method2246();
        int var23 = field304.method2397();
        int var24 = field304.method2256();
        int var25 = field304.method2254();
        Statics.field1897 = new int[var19];
        Statics.field632 = new int[var19];
        Statics.field116 = new int[var19];
        Statics.field14 = new byte[var19][];
        Statics.field1907 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field322[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1897[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1897[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field632[var26] = Statics.field1087.method3008("m" + var35 + "_" + var36);
                            Statics.field116[var26] = Statics.field1087.method3008("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method628(var25, var23, var22, var24, var14);
    }

    @ObfuscatedName("ac.br(IIIIII)V")
    public static final void method628(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2599 == arg0 && Statics.field1584 == arg1 && field314 == arg2 || !field263) {
            return;
        }
        Statics.field2599 = arg0;
        Statics.field1584 = arg1;
        field314 = arg2;
        if (!field263) {
            field314 = 0;
        }
        method2543(25);
        method178(class148.field2207, true);
        int var5 = Statics.field120;
        int var6 = Statics.field124;
        Statics.field120 = (arg0 - 6) * 8;
        Statics.field124 = (arg1 - 6) * 8;
        int var7 = Statics.field120 - var5;
        int var8 = Statics.field124 - var6;
        int var9 = Statics.field120;
        int var10 = Statics.field124;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field299[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field803[var13] -= var7;
                    var12.field786[var13] -= var8;
                }
                var12.field804 -= var7 * 128;
                var12.field750 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field381[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field803[var16] -= var7;
                    var15.field786[var16] -= var8;
                }
                var15.field804 -= var7 * 128;
                var15.field750 -= var8 * 128;
            }
        }
        Statics.field1086 = arg2;
        Statics.field571.method643(arg3, arg4, false);
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var7 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        byte var20 = 0;
        byte var21 = 104;
        byte var22 = 1;
        if (var8 < 0) {
            var20 = 103;
            var21 = -1;
            var22 = -1;
        }
        for (int var23 = var17; var23 != var18; var23 += var19) {
            for (int var24 = var20; var24 != var21; var24 += var22) {
                int var25 = var7 + var23;
                int var26 = var8 + var24;
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                        field396[var27][var23][var24] = field396[var27][var25][var26];
                    } else {
                        field396[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field445.method3499(); var28 != null; var28 = (class16) field445.method3482()) {
            var28.field214 -= var7;
            var28.field213 -= var8;
            if (var28.field214 < 0 || var28.field213 < 0 || var28.field214 >= 104 || var28.field213 >= 104) {
                var28.method3564();
            }
        }
        if (field499 != 0) {
            field499 -= var7;
            field364 -= var8;
        }
        field507 = 0;
        field513 = false;
        field527 = -1;
        field399.method3483();
        field398.method3483();
    }

    @ObfuscatedName("q.bl(ZI)V")
    public static final void method36(boolean arg0) {
        method986();
        field373++;
        if (field373 < 50 && !arg0) {
            return;
        }
        field373 = 0;
        if (field313 || Statics.field1863 == null) {
            return;
        }
        field302.method2477(5);
        try {
            Statics.field1863.method2717(field302.field1860, 0, field302.field1861);
            field302.field1861 = 0;
        } catch (IOException var2) {
            field313 = true;
        }
    }

    @ObfuscatedName("cc.bf(IIIIII)V")
    public static final void method2026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2621.method1695(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2621.method1699(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field13.field1330;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method150(var12);
            if (var13.field888 == -1) {
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
                class76 var14 = Statics.field223[var13.field888];
                if (var14 != null) {
                    int var15 = (var13.field874 * 4 - var14.field1345) / 2;
                    int var16 = (var13.field875 * 4 - var14.field1346) / 2;
                    var14.method1644(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field875) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2621.method1820(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2621.method1699(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method150(var21);
            if (var22.field888 != -1) {
                class76 var23 = Statics.field223[var22.field888];
                if (var23 != null) {
                    int var24 = (var22.field874 * 4 - var23.field1345) / 2;
                    int var25 = (var22.field875 * 4 - var23.field1346) / 2;
                    var23.method1644(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field875) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field13.field1330;
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
        int var29 = Statics.field2621.method1698(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method150(var30);
        if (var31.field888 == -1) {
            return;
        }
        class76 var32 = Statics.field223[var31.field888];
        if (var32 != null) {
            int var33 = (var31.field874 * 4 - var32.field1345) / 2;
            int var34 = (var31.field875 * 4 - var32.field1346) / 2;
            var32.method1644(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field875) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("a.bo(I)V")
    public static final void method146() {
        if (field279 == 180) {
            int var0 = field304.method2254();
            int var1 = field304.method2219();
            int var2 = (var1 >> 4 & 0x7) + Statics.field808;
            int var3 = (var1 & 0x7) + Statics.field645;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class190 var4 = field396[Statics.field1086][var2][var3];
                if (var4 != null) {
                    for (class27 var5 = (class27) var4.method3499(); var5 != null; var5 = (class27) var4.method3482()) {
                        if ((var0 & 0x7FFF) == var5.field646) {
                            var5.method3564();
                            break;
                        }
                    }
                    if (var4.method3499() == null) {
                        field396[Statics.field1086][var2][var3] = null;
                    }
                    method140(var2, var3);
                }
            }
        } else if (field279 == 149) {
            int var6 = field304.method2219();
            int var7 = (var6 >> 4 & 0x7) + Statics.field808;
            int var8 = (var6 & 0x7) + Statics.field645;
            int var9 = var7 + field304.method2220();
            int var10 = var8 + field304.method2220();
            int var11 = field304.method2222();
            int var12 = field304.method2397();
            int var13 = field304.method2219() * 4;
            int var14 = field304.method2219() * 4;
            int var15 = field304.method2397();
            int var16 = field304.method2397();
            int var17 = field304.method2219();
            int var18 = field304.method2219();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) {
                int var19 = var7 * 128 + 64;
                int var20 = var8 * 128 + 64;
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                class7 var23 = new class7(var12, Statics.field1086, var19, var20, method3111(var19, var20, Statics.field1086) - var13, field270 + var15, field270 + var16, var17, var18, var11, var14);
                var23.method92(var21, var22, method3111(var21, var22, Statics.field1086) - var14, field270 + var15);
                field398.method3470(var23);
            }
        } else if (field279 == 160) {
            int var24 = field304.method2219();
            int var25 = (var24 >> 4 & 0x7) + Statics.field808;
            int var26 = (var24 & 0x7) + Statics.field645;
            int var27 = field304.method2397();
            int var28 = field304.method2219();
            int var29 = field304.method2397();
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                int var30 = var25 * 128 + 64;
                int var31 = var26 * 128 + 64;
                class28 var32 = new class28(var27, Statics.field1086, var30, var31, method3111(var30, var31, Statics.field1086) - var28, var29, field270);
                field399.method3470(var32);
            }
        } else if (field279 == 229) {
            int var33 = field304.method2245();
            int var34 = (var33 >> 4 & 0x7) + Statics.field808;
            int var35 = (var33 & 0x7) + Statics.field645;
            int var36 = field304.method2245();
            int var37 = var36 >> 2;
            int var38 = var36 & 0x3;
            int var39 = field323[var37];
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                method2566(Statics.field1086, var34, var35, var39, -1, var37, var38, 0, -1);
            }
        } else {
            if (field279 == 60) {
                int var40 = field304.method2219();
                int var41 = (var40 >> 4 & 0x7) + Statics.field808;
                int var42 = (var40 & 0x7) + Statics.field645;
                int var43 = field304.method2397();
                int var44 = field304.method2219();
                int var45 = var44 >> 4 & 0xF;
                int var46 = var44 & 0x7;
                int var47 = field304.method2219();
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    int var48 = var45 + 1;
                    if (Statics.field571.field803[0] >= var41 - var48 && Statics.field571.field803[0] <= var41 + var48 && Statics.field571.field786[0] >= var42 - var48 && Statics.field571.field786[0] <= var42 + var48 && field292 != 0 && var46 > 0 && field507 < 50) {
                        field508[field507] = var43;
                        field509[field507] = var46;
                        field510[field507] = var47;
                        field336[field507] = null;
                        field479[field507] = (var41 << 16) + (var42 << 8) + var45;
                        field507++;
                    }
                }
            }
            if (field279 == 179) {
                int var49 = field304.method2397();
                int var50 = field304.method2246();
                int var51 = (var50 >> 4 & 0x7) + Statics.field808;
                int var52 = (var50 & 0x7) + Statics.field645;
                int var53 = field304.method2247();
                int var54 = var53 >> 2;
                int var55 = var53 & 0x3;
                int var56 = field323[var54];
                if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                    method2566(Statics.field1086, var51, var52, var56, var49, var54, var55, 0, -1);
                }
            } else if (field279 == 202) {
                int var57 = field304.method2255();
                int var58 = field304.method2256();
                int var59 = field304.method2247();
                int var60 = (var59 >> 4 & 0x7) + Statics.field808;
                int var61 = (var59 & 0x7) + Statics.field645;
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    class27 var62 = new class27();
                    var62.field646 = var58;
                    var62.field644 = var57;
                    if (field396[Statics.field1086][var60][var61] == null) {
                        field396[Statics.field1086][var60][var61] = new class190();
                    }
                    field396[Statics.field1086][var60][var61].method3470(var62);
                    method140(var60, var61);
                }
            } else if (field279 == 84) {
                int var63 = field304.method2219();
                int var64 = (var63 >> 4 & 0x7) + Statics.field808;
                int var65 = (var63 & 0x7) + Statics.field645;
                int var66 = field304.method2397();
                int var67 = field304.method2397();
                int var68 = field304.method2397();
                if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                    class190 var69 = field396[Statics.field1086][var64][var65];
                    if (var69 != null) {
                        for (class27 var70 = (class27) var69.method3499(); var70 != null; var70 = (class27) var69.method3482()) {
                            if ((var66 & 0x7FFF) == var70.field646 && var70.field644 == var67) {
                                var70.field644 = var68;
                                break;
                            }
                        }
                        method140(var64, var65);
                    }
                }
            } else if (field279 == 15) {
                int var71 = field304.method2397();
                int var72 = field304.method2245();
                int var73 = var72 >> 2;
                int var74 = var72 & 0x3;
                int var75 = field323[var73];
                int var76 = field304.method2219();
                int var77 = (var76 >> 4 & 0x7) + Statics.field808;
                int var78 = (var76 & 0x7) + Statics.field645;
                if (var77 >= 0 && var78 >= 0 && var77 < 103 && var78 < 103) {
                    if (var75 == 0) {
                        class82 var79 = Statics.field2621.method1691(Statics.field1086, var77, var78);
                        if (var79 != null) {
                            int var80 = var79.field1449 >> 14 & 0x7FFF;
                            if (var73 == 2) {
                                var79.field1444 = new class12(var80, 2, var74 + 4, Statics.field1086, var77, var78, var71, false, var79.field1444);
                                var79.field1445 = new class12(var80, 2, var74 + 1 & 0x3, Statics.field1086, var77, var78, var71, false, var79.field1445);
                            } else {
                                var79.field1444 = new class12(var80, var73, var74, Statics.field1086, var77, var78, var71, false, var79.field1444);
                            }
                        }
                    }
                    if (var75 == 1) {
                        class89 var81 = Statics.field2621.method1692(Statics.field1086, var77, var78);
                        if (var81 != null) {
                            int var82 = var81.field1521 >> 14 & 0x7FFF;
                            if (var73 == 4 || var73 == 5) {
                                var81.field1519 = new class12(var82, 4, var74, Statics.field1086, var77, var78, var71, false, var81.field1519);
                            } else if (var73 == 6) {
                                var81.field1519 = new class12(var82, 4, var74 + 4, Statics.field1086, var77, var78, var71, false, var81.field1519);
                            } else if (var73 == 7) {
                                var81.field1519 = new class12(var82, 4, (var74 + 2 & 0x3) + 4, Statics.field1086, var77, var78, var71, false, var81.field1519);
                            } else if (var73 == 8) {
                                var81.field1519 = new class12(var82, 4, var74 + 4, Statics.field1086, var77, var78, var71, false, var81.field1519);
                                var81.field1522 = new class12(var82, 4, (var74 + 2 & 0x3) + 4, Statics.field1086, var77, var78, var71, false, var81.field1522);
                            }
                        }
                    }
                    if (var75 == 2) {
                        class93 var83 = Statics.field2621.method1693(Statics.field1086, var77, var78);
                        if (var73 == 11) {
                            var73 = 10;
                        }
                        if (var83 != null) {
                            var83.field1568 = new class12(var83.field1578 >> 14 & 0x7FFF, var73, var74, Statics.field1086, var77, var78, var71, false, var83.field1568);
                        }
                    }
                    if (var75 == 3) {
                        class88 var84 = Statics.field2621.method1832(Statics.field1086, var77, var78);
                        if (var84 != null) {
                            var84.field1506 = new class12(var84.field1511 >> 14 & 0x7FFF, 22, var74, Statics.field1086, var77, var78, var71, false, var84.field1506);
                        }
                    }
                }
            } else if (field279 == 113) {
                byte var85 = field304.method2208();
                int var86 = field304.method2256();
                int var87 = field304.method2255();
                int var88 = field304.method2254();
                int var89 = field304.method2246();
                int var90 = var89 >> 2;
                int var91 = var89 & 0x3;
                int var92 = field323[var90];
                int var93 = field304.method2254();
                int var94 = field304.method2247();
                int var95 = (var94 >> 4 & 0x7) + Statics.field808;
                int var96 = (var94 & 0x7) + Statics.field645;
                byte var97 = field304.method2250();
                byte var98 = field304.method2249();
                byte var99 = field304.method2208();
                class3 var100;
                if (field281 == var88) {
                    var100 = Statics.field571;
                } else {
                    var100 = field381[var88];
                }
                if (var100 != null) {
                    class38 var101 = class38.method150(var86);
                    int var102;
                    int var103;
                    if (var91 == 1 || var91 == 3) {
                        var102 = var101.field875;
                        var103 = var101.field874;
                    } else {
                        var102 = var101.field874;
                        var103 = var101.field875;
                    }
                    int var104 = (var102 >> 1) + var95;
                    int var105 = (var102 + 1 >> 1) + var95;
                    int var106 = (var103 >> 1) + var96;
                    int var107 = (var103 + 1 >> 1) + var96;
                    int[][] var108 = class6.field88[Statics.field1086];
                    int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                    int var110 = (var95 << 7) + (var102 << 6);
                    int var111 = (var96 << 7) + (var103 << 6);
                    class100 var112 = var101.method701(var90, var91, var108, var110, var109, var111);
                    if (var112 != null) {
                        method2566(Statics.field1086, var95, var96, var92, -1, 0, 0, var93 + 1, var87 + 1);
                        var100.field28 = field270 + var93;
                        var100.field31 = field270 + var87;
                        var100.field40 = var112;
                        var100.field37 = var95 * 128 + var102 * 64;
                        var100.field39 = var96 * 128 + var103 * 64;
                        var100.field53 = var109;
                        if (var99 > var85) {
                            byte var113 = var99;
                            var99 = var85;
                            var85 = var113;
                        }
                        if (var98 > var97) {
                            byte var114 = var98;
                            var98 = var97;
                            var97 = var114;
                        }
                        var100.field41 = var95 + var99;
                        var100.field43 = var85 + var95;
                        var100.field44 = var96 + var98;
                        var100.field36 = var96 + var97;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.bv(IIIIIIIIII)V")
    public static final void method2566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field445.method3499(); var10 != null; var10 = (class16) field445.method3482()) {
            if (var10.field224 == arg0 && var10.field214 == arg1 && var10.field213 == arg2 && var10.field210 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field224 = arg0;
            var9.field210 = arg3;
            var9.field214 = arg1;
            var9.field213 = arg2;
            method2129(var9);
            field445.method3470(var9);
        }
        var9.field217 = arg4;
        var9.field219 = arg5;
        var9.field215 = arg6;
        var9.field220 = arg7;
        var9.field221 = arg8;
    }

    @ObfuscatedName("z.bh(I)V")
    public static final void method547() {
        for (class16 var0 = (class16) field445.method3499(); var0 != null; var0 = (class16) field445.method3482()) {
            if (var0.field221 == -1) {
                var0.field220 = 0;
                method2129(var0);
            } else {
                var0.method3564();
            }
        }
    }

    @ObfuscatedName("cs.bg(Ln;I)V")
    public static final void method2129(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field210 == 0) {
            var1 = Statics.field2621.method1695(arg0.field224, arg0.field214, arg0.field213);
        }
        if (arg0.field210 == 1) {
            var1 = Statics.field2621.method1696(arg0.field224, arg0.field214, arg0.field213);
        }
        if (arg0.field210 == 2) {
            var1 = Statics.field2621.method1820(arg0.field224, arg0.field214, arg0.field213);
        }
        if (arg0.field210 == 3) {
            var1 = Statics.field2621.method1698(arg0.field224, arg0.field214, arg0.field213);
        }
        if (var1 != 0) {
            int var5 = Statics.field2621.method1699(arg0.field224, arg0.field214, arg0.field213, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field226 = var2;
        arg0.field228 = var3;
        arg0.field225 = var4;
    }

    @ObfuscatedName("q.bn(IIIIIIII)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field263 && Statics.field1086 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2621.method1695(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2621.method1696(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2621.method1820(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2621.method1698(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2621.method1699(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2621.method1686(arg0, arg2, arg3);
                class38 var15 = class38.method150(var12);
                if (var15.field876 != 0) {
                    field320[arg0].method3795(arg2, arg3, var13, var14, var15.field905);
                }
            }
            if (arg1 == 1) {
                Statics.field2621.method1687(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2621.method1720(arg0, arg2, arg3);
                class38 var16 = class38.method150(var12);
                if (var16.field874 + arg2 > 103 || var16.field874 + arg3 > 103 || var16.field875 + arg2 > 103 || var16.field875 + arg3 > 103) {
                    return;
                }
                if (var16.field876 != 0) {
                    field320[arg0].method3812(arg2, arg3, var16.field874, var16.field875, var14, var16.field905);
                }
            }
            if (arg1 == 3) {
                Statics.field2621.method1772(arg0, arg2, arg3);
                class38 var17 = class38.method150(var12);
                if (var17.field876 == 1) {
                    field320[arg0].method3819(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field82[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class81 var19 = Statics.field2621;
        class220 var20 = field320[arg0];
        class38 var21 = class38.method150(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field875;
            var23 = var21.field874;
        } else {
            var22 = var21.field874;
            var23 = var21.field875;
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
        int[][] var28 = class6.field88[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field878 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field899 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class80 var34;
            if (var21.field882 == -1 && var21.field861 == null) {
                var34 = var21.method701(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class12(arg4, 22, arg5, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1675(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field876 == 1) {
                var20.method3809(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var57;
            if (var21.field882 == -1 && var21.field861 == null) {
                var57 = var21.method701(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class12(arg4, 10, arg5, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            if (var57 != null) {
                var19.method1679(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field876 != 0) {
                var20.method3792(arg2, arg3, var22, var23, var21.field905);
            }
        } else if (arg6 >= 12) {
            class80 var35;
            if (var21.field882 == -1 && var21.field861 == null) {
                var35 = var21.method701(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1679(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field876 != 0) {
                var20.method3792(arg2, arg3, var22, var23, var21.field905);
            }
        } else if (arg6 == 0) {
            class80 var36;
            if (var21.field882 == -1 && var21.field861 == null) {
                var36 = var21.method701(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class12(arg4, 0, arg5, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1677(arg0, arg2, arg3, var29, var36, (class80) null, class6.field78[arg5], 0, var32, var33);
            if (var21.field876 != 0) {
                var20.method3791(arg2, arg3, arg6, arg5, var21.field905);
            }
        } else if (arg6 == 1) {
            class80 var37;
            if (var21.field882 == -1 && var21.field861 == null) {
                var37 = var21.method701(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class12(arg4, 1, arg5, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1677(arg0, arg2, arg3, var29, var37, (class80) null, class6.field79[arg5], 0, var32, var33);
            if (var21.field876 != 0) {
                var20.method3791(arg2, arg3, arg6, arg5, var21.field905);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class80 var39;
            class80 var40;
            if (var21.field882 == -1 && var21.field861 == null) {
                var39 = var21.method701(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method701(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class12(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field882, true, (class80) null);
                var40 = new class12(arg4, 2, var38, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1677(arg0, arg2, arg3, var29, var39, var40, class6.field78[arg5], class6.field78[var38], var32, var33);
            if (var21.field876 != 0) {
                var20.method3791(arg2, arg3, arg6, arg5, var21.field905);
            }
        } else if (arg6 == 3) {
            class80 var41;
            if (var21.field882 == -1 && var21.field861 == null) {
                var41 = var21.method701(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class12(arg4, 3, arg5, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1677(arg0, arg2, arg3, var29, var41, (class80) null, class6.field79[arg5], 0, var32, var33);
            if (var21.field876 != 0) {
                var20.method3791(arg2, arg3, arg6, arg5, var21.field905);
            }
        } else if (arg6 == 9) {
            class80 var42;
            if (var21.field882 == -1 && var21.field861 == null) {
                var42 = var21.method701(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1679(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field876 != 0) {
                var20.method3792(arg2, arg3, var22, var23, var21.field905);
            }
        } else if (arg6 == 4) {
            class80 var43;
            if (var21.field882 == -1 && var21.field861 == null) {
                var43 = var21.method701(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1678(arg0, arg2, arg3, var29, var43, (class80) null, class6.field78[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1695(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class38.method150(var45 >> 14 & 0x7FFF).field883;
            }
            class80 var46;
            if (var21.field882 == -1 && var21.field861 == null) {
                var46 = var21.method701(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1678(arg0, arg2, arg3, var29, var46, (class80) null, class6.field78[arg5], 0, class6.field76[arg5] * var44, class6.field81[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1695(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class38.method150(var48 >> 14 & 0x7FFF).field883 / 2;
            }
            class80 var49;
            if (var21.field882 == -1 && var21.field861 == null) {
                var49 = var21.method701(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1678(arg0, arg2, arg3, var29, var49, (class80) null, 256, arg5, class6.field85[arg5] * var47, class6.field83[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class80 var51;
            if (var21.field882 == -1 && var21.field861 == null) {
                var51 = var21.method701(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class12(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1678(arg0, arg2, arg3, var29, var51, (class80) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1695(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class38.method150(var53 >> 14 & 0x7FFF).field883 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class80 var55;
            class80 var56;
            if (var21.field882 == -1 && var21.field861 == null) {
                var55 = var21.method701(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method701(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field882, true, (class80) null);
                var56 = new class12(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field882, true, (class80) null);
            }
            var19.method1678(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field85[arg5] * var52, class6.field83[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("m.bi(III)V")
    public static final void method140(int arg0, int arg1) {
        class190 var2 = field396[Statics.field1086][arg0][arg1];
        if (var2 == null) {
            Statics.field2621.method1690(Statics.field1086, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3499(); var6 != null; var6 = (class27) var2.method3482()) {
            class47 var7 = class47.method2700(var6.field646);
            long var8 = (long) var7.field1051;
            if (var7.field1080 == 1) {
                var8 = (long) (var6.field644 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2621.method1690(Statics.field1086, arg0, arg1);
            return;
        }
        var2.method3471(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3499(); var12 != null; var12 = (class27) var2.method3482()) {
            if (var5.field646 != var12.field646) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field646 != var12.field646 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2621.method1725(Statics.field1086, arg0, arg1, method3111(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1086), var5, var13, var10, var11);
    }

    @ObfuscatedName("ai.by(I)V")
    public static final void method661() {
        field464 = 0;
        field306 = 0;
        field304.method2479();
        int var0 = field304.method2482(1);
        if (var0 != 0) {
            int var1 = field304.method2482(2);
            if (var1 == 0) {
                field317[++field306 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field304.method2482(3);
                Statics.field571.method645(var2, false);
                int var3 = field304.method2482(1);
                if (var3 == 1) {
                    field317[++field306 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field304.method2482(3);
                Statics.field571.method645(var4, true);
                int var5 = field304.method2482(3);
                Statics.field571.method645(var5, true);
                int var6 = field304.method2482(1);
                if (var6 == 1) {
                    field317[++field306 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field304.method2482(7);
                int var8 = field304.method2482(1);
                int var9 = field304.method2482(1);
                if (var9 == 1) {
                    field317[++field306 - 1] = 2047;
                }
                Statics.field1086 = field304.method2482(2);
                int var10 = field304.method2482(7);
                Statics.field571.method643(var7, var10, var8 == 1);
            }
        }
        method40();
        method2632();
        for (int var11 = 0; var11 < field306; var11++) {
            int var12 = field317[var11];
            class3 var13 = field381[var12];
            int var14 = field304.method2219();
            if ((var14 & 0x40) != 0) {
                var14 += field304.method2219() << 8;
            }
            method2699(var12, var13, var14);
        }
        for (int var15 = 0; var15 < field464; var15++) {
            int var16 = field502[var15];
            if (field270 != field381[var16].field767) {
                field381[var16] = null;
            }
        }
        if (field305 != field304.field1861) {
            throw new RuntimeException(field304.field1861 + class2.field21 + field305);
        }
        for (int var17 = 0; var17 < field382; var17++) {
            if (field381[field383[var17]] == null) {
                throw new RuntimeException(var17 + class2.field21 + field382);
            }
        }
    }

    @ObfuscatedName("q.bt(I)V")
    public static final void method40() {
        int var0 = field304.method2482(8);
        if (var0 < field382) {
            for (int var1 = var0; var1 < field382; var1++) {
                field502[++field464 - 1] = field383[var1];
            }
        }
        if (var0 > field382) {
            throw new RuntimeException("");
        }
        field382 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field383[var2];
            class3 var4 = field381[var3];
            int var5 = field304.method2482(1);
            if (var5 == 0) {
                field383[++field382 - 1] = var3;
                var4.field767 = field270;
            } else {
                int var6 = field304.method2482(2);
                if (var6 == 0) {
                    field383[++field382 - 1] = var3;
                    var4.field767 = field270;
                    field317[++field306 - 1] = var3;
                } else if (var6 == 1) {
                    field383[++field382 - 1] = var3;
                    var4.field767 = field270;
                    int var7 = field304.method2482(3);
                    var4.method645(var7, false);
                    int var8 = field304.method2482(1);
                    if (var8 == 1) {
                        field317[++field306 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field383[++field382 - 1] = var3;
                    var4.field767 = field270;
                    int var9 = field304.method2482(3);
                    var4.method645(var9, true);
                    int var10 = field304.method2482(3);
                    var4.method645(var10, true);
                    int var11 = field304.method2482(1);
                    if (var11 == 1) {
                        field317[++field306 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field502[++field464 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("dy.bq(B)V")
    public static final void method2632() {
        while (true) {
            if (field304.method2498(field305) >= 11) {
                int var0 = field304.method2482(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field381[var0] == null) {
                        field381[var0] = new class3();
                        if (field386[var0] != null) {
                            field381[var0].method13(field386[var0]);
                        }
                        var1 = true;
                    }
                    field383[++field382 - 1] = var0;
                    class3 var2 = field381[var0];
                    var2.field767 = field270;
                    int var3 = field304.method2482(1);
                    if (var3 == 1) {
                        field317[++field306 - 1] = var0;
                    }
                    int var4 = field304.method2482(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field304.method2482(1);
                    int var6 = field304.method2482(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field394[field304.method2482(3)];
                    if (var1) {
                        var2.field811 = var2.field749 = var7;
                    }
                    var2.method643(Statics.field571.field803[0] + var4, Statics.field571.field786[0] + var6, var5 == 1);
                    continue;
                }
            }
            field304.method2475();
            return;
        }
    }

    @ObfuscatedName("ev.bs(ILg;II)V")
    public static final void method2699(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x10) != 0) {
            arg1.field775 = field304.method2255();
            arg1.field780 = field304.method2397();
        }
        if ((arg2 & 0x4) != 0) {
            int var3 = field304.method2256();
            int var4 = field304.method2247();
            arg1.method646(var3, var4, field270);
            arg1.field771 = field270 + 300;
            arg1.field772 = field304.method2219();
            arg1.field773 = field304.method2246();
        }
        if ((arg2 & 0x1) != 0) {
            int var5 = field304.method2397();
            class143 var6 = (class143) class101.method1845(class143.method169(), field304.method2247());
            boolean var7 = field304.method2219() == 1;
            int var8 = field304.method2246();
            int var9 = field304.field1861;
            if (arg1.field38 != null && arg1.field29 != null) {
                boolean var10 = false;
                if (var6.field2148 && method2043(arg1.field38)) {
                    var10 = true;
                }
                if (!var10 && field380 == 0 && !arg1.field47) {
                    field286.field1861 = 0;
                    field304.method2267(field286.field1860, 0, var8);
                    field286.field1861 = 0;
                    class111 var11 = field286;
                    String var15;
                    try {
                        int var12 = var11.method2368();
                        if (var12 > 32767) {
                            var12 = 32767;
                        }
                        byte[] var13 = new byte[var12];
                        var11.field1861 += Statics.field3082.method2137(var11.field1860, var11.field1861, var13, 0, var12);
                        String var14 = class156.method2161(var13, 0, var12);
                        var15 = var14;
                    } catch (Exception var28) {
                        var15 = "Cabbage";
                    }
                    String var18 = class214.method3736(class154.method2515(var15));
                    arg1.field776 = var18.trim();
                    arg1.field812 = var5 >> 8;
                    arg1.field761 = var5 & 0xFF;
                    arg1.field765 = 150;
                    arg1.field763 = var7;
                    arg1.field764 = Statics.field571 != arg1 && var6.field2148 && field485 != "" && var18.toLowerCase().indexOf(field485) == -1;
                    int var19;
                    if (var6.field2143) {
                        var19 = var7 ? 91 : 1;
                    } else {
                        var19 = var7 ? 90 : 2;
                    }
                    if (var6.field2149 == -1) {
                        class11.method626(var19, arg1.field38, var18);
                    } else {
                        class11.method626(var19, class2.method1661(var6.field2149) + arg1.field38, var18);
                    }
                }
            }
            field304.field1861 = var8 + var9;
        }
        if ((arg2 & 0x2) != 0) {
            int var20 = field304.method2245();
            byte[] var21 = new byte[var20];
            class111 var22 = new class111(var21);
            field304.method2267(var21, 0, var20);
            field386[arg0] = var22;
            arg1.method13(var22);
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field785 = field304.method2255();
            int var23 = field304.method2273();
            arg1.field796 = var23 >> 16;
            arg1.field792 = (var23 & 0xFFFF) + field270;
            arg1.field783 = 0;
            arg1.field787 = 0;
            if (arg1.field792 > field270) {
                arg1.field783 = -1;
            }
            if (arg1.field785 == 65535) {
                arg1.field785 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var24 = field304.method2254();
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = field304.method2219();
            method1473(arg1, var24, var25);
        }
        if ((arg2 & 0x200) != 0) {
            int var26 = field304.method2255();
            int var27 = field304.method2246();
            arg1.method646(var26, var27, field270);
            arg1.field771 = field270 + 300;
            arg1.field772 = field304.method2219();
            arg1.field773 = field304.method2219();
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field790 = field304.method2219();
            arg1.field797 = field304.method2245();
            arg1.field791 = field304.method2219();
            arg1.field751 = field304.method2247();
            arg1.field794 = field304.method2255() + field270;
            arg1.field795 = field304.method2256() + field270;
            arg1.field766 = field304.method2219();
            arg1.field762 = 1;
            arg1.field807 = 0;
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field776 = field304.method2339();
            if (arg1.field776.charAt(0) == '~') {
                arg1.field776 = arg1.field776.substring(1);
                class11.method626(2, arg1.field38, arg1.field776);
            } else if (Statics.field571 == arg1) {
                class11.method626(2, arg1.field38, arg1.field776);
            }
            arg1.field763 = false;
            arg1.field812 = 0;
            arg1.field761 = 0;
            arg1.field765 = 150;
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field788 = field304.method2256();
            if (arg1.field788 == 65535) {
                arg1.field788 = -1;
            }
        }
    }

    @ObfuscatedName("de.bu(ZB)V")
    public static final void method2539(boolean arg0) {
        field464 = 0;
        field306 = 0;
        method96();
        while (field304.method2498(field305) >= 27) {
            int var1 = field304.method2482(15);
            if (var1 == 32767) {
                break;
            }
            boolean var5 = false;
            if (field299[var1] == null) {
                field299[var1] = new class32();
                var5 = true;
            }
            class32 var6 = field299[var1];
            field301[++field300 - 1] = var1;
            var6.field767 = field270;
            int var7 = field304.method2482(1);
            if (var7 == 1) {
                field317[++field306 - 1] = var1;
            }
            var6.field725 = class37.method2500(field304.method2482(14));
            int var8;
            if (arg0) {
                var8 = field304.method2482(8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = field304.method2482(5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9 = field304.method2482(1);
            int var10;
            if (arg0) {
                var10 = field304.method2482(8);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = field304.method2482(5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            int var11 = field394[field304.method2482(3)];
            if (var5) {
                var6.field811 = var6.field749 = var11;
            }
            var6.field753 = var6.field725.field827;
            var6.field801 = var6.field725.field850;
            if (var6.field801 == 0) {
                var6.field749 = 0;
            }
            var6.field757 = var6.field725.field836;
            var6.field758 = var6.field725.field834;
            var6.field759 = var6.field725.field835;
            var6.field760 = var6.field725.field821;
            var6.field754 = var6.field725.field838;
            var6.field755 = var6.field725.field854;
            var6.field756 = var6.field725.field830;
            var6.method643(Statics.field571.field803[0] + var10, Statics.field571.field786[0] + var8, var9 == 1);
        }
        field304.method2475();
        method2440();
        for (int var2 = 0; var2 < field464; var2++) {
            int var3 = field502[var2];
            if (field270 != field299[var3].field767) {
                field299[var3].field725 = null;
                field299[var3] = null;
            }
        }
        if (field305 != field304.field1861) {
            throw new RuntimeException(field304.field1861 + class2.field21 + field305);
        }
        for (int var4 = 0; var4 < field300; var4++) {
            if (field299[field301[var4]] == null) {
                throw new RuntimeException(var4 + class2.field21 + field300);
            }
        }
    }

    @ObfuscatedName("y.bp(I)V")
    public static final void method96() {
        field304.method2479();
        int var0 = field304.method2482(8);
        if (var0 < field300) {
            for (int var1 = var0; var1 < field300; var1++) {
                field502[++field464 - 1] = field301[var1];
            }
        }
        if (var0 > field300) {
            throw new RuntimeException("");
        }
        field300 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field301[var2];
            class32 var4 = field299[var3];
            int var5 = field304.method2482(1);
            if (var5 == 0) {
                field301[++field300 - 1] = var3;
                var4.field767 = field270;
            } else {
                int var6 = field304.method2482(2);
                if (var6 == 0) {
                    field301[++field300 - 1] = var3;
                    var4.field767 = field270;
                    field317[++field306 - 1] = var3;
                } else if (var6 == 1) {
                    field301[++field300 - 1] = var3;
                    var4.field767 = field270;
                    int var7 = field304.method2482(3);
                    var4.method645(var7, false);
                    int var8 = field304.method2482(1);
                    if (var8 == 1) {
                        field317[++field306 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field301[++field300 - 1] = var3;
                    var4.field767 = field270;
                    int var9 = field304.method2482(3);
                    var4.method645(var9, true);
                    int var10 = field304.method2482(3);
                    var4.method645(var10, true);
                    int var11 = field304.method2482(1);
                    if (var11 == 1) {
                        field317[++field306 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field502[++field464 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("dk.bc(I)V")
    public static final void method2440() {
        for (int var0 = 0; var0 < field306; var0++) {
            int var1 = field317[var0];
            class32 var2 = field299[var1];
            int var3 = field304.method2219();
            if ((var3 & 0x4) != 0) {
                int var4 = field304.method2247();
                int var5 = field304.method2219();
                var2.method646(var4, var5, field270);
                var2.field771 = field270 + 300;
                var2.field772 = field304.method2254();
                var2.field773 = field304.method2255();
            }
            if ((var3 & 0x1) != 0) {
                var2.field785 = field304.method2256();
                int var6 = field304.method2273();
                var2.field796 = var6 >> 16;
                var2.field792 = (var6 & 0xFFFF) + field270;
                var2.field783 = 0;
                var2.field787 = 0;
                if (var2.field792 > field270) {
                    var2.field783 = -1;
                }
                if (var2.field785 == 65535) {
                    var2.field785 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field775 = field304.method2256();
                var2.field780 = field304.method2397();
            }
            if ((var3 & 0x40) != 0) {
                var2.field788 = field304.method2256();
                if (var2.field788 == 65535) {
                    var2.field788 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field776 = field304.method2339();
                var2.field765 = 100;
            }
            if ((var3 & 0x8) != 0) {
                int var7 = field304.method2256();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field304.method2247();
                if (var2.field793 == var7 && var7 != -1) {
                    int var9 = class40.method567(var7).field940;
                    if (var9 == 1) {
                        var2.field781 = 0;
                        var2.field782 = 0;
                        var2.field770 = var8;
                        var2.field784 = 0;
                    }
                    if (var9 == 2) {
                        var2.field784 = 0;
                    }
                } else if (var7 == -1 || var2.field793 == -1 || class40.method567(var7).field934 >= class40.method567(var2.field793).field934) {
                    var2.field793 = var7;
                    var2.field781 = 0;
                    var2.field782 = 0;
                    var2.field770 = var8;
                    var2.field784 = 0;
                    var2.field807 = var2.field762;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field725 = class37.method2500(field304.method2397());
                var2.field753 = var2.field725.field827;
                var2.field801 = var2.field725.field850;
                var2.field757 = var2.field725.field836;
                var2.field758 = var2.field725.field834;
                var2.field759 = var2.field725.field835;
                var2.field760 = var2.field725.field821;
                var2.field754 = var2.field725.field838;
                var2.field755 = var2.field725.field854;
                var2.field756 = var2.field725.field830;
            }
            if ((var3 & 0x2) != 0) {
                int var10 = field304.method2245();
                int var11 = field304.method2219();
                var2.method646(var10, var11, field270);
                var2.field771 = field270 + 300;
                var2.field772 = field304.method2254();
                var2.field773 = field304.method2256();
            }
        }
    }

    @ObfuscatedName("cs.be(I)V")
    public static final void method2132() {
        int var0 = Statics.field968;
        int var1 = Statics.field26;
        int var2 = Statics.field1960;
        int var3 = Statics.field1924;
        int var4 = 6116423;
        class75.method1592(var0, var1, var2, var3, var4);
        class75.method1592(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class75.method1640(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field250.method3656(class148.field2351, var0 + 3, var1 + 14, var4, -1);
        int var5 = class132.field2041;
        int var6 = class132.field2050;
        for (int var7 = 0; var7 < field405; var7++) {
            int var8 = (field405 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field250.method3656(method586(var7), var0 + 3, var8, var9, 0);
        }
        method1400(Statics.field968, Statics.field26, Statics.field1960, Statics.field1924);
    }

    @ObfuscatedName("r.bw(IIIII)V")
    public static final void method84(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field468; var4++) {
            if (field475[var4] + field316[var4] > arg0 && field316[var4] < arg0 + arg2 && field493[var4] + field426[var4] > arg1 && field426[var4] < arg1 + arg3) {
                field486[var4] = true;
            }
        }
    }

    @ObfuscatedName("bq.bj(IIIII)V")
    public static final void method1400(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field468; var4++) {
            if (field475[var4] + field316[var4] > arg0 && field316[var4] < arg0 + arg2 && field493[var4] + field426[var4] > arg1 && field426[var4] < arg1 + arg3) {
                field471[var4] = true;
            }
        }
    }

    @ObfuscatedName("de.bk(I)V")
    public static final void method2549() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field405 - 1; var1++) {
                if (field392[var1] < 1000 && field392[var1 + 1] > 1000) {
                    String var2 = field411[var1];
                    field411[var1] = field411[var1 + 1];
                    field411[var1 + 1] = var2;
                    String var3 = field410[var1];
                    field410[var1] = field410[var1 + 1];
                    field410[var1 + 1] = var3;
                    int var4 = field392[var1];
                    field392[var1] = field392[var1 + 1];
                    field392[var1 + 1] = var4;
                    int var5 = field262[var1];
                    field262[var1] = field262[var1 + 1];
                    field262[var1 + 1] = var5;
                    int var6 = field511[var1];
                    field511[var1] = field511[var1 + 1];
                    field511[var1 + 1] = var6;
                    int var7 = field409[var1];
                    field409[var1] = field409[var1 + 1];
                    field409[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field1014 != null || field436 != null) {
            return;
        }
        int var8 = class132.field2047;
        if (field404) {
            if (var8 != 1 && (Statics.field1276 || var8 != 4)) {
                int var9 = class132.field2041;
                int var10 = class132.field2050;
                if (var9 < Statics.field968 - 10 || var9 > Statics.field968 + Statics.field1960 + 10 || var10 < Statics.field26 - 10 || var10 > Statics.field26 + Statics.field1924 + 10) {
                    field404 = false;
                    method84(Statics.field968, Statics.field26, Statics.field1960, Statics.field1924);
                }
            }
            if (var8 == 1 || !Statics.field1276 && var8 == 4) {
                int var11 = Statics.field968;
                int var12 = Statics.field26;
                int var13 = Statics.field1960;
                int var14 = class132.field2049;
                int var15 = class132.field2055;
                int var16 = -1;
                for (int var17 = 0; var17 < field405; var17++) {
                    int var18 = (field405 - 1 - var17) * 15 + var12 + 31;
                    if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                        var16 = var17;
                    }
                }
                if (var16 != -1 && var16 >= 0) {
                    int var19 = field262[var16];
                    int var20 = field511[var16];
                    int var21 = field392[var16];
                    int var22 = field409[var16];
                    String var23 = field410[var16];
                    String var24 = field411[var16];
                    method1106(var19, var20, var21, var22, var23, var24, class132.field2049, class132.field2055);
                }
                field404 = false;
                method84(Statics.field968, Statics.field26, Statics.field1960, Statics.field1924);
            }
            return;
        }
        if ((var8 == 1 || !Statics.field1276 && var8 == 4) && field405 > 0) {
            int var25 = field392[field405 - 1];
            if (var25 == 39 || var25 == 40 || var25 == 41 || var25 == 42 || var25 == 43 || var25 == 33 || var25 == 34 || var25 == 35 || var25 == 36 || var25 == 37 || var25 == 38 || var25 == 1005) {
                int var26 = field262[field405 - 1];
                int var27 = field511[field405 - 1];
                class164 var28 = class164.method2499(var27);
                if (class169.method170(method683(var28)) || class169.method177(method683(var28))) {
                    if (Statics.field1014 != null && !field378 && field403 != 1 && !method2873(field405 - 1) && field405 > 0) {
                        int var29 = field375;
                        int var30 = field451;
                        class29 var31 = Statics.field710;
                        method1106(var31.field665, var31.field664, var31.field667, var31.field666, var31.field669, var31.field669, var29, var30);
                        Statics.field710 = null;
                    }
                    field378 = false;
                    field379 = 0;
                    if (Statics.field1014 != null) {
                        method33(Statics.field1014);
                    }
                    Statics.field1014 = class164.method2499(var27);
                    field374 = var26;
                    field375 = class132.field2049;
                    field451 = class132.field2055;
                    if (field405 > 0) {
                        int var32 = field405 - 1;
                        Statics.field710 = new class29();
                        Statics.field710.field665 = field262[var32];
                        Statics.field710.field664 = field511[var32];
                        Statics.field710.field667 = field392[var32];
                        Statics.field710.field666 = field409[var32];
                        Statics.field710.field669 = field410[var32];
                    }
                    method33(Statics.field1014);
                    return;
                }
            }
        }
        if ((var8 == 1 || !Statics.field1276 && var8 == 4) && (field403 == 1 && field405 > 2 || method2873(field405 - 1))) {
            var8 = 2;
        }
        if ((var8 == 1 || !Statics.field1276 && var8 == 4) && field405 > 0) {
            int var33 = field405 - 1;
            if (var33 >= 0) {
                int var34 = field262[var33];
                int var35 = field511[var33];
                int var36 = field392[var33];
                int var37 = field409[var33];
                String var38 = field410[var33];
                String var39 = field411[var33];
                method1106(var34, var35, var36, var37, var38, var39, class132.field2049, class132.field2055);
            }
        }
        if (var8 == 2 && field405 > 0) {
            method7(class132.field2049, class132.field2055);
        }
    }

    @ObfuscatedName("l.cw(IIB)V")
    public static final void method7(int arg0, int arg1) {
        int var2 = Statics.field250.method3651(class148.field2351);
        for (int var3 = 0; var3 < field405; var3++) {
            int var4 = Statics.field250.method3651(method586(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field405 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field3047) {
            var6 = Statics.field3047 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field187) {
            var7 = Statics.field187 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field404 = true;
        Statics.field968 = var6;
        Statics.field26 = var7;
        Statics.field1960 = var2;
        Statics.field1924 = field405 * 15 + 22;
    }

    @ObfuscatedName("em.ch(II)Z")
    public static final boolean method2873(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field392[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ah.cy(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1106(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 44) {
            class3 var8 = field381[arg3];
            if (var8 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(125);
                field302.method2424(arg3);
                field302.method2204(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(87);
            field302.method2205(Statics.field2064);
            field302.method2244(class129.field2010[82] ? 1 : 0);
            field302.method2252(Statics.field124 + arg1);
            field302.method2205(arg3);
            field302.method2266(Statics.field191);
            field302.method2252(Statics.field120 + arg0);
            field302.method2252(Statics.field1841);
        }
        if (arg2 == 4) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(135);
            field302.method2205(Statics.field124 + arg1);
            field302.method2424(Statics.field120 + arg0);
            field302.method2204(class129.field2010[82] ? 1 : 0);
            field302.method2252(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 23) {
            Statics.field2621.method1706(Statics.field1086, arg0, arg1);
        }
        if (arg2 == 6) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(33);
            field302.method2424(arg3 >> 14 & 0x7FFF);
            field302.method2205(Statics.field120 + arg0);
            field302.method2252(Statics.field124 + arg1);
            field302.method2244(class129.field2010[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class3 var9 = field381[arg3];
            if (var9 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(56);
                field302.method2204(class129.field2010[82] ? 1 : 0);
                field302.method2252(arg3);
            }
        }
        if (arg2 == 17) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(97);
            field302.method2252(Statics.field120 + arg0);
            field302.method2324(class129.field2010[82] ? 1 : 0);
            field302.method2252(Statics.field124 + arg1);
            field302.method2424(arg3);
            field302.method2251(field419);
            field302.method2314(Statics.field2523);
        }
        if (arg2 == 13) {
            class32 var10 = field299[arg3];
            if (var10 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(83);
                field302.method2251(arg3);
                field302.method2204(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var11 = class164.method629(arg1, arg0);
            if (var11 != null) {
                int var12 = var11.field2757;
                class164 var13 = class164.method629(arg1, arg0);
                if (var13 != null) {
                    if (var13.field2737 != null) {
                        class1 var14 = new class1();
                        var14.field10 = var13;
                        var14.field6 = arg3;
                        var14.field16 = arg5;
                        var14.field8 = var13.field2737;
                        class34.method74(var14);
                    }
                    boolean var15 = true;
                    if (var13.field2717 > 0) {
                        var15 = method2845(var13);
                    }
                    if (var15) {
                        int var16 = method683(var13);
                        int var17 = arg3 - 1;
                        boolean var18 = (var16 >> var17 + 1 & 0x1) != 0;
                        if (var18) {
                            if (arg3 == 1) {
                                field302.method2477(70);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                            if (arg3 == 2) {
                                field302.method2477(213);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                            if (arg3 == 3) {
                                field302.method2477(61);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                            if (arg3 == 4) {
                                field302.method2477(156);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                            if (arg3 == 5) {
                                field302.method2477(78);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                            if (arg3 == 6) {
                                field302.method2477(42);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                            if (arg3 == 7) {
                                field302.method2477(20);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                            if (arg3 == 8) {
                                field302.method2477(182);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                            if (arg3 == 9) {
                                field302.method2477(104);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                            if (arg3 == 10) {
                                field302.method2477(234);
                                field302.method2369(arg1);
                                field302.method2205(arg0);
                                field302.method2205(var12);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 9) {
            class32 var19 = field299[arg3];
            if (var19 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(214);
                field302.method2204(class129.field2010[82] ? 1 : 0);
                field302.method2205(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var20 = field381[arg3];
            if (var20 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(53);
                field302.method2204(class129.field2010[82] ? 1 : 0);
                field302.method2251(arg3);
            }
        }
        if (arg2 == 19) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(219);
            field302.method2424(arg3);
            field302.method2251(Statics.field124 + arg1);
            field302.method2424(Statics.field120 + arg0);
            field302.method2324(class129.field2010[82] ? 1 : 0);
        }
        if (arg2 == 33) {
            field302.method2477(192);
            field302.method2266(arg1);
            field302.method2205(arg3);
            field302.method2252(arg0);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 30 && field540 == null) {
            method2028(arg1, arg0);
            field540 = class164.method629(arg1, arg0);
            method33(field540);
        }
        if (arg2 == 15) {
            class3 var21 = field381[arg3];
            if (var21 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(189);
                field302.method2261(Statics.field2523);
                field302.method2251(field419);
                field302.method2251(arg3);
                field302.method2346(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(138);
            field302.method2204(class129.field2010[82] ? 1 : 0);
            field302.method2205(Statics.field124 + arg1);
            field302.method2251(Statics.field120 + arg0);
            field302.method2424(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 10) {
            class32 var22 = field299[arg3];
            if (var22 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(119);
                field302.method2251(arg3);
                field302.method2346(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var23 = field381[arg3];
            if (var23 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(227);
                field302.method2424(Statics.field2064);
                field302.method2424(arg3);
                field302.method2252(Statics.field1841);
                field302.method2324(class129.field2010[82] ? 1 : 0);
                field302.method2369(Statics.field191);
            }
        }
        if (arg2 == 8) {
            class32 var24 = field299[arg3];
            if (var24 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(178);
                field302.method2369(Statics.field2523);
                field302.method2424(arg3);
                field302.method2205(field419);
                field302.method2204(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 12) {
            class32 var25 = field299[arg3];
            if (var25 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(171);
                field302.method2252(arg3);
                field302.method2244(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field302.method2477(243);
            field302.method2252(arg3);
            field302.method2252(arg0);
            field302.method2369(arg1);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 43) {
            field302.method2477(120);
            field302.method2424(arg3);
            field302.method2251(arg0);
            field302.method2261(arg1);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 1004) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field302.method2477(130);
            field302.method2252(arg3);
        }
        if (arg2 == 38) {
            method2655();
            class164 var26 = class164.method2499(arg1);
            field416 = 1;
            Statics.field2064 = arg0;
            Statics.field191 = arg1;
            Statics.field1841 = arg3;
            method33(var26);
            field417 = class2.method3034(16748608) + class47.method2700(arg3).field1075 + class2.method3034(16777215);
            if (field417 == null) {
                field417 = "null";
            }
            return;
        }
        if (arg2 == 41) {
            field302.method2477(181);
            field302.method2252(arg3);
            field302.method2205(arg0);
            field302.method2261(arg1);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 45) {
            class3 var27 = field381[arg3];
            if (var27 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(76);
                field302.method2244(class129.field2010[82] ? 1 : 0);
                field302.method2251(arg3);
            }
        }
        if (arg2 == 32) {
            field302.method2477(247);
            field302.method2314(arg1);
            field302.method2251(arg3);
            field302.method2424(arg0);
            field302.method2424(field419);
            field302.method2314(Statics.field2523);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 25) {
            class164 var28 = class164.method629(arg1, arg0);
            if (var28 != null) {
                method2655();
                int var29 = method683(var28);
                int var30 = var29 >> 11 & 0x3F;
                int var32 = var28.field2757;
                class164 var33 = class164.method629(arg1, arg0);
                if (var33 != null && var33.field2728 != null) {
                    class1 var34 = new class1();
                    var34.field10 = var33;
                    var34.field8 = var33.field2728;
                    class34.method74(var34);
                }
                field420 = var32;
                field418 = true;
                Statics.field2523 = arg1;
                field419 = arg0;
                Statics.field138 = var30;
                method33(var33);
                field416 = 0;
                int var35 = method683(var28);
                int var36 = var35 >> 11 & 0x3F;
                String var37;
                if (var36 == 0) {
                    var37 = null;
                } else if (var28.field2716 == null || var28.field2716.trim().length() == 0) {
                    var37 = null;
                } else {
                    var37 = var28.field2716;
                }
                field421 = var37;
                if (field421 == null) {
                    field421 = "Null";
                }
                if (var28.field2657) {
                    field389 = var28.field2678 + class2.method3034(16777215);
                } else {
                    field389 = class2.method3034(65280) + var28.field2693 + class2.method3034(16777215);
                }
            }
            return;
        }
        if (arg2 == 5) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(62);
            field302.method2346(class129.field2010[82] ? 1 : 0);
            field302.method2424(Statics.field124 + arg1);
            field302.method2424(Statics.field120 + arg0);
            field302.method2252(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 11) {
            class32 var38 = field299[arg3];
            if (var38 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(64);
                field302.method2252(arg3);
                field302.method2244(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class32 var39 = field299[arg3];
            if (var39 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(43);
                field302.method2252(Statics.field2064);
                field302.method2424(Statics.field1841);
                field302.method2204(class129.field2010[82] ? 1 : 0);
                field302.method2369(Statics.field191);
                field302.method2424(arg3);
            }
        }
        if (arg2 == 36) {
            field302.method2477(71);
            field302.method2314(arg1);
            field302.method2252(arg3);
            field302.method2251(arg0);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 29) {
            field302.method2477(0);
            field302.method2369(arg1);
            class164 var40 = class164.method2499(arg1);
            if (var40.field2749 != null && var40.field2749[0][0] == 5) {
                int var41 = var40.field2749[0][1];
                if (class167.field2791[var41] != var40.field2751[0]) {
                    class167.field2791[var41] = var40.field2751[0];
                    method3038(var41);
                }
            }
        }
        if (arg2 == 18) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(190);
            field302.method2424(Statics.field120 + arg0);
            field302.method2324(class129.field2010[82] ? 1 : 0);
            field302.method2251(arg3);
            field302.method2252(Statics.field124 + arg1);
        }
        if (arg2 == 21) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(200);
            field302.method2204(class129.field2010[82] ? 1 : 0);
            field302.method2424(Statics.field124 + arg1);
            field302.method2205(Statics.field120 + arg0);
            field302.method2424(arg3);
        }
        if (arg2 == 24) {
            class164 var42 = class164.method2499(arg1);
            boolean var43 = true;
            if (var42.field2717 > 0) {
                var43 = method2845(var42);
            }
            if (var43) {
                field302.method2477(0);
                field302.method2369(arg1);
            }
        }
        if (arg2 == 20) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(165);
            field302.method2204(class129.field2010[82] ? 1 : 0);
            field302.method2205(Statics.field120 + arg0);
            field302.method2251(Statics.field124 + arg1);
            field302.method2251(arg3);
        }
        if (arg2 == 2) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(39);
            field302.method2424(field419);
            field302.method2261(Statics.field2523);
            field302.method2424(arg3 >> 14 & 0x7FFF);
            field302.method2424(Statics.field120 + arg0);
            field302.method2324(class129.field2010[82] ? 1 : 0);
            field302.method2252(Statics.field124 + arg1);
        }
        if (arg2 == 28) {
            field302.method2477(0);
            field302.method2369(arg1);
            class164 var44 = class164.method2499(arg1);
            if (var44.field2749 != null && var44.field2749[0][0] == 5) {
                int var45 = var44.field2749[0][1];
                class167.field2791[var45] = 1 - class167.field2791[var45];
                method3038(var45);
            }
        }
        if (arg2 == 35) {
            field302.method2477(137);
            field302.method2205(arg3);
            field302.method2424(arg0);
            field302.method2266(arg1);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 50) {
            class3 var46 = field381[arg3];
            if (var46 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(126);
                field302.method2324(class129.field2010[82] ? 1 : 0);
                field302.method2251(arg3);
            }
        }
        if (arg2 == 51) {
            class3 var47 = field381[arg3];
            if (var47 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(166);
                field302.method2244(class129.field2010[82] ? 1 : 0);
                field302.method2424(arg3);
            }
        }
        if (arg2 == 26) {
            method740();
        }
        if (arg2 == 37) {
            field302.method2477(90);
            field302.method2251(arg0);
            field302.method2261(arg1);
            field302.method2424(arg3);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 1005) {
            class164 var48 = class164.method2499(arg1);
            if (var48 == null || var48.field2665[arg0] < 100000) {
                field302.method2477(130);
                field302.method2252(arg3);
            } else {
                class11.method626(27, "", var48.field2665[arg0] + " x " + class47.method2700(arg3).field1075);
            }
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 31) {
            field302.method2477(199);
            field302.method2261(arg1);
            field302.method2251(arg0);
            field302.method2314(Statics.field191);
            field302.method2252(Statics.field1841);
            field302.method2252(arg3);
            field302.method2252(Statics.field2064);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 42) {
            field302.method2477(80);
            field302.method2205(arg0);
            field302.method2369(arg1);
            field302.method2205(arg3);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 1) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(206);
            field302.method2251(Statics.field124 + arg1);
            field302.method2251(Statics.field120 + arg0);
            field302.method2369(Statics.field191);
            field302.method2205(Statics.field1841);
            field302.method2424(arg3 >> 14 & 0x7FFF);
            field302.method2346(class129.field2010[82] ? 1 : 0);
            field302.method2252(Statics.field2064);
        }
        if (arg2 == 1001) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(198);
            field302.method2424(Statics.field120 + arg0);
            field302.method2205(arg3 >> 14 & 0x7FFF);
            field302.method2252(Statics.field124 + arg1);
            field302.method2346(class129.field2010[82] ? 1 : 0);
        }
        if (arg2 == 1003) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            class32 var49 = field299[arg3];
            if (var49 != null) {
                class37 var50 = var49.field725;
                if (var50.field851 != null) {
                    var50 = var50.method669();
                }
                if (var50 != null) {
                    field302.method2477(127);
                    field302.method2251(var50.field825);
                }
            }
        }
        if (arg2 == 40) {
            field302.method2477(72);
            field302.method2251(arg0);
            field302.method2266(arg1);
            field302.method2424(arg3);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 1002) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field302.method2477(111);
            field302.method2205(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 22) {
            field368 = arg6;
            field369 = arg7;
            field371 = 2;
            field370 = 0;
            field499 = arg0;
            field364 = arg1;
            field302.method2477(128);
            field302.method2205(Statics.field124 + arg1);
            field302.method2252(arg3);
            field302.method2252(Statics.field120 + arg0);
            field302.method2346(class129.field2010[82] ? 1 : 0);
        }
        if (arg2 == 58) {
            class164 var51 = class164.method629(arg1, arg0);
            if (var51 != null) {
                field302.method2477(188);
                field302.method2369(arg1);
                field302.method2266(Statics.field2523);
                field302.method2205(arg0);
                field302.method2252(field420);
                field302.method2205(var51.field2757);
                field302.method2205(field419);
            }
        }
        if (arg2 == 39) {
            field302.method2477(215);
            field302.method2266(arg1);
            field302.method2424(arg0);
            field302.method2205(arg3);
            field372 = 0;
            Statics.field662 = class164.method2499(arg1);
            field530 = arg0;
        }
        if (arg2 == 47) {
            class3 var52 = field381[arg3];
            if (var52 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(44);
                field302.method2324(class129.field2010[82] ? 1 : 0);
                field302.method2251(arg3);
            }
        }
        if (arg2 == 49) {
            class3 var53 = field381[arg3];
            if (var53 != null) {
                field368 = arg6;
                field369 = arg7;
                field371 = 2;
                field370 = 0;
                field499 = arg0;
                field364 = arg1;
                field302.method2477(251);
                field302.method2424(arg3);
                field302.method2324(class129.field2010[82] ? 1 : 0);
            }
        }
        if (field416 != 0) {
            field416 = 0;
            method33(class164.method2499(Statics.field191));
        }
        if (field418) {
            method2655();
        }
        if (Statics.field662 != null && field372 == 0) {
            method33(Statics.field662);
        }
    }

    @ObfuscatedName("dh.cj(I)V")
    public static void method2655() {
        if (!field418) {
            return;
        }
        class164 var0 = class164.method629(Statics.field2523, field419);
        if (var0 != null && var0.field2729 != null) {
            class1 var1 = new class1();
            var1.field10 = var0;
            var1.field8 = var0.field2729;
            class34.method74(var1);
        }
        field418 = false;
        method33(var0);
    }

    @ObfuscatedName("cc.cf(IIB)V")
    public static void method2028(int arg0, int arg1) {
        field302.method2477(131);
        field302.method2205(arg1);
        field302.method2314(arg0);
    }

    @ObfuscatedName("v.cm(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method90(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field404 || field405 >= 500) {
            return;
        }
        field410[field405] = arg0;
        field411[field405] = arg1;
        field392[field405] = arg2;
        field409[field405] = arg3;
        field262[field405] = arg4;
        field511[field405] = arg5;
        field405++;
    }

    @ObfuscatedName("c.co(S)V")
    public static void method111() {
        for (int var0 = 0; var0 < field405; var0++) {
            int var1 = field392[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field405 - 1) {
                    for (int var3 = var0; var3 < field405 - 1; var3++) {
                        field410[var3] = field410[var3 + 1];
                        field411[var3] = field411[var3 + 1];
                        field392[var3] = field392[var3 + 1];
                        field409[var3] = field409[var3 + 1];
                        field262[var3] = field262[var3 + 1];
                        field511[var3] = field511[var3 + 1];
                    }
                }
                field405--;
            }
        }
    }

    @ObfuscatedName("av.cr(II)Ljava/lang/String;")
    public static String method586(int arg0) {
        return field411[arg0].length() > 0 ? field410[arg0] + class148.field2358 + field411[arg0] : field410[arg0];
    }

    @ObfuscatedName("x.cd(IIIIB)V")
    public static final void method174(int arg0, int arg1, int arg2, int arg3) {
        if (field416 == 0 && !field418) {
            method90(class148.field2353, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class100.field1718; var6++) {
            int var7 = class100.field1720[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2621.method1699(Statics.field1086, var8, var9, var7) >= 0) {
                    class38 var12 = class38.method150(var11);
                    if (var12.field861 != null) {
                        var12 = var12.method704();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field416 == 1) {
                        method90(class148.field2217, field417 + " " + class2.field23 + " " + class2.method3034(65535) + var12.field869, 1, var7, var8, var9);
                    } else if (!field418) {
                        String[] var13 = var12.field862;
                        if (field434) {
                            var13 = method2040(var13);
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
                                    method90(var13[var14], class2.method3034(65535) + var12.field869, var15, var7, var8, var9);
                                }
                            }
                        }
                        method90(class148.field2349, class2.method3034(65535) + var12.field869, 1002, var12.field866 << 14, var8, var9);
                    } else if ((Statics.field138 & 0x4) == 4) {
                        method90(field421, field389 + " " + class2.field23 + " " + class2.method3034(65535) + var12.field869, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class32 var16 = field299[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field725.field827 == 1 && (var16.field804 & 0x7F) == 64 && (var16.field750 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field300; var17++) {
                            class32 var18 = field299[field301[var17]];
                            if (var18 != null && var16 != var18 && var18.field725.field827 == 1 && var16.field804 == var18.field804 && var16.field750 == var18.field750) {
                                method8(var18.field725, field301[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field382; var19++) {
                            class3 var20 = field381[field383[var19]];
                            if (var20 != null && var16.field804 == var20.field804 && var16.field750 == var20.field750) {
                                method554(var20, field383[var19], var8, var9);
                            }
                        }
                    }
                    method8(var16.field725, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field381[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field804 & 0x7F) == 64 && (var21.field750 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field300; var22++) {
                            class32 var23 = field299[field301[var22]];
                            if (var23 != null && var23.field725.field827 == 1 && var21.field804 == var23.field804 && var21.field750 == var23.field750) {
                                method8(var23.field725, field301[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field382; var24++) {
                            class3 var25 = field381[field383[var24]];
                            if (var25 != null && var21 != var25 && var21.field804 == var25.field804 && var21.field750 == var25.field750) {
                                method554(var25, field383[var24], var8, var9);
                            }
                        }
                    }
                    if (field406 == var11) {
                        var4 = var7;
                    } else {
                        method554(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class190 var26 = field396[Statics.field1086][var8][var9];
                    if (var26 != null) {
                        for (class27 var27 = (class27) var26.method3469(); var27 != null; var27 = (class27) var26.method3494()) {
                            class47 var28 = class47.method2700(var27.field646);
                            if (field416 == 1) {
                                method90(class148.field2217, field417 + " " + class2.field23 + " " + class2.method3034(16748608) + var28.field1075, 16, var27.field646, var8, var9);
                            } else if (!field418) {
                                String[] var29 = var28.field1053;
                                if (field434) {
                                    var29 = method2040(var29);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 18;
                                        }
                                        if (var30 == 1) {
                                            var31 = 19;
                                        }
                                        if (var30 == 2) {
                                            var31 = 20;
                                        }
                                        if (var30 == 3) {
                                            var31 = 21;
                                        }
                                        if (var30 == 4) {
                                            var31 = 22;
                                        }
                                        method90(var29[var30], class2.method3034(16748608) + var28.field1075, var31, var27.field646, var8, var9);
                                    } else if (var30 == 2) {
                                        method90(class148.field2413, class2.method3034(16748608) + var28.field1075, 20, var27.field646, var8, var9);
                                    }
                                }
                                method90(class148.field2349, class2.method3034(16748608) + var28.field1075, 1004, var27.field646, var8, var9);
                            } else if ((Statics.field138 & 0x1) == 1) {
                                method90(field421, field389 + " " + class2.field23 + " " + class2.method3034(16748608) + var28.field1075, 17, var27.field646, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field381[field406];
            method554(var34, field406, var32, var33);
        }
    }

    @ObfuscatedName("l.ck(Laa;IIII)V")
    public static final void method8(class37 arg0, int arg1, int arg2, int arg3) {
        if (field405 >= 400) {
            return;
        }
        if (arg0.field851 != null) {
            arg0 = arg0.method669();
        }
        if (arg0 == null || !arg0.field829 || arg0.field843 && field431 != arg1) {
            return;
        }
        String var4 = arg0.field826;
        if (arg0.field855 != 0) {
            var4 = var4 + method3352(arg0.field855, Statics.field571.field32) + " " + class2.field20 + class148.field2354 + arg0.field855 + class2.field19;
        }
        if (field416 == 1) {
            method90(class148.field2217, field417 + " " + class2.field23 + " " + class2.method3034(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field418) {
            String[] var5 = arg0.field841;
            if (field434) {
                var5 = method2040(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class148.field2258)) {
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
                        method90(var5[var6], class2.method3034(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class148.field2258)) {
                        short var9 = 0;
                        if (field287 == class19.field544 || field287 == class19.field545 && arg0.field855 > Statics.field571.field32) {
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
                        method90(var5[var8], class2.method3034(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method90(class148.field2349, class2.method3034(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field138 & 0x2) == 2) {
            method90(field421, field389 + " " + class2.field23 + " " + class2.method3034(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("z.ce(Lg;IIIB)V")
    public static final void method554(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field571 == arg0 || field405 >= 400) {
            return;
        }
        String var4;
        if (arg0.field33 == 0) {
            var4 = arg0.field38 + method3352(arg0.field32, Statics.field571.field32) + " " + class2.field20 + class148.field2354 + arg0.field32 + class2.field19;
        } else {
            var4 = arg0.field38 + " " + class2.field20 + class148.field2361 + arg0.field33 + class2.field19;
        }
        if (field416 == 1) {
            method90(class148.field2217, field417 + " " + class2.field23 + " " + class2.method3034(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field418) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field478[var5] != null) {
                    short var6 = 0;
                    if (field478[var5].equalsIgnoreCase(class148.field2258)) {
                        if (field287 == class19.field544 || field287 == class19.field545 && arg0.field32 > Statics.field571.field32) {
                            var6 = 2000;
                        }
                        if (Statics.field571.field46 != 0 && arg0.field46 != 0) {
                            if (Statics.field571.field46 == arg0.field46) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field393[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field391[var5] + var6;
                    method90(field478[var5], class2.method3034(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field138 & 0x8) == 8) {
            method90(field421, field389 + " " + class2.field23 + " " + class2.method3034(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field405; var9++) {
            if (field392[var9] == 23) {
                field411[var9] = class2.method3034(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ft.cn(III)Ljava/lang/String;")
    public static final String method3352(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method3034(16711680);
        } else if (var2 < -6) {
            return class2.method3034(16723968);
        } else if (var2 < -3) {
            return class2.method3034(16740352);
        } else if (var2 < 0) {
            return class2.method3034(16756736);
        } else if (var2 > 9) {
            return class2.method3034(65280);
        } else if (var2 > 6) {
            return class2.method3034(4259584);
        } else if (var2 > 3) {
            return class2.method3034(8453888);
        } else if (var2 > 0) {
            return class2.method3034(12648192);
        } else {
            return class2.method3034(16776960);
        }
    }

    @ObfuscatedName("aw.ca(IIIIIIIIB)V")
    public static final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method817(arg0)) {
            Statics.field1874 = null;
            method634(Statics.field2743[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1874 != null) {
                method634(Statics.field1874, -1412584499, arg1, arg2, arg3, arg4, Statics.field59, Statics.field1536, arg7);
                Statics.field1874 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field486[var8] = true;
            }
        } else {
            field486[arg7] = true;
        }
    }

    @ObfuscatedName("ao.ct([Lfu;IIIIIIIII)V")
    public static final void method634(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1586(arg2, arg3, arg4, arg5);
        class86.method1849();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2658 == arg1 || arg1 == -1412584499 && field436 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field316[field468] = var10.field2742 + arg6;
                    field426[field468] = var10.field2664 + arg7;
                    field475[field468] = var10.field2654;
                    field493[field468] = var10.field2655;
                    var11 = ++field468 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2768 = var11;
                var10.field2748 = field270;
                if (!var10.field2657 || !method1949(var10)) {
                    if (var10.field2717 > 0) {
                        method2027(var10);
                    }
                    int var12 = var10.field2742 + arg6;
                    int var13 = var10.field2664 + arg7;
                    int var14 = var10.field2669;
                    if (field436 == var10) {
                        if (arg1 != -1412584499 && !var10.field2715) {
                            Statics.field1874 = arg0;
                            Statics.field59 = arg6;
                            Statics.field1536 = arg7;
                            continue;
                        }
                        if (field514 && field441) {
                            int var15 = class132.field2041;
                            int var16 = class132.field2050;
                            int var17 = var15 - field512;
                            int var18 = var16 - field266;
                            if (var17 < field538) {
                                var17 = field538;
                            }
                            if (var10.field2654 + var17 > field538 + field437.field2654) {
                                var17 = field538 + field437.field2654 - var10.field2654;
                            }
                            if (var18 < field491) {
                                var18 = field491;
                            }
                            if (var10.field2655 + var18 > field491 + field437.field2655) {
                                var18 = field491 + field437.field2655 - var10.field2655;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2715) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2756 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2756 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2654 + var12;
                        int var26 = var10.field2655 + var13;
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
                        int var29 = var10.field2654 + var12;
                        int var30 = var10.field2655 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2657 || var19 < var21 && var20 < var22) {
                        if (var10.field2717 != 0) {
                            if (var10.field2717 == 1336) {
                                if (field276) {
                                    var13 += 15;
                                    Statics.field1540.method3657("Fps:" + field2093, var10.field2654 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field263) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field263) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1540.method3657("Mem:" + var32 + "k", var10.field2654 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2717 == 1337) {
                                field412 = var12;
                                field413 = var13;
                                method93(var12, var13, var10.field2654, var10.field2655);
                                field486[var10.field2768] = true;
                                class75.method1586(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2717 == 1338) {
                                method986();
                                class166 var34 = var10.method3073();
                                if (var34 != null) {
                                    class75.method1586(var12, var13, var34.field2783 + var12, var34.field2782 + var13);
                                    if (field501 == 2 || field501 == 5) {
                                        class75.method1587(var12, var13, 0, var34.field2777, var34.field2778);
                                    } else {
                                        int var35 = field346 + field269 & 0x7FF;
                                        int var36 = Statics.field571.field804 / 32 + 48;
                                        int var37 = 464 - Statics.field571.field750 / 32;
                                        Statics.field13.method1483(var12, var13, var34.field2783, var34.field2782, var36, var37, var35, field429 + 256, var34.field2777, var34.field2778);
                                        for (int var38 = 0; var38 < field495; var38++) {
                                            int var39 = field496[var38] * 4 + 2 - Statics.field571.field804 / 32;
                                            int var40 = field497[var38] * 4 + 2 - Statics.field571.field750 / 32;
                                            method894(var12, var13, var39, var40, field498[var38], var34);
                                        }
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= 104) {
                                                for (int var46 = 0; var46 < field300; var46++) {
                                                    class32 var47 = field299[field301[var46]];
                                                    if (var47 != null && var47.method15()) {
                                                        class37 var48 = var47.field725;
                                                        if (var48 != null && var48.field851 != null) {
                                                            var48 = var48.method669();
                                                        }
                                                        if (var48 != null && var48.field842 && var48.field829) {
                                                            int var49 = var47.field804 / 32 - Statics.field571.field804 / 32;
                                                            int var50 = var47.field750 / 32 - Statics.field571.field750 / 32;
                                                            method894(var12, var13, var49, var50, Statics.field1139[1], var34);
                                                        }
                                                    }
                                                }
                                                for (int var51 = 0; var51 < field382; var51++) {
                                                    class3 var52 = field381[field383[var51]];
                                                    if (var52 != null && var52.method15() && !var52.field47) {
                                                        int var53 = var52.field804 / 32 - Statics.field571.field804 / 32;
                                                        int var54 = var52.field750 / 32 - Statics.field571.field750 / 32;
                                                        boolean var55 = false;
                                                        if (method1662(var52.field38, true)) {
                                                            var55 = true;
                                                        }
                                                        boolean var56 = false;
                                                        for (int var57 = 0; var57 < Statics.field1316; var57++) {
                                                            if (var52.field38.equals(Statics.field1925[var57].field604)) {
                                                                var56 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var58 = false;
                                                        if (Statics.field571.field46 != 0 && var52.field46 != 0 && Statics.field571.field46 == var52.field46) {
                                                            var58 = true;
                                                        }
                                                        if (var55) {
                                                            method894(var12, var13, var53, var54, Statics.field1139[3], var34);
                                                        } else if (var58) {
                                                            method894(var12, var13, var53, var54, Statics.field1139[4], var34);
                                                        } else if (var56) {
                                                            method894(var12, var13, var53, var54, Statics.field1139[5], var34);
                                                        } else {
                                                            method894(var12, var13, var53, var54, Statics.field1139[2], var34);
                                                        }
                                                    }
                                                }
                                                if (field515 != 0 && field270 % 20 < 10) {
                                                    if (field515 == 1 && field390 >= 0 && field390 < field299.length) {
                                                        class32 var59 = field299[field390];
                                                        if (var59 != null) {
                                                            int var60 = var59.field804 / 32 - Statics.field571.field804 / 32;
                                                            int var61 = var59.field750 / 32 - Statics.field571.field750 / 32;
                                                            method625(var12, var13, var60, var61, Statics.field1138[1], var34);
                                                        }
                                                    }
                                                    if (field515 == 2) {
                                                        int var62 = field296 * 4 - Statics.field120 * 4 + 2 - Statics.field571.field804 / 32;
                                                        int var63 = field282 * 4 - Statics.field124 * 4 + 2 - Statics.field571.field750 / 32;
                                                        method625(var12, var13, var62, var63, Statics.field1138[1], var34);
                                                    }
                                                    if (field515 == 10 && field280 >= 0 && field280 < field381.length) {
                                                        class3 var64 = field381[field280];
                                                        if (var64 != null) {
                                                            int var65 = var64.field804 / 32 - Statics.field571.field804 / 32;
                                                            int var66 = var64.field750 / 32 - Statics.field571.field750 / 32;
                                                            method625(var12, var13, var65, var66, Statics.field1138[1], var34);
                                                        }
                                                    }
                                                }
                                                if (field499 != 0) {
                                                    int var67 = field499 * 4 + 2 - Statics.field571.field804 / 32;
                                                    int var68 = field364 * 4 + 2 - Statics.field571.field750 / 32;
                                                    method894(var12, var13, var67, var68, Statics.field1138[0], var34);
                                                }
                                                if (!Statics.field571.field47) {
                                                    class75.method1592(var34.field2783 / 2 + var12 - 1, var34.field2782 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                class190 var43 = field396[Statics.field1086][var41][var42];
                                                if (var43 != null) {
                                                    int var44 = var41 * 4 + 2 - Statics.field571.field804 / 32;
                                                    int var45 = var42 * 4 + 2 - Statics.field571.field750 / 32;
                                                    method894(var12, var13, var44, var45, Statics.field1139[0], var34);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    field471[var11] = true;
                                }
                                class75.method1586(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2717 == 1339) {
                                method2128(var10, var12, var13, var11);
                                class75.method1586(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2756 == 0) {
                            if (!var10.field2657 && method1949(var10) && Statics.field552 != var10) {
                                continue;
                            }
                            if (!var10.field2657) {
                                if (var10.field2661 > var10.field2663 - var10.field2655) {
                                    var10.field2661 = var10.field2663 - var10.field2655;
                                }
                                if (var10.field2661 < 0) {
                                    var10.field2661 = 0;
                                }
                            }
                            method634(arg0, var10.field2710, var19, var20, var21, var22, var12 - var10.field2660, var13 - var10.field2661, var11);
                            if (var10.field2761 != null) {
                                method634(var10.field2761, var10.field2710, var19, var20, var21, var22, var12 - var10.field2660, var13 - var10.field2661, var11);
                            }
                            class4 var69 = (class4) field424.method3435((long) var10.field2710);
                            if (var69 != null) {
                                method811(var69.field62, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class75.method1586(arg2, arg3, arg4, arg5);
                            class86.method1849();
                        }
                        if (field340 || field452[var11] || field477 > 1) {
                            if (var10.field2756 == 0 && !var10.field2657 && var10.field2663 > var10.field2655) {
                                int var70 = var10.field2654 + var12;
                                int var71 = var10.field2661;
                                int var72 = var10.field2655;
                                int var73 = var10.field2663;
                                Statics.field1307[0].method1644(var70, var13);
                                Statics.field1307[1].method1644(var70, var13 + var72 - 16);
                                class75.method1592(var70, var13 + 16, 16, var72 - 32, field339);
                                int var74 = (var72 - 32) * var72 / var73;
                                if (var74 < 8) {
                                    var74 = 8;
                                }
                                int var75 = (var72 - 32 - var74) * var71 / (var73 - var72);
                                class75.method1592(var70, var13 + 16 + var75, 16, var74, field395);
                                class75.method1594(var70, var13 + 16 + var75, var74, field342);
                                class75.method1594(var70 + 1, var13 + 16 + var75, var74, field342);
                                class75.method1596(var70, var13 + 16 + var75, 16, field342);
                                class75.method1596(var70, var13 + 17 + var75, 16, field342);
                                class75.method1594(var70 + 15, var13 + 16 + var75, var74, field400);
                                class75.method1594(var70 + 14, var13 + 17 + var75, var74 - 1, field400);
                                class75.method1596(var70, var13 + 15 + var75 + var74, 16, field400);
                                class75.method1596(var70 + 1, var13 + 14 + var75 + var74, 15, field400);
                            }
                            if (var10.field2756 != 1) {
                                if (var10.field2756 == 2) {
                                    int var76 = 0;
                                    for (int var77 = 0; var77 < var10.field2651; var77++) {
                                        for (int var78 = 0; var78 < var10.field2650; var78++) {
                                            int var79 = (var10.field2659 + 32) * var78 + var12;
                                            int var80 = (var10.field2704 + 32) * var77 + var13;
                                            if (var76 < 20) {
                                                var79 += var10.field2705[var76];
                                                var80 += var10.field2706[var76];
                                            }
                                            if (var10.field2755[var76] > 0) {
                                                boolean var81 = false;
                                                boolean var82 = false;
                                                int var83 = var10.field2755[var76] - 1;
                                                if (var79 + 32 > arg2 && var79 < arg4 && var80 + 32 > arg3 && var80 < arg5 || Statics.field1014 == var10 && field374 == var76) {
                                                    class74 var84;
                                                    if (field416 == 1 && Statics.field2064 == var76 && Statics.field191 == var10.field2710) {
                                                        var84 = class47.method1(var83, var10.field2665[var76], 2, 0, 2, false);
                                                    } else {
                                                        var84 = class47.method1(var83, var10.field2665[var76], 1, 3153952, 2, false);
                                                    }
                                                    if (var84 == null) {
                                                        method33(var10);
                                                    } else if (Statics.field1014 == var10 && field374 == var76) {
                                                        int var85 = class132.field2041 - field375;
                                                        int var86 = class132.field2050 - field451;
                                                        if (var85 < 5 && var85 > -5) {
                                                            var85 = 0;
                                                        }
                                                        if (var86 < 5 && var86 > -5) {
                                                            var86 = 0;
                                                        }
                                                        if (field379 < 5) {
                                                            var85 = 0;
                                                            var86 = 0;
                                                        }
                                                        var84.method1502(var79 + var85, var80 + var86, 128);
                                                        if (arg1 != -1) {
                                                            class164 var87 = arg0[arg1 & 0xFFFF];
                                                            if (var80 + var86 < class75.field1339 && var87.field2661 > 0) {
                                                                int var88 = field422 * (class75.field1339 - var80 - var86) / 3;
                                                                if (var88 > field422 * 10) {
                                                                    var88 = field422 * 10;
                                                                }
                                                                if (var88 > var87.field2661) {
                                                                    var88 = var87.field2661;
                                                                }
                                                                var87.field2661 -= var88;
                                                                field451 += var88;
                                                                method33(var87);
                                                            }
                                                            if (var80 + var86 + 32 > class75.field1336 && var87.field2661 < var87.field2663 - var87.field2655) {
                                                                int var89 = field422 * (var80 + var86 + 32 - class75.field1336) / 3;
                                                                if (var89 > field422 * 10) {
                                                                    var89 = field422 * 10;
                                                                }
                                                                if (var89 > var87.field2663 - var87.field2655 - var87.field2661) {
                                                                    var89 = var87.field2663 - var87.field2655 - var87.field2661;
                                                                }
                                                                var87.field2661 += var89;
                                                                field451 -= var89;
                                                                method33(var87);
                                                            }
                                                        }
                                                    } else if (Statics.field662 == var10 && field530 == var76) {
                                                        var84.method1502(var79, var80, 128);
                                                    } else {
                                                        var84.method1489(var79, var80);
                                                    }
                                                }
                                            } else if (var10.field2707 != null && var76 < 20) {
                                                class74 var90 = var10.method3077(var76);
                                                if (var90 != null) {
                                                    var90.method1489(var79, var80);
                                                } else if (class164.field2690) {
                                                    method33(var10);
                                                }
                                            }
                                            var76++;
                                        }
                                    }
                                } else if (var10.field2756 == 3) {
                                    int var91;
                                    if (Statics.method2652(var10)) {
                                        var91 = var10.field2703;
                                        if (Statics.field552 == var10 && var10.field2667 != 0) {
                                            var91 = var10.field2667;
                                        }
                                    } else {
                                        var91 = var10.field2639;
                                        if (Statics.field552 == var10 && var10.field2666 != 0) {
                                            var91 = var10.field2666;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2668) {
                                            class75.method1592(var12, var13, var10.field2654, var10.field2655, var91);
                                        } else {
                                            class75.method1640(var12, var13, var10.field2654, var10.field2655, var91);
                                        }
                                    } else if (var10.field2668) {
                                        class75.method1591(var12, var13, var10.field2654, var10.field2655, var91, 256 - (var14 & 0xFF));
                                    } else {
                                        class75.method1610(var12, var13, var10.field2654, var10.field2655, var91, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2756 == 4) {
                                    class215 var92 = var10.method3093();
                                    if (var92 != null) {
                                        String var93 = var10.field2697;
                                        int var94;
                                        if (Statics.method2652(var10)) {
                                            var94 = var10.field2703;
                                            if (Statics.field552 == var10 && var10.field2667 != 0) {
                                                var94 = var10.field2667;
                                            }
                                            if (var10.field2720.length() > 0) {
                                                var93 = var10.field2720;
                                            }
                                        } else {
                                            var94 = var10.field2639;
                                            if (Statics.field552 == var10 && var10.field2666 != 0) {
                                                var94 = var10.field2666;
                                            }
                                        }
                                        if (var10.field2657 && var10.field2757 != -1) {
                                            class47 var95 = class47.method2700(var10.field2757);
                                            var93 = var95.field1075;
                                            if (var93 == null) {
                                                var93 = "null";
                                            }
                                            if ((var95.field1080 == 1 || var10.field2758 != 1) && var10.field2758 != -1) {
                                                var93 = class2.method3034(16748608) + var93 + class2.field25 + " " + 'x' + method136(var10.field2758);
                                            }
                                        }
                                        if (field540 == var10) {
                                            class148 var10000 = (class148) null;
                                            var93 = class148.field2356;
                                            var94 = var10.field2639;
                                        }
                                        if (!var10.field2657) {
                                            var93 = method149(var93, var10);
                                        }
                                        var92.method3734(var93, var12, var13, var10.field2654, var10.field2655, var94, var10.field2700 ? 0 : -1, var10.field2644, var10.field2701, var10.field2699);
                                    } else if (class164.field2690) {
                                        method33(var10);
                                    }
                                } else if (var10.field2756 == 5) {
                                    if (var10.field2657) {
                                        class74 var97;
                                        if (var10.field2757 == -1) {
                                            var97 = var10.method3075(false);
                                        } else {
                                            var97 = class47.method1(var10.field2757, var10.field2758, var10.field2652, var10.field2677, var10.field2695, false);
                                        }
                                        if (var97 != null) {
                                            int var98 = var97.field1329;
                                            int var99 = var97.field1324;
                                            if (var10.field2675) {
                                                class75.method1617(var12, var13, var10.field2654 + var12, var10.field2655 + var13);
                                                int var100 = (var10.field2654 + (var98 - 1)) / var98;
                                                int var101 = (var10.field2655 + (var99 - 1)) / var99;
                                                for (int var102 = 0; var102 < var100; var102++) {
                                                    for (int var103 = 0; var103 < var101; var103++) {
                                                        if (var10.field2708 != 0) {
                                                            var97.method1573(var98 / 2 + var98 * var102 + var12, var99 / 2 + var99 * var103 + var13, var10.field2708, 4096);
                                                        } else if (var14 == 0) {
                                                            var97.method1489(var98 * var102 + var12, var99 * var103 + var13);
                                                        } else {
                                                            var97.method1502(var98 * var102 + var12, var99 * var103 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1586(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var104 = var10.field2654 * 4096 / var98;
                                                if (var10.field2708 != 0) {
                                                    var97.method1573(var10.field2654 / 2 + var12, var10.field2655 / 2 + var13, var10.field2708, var104);
                                                } else if (var14 != 0) {
                                                    var97.method1504(var12, var13, var10.field2654, var10.field2655, 256 - (var14 & 0xFF));
                                                } else if (var10.field2654 == var98 && var10.field2655 == var99) {
                                                    var97.method1489(var12, var13);
                                                } else {
                                                    var97.method1567(var12, var13, var10.field2654, var10.field2655);
                                                }
                                            }
                                        } else if (class164.field2690) {
                                            method33(var10);
                                        }
                                    } else {
                                        class74 var96 = var10.method3075(Statics.method2652(var10));
                                        if (var96 != null) {
                                            var96.method1489(var12, var13);
                                        } else if (class164.field2690) {
                                            method33(var10);
                                        }
                                    }
                                } else if (var10.field2756 == 6) {
                                    boolean var105 = Statics.method2652(var10);
                                    int var106;
                                    if (var105) {
                                        var106 = var10.field2685;
                                    } else {
                                        var106 = var10.field2684;
                                    }
                                    class100 var107 = null;
                                    int var108 = 0;
                                    if (var10.field2757 != -1) {
                                        class47 var109 = class47.method2700(var10.field2757);
                                        if (var109 != null) {
                                            class47 var110 = var109.method927(var10.field2758);
                                            var107 = var110.method926(1);
                                            if (var107 == null) {
                                                method33(var10);
                                            } else {
                                                var107.method2050();
                                                var108 = var107.field1376 / 2;
                                            }
                                        }
                                    } else if (var10.field2747 == 5) {
                                        if (var10.field2681 == 0) {
                                            var107 = field360.method3152((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var107 = Statics.field571.method14();
                                        }
                                    } else if (var106 == -1) {
                                        var107 = var10.method3078((class40) null, -1, var105, Statics.field571.field29);
                                        if (var107 == null && class164.field2690) {
                                            method33(var10);
                                        }
                                    } else {
                                        class40 var111 = class40.method567(var106);
                                        var107 = var10.method3078(var111, var10.field2759, var105, Statics.field571.field29);
                                        if (var107 == null && class164.field2690) {
                                            method33(var10);
                                        }
                                    }
                                    class86.method1868(var10.field2654 / 2 + var12, var10.field2655 / 2 + var13);
                                    int var112 = var10.field2691 * class86.field1501[var10.field2680] >> 16;
                                    int var113 = var10.field2691 * class86.field1478[var10.field2680] >> 16;
                                    if (var107 != null) {
                                        if (var10.field2657) {
                                            var107.method2050();
                                            if (var10.field2694) {
                                                var107.method2062(0, var10.field2689, var10.field2753, var10.field2680, var10.field2686, var10.field2687 + var108 + var112, var10.field2687 + var113, var10.field2691);
                                            } else {
                                                var107.method2061(0, var10.field2689, var10.field2753, var10.field2680, var10.field2686, var10.field2687 + var108 + var112, var10.field2687 + var113);
                                            }
                                        } else {
                                            var107.method2061(0, var10.field2689, 0, var10.field2680, 0, var112, var113);
                                        }
                                    }
                                    class86.method1851();
                                } else {
                                    if (var10.field2756 == 7) {
                                        class215 var114 = var10.method3093();
                                        if (var114 == null) {
                                            if (class164.field2690) {
                                                method33(var10);
                                            }
                                            continue;
                                        }
                                        int var115 = 0;
                                        for (int var116 = 0; var116 < var10.field2651; var116++) {
                                            for (int var117 = 0; var117 < var10.field2650; var117++) {
                                                if (var10.field2755[var115] > 0) {
                                                    class47 var118 = class47.method2700(var10.field2755[var115] - 1);
                                                    String var119;
                                                    if (var118.field1080 != 1 && var10.field2665[var115] == 1) {
                                                        var119 = class2.method3034(16748608) + var118.field1075 + class2.field25;
                                                    } else {
                                                        var119 = class2.method3034(16748608) + var118.field1075 + class2.field25 + " " + 'x' + method136(var10.field2665[var115]);
                                                    }
                                                    int var120 = (var10.field2659 + 115) * var117 + var12;
                                                    int var121 = (var10.field2704 + 12) * var116 + var13;
                                                    if (var10.field2644 == 0) {
                                                        var114.method3656(var119, var120, var121, var10.field2639, var10.field2700 ? 0 : -1);
                                                    } else if (var10.field2644 == 1) {
                                                        var114.method3658(var119, var10.field2654 / 2 + var120, var121, var10.field2639, var10.field2700 ? 0 : -1);
                                                    } else {
                                                        var114.method3657(var119, var10.field2654 + var120 - 1, var121, var10.field2639, var10.field2700 ? 0 : -1);
                                                    }
                                                }
                                                var115++;
                                            }
                                        }
                                    }
                                    if (var10.field2756 == 8 && Statics.field142 == var10 && field415 == field414) {
                                        int var122 = 0;
                                        int var123 = 0;
                                        class215 var124 = Statics.field1540;
                                        String var125 = var10.field2697;
                                        String var126 = method149(var125, var10);
                                        while (var126.length() > 0) {
                                            int var127 = var126.indexOf(class2.field18);
                                            String var128;
                                            if (var127 == -1) {
                                                var128 = var126;
                                                var126 = "";
                                            } else {
                                                var128 = var126.substring(0, var127);
                                                var126 = var126.substring(var127 + 4);
                                            }
                                            int var129 = var124.method3651(var128);
                                            if (var129 > var122) {
                                                var122 = var129;
                                            }
                                            var123 += var124.field3089 + 1;
                                        }
                                        var122 += 6;
                                        var123 += 7;
                                        int var130 = var10.field2654 + var12 - 5 - var122;
                                        int var131 = var10.field2655 + var13 + 5;
                                        if (var130 < var12 + 5) {
                                            var130 = var12 + 5;
                                        }
                                        if (var122 + var130 > arg4) {
                                            var130 = arg4 - var122;
                                        }
                                        if (var123 + var131 > arg5) {
                                            var131 = arg5 - var123;
                                        }
                                        class75.method1592(var130, var131, var122, var123, 16777120);
                                        class75.method1640(var130, var131, var122, var123, 0);
                                        String var132 = var10.field2697;
                                        int var133 = var124.field3089 + var131 + 2;
                                        String var134 = method149(var132, var10);
                                        while (var134.length() > 0) {
                                            int var135 = var134.indexOf(class2.field18);
                                            String var136;
                                            if (var135 == -1) {
                                                var136 = var134;
                                                var134 = "";
                                            } else {
                                                var136 = var134.substring(0, var135);
                                                var134 = var134.substring(var135 + 4);
                                            }
                                            var124.method3656(var136, var130 + 3, var133, 0, -1);
                                            var133 += var124.field3089 + 1;
                                        }
                                    }
                                    if (var10.field2756 == 9) {
                                        if (var10.field2672 == 1) {
                                            int var137;
                                            int var138;
                                            int var139;
                                            int var140;
                                            if (var10.field2671) {
                                                var137 = var12;
                                                var138 = var10.field2655 + var13;
                                                var139 = var10.field2654 + var12;
                                                var140 = var13;
                                            } else {
                                                var137 = var12;
                                                var138 = var13;
                                                var139 = var10.field2654 + var12;
                                                var140 = var10.field2655 + var13;
                                            }
                                            class75.method1638(var137, var138, var139, var140, var10.field2639);
                                        } else {
                                            int var141 = var10.field2654 >= 0 ? var10.field2654 : -var10.field2654;
                                            int var142 = var10.field2655 >= 0 ? var10.field2655 : -var10.field2655;
                                            int var143 = var141;
                                            if (var141 < var142) {
                                                var143 = var142;
                                            }
                                            if (var143 != 0) {
                                                int var144 = (var10.field2654 << 16) / var143;
                                                int var145 = (var10.field2655 << 16) / var143;
                                                if (var145 <= var144) {
                                                    var144 = -var144;
                                                } else {
                                                    var145 = -var145;
                                                }
                                                int var146 = var10.field2672 * var145 >> 17;
                                                int var147 = var10.field2672 * var145 + 1 >> 17;
                                                int var148 = var10.field2672 * var144 >> 17;
                                                int var149 = var10.field2672 * var144 + 1 >> 17;
                                                int var150 = var12 + var146;
                                                int var151 = var12 - var147;
                                                int var152 = var10.field2654 + var12 - var147;
                                                int var153 = var10.field2654 + var12 + var146;
                                                int var154 = var13 + var148;
                                                int var155 = var13 - var149;
                                                int var156 = var10.field2655 + var13 - var149;
                                                int var157 = var10.field2655 + var13 + var148;
                                                class86.method1857(var150, var151, var152);
                                                class86.method1860(var154, var155, var156, var150, var151, var152, var10.field2639);
                                                class86.method1857(var150, var152, var153);
                                                class86.method1860(var154, var156, var157, var150, var152, var153, var10.field2639);
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

    @ObfuscatedName("f.ci(Ljava/lang/String;Lfu;I)Ljava/lang/String;")
    public static String method149(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method78(arg1, var2 - 1);
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
                if (Statics.field2116 != null) {
                    int var9 = Statics.field2116.field2107;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field2116.field2101 != null) {
                        var8 = (String) Statics.field2116.field2101;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.cz(IB)Ljava/lang/String;")
    public static final String method136(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3034(65408) + var1.substring(0, var1.length() - 8) + class148.field2359 + " " + class2.field20 + var1 + class2.field19 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method3034(16777215) + var1.substring(0, var1.length() - 4) + class148.field2435 + " " + class2.field20 + var1 + class2.field19 + class2.field25;
        } else {
            return " " + class2.method3034(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("ah.cl(ZI)V")
    public static final void method1108(boolean arg0) {
        method2130(field423, Statics.field3047, Statics.field187, arg0);
    }

    @ObfuscatedName("i.cc(Lfu;S)V")
    public static void method163(class164 arg0) {
        class164 var1 = arg0.field2658 == -1 ? null : class164.method2499(arg0.field2658);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field3047;
            var3 = Statics.field187;
        } else {
            var2 = var1.field2654;
            var3 = var1.field2655;
        }
        method874(arg0, var2, var3, false);
        method640(arg0, var2, var3);
    }

    @ObfuscatedName("aa.cx([Lfu;Lfu;ZI)V")
    public static void method693(class164[] arg0, class164 arg1, boolean arg2) {
        int var3 = arg1.field2662 == 0 ? arg1.field2654 : arg1.field2662;
        int var4 = arg1.field2663 == 0 ? arg1.field2655 : arg1.field2663;
        method1936(arg0, arg1.field2710, var3, var4, arg2);
        if (arg1.field2761 != null) {
            method1936(arg1.field2761, arg1.field2710, var3, var4, arg2);
        }
        class4 var5 = (class4) field424.method3435((long) arg1.field2710);
        if (var5 != null) {
            method2130(var5.field62, var3, var4, arg2);
        }
        if (arg1.field2717 == 1337) {
        }
    }

    @ObfuscatedName("cs.cg(IIIZI)V")
    public static final void method2130(int arg0, int arg1, int arg2, boolean arg3) {
        if (class164.method817(arg0)) {
            method1936(Statics.field2743[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ce.cp([Lfu;IIIZI)V")
    public static void method1936(class164[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class164 var6 = arg0[var5];
            if (var6 != null && var6.field2658 == arg1) {
                method874(var6, arg2, arg3, arg4);
                method640(var6, arg2, arg3);
                if (var6.field2660 > var6.field2662 - var6.field2654) {
                    var6.field2660 = var6.field2662 - var6.field2654;
                }
                if (var6.field2660 < 0) {
                    var6.field2660 = 0;
                }
                if (var6.field2661 > var6.field2663 - var6.field2655) {
                    var6.field2661 = var6.field2663 - var6.field2655;
                }
                if (var6.field2661 < 0) {
                    var6.field2661 = 0;
                }
                if (var6.field2756 == 0) {
                    method693(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("af.cq(Lfu;IIZI)V")
    public static void method874(class164 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2654;
        int var5 = arg0.field2655;
        if (arg0.field2643 == 0) {
            arg0.field2654 = arg0.field2650;
        } else if (arg0.field2643 == 1) {
            arg0.field2654 = arg1 - arg0.field2650;
        } else if (arg0.field2643 == 2) {
            arg0.field2654 = arg0.field2650 * arg1 >> 14;
        }
        if (arg0.field2647 == 0) {
            arg0.field2655 = arg0.field2651;
        } else if (arg0.field2647 == 1) {
            arg0.field2655 = arg2 - arg0.field2651;
        } else if (arg0.field2647 == 2) {
            arg0.field2655 = arg0.field2651 * arg2 >> 14;
        }
        if (arg0.field2643 == 4) {
            arg0.field2654 = arg0.field2734 * arg0.field2655 / arg0.field2714;
        }
        if (arg0.field2647 == 4) {
            arg0.field2655 = arg0.field2714 * arg0.field2654 / arg0.field2734;
        }
        if (field433 && arg0.field2756 == 0) {
            if (arg0.field2655 < 5 && arg0.field2654 < 5) {
                arg0.field2655 = 5;
                arg0.field2654 = 5;
            } else {
                if (arg0.field2655 <= 0) {
                    arg0.field2655 = 5;
                }
                if (arg0.field2654 <= 0) {
                    arg0.field2654 = 5;
                }
            }
        }
        if (arg0.field2717 == 1337) {
            field297 = arg0;
        }
        if (arg3 && arg0.field2746 != null && (arg0.field2654 != var4 || arg0.field2655 != var5)) {
            class1 var6 = new class1();
            var6.field10 = arg0;
            var6.field8 = arg0.field2746;
            field258.method3470(var6);
        }
    }

    @ObfuscatedName("ab.cb(Lfu;III)V")
    public static void method640(class164 arg0, int arg1, int arg2) {
        if (arg0.field2764 == 0) {
            arg0.field2742 = arg0.field2648;
        } else if (arg0.field2764 == 1) {
            arg0.field2742 = (arg1 - arg0.field2654) / 2 + arg0.field2648;
        } else if (arg0.field2764 == 2) {
            arg0.field2742 = arg1 - arg0.field2654 - arg0.field2648;
        } else if (arg0.field2764 == 3) {
            arg0.field2742 = arg0.field2648 * arg1 >> 14;
        } else if (arg0.field2764 == 4) {
            arg0.field2742 = (arg0.field2648 * arg1 >> 14) + (arg1 - arg0.field2654) / 2;
        } else {
            arg0.field2742 = arg1 - arg0.field2654 - (arg0.field2648 * arg1 >> 14);
        }
        if (arg0.field2645 == 0) {
            arg0.field2664 = arg0.field2649;
        } else if (arg0.field2645 == 1) {
            arg0.field2664 = (arg2 - arg0.field2655) / 2 + arg0.field2649;
        } else if (arg0.field2645 == 2) {
            arg0.field2664 = arg2 - arg0.field2655 - arg0.field2649;
        } else if (arg0.field2645 == 3) {
            arg0.field2664 = arg0.field2649 * arg2 >> 14;
        } else if (arg0.field2645 == 4) {
            arg0.field2664 = (arg0.field2649 * arg2 >> 14) + (arg2 - arg0.field2655) / 2;
        } else {
            arg0.field2664 = arg2 - arg0.field2655 - (arg0.field2649 * arg2 >> 14);
        }
        if (!field433 || arg0.field2756 != 0) {
            return;
        }
        if (arg0.field2742 < 0) {
            arg0.field2742 = 0;
        } else if (arg0.field2742 + arg0.field2654 > arg1) {
            arg0.field2742 = arg1 - arg0.field2654;
        }
        if (arg0.field2664 < 0) {
            arg0.field2664 = 0;
        } else if (arg0.field2664 + arg0.field2655 > arg2) {
            arg0.field2664 = arg2 - arg0.field2655;
        }
    }

    @ObfuscatedName("r.cv(Lfu;II)I")
    public static final int method78(class164 arg0, int arg1) {
        if (arg0.field2749 == null || arg1 >= arg0.field2749.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2749[arg1];
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
                    var7 = field265[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field401[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field402[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = class164.method2499(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method2700(var12).field1057 || field407)) {
                        for (int var13 = 0; var13 < var11.field2755.length; var13++) {
                            if (var12 + 1 == var11.field2755[var13]) {
                                var7 += var11.field2665[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class167.field2791[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2181[field401[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class167.field2791[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field571.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2180[var14]) {
                            var7 += field401[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method2499(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method2700(var18).field1057 || field407)) {
                        for (int var19 = 0; var19 < var17.field2755.length; var19++) {
                            if (var18 + 1 == var17.field2755[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field428;
                }
                if (var6 == 12) {
                    var7 = field291;
                }
                if (var6 == 13) {
                    int var20 = class167.field2791[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class167.method558(var22);
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
                    var7 = (Statics.field571.field804 >> 7) + Statics.field120;
                }
                if (var6 == 19) {
                    var7 = (Statics.field571.field750 >> 7) + Statics.field124;
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

    @ObfuscatedName("cz.cu(IIIIIIII)V")
    public static final void method1952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class164.method817(arg0)) {
            method30(Statics.field2743[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("u.dl([Lfu;IIIIIIIS)V")
    public static final void method30(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2657 || var9.field2756 == 0 || var9.field2713 || method683(var9) != 0 || field437 == var9 || var9.field2717 == 1338) && var9.field2658 == arg1 && (!var9.field2657 || !method1949(var9))) {
                int var10 = var9.field2742 + arg6;
                int var11 = var9.field2664 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2756 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2756 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2654 + var10;
                    int var19 = var9.field2655 + var11;
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
                    int var22 = var9.field2654 + var10;
                    int var23 = var9.field2655 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field436 == var9) {
                    field444 = true;
                    field476 = var10;
                    field397 = var11;
                }
                if (!var9.field2657 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2041;
                    int var25 = class132.field2050;
                    if (class132.field2047 != 0) {
                        var24 = class132.field2049;
                        var25 = class132.field2055;
                    }
                    if (var9.field2717 == 1337) {
                        if (!field341 && !field404 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method174(var24, var25, var12, var13);
                        }
                    } else if (var9.field2717 == 1338) {
                        method2153(var9, var10, var11);
                    } else {
                        if (!field404 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2711 == 1) {
                                method90(var9.field2754, "", 24, 0, 0, var9.field2710);
                            }
                            if (var9.field2711 == 2 && !field418) {
                                int var28 = method683(var9);
                                int var29 = var28 >> 11 & 0x3F;
                                String var30;
                                if (var29 == 0) {
                                    var30 = null;
                                } else if (var9.field2716 == null || var9.field2716.trim().length() == 0) {
                                    var30 = null;
                                } else {
                                    var30 = var9.field2716;
                                }
                                if (var30 != null) {
                                    method90(var30, class2.method3034(65280) + var9.field2693, 25, 0, -1, var9.field2710);
                                }
                            }
                            if (var9.field2711 == 3) {
                                method90(class148.field2357, "", 26, 0, 0, var9.field2710);
                            }
                            if (var9.field2711 == 4) {
                                method90(var9.field2754, "", 28, 0, 0, var9.field2710);
                            }
                            if (var9.field2711 == 5) {
                                method90(var9.field2754, "", 29, 0, 0, var9.field2710);
                            }
                            if (var9.field2711 == 6 && field540 == null) {
                                method90(var9.field2754, "", 30, 0, -1, var9.field2710);
                            }
                            if (var9.field2756 == 2) {
                                int var32 = 0;
                                for (int var33 = 0; var33 < var9.field2655; var33++) {
                                    for (int var34 = 0; var34 < var9.field2654; var34++) {
                                        int var35 = (var9.field2659 + 32) * var34;
                                        int var36 = (var9.field2704 + 32) * var33;
                                        if (var32 < 20) {
                                            var35 += var9.field2705[var32];
                                            var36 += var9.field2706[var32];
                                        }
                                        if (var26 >= var35 && var27 >= var36 && var26 < var35 + 32 && var27 < var36 + 32) {
                                            field377 = var32;
                                            Statics.field164 = var9;
                                            if (var9.field2755[var32] > 0) {
                                                label978: {
                                                    class47 var37 = class47.method2700(var9.field2755[var32] - 1);
                                                    if (field416 == 1) {
                                                        int var38 = method683(var9);
                                                        boolean var39 = (var38 >> 30 & 0x1) != 0;
                                                        if (var39) {
                                                            if (Statics.field191 != var9.field2710 || Statics.field2064 != var32) {
                                                                method90(class148.field2217, field417 + " " + class2.field23 + " " + class2.method3034(16748608) + var37.field1075, 31, var37.field1037, var32, var9.field2710);
                                                            }
                                                            break label978;
                                                        }
                                                    }
                                                    if (field418) {
                                                        int var40 = method683(var9);
                                                        boolean var41 = (var40 >> 30 & 0x1) != 0;
                                                        if (var41) {
                                                            if ((Statics.field138 & 0x10) == 16) {
                                                                method90(field421, field389 + " " + class2.field23 + " " + class2.method3034(16748608) + var37.field1075, 32, var37.field1037, var32, var9.field2710);
                                                            }
                                                            break label978;
                                                        }
                                                    }
                                                    String[] var42 = var37.field1054;
                                                    if (field434) {
                                                        var42 = method2040(var42);
                                                    }
                                                    int var43 = method683(var9);
                                                    boolean var44 = (var43 >> 30 & 0x1) != 0;
                                                    if (var44) {
                                                        for (int var45 = 4; var45 >= 3; var45--) {
                                                            if (var42 != null && var42[var45] != null) {
                                                                byte var46;
                                                                if (var45 == 3) {
                                                                    var46 = 36;
                                                                } else {
                                                                    var46 = 37;
                                                                }
                                                                method90(var42[var45], class2.method3034(16748608) + var37.field1075, var46, var37.field1037, var32, var9.field2710);
                                                            } else if (var45 == 4) {
                                                                method90(class148.field2199, class2.method3034(16748608) + var37.field1075, 37, var37.field1037, var32, var9.field2710);
                                                            }
                                                        }
                                                    }
                                                    class169 var10000 = (class169) null;
                                                    if (class169.method1109(method683(var9))) {
                                                        method90(class148.field2217, class2.method3034(16748608) + var37.field1075, 38, var37.field1037, var32, var9.field2710);
                                                    }
                                                    int var47 = method683(var9);
                                                    boolean var48 = (var47 >> 30 & 0x1) != 0;
                                                    if (var48 && var42 != null) {
                                                        for (int var49 = 2; var49 >= 0; var49--) {
                                                            if (var42[var49] != null) {
                                                                byte var50 = 0;
                                                                if (var49 == 0) {
                                                                    var50 = 33;
                                                                }
                                                                if (var49 == 1) {
                                                                    var50 = 34;
                                                                }
                                                                if (var49 == 2) {
                                                                    var50 = 35;
                                                                }
                                                                method90(var42[var49], class2.method3034(16748608) + var37.field1075, var50, var37.field1037, var32, var9.field2710);
                                                            }
                                                        }
                                                    }
                                                    String[] var51 = var9.field2631;
                                                    if (field434) {
                                                        var51 = method2040(var51);
                                                    }
                                                    if (var51 != null) {
                                                        for (int var52 = 4; var52 >= 0; var52--) {
                                                            if (var51[var52] != null) {
                                                                byte var53 = 0;
                                                                if (var52 == 0) {
                                                                    var53 = 39;
                                                                }
                                                                if (var52 == 1) {
                                                                    var53 = 40;
                                                                }
                                                                if (var52 == 2) {
                                                                    var53 = 41;
                                                                }
                                                                if (var52 == 3) {
                                                                    var53 = 42;
                                                                }
                                                                if (var52 == 4) {
                                                                    var53 = 43;
                                                                }
                                                                method90(var51[var52], class2.method3034(16748608) + var37.field1075, var53, var37.field1037, var32, var9.field2710);
                                                            }
                                                        }
                                                    }
                                                    method90(class148.field2349, class2.method3034(16748608) + var37.field1075, 1005, var37.field1037, var32, var9.field2710);
                                                }
                                            }
                                        }
                                        var32++;
                                    }
                                }
                            }
                            if (var9.field2657) {
                                if (!field418) {
                                    for (int var54 = 9; var54 >= 5; var54--) {
                                        String var55 = method39(var9, var54);
                                        if (var55 != null) {
                                            method90(var55, var9.field2678, 1007, var54 + 1, var9.field2640, var9.field2710);
                                        }
                                    }
                                    int var56 = method683(var9);
                                    int var57 = var56 >> 11 & 0x3F;
                                    String var58;
                                    if (var57 == 0) {
                                        var58 = null;
                                    } else if (var9.field2716 == null || var9.field2716.trim().length() == 0) {
                                        var58 = null;
                                    } else {
                                        var58 = var9.field2716;
                                    }
                                    if (var58 != null) {
                                        method90(var58, var9.field2678, 25, 0, var9.field2640, var9.field2710);
                                    }
                                    for (int var60 = 4; var60 >= 0; var60--) {
                                        String var61 = method39(var9, var60);
                                        if (var61 != null) {
                                            method90(var61, var9.field2678, 57, var60 + 1, var9.field2640, var9.field2710);
                                        }
                                    }
                                    if (class169.method2869(method683(var9))) {
                                        method90(class148.field2203, "", 30, 0, var9.field2640, var9.field2710);
                                    }
                                } else if (class169.method1147(method683(var9)) && (Statics.field138 & 0x20) == 32) {
                                    method90(field421, field389 + " " + class2.field23 + " " + var9.field2678, 58, 0, var9.field2640, var9.field2710);
                                }
                            }
                        }
                        if (var9.field2756 == 0) {
                            if (!var9.field2657 && method1949(var9) && Statics.field552 != var9) {
                                continue;
                            }
                            method30(arg0, var9.field2710, var12, var13, var14, var15, var10 - var9.field2660, var11 - var9.field2661);
                            if (var9.field2761 != null) {
                                method30(var9.field2761, var9.field2710, var12, var13, var14, var15, var10 - var9.field2660, var11 - var9.field2661);
                            }
                            class4 var62 = (class4) field424.method3435((long) var9.field2710);
                            if (var62 != null) {
                                if (var62.field55 == 0 && class132.field2041 >= var12 && class132.field2050 >= var13 && class132.field2041 < var14 && class132.field2050 < var15 && !field404 && !field433) {
                                    field410[0] = class148.field2427;
                                    field411[0] = "";
                                    field392[0] = 1006;
                                    field405 = 1;
                                }
                                method1952(var62.field62, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2657) {
                            if (var9.field2770 && class132.field2041 >= var12 && class132.field2050 >= var13 && class132.field2041 < var14 && class132.field2050 < var15) {
                                for (class1 var63 = (class1) field258.method3499(); var63 != null; var63 = (class1) field258.method3482()) {
                                    if (var63.field2) {
                                        var63.method3564();
                                        var63.field10.field2653 = false;
                                    }
                                }
                                if (Statics.field3062 == 0) {
                                    field436 = null;
                                    field437 = null;
                                }
                                if (!field404) {
                                    field410[0] = class148.field2427;
                                    field411[0] = "";
                                    field392[0] = 1006;
                                    field405 = 1;
                                }
                            }
                            boolean var64;
                            if (class132.field2041 >= var12 && class132.field2050 >= var13 && class132.field2041 < var14 && class132.field2050 < var15) {
                                var64 = true;
                            } else {
                                var64 = false;
                            }
                            boolean var65 = false;
                            if ((class132.field2040 == 1 || !Statics.field1276 && class132.field2040 == 4) && var64) {
                                var65 = true;
                            }
                            boolean var66 = false;
                            if ((class132.field2047 == 1 || !Statics.field1276 && class132.field2047 == 4) && class132.field2049 >= var12 && class132.field2055 >= var13 && class132.field2049 < var14 && class132.field2055 < var15) {
                                var66 = true;
                            }
                            if (var66) {
                                method2689(var9, class132.field2049 - var10, class132.field2055 - var11);
                            }
                            if (field436 != null && field436 != var9 && var64 && class169.method1951(method683(var9))) {
                                field440 = var9;
                            }
                            if (field437 == var9) {
                                field441 = true;
                                field538 = var10;
                                field491 = var11;
                            }
                            if (var9.field2713) {
                                if (var64 && field463 != 0 && var9.field2738 != null) {
                                    class1 var67 = new class1();
                                    var67.field2 = true;
                                    var67.field10 = var9;
                                    var67.field5 = field463;
                                    var67.field8 = var9.field2738;
                                    field258.method3470(var67);
                                }
                                if (field436 != null || Statics.field1014 != null || field404) {
                                    var66 = false;
                                    var65 = false;
                                    var64 = false;
                                }
                                if (!var9.field2670 && var66) {
                                    var9.field2670 = true;
                                    if (var9.field2719 != null) {
                                        class1 var68 = new class1();
                                        var68.field2 = true;
                                        var68.field10 = var9;
                                        var68.field4 = class132.field2049 - var10;
                                        var68.field5 = class132.field2055 - var11;
                                        var68.field8 = var9.field2719;
                                        field258.method3470(var68);
                                    }
                                }
                                if (var9.field2670 && var65 && var9.field2730 != null) {
                                    class1 var69 = new class1();
                                    var69.field2 = true;
                                    var69.field10 = var9;
                                    var69.field4 = class132.field2041 - var10;
                                    var69.field5 = class132.field2050 - var11;
                                    var69.field8 = var9.field2730;
                                    field258.method3470(var69);
                                }
                                if (var9.field2670 && !var65) {
                                    var9.field2670 = false;
                                    if (var9.field2721 != null) {
                                        class1 var70 = new class1();
                                        var70.field2 = true;
                                        var70.field10 = var9;
                                        var70.field4 = class132.field2041 - var10;
                                        var70.field5 = class132.field2050 - var11;
                                        var70.field8 = var9.field2721;
                                        field466.method3470(var70);
                                    }
                                }
                                if (var65 && var9.field2722 != null) {
                                    class1 var71 = new class1();
                                    var71.field2 = true;
                                    var71.field10 = var9;
                                    var71.field4 = class132.field2041 - var10;
                                    var71.field5 = class132.field2050 - var11;
                                    var71.field8 = var9.field2722;
                                    field258.method3470(var71);
                                }
                                if (!var9.field2653 && var64) {
                                    var9.field2653 = true;
                                    if (var9.field2692 != null) {
                                        class1 var72 = new class1();
                                        var72.field2 = true;
                                        var72.field10 = var9;
                                        var72.field4 = class132.field2041 - var10;
                                        var72.field5 = class132.field2050 - var11;
                                        var72.field8 = var9.field2692;
                                        field258.method3470(var72);
                                    }
                                }
                                if (var9.field2653 && var64 && var9.field2724 != null) {
                                    class1 var73 = new class1();
                                    var73.field2 = true;
                                    var73.field10 = var9;
                                    var73.field4 = class132.field2041 - var10;
                                    var73.field5 = class132.field2050 - var11;
                                    var73.field8 = var9.field2724;
                                    field258.method3470(var73);
                                }
                                if (var9.field2653 && !var64) {
                                    var9.field2653 = false;
                                    if (var9.field2725 != null) {
                                        class1 var74 = new class1();
                                        var74.field2 = true;
                                        var74.field10 = var9;
                                        var74.field4 = class132.field2041 - var10;
                                        var74.field5 = class132.field2050 - var11;
                                        var74.field8 = var9.field2725;
                                        field466.method3470(var74);
                                    }
                                }
                                if (var9.field2736 != null) {
                                    class1 var75 = new class1();
                                    var75.field10 = var9;
                                    var75.field8 = var9.field2736;
                                    field465.method3470(var75);
                                }
                                if (var9.field2688 != null && field295 > var9.field2765) {
                                    if (var9.field2731 == null || field295 - var9.field2765 > 32) {
                                        class1 var80 = new class1();
                                        var80.field10 = var9;
                                        var80.field8 = var9.field2688;
                                        field258.method3470(var80);
                                    } else {
                                        label710: for (int var76 = var9.field2765; var76 < field295; var76++) {
                                            int var77 = field257[var76 & 0x1F];
                                            for (int var78 = 0; var78 < var9.field2731.length; var78++) {
                                                if (var9.field2731[var78] == var77) {
                                                    class1 var79 = new class1();
                                                    var79.field10 = var9;
                                                    var79.field8 = var9.field2688;
                                                    field258.method3470(var79);
                                                    break label710;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2765 = field295;
                                }
                                if (var9.field2732 != null && field321 > var9.field2740) {
                                    if (var9.field2629 == null || field321 - var9.field2740 > 32) {
                                        class1 var85 = new class1();
                                        var85.field10 = var9;
                                        var85.field8 = var9.field2732;
                                        field258.method3470(var85);
                                    } else {
                                        label686: for (int var81 = var9.field2740; var81 < field321; var81++) {
                                            int var82 = field435[var81 & 0x1F];
                                            for (int var83 = 0; var83 < var9.field2629.length; var83++) {
                                                if (var9.field2629[var83] == var82) {
                                                    class1 var84 = new class1();
                                                    var84.field10 = var9;
                                                    var84.field8 = var9.field2732;
                                                    field258.method3470(var84);
                                                    break label686;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2740 = field321;
                                }
                                if (var9.field2763 != null && field454 > var9.field2767) {
                                    if (var9.field2735 == null || field454 - var9.field2767 > 32) {
                                        class1 var90 = new class1();
                                        var90.field10 = var9;
                                        var90.field8 = var9.field2763;
                                        field258.method3470(var90);
                                    } else {
                                        label662: for (int var86 = var9.field2767; var86 < field454; var86++) {
                                            int var87 = field453[var86 & 0x1F];
                                            for (int var88 = 0; var88 < var9.field2735.length; var88++) {
                                                if (var9.field2735[var88] == var87) {
                                                    class1 var89 = new class1();
                                                    var89.field10 = var9;
                                                    var89.field8 = var9.field2763;
                                                    field258.method3470(var89);
                                                    break label662;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2767 = field454;
                                }
                                if (field278 > var9.field2762 && var9.field2739 != null) {
                                    class1 var91 = new class1();
                                    var91.field10 = var9;
                                    var91.field8 = var9.field2739;
                                    field258.method3470(var91);
                                }
                                if (field472 > var9.field2762 && var9.field2741 != null) {
                                    class1 var92 = new class1();
                                    var92.field10 = var9;
                                    var92.field8 = var9.field2741;
                                    field258.method3470(var92);
                                }
                                if (field366 > var9.field2762 && var9.field2637 != null) {
                                    class1 var93 = new class1();
                                    var93.field10 = var9;
                                    var93.field8 = var9.field2637;
                                    field258.method3470(var93);
                                }
                                if (field446 > var9.field2762 && var9.field2733 != null) {
                                    class1 var94 = new class1();
                                    var94.field10 = var9;
                                    var94.field8 = var9.field2733;
                                    field258.method3470(var94);
                                }
                                if (field459 > var9.field2762 && var9.field2702 != null) {
                                    class1 var95 = new class1();
                                    var95.field10 = var9;
                                    var95.field8 = var9.field2702;
                                    field258.method3470(var95);
                                }
                                if (field460 > var9.field2762 && var9.field2723 != null) {
                                    class1 var96 = new class1();
                                    var96.field10 = var9;
                                    var96.field8 = var9.field2723;
                                    field258.method3470(var96);
                                }
                                var9.field2762 = field448;
                                if (var9.field2646 != null) {
                                    for (int var97 = 0; var97 < field326; var97++) {
                                        class1 var98 = new class1();
                                        var98.field10 = var9;
                                        var98.field3 = field490[var97];
                                        var98.field9 = field541[var97];
                                        var98.field8 = var9.field2646;
                                        field258.method3470(var98);
                                    }
                                }
                            }
                        }
                        if (!var9.field2657 && field436 == null && Statics.field1014 == null && !field404) {
                            if ((var9.field2752 >= 0 || var9.field2666 != 0) && class132.field2041 >= var12 && class132.field2050 >= var13 && class132.field2041 < var14 && class132.field2050 < var15) {
                                if (var9.field2752 >= 0) {
                                    Statics.field552 = arg0[var9.field2752];
                                } else {
                                    Statics.field552 = var9;
                                }
                            }
                            if (var9.field2756 == 8 && class132.field2041 >= var12 && class132.field2050 >= var13 && class132.field2041 < var14 && class132.field2050 < var15) {
                                Statics.field142 = var9;
                            }
                            if (var9.field2663 > var9.field2655) {
                                int var99 = var9.field2654 + var10;
                                int var100 = var9.field2655;
                                int var101 = var9.field2663;
                                int var102 = class132.field2041;
                                int var103 = class132.field2050;
                                if (field324) {
                                    field376 = 32;
                                } else {
                                    field376 = 0;
                                }
                                field324 = false;
                                if (class132.field2040 == 1 || !Statics.field1276 && class132.field2040 == 4) {
                                    if (var102 >= var99 && var102 < var99 + 16 && var103 >= var11 && var103 < var11 + 16) {
                                        var9.field2661 -= 4;
                                        method33(var9);
                                    } else if (var102 >= var99 && var102 < var99 + 16 && var103 >= var11 + var100 - 16 && var103 < var11 + var100) {
                                        var9.field2661 += 4;
                                        method33(var9);
                                    } else if (var102 >= var99 - field376 && var102 < field376 + var99 + 16 && var103 >= var11 + 16 && var103 < var11 + var100 - 16) {
                                        int var104 = (var100 - 32) * var100 / var101;
                                        if (var104 < 8) {
                                            var104 = 8;
                                        }
                                        int var105 = var103 - var11 - 16 - var104 / 2;
                                        int var106 = var100 - 32 - var104;
                                        var9.field2661 = (var101 - var100) * var105 / var106;
                                        method33(var9);
                                        field324 = true;
                                    }
                                }
                                if (field463 != 0) {
                                    int var107 = var9.field2654;
                                    if (var102 >= var99 - var107 && var103 >= var11 && var102 < var99 + 16 && var103 <= var11 + var100) {
                                        var9.field2661 += field463 * 45;
                                        method33(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cz.dp(III)V")
    public static final void method1955(int arg0, int arg1) {
        if (class164.method817(arg0)) {
            method536(Statics.field2743[arg0], arg1);
        }
    }

    @ObfuscatedName("w.dm([Lfu;II)V")
    public static final void method536(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2756 == 0) {
                    if (var3.field2761 != null) {
                        method536(var3.field2761, arg1);
                    }
                    class4 var4 = (class4) field424.method3435((long) var3.field2710);
                    if (var4 != null) {
                        method1955(var4.field62, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2744 != null) {
                    class1 var5 = new class1();
                    var5.field10 = var3;
                    var5.field8 = var3.field2744;
                    class34.method74(var5);
                }
                if (arg1 == 1 && var3.field2745 != null) {
                    if (var3.field2640 >= 0) {
                        class164 var6 = class164.method2499(var3.field2710);
                        if (var6 == null || var6.field2761 == null || var3.field2640 >= var6.field2761.length || var6.field2761[var3.field2640] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field10 = var3;
                    var7.field8 = var3.field2745;
                    class34.method74(var7);
                }
            }
        }
    }

    @ObfuscatedName("eo.do(Lfu;III)V")
    public static final void method2689(class164 arg0, int arg1, int arg2) {
        if (field436 != null || field404 || arg0 == null) {
            return;
        }
        class164 var3 = method31(arg0);
        if (var3 == null) {
            var3 = arg0.field2712;
        }
        if (var3 == null) {
            return;
        }
        field436 = arg0;
        class164 var5 = arg0;
        int var6 = method683(arg0);
        int var7 = var6 >> 17 & 0x7;
        int var8 = var7;
        class164 var9;
        if (var7 == 0) {
            var9 = null;
        } else {
            int var10 = 0;
            while (true) {
                if (var10 >= var8) {
                    var9 = var5;
                    break;
                }
                var5 = class164.method2499(var5.field2658);
                if (var5 == null) {
                    var9 = null;
                    break;
                }
                var10++;
            }
        }
        class164 var11 = var9;
        if (var9 == null) {
            var11 = arg0.field2712;
        }
        field437 = var11;
        field512 = arg1;
        field266 = arg2;
        Statics.field3062 = 0;
        field514 = false;
        if (field405 > 0) {
            int var13 = field405 - 1;
            Statics.field710 = new class29();
            Statics.field710.field665 = field262[var13];
            Statics.field710.field664 = field511[var13];
            Statics.field710.field667 = field392[var13];
            Statics.field710.field666 = field409[var13];
            Statics.field710.field669 = field410[var13];
        }
        return;
    }

    @ObfuscatedName("u.ds(Lfu;I)V")
    public static void method33(class164 arg0) {
        if (field469 == arg0.field2748) {
            field486[arg0.field2768] = true;
        }
    }

    @ObfuscatedName("hu.db(I)V")
    public static void method3617() {
        for (class4 var0 = (class4) field424.method3438(); var0 != null; var0 = (class4) field424.method3439()) {
            int var1 = var0.field62;
            if (class164.method817(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2743[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2657;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3015;
                    class164 var6 = class164.method2499(var5);
                    if (var6 != null) {
                        method33(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.dk([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2040(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("as.di(IS)V")
    public static final void method918(int arg0) {
        if (!class164.method817(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2743[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2759 = 0;
                var3.field2760 = 0;
            }
        }
    }

    @ObfuscatedName("dr.dq([Lfu;IS)V")
    public static final void method2519(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2658 == arg1 && (!var3.field2657 || !method1949(var3))) {
                if (var3.field2756 == 0) {
                    if (!var3.field2657 && method1949(var3) && Statics.field552 != var3) {
                        continue;
                    }
                    method2519(arg0, var3.field2710);
                    if (var3.field2761 != null) {
                        method2519(var3.field2761, var3.field2710);
                    }
                    class4 var4 = (class4) field424.method3435((long) var3.field2710);
                    if (var4 != null) {
                        int var5 = var4.field62;
                        if (class164.method817(var5)) {
                            method2519(Statics.field2743[var5], -1);
                        }
                    }
                }
                if (var3.field2756 == 6) {
                    if (var3.field2684 != -1 || var3.field2685 != -1) {
                        boolean var6 = Statics.method2652(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2685;
                        } else {
                            var7 = var3.field2684;
                        }
                        if (var7 != -1) {
                            class40 var8 = class40.method567(var7);
                            var3.field2760 += field422;
                            while (var3.field2760 > var8.field929[var3.field2759]) {
                                var3.field2760 -= var8.field929[var3.field2759];
                                var3.field2759++;
                                if (var3.field2759 >= var8.field927.length) {
                                    var3.field2759 -= var8.field924;
                                    if (var3.field2759 < 0 || var3.field2759 >= var8.field927.length) {
                                        var3.field2759 = 0;
                                    }
                                }
                                method33(var3);
                            }
                        }
                    }
                    if (var3.field2642 != 0 && !var3.field2657) {
                        int var9 = var3.field2642 >> 16;
                        int var10 = var3.field2642 << 16 >> 16;
                        int var11 = field422 * var9;
                        int var12 = field422 * var10;
                        var3.field2680 = var3.field2680 + var11 & 0x7FF;
                        var3.field2689 = var3.field2689 + var12 & 0x7FF;
                        method33(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fd.da(IB)V")
    public static final void method3038(int arg0) {
        method3617();
        for (class22 var1 = (class22) class22.field583.method3499(); var1 != null; var1 = (class22) class22.field583.method3482()) {
            if (var1.field591 != null) {
                var1.method551();
            }
        }
        int var2 = class48.method2695(arg0).field1084;
        if (var2 == 0) {
            return;
        }
        int var3 = class167.field2791[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class86.method1854(0.9D);
                ((class90) Statics.field1498).method1938(0.9D);
            }
            if (var3 == 2) {
                class86.method1854(0.8D);
                ((class90) Statics.field1498).method1938(0.8D);
            }
            if (var3 == 3) {
                class86.method1854(0.7D);
                ((class90) Statics.field1498).method1938(0.7D);
            }
            if (var3 == 4) {
                class86.method1854(0.6D);
                ((class90) Statics.field1498).method1938(0.6D);
            }
            class47.field1035.method3404();
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
            if (field487 != var4) {
                if (field487 == 0 && field503 != -1) {
                    Statics.method3179(Statics.field1311, field503, 0, var4, false);
                    field504 = false;
                } else if (var4 == 0) {
                    Statics.field2842.method3277();
                    class174.field2843 = 1;
                    Statics.field2844 = null;
                    field504 = false;
                } else if (class174.field2843 == 0) {
                    Statics.field2842.method3306(var4);
                } else {
                    Statics.field2793 = var4;
                }
                field487 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field505 = 127;
            }
            if (var3 == 1) {
                field505 = 96;
            }
            if (var3 == 2) {
                field505 = 64;
            }
            if (var3 == 3) {
                field505 = 32;
            }
            if (var3 == 4) {
                field505 = 0;
            }
        }
        if (var2 == 5) {
            field403 = var3;
        }
        if (var2 == 6) {
            field425 = var3;
        }
        if (var2 == 9) {
            field500 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field292 = 127;
            }
            if (var3 == 1) {
                field292 = 96;
            }
            if (var3 == 2) {
                field292 = 64;
            }
            if (var3 == 3) {
                field292 = 32;
            }
            if (var3 == 4) {
                field292 = 0;
            }
        }
        if (var2 == 17) {
            field431 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field287 = (class19) class101.method1845(class19.method976(), var3);
            if (field287 == null) {
                field287 = class19.field545;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field406 = -1;
        } else {
            field406 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("cc.dz(Lfu;I)V")
    public static final void method2027(class164 arg0) {
        int var1 = arg0.field2717;
        if (var1 == 324) {
            if (field450 == -1) {
                field450 = arg0.field2676;
                field449 = arg0.field2673;
            }
            if (field360.field2802) {
                arg0.field2676 = field450;
            } else {
                arg0.field2676 = field449;
            }
        } else if (var1 == 325) {
            if (field450 == -1) {
                field450 = arg0.field2676;
                field449 = arg0.field2673;
            }
            if (field360.field2802) {
                arg0.field2676 = field449;
            } else {
                arg0.field2676 = field450;
            }
        } else if (var1 == 327) {
            arg0.field2680 = 150;
            arg0.field2689 = (int) (Math.sin((double) field270 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2747 = 5;
            arg0.field2681 = 0;
        } else if (var1 == 328) {
            arg0.field2680 = 150;
            arg0.field2689 = (int) (Math.sin((double) field270 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2747 = 5;
            arg0.field2681 = 1;
        }
    }

    @ObfuscatedName("ap.dr(I)V")
    public static final void method740() {
        field302.method2477(144);
        for (class4 var0 = (class4) field424.method3438(); var0 != null; var0 = (class4) field424.method3439()) {
            if (var0.field55 == 0 || var0.field55 == 3) {
                method2033(var0, true);
            }
        }
        if (field540 != null) {
            method33(field540);
            field540 = null;
        }
    }

    @ObfuscatedName("cx.df(IIII)Lu;")
    public static final class4 method2029(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field62 = arg1;
        var3.field55 = arg2;
        field424.method3436(var3, (long) arg0);
        method918(arg1);
        class164 var4 = class164.method2499(arg0);
        method33(var4);
        if (field540 != null) {
            method33(field540);
            field540 = null;
        }
        method111();
        method693(Statics.field2743[arg0 >> 16], var4, false);
        class34.method533(arg1);
        if (field423 != -1) {
            method1955(field423, 1);
        }
        return var3;
    }

    @ObfuscatedName("cx.dx(Lu;ZI)V")
    public static final void method2033(class4 arg0, boolean arg1) {
        int var2 = arg0.field62;
        int var3 = (int) arg0.field3015;
        arg0.method3564();
        if (arg1) {
            class164.method720(var2);
        }
        for (class192 var4 = (class192) field467.method3438(); var4 != null; var4 = (class192) field467.method3439()) {
            if ((long) var2 == (var4.field3015 >> 48 & 0xFFFFL)) {
                var4.method3564();
            }
        }
        class164 var5 = class164.method2499(var3);
        if (var5 != null) {
            method33(var5);
        }
        method111();
        if (field423 != -1) {
            method1955(field423, 1);
        }
    }

    @ObfuscatedName("ei.dj(Lfu;B)Z")
    public static final boolean method2845(class164 arg0) {
        int var1 = arg0.field2717;
        if (var1 == 205) {
            field524 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field360.method3148(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field360.method3150(var4, var5 == 1);
        }
        if (var1 == 324) {
            field360.method3167(false);
        }
        if (var1 == 325) {
            field360.method3167(true);
        }
        if (var1 == 326) {
            field302.method2477(241);
            field360.method3166(field302);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cb.dg(Lfu;IIII)V")
    public static final void method2128(class164 arg0, int arg1, int arg2, int arg3) {
        class166 var4 = arg0.method3073();
        if (var4 == null) {
            return;
        }
        if (field501 < 3) {
            Statics.field1375.method1483(arg1, arg2, var4.field2783, var4.field2782, 25, 25, field346, 256, var4.field2777, var4.field2778);
        } else {
            class75.method1587(arg1, arg2, 0, var4.field2777, var4.field2778);
        }
    }

    @ObfuscatedName("ay.dv(IIIILbc;Lfv;B)V")
    public static final void method625(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method894(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field346 + field269 & 0x7FF;
        int var8 = class86.field1501[var7];
        int var9 = class86.field1478[var7];
        int var10 = var8 * 256 / (field429 + 256);
        int var11 = var9 * 256 / (field429 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field337.method1496(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("al.de(IIIILbc;Lfv;I)V")
    public static final void method894(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field346 + field269 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class86.field1501[var6];
        int var9 = class86.field1478[var6];
        int var10 = var8 * 256 / (field429 + 256);
        int var11 = var9 * 256 / (field429 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1561(arg5.field2783 / 2 + var12 - arg4.field1329 / 2, arg5.field2782 / 2 - var13 - arg4.field1324 / 2, arg0, arg1, arg5.field2783, arg5.field2782, arg5.field2777, arg5.field2778);
        } else {
            arg4.method1489(arg5.field2783 / 2 + arg0 + var12 - arg4.field1329 / 2, arg5.field2782 / 2 + arg1 - var13 - arg4.field1324 / 2);
        }
    }

    @ObfuscatedName("cw.dd(Ljava/lang/String;ZB)Z")
    public static boolean method1662(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method2880(arg0, Statics.field261);
        for (int var3 = 0; var3 < field532; var3++) {
            if (var2.equalsIgnoreCase(class155.method2880(field534[var3].field233, Statics.field261)) && (!arg1 || field534[var3].field236 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method2880(Statics.field571.field38, Statics.field261))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cp.dc(Ljava/lang/String;I)Z")
    public static boolean method2043(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method2880(arg0, Statics.field261);
        for (int var2 = 0; var2 < field536; var2++) {
            class8 var3 = field537[var2];
            if (var1.equalsIgnoreCase(class155.method2880(var3.field127, Statics.field261))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method2880(var3.field121, Statics.field261))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ci.du(Ljava/lang/String;ZI)V")
    public static final void method1950(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field536 < 100 || field442 == 1) || field536 >= 400) {
            class11.method626(31, "", class148.field2366);
            return;
        }
        String var2 = class155.method2880(arg0, Statics.field261);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field536; var3++) {
            class8 var4 = field537[var3];
            String var5 = class155.method2880(var4.field127, Statics.field261);
            if (var5 != null && var5.equals(var2)) {
                class11.method626(31, "", arg0 + class148.field2367);
                return;
            }
            if (var4.field121 != null) {
                String var6 = class155.method2880(var4.field121, Statics.field261);
                if (var6 != null && var6.equals(var2)) {
                    class11.method626(31, "", arg0 + class148.field2367);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field532; var7++) {
            class17 var8 = field534[var7];
            String var9 = class155.method2880(var8.field233, Statics.field261);
            if (var9 != null && var9.equals(var2)) {
                class11.method626(31, "", class148.field2372 + arg0 + class148.field2447);
                return;
            }
            if (var8.field231 != null) {
                String var10 = class155.method2880(var8.field231, Statics.field261);
                if (var10 != null && var10.equals(var2)) {
                    class11.method626(31, "", class148.field2372 + arg0 + class148.field2447);
                    return;
                }
            }
        }
        if (class155.method2880(Statics.field571.field38, Statics.field261).equals(var2)) {
            class11.method626(31, "", class148.field2369);
        } else {
            field302.method2477(124);
            field302.method2204(class111.method2151(arg0));
            field302.method2269(arg0);
        }
    }

    @ObfuscatedName("v.dn(Ljava/lang/String;I)V")
    public static final void method94(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method2880(arg0, Statics.field261);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field532; var2++) {
            class17 var3 = field534[var2];
            String var4 = var3.field233;
            String var5 = class155.method2880(var4, Statics.field261);
            if (class121.method17(arg0, var1, var4, var5)) {
                field532--;
                for (int var6 = var2; var6 < field532; var6++) {
                    field534[var6] = field534[var6 + 1];
                }
                field472 = field448;
                field302.method2477(151);
                field302.method2204(class111.method2151(arg0));
                field302.method2269(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("at.dw(Ljava/lang/String;I)V")
    public static final void method654(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method2880(arg0, Statics.field261);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field536; var2++) {
            class8 var3 = field537[var2];
            String var4 = var3.field127;
            String var5 = class155.method2880(var4, Statics.field261);
            if (class121.method17(arg0, var1, var4, var5)) {
                field536--;
                for (int var6 = var2; var6 < field536; var6++) {
                    field537[var6] = field537[var6 + 1];
                }
                field472 = field448;
                field302.method2477(177);
                field302.method2204(class111.method2151(arg0));
                field302.method2269(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("z.dy(Ljava/lang/String;I)V")
    public static final void method552(String arg0) {
        if (Statics.field1925 != null) {
            field302.method2477(158);
            field302.method2204(class111.method2151(arg0));
            field302.method2269(arg0);
        }
    }

    @ObfuscatedName("as.dt(Ljava/lang/String;B)V")
    public static final void method915(String arg0) {
        if (!arg0.equals("")) {
            field302.method2477(88);
            field302.method2204(class111.method2151(arg0));
            field302.method2269(arg0);
        }
    }

    @ObfuscatedName("fl.dh(I)V")
    public static final void method3133() {
        field302.method2477(88);
        field302.method2204(0);
    }

    @ObfuscatedName("aa.ep(Lfu;I)I")
    public static int method683(class164 arg0) {
        class192 var1 = (class192) field467.method3435(((long) arg0.field2710 << 32) + (long) arg0.field2640);
        return var1 == null ? arg0.field2709 : var1.field3000;
    }

    @ObfuscatedName("u.eo(Lfu;S)Lfu;")
    public static class164 method31(class164 arg0) {
        int var1 = method683(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class164.method2499(arg0.field2658);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ca.ec(Lfu;B)Z")
    public static boolean method1949(class164 arg0) {
        if (field433) {
            if (method683(arg0) != 0) {
                return false;
            }
            if (arg0.field2756 == 0) {
                return false;
            }
        }
        return arg0.field2674;
    }

    @ObfuscatedName("q.ev(Lfu;IB)Ljava/lang/String;")
    public static String method39(class164 arg0, int arg1) {
        int var2 = method683(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2737 == null) {
            return null;
        } else if (arg0.field2769 == null || arg0.field2769.length <= arg1 || arg0.field2769[arg1] == null || arg0.field2769[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2769[arg1];
        }
    }

    @ObfuscatedName("cz.ej(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1953(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field455 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field455 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field455 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field455 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field455 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field259 != null) {
            var3 = "/p=" + Statics.field259;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field264 + "/a=" + Statics.field277 + var3 + "/";
    }

    @ObfuscatedName("ed.ea(Ljava/lang/String;I)V")
    public static void method2814(String arg0) {
        Statics.field259 = arg0;
        try {
            String var1 = Statics.field254.getParameter(class181.field2960.field2959);
            String var2 = Statics.field254.getParameter(class181.field2955.field2959);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class103.method2816(class107.method2661() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class124.method2568(Statics.field254, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("fz.es(Ljava/lang/String;ZI)V")
    public static void method3270(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1475; var5++) {
            class47 var6 = class47.method2700(var5);
            if ((!arg1 || var6.field1050) && var6.field1066 == -1 && var6.field1075.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2792 = -1;
                    Statics.field49 = null;
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
        Statics.field49 = var3;
        Statics.field2535 = 0;
        Statics.field2792 = var4;
        String[] var9 = new String[Statics.field2792];
        for (int var10 = 0; var10 < Statics.field2792; var10++) {
            var9[var10] = class47.method2700(var3[var10]).field1075;
        }
        short[] var11 = Statics.field49;
        class116.method580(var9, var11, 0, var9.length - 1);
    }
}

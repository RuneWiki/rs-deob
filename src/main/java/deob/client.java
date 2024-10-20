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
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class136 {

    @ObfuscatedName("client.e")
    public static boolean field304 = true;

    @ObfuscatedName("client.f")
    public static int field256 = 1;

    @ObfuscatedName("client.w")
    public static class220[] field531 = new class220[4];

    @ObfuscatedName("client.t")
    public static int field338 = 0;

    @ObfuscatedName("client.c")
    public static int field259 = 0;

    @ObfuscatedName("client.m")
    public static boolean field262 = false;

    @ObfuscatedName("client.h")
    public static boolean field253 = false;

    @ObfuscatedName("client.n")
    public static int field264 = 0;

    @ObfuscatedName("client.g")
    public static int field460 = 0;

    @ObfuscatedName("client.l")
    public static boolean field266 = true;

    @ObfuscatedName("client.u")
    public static int field267 = 0;

    @ObfuscatedName("client.j")
    public static long field268 = 1L;

    @ObfuscatedName("client.b")
    public static int field269 = -1;

    @ObfuscatedName("client.a")
    public static int field270 = -1;

    @ObfuscatedName("client.ag")
    public static int field386 = -1;

    @ObfuscatedName("client.am")
    public static boolean field272 = true;

    @ObfuscatedName("client.aa")
    public static boolean field273 = false;

    @ObfuscatedName("client.az")
    public static int field274 = 0;

    @ObfuscatedName("client.aq")
    public static int field275 = 0;

    @ObfuscatedName("client.ak")
    public static int field276 = 0;

    @ObfuscatedName("client.ar")
    public static int field277 = 0;

    @ObfuscatedName("client.al")
    public static int field346 = 0;

    @ObfuscatedName("client.au")
    public static int field279 = 0;

    @ObfuscatedName("client.ao")
    public static int field328 = 0;

    @ObfuscatedName("client.af")
    public static int field471 = 0;

    @ObfuscatedName("client.ai")
    public static int field282 = 0;

    @ObfuscatedName("client.aj")
    public static class111 field283 = new class111(new byte[5000]);

    @ObfuscatedName("client.ad")
    public static class19 field285 = class19.field550;

    @ObfuscatedName("client.ay")
    public static int field265 = 0;

    @ObfuscatedName("client.ah")
    public static int field287 = 0;

    @ObfuscatedName("client.at")
    public static int field445 = 0;

    @ObfuscatedName("client.bs")
    public static int field391 = 0;

    @ObfuscatedName("client.bi")
    public static int field333 = 0;

    @ObfuscatedName("client.bd")
    public static int field292 = 0;

    @ObfuscatedName("client.bl")
    public static int field293 = 0;

    @ObfuscatedName("client.be")
    public static int field296 = 0;

    @ObfuscatedName("client.cu")
    public static class32[] field535 = new class32[32768];

    @ObfuscatedName("client.cl")
    public static int field298 = 0;

    @ObfuscatedName("client.co")
    public static int[] field278 = new int[32768];

    @ObfuscatedName("client.cc")
    public static class114 field452 = new class114(5000);

    @ObfuscatedName("client.cy")
    public static class114 field301 = new class114(5000);

    @ObfuscatedName("client.cd")
    public static class114 field302 = new class114(5000);

    @ObfuscatedName("client.cf")
    public static int field483 = 0;

    @ObfuscatedName("client.cs")
    public static int field539 = 0;

    @ObfuscatedName("client.cg")
    public static int field305 = 0;

    @ObfuscatedName("client.ce")
    public static int field306 = 0;

    @ObfuscatedName("client.cq")
    public static int field470 = 0;

    @ObfuscatedName("client.cx")
    public static int field308 = 0;

    @ObfuscatedName("client.cv")
    public static int field309 = 0;

    @ObfuscatedName("client.ch")
    public static int field310 = 0;

    @ObfuscatedName("client.cb")
    public static boolean field311 = false;

    @ObfuscatedName("client.dy")
    public static int field313 = 0;

    @ObfuscatedName("client.du")
    public static int field444 = 0;

    @ObfuscatedName("client.dw")
    public static int field315 = 1;

    @ObfuscatedName("client.dp")
    public static int field316 = 0;

    @ObfuscatedName("client.de")
    public static int field321 = 1;

    @ObfuscatedName("client.df")
    public static int field396 = 0;

    @ObfuscatedName("client.dg")
    public static boolean field378 = false;

    @ObfuscatedName("client.dl")
    public static int[][][] field303 = new int[4][13][13];

    @ObfuscatedName("client.dt")
    public static final int[] field473 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.db")
    public static int field323 = 0;

    @ObfuscatedName("client.da")
    public static int field258 = 2;

    @ObfuscatedName("client.dx")
    public static int field255 = 0;

    @ObfuscatedName("client.dd")
    public static int field326 = 2;

    @ObfuscatedName("client.di")
    public static int field327 = 0;

    @ObfuscatedName("client.dc")
    public static int field314 = 1;

    @ObfuscatedName("client.eg")
    public static int field400 = 0;

    @ObfuscatedName("client.ef")
    public static int field500 = 0;

    @ObfuscatedName("client.ej")
    public static int field331 = 2;

    @ObfuscatedName("client.ee")
    public static int field332 = 0;

    @ObfuscatedName("client.ep")
    public static int field368 = 1;

    @ObfuscatedName("client.es")
    public static int field334 = 0;

    @ObfuscatedName("client.eq")
    public static int field335 = 0;

    @ObfuscatedName("client.eh")
    public static int field521 = 2301979;

    @ObfuscatedName("client.ea")
    public static int field337 = 5063219;

    @ObfuscatedName("client.ew")
    public static int field434 = 3353893;

    @ObfuscatedName("client.ez")
    public static int field339 = 7759444;

    @ObfuscatedName("client.ex")
    public static boolean field340 = false;

    @ObfuscatedName("client.eu")
    public static int field341 = 0;

    @ObfuscatedName("client.fa")
    public static int field319 = 128;

    @ObfuscatedName("client.fr")
    public static int field343 = 0;

    @ObfuscatedName("client.fh")
    public static int field344 = 0;

    @ObfuscatedName("client.fk")
    public static int field345 = 0;

    @ObfuscatedName("client.fb")
    public static int field467 = 0;

    @ObfuscatedName("client.fw")
    public static int field448 = 0;

    @ObfuscatedName("client.fg")
    public static int field348 = 0;

    @ObfuscatedName("client.fl")
    public static boolean field349 = false;

    @ObfuscatedName("client.fp")
    public static int field514 = 0;

    @ObfuscatedName("client.fy")
    public static int field351 = 0;

    @ObfuscatedName("client.fs")
    public static int field352 = 50;

    @ObfuscatedName("client.fm")
    public static int[] field353 = new int[field352];

    @ObfuscatedName("client.fe")
    public static int[] field354 = new int[field352];

    @ObfuscatedName("client.fz")
    public static int[] field355 = new int[field352];

    @ObfuscatedName("client.fq")
    public static int[] field437 = new int[field352];

    @ObfuscatedName("client.fx")
    public static int[] field356 = new int[field352];

    @ObfuscatedName("client.fd")
    public static int[] field358 = new int[field352];

    @ObfuscatedName("client.fo")
    public static int[] field520 = new int[field352];

    @ObfuscatedName("client.fi")
    public static String[] field299 = new String[field352];

    @ObfuscatedName("client.gr")
    public static int[][] field361 = new int[104][104];

    @ObfuscatedName("client.gu")
    public static int field362 = 0;

    @ObfuscatedName("client.gs")
    public static int field363 = -1;

    @ObfuscatedName("client.gg")
    public static int field364 = -1;

    @ObfuscatedName("client.gf")
    public static int field365 = 0;

    @ObfuscatedName("client.gy")
    public static int field366 = 0;

    @ObfuscatedName("client.gx")
    public static int field367 = 0;

    @ObfuscatedName("client.go")
    public static int field324 = 0;

    @ObfuscatedName("client.gm")
    public static int field263 = 0;

    @ObfuscatedName("client.gj")
    public static int field370 = 0;

    @ObfuscatedName("client.gn")
    public static int field371 = 0;

    @ObfuscatedName("client.gh")
    public static int field372 = 0;

    @ObfuscatedName("client.gv")
    public static int field373 = 0;

    @ObfuscatedName("client.gl")
    public static int field374 = 0;

    @ObfuscatedName("client.gt")
    public static boolean field375 = false;

    @ObfuscatedName("client.ga")
    public static int field376 = 0;

    @ObfuscatedName("client.gz")
    public static int field377 = 0;

    @ObfuscatedName("client.ge")
    public static class3[] field479 = new class3[2048];

    @ObfuscatedName("client.gc")
    public static int field289 = 0;

    @ObfuscatedName("client.gd")
    public static int[] field286 = new int[2048];

    @ObfuscatedName("client.gi")
    public static int field381 = 0;

    @ObfuscatedName("client.hj")
    public static int[] field431 = new int[2048];

    @ObfuscatedName("client.he")
    public static class111[] field383 = new class111[2048];

    @ObfuscatedName("client.hc")
    public static int field384 = -1;

    @ObfuscatedName("client.ha")
    public static int field385 = 0;

    @ObfuscatedName("client.hp")
    public static int field360 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field387 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field291 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ho")
    public static String[] field389 = new String[8];

    @ObfuscatedName("client.hl")
    public static boolean[] field390 = new boolean[8];

    @ObfuscatedName("client.hz")
    public static int[] field347 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hh")
    public static int field392 = -1;

    @ObfuscatedName("client.hv")
    public static class190[][][] field357 = new class190[4][104][104];

    @ObfuscatedName("client.hx")
    public static class190 field493 = new class190();

    @ObfuscatedName("client.hs")
    public static class190 field395 = new class190();

    @ObfuscatedName("client.hy")
    public static class190 field294 = new class190();

    @ObfuscatedName("client.hn")
    public static int[] field397 = new int[25];

    @ObfuscatedName("client.hm")
    public static int[] field398 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field379 = new int[25];

    @ObfuscatedName("client.ht")
    public static int field458 = 0;

    @ObfuscatedName("client.hg")
    public static boolean field533 = false;

    @ObfuscatedName("client.ie")
    public static int field402 = 0;

    @ObfuscatedName("client.ir")
    public static int[] field394 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field404 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field405 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field406 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field407 = new String[500];

    @ObfuscatedName("client.iu")
    public static String[] field408 = new String[500];

    @ObfuscatedName("client.ip")
    public static int field409 = -1;

    @ObfuscatedName("client.ig")
    public static int field410 = -1;

    @ObfuscatedName("client.ij")
    public static int field411 = 0;

    @ObfuscatedName("client.id")
    public static int field412 = 50;

    @ObfuscatedName("client.iw")
    public static int field413 = 0;

    @ObfuscatedName("client.it")
    public static String field414 = null;

    @ObfuscatedName("client.iv")
    public static boolean field415 = false;

    @ObfuscatedName("client.io")
    public static int field416 = -1;

    @ObfuscatedName("client.ic")
    public static int field417 = -1;

    @ObfuscatedName("client.jn")
    public static String field524 = null;

    @ObfuscatedName("client.jp")
    public static String field419 = null;

    @ObfuscatedName("client.jf")
    public static int field420 = -1;

    @ObfuscatedName("client.ja")
    public static class187 field421 = new class187(8);

    @ObfuscatedName("client.je")
    public static int field429 = 0;

    @ObfuscatedName("client.jy")
    public static int field423 = 0;

    @ObfuscatedName("client.jm")
    public static class164 field506 = null;

    @ObfuscatedName("client.jt")
    public static int field425 = 0;

    @ObfuscatedName("client.jg")
    public static int field426 = 0;

    @ObfuscatedName("client.js")
    public static int field427 = 0;

    @ObfuscatedName("client.ju")
    public static int field428 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field257 = false;

    @ObfuscatedName("client.jo")
    public static boolean field430 = false;

    @ObfuscatedName("client.jw")
    public static boolean field496 = false;

    @ObfuscatedName("client.jh")
    public static class164 field432 = null;

    @ObfuscatedName("client.jq")
    public static class164 field433 = null;

    @ObfuscatedName("client.jj")
    public static class164 field281 = null;

    @ObfuscatedName("client.ji")
    public static int field435 = 0;

    @ObfuscatedName("client.jz")
    public static int field380 = 0;

    @ObfuscatedName("client.jc")
    public static class164 field369 = null;

    @ObfuscatedName("client.jl")
    public static boolean field438 = false;

    @ObfuscatedName("client.jd")
    public static int field439 = -1;

    @ObfuscatedName("client.jb")
    public static int field440 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field453 = false;

    @ObfuscatedName("client.jx")
    public static int field442 = -1;

    @ObfuscatedName("client.jv")
    public static int field443 = -1;

    @ObfuscatedName("client.ku")
    public static boolean field329 = false;

    @ObfuscatedName("client.kp")
    public static int field538 = 1;

    @ObfuscatedName("client.kx")
    public static int[] field529 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field403 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field497 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field449 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field450 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field451 = 0;

    @ObfuscatedName("client.kw")
    public static int field523 = 0;

    @ObfuscatedName("client.kt")
    public static int field320 = 0;

    @ObfuscatedName("client.ky")
    public static int field454 = 0;

    @ObfuscatedName("client.kk")
    public static int field359 = 0;

    @ObfuscatedName("client.ko")
    public static int field456 = 0;

    @ObfuscatedName("client.kh")
    public static int field457 = 0;

    @ObfuscatedName("client.kg")
    public static int[] field522 = new int[2000];

    @ObfuscatedName("client.kr")
    public static String[] field459 = new String[1000];

    @ObfuscatedName("client.ks")
    public static int field503 = 0;

    @ObfuscatedName("client.ke")
    public static class190 field455 = new class190();

    @ObfuscatedName("client.km")
    public static class190 field462 = new class190();

    @ObfuscatedName("client.lg")
    public static class190 field463 = new class190();

    @ObfuscatedName("client.lp")
    public static class187 field464 = new class187(512);

    @ObfuscatedName("client.ln")
    public static int field465 = 0;

    @ObfuscatedName("client.lt")
    public static int field466 = -2;

    @ObfuscatedName("client.ld")
    public static boolean[] field424 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field468 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field469 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static int[] field485 = new int[100];

    @ObfuscatedName("client.ly")
    public static int[] field461 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field472 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field350 = new int[100];

    @ObfuscatedName("client.lw")
    public static int field474 = 0;

    @ObfuscatedName("client.lz")
    public static long field475 = 0L;

    @ObfuscatedName("client.lv")
    public static boolean field441 = true;

    @ObfuscatedName("client.ls")
    public static int field399 = 1;

    @ObfuscatedName("client.lx")
    public static int field478 = 503;

    @ObfuscatedName("client.lo")
    public static int[] field512 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lf")
    public static int field480 = 0;

    @ObfuscatedName("client.lh")
    public static int field481 = 0;

    @ObfuscatedName("client.ll")
    public static String field482 = "";

    @ObfuscatedName("client.mp")
    public static long[] field318 = new long[100];

    @ObfuscatedName("client.mb")
    public static int field484 = 0;

    @ObfuscatedName("client.mu")
    public static int field477 = 0;

    @ObfuscatedName("client.mt")
    public static int[] field486 = new int[128];

    @ObfuscatedName("client.mq")
    public static int[] field487 = new int[128];

    @ObfuscatedName("client.mf")
    public static long field488 = -1L;

    @ObfuscatedName("client.mh")
    public static String field489 = null;

    @ObfuscatedName("client.ms")
    public static String field490 = null;

    @ObfuscatedName("client.mm")
    public static int field491 = -1;

    @ObfuscatedName("client.ml")
    public static int field492 = 0;

    @ObfuscatedName("client.mx")
    public static int[] field342 = new int[1000];

    @ObfuscatedName("client.md")
    public static int[] field494 = new int[1000];

    @ObfuscatedName("client.mv")
    public static class74[] field495 = new class74[1000];

    @ObfuscatedName("client.my")
    public static int field418 = 0;

    @ObfuscatedName("client.me")
    public static int field280 = 0;

    @ObfuscatedName("client.ng")
    public static int field498 = 0;

    @ObfuscatedName("client.nq")
    public static int field499 = 255;

    @ObfuscatedName("client.no")
    public static int field300 = -1;

    @ObfuscatedName("client.nb")
    public static boolean field501 = false;

    @ObfuscatedName("client.nn")
    public static int field502 = 127;

    @ObfuscatedName("client.nm")
    public static int field422 = 127;

    @ObfuscatedName("client.nr")
    public static int field504 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field505 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field325 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field507 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field508 = new int[50];

    @ObfuscatedName("client.ny")
    public static class54[] field509 = new class54[50];

    @ObfuscatedName("client.nv")
    public static boolean field510 = false;

    @ObfuscatedName("client.ou")
    public static boolean[] field511 = new boolean[5];

    @ObfuscatedName("client.or")
    public static int[] field447 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field513 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field336 = new int[5];

    @ObfuscatedName("client.ot")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.oq")
    public static short field515 = 256;

    @ObfuscatedName("client.os")
    public static short field517 = 205;

    @ObfuscatedName("client.od")
    public static short field518 = 256;

    @ObfuscatedName("client.oc")
    public static short field519 = 320;

    @ObfuscatedName("client.oa")
    public static short field330 = 1;

    @ObfuscatedName("client.oy")
    public static short field297 = 32767;

    @ObfuscatedName("client.ov")
    public static short field382 = 1;

    @ObfuscatedName("client.ok")
    public static short field388 = 32767;

    @ObfuscatedName("client.om")
    public static int field317 = 0;

    @ObfuscatedName("client.oi")
    public static int field525 = 0;

    @ObfuscatedName("client.ow")
    public static int field526 = 0;

    @ObfuscatedName("client.of")
    public static int field527 = 0;

    @ObfuscatedName("client.og")
    public static int field528 = 0;

    @ObfuscatedName("client.ol")
    public static int field446 = 0;

    @ObfuscatedName("client.oz")
    public static int field530 = 0;

    @ObfuscatedName("client.ps")
    public static class17[] field393 = new class17[400];

    @ObfuscatedName("client.pz")
    public static class186 field532 = new class186();

    @ObfuscatedName("client.pl")
    public static int field401 = 0;

    @ObfuscatedName("client.pe")
    public static class8[] field534 = new class8[400];

    @ObfuscatedName("client.pj")
    public static class170 field436 = new class170();

    @ObfuscatedName("client.ph")
    public static int field290 = -1;

    @ObfuscatedName("client.pt")
    public static int field537 = -1;

    @ObfuscatedName("client.pn")
    public static class211[] field322 = new class211[8];

    @ObfuscatedName("client.e(B)V")
    public final void method181() {
    }

    public final void init() {
        if (!this.method2676()) {
            return;
        }
        class181[] var1 = new class181[] { class181.field2960, class181.field2955, class181.field2965, class181.field2957, class181.field2963, class181.field2962, class181.field2969, class181.field2956, class181.field2966, class181.field2964, class181.field2968, class181.field2959, class181.field2958, class181.field2961, class181.field2967 };
        class181[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class181 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2970);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2970)) {
                    case 3:
                        field259 = Integer.parseInt(var5);
                    case 4:
                    default:
                        break;
                    case 5:
                        class145[] var6 = new class145[] { class145.field2193, class145.field2192, class145.field2187, class145.field2186, class145.field2189, class145.field2188 };
                        Statics.field260 = (class145) class101.method561(var6, Integer.parseInt(var5));
                        if (Statics.field260 == class145.field2189) {
                            Statics.field261 = class203.field3032;
                        } else {
                            Statics.field261 = class203.field3040;
                        }
                        break;
                    case 6:
                        Statics.field288 = class144.method2496(Integer.parseInt(var5));
                        break;
                    case 7:
                        field256 = Integer.parseInt(var5);
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field22)) {
                            field262 = true;
                        } else {
                            field262 = false;
                        }
                        break;
                    case 9:
                        field264 = Integer.parseInt(var5);
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class2.field22)) {
                        }
                        break;
                    case 11:
                        Statics.field1967 = var5;
                        break;
                    case 12:
                        field338 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field1017 = var5;
                        break;
                    case 14:
                        Statics.field2570 = Integer.parseInt(var5);
                        break;
                    case 15:
                        Statics.field2183 = Integer.parseInt(var5);
                }
            }
        }
        class81.field1450 = false;
        field253 = false;
        Statics.field546 = this.getCodeBase().getHost();
        String var7 = Statics.field288.field2178;
        byte var8 = 0;
        try {
            class141.method2596("oldschool", var7, var8, 16);
        } catch (Exception var10) {
            class140.method1((String) null, var10);
        }
        Statics.field254 = this;
        this.method2670(765, 503, 84);
    }

    @ObfuscatedName("client.w(I)V")
    public final void method183() {
        Statics.field2489 = field259 == 0 ? 43594 : field256 + 40000;
        Statics.field3021 = field259 == 0 ? 443 : field256 + 50000;
        Statics.field295 = Statics.field2489;
        Statics.field827 = class165.field2785;
        Statics.field1302 = class165.field2792;
        Statics.field141 = class165.field2787;
        Statics.field2132 = class165.field2788;
        class129.method135();
        class129.method2795(Statics.field1618);
        Canvas var1 = Statics.field1618;
        var1.addMouseListener(class132.field2060);
        var1.addMouseMotionListener(class132.field2060);
        var1.addFocusListener(class132.field2060);
        Statics.field172 = class123.method576();
        if (Statics.field172 != null) {
            Statics.field172.method2508(Statics.field1618);
        }
        Statics.field284 = new class126(255, class141.field2146, class141.field2147, 500000);
        Statics.field71 = class9.method2667();
        Statics.field1097 = this.getToolkit().getSystemClipboard();
        String var3 = Statics.field996;
        class130.field2033 = this;
        class130.field2030 = var3;
        if (field259 != 0) {
            field273 = true;
        }
        int var4 = Statics.field71.field136;
        field475 = 0L;
        if (var4 >= 2) {
            field441 = true;
        } else {
            field441 = false;
        }
        method480();
        if (field460 >= 25) {
            field452.method2426(104);
            class114 var5 = field452;
            int var6 = field441 ? 2 : 1;
            var5.method2160(var6);
            field452.method2365(Statics.field594);
            field452.method2365(Statics.field1958);
        }
        field2105 = true;
    }

    @ObfuscatedName("client.t(I)V")
    public final void method398() {
        field267++;
        this.method187();
        class161.method2613();
        try {
            if (class174.field2858 == 1) {
                int var1 = Statics.field2811.method3247();
                if (var1 > 0 && Statics.field2811.method3253()) {
                    int var2 = var1 - Statics.field1486;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2811.method3246(var2);
                } else {
                    Statics.field2811.method3252();
                    Statics.field2811.method3250();
                    if (Statics.field1852 == null) {
                        class174.field2858 = 0;
                    } else {
                        class174.field2858 = 2;
                    }
                    Statics.field1491 = null;
                    Statics.field1621 = null;
                }
            }
        } catch (Exception var150) {
            var150.printStackTrace();
            Statics.field2811.method3252();
            class174.field2858 = 0;
            Statics.field1491 = null;
            Statics.field1621 = null;
            Statics.field1852 = null;
        }
        method2769();
        class129.method2783();
        class132.method3559();
        if (Statics.field172 != null) {
            int var4 = Statics.field172.method2504();
            field503 = var4;
        }
        if (field460 == 0) {
            method2122();
            Statics.field2802.method2519();
            for (int var5 = 0; var5 < 32; var5++) {
                field2101[var5] = 0L;
            }
            for (int var6 = 0; var6 < 32; var6++) {
                field2106[var6] = 0L;
            }
            Statics.field29 = 0;
        } else if (field460 == 5) {
            class30.method34(this);
            method2122();
            Statics.field2802.method2519();
            for (int var7 = 0; var7 < 32; var7++) {
                field2101[var7] = 0L;
            }
            for (int var8 = 0; var8 < 32; var8++) {
                field2106[var8] = 0L;
            }
            Statics.field29 = 0;
        } else if (field460 == 10 || field460 == 11) {
            class30.method34(this);
        } else if (field460 == 20) {
            class30.method34(this);
            method2();
        } else if (field460 == 25) {
            method90();
        }
        if (field460 == 30) {
            if (field274 > 1) {
                field274--;
            }
            if (field310 > 0) {
                field310--;
            }
            if (field311) {
                field311 = false;
                method37();
            } else {
                if (!field533) {
                    field407[0] = class148.field2449;
                    field408[0] = "";
                    field405[0] = 1006;
                    field402 = 1;
                }
                for (int var9 = 0; var9 < 100 && method137(); var9++) {
                }
                if (field460 == 30) {
                    while (true) {
                        class201 var10 = (class201) class202.field3031.method3485();
                        boolean var11;
                        if (var10 == null) {
                            var11 = false;
                        } else {
                            var11 = true;
                        }
                        if (!var11) {
                            Object var13 = Statics.field566.field196;
                            synchronized (Statics.field566.field196) {
                                if (!field304) {
                                    Statics.field566.field191 = 0;
                                } else if (class132.field2056 != 0 || Statics.field566.field191 >= 40) {
                                    field452.method2426(156);
                                    field452.method2160(0);
                                    int var14 = field452.field1885;
                                    int var15 = 0;
                                    for (int var16 = 0; var16 < Statics.field566.field191 && field452.field1885 - var14 < 240; var16++) {
                                        var15++;
                                        int var17 = Statics.field566.field192[var16];
                                        if (var17 < 0) {
                                            var17 = 0;
                                        } else if (var17 > 502) {
                                            var17 = 502;
                                        }
                                        int var18 = Statics.field566.field188[var16];
                                        if (var18 < 0) {
                                            var18 = 0;
                                        } else if (var18 > 764) {
                                            var18 = 764;
                                        }
                                        int var19 = var17 * 765 + var18;
                                        if (Statics.field566.field192[var16] == -1 && Statics.field566.field188[var16] == -1) {
                                            var18 = -1;
                                            var17 = -1;
                                            var19 = 524287;
                                        }
                                        if (field269 != var18 || field270 != var17) {
                                            int var20 = var18 - field269;
                                            field269 = var18;
                                            int var21 = var17 - field270;
                                            field270 = var17;
                                            if (field386 < 8 && var20 >= -32 && var20 <= 31 && var21 >= -32 && var21 <= 31) {
                                                var20 += 32;
                                                var21 += 32;
                                                field452.method2365((field386 << 12) + (var20 << 6) + var21);
                                                field386 = 0;
                                            } else if (field386 < 8) {
                                                field452.method2260((field386 << 19) + 8388608 + var19);
                                                field386 = 0;
                                            } else {
                                                field452.method2161((field386 << 19) + -1073741824 + var19);
                                                field386 = 0;
                                            }
                                        } else if (field386 < 2047) {
                                            field386++;
                                        }
                                    }
                                    field452.method2172(field452.field1885 - var14);
                                    if (var15 >= Statics.field566.field191) {
                                        Statics.field566.field191 = 0;
                                    } else {
                                        Statics.field566.field191 -= var15;
                                        for (int var22 = 0; var22 < Statics.field566.field191; var22++) {
                                            Statics.field566.field188[var22] = Statics.field566.field188[var15 + var22];
                                            Statics.field566.field192[var22] = Statics.field566.field192[var15 + var22];
                                        }
                                    }
                                }
                            }
                            if (class132.field2056 == 1 || !Statics.field2048 && class132.field2056 == 4 || class132.field2056 == 2) {
                                long var24 = (class132.field2059 - field268 * -1L) / 50L;
                                if (var24 > 4095L) {
                                    var24 = 4095L;
                                }
                                field268 = class132.field2059 * -1L;
                                int var26 = class132.field2058;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > Statics.field1958) {
                                    var26 = Statics.field1958;
                                }
                                int var27 = class132.field2057;
                                if (var27 < 0) {
                                    var27 = 0;
                                } else if (var27 > Statics.field594) {
                                    var27 = Statics.field594;
                                }
                                int var28 = (int) var24;
                                field452.method2426(71);
                                field452.method2365((var28 << 1) + (class132.field2056 == 2 ? 1 : 0));
                                field452.method2365(var27);
                                field452.method2365(var26);
                            }
                            if (class129.field2025 > 0) {
                                field452.method2426(76);
                                field452.method2365(0);
                                int var29 = field452.field1885;
                                long var30 = class107.method579();
                                for (int var32 = 0; var32 < class129.field2025; var32++) {
                                    long var33 = var30 - field488;
                                    if (var33 > 16777215L) {
                                        var33 = 16777215L;
                                    }
                                    field488 = var30;
                                    field452.method2321(class129.field2018[var32]);
                                    field452.method2260((int) var33);
                                }
                                field452.method2171(field452.field1885 - var29);
                            }
                            if (field348 > 0) {
                                field348--;
                            }
                            if (class129.field2012[96] || class129.field2012[97] || class129.field2012[98] || class129.field2012[99]) {
                                field349 = true;
                            }
                            if (field349 && field348 <= 0) {
                                field348 = 20;
                                field349 = false;
                                field452.method2426(183);
                                field452.method2365(field343);
                                field452.method2204(field319);
                            }
                            if (Statics.field575 && !field272) {
                                field272 = true;
                                field452.method2426(224);
                                field452.method2160(1);
                            }
                            if (!Statics.field575 && field272) {
                                field272 = false;
                                field452.method2426(224);
                                field452.method2160(0);
                            }
                            if (field253 && Statics.field1818 != field313) {
                                method2566(Statics.field1800, Statics.field1948, Statics.field1818, Statics.field734.field818[0], Statics.field734.field814[0]);
                            } else if (Statics.field1818 != field491) {
                                field491 = Statics.field1818;
                                int var35 = Statics.field1818;
                                int[] var36 = Statics.field17.field1344;
                                int var37 = var36.length;
                                for (int var38 = 0; var38 < var37; var38++) {
                                    var36[var38] = 0;
                                }
                                int var39 = 1;
                                while (true) {
                                    if (var39 >= 103) {
                                        int var42 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var43 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field17.method1446();
                                        for (int var44 = 1; var44 < 103; var44++) {
                                            for (int var45 = 1; var45 < 103; var45++) {
                                                if ((class6.field72[var35][var45][var44] & 0x18) == 0) {
                                                    method10(var35, var45, var44, var42, var43);
                                                }
                                                if (var35 < 3 && (class6.field72[var35 + 1][var45][var44] & 0x8) != 0) {
                                                    method10(var35 + 1, var45, var44, var42, var43);
                                                }
                                            }
                                        }
                                        field492 = 0;
                                        for (int var46 = 0; var46 < 104; var46++) {
                                            for (int var47 = 0; var47 < 104; var47++) {
                                                int var48 = Statics.field189.method1656(Statics.field1818, var46, var47);
                                                if (var48 != 0) {
                                                    int var49 = var48 >> 14 & 0x7FFF;
                                                    int var50 = class38.method489(var49).field903;
                                                    if (var50 >= 0) {
                                                        int var51 = var46;
                                                        int var52 = var47;
                                                        if (var50 != 22 && var50 != 29 && var50 != 34 && var50 != 36 && var50 != 46 && var50 != 47 && var50 != 48) {
                                                            int[][] var53 = field531[Statics.field1818].field3130;
                                                            for (int var54 = 0; var54 < 10; var54++) {
                                                                int var55 = (int) (Math.random() * 4.0D);
                                                                if (var55 == 0 && var51 > 0 && var51 > var46 - 3 && (var53[var51 - 1][var52] & 0x1240108) == 0) {
                                                                    var51--;
                                                                }
                                                                if (var55 == 1 && var51 < 103 && var51 < var46 + 3 && (var53[var51 + 1][var52] & 0x1240180) == 0) {
                                                                    var51++;
                                                                }
                                                                if (var55 == 2 && var52 > 0 && var52 > var47 - 3 && (var53[var51][var52 - 1] & 0x1240102) == 0) {
                                                                    var52--;
                                                                }
                                                                if (var55 == 3 && var52 < 103 && var52 < var47 + 3 && (var53[var51][var52 + 1] & 0x1240120) == 0) {
                                                                    var52++;
                                                                }
                                                            }
                                                        }
                                                        field495[field492] = Statics.field744[var50];
                                                        field342[field492] = var51;
                                                        field494[field492] = var52;
                                                        field492++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field1489.method1435();
                                        break;
                                    }
                                    int var40 = (103 - var39) * 2048 + 24628;
                                    for (int var41 = 1; var41 < 103; var41++) {
                                        if ((class6.field72[var35][var41][var39] & 0x18) == 0) {
                                            Statics.field189.method1661(var36, var40, 512, var35, var41, var39);
                                        }
                                        if (var35 < 3 && (class6.field72[var35 + 1][var41][var39] & 0x8) != 0) {
                                            Statics.field189.method1661(var36, var40, 512, var35 + 1, var41, var39);
                                        }
                                        var40 += 4;
                                    }
                                    var39++;
                                }
                            }
                            if (field460 == 30) {
                                for (class16 var56 = (class16) field493.method3442(); var56 != null; var56 = (class16) field493.method3444()) {
                                    if (var56.field225 > 0) {
                                        var56.field225--;
                                    }
                                    if (var56.field225 == 0) {
                                        if (var56.field218 >= 0) {
                                            int var57 = var56.field218;
                                            int var58 = var56.field220;
                                            class38 var59 = class38.method489(var57);
                                            if (var58 == 11) {
                                                var58 = 10;
                                            }
                                            if (var58 >= 5 && var58 <= 8) {
                                                var58 = 4;
                                            }
                                            boolean var60 = var59.method704(var58);
                                            if (!var60) {
                                                continue;
                                            }
                                        }
                                        method631(var56.field221, var56.field215, var56.field229, var56.field217, var56.field218, var56.field219, var56.field220);
                                        var56.method3533();
                                    } else {
                                        if (var56.field224 > 0) {
                                            var56.field224--;
                                        }
                                        if (var56.field224 == 0 && var56.field229 >= 1 && var56.field217 >= 1 && var56.field229 <= 102 && var56.field217 <= 102) {
                                            if (var56.field216 >= 0) {
                                                int var61 = var56.field216;
                                                int var62 = var56.field228;
                                                class38 var63 = class38.method489(var61);
                                                if (var62 == 11) {
                                                    var62 = 10;
                                                }
                                                if (var62 >= 5 && var62 <= 8) {
                                                    var62 = 4;
                                                }
                                                boolean var64 = var63.method704(var62);
                                                if (!var64) {
                                                    continue;
                                                }
                                            }
                                            method631(var56.field221, var56.field215, var56.field229, var56.field217, var56.field216, var56.field222, var56.field228);
                                            var56.field224 = -1;
                                            if (var56.field218 == var56.field216 && var56.field218 == -1) {
                                                var56.method3533();
                                            } else if (var56.field218 == var56.field216 && var56.field222 == var56.field219 && var56.field228 == var56.field220) {
                                                var56.method3533();
                                            }
                                        }
                                    }
                                }
                                method1625();
                                field305++;
                                if (field305 > 750) {
                                    method37();
                                } else {
                                    method106();
                                    method100();
                                    for (int var65 = -1; var65 < field289; var65++) {
                                        int var66;
                                        if (var65 == -1) {
                                            var66 = 2047;
                                        } else {
                                            var66 = field286[var65];
                                        }
                                        class3 var67 = field479[var66];
                                        if (var67 != null && var67.field780 > 0) {
                                            var67.field780--;
                                            if (var67.field780 == 0) {
                                                var67.field777 = null;
                                            }
                                        }
                                    }
                                    for (int var68 = 0; var68 < field298; var68++) {
                                        int var69 = field278[var68];
                                        class32 var70 = field535[var69];
                                        if (var70 != null && var70.field780 > 0) {
                                            var70.field780--;
                                            if (var70.field780 == 0) {
                                                var70.field777 = null;
                                            }
                                        }
                                    }
                                    field335++;
                                    if (field324 != 0) {
                                        field367 += 20;
                                        if (field367 >= 400) {
                                            field324 = 0;
                                        }
                                    }
                                    if (Statics.field230 != null) {
                                        field263++;
                                        if (field263 >= 15) {
                                            method2521(Statics.field230);
                                            Statics.field230 = null;
                                        }
                                    }
                                    class164 var71 = Statics.field169;
                                    class164 var72 = Statics.field2111;
                                    Statics.field169 = null;
                                    Statics.field2111 = null;
                                    field369 = null;
                                    field453 = false;
                                    field438 = false;
                                    field477 = 0;
                                    while (true) {
                                        while (class129.method2973() && field477 < 128) {
                                            if (field427 >= 2 && class129.field2012[82] && Statics.field651 == 66) {
                                                String var73 = "";
                                                Iterator var74 = class11.field158.iterator();
                                                while (var74.hasNext()) {
                                                    class33 var75 = (class33) var74.next();
                                                    var73 = var73 + var75.field742 + ':' + var75.field738 + '\n';
                                                }
                                                Statics.field1097.setContents(new StringSelection(var73), (ClipboardOwner) null);
                                            } else {
                                                field487[field477] = Statics.field651;
                                                field486[field477] = Statics.field3017;
                                                field477++;
                                            }
                                        }
                                        method2476(field420, 0, 0, Statics.field594, Statics.field1958, 0, 0);
                                        field538++;
                                        while (true) {
                                            class1 var78;
                                            class164 var79;
                                            class164 var80;
                                            do {
                                                var78 = (class1) field462.method3452();
                                                if (var78 == null) {
                                                    while (true) {
                                                        class1 var81;
                                                        class164 var82;
                                                        class164 var83;
                                                        do {
                                                            var81 = (class1) field463.method3452();
                                                            if (var81 == null) {
                                                                while (true) {
                                                                    class1 var84;
                                                                    class164 var85;
                                                                    class164 var86;
                                                                    do {
                                                                        var84 = (class1) field455.method3452();
                                                                        if (var84 == null) {
                                                                            method11();
                                                                            if (Statics.field65 == null && field433 == null) {
                                                                                int var87 = class132.field2056;
                                                                                if (field533) {
                                                                                    if (var87 != 1 && (Statics.field2048 || var87 != 4)) {
                                                                                        int var88 = class132.field2050;
                                                                                        int var89 = class132.field2051;
                                                                                        if (var88 < Statics.field564 - 10 || var88 > Statics.field564 + Statics.field1035 + 10 || var89 < Statics.field2606 - 10 || var89 > Statics.field2606 + Statics.field2037 + 10) {
                                                                                            field533 = false;
                                                                                            method2447(Statics.field564, Statics.field2606, Statics.field1035, Statics.field2037);
                                                                                        }
                                                                                    }
                                                                                    if (var87 == 1 || !Statics.field2048 && var87 == 4) {
                                                                                        int var90 = Statics.field564;
                                                                                        int var91 = Statics.field2606;
                                                                                        int var92 = Statics.field1035;
                                                                                        int var93 = class132.field2057;
                                                                                        int var94 = class132.field2058;
                                                                                        int var95 = -1;
                                                                                        for (int var96 = 0; var96 < field402; var96++) {
                                                                                            int var97 = (field402 - 1 - var96) * 15 + var91 + 31;
                                                                                            if (var93 > var90 && var93 < var90 + var92 && var94 > var97 - 13 && var94 < var97 + 3) {
                                                                                                var95 = var96;
                                                                                            }
                                                                                        }
                                                                                        if (var95 != -1 && var95 >= 0) {
                                                                                            int var98 = field394[var95];
                                                                                            int var99 = field404[var95];
                                                                                            int var100 = field405[var95];
                                                                                            int var101 = field406[var95];
                                                                                            String var102 = field407[var95];
                                                                                            String var103 = field408[var95];
                                                                                            method679(var98, var99, var100, var101, var102, var103, class132.field2057, class132.field2058);
                                                                                        }
                                                                                        field533 = false;
                                                                                        method2447(Statics.field564, Statics.field2606, Statics.field1035, Statics.field2037);
                                                                                    }
                                                                                } else {
                                                                                    label1373: {
                                                                                        if ((var87 == 1 || !Statics.field2048 && var87 == 4) && field402 > 0) {
                                                                                            int var104 = field405[field402 - 1];
                                                                                            if (var104 == 39 || var104 == 40 || var104 == 41 || var104 == 42 || var104 == 43 || var104 == 33 || var104 == 34 || var104 == 35 || var104 == 36 || var104 == 37 || var104 == 38 || var104 == 1005) {
                                                                                                label1360: {
                                                                                                    int var105 = field394[field402 - 1];
                                                                                                    int var106 = field404[field402 - 1];
                                                                                                    class164 var107 = class164.method6(var106);
                                                                                                    int var108 = method84(var107);
                                                                                                    boolean var109 = (var108 >> 28 & 0x1) != 0;
                                                                                                    if (!var109) {
                                                                                                        class169 var10000 = (class169) null;
                                                                                                        if (!class169.method1910(method84(var107))) {
                                                                                                            break label1360;
                                                                                                        }
                                                                                                    }
                                                                                                    if (Statics.field65 != null && !field375 && field458 != 1 && !method929(field402 - 1) && field402 > 0) {
                                                                                                        method2115(field372, field373);
                                                                                                    }
                                                                                                    field375 = false;
                                                                                                    field376 = 0;
                                                                                                    if (Statics.field65 != null) {
                                                                                                        method2521(Statics.field65);
                                                                                                    }
                                                                                                    Statics.field65 = class164.method6(var106);
                                                                                                    field371 = var105;
                                                                                                    field372 = class132.field2057;
                                                                                                    field373 = class132.field2058;
                                                                                                    if (field402 > 0) {
                                                                                                        method821(field402 - 1);
                                                                                                    }
                                                                                                    method2521(Statics.field65);
                                                                                                    break label1373;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ((var87 == 1 || !Statics.field2048 && var87 == 4) && (field458 == 1 && field402 > 2 || method929(field402 - 1))) {
                                                                                            var87 = 2;
                                                                                        }
                                                                                        if ((var87 == 1 || !Statics.field2048 && var87 == 4) && field402 > 0) {
                                                                                            int var110 = field402 - 1;
                                                                                            if (var110 >= 0) {
                                                                                                int var111 = field394[var110];
                                                                                                int var112 = field404[var110];
                                                                                                int var113 = field405[var110];
                                                                                                int var114 = field406[var110];
                                                                                                String var115 = field407[var110];
                                                                                                String var116 = field408[var110];
                                                                                                method679(var111, var112, var113, var114, var115, var116, class132.field2057, class132.field2058);
                                                                                            }
                                                                                        }
                                                                                        if (var87 == 2 && field402 > 0) {
                                                                                            method2492(class132.field2057, class132.field2058);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field433 != null) {
                                                                                method2521(field433);
                                                                                Statics.field1104++;
                                                                                if (field453 && field438) {
                                                                                    int var117 = class132.field2050;
                                                                                    int var118 = class132.field2051;
                                                                                    int var119 = var117 - field435;
                                                                                    int var120 = var118 - field380;
                                                                                    if (var119 < field439) {
                                                                                        var119 = field439;
                                                                                    }
                                                                                    if (field433.field2667 + var119 > field439 + field281.field2667) {
                                                                                        var119 = field439 + field281.field2667 - field433.field2667;
                                                                                    }
                                                                                    if (var120 < field440) {
                                                                                        var120 = field440;
                                                                                    }
                                                                                    if (field433.field2668 + var120 > field440 + field281.field2668) {
                                                                                        var120 = field440 + field281.field2668 - field433.field2668;
                                                                                    }
                                                                                    int var121 = var119 - field442;
                                                                                    int var122 = var120 - field443;
                                                                                    int var123 = field433.field2723;
                                                                                    if (Statics.field1104 > field433.field2727 && (var121 > var123 || var121 < -var123 || var122 > var123 || var122 < -var123)) {
                                                                                        field329 = true;
                                                                                    }
                                                                                    int var124 = field281.field2711 + (var119 - field439);
                                                                                    int var125 = field281.field2674 + (var120 - field440);
                                                                                    if (field433.field2739 != null && field329) {
                                                                                        class1 var126 = new class1();
                                                                                        var126.field3 = field433;
                                                                                        var126.field14 = var124;
                                                                                        var126.field5 = var125;
                                                                                        var126.field8 = field433.field2739;
                                                                                        class34.method2786(var126);
                                                                                    }
                                                                                    if (class132.field2049 == 0) {
                                                                                        if (field329) {
                                                                                            if (field433.field2740 != null) {
                                                                                                class1 var127 = new class1();
                                                                                                var127.field3 = field433;
                                                                                                var127.field14 = var124;
                                                                                                var127.field5 = var125;
                                                                                                var127.field7 = field369;
                                                                                                var127.field8 = field433.field2740;
                                                                                                class34.method2786(var127);
                                                                                            }
                                                                                            if (field369 != null) {
                                                                                                class164 var128 = field433;
                                                                                                int var129 = class169.method2810(method84(var128));
                                                                                                class164 var130;
                                                                                                if (var129 == 0) {
                                                                                                    var130 = null;
                                                                                                } else {
                                                                                                    int var131 = 0;
                                                                                                    while (true) {
                                                                                                        if (var131 >= var129) {
                                                                                                            var130 = var128;
                                                                                                            break;
                                                                                                        }
                                                                                                        var128 = class164.method6(var128.field2725);
                                                                                                        if (var128 == null) {
                                                                                                            var130 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var131++;
                                                                                                    }
                                                                                                }
                                                                                                if (var130 != null) {
                                                                                                    field452.method2426(166);
                                                                                                    field452.method2204(field433.field2653);
                                                                                                    field452.method2204(field369.field2653);
                                                                                                    field452.method2206(field433.field2770);
                                                                                                    field452.method2206(field369.field2770);
                                                                                                    field452.method2211(field433.field2652);
                                                                                                    field452.method2213(field369.field2652);
                                                                                                }
                                                                                            }
                                                                                        } else if ((field458 == 1 || method929(field402 - 1)) && field402 > 2) {
                                                                                            method2492(field442 + field435, field443 + field380);
                                                                                        } else if (field402 > 0) {
                                                                                            method2115(field442 + field435, field443 + field380);
                                                                                        }
                                                                                        field433 = null;
                                                                                    }
                                                                                } else if (Statics.field1104 > 1) {
                                                                                    field433 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field65 != null) {
                                                                                method2521(Statics.field65);
                                                                                field376++;
                                                                                if (class132.field2049 == 0) {
                                                                                    if (field375) {
                                                                                        if (Statics.field65 == Statics.field1141 && field374 != field371) {
                                                                                            class164 var132 = Statics.field65;
                                                                                            byte var133 = 0;
                                                                                            if (field423 == 1 && var132.field2763 == 206) {
                                                                                                var133 = 1;
                                                                                            }
                                                                                            if (var132.field2695[field374] <= 0) {
                                                                                                var133 = 0;
                                                                                            }
                                                                                            if (class169.method1910(method84(var132))) {
                                                                                                int var134 = field371;
                                                                                                int var135 = field374;
                                                                                                var132.field2695[var135] = var132.field2695[var134];
                                                                                                var132.field2769[var135] = var132.field2769[var134];
                                                                                                var132.field2695[var134] = -1;
                                                                                                var132.field2769[var134] = 0;
                                                                                            } else if (var133 == 1) {
                                                                                                int var136 = field371;
                                                                                                int var137 = field374;
                                                                                                while (var136 != var137) {
                                                                                                    if (var136 > var137) {
                                                                                                        var132.method3037(var136 - 1, var136);
                                                                                                        var136--;
                                                                                                    } else if (var136 < var137) {
                                                                                                        var132.method3037(var136 + 1, var136);
                                                                                                        var136++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var132.method3037(field374, field371);
                                                                                            }
                                                                                            field452.method2426(106);
                                                                                            field452.method2205(field374);
                                                                                            field452.method2204(field371);
                                                                                            field452.method2178(var133);
                                                                                            field452.method2311(Statics.field65.field2652);
                                                                                        }
                                                                                    } else if ((field458 == 1 || method929(field402 - 1)) && field402 > 2) {
                                                                                        method2492(field372, field373);
                                                                                    } else if (field402 > 0) {
                                                                                        method2115(field372, field373);
                                                                                    }
                                                                                    field263 = 10;
                                                                                    class132.field2056 = 0;
                                                                                    Statics.field65 = null;
                                                                                } else if (field376 >= 5 && (class132.field2050 > field372 + 5 || class132.field2050 < field372 - 5 || class132.field2051 > field373 + 5 || class132.field2051 < field373 - 5)) {
                                                                                    field375 = true;
                                                                                }
                                                                            }
                                                                            if (class81.field1409 != -1) {
                                                                                int var138 = class81.field1409;
                                                                                int var139 = class81.field1427;
                                                                                field452.method2426(140);
                                                                                field452.method2160(5);
                                                                                field452.method2365(Statics.field948 + var139);
                                                                                field452.method2160(class129.field2012[82] ? (class129.field2012[81] ? 2 : 1) : 0);
                                                                                field452.method2206(Statics.field193 + var138);
                                                                                class81.field1409 = -1;
                                                                                field365 = class132.field2057;
                                                                                field366 = class132.field2058;
                                                                                field324 = 1;
                                                                                field367 = 0;
                                                                                field418 = var138;
                                                                                field280 = var139;
                                                                            }
                                                                            if (Statics.field169 != var71) {
                                                                                if (var71 != null) {
                                                                                    method2521(var71);
                                                                                }
                                                                                if (Statics.field169 != null) {
                                                                                    method2521(Statics.field169);
                                                                                }
                                                                            }
                                                                            if (Statics.field2111 != var72 && field412 == field411) {
                                                                                if (var72 != null) {
                                                                                    method2521(var72);
                                                                                }
                                                                                if (Statics.field2111 != null) {
                                                                                    method2521(Statics.field2111);
                                                                                }
                                                                            }
                                                                            if (Statics.field2111 == null) {
                                                                                if (field411 > 0) {
                                                                                    field411--;
                                                                                }
                                                                            } else if (field411 < field412) {
                                                                                field411++;
                                                                                if (field412 == field411) {
                                                                                    method2521(Statics.field2111);
                                                                                }
                                                                            }
                                                                            method140();
                                                                            if (field510) {
                                                                                method78();
                                                                            }
                                                                            for (int var140 = 0; var140 < 5; var140++) {
                                                                                int var10002 = field540[var140]++;
                                                                            }
                                                                            int var141 = ++class132.field2052 - 1;
                                                                            int var143 = class129.method738();
                                                                            if (var141 > 15000 && var143 > 15000) {
                                                                                field310 = 250;
                                                                                class132.field2052 = 14500;
                                                                                field452.method2426(211);
                                                                            }
                                                                            field400++;
                                                                            if (field400 > 500) {
                                                                                field400 = 0;
                                                                                int var144 = (int) (Math.random() * 8.0D);
                                                                                if ((var144 & 0x1) == 1) {
                                                                                    field323 += field258;
                                                                                }
                                                                                if ((var144 & 0x2) == 2) {
                                                                                    field255 += field326;
                                                                                }
                                                                                if ((var144 & 0x4) == 4) {
                                                                                    field327 += field314;
                                                                                }
                                                                            }
                                                                            if (field323 < -50) {
                                                                                field258 = 2;
                                                                            }
                                                                            if (field323 > 50) {
                                                                                field258 = -2;
                                                                            }
                                                                            if (field255 < -55) {
                                                                                field326 = 2;
                                                                            }
                                                                            if (field255 > 55) {
                                                                                field326 = -2;
                                                                            }
                                                                            if (field327 < -40) {
                                                                                field314 = 1;
                                                                            }
                                                                            if (field327 > 40) {
                                                                                field314 = -1;
                                                                            }
                                                                            field334++;
                                                                            if (field334 > 500) {
                                                                                field334 = 0;
                                                                                int var145 = (int) (Math.random() * 8.0D);
                                                                                if ((var145 & 0x1) == 1) {
                                                                                    field500 += field331;
                                                                                }
                                                                                if ((var145 & 0x2) == 2) {
                                                                                    field332 += field368;
                                                                                }
                                                                            }
                                                                            if (field500 < -60) {
                                                                                field331 = 2;
                                                                            }
                                                                            if (field500 > 60) {
                                                                                field331 = -2;
                                                                            }
                                                                            if (field332 < -20) {
                                                                                field368 = 1;
                                                                            }
                                                                            if (field332 > 10) {
                                                                                field368 = -1;
                                                                            }
                                                                            for (class36 var146 = (class36) field532.method3395(); var146 != null; var146 = (class36) field532.method3396()) {
                                                                                if ((long) var146.field831 < class107.method579() / 1000L - 5L) {
                                                                                    if (var146.field828 > 0) {
                                                                                        class11.method3366(5, "", var146.field830 + class148.field2360);
                                                                                    }
                                                                                    if (var146.field828 == 0) {
                                                                                        class11.method3366(5, "", var146.field830 + class148.field2361);
                                                                                    }
                                                                                    var146.method3532();
                                                                                }
                                                                            }
                                                                            field306++;
                                                                            if (field306 > 50) {
                                                                                field452.method2426(114);
                                                                            }
                                                                            try {
                                                                                if (Statics.field1622 != null && field452.field1885 > 0) {
                                                                                    Statics.field1622.method2658(field452.field1889, 0, field452.field1885);
                                                                                    field452.field1885 = 0;
                                                                                    field306 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var148) {
                                                                                method37();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var85 = var84.field3;
                                                                        if (var85.field2653 < 0) {
                                                                            break;
                                                                        }
                                                                        var86 = class164.method6(var85.field2725);
                                                                    } while (var86 == null || var86.field2684 == null || var85.field2653 >= var86.field2684.length || var86.field2684[var85.field2653] != var85);
                                                                    class34.method2786(var84);
                                                                }
                                                            }
                                                            var82 = var81.field3;
                                                            if (var82.field2653 < 0) {
                                                                break;
                                                            }
                                                            var83 = class164.method6(var82.field2725);
                                                        } while (var83 == null || var83.field2684 == null || var82.field2653 >= var83.field2684.length || var83.field2684[var82.field2653] != var82);
                                                        class34.method2786(var81);
                                                    }
                                                }
                                                var79 = var78.field3;
                                                if (var79.field2653 < 0) {
                                                    break;
                                                }
                                                var80 = class164.method6(var79.field2725);
                                            } while (var80 == null || var80.field2684 == null || var79.field2653 >= var80.field2684.length || var80.field2684[var79.field2653] != var79);
                                            class34.method2786(var78);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        field452.method2426(155);
                        field452.method2160(0);
                        int var12 = field452.field1885;
                        class202.method3545(field452);
                        field452.method2172(field452.field1885 - var12);
                    }
                }
            }
        } else if (field460 == 40 || field460 == 45) {
            method2();
        }
    }

    @ObfuscatedName("client.s(B)V")
    public final void method185() {
        boolean var1 = class174.method1391();
        if (var1 && field501 && Statics.field823 != null) {
            Statics.field823.method1046();
        }
        if (field460 == 10 || field460 == 20 || field460 == 30) {
            if (field475 != 0L && class107.method579() > field475) {
                int var2 = field441 ? 2 : 1;
                field475 = 0L;
                if (var2 >= 2) {
                    field441 = true;
                } else {
                    field441 = false;
                }
                method480();
                if (field460 >= 25) {
                    field452.method2426(104);
                    class114 var3 = field452;
                    int var4 = field441 ? 2 : 1;
                    var3.method2160(var4);
                    field452.method2365(Statics.field594);
                    field452.method2365(Statics.field1958);
                }
                field2105 = true;
            } else if (field2112) {
                method848();
            }
        }
        Dimension var5 = this.method2681();
        if (Statics.field1521 != var5.width || Statics.field685 != var5.height || field2107) {
            method480();
            field475 = class107.method579() + 500L;
            field2107 = false;
        }
        boolean var6 = false;
        if (field2105) {
            field2105 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field424[var7] = true;
            }
        }
        if (var6) {
            method1892();
        }
        if (field460 == 0) {
            class136.method3358(class30.field709, class30.field706, (Color) null, var6);
        } else if (field460 == 5) {
            Statics.method5(Statics.field1900, Statics.field1965, Statics.field60, var6);
        } else if (field460 == 10 || field460 == 11) {
            Statics.method5(Statics.field1900, Statics.field1965, Statics.field60, var6);
        } else if (field460 == 20) {
            Statics.method5(Statics.field1900, Statics.field1965, Statics.field60, var6);
        } else if (field460 == 25) {
            if (field396 == 1) {
                if (field444 > field315) {
                    field315 = field444;
                }
                int var8 = (field315 * 50 - field444 * 50) / field315;
                method3099(class148.field2222 + class2.field25 + class2.field23 + var8 + "%" + class2.field24, false);
            } else if (field396 == 2) {
                if (field316 > field321) {
                    field321 = field316;
                }
                int var9 = (field321 * 50 - field316 * 50) / field321 + 50;
                method3099(class148.field2222 + class2.field25 + class2.field23 + var9 + "%" + class2.field24, false);
            } else {
                method3099(class148.field2222, false);
            }
        } else if (field460 == 30) {
            method581();
        } else if (field460 == 40) {
            method3099(class148.field2256 + class2.field25 + class148.field2224, false);
        } else if (field460 == 45) {
            method3099(class148.field2371, false);
        }
        if (field460 == 30 && field474 == 0 && !var6) {
            try {
                Graphics var10 = Statics.field1618.getGraphics();
                for (int var11 = 0; var11 < field465; var11++) {
                    if (field468[var11]) {
                        Statics.field1489.method1384(var10, field485[var11], field461[var11], field472[var11], field350[var11]);
                        field468[var11] = false;
                    }
                }
            } catch (Exception var17) {
                Statics.field1618.repaint();
            }
        } else if (field460 > 0) {
            try {
                Graphics var13 = Statics.field1618.getGraphics();
                Statics.field1489.method1383(var13, 0, 0);
                for (int var14 = 0; var14 < field465; var14++) {
                    field468[var14] = false;
                }
            } catch (Exception var16) {
                Statics.field1618.repaint();
            }
        }
    }

    @ObfuscatedName("client.c(I)V")
    public final void method186() {
        if (Statics.field566 != null) {
            Statics.field566.field190 = false;
        }
        Statics.field566 = null;
        if (Statics.field1622 != null) {
            Statics.field1622.method2643();
            Statics.field1622 = null;
        }
        class129.method623();
        class132.method2473();
        Statics.field172 = null;
        if (Statics.field823 != null) {
            Statics.field823.method1026();
        }
        if (Statics.field2137 != null) {
            Statics.field2137.method1026();
        }
        class162.method2452();
        Object var1 = class161.field2613;
        synchronized (class161.field2613) {
            if (class161.field2612 != 0) {
                class161.field2612 = 1;
                try {
                    class161.field2613.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class141.field2146.method3743();
            for (int var4 = 0; var4 < Statics.field2140; var4++) {
                Statics.field2148[var4].method3743();
            }
            class141.field2147.method3743();
            class141.field2145.method3743();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("j.d(II)V")
    public static void method521(int arg0) {
        if (field460 == arg0) {
            return;
        }
        if (field460 == 0) {
            class136.method2019();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field333 = 0;
            field292 = 0;
            field293 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2127 != null) {
            Statics.field2127.method2643();
            Statics.field2127 = null;
        }
        if (field460 == 25) {
            field396 = 0;
            field444 = 0;
            field315 = 1;
            field316 = 0;
            field321 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method161(Statics.field1618, Statics.field205, Statics.field1843, true, 0);
        } else if (arg0 == 20) {
            class30.method161(Statics.field1618, Statics.field205, Statics.field1843, true, field460 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method161(Statics.field1618, Statics.field205, Statics.field1843, false, 4);
        } else if (Statics.field717) {
            Statics.field713 = null;
            Statics.field693 = null;
            Statics.field694 = null;
            Statics.field1981 = null;
            Statics.field695 = null;
            Statics.field696 = null;
            Statics.field155 = null;
            Statics.field2789 = null;
            Statics.field1291 = null;
            Statics.field2041 = null;
            Statics.field3045 = null;
            Statics.field2807 = null;
            Statics.field719 = null;
            Statics.field1873 = null;
            Statics.field689 = null;
            Statics.field164 = null;
            Statics.field171 = null;
            Statics.field649 = null;
            Statics.field1305 = null;
            Statics.field2039 = null;
            Statics.field74 = null;
            Statics.field186 = null;
            class174.field2858 = 1;
            Statics.field1852 = null;
            Statics.field2823 = -1;
            Statics.field2544 = -1;
            Statics.field1851 = 0;
            Statics.field187 = false;
            Statics.field1486 = 2;
            class162.method2497(true);
            Statics.field717 = false;
        }
        field460 = arg0;
    }

    @ObfuscatedName("client.v(I)V")
    public void method187() {
        if (field460 != 1000) {
            boolean var1 = class162.method2477();
            if (!var1) {
                this.method282();
            }
        }
    }

    @ObfuscatedName("client.m(I)V")
    public void method282() {
        if (class162.field2636 >= 4) {
            this.method2679("js5crc");
            field460 = 1000;
            return;
        }
        if (class162.field2634 >= 4) {
            if (field460 <= 5) {
                this.method2679("js5io");
                field460 = 1000;
                return;
            }
            field445 = 3000;
            class162.field2634 = 3;
        }
        if (--field445 + 1 > 0) {
            return;
        }
        try {
            if (field287 == 0) {
                Statics.field130 = Statics.field1983.method2546(Statics.field546, Statics.field295);
                field287++;
            }
            if (field287 == 1) {
                if (Statics.field130.field2118 == 2) {
                    this.method189(-1);
                    return;
                }
                if (Statics.field130.field2118 == 1) {
                    field287++;
                }
            }
            if (field287 == 2) {
                Statics.field211 = new class135((Socket) Statics.field130.field2125, Statics.field1983);
                class111 var1 = new class111(5);
                var1.method2160(15);
                var1.method2161(84);
                Statics.field211.method2658(var1.field1889, 0, 5);
                field287++;
                Statics.field1013 = class107.method579();
            }
            if (field287 == 3) {
                if (field460 <= 5 || Statics.field211.method2656() > 0) {
                    int var2 = Statics.field211.method2644();
                    if (var2 != 0) {
                        this.method189(var2);
                        return;
                    }
                    field287++;
                } else if (class107.method579() - Statics.field1013 > 30000L) {
                    this.method189(-2);
                    return;
                }
            }
            if (field287 == 4) {
                class162.method2407(Statics.field211, field460 > 20);
                Statics.field130 = null;
                Statics.field211 = null;
                field287 = 0;
                field391 = 0;
            }
        } catch (IOException var4) {
            this.method189(-3);
        }
    }

    @ObfuscatedName("client.h(II)V")
    public void method189(int arg0) {
        Statics.field130 = null;
        Statics.field211 = null;
        field287 = 0;
        if (Statics.field295 == Statics.field2489) {
            Statics.field295 = Statics.field3021;
        } else {
            Statics.field295 = Statics.field2489;
        }
        field391++;
        if (field391 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field460 <= 5) {
                this.method2679("js5connect_full");
                field460 = 1000;
            } else {
                field445 = 3000;
            }
        } else if (field391 >= 2 && arg0 == 6) {
            this.method2679("js5connect_outofdate");
            field460 = 1000;
        } else if (field391 >= 4) {
            if (field460 <= 5) {
                this.method2679("js5connect");
                field460 = 1000;
            } else {
                field445 = 3000;
            }
        }
    }

    @ObfuscatedName("du.n(I)V")
    public static void method2122() {
        if (field265 == 0) {
            Statics.field189 = new class81(4, 104, 104, class6.field82);
            for (int var0 = 0; var0 < 4; var0++) {
                field531[var0] = new class220(104, 104);
            }
            Statics.field17 = new class74(512, 512);
            class30.field706 = class148.field2225;
            class30.field709 = 5;
            field265 = 20;
        } else if (field265 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1519[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1662(var1, 500, 800, 512, 334);
            class30.field706 = class148.field2293;
            class30.field709 = 10;
            field265 = 30;
        } else if (field265 == 30) {
            Statics.field2084 = method676(0, false, true, true);
            Statics.field677 = method676(1, false, true, true);
            Statics.field2616 = method676(2, true, false, true);
            Statics.field657 = method676(3, false, true, true);
            Statics.field1527 = method676(4, false, true, true);
            Statics.field2813 = method676(5, true, true, true);
            Statics.field536 = method676(6, true, true, false);
            Statics.field676 = method676(7, false, true, true);
            Statics.field1843 = method676(8, false, true, true);
            Statics.field924 = method676(9, false, true, true);
            Statics.field205 = method676(10, false, true, true);
            Statics.field1938 = method676(11, false, true, true);
            Statics.field133 = method676(12, false, true, true);
            Statics.field1160 = method676(13, true, false, true);
            Statics.field1964 = method676(14, false, true, false);
            Statics.field2543 = method676(15, false, true, true);
            class30.field706 = class148.field2227;
            class30.field709 = 20;
            field265 = 40;
        } else if (field265 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2084.method2977() * 4 / 100;
            int var8 = var7 + Statics.field677.method2977() * 4 / 100;
            int var9 = var8 + Statics.field2616.method2977() * 2 / 100;
            int var10 = var9 + Statics.field657.method2977() * 2 / 100;
            int var11 = var10 + Statics.field1527.method2977() * 6 / 100;
            int var12 = var11 + Statics.field2813.method2977() * 4 / 100;
            int var13 = var12 + Statics.field536.method2977() * 2 / 100;
            int var14 = var13 + Statics.field676.method2977() * 60 / 100;
            int var15 = var14 + Statics.field1843.method2977() * 2 / 100;
            int var16 = var15 + Statics.field924.method2977() * 2 / 100;
            int var17 = var16 + Statics.field205.method2977() * 2 / 100;
            int var18 = var17 + Statics.field1938.method2977() * 2 / 100;
            int var19 = var18 + Statics.field133.method2977() * 2 / 100;
            int var20 = var19 + Statics.field1160.method2977() * 2 / 100;
            int var21 = var20 + Statics.field1964.method2977() * 2 / 100;
            int var22 = var21 + Statics.field2543.method2977() * 2 / 100;
            if (var22 == 100) {
                class30.field706 = class148.field2229;
                class30.field709 = 30;
                field265 = 45;
            } else {
                if (var22 != 0) {
                    class30.field706 = class148.field2273 + var22 + "%";
                }
                class30.field709 = 30;
            }
        } else if (field265 == 45) {
            class52.method2017(22050, !field253, 2);
            class175 var23 = new class175();
            var23.method3254(9, 128);
            Statics.field823 = class52.method82(Statics.field1983, Statics.field1618, 0, 22050);
            Statics.field823.method1022(var23);
            class159 var24 = Statics.field2543;
            class159 var25 = Statics.field1964;
            class159 var26 = Statics.field1527;
            Statics.field2859 = var24;
            Statics.field2855 = var25;
            Statics.field2856 = var26;
            Statics.field2811 = var23;
            Statics.field2137 = class52.method82(Statics.field1983, Statics.field1618, 1, 2048);
            Statics.field127 = new class51();
            Statics.field2137.method1022(Statics.field127);
            Statics.field548 = new class70(22050, Statics.field1494);
            class30.field706 = class148.field2230;
            class30.field709 = 35;
            field265 = 50;
        } else if (field265 == 50) {
            int var27 = 0;
            if (Statics.field1965 == null) {
                Statics.field1965 = class72.method77(Statics.field1843, Statics.field1160, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field60 == null) {
                Statics.field60 = class72.method77(Statics.field1843, Statics.field1160, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field1900 == null) {
                Statics.field1900 = class72.method77(Statics.field1843, Statics.field1160, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class30.field706 = class148.field2266 + var27 * 100 / 3 + "%";
                class30.field709 = 40;
            } else {
                Statics.field1799 = new class151(true);
                class30.field706 = class148.field2324;
                class30.field709 = 40;
                field265 = 60;
            }
        } else if (field265 == 60) {
            int var28 = class30.method3113(Statics.field205, Statics.field1843);
            byte var29 = 8;
            if (var28 < var29) {
                class30.field706 = class148.field2475 + var28 * 100 / var29 + "%";
                class30.field709 = 50;
            } else {
                class30.field706 = class148.field2234;
                class30.field709 = 50;
                method521(5);
                field265 = 70;
            }
        } else if (field265 == 70) {
            if (Statics.field2616.method2900()) {
                class43.method139(Statics.field2616);
                class39.method130(Statics.field2616);
                class42.method3094(Statics.field2616, Statics.field676);
                class159 var31 = Statics.field2616;
                class159 var32 = Statics.field676;
                boolean var33 = field253;
                Statics.field888 = var31;
                Statics.field876 = var32;
                class38.field887 = var33;
                class159 var34 = Statics.field2616;
                class159 var35 = Statics.field676;
                Statics.field838 = var34;
                Statics.field835 = var35;
                class47.method162(Statics.field2616, Statics.field676, field262, Statics.field1965);
                class40.method587(Statics.field2616, Statics.field2084, Statics.field677);
                class41.method129(Statics.field2616, Statics.field676);
                class44.method635(Statics.field2616);
                Statics.method575(Statics.field2616);
                class164.method138(Statics.field657, Statics.field676, Statics.field1843, Statics.field1160);
                class46.method625(Statics.field2616);
                class45.method32(Statics.field2616);
                class30.field706 = class148.field2236;
                class30.field709 = 60;
                field265 = 80;
            } else {
                class30.field706 = class148.field2235 + Statics.field2616.method2980() + "%";
                class30.field709 = 60;
            }
        } else if (field265 == 80) {
            int var36 = 0;
            if (Statics.field1490 == null) {
                Statics.field1490 = class72.method1378(Statics.field1843, "compass", "");
            } else {
                var36++;
            }
            if (Statics.field61 == null) {
                Statics.field61 = class72.method1378(Statics.field1843, "mapedge", "");
            } else {
                var36++;
            }
            if (Statics.field2556 == null) {
                Statics.field2556 = class72.method582(Statics.field1843, "mapscene", "");
            } else {
                var36++;
            }
            if (Statics.field744 == null) {
                Statics.field744 = class72.method520(Statics.field1843, "mapfunction", "");
            } else {
                var36++;
            }
            if (Statics.field1556 == null) {
                Statics.field1556 = class72.method520(Statics.field1843, "hitmarks", "");
            } else {
                var36++;
            }
            if (Statics.field1702 == null) {
                Statics.field1702 = class72.method520(Statics.field1843, "headicons_pk", "");
            } else {
                var36++;
            }
            if (Statics.field248 == null) {
                Statics.field248 = class72.method520(Statics.field1843, "headicons_prayer", "");
            } else {
                var36++;
            }
            if (Statics.field761 == null) {
                Statics.field761 = class72.method520(Statics.field1843, "headicons_hint", "");
            } else {
                var36++;
            }
            if (Statics.field93 == null) {
                Statics.field93 = class72.method520(Statics.field1843, "mapmarker", "");
            } else {
                var36++;
            }
            if (Statics.field28 == null) {
                Statics.field28 = class72.method520(Statics.field1843, "cross", "");
            } else {
                var36++;
            }
            if (Statics.field2564 == null) {
                Statics.field2564 = class72.method520(Statics.field1843, "mapdots", "");
            } else {
                var36++;
            }
            if (Statics.field648 == null) {
                Statics.field648 = class72.method582(Statics.field1843, "scrollbar", "");
            } else {
                var36++;
            }
            if (Statics.field2073 == null) {
                Statics.field2073 = class72.method582(Statics.field1843, "mod_icons", "");
            } else {
                var36++;
            }
            if (var36 < 13) {
                class30.field706 = class148.field2237 + var36 * 100 / 13 + "%";
                class30.field709 = 70;
            } else {
                Statics.field3090 = Statics.field2073;
                Statics.field61.method1448();
                int var37 = (int) (Math.random() * 21.0D) - 10;
                int var38 = (int) (Math.random() * 21.0D) - 10;
                int var39 = (int) (Math.random() * 21.0D) - 10;
                int var40 = (int) (Math.random() * 41.0D) - 20;
                for (int var41 = 0; var41 < Statics.field744.length; var41++) {
                    Statics.field744[var41].method1447(var37 + var40, var38 + var40, var39 + var40);
                }
                Statics.field2556[0].method1597(var37 + var40, var38 + var40, var39 + var40);
                class30.field706 = class148.field2238;
                class30.field709 = 70;
                field265 = 90;
            }
        } else if (field265 == 90) {
            if (Statics.field924.method2900()) {
                class90 var42 = new class90(Statics.field924, Statics.field1843, 20, 0.8D, field253 ? 64 : 128);
                class86.method1808(var42);
                class86.method1875(0.8D);
                class30.field706 = class148.field2240;
                class30.field709 = 90;
                field265 = 110;
            } else {
                class30.field706 = class148.field2239 + Statics.field924.method2980() + "%";
                class30.field709 = 90;
            }
        } else if (field265 == 110) {
            Statics.field566 = new class13();
            Statics.field1983.method2547(Statics.field566, 10);
            class30.field706 = class148.field2241;
            class30.field709 = 94;
            field265 = 120;
        } else if (field265 == 120) {
            if (Statics.field205.method2914("huffman", "")) {
                class105 var43 = new class105(Statics.field205.method2945("huffman", ""));
                Statics.field3086 = var43;
                class30.field706 = class148.field2426;
                class30.field709 = 96;
                field265 = 130;
            } else {
                class30.field706 = class148.field2242 + "%";
                class30.field709 = 96;
            }
        } else if (field265 == 130) {
            if (!Statics.field657.method2900()) {
                class30.field706 = class148.field2344 + Statics.field657.method2980() * 4 / 5 + "%";
                class30.field709 = 100;
            } else if (!Statics.field133.method2900()) {
                class30.field706 = class148.field2344 + (80 + Statics.field133.method2980() / 6) + "%";
                class30.field709 = 100;
            } else if (Statics.field1160.method2900()) {
                class30.field706 = class148.field2402;
                class30.field709 = 100;
                field265 = 140;
            } else {
                class30.field706 = class148.field2344 + (96 + Statics.field1160.method2980() / 20) + "%";
                class30.field709 = 100;
            }
        } else if (field265 == 140) {
            method521(10);
        }
    }

    @ObfuscatedName("af.x(IZZZI)Lft;")
    public static class159 method676(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2146 != null) {
            var4 = new class126(arg0, class141.field2146, Statics.field2148[arg0], 1000000);
        }
        return new class159(var4, Statics.field284, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("p.o(B)V")
    public static final void method2() {
        try {
            if (field333 == 0) {
                if (Statics.field1622 != null) {
                    Statics.field1622.method2643();
                    Statics.field1622 = null;
                }
                Statics.field2560 = null;
                field311 = false;
                field292 = 0;
                field333 = 1;
            }
            if (field333 == 1) {
                if (Statics.field2560 == null) {
                    Statics.field2560 = Statics.field1983.method2546(Statics.field546, Statics.field295);
                }
                if (Statics.field2560.field2118 == 2) {
                    throw new IOException();
                }
                if (Statics.field2560.field2118 == 1) {
                    Statics.field1622 = new class135((Socket) Statics.field2560.field2125, Statics.field1983);
                    Statics.field2560 = null;
                    field333 = 2;
                }
            }
            if (field333 == 2) {
                field452.field1885 = 0;
                field452.method2160(14);
                Statics.field1622.method2658(field452.field1889, 0, 1);
                field302.field1885 = 0;
                field333 = 3;
            }
            if (field333 == 3) {
                if (Statics.field823 != null) {
                    Statics.field823.method1024();
                }
                if (Statics.field2137 != null) {
                    Statics.field2137.method1024();
                }
                int var0 = Statics.field1622.method2644();
                if (Statics.field823 != null) {
                    Statics.field823.method1024();
                }
                if (Statics.field2137 != null) {
                    Statics.field2137.method1024();
                }
                if (var0 != 0) {
                    method1060(var0);
                    return;
                }
                field302.field1885 = 0;
                field333 = 5;
            }
            if (field333 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field452.field1885 = 0;
                field452.method2160(1);
                field452.method2160(class30.field692.method484());
                field452.method2161(var1[0]);
                field452.method2161(var1[1]);
                field452.method2161(var1[2]);
                field452.method2161(var1[3]);
                switch(class30.field692.field2500) {
                    case 0:
                        field452.field1885 += 8;
                        break;
                    case 1:
                        field452.method2161((Integer) Statics.field71.field137.get(class154.method2014(class30.field711)));
                        field452.field1885 += 4;
                        break;
                    case 2:
                    case 3:
                        field452.method2260(Statics.field156);
                        field452.field1885 += 5;
                }
                field452.method2186(class30.field707);
                field452.method2195(class5.field69, class5.field70);
                field301.field1885 = 0;
                if (field460 == 40) {
                    field301.method2160(18);
                } else {
                    field301.method2160(16);
                }
                field301.method2365(0);
                int var2 = field301.field1885;
                field301.method2161(84);
                field301.method2227(field452.field1889, 0, field452.field1885);
                int var3 = field301.field1885;
                field301.method2186(class30.field711);
                field301.method2160((field441 ? 1 : 0) << 1 | (field253 ? 1 : 0));
                field301.method2365(Statics.field594);
                field301.method2365(Statics.field1958);
                class141.method3544(field301);
                field301.method2186(Statics.field1017);
                field301.method2161(Statics.field2570);
                class111 var4 = new class111(Statics.field1799.method2813());
                Statics.field1799.method2801(var4);
                field301.method2227(var4.field1889, 0, var4.field1889.length);
                field301.method2160(Statics.field2183);
                field301.method2161(Statics.field2084.field2588);
                field301.method2161(Statics.field677.field2588);
                field301.method2161(Statics.field2616.field2588);
                field301.method2161(Statics.field657.field2588);
                field301.method2161(Statics.field1527.field2588);
                field301.method2161(Statics.field2813.field2588);
                field301.method2161(Statics.field536.field2588);
                field301.method2161(Statics.field676.field2588);
                field301.method2161(Statics.field1843.field2588);
                field301.method2161(Statics.field924.field2588);
                field301.method2161(Statics.field205.field2588);
                field301.method2161(Statics.field1938.field2588);
                field301.method2161(Statics.field133.field2588);
                field301.method2161(Statics.field1160.field2588);
                field301.method2161(Statics.field1964.field2588);
                field301.method2161(Statics.field2543.field2588);
                field301.method2193(var1, var3, field301.field1885);
                field301.method2171(field301.field1885 - var2);
                Statics.field1622.method2658(field301.field1889, 0, field301.field1885);
                field452.method2417(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field302.method2417(var1);
                field333 = 6;
            }
            if (field333 == 6 && Statics.field1622.method2656() > 0) {
                int var6 = Statics.field1622.method2644();
                if (var6 == 21 && field460 == 20) {
                    field333 = 7;
                } else if (var6 == 2) {
                    field333 = 9;
                } else if (var6 == 15 && field460 == 40) {
                    field452.field1885 = 0;
                    field302.field1885 = 0;
                    field539 = -1;
                    field470 = -1;
                    field308 = -1;
                    field309 = -1;
                    field483 = 0;
                    field305 = 0;
                    field274 = 0;
                    field402 = 0;
                    field533 = false;
                    field498 = 0;
                    field418 = 0;
                    for (int var7 = 0; var7 < field479.length; var7++) {
                        if (field479[var7] != null) {
                            field479[var7].field794 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field535.length; var8++) {
                        if (field535[var8] != null) {
                            field535[var8].field794 = -1;
                        }
                    }
                    class15.method519();
                    method521(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field424[var9] = true;
                    }
                    field452.method2426(104);
                    class114 var10 = field452;
                    int var11 = field441 ? 2 : 1;
                    var10.method2160(var11);
                    field452.method2365(Statics.field594);
                    field452.method2365(Statics.field1958);
                    return;
                } else if (var6 == 23 && field293 < 1) {
                    field293++;
                    field333 = 0;
                } else if (var6 == 29) {
                    field333 = 11;
                } else {
                    method1060(var6);
                    return;
                }
            }
            if (field333 == 7 && Statics.field1622.method2656() > 0) {
                field296 = (Statics.field1622.method2644() + 3) * 60;
                field333 = 8;
            }
            if (field333 == 8) {
                field292 = 0;
                class30.method132(class148.field2249, class148.field2304, field296 / 60 + class148.field2337);
                if (--field296 <= 0) {
                    field333 = 0;
                }
            } else {
                if (field333 == 9 && Statics.field1622.method2656() >= 13) {
                    boolean var12 = Statics.field1622.method2644() == 1;
                    Statics.field1622.method2646(field302.field1889, 0, 4);
                    field302.field1885 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field302.method2419() << 24;
                        int var15 = var14 | field302.method2419() << 16;
                        int var16 = var15 | field302.method2419() << 8;
                        int var17 = var16 | field302.method2419();
                        int var18 = class154.method2014(class30.field711);
                        if (Statics.field71.field137.size() >= 10 && !Statics.field71.field137.containsKey(var18)) {
                            Iterator var19 = Statics.field71.field137.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field71.field137.put(var18, var17);
                        class9.method2816();
                    }
                    field427 = Statics.field1622.method2644();
                    field257 = Statics.field1622.method2644() == 1;
                    field384 = Statics.field1622.method2644();
                    field384 <<= 0x8;
                    field384 += Statics.field1622.method2644();
                    field385 = Statics.field1622.method2644();
                    Statics.field1622.method2646(field302.field1889, 0, 1);
                    field302.field1885 = 0;
                    field539 = field302.method2419();
                    Statics.field1622.method2646(field302.field1889, 0, 2);
                    field302.field1885 = 0;
                    field483 = field302.method2177();
                    if (field385 == 1) {
                        try {
                            client var20 = Statics.field254;
                            JSObject.getWindow(var20).call("zap", (Object[]) null);
                        } catch (Throwable var46) {
                        }
                    } else {
                        try {
                            client var22 = Statics.field254;
                            JSObject.getWindow(var22).call("unzap", (Object[]) null);
                        } catch (Throwable var45) {
                        }
                    }
                    field333 = 10;
                }
                if (field333 != 10) {
                    if (field333 == 11 && Statics.field1622.method2656() >= 2) {
                        field302.field1885 = 0;
                        Statics.field1622.method2646(field302.field1889, 0, 2);
                        field302.field1885 = 0;
                        Statics.field476 = field302.method2177();
                        field333 = 12;
                    }
                    if (field333 == 12 && Statics.field1622.method2656() >= Statics.field476) {
                        field302.field1885 = 0;
                        Statics.field1622.method2646(field302.field1889, 0, Statics.field476);
                        field302.field1885 = 0;
                        String var41 = field302.method2265();
                        String var42 = field302.method2265();
                        String var43 = field302.method2265();
                        class30.method132(var41, var42, var43);
                        method521(10);
                    }
                    field292++;
                    if (field292 > 2000) {
                        if (field293 < 1) {
                            if (Statics.field295 == Statics.field2489) {
                                Statics.field295 = Statics.field3021;
                            } else {
                                Statics.field295 = Statics.field2489;
                            }
                            field293++;
                            field333 = 0;
                        } else {
                            method1060(-3);
                        }
                    }
                } else if (Statics.field1622.method2656() >= field483) {
                    field302.field1885 = 0;
                    Statics.field1622.method2646(field302.field1889, 0, field483);
                    field268 = 1L;
                    field386 = -1;
                    Statics.field566.field191 = 0;
                    Statics.field575 = true;
                    field272 = true;
                    field488 = -1L;
                    class202.field3031 = new class193();
                    field452.field1885 = 0;
                    field302.field1885 = 0;
                    field539 = -1;
                    field470 = -1;
                    field308 = -1;
                    field309 = -1;
                    field305 = 0;
                    field274 = 0;
                    field310 = 0;
                    field275 = 0;
                    field402 = 0;
                    field533 = false;
                    class132.field2052 = 0;
                    Statics.method776();
                    field413 = 0;
                    field415 = false;
                    field504 = 0;
                    field323 = (int) (Math.random() * 100.0D) - 50;
                    field255 = (int) (Math.random() * 110.0D) - 55;
                    field327 = (int) (Math.random() * 80.0D) - 40;
                    field500 = (int) (Math.random() * 120.0D) - 60;
                    field332 = (int) (Math.random() * 30.0D) - 20;
                    field343 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field498 = 0;
                    field491 = -1;
                    field418 = 0;
                    field280 = 0;
                    field285 = class19.field550;
                    field289 = 0;
                    field298 = 0;
                    for (int var24 = 0; var24 < 2048; var24++) {
                        field479[var24] = null;
                        field383[var24] = null;
                    }
                    for (int var25 = 0; var25 < 32768; var25++) {
                        field535[var25] = null;
                    }
                    Statics.field734 = field479[2047] = new class3();
                    field392 = -1;
                    field395.method3445();
                    field294.method3445();
                    for (int var26 = 0; var26 < 4; var26++) {
                        for (int var27 = 0; var27 < 104; var27++) {
                            for (int var28 = 0; var28 < 104; var28++) {
                                field357[var26][var27][var28] = null;
                            }
                        }
                    }
                    field493 = new class190();
                    field530 = 0;
                    field446 = 0;
                    field401 = 0;
                    for (int var29 = 0; var29 < Statics.field2040; var29++) {
                        class48 var30 = class48.method843(var29);
                        if (var30 != null) {
                            class167.field2803[var29] = 0;
                            class167.field2804[var29] = 0;
                        }
                    }
                    for (int var31 = 0; var31 < field522.length; var31++) {
                        field522[var31] = -1;
                    }
                    field428 = -1;
                    if (field420 != -1) {
                        int var32 = field420;
                        if (var32 != -1 && Statics.field2643[var32]) {
                            Statics.field2644.method2968(var32);
                            if (Statics.field2642[var32] != null) {
                                boolean var33 = true;
                                for (int var34 = 0; var34 < Statics.field2642[var32].length; var34++) {
                                    if (Statics.field2642[var32][var34] != null) {
                                        if (Statics.field2642[var32][var34].field2654 == 2) {
                                            var33 = false;
                                        } else {
                                            Statics.field2642[var32][var34] = null;
                                        }
                                    }
                                }
                                if (var33) {
                                    Statics.field2642[var32] = null;
                                }
                                Statics.field2643[var32] = false;
                            }
                        }
                    }
                    for (class4 var35 = (class4) field421.method3412(); var35 != null; var35 = (class4) field421.method3410()) {
                        method2415(var35, true);
                    }
                    field420 = -1;
                    field421 = new class187(8);
                    field506 = null;
                    field533 = false;
                    field402 = 0;
                    field436.method3150((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var36 = 0; var36 < 8; var36++) {
                        field389[var36] = null;
                        field390[var36] = false;
                    }
                    class15.method519();
                    field266 = true;
                    for (int var37 = 0; var37 < 100; var37++) {
                        field424[var37] = true;
                    }
                    field452.method2426(104);
                    class114 var38 = field452;
                    int var39 = field441 ? 2 : 1;
                    var38.method2160(var39);
                    field452.method2365(Statics.field594);
                    field452.method2365(Statics.field1958);
                    field489 = null;
                    Statics.field56 = 0;
                    Statics.field1324 = null;
                    for (int var40 = 0; var40 < 8; var40++) {
                        field322[var40] = new class211();
                    }
                    Statics.field1708 = null;
                    Statics.field1800 = -1;
                    method1893(false);
                    field539 = -1;
                }
            }
        } catch (IOException var47) {
            if (field293 < 1) {
                if (Statics.field295 == Statics.field2489) {
                    Statics.field295 = Statics.field3021;
                } else {
                    Statics.field295 = Statics.field2489;
                }
                field293++;
                field333 = 0;
            } else {
                method1060(-2);
            }
        }
    }

    @ObfuscatedName("ax.r(IB)V")
    public static void method1060(int arg0) {
        if (arg0 == -3) {
            class30.method132(class148.field2320, class148.field2270, class148.field2252);
        } else if (arg0 == -2) {
            class30.method132(class148.field2255, class148.field2428, class148.field2257);
        } else if (arg0 == -1) {
            class30.method132(class148.field2409, class148.field2259, class148.field2413);
        } else if (arg0 == 3) {
            class30.method132(class148.field2280, class148.field2262, class148.field2476);
        } else if (arg0 == 4) {
            class30.method132(class148.field2264, class148.field2405, class148.field2401);
        } else if (arg0 == 5) {
            class30.method132(class148.field2267, class148.field2268, class148.field2276);
        } else if (arg0 == 6) {
            class30.method132(class148.field2309, class148.field2271, class148.field2272);
        } else if (arg0 == 7) {
            class30.method132(class148.field2447, class148.field2460, class148.field2458);
        } else if (arg0 == 8) {
            class30.method132(class148.field2308, class148.field2232, class148.field2423);
        } else if (arg0 == 9) {
            class30.method132(class148.field2279, class148.field2424, class148.field2281);
        } else if (arg0 == 10) {
            class30.method132(class148.field2282, class148.field2283, class148.field2284);
        } else if (arg0 == 11) {
            class30.method132(class148.field2285, class148.field2286, class148.field2287);
        } else if (arg0 == 12) {
            class30.method132(class148.field2288, class148.field2384, class148.field2290);
        } else if (arg0 == 13) {
            class30.method132(class148.field2291, class148.field2292, class148.field2356);
        } else if (arg0 == 14) {
            class30.method132(class148.field2294, class148.field2295, class148.field2296);
        } else if (arg0 == 16) {
            class30.method132(class148.field2297, class148.field2298, class148.field2299);
        } else if (arg0 == 17) {
            class30.method132(class148.field2414, class148.field2301, class148.field2274);
        } else if (arg0 == 18) {
            class30.method132(class148.field2303, class148.field2387, class148.field2305);
        } else if (arg0 == 19) {
            class30.method132(class148.field2306, class148.field2307, class148.field2247);
        } else if (arg0 == 20) {
            class30.method132(class148.field2346, class148.field2310, class148.field2311);
        } else if (arg0 == 22) {
            class30.method132(class148.field2312, class148.field2313, class148.field2314);
        } else if (arg0 == 23) {
            class30.method132(class148.field2317, class148.field2316, class148.field2216);
        } else if (arg0 == 24) {
            class30.method132(class148.field2318, class148.field2452, class148.field2258);
        } else if (arg0 == 25) {
            class30.method132(class148.field2321, class148.field2322, class148.field2479);
        } else if (arg0 == 26) {
            class30.method132(class148.field2443, class148.field2233, class148.field2326);
        } else if (arg0 == 27) {
            class30.method132(class148.field2327, class148.field2328, class148.field2329);
        } else if (arg0 == 31) {
            class30.method132(class148.field2336, class148.field2278, class148.field2420);
        } else if (arg0 == 32) {
            class30.method132(class148.field2339, class148.field2340, class148.field2341);
        } else if (arg0 == 37) {
            class30.method132(class148.field2342, class148.field2263, class148.field2243);
        } else if (arg0 == 38) {
            class30.method132(class148.field2345, class148.field2463, class148.field2461);
        } else if (arg0 == 55) {
            class30.method132(class148.field2348, class148.field2398, class148.field2350);
        } else if (arg0 == 56) {
            class30.method132(class148.field2223, class148.field2352, class148.field2251);
            method521(11);
            return;
        } else if (arg0 == 57) {
            class30.method132(class148.field2469, class148.field2355, class148.field2250);
            method521(11);
            return;
        } else {
            class30.method132(class148.field2357, class148.field2419, class148.field2359);
        }
        method521(10);
    }

    @ObfuscatedName("f.i(I)V")
    public static final void method31() {
        class43.field1009.method3374();
        class39.field928.method3374();
        class42.method722();
        class38.field877.method3374();
        class38.field878.method3374();
        class38.field879.method3374();
        class38.field922.method3374();
        class37.method619();
        class47.method38();
        class40.method3093();
        class41.method2639();
        class44.method4();
        Statics.method503();
        class170.method2830();
        class164.method2453();
        ((class90) Statics.field1507).method1897();
        class20.field556.method3374();
        Statics.field2084.method2909();
        Statics.field677.method2909();
        Statics.field657.method2909();
        Statics.field1527.method2909();
        Statics.field2813.method2909();
        Statics.field536.method2909();
        Statics.field676.method2909();
        Statics.field1843.method2909();
        Statics.field924.method2909();
        Statics.field205.method2909();
        Statics.field1938.method2909();
        Statics.field133.method2909();
    }

    @ObfuscatedName("w.q(I)V")
    public static final void method37() {
        if (field310 > 0) {
            Statics.method2465();
        } else {
            method521(40);
            Statics.field2127 = Statics.field1622;
            Statics.field1622 = null;
        }
    }

    @ObfuscatedName("ed.g(B)V")
    public static final void method2769() {
        if (Statics.field2137 != null) {
            Statics.field2137.method1023();
        }
        if (Statics.field823 != null) {
            Statics.field823.method1023();
        }
    }

    @ObfuscatedName("cu.l(I)V")
    public static final void method1625() {
        for (int var0 = 0; var0 < field504; var0++) {
            int var10002 = field507[var0]--;
            if (field507[var0] >= -10) {
                class54 var2 = field509[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method1082(Statics.field1527, field505[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field507[var0] += var2.method1076();
                    field509[var0] = var2;
                }
                if (field507[var0] < 0) {
                    int var9;
                    if (field508[var0] == 0) {
                        var9 = field502;
                    } else {
                        int var3 = (field508[var0] & 0xFF) * 128;
                        int var4 = field508[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field734.field773;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field508[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field734.field775;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field507[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field422 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class58 var10 = var2.method1075().method1114(Statics.field548);
                        class60 var11 = class60.method1137(var10, 100, var9);
                        var11.method1140(field325[var0] - 1);
                        Statics.field127.method1006(var11);
                    }
                    field507[var0] = -100;
                }
            } else {
                field504--;
                for (int var1 = var0; var1 < field504; var1++) {
                    field505[var1] = field505[var1 + 1];
                    field509[var1] = field509[var1 + 1];
                    field325[var1] = field325[var1 + 1];
                    field507[var1] = field507[var1 + 1];
                    field508[var1] = field508[var1 + 1];
                }
                var0--;
            }
        }
        if (!field501) {
            return;
        }
        boolean var12;
        if (class174.field2858 == 0) {
            var12 = Statics.field2811.method3253();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field499 != 0 && field300 != -1) {
                class174.method562(Statics.field536, field300, 0, field499, false);
            }
            field501 = false;
        }
    }

    @ObfuscatedName("ga.u(Law;IIII)V")
    public static void method3546(class40 arg0, int arg1, int arg2, int arg3) {
        if (field504 >= 50 || field422 == 0 || arg0.field946 == null || arg1 >= arg0.field946.length) {
            return;
        }
        int var4 = arg0.field946[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field505[field504] = var5;
        field325[field504] = var6;
        field507[field504] = 0;
        field509[field504] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field508[field504] = (var8 << 16) + (var9 << 8) + var7;
        field504++;
    }

    @ObfuscatedName("s.j(IIII)V")
    public static void method75(int arg0, int arg1, int arg2) {
        if (field502 == 0 || arg1 == 0 || field504 >= 50) {
            return;
        }
        field505[field504] = arg0;
        field325[field504] = arg1;
        field507[field504] = arg2;
        field509[field504] = null;
        field508[field504] = 0;
        field504++;
    }

    @ObfuscatedName("c.b(I)V")
    public static final void method78() {
        int var0 = Statics.field227 * 128 + 64;
        int var1 = Statics.field1798 * 128 + 64;
        int var2 = method3178(var0, var1, Statics.field1818) - Statics.field1926;
        if (Statics.field175 < var0) {
            Statics.field175 += Statics.field2801 * (var0 - Statics.field175) / 1000 + Statics.field1027;
            if (Statics.field175 > var0) {
                Statics.field175 = var0;
            }
        }
        if (Statics.field175 > var0) {
            Statics.field175 -= Statics.field2801 * (Statics.field175 - var0) / 1000 + Statics.field1027;
            if (Statics.field175 < var0) {
                Statics.field175 = var0;
            }
        }
        if (Statics.field1924 < var2) {
            Statics.field1924 += Statics.field2801 * (var2 - Statics.field1924) / 1000 + Statics.field1027;
            if (Statics.field1924 > var2) {
                Statics.field1924 = var2;
            }
        }
        if (Statics.field1924 > var2) {
            Statics.field1924 -= Statics.field2801 * (Statics.field1924 - var2) / 1000 + Statics.field1027;
            if (Statics.field1924 < var2) {
                Statics.field1924 = var2;
            }
        }
        if (Statics.field962 < var1) {
            Statics.field962 += Statics.field2801 * (var1 - Statics.field962) / 1000 + Statics.field1027;
            if (Statics.field962 > var1) {
                Statics.field962 = var1;
            }
        }
        if (Statics.field962 > var1) {
            Statics.field962 -= Statics.field2801 * (Statics.field962 - var1) / 1000 + Statics.field1027;
            if (Statics.field962 < var1) {
                Statics.field962 = var1;
            }
        }
        int var3 = Statics.field51 * 128 + 64;
        int var4 = Statics.field725 * 128 + 64;
        int var5 = method3178(var3, var4, Statics.field1818) - Statics.field1528;
        int var6 = var3 - Statics.field175;
        int var7 = var5 - Statics.field1924;
        int var8 = var4 - Statics.field962;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2562 < var10) {
            Statics.field2562 += Statics.field2896 * (var10 - Statics.field2562) / 1000 + Statics.field1317;
            if (Statics.field2562 > var10) {
                Statics.field2562 = var10;
            }
        }
        if (Statics.field2562 > var10) {
            Statics.field2562 -= Statics.field2896 * (Statics.field2562 - var10) / 1000 + Statics.field1317;
            if (Statics.field2562 < var10) {
                Statics.field2562 = var10;
            }
        }
        int var12 = var11 - Statics.field1567;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1567 += Statics.field2896 * var12 / 1000 + Statics.field1317;
            Statics.field1567 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1567 -= Statics.field2896 * -var12 / 1000 + Statics.field1317;
            Statics.field1567 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1567;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1567 = var11;
        }
    }

    @ObfuscatedName("x.a(I)V")
    public static final void method140() {
        int var0 = field323 + Statics.field734.field773;
        int var1 = field255 + Statics.field734.field775;
        if (Statics.field2069 - var0 < -500 || Statics.field2069 - var0 > 500 || Statics.field1059 - var1 < -500 || Statics.field1059 - var1 > 500) {
            Statics.field2069 = var0;
            Statics.field1059 = var1;
        }
        if (Statics.field2069 != var0) {
            Statics.field2069 += (var0 - Statics.field2069) / 16;
        }
        if (Statics.field1059 != var1) {
            Statics.field1059 += (var1 - Statics.field1059) / 16;
        }
        if (class132.field2049 == 4 && Statics.field2048) {
            int var2 = class132.field2051 - field448;
            field345 = var2 * 2;
            field448 = var2 == -1 || var2 == 1 ? class132.field2051 : (field448 + class132.field2051) / 2;
            int var3 = field467 - class132.field2050;
            field344 = var3 * 2;
            field467 = var3 == -1 || var3 == 1 ? class132.field2050 : (field467 + class132.field2050) / 2;
        } else {
            if (class129.field2012[96]) {
                field344 += (-24 - field344) / 2;
            } else if (class129.field2012[97]) {
                field344 += (24 - field344) / 2;
            } else {
                field344 /= 2;
            }
            if (class129.field2012[98]) {
                field345 += (12 - field345) / 2;
            } else if (class129.field2012[99]) {
                field345 += (-12 - field345) / 2;
            } else {
                field345 /= 2;
            }
            field448 = class132.field2051;
            field467 = class132.field2050;
        }
        field343 = field344 / 2 + field343 & 0x7FF;
        field319 += field345 / 2;
        if (field319 < 128) {
            field319 = 128;
        }
        if (field319 > 383) {
            field319 = 383;
        }
        int var4 = Statics.field2069 >> 7;
        int var5 = Statics.field1059 >> 7;
        int var6 = method3178(Statics.field2069, Statics.field1059, Statics.field1818);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1818;
                    if (var10 < 3 && (class6.field72[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field82[var10][var8][var9];
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
        if (var12 > field514) {
            field514 += (var12 - field514) / 24;
        } else if (var12 < field514) {
            field514 += (var12 - field514) / 80;
        }
    }

    @ObfuscatedName("v.ag(I)V")
    public static final void method106() {
        for (int var0 = -1; var0 < field289; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field286[var0];
            }
            class3 var2 = field479[var1];
            if (var2 != null) {
                method169(var2, 1);
            }
        }
    }

    @ObfuscatedName("v.am(I)V")
    public static final void method100() {
        for (int var0 = 0; var0 < field298; var0++) {
            int var1 = field278[var0];
            class32 var2 = field535[var1];
            if (var2 != null) {
                method169(var2, var2.field733.field840);
            }
        }
    }

    @ObfuscatedName("y.aa(Lau;IB)V")
    public static final void method169(class35 arg0, int arg1) {
        if (arg0.field809 > field267) {
            method2020(arg0);
        } else if (arg0.field810 >= field267) {
            method2462(arg0);
        } else {
            method2498(arg0);
        }
        if (arg0.field773 < 128 || arg0.field775 < 128 || arg0.field773 >= 13184 || arg0.field775 >= 13184) {
            arg0.field795 = -1;
            arg0.field800 = -1;
            arg0.field809 = 0;
            arg0.field810 = 0;
            arg0.field773 = arg0.field818[0] * 128 + arg0.field768 * 64;
            arg0.field775 = arg0.field814[0] * 128 + arg0.field768 * 64;
            arg0.method649();
        }
        if (Statics.field734 == arg0 && (arg0.field773 < 1536 || arg0.field775 < 1536 || arg0.field773 >= 11776 || arg0.field775 >= 11776)) {
            arg0.field795 = -1;
            arg0.field800 = -1;
            arg0.field809 = 0;
            arg0.field810 = 0;
            arg0.field773 = arg0.field818[0] * 128 + arg0.field768 * 64;
            arg0.field775 = arg0.field814[0] * 128 + arg0.field768 * 64;
            arg0.method649();
        }
        method63(arg0);
        method1353(arg0);
    }

    @ObfuscatedName("cw.az(Lau;I)V")
    public static final void method2020(class35 arg0) {
        int var1 = arg0.field809 - field267;
        int var2 = arg0.field805 * 128 + arg0.field768 * 64;
        int var3 = arg0.field784 * 128 + arg0.field768 * 64;
        arg0.field773 += (var2 - arg0.field773) / var1;
        arg0.field775 += (var3 - arg0.field775) / var1;
        arg0.field815 = 0;
        if (arg0.field811 == 0) {
            arg0.field813 = 1024;
        }
        if (arg0.field811 == 1) {
            arg0.field813 = 1536;
        }
        if (arg0.field811 == 2) {
            arg0.field813 = 0;
        }
        if (arg0.field811 == 3) {
            arg0.field813 = 512;
        }
    }

    @ObfuscatedName("dn.aq(Lau;I)V")
    public static final void method2462(class35 arg0) {
        if (field267 == arg0.field810 || arg0.field795 == -1 || arg0.field798 != 0 || arg0.field797 + 1 > class40.method678(arg0.field795).field947[arg0.field765]) {
            int var1 = arg0.field810 - arg0.field809;
            int var2 = field267 - arg0.field809;
            int var3 = arg0.field805 * 128 + arg0.field768 * 64;
            int var4 = arg0.field784 * 128 + arg0.field768 * 64;
            int var5 = arg0.field772 * 128 + arg0.field768 * 64;
            int var6 = arg0.field808 * 128 + arg0.field768 * 64;
            arg0.field773 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field775 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field815 = 0;
        if (arg0.field811 == 0) {
            arg0.field813 = 1024;
        }
        if (arg0.field811 == 1) {
            arg0.field813 = 1536;
        }
        if (arg0.field811 == 2) {
            arg0.field813 = 0;
        }
        if (arg0.field811 == 3) {
            arg0.field813 = 512;
        }
        arg0.field825 = arg0.field813;
    }

    @ObfuscatedName("dl.ak(Lau;B)V")
    public static final void method2498(class35 arg0) {
        arg0.field792 = arg0.field769;
        if (arg0.field817 == 0) {
            arg0.field815 = 0;
            return;
        }
        if (arg0.field795 != -1 && arg0.field798 == 0) {
            class40 var1 = class40.method678(arg0.field795);
            if (arg0.field822 > 0 && var1.field956 == 0) {
                arg0.field815++;
                return;
            }
            if (arg0.field822 <= 0 && var1.field941 == 0) {
                arg0.field815++;
                return;
            }
        }
        int var2 = arg0.field773;
        int var3 = arg0.field775;
        int var4 = arg0.field818[arg0.field817 - 1] * 128 + arg0.field768 * 64;
        int var5 = arg0.field814[arg0.field817 - 1] * 128 + arg0.field768 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field773 = var4;
            arg0.field775 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field813 = 1280;
            } else if (var3 > var5) {
                arg0.field813 = 1792;
            } else {
                arg0.field813 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field813 = 768;
            } else if (var3 > var5) {
                arg0.field813 = 256;
            } else {
                arg0.field813 = 512;
            }
        } else if (var3 < var5) {
            arg0.field813 = 1024;
        } else if (var3 > var5) {
            arg0.field813 = 0;
        }
        int var6 = arg0.field813 - arg0.field825 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field806;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field783;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field812;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field774;
        }
        if (var7 == -1) {
            var7 = arg0.field783;
        }
        arg0.field792 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class32) {
            var9 = ((class32) arg0).field733.field857;
        }
        if (var9) {
            if (arg0.field825 != arg0.field813 && arg0.field794 == -1 && arg0.field816 != 0) {
                var8 = 2;
            }
            if (arg0.field817 > 2) {
                var8 = 6;
            }
            if (arg0.field817 > 3) {
                var8 = 8;
            }
            if (arg0.field815 > 0 && arg0.field817 > 1) {
                var8 = 8;
                arg0.field815--;
            }
        } else {
            if (arg0.field817 > 1) {
                var8 = 6;
            }
            if (arg0.field817 > 2) {
                var8 = 8;
            }
            if (arg0.field815 > 0 && arg0.field817 > 1) {
                var8 = 8;
                arg0.field815--;
            }
        }
        if (arg0.field820[arg0.field817 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field792 == arg0.field783 && arg0.field776 != -1) {
            arg0.field792 = arg0.field776;
        }
        if (var2 < var4) {
            arg0.field773 += var8;
            if (arg0.field773 > var4) {
                arg0.field773 = var4;
            }
        } else if (var2 > var4) {
            arg0.field773 -= var8;
            if (arg0.field773 < var4) {
                arg0.field773 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field775 += var8;
            if (arg0.field775 > var5) {
                arg0.field775 = var5;
            }
        } else if (var3 > var5) {
            arg0.field775 -= var8;
            if (arg0.field775 < var5) {
                arg0.field775 = var5;
            }
        }
        if (arg0.field773 == var4 && arg0.field775 == var5) {
            arg0.field817--;
            if (arg0.field822 > 0) {
                arg0.field822--;
            }
        }
    }

    @ObfuscatedName("t.ar(Lau;I)V")
    public static final void method63(class35 arg0) {
        if (arg0.field816 == 0) {
            return;
        }
        if (arg0.field794 != -1 && arg0.field794 < 32768) {
            class32 var1 = field535[arg0.field794];
            if (var1 != null) {
                int var2 = arg0.field773 - var1.field773;
                int var3 = arg0.field775 - var1.field775;
                if (var2 != 0 || var3 != 0) {
                    arg0.field813 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field794 >= 32768) {
            int var4 = arg0.field794 - 32768;
            if (field384 == var4) {
                var4 = 2047;
            }
            class3 var5 = field479[var4];
            if (var5 != null) {
                int var6 = arg0.field773 - var5.field773;
                int var7 = arg0.field775 - var5.field775;
                if (var6 != 0 || var7 != 0) {
                    arg0.field813 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field790 != 0 || arg0.field791 != 0) && (arg0.field817 == 0 || arg0.field815 > 0)) {
            int var8 = arg0.field773 - (arg0.field790 * 64 - Statics.field193 * 64 - Statics.field193 * 64);
            int var9 = arg0.field775 - (arg0.field791 * 64 - Statics.field948 * 64 - Statics.field948 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field813 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field790 = 0;
            arg0.field791 = 0;
        }
        int var10 = arg0.field813 - arg0.field825 & 0x7FF;
        if (var10 == 0) {
            arg0.field819 = 0;
            return;
        }
        arg0.field819++;
        if (var10 > 1024) {
            arg0.field825 -= arg0.field816;
            boolean var11 = true;
            if (var10 < arg0.field816 || var10 > 2048 - arg0.field816) {
                arg0.field825 = arg0.field813;
                var11 = false;
            }
            if (arg0.field792 == arg0.field769 && (arg0.field819 > 25 || var11)) {
                if (arg0.field807 == -1) {
                    arg0.field792 = arg0.field783;
                } else {
                    arg0.field792 = arg0.field807;
                }
            }
        } else {
            arg0.field825 += arg0.field816;
            boolean var12 = true;
            if (var10 < arg0.field816 || var10 > 2048 - arg0.field816) {
                arg0.field825 = arg0.field813;
                var12 = false;
            }
            if (arg0.field792 == arg0.field769 && (arg0.field819 > 25 || var12)) {
                if (arg0.field771 == -1) {
                    arg0.field792 = arg0.field783;
                } else {
                    arg0.field792 = arg0.field771;
                }
            }
        }
        arg0.field825 &= 0x7FF;
    }

    @ObfuscatedName("bd.al(Lau;I)V")
    public static final void method1353(class35 arg0) {
        arg0.field767 = false;
        if (arg0.field792 != -1) {
            class40 var1 = class40.method678(arg0.field792);
            if (var1 == null || var1.field945 == null) {
                arg0.field792 = -1;
            } else {
                arg0.field766++;
                if (arg0.field793 < var1.field945.length && arg0.field766 > var1.field947[arg0.field793]) {
                    arg0.field766 = 1;
                    arg0.field793++;
                    method3546(var1, arg0.field793, arg0.field773, arg0.field775);
                }
                if (arg0.field793 >= var1.field945.length) {
                    arg0.field766 = 0;
                    arg0.field793 = 0;
                    method3546(var1, arg0.field793, arg0.field773, arg0.field775);
                }
            }
        }
        if (arg0.field800 != -1 && field267 >= arg0.field803) {
            if (arg0.field796 < 0) {
                arg0.field796 = 0;
            }
            int var2 = class41.method2637(arg0.field800).field969;
            if (var2 == -1) {
                arg0.field800 = -1;
            } else {
                class40 var3 = class40.method678(var2);
                if (var3 == null || var3.field945 == null) {
                    arg0.field800 = -1;
                } else {
                    arg0.field802++;
                    if (arg0.field796 < var3.field945.length && arg0.field802 > var3.field947[arg0.field796]) {
                        arg0.field802 = 1;
                        arg0.field796++;
                        method3546(var3, arg0.field796, arg0.field773, arg0.field775);
                    }
                    if (arg0.field796 >= var3.field945.length && (arg0.field796 < 0 || arg0.field796 >= var3.field945.length)) {
                        arg0.field800 = -1;
                    }
                }
            }
        }
        if (arg0.field795 != -1 && arg0.field798 <= 1) {
            class40 var4 = class40.method678(arg0.field795);
            if (var4.field956 == 1 && arg0.field822 > 0 && arg0.field809 <= field267 && arg0.field810 < field267) {
                arg0.field798 = 1;
                return;
            }
        }
        if (arg0.field795 != -1 && arg0.field798 == 0) {
            class40 var5 = class40.method678(arg0.field795);
            if (var5 == null || var5.field945 == null) {
                arg0.field795 = -1;
            } else {
                arg0.field797++;
                if (arg0.field765 < var5.field945.length && arg0.field797 > var5.field947[arg0.field765]) {
                    arg0.field797 = 1;
                    arg0.field765++;
                    method3546(var5, arg0.field765, arg0.field773, arg0.field775);
                }
                if (arg0.field765 >= var5.field945.length) {
                    arg0.field765 -= var5.field961;
                    arg0.field799++;
                    if (arg0.field799 >= var5.field955) {
                        arg0.field795 = -1;
                    } else if (arg0.field765 >= 0 && arg0.field765 < var5.field945.length) {
                        method3546(var5, arg0.field765, arg0.field773, arg0.field775);
                    } else {
                        arg0.field795 = -1;
                    }
                }
                arg0.field767 = var5.field951;
            }
        }
        if (arg0.field798 > 0) {
            arg0.field798--;
        }
    }

    @ObfuscatedName("ck.au(Le;III)V")
    public static void method2016(class3 arg0, int arg1, int arg2) {
        if (arg0.field795 == arg1 && arg1 != -1) {
            int var3 = class40.method678(arg1).field949;
            if (var3 == 1) {
                arg0.field765 = 0;
                arg0.field797 = 0;
                arg0.field798 = arg2;
                arg0.field799 = 0;
            }
            if (var3 == 2) {
                arg0.field799 = 0;
            }
        } else if (arg1 == -1 || arg0.field795 == -1 || class40.method678(arg1).field957 >= class40.method678(arg0.field795).field957) {
            arg0.field795 = arg1;
            arg0.field765 = 0;
            arg0.field797 = 0;
            arg0.field798 = arg2;
            arg0.field799 = 0;
            arg0.field822 = arg0.field817;
        }
    }

    @ObfuscatedName("ay.ao(I)V")
    public static void method848() {
        class129.method659(Statics.field1618);
        class132.method2461(Statics.field1618);
        if (Statics.field172 != null) {
            Statics.field172.method2513(Statics.field1618);
        }
        Statics.field254.method2669();
        Statics.field1618.setBackground(Color.black);
        class129.method2795(Statics.field1618);
        Canvas var0 = Statics.field1618;
        var0.addMouseListener(class132.field2060);
        var0.addMouseMotionListener(class132.field2060);
        var0.addFocusListener(class132.field2060);
        if (Statics.field172 != null) {
            Statics.field172.method2508(Statics.field1618);
        }
        if (field420 != -1) {
            int var1 = field420;
            int var2 = Statics.field594;
            int var3 = Statics.field1958;
            if (class164.method3121(var1)) {
                method17(Statics.field2642[var1], -1, var2, var3, false);
            }
        }
        field2107 = true;
    }

    @ObfuscatedName("q.af(I)V")
    public static void method480() {
        client var0 = Statics.field254;
        synchronized (Statics.field254) {
            Container var1 = Statics.field254.method2680();
            if (var1 != null) {
                Statics.field1521 = Math.max(var1.getSize().width, Statics.field737);
                Statics.field685 = Math.max(var1.getSize().height, Statics.field231);
                if (Statics.field1314 == var1) {
                    Insets var2 = Statics.field1314.getInsets();
                    Statics.field1521 -= var2.right + var2.left;
                    Statics.field685 -= var2.top + var2.bottom;
                }
                if (Statics.field1521 <= 0) {
                    Statics.field1521 = 1;
                }
                if (Statics.field685 <= 0) {
                    Statics.field685 = 1;
                }
                int var3 = field441 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field594 = field399 * 765;
                    Statics.field1958 = field478;
                } else {
                    Statics.field594 = Math.min(Statics.field1521, 7680);
                    Statics.field1958 = Math.min(Statics.field685, 2160);
                }
                field2114 = (Statics.field1521 - Statics.field594) / 2;
                field2104 = 0;
                Statics.field1618.setSize(Statics.field594, Statics.field1958);
                Statics.field1489 = class73.method2998(Statics.field594, Statics.field1958, Statics.field1618);
                if (Statics.field1314 == var1) {
                    Insets var4 = Statics.field1314.getInsets();
                    Statics.field1618.setLocation(field2114 + var4.left, field2104 + var4.top);
                } else {
                    Statics.field1618.setLocation(field2114, field2104);
                }
                int var5 = Statics.field594;
                int var6 = Statics.field1958;
                if (Statics.field1521 < var5) {
                    int var7 = Statics.field1521;
                }
                if (Statics.field685 < var6) {
                    int var8 = Statics.field685;
                }
                if (Statics.field71 != null) {
                    try {
                        client var9 = Statics.field254;
                        int var10 = field441 ? 2 : 1;
                        Object[] var11 = new Object[] { var10 };
                        JSObject.getWindow(var9).call("resize", var11);
                    } catch (Throwable var17) {
                    }
                }
                if (field420 != -1) {
                    int var13 = field420;
                    int var14 = Statics.field594;
                    int var15 = Statics.field1958;
                    if (class164.method3121(var13)) {
                        method17(Statics.field2642[var13], -1, var14, var15, true);
                    }
                }
                method1892();
            }
        }
    }

    @ObfuscatedName("cd.ai(I)V")
    public static void method1892() {
        int var0 = field2114;
        int var1 = field2104;
        int var2 = Statics.field1521 - Statics.field594 - var0;
        int var3 = Statics.field685 - Statics.field1958 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field254.method2680();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1314 == var4) {
                Insets var7 = Statics.field1314.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field685);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1521, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1521 + var5 - var2, var6, var2, Statics.field685);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field685 + var6 - var3, Statics.field1521, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ag.aj(I)V")
    public static final void method581() {
        if (field420 != -1) {
            method639(field420);
        }
        for (int var0 = 0; var0 < field465; var0++) {
            if (field424[var0]) {
                field468[var0] = true;
            }
            field469[var0] = field424[var0];
            field424[var0] = false;
        }
        field466 = field267;
        field409 = -1;
        field410 = -1;
        Statics.field1141 = null;
        if (field420 != -1) {
            field465 = 0;
            method2107(field420, 0, 0, Statics.field594, Statics.field1958, 0, 0, -1);
        }
        class75.method1552();
        if (field533) {
            int var1 = Statics.field564;
            int var2 = Statics.field2606;
            int var3 = Statics.field1035;
            int var4 = Statics.field2037;
            int var5 = 6116423;
            class75.method1532(var1, var2, var3, var4, var5);
            class75.method1532(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class75.method1542(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
            Statics.field1900.method3622(class148.field2366, var1 + 3, var2 + 14, var5, -1);
            int var6 = class132.field2050;
            int var7 = class132.field2051;
            for (int var8 = 0; var8 < field402; var8++) {
                int var9 = (field402 - 1 - var8) * 15 + var2 + 31;
                int var10 = 16777215;
                if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
                    var10 = 16776960;
                }
                Statics.field1900.method3622(method622(var8), var1 + 3, var9, var10, 0);
            }
            method2454(Statics.field564, Statics.field2606, Statics.field1035, Statics.field2037);
        } else if (field409 != -1) {
            method79(field409, field410);
        }
        if (field474 == 3) {
            for (int var11 = 0; var11 < field465; var11++) {
                if (field469[var11]) {
                    class75.method1557(field485[var11], field461[var11], field472[var11], field350[var11], 16711935, 128);
                } else if (field468[var11]) {
                    class75.method1557(field485[var11], field461[var11], field472[var11], field350[var11], 16711680, 128);
                }
            }
        }
        class22.method504(Statics.field1818, Statics.field734.field773, Statics.field734.field775, field335);
        field335 = 0;
    }

    @ObfuscatedName("fw.aw(Ljava/lang/String;ZI)V")
    public static final void method3099(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field60.method3627(arg0, 250);
        int var6 = Statics.field60.method3628(arg0, 250) * 13;
        class75.method1532(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1542(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field60.method3637(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2447(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2454(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1618.getGraphics();
            Statics.field1489.method1383(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1618.repaint();
        }
    }

    @ObfuscatedName("ev.ab(IIIIZI)V")
    public static final void method2799(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field517 - field515) * var5 / 100 + field515;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field382) {
            short var8 = field382;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field297) {
                var6 = field297;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class75.method1552();
                    class75.method1532(arg0, arg1, var10, arg3, -16777216);
                    class75.method1532(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field388) {
            short var11 = field388;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field330) {
                var6 = field330;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class75.method1552();
                    class75.method1532(arg0, arg1, arg2, var13, -16777216);
                    class75.method1532(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field528 = arg3 * var6 / 334 << 1;
        if (field526 != arg2 || field527 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < 9; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var18 = class86.field1519[var16];
                var14[var15] = var17 * var18 >> 16;
            }
            class81.method1662(var14, 500, 800, arg2, arg3);
        }
        field317 = arg0;
        field525 = arg1;
        field526 = arg2;
        field527 = arg3;
    }

    @ObfuscatedName("gz.ad(Laq;B)V")
    public static final void method3555(class31 arg0) {
        if (Statics.field734.field773 >> 7 == field418 && Statics.field734.field775 >> 7 == field280) {
            field418 = 0;
        }
        int var1 = field289;
        if (class31.field728 == arg0 || class31.field727 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field728 == arg0) {
                var3 = Statics.field734;
                var4 = 33538048;
            } else if (class31.field727 == arg0) {
                var3 = field479[field392];
                var4 = field392 << 14;
            } else {
                var3 = field479[field286[var2]];
                var4 = field286[var2] << 14;
                if (class31.field729 == arg0 && field392 == field286[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method18() && !var3.field50) {
                var3.field48 = false;
                if ((field253 && field289 > 50 || field289 > 200) && class31.field728 != arg0 && var3.field792 == var3.field769) {
                    var3.field48 = true;
                }
                int var5 = var3.field773 >> 7;
                int var6 = var3.field775 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field43 == null || field267 < var3.field38 || field267 >= var3.field32) {
                        if ((var3.field773 & 0x7F) == 64 && (var3.field775 & 0x7F) == 64) {
                            if (field362 == field361[var5][var6]) {
                                continue;
                            }
                            field361[var5][var6] = field362;
                        }
                        var3.field37 = method3178(var3.field773, var3.field775, Statics.field1818);
                        Statics.field189.method1638(Statics.field1818, var3.field773, var3.field775, var3.field37, 60, var3, var3.field825, var4, var3.field767);
                    } else {
                        var3.field48 = false;
                        var3.field37 = method3178(var3.field773, var3.field775, Statics.field1818);
                        Statics.field189.method1639(Statics.field1818, var3.field773, var3.field775, var3.field37, 60, var3, var3.field825, var4, var3.field31, var3.field41, var3.field46, var3.field42);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.ae(ZI)V")
    public static final void method3129(boolean arg0) {
        for (int var1 = 0; var1 < field298; var1++) {
            class32 var2 = field535[field278[var1]];
            int var3 = (field278[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field733.field859 == arg0 && var2.field733.method663()) {
                int var4 = var2.field773 >> 7;
                int var5 = var2.field775 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field768 == 1 && (var2.field773 & 0x7F) == 64 && (var2.field775 & 0x7F) == 64) {
                        if (field362 == field361[var4][var5]) {
                            continue;
                        }
                        field361[var4][var5] = field362;
                    }
                    if (!var2.field733.field872) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field189.method1638(Statics.field1818, var2.field773, var2.field775, method3178(var2.field773 + (var2.field768 * 64 - 64), var2.field775 + (var2.field768 * 64 - 64), Statics.field1818), var2.field768 * 64 - 64 + 60, var2, var2.field825, var3, var2.field767);
                }
            }
        }
    }

    @ObfuscatedName("ci.ay(I)V")
    public static final void method1799() {
        for (class7 var0 = (class7) field395.method3442(); var0 != null; var0 = (class7) field395.method3444()) {
            if (Statics.field1818 != var0.field101 || field267 > var0.field118) {
                var0.method3533();
            } else if (field267 >= var0.field100) {
                if (var0.field104 > 0) {
                    class32 var1 = field535[var0.field104 - 1];
                    if (var1 != null && var1.field773 >= 0 && var1.field773 < 13312 && var1.field775 >= 0 && var1.field775 < 13312) {
                        var0.method73(var1.field773, var1.field775, method3178(var1.field773, var1.field775, var0.field101) - var0.field99, field267);
                    }
                }
                if (var0.field104 < 0) {
                    int var2 = -var0.field104 - 1;
                    class3 var3;
                    if (field384 == var2) {
                        var3 = Statics.field734;
                    } else {
                        var3 = field479[var2];
                    }
                    if (var3 != null && var3.field773 >= 0 && var3.field773 < 13312 && var3.field775 >= 0 && var3.field775 < 13312) {
                        var0.method73(var3.field773, var3.field775, method3178(var3.field773, var3.field775, var0.field101) - var0.field99, field267);
                    }
                }
                var0.method66(field335);
                Statics.field189.method1638(Statics.field1818, (int) var0.field106, (int) var0.field107, (int) var0.field108, 60, var0, var0.field114, -1, false);
            }
        }
    }

    @ObfuscatedName("ds.ap(III)V")
    public static final void method2475(int arg0, int arg1) {
        if (field275 == 2) {
            method655((field346 - Statics.field193 << 7) + field471, (field279 - Statics.field948 << 7) + field282, field328 * 2);
            if (field363 > -1 && field267 % 20 < 10) {
                Statics.field761[0].method1455(field363 + arg0 - 12, field364 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ci.av(Lau;IIIIIB)V")
    public static final void method1800(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field733;
            if (var6.field864 != null) {
                var6 = var6.method662();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field289) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field50) {
                return;
            }
            if (var8.field33 != -1 || var8.field34 != -1) {
                method516(arg0, arg0.field770 + 15);
                if (field363 > -1) {
                    if (var8.field33 != -1) {
                        Statics.field1702[var8.field33].method1455(field363 + arg2 - 12, field364 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field34 != -1) {
                        Statics.field248[var8.field34].method1455(field363 + arg2 - 12, field364 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field275 == 10 && field277 == field286[arg1]) {
                method516(arg0, arg0.field770 + 15);
                if (field363 > -1) {
                    Statics.field761[1].method1455(field363 + arg2 - 12, field364 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field733;
            if (var9.field864 != null) {
                var9 = var9.method662();
            }
            if (var9.field862 >= 0 && var9.field862 < Statics.field248.length) {
                method516(arg0, arg0.field770 + 15);
                if (field363 > -1) {
                    Statics.field248[var9.field862].method1455(field363 + arg2 - 12, field364 + arg3 - 30);
                }
            }
            if (field275 == 1 && field276 == field278[arg1 - field289] && field267 % 20 < 10) {
                method516(arg0, arg0.field770 + 15);
                if (field363 > -1) {
                    Statics.field761[0].method1455(field363 + arg2 - 12, field364 + arg3 - 28);
                }
            }
        }
        if (arg0.field777 != null && (arg1 >= field289 || !arg0.field779 && (field480 == 4 || !arg0.field778 && (field480 == 0 || field480 == 3 || field480 == 1 && Statics.method849(((class3) arg0).field39, false))))) {
            method516(arg0, arg0.field770);
            if (field363 > -1 && field351 < field352) {
                field437[field351] = Statics.field1900.method3657(arg0.field777) / 2;
                field355[field351] = Statics.field1900.field3093;
                field353[field351] = field363;
                field354[field351] = field364;
                field356[field351] = arg0.field781;
                field358[field351] = arg0.field782;
                field520[field351] = arg0.field780;
                field299[field351] = arg0.field777;
                field351++;
            }
        }
        if (arg0.field764 > field267) {
            method516(arg0, arg0.field770 + 15);
            if (field363 > -1) {
                int var10;
                if (arg1 < field289) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field733;
                    var10 = var11.field870;
                }
                int var12 = arg0.field787 * var10 / arg0.field789;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field787 > 0) {
                    var12 = 1;
                }
                class75.method1532(field363 + arg2 - var10 / 2, field364 + arg3 - 3, var12, 5, 65280);
                class75.method1532(field363 + arg2 - var10 / 2 + var12, field364 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field801[var13] > field267) {
                method516(arg0, arg0.field770 / 2);
                if (field363 > -1) {
                    if (var13 == 1) {
                        field364 -= 20;
                    }
                    if (var13 == 2) {
                        field363 -= 15;
                        field364 -= 10;
                    }
                    if (var13 == 3) {
                        field363 += 15;
                        field364 -= 10;
                    }
                    Statics.field1556[arg0.field785[var13]].method1455(field363 + arg2 - 12, field364 + arg3 - 12);
                    Statics.field1965.method3632(Integer.toString(arg0.field821[var13]), field363 + arg2 - 1, field364 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("v.ah(IIIII)V")
    public static final void method102(int arg0, int arg1, int arg2, int arg3) {
        field351 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field298 + field289; var6++) {
            class35 var7;
            if (var6 == -1) {
                var7 = Statics.field734;
            } else if (var6 < field289) {
                var7 = field479[field286[var6]];
                if (field392 == field286[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field535[field278[var6 - field289]];
            }
            method1800(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1800(field479[field392], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field351; var8++) {
            int var9 = field353[var8];
            int var10 = field354[var8];
            int var11 = field437[var8];
            int var12 = field355[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field354[var14] - field355[var14] && var10 - var12 < field354[var14] + 2 && var9 - var11 < field437[var14] + field353[var14] && var9 + var11 > field353[var14] - field437[var14] && field354[var14] - field355[var14] < var10) {
                        var10 = field354[var14] - field355[var14];
                        var13 = true;
                    }
                }
            }
            field363 = field353[var8];
            field364 = field354[var8] = var10;
            String var15 = field299[var8];
            if (field429 == 0) {
                int var16 = 16776960;
                if (field356[var8] < 6) {
                    var16 = field512[field356[var8]];
                }
                if (field356[var8] == 6) {
                    var16 = field362 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field356[var8] == 7) {
                    var16 = field362 % 20 < 10 ? 255 : 65535;
                }
                if (field356[var8] == 8) {
                    var16 = field362 % 20 < 10 ? 45056 : 8454016;
                }
                if (field356[var8] == 9) {
                    int var17 = 150 - field520[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field356[var8] == 10) {
                    int var18 = 150 - field520[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field356[var8] == 11) {
                    int var19 = 150 - field520[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field358[var8] == 0) {
                    Statics.field1900.method3632(var15, field363 + arg0, field364 + arg1, var16, 0);
                }
                if (field358[var8] == 1) {
                    Statics.field1900.method3642(var15, field363 + arg0, field364 + arg1, var16, 0, field362);
                }
                if (field358[var8] == 2) {
                    Statics.field1900.method3635(var15, field363 + arg0, field364 + arg1, var16, 0, field362);
                }
                if (field358[var8] == 3) {
                    Statics.field1900.method3651(var15, field363 + arg0, field364 + arg1, var16, 0, field362, 150 - field520[var8]);
                }
                if (field358[var8] == 4) {
                    int var20 = (150 - field520[var8]) * (Statics.field1900.method3657(var15) + 100) / 150;
                    class75.method1535(field363 + arg0 - 50, arg1, field363 + arg0 + 50, arg1 + arg3);
                    Statics.field1900.method3622(var15, field363 + arg0 + 50 - var20, field364 + arg1, var16, 0);
                    class75.method1534(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field358[var8] == 5) {
                    int var21 = 150 - field520[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class75.method1535(arg0, field364 + arg1 - Statics.field1900.field3093 - 1, arg0 + arg2, field364 + arg1 + 5);
                    Statics.field1900.method3632(var15, field363 + arg0, field364 + arg1 + var22, var16, 0);
                    class75.method1534(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1900.method3632(var15, field363 + arg0, field364 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("gb.at(IIIII)V")
    public static final void method3564(int arg0, int arg1, int arg2, int arg3) {
        if (field324 == 1) {
            Statics.field28[field367 / 100].method1455(field365 - 8, field366 - 8);
        }
        if (field324 == 2) {
            Statics.field28[field367 / 100 + 4].method1455(field365 - 8, field366 - 8);
        }
        field377 = 0;
        int var4 = (Statics.field734.field773 >> 7) + Statics.field193;
        int var5 = (Statics.field734.field775 >> 7) + Statics.field948;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field377 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field377 = 1;
        }
        if (field377 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field377 = 0;
        }
    }

    @ObfuscatedName("u.an(Lau;IB)V")
    public static final void method516(class35 arg0, int arg1) {
        method655(arg0.field773, arg0.field775, arg1);
    }

    @ObfuscatedName("ao.ac(IIII)V")
    public static final void method655(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field363 = -1;
            field364 = -1;
            return;
        }
        int var3 = method3178(arg0, arg1, Statics.field1818) - arg2;
        int var4 = arg0 - Statics.field175;
        int var5 = var3 - Statics.field1924;
        int var6 = arg1 - Statics.field962;
        int var7 = class86.field1519[Statics.field2562];
        int var8 = class86.field1516[Statics.field2562];
        int var9 = class86.field1519[Statics.field1567];
        int var10 = class86.field1516[Statics.field1567];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field363 = field528 * var11 / var15 + field526 / 2;
            field364 = field528 * var14 / var15 + field527 / 2;
        } else {
            field363 = -1;
            field364 = -1;
        }
    }

    @ObfuscatedName("fp.as(IIII)I")
    public static final int method3178(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field72[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field82[var5][var3][var4] + class6.field82[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field82[var5][var3][var4 + 1] + class6.field82[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cd.ax(IIIIIII)V")
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class86.field1519[var6];
            int var12 = class86.field1516[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class86.field1519[var7];
            int var15 = class86.field1516[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field175 = arg0 - var8;
        Statics.field1924 = arg1 - var9;
        Statics.field962 = arg2 - var10;
        Statics.field2562 = arg3;
        Statics.field1567 = arg4;
    }

    @ObfuscatedName("cd.bg(ZB)V")
    public static final void method1893(boolean arg0) {
        field378 = arg0;
        if (!field378) {
            int var1 = field302.method2314();
            int var2 = (field483 - field302.field1885) / 16;
            Statics.field185 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field185[var3][var4] = field302.method2350();
                }
            }
            int var5 = field302.method2209();
            int var6 = field302.method2177();
            int var7 = field302.method2209();
            int var8 = field302.method2209();
            Statics.field161 = new int[var2];
            Statics.field736 = new int[var2];
            Statics.field53 = new int[var2];
            Statics.field680 = new byte[var2][];
            Statics.field960 = new byte[var2][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field161[var10] = var13;
                        Statics.field736[var10] = Statics.field2813.method2965("m" + var11 + "_" + var12);
                        Statics.field53[var10] = Statics.field2813.method2965("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2566(var7, var8, var1, var5, var6);
            return;
        }
        int var14 = field302.method2346();
        int var15 = field302.method2209();
        int var16 = field302.method2346();
        int var17 = field302.method2201();
        field302.method2424();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field302.method2420(1);
                    if (var21 == 1) {
                        field303[var18][var19][var20] = field302.method2420(26);
                    } else {
                        field303[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field302.method2421();
        int var22 = (field483 - field302.field1885) / 16;
        Statics.field185 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field185[var23][var24] = field302.method2350();
            }
        }
        int var25 = field302.method2209();
        Statics.field161 = new int[var22];
        Statics.field736 = new int[var22];
        Statics.field53 = new int[var22];
        Statics.field680 = new byte[var22][];
        Statics.field960 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field303[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field161[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field161[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field736[var26] = Statics.field2813.method2965("m" + var35 + "_" + var36);
                            Statics.field53[var26] = Statics.field2813.method2965("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2566(var14, var16, var17, var15, var25);
    }

    @ObfuscatedName("dd.bw(IIIIII)V")
    public static final void method2566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1800 == arg0 && Statics.field1948 == arg1 && field313 == arg2 || !field253) {
            return;
        }
        Statics.field1800 = arg0;
        Statics.field1948 = arg1;
        field313 = arg2;
        if (!field253) {
            field313 = 0;
        }
        method521(25);
        method3099(class148.field2222, true);
        int var5 = Statics.field193;
        int var6 = Statics.field948;
        Statics.field193 = (arg0 - 6) * 8;
        Statics.field948 = (arg1 - 6) * 8;
        int var7 = Statics.field193 - var5;
        int var8 = Statics.field948 - var6;
        int var9 = Statics.field193;
        int var10 = Statics.field948;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field535[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field818[var13] -= var7;
                    var12.field814[var13] -= var8;
                }
                var12.field773 -= var7 * 128;
                var12.field775 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field479[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field818[var16] -= var7;
                    var15.field814[var16] -= var8;
                }
                var15.field773 -= var7 * 128;
                var15.field775 -= var8 * 128;
            }
        }
        Statics.field1818 = arg2;
        Statics.field734.method641(arg3, arg4, false);
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
                        field357[var27][var23][var24] = field357[var27][var25][var26];
                    } else {
                        field357[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field493.method3442(); var28 != null; var28 = (class16) field493.method3444()) {
            var28.field229 -= var7;
            var28.field217 -= var8;
            if (var28.field229 < 0 || var28.field217 < 0 || var28.field229 >= 104 || var28.field217 >= 104) {
                var28.method3533();
            }
        }
        if (field418 != 0) {
            field418 -= var7;
            field280 -= var8;
        }
        field504 = 0;
        field510 = false;
        field491 = -1;
        field294.method3445();
        field395.method3445();
    }

    @ObfuscatedName("l.bn(ZB)V")
    public static final void method505(boolean arg0) {
        method2769();
        field306++;
        if (field306 < 50 && !arg0) {
            return;
        }
        field306 = 0;
        if (field311 || Statics.field1622 == null) {
            return;
        }
        field452.method2426(114);
        try {
            Statics.field1622.method2658(field452.field1889, 0, field452.field1885);
            field452.field1885 = 0;
        } catch (IOException var2) {
            field311 = true;
        }
    }

    @ObfuscatedName("d.by(B)V")
    public static final void method90() {
        method505(false);
        field444 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field680.length; var1++) {
            if (Statics.field736[var1] != -1 && Statics.field680[var1] == null) {
                Statics.field680[var1] = Statics.field2813.method2896(Statics.field736[var1], 0);
                if (Statics.field680[var1] == null) {
                    var0 = false;
                    field444++;
                }
            }
            if (Statics.field53[var1] != -1 && Statics.field960[var1] == null) {
                Statics.field960[var1] = Statics.field2813.method2972(Statics.field53[var1], 0, Statics.field185[var1]);
                if (Statics.field960[var1] == null) {
                    var0 = false;
                    field444++;
                }
            }
        }
        if (!var0) {
            field396 = 1;
            return;
        }
        field316 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field680.length; var3++) {
            byte[] var4 = Statics.field960[var3];
            if (var4 != null) {
                int var5 = (Statics.field161[var3] >> 8) * 64 - Statics.field193;
                int var6 = (Statics.field161[var3] & 0xFF) * 64 - Statics.field948;
                if (field378) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class111 var9 = new class111(var4);
                int var10 = -1;
                label537: while (true) {
                    int var11 = var9.method2188();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2188();
                            if (var16 == 0) {
                                continue label537;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2314() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class38 var22 = class38.method489(var10);
                                if (var19 != 22 || !field253 || var22.field894 != 0 || var22.field892 == 1 || var22.field889) {
                                    if (!var22.method685()) {
                                        field316++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2188();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2314();
                    }
                }
            }
        }
        if (!var2) {
            field396 = 2;
            return;
        }
        if (field396 != 0) {
            method3099(class148.field2222 + class2.field25 + class2.field23 + 100 + "%" + class2.field24, true);
        }
        method2769();
        method31();
        method2769();
        Statics.field189.method1744();
        method2769();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field531[var23].method3757();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field72[var24][var25][var26] = 0;
                }
            }
        }
        method2769();
        class6.field73 = 99;
        Statics.field89 = new byte[4][104][104];
        Statics.field75 = new byte[4][104][104];
        Statics.field76 = new byte[4][104][104];
        Statics.field3044 = new byte[4][104][104];
        Statics.field88 = new int[4][105][105];
        Statics.field2207 = new byte[4][105][105];
        Statics.field2180 = new int[105][105];
        Statics.field77 = new int[104];
        Statics.field131 = new int[104];
        Statics.field1315 = new int[104];
        Statics.field2799 = new int[104];
        Statics.field86 = new int[104];
        int var27 = Statics.field680.length;
        for (class22 var28 = (class22) class22.field586.method3442(); var28 != null; var28 = (class22) class22.field586.method3444()) {
            if (var28.field585 != null) {
                Statics.field127.method985(var28.field585);
                var28.field585 = null;
            }
            if (var28.field590 != null) {
                Statics.field127.method985(var28.field590);
                var28.field590 = null;
            }
        }
        class22.field586.method3445();
        method505(true);
        if (!field378) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field161[var29] >> 8) * 64 - Statics.field193;
                int var31 = (Statics.field161[var29] & 0xFF) * 64 - Statics.field948;
                byte[] var32 = Statics.field680[var29];
                if (var32 != null) {
                    method2769();
                    class6.method2106(var32, var30, var31, Statics.field1800 * 8 - 48, Statics.field1948 * 8 - 48, field531);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field161[var33] >> 8) * 64 - Statics.field193;
                int var35 = (Statics.field161[var33] & 0xFF) * 64 - Statics.field948;
                byte[] var36 = Statics.field680[var33];
                if (var36 == null && Statics.field1948 < 800) {
                    method2769();
                    class6.method1098(var34, var35, 64, 64);
                }
            }
            method505(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field960[var37];
                if (var38 != null) {
                    int var39 = (Statics.field161[var37] >> 8) * 64 - Statics.field193;
                    int var40 = (Statics.field161[var37] & 0xFF) * 64 - Statics.field948;
                    method2769();
                    class6.method884(var38, var39, var40, Statics.field189, field531);
                }
            }
        }
        if (field378) {
            for (int var41 = 0; var41 < 4; var41++) {
                method2769();
                for (int var42 = 0; var42 < 13; var42++) {
                    for (int var43 = 0; var43 < 13; var43++) {
                        boolean var44 = false;
                        int var45 = field303[var41][var42][var43];
                        if (var45 != -1) {
                            int var46 = var45 >> 24 & 0x3;
                            int var47 = var45 >> 1 & 0x3;
                            int var48 = var45 >> 14 & 0x3FF;
                            int var49 = var45 >> 3 & 0x7FF;
                            int var50 = (var48 / 8 << 8) + var49 / 8;
                            for (int var51 = 0; var51 < Statics.field161.length; var51++) {
                                if (Statics.field161[var51] == var50 && Statics.field680[var51] != null) {
                                    byte[] var52 = Statics.field680[var51];
                                    int var53 = var42 * 8;
                                    int var54 = var43 * 8;
                                    int var55 = (var48 & 0x7) * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    class220[] var57 = field531;
                                    for (int var58 = 0; var58 < 8; var58++) {
                                        for (int var59 = 0; var59 < 8; var59++) {
                                            if (var53 + var58 > 0 && var53 + var58 < 103 && var54 + var59 > 0 && var54 + var59 < 103) {
                                                var57[var41].field3130[var53 + var58][var54 + var59] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class111 var60 = new class111(var52);
                                    for (int var61 = 0; var61 < 4; var61++) {
                                        for (int var62 = 0; var62 < 64; var62++) {
                                            for (int var63 = 0; var63 < 64; var63++) {
                                                if (var46 == var61 && var62 >= var55 && var62 < var55 + 8 && var63 >= var56 && var63 < var56 + 8) {
                                                    class6.method2597(var60, var41, var53 + class168.method105(var62 & 0x7, var63 & 0x7, var47), var54 + class168.method2797(var62 & 0x7, var63 & 0x7, var47), 0, 0, var47);
                                                } else {
                                                    class6.method2597(var60, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var44 = true;
                                    break;
                                }
                            }
                        }
                        if (!var44) {
                            int var64 = var41;
                            int var65 = var42 * 8;
                            int var66 = var43 * 8;
                            for (int var67 = 0; var67 < 8; var67++) {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    class6.field82[var64][var65 + var67][var66 + var68] = 0;
                                }
                            }
                            if (var65 > 0) {
                                for (int var69 = 1; var69 < 8; var69++) {
                                    class6.field82[var64][var65][var66 + var69] = class6.field82[var64][var65 - 1][var66 + var69];
                                }
                            }
                            if (var66 > 0) {
                                for (int var70 = 1; var70 < 8; var70++) {
                                    class6.field82[var64][var65 + var70][var66] = class6.field82[var64][var65 + var70][var66 - 1];
                                }
                            }
                            if (var65 > 0 && class6.field82[var64][var65 - 1][var66] != 0) {
                                class6.field82[var64][var65][var66] = class6.field82[var64][var65 - 1][var66];
                            } else if (var66 > 0 && class6.field82[var64][var65][var66 - 1] != 0) {
                                class6.field82[var64][var65][var66] = class6.field82[var64][var65][var66 - 1];
                            } else if (var65 > 0 && var66 > 0 && class6.field82[var64][var65 - 1][var66 - 1] != 0) {
                                class6.field82[var64][var65][var66] = class6.field82[var64][var65 - 1][var66 - 1];
                            }
                        }
                    }
                }
            }
            for (int var71 = 0; var71 < 13; var71++) {
                for (int var72 = 0; var72 < 13; var72++) {
                    int var73 = field303[0][var71][var72];
                    if (var73 == -1) {
                        class6.method1098(var71 * 8, var72 * 8, 8, 8);
                    }
                }
            }
            method505(true);
            for (int var74 = 0; var74 < 4; var74++) {
                method2769();
                for (int var75 = 0; var75 < 13; var75++) {
                    for (int var76 = 0; var76 < 13; var76++) {
                        int var77 = field303[var74][var75][var76];
                        if (var77 != -1) {
                            int var78 = var77 >> 24 & 0x3;
                            int var79 = var77 >> 1 & 0x3;
                            int var80 = var77 >> 14 & 0x3FF;
                            int var81 = var77 >> 3 & 0x7FF;
                            int var82 = (var80 / 8 << 8) + var81 / 8;
                            for (int var83 = 0; var83 < Statics.field161.length; var83++) {
                                if (Statics.field161[var83] == var82 && Statics.field960[var83] != null) {
                                    class6.method3363(Statics.field960[var83], var74, var75 * 8, var76 * 8, var78, (var80 & 0x7) * 8, (var81 & 0x7) * 8, var79, Statics.field189, field531);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method505(true);
        method31();
        method2769();
        class6.method27(Statics.field189, field531);
        method505(true);
        int var84 = class6.field73;
        if (var84 > Statics.field1818) {
            var84 = Statics.field1818;
        }
        if (var84 < Statics.field1818 - 1) {
            int var85 = Statics.field1818 - 1;
        }
        if (field253) {
            Statics.field189.method1765(class6.field73);
        } else {
            Statics.field189.method1765(0);
        }
        for (int var86 = 0; var86 < 104; var86++) {
            for (int var87 = 0; var87 < 104; var87++) {
                method2668(var86, var87);
            }
        }
        method2769();
        for (class16 var88 = (class16) field493.method3442(); var88 != null; var88 = (class16) field493.method3444()) {
            if (var88.field225 == -1) {
                var88.field224 = 0;
                method168(var88);
            } else {
                var88.method3533();
            }
        }
        class38.field878.method3374();
        if (Statics.field1314 != null) {
            field452.method2426(202);
            field452.method2161(1057001181);
        }
        if (!field378) {
            int var89 = (Statics.field1800 - 6) / 8;
            int var90 = (Statics.field1800 + 6) / 8;
            int var91 = (Statics.field1948 - 6) / 8;
            int var92 = (Statics.field1948 + 6) / 8;
            for (int var93 = var89 - 1; var93 <= var90 + 1; var93++) {
                for (int var94 = var91 - 1; var94 <= var92 + 1; var94++) {
                    if (var93 < var89 || var93 > var90 || var94 < var91 || var94 > var92) {
                        Statics.field2813.method2940("m" + var93 + "_" + var94);
                        Statics.field2813.method2940("l" + var93 + "_" + var94);
                    }
                }
            }
        }
        method521(30);
        method2769();
        class6.method3244();
        field452.method2426(125);
        Statics.field2802.method2519();
        for (int var95 = 0; var95 < 32; var95++) {
            field2101[var95] = 0L;
        }
        for (int var96 = 0; var96 < 32; var96++) {
            field2106[var96] = 0L;
        }
        Statics.field29 = 0;
    }

    @ObfuscatedName("k.bb(IIIIIS)V")
    public static final void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field189.method1653(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field189.method1657(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field17.field1344;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method489(var12);
            if (var13.field904 == -1) {
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
                class76 var14 = Statics.field2556[var13.field904];
                if (var14 != null) {
                    int var15 = (var13.field890 * 4 - var14.field1359) / 2;
                    int var16 = (var13.field910 * 4 - var14.field1362) / 2;
                    var14.method1598(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field910) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field189.method1655(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field189.method1657(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method489(var21);
            if (var22.field904 != -1) {
                class76 var23 = Statics.field2556[var22.field904];
                if (var23 != null) {
                    int var24 = (var22.field890 * 4 - var23.field1359) / 2;
                    int var25 = (var22.field910 * 4 - var23.field1362) / 2;
                    var23.method1598(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field910) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field17.field1344;
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
        int var29 = Statics.field189.method1656(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method489(var30);
        if (var31.field904 == -1) {
            return;
        }
        class76 var32 = Statics.field2556[var31.field904];
        if (var32 != null) {
            int var33 = (var31.field890 * 4 - var32.field1359) / 2;
            int var34 = (var31.field910 * 4 - var32.field1362) / 2;
            var32.method1598(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field910) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("n.bp(B)Z")
    public static final boolean method137() {
        if (Statics.field1622 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1622.method2656();
            if (var0 == 0) {
                return false;
            }
            if (field539 == -1) {
                Statics.field1622.method2646(field302.field1889, 0, 1);
                field302.field1885 = 0;
                field539 = field302.method2419();
                field483 = class179.field2951[field539];
                var0--;
            }
            if (field483 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1622.method2646(field302.field1889, 0, 1);
                field483 = field302.field1889[0] & 0xFF;
                var0--;
            }
            if (field483 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1622.method2646(field302.field1889, 0, 2);
                field302.field1885 = 0;
                field483 = field302.method2177();
                var0 -= 2;
            }
            if (var0 < field483) {
                return false;
            }
            field302.field1885 = 0;
            Statics.field1622.method2646(field302.field1889, 0, field483);
            field305 = 0;
            field309 = field308;
            field308 = field470;
            field470 = field539;
            if (field539 == 190) {
                field275 = field302.method2314();
                if (field275 == 1) {
                    field276 = field302.method2177();
                }
                if (field275 >= 2 && field275 <= 6) {
                    if (field275 == 2) {
                        field471 = 64;
                        field282 = 64;
                    }
                    if (field275 == 3) {
                        field471 = 0;
                        field282 = 64;
                    }
                    if (field275 == 4) {
                        field471 = 128;
                        field282 = 64;
                    }
                    if (field275 == 5) {
                        field471 = 64;
                        field282 = 0;
                    }
                    if (field275 == 6) {
                        field471 = 64;
                        field282 = 128;
                    }
                    field275 = 2;
                    field346 = field302.method2177();
                    field279 = field302.method2177();
                    field328 = field302.method2314();
                }
                if (field275 == 10) {
                    field277 = field302.method2177();
                }
                field539 = -1;
                return true;
            }
            if (field539 == 133) {
                int var1 = field302.method2314();
                int var2 = field302.method2314();
                int var3 = field302.method2314();
                int var4 = field302.method2314();
                field511[var1] = true;
                field447[var1] = var2;
                field513[var1] = var3;
                field336[var1] = var4;
                field540[var1] = 0;
                field539 = -1;
                return true;
            }
            if (field539 == 1) {
                int var5 = field302.method2207();
                class15.method564(var5);
                field497[++field449 - 1 & 0x1F] = var5 & 0x7FFF;
                field539 = -1;
                return true;
            }
            if (field539 == 46) {
                int var6 = field302.method2207();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field302.method2216();
                int var8 = field302.method2350();
                class164 var9 = class164.method6(var8);
                if (var9.field2651) {
                    var9.field2770 = var6;
                    var9.field2761 = var7;
                    class47 var11 = class47.method2450(var6);
                    var9.field2735 = var11.field1062;
                    var9.field2702 = var11.field1063;
                    var9.field2703 = var11.field1057;
                    var9.field2699 = var11.field1049;
                    var9.field2700 = var11.field1066;
                    var9.field2649 = var11.field1061;
                    if (var11.field1067 == 1) {
                        var9.field2771 = 1;
                    } else {
                        var9.field2771 = 2;
                    }
                    if (var9.field2705 > 0) {
                        var9.field2649 = var9.field2649 * 32 / var9.field2705;
                    } else if (var9.field2663 > 0) {
                        var9.field2649 = var9.field2649 * 32 / var9.field2663;
                    }
                    method2521(var9);
                } else if (var6 == -1) {
                    var9.field2693 = 0;
                    field539 = -1;
                    return true;
                } else {
                    class47 var10 = class47.method2450(var6);
                    var9.field2693 = 4;
                    var9.field2694 = var6;
                    var9.field2735 = var10.field1062;
                    var9.field2702 = var10.field1063;
                    var9.field2649 = var10.field1061 * 100 / var7;
                    method2521(var9);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 17) {
                int var12 = field302.method2350();
                Statics.field307 = Statics.field1983.method2548(var12);
                field539 = -1;
                return true;
            }
            if (field539 == 98) {
                method2638(true);
                field539 = -1;
                return true;
            }
            if (field539 == 63) {
                Statics.method2465();
                field539 = -1;
                return false;
            }
            if (field539 == 182) {
                int var13 = field302.method2312();
                class164 var14 = class164.method6(var13);
                var14.field2693 = 3;
                var14.field2694 = Statics.field734.field44.method3137();
                method2521(var14);
                field539 = -1;
                return true;
            }
            if (field539 == 227) {
                field510 = false;
                for (int var15 = 0; var15 < 5; var15++) {
                    field511[var15] = false;
                }
                field539 = -1;
                return true;
            }
            if (field539 == 127) {
                field510 = true;
                Statics.field51 = field302.method2314();
                Statics.field725 = field302.method2314();
                Statics.field1528 = field302.method2177();
                Statics.field1317 = field302.method2314();
                Statics.field2896 = field302.method2314();
                if (Statics.field2896 >= 100) {
                    int var16 = Statics.field51 * 128 + 64;
                    int var17 = Statics.field725 * 128 + 64;
                    int var18 = method3178(var16, var17, Statics.field1818) - Statics.field1528;
                    int var19 = var16 - Statics.field175;
                    int var20 = var18 - Statics.field1924;
                    int var21 = var17 - Statics.field962;
                    int var22 = (int) Math.sqrt((double) (var19 * var19 + var21 * var21));
                    Statics.field2562 = (int) (Math.atan2((double) var20, (double) var22) * 325.949D) & 0x7FF;
                    Statics.field1567 = (int) (Math.atan2((double) var19, (double) var21) * -325.949D) & 0x7FF;
                    if (Statics.field2562 < 128) {
                        Statics.field2562 = 128;
                    }
                    if (Statics.field2562 > 383) {
                        Statics.field2562 = 383;
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 89) {
                int var23 = field302.method2350();
                int var24 = field302.method2209();
                class167.field2803[var24] = var23;
                if (class167.field2804[var24] != var23) {
                    class167.field2804[var24] = var23;
                    method626(var24);
                }
                field529[++field403 - 1 & 0x1F] = var24;
                field539 = -1;
                return true;
            }
            if (field539 == 67) {
                int var25 = field302.method2319();
                int var26 = field302.method2319();
                int var27 = field302.method2312();
                class164 var28 = class164.method6(var27);
                if (var28.field2661 != var25 || var28.field2698 != var26 || var28.field2657 != 0 || var28.field2658 != 0) {
                    var28.field2661 = var25;
                    var28.field2698 = var26;
                    var28.field2657 = 0;
                    var28.field2658 = 0;
                    method2521(var28);
                    method1097(var28);
                    if (var28.field2654 == 0) {
                        method124(Statics.field2642[var27 >> 16], var28, false);
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 165) {
                int var29 = field302.method2177();
                byte var30 = field302.method2203();
                class167.field2803[var29] = var30;
                if (class167.field2804[var29] != var30) {
                    class167.field2804[var29] = var30;
                    method626(var29);
                }
                field529[++field403 - 1 & 0x1F] = var29;
                field539 = -1;
                return true;
            }
            if (field539 == 56) {
                field302.field1885 += 28;
                if (field302.method2294()) {
                    class114 var31 = field302;
                    int var32 = field302.field1885 - 28;
                    if (class141.field2145 != null) {
                        try {
                            class141.field2145.method3745(0L);
                            class141.field2145.method3734(var31.field1889, var32, 24);
                        } catch (Exception var285) {
                        }
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 214) {
                int var34 = field302.method2177();
                int var35 = field302.method2314();
                int var36 = field302.method2177();
                method75(var34, var35, var36);
                field539 = -1;
                return true;
            }
            if (field539 == 29) {
                int var37 = field302.method2216();
                int var38 = field302.method2346();
                class164 var39 = class164.method6(var37);
                if (var39.field2693 != 2 || var39.field2694 != var38) {
                    var39.field2693 = 2;
                    var39.field2694 = var38;
                    method2521(var39);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 238) {
                while (field302.field1885 < field483) {
                    boolean var40 = field302.method2314() == 1;
                    String var41 = field302.method2265();
                    String var42 = field302.method2265();
                    int var43 = field302.method2177();
                    int var44 = field302.method2314();
                    int var45 = field302.method2314();
                    boolean var46 = (var45 & 0x2) != 0;
                    boolean var47 = (var45 & 0x1) != 0;
                    if (var43 > 0) {
                        field302.method2265();
                        field302.method2314();
                        field302.method2350();
                    }
                    field302.method2265();
                    for (int var48 = 0; var48 < field446; var48++) {
                        class17 var49 = field393[var48];
                        if (var40) {
                            if (var42.equals(var49.field238)) {
                                var49.field238 = var41;
                                var49.field237 = var42;
                                var41 = null;
                                break;
                            }
                        } else if (var41.equals(var49.field238)) {
                            if (var49.field236 != var43) {
                                boolean var50 = true;
                                for (class36 var51 = (class36) field532.method3395(); var51 != null; var51 = (class36) field532.method3396()) {
                                    if (var51.field830.equals(var41)) {
                                        if (var43 != 0 && var51.field828 == 0) {
                                            var51.method3532();
                                            var50 = false;
                                        } else if (var43 == 0 && var51.field828 != 0) {
                                            var51.method3532();
                                            var50 = false;
                                        }
                                    }
                                }
                                if (var50) {
                                    field532.method3401(new class36(var41, var43));
                                }
                                var49.field236 = var43;
                            }
                            var49.field237 = var42;
                            var49.field235 = var44;
                            var49.field233 = var46;
                            var49.field232 = var47;
                            var41 = null;
                            break;
                        }
                    }
                    if (var41 != null && field446 < 400) {
                        class17 var52 = new class17();
                        field393[field446] = var52;
                        var52.field238 = var41;
                        var52.field237 = var42;
                        var52.field236 = var43;
                        var52.field235 = var44;
                        var52.field233 = var46;
                        var52.field232 = var47;
                        field446++;
                    }
                }
                field530 = 2;
                field320 = field538;
                boolean var53 = false;
                int var54 = field446;
                while (var54 > 0) {
                    boolean var55 = true;
                    var54--;
                    for (int var56 = 0; var56 < var54; var56++) {
                        boolean var57 = false;
                        class17 var58 = field393[var56];
                        class17 var59 = field393[var56 + 1];
                        if (field256 != var58.field236 && field256 == var59.field236) {
                            var57 = true;
                        }
                        if (!var57 && var58.field236 == 0 && var59.field236 != 0) {
                            var57 = true;
                        }
                        if (!var57 && !var58.field233 && var59.field233) {
                            var57 = true;
                        }
                        if (!var57 && !var58.field232 && var59.field232) {
                            var57 = true;
                        }
                        if (var57) {
                            class17 var60 = field393[var56];
                            field393[var56] = field393[var56 + 1];
                            field393[var56 + 1] = var60;
                            var55 = false;
                        }
                    }
                    if (var55) {
                        break;
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 252) {
                for (int var61 = 0; var61 < field479.length; var61++) {
                    if (field479[var61] != null) {
                        field479[var61].field795 = -1;
                    }
                }
                for (int var62 = 0; var62 < field535.length; var62++) {
                    if (field535[var62] != null) {
                        field535[var62].field795 = -1;
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 40) {
                field480 = field302.method2314();
                field481 = field302.method2314();
                field539 = -1;
                return true;
            }
            if (field539 == 176) {
                for (int var63 = 0; var63 < class167.field2804.length; var63++) {
                    if (class167.field2804[var63] != class167.field2803[var63]) {
                        class167.field2804[var63] = class167.field2803[var63];
                        method626(var63);
                        field529[++field403 - 1 & 0x1F] = var63;
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 172) {
                boolean var64 = field302.method2202() == 1;
                int var65 = field302.method2336();
                class164 var66 = class164.method6(var65);
                if (var66.field2672 != var64) {
                    var66.field2672 = var64;
                    method2521(var66);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 26) {
                while (field302.field1885 < field483) {
                    int var67 = field302.method2314();
                    boolean var68 = (var67 & 0x1) == 1;
                    String var69 = field302.method2265();
                    String var70 = field302.method2265();
                    field302.method2265();
                    for (int var71 = 0; var71 < field401; var71++) {
                        class8 var72 = field534[var71];
                        if (var68) {
                            if (var70.equals(var72.field125)) {
                                var72.field125 = var69;
                                var72.field124 = var70;
                                var69 = null;
                                break;
                            }
                        } else if (var69.equals(var72.field125)) {
                            var72.field125 = var69;
                            var72.field124 = var70;
                            var69 = null;
                            break;
                        }
                    }
                    if (var69 != null && field401 < 400) {
                        class8 var73 = new class8();
                        field534[field401] = var73;
                        var73.field125 = var69;
                        var73.field124 = var70;
                        field401++;
                    }
                }
                field320 = field538;
                field539 = -1;
                return true;
            }
            if (field539 == 77) {
                Statics.field2113 = field302.method2200();
                Statics.field3143 = field302.method2201();
                while (field302.field1885 < field483) {
                    field539 = field302.method2314();
                    method2108();
                }
                field539 = -1;
                return true;
            }
            if (field539 == 24 || field539 == 3 || field539 == 181 || field539 == 148 || field539 == 246 || field539 == 139 || field539 == 185 || field539 == 210 || field539 == 141 || field539 == 8) {
                method2108();
                field539 = -1;
                return true;
            }
            if (field539 == 150) {
                method2999();
                field539 = -1;
                return true;
            }
            if (field539 == 113) {
                field274 = field302.method2207() * 30;
                field457 = field538;
                field539 = -1;
                return true;
            }
            if (field539 == 167) {
                int var74 = field302.method2336();
                String var75 = field302.method2265();
                class164 var76 = class164.method6(var74);
                if (!var75.equals(var76.field2710)) {
                    var76.field2710 = var75;
                    method2521(var76);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 222) {
                field510 = true;
                Statics.field227 = field302.method2314();
                Statics.field1798 = field302.method2314();
                Statics.field1926 = field302.method2177();
                Statics.field1027 = field302.method2314();
                Statics.field2801 = field302.method2314();
                if (Statics.field2801 >= 100) {
                    Statics.field175 = Statics.field227 * 128 + 64;
                    Statics.field962 = Statics.field1798 * 128 + 64;
                    Statics.field1924 = method3178(Statics.field175, Statics.field962, Statics.field1818) - Statics.field1926;
                }
                field539 = -1;
                return true;
            }
            if (field539 == 44) {
                int var77 = field483 + field302.field1885;
                int var78 = field302.method2177();
                int var79 = field302.method2177();
                if (field420 != var78) {
                    field420 = var78;
                    int var80 = field420;
                    int var81 = Statics.field594;
                    int var82 = Statics.field1958;
                    if (class164.method3121(var80)) {
                        method17(Statics.field2642[var80], -1, var81, var82, false);
                    }
                    method165(field420);
                    class34.method2438(field420);
                    for (int var83 = 0; var83 < 100; var83++) {
                        field424[var83] = true;
                    }
                }
                while (var79-- > 0) {
                    int var84 = field302.method2350();
                    int var85 = field302.method2177();
                    int var86 = field302.method2314();
                    class4 var87 = (class4) field421.method3405((long) var84);
                    if (var87 != null && var87.field55 != var85) {
                        method2415(var87, true);
                        var87 = null;
                    }
                    if (var87 == null) {
                        var87 = method617(var84, var85, var86);
                    }
                    var87.field59 = true;
                }
                for (class4 var88 = (class4) field421.method3412(); var88 != null; var88 = (class4) field421.method3410()) {
                    if (var88.field59) {
                        var88.field59 = false;
                    } else {
                        method2415(var88, true);
                    }
                }
                field464 = new class187(512);
                while (field302.field1885 < var77) {
                    int var89 = field302.method2350();
                    int var90 = field302.method2177();
                    int var91 = field302.method2177();
                    int var92 = field302.method2350();
                    for (int var93 = var90; var93 <= var91; var93++) {
                        long var94 = ((long) var89 << 32) + (long) var93;
                        field464.method3406(new class192(var92), var94);
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 161) {
                int var96 = field302.method2346();
                field420 = var96;
                int var97 = field420;
                int var98 = Statics.field594;
                int var99 = Statics.field1958;
                if (class164.method3121(var97)) {
                    method17(Statics.field2642[var97], -1, var98, var99, false);
                }
                method165(var96);
                class34.method2438(field420);
                for (int var100 = 0; var100 < 100; var100++) {
                    field424[var100] = true;
                }
                field539 = -1;
                return true;
            }
            if (field539 == 211) {
                method125();
                int var101 = field302.method2312();
                int var102 = field302.method2201();
                int var103 = field302.method2202();
                field379[var103] = var101;
                field397[var103] = var102;
                field398[var103] = 1;
                for (int var104 = 0; var104 < 98; var104++) {
                    if (var101 >= class146.field2199[var104]) {
                        field398[var103] = var104 + 2;
                    }
                }
                field450[++field451 - 1 & 0x1F] = var103;
                field539 = -1;
                return true;
            }
            if (field539 == 87) {
                String var105 = field302.method2265();
                Object[] var106 = new Object[var105.length() + 1];
                for (int var107 = var105.length() - 1; var107 >= 0; var107--) {
                    if (var105.charAt(var107) == 's') {
                        var106[var107 + 1] = field302.method2265();
                    } else {
                        var106[var107 + 1] = Integer.valueOf(field302.method2350());
                    }
                }
                var106[0] = Integer.valueOf(field302.method2350());
                class1 var108 = new class1();
                var108.field8 = var106;
                class34.method2786(var108);
                field539 = -1;
                return true;
            }
            if (field539 == 125) {
                Statics.method2542(field302, field483);
                field539 = -1;
                return true;
            }
            if (field539 == 103) {
                Statics.field3143 = field302.method2314();
                Statics.field2113 = field302.method2201();
                for (int var109 = Statics.field2113; var109 < Statics.field2113 + 8; var109++) {
                    for (int var110 = Statics.field3143; var110 < Statics.field3143 + 8; var110++) {
                        if (field357[Statics.field1818][var109][var110] != null) {
                            field357[Statics.field1818][var109][var110] = null;
                            method2668(var109, var110);
                        }
                    }
                }
                for (class16 var111 = (class16) field493.method3442(); var111 != null; var111 = (class16) field493.method3444()) {
                    if (var111.field229 >= Statics.field2113 && var111.field229 < Statics.field2113 + 8 && var111.field217 >= Statics.field3143 && var111.field217 < Statics.field3143 + 8 && Statics.field1818 == var111.field221) {
                        var111.field225 = 0;
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 184) {
                int var112 = field302.method2188();
                boolean var113 = field302.method2314() == 1;
                String var114 = "";
                boolean var115 = false;
                if (var113) {
                    var114 = field302.method2265();
                    if (method101(var114)) {
                        var115 = true;
                    }
                }
                String var116 = field302.method2265();
                if (!var115) {
                    class11.method3366(var112, var114, var116);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 72) {
                String var117 = field302.method2265();
                class114 var118 = field302;
                String var119 = class213.method2640(var118, 32767);
                String var120 = class214.method3629(class154.method2493(var119));
                class11.method3366(6, var117, var120);
                field539 = -1;
                return true;
            }
            if (field539 == 55) {
                int var121 = field302.method2350();
                int var122 = field302.method2177();
                int var123 = field302.method2200();
                class4 var124 = (class4) field421.method3405((long) var121);
                if (var124 != null) {
                    method2415(var124, var124.field55 != var122);
                }
                method617(var121, var122, var123);
                field539 = -1;
                return true;
            }
            if (field539 == 213) {
                method125();
                field425 = field302.method2314();
                field457 = field538;
                field539 = -1;
                return true;
            }
            if (field539 == 45) {
                int var125 = field302.method2350();
                int var126 = field302.method2177();
                if (var125 < -70000) {
                    var126 += 32768;
                }
                class164 var127;
                if (var125 >= 0) {
                    var127 = class164.method6(var125);
                } else {
                    var127 = null;
                }
                while (field302.field1885 < field483) {
                    int var128 = field302.method2188();
                    int var129 = field302.method2177();
                    int var130 = 0;
                    if (var129 != 0) {
                        var130 = field302.method2314();
                        if (var130 == 255) {
                            var130 = field302.method2350();
                        }
                    }
                    if (var127 != null && var128 >= 0 && var128 < var127.field2695.length) {
                        var127.field2695[var128] = var129;
                        var127.field2769[var128] = var130;
                    }
                    class15.method1439(var126, var128, var129 - 1, var130);
                }
                if (var127 != null) {
                    method2521(var127);
                }
                method125();
                field497[++field449 - 1 & 0x1F] = var126 & 0x7FFF;
                field539 = -1;
                return true;
            }
            if (field539 == 39) {
                String var131 = field302.method2265();
                Statics.field1017 = var131;
                try {
                    String var132 = Statics.field254.getParameter(class181.field2967.field2970);
                    String var133 = Statics.field254.getParameter(class181.field2966.field2970);
                    String var134 = var132 + "settings=" + var131 + "; version=1; path=/; domain=" + var133;
                    String var135;
                    if (var131.length() == 0) {
                        var135 = var134 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var136 = var134 + "; Expires=";
                        long var137 = class107.method579() + 94608000000L;
                        class103.field1844.setTime(new Date(var137));
                        int var139 = class103.field1844.get(7);
                        int var140 = class103.field1844.get(5);
                        int var141 = class103.field1844.get(2);
                        int var142 = class103.field1844.get(1);
                        int var143 = class103.field1844.get(11);
                        int var144 = class103.field1844.get(12);
                        int var145 = class103.field1844.get(13);
                        String var146 = class103.field1845[var139 - 1] + ", " + var140 / 10 + var140 % 10 + "-" + class103.field1847[0][var141] + "-" + var142 + " " + var143 / 10 + var143 % 10 + ":" + var144 / 10 + var144 % 10 + ":" + var145 / 10 + var145 % 10 + " GMT";
                        var135 = var136 + var146 + "; Max-Age=" + 94608000L;
                    }
                    client var147 = Statics.field254;
                    String var148 = "document.cookie=\"" + var135 + "\"";
                    JSObject.getWindow(var147).eval(var148);
                } catch (Throwable var284) {
                }
                field539 = -1;
                return true;
            }
            if (field539 == 121) {
                method2638(false);
                field539 = -1;
                return true;
            }
            if (field539 == 88) {
                int var150 = field302.method2312();
                int var151 = field302.method2177();
                class164 var152 = class164.method6(var150);
                if (var152.field2693 != 1 || var152.field2694 != var151) {
                    var152.field2693 = 1;
                    var152.field2694 = var151;
                    method2521(var152);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 68) {
                method1893(false);
                field539 = -1;
                return true;
            }
            if (field539 == 82) {
                int var153 = field302.method2314();
                class122[] var154 = class122.method1891();
                int var155 = 0;
                class122 var157;
                while (true) {
                    if (var155 >= var154.length) {
                        var157 = null;
                        break;
                    }
                    class122 var156 = var154[var155];
                    if (var156.field1954 == var153) {
                        var157 = var156;
                        break;
                    }
                    var155++;
                }
                Statics.field2547 = var157;
                field539 = -1;
                return true;
            }
            if (field539 == 106) {
                String var158 = field302.method2265();
                long var159 = (long) field302.method2177();
                long var161 = (long) field302.method2179();
                class143 var163 = (class143) class101.method561(class143.method487(), field302.method2314());
                long var164 = (var159 << 32) + var161;
                boolean var166 = false;
                for (int var167 = 0; var167 < 100; var167++) {
                    if (field318[var167] == var164) {
                        var166 = true;
                        break;
                    }
                }
                if (method101(var158)) {
                    var166 = true;
                }
                if (!var166 && field377 == 0) {
                    field318[field484] = var164;
                    field484 = (field484 + 1) % 100;
                    class114 var168 = field302;
                    String var169 = class213.method2640(var168, 32767);
                    String var170 = class214.method3629(class154.method2493(var169));
                    byte var171;
                    if (var163.field2164) {
                        var171 = 7;
                    } else {
                        var171 = 3;
                    }
                    if (var163.field2166 == -1) {
                        class11.method3366(var171, var158, var170);
                    } else {
                        int var173 = var163.field2166;
                        String var174 = "<img=" + var173 + ">";
                        class11.method3366(var171, var174 + var158, var170);
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 152) {
                int var175 = field302.method2350();
                int var176 = field302.method2319();
                class164 var177 = class164.method6(var175);
                if (var177.field2686 != var176 || var176 == -1) {
                    var177.field2686 = var176;
                    var177.field2717 = 0;
                    var177.field2773 = 0;
                    method2521(var177);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 54) {
                method125();
                field426 = field302.method2319();
                field457 = field538;
                field539 = -1;
                return true;
            }
            if (field539 == 243) {
                if (field420 != -1) {
                    int var178 = field420;
                    if (class164.method3121(var178)) {
                        method3346(Statics.field2642[var178], 0);
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 95) {
                String var179 = field302.method2265();
                long var180 = field302.method2181();
                long var182 = (long) field302.method2177();
                long var184 = (long) field302.method2179();
                class143 var186 = (class143) class101.method561(class143.method487(), field302.method2314());
                long var187 = (var182 << 32) + var184;
                boolean var189 = false;
                for (int var190 = 0; var190 < 100; var190++) {
                    if (field318[var190] == var187) {
                        var189 = true;
                        break;
                    }
                }
                if (var186.field2169 && method101(var179)) {
                    var189 = true;
                }
                if (!var189 && field377 == 0) {
                    field318[field484] = var187;
                    field484 = (field484 + 1) % 100;
                    class114 var191 = field302;
                    String var192 = class213.method2640(var191, 32767);
                    String var193 = class214.method3629(class154.method2493(var192));
                    if (var186.field2166 == -1) {
                        class11.method1912(9, var179, var193, class153.method85(var180));
                    } else {
                        int var194 = var186.field2166;
                        String var195 = "<img=" + var194 + ">";
                        class11.method1912(9, var195 + var179, var193, class153.method85(var180));
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 22) {
                int var196 = field302.method2350();
                int var197 = field302.method2177();
                if (var196 < -70000) {
                    var197 += 32768;
                }
                class164 var198;
                if (var196 >= 0) {
                    var198 = class164.method6(var196);
                } else {
                    var198 = null;
                }
                if (var198 != null) {
                    for (int var199 = 0; var199 < var198.field2695.length; var199++) {
                        var198.field2695[var199] = 0;
                        var198.field2769[var199] = 0;
                    }
                }
                class15 var200 = (class15) class15.field213.method3405((long) var197);
                if (var200 != null) {
                    for (int var201 = 0; var201 < var200.field207.length; var201++) {
                        var200.field207[var201] = -1;
                        var200.field208[var201] = 0;
                    }
                }
                int var202 = field302.method2177();
                for (int var203 = 0; var203 < var202; var203++) {
                    int var204 = field302.method2177();
                    int var205 = field302.method2200();
                    if (var205 == 255) {
                        var205 = field302.method2216();
                    }
                    if (var198 != null && var203 < var198.field2695.length) {
                        var198.field2695[var203] = var204;
                        var198.field2769[var203] = var205;
                    }
                    class15.method1439(var197, var203, var204 - 1, var205);
                }
                if (var198 != null) {
                    method2521(var198);
                }
                method125();
                field497[++field449 - 1 & 0x1F] = var197 & 0x7FFF;
                field539 = -1;
                return true;
            }
            if (field539 == 234) {
                int var206 = field302.method2314();
                if (field302.method2314() == 0) {
                    field322[var206] = new class211();
                    field302.field1885 += 18;
                } else {
                    field302.field1885--;
                    field322[var206] = new class211(field302, false);
                }
                field359 = field538;
                field539 = -1;
                return true;
            }
            if (field539 == 220) {
                int var207 = field302.method2177();
                if (var207 == 65535) {
                    var207 = -1;
                }
                Statics.method152(var207);
                field539 = -1;
                return true;
            }
            if (field539 == 156) {
                int var208 = field302.method2210();
                int var209 = field302.method2346();
                if (var209 == 65535) {
                    var209 = -1;
                }
                if (field499 != 0 && var209 != -1) {
                    class174.method562(Statics.field1938, var209, 0, field499, false);
                    field501 = true;
                }
                field539 = -1;
                return true;
            }
            if (field539 == 146) {
                method1893(true);
                field539 = -1;
                return true;
            }
            if (field539 == 205) {
                field530 = 1;
                field320 = field538;
                field539 = -1;
                return true;
            }
            if (field539 == 235) {
                String var210 = field302.method2265();
                int var211 = field302.method2202();
                int var212 = field302.method2314();
                if (var211 >= 1 && var211 <= 8) {
                    if (var210.equalsIgnoreCase("null")) {
                        var210 = null;
                    }
                    field389[var211 - 1] = var210;
                    field390[var211 - 1] = var212 == 0;
                }
                field539 = -1;
                return true;
            }
            if (field539 == 154) {
                int var213 = field302.method2336();
                int var214 = field302.method2216();
                class4 var215 = (class4) field421.method3405((long) var213);
                class4 var216 = (class4) field421.method3405((long) var214);
                if (var216 != null) {
                    method2415(var216, var215 == null || var215.field55 != var216.field55);
                }
                if (var215 != null) {
                    var215.method3533();
                    field421.method3406(var215, (long) var214);
                }
                class164 var217 = class164.method6(var213);
                if (var217 != null) {
                    method2521(var217);
                }
                class164 var218 = class164.method6(var214);
                if (var218 != null) {
                    method2521(var218);
                    method124(Statics.field2642[var218.field2652 >>> 16], var218, true);
                }
                if (field420 != -1) {
                    int var219 = field420;
                    if (class164.method3121(var219)) {
                        method3346(Statics.field2642[var219], 1);
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 6) {
                int var220 = field302.method2209();
                int var221 = field302.method2207();
                int var222 = field302.method2216();
                int var223 = field302.method2177();
                class164 var224 = class164.method6(var222);
                if (var224.field2735 != var220 || var224.field2702 != var223 || var224.field2649 != var221) {
                    var224.field2735 = var220;
                    var224.field2702 = var223;
                    var224.field2649 = var221;
                    method2521(var224);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 239) {
                class24 var225 = new class24();
                var225.field618 = field302.method2265();
                var225.field617 = field302.method2177();
                int var226 = field302.method2350();
                var225.field622 = var226;
                method521(45);
                Statics.field1622.method2643();
                Statics.field1622 = null;
                class30.method645(var225);
                field539 = -1;
                return false;
            }
            if (field539 == 120) {
                boolean var227 = field302.method2314() == 1;
                if (var227) {
                    Statics.field2070 = class107.method579() - field302.method2181();
                    Statics.field1708 = new class212(field302, true);
                } else {
                    Statics.field1708 = null;
                }
                field456 = field538;
                field539 = -1;
                return true;
            }
            if (field539 == 216) {
                int var228 = field302.method2350();
                class164 var229 = class164.method6(var228);
                for (int var230 = 0; var230 < var229.field2695.length; var230++) {
                    var229.field2695[var230] = -1;
                    var229.field2695[var230] = 0;
                }
                method2521(var229);
                field539 = -1;
                return true;
            }
            if (field539 == 62) {
                int var231 = field302.method2209();
                int var232 = field302.method2336();
                int var233 = var231 >> 10 & 0x1F;
                int var234 = var231 >> 5 & 0x1F;
                int var235 = var231 & 0x1F;
                int var236 = (var235 << 3) + (var233 << 19) + (var234 << 11);
                class164 var237 = class164.method6(var232);
                if (var237.field2677 != var236) {
                    var237.field2677 = var236;
                    method2521(var237);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 202) {
                int var238 = field302.method2209();
                if (var238 == 65535) {
                    var238 = -1;
                }
                int var239 = field302.method2312();
                int var240 = field302.method2336();
                int var241 = field302.method2207();
                if (var241 == 65535) {
                    var241 = -1;
                }
                for (int var242 = var241; var242 <= var238; var242++) {
                    long var243 = ((long) var240 << 32) + (long) var242;
                    class199 var245 = field464.method3405(var243);
                    if (var245 != null) {
                        var245.method3533();
                    }
                    field464.method3406(new class192(var239), var243);
                }
                field539 = -1;
                return true;
            }
            if (field539 == 245) {
                Statics.field2113 = field302.method2314();
                Statics.field3143 = field302.method2200();
                field539 = -1;
                return true;
            }
            if (field539 == 12) {
                int var246 = field302.method2350();
                int var247 = field302.method2346();
                int var248 = field302.method2209();
                class164 var249 = class164.method6(var246);
                var249.field2706 = (var248 << 16) + var247;
                field539 = -1;
                return true;
            }
            if (field539 == 0) {
                for (int var250 = 0; var250 < Statics.field2040; var250++) {
                    class48 var251 = class48.method843(var250);
                    if (var251 != null) {
                        class167.field2803[var250] = 0;
                        class167.field2804[var250] = 0;
                    }
                }
                method125();
                field403 += 32;
                field539 = -1;
                return true;
            }
            if (field539 == 59) {
                field498 = field302.method2314();
                field539 = -1;
                return true;
            }
            if (field539 == 208) {
                int var252 = field302.method2350();
                int var253 = field302.method2209();
                class164 var254 = class164.method6(var252);
                if (var254 != null && var254.field2654 == 0) {
                    if (var253 > var254.field2779 - var254.field2668) {
                        var253 = var254.field2779 - var254.field2668;
                    }
                    if (var253 < 0) {
                        var253 = 0;
                    }
                    if (var254.field2674 != var253) {
                        var254.field2674 = var253;
                        method2521(var254);
                    }
                }
                field539 = -1;
                return true;
            }
            if (field539 == 131) {
                int var255 = field302.method2202();
                int var256 = field302.method2201();
                int var257 = field302.method2202();
                Statics.field1818 = var256 >> 1;
                Statics.field734.method641(var257, var255, (var256 & 0x1) == 1);
                field539 = -1;
                return true;
            }
            if (field539 == 189) {
                int var258 = field302.method2350();
                class4 var259 = (class4) field421.method3405((long) var258);
                if (var259 != null) {
                    method2415(var259, true);
                }
                if (field506 != null) {
                    method2521(field506);
                    field506 = null;
                }
                field539 = -1;
                return true;
            }
            if (field539 == 105) {
                String var260 = field302.method2265();
                int var261 = field302.method2177();
                byte var262 = field302.method2176();
                boolean var263 = false;
                if (var262 == -128) {
                    var263 = true;
                }
                if (var263) {
                    if (Statics.field56 == 0) {
                        field539 = -1;
                        return true;
                    }
                    boolean var264 = false;
                    int var265;
                    for (var265 = 0; var265 < Statics.field56 && (!Statics.field1324[var265].field605.equals(var260) || Statics.field1324[var265].field602 != var261); var265++) {
                    }
                    if (var265 < Statics.field56) {
                        while (var265 < Statics.field56 - 1) {
                            Statics.field1324[var265] = Statics.field1324[var265 + 1];
                            var265++;
                        }
                        Statics.field56--;
                        Statics.field1324[Statics.field56] = null;
                    }
                } else {
                    field302.method2265();
                    class23 var266 = new class23();
                    var266.field605 = var260;
                    var266.field601 = class155.method65(var266.field605, Statics.field261);
                    var266.field602 = var261;
                    var266.field603 = var262;
                    int var267;
                    for (var267 = Statics.field56 - 1; var267 >= 0; var267--) {
                        int var268 = Statics.field1324[var267].field601.compareTo(var266.field601);
                        if (var268 == 0) {
                            Statics.field1324[var267].field602 = var261;
                            Statics.field1324[var267].field603 = var262;
                            if (var260.equals(Statics.field734.field39)) {
                                Statics.field199 = var262;
                            }
                            field454 = field538;
                            field539 = -1;
                            return true;
                        }
                        if (var268 < 0) {
                            break;
                        }
                    }
                    if (Statics.field56 >= Statics.field1324.length) {
                        field539 = -1;
                        return true;
                    }
                    for (int var269 = Statics.field56 - 1; var269 > var267; var269--) {
                        Statics.field1324[var269 + 1] = Statics.field1324[var269];
                    }
                    if (Statics.field56 == 0) {
                        Statics.field1324 = new class23[100];
                    }
                    Statics.field1324[var267 + 1] = var266;
                    Statics.field56++;
                    if (var260.equals(Statics.field734.field39)) {
                        Statics.field199 = var262;
                    }
                }
                field454 = field538;
                field539 = -1;
                return true;
            }
            if (field539 == 217) {
                field418 = field302.method2314();
                if (field418 == 255) {
                    field418 = 0;
                }
                field280 = field302.method2314();
                if (field280 == 255) {
                    field280 = 0;
                }
                field539 = -1;
                return true;
            }
            if (field539 == 200) {
                field454 = field538;
                if (field483 == 0) {
                    field489 = null;
                    field490 = null;
                    Statics.field56 = 0;
                    Statics.field1324 = null;
                    field539 = -1;
                    return true;
                }
                field490 = field302.method2265();
                long var270 = field302.method2181();
                field489 = class153.method1798(var270);
                Statics.field139 = field302.method2176();
                int var272 = field302.method2314();
                if (var272 == 255) {
                    field539 = -1;
                    return true;
                }
                Statics.field56 = var272;
                class23[] var273 = new class23[100];
                for (int var274 = 0; var274 < Statics.field56; var274++) {
                    var273[var274] = new class23();
                    var273[var274].field605 = field302.method2265();
                    var273[var274].field601 = class155.method65(var273[var274].field605, Statics.field261);
                    var273[var274].field602 = field302.method2177();
                    var273[var274].field603 = field302.method2176();
                    field302.method2265();
                    if (var273[var274].field605.equals(Statics.field734.field39)) {
                        Statics.field199 = var273[var274].field603;
                    }
                }
                boolean var275 = false;
                int var276 = Statics.field56;
                while (var276 > 0) {
                    boolean var277 = true;
                    var276--;
                    for (int var278 = 0; var278 < var276; var278++) {
                        if (var273[var278].field601.compareTo(var273[var278 + 1].field601) > 0) {
                            class23 var279 = var273[var278];
                            var273[var278] = var273[var278 + 1];
                            var273[var278 + 1] = var279;
                            var277 = false;
                        }
                    }
                    if (var277) {
                        break;
                    }
                }
                Statics.field1324 = var273;
                field539 = -1;
                return true;
            }
            class140.method1("" + field539 + class2.field19 + field308 + class2.field19 + field309 + class2.field19 + field483, (Throwable) null);
            Statics.method2465();
        } catch (IOException var286) {
            method37();
        } catch (Exception var287) {
            String var282 = "" + field539 + class2.field19 + field308 + class2.field19 + field309 + class2.field19 + field483 + class2.field19 + (Statics.field193 + Statics.field734.field818[0]) + class2.field19 + (Statics.field948 + Statics.field734.field814[0]) + class2.field19;
            for (int var283 = 0; var283 < field483 && var283 < 50; var283++) {
                var282 = var282 + field302.field1889[var283] + class2.field19;
            }
            class140.method1(var282, var287);
            Statics.method2465();
        }
        return true;
    }

    @ObfuscatedName("ct.bc(B)V")
    public static final void method2108() {
        if (field539 == 185) {
            int var0 = field302.method2346();
            int var1 = field302.method2177();
            int var2 = field302.method2202();
            int var3 = (var2 >> 4 & 0x7) + Statics.field2113;
            int var4 = (var2 & 0x7) + Statics.field3143;
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class27 var5 = new class27();
                var5.field665 = var1;
                var5.field656 = var0;
                if (field357[Statics.field1818][var3][var4] == null) {
                    field357[Statics.field1818][var3][var4] = new class190();
                }
                field357[Statics.field1818][var3][var4].method3437(var5);
                method2668(var3, var4);
            }
        } else if (field539 == 3) {
            int var6 = field302.method2314();
            int var7 = (var6 >> 4 & 0x7) + Statics.field2113;
            int var8 = (var6 & 0x7) + Statics.field3143;
            int var9 = field302.method2177();
            int var10 = field302.method2177();
            int var11 = field302.method2177();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class190 var12 = field357[Statics.field1818][var7][var8];
                if (var12 != null) {
                    for (class27 var13 = (class27) var12.method3442(); var13 != null; var13 = (class27) var12.method3444()) {
                        if ((var9 & 0x7FFF) == var13.field665 && var13.field656 == var10) {
                            var13.field656 = var11;
                            break;
                        }
                    }
                    method2668(var7, var8);
                }
            }
        } else {
            if (field539 == 24) {
                int var14 = field302.method2314();
                int var15 = (var14 >> 4 & 0x7) + Statics.field2113;
                int var16 = (var14 & 0x7) + Statics.field3143;
                int var17 = field302.method2177();
                int var18 = field302.method2314();
                int var19 = var18 >> 4 & 0xF;
                int var20 = var18 & 0x7;
                int var21 = field302.method2314();
                if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                    int var22 = var19 + 1;
                    if (Statics.field734.field818[0] >= var15 - var22 && Statics.field734.field818[0] <= var15 + var22 && Statics.field734.field814[0] >= var16 - var22 && Statics.field734.field814[0] <= var16 + var22 && field422 != 0 && var20 > 0 && field504 < 50) {
                        field505[field504] = var17;
                        field325[field504] = var20;
                        field507[field504] = var21;
                        field509[field504] = null;
                        field508[field504] = (var15 << 16) + (var16 << 8) + var19;
                        field504++;
                    }
                }
            }
            if (field539 == 210) {
                int var23 = field302.method2201();
                int var24 = var23 >> 2;
                int var25 = var23 & 0x3;
                int var26 = field473[var24];
                int var27 = field302.method2200();
                int var28 = (var27 >> 4 & 0x7) + Statics.field2113;
                int var29 = (var27 & 0x7) + Statics.field3143;
                int var30 = field302.method2346();
                if (var28 >= 0 && var29 >= 0 && var28 < 103 && var29 < 103) {
                    if (var26 == 0) {
                        class82 var31 = Statics.field189.method1691(Statics.field1818, var28, var29);
                        if (var31 != null) {
                            int var32 = var31.field1462 >> 14 & 0x7FFF;
                            if (var24 == 2) {
                                var31.field1458 = new class12(var32, 2, var25 + 4, Statics.field1818, var28, var29, var30, false, var31.field1458);
                                var31.field1468 = new class12(var32, 2, var25 + 1 & 0x3, Statics.field1818, var28, var29, var30, false, var31.field1468);
                            } else {
                                var31.field1458 = new class12(var32, var24, var25, Statics.field1818, var28, var29, var30, false, var31.field1458);
                            }
                        }
                    }
                    if (var26 == 1) {
                        class89 var33 = Statics.field189.method1650(Statics.field1818, var28, var29);
                        if (var33 != null) {
                            int var34 = var33.field1545 >> 14 & 0x7FFF;
                            if (var24 == 4 || var24 == 5) {
                                var33.field1539 = new class12(var34, 4, var25, Statics.field1818, var28, var29, var30, false, var33.field1539);
                            } else if (var24 == 6) {
                                var33.field1539 = new class12(var34, 4, var25 + 4, Statics.field1818, var28, var29, var30, false, var33.field1539);
                            } else if (var24 == 7) {
                                var33.field1539 = new class12(var34, 4, (var25 + 2 & 0x3) + 4, Statics.field1818, var28, var29, var30, false, var33.field1539);
                            } else if (var24 == 8) {
                                var33.field1539 = new class12(var34, 4, var25 + 4, Statics.field1818, var28, var29, var30, false, var33.field1539);
                                var33.field1546 = new class12(var34, 4, (var25 + 2 & 0x3) + 4, Statics.field1818, var28, var29, var30, false, var33.field1546);
                            }
                        }
                    }
                    if (var26 == 2) {
                        class93 var35 = Statics.field189.method1651(Statics.field1818, var28, var29);
                        if (var24 == 11) {
                            var24 = 10;
                        }
                        if (var35 != null) {
                            var35.field1596 = new class12(var35.field1608 >> 14 & 0x7FFF, var24, var25, Statics.field1818, var28, var29, var30, false, var35.field1596);
                        }
                    }
                    if (var26 == 3) {
                        class88 var36 = Statics.field189.method1652(Statics.field1818, var28, var29);
                        if (var36 != null) {
                            var36.field1524 = new class12(var36.field1537 >> 14 & 0x7FFF, 22, var25, Statics.field1818, var28, var29, var30, false, var36.field1524);
                        }
                    }
                }
            } else if (field539 == 148) {
                int var37 = field302.method2314();
                int var38 = (var37 >> 4 & 0x7) + Statics.field2113;
                int var39 = (var37 & 0x7) + Statics.field3143;
                int var40 = field302.method2177();
                int var41 = field302.method2314();
                int var42 = field302.method2177();
                if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                    int var43 = var38 * 128 + 64;
                    int var44 = var39 * 128 + 64;
                    class28 var45 = new class28(var40, Statics.field1818, var43, var44, method3178(var43, var44, Statics.field1818) - var41, var42, field267);
                    field294.method3437(var45);
                }
            } else if (field539 == 8) {
                int var46 = field302.method2201();
                int var47 = var46 >> 2;
                int var48 = var46 & 0x3;
                int var49 = field473[var47];
                int var50 = field302.method2346();
                int var51 = field302.method2200();
                int var52 = (var51 >> 4 & 0x7) + Statics.field2113;
                int var53 = (var51 & 0x7) + Statics.field3143;
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    method176(Statics.field1818, var52, var53, var49, var50, var47, var48, 0, -1);
                }
            } else {
                if (field539 == 181) {
                    int var54 = field302.method2209();
                    byte var55 = field302.method2203();
                    int var56 = field302.method2314();
                    int var57 = var56 >> 2;
                    int var58 = var56 & 0x3;
                    int var59 = field473[var57];
                    byte var60 = field302.method2203();
                    int var61 = field302.method2177();
                    byte var62 = field302.method2203();
                    int var63 = field302.method2202();
                    int var64 = (var63 >> 4 & 0x7) + Statics.field2113;
                    int var65 = (var63 & 0x7) + Statics.field3143;
                    byte var66 = field302.method2203();
                    int var67 = field302.method2209();
                    int var68 = field302.method2177();
                    class3 var69;
                    if (field384 == var54) {
                        var69 = Statics.field734;
                    } else {
                        var69 = field479[var54];
                    }
                    if (var69 != null) {
                        class38 var70 = class38.method489(var61);
                        int var71;
                        int var72;
                        if (var58 == 1 || var58 == 3) {
                            var71 = var70.field910;
                            var72 = var70.field890;
                        } else {
                            var71 = var70.field890;
                            var72 = var70.field910;
                        }
                        int var73 = (var71 >> 1) + var64;
                        int var74 = (var71 + 1 >> 1) + var64;
                        int var75 = (var72 >> 1) + var65;
                        int var76 = (var72 + 1 >> 1) + var65;
                        int[][] var77 = class6.field82[Statics.field1818];
                        int var78 = var77[var73][var75] + var77[var74][var75] + var77[var73][var76] + var77[var74][var76] >> 2;
                        int var79 = (var64 << 7) + (var71 << 6);
                        int var80 = (var65 << 7) + (var72 << 6);
                        class100 var81 = var70.method697(var57, var58, var77, var79, var78, var80);
                        if (var81 != null) {
                            method176(Statics.field1818, var64, var65, var59, -1, 0, 0, var67 + 1, var68 + 1);
                            var69.field38 = field267 + var67;
                            var69.field32 = field267 + var68;
                            var69.field43 = var81;
                            var69.field40 = var64 * 128 + var71 * 64;
                            var69.field45 = var65 * 128 + var72 * 64;
                            var69.field47 = var78;
                            if (var55 > var60) {
                                byte var82 = var55;
                                var55 = var60;
                                var60 = var82;
                            }
                            if (var62 > var66) {
                                byte var83 = var62;
                                var62 = var66;
                                var66 = var83;
                            }
                            var69.field31 = var55 + var64;
                            var69.field46 = var60 + var64;
                            var69.field41 = var62 + var65;
                            var69.field42 = var65 + var66;
                        }
                    }
                }
                if (field539 == 246) {
                    int var84 = field302.method2314();
                    int var85 = (var84 >> 4 & 0x7) + Statics.field2113;
                    int var86 = (var84 & 0x7) + Statics.field3143;
                    int var87 = var85 + field302.method2176();
                    int var88 = var86 + field302.method2176();
                    int var89 = field302.method2319();
                    int var90 = field302.method2177();
                    int var91 = field302.method2314() * 4;
                    int var92 = field302.method2314() * 4;
                    int var93 = field302.method2177();
                    int var94 = field302.method2177();
                    int var95 = field302.method2314();
                    int var96 = field302.method2314();
                    if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104 && var90 != 65535) {
                        int var97 = var85 * 128 + 64;
                        int var98 = var86 * 128 + 64;
                        int var99 = var87 * 128 + 64;
                        int var100 = var88 * 128 + 64;
                        class7 var101 = new class7(var90, Statics.field1818, var97, var98, method3178(var97, var98, Statics.field1818) - var91, field267 + var93, field267 + var94, var95, var96, var89, var92);
                        var101.method73(var99, var100, method3178(var99, var100, Statics.field1818) - var92, field267 + var93);
                        field395.method3437(var101);
                    }
                } else if (field539 == 141) {
                    int var102 = field302.method2314();
                    int var103 = var102 >> 2;
                    int var104 = var102 & 0x3;
                    int var105 = field473[var103];
                    int var106 = field302.method2200();
                    int var107 = (var106 >> 4 & 0x7) + Statics.field2113;
                    int var108 = (var106 & 0x7) + Statics.field3143;
                    if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                        method176(Statics.field1818, var107, var108, var105, -1, var103, var104, 0, -1);
                    }
                } else if (field539 == 139) {
                    int var109 = field302.method2202();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field2113;
                    int var111 = (var109 & 0x7) + Statics.field3143;
                    int var112 = field302.method2177();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class190 var113 = field357[Statics.field1818][var110][var111];
                        if (var113 != null) {
                            for (class27 var114 = (class27) var113.method3442(); var114 != null; var114 = (class27) var113.method3444()) {
                                if ((var112 & 0x7FFF) == var114.field665) {
                                    var114.method3533();
                                    break;
                                }
                            }
                            if (var113.method3442() == null) {
                                field357[Statics.field1818][var110][var111] = null;
                            }
                            method2668(var110, var111);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.bx(IIIIIIIIII)V")
    public static final void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field493.method3442(); var10 != null; var10 = (class16) field493.method3444()) {
            if (var10.field221 == arg0 && var10.field229 == arg1 && var10.field217 == arg2 && var10.field215 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field221 = arg0;
            var9.field215 = arg3;
            var9.field229 = arg1;
            var9.field217 = arg2;
            method168(var9);
            field493.method3437(var9);
        }
        var9.field216 = arg4;
        var9.field228 = arg5;
        var9.field222 = arg6;
        var9.field224 = arg7;
        var9.field225 = arg8;
    }

    @ObfuscatedName("y.bt(Lr;I)V")
    public static final void method168(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field215 == 0) {
            var1 = Statics.field189.method1653(arg0.field221, arg0.field229, arg0.field217);
        }
        if (arg0.field215 == 1) {
            var1 = Statics.field189.method1648(arg0.field221, arg0.field229, arg0.field217);
        }
        if (arg0.field215 == 2) {
            var1 = Statics.field189.method1655(arg0.field221, arg0.field229, arg0.field217);
        }
        if (arg0.field215 == 3) {
            var1 = Statics.field189.method1656(arg0.field221, arg0.field229, arg0.field217);
        }
        if (var1 != 0) {
            int var5 = Statics.field189.method1657(arg0.field221, arg0.field229, arg0.field217, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field218 = var2;
        arg0.field220 = var3;
        arg0.field219 = var4;
    }

    @ObfuscatedName("al.bv(IIIIIIIB)V")
    public static final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field253 && Statics.field1818 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field189.method1653(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field189.method1648(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field189.method1655(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field189.method1656(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field189.method1657(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field189.method1644(arg0, arg2, arg3);
                class38 var15 = class38.method489(var12);
                if (var15.field892 != 0) {
                    field531[arg0].method3765(arg2, arg3, var13, var14, var15.field893);
                }
            }
            if (arg1 == 1) {
                Statics.field189.method1645(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field189.method1646(arg0, arg2, arg3);
                class38 var16 = class38.method489(var12);
                if (var16.field890 + arg2 > 103 || var16.field890 + arg3 > 103 || var16.field910 + arg2 > 103 || var16.field910 + arg3 > 103) {
                    return;
                }
                if (var16.field892 != 0) {
                    field531[arg0].method3761(arg2, arg3, var16.field890, var16.field910, var14, var16.field893);
                }
            }
            if (arg1 == 3) {
                Statics.field189.method1647(arg0, arg2, arg3);
                class38 var17 = class38.method489(var12);
                if (var17.field892 == 1) {
                    field531[arg0].method3755(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field72[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class81 var19 = Statics.field189;
        class220 var20 = field531[arg0];
        class38 var21 = class38.method489(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field910;
            var23 = var21.field890;
        } else {
            var22 = var21.field890;
            var23 = var21.field910;
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
        int[][] var28 = class6.field82[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field894 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field886 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class80 var34;
            if (var21.field898 == -1 && var21.field895 == null) {
                var34 = var21.method697(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class12(arg4, 22, arg5, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1633(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field892 == 1) {
                var20.method3759(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var57;
            if (var21.field898 == -1 && var21.field895 == null) {
                var57 = var21.method697(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class12(arg4, 10, arg5, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            if (var57 != null) {
                var19.method1637(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field892 != 0) {
                var20.method3777(arg2, arg3, var22, var23, var21.field893);
            }
        } else if (arg6 >= 12) {
            class80 var35;
            if (var21.field898 == -1 && var21.field895 == null) {
                var35 = var21.method697(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1637(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field892 != 0) {
                var20.method3777(arg2, arg3, var22, var23, var21.field893);
            }
        } else if (arg6 == 0) {
            class80 var36;
            if (var21.field898 == -1 && var21.field895 == null) {
                var36 = var21.method697(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class12(arg4, 0, arg5, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1783(arg0, arg2, arg3, var29, var36, (class80) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field892 != 0) {
                var20.method3758(arg2, arg3, arg6, arg5, var21.field893);
            }
        } else if (arg6 == 1) {
            class80 var37;
            if (var21.field898 == -1 && var21.field895 == null) {
                var37 = var21.method697(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class12(arg4, 1, arg5, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1783(arg0, arg2, arg3, var29, var37, (class80) null, class6.field78[arg5], 0, var32, var33);
            if (var21.field892 != 0) {
                var20.method3758(arg2, arg3, arg6, arg5, var21.field893);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class80 var39;
            class80 var40;
            if (var21.field898 == -1 && var21.field895 == null) {
                var39 = var21.method697(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method697(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class12(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field898, true, (class80) null);
                var40 = new class12(arg4, 2, var38, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1783(arg0, arg2, arg3, var29, var39, var40, class6.field81[arg5], class6.field81[var38], var32, var33);
            if (var21.field892 != 0) {
                var20.method3758(arg2, arg3, arg6, arg5, var21.field893);
            }
        } else if (arg6 == 3) {
            class80 var41;
            if (var21.field898 == -1 && var21.field895 == null) {
                var41 = var21.method697(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class12(arg4, 3, arg5, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1783(arg0, arg2, arg3, var29, var41, (class80) null, class6.field78[arg5], 0, var32, var33);
            if (var21.field892 != 0) {
                var20.method3758(arg2, arg3, arg6, arg5, var21.field893);
            }
        } else if (arg6 == 9) {
            class80 var42;
            if (var21.field898 == -1 && var21.field895 == null) {
                var42 = var21.method697(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1637(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field892 != 0) {
                var20.method3777(arg2, arg3, var22, var23, var21.field893);
            }
        } else if (arg6 == 4) {
            class80 var43;
            if (var21.field898 == -1 && var21.field895 == null) {
                var43 = var21.method697(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var43, (class80) null, class6.field81[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1653(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class38.method489(var45 >> 14 & 0x7FFF).field899;
            }
            class80 var46;
            if (var21.field898 == -1 && var21.field895 == null) {
                var46 = var21.method697(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var46, (class80) null, class6.field81[arg5], 0, class6.field83[arg5] * var44, class6.field79[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1653(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class38.method489(var48 >> 14 & 0x7FFF).field899 / 2;
            }
            class80 var49;
            if (var21.field898 == -1 && var21.field895 == null) {
                var49 = var21.method697(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var49, (class80) null, 256, arg5, class6.field85[arg5] * var47, class6.field87[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class80 var51;
            if (var21.field898 == -1 && var21.field895 == null) {
                var51 = var21.method697(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class12(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var51, (class80) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1653(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class38.method489(var53 >> 14 & 0x7FFF).field899 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class80 var55;
            class80 var56;
            if (var21.field898 == -1 && var21.field895 == null) {
                var55 = var21.method697(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method697(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field898, true, (class80) null);
                var56 = new class12(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field898, true, (class80) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field85[arg5] * var52, class6.field87[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ep.bh(III)V")
    public static final void method2668(int arg0, int arg1) {
        class190 var2 = field357[Statics.field1818][arg0][arg1];
        if (var2 == null) {
            Statics.field189.method1630(Statics.field1818, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3442(); var6 != null; var6 = (class27) var2.method3444()) {
            class47 var7 = class47.method2450(var6.field665);
            long var8 = (long) var7.field1068;
            if (var7.field1067 == 1) {
                var8 = (long) (var6.field656 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field189.method1630(Statics.field1818, arg0, arg1);
            return;
        }
        var2.method3438(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3442(); var12 != null; var12 = (class27) var2.method3444()) {
            if (var5.field665 != var12.field665) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field665 != var12.field665 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field189.method1709(Statics.field1818, arg0, arg1, method3178(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1818), var5, var13, var10, var11);
    }

    @ObfuscatedName("fj.bj(I)V")
    public static final void method2999() {
        field360 = 0;
        field381 = 0;
        field302.method2424();
        int var0 = field302.method2420(1);
        if (var0 != 0) {
            int var1 = field302.method2420(2);
            if (var1 == 0) {
                field431[++field381 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field302.method2420(3);
                Statics.field734.method642(var2, false);
                int var3 = field302.method2420(1);
                if (var3 == 1) {
                    field431[++field381 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field302.method2420(3);
                Statics.field734.method642(var4, true);
                int var5 = field302.method2420(3);
                Statics.field734.method642(var5, true);
                int var6 = field302.method2420(1);
                if (var6 == 1) {
                    field431[++field381 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field302.method2420(1);
                int var8 = field302.method2420(7);
                int var9 = field302.method2420(7);
                Statics.field1818 = field302.method2420(2);
                int var10 = field302.method2420(1);
                if (var10 == 1) {
                    field431[++field381 - 1] = 2047;
                }
                Statics.field734.method641(var8, var9, var7 == 1);
            }
        }
        method3();
        method2110();
        for (int var11 = 0; var11 < field381; var11++) {
            int var12 = field431[var11];
            class3 var13 = field479[var12];
            int var14 = field302.method2314();
            if ((var14 & 0x1) != 0) {
                var14 += field302.method2314() << 8;
            }
            if ((var14 & 0x8) != 0) {
                var13.field794 = field302.method2177();
                if (var13.field794 == 65535) {
                    var13.field794 = -1;
                }
            }
            if ((var14 & 0x400) != 0) {
                int var15 = field302.method2346();
                int var16 = field302.method2201();
                var13.method644(var15, var16, field267);
                var13.field764 = field267 + 300;
                var13.field787 = field302.method2314();
                var13.field789 = field302.method2201();
            }
            if ((var14 & 0x20) != 0) {
                var13.field790 = field302.method2209();
                var13.field791 = field302.method2207();
            }
            if ((var14 & 0x200) != 0) {
                var13.field805 = field302.method2200();
                var13.field784 = field302.method2314();
                var13.field772 = field302.method2202();
                var13.field808 = field302.method2200();
                var13.field809 = field302.method2207() + field267;
                var13.field810 = field302.method2209() + field267;
                var13.field811 = field302.method2201();
                var13.field817 = 1;
                var13.field822 = 0;
            }
            if ((var14 & 0x100) != 0) {
                var13.field800 = field302.method2207();
                int var17 = field302.method2216();
                var13.field804 = var17 >> 16;
                var13.field803 = (var17 & 0xFFFF) + field267;
                var13.field796 = 0;
                var13.field802 = 0;
                if (var13.field803 > field267) {
                    var13.field796 = -1;
                }
                if (var13.field800 == 65535) {
                    var13.field800 = -1;
                }
            }
            if ((var14 & 0x80) != 0) {
                int var18 = field302.method2314();
                byte[] var19 = new byte[var18];
                class111 var20 = new class111(var19);
                field302.method2217(var19, 0, var18);
                field383[var12] = var20;
                var13.method16(var20);
            }
            if ((var14 & 0x10) != 0) {
                int var21 = field302.method2209();
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var22 = field302.method2200();
                method2016(var13, var21, var22);
            }
            if ((var14 & 0x2) != 0) {
                int var23 = field302.method2207();
                int var24 = field302.method2202();
                var13.method644(var23, var24, field267);
                var13.field764 = field267 + 300;
                var13.field787 = field302.method2201();
                var13.field789 = field302.method2314();
            }
            if ((var14 & 0x4) != 0) {
                int var25 = field302.method2177();
                class143 var26 = (class143) class101.method561(class143.method487(), field302.method2200());
                boolean var27 = field302.method2200() == 1;
                int var28 = field302.method2314();
                int var29 = field302.field1885;
                if (var13.field39 != null && var13.field44 != null) {
                    boolean var30 = false;
                    if (var26.field2169 && method101(var13.field39)) {
                        var30 = true;
                    }
                    if (!var30 && field377 == 0 && !var13.field50) {
                        field283.field1885 = 0;
                        field302.method2355(field283.field1889, 0, var28);
                        field283.field1885 = 0;
                        class111 var31 = field283;
                        String var32 = class213.method2640(var31, 32767);
                        String var33 = class214.method3629(class154.method2493(var32));
                        var13.field777 = var33.trim();
                        var13.field781 = var25 >> 8;
                        var13.field782 = var25 & 0xFF;
                        var13.field780 = 150;
                        var13.field778 = var27;
                        var13.field779 = Statics.field734 != var13 && var26.field2169 && field482 != "" && var33.toLowerCase().indexOf(field482) == -1;
                        int var34;
                        if (var26.field2164) {
                            var34 = var27 ? 91 : 1;
                        } else {
                            var34 = var27 ? 90 : 2;
                        }
                        if (var26.field2166 == -1) {
                            class11.method3366(var34, var13.field39, var33);
                        } else {
                            int var36 = var26.field2166;
                            String var37 = "<img=" + var36 + ">";
                            class11.method3366(var34, var37 + var13.field39, var33);
                        }
                    }
                }
                field302.field1885 = var28 + var29;
            }
            if ((var14 & 0x40) != 0) {
                var13.field777 = field302.method2265();
                if (var13.field777.charAt(0) == '~') {
                    var13.field777 = var13.field777.substring(1);
                    class11.method3366(2, var13.field39, var13.field777);
                } else if (Statics.field734 == var13) {
                    class11.method3366(2, var13.field39, var13.field777);
                }
                var13.field778 = false;
                var13.field781 = 0;
                var13.field782 = 0;
                var13.field780 = 150;
            }
        }
        for (int var38 = 0; var38 < field360; var38++) {
            int var39 = field387[var38];
            if (field267 != field479[var39].field786) {
                field479[var39] = null;
            }
        }
        if (field483 != field302.field1885) {
            throw new RuntimeException(field302.field1885 + class2.field19 + field483);
        }
        for (int var40 = 0; var40 < field289; var40++) {
            if (field479[field286[var40]] == null) {
                throw new RuntimeException(var40 + class2.field19 + field289);
            }
        }
    }

    @ObfuscatedName("p.bo(I)V")
    public static final void method3() {
        int var0 = field302.method2420(8);
        if (var0 < field289) {
            for (int var1 = var0; var1 < field289; var1++) {
                field387[++field360 - 1] = field286[var1];
            }
        }
        if (var0 > field289) {
            throw new RuntimeException("");
        }
        field289 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field286[var2];
            class3 var4 = field479[var3];
            int var5 = field302.method2420(1);
            if (var5 == 0) {
                field286[++field289 - 1] = var3;
                var4.field786 = field267;
            } else {
                int var6 = field302.method2420(2);
                if (var6 == 0) {
                    field286[++field289 - 1] = var3;
                    var4.field786 = field267;
                    field431[++field381 - 1] = var3;
                } else if (var6 == 1) {
                    field286[++field289 - 1] = var3;
                    var4.field786 = field267;
                    int var7 = field302.method2420(3);
                    var4.method642(var7, false);
                    int var8 = field302.method2420(1);
                    if (var8 == 1) {
                        field431[++field381 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field286[++field289 - 1] = var3;
                    var4.field786 = field267;
                    int var9 = field302.method2420(3);
                    var4.method642(var9, true);
                    int var10 = field302.method2420(3);
                    var4.method642(var10, true);
                    int var11 = field302.method2420(1);
                    if (var11 == 1) {
                        field431[++field381 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field387[++field360 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("dy.bs(S)V")
    public static final void method2110() {
        while (true) {
            if (field302.method2441(field483) >= 11) {
                int var0 = field302.method2420(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field479[var0] == null) {
                        field479[var0] = new class3();
                        if (field383[var0] != null) {
                            field479[var0].method16(field383[var0]);
                        }
                        var1 = true;
                    }
                    field286[++field289 - 1] = var0;
                    class3 var2 = field479[var0];
                    var2.field786 = field267;
                    int var3 = field347[field302.method2420(3)];
                    if (var1) {
                        var2.field813 = var2.field825 = var3;
                    }
                    int var4 = field302.method2420(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field302.method2420(1);
                    int var6 = field302.method2420(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field302.method2420(1);
                    if (var7 == 1) {
                        field431[++field381 - 1] = var0;
                    }
                    var2.method641(Statics.field734.field818[0] + var4, Statics.field734.field814[0] + var6, var5 == 1);
                    continue;
                }
            }
            field302.method2421();
            return;
        }
    }

    @ObfuscatedName("ej.bi(ZI)V")
    public static final void method2638(boolean arg0) {
        field360 = 0;
        field381 = 0;
        field302.method2424();
        int var1 = field302.method2420(8);
        if (var1 < field298) {
            for (int var2 = var1; var2 < field298; var2++) {
                field387[++field360 - 1] = field278[var2];
            }
        }
        if (var1 > field298) {
            throw new RuntimeException("");
        }
        field298 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field278[var3];
            class32 var5 = field535[var4];
            int var6 = field302.method2420(1);
            if (var6 == 0) {
                field278[++field298 - 1] = var4;
                var5.field786 = field267;
            } else {
                int var7 = field302.method2420(2);
                if (var7 == 0) {
                    field278[++field298 - 1] = var4;
                    var5.field786 = field267;
                    field431[++field381 - 1] = var4;
                } else if (var7 == 1) {
                    field278[++field298 - 1] = var4;
                    var5.field786 = field267;
                    int var8 = field302.method2420(3);
                    var5.method642(var8, false);
                    int var9 = field302.method2420(1);
                    if (var9 == 1) {
                        field431[++field381 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field278[++field298 - 1] = var4;
                    var5.field786 = field267;
                    int var10 = field302.method2420(3);
                    var5.method642(var10, true);
                    int var11 = field302.method2420(3);
                    var5.method642(var11, true);
                    int var12 = field302.method2420(1);
                    if (var12 == 1) {
                        field431[++field381 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field387[++field360 - 1] = var4;
                }
            }
        }
        method133(arg0);
        method1911();
        for (int var13 = 0; var13 < field360; var13++) {
            int var14 = field387[var13];
            if (field267 != field535[var14].field786) {
                field535[var14].field733 = null;
                field535[var14] = null;
            }
        }
        if (field483 != field302.field1885) {
            throw new RuntimeException(field302.field1885 + class2.field19 + field483);
        }
        for (int var15 = 0; var15 < field298; var15++) {
            if (field535[field278[var15]] == null) {
                throw new RuntimeException(var15 + class2.field19 + field298);
            }
        }
    }

    @ObfuscatedName("n.bd(ZI)V")
    public static final void method133(boolean arg0) {
        while (true) {
            if (field302.method2441(field483) >= 27) {
                int var1 = field302.method2420(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field535[var1] == null) {
                        field535[var1] = new class32();
                        var2 = true;
                    }
                    class32 var3 = field535[var1];
                    field278[++field298 - 1] = var1;
                    var3.field786 = field267;
                    int var4;
                    if (arg0) {
                        var4 = field302.method2420(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field302.method2420(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5 = field302.method2420(1);
                    int var6;
                    if (arg0) {
                        var6 = field302.method2420(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field302.method2420(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    var3.field733 = class37.method143(field302.method2420(14));
                    int var7 = field347[field302.method2420(3)];
                    if (var2) {
                        var3.field813 = var3.field825 = var7;
                    }
                    int var8 = field302.method2420(1);
                    if (var8 == 1) {
                        field431[++field381 - 1] = var1;
                    }
                    var3.field768 = var3.field733.field840;
                    var3.field816 = var3.field733.field842;
                    if (var3.field816 == 0) {
                        var3.field825 = 0;
                    }
                    var3.field783 = var3.field733.field846;
                    var3.field806 = var3.field733.field847;
                    var3.field774 = var3.field733.field867;
                    var3.field812 = var3.field733.field834;
                    var3.field769 = var3.field733.field843;
                    var3.field807 = var3.field733.field844;
                    var3.field771 = var3.field733.field845;
                    var3.method641(Statics.field734.field818[0] + var6, Statics.field734.field814[0] + var4, var5 == 1);
                    continue;
                }
            }
            field302.method2421();
            return;
        }
    }

    @ObfuscatedName("cq.bl(I)V")
    public static final void method1911() {
        for (int var0 = 0; var0 < field381; var0++) {
            int var1 = field431[var0];
            class32 var2 = field535[var1];
            int var3 = field302.method2314();
            if ((var3 & 0x4) != 0) {
                var2.field800 = field302.method2346();
                int var4 = field302.method2216();
                var2.field804 = var4 >> 16;
                var2.field803 = (var4 & 0xFFFF) + field267;
                var2.field796 = 0;
                var2.field802 = 0;
                if (var2.field803 > field267) {
                    var2.field796 = -1;
                }
                if (var2.field800 == 65535) {
                    var2.field800 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field733 = class37.method143(field302.method2209());
                var2.field768 = var2.field733.field840;
                var2.field816 = var2.field733.field842;
                var2.field783 = var2.field733.field846;
                var2.field806 = var2.field733.field847;
                var2.field774 = var2.field733.field867;
                var2.field812 = var2.field733.field834;
                var2.field769 = var2.field733.field843;
                var2.field807 = var2.field733.field844;
                var2.field771 = var2.field733.field845;
            }
            if ((var3 & 0x1) != 0) {
                var2.field777 = field302.method2265();
                var2.field780 = 100;
            }
            if ((var3 & 0x2) != 0) {
                int var5 = field302.method2200();
                int var6 = field302.method2202();
                var2.method644(var5, var6, field267);
                var2.field764 = field267 + 300;
                var2.field787 = field302.method2177();
                var2.field789 = field302.method2207();
            }
            if ((var3 & 0x80) != 0) {
                var2.field794 = field302.method2346();
                if (var2.field794 == 65535) {
                    var2.field794 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field790 = field302.method2207();
                var2.field791 = field302.method2209();
            }
            if ((var3 & 0x10) != 0) {
                int var7 = field302.method2207();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field302.method2202();
                if (var2.field795 == var7 && var7 != -1) {
                    int var9 = class40.method678(var7).field949;
                    if (var9 == 1) {
                        var2.field765 = 0;
                        var2.field797 = 0;
                        var2.field798 = var8;
                        var2.field799 = 0;
                    }
                    if (var9 == 2) {
                        var2.field799 = 0;
                    }
                } else if (var7 == -1 || var2.field795 == -1 || class40.method678(var7).field957 >= class40.method678(var2.field795).field957) {
                    var2.field795 = var7;
                    var2.field765 = 0;
                    var2.field797 = 0;
                    var2.field798 = var8;
                    var2.field799 = 0;
                    var2.field822 = var2.field817;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var10 = field302.method2200();
                int var11 = field302.method2314();
                var2.method644(var10, var11, field267);
                var2.field764 = field267 + 300;
                var2.field787 = field302.method2346();
                var2.field789 = field302.method2209();
            }
        }
    }

    @ObfuscatedName("d.be(IIB)V")
    public static final void method79(int arg0, int arg1) {
        if (field402 < 2 && field413 == 0 && !field415) {
            return;
        }
        String var2;
        if (field413 == 1 && field402 < 2) {
            var2 = class148.field2363 + class148.field2373 + field414 + " " + class2.field20;
        } else if (field415 && field402 < 2) {
            var2 = field524 + class148.field2373 + field419 + " " + class2.field20;
        } else {
            var2 = method622(field402 - 1);
        }
        if (field402 > 2) {
            var2 = var2 + class2.method735(16777215) + " " + '/' + " " + (field402 - 2) + class148.field2254;
        }
        Statics.field1900.method3639(var2, arg0 + 4, arg1 + 15, 16777215, 0, field267 / 1000);
    }

    @ObfuscatedName("dh.bz(IIIII)V")
    public static final void method2447(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field465; var4++) {
            if (field485[var4] + field472[var4] > arg0 && field485[var4] < arg0 + arg2 && field461[var4] + field350[var4] > arg1 && field461[var4] < arg1 + arg3) {
                field424[var4] = true;
            }
        }
    }

    @ObfuscatedName("dh.ba(IIIII)V")
    public static final void method2454(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field465; var4++) {
            if (field485[var4] + field472[var4] > arg0 && field485[var4] < arg0 + arg2 && field461[var4] + field350[var4] > arg1 && field461[var4] < arg1 + arg3) {
                field468[var4] = true;
            }
        }
    }

    @ObfuscatedName("dq.bq(IIB)V")
    public static final void method2492(int arg0, int arg1) {
        int var2 = Statics.field1900.method3657(class148.field2366);
        for (int var3 = 0; var3 < field402; var3++) {
            int var4 = Statics.field1900.method3657(method622(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field402 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field594) {
            var6 = Statics.field594 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1958) {
            var7 = Statics.field1958 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field533 = true;
        Statics.field564 = var6;
        Statics.field2606 = var7;
        Statics.field1035 = var2;
        Statics.field2037 = field402 * 15 + 22;
    }

    @ObfuscatedName("ah.br(II)Z")
    public static final boolean method929(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field405[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("af.bf(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method679(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 41) {
            field452.method2426(175);
            field452.method2213(arg1);
            field452.method2365(arg0);
            field452.method2204(arg3);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 20) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(227);
            field452.method2365(Statics.field948 + arg1);
            field452.method2160(class129.field2012[82] ? 1 : 0);
            field452.method2206(Statics.field193 + arg0);
            field452.method2205(arg3);
        }
        if (arg2 == 7) {
            class32 var8 = field535[arg3];
            if (var8 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(192);
                field452.method2204(Statics.field979);
                field452.method2160(class129.field2012[82] ? 1 : 0);
                field452.method2204(Statics.field597);
                field452.method2213(Statics.field824);
                field452.method2206(arg3);
            }
        }
        if (arg2 == 25) {
            class164 var9 = class164.method131(arg1, arg0);
            if (var9 != null) {
                Statics.method3100();
                int var10 = class169.method2784(method84(var9));
                int var11 = var9.field2770;
                class164 var12 = class164.method131(arg1, arg0);
                if (var12 != null && var12.field2780 != null) {
                    class1 var13 = new class1();
                    var13.field3 = var12;
                    var13.field8 = var12.field2780;
                    class34.method2786(var13);
                }
                field417 = var11;
                field415 = true;
                Statics.field140 = arg1;
                field416 = arg0;
                Statics.field563 = var10;
                method2521(var12);
                field413 = 0;
                String var14;
                if (class169.method2784(method84(var9)) == 0) {
                    var14 = null;
                } else if (var9.field2733 == null || var9.field2733.trim().length() == 0) {
                    var14 = null;
                } else {
                    var14 = var9.field2733;
                }
                field524 = var14;
                if (field524 == null) {
                    field524 = "Null";
                }
                if (var9.field2651) {
                    field419 = var9.field2758 + class2.method735(16777215);
                } else {
                    field419 = class2.method735(65280) + var9.field2713 + class2.method735(16777215);
                }
            }
            return;
        }
        if (arg2 == 1003) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            class32 var15 = field535[arg3];
            if (var15 != null) {
                class37 var16 = var15.field733;
                if (var16.field864 != null) {
                    var16 = var16.method662();
                }
                if (var16 != null) {
                    field452.method2426(148);
                    field452.method2206(var16.field852);
                }
            }
        }
        if (arg2 == 50) {
            class3 var17 = field479[arg3];
            if (var17 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(27);
                field452.method2178(class129.field2012[82] ? 1 : 0);
                field452.method2365(arg3);
            }
        }
        if (arg2 == 29) {
            field452.method2426(150);
            field452.method2161(arg1);
            class164 var18 = class164.method6(arg1);
            if (var18.field2762 != null && var18.field2762[0][0] == 5) {
                int var19 = var18.field2762[0][1];
                if (class167.field2804[var19] != var18.field2679[0]) {
                    class167.field2804[var19] = var18.field2679[0];
                    method626(var19);
                }
            }
        }
        if (arg2 == 38) {
            Statics.method3100();
            class164 var20 = class164.method6(arg1);
            field413 = 1;
            Statics.field597 = arg0;
            Statics.field824 = arg1;
            Statics.field979 = arg3;
            method2521(var20);
            field414 = class2.method735(16748608) + class47.method2450(arg3).field1056 + class2.method735(16777215);
            if (field414 == null) {
                field414 = "null";
            }
            return;
        }
        if (arg2 == 23) {
            Statics.field189.method1664(Statics.field1818, arg0, arg1);
        }
        if (arg2 == 15) {
            class3 var21 = field479[arg3];
            if (var21 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(56);
                field452.method2204(arg3);
                field452.method2213(Statics.field140);
                field452.method2365(field416);
                field452.method2160(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field452.method2426(223);
            field452.method2204(arg0);
            field452.method2365(field416);
            field452.method2311(Statics.field140);
            field452.method2161(arg1);
            field452.method2205(arg3);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 31) {
            field452.method2426(25);
            field452.method2206(Statics.field979);
            field452.method2161(arg1);
            field452.method2365(arg3);
            field452.method2204(arg0);
            field452.method2206(Statics.field597);
            field452.method2311(Statics.field824);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 44) {
            class3 var22 = field479[arg3];
            if (var22 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(97);
                field452.method2206(arg3);
                field452.method2160(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field452.method2426(0);
            field452.method2365(arg0);
            field452.method2365(arg3);
            field452.method2213(arg1);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 16) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(8);
            field452.method2211(Statics.field824);
            field452.method2204(Statics.field597);
            field452.method2204(Statics.field979);
            field452.method2365(Statics.field193 + arg0);
            field452.method2205(Statics.field948 + arg1);
            field452.method2205(arg3);
            field452.method2245(class129.field2012[82] ? 1 : 0);
        }
        if (arg2 == 1002) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field452.method2426(152);
            field452.method2204(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 14) {
            class3 var23 = field479[arg3];
            if (var23 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(220);
                field452.method2204(Statics.field979);
                field452.method2178(class129.field2012[82] ? 1 : 0);
                field452.method2204(Statics.field597);
                field452.method2311(Statics.field824);
                field452.method2205(arg3);
            }
        }
        if (arg2 == 1001) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(171);
            field452.method2365(arg3 >> 14 & 0x7FFF);
            field452.method2160(class129.field2012[82] ? 1 : 0);
            field452.method2206(Statics.field193 + arg0);
            field452.method2204(Statics.field948 + arg1);
        }
        if (arg2 == 51) {
            class3 var24 = field479[arg3];
            if (var24 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(61);
                field452.method2178(class129.field2012[82] ? 1 : 0);
                field452.method2365(arg3);
            }
        }
        if (arg2 == 37) {
            field452.method2426(249);
            field452.method2205(arg3);
            field452.method2161(arg1);
            field452.method2365(arg0);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 22) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(28);
            field452.method2204(Statics.field193 + arg0);
            field452.method2206(Statics.field948 + arg1);
            field452.method2204(arg3);
            field452.method2178(class129.field2012[82] ? 1 : 0);
        }
        if (arg2 == 58) {
            class164 var25 = class164.method131(arg1, arg0);
            if (var25 != null) {
                field452.method2426(119);
                field452.method2311(Statics.field140);
                field452.method2206(field417);
                field452.method2206(var25.field2770);
                field452.method2204(arg0);
                field452.method2311(arg1);
                field452.method2205(field416);
            }
        }
        if (arg2 == 11) {
            class32 var26 = field535[arg3];
            if (var26 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(244);
                field452.method2204(arg3);
                field452.method2160(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field452.method2426(186);
            field452.method2213(arg1);
            field452.method2205(arg0);
            field452.method2206(arg3);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 28) {
            field452.method2426(150);
            field452.method2161(arg1);
            class164 var27 = class164.method6(arg1);
            if (var27.field2762 != null && var27.field2762[0][0] == 5) {
                int var28 = var27.field2762[0][1];
                class167.field2804[var28] = 1 - class167.field2804[var28];
                method626(var28);
            }
        }
        if (arg2 == 48) {
            class3 var29 = field479[arg3];
            if (var29 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(124);
                field452.method2205(arg3);
                field452.method2160(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field452.method2426(144);
            field452.method2205(arg3);
            field452.method2161(arg1);
            field452.method2205(arg0);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 1005) {
            class164 var30 = class164.method6(arg1);
            if (var30 == null || var30.field2769[arg0] < 100000) {
                field452.method2426(165);
                field452.method2365(arg3);
            } else {
                class11.method3366(27, "", var30.field2769[arg0] + " x " + class47.method2450(arg3).field1056);
            }
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 19) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(40);
            field452.method2365(arg3);
            field452.method2206(Statics.field948 + arg1);
            field452.method2321(class129.field2012[82] ? 1 : 0);
            field452.method2365(Statics.field193 + arg0);
        }
        if (arg2 == 4) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(3);
            field452.method2245(class129.field2012[82] ? 1 : 0);
            field452.method2205(Statics.field193 + arg0);
            field452.method2365(Statics.field948 + arg1);
            field452.method2205(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(67);
            field452.method2245(class129.field2012[82] ? 1 : 0);
            field452.method2205(Statics.field193 + arg0);
            field452.method2365(arg3);
            field452.method2206(Statics.field948 + arg1);
        }
        if (arg2 == 3) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(188);
            field452.method2206(Statics.field193 + arg0);
            field452.method2206(Statics.field948 + arg1);
            field452.method2321(class129.field2012[82] ? 1 : 0);
            field452.method2365(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 30 && field506 == null) {
            method2958(arg1, arg0);
            field506 = class164.method131(arg1, arg0);
            method2521(field506);
        }
        if (arg2 == 10) {
            class32 var31 = field535[arg3];
            if (var31 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(248);
                field452.method2206(arg3);
                field452.method2178(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var32 = field479[arg3];
            if (var32 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(43);
                field452.method2178(class129.field2012[82] ? 1 : 0);
                field452.method2206(arg3);
            }
        }
        if (arg2 == 5) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(207);
            field452.method2206(arg3 >> 14 & 0x7FFF);
            field452.method2321(class129.field2012[82] ? 1 : 0);
            field452.method2206(Statics.field193 + arg0);
            field452.method2365(Statics.field948 + arg1);
        }
        if (arg2 == 8) {
            class32 var33 = field535[arg3];
            if (var33 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(149);
                field452.method2205(field416);
                field452.method2365(arg3);
                field452.method2245(class129.field2012[82] ? 1 : 0);
                field452.method2311(Statics.field140);
            }
        }
        if (arg2 == 33) {
            field452.method2426(251);
            field452.method2365(arg3);
            field452.method2205(arg0);
            field452.method2161(arg1);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 47) {
            class3 var34 = field479[arg3];
            if (var34 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(11);
                field452.method2206(arg3);
                field452.method2245(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field452.method2426(116);
            field452.method2161(arg1);
            field452.method2204(arg3);
            field452.method2365(arg0);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 24) {
            class164 var35 = class164.method6(arg1);
            boolean var36 = true;
            if (var35.field2763 > 0) {
                var36 = method2787(var35);
            }
            if (var36) {
                field452.method2426(150);
                field452.method2161(arg1);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var37 = class164.method131(arg1, arg0);
            if (var37 != null) {
                int var38 = var37.field2770;
                class164 var39 = class164.method131(arg1, arg0);
                if (var39 != null) {
                    if (var39.field2750 != null) {
                        class1 var40 = new class1();
                        var40.field3 = var39;
                        var40.field6 = arg3;
                        var40.field10 = arg5;
                        var40.field8 = var39.field2750;
                        class34.method2786(var40);
                    }
                    boolean var41 = true;
                    if (var39.field2763 > 0) {
                        var41 = method2787(var39);
                    }
                    if (var41 && class169.method2004(method84(var39), arg3 - 1)) {
                        if (arg3 == 1) {
                            field452.method2426(95);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                        if (arg3 == 2) {
                            field452.method2426(130);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                        if (arg3 == 3) {
                            field452.method2426(203);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                        if (arg3 == 4) {
                            field452.method2426(226);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                        if (arg3 == 5) {
                            field452.method2426(62);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                        if (arg3 == 6) {
                            field452.method2426(13);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                        if (arg3 == 7) {
                            field452.method2426(73);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                        if (arg3 == 8) {
                            field452.method2426(253);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                        if (arg3 == 9) {
                            field452.method2426(191);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                        if (arg3 == 10) {
                            field452.method2426(128);
                            field452.method2161(arg1);
                            field452.method2365(arg0);
                            field452.method2365(var38);
                        }
                    }
                }
            }
        }
        if (arg2 == 9) {
            class32 var42 = field535[arg3];
            if (var42 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(5);
                field452.method2206(arg3);
                field452.method2160(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 45) {
            class3 var43 = field479[arg3];
            if (var43 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(213);
                field452.method2365(arg3);
                field452.method2321(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field452.method2426(161);
            field452.method2205(arg3);
            field452.method2311(arg1);
            field452.method2365(arg0);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 17) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(236);
            field452.method2311(Statics.field140);
            field452.method2204(Statics.field193 + arg0);
            field452.method2204(field416);
            field452.method2321(class129.field2012[82] ? 1 : 0);
            field452.method2206(Statics.field948 + arg1);
            field452.method2204(arg3);
        }
        if (arg2 == 2) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(153);
            field452.method2160(class129.field2012[82] ? 1 : 0);
            field452.method2204(Statics.field948 + arg1);
            field452.method2204(field416);
            field452.method2205(arg3 >> 14 & 0x7FFF);
            field452.method2365(Statics.field193 + arg0);
            field452.method2311(Statics.field140);
        }
        if (arg2 == 46) {
            class3 var44 = field479[arg3];
            if (var44 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(225);
                field452.method2206(arg3);
                field452.method2160(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 1004) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field452.method2426(165);
            field452.method2365(arg3);
        }
        if (arg2 == 13) {
            class32 var45 = field535[arg3];
            if (var45 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(217);
                field452.method2206(arg3);
                field452.method2321(class129.field2012[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(178);
            field452.method2321(class129.field2012[82] ? 1 : 0);
            field452.method2204(Statics.field948 + arg1);
            field452.method2205(Statics.field193 + arg0);
            field452.method2204(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 26) {
            field452.method2426(120);
            for (class4 var46 = (class4) field421.method3412(); var46 != null; var46 = (class4) field421.method3410()) {
                if (var46.field54 == 0 || var46.field54 == 3) {
                    method2415(var46, true);
                }
            }
            if (field506 != null) {
                method2521(field506);
                field506 = null;
            }
        }
        if (arg2 == 1) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(100);
            field452.method2205(Statics.field948 + arg1);
            field452.method2211(Statics.field824);
            field452.method2204(Statics.field597);
            field452.method2321(class129.field2012[82] ? 1 : 0);
            field452.method2205(Statics.field979);
            field452.method2206(Statics.field193 + arg0);
            field452.method2205(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 39) {
            field452.method2426(252);
            field452.method2204(arg0);
            field452.method2161(arg1);
            field452.method2206(arg3);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 18) {
            field365 = arg6;
            field366 = arg7;
            field324 = 2;
            field367 = 0;
            field418 = arg0;
            field280 = arg1;
            field452.method2426(243);
            field452.method2365(Statics.field948 + arg1);
            field452.method2321(class129.field2012[82] ? 1 : 0);
            field452.method2205(arg3);
            field452.method2365(Statics.field193 + arg0);
        }
        if (arg2 == 42) {
            field452.method2426(7);
            field452.method2204(arg3);
            field452.method2204(arg0);
            field452.method2211(arg1);
            field263 = 0;
            Statics.field230 = class164.method6(arg1);
            field370 = arg0;
        }
        if (arg2 == 12) {
            class32 var47 = field535[arg3];
            if (var47 != null) {
                field365 = arg6;
                field366 = arg7;
                field324 = 2;
                field367 = 0;
                field418 = arg0;
                field280 = arg1;
                field452.method2426(181);
                field452.method2160(class129.field2012[82] ? 1 : 0);
                field452.method2204(arg3);
            }
        }
        if (field413 != 0) {
            field413 = 0;
            method2521(class164.method6(Statics.field824));
        }
        if (field415) {
            Statics.method3100();
        }
        if (Statics.field230 != null && field263 == 0) {
            method2521(Statics.field230);
        }
    }

    @ObfuscatedName("ff.bm(III)V")
    public static void method2958(int arg0, int arg1) {
        field452.method2426(204);
        field452.method2211(arg0);
        field452.method2204(arg1);
    }

    @ObfuscatedName("k.bu(I)V")
    public static final void method11() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field402 - 1; var1++) {
                if (field405[var1] < 1000 && field405[var1 + 1] > 1000) {
                    String var2 = field408[var1];
                    field408[var1] = field408[var1 + 1];
                    field408[var1 + 1] = var2;
                    String var3 = field407[var1];
                    field407[var1] = field407[var1 + 1];
                    field407[var1 + 1] = var3;
                    int var4 = field405[var1];
                    field405[var1] = field405[var1 + 1];
                    field405[var1 + 1] = var4;
                    int var5 = field394[var1];
                    field394[var1] = field394[var1 + 1];
                    field394[var1 + 1] = var5;
                    int var6 = field404[var1];
                    field404[var1] = field404[var1 + 1];
                    field404[var1 + 1] = var6;
                    int var7 = field406[var1];
                    field406[var1] = field406[var1 + 1];
                    field406[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("bd.cz(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1352(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field533 || field402 >= 500) {
            return;
        }
        field407[field402] = arg0;
        field408[field402] = arg1;
        field405[field402] = arg2;
        field406[field402] = arg3;
        field394[field402] = arg4;
        field404[field402] = arg5;
        field402++;
    }

    @ObfuscatedName("aq.cl(IB)Ljava/lang/String;")
    public static String method622(int arg0) {
        return field408[arg0].length() > 0 ? field407[arg0] + class148.field2373 + field408[arg0] : field407[arg0];
    }

    @ObfuscatedName("da.co(Laf;IIII)V")
    public static final void method2528(class37 arg0, int arg1, int arg2, int arg3) {
        if (field402 >= 400) {
            return;
        }
        if (arg0.field864 != null) {
            arg0 = arg0.method662();
        }
        if (arg0 == null || !arg0.field872 || arg0.field869 && field428 != arg1) {
            return;
        }
        String var4 = arg0.field839;
        if (arg0.field848 != 0) {
            int var6 = arg0.field848;
            int var7 = Statics.field734.field35;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method735(16711680);
            } else if (var8 < -6) {
                var9 = class2.method735(16723968);
            } else if (var8 < -3) {
                var9 = class2.method735(16740352);
            } else if (var8 < 0) {
                var9 = class2.method735(16756736);
            } else if (var8 > 9) {
                var9 = class2.method735(65280);
            } else if (var8 > 6) {
                var9 = class2.method735(4259584);
            } else if (var8 > 3) {
                var9 = class2.method735(8453888);
            } else if (var8 > 0) {
                var9 = class2.method735(12648192);
            } else {
                var9 = class2.method735(16776960);
            }
            var4 = var4 + var9 + " " + class2.field23 + class148.field2369 + arg0.field848 + class2.field24;
        }
        if (field413 == 1) {
            method1352(class148.field2363, field414 + " " + class2.field20 + " " + class2.method735(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field415) {
            String[] var10 = arg0.field854;
            if (field496) {
                var10 = method2449(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class148.field2365)) {
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
                        method1352(var10[var11], class2.method735(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class148.field2365)) {
                        short var14 = 0;
                        if (field285 == class19.field552 || field285 == class19.field550 && arg0.field848 > Statics.field734.field35) {
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
                        method1352(var10[var13], class2.method735(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method1352(class148.field2364, class2.method735(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field563 & 0x2) == 2) {
            method1352(field524, field419 + " " + class2.field20 + " " + class2.method735(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("do.ca(Le;IIII)V")
    public static final void method2413(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field734 == arg0 || field402 >= 400) {
            return;
        }
        String var9;
        if (arg0.field36 == 0) {
            String var4 = arg0.field39;
            int var5 = arg0.field35;
            int var6 = Statics.field734.field35;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method735(16711680);
            } else if (var7 < -6) {
                var8 = class2.method735(16723968);
            } else if (var7 < -3) {
                var8 = class2.method735(16740352);
            } else if (var7 < 0) {
                var8 = class2.method735(16756736);
            } else if (var7 > 9) {
                var8 = class2.method735(65280);
            } else if (var7 > 6) {
                var8 = class2.method735(4259584);
            } else if (var7 > 3) {
                var8 = class2.method735(8453888);
            } else if (var7 > 0) {
                var8 = class2.method735(12648192);
            } else {
                var8 = class2.method735(16776960);
            }
            var9 = var4 + var8 + " " + class2.field23 + class148.field2369 + arg0.field35 + class2.field24;
        } else {
            var9 = arg0.field39 + " " + class2.field23 + class148.field2370 + arg0.field36 + class2.field24;
        }
        if (field413 == 1) {
            method1352(class148.field2363, field414 + " " + class2.field20 + " " + class2.method735(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field415) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field389[var10] != null) {
                    short var11 = 0;
                    if (field389[var10].equalsIgnoreCase(class148.field2365)) {
                        if (field285 == class19.field552 || field285 == class19.field550 && arg0.field35 > Statics.field734.field35) {
                            var11 = 2000;
                        }
                        if (Statics.field734.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field734.field49 == arg0.field49) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field390[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field291[var10] + var11;
                    method1352(field389[var10], class2.method735(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field563 & 0x8) == 8) {
            method1352(field524, field419 + " " + class2.field20 + " " + class2.method735(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field402; var14++) {
            if (field405[var14] == 23) {
                field408[var14] = class2.method735(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("cr.ci(IIIIIIIII)V")
    public static final void method2107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method3121(arg0)) {
            Statics.field1122 = null;
            method565(Statics.field2642[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1122 != null) {
                method565(Statics.field1122, -1412584499, arg1, arg2, arg3, arg4, Statics.field1867, Statics.field2078, arg7);
                Statics.field1122 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field424[var8] = true;
            }
        } else {
            field424[arg7] = true;
        }
    }

    @ObfuscatedName("a.cn([Lfh;IIIIIIIIB)V")
    public static final void method565(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1534(arg2, arg3, arg4, arg5);
        class86.method1804();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2725 == arg1 || arg1 == -1412584499 && field433 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field485[field465] = var10.field2665 + arg6;
                    field461[field465] = var10.field2666 + arg7;
                    field472[field465] = var10.field2667;
                    field350[field465] = var10.field2668;
                    var11 = ++field465 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2781 = var11;
                var10.field2782 = field267;
                if (!var10.field2651 || !method485(var10)) {
                    if (var10.field2763 > 0) {
                        int var12 = var10.field2763;
                        if (var12 == 324) {
                            if (field290 == -1) {
                                field290 = var10.field2685;
                                field537 = var10.field2772;
                            }
                            if (field436.field2818) {
                                var10.field2685 = field290;
                            } else {
                                var10.field2685 = field537;
                            }
                        } else if (var12 == 325) {
                            if (field290 == -1) {
                                field290 = var10.field2685;
                                field537 = var10.field2772;
                            }
                            if (field436.field2818) {
                                var10.field2685 = field537;
                            } else {
                                var10.field2685 = field290;
                            }
                        } else if (var12 == 327) {
                            var10.field2735 = 150;
                            var10.field2702 = (int) (Math.sin((double) field267 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2693 = 5;
                            var10.field2694 = 0;
                        } else if (var12 == 328) {
                            var10.field2735 = 150;
                            var10.field2702 = (int) (Math.sin((double) field267 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2693 = 5;
                            var10.field2694 = 1;
                        }
                    }
                    int var13 = var10.field2665 + arg6;
                    int var14 = var10.field2666 + arg7;
                    int var15 = var10.field2682;
                    if (field433 == var10) {
                        if (arg1 != -1412584499 && !var10.field2656) {
                            Statics.field1122 = arg0;
                            Statics.field1867 = arg6;
                            Statics.field2078 = arg7;
                            continue;
                        }
                        if (field329 && field438) {
                            int var16 = class132.field2050;
                            int var17 = class132.field2051;
                            int var18 = var16 - field435;
                            int var19 = var17 - field380;
                            if (var18 < field439) {
                                var18 = field439;
                            }
                            if (var10.field2667 + var18 > field439 + field281.field2667) {
                                var18 = field439 + field281.field2667 - var10.field2667;
                            }
                            if (var19 < field440) {
                                var19 = field440;
                            }
                            if (var10.field2668 + var19 > field440 + field281.field2668) {
                                var19 = field440 + field281.field2668 - var10.field2668;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2656) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2654 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2654 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2667 + var13;
                        int var27 = var10.field2668 + var14;
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
                        int var30 = var10.field2667 + var13;
                        int var31 = var10.field2668 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2651 || var20 < var22 && var21 < var23) {
                        if (var10.field2763 != 0) {
                            if (var10.field2763 == 1336) {
                                if (field273) {
                                    var14 += 15;
                                    Statics.field60.method3631("Fps:" + field2100, var10.field2667 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field253) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field253) {
                                        var34 = 16711680;
                                    }
                                    Statics.field60.method3631("Mem:" + var33 + "k", var10.field2667 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2763 == 1337) {
                                field409 = var13;
                                field410 = var14;
                                int var37 = var10.field2667;
                                int var38 = var10.field2668;
                                field362++;
                                method3555(class31.field728);
                                boolean var39 = false;
                                if (field392 >= 0) {
                                    for (int var40 = 0; var40 < field289; var40++) {
                                        if (field392 == field286[var40]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method3555(class31.field727);
                                }
                                method3129(true);
                                method3555(var39 ? class31.field729 : class31.field726);
                                method3129(false);
                                method1799();
                                for (class28 var41 = (class28) field294.method3442(); var41 != null; var41 = (class28) field294.method3444()) {
                                    if (Statics.field1818 != var41.field678 || var41.field668) {
                                        var41.method3533();
                                    } else if (field267 >= var41.field675) {
                                        var41.method586(field335);
                                        if (var41.field668) {
                                            var41.method3533();
                                        } else {
                                            Statics.field189.method1638(var41.field678, var41.field666, var41.field670, var41.field671, 60, var41, 0, -1, false);
                                        }
                                    }
                                }
                                method2799(var13, var14, var37, var38, true);
                                int var42 = field317;
                                int var43 = field525;
                                int var44 = field526;
                                int var45 = field527;
                                class75.method1534(var42, var43, var42 + var44, var43 + var45);
                                class86.method1804();
                                if (!field510) {
                                    int var46 = field319;
                                    if (field514 / 256 > var46) {
                                        var46 = field514 / 256;
                                    }
                                    if (field511[4] && field513[4] + 128 > var46) {
                                        var46 = field513[4] + 128;
                                    }
                                    int var47 = field343 + field327 & 0x7FF;
                                    method1894(Statics.field2069, method3178(Statics.field734.field773, Statics.field734.field775, Statics.field1818) - 50, Statics.field1059, var46, var47, var46 * 3 + 600);
                                }
                                int var60;
                                if (field510) {
                                    int var61;
                                    if (Statics.field71.field134) {
                                        var61 = Statics.field1818;
                                    } else {
                                        int var62 = method3178(Statics.field175, Statics.field962, Statics.field1818);
                                        if (var62 - Statics.field1924 >= 800 || (class6.field72[Statics.field1818][Statics.field175 >> 7][Statics.field962 >> 7] & 0x4) == 0) {
                                            var61 = 3;
                                        } else {
                                            var61 = Statics.field1818;
                                        }
                                    }
                                    var60 = var61;
                                } else {
                                    int var48;
                                    if (Statics.field71.field134) {
                                        var48 = Statics.field1818;
                                    } else {
                                        int var49 = 3;
                                        if (Statics.field2562 < 310) {
                                            int var50 = Statics.field175 >> 7;
                                            int var51 = Statics.field962 >> 7;
                                            int var52 = Statics.field734.field773 >> 7;
                                            int var53 = Statics.field734.field775 >> 7;
                                            if ((class6.field72[Statics.field1818][var50][var51] & 0x4) != 0) {
                                                var49 = Statics.field1818;
                                            }
                                            int var54;
                                            if (var52 > var50) {
                                                var54 = var52 - var50;
                                            } else {
                                                var54 = var50 - var52;
                                            }
                                            int var55;
                                            if (var53 > var51) {
                                                var55 = var53 - var51;
                                            } else {
                                                var55 = var51 - var53;
                                            }
                                            if (var54 > var55) {
                                                int var56 = var55 * 65536 / var54;
                                                int var57 = 32768;
                                                while (var50 != var52) {
                                                    if (var50 < var52) {
                                                        var50++;
                                                    } else if (var50 > var52) {
                                                        var50--;
                                                    }
                                                    if ((class6.field72[Statics.field1818][var50][var51] & 0x4) != 0) {
                                                        var49 = Statics.field1818;
                                                    }
                                                    var57 += var56;
                                                    if (var57 >= 65536) {
                                                        var57 -= 65536;
                                                        if (var51 < var53) {
                                                            var51++;
                                                        } else if (var51 > var53) {
                                                            var51--;
                                                        }
                                                        if ((class6.field72[Statics.field1818][var50][var51] & 0x4) != 0) {
                                                            var49 = Statics.field1818;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var58 = var54 * 65536 / var55;
                                                int var59 = 32768;
                                                while (var51 != var53) {
                                                    if (var51 < var53) {
                                                        var51++;
                                                    } else if (var51 > var53) {
                                                        var51--;
                                                    }
                                                    if ((class6.field72[Statics.field1818][var50][var51] & 0x4) != 0) {
                                                        var49 = Statics.field1818;
                                                    }
                                                    var59 += var58;
                                                    if (var59 >= 65536) {
                                                        var59 -= 65536;
                                                        if (var50 < var52) {
                                                            var50++;
                                                        } else if (var50 > var52) {
                                                            var50--;
                                                        }
                                                        if ((class6.field72[Statics.field1818][var50][var51] & 0x4) != 0) {
                                                            var49 = Statics.field1818;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field72[Statics.field1818][Statics.field734.field773 >> 7][Statics.field734.field775 >> 7] & 0x4) != 0) {
                                            var49 = Statics.field1818;
                                        }
                                        var48 = var49;
                                    }
                                    var60 = var48;
                                }
                                int var63 = Statics.field175;
                                int var64 = Statics.field1924;
                                int var65 = Statics.field962;
                                int var66 = Statics.field2562;
                                int var67 = Statics.field1567;
                                for (int var68 = 0; var68 < 5; var68++) {
                                    if (field511[var68]) {
                                        int var69 = (int) (Math.random() * (double) (field447[var68] * 2 + 1) - (double) field447[var68] + Math.sin((double) field336[var68] / 100.0D * (double) field540[var68]) * (double) field513[var68]);
                                        if (var68 == 0) {
                                            Statics.field175 += var69;
                                        }
                                        if (var68 == 1) {
                                            Statics.field1924 += var69;
                                        }
                                        if (var68 == 2) {
                                            Statics.field962 += var69;
                                        }
                                        if (var68 == 3) {
                                            Statics.field1567 = Statics.field1567 + var69 & 0x7FF;
                                        }
                                        if (var68 == 4) {
                                            Statics.field2562 += var69;
                                            if (Statics.field2562 < 128) {
                                                Statics.field2562 = 128;
                                            }
                                            if (Statics.field2562 > 383) {
                                                Statics.field2562 = 383;
                                            }
                                        }
                                    }
                                }
                                int var70 = class132.field2050;
                                int var71 = class132.field2051;
                                if (class132.field2056 != 0) {
                                    var70 = class132.field2057;
                                    var71 = class132.field2058;
                                }
                                if (var70 >= var42 && var70 < var42 + var44 && var71 >= var43 && var71 < var43 + var45) {
                                    class100.field1784 = true;
                                    class100.field1787 = 0;
                                    class100.field1785 = var70 - var42;
                                    class100.field1752 = var71 - var43;
                                } else {
                                    class100.field1784 = false;
                                    class100.field1787 = 0;
                                }
                                method2769();
                                class75.method1532(var42, var43, var44, var45, 0);
                                method2769();
                                int var72 = class86.field1503;
                                class86.field1503 = field528;
                                Statics.field189.method1665(Statics.field175, Statics.field1924, Statics.field962, Statics.field2562, Statics.field1567, var60);
                                class86.field1503 = var72;
                                method2769();
                                Statics.field189.method1781();
                                method102(var42, var43, var44, var45);
                                method2475(var42, var43);
                                ((class90) Statics.field1507).method1907(field335);
                                method3564(var42, var43, var44, var45);
                                Statics.field175 = var63;
                                Statics.field1924 = var64;
                                Statics.field962 = var65;
                                Statics.field2562 = var66;
                                Statics.field1567 = var67;
                                if (field266) {
                                    byte var73 = 0;
                                    int var74 = class162.field2623 + class162.field2617 + var73;
                                    if (var74 == 0) {
                                        field266 = false;
                                    }
                                }
                                if (field266) {
                                    class75.method1532(var42, var43, var44, var45, 0);
                                    method3099(class148.field2222, false);
                                }
                                field424[var10.field2781] = true;
                                class75.method1534(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2763 == 1338) {
                                method30(var10, var13, var14, var11);
                                class75.method1534(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2763 == 1339) {
                                method97(var10, var13, var14, var11);
                                class75.method1534(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2654 == 0) {
                            if (!var10.field2651 && method485(var10) && Statics.field169 != var10) {
                                continue;
                            }
                            if (!var10.field2651) {
                                if (var10.field2674 > var10.field2779 - var10.field2668) {
                                    var10.field2674 = var10.field2779 - var10.field2668;
                                }
                                if (var10.field2674 < 0) {
                                    var10.field2674 = 0;
                                }
                            }
                            method565(arg0, var10.field2652, var20, var21, var22, var23, var13 - var10.field2711, var14 - var10.field2674, var11);
                            if (var10.field2684 != null) {
                                method565(var10.field2684, var10.field2652, var20, var21, var22, var23, var13 - var10.field2711, var14 - var10.field2674, var11);
                            }
                            class4 var76 = (class4) field421.method3405((long) var10.field2652);
                            if (var76 != null) {
                                method2107(var76.field55, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class75.method1534(arg2, arg3, arg4, arg5);
                            class86.method1804();
                        }
                        if (field441 || field469[var11] || field474 > 1) {
                            if (var10.field2654 == 0 && !var10.field2651 && var10.field2779 > var10.field2668) {
                                method618(var10.field2667 + var13, var14, var10.field2674, var10.field2668, var10.field2779);
                            }
                            if (var10.field2654 != 1) {
                                if (var10.field2654 == 2) {
                                    int var77 = 0;
                                    for (int var78 = 0; var78 < var10.field2664; var78++) {
                                        for (int var79 = 0; var79 < var10.field2663; var79++) {
                                            int var80 = (var10.field2716 + 32) * var79 + var13;
                                            int var81 = (var10.field2689 + 32) * var78 + var14;
                                            if (var77 < 20) {
                                                var80 += var10.field2718[var77];
                                                var81 += var10.field2719[var77];
                                            }
                                            if (var10.field2695[var77] > 0) {
                                                boolean var82 = false;
                                                boolean var83 = false;
                                                int var84 = var10.field2695[var77] - 1;
                                                if (var80 + 32 > arg2 && var80 < arg4 && var81 + 32 > arg3 && var81 < arg5 || Statics.field65 == var10 && field371 == var77) {
                                                    class74 var85;
                                                    if (field413 == 1 && Statics.field597 == var77 && Statics.field824 == var10.field2652) {
                                                        var85 = class47.method517(var84, var10.field2769[var77], 2, 0, 2, false);
                                                    } else {
                                                        var85 = class47.method517(var84, var10.field2769[var77], 1, 3153952, 2, false);
                                                    }
                                                    if (var85 == null) {
                                                        method2521(var10);
                                                    } else if (Statics.field65 == var10 && field371 == var77) {
                                                        int var86 = class132.field2050 - field372;
                                                        int var87 = class132.field2051 - field373;
                                                        if (var86 < 5 && var86 > -5) {
                                                            var86 = 0;
                                                        }
                                                        if (var87 < 5 && var87 > -5) {
                                                            var87 = 0;
                                                        }
                                                        if (field376 < 5) {
                                                            var86 = 0;
                                                            var87 = 0;
                                                        }
                                                        var85.method1444(var80 + var86, var81 + var87, 128);
                                                        if (arg1 != -1) {
                                                            class164 var88 = arg0[arg1 & 0xFFFF];
                                                            if (var81 + var87 < class75.field1353 && var88.field2674 > 0) {
                                                                int var89 = field335 * (class75.field1353 - var81 - var87) / 3;
                                                                if (var89 > field335 * 10) {
                                                                    var89 = field335 * 10;
                                                                }
                                                                if (var89 > var88.field2674) {
                                                                    var89 = var88.field2674;
                                                                }
                                                                var88.field2674 -= var89;
                                                                field373 += var89;
                                                                method2521(var88);
                                                            }
                                                            if (var81 + var87 + 32 > class75.field1350 && var88.field2674 < var88.field2779 - var88.field2668) {
                                                                int var90 = field335 * (var81 + var87 + 32 - class75.field1350) / 3;
                                                                if (var90 > field335 * 10) {
                                                                    var90 = field335 * 10;
                                                                }
                                                                if (var90 > var88.field2779 - var88.field2668 - var88.field2674) {
                                                                    var90 = var88.field2779 - var88.field2668 - var88.field2674;
                                                                }
                                                                var88.field2674 += var90;
                                                                field373 -= var90;
                                                                method2521(var88);
                                                            }
                                                        }
                                                    } else if (Statics.field230 == var10 && field370 == var77) {
                                                        var85.method1444(var80, var81, 128);
                                                    } else {
                                                        var85.method1455(var80, var81);
                                                    }
                                                }
                                            } else if (var10.field2701 != null && var77 < 20) {
                                                class74 var91 = var10.method3040(var77);
                                                if (var91 != null) {
                                                    var91.method1455(var80, var81);
                                                } else if (class164.field2650) {
                                                    method2521(var10);
                                                }
                                            }
                                            var77++;
                                        }
                                    }
                                } else if (var10.field2654 == 3) {
                                    int var92;
                                    if (method2819(var10)) {
                                        var92 = var10.field2726;
                                        if (Statics.field169 == var10 && var10.field2680 != 0) {
                                            var92 = var10.field2680;
                                        }
                                    } else {
                                        var92 = var10.field2677;
                                        if (Statics.field169 == var10 && var10.field2741 != 0) {
                                            var92 = var10.field2741;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2681) {
                                            class75.method1532(var13, var14, var10.field2667, var10.field2668, var92);
                                        } else {
                                            class75.method1542(var13, var14, var10.field2667, var10.field2668, var92);
                                        }
                                    } else if (var10.field2681) {
                                        class75.method1557(var13, var14, var10.field2667, var10.field2668, var92, 256 - (var15 & 0xFF));
                                    } else {
                                        class75.method1536(var13, var14, var10.field2667, var10.field2668, var92, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2654 == 4) {
                                    class215 var93 = var10.method3039();
                                    if (var93 != null) {
                                        String var94 = var10.field2710;
                                        int var95;
                                        if (method2819(var10)) {
                                            var95 = var10.field2726;
                                            if (Statics.field169 == var10 && var10.field2680 != 0) {
                                                var95 = var10.field2680;
                                            }
                                            if (var10.field2754.length() > 0) {
                                                var94 = var10.field2754;
                                            }
                                        } else {
                                            var95 = var10.field2677;
                                            if (Statics.field169 == var10 && var10.field2741 != 0) {
                                                var95 = var10.field2741;
                                            }
                                        }
                                        if (var10.field2651 && var10.field2770 != -1) {
                                            class47 var96 = class47.method2450(var10.field2770);
                                            var94 = var96.field1056;
                                            if (var94 == null) {
                                                var94 = "null";
                                            }
                                            if ((var96.field1067 == 1 || var10.field2761 != 1) && var10.field2761 != -1) {
                                                var94 = class2.method735(16748608) + var94 + class2.field18 + " " + 'x' + method148(var10.field2761);
                                            }
                                        }
                                        if (field506 == var10) {
                                            class148 var10000 = (class148) null;
                                            var94 = class148.field2371;
                                            var95 = var10.field2677;
                                        }
                                        if (!var10.field2651) {
                                            var94 = method1349(var94, var10);
                                        }
                                        var93.method3637(var94, var13, var14, var10.field2667, var10.field2668, var95, var10.field2676 ? 0 : -1, var10.field2768, var10.field2714, var10.field2712);
                                    } else if (class164.field2650) {
                                        method2521(var10);
                                    }
                                } else if (var10.field2654 == 5) {
                                    if (var10.field2651) {
                                        class74 var98;
                                        if (var10.field2770 == -1) {
                                            var98 = var10.method3038(false);
                                        } else {
                                            var98 = class47.method517(var10.field2770, var10.field2761, var10.field2748, var10.field2683, var10.field2771, false);
                                        }
                                        if (var98 != null) {
                                            int var99 = var98.field1343;
                                            int var100 = var98.field1342;
                                            if (var10.field2688) {
                                                class75.method1535(var13, var14, var10.field2667 + var13, var10.field2668 + var14);
                                                int var101 = (var10.field2667 + (var99 - 1)) / var99;
                                                int var102 = (var10.field2668 + (var100 - 1)) / var100;
                                                for (int var103 = 0; var103 < var101; var103++) {
                                                    for (int var104 = 0; var104 < var102; var104++) {
                                                        if (var10.field2708 != 0) {
                                                            var98.method1468(var99 / 2 + var99 * var103 + var13, var100 / 2 + var100 * var104 + var14, var10.field2708, 4096);
                                                        } else if (var15 == 0) {
                                                            var98.method1455(var99 * var103 + var13, var100 * var104 + var14);
                                                        } else {
                                                            var98.method1444(var99 * var103 + var13, var100 * var104 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1534(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var105 = var10.field2667 * 4096 / var99;
                                                if (var10.field2708 != 0) {
                                                    var98.method1468(var10.field2667 / 2 + var13, var10.field2668 / 2 + var14, var10.field2708, var105);
                                                } else if (var15 != 0) {
                                                    var98.method1463(var13, var14, var10.field2667, var10.field2668, 256 - (var15 & 0xFF));
                                                } else if (var10.field2667 == var99 && var10.field2668 == var100) {
                                                    var98.method1455(var13, var14);
                                                } else {
                                                    var98.method1479(var13, var14, var10.field2667, var10.field2668);
                                                }
                                            }
                                        } else if (class164.field2650) {
                                            method2521(var10);
                                        }
                                    } else {
                                        class74 var97 = var10.method3038(method2819(var10));
                                        if (var97 != null) {
                                            var97.method1455(var13, var14);
                                        } else if (class164.field2650) {
                                            method2521(var10);
                                        }
                                    }
                                } else if (var10.field2654 == 6) {
                                    boolean var106 = method2819(var10);
                                    int var107;
                                    if (var106) {
                                        var107 = var10.field2728;
                                    } else {
                                        var107 = var10.field2686;
                                    }
                                    class100 var108 = null;
                                    int var109 = 0;
                                    if (var10.field2770 != -1) {
                                        class47 var110 = class47.method2450(var10.field2770);
                                        if (var110 != null) {
                                            class47 var111 = var110.method921(var10.field2761);
                                            var108 = var111.method885(1);
                                            if (var108 == null) {
                                                method2521(var10);
                                            } else {
                                                var108.method2053();
                                                var109 = var108.field1390 / 2;
                                            }
                                        }
                                    } else if (var10.field2693 == 5) {
                                        if (var10.field2694 == 0) {
                                            var108 = field436.method3155((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var108 = Statics.field734.method23();
                                        }
                                    } else if (var107 == -1) {
                                        var108 = var10.method3041((class40) null, -1, var106, Statics.field734.field44);
                                        if (var108 == null && class164.field2650) {
                                            method2521(var10);
                                        }
                                    } else {
                                        class40 var112 = class40.method678(var107);
                                        var108 = var10.method3041(var112, var10.field2717, var106, Statics.field734.field44);
                                        if (var108 == null && class164.field2650) {
                                            method2521(var10);
                                        }
                                    }
                                    class86.method1807(var10.field2667 / 2 + var13, var10.field2668 / 2 + var14);
                                    int var113 = var10.field2649 * class86.field1519[var10.field2735] >> 16;
                                    int var114 = var10.field2649 * class86.field1516[var10.field2735] >> 16;
                                    if (var108 != null) {
                                        if (var10.field2651) {
                                            var108.method2053();
                                            if (var10.field2707) {
                                                var108.method2040(0, var10.field2702, var10.field2703, var10.field2735, var10.field2699, var10.field2700 + var109 + var113, var10.field2700 + var114, var10.field2649);
                                            } else {
                                                var108.method2039(0, var10.field2702, var10.field2703, var10.field2735, var10.field2699, var10.field2700 + var109 + var113, var10.field2700 + var114);
                                            }
                                        } else {
                                            var108.method2039(0, var10.field2702, 0, var10.field2735, 0, var113, var114);
                                        }
                                    }
                                    class86.method1806();
                                } else {
                                    if (var10.field2654 == 7) {
                                        class215 var115 = var10.method3039();
                                        if (var115 == null) {
                                            if (class164.field2650) {
                                                method2521(var10);
                                            }
                                            continue;
                                        }
                                        int var116 = 0;
                                        for (int var117 = 0; var117 < var10.field2664; var117++) {
                                            for (int var118 = 0; var118 < var10.field2663; var118++) {
                                                if (var10.field2695[var116] > 0) {
                                                    class47 var119 = class47.method2450(var10.field2695[var116] - 1);
                                                    String var120;
                                                    if (var119.field1067 != 1 && var10.field2769[var116] == 1) {
                                                        var120 = class2.method735(16748608) + var119.field1056 + class2.field18;
                                                    } else {
                                                        var120 = class2.method735(16748608) + var119.field1056 + class2.field18 + " " + 'x' + method148(var10.field2769[var116]);
                                                    }
                                                    int var121 = (var10.field2716 + 115) * var118 + var13;
                                                    int var122 = (var10.field2689 + 12) * var117 + var14;
                                                    if (var10.field2768 == 0) {
                                                        var115.method3622(var120, var121, var122, var10.field2677, var10.field2676 ? 0 : -1);
                                                    } else if (var10.field2768 == 1) {
                                                        var115.method3632(var120, var10.field2667 / 2 + var121, var122, var10.field2677, var10.field2676 ? 0 : -1);
                                                    } else {
                                                        var115.method3631(var120, var10.field2667 + var121 - 1, var122, var10.field2677, var10.field2676 ? 0 : -1);
                                                    }
                                                }
                                                var116++;
                                            }
                                        }
                                    }
                                    if (var10.field2654 == 8 && Statics.field2111 == var10 && field412 == field411) {
                                        int var123 = 0;
                                        int var124 = 0;
                                        class215 var125 = Statics.field60;
                                        String var126 = var10.field2710;
                                        String var127 = method1349(var126, var10);
                                        while (var127.length() > 0) {
                                            int var128 = var127.indexOf(class2.field25);
                                            String var129;
                                            if (var128 == -1) {
                                                var129 = var127;
                                                var127 = "";
                                            } else {
                                                var129 = var127.substring(0, var128);
                                                var127 = var127.substring(var128 + 4);
                                            }
                                            int var130 = var125.method3657(var129);
                                            if (var130 > var123) {
                                                var123 = var130;
                                            }
                                            var124 += var125.field3093 + 1;
                                        }
                                        var123 += 6;
                                        var124 += 7;
                                        int var131 = var10.field2667 + var13 - 5 - var123;
                                        int var132 = var10.field2668 + var14 + 5;
                                        if (var131 < var13 + 5) {
                                            var131 = var13 + 5;
                                        }
                                        if (var123 + var131 > arg4) {
                                            var131 = arg4 - var123;
                                        }
                                        if (var124 + var132 > arg5) {
                                            var132 = arg5 - var124;
                                        }
                                        class75.method1532(var131, var132, var123, var124, 16777120);
                                        class75.method1542(var131, var132, var123, var124, 0);
                                        String var133 = var10.field2710;
                                        int var134 = var125.field3093 + var132 + 2;
                                        String var135 = method1349(var133, var10);
                                        while (var135.length() > 0) {
                                            int var136 = var135.indexOf(class2.field25);
                                            String var137;
                                            if (var136 == -1) {
                                                var137 = var135;
                                                var135 = "";
                                            } else {
                                                var137 = var135.substring(0, var136);
                                                var135 = var135.substring(var136 + 4);
                                            }
                                            var125.method3622(var137, var131 + 3, var134, 0, -1);
                                            var134 += var125.field3093 + 1;
                                        }
                                    }
                                    if (var10.field2654 == 9) {
                                        if (var10.field2784 == 1) {
                                            int var138;
                                            int var139;
                                            int var140;
                                            int var141;
                                            if (var10.field2662) {
                                                var138 = var13;
                                                var139 = var10.field2668 + var14;
                                                var140 = var10.field2667 + var13;
                                                var141 = var14;
                                            } else {
                                                var138 = var13;
                                                var139 = var14;
                                                var140 = var10.field2667 + var13;
                                                var141 = var10.field2668 + var14;
                                            }
                                            class75.method1571(var138, var139, var140, var141, var10.field2677);
                                        } else {
                                            int var142 = var10.field2667 >= 0 ? var10.field2667 : -var10.field2667;
                                            int var143 = var10.field2668 >= 0 ? var10.field2668 : -var10.field2668;
                                            int var144 = var142;
                                            if (var142 < var143) {
                                                var144 = var143;
                                            }
                                            if (var144 != 0) {
                                                int var145 = (var10.field2667 << 16) / var144;
                                                int var146 = (var10.field2668 << 16) / var144;
                                                if (var146 <= var145) {
                                                    var145 = -var145;
                                                } else {
                                                    var146 = -var146;
                                                }
                                                int var147 = var10.field2784 * var146 >> 17;
                                                int var148 = var10.field2784 * var146 + 1 >> 17;
                                                int var149 = var10.field2784 * var145 >> 17;
                                                int var150 = var10.field2784 * var145 + 1 >> 17;
                                                int var151 = var13 + var147;
                                                int var152 = var13 - var148;
                                                int var153 = var10.field2667 + var13 - var148;
                                                int var154 = var10.field2667 + var13 + var147;
                                                int var155 = var14 + var149;
                                                int var156 = var14 - var150;
                                                int var157 = var10.field2668 + var14 - var150;
                                                int var158 = var10.field2668 + var14 + var149;
                                                class86.method1805(var151, var152, var153);
                                                class86.method1815(var155, var156, var157, var151, var152, var153, var10.field2677);
                                                class86.method1805(var151, var153, var154);
                                                class86.method1815(var155, var157, var158, var151, var153, var154, var10.field2677);
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

    @ObfuscatedName("bd.cc(Ljava/lang/String;Lfh;B)Ljava/lang/String;")
    public static String method1349(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = Statics.method624(arg1, var2 - 1);
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
                if (Statics.field307 != null) {
                    var8 = class154.method1355(Statics.field307.field2123);
                    if (Statics.field307.field2125 != null) {
                        var8 = (String) Statics.field307.field2125;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("o.cy(II)Ljava/lang/String;")
    public static final String method148(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method735(65408) + var1.substring(0, var1.length() - 8) + class148.field2374 + " " + class2.field23 + var1 + class2.field24 + class2.field18;
        } else if (var1.length() > 6) {
            return " " + class2.method735(16777215) + var1.substring(0, var1.length() - 4) + class148.field2376 + " " + class2.field23 + var1 + class2.field24 + class2.field18;
        } else {
            return " " + class2.method735(16776960) + var1 + class2.field18;
        }
    }

    @ObfuscatedName("bn.cd(Lfh;I)V")
    public static void method1097(class164 arg0) {
        class164 var1 = arg0.field2725 == -1 ? null : class164.method6(arg0.field2725);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field594;
            var3 = Statics.field1958;
        } else {
            var2 = var1.field2667;
            var3 = var1.field2668;
        }
        method29(arg0, var2, var3, false);
        method1099(arg0, var2, var3);
    }

    @ObfuscatedName("m.cf([Lfh;Lfh;ZI)V")
    public static void method124(class164[] arg0, class164 arg1, boolean arg2) {
        int var3 = arg1.field2678 == 0 ? arg1.field2667 : arg1.field2678;
        int var4 = arg1.field2779 == 0 ? arg1.field2668 : arg1.field2779;
        method17(arg0, arg1.field2652, var3, var4, arg2);
        if (arg1.field2684 != null) {
            method17(arg1.field2684, arg1.field2652, var3, var4, arg2);
        }
        class4 var5 = (class4) field421.method3405((long) arg1.field2652);
        if (var5 != null) {
            int var6 = var5.field55;
            if (class164.method3121(var6)) {
                method17(Statics.field2642[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2763 == 1337) {
        }
    }

    @ObfuscatedName("e.cs([Lfh;IIIZI)V")
    public static void method17(class164[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class164 var6 = arg0[var5];
            if (var6 != null && var6.field2725 == arg1) {
                method29(var6, arg2, arg3, arg4);
                method1099(var6, arg2, arg3);
                if (var6.field2711 > var6.field2678 - var6.field2667) {
                    var6.field2711 = var6.field2678 - var6.field2667;
                }
                if (var6.field2711 < 0) {
                    var6.field2711 = 0;
                }
                if (var6.field2674 > var6.field2779 - var6.field2668) {
                    var6.field2674 = var6.field2779 - var6.field2668;
                }
                if (var6.field2674 < 0) {
                    var6.field2674 = 0;
                }
                if (var6.field2654 == 0) {
                    method124(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("e.cg(Lfh;IIZI)V")
    public static void method29(class164 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2667;
        int var5 = arg0.field2668;
        if (arg0.field2659 == 0) {
            arg0.field2667 = arg0.field2663;
        } else if (arg0.field2659 == 1) {
            arg0.field2667 = arg1 - arg0.field2663;
        } else if (arg0.field2659 == 2) {
            arg0.field2667 = arg0.field2663 * arg1 >> 14;
        }
        if (arg0.field2660 == 0) {
            arg0.field2668 = arg0.field2664;
        } else if (arg0.field2660 == 1) {
            arg0.field2668 = arg2 - arg0.field2664;
        } else if (arg0.field2660 == 2) {
            arg0.field2668 = arg0.field2664 * arg2 >> 14;
        }
        if (arg0.field2659 == 4) {
            arg0.field2667 = arg0.field2669 * arg0.field2668 / arg0.field2675;
        }
        if (arg0.field2660 == 4) {
            arg0.field2668 = arg0.field2675 * arg0.field2667 / arg0.field2669;
        }
        if (field430 && arg0.field2654 == 0) {
            if (arg0.field2668 < 5 && arg0.field2667 < 5) {
                arg0.field2668 = 5;
                arg0.field2667 = 5;
            } else {
                if (arg0.field2668 <= 0) {
                    arg0.field2668 = 5;
                }
                if (arg0.field2667 <= 0) {
                    arg0.field2667 = 5;
                }
            }
        }
        if (arg0.field2763 == 1337) {
            field432 = arg0;
        }
        if (arg3 && arg0.field2759 != null && (arg0.field2667 != var4 || arg0.field2668 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field8 = arg0.field2759;
            field455.method3437(var6);
        }
    }

    @ObfuscatedName("bn.ce(Lfh;III)V")
    public static void method1099(class164 arg0, int arg1, int arg2) {
        if (arg0.field2657 == 0) {
            arg0.field2665 = arg0.field2661;
        } else if (arg0.field2657 == 1) {
            arg0.field2665 = (arg1 - arg0.field2667) / 2 + arg0.field2661;
        } else if (arg0.field2657 == 2) {
            arg0.field2665 = arg1 - arg0.field2667 - arg0.field2661;
        } else if (arg0.field2657 == 3) {
            arg0.field2665 = arg0.field2661 * arg1 >> 14;
        } else if (arg0.field2657 == 4) {
            arg0.field2665 = (arg0.field2661 * arg1 >> 14) + (arg1 - arg0.field2667) / 2;
        } else {
            arg0.field2665 = arg1 - arg0.field2667 - (arg0.field2661 * arg1 >> 14);
        }
        if (arg0.field2658 == 0) {
            arg0.field2666 = arg0.field2698;
        } else if (arg0.field2658 == 1) {
            arg0.field2666 = (arg2 - arg0.field2668) / 2 + arg0.field2698;
        } else if (arg0.field2658 == 2) {
            arg0.field2666 = arg2 - arg0.field2668 - arg0.field2698;
        } else if (arg0.field2658 == 3) {
            arg0.field2666 = arg0.field2698 * arg2 >> 14;
        } else if (arg0.field2658 == 4) {
            arg0.field2666 = (arg0.field2698 * arg2 >> 14) + (arg2 - arg0.field2668) / 2;
        } else {
            arg0.field2666 = arg2 - arg0.field2668 - (arg0.field2698 * arg2 >> 14);
        }
        if (!field430 || arg0.field2654 != 0) {
            return;
        }
        if (arg0.field2665 < 0) {
            arg0.field2665 = 0;
        } else if (arg0.field2667 + arg0.field2665 > arg1) {
            arg0.field2665 = arg1 - arg0.field2667;
        }
        if (arg0.field2666 < 0) {
            arg0.field2666 = 0;
        } else if (arg0.field2668 + arg0.field2666 > arg2) {
            arg0.field2666 = arg2 - arg0.field2668;
        }
    }

    @ObfuscatedName("az.cx(IIIIIB)V")
    public static final void method618(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field648[0].method1598(arg0, arg1);
        Statics.field648[1].method1598(arg0, arg1 + arg3 - 16);
        class75.method1532(arg0, arg1 + 16, 16, arg3 - 32, field521);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class75.method1532(arg0, arg1 + 16 + var6, 16, var5, field337);
        class75.method1546(arg0, arg1 + 16 + var6, var5, field339);
        class75.method1546(arg0 + 1, arg1 + 16 + var6, var5, field339);
        class75.method1544(arg0, arg1 + 16 + var6, 16, field339);
        class75.method1544(arg0, arg1 + 17 + var6, 16, field339);
        class75.method1546(arg0 + 15, arg1 + 16 + var6, var5, field434);
        class75.method1546(arg0 + 14, arg1 + 17 + var6, var5 - 1, field434);
        class75.method1544(arg0, arg1 + 15 + var6 + var5, 16, field434);
        class75.method1544(arg0 + 1, arg1 + 14 + var6 + var5, 15, field434);
    }

    @ObfuscatedName("ea.cv(Lfh;I)Z")
    public static final boolean method2819(class164 arg0) {
        if (arg0.field2774 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2774.length; var1++) {
            int var2 = Statics.method624(arg0, var1);
            int var3 = arg0.field2679[var1];
            if (arg0.field2774[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2774[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2774[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ds.cb(IIIIIIII)V")
    public static final void method2476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class164.method3121(arg0)) {
            method2798(Statics.field2642[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("el.ck([Lfh;IIIIIIII)V")
    public static final void method2798(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2651 || var9.field2654 == 0 || var9.field2730 || method84(var9) != 0 || field281 == var9 || var9.field2763 == 1338) && var9.field2725 == arg1 && (!var9.field2651 || !method485(var9))) {
                int var10 = var9.field2665 + arg6;
                int var11 = var9.field2666 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2654 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2654 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2667 + var10;
                    int var19 = var9.field2668 + var11;
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
                    int var22 = var9.field2667 + var10;
                    int var23 = var9.field2668 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field433 == var9) {
                    field453 = true;
                    field442 = var10;
                    field443 = var11;
                }
                if (!var9.field2651 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2050;
                    int var25 = class132.field2051;
                    if (class132.field2056 != 0) {
                        var24 = class132.field2057;
                        var25 = class132.field2058;
                    }
                    if (var9.field2763 == 1337) {
                        if (!field266 && !field533 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field413 == 0 && !field415) {
                                method1352(class148.field2368, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class100.field1787; var28++) {
                                int var29 = class100.field1754[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field189.method1657(Statics.field1818, var30, var31, var29) >= 0) {
                                        class38 var34 = class38.method489(var33);
                                        if (var34.field895 != null) {
                                            var34 = var34.method684();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field413 == 1) {
                                            method1352(class148.field2363, field414 + " " + class2.field20 + " " + class2.method735(65535) + var34.field912, 1, var29, var30, var31);
                                        } else if (!field415) {
                                            String[] var35 = var34.field902;
                                            if (field496) {
                                                var35 = method2449(var35);
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
                                                        method1352(var35[var36], class2.method735(65535) + var34.field912, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method1352(class148.field2364, class2.method735(65535) + var34.field912, 1002, var34.field882 << 14, var30, var31);
                                        } else if ((Statics.field563 & 0x4) == 4) {
                                            method1352(field524, field419 + " " + class2.field20 + " " + class2.method735(65535) + var34.field912, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class32 var38 = field535[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field733.field840 == 1 && (var38.field773 & 0x7F) == 64 && (var38.field775 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field298; var39++) {
                                                class32 var40 = field535[field278[var39]];
                                                if (var40 != null && var38 != var40 && var40.field733.field840 == 1 && var38.field773 == var40.field773 && var38.field775 == var40.field775) {
                                                    method2528(var40.field733, field278[var39], var30, var31);
                                                }
                                            }
                                            for (int var41 = 0; var41 < field289; var41++) {
                                                class3 var42 = field479[field286[var41]];
                                                if (var42 != null && var38.field773 == var42.field773 && var38.field775 == var42.field775) {
                                                    method2413(var42, field286[var41], var30, var31);
                                                }
                                            }
                                        }
                                        method2528(var38.field733, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var43 = field479[var33];
                                        if (var43 == null) {
                                            continue;
                                        }
                                        if ((var43.field773 & 0x7F) == 64 && (var43.field775 & 0x7F) == 64) {
                                            for (int var44 = 0; var44 < field298; var44++) {
                                                class32 var45 = field535[field278[var44]];
                                                if (var45 != null && var45.field733.field840 == 1 && var43.field773 == var45.field773 && var43.field775 == var45.field775) {
                                                    method2528(var45.field733, field278[var44], var30, var31);
                                                }
                                            }
                                            for (int var46 = 0; var46 < field289; var46++) {
                                                class3 var47 = field479[field286[var46]];
                                                if (var47 != null && var43 != var47 && var43.field773 == var47.field773 && var43.field775 == var47.field775) {
                                                    method2413(var47, field286[var46], var30, var31);
                                                }
                                            }
                                        }
                                        if (field392 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2413(var43, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class190 var48 = field357[Statics.field1818][var30][var31];
                                        if (var48 != null) {
                                            for (class27 var49 = (class27) var48.method3443(); var49 != null; var49 = (class27) var48.method3446()) {
                                                class47 var50 = class47.method2450(var49.field665);
                                                if (field413 == 1) {
                                                    method1352(class148.field2363, field414 + " " + class2.field20 + " " + class2.method735(16748608) + var50.field1056, 16, var49.field665, var30, var31);
                                                } else if (!field415) {
                                                    String[] var51 = var50.field1090;
                                                    if (field496) {
                                                        var51 = method2449(var51);
                                                    }
                                                    for (int var52 = 4; var52 >= 0; var52--) {
                                                        if (var51 != null && var51[var52] != null) {
                                                            byte var53 = 0;
                                                            if (var52 == 0) {
                                                                var53 = 18;
                                                            }
                                                            if (var52 == 1) {
                                                                var53 = 19;
                                                            }
                                                            if (var52 == 2) {
                                                                var53 = 20;
                                                            }
                                                            if (var52 == 3) {
                                                                var53 = 21;
                                                            }
                                                            if (var52 == 4) {
                                                                var53 = 22;
                                                            }
                                                            method1352(var51[var52], class2.method735(16748608) + var50.field1056, var53, var49.field665, var30, var31);
                                                        } else if (var52 == 2) {
                                                            method1352(class148.field2485, class2.method735(16748608) + var50.field1056, 20, var49.field665, var30, var31);
                                                        }
                                                    }
                                                    method1352(class148.field2364, class2.method735(16748608) + var50.field1056, 1004, var49.field665, var30, var31);
                                                } else if ((Statics.field563 & 0x1) == 1) {
                                                    method1352(field524, field419 + " " + class2.field20 + " " + class2.method735(16748608) + var50.field1056, 17, var49.field665, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var54 = var26 & 0x7F;
                                int var55 = var26 >> 7 & 0x7F;
                                class3 var56 = field479[field392];
                                method2413(var56, field392, var54, var55);
                            }
                        }
                    } else if (var9.field2763 != 1338) {
                        if (!field533 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var71 = var24 - var10;
                            int var72 = var25 - var11;
                            if (var9.field2655 == 1) {
                                method1352(var9.field2767, "", 24, 0, 0, var9.field2652);
                            }
                            if (var9.field2655 == 2 && !field415) {
                                String var73;
                                if (class169.method2784(method84(var9)) == 0) {
                                    var73 = null;
                                } else if (var9.field2733 == null || var9.field2733.trim().length() == 0) {
                                    var73 = null;
                                } else {
                                    var73 = var9.field2733;
                                }
                                if (var73 != null) {
                                    method1352(var73, class2.method735(65280) + var9.field2713, 25, 0, -1, var9.field2652);
                                }
                            }
                            if (var9.field2655 == 3) {
                                method1352(class148.field2396, "", 26, 0, 0, var9.field2652);
                            }
                            if (var9.field2655 == 4) {
                                method1352(var9.field2767, "", 28, 0, 0, var9.field2652);
                            }
                            if (var9.field2655 == 5) {
                                method1352(var9.field2767, "", 29, 0, 0, var9.field2652);
                            }
                            if (var9.field2655 == 6 && field506 == null) {
                                method1352(var9.field2767, "", 30, 0, -1, var9.field2652);
                            }
                            if (var9.field2654 == 2) {
                                int var75 = 0;
                                for (int var76 = 0; var76 < var9.field2668; var76++) {
                                    for (int var77 = 0; var77 < var9.field2667; var77++) {
                                        int var78 = (var9.field2716 + 32) * var77;
                                        int var79 = (var9.field2689 + 32) * var76;
                                        if (var75 < 20) {
                                            var78 += var9.field2718[var75];
                                            var79 += var9.field2719[var75];
                                        }
                                        if (var71 >= var78 && var72 >= var79 && var71 < var78 + 32 && var72 < var79 + 32) {
                                            field374 = var75;
                                            Statics.field1141 = var9;
                                            if (var9.field2695[var75] > 0) {
                                                label1261: {
                                                    class47 var80 = class47.method2450(var9.field2695[var75] - 1);
                                                    if (field413 == 1) {
                                                        int var81 = method84(var9);
                                                        boolean var82 = (var81 >> 30 & 0x1) != 0;
                                                        if (var82) {
                                                            if (Statics.field824 != var9.field2652 || Statics.field597 != var75) {
                                                                method1352(class148.field2363, field414 + " " + class2.field20 + " " + class2.method735(16748608) + var80.field1056, 31, var80.field1054, var75, var9.field2652);
                                                            }
                                                            break label1261;
                                                        }
                                                    }
                                                    if (field415) {
                                                        int var83 = method84(var9);
                                                        boolean var84 = (var83 >> 30 & 0x1) != 0;
                                                        if (var84) {
                                                            if ((Statics.field563 & 0x10) == 16) {
                                                                method1352(field524, field419 + " " + class2.field20 + " " + class2.method735(16748608) + var80.field1056, 32, var80.field1054, var75, var9.field2652);
                                                            }
                                                            break label1261;
                                                        }
                                                    }
                                                    String[] var85 = var80.field1071;
                                                    if (field496) {
                                                        var85 = method2449(var85);
                                                    }
                                                    int var86 = method84(var9);
                                                    boolean var87 = (var86 >> 30 & 0x1) != 0;
                                                    if (var87) {
                                                        for (int var88 = 4; var88 >= 3; var88--) {
                                                            if (var85 != null && var85[var88] != null) {
                                                                byte var89;
                                                                if (var88 == 3) {
                                                                    var89 = 36;
                                                                } else {
                                                                    var89 = 37;
                                                                }
                                                                method1352(var85[var88], class2.method735(16748608) + var80.field1056, var89, var80.field1054, var75, var9.field2652);
                                                            } else if (var88 == 4) {
                                                                method1352(class148.field2214, class2.method735(16748608) + var80.field1056, 37, var80.field1054, var75, var9.field2652);
                                                            }
                                                        }
                                                    }
                                                    class169 var10000 = (class169) null;
                                                    if (class169.method2829(method84(var9))) {
                                                        method1352(class148.field2363, class2.method735(16748608) + var80.field1056, 38, var80.field1054, var75, var9.field2652);
                                                    }
                                                    int var90 = method84(var9);
                                                    boolean var91 = (var90 >> 30 & 0x1) != 0;
                                                    if (var91 && var85 != null) {
                                                        for (int var92 = 2; var92 >= 0; var92--) {
                                                            if (var85[var92] != null) {
                                                                byte var93 = 0;
                                                                if (var92 == 0) {
                                                                    var93 = 33;
                                                                }
                                                                if (var92 == 1) {
                                                                    var93 = 34;
                                                                }
                                                                if (var92 == 2) {
                                                                    var93 = 35;
                                                                }
                                                                method1352(var85[var92], class2.method735(16748608) + var80.field1056, var93, var80.field1054, var75, var9.field2652);
                                                            }
                                                        }
                                                    }
                                                    String[] var94 = var9.field2766;
                                                    if (field496) {
                                                        var94 = method2449(var94);
                                                    }
                                                    if (var94 != null) {
                                                        for (int var95 = 4; var95 >= 0; var95--) {
                                                            if (var94[var95] != null) {
                                                                byte var96 = 0;
                                                                if (var95 == 0) {
                                                                    var96 = 39;
                                                                }
                                                                if (var95 == 1) {
                                                                    var96 = 40;
                                                                }
                                                                if (var95 == 2) {
                                                                    var96 = 41;
                                                                }
                                                                if (var95 == 3) {
                                                                    var96 = 42;
                                                                }
                                                                if (var95 == 4) {
                                                                    var96 = 43;
                                                                }
                                                                method1352(var94[var95], class2.method735(16748608) + var80.field1056, var96, var80.field1054, var75, var9.field2652);
                                                            }
                                                        }
                                                    }
                                                    method1352(class148.field2364, class2.method735(16748608) + var80.field1056, 1005, var80.field1054, var75, var9.field2652);
                                                }
                                            }
                                        }
                                        var75++;
                                    }
                                }
                            }
                            if (var9.field2651) {
                                if (field415) {
                                    int var97 = method84(var9);
                                    boolean var98 = (var97 >> 21 & 0x1) != 0;
                                    if (var98 && (Statics.field563 & 0x20) == 32) {
                                        method1352(field524, field419 + " " + class2.field20 + " " + var9.field2758, 58, 0, var9.field2653, var9.field2652);
                                    }
                                } else {
                                    for (int var99 = 9; var99 >= 5; var99--) {
                                        String var100 = method883(var9, var99);
                                        if (var100 != null) {
                                            method1352(var100, var9.field2758, 1007, var99 + 1, var9.field2653, var9.field2652);
                                        }
                                    }
                                    String var101;
                                    if (class169.method2784(method84(var9)) == 0) {
                                        var101 = null;
                                    } else if (var9.field2733 == null || var9.field2733.trim().length() == 0) {
                                        var101 = null;
                                    } else {
                                        var101 = var9.field2733;
                                    }
                                    if (var101 != null) {
                                        method1352(var101, var9.field2758, 25, 0, var9.field2653, var9.field2652);
                                    }
                                    for (int var103 = 4; var103 >= 0; var103--) {
                                        String var104 = method883(var9, var103);
                                        if (var104 != null) {
                                            method1352(var104, var9.field2758, 57, var103 + 1, var9.field2653, var9.field2652);
                                        }
                                    }
                                    int var105 = method84(var9);
                                    boolean var106 = (var105 & 0x1) != 0;
                                    if (var106) {
                                        method1352(class148.field2218, "", 30, 0, var9.field2653, var9.field2652);
                                    }
                                }
                            }
                        }
                        if (var9.field2654 == 0) {
                            if (!var9.field2651 && method485(var9) && Statics.field169 != var9) {
                                continue;
                            }
                            method2798(arg0, var9.field2652, var12, var13, var14, var15, var10 - var9.field2711, var11 - var9.field2674);
                            if (var9.field2684 != null) {
                                method2798(var9.field2684, var9.field2652, var12, var13, var14, var15, var10 - var9.field2711, var11 - var9.field2674);
                            }
                            class4 var107 = (class4) field421.method3405((long) var9.field2652);
                            if (var107 != null) {
                                if (var107.field54 == 0 && class132.field2050 >= var12 && class132.field2051 >= var13 && class132.field2050 < var14 && class132.field2051 < var15 && !field533 && !field430) {
                                    field407[0] = class148.field2449;
                                    field408[0] = "";
                                    field405[0] = 1006;
                                    field402 = 1;
                                }
                                method2476(var107.field55, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2651) {
                            if (var9.field2783 && class132.field2050 >= var12 && class132.field2051 >= var13 && class132.field2050 < var14 && class132.field2051 < var15) {
                                for (class1 var108 = (class1) field455.method3442(); var108 != null; var108 = (class1) field455.method3444()) {
                                    if (var108.field2) {
                                        var108.method3533();
                                        var108.field3.field2775 = false;
                                    }
                                }
                                if (Statics.field1104 == 0) {
                                    field433 = null;
                                    field281 = null;
                                }
                                if (!field533) {
                                    field407[0] = class148.field2449;
                                    field408[0] = "";
                                    field405[0] = 1006;
                                    field402 = 1;
                                }
                            }
                            boolean var109;
                            if (class132.field2050 >= var12 && class132.field2051 >= var13 && class132.field2050 < var14 && class132.field2051 < var15) {
                                var109 = true;
                            } else {
                                var109 = false;
                            }
                            boolean var110 = false;
                            if ((class132.field2049 == 1 || !Statics.field2048 && class132.field2049 == 4) && var109) {
                                var110 = true;
                            }
                            boolean var111 = false;
                            if ((class132.field2056 == 1 || !Statics.field2048 && class132.field2056 == 4) && class132.field2057 >= var12 && class132.field2058 >= var13 && class132.field2057 < var14 && class132.field2058 < var15) {
                                var111 = true;
                            }
                            if (var111) {
                                method1408(var9, class132.field2057 - var10, class132.field2058 - var11);
                            }
                            if (field433 != null && field433 != var9 && var109 && class169.method2377(method84(var9))) {
                                field369 = var9;
                            }
                            if (field281 == var9) {
                                field438 = true;
                                field439 = var10;
                                field440 = var11;
                            }
                            if (var9.field2730) {
                                if (var109 && field503 != 0 && var9.field2751 != null) {
                                    class1 var112 = new class1();
                                    var112.field2 = true;
                                    var112.field3 = var9;
                                    var112.field5 = field503;
                                    var112.field8 = var9.field2751;
                                    field455.method3437(var112);
                                }
                                if (field433 != null || Statics.field65 != null || field533) {
                                    var111 = false;
                                    var110 = false;
                                    var109 = false;
                                }
                                if (!var9.field2776 && var111) {
                                    var9.field2776 = true;
                                    if (var9.field2732 != null) {
                                        class1 var113 = new class1();
                                        var113.field2 = true;
                                        var113.field3 = var9;
                                        var113.field14 = class132.field2057 - var10;
                                        var113.field5 = class132.field2058 - var11;
                                        var113.field8 = var9.field2732;
                                        field455.method3437(var113);
                                    }
                                }
                                if (var9.field2776 && var110 && var9.field2778 != null) {
                                    class1 var114 = new class1();
                                    var114.field2 = true;
                                    var114.field3 = var9;
                                    var114.field14 = class132.field2050 - var10;
                                    var114.field5 = class132.field2051 - var11;
                                    var114.field8 = var9.field2778;
                                    field455.method3437(var114);
                                }
                                if (var9.field2776 && !var110) {
                                    var9.field2776 = false;
                                    if (var9.field2734 != null) {
                                        class1 var115 = new class1();
                                        var115.field2 = true;
                                        var115.field3 = var9;
                                        var115.field14 = class132.field2050 - var10;
                                        var115.field5 = class132.field2051 - var11;
                                        var115.field8 = var9.field2734;
                                        field463.method3437(var115);
                                    }
                                }
                                if (var110 && var9.field2756 != null) {
                                    class1 var116 = new class1();
                                    var116.field2 = true;
                                    var116.field3 = var9;
                                    var116.field14 = class132.field2050 - var10;
                                    var116.field5 = class132.field2051 - var11;
                                    var116.field8 = var9.field2756;
                                    field455.method3437(var116);
                                }
                                if (!var9.field2775 && var109) {
                                    var9.field2775 = true;
                                    if (var9.field2736 != null) {
                                        class1 var117 = new class1();
                                        var117.field2 = true;
                                        var117.field3 = var9;
                                        var117.field14 = class132.field2050 - var10;
                                        var117.field5 = class132.field2051 - var11;
                                        var117.field8 = var9.field2736;
                                        field455.method3437(var117);
                                    }
                                }
                                if (var9.field2775 && var109 && var9.field2737 != null) {
                                    class1 var118 = new class1();
                                    var118.field2 = true;
                                    var118.field3 = var9;
                                    var118.field14 = class132.field2050 - var10;
                                    var118.field5 = class132.field2051 - var11;
                                    var118.field8 = var9.field2737;
                                    field455.method3437(var118);
                                }
                                if (var9.field2775 && !var109) {
                                    var9.field2775 = false;
                                    if (var9.field2738 != null) {
                                        class1 var119 = new class1();
                                        var119.field2 = true;
                                        var119.field3 = var9;
                                        var119.field14 = class132.field2050 - var10;
                                        var119.field5 = class132.field2051 - var11;
                                        var119.field8 = var9.field2738;
                                        field463.method3437(var119);
                                    }
                                }
                                if (var9.field2749 != null) {
                                    class1 var120 = new class1();
                                    var120.field3 = var9;
                                    var120.field8 = var9.field2749;
                                    field462.method3437(var120);
                                }
                                if (var9.field2743 != null && field403 > var9.field2721) {
                                    if (var9.field2729 == null || field403 - var9.field2721 > 32) {
                                        class1 var125 = new class1();
                                        var125.field3 = var9;
                                        var125.field8 = var9.field2743;
                                        field455.method3437(var125);
                                    } else {
                                        label956: for (int var121 = var9.field2721; var121 < field403; var121++) {
                                            int var122 = field529[var121 & 0x1F];
                                            for (int var123 = 0; var123 < var9.field2729.length; var123++) {
                                                if (var9.field2729[var123] == var122) {
                                                    class1 var124 = new class1();
                                                    var124.field3 = var9;
                                                    var124.field8 = var9.field2743;
                                                    field455.method3437(var124);
                                                    break label956;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2721 = field403;
                                }
                                if (var9.field2745 != null && field449 > var9.field2752) {
                                    if (var9.field2746 == null || field449 - var9.field2752 > 32) {
                                        class1 var130 = new class1();
                                        var130.field3 = var9;
                                        var130.field8 = var9.field2745;
                                        field455.method3437(var130);
                                    } else {
                                        label932: for (int var126 = var9.field2752; var126 < field449; var126++) {
                                            int var127 = field497[var126 & 0x1F];
                                            for (int var128 = 0; var128 < var9.field2746.length; var128++) {
                                                if (var9.field2746[var128] == var127) {
                                                    class1 var129 = new class1();
                                                    var129.field3 = var9;
                                                    var129.field8 = var9.field2745;
                                                    field455.method3437(var129);
                                                    break label932;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2752 = field449;
                                }
                                if (var9.field2747 != null && field451 > var9.field2764) {
                                    if (var9.field2753 == null || field451 - var9.field2764 > 32) {
                                        class1 var135 = new class1();
                                        var135.field3 = var9;
                                        var135.field8 = var9.field2747;
                                        field455.method3437(var135);
                                    } else {
                                        label908: for (int var131 = var9.field2764; var131 < field451; var131++) {
                                            int var132 = field450[var131 & 0x1F];
                                            for (int var133 = 0; var133 < var9.field2753.length; var133++) {
                                                if (var9.field2753[var133] == var132) {
                                                    class1 var134 = new class1();
                                                    var134.field3 = var9;
                                                    var134.field8 = var9.field2747;
                                                    field455.method3437(var134);
                                                    break label908;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2764 = field451;
                                }
                                if (field523 > var9.field2777 && var9.field2722 != null) {
                                    class1 var136 = new class1();
                                    var136.field3 = var9;
                                    var136.field8 = var9.field2722;
                                    field455.method3437(var136);
                                }
                                if (field320 > var9.field2777 && var9.field2690 != null) {
                                    class1 var137 = new class1();
                                    var137.field3 = var9;
                                    var137.field8 = var9.field2690;
                                    field455.method3437(var137);
                                }
                                if (field454 > var9.field2777 && var9.field2755 != null) {
                                    class1 var138 = new class1();
                                    var138.field3 = var9;
                                    var138.field8 = var9.field2755;
                                    field455.method3437(var138);
                                }
                                if (field359 > var9.field2777 && var9.field2760 != null) {
                                    class1 var139 = new class1();
                                    var139.field3 = var9;
                                    var139.field8 = var9.field2760;
                                    field455.method3437(var139);
                                }
                                if (field456 > var9.field2777 && var9.field2744 != null) {
                                    class1 var140 = new class1();
                                    var140.field3 = var9;
                                    var140.field8 = var9.field2744;
                                    field455.method3437(var140);
                                }
                                if (field457 > var9.field2777 && var9.field2715 != null) {
                                    class1 var141 = new class1();
                                    var141.field3 = var9;
                                    var141.field8 = var9.field2715;
                                    field455.method3437(var141);
                                }
                                var9.field2777 = field538;
                                if (var9.field2646 != null) {
                                    for (int var142 = 0; var142 < field477; var142++) {
                                        class1 var143 = new class1();
                                        var143.field3 = var9;
                                        var143.field9 = field487[var142];
                                        var143.field15 = field486[var142];
                                        var143.field8 = var9.field2646;
                                        field455.method3437(var143);
                                    }
                                }
                            }
                        }
                        if (!var9.field2651 && field433 == null && Statics.field65 == null && !field533) {
                            if ((var9.field2765 >= 0 || var9.field2741 != 0) && class132.field2050 >= var12 && class132.field2051 >= var13 && class132.field2050 < var14 && class132.field2051 < var15) {
                                if (var9.field2765 >= 0) {
                                    Statics.field169 = arg0[var9.field2765];
                                } else {
                                    Statics.field169 = var9;
                                }
                            }
                            if (var9.field2654 == 8 && class132.field2050 >= var12 && class132.field2051 >= var13 && class132.field2050 < var14 && class132.field2051 < var15) {
                                Statics.field2111 = var9;
                            }
                            if (var9.field2779 > var9.field2668) {
                                Statics.method578(var9, var9.field2667 + var10, var11, var9.field2668, var9.field2779, class132.field2050, class132.field2051);
                            }
                        }
                    } else if ((field498 == 0 || field498 == 3) && (class132.field2056 == 1 || !Statics.field2048 && class132.field2056 == 4)) {
                        class166 var57 = var9.method3042();
                        if (var57 != null) {
                            int var58 = class132.field2057 - var10;
                            int var59 = class132.field2058 - var11;
                            if (var57.method3090(var58, var59)) {
                                int var60 = var58 - var57.field2797 / 2;
                                int var61 = var59 - var57.field2795 / 2;
                                int var62 = field500 + field343 & 0x7FF;
                                int var63 = class86.field1519[var62];
                                int var64 = class86.field1516[var62];
                                int var65 = (field332 + 256) * var63 >> 8;
                                int var66 = (field332 + 256) * var64 >> 8;
                                int var67 = var60 * var66 + var61 * var65 >> 11;
                                int var68 = var61 * var66 - var60 * var65 >> 11;
                                int var69 = Statics.field734.field773 + var67 >> 7;
                                int var70 = Statics.field734.field775 - var68 >> 7;
                                field452.method2426(37);
                                field452.method2160(18);
                                field452.method2365(Statics.field948 + var70);
                                field452.method2160(class129.field2012[82] ? (class129.field2012[81] ? 2 : 1) : 0);
                                field452.method2206(Statics.field193 + var69);
                                field452.method2160(var60);
                                field452.method2160(var61);
                                field452.method2365(field343);
                                field452.method2160(57);
                                field452.method2160(field500);
                                field452.method2160(field332);
                                field452.method2160(89);
                                field452.method2365(Statics.field734.field773);
                                field452.method2365(Statics.field734.field775);
                                field452.method2160(63);
                                field418 = var69;
                                field280 = var70;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.cw([Lfh;II)V")
    public static final void method3346(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2654 == 0) {
                    if (var3.field2684 != null) {
                        method3346(var3.field2684, arg1);
                    }
                    class4 var4 = (class4) field421.method3405((long) var3.field2652);
                    if (var4 != null) {
                        int var5 = var4.field55;
                        if (class164.method3121(var5)) {
                            method3346(Statics.field2642[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2757 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field8 = var3.field2757;
                    class34.method2786(var6);
                }
                if (arg1 == 1 && var3.field2673 != null) {
                    if (var3.field2653 >= 0) {
                        class164 var7 = class164.method6(var3.field2652);
                        if (var7 == null || var7.field2684 == null || var3.field2653 >= var7.field2684.length || var7.field2684[var3.field2653] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field8 = var3.field2673;
                    class34.method2786(var8);
                }
            }
        }
    }

    @ObfuscatedName("bz.cm(Lfh;IIB)V")
    public static final void method1408(class164 arg0, int arg1, int arg2) {
        if (field433 != null || field533 || arg0 == null || method13(arg0) == null) {
            return;
        }
        field433 = arg0;
        field281 = method13(arg0);
        field435 = arg1;
        field380 = arg2;
        Statics.field1104 = 0;
        field329 = false;
        if (field402 > 0) {
            method821(field402 - 1);
        }
    }

    @ObfuscatedName("ad.cr(IB)V")
    public static void method821(int arg0) {
        Statics.field1841 = new class29();
        Statics.field1841.field682 = field394[arg0];
        Statics.field1841.field688 = field404[arg0];
        Statics.field1841.field681 = field405[arg0];
        Statics.field1841.field683 = field406[arg0];
        Statics.field1841.field684 = field407[arg0];
    }

    @ObfuscatedName("dk.ct(III)V")
    public static void method2115(int arg0, int arg1) {
        class29 var2 = Statics.field1841;
        method679(var2.field682, var2.field688, var2.field681, var2.field683, var2.field684, var2.field684, arg0, arg1);
        Statics.field1841 = null;
    }

    @ObfuscatedName("db.cj(Lfh;S)V")
    public static void method2521(class164 arg0) {
        if (field466 == arg0.field2782) {
            field424[arg0.field2781] = true;
        }
    }

    @ObfuscatedName("m.cp(I)V")
    public static void method125() {
        for (class4 var0 = (class4) field421.method3412(); var0 != null; var0 = (class4) field421.method3410()) {
            int var1 = var0.field55;
            if (class164.method3121(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2642[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2651;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3015;
                    class164 var6 = class164.method6(var5);
                    if (var6 != null) {
                        method2521(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.dy(Lfh;B)Lfh;")
    public static class164 method13(class164 arg0) {
        class164 var1 = arg0;
        int var2 = class169.method2810(method84(arg0));
        class164 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class164.method6(var1.field2725);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class164 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2697;
        }
        return var5;
    }

    @ObfuscatedName("dh.dk([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2449(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("r.dr(II)V")
    public static final void method165(int arg0) {
        if (!class164.method3121(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2642[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2717 = 0;
                var3.field2773 = 0;
            }
        }
    }

    @ObfuscatedName("al.du(II)V")
    public static final void method639(int arg0) {
        if (class164.method3121(arg0)) {
            method2005(Statics.field2642[arg0], -1);
        }
    }

    @ObfuscatedName("ch.dw([Lfh;II)V")
    public static final void method2005(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2725 == arg1 && (!var3.field2651 || !method485(var3))) {
                if (var3.field2654 == 0) {
                    if (!var3.field2651 && method485(var3) && Statics.field169 != var3) {
                        continue;
                    }
                    method2005(arg0, var3.field2652);
                    if (var3.field2684 != null) {
                        method2005(var3.field2684, var3.field2652);
                    }
                    class4 var4 = (class4) field421.method3405((long) var3.field2652);
                    if (var4 != null) {
                        method639(var4.field55);
                    }
                }
                if (var3.field2654 == 6) {
                    if (var3.field2686 != -1 || var3.field2728 != -1) {
                        boolean var5 = method2819(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2728;
                        } else {
                            var6 = var3.field2686;
                        }
                        if (var6 != -1) {
                            class40 var7 = class40.method678(var6);
                            var3.field2773 += field335;
                            while (var3.field2773 > var7.field947[var3.field2717]) {
                                var3.field2773 -= var7.field947[var3.field2717];
                                var3.field2717++;
                                if (var3.field2717 >= var7.field945.length) {
                                    var3.field2717 -= var7.field961;
                                    if (var3.field2717 < 0 || var3.field2717 >= var7.field945.length) {
                                        var3.field2717 = 0;
                                    }
                                }
                                method2521(var3);
                            }
                        }
                    }
                    if (var3.field2706 != 0 && !var3.field2651) {
                        int var8 = var3.field2706 >> 16;
                        int var9 = var3.field2706 << 16 >> 16;
                        int var10 = field335 * var8;
                        int var11 = field335 * var9;
                        var3.field2735 = var3.field2735 + var10 & 0x7FF;
                        var3.field2702 = var3.field2702 + var11 & 0x7FF;
                        method2521(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.dp(IB)V")
    public static final void method626(int arg0) {
        method125();
        for (class22 var1 = (class22) class22.field586.method3442(); var1 != null; var1 = (class22) class22.field586.method3444()) {
            if (var1.field591 != null) {
                var1.method507();
            }
        }
        int var2 = class48.method843(arg0).field1107;
        if (var2 == 0) {
            return;
        }
        int var3 = class167.field2804[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class86.method1875(0.9D);
                ((class90) Statics.field1507).method1898(0.9D);
            }
            if (var3 == 2) {
                class86.method1875(0.8D);
                ((class90) Statics.field1507).method1898(0.8D);
            }
            if (var3 == 3) {
                class86.method1875(0.7D);
                ((class90) Statics.field1507).method1898(0.7D);
            }
            if (var3 == 4) {
                class86.method1875(0.6D);
                ((class90) Statics.field1507).method1898(0.6D);
            }
            class47.method2495();
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
            if (field499 != var4) {
                if (field499 == 0 && field300 != -1) {
                    class174.method562(Statics.field536, field300, 0, var4, false);
                    field501 = false;
                } else if (var4 == 0) {
                    class174.method481();
                    field501 = false;
                } else {
                    class174.method2796(var4);
                }
                field499 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field502 = 127;
            }
            if (var3 == 1) {
                field502 = 96;
            }
            if (var3 == 2) {
                field502 = 64;
            }
            if (var3 == 3) {
                field502 = 32;
            }
            if (var3 == 4) {
                field502 = 0;
            }
        }
        if (var2 == 5) {
            field458 = var3;
        }
        if (var2 == 6) {
            field429 = var3;
        }
        if (var2 == 9) {
            field423 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field422 = 127;
            }
            if (var3 == 1) {
                field422 = 96;
            }
            if (var3 == 2) {
                field422 = 64;
            }
            if (var3 == 3) {
                field422 = 32;
            }
            if (var3 == 4) {
                field422 = 0;
            }
        }
        if (var2 == 17) {
            field428 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class19[] var5 = new class19[] { class19.field552, class19.field543, class19.field550 };
            field285 = (class19) class101.method561(var5, var3);
            if (field285 == null) {
                field285 = class19.field550;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field392 = -1;
        } else {
            field392 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("az.de(IIII)Lf;")
    public static final class4 method617(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field55 = arg1;
        var3.field54 = arg2;
        field421.method3406(var3, (long) arg0);
        method165(arg1);
        class164 var4 = class164.method6(arg0);
        method2521(var4);
        if (field506 != null) {
            method2521(field506);
            field506 = null;
        }
        Statics.method175();
        method124(Statics.field2642[arg0 >> 16], var4, false);
        class34.method2438(arg1);
        if (field420 != -1) {
            int var5 = field420;
            if (class164.method3121(var5)) {
                method3346(Statics.field2642[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("do.df(Lf;ZB)V")
    public static final void method2415(class4 arg0, boolean arg1) {
        int var2 = arg0.field55;
        int var3 = (int) arg0.field3015;
        arg0.method3533();
        if (arg1 && var2 != -1 && Statics.field2643[var2]) {
            Statics.field2644.method2968(var2);
            if (Statics.field2642[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2642[var2].length; var5++) {
                    if (Statics.field2642[var2][var5] != null) {
                        if (Statics.field2642[var2][var5].field2654 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2642[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2642[var2] = null;
                }
                Statics.field2643[var2] = false;
            }
        }
        method96(var2);
        class164 var6 = class164.method6(var3);
        if (var6 != null) {
            method2521(var6);
        }
        Statics.method175();
        if (field420 != -1) {
            int var7 = field420;
            if (class164.method3121(var7)) {
                method3346(Statics.field2642[var7], 1);
            }
        }
    }

    @ObfuscatedName("em.do(Lfh;B)Z")
    public static final boolean method2787(class164 arg0) {
        int var1 = arg0.field2763;
        if (var1 == 205) {
            field310 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field436.method3148(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field436.method3133(var4, var5 == 1);
        }
        if (var1 == 324) {
            field436.method3134(false);
        }
        if (var1 == 325) {
            field436.method3134(true);
        }
        if (var1 == 326) {
            field452.method2426(237);
            field436.method3135(field452);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("f.dv(Lfh;IIII)V")
    public static final void method30(class164 arg0, int arg1, int arg2, int arg3) {
        method2769();
        class166 var4 = arg0.method3042();
        if (var4 == null) {
            return;
        }
        class75.method1534(arg1, arg2, var4.field2797 + arg1, var4.field2795 + arg2);
        if (field498 == 2 || field498 == 5) {
            class75.method1549(arg1, arg2, 0, var4.field2794, var4.field2796);
        } else {
            int var5 = field500 + field343 & 0x7FF;
            int var6 = Statics.field734.field773 / 32 + 48;
            int var7 = 464 - Statics.field734.field775 / 32;
            Statics.field17.method1502(arg1, arg2, var4.field2797, var4.field2795, var6, var7, var5, field332 + 256, var4.field2794, var4.field2796);
            for (int var8 = 0; var8 < field492; var8++) {
                int var9 = field342[var8] * 4 + 2 - Statics.field734.field773 / 32;
                int var10 = field494[var8] * 4 + 2 - Statics.field734.field775 / 32;
                method33(arg1, arg2, var9, var10, field495[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class190 var13 = field357[Statics.field1818][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field734.field773 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field734.field775 / 32;
                        method33(arg1, arg2, var14, var15, Statics.field2564[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field298; var16++) {
                class32 var17 = field535[field278[var16]];
                if (var17 != null && var17.method18()) {
                    class37 var18 = var17.field733;
                    if (var18 != null && var18.field864 != null) {
                        var18 = var18.method662();
                    }
                    if (var18 != null && var18.field855 && var18.field872) {
                        int var19 = var17.field773 / 32 - Statics.field734.field773 / 32;
                        int var20 = var17.field775 / 32 - Statics.field734.field775 / 32;
                        method33(arg1, arg2, var19, var20, Statics.field2564[1], var4);
                    }
                }
            }
            for (int var21 = 0; var21 < field289; var21++) {
                class3 var22 = field479[field286[var21]];
                if (var22 != null && var22.method18() && !var22.field50) {
                    int var23 = var22.field773 / 32 - Statics.field734.field773 / 32;
                    int var24 = var22.field775 / 32 - Statics.field734.field775 / 32;
                    boolean var25 = false;
                    if (Statics.method849(var22.field39, true)) {
                        var25 = true;
                    }
                    boolean var26 = false;
                    for (int var27 = 0; var27 < Statics.field56; var27++) {
                        if (var22.field39.equals(Statics.field1324[var27].field605)) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (Statics.field734.field49 != 0 && var22.field49 != 0 && Statics.field734.field49 == var22.field49) {
                        var28 = true;
                    }
                    if (var25) {
                        method33(arg1, arg2, var23, var24, Statics.field2564[3], var4);
                    } else if (var28) {
                        method33(arg1, arg2, var23, var24, Statics.field2564[4], var4);
                    } else if (var26) {
                        method33(arg1, arg2, var23, var24, Statics.field2564[5], var4);
                    } else {
                        method33(arg1, arg2, var23, var24, Statics.field2564[2], var4);
                    }
                }
            }
            if (field275 != 0 && field267 % 20 < 10) {
                if (field275 == 1 && field276 >= 0 && field276 < field535.length) {
                    class32 var29 = field535[field276];
                    if (var29 != null) {
                        int var30 = var29.field773 / 32 - Statics.field734.field773 / 32;
                        int var31 = var29.field775 / 32 - Statics.field734.field775 / 32;
                        method64(arg1, arg2, var30, var31, Statics.field93[1], var4);
                    }
                }
                if (field275 == 2) {
                    int var32 = field346 * 4 - Statics.field193 * 4 + 2 - Statics.field734.field773 / 32;
                    int var33 = field279 * 4 - Statics.field948 * 4 + 2 - Statics.field734.field775 / 32;
                    method64(arg1, arg2, var32, var33, Statics.field93[1], var4);
                }
                if (field275 == 10 && field277 >= 0 && field277 < field479.length) {
                    class3 var34 = field479[field277];
                    if (var34 != null) {
                        int var35 = var34.field773 / 32 - Statics.field734.field773 / 32;
                        int var36 = var34.field775 / 32 - Statics.field734.field775 / 32;
                        method64(arg1, arg2, var35, var36, Statics.field93[1], var4);
                    }
                }
            }
            if (field418 != 0) {
                int var37 = field418 * 4 + 2 - Statics.field734.field773 / 32;
                int var38 = field280 * 4 + 2 - Statics.field734.field775 / 32;
                method33(arg1, arg2, var37, var38, Statics.field93[0], var4);
            }
            if (!Statics.field734.field50) {
                class75.method1532(var4.field2797 / 2 + arg1 - 1, var4.field2795 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field468[arg3] = true;
    }

    @ObfuscatedName("v.dh(Lfh;IIIB)V")
    public static final void method97(class164 arg0, int arg1, int arg2, int arg3) {
        class166 var4 = arg0.method3042();
        if (var4 == null) {
            return;
        }
        if (field498 < 3) {
            Statics.field1490.method1502(arg1, arg2, var4.field2797, var4.field2795, 25, 25, field343, 256, var4.field2794, var4.field2796);
        } else {
            class75.method1549(arg1, arg2, 0, var4.field2794, var4.field2796);
        }
    }

    @ObfuscatedName("s.dn(IIIILbr;Lfb;S)V")
    public static final void method64(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method33(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field500 + field343 & 0x7FF;
        int var8 = class86.field1519[var7];
        int var9 = class86.field1516[var7];
        int var10 = var8 * 256 / (field332 + 256);
        int var11 = var9 * 256 / (field332 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field61.method1467(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("f.ds(IIIILbr;Lfb;B)V")
    public static final void method33(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field500 + field343 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class86.field1519[var6];
        int var9 = class86.field1516[var6];
        int var10 = var8 * 256 / (field332 + 256);
        int var11 = var9 * 256 / (field332 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1473(arg5.field2797 / 2 + var12 - arg4.field1343 / 2, arg5.field2795 / 2 - var13 - arg4.field1342 / 2, arg0, arg1, arg5.field2797, arg5.field2795, arg5.field2794, arg5.field2796);
        } else {
            arg4.method1455(arg5.field2797 / 2 + arg0 + var12 - arg4.field1343 / 2, arg5.field2795 / 2 + arg1 - var13 - arg4.field1342 / 2);
        }
    }

    @ObfuscatedName("v.dq(Ljava/lang/String;B)Z")
    public static boolean method101(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method65(arg0, Statics.field261);
        for (int var2 = 0; var2 < field401; var2++) {
            class8 var3 = field534[var2];
            if (var1.equalsIgnoreCase(class155.method65(var3.field125, Statics.field261))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method65(var3.field124, Statics.field261))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ez.dg(Ljava/lang/String;I)V")
    public static final void method2867(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field446 < 200 || field385 == 1) || field446 >= 400) {
            class11.method3366(30, "", class148.field2379);
            return;
        }
        String var1 = class155.method65(arg0, Statics.field261);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field446; var2++) {
            class17 var3 = field393[var2];
            String var4 = class155.method65(var3.field238, Statics.field261);
            if (var4 != null && var4.equals(var1)) {
                class11.method3366(30, "", arg0 + class148.field2380);
                return;
            }
            if (var3.field237 != null) {
                String var5 = class155.method65(var3.field237, Statics.field261);
                if (var5 != null && var5.equals(var1)) {
                    class11.method3366(30, "", arg0 + class148.field2380);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field401; var6++) {
            class8 var7 = field534[var6];
            String var8 = class155.method65(var7.field125, Statics.field261);
            if (var8 != null && var8.equals(var1)) {
                class11.method3366(30, "", class148.field2385 + arg0 + class148.field2386);
                return;
            }
            if (var7.field124 != null) {
                String var9 = class155.method65(var7.field124, Statics.field261);
                if (var9 != null && var9.equals(var1)) {
                    class11.method3366(30, "", class148.field2385 + arg0 + class148.field2386);
                    return;
                }
            }
        }
        if (class155.method65(Statics.field734.field39, Statics.field261).equals(var1)) {
            class11.method3366(30, "", class148.field2383);
        } else {
            field452.method2426(135);
            field452.method2160(class111.method1406(arg0));
            field452.method2186(arg0);
        }
    }

    @ObfuscatedName("cz.dl(Ljava/lang/String;II)V")
    public static final void method1620(String arg0, int arg1) {
        field452.method2426(49);
        field452.method2160(class111.method1406(arg0) + 1);
        field452.method2321(arg1);
        field452.method2186(arg0);
    }

    @ObfuscatedName("co.dt(Ljava/lang/String;B)V")
    public static final void method1796(String arg0) {
        if (!arg0.equals("")) {
            field452.method2426(187);
            field452.method2160(class111.method1406(arg0));
            field452.method2186(arg0);
        }
    }

    @ObfuscatedName("d.dm(II)V")
    public static void method96(int arg0) {
        for (class192 var1 = (class192) field464.method3412(); var1 != null; var1 = (class192) field464.method3410()) {
            if ((var1.field3015 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3533();
            }
        }
    }

    @ObfuscatedName("d.dj(Lfh;I)I")
    public static int method84(class164 arg0) {
        class192 var1 = (class192) field464.method3405(((long) arg0.field2652 << 32) + (long) arg0.field2653);
        return var1 == null ? arg0.field2670 : var1.field3001;
    }

    @ObfuscatedName("q.db(Lfh;I)Z")
    public static boolean method485(class164 arg0) {
        if (field430) {
            if (method84(arg0) != 0) {
                return false;
            }
            if (arg0.field2654 == 0) {
                return false;
            }
        }
        return arg0.field2672;
    }

    @ObfuscatedName("av.da(Lfh;II)Ljava/lang/String;")
    public static String method883(class164 arg0, int arg1) {
        if (!class169.method2004(method84(arg0), arg1) && arg0.field2750 == null) {
            return null;
        } else if (arg0.field2724 == null || arg0.field2724.length <= arg1 || arg0.field2724[arg1] == null || arg0.field2724[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2724[arg1];
        }
    }

    @ObfuscatedName("v.dx(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method103(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field259 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field259 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field259 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field259 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field259 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1017 != null) {
            var3 = "/p=" + Statics.field1017;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field264 + "/a=" + Statics.field2570 + var3 + "/";
    }

    @ObfuscatedName("ak.dd(Ljava/lang/String;ZS)V")
    public static void method627(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field659; var5++) {
            class47 var6 = class47.method2450(var5);
            if ((!arg1 || var6.field1060) && var6.field1087 == -1 && var6.field1056.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1310 = -1;
                    Statics.field2563 = null;
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
        Statics.field2563 = var3;
        Statics.field1953 = 0;
        Statics.field1310 = var4;
        String[] var9 = new String[Statics.field1310];
        for (int var10 = 0; var10 < Statics.field1310; var10++) {
            var9[var10] = class47.method2450(var3[var10]).field1056;
        }
        class116.method515(var9, Statics.field2563);
    }
}

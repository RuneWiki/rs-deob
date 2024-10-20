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
import java.net.Socket;
import java.util.Iterator;

public final class client extends class136 {

    @ObfuscatedName("client.a")
    public static boolean field246 = true;

    @ObfuscatedName("client.k")
    public static int field478 = 1;

    @ObfuscatedName("client.p")
    public static int field248 = 0;

    @ObfuscatedName("client.u")
    public static int field250 = 0;

    @ObfuscatedName("client.q")
    public static boolean field253 = false;

    @ObfuscatedName("client.v")
    public static boolean field254 = false;

    @ObfuscatedName("client.n")
    public static int field255 = 0;

    @ObfuscatedName("client.c")
    public static int field257 = 0;

    @ObfuscatedName("client.t")
    public static boolean field258 = true;

    @ObfuscatedName("client.h")
    public static int field259 = 0;

    @ObfuscatedName("client.w")
    public static class220[] field310 = new class220[4];

    @ObfuscatedName("client.g")
    public static long field260 = 1L;

    @ObfuscatedName("client.j")
    public static int field261 = -1;

    @ObfuscatedName("client.d")
    public static int field262 = -1;

    @ObfuscatedName("client.ax")
    public static int field263 = -1;

    @ObfuscatedName("client.ag")
    public static boolean field463 = true;

    @ObfuscatedName("client.ai")
    public static boolean field265 = false;

    @ObfuscatedName("client.ar")
    public static int field523 = 0;

    @ObfuscatedName("client.aw")
    public static int field267 = 0;

    @ObfuscatedName("client.ac")
    public static int field339 = 0;

    @ObfuscatedName("client.ap")
    public static int field269 = 0;

    @ObfuscatedName("client.al")
    public static int field270 = 0;

    @ObfuscatedName("client.ak")
    public static int field324 = 0;

    @ObfuscatedName("client.at")
    public static int field331 = 0;

    @ObfuscatedName("client.au")
    public static int field273 = 0;

    @ObfuscatedName("client.am")
    public static int field274 = 0;

    @ObfuscatedName("client.aa")
    public static class111 field459 = new class111(new byte[5000]);

    @ObfuscatedName("client.ah")
    public static class19 field494 = class19.field541;

    @ObfuscatedName("client.aq")
    public static int field278 = 0;

    @ObfuscatedName("client.ad")
    public static int field279 = 0;

    @ObfuscatedName("client.af")
    public static int field280 = 0;

    @ObfuscatedName("client.by")
    public static int field293 = 0;

    @ObfuscatedName("client.bc")
    public static int field283 = 0;

    @ObfuscatedName("client.bn")
    public static int field284 = 0;

    @ObfuscatedName("client.bt")
    public static int field447 = 0;

    @ObfuscatedName("client.bm")
    public static int field341 = 0;

    @ObfuscatedName("client.cg")
    public static class32[] field289 = new class32[32768];

    @ObfuscatedName("client.cm")
    public static int field290 = 0;

    @ObfuscatedName("client.cb")
    public static int[] field291 = new int[32768];

    @ObfuscatedName("client.cq")
    public static class114 field397 = new class114(5000);

    @ObfuscatedName("client.cf")
    public static class114 field384 = new class114(5000);

    @ObfuscatedName("client.cz")
    public static class114 field394 = new class114(5000);

    @ObfuscatedName("client.ct")
    public static int field295 = 0;

    @ObfuscatedName("client.ck")
    public static int field296 = 0;

    @ObfuscatedName("client.cl")
    public static int field297 = 0;

    @ObfuscatedName("client.cn")
    public static int field271 = 0;

    @ObfuscatedName("client.cp")
    public static int field299 = 0;

    @ObfuscatedName("client.cu")
    public static int field300 = 0;

    @ObfuscatedName("client.co")
    public static int field301 = 0;

    @ObfuscatedName("client.cc")
    public static int field356 = 0;

    @ObfuscatedName("client.ci")
    public static boolean field303 = false;

    @ObfuscatedName("client.cy")
    public static int field323 = 0;

    @ObfuscatedName("client.du")
    public static int field305 = 0;

    @ObfuscatedName("client.db")
    public static int field266 = 1;

    @ObfuscatedName("client.dx")
    public static int field307 = 0;

    @ObfuscatedName("client.dz")
    public static int field308 = 1;

    @ObfuscatedName("client.dj")
    public static int field434 = 0;

    @ObfuscatedName("client.di")
    public static boolean field504 = false;

    @ObfuscatedName("client.da")
    public static int[][][] field527 = new int[4][13][13];

    @ObfuscatedName("client.ds")
    public static final int[] field313 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dw")
    public static int field247 = 0;

    @ObfuscatedName("client.dk")
    public static int field315 = 2;

    @ObfuscatedName("client.df")
    public static int field316 = 0;

    @ObfuscatedName("client.dc")
    public static int field317 = 2;

    @ObfuscatedName("client.de")
    public static int field412 = 0;

    @ObfuscatedName("client.do")
    public static int field319 = 1;

    @ObfuscatedName("client.dm")
    public static int field461 = 0;

    @ObfuscatedName("client.eq")
    public static int field321 = 0;

    @ObfuscatedName("client.ez")
    public static int field436 = 2;

    @ObfuscatedName("client.ej")
    public static int field268 = 0;

    @ObfuscatedName("client.ey")
    public static int field314 = 1;

    @ObfuscatedName("client.ep")
    public static int field325 = 0;

    @ObfuscatedName("client.eb")
    public static int field326 = 0;

    @ObfuscatedName("client.er")
    public static int field360 = 2301979;

    @ObfuscatedName("client.ea")
    public static int field328 = 5063219;

    @ObfuscatedName("client.eh")
    public static int field329 = 3353893;

    @ObfuscatedName("client.ev")
    public static int field474 = 7759444;

    @ObfuscatedName("client.em")
    public static boolean field376 = false;

    @ObfuscatedName("client.ei")
    public static int field332 = 0;

    @ObfuscatedName("client.fl")
    public static int field334 = 128;

    @ObfuscatedName("client.fw")
    public static int field330 = 0;

    @ObfuscatedName("client.fg")
    public static int field444 = 0;

    @ObfuscatedName("client.fx")
    public static int field497 = 0;

    @ObfuscatedName("client.fp")
    public static int field338 = 0;

    @ObfuscatedName("client.fh")
    public static int field520 = 0;

    @ObfuscatedName("client.fu")
    public static int field340 = 0;

    @ObfuscatedName("client.fy")
    public static boolean field532 = false;

    @ObfuscatedName("client.fs")
    public static int field342 = 0;

    @ObfuscatedName("client.ft")
    public static int field343 = 0;

    @ObfuscatedName("client.fv")
    public static int field344 = 50;

    @ObfuscatedName("client.fe")
    public static int[] field345 = new int[field344];

    @ObfuscatedName("client.fq")
    public static int[] field346 = new int[field344];

    @ObfuscatedName("client.fz")
    public static int[] field347 = new int[field344];

    @ObfuscatedName("client.fr")
    public static int[] field348 = new int[field344];

    @ObfuscatedName("client.fb")
    public static int[] field349 = new int[field344];

    @ObfuscatedName("client.fd")
    public static int[] field350 = new int[field344];

    @ObfuscatedName("client.fa")
    public static int[] field351 = new int[field344];

    @ObfuscatedName("client.fk")
    public static String[] field352 = new String[field344];

    @ObfuscatedName("client.fc")
    public static int[][] field353 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field470 = 0;

    @ObfuscatedName("client.gt")
    public static int field355 = -1;

    @ObfuscatedName("client.gp")
    public static int field304 = -1;

    @ObfuscatedName("client.gg")
    public static int field357 = 0;

    @ObfuscatedName("client.ge")
    public static int field358 = 0;

    @ObfuscatedName("client.gu")
    public static int field359 = 0;

    @ObfuscatedName("client.gb")
    public static int field433 = 0;

    @ObfuscatedName("client.gz")
    public static int field361 = 0;

    @ObfuscatedName("client.gs")
    public static int field277 = 0;

    @ObfuscatedName("client.gr")
    public static int field285 = 0;

    @ObfuscatedName("client.gc")
    public static int field364 = 0;

    @ObfuscatedName("client.gd")
    public static int field365 = 0;

    @ObfuscatedName("client.gx")
    public static int field366 = 0;

    @ObfuscatedName("client.gv")
    public static boolean field367 = false;

    @ObfuscatedName("client.gi")
    public static int field401 = 0;

    @ObfuscatedName("client.go")
    public static int field369 = 0;

    @ObfuscatedName("client.gl")
    public static class3[] field370 = new class3[2048];

    @ObfuscatedName("client.gk")
    public static int field371 = 0;

    @ObfuscatedName("client.gq")
    public static int[] field391 = new int[2048];

    @ObfuscatedName("client.ga")
    public static int field373 = 0;

    @ObfuscatedName("client.gw")
    public static int[] field374 = new int[2048];

    @ObfuscatedName("client.hb")
    public static class111[] field282 = new class111[2048];

    @ObfuscatedName("client.hk")
    public static int field482 = -1;

    @ObfuscatedName("client.he")
    public static int field529 = 0;

    @ObfuscatedName("client.hn")
    public static int field378 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field379 = new int[1000];

    @ObfuscatedName("client.hj")
    public static final int[] field380 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ht")
    public static String[] field381 = new String[8];

    @ObfuscatedName("client.hi")
    public static boolean[] field512 = new boolean[8];

    @ObfuscatedName("client.hd")
    public static int[] field383 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hx")
    public static int field363 = -1;

    @ObfuscatedName("client.hh")
    public static class190[][][] field385 = new class190[4][104][104];

    @ObfuscatedName("client.hl")
    public static class190 field386 = new class190();

    @ObfuscatedName("client.hz")
    public static class190 field387 = new class190();

    @ObfuscatedName("client.hy")
    public static class190 field519 = new class190();

    @ObfuscatedName("client.hf")
    public static int[] field389 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field336 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field409 = new int[25];

    @ObfuscatedName("client.hp")
    public static int field292 = 0;

    @ObfuscatedName("client.ho")
    public static boolean field418 = false;

    @ObfuscatedName("client.iu")
    public static int field377 = 0;

    @ObfuscatedName("client.if")
    public static int[] field395 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field408 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field479 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field398 = new int[500];

    @ObfuscatedName("client.io")
    public static String[] field399 = new String[500];

    @ObfuscatedName("client.ie")
    public static String[] field400 = new String[500];

    @ObfuscatedName("client.ic")
    public static int field275 = -1;

    @ObfuscatedName("client.ig")
    public static int field402 = -1;

    @ObfuscatedName("client.ir")
    public static int field403 = 0;

    @ObfuscatedName("client.id")
    public static int field404 = 50;

    @ObfuscatedName("client.ih")
    public static int field302 = 0;

    @ObfuscatedName("client.ii")
    public static String field406 = null;

    @ObfuscatedName("client.it")
    public static boolean field407 = false;

    @ObfuscatedName("client.iz")
    public static int field410 = -1;

    @ObfuscatedName("client.ia")
    public static int field516 = -1;

    @ObfuscatedName("client.iq")
    public static String field506 = null;

    @ObfuscatedName("client.jn")
    public static String field411 = null;

    @ObfuscatedName("client.ji")
    public static int field306 = -1;

    @ObfuscatedName("client.jt")
    public static class187 field413 = new class187(8);

    @ObfuscatedName("client.jm")
    public static int field320 = 0;

    @ObfuscatedName("client.jg")
    public static int field415 = 0;

    @ObfuscatedName("client.jl")
    public static class164 field416 = null;

    @ObfuscatedName("client.jq")
    public static int field417 = 0;

    @ObfuscatedName("client.js")
    public static int field251 = 0;

    @ObfuscatedName("client.ja")
    public static int field311 = 0;

    @ObfuscatedName("client.jy")
    public static int field420 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field439 = false;

    @ObfuscatedName("client.je")
    public static boolean field422 = false;

    @ObfuscatedName("client.jr")
    public static boolean field388 = false;

    @ObfuscatedName("client.jd")
    public static class164 field424 = null;

    @ObfuscatedName("client.jv")
    public static class164 field425 = null;

    @ObfuscatedName("client.jb")
    public static class164 field426 = null;

    @ObfuscatedName("client.ju")
    public static int field427 = 0;

    @ObfuscatedName("client.jh")
    public static int field428 = 0;

    @ObfuscatedName("client.jk")
    public static class164 field429 = null;

    @ObfuscatedName("client.jf")
    public static boolean field430 = false;

    @ObfuscatedName("client.jx")
    public static int field431 = -1;

    @ObfuscatedName("client.jj")
    public static int field432 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field312 = false;

    @ObfuscatedName("client.jp")
    public static int field335 = -1;

    @ObfuscatedName("client.jo")
    public static int field435 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field264 = false;

    @ObfuscatedName("client.ko")
    public static int field437 = 1;

    @ObfuscatedName("client.ka")
    public static int[] field438 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field468 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field440 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field362 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field442 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field508 = 0;

    @ObfuscatedName("client.kw")
    public static int field472 = 0;

    @ObfuscatedName("client.kx")
    public static int field445 = 0;

    @ObfuscatedName("client.kh")
    public static int field405 = 0;

    @ObfuscatedName("client.kc")
    public static int field421 = 0;

    @ObfuscatedName("client.ku")
    public static int field354 = 0;

    @ObfuscatedName("client.kv")
    public static int field449 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field450 = new int[2000];

    @ObfuscatedName("client.kd")
    public static String[] field487 = new String[1000];

    @ObfuscatedName("client.kn")
    public static int field452 = 0;

    @ObfuscatedName("client.kt")
    public static class190 field244 = new class190();

    @ObfuscatedName("client.kz")
    public static class190 field454 = new class190();

    @ObfuscatedName("client.kk")
    public static class190 field455 = new class190();

    @ObfuscatedName("client.lt")
    public static class187 field456 = new class187(512);

    @ObfuscatedName("client.ll")
    public static int field457 = 0;

    @ObfuscatedName("client.lh")
    public static int field458 = -2;

    @ObfuscatedName("client.lv")
    public static boolean[] field492 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static boolean[] field298 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field337 = new boolean[100];

    @ObfuscatedName("client.la")
    public static int[] field462 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field372 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field464 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field465 = new int[100];

    @ObfuscatedName("client.lk")
    public static int field466 = 0;

    @ObfuscatedName("client.lf")
    public static long field467 = 0L;

    @ObfuscatedName("client.lq")
    public static boolean field499 = true;

    @ObfuscatedName("client.lx")
    public static int field396 = 1;

    @ObfuscatedName("client.le")
    public static int field368 = 1;

    @ObfuscatedName("client.ld")
    public static int[] field471 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ls")
    public static int field333 = 0;

    @ObfuscatedName("client.lw")
    public static int field473 = 0;

    @ObfuscatedName("client.ly")
    public static String field309 = "";

    @ObfuscatedName("client.mf")
    public static long[] field476 = new long[100];

    @ObfuscatedName("client.mm")
    public static int field477 = 0;

    @ObfuscatedName("client.mn")
    public static int field525 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field531 = new int[128];

    @ObfuscatedName("client.my")
    public static int[] field480 = new int[128];

    @ObfuscatedName("client.ml")
    public static long field481 = -1L;

    @ObfuscatedName("client.mp")
    public static String field488 = null;

    @ObfuscatedName("client.mw")
    public static String field483 = null;

    @ObfuscatedName("client.md")
    public static int field485 = -1;

    @ObfuscatedName("client.ms")
    public static int field486 = 0;

    @ObfuscatedName("client.mo")
    public static int[] field534 = new int[1000];

    @ObfuscatedName("client.mx")
    public static int[] field441 = new int[1000];

    @ObfuscatedName("client.mb")
    public static class74[] field489 = new class74[1000];

    @ObfuscatedName("client.mt")
    public static int field393 = 0;

    @ObfuscatedName("client.mr")
    public static int field446 = 0;

    @ObfuscatedName("client.nq")
    public static int field443 = 0;

    @ObfuscatedName("client.nf")
    public static int field493 = 255;

    @ObfuscatedName("client.ne")
    public static int field469 = -1;

    @ObfuscatedName("client.nl")
    public static boolean field495 = false;

    @ObfuscatedName("client.nx")
    public static int field496 = 127;

    @ObfuscatedName("client.nb")
    public static int field375 = 127;

    @ObfuscatedName("client.ng")
    public static int field498 = 0;

    @ObfuscatedName("client.nm")
    public static int[] field286 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field500 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field501 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field423 = new int[50];

    @ObfuscatedName("client.nv")
    public static class54[] field503 = new class54[50];

    @ObfuscatedName("client.nw")
    public static boolean field526 = false;

    @ObfuscatedName("client.ob")
    public static boolean[] field505 = new boolean[5];

    @ObfuscatedName("client.oe")
    public static int[] field460 = new int[5];

    @ObfuscatedName("client.os")
    public static int[] field507 = new int[5];

    @ObfuscatedName("client.ok")
    public static int[] field294 = new int[5];

    @ObfuscatedName("client.oo")
    public static int[] field509 = new int[5];

    @ObfuscatedName("client.oq")
    public static short field490 = 256;

    @ObfuscatedName("client.oi")
    public static short field511 = 205;

    @ObfuscatedName("client.od")
    public static short field390 = 256;

    @ObfuscatedName("client.ox")
    public static short field513 = 320;

    @ObfuscatedName("client.oz")
    public static short field514 = 1;

    @ObfuscatedName("client.ou")
    public static short field515 = 32767;

    @ObfuscatedName("client.og")
    public static short field419 = 1;

    @ObfuscatedName("client.oh")
    public static short field517 = 32767;

    @ObfuscatedName("client.oa")
    public static int field518 = 0;

    @ObfuscatedName("client.or")
    public static int field453 = 0;

    @ObfuscatedName("client.ol")
    public static int field322 = 0;

    @ObfuscatedName("client.oy")
    public static int field521 = 0;

    @ObfuscatedName("client.ot")
    public static int field522 = 0;

    @ObfuscatedName("client.oc")
    public static int field502 = 0;

    @ObfuscatedName("client.op")
    public static int field524 = 0;

    @ObfuscatedName("client.om")
    public static class17[] field272 = new class17[400];

    @ObfuscatedName("client.pg")
    public static class186 field533 = new class186();

    @ObfuscatedName("client.ps")
    public static int field318 = 0;

    @ObfuscatedName("client.pe")
    public static class8[] field528 = new class8[400];

    @ObfuscatedName("client.pn")
    public static class170 field327 = new class170();

    @ObfuscatedName("client.pb")
    public static int field530 = -1;

    @ObfuscatedName("client.pl")
    public static int field382 = -1;

    @ObfuscatedName("client.pm")
    public static class211[] field392 = new class211[6];

    @ObfuscatedName("client.a(B)V")
    public final void method188() {
    }

    public final void init() {
        if (!this.method2658()) {
            return;
        }
        class181[] var1 = new class181[] { class181.field2943, class181.field2959, class181.field2951, class181.field2954, class181.field2947, class181.field2948, class181.field2945, class181.field2957, class181.field2956, class181.field2952, class181.field2949, class181.field2953, class181.field2950, class181.field2944, class181.field2946 };
        class181[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class181 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2958);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2958)) {
                    case 1:
                        field248 = Integer.parseInt(var5);
                    case 2:
                    case 7:
                    case 12:
                    default:
                        break;
                    case 3:
                        Statics.field451 = (class145) class101.method2555(class145.method13(), Integer.parseInt(var5));
                        if (Statics.field451 == class145.field2180) {
                            Statics.field252 = class203.field3029;
                        } else {
                            Statics.field252 = class203.field3032;
                        }
                        break;
                    case 4:
                        Statics.field580 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field250 = Integer.parseInt(var5);
                        break;
                    case 6:
                        field255 = Integer.parseInt(var5);
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field23)) {
                            field253 = true;
                        } else {
                            field253 = false;
                        }
                        break;
                    case 9:
                        field478 = Integer.parseInt(var5);
                        break;
                    case 10:
                        Statics.field207 = var5;
                        break;
                    case 11:
                        Statics.field249 = class144.method617(Integer.parseInt(var5));
                        break;
                    case 13:
                        Statics.field3057 = Integer.parseInt(var5);
                        break;
                    case 14:
                        Statics.field256 = var5;
                        break;
                    case 15:
                        if (var5.equalsIgnoreCase(class2.field23)) {
                        }
                }
            }
        }
        class81.field1433 = false;
        field254 = false;
        Statics.field1706 = this.getCodeBase().getHost();
        String var6 = Statics.field249.field2172;
        byte var7 = 0;
        try {
            Statics.field1019 = 16;
            Statics.field2885 = var7;
            try {
                Statics.field1486 = System.getProperty("os.name");
            } catch (Exception var52) {
                Statics.field1486 = "Unknown";
            }
            Statics.field2140 = Statics.field1486.toLowerCase();
            try {
                Statics.field1848 = System.getProperty("user.home");
                if (Statics.field1848 != null) {
                    Statics.field1848 = Statics.field1848 + "/";
                }
            } catch (Exception var51) {
            }
            try {
                if (Statics.field2140.startsWith("win")) {
                    if (Statics.field1848 == null) {
                        Statics.field1848 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1848 == null) {
                    Statics.field1848 = System.getenv("HOME");
                }
                if (Statics.field1848 != null) {
                    Statics.field1848 = Statics.field1848 + "/";
                }
            } catch (Exception var50) {
            }
            if (Statics.field1848 == null) {
                Statics.field1848 = "~/";
            }
            Statics.field535 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1848, "/tmp/", "" };
            Statics.field2129 = new String[] { ".jagex_cache_" + Statics.field2885, ".file_store_" + Statics.field2885 };
            int var11 = 0;
            label259: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field2132 = new File(Statics.field1848, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field2132.exists()) {
                    try {
                        class218 var16 = new class218(Statics.field2132, "rw", 10000L);
                        class111 var17 = new class111((int) var16.method3630());
                        while (var17.field1894 < var17.field1897.length) {
                            int var18 = var16.method3631(var17.field1897, var17.field1894, var17.field1897.length - var17.field1894);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field1894 += var18;
                        }
                        var17.field1894 = 0;
                        int var19 = var17.method2127();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method2127();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method2136();
                            if (var20 == 1) {
                                var14 = var17.method2136();
                            }
                        } else {
                            var13 = var17.method2154();
                            if (var20 == 1) {
                                var14 = var17.method2154();
                            }
                        }
                        var16.method3632();
                    } catch (IOException var54) {
                        var54.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class141.method1772(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label234: for (int var24 = 0; var24 < Statics.field2129.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field535.length; var25++) {
                            File var26 = new File(Statics.field535[var25] + Statics.field2129[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class141.method1772(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label234;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field1848 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var27 = new File(var14);
                    File var28 = new File(var13);
                    try {
                        File[] var29 = var27.listFiles();
                        File[] var30 = var29;
                        for (int var31 = 0; var31 < var30.length; var31++) {
                            File var32 = var30[var31];
                            File var33 = new File(var28, var32.getName());
                            boolean var34 = var32.renameTo(var33);
                            if (!var34) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var53) {
                        var53.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    File var36 = new File(var13);
                    Object var37 = null;
                    try {
                        class218 var38 = new class218(Statics.field2132, "rw", 10000L);
                        class111 var39 = new class111(500);
                        var39.method2112(3);
                        var39.method2112(var37 == null ? 0 : 1);
                        var39.method2120(var36.getPath());
                        if (var37 != null) {
                            var39.method2120(((File) var37).getPath());
                        }
                        var38.method3626(var39.field1897, 0, var39.field1894);
                        var38.method3632();
                    } catch (IOException var49) {
                        var49.printStackTrace();
                    }
                }
                File var41 = new File(var13);
                Statics.field2133 = var41;
                if (!Statics.field2133.exists()) {
                    Statics.field2133.mkdirs();
                }
                File[] var42 = Statics.field2133.listFiles();
                if (var42 == null) {
                    break;
                }
                File[] var43 = var42;
                int var44 = 0;
                while (true) {
                    if (var44 >= var43.length) {
                        break label259;
                    }
                    File var45 = var43[var44];
                    if (!class141.method1772(var45, false)) {
                        var11++;
                        break;
                    }
                    var44++;
                }
            }
            File var46 = Statics.field2133;
            Statics.field1989 = var46;
            if (!Statics.field1989.exists()) {
                throw new RuntimeException("");
            }
            class127.field1982 = true;
            class141.method123();
            class141.field2137 = new class219(new class218(class127.method1763("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class141.field2138 = new class219(new class218(class127.method1763("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1952 = new class219[Statics.field1019];
            for (int var47 = 0; var47 < Statics.field1019; var47++) {
                Statics.field1952[var47] = new class219(new class218(class127.method1763("main_file_cache.idx" + var47), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var55) {
            class140.method2489((String) null, var55);
        }
        Statics.field245 = this;
        this.method2678(765, 503, 79);
    }

    @ObfuscatedName("client.p(I)V")
    public final void method191() {
        Statics.field52 = field250 == 0 ? 43594 : field478 + 40000;
        Statics.field287 = field250 == 0 ? 443 : field478 + 50000;
        Statics.field288 = Statics.field52;
        Statics.field539 = class165.field2771;
        Statics.field540 = class165.field2775;
        Statics.field1481 = class165.field2772;
        Statics.field2802 = class165.field2770;
        class129.method3245();
        Canvas var1 = Statics.field1328;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class129.field2020);
        var1.addFocusListener(class129.field2020);
        Canvas var2 = Statics.field1328;
        var2.addMouseListener(class132.field2062);
        var2.addMouseMotionListener(class132.field2062);
        var2.addFocusListener(class132.field2062);
        Statics.field882 = class123.method175();
        if (Statics.field882 != null) {
            Statics.field882.method2449(Statics.field1328);
        }
        Statics.field158 = new class126(255, class141.field2137, class141.field2138, 500000);
        Statics.field1015 = class9.method139();
        Statics.field1698 = this.getToolkit().getSystemClipboard();
        class130.method1865(this, Statics.field1566);
        if (field250 != 0) {
            field265 = true;
        }
        int var3 = Statics.field1015.field128;
        field467 = 0L;
        if (var3 >= 2) {
            field499 = true;
        } else {
            field499 = false;
        }
        method1333();
        if (field257 >= 25) {
            method918();
        }
        field2089 = true;
    }

    @ObfuscatedName("client.l(I)V")
    public final void method227() {
        field259++;
        this.method195();
        while (true) {
            class190 var1 = class161.field2596;
            class160 var2;
            synchronized (class161.field2596) {
                var2 = (class160) class161.field2593.method3340();
            }
            if (var2 == null) {
                try {
                    if (class174.field2838 == 1) {
                        int var4 = Statics.field2533.method3133();
                        if (var4 > 0 && Statics.field2533.method3158()) {
                            int var5 = var4 - Statics.field2505;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2533.method3219(var5);
                        } else {
                            Statics.field2533.method3180();
                            Statics.field2533.method3201();
                            if (Statics.field2842 == null) {
                                class174.field2838 = 0;
                            } else {
                                class174.field2838 = 2;
                            }
                            Statics.field133 = null;
                            Statics.field2844 = null;
                        }
                    }
                } catch (Exception var89) {
                    var89.printStackTrace();
                    Statics.field2533.method3180();
                    class174.field2838 = 0;
                    Statics.field133 = null;
                    Statics.field2844 = null;
                    Statics.field2842 = null;
                }
                method2411();
                class129 var7 = class129.field2020;
                synchronized (class129.field2020) {
                    class129.field2028++;
                    class129.field2025 = class129.field2030;
                    class129.field2024 = 0;
                    if (class129.field2033 >= 0) {
                        while (class129.field2033 != class129.field2019) {
                            int var9 = class129.field2018[class129.field2019];
                            class129.field2019 = class129.field2019 + 1 & 0x7F;
                            if (var9 < 0) {
                                class129.field2017[~var9] = false;
                            } else {
                                if (!class129.field2017[var9] && class129.field2024 < class129.field2023.length - 1) {
                                    class129.field2023[++class129.field2024 - 1] = var9;
                                }
                                class129.field2017[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class129.field2017[var8] = false;
                        }
                        class129.field2033 = class129.field2019;
                    }
                    class129.field2030 = class129.field2026;
                }
                class132 var11 = class132.field2062;
                synchronized (class132.field2062) {
                    class132.field2065 = class132.field2049;
                    class132.field2053 = class132.field2050;
                    class132.field2054 = class132.field2051;
                    class132.field2059 = class132.field2055;
                    class132.field2060 = class132.field2056;
                    class132.field2048 = class132.field2057;
                    class132.field2052 = class132.field2058;
                    class132.field2055 = 0;
                }
                if (Statics.field882 != null) {
                    int var13 = Statics.field882.method2450();
                    field452 = var13;
                }
                if (field257 == 0) {
                    method185();
                    Statics.field1565.method2474();
                    for (int var14 = 0; var14 < 32; var14++) {
                        field2097[var14] = 0L;
                    }
                    for (int var15 = 0; var15 < 32; var15++) {
                        field2099[var15] = 0L;
                    }
                    Statics.field948 = 0;
                } else if (field257 == 5) {
                    class30.method502(this);
                    method185();
                    Statics.field1565.method2474();
                    for (int var16 = 0; var16 < 32; var16++) {
                        field2097[var16] = 0L;
                    }
                    for (int var17 = 0; var17 < 32; var17++) {
                        field2099[var17] = 0L;
                    }
                    Statics.field948 = 0;
                } else if (field257 == 10 || field257 == 11) {
                    class30.method502(this);
                } else if (field257 == 20) {
                    class30.method502(this);
                    Statics.method176();
                } else if (field257 == 25) {
                    method37(false);
                    field305 = 0;
                    boolean var18 = true;
                    for (int var19 = 0; var19 < Statics.field718.length; var19++) {
                        if (Statics.field2797[var19] != -1 && Statics.field718[var19] == null) {
                            Statics.field718[var19] = Statics.field2966.method2819(Statics.field2797[var19], 0);
                            if (Statics.field718[var19] == null) {
                                var18 = false;
                                field305++;
                            }
                        }
                        if (Statics.field1491[var19] != -1 && Statics.field1609[var19] == null) {
                            Statics.field1609[var19] = Statics.field2966.method2835(Statics.field1491[var19], 0, Statics.field2108[var19]);
                            if (Statics.field1609[var19] == null) {
                                var18 = false;
                                field305++;
                            }
                        }
                    }
                    if (var18) {
                        field307 = 0;
                        boolean var20 = true;
                        for (int var21 = 0; var21 < Statics.field718.length; var21++) {
                            byte[] var22 = Statics.field1609[var21];
                            if (var22 != null) {
                                int var23 = (Statics.field3021[var21] >> 8) * 64 - Statics.field1912;
                                int var24 = (Statics.field3021[var21] & 0xFF) * 64 - Statics.field1084;
                                if (field504) {
                                    var23 = 10;
                                    var24 = 10;
                                }
                                var20 &= class6.method727(var22, var23, var24);
                            }
                        }
                        if (var20) {
                            if (field434 != 0) {
                                Statics.method869(class148.field2457 + class2.field21 + class2.field15 + 100 + "%" + class2.field19, true);
                            }
                            method2411();
                            method524();
                            method2411();
                            Statics.field619.method1588();
                            method2411();
                            System.gc();
                            for (int var25 = 0; var25 < 4; var25++) {
                                field310[var25].method3673();
                            }
                            for (int var26 = 0; var26 < 4; var26++) {
                                for (int var27 = 0; var27 < 104; var27++) {
                                    for (int var28 = 0; var28 < 104; var28++) {
                                        class6.field81[var26][var27][var28] = 0;
                                    }
                                }
                            }
                            method2411();
                            class6.method538();
                            int var29 = Statics.field718.length;
                            for (class22 var30 = (class22) class22.field576.method3324(); var30 != null; var30 = (class22) class22.field576.method3326()) {
                                if (var30.field569 != null) {
                                    Statics.field2061.method972(var30.field569);
                                    var30.field569 = null;
                                }
                                if (var30.field574 != null) {
                                    Statics.field2061.method972(var30.field574);
                                    var30.field574 = null;
                                }
                            }
                            class22.field576.method3318();
                            method37(true);
                            if (!field504) {
                                for (int var31 = 0; var31 < var29; var31++) {
                                    int var32 = (Statics.field3021[var31] >> 8) * 64 - Statics.field1912;
                                    int var33 = (Statics.field3021[var31] & 0xFF) * 64 - Statics.field1084;
                                    byte[] var34 = Statics.field718[var31];
                                    if (var34 != null) {
                                        method2411();
                                        class6.method552(var34, var32, var33, Statics.field1123 * 8 - 48, Statics.field995 * 8 - 48, field310);
                                    }
                                }
                                for (int var35 = 0; var35 < var29; var35++) {
                                    int var36 = (Statics.field3021[var35] >> 8) * 64 - Statics.field1912;
                                    int var37 = (Statics.field3021[var35] & 0xFF) * 64 - Statics.field1084;
                                    byte[] var38 = Statics.field718[var35];
                                    if (var38 == null && Statics.field995 < 800) {
                                        method2411();
                                        class6.method2742(var36, var37, 64, 64);
                                    }
                                }
                                method37(true);
                                for (int var39 = 0; var39 < var29; var39++) {
                                    byte[] var40 = Statics.field1609[var39];
                                    if (var40 != null) {
                                        int var41 = (Statics.field3021[var39] >> 8) * 64 - Statics.field1912;
                                        int var42 = (Statics.field3021[var39] & 0xFF) * 64 - Statics.field1084;
                                        method2411();
                                        class6.method2938(var40, var41, var42, Statics.field619, field310);
                                    }
                                }
                            }
                            if (field504) {
                                int var43 = 0;
                                label448: while (true) {
                                    if (var43 >= 4) {
                                        for (int var61 = 0; var61 < 13; var61++) {
                                            for (int var62 = 0; var62 < 13; var62++) {
                                                int var63 = field527[0][var61][var62];
                                                if (var63 == -1) {
                                                    class6.method2742(var61 * 8, var62 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method37(true);
                                        int var64 = 0;
                                        while (true) {
                                            if (var64 >= 4) {
                                                break label448;
                                            }
                                            method2411();
                                            for (int var65 = 0; var65 < 13; var65++) {
                                                for (int var66 = 0; var66 < 13; var66++) {
                                                    int var67 = field527[var64][var65][var66];
                                                    if (var67 != -1) {
                                                        int var68 = var67 >> 24 & 0x3;
                                                        int var69 = var67 >> 1 & 0x3;
                                                        int var70 = var67 >> 14 & 0x3FF;
                                                        int var71 = var67 >> 3 & 0x7FF;
                                                        int var72 = (var70 / 8 << 8) + var71 / 8;
                                                        for (int var73 = 0; var73 < Statics.field3021.length; var73++) {
                                                            if (Statics.field3021[var73] == var72 && Statics.field1609[var73] != null) {
                                                                class6.method2490(Statics.field1609[var73], var64, var65 * 8, var66 * 8, var68, (var70 & 0x7) * 8, (var71 & 0x7) * 8, var69, Statics.field619, field310);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var64++;
                                        }
                                    }
                                    method2411();
                                    for (int var44 = 0; var44 < 13; var44++) {
                                        for (int var45 = 0; var45 < 13; var45++) {
                                            boolean var46 = false;
                                            int var47 = field527[var43][var44][var45];
                                            if (var47 != -1) {
                                                int var48 = var47 >> 24 & 0x3;
                                                int var49 = var47 >> 1 & 0x3;
                                                int var50 = var47 >> 14 & 0x3FF;
                                                int var51 = var47 >> 3 & 0x7FF;
                                                int var52 = (var50 / 8 << 8) + var51 / 8;
                                                for (int var53 = 0; var53 < Statics.field3021.length; var53++) {
                                                    if (Statics.field3021[var53] == var52 && Statics.field718[var53] != null) {
                                                        class6.method177(Statics.field718[var53], var43, var44 * 8, var45 * 8, var48, (var50 & 0x7) * 8, (var51 & 0x7) * 8, var49, field310);
                                                        var46 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var46) {
                                                int var54 = var43;
                                                int var55 = var44 * 8;
                                                int var56 = var45 * 8;
                                                for (int var57 = 0; var57 < 8; var57++) {
                                                    for (int var58 = 0; var58 < 8; var58++) {
                                                        class6.field73[var54][var55 + var57][var56 + var58] = 0;
                                                    }
                                                }
                                                if (var55 > 0) {
                                                    for (int var59 = 1; var59 < 8; var59++) {
                                                        class6.field73[var54][var55][var56 + var59] = class6.field73[var54][var55 - 1][var56 + var59];
                                                    }
                                                }
                                                if (var56 > 0) {
                                                    for (int var60 = 1; var60 < 8; var60++) {
                                                        class6.field73[var54][var55 + var60][var56] = class6.field73[var54][var55 + var60][var56 - 1];
                                                    }
                                                }
                                                if (var55 > 0 && class6.field73[var54][var55 - 1][var56] != 0) {
                                                    class6.field73[var54][var55][var56] = class6.field73[var54][var55 - 1][var56];
                                                } else if (var56 > 0 && class6.field73[var54][var55][var56 - 1] != 0) {
                                                    class6.field73[var54][var55][var56] = class6.field73[var54][var55][var56 - 1];
                                                } else if (var55 > 0 && var56 > 0 && class6.field73[var54][var55 - 1][var56 - 1] != 0) {
                                                    class6.field73[var54][var55][var56] = class6.field73[var54][var55 - 1][var56 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var43++;
                                }
                            }
                            method37(true);
                            method524();
                            method2411();
                            class6.method2764(Statics.field619, field310);
                            method37(true);
                            int var74 = class6.field85;
                            if (var74 > Statics.field50) {
                                var74 = Statics.field50;
                            }
                            if (var74 < Statics.field50 - 1) {
                                int var75 = Statics.field50 - 1;
                            }
                            if (field254) {
                                Statics.field619.method1589(class6.field85);
                            } else {
                                Statics.field619.method1589(0);
                            }
                            for (int var76 = 0; var76 < 104; var76++) {
                                for (int var77 = 0; var77 < 104; var77++) {
                                    method723(var76, var77);
                                }
                            }
                            method2411();
                            method867();
                            class38.field899.method3258();
                            if (Statics.field1855 != null) {
                                field397.method2386(113);
                                field397.method2115(1057001181);
                            }
                            if (!field504) {
                                int var78 = (Statics.field1123 - 6) / 8;
                                int var79 = (Statics.field1123 + 6) / 8;
                                int var80 = (Statics.field995 - 6) / 8;
                                int var81 = (Statics.field995 + 6) / 8;
                                for (int var82 = var78 - 1; var82 <= var79 + 1; var82++) {
                                    for (int var83 = var80 - 1; var83 <= var81 + 1; var83++) {
                                        if (var82 < var78 || var82 > var79 || var83 < var80 || var83 > var81) {
                                            Statics.field2966.method2838("m" + var82 + "_" + var83);
                                            Statics.field2966.method2838("l" + var82 + "_" + var83);
                                        }
                                    }
                                }
                            }
                            method565(30);
                            method2411();
                            class6.method553();
                            field397.method2386(93);
                            Statics.field1565.method2474();
                            for (int var84 = 0; var84 < 32; var84++) {
                                field2097[var84] = 0L;
                            }
                            for (int var85 = 0; var85 < 32; var85++) {
                                field2099[var85] = 0L;
                            }
                            Statics.field948 = 0;
                        } else {
                            field434 = 2;
                        }
                    } else {
                        field434 = 1;
                    }
                }
                if (field257 == 30) {
                    method2726();
                } else if (field257 == 40 || field257 == 45) {
                    Statics.method176();
                }
                return;
            }
            var2.field2587.method2906(var2.field2584, (int) var2.field3006, var2.field2588, false);
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method193() {
        boolean var1 = class174.method3235();
        if (var1 && field495 && Statics.field1966 != null) {
            Statics.field1966.method1020();
        }
        if (field257 == 10 || field257 == 20 || field257 == 30) {
            if (field467 != 0L && class107.method3468() > field467) {
                int var2 = field499 ? 2 : 1;
                field467 = 0L;
                if (var2 >= 2) {
                    field499 = true;
                } else {
                    field499 = false;
                }
                method1333();
                if (field257 >= 25) {
                    method918();
                }
                field2089 = true;
            } else if (field2105) {
                method868();
            }
        }
        Dimension var3 = this.method2631();
        if (Statics.field1545 != var3.width || Statics.field1312 != var3.height || field2104) {
            method1333();
            field467 = class107.method3468() + 500L;
            field2104 = false;
        }
        boolean var4 = false;
        if (field2089) {
            field2089 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field492[var5] = true;
            }
        }
        if (var4) {
            method34();
        }
        if (field257 == 0) {
            int var6 = class30.field674;
            String var7 = class30.field693;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field1328.getGraphics();
                if (Statics.field2107 == null) {
                    Statics.field2107 = new Font("Helvetica", 1, 13);
                    Statics.field1873 = Statics.field1328.getFontMetrics(Statics.field2107);
                }
                if (var4) {
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field56, Statics.field2528);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field560 == null) {
                        Statics.field560 = Statics.field1328.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field560.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field2107);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field1873.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field560, Statics.field56 / 2 - 152, Statics.field2528 / 2 - 18, (ImageObserver) null);
                } catch (Exception var23) {
                    int var12 = Statics.field56 / 2 - 152;
                    int var13 = Statics.field2528 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field2107);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field1873.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var24) {
                Statics.field1328.repaint();
            }
        } else if (field257 == 5) {
            class30.method840(Statics.field1322, Statics.field1156, Statics.field3008, var4);
        } else if (field257 == 10 || field257 == 11) {
            class30.method840(Statics.field1322, Statics.field1156, Statics.field3008, var4);
        } else if (field257 == 20) {
            class30.method840(Statics.field1322, Statics.field1156, Statics.field3008, var4);
        } else if (field257 == 25) {
            if (field434 == 1) {
                if (field305 > field266) {
                    field266 = field305;
                }
                int var15 = (field266 * 50 - field305 * 50) / field266;
                Statics.method869(class148.field2457 + class2.field21 + class2.field15 + var15 + "%" + class2.field19, false);
            } else if (field434 == 2) {
                if (field307 > field308) {
                    field308 = field307;
                }
                int var16 = (field308 * 50 - field307 * 50) / field308 + 50;
                Statics.method869(class148.field2457 + class2.field21 + class2.field15 + var16 + "%" + class2.field19, false);
            } else {
                Statics.method869(class148.field2457, false);
            }
        } else if (field257 == 30) {
            method143();
        } else if (field257 == 40) {
            Statics.method869(class148.field2211 + class2.field21 + class148.field2212, false);
        } else if (field257 == 45) {
            Statics.method869(class148.field2219, false);
        }
        if (field257 == 30 && field466 == 0 && !var4) {
            try {
                Graphics var17 = Statics.field1328.getGraphics();
                for (int var18 = 0; var18 < field457; var18++) {
                    if (field298[var18]) {
                        Statics.field797.method1341(var17, field462[var18], field372[var18], field464[var18], field465[var18]);
                        field298[var18] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field1328.repaint();
            }
        } else if (field257 > 0) {
            try {
                Graphics var20 = Statics.field1328.getGraphics();
                Statics.field797.method1346(var20, 0, 0);
                for (int var21 = 0; var21 < field457; var21++) {
                    field298[var21] = false;
                }
            } catch (Exception var25) {
                Statics.field1328.repaint();
            }
        }
    }

    @ObfuscatedName("client.o(B)V")
    public final void method194() {
        if (Statics.field702 != null) {
            Statics.field702.field178 = false;
        }
        Statics.field702 = null;
        if (Statics.field2037 != null) {
            Statics.field2037.method2589();
            Statics.field2037 = null;
        }
        if (class129.field2020 != null) {
            class129 var1 = class129.field2020;
            synchronized (class129.field2020) {
                class129.field2020 = null;
            }
        }
        if (class132.field2062 != null) {
            class132 var3 = class132.field2062;
            synchronized (class132.field2062) {
                class132.field2062 = null;
            }
        }
        Statics.field882 = null;
        if (Statics.field1966 != null) {
            Statics.field1966.method1009();
        }
        if (Statics.field153 != null) {
            Statics.field153.method1009();
        }
        class162.method728();
        Object var5 = class161.field2592;
        synchronized (class161.field2592) {
            if (class161.field2594 != 0) {
                class161.field2594 = 1;
                try {
                    class161.field2592.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        try {
            class141.field2137.method3667();
            for (int var8 = 0; var8 < Statics.field1019; var8++) {
                Statics.field1952[var8].method3667();
            }
            class141.field2138.method3667();
            class141.field2139.method3667();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("ai.m(IB)V")
    public static void method565(int arg0) {
        if (field257 == arg0) {
            return;
        }
        if (field257 == 0) {
            Statics.field560 = null;
            Statics.field2107 = null;
            Statics.field1873 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field283 = 0;
            field284 = 0;
            field447 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1021 != null) {
            Statics.field1021.method2589();
            Statics.field1021 = null;
        }
        if (field257 == 25) {
            field434 = 0;
            field305 = 0;
            field266 = 1;
            field307 = 0;
            field308 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method168(Statics.field1328, Statics.field3108, Statics.field238, true, 0);
        } else if (arg0 == 20) {
            class30.method168(Statics.field1328, Statics.field3108, Statics.field238, true, field257 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method168(Statics.field1328, Statics.field3108, Statics.field238, false, 4);
        } else if (Statics.field688) {
            Statics.field681 = null;
            Statics.field660 = null;
            Statics.field1381 = null;
            Statics.field657 = null;
            Statics.field661 = null;
            Statics.field1860 = null;
            Statics.field1984 = null;
            Statics.field3070 = null;
            Statics.field2542 = null;
            Statics.field120 = null;
            Statics.field1951 = null;
            Statics.field185 = null;
            Statics.field2007 = null;
            Statics.field1288 = null;
            Statics.field17 = null;
            Statics.field2961 = null;
            Statics.field1017 = null;
            Statics.field1487 = null;
            Statics.field669 = null;
            Statics.field1953 = null;
            Statics.field1929 = null;
            Statics.field3055 = null;
            class174.field2838 = 1;
            Statics.field2842 = null;
            Statics.field3059 = -1;
            Statics.field2787 = -1;
            Statics.field3136 = 0;
            Statics.field2840 = false;
            Statics.field2505 = 2;
            class162.method2595(true);
            Statics.field688 = false;
        }
        field257 = arg0;
    }

    @ObfuscatedName("client.q(B)V")
    public void method195() {
        if (field257 != 1000) {
            boolean var1 = class162.method2415();
            if (!var1) {
                this.method196();
            }
        }
    }

    @ObfuscatedName("client.v(I)V")
    public void method196() {
        if (class162.field2617 >= 4) {
            this.method2629("js5crc");
            field257 = 1000;
            return;
        }
        if (class162.field2607 >= 4) {
            if (field257 <= 5) {
                this.method2629("js5io");
                field257 = 1000;
                return;
            }
            field280 = 3000;
            class162.field2607 = 3;
        }
        if (--field280 + 1 > 0) {
            return;
        }
        try {
            if (field279 == 0) {
                Statics.field1624 = Statics.field808.method2509(Statics.field1706, Statics.field288);
                field279++;
            }
            if (field279 == 1) {
                if (Statics.field1624.field2116 == 2) {
                    this.method276(-1);
                    return;
                }
                if (Statics.field1624.field2116 == 1) {
                    field279++;
                }
            }
            if (field279 == 2) {
                Statics.field2001 = new class135((Socket) Statics.field1624.field2115, Statics.field808);
                class111 var1 = new class111(5);
                var1.method2112(15);
                var1.method2115(79);
                Statics.field2001.method2593(var1.field1897, 0, 5);
                field279++;
                Statics.field224 = class107.method3468();
            }
            if (field279 == 3) {
                if (field257 <= 5 || Statics.field2001.method2591() > 0) {
                    int var2 = Statics.field2001.method2590();
                    if (var2 != 0) {
                        this.method276(var2);
                        return;
                    }
                    field279++;
                } else if (class107.method3468() - Statics.field224 > 30000L) {
                    this.method276(-2);
                    return;
                }
            }
            if (field279 == 4) {
                class162.method2439(Statics.field2001, field257 > 20);
                Statics.field1624 = null;
                Statics.field2001 = null;
                field279 = 0;
                field293 = 0;
            }
        } catch (IOException var4) {
            this.method276(-3);
        }
    }

    @ObfuscatedName("client.n(II)V")
    public void method276(int arg0) {
        Statics.field1624 = null;
        Statics.field2001 = null;
        field279 = 0;
        if (Statics.field52 == Statics.field288) {
            Statics.field288 = Statics.field287;
        } else {
            Statics.field288 = Statics.field52;
        }
        field293++;
        if (field293 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field257 <= 5) {
                this.method2629("js5connect_full");
                field257 = 1000;
            } else {
                field280 = 3000;
            }
        } else if (field293 >= 2 && arg0 == 6) {
            this.method2629("js5connect_outofdate");
            field257 = 1000;
        } else if (field293 >= 4) {
            if (field257 <= 5) {
                this.method2629("js5connect");
                field257 = 1000;
            } else {
                field280 = 3000;
            }
        }
    }

    @ObfuscatedName("t.z(I)V")
    public static void method185() {
        if (field278 == 0) {
            Statics.field619 = new class81(4, 104, 104, class6.field73);
            for (int var0 = 0; var0 < 4; var0++) {
                field310[var0] = new class220(104, 104);
            }
            Statics.field1082 = new class74(512, 512);
            class30.field693 = class148.field2213;
            class30.field674 = 5;
            field278 = 20;
        } else if (field278 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1515[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1623(var1, 500, 800, 512, 334);
            class30.field693 = class148.field2214;
            class30.field674 = 10;
            field278 = 30;
        } else if (field278 == 30) {
            Statics.field1856 = method21(0, false, true, true);
            Statics.field1125 = method21(1, false, true, true);
            Statics.field414 = method21(2, true, false, true);
            Statics.field2008 = method21(3, false, true, true);
            Statics.field563 = method21(4, false, true, true);
            Statics.field2966 = method21(5, true, true, true);
            Statics.field2034 = method21(6, true, true, false);
            Statics.field2021 = method21(7, false, true, true);
            Statics.field238 = method21(8, false, true, true);
            Statics.field1153 = method21(9, false, true, true);
            Statics.field3108 = method21(10, false, true, true);
            Statics.field2820 = method21(11, false, true, true);
            Statics.field229 = method21(12, false, true, true);
            Statics.field2539 = method21(13, true, false, true);
            Statics.field2074 = method21(14, false, true, false);
            Statics.field281 = method21(15, false, true, true);
            class30.field693 = class148.field2215;
            class30.field674 = 20;
            field278 = 40;
        } else if (field278 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1856.method2898() * 4 / 100;
            int var8 = var7 + Statics.field1125.method2898() * 4 / 100;
            int var9 = var8 + Statics.field414.method2898() * 2 / 100;
            int var10 = var9 + Statics.field2008.method2898() * 2 / 100;
            int var11 = var10 + Statics.field563.method2898() * 6 / 100;
            int var12 = var11 + Statics.field2966.method2898() * 4 / 100;
            int var13 = var12 + Statics.field2034.method2898() * 2 / 100;
            int var14 = var13 + Statics.field2021.method2898() * 60 / 100;
            int var15 = var14 + Statics.field238.method2898() * 2 / 100;
            int var16 = var15 + Statics.field1153.method2898() * 2 / 100;
            int var17 = var16 + Statics.field3108.method2898() * 2 / 100;
            int var18 = var17 + Statics.field2820.method2898() * 2 / 100;
            int var19 = var18 + Statics.field229.method2898() * 2 / 100;
            int var20 = var19 + Statics.field2539.method2898() * 2 / 100;
            int var21 = var20 + Statics.field2074.method2898() * 2 / 100;
            int var22 = var21 + Statics.field281.method2898() * 2 / 100;
            if (var22 == 100) {
                class30.field693 = class148.field2380;
                class30.field674 = 30;
                field278 = 45;
            } else {
                if (var22 != 0) {
                    class30.field693 = class148.field2318 + var22 + "%";
                }
                class30.field674 = 30;
            }
        } else if (field278 == 45) {
            boolean var23 = !field254;
            Statics.field1124 = 22050;
            Statics.field1102 = var23;
            Statics.field1103 = 2;
            class175 var24 = new class175();
            var24.method3139(9, 128);
            Statics.field1966 = class52.method635(Statics.field808, Statics.field1328, 0, 22050);
            Statics.field1966.method1019(var24);
            class174.method2462(Statics.field281, Statics.field2074, Statics.field563, var24);
            Statics.field153 = class52.method635(Statics.field808, Statics.field1328, 1, 2048);
            Statics.field2061 = new class51();
            Statics.field153.method1019(Statics.field2061);
            Statics.field1524 = new class70(22050, Statics.field1124);
            class30.field693 = class148.field2365;
            class30.field674 = 35;
            field278 = 50;
        } else if (field278 == 50) {
            int var25 = 0;
            if (Statics.field1156 == null) {
                class159 var26 = Statics.field238;
                class159 var27 = Statics.field2539;
                int var28 = var26.method2833("p11_full");
                int var29 = var26.method2834(var28, "");
                class215 var30 = class72.method11(var26, var27, var28, var29);
                Statics.field1156 = var30;
            } else {
                var25++;
            }
            if (Statics.field3008 == null) {
                class159 var31 = Statics.field238;
                class159 var32 = Statics.field2539;
                int var33 = var31.method2833("p12_full");
                int var34 = var31.method2834(var33, "");
                class215 var35 = class72.method11(var31, var32, var33, var34);
                Statics.field3008 = var35;
            } else {
                var25++;
            }
            if (Statics.field1322 == null) {
                class159 var36 = Statics.field238;
                class159 var37 = Statics.field2539;
                int var38 = var36.method2833("b12_full");
                int var39 = var36.method2834(var38, "");
                class215 var40 = class72.method11(var36, var37, var38, var39);
                Statics.field1322 = var40;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class30.field693 = class148.field2232 + var25 * 100 / 3 + "%";
                class30.field674 = 40;
            } else {
                Statics.field1316 = new class151(true);
                class30.field693 = class148.field2233;
                class30.field674 = 40;
                field278 = 60;
            }
        } else if (field278 == 60) {
            int var41 = class30.method871(Statics.field3108, Statics.field238);
            byte var42 = 8;
            if (var41 < var42) {
                class30.field693 = class148.field2221 + var41 * 100 / var42 + "%";
                class30.field674 = 50;
            } else {
                class30.field693 = class148.field2364;
                class30.field674 = 50;
                method565(5);
                field278 = 70;
            }
        } else if (field278 == 70) {
            if (Statics.field414.method2823()) {
                class43.method634(Statics.field414);
                class159 var44 = Statics.field414;
                Statics.field910 = var44;
                class159 var45 = Statics.field414;
                class159 var46 = Statics.field2021;
                Statics.field960 = var45;
                Statics.field956 = var46;
                Statics.field958 = Statics.field960.method2828(3);
                class159 var47 = Statics.field414;
                class159 var48 = Statics.field2021;
                boolean var49 = field254;
                Statics.field863 = var47;
                Statics.field850 = var48;
                class38.field862 = var49;
                class159 var50 = Statics.field414;
                class159 var51 = Statics.field2021;
                Statics.field833 = var50;
                Statics.field813 = var51;
                class159 var52 = Statics.field414;
                class159 var53 = Statics.field2021;
                boolean var54 = field253;
                class215 var55 = Statics.field1156;
                Statics.field1071 = var52;
                Statics.field2941 = var53;
                Statics.field1032 = var54;
                Statics.field1033 = Statics.field1071.method2828(10);
                Statics.field1066 = var55;
                class159 var56 = Statics.field414;
                class159 var57 = Statics.field1856;
                class159 var58 = Statics.field1125;
                Statics.field927 = var56;
                Statics.field914 = var57;
                Statics.field915 = var58;
                class41.method1774(Statics.field414, Statics.field2021);
                class44.method167(Statics.field414);
                class159 var59 = Statics.field414;
                Statics.field1092 = var59;
                Statics.field1088 = Statics.field1092.method2828(16);
                class164.method2728(Statics.field2008, Statics.field2021, Statics.field238, Statics.field2539);
                class159 var60 = Statics.field414;
                Statics.field1020 = var60;
                class45.method526(Statics.field414);
                class30.field693 = class148.field2206;
                class30.field674 = 60;
                field278 = 80;
            } else {
                class30.field693 = class148.field2223 + Statics.field414.method2903() + "%";
                class30.field674 = 60;
            }
        } else if (field278 == 80) {
            int var61 = 0;
            if (Statics.field1595 == null) {
                class159 var62 = Statics.field238;
                int var63 = var62.method2833("compass");
                int var64 = var62.method2834(var63, "");
                class74 var65 = class72.method627(var62, var63, var64);
                Statics.field1595 = var65;
            } else {
                var61++;
            }
            if (Statics.field2534 == null) {
                class159 var66 = Statics.field238;
                int var67 = var66.method2833("mapedge");
                int var68 = var66.method2834(var67, "");
                class74 var69 = class72.method627(var66, var67, var68);
                Statics.field2534 = var69;
            } else {
                var61++;
            }
            if (Statics.field1956 == null) {
                Statics.field1956 = class72.method614(Statics.field238, "mapscene", "");
            } else {
                var61++;
            }
            if (Statics.field155 == null) {
                Statics.field155 = class72.method528(Statics.field238, "mapfunction", "");
            } else {
                var61++;
            }
            if (Statics.field2891 == null) {
                Statics.field2891 = class72.method528(Statics.field238, "hitmarks", "");
            } else {
                var61++;
            }
            if (Statics.field1697 == null) {
                Statics.field1697 = class72.method528(Statics.field238, "headicons_pk", "");
            } else {
                var61++;
            }
            if (Statics.field193 == null) {
                Statics.field193 = class72.method528(Statics.field238, "headicons_prayer", "");
            } else {
                var61++;
            }
            if (Statics.field900 == null) {
                Statics.field900 = class72.method528(Statics.field238, "headicons_hint", "");
            } else {
                var61++;
            }
            if (Statics.field2554 == null) {
                Statics.field2554 = class72.method528(Statics.field238, "mapmarker", "");
            } else {
                var61++;
            }
            if (Statics.field25 == null) {
                Statics.field25 = class72.method528(Statics.field238, "cross", "");
            } else {
                var61++;
            }
            if (Statics.field1902 == null) {
                Statics.field1902 = class72.method528(Statics.field238, "mapdots", "");
            } else {
                var61++;
            }
            if (Statics.field846 == null) {
                Statics.field846 = class72.method614(Statics.field238, "scrollbar", "");
            } else {
                var61++;
            }
            if (Statics.field1617 == null) {
                Statics.field1617 = class72.method614(Statics.field238, "mod_icons", "");
            } else {
                var61++;
            }
            if (var61 < 13) {
                class30.field693 = class148.field2225 + var61 * 100 / 13 + "%";
                class30.field674 = 70;
            } else {
                Statics.field3098 = Statics.field1617;
                Statics.field2534.method1407();
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 41.0D) - 20;
                for (int var74 = 0; var74 < Statics.field155.length; var74++) {
                    Statics.field155[var74].method1406(var70 + var73, var71 + var73, var72 + var73);
                }
                Statics.field1956[0].method1560(var70 + var73, var71 + var73, var72 + var73);
                class30.field693 = class148.field2226;
                class30.field674 = 70;
                field278 = 90;
            }
        } else if (field278 == 90) {
            if (Statics.field1153.method2823()) {
                class90 var75 = new class90(Statics.field1153, Statics.field238, 20, 0.8D, field254 ? 64 : 128);
                class86.method1781(var75);
                class86.method1782(0.8D);
                class30.field693 = class148.field2248;
                class30.field674 = 90;
                field278 = 110;
            } else {
                class30.field693 = class148.field2227 + Statics.field1153.method2903() + "%";
                class30.field674 = 90;
            }
        } else if (field278 == 110) {
            Statics.field702 = new class13();
            Statics.field808.method2507(Statics.field702, 10);
            class30.field693 = class148.field2229;
            class30.field674 = 94;
            field278 = 120;
        } else if (field278 == 120) {
            if (Statics.field3108.method2840("huffman", "")) {
                class105 var76 = new class105(Statics.field3108.method2856("huffman", ""));
                Statics.field3078 = var76;
                class30.field693 = class148.field2200;
                class30.field674 = 96;
                field278 = 130;
            } else {
                class30.field693 = class148.field2230 + "%";
                class30.field674 = 96;
            }
        } else if (field278 == 130) {
            if (!Statics.field2008.method2823()) {
                class30.field693 = class148.field2438 + Statics.field2008.method2903() * 4 / 5 + "%";
                class30.field674 = 100;
            } else if (!Statics.field229.method2823()) {
                class30.field693 = class148.field2438 + (80 + Statics.field229.method2903() / 6) + "%";
                class30.field674 = 100;
            } else if (Statics.field2539.method2823()) {
                class30.field693 = class148.field2420;
                class30.field674 = 100;
                field278 = 140;
            } else {
                class30.field693 = class148.field2438 + (96 + Statics.field2539.method2903() / 20) + "%";
                class30.field674 = 100;
            }
        } else if (field278 == 140) {
            method565(10);
        }
    }

    @ObfuscatedName("a.r(IZZZI)Lfn;")
    public static class159 method21(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2137 != null) {
            var4 = new class126(arg0, class141.field2137, Statics.field1952[arg0], 1000000);
        }
        return new class159(var4, Statics.field158, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("v.s(II)V")
    public static void method135(int arg0) {
        if (arg0 == -3) {
            class30.method529(class148.field2281, class148.field2241, class148.field2242);
        } else if (arg0 == -2) {
            class30.method529(class148.field2243, class148.field2301, class148.field2245);
        } else if (arg0 == -1) {
            class30.method529(class148.field2443, class148.field2247, class148.field2448);
        } else if (arg0 == 3) {
            class30.method529(class148.field2249, class148.field2299, class148.field2369);
        } else if (arg0 == 4) {
            class30.method529(class148.field2252, class148.field2421, class148.field2254);
        } else if (arg0 == 5) {
            class30.method529(class148.field2255, class148.field2303, class148.field2257);
        } else if (arg0 == 6) {
            class30.method529(class148.field2258, class148.field2259, class148.field2354);
        } else if (arg0 == 7) {
            class30.method529(class148.field2390, class148.field2262, class148.field2340);
        } else if (arg0 == 8) {
            class30.method529(class148.field2264, class148.field2265, class148.field2320);
        } else if (arg0 == 9) {
            class30.method529(class148.field2327, class148.field2268, class148.field2218);
        } else if (arg0 == 10) {
            class30.method529(class148.field2201, class148.field2271, class148.field2224);
        } else if (arg0 == 11) {
            class30.method529(class148.field2273, class148.field2274, class148.field2275);
        } else if (arg0 == 12) {
            class30.method529(class148.field2276, class148.field2277, class148.field2278);
        } else if (arg0 == 13) {
            class30.method529(class148.field2279, class148.field2280, class148.field2286);
        } else if (arg0 == 14) {
            class30.method529(class148.field2282, class148.field2283, class148.field2284);
        } else if (arg0 == 16) {
            class30.method529(class148.field2285, class148.field2367, class148.field2287);
        } else if (arg0 == 17) {
            class30.method529(class148.field2288, class148.field2289, class148.field2384);
        } else if (arg0 == 18) {
            class30.method529(class148.field2394, class148.field2292, class148.field2359);
        } else if (arg0 == 19) {
            class30.method529(class148.field2294, class148.field2295, class148.field2290);
        } else if (arg0 == 20) {
            class30.method529(class148.field2439, class148.field2298, class148.field2324);
        } else if (arg0 == 22) {
            class30.method529(class148.field2461, class148.field2260, class148.field2302);
        } else if (arg0 == 23) {
            class30.method529(class148.field2465, class148.field2304, class148.field2305);
        } else if (arg0 == 24) {
            class30.method529(class148.field2306, class148.field2307, class148.field2308);
        } else if (arg0 == 25) {
            class30.method529(class148.field2309, class148.field2310, class148.field2311);
        } else if (arg0 == 26) {
            class30.method529(class148.field2312, class148.field2313, class148.field2314);
        } else if (arg0 == 27) {
            class30.method529(class148.field2315, class148.field2316, class148.field2317);
        } else if (arg0 == 31) {
            class30.method529(class148.field2349, class148.field2411, class148.field2352);
        } else if (arg0 == 32) {
            class30.method529(class148.field2222, class148.field2470, class148.field2329);
        } else if (arg0 == 37) {
            class30.method529(class148.field2330, class148.field2331, class148.field2332);
        } else if (arg0 == 38) {
            class30.method529(class148.field2333, class148.field2334, class148.field2335);
        } else if (arg0 == 55) {
            class30.method529(class148.field2437, class148.field2337, class148.field2338);
        } else if (arg0 == 56) {
            class30.method529(class148.field2398, class148.field2468, class148.field2240);
            method565(11);
            return;
        } else if (arg0 == 57) {
            class30.method529(class148.field2342, class148.field2343, class148.field2344);
            method565(11);
            return;
        } else {
            class30.method529(class148.field2345, class148.field2346, class148.field2347);
        }
        method565(10);
    }

    @ObfuscatedName("fb.c(I)V")
    public static final void method3243() {
        if (Statics.field2037 != null) {
            Statics.field2037.method2589();
            Statics.field2037 = null;
        }
        method524();
        Statics.field619.method1588();
        for (int var0 = 0; var0 < 4; var0++) {
            field310[var0].method3673();
        }
        System.gc();
        class174.field2838 = 1;
        Statics.field2842 = null;
        Statics.field3059 = -1;
        Statics.field2787 = -1;
        Statics.field3136 = 0;
        Statics.field2840 = false;
        Statics.field2505 = 2;
        field469 = -1;
        field495 = false;
        for (class22 var1 = (class22) class22.field576.method3324(); var1 != null; var1 = (class22) class22.field576.method3326()) {
            if (var1.field569 != null) {
                Statics.field2061.method972(var1.field569);
                var1.field569 = null;
            }
            if (var1.field574 != null) {
                Statics.field2061.method972(var1.field574);
                var1.field574 = null;
            }
        }
        class22.field576.method3318();
        method565(10);
    }

    @ObfuscatedName("y.t(I)V")
    public static final void method524() {
        class43.field972.method3258();
        class39.field905.method3258();
        class42.field955.method3258();
        class38.field851.method3258();
        class38.field899.method3258();
        class38.field853.method3258();
        class38.field854.method3258();
        class37.field823.method3258();
        class37.field832.method3258();
        class47.field1034.method3258();
        class47.field1086.method3258();
        class47.field1036.method3258();
        class40.field916.method3258();
        class40.field917.method3258();
        class41.field950.method3258();
        class41.field936.method3258();
        class44.method2996();
        class48.field1089.method3258();
        class170.field2803.method3258();
        class164.field2632.method3258();
        class164.field2633.method3258();
        class164.field2634.method3258();
        class164.field2635.method3258();
        ((class90) Statics.field1500).method1864();
        class20.field545.method3258();
        Statics.field1856.method2831();
        Statics.field1125.method2831();
        Statics.field2008.method2831();
        Statics.field563.method2831();
        Statics.field2966.method2831();
        Statics.field2034.method2831();
        Statics.field2021.method2831();
        Statics.field238.method2831();
        Statics.field1153.method2831();
        Statics.field3108.method2831();
        Statics.field2820.method2831();
        Statics.field229.method2831();
    }

    @ObfuscatedName("dn.h(I)V")
    public static final void method2414() {
        if (field299 > 0) {
            method3243();
        } else {
            method565(40);
            Statics.field1021 = Statics.field2037;
            Statics.field2037 = null;
        }
    }

    @ObfuscatedName("ec.w(I)V")
    public static final void method2726() {
        if (field523 > 1) {
            field523--;
        }
        if (field299 > 0) {
            field299--;
        }
        if (field303) {
            field303 = false;
            method2414();
            return;
        }
        if (!field418) {
            field399[0] = class148.field2358;
            field400[0] = "";
            field479[0] = 1006;
            field377 = 1;
        }
        for (int var0 = 0; var0 < 100 && method666(); var0++) {
        }
        if (field257 != 30) {
            return;
        }
        while (class202.method3244()) {
            field397.method2386(138);
            field397.method2112(0);
            int var1 = field397.field1894;
            class202.method760(field397);
            field397.method2137(field397.field1894 - var1);
        }
        Object var2 = Statics.field702.field175;
        synchronized (Statics.field702.field175) {
            if (!field246) {
                Statics.field702.field174 = 0;
            } else if (class132.field2059 != 0 || Statics.field702.field174 >= 40) {
                field397.method2386(233);
                field397.method2112(0);
                int var3 = field397.field1894;
                int var4 = 0;
                for (int var5 = 0; var5 < Statics.field702.field174 && field397.field1894 - var3 < 240; var5++) {
                    var4++;
                    int var6 = Statics.field702.field179[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = Statics.field702.field176[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (Statics.field702.field179[var5] == -1 && Statics.field702.field176[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (field261 != var7 || field262 != var6) {
                        int var9 = var7 - field261;
                        field261 = var7;
                        int var10 = var6 - field262;
                        field262 = var6;
                        if (field263 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            field397.method2201((field263 << 12) + (var9 << 6) + var10);
                            field263 = 0;
                        } else if (field263 < 8) {
                            field397.method2114((field263 << 19) + 8388608 + var8);
                            field263 = 0;
                        } else {
                            field397.method2115((field263 << 19) + -1073741824 + var8);
                            field263 = 0;
                        }
                    } else if (field263 < 2047) {
                        field263++;
                    }
                }
                field397.method2137(field397.field1894 - var3);
                if (var4 >= Statics.field702.field174) {
                    Statics.field702.field174 = 0;
                } else {
                    Statics.field702.field174 -= var4;
                    for (int var11 = 0; var11 < Statics.field702.field174; var11++) {
                        Statics.field702.field176[var11] = Statics.field702.field176[var4 + var11];
                        Statics.field702.field179[var11] = Statics.field702.field179[var4 + var11];
                    }
                }
            }
        }
        if (class132.field2059 == 1 || !Statics.field134 && class132.field2059 == 4 || class132.field2059 == 2) {
            long var13 = (class132.field2052 - field260 * -1L) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            field260 = class132.field2052 * -1L;
            int var15 = class132.field2048;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > Statics.field2528) {
                var15 = Statics.field2528;
            }
            int var16 = class132.field2060;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field56) {
                var16 = Statics.field56;
            }
            int var17 = (int) var13;
            field397.method2386(96);
            field397.method2201((var17 << 1) + (class132.field2059 == 2 ? 1 : 0));
            field397.method2201(var16);
            field397.method2201(var15);
        }
        if (class129.field2024 > 0) {
            field397.method2386(51);
            field397.method2201(0);
            int var18 = field397.field1894;
            long var19 = class107.method3468();
            for (int var21 = 0; var21 < class129.field2024; var21++) {
                long var22 = var19 - field481;
                if (var22 > 16777215L) {
                    var22 = 16777215L;
                }
                field481 = var19;
                field397.method2319(class129.field2023[var21]);
                field397.method2114((int) var22);
            }
            field397.method2123(field397.field1894 - var18);
        }
        if (field340 > 0) {
            field340--;
        }
        if (class129.field2017[96] || class129.field2017[97] || class129.field2017[98] || class129.field2017[99]) {
            field532 = true;
        }
        if (field532 && field340 <= 0) {
            field340 = 20;
            field532 = false;
            field397.method2386(58);
            field397.method2289(field330);
            field397.method2159(field334);
        }
        if (Statics.field1003 && !field463) {
            field463 = true;
            field397.method2386(0);
            field397.method2112(1);
        }
        if (!Statics.field1003 && field463) {
            field463 = false;
            field397.method2386(0);
            field397.method2112(0);
        }
        method2703();
        if (field257 != 30) {
            return;
        }
        method1875();
        method154();
        field297++;
        if (field297 > 750) {
            method2414();
            return;
        }
        for (int var24 = -1; var24 < field371; var24++) {
            int var25;
            if (var24 == -1) {
                var25 = 2047;
            } else {
                var25 = field391[var24];
            }
            class3 var26 = field370[var25];
            if (var26 != null) {
                method2053(var26, 1);
            }
        }
        for (int var27 = 0; var27 < field290; var27++) {
            int var28 = field291[var27];
            class32 var29 = field289[var28];
            if (var29 != null) {
                method2053(var29, var29.field705.field819);
            }
        }
        for (int var30 = -1; var30 < field371; var30++) {
            int var31;
            if (var30 == -1) {
                var31 = 2047;
            } else {
                var31 = field391[var30];
            }
            class3 var32 = field370[var31];
            if (var32 != null && var32.field751 > 0) {
                var32.field751--;
                if (var32.field751 == 0) {
                    var32.field764 = null;
                }
            }
        }
        for (int var33 = 0; var33 < field290; var33++) {
            int var34 = field291[var33];
            class32 var35 = field289[var34];
            if (var35 != null && var35.field751 > 0) {
                var35.field751--;
                if (var35.field751 == 0) {
                    var35.field764 = null;
                }
            }
        }
        field326++;
        if (field433 != 0) {
            field359 += 20;
            if (field359 >= 400) {
                field433 = 0;
            }
        }
        if (Statics.field981 != null) {
            field361++;
            if (field361 >= 15) {
                method3247(Statics.field981);
                Statics.field981 = null;
            }
        }
        class164 var36 = Statics.field584;
        class164 var37 = Statics.field66;
        Statics.field584 = null;
        Statics.field66 = null;
        field429 = null;
        field312 = false;
        field430 = false;
        field525 = 0;
        while (class129.method149() && field525 < 128) {
            if (field311 >= 2 && class129.field2017[82] && Statics.field1932 == 66) {
                String var38 = "";
                Iterator var39 = class11.field150.iterator();
                while (var39.hasNext()) {
                    class33 var40 = (class33) var39.next();
                    var38 = var38 + var40.field708 + ':' + var40.field713 + '\n';
                }
                Statics.field1698.setContents(new StringSelection(var38), (ClipboardOwner) null);
            } else {
                field480[field525] = Statics.field1932;
                field531[field525] = Statics.field198;
                field525++;
            }
        }
        Statics.method150(field306, 0, 0, Statics.field56, Statics.field2528, 0, 0);
        field437++;
        while (true) {
            class1 var43;
            class164 var44;
            class164 var45;
            do {
                var43 = (class1) field454.method3340();
                if (var43 == null) {
                    while (true) {
                        class1 var46;
                        class164 var47;
                        class164 var48;
                        do {
                            var46 = (class1) field455.method3340();
                            if (var46 == null) {
                                while (true) {
                                    class1 var49;
                                    class164 var50;
                                    class164 var51;
                                    do {
                                        var49 = (class1) field244.method3340();
                                        if (var49 == null) {
                                            method2581();
                                            if (Statics.field1950 == null && field425 == null) {
                                                int var52 = class132.field2059;
                                                if (field418) {
                                                    if (var52 != 1 && (Statics.field134 || var52 != 4)) {
                                                        int var53 = class132.field2053;
                                                        int var54 = class132.field2054;
                                                        if (var53 < Statics.field932 - 10 || var53 > Statics.field932 + Statics.field1022 + 10 || var54 < Statics.field2163 - 10 || var54 > Statics.field2163 + Statics.field1990 + 10) {
                                                            field418 = false;
                                                            method89(Statics.field932, Statics.field2163, Statics.field1022, Statics.field1990);
                                                        }
                                                    }
                                                    if (var52 == 1 || !Statics.field134 && var52 == 4) {
                                                        int var55 = Statics.field932;
                                                        int var56 = Statics.field2163;
                                                        int var57 = Statics.field1022;
                                                        int var58 = class132.field2060;
                                                        int var59 = class132.field2048;
                                                        int var60 = -1;
                                                        for (int var61 = 0; var61 < field377; var61++) {
                                                            int var62 = (field377 - 1 - var61) * 15 + var56 + 31;
                                                            if (var58 > var55 && var58 < var55 + var57 && var59 > var62 - 13 && var59 < var62 + 3) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                        if (var60 != -1 && var60 >= 0) {
                                                            int var63 = field395[var60];
                                                            int var64 = field408[var60];
                                                            int var65 = field479[var60];
                                                            int var66 = field398[var60];
                                                            String var67 = field399[var60];
                                                            String var68 = field400[var60];
                                                            method527(var63, var64, var65, var66, var67, var68, class132.field2060, class132.field2048);
                                                        }
                                                        field418 = false;
                                                        method89(Statics.field932, Statics.field2163, Statics.field1022, Statics.field1990);
                                                    }
                                                } else {
                                                    label1153: {
                                                        if ((var52 == 1 || !Statics.field134 && var52 == 4) && field377 > 0) {
                                                            int var69 = field479[field377 - 1];
                                                            if (var69 == 39 || var69 == 40 || var69 == 41 || var69 == 42 || var69 == 43 || var69 == 33 || var69 == 34 || var69 == 35 || var69 == 36 || var69 == 37 || var69 == 38 || var69 == 1005) {
                                                                label1133: {
                                                                    int var70 = field395[field377 - 1];
                                                                    int var71 = field408[field377 - 1];
                                                                    class164 var72 = class164.method145(var71);
                                                                    if (!class169.method417(method1969(var72))) {
                                                                        int var73 = method1969(var72);
                                                                        boolean var74 = (var73 >> 29 & 0x1) != 0;
                                                                        if (!var74) {
                                                                            break label1133;
                                                                        }
                                                                    }
                                                                    if (Statics.field1950 != null && !field367 && field292 != 1 && !method2409(field377 - 1) && field377 > 0) {
                                                                        int var75 = field364;
                                                                        int var76 = field365;
                                                                        method2940(Statics.field1719, var75, var76);
                                                                        Statics.field1719 = null;
                                                                    }
                                                                    field367 = false;
                                                                    field401 = 0;
                                                                    if (Statics.field1950 != null) {
                                                                        method3247(Statics.field1950);
                                                                    }
                                                                    Statics.field1950 = class164.method145(var71);
                                                                    field285 = var70;
                                                                    field364 = class132.field2060;
                                                                    field365 = class132.field2048;
                                                                    if (field377 > 0) {
                                                                        int var77 = field377 - 1;
                                                                        Statics.field1719 = new class29();
                                                                        Statics.field1719.field653 = field395[var77];
                                                                        Statics.field1719.field645 = field408[var77];
                                                                        Statics.field1719.field644 = field479[var77];
                                                                        Statics.field1719.field647 = field398[var77];
                                                                        Statics.field1719.field648 = field399[var77];
                                                                    }
                                                                    method3247(Statics.field1950);
                                                                    break label1153;
                                                                }
                                                            }
                                                        }
                                                        if ((var52 == 1 || !Statics.field134 && var52 == 4) && (field292 == 1 && field377 > 2 || method2409(field377 - 1))) {
                                                            var52 = 2;
                                                        }
                                                        if ((var52 == 1 || !Statics.field134 && var52 == 4) && field377 > 0) {
                                                            int var78 = field377 - 1;
                                                            if (var78 >= 0) {
                                                                int var79 = field395[var78];
                                                                int var80 = field408[var78];
                                                                int var81 = field479[var78];
                                                                int var82 = field398[var78];
                                                                String var83 = field399[var78];
                                                                String var84 = field400[var78];
                                                                method527(var79, var80, var81, var82, var83, var84, class132.field2060, class132.field2048);
                                                            }
                                                        }
                                                        if (var52 == 2 && field377 > 0) {
                                                            method101(class132.field2060, class132.field2048);
                                                        }
                                                    }
                                                }
                                            }
                                            if (field425 != null) {
                                                method3247(field425);
                                                Statics.field1696++;
                                                if (field312 && field430) {
                                                    int var85 = class132.field2053;
                                                    int var86 = class132.field2054;
                                                    int var87 = var85 - field427;
                                                    int var88 = var86 - field428;
                                                    if (var87 < field431) {
                                                        var87 = field431;
                                                    }
                                                    if (field425.field2653 + var87 > field431 + field426.field2653) {
                                                        var87 = field431 + field426.field2653 - field425.field2653;
                                                    }
                                                    if (var88 < field432) {
                                                        var88 = field432;
                                                    }
                                                    if (field425.field2654 + var88 > field432 + field426.field2654) {
                                                        var88 = field432 + field426.field2654 - field425.field2654;
                                                    }
                                                    int var89 = var87 - field335;
                                                    int var90 = var88 - field435;
                                                    int var91 = field425.field2757;
                                                    if (Statics.field1696 > field425.field2743 && (var89 > var91 || var89 < -var91 || var90 > var91 || var90 < -var91)) {
                                                        field264 = true;
                                                    }
                                                    int var92 = field426.field2627 + (var87 - field431);
                                                    int var93 = field426.field2630 + (var88 - field432);
                                                    if (field425.field2725 != null && field264) {
                                                        class1 var94 = new class1();
                                                        var94.field3 = field425;
                                                        var94.field4 = var92;
                                                        var94.field13 = var93;
                                                        var94.field5 = field425.field2725;
                                                        class34.method152(var94, 200000);
                                                    }
                                                    if (class132.field2065 == 0) {
                                                        if (field264) {
                                                            if (field425.field2706 != null) {
                                                                class1 var95 = new class1();
                                                                var95.field3 = field425;
                                                                var95.field4 = var92;
                                                                var95.field13 = var93;
                                                                var95.field7 = field429;
                                                                var95.field5 = field425.field2706;
                                                                class34.method152(var95, 200000);
                                                            }
                                                            if (field429 != null) {
                                                                class164 var96 = field425;
                                                                int var97 = method1969(var96);
                                                                int var98 = var97 >> 17 & 0x7;
                                                                int var99 = var98;
                                                                class164 var100;
                                                                if (var98 == 0) {
                                                                    var100 = null;
                                                                } else {
                                                                    int var101 = 0;
                                                                    while (true) {
                                                                        if (var101 >= var99) {
                                                                            var100 = var96;
                                                                            break;
                                                                        }
                                                                        var96 = class164.method145(var96.field2657);
                                                                        if (var96 == null) {
                                                                            var100 = null;
                                                                            break;
                                                                        }
                                                                        var101++;
                                                                    }
                                                                }
                                                                if (var100 != null) {
                                                                    field397.method2386(182);
                                                                    field397.method2115(field425.field2684);
                                                                    field397.method2289(field425.field2640);
                                                                    field397.method2159(field429.field2640);
                                                                    field397.method2168(field429.field2684);
                                                                    field397.method2159(field429.field2639);
                                                                    field397.method2289(field425.field2639);
                                                                }
                                                            }
                                                        } else if ((field292 == 1 || method2409(field377 - 1)) && field377 > 2) {
                                                            method101(field427 + field335, field435 + field428);
                                                        } else if (field377 > 0) {
                                                            int var102 = field427 + field335;
                                                            int var103 = field435 + field428;
                                                            method2940(Statics.field1719, var102, var103);
                                                            Statics.field1719 = null;
                                                        }
                                                        field425 = null;
                                                    }
                                                } else if (Statics.field1696 > 1) {
                                                    field425 = null;
                                                }
                                            }
                                            if (Statics.field1950 != null) {
                                                method3247(Statics.field1950);
                                                field401++;
                                                if (class132.field2065 == 0) {
                                                    if (field367) {
                                                        if (Statics.field1950 == Statics.field1710 && field366 != field285) {
                                                            class164 var104 = Statics.field1950;
                                                            byte var105 = 0;
                                                            if (field415 == 1 && var104.field2642 == 206) {
                                                                var105 = 1;
                                                            }
                                                            if (var104.field2681[field366] <= 0) {
                                                                var105 = 0;
                                                            }
                                                            int var106 = method1969(var104);
                                                            boolean var107 = (var106 >> 29 & 0x1) != 0;
                                                            if (var107) {
                                                                int var108 = field285;
                                                                int var109 = field366;
                                                                var104.field2681[var109] = var104.field2681[var108];
                                                                var104.field2755[var109] = var104.field2755[var108];
                                                                var104.field2681[var108] = -1;
                                                                var104.field2755[var108] = 0;
                                                            } else if (var105 == 1) {
                                                                int var110 = field285;
                                                                int var111 = field366;
                                                                while (var110 != var111) {
                                                                    if (var110 > var111) {
                                                                        var104.method2946(var110 - 1, var110);
                                                                        var110--;
                                                                    } else if (var110 < var111) {
                                                                        var104.method2946(var110 + 1, var110);
                                                                        var110++;
                                                                    }
                                                                }
                                                            } else {
                                                                var104.method2946(field366, field285);
                                                            }
                                                            field397.method2386(99);
                                                            field397.method2201(field285);
                                                            field397.method2160(field366);
                                                            field397.method2115(Statics.field1950.field2684);
                                                            field397.method2319(var105);
                                                        }
                                                    } else if ((field292 == 1 || method2409(field377 - 1)) && field377 > 2) {
                                                        method101(field364, field365);
                                                    } else if (field377 > 0) {
                                                        int var112 = field364;
                                                        int var113 = field365;
                                                        method2940(Statics.field1719, var112, var113);
                                                        Statics.field1719 = null;
                                                    }
                                                    field361 = 10;
                                                    class132.field2059 = 0;
                                                    Statics.field1950 = null;
                                                } else if (field401 >= 5 && (class132.field2053 > field364 + 5 || class132.field2053 < field364 - 5 || class132.field2054 > field365 + 5 || class132.field2054 < field365 - 5)) {
                                                    field367 = true;
                                                }
                                            }
                                            if (class81.field1421 != -1) {
                                                int var114 = class81.field1421;
                                                int var115 = class81.field1422;
                                                field397.method2386(123);
                                                field397.method2112(5);
                                                field397.method2159(Statics.field1084 + var115);
                                                field397.method2160(Statics.field1912 + var114);
                                                field397.method2150(class129.field2017[82] ? (class129.field2017[81] ? 2 : 1) : 0);
                                                class81.field1421 = -1;
                                                field357 = class132.field2060;
                                                field358 = class132.field2048;
                                                field433 = 1;
                                                field359 = 0;
                                                field393 = var114;
                                                field446 = var115;
                                            }
                                            if (Statics.field584 != var36) {
                                                if (var36 != null) {
                                                    method3247(var36);
                                                }
                                                if (Statics.field584 != null) {
                                                    method3247(Statics.field584);
                                                }
                                            }
                                            if (Statics.field66 != var37 && field404 == field403) {
                                                if (var37 != null) {
                                                    method3247(var37);
                                                }
                                                if (Statics.field66 != null) {
                                                    method3247(Statics.field66);
                                                }
                                            }
                                            if (Statics.field66 == null) {
                                                if (field403 > 0) {
                                                    field403--;
                                                }
                                            } else if (field403 < field404) {
                                                field403++;
                                                if (field404 == field403) {
                                                    method3247(Statics.field66);
                                                }
                                            }
                                            int var116 = field247 + Statics.field579.field749;
                                            int var117 = field316 + Statics.field579.field752;
                                            if (Statics.field993 - var116 < -500 || Statics.field993 - var116 > 500 || Statics.field1318 - var117 < -500 || Statics.field1318 - var117 > 500) {
                                                Statics.field993 = var116;
                                                Statics.field1318 = var117;
                                            }
                                            if (Statics.field993 != var116) {
                                                Statics.field993 += (var116 - Statics.field993) / 16;
                                            }
                                            if (Statics.field1318 != var117) {
                                                Statics.field1318 += (var117 - Statics.field1318) / 16;
                                            }
                                            if (class132.field2065 == 4 && Statics.field134) {
                                                int var118 = class132.field2054 - field520;
                                                field497 = var118 * 2;
                                                field520 = var118 == -1 || var118 == 1 ? class132.field2054 : (field520 + class132.field2054) / 2;
                                                int var119 = field338 - class132.field2053;
                                                field444 = var119 * 2;
                                                field338 = var119 == -1 || var119 == 1 ? class132.field2053 : (field338 + class132.field2053) / 2;
                                            } else {
                                                if (class129.field2017[96]) {
                                                    field444 += (-24 - field444) / 2;
                                                } else if (class129.field2017[97]) {
                                                    field444 += (24 - field444) / 2;
                                                } else {
                                                    field444 /= 2;
                                                }
                                                if (class129.field2017[98]) {
                                                    field497 += (12 - field497) / 2;
                                                } else if (class129.field2017[99]) {
                                                    field497 += (-12 - field497) / 2;
                                                } else {
                                                    field497 /= 2;
                                                }
                                                field520 = class132.field2054;
                                                field338 = class132.field2053;
                                            }
                                            field330 = field444 / 2 + field330 & 0x7FF;
                                            field334 += field497 / 2;
                                            if (field334 < 128) {
                                                field334 = 128;
                                            }
                                            if (field334 > 383) {
                                                field334 = 383;
                                            }
                                            int var120 = Statics.field993 >> 7;
                                            int var121 = Statics.field1318 >> 7;
                                            int var122 = method655(Statics.field993, Statics.field1318, Statics.field50);
                                            int var123 = 0;
                                            if (var120 > 3 && var121 > 3 && var120 < 100 && var121 < 100) {
                                                for (int var124 = var120 - 4; var124 <= var120 + 4; var124++) {
                                                    for (int var125 = var121 - 4; var125 <= var121 + 4; var125++) {
                                                        int var126 = Statics.field50;
                                                        if (var126 < 3 && (class6.field81[1][var124][var125] & 0x2) == 2) {
                                                            var126++;
                                                        }
                                                        int var127 = var122 - class6.field73[var126][var124][var125];
                                                        if (var127 > var123) {
                                                            var123 = var127;
                                                        }
                                                    }
                                                }
                                            }
                                            int var128 = var123 * 192;
                                            if (var128 > 98048) {
                                                var128 = 98048;
                                            }
                                            if (var128 < 32768) {
                                                var128 = 32768;
                                            }
                                            if (var128 > field342) {
                                                field342 += (var128 - field342) / 24;
                                            } else if (var128 < field342) {
                                                field342 += (var128 - field342) / 80;
                                            }
                                            if (field526) {
                                                method1771();
                                            }
                                            for (int var129 = 0; var129 < 5; var129++) {
                                                int var10002 = field509[var129]++;
                                            }
                                            int var130 = ++class132.field2047 - 1;
                                            int var132 = class129.field2028;
                                            if (var130 > 15000 && var132 > 15000) {
                                                field299 = 250;
                                                class132.field2047 = 14500;
                                                field397.method2386(209);
                                            }
                                            field461++;
                                            if (field461 > 500) {
                                                field461 = 0;
                                                int var134 = (int) (Math.random() * 8.0D);
                                                if ((var134 & 0x1) == 1) {
                                                    field247 += field315;
                                                }
                                                if ((var134 & 0x2) == 2) {
                                                    field316 += field317;
                                                }
                                                if ((var134 & 0x4) == 4) {
                                                    field412 += field319;
                                                }
                                            }
                                            if (field247 < -50) {
                                                field315 = 2;
                                            }
                                            if (field247 > 50) {
                                                field315 = -2;
                                            }
                                            if (field316 < -55) {
                                                field317 = 2;
                                            }
                                            if (field316 > 55) {
                                                field317 = -2;
                                            }
                                            if (field412 < -40) {
                                                field319 = 1;
                                            }
                                            if (field412 > 40) {
                                                field319 = -1;
                                            }
                                            field325++;
                                            if (field325 > 500) {
                                                field325 = 0;
                                                int var135 = (int) (Math.random() * 8.0D);
                                                if ((var135 & 0x1) == 1) {
                                                    field321 += field436;
                                                }
                                                if ((var135 & 0x2) == 2) {
                                                    field268 += field314;
                                                }
                                            }
                                            if (field321 < -60) {
                                                field436 = 2;
                                            }
                                            if (field321 > 60) {
                                                field436 = -2;
                                            }
                                            if (field268 < -20) {
                                                field314 = 1;
                                            }
                                            if (field268 > 10) {
                                                field314 = -1;
                                            }
                                            for (class36 var136 = (class36) field533.method3278(); var136 != null; var136 = (class36) field533.method3279()) {
                                                if ((long) var136.field801 < class107.method3468() / 1000L - 5L) {
                                                    if (var136.field806 > 0) {
                                                        class11.method2070(5, "", var136.field799 + class148.field2425);
                                                    }
                                                    if (var136.field806 == 0) {
                                                        class11.method2070(5, "", var136.field799 + class148.field2328);
                                                    }
                                                    var136.method3408();
                                                }
                                            }
                                            field271++;
                                            if (field271 > 50) {
                                                field397.method2386(83);
                                            }
                                            try {
                                                if (Statics.field2037 != null && field397.field1894 > 0) {
                                                    Statics.field2037.method2593(field397.field1897, 0, field397.field1894);
                                                    field397.field1894 = 0;
                                                    field271 = 0;
                                                }
                                            } catch (IOException var138) {
                                                method2414();
                                            }
                                            return;
                                        }
                                        var50 = var49.field3;
                                        if (var50.field2640 < 0) {
                                            break;
                                        }
                                        var51 = class164.method145(var50.field2657);
                                    } while (var51 == null || var51.field2731 == null || var50.field2640 >= var51.field2731.length || var51.field2731[var50.field2640] != var50);
                                    class34.method152(var49, 200000);
                                }
                            }
                            var47 = var46.field3;
                            if (var47.field2640 < 0) {
                                break;
                            }
                            var48 = class164.method145(var47.field2657);
                        } while (var48 == null || var48.field2731 == null || var47.field2640 >= var48.field2731.length || var48.field2731[var47.field2640] != var47);
                        class34.method152(var46, 200000);
                    }
                }
                var44 = var43.field3;
                if (var44.field2640 < 0) {
                    break;
                }
                var45 = class164.method145(var44.field2657);
            } while (var45 == null || var45.field2731 == null || var44.field2640 >= var45.field2731.length || var45.field2731[var44.field2640] != var44);
            class34.method152(var43, 200000);
        }
    }

    @ObfuscatedName("dg.g(I)V")
    public static final void method2411() {
        if (Statics.field153 != null) {
            Statics.field153.method1028();
        }
        if (Statics.field1966 != null) {
            Statics.field1966.method1028();
        }
    }

    @ObfuscatedName("r.f(I)V")
    public static final void method154() {
        for (int var0 = 0; var0 < field498; var0++) {
            int var10002 = field501[var0]--;
            if (field501[var0] >= -10) {
                class54 var2 = field503[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method1062(Statics.field563, field286[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field501[var0] += var2.method1054();
                    field503[var0] = var2;
                }
                if (field501[var0] < 0) {
                    int var9;
                    if (field423[var0] == 0) {
                        var9 = field496;
                    } else {
                        int var3 = (field423[var0] & 0xFF) * 128;
                        int var4 = field423[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field579.field749;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field423[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field579.field752;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field501[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field375 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class58 var10 = var2.method1055().method1098(Statics.field1524);
                        class60 var11 = class60.method1203(var10, 100, var9);
                        var11.method1122(field500[var0] - 1);
                        Statics.field2061.method971(var11);
                    }
                    field501[var0] = -100;
                }
            } else {
                field498--;
                for (int var1 = var0; var1 < field498; var1++) {
                    field286[var1] = field286[var1 + 1];
                    field503[var1] = field503[var1 + 1];
                    field500[var1] = field500[var1 + 1];
                    field501[var1] = field501[var1 + 1];
                    field423[var1] = field423[var1 + 1];
                }
                var0--;
            }
        }
        if (!field495) {
            return;
        }
        boolean var12;
        if (class174.field2838 == 0) {
            var12 = Statics.field2533.method3158();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field493 != 0 && field469 != -1) {
                class174.method3006(Statics.field2034, field469, 0, field493, false);
            }
            field495 = false;
        }
    }

    @ObfuscatedName("ae.y(Laz;IIII)V")
    public static void method780(class40 arg0, int arg1, int arg2, int arg3) {
        if (field498 >= 50 || field375 == 0 || arg0.field921 == null || arg1 >= arg0.field921.length) {
            return;
        }
        int var4 = arg0.field921[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field286[field498] = var5;
        field500[field498] = var6;
        field501[field498] = 0;
        field503[field498] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field423[field498] = (var8 << 16) + (var9 << 8) + var7;
        field498++;
    }

    @ObfuscatedName("cg.j(IIII)V")
    public static void method1580(int arg0, int arg1, int arg2) {
        if (field496 == 0 || arg1 == 0 || field498 >= 50) {
            return;
        }
        field286[field498] = arg0;
        field500[field498] = arg1;
        field501[field498] = arg2;
        field503[field498] = null;
        field423[field498] = 0;
        field498++;
    }

    @ObfuscatedName("af.x(IB)V")
    public static void method926(int arg0) {
        if (arg0 == -1 && !field495) {
            class174.method2739();
        } else if (arg0 != -1 && field469 != arg0 && field493 != 0 && !field495) {
            class159 var1 = Statics.field2034;
            int var2 = field493;
            class174.field2838 = 1;
            Statics.field2842 = var1;
            Statics.field3059 = arg0;
            Statics.field2787 = 0;
            Statics.field3136 = var2;
            Statics.field2840 = false;
            Statics.field2505 = 2;
        }
        field469 = arg0;
    }

    @ObfuscatedName("ah.d(III)V")
    public static void method784(int arg0, int arg1) {
        if (field493 != 0 && arg0 != -1) {
            class174.method3006(Statics.field2820, arg0, 0, field493, false);
            field495 = true;
        }
    }

    @ObfuscatedName("es.ax(I)V")
    public static final void method2703() {
        if (field254 && Statics.field50 != field323) {
            method2594(Statics.field1123, Statics.field995, Statics.field50, Statics.field579.field789[0], Statics.field579.field790[0]);
        } else if (Statics.field50 != field485) {
            field485 = Statics.field50;
            Statics.method2767(Statics.field50);
        }
    }

    @ObfuscatedName("d.ag(Ljava/lang/String;I)V")
    public static final void method539(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1015.field126 = !Statics.field1015.field126;
            Statics.method537();
            if (Statics.field1015.field126) {
                class11.method2070(99, "", "Roofs are now all hidden");
            } else {
                class11.method2070(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field265 = !field265;
        }
        if (field311 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field265 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field265 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2414();
            }
            if (arg0.equalsIgnoreCase("errortest") && field250 == 2) {
                throw new RuntimeException();
            }
        }
        field397.method2386(35);
        field397.method2112(arg0.length() + 1);
        field397.method2247(arg0);
    }

    @ObfuscatedName("cq.ai(I)V")
    public static final void method1771() {
        int var0 = Statics.field699 * 128 + 64;
        int var1 = Statics.field1315 * 128 + 64;
        int var2 = method655(var0, var1, Statics.field50) - Statics.field2063;
        if (Statics.field1480 < var0) {
            Statics.field1480 += Statics.field1933 * (var0 - Statics.field1480) / 1000 + Statics.field1287;
            if (Statics.field1480 > var0) {
                Statics.field1480 = var0;
            }
        }
        if (Statics.field1480 > var0) {
            Statics.field1480 -= Statics.field1933 * (Statics.field1480 - var0) / 1000 + Statics.field1287;
            if (Statics.field1480 < var0) {
                Statics.field1480 = var0;
            }
        }
        if (Statics.field491 < var2) {
            Statics.field491 += Statics.field1933 * (var2 - Statics.field491) / 1000 + Statics.field1287;
            if (Statics.field491 > var2) {
                Statics.field491 = var2;
            }
        }
        if (Statics.field491 > var2) {
            Statics.field491 -= Statics.field1933 * (Statics.field491 - var2) / 1000 + Statics.field1287;
            if (Statics.field491 < var2) {
                Statics.field491 = var2;
            }
        }
        if (Statics.field2530 < var1) {
            Statics.field2530 += Statics.field1933 * (var1 - Statics.field2530) / 1000 + Statics.field1287;
            if (Statics.field2530 > var1) {
                Statics.field2530 = var1;
            }
        }
        if (Statics.field2530 > var1) {
            Statics.field2530 -= Statics.field1933 * (Statics.field2530 - var1) / 1000 + Statics.field1287;
            if (Statics.field2530 < var1) {
                Statics.field2530 = var1;
            }
        }
        int var3 = Statics.field1908 * 128 + 64;
        int var4 = Statics.field177 * 128 + 64;
        int var5 = method655(var3, var4, Statics.field50) - Statics.field92;
        int var6 = var3 - Statics.field1480;
        int var7 = var5 - Statics.field491;
        int var8 = var4 - Statics.field2530;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field31 < var10) {
            Statics.field31 += Statics.field1385 * (var10 - Statics.field31) / 1000 + Statics.field622;
            if (Statics.field31 > var10) {
                Statics.field31 = var10;
            }
        }
        if (Statics.field31 > var10) {
            Statics.field31 -= Statics.field1385 * (Statics.field31 - var10) / 1000 + Statics.field622;
            if (Statics.field31 < var10) {
                Statics.field31 = var10;
            }
        }
        int var12 = var11 - Statics.field1896;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1896 += Statics.field1385 * var12 / 1000 + Statics.field622;
            Statics.field1896 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1896 -= Statics.field1385 * -var12 / 1000 + Statics.field622;
            Statics.field1896 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1896;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1896 = var11;
        }
    }

    @ObfuscatedName("cj.ar(Lak;II)V")
    public static final void method2053(class35 arg0, int arg1) {
        if (arg0.field780 > field259) {
            method772(arg0);
        } else if (arg0.field781 >= field259) {
            method33(arg0);
        } else {
            method2413(arg0);
        }
        if (arg0.field749 < 128 || arg0.field752 < 128 || arg0.field749 >= 13184 || arg0.field752 >= 13184) {
            arg0.field766 = -1;
            arg0.field748 = -1;
            arg0.field780 = 0;
            arg0.field781 = 0;
            arg0.field749 = arg0.field789[0] * 128 + arg0.field739 * 64;
            arg0.field752 = arg0.field790[0] * 128 + arg0.field739 * 64;
            arg0.method621();
        }
        if (Statics.field579 == arg0 && (arg0.field749 < 1536 || arg0.field752 < 1536 || arg0.field749 >= 11776 || arg0.field752 >= 11776)) {
            arg0.field766 = -1;
            arg0.field748 = -1;
            arg0.field780 = 0;
            arg0.field781 = 0;
            arg0.field749 = arg0.field789[0] * 128 + arg0.field739 * 64;
            arg0.field752 = arg0.field790[0] * 128 + arg0.field739 * 64;
            arg0.method621();
        }
        method90(arg0);
        arg0.field738 = false;
        if (arg0.field763 != -1) {
            class40 var2 = class40.method512(arg0.field763);
            if (var2 == null || var2.field928 == null) {
                arg0.field763 = -1;
            } else {
                arg0.field765++;
                if (arg0.field754 < var2.field928.length && arg0.field765 > var2.field925[arg0.field754]) {
                    arg0.field765 = 1;
                    arg0.field754++;
                    method780(var2, arg0.field754, arg0.field749, arg0.field752);
                }
                if (arg0.field754 >= var2.field928.length) {
                    arg0.field765 = 0;
                    arg0.field754 = 0;
                    method780(var2, arg0.field754, arg0.field749, arg0.field752);
                }
            }
        }
        if (arg0.field748 != -1 && field259 >= arg0.field740) {
            if (arg0.field772 < 0) {
                arg0.field772 = 0;
            }
            int var3 = class41.method174(arg0.field748).field940;
            if (var3 == -1) {
                arg0.field748 = -1;
            } else {
                class40 var4 = class40.method512(var3);
                if (var4 == null || var4.field928 == null) {
                    arg0.field748 = -1;
                } else {
                    arg0.field784++;
                    if (arg0.field772 < var4.field928.length && arg0.field784 > var4.field925[arg0.field772]) {
                        arg0.field784 = 1;
                        arg0.field772++;
                        method780(var4, arg0.field772, arg0.field749, arg0.field752);
                    }
                    if (arg0.field772 >= var4.field928.length && (arg0.field772 < 0 || arg0.field772 >= var4.field928.length)) {
                        arg0.field748 = -1;
                    }
                }
            }
        }
        if (arg0.field766 != -1 && arg0.field769 <= 1) {
            class40 var5 = class40.method512(arg0.field766);
            if (var5.field913 == 1 && arg0.field737 > 0 && arg0.field780 <= field259 && arg0.field781 < field259) {
                arg0.field769 = 1;
                return;
            }
        }
        if (arg0.field766 != -1 && arg0.field769 == 0) {
            class40 var6 = class40.method512(arg0.field766);
            if (var6 == null || var6.field928 == null) {
                arg0.field766 = -1;
            } else {
                arg0.field768++;
                if (arg0.field767 < var6.field928.length && arg0.field768 > var6.field925[arg0.field767]) {
                    arg0.field768 = 1;
                    arg0.field767++;
                    method780(var6, arg0.field767, arg0.field749, arg0.field752);
                }
                if (arg0.field767 >= var6.field928.length) {
                    arg0.field767 -= var6.field922;
                    arg0.field770++;
                    if (arg0.field770 >= var6.field918) {
                        arg0.field766 = -1;
                    } else if (arg0.field767 >= 0 && arg0.field767 < var6.field928.length) {
                        method780(var6, arg0.field767, arg0.field749, arg0.field752);
                    } else {
                        arg0.field766 = -1;
                    }
                }
                arg0.field738 = var6.field924;
            }
        }
        if (arg0.field769 > 0) {
            arg0.field769--;
        }
    }

    @ObfuscatedName("ae.aw(Lak;I)V")
    public static final void method772(class35 arg0) {
        int var1 = arg0.field780 - field259;
        int var2 = arg0.field776 * 128 + arg0.field739 * 64;
        int var3 = arg0.field778 * 128 + arg0.field739 * 64;
        arg0.field749 += (var2 - arg0.field749) / var1;
        arg0.field752 += (var3 - arg0.field752) / var1;
        arg0.field792 = 0;
        if (arg0.field782 == 0) {
            arg0.field777 = 1024;
        }
        if (arg0.field782 == 1) {
            arg0.field777 = 1536;
        }
        if (arg0.field782 == 2) {
            arg0.field777 = 0;
        }
        if (arg0.field782 == 3) {
            arg0.field777 = 512;
        }
    }

    @ObfuscatedName("k.ac(Lak;B)V")
    public static final void method33(class35 arg0) {
        if (field259 == arg0.field781 || arg0.field766 == -1 || arg0.field769 != 0 || arg0.field768 + 1 > class40.method512(arg0.field766).field925[arg0.field767]) {
            int var1 = arg0.field781 - arg0.field780;
            int var2 = field259 - arg0.field780;
            int var3 = arg0.field776 * 128 + arg0.field739 * 64;
            int var4 = arg0.field778 * 128 + arg0.field739 * 64;
            int var5 = arg0.field774 * 128 + arg0.field739 * 64;
            int var6 = arg0.field779 * 128 + arg0.field739 * 64;
            arg0.field749 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field752 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field792 = 0;
        if (arg0.field782 == 0) {
            arg0.field777 = 1024;
        }
        if (arg0.field782 == 1) {
            arg0.field777 = 1536;
        }
        if (arg0.field782 == 2) {
            arg0.field777 = 0;
        }
        if (arg0.field782 == 3) {
            arg0.field777 = 512;
        }
        arg0.field785 = arg0.field777;
    }

    @ObfuscatedName("dn.ap(Lak;B)V")
    public static final void method2413(class35 arg0) {
        arg0.field763 = arg0.field793;
        if (arg0.field788 == 0) {
            arg0.field792 = 0;
            return;
        }
        if (arg0.field766 != -1 && arg0.field769 == 0) {
            class40 var1 = class40.method512(arg0.field766);
            if (arg0.field737 > 0 && var1.field913 == 0) {
                arg0.field792++;
                return;
            }
            if (arg0.field737 <= 0 && var1.field930 == 0) {
                arg0.field792++;
                return;
            }
        }
        int var2 = arg0.field749;
        int var3 = arg0.field752;
        int var4 = arg0.field789[arg0.field788 - 1] * 128 + arg0.field739 * 64;
        int var5 = arg0.field790[arg0.field788 - 1] * 128 + arg0.field739 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field749 = var4;
            arg0.field752 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field777 = 1280;
            } else if (var3 > var5) {
                arg0.field777 = 1792;
            } else {
                arg0.field777 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field777 = 768;
            } else if (var3 > var5) {
                arg0.field777 = 256;
            } else {
                arg0.field777 = 512;
            }
        } else if (var3 < var5) {
            arg0.field777 = 1024;
        } else if (var3 > var5) {
            arg0.field777 = 0;
        }
        int var6 = arg0.field777 - arg0.field785 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field744;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field743;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field746;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field756;
        }
        if (var7 == -1) {
            var7 = arg0.field743;
        }
        arg0.field763 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class32) {
            var9 = ((class32) arg0).field705.field841;
        }
        if (var9) {
            if (arg0.field785 != arg0.field777 && arg0.field760 == -1 && arg0.field787 != 0) {
                var8 = 2;
            }
            if (arg0.field788 > 2) {
                var8 = 6;
            }
            if (arg0.field788 > 3) {
                var8 = 8;
            }
            if (arg0.field792 > 0 && arg0.field788 > 1) {
                var8 = 8;
                arg0.field792--;
            }
        } else {
            if (arg0.field788 > 1) {
                var8 = 6;
            }
            if (arg0.field788 > 2) {
                var8 = 8;
            }
            if (arg0.field792 > 0 && arg0.field788 > 1) {
                var8 = 8;
                arg0.field792--;
            }
        }
        if (arg0.field791[arg0.field788 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field763 == arg0.field743 && arg0.field783 != -1) {
            arg0.field763 = arg0.field783;
        }
        if (var2 < var4) {
            arg0.field749 += var8;
            if (arg0.field749 > var4) {
                arg0.field749 = var4;
            }
        } else if (var2 > var4) {
            arg0.field749 -= var8;
            if (arg0.field749 < var4) {
                arg0.field749 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field752 += var8;
            if (arg0.field752 > var5) {
                arg0.field752 = var5;
            }
        } else if (var3 > var5) {
            arg0.field752 -= var8;
            if (arg0.field752 < var5) {
                arg0.field752 = var5;
            }
        }
        if (arg0.field749 == var4 && arg0.field752 == var5) {
            arg0.field788--;
            if (arg0.field737 > 0) {
                arg0.field737--;
            }
        }
    }

    @ObfuscatedName("l.al(Lak;I)V")
    public static final void method90(class35 arg0) {
        if (arg0.field787 == 0) {
            return;
        }
        if (arg0.field760 != -1 && arg0.field760 < 32768) {
            class32 var1 = field289[arg0.field760];
            if (var1 != null) {
                int var2 = arg0.field749 - var1.field749;
                int var3 = arg0.field752 - var1.field752;
                if (var2 != 0 || var3 != 0) {
                    arg0.field777 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field760 >= 32768) {
            int var4 = arg0.field760 - 32768;
            if (field482 == var4) {
                var4 = 2047;
            }
            class3 var5 = field370[var4];
            if (var5 != null) {
                int var6 = arg0.field749 - var5.field749;
                int var7 = arg0.field752 - var5.field752;
                if (var6 != 0 || var7 != 0) {
                    arg0.field777 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field753 != 0 || arg0.field762 != 0) && (arg0.field788 == 0 || arg0.field792 > 0)) {
            int var8 = arg0.field749 - (arg0.field753 * 64 - Statics.field1912 * 64 - Statics.field1912 * 64);
            int var9 = arg0.field752 - (arg0.field762 * 64 - Statics.field1084 * 64 - Statics.field1084 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field777 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field753 = 0;
            arg0.field762 = 0;
        }
        int var10 = arg0.field777 - arg0.field785 & 0x7FF;
        if (var10 == 0) {
            arg0.field735 = 0;
            return;
        }
        arg0.field735++;
        if (var10 > 1024) {
            arg0.field785 -= arg0.field787;
            boolean var11 = true;
            if (var10 < arg0.field787 || var10 > 2048 - arg0.field787) {
                arg0.field785 = arg0.field777;
                var11 = false;
            }
            if (arg0.field793 == arg0.field763 && (arg0.field735 > 25 || var11)) {
                if (arg0.field741 == -1) {
                    arg0.field763 = arg0.field743;
                } else {
                    arg0.field763 = arg0.field741;
                }
            }
        } else {
            arg0.field785 += arg0.field787;
            boolean var12 = true;
            if (var10 < arg0.field787 || var10 > 2048 - arg0.field787) {
                arg0.field785 = arg0.field777;
                var12 = false;
            }
            if (arg0.field793 == arg0.field763 && (arg0.field735 > 25 || var12)) {
                if (arg0.field742 == -1) {
                    arg0.field763 = arg0.field743;
                } else {
                    arg0.field763 = arg0.field742;
                }
            }
        }
        arg0.field785 &= 0x7FF;
    }

    @ObfuscatedName("ch.ak(La;III)V")
    public static void method1961(class3 arg0, int arg1, int arg2) {
        if (arg0.field766 == arg1 && arg1 != -1) {
            int var3 = class40.method512(arg1).field931;
            if (var3 == 1) {
                arg0.field767 = 0;
                arg0.field768 = 0;
                arg0.field769 = arg2;
                arg0.field770 = 0;
            }
            if (var3 == 2) {
                arg0.field770 = 0;
            }
        } else if (arg1 == -1 || arg0.field766 == -1 || class40.method512(arg1).field920 >= class40.method512(arg0.field766).field920) {
            arg0.field766 = arg1;
            arg0.field767 = 0;
            arg0.field768 = 0;
            arg0.field769 = arg2;
            arg0.field770 = 0;
            arg0.field737 = arg0.field788;
        }
    }

    @ObfuscatedName("ay.at(S)V")
    public static void method868() {
        Canvas var0 = Statics.field1328;
        var0.removeKeyListener(class129.field2020);
        var0.removeFocusListener(class129.field2020);
        class129.field2033 = -1;
        Canvas var1 = Statics.field1328;
        var1.removeMouseListener(class132.field2062);
        var1.removeMouseMotionListener(class132.field2062);
        var1.removeFocusListener(class132.field2062);
        class132.field2049 = 0;
        if (Statics.field882 != null) {
            Statics.field882.method2448(Statics.field1328);
        }
        Statics.field245.method2627();
        Statics.field1328.setBackground(Color.black);
        Canvas var2 = Statics.field1328;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class129.field2020);
        var2.addFocusListener(class129.field2020);
        Canvas var3 = Statics.field1328;
        var3.addMouseListener(class132.field2062);
        var3.addMouseMotionListener(class132.field2062);
        var3.addFocusListener(class132.field2062);
        if (Statics.field882 != null) {
            Statics.field882.method2449(Statics.field1328);
        }
        if (field306 != -1) {
            int var4 = field306;
            int var5 = Statics.field56;
            int var6 = Statics.field2528;
            if (class164.method2749(var4)) {
                method25(Statics.field2726[var4], -1, var5, var6, false);
            }
        }
        field2104 = true;
    }

    @ObfuscatedName("ad.au(B)V")
    public static void method918() {
        field397.method2386(32);
        class114 var0 = field397;
        int var1 = field499 ? 2 : 1;
        var0.method2112(var1);
        field397.method2201(Statics.field56);
        field397.method2201(Statics.field2528);
    }

    @ObfuscatedName("bm.am(B)V")
    public static void method1333() {
        client var0 = Statics.field245;
        synchronized (Statics.field245) {
            Container var1 = Statics.field245.method2630();
            if (var1 != null) {
                Statics.field1545 = Math.max(var1.getSize().width, Statics.field646);
                Statics.field1312 = Math.max(var1.getSize().height, Statics.field1709);
                if (Statics.field1855 == var1) {
                    Insets var2 = Statics.field1855.getInsets();
                    Statics.field1545 -= var2.right + var2.left;
                    Statics.field1312 -= var2.top + var2.bottom;
                }
                if (Statics.field1545 <= 0) {
                    Statics.field1545 = 1;
                }
                if (Statics.field1312 <= 0) {
                    Statics.field1312 = 1;
                }
                int var3 = field499 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field56 = field396 * 765;
                    Statics.field2528 = field368 * 503;
                } else {
                    Statics.field56 = Math.min(Statics.field1545, 7680);
                    Statics.field2528 = Math.min(Statics.field1312, 2160);
                }
                field2109 = (Statics.field1545 - Statics.field56) / 2;
                field2090 = 0;
                Statics.field1328.setSize(Statics.field56, Statics.field2528);
                Statics.field797 = class73.method5(Statics.field56, Statics.field2528, Statics.field1328);
                if (Statics.field1855 == var1) {
                    Insets var4 = Statics.field1855.getInsets();
                    Statics.field1328.setLocation(field2109 + var4.left, field2090 + var4.top);
                } else {
                    Statics.field1328.setLocation(field2109, field2090);
                }
                int var5 = Statics.field56;
                int var6 = Statics.field2528;
                if (Statics.field1545 < var5) {
                    int var7 = Statics.field1545;
                }
                if (Statics.field1312 < var6) {
                    int var8 = Statics.field1312;
                }
                if (Statics.field1015 != null) {
                    try {
                        client var9 = Statics.field245;
                        int var10 = field499 ? 2 : 1;
                        class124.method2466(var9, "resize", new Object[] { var10 });
                    } catch (Throwable var16) {
                    }
                }
                if (field306 != -1) {
                    int var12 = field306;
                    int var13 = Statics.field56;
                    int var14 = Statics.field2528;
                    if (class164.method2749(var12)) {
                        method25(Statics.field2726[var12], -1, var13, var14, true);
                    }
                }
                method34();
            }
        }
    }

    @ObfuscatedName("k.aa(I)V")
    public static void method34() {
        int var0 = field2109;
        int var1 = field2090;
        int var2 = Statics.field1545 - Statics.field56 - var0;
        int var3 = Statics.field1312 - Statics.field2528 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field245.method2630();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1855 == var4) {
                Insets var7 = Statics.field1855.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1312);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1545, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1545 + var5 - var2, var6, var2, Statics.field1312);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1312 + var6 - var3, Statics.field1545, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("n.az(I)V")
    public static final void method143() {
        if (field306 != -1) {
            method2939(field306);
        }
        for (int var0 = 0; var0 < field457; var0++) {
            if (field492[var0]) {
                field298[var0] = true;
            }
            field337[var0] = field492[var0];
            field492[var0] = false;
        }
        field458 = field259;
        field275 = -1;
        field402 = -1;
        Statics.field1710 = null;
        if (field306 != -1) {
            field457 = 0;
            method599(field306, 0, 0, Statics.field56, Statics.field2528, 0, 0, -1);
        }
        class75.method1498();
        if (field418) {
            method603();
        } else if (field275 != -1) {
            method841(field275, field402);
        }
        if (field466 == 3) {
            for (int var1 = 0; var1 < field457; var1++) {
                if (field337[var1]) {
                    class75.method1504(field462[var1], field372[var1], field464[var1], field465[var1], 16711935, 128);
                } else if (field298[var1]) {
                    class75.method1504(field462[var1], field372[var1], field464[var1], field465[var1], 16711680, 128);
                }
            }
        }
        int var2 = Statics.field50;
        int var3 = Statics.field579.field749;
        int var4 = Statics.field579.field752;
        int var5 = field326;
        for (class22 var6 = (class22) class22.field576.method3324(); var6 != null; var6 = (class22) class22.field576.method3326()) {
            if (var6.field568 != -1 || var6.field572 != null) {
                int var7 = 0;
                if (var3 > var6.field565) {
                    var7 += var3 - var6.field565;
                } else if (var3 < var6.field573) {
                    var7 += var6.field573 - var3;
                }
                if (var4 > var6.field566) {
                    var7 += var4 - var6.field566;
                } else if (var4 < var6.field564) {
                    var7 += var6.field564 - var4;
                }
                if (var7 - 64 > var6.field567 || field375 == 0 || var6.field562 != var2) {
                    if (var6.field569 != null) {
                        Statics.field2061.method972(var6.field569);
                        var6.field569 = null;
                    }
                    if (var6.field574 != null) {
                        Statics.field2061.method972(var6.field574);
                        var6.field574 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = field375 * (var6.field567 - var7) / var6.field567;
                    class54 var10000;
                    if (var6.field569 != null) {
                        var6.field569.method1151(var8);
                    } else if (var6.field568 >= 0) {
                        var10000 = (class54) null;
                        class54 var9 = class54.method1062(Statics.field563, var6.field568, 0);
                        if (var9 != null) {
                            class58 var10 = var9.method1055().method1098(Statics.field1524);
                            class60 var11 = class60.method1203(var10, 100, var8);
                            var11.method1122(-1);
                            Statics.field2061.method971(var11);
                            var6.field569 = var11;
                        }
                    }
                    if (var6.field574 != null) {
                        var6.field574.method1151(var8);
                        if (!var6.field574.method3411()) {
                            var6.field574 = null;
                        }
                    } else if (var6.field572 != null && (var6.field561 -= var5) <= 0) {
                        int var12 = (int) (Math.random() * (double) var6.field572.length);
                        var10000 = (class54) null;
                        class54 var13 = class54.method1062(Statics.field563, var6.field572[var12], 0);
                        if (var13 != null) {
                            class58 var14 = var13.method1055().method1098(Statics.field1524);
                            class60 var15 = class60.method1203(var14, 100, var8);
                            var15.method1122(0);
                            Statics.field2061.method971(var15);
                            var6.field574 = var15;
                            var6.field561 = var6.field570 + (int) (Math.random() * (double) (var6.field571 - var6.field570));
                        }
                    }
                }
            }
        }
        field326 = 0;
    }

    @ObfuscatedName("ac.ah(IIIIZI)V")
    public static final void method602(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field511 - field490) * var5 / 100 + field490;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field419) {
            short var8 = field419;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field515) {
                var6 = field515;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class75.method1498();
                    class75.method1533(arg0, arg1, var10, arg3, -16777216);
                    class75.method1533(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field517) {
            short var11 = field517;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field514) {
                var6 = field514;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class75.method1498();
                    class75.method1533(arg0, arg1, arg2, var13, -16777216);
                    class75.method1533(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field522 = arg3 * var6 / 334 << 1;
        if (field322 != arg2 || field521 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < 9; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var18 = class86.field1515[var16];
                var14[var15] = var17 * var18 >> 16;
            }
            class81.method1623(var14, 500, 800, arg2, arg3);
        }
        field518 = arg0;
        field453 = arg1;
        field322 = arg2;
        field521 = arg3;
    }

    @ObfuscatedName("cq.an(Law;I)V")
    public static final void method1775(class31 arg0) {
        if (Statics.field579.field749 >> 7 == field393 && Statics.field579.field752 >> 7 == field446) {
            field393 = 0;
        }
        int var1 = field371;
        if (class31.field701 == arg0 || class31.field696 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field701 == arg0) {
                var3 = Statics.field579;
                var4 = 33538048;
            } else if (class31.field696 == arg0) {
                var3 = field370[field363];
                var4 = field363 << 14;
            } else {
                var3 = field370[field391[var2]];
                var4 = field391[var2] << 14;
                if (class31.field698 == arg0 && field363 == field391[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method17() && !var3.field47) {
                var3.field45 = false;
                if ((field254 && field371 > 50 || field371 > 200) && class31.field701 != arg0 && var3.field793 == var3.field763) {
                    var3.field45 = true;
                }
                int var5 = var3.field749 >> 7;
                int var6 = var3.field752 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field259 < var3.field43 || field259 >= var3.field48) {
                        if ((var3.field749 & 0x7F) == 64 && (var3.field752 & 0x7F) == 64) {
                            if (field470 == field353[var5][var6]) {
                                continue;
                            }
                            field353[var5][var6] = field470;
                        }
                        var3.field34 = method655(var3.field749, var3.field752, Statics.field50);
                        Statics.field619.method1644(Statics.field50, var3.field749, var3.field752, var3.field34, 60, var3, var3.field785, var4, var3.field738);
                    } else {
                        var3.field45 = false;
                        var3.field34 = method655(var3.field749, var3.field752, Statics.field50);
                        Statics.field619.method1600(Statics.field50, var3.field749, var3.field752, var3.field34, 60, var3, var3.field785, var4, var3.field41, var3.field42, var3.field51, var3.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.aq(ZI)V")
    public static final void method609(boolean arg0) {
        for (int var1 = 0; var1 < field290; var1++) {
            class32 var2 = field289[field291[var1]];
            int var3 = (field291[var1] << 14) + 536870912;
            if (var2 != null && var2.method17() && var2.field705.field807 == arg0 && var2.field705.method643()) {
                int var4 = var2.field749 >> 7;
                int var5 = var2.field752 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field739 == 1 && (var2.field749 & 0x7F) == 64 && (var2.field752 & 0x7F) == 64) {
                        if (field470 == field353[var4][var5]) {
                            continue;
                        }
                        field353[var4][var5] = field470;
                    }
                    if (!var2.field705.field840) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field619.method1644(Statics.field50, var2.field749, var2.field752, method655(var2.field749 + (var2.field739 * 64 - 64), var2.field752 + (var2.field739 * 64 - 64), Statics.field50), var2.field739 * 64 - 64 + 60, var2, var2.field785, var3, var2.field738);
                }
            }
        }
    }

    @ObfuscatedName("au.as(I)V")
    public static final void method656() {
        for (class7 var0 = (class7) field387.method3324(); var0 != null; var0 = (class7) field387.method3326()) {
            if (Statics.field50 != var0.field105 || field259 > var0.field94) {
                var0.method3414();
            } else if (field259 >= var0.field112) {
                if (var0.field101 > 0) {
                    class32 var1 = field289[var0.field101 - 1];
                    if (var1 != null && var1.field749 >= 0 && var1.field749 < 13312 && var1.field752 >= 0 && var1.field752 < 13312) {
                        var0.method92(var1.field749, var1.field752, method655(var1.field749, var1.field752, var0.field105) - var0.field103, field259);
                    }
                }
                if (var0.field101 < 0) {
                    int var2 = -var0.field101 - 1;
                    class3 var3;
                    if (field482 == var2) {
                        var3 = Statics.field579;
                    } else {
                        var3 = field370[var2];
                    }
                    if (var3 != null && var3.field749 >= 0 && var3.field749 < 13312 && var3.field752 >= 0 && var3.field752 < 13312) {
                        var0.method92(var3.field749, var3.field752, method655(var3.field749, var3.field752, var0.field105) - var0.field103, field259);
                    }
                }
                var0.method96(field326);
                Statics.field619.method1644(Statics.field50, (int) var0.field99, (int) var0.field100, (int) var0.field87, 60, var0, var0.field107, -1, false);
            }
        }
    }

    @ObfuscatedName("gi.ay(S)V")
    public static final void method3415() {
        for (class28 var0 = (class28) field519.method3324(); var0 != null; var0 = (class28) field519.method3326()) {
            if (Statics.field50 != var0.field635 || var0.field633) {
                var0.method3414();
            } else if (field259 >= var0.field634) {
                var0.method562(field326);
                if (var0.field633) {
                    var0.method3414();
                } else {
                    Statics.field619.method1644(var0.field635, var0.field642, var0.field637, var0.field638, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ez.ad(I)I")
    public static final int method2580() {
        if (Statics.field1015.field126) {
            return Statics.field50;
        }
        int var0 = 3;
        if (Statics.field31 < 310) {
            int var1 = Statics.field1480 >> 7;
            int var2 = Statics.field2530 >> 7;
            int var3 = Statics.field579.field749 >> 7;
            int var4 = Statics.field579.field752 >> 7;
            if ((class6.field81[Statics.field50][var1][var2] & 0x4) != 0) {
                var0 = Statics.field50;
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
                    if ((class6.field81[Statics.field50][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field50;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field81[Statics.field50][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field50;
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
                    if ((class6.field81[Statics.field50][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field50;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field81[Statics.field50][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field50;
                        }
                    }
                }
            }
        }
        if ((class6.field81[Statics.field50][Statics.field579.field749 >> 7][Statics.field579.field752 >> 7] & 0x4) != 0) {
            var0 = Statics.field50;
        }
        return var0;
    }

    @ObfuscatedName("eb.af(B)I")
    public static final int method2696() {
        if (Statics.field1015.field126) {
            return Statics.field50;
        } else {
            int var0 = method655(Statics.field1480, Statics.field2530, Statics.field50);
            return var0 - Statics.field491 >= 800 || (class6.field81[Statics.field50][Statics.field1480 >> 7][Statics.field2530 >> 7] & 0x4) == 0 ? 3 : Statics.field50;
        }
    }

    @ObfuscatedName("ai.av(IIIII)V")
    public static final void method564(int arg0, int arg1, int arg2, int arg3) {
        field343 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field371 + field290; var6++) {
            class35 var7;
            if (var6 == -1) {
                var7 = Statics.field579;
            } else if (var6 < field371) {
                var7 = field370[field391[var6]];
                if (field363 == field391[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field289[field291[var6 - field371]];
            }
            Statics.method86(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            Statics.method86(field370[field363], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field343; var8++) {
            int var9 = field345[var8];
            int var10 = field346[var8];
            int var11 = field348[var8];
            int var12 = field347[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field346[var14] - field347[var14] && var10 - var12 < field346[var14] + 2 && var9 - var11 < field348[var14] + field345[var14] && var9 + var11 > field345[var14] - field348[var14] && field346[var14] - field347[var14] < var10) {
                        var10 = field346[var14] - field347[var14];
                        var13 = true;
                    }
                }
            }
            field355 = field345[var8];
            field304 = field346[var8] = var10;
            String var15 = field352[var8];
            if (field320 == 0) {
                int var16 = 16776960;
                if (field349[var8] < 6) {
                    var16 = field471[field349[var8]];
                }
                if (field349[var8] == 6) {
                    var16 = field470 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field349[var8] == 7) {
                    var16 = field470 % 20 < 10 ? 255 : 65535;
                }
                if (field349[var8] == 8) {
                    var16 = field470 % 20 < 10 ? 45056 : 8454016;
                }
                if (field349[var8] == 9) {
                    int var17 = 150 - field351[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field349[var8] == 10) {
                    int var18 = 150 - field351[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field349[var8] == 11) {
                    int var19 = 150 - field351[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field350[var8] == 0) {
                    Statics.field1322.method3568(var15, field355 + arg0, field304 + arg1, var16, 0);
                }
                if (field350[var8] == 1) {
                    Statics.field1322.method3545(var15, field355 + arg0, field304 + arg1, var16, 0, field470);
                }
                if (field350[var8] == 2) {
                    Statics.field1322.method3546(var15, field355 + arg0, field304 + arg1, var16, 0, field470);
                }
                if (field350[var8] == 3) {
                    Statics.field1322.method3547(var15, field355 + arg0, field304 + arg1, var16, 0, field470, 150 - field351[var8]);
                }
                if (field350[var8] == 4) {
                    int var20 = (150 - field351[var8]) * (Statics.field1322.method3536(var15) + 100) / 150;
                    class75.method1500(field355 + arg0 - 50, arg1, field355 + arg0 + 50, arg1 + arg3);
                    Statics.field1322.method3588(var15, field355 + arg0 + 50 - var20, field304 + arg1, var16, 0);
                    class75.method1499(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field350[var8] == 5) {
                    int var21 = 150 - field351[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class75.method1500(arg0, field304 + arg1 - Statics.field1322.field3088 - 1, arg0 + arg2, field304 + arg1 + 5);
                    Statics.field1322.method3568(var15, field355 + arg0, field304 + arg1 + var22, var16, 0);
                    class75.method1499(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1322.method3568(var15, field355 + arg0, field304 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("r.ao(I)V")
    public static final void method155() {
        field369 = 0;
        int var0 = (Statics.field579.field749 >> 7) + Statics.field1912;
        int var1 = (Statics.field579.field752 >> 7) + Statics.field1084;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field369 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field369 = 1;
        }
        if (field369 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field369 = 0;
        }
    }

    @ObfuscatedName("cj.aj(IIIII)V")
    public static final void method2060(int arg0, int arg1, int arg2, int arg3) {
        if (field433 == 1) {
            Statics.field25[field359 / 100].method1415(field357 - 8, field358 - 8);
        }
        if (field433 == 2) {
            Statics.field25[field359 / 100 + 4].method1415(field357 - 8, field358 - 8);
        }
        method155();
    }

    @ObfuscatedName("ba.bj(Lak;II)V")
    public static final void method1401(class35 arg0, int arg1) {
        Statics.method2(arg0.field749, arg0.field752, arg1);
    }

    @ObfuscatedName("au.bw(IIII)I")
    public static final int method655(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field81[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field73[var5][var3][var4] + class6.field73[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field73[var5][var3][var4 + 1] + class6.field73[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("em.bi(ZB)V")
    public static final void method2788(boolean arg0) {
        field504 = arg0;
        if (!field504) {
            int var1 = field394.method2161();
            int var2 = (field295 - field394.field1894) / 16;
            Statics.field2108 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field2108[var3][var4] = field394.method2194();
                }
            }
            int var5 = field394.method2161();
            int var6 = field394.method2209();
            int var7 = field394.method2129();
            int var8 = field394.method2129();
            Statics.field3021 = new int[var2];
            Statics.field2797 = new int[var2];
            Statics.field1491 = new int[var2];
            Statics.field718 = new byte[var2][];
            Statics.field1609 = new byte[var2][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field3021[var10] = var13;
                        Statics.field2797[var10] = Statics.field2966.method2833("m" + var11 + "_" + var12);
                        Statics.field1491[var10] = Statics.field2966.method2833("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2594(var8, var1, var6, var7, var5);
            return;
        }
        int var14 = field394.method2129();
        int var15 = field394.method2132();
        int var16 = field394.method2163();
        field394.method2379();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field394.method2380(1);
                    if (var20 == 1) {
                        field527[var17][var18][var19] = field394.method2380(26);
                    } else {
                        field527[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field394.method2390();
        int var21 = (field295 - field394.field1894) / 16;
        Statics.field2108 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field2108[var22][var23] = field394.method2302();
            }
        }
        int var24 = field394.method2129();
        int var25 = field394.method2163();
        Statics.field3021 = new int[var21];
        Statics.field2797 = new int[var21];
        Statics.field1491 = new int[var21];
        Statics.field718 = new byte[var21][];
        Statics.field1609 = new byte[var21][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field527[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field3021[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field3021[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2797[var26] = Statics.field2966.method2833("m" + var35 + "_" + var36);
                            Statics.field1491[var26] = Statics.field2966.method2833("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2594(var25, var16, var15, var24, var14);
    }

    @ObfuscatedName("ep.bh(IIIIII)V")
    public static final void method2594(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1123 == arg0 && Statics.field995 == arg1 && field323 == arg2 || !field254) {
            return;
        }
        Statics.field1123 = arg0;
        Statics.field995 = arg1;
        field323 = arg2;
        if (!field254) {
            field323 = 0;
        }
        method565(25);
        Statics.method869(class148.field2457, true);
        int var5 = Statics.field1912;
        int var6 = Statics.field1084;
        Statics.field1912 = (arg0 - 6) * 8;
        Statics.field1084 = (arg1 - 6) * 8;
        int var7 = Statics.field1912 - var5;
        int var8 = Statics.field1084 - var6;
        int var9 = Statics.field1912;
        int var10 = Statics.field1084;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field289[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field789[var13] -= var7;
                    var12.field790[var13] -= var8;
                }
                var12.field749 -= var7 * 128;
                var12.field752 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field370[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field789[var16] -= var7;
                    var15.field790[var16] -= var8;
                }
                var15.field749 -= var7 * 128;
                var15.field752 -= var8 * 128;
            }
        }
        Statics.field50 = arg2;
        Statics.field579.method619(arg3, arg4, false);
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
                        field385[var27][var23][var24] = field385[var27][var25][var26];
                    } else {
                        field385[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field386.method3324(); var28 != null; var28 = (class16) field386.method3326()) {
            var28.field206 -= var7;
            var28.field214 -= var8;
            if (var28.field206 < 0 || var28.field214 < 0 || var28.field206 >= 104 || var28.field214 >= 104) {
                var28.method3414();
            }
        }
        if (field393 != 0) {
            field393 -= var7;
            field446 -= var8;
        }
        field498 = 0;
        field526 = false;
        field485 = -1;
        field519.method3318();
        field387.method3318();
    }

    @ObfuscatedName("p.be(ZI)V")
    public static final void method37(boolean arg0) {
        method2411();
        field271++;
        if (field271 < 50 && !arg0) {
            return;
        }
        field271 = 0;
        if (field303 || Statics.field2037 == null) {
            return;
        }
        field397.method2386(83);
        try {
            Statics.field2037.method2593(field397.field1897, 0, field397.field1894);
            field397.field1894 = 0;
        } catch (IOException var2) {
            field303 = true;
        }
    }

    @ObfuscatedName("ca.bb(IIIIII)V")
    public static final void method1769(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field619.method1614(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field619.method1618(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1082.field1340;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method1770(var12);
            if (var13.field859 == -1) {
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
                class76 var14 = Statics.field1956[var13.field859];
                if (var14 != null) {
                    int var15 = (var13.field864 * 4 - var14.field1352) / 2;
                    int var16 = (var13.field852 * 4 - var14.field1353) / 2;
                    var14.method1561(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field852) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field619.method1616(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field619.method1618(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method1770(var21);
            if (var22.field859 != -1) {
                class76 var23 = Statics.field1956[var22.field859];
                if (var23 != null) {
                    int var24 = (var22.field864 * 4 - var23.field1352) / 2;
                    int var25 = (var22.field852 * 4 - var23.field1353) / 2;
                    var23.method1561(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field852) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1082.field1340;
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
        int var29 = Statics.field619.method1617(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method1770(var30);
        if (var31.field859 == -1) {
            return;
        }
        class76 var32 = Statics.field1956[var31.field859];
        if (var32 != null) {
            int var33 = (var31.field864 * 4 - var32.field1352) / 2;
            int var34 = (var31.field852 * 4 - var32.field1353) / 2;
            var32.method1561(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field852) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("au.bq(S)Z")
    public static final boolean method666() {
        if (Statics.field2037 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2037.method2591();
            if (var0 == 0) {
                return false;
            }
            if (field296 == -1) {
                Statics.field2037.method2613(field394.field1897, 0, 1);
                field394.field1894 = 0;
                field296 = field394.method2391();
                field295 = class179.field2936[field296];
                var0--;
            }
            if (field295 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2037.method2613(field394.field1897, 0, 1);
                field295 = field394.field1897[0] & 0xFF;
                var0--;
            }
            if (field295 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2037.method2613(field394.field1897, 0, 2);
                field394.field1894 = 0;
                field295 = field394.method2129();
                var0 -= 2;
            }
            if (var0 < field295) {
                return false;
            }
            field394.field1894 = 0;
            Statics.field2037.method2613(field394.field1897, 0, field295);
            field297 = 0;
            field356 = field301;
            field301 = field300;
            field300 = field296;
            if (field296 == 74) {
                method806();
                field296 = -1;
                return true;
            }
            if (field296 == 26) {
                int var1 = field394.method2170();
                int var2 = field394.method2161();
                int var3 = var2 >> 10 & 0x1F;
                int var4 = var2 >> 5 & 0x1F;
                int var5 = var2 & 0x1F;
                int var6 = (var5 << 3) + (var3 << 19) + (var4 << 11);
                class164 var7 = class164.method145(var1);
                if (var7.field2663 != var6) {
                    var7.field2663 = var6;
                    method3247(var7);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 185) {
                boolean var8 = field394.method2127() == 1;
                if (var8) {
                    Statics.field1920 = class107.method3468() - field394.method2133();
                    Statics.field32 = new class212(field394, true);
                } else {
                    Statics.field32 = null;
                }
                field354 = field437;
                field296 = -1;
                return true;
            }
            if (field296 == 90) {
                int var9 = field394.method2161();
                int var10 = field394.method2161();
                int var11 = field394.method2161();
                int var12 = field394.method2302();
                class164 var13 = class164.method145(var12);
                if (var13.field2687 != var10 || var13.field2662 != var11 || var13.field2690 != var9) {
                    var13.field2687 = var10;
                    var13.field2662 = var11;
                    var13.field2690 = var9;
                    method3247(var13);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 49) {
                for (int var14 = 0; var14 < Statics.field1088; var14++) {
                    class48 var15 = (class48) class48.field1089.method3254((long) var14);
                    class48 var16;
                    if (var15 == null) {
                        byte[] var17 = Statics.field1092.method2819(16, var14);
                        class48 var18 = new class48();
                        if (var17 != null) {
                            var18.method925(new class111(var17));
                        }
                        class48.field1089.method3256(var18, (long) var14);
                        var16 = var18;
                    } else {
                        var16 = var15;
                    }
                    if (var16 != null) {
                        class167.field2785[var14] = 0;
                        class167.field2786[var14] = 0;
                    }
                }
                method615();
                field468 += 32;
                field296 = -1;
                return true;
            }
            if (field296 == 155) {
                int var20 = field295 + field394.field1894;
                int var21 = field394.method2129();
                int var22 = field394.method2129();
                if (field306 != var21) {
                    field306 = var21;
                    int var23 = field306;
                    int var24 = Statics.field56;
                    int var25 = Statics.field2528;
                    if (class164.method2749(var23)) {
                        method25(Statics.field2726[var23], -1, var24, var25, false);
                    }
                    method2536(field306);
                    class34.method2052(field306);
                    for (int var26 = 0; var26 < 100; var26++) {
                        field492[var26] = true;
                    }
                }
                while (var22-- > 0) {
                    int var27 = field394.method2194();
                    int var28 = field394.method2129();
                    int var29 = field394.method2127();
                    class4 var30 = (class4) field413.method3297((long) var27);
                    if (var30 != null && var30.field58 != var28) {
                        method1084(var30, true);
                        var30 = null;
                    }
                    if (var30 == null) {
                        var30 = Statics.method1583(var27, var28, var29);
                    }
                    var30.field54 = true;
                }
                for (class4 var31 = (class4) field413.method3286(); var31 != null; var31 = (class4) field413.method3291()) {
                    if (var31.field54) {
                        var31.field54 = false;
                    } else {
                        method1084(var31, true);
                    }
                }
                field456 = new class187(512);
                while (field394.field1894 < var20) {
                    int var32 = field394.method2194();
                    int var33 = field394.method2129();
                    int var34 = field394.method2129();
                    int var35 = field394.method2194();
                    for (int var36 = var33; var36 <= var34; var36++) {
                        long var37 = ((long) var32 << 32) + (long) var36;
                        field456.method3288(new class192(var35), var37);
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 184) {
                field394.field1894 += 28;
                if (field394.method2149()) {
                    class141.method2375(field394, field394.field1894 - 28);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 149) {
                String var39 = field394.method2166();
                Statics.field256 = var39;
                try {
                    String var40 = Statics.field245.getParameter(class181.field2957.field2958);
                    String var41 = Statics.field245.getParameter(class181.field2956.field2958);
                    String var42 = var40 + "settings=" + var39 + "; version=1; path=/; domain=" + var41;
                    String var43;
                    if (var39.length() == 0) {
                        var43 = var42 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var43 = var42 + "; Expires=" + class103.method2582(class107.method3468() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    class124.method2463(Statics.field245, "document.cookie=\"" + var43 + "\"");
                } catch (Throwable var261) {
                }
                field296 = -1;
                return true;
            }
            if (field296 == 203) {
                int var45 = field394.method2171();
                class164 var46 = class164.method145(var45);
                for (int var47 = 0; var47 < var46.field2681.length; var47++) {
                    var46.field2681[var47] = -1;
                    var46.field2681[var47] = 0;
                }
                method3247(var46);
                field296 = -1;
                return true;
            }
            if (field296 == 139) {
                int var48 = field394.method2161();
                int var49 = field394.method2302();
                class164 var50 = class164.method145(var49);
                if (var50.field2679 != 2 || var50.field2680 != var48) {
                    var50.field2679 = 2;
                    var50.field2680 = var48;
                    method3247(var50);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 11) {
                String var51 = field394.method2166();
                int var52 = field394.method2129();
                byte var53 = field394.method2267();
                boolean var54 = false;
                if (var53 == -128) {
                    var54 = true;
                }
                if (var54) {
                    if (Statics.field802 == 0) {
                        field296 = -1;
                        return true;
                    }
                    boolean var55 = false;
                    int var56;
                    for (var56 = 0; var56 < Statics.field802 && (!Statics.field2101[var56].field588.equals(var51) || Statics.field2101[var56].field582 != var52); var56++) {
                    }
                    if (var56 < Statics.field802) {
                        while (var56 < Statics.field802 - 1) {
                            Statics.field2101[var56] = Statics.field2101[var56 + 1];
                            var56++;
                        }
                        Statics.field802--;
                        Statics.field2101[Statics.field802] = null;
                    }
                } else {
                    field394.method2166();
                    class23 var57 = new class23();
                    var57.field588 = var51;
                    var57.field581 = class155.method2537(var57.field588, Statics.field252);
                    var57.field582 = var52;
                    var57.field585 = var53;
                    int var58;
                    for (var58 = Statics.field802 - 1; var58 >= 0; var58--) {
                        int var59 = Statics.field2101[var58].field581.compareTo(var57.field581);
                        if (var59 == 0) {
                            Statics.field2101[var58].field582 = var52;
                            Statics.field2101[var58].field585 = var53;
                            if (var51.equals(Statics.field579.field33)) {
                                Statics.field2064 = var53;
                            }
                            field405 = field437;
                            field296 = -1;
                            return true;
                        }
                        if (var59 < 0) {
                            break;
                        }
                    }
                    if (Statics.field802 >= Statics.field2101.length) {
                        field296 = -1;
                        return true;
                    }
                    for (int var60 = Statics.field802 - 1; var60 > var58; var60--) {
                        Statics.field2101[var60 + 1] = Statics.field2101[var60];
                    }
                    if (Statics.field802 == 0) {
                        Statics.field2101 = new class23[100];
                    }
                    Statics.field2101[var58 + 1] = var57;
                    Statics.field802++;
                    if (var51.equals(Statics.field579.field33)) {
                        Statics.field2064 = var53;
                    }
                }
                field405 = field437;
                field296 = -1;
                return true;
            }
            if (field296 == 150) {
                String var61 = field394.method2166();
                class114 var62 = field394;
                String var63 = class213.method3234(var62, 32767);
                String var64 = class214.method3616(class154.method616(var63));
                class11.method2070(6, var61, var64);
                field296 = -1;
                return true;
            }
            if (field296 == 7) {
                int var65 = field394.method2214();
                int var66 = field394.method2194();
                class164 var67 = class164.method145(var66);
                if (var67.field2679 != 1 || var67.field2680 != var65) {
                    var67.field2679 = 1;
                    var67.field2680 = var65;
                    method3247(var67);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 14) {
                String var68 = field394.method2166();
                long var69 = (long) field394.method2129();
                long var71 = (long) field394.method2131();
                class143 var73 = (class143) class101.method2555(class143.method563(), field394.method2127());
                long var74 = (var69 << 32) + var71;
                boolean var76 = false;
                for (int var77 = 0; var77 < 100; var77++) {
                    if (field476[var77] == var74) {
                        var76 = true;
                        break;
                    }
                }
                if (method99(var68)) {
                    var76 = true;
                }
                if (!var76 && field369 == 0) {
                    field476[field477] = var74;
                    field477 = (field477 + 1) % 100;
                    class114 var78 = field394;
                    String var79 = class213.method3234(var78, 32767);
                    String var80 = class214.method3616(class154.method616(var79));
                    byte var81;
                    if (var73.field2161) {
                        var81 = 7;
                    } else {
                        var81 = 3;
                    }
                    if (var73.field2160 == -1) {
                        class11.method2070(var81, var68, var80);
                    } else {
                        class11.method2070(var81, class2.method2738(var73.field2160) + var68, var80);
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 106) {
                field526 = false;
                for (int var82 = 0; var82 < 5; var82++) {
                    field505[var82] = false;
                }
                field296 = -1;
                return true;
            }
            if (field296 == 117) {
                int var83 = field394.method2194();
                int var84 = field394.method2129();
                if (var83 < -70000) {
                    var84 += 32768;
                }
                class164 var85;
                if (var83 >= 0) {
                    var85 = class164.method145(var83);
                } else {
                    var85 = null;
                }
                if (var85 != null) {
                    for (int var86 = 0; var86 < var85.field2681.length; var86++) {
                        var85.field2681[var86] = 0;
                        var85.field2755[var86] = 0;
                    }
                }
                class15.method2056(var84);
                int var87 = field394.method2129();
                for (int var88 = 0; var88 < var87; var88++) {
                    int var89 = field394.method2132();
                    if (var89 == 255) {
                        var89 = field394.method2170();
                    }
                    int var90 = field394.method2163();
                    if (var85 != null && var88 < var85.field2681.length) {
                        var85.field2681[var88] = var90;
                        var85.field2755[var88] = var89;
                    }
                    class15.method183(var84, var88, var90 - 1, var89);
                }
                if (var85 != null) {
                    method3247(var85);
                }
                method615();
                field440[++field362 - 1 & 0x1F] = var84 & 0x7FFF;
                field296 = -1;
                return true;
            }
            if (field296 == 214) {
                int var91 = field394.method2129();
                class15.method104(var91);
                field440[++field362 - 1 & 0x1F] = var91 & 0x7FFF;
                field296 = -1;
                return true;
            }
            if (field296 == 167) {
                method3243();
                field296 = -1;
                return false;
            }
            if (field296 == 243) {
                int var92 = field394.method2129();
                int var93 = field394.method2127();
                int var94 = field394.method2129();
                if (field496 != 0 && var93 != 0 && field498 < 50) {
                    field286[field498] = var92;
                    field500[field498] = var93;
                    field501[field498] = var94;
                    field503[field498] = null;
                    field423[field498] = 0;
                    field498++;
                }
                field296 = -1;
                return true;
            }
            if (field296 == 196) {
                byte var98 = field394.method2156();
                int var99 = field394.method2161();
                class167.field2785[var99] = var98;
                if (class167.field2786[var99] != var98) {
                    class167.field2786[var99] = var98;
                    method147(var99);
                }
                field438[++field468 - 1 & 0x1F] = var99;
                field296 = -1;
                return true;
            }
            if (field296 == 223) {
                if (field306 != -1) {
                    method1859(field306, 0);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 213) {
                String var100 = field394.method2166();
                int var101 = field394.method2194();
                class164 var102 = class164.method145(var101);
                if (!var100.equals(var102.field2696)) {
                    var102.field2696 = var100;
                    method3247(var102);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 5) {
                while (field394.field1894 < field295) {
                    boolean var103 = field394.method2127() == 1;
                    String var104 = field394.method2166();
                    String var105 = field394.method2166();
                    int var106 = field394.method2129();
                    int var107 = field394.method2127();
                    int var108 = field394.method2127();
                    boolean var109 = (var108 & 0x2) != 0;
                    boolean var110 = (var108 & 0x1) != 0;
                    if (var106 > 0) {
                        field394.method2166();
                        field394.method2127();
                        field394.method2194();
                    }
                    field394.method2166();
                    for (int var111 = 0; var111 < field502; var111++) {
                        class17 var112 = field272[var111];
                        if (var103) {
                            if (var105.equals(var112.field225)) {
                                var112.field225 = var104;
                                var112.field219 = var105;
                                var104 = null;
                                break;
                            }
                        } else if (var104.equals(var112.field225)) {
                            if (var112.field220 != var106) {
                                boolean var113 = true;
                                for (class36 var114 = (class36) field533.method3278(); var114 != null; var114 = (class36) field533.method3279()) {
                                    if (var114.field799.equals(var104)) {
                                        if (var106 != 0 && var114.field806 == 0) {
                                            var114.method3408();
                                            var113 = false;
                                        } else if (var106 == 0 && var114.field806 != 0) {
                                            var114.method3408();
                                            var113 = false;
                                        }
                                    }
                                }
                                if (var113) {
                                    field533.method3277(new class36(var104, var106));
                                }
                                var112.field220 = var106;
                            }
                            var112.field219 = var105;
                            var112.field218 = var107;
                            var112.field222 = var109;
                            var112.field223 = var110;
                            var104 = null;
                            break;
                        }
                    }
                    if (var104 != null && field502 < 400) {
                        class17 var115 = new class17();
                        field272[field502] = var115;
                        var115.field225 = var104;
                        var115.field219 = var105;
                        var115.field220 = var106;
                        var115.field218 = var107;
                        var115.field222 = var109;
                        var115.field223 = var110;
                        field502++;
                    }
                }
                field524 = 2;
                field445 = field437;
                boolean var116 = false;
                int var117 = field502;
                while (var117 > 0) {
                    boolean var118 = true;
                    var117--;
                    for (int var119 = 0; var119 < var117; var119++) {
                        boolean var120 = false;
                        class17 var121 = field272[var119];
                        class17 var122 = field272[var119 + 1];
                        if (field478 != var121.field220 && field478 == var122.field220) {
                            var120 = true;
                        }
                        if (!var120 && var121.field220 == 0 && var122.field220 != 0) {
                            var120 = true;
                        }
                        if (!var120 && !var121.field222 && var122.field222) {
                            var120 = true;
                        }
                        if (!var120 && !var121.field223 && var122.field223) {
                            var120 = true;
                        }
                        if (var120) {
                            class17 var123 = field272[var119];
                            field272[var119] = field272[var119 + 1];
                            field272[var119 + 1] = var123;
                            var118 = false;
                        }
                    }
                    if (var118) {
                        break;
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 103) {
                int var124 = field394.method2171();
                int var125 = field394.method2161();
                class164 var126 = class164.method145(var124);
                if (var126 != null && var126.field2765 == 0) {
                    if (var125 > var126.field2750 - var126.field2654) {
                        var125 = var126.field2750 - var126.field2654;
                    }
                    if (var125 < 0) {
                        var125 = 0;
                    }
                    if (var126.field2630 != var125) {
                        var126.field2630 = var125;
                        method3247(var126);
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 162) {
                method615();
                field417 = field394.method2127();
                field449 = field437;
                field296 = -1;
                return true;
            }
            if (field296 == 41) {
                field405 = field437;
                if (field295 == 0) {
                    field488 = null;
                    field483 = null;
                    Statics.field802 = 0;
                    Statics.field2101 = null;
                    field296 = -1;
                    return true;
                }
                field483 = field394.method2166();
                long var127 = field394.method2133();
                field488 = class153.method1339(var127);
                Statics.field484 = field394.method2267();
                int var129 = field394.method2127();
                if (var129 == 255) {
                    field296 = -1;
                    return true;
                }
                Statics.field802 = var129;
                class23[] var130 = new class23[100];
                for (int var131 = 0; var131 < Statics.field802; var131++) {
                    var130[var131] = new class23();
                    var130[var131].field588 = field394.method2166();
                    var130[var131].field581 = class155.method2537(var130[var131].field588, Statics.field252);
                    var130[var131].field582 = field394.method2129();
                    var130[var131].field585 = field394.method2267();
                    field394.method2166();
                    if (var130[var131].field588.equals(Statics.field579.field33)) {
                        Statics.field2064 = var130[var131].field585;
                    }
                }
                boolean var132 = false;
                int var133 = Statics.field802;
                while (var133 > 0) {
                    boolean var134 = true;
                    var133--;
                    for (int var135 = 0; var135 < var133; var135++) {
                        if (var130[var135].field581.compareTo(var130[var135 + 1].field581) > 0) {
                            class23 var136 = var130[var135];
                            var130[var135] = var130[var135 + 1];
                            var130[var135 + 1] = var136;
                            var134 = false;
                        }
                    }
                    if (var134) {
                        break;
                    }
                }
                Statics.field2101 = var130;
                field296 = -1;
                return true;
            }
            if (field296 == 72) {
                method2788(false);
                field296 = -1;
                return true;
            }
            if (field296 == 83) {
                for (int var137 = 0; var137 < class167.field2786.length; var137++) {
                    if (class167.field2786[var137] != class167.field2785[var137]) {
                        class167.field2786[var137] = class167.field2785[var137];
                        method147(var137);
                        field438[++field468 - 1 & 0x1F] = var137;
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 138) {
                int var138 = field394.method2170();
                class164 var139 = class164.method145(var138);
                var139.field2679 = 3;
                var139.field2680 = Statics.field579.field29.method3030();
                method3247(var139);
                field296 = -1;
                return true;
            }
            if (field296 == 6) {
                int var140 = field394.method2194();
                int var141 = field394.method2129();
                if (var140 < -70000) {
                    var141 += 32768;
                }
                class164 var142;
                if (var140 >= 0) {
                    var142 = class164.method145(var140);
                } else {
                    var142 = null;
                }
                while (field394.field1894 < field295) {
                    int var143 = field394.method2140();
                    int var144 = field394.method2129();
                    int var145 = 0;
                    if (var144 != 0) {
                        var145 = field394.method2127();
                        if (var145 == 255) {
                            var145 = field394.method2194();
                        }
                    }
                    if (var142 != null && var143 >= 0 && var143 < var142.field2681.length) {
                        var142.field2681[var143] = var144;
                        var142.field2755[var143] = var145;
                    }
                    class15.method183(var141, var143, var144 - 1, var145);
                }
                if (var142 != null) {
                    method3247(var142);
                }
                method615();
                field440[++field362 - 1 & 0x1F] = var141 & 0x7FFF;
                field296 = -1;
                return true;
            }
            if (field296 == 36) {
                field526 = true;
                Statics.field1908 = field394.method2127();
                Statics.field177 = field394.method2127();
                Statics.field92 = field394.method2129();
                Statics.field622 = field394.method2127();
                Statics.field1385 = field394.method2127();
                if (Statics.field1385 >= 100) {
                    int var146 = Statics.field1908 * 128 + 64;
                    int var147 = Statics.field177 * 128 + 64;
                    int var148 = method655(var146, var147, Statics.field50) - Statics.field92;
                    int var149 = var146 - Statics.field1480;
                    int var150 = var148 - Statics.field491;
                    int var151 = var147 - Statics.field2530;
                    int var152 = (int) Math.sqrt((double) (var149 * var149 + var151 * var151));
                    Statics.field31 = (int) (Math.atan2((double) var150, (double) var152) * 325.949D) & 0x7FF;
                    Statics.field1896 = (int) (Math.atan2((double) var149, (double) var151) * -325.949D) & 0x7FF;
                    if (Statics.field31 < 128) {
                        Statics.field31 = 128;
                    }
                    if (Statics.field31 > 383) {
                        Statics.field31 = 383;
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 220) {
                Statics.field1024 = field394.method2153();
                Statics.field697 = field394.method2127();
                for (int var153 = Statics.field1024; var153 < Statics.field1024 + 8; var153++) {
                    for (int var154 = Statics.field697; var154 < Statics.field697 + 8; var154++) {
                        if (field385[Statics.field50][var153][var154] != null) {
                            field385[Statics.field50][var153][var154] = null;
                            method723(var153, var154);
                        }
                    }
                }
                for (class16 var155 = (class16) field386.method3324(); var155 != null; var155 = (class16) field386.method3326()) {
                    if (var155.field206 >= Statics.field1024 && var155.field206 < Statics.field1024 + 8 && var155.field214 >= Statics.field697 && var155.field214 < Statics.field697 + 8 && Statics.field50 == var155.field216) {
                        var155.field215 = 0;
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 255) {
                field333 = field394.method2127();
                field473 = field394.method2127();
                field296 = -1;
                return true;
            }
            if (field296 == 253) {
                int var156 = field394.method2302();
                Statics.field276 = Statics.field808.method2499(var156);
                field296 = -1;
                return true;
            }
            if (field296 == 247) {
                int var157 = field394.method2194();
                class4 var158 = (class4) field413.method3297((long) var157);
                if (var158 != null) {
                    method1084(var158, true);
                }
                if (field416 != null) {
                    method3247(field416);
                    field416 = null;
                }
                field296 = -1;
                return true;
            }
            if (field296 == 94) {
                int var159 = field394.method2214();
                if (var159 == 65535) {
                    var159 = -1;
                }
                method926(var159);
                field296 = -1;
                return true;
            }
            if (field296 == 231) {
                int var160 = field394.method2163();
                if (var160 == 65535) {
                    var160 = -1;
                }
                int var161 = field394.method2128();
                if (field493 != 0 && var160 != -1) {
                    class174.method3006(Statics.field2820, var160, 0, field493, false);
                    field495 = true;
                }
                field296 = -1;
                return true;
            }
            if (field296 == 16) {
                class202.method2814(field394, field295);
                field296 = -1;
                return true;
            }
            if (field296 == 212) {
                field393 = field394.method2127();
                if (field393 == 255) {
                    field393 = 0;
                }
                field446 = field394.method2127();
                if (field446 == 255) {
                    field446 = 0;
                }
                field296 = -1;
                return true;
            }
            if (field296 == 20) {
                method615();
                field251 = field394.method2130();
                field449 = field437;
                field296 = -1;
                return true;
            }
            if (field296 == 183) {
                for (int var162 = 0; var162 < field370.length; var162++) {
                    if (field370[var162] != null) {
                        field370[var162].field766 = -1;
                    }
                }
                for (int var163 = 0; var163 < field289.length; var163++) {
                    if (field289[var163] != null) {
                        field289[var163].field766 = -1;
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 237) {
                method615();
                int var164 = field394.method2127();
                int var165 = field394.method2194();
                int var166 = field394.method2127();
                field409[var166] = var165;
                field389[var166] = var164;
                field336[var166] = 1;
                for (int var167 = 0; var167 < 98; var167++) {
                    if (var165 >= class146.field2186[var167]) {
                        field336[var166] = var167 + 2;
                    }
                }
                field442[++field508 - 1 & 0x1F] = var166;
                field296 = -1;
                return true;
            }
            if (field296 == 10) {
                method920(true);
                field296 = -1;
                return true;
            }
            if (field296 == 37) {
                boolean var168 = field394.method2153() == 1;
                int var169 = field394.method2194();
                class164 var170 = class164.method145(var169);
                if (var170.field2658 != var168) {
                    var170.field2658 = var168;
                    method3247(var170);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 171) {
                int var171 = field394.method2127();
                int var172 = field394.method2132();
                String var173 = field394.method2166();
                if (var171 >= 1 && var171 <= 8) {
                    if (var173.equalsIgnoreCase("null")) {
                        var173 = null;
                    }
                    field381[var171 - 1] = var173;
                    field512[var171 - 1] = var172 == 0;
                }
                field296 = -1;
                return true;
            }
            if (field296 == 244) {
                Statics.field697 = field394.method2132();
                Statics.field1024 = field394.method2153();
                while (field394.field1894 < field295) {
                    field296 = field394.method2127();
                    method711();
                }
                field296 = -1;
                return true;
            }
            if (field296 == 23) {
                Statics.field1377 = class122.method709(field394.method2127());
                field296 = -1;
                return true;
            }
            if (field296 == 151) {
                field524 = 1;
                field445 = field437;
                field296 = -1;
                return true;
            }
            if (field296 == 121) {
                int var174 = field394.method2164();
                int var175 = field394.method2236();
                int var176 = field394.method2302();
                class164 var177 = class164.method145(var176);
                if (var177.field2647 != var175 || var177.field2720 != var174 || var177.field2643 != 0 || var177.field2644 != 0) {
                    var177.field2647 = var175;
                    var177.field2720 = var174;
                    var177.field2643 = 0;
                    var177.field2644 = 0;
                    method3247(var177);
                    method1857(var177);
                    if (var177.field2765 == 0) {
                        method169(Statics.field2726[var176 >> 16], var177, false);
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 39) {
                field443 = field394.method2127();
                field296 = -1;
                return true;
            }
            if (field296 == 62) {
                int var178 = field394.method2127();
                int var179 = field394.method2127();
                int var180 = field394.method2127();
                int var181 = field394.method2127();
                field505[var178] = true;
                field460[var178] = var179;
                field507[var178] = var180;
                field294[var178] = var181;
                field509[var178] = 0;
                field296 = -1;
                return true;
            }
            if (field296 == 234) {
                int var182 = field394.method2170();
                int var183 = field394.method2164();
                class164 var184 = class164.method145(var182);
                if (var184.field2683 != var183 || var183 == -1) {
                    var184.field2683 = var183;
                    var184.field2705 = 0;
                    var184.field2688 = 0;
                    method3247(var184);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 240) {
                String var185 = field394.method2166();
                long var186 = field394.method2133();
                long var188 = (long) field394.method2129();
                long var190 = (long) field394.method2131();
                class143 var192 = (class143) class101.method2555(class143.method563(), field394.method2127());
                long var193 = (var188 << 32) + var190;
                boolean var195 = false;
                for (int var196 = 0; var196 < 100; var196++) {
                    if (field476[var196] == var193) {
                        var195 = true;
                        break;
                    }
                }
                if (var192.field2162 && method99(var185)) {
                    var195 = true;
                }
                if (!var195 && field369 == 0) {
                    field476[field477] = var193;
                    field477 = (field477 + 1) % 100;
                    class114 var197 = field394;
                    String var198 = class213.method3234(var197, 32767);
                    String var199 = class214.method3616(class154.method616(var198));
                    if (var192.field2160 == -1) {
                        class11.method498(9, var185, var199, class153.method2453(var186));
                    } else {
                        class11.method498(9, class2.method2738(var192.field2160) + var185, var199, class153.method2453(var186));
                    }
                }
                field296 = -1;
                return true;
            }
            if (field296 == 12) {
                method920(false);
                field296 = -1;
                return true;
            }
            if (field296 == 58) {
                int var200 = field394.method2170();
                int var201 = field394.method2170();
                class4 var202 = (class4) field413.method3297((long) var200);
                class4 var203 = (class4) field413.method3297((long) var201);
                if (var203 != null) {
                    method1084(var203, var202 == null || var202.field58 != var203.field58);
                }
                if (var202 != null) {
                    var202.method3414();
                    field413.method3288(var202, (long) var201);
                }
                class164 var204 = class164.method145(var200);
                if (var204 != null) {
                    method3247(var204);
                }
                class164 var205 = class164.method145(var201);
                if (var205 != null) {
                    method3247(var205);
                    method169(Statics.field2726[var205.field2684 >>> 16], var205, true);
                }
                if (field306 != -1) {
                    method1859(field306, 1);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 17 || field296 == 205 || field296 == 147 || field296 == 114 || field296 == 82 || field296 == 53 || field296 == 122 || field296 == 232 || field296 == 241 || field296 == 22) {
                method711();
                field296 = -1;
                return true;
            }
            if (field296 == 218) {
                int var206 = field394.method2140();
                boolean var207 = field394.method2127() == 1;
                String var208 = "";
                boolean var209 = false;
                if (var207) {
                    var208 = field394.method2166();
                    if (method99(var208)) {
                        var209 = true;
                    }
                }
                String var210 = field394.method2166();
                if (!var209) {
                    class11.method2070(var206, var208, var210);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 92) {
                field267 = field394.method2127();
                if (field267 == 1) {
                    field339 = field394.method2129();
                }
                if (field267 >= 2 && field267 <= 6) {
                    if (field267 == 2) {
                        field273 = 64;
                        field274 = 64;
                    }
                    if (field267 == 3) {
                        field273 = 0;
                        field274 = 64;
                    }
                    if (field267 == 4) {
                        field273 = 128;
                        field274 = 64;
                    }
                    if (field267 == 5) {
                        field273 = 64;
                        field274 = 0;
                    }
                    if (field267 == 6) {
                        field273 = 64;
                        field274 = 128;
                    }
                    field267 = 2;
                    field270 = field394.method2129();
                    field324 = field394.method2129();
                    field331 = field394.method2127();
                }
                if (field267 == 10) {
                    field269 = field394.method2129();
                }
                field296 = -1;
                return true;
            }
            if (field296 == 56) {
                method2788(true);
                field296 = -1;
                return true;
            }
            if (field296 == 145) {
                field526 = true;
                Statics.field699 = field394.method2127();
                Statics.field1315 = field394.method2127();
                Statics.field2063 = field394.method2129();
                Statics.field1287 = field394.method2127();
                Statics.field1933 = field394.method2127();
                if (Statics.field1933 >= 100) {
                    Statics.field1480 = Statics.field699 * 128 + 64;
                    Statics.field2530 = Statics.field1315 * 128 + 64;
                    Statics.field491 = method655(Statics.field1480, Statics.field2530, Statics.field50) - Statics.field2063;
                }
                field296 = -1;
                return true;
            }
            if (field296 == 159) {
                int var211 = field394.method2194();
                int var212 = field394.method2163();
                if (var212 == 65535) {
                    var212 = -1;
                }
                int var213 = field394.method2302();
                int var214 = field394.method2161();
                if (var214 == 65535) {
                    var214 = -1;
                }
                for (int var215 = var214; var215 <= var212; var215++) {
                    long var216 = ((long) var211 << 32) + (long) var215;
                    class199 var218 = field456.method3297(var216);
                    if (var218 != null) {
                        var218.method3414();
                    }
                    field456.method3288(new class192(var213), var216);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 137) {
                field523 = field394.method2161() * 30;
                field449 = field437;
                field296 = -1;
                return true;
            }
            if (field296 == 57) {
                int var219 = field394.method2127();
                if (field394.method2127() == 0) {
                    field392[var219] = new class211();
                    field394.field1894 += 18;
                } else {
                    field394.field1894--;
                    field392[var219] = new class211(field394, false);
                }
                field421 = field437;
                field296 = -1;
                return true;
            }
            if (field296 == 190) {
                int var220 = field394.method2132();
                int var221 = field394.method2132();
                int var222 = field394.method2209();
                Statics.field50 = var220 >> 1;
                Statics.field579.method619(var221, var222, (var220 & 0x1) == 1);
                field296 = -1;
                return true;
            }
            if (field296 == 0) {
                int var223 = field394.method2127();
                int var224 = field394.method2214();
                int var225 = field394.method2170();
                class4 var226 = (class4) field413.method3297((long) var225);
                if (var226 != null) {
                    method1084(var226, var226.field58 != var224);
                }
                Statics.method1583(var225, var224, var223);
                field296 = -1;
                return true;
            }
            if (field296 == 178) {
                class24 var227 = new class24();
                var227.field593 = field394.method2166();
                var227.field594 = field394.method2129();
                int var228 = field394.method2194();
                var227.field591 = var228;
                method565(45);
                Statics.field2037.method2589();
                Statics.field2037 = null;
                class30.method31(var227);
                field296 = -1;
                return false;
            }
            if (field296 == 15) {
                int var229 = field394.method2163();
                int var230 = field394.method2302();
                int var231 = field394.method2214();
                class164 var232 = class164.method145(var230);
                var232.field2689 = (var229 << 16) + var231;
                field296 = -1;
                return true;
            }
            if (field296 == 127) {
                int var233 = field394.method2170();
                int var234 = field394.method2163();
                class167.field2785[var234] = var233;
                if (class167.field2786[var234] != var233) {
                    class167.field2786[var234] = var233;
                    method147(var234);
                }
                field438[++field468 - 1 & 0x1F] = var234;
                field296 = -1;
                return true;
            }
            if (field296 == 170) {
                int var235 = field394.method2161();
                if (var235 == 65535) {
                    var235 = -1;
                }
                int var236 = field394.method2170();
                int var237 = field394.method2171();
                class164 var238 = class164.method145(var236);
                if (var238.field2648) {
                    var238.field2639 = var235;
                    var238.field2677 = var237;
                    class47 var240 = class47.method1037(var235);
                    var238.field2687 = var240.field1043;
                    var238.field2662 = var240.field1047;
                    var238.field2758 = var240.field1048;
                    var238.field2685 = var240.field1056;
                    var238.field2686 = var240.field1050;
                    var238.field2690 = var240.field1065;
                    if (var240.field1051 == 1) {
                        var238.field2694 = 1;
                    } else {
                        var238.field2694 = 2;
                    }
                    if (var238.field2760 > 0) {
                        var238.field2690 = var238.field2690 * 32 / var238.field2760;
                    } else if (var238.field2649 > 0) {
                        var238.field2690 = var238.field2690 * 32 / var238.field2649;
                    }
                    method3247(var238);
                } else if (var235 == -1) {
                    var238.field2679 = 0;
                    field296 = -1;
                    return true;
                } else {
                    class47 var239 = class47.method1037(var235);
                    var238.field2679 = 4;
                    var238.field2680 = var235;
                    var238.field2687 = var239.field1043;
                    var238.field2662 = var239.field1047;
                    var238.field2690 = var239.field1065 * 100 / var237;
                    method3247(var238);
                }
                field296 = -1;
                return true;
            }
            if (field296 == 76) {
                Statics.field697 = field394.method2153();
                Statics.field1024 = field394.method2209();
                field296 = -1;
                return true;
            }
            if (field296 == 248) {
                int var241 = field394.method2214();
                field306 = var241;
                int var242 = field306;
                int var243 = Statics.field56;
                int var244 = Statics.field2528;
                if (class164.method2749(var242)) {
                    method25(Statics.field2726[var242], -1, var243, var244, false);
                }
                method2536(var241);
                class34.method2052(field306);
                for (int var245 = 0; var245 < 100; var245++) {
                    field492[var245] = true;
                }
                field296 = -1;
                return true;
            }
            if (field296 == 44) {
                String var246 = field394.method2166();
                Object[] var247 = new Object[var246.length() + 1];
                for (int var248 = var246.length() - 1; var248 >= 0; var248--) {
                    if (var246.charAt(var248) == 's') {
                        var247[var248 + 1] = field394.method2166();
                    } else {
                        var247[var248 + 1] = Integer.valueOf(field394.method2194());
                    }
                }
                var247[0] = Integer.valueOf(field394.method2194());
                class1 var249 = new class1();
                var249.field5 = var247;
                class34.method152(var249, 200000);
                field296 = -1;
                return true;
            }
            if (field296 == 252) {
                while (field394.field1894 < field295) {
                    int var250 = field394.method2127();
                    boolean var251 = (var250 & 0x1) == 1;
                    String var252 = field394.method2166();
                    String var253 = field394.method2166();
                    field394.method2166();
                    for (int var254 = 0; var254 < field318; var254++) {
                        class8 var255 = field528[var254];
                        if (var251) {
                            if (var253.equals(var255.field119)) {
                                var255.field119 = var252;
                                var255.field124 = var253;
                                var252 = null;
                                break;
                            }
                        } else if (var252.equals(var255.field119)) {
                            var255.field119 = var252;
                            var255.field124 = var253;
                            var252 = null;
                            break;
                        }
                    }
                    if (var252 != null && field318 < 400) {
                        class8 var256 = new class8();
                        field528[field318] = var256;
                        var256.field119 = var252;
                        var256.field124 = var253;
                        field318++;
                    }
                }
                field445 = field437;
                field296 = -1;
                return true;
            }
            class140.method2489("" + field296 + class2.field16 + field301 + class2.field16 + field356 + class2.field16 + field295, (Throwable) null);
            method3243();
        } catch (IOException var262) {
            method2414();
        } catch (Exception var263) {
            String var259 = "" + field296 + class2.field16 + field301 + class2.field16 + field356 + class2.field16 + field295 + class2.field16 + (Statics.field1912 + Statics.field579.field789[0]) + class2.field16 + (Statics.field1084 + Statics.field579.field790[0]) + class2.field16;
            for (int var260 = 0; var260 < field295 && var260 < 50; var260++) {
                var259 = var259 + field394.field1897[var260] + class2.field16;
            }
            class140.method2489(var259, var263);
            method3243();
        }
        return true;
    }

    @ObfuscatedName("am.bk(I)V")
    public static final void method711() {
        if (field296 == 232) {
            int var0 = field394.method2214();
            int var1 = field394.method2132();
            int var2 = (var1 >> 4 & 0x7) + Statics.field1024;
            int var3 = (var1 & 0x7) + Statics.field697;
            int var4 = field394.method2132();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field313[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 103 && var3 < 103) {
                if (var7 == 0) {
                    class82 var8 = Statics.field619.method1610(Statics.field50, var2, var3);
                    if (var8 != null) {
                        int var9 = var8.field1455 >> 14 & 0x7FFF;
                        if (var5 == 2) {
                            var8.field1453 = new class12(var9, 2, var6 + 4, Statics.field50, var2, var3, var0, false, var8.field1453);
                            var8.field1454 = new class12(var9, 2, var6 + 1 & 0x3, Statics.field50, var2, var3, var0, false, var8.field1454);
                        } else {
                            var8.field1453 = new class12(var9, var5, var6, Statics.field50, var2, var3, var0, false, var8.field1453);
                        }
                    }
                }
                if (var7 == 1) {
                    class89 var10 = Statics.field619.method1611(Statics.field50, var2, var3);
                    if (var10 != null) {
                        int var11 = var10.field1542 >> 14 & 0x7FFF;
                        if (var5 == 4 || var5 == 5) {
                            var10.field1537 = new class12(var11, 4, var6, Statics.field50, var2, var3, var0, false, var10.field1537);
                        } else if (var5 == 6) {
                            var10.field1537 = new class12(var11, 4, var6 + 4, Statics.field50, var2, var3, var0, false, var10.field1537);
                        } else if (var5 == 7) {
                            var10.field1537 = new class12(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field50, var2, var3, var0, false, var10.field1537);
                        } else if (var5 == 8) {
                            var10.field1537 = new class12(var11, 4, var6 + 4, Statics.field50, var2, var3, var0, false, var10.field1537);
                            var10.field1539 = new class12(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field50, var2, var3, var0, false, var10.field1539);
                        }
                    }
                }
                if (var7 == 2) {
                    class93 var12 = Statics.field619.method1609(Statics.field50, var2, var3);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var12 != null) {
                        var12.field1594 = new class12(var12.field1602 >> 14 & 0x7FFF, var5, var6, Statics.field50, var2, var3, var0, false, var12.field1594);
                    }
                }
                if (var7 == 3) {
                    class88 var13 = Statics.field619.method1587(Statics.field50, var2, var3);
                    if (var13 != null) {
                        var13.field1519 = new class12(var13.field1521 >> 14 & 0x7FFF, 22, var6, Statics.field50, var2, var3, var0, false, var13.field1519);
                    }
                }
            }
        } else if (field296 == 82) {
            int var14 = field394.method2127();
            int var15 = (var14 >> 4 & 0x7) + Statics.field1024;
            int var16 = (var14 & 0x7) + Statics.field697;
            int var17 = var15 + field394.method2267();
            int var18 = var16 + field394.method2267();
            int var19 = field394.method2130();
            int var20 = field394.method2129();
            int var21 = field394.method2127() * 4;
            int var22 = field394.method2127() * 4;
            int var23 = field394.method2129();
            int var24 = field394.method2129();
            int var25 = field394.method2127();
            int var26 = field394.method2127();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var20 != 65535) {
                int var27 = var15 * 128 + 64;
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                class7 var31 = new class7(var20, Statics.field50, var27, var28, method655(var27, var28, Statics.field50) - var21, field259 + var23, field259 + var24, var25, var26, var19, var22);
                var31.method92(var29, var30, method655(var29, var30, Statics.field50) - var22, field259 + var23);
                field387.method3319(var31);
            }
        } else if (field296 == 241) {
            int var32 = field394.method2127();
            int var33 = var32 >> 2;
            int var34 = var32 & 0x3;
            int var35 = field313[var33];
            int var36 = field394.method2153();
            int var37 = (var36 >> 4 & 0x7) + Statics.field1024;
            int var38 = (var36 & 0x7) + Statics.field697;
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                method28(Statics.field50, var37, var38, var35, -1, var33, var34, 0, -1);
            }
        } else {
            if (field296 == 147) {
                int var39 = field394.method2161();
                int var40 = field394.method2209();
                int var41 = (var40 >> 4 & 0x7) + Statics.field1024;
                int var42 = (var40 & 0x7) + Statics.field697;
                byte var43 = field394.method2267();
                int var44 = field394.method2161();
                int var45 = field394.method2214();
                byte var46 = field394.method2156();
                int var47 = field394.method2127();
                int var48 = var47 >> 2;
                int var49 = var47 & 0x3;
                int var50 = field313[var48];
                byte var51 = field394.method2156();
                int var52 = field394.method2214();
                byte var53 = field394.method2157();
                class3 var54;
                if (field482 == var45) {
                    var54 = Statics.field579;
                } else {
                    var54 = field370[var45];
                }
                if (var54 != null) {
                    class38 var55 = class38.method1770(var39);
                    int var56;
                    int var57;
                    if (var49 == 1 || var49 == 3) {
                        var56 = var55.field852;
                        var57 = var55.field864;
                    } else {
                        var56 = var55.field864;
                        var57 = var55.field852;
                    }
                    int var58 = (var56 >> 1) + var41;
                    int var59 = (var56 + 1 >> 1) + var41;
                    int var60 = (var57 >> 1) + var42;
                    int var61 = (var57 + 1 >> 1) + var42;
                    int[][] var62 = class6.field73[Statics.field50];
                    int var63 = var62[var58][var60] + var62[var59][var60] + var62[var58][var61] + var62[var59][var61] >> 2;
                    int var64 = (var41 << 7) + (var56 << 6);
                    int var65 = (var42 << 7) + (var57 << 6);
                    class100 var66 = var55.method676(var48, var49, var62, var64, var63, var65);
                    if (var66 != null) {
                        method28(Statics.field50, var41, var42, var50, -1, 0, 0, var52 + 1, var44 + 1);
                        var54.field43 = field259 + var52;
                        var54.field48 = field259 + var44;
                        var54.field40 = var66;
                        var54.field37 = var41 * 128 + var56 * 64;
                        var54.field39 = var42 * 128 + var57 * 64;
                        var54.field38 = var63;
                        if (var51 > var43) {
                            byte var67 = var51;
                            var51 = var43;
                            var43 = var67;
                        }
                        if (var53 > var46) {
                            byte var68 = var53;
                            var53 = var46;
                            var46 = var68;
                        }
                        var54.field41 = var41 + var51;
                        var54.field51 = var41 + var43;
                        var54.field42 = var42 + var53;
                        var54.field44 = var42 + var46;
                    }
                }
            }
            if (field296 == 205) {
                int var69 = field394.method2127();
                int var70 = (var69 >> 4 & 0x7) + Statics.field1024;
                int var71 = (var69 & 0x7) + Statics.field697;
                int var72 = field394.method2129();
                int var73 = field394.method2129();
                int var74 = field394.method2129();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    class190 var75 = field385[Statics.field50][var70][var71];
                    if (var75 != null) {
                        for (class27 var76 = (class27) var75.method3324(); var76 != null; var76 = (class27) var75.method3326()) {
                            if ((var72 & 0x7FFF) == var76.field630 && var76.field632 == var73) {
                                var76.field632 = var74;
                                break;
                            }
                        }
                        method723(var70, var71);
                    }
                }
            } else if (field296 == 114) {
                int var77 = field394.method2127();
                int var78 = (var77 >> 4 & 0x7) + Statics.field1024;
                int var79 = (var77 & 0x7) + Statics.field697;
                int var80 = field394.method2129();
                int var81 = field394.method2127();
                int var82 = field394.method2129();
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    int var83 = var78 * 128 + 64;
                    int var84 = var79 * 128 + 64;
                    class28 var85 = new class28(var80, Statics.field50, var83, var84, method655(var83, var84, Statics.field50) - var81, var82, field259);
                    field519.method3319(var85);
                }
            } else {
                if (field296 == 17) {
                    int var86 = field394.method2127();
                    int var87 = (var86 >> 4 & 0x7) + Statics.field1024;
                    int var88 = (var86 & 0x7) + Statics.field697;
                    int var89 = field394.method2129();
                    int var90 = field394.method2127();
                    int var91 = var90 >> 4 & 0xF;
                    int var92 = var90 & 0x7;
                    int var93 = field394.method2127();
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        int var94 = var91 + 1;
                        if (Statics.field579.field789[0] >= var87 - var94 && Statics.field579.field789[0] <= var87 + var94 && Statics.field579.field790[0] >= var88 - var94 && Statics.field579.field790[0] <= var88 + var94 && field375 != 0 && var92 > 0 && field498 < 50) {
                            field286[field498] = var89;
                            field500[field498] = var92;
                            field501[field498] = var93;
                            field503[field498] = null;
                            field423[field498] = (var87 << 16) + (var88 << 8) + var91;
                            field498++;
                        }
                    }
                }
                if (field296 == 122) {
                    int var95 = field394.method2163();
                    int var96 = field394.method2153();
                    int var97 = (var96 >> 4 & 0x7) + Statics.field1024;
                    int var98 = (var96 & 0x7) + Statics.field697;
                    int var99 = field394.method2129();
                    if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                        class27 var100 = new class27();
                        var100.field630 = var95;
                        var100.field632 = var99;
                        if (field385[Statics.field50][var97][var98] == null) {
                            field385[Statics.field50][var97][var98] = new class190();
                        }
                        field385[Statics.field50][var97][var98].method3319(var100);
                        method723(var97, var98);
                    }
                } else if (field296 == 22) {
                    int var101 = field394.method2214();
                    int var102 = field394.method2127();
                    int var103 = var102 >> 2;
                    int var104 = var102 & 0x3;
                    int var105 = field313[var103];
                    int var106 = field394.method2132();
                    int var107 = (var106 >> 4 & 0x7) + Statics.field1024;
                    int var108 = (var106 & 0x7) + Statics.field697;
                    if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                        method28(Statics.field50, var107, var108, var105, var101, var103, var104, 0, -1);
                    }
                } else if (field296 == 53) {
                    int var109 = field394.method2209();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field1024;
                    int var111 = (var109 & 0x7) + Statics.field697;
                    int var112 = field394.method2129();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class190 var113 = field385[Statics.field50][var110][var111];
                        if (var113 != null) {
                            for (class27 var114 = (class27) var113.method3324(); var114 != null; var114 = (class27) var113.method3326()) {
                                if ((var112 & 0x7FFF) == var114.field630) {
                                    var114.method3414();
                                    break;
                                }
                            }
                            if (var113.method3324() == null) {
                                field385[Statics.field50][var110][var111] = null;
                            }
                            method723(var110, var111);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.bs(IIIIIIIIIS)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field386.method3324(); var10 != null; var10 = (class16) field386.method3326()) {
            if (var10.field216 == arg0 && var10.field206 == arg1 && var10.field214 == arg2 && var10.field205 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field216 = arg0;
            var9.field205 = arg3;
            var9.field206 = arg1;
            var9.field214 = arg2;
            method556(var9);
            field386.method3319(var9);
        }
        var9.field211 = arg4;
        var9.field213 = arg5;
        var9.field204 = arg6;
        var9.field212 = arg7;
        var9.field215 = arg8;
    }

    @ObfuscatedName("ay.bo(I)V")
    public static final void method867() {
        for (class16 var0 = (class16) field386.method3324(); var0 != null; var0 = (class16) field386.method3326()) {
            if (var0.field215 == -1) {
                var0.field212 = 0;
                method556(var0);
            } else {
                var0.method3414();
            }
        }
    }

    @ObfuscatedName("ax.bp(Ls;B)V")
    public static final void method556(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field205 == 0) {
            var1 = Statics.field619.method1614(arg0.field216, arg0.field206, arg0.field214);
        }
        if (arg0.field205 == 1) {
            var1 = Statics.field619.method1615(arg0.field216, arg0.field206, arg0.field214);
        }
        if (arg0.field205 == 2) {
            var1 = Statics.field619.method1616(arg0.field216, arg0.field206, arg0.field214);
        }
        if (arg0.field205 == 3) {
            var1 = Statics.field619.method1617(arg0.field216, arg0.field206, arg0.field214);
        }
        if (var1 != 0) {
            int var5 = Statics.field619.method1618(arg0.field216, arg0.field206, arg0.field214, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field208 = var2;
        arg0.field210 = var3;
        arg0.field209 = var4;
    }

    @ObfuscatedName("co.by(I)V")
    public static final void method1875() {
        for (class16 var0 = (class16) field386.method3324(); var0 != null; var0 = (class16) field386.method3326()) {
            if (var0.field215 > 0) {
                var0.field215--;
            }
            if (var0.field215 == 0) {
                if (var0.field208 >= 0) {
                    int var1 = var0.field208;
                    int var2 = var0.field210;
                    class38 var3 = class38.method1770(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method673(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method122(var0.field216, var0.field205, var0.field206, var0.field214, var0.field208, var0.field209, var0.field210);
                var0.method3414();
            } else {
                if (var0.field212 > 0) {
                    var0.field212--;
                }
                if (var0.field212 == 0 && var0.field206 >= 1 && var0.field214 >= 1 && var0.field206 <= 102 && var0.field214 <= 102) {
                    if (var0.field211 >= 0) {
                        int var5 = var0.field211;
                        int var6 = var0.field213;
                        class38 var7 = class38.method1770(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method673(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method122(var0.field216, var0.field205, var0.field206, var0.field214, var0.field211, var0.field204, var0.field213);
                    var0.field212 = -1;
                    if (var0.field211 == var0.field208 && var0.field208 == -1) {
                        var0.method3414();
                    } else if (var0.field211 == var0.field208 && var0.field209 == var0.field204 && var0.field213 == var0.field210) {
                        var0.method3414();
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.bc(IIIIIIII)V")
    public static final void method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field254 && Statics.field50 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field619.method1614(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field619.method1615(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field619.method1616(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field619.method1617(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field619.method1618(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field619.method1605(arg0, arg2, arg3);
                class38 var15 = class38.method1770(var12);
                if (var15.field866 != 0) {
                    field310[arg0].method3679(arg2, arg3, var13, var14, var15.field867);
                }
            }
            if (arg1 == 1) {
                Statics.field619.method1674(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field619.method1607(arg0, arg2, arg3);
                class38 var16 = class38.method1770(var12);
                if (var16.field864 + arg2 > 103 || var16.field864 + arg3 > 103 || var16.field852 + arg2 > 103 || var16.field852 + arg3 > 103) {
                    return;
                }
                if (var16.field866 != 0) {
                    field310[arg0].method3680(arg2, arg3, var16.field864, var16.field852, var14, var16.field867);
                }
            }
            if (arg1 == 3) {
                Statics.field619.method1608(arg0, arg2, arg3);
                class38 var17 = class38.method1770(var12);
                if (var17.field866 == 1) {
                    field310[arg0].method3682(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field81[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method604(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field619, field310[arg0]);
    }

    @ObfuscatedName("aa.bn(III)V")
    public static final void method723(int arg0, int arg1) {
        class190 var2 = field385[Statics.field50][arg0][arg1];
        if (var2 == null) {
            Statics.field619.method1673(Statics.field50, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3324(); var6 != null; var6 = (class27) var2.method3326()) {
            class47 var7 = class47.method1037(var6.field630);
            long var8 = (long) var7.field1049;
            if (var7.field1051 == 1) {
                var8 = (long) (var6.field632 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field619.method1673(Statics.field50, arg0, arg1);
            return;
        }
        var2.method3320(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3324(); var12 != null; var12 = (class27) var2.method3326()) {
            if (var5.field630 != var12.field630) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field630 != var12.field630 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field619.method1595(Statics.field50, arg0, arg1, method655(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field50), var5, var13, var10, var11);
    }

    @ObfuscatedName("ah.bt(S)V")
    public static final void method806() {
        field378 = 0;
        field373 = 0;
        field394.method2379();
        int var0 = field394.method2380(1);
        if (var0 != 0) {
            int var1 = field394.method2380(2);
            if (var1 == 0) {
                field374[++field373 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field394.method2380(3);
                Statics.field579.method620(var2, false);
                int var3 = field394.method2380(1);
                if (var3 == 1) {
                    field374[++field373 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field394.method2380(3);
                Statics.field579.method620(var4, true);
                int var5 = field394.method2380(3);
                Statics.field579.method620(var5, true);
                int var6 = field394.method2380(1);
                if (var6 == 1) {
                    field374[++field373 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field394.method2380(1);
                if (var7 == 1) {
                    field374[++field373 - 1] = 2047;
                }
                int var8 = field394.method2380(7);
                Statics.field50 = field394.method2380(2);
                int var9 = field394.method2380(7);
                int var10 = field394.method2380(1);
                Statics.field579.method619(var9, var8, var10 == 1);
            }
        }
        method3248();
        while (field394.method2382(field295) >= 11) {
            int var11 = field394.method2380(11);
            if (var11 == 2047) {
                break;
            }
            boolean var15 = false;
            if (field370[var11] == null) {
                field370[var11] = new class3();
                if (field282[var11] != null) {
                    field370[var11].method15(field282[var11]);
                }
                var15 = true;
            }
            field391[++field371 - 1] = var11;
            class3 var16 = field370[var11];
            var16.field745 = field259;
            int var17 = field394.method2380(5);
            if (var17 > 15) {
                var17 -= 32;
            }
            int var18 = field383[field394.method2380(3)];
            if (var15) {
                var16.field777 = var16.field785 = var18;
            }
            int var19 = field394.method2380(1);
            int var20 = field394.method2380(5);
            if (var20 > 15) {
                var20 -= 32;
            }
            int var21 = field394.method2380(1);
            if (var21 == 1) {
                field374[++field373 - 1] = var11;
            }
            var16.method619(Statics.field579.field789[0] + var20, Statics.field579.field790[0] + var17, var19 == 1);
        }
        field394.method2390();
        Statics.method3246();
        for (int var12 = 0; var12 < field378; var12++) {
            int var13 = field379[var12];
            if (field259 != field370[var13].field745) {
                field370[var13] = null;
            }
        }
        if (field295 != field394.field1894) {
            throw new RuntimeException(field394.field1894 + class2.field16 + field295);
        }
        for (int var14 = 0; var14 < field371; var14++) {
            if (field370[field391[var14]] == null) {
                throw new RuntimeException(var14 + class2.field16 + field371);
            }
        }
    }

    @ObfuscatedName("fa.bm(I)V")
    public static final void method3248() {
        int var0 = field394.method2380(8);
        if (var0 < field371) {
            for (int var1 = var0; var1 < field371; var1++) {
                field379[++field378 - 1] = field391[var1];
            }
        }
        if (var0 > field371) {
            throw new RuntimeException("");
        }
        field371 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field391[var2];
            class3 var4 = field370[var3];
            int var5 = field394.method2380(1);
            if (var5 == 0) {
                field391[++field371 - 1] = var3;
                var4.field745 = field259;
            } else {
                int var6 = field394.method2380(2);
                if (var6 == 0) {
                    field391[++field371 - 1] = var3;
                    var4.field745 = field259;
                    field374[++field373 - 1] = var3;
                } else if (var6 == 1) {
                    field391[++field371 - 1] = var3;
                    var4.field745 = field259;
                    int var7 = field394.method2380(3);
                    var4.method620(var7, false);
                    int var8 = field394.method2380(1);
                    if (var8 == 1) {
                        field374[++field373 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field391[++field371 - 1] = var3;
                    var4.field745 = field259;
                    int var9 = field394.method2380(3);
                    var4.method620(var9, true);
                    int var10 = field394.method2380(3);
                    var4.method620(var10, true);
                    int var11 = field394.method2380(1);
                    if (var11 == 1) {
                        field374[++field373 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field379[++field378 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("client.bx(ILa;II)V")
    public static final void method271(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x8) != 0) {
            int var3 = field394.method2129();
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = field394.method2209();
            method1961(arg1, var3, var4);
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field760 = field394.method2129();
            if (arg1.field760 == 65535) {
                arg1.field760 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var5 = field394.method2214();
            class143 var6 = (class143) class101.method2555(class143.method563(), field394.method2209());
            boolean var7 = field394.method2132() == 1;
            int var8 = field394.method2209();
            int var9 = field394.field1894;
            if (arg1.field33 != null && arg1.field29 != null) {
                boolean var10 = false;
                if (var6.field2162 && method99(arg1.field33)) {
                    var10 = true;
                }
                if (!var10 && field369 == 0 && !arg1.field47) {
                    field459.field1894 = 0;
                    field394.method2312(field459.field1897, 0, var8);
                    field459.field1894 = 0;
                    String var11 = class214.method3616(class154.method616(class213.method3469(field459)));
                    arg1.field764 = var11.trim();
                    arg1.field755 = var5 >> 8;
                    arg1.field736 = var5 & 0xFF;
                    arg1.field751 = 150;
                    arg1.field773 = var7;
                    arg1.field758 = Statics.field579 != arg1 && var6.field2162 && field309 != "" && var11.toLowerCase().indexOf(field309) == -1;
                    int var12;
                    if (var6.field2161) {
                        var12 = var7 ? 91 : 1;
                    } else {
                        var12 = var7 ? 90 : 2;
                    }
                    if (var6.field2160 == -1) {
                        class11.method2070(var12, arg1.field33, var11);
                    } else {
                        class11.method2070(var12, class2.method2738(var6.field2160) + arg1.field33, var11);
                    }
                }
            }
            field394.field1894 = var8 + var9;
        }
        if ((arg2 & 0x400) != 0) {
            int var13 = field394.method2163();
            int var14 = field394.method2132();
            arg1.method629(var13, var14, field259);
            arg1.field757 = field259 + 300;
            arg1.field771 = field394.method2132();
            arg1.field759 = field394.method2209();
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field764 = field394.method2166();
            if (arg1.field764.charAt(0) == '~') {
                arg1.field764 = arg1.field764.substring(1);
                class11.method2070(2, arg1.field33, arg1.field764);
            } else if (Statics.field579 == arg1) {
                class11.method2070(2, arg1.field33, arg1.field764);
            }
            arg1.field773 = false;
            arg1.field755 = 0;
            arg1.field736 = 0;
            arg1.field751 = 150;
        }
        if ((arg2 & 0x20) != 0) {
            int var15 = field394.method2132();
            byte[] var16 = new byte[var15];
            class111 var17 = new class111(var16);
            field394.method2329(var16, 0, var15);
            field282[arg0] = var17;
            arg1.method15(var17);
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field753 = field394.method2163();
            arg1.field762 = field394.method2163();
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field748 = field394.method2163();
            int var18 = field394.method2194();
            arg1.field775 = var18 >> 16;
            arg1.field740 = (var18 & 0xFFFF) + field259;
            arg1.field772 = 0;
            arg1.field784 = 0;
            if (arg1.field740 > field259) {
                arg1.field772 = -1;
            }
            if (arg1.field748 == 65535) {
                arg1.field748 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field776 = field394.method2132();
            arg1.field778 = field394.method2132();
            arg1.field774 = field394.method2209();
            arg1.field779 = field394.method2209();
            arg1.field780 = field394.method2129() + field259;
            arg1.field781 = field394.method2161() + field259;
            arg1.field782 = field394.method2153();
            arg1.field788 = 1;
            arg1.field737 = 0;
        }
        if ((arg2 & 0x1) == 0) {
            return;
        }
        int var19 = field394.method2214();
        int var20 = field394.method2153();
        arg1.method629(var19, var20, field259);
        arg1.field757 = field259 + 300;
        arg1.field771 = field394.method2127();
        arg1.field759 = field394.method2132();
    }

    @ObfuscatedName("ad.ba(ZI)V")
    public static final void method920(boolean arg0) {
        field378 = 0;
        field373 = 0;
        method121();
        while (field394.method2382(field295) >= 27) {
            int var1 = field394.method2380(15);
            if (var1 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field289[var1] == null) {
                field289[var1] = new class32();
                var17 = true;
            }
            class32 var18 = field289[var1];
            field291[++field290 - 1] = var1;
            var18.field745 = field259;
            var18.field705 = class37.method890(field394.method2380(14));
            int var19 = field383[field394.method2380(3)];
            if (var17) {
                var18.field777 = var18.field785 = var19;
            }
            int var20 = field394.method2380(1);
            int var21;
            if (arg0) {
                var21 = field394.method2380(8);
                if (var21 > 127) {
                    var21 -= 256;
                }
            } else {
                var21 = field394.method2380(5);
                if (var21 > 15) {
                    var21 -= 32;
                }
            }
            int var22;
            if (arg0) {
                var22 = field394.method2380(8);
                if (var22 > 127) {
                    var22 -= 256;
                }
            } else {
                var22 = field394.method2380(5);
                if (var22 > 15) {
                    var22 -= 32;
                }
            }
            int var23 = field394.method2380(1);
            if (var23 == 1) {
                field374[++field373 - 1] = var1;
            }
            var18.field739 = var18.field705.field819;
            var18.field787 = var18.field705.field815;
            if (var18.field787 == 0) {
                var18.field785 = 0;
            }
            var18.field743 = var18.field705.field818;
            var18.field744 = var18.field705.field827;
            var18.field756 = var18.field705.field810;
            var18.field746 = var18.field705.field822;
            var18.field793 = var18.field705.field816;
            var18.field741 = var18.field705.field817;
            var18.field742 = var18.field705.field809;
            var18.method619(Statics.field579.field789[0] + var22, Statics.field579.field790[0] + var21, var20 == 1);
        }
        field394.method2390();
        for (int var2 = 0; var2 < field373; var2++) {
            int var3 = field374[var2];
            class32 var4 = field289[var3];
            int var5 = field394.method2127();
            if ((var5 & 0x8) != 0) {
                int var6 = field394.method2127();
                int var7 = field394.method2132();
                var4.method629(var6, var7, field259);
                var4.field757 = field259 + 300;
                var4.field771 = field394.method2129();
                var4.field759 = field394.method2163();
            }
            if ((var5 & 0x1) != 0) {
                int var8 = field394.method2209();
                int var9 = field394.method2209();
                var4.method629(var8, var9, field259);
                var4.field757 = field259 + 300;
                var4.field771 = field394.method2129();
                var4.field759 = field394.method2214();
            }
            if ((var5 & 0x80) != 0) {
                var4.field748 = field394.method2161();
                int var10 = field394.method2170();
                var4.field775 = var10 >> 16;
                var4.field740 = (var10 & 0xFFFF) + field259;
                var4.field772 = 0;
                var4.field784 = 0;
                if (var4.field740 > field259) {
                    var4.field772 = -1;
                }
                if (var4.field748 == 65535) {
                    var4.field748 = -1;
                }
            }
            if ((var5 & 0x2) != 0) {
                var4.field705 = class37.method890(field394.method2163());
                var4.field739 = var4.field705.field819;
                var4.field787 = var4.field705.field815;
                var4.field743 = var4.field705.field818;
                var4.field744 = var4.field705.field827;
                var4.field756 = var4.field705.field810;
                var4.field746 = var4.field705.field822;
                var4.field793 = var4.field705.field816;
                var4.field741 = var4.field705.field817;
                var4.field742 = var4.field705.field809;
            }
            if ((var5 & 0x4) != 0) {
                int var11 = field394.method2163();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = field394.method2132();
                if (var4.field766 == var11 && var11 != -1) {
                    int var13 = class40.method512(var11).field931;
                    if (var13 == 1) {
                        var4.field767 = 0;
                        var4.field768 = 0;
                        var4.field769 = var12;
                        var4.field770 = 0;
                    }
                    if (var13 == 2) {
                        var4.field770 = 0;
                    }
                } else if (var11 == -1 || var4.field766 == -1 || class40.method512(var11).field920 >= class40.method512(var4.field766).field920) {
                    var4.field766 = var11;
                    var4.field767 = 0;
                    var4.field768 = 0;
                    var4.field769 = var12;
                    var4.field770 = 0;
                    var4.field737 = var4.field788;
                }
            }
            if ((var5 & 0x20) != 0) {
                var4.field764 = field394.method2166();
                var4.field751 = 100;
            }
            if ((var5 & 0x40) != 0) {
                var4.field753 = field394.method2129();
                var4.field762 = field394.method2163();
            }
            if ((var5 & 0x10) != 0) {
                var4.field760 = field394.method2161();
                if (var4.field760 == 65535) {
                    var4.field760 = -1;
                }
            }
        }
        for (int var14 = 0; var14 < field378; var14++) {
            int var15 = field379[var14];
            if (field259 != field289[var15].field745) {
                field289[var15].field705 = null;
                field289[var15] = null;
            }
        }
        if (field295 != field394.field1894) {
            throw new RuntimeException(field394.field1894 + class2.field16 + field295);
        }
        for (int var16 = 0; var16 < field290; var16++) {
            if (field289[field291[var16]] == null) {
                throw new RuntimeException(var16 + class2.field16 + field290);
            }
        }
    }

    @ObfuscatedName("q.bf(S)V")
    public static final void method121() {
        field394.method2379();
        int var0 = field394.method2380(8);
        if (var0 < field290) {
            for (int var1 = var0; var1 < field290; var1++) {
                field379[++field378 - 1] = field291[var1];
            }
        }
        if (var0 > field290) {
            throw new RuntimeException("");
        }
        field290 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field291[var2];
            class32 var4 = field289[var3];
            int var5 = field394.method2380(1);
            if (var5 == 0) {
                field291[++field290 - 1] = var3;
                var4.field745 = field259;
            } else {
                int var6 = field394.method2380(2);
                if (var6 == 0) {
                    field291[++field290 - 1] = var3;
                    var4.field745 = field259;
                    field374[++field373 - 1] = var3;
                } else if (var6 == 1) {
                    field291[++field290 - 1] = var3;
                    var4.field745 = field259;
                    int var7 = field394.method2380(3);
                    var4.method620(var7, false);
                    int var8 = field394.method2380(1);
                    if (var8 == 1) {
                        field374[++field373 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field291[++field290 - 1] = var3;
                    var4.field745 = field259;
                    int var9 = field394.method2380(3);
                    var4.method620(var9, true);
                    int var10 = field394.method2380(3);
                    var4.method620(var10, true);
                    int var11 = field394.method2380(1);
                    if (var11 == 1) {
                        field374[++field373 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field379[++field378 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("aq.bl(III)V")
    public static final void method841(int arg0, int arg1) {
        if (field377 < 2 && field302 == 0 && !field407) {
            return;
        }
        String var2;
        if (field302 == 1 && field377 < 2) {
            var2 = class148.field2217 + class148.field2361 + field406 + " " + class2.field20;
        } else if (field407 && field377 < 2) {
            var2 = field506 + class148.field2361 + field411 + " " + class2.field20;
        } else {
            var2 = method1873(field377 - 1);
        }
        if (field377 > 2) {
            var2 = var2 + class2.method2079(16777215) + " " + '/' + " " + (field377 - 2) + class148.field2355;
        }
        Statics.field1322.method3621(var2, arg0 + 4, arg1 + 15, 16777215, 0, field259 / 1000);
    }

    @ObfuscatedName("ac.bd(B)V")
    public static final void method603() {
        int var0 = Statics.field932;
        int var1 = Statics.field2163;
        int var2 = Statics.field1022;
        int var3 = Statics.field1990;
        int var4 = 6116423;
        class75.method1533(var0, var1, var2, var3, var4);
        class75.method1533(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class75.method1502(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1322.method3588(class148.field2210, var0 + 3, var1 + 14, var4, -1);
        int var5 = class132.field2053;
        int var6 = class132.field2054;
        for (int var7 = 0; var7 < field377; var7++) {
            int var8 = (field377 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1322.method3588(method1873(var7), var0 + 3, var8, var9, 0);
        }
        method2766(Statics.field932, Statics.field2163, Statics.field1022, Statics.field1990);
    }

    @ObfuscatedName("l.bu(IIIII)V")
    public static final void method89(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field457; var4++) {
            if (field464[var4] + field462[var4] > arg0 && field462[var4] < arg0 + arg2 && field465[var4] + field372[var4] > arg1 && field372[var4] < arg1 + arg3) {
                field492[var4] = true;
            }
        }
    }

    @ObfuscatedName("ev.bg(IIIIS)V")
    public static final void method2766(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field457; var4++) {
            if (field464[var4] + field462[var4] > arg0 && field462[var4] < arg0 + arg2 && field465[var4] + field372[var4] > arg1 && field372[var4] < arg1 + arg3) {
                field298[var4] = true;
            }
        }
    }

    @ObfuscatedName("o.cg(IIB)V")
    public static final void method101(int arg0, int arg1) {
        int var2 = Statics.field1322.method3536(class148.field2210);
        for (int var3 = 0; var3 < field377; var3++) {
            int var4 = Statics.field1322.method3536(method1873(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field377 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field56) {
            var6 = Statics.field56 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2528) {
            var7 = Statics.field2528 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field418 = true;
        Statics.field932 = var6;
        Statics.field2163 = var7;
        Statics.field1022 = var2;
        Statics.field1990 = field377 * 15 + 22;
    }

    @ObfuscatedName("dg.cm(II)Z")
    public static final boolean method2409(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field479[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fg.cb(Lai;IIB)V")
    public static final void method2940(class29 arg0, int arg1, int arg2) {
        method527(arg0.field653, arg0.field645, arg0.field644, arg0.field647, arg0.field648, arg0.field648, arg1, arg2);
    }

    @ObfuscatedName("y.cs(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method527(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 18) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(21);
            field397.method2151(class129.field2017[82] ? 1 : 0);
            field397.method2160(Statics.field1084 + arg1);
            field397.method2160(arg3);
            field397.method2289(Statics.field1912 + arg0);
        }
        if (arg2 == 58) {
            class164 var8 = class164.method2498(arg1, arg0);
            if (var8 != null) {
                field397.method2386(98);
                field397.method2159(arg0);
                field397.method2201(field410);
                field397.method2201(field516);
                field397.method2169(Statics.field2928);
                field397.method2160(var8.field2639);
                field397.method2169(arg1);
            }
        }
        if (arg2 == 14) {
            class3 var9 = field370[arg3];
            if (var9 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(212);
                field397.method2150(class129.field2017[82] ? 1 : 0);
                field397.method2201(Statics.field1025);
                field397.method2159(arg3);
                field397.method2168(Statics.field990);
                field397.method2201(Statics.field2590);
            }
        }
        if (arg2 == 12) {
            class32 var10 = field289[arg3];
            if (var10 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(33);
                field397.method2201(arg3);
                field397.method2112(class129.field2017[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field397.method2386(191);
            field397.method2160(arg3);
            field397.method2201(arg0);
            field397.method2167(arg1);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 34) {
            field397.method2386(75);
            field397.method2159(arg3);
            field397.method2201(arg0);
            field397.method2115(arg1);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 28) {
            field397.method2386(82);
            field397.method2115(arg1);
            class164 var11 = class164.method145(arg1);
            if (var11.field2748 != null && var11.field2748[0][0] == 5) {
                int var12 = var11.field2748[0][1];
                class167.field2786[var12] = 1 - class167.field2786[var12];
                method147(var12);
            }
        }
        if (arg2 == 1003) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            class32 var13 = field289[arg3];
            if (var13 != null) {
                class37 var14 = var13.field705;
                if (var14.field825 != null) {
                    var14 = var14.method654();
                }
                if (var14 != null) {
                    field397.method2386(241);
                    field397.method2201(var14.field811);
                }
            }
        }
        if (arg2 == 38) {
            method504();
            class164 var15 = class164.method145(arg1);
            field302 = 1;
            Statics.field2590 = arg0;
            Statics.field990 = arg1;
            Statics.field1025 = arg3;
            method3247(var15);
            field406 = class2.method2079(16748608) + class47.method1037(arg3).field1040 + class2.method2079(16777215);
            if (field406 == null) {
                field406 = "null";
            }
            return;
        }
        if (arg2 == 37) {
            field397.method2386(64);
            field397.method2167(arg1);
            field397.method2159(arg0);
            field397.method2201(arg3);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 35) {
            field397.method2386(248);
            field397.method2160(arg3);
            field397.method2159(arg0);
            field397.method2115(arg1);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 5) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(156);
            field397.method2112(class129.field2017[82] ? 1 : 0);
            field397.method2201(Statics.field1084 + arg1);
            field397.method2201(Statics.field1912 + arg0);
            field397.method2159(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 17) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(74);
            field397.method2160(Statics.field1912 + arg0);
            field397.method2289(arg3);
            field397.method2289(Statics.field1084 + arg1);
            field397.method2289(field410);
            field397.method2168(Statics.field2928);
            field397.method2319(class129.field2017[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class3 var16 = field370[arg3];
            if (var16 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(23);
                field397.method2201(arg3);
                field397.method2150(class129.field2017[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(215);
            field397.method2159(Statics.field1084 + arg1);
            field397.method2319(class129.field2017[82] ? 1 : 0);
            field397.method2289(Statics.field1912 + arg0);
            field397.method2201(arg3);
        }
        if (arg2 == 29) {
            field397.method2386(82);
            field397.method2115(arg1);
            class164 var17 = class164.method145(arg1);
            if (var17.field2748 != null && var17.field2748[0][0] == 5) {
                int var18 = var17.field2748[0][1];
                if (class167.field2786[var18] != var17.field2716[0]) {
                    class167.field2786[var18] = var17.field2716[0];
                    method147(var18);
                }
            }
        }
        if (arg2 == 43) {
            field397.method2386(89);
            field397.method2201(arg0);
            field397.method2168(arg1);
            field397.method2160(arg3);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 3) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(25);
            field397.method2159(arg3 >> 14 & 0x7FFF);
            field397.method2201(Statics.field1912 + arg0);
            field397.method2160(Statics.field1084 + arg1);
            field397.method2319(class129.field2017[82] ? 1 : 0);
        }
        if (arg2 == 2) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(65);
            field397.method2289(Statics.field1084 + arg1);
            field397.method2201(Statics.field1912 + arg0);
            field397.method2167(Statics.field2928);
            field397.method2160(field410);
            field397.method2151(class129.field2017[82] ? 1 : 0);
            field397.method2160(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var19 = class164.method2498(arg1, arg0);
            if (var19 != null) {
                int var20 = var19.field2639;
                class164 var21 = class164.method2498(arg1, arg0);
                if (var21 != null) {
                    if (var21.field2700 != null) {
                        class1 var22 = new class1();
                        var22.field3 = var21;
                        var22.field6 = arg3;
                        var22.field11 = arg5;
                        var22.field5 = var21.field2700;
                        class34.method152(var22, 200000);
                    }
                    boolean var23 = true;
                    if (var21.field2642 > 0) {
                        var23 = method828(var21);
                    }
                    if (var23 && class169.method1393(method1969(var21), arg3 - 1)) {
                        if (arg3 == 1) {
                            field397.method2386(13);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                        if (arg3 == 2) {
                            field397.method2386(245);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                        if (arg3 == 3) {
                            field397.method2386(125);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                        if (arg3 == 4) {
                            field397.method2386(240);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                        if (arg3 == 5) {
                            field397.method2386(236);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                        if (arg3 == 6) {
                            field397.method2386(108);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                        if (arg3 == 7) {
                            field397.method2386(104);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                        if (arg3 == 8) {
                            field397.method2386(193);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                        if (arg3 == 9) {
                            field397.method2386(112);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                        if (arg3 == 10) {
                            field397.method2386(163);
                            field397.method2115(arg1);
                            field397.method2201(arg0);
                            field397.method2201(var20);
                        }
                    }
                }
            }
        }
        if (arg2 == 50) {
            class3 var24 = field370[arg3];
            if (var24 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(95);
                field397.method2112(class129.field2017[82] ? 1 : 0);
                field397.method2201(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var25 = field370[arg3];
            if (var25 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(231);
                field397.method2319(class129.field2017[82] ? 1 : 0);
                field397.method2160(arg3);
            }
        }
        if (arg2 == 1) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(102);
            field397.method2159(arg3 >> 14 & 0x7FFF);
            field397.method2289(Statics.field1912 + arg0);
            field397.method2289(Statics.field2590);
            field397.method2115(Statics.field990);
            field397.method2160(Statics.field1084 + arg1);
            field397.method2289(Statics.field1025);
            field397.method2150(class129.field2017[82] ? 1 : 0);
        }
        if (arg2 == 8) {
            class32 var26 = field289[arg3];
            if (var26 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(167);
                field397.method2201(field410);
                field397.method2151(class129.field2017[82] ? 1 : 0);
                field397.method2160(arg3);
                field397.method2169(Statics.field2928);
            }
        }
        if (arg2 == 23) {
            Statics.field619.method1720(Statics.field50, arg0, arg1);
        }
        if (arg2 == 1004) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field397.method2386(162);
            field397.method2159(arg3);
        }
        if (arg2 == 31) {
            field397.method2386(235);
            field397.method2168(arg1);
            field397.method2159(arg0);
            field397.method2160(Statics.field1025);
            field397.method2167(Statics.field990);
            field397.method2201(Statics.field2590);
            field397.method2201(arg3);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 6) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(136);
            field397.method2319(class129.field2017[82] ? 1 : 0);
            field397.method2289(arg3 >> 14 & 0x7FFF);
            field397.method2289(Statics.field1912 + arg0);
            field397.method2159(Statics.field1084 + arg1);
        }
        if (arg2 == 40) {
            field397.method2386(177);
            field397.method2289(arg0);
            field397.method2168(arg1);
            field397.method2159(arg3);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 30 && field416 == null) {
            method3423(arg1, arg0);
            field416 = class164.method2498(arg1, arg0);
            method3247(field416);
        }
        if (arg2 == 24) {
            class164 var27 = class164.method145(arg1);
            boolean var28 = true;
            if (var27.field2642 > 0) {
                var28 = method828(var27);
            }
            if (var28) {
                field397.method2386(82);
                field397.method2115(arg1);
            }
        }
        if (arg2 == 10) {
            class32 var29 = field289[arg3];
            if (var29 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(196);
                field397.method2151(class129.field2017[82] ? 1 : 0);
                field397.method2159(arg3);
            }
        }
        if (arg2 == 49) {
            class3 var30 = field370[arg3];
            if (var30 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(79);
                field397.method2160(arg3);
                field397.method2319(class129.field2017[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            field397.method2386(243);
            for (class4 var31 = (class4) field413.method3286(); var31 != null; var31 = (class4) field413.method3291()) {
                if (var31.field53 == 0 || var31.field53 == 3) {
                    method1084(var31, true);
                }
            }
            if (field416 != null) {
                method3247(field416);
                field416 = null;
            }
        }
        if (arg2 == 13) {
            class32 var32 = field289[arg3];
            if (var32 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(145);
                field397.method2159(arg3);
                field397.method2319(class129.field2017[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field397.method2386(148);
            field397.method2159(arg0);
            field397.method2115(Statics.field2928);
            field397.method2160(field410);
            field397.method2167(arg1);
            field397.method2160(arg3);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 44) {
            class3 var33 = field370[arg3];
            if (var33 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(168);
                field397.method2112(class129.field2017[82] ? 1 : 0);
                field397.method2289(arg3);
            }
        }
        if (arg2 == 42) {
            field397.method2386(244);
            field397.method2289(arg0);
            field397.method2159(arg3);
            field397.method2168(arg1);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 16) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(106);
            field397.method2159(Statics.field1025);
            field397.method2167(Statics.field990);
            field397.method2289(Statics.field1912 + arg0);
            field397.method2289(Statics.field1084 + arg1);
            field397.method2160(Statics.field2590);
            field397.method2319(class129.field2017[82] ? 1 : 0);
            field397.method2159(arg3);
        }
        if (arg2 == 33) {
            field397.method2386(68);
            field397.method2159(arg0);
            field397.method2167(arg1);
            field397.method2159(arg3);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 9) {
            class32 var34 = field289[arg3];
            if (var34 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(62);
                field397.method2201(arg3);
                field397.method2319(class129.field2017[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(199);
            field397.method2201(Statics.field1084 + arg1);
            field397.method2150(class129.field2017[82] ? 1 : 0);
            field397.method2201(Statics.field1912 + arg0);
            field397.method2289(arg3);
        }
        if (arg2 == 25) {
            class164 var35 = class164.method2498(arg1, arg0);
            if (var35 != null) {
                method504();
                method2550(arg1, arg0, class169.method2421(method1969(var35)), var35.field2639);
                field302 = 0;
                field506 = method2790(var35);
                if (field506 == null) {
                    field506 = "Null";
                }
                if (var35.field2648) {
                    field411 = var35.field2709 + class2.method2079(16777215);
                } else {
                    field411 = class2.method2079(65280) + var35.field2711 + class2.method2079(16777215);
                }
            }
            return;
        }
        if (arg2 == 1002) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field397.method2386(6);
            field397.method2160(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 4) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(11);
            field397.method2160(Statics.field1912 + arg0);
            field397.method2201(Statics.field1084 + arg1);
            field397.method2319(class129.field2017[82] ? 1 : 0);
            field397.method2201(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 41) {
            field397.method2386(219);
            field397.method2160(arg0);
            field397.method2159(arg3);
            field397.method2115(arg1);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 47) {
            class3 var36 = field370[arg3];
            if (var36 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(186);
                field397.method2159(arg3);
                field397.method2112(class129.field2017[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(213);
            field397.method2159(Statics.field1084 + arg1);
            field397.method2201(arg3);
            field397.method2319(class129.field2017[82] ? 1 : 0);
            field397.method2160(Statics.field1912 + arg0);
        }
        if (arg2 == 15) {
            class3 var37 = field370[arg3];
            if (var37 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(71);
                field397.method2169(Statics.field2928);
                field397.method2201(field410);
                field397.method2289(arg3);
                field397.method2112(class129.field2017[82] ? 1 : 0);
            }
        }
        if (arg2 == 45) {
            class3 var38 = field370[arg3];
            if (var38 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(237);
                field397.method2112(class129.field2017[82] ? 1 : 0);
                field397.method2159(arg3);
            }
        }
        if (arg2 == 19) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(109);
            field397.method2201(arg3);
            field397.method2159(Statics.field1084 + arg1);
            field397.method2112(class129.field2017[82] ? 1 : 0);
            field397.method2159(Statics.field1912 + arg0);
        }
        if (arg2 == 51) {
            class3 var39 = field370[arg3];
            if (var39 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(29);
                field397.method2201(arg3);
                field397.method2112(class129.field2017[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class164 var40 = class164.method145(arg1);
            if (var40 == null || var40.field2755[arg0] < 100000) {
                field397.method2386(162);
                field397.method2159(arg3);
            } else {
                class11.method2070(27, "", var40.field2755[arg0] + " x " + class47.method1037(arg3).field1040);
            }
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 7) {
            class32 var41 = field289[arg3];
            if (var41 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(249);
                field397.method2201(arg3);
                field397.method2159(Statics.field1025);
                field397.method2112(class129.field2017[82] ? 1 : 0);
                field397.method2201(Statics.field2590);
                field397.method2115(Statics.field990);
            }
        }
        if (arg2 == 39) {
            field397.method2386(185);
            field397.method2159(arg3);
            field397.method2201(arg0);
            field397.method2167(arg1);
            field361 = 0;
            Statics.field981 = class164.method145(arg1);
            field277 = arg0;
        }
        if (arg2 == 1001) {
            field357 = arg6;
            field358 = arg7;
            field433 = 2;
            field359 = 0;
            field393 = arg0;
            field446 = arg1;
            field397.method2386(223);
            field397.method2112(class129.field2017[82] ? 1 : 0);
            field397.method2201(Statics.field1912 + arg0);
            field397.method2289(Statics.field1084 + arg1);
            field397.method2289(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 11) {
            class32 var42 = field289[arg3];
            if (var42 != null) {
                field357 = arg6;
                field358 = arg7;
                field433 = 2;
                field359 = 0;
                field393 = arg0;
                field446 = arg1;
                field397.method2386(57);
                field397.method2319(class129.field2017[82] ? 1 : 0);
                field397.method2160(arg3);
            }
        }
        if (field302 != 0) {
            field302 = 0;
            method3247(class164.method145(Statics.field990));
        }
        if (field407) {
            method504();
        }
        if (Statics.field981 != null && field361 == 0) {
            method3247(Statics.field981);
        }
    }

    @ObfuscatedName("q.cr(ILjava/lang/String;I)V")
    public static void method120(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field371; var3++) {
            class3 var4 = field370[field391[var3]];
            if (var4 != null && var4.field33 != null && var4.field33.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field397.method2386(168);
                    field397.method2112(0);
                    field397.method2289(field391[var3]);
                } else if (arg0 == 4) {
                    field397.method2386(186);
                    field397.method2159(field391[var3]);
                    field397.method2112(0);
                } else if (arg0 == 6) {
                    field397.method2386(79);
                    field397.method2160(field391[var3]);
                    field397.method2319(0);
                } else if (arg0 == 7) {
                    field397.method2386(95);
                    field397.method2112(0);
                    field397.method2201(field391[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class11.method2070(4, "", class148.field2350 + arg1);
        }
    }

    @ObfuscatedName("dm.ca(IIIII)V")
    public static void method2550(int arg0, int arg1, int arg2, int arg3) {
        class164 var4 = class164.method2498(arg0, arg1);
        if (var4 != null && var4.field2727 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field5 = var4.field2727;
            class34.method152(var5, 200000);
        }
        field516 = arg3;
        field407 = true;
        Statics.field2928 = arg0;
        field410 = arg1;
        Statics.field146 = arg2;
        method3247(var4);
    }

    @ObfuscatedName("w.cq(I)V")
    public static void method504() {
        if (!field407) {
            return;
        }
        class164 var0 = class164.method2498(Statics.field2928, field410);
        if (var0 != null && var0.field2728 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field5 = var0.field2728;
            class34.method152(var1, 200000);
        }
        field407 = false;
        method3247(var0);
    }

    @ObfuscatedName("gi.cf(IIB)V")
    public static void method3423(int arg0, int arg1) {
        field397.method2386(160);
        field397.method2115(arg0);
        field397.method2160(arg1);
    }

    @ObfuscatedName("ej.cz(I)V")
    public static final void method2581() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field377 - 1; var1++) {
                if (field479[var1] < 1000 && field479[var1 + 1] > 1000) {
                    String var2 = field400[var1];
                    field400[var1] = field400[var1 + 1];
                    field400[var1 + 1] = var2;
                    String var3 = field399[var1];
                    field399[var1] = field399[var1 + 1];
                    field399[var1 + 1] = var3;
                    int var4 = field479[var1];
                    field479[var1] = field479[var1 + 1];
                    field479[var1 + 1] = var4;
                    int var5 = field395[var1];
                    field395[var1] = field395[var1 + 1];
                    field395[var1 + 1] = var5;
                    int var6 = field408[var1];
                    field408[var1] = field408[var1 + 1];
                    field408[var1 + 1] = var6;
                    int var7 = field398[var1];
                    field398[var1] = field398[var1 + 1];
                    field398[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ex.ct(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2740(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field418 || field377 >= 500) {
            return;
        }
        field399[field377] = arg0;
        field400[field377] = arg1;
        field479[field377] = arg2;
        field398[field377] = arg3;
        field395[field377] = arg4;
        field408[field377] = arg5;
        field377++;
    }

    @ObfuscatedName("ct.ck(I)V")
    public static void method1858() {
        for (int var0 = 0; var0 < field377; var0++) {
            int var1 = field479[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field377 - 1) {
                    for (int var3 = var0; var3 < field377 - 1; var3++) {
                        field399[var3] = field399[var3 + 1];
                        field400[var3] = field400[var3 + 1];
                        field479[var3] = field479[var3 + 1];
                        field398[var3] = field398[var3 + 1];
                        field395[var3] = field395[var3 + 1];
                        field408[var3] = field408[var3 + 1];
                    }
                }
                field377--;
            }
        }
    }

    @ObfuscatedName("cn.cl(II)Ljava/lang/String;")
    public static String method1873(int arg0) {
        return field400[arg0].length() > 0 ? field399[arg0] + class148.field2361 + field400[arg0] : field399[arg0];
    }

    @ObfuscatedName("en.cn(IIIII)V")
    public static final void method2706(int arg0, int arg1, int arg2, int arg3) {
        if (field302 == 0 && !field407) {
            method2740(class148.field2356, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class100.field1751; var6++) {
            int var7 = class100.field1794[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field619.method1618(Statics.field50, var8, var9, var7) >= 0) {
                    class38 var12 = class38.method1770(var11);
                    if (var12.field890 != null) {
                        var12 = var12.method679();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field302 == 1) {
                        method2740(class148.field2217, field406 + " " + class2.field20 + " " + class2.method2079(65535) + var12.field870, 1, var7, var8, var9);
                    } else if (!field407) {
                        String[] var13 = var12.field876;
                        if (field388) {
                            var13 = method172(var13);
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
                                    method2740(var13[var14], class2.method2079(65535) + var12.field870, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2740(class148.field2231, class2.method2079(65535) + var12.field870, 1002, var12.field856 << 14, var8, var9);
                    } else if ((Statics.field146 & 0x4) == 4) {
                        method2740(field506, field411 + " " + class2.field20 + " " + class2.method2079(65535) + var12.field870, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class32 var16 = field289[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field705.field819 == 1 && (var16.field749 & 0x7F) == 64 && (var16.field752 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field290; var17++) {
                            class32 var18 = field289[field291[var17]];
                            if (var18 != null && var16 != var18 && var18.field705.field819 == 1 && var16.field749 == var18.field749 && var16.field752 == var18.field752) {
                                Statics.method29(var18.field705, field291[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field371; var19++) {
                            class3 var20 = field370[field391[var19]];
                            if (var20 != null && var16.field749 == var20.field749 && var16.field752 == var20.field752) {
                                method140(var20, field391[var19], var8, var9);
                            }
                        }
                    }
                    Statics.method29(var16.field705, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field370[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field749 & 0x7F) == 64 && (var21.field752 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field290; var22++) {
                            class32 var23 = field289[field291[var22]];
                            if (var23 != null && var23.field705.field819 == 1 && var21.field749 == var23.field749 && var21.field752 == var23.field752) {
                                Statics.method29(var23.field705, field291[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field371; var24++) {
                            class3 var25 = field370[field391[var24]];
                            if (var25 != null && var21 != var25 && var21.field749 == var25.field749 && var21.field752 == var25.field752) {
                                method140(var25, field391[var24], var8, var9);
                            }
                        }
                    }
                    if (field363 == var11) {
                        var4 = var7;
                    } else {
                        method140(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class190 var26 = field385[Statics.field50][var8][var9];
                    if (var26 != null) {
                        for (class27 var27 = (class27) var26.method3325(); var27 != null; var27 = (class27) var26.method3317()) {
                            class47 var28 = class47.method1037(var27.field630);
                            if (field302 == 1) {
                                method2740(class148.field2217, field406 + " " + class2.field20 + " " + class2.method2079(16748608) + var28.field1040, 16, var27.field630, var8, var9);
                            } else if (!field407) {
                                String[] var29 = var28.field1060;
                                if (field388) {
                                    var29 = method172(var29);
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
                                        method2740(var29[var30], class2.method2079(16748608) + var28.field1040, var31, var27.field630, var8, var9);
                                    } else if (var30 == 2) {
                                        method2740(class148.field2339, class2.method2079(16748608) + var28.field1040, 20, var27.field630, var8, var9);
                                    }
                                }
                                method2740(class148.field2231, class2.method2079(16748608) + var28.field1040, 1004, var27.field630, var8, var9);
                            } else if ((Statics.field146 & 0x1) == 1) {
                                method2740(field506, field411 + " " + class2.field20 + " " + class2.method2079(16748608) + var28.field1040, 17, var27.field630, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field370[field363];
            method140(var34, field363, var32, var33);
        }
    }

    @ObfuscatedName("n.cu(La;IIIS)V")
    public static final void method140(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field579 == arg0 || field377 >= 400) {
            return;
        }
        String var9;
        if (arg0.field46 == 0) {
            String var4 = arg0.field33;
            int var5 = arg0.field36;
            int var6 = Statics.field579.field36;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2079(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2079(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2079(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2079(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2079(65280);
            } else if (var7 > 6) {
                var8 = class2.method2079(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2079(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2079(12648192);
            } else {
                var8 = class2.method2079(16776960);
            }
            var9 = var4 + var8 + " " + class2.field15 + class148.field2357 + arg0.field36 + class2.field19;
        } else {
            var9 = arg0.field33 + " " + class2.field15 + class148.field2441 + arg0.field46 + class2.field19;
        }
        if (field302 == 1) {
            method2740(class148.field2217, field406 + " " + class2.field20 + " " + class2.method2079(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field407) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field381[var10] != null) {
                    short var11 = 0;
                    if (field381[var10].equalsIgnoreCase(class148.field2353)) {
                        if (field494 == class19.field537 || field494 == class19.field541 && arg0.field36 > Statics.field579.field36) {
                            var11 = 2000;
                        }
                        if (Statics.field579.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field579.field49 == arg0.field49) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field512[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field380[var10] + var11;
                    method2740(field381[var10], class2.method2079(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field146 & 0x8) == 8) {
            method2740(field506, field411 + " " + class2.field20 + " " + class2.method2079(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field377; var14++) {
            if (field479[var14] == 23) {
                field400[var14] = class2.method2079(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("aw.co(IIIIIIIIB)V")
    public static final void method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method2749(arg0)) {
            Statics.field1081 = null;
            Statics.method1330(Statics.field2726[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1081 != null) {
                Statics.method1330(Statics.field1081, -1412584499, arg1, arg2, arg3, arg4, Statics.field201, Statics.field35, arg7);
                Statics.field1081 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field492[var8] = true;
            }
        } else {
            field492[arg7] = true;
        }
    }

    @ObfuscatedName("l.ci(Ljava/lang/String;Lfx;I)Ljava/lang/String;")
    public static String method87(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1586(arg1, var2 - 1);
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
                if (Statics.field276 != null) {
                    int var9 = Statics.field276.field2118;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field276.field2115 != null) {
                        var8 = (String) Statics.field276.field2115;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("az.ch(IB)Ljava/lang/String;")
    public static final String method759(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field16 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2079(65408) + var1.substring(0, var1.length() - 8) + class148.field2362 + " " + class2.field15 + var1 + class2.field19 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method2079(16777215) + var1.substring(0, var1.length() - 4) + class148.field2405 + " " + class2.field15 + var1 + class2.field19 + class2.field26;
        } else {
            return " " + class2.method2079(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("ct.cv(Lfx;B)V")
    public static void method1857(class164 arg0) {
        class164 var1 = arg0.field2657 == -1 ? null : class164.method145(arg0.field2657);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field56;
            var3 = Statics.field2528;
        } else {
            var2 = var1.field2653;
            var3 = var1.field2654;
        }
        method2757(arg0, var2, var3, false);
        method144(arg0, var2, var3);
    }

    @ObfuscatedName("i.cd([Lfx;Lfx;ZI)V")
    public static void method169(class164[] arg0, class164 arg1, boolean arg2) {
        int var3 = arg1.field2661 == 0 ? arg1.field2653 : arg1.field2661;
        int var4 = arg1.field2750 == 0 ? arg1.field2654 : arg1.field2750;
        method25(arg0, arg1.field2684, var3, var4, arg2);
        if (arg1.field2731 != null) {
            method25(arg1.field2731, arg1.field2684, var3, var4, arg2);
        }
        class4 var5 = (class4) field413.method3297((long) arg1.field2684);
        if (var5 != null) {
            int var6 = var5.field58;
            if (class164.method2749(var6)) {
                method25(Statics.field2726[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2642 == 1337) {
        }
    }

    @ObfuscatedName("a.cx([Lfx;IIIZI)V")
    public static void method25(class164[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class164 var6 = arg0[var5];
            if (var6 != null && var6.field2657 == arg1) {
                method2757(var6, arg2, arg3, arg4);
                method144(var6, arg2, arg3);
                if (var6.field2627 > var6.field2661 - var6.field2653) {
                    var6.field2627 = var6.field2661 - var6.field2653;
                }
                if (var6.field2627 < 0) {
                    var6.field2627 = 0;
                }
                if (var6.field2630 > var6.field2750 - var6.field2654) {
                    var6.field2630 = var6.field2750 - var6.field2654;
                }
                if (var6.field2630 < 0) {
                    var6.field2630 = 0;
                }
                if (var6.field2765 == 0) {
                    method169(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ev.ce(Lfx;IIZB)V")
    public static void method2757(class164 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2653;
        int var5 = arg0.field2654;
        if (arg0.field2659 == 0) {
            arg0.field2653 = arg0.field2649;
        } else if (arg0.field2659 == 1) {
            arg0.field2653 = arg1 - arg0.field2649;
        } else if (arg0.field2659 == 2) {
            arg0.field2653 = arg0.field2649 * arg1 >> 14;
        }
        if (arg0.field2646 == 0) {
            arg0.field2654 = arg0.field2650;
        } else if (arg0.field2646 == 1) {
            arg0.field2654 = arg2 - arg0.field2650;
        } else if (arg0.field2646 == 2) {
            arg0.field2654 = arg0.field2650 * arg2 >> 14;
        }
        if (arg0.field2659 == 4) {
            arg0.field2653 = arg0.field2655 * arg0.field2654 / arg0.field2656;
        }
        if (arg0.field2646 == 4) {
            arg0.field2654 = arg0.field2656 * arg0.field2653 / arg0.field2655;
        }
        if (field422 && arg0.field2765 == 0) {
            if (arg0.field2654 < 5 && arg0.field2653 < 5) {
                arg0.field2654 = 5;
                arg0.field2653 = 5;
            } else {
                if (arg0.field2654 <= 0) {
                    arg0.field2654 = 5;
                }
                if (arg0.field2653 <= 0) {
                    arg0.field2653 = 5;
                }
            }
        }
        if (arg0.field2642 == 1337) {
            field424 = arg0;
        }
        if (arg3 && arg0.field2745 != null && (arg0.field2653 != var4 || arg0.field2654 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field5 = arg0.field2745;
            field244.method3319(var6);
        }
    }

    @ObfuscatedName("n.cw(Lfx;IIB)V")
    public static void method144(class164 arg0, int arg1, int arg2) {
        if (arg0.field2643 == 0) {
            arg0.field2651 = arg0.field2647;
        } else if (arg0.field2643 == 1) {
            arg0.field2651 = (arg1 - arg0.field2653) / 2 + arg0.field2647;
        } else if (arg0.field2643 == 2) {
            arg0.field2651 = arg1 - arg0.field2653 - arg0.field2647;
        } else if (arg0.field2643 == 3) {
            arg0.field2651 = arg0.field2647 * arg1 >> 14;
        } else if (arg0.field2643 == 4) {
            arg0.field2651 = (arg0.field2647 * arg1 >> 14) + (arg1 - arg0.field2653) / 2;
        } else {
            arg0.field2651 = arg1 - arg0.field2653 - (arg0.field2647 * arg1 >> 14);
        }
        if (arg0.field2644 == 0) {
            arg0.field2652 = arg0.field2720;
        } else if (arg0.field2644 == 1) {
            arg0.field2652 = (arg2 - arg0.field2654) / 2 + arg0.field2720;
        } else if (arg0.field2644 == 2) {
            arg0.field2652 = arg2 - arg0.field2654 - arg0.field2720;
        } else if (arg0.field2644 == 3) {
            arg0.field2652 = arg0.field2720 * arg2 >> 14;
        } else if (arg0.field2644 == 4) {
            arg0.field2652 = (arg0.field2720 * arg2 >> 14) + (arg2 - arg0.field2654) / 2;
        } else {
            arg0.field2652 = arg2 - arg0.field2654 - (arg0.field2720 * arg2 >> 14);
        }
        if (!field422 || arg0.field2765 != 0) {
            return;
        }
        if (arg0.field2651 < 0) {
            arg0.field2651 = 0;
        } else if (arg0.field2653 + arg0.field2651 > arg1) {
            arg0.field2651 = arg1 - arg0.field2653;
        }
        if (arg0.field2652 < 0) {
            arg0.field2652 = 0;
        } else if (arg0.field2654 + arg0.field2652 > arg2) {
            arg0.field2652 = arg2 - arg0.field2654;
        }
    }

    @ObfuscatedName("n.cj(IIIIII)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field846[0].method1561(arg0, arg1);
        Statics.field846[1].method1561(arg0, arg1 + arg3 - 16);
        class75.method1533(arg0, arg1 + 16, 16, arg3 - 32, field360);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class75.method1533(arg0, arg1 + 16 + var6, 16, var5, field328);
        class75.method1524(arg0, arg1 + 16 + var6, var5, field474);
        class75.method1524(arg0 + 1, arg1 + 16 + var6, var5, field474);
        class75.method1509(arg0, arg1 + 16 + var6, 16, field474);
        class75.method1509(arg0, arg1 + 17 + var6, 16, field474);
        class75.method1524(arg0 + 15, arg1 + 16 + var6, var5, field329);
        class75.method1524(arg0 + 14, arg1 + 17 + var6, var5 - 1, field329);
        class75.method1509(arg0, arg1 + 15 + var6 + var5, 16, field329);
        class75.method1509(arg0 + 1, arg1 + 14 + var6 + var5, 15, field329);
    }

    @ObfuscatedName("gi.cy(Lfx;I)Z")
    public static final boolean method3420(class164 arg0) {
        if (arg0.field2637 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2637.length; var1++) {
            int var2 = method1586(arg0, var1);
            int var3 = arg0.field2716[var1];
            if (arg0.field2637[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2637[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2637[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cm.dd(Lfx;IB)I")
    public static final int method1586(class164 arg0, int arg1) {
        if (arg0.field2748 == null || arg1 >= arg0.field2748.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2748[arg1];
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
                    var7 = field389[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field336[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field409[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = class164.method145(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method1037(var12).field1053 || field253)) {
                        for (int var13 = 0; var13 < var11.field2681.length; var13++) {
                            if (var12 + 1 == var11.field2681[var13]) {
                                var7 += var11.field2755[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class167.field2786[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2186[field336[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class167.field2786[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field579.field36;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2184[var14]) {
                            var7 += field336[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method145(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method1037(var18).field1053 || field253)) {
                        for (int var19 = 0; var19 < var17.field2681.length; var19++) {
                            if (var18 + 1 == var17.field2681[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field417;
                }
                if (var6 == 12) {
                    var7 = field251;
                }
                if (var6 == 13) {
                    int var20 = class167.field2786[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class167.method931(var22);
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
                    var7 = (Statics.field579.field749 >> 7) + Statics.field1912;
                }
                if (var6 == 19) {
                    var7 = (Statics.field579.field752 >> 7) + Statics.field1084;
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

    @ObfuscatedName("bz.du([Lfx;IIIIIIII)V")
    public static final void method1369(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2648 || var9.field2765 == 0 || var9.field2736 || method1969(var9) != 0 || field426 == var9 || var9.field2642 == 1338) && var9.field2657 == arg1 && (!var9.field2648 || !method545(var9))) {
                int var10 = var9.field2651 + arg6;
                int var11 = var9.field2652 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2765 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2765 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2653 + var10;
                    int var19 = var9.field2654 + var11;
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
                    int var22 = var9.field2653 + var10;
                    int var23 = var9.field2654 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field425 == var9) {
                    field312 = true;
                    field335 = var10;
                    field435 = var11;
                }
                if (!var9.field2648 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2053;
                    int var25 = class132.field2054;
                    if (class132.field2059 != 0) {
                        var24 = class132.field2060;
                        var25 = class132.field2048;
                    }
                    if (var9.field2642 == 1337) {
                        if (!field258 && !field418 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2706(var24, var25, var12, var13);
                        }
                    } else if (var9.field2642 != 1338) {
                        if (!field418 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var40 = var24 - var10;
                            int var41 = var25 - var11;
                            if (var9.field2641 == 1) {
                                method2740(var9.field2753, "", 24, 0, 0, var9.field2684);
                            }
                            if (var9.field2641 == 2 && !field407) {
                                String var42 = method2790(var9);
                                if (var42 != null) {
                                    method2740(var42, class2.method2079(65280) + var9.field2711, 25, 0, -1, var9.field2684);
                                }
                            }
                            if (var9.field2641 == 3) {
                                method2740(class148.field2360, "", 26, 0, 0, var9.field2684);
                            }
                            if (var9.field2641 == 4) {
                                method2740(var9.field2753, "", 28, 0, 0, var9.field2684);
                            }
                            if (var9.field2641 == 5) {
                                method2740(var9.field2753, "", 29, 0, 0, var9.field2684);
                            }
                            if (var9.field2641 == 6 && field416 == null) {
                                method2740(var9.field2753, "", 30, 0, -1, var9.field2684);
                            }
                            if (var9.field2765 == 2) {
                                int var43 = 0;
                                for (int var44 = 0; var44 < var9.field2654; var44++) {
                                    for (int var45 = 0; var45 < var9.field2653; var45++) {
                                        int var46 = (var9.field2702 + 32) * var45;
                                        int var47 = (var9.field2703 + 32) * var44;
                                        if (var43 < 20) {
                                            var46 += var9.field2714[var43];
                                            var47 += var9.field2707[var43];
                                        }
                                        if (var40 >= var46 && var41 >= var47 && var40 < var46 + 32 && var41 < var47 + 32) {
                                            field366 = var43;
                                            Statics.field1710 = var9;
                                            if (var9.field2681[var43] > 0) {
                                                class47 var48 = class47.method1037(var9.field2681[var43] - 1);
                                                if (field302 == 1 && class169.method2717(method1969(var9))) {
                                                    if (Statics.field990 != var9.field2684 || Statics.field2590 != var43) {
                                                        method2740(class148.field2217, field406 + " " + class2.field20 + " " + class2.method2079(16748608) + var48.field1040, 31, var48.field1038, var43, var9.field2684);
                                                    }
                                                } else if (!field407 || !class169.method2717(method1969(var9))) {
                                                    String[] var49 = var48.field1055;
                                                    if (field388) {
                                                        var49 = method172(var49);
                                                    }
                                                    if (class169.method2717(method1969(var9))) {
                                                        for (int var50 = 4; var50 >= 3; var50--) {
                                                            if (var49 != null && var49[var50] != null) {
                                                                byte var51;
                                                                if (var50 == 3) {
                                                                    var51 = 36;
                                                                } else {
                                                                    var51 = 37;
                                                                }
                                                                method2740(var49[var50], class2.method2079(16748608) + var48.field1040, var51, var48.field1038, var43, var9.field2684);
                                                            } else if (var50 == 4) {
                                                                method2740(class148.field2202, class2.method2079(16748608) + var48.field1040, 37, var48.field1038, var43, var9.field2684);
                                                            }
                                                        }
                                                    }
                                                    int var52 = method1969(var9);
                                                    boolean var53 = (var52 >> 31 & 0x1) != 0;
                                                    if (var53) {
                                                        method2740(class148.field2217, class2.method2079(16748608) + var48.field1040, 38, var48.field1038, var43, var9.field2684);
                                                    }
                                                    class169 var10000 = (class169) null;
                                                    if (class169.method2717(method1969(var9)) && var49 != null) {
                                                        for (int var54 = 2; var54 >= 0; var54--) {
                                                            if (var49[var54] != null) {
                                                                byte var55 = 0;
                                                                if (var54 == 0) {
                                                                    var55 = 33;
                                                                }
                                                                if (var54 == 1) {
                                                                    var55 = 34;
                                                                }
                                                                if (var54 == 2) {
                                                                    var55 = 35;
                                                                }
                                                                method2740(var49[var54], class2.method2079(16748608) + var48.field1040, var55, var48.field1038, var43, var9.field2684);
                                                            }
                                                        }
                                                    }
                                                    String[] var56 = var9.field2638;
                                                    if (field388) {
                                                        var56 = method172(var56);
                                                    }
                                                    if (var56 != null) {
                                                        for (int var57 = 4; var57 >= 0; var57--) {
                                                            if (var56[var57] != null) {
                                                                byte var58 = 0;
                                                                if (var57 == 0) {
                                                                    var58 = 39;
                                                                }
                                                                if (var57 == 1) {
                                                                    var58 = 40;
                                                                }
                                                                if (var57 == 2) {
                                                                    var58 = 41;
                                                                }
                                                                if (var57 == 3) {
                                                                    var58 = 42;
                                                                }
                                                                if (var57 == 4) {
                                                                    var58 = 43;
                                                                }
                                                                method2740(var56[var57], class2.method2079(16748608) + var48.field1040, var58, var48.field1038, var43, var9.field2684);
                                                            }
                                                        }
                                                    }
                                                    method2740(class148.field2231, class2.method2079(16748608) + var48.field1040, 1005, var48.field1038, var43, var9.field2684);
                                                } else if ((Statics.field146 & 0x10) == 16) {
                                                    method2740(field506, field411 + " " + class2.field20 + " " + class2.method2079(16748608) + var48.field1040, 32, var48.field1038, var43, var9.field2684);
                                                }
                                            }
                                        }
                                        var43++;
                                    }
                                }
                            }
                            if (var9.field2648) {
                                if (field407) {
                                    int var59 = method1969(var9);
                                    boolean var60 = (var59 >> 21 & 0x1) != 0;
                                    if (var60 && (Statics.field146 & 0x20) == 32) {
                                        method2740(field506, field411 + " " + class2.field20 + " " + var9.field2709, 58, 0, var9.field2640, var9.field2684);
                                    }
                                } else {
                                    for (int var61 = 9; var61 >= 5; var61--) {
                                        String var62;
                                        if (!class169.method1393(method1969(var9), var61) && var9.field2700 == null) {
                                            var62 = null;
                                        } else if (var9.field2710 == null || var9.field2710.length <= var61 || var9.field2710[var61] == null || var9.field2710[var61].trim().length() == 0) {
                                            var62 = null;
                                        } else {
                                            var62 = var9.field2710[var61];
                                        }
                                        if (var62 != null) {
                                            method2740(var62, var9.field2709, 1007, var61 + 1, var9.field2640, var9.field2684);
                                        }
                                    }
                                    String var64 = method2790(var9);
                                    if (var64 != null) {
                                        method2740(var64, var9.field2709, 25, 0, var9.field2640, var9.field2684);
                                    }
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        String var66;
                                        if (!class169.method1393(method1969(var9), var65) && var9.field2700 == null) {
                                            var66 = null;
                                        } else if (var9.field2710 == null || var9.field2710.length <= var65 || var9.field2710[var65] == null || var9.field2710[var65].trim().length() == 0) {
                                            var66 = null;
                                        } else {
                                            var66 = var9.field2710[var65];
                                        }
                                        if (var66 != null) {
                                            method2740(var66, var9.field2709, 57, var65 + 1, var9.field2640, var9.field2684);
                                        }
                                    }
                                    if (Statics.method2430(method1969(var9))) {
                                        method2740(class148.field2351, "", 30, 0, var9.field2640, var9.field2684);
                                    }
                                }
                            }
                        }
                        if (var9.field2765 == 0) {
                            if (!var9.field2648 && method545(var9) && Statics.field584 != var9) {
                                continue;
                            }
                            method1369(arg0, var9.field2684, var12, var13, var14, var15, var10 - var9.field2627, var11 - var9.field2630);
                            if (var9.field2731 != null) {
                                method1369(var9.field2731, var9.field2684, var12, var13, var14, var15, var10 - var9.field2627, var11 - var9.field2630);
                            }
                            class4 var68 = (class4) field413.method3297((long) var9.field2684);
                            if (var68 != null) {
                                if (var68.field53 == 0 && class132.field2053 >= var12 && class132.field2054 >= var13 && class132.field2053 < var14 && class132.field2054 < var15 && !field418 && !field422) {
                                    field399[0] = class148.field2358;
                                    field400[0] = "";
                                    field479[0] = 1006;
                                    field377 = 1;
                                }
                                Statics.method150(var68.field58, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2648) {
                            if (var9.field2769 && class132.field2053 >= var12 && class132.field2054 >= var13 && class132.field2053 < var14 && class132.field2054 < var15) {
                                for (class1 var69 = (class1) field244.method3324(); var69 != null; var69 = (class1) field244.method3326()) {
                                    if (var69.field2) {
                                        var69.method3414();
                                        var69.field3.field2704 = false;
                                    }
                                }
                                if (Statics.field1696 == 0) {
                                    field425 = null;
                                    field426 = null;
                                }
                                if (!field418) {
                                    field399[0] = class148.field2358;
                                    field400[0] = "";
                                    field479[0] = 1006;
                                    field377 = 1;
                                }
                            }
                            boolean var70;
                            if (class132.field2053 >= var12 && class132.field2054 >= var13 && class132.field2053 < var14 && class132.field2054 < var15) {
                                var70 = true;
                            } else {
                                var70 = false;
                            }
                            boolean var71 = false;
                            if ((class132.field2065 == 1 || !Statics.field134 && class132.field2065 == 4) && var70) {
                                var71 = true;
                            }
                            boolean var72 = false;
                            if ((class132.field2059 == 1 || !Statics.field134 && class132.field2059 == 4) && class132.field2060 >= var12 && class132.field2048 >= var13 && class132.field2060 < var14 && class132.field2048 < var15) {
                                var72 = true;
                            }
                            if (var72) {
                                method3(var9, class132.field2060 - var10, class132.field2048 - var11);
                            }
                            if (field425 != null && field425 != var9 && var70 && class169.method36(method1969(var9))) {
                                field429 = var9;
                            }
                            if (field426 == var9) {
                                field430 = true;
                                field431 = var10;
                                field432 = var11;
                            }
                            if (var9.field2736) {
                                if (var70 && field452 != 0 && var9.field2737 != null) {
                                    class1 var73 = new class1();
                                    var73.field2 = true;
                                    var73.field3 = var9;
                                    var73.field13 = field452;
                                    var73.field5 = var9.field2737;
                                    field244.method3319(var73);
                                }
                                if (field425 != null || Statics.field1950 != null || field418) {
                                    var72 = false;
                                    var71 = false;
                                    var70 = false;
                                }
                                if (!var9.field2762 && var72) {
                                    var9.field2762 = true;
                                    if (var9.field2766 != null) {
                                        class1 var74 = new class1();
                                        var74.field2 = true;
                                        var74.field3 = var9;
                                        var74.field4 = class132.field2060 - var10;
                                        var74.field13 = class132.field2048 - var11;
                                        var74.field5 = var9.field2766;
                                        field244.method3319(var74);
                                    }
                                }
                                if (var9.field2762 && var71 && var9.field2719 != null) {
                                    class1 var75 = new class1();
                                    var75.field2 = true;
                                    var75.field3 = var9;
                                    var75.field4 = class132.field2053 - var10;
                                    var75.field13 = class132.field2054 - var11;
                                    var75.field5 = var9.field2719;
                                    field244.method3319(var75);
                                }
                                if (var9.field2762 && !var71) {
                                    var9.field2762 = false;
                                    if (var9.field2729 != null) {
                                        class1 var76 = new class1();
                                        var76.field2 = true;
                                        var76.field3 = var9;
                                        var76.field4 = class132.field2053 - var10;
                                        var76.field13 = class132.field2054 - var11;
                                        var76.field5 = var9.field2729;
                                        field455.method3319(var76);
                                    }
                                }
                                if (var71 && var9.field2721 != null) {
                                    class1 var77 = new class1();
                                    var77.field2 = true;
                                    var77.field3 = var9;
                                    var77.field4 = class132.field2053 - var10;
                                    var77.field13 = class132.field2054 - var11;
                                    var77.field5 = var9.field2721;
                                    field244.method3319(var77);
                                }
                                if (!var9.field2704 && var70) {
                                    var9.field2704 = true;
                                    if (var9.field2722 != null) {
                                        class1 var78 = new class1();
                                        var78.field2 = true;
                                        var78.field3 = var9;
                                        var78.field4 = class132.field2053 - var10;
                                        var78.field13 = class132.field2054 - var11;
                                        var78.field5 = var9.field2722;
                                        field244.method3319(var78);
                                    }
                                }
                                if (var9.field2704 && var70 && var9.field2723 != null) {
                                    class1 var79 = new class1();
                                    var79.field2 = true;
                                    var79.field3 = var9;
                                    var79.field4 = class132.field2053 - var10;
                                    var79.field13 = class132.field2054 - var11;
                                    var79.field5 = var9.field2723;
                                    field244.method3319(var79);
                                }
                                if (var9.field2704 && !var70) {
                                    var9.field2704 = false;
                                    if (var9.field2724 != null) {
                                        class1 var80 = new class1();
                                        var80.field2 = true;
                                        var80.field3 = var9;
                                        var80.field4 = class132.field2053 - var10;
                                        var80.field13 = class132.field2054 - var11;
                                        var80.field5 = var9.field2724;
                                        field455.method3319(var80);
                                    }
                                }
                                if (var9.field2718 != null) {
                                    class1 var81 = new class1();
                                    var81.field3 = var9;
                                    var81.field5 = var9.field2718;
                                    field454.method3319(var81);
                                }
                                if (var9.field2754 != null && field468 > var9.field2764) {
                                    if (var9.field2738 == null || field468 - var9.field2764 > 32) {
                                        class1 var86 = new class1();
                                        var86.field3 = var9;
                                        var86.field5 = var9.field2754;
                                        field244.method3319(var86);
                                    } else {
                                        label742: for (int var82 = var9.field2764; var82 < field468; var82++) {
                                            int var83 = field438[var82 & 0x1F];
                                            for (int var84 = 0; var84 < var9.field2738.length; var84++) {
                                                if (var9.field2738[var84] == var83) {
                                                    class1 var85 = new class1();
                                                    var85.field3 = var9;
                                                    var85.field5 = var9.field2754;
                                                    field244.method3319(var85);
                                                    break label742;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2764 = field468;
                                }
                                if (var9.field2751 != null && field362 > var9.field2752) {
                                    if (var9.field2678 == null || field362 - var9.field2752 > 32) {
                                        class1 var91 = new class1();
                                        var91.field3 = var9;
                                        var91.field5 = var9.field2751;
                                        field244.method3319(var91);
                                    } else {
                                        label718: for (int var87 = var9.field2752; var87 < field362; var87++) {
                                            int var88 = field440[var87 & 0x1F];
                                            for (int var89 = 0; var89 < var9.field2678.length; var89++) {
                                                if (var9.field2678[var89] == var88) {
                                                    class1 var90 = new class1();
                                                    var90.field3 = var9;
                                                    var90.field5 = var9.field2751;
                                                    field244.method3319(var90);
                                                    break label718;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2752 = field362;
                                }
                                if (var9.field2733 != null && field508 > var9.field2732) {
                                    if (var9.field2734 == null || field508 - var9.field2732 > 32) {
                                        class1 var96 = new class1();
                                        var96.field3 = var9;
                                        var96.field5 = var9.field2733;
                                        field244.method3319(var96);
                                    } else {
                                        label694: for (int var92 = var9.field2732; var92 < field508; var92++) {
                                            int var93 = field442[var92 & 0x1F];
                                            for (int var94 = 0; var94 < var9.field2734.length; var94++) {
                                                if (var9.field2734[var94] == var93) {
                                                    class1 var95 = new class1();
                                                    var95.field3 = var9;
                                                    var95.field5 = var9.field2733;
                                                    field244.method3319(var95);
                                                    break label694;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2732 = field508;
                                }
                                if (field472 > var9.field2763 && var9.field2675 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field5 = var9.field2675;
                                    field244.method3319(var97);
                                }
                                if (field445 > var9.field2763 && var9.field2740 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field5 = var9.field2740;
                                    field244.method3319(var98);
                                }
                                if (field405 > var9.field2763 && var9.field2741 != null) {
                                    class1 var99 = new class1();
                                    var99.field3 = var9;
                                    var99.field5 = var9.field2741;
                                    field244.method3319(var99);
                                }
                                if (field421 > var9.field2763 && var9.field2712 != null) {
                                    class1 var100 = new class1();
                                    var100.field3 = var9;
                                    var100.field5 = var9.field2712;
                                    field244.method3319(var100);
                                }
                                if (field354 > var9.field2763 && var9.field2747 != null) {
                                    class1 var101 = new class1();
                                    var101.field3 = var9;
                                    var101.field5 = var9.field2747;
                                    field244.method3319(var101);
                                }
                                if (field449 > var9.field2763 && var9.field2742 != null) {
                                    class1 var102 = new class1();
                                    var102.field3 = var9;
                                    var102.field5 = var9.field2742;
                                    field244.method3319(var102);
                                }
                                var9.field2763 = field437;
                                if (var9.field2739 != null) {
                                    for (int var103 = 0; var103 < field525; var103++) {
                                        class1 var104 = new class1();
                                        var104.field3 = var9;
                                        var104.field1 = field480[var103];
                                        var104.field9 = field531[var103];
                                        var104.field5 = var9.field2739;
                                        field244.method3319(var104);
                                    }
                                }
                            }
                        }
                        if (!var9.field2648 && field425 == null && Statics.field1950 == null && !field418) {
                            if ((var9.field2735 >= 0 || var9.field2665 != 0) && class132.field2053 >= var12 && class132.field2054 >= var13 && class132.field2053 < var14 && class132.field2054 < var15) {
                                if (var9.field2735 >= 0) {
                                    Statics.field584 = arg0[var9.field2735];
                                } else {
                                    Statics.field584 = var9;
                                }
                            }
                            if (var9.field2765 == 8 && class132.field2053 >= var12 && class132.field2054 >= var13 && class132.field2053 < var14 && class132.field2054 < var15) {
                                Statics.field66 = var9;
                            }
                            if (var9.field2750 > var9.field2654) {
                                int var105 = var9.field2653 + var10;
                                int var106 = var9.field2654;
                                int var107 = var9.field2750;
                                int var108 = class132.field2053;
                                int var109 = class132.field2054;
                                if (field376) {
                                    field332 = 32;
                                } else {
                                    field332 = 0;
                                }
                                field376 = false;
                                if (class132.field2065 == 1 || !Statics.field134 && class132.field2065 == 4) {
                                    if (var108 >= var105 && var108 < var105 + 16 && var109 >= var11 && var109 < var11 + 16) {
                                        var9.field2630 -= 4;
                                        method3247(var9);
                                    } else if (var108 >= var105 && var108 < var105 + 16 && var109 >= var11 + var106 - 16 && var109 < var11 + var106) {
                                        var9.field2630 += 4;
                                        method3247(var9);
                                    } else if (var108 >= var105 - field332 && var108 < field332 + var105 + 16 && var109 >= var11 + 16 && var109 < var11 + var106 - 16) {
                                        int var110 = (var106 - 32) * var106 / var107;
                                        if (var110 < 8) {
                                            var110 = 8;
                                        }
                                        int var111 = var109 - var11 - 16 - var110 / 2;
                                        int var112 = var106 - 32 - var110;
                                        var9.field2630 = (var107 - var106) * var111 / var112;
                                        method3247(var9);
                                        field376 = true;
                                    }
                                }
                                if (field452 != 0) {
                                    int var113 = var9.field2653;
                                    if (var108 >= var105 - var113 && var109 >= var11 && var108 < var105 + 16 && var109 <= var11 + var106) {
                                        var9.field2630 += field452 * 45;
                                        method3247(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field443 == 0 || field443 == 3) && (class132.field2059 == 1 || !Statics.field134 && class132.field2059 == 4)) {
                        class166 var26 = var9.method2944();
                        if (var26 != null) {
                            int var27 = class132.field2060 - var10;
                            int var28 = class132.field2048 - var11;
                            if (var26.method2995(var27, var28)) {
                                int var29 = var27 - var26.field2780 / 2;
                                int var30 = var28 - var26.field2779 / 2;
                                int var31 = field330 + field321 & 0x7FF;
                                int var32 = class86.field1515[var31];
                                int var33 = class86.field1516[var31];
                                int var34 = (field268 + 256) * var32 >> 8;
                                int var35 = (field268 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field579.field749 + var36 >> 7;
                                int var39 = Statics.field579.field752 - var37 >> 7;
                                field397.method2386(53);
                                field397.method2112(18);
                                field397.method2159(Statics.field1084 + var39);
                                field397.method2160(Statics.field1912 + var38);
                                field397.method2150(class129.field2017[82] ? (class129.field2017[81] ? 2 : 1) : 0);
                                field397.method2112(var29);
                                field397.method2112(var30);
                                field397.method2201(field330);
                                field397.method2112(57);
                                field397.method2112(field321);
                                field397.method2112(field268);
                                field397.method2112(89);
                                field397.method2201(Statics.field579.field749);
                                field397.method2201(Statics.field579.field752);
                                field397.method2112(63);
                                field393 = var38;
                                field446 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ct.db(III)V")
    public static final void method1859(int arg0, int arg1) {
        if (class164.method2749(arg0)) {
            method2071(Statics.field2726[arg0], arg1);
        }
    }

    @ObfuscatedName("dp.dx([Lfx;II)V")
    public static final void method2071(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2765 == 0) {
                    if (var3.field2731 != null) {
                        method2071(var3.field2731, arg1);
                    }
                    class4 var4 = (class4) field413.method3297((long) var3.field2684);
                    if (var4 != null) {
                        method1859(var4.field58, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2756 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field5 = var3.field2756;
                    class34.method152(var5, 200000);
                }
                if (arg1 == 1 && var3.field2744 != null) {
                    if (var3.field2640 >= 0) {
                        class164 var6 = class164.method145(var3.field2684);
                        if (var6 == null || var6.field2731 == null || var3.field2640 >= var6.field2731.length || var6.field2731[var3.field2640] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field5 = var3.field2744;
                    class34.method152(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("b.dz(Lfx;IIB)V")
    public static final void method3(class164 arg0, int arg1, int arg2) {
        if (field425 != null || field418 || arg0 == null) {
            return;
        }
        class164 var3 = arg0;
        int var4 = method1969(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class164 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class164.method145(var3.field2657);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class164 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2692;
        }
        if (var9 == null) {
            return;
        }
        field425 = arg0;
        class164 var11 = arg0;
        int var12 = method1969(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class164 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class164.method145(var11.field2657);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class164 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2692;
        }
        field426 = var17;
        field427 = arg1;
        field428 = arg2;
        Statics.field1696 = 0;
        field264 = false;
        if (field377 > 0) {
            int var19 = field377 - 1;
            Statics.field1719 = new class29();
            Statics.field1719.field653 = field395[var19];
            Statics.field1719.field645 = field408[var19];
            Statics.field1719.field644 = field479[var19];
            Statics.field1719.field647 = field398[var19];
            Statics.field1719.field648 = field399[var19];
        }
        return;
    }

    @ObfuscatedName("fa.dj(Lfx;I)V")
    public static void method3247(class164 arg0) {
        if (field458 == arg0.field2768) {
            field492[arg0.field2767] = true;
        }
    }

    @ObfuscatedName("al.dv(I)V")
    public static void method615() {
        for (class4 var0 = (class4) field413.method3286(); var0 != null; var0 = (class4) field413.method3291()) {
            int var1 = var0.field58;
            if (class164.method2749(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2726[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2648;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3006;
                    class164 var6 = class164.method145(var5);
                    if (var6 != null) {
                        method3247(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.dt([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method172(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("do.dy(IB)V")
    public static final void method2536(int arg0) {
        if (!class164.method2749(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2726[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2705 = 0;
                var3.field2688 = 0;
            }
        }
    }

    @ObfuscatedName("fg.dg(IB)V")
    public static final void method2939(int arg0) {
        if (class164.method2749(arg0)) {
            method107(Statics.field2726[arg0], -1);
        }
    }

    @ObfuscatedName("m.dn([Lfx;II)V")
    public static final void method107(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2657 == arg1 && (!var3.field2648 || !method545(var3))) {
                if (var3.field2765 == 0) {
                    if (!var3.field2648 && method545(var3) && Statics.field584 != var3) {
                        continue;
                    }
                    method107(arg0, var3.field2684);
                    if (var3.field2731 != null) {
                        method107(var3.field2731, var3.field2684);
                    }
                    class4 var4 = (class4) field413.method3297((long) var3.field2684);
                    if (var4 != null) {
                        method2939(var4.field58);
                    }
                }
                if (var3.field2765 == 6) {
                    if (var3.field2683 != -1 || var3.field2746 != -1) {
                        boolean var5 = method3420(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2746;
                        } else {
                            var6 = var3.field2683;
                        }
                        if (var6 != -1) {
                            class40 var7 = class40.method512(var6);
                            var3.field2688 += field326;
                            while (var3.field2688 > var7.field925[var3.field2705]) {
                                var3.field2688 -= var7.field925[var3.field2705];
                                var3.field2705++;
                                if (var3.field2705 >= var7.field928.length) {
                                    var3.field2705 -= var7.field922;
                                    if (var3.field2705 < 0 || var3.field2705 >= var7.field928.length) {
                                        var3.field2705 = 0;
                                    }
                                }
                                method3247(var3);
                            }
                        }
                    }
                    if (var3.field2689 != 0 && !var3.field2648) {
                        int var8 = var3.field2689 >> 16;
                        int var9 = var3.field2689 << 16 >> 16;
                        int var10 = field326 * var8;
                        int var11 = field326 * var9;
                        var3.field2687 = var3.field2687 + var10 & 0x7FF;
                        var3.field2662 = var3.field2662 + var11 & 0x7FF;
                        method3247(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.dq(II)V")
    public static final void method147(int arg0) {
        method615();
        class22.method2752();
        class48 var1 = (class48) class48.field1089.method3254((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1092.method2819(16, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method925(new class111(var3));
            }
            class48.field1089.method3256(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1087;
        if (var5 == 0) {
            return;
        }
        int var6 = class167.field2786[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class86.method1782(0.9D);
                ((class90) Statics.field1500).method1868(0.9D);
            }
            if (var6 == 2) {
                class86.method1782(0.8D);
                ((class90) Statics.field1500).method1868(0.8D);
            }
            if (var6 == 3) {
                class86.method1782(0.7D);
                ((class90) Statics.field1500).method1868(0.7D);
            }
            if (var6 == 4) {
                class86.method1782(0.6D);
                ((class90) Statics.field1500).method1868(0.6D);
            }
            class47.field1036.method3258();
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
            if (field493 != var7) {
                if (field493 == 0 && field469 != -1) {
                    class174.method3006(Statics.field2034, field469, 0, var7, false);
                    field495 = false;
                } else if (var7 == 0) {
                    Statics.field2533.method3180();
                    class174.field2838 = 1;
                    Statics.field2842 = null;
                    field495 = false;
                } else {
                    Statics.method2735(var7);
                }
                field493 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field496 = 127;
            }
            if (var6 == 1) {
                field496 = 96;
            }
            if (var6 == 2) {
                field496 = 64;
            }
            if (var6 == 3) {
                field496 = 32;
            }
            if (var6 == 4) {
                field496 = 0;
            }
        }
        if (var5 == 5) {
            field292 = var6;
        }
        if (var5 == 6) {
            field320 = var6;
        }
        if (var5 == 9) {
            field415 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field375 = 127;
            }
            if (var6 == 1) {
                field375 = 96;
            }
            if (var6 == 2) {
                field375 = 64;
            }
            if (var6 == 3) {
                field375 = 32;
            }
            if (var6 == 4) {
                field375 = 0;
            }
        }
        if (var5 == 17) {
            field420 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            class19[] var8 = new class19[] { class19.field538, class19.field537, class19.field541 };
            field494 = (class19) class101.method2555(var8, var6);
            if (field494 == null) {
                field494 = class19.field541;
            }
        }
        if (var5 != 19) {
            return;
        }
        if (var6 == -1) {
            field363 = -1;
        } else {
            field363 = var6 & 0x7FF;
        }
    }

    @ObfuscatedName("au.dl(Lfx;I)V")
    public static final void method667(class164 arg0) {
        int var1 = arg0.field2642;
        if (var1 == 324) {
            if (field530 == -1) {
                field530 = arg0.field2671;
                field382 = arg0.field2672;
            }
            if (field327.field2798) {
                arg0.field2671 = field530;
            } else {
                arg0.field2671 = field382;
            }
        } else if (var1 == 325) {
            if (field530 == -1) {
                field530 = arg0.field2671;
                field382 = arg0.field2672;
            }
            if (field327.field2798) {
                arg0.field2671 = field382;
            } else {
                arg0.field2671 = field530;
            }
        } else if (var1 == 327) {
            arg0.field2687 = 150;
            arg0.field2662 = (int) (Math.sin((double) field259 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2679 = 5;
            arg0.field2680 = 0;
        } else if (var1 == 328) {
            arg0.field2687 = 150;
            arg0.field2662 = (int) (Math.sin((double) field259 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2679 = 5;
            arg0.field2680 = 1;
        }
    }

    @ObfuscatedName("bw.da(Lk;ZS)V")
    public static final void method1084(class4 arg0, boolean arg1) {
        int var2 = arg0.field58;
        int var3 = (int) arg0.field3006;
        arg0.method3414();
        if (arg1 && var2 != -1 && Statics.field2628[var2]) {
            Statics.field2629.method2847(var2);
            if (Statics.field2726[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2726[var2].length; var5++) {
                    if (Statics.field2726[var2][var5] != null) {
                        if (Statics.field2726[var2][var5].field2765 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2726[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2726[var2] = null;
                }
                Statics.field2628[var2] = false;
            }
        }
        method1764(var2);
        class164 var6 = class164.method145(var3);
        if (var6 != null) {
            method3247(var6);
        }
        method1858();
        if (field306 != -1) {
            method1859(field306, 1);
        }
    }

    @ObfuscatedName("an.ds(Lfx;I)Z")
    public static final boolean method828(class164 arg0) {
        int var1 = arg0.field2642;
        if (var1 == 205) {
            field299 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field327.method3023(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field327.method3024(var4, var5 == 1);
        }
        if (var1 == 324) {
            field327.method3025(false);
        }
        if (var1 == 325) {
            field327.method3025(true);
        }
        if (var1 == 326) {
            field397.method2386(140);
            field327.method3051(field397);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.dr(Lfx;IIII)V")
    public static final void method181(class164 arg0, int arg1, int arg2, int arg3) {
        method2411();
        class166 var4 = arg0.method2944();
        if (var4 == null) {
            return;
        }
        class75.method1499(arg1, arg2, var4.field2780 + arg1, var4.field2779 + arg2);
        if (field443 == 2 || field443 == 5) {
            class75.method1505(arg1, arg2, 0, var4.field2783, var4.field2782);
        } else {
            int var5 = field330 + field321 & 0x7FF;
            int var6 = Statics.field579.field749 / 32 + 48;
            int var7 = 464 - Statics.field579.field752 / 32;
            Statics.field1082.method1427(arg1, arg2, var4.field2780, var4.field2779, var6, var7, var5, field268 + 256, var4.field2783, var4.field2782);
            for (int var8 = 0; var8 < field486; var8++) {
                int var9 = field534[var8] * 4 + 2 - Statics.field579.field749 / 32;
                int var10 = field441[var8] * 4 + 2 - Statics.field579.field752 / 32;
                method2719(arg1, arg2, var9, var10, field489[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class190 var13 = field385[Statics.field50][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field579.field749 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field579.field752 / 32;
                        method2719(arg1, arg2, var14, var15, Statics.field1902[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field290; var16++) {
                class32 var17 = field289[field291[var16]];
                if (var17 != null && var17.method17()) {
                    class37 var18 = var17.field705;
                    if (var18 != null && var18.field825 != null) {
                        var18 = var18.method654();
                    }
                    if (var18 != null && var18.field828 && var18.field840) {
                        int var19 = var17.field749 / 32 - Statics.field579.field749 / 32;
                        int var20 = var17.field752 / 32 - Statics.field579.field752 / 32;
                        method2719(arg1, arg2, var19, var20, Statics.field1902[1], var4);
                    }
                }
            }
            for (int var21 = 0; var21 < field371; var21++) {
                class3 var22 = field370[field391[var21]];
                if (var22 != null && var22.method17() && !var22.field47) {
                    int var23 = var22.field749 / 32 - Statics.field579.field749 / 32;
                    int var24 = var22.field752 / 32 - Statics.field579.field752 / 32;
                    boolean var25 = false;
                    if (method4(var22.field33, true)) {
                        var25 = true;
                    }
                    boolean var26 = false;
                    for (int var27 = 0; var27 < Statics.field802; var27++) {
                        if (var22.field33.equals(Statics.field2101[var27].field588)) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (Statics.field579.field49 != 0 && var22.field49 != 0 && Statics.field579.field49 == var22.field49) {
                        var28 = true;
                    }
                    if (var25) {
                        method2719(arg1, arg2, var23, var24, Statics.field1902[3], var4);
                    } else if (var28) {
                        method2719(arg1, arg2, var23, var24, Statics.field1902[4], var4);
                    } else if (var26) {
                        method2719(arg1, arg2, var23, var24, Statics.field1902[5], var4);
                    } else {
                        method2719(arg1, arg2, var23, var24, Statics.field1902[2], var4);
                    }
                }
            }
            if (field267 != 0 && field259 % 20 < 10) {
                if (field267 == 1 && field339 >= 0 && field339 < field289.length) {
                    class32 var29 = field289[field339];
                    if (var29 != null) {
                        int var30 = var29.field749 / 32 - Statics.field579.field749 / 32;
                        int var31 = var29.field752 / 32 - Statics.field579.field752 / 32;
                        method600(arg1, arg2, var30, var31, Statics.field2554[1], var4);
                    }
                }
                if (field267 == 2) {
                    int var32 = field270 * 4 - Statics.field1912 * 4 + 2 - Statics.field579.field749 / 32;
                    int var33 = field324 * 4 - Statics.field1084 * 4 + 2 - Statics.field579.field752 / 32;
                    method600(arg1, arg2, var32, var33, Statics.field2554[1], var4);
                }
                if (field267 == 10 && field269 >= 0 && field269 < field370.length) {
                    class3 var34 = field370[field269];
                    if (var34 != null) {
                        int var35 = var34.field749 / 32 - Statics.field579.field749 / 32;
                        int var36 = var34.field752 / 32 - Statics.field579.field752 / 32;
                        method600(arg1, arg2, var35, var36, Statics.field2554[1], var4);
                    }
                }
            }
            if (field393 != 0) {
                int var37 = field393 * 4 + 2 - Statics.field579.field749 / 32;
                int var38 = field446 * 4 + 2 - Statics.field579.field752 / 32;
                method2719(arg1, arg2, var37, var38, Statics.field2554[0], var4);
            }
            if (!Statics.field579.field47) {
                class75.method1533(var4.field2780 / 2 + arg1 - 1, var4.field2779 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field298[arg3] = true;
    }

    @ObfuscatedName("af.dh(Lfx;IIIB)V")
    public static final void method932(class164 arg0, int arg1, int arg2, int arg3) {
        class166 var4 = arg0.method2944();
        if (var4 == null) {
            return;
        }
        if (field443 < 3) {
            Statics.field1595.method1427(arg1, arg2, var4.field2780, var4.field2779, 25, 25, field330, 256, var4.field2783, var4.field2782);
        } else {
            class75.method1505(arg1, arg2, 0, var4.field2783, var4.field2782);
        }
    }

    @ObfuscatedName("aw.dw(IIIILbf;Lfh;I)V")
    public static final void method600(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2719(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field330 + field321 & 0x7FF;
        int var8 = class86.field1515[var7];
        int var9 = class86.field1516[var7];
        int var10 = var8 * 256 / (field268 + 256);
        int var11 = var9 * 256 / (field268 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2534.method1426(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("el.dk(IIIILbf;Lfh;I)V")
    public static final void method2719(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field330 + field321 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class86.field1515[var6];
        int var9 = class86.field1516[var6];
        int var10 = var8 * 256 / (field268 + 256);
        int var11 = var9 * 256 / (field268 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1424(arg5.field2780 / 2 + var12 - arg4.field1331 / 2, arg5.field2779 / 2 - var13 - arg4.field1337 / 2, arg0, arg1, arg5.field2780, arg5.field2779, arg5.field2783, arg5.field2782);
        } else {
            arg4.method1415(arg5.field2780 / 2 + arg0 + var12 - arg4.field1331 / 2, arg5.field2779 / 2 + arg1 - var13 - arg4.field1337 / 2);
        }
    }

    @ObfuscatedName("b.df(Ljava/lang/String;ZB)Z")
    public static boolean method4(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method2537(arg0, Statics.field252);
        for (int var3 = 0; var3 < field502; var3++) {
            if (var2.equalsIgnoreCase(class155.method2537(field272[var3].field225, Statics.field252)) && (!arg1 || field272[var3].field220 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method2537(Statics.field579.field33, Statics.field252))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("o.dc(Ljava/lang/String;B)Z")
    public static boolean method99(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method2537(arg0, Statics.field252);
        for (int var2 = 0; var2 < field318; var2++) {
            class8 var3 = field528[var2];
            if (var1.equalsIgnoreCase(class155.method2537(var3.field119, Statics.field252))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method2537(var3.field124, Statics.field252))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("t.de(Ljava/lang/String;I)V")
    public static final void method184(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field502 < 200 || field529 == 1) || field502 >= 400) {
            class11.method2070(30, "", class148.field2372);
            return;
        }
        String var1 = class155.method2537(arg0, Statics.field252);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field502; var2++) {
            class17 var3 = field272[var2];
            String var4 = class155.method2537(var3.field225, Statics.field252);
            if (var4 != null && var4.equals(var1)) {
                class11.method2070(30, "", arg0 + class148.field2409);
                return;
            }
            if (var3.field219 != null) {
                String var5 = class155.method2537(var3.field219, Statics.field252);
                if (var5 != null && var5.equals(var1)) {
                    class11.method2070(30, "", arg0 + class148.field2409);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field318; var6++) {
            class8 var7 = field528[var6];
            String var8 = class155.method2537(var7.field119, Statics.field252);
            if (var8 != null && var8.equals(var1)) {
                class11.method2070(30, "", class148.field2373 + arg0 + class148.field2374);
                return;
            }
            if (var7.field124 != null) {
                String var9 = class155.method2537(var7.field124, Statics.field252);
                if (var9 != null && var9.equals(var1)) {
                    class11.method2070(30, "", class148.field2373 + arg0 + class148.field2374);
                    return;
                }
            }
        }
        if (class155.method2537(Statics.field579.field33, Statics.field252).equals(var1)) {
            class11.method2070(30, "", class148.field2371);
        } else {
            field397.method2386(9);
            field397.method2112(class111.method1876(arg0));
            field397.method2247(arg0);
        }
    }

    @ObfuscatedName("ej.do(Ljava/lang/String;ZI)V")
    public static final void method2583(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field318 < 100 || field529 == 1) || field318 >= 400) {
            class11.method2070(31, "", class148.field2246);
            return;
        }
        String var2 = class155.method2537(arg0, Statics.field252);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field318; var3++) {
            class8 var4 = field528[var3];
            String var5 = class155.method2537(var4.field119, Statics.field252);
            if (var5 != null && var5.equals(var2)) {
                class11.method2070(31, "", arg0 + class148.field2370);
                return;
            }
            if (var4.field124 != null) {
                String var6 = class155.method2537(var4.field124, Statics.field252);
                if (var6 != null && var6.equals(var2)) {
                    class11.method2070(31, "", arg0 + class148.field2370);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field502; var7++) {
            class17 var8 = field272[var7];
            String var9 = class155.method2537(var8.field225, Statics.field252);
            if (var9 != null && var9.equals(var2)) {
                class11.method2070(31, "", class148.field2368 + arg0 + class148.field2203);
                return;
            }
            if (var8.field219 != null) {
                String var10 = class155.method2537(var8.field219, Statics.field252);
                if (var10 != null && var10.equals(var2)) {
                    class11.method2070(31, "", class148.field2368 + arg0 + class148.field2203);
                    return;
                }
            }
        }
        if (class155.method2537(Statics.field579.field33, Statics.field252).equals(var2)) {
            class11.method2070(31, "", class148.field2293);
        } else {
            field397.method2386(124);
            field397.method2112(class111.method1876(arg0));
            field397.method2247(arg0);
        }
    }

    @ObfuscatedName("dr.dm(Ljava/lang/String;B)V")
    public static final void method2447(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method2537(arg0, Statics.field252);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field502; var2++) {
            class17 var3 = field272[var2];
            String var4 = var3.field225;
            String var5 = class155.method2537(var4, Statics.field252);
            if (class121.method170(arg0, var1, var4, var5)) {
                field502--;
                for (int var6 = var2; var6 < field502; var6++) {
                    field272[var6] = field272[var6 + 1];
                }
                field445 = field437;
                field397.method2386(220);
                field397.method2112(class111.method1876(arg0));
                field397.method2247(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("j.eq(Ljava/lang/String;B)V")
    public static final void method536(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method2537(arg0, Statics.field252);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field318; var2++) {
            class8 var3 = field528[var2];
            String var4 = var3.field119;
            String var5 = class155.method2537(var4, Statics.field252);
            if (class121.method170(arg0, var1, var4, var5)) {
                field318--;
                for (int var6 = var2; var6 < field318; var6++) {
                    field528[var6] = field528[var6 + 1];
                }
                field445 = field437;
                field397.method2386(144);
                field397.method2112(class111.method1876(arg0));
                field397.method2247(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cs.ez(Ljava/lang/String;B)V")
    public static final void method1765(String arg0) {
        if (!arg0.equals("")) {
            field397.method2386(103);
            field397.method2112(class111.method1876(arg0));
            field397.method2247(arg0);
        }
    }

    @ObfuscatedName("db.ej(I)V")
    public static final void method2078() {
        field397.method2386(103);
        field397.method2112(0);
    }

    @ObfuscatedName("cs.ey(II)V")
    public static void method1764(int arg0) {
        for (class192 var1 = (class192) field456.method3286(); var1 != null; var1 = (class192) field456.method3291()) {
            if ((var1.field3006 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3414();
            }
        }
    }

    @ObfuscatedName("cd.ep(Lfx;I)I")
    public static int method1969(class164 arg0) {
        class192 var1 = (class192) field456.method3297(((long) arg0.field2684 << 32) + (long) arg0.field2640);
        return var1 == null ? arg0.field2708 : var1.field2992;
    }

    @ObfuscatedName("d.eb(Lfx;B)Z")
    public static boolean method545(class164 arg0) {
        if (field422) {
            if (method1969(arg0) != 0) {
                return false;
            }
            if (arg0.field2765 == 0) {
                return false;
            }
        }
        return arg0.field2658;
    }

    @ObfuscatedName("em.eu(Lfx;I)Ljava/lang/String;")
    public static String method2790(class164 arg0) {
        if (class169.method2421(method1969(arg0)) == 0) {
            return null;
        } else if (arg0.field2715 == null || arg0.field2715.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2715;
        }
    }

    @ObfuscatedName("o.eg(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method98(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field250 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field250 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field250 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field250 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field250 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field256 != null) {
            var3 = "/p=" + Statics.field256;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field255 + "/a=" + Statics.field3057 + var3 + "/";
    }
}

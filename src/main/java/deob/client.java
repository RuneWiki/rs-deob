package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class136 {

    @ObfuscatedName("client.a")
    public static boolean field345 = true;

    @ObfuscatedName("client.w")
    public static class220[] field333 = new class220[4];

    @ObfuscatedName("client.m")
    public static int field282 = 1;

    @ObfuscatedName("client.h")
    public static int field270 = 0;

    @ObfuscatedName("client.r")
    public static int field271 = 0;

    @ObfuscatedName("client.e")
    public static boolean field273 = false;

    @ObfuscatedName("client.z")
    public static boolean field274 = false;

    @ObfuscatedName("client.v")
    public static int field275 = 0;

    @ObfuscatedName("client.s")
    public static int field278 = 0;

    @ObfuscatedName("client.p")
    public static boolean field363 = true;

    @ObfuscatedName("client.d")
    public static int field280 = 0;

    @ObfuscatedName("client.j")
    public static long field292 = 1L;

    @ObfuscatedName("client.c")
    public static int field359 = -1;

    @ObfuscatedName("client.g")
    public static int field431 = -1;

    @ObfuscatedName("client.av")
    public static int field451 = -1;

    @ObfuscatedName("client.ag")
    public static boolean field471 = true;

    @ObfuscatedName("client.aq")
    public static boolean field401 = false;

    @ObfuscatedName("client.an")
    public static int field287 = 0;

    @ObfuscatedName("client.ao")
    public static int field523 = 0;

    @ObfuscatedName("client.aj")
    public static int field289 = 0;

    @ObfuscatedName("client.ax")
    public static int field436 = 0;

    @ObfuscatedName("client.ac")
    public static int field309 = 0;

    @ObfuscatedName("client.al")
    public static int field549 = 0;

    @ObfuscatedName("client.au")
    public static int field293 = 0;

    @ObfuscatedName("client.ap")
    public static int field294 = 0;

    @ObfuscatedName("client.ar")
    public static int field295 = 0;

    @ObfuscatedName("client.ah")
    public static class111 field296 = new class111(new byte[5000]);

    @ObfuscatedName("client.ab")
    public static class19 field297 = class19.field560;

    @ObfuscatedName("client.as")
    public static int field299 = 0;

    @ObfuscatedName("client.ad")
    public static int field540 = 0;

    @ObfuscatedName("client.ai")
    public static int field497 = 0;

    @ObfuscatedName("client.bk")
    public static int field306 = 0;

    @ObfuscatedName("client.bq")
    public static int field307 = 0;

    @ObfuscatedName("client.bh")
    public static int field399 = 0;

    @ObfuscatedName("client.bi")
    public static int field433 = 0;

    @ObfuscatedName("client.br")
    public static int field310 = 0;

    @ObfuscatedName("client.cn")
    public static class32[] field312 = new class32[32768];

    @ObfuscatedName("client.cs")
    public static int field313 = 0;

    @ObfuscatedName("client.cg")
    public static int[] field314 = new int[32768];

    @ObfuscatedName("client.cq")
    public static class114 field266 = new class114(5000);

    @ObfuscatedName("client.ch")
    public static class114 field316 = new class114(5000);

    @ObfuscatedName("client.cr")
    public static class114 field317 = new class114(5000);

    @ObfuscatedName("client.cd")
    public static int field318 = 0;

    @ObfuscatedName("client.cw")
    public static int field319 = 0;

    @ObfuscatedName("client.ct")
    public static int field320 = 0;

    @ObfuscatedName("client.cc")
    public static int field321 = 0;

    @ObfuscatedName("client.ck")
    public static int field322 = 0;

    @ObfuscatedName("client.ca")
    public static int field323 = 0;

    @ObfuscatedName("client.cz")
    public static int field326 = 0;

    @ObfuscatedName("client.cu")
    public static int field325 = 0;

    @ObfuscatedName("client.co")
    public static boolean field552 = false;

    @ObfuscatedName("client.dj")
    public static int field327 = 0;

    @ObfuscatedName("client.df")
    public static int field328 = 0;

    @ObfuscatedName("client.dp")
    public static int field525 = 1;

    @ObfuscatedName("client.do")
    public static int field330 = 0;

    @ObfuscatedName("client.dl")
    public static int field537 = 1;

    @ObfuscatedName("client.da")
    public static int field272 = 0;

    @ObfuscatedName("client.db")
    public static boolean field370 = false;

    @ObfuscatedName("client.de")
    public static int[][][] field335 = new int[4][13][13];

    @ObfuscatedName("client.di")
    public static final int[] field336 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dn")
    public static int field337 = 0;

    @ObfuscatedName("client.dt")
    public static int field510 = 2;

    @ObfuscatedName("client.dk")
    public static int field542 = 0;

    @ObfuscatedName("client.dz")
    public static int field438 = 2;

    @ObfuscatedName("client.dq")
    public static int field341 = 0;

    @ObfuscatedName("client.dw")
    public static int field461 = 1;

    @ObfuscatedName("client.ey")
    public static int field343 = 0;

    @ObfuscatedName("client.ea")
    public static int field290 = 0;

    @ObfuscatedName("client.ee")
    public static int field474 = 2;

    @ObfuscatedName("client.eh")
    public static int field346 = 0;

    @ObfuscatedName("client.ek")
    public static int field347 = 1;

    @ObfuscatedName("client.en")
    public static int field348 = 0;

    @ObfuscatedName("client.ej")
    public static int field349 = 0;

    @ObfuscatedName("client.eu")
    public static int field288 = 2301979;

    @ObfuscatedName("client.ez")
    public static int field352 = 5063219;

    @ObfuscatedName("client.ec")
    public static int field353 = 3353893;

    @ObfuscatedName("client.ev")
    public static int field505 = 7759444;

    @ObfuscatedName("client.eo")
    public static boolean field355 = false;

    @ObfuscatedName("client.ex")
    public static int field356 = 0;

    @ObfuscatedName("client.fl")
    public static int field357 = 128;

    @ObfuscatedName("client.fe")
    public static int field358 = 0;

    @ObfuscatedName("client.fq")
    public static int field350 = 0;

    @ObfuscatedName("client.fm")
    public static int field360 = 0;

    @ObfuscatedName("client.fa")
    public static int field469 = 0;

    @ObfuscatedName("client.fv")
    public static int field362 = 0;

    @ObfuscatedName("client.fz")
    public static int field423 = 0;

    @ObfuscatedName("client.fh")
    public static boolean field417 = false;

    @ObfuscatedName("client.fb")
    public static int field365 = 0;

    @ObfuscatedName("client.fu")
    public static int field366 = 0;

    @ObfuscatedName("client.ft")
    public static int field367 = 50;

    @ObfuscatedName("client.fx")
    public static int[] field368 = new int[field367];

    @ObfuscatedName("client.fr")
    public static int[] field301 = new int[field367];

    @ObfuscatedName("client.fg")
    public static int[] field369 = new int[field367];

    @ObfuscatedName("client.fj")
    public static int[] field371 = new int[field367];

    @ObfuscatedName("client.fp")
    public static int[] field372 = new int[field367];

    @ObfuscatedName("client.fs")
    public static int[] field373 = new int[field367];

    @ObfuscatedName("client.fw")
    public static int[] field342 = new int[field367];

    @ObfuscatedName("client.ff")
    public static String[] field375 = new String[field367];

    @ObfuscatedName("client.gg")
    public static int[][] field376 = new int[104][104];

    @ObfuscatedName("client.gx")
    public static int field334 = 0;

    @ObfuscatedName("client.gz")
    public static int field378 = -1;

    @ObfuscatedName("client.gi")
    public static int field379 = -1;

    @ObfuscatedName("client.gt")
    public static int field380 = 0;

    @ObfuscatedName("client.gh")
    public static int field381 = 0;

    @ObfuscatedName("client.gr")
    public static int field382 = 0;

    @ObfuscatedName("client.gc")
    public static int field383 = 0;

    @ObfuscatedName("client.gp")
    public static int field384 = 0;

    @ObfuscatedName("client.gn")
    public static int field385 = 0;

    @ObfuscatedName("client.gf")
    public static int field459 = 0;

    @ObfuscatedName("client.ge")
    public static int field387 = 0;

    @ObfuscatedName("client.gv")
    public static int field388 = 0;

    @ObfuscatedName("client.ga")
    public static int field389 = 0;

    @ObfuscatedName("client.gs")
    public static boolean field519 = false;

    @ObfuscatedName("client.gd")
    public static int field391 = 0;

    @ObfuscatedName("client.gl")
    public static int field392 = 0;

    @ObfuscatedName("client.gk")
    public static class3[] field393 = new class3[2048];

    @ObfuscatedName("client.gy")
    public static int field501 = 0;

    @ObfuscatedName("client.gw")
    public static int[] field517 = new int[2048];

    @ObfuscatedName("client.gb")
    public static int field396 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field397 = new int[2048];

    @ObfuscatedName("client.hc")
    public static class111[] field398 = new class111[2048];

    @ObfuscatedName("client.hk")
    public static int field340 = -1;

    @ObfuscatedName("client.hq")
    public static int field324 = 0;

    @ObfuscatedName("client.he")
    public static int field504 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field402 = new int[1000];

    @ObfuscatedName("client.ho")
    public static final int[] field403 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hx")
    public static String[] field404 = new String[8];

    @ObfuscatedName("client.hz")
    public static boolean[] field418 = new boolean[8];

    @ObfuscatedName("client.hp")
    public static int[] field406 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hb")
    public static int field277 = -1;

    @ObfuscatedName("client.hj")
    public static class190[][][] field408 = new class190[4][104][104];

    @ObfuscatedName("client.hw")
    public static class190 field409 = new class190();

    @ObfuscatedName("client.ha")
    public static class190 field410 = new class190();

    @ObfuscatedName("client.hd")
    public static class190 field411 = new class190();

    @ObfuscatedName("client.hg")
    public static int[] field412 = new int[25];

    @ObfuscatedName("client.hn")
    public static int[] field413 = new int[25];

    @ObfuscatedName("client.hf")
    public static int[] field414 = new int[25];

    @ObfuscatedName("client.hm")
    public static int field415 = 0;

    @ObfuscatedName("client.ht")
    public static boolean field416 = false;

    @ObfuscatedName("client.is")
    public static int field457 = 0;

    @ObfuscatedName("client.ij")
    public static int[] field511 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field419 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field283 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field421 = new int[500];

    @ObfuscatedName("client.iw")
    public static String[] field422 = new String[500];

    @ObfuscatedName("client.iu")
    public static String[] field425 = new String[500];

    @ObfuscatedName("client.io")
    public static int field470 = -1;

    @ObfuscatedName("client.if")
    public static int field484 = -1;

    @ObfuscatedName("client.ib")
    public static int field269 = 0;

    @ObfuscatedName("client.ie")
    public static int field427 = 50;

    @ObfuscatedName("client.ip")
    public static int field428 = 0;

    @ObfuscatedName("client.it")
    public static String field429 = null;

    @ObfuscatedName("client.ik")
    public static boolean field430 = false;

    @ObfuscatedName("client.iq")
    public static int field291 = -1;

    @ObfuscatedName("client.ia")
    public static int field432 = -1;

    @ObfuscatedName("client.jq")
    public static String field420 = null;

    @ObfuscatedName("client.jp")
    public static String field377 = null;

    @ObfuscatedName("client.jc")
    public static int field435 = -1;

    @ObfuscatedName("client.jd")
    public static class187 field483 = new class187(8);

    @ObfuscatedName("client.je")
    public static int field437 = 0;

    @ObfuscatedName("client.jr")
    public static int field514 = 0;

    @ObfuscatedName("client.jf")
    public static class164 field439 = null;

    @ObfuscatedName("client.jy")
    public static int field440 = 0;

    @ObfuscatedName("client.jh")
    public static int field441 = 0;

    @ObfuscatedName("client.jg")
    public static int field442 = 0;

    @ObfuscatedName("client.js")
    public static int field332 = -1;

    @ObfuscatedName("client.jj")
    public static boolean field444 = false;

    @ObfuscatedName("client.ji")
    public static boolean field445 = false;

    @ObfuscatedName("client.ja")
    public static boolean field481 = false;

    @ObfuscatedName("client.jt")
    public static class164 field447 = null;

    @ObfuscatedName("client.jw")
    public static class164 field448 = null;

    @ObfuscatedName("client.ju")
    public static class164 field446 = null;

    @ObfuscatedName("client.jv")
    public static int field450 = 0;

    @ObfuscatedName("client.jx")
    public static int field495 = 0;

    @ObfuscatedName("client.jk")
    public static class164 field452 = null;

    @ObfuscatedName("client.jn")
    public static boolean field453 = false;

    @ObfuscatedName("client.jz")
    public static int field344 = -1;

    @ObfuscatedName("client.jb")
    public static int field455 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field456 = false;

    @ObfuscatedName("client.jo")
    public static int field454 = -1;

    @ObfuscatedName("client.jl")
    public static int field531 = -1;

    @ObfuscatedName("client.ko")
    public static boolean field534 = false;

    @ObfuscatedName("client.ky")
    public static int field460 = 1;

    @ObfuscatedName("client.kc")
    public static int[] field374 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field462 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field463 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field464 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field465 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field466 = 0;

    @ObfuscatedName("client.ka")
    public static int field284 = 0;

    @ObfuscatedName("client.km")
    public static int field400 = 0;

    @ObfuscatedName("client.ku")
    public static int field424 = 0;

    @ObfuscatedName("client.kb")
    public static int field390 = 0;

    @ObfuscatedName("client.kj")
    public static int field339 = 0;

    @ObfuscatedName("client.kt")
    public static int field472 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field473 = new int[2000];

    @ObfuscatedName("client.kp")
    public static String[] field279 = new String[1000];

    @ObfuscatedName("client.kh")
    public static int field475 = 0;

    @ObfuscatedName("client.kw")
    public static class190 field476 = new class190();

    @ObfuscatedName("client.kq")
    public static class190 field477 = new class190();

    @ObfuscatedName("client.lp")
    public static class190 field478 = new class190();

    @ObfuscatedName("client.lf")
    public static class187 field479 = new class187(512);

    @ObfuscatedName("client.lj")
    public static int field304 = 0;

    @ObfuscatedName("client.lm")
    public static int field395 = -2;

    @ObfuscatedName("client.lx")
    public static boolean[] field482 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static boolean[] field298 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field539 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static int[] field286 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field486 = new int[100];

    @ObfuscatedName("client.lv")
    public static int[] field487 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field488 = new int[100];

    @ObfuscatedName("client.lw")
    public static int field489 = 0;

    @ObfuscatedName("client.lq")
    public static long field490 = 0L;

    @ObfuscatedName("client.lg")
    public static boolean field491 = true;

    @ObfuscatedName("client.lz")
    public static int field492 = 1;

    @ObfuscatedName("client.ln")
    public static int field405 = 1;

    @ObfuscatedName("client.lo")
    public static int[] field494 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ll")
    public static int field449 = 0;

    @ObfuscatedName("client.lt")
    public static int field496 = 0;

    @ObfuscatedName("client.le")
    public static String field506 = "";

    @ObfuscatedName("client.mi")
    public static long[] field281 = new long[100];

    @ObfuscatedName("client.mc")
    public static int field499 = 0;

    @ObfuscatedName("client.mf")
    public static int field268 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field386 = new int[128];

    @ObfuscatedName("client.mq")
    public static int[] field502 = new int[128];

    @ObfuscatedName("client.me")
    public static long field503 = -1L;

    @ObfuscatedName("client.md")
    public static String field500 = null;

    @ObfuscatedName("client.mn")
    public static String field331 = null;

    @ObfuscatedName("client.mr")
    public static int field468 = -1;

    @ObfuscatedName("client.mh")
    public static int field507 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field508 = new int[1000];

    @ObfuscatedName("client.mb")
    public static int[] field545 = new int[1000];

    @ObfuscatedName("client.mo")
    public static class74[] field538 = new class74[1000];

    @ObfuscatedName("client.mt")
    public static int field407 = 0;

    @ObfuscatedName("client.mx")
    public static int field512 = 0;

    @ObfuscatedName("client.ne")
    public static int field311 = 0;

    @ObfuscatedName("client.nk")
    public static int field361 = 255;

    @ObfuscatedName("client.nl")
    public static int field515 = -1;

    @ObfuscatedName("client.nq")
    public static boolean field351 = false;

    @ObfuscatedName("client.no")
    public static int field364 = 127;

    @ObfuscatedName("client.nc")
    public static int field518 = 127;

    @ObfuscatedName("client.nb")
    public static int field485 = 0;

    @ObfuscatedName("client.ni")
    public static int[] field520 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field521 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field522 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field426 = new int[50];

    @ObfuscatedName("client.nn")
    public static class54[] field524 = new class54[50];

    @ObfuscatedName("client.np")
    public static boolean field493 = false;

    @ObfuscatedName("client.oj")
    public static boolean[] field526 = new boolean[5];

    @ObfuscatedName("client.of")
    public static int[] field527 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field528 = new int[5];

    @ObfuscatedName("client.oy")
    public static int[] field529 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field530 = new int[5];

    @ObfuscatedName("client.om")
    public static short field516 = 256;

    @ObfuscatedName("client.oc")
    public static short field532 = 205;

    @ObfuscatedName("client.op")
    public static short field533 = 256;

    @ObfuscatedName("client.oe")
    public static short field434 = 320;

    @ObfuscatedName("client.oq")
    public static short field535 = 1;

    @ObfuscatedName("client.ot")
    public static short field536 = 32767;

    @ObfuscatedName("client.os")
    public static short field547 = 1;

    @ObfuscatedName("client.ob")
    public static short field467 = 32767;

    @ObfuscatedName("client.ox")
    public static int field354 = 0;

    @ObfuscatedName("client.oz")
    public static int field509 = 0;

    @ObfuscatedName("client.og")
    public static int field541 = 0;

    @ObfuscatedName("client.ow")
    public static int field443 = 0;

    @ObfuscatedName("client.oi")
    public static int field543 = 0;

    @ObfuscatedName("client.on")
    public static int field394 = 0;

    @ObfuscatedName("client.ou")
    public static int field308 = 0;

    @ObfuscatedName("client.pc")
    public static class17[] field546 = new class17[400];

    @ObfuscatedName("client.po")
    public static class186 field302 = new class186();

    @ObfuscatedName("client.pb")
    public static int field548 = 0;

    @ObfuscatedName("client.pv")
    public static class8[] field305 = new class8[400];

    @ObfuscatedName("client.pe")
    public static class170 field550 = new class170();

    @ObfuscatedName("client.pj")
    public static int field551 = -1;

    @ObfuscatedName("client.pz")
    public static int field498 = -1;

    @ObfuscatedName("client.px")
    public static class211[] field553 = new class211[8];

    @ObfuscatedName("client.w(I)V")
    public final void method239() {
    }

    public final void init() {
        if (!this.method2735()) {
            return;
        }
        class181[] var1 = new class181[] { class181.field2964, class181.field2972, class181.field2959, class181.field2969, class181.field2973, class181.field2967, class181.field2960, class181.field2970, class181.field2962, class181.field2968, class181.field2963, class181.field2965, class181.field2966, class181.field2961, class181.field2971 };
        class181[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class181 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2974);
            if (var5 != null) {
                int var6;
                class144[] var8;
                int var9;
                switch(Integer.parseInt(var4.field2974)) {
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field20)) {
                            field273 = true;
                        } else {
                            field273 = false;
                        }
                        continue;
                    case 3:
                        Statics.field458 = Integer.parseInt(var5);
                        continue;
                    case 4:
                        Statics.field1324 = (class145) class101.method979(Statics.method2663(), Integer.parseInt(var5));
                        if (Statics.field1324 == class145.field2183) {
                            Statics.field329 = class203.field3042;
                        } else {
                            Statics.field329 = class203.field3044;
                        }
                    case 5:
                    case 8:
                    default:
                        continue;
                    case 6:
                        Statics.field167 = Integer.parseInt(var5);
                        continue;
                    case 7:
                        field270 = Integer.parseInt(var5);
                        continue;
                    case 9:
                        field271 = Integer.parseInt(var5);
                        continue;
                    case 10:
                        field282 = Integer.parseInt(var5);
                        continue;
                    case 11:
                        Statics.field276 = var5;
                        continue;
                    case 12:
                        field275 = Integer.parseInt(var5);
                        continue;
                    case 13:
                        if (var5.equalsIgnoreCase(class2.field20)) {
                        }
                        continue;
                    case 14:
                        Statics.field1495 = var5;
                        continue;
                    case 15:
                        var6 = Integer.parseInt(var5);
                        class144[] var7 = new class144[] { class144.field2169, class144.field2174, class144.field2176, class144.field2168 };
                        var8 = var7;
                        var9 = 0;
                }
                class144 var11;
                while (true) {
                    if (var9 >= var8.length) {
                        var11 = null;
                        break;
                    }
                    class144 var10 = var8[var9];
                    if (var10.field2172 == var6) {
                        var11 = var10;
                        break;
                    }
                    var9++;
                }
                Statics.field1697 = var11;
            }
        }
        method554();
        Statics.field1319 = this.getCodeBase().getHost();
        String var12 = Statics.field1697.field2171;
        byte var13 = 0;
        try {
            Statics.field2131 = 16;
            Statics.field2137 = var13;
            try {
                Statics.field1602 = System.getProperty("os.name");
            } catch (Exception var51) {
                Statics.field1602 = "Unknown";
            }
            Statics.field2843 = Statics.field1602.toLowerCase();
            try {
                Statics.field2138 = System.getProperty("user.home");
                if (Statics.field2138 != null) {
                    Statics.field2138 = Statics.field2138 + "/";
                }
            } catch (Exception var50) {
            }
            try {
                if (Statics.field2843.startsWith("win")) {
                    if (Statics.field2138 == null) {
                        Statics.field2138 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2138 == null) {
                    Statics.field2138 = System.getenv("HOME");
                }
                if (Statics.field2138 != null) {
                    Statics.field2138 = Statics.field2138 + "/";
                }
            } catch (Exception var49) {
            }
            if (Statics.field2138 == null) {
                Statics.field2138 = "~/";
            }
            Statics.field1903 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2138, "/tmp/", "" };
            Statics.field2132 = new String[] { ".jagex_cache_" + Statics.field2137, ".file_store_" + Statics.field2137 };
            int var17 = 0;
            label241: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field2561 = new File(Statics.field2138, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field2561.exists()) {
                    try {
                        class218 var22 = new class218(Statics.field2561, "rw", 10000L);
                        class111 var23 = new class111((int) var22.method3725());
                        while (var23.field1890 < var23.field1889.length) {
                            int var24 = var22.method3726(var23.field1889, var23.field1890, var23.field1889.length - var23.field1890);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field1890 += var24;
                        }
                        var23.field1890 = 0;
                        int var25 = var23.method2234();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method2234();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method2243();
                            if (var26 == 1) {
                                var20 = var23.method2243();
                            }
                        } else {
                            var19 = var23.method2386();
                            if (var26 == 1) {
                                var20 = var23.method2386();
                            }
                        }
                        var22.method3724();
                    } catch (IOException var53) {
                        var53.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        if (!class141.method2669(var29, true)) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label216: for (int var30 = 0; var30 < Statics.field2132.length; var30++) {
                        for (int var31 = 0; var31 < Statics.field1903.length; var31++) {
                            File var32 = new File(Statics.field1903[var31] + Statics.field2132[var30] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var32.exists() && class141.method2669(new File(var32, "test.dat"), true)) {
                                var19 = var32.toString();
                                var21 = true;
                                break label216;
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field2138 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
                    var21 = true;
                }
                if (var20 != null) {
                    File var33 = new File(var20);
                    File var34 = new File(var19);
                    try {
                        File[] var35 = var33.listFiles();
                        File[] var36 = var35;
                        for (int var37 = 0; var37 < var36.length; var37++) {
                            File var38 = var36[var37];
                            File var39 = new File(var34, var38.getName());
                            boolean var40 = var38.renameTo(var39);
                            if (!var40) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var52) {
                        var52.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    class141.method3366(new File(var19), (File) null);
                }
                File var42 = new File(var19);
                Statics.field2128 = var42;
                if (!Statics.field2128.exists()) {
                    Statics.field2128.mkdirs();
                }
                File[] var43 = Statics.field2128.listFiles();
                if (var43 == null) {
                    break;
                }
                File[] var44 = var43;
                int var45 = 0;
                while (true) {
                    if (var45 >= var44.length) {
                        break label241;
                    }
                    File var46 = var44[var45];
                    if (!class141.method2669(var46, false)) {
                        var17++;
                        break;
                    }
                    var45++;
                }
            }
            class127.method531(Statics.field2128);
            class141.method576();
            class141.field2139 = new class219(new class218(class127.method76("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class141.field2136 = new class219(new class218(class127.method76("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1933 = new class219[Statics.field2131];
            for (int var47 = 0; var47 < Statics.field2131; var47++) {
                Statics.field1933[var47] = new class219(new class218(class127.method76("main_file_cache.idx" + var47), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var54) {
            class140.method2571((String) null, var54);
        }
        Statics.field267 = this;
        this.method2733(765, 503, 86);
    }

    @ObfuscatedName("y.h(B)V")
    public static final void method554() {
        class81.field1415 = false;
        field274 = false;
    }

    @ObfuscatedName("client.i(I)V")
    public final void method170() {
        Statics.field869 = field271 == 0 ? 43594 : field282 + 40000;
        Statics.field1003 = field271 == 0 ? 443 : field282 + 50000;
        Statics.field622 = Statics.field869;
        Statics.field2499 = class165.field2799;
        Statics.field2826 = class165.field2792;
        Statics.field1963 = class165.field2791;
        Statics.field2537 = class165.field2794;
        if (Statics.field1994.toLowerCase().indexOf("microsoft") == -1) {
            class129.field2027[44] = 71;
            class129.field2027[45] = 26;
            class129.field2027[46] = 72;
            class129.field2027[47] = 73;
            class129.field2027[59] = 57;
            class129.field2027[61] = 27;
            class129.field2027[91] = 42;
            class129.field2027[92] = 74;
            class129.field2027[93] = 43;
            class129.field2027[192] = 28;
            class129.field2027[222] = 58;
            class129.field2027[520] = 59;
        } else {
            class129.field2027[186] = 57;
            class129.field2027[187] = 27;
            class129.field2027[188] = 71;
            class129.field2027[189] = 26;
            class129.field2027[190] = 72;
            class129.field2027[191] = 73;
            class129.field2027[192] = 58;
            class129.field2027[219] = 42;
            class129.field2027[220] = 74;
            class129.field2027[221] = 43;
            class129.field2027[222] = 59;
            class129.field2027[223] = 28;
        }
        Canvas var1 = Statics.field1850;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class129.field2014);
        var1.addFocusListener(class129.field2014);
        Canvas var2 = Statics.field1850;
        var2.addMouseListener(class132.field2053);
        var2.addMouseMotionListener(class132.field2053);
        var2.addFocusListener(class132.field2053);
        class137 var3;
        try {
            var3 = new class137();
        } catch (Throwable var15) {
            var3 = null;
        }
        Statics.field64 = var3;
        if (Statics.field64 != null) {
            Statics.field64.method2560(Statics.field1850);
        }
        Statics.field2808 = new class126(255, class141.field2139, class141.field2136, 500000);
        class218 var5 = null;
        class9 var6 = new class9();
        try {
            var5 = class141.method1949("", Statics.field1324.field2184, false);
            byte[] var7 = new byte[(int) var5.method3725()];
            int var9;
            for (int var8 = 0; var8 < var7.length; var8 += var9) {
                var9 = var5.method3726(var7, var8, var7.length - var8);
                if (var9 == -1) {
                    throw new IOException();
                }
            }
            var6 = new class9(new class111(var7));
        } catch (Exception var16) {
        }
        try {
            if (var5 != null) {
                var5.method3724();
            }
        } catch (Exception var14) {
        }
        Statics.field1306 = var6;
        Statics.field161 = this.getToolkit().getSystemClipboard();
        class130.method748(this, Statics.field1876);
        if (field271 != 0) {
            field401 = true;
        }
        int var13 = Statics.field1306.field138;
        field490 = 0L;
        if (var13 >= 2) {
            field491 = true;
        } else {
            field491 = false;
        }
        method895();
        if (field278 >= 25) {
            field266.method2493(141);
            field266.method2219(method3350());
            field266.method2220(Statics.field696);
            field266.method2220(Statics.field1848);
        }
        field2103 = true;
    }

    @ObfuscatedName("client.r(I)V")
    public final void method171() {
        field280++;
        this.method174();
        while (true) {
            class190 var1 = class161.field2617;
            class160 var2;
            synchronized (class161.field2617) {
                var2 = (class160) class161.field2615.method3445();
            }
            if (var2 == null) {
                class174.method23();
                method978();
                class129 var4 = class129.field2014;
                synchronized (class129.field2014) {
                    class129.field2026++;
                    class129.field2023 = class129.field2024;
                    class129.field2022 = 0;
                    if (class129.field2018 >= 0) {
                        while (class129.field2018 != class129.field2017) {
                            int var6 = class129.field2019[class129.field2017];
                            class129.field2017 = class129.field2017 + 1 & 0x7F;
                            if (var6 < 0) {
                                class129.field2015[~var6] = false;
                            } else {
                                if (!class129.field2015[var6] && class129.field2022 < class129.field2021.length - 1) {
                                    class129.field2021[++class129.field2022 - 1] = var6;
                                }
                                class129.field2015[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class129.field2015[var5] = false;
                        }
                        class129.field2018 = class129.field2017;
                    }
                    class129.field2024 = class129.field2028;
                }
                class132 var8 = class132.field2053;
                synchronized (class132.field2053) {
                    class132.field2048 = class132.field2054;
                    class132.field2049 = class132.field2046;
                    class132.field2050 = class132.field2047;
                    class132.field2055 = class132.field2051;
                    class132.field2043 = class132.field2052;
                    class132.field2057 = class132.field2045;
                    class132.field2058 = class132.field2056;
                    class132.field2051 = 0;
                }
                if (Statics.field64 != null) {
                    int var10 = Statics.field64.method2568();
                    field475 = var10;
                }
                if (field278 == 0) {
                    method496();
                    Statics.field1914.method2580();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2100[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2109[var12] = 0L;
                    }
                    Statics.field989 = 0;
                } else if (field278 == 5) {
                    Statics.method186(this);
                    method496();
                    Statics.field1914.method2580();
                    for (int var13 = 0; var13 < 32; var13++) {
                        field2100[var13] = 0L;
                    }
                    for (int var14 = 0; var14 < 32; var14++) {
                        field2109[var14] = 0L;
                    }
                    Statics.field989 = 0;
                } else if (field278 == 10 || field278 == 11) {
                    Statics.method186(this);
                } else if (field278 == 20) {
                    Statics.method186(this);
                    method1965();
                } else if (field278 == 25) {
                    method140(false);
                    field328 = 0;
                    boolean var15 = true;
                    for (int var16 = 0; var16 < Statics.field1992.length; var16++) {
                        if (Statics.field793[var16] != -1 && Statics.field1992[var16] == null) {
                            Statics.field1992[var16] = Statics.field837.method2925(Statics.field793[var16], 0);
                            if (Statics.field1992[var16] == null) {
                                var15 = false;
                                field328++;
                            }
                        }
                        if (Statics.field2143[var16] != -1 && Statics.field649[var16] == null) {
                            Statics.field649[var16] = Statics.field837.method2926(Statics.field2143[var16], 0, Statics.field652[var16]);
                            if (Statics.field649[var16] == null) {
                                var15 = false;
                                field328++;
                            }
                        }
                    }
                    if (var15) {
                        field330 = 0;
                        boolean var17 = true;
                        for (int var18 = 0; var18 < Statics.field1992.length; var18++) {
                            byte[] var19 = Statics.field649[var18];
                            if (var19 != null) {
                                int var20 = (Statics.field1695[var18] >> 8) * 64 - Statics.field142;
                                int var21 = (Statics.field1695[var18] & 0xFF) * 64 - Statics.field57;
                                if (field370) {
                                    var20 = 10;
                                    var21 = 10;
                                }
                                var17 &= class6.method1145(var19, var20, var21);
                            }
                        }
                        if (var17) {
                            if (field272 != 0) {
                                method2173(class148.field2238 + class2.field23 + class2.field21 + 100 + "%" + class2.field19, true);
                            }
                            method978();
                            method732();
                            method978();
                            Statics.field231.method1705();
                            method978();
                            System.gc();
                            for (int var22 = 0; var22 < 4; var22++) {
                                field333[var22].method3777();
                            }
                            for (int var23 = 0; var23 < 4; var23++) {
                                for (int var24 = 0; var24 < 104; var24++) {
                                    for (int var25 = 0; var25 < 104; var25++) {
                                        class6.field68[var23][var24][var25] = 0;
                                    }
                                }
                            }
                            method978();
                            class6.method3544();
                            int var26 = Statics.field1992.length;
                            class22.method1418();
                            method140(true);
                            if (!field370) {
                                for (int var27 = 0; var27 < var26; var27++) {
                                    int var28 = (Statics.field1695[var27] >> 8) * 64 - Statics.field142;
                                    int var29 = (Statics.field1695[var27] & 0xFF) * 64 - Statics.field57;
                                    byte[] var30 = Statics.field1992[var27];
                                    if (var30 != null) {
                                        method978();
                                        class6.method813(var30, var28, var29, Statics.field1020 * 8 - 48, Statics.field1843 * 8 - 48, field333);
                                    }
                                }
                                for (int var31 = 0; var31 < var26; var31++) {
                                    int var32 = (Statics.field1695[var31] >> 8) * 64 - Statics.field142;
                                    int var33 = (Statics.field1695[var31] & 0xFF) * 64 - Statics.field57;
                                    byte[] var34 = Statics.field1992[var31];
                                    if (var34 == null && Statics.field1843 < 800) {
                                        method978();
                                        Statics.method3040(var32, var33, 64, 64);
                                    }
                                }
                                method140(true);
                                for (int var35 = 0; var35 < var26; var35++) {
                                    byte[] var36 = Statics.field649[var35];
                                    if (var36 != null) {
                                        int var37 = (Statics.field1695[var35] >> 8) * 64 - Statics.field142;
                                        int var38 = (Statics.field1695[var35] & 0xFF) * 64 - Statics.field57;
                                        method978();
                                        class6.method22(var36, var37, var38, Statics.field231, field333);
                                    }
                                }
                            }
                            if (field370) {
                                int var39 = 0;
                                label440: while (true) {
                                    if (var39 >= 4) {
                                        for (int var62 = 0; var62 < 13; var62++) {
                                            for (int var63 = 0; var63 < 13; var63++) {
                                                int var64 = field335[0][var62][var63];
                                                if (var64 == -1) {
                                                    Statics.method3040(var62 * 8, var63 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method140(true);
                                        int var65 = 0;
                                        while (true) {
                                            if (var65 >= 4) {
                                                break label440;
                                            }
                                            method978();
                                            for (int var66 = 0; var66 < 13; var66++) {
                                                for (int var67 = 0; var67 < 13; var67++) {
                                                    int var68 = field335[var65][var66][var67];
                                                    if (var68 != -1) {
                                                        int var69 = var68 >> 24 & 0x3;
                                                        int var70 = var68 >> 1 & 0x3;
                                                        int var71 = var68 >> 14 & 0x3FF;
                                                        int var72 = var68 >> 3 & 0x7FF;
                                                        int var73 = (var71 / 8 << 8) + var72 / 8;
                                                        for (int var74 = 0; var74 < Statics.field1695.length; var74++) {
                                                            if (Statics.field1695[var74] == var73 && Statics.field649[var74] != null) {
                                                                class6.method754(Statics.field649[var74], var65, var66 * 8, var67 * 8, var69, (var71 & 0x7) * 8, (var72 & 0x7) * 8, var70, Statics.field231, field333);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var65++;
                                        }
                                    }
                                    method978();
                                    for (int var40 = 0; var40 < 13; var40++) {
                                        for (int var41 = 0; var41 < 13; var41++) {
                                            boolean var42 = false;
                                            int var43 = field335[var39][var40][var41];
                                            if (var43 != -1) {
                                                int var44 = var43 >> 24 & 0x3;
                                                int var45 = var43 >> 1 & 0x3;
                                                int var46 = var43 >> 14 & 0x3FF;
                                                int var47 = var43 >> 3 & 0x7FF;
                                                int var48 = (var46 / 8 << 8) + var47 / 8;
                                                for (int var49 = 0; var49 < Statics.field1695.length; var49++) {
                                                    if (Statics.field1695[var49] == var48 && Statics.field1992[var49] != null) {
                                                        byte[] var50 = Statics.field1992[var49];
                                                        int var51 = var40 * 8;
                                                        int var52 = var41 * 8;
                                                        int var53 = (var46 & 0x7) * 8;
                                                        int var54 = (var47 & 0x7) * 8;
                                                        class220[] var55 = field333;
                                                        for (int var56 = 0; var56 < 8; var56++) {
                                                            for (int var57 = 0; var57 < 8; var57++) {
                                                                if (var51 + var56 > 0 && var51 + var56 < 103 && var52 + var57 > 0 && var52 + var57 < 103) {
                                                                    var55[var39].field3127[var51 + var56][var52 + var57] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class111 var58 = new class111(var50);
                                                        for (int var59 = 0; var59 < 4; var59++) {
                                                            for (int var60 = 0; var60 < 64; var60++) {
                                                                for (int var61 = 0; var61 < 64; var61++) {
                                                                    if (var44 == var59 && var60 >= var53 && var60 < var53 + 8 && var61 >= var54 && var61 < var54 + 8) {
                                                                        Statics.method2174(var58, var39, var51 + class168.method66(var60 & 0x7, var61 & 0x7, var45), var52 + class168.method3607(var60 & 0x7, var61 & 0x7, var45), 0, 0, var45);
                                                                    } else {
                                                                        Statics.method2174(var58, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var42 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var42) {
                                                class6.method499(var39, var40 * 8, var41 * 8);
                                            }
                                        }
                                    }
                                    var39++;
                                }
                            }
                            method140(true);
                            method732();
                            method978();
                            class6.method1481(Statics.field231, field333);
                            method140(true);
                            int var75 = class6.field69;
                            if (var75 > Statics.field665) {
                                var75 = Statics.field665;
                            }
                            if (var75 < Statics.field665 - 1) {
                                int var76 = Statics.field665 - 1;
                            }
                            if (field274) {
                                Statics.field231.method1706(class6.field69);
                            } else {
                                Statics.field231.method1706(0);
                            }
                            for (int var77 = 0; var77 < 104; var77++) {
                                for (int var78 = 0; var78 < 104; var78++) {
                                    method584(var77, var78);
                                }
                            }
                            method978();
                            for (class16 var79 = (class16) field409.method3451(); var79 != null; var79 = (class16) field409.method3448()) {
                                if (var79.field227 == -1) {
                                    var79.field226 = 0;
                                    method155(var79);
                                } else {
                                    var79.method3540();
                                }
                            }
                            class38.field891.method3376();
                            if (Statics.field1896 != null) {
                                field266.method2493(214);
                                field266.method2222(1057001181);
                            }
                            if (!field370) {
                                int var80 = (Statics.field1020 - 6) / 8;
                                int var81 = (Statics.field1020 + 6) / 8;
                                int var82 = (Statics.field1843 - 6) / 8;
                                int var83 = (Statics.field1843 + 6) / 8;
                                for (int var84 = var80 - 1; var84 <= var81 + 1; var84++) {
                                    for (int var85 = var82 - 1; var85 <= var83 + 1; var85++) {
                                        if (var84 < var80 || var84 > var81 || var85 < var82 || var85 > var83) {
                                            Statics.field837.method2943("m" + var84 + "_" + var85);
                                            Statics.field837.method2943("l" + var84 + "_" + var85);
                                        }
                                    }
                                }
                            }
                            method2920(30);
                            method978();
                            Statics.field84 = (byte[][][]) null;
                            Statics.field71 = (byte[][][]) null;
                            Statics.field60 = (byte[][][]) null;
                            Statics.field1691 = (byte[][][]) null;
                            Statics.field677 = (int[][][]) null;
                            Statics.field72 = (byte[][][]) null;
                            Statics.field73 = (int[][]) null;
                            Statics.field1112 = null;
                            Statics.field76 = null;
                            Statics.field75 = null;
                            Statics.field2150 = null;
                            Statics.field1047 = null;
                            field266.method2493(69);
                            Statics.field1914.method2580();
                            for (int var86 = 0; var86 < 32; var86++) {
                                field2100[var86] = 0L;
                            }
                            for (int var87 = 0; var87 < 32; var87++) {
                                field2109[var87] = 0L;
                            }
                            Statics.field989 = 0;
                        } else {
                            field272 = 2;
                        }
                    } else {
                        field272 = 1;
                    }
                }
                if (field278 == 30) {
                    Statics.method133();
                } else if (field278 == 40 || field278 == 45) {
                    method1965();
                }
                return;
            }
            var2.field2607.method3011(var2.field2606, (int) var2.field3018, var2.field2605, false);
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method202() {
        boolean var1;
        label293: {
            try {
                if (class174.field2863 == 2) {
                    if (Statics.field183 == null) {
                        Statics.field183 = class171.method3166(Statics.field2866, Statics.field2868, Statics.field2867);
                        if (Statics.field183 == null) {
                            var1 = false;
                            break label293;
                        }
                    }
                    if (Statics.field2490 == null) {
                        Statics.field2490 = new class55(Statics.field2861, Statics.field2860);
                    }
                    if (Statics.field2862.method3266(Statics.field183, Statics.field2865, Statics.field2490, 22050)) {
                        Statics.field2862.method3306();
                        Statics.field2862.method3254(Statics.field2859);
                        Statics.field2862.method3259(Statics.field183, Statics.field2819);
                        class174.field2863 = 0;
                        Statics.field183 = null;
                        Statics.field2490 = null;
                        Statics.field2866 = null;
                        var1 = true;
                        break label293;
                    }
                }
            } catch (Exception var40) {
                var40.printStackTrace();
                Statics.field2862.method3260();
                class174.field2863 = 0;
                Statics.field183 = null;
                Statics.field2490 = null;
                Statics.field2866 = null;
            }
            var1 = false;
        }
        if (var1 && field351 && Statics.field941 != null) {
            Statics.field941.method1077();
        }
        if (field278 == 10 || field278 == 20 || field278 == 30) {
            if (field490 != 0L && class107.method1430() > field490) {
                int var4 = method3350();
                field490 = 0L;
                if (var4 >= 2) {
                    field491 = true;
                } else {
                    field491 = false;
                }
                method895();
                if (field278 >= 25) {
                    field266.method2493(141);
                    field266.method2219(method3350());
                    field266.method2220(Statics.field696);
                    field266.method2220(Statics.field1848);
                }
                field2103 = true;
            } else if (field2107) {
                class129.method2064(Statics.field1850);
                Canvas var5 = Statics.field1850;
                var5.removeMouseListener(class132.field2053);
                var5.removeMouseMotionListener(class132.field2053);
                var5.removeFocusListener(class132.field2053);
                class132.field2054 = 0;
                if (Statics.field64 != null) {
                    Statics.field64.method2561(Statics.field1850);
                }
                Statics.field267.method2734();
                Statics.field1850.setBackground(Color.black);
                Canvas var6 = Statics.field1850;
                var6.setFocusTraversalKeysEnabled(false);
                var6.addKeyListener(class129.field2014);
                var6.addFocusListener(class129.field2014);
                Canvas var7 = Statics.field1850;
                var7.addMouseListener(class132.field2053);
                var7.addMouseMotionListener(class132.field2053);
                var7.addFocusListener(class132.field2053);
                if (Statics.field64 != null) {
                    Statics.field64.method2560(Statics.field1850);
                }
                if (field435 != -1) {
                    method134(false);
                }
                field2106 = true;
            }
        }
        Dimension var8 = this.method2745();
        if (Statics.field1124 != var8.width || Statics.field683 != var8.height || field2106) {
            method895();
            field490 = class107.method1430() + 500L;
            field2106 = false;
        }
        boolean var9 = false;
        if (field2103) {
            field2103 = false;
            var9 = true;
            for (int var10 = 0; var10 < 100; var10++) {
                field482[var10] = true;
            }
        }
        if (var9) {
            method75();
        }
        if (field278 == 0) {
            class136.method1874(class30.field722, class30.field712, (Color) null, var9);
        } else if (field278 == 5) {
            class30.method2599(Statics.field2567, Statics.field639, Statics.field251, var9);
        } else if (field278 == 10 || field278 == 11) {
            class30.method2599(Statics.field2567, Statics.field639, Statics.field251, var9);
        } else if (field278 == 20) {
            class30.method2599(Statics.field2567, Statics.field639, Statics.field251, var9);
        } else if (field278 == 25) {
            if (field272 == 1) {
                if (field328 > field525) {
                    field525 = field328;
                }
                int var11 = (field525 * 50 - field328 * 50) / field525;
                method2173(class148.field2238 + class2.field23 + class2.field21 + var11 + "%" + class2.field19, false);
            } else if (field272 == 2) {
                if (field330 > field537) {
                    field537 = field330;
                }
                int var12 = (field537 * 50 - field330 * 50) / field537 + 50;
                method2173(class148.field2238 + class2.field23 + class2.field21 + var12 + "%" + class2.field19, false);
            } else {
                method2173(class148.field2238, false);
            }
        } else if (field278 == 30) {
            if (field435 != -1) {
                method2166(field435);
            }
            for (int var13 = 0; var13 < field304; var13++) {
                if (field482[var13]) {
                    field298[var13] = true;
                }
                field539[var13] = field482[var13];
                field482[var13] = false;
            }
            field395 = field280;
            field470 = -1;
            field484 = -1;
            Statics.field132 = null;
            if (field435 != -1) {
                field304 = 0;
                method111(field435, 0, 0, Statics.field696, Statics.field1848, 0, 0, -1);
            }
            class75.method1598();
            if (field416) {
                int var19 = Statics.field230;
                int var20 = Statics.field181;
                int var21 = Statics.field730;
                int var22 = Statics.field836;
                int var23 = 6116423;
                class75.method1605(var19, var20, var21, var22, var23);
                class75.method1605(var19 + 1, var20 + 1, var21 - 2, 16, 0);
                class75.method1607(var19 + 1, var20 + 18, var21 - 2, var22 - 19, 0);
                Statics.field2567.method3640(class148.field2365, var19 + 3, var20 + 14, var23, -1);
                int var24 = class132.field2049;
                int var25 = class132.field2050;
                for (int var26 = 0; var26 < field457; var26++) {
                    int var27 = (field457 - 1 - var26) * 15 + var20 + 31;
                    int var28 = 16777215;
                    if (var24 > var19 && var24 < var19 + var21 && var25 > var27 - 13 && var25 < var27 + 3) {
                        var28 = 16776960;
                    }
                    class215 var29 = Statics.field2567;
                    String var30;
                    if (field425[var26].length() > 0) {
                        var30 = field422[var26] + class148.field2372 + field425[var26];
                    } else {
                        var30 = field422[var26];
                    }
                    var29.method3640(var30, var19 + 3, var27, var28, 0);
                }
                method1699(Statics.field230, Statics.field181, Statics.field730, Statics.field836);
            } else if (field470 != -1) {
                int var14 = field470;
                int var15 = field484;
                if (field457 >= 2 || field428 != 0 || field430) {
                    String var16;
                    if (field428 == 1 && field457 < 2) {
                        var16 = class148.field2362 + class148.field2372 + field429 + " " + class2.field26;
                    } else if (field430 && field457 < 2) {
                        var16 = field420 + class148.field2372 + field377 + " " + class2.field26;
                    } else {
                        int var17 = field457 - 1;
                        String var18;
                        if (field425[var17].length() > 0) {
                            var18 = field422[var17] + class148.field2372 + field425[var17];
                        } else {
                            var18 = field422[var17];
                        }
                        var16 = var18;
                    }
                    if (field457 > 2) {
                        var16 = var16 + class2.method2073(16777215) + " " + '/' + " " + (field457 - 2) + class148.field2366;
                    }
                    Statics.field2567.method3647(var16, var14 + 4, var15 + 15, 16777215, 0, field280 / 1000);
                }
            }
            if (field489 == 3) {
                for (int var31 = 0; var31 < field304; var31++) {
                    if (field539[var31]) {
                        class75.method1604(field286[var31], field486[var31], field487[var31], field488[var31], 16711935, 128);
                    } else if (field298[var31]) {
                        class75.method1604(field286[var31], field486[var31], field487[var31], field488[var31], 16711680, 128);
                    }
                }
            }
            class22.method162(Statics.field665, Statics.field37.field789, Statics.field37.field773, field349);
            field349 = 0;
        } else if (field278 == 40) {
            method2173(class148.field2245 + class2.field23 + class148.field2224, false);
        } else if (field278 == 45) {
            method2173(class148.field2370, false);
        }
        if (field278 == 30 && field489 == 0 && !var9) {
            try {
                Graphics var32 = Statics.field1850.getGraphics();
                for (int var33 = 0; var33 < field304; var33++) {
                    if (field298[var33]) {
                        Statics.field1967.method1436(var32, field286[var33], field486[var33], field487[var33], field488[var33]);
                        field298[var33] = false;
                    }
                }
            } catch (Exception var39) {
                Statics.field1850.repaint();
            }
        } else if (field278 > 0) {
            try {
                Graphics var35 = Statics.field1850.getGraphics();
                Statics.field1967.method1435(var35, 0, 0);
                for (int var36 = 0; var36 < field304; var36++) {
                    field298[var36] = false;
                }
            } catch (Exception var38) {
                Statics.field1850.repaint();
            }
        }
    }

    @ObfuscatedName("client.f(B)V")
    public final void method173() {
        if (Statics.field124 != null) {
            Statics.field124.field195 = false;
        }
        Statics.field124 = null;
        if (Statics.field2796 != null) {
            Statics.field2796.method2724();
            Statics.field2796 = null;
        }
        if (class129.field2014 != null) {
            class129 var1 = class129.field2014;
            synchronized (class129.field2014) {
                class129.field2014 = null;
            }
        }
        if (class132.field2053 != null) {
            class132 var3 = class132.field2053;
            synchronized (class132.field2053) {
                class132.field2053 = null;
            }
        }
        Statics.field64 = null;
        if (Statics.field941 != null) {
            Statics.field941.method1074();
        }
        if (Statics.field2577 != null) {
            Statics.field2577.method1074();
        }
        class162.method556();
        Object var5 = class161.field2612;
        synchronized (class161.field2612) {
            if (class161.field2611 != 0) {
                class161.field2611 = 1;
                try {
                    class161.field2612.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class141.method984();
    }

    @ObfuscatedName("fc.e(II)V")
    public static void method2920(int arg0) {
        if (field278 == arg0) {
            return;
        }
        if (field278 == 0) {
            Statics.field1302 = null;
            Statics.field1987 = null;
            Statics.field248 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field307 = 0;
            field399 = 0;
            field433 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field172 != null) {
            Statics.field172.method2724();
            Statics.field172 = null;
        }
        if (field278 == 25) {
            field272 = 0;
            field328 = 0;
            field525 = 1;
            field330 = 0;
            field537 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method661(Statics.field1850, Statics.field2593, Statics.field1329, true, 0);
        } else if (arg0 == 20) {
            class30.method661(Statics.field1850, Statics.field2593, Statics.field1329, true, field278 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method661(Statics.field1850, Statics.field2593, Statics.field1329, false, 4);
        } else if (Statics.field719) {
            Statics.field699 = null;
            Statics.field700 = null;
            Statics.field1088 = null;
            Statics.field3109 = null;
            Statics.field701 = null;
            Statics.field2809 = null;
            Statics.field3035 = null;
            Statics.field697 = null;
            Statics.field561 = null;
            Statics.field2831 = null;
            Statics.field720 = null;
            Statics.field1461 = null;
            Statics.field1530 = null;
            Statics.field2002 = null;
            Statics.field1604 = null;
            Statics.field616 = null;
            Statics.field554 = null;
            Statics.field1854 = null;
            Statics.field1952 = null;
            Statics.field3141 = null;
            Statics.field653 = null;
            Statics.field108 = null;
            class174.method3017(2);
            class162.method249(true);
            Statics.field719 = false;
        }
        field278 = arg0;
    }

    @ObfuscatedName("client.z(B)V")
    public void method174() {
        if (field278 != 1000) {
            boolean var1 = class162.method557();
            if (!var1) {
                this.method175();
            }
        }
    }

    @ObfuscatedName("client.v(I)V")
    public void method175() {
        if (class162.field2638 >= 4) {
            this.method2753("js5crc");
            field278 = 1000;
            return;
        }
        if (class162.field2631 >= 4) {
            if (field278 <= 5) {
                this.method2753("js5io");
                field278 = 1000;
                return;
            }
            field497 = 3000;
            class162.field2631 = 3;
        }
        if (--field497 + 1 > 0) {
            return;
        }
        try {
            if (field540 == 0) {
                Statics.field300 = Statics.field202.method2609(Statics.field1319, Statics.field622);
                field540++;
            }
            if (field540 == 1) {
                if (Statics.field300.field2115 == 2) {
                    this.method176(-1);
                    return;
                }
                if (Statics.field300.field2115 == 1) {
                    field540++;
                }
            }
            if (field540 == 2) {
                Statics.field1544 = new class135((Socket) Statics.field300.field2118, Statics.field202);
                class111 var1 = new class111(5);
                var1.method2219(15);
                var1.method2222(86);
                Statics.field1544.method2714(var1.field1889, 0, 5);
                field540++;
                Statics.field303 = class107.method1430();
            }
            if (field540 == 3) {
                if (field278 <= 5 || Statics.field1544.method2712() > 0) {
                    int var2 = Statics.field1544.method2720();
                    if (var2 != 0) {
                        this.method176(var2);
                        return;
                    }
                    field540++;
                } else if (class107.method1430() - Statics.field303 > 30000L) {
                    this.method176(-2);
                    return;
                }
            }
            if (field540 == 4) {
                class162.method2065(Statics.field1544, field278 > 20);
                Statics.field300 = null;
                Statics.field1544 = null;
                field540 = 0;
                field306 = 0;
            }
        } catch (IOException var4) {
            this.method176(-3);
        }
    }

    @ObfuscatedName("client.x(IB)V")
    public void method176(int arg0) {
        Statics.field300 = null;
        Statics.field1544 = null;
        field540 = 0;
        if (Statics.field869 == Statics.field622) {
            Statics.field622 = Statics.field1003;
        } else {
            Statics.field622 = Statics.field869;
        }
        field306++;
        if (field306 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field278 <= 5) {
                this.method2753("js5connect_full");
                field278 = 1000;
            } else {
                field497 = 3000;
            }
        } else if (field306 >= 2 && arg0 == 6) {
            this.method2753("js5connect_outofdate");
            field278 = 1000;
        } else if (field306 >= 4) {
            if (field278 <= 5) {
                this.method2753("js5connect");
                field278 = 1000;
            } else {
                field497 = 3000;
            }
        }
    }

    @ObfuscatedName("p.q(I)V")
    public static void method496() {
        if (field299 == 0) {
            Statics.field231 = new class81(4, 104, 104, class6.field79);
            for (int var0 = 0; var0 < 4; var0++) {
                field333[var0] = new class220(104, 104);
            }
            Statics.field729 = new class74(512, 512);
            class30.field712 = class148.field2254;
            class30.field722 = 5;
            field299 = 20;
        } else if (field299 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1520[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1739(var1, 500, 800, 512, 334);
            class30.field712 = class148.field2225;
            class30.field722 = 10;
            field299 = 30;
        } else if (field299 == 30) {
            Statics.field1858 = method240(0, false, true, true);
            Statics.field2173 = method240(1, false, true, true);
            Statics.field140 = method240(2, true, false, true);
            Statics.field141 = method240(3, false, true, true);
            Statics.field544 = method240(4, false, true, true);
            Statics.field837 = method240(5, true, true, true);
            Statics.field241 = method240(6, true, true, false);
            Statics.field1720 = method240(7, false, true, true);
            Statics.field1329 = method240(8, false, true, true);
            Statics.field16 = method240(9, false, true, true);
            Statics.field2593 = method240(10, false, true, true);
            Statics.field264 = method240(11, false, true, true);
            Statics.field2089 = method240(12, false, true, true);
            Statics.field3050 = method240(13, true, false, true);
            Statics.field682 = method240(14, false, true, false);
            Statics.field338 = method240(15, false, true, true);
            class30.field712 = class148.field2226;
            class30.field722 = 20;
            field299 = 40;
        } else if (field299 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1858.method2997() * 4 / 100;
            int var8 = var7 + Statics.field2173.method2997() * 4 / 100;
            int var9 = var8 + Statics.field140.method2997() * 2 / 100;
            int var10 = var9 + Statics.field141.method2997() * 2 / 100;
            int var11 = var10 + Statics.field544.method2997() * 6 / 100;
            int var12 = var11 + Statics.field837.method2997() * 4 / 100;
            int var13 = var12 + Statics.field241.method2997() * 2 / 100;
            int var14 = var13 + Statics.field1720.method2997() * 60 / 100;
            int var15 = var14 + Statics.field1329.method2997() * 2 / 100;
            int var16 = var15 + Statics.field16.method2997() * 2 / 100;
            int var17 = var16 + Statics.field2593.method2997() * 2 / 100;
            int var18 = var17 + Statics.field264.method2997() * 2 / 100;
            int var19 = var18 + Statics.field2089.method2997() * 2 / 100;
            int var20 = var19 + Statics.field3050.method2997() * 2 / 100;
            int var21 = var20 + Statics.field682.method2997() * 2 / 100;
            int var22 = var21 + Statics.field338.method2997() * 2 / 100;
            if (var22 == 100) {
                class30.field712 = class148.field2228;
                class30.field722 = 30;
                field299 = 45;
            } else {
                if (var22 != 0) {
                    class30.field712 = class148.field2341 + var22 + "%";
                }
                class30.field722 = 30;
            }
        } else if (field299 == 45) {
            boolean var23 = !field274;
            Statics.field1141 = 22050;
            Statics.field1126 = var23;
            Statics.field1125 = 2;
            class175 var24 = new class175();
            var24.method3267(9, 128);
            Statics.field941 = class52.method330(Statics.field202, Statics.field1850, 0, 22050);
            Statics.field941.method1071(var24);
            class159 var25 = Statics.field338;
            class159 var26 = Statics.field682;
            class159 var27 = Statics.field544;
            Statics.field2865 = var25;
            Statics.field2860 = var26;
            Statics.field2861 = var27;
            Statics.field2862 = var24;
            Statics.field2577 = class52.method330(Statics.field202, Statics.field1850, 1, 2048);
            Statics.field189 = new class51();
            Statics.field2577.method1071(Statics.field189);
            Statics.field2547 = new class70(22050, Statics.field1141);
            class30.field712 = class148.field2229;
            class30.field722 = 35;
            field299 = 50;
        } else if (field299 == 50) {
            int var28 = 0;
            if (Statics.field639 == null) {
                Statics.field639 = class72.method157(Statics.field1329, Statics.field3050, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field251 == null) {
                Statics.field251 = class72.method157(Statics.field1329, Statics.field3050, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field2567 == null) {
                Statics.field2567 = class72.method157(Statics.field1329, Statics.field3050, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class30.field712 = class148.field2303 + var28 * 100 / 3 + "%";
                class30.field722 = 40;
            } else {
                Statics.field258 = new class151(true);
                class30.field712 = class148.field2231;
                class30.field722 = 40;
                field299 = 60;
            }
        } else if (field299 == 60) {
            class159 var29 = Statics.field2593;
            class159 var30 = Statics.field1329;
            int var31 = 0;
            if (var29.method2941("title.jpg", "")) {
                var31++;
            }
            if (var30.method2941("logo", "")) {
                var31++;
            }
            if (var30.method2941("titlebox", "")) {
                var31++;
            }
            if (var30.method2941("titlebutton", "")) {
                var31++;
            }
            if (var30.method2941("runes", "")) {
                var31++;
            }
            if (var30.method2941("title_mute", "")) {
                var31++;
            }
            if (var30.method2942("options_radio_buttons,0")) {
                var31++;
            }
            if (var30.method2942("options_radio_buttons,2")) {
                var31++;
            }
            var30.method2941("sl_back", "");
            var30.method2941("sl_flags", "");
            var30.method2941("sl_arrows", "");
            var30.method2941("sl_stars", "");
            var30.method2941("sl_button", "");
            byte var34 = 8;
            if (var31 < var34) {
                class30.field712 = class148.field2232 + var31 * 100 / var34 + "%";
                class30.field722 = 50;
            } else {
                class30.field712 = class148.field2211;
                class30.field722 = 50;
                method2920(5);
                field299 = 70;
            }
        } else if (field299 == 70) {
            if (Statics.field140.method2929()) {
                class159 var36 = Statics.field140;
                Statics.field1015 = var36;
                class39.method585(Statics.field140);
                class42.method2070(Statics.field140, Statics.field1720);
                class159 var37 = Statics.field140;
                class159 var38 = Statics.field1720;
                boolean var39 = field274;
                Statics.field2568 = var37;
                Statics.field1873 = var38;
                class38.field897 = var39;
                class159 var40 = Statics.field140;
                class159 var41 = Statics.field1720;
                Statics.field883 = var40;
                Statics.field847 = var41;
                class47.method2452(Statics.field140, Statics.field1720, field273, Statics.field639);
                class40.method619(Statics.field140, Statics.field1858, Statics.field2173);
                class41.method1963(Statics.field140, Statics.field1720);
                class159 var42 = Statics.field140;
                Statics.field1024 = var42;
                class159 var43 = Statics.field140;
                Statics.field1114 = var43;
                Statics.field1113 = Statics.field1114.method2945(16);
                class164.method129(Statics.field141, Statics.field1720, Statics.field1329, Statics.field3050);
                class159 var44 = Statics.field140;
                Statics.field1056 = var44;
                class45.method2703(Statics.field140);
                class30.field712 = class148.field2235;
                class30.field722 = 60;
                field299 = 80;
            } else {
                class30.field712 = class148.field2215 + Statics.field140.method3002() + "%";
                class30.field722 = 60;
            }
        } else if (field299 == 80) {
            int var45 = 0;
            if (Statics.field1300 == null) {
                Statics.field1300 = class72.method645(Statics.field1329, "compass", "");
            } else {
                var45++;
            }
            if (Statics.field1050 == null) {
                Statics.field1050 = class72.method645(Statics.field1329, "mapedge", "");
            } else {
                var45++;
            }
            if (Statics.field3078 == null) {
                Statics.field3078 = class72.method2158(Statics.field1329, "mapscene", "");
            } else {
                var45++;
            }
            if (Statics.field1795 == null) {
                Statics.field1795 = class72.method4(Statics.field1329, "mapfunction", "");
            } else {
                var45++;
            }
            if (Statics.field1022 == null) {
                Statics.field1022 = class72.method4(Statics.field1329, "hitmarks", "");
            } else {
                var45++;
            }
            if (Statics.field50 == null) {
                Statics.field50 = class72.method4(Statics.field1329, "headicons_pk", "");
            } else {
                var45++;
            }
            if (Statics.field1479 == null) {
                Statics.field1479 = class72.method4(Statics.field1329, "headicons_prayer", "");
            } else {
                var45++;
            }
            if (Statics.field1560 == null) {
                Statics.field1560 = class72.method4(Statics.field1329, "headicons_hint", "");
            } else {
                var45++;
            }
            if (Statics.field1163 == null) {
                Statics.field1163 = class72.method4(Statics.field1329, "mapmarker", "");
            } else {
                var45++;
            }
            if (Statics.field315 == null) {
                Statics.field315 = class72.method4(Statics.field1329, "cross", "");
            } else {
                var45++;
            }
            if (Statics.field242 == null) {
                Statics.field242 = class72.method4(Statics.field1329, "mapdots", "");
            } else {
                var45++;
            }
            if (Statics.field1929 == null) {
                Statics.field1929 = class72.method2158(Statics.field1329, "scrollbar", "");
            } else {
                var45++;
            }
            if (Statics.field2549 == null) {
                Statics.field2549 = class72.method2158(Statics.field1329, "mod_icons", "");
            } else {
                var45++;
            }
            if (var45 < 13) {
                class30.field712 = class148.field2315 + var45 * 100 / 13 + "%";
                class30.field722 = 70;
            } else {
                Statics.field3092 = Statics.field2549;
                Statics.field1050.method1520();
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 41.0D) - 20;
                for (int var50 = 0; var50 < Statics.field1795.length; var50++) {
                    Statics.field1795[var50].method1557(var46 + var49, var47 + var49, var48 + var49);
                }
                Statics.field3078[0].method1673(var46 + var49, var47 + var49, var48 + var49);
                class30.field712 = class148.field2463;
                class30.field722 = 70;
                field299 = 90;
            }
        } else if (field299 == 90) {
            if (Statics.field16.method2929()) {
                class90 var51 = new class90(Statics.field16, Statics.field1329, 20, 0.8D, field274 ? 64 : 128);
                class86.method1882(var51);
                class86.method1883(0.8D);
                class30.field712 = class148.field2239;
                class30.field722 = 90;
                field299 = 110;
            } else {
                class30.field712 = class148.field2344 + Statics.field16.method3002() + "%";
                class30.field722 = 90;
            }
        } else if (field299 == 110) {
            Statics.field124 = new class13();
            Statics.field202.method2610(Statics.field124, 10);
            class30.field712 = class148.field2378;
            class30.field722 = 94;
            field299 = 120;
        } else if (field299 == 120) {
            if (Statics.field2593.method2941("huffman", "")) {
                class105 var52 = new class105(Statics.field2593.method2940("huffman", ""));
                Statics.field3081 = var52;
                class30.field712 = class148.field2389;
                class30.field722 = 96;
                field299 = 130;
            } else {
                class30.field712 = class148.field2384 + "%";
                class30.field722 = 96;
            }
        } else if (field299 == 130) {
            if (!Statics.field141.method2929()) {
                class30.field712 = class148.field2287 + Statics.field141.method3002() * 4 / 5 + "%";
                class30.field722 = 100;
            } else if (!Statics.field2089.method2929()) {
                class30.field712 = class148.field2287 + (80 + Statics.field2089.method3002() / 6) + "%";
                class30.field722 = 100;
            } else if (Statics.field3050.method2929()) {
                class30.field712 = class148.field2244;
                class30.field722 = 100;
                field299 = 140;
            } else {
                class30.field712 = class148.field2287 + (96 + Statics.field3050.method3002() / 20) + "%";
                class30.field722 = 100;
            }
        } else if (field299 == 140) {
            method2920(10);
        }
    }

    @ObfuscatedName("client.b(IZZZI)Lfk;")
    public static class159 method240(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2139 != null) {
            var4 = new class126(arg0, class141.field2139, Statics.field1933[arg0], 1000000);
        }
        return new class159(var4, Statics.field2808, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ct.u(B)V")
    public static final void method1965() {
        try {
            if (field307 == 0) {
                if (Statics.field2796 != null) {
                    Statics.field2796.method2724();
                    Statics.field2796 = null;
                }
                Statics.field2066 = null;
                field552 = false;
                field399 = 0;
                field307 = 1;
            }
            if (field307 == 1) {
                if (Statics.field2066 == null) {
                    Statics.field2066 = Statics.field202.method2609(Statics.field1319, Statics.field622);
                }
                if (Statics.field2066.field2115 == 2) {
                    throw new IOException();
                }
                if (Statics.field2066.field2115 == 1) {
                    Statics.field2796 = new class135((Socket) Statics.field2066.field2118, Statics.field202);
                    Statics.field2066 = null;
                    field307 = 2;
                }
            }
            if (field307 == 2) {
                field266.field1890 = 0;
                field266.method2219(14);
                Statics.field2796.method2714(field266.field1889, 0, 1);
                field317.field1890 = 0;
                field307 = 3;
            }
            if (field307 == 3) {
                if (Statics.field941 != null) {
                    Statics.field941.method1101();
                }
                if (Statics.field2577 != null) {
                    Statics.field2577.method1101();
                }
                int var0 = Statics.field2796.method2720();
                if (Statics.field941 != null) {
                    Statics.field941.method1101();
                }
                if (Statics.field2577 != null) {
                    Statics.field2577.method1101();
                }
                if (var0 != 0) {
                    method2525(var0);
                    return;
                }
                field317.field1890 = 0;
                field307 = 5;
            }
            if (field307 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field266.field1890 = 0;
                field266.method2219(1);
                field266.method2219(class30.field724.method491());
                field266.method2222(var1[0]);
                field266.method2222(var1[1]);
                field266.method2222(var1[2]);
                field266.method2222(var1[3]);
                switch(class30.field724.field2497) {
                    case 0:
                        field266.method2222((Integer) Statics.field1306.field139.get(class154.method3042(class30.field711)));
                        field266.field1890 += 4;
                        break;
                    case 1:
                        field266.field1890 += 8;
                        break;
                    case 2:
                    case 3:
                        field266.method2221(Statics.field2975);
                        field266.field1890 += 5;
                }
                field266.method2225(class30.field718);
                field266.method2339(class5.field59, class5.field63);
                field316.field1890 = 0;
                if (field278 == 40) {
                    field316.method2219(18);
                } else {
                    field316.method2219(16);
                }
                field316.method2220(0);
                int var2 = field316.field1890;
                field316.method2222(86);
                field316.method2285(field266.field1889, 0, field266.field1890);
                int var3 = field316.field1890;
                field316.method2225(class30.field711);
                field316.method2219((field491 ? 1 : 0) << 1 | (field274 ? 1 : 0));
                field316.method2220(Statics.field696);
                field316.method2220(Statics.field1848);
                class141.method2559(field316);
                field316.method2225(Statics.field276);
                field316.method2222(Statics.field458);
                class111 var4 = new class111(Statics.field258.method2845());
                Statics.field258.method2849(var4);
                field316.method2285(var4.field1889, 0, var4.field1889.length);
                field316.method2219(Statics.field167);
                field316.method2222(Statics.field1858.field2578);
                field316.method2222(Statics.field2173.field2578);
                field316.method2222(Statics.field140.field2578);
                field316.method2222(Statics.field141.field2578);
                field316.method2222(Statics.field544.field2578);
                field316.method2222(Statics.field837.field2578);
                field316.method2222(Statics.field241.field2578);
                field316.method2222(Statics.field1720.field2578);
                field316.method2222(Statics.field1329.field2578);
                field316.method2222(Statics.field16.field2578);
                field316.method2222(Statics.field2593.field2578);
                field316.method2222(Statics.field264.field2578);
                field316.method2222(Statics.field2089.field2578);
                field316.method2222(Statics.field3050.field2578);
                field316.method2222(Statics.field682.field2578);
                field316.method2222(Statics.field338.field2578);
                field316.method2252(var1, var3, field316.field1890);
                field316.method2433(field316.field1890 - var2);
                Statics.field2796.method2714(field316.field1889, 0, field316.field1890);
                field266.method2492(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field317.method2492(var1);
                field307 = 6;
            }
            if (field307 == 6 && Statics.field2796.method2712() > 0) {
                int var6 = Statics.field2796.method2720();
                if (var6 == 21 && field278 == 20) {
                    field307 = 7;
                } else if (var6 == 2) {
                    field307 = 9;
                } else if (var6 == 15 && field278 == 40) {
                    method2550();
                    return;
                } else if (var6 == 23 && field433 < 1) {
                    field433++;
                    field307 = 0;
                } else if (var6 == 29) {
                    field307 = 11;
                } else {
                    method2525(var6);
                    return;
                }
            }
            if (field307 == 7 && Statics.field2796.method2712() > 0) {
                field310 = (Statics.field2796.method2720() + 3) * 60;
                field307 = 8;
            }
            if (field307 == 8) {
                field399 = 0;
                class30.method735(class148.field2248, class148.field2256, field310 / 60 + class148.field2250);
                if (--field310 <= 0) {
                    field307 = 0;
                }
            } else {
                if (field307 == 9 && Statics.field2796.method2712() >= 13) {
                    boolean var7 = Statics.field2796.method2720() == 1;
                    Statics.field2796.method2713(field317.field1889, 0, 4);
                    field317.field1890 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field317.method2494() << 24;
                        int var10 = var9 | field317.method2494() << 16;
                        int var11 = var10 | field317.method2494() << 8;
                        int var12 = var11 | field317.method2494();
                        int var13 = class154.method3042(class30.field711);
                        if (Statics.field1306.field139.size() >= 10 && !Statics.field1306.field139.containsKey(var13)) {
                            Iterator var14 = Statics.field1306.field139.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1306.field139.put(var13, var12);
                        class9.method2700();
                    }
                    field442 = Statics.field2796.method2720();
                    field444 = Statics.field2796.method2720() == 1;
                    field340 = Statics.field2796.method2720();
                    field340 <<= 0x8;
                    field340 += Statics.field2796.method2720();
                    field324 = Statics.field2796.method2720();
                    Statics.field2796.method2713(field317.field1889, 0, 1);
                    field317.field1890 = 0;
                    field319 = field317.method2494();
                    Statics.field2796.method2713(field317.field1889, 0, 2);
                    field317.field1890 = 0;
                    field318 = field317.method2236();
                    if (field324 == 1) {
                        try {
                            class124.method2576(Statics.field267, "zap");
                        } catch (Throwable var34) {
                        }
                    } else {
                        try {
                            class124.method2576(Statics.field267, "unzap");
                        } catch (Throwable var33) {
                        }
                    }
                    field307 = 10;
                }
                if (field307 != 10) {
                    if (field307 == 11 && Statics.field2796.method2712() >= 2) {
                        field317.field1890 = 0;
                        Statics.field2796.method2713(field317.field1889, 0, 2);
                        field317.field1890 = 0;
                        Statics.field1798 = field317.method2236();
                        field307 = 12;
                    }
                    if (field307 == 12 && Statics.field2796.method2712() >= Statics.field1798) {
                        field317.field1890 = 0;
                        Statics.field2796.method2713(field317.field1889, 0, Statics.field1798);
                        field317.field1890 = 0;
                        String var29 = field317.method2242();
                        String var30 = field317.method2242();
                        String var31 = field317.method2242();
                        class30.method735(var29, var30, var31);
                        method2920(10);
                    }
                    field399++;
                    if (field399 > 2000) {
                        if (field433 < 1) {
                            if (Statics.field869 == Statics.field622) {
                                Statics.field622 = Statics.field1003;
                            } else {
                                Statics.field622 = Statics.field869;
                            }
                            field433++;
                            field307 = 0;
                        } else {
                            method2525(-3);
                        }
                    }
                } else if (Statics.field2796.method2712() >= field318) {
                    field317.field1890 = 0;
                    Statics.field2796.method2713(field317.field1889, 0, field318);
                    field292 = 1L;
                    field451 = -1;
                    Statics.field124.field187 = 0;
                    Statics.field888 = true;
                    field471 = true;
                    field503 = -1L;
                    class202.field3033 = new class193();
                    field266.field1890 = 0;
                    field317.field1890 = 0;
                    field319 = -1;
                    field322 = -1;
                    field323 = -1;
                    field326 = -1;
                    field320 = 0;
                    field287 = 0;
                    field325 = 0;
                    field523 = 0;
                    field457 = 0;
                    field416 = false;
                    class132.method2655(0);
                    class11.method627();
                    field428 = 0;
                    field430 = false;
                    field485 = 0;
                    field337 = (int) (Math.random() * 100.0D) - 50;
                    field542 = (int) (Math.random() * 110.0D) - 55;
                    field341 = (int) (Math.random() * 80.0D) - 40;
                    field290 = (int) (Math.random() * 120.0D) - 60;
                    field346 = (int) (Math.random() * 30.0D) - 20;
                    field358 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field311 = 0;
                    field468 = -1;
                    field407 = 0;
                    field512 = 0;
                    field297 = class19.field560;
                    field501 = 0;
                    field313 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field393[var17] = null;
                        field398[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field312[var18] = null;
                    }
                    Statics.field37 = field393[2047] = new class3();
                    field277 = -1;
                    field410.method3440();
                    field411.method3440();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field408[var19][var20][var21] = null;
                            }
                        }
                    }
                    field409 = new class190();
                    field308 = 0;
                    field394 = 0;
                    field548 = 0;
                    for (int var22 = 0; var22 < Statics.field1113; var22++) {
                        class48 var23 = class48.method577(var22);
                        if (var23 != null) {
                            class167.field2810[var22] = 0;
                            class167.field2811[var22] = 0;
                        }
                    }
                    for (int var24 = 0; var24 < field473.length; var24++) {
                        field473[var24] = -1;
                    }
                    field332 = -1;
                    if (field435 != -1) {
                        class164.method3124(field435);
                    }
                    for (class4 var25 = (class4) field483.method3411(); var25 != null; var25 = (class4) field483.method3417()) {
                        method752(var25, true);
                    }
                    field435 = -1;
                    field483 = new class187(8);
                    field439 = null;
                    field416 = false;
                    field457 = 0;
                    field550.method3128((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var26 = 0; var26 < 8; var26++) {
                        field404[var26] = null;
                        field418[var26] = false;
                    }
                    class15.method2897();
                    field363 = true;
                    for (int var27 = 0; var27 < 100; var27++) {
                        field482[var27] = true;
                    }
                    field266.method2493(141);
                    field266.method2219(method3350());
                    field266.method2220(Statics.field696);
                    field266.method2220(Statics.field1848);
                    field500 = null;
                    Statics.field121 = 0;
                    Statics.field1862 = null;
                    for (int var28 = 0; var28 < 8; var28++) {
                        field553[var28] = new class211();
                    }
                    Statics.field1616 = null;
                    Statics.field1020 = -1;
                    method1104(false);
                    field319 = -1;
                }
            }
        } catch (IOException var35) {
            if (field433 < 1) {
                if (Statics.field869 == Statics.field622) {
                    Statics.field622 = Statics.field1003;
                } else {
                    Statics.field622 = Statics.field869;
                }
                field433++;
                field307 = 0;
            } else {
                method2525(-2);
            }
        }
    }

    @ObfuscatedName("dr.t(S)V")
    public static void method2550() {
        field266.field1890 = 0;
        field317.field1890 = 0;
        field319 = -1;
        field322 = -1;
        field323 = -1;
        field326 = -1;
        field318 = 0;
        field320 = 0;
        field287 = 0;
        field457 = 0;
        field416 = false;
        field311 = 0;
        field407 = 0;
        for (int var0 = 0; var0 < field393.length; var0++) {
            if (field393[var0] != null) {
                field393[var0].field798 = -1;
            }
        }
        for (int var1 = 0; var1 < field312.length; var1++) {
            if (field312[var1] != null) {
                field312[var1].field798 = -1;
            }
        }
        class15.method2897();
        method2920(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field482[var2] = true;
        }
        field266.method2493(141);
        field266.method2219(method3350());
        field266.method2220(Statics.field696);
        field266.method2220(Statics.field1848);
    }

    @ObfuscatedName("dh.s(IB)V")
    public static void method2525(int arg0) {
        if (arg0 == -3) {
            class30.method735(class148.field2251, class148.field2252, class148.field2253);
        } else if (arg0 == -2) {
            class30.method735(class148.field2376, class148.field2321, class148.field2442);
        } else if (arg0 == -1) {
            class30.method735(class148.field2257, class148.field2258, class148.field2259);
        } else if (arg0 == 3) {
            class30.method735(class148.field2290, class148.field2261, class148.field2427);
        } else if (arg0 == 4) {
            class30.method735(class148.field2263, class148.field2264, class148.field2222);
        } else if (arg0 == 5) {
            class30.method735(class148.field2266, class148.field2267, class148.field2268);
        } else if (arg0 == 6) {
            class30.method735(class148.field2269, class148.field2270, class148.field2271);
        } else if (arg0 == 7) {
            class30.method735(class148.field2236, class148.field2273, class148.field2274);
        } else if (arg0 == 8) {
            class30.method735(class148.field2275, class148.field2276, class148.field2277);
        } else if (arg0 == 9) {
            class30.method735(class148.field2278, class148.field2279, class148.field2280);
        } else if (arg0 == 10) {
            class30.method735(class148.field2434, class148.field2282, class148.field2283);
        } else if (arg0 == 11) {
            class30.method735(class148.field2284, class148.field2285, class148.field2286);
        } else if (arg0 == 12) {
            class30.method735(class148.field2336, class148.field2288, class148.field2405);
        } else if (arg0 == 13) {
            class30.method735(class148.field2408, class148.field2291, class148.field2292);
        } else if (arg0 == 14) {
            class30.method735(class148.field2293, class148.field2446, class148.field2422);
        } else if (arg0 == 16) {
            class30.method735(class148.field2296, class148.field2297, class148.field2298);
        } else if (arg0 == 17) {
            class30.method735(class148.field2311, class148.field2221, class148.field2301);
        } else if (arg0 == 18) {
            class30.method735(class148.field2302, class148.field2441, class148.field2304);
        } else if (arg0 == 19) {
            class30.method735(class148.field2305, class148.field2306, class148.field2307);
        } else if (arg0 == 20) {
            class30.method735(class148.field2312, class148.field2432, class148.field2310);
        } else if (arg0 == 22) {
            class30.method735(class148.field2457, class148.field2481, class148.field2313);
        } else if (arg0 == 23) {
            class30.method735(class148.field2314, class148.field2448, class148.field2316);
        } else if (arg0 == 24) {
            class30.method735(class148.field2426, class148.field2318, class148.field2319);
        } else if (arg0 == 25) {
            class30.method735(class148.field2320, class148.field2323, class148.field2322);
        } else if (arg0 == 26) {
            class30.method735(class148.field2247, class148.field2324, class148.field2325);
        } else if (arg0 == 27) {
            class30.method735(class148.field2326, class148.field2327, class148.field2328);
        } else if (arg0 == 31) {
            class30.method735(class148.field2421, class148.field2368, class148.field2337);
        } else if (arg0 == 32) {
            class30.method735(class148.field2338, class148.field2482, class148.field2436);
        } else if (arg0 == 37) {
            class30.method735(class148.field2404, class148.field2242, class148.field2343);
        } else if (arg0 == 38) {
            class30.method735(class148.field2317, class148.field2345, class148.field2346);
        } else if (arg0 == 55) {
            class30.method735(class148.field2265, class148.field2348, class148.field2212);
        } else if (arg0 == 56) {
            class30.method735(class148.field2218, class148.field2230, class148.field2352);
            method2920(11);
            return;
        } else if (arg0 == 57) {
            class30.method735(class148.field2353, class148.field2300, class148.field2355);
            method2920(11);
            return;
        } else {
            class30.method735(class148.field2356, class148.field2357, class148.field2358);
        }
        method2920(10);
    }

    @ObfuscatedName("gl.p(B)V")
    public static final void method3557() {
        if (Statics.field2796 != null) {
            Statics.field2796.method2724();
            Statics.field2796 = null;
        }
        method732();
        Statics.field231.method1705();
        for (int var0 = 0; var0 < 4; var0++) {
            field333[var0].method3777();
        }
        System.gc();
        class174.method3017(2);
        field515 = -1;
        field351 = false;
        class22.method1418();
        method2920(10);
    }

    @ObfuscatedName("ar.d(I)V")
    public static final void method732() {
        class43.method11();
        class39.field942.method3376();
        class42.field994.method3376();
        class38.field890.method3376();
        class38.field891.method3376();
        class38.field892.method3376();
        class38.field893.method3376();
        class37.field848.method3376();
        class37.field880.method3376();
        class47.method1871();
        class40.field955.method3376();
        class40.field956.method3376();
        class41.method497();
        class44.method138();
        class48.method618();
        class170.field2820.method3376();
        class164.field2653.method3376();
        class164.field2755.method3376();
        class164.field2785.method3376();
        class164.field2656.method3376();
        ((class90) Statics.field1516).method1954();
        class20.field567.method3376();
        Statics.field1858.method2973();
        Statics.field2173.method2973();
        Statics.field141.method2973();
        Statics.field544.method2973();
        Statics.field837.method2973();
        Statics.field241.method2973();
        Statics.field1720.method2973();
        Statics.field1329.method2973();
        Statics.field16.method2973();
        Statics.field2593.method2973();
        Statics.field264.method2973();
        Statics.field2089.method2973();
    }

    @ObfuscatedName("dh.j(I)V")
    public static final void method2526() {
        if (field325 > 0) {
            method3557();
        } else {
            method2920(40);
            Statics.field172 = Statics.field2796;
            Statics.field2796 = null;
        }
    }

    @ObfuscatedName("ai.y(B)V")
    public static final void method978() {
        if (Statics.field2577 != null) {
            Statics.field2577.method1072();
        }
        if (Statics.field941 != null) {
            Statics.field941.method1072();
        }
    }

    @ObfuscatedName("v.c(B)V")
    public static final void method139() {
        for (int var0 = 0; var0 < field485; var0++) {
            int var10002 = field522[var0]--;
            if (field522[var0] >= -10) {
                class54 var2 = field524[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method1125(Statics.field544, field520[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field522[var0] += var2.method1124();
                    field524[var0] = var2;
                }
                if (field522[var0] < 0) {
                    int var9;
                    if (field426[var0] == 0) {
                        var9 = field364;
                    } else {
                        int var3 = (field426[var0] & 0xFF) * 128;
                        int var4 = field426[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field37.field789;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field426[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field37.field773;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field522[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field518 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class58 var10 = var2.method1123().method1158(Statics.field2547);
                        class60 var11 = class60.method1280(var10, 100, var9);
                        var11.method1191(field521[var0] - 1);
                        Statics.field189.method1031(var11);
                    }
                    field522[var0] = -100;
                }
            } else {
                field485--;
                for (int var1 = var0; var1 < field485; var1++) {
                    field520[var1] = field520[var1 + 1];
                    field524[var1] = field524[var1 + 1];
                    field521[var1] = field521[var1 + 1];
                    field522[var1] = field522[var1 + 1];
                    field426[var1] = field426[var1 + 1];
                }
                var0--;
            }
        }
        if (!field351) {
            return;
        }
        boolean var12;
        if (class174.field2863 == 0) {
            var12 = Statics.field2862.method3261();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field361 != 0 && field515 != -1) {
                class174.method3039(Statics.field241, field515, 0, field361, false);
            }
            field351 = false;
        }
    }

    @ObfuscatedName("k.g(Lae;IIIB)V")
    public static void method524(class40 arg0, int arg1, int arg2, int arg3) {
        if (field485 >= 50 || field518 == 0 || arg0.field960 == null || arg1 >= arg0.field960.length) {
            return;
        }
        int var4 = arg0.field960[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field520[field485] = var5;
        field521[field485] = var6;
        field522[field485] = 0;
        field524[field485] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field426[field485] = (var8 << 16) + (var9 << 8) + var7;
        field485++;
    }

    @ObfuscatedName("gk.av(IIIB)V")
    public static void method3575(int arg0, int arg1, int arg2) {
        if (field364 == 0 || arg1 == 0 || field485 >= 50) {
            return;
        }
        field520[field485] = arg0;
        field521[field485] = arg1;
        field522[field485] = arg2;
        field524[field485] = null;
        field426[field485] = 0;
        field485++;
    }

    @ObfuscatedName("ag.ag(II)V")
    public static void method582(int arg0) {
        if (arg0 == -1 && !field351) {
            class174.method3018();
        } else if (arg0 != -1 && field515 != arg0 && field361 != 0 && !field351) {
            class159 var1 = Statics.field241;
            int var2 = field361;
            class174.field2863 = 1;
            Statics.field2866 = var1;
            Statics.field2868 = arg0;
            Statics.field2867 = 0;
            Statics.field2859 = var2;
            Statics.field2819 = false;
            Statics.field1482 = 2;
        }
        field515 = arg0;
    }

    @ObfuscatedName("br.aq(IIB)V")
    public static void method1438(int arg0, int arg1) {
        if (field361 != 0 && arg0 != -1) {
            class174.method3039(Statics.field264, arg0, 0, field361, false);
            field351 = true;
        }
    }

    @ObfuscatedName("fc.an(I)V")
    public static final void method2921() {
        if (field274 && Statics.field665 != field327) {
            method1948(Statics.field1020, Statics.field1843, Statics.field665, Statics.field37.field828[0], Statics.field37.field827[0]);
        } else if (Statics.field665 != field468) {
            field468 = Statics.field665;
            int var0 = Statics.field665;
            int[] var1 = Statics.field729.field1348;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class6.field68[var0][var6][var4] & 0x18) == 0) {
                        Statics.field231.method1738(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class6.field68[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field231.method1738(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field729.method1576();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class6.field68[var0][var10][var9] & 0x18) == 0) {
                        method2702(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class6.field68[var0 + 1][var10][var9] & 0x8) != 0) {
                        method2702(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field507 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field231.method1734(Statics.field665, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class38.method2180(var14).field916;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field333[Statics.field665].field3127;
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
                            field538[field507] = Statics.field1795[var15];
                            field508[field507] = var16;
                            field545[field507] = var17;
                            field507++;
                        }
                    }
                }
            }
            Statics.field1967.method1503();
        }
    }

    @ObfuscatedName("fi.ao(Lfq;III)V")
    public static final void method3118(class164 arg0, int arg1, int arg2) {
        if (field311 != 0 && field311 != 3 || class132.field2055 != 1 && Statics.field240 || class132.field2055 != 4) {
            return;
        }
        class166 var3 = arg0.method3053();
        if (var3 == null) {
            return;
        }
        int var4 = class132.field2043 - arg1;
        int var5 = class132.field2057 - arg2;
        if (!var3.method3105(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2802 / 2;
        int var7 = var5 - var3.field2801 / 2;
        int var8 = field358 + field290 & 0x7FF;
        int var9 = class86.field1520[var8];
        int var10 = class86.field1521[var8];
        int var11 = (field346 + 256) * var9 >> 8;
        int var12 = (field346 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field37.field789 + var13 >> 7;
        int var16 = Statics.field37.field773 - var14 >> 7;
        field266.method2493(70);
        field266.method2219(18);
        field266.method2383(class129.field2015[82] ? (class129.field2015[81] ? 2 : 1) : 0);
        field266.method2244(Statics.field57 + var16);
        field266.method2314(Statics.field142 + var15);
        field266.method2219(var6);
        field266.method2219(var7);
        field266.method2220(field358);
        field266.method2219(57);
        field266.method2219(field290);
        field266.method2219(field346);
        field266.method2219(89);
        field266.method2220(Statics.field37.field789);
        field266.method2220(Statics.field37.field773);
        field266.method2219(63);
        field407 = var15;
        field512 = var16;
    }

    @ObfuscatedName("u.aj(Ljava/lang/String;B)V")
    public static final void method158(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1306.field136 = !Statics.field1306.field136;
            class9.method2700();
            if (Statics.field1306.field136) {
                class11.method2919(99, "", "Roofs are now all hidden");
            } else {
                class11.method2919(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field401 = !field401;
        }
        if (field442 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field401 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field401 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2526();
            }
            if (arg0.equalsIgnoreCase("errortest") && field271 == 2) {
                throw new RuntimeException();
            }
        }
        field266.method2493(231);
        field266.method2219(arg0.length() + 1);
        field266.method2225(arg0);
    }

    @ObfuscatedName("aj.ax(I)V")
    public static final void method621() {
        int var0 = Statics.field176 * 128 + 64;
        int var1 = Statics.field1493 * 128 + 64;
        int var2 = method686(var0, var1, Statics.field665) - Statics.field2493;
        if (Statics.field875 < var0) {
            Statics.field875 += Statics.field723 * (var0 - Statics.field875) / 1000 + Statics.field1966;
            if (Statics.field875 > var0) {
                Statics.field875 = var0;
            }
        }
        if (Statics.field875 > var0) {
            Statics.field875 -= Statics.field723 * (Statics.field875 - var0) / 1000 + Statics.field1966;
            if (Statics.field875 < var0) {
                Statics.field875 = var0;
            }
        }
        if (Statics.field2059 < var2) {
            Statics.field2059 += Statics.field723 * (var2 - Statics.field2059) / 1000 + Statics.field1966;
            if (Statics.field2059 > var2) {
                Statics.field2059 = var2;
            }
        }
        if (Statics.field2059 > var2) {
            Statics.field2059 -= Statics.field723 * (Statics.field2059 - var2) / 1000 + Statics.field1966;
            if (Statics.field2059 < var2) {
                Statics.field2059 = var2;
            }
        }
        if (Statics.field1057 < var1) {
            Statics.field1057 += Statics.field723 * (var1 - Statics.field1057) / 1000 + Statics.field1966;
            if (Statics.field1057 > var1) {
                Statics.field1057 = var1;
            }
        }
        if (Statics.field1057 > var1) {
            Statics.field1057 -= Statics.field723 * (Statics.field1057 - var1) / 1000 + Statics.field1966;
            if (Statics.field1057 < var1) {
                Statics.field1057 = var1;
            }
        }
        int var3 = Statics.field87 * 128 + 64;
        int var4 = Statics.field1034 * 128 + 64;
        int var5 = method686(var3, var4, Statics.field665) - Statics.field818;
        int var6 = var3 - Statics.field875;
        int var7 = var5 - Statics.field2059;
        int var8 = var4 - Statics.field1057;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2590 < var10) {
            Statics.field2590 += Statics.field1978 * (var10 - Statics.field2590) / 1000 + Statics.field41;
            if (Statics.field2590 > var10) {
                Statics.field2590 = var10;
            }
        }
        if (Statics.field2590 > var10) {
            Statics.field2590 -= Statics.field1978 * (Statics.field2590 - var10) / 1000 + Statics.field41;
            if (Statics.field2590 < var10) {
                Statics.field2590 = var10;
            }
        }
        int var12 = var11 - Statics.field1613;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1613 += Statics.field1978 * var12 / 1000 + Statics.field41;
            Statics.field1613 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1613 -= Statics.field1978 * -var12 / 1000 + Statics.field41;
            Statics.field1613 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1613;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1613 = var11;
        }
    }

    @ObfuscatedName("ai.ac(B)V")
    public static final void method982() {
        for (int var0 = 0; var0 < field313; var0++) {
            int var1 = field314[var0];
            class32 var2 = field312[var1];
            if (var2 != null) {
                method92(var2, var2.field743.field852);
            }
        }
    }

    @ObfuscatedName("r.al(Lal;II)V")
    public static final void method92(class35 arg0, int arg1) {
        if (arg0.field808 > field280) {
            method1696(arg0);
        } else if (arg0.field807 >= field280) {
            Statics.method3549(arg0);
        } else {
            arg0.field824 = arg0.field777;
            if (arg0.field826 == 0) {
                arg0.field830 = 0;
            } else {
                label205: {
                    if (arg0.field804 != -1 && arg0.field785 == 0) {
                        class40 var2 = Statics.method860(arg0.field804);
                        if (arg0.field831 > 0 && var2.field968 == 0) {
                            arg0.field830++;
                            break label205;
                        }
                        if (arg0.field831 <= 0 && var2.field961 == 0) {
                            arg0.field830++;
                            break label205;
                        }
                    }
                    int var3 = arg0.field789;
                    int var4 = arg0.field773;
                    int var5 = arg0.field828[arg0.field826 - 1] * 128 + arg0.field776 * 64;
                    int var6 = arg0.field827[arg0.field826 - 1] * 128 + arg0.field776 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field780 = 1280;
                            } else if (var4 > var6) {
                                arg0.field780 = 1792;
                            } else {
                                arg0.field780 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field780 = 768;
                            } else if (var4 > var6) {
                                arg0.field780 = 256;
                            } else {
                                arg0.field780 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field780 = 1024;
                        } else if (var4 > var6) {
                            arg0.field780 = 0;
                        }
                        int var7 = arg0.field780 - arg0.field774 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field788;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field792;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field832;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field782;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field792;
                        }
                        arg0.field824 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class32) {
                            var10 = ((class32) arg0).field743.field857;
                        }
                        if (var10) {
                            if (arg0.field780 != arg0.field774 && arg0.field798 == -1 && arg0.field825 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field826 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field826 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field830 > 0 && arg0.field826 > 1) {
                                var9 = 8;
                                arg0.field830--;
                            }
                        } else {
                            if (arg0.field826 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field826 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field830 > 0 && arg0.field826 > 1) {
                                var9 = 8;
                                arg0.field830--;
                            }
                        }
                        if (arg0.field829[arg0.field826 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field824 == arg0.field792 && arg0.field784 != -1) {
                            arg0.field824 = arg0.field784;
                        }
                        if (var3 < var5) {
                            arg0.field789 += var9;
                            if (arg0.field789 > var5) {
                                arg0.field789 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field789 -= var9;
                            if (arg0.field789 < var5) {
                                arg0.field789 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field773 += var9;
                            if (arg0.field773 > var6) {
                                arg0.field773 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field773 -= var9;
                            if (arg0.field773 < var6) {
                                arg0.field773 = var6;
                            }
                        }
                        if (arg0.field789 == var5 && arg0.field773 == var6) {
                            arg0.field826--;
                            if (arg0.field831 > 0) {
                                arg0.field831--;
                            }
                        }
                    } else {
                        arg0.field789 = var5;
                        arg0.field773 = var6;
                    }
                }
            }
        }
        if (arg0.field789 < 128 || arg0.field773 < 128 || arg0.field789 >= 13184 || arg0.field773 >= 13184) {
            arg0.field804 = -1;
            arg0.field809 = -1;
            arg0.field808 = 0;
            arg0.field807 = 0;
            arg0.field789 = arg0.field828[0] * 128 + arg0.field776 * 64;
            arg0.field773 = arg0.field827[0] * 128 + arg0.field776 * 64;
            arg0.method659();
        }
        if (Statics.field37 == arg0 && (arg0.field789 < 1536 || arg0.field773 < 1536 || arg0.field789 >= 11776 || arg0.field773 >= 11776)) {
            arg0.field804 = -1;
            arg0.field809 = -1;
            arg0.field808 = 0;
            arg0.field807 = 0;
            arg0.field789 = arg0.field828[0] * 128 + arg0.field776 * 64;
            arg0.field773 = arg0.field827[0] * 128 + arg0.field776 * 64;
            arg0.method659();
        }
        method1102(arg0);
        method3363(arg0);
    }

    @ObfuscatedName("cy.au(Lal;I)V")
    public static final void method1696(class35 arg0) {
        int var1 = arg0.field808 - field280;
        int var2 = arg0.field814 * 128 + arg0.field776 * 64;
        int var3 = arg0.field816 * 128 + arg0.field776 * 64;
        arg0.field789 += (var2 - arg0.field789) / var1;
        arg0.field773 += (var3 - arg0.field773) / var1;
        arg0.field830 = 0;
        if (arg0.field820 == 0) {
            arg0.field780 = 1024;
        }
        if (arg0.field820 == 1) {
            arg0.field780 = 1536;
        }
        if (arg0.field820 == 2) {
            arg0.field780 = 0;
        }
        if (arg0.field820 == 3) {
            arg0.field780 = 512;
        }
    }

    @ObfuscatedName("am.ar(Lal;I)V")
    public static final void method1102(class35 arg0) {
        if (arg0.field825 == 0) {
            return;
        }
        if (arg0.field798 != -1 && arg0.field798 < 32768) {
            class32 var1 = field312[arg0.field798];
            if (var1 != null) {
                int var2 = arg0.field789 - var1.field789;
                int var3 = arg0.field773 - var1.field773;
                if (var2 != 0 || var3 != 0) {
                    arg0.field780 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field798 >= 32768) {
            int var4 = arg0.field798 - 32768;
            if (field340 == var4) {
                var4 = 2047;
            }
            class3 var5 = field393[var4];
            if (var5 != null) {
                int var6 = arg0.field789 - var5.field789;
                int var7 = arg0.field773 - var5.field773;
                if (var6 != 0 || var7 != 0) {
                    arg0.field780 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field799 != 0 || arg0.field800 != 0) && (arg0.field826 == 0 || arg0.field830 > 0)) {
            int var8 = arg0.field789 - (arg0.field799 * 64 - Statics.field142 * 64 - Statics.field142 * 64);
            int var9 = arg0.field773 - (arg0.field800 * 64 - Statics.field57 * 64 - Statics.field57 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field780 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field799 = 0;
            arg0.field800 = 0;
        }
        int var10 = arg0.field780 - arg0.field774 & 0x7FF;
        if (var10 == 0) {
            arg0.field772 = 0;
            return;
        }
        arg0.field772++;
        if (var10 > 1024) {
            arg0.field774 -= arg0.field825;
            boolean var11 = true;
            if (var10 < arg0.field825 || var10 > 2048 - arg0.field825) {
                arg0.field774 = arg0.field780;
                var11 = false;
            }
            if (arg0.field824 == arg0.field777 && (arg0.field772 > 25 || var11)) {
                if (arg0.field778 == -1) {
                    arg0.field824 = arg0.field792;
                } else {
                    arg0.field824 = arg0.field778;
                }
            }
        } else {
            arg0.field774 += arg0.field825;
            boolean var12 = true;
            if (var10 < arg0.field825 || var10 > 2048 - arg0.field825) {
                arg0.field774 = arg0.field780;
                var12 = false;
            }
            if (arg0.field824 == arg0.field777 && (arg0.field772 > 25 || var12)) {
                if (arg0.field819 == -1) {
                    arg0.field824 = arg0.field792;
                } else {
                    arg0.field824 = arg0.field819;
                }
            }
        }
        arg0.field774 &= 0x7FF;
    }

    @ObfuscatedName("fp.ah(Lal;I)V")
    public static final void method3363(class35 arg0) {
        arg0.field775 = false;
        if (arg0.field824 != -1) {
            class40 var1 = Statics.method860(arg0.field824);
            if (var1 == null || var1.field957 == null) {
                arg0.field824 = -1;
            } else {
                arg0.field803++;
                if (arg0.field802 < var1.field957.length && arg0.field803 > var1.field971[arg0.field802]) {
                    arg0.field803 = 1;
                    arg0.field802++;
                    method524(var1, arg0.field802, arg0.field789, arg0.field773);
                }
                if (arg0.field802 >= var1.field957.length) {
                    arg0.field803 = 0;
                    arg0.field802 = 0;
                    method524(var1, arg0.field802, arg0.field789, arg0.field773);
                }
            }
        }
        if (arg0.field809 != -1 && field280 >= arg0.field812) {
            if (arg0.field810 < 0) {
                arg0.field810 = 0;
            }
            int var2 = class41.method493(arg0.field809).field974;
            if (var2 == -1) {
                arg0.field809 = -1;
            } else {
                class40 var3 = Statics.method860(var2);
                if (var3 == null || var3.field957 == null) {
                    arg0.field809 = -1;
                } else {
                    arg0.field811++;
                    if (arg0.field810 < var3.field957.length && arg0.field811 > var3.field971[arg0.field810]) {
                        arg0.field811 = 1;
                        arg0.field810++;
                        method524(var3, arg0.field810, arg0.field789, arg0.field773);
                    }
                    if (arg0.field810 >= var3.field957.length && (arg0.field810 < 0 || arg0.field810 >= var3.field957.length)) {
                        arg0.field809 = -1;
                    }
                }
            }
        }
        if (arg0.field804 != -1 && arg0.field785 <= 1) {
            class40 var4 = Statics.method860(arg0.field804);
            if (var4.field968 == 1 && arg0.field831 > 0 && arg0.field808 <= field280 && arg0.field807 < field280) {
                arg0.field785 = 1;
                return;
            }
        }
        if (arg0.field804 != -1 && arg0.field785 == 0) {
            class40 var5 = Statics.method860(arg0.field804);
            if (var5 == null || var5.field957 == null) {
                arg0.field804 = -1;
            } else {
                arg0.field806++;
                if (arg0.field805 < var5.field957.length && arg0.field806 > var5.field971[arg0.field805]) {
                    arg0.field806 = 1;
                    arg0.field805++;
                    method524(var5, arg0.field805, arg0.field789, arg0.field773);
                }
                if (arg0.field805 >= var5.field957.length) {
                    arg0.field805 -= var5.field970;
                    arg0.field783++;
                    if (arg0.field783 >= var5.field967) {
                        arg0.field804 = -1;
                    } else if (arg0.field805 >= 0 && arg0.field805 < var5.field957.length) {
                        method524(var5, arg0.field805, arg0.field789, arg0.field773);
                    } else {
                        arg0.field804 = -1;
                    }
                }
                arg0.field775 = var5.field963;
            }
        }
        if (arg0.field785 > 0) {
            arg0.field785--;
        }
    }

    @ObfuscatedName("cw.ae(La;IIB)V")
    public static void method1962(class3 arg0, int arg1, int arg2) {
        if (arg0.field804 == arg1 && arg1 != -1) {
            int var3 = Statics.method860(arg1).field958;
            if (var3 == 1) {
                arg0.field805 = 0;
                arg0.field806 = 0;
                arg0.field785 = arg2;
                arg0.field783 = 0;
            }
            if (var3 == 2) {
                arg0.field783 = 0;
            }
        } else if (arg1 == -1 || arg0.field804 == -1 || Statics.method860(arg1).field964 >= Statics.method860(arg0.field804).field964) {
            arg0.field804 = arg1;
            arg0.field805 = 0;
            arg0.field806 = 0;
            arg0.field785 = arg2;
            arg0.field783 = 0;
            arg0.field831 = arg0.field826;
        }
    }

    @ObfuscatedName("fx.ay(I)I")
    public static int method3350() {
        return field491 ? 2 : 1;
    }

    @ObfuscatedName("af.ab(I)V")
    public static void method895() {
        client var0 = Statics.field267;
        synchronized (Statics.field267) {
            Container var1 = Statics.field267.method2774();
            if (var1 != null) {
                Statics.field1124 = Math.max(var1.getSize().width, Statics.field648);
                Statics.field683 = Math.max(var1.getSize().height, Statics.field1925);
                if (Statics.field1896 == var1) {
                    Insets var2 = Statics.field1896.getInsets();
                    Statics.field1124 -= var2.right + var2.left;
                    Statics.field683 -= var2.top + var2.bottom;
                }
                if (Statics.field1124 <= 0) {
                    Statics.field1124 = 1;
                }
                if (Statics.field683 <= 0) {
                    Statics.field683 = 1;
                }
                if (method3350() == 1) {
                    Statics.field696 = field492 * 765;
                    Statics.field1848 = field405 * 503;
                } else {
                    Statics.field696 = Math.min(Statics.field1124, 7680);
                    Statics.field1848 = Math.min(Statics.field683, 2160);
                }
                field2102 = (Statics.field1124 - Statics.field696) / 2;
                field2101 = 0;
                Statics.field1850.setSize(Statics.field696, Statics.field1848);
                Statics.field1967 = class73.method500(Statics.field696, Statics.field1848, Statics.field1850);
                if (Statics.field1896 == var1) {
                    Insets var3 = Statics.field1896.getInsets();
                    Statics.field1850.setLocation(field2102 + var3.left, field2101 + var3.top);
                } else {
                    Statics.field1850.setLocation(field2102, field2101);
                }
                method494();
                if (field435 != -1) {
                    method134(true);
                }
                method75();
            }
        }
    }

    @ObfuscatedName("p.at(I)V")
    public static void method494() {
        int var0 = Statics.field696;
        int var1 = Statics.field1848;
        if (Statics.field1124 < var0) {
            int var2 = Statics.field1124;
        }
        if (Statics.field683 < var1) {
            int var3 = Statics.field683;
        }
        if (Statics.field1306 == null) {
            return;
        }
        try {
            client var4 = Statics.field267;
            Object[] var5 = new Object[] { method3350() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("h.as(I)V")
    public static void method75() {
        int var0 = field2102;
        int var1 = field2101;
        int var2 = Statics.field1124 - Statics.field696 - var0;
        int var3 = Statics.field683 - Statics.field1848 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field267.method2774();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1896 == var4) {
                Insets var7 = Statics.field1896.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field683);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1124, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1124 + var5 - var2, var6, var2, Statics.field683);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field683 + var6 - var3, Statics.field1124, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("dc.af(Ljava/lang/String;ZI)V")
    public static final void method2173(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field251.method3643(arg0, 250);
        int var6 = Statics.field251.method3695(arg0, 250) * 13;
        class75.method1605(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1607(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field251.method3670(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method88(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1699(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1850.getGraphics();
            Statics.field1967.method1435(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1850.repaint();
        }
    }

    @ObfuscatedName("l.aa(IIIIZI)V")
    public static final void method104(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field532 - field516) * var5 / 100 + field516;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field547) {
            short var8 = field547;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field536) {
                var6 = field536;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class75.method1598();
                    class75.method1605(arg0, arg1, var10, arg3, -16777216);
                    class75.method1605(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field467) {
            short var11 = field467;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field535) {
                var6 = field535;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class75.method1598();
                    class75.method1605(arg0, arg1, arg2, var13, -16777216);
                    class75.method1605(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field543 = arg3 * var6 / 334 << 1;
        if (field541 != arg2 || field443 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < 9; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var18 = class86.field1520[var16];
                var14[var15] = var17 * var18 >> 16;
            }
            class81.method1739(var14, 500, 800, arg2, arg3);
        }
        field354 = arg0;
        field509 = arg1;
        field541 = arg2;
        field443 = arg3;
    }

    @ObfuscatedName("bx.ad(Lao;I)V")
    public static final void method1502(class31 arg0) {
        if (Statics.field37.field789 >> 7 == field407 && Statics.field37.field773 >> 7 == field512) {
            field407 = 0;
        }
        int var1 = field501;
        if (class31.field741 == arg0 || class31.field733 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field741 == arg0) {
                var3 = Statics.field37;
                var4 = 33538048;
            } else if (class31.field733 == arg0) {
                var3 = field393[field277];
                var4 = field277 << 14;
            } else {
                var3 = field393[field517[var2]];
                var4 = field517[var2] << 14;
                if (class31.field735 == arg0 && field277 == field517[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method20() && !var3.field36) {
                var3.field45 = false;
                if ((field274 && field501 > 50 || field501 > 200) && class31.field741 != arg0 && var3.field824 == var3.field777) {
                    var3.field45 = true;
                }
                int var5 = var3.field789 >> 7;
                int var6 = var3.field773 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field280 < var3.field35 || field280 >= var3.field42) {
                        if ((var3.field789 & 0x7F) == 64 && (var3.field773 & 0x7F) == 64) {
                            if (field334 == field376[var5][var6]) {
                                continue;
                            }
                            field376[var5][var6] = field334;
                        }
                        var3.field34 = method686(var3.field789, var3.field773, Statics.field665);
                        Statics.field231.method1716(Statics.field665, var3.field789, var3.field773, var3.field34, 60, var3, var3.field774, var4, var3.field775);
                    } else {
                        var3.field45 = false;
                        var3.field34 = method686(var3.field789, var3.field773, Statics.field665);
                        Statics.field231.method1717(Statics.field665, var3.field789, var3.field773, var3.field34, 60, var3, var3.field774, var4, var3.field33, var3.field44, var3.field43, var3.field39);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fz.ai(ZI)V")
    public static final void method3163(boolean arg0) {
        for (int var1 = 0; var1 < field313; var1++) {
            class32 var2 = field312[field314[var1]];
            int var3 = (field314[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field743.field849 == arg0 && var2.field743.method670()) {
                int var4 = var2.field789 >> 7;
                int var5 = var2.field773 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field776 == 1 && (var2.field789 & 0x7F) == 64 && (var2.field773 & 0x7F) == 64) {
                        if (field334 == field376[var4][var5]) {
                            continue;
                        }
                        field376[var4][var5] = field334;
                    }
                    if (!var2.field743.field879) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field231.method1716(Statics.field665, var2.field789, var2.field773, method686(var2.field789 + (var2.field776 * 64 - 64), var2.field773 + (var2.field776 * 64 - 64), Statics.field665), var2.field776 * 64 - 64 + 60, var2, var2.field774, var3, var2.field775);
                }
            }
        }
    }

    @ObfuscatedName("ar.ak(Lal;IIIIII)V")
    public static final void method731(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method20()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field743;
            if (var6.field876 != null) {
                var6 = var6.method663();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field501) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field36) {
                return;
            }
            if (var8.field30 != -1 || var8.field28 != -1) {
                method3351(arg0, arg0.field822 + 15);
                if (field378 > -1) {
                    if (var8.field30 != -1) {
                        Statics.field50[var8.field30].method1528(field378 + arg2 - 12, field379 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field28 != -1) {
                        Statics.field1479[var8.field28].method1528(field378 + arg2 - 12, field379 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field523 == 10 && field436 == field517[arg1]) {
                method3351(arg0, arg0.field822 + 15);
                if (field378 > -1) {
                    Statics.field1560[1].method1528(field378 + arg2 - 12, field379 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field743;
            if (var9.field876 != null) {
                var9 = var9.method663();
            }
            if (var9.field874 >= 0 && var9.field874 < Statics.field1479.length) {
                method3351(arg0, arg0.field822 + 15);
                if (field378 > -1) {
                    Statics.field1479[var9.field874].method1528(field378 + arg2 - 12, field379 + arg3 - 30);
                }
            }
            if (field523 == 1 && field289 == field314[arg1 - field501] && field280 % 20 < 10) {
                method3351(arg0, arg0.field822 + 15);
                if (field378 > -1) {
                    Statics.field1560[0].method1528(field378 + arg2 - 12, field379 + arg3 - 28);
                }
            }
        }
        if (arg0.field791 != null && (arg1 >= field501 || !arg0.field787 && (field449 == 4 || !arg0.field786 && (field449 == 0 || field449 == 3 || field449 == 1 && method2488(((class3) arg0).field49, false))))) {
            method3351(arg0, arg0.field822);
            if (field378 > -1 && field366 < field367) {
                field371[field366] = Statics.field2567.method3635(arg0.field791) / 2;
                field369[field366] = Statics.field2567.field3100;
                field368[field366] = field378;
                field301[field366] = field379;
                field372[field366] = arg0.field781;
                field373[field366] = arg0.field790;
                field342[field366] = arg0.field779;
                field375[field366] = arg0.field791;
                field366++;
            }
        }
        if (arg0.field795 > field280) {
            method3351(arg0, arg0.field822 + 15);
            if (field378 > -1) {
                int var10;
                if (arg1 < field501) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field743;
                    var10 = var11.field882;
                }
                int var12 = arg0.field796 * var10 / arg0.field797;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field796 > 0) {
                    var12 = 1;
                }
                class75.method1605(field378 + arg2 - var10 / 2, field379 + arg3 - 3, var12, 5, 65280);
                class75.method1605(field378 + arg2 - var10 / 2 + var12, field379 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field833[var13] > field280) {
                method3351(arg0, arg0.field822 / 2);
                if (field378 > -1) {
                    if (var13 == 1) {
                        field379 -= 20;
                    }
                    if (var13 == 2) {
                        field378 -= 15;
                        field379 -= 10;
                    }
                    if (var13 == 3) {
                        field378 += 15;
                        field379 -= 10;
                    }
                    Statics.field1022[arg0.field801[var13]].method1528(field378 + arg2 - 12, field379 + arg3 - 12);
                    Statics.field639.method3705(Integer.toString(arg0.field823[var13]), field378 + arg2 - 1, field379 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("fx.az(Lal;IB)V")
    public static final void method3351(class35 arg0, int arg1) {
        method153(arg0.field789, arg0.field773, arg1);
    }

    @ObfuscatedName("q.am(IIIB)V")
    public static final void method153(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field378 = -1;
            field379 = -1;
            return;
        }
        int var3 = method686(arg0, arg1, Statics.field665) - arg2;
        int var4 = arg0 - Statics.field875;
        int var5 = var3 - Statics.field2059;
        int var6 = arg1 - Statics.field1057;
        int var7 = class86.field1520[Statics.field2590];
        int var8 = class86.field1521[Statics.field2590];
        int var9 = class86.field1520[Statics.field1613];
        int var10 = class86.field1521[Statics.field1613];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field378 = field543 * var11 / var15 + field541 / 2;
            field379 = field543 * var14 / var15 + field443 / 2;
        } else {
            field378 = -1;
            field379 = -1;
        }
    }

    @ObfuscatedName("ap.bj(IIII)I")
    public static final int method686(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field68[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field79[var5][var3][var4] + class6.field79[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field79[var5][var3][var4 + 1] + class6.field79[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("am.bf(ZI)V")
    public static final void method1104(boolean arg0) {
        field370 = arg0;
        if (!field370) {
            int var1 = (field318 - field317.field1890) / 16;
            Statics.field652 = new int[var1][4];
            for (int var2 = 0; var2 < var1; var2++) {
                for (int var3 = 0; var3 < 4; var3++) {
                    Statics.field652[var2][var3] = field317.method2280();
                }
            }
            int var4 = field317.method2236();
            int var5 = field317.method2270();
            int var6 = field317.method2256();
            int var7 = field317.method2262();
            int var8 = field317.method2380();
            Statics.field1695 = new int[var1];
            Statics.field793 = new int[var1];
            Statics.field2143 = new int[var1];
            Statics.field1992 = new byte[var1][];
            Statics.field649 = new byte[var1][];
            boolean var9 = false;
            if ((var5 / 8 == 48 || var5 / 8 == 49) && var4 / 8 == 48) {
                var9 = true;
            }
            if (var5 / 8 == 48 && var4 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var5 - 6) / 8; var11 <= (var5 + 6) / 8; var11++) {
                for (int var12 = (var4 - 6) / 8; var12 <= (var4 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1695[var10] = var13;
                        Statics.field793[var10] = Statics.field837.method2944("m" + var11 + "_" + var12);
                        Statics.field2143[var10] = Statics.field837.method2944("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1948(var5, var4, var7, var8, var6);
            return;
        }
        int var14 = field317.method2270();
        int var15 = field317.method2236();
        int var16 = field317.method2380();
        int var17 = field317.method2261();
        field317.method2495();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field317.method2496(1);
                    if (var21 == 1) {
                        field335[var18][var19][var20] = field317.method2496(26);
                    } else {
                        field335[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field317.method2497();
        int var22 = (field318 - field317.field1890) / 16;
        Statics.field652 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field652[var23][var24] = field317.method2281();
            }
        }
        int var25 = field317.method2256();
        Statics.field1695 = new int[var22];
        Statics.field793 = new int[var22];
        Statics.field2143 = new int[var22];
        Statics.field1992 = new byte[var22][];
        Statics.field649 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field335[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1695[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1695[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field793[var26] = Statics.field837.method2944("m" + var35 + "_" + var36);
                            Statics.field2143[var26] = Statics.field837.method2944("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1948(var16, var15, var17, var25, var14);
    }

    @ObfuscatedName("cd.bb(IIIIII)V")
    public static final void method1948(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1020 == arg0 && Statics.field1843 == arg1 && field327 == arg2 || !field274) {
            return;
        }
        Statics.field1020 = arg0;
        Statics.field1843 = arg1;
        field327 = arg2;
        if (!field274) {
            field327 = 0;
        }
        method2920(25);
        method2173(class148.field2238, true);
        int var5 = Statics.field142;
        int var6 = Statics.field57;
        Statics.field142 = (arg0 - 6) * 8;
        Statics.field57 = (arg1 - 6) * 8;
        int var7 = Statics.field142 - var5;
        int var8 = Statics.field57 - var6;
        int var9 = Statics.field142;
        int var10 = Statics.field57;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field312[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field828[var13] -= var7;
                    var12.field827[var13] -= var8;
                }
                var12.field789 -= var7 * 128;
                var12.field773 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field393[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field828[var16] -= var7;
                    var15.field827[var16] -= var8;
                }
                var15.field789 -= var7 * 128;
                var15.field773 -= var8 * 128;
            }
        }
        Statics.field665 = arg2;
        Statics.field37.method641(arg3, arg4, false);
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
                        field408[var27][var23][var24] = field408[var27][var25][var26];
                    } else {
                        field408[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field409.method3451(); var28 != null; var28 = (class16) field409.method3448()) {
            var28.field222 -= var7;
            var28.field228 -= var8;
            if (var28.field222 < 0 || var28.field228 < 0 || var28.field222 >= 104 || var28.field228 >= 104) {
                var28.method3540();
            }
        }
        if (field407 != 0) {
            field407 -= var7;
            field512 -= var8;
        }
        field485 = 0;
        field493 = false;
        field468 = -1;
        field411.method3440();
        field410.method3440();
    }

    @ObfuscatedName("x.bv(ZI)V")
    public static final void method140(boolean arg0) {
        method978();
        field321++;
        if (field321 < 50 && !arg0) {
            return;
        }
        field321 = 0;
        if (field552 || Statics.field2796 == null) {
            return;
        }
        field266.method2493(25);
        try {
            Statics.field2796.method2714(field266.field1889, 0, field266.field1890);
            field266.field1890 = 0;
        } catch (IOException var2) {
            field552 = true;
        }
    }

    @ObfuscatedName("ee.bl(IIIIII)V")
    public static final void method2702(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field231.method1850(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field231.method1735(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field729.field1348;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method2180(var12);
            if (var13.field917 == -1) {
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
                class76 var14 = Statics.field3078[var13.field917];
                if (var14 != null) {
                    int var15 = (var13.field907 * 4 - var14.field1366) / 2;
                    int var16 = (var13.field904 * 4 - var14.field1363) / 2;
                    var14.method1669(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field904) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field231.method1733(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field231.method1735(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method2180(var21);
            if (var22.field917 != -1) {
                class76 var23 = Statics.field3078[var22.field917];
                if (var23 != null) {
                    int var24 = (var22.field907 * 4 - var23.field1366) / 2;
                    int var25 = (var22.field904 * 4 - var23.field1363) / 2;
                    var23.method1669(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field904) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field729.field1348;
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
        int var29 = Statics.field231.method1734(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method2180(var30);
        if (var31.field917 == -1) {
            return;
        }
        class76 var32 = Statics.field3078[var31.field917];
        if (var32 != null) {
            int var33 = (var31.field907 * 4 - var32.field1366) / 2;
            int var34 = (var31.field904 * 4 - var32.field1363) / 2;
            var32.method1669(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field904) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("e.bu(I)Z")
    public static final boolean method130() {
        if (Statics.field2796 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2796.method2712();
            if (var0 == 0) {
                return false;
            }
            if (field319 == -1) {
                Statics.field2796.method2713(field317.field1889, 0, 1);
                field317.field1890 = 0;
                field319 = field317.method2494();
                field318 = class179.field2956[field319];
                var0--;
            }
            if (field318 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2796.method2713(field317.field1889, 0, 1);
                field318 = field317.field1889[0] & 0xFF;
                var0--;
            }
            if (field318 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2796.method2713(field317.field1889, 0, 2);
                field317.field1890 = 0;
                field318 = field317.method2236();
                var0 -= 2;
            }
            if (var0 < field318) {
                return false;
            }
            field317.field1890 = 0;
            Statics.field2796.method2713(field317.field1889, 0, field318);
            field320 = 0;
            field326 = field323;
            field323 = field322;
            field322 = field319;
            if (field319 == 193) {
                int var1 = field317.method2380();
                int var2 = field317.method2262();
                int var3 = field317.method2363();
                class4 var4 = (class4) field483.method3418((long) var3);
                if (var4 != null) {
                    method752(var4, var4.field51 != var1);
                }
                method1515(var3, var1, var2);
                field319 = -1;
                return true;
            }
            if (field319 == 239) {
                int var5 = field317.method2256();
                int var6 = field317.method2280();
                int var7 = var5 >> 10 & 0x1F;
                int var8 = var5 >> 5 & 0x1F;
                int var9 = var5 & 0x1F;
                int var10 = (var9 << 3) + (var7 << 19) + (var8 << 11);
                class164 var11 = class164.method144(var6);
                if (var11.field2765 != var10) {
                    var11.field2765 = var10;
                    method106(var11);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 160 || field319 == 113 || field319 == 245 || field319 == 197 || field319 == 101 || field319 == 244 || field319 == 145 || field319 == 95 || field319 == 186 || field319 == 63) {
                method617();
                field319 = -1;
                return true;
            }
            if (field319 == 225) {
                method1104(true);
                field319 = -1;
                return true;
            }
            if (field319 == 104) {
                String var12 = field317.method2242();
                long var13 = field317.method2240();
                long var15 = (long) field317.method2236();
                long var17 = (long) field317.method2238();
                class143 var19 = (class143) class101.method979(Statics.method3070(), field317.method2234());
                long var20 = (var15 << 32) + var17;
                boolean var22 = false;
                for (int var23 = 0; var23 < 100; var23++) {
                    if (field281[var23] == var20) {
                        var22 = true;
                        break;
                    }
                }
                if (var19.field2155 && method1969(var12)) {
                    var22 = true;
                }
                if (!var22 && field392 == 0) {
                    field281[field499] = var20;
                    field499 = (field499 + 1) % 100;
                    class114 var24 = field317;
                    String var28;
                    try {
                        int var25 = var24.method2247();
                        if (var25 > 32767) {
                            var25 = 32767;
                        }
                        byte[] var26 = new byte[var25];
                        var24.field1890 += Statics.field3081.method2164(var24.field1889, var24.field1890, var26, 0, var25);
                        String var27 = class156.method2553(var26, 0, var25);
                        var28 = var27;
                    } catch (Exception var338) {
                        var28 = "Cabbage";
                    }
                    String var31 = class214.method3639(class154.method1946(var28));
                    if (var19.field2158 == -1) {
                        class11.method2514(9, var12, var31, class153.method1513(var13));
                    } else {
                        class11.method2514(9, class2.method3119(var19.field2158) + var12, var31, class153.method1513(var13));
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 252) {
                int var32 = field317.method2239();
                int var33 = field317.method2236();
                if (var32 < -70000) {
                    var33 += 32768;
                }
                class164 var34;
                if (var32 >= 0) {
                    var34 = class164.method144(var32);
                } else {
                    var34 = null;
                }
                while (field317.field1890 < field318) {
                    int var35 = field317.method2247();
                    int var36 = field317.method2236();
                    int var37 = 0;
                    if (var36 != 0) {
                        var37 = field317.method2234();
                        if (var37 == 255) {
                            var37 = field317.method2239();
                        }
                    }
                    if (var34 != null && var35 >= 0 && var35 < var34.field2750.length) {
                        var34.field2750[var35] = var36;
                        var34.field2744[var35] = var37;
                    }
                    class15.method128(var33, var35, var36 - 1, var37);
                }
                if (var34 != null) {
                    method106(var34);
                }
                method1();
                field463[++field464 - 1 & 0x1F] = var33 & 0x7FFF;
                field319 = -1;
                return true;
            }
            if (field319 == 5) {
                int var38 = field317.method2363();
                Statics.field3139 = Statics.field202.method2611(var38);
                field319 = -1;
                return true;
            }
            if (field319 == 234) {
                method615(false);
                field319 = -1;
                return true;
            }
            if (field319 == 188) {
                field317.field1890 += 28;
                if (field317.method2451()) {
                    class114 var39 = field317;
                    int var40 = field317.field1890 - 28;
                    if (class141.field2134 != null) {
                        try {
                            class141.field2134.method3742(0L);
                            class141.field2134.method3766(var39.field1889, var40, 24);
                        } catch (Exception var337) {
                        }
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 58) {
                field308 = 1;
                field400 = field460;
                field319 = -1;
                return true;
            }
            if (field319 == 235) {
                int var42 = field317.method2239();
                int var43 = field317.method2236();
                if (var42 < -70000) {
                    var43 += 32768;
                }
                class164 var44;
                if (var42 >= 0) {
                    var44 = class164.method144(var42);
                } else {
                    var44 = null;
                }
                if (var44 != null) {
                    for (int var45 = 0; var45 < var44.field2750.length; var45++) {
                        var44.field2750[var45] = 0;
                        var44.field2744[var45] = 0;
                    }
                }
                class15 var46 = (class15) class15.field214.method3418((long) var43);
                if (var46 != null) {
                    for (int var47 = 0; var47 < var46.field211.length; var47++) {
                        var46.field211[var47] = -1;
                        var46.field208[var47] = 0;
                    }
                }
                int var48 = field317.method2236();
                for (int var49 = 0; var49 < var48; var49++) {
                    int var50 = field317.method2236();
                    int var51 = field317.method2234();
                    if (var51 == 255) {
                        var51 = field317.method2363();
                    }
                    if (var44 != null && var49 < var44.field2750.length) {
                        var44.field2750[var49] = var50;
                        var44.field2744[var49] = var51;
                    }
                    class15.method128(var43, var49, var50 - 1, var51);
                }
                if (var44 != null) {
                    method106(var44);
                }
                method1();
                field463[++field464 - 1 & 0x1F] = var43 & 0x7FFF;
                field319 = -1;
                return true;
            }
            if (field319 == 248) {
                int var52 = field317.method2236();
                int var53 = field317.method2234();
                int var54 = field317.method2236();
                method3575(var52, var53, var54);
                field319 = -1;
                return true;
            }
            if (field319 == 67) {
                for (int var55 = 0; var55 < field393.length; var55++) {
                    if (field393[var55] != null) {
                        field393[var55].field804 = -1;
                    }
                }
                for (int var56 = 0; var56 < field312.length; var56++) {
                    if (field312[var56] != null) {
                        field312[var56].field804 = -1;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 38) {
                field424 = field460;
                if (field318 == 0) {
                    field500 = null;
                    field331 = null;
                    Statics.field121 = 0;
                    Statics.field1862 = null;
                    field319 = -1;
                    return true;
                }
                field331 = field317.method2242();
                long var57 = field317.method2240();
                long var59 = var57;
                String var61;
                if (var57 <= 0L || var57 >= 6582952005840035281L) {
                    var61 = null;
                } else if (var57 % 37L == 0L) {
                    var61 = null;
                } else {
                    int var62 = 0;
                    for (long var63 = var57; var63 != 0L; var63 /= 37L) {
                        var62++;
                    }
                    StringBuilder var65 = new StringBuilder(var62);
                    while (var59 != 0L) {
                        long var66 = var59;
                        var59 /= 37L;
                        var65.append(class153.field2545[(int) (var66 - var59 * 37L)]);
                    }
                    var61 = var65.reverse().toString();
                }
                field500 = var61;
                Statics.field2841 = field317.method2235();
                int var68 = field317.method2234();
                if (var68 == 255) {
                    field319 = -1;
                    return true;
                }
                Statics.field121 = var68;
                class23[] var69 = new class23[100];
                for (int var70 = 0; var70 < Statics.field121; var70++) {
                    var69[var70] = new class23();
                    var69[var70].field603 = field317.method2242();
                    var69[var70].field605 = class155.method1945(var69[var70].field603, Statics.field329);
                    var69[var70].field599 = field317.method2236();
                    var69[var70].field602 = field317.method2235();
                    field317.method2242();
                    if (var69[var70].field603.equals(Statics.field37.field49)) {
                        Statics.field215 = var69[var70].field602;
                    }
                }
                boolean var71 = false;
                int var72 = Statics.field121;
                while (var72 > 0) {
                    boolean var73 = true;
                    var72--;
                    for (int var74 = 0; var74 < var72; var74++) {
                        if (var69[var74].field605.compareTo(var69[var74 + 1].field605) > 0) {
                            class23 var75 = var69[var74];
                            var69[var74] = var69[var74 + 1];
                            var69[var74 + 1] = var75;
                            var73 = false;
                        }
                    }
                    if (var73) {
                        break;
                    }
                }
                Statics.field1862 = var69;
                field319 = -1;
                return true;
            }
            if (field319 == 120) {
                int var76 = field317.method2239();
                boolean var77 = field317.method2261() == 1;
                class164 var78 = class164.method144(var76);
                if (var78.field2702 != var77) {
                    var78.field2702 = var77;
                    method106(var78);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 49) {
                int var79 = field317.method2234();
                int var80 = field317.method2234();
                int var81 = field317.method2234();
                int var82 = field317.method2234();
                field526[var79] = true;
                field527[var79] = var80;
                field528[var79] = var81;
                field529[var79] = var82;
                field530[var79] = 0;
                field319 = -1;
                return true;
            }
            if (field319 == 33) {
                int var83 = field317.method2239();
                class164 var84 = class164.method144(var83);
                for (int var85 = 0; var85 < var84.field2750.length; var85++) {
                    var84.field2750[var85] = -1;
                    var84.field2750[var85] = 0;
                }
                method106(var84);
                field319 = -1;
                return true;
            }
            if (field319 == 60) {
                String var86 = field317.method2242();
                class114 var87 = field317;
                String var91;
                try {
                    int var88 = var87.method2247();
                    if (var88 > 32767) {
                        var88 = 32767;
                    }
                    byte[] var89 = new byte[var88];
                    var87.field1890 += Statics.field3081.method2164(var87.field1889, var87.field1890, var89, 0, var88);
                    String var90 = class156.method2553(var89, 0, var88);
                    var91 = var90;
                } catch (Exception var336) {
                    var91 = "Cabbage";
                }
                String var94 = class214.method3639(class154.method1946(var91));
                class11.method2919(6, var86, var94);
                field319 = -1;
                return true;
            }
            if (field319 == 78) {
                int var95 = field317.method2247();
                boolean var96 = field317.method2234() == 1;
                String var97 = "";
                boolean var98 = false;
                if (var96) {
                    var97 = field317.method2242();
                    if (method1969(var97)) {
                        var98 = true;
                    }
                }
                String var99 = field317.method2242();
                if (!var98) {
                    class11.method2919(var95, var97, var99);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 195) {
                while (field317.field1890 < field318) {
                    boolean var100 = field317.method2234() == 1;
                    String var101 = field317.method2242();
                    String var102 = field317.method2242();
                    int var103 = field317.method2236();
                    int var104 = field317.method2234();
                    int var105 = field317.method2234();
                    boolean var106 = (var105 & 0x2) != 0;
                    boolean var107 = (var105 & 0x1) != 0;
                    if (var103 > 0) {
                        field317.method2242();
                        field317.method2234();
                        field317.method2239();
                    }
                    field317.method2242();
                    for (int var108 = 0; var108 < field394; var108++) {
                        class17 var109 = field546[var108];
                        if (var100) {
                            if (var102.equals(var109.field247)) {
                                var109.field247 = var101;
                                var109.field236 = var102;
                                var101 = null;
                                break;
                            }
                        } else if (var101.equals(var109.field247)) {
                            if (var109.field237 != var103) {
                                boolean var110 = true;
                                for (class36 var111 = (class36) field302.method3401(); var111 != null; var111 = (class36) field302.method3405()) {
                                    if (var111.field838.equals(var101)) {
                                        if (var103 != 0 && var111.field839 == 0) {
                                            var111.method3535();
                                            var110 = false;
                                        } else if (var103 == 0 && var111.field839 != 0) {
                                            var111.method3535();
                                            var110 = false;
                                        }
                                    }
                                }
                                if (var110) {
                                    field302.method3400(new class36(var101, var103));
                                }
                                var109.field237 = var103;
                            }
                            var109.field236 = var102;
                            var109.field238 = var104;
                            var109.field234 = var106;
                            var109.field239 = var107;
                            var101 = null;
                            break;
                        }
                    }
                    if (var101 != null && field394 < 400) {
                        class17 var112 = new class17();
                        field546[field394] = var112;
                        var112.field247 = var101;
                        var112.field236 = var102;
                        var112.field237 = var103;
                        var112.field238 = var104;
                        var112.field234 = var106;
                        var112.field239 = var107;
                        field394++;
                    }
                }
                field308 = 2;
                field400 = field460;
                boolean var113 = false;
                int var114 = field394;
                while (var114 > 0) {
                    boolean var115 = true;
                    var114--;
                    for (int var116 = 0; var116 < var114; var116++) {
                        boolean var117 = false;
                        class17 var118 = field546[var116];
                        class17 var119 = field546[var116 + 1];
                        if (field282 != var118.field237 && field282 == var119.field237) {
                            var117 = true;
                        }
                        if (!var117 && var118.field237 == 0 && var119.field237 != 0) {
                            var117 = true;
                        }
                        if (!var117 && !var118.field234 && var119.field234) {
                            var117 = true;
                        }
                        if (!var117 && !var118.field239 && var119.field239) {
                            var117 = true;
                        }
                        if (var117) {
                            class17 var120 = field546[var116];
                            field546[var116] = field546[var116 + 1];
                            field546[var116 + 1] = var120;
                            var115 = false;
                        }
                    }
                    if (var115) {
                        break;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 167) {
                method1();
                int var121 = field317.method2262();
                int var122 = field317.method2281();
                int var123 = field317.method2260();
                field414[var123] = var122;
                field412[var123] = var121;
                field413[var123] = 1;
                for (int var124 = 0; var124 < 98; var124++) {
                    if (var122 >= class146.field2193[var124]) {
                        field413[var123] = var124 + 2;
                    }
                }
                field465[++field466 - 1 & 0x1F] = var123;
                field319 = -1;
                return true;
            }
            if (field319 == 133) {
                int var125 = field317.method2262();
                int var126 = field317.method2261();
                String var127 = field317.method2242();
                if (var126 >= 1 && var126 <= 8) {
                    if (var127.equalsIgnoreCase("null")) {
                        var127 = null;
                    }
                    field404[var126 - 1] = var127;
                    field418[var126 - 1] = var125 == 0;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 14) {
                int var128 = field317.method2281();
                int var129 = field317.method2237();
                class164 var130 = class164.method144(var128);
                if (var130.field2679 != var129 || var129 == -1) {
                    var130.field2679 = var129;
                    var130.field2779 = 0;
                    var130.field2730 = 0;
                    method106(var130);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 105) {
                int var131 = field317.method2281();
                int var132 = field317.method2380();
                class164 var133 = class164.method144(var131);
                if (var133.field2700 != 2 || var133.field2701 != var132) {
                    var133.field2700 = 2;
                    var133.field2701 = var132;
                    method106(var133);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 61) {
                method1();
                field441 = field317.method2237();
                field472 = field460;
                field319 = -1;
                return true;
            }
            if (field319 == 37) {
                int var134 = field317.method2280();
                int var135 = field317.method2256();
                int var136 = field317.method2380();
                int var137 = field317.method2380();
                class164 var138 = class164.method144(var134);
                if (var138.field2708 != var135 || var138.field2709 != var136 || var138.field2711 != var137) {
                    var138.field2708 = var135;
                    var138.field2709 = var136;
                    var138.field2711 = var137;
                    method106(var138);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 159) {
                int var139 = field317.method2256();
                if (var139 == 65535) {
                    var139 = -1;
                }
                int var140 = field317.method2280();
                int var141 = field317.method2363();
                int var142 = field317.method2236();
                if (var142 == 65535) {
                    var142 = -1;
                }
                for (int var143 = var142; var143 <= var139; var143++) {
                    long var144 = ((long) var140 << 32) + (long) var143;
                    class199 var146 = field479.method3418(var144);
                    if (var146 != null) {
                        var146.method3540();
                    }
                    field479.method3410(new class192(var141), var144);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 230) {
                field523 = field317.method2234();
                if (field523 == 1) {
                    field289 = field317.method2236();
                }
                if (field523 >= 2 && field523 <= 6) {
                    if (field523 == 2) {
                        field294 = 64;
                        field295 = 64;
                    }
                    if (field523 == 3) {
                        field294 = 0;
                        field295 = 64;
                    }
                    if (field523 == 4) {
                        field294 = 128;
                        field295 = 64;
                    }
                    if (field523 == 5) {
                        field294 = 64;
                        field295 = 0;
                    }
                    if (field523 == 6) {
                        field294 = 64;
                        field295 = 128;
                    }
                    field523 = 2;
                    field309 = field317.method2236();
                    field549 = field317.method2236();
                    field293 = field317.method2234();
                }
                if (field523 == 10) {
                    field436 = field317.method2236();
                }
                field319 = -1;
                return true;
            }
            if (field319 == 51) {
                int var147 = field317.method2239();
                int var148 = field317.method2270();
                if (var148 == 65535) {
                    var148 = -1;
                }
                int var149 = field317.method2363();
                class164 var150 = class164.method144(var147);
                if (var150.field2658) {
                    var150.field2777 = var148;
                    var150.field2778 = var149;
                    class47 var152 = class47.method127(var148);
                    var150.field2708 = var152.field1074;
                    var150.field2709 = var152.field1087;
                    var150.field2710 = var152.field1062;
                    var150.field2706 = var152.field1077;
                    var150.field2707 = var152.field1086;
                    var150.field2711 = var152.field1073;
                    if (var152.field1079 == 1) {
                        var150.field2715 = 1;
                    } else {
                        var150.field2715 = 2;
                    }
                    if (var150.field2712 > 0) {
                        var150.field2711 = var150.field2711 * 32 / var150.field2712;
                    } else if (var150.field2670 > 0) {
                        var150.field2711 = var150.field2711 * 32 / var150.field2670;
                    }
                    method106(var150);
                } else if (var148 == -1) {
                    var150.field2700 = 0;
                    field319 = -1;
                    return true;
                } else {
                    class47 var151 = class47.method127(var148);
                    var150.field2700 = 4;
                    var150.field2701 = var148;
                    var150.field2708 = var151.field1074;
                    var150.field2709 = var151.field1087;
                    var150.field2711 = var151.field1073 * 100 / var149;
                    method106(var150);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 16) {
                method1104(false);
                field319 = -1;
                return true;
            }
            if (field319 == 153) {
                Statics.field2075 = field317.method2261();
                Statics.field919 = field317.method2261();
                while (field317.field1890 < field318) {
                    field319 = field317.method2234();
                    method617();
                }
                field319 = -1;
                return true;
            }
            if (field319 == 117) {
                int var153 = field318 + field317.field1890;
                int var154 = field317.method2236();
                int var155 = field317.method2236();
                if (field435 != var154) {
                    field435 = var154;
                    method134(false);
                    method880(field435);
                    Statics.method2841(field435);
                    for (int var156 = 0; var156 < 100; var156++) {
                        field482[var156] = true;
                    }
                }
                while (var155-- > 0) {
                    int var157 = field317.method2239();
                    int var158 = field317.method2236();
                    int var159 = field317.method2234();
                    class4 var160 = (class4) field483.method3418((long) var157);
                    if (var160 != null && var160.field51 != var158) {
                        method752(var160, true);
                        var160 = null;
                    }
                    if (var160 == null) {
                        var160 = method1515(var157, var158, var159);
                    }
                    var160.field53 = true;
                }
                for (class4 var161 = (class4) field483.method3411(); var161 != null; var161 = (class4) field483.method3417()) {
                    if (var161.field53) {
                        var161.field53 = false;
                    } else {
                        method752(var161, true);
                    }
                }
                field479 = new class187(512);
                while (field317.field1890 < var153) {
                    int var162 = field317.method2239();
                    int var163 = field317.method2236();
                    int var164 = field317.method2236();
                    int var165 = field317.method2239();
                    for (int var166 = var163; var166 <= var164; var166++) {
                        long var167 = ((long) var162 << 32) + (long) var166;
                        field479.method3410(new class192(var165), var167);
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 79) {
                field504 = 0;
                field396 = 0;
                field317.method2495();
                int var169 = field317.method2496(1);
                if (var169 != 0) {
                    int var170 = field317.method2496(2);
                    if (var170 == 0) {
                        field397[++field396 - 1] = 2047;
                    } else if (var170 == 1) {
                        int var171 = field317.method2496(3);
                        Statics.field37.method642(var171, false);
                        int var172 = field317.method2496(1);
                        if (var172 == 1) {
                            field397[++field396 - 1] = 2047;
                        }
                    } else if (var170 == 2) {
                        int var173 = field317.method2496(3);
                        Statics.field37.method642(var173, true);
                        int var174 = field317.method2496(3);
                        Statics.field37.method642(var174, true);
                        int var175 = field317.method2496(1);
                        if (var175 == 1) {
                            field397[++field396 - 1] = 2047;
                        }
                    } else if (var170 == 3) {
                        int var176 = field317.method2496(7);
                        int var177 = field317.method2496(1);
                        int var178 = field317.method2496(7);
                        int var179 = field317.method2496(1);
                        if (var179 == 1) {
                            field397[++field396 - 1] = 2047;
                        }
                        Statics.field665 = field317.method2496(2);
                        Statics.field37.method641(var178, var176, var177 == 1);
                    }
                }
                int var180 = field317.method2496(8);
                if (var180 < field501) {
                    for (int var181 = var180; var181 < field501; var181++) {
                        field402[++field504 - 1] = field517[var181];
                    }
                }
                if (var180 > field501) {
                    throw new RuntimeException("");
                }
                field501 = 0;
                for (int var182 = 0; var182 < var180; var182++) {
                    int var183 = field517[var182];
                    class3 var184 = field393[var183];
                    int var185 = field317.method2496(1);
                    if (var185 == 0) {
                        field517[++field501 - 1] = var183;
                        var184.field821 = field280;
                    } else {
                        int var186 = field317.method2496(2);
                        if (var186 == 0) {
                            field517[++field501 - 1] = var183;
                            var184.field821 = field280;
                            field397[++field396 - 1] = var183;
                        } else if (var186 == 1) {
                            field517[++field501 - 1] = var183;
                            var184.field821 = field280;
                            int var187 = field317.method2496(3);
                            var184.method642(var187, false);
                            int var188 = field317.method2496(1);
                            if (var188 == 1) {
                                field397[++field396 - 1] = var183;
                            }
                        } else if (var186 == 2) {
                            field517[++field501 - 1] = var183;
                            var184.field821 = field280;
                            int var189 = field317.method2496(3);
                            var184.method642(var189, true);
                            int var190 = field317.method2496(3);
                            var184.method642(var190, true);
                            int var191 = field317.method2496(1);
                            if (var191 == 1) {
                                field397[++field396 - 1] = var183;
                            }
                        } else if (var186 == 3) {
                            field402[++field504 - 1] = var183;
                        }
                    }
                }
                method574();
                for (int var192 = 0; var192 < field396; var192++) {
                    int var193 = field397[var192];
                    class3 var194 = field393[var193];
                    int var195 = field317.method2234();
                    if ((var195 & 0x80) != 0) {
                        var195 += field317.method2234() << 8;
                    }
                    if ((var195 & 0x40) != 0) {
                        int var196 = field317.method2380();
                        int var197 = field317.method2260();
                        var194.method647(var196, var197, field280);
                        var194.field795 = field280 + 300;
                        var194.field796 = field317.method2234();
                        var194.field797 = field317.method2260();
                    }
                    if ((var195 & 0x1) != 0) {
                        var194.field798 = field317.method2380();
                        if (var194.field798 == 65535) {
                            var194.field798 = -1;
                        }
                    }
                    if ((var195 & 0x100) != 0) {
                        var194.field809 = field317.method2236();
                        int var198 = field317.method2363();
                        var194.field813 = var198 >> 16;
                        var194.field812 = (var198 & 0xFFFF) + field280;
                        var194.field810 = 0;
                        var194.field811 = 0;
                        if (var194.field812 > field280) {
                            var194.field810 = -1;
                        }
                        if (var194.field809 == 65535) {
                            var194.field809 = -1;
                        }
                    }
                    if ((var195 & 0x2) != 0) {
                        var194.field791 = field317.method2242();
                        if (var194.field791.charAt(0) == '~') {
                            var194.field791 = var194.field791.substring(1);
                            class11.method2919(2, var194.field49, var194.field791);
                        } else if (Statics.field37 == var194) {
                            class11.method2919(2, var194.field49, var194.field791);
                        }
                        var194.field786 = false;
                        var194.field781 = 0;
                        var194.field790 = 0;
                        var194.field779 = 150;
                    }
                    if ((var195 & 0x8) != 0) {
                        int var199 = field317.method2234();
                        byte[] var200 = new byte[var199];
                        class111 var201 = new class111(var200);
                        field317.method2282(var200, 0, var199);
                        field398[var193] = var201;
                        var194.method14(var201);
                    }
                    if ((var195 & 0x400) != 0) {
                        var194.field814 = field317.method2260();
                        var194.field816 = field317.method2261();
                        var194.field815 = field317.method2261();
                        var194.field817 = field317.method2262();
                        var194.field808 = field317.method2236() + field280;
                        var194.field807 = field317.method2380() + field280;
                        var194.field820 = field317.method2260();
                        var194.field826 = 1;
                        var194.field831 = 0;
                    }
                    if ((var195 & 0x4) != 0) {
                        var194.field799 = field317.method2256();
                        var194.field800 = field317.method2256();
                    }
                    if ((var195 & 0x20) != 0) {
                        int var202 = field317.method2380();
                        class143 var203 = (class143) class101.method979(Statics.method3070(), field317.method2260());
                        boolean var204 = field317.method2261() == 1;
                        int var205 = field317.method2261();
                        int var206 = field317.field1890;
                        if (var194.field49 != null && var194.field29 != null) {
                            boolean var207 = false;
                            if (var203.field2155 && method1969(var194.field49)) {
                                var207 = true;
                            }
                            if (!var207 && field392 == 0 && !var194.field36) {
                                field296.field1890 = 0;
                                field317.method2245(field296.field1889, 0, var205);
                                field296.field1890 = 0;
                                class111 var208 = field296;
                                String var212;
                                try {
                                    int var209 = var208.method2247();
                                    if (var209 > 32767) {
                                        var209 = 32767;
                                    }
                                    byte[] var210 = new byte[var209];
                                    var208.field1890 += Statics.field3081.method2164(var208.field1889, var208.field1890, var210, 0, var209);
                                    String var211 = class156.method2553(var210, 0, var209);
                                    var212 = var211;
                                } catch (Exception var335) {
                                    var212 = "Cabbage";
                                }
                                String var215 = class214.method3639(class154.method1946(var212));
                                var194.field791 = var215.trim();
                                var194.field781 = var202 >> 8;
                                var194.field790 = var202 & 0xFF;
                                var194.field779 = 150;
                                var194.field786 = var204;
                                var194.field787 = Statics.field37 != var194 && var203.field2155 && field506 != "" && var215.toLowerCase().indexOf(field506) == -1;
                                int var216;
                                if (var203.field2162) {
                                    var216 = var204 ? 91 : 1;
                                } else {
                                    var216 = var204 ? 90 : 2;
                                }
                                if (var203.field2158 == -1) {
                                    class11.method2919(var216, var194.field49, var215);
                                } else {
                                    class11.method2919(var216, class2.method3119(var203.field2158) + var194.field49, var215);
                                }
                            }
                        }
                        field317.field1890 = var205 + var206;
                    }
                    if ((var195 & 0x10) != 0) {
                        int var217 = field317.method2256();
                        if (var217 == 65535) {
                            var217 = -1;
                        }
                        int var218 = field317.method2260();
                        method1962(var194, var217, var218);
                    }
                    if ((var195 & 0x200) != 0) {
                        int var219 = field317.method2380();
                        int var220 = field317.method2234();
                        var194.method647(var219, var220, field280);
                        var194.field795 = field280 + 300;
                        var194.field796 = field317.method2262();
                        var194.field797 = field317.method2261();
                    }
                }
                for (int var221 = 0; var221 < field504; var221++) {
                    int var222 = field402[var221];
                    if (field280 != field393[var222].field821) {
                        field393[var222] = null;
                    }
                }
                if (field318 != field317.field1890) {
                    throw new RuntimeException(field317.field1890 + class2.field18 + field318);
                }
                for (int var223 = 0; var223 < field501; var223++) {
                    if (field393[field517[var223]] == null) {
                        throw new RuntimeException(var223 + class2.field18 + field501);
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 182) {
                field493 = true;
                Statics.field176 = field317.method2234();
                Statics.field1493 = field317.method2234();
                Statics.field2493 = field317.method2236();
                Statics.field1966 = field317.method2234();
                Statics.field723 = field317.method2234();
                if (Statics.field723 >= 100) {
                    Statics.field875 = Statics.field176 * 128 + 64;
                    Statics.field1057 = Statics.field1493 * 128 + 64;
                    Statics.field2059 = method686(Statics.field875, Statics.field1057, Statics.field665) - Statics.field2493;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 155) {
                field493 = false;
                for (int var224 = 0; var224 < 5; var224++) {
                    field526[var224] = false;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 154) {
                String var225 = field317.method2242();
                Object[] var226 = new Object[var225.length() + 1];
                for (int var227 = var225.length() - 1; var227 >= 0; var227--) {
                    if (var225.charAt(var227) == 's') {
                        var226[var227 + 1] = field317.method2242();
                    } else {
                        var226[var227 + 1] = Integer.valueOf(field317.method2239());
                    }
                }
                var226[0] = Integer.valueOf(field317.method2239());
                class1 var228 = new class1();
                var228.field1 = var226;
                class34.method3076(var228);
                field319 = -1;
                return true;
            }
            if (field319 == 24) {
                field407 = field317.method2234();
                if (field407 == 255) {
                    field407 = 0;
                }
                field512 = field317.method2234();
                if (field512 == 255) {
                    field512 = 0;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 4) {
                int var229 = field317.method2261();
                int var230 = field317.method2262();
                int var231 = field317.method2234();
                Statics.field665 = var231 >> 1;
                Statics.field37.method641(var229, var230, (var231 & 0x1) == 1);
                field319 = -1;
                return true;
            }
            if (field319 == 172) {
                int var232 = field317.method2280();
                class164 var233 = class164.method144(var232);
                var233.field2700 = 3;
                var233.field2701 = Statics.field37.field29.method3127();
                method106(var233);
                field319 = -1;
                return true;
            }
            if (field319 == 47) {
                int var234 = field317.method2380();
                int var235 = field317.method2363();
                class167.field2810[var234] = var235;
                if (class167.field2811[var234] != var235) {
                    class167.field2811[var234] = var235;
                    method2074(var234);
                }
                field374[++field462 - 1 & 0x1F] = var234;
                field319 = -1;
                return true;
            }
            if (field319 == 106) {
                field311 = field317.method2234();
                field319 = -1;
                return true;
            }
            if (field319 == 242) {
                boolean var236 = field317.method2234() == 1;
                if (var236) {
                    Statics.field2140 = class107.method1430() - field317.method2240();
                    Statics.field1616 = new class212(field317, true);
                } else {
                    Statics.field1616 = null;
                }
                field339 = field460;
                field319 = -1;
                return true;
            }
            if (field319 == 144) {
                Statics.field919 = field317.method2260();
                Statics.field2075 = field317.method2234();
                field319 = -1;
                return true;
            }
            if (field319 == 250) {
                field449 = field317.method2234();
                field496 = field317.method2234();
                field319 = -1;
                return true;
            }
            if (field319 == 89) {
                int var237 = field317.method2236();
                class15 var238 = (class15) class15.field214.method3418((long) var237);
                if (var238 != null) {
                    var238.method3540();
                }
                field463[++field464 - 1 & 0x1F] = var237 & 0x7FFF;
                field319 = -1;
                return true;
            }
            if (field319 == 173) {
                for (int var239 = 0; var239 < class167.field2811.length; var239++) {
                    if (class167.field2811[var239] != class167.field2810[var239]) {
                        class167.field2811[var239] = class167.field2810[var239];
                        method2074(var239);
                        field374[++field462 - 1 & 0x1F] = var239;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 174) {
                int var240 = field317.method2239();
                int var241 = field317.method2270();
                class164 var242 = class164.method144(var240);
                if (var242 != null && var242.field2661 == 0) {
                    if (var241 > var242.field2683 - var242.field2675) {
                        var241 = var242.field2683 - var242.field2675;
                    }
                    if (var241 < 0) {
                        var241 = 0;
                    }
                    if (var242.field2758 != var241) {
                        var242.field2758 = var241;
                        method106(var242);
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 31) {
                while (field317.field1890 < field318) {
                    int var243 = field317.method2234();
                    boolean var244 = (var243 & 0x1) == 1;
                    String var245 = field317.method2242();
                    String var246 = field317.method2242();
                    field317.method2242();
                    for (int var247 = 0; var247 < field548; var247++) {
                        class8 var248 = field305[var247];
                        if (var244) {
                            if (var246.equals(var248.field133)) {
                                var248.field133 = var245;
                                var248.field122 = var246;
                                var245 = null;
                                break;
                            }
                        } else if (var245.equals(var248.field133)) {
                            var248.field133 = var245;
                            var248.field122 = var246;
                            var245 = null;
                            break;
                        }
                    }
                    if (var245 != null && field548 < 400) {
                        class8 var249 = new class8();
                        field305[field548] = var249;
                        var249.field133 = var245;
                        var249.field122 = var246;
                        field548++;
                    }
                }
                field400 = field460;
                field319 = -1;
                return true;
            }
            if (field319 == 198) {
                class24 var250 = new class24();
                var250.field609 = field317.method2242();
                var250.field613 = field317.method2236();
                int var251 = field317.method2239();
                var250.field614 = var251;
                method2920(45);
                Statics.field2796.method2724();
                Statics.field2796 = null;
                class30.method2182(var250);
                field319 = -1;
                return false;
            }
            if (field319 == 161) {
                Statics.field1888 = class122.method86(field317.method2234());
                field319 = -1;
                return true;
            }
            if (field319 == 139) {
                if (field435 != -1) {
                    method588(field435, 0);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 124) {
                class202.method1454(field317, field318);
                field319 = -1;
                return true;
            }
            if (field319 == 99) {
                String var252 = field317.method2242();
                long var253 = (long) field317.method2236();
                long var255 = (long) field317.method2238();
                class143 var257 = (class143) class101.method979(Statics.method3070(), field317.method2234());
                long var258 = (var253 << 32) + var255;
                boolean var260 = false;
                for (int var261 = 0; var261 < 100; var261++) {
                    if (field281[var261] == var258) {
                        var260 = true;
                        break;
                    }
                }
                if (method1969(var252)) {
                    var260 = true;
                }
                if (!var260 && field392 == 0) {
                    field281[field499] = var258;
                    field499 = (field499 + 1) % 100;
                    class114 var262 = field317;
                    String var266;
                    try {
                        int var263 = var262.method2247();
                        if (var263 > 32767) {
                            var263 = 32767;
                        }
                        byte[] var264 = new byte[var263];
                        var262.field1890 += Statics.field3081.method2164(var262.field1889, var262.field1890, var264, 0, var263);
                        String var265 = class156.method2553(var264, 0, var263);
                        var266 = var265;
                    } catch (Exception var334) {
                        var266 = "Cabbage";
                    }
                    String var269 = class214.method3639(class154.method1946(var266));
                    byte var270;
                    if (var257.field2162) {
                        var270 = 7;
                    } else {
                        var270 = 3;
                    }
                    if (var257.field2158 == -1) {
                        class11.method2919(var270, var252, var269);
                    } else {
                        class11.method2919(var270, class2.method3119(var257.field2158) + var252, var269);
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 196) {
                method615(true);
                field319 = -1;
                return true;
            }
            if (field319 == 136) {
                method3557();
                field319 = -1;
                return false;
            }
            if (field319 == 190) {
                byte var271 = field317.method2265();
                int var272 = field317.method2380();
                class167.field2810[var272] = var271;
                if (class167.field2811[var272] != var271) {
                    class167.field2811[var272] = var271;
                    method2074(var272);
                }
                field374[++field462 - 1 & 0x1F] = var272;
                field319 = -1;
                return true;
            }
            if (field319 == 107) {
                int var273 = field317.method2363();
                int var274 = field317.method2280();
                class4 var275 = (class4) field483.method3418((long) var274);
                class4 var276 = (class4) field483.method3418((long) var273);
                if (var276 != null) {
                    method752(var276, var275 == null || var275.field51 != var276.field51);
                }
                if (var275 != null) {
                    var275.method3540();
                    field483.method3410(var275, (long) var273);
                }
                class164 var277 = class164.method144(var274);
                if (var277 != null) {
                    method106(var277);
                }
                class164 var278 = class164.method144(var273);
                if (var278 != null) {
                    method106(var278);
                    method2490(Statics.field2695[var278.field2667 >>> 16], var278, true);
                }
                if (field435 != -1) {
                    method588(field435, 1);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 231) {
                int var279 = field317.method2236();
                if (var279 == 65535) {
                    var279 = -1;
                }
                method582(var279);
                field319 = -1;
                return true;
            }
            if (field319 == 175) {
                int var280 = field317.method2256();
                if (var280 == 65535) {
                    var280 = -1;
                }
                int var281 = field317.method2275();
                method1438(var280, var281);
                field319 = -1;
                return true;
            }
            if (field319 == 135) {
                field287 = field317.method2236() * 30;
                field472 = field460;
                field319 = -1;
                return true;
            }
            if (field319 == 233) {
                String var282 = field317.method2242();
                Statics.field276 = var282;
                try {
                    String var283 = Statics.field267.getParameter(class181.field2971.field2974);
                    String var284 = Statics.field267.getParameter(class181.field2972.field2974);
                    String var285 = var283 + "settings=" + var282 + "; version=1; path=/; domain=" + var284;
                    String var286;
                    if (var282.length() == 0) {
                        var286 = var285 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var286 = var285 + "; Expires=" + class103.method848(class107.method1430() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    class124.method2572(Statics.field267, "document.cookie=\"" + var286 + "\"");
                } catch (Throwable var333) {
                }
                field319 = -1;
                return true;
            }
            if (field319 == 131) {
                field493 = true;
                Statics.field87 = field317.method2234();
                Statics.field1034 = field317.method2234();
                Statics.field818 = field317.method2236();
                Statics.field41 = field317.method2234();
                Statics.field1978 = field317.method2234();
                if (Statics.field1978 >= 100) {
                    int var288 = Statics.field87 * 128 + 64;
                    int var289 = Statics.field1034 * 128 + 64;
                    int var290 = method686(var288, var289, Statics.field665) - Statics.field818;
                    int var291 = var288 - Statics.field875;
                    int var292 = var290 - Statics.field2059;
                    int var293 = var289 - Statics.field1057;
                    int var294 = (int) Math.sqrt((double) (var291 * var291 + var293 * var293));
                    Statics.field2590 = (int) (Math.atan2((double) var292, (double) var294) * 325.949D) & 0x7FF;
                    Statics.field1613 = (int) (Math.atan2((double) var291, (double) var293) * -325.949D) & 0x7FF;
                    if (Statics.field2590 < 128) {
                        Statics.field2590 = 128;
                    }
                    if (Statics.field2590 > 383) {
                        Statics.field2590 = 383;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 177) {
                String var295 = field317.method2242();
                int var296 = field317.method2236();
                byte var297 = field317.method2235();
                boolean var298 = false;
                if (var297 == -128) {
                    var298 = true;
                }
                if (var298) {
                    if (Statics.field121 == 0) {
                        field319 = -1;
                        return true;
                    }
                    boolean var299 = false;
                    int var300;
                    for (var300 = 0; var300 < Statics.field121 && (!Statics.field1862[var300].field603.equals(var295) || Statics.field1862[var300].field599 != var296); var300++) {
                    }
                    if (var300 < Statics.field121) {
                        while (var300 < Statics.field121 - 1) {
                            Statics.field1862[var300] = Statics.field1862[var300 + 1];
                            var300++;
                        }
                        Statics.field121--;
                        Statics.field1862[Statics.field121] = null;
                    }
                } else {
                    field317.method2242();
                    class23 var301 = new class23();
                    var301.field603 = var295;
                    var301.field605 = class155.method1945(var301.field603, Statics.field329);
                    var301.field599 = var296;
                    var301.field602 = var297;
                    int var302;
                    for (var302 = Statics.field121 - 1; var302 >= 0; var302--) {
                        int var303 = Statics.field1862[var302].field605.compareTo(var301.field605);
                        if (var303 == 0) {
                            Statics.field1862[var302].field599 = var296;
                            Statics.field1862[var302].field602 = var297;
                            if (var295.equals(Statics.field37.field49)) {
                                Statics.field215 = var297;
                            }
                            field424 = field460;
                            field319 = -1;
                            return true;
                        }
                        if (var303 < 0) {
                            break;
                        }
                    }
                    if (Statics.field121 >= Statics.field1862.length) {
                        field319 = -1;
                        return true;
                    }
                    for (int var304 = Statics.field121 - 1; var304 > var302; var304--) {
                        Statics.field1862[var304 + 1] = Statics.field1862[var304];
                    }
                    if (Statics.field121 == 0) {
                        Statics.field1862 = new class23[100];
                    }
                    Statics.field1862[var302 + 1] = var301;
                    Statics.field121++;
                    if (var295.equals(Statics.field37.field49)) {
                        Statics.field215 = var297;
                    }
                }
                field424 = field460;
                field319 = -1;
                return true;
            }
            if (field319 == 20) {
                int var305 = field317.method2281();
                String var306 = field317.method2242();
                class164 var307 = class164.method144(var305);
                if (!var306.equals(var307.field2717)) {
                    var307.field2717 = var306;
                    method106(var307);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 80) {
                int var308 = field317.method2273();
                int var309 = field317.method2272();
                int var310 = field317.method2280();
                class164 var311 = class164.method144(var310);
                if (var311.field2666 != var309 || var311.field2669 != var308 || var311.field2664 != 0 || var311.field2740 != 0) {
                    var311.field2666 = var309;
                    var311.field2669 = var308;
                    var311.field2664 = 0;
                    var311.field2740 = 0;
                    method106(var311);
                    method2168(var311);
                    if (var311.field2661 == 0) {
                        method2490(Statics.field2695[var310 >> 16], var311, false);
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 54) {
                Statics.field2075 = field317.method2260();
                Statics.field919 = field317.method2261();
                for (int var312 = Statics.field2075; var312 < Statics.field2075 + 8; var312++) {
                    for (int var313 = Statics.field919; var313 < Statics.field919 + 8; var313++) {
                        if (field408[Statics.field665][var312][var313] != null) {
                            field408[Statics.field665][var312][var313] = null;
                            method584(var312, var313);
                        }
                    }
                }
                for (class16 var314 = (class16) field409.method3451(); var314 != null; var314 = (class16) field409.method3448()) {
                    if (var314.field222 >= Statics.field2075 && var314.field222 < Statics.field2075 + 8 && var314.field228 >= Statics.field919 && var314.field228 < Statics.field919 + 8 && Statics.field665 == var314.field216) {
                        var314.field227 = 0;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 26) {
                int var315 = field317.method2234();
                if (field317.method2234() == 0) {
                    field553[var315] = new class211();
                    field317.field1890 += 18;
                } else {
                    field317.field1890--;
                    field553[var315] = new class211(field317, false);
                }
                field390 = field460;
                field319 = -1;
                return true;
            }
            if (field319 == 115) {
                method1();
                field440 = field317.method2234();
                field472 = field460;
                field319 = -1;
                return true;
            }
            if (field319 == 142) {
                int var316 = field317.method2270();
                int var317 = field317.method2239();
                int var318 = field317.method2380();
                class164 var319 = class164.method144(var317);
                var319.field2713 = (var316 << 16) + var318;
                field319 = -1;
                return true;
            }
            if (field319 == 111) {
                int var320 = field317.method2256();
                int var321 = field317.method2363();
                class164 var322 = class164.method144(var321);
                if (var322.field2700 != 1 || var322.field2701 != var320) {
                    var322.field2700 = 1;
                    var322.field2701 = var320;
                    method106(var322);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 181) {
                int var323 = field317.method2239();
                class4 var324 = (class4) field483.method3418((long) var323);
                if (var324 != null) {
                    method752(var324, true);
                }
                if (field439 != null) {
                    method106(field439);
                    field439 = null;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 45) {
                int var325 = field317.method2380();
                field435 = var325;
                method134(false);
                method880(var325);
                Statics.method2841(field435);
                for (int var326 = 0; var326 < 100; var326++) {
                    field482[var326] = true;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 28) {
                for (int var327 = 0; var327 < Statics.field1113; var327++) {
                    class48 var328 = class48.method577(var327);
                    if (var328 != null) {
                        class167.field2810[var327] = 0;
                        class167.field2811[var327] = 0;
                    }
                }
                method1();
                field462 += 32;
                field319 = -1;
                return true;
            }
            class140.method2571("" + field319 + class2.field18 + field323 + class2.field18 + field326 + class2.field18 + field318, (Throwable) null);
            method3557();
        } catch (IOException var339) {
            method2526();
        } catch (Exception var340) {
            String var331 = "" + field319 + class2.field18 + field323 + class2.field18 + field326 + class2.field18 + field318 + class2.field18 + (Statics.field142 + Statics.field37.field828[0]) + class2.field18 + (Statics.field57 + Statics.field37.field827[0]) + class2.field18;
            for (int var332 = 0; var332 < field318 && var332 < 50; var332++) {
                var331 = var331 + field317.field1889[var332] + class2.field18;
            }
            class140.method2571(var331, var340);
            method3557();
        }
        return true;
    }

    @ObfuscatedName("ao.bm(I)V")
    public static final void method617() {
        if (field319 == 244) {
            int var0 = field317.method2261();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2075;
            int var2 = (var0 & 0x7) + Statics.field919;
            int var3 = field317.method2270();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class190 var4 = field408[Statics.field665][var1][var2];
                if (var4 != null) {
                    for (class27 var5 = (class27) var4.method3451(); var5 != null; var5 = (class27) var4.method3448()) {
                        if ((var3 & 0x7FFF) == var5.field658) {
                            var5.method3540();
                            break;
                        }
                    }
                    if (var4.method3451() == null) {
                        field408[Statics.field665][var1][var2] = null;
                    }
                    method584(var1, var2);
                }
            }
        } else if (field319 == 113) {
            int var6 = field317.method2234();
            int var7 = (var6 >> 4 & 0x7) + Statics.field2075;
            int var8 = (var6 & 0x7) + Statics.field919;
            int var9 = field317.method2236();
            int var10 = field317.method2236();
            int var11 = field317.method2236();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class190 var12 = field408[Statics.field665][var7][var8];
                if (var12 != null) {
                    for (class27 var13 = (class27) var12.method3451(); var13 != null; var13 = (class27) var12.method3448()) {
                        if ((var9 & 0x7FFF) == var13.field658 && var13.field657 == var10) {
                            var13.field657 = var11;
                            break;
                        }
                    }
                    method584(var7, var8);
                }
            }
        } else if (field319 == 186) {
            int var14 = field317.method2234();
            int var15 = (var14 >> 4 & 0x7) + Statics.field2075;
            int var16 = (var14 & 0x7) + Statics.field919;
            int var17 = field317.method2234();
            int var18 = var17 >> 2;
            int var19 = var17 & 0x3;
            int var20 = field336[var18];
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                method3364(Statics.field665, var15, var16, var20, -1, var18, var19, 0, -1);
            }
        } else if (field319 == 63) {
            int var21 = field317.method2260();
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = field336[var22];
            int var25 = field317.method2262();
            int var26 = (var25 >> 4 & 0x7) + Statics.field2075;
            int var27 = (var25 & 0x7) + Statics.field919;
            int var28 = field317.method2270();
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                method3364(Statics.field665, var26, var27, var24, var28, var22, var23, 0, -1);
            }
        } else if (field319 == 101) {
            int var29 = field317.method2234();
            int var30 = (var29 >> 4 & 0x7) + Statics.field2075;
            int var31 = (var29 & 0x7) + Statics.field919;
            int var32 = var30 + field317.method2235();
            int var33 = var31 + field317.method2235();
            int var34 = field317.method2237();
            int var35 = field317.method2236();
            int var36 = field317.method2234() * 4;
            int var37 = field317.method2234() * 4;
            int var38 = field317.method2236();
            int var39 = field317.method2236();
            int var40 = field317.method2234();
            int var41 = field317.method2234();
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104 && var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && var35 != 65535) {
                int var42 = var30 * 128 + 64;
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                class7 var46 = new class7(var35, Statics.field665, var42, var43, method686(var42, var43, Statics.field665) - var36, field280 + var38, field280 + var39, var40, var41, var34, var37);
                var46.method78(var44, var45, method686(var44, var45, Statics.field665) - var37, field280 + var38);
                field410.method3441(var46);
            }
        } else {
            if (field319 == 245) {
                int var47 = field317.method2256();
                int var48 = field317.method2234();
                int var49 = var48 >> 2;
                int var50 = var48 & 0x3;
                int var51 = field336[var49];
                int var52 = field317.method2380();
                int var53 = field317.method2234();
                int var54 = (var53 >> 4 & 0x7) + Statics.field2075;
                int var55 = (var53 & 0x7) + Statics.field919;
                int var56 = field317.method2256();
                byte var57 = field317.method2263();
                int var58 = field317.method2270();
                byte var59 = field317.method2409();
                byte var60 = field317.method2263();
                byte var61 = field317.method2263();
                class3 var62;
                if (field340 == var52) {
                    var62 = Statics.field37;
                } else {
                    var62 = field393[var52];
                }
                if (var62 != null) {
                    class38 var63 = class38.method2180(var58);
                    int var64;
                    int var65;
                    if (var50 == 1 || var50 == 3) {
                        var64 = var63.field904;
                        var65 = var63.field907;
                    } else {
                        var64 = var63.field907;
                        var65 = var63.field904;
                    }
                    int var66 = (var64 >> 1) + var54;
                    int var67 = (var64 + 1 >> 1) + var54;
                    int var68 = (var65 >> 1) + var55;
                    int var69 = (var65 + 1 >> 1) + var55;
                    int[][] var70 = class6.field79[Statics.field665];
                    int var71 = var70[var66][var68] + var70[var67][var68] + var70[var66][var69] + var70[var67][var69] >> 2;
                    int var72 = (var54 << 7) + (var64 << 6);
                    int var73 = (var55 << 7) + (var65 << 6);
                    class100 var74 = var63.method709(var49, var50, var70, var72, var71, var73);
                    if (var74 != null) {
                        method3364(Statics.field665, var54, var55, var51, -1, 0, 0, var56 + 1, var47 + 1);
                        var62.field35 = field280 + var56;
                        var62.field42 = field280 + var47;
                        var62.field40 = var74;
                        var62.field47 = var54 * 128 + var64 * 64;
                        var62.field48 = var55 * 128 + var65 * 64;
                        var62.field38 = var71;
                        if (var57 > var59) {
                            byte var75 = var57;
                            var57 = var59;
                            var59 = var75;
                        }
                        if (var60 > var61) {
                            byte var76 = var60;
                            var60 = var61;
                            var61 = var76;
                        }
                        var62.field33 = var54 + var57;
                        var62.field43 = var54 + var59;
                        var62.field44 = var55 + var60;
                        var62.field39 = var55 + var61;
                    }
                }
            }
            if (field319 == 160) {
                int var77 = field317.method2234();
                int var78 = (var77 >> 4 & 0x7) + Statics.field2075;
                int var79 = (var77 & 0x7) + Statics.field919;
                int var80 = field317.method2236();
                int var81 = field317.method2234();
                int var82 = var81 >> 4 & 0xF;
                int var83 = var81 & 0x7;
                int var84 = field317.method2234();
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    int var85 = var82 + 1;
                    if (Statics.field37.field828[0] >= var78 - var85 && Statics.field37.field828[0] <= var78 + var85 && Statics.field37.field827[0] >= var79 - var85 && Statics.field37.field827[0] <= var79 + var85 && field518 != 0 && var83 > 0 && field485 < 50) {
                        field520[field485] = var80;
                        field521[field485] = var83;
                        field522[field485] = var84;
                        field524[field485] = null;
                        field426[field485] = (var78 << 16) + (var79 << 8) + var82;
                        field485++;
                    }
                }
            }
            if (field319 == 145) {
                int var86 = field317.method2380();
                int var87 = field317.method2260();
                int var88 = (var87 >> 4 & 0x7) + Statics.field2075;
                int var89 = (var87 & 0x7) + Statics.field919;
                int var90 = field317.method2256();
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    class27 var91 = new class27();
                    var91.field658 = var86;
                    var91.field657 = var90;
                    if (field408[Statics.field665][var88][var89] == null) {
                        field408[Statics.field665][var88][var89] = new class190();
                    }
                    field408[Statics.field665][var88][var89].method3441(var91);
                    method584(var88, var89);
                }
            } else if (field319 == 95) {
                int var92 = field317.method2261();
                int var93 = var92 >> 2;
                int var94 = var92 & 0x3;
                int var95 = field336[var93];
                int var96 = field317.method2260();
                int var97 = (var96 >> 4 & 0x7) + Statics.field2075;
                int var98 = (var96 & 0x7) + Statics.field919;
                int var99 = field317.method2236();
                if (var97 >= 0 && var98 >= 0 && var97 < 103 && var98 < 103) {
                    if (var95 == 0) {
                        class82 var100 = Statics.field231.method1741(Statics.field665, var97, var98);
                        if (var100 != null) {
                            int var101 = var100.field1463 >> 14 & 0x7FFF;
                            if (var93 == 2) {
                                var100.field1465 = new class12(var101, 2, var94 + 4, Statics.field665, var97, var98, var99, false, var100.field1465);
                                var100.field1462 = new class12(var101, 2, var94 + 1 & 0x3, Statics.field665, var97, var98, var99, false, var100.field1462);
                            } else {
                                var100.field1465 = new class12(var101, var93, var94, Statics.field665, var97, var98, var99, false, var100.field1465);
                            }
                        }
                    }
                    if (var95 == 1) {
                        class89 var102 = Statics.field231.method1728(Statics.field665, var97, var98);
                        if (var102 != null) {
                            int var103 = var102.field1537 >> 14 & 0x7FFF;
                            if (var93 == 4 || var93 == 5) {
                                var102.field1540 = new class12(var103, 4, var94, Statics.field665, var97, var98, var99, false, var102.field1540);
                            } else if (var93 == 6) {
                                var102.field1540 = new class12(var103, 4, var94 + 4, Statics.field665, var97, var98, var99, false, var102.field1540);
                            } else if (var93 == 7) {
                                var102.field1540 = new class12(var103, 4, (var94 + 2 & 0x3) + 4, Statics.field665, var97, var98, var99, false, var102.field1540);
                            } else if (var93 == 8) {
                                var102.field1540 = new class12(var103, 4, var94 + 4, Statics.field665, var97, var98, var99, false, var102.field1540);
                                var102.field1541 = new class12(var103, 4, (var94 + 2 & 0x3) + 4, Statics.field665, var97, var98, var99, false, var102.field1541);
                            }
                        }
                    }
                    if (var95 == 2) {
                        class93 var104 = Statics.field231.method1812(Statics.field665, var97, var98);
                        if (var93 == 11) {
                            var93 = 10;
                        }
                        if (var104 != null) {
                            var104.field1591 = new class12(var104.field1600 >> 14 & 0x7FFF, var93, var94, Statics.field665, var97, var98, var99, false, var104.field1591);
                        }
                    }
                    if (var95 == 3) {
                        class88 var105 = Statics.field231.method1730(Statics.field665, var97, var98);
                        if (var105 != null) {
                            var105.field1528 = new class12(var105.field1526 >> 14 & 0x7FFF, 22, var94, Statics.field665, var97, var98, var99, false, var105.field1528);
                        }
                    }
                }
            } else if (field319 == 197) {
                int var106 = field317.method2234();
                int var107 = (var106 >> 4 & 0x7) + Statics.field2075;
                int var108 = (var106 & 0x7) + Statics.field919;
                int var109 = field317.method2236();
                int var110 = field317.method2234();
                int var111 = field317.method2236();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var112 = var107 * 128 + 64;
                    int var113 = var108 * 128 + 64;
                    class28 var114 = new class28(var109, Statics.field665, var112, var113, method686(var112, var113, Statics.field665) - var110, var111, field280);
                    field411.method3441(var114);
                }
            }
        }
    }

    @ObfuscatedName("fp.bo(IIIIIIIIII)V")
    public static final void method3364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field409.method3451(); var10 != null; var10 = (class16) field409.method3448()) {
            if (var10.field216 == arg0 && var10.field222 == arg1 && var10.field228 == arg2 && var10.field217 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field216 = arg0;
            var9.field217 = arg3;
            var9.field222 = arg1;
            var9.field228 = arg2;
            method155(var9);
            field409.method3441(var9);
        }
        var9.field219 = arg4;
        var9.field223 = arg5;
        var9.field224 = arg6;
        var9.field226 = arg7;
        var9.field227 = arg8;
    }

    @ObfuscatedName("q.ba(Lb;I)V")
    public static final void method155(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field217 == 0) {
            var1 = Statics.field231.method1850(arg0.field216, arg0.field222, arg0.field228);
        }
        if (arg0.field217 == 1) {
            var1 = Statics.field231.method1732(arg0.field216, arg0.field222, arg0.field228);
        }
        if (arg0.field217 == 2) {
            var1 = Statics.field231.method1733(arg0.field216, arg0.field222, arg0.field228);
        }
        if (arg0.field217 == 3) {
            var1 = Statics.field231.method1734(arg0.field216, arg0.field222, arg0.field228);
        }
        if (var1 != 0) {
            int var5 = Statics.field231.method1735(arg0.field216, arg0.field222, arg0.field228, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field220 = var2;
        arg0.field229 = var3;
        arg0.field221 = var4;
    }

    @ObfuscatedName("ax.by(IIIIIIIB)V")
    public static final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field274 && Statics.field665 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field231.method1850(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field231.method1732(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field231.method1733(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field231.method1734(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field231.method1735(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field231.method1722(arg0, arg2, arg3);
                class38 var15 = class38.method2180(var12);
                if (var15.field905 != 0) {
                    field333[arg0].method3781(arg2, arg3, var13, var14, var15.field906);
                }
            }
            if (arg1 == 1) {
                Statics.field231.method1724(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field231.method1802(arg0, arg2, arg3);
                class38 var16 = class38.method2180(var12);
                if (var16.field907 + arg2 > 103 || var16.field907 + arg3 > 103 || var16.field904 + arg2 > 103 || var16.field904 + arg3 > 103) {
                    return;
                }
                if (var16.field905 != 0) {
                    field333[arg0].method3771(arg2, arg3, var16.field907, var16.field904, var14, var16.field906);
                }
            }
            if (arg1 == 3) {
                Statics.field231.method1725(arg0, arg2, arg3);
                class38 var17 = class38.method2180(var12);
                if (var17.field905 == 1) {
                    field333[arg0].method3780(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field68[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method2738(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field231, field333[arg0]);
    }

    @ObfuscatedName("ag.bt(IIB)V")
    public static final void method584(int arg0, int arg1) {
        class190 var2 = field408[Statics.field665][arg0][arg1];
        if (var2 == null) {
            Statics.field231.method1726(Statics.field665, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3451(); var6 != null; var6 = (class27) var2.method3448()) {
            class47 var7 = class47.method127(var6.field658);
            long var8 = (long) var7.field1071;
            if (var7.field1079 == 1) {
                var8 = (long) (var6.field657 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field231.method1726(Statics.field665, arg0, arg1);
            return;
        }
        var2.method3442(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3451(); var12 != null; var12 = (class27) var2.method3448()) {
            if (var5.field658 != var12.field658) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field658 != var12.field658 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field231.method1712(Statics.field665, arg0, arg1, method686(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field665), var5, var13, var10, var11);
    }

    @ObfuscatedName("g.bp(I)V")
    public static final void method574() {
        while (true) {
            if (field317.method2498(field318) >= 11) {
                int var0 = field317.method2496(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field393[var0] == null) {
                        field393[var0] = new class3();
                        if (field398[var0] != null) {
                            field393[var0].method14(field398[var0]);
                        }
                        var1 = true;
                    }
                    field517[++field501 - 1] = var0;
                    class3 var2 = field393[var0];
                    var2.field821 = field280;
                    int var3 = field317.method2496(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field317.method2496(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field406[field317.method2496(3)];
                    if (var1) {
                        var2.field780 = var2.field774 = var5;
                    }
                    int var6 = field317.method2496(1);
                    int var7 = field317.method2496(1);
                    if (var7 == 1) {
                        field397[++field396 - 1] = var0;
                    }
                    var2.method641(Statics.field37.field828[0] + var4, Statics.field37.field827[0] + var3, var6 == 1);
                    continue;
                }
            }
            field317.method2497();
            return;
        }
    }

    @ObfuscatedName("an.bs(ZB)V")
    public static final void method615(boolean arg0) {
        field504 = 0;
        field396 = 0;
        field317.method2495();
        int var1 = field317.method2496(8);
        if (var1 < field313) {
            for (int var2 = var1; var2 < field313; var2++) {
                field402[++field504 - 1] = field314[var2];
            }
        }
        if (var1 > field313) {
            throw new RuntimeException("");
        }
        field313 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field314[var3];
            class32 var5 = field312[var4];
            int var6 = field317.method2496(1);
            if (var6 == 0) {
                field314[++field313 - 1] = var4;
                var5.field821 = field280;
            } else {
                int var7 = field317.method2496(2);
                if (var7 == 0) {
                    field314[++field313 - 1] = var4;
                    var5.field821 = field280;
                    field397[++field396 - 1] = var4;
                } else if (var7 == 1) {
                    field314[++field313 - 1] = var4;
                    var5.field821 = field280;
                    int var8 = field317.method2496(3);
                    var5.method642(var8, false);
                    int var9 = field317.method2496(1);
                    if (var9 == 1) {
                        field397[++field396 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field314[++field313 - 1] = var4;
                    var5.field821 = field280;
                    int var10 = field317.method2496(3);
                    var5.method642(var10, true);
                    int var11 = field317.method2496(3);
                    var5.method642(var11, true);
                    int var12 = field317.method2496(1);
                    if (var12 == 1) {
                        field397[++field396 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field402[++field504 - 1] = var4;
                }
            }
        }
        while (field317.method2498(field318) >= 27) {
            int var13 = field317.method2496(15);
            if (var13 == 32767) {
                break;
            }
            boolean var29 = false;
            if (field312[var13] == null) {
                field312[var13] = new class32();
                var29 = true;
            }
            class32 var30 = field312[var13];
            field314[++field313 - 1] = var13;
            var30.field821 = field280;
            int var31 = field406[field317.method2496(3)];
            if (var29) {
                var30.field780 = var30.field774 = var31;
            }
            int var32 = field317.method2496(1);
            if (var32 == 1) {
                field397[++field396 - 1] = var13;
            }
            var30.field743 = class37.method141(field317.method2496(14));
            int var33 = field317.method2496(1);
            int var34;
            if (arg0) {
                var34 = field317.method2496(8);
                if (var34 > 127) {
                    var34 -= 256;
                }
            } else {
                var34 = field317.method2496(5);
                if (var34 > 15) {
                    var34 -= 32;
                }
            }
            int var35;
            if (arg0) {
                var35 = field317.method2496(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = field317.method2496(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            var30.field776 = var30.field743.field852;
            var30.field825 = var30.field743.field853;
            if (var30.field825 == 0) {
                var30.field774 = 0;
            }
            var30.field792 = var30.field743.field886;
            var30.field788 = var30.field743.field859;
            var30.field782 = var30.field743.field860;
            var30.field832 = var30.field743.field861;
            var30.field777 = var30.field743.field855;
            var30.field778 = var30.field743.field863;
            var30.field819 = var30.field743.field868;
            var30.method641(Statics.field37.field828[0] + var34, Statics.field37.field827[0] + var35, var33 == 1);
        }
        field317.method2497();
        for (int var14 = 0; var14 < field396; var14++) {
            int var15 = field397[var14];
            class32 var16 = field312[var15];
            int var17 = field317.method2234();
            if ((var17 & 0x1) != 0) {
                int var18 = field317.method2261();
                int var19 = field317.method2261();
                var16.method647(var18, var19, field280);
                var16.field795 = field280 + 300;
                var16.field796 = field317.method2270();
                var16.field797 = field317.method2256();
            }
            if ((var17 & 0x20) != 0) {
                var16.field743 = class37.method141(field317.method2236());
                var16.field776 = var16.field743.field852;
                var16.field825 = var16.field743.field853;
                var16.field792 = var16.field743.field886;
                var16.field788 = var16.field743.field859;
                var16.field782 = var16.field743.field860;
                var16.field832 = var16.field743.field861;
                var16.field777 = var16.field743.field855;
                var16.field778 = var16.field743.field863;
                var16.field819 = var16.field743.field868;
            }
            if ((var17 & 0x2) != 0) {
                int var20 = field317.method2262();
                int var21 = field317.method2261();
                var16.method647(var20, var21, field280);
                var16.field795 = field280 + 300;
                var16.field796 = field317.method2256();
                var16.field797 = field317.method2256();
            }
            if ((var17 & 0x8) != 0) {
                var16.field799 = field317.method2236();
                var16.field800 = field317.method2380();
            }
            if ((var17 & 0x10) != 0) {
                int var22 = field317.method2236();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = field317.method2261();
                if (var16.field804 == var22 && var22 != -1) {
                    int var24 = Statics.method860(var22).field958;
                    if (var24 == 1) {
                        var16.field805 = 0;
                        var16.field806 = 0;
                        var16.field785 = var23;
                        var16.field783 = 0;
                    }
                    if (var24 == 2) {
                        var16.field783 = 0;
                    }
                } else if (var22 == -1 || var16.field804 == -1 || Statics.method860(var22).field964 >= Statics.method860(var16.field804).field964) {
                    var16.field804 = var22;
                    var16.field805 = 0;
                    var16.field806 = 0;
                    var16.field785 = var23;
                    var16.field783 = 0;
                    var16.field831 = var16.field826;
                }
            }
            if ((var17 & 0x40) != 0) {
                var16.field809 = field317.method2256();
                int var25 = field317.method2239();
                var16.field813 = var25 >> 16;
                var16.field812 = (var25 & 0xFFFF) + field280;
                var16.field810 = 0;
                var16.field811 = 0;
                if (var16.field812 > field280) {
                    var16.field810 = -1;
                }
                if (var16.field809 == 65535) {
                    var16.field809 = -1;
                }
            }
            if ((var17 & 0x4) != 0) {
                var16.field798 = field317.method2236();
                if (var16.field798 == 65535) {
                    var16.field798 = -1;
                }
            }
            if ((var17 & 0x80) != 0) {
                var16.field791 = field317.method2242();
                var16.field779 = 100;
            }
        }
        for (int var26 = 0; var26 < field504; var26++) {
            int var27 = field402[var26];
            if (field280 != field312[var27].field821) {
                field312[var27].field743 = null;
                field312[var27] = null;
            }
        }
        if (field318 != field317.field1890) {
            throw new RuntimeException(field317.field1890 + class2.field18 + field318);
        }
        for (int var28 = 0; var28 < field313; var28++) {
            if (field312[field314[var28]] == null) {
                throw new RuntimeException(var28 + class2.field18 + field313);
            }
        }
    }

    @ObfuscatedName("i.bg(IIIII)V")
    public static final void method88(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field304; var4++) {
            if (field487[var4] + field286[var4] > arg0 && field286[var4] < arg0 + arg2 && field488[var4] + field486[var4] > arg1 && field486[var4] < arg1 + arg3) {
                field482[var4] = true;
            }
        }
    }

    @ObfuscatedName("cn.bk(IIIIB)V")
    public static final void method1699(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field304; var4++) {
            if (field487[var4] + field286[var4] > arg0 && field286[var4] < arg0 + arg2 && field488[var4] + field486[var4] > arg1 && field486[var4] < arg1 + arg3) {
                field298[var4] = true;
            }
        }
    }

    @ObfuscatedName("k.bq(B)V")
    public static final void method525() {
        method2833();
        if (Statics.field570 != null || field448 != null) {
            return;
        }
        int var18;
        int var19;
        label201: {
            int var0 = class132.field2055;
            if (field416) {
                if (var0 != 1 && (Statics.field240 || var0 != 4)) {
                    int var1 = class132.field2049;
                    int var2 = class132.field2050;
                    if (var1 < Statics.field230 - 10 || var1 > Statics.field730 + Statics.field230 + 10 || var2 < Statics.field181 - 10 || var2 > Statics.field836 + Statics.field181 + 10) {
                        field416 = false;
                        method88(Statics.field230, Statics.field181, Statics.field730, Statics.field836);
                    }
                }
                if (var0 == 1 || !Statics.field240 && var0 == 4) {
                    int var3 = Statics.field230;
                    int var4 = Statics.field181;
                    int var5 = Statics.field730;
                    int var6 = class132.field2043;
                    int var7 = class132.field2057;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field457; var9++) {
                        int var10 = (field457 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1 && var8 >= 0) {
                        int var11 = field511[var8];
                        int var12 = field419[var8];
                        int var13 = field283[var8];
                        int var14 = field421[var8];
                        String var15 = field422[var8];
                        String var16 = field425[var8];
                        method2590(var11, var12, var13, var14, var15, var16, class132.field2043, class132.field2057);
                    }
                    field416 = false;
                    method88(Statics.field230, Statics.field181, Statics.field730, Statics.field836);
                }
            } else {
                if ((var0 == 1 || !Statics.field240 && var0 == 4) && field457 > 0) {
                    int var17 = field283[field457 - 1];
                    if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                        var18 = field511[field457 - 1];
                        var19 = field419[field457 - 1];
                        class164 var20 = class164.method144(var19);
                        int var21 = method3358(var20);
                        boolean var22 = (var21 >> 28 & 0x1) != 0;
                        if (var22) {
                            break label201;
                        }
                        class169 var10000 = (class169) null;
                        if (Statics.method616(method3358(var20))) {
                            break label201;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field240 && var0 == 4) && (field415 == 1 && field457 > 2 || method485(field457 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field240 && var0 == 4) && field457 > 0) {
                    int var24 = field457 - 1;
                    if (var24 >= 0) {
                        int var25 = field511[var24];
                        int var26 = field419[var24];
                        int var27 = field283[var24];
                        int var28 = field421[var24];
                        String var29 = field422[var24];
                        String var30 = field425[var24];
                        method2590(var25, var26, var27, var28, var29, var30, class132.field2043, class132.field2057);
                    }
                }
                if (var0 == 2 && field457 > 0) {
                    method80(class132.field2043, class132.field2057);
                }
            }
            return;
        }
        if (Statics.field570 != null && !field519 && field415 != 1 && !method485(field457 - 1) && field457 > 0) {
            method1873(field387, field388);
        }
        field519 = false;
        field391 = 0;
        if (Statics.field570 != null) {
            method106(Statics.field570);
        }
        Statics.field570 = class164.method144(var19);
        field459 = var18;
        field387 = class132.field2043;
        field388 = class132.field2057;
        if (field457 > 0) {
            int var23 = field457 - 1;
            Statics.field210 = new class29();
            Statics.field210.field694 = field511[var23];
            Statics.field210.field685 = field419[var23];
            Statics.field210.field691 = field283[var23];
            Statics.field210.field687 = field421[var23];
            Statics.field210.field688 = field422[var23];
        }
        method106(Statics.field570);
    }

    @ObfuscatedName("i.bh(III)V")
    public static final void method80(int arg0, int arg1) {
        int var2 = Statics.field2567.method3635(class148.field2365);
        for (int var3 = 0; var3 < field457; var3++) {
            class215 var4 = Statics.field2567;
            String var5;
            if (field425[var3].length() > 0) {
                var5 = field422[var3] + class148.field2372 + field425[var3];
            } else {
                var5 = field422[var3];
            }
            int var6 = var4.method3635(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field457 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field696) {
            var8 = Statics.field696 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1848) {
            var9 = Statics.field1848 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field416 = true;
        Statics.field230 = var8;
        Statics.field181 = var9;
        Statics.field730 = var2;
        Statics.field836 = field457 * 15 + 22;
    }

    @ObfuscatedName("client.bi(IB)Z")
    public static final boolean method485(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field283[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("et.br(Laq;IIB)V")
    public static final void method2835(class29 arg0, int arg1, int arg2) {
        method2590(arg0.field694, arg0.field685, arg0.field691, arg0.field687, arg0.field688, arg0.field688, arg1, arg2);
    }

    @ObfuscatedName("dt.bx(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2590(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 4) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(6);
            field266.method2220(arg3 >> 14 & 0x7FFF);
            field266.method2219(class129.field2015[82] ? 1 : 0);
            field266.method2244(Statics.field57 + arg1);
            field266.method2244(Statics.field142 + arg0);
        }
        if (arg2 == 21) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(155);
            field266.method2266(arg3);
            field266.method2244(Statics.field142 + arg0);
            field266.method2220(Statics.field57 + arg1);
            field266.method2219(class129.field2015[82] ? 1 : 0);
        }
        if (arg2 == 20) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(12);
            field266.method2220(Statics.field57 + arg1);
            field266.method2302(class129.field2015[82] ? 1 : 0);
            field266.method2220(arg3);
            field266.method2220(Statics.field142 + arg0);
        }
        if (arg2 == 1) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(150);
            field266.method2314(Statics.field25);
            field266.method2278(Statics.field260);
            field266.method2266(arg3 >> 14 & 0x7FFF);
            field266.method2219(class129.field2015[82] ? 1 : 0);
            field266.method2314(Statics.field57 + arg1);
            field266.method2220(Statics.field2616);
            field266.method2266(Statics.field142 + arg0);
        }
        if (arg2 == 39) {
            field266.method2493(123);
            field266.method2266(arg0);
            field266.method2222(arg1);
            field266.method2314(arg3);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 47) {
            class3 var8 = field393[arg3];
            if (var8 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(56);
                field266.method2219(class129.field2015[82] ? 1 : 0);
                field266.method2220(arg3);
            }
        }
        if (arg2 == 40) {
            field266.method2493(200);
            field266.method2220(arg3);
            field266.method2314(arg0);
            field266.method2230(arg1);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 10) {
            class32 var9 = field312[arg3];
            if (var9 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(254);
                field266.method2302(class129.field2015[82] ? 1 : 0);
                field266.method2244(arg3);
            }
        }
        if (arg2 == 1002) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field266.method2493(213);
            field266.method2266(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 29) {
            field266.method2493(34);
            field266.method2222(arg1);
            class164 var10 = class164.method144(arg1);
            if (var10.field2769 != null && var10.field2769[0][0] == 5) {
                int var11 = var10.field2769[0][1];
                if (class167.field2811[var11] != var10.field2733[0]) {
                    class167.field2811[var11] = var10.field2733[0];
                    method2074(var11);
                }
            }
        }
        if (arg2 == 11) {
            class32 var12 = field312[arg3];
            if (var12 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(31);
                field266.method2244(arg3);
                field266.method2219(class129.field2015[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class32 var13 = field312[arg3];
            if (var13 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(139);
                field266.method2383(class129.field2015[82] ? 1 : 0);
                field266.method2244(arg3);
            }
        }
        if (arg2 == 34) {
            field266.method2493(122);
            field266.method2244(arg0);
            field266.method2416(arg1);
            field266.method2266(arg3);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 25) {
            class164 var14 = class164.method143(arg1, arg0);
            if (var14 != null) {
                method498();
                int var15 = method3358(var14);
                int var16 = var15 >> 11 & 0x3F;
                int var18 = var14.field2777;
                class164 var19 = class164.method143(arg1, arg0);
                if (var19 != null && var19.field2759 != null) {
                    class1 var20 = new class1();
                    var20.field5 = var19;
                    var20.field1 = var19.field2759;
                    class34.method3076(var20);
                }
                field432 = var18;
                field430 = true;
                Statics.field1974 = arg1;
                field291 = arg0;
                Statics.field194 = var16;
                method106(var19);
                field428 = 0;
                int var21 = method3358(var14);
                int var22 = var21 >> 11 & 0x3F;
                String var23;
                if (var22 == 0) {
                    var23 = null;
                } else if (var14.field2736 == null || var14.field2736.trim().length() == 0) {
                    var23 = null;
                } else {
                    var23 = var14.field2736;
                }
                field420 = var23;
                if (field420 == null) {
                    field420 = "Null";
                }
                if (var14.field2658) {
                    field377 = var14.field2752 + class2.method2073(16777215);
                } else {
                    field377 = class2.method2073(65280) + var14.field2773 + class2.method2073(16777215);
                }
            }
            return;
        }
        if (arg2 == 58) {
            class164 var24 = class164.method143(arg1, arg0);
            if (var24 != null) {
                field266.method2493(224);
                field266.method2266(arg0);
                field266.method2314(field432);
                field266.method2244(field291);
                field266.method2266(var24.field2777);
                field266.method2416(Statics.field1974);
                field266.method2230(arg1);
            }
        }
        if (arg2 == 22) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(252);
            field266.method2266(Statics.field142 + arg0);
            field266.method2314(Statics.field57 + arg1);
            field266.method2220(arg3);
            field266.method2302(class129.field2015[82] ? 1 : 0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var25 = class164.method143(arg1, arg0);
            if (var25 != null) {
                method2840(arg3, arg1, arg0, var25.field2777, arg5);
            }
        }
        if (arg2 == 28) {
            field266.method2493(34);
            field266.method2222(arg1);
            class164 var26 = class164.method144(arg1);
            if (var26.field2769 != null && var26.field2769[0][0] == 5) {
                int var27 = var26.field2769[0][1];
                class167.field2811[var27] = 1 - class167.field2811[var27];
                method2074(var27);
            }
        }
        if (arg2 == 32) {
            field266.method2493(3);
            field266.method2222(arg1);
            field266.method2266(field291);
            field266.method2222(Statics.field1974);
            field266.method2244(arg0);
            field266.method2244(arg3);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 2) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(206);
            field266.method2434(class129.field2015[82] ? 1 : 0);
            field266.method2314(Statics.field57 + arg1);
            field266.method2230(Statics.field1974);
            field266.method2266(arg3 >> 14 & 0x7FFF);
            field266.method2314(Statics.field142 + arg0);
            field266.method2244(field291);
        }
        if (arg2 == 5) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(94);
            field266.method2244(Statics.field142 + arg0);
            field266.method2220(Statics.field57 + arg1);
            field266.method2220(arg3 >> 14 & 0x7FFF);
            field266.method2302(class129.field2015[82] ? 1 : 0);
        }
        if (arg2 == 44) {
            class3 var28 = field393[arg3];
            if (var28 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(199);
                field266.method2383(class129.field2015[82] ? 1 : 0);
                field266.method2266(arg3);
            }
        }
        if (arg2 == 38) {
            method498();
            class164 var29 = class164.method144(arg1);
            field428 = 1;
            Statics.field25 = arg0;
            Statics.field260 = arg1;
            Statics.field2616 = arg3;
            method106(var29);
            field429 = class2.method2073(16748608) + class47.method127(arg3).field1078 + class2.method2073(16777215);
            if (field429 == null) {
                field429 = "null";
            }
            return;
        }
        if (arg2 == 48) {
            class3 var30 = field393[arg3];
            if (var30 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(175);
                field266.method2266(arg3);
                field266.method2302(class129.field2015[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field231.method1788(Statics.field665, arg0, arg1);
        }
        if (arg2 == 41) {
            field266.method2493(26);
            field266.method2222(arg1);
            field266.method2244(arg3);
            field266.method2244(arg0);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 7) {
            class32 var31 = field312[arg3];
            if (var31 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(132);
                field266.method2220(Statics.field25);
                field266.method2244(arg3);
                field266.method2416(Statics.field260);
                field266.method2314(Statics.field2616);
                field266.method2383(class129.field2015[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field266.method2493(88);
            field266.method2244(arg3);
            field266.method2222(arg1);
            field266.method2314(arg0);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 46) {
            class3 var32 = field393[arg3];
            if (var32 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(229);
                field266.method2244(arg3);
                field266.method2434(class129.field2015[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            class32 var33 = field312[arg3];
            if (var33 != null) {
                class37 var34 = var33.field743;
                if (var34.field876 != null) {
                    var34 = var34.method663();
                }
                if (var34 != null) {
                    field266.method2493(130);
                    field266.method2266(var34.field858);
                }
            }
        }
        if (arg2 == 26) {
            method26();
        }
        if (arg2 == 9) {
            class32 var35 = field312[arg3];
            if (var35 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(189);
                field266.method2266(arg3);
                field266.method2434(class129.field2015[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class32 var36 = field312[arg3];
            if (var36 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(40);
                field266.method2266(field291);
                field266.method2416(Statics.field1974);
                field266.method2219(class129.field2015[82] ? 1 : 0);
                field266.method2244(arg3);
            }
        }
        if (arg2 == 35) {
            field266.method2493(212);
            field266.method2220(arg0);
            field266.method2416(arg1);
            field266.method2266(arg3);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 1001) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(30);
            field266.method2314(Statics.field142 + arg0);
            field266.method2266(Statics.field57 + arg1);
            field266.method2383(class129.field2015[82] ? 1 : 0);
            field266.method2220(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 3) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(185);
            field266.method2244(arg3 >> 14 & 0x7FFF);
            field266.method2302(class129.field2015[82] ? 1 : 0);
            field266.method2220(Statics.field57 + arg1);
            field266.method2244(Statics.field142 + arg0);
        }
        if (arg2 == 19) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(2);
            field266.method2266(arg3);
            field266.method2266(Statics.field57 + arg1);
            field266.method2314(Statics.field142 + arg0);
            field266.method2302(class129.field2015[82] ? 1 : 0);
        }
        if (arg2 == 16) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(72);
            field266.method2220(Statics.field2616);
            field266.method2278(Statics.field260);
            field266.method2266(Statics.field57 + arg1);
            field266.method2244(arg3);
            field266.method2244(Statics.field142 + arg0);
            field266.method2220(Statics.field25);
            field266.method2383(class129.field2015[82] ? 1 : 0);
        }
        if (arg2 == 37) {
            field266.method2493(246);
            field266.method2244(arg0);
            field266.method2314(arg3);
            field266.method2222(arg1);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 1004) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field266.method2493(156);
            field266.method2244(arg3);
        }
        if (arg2 == 51) {
            class3 var37 = field393[arg3];
            if (var37 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(220);
                field266.method2302(class129.field2015[82] ? 1 : 0);
                field266.method2220(arg3);
            }
        }
        if (arg2 == 33) {
            field266.method2493(165);
            field266.method2244(arg0);
            field266.method2220(arg3);
            field266.method2230(arg1);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 50) {
            class3 var38 = field393[arg3];
            if (var38 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(95);
                field266.method2219(class129.field2015[82] ? 1 : 0);
                field266.method2220(arg3);
            }
        }
        if (arg2 == 18) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(186);
            field266.method2314(Statics.field57 + arg1);
            field266.method2383(class129.field2015[82] ? 1 : 0);
            field266.method2314(Statics.field142 + arg0);
            field266.method2314(arg3);
        }
        if (arg2 == 45) {
            class3 var39 = field393[arg3];
            if (var39 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(237);
                field266.method2266(arg3);
                field266.method2434(class129.field2015[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field266.method2493(107);
            field266.method2230(arg1);
            field266.method2314(arg0);
            field266.method2244(Statics.field25);
            field266.method2314(arg3);
            field266.method2244(Statics.field2616);
            field266.method2230(Statics.field260);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 15) {
            class3 var40 = field393[arg3];
            if (var40 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(110);
                field266.method2220(field291);
                field266.method2266(arg3);
                field266.method2416(Statics.field1974);
                field266.method2219(class129.field2015[82] ? 1 : 0);
            }
        }
        if (arg2 == 12) {
            class32 var41 = field312[arg3];
            if (var41 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(76);
                field266.method2434(class129.field2015[82] ? 1 : 0);
                field266.method2244(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var42 = field393[arg3];
            if (var42 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(37);
                field266.method2222(Statics.field260);
                field266.method2314(arg3);
                field266.method2220(Statics.field25);
                field266.method2383(class129.field2015[82] ? 1 : 0);
                field266.method2266(Statics.field2616);
            }
        }
        if (arg2 == 24) {
            class164 var43 = class164.method144(arg1);
            boolean var44 = true;
            if (var43.field2663 > 0) {
                var44 = method2705(var43);
            }
            if (var44) {
                field266.method2493(34);
                field266.method2222(arg1);
            }
        }
        if (arg2 == 49) {
            class3 var45 = field393[arg3];
            if (var45 != null) {
                field380 = arg6;
                field381 = arg7;
                field383 = 2;
                field382 = 0;
                field407 = arg0;
                field512 = arg1;
                field266.method2493(218);
                field266.method2314(arg3);
                field266.method2434(class129.field2015[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class164 var46 = class164.method144(arg1);
            if (var46 == null || var46.field2744[arg0] < 100000) {
                field266.method2493(156);
                field266.method2244(arg3);
            } else {
                class11.method2919(27, "", var46.field2744[arg0] + " x " + class47.method127(arg3).field1078);
            }
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 6) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(24);
            field266.method2302(class129.field2015[82] ? 1 : 0);
            field266.method2220(Statics.field142 + arg0);
            field266.method2220(arg3 >> 14 & 0x7FFF);
            field266.method2266(Statics.field57 + arg1);
        }
        if (arg2 == 43) {
            field266.method2493(125);
            field266.method2220(arg3);
            field266.method2244(arg0);
            field266.method2416(arg1);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 42) {
            field266.method2493(211);
            field266.method2266(arg0);
            field266.method2222(arg1);
            field266.method2266(arg3);
            field384 = 0;
            Statics.field1940 = class164.method144(arg1);
            field385 = arg0;
        }
        if (arg2 == 30 && field439 == null) {
            method142(arg1, arg0);
            field439 = class164.method143(arg1, arg0);
            method106(field439);
        }
        if (arg2 == 17) {
            field380 = arg6;
            field381 = arg7;
            field383 = 2;
            field382 = 0;
            field407 = arg0;
            field512 = arg1;
            field266.method2493(242);
            field266.method2222(Statics.field1974);
            field266.method2244(Statics.field142 + arg0);
            field266.method2244(Statics.field57 + arg1);
            field266.method2266(arg3);
            field266.method2220(field291);
            field266.method2302(class129.field2015[82] ? 1 : 0);
        }
        if (field428 != 0) {
            field428 = 0;
            method106(class164.method144(Statics.field260));
        }
        if (field430) {
            method498();
        }
        if (Statics.field1940 != null && field384 == 0) {
            method106(Statics.field1940);
        }
    }

    @ObfuscatedName("am.be(ILjava/lang/String;B)V")
    public static void method1106(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field501; var3++) {
            class3 var4 = field393[field517[var3]];
            if (var4 != null && var4.field49 != null && var4.field49.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field266.method2493(199);
                    field266.method2383(0);
                    field266.method2266(field517[var3]);
                } else if (arg0 == 4) {
                    field266.method2493(56);
                    field266.method2219(0);
                    field266.method2220(field517[var3]);
                } else if (arg0 == 6) {
                    field266.method2493(218);
                    field266.method2314(field517[var3]);
                    field266.method2434(0);
                } else if (arg0 == 7) {
                    field266.method2493(95);
                    field266.method2219(0);
                    field266.method2220(field517[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class11.method2919(4, "", class148.field2361 + arg1);
        }
    }

    @ObfuscatedName("p.bd(S)V")
    public static void method498() {
        if (!field430) {
            return;
        }
        class164 var0 = class164.method143(Statics.field1974, field291);
        if (var0 != null && var0.field2749 != null) {
            class1 var1 = new class1();
            var1.field5 = var0;
            var1.field1 = var0.field2749;
            class34.method3076(var1);
        }
        field430 = false;
        method106(var0);
    }

    @ObfuscatedName("x.bw(IIS)V")
    public static void method142(int arg0, int arg1) {
        field266.method2493(124);
        field266.method2230(arg0);
        field266.method2314(arg1);
    }

    @ObfuscatedName("ei.bc(IIIILjava/lang/String;I)V")
    public static void method2840(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class164 var5 = class164.method143(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2757 != null) {
            class1 var6 = new class1();
            var6.field5 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field1 = var5.field2757;
            class34.method3076(var6);
        }
        boolean var7 = true;
        if (var5.field2663 > 0) {
            var7 = method2705(var5);
        }
        if (!var7 || !class169.method5(method3358(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field266.method2493(207);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
        if (arg0 == 2) {
            field266.method2493(233);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
        if (arg0 == 3) {
            field266.method2493(83);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
        if (arg0 == 4) {
            field266.method2493(103);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
        if (arg0 == 5) {
            field266.method2493(160);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
        if (arg0 == 6) {
            field266.method2493(166);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
        if (arg0 == 7) {
            field266.method2493(192);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
        if (arg0 == 8) {
            field266.method2493(35);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
        if (arg0 == 9) {
            field266.method2493(176);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
        if (arg0 == 10) {
            field266.method2493(32);
            field266.method2222(arg1);
            field266.method2220(arg2);
            field266.method2220(arg3);
        }
    }

    @ObfuscatedName("eb.bz(I)V")
    public static final void method2833() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field457 - 1; var1++) {
                if (field283[var1] < 1000 && field283[var1 + 1] > 1000) {
                    String var2 = field425[var1];
                    field425[var1] = field425[var1 + 1];
                    field425[var1 + 1] = var2;
                    String var3 = field422[var1];
                    field422[var1] = field422[var1 + 1];
                    field422[var1 + 1] = var3;
                    int var4 = field283[var1];
                    field283[var1] = field283[var1 + 1];
                    field283[var1 + 1] = var4;
                    int var5 = field511[var1];
                    field511[var1] = field511[var1 + 1];
                    field511[var1 + 1] = var5;
                    int var6 = field419[var1];
                    field419[var1] = field419[var1 + 1];
                    field419[var1 + 1] = var6;
                    int var7 = field421[var1];
                    field421[var1] = field421[var1 + 1];
                    field421[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ac.bn(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method638(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field416 || field457 >= 500) {
            return;
        }
        field422[field457] = arg0;
        field425[field457] = arg1;
        field283[field457] = arg2;
        field421[field457] = arg3;
        field511[field457] = arg4;
        field419[field457] = arg5;
        field457++;
    }

    @ObfuscatedName("t.cy(B)V")
    public static void method165() {
        for (int var0 = 0; var0 < field457; var0++) {
            int var1 = field283[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field457 - 1) {
                    for (int var3 = var0; var3 < field457 - 1; var3++) {
                        field422[var3] = field422[var3 + 1];
                        field425[var3] = field425[var3 + 1];
                        field283[var3] = field283[var3 + 1];
                        field421[var3] = field421[var3 + 1];
                        field511[var3] = field511[var3 + 1];
                        field419[var3] = field419[var3 + 1];
                    }
                }
                field457--;
            }
        }
    }

    @ObfuscatedName("c.cn(IIIII)V")
    public static final void method555(int arg0, int arg1, int arg2, int arg3) {
        if (field428 == 0 && !field430) {
            method638(class148.field2262, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class100.field1777; var6++) {
            int var7 = class100.field1786[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field231.method1735(Statics.field665, var8, var9, var7) >= 0) {
                    class38 var12 = class38.method2180(var11);
                    if (var12.field929 != null) {
                        var12 = var12.method696();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field428 == 1) {
                        method638(class148.field2362, field429 + " " + class2.field26 + " " + class2.method2073(65535) + var12.field898, 1, var7, var8, var9);
                    } else if (!field430) {
                        String[] var13 = var12.field935;
                        if (field481) {
                            var13 = method1947(var13);
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
                                    method638(var13[var14], class2.method2073(65535) + var12.field898, var15, var7, var8, var9);
                                }
                            }
                        }
                        method638(class148.field2363, class2.method2073(65535) + var12.field898, 1002, var12.field895 << 14, var8, var9);
                    } else if ((Statics.field194 & 0x4) == 4) {
                        method638(field420, field377 + " " + class2.field26 + " " + class2.method2073(65535) + var12.field898, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class32 var16 = field312[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field743.field852 == 1 && (var16.field789 & 0x7F) == 64 && (var16.field773 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field313; var17++) {
                            class32 var18 = field312[field314[var17]];
                            if (var18 != null && var16 != var18 && var18.field743.field852 == 1 && var16.field789 == var18.field789 && var16.field773 == var18.field773) {
                                method107(var18.field743, field314[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field501; var19++) {
                            class3 var20 = field393[field517[var19]];
                            if (var20 != null && var16.field789 == var20.field789 && var16.field773 == var20.field773) {
                                method2398(var20, field517[var19], var8, var9);
                            }
                        }
                    }
                    method107(var16.field743, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field393[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field789 & 0x7F) == 64 && (var21.field773 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field313; var22++) {
                            class32 var23 = field312[field314[var22]];
                            if (var23 != null && var23.field743.field852 == 1 && var21.field789 == var23.field789 && var21.field773 == var23.field773) {
                                method107(var23.field743, field314[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field501; var24++) {
                            class3 var25 = field393[field517[var24]];
                            if (var25 != null && var21 != var25 && var21.field789 == var25.field789 && var21.field773 == var25.field773) {
                                method2398(var25, field517[var24], var8, var9);
                            }
                        }
                    }
                    if (field277 == var11) {
                        var4 = var7;
                    } else {
                        method2398(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class190 var26 = field408[Statics.field665][var8][var9];
                    if (var26 != null) {
                        for (class27 var27 = (class27) var26.method3447(); var27 != null; var27 = (class27) var26.method3449()) {
                            class47 var28 = class47.method127(var27.field658);
                            if (field428 == 1) {
                                method638(class148.field2362, field429 + " " + class2.field26 + " " + class2.method2073(16748608) + var28.field1078, 16, var27.field658, var8, var9);
                            } else if (!field430) {
                                String[] var29 = var28.field1108;
                                if (field481) {
                                    var29 = method1947(var29);
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
                                        method638(var29[var30], class2.method2073(16748608) + var28.field1078, var31, var27.field658, var8, var9);
                                    } else if (var30 == 2) {
                                        method638(class148.field2309, class2.method2073(16748608) + var28.field1078, 20, var27.field658, var8, var9);
                                    }
                                }
                                method638(class148.field2363, class2.method2073(16748608) + var28.field1078, 1004, var27.field658, var8, var9);
                            } else if ((Statics.field194 & 0x1) == 1) {
                                method638(field420, field377 + " " + class2.field26 + " " + class2.method2073(16748608) + var28.field1078, 17, var27.field658, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field393[field277];
            method2398(var34, field277, var32, var33);
        }
    }

    @ObfuscatedName("l.cs(Lap;IIII)V")
    public static final void method107(class37 arg0, int arg1, int arg2, int arg3) {
        if (field457 >= 400) {
            return;
        }
        if (arg0.field876 != null) {
            arg0 = arg0.method663();
        }
        if (arg0 == null || !arg0.field879 || arg0.field881 && field332 != arg1) {
            return;
        }
        String var4 = arg0.field851;
        if (arg0.field884 != 0) {
            int var6 = arg0.field884;
            int var7 = Statics.field37.field32;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2073(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2073(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2073(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2073(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2073(65280);
            } else if (var8 > 6) {
                var9 = class2.method2073(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2073(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2073(12648192);
            } else {
                var9 = class2.method2073(16776960);
            }
            var4 = var4 + var9 + " " + class2.field21 + class148.field2410 + arg0.field884 + class2.field19;
        }
        if (field428 == 1) {
            method638(class148.field2362, field429 + " " + class2.field26 + " " + class2.method2073(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field430) {
            String[] var10 = arg0.field866;
            if (field481) {
                var10 = method1947(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class148.field2364)) {
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
                        method638(var10[var11], class2.method2073(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class148.field2364)) {
                        short var14 = 0;
                        if (field297 == class19.field555 || field297 == class19.field560 && arg0.field884 > Statics.field37.field32) {
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
                        method638(var10[var13], class2.method2073(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method638(class148.field2363, class2.method2073(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field194 & 0x2) == 2) {
            method638(field420, field377 + " " + class2.field26 + " " + class2.method2073(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dl.cg(La;IIII)V")
    public static final void method2398(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field37 == arg0 || field457 >= 400) {
            return;
        }
        String var9;
        if (arg0.field31 == 0) {
            String var4 = arg0.field49;
            int var5 = arg0.field32;
            int var6 = Statics.field37.field32;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2073(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2073(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2073(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2073(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2073(65280);
            } else if (var7 > 6) {
                var8 = class2.method2073(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2073(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2073(12648192);
            } else {
                var8 = class2.method2073(16776960);
            }
            var9 = var4 + var8 + " " + class2.field21 + class148.field2410 + arg0.field32 + class2.field19;
        } else {
            var9 = arg0.field49 + " " + class2.field21 + class148.field2369 + arg0.field31 + class2.field19;
        }
        if (field428 == 1) {
            method638(class148.field2362, field429 + " " + class2.field26 + " " + class2.method2073(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field430) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field404[var10] != null) {
                    short var11 = 0;
                    if (field404[var10].equalsIgnoreCase(class148.field2364)) {
                        if (field297 == class19.field555 || field297 == class19.field560 && arg0.field32 > Statics.field37.field32) {
                            var11 = 2000;
                        }
                        if (Statics.field37.field46 != 0 && arg0.field46 != 0) {
                            if (Statics.field37.field46 == arg0.field46) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field418[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field403[var10] + var11;
                    method638(field404[var10], class2.method2073(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field194 & 0x8) == 8) {
            method638(field420, field377 + " " + class2.field26 + " " + class2.method2073(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field457; var14++) {
            if (field283[var14] == 23) {
                field425[var14] = class2.method2073(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("f.cv(IIIIIIIII)V")
    public static final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method145(arg0)) {
            Statics.field1522 = null;
            method3108(Statics.field2695[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1522 != null) {
                method3108(Statics.field1522, -1412584499, arg1, arg2, arg3, arg4, Statics.field225, Statics.field643, arg7);
                Statics.field1522 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field482[var8] = true;
            }
        } else {
            field482[arg7] = true;
        }
    }

    @ObfuscatedName("fv.ci([Lfq;IIIIIIIII)V")
    public static final void method3108(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1658(arg2, arg3, arg4, arg5);
        class86.method1877();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2678 == arg1 || arg1 == -1412584499 && field448 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field286[field304] = var10.field2672 + arg6;
                    field486[field304] = var10.field2665 + arg7;
                    field487[field304] = var10.field2674;
                    field488[field304] = var10.field2675;
                    var11 = ++field304 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2780 = var11;
                var10.field2789 = field280;
                if (!var10.field2658 || !method2732(var10)) {
                    if (var10.field2663 > 0) {
                        int var12 = var10.field2663;
                        if (var12 == 324) {
                            if (field551 == -1) {
                                field551 = var10.field2691;
                                field498 = var10.field2693;
                            }
                            if (field550.field2822) {
                                var10.field2691 = field551;
                            } else {
                                var10.field2691 = field498;
                            }
                        } else if (var12 == 325) {
                            if (field551 == -1) {
                                field551 = var10.field2691;
                                field498 = var10.field2693;
                            }
                            if (field550.field2822) {
                                var10.field2691 = field498;
                            } else {
                                var10.field2691 = field551;
                            }
                        } else if (var12 == 327) {
                            var10.field2708 = 150;
                            var10.field2709 = (int) (Math.sin((double) field280 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2700 = 5;
                            var10.field2701 = 0;
                        } else if (var12 == 328) {
                            var10.field2708 = 150;
                            var10.field2709 = (int) (Math.sin((double) field280 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2700 = 5;
                            var10.field2701 = 1;
                        }
                    }
                    int var13 = var10.field2672 + arg6;
                    int var14 = var10.field2665 + arg7;
                    int var15 = var10.field2689;
                    if (field448 == var10) {
                        if (arg1 != -1412584499 && !var10.field2703) {
                            Statics.field1522 = arg0;
                            Statics.field225 = arg6;
                            Statics.field643 = arg7;
                            continue;
                        }
                        if (field534 && field453) {
                            int var16 = class132.field2049;
                            int var17 = class132.field2050;
                            int var18 = var16 - field450;
                            int var19 = var17 - field495;
                            if (var18 < field344) {
                                var18 = field344;
                            }
                            if (var10.field2674 + var18 > field344 + field446.field2674) {
                                var18 = field344 + field446.field2674 - var10.field2674;
                            }
                            if (var19 < field455) {
                                var19 = field455;
                            }
                            if (var10.field2675 + var19 > field455 + field446.field2675) {
                                var19 = field455 + field446.field2675 - var10.field2675;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2703) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2661 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2661 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2674 + var13;
                        int var27 = var10.field2675 + var14;
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
                        int var30 = var10.field2674 + var13;
                        int var31 = var10.field2675 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2658 || var20 < var22 && var21 < var23) {
                        if (var10.field2663 != 0) {
                            if (var10.field2663 == 1336) {
                                if (field401) {
                                    var14 += 15;
                                    Statics.field251.method3641("Fps:" + field2091, var10.field2674 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field274) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field274) {
                                        var34 = 16711680;
                                    }
                                    Statics.field251.method3641("Mem:" + var33 + "k", var10.field2674 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2663 == 1337) {
                                field470 = var13;
                                field484 = var14;
                                int var37 = var10.field2674;
                                int var38 = var10.field2675;
                                field334++;
                                method1502(class31.field741);
                                boolean var39 = false;
                                if (field277 >= 0) {
                                    for (int var40 = 0; var40 < field501; var40++) {
                                        if (field277 == field517[var40]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method1502(class31.field733);
                                }
                                method3163(true);
                                method1502(var39 ? class31.field735 : class31.field734);
                                method3163(false);
                                for (class7 var41 = (class7) field410.method3451(); var41 != null; var41 = (class7) field410.method3448()) {
                                    if (Statics.field665 != var41.field114 || field280 > var41.field97) {
                                        var41.method3540();
                                    } else if (field280 >= var41.field96) {
                                        if (var41.field100 > 0) {
                                            class32 var42 = field312[var41.field100 - 1];
                                            if (var42 != null && var42.field789 >= 0 && var42.field789 < 13312 && var42.field773 >= 0 && var42.field773 < 13312) {
                                                var41.method78(var42.field789, var42.field773, method686(var42.field789, var42.field773, var41.field114) - var41.field95, field280);
                                            }
                                        }
                                        if (var41.field100 < 0) {
                                            int var43 = -var41.field100 - 1;
                                            class3 var44;
                                            if (field340 == var43) {
                                                var44 = Statics.field37;
                                            } else {
                                                var44 = field393[var43];
                                            }
                                            if (var44 != null && var44.field789 >= 0 && var44.field789 < 13312 && var44.field773 >= 0 && var44.field773 < 13312) {
                                                var41.method78(var44.field789, var44.field773, method686(var44.field789, var44.field773, var41.field114) - var41.field95, field280);
                                            }
                                        }
                                        var41.method85(field349);
                                        Statics.field231.method1716(Statics.field665, (int) var41.field102, (int) var41.field103, (int) var41.field104, 60, var41, var41.field110, -1, false);
                                    }
                                }
                                for (class28 var45 = (class28) field411.method3451(); var45 != null; var45 = (class28) field411.method3448()) {
                                    if (Statics.field665 != var45.field669 || var45.field676) {
                                        var45.method3540();
                                    } else if (field280 >= var45.field667) {
                                        var45.method580(field349);
                                        if (var45.field676) {
                                            var45.method3540();
                                        } else {
                                            Statics.field231.method1716(var45.field669, var45.field673, var45.field671, var45.field672, 60, var45, 0, -1, false);
                                        }
                                    }
                                }
                                method104(var13, var14, var37, var38, true);
                                int var46 = field354;
                                int var47 = field509;
                                int var48 = field541;
                                int var49 = field443;
                                class75.method1658(var46, var47, var46 + var48, var47 + var49);
                                class86.method1877();
                                if (!field493) {
                                    int var50 = field357;
                                    if (field365 / 256 > var50) {
                                        var50 = field365 / 256;
                                    }
                                    if (field526[4] && field528[4] + 128 > var50) {
                                        var50 = field528[4] + 128;
                                    }
                                    int var51 = field358 + field341 & 0x7FF;
                                    int var52 = Statics.field2121;
                                    int var53 = method686(Statics.field37.field789, Statics.field37.field773, Statics.field665) - 50;
                                    int var54 = Statics.field2913;
                                    int var55 = var50 * 3 + 600;
                                    int var56 = 2048 - var50 & 0x7FF;
                                    int var57 = 2048 - var51 & 0x7FF;
                                    int var58 = 0;
                                    int var59 = 0;
                                    int var60 = var55;
                                    if (var56 != 0) {
                                        int var61 = class86.field1520[var56];
                                        int var62 = class86.field1521[var56];
                                        int var63 = var59 * var62 - var55 * var61 >> 16;
                                        var60 = var59 * var61 + var55 * var62 >> 16;
                                        var59 = var63;
                                    }
                                    if (var57 != 0) {
                                        int var64 = class86.field1520[var57];
                                        int var65 = class86.field1521[var57];
                                        int var66 = var58 * var65 + var60 * var64 >> 16;
                                        var60 = var60 * var65 - var58 * var64 >> 16;
                                        var58 = var66;
                                    }
                                    Statics.field875 = var52 - var58;
                                    Statics.field2059 = var53 - var59;
                                    Statics.field1057 = var54 - var60;
                                    Statics.field2590 = var50;
                                    Statics.field1613 = var51;
                                }
                                int var79;
                                if (field493) {
                                    var79 = Statics.method1957();
                                } else {
                                    int var67;
                                    if (Statics.field1306.field136) {
                                        var67 = Statics.field665;
                                    } else {
                                        int var68 = 3;
                                        if (Statics.field2590 < 310) {
                                            int var69 = Statics.field875 >> 7;
                                            int var70 = Statics.field1057 >> 7;
                                            int var71 = Statics.field37.field789 >> 7;
                                            int var72 = Statics.field37.field773 >> 7;
                                            if ((class6.field68[Statics.field665][var69][var70] & 0x4) != 0) {
                                                var68 = Statics.field665;
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
                                                    if ((class6.field68[Statics.field665][var69][var70] & 0x4) != 0) {
                                                        var68 = Statics.field665;
                                                    }
                                                    var76 += var75;
                                                    if (var76 >= 65536) {
                                                        var76 -= 65536;
                                                        if (var70 < var72) {
                                                            var70++;
                                                        } else if (var70 > var72) {
                                                            var70--;
                                                        }
                                                        if ((class6.field68[Statics.field665][var69][var70] & 0x4) != 0) {
                                                            var68 = Statics.field665;
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
                                                    if ((class6.field68[Statics.field665][var69][var70] & 0x4) != 0) {
                                                        var68 = Statics.field665;
                                                    }
                                                    var78 += var77;
                                                    if (var78 >= 65536) {
                                                        var78 -= 65536;
                                                        if (var69 < var71) {
                                                            var69++;
                                                        } else if (var69 > var71) {
                                                            var69--;
                                                        }
                                                        if ((class6.field68[Statics.field665][var69][var70] & 0x4) != 0) {
                                                            var68 = Statics.field665;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field68[Statics.field665][Statics.field37.field789 >> 7][Statics.field37.field773 >> 7] & 0x4) != 0) {
                                            var68 = Statics.field665;
                                        }
                                        var67 = var68;
                                    }
                                    var79 = var67;
                                }
                                int var80 = Statics.field875;
                                int var81 = Statics.field2059;
                                int var82 = Statics.field1057;
                                int var83 = Statics.field2590;
                                int var84 = Statics.field1613;
                                for (int var85 = 0; var85 < 5; var85++) {
                                    if (field526[var85]) {
                                        int var86 = (int) (Math.random() * (double) (field527[var85] * 2 + 1) - (double) field527[var85] + Math.sin((double) field529[var85] / 100.0D * (double) field530[var85]) * (double) field528[var85]);
                                        if (var85 == 0) {
                                            Statics.field875 += var86;
                                        }
                                        if (var85 == 1) {
                                            Statics.field2059 += var86;
                                        }
                                        if (var85 == 2) {
                                            Statics.field1057 += var86;
                                        }
                                        if (var85 == 3) {
                                            Statics.field1613 = Statics.field1613 + var86 & 0x7FF;
                                        }
                                        if (var85 == 4) {
                                            Statics.field2590 += var86;
                                            if (Statics.field2590 < 128) {
                                                Statics.field2590 = 128;
                                            }
                                            if (Statics.field2590 > 383) {
                                                Statics.field2590 = 383;
                                            }
                                        }
                                    }
                                }
                                int var87 = class132.field2049;
                                int var88 = class132.field2050;
                                if (class132.field2055 != 0) {
                                    var87 = class132.field2043;
                                    var88 = class132.field2057;
                                }
                                if (var87 >= var46 && var87 < var46 + var48 && var88 >= var47 && var88 < var47 + var49) {
                                    class100.field1782 = true;
                                    class100.field1777 = 0;
                                    class100.field1783 = var87 - var46;
                                    class100.field1784 = var88 - var47;
                                } else {
                                    class100.field1782 = false;
                                    class100.field1777 = 0;
                                }
                                method978();
                                class75.method1605(var46, var47, var48, var49, 0);
                                method978();
                                int var89 = class86.field1506;
                                class86.field1506 = field543;
                                Statics.field231.method1742(Statics.field875, Statics.field2059, Statics.field1057, Statics.field2590, Statics.field1613, var79);
                                class86.field1506 = var89;
                                method978();
                                Statics.field231.method1848();
                                field366 = 0;
                                boolean var90 = false;
                                int var91 = -1;
                                for (int var92 = -1; var92 < field501 + field313; var92++) {
                                    class35 var93;
                                    if (var92 == -1) {
                                        var93 = Statics.field37;
                                    } else if (var92 < field501) {
                                        var93 = field393[field517[var92]];
                                        if (field277 == field517[var92]) {
                                            var90 = true;
                                            var91 = var92;
                                            continue;
                                        }
                                    } else {
                                        var93 = field312[field314[var92 - field501]];
                                    }
                                    method731(var93, var92, var46, var47, var48, var49);
                                }
                                if (var90) {
                                    method731(field393[field277], var91, var46, var47, var48, var49);
                                }
                                for (int var94 = 0; var94 < field366; var94++) {
                                    int var95 = field368[var94];
                                    int var96 = field301[var94];
                                    int var97 = field371[var94];
                                    int var98 = field369[var94];
                                    boolean var99 = true;
                                    while (var99) {
                                        var99 = false;
                                        for (int var100 = 0; var100 < var94; var100++) {
                                            if (var96 + 2 > field301[var100] - field369[var100] && var96 - var98 < field301[var100] + 2 && var95 - var97 < field371[var100] + field368[var100] && var95 + var97 > field368[var100] - field371[var100] && field301[var100] - field369[var100] < var96) {
                                                var96 = field301[var100] - field369[var100];
                                                var99 = true;
                                            }
                                        }
                                    }
                                    field378 = field368[var94];
                                    field379 = field301[var94] = var96;
                                    String var101 = field375[var94];
                                    if (field437 == 0) {
                                        int var102 = 16776960;
                                        if (field372[var94] < 6) {
                                            var102 = field494[field372[var94]];
                                        }
                                        if (field372[var94] == 6) {
                                            var102 = field334 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field372[var94] == 7) {
                                            var102 = field334 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field372[var94] == 8) {
                                            var102 = field334 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field372[var94] == 9) {
                                            int var103 = 150 - field342[var94];
                                            if (var103 < 50) {
                                                var102 = var103 * 1280 + 16711680;
                                            } else if (var103 < 100) {
                                                var102 = 16776960 - (var103 - 50) * 327680;
                                            } else if (var103 < 150) {
                                                var102 = (var103 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field372[var94] == 10) {
                                            int var104 = 150 - field342[var94];
                                            if (var104 < 50) {
                                                var102 = var104 * 5 + 16711680;
                                            } else if (var104 < 100) {
                                                var102 = 16711935 - (var104 - 50) * 327680;
                                            } else if (var104 < 150) {
                                                var102 = (var104 - 100) * 327680 + 255 - (var104 - 100) * 5;
                                            }
                                        }
                                        if (field372[var94] == 11) {
                                            int var105 = 150 - field342[var94];
                                            if (var105 < 50) {
                                                var102 = 16777215 - var105 * 327685;
                                            } else if (var105 < 100) {
                                                var102 = (var105 - 50) * 327685 + 65280;
                                            } else if (var105 < 150) {
                                                var102 = 16777215 - (var105 - 100) * 327680;
                                            }
                                        }
                                        if (field373[var94] == 0) {
                                            Statics.field2567.method3705(var101, field378 + var46, field379 + var47, var102, 0);
                                        }
                                        if (field373[var94] == 1) {
                                            Statics.field2567.method3644(var101, field378 + var46, field379 + var47, var102, 0, field334);
                                        }
                                        if (field373[var94] == 2) {
                                            Statics.field2567.method3645(var101, field378 + var46, field379 + var47, var102, 0, field334);
                                        }
                                        if (field373[var94] == 3) {
                                            Statics.field2567.method3646(var101, field378 + var46, field379 + var47, var102, 0, field334, 150 - field342[var94]);
                                        }
                                        if (field373[var94] == 4) {
                                            int var106 = (150 - field342[var94]) * (Statics.field2567.method3635(var101) + 100) / 150;
                                            class75.method1600(field378 + var46 - 50, var47, field378 + var46 + 50, var47 + var49);
                                            Statics.field2567.method3640(var101, field378 + var46 + 50 - var106, field379 + var47, var102, 0);
                                            class75.method1658(var46, var47, var46 + var48, var47 + var49);
                                        }
                                        if (field373[var94] == 5) {
                                            int var107 = 150 - field342[var94];
                                            int var108 = 0;
                                            if (var107 < 25) {
                                                var108 = var107 - 25;
                                            } else if (var107 > 125) {
                                                var108 = var107 - 125;
                                            }
                                            class75.method1600(var46, field379 + var47 - Statics.field2567.field3100 - 1, var46 + var48, field379 + var47 + 5);
                                            Statics.field2567.method3705(var101, field378 + var46, field379 + var47 + var108, var102, 0);
                                            class75.method1658(var46, var47, var46 + var48, var47 + var49);
                                        }
                                    } else {
                                        Statics.field2567.method3705(var101, field378 + var46, field379 + var47, 16776960, 0);
                                    }
                                }
                                if (field523 == 2) {
                                    method153((field309 - Statics.field142 << 7) + field294, (field549 - Statics.field57 << 7) + field295, field293 * 2);
                                    if (field378 > -1 && field280 % 20 < 10) {
                                        Statics.field1560[0].method1528(field378 + var46 - 12, field379 + var47 - 28);
                                    }
                                }
                                ((class90) Statics.field1516).method1953(field349);
                                if (field383 == 1) {
                                    Statics.field315[field382 / 100].method1528(field380 - 8, field381 - 8);
                                }
                                if (field383 == 2) {
                                    Statics.field315[field382 / 100 + 4].method1528(field380 - 8, field381 - 8);
                                }
                                field392 = 0;
                                int var109 = (Statics.field37.field789 >> 7) + Statics.field142;
                                int var110 = (Statics.field37.field773 >> 7) + Statics.field57;
                                if (var109 >= 3053 && var109 <= 3156 && var110 >= 3056 && var110 <= 3136) {
                                    field392 = 1;
                                }
                                if (var109 >= 3072 && var109 <= 3118 && var110 >= 9492 && var110 <= 9535) {
                                    field392 = 1;
                                }
                                if (field392 == 1 && var109 >= 3139 && var109 <= 3199 && var110 >= 3008 && var110 <= 3062) {
                                    field392 = 0;
                                }
                                Statics.field875 = var80;
                                Statics.field2059 = var81;
                                Statics.field1057 = var82;
                                Statics.field2590 = var83;
                                Statics.field1613 = var84;
                                if (field363) {
                                    byte var111 = 0;
                                    int var112 = class162.field2626 + class162.field2622 + var111;
                                    if (var112 == 0) {
                                        field363 = false;
                                    }
                                }
                                if (field363) {
                                    class75.method1605(var46, var47, var48, var49, 0);
                                    method2173(class148.field2238, false);
                                }
                                field482[var10.field2780] = true;
                                class75.method1658(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2663 == 1338) {
                                method978();
                                class166 var114 = var10.method3053();
                                if (var114 != null) {
                                    class75.method1658(var13, var14, var114.field2802 + var13, var114.field2801 + var14);
                                    if (field311 == 2 || field311 == 5) {
                                        class75.method1613(var13, var14, 0, var114.field2803, var114.field2804);
                                    } else {
                                        int var115 = field358 + field290 & 0x7FF;
                                        int var116 = Statics.field37.field789 / 32 + 48;
                                        int var117 = 464 - Statics.field37.field773 / 32;
                                        Statics.field729.method1539(var13, var14, var114.field2802, var114.field2801, var116, var117, var115, field346 + 256, var114.field2803, var114.field2804);
                                        for (int var118 = 0; var118 < field507; var118++) {
                                            int var119 = field508[var118] * 4 + 2 - Statics.field37.field789 / 32;
                                            int var120 = field545[var118] * 4 + 2 - Statics.field37.field773 / 32;
                                            method1964(var13, var14, var119, var120, field538[var118], var114);
                                        }
                                        int var121 = 0;
                                        while (true) {
                                            if (var121 >= 104) {
                                                for (int var126 = 0; var126 < field313; var126++) {
                                                    class32 var127 = field312[field314[var126]];
                                                    if (var127 != null && var127.method20()) {
                                                        class37 var128 = var127.field743;
                                                        if (var128 != null && var128.field876 != null) {
                                                            var128 = var128.method663();
                                                        }
                                                        if (var128 != null && var128.field867 && var128.field879) {
                                                            int var129 = var127.field789 / 32 - Statics.field37.field789 / 32;
                                                            int var130 = var127.field773 / 32 - Statics.field37.field773 / 32;
                                                            method1964(var13, var14, var129, var130, Statics.field242[1], var114);
                                                        }
                                                    }
                                                }
                                                for (int var131 = 0; var131 < field501; var131++) {
                                                    class3 var132 = field393[field517[var131]];
                                                    if (var132 != null && var132.method20() && !var132.field36) {
                                                        int var133 = var132.field789 / 32 - Statics.field37.field789 / 32;
                                                        int var134 = var132.field773 / 32 - Statics.field37.field773 / 32;
                                                        boolean var135 = false;
                                                        if (method2488(var132.field49, true)) {
                                                            var135 = true;
                                                        }
                                                        boolean var136 = false;
                                                        for (int var137 = 0; var137 < Statics.field121; var137++) {
                                                            if (var132.field49.equals(Statics.field1862[var137].field603)) {
                                                                var136 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var138 = false;
                                                        if (Statics.field37.field46 != 0 && var132.field46 != 0 && Statics.field37.field46 == var132.field46) {
                                                            var138 = true;
                                                        }
                                                        if (var135) {
                                                            method1964(var13, var14, var133, var134, Statics.field242[3], var114);
                                                        } else if (var138) {
                                                            method1964(var13, var14, var133, var134, Statics.field242[4], var114);
                                                        } else if (var136) {
                                                            method1964(var13, var14, var133, var134, Statics.field242[5], var114);
                                                        } else {
                                                            method1964(var13, var14, var133, var134, Statics.field242[2], var114);
                                                        }
                                                    }
                                                }
                                                if (field523 != 0 && field280 % 20 < 10) {
                                                    if (field523 == 1 && field289 >= 0 && field289 < field312.length) {
                                                        class32 var139 = field312[field289];
                                                        if (var139 != null) {
                                                            int var140 = var139.field789 / 32 - Statics.field37.field789 / 32;
                                                            int var141 = var139.field773 / 32 - Statics.field37.field773 / 32;
                                                            method1970(var13, var14, var140, var141, Statics.field1163[1], var114);
                                                        }
                                                    }
                                                    if (field523 == 2) {
                                                        int var142 = field309 * 4 - Statics.field142 * 4 + 2 - Statics.field37.field789 / 32;
                                                        int var143 = field549 * 4 - Statics.field57 * 4 + 2 - Statics.field37.field773 / 32;
                                                        method1970(var13, var14, var142, var143, Statics.field1163[1], var114);
                                                    }
                                                    if (field523 == 10 && field436 >= 0 && field436 < field393.length) {
                                                        class3 var144 = field393[field436];
                                                        if (var144 != null) {
                                                            int var145 = var144.field789 / 32 - Statics.field37.field789 / 32;
                                                            int var146 = var144.field773 / 32 - Statics.field37.field773 / 32;
                                                            method1970(var13, var14, var145, var146, Statics.field1163[1], var114);
                                                        }
                                                    }
                                                }
                                                if (field407 != 0) {
                                                    int var147 = field407 * 4 + 2 - Statics.field37.field789 / 32;
                                                    int var148 = field512 * 4 + 2 - Statics.field37.field773 / 32;
                                                    method1964(var13, var14, var147, var148, Statics.field1163[0], var114);
                                                }
                                                if (!Statics.field37.field36) {
                                                    class75.method1605(var114.field2802 / 2 + var13 - 1, var114.field2801 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var122 = 0; var122 < 104; var122++) {
                                                class190 var123 = field408[Statics.field665][var121][var122];
                                                if (var123 != null) {
                                                    int var124 = var121 * 4 + 2 - Statics.field37.field789 / 32;
                                                    int var125 = var122 * 4 + 2 - Statics.field37.field773 / 32;
                                                    method1964(var13, var14, var124, var125, Statics.field242[0], var114);
                                                }
                                            }
                                            var121++;
                                        }
                                    }
                                    field298[var11] = true;
                                }
                                class75.method1658(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2663 == 1339) {
                                method896(var10, var13, var14, var11);
                                class75.method1658(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2661 == 0) {
                            if (!var10.field2658 && method2732(var10) && Statics.field1167 != var10) {
                                continue;
                            }
                            if (!var10.field2658) {
                                if (var10.field2758 > var10.field2683 - var10.field2675) {
                                    var10.field2758 = var10.field2683 - var10.field2675;
                                }
                                if (var10.field2758 < 0) {
                                    var10.field2758 = 0;
                                }
                            }
                            method3108(arg0, var10.field2667, var20, var21, var22, var23, var13 - var10.field2790, var14 - var10.field2758, var11);
                            if (var10.field2781 != null) {
                                method3108(var10.field2781, var10.field2667, var20, var21, var22, var23, var13 - var10.field2790, var14 - var10.field2758, var11);
                            }
                            class4 var149 = (class4) field483.method3418((long) var10.field2667);
                            if (var149 != null) {
                                method111(var149.field51, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class75.method1658(arg2, arg3, arg4, arg5);
                            class86.method1877();
                        }
                        if (field491 || field539[var11] || field489 > 1) {
                            if (var10.field2661 == 0 && !var10.field2658 && var10.field2683 > var10.field2675) {
                                int var150 = var10.field2674 + var13;
                                int var151 = var10.field2758;
                                int var152 = var10.field2675;
                                int var153 = var10.field2683;
                                Statics.field1929[0].method1669(var150, var14);
                                Statics.field1929[1].method1669(var150, var14 + var152 - 16);
                                class75.method1605(var150, var14 + 16, 16, var152 - 32, field288);
                                int var154 = (var152 - 32) * var152 / var153;
                                if (var154 < 8) {
                                    var154 = 8;
                                }
                                int var155 = (var152 - 32 - var154) * var151 / (var153 - var152);
                                class75.method1605(var150, var14 + 16 + var155, 16, var154, field352);
                                class75.method1626(var150, var14 + 16 + var155, var154, field505);
                                class75.method1626(var150 + 1, var14 + 16 + var155, var154, field505);
                                class75.method1643(var150, var14 + 16 + var155, 16, field505);
                                class75.method1643(var150, var14 + 17 + var155, 16, field505);
                                class75.method1626(var150 + 15, var14 + 16 + var155, var154, field353);
                                class75.method1626(var150 + 14, var14 + 17 + var155, var154 - 1, field353);
                                class75.method1643(var150, var14 + 15 + var155 + var154, 16, field353);
                                class75.method1643(var150 + 1, var14 + 14 + var155 + var154, 15, field353);
                            }
                            if (var10.field2661 != 1) {
                                if (var10.field2661 == 2) {
                                    int var156 = 0;
                                    for (int var157 = 0; var157 < var10.field2673; var157++) {
                                        for (int var158 = 0; var158 < var10.field2670; var158++) {
                                            int var159 = (var10.field2723 + 32) * var158 + var13;
                                            int var160 = (var10.field2654 + 32) * var157 + var14;
                                            if (var156 < 20) {
                                                var159 += var10.field2725[var156];
                                                var160 += var10.field2787[var156];
                                            }
                                            if (var10.field2750[var156] > 0) {
                                                boolean var161 = false;
                                                boolean var162 = false;
                                                int var163 = var10.field2750[var156] - 1;
                                                if (var159 + 32 > arg2 && var159 < arg4 && var160 + 32 > arg3 && var160 < arg5 || Statics.field570 == var10 && field459 == var156) {
                                                    class74 var164;
                                                    if (field428 == 1 && Statics.field25 == var156 && Statics.field260 == var10.field2667) {
                                                        var164 = class47.method90(var163, var10.field2744[var156], 2, 0, 2, false);
                                                    } else {
                                                        var164 = class47.method90(var163, var10.field2744[var156], 1, 3153952, 2, false);
                                                    }
                                                    if (var164 == null) {
                                                        method106(var10);
                                                    } else if (Statics.field570 == var10 && field459 == var156) {
                                                        int var165 = class132.field2049 - field387;
                                                        int var166 = class132.field2050 - field388;
                                                        if (var165 < 5 && var165 > -5) {
                                                            var165 = 0;
                                                        }
                                                        if (var166 < 5 && var166 > -5) {
                                                            var166 = 0;
                                                        }
                                                        if (field391 < 5) {
                                                            var165 = 0;
                                                            var166 = 0;
                                                        }
                                                        var164.method1534(var159 + var165, var160 + var166, 128);
                                                        if (arg1 != -1) {
                                                            class164 var167 = arg0[arg1 & 0xFFFF];
                                                            if (var160 + var166 < class75.field1354 && var167.field2758 > 0) {
                                                                int var168 = field349 * (class75.field1354 - var160 - var166) / 3;
                                                                if (var168 > field349 * 10) {
                                                                    var168 = field349 * 10;
                                                                }
                                                                if (var168 > var167.field2758) {
                                                                    var168 = var167.field2758;
                                                                }
                                                                var167.field2758 -= var168;
                                                                field388 += var168;
                                                                method106(var167);
                                                            }
                                                            if (var160 + var166 + 32 > class75.field1357 && var167.field2758 < var167.field2683 - var167.field2675) {
                                                                int var169 = field349 * (var160 + var166 + 32 - class75.field1357) / 3;
                                                                if (var169 > field349 * 10) {
                                                                    var169 = field349 * 10;
                                                                }
                                                                if (var169 > var167.field2683 - var167.field2675 - var167.field2758) {
                                                                    var169 = var167.field2683 - var167.field2675 - var167.field2758;
                                                                }
                                                                var167.field2758 += var169;
                                                                field388 -= var169;
                                                                method106(var167);
                                                            }
                                                        }
                                                    } else if (Statics.field1940 == var10 && field385 == var156) {
                                                        var164.method1534(var159, var160, 128);
                                                    } else {
                                                        var164.method1528(var159, var160);
                                                    }
                                                }
                                            } else if (var10.field2727 != null && var156 < 20) {
                                                class74 var170 = var10.method3073(var156);
                                                if (var170 != null) {
                                                    var170.method1528(var159, var160);
                                                } else if (class164.field2657) {
                                                    method106(var10);
                                                }
                                            }
                                            var156++;
                                        }
                                    }
                                } else if (var10.field2661 == 3) {
                                    int var171;
                                    if (Statics.method156(var10)) {
                                        var171 = var10.field2685;
                                        if (Statics.field1167 == var10 && var10.field2687 != 0) {
                                            var171 = var10.field2687;
                                        }
                                    } else {
                                        var171 = var10.field2765;
                                        if (Statics.field1167 == var10 && var10.field2686 != 0) {
                                            var171 = var10.field2686;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2788) {
                                            class75.method1605(var13, var14, var10.field2674, var10.field2675, var171);
                                        } else {
                                            class75.method1607(var13, var14, var10.field2674, var10.field2675, var171);
                                        }
                                    } else if (var10.field2788) {
                                        class75.method1604(var13, var14, var10.field2674, var10.field2675, var171, 256 - (var15 & 0xFF));
                                    } else {
                                        class75.method1608(var13, var14, var10.field2674, var10.field2675, var171, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2661 == 4) {
                                    class215 var172 = var10.method3083();
                                    if (var172 != null) {
                                        String var173 = var10.field2717;
                                        int var174;
                                        if (Statics.method156(var10)) {
                                            var174 = var10.field2685;
                                            if (Statics.field1167 == var10 && var10.field2687 != 0) {
                                                var174 = var10.field2687;
                                            }
                                            if (var10.field2718.length() > 0) {
                                                var173 = var10.field2718;
                                            }
                                        } else {
                                            var174 = var10.field2765;
                                            if (Statics.field1167 == var10 && var10.field2686 != 0) {
                                                var174 = var10.field2686;
                                            }
                                        }
                                        if (var10.field2658 && var10.field2777 != -1) {
                                            class47 var175 = class47.method127(var10.field2777);
                                            var173 = var175.field1078;
                                            if (var173 == null) {
                                                var173 = "null";
                                            }
                                            if ((var175.field1079 == 1 || var10.field2778 != 1) && var10.field2778 != -1) {
                                                var173 = class2.method2073(16748608) + var173 + class2.field24 + " " + 'x' + method1703(var10.field2778);
                                            }
                                        }
                                        if (field439 == var10) {
                                            class148 var10000 = (class148) null;
                                            var173 = class148.field2370;
                                            var174 = var10.field2765;
                                        }
                                        if (!var10.field2658) {
                                            var173 = method2701(var173, var10);
                                        }
                                        var172.method3670(var173, var13, var14, var10.field2674, var10.field2675, var174, var10.field2722 ? 0 : -1, var10.field2720, var10.field2721, var10.field2775);
                                    } else if (class164.field2657) {
                                        method106(var10);
                                    }
                                } else if (var10.field2661 == 5) {
                                    if (var10.field2658) {
                                        class74 var177;
                                        if (var10.field2777 == -1) {
                                            var177 = var10.method3049(false);
                                        } else {
                                            var177 = class47.method90(var10.field2777, var10.field2778, var10.field2696, var10.field2764, var10.field2715, false);
                                        }
                                        if (var177 != null) {
                                            int var178 = var177.field1349;
                                            int var179 = var177.field1347;
                                            if (var10.field2735) {
                                                class75.method1600(var13, var14, var10.field2674 + var13, var10.field2675 + var14);
                                                int var180 = (var10.field2674 + (var178 - 1)) / var178;
                                                int var181 = (var10.field2675 + (var179 - 1)) / var179;
                                                for (int var182 = 0; var182 < var180; var182++) {
                                                    for (int var183 = 0; var183 < var181; var183++) {
                                                        if (var10.field2694 != 0) {
                                                            var177.method1518(var178 / 2 + var178 * var182 + var13, var179 / 2 + var179 * var183 + var14, var10.field2694, 4096);
                                                        } else if (var15 == 0) {
                                                            var177.method1528(var178 * var182 + var13, var179 * var183 + var14);
                                                        } else {
                                                            var177.method1534(var178 * var182 + var13, var179 * var183 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1658(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var184 = var10.field2674 * 4096 / var178;
                                                if (var10.field2694 != 0) {
                                                    var177.method1518(var10.field2674 / 2 + var13, var10.field2675 / 2 + var14, var10.field2694, var184);
                                                } else if (var15 != 0) {
                                                    var177.method1584(var13, var14, var10.field2674, var10.field2675, 256 - (var15 & 0xFF));
                                                } else if (var10.field2674 == var178 && var10.field2675 == var179) {
                                                    var177.method1528(var13, var14);
                                                } else {
                                                    var177.method1517(var13, var14, var10.field2674, var10.field2675);
                                                }
                                            }
                                        } else if (class164.field2657) {
                                            method106(var10);
                                        }
                                    } else {
                                        class74 var176 = var10.method3049(Statics.method156(var10));
                                        if (var176 != null) {
                                            var176.method1528(var13, var14);
                                        } else if (class164.field2657) {
                                            method106(var10);
                                        }
                                    }
                                } else if (var10.field2661 == 6) {
                                    boolean var185 = Statics.method156(var10);
                                    int var186;
                                    if (var185) {
                                        var186 = var10.field2705;
                                    } else {
                                        var186 = var10.field2679;
                                    }
                                    class100 var187 = null;
                                    int var188 = 0;
                                    if (var10.field2777 != -1) {
                                        class47 var189 = class47.method127(var10.field2777);
                                        if (var189 != null) {
                                            class47 var190 = var189.method916(var10.field2778);
                                            var187 = var190.method925(1);
                                            if (var187 == null) {
                                                method106(var10);
                                            } else {
                                                var187.method2080();
                                                var188 = var187.field1392 / 2;
                                            }
                                        }
                                    } else if (var10.field2700 == 5) {
                                        if (var10.field2701 == 0) {
                                            var187 = field550.method3138((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var187 = Statics.field37.method13();
                                        }
                                    } else if (var186 == -1) {
                                        var187 = var10.method3052((class40) null, -1, var185, Statics.field37.field29);
                                        if (var187 == null && class164.field2657) {
                                            method106(var10);
                                        }
                                    } else {
                                        class40 var191 = Statics.method860(var186);
                                        var187 = var10.method3052(var191, var10.field2779, var185, Statics.field37.field29);
                                        if (var187 == null && class164.field2657) {
                                            method106(var10);
                                        }
                                    }
                                    class86.method1881(var10.field2674 / 2 + var13, var10.field2675 / 2 + var14);
                                    int var192 = var10.field2711 * class86.field1520[var10.field2708] >> 16;
                                    int var193 = var10.field2711 * class86.field1521[var10.field2708] >> 16;
                                    if (var187 != null) {
                                        if (var10.field2658) {
                                            var187.method2080();
                                            if (var10.field2714) {
                                                var187.method2107(0, var10.field2709, var10.field2710, var10.field2708, var10.field2706, var10.field2707 + var188 + var192, var10.field2707 + var193, var10.field2711);
                                            } else {
                                                var187.method2092(0, var10.field2709, var10.field2710, var10.field2708, var10.field2706, var10.field2707 + var188 + var192, var10.field2707 + var193);
                                            }
                                        } else {
                                            var187.method2092(0, var10.field2709, 0, var10.field2708, 0, var192, var193);
                                        }
                                    }
                                    class86.method1896();
                                } else {
                                    if (var10.field2661 == 7) {
                                        class215 var194 = var10.method3083();
                                        if (var194 == null) {
                                            if (class164.field2657) {
                                                method106(var10);
                                            }
                                            continue;
                                        }
                                        int var195 = 0;
                                        for (int var196 = 0; var196 < var10.field2673; var196++) {
                                            for (int var197 = 0; var197 < var10.field2670; var197++) {
                                                if (var10.field2750[var195] > 0) {
                                                    class47 var198 = class47.method127(var10.field2750[var195] - 1);
                                                    String var199;
                                                    if (var198.field1079 != 1 && var10.field2744[var195] == 1) {
                                                        var199 = class2.method2073(16748608) + var198.field1078 + class2.field24;
                                                    } else {
                                                        var199 = class2.method2073(16748608) + var198.field1078 + class2.field24 + " " + 'x' + method1703(var10.field2744[var195]);
                                                    }
                                                    int var200 = (var10.field2723 + 115) * var197 + var13;
                                                    int var201 = (var10.field2654 + 12) * var196 + var14;
                                                    if (var10.field2720 == 0) {
                                                        var194.method3640(var199, var200, var201, var10.field2765, var10.field2722 ? 0 : -1);
                                                    } else if (var10.field2720 == 1) {
                                                        var194.method3705(var199, var10.field2674 / 2 + var200, var201, var10.field2765, var10.field2722 ? 0 : -1);
                                                    } else {
                                                        var194.method3641(var199, var10.field2674 + var200 - 1, var201, var10.field2765, var10.field2722 ? 0 : -1);
                                                    }
                                                }
                                                var195++;
                                            }
                                        }
                                    }
                                    if (var10.field2661 == 8 && Statics.field1535 == var10 && field427 == field269) {
                                        int var202 = 0;
                                        int var203 = 0;
                                        class215 var204 = Statics.field251;
                                        String var205 = var10.field2717;
                                        String var206 = method2701(var205, var10);
                                        while (var206.length() > 0) {
                                            int var207 = var206.indexOf(class2.field23);
                                            String var208;
                                            if (var207 == -1) {
                                                var208 = var206;
                                                var206 = "";
                                            } else {
                                                var208 = var206.substring(0, var207);
                                                var206 = var206.substring(var207 + 4);
                                            }
                                            int var209 = var204.method3635(var208);
                                            if (var209 > var202) {
                                                var202 = var209;
                                            }
                                            var203 += var204.field3100 + 1;
                                        }
                                        var202 += 6;
                                        var203 += 7;
                                        int var210 = var10.field2674 + var13 - 5 - var202;
                                        int var211 = var10.field2675 + var14 + 5;
                                        if (var210 < var13 + 5) {
                                            var210 = var13 + 5;
                                        }
                                        if (var202 + var210 > arg4) {
                                            var210 = arg4 - var202;
                                        }
                                        if (var203 + var211 > arg5) {
                                            var211 = arg5 - var203;
                                        }
                                        class75.method1605(var210, var211, var202, var203, 16777120);
                                        class75.method1607(var210, var211, var202, var203, 0);
                                        String var212 = var10.field2717;
                                        int var213 = var204.field3100 + var211 + 2;
                                        String var214 = method2701(var212, var10);
                                        while (var214.length() > 0) {
                                            int var215 = var214.indexOf(class2.field23);
                                            String var216;
                                            if (var215 == -1) {
                                                var216 = var214;
                                                var214 = "";
                                            } else {
                                                var216 = var214.substring(0, var215);
                                                var214 = var214.substring(var215 + 4);
                                            }
                                            var204.method3640(var216, var210 + 3, var213, 0, -1);
                                            var213 += var204.field3100 + 1;
                                        }
                                    }
                                    if (var10.field2661 == 9) {
                                        if (var10.field2690 == 1) {
                                            int var217;
                                            int var218;
                                            int var219;
                                            int var220;
                                            if (var10.field2655) {
                                                var217 = var13;
                                                var218 = var10.field2675 + var14;
                                                var219 = var10.field2674 + var13;
                                                var220 = var14;
                                            } else {
                                                var217 = var13;
                                                var218 = var14;
                                                var219 = var10.field2674 + var13;
                                                var220 = var10.field2675 + var14;
                                            }
                                            class75.method1612(var217, var218, var219, var220, var10.field2765);
                                        } else {
                                            int var221 = var10.field2674 >= 0 ? var10.field2674 : -var10.field2674;
                                            int var222 = var10.field2675 >= 0 ? var10.field2675 : -var10.field2675;
                                            int var223 = var221;
                                            if (var221 < var222) {
                                                var223 = var222;
                                            }
                                            if (var223 != 0) {
                                                int var224 = (var10.field2674 << 16) / var223;
                                                int var225 = (var10.field2675 << 16) / var223;
                                                if (var225 <= var224) {
                                                    var224 = -var224;
                                                } else {
                                                    var225 = -var225;
                                                }
                                                int var226 = var10.field2690 * var225 >> 17;
                                                int var227 = var10.field2690 * var225 + 1 >> 17;
                                                int var228 = var10.field2690 * var224 >> 17;
                                                int var229 = var10.field2690 * var224 + 1 >> 17;
                                                int var230 = var13 + var226;
                                                int var231 = var13 - var227;
                                                int var232 = var10.field2674 + var13 - var227;
                                                int var233 = var10.field2674 + var13 + var226;
                                                int var234 = var14 + var228;
                                                int var235 = var14 - var229;
                                                int var236 = var10.field2675 + var14 - var229;
                                                int var237 = var10.field2675 + var14 + var228;
                                                class86.method1886(var230, var231, var232);
                                                class86.method1889(var234, var235, var236, var230, var231, var232, var10.field2765);
                                                class86.method1886(var230, var232, var233);
                                                class86.method1889(var234, var236, var237, var230, var232, var233, var10.field2765);
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

    @ObfuscatedName("ea.cj(Ljava/lang/String;Lfq;B)Ljava/lang/String;")
    public static String method2701(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method93(method2151(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field3139 != null) {
                    int var6 = Statics.field3139.field2117;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field3139.field2118 != null) {
                        var5 = (String) Statics.field3139.field2118;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cn.cq(IB)Ljava/lang/String;")
    public static final String method1703(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field18 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2073(65408) + var1.substring(0, var1.length() - 8) + class148.field2373 + " " + class2.field21 + var1 + class2.field19 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method2073(16777215) + var1.substring(0, var1.length() - 4) + class148.field2375 + " " + class2.field21 + var1 + class2.field19 + class2.field24;
        } else {
            return " " + class2.method2073(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("z.ch(ZB)V")
    public static final void method134(boolean arg0) {
        method2607(field435, Statics.field696, Statics.field1848, arg0);
    }

    @ObfuscatedName("dd.cr(Lfq;I)V")
    public static void method2168(class164 arg0) {
        class164 var1 = arg0.field2678 == -1 ? null : class164.method144(arg0.field2678);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field696;
            var3 = Statics.field1848;
        } else {
            var2 = var1.field2674;
            var3 = var1.field2675;
        }
        method587(arg0, var2, var3, false);
        method2167(arg0, var2, var3);
    }

    @ObfuscatedName("dg.cd([Lfq;Lfq;ZI)V")
    public static void method2490(class164[] arg0, class164 arg1, boolean arg2) {
        int var3 = arg1.field2682 == 0 ? arg1.field2674 : arg1.field2682;
        int var4 = arg1.field2683 == 0 ? arg1.field2675 : arg1.field2683;
        method2554(arg0, arg1.field2667, var3, var4, arg2);
        if (arg1.field2781 != null) {
            method2554(arg1.field2781, arg1.field2667, var3, var4, arg2);
        }
        class4 var5 = (class4) field483.method3418((long) arg1.field2667);
        if (var5 != null) {
            method2607(var5.field51, var3, var4, arg2);
        }
        if (arg1.field2663 == 1337) {
        }
    }

    @ObfuscatedName("dz.cw(IIIZI)V")
    public static final void method2607(int arg0, int arg1, int arg2, boolean arg3) {
        if (class164.method145(arg0)) {
            method2554(Statics.field2695[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dr.ct([Lfq;IIIZI)V")
    public static void method2554(class164[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class164 var6 = arg0[var5];
            if (var6 != null && var6.field2678 == arg1) {
                method587(var6, arg2, arg3, arg4);
                method2167(var6, arg2, arg3);
                if (var6.field2790 > var6.field2682 - var6.field2674) {
                    var6.field2790 = var6.field2682 - var6.field2674;
                }
                if (var6.field2790 < 0) {
                    var6.field2790 = 0;
                }
                if (var6.field2758 > var6.field2683 - var6.field2675) {
                    var6.field2758 = var6.field2683 - var6.field2675;
                }
                if (var6.field2758 < 0) {
                    var6.field2758 = 0;
                }
                if (var6.field2661 == 0) {
                    method2490(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("aq.cc(Lfq;IIZI)V")
    public static void method587(class164 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2674;
        int var5 = arg0.field2675;
        if (arg0.field2684 == 0) {
            arg0.field2674 = arg0.field2670;
        } else if (arg0.field2684 == 1) {
            arg0.field2674 = arg1 - arg0.field2670;
        } else if (arg0.field2684 == 2) {
            arg0.field2674 = arg0.field2670 * arg1 >> 14;
        }
        if (arg0.field2697 == 0) {
            arg0.field2675 = arg0.field2673;
        } else if (arg0.field2697 == 1) {
            arg0.field2675 = arg2 - arg0.field2673;
        } else if (arg0.field2697 == 2) {
            arg0.field2675 = arg0.field2673 * arg2 >> 14;
        }
        if (arg0.field2684 == 4) {
            arg0.field2674 = arg0.field2676 * arg0.field2675 / arg0.field2677;
        }
        if (arg0.field2697 == 4) {
            arg0.field2675 = arg0.field2677 * arg0.field2674 / arg0.field2676;
        }
        if (field445 && arg0.field2661 == 0) {
            if (arg0.field2675 < 5 && arg0.field2674 < 5) {
                arg0.field2675 = 5;
                arg0.field2674 = 5;
            } else {
                if (arg0.field2675 <= 0) {
                    arg0.field2675 = 5;
                }
                if (arg0.field2674 <= 0) {
                    arg0.field2674 = 5;
                }
            }
        }
        if (arg0.field2663 == 1337) {
            field447 = arg0;
        }
        if (arg3 && arg0.field2766 != null && (arg0.field2674 != var4 || arg0.field2675 != var5)) {
            class1 var6 = new class1();
            var6.field5 = arg0;
            var6.field1 = arg0.field2766;
            field476.method3441(var6);
        }
    }

    @ObfuscatedName("dd.ck(Lfq;III)V")
    public static void method2167(class164 arg0, int arg1, int arg2) {
        if (arg0.field2664 == 0) {
            arg0.field2672 = arg0.field2666;
        } else if (arg0.field2664 == 1) {
            arg0.field2672 = (arg1 - arg0.field2674) / 2 + arg0.field2666;
        } else if (arg0.field2664 == 2) {
            arg0.field2672 = arg1 - arg0.field2674 - arg0.field2666;
        } else if (arg0.field2664 == 3) {
            arg0.field2672 = arg0.field2666 * arg1 >> 14;
        } else if (arg0.field2664 == 4) {
            arg0.field2672 = (arg0.field2666 * arg1 >> 14) + (arg1 - arg0.field2674) / 2;
        } else {
            arg0.field2672 = arg1 - arg0.field2674 - (arg0.field2666 * arg1 >> 14);
        }
        if (arg0.field2740 == 0) {
            arg0.field2665 = arg0.field2669;
        } else if (arg0.field2740 == 1) {
            arg0.field2665 = (arg2 - arg0.field2675) / 2 + arg0.field2669;
        } else if (arg0.field2740 == 2) {
            arg0.field2665 = arg2 - arg0.field2675 - arg0.field2669;
        } else if (arg0.field2740 == 3) {
            arg0.field2665 = arg0.field2669 * arg2 >> 14;
        } else if (arg0.field2740 == 4) {
            arg0.field2665 = (arg0.field2669 * arg2 >> 14) + (arg2 - arg0.field2675) / 2;
        } else {
            arg0.field2665 = arg2 - arg0.field2675 - (arg0.field2669 * arg2 >> 14);
        }
        if (!field445 || arg0.field2661 != 0) {
            return;
        }
        if (arg0.field2672 < 0) {
            arg0.field2672 = 0;
        } else if (arg0.field2674 + arg0.field2672 > arg1) {
            arg0.field2672 = arg1 - arg0.field2674;
        }
        if (arg0.field2665 < 0) {
            arg0.field2665 = 0;
        } else if (arg0.field2675 + arg0.field2665 > arg2) {
            arg0.field2665 = arg2 - arg0.field2675;
        }
    }

    @ObfuscatedName("l.ca(II)Ljava/lang/String;")
    public static final String method93(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("cl.cu(Lfq;IB)I")
    public static final int method2151(class164 arg0, int arg1) {
        if (arg0.field2769 == null || arg1 >= arg0.field2769.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2769[arg1];
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
                    class164 var11 = class164.method144(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method127(var12).field1081 || field273)) {
                        for (int var13 = 0; var13 < var11.field2750.length; var13++) {
                            if (var12 + 1 == var11.field2750[var13]) {
                                var7 += var11.field2744[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class167.field2811[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2193[field413[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class167.field2811[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field37.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2188[var14]) {
                            var7 += field413[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method144(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method127(var18).field1081 || field273)) {
                        for (int var19 = 0; var19 < var17.field2750.length; var19++) {
                            if (var18 + 1 == var17.field2750[var19]) {
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
                    int var20 = class167.field2811[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class167.method792(var22);
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
                    var7 = (Statics.field37.field789 >> 7) + Statics.field142;
                }
                if (var6 == 19) {
                    var7 = (Statics.field37.field773 >> 7) + Statics.field57;
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

    @ObfuscatedName("aa.co(Lfq;III)V")
    public static final void method898(class164 arg0, int arg1, int arg2) {
        if (arg0.field2668 == 1) {
            method638(arg0.field2774, "", 24, 0, 0, arg0.field2667);
        }
        if (arg0.field2668 == 2 && !field430) {
            int var3 = method3358(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2736 == null || arg0.field2736.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2736;
            }
            if (var5 != null) {
                method638(var5, class2.method2073(65280) + arg0.field2773, 25, 0, -1, arg0.field2667);
            }
        }
        if (arg0.field2668 == 3) {
            method638(class148.field2371, "", 26, 0, 0, arg0.field2667);
        }
        if (arg0.field2668 == 4) {
            method638(arg0.field2774, "", 28, 0, 0, arg0.field2667);
        }
        if (arg0.field2668 == 5) {
            method638(arg0.field2774, "", 29, 0, 0, arg0.field2667);
        }
        if (arg0.field2668 == 6 && field439 == null) {
            method638(arg0.field2774, "", 30, 0, -1, arg0.field2667);
        }
        if (arg0.field2661 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2675; var8++) {
                for (int var9 = 0; var9 < arg0.field2674; var9++) {
                    int var10 = (arg0.field2723 + 32) * var9;
                    int var11 = (arg0.field2654 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2725[var7];
                        var11 += arg0.field2787[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field389 = var7;
                        Statics.field132 = arg0;
                        if (arg0.field2750[var7] > 0) {
                            label366: {
                                class47 var12 = class47.method127(arg0.field2750[var7] - 1);
                                if (field428 == 1) {
                                    int var13 = method3358(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if (Statics.field260 != arg0.field2667 || Statics.field25 != var7) {
                                            method638(class148.field2362, field429 + " " + class2.field26 + " " + class2.method2073(16748608) + var12.field1078, 31, var12.field1066, var7, arg0.field2667);
                                        }
                                        break label366;
                                    }
                                }
                                if (field430) {
                                    int var15 = method3358(arg0);
                                    boolean var16 = (var15 >> 30 & 0x1) != 0;
                                    if (var16) {
                                        if ((Statics.field194 & 0x10) == 16) {
                                            method638(field420, field377 + " " + class2.field26 + " " + class2.method2073(16748608) + var12.field1078, 32, var12.field1066, var7, arg0.field2667);
                                        }
                                        break label366;
                                    }
                                }
                                String[] var17 = var12.field1083;
                                if (field481) {
                                    var17 = method1947(var17);
                                }
                                int var18 = method3358(arg0);
                                boolean var19 = (var18 >> 30 & 0x1) != 0;
                                if (var19) {
                                    for (int var20 = 4; var20 >= 3; var20--) {
                                        if (var17 != null && var17[var20] != null) {
                                            byte var21;
                                            if (var20 == 3) {
                                                var21 = 36;
                                            } else {
                                                var21 = 37;
                                            }
                                            method638(var17[var20], class2.method2073(16748608) + var12.field1078, var21, var12.field1066, var7, arg0.field2667);
                                        } else if (var20 == 4) {
                                            method638(class148.field2213, class2.method2073(16748608) + var12.field1078, 37, var12.field1066, var7, arg0.field2667);
                                        }
                                    }
                                }
                                int var22 = method3358(arg0);
                                boolean var23 = (var22 >> 31 & 0x1) != 0;
                                if (var23) {
                                    method638(class148.field2362, class2.method2073(16748608) + var12.field1078, 38, var12.field1066, var7, arg0.field2667);
                                }
                                int var24 = method3358(arg0);
                                boolean var25 = (var24 >> 30 & 0x1) != 0;
                                if (var25 && var17 != null) {
                                    for (int var26 = 2; var26 >= 0; var26--) {
                                        if (var17[var26] != null) {
                                            byte var27 = 0;
                                            if (var26 == 0) {
                                                var27 = 33;
                                            }
                                            if (var26 == 1) {
                                                var27 = 34;
                                            }
                                            if (var26 == 2) {
                                                var27 = 35;
                                            }
                                            method638(var17[var26], class2.method2073(16748608) + var12.field1078, var27, var12.field1066, var7, arg0.field2667);
                                        }
                                    }
                                }
                                String[] var28 = arg0.field2728;
                                if (field481) {
                                    var28 = method1947(var28);
                                }
                                if (var28 != null) {
                                    for (int var29 = 4; var29 >= 0; var29--) {
                                        if (var28[var29] != null) {
                                            byte var30 = 0;
                                            if (var29 == 0) {
                                                var30 = 39;
                                            }
                                            if (var29 == 1) {
                                                var30 = 40;
                                            }
                                            if (var29 == 2) {
                                                var30 = 41;
                                            }
                                            if (var29 == 3) {
                                                var30 = 42;
                                            }
                                            if (var29 == 4) {
                                                var30 = 43;
                                            }
                                            method638(var28[var29], class2.method2073(16748608) + var12.field1078, var30, var12.field1066, var7, arg0.field2667);
                                        }
                                    }
                                }
                                method638(class148.field2363, class2.method2073(16748608) + var12.field1078, 1005, var12.field1066, var7, arg0.field2667);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2658) {
            return;
        }
        if (field430) {
            int var31 = method3358(arg0);
            boolean var32 = (var31 >> 21 & 0x1) != 0;
            if (var32 && (Statics.field194 & 0x20) == 32) {
                method638(field420, field377 + " " + class2.field26 + " " + arg0.field2752, 58, 0, arg0.field2660, arg0.field2667);
            }
            return;
        }
        for (int var33 = 9; var33 >= 5; var33--) {
            String var34;
            if (!class169.method5(method3358(arg0), var33) && arg0.field2757 == null) {
                var34 = null;
            } else if (arg0.field2731 == null || arg0.field2731.length <= var33 || arg0.field2731[var33] == null || arg0.field2731[var33].trim().length() == 0) {
                var34 = null;
            } else {
                var34 = arg0.field2731[var33];
            }
            if (var34 != null) {
                method638(var34, arg0.field2752, 1007, var33 + 1, arg0.field2660, arg0.field2667);
            }
        }
        int var36 = method3358(arg0);
        int var37 = var36 >> 11 & 0x3F;
        String var38;
        if (var37 == 0) {
            var38 = null;
        } else if (arg0.field2736 == null || arg0.field2736.trim().length() == 0) {
            var38 = null;
        } else {
            var38 = arg0.field2736;
        }
        if (var38 != null) {
            method638(var38, arg0.field2752, 25, 0, arg0.field2660, arg0.field2667);
        }
        for (int var40 = 4; var40 >= 0; var40--) {
            String var41;
            if (!class169.method5(method3358(arg0), var40) && arg0.field2757 == null) {
                var41 = null;
            } else if (arg0.field2731 == null || arg0.field2731.length <= var40 || arg0.field2731[var40] == null || arg0.field2731[var40].trim().length() == 0) {
                var41 = null;
            } else {
                var41 = arg0.field2731[var40];
            }
            if (var41 != null) {
                method638(var41, arg0.field2752, 57, var40 + 1, arg0.field2660, arg0.field2667);
            }
        }
        int var43 = method3358(arg0);
        boolean var44 = (var43 & 0x1) != 0;
        if (var44) {
            method638(class148.field2217, "", 30, 0, arg0.field2660, arg0.field2667);
        }
    }

    @ObfuscatedName("ef.cb(IIIIIIIB)V")
    public static final void method2808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class164.method145(arg0)) {
            method2153(Statics.field2695[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("cf.ce([Lfq;IIIIIIIB)V")
    public static final void method2153(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2658 || var9.field2661 == 0 || var9.field2680 || method3358(var9) != 0 || field446 == var9 || var9.field2663 == 1338) && var9.field2678 == arg1 && (!var9.field2658 || !method2732(var9))) {
                int var10 = var9.field2672 + arg6;
                int var11 = var9.field2665 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2661 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2661 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2674 + var10;
                    int var19 = var9.field2675 + var11;
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
                    int var22 = var9.field2674 + var10;
                    int var23 = var9.field2675 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field448 == var9) {
                    field456 = true;
                    field454 = var10;
                    field531 = var11;
                }
                if (!var9.field2658 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2049;
                    int var25 = class132.field2050;
                    if (class132.field2055 != 0) {
                        var24 = class132.field2043;
                        var25 = class132.field2057;
                    }
                    if (var9.field2663 == 1337) {
                        if (!field363 && !field416 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method555(var24, var25, var12, var13);
                        }
                    } else if (var9.field2663 == 1338) {
                        method3118(var9, var10, var11);
                    } else {
                        if (!field416 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method898(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2661 == 0) {
                            if (!var9.field2658 && method2732(var9) && Statics.field1167 != var9) {
                                continue;
                            }
                            method2153(arg0, var9.field2667, var12, var13, var14, var15, var10 - var9.field2790, var11 - var9.field2758);
                            if (var9.field2781 != null) {
                                method2153(var9.field2781, var9.field2667, var12, var13, var14, var15, var10 - var9.field2790, var11 - var9.field2758);
                            }
                            class4 var26 = (class4) field483.method3418((long) var9.field2667);
                            if (var26 != null) {
                                if (var26.field55 == 0 && class132.field2049 >= var12 && class132.field2050 >= var13 && class132.field2049 < var14 && class132.field2050 < var15 && !field416 && !field445) {
                                    field422[0] = class148.field2401;
                                    field425[0] = "";
                                    field283[0] = 1006;
                                    field457 = 1;
                                }
                                method2808(var26.field51, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2658) {
                            if (var9.field2783 && class132.field2049 >= var12 && class132.field2050 >= var13 && class132.field2049 < var14 && class132.field2050 < var15) {
                                for (class1 var27 = (class1) field476.method3451(); var27 != null; var27 = (class1) field476.method3448()) {
                                    if (var27.field2) {
                                        var27.method3540();
                                        var27.field5.field2782 = false;
                                    }
                                }
                                if (Statics.field265 == 0) {
                                    field448 = null;
                                    field446 = null;
                                }
                                if (!field416) {
                                    field422[0] = class148.field2401;
                                    field425[0] = "";
                                    field283[0] = 1006;
                                    field457 = 1;
                                }
                            }
                            boolean var28;
                            if (class132.field2049 >= var12 && class132.field2050 >= var13 && class132.field2049 < var14 && class132.field2050 < var15) {
                                var28 = true;
                            } else {
                                var28 = false;
                            }
                            boolean var29 = false;
                            if ((class132.field2048 == 1 || !Statics.field240 && class132.field2048 == 4) && var28) {
                                var29 = true;
                            }
                            boolean var30 = false;
                            if ((class132.field2055 == 1 || !Statics.field240 && class132.field2055 == 4) && class132.field2043 >= var12 && class132.field2057 >= var13 && class132.field2043 < var14 && class132.field2057 < var15) {
                                var30 = true;
                            }
                            if (var30) {
                                method633(var9, class132.field2043 - var10, class132.field2057 - var11);
                            }
                            if (field448 != null && field448 != var9 && var28) {
                                int var31 = method3358(var9);
                                boolean var32 = (var31 >> 20 & 0x1) != 0;
                                if (var32) {
                                    field452 = var9;
                                }
                            }
                            if (field446 == var9) {
                                field453 = true;
                                field344 = var10;
                                field455 = var11;
                            }
                            if (var9.field2680) {
                                if (var28 && field475 != 0 && var9.field2671 != null) {
                                    class1 var33 = new class1();
                                    var33.field2 = true;
                                    var33.field5 = var9;
                                    var33.field9 = field475;
                                    var33.field1 = var9.field2671;
                                    field476.method3441(var33);
                                }
                                if (field448 != null || Statics.field570 != null || field416) {
                                    var30 = false;
                                    var29 = false;
                                    var28 = false;
                                }
                                if (!var9.field2681 && var30) {
                                    var9.field2681 = true;
                                    if (var9.field2688 != null) {
                                        class1 var34 = new class1();
                                        var34.field2 = true;
                                        var34.field5 = var9;
                                        var34.field3 = class132.field2043 - var10;
                                        var34.field9 = class132.field2057 - var11;
                                        var34.field1 = var9.field2688;
                                        field476.method3441(var34);
                                    }
                                }
                                if (var9.field2681 && var29 && var9.field2659 != null) {
                                    class1 var35 = new class1();
                                    var35.field2 = true;
                                    var35.field5 = var9;
                                    var35.field3 = class132.field2049 - var10;
                                    var35.field9 = class132.field2050 - var11;
                                    var35.field1 = var9.field2659;
                                    field476.method3441(var35);
                                }
                                if (var9.field2681 && !var29) {
                                    var9.field2681 = false;
                                    if (var9.field2741 != null) {
                                        class1 var36 = new class1();
                                        var36.field2 = true;
                                        var36.field5 = var9;
                                        var36.field3 = class132.field2049 - var10;
                                        var36.field9 = class132.field2050 - var11;
                                        var36.field1 = var9.field2741;
                                        field478.method3441(var36);
                                    }
                                }
                                if (var29 && var9.field2742 != null) {
                                    class1 var37 = new class1();
                                    var37.field2 = true;
                                    var37.field5 = var9;
                                    var37.field3 = class132.field2049 - var10;
                                    var37.field9 = class132.field2050 - var11;
                                    var37.field1 = var9.field2742;
                                    field476.method3441(var37);
                                }
                                if (!var9.field2782 && var28) {
                                    var9.field2782 = true;
                                    if (var9.field2737 != null) {
                                        class1 var38 = new class1();
                                        var38.field2 = true;
                                        var38.field5 = var9;
                                        var38.field3 = class132.field2049 - var10;
                                        var38.field9 = class132.field2050 - var11;
                                        var38.field1 = var9.field2737;
                                        field476.method3441(var38);
                                    }
                                }
                                if (var9.field2782 && var28 && var9.field2771 != null) {
                                    class1 var39 = new class1();
                                    var39.field2 = true;
                                    var39.field5 = var9;
                                    var39.field3 = class132.field2049 - var10;
                                    var39.field9 = class132.field2050 - var11;
                                    var39.field1 = var9.field2771;
                                    field476.method3441(var39);
                                }
                                if (var9.field2782 && !var28) {
                                    var9.field2782 = false;
                                    if (var9.field2745 != null) {
                                        class1 var40 = new class1();
                                        var40.field2 = true;
                                        var40.field5 = var9;
                                        var40.field3 = class132.field2049 - var10;
                                        var40.field9 = class132.field2050 - var11;
                                        var40.field1 = var9.field2745;
                                        field478.method3441(var40);
                                    }
                                }
                                if (var9.field2756 != null) {
                                    class1 var41 = new class1();
                                    var41.field5 = var9;
                                    var41.field1 = var9.field2756;
                                    field477.method3441(var41);
                                }
                                if (var9.field2726 != null && field462 > var9.field2724) {
                                    if (var9.field2692 == null || field462 - var9.field2724 > 32) {
                                        class1 var46 = new class1();
                                        var46.field5 = var9;
                                        var46.field1 = var9.field2726;
                                        field476.method3441(var46);
                                    } else {
                                        label548: for (int var42 = var9.field2724; var42 < field462; var42++) {
                                            int var43 = field374[var42 & 0x1F];
                                            for (int var44 = 0; var44 < var9.field2692.length; var44++) {
                                                if (var9.field2692[var44] == var43) {
                                                    class1 var45 = new class1();
                                                    var45.field5 = var9;
                                                    var45.field1 = var9.field2726;
                                                    field476.method3441(var45);
                                                    break label548;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2724 = field462;
                                }
                                if (var9.field2754 != null && field464 > var9.field2786) {
                                    if (var9.field2753 == null || field464 - var9.field2786 > 32) {
                                        class1 var51 = new class1();
                                        var51.field5 = var9;
                                        var51.field1 = var9.field2754;
                                        field476.method3441(var51);
                                    } else {
                                        label524: for (int var47 = var9.field2786; var47 < field464; var47++) {
                                            int var48 = field463[var47 & 0x1F];
                                            for (int var49 = 0; var49 < var9.field2753.length; var49++) {
                                                if (var9.field2753[var49] == var48) {
                                                    class1 var50 = new class1();
                                                    var50.field5 = var9;
                                                    var50.field1 = var9.field2754;
                                                    field476.method3441(var50);
                                                    break label524;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2786 = field464;
                                }
                                if (var9.field2776 != null && field466 > var9.field2762) {
                                    if (var9.field2647 == null || field466 - var9.field2762 > 32) {
                                        class1 var56 = new class1();
                                        var56.field5 = var9;
                                        var56.field1 = var9.field2776;
                                        field476.method3441(var56);
                                    } else {
                                        label500: for (int var52 = var9.field2762; var52 < field466; var52++) {
                                            int var53 = field465[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2647.length; var54++) {
                                                if (var9.field2647[var54] == var53) {
                                                    class1 var55 = new class1();
                                                    var55.field5 = var9;
                                                    var55.field1 = var9.field2776;
                                                    field476.method3441(var55);
                                                    break label500;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2762 = field466;
                                }
                                if (field284 > var9.field2662 && var9.field2784 != null) {
                                    class1 var57 = new class1();
                                    var57.field5 = var9;
                                    var57.field1 = var9.field2784;
                                    field476.method3441(var57);
                                }
                                if (field400 > var9.field2662 && var9.field2761 != null) {
                                    class1 var58 = new class1();
                                    var58.field5 = var9;
                                    var58.field1 = var9.field2761;
                                    field476.method3441(var58);
                                }
                                if (field424 > var9.field2662 && var9.field2698 != null) {
                                    class1 var59 = new class1();
                                    var59.field5 = var9;
                                    var59.field1 = var9.field2698;
                                    field476.method3441(var59);
                                }
                                if (field390 > var9.field2662 && var9.field2767 != null) {
                                    class1 var60 = new class1();
                                    var60.field5 = var9;
                                    var60.field1 = var9.field2767;
                                    field476.method3441(var60);
                                }
                                if (field339 > var9.field2662 && var9.field2768 != null) {
                                    class1 var61 = new class1();
                                    var61.field5 = var9;
                                    var61.field1 = var9.field2768;
                                    field476.method3441(var61);
                                }
                                if (field472 > var9.field2662 && var9.field2763 != null) {
                                    class1 var62 = new class1();
                                    var62.field5 = var9;
                                    var62.field1 = var9.field2763;
                                    field476.method3441(var62);
                                }
                                var9.field2662 = field460;
                                if (var9.field2760 != null) {
                                    for (int var63 = 0; var63 < field268; var63++) {
                                        class1 var64 = new class1();
                                        var64.field5 = var9;
                                        var64.field8 = field502[var63];
                                        var64.field4 = field386[var63];
                                        var64.field1 = var9.field2760;
                                        field476.method3441(var64);
                                    }
                                }
                            }
                        }
                        if (!var9.field2658 && field448 == null && Statics.field570 == null && !field416) {
                            if ((var9.field2650 >= 0 || var9.field2686 != 0) && class132.field2049 >= var12 && class132.field2050 >= var13 && class132.field2049 < var14 && class132.field2050 < var15) {
                                if (var9.field2650 >= 0) {
                                    Statics.field1167 = arg0[var9.field2650];
                                } else {
                                    Statics.field1167 = var9;
                                }
                            }
                            if (var9.field2661 == 8 && class132.field2049 >= var12 && class132.field2050 >= var13 && class132.field2049 < var14 && class132.field2050 < var15) {
                                Statics.field1535 = var9;
                            }
                            if (var9.field2683 > var9.field2675) {
                                int var65 = var9.field2674 + var10;
                                int var66 = var9.field2675;
                                int var67 = var9.field2683;
                                int var68 = class132.field2049;
                                int var69 = class132.field2050;
                                if (field355) {
                                    field356 = 32;
                                } else {
                                    field356 = 0;
                                }
                                field355 = false;
                                if (class132.field2048 == 1 || !Statics.field240 && class132.field2048 == 4) {
                                    if (var68 >= var65 && var68 < var65 + 16 && var69 >= var11 && var69 < var11 + 16) {
                                        var9.field2758 -= 4;
                                        method106(var9);
                                    } else if (var68 >= var65 && var68 < var65 + 16 && var69 >= var11 + var66 - 16 && var69 < var11 + var66) {
                                        var9.field2758 += 4;
                                        method106(var9);
                                    } else if (var68 >= var65 - field356 && var68 < field356 + var65 + 16 && var69 >= var11 + 16 && var69 < var11 + var66 - 16) {
                                        int var70 = (var66 - 32) * var66 / var67;
                                        if (var70 < 8) {
                                            var70 = 8;
                                        }
                                        int var71 = var69 - var11 - 16 - var70 / 2;
                                        int var72 = var66 - 32 - var70;
                                        var9.field2758 = (var67 - var66) * var71 / var72;
                                        method106(var9);
                                        field355 = true;
                                    }
                                }
                                if (field475 != 0) {
                                    int var73 = var9.field2674;
                                    if (var68 >= var65 - var73 && var69 >= var11 && var68 < var65 + 16 && var69 <= var11 + var66) {
                                        var9.field2758 += field475 * 45;
                                        method106(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.cp(IIB)V")
    public static final void method588(int arg0, int arg1) {
        if (class164.method145(arg0)) {
            method2860(Statics.field2695[arg0], arg1);
        }
    }

    @ObfuscatedName("ec.cx([Lfq;II)V")
    public static final void method2860(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2661 == 0) {
                    if (var3.field2781 != null) {
                        method2860(var3.field2781, arg1);
                    }
                    class4 var4 = (class4) field483.method3418((long) var3.field2667);
                    if (var4 != null) {
                        method588(var4.field51, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2716 != null) {
                    class1 var5 = new class1();
                    var5.field5 = var3;
                    var5.field1 = var3.field2716;
                    class34.method3076(var5);
                }
                if (arg1 == 1 && var3.field2704 != null) {
                    if (var3.field2660 >= 0) {
                        class164 var6 = class164.method144(var3.field2667);
                        if (var6 == null || var6.field2781 == null || var3.field2660 >= var6.field2781.length || var6.field2781[var3.field2660] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field5 = var3;
                    var7.field1 = var3.field2704;
                    class34.method3076(var7);
                }
            }
        }
    }

    @ObfuscatedName("ac.cl(Lfq;III)V")
    public static final void method633(class164 arg0, int arg1, int arg2) {
        if (field448 != null || field416 || arg0 == null) {
            return;
        }
        class164 var3 = method87(arg0);
        if (var3 == null) {
            var3 = arg0.field2732;
        }
        if (var3 == null) {
            return;
        }
        field448 = arg0;
        class164 var5 = method87(arg0);
        if (var5 == null) {
            var5 = arg0.field2732;
        }
        field446 = var5;
        field450 = arg1;
        field495 = arg2;
        Statics.field265 = 0;
        field534 = false;
        if (field457 > 0) {
            int var7 = field457 - 1;
            Statics.field210 = new class29();
            Statics.field210.field694 = field511[var7];
            Statics.field210.field685 = field419[var7];
            Statics.field210.field691 = field283[var7];
            Statics.field210.field687 = field421[var7];
            Statics.field210.field688 = field422[var7];
        }
        return;
    }

    @ObfuscatedName("client.cf(I)V")
    public static final void method486() {
        method106(field448);
        Statics.field265++;
        if (field456 && field453) {
            int var0 = class132.field2049;
            int var1 = class132.field2050;
            int var2 = var0 - field450;
            int var3 = var1 - field495;
            if (var2 < field344) {
                var2 = field344;
            }
            if (field448.field2674 + var2 > field344 + field446.field2674) {
                var2 = field344 + field446.field2674 - field448.field2674;
            }
            if (var3 < field455) {
                var3 = field455;
            }
            if (field448.field2675 + var3 > field455 + field446.field2675) {
                var3 = field455 + field446.field2675 - field448.field2675;
            }
            int var4 = var2 - field454;
            int var5 = var3 - field531;
            int var6 = field448.field2772;
            if (Statics.field265 > field448.field2734 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field534 = true;
            }
            int var7 = field446.field2790 + (var2 - field344);
            int var8 = field446.field2758 + (var3 - field455);
            if (field448.field2746 != null && field534) {
                class1 var9 = new class1();
                var9.field5 = field448;
                var9.field3 = var7;
                var9.field9 = var8;
                var9.field1 = field448.field2746;
                class34.method3076(var9);
            }
            if (class132.field2048 == 0) {
                if (field534) {
                    if (field448.field2747 != null) {
                        class1 var10 = new class1();
                        var10.field5 = field448;
                        var10.field3 = var7;
                        var10.field9 = var8;
                        var10.field7 = field452;
                        var10.field1 = field448.field2747;
                        class34.method3076(var10);
                    }
                    if (field452 != null && method87(field448) != null) {
                        field266.method2493(50);
                        field266.method2314(field452.field2777);
                        field266.method2314(field448.field2777);
                        field266.method2220(field452.field2660);
                        field266.method2220(field448.field2660);
                        field266.method2278(field448.field2667);
                        field266.method2278(field452.field2667);
                    }
                } else if ((field415 == 1 || method485(field457 - 1)) && field457 > 2) {
                    method80(field454 + field450, field531 + field495);
                } else if (field457 > 0) {
                    method1873(field454 + field450, field531 + field495);
                }
                field448 = null;
            }
        } else if (Statics.field265 > 1) {
            field448 = null;
        }
    }

    @ObfuscatedName("ci.cm(III)V")
    public static void method1873(int arg0, int arg1) {
        method2835(Statics.field210, arg0, arg1);
        Statics.field210 = null;
    }

    @ObfuscatedName("l.dj(Lfq;I)V")
    public static void method106(class164 arg0) {
        if (field395 == arg0.field2789) {
            field482[arg0.field2780] = true;
        }
    }

    @ObfuscatedName("n.dd(I)V")
    public static void method1() {
        for (class4 var0 = (class4) field483.method3411(); var0 != null; var0 = (class4) field483.method3417()) {
            int var1 = var0.field51;
            if (class164.method145(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2695[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2658;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3018;
                    class164 var6 = class164.method144(var5);
                    if (var6 != null) {
                        method106(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cr.dc([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1947(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("as.df(II)V")
    public static final void method880(int arg0) {
        if (!class164.method145(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2695[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2779 = 0;
                var3.field2730 = 0;
            }
        }
    }

    @ObfuscatedName("dj.dp(II)V")
    public static final void method2166(int arg0) {
        if (class164.method145(arg0)) {
            method109(Statics.field2695[arg0], -1);
        }
    }

    @ObfuscatedName("f.do([Lfq;II)V")
    public static final void method109(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2678 == arg1 && (!var3.field2658 || !method2732(var3))) {
                if (var3.field2661 == 0) {
                    if (!var3.field2658 && method2732(var3) && Statics.field1167 != var3) {
                        continue;
                    }
                    method109(arg0, var3.field2667);
                    if (var3.field2781 != null) {
                        method109(var3.field2781, var3.field2667);
                    }
                    class4 var4 = (class4) field483.method3418((long) var3.field2667);
                    if (var4 != null) {
                        method2166(var4.field51);
                    }
                }
                if (var3.field2661 == 6) {
                    if (var3.field2679 != -1 || var3.field2705 != -1) {
                        boolean var5 = Statics.method156(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2705;
                        } else {
                            var6 = var3.field2679;
                        }
                        if (var6 != -1) {
                            class40 var7 = Statics.method860(var6);
                            var3.field2730 += field349;
                            while (var3.field2730 > var7.field971[var3.field2779]) {
                                var3.field2730 -= var7.field971[var3.field2779];
                                var3.field2779++;
                                if (var3.field2779 >= var7.field957.length) {
                                    var3.field2779 -= var7.field970;
                                    if (var3.field2779 < 0 || var3.field2779 >= var7.field957.length) {
                                        var3.field2779 = 0;
                                    }
                                }
                                method106(var3);
                            }
                        }
                    }
                    if (var3.field2713 != 0 && !var3.field2658) {
                        int var8 = var3.field2713 >> 16;
                        int var9 = var3.field2713 << 16 >> 16;
                        int var10 = field349 * var8;
                        int var11 = field349 * var9;
                        var3.field2708 = var3.field2708 + var10 & 0x7FF;
                        var3.field2709 = var3.field2709 + var11 & 0x7FF;
                        method106(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.dl(IS)V")
    public static final void method2074(int arg0) {
        method1();
        for (class22 var1 = (class22) class22.field585.method3451(); var1 != null; var1 = (class22) class22.field585.method3448()) {
            if (var1.field581 != null) {
                var1.method512();
            }
        }
        int var2 = class48.method577(arg0).field1116;
        if (var2 == 0) {
            return;
        }
        int var3 = class167.field2811[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class86.method1883(0.9D);
                ((class90) Statics.field1516).method1950(0.9D);
            }
            if (var3 == 2) {
                class86.method1883(0.8D);
                ((class90) Statics.field1516).method1950(0.8D);
            }
            if (var3 == 3) {
                class86.method1883(0.7D);
                ((class90) Statics.field1516).method1950(0.7D);
            }
            if (var3 == 4) {
                class86.method1883(0.6D);
                ((class90) Statics.field1516).method1950(0.6D);
            }
            class47.method586();
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
            if (field361 != var4) {
                if (field361 == 0 && field515 != -1) {
                    class174.method3039(Statics.field241, field515, 0, var4, false);
                    field351 = false;
                } else if (var4 == 0) {
                    class174.method3018();
                    field351 = false;
                } else {
                    class174.method817(var4);
                }
                field361 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field364 = 127;
            }
            if (var3 == 1) {
                field364 = 96;
            }
            if (var3 == 2) {
                field364 = 64;
            }
            if (var3 == 3) {
                field364 = 32;
            }
            if (var3 == 4) {
                field364 = 0;
            }
        }
        if (var2 == 5) {
            field415 = var3;
        }
        if (var2 == 6) {
            field437 = var3;
        }
        if (var2 == 9) {
            field514 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field518 = 127;
            }
            if (var3 == 1) {
                field518 = 96;
            }
            if (var3 == 2) {
                field518 = 64;
            }
            if (var3 == 3) {
                field518 = 32;
            }
            if (var3 == 4) {
                field518 = 0;
            }
        }
        if (var2 == 17) {
            field332 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class19[] var5 = new class19[] { class19.field560, class19.field555, class19.field556 };
            field297 = (class19) class101.method979(var5, var3);
            if (field297 == null) {
                field297 = class19.field560;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field277 = -1;
        } else {
            field277 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("m.da(I)V")
    public static final void method26() {
        field266.method2493(84);
        for (class4 var0 = (class4) field483.method3411(); var0 != null; var0 = (class4) field483.method3417()) {
            if (var0.field55 == 0 || var0.field55 == 3) {
                method752(var0, true);
            }
        }
        if (field439 != null) {
            method106(field439);
            field439 = null;
        }
    }

    @ObfuscatedName("be.dg(IIII)Lw;")
    public static final class4 method1515(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field51 = arg1;
        var3.field55 = arg2;
        field483.method3410(var3, (long) arg0);
        method880(arg1);
        class164 var4 = class164.method144(arg0);
        method106(var4);
        if (field439 != null) {
            method106(field439);
            field439 = null;
        }
        method165();
        method2490(Statics.field2695[arg0 >> 16], var4, false);
        Statics.method2841(arg1);
        if (field435 != -1) {
            method588(field435, 1);
        }
        return var3;
    }

    @ObfuscatedName("ah.dv(Lw;ZI)V")
    public static final void method752(class4 arg0, boolean arg1) {
        int var2 = arg0.field51;
        int var3 = (int) arg0.field3018;
        arg0.method3540();
        if (arg1) {
            class164.method3124(var2);
        }
        for (class192 var4 = (class192) field479.method3411(); var4 != null; var4 = (class192) field479.method3417()) {
            if ((long) var2 == (var4.field3018 >> 48 & 0xFFFFL)) {
                var4.method3540();
            }
        }
        class164 var5 = class164.method144(var3);
        if (var5 != null) {
            method106(var5);
        }
        method165();
        if (field435 != -1) {
            method588(field435, 1);
        }
    }

    @ObfuscatedName("ee.dm(Lfq;B)Z")
    public static final boolean method2705(class164 arg0) {
        int var1 = arg0.field2663;
        if (var1 == 205) {
            field325 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field550.method3129(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field550.method3130(var4, var5 == 1);
        }
        if (var1 == 324) {
            field550.method3131(false);
        }
        if (var1 == 325) {
            field550.method3131(true);
        }
        if (var1 == 326) {
            field266.method2493(33);
            field550.method3132(field266);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("af.dh(Lfq;IIII)V")
    public static final void method896(class164 arg0, int arg1, int arg2, int arg3) {
        class166 var4 = arg0.method3053();
        if (var4 == null) {
            return;
        }
        if (field311 < 3) {
            Statics.field1300.method1539(arg1, arg2, var4.field2802, var4.field2801, 25, 25, field358, 256, var4.field2803, var4.field2804);
        } else {
            class75.method1613(arg1, arg2, 0, var4.field2803, var4.field2804);
        }
    }

    @ObfuscatedName("ca.ds(IIIILbd;Lfa;I)V")
    public static final void method1970(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1964(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field358 + field290 & 0x7FF;
        int var8 = class86.field1520[var7];
        int var9 = class86.field1521[var7];
        int var10 = var8 * 256 / (field346 + 256);
        int var11 = var9 * 256 / (field346 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1050.method1540(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ct.dx(IIIILbd;Lfa;B)V")
    public static final void method1964(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field358 + field290 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class86.field1520[var6];
        int var9 = class86.field1521[var6];
        int var10 = var8 * 256 / (field346 + 256);
        int var11 = var9 * 256 / (field346 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1538(arg5.field2802 / 2 + var12 - arg4.field1349 / 2, arg5.field2801 / 2 - var13 - arg4.field1347 / 2, arg0, arg1, arg5.field2802, arg5.field2801, arg5.field2803, arg5.field2804);
        } else {
            arg4.method1528(arg5.field2802 / 2 + arg0 + var12 - arg4.field1349 / 2, arg5.field2801 / 2 + arg1 - var13 - arg4.field1347 / 2);
        }
    }

    @ObfuscatedName("dg.dr(Ljava/lang/String;ZI)Z")
    public static boolean method2488(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method1945(arg0, Statics.field329);
        for (int var3 = 0; var3 < field394; var3++) {
            if (var2.equalsIgnoreCase(class155.method1945(field546[var3].field247, Statics.field329)) && (!arg1 || field546[var3].field237 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method1945(Statics.field37.field49, Statics.field329))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ca.db(Ljava/lang/String;I)Z")
    public static boolean method1969(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method1945(arg0, Statics.field329);
        for (int var2 = 0; var2 < field548; var2++) {
            class8 var3 = field305[var2];
            if (var1.equalsIgnoreCase(class155.method1945(var3.field133, Statics.field329))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method1945(var3.field122, Statics.field329))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dv.de(Ljava/lang/String;I)V")
    public static final void method2511(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field394 < 200 || field324 == 1) || field394 >= 400) {
            class11.method2919(30, "", class148.field2468);
            return;
        }
        String var1 = class155.method1945(arg0, Statics.field329);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field394; var2++) {
            class17 var3 = field546[var2];
            String var4 = class155.method1945(var3.field247, Statics.field329);
            if (var4 != null && var4.equals(var1)) {
                class11.method2919(30, "", arg0 + class148.field2379);
                return;
            }
            if (var3.field236 != null) {
                String var5 = class155.method1945(var3.field236, Statics.field329);
                if (var5 != null && var5.equals(var1)) {
                    class11.method2919(30, "", arg0 + class148.field2379);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field548; var6++) {
            class8 var7 = field305[var6];
            String var8 = class155.method1945(var7.field133, Statics.field329);
            if (var8 != null && var8.equals(var1)) {
                class11.method2919(30, "", class148.field2240 + arg0 + class148.field2385);
                return;
            }
            if (var7.field122 != null) {
                String var9 = class155.method1945(var7.field122, Statics.field329);
                if (var9 != null && var9.equals(var1)) {
                    class11.method2919(30, "", class148.field2240 + arg0 + class148.field2385);
                    return;
                }
            }
        }
        if (class155.method1945(Statics.field37.field49, Statics.field329).equals(var1)) {
            class11.method2919(30, "", class148.field2382);
        } else {
            field266.method2493(137);
            field266.method2219(Statics.method2179(arg0));
            field266.method2225(arg0);
        }
    }

    @ObfuscatedName("t.di(Ljava/lang/String;ZI)V")
    public static final void method164(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field548 < 100 || field324 == 1) || field548 >= 400) {
            class11.method2919(31, "", class148.field2380);
            return;
        }
        String var2 = class155.method1945(arg0, Statics.field329);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field548; var3++) {
            class8 var4 = field305[var3];
            String var5 = class155.method1945(var4.field133, Statics.field329);
            if (var5 != null && var5.equals(var2)) {
                class11.method2919(31, "", arg0 + class148.field2249);
                return;
            }
            if (var4.field122 != null) {
                String var6 = class155.method1945(var4.field122, Statics.field329);
                if (var6 != null && var6.equals(var2)) {
                    class11.method2919(31, "", arg0 + class148.field2249);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field394; var7++) {
            class17 var8 = field546[var7];
            String var9 = class155.method1945(var8.field247, Statics.field329);
            if (var9 != null && var9.equals(var2)) {
                class11.method2919(31, "", class148.field2386 + arg0 + class148.field2387);
                return;
            }
            if (var8.field236 != null) {
                String var10 = class155.method1945(var8.field236, Statics.field329);
                if (var10 != null && var10.equals(var2)) {
                    class11.method2919(31, "", class148.field2386 + arg0 + class148.field2387);
                    return;
                }
            }
        }
        if (class155.method1945(Statics.field37.field49, Statics.field329).equals(var2)) {
            class11.method2919(31, "", class148.field2335);
        } else {
            field266.method2493(181);
            field266.method2219(Statics.method2179(arg0));
            field266.method2225(arg0);
        }
    }

    @ObfuscatedName("ff.dy(Ljava/lang/String;I)V")
    public static final void method3367(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method1945(arg0, Statics.field329);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field394; var2++) {
            class17 var3 = field546[var2];
            String var4 = var3.field247;
            String var5 = class155.method1945(var4, Statics.field329);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field394--;
                for (int var7 = var2; var7 < field394; var7++) {
                    field546[var7] = field546[var7 + 1];
                }
                field400 = field460;
                field266.method2493(157);
                field266.method2219(Statics.method2179(arg0));
                field266.method2225(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ai.du(Ljava/lang/String;B)V")
    public static final void method986(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method1945(arg0, Statics.field329);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field548; var2++) {
            class8 var3 = field305[var2];
            String var4 = var3.field133;
            String var5 = class155.method1945(var4, Statics.field329);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field548--;
                for (int var7 = var2; var7 < field548; var7++) {
                    field305[var7] = field305[var7 + 1];
                }
                field400 = field460;
                field266.method2493(59);
                field266.method2219(Statics.method2179(arg0));
                field266.method2225(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("au.dn(Ljava/lang/String;II)V")
    public static final void method662(String arg0, int arg1) {
        field266.method2493(38);
        field266.method2219(Statics.method2179(arg0) + 1);
        field266.method2219(arg1);
        field266.method2225(arg0);
    }

    @ObfuscatedName("fg.dt(Lfq;B)I")
    public static int method3358(class164 arg0) {
        class192 var1 = (class192) field479.method3418(((long) arg0.field2667 << 32) + (long) arg0.field2660);
        return var1 == null ? arg0.field2729 : var1.field3005;
    }

    @ObfuscatedName("i.dk(Lfq;I)Lfq;")
    public static class164 method87(class164 arg0) {
        int var1 = class169.method3102(method3358(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class164.method144(arg0.field2678);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ek.dz(Lfq;B)Z")
    public static boolean method2732(class164 arg0) {
        if (field445) {
            if (method3358(arg0) != 0) {
                return false;
            }
            if (arg0.field2661 == 0) {
                return false;
            }
        }
        return arg0.field2702;
    }

    @ObfuscatedName("n.dq(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field271 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field271 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field271 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field271 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field271 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field276 != null) {
            var3 = "/p=" + Statics.field276;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field275 + "/a=" + Statics.field458 + var3 + "/";
    }
}
